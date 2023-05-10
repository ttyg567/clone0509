let salesChart = {
    init:function (){
        //코드 시작
        // Data retrieved from https://yearbook.enerdata.net/electricity/world-electricity-production-statistics.html
        Highcharts.chart('scontainer', {
            chart: {
                type: 'column',
                options3d: {
                    enabled: true,
                    alpha: 15,
                    beta: 15,
                    viewDistance: 25,
                    depth: 40
                }
            },

            title: {
                text: '남녀 일자별 Sales 합계금액',
                align: 'center'
            },

            xAxis: {
                labels: {
                    skew3d: true,
                    style: {
                        fontSize: '16px'
                    }
                }
            },

            yAxis: {
                allowDecimals: false,
                min: 0,
                title: {
                    text: 'Sales',
                    skew3d: true,
                    style: {
                        fontSize: '16px'
                    }
                }
            },

            tooltip: {
                headerFormat: '<b>{point.key}</b><br>',
                pointFormat: '<span style="color:{series.color}">\u25CF</span> {series.name}: {point.y} / {point.stackTotal}'
            },

            plotOptions: {
                series: {
                    pointStart: 2020
                },
                column: {
                    stacking: 'normal',
                    depth: 40
                }
            },

            series: [{
                name: 'M',
                data: [368, 378, 378, 367, 363],
                stack: 'male'
            }, {
                name: 'F',
                data: [564, 562, 582, 571, 533],
                stack: 'female'
            }]
        });
        //코드 끝

    }
};

let pieChart = {
    init:function (){
        // Create the chart
        Highcharts.chart('pcontainer', {
            chart: {
                type: 'pie'
            },
            title: {
                text: 'Gender',
                align: 'center'
            },

            accessibility: {
                announceNewData: {
                    enabled: true
                },
                point: {
                    valueSuffix: '%'
                }
            },

            plotOptions: {
                series: {
                    borderRadius: 5,
                    dataLabels: {
                        enabled: true,
                        format: '{point.name}: {point.y:.1f}%'
                    }
                }
            },

            tooltip: {
                headerFormat: '<span style="font-size:11px">{series.name}</span><br>',
                pointFormat: '<span style="color:{point.color}">{point.name}</span>: <b>{point.y:.2f}%</b> of total<br/>'
            },

            series: [
                {
                    name: 'Browsers',
                    colorByPoint: true,
                    data: [
                        {
                            name: 'M',
                            y: 50,
                            drilldown: 'M'
                        },
                        {
                            name: 'F',
                            y: 50,
                            drilldown: 'F'
                        },

                    ]
                }
            ],
            drilldown: {
                series: [
                    {
                        name: 'M',
                        id: 'M',
                        data: [
                            [
                                'v97.0',
                                36.89
                            ]
                        ]
                    },
                    {
                        name: 'F',
                        id: 'F',
                        data: [
                            [
                                'v15.3',
                                0.1
                            ]
                        ]
                    }
                ]
            }
        }); //코드끝
    }
};