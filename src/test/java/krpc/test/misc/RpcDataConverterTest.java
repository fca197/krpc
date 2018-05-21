package krpc.test.misc;

import java.util.ArrayList;
import java.util.HashMap;

import org.junit.Test;

import com.google.protobuf.Message;
import com.xxx.httptest.proto.HttpTestReq;
import com.xxx.httptest.proto.HttpTestRes;
import com.xxx.httptest.proto.Session;
import io.netty.handler.codec.http.HttpMethod;
import io.netty.handler.codec.http.HttpVersion;
import krpc.core.ServiceMetas;
import krpc.core.proto.RpcMeta;
import krpc.impl.DefaultServiceMetas;
import krpc.web.DefaultWebReq;
import krpc.web.DefaultWebRes;
import krpc.web.Route;
import krpc.web.WebContextData;
import krpc.web.impl.DefaultRpcDataConverter;

public class RpcDataConverterTest {

	@SuppressWarnings("unchecked")
	@Test
	public void test1() throws Exception {
		
		ServiceMetas serviceMetas = new DefaultServiceMetas();
		serviceMetas.addDirect(500, 1, HttpTestReq.class, HttpTestRes.class);
		
		DefaultRpcDataConverter c = new DefaultRpcDataConverter(serviceMetas);

		RpcMeta.Builder builder = RpcMeta.newBuilder().setDirection(RpcMeta.Direction.REQUEST).setServiceId(500).setMsgId(1).setSequence(1);
		RpcMeta meta = builder.build();
		Route route = new Route(500,1).setSessionMode(2);
		WebContextData ctx = new WebContextData("1.2.3.4:1100",meta,route);

		if( true ) {
			Session s1 = Session.newBuilder().setLoginFlag("1").setUserId("abc").setMobile("156189").build();
			HttpTestRes t1 = HttpTestRes.newBuilder().setRetCode(-300001).
					setUserId("10000").setCookieTnk("aaa").
					setHeaderLocation("http://www.baidu.com").setHttpCode(201).
					setHeaderXmmDddCcc("aaaa").setTotalPrice(122).setSession(s1). 
					build();
			
			DefaultWebRes res = new DefaultWebRes(new DefaultWebReq(),200);
			c.parseData(ctx, t1, res);
			System.out.println("results:"+res.getResults());
		}
		
		if( true ) {
			
			HashMap<String,String> session = new HashMap<>();
			session.put("userId", "123");
			session.put("userName", "mike");
			session.put("mobile", "13100000001");
			
			ctx.setSessionId("12345");
			ctx.setSession(session);
			
			// repeated OrderItem items = 16;
			
			DefaultWebReq req = new DefaultWebReq().setVersion(HttpVersion.HTTP_1_1).setMethod(HttpMethod.GET);
			req.setHost("www.baidu.com").setPath("/test").setQueryString("a=1&b=2").setContentType("application/json").setContent("{}");
			req.addCookie("JSESSIONId","test1").addCookie("TNK","cc");
			req.setHeader("host","www.baidu.com");
			req.addParameter("orderId","123").addParameter("quantity1",121).addParameter("quantity2",122);
			req.addParameter("quantity3",123).addParameter("quantity4",124).addParameter("price1",100.1).addParameter("price2",100.2);

			//req.addParameter("status", 2);
			req.addParameter("status", "READY");

			HashMap<String,String> item1 = new HashMap<>();
			item1.put("name", "123");
			item1.put("quantity", "123");
			item1.put("price", "1.01");

			HashMap<String,String> item2 = new HashMap<>();
			item2.put("name", "124");
			item2.put("quantity", "124");
			item2.put("price", "1.02");		
			
			@SuppressWarnings("rawtypes")
			ArrayList list = new ArrayList();
			list.add(item1);
			list.add(item2);
			req.addParameter("items", list);
			
			ArrayList colors = new ArrayList();
			colors.add("red");
			colors.add("blue");
			req.addParameter("colors", colors);
			
			
			Message m = c.generateData(ctx,req,false);
			DefaultWebRes res = new DefaultWebRes(new DefaultWebReq(),200);
			c.parseData(ctx, m, res);
			System.out.println("results:"+res.getResults());
		}

	}
}
