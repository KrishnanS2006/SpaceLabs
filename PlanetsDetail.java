
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
* PlanetsDetail Class: Has all the actual information related to PlanetsDetail and displays 
* them using JOptionPane.
* Data include factual data; Mass, Rotation Period, DaY Lenghth, Distance from sun, Orbital Period
* Orbital eccentricity, diameter, mean temperature, and number of moons. 
* Data also includes other interesting facts about a specific planet.
* @author Kanjonavo Sabud
* @version 1
*/

public class PlanetsDetail{

    // data link 
    // https://nssdc.gsfc.nasa.gov/planetary/factsheet/

    /**
    * private variable records mass
    */
    private double mass;
    /**
    * private variable records rotation period
    */
    private double rotPeriod;
    /**
    * private variable records lenght of day
    */
    private double dayLen;
    /**
    * private variable records distance from sun
    */
    private double distSun;
    /**
    * private variable records orbital periods
    */
    private double orbitPeriod;
    /**
    * private variable records orbital eccentricity
    */
    private double orbitEccent;

    /**
    * private variable records diameter
    */
    private int diameter;
    /**
    * private variable records mean temperature
    */
    private int meanTemp;
    /**
    * private variable records number of moons
    */
    private int numMoon; //Actuals

    /**
    * private variable records the order from the sun
    */
    private String numFSun;
    /**
    * private variable records the color of planet
    */
    private String color;
    /**
    * private variable records 1 interesting fact about a planet 
    */
    private String interestingFact1;
    /**
    * private variable records 2nd interesting fact about a planet
    */
    private String interestingFact2;
    /**
    * private variable records the facts of a planet 
    */
    private String facts; // eccentricities, major axis, number from center, ect.
    /**
    * private variable records the characteristics of a planet 
    */
    private String characteristics; // color, habitable or not, number of moons, etc.
    /**
    * private variable records the fun or interesting facts about a planet.
    * This variable combines interestingFact1 and interestingFact2
    */
    private String funFacts;// puns, funny characteristics, etc.
    /**
    * private variable records the high definition image name of planet
    */
    private String ImageName;

    /** 
    * Constructor of Planets Detail
    * There is only a no parameter constructor as a parameter is not necessary
    */
    public PlanetsDetail(){
        facts = "";
        characteristics = "";
        funFacts = "";
    }
    
    /**
    * This method assigns different data to variables for different planets
    * This method uses a switch and case to efficiently differentiate
    * This methods also calls on the other private methods to efficeintly create Strings 
    * and display them using JOptionPane
    * This is the only public method avalable to PlanetsDetail object
    * @param name name of the planet whose information is to be displayed
    */
    public void showDetails(String name){
        switch(name){
         case "Mercury":
            ImageName = "Detail005.png";
            mass = 0.330;
            rotPeriod = 1407.6;
            dayLen = 4222.6;
            distSun = 57.9;
            orbitPeriod = 88.0;
            orbitEccent = 0.205;
            diameter = 4879;
            meanTemp = 167;
            numMoon = 0;
            numFSun = "first";
            color = "silver";
            interestingFact1 = "There is evidence that Mercury is partly molten or liquid";
            interestingFact2 = "Mercury's outer mantle or shell is also ONLY 400 km thick";

            facts = makeFacts(name, numFSun, mass, diameter,rotPeriod, dayLen, orbitPeriod, orbitEccent, distSun);

            characteristics = (firstLineOfChars(name, color, numMoon, meanTemp) + "<br/>" + interestingFact1 + "<br/>" + interestingFact2);
            
            funFacts = ("Mercury was named after the Roman God of commerce by the Romans because of its speed as it revolved around the sun");
            
            
            show(facts, characteristics, funFacts, ImageName);
            
         break;
         case "Venus":
            mass  = 4.87;
            rotPeriod = 5832.5; //revolves the wrong way 
            dayLen = 2802.0;
            distSun = 108.2;
            orbitPeriod = 224.7;
            orbitEccent = 0.007;
            diameter = 12104;
            meanTemp = 464;
            numMoon = 0;
            ImageName = "Detail003.png";
            numFSun = "second";
            color = "white";
            interestingFact1 = "As you may allready know, Venus revolves the opposite way from the other planets";
            interestingFact2 = ("From space Venus looks white because of its clouds." + "In reality Venus's rocks or ground is actually different shades of gray." + "But that is not all, due to its thick atmosphere, sunlight is filtered so everything would look Orange from the ground.");


            facts = makeFacts(name, numFSun, mass, diameter,rotPeriod, dayLen, orbitPeriod, orbitEccent, distSun);
            
            characteristics = (firstLineOfChars(name, color, numMoon, meanTemp) + "<br/>" + interestingFact1 + "<br/>" + "<br/>" +  interestingFact2);

            funFacts = "A day in Venus is longer than a year!";

            show(facts, characteristics, funFacts, ImageName);

         break;
         case "Earth":
            mass  = 5.97;
            rotPeriod = 23.9;
            dayLen = 24.0;
            distSun = 149.6;
            orbitPeriod = 365.2;
            orbitEccent = 0.017;
            diameter = 12756;
            meanTemp = 15;
            numMoon = 1;
            ImageName = "Detail002.png";
            numFSun = "third";
            color = "Green and Blue";//for now
            interestingFact1 = "Earth is mostly Iron and Oxygen";
            interestingFact2 = "Did you know Earth has 2 steroids in Co-Orbital Orbits called 3753 Cruithne and 2002 AA29 which are part of the NEO's?";

            facts = makeFacts(name, numFSun, mass, diameter,rotPeriod, dayLen, orbitPeriod, orbitEccent, distSun);

            characteristics = (firstLineOfChars(name, color, numMoon, meanTemp) + "<br/>" + interestingFact1 + "<br/>" + interestingFact2);

            funFacts = ("What did Earth say to the other planets?.........You guys have no life.");

            show(facts, characteristics, funFacts, ImageName);

         break;
         case "Mars":
            mass  = 0.642;
            rotPeriod = 24.6;
            dayLen = 24.7;
            distSun = 227.9;
            orbitPeriod = 687.0;
            orbitEccent = 0.094;
            diameter = 6792;
            meanTemp = -65;//negative
            numMoon = 2;
            ImageName = "Detail004.png";
            numFSun = "fourth";
            color = "red";
            interestingFact1 = "The red planet is home to the tallest mountain in the solar system. Olympus Mons, a shield volcano, is 21km high and 600km in diameter.";
            interestingFact2 = "Did you know that Sunsets on Mars are blue?";

            facts = makeFacts(name, numFSun, mass, diameter,rotPeriod, dayLen, orbitPeriod, orbitEccent, distSun);

            characteristics = (firstLineOfChars(name, color, numMoon, meanTemp) + "<br/>" + interestingFact1 + "<br/>" + interestingFact2);

            funFacts = ("One day humanity may thrive in Mars");

            show(facts, characteristics, funFacts, ImageName);
         
         break;
         case "Jupiter":
            mass  = 1898.0;
            rotPeriod = 9.9;
            dayLen = 9.9;
            distSun = 778.6;
            orbitPeriod = 4331.0;
            orbitEccent = 0.049;
            diameter = 142984;
            meanTemp = -110;//negative
            numMoon = 79;
            ImageName = "Detail001.png";
            numFSun = "fifth";
            color = "yellow";
            interestingFact1 = "Did you notics that Jupiter has the shortest day of all planets? Only 9.9 hours.";
            interestingFact2 = "The Great Red Spot is a huge storm on Jupiter.It has raged for at least 350 years.It is so large that three Earths could fit inside it.";

            facts = makeFacts(name, numFSun, mass, diameter,rotPeriod, dayLen, orbitPeriod, orbitEccent, distSun);

            characteristics = (firstLineOfChars(name, color, numMoon, meanTemp) + "<br/>" + interestingFact1 + "<br/>" + interestingFact2);

            funFacts = ("A Day on Jupiter lasts less than 10 hours. Just like a Saturday and Sunday on Earth");
            show(facts, characteristics, funFacts, ImageName);

         break;
         case "Saturn":
            mass  = 568.0;
            rotPeriod = 10.7;
            dayLen = 10.7;
            distSun = 1433.5;
            orbitPeriod = 10747.0;
            orbitEccent = 0.057;
            diameter = 120536;
            meanTemp = -140;//negative
            numMoon = 82;
            ImageName = "Detail007.png";
            numFSun = "sixth";
            color = "yellowish brown";
            interestingFact1 = "Saturn is the most distant planet that can be seen with the naked eye. For precision use binoculors or small telescopes.";
            interestingFact2 = "Saturn is made mostly of hydrogen. It exists in layers that get denser farther into the planet. Eventually, deep inside, the hydrogen becomes metallic.";

            facts = makeFacts(name, numFSun, mass, diameter,rotPeriod, dayLen, orbitPeriod, orbitEccent, distSun);

            characteristics = (firstLineOfChars(name, color, numMoon, meanTemp) + "<br/>" + interestingFact1 + "<br/>" + interestingFact2);

            funFacts = ("Saturn. Undefeated Solar System Hula Hoop Champion");

            show(facts, characteristics, funFacts, ImageName);
         
         break;
         case "Uranus":
            mass  = 86.8;
            rotPeriod = 17.2;// turns the opposite way
            dayLen = 17.2;
            distSun = 2872.5;
            orbitPeriod = 30589.0;
            orbitEccent = 0.046;
            diameter = 51118;
            meanTemp = -195;
            numMoon = 27;
            ImageName = "Detail006.png";
            numFSun = "seventh";
            color = "bluish green";
            interestingFact1 = "Uranus is often describes as rolling around the Sun";
            interestingFact2 = "It is the coldest of all planets";

            facts = makeFacts(name, numFSun, mass, diameter,rotPeriod, dayLen, orbitPeriod, orbitEccent, distSun);

            characteristics = (firstLineOfChars(name, color, numMoon, meanTemp) + "<br/>" + interestingFact1 + "<br/>" + interestingFact2);

            funFacts = ("The name Uranus was suggested by astronomer Johann Bode.");

            show(facts, characteristics, funFacts, ImageName);

         break;
         case "Neptune":
            mass  = 102.0;
            rotPeriod = 16.1;
            dayLen = 16.1;
            distSun = 4495.1;
            orbitPeriod = 59800.0;
            orbitEccent = 0.011;
            diameter = 49528;
            meanTemp = -200;
            numMoon = 14;
            ImageName = "Detail008.png";
            numFSun = "eight";
            color = "blue";
            interestingFact1 = "The Great Dark Spot in the southern atmosphere of Neptune was first discovered in 1989 by the Voyager 2 spacecraft. It was an incredibly large rotating storm system with winds of up to 1,500 miles per hour, the strongest winds recorded on any planet. How such powerful winds were discovered on a planet so far from the sun is still considered a mystery to this day.";
            interestingFact2 = "When Neptune was viewed by the Hubble Space telescope in 1994 the Great Dark Spot had vanished, although a different dark spot had appeared in Neptune’s northern hemisphere.";

            facts = makeFacts(name, numFSun, mass, diameter,rotPeriod, dayLen, orbitPeriod, orbitEccent, distSun);

            characteristics = (firstLineOfChars(name, color, numMoon, meanTemp) + "<br/>" + interestingFact1 + "<br/>" + interestingFact2);

            funFacts = ("What kind of songs do planets sing?.........Neptunes");

            show(facts, characteristics, funFacts, ImageName);
         break;
         default:
            String imp = "";
            
            imp = JOptionPane.showInputDialog(null, "Invalid input. Please use a planet's name without any space.           (press Cancel Button to end)");
            showDetails(imp);
            
         break;

        }
    }
    /**
    * private method that is repeatedly called by all planets to create the makeFacts String
    * As the makeFacts String uses the same format using the defined variables
    * this methods is used. 
    * @param dayL  hours in a day 
    * @param dia  diameter of the planet
    * @param distS  planet's distance from the sun
    * @param name  name of planet
    * @param numFSun  planet's number or order from the sun
    * @param m  mass of the planet
    * @param orbitE  planet's orbital eccentricity
    * @param orbitP  planet's orbital period or the time it takes to revolve
    * @param rotP  planet's rotation period
    * @return fact  the completed paragraph of facts 
    */
    private String makeFacts(String name, String numFSun, double m, int dia, double rotP, double dayL, double orbitP, double orbitE, double distS){

        String fact = new String(name + ", the " + numFSun + " planet from the sun has a mass of " + ("" + m) + " * 10^24 kg, with its diameter being " +("" + dia) + " km." + "<br/>" + "The time it takes it to rotate is " + ("" + rotP) + " hours and the time it takes to revolve is " + ("" + orbitP) + " days." + "<br/>" + name + " has " + ("" + dayL) + " hours in a day." + "<br/>" + name+ " has an eccentricity of " + ("" + orbitE)+ " and is " + ("" + distS) + " *10^6 km away from the sun.");

        return fact;
    }
    /**
    * As the first line of characteristics String is of the same format for all planets
    * this private method will be used for all planets
    * @param color  the color of the planet
    * @param name  name of the planet
    * @param numMoon  number of moons a planets has
    * @param meanTemp  the mean tempereature of a planet
    * @return trial  A variable name for the completed first line of characteristics
    */
    private String firstLineOfChars(String name, String color, int numMoon, int meanTemp){
        String trial = new String(name + " is " + color + " in color with " + ("" + numMoon) + " moons." + "<br/>" + "Its mean temperature is " + ("" + meanTemp) + " Celsius.");

        return trial;
    }
    /**
    * this method displays the picture and the discription of the planet
    * using JOptionPane
    * @param chars  the completed paragraph of characteristics 
    * @param facts  the completed paragraph of facts 
    * @param funny   the completed paragraph of interesting facts
    * @param name  name of the planet
    */
    private void show(String facts, String chars, String funny, String name){
        String imp = "";
        
        
        ImageIcon icon = new ImageIcon(PlanetsDetail.class.getResource(name));

        imp = JOptionPane.showInputDialog(
            null, 
            new JLabel("<html><div WIDTH=600>" + facts + "<br/><br/>" + chars + "<br/><br/>" + funny + "<br><br>Next Planet to get Information for:</div></html>", icon, JLabel.LEFT),
                "Planet Information", JOptionPane.INFORMATION_MESSAGE);
        showDetails(imp);  
    }
}