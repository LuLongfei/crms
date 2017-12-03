<#import "*/frame.ftl" as frame/>
<@frame.page title="创建话题">
<link rel="stylesheet" href="/css/content.css">
<div class="content">
    <div class="contentBlock">
        <div class="title">创建话题</div>
        <div class="returnButton" >返回上一页</div>
        <div class="line"></div>
        <div class="itemBody">
            <div class="item">
                <label class="itemName">题 目</label>
                <input class="bigInput">
            </div>
            <div class="item">
                <label class="itemName">说 明</label>
                <textarea class="textStyle">xxxx</textarea>
            </div>
            <div class="item">
                <label class="itemName">组数限制</label>
                <input class="smallInput">
            </div>
            <div class="item">
                <label class="itemName">组内人数限制:</label>
                <input class="smallInput">
            </div>
            <div class="item">
                <button class="submit">提交</button>
                <button class="reset">重置</button>
                <div class="clear"></div>
            </div>
        </div>
    </div>
</div>
</@frame.page>