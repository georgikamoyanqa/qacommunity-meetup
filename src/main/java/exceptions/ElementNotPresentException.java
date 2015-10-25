package exceptions;

/**
 * Created by GeorgiKamoyan on 10/19/15.
 */
public class ElementNotPresentException extends RuntimeException {

    public ElementNotPresentException(String elementLocator) {
        super(elementLocator);
    }

    @Override
    public String getMessage() {

        return createMessage(super.getMessage());
    }

    private String createMessage(String originalMessage) {

        return "ELEMENT WITH LOCATOR { " + originalMessage + " } IS NOT PRESENT ON PAGE" + '\n';
    }


}
