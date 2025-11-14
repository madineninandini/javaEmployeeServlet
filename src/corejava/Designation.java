package corejava;
public class Designation {
	    // Method to verify valid designation
	    boolean verify(String desg) {
	        boolean isValid = false;
	        switch (desg.toUpperCase()) {
	            case "SE": isValid = true;
	               break;
	            case "TE": isValid = true;
	               break;
	            case "ME": isValid = true;
	               break;
	            default:
	            	isValid = false;
	        }
	        return isValid;
	    }


}
