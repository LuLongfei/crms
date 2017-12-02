<#import "*/frame.ftl" as frame/>
<@frame.page title="教师评分">
<div class="content">
    <div class="classInfo">
        <div class="title">评分</div>
        <div class="returnButton">返回上一页</div>
        <div class="line"></div>
    </div>
    <div class="seminarInfo">
        <table class="table table-striped">
            <thead class="tableTitle">
            <tr>
                <th>Topic</th>
                <th>组名</th>
                <th>组长</th>
                <th>课堂讨论得分</th>
                <th>报告提交情况</th>
                <th>报告分数</th>
                <th>总分</th>
                <th>报告</th>
            </tr>
            </thead>
            <tbody class="tableContent">
            <tr>
                <td>A</td>
                <td>Bangalore</td>
                <td>xxx</td>
                <td>5</td>
                <td>已提交</td>
                <td>5</td>
                <td>5</td>
                <td>
                    <img src="/image/view.png" alt="预览">
                    <img src="/image/download.png" alt="下载">
                </td>
            </tr>
            </tbody>
        </table>
    </div>
</div>
</@frame.page>