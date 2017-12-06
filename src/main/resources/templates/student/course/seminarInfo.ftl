<#import "*/frame.ftl" as frame/>
<@frame.page title="讨论课信息">
<link rel="stylesheet" href="/css/content.css">
<link rel="stylesheet" href="/css/student/content.css">
<div class="content">
    <div>
        <div class="title">${data.name}</div>
        <div class="returnButton">返回上一页</div>
        <div class="line"></div>
        <div class="itemBody">
            <div class="item">
                <label class="itemName" style="width:100%">${data.description}</label>
                <div class="lightline"></div>
            </div>
            <div class="item">
                <label class="itemName">分组方式：</label>
                <label class="itemName">${data.groupingMethod}</label>
            </div>
            <div class="item">
                <label class="itemName">开始时间：</label>
                <label class="itemName">${data.startTime}</label>
                <label class="itemName">结束时间：</label>
                <label class="itemName">${data.endTime}</label>
            </div>
        </div>
        <#if data.groupingMethod == "随机分组">
        <div>
            <div class="item">
                <div class="lightline"></div>
            </div>
            <div class="item">
                <label class="itemName">选择话题：</label>
                <label class="itemName">${group.topic.name}</label>
            </div>
            <div class="item">
                <label class="itemName">组号：</label>
                <label class="itemName">${group.id}</label>
            </div>
            <div class="item">
                <label class="itemName">组 长：</label>
                <label class="itemName">${group.leader.name}</label>
            </div>
            <div class="item">
                <label class="itemName">组 员：</label>
                <#list group.members as member>
                    <label class="itemName">${member.name}</label>
                </#list>
            </div>
        </div>
        </#if>
    </div>
    <div class="classInfo">
        <div class="title">话题</div>
        <div class="line"></div>
        <div class="blockBody">
            <#list topic as topics>
                <div class="block">
                    <div class="blockFont">${topics.name}</div>
                </div>
            </#list>
        </div>
        <div class="item">
            <button class="uploadbutton">上传报告</button>
        </div>
        <div class="item">
            <button class="viewscorebutton">查看分数</button>
            <div class="clear"></div>
        </div>
    </div>
</div>
</@frame.page>