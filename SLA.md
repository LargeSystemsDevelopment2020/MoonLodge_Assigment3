# Service-level agreement

**Group E** 

**Frontend:** Jonas Grønbek, Joseph Dean, Nur Salem,  ?,  
**Backend:** Morten Feldt, Jörg Oertel, Mathias Kristensen, Magnus Klitmose, Rasmus Jacobsen  
  
|Version|Date			|Desc.			|Author			|
|---	|---			|---			|---			|
|1.0.0	|30/11/2020		| First SLA		| Rasmus, Mathias	|
|1.0.1	| 30/12/2020 		| More specific SLA	| Rasmus 		|
| 	| 			|			|			|
			
* * *   

### Service description
The service must provide the functionality to see and book hotel rooms and manage bookings in terms of showing bookings from passport nr. and cancel bookings.

### Uptime/availability (usually percentage of all time)  
98%.  

### Mean response time (average time to serve answer)  
Depending on bandwith.
Roughly around 100 to 300 ms. with a 200/20 download/upload connection.
  
  
### Failure frequency (number of failures/ timeouts over time)  
1 failure pr. week.  

### Max time to answer support request
Up to 24 hours.  
  
### Max time to recover (time to recover after outage)  
Up to 1 business day after answering support request.  
    
### Monitoring  
Monitoring of the application can be done from [here](http://206.81.29.87:3000/explore?orgId=1&left=%5B%22now-7d%22,%22now%22,%22Loki2%22,%7B%22expr%22:%22%7Bfilename%3D%5C%22%2Fvar%2Flog%2Fsyslog%5C%22%7D%20%7C%3D%20%5C%22dk.lsd%5C%22%22%7D%5D).  
Contact the backend group by email for login credentials for the site.  
  
* * *  
  
## Support Contact  
Send email to one or more of the following:  
**backend:** cph-rj173@cphbusiness.dk, cph-mk523@cphbusiness.dk.  
**frontend:** cph-jg134@cphbusiness.dk, cph-kt118@cphbusiness.dk.  
