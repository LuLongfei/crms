<#macro page title>
    <#global url = springMacroRequestContext.getContextPath()>
<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width,height=device-height,initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no">
    <title></title>
    <link rel="stylesheet" href="/css/frame.css">
</head>
<body>
<div class="top">
    <div class="font">
        课堂管理系统
    </div>
    <div class="icon">
        <img src="/image/home.png">首页
        <img src="/image/help.png">帮助
        <img src="/image/exit.png">退出
    </div>
    <div class="clear"></div>
</div>
<div class="body">
    <div class="navigation">
        <div class="courseName">OOAD</div>
        <div class="line"></div>
        <div class="courseIntroduction">ooad is xxx</div>
    </div>
    <#nested >
    <div class="clear"></div>
</div>
</body>
</html>
</#macro>