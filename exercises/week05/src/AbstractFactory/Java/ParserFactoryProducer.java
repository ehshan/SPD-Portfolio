package AbstractFactory.Java;

public class ParserFactoryProducer {

    public static AbstractParserFactory getFactory(String factory){

      AbstractParserFactory newFactory = null;
        switch(factory){
            case "NYC":     factory.equals("NYCFactory");
                            newFactory = new NYCParserFactory();
                            break;
            case "London":  factory.equals("LondonFactory");
                            newFactory = new LondonParserFactory();
                            break;
        }
        return newFactory;
    }
}
