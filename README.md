# movie-rating-app
In this app i have configured 3 micro-services using Spring Eureka Server.

# gearing up the application

First of all you have to run discovery server instance.
then run all remaining instances 
After running all instance you can verify running services from Eureka Server UI by going to this path "http://localhost:8761"
It shows 3 services running
After that you can go to this url to get a hard-coded output "http://localhost:8084/catalog/foo"

you can change ports from application.properties files from each services.
Thats It
