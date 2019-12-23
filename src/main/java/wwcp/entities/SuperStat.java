package wwcp.entities;

public class SuperStat {

    public static String era = "wwcp.era";
    public static String nick = "wwcp.nick";
    public static String type = "wwcp.type";
    public static String aditional = "wwcp.aditional";

    /**Backspeed has to be known*/
    public static class EntityData1{
        public String name;
        public String country;
        public String year;
        public String fuel;
        public String additionalTextTitle;
        public String additionalText;
        public String additionalTextTitle2;
        public String additionalText2;
        public float tractive_effort;
        public float metric_horsepower;
        public float weightinKGs;
        public float topSpeed;
        public float backTopSpeed;
        public boolean fictional;
        public boolean reinforced;

        public EntityData1(String Name, String Country, String Year, String Fuel, String AditionalTextTitle, String AditionalText, String AditionalText2Title, String AditionalText2,
                           float TractiveEffort, float MetricHorsepower, float WeightinTons, float TopSpeed, float BackTopSpeed, boolean Fictional, boolean Reinforced)
        {name=Name;country=Country;year=Year;fuel=Fuel;additionalTextTitle = AditionalTextTitle; additionalText=AditionalText;additionalTextTitle2 = AditionalText2Title;additionalText2=AditionalText2;tractive_effort=TractiveEffort;
            weightinKGs=(WeightinTons * 100);topSpeed=TopSpeed;metric_horsepower=MetricHorsepower;backTopSpeed = BackTopSpeed;fictional=Fictional;reinforced=Reinforced;}


    }
    /**This is for Trains with no defined backspeed, Backspeed simply equals Topspeed*/
    public static class EntityData2{
        public String name;
        public String country;
        public String year;
        public String fuel;
        public String additionalTextTitle;
        public String additionalText;
        public String additionalTextTitle2;
        public String additionalText2;
        public float tractive_effort;
        public float metric_horsepower;
        public float weightinKGs;
        public float topSpeed;
        public float backTopSpeed;
        public boolean fictional;
        public boolean reinforced;

        public EntityData2(String Name, String Country, String Year, String Fuel, String AditionalTextTitle, String AditionalText, String AditionalText2Title, String AditionalText2,
                           float TractiveEffort, float MetricHorsepower, float WeightinTons, float TopSpeed, boolean Fictional, boolean Reinforced)
        {name=Name;country=Country;year=Year;fuel=Fuel;additionalTextTitle = AditionalTextTitle; additionalText=AditionalText;additionalTextTitle2 = AditionalText2Title;additionalText2=AditionalText2;tractive_effort=TractiveEffort;
            weightinKGs=(WeightinTons * 100);topSpeed=TopSpeed;metric_horsepower=MetricHorsepower;backTopSpeed = TopSpeed;reinforced=Reinforced;fictional=Fictional;}


    }
    /**This is for rolingstock with a defined topspeed or with no topspeed "0"*/
    public static class EntityData3{
        public String name;
        public String country;
        public String year;
        public String additionalTextTitle;
        public String additionalText;
        public String additionalTextTitle2;
        public String additionalText2;
        public float weightinKGs;
        public float topSpeed;
        public float backTopSpeed;
        public boolean fictional;
        public boolean reinforced;

        public EntityData3(String Name, String Country, String Year, String AditionalTextTitle, String AditionalText, String AditionalText2Title,
                           String AditionalText2,float WeightinTons,float TopSpeed, boolean Fictional, boolean Reinforced)
        {name=Name;country=Country;year=Year;additionalTextTitle = AditionalTextTitle; additionalText=AditionalText;additionalTextTitle2 = AditionalText2Title;additionalText2=AditionalText2;
            weightinKGs=(WeightinTons * 100);topSpeed=TopSpeed;fictional=Fictional;backTopSpeed = TopSpeed;reinforced=Reinforced;}


    }
//todo add in all Traxx locomotive Types
    /** A B C D E F G H I J K L M N O P Q R S T U V W X Y Z*/

    //BR01 Wagner Deflectors
    public static EntityData1 DRBR01(){return new EntityData1("DR BR 01","Germany","1926-1982","Steam",
            "","",type, " Passenger Locomotive",
            0.0f,2210f,108.9f,130f,50f,false, true);}

    //BR01 Witte Christmas
    public static EntityData1 DRBR01WitteChristmas(){return new EntityData1("Christmas BR 01 Witte","Germany","1926-1982","Steam",
            "","",type, " Passenger Locomotive",
            0.0f,2210f,108.9f,130f,50f,false, true);}

    //BR 798 / VT 98
    public static EntityData2 BR798(){return new EntityData2("BR 798","Germany","1953-2000","Diesel",
            nick," VT 98",type, " Passenger Railbus",
            0f,299.12f,18.9f,90f, false, true);}

    //BR 798 / VT 98
    public static EntityData2 BR798Ads(){return new EntityData2("BR 798 Advertising","Germany","1953-2000","Diesel",
            nick," VT 98",type, " Passenger Railbus",
            0f,299.12f,18.9f,90f, false, true);}

    //Class 37
    public static EntityData2 Class37(){return new EntityData2("Class 37","United Kingdom","1960-","Diesel",
            nick," Tractors",type, " Mixed Locomotive",
            55000f,1750f,102f,140f, false, true);}

    //CR 812
    public static EntityData2 CR812(){return new EntityData2("CR Class812","United Kingdom","1899-1963","Steam",
            nick," Jumbos",type, " Mixed Locomotive",
            20170f,0f,46.38f,88.51f, false, true);}

    //CR 812 Tender
    public static EntityData3 Mcintosh3000Galon(){return new EntityData3("CR Class812","United_Kingdom","1899-1963","",
            "",type," Tender", 19.5f,0f, false, true);}

    //F140 MS2E
    public static EntityData2 F140MS2E(){return new EntityData2("F140 MS2E","Europe","2006-","Electric",
            "","",type, " Freight Locomotive",
            67442.68f,7613.88f,85.0f,140f, false, true);}

    //GE AC4400 CW
    public static EntityData2 GEAC4400CW(){return new EntityData2("GE AC4400CW","America","1993-","Diesel",
            "","",type, " Freight Locomotive",
            145000f,4400f,193f,112f, false, true);}

    //GWR 9400
    public static EntityData2 GWR9400(){return new EntityData2("GWR 9400","United Kingdom","1947-1965","Steam",
            "","",type, " Shunting Locomotive",
            22515f,0f,56.2f,72f,false, true);}

    //KoF III 1
    public static EntityData2 KoFIII1(){return new EntityData2("KoF III 1","Germany","1959-","Diesel",
            nick," Klein Lokomotive",type, " Shunting Locomotive",
            18726.58f,240f,22f,30f,false, true);}

    //KoF III 2
    public static EntityData2 KoFIII2(){return new EntityData2("KoF III 2","Germany","1959-","Diesel",
            nick," Klein Lokomotive",type, " Shunting Locomotive",
            18726.58f,240f,22f,30f,false, true);}

    //MZ Class I
    public static EntityData2 MZI(){return new EntityData2("MZ I","Denmark","1967-","Diesel",
            nick," Cake Tins",type, " Mixed Locomotive",
            88000f,3253f,116.5f,143f, false, true);}

    //MZ Class II
    public static EntityData2 MZII(){return new EntityData2("MZ II","Denmark","1970-","Diesel",
            nick," Cake Tins",type, " Mixed Locomotive",
            88000f,3253f,116.5f,143f, false, true);}

    //MZ Class III
    public static EntityData2 MZIII(){return new EntityData2("MZ III","Denmark","1972-","Diesel",
            nick," Cake Tins",type, " Mixed Locomotive",
            88000f,3854f,121.2f,165f, false, true);}

    //MZ Class IV
    public static EntityData2 MZIV(){return new EntityData2("MZ IV","Denmark","1977-","Diesel",
            nick," Cake Tins",type, " Mixed Locomotive",
            88000f,3854f,123f,165f, false, true);}

    //MZ Class Australia
    public static EntityData2 MZAustralia(){return new EntityData2("MZ III","Australia","1972-","Diesel",
            nick," Cake Tins",type, " Mixed Locomotive",
            88000f,3854f,121.2f,105f, false, true);}

    //NS Highspeed version of the F140MS2E
    public static EntityData2 NSHSF140MS2E(){return new EntityData2("NS E186","Netherlands","2006-","Electric",
            "","",type, " Passenger Locomotive",
            67442.68f,7613.88f,85.0f,160f, false, true);}

    //NE 81 / BR626
    public static EntityData2 NE81(){return new EntityData2("NE 81","Germany","1981-1995","Diesel",
            aditional," BR 626",type, " Passenger Railbus",
            0f,679.81f,46.0f,100f, false, true);}

    //Sentinel 100 HP
    public static EntityData2 Sentinel100HP(){return new EntityData2("Sentinel100HP","United Kingdom","1931-1955","Steam",
            "","",type, " Shunting Locomotive",
            8870f,100f,19.3f,33.8f, false, true);}

    //Sentinel 100 HP
    public static EntityData2 Sentinel100HPChristmas(){return new EntityData2("Sentinel100HPChristmas","United Kingdom","1931-1955","Steam",
            "","",type, " Shunting Locomotive",
            8870f,100f,19.3f,33.8f, false, true);}

    //SSB Re 484 / F 140MS2 todo fact check again
    public static EntityData2 SBBRE484(){return new EntityData2("SBB Re 484","Switzerland","2004-","Electric",
            "","",type, " Freight Locomotive",
            0f,7613.88f,85.4f,140f, false, true);}

    //T32 Tender
    public static EntityData3 T32Tender(){return new EntityData3("T32 2'2'","Germany","1926-1982","",
            "",type," Tender", 17.5f, 0f,false, true);}

    //T32 Christmas Tender
    public static EntityData3 T32TenderChristmas(){return new EntityData3("T32 2'2' Christmas","Germany","1926-1982","",
            "",type," Tender", 17.5f, 0f,false, true);}

    //Wehrmachtslokomotive WR 360 C 14 / V36
    public static EntityData2 WR360C14(){return new EntityData2("Wehrmachtslokomotive WR 360 C 14","Germany","1937-1950","Diesel",
            aditional," DB V36, DB BR236, DR BR103",type, " Shunting Locomotive",
            31473.3f,360.3f,43.0f,60f, false, true);}


    /**Rolling stock Declaration*/
    /** A B C D E F G H I J K L M N O P Q R S T U V W X Y Z*/

    //Donderbus 1st class todo unfinished
    public static EntityData3 Donderbus1(){return new EntityData3("Sggnss 80'","Europe","2014-","",
            "",type," Freight Container", 21.5f, 120f,false, true);}

    //Donderbus 2nd class todo unfinished
    public static EntityData3 Donderbus2(){return new EntityData3("Sggnss 80'","Europe","2014-","",
            "",type," Freight Container", 21.5f, 120f,false, true);}

    //Donderbus 3rd class todo unfinished
    public static EntityData3 Donderbus3(){return new EntityData3("Sggnss 80'","Europe","2014-","",
            "",type," Freight Container", 21.5f, 120f,false, true);}

    //Eurofima with Compartments
    public static EntityData3 EurofimaCompartment(){return new EntityData3("Eurofima Compartments","Europe","1977-","",
            "",type," Passenger", 45f, 200f,false, true);}

    //Eurofima with Rows
    public static EntityData3 EurofimaRows(){return new EntityData3("Eurofima Open Seating","Europe","1977-","",
            "",type," Passenger", 45f, 200f,false, true);}

    //Eurofima with Sleeperbeds
    public static EntityData3 EurofimaSleeper(){return new EntityData3("Eurofima Sleeper","Europe","1977-","",
            "",type," Passenger", 45f, 200f,false, true);}

    //GWR Third
    public static EntityData3 GWRThirdOpen(){return new EntityData3("GWR Third Class open (BG)","United Kingdom","1838-1854-","",
            "",type," Passenger Carriage", 9.5f, 0f,false, true);}

    //GWR Third
    public static EntityData3 GWRThirdOpenChristmas(){return new EntityData3("GWR Third Class open Christmas(BG)","United Kingdom","1838-1854-","",
            "",type," Passenger Carriage", 9.5f, 0f,false, true);}

    //OFF52
    public static EntityData3 OFF52(){return new EntityData3("Off 52","Germany","1954-1980",aditional,
            "Laae 540",type," Freight Cars", 25.4f, 0,false, true);}

    //Rheingold 1st Kitchen
    public static EntityData3 RheingoldKitchen1Christmas(){return new EntityData3("SSA4uk28 Christmas","Germany","1928-1939",aditional,
            " Rheingold 1st class dinnercar Christmas",type," Passenger Dinner", 56.6f, 0f,false, true);}

    //Rheingold 1st Salon
    public static EntityData3 RheingoldSalon1Christmas(){return new EntityData3("SA4u28 Christmas","Germany","1928-1939",aditional,
            " Rheingold 1st class saloncarChristmas",type," Passenger", 51.9f, 0f,false, true);}

    //Rheingold 2nd Kitchen
    public static EntityData3 RheingoldKitchen2Christmas(){return new EntityData3("SB4uk28 Christmas","Germany","1928-1939",aditional,
            " Rheingold 2nd class dinnercar Christmas",type," Passenger Dinner", 55.5f, 0f,false, true);}

    //Rheingold 2nd Salon
    public static EntityData3 RheingoldSalon2Christmas(){return new EntityData3("SB4u28 Christmas","Germany","1928-1939",aditional,
            " Rheingold 2nd class saloncar Christmas",type," Passenger", 52.8f, 0f,false, true);}

    //Rheingold 1st Kitchen
    public static EntityData3 RheingoldKitchen1(){return new EntityData3("SA4uk28","Germany","1928-1939",aditional,
            " Rheingold 1st class dinnercar",type," Passenger Dinner", 56.6f, 0f,false, true);}

    //Rheingold 1st Salon
    public static EntityData3 RheingoldSalon1(){return new EntityData3("SA4u28","Germany","1928-1939",aditional,
            " Rheingold 1st class saloncar",type," Passenger", 51.9f, 0f,false, true);}

    //Rheingold 2nd Kitchen
    public static EntityData3 RheingoldKitchen2(){return new EntityData3("SB4uk28","Germany","1928-1939",aditional,
            " Rheingold 2nd class dinnercar",type," Passenger Dinner", 55.5f, 0f,false, true);}

    //Rheingold 2nd Salon
    public static EntityData3 RheingoldSalon2(){return new EntityData3("SB4u28","Germany","1928-1939",aditional,
            " Rheingold 2nd class saloncar",type," Passenger", 52.8f, 0f,false, true);}

    //Rheingold Baggagef
    public static EntityData3 RheingoldBaggage(){return new EntityData3("SPw4u28","Germany","1928-1939",aditional,
            " Rheingold baggagecar",type," Passenger Baggage", 41.2f, 0f,false, true);}

    //Sggnss 80 Load 1
    public static EntityData3 Sggnss80Load1(){return new EntityData3("Sggnss 80 Load 1'","Europe","2006-","",
            "",type," Freight Container", 21.5f, 120f,false, true);}

    //Sggnss 80 Load 2
    public static EntityData3 Sggnss80Load2(){return new EntityData3("Sggnss 80 Load 2'","Europe","2006-","",
            "",type," Freight Container", 21.5f, 120f,false, true);}

    //Sggnss 80 Load 3
    public static EntityData3 Sggnss80Load3(){return new EntityData3("Sggnss 80 Load 3'","Europe","2006-","",
            "",type," Freight Container", 21.5f, 120f,false, true);}

    //Sggnss 80 Load 4
    public static EntityData3 Sggnss80Load4(){return new EntityData3("Sggnss 80 Load 4'","Europe","2006-","",
            "",type," Freight Container", 21.5f, 120f,false, true);}

    //UK 6 Plank
    public static EntityData3 UKOpenWagon(){return new EntityData3("6-Plank open wagon'","United Kingdom","1930-1959","",
            "",type," Freight Loose", 10f, 0f,false, true);}


}
