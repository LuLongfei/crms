<#import "*/frame.ftl" as frame/>
<@frame.page title="学生课程主页">
<link rel="stylesheet" href="/css/content.css">
<div class="content">
    <div class="classInfo">
        <div class="title">讨论课</div>
        <div class="returnButton">返回上一页</div>
        <div class="line"></div>
        <div class="blockBody">
            <#list data as seminarName>
                <div class="block">
                    <div class="blockFont">${seminarName}</div>
                </div>
            </#list>
        </div>
    </div>
    <div class="seminarInfo">
        <div class="title">课程分组</div>
        <div class="line"></div>
        <div class="blockBody">
            <div class="block">
                <div class="blockFont">固定分组</div>
            </div>
        </div>
    </div>
</div>
</@frame.page>