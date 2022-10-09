package seedu.address.commons.core;

/**
 * Container for user visible messages.
 */
public class Messages {

    public static final String MESSAGE_UNKNOWN_COMMAND = "Unknown command";
    public static final String MESSAGE_INVALID_COMMAND_FORMAT = "Invalid command format! \n%1$s";
    public static final String MESSAGE_INVALID_CUSTOMER_DISPLAYED_INDEX = "The customer index provided is invalid";
    public static final String MESSAGE_CUSTOMERS_LISTED_OVERVIEW = "%1$d customers listed!";
    public static final String MESSAGE_NO_ACTIVE_CUSTOMER = "This command requires you to open a customer first!";

    /* Commission Messages */
    public static final String MESSAGE_INVALID_COMMISSION_DISPLAYED_INDEX = "The commission index provided is invalid";
    public static final String MESSAGE_NO_ACTIVE_COMMISSION = "This command requires you to open a commission first!";
    public static final String MESSAGE_INVALID_COMMISSION_DEADLINE = "The commission deadline provided is invalid. "
            + "The input format should be YYYY-MM-DD";
    public static final String MESSAGE_INVALID_COMMISSION_FEE = "The commission fee provided is invalid";

    /* Iteration Messages */
    public static final String MESSAGE_INVALID_ITERATION_DATE = "The iteration date provided is invalid. "
            + "The input format should be YYYY-MM-DD.";
    public static final String MESSAGE_INVALID_ITERATION_DISPLAYED_INDEX = "The iteration index provided is invalid";
}
