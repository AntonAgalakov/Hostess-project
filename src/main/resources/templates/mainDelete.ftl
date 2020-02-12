<#import "parts/common.ftl" as c>

<@c.page>

<div class="card" >
    <form action="/delete_reservation" method="post">
        <div>
            <h5 id="h5title" style="margin-left: 317px;">--DELETE--</h5>
        </div>
        <div class="card-body">
            <div class="form-group row">
                <label for="staticEmail" class="col-sm-2 col-form-label">Name</label>
                <div class="col-sm-10">
                    <input type="text" readonly class="inputreservation" name="text" value="${reservation.text}"/>
                </div>
            </div>
            <div class="form-group row">
                <label for="staticEmail" class="col-sm-2 col-form-label">Number of table</label>
                <div class="col-sm-10">
                    <input type="text" readonly class="inputreservation" name="ntable" value="${reservation.ntable}" />
                </div>
            </div>
            <div class="form-group row">
                <label for="staticEmail" class="col-sm-2 col-form-label">Data</label>
                <div class="col-sm-10">
                    <input type="text" readonly class="inputreservation" name="ndata" value="${reservation.data}" />
                </div>
            </div>
            <div class="form-group row">
                <label for="staticEmail" class="col-sm-2 col-form-label">Time</label>
                <div class="col-sm-10">
                    <input type="text" readonly class="inputreservation" name="ntime" value="${reservation.time}" />
                </div>
            </div>
            <div class="form-group row">
                <label for="staticEmail" class="col-sm-2 col-form-label">Number of phone</label>
                <div class="col-sm-10">
                    <input type="text" readonly class="inputreservation" name="nofP" value="${reservation.nofP}" pattern="\+7\s?[\(]{0,1}9[0-9]{2}[\)]{0,1}\s?\d{3}[-]{0,1}\d{2}[-]{0,1}\d{2}" />
                </div>
            </div>
            <input type="hidden" value="${reservation.id}" name="reservationId">
            <input type="hidden" value="${_csrf.token}" name="_csrf">
            <button type="submit" class="btn btn-gold">Delete</button>
        </div>
    </form>
</div>

</@c.page>