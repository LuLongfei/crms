<#import "*/frame.ftl" as frame/>
<@frame.page title="查看话题">
<link rel="stylesheet" href="/css/content.css">
<div class="content">
    <div class="contentBlock">
        <div class="title">查看话题</div>
        <div class="returnButton" >返回上一页</div>
        <div class="line"></div>
        <div class="itemBody" id="showInfo">
            <div class="item">
                <label class="itemName">题 目:</label>
                <label class="itemName" id="name">${topic.name}</label>
            </div>
            <div class="item">
                <label class="itemName">说 明:</label>
                <label class="itemName" id="description">${topic.description}</label>
            </div>
            <div class="item">
                <label class="itemName">组数限制:</label>
                <label class="itemName" id="groupLimit">${topic.groupLimit}</label>
            </div>
            <div class="item">
                <label class="itemName">组内人数限制:</label>
                <label class="itemName" id="memberLimit">${topic.groupLeft}</label>
            </div>
            <div class="item">
                <label class="itemName">已选小组:</label>
                <label class="itemName">A1</label>
            </div>
            <div class="item">
                <button class="submit" id="modifyButton">修改</button>
                <button class="reset">删除话题</button>
                <div class="clear"></div>
            </div>
        </div>
        <div class="itemBody" id="modifyInfo" style="display: none;">
            <div class="item">
                <label class="itemName">题 目:</label>
                <input class="middleInput" id="name"></input>
            </div>
            <div class="item">
                <label class="itemName">说 明:</label>
                <input class="middleInput" id="description"></label>
            </div>
            <div class="item">
                <label class="itemName">组数限制:</label>
                <input class="middleInput" id="groupLimit"></input>
            </div>
            <div class="item">
                <label class="itemName">组内人数限制:</label>
                <input class="middleInput" id="memberLimit"></input>
            </div>
            <div class="item">
                <label class="itemName">已选小组:</label>
                <label class="itemName">A1</label>
            </div>
            <div class="item">
                <button class="submit" id="submitButton">保存</button>
                <button class="reset">删除话题</button>
                <div class="clear"></div>
            </div>
        </div>
    </div>
</div>
<script src="/js/teacher/modifyTopicInfo.js"></script>
</@frame.page>