package AbstractFactory.Java;

public class NYCParserFactory implements AbstractParserFactory{

    @Override
    public XMLParser getParserInstance(String parserType) {

        XMLParser parser = null;
        switch(parserType){
            case "error":       parserType.equals("NYCERROR");
                                parser = new NYCErrorXMLParser();
                                break;
            case "feedback":    parserType.equals("NYCFEEDBACK");
                                parser = new NYCFeedbackXMLParser();
                                break;
            case "order":       parserType.equals("NYCORDER");
                                parser = new NYCOrderXMLParser();
                                break;
            case "response":    parserType.equals("NYCRESPONSE");
                                parser = new NYCResponseXMLParser();
                                break;
        }

        return parser;
    }
}
