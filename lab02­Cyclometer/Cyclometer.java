// CSE2
//Anil Bakkaloglu
//09.03.2015
//CSE 002 Lab 2

public class Cyclometer {
    
    public static void main(String[] args) {

int secsTrip1=480; // how long one lap takes fpr trip 1
int secsTrip2=3220; // how long one lap takes fpr trip 2
int countsTrip1=1561; // how many laps there are for trip 1 
int countsTrip2=9037; // how many laps there are for trip 1 

double wheelDiameter=27.0, 
PI=3.14159,
feetPerMile=5280,
inchesPerFoot=12,
secondsPerMinute=60;
double distanceTrip1, distanceTrip2,totalDistance;

System.out.println("Trip 1 took "+ 
    (secsTrip1/secondsPerMinute)+"minutes and had "+
    countsTrip1+"counts.");

System.out.println("Trip 2 took "+ 
    (secsTrip2/secondsPerMinute)+"minutes and had "+
    countsTrip2+"counts.");
    
distanceTrip1=countsTrip1*wheelDiameter*PI;
distanceTrip1/=inchesPerFoot*feetPerMile;
distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
totalDistance=distanceTrip1+distanceTrip2;
System.out.println ("Trip 1 was "+distanceTrip1+" miles");
System.out.println ("Trip 2 was "+distanceTrip2+" miles");
System.out.println ("The total distance was "+totalDistance+" miles");

    }
}

