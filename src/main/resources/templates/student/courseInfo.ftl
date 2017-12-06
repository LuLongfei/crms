<#import "*/infoFrame.ftl" as frame/>
<@frame.page title="学生成绩">
<link rel="stylesheet" href="/css/content.css">
<link rel="stylesheet" href="/css/student/content.css">
<div class="content">
    <div class="contentBlock">
        <div class="title">课程信息</div>
        <div class="line"></div>
        <div>
            <#list data as info>
                <div class="main_box_right_content">
                    <h3 class="classtitle"><span id="course">${info.course.name}</span>
                        <button class="main_box_right_content_button">退选课程</button>
                    </h3>
                    <div class="divideline"></div>
                    <div class="classinfo" style="margin: 0 auto;text-align:justify">
                        <div class="item">
                            <label class="itemName">班级:</label>
                            <label class="itemName">${info.name}</label>
                            <label class="itemName" style="margin-left: 30%;">课程地点：</label>
                            <label class="itemName">${info.site}</label>
                        </div>
                        <div class="item">
                            <label class="itemName">教师:</label>
                            <label class="itemName">${info.teacher}</label>
                        </div>
                    </div>
                </div>
            </#list>
        </div>
    </div>
</div>
<div class="clear"></div>
</@frame.page>