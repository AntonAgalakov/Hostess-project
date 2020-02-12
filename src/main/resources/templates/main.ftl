<#import "parts/common.ftl" as c>
<#import "parts/login.ftl" as l>
<#import "parts/reservation.ftl" as r>

<@c.page>

    <@r.reservation />

    <div class="card rose" >
        <div class="searchtitle">
            <h5 id="h5title">Search</h5>
        </div>
        <form class="form-inline" method="get" action="/main" style="margin: auto;">
            <div class="form-group mb-2">
                <label for="staticEmail2" class="sr-only">Number of table</label>
                <input type="text" class="form-control" name="filter" value="${filter?ifExists}" placeholder="number of table" />
            </div>
            <div class="form-group mx-sm-3 mb-2">
                <label for="inputPassword2" class="sr-only">Data</label>
                <input type="date" class="form-control" name="filterD" value="${filterD?ifExists}" placeholder="data" />
            </div>
            <button type="submit" class="btn btn-ingold mb-2">Find</button>
        </form>

    </div>


    <div class="card-columns" style="margin-top: 10px" id="reservations">
        <#list reservations as reservation>
            <div class="card" data-id="${reservation.id}">
                <H1 id="" align="center">${reservation.table}</H1>
                <div class="card-body">
                    <h5 class="card-title">${reservation.text}</h5>
                    <span class="badge badge-primary">data: ${reservation.data}</span>
                    <p>Time: ${reservation.time}</p>
                    <p>Number of phone: ${reservation.nofP}</p>
                </div>
                <div class="card-footer">
                    <small class="text-muted">${reservation.authorName}</small>
                    <a style="color: #45c42b;" href="/reservation/${reservation.id}">edit</a>
                    <a style="color: #c42b2b;" href="/delete_reservation/${reservation.id}">delete</a>
                </div>
            </div>
        <#else>
            No reservation
        </#list>
    </div>

</@c.page>