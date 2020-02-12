<#import "parts/common.ftl" as c>

<@c.page>

<div class="card" >
    <form action="/reservation" method="post">
        <div>
            <h5 id="h5title" style="margin-left: 317px;">--Editor--</h5>
        </div>
        <div class="card-body">
            <div class="form-group row">
                <label for="staticEmail" class="col-sm-2 col-form-label">Name</label>
                <div class="col-sm-10">
                    <input type="text" class="inputreservation" name="text" value="${reservation.text}"/>
                </div>
            </div>
            <div class="form-group row">
                <label for="staticEmail" class="col-sm-2 col-form-label">Number of table</label>
                <div class="col-sm-10">
                    <input type="text" class="inputreservation" name="ntable" value="${reservation.ntable}" />
                </div>
            </div>
            <div class="form-group row">
                <label for="staticEmail" class="col-sm-2 col-form-label">Data</label>
                <div class="col-sm-10">
                    <input type="text" class="inputreservation" name="ndata" value="${reservation.data}" />
                </div>
            </div>
            <div class="form-group row">
                <label for="staticEmail" class="col-sm-2 col-form-label">Time</label>
                <div class="col-sm-10">
                    <input type="text" class="inputreservation" name="ntime" value="${reservation.time}" />
                </div>
            </div>
            <div class="form-group row">
                <label for="staticEmail" class="col-sm-2 col-form-label">Number of phone</label>
                <div class="col-sm-10">
                    <input type="text" class="inputreservation" name="nofP" value="${reservation.nofP}" />
                </div>
            </div>
            <input type="hidden" value="${reservation.id}" name="reservationId">
            <input type="hidden" value="${_csrf.token}" name="_csrf">
            <button type="submit" class="btn btn-gold">Save</button>
        </div>
    </form>
</div>

</@c.page>