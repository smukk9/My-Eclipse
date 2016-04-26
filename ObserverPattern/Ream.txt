
This java project demonstrates the Observer Design Pattern;
								
weather station-> is observed by->two observers.






Interfaces: 

Observer:
	updateall(); -> this methods updates all the observers who are follwoing the subject.
	
Subject:
	 contains the addobserver, removeobserver, notifyallobservers();
	 
	 
	 
CLasses:

WeatherStation(implements Subject):

		-> this generates the three parameters (temp,press,Humidi) and each time 
		all the value are changed (using setters) it notifys all the obeserver
		that it has in the "observerList"
			contain:
				variables : temo,pres,humid;
				List(arrayList): obeserver list. that contains all theobservers.
				methods: same as subject;
					(notify all is the most important)
				
weatherobserve1:observer2:

this two are the observer who look out for any chages in the temp,humid,press. 
if any changes happens in the weatherStation than this two obeservers are notified.


APP:

	->instansiate weatherstation class.
	->instansiate observer classes and add them to the weatherstation class list using 
		contructor.
	->intalize the parameters.













