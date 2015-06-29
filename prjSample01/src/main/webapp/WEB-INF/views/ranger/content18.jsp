<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<script type="text/javascript">
	function sendmail() {
		var acount = "life-ranger-pawr"; 
		var domain = "cc.mti.co.jp";
		var ua = navigator.userAgent;
		if( (ua.indexOf('iPhone') > 0 || ua.indexOf('iPad') > 0 || ua.indexOf('iPod') > 0 || ua.indexOf('android') > 0 || ua.indexOf('BlackBerry') > 0 || ua.indexOf('windows Phone') > 0 || ua.indexOf('NOKIA') > 0 || /Mobile.*Firefox/.test(ua))){
			 this.location.href="mailto:"+acount+ "@" +domain+"?subject=ライフレンジャー天気for web お問い合わせ&body=◆mopita ID：%0a＜mopita ID をお持ちの方はここに入力をお願いします。＞%0a%0a◆お問い合わせ内容：%0a%0a＜ここにお問い合わせ内容をご記入ください。なお、下記のブラウザ情報は消去しないようお願いします。＞%0a%0a◆ブラウザ情報：%0a%0a" +ua;
		}
	}

</script>
<body>
<div>
	<h3>ご意見・お問い合わせ</h3>
	<hr/>
	■よくあるご質問<br/>
	お問い合わせの前に<a href="#">｢よくある質問｣</a>をご確認下さい。<br/>
	■禁止事項<br/>
	メール文中には絵文字を使用しないで下さい。<br/>
	■免責<br/>
	頂いた全てのお問い合わせに対し順次返答を行っておりますが､内容によっては返信に数日かかる場合がございます｡ご了承下さい｡メールは24時間受付けておりますが、ご回答時間は9:00～17:30となります。<br/><br/>
	以上をご確認頂いた上で下記宛先までお問い合わせ下さい。<br/>
	&lt;コンタクトセンター&gt;<br/>
	[メール]<br/>
	<a href="javascript:sendmail()">life-ranger-pawr@cc.mti.co.jp</a><br/>
	<span style="color:red;">メール送信時に端末のUser-Agentを送信します</span><br/>
	[電話]<br/>
	<a href="#">050-8882-5939</a><br/>
	お電話でのお問い合わせの際は最初にサイト名と機種名をお伝え下さい。<br/>
	※受付時間は平日9:00～17:30(土日祝日/年末年始除く)<br/>
</div>
</body>
</html>