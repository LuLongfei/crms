<#import "*/infoFrame.ftl" as frame/>
<@frame.page title="学生成绩">
<link rel="stylesheet" href="/css/content.css">
<link rel="stylesheet" href="/css/student/content.css">
<div class="content">
    <div class="contentBlock">
        <div class="title">课程信息</div>
        <div class="line"></div>
        <div class="item">
            <label class="itemName">课程名称：</label>
            <input class="middleInput">
        </div>
        <div class="item">
            <div class="itemName">任课教师：</div>
            <input class="middleInput">
            <button class="rightButton" style="margin-top: 0;">查询</button>
        </div>
        <div>
            <div class="main_box_right_content">
                <h3 class="classtitle"><span id="course">J2EE</span>
                    <button class="main_box_right_content_button">选择课程</button>
                </h3>
                <div class="divideline"></div>
                <div class="classinfo" style="margin: 0 auto;text-align:justify">
                    <div class="item">
                        <label class="itemName">班级:</label>
                        <label class="itemName">周三一二节</label>
                        <label class="itemName" style="margin-left: 30%;">课程地点：</label>
                        <label class="itemName">xxxxxx</label>
                    </div>
                    <div class="item">
                        <label class="itemName">教师:</label>
                        <label class="itemName">邱明</label>
                        <label class="itemName">课程地点：</label>
                        <label class="itemName">xxxxxx</label>
                    </div>
                </div>
            </div>
            <div class="main_box_right_content">
                <h3 class="classtitle"><span id="course">J2EE</span>
                    <button class="main_box_right_content_button">选择课程</button>
                </h3>
                <div class="divideline"></div>
                <div class="classinfo" style="margin: 0 auto;text-align:justify">
                    <div class="item">
                        <label class="itemName">班级:</label>
                        <label class="itemName">周三一二节</label>
                        <label class="itemName" style="margin-left: 30%;">课程地点：</label>
                        <label class="itemName">xxxxxx</label>
                    </div>
                    <div class="item">
                        <label class="itemName">教师:</label>
                        <label class="itemName">邱明</label>
                        <label class="itemName">课程地点：</label>
                        <label class="itemName">xxxxxx</label>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<div class="clear"></div>
</@frame.page>