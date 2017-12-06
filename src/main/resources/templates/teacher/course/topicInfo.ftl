<#import "*/frame.ftl" as frame/>
    <#global url = springMacroRequestContext.getContextPath()>
<@frame.page title="查看话题">
<link rel="stylesheet" href="/css/content.css">
<div class="content">
    <div class="contentBlock">
        <div class="title">查看话题</div>
        <div class="returnButton">返回上一页</div>
        <div class="line"></div>
        <div class="itemBody">
            <div class="item">
                <label class="itemName">题 目:</label>
                <label class="itemName">${topic.name}</label>
            </div>
            <div class="item">
                <label class="itemName">说 明:</label>
                <label class="itemName">${topic.description}</label>
            </div>
            <div class="item">
                <label class="itemName">组数限制:</label>
                <label class="itemName">${topic.groupLimit}</label>
            </div>
            <div class="item">
                <label class="itemName">组内人数限制:</label>
                <label class="itemName">${topic.groupLeft}</label>
            </div>
            <div class="item">
                <label class="itemName">已选小组:</label>
                <#if topic.name == "A">
                    <label class="itemName">A1 A2</label>
                </#if>
                <#if topic.name == "B">
                    <label class="itemName">B1 B2 B3</label>
                </#if>
            </div>
            <div class="item">
                <button class="submit">修改</button>
                <button class="reset">删除话题</button>
                <div class="clear"></div>
            </div>
        </div>
    </div>
</div>
<script>
    function returnButton(name,url) {
        console.log(url);
        console.log(name);
    }
</script>
</@frame.page>