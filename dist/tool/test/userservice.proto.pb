
Ļ6
userservice.protokrpcext.proto"Z
LoginReq
userName (	RuserName
password (	Rpassword
gender (	Rgender"l
LoginRes
retCode (RretCode
retMsg (	RretMsg
userId (	RuserId
mobile (	Rmobile"B
UpdateProfileReq
userId (	RuserId
mobile (	Rmobile"D
UpdateProfileRes
retCode (RretCode
retMsg (	RretMsg"[
	Login2Req
userName (	RuserName
password (	Rpassword
gender (	Rgender"m
	Login2Res
retCode (RretCode
retMsg (	RretMsg
userId (	RuserId
mobile (	Rmobile"5
Apple
color (	Rcolor
weight (Rweight"æ
	Login3Req%
kvs (2.Login3Req.KvsEntryRkvs
userName (	RuserName(
kvs2 (2.Login3Req.Kvs2EntryRkvs2(
kvs3 (2.Login3Req.Kvs3EntryRkvs3.
apples (2.Login3Req.ApplesEntryRapples6
KvsEntry
key (	Rkey
value (	Rvalue:87
	Kvs2Entry
key (	Rkey
value (Rvalue:87
	Kvs3Entry
key (Rkey
value (	Rvalue:8A
ApplesEntry
key (	Rkey
value (2.AppleRvalue:8"Ó
Login3ReqCopy
userName (	RuserName)
kvs (2.Login3ReqCopy.KvsEntryRkvs,
kvs2 (2.Login3ReqCopy.Kvs2EntryRkvs22
apples (2.Login3ReqCopy.ApplesEntryRapples,
kvs3 (2.Login3ReqCopy.Kvs3EntryRkvs36
KvsEntry
key (	Rkey
value (	Rvalue:87
	Kvs2Entry
key (	Rkey
value (Rvalue:8A
ApplesEntry
key (	Rkey
value (2.AppleRvalue:87
	Kvs3Entry
key (Rkey
value (	Rvalue:8"“
	Login3Res
retCode (RretCode
retMsg (	RretMsg
userId (	RuserId%
kvs (2.Login3Res.KvsEntryRkvs6
KvsEntry
key (	Rkey
value (	Rvalue:8"¶
ValidateSub
s1 (	Bµ	2bbb,cccRs1
s2 (	B	µ2mmmRs2
i1 (Bµ*20,50Ri1
i2 (	B
µ*20,-Ri2
i3 (B
µ*-,50Ri3
i4 (	Bµ*21Ri4"Ó
ValidateTestReq
userId (	BµRuserId
s1 (	Bµ	2bbb,cccRs1
s2 (	B	µ2mmmRs2
i1 (Bµ*20,50Ri1
i2 (	B
µ*20,-Ri2
i3 (B
µ*-,50Ri3
i4 (	Bµ*21Ri4
m (2.ValidateSubRm!
s5 (	Bµaaa,bbb,cccRs5
s6 (	B	µ"4,8Rs6
i5 (B	µ"4,8Ri5
s7 (	B	µ:2,8Rs7
s31 (	B	µintRs31
s32  (	BµdoubleRs32
s33! (	B
µlongRs33
s34" (	BµemailRs34
s35# (	B
µdateRs35!
s36$ (	Bµ	timestampRs36!
s37% (	Bµ	19[0-9]+mRs37
s38& (	B
µa.*cRs38
s39' (	Bµ^a.*c$Rs39%
k( (2.ValidateSubB	µ:2,8Rk$
s41) (	Bµ111,222:1,-Rs41"C
ValidateTestRes
retCode (RretCode
retMsg (	RretMsg"Æ
ValidateTest2Req
userId (	BµRuserId(
s1 (	Bµbbbb,cccp’’’’’’’’Rs1<
i1 (B,µ(Z20,50zå¼čå“åæé”»åØ20å°50ä¹é“Ri1@
s5 (	B0µ,Jaaa,bbb,cccp’’’’’’’’zęäø¾å¼äøę­£ē”®Rs5
s6 (	B	µR4,8Rs6
s7 (	B	µj2,8Rs7
s31 (	B	µBintRs31"<
GiclReq
a (BŖµ
1Ra
b (	BŖµb2sdRb"?
PushReq
clientId (	RclientId
message (	Rmessage";
PushRes
retCode (RretCode
retMsg (	RretMsg"9
OrderItemAttr
name (	Rname
value (	Rvalue"s
	OrderItem
itemId (	RitemId
name (	Rname
price (Rprice$
attrs (2.OrderItemAttrRattrs"s
Session
	loginFlag (	R	loginFlag
userId (	RuserId
userName (	RuserName
mobile (	Rmobile"
Order
orderId (	RorderId
amount (Ramount"
session (2.SessionRsession 
items (2
.OrderItemRitems":
OrderItemAttr2
name (	Rname
value (	Rvalue"u

OrderItem2
itemId (	RitemId
name (	Rname
price (Rprice%
attrs (2.OrderItemAttr2Rattrs"t
Session2
	loginFlag (	R	loginFlag
userId (	RuserId
userName (	RuserName
mobile (	Rmobile"
Order2
orderId (	RorderId
amount (Ramount#
session (2	.Session2Rsession!
items (2.OrderItem2Ritems"g
OrderDetail
name (	Rname
quantity (Rquantity
price (Rprice
note (	Rnote"Ź
HttpTestReq

httpMethod (	R
httpMethod

httpSchema (	R
httpSchema
httpPath (	RhttpPath(
httpQueryString (	RhttpQueryString(
httpContentType (	RhttpContentType 
httpContent (	RhttpContent"
session (2.SessionRsession
orderId (	RorderId
	quantity1	 (R	quantity1
	quantity2
 (R	quantity2
	quantity3 (R	quantity3
	quantity4 (R	quantity4
price1 (Rprice1
price2 (Rprice2
status (2.StatusRstatus"
items (2.OrderDetailRitems
userId (	RuserId
userName (	RuserName
mobile (	Rmobile
	sessionId (	R	sessionId

headerHost (	R
headerHost
	cookieTnk (	R	cookieTnk
colors (	Rcolors"Ń
HttpTestRes
retCode (RretCode
retMsg (	RretMsg
userId (	RuserId"
session (2.SessionRsession
httpCode (RhttpCode(
httpContentType (	RhttpContentType&
headerLocation (	RheaderLocation(
headerXmmDddCcc (	RheaderXmmDddCcc
	cookieTnk	 (	R	cookieTnk

totalPrice
 (R
totalPrice"/
HttpPluginTestReq
username (	Rusername"Ė
HttpPluginTestRes
retCode (RretCode
retMsg (	RretMsg
	plainText (	R	plainText 
redirectUrl (	RredirectUrl
gender (	Rgender
mobile (	Rmobile
email (	Remail"
HttpDownloadStaticRes
retCode (RretCode
retMsg (	RretMsg"
downloadFile (	RdownloadFile

autoDelete (	R
autoDelete

attachment (R
attachment
expire (Rexpire&
downloadStream (RdownloadStream
filename (	Rfilename"

UploadFile
file (	Rfile
filename (	Rfilename
size (Rsize
ext (	Rext 
contentType (	RcontentType"
HttpUploadTestReq1(
httpContentType (	RhttpContentType 
httpContent (	RhttpContent
a (	Ra
b (	Rb!
files (2.UploadFileRfiles"
HttpUploadTestReq2(
httpContentType (	RhttpContentType 
httpContent (	RhttpContent
a (	Ra
b (	Rb!
files (2.UploadFileRfiles"E
HttpUploadTestRes
retCode (RretCode
retMsg (	RretMsg*,
Status
	NOT_READY 	
READY
PAID2
UserService#
login	.LoginReq	.LoginRes"µ;
updateProfile.UpdateProfileReq.UpdateProfileRes"µ&
login2
.Login2Req
.Login2Res"µµd2F
TestService1
test1.ValidateTestReq.ValidateTestRes"µµe25
PushService 
push.PushReq.PushRes"µµf29
PushServicev2"
pushv2.PushReq.PushRes"µµg2
HttpPluginTestService5
test1.HttpPluginTestReq.HttpPluginTestRes"µ9
test2.HttpPluginTestReq.HttpDownloadStaticRes"µ8
upload1.HttpUploadTestReq1.HttpUploadTestRes"µ8
upload2.HttpUploadTestReq2.HttpUploadTestRes"µµhB2
com.xxx.userservice.protoBUserServiceMetasPbproto3