<#macro page>
    <!DOCTYPE html>
    <html lang="en">
    <head>
        <meta charset="UTF-8" />
        <title>Hostess</title>

        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />

        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB" crossorigin="anonymous" />
        <style>
            #nava {
                position: relative;
                color: #B1B1B1; /*задаём цвет ссылки*/
                cursor: pointer;
                line-height: 1; /*задаём высоту строки*/
                text-decoration: none; /*убираем подчёркивание*/
                font-size: 26px;
                display: block;
                padding: 0.9rem 1.2rem;
            }
            #nava:after {
                display: block;
                position: absolute;
                left: 0; /*изменить на right:0;, чтобы изменить направление подчёркивания */
                width: 0;/*задаём длинну линии до наведения курсора*/
                height: 2px; /*задаём ширину линии*/
                background-color: #b7a064; /*задаём цвет линии*/
                content: "";
                transition: width 0.3s ease-out; /*задаём время анимации*/
            }

            #nava:hover:after,
            #nava:focus:after {
                width: 100%; /*устанавливаем значение 100% чтобы ссылка подчёркивалась полностью*/
            }
            #h5title {
                color: #b7a064;
                font-size: 79px;
                margin-top: 15px;
            }
            .inputreservation {
                display: block;
                width: 100%;
                padding: .375rem .75rem;
                font-size: 1rem;
                line-height: 1.5;
                color:#495057;
                background-color: #fff;
                background-clip: padding-box;
                border: 1px solid #ced4da;
                border-radius: .25rem;
                transition: border-color .15s ease-in-out,box-shadow .15s ease-in-out;
            }
            .btn-gold {
                color: #b7a064;
                background-color: white;
                border: 1px solid #b7a064;
                padding: .375rem .75rem;
                font-size: 1rem;
                line-height: 1.5;
                border-radius: .25rem;
                transition: color .15s ease-in-out,background-color .15s ease-in-out,border-color .15s ease-in-out,box-shadow .15s ease-in-out;
            }
            .btn-gold:hover {
                color: white;
                background-color: #b7a064;
                border: 1px solid #b7a064;
            }
            .btn-ingold {
                color: white;
                background-color: #b7a064;
                border: 1px solid #b7a064;
                padding: .375rem .75rem;
                font-size: 1rem;
                line-height: 1.5;
                border-radius: .25rem;
                transition: color .15s ease-in-out,background-color .15s ease-in-out,border-color .15s ease-in-out,box-shadow .15s ease-in-out;
            }
            .btn-ingold:hover {
                color: #b7a064;
                background-color: white;
                border: 1px solid #b7a064;
            }
            .rose {
                background-image: url("https://img4.goodfon.ru/original/1600x1200/6/b2/iagoda-malina-chernika-ezhevika.jpg");
                margin-top: 18px;
                padding-block: 70px;
            }
            .searchtitle {
                margin-left: 408px;
                margin-top: -129px;
                padding-block: inherit;
            }
            hr {
                height: 20px;
                margin: 30px auto;
                width: 70%;
                background-image: radial-gradient(farthest-side at 50% -50%, #b7a064, rgba(255, 255, 255, 0));
                position: relative;
                border: none;
            }

            hr:before {
                height: 1px;
                position: absolute;
                top: -1px;
                left: 0;
                right: 0;
                background-image: linear-gradient(90deg, #b7a064, rgba(0, 0, 0, 0.75) 50%, rgba(0, 0, 0, 0));
            }
        </style>

    </head>
    <body>
    <#include "navbar.ftl">
        <div class="container mt-5">
            <#nested>
        </div>
        <!-- Optional JavaScript -->
        <!-- jQuery first, then Popper.js, then Bootstrap JS -->
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js" integrity="sha384-smHYKdLADwkXOn1EmN1qk/HfnUcbVRZyYmZ4qpPea6sjB/pTJ0euyQp0Mk8ck+5T" crossorigin="anonymous"></script>
    </body>
    </html>
</#macro>