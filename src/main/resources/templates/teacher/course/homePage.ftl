<#import "*/frame.ftl" as frame/>
<@frame.page title="教师课程主页">
<div class="content">
    <div class="classInfo">
        <div class="title">课程班级</div>
        <div class="returnButton">返回上一页</div>
        <div class="line"></div>
        <div class="blockBody">
            <#list data as className>
                <div class="block">
                    <div class="blockFont">${className}</div>
                </div>
            </#list>
        </div>
    </div>
    <div class="seminarInfo">
        <div class="title">讨论课</div>
        <div class="line"></div>
        <div class="blockBody">
            <div class="block">
                <div class="blockFont">讨论课1</div>
            </div>
            <div class="block">
                <div class="blockFont">讨论课2</div>
            </div>
            <div class="block">
                <div class="blockFont">讨论课3</div>
            </div>
            <div class="block">
                <div class="blockFont">讨论课4</div>
            </div>
            <div class="block">
                <div class="blockFont">讨论课5</div>
            </div>
            <div class="block">
                <img class="addImg" src="/image/add.png" alt="添加">
            </div>
        </div>
    </div>
</div>
</@frame.page>