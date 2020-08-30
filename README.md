ORDER API:

1) Order Creation
http://localhost:8686/order/create
Method: POST
Content-Type:application/json
Request Body:
{
"customerName":"Antony",
"orderDate":"27/08/2020",
"shippingAddress":"Madurai",
"orderItem":[{
"productCode":"PRD1",
"productName":"Test1",
"quantity":"8"
}, {
"productCode":"PRD2",
"productName":"Test2",
"quantity":"5"
}],
"total":"150"
}

2) Get particular Order Detail:
http://localhost:8686/order/orderdetails/1
Method: GET

3) Get All Order Details:
http://localhost:8686/order/orderdetails/1
Method: GET
