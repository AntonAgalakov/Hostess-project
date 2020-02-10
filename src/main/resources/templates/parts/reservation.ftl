<#macro reservation>
    <div class="card" >
        <form method="post">
            <div>
                <h5 id="h5title" style="margin-left: 317px;">Reservation</h5>
            </div>
            <div class="card-body">
                <div class="form-group row">
                    <label for="staticEmail" class="col-sm-2 col-form-label">Name</label>
                    <div class="col-sm-10">
                        <input type="text" class="inputreservation" name="text" placeholder="Name" />
                    </div>
                </div>
                <div class="form-group row">
                    <label for="staticEmail" class="col-sm-2 col-form-label">Number of table</label>
                    <div class="col-sm-10">
                        <input type="text" class="inputreservation" name="ntable" placeholder="Table" />
                    </div>
                </div>
                <div class="form-group row">
                    <label for="staticEmail" class="col-sm-2 col-form-label">Data</label>
                    <div class="col-sm-10">
                        <input type="text" class="inputreservation" name="data" placeholder="DD/MM/YY" />
                    </div>
                </div>
                <div class="form-group row">
                    <label for="staticEmail" class="col-sm-2 col-form-label">Time</label>
                    <div class="col-sm-10">
                        <input type="text" class="inputreservation" name="time" placeholder="**:**" />
                    </div>
                </div>
                <div class="form-group row">
                    <label for="staticEmail" class="col-sm-2 col-form-label">Number of phone</label>
                    <div class="col-sm-10">
                        <input type="text" class="inputreservation" name="nofP" placeholder="8(***)***-**-**" />
                    </div>
                </div>
                <input type="hidden" name="_csrf" value="${_csrf.token}" /> <br>
                <button type="submit" class="btn btn-gold">Add</button>
            </div>
        </form>
    </div>
</#macro>