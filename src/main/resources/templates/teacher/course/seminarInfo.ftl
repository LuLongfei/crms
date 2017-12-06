<#import "*/frame.ftl" as frame/>
<@frame.page title="讨论课信息">
<link rel="stylesheet" href="/css/content.css">
<div class="content">
    <div class="contentBlock" style="height:60%">
        <div class="title">${seminar.name}</div>
        <div class="returnButton" id="returnButton">返回上一页</div>
        <div class="line"></div>
        <div class="itemBody">
            <div class="item">
                <label class="itemName">讨论课名称：</label>
                <label class="itemName">${seminar.name}</label>
            </div>
            <div class="item">
                <label class="itemName">讨论课说明:</label>
                <label class="itemName">${seminar.description}</label>
            </div>
            <div class="item">
                <label class="itemName">分组方式:</label>
                <label class="itemName">${seminar.groupingMethod}</label>
            </div>
            <div class="item">
                <label class="itemName">开始时间</label>
                <label class="itemName">${seminar.startTime}</label>
            </div>
            <div class="item">
                <label class="itemName">结束时间</label>
                <label class="itemName">${seminar.endTime}</label>
            </div>
            <#if seminar.endTime == "2017-12-20">
                <div class="item">
                    <button class="leftButton" id="grade">评分</button>
                    <button class="middleButton">修改</button>
                    <button class="rightButton">删除讨论课</button>
                    <div class="clear"></div>
                </div>
            </#if>
        </div>
    </div>
    <div class="seminarInfo">
        <div class="title">Topic</div>
        <div class="line"></div>
        <div class="blockBody">
            <#list topic as topics>
                <div class="block" onclick="topicInfo('${topics.name}')">
                    <div class="blockFont">${topics.name}</div>
                </div>
            </#list>
            <#if seminar.endTime == "2017-12-20">
                <div class="block" id="topicAdd">
                    <img class="addImg" src="/image/add.png" alt="添加">
                </div>
            </#if>
        </div>
    </div>
</div>
<script src="/js/teacher/seminarInfo.js"></script>
</@frame.page>