<#import "*/frame.ftl" as frame/>
<@frame.page title="教师课程主页">
<div class="content">
    <div class="classInfo">
        <div class="title">课程班级</div>
        <div class="returnButton" id="return">返回上一页</div>
        <div class="line"></div>
        <div class="blockBody">
            <#list data as className>
                <div class="block" id="${className}" onclick="classInfo('${className}')">
                    <div class="blockFont">${className}</div>
                </div>
            </#list>
            <div class="block" id="classAdd">
                <img class="addImg" src="/image/add.png" alt="添加">
            </div>
        </div>
    </div>
    <div class="seminarInfo">
        <div class="title">讨论课</div>
        <div class="line"></div>
        <div class="blockBody">
            <div class="block" id = "seminar1" onclick="seminar('seminar1')">
                <div class="blockFont" id="seminar1">讨论课1</div>
            </div>
            <div class="block">
                <div class="blockFont" id="seminar2" onclick="seminar('seminar2')">讨论课2</div>
            </div>
            <div class="block" id="seminarAdd">
                <img class="addImg" src="/image/add.png" alt="添加">
            </div>
        </div>
    </div>
</div>
<script src="/js/teacher/CourseHome.js"></script>
</@frame.page>