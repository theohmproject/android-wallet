package ohm.org.ohmwallet.ui.transaction_send_activity.custom;

/**
 * Created by ras on 8/9/17.
 */

class InvalidFeeException extends Exception {

    public InvalidFeeException(String message) {
        super(message);
    }
}