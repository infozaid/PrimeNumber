package test;



import java.util.Arrays;
import java.util.List;

public class UIConstants {

    // /////////////////////////////////////////////
    // ///////////// PRIVILIDGES //////////////////
    // /////////////////////////////////////////////

    public static final String PRIV_BULK_CUSTOMER_REGISTRATION_MAKER = "UI_BLKP_CUSTOMER_REGISTRATION_MAKER";

    public static final String PRIV_BULK_CUSTOMER_REGISTRATION_APPROVAL = "UI_BLKP_CUSTOMER_REGISTRATION_APPROVAL";

    public static final String PRIV_BULK_PORTAL_LOGIN = "UI_BLKP_LOGIN";

    public static final String PRIV_BANK_PORTAL_LOGIN = "UI_BP_LOGIN";

    public static final String PRIV_UI_AGENTCLASS_DEFINITION = "UI_AGENT_CLASS_DEFINITION";
    public static final String PRIV_UI_AGENT_CLASS_DEFINITION_EDIT_APPROVAL = "UI_AGENT_CLASS_DEFINITION_EDIT_APPROVAL";
    public static final String PRIV_UI_AGENT_CLASS_DEFINITION_APPROVAL = "UI_AGENT_CLASS_DEFINITION_APPROVAL";
    public static final String PRIV_UI_BANK_TO_OTHER_BANK = "UI_BANK_TO_OTHER_BANK";

    public static final String PRIV_IBFT_FEE_CHARGES = "UI_IBFT_FEE_CHARGES";
    public static final String PRIV_IBFT_FEE_CHARGES_APPROVAL = "UI_IBFT_FEE_CHARGES_APPROVAL";




    // /////////////////////////////////////////////
    // ///////////// CONSTANTS ////////////////////
    // /////////////////////////////////////////////


    public static final int INACTIVE_DORMANT_BLACKLIST_REASON = 9;
    public static final int INACTIVE_BIOMETRIC_BLACKLIST_REASON = 10;
    public static final int INACTIVE_CNIC_BLACKLIST_REASON = 11;



    public static final String STATUS_BULK_REJECTED = "3";
    public static final String BULK_TYPE_WALLET = "walletbulkreport";
    public static final String BULK_TYPE_CNIC = "cnicbulkreport";
    public static final String BULK_TYPE_GUEST = "guestbulkreport";

    public static final int ACTION_CREATE_BULK_SUBMIISION = 0;
    public static final int MODULE_ID_BULK_GUEST_REGISTRATION = 20;
    public static final int MODULE_ID_BULK_CNIC = 18;
    public static final int MODULE_ID_BULK_WALLET = 17;
    public static final String RESOURCE_BUNDLE_BULK_CNIC_TYPE = "bulkCNICType";
    public static final int LENGTH_TEMP_PASSWORD = 10;
    public static final int MIN_LENGTH_AGENT_ID = 0;
    public static final int MAX_LENGTH_AGENT_ID = 100;
    public static final int MIN_LENGTH_MERCHANT_ID = 0;
    public static final int MAX_LENGTH_MERCHANT_ID = 88;
    public static final int MIN_LENGTH_PASSWORD = 5;
    public static final int MAX_LENGTH_PASSWORD = 32;
    public static final int MIN_LENGTH_MSISDN = 0;
    public static final int MAX_LENGTH_MSISDN = 100;
    public static final int MIN_LENGTH_AMOUNT = 0;
    public static final int MAX_LENGTH_AMOUNT = 12;
    public static final int MIN_LENGTH_EMAIL = 0;
    public static final int MAX_LENGTH_EMAIL = 50;
    public static final int MIN_LENGTH_AGENT_FIRST_NAME = 0;
    public static final int MAX_LENGTH_AGENT_FIRST_NAME = 40;
    public static final int MIN_LENGTH_AGENT_TEMPLATE_NAME = 0;
    public static final int MAX_LENGTH_AGENT_TEMPLATE_NAME = 40;
    public static final int MIN_LENGTH_AGENT_LAST_NAME = 0;
    public static final int MAX_LENGTH_AGENT_LAST_NAME = 40;
    public static final int MIN_LENGTH_AGENT_COMPANY = 0;
    public static final int MAX_LENGTH_AGENT_COMPANY = 40;
    public static final int MIN_LENGTH_AGENT_POSITION = 0;
    public static final int MAX_LENGTH_AGENT_POSITION = 30;
    public static final int MIN_LENGTH_AGENT_USERNAME = 0;
    public static final int MAX_LENGTH_AGENT_USERNAME = 88;
    public static final int MIN_LENGTH_ORDER_ID = 0;
    public static final int MAX_LENGTH_ORDER_ID = 30;
    public static final int MIN_LENGTH_ZIP = 1;
    public static final int MAX_LENGTH_ZIP = 10;
    public static final int MIN_LENGTH_STREET1 = 0;
    public static final int MAX_LENGTH_STREET1 = 60;
    public static final int MIN_LENGTH_HOUSE_NUMBER = 0;
    public static final int MAX_LENGTH_HOUSE_NUMBER = 20;
    public static final int MIN_LENGTH_CITY = 0;
    public static final int MAX_LENGTH_CITY = 40;
    public static final int MIN_LENGTH_STATE = 0;
    public static final int MAX_LENGTH_STATE = 30;
    public static final int MIN_LENGTH_SEC_ANSWER = 0;
    public static final int MAX_LENGTH_SEC_ANSWER = 60;
    public static final int MAX_CONTACT_LIST_SIZE = 100;
    public static final int MIN_LENGTH_SVA = 10;
    public static final int MIN_M_PIN = 4;
    public static final int MIN_LENGTH_OTP = 4;


    public static final Integer STATUS_CODE_FAIL = 10207;

    public static final String CUSTOM_REGEX_NUMERIC = "^[0-9]+$";

    public static final long MIN_P2P_AMOUNT = 100;
    public static final long MAX_P2P_AMOUNT = 300000;

    public static final String CUSTOMER_TYPE = "Customer";
    public static final int ERROR_EXTERNAL_TXN_SUCCESS = 12000;
    public static final Integer MODULE_ID_BULK_ACCOUNT_CLOSURE = 34;
    public static final Integer MODULE_ID_BULK_ACCOUNT_SUSPENSION = 35;
    public static final Integer BULK_REC_STATUS_INITIATED = 4;
    public static final String RESOURCE_BUNDLE_KAFALA_TYPE = "kafalaType";
    public static final String RESOURCE_BUNDLE_KAFALA_INST_AMT = "kafalaInstAmt";
    public static final String RESOURCE_BUNDLE_REPAYMENT_MONTHS = "repaymentMonths";
    public static final String RESOURCE_BUNDLE_GET_NOK_IDENTITY_TYPE = "nokIdentityType";
    public static final String RESOURCE_BUNDLE_PAYMENT_FREQ = "payment_freq";
    public static final String RESOURCE_BUNDLE_PLAN_AMOUNT = "planAmount";
    public static final String RESOURCE_BUNDLE_PLAN_NAME = "planName";

    public static final String PARAM_POLICY_NUMBER = "POLICY_NUMBER";
    public static final String FIND_KAFALAH_ENABLED = "FIND_KAFALAH_ENABLED";
    public static final String PARAM_STAN_FOR_KAF_POLICY_NUMBER_INQUIRY = "STAN_FOR_POLICY_NUMBER_INQUIRY";
    public static final String PARAM_STAN_FOR_KAF_REGISTRATION = "STAN_FOR_KAF_REGISTRATION";
    public static final long LONG_ZERO = 0;
    public static final String RESOURCE_BUNDLE_CUSTOMER_RELATION = "customerRelation";
    public static final String RESOURCE_BUNDLE_NOK_RELATION = "kinRelation";
    public static final String RESOURCE_BUNDLE_DESIGN_SELL_OFFICER = "designOfSellOff";
    public static final Integer MODULE_ID_CUSTOMER_EDIT_DEBIT_BLOCK = 45;

    public static String FILE_UPLOAD_PATH = "uploadPath";
    public static String FILE_UPLOAD_IP = "fileUploadIP";
    public static String FILE_UPLOAD_USER = "fileUploadUser";
    public static String FILE_UPLOAD_Password = "fileUploadPassword";
    public static final String PRIV_UI_BP_BANK_USER_RETURN = "UI_BP_BANK_USER_RETURN";
    public static final String PRIV_UI_BP_BACK_OFFICE_USER_RETURN = "UI_BP_BACK_OFFICE_USER_RETURN";

    public static final int MODULE_ID_TRANSACTION_REVERSAL = 22;
    public static final int MODULE_ID_RECEIVER_CNIC_UPDATE = 36;


    // regular expressions
    public static final String REGEX_CNIC_ALPHANUMERIC = "^(?=.*[a-zA-Z1-9])[a-zA-Z0-9]{5}(-){1}[0-9+]{7}(-){1}[0-9]{1}$";
    // public static final String CUSTOM_REGEX_MSISDN = "^[0](?=.*[1-9])[0-9]+$";
    public static final String CUSTOM_REGEX_MSISDN = "^03\\d{9}$";
    public static final String REGEX_MSISDN = "^(\\+){0,1}[0-9]+$";
    public static final String REGEX_AMOUNT = "^(([1-9][0-9]{0,2},([0-9]{3},)*[0-9]{3})([\\.][0-9]{0,2})?)|(0|[1-9][0-9]*([\\.][0-9]{0,2})?)|(0[\\.][0-9][1-9])|(0[\\.][0-9]0?)$";
    public static final String REGEX_FEE = "^([0-9]{1,2}([\\.][0-9]{0,2})?)$";
    public static final String REGEX_LOCALE = "^[A-Za-z][A-Za-z0-9_,+@\\-\\.=]*$";
    public static final String REGEX_LOCALE_VARIANT = "[a-z]{2}(?:_[A-Z]{2}(?:_[0-9]{4})?)?";
    public static final String REGEX_COUNTRY = "^[A-Za-z]{2}$";
    public static final String REGEX_LANGUAGE = "^[A-Za-z]{2}$";
    public static final String REGEX_PHONE_NUMBER = "^(\\+){0,1}[0-9]+$";
    public static final String REGEX_FILTER_MONTH = "^([1-9]|(1[0-2]))(\\-[1-2][0-9]{3})$";
    public static final String REGEX_DATE = "^[0-1]?[0-9]/[0-3]?[0-9]/([1-2][0-9]{3}|[0-9]{2})$";
    public static final String REGEX_EMAIL = "^[a-zA-Z][\\w\\.-]*[a-zA-Z0-9]@[a-zA-Z0-9][\\w\\.-]*[a-zA-Z0-9]\\.[a-zA-Z][a-zA-Z\\.]*[a-zA-Z]$";
    public static final String REGEX_EMAILS = "^([a-zA-Z][\\w\\.-]*[a-zA-Z0-9]@[a-zA-Z0-9][\\w\\.-]*[a-zA-Z0-9]\\.[a-zA-Z][a-zA-Z\\.]*[a-zA-Z]){0,1}(,[a-zA-Z][\\w\\.-]*[a-zA-Z0-9]@[a-zA-Z0-9][\\w\\.-]*[a-zA-Z0-9]\\.[a-zA-Z][a-zA-Z\\.]*[a-zA-Z])*$";
    public static final String REGEX_PHONE_NUMBERS = "^((\\+){0,1}[0-9]+){0,1}(,(\\+){0,1}[0-9]+)*$";
    public static final String REGEX_STREET1 = "^[-0-9a-zA-Z�-� .']*[-a-zA-Z�-� .]+[-0-9a-zA-Z�-� .']*$";
    public static final String REGEX_CITY = "^[-0-9a-zA-Z�-� .']*[-a-zA-Z�-� .]+[-0-9a-zA-Z�-� .']*$";
    public static final String REGEX_FIRSTNAME = "^[-0-9a-zA-Z�-� .']*[-a-zA-Z�-� .]+[-0-9a-zA-Z�-� .']*$";
    public static final String REGEX_AMOUNT_12_0 = "^[0-9]{1,12}$";
    public static final String REGEX_AMOUNT_12_6 = "^[0-9]{0,12}+([\\.][0-9][0-9]?[0-9]?[0-9]?[0-9]?[0-9]?)?$";
    public static final String REGEX_AMOUNT_16_2 = "^[0-9]{0,16}+([\\.][0-9][0-9]?)?$";
    public static final String REGEX_AMOUNT_16_2_NEG = "^(-)?[0-9]{0,16}+([\\.][0-9][0-9]?)?$";
    public static final String REGEX_AMOUNT_18_0 = "^[0-9]{0,18}$";
    public static final String REGEX_ACC_NUMBER = "^[a-zA-Z0-9]*$";

    public static final String REGEX_STATE = "^$|^[-0-9a-zA-Z�-� .']*$";
    public static final String REGEX_ZIP = "^$|^[-0-9a-zA-Z�-� .']*$";
    public static final String REGEX_USERNAME = "^$|^[-0-9a-zA-Z�-� .']*$";
    public static final String REGEX_SECURITY_ANSWER = "^$|^[-0-9a-zA-Z�-� .']*$";
    public static final String REGEX_TXN_TEXT = "^$|^[-0-9a-zA-Z�-� .']*$";
    public static final String REGEX_ORDERID = "^$|^[-0-9a-zA-Z�-� .']*$";
    public static final String REGEX_FRIEND_NICKNAME = "^$|^[-0-9a-zA-Z�-� .']*$";
    public static final String REGEX_STREET2 = "^$|^[-0-9a-zA-Z�-� .']*$";
    public static final String REGEX_CARD_NICKNAME = "^$|^[-0-9a-zA-Z�-� .']*$";
    public static final String REGEX_CARD_HOLDERNAME = "^$|^[-0-9a-zA-Z�-� .']*$";
    public static final String REGEX_BANK_NICKNAME = "^$|^[-0-9a-zA-Z�-� .']*$";
    public static final String REGEX_BANK_CODE = "^$|^[-0-9a-zA-Z�-� .']*$";
    public static final String REGEX_BRANCH_CODE = "^$|^[-0-9a-zA-Z�-� .']*$";
    public static final String REGEX_BANK_HOLDERNAME = "^$|^[-0-9a-zA-Z�-� .']*$";
    public static final String REGEX_BILL_NAME = "^$|^[-0-9a-zA-Z�-� .']*$";
    public static final String REGEX_TEMPLATE = "^$|^[-0-9a-zA-Z�-� .']*$";
    public static final String REGEX_COMPANY = "^$|^[-0-9a-zA-Z�-� .']*$";
    public static final String REGEX_POSITION = "^$|^[-0-9a-zA-Z�-� .']*$";
    public static final String REGEX_HOUSENO = "^$|^[-0-9a-zA-Z�-� .']*$";
    public static final String REGEX_TITLE = "^$|^[-0-9a-zA-Z�-� .']*$";
    public static final String REGEX_ID_NO = "^$|^[-0-9a-zA-Z�-� .']*$";
    public static final String REGEX_MSVA = "^[1-9][0-9]*$";


    public static final String DEFAULT_SERVICE_PACKAGE_ID = "444";
    public static final String DEFAULT_COUNTRY_CODE = "49";
    public static final String DEFAULT_COUNTRY_ID = "DE";
    public static final String DEFAULT_LANGUAGE = "en";
    public static final String DEFAULT_ORGUNIT = "0000";
    public static final int SIMILAR_NAMES_MAX_ERRORS = 2;
    public static final float SIMILAR_NAMES_MIN_PERCENTAGE = 0.75f;
    public static final int TXN_MAX_TXN_TO_FETCH = 1000;

    public static final int IDENT_TYPE_MSISDN = 0;
    public static final int IDENT_TYPE_USERNAME = 5;
    public static final int IDENT_TYPE_CUST_ID = 1;
    public static final int IDENT_TYPE_EMAIL = 7;
    public static final int IDENT_TYPE_FAX = 8;
    public static final int IDENT_TYPE_SVA = 8;
    public static final int PI_TYPE_DEFAULT_SVA = 0;
    public static final int PI_CLASS_EXTERNAL_ACCOUNT = 0;
    public static final int PI_TYPE_INTERNAL_VOUCHER = 60;
    public static final long PI_TYPE_SYSTEM_SVA = 0;
    public static final int PI_TYPE_BANK_ACCOUNT = 40;

    public static final int CREDENTIAL_STATUS = 0;
    public static final int ROLE_MONEY_MERCHANT_AGENT = 8;
    public static final int CONSUMER_IDTYPE = 2;
    public static final int IDTYPE_ADMINISTRATOR = 12;
    public static final int IDTYPE_AGENT = 0;
    public static final int IDTYPE_MERCHANT_AGENT = 8;
    public static final int IDTYPE_MERCHANT_DEALER = 11;

    public static final int ADDRESS_TYPE_POSTAL_DELIVERY = 0;

    public static final int ATT_TYPE_SCANNED_REGISTRATION = 2;

    public static final int CUSTOMER_ROLE_HEADQUARTER = 10;
    public static final int CUSTOMER_ROLE_MONEY_MERCHANT = 3;
    public static final int CUSTOMER_ROLE_MONEY_MERCHANT_AGENT = 8;
    public static final int CUSTOMER_ROLE_MONEY_MERCHANT_DEALER = 11;

    public static final int ORDER_CHANNEL_WEB = 0;

    public static final int USE_CASE_CNIC_TO_WALLET = 155;
    public static final int USE_CASE_OTC_RECEIVE_MONEY = 105;
    public static final int USE_CASE_WALLET_TO_CNIC_RECEIVE_MONEY = 158;
    public static final int USE_CASE_CASH_IN = 151;
    public static final int USE_CASE_IBFT = 151;
    public static final int USE_CASE_OTC_IBFT = 104;
    public static final int USE_CASE_P2P_TRANSFER = 109;
    public static final int USE_CASE_CASH_OUT = 152;
    public static final int USE_CASE_CREDIT_SVA = 180;
    public static final int USE_CASE_DEBIT_SVA = 181;
    public static final int USE_CASE_AIRTIME_TOPUP = 173;
    public static final int USE_CASE_MONEY_TRANSFER = 179;
    public static final int USE_CASE_PICK_UP = 175;
    public static final int MAX_RECORD_FETCH_REPORT = 500;
    public static final int USE_CASE_TOPUP = 181;
    public static final int USE_CASE_SENDMONEY_BANK = 161;
    public static final int USE_CASE_CHECKOUT = 199;
    public static final int USE_CASE_BULK_RECEIVE_MONEY = 303;
    public static final int USE_CASE_IR_PULL_WALLET = 171;
    public static final int USE_CASE_IR_PULL_OTC = 172;
    public static final int USE_CASE_GL_TO_SVA = 307;

    public static final int KYC_LEVEL_0 = 0;
    public static final int KYC_LEVEL_1 = 1;
    public static final int KYC_LEVEL_2 = 2;
    public static final int KYC_LEVEL_3 = 3;
    public static final int KYC_LEVEL_4 = 4;
    public static final int KYC_LEVEL_5 = 5;
    public static final int KYC_LEVEL_6 = 6;
    public static final int KYC_LEVEL_7 = 7;

    // bank list
    public static final String BANK_LIST = "13=Allied Bank Corporation;14=Asia United Bank;15=Banco Filipino;16=Banco San Juan;17=Centennial Savings Bank;18=China Banking Corporation;19=Chinatrust Bank;20=Citibank;21=Citibank Savings;22=Citystate Savings Bank;23=East West Bank;24=Export Industry;25=Malayan Bank;28=Metropolitan Bank and Trust Company;29=Opportunity Microfinance Bank;30=PBCom;52=Philtrust Bank;33=Postal Bank;34=Philippine Savings Bank;35=Rizal Commercial Banking Corporation;36=RCBC Savings Bank;37=Real Bank;39=Standard Chartered Bank;41=World Partners Bank;45=Quezon Capital Rural Bank;46=Sterling Bank;47=Allied Savings Bank;48=Green Bank;49=Philippine Business Bank;50=Robinsons Bank;51=Tong Yang Bank;55=Security Bank;56=Metro Bank;90=Philippine National Bank";
    // TODO move the GCash bank list to preferences
    public static final String MODULE_REMIT_MONEY = "REMIT MONEY";
    public static final String MODULE_AIRTIME_TOPUP = "airTimeTopup";
    public static final long PI_TYPE_GCASH_WALLET = 76;
    public static final long PI_TYPE_GCASH_BANK_ACCOUNT = 79;
    public static final int USE_CASE_REMIT_MONEY_TO_WALLET = 7001;
    public static final int USE_CASE_REMIT_MONEY_TO_BANK = 7002;
    public static final int EXTERNAL_ACCOUNT_CLASS_FILTER = 7;

    // Privileges associated with merchant portal
    public static final String PRIV_MERCHANT_LOGIN = "UI_DPP_LOGIN";
    public static final String PRIV_WALLET_SERVICES = "UI_DPP_WALLET_SERVICES";
    public static final String PRIV_MERCHANT_TXN_HISTORY = "UI_DPP_TXN_HISTORY";
    public static final String PRIV_DPP_REPORTS = "UI_DPP_REPORTS";
    public static final String PRIV_TXN_CANCEL = "UI_DPP_TXN_CANCEL";
    public static final String PRIV_MANAGE_AGENTS = "UI_DPP_MANAGE_AGENTS";
    public static final String PRIV_VIEW_PAYMENT_INSTRUMENTS = "UI_DPP_VIEW_PIS";
    public static final String PRIV_PASSWORD_RECOVERY = "UI_DPP_PW_RECOVERY";
    public static final String PRIV_ATTACHMENT = "UI_DPP_ATTACHMENT";
    public static final String PRIV_DPP_AGENT_CANCEL = "UI_DPP_CANCEL_AGENT";

    // system level privileges
    public static final String PRIV_VIEW_DESCENDANTS = "VIEW_DESCENDANTS";
    public static final String PRIV_CREATE_DESCENDANTS = "CREATE_DESCENDANTS";
    public static final String PRIV_MAINTAIN_DESCENDANTS = "MAINTAIN_DESCENDANTS";

    // Privileges associated with merchant portal
    public static final String PRIV_ACTIVATE_DESCENDANTS = "UI_DPP_ACTIVATE_L2PLUS_DESCENDANTS";
    public static final String PRIV_VIEW_COMMISSION_MGMT = "UI_DPP_VIEW_COMMISSION_MGMT";
    public static final String PRIV_EDIT_COMMISSION_MGMT = "UI_DPP_EDIT_COMMISSION_MGMT";
    public static final String PRIV_SETTLE_COMMISSION = "UI_DPP_SETTLE_COMMISSIONS";

    // Privileges associated with consumer portal
    public static final String PRIV_CONSUMER_LOGIN = "UI_SELFCARE_LOGIN";
    public static final String PRIV_CONSUMER_TXN_HISTORY = "UI_SELFCARE_TXN_HISTORY";
    public static final String PRIV_MANAGE_ACCOUNTS = "UI_SELFCARE_MANAGE_ACCOUNTS";
    public static final String PRIV_SEND_MONEY = "UI_SELFCARE_SEND_MONEY";
    public static final String PRIV_SEND_MONEY_BANK = "UI_SELFCARE_SEND_MONEY_BANK";
    public static final String PRIV_REQUEST_MONEY = "UI_SELFCARE_REQUEST_MONEY";
    public static final String PRIV_AIRTIME_TOPUP = "UI_SELFCARE_AIRTIME_TOPUP";
    public static final String PRIV_FRIENDS_LIST = "UI_SELFCARE_FRIENDS_LIST";
    public static final String PRIV_BANK_ACCOUNT_LIST = "UI_SELFCARE_BANK_ACCOUNT_LIST";
    public static final String PRIV_CHANGE_PASSWORD = "UI_SELFCARE_CHANGE_PASSWORD";
    public static final String PRIV_CHANGE_ADDRESS = "UI_SELFCARE_CHANGE_ADDRESS";
    public static final String PRIV_CHANGE_PREFERENCES = "UI_SELFCARE_CHANGE_PREFERENCES";
    public static final String PRIV_CHANGE_SECQANDA = "UI_SELFCARE_CHANGE_SECQANDA";
    public static final String PRIV_CHANGE_PIN = "UI_SELFCARE_CHANGE_PIN";
    public static final String PRIV_SHOW_HISTORY = "UI_SELFCARE_SHOW_HISTORY";
    public static final String PRIV_MERCHANT_TRANSACTION = "UI_DPP_MERCHANT_TXNS";
    public static final String PRIV_MERCHANT_REMITTANCE = "UI_DPP_MERCHANT_REMITTANCE";
    public static final String PRIV_BILL_PAYMENT = "UI_SELFCARE_BILL_PAYMENT";
    public static final String PRIV_CONTACT_POINT = "UI_SELFCARE_CONTACT_POINT";
    public static final String PRIV_SHOW_ALERT = "UI_SELFCARE_SHOW_ALERT";
    public static final String PRIV_SHOW_MBANKING_ALERT = "UI_SELFCARE_MBANKING_ALERT";
    public static final String PRIV_SHOW_GL_ACCOUNT_PAGE = "UI_SHOW_GL_ACCOUNT_PAGE";

    // Custom Agent Portal
    public static final String PRIV_AGENT_PORTAL_LOGIN = "UI_AP_LOGIN";

    // Privileges associated with CST
    public static final String PRIV_CST_LOGIN = "UI_CST_LOGIN";
    public static final String PRIV_CRED_CHANGE = "UI_CST_CRED_CHANGE";
    public static final String PRIV_WILDCARDS = "CUSTOMER_WILDCARD_SEARCH";
    public static final String PRIV_CUST_READ = "UI_CST_CUSTOMER_READ";
    public static final String PRIV_CUST_WRITE = "UI_CST_CUSTOMER_WRITE";
    public static final String PRIV_CUST_PINCALL = "UI_CST_CUSTOMER_PINCALL";
    public static final String PRIV_CUST_PASSWORD = "UI_CST_CUSTOMER_RESETPASSWORD";
    public static final String PRIV_CUST_BLACKLIST = "UI_CST_CUSTOMER_BLACKLIST";
    public static final String PRIV_CUST_CANCEL = "UI_CST_CUSTOMER_CANCEL";
    public static final String PRIV_TXN_READ = "UI_CST_TRANSACTION_READ";
    public static final String PRIV_AGENT_TXN_READ = "UI_CST_AGENT_TXN_READ";
    public static final String PRIV_NOTE_READ = "UI_CST_NOTE_READ";
    public static final String PRIV_SMS_TRAFFIC = "UI_CST_SMS_TRAFFIC";
    public static final String PRIV_SVA_CREDIT = "UI_CST_CREDIT_CUSTOMER_SVA";
    public static final String PRIV_SVA_DEBIT = "UI_CST_DEBIT_CUSTOMER_SVA";
    public static final String PRIV_FOREX_READ = "UI_CST_FOREX_READ";
    public static final String PRIV_FOREX_WRITE = "UI_CST_FOREX_WRITE";
    public static final String PRIV_FEE_CONFIGURATION = "UI_CST_FEE_CONFIGURATION";
    public static final String PRIV_EDIT_RESTRICTIONS = "UI_CST_EDIT_RESTRICTIONS";
    public static final String PRIV_READ_INVOICE = "UI_CST_READ_INVOICE";
    public static final String PRIV_WRITE_INVOICE = "UI_CST_WRITE_INVOICE";
    public static final String PRIV_CREATE_CUSTOMER = "UI_CST_CREATE_CUSTOMER";
    public static final String PRIV_BALANCE_ALERT = "UI_CST_CUSTOMER_BALANCE_ALERT";
    public static final String PRIV_CST_REPORTS = "UI_CST_REPORTS";
    public static final String PRIV_CST_LIMITS = "UI_CST_LIMITS";
    public static final String PRIV_CST_AUDIT_LOGS = "UI_CST_AUDIT_LOGS";
    public static final String PRIV_CST_MBANKING = "CST_MBANKING";
    public static final String PRIV_FIND_PENDING_APPROVALS = "UI_CST_FIND_PENDING_APPROVALS";
    public static final String PRIV_APPROVE_PENDING_CUSTOMER = "UI_CST_APPROVE_PENDING_CUSTOMER";
    public static final String PRIV_APPROVE_PENDING_WALLET = "UI_CST_APPROVE_PENDING_WALLET";
    public static final String PRIV_APPROVE_PENDING_TRANSACTION = "UI_CST_APPROVE_PENDING_TRANSACTION";
    public static final String PRIV_CST_GLOBAL_CONFIG = "UI_CST_GLOBAL_CONFIG";
    public static final String PRIV_CST_BULK_PROCESSING = "UI_CST_BULK_PROCESSING";
    public static final String PRIV_CST_BULK_UPLOAD = "UI_CST_BULK_UPLOAD";
    public static final String PRIV_CST_BULK_CONFIRM = "UI_CST_BULK_CONFIRM";
    public static final String PRIV_CST_BULK_HISTORY = "UI_CST_BULK_HISTORY";
    public static final String PRIV_CST_UMGR = "UI_CST_UMGR";
    public static final String PRIV_CST_UMGR_CREATE_ROLE = "UI_CST_UMGR_CREATE_ROLE";
    public static final String PRIV_CST_UMGR_EDIT_ROLE = "UI_CST_UMGR_EDIT_ROLE";
    public static final String PRIV_CST_UMGR_CREATE_PRIVILEGE = "UI_CST_UMGR_CREATE_PRIVILEGE";
    public static final String PRIV_CST_UMGR_EDIT_PRIVILEGE = "UI_CST_UMGR_EDIT_PRIVILEGE";
    public static final String PRIV_CST_PRIVILEGES = "UI_CST_PRIVILEGES";
    public static final String PRIV_CST_PRIVILEGES_CUSTOMER = "UI_CST_PRIVILEGES_CUSTOMER";
    public static final String PRIV_CST_PRIVILEGES_TXN = "UI_CST_PRIVILEGES_TXN";
    public static final String PRIV_CST_PRIVILEGES_WALLET = "UI_CST_PRIVILEGES_WALLET";
    public static final String PRIV_CST_PRIVILEGES_FILETYPE = "UI_CST_PRIVILEGES_FILETYPE";
    public static final String PRIV_CST_COUPON = "UI_CST_COUPON";
    public static final String PRIV_CST_CONFIGURATION = "UI_CST_CONFIGURATION";
    public static final String PRIV_CST_REGISTER_CUSTOMER = "UI_CST_REGISTER_CUSTOMER";
    public static final String PRIV_CST_BILL_PAYMENT = "UI_CST_BILL_PAYMENT";
    public static final String PRIV_CST_CREATE_TNC = "UI_CST_CREATE_TNC";
    public static final String PRIV_CST_VIEW_TNC = "UI_CST_VIEW_TNC";
    public static final String PRIV_CST_UPDATE_TNC = "UI_CST_UPDATE_TNC";
    public static final String PRIV_CST_DELETE_TNC = "UI_CST_DELETE_TNC";
    public static final String PRIV_CST_CREATE_SERVICE_PACKAGE = "UI_CST_CREATE_SERVICE_PACKAGE";
    public static final String PRIV_CST_VIEW_SERVICE_PACKAGE = "UI_CST_VIEW_SERVICE_PACKAGE";
    public static final String PRIV_CST_UPDATE_SERVICE_PACKAGE = "UI_CST_UPDATE_SERVICE_PACKAGE";
    public static final String PRIV_CST_DELETE_SERVICE_PACKAGE = "UI_CST_DELETE_SERVICE_PACKAGE";
    public static final String PRIV_CST_SHOW_CONTACTS = "UI_CST_SHOW_CONTACTS";

    // Privileges associted with coupon administration
    public static final String PRIV_VIEW_COUPON_TYPES = "UI_CST_VIEW_COUPON_TYPES";
    public static final String PRIV_SEARCH_COUPON = "UI_CST_SEARCH_COUPON";
    public static final String PRIV_VIEW_CPN_CATEGORY = "UI_CST_VIEW_CPN_CATEGORY";
    public static final String PRIV_CPN_CTAEGORY_DESCRIPTION = "UI_CPN_CTAEGORY_DESCRIPTION";
    public static final String PRIV_CPN_DESCRIPTION = "UI_CST_CPN_DESCRIPTION";
    public static final String PRIV_CPN_TAG = "UI_CST_CPN_TAG";
    public static final String PRIV_CPN_CATEGORY = "UI_CST_CPN_CATEGORY";
    public static final String PRIV_CPN_GENERATE_BATCH = "UI_CST_CPN_GENERATE_BATCH";
    public static final String PRIV_CPN_BATCH = "UI_CST_CPN_BATCH";
    public static final String PRIV_CPN_LOCATION = "UI_CST_CPN_LOCATION";
    public static final String PRIV_CPN_ASSIGN = "UI_CST_CPN_ASSIGN";
    public static final String PRIV_CREATE_CPN_TYPE = "UI_CST_CREATE_CPN_TYPE";
    public static final String PRIV_EDIT_CPN_TYPE = "UI_CST_EDIT_CPN_TYPE";
    public static final String PRIV_UPLOAD_CPN_BATCH = "UI_CST_UPLOAD_CPN_BATCH";
    public static final String PRIV_EDIT_COUPON = "UI_CST_EDIT_COUPON";
    public static final String PRIV_ACTIVATE_CPN_BATCH = "UI_CST_ACTIVATE_CPN_BATCH";

    // Privileges associated with Configuration Manager
    public static final String PRIV_UMGR_FIND_AGENT = "UI_CST_FIND_AGENT";
    public static final String PRIV_UMGR_EDIT_AGENT = "UI_CST_EDIT_AGENT";
    public static final String PRIV_UMGR_CREATE_AGENT = "UI_CST_CREATE_AGENT";
    public static final String PRIV_NMGR_READ = "UI_CST_NOTIFMGR_READ";
    public static final String PRIV_NMGR_WRITE = "UI_CST_NOTIFMGR_WRITE";

    // Privileges associated with dashboard
    public static final String PRIV_DASHBOARD_LOGIN = "UI_DASHBOARD_LOGIN";
    public static final String PRIV_DASHBOARD_PREFS = "UI_DASHBOARD_PREFS";
    public static final String PRIV_DASHBOARD_JOBS = "UI_DASHBOARD_JOBS";
    public static final String PRIV_DASHBOARD_SERVERS = "UI_DASHBOARD_SERVERS";
    public static final String PRIV_DASHBOARD_TRACKERS = "UI_DASHBOARD_TRACKERS";
    public static final String PRIV_DASHBOARD_CREATE_JOB = "UI_DASHBOARD_CREATE_JOB";

    // Privileges associated with System Manager
    public static final String PRIV_SYSTEM_LOGIN = "UI_SYSTEM_LOGIN";

    public static final String PRIV_OTC_SEND_MONEY = "UI_AP_OTC_SEND_MONEY";

    public static final int PENDING_REG_MERCHANT_BLACKLSTREASON = 5;
    public static final int DEFAULT_MERCHANT_BLACKLSTREASON = 0;
    public static final int CUSTOMER_NOT_CACELLED = 0;

    public static final String PRIV_REGEX_VIEW_CHILDREN_LEVEL = "VIEW_CHILDREN_L(\\d*)";
    public static final String PRIV_REGEX_CREATE_CHILDREN_LEVEL = "CREATE_CHILDREN_L(\\d*)";
    public static final String PRIV_REGEX_MAINTAIN_CHILDREN_LEVEL = "MAINTAIN_CHILDREN_L(\\d*)";
    public static final String PRIV_REGEX_ALLOWED_ROLES = "CHILD_CT_(\\d*)";
    public static final String PRIV_CUSTOMER_BLACKLIST = "UI_DPP_BLACKLIST_AGENT";
    public static final String PRIV_CREATE_ACTIVE_DESCENDANTS = "UI_DPP_CREATE_ACTIVE_DESCENDANTS";

    public static final String PRIV_BLACKLIST = "UI_BP_BLACKLIST";

    private static final String PRE_PRIV_ROLE = "ROLE_";
    public static final String PRIV_ROLE_AGENT = PRE_PRIV_ROLE + "AGENT";
    public static final String PRIV_ROLE_TOPUP_MERCHANT = PRE_PRIV_ROLE + "TOPUP_MERCHANT";
    public static final String PRIV_ROLE_MONEY_CONSUMER = PRE_PRIV_ROLE + "MONEY_CONSUMER";
    public static final String PRIV_ROLE_MONEY_MERCHANT = PRE_PRIV_ROLE + "MONEY_MERCHANT";
    public static final String PRIV_ROLE_TOPUP_AGENT = PRE_PRIV_ROLE + "TOPUP_AGENT";
    public static final String PRIV_ROLE_TOPUP_ISSUER = PRE_PRIV_ROLE + "TOPUP_ISSUER";
    public static final String PRIV_ROLE_MONEY_VOUCHER_ISSUER = PRE_PRIV_ROLE + "MONEY_VOUCHER_ISSUER";
    public static final String PRIV_ROLE_MONEY_MERCHANT_AGENT = PRE_PRIV_ROLE + "MONEY_MERCHANT_AGENT";
    public static final String PRIV_ROLE_MONEY_BENEFICIARY = PRE_PRIV_ROLE + "MONEY_BENEFICIARY";
    public static final String PRIV_ROLE_MONEY_HEADQUARTER = PRE_PRIV_ROLE + "MONEY_HEADQUARTER";
    public static final String PRIV_ROLE_MONEY_DEALER = PRE_PRIV_ROLE + "MONEY_DEALER";
    public static final String CAN_HAVE_BANK_ACCOUNT_PRIV = "UI_CST_CAN_HAVE_BANK_ACCOUNT";
    public static final String CAN_HAVE_CREDIT_CARD_PRIV = "UI_CST_CAN_HAVE_CREDIT_CARD";
    public static final String PRIV_KYC_LEVEL_UPGRADE_PREFIX = "UPGRADE_KYC_LEVEL_";
    public static final String PRIV_AUTO_CREATE_SVA = "AUTO_CREATE_SVA";
    public static final String PRIV_AUTO_INHERIT_PIS = "UI_DPP_AUTO_INHERIT_PIS";

    public static final String PRIV_UI_GPI_LIMIT_REV = "UI_GPI_LIMIT_REV";

    public static final String PASSWORD_RECOVERY_PRIV = "UI_SELFCARE_PASSWORD_RECOVERY";

    public static final String RESOURCE_BUNDLE_BANKNAME_LOOKUP = "bankName";
    public static final String RESOURCE_BUNDLE_IBFT_BANKNAME_LOOKUP = "ibftBankName";
    public static final String RESOURCE_BUNDLE_COUNTIRES = "countries";
    public static final String RESOURCE_BUNDLE_CUSTOM_COUNTIRES = "customCountries";
    public static final String RESOURCE_BUNDLE_MOBILE_NETWORK = "mobileNetwork";
    public static final String RESOURCE_BUNDLE_TRANSFER_TYPES = "transferType";
    public static final String RESOURCE_BUNDLE_TXN_TYPE_GROUP = "txnTypeGroup";
    public static final String RESOURCE_BUNDLE_LANGUAGES = "languages";
    public static final String RESOURCE_BUNDLE_AUDIT_CATEGORIES = "auditcategory";
    public static final String RESOURCE_BUNDLE_TIMEZONES = "timezones";
    public static final String RESOURCE_BUNDLE_NETWORK_PROVIDERS = "networkproviders";
    public static final String RESOURCE_BUNDLE_REMITTANCE_ACC = "remittanceAccountTypes";
    public static final String RESOURCE_BUNDLE_REMITTANCE_PURPOSE = "remittancePurposeTypes";
    public static final String RESOURCE_BUNDLE_ORG_UNITS = "orgUnits";
    public static final String RESOURCE_BUNDLE_PI_TYPES = "pitypes";
    public static final String RESOURCE_BUNDLE_USE_CASES = "usecases";
    public static final String RESOURCE_BUNDLE_LIMIT_USE_CASES = "limitUsecases";
    public static final String RESOURCE_BUNDLE_LIMIT_CLASSES = "limitClasses";
    public static final String RESOURCE_BUNDLE_FILE_TYPES = "filetypes";
    public static final String RESOURCE_BUNDLE_CUSTOM_USE_CASES = "customUseCases";
    public static final String RESOURCE_BUNDLE_PPCBL_BANK_USE_CASES = "PPCBLBankUseCases";
    public static final String RESOURCE_BUNDLE_COMMISSION_DEDUCTION = "commissiondeduction";
    public static final String RESOURCE_BUNDLE_FEE_SETS = "feeSets";
    public static final String RESOURCE_BUNDLE_EXPIRY_MONTH = "monthExpiry";
    public static final String RESOURCE_BUNDLE_CURRENCIES = "currencies";
    public static final String RESOURCE_BUNDLE_IDENTIFICATION_TYPE = "identificationType";
    public static final String RESOURCE_BUNDLE_GL_CATEGORY = "getGlCategory";

    public static final String RESOURCE_BUNDLE_SUB_TXN_TYPES = "subTxnTypes";
    public static final String RESOURCE_BUNDLE_ERROR_CODES = "errorCode";
    public static final String RESOURCE_BUNDLE_KYCLEVELS = "kyclevel";
    public static final String RESOURCE_BUNDLE_BLOCKED_STATUS = "blockedStatus";
    public static final String RESOURCE_BUNDLE_CUSTOMER_HISTORY = "historyList";
    public static final String RESOURCE_BUNDLE_SEC_QUESTIONS = "securityQuestions";
    public static final String RESOURCE_BUNDLE_SUPPORTED_MIME_TYPES = "format";
    public static final String RESOURCE_BUNDLE_SUPPORTED_LOCALE = "locale";
    public static final String RESOURCE_BUNDLE_CODE_TYPE = "codeType";
    public static final String RESOURCE_BUNDLE_PARENT_CATEGORIES = "parentcategories";
    public static final String RESOURCE_BUNDLE_SUPPORTED_ACTION = "action";
    public static final String RESOURCE_BUNDLE_INFO_MODE = "sendModes";
    public static final String RESOURCE_BUNDLE_RISK_CATEGORIES = "riskcategories";
    public static final String RESOURCE_BUNDLE_TEMPLATE_TYPE = "templateType";
    public static final String RESOURCE_BUNDLE_IDENTITYTYPES = "identityTypes";
    public static final String RESOURCE_BUNDLE_COUPON_STATUS = "couponStatus";
    public static final String RESOURCE_BUNDLE_UMGR_PRIV = "umgrPrivileges";
    public static final String RESOURCE_BUNDLE_SVGPKG_STATUS = "";
    public static final String RESOURCE_BUNDLE_BULK_FILE_TYPE = "bulkFileType";
    public static final String RESOURCE_BUNDLE_SERVICE_PACKAGE_PROVIDER = "svcpkgprovider";
    public static final String RESOURCE_BUNDLE_UMGR_ROLES = "umgrroles";
    public static final String RESOURCE_BUNDLE_TERMS_AND_CONDITIONS = "termsandconditions";
    public static final String RESOURCE_BUNDLE_GET_ALL_BANK_ACCOUNTS = "getallbankaccounttypes";

    public static final int ERR_UNKNOWN_PAYEE = 2501;
    public static final int ERR_NO_PAYEE_PI = 2503;
    public static final String RESOURCE_BUNDLE_CUSTOMER_TYPE = "customertypes";
    public static final String RESOURCE_BUNDLE_GENDER = "gender";
    public static final int LIMIT_CUSTOMER_TYPE = 1;
    public static final int LIMIT_LIMITSET_TYPE = 4;
    public static final String AIRTIME_TOPUP_SERVICE_REMITTANCE = "remittance";
    public static final String AIRTIME_TOPUP_SERVICE_AUTHORISE = "authorise";
    public static final String RESOURCE_BUNDLE_HISTORY_ENTRIES = "historyEntry";
    public static final String RESOURCE_BUNDLE_TRANSACTION_STATUS = "txnStatus";
    public static final String RESOURCE_BUNDLE_INVOICE_STATUS = "invoicestatus";
    public static final String RESOURCE_BUNDLE_NOTE_STATUS = "notestatus";
    public static final String RESOURCE_BUNDLE_NOTE_CATEGORY = "notecategories";
    public static final String RESOURCE_BUNDLE_CREDENTIAL_TYPE = "credentialType";
    public static final String RESOURCE_BUNDLE_CUSTOMERTYPE = "customerType";
    public static final String RESOURCE_BUNDLE_POLICY = "policy";

    public static final int MBANKING_CUSTOMER_TYPE = 102;

    // regular expressions
    public static final String REGEX_PIN = "^[0-9]\\d*$";

    // Payment instrument types
    public static final int PI_TYPE_DEFAULT_BA = 40;
    public static final int PI_TYPE_EXTERNAL_BA = 45;
    public static final int PI_TYPE_CST_EXTERNAL_ACC = 70;
    public static final int PI_TYPE_EXTERNAL_SEND_MONEYBANK = 46;
    public static final int PI_TYPE_DEFAULT_CR = 20;
    public static final int PI_TYPE_EXTERNAL_AIRTIME = 71;
    // some demo privileges
    public static final String PRIV_DEMO_1 = "DEMO 1";
    public static final String PRIV_DEMO_2 = "DEMO 2";

    public static final int CREDENTIAL_TYPE_PIN = 0;
    public static final int CREDENTIAL_TYPE_PASSWORD = 1;
    public static final int CREDENTIAL_TYPE_OTP = 2;
    public static final int CREDENTIAL_TYPE_OFFLINE_PIN = 3;

    public static final String STRING_CREDENTIAL_TYPE_PASSWORD = "password";
    public static final String STRING_CREDENTIAL_TYPE_PIN = "pin";
    public static final String STRING_CREDENTIAL_TYPE_OFFLINE_PIN = "offlinePin";

    public static final int OTP_TYPE = 10;
    public static final int OTP_TYPE_TRANSACTION = 20;

    public static final int USE_CASE_ADD_FUNDS_CONSUMER = 160;
    public static final int USE_CASE_WITHDRAW_FUNDS_CONSUMER = 161;
    public static final int USE_CASE_ADD_FUNDS_CST = 182;
    public static final int USE_CASE_WITHDRAW_FUNDS_CST = 183;
    public static final int USE_CASE_ADD_FUNDS_OFFLINE_SVA = 501;
    public static final int USE_CASE_WITHDRAW_FUNDS_OFFLINE_SVA = 502;

    public static final String MODULE_ADD_FUNDS = "addFunds";
    public static final String MODULE_WITHDRAW_FUNDS = "withdrawFunds";
    public static final String MODULE_SEND_MONEY = "sendMoney";
    public static final String MODULE_SEND_MONEY_BANK = "sendMoneyBank";
    public static final String MODULE_REQUEST_MONEY = "requestMoney";
    public static final String MODULE_TOPUP = "topup";
    public static final String MODULE_SEND_MONEY_FRIEND = "sendMoneyFriend";
    public static final List<Integer> CUSTOMER_ROLES_M2M = Arrays.asList(CUSTOMER_ROLE_MONEY_MERCHANT, CUSTOMER_ROLE_HEADQUARTER);
    public static final int INFO_MODE_NONE = 0;
    public static final int INFO_MODE_SMS = 1;
    public static final int INFO_MODE_EMAIL = 2;
    public static final int INFO_MODE_SMS_AND_EMAIL = 3;

    public static final int USE_CASE_SEND_MONEY = 104;
    public static final int USE_CASE_SEND_VOUCHER_UNKNOWN = 174;
    public static final int USE_CASE_REQUEST_MONEY = 194;
    public static final int PIS_TYPE_SVA = 0;
    public static final int PIS_CLASS_FILTER_SVA = 0;
    public static final int PIS_CLASS_FILTER_BANK_ACCOUNT = 4;
    public static final int PIS_CLASS_FILTER_CREDIT_CARD = 2;
    public static final int PIS_TYPE_FILTER_SVA = 0;

    public static final int CUSTOMER_NETWORK_TYPE_F_AND_F = 1;

    public static final int CUSTOMER_NETWORK_STATUS_APPROVED = 1;
    public static final String OPERATION_ADD = "add";
    public static final String OPERATION_EDIT = "edit";
    public static final String OPERATION = "operation";

    public static final String MAX_LENGTH_SEND_MONEY_TXN_TEXT = "80";
    public static final String TXN_FILTERTYPE_MONTH = "month";
    public static final String TXN_FILTERTYPE_TIMEFRAME = "timeframe";
    // Value for below constant has to be fetched from preference
    public static final String txnMaxNumberToFetch = "1000";
    public static final long txnCancelTimeBuffer = 600L;

    public static final String CSS_KEYWARD_CLASS = "class";

    public static final String CSS_STYLE_ALT = "alt";
    public static final String CSS_STYLE_ODD = "odd";
    public static final String CSS_STYLE_EVEN = "even";

    public static final String CSS_STYLE_FEE_TYPE = "feetype";

    public static final int DEFAULT_TYPE_ID_FOR_NEW_CUSTOMER = CONSUMER_IDTYPE;
    public static final int DEFAULT_TYPE_ID_FOR_NEW_CUSTOMER_DPP = 2;
    public static final int DEFAULT_TYPE_ID_FOR_INTERNAL_CUSTOMER = 0;
    public static final int DEFAULT_RISK_CAT_FOR_NEW_CUSTOMER = 0;
    public static final String SSO_SECRET = "NIy5TxKQBj4=";

    // Make best guest default here - really should be set in preferences
    public static final String DEFAULT_REPORT_SERVER_URL = "ReportViewer";
    public static final String DEFAULT_REPORT_PROXY_SERVER_URL = "http://localhost:8080/crystalrpt";
    public static final String DEFAULT_REPORT_PROXY_SERVER_PATH = "/ReportViewer";

    public static final int TXN_TIMEFRAME_ALL = 1;
    public static final int TXN_TIMEFRAME_LAST_THREE_MONTH = 2;
    public static final int TXN_TIMEFRAME_LAST_MONTH = 3;
    public static final int TXN_TIMEFRAME_LAST_TEN_DAYS = 4;
    public static final int TXN_TIMEFRAME_LAST_WEEK = 5;
    public static final int TXN_TIMEFRAME_LAST_TWO_DAYS = 6;

    public static final int TXN_STATUS_AUTHORISED = 20;
    public static final int TXN_STATUS_CAPTURED = 30;
    public static final int TXN_STATUS_AUTHCANCEL = 60;
    public static final int TXN_STATUS_CAPTURECANCEL = 70;
    public static final int TXN_STATUS_PENDING_APPROVAL = 15;
    public static final int TXN_STATUS_OTP_REQUIRED = 2521;
    public static final int TXN_STATUS_PIN_REQUIRED = 2522;
    public static final int TXN_STATUS_OTP_MAX_LIMIT = 2523;
    public static final int TXN_STATUS_FAIL_FINAL = 2524;
    public static final int TXN_STATUS_FAIL_INVALID = 1005;

    public static final Boolean TXN_OPTION_YES = true;
    public static final Boolean TXN_OPTION_NO = false;
    public static final Boolean AUDIT_OPTION_YES = true;
    public static final Boolean AUDIT_OPTION_NO = false;
    public static final Boolean ACTIVE_OPTION_YES = true;
    public static final Boolean ACTIVE_OPTION_NO = false;
    public static final Integer AIRTIMETOPUP_OPTION_SELF = 0;
    public static final Integer AIRTIMETOPUP_OPTION_OTHER = 1;
    public static final Boolean MATCH_OPTION_YES = true;
    public static final Boolean MATCH_OPTION_NO = false;
    public static final int MAX_ALLOWED_OTP_COUNT = 2;
    public static final int MAX_ALLOWED_OTP_RESEND_COUNT = 2;
    public static final int CANCELATION_REASON_OK = 0;
    public static final String TEMPLATE_TYPE_EMAIL_KEY = "email";
    public static final String TEMPLATE_TYPE_SMS_KEY = "sms";

    public static final String LESS_THAN_OPERATOR = "<";
    public static final String MORE_THAN_OPERATOR = ">";
    public static final String LESS_THAN_OPERATOR_STRING = "less";
    public static final String MORE_THAN_OPERATOR_STRING = "more";
    public static final String ANY_OPERATOR = "any";
    // invoice status
    public static final int INVOICE_STATUS_NEW = 0;
    public static final int INVOICE_STATUS_ACTIVE = 1;

    public static final String SERVICE_RETURNED_STATUS_SUCCESS = "Success";


    public static String DROP_DOWN_ALL_OPTION = "All";
    public static Integer DROP_DOWN_ALL_OPTION_INT = 9999;
    public static final int STANDARD_INV_GRP_TYPE = 0;
    public static final int TOPUP_CONSUMER_INV_GRP_TYPE = 2;
    public static final int TOPUP_DPP_INV_GRP_TYPE = 4;
    public static final int DEMAND_FORPAYMENT_INV_GRP_TYPE = 3;

    // use date entry formats that are not middle-endian or low-endian specific:
    // - this is the pattern used to parse the entry into a java Date
    public static String DATE_FORMAT_PATTERN_PARSE = "MMM-dd-yyyy";
    // - this is the pattern used by the jquery datepicker corresponding
    // to the format above
    public static String DATE_FORMAT_PATTERN_PICKER = "M-dd-yy";

    // origin for all mobiliser service requests
    public static String MOBILISER_REQUEST_ORIGIN = "mobiliser-web";

    public static String SEARCH_TYPE_CUSTOMER = "customer";
    public static String SEARCH_TYPE_AGENT = "agent";
    public static String SEARCH_TYPE_MERCHANT_AGENT = "magent";
    public static String SEARCH_TYPE_MERCHANT_DEALER = "dealer";

    public static String DISABLE_ALERTS_DURING_WEEKENDS = "6,7";

    public static String ALERT_FREQUENCY_EVERYTIME = "0";
    public static String ALERT_FREQUENCY_FIRSTTIME = "1";

    public static String ALL_ACCOUNT = "-1";
    public static String TRANSACTION_AMOUNT_TYPE_ANY = "any";

    public static long ACCOUNT_BALANCE_SUMMARY_ALERT = 1;
    public static long ACCOUNT_BALANCE_THRESHOLD_ALERT = 2;
    public static long BANK_INQUIRY_RESPONSE_ALERT = 3;
    public static long FAILED_ATTEMPT_LOCKOUT_ALERT = 4;
    public static long INSUFFICIENT_FUNDS_ALERT = 5;
    public static long INVALID_ACCOUNT_ACCESS_ALERT = 6;
    public static long PANIC_PAY_ALERT = 7;
    public static long PASSWORD_CHANGED_ALERT = 8;
    public static long TRANSACTION_NOTIFICATION_ALERT = 9;
    public static long UNREAD_BANK_MESSAGE_ALERT = 10;

    // TODO - delete these once references in cst are removed
    public static String ALERT_NOTIFICATION_MSG_TYPE_TEXT = "1";
    public static String ALERT_NOTIFICATION_MSG_TYPE_CONV = "2";
    public static long ALERT_NOTIF_MSG_TYPE_TEXT = 1L;
    public static long ALERT_NOTIF_MSG_TYPE_CONV = 2L;

    public static long ACCOUNT_BALANCE_SUMMARY_ALERT_NOTIFICATION_MSG_ID = 1;
    public static long ACCOUNT_BALANCE_THRESHOLD_ALERT_NOTIFICATION_MSG_ID = 2;
    public static long BANK_INQUIRY_RESPONSE_ALERT_NOTIFICATION_MSG_ID = 3;
    public static long FAILED_ATTEMPT_LOCKOUT_ALERT_NOTIFICATION_MSG_ID = 4;
    public static long INSUFFICIENT_FUNDS_ALERT_NOTIFICATION_MSG_ID_TEXT = 5;
    public static long INSUFFICIENT_FUNDS_ALERT_NOTIFICATION_MSG_ID_CONV = 6;
    public static long INVALID_ACCOUNT_ACCESS_ALERT_NOTIFICATION_MSG_ID_TEXT = 7;
    public static long INVALID_ACCOUNT_ACCESS_ALERT_NOTIFICATION_MSG_ID_CONV = 8;
    public static long PANIC_PAY_ALERT_NOTIFICATION_MSG_ID_TEXT = 9;
    public static long PANIC_PAY_ALERT_NOTIFICATION_MSG_ID_CONV = 10;
    public static long PASSWORD_CHANGED_ALERT_NOTIFICATION_MSG_ID = 11;
    public static long TRANSACTION_ALERT_NOTIFICATION_MSG_ID = 12;
    public static long UNREAD_BANK_MESSAGE_ALERT_NOTIFICATION_MSG_ID = 13;

    public static String ALERT_DATA_KEY_PI_ID = "customerPiId";
    public static String ALERT_DATA_KEY_MIN_AMOUNT = "customerMinAmount";
    public static String ALERT_DATA_KEY_MAX_AMOUNT = "customerMaxAmount";
    public static String ALERT_DATA_KEY_TXN_TYPE = "customerUseCase";
    public static String ALERT_DATA_KEY_TXN_AMOUNT = "customerAmount";
    public static String ALERT_DATA_KEY_LOGIC_OPERATOR = "customerLogicOperator";

    public static String TRANSACTION_STATUS_PENDING = "PENDING";
    public static String TRANSACTION_STATUS_SUCCESSFUL = "SUCCESSFUL";
    public static String TRANSACTION_STATUS_FAILED = "FAILED";

    public static String ROLE_ASSIGN_PRIVILEGE = "role";
    public static String PRIVILEGE_ASSIGN_ROLE = "privilege";

    public static final int CPN_ACTIVATION_PENDING = 5;

    public static int PENDING_APPROVAL_ERROR = 250;
    public static int PENDING_SVA_CLEARANCE_APPROVAL_ERROR = 260;
    public static int PENDING_APPROVAL_INSUFFICIENT_PRIV_ERROR = 205;
    public static int NO_APPROVAL_CONFIG_FOUND = 204;
    public static int NO_SYNC_HISTORY_FOUND = 201;

    public static String CST_ALLOWED_BULKFILE_TYPES = "1,2,15,16";
    public static String DPP_ALLOWED_BULKFILE_TYPES = "11,12";
    public static String CST_AUDIT_CATEGORIES = "SYSTEM,READ,CONFIG,SEC";
    // call ShowContacsPage from customerCare menu
    public static final String CALL_SHOW_CONTACTS_PAGE = "CALL_SHOW_CONTACTS_PAGE";
    public static final String CALL_SCP_FROM_MENU_CST = "CALL_SHOW_CONTACTS_PAGE_FROM_MENU_CST";
    public static final Integer DROP_DOWN_FIND_OPEN_CONTACTS = 0;

    public static final String OFFLINE_SVA_SUBSCRIPTION_HEADING = "Subscriptions";
    public static final String GLOBAL_OFFLINE_SVA_DESCRIPTION = "Offline SVA";
    public static final String GLOBAL_OFFLINE_SVA_MERCHANT_NAME = "Mobiliser";

    public static String CRED = "11,12";

    public static String EMPTY = "";

    // Drop down for OrgUnit in Customer Search Screen
    public static String ANY = "Any";

    // privileges associated with cst find customer

    public static final String PRIV_FIND_CUSTOMER_ANY_ORGUNIT = "UI_FIND_CUSTOMER_ANY_ORGUNIT";

    // Actions
    public static String ACTION_ADD = "ADD";
    public static String ACTION_EDIT = "EDIT";
    public static String ACTION_REMOVE = "REMOVE";

    public static int SER_STATUS_SUCCESS = 0;
    public static int PENDING_FOR_DEACTIVATION = 0;
    public static int PENDING_FOR_SVA_CLEARANCE = 1;
    public static int PENDING_FOR_REGISTRATION = 2;
    // GLAccounts
    public static int CUSTOMER_TYPE_GLA_PARENT_ONLY = 103;
    public static int CUSTOMER_TYPE_GLA_REGULAR = 104;
    public static int CUSTOMER_TYPE_GLA_EXPENSE_INCOME = 105;
    public static int APPROVALTYPE_REGISTRATION = 0;

    // Offline SVA
    public static long GLOBAL_SVA_MERCHANT_ID = 900;
    public static String GLOBAL_SVA_CODE = "default_SVA";
    public static String GLOBAL_OFFLINE_SVA_NAME = "Offline SVA";
    public static int OFFLINE_SVA_PAYMENT_INSTRUMENT_TYPE = 90;

    // Status
    public static String ACTIVE = "active";
    public static String USER_STATUS_DORMANT = "Dormant";
    // Field Hints
    public static final String HINT_KEY_PREFIX = "tip.";

    // Irtza's Entries


    public static final String RESOURCE_BUNDLE_IDENTITY_TYPE = "identitytype";
    public static final String RESOURCE_BUNDLE_LIMIT_CLASSES_OPEN = "limitclasses_open";

    public static final int REGISTRATION_TYPE_CODE = 38;
    public static final int PERMANENT_ADDRESS_CODE = 39;
    public static final int IDENTIFY_TYPE_CODE = 14;
    public static final int CUSTOMER_ATTRIBUTE_IDENTITY_VALUE = 15;
    public static final String REGEX_NUMERIC = "^[0-9]+$";
    public static final String REGEX_MOBILE_NO = "^[0-9]+$";
    public static final String REGEX_MOBILE_NUMBER_SEARCH = "^[+]{0,1}[0-9]*[*]{0,1}$";
    public static final String REGEX_AGENT_ID = "^$|^[A-Z0-9-]*$";
    public static final String REGEX_ALPHANUMERIC = "^$|^[A-Za-z0-9' ']*$";
    public static final String REGEX_COC_ALPHANUMERIC_ACCOUNT = "^([A-Za-z]{3})([0-9]{13})$";
    public static final String REGEX_ALPHANUMERIC_WILD_CARD_AGENT_ID = "^$|^[*]{0,1}[A-Za-z0-9' '-]*[*]{0,1}$";
    public static final String REGEX_ALPHANUMERIC_WILD_CARD = "^$|^[A-Za-z0-9' ']*[*]{0,1}$";
    public static final String REGEX_NUMERIC_DECIMAL = "^([0-9]{1,10}([\\.][0-9]{0,2})?)$";
    public static final String REGEX_NUMERIC_DECIMAL_COC = "^([0-9]{1,9}([\\.][0-9]{0,2})?)$";
    public static final String REQUEST_ORIGIN = "DIST-WEB";
    public static final String DEFAULT_COUNTRY = "Pakistan";
    public static final String DEFAULT_COUNTRY_PAKISTANI = "Pakistani";
    public static final Integer CREDENTIAL_TYPE = 0;

    // regular expressions

    public static final String REGEX_VOUCHER = "^(\\+){0,1}[0-9]+$";
    public static final String REGEX_CLI = "^(\\+){0,1}[0-9]+$";

    public static final String REGEX_EMAIL_FTP = "^[0-9a-zA-Z][\\w\\.-]*[a-zA-Z0-9]@[a-zA-Z0-9][\\w\\.-]*[a-zA-Z0-9]\\.[a-zA-Z][a-zA-Z\\.]*[a-zA-Z]$";

    public static final String REGEX_ALIAS = "^$|^[-0-9a-zA-Z�-� .']*$";

    public static final String REGEX_ALPHANUMERIC_SPACES = "^$|^[-0-9a-zA-Z ]*$";

    // Start with alphabet and rest will be alphanumeric
    public static final String REGEX_CUSTOMER_ALIAS = "^[a-zA-Z][a-zA-Z0-9]*$";
    public static final String REGEX_REFERREDBY = "^[a-zA-Z][a-zA-Z0-9]*$";

    public static final String RESOURCE_BUNDLE_ACTION_LIST = "actionlist";

    public static final long STATUS_PENDING = 0;
    public static final String RESOURCE_BUNDLE_CLIENT_ACQUIRED = "clientacquired";
    public static final String RESOURCE_BUNDLE_REG_CHN_DEP = "regularchanneldeposit";

    public static final String RESOURCE_BUNDLE_BUSINESS_TYPE = "businesstypes";
    public static final String RESOURCE_BUNDLE_TERRITORY_CODE = "territorycode";
    public static final int AGE_LIMITATION = 18;
    public static final String RESOURCE_BUNDLE_IDENTITY_TYPES = "identityTypes";

    public static final String REGEX_CNIC_UPDATED = "^(?=.*[1-9])[0-9+]{5}(-){1}[0-9+]{7}(-){1}[0-9]{1}$";

    public static final String REGEX_CUSTOMER_NAME = "^[a-zA-Z0-9\\.\\-/&\\s]+$";
    public static final String REGEX_ACCOUNT_NO = "^[0-9]+[a-zA-Z0-9\\-]+$";
    public static final String REGEX_ACCOUNT_TYPE = "^[0-9]+$";
    public static final String REGEX_ACCOUNT_STATUS = "^[0-9]+$";
    public static final String REGEX_LANDLINE_NO = "^[0-9]+$";

   /* public static final StringValidator fromoneToSmallStringValidator = StringValidator.lengthBetween(1, 6);*/
    public static final int MIN_MOBILE_NUMBER = 11;
    public static final String DEFAULT_CURRENCY = "MMK";
    public static final int MAX_LENGTH_OTP = 5;
    public static final int STATUS_RETURNED = 2;
    public static final int IDTYPE_MSVA = 8;
    public static final int IDTYPE_CUSTOMER_ID = 1;
    public static final int CUSTOMER_MSVA_IDENTIFICATION = 8;
    public static final int SOURCE_MODULE_GL_TRANSFER = 7;
    public static final int SOURCE_MODULE_OTC_DR_REVERSAL = 10;
    public static final int SOURCE_MODULE_SEND_DONATION_REVERSAL = 13;
    public static final String DEFAULT_CURRENCY_PKR = "PKR";

    public static final int SOURCE_MODULE_RESET_OTP = 12;
    public static final int STATUS_ID_PENDING = 0;
    public static final int ID_STATUS_APPROVED = 1;
    public static final int ID_STATUS_REJECTED = 3;
    public static final int ID_STATUS_CAPTURED_RECEIVED=11;

    public static final int ACTION_ID_CREATE = 0;
    public static final int ACTION_ID_UPDATE = 1;
    public static final int ACTION_ID_VIEW = 10;
    public static final long MAKER_WORK_ITEM_ID = 0L;

    public static final int SERVICE_GET_AGENTS_LIST = 1;
    public static final int SERVICE_GET_CONSUMER_DETAILS = 2;
    public static final int SERVICE_CONSUMER_CHANNELS = 3;
    public static final int SERVICE_GET_ALL_CHILD_UNDER_PARENT = 4;
    public static final int SERVICE_GET_REGISTRATION_TYPE = 5;
    public static final int SERVICE_IS_GUEST = 6;
    public static final int SERVICE_UNBLOCK_AMOUNT = 7;
    public static final int SERVICE_BLOCK_AMOUNT = 8;
    public static final int SERVICE_VERIFY_BLOCK_AMOUNT = 9;
    public static final int SERVICE_SEARCH_BLOCK_AMOUNTS = 10;
    public static final int SERVICE_GENERATE_OTP = 11;
    public static final int SERVICE_CREATE_TXN_TYPE_GROUP = 12;
    public static final int SERVICE_DELETE_TXN_TYPE_GROUP = 13;
    public static final int SERVICE_GET_ALL_TXN_TYPE_GROUP = 14;
    public static final int SERVICE_CREATE_TXN_TYPE_GROUP_USECASE = 15;
    public static final int SERVICE_GET_ALL_TXN_TYPE_GROUP_USECASE = 16;
    public static final int SERVICE_DELETE_TXN_TYPE_GROUP_USECASE = 17;
    public static final int SERVICE_GET_PIN_OFFSET = 18;
    public static final int SERVICE_RESET_PIN = 19;
    public static final int SERVICE_IS_CUSTOMER_PIN_EXIST = 20;
    public static final int SERVICE_VERIFY_OTC_DETAILS = 21;
    public static final int SERVICE_LIMIT_CLASS_MAPPING_WITH_TXN_GROUP = 22;
    public static final int SERVICE_GET_LIMIT_CLASS_BY_ID = 23;
    public static final int SERVICE_GET_TXN_TYPE_GROUPS_BY_LIMITSET = 24;
    public static final String DATE_FORMAT_DD_MM_YYYY = "dd/MM/yyyy";
    public static final String DATE_FORMAT_DD_MM_YYYY_PICKER = "dd/mm/yy";
    public static final int SERVICE_GET_FEE = 30;
    public static final int SOURCE_MODULE_DOCUMENT_SUBMIISION = 19;
    public static final int STATUS_DOCUMENT_SUBMIISION_INQUIRY = 1;
    public static final int STATUS_DOCUMENT_SUBMIISION_APPROVAL = 1;
    public static final int STATUS_DOCUMENT_SUBMIISION_PENDING_FOR_APPROVAL = 0;
    public static final int STATUS_DOCUMENT_SUBMIISION_PENDING = 0;
    public static final int STATUS_DOCUMENT_SUBMIISION_REJECTED = 3;
    public static final String STATUS_APPROVE_NAME = "APPROVED";
    public static final String STATUS_PENDING_NAME = "PENDING";
    public static final String STATUS_REJECTED_NAME = "REJECTED";
    public static final String STATUS_RETURNED_NAME = "RETURNED";
    public static final int STATUS_REQUEST_APPROVE = 1;
    public static final int STATUS_REQUEST_REJECT = 3;
    public static final int STATUS_DOCUMENT_SUBMIISION = 0;
    public static final int ACTION_CREATE_DOCUMENT_SUBMIISION = 0;
    public static final int ID_STATUS_PENDING = 0;

    public static final String FEE_TYPE_FIX = "fixed";
    public static final String FEE_TYPE_PERCENTAGE = "%age";
    public static final String FEE_TYPE_FIX_SLAB = "fixed slab";
    public static final String FEE_TYPE_PERCENTAGE_SLAB = "%age slab";
    public static final String FEE_TYPE_FIXED_PERCENTAGE_HIGHER_SLAB = "fixed %age higher slab";
    public static final String FEE_TYPE_FIXED_PERCENTAGE_LOWER_SLAB = "fixed %age lower slab";
    public static final String TRANSACTION_FEE_AND_COMMMISSION_PARAM = "FEE_COMM";

    public static final int ATTRIBUTE_TYPE_PERMANENT_ADD = 39;

    public static final String RESTRICTED_ATTACHMENT_TYPE = "image/jpeg";
    public static final int MAX_FILE_SIZE = 512000;
    public static final String STRING_ZERO = "0";
    public static final int INT_ONE = 1;
    public static final int INT_THREE = 3;
    public static final String SC_PLUS_SIGN = "+";
    public static final String COUNTRY_CODE_PAKISTAN_WITH_PLUS_SIGN = "+92";
    public static final int MOBILE_NUMBER_IDENTIFICATION = 0;
    public static final String STATUS_SEARCH_PENDING = "0";
    public static final String STATUS_CAPTURED = "30";
    public static final String STATUS_BACK_STOPPED = "31";
    public static final String STATUS_FULLY_PROCESSED = "99";
    public static final int MAX_MOBILE_NUMBER = 11;
    public static final int MOBILE_NUMBER_COUNTRY_LENGTH = 3;
    public static final String MOBILE_NUMBER_COUNTRY_PREFIX = "+";
    public static final String MOBILE_NUMBER_PREFIX = "0";
    public static final int AMOUNT_TYPE_NON_DECIMAL = 0;
    public static final int AMOUNT_TYPE_DECIMAL = 1;
    public static final String CONVERT_TYPE_PERCENTAGE = "2";
    public static final String STATUS_REVERSED = "REVERSED";

    /* BankUsersRegistrationApproval */
    public static final String RESOURCE_BUNDLE_BANK_USER_TYPE = "bankUserRole";
    public static final String REGEX_NUMERIC_EXTENDED = "^(?=.*[1-9])[0-9]+$";
    public static final String RESOURCE_BUNDLE_COUNTRY = "countrypk";
    public static final String RESOURCE_BUNDLE_CITIES = "cities";
    public static final String RESOURCE_BUNDLE_LIMIT_CLASS = "limitclass";

    // Add by MSA
    public static final String REGISTRATION_TYPE_AGENT = "AGENT";
    public static final String REGISTRATION_TYPE_CUSTOMER = "CUSTOMER";
    public static final String PRODUCT_TYPE_MINOR_ACCOUNT = "MINOR_ACCOUNT";


    public static final int BANK_PORTAL_CUSTOMER_TYPE = 901;
    public static final int AGENTTAL_PORTAL_CUSTOMER_TYPE = 902;

    // Module Ids (ABS_WORK_ITEM_SOURCE_MODULE)
    public static final int MODULE_ID_BANK_ADMIN_UPDATE = 0;
    public static final int MODULE_ID_BANK_USER_CREATION = 1;
    public static final int MODULE_ID_AGENT_CREATION = 2;
    public static final int MODULE_ID_SUSPEND_UNSUSPEND = 3;
    public static final int MODULE_ID_BANK_USER_LINKING = 4;
    public static final int MODULE_ID_BANK_USER_DELINKING = 5;
    public static final int MODULE_ID_LIMIT_SET = 6;
    public static final int MODULE_ID_L2_CUSTOMER_REGISTRATION = 7;
    public static final int MODULE_ID_AGENT_CALSS_CREATION = 8;
    public static final int MODULE_ID_AGENT_CLASS = 8;
    public static final int MODULE_ID_CLOSE_ACCOUNT = 5;
    public static final int MODULE_ID_CUSTOMER_CREATION = 15;
    public static final int MODULE_ID_BULK_DISBURSEMENT = 10;
    public static final int MODULE_ID_BULK_DISBURSEMENT_SUMMARY = 11;
    public static final int MODULE_ID_BULK_CUSTOMER_REGISTRATION = 12;
    public static final int MODULE_ID_BULK_CUSTOMER_REGISTRATION_SUMMARY = 13;
    public static final int MODULE_ID_L0_CUSTOMER_REGISTRATION_FROM_BULK = 14;
    public static final int MODULE_ID_BLACKLISTING_AGENT_CUSTOMER = 15;
    public static final int MODULE_ID_PROVINCIAL_TAX_CONFIGURATION = 16;
    public static final int MODULE_ID_L0_CUSTOMER_REGISTRATION = 17;
    public static final int MODULE_ID_KAFALA_REGISTRATION = 42;
    public static final int MODULE_ID_L1_CUSTOMER_REGISTRATION = 18;
    public static final int MODULE_ID_HANDLER_CREATION = 19;
    public static final int MODULE_ID_LIMIT_CLASS = 21;
    public static final int MODULE_ID_ACCOUNT_CLOSURE = 23;
    public static final int MODULE_ID_HRA_CUSTOMER_REGISTRATION = 24;
    public static final int MODULE_ID_SMART_WALLET_L1_AND_L2_CUSTOMER_REGISTRATION = 26;
    public static final int MODULE_ID_ZAKAT = 27;
    public static final int MODULE_ID_BULK_CNIC_DISBURSEMENT = 28;
    public static final int MODULE_ID_BULK_CNIC_DISBURSEMENT_SUMMARY = 29;
    public static final int MODULE_ID_BULK_CDD_EDIT = 30;
    public static final int MODULE_ID_AMA_L0_CUSTOMER_REGISTRATION = 33;

    public static final int MODULE_ID_BULK_CNIC_DISBURSEMENT_REVERSAL = 37;
    public static final int MODULE_ID_INDIVIDUAL_ACCOUNT_LEVEL_UPGRADE = 38;
    public static final int MODULE_ID_BULK_MSISDN_UPDATE = 39;
    public static final int MODULE_ID_BULK_ACCOUNT_LEVEL_UPGRADE = 40;
    public static final int MODULE_ID_ACCOUNT_DORMANT = 43;

    public static final int MODULE_ID_BULK_EDIT_CUSTOMER = 44;


    public static final int ATTACHMENT_STATUS_OK = 0;
    public static final int ATTACHMENT_STATUS_OPEN = 10;
    public static final int ATTACHMENT_STATUS_CANCELED = 13;

    // Attribute Type
    public static final int ATTRIBUTE_TYPE_IDENTITY_TYPE = 14;
    public static final int ATTRIBUTE_TYPE_IDENTITY_VALUE = 15;
    public static final int ATTRIBUTE_TYPE_EMPLOYEE_P_NO = 36;
    public static final int ATTRIBUTE_TYPE_DEPARTMENT = 37;
    public static final int ATTRIBUTE_TYPE_REGISTRATION_TYPE = 38;
    public static final int ATTRIBUTE_TYPE_PERMANMENT_ADDRESS = 39;

    // Channels
    public static final int ID_ORDER_CHANNEL_PORTAL = 1;
    public static final int CHANNEL_ID_USSD = 1;
    public static final int CHANNEL_ID_PORTAL = 2;
    public static final int CHANNEL_ID_MOBILE_APP = 3;
    public static final int CHANNEL_ID_THIRD_PARTY = 4;

    // Action Status Table (ABS_WORK_ITEM_STATUS)
    public static final int ABS_STATUS_PENDING = 0;
    public static final int ABS_STATUS_APPROVED = 1;
    public static final int ABS_STATUS_RETURNED = 2;
    public static final int ABS_STATUS_REJECTED = 3;
    public static final int ABS_STATUS_INITIATED = 4;
    public static final int ABS_STATUS_AGENTRETURNED = 5;
    public static final int ABS_STATUS_SENDTOBO2 = 6;

    public static final String ABS_STATUS_PENDING_MSG = "PENDING";
    public static final String ABS_STATUS_APPROVED_MSG = "APPROVED";
    public static final String ABS_STATUS_REJECT_MSG = "REJECTED";
    public static final String ABS_STATUS_INITIATED_MSG = "INITIATED";
    public static final String ABS_STATUS_RETURNED_MSG = "RETURNED";

    // Agent Actions XML (Action Drop Down)
    public static String AGENT_STATUS_APPROVE = "0";
    public static String AGENT_STATUS_RETURN = "1";
    public static String AGENT_STATUS_REJECT = "2";

    // Staus XML (Staus Drop Down)
    public static String STATUS_ACTIVATE = "1";
    public static String STATUS_DEACTIVATE = "2";

    // Business Type XML (Business Type Drop Down)
    public static String BUSINESS_TYPE_PARTNERSHIP = "02";
    public static String BUSINESS_TYPE_PRIVATE_LTD = "01";
    public static String BUSINESS_TYPE_SOLE_PROPRIETOR = "03";
//  public static String BUSINESS_TYPE_PARTNERSHIP = "PrivateLtd.";
//  public static String BUSINESS_TYPE_PRIVATE_LTD = "Partnership";
//  public static String BUSINESS_TYPE_SOLE_PROPRIETOR = "Sole-proprietor";

    // Identity Type XML (Identity Type Drop Down)
    public static String IDENTITY_TYPE_VALUE_CNIC = "CNIC";
    public static String IDENTITY_TYPE_VALUE_NICOP = "NICOP";
    public static String IDENTITY_TYPE_VALUE_NTN = "NTN";
    public static String IDENTITY_TYPE_VALUE_POC = "POC";
    public static String IDENTITY_TYPE_VALUE_PASSPORT = "PASSPORT";

    public static int IDENTITY_TYPE_ID_CNIC = 2;

    public static int IDENTITY_TYPE_ID_NICOP = 3;
    public static int IDENTITY_TYPE_ID_NTN = 4;
    public static int IDENTITY_TYPE_ID_PASSPORT = 7;
    // Action Table (ABS_WORK_ITEM_SOURCE_ACTIONS)
    public static int ACTION_CREATE = 0;
    public static int ACTION_UPDATE = 1;

    // Service Status Code
    public static final int STATUS_CODE_SUCCESS = 0;
    public static final int STATUS_CODE_WI_MSISDN = 10101;
    public static final int STATUS_CODE_WI_EMAIL = 10102;
    public static final int STATUS_CODE_WI_CNIC = 10103;
    public static final int STATUS_CODE_WI_USER_NAME = 10104;
    public static final int STATUS_CODE_WI_EMPLOYEE_ID = 10105;
    public static final int STATUS_CODE_WI_REASON = 10106;
    public static final int STATUS_CODE_CT_MSISDN = 10201;
    public static final int STATUS_CODE_CT_EMAIL = 10202;
    public static final int STATUS_CODE_CT_CNIC = 10203;
    public static final int STATUS_CODE_CT_USER_NAME = 10204;
    public static final int STATUS_CODE_CT_EMPLOYEE_ID = 10205;
    public static final int STATUS_CODE_CT_REASON = 10206;
    public static final int STATUS_CODE_UNKNOWN_DB_ERROR = 9999;

    // Page Parameters
    public static final String PARAM_SUCCESS_MSG = "SUCCESS_MSG";
    public static final String PARAM_FAILURE_MSG = "FAILURE_MSG";
    public static final String PARAM_MENU_PARAMETER = "MENU_PARAMETER";
    public static final String PARAM_CUSTOMER_ID = "CUSTOMER_ID";
    public static final String PARAM_CUSTOMER_TYPE = "CUSTOMER_TYPE";
    public static final String PARAM_CUSTOMER_TYPE_ID = "CUSTOMER_TYPE_ID";
    public static final String PARAM_BLACKLIST_REASON_ID = "BLACKLIST_REASON_ID";
    public static final String PARAM_WORK_ITEM_ID = "WORK_ITEM_ID";
    public static final String PARAM_FIRST_NAME = "FIRST_NAME";
    public static final String PARAM_LAST_NAME = "LAST_NAME";
    public static final String PARAM_MOBILE_NO = "MOBILE_NO";
    public static final String PARAM_CNIC = "CNIC";
    public static final String PARAM_AGENT_TYPE = "AGENT_TYPE";
    public static final String PARAM_IS_BLACKLISTED_ALREADY = "IS_BLACKLISTED_ALREADY";
    public static final String PARAM_REPORT = "REPORT";
    public static final String PARAM_TXN_ID = "PARAM_TXN_ID";
    public static final String PARAM_TXN_FEE = "PARAM_TXN_FEE";
    public static final String PARAM_TXN_AMOUNT = "PARAM_TXN_AMOUNT";
    public static final String PARAM_TXN_DATE = "PARAM_TXN_DATE";
    public static final String PARAM_CUSTOMER_NAME = "PARAM_CUSTOMER_NAME";
    public static final String PARAM_FROM_ACCOUNT = "PARAM_FROM_ACCOUNT";
    public static final String PARAM_BRANCH_CODE = "PARAM_BRANCH_CODE";
    public static final String PARAM_ACCOUNT_TYPE = "ACCOUNT_TYPE";


    // Page Parameters Values
    public static final String PARAM_VALUE_EDIT_AGENT_DETAILS = "EDIT_AGENT_REGISTRATION_SEARCH";
    public static final String PARAM_VALUE_VIEW_AGENT_DETAILS = "VIEW_AGENT_REGISTRATION_SEARCH";
    public static final String PARAM_VALUE_BLACKLIST_AGENT_CUSTOMER = "EDIT_BLACKLIST_AGENT_CUSTOMER_SEARCH";
    public static final String PARAM_VALUE_BLACKLIST_AGENT_CUSTOMER_APPROVAL = "BLACKLIST_AGENT_CUSTOMER_APPROVAL";
    public static final String PARAM_VALUE_BLACKLIST_AGENT_CUSTOMER_REJECTED = "BLACKLIST_AGENT_CUSTOMER_REJECTED";
    public static final String PARAM_VALUE_BLACKLIST_AGENT_CUSTOMER_RETURNED = "BLACKLIST_AGENT_CUSTOMER_RETURNED";
    public static final String PARAM_VALUE_EDIT_AGENT_REGISTRATION_APPROVAL_SEARCH = "EDIT_AGENT_REGISTRATION_APPROVAL_SEARCH";
    public static final String PARAM_VALUE_AGENT_REGISTRATION_APPROVAL = "AGENT_REGISTRATION_APPROVAL";
    public static final String PARAM_VALUE_AGENT_REGISTRATION_REJECTED = "AGENT_REGISTRATION_REJECTED";
    public static final String PARAM_VALUE_AGENT_REGISTRATION_RETURNED = "AGENT_REGISTRATION_RETURNED";
    public static final String PARAM_VALUE_AGENT_REGISTRATION_REQUEST = "AGENT_REGISTRATION_REQUEST";
    public static final String PARAM_VALUE_CUSTOMER_REGISTRATION_APPROVAL = "CUSTOMER_REGISTRATION_APPROVAL";
    public static final String PARAM_VALUE_CUSTOMER_RETURN_TO_AGENT = "CUSTOMER_RETURN_TO_AGENT";
    public static final String PARAM_VALUE_CUSTOMER_RETURNED_TO_REQUEST = "CUSTOMER_RETURNED_TO_REQUEST";
    public static final String PARAM_VALUE_EDIT_CUSTOMER_DATA = "EDIT_CUSTOMER_DATA";
    public static final String PARAM_VALUE_EDIT_CUSTOMER_DATA_APPROVAL = "EDIT_CUSTOMER_DATA_APPROVAL";
    public static final String PARAM_VALUE_CUSTOMER_REGISTRATION_REQUEST = "CUSTOMER_REGISTRATION_REQUEST";
    public static final String PARAM_VALUE_BANK_USER_REGISTRATION = "BANK_USER_REGISTRATION";
    public static final String PARAM_VALUE_BANK_USER_REGISTRATION_APPROVAL = "BANK_USER_REGISTRATION_APPROVAL";
    public static final String PARAM_VALUE_EDIT_BANK_USER_REGISTRATION = "EDIT_BANK_USER_REGISTRATION";
    public static final String PARAM_VALUE_EDIT_BANK_USER_REGISTRATION_APPROVAL = "EDIT_BANK_USER_REGISTRATION_APPROVAL";
    public static final String PARAM_VALUE_ACCOUNT_CLOSURE_SEARCH = "ACCOUNT_CLOSURE_SEARCH";
    public static final String PARAM_VALUE_ACCOUNT_CLOSURE_APPROVAL = "ACCOUNT_CLOSURE_APPROVAL";
    public static final String PARAM_VALUE_ACCOUNT_CLOSURE_RETURNED = "ACCOUNT_CLOSURE_RETURNED";
    public static final String PARAM_VALUE_CLOSED_ACCOUNT = "CLOSED_ACCOUNT";

    // Lookup
    public static final String RESOURCE_BUNDLE_GET_GL_ACCOUNTS = "glAccounts";
    public static final String RESOURCE_BUNDLE_GET_ALL_FUNDING_PAYMENT_INSTRUMENT = "fundingPaymentInstrument";
    public static final String RESOURCE_BUNDLE_GET_ALL_COMMISSION_TYPE = "commissionType";
    public static final String RESOURCE_BUNDLE_GET_ALL_TRANSACTION_TYPE = "transactionType";
    public static final String RESOURCE_BUNDLE_GET_ALL_AGENT_TYPE = "agentType";
    public static final String RESOURCE_BUNDLE_GET_ALL_AGENT_TYPE_VRG = "agentTypeVRG";
    public static final String RESOURCE_BUNDLE_GET_ALL_BUSINESS_TYPE = "businesstypes";
    public static final String RESOURCE_BUNDLE_GET_ALL_CUSTOMER_REGISTRATION_TYPE = "customerRegistrationType";
    public static final String RESOURCE_BUNDLE_GET_ALL_CUSTOMER_PRODUCT_TYPE = "customerProductType";
    public static final String RESOURCE_BUNDLE_GET_ALL_CUSTOMER_ACCOUNT_TYPE = "customerAccountType";
    public static final String RESOURCE_BUNDLE_GET_CDD_RATING = "cddRating";
    public static final String RESOURCE_BUNDLE_GET_YES_NO_OPTION = "yesNoOption";
    public static final String RESOURCE_BUNDLE_GET_CDD_LOCATION = "cddLocation";

    public static final String RESOURCE_BUNDLE_GET_ALL_BANKS = "allBankTypes";
    public static final String RESOURCE_BUNDLE_GET_ALL_AGENT_REGISTRATION_TYPE = "agentRegistrationType";
    public static final String RESOURCE_BUNDLE_GET_ALL_CUSTOMER_TYPE = "customersType";
    public static final String RESOURCE_BUNDLE_GET_ALL_ACTIONS = "actions";
    public static final String RESOURCE_BUNDLE_GET_ALL_REASONS = "reasons";
    public static final String RESOURCE_BUNDLE_GET_ALL_GL_TYPE = "glType";
    public static final String RESOURCE_BUNDLE_GET_ALL_IDENTITY_TYPE = "identityType";
    public static final String RESOURCE_BUNDLE_GET_ALL_TAX_EXAMP_TYPE = "taxExempt";
    public static final String RESOURCE_BUNDLE_GET_ALL_IDENTITY_TYPE_L1 = "identityTypeL1";
    public static final String RESOURCE_BUNDLE_GET_ALL_KYC_1 = "kyc1";
    public static final String RESOURCE_BUNDLE_GET_ALL_KYC_2 = "kyc2";
    public static final String RESOURCE_BUNDLE_PURPOSE_OF_ACCOUNT = "purposeofaccount";
    public static final String RESOURCE_BUNDLE_GET_ALL_KYC_3 = "kyc3";
    public static final String RESOURCE_BUNDLE_GET_CHANNEL_OF_DEPOSIT = "channelofdeposit";
    public static final String RESOURCE_BUNDLE_GET_AGENT_APPROVE_ACTION = "agentApproveAction";
    public static final String RESOURCE_BUNDLE_GET_COMPANY_NAME = "companyName";
    public static final String RESOURCE_BUNDLE_GET_TERRITORY_CODE = "territoryCode";
    public static final String RESOURCE_BUNDLE_GENDER_UBANK = "customGender";
    public static final String RESOURCE_BUNDLE_GENDER_VRG = "genderType";
    public static final String RESOURCE_BUNDLE_GET_ALL_CUSTOMER_CLASS = "customerClass";
    public static final String RESOURCE_BUNDLE_GET_AGENT_RETURN_REASON = "agentReturnReason";
    public static final String RESOURCE_BUNDLE_GET_AGENT_REJECT_REASON = "agentRejectReason";
    public static final String RESOURCE_BUNDLE_GET_ALL_PARENT_AGENT = "parentagent";
    public static final String RESOURCE_BUNDLE_GET_ALL_PARENT_AGENT_FOR_CHILD = "parentagent";
    public static final String RESOURCE_BUNDLE_GET_ALL_PARENT_CHILD_AGENT_FOR_SUB_AGENT = "parentchildagent";
    public static final String RESOURCE_BUNDLE_MARITAL_STATUS = "maritalStatus";
    public static final String RESOURCE_BUNDLE_GET_ALL_DISTRICTS = "districts";


    // Regex
    public static final String REGEX_ALPHANUMERIC_SPACE = "^$|^[-0-9a-zA-Z ']*$";
    public static final String REGEX_ALPHANUMERIC_PLUS_UNDERSCORE = "^[A-Za-z0-9_]*$";
    public static final String REGEX_MINIMUM_MAXIMUM_LENGTH = "^$|^[-0-9a-zA-Z ']*$";
    public static final String REGEX_CNIC = "^(?=.*[1-9])[0-9+]{5}(-){1}[0-9+]{7}(-){1}[0-9]{1}$";

    public static final String REGEX_ALPHA_SPACE = "[a-zA-Z\\s']+";

    public static final String REGEX_ALPHANUMERIC_SPACE_SPECIAL_CHAR = "^[-0-9a-zA-Z\\ ^ ${ } [ ] ( ) . + ? | - &]$";
    public static final String COMMISSION_TYPE_FIX = "fixed";
    public static final String COMMISSION_TYPE_PERCENTAGE = "%age";
    public static final String COMMISSION_TYPE_FIX_SLAB = "fixed slab";
    public static final String COMMISSION_TYPE_PERCENTAGE_SLAB = "%age slab";
    public static final String RETENTION_COMMISSION_TYPE_FIX = "fixed";
    public static final String RETENTION_COMMISSION_TYPE_PERCENTAGE = "%age";
    public static final String RETENTION_COMMISSION_TYPE_FIX_SLAB = "fixed slab";
    public static final String RETENTION_COMMISSION_TYPE_PERCENTAGE_SLAB = "%age slab";

    // Customer Role
    public static final String ROLE_BANK_SUPER_ADMIN_1 = "ROLE_BANK_SUPER_ADMIN_1";
    public static final String ROLE_BANK_SUPER_ADMIN_2 = "ROLE_BANK_SUPER_ADMIN_2";
    public static final String ROLE_BANK_ADMIN_01 = "ROLE_BANK_ADMIN_01";
    public static final String ROLE_BANK_ADMIN_02 = "ROLE_BANK_ADMIN_02";
    public static final String ROLE_BANK_ADMIN_03 = "ROLE_BANK_ADMIN_03";
    public static final String ROLE_BANK_OFFICER_01 = "ROLE_BANK_OFFICER_01";
    public static final String ROLE_BANK_OFFICER_02 = "ROLE_BANK_OFFICER_02";
    public static final String ROLE_BANK_CSO = "ROLE_BANK_CSO";
    public static final String ROLE_BANK_DO = "ROLE_BANK_DO";
    public static final String ROLE_AGENT_PARENT = "ROLE_AGENT_PARENT";
    public static final String ROLE_AGENT_CHILD = "ROLE_AGENT_CHILD";
    public static final String ROLE_AGENT_SUB_AGENT = "ROLE_AGENT_SUB_AGENT";
    public static final String ROLE_CUSTOMER_L0 = "ROLE_CUSTOMER_L0";
    public static final String ROLE_CUSTOMER_L1 = "ROLE_CUSTOMER_L1";
    public static final String ROLE_CUSTOMER_L2 = "ROLE_CUSTOMER_L2";
    public static final String ROLE_GUEST_INITIATED = "ROLE_GUEST_INITIATED";
    public static final String ROLE_GUEST_PENDING = "ROLE_GUEST_PENDING";
    public static final String ROLE_GUEST_APPROVED = "ROLE_GUEST_APPROVED";

    // privileges
    public static final String PRIV_ACCOUNT_LINKING = "UI_ACCOUNT_LINKING_REQUEST";
    public static final String PRIV_ACCOUNT_DE_LINKING = "UI_ACCOUNT_DELINKING_REQUEST";
    public static final String PRIV_ACCOUNT_LINKING_APPROVAL = "UI_ACCOUNT_LINKING_APPROVAL_REQUEST";
    public static final String PRIV_ACCOUNT_DE_LINKING_APPROVAL = "UI_ACCOUNT_DELINKING_APPROVAL_REQUEST";
    public static final String PRIV_ACCOUNT_LINKING_RETURN = "UI_ACCOUNT_LINKING_RETURN_REQUEST";
    public static final String PRIV_ACCOUNT_DE_LINKING_RETURN = "UI_ACCOUNT_DELINKING_RETURN_REQUEST";

    // Privilages
    public static final String PRIV_USER_REGISTRATION = "UI_BANK_USER_REGISTRATION";
    public static final String PRIV_USER_REGISTRATION_APPROVAL = "UI_BANK_USER_REGISTRATION_APPROVAL";
    public static final String PRIV_USER_EDIT_BANK_USER = "UI_EDIT_BANK_USER";
    public static final String PRIV_EDIT_BANK_USER_APPROVAL = "UI_EDIT_BANK_USER_APPROVAL";
    public static final String PRIV_EDIT_USER_REGISTRATION = "UI_EDIT_BANK_USER_REGISTRATION";
    public static final String PRIV_ACCOUNT_LINKING_DE_LINKING = "UI_ACCOUNT_LINKING_DELINKING_REQUEST";

    public static final String PRIV_UI_AGENT_REGISTRATION = "UI_AGENT_REGISTRATION";
    public static final String PRIV_UI_AGENT_REGISTRATION_RETURNED = "UI_BP_AGENT_RETURN_PAGE";
    public static final String PRIV_UI_AGENT_REGISTRATION_REJECTED = "UI_AGENT_REGISTRATION_REJECTED";
    public static final String PRIV_UI_AGENT_REGISTRATION_APPROVAL = "UI_BP_AGENT_APPROVAL_PAGE";
    public static final String PRIV_UI_EDIT_AGENT = "UI_EDIT_AGENT";
    public static final String PRIV_UI_EDIT_AGENT_APPROVAL = "UI_EDIT_AGENT_APPROVAL";
    public static final String PRIV_UI_AGENT_REGISTRATION_VIEW_APPROVAL = "UI_AGENT_REGISTRATION_VIEW_APPROVAL";
    public static final String PRIV_UI_ACCOUNT_CLOSURE = "UI_ACCOUNT_CLOSURE";
    public static final String PRIV_UI_ACCOUNT_CLOSURE_RETURNED = "UI_ACCOUNT_CLOSURE_RETURNED";
    public static final String PRIV_UI_ACCOUNT_CLOSURE_APPROVAL = "UI_ACCOUNT_CLOSURE_APPROVAL";
    public static final String PRIV_UI_CLOSED_ACCOUNT = "UI_CLOSED_ACCOUNT";

    // Guest Account Limit Rev
    public static final String PRIV_UI_GUEST_ACCOUNT_LIMIT_REV = "UI_BP_GUEST_ACCOUNT_LIMIT_REV";

    // Guest Account Handling
    public static final String PRIV_UI_GUEST_ACCOUNT_HANDLING = "UI_BP_GUEST_ACCOUNT_HANDLING";

    // Guest Account Registration
    public static final String PRIV_UI_GUEST_ACCOUNT_REGISTRATION = "UI_BP_GUEST_ACCOUNT_REGISTRATION";

    // Guest Account Registration
    public static final String PRIV_UI_GUEST_ACCOUNT_REGISTRATION_APPROVAL = "UI_BP_GUEST_ACCOUNT_REGISTRATION_APPROVAL";

    // Guest Account Registration
    public static final String PRIV_UI_GUEST_ACCOUNT_REGISTRATION_SEARCH = "UI_BP_GUEST_ACCOUNT_REGISTRATION_SEARCH";

    // UI_CST_CUSTOMAGENT_MAKER_SEARCH
    public static final String PRIV_CST_CUSTOMAGENT_MAKER_SEARCH = "UI_AP_CST_CUSTOMAGENT_MAKER_SEARCH";

    // UI_CST_CUSTOMAGENT_APP
    public static final String PRIV_CST_CUSTOMAGENT_APP = "UI_AP_CST_CUSTOMAGENT_APP";

    // UI_CST_CUSTOMAGENT_CUST_APP_SEARCH
    public static final String PRIV_CST_CUSTOMAGENT_CUST_APP_SEARCH = "UI_AP_CST_CUSTOMAGENT_CUST_APP_SEARCH";

    // UI_CST_CUSTOMAGENT_MAKER
    public static final String PRIV_CST_CUSTOMAGENT_MAKER = "UI_AP_CST_CUSTOMAGENT_MAKER";

    // UI_CST_CUSTOMAGENT_CUSTOMER
    public static final String PRIV_CST_CUSTOMAGENT_CUSTOMER = "UI_AP_CST_CUSTOMAGENT_CUSTOMER";

    // UI_CST_CUSTOMAGENT_CUST_SEARCH
    public static final String PRIV_CST_CUSTOMAGENT_CUST_SEARCH = "UI_AP_CST_CUSTOMAGENT_CUST_SEARCH";

    // PRIV_CST_CUSTOMAGENT_APP_SEARCH

    // Errors and Messages for Account Linking and de-linking.
    public static final String ERROR_REQUEST_LINKING_PENDING = "ERROR.REQUEST_LINKING_PENDING";
    public static final String ERROR_Customer_LINKED_AGENT_TYPE = "ERROR.Customer_LINKED_AGENT_TYPE";
    public static final String ERROR_REQUEST_DELINKING_PENDING = "ERROR.REQUEST_DELINKING_PENDING";
    public static final String MESSAGE_BANK_ACCOUNT_DELINKING_REJECTION_SUCCESS = "MESSAGE.BANK_ACCOUNT_DELINKING_REJECTION_SUCCESS";
    public static final String ERROR_BANK_ACCOUNT_DELINKING_REJECTION = "ERROR.BANK_ACCOUNT_DELINKING_REJECTION";
    public static final String MESSAGE_BANK_ACCOUNT_LINKING_REJECTION_SUCCESS = "MESSAGE.BANK_ACCOUNT_LINKING_REJECTION_SUCCESS";
    public static final String ERROR_BANK_ACCOUNT_LINKING_REJECTION = "ERROR.BANK_ACCOUNT_LINKING_REJECTION";
    public static final String MESSAGE_BANK_ACCOUNT_DELINKING_APPROVAL_SUCCESS = "MESSAGE.BANK_ACCOUNT_DELINKING_APPROVAL_SUCCESS";
    public static final String ERROR_BANK_ACCOUNT_DELINKING_APPROVAL = "ERROR.BANK_ACCOUNT_DELINKING_APPROVAL";
    public static final String MESSAGE_BANK_ACCOUNT_LINKING_APPROVAL_SUCCESS = "MESSAGE.BANK_ACCOUNT_LINKING_APPROVAL_SUCCESS";
    public static final String ERROR_BANK_ACCOUNT_LINKING_APPROVAL = "ERROR.BANK_ACCOUNT_LINKING_APPROVAL";
    public static final String BANK_ACCOUNT_DELINKING_SUCCESS = "BANK_ACCOUNT_DELINKING_SUCCESS";
    public static final String MESSAGE_BANK_ACCOUNT_DELINKING_SUCCESS = "MESSAGE.BANK_ACCOUNT_DELINKING_SUCCESS";
    public static final String ERROR_BANK_ACCOUNT_DELINKING = "ERROR.BANK_ACCOUNT_DELINKING";
    public static final String MESSAGE_BANK_ACCOUNT_LINKING_SUCCESS = "MESSAGE.BANK_ACCOUNT_LINKING_SUCCESS";
    public static final String ERROR_BANK_ACCOUNT_LINKING = "ERROR.BANK_ACCOUNT_LINKING";
    public static final String ERROR_SEARCH_BANKADMIN = "ERROR.SEARCH_BANKADMIN";
    public static final String ERROR_UPDATE_BANK_ADMIN = "ERROR.UPDATE_BANK_ADMIN";

    public static final String RESOURCE_BALANCE_INQUIRY_TYPE = "balaceInquiry";
    public static final long DEFAULT_ATTACHMENT_SIZE = 1048576;
    public static final int MODULE_ID_BULK_BULK_UPLOAD_MODULE = 17;
    public static final String RESOURCE_BUNDLE_BULK_TRANS_TYPE = "bulkTransType";
    public static final String RESTRICTED_ATTACHMENT_TYPE_APPLICATION_EXCEL = "application/vnd.ms-excel";
    public static final String RESOURCE_BUNDLE_BLACKLIST_REASON = "blackListReasons";
    public static final String RESOURCE_BUNDLE_BLACKLIST_STATUS = "blackListStatus";
    public static final String MESSAGE_BLACK_LIST_SUBMIT_SUCCESS = "MESSAGE.BLACK_LIST_SUBMIT_SUCCESS";
    public static final String ERROR_BLACK_LIST_SUBMIT_FAILED = "ERROR.BLACK_LIST_SUBMIT_FAILED";

    public static final String ACCOUNT_LINK_REQUEST = "ACCOUNT_LINK_REQUEST";
    public static final String ACCOUNT_DELINK_REQUEST = "ACCOUNT_DELINK_REQUEST";
    public static final String PageParameter = "PageParameter";
    public static final Integer MODULE_ID_ACCOUNT_LINKING = 3;
    public static final Integer MODULE_ID_ACCOUNT_DE_LINKING = 4;
    public static final String ERROR_Customer_NOT_LINKED = "ERROR.Customer_NOT_LINKED";
    public static final String ERROR_CUSTOMER_ALREADY_LINKED = "ERROR.CUSTOMER_ALREADY_LINKED";
    public static final String RESOURCE_BUNDLE_UPDATE_TYPES = "updateTypes";
    public static final String RESOURCE_BUNDLE_UPDATE_MSISDN = "updateMsisdn";
    public static final String RESOURCE_BUNDLE_BLACKLIST_REASON2 = "blackListReason";



    /* Transfer Types */
    public static final String TRANSFER_TYPE_GL_TO_MOBILE = "GL to Mobile Account";
    public static final String TRANSFER_TYPE_MOBILE_TO_GL = "Mobile Account to GL";
    public static final String TRANSFER_TYPE_GL_TO_GL = "GL to GL";
    public static final String TRANSFER_TYPE_MOBILE_TO_MOBILE = "Mobile Account to Mobile Account";
    public static final String TRANSFER_TYPE_BANK_TO_GL = "Bank Acc to GL";
    public static final String TRANSFER_TYPE_GL_TO_BANK = "GL to Bank Acc";
    public static final String TRANSFER_TYPE_BANK_TO_MOBILE = "Bank Acc to Mobile Account";
    public static final String TRANSFER_TYPE_MOBILE_TO_BANK = "Mobile Account to Bank Acc";

    public static final int DATE_OF_BIRTH_LIMIT = 18;
    public static final int DEFAULT_NUMERIC_VALUE = 0;

    public static final String DEFAULT_IDENTITY_TYPE = "CNIC";
    public static final String REGEX_PASSPORT = "^(?=.*[1-9])[A-Za-z+]{2}[0-9+]{7}$";
    public static final String REGEX_NTN = "^(?=.*[1-9])[0-9+]{7}(-){1}[0-9]{1}$";
    public static final int UN_BLACK_LIST_ID = 0;
    public static final String REGEX_MSISDN2 = "^[0](?=.*[1-9])[0-9]+$";

    public static final int MOBILE_ACCOUNT_NUMBER_TYPE = 8;
    public static final int USE_CASE_OTC_SEND_DONATION = 15;

    public static final int SOURCE_MODULE_DEBIT_CARD_LINKING = 21;
    public static final int CUSTOMER_MSISDN_IDENTIFICATION = 0;

    public static final String OTC_TXN_SENDER_CNIC = "Sender CNIC";
    public static final String OTC_TXN_SENDER_MSISDN = "Sender Phone No.";
    public static final String OTC_TXN_RECEIVER_CNIC = "Receiver CNIC";
    public static final String OTC_TXN_RECEIVER_MSISDN = "Receiver Phone No.";

    public static final int DEFUALT_FEE_TYPE = 1;
    public static final int DEFAULT_COMMISSION_TYPE = 1;
    public static final String REGEX_NUMERIC_DECIMAL_PERCENTAGE_3DECIMALPLACES = "^([0-9]{1,3}([\\.][0-9]{0,3})?)$";
    public static final String REGEX_NUMERIC_DECIMAL_PERCENTAGE_2DECIMALPLACES = "^([0-9]{1,2}([\\.][0-9]{0,2})?)$";

    public static final Integer MODULE_ID_CONVERT_CUSTOMER = 16;
    public static final String RESOURCE_BUNDLE_ALL_ACTIONS = "allActions";
    // bill payment
    public static String EXPORT_FILE_NAME_ACCOUNT_STATEMENT = "Account Statement";
    public static String EXPORT_FILE_NAME_TRANSACTION_HISTORY = "Transaction History";
    public static String EXPORT_FILE_TYPE_EXCEL = "excel";
    public static String EXPORT_FILE_TYPE_CSV = "csv";

    public static final String WILDCARD_SEARCH = "*";

    // Farooq changes
    public static final String SEARCH_BULK_CNIC_APPROVAL_REQUEST = "SEARCH_BULK_CNIC_APPROVAL_REQUEST";
    public static final String SEARCH_BULK_PASSPORT_APPROVAL_REQUEST = "SEARCH_BULK_PASSPORT_APPROVAL_REQUEST";
    public static final String SEARCH_BULK_WALLET_APPROVAL_REQUEST = "SEARCH_BULK_WALLET_APPROVAL_REQUEST";

    public static final String BULK_CNIC_REQUEST = "BULK_CNIC_REQUEST";
    public static final String BULK_PASSPORT_REQUEST = "BULK_PASSPORT_REQUEST";
    public static final String BULK_WALLET_REQUEST = "BULK_WALLET_REQUEST";

    public static final String PRIV_UI_IR_PULL_OTC_TRXN = "UI_AP_IR_PULL_OTC_TRXN";
    public static final String PRIV_UI_IR_TRXN = "UI_AP_IR_TRXN";
    public static final String ERROR_IR_TRANSACTION_INTERNAL_SYSTEM = "ERROR.IR_TRANSACTION_INTERNAL_SYSTEM";
    public static final String PRIV_UI_IR_TRXN_DETAIL = "UI_AP_IR_TRXN_DETAIL";

    public static final String PRIV_UI_SEARCH_IR_BULK_PASSPORT_APPROVAL = "UI_BLKP_LOGIN";// "UI_BLK_UI_SEARCH_IR_BULK_PASSPORT_APPROVAL";
    public static final String PRIV_UI_SEARCH_IR_BULK_CNIC_APPROVAL = "UI_BLKP_LOGIN";// "UI_BLK_SEARCH_BULK_PASSPORT_APPROVAL";
    public static final String PRIV_UI_SEARCH_IR_BULK_WALLET_APPROVAL = "UI_BLKP_LOGIN";// temp assigned //"UI_BLK_SEARCH_BULK_WALLET_APPROVAL";

    public static final String PRIV_UI_IR_BULK_PASSPORT = "UI_BLKP_LOGIN";// "UI_BLK_UI_IR_BULK_PASSPORT";
    public static final String PRIV_UI_IR_BULK_CNIC = "UI_BLKP_LOGIN";// "UI_BLK_BULK_PASSPORT";
    public static final String PRIV_UI_IR_BULK_WALLET = "UI_BLKP_LOGIN";// temp assigned //"UI_BLK_BULK_WALLET";
    public static final String RESOURCE_BUNDLE_IDENTITY_IROTCPULL_TYPE = "identityTypeIRPullOTC";
    public static final String REGISTRATION_TYPE_GUEST = "Guest";
    public static final String IDENTITY_TYPE_Passport = "Passport";
    public static final int USE_CASE_TRANSFER_IN = 110;
    public static final int USE_CASE_TRANSFER_OUT = 111;
    public static final int USE_CASE_SEND_MONEY_1 = 104;
    public static final int USE_CASE_COC_REMITTANCE = 1049;
    public static final String BANK_NAME = "UBank";
    public static final String ROLE = "Role";

    public static final String RESOURCE_BUNDLE_GET_ALL_AGENT_CLASSES = "agentClasses";
    public static final String RESOURCE_BUNDLE_GET_PRODUCT_CODE_LIST = "productCodeList";
    public static final String CSS_KEYWARD_STYLE = "style";
    public static final String STYLE_DISABLE_GREY = "background-color: lightgray;";
    public static final String STYLE_ENABLE_WHITE = "background-color: none;";
    public static final String RESOURCE_BUNDLE_GET_THIRD_PARTY_COMPANY = "thirdPartiesCompanies";
    public static final String RESOURCE_BUNDLE_MAKER_CHECKER_ACTIONS = "makerCheckerActions";
    public static final String RESOURCE_BUNDLE_MAKER_CHECKER_KAF_ACTIONS = "makerCheckerKafActions";

    public static final String RESOURCE_BUNDLE_DORMANT_STATUS = "dormantStatus";
    public static final String RESOURCE_BUNDLE_MAKER_CHECKER_ACTIONS_SUSPEND_UNSUSPEND = "makerCheckerActionsSuspendUnsuspend";
    public static final String RESOURCE_BUNDLE_LEVEL_UPGRADE_ACTIONS = "levelUpgradeActions";

    public static final String RESOURCE_BUNDLE_AGENT_CUSTOMER_BLACKLIST_ACTIONS = "blackListReasons";

    public static final String AGENT_ID_REGEX = "[A-Z0-9-]*";


    public static final int ATTACHMENT_NAME_SIZE = 80;

    // Agent Type XML (Agent Type Drop Down)
    public static final String AGENT_TYPE_PARENT = "60";
    public static final String AGENT_TYPE_CHILD = "61";
    public static final String AGENT_TYPE_SUB_AGENT = "62";

// public static final String AGENT_TYPE_CHILD = "ROLE_AGENT_CHILD";
// public static final String AGENT_TYPE_PARENT = "ROLE_AGENT_PARENT";
// public static final String AGENT_TYPE_SUB_AGENT = "ROLE_AGENT_SUB_AGENT";

    public static final String AGENT_TYPE_CUSTOMER_L3 = "ROLE_AGENT_CUSTOMER_L3";
    public static final String AGENT_TYPE_AGENT_RFM = "ROLE_AGENT_RFM";
    public static final String AGENT_TYPE_AGENT_SSO_COPS = "ROLE_AGENT_SPECIALSOREGISTERUSER";
    public static final String AGENT_TYPE_AGENT_SSO_FINANCE = "ROLE_AGENT_SPECIAL_SO";
    public static final String KYC1_OTHER = "Other";
    public static final String KYC2_OTHER = "Other";
    public static final int ERROR_CODE_WI_EMAIL = 202;
    public static final String PRIV_UI_AP_CUSTOMER_REGISTRATION_REQUEST = "UI_AP_CUSTOMER_REGISTRATION_REQUEST";
    public static final String PRIV_UI_BP_CUSTOMER_REGISTRATION_REQUEST = "UI_BP_CUSTOMER_REGISTRATION_REQUEST";
    public static final String PRIV_UI_BP_ADMIN_REGISTRATION = "UI_BP_ADMIN_REGISTRATION";
    public static final String PRIV_UI_BP_SEARCH_BANK_ADMIN = "UI_BP_SEARCH_BANK_ADMIN";
    public static final String PRIV_UI_BP_SEARCH_BANK_OFFICER = "UI_BP_SEARCH_BANK_OFFICER";
    public static final String PRIV_UI_BP_SEARCH_BACK_OFFICE_USER = "UI_BP_SEARCH_BACK_OFFICE_USER";
    public static final String PRIV_UI_BP_OFFICER_REGISTRATION = "UI_BP_OFFICER_REGISTRATION";
    public static final String PRIV_UI_BP_BACK_OFFICE_USER_REGISTRATION = "UI_BP_BACK_OFFICE_USER_REGISTRATION";
    public static final String PRIV_UI_BP_OFFICER_REGISTRATION_APPROVAL = "UI_BP_OFFICER_REGISTRATION_APPROVAL";
    public static final String PRIV_UI_PROVINCIAL_TAX_CONFIGURATTION = "UI_PROVINCIAL_TAX_CONFIGURATION";
    public static final String PRIV_UI_PROVINCIAL_TAX_CONFIGURATTION_APPROVAL = "UI_PROVINCIAL_TAX_CONFIGURATION_APPROVAL";
    public static final String PRIV_UI_BACK_OFFICE_TRANSACTIONS = "UI_BACK_OFFICE_TRANSACTION";
    public static final String UI_BACK_OFFICE_TRANSACTION_APPROVAL = "UI_BACK_OFFICE_TRANSACTION_APPROVAL";
    public static final String UI_COC_REMITTANCE_APPROVAL = "PRIV_UI_COC_REMITTANCE_APPROVAL";
    public static final String PRIV_UI_BP_BANK_USER_APPROVAL = "UI_BP_BANK_USER_APPROVAL";
    public static final String PRIV_UI_BP_BACK_OFFICE_USER_APPROVAL = "UI_BP_BACK_OFFICE_USER_APPROVAL";
    public static final String PRIV_UI_BP_LIMIT_SET_APPROVAL = "UI_BP_LIMIT_SET_APPROVAL";
    public static final String PRIV_UI_BP_SUPER_ADMIN_REGISTRATION = "UI_BP_SUPER_ADMIN_REGISTRATION";
    public static final String PRIV_UI_BP_SEARCH_SUPER_ADMIN = "UI_BP_SEARCH_SUPER_ADMIN";

    public static final String PRIV_UI_BP_RESEND_EMAIL = "UI_BP_RESEND_EMAIL";
    public static final String PRIV_UI_ACCOUNT_STATEMENT = "UI_BP_ACCOUNT_STATEMENT";
    public static final String PRIV_UI_ACCOUNT_STATEMENT_VIEW = "UI_VIEW_ACCOUNT_STATEMENT";
    public static final String PRIV_UI_BP_CREATE_GENERAL_LEDGER = "UI_BP_CREATE_GENERAL_LEDGER";
    public static final String PRIV_UI_BP_UPDATE_GENERAL_LEDGER = "UI_BP_UPDATE_GENERAL_LEDGER";
    public static final String PRIV_UI_BP_VIEW_GENERAL_LEDGER = "UI_BP_VIEW_GENERAL_LEDGER";


    public static final String PRIV_UI_SEARCH_REVERSAL_TRANSACTION = "UI_BP_SEARCH_REVERSAL_TRANSACTION";
    public static final String PRIV_UI_SEARCH_TRANSACTION = "UI_BP_SEARCH_TRANSACTION";
    public static final String PRIV_UI_RESEND_SMS = "UI_BP_RESEND_SMS";

    public static final String PRIV_UI_RECEIVER_CNIC_UPDATE_MAKER_CHECKER = "UI_RECEIVER_CNIC_UPDATE_MAKER_CHECKER";

    public static final String PRIV_UI_RECEIVER_CNIC_SEARCH = "UI_RECEIVER_CNIC_SEARCH";
    public static final String PRIV_UI_RECEIVER_CNIC_SEARCH_APPROVAL = "UI_RECEIVER_CNIC_SEARCH_APPROVAL";
    public static final String PRIV_UI_ZAKAT_MAKER_CHECKER = "UI_BP_ZAKAT_MAKER_CHECKER";
    public static final String PRIV_UI_ZAKAT_CHECKER = "UI_BP_ZAKAT_CHECKER";

    public static final String PRIV_UI_RESEND_SMS_RECEIVE_MONEY = "UI_BP_RESEND_SMS_RECEIVE_MONEY";

    public static final String PRIV_UI_CNIC_BLACKLISTING_ADDITION_MAKER = "UI_BP_CNIC_BLACKLISTING_ADDITION_MAKER";
    public static final String PRIV_UI_CNIC_BLACKLISTING_ADDITION_CHECKER = "UI_BP_CNIC_BLACKLISTING_ADDITION_CHECKER";
    public static final String PRIV_UI_CNIC_BLACKLISTING_DELETION_MAKER = "UI_BP_CNIC_BLACKLISTING_DELETION_MAKER";
    public static final String PRIV_UI_CNIC_BLACKLISTING_DELETION_CHECKER = "UI_BP_CNIC_BLACKLISTING_DELETION_CHECKER";

    public static final String PRIV_UI_RECEIVE_MONEY_TRANSACTION = "PRIV_UI_RECEIVE_MONEY_TRANSACTION";

    public static final String RESOURCE_BUNDLE_GET_ALL_CUSTOMER_TYPE_AGENT = "customersTypeAgent";
    public static final String RESOURCE_BUNDLE_GET_ALL_CUSTOMER_TYPE_ALL = "allCustomersType";
    public static final String RESOURCE_BUNDLE_GET_L1_AND_L2_CUSTOMER_TYPE_ALL = "l1andl2CustomersType";
    public static final String RESOURCE_BUNDLE_GET_CUSTOMER_TYPE_ACCT_CLOSURE = "customersTypeAcctClosure";
    public static final String RESOURCE_BUNDLE_GET_L0_CUSTOMER_TYPE_ALL = "l0CustomersType";
    public static final String RESOURCE_BUNDLE_GET_ALL_CUSTOMER_TYPES_ALL = "allCustomersTypes";
    public static final String RESOURCE_BUNDLE_GET_LIMIT_CUSTOMER_TYPES_ALL = "LimitCustomersTypes";
    public static final String RESOURCE_BUNDLE_GET_WITHOUT_CORPORATE_CUSTOMER_TYPES_ALL = "withOutCorporateAllCustomersTypes";
    public static final String RESOURCE_BUNDLE_GET_WITHOUT_HRA_CUSTOMER_TYPES_ALL = "withOutHraAllCustomersTypes";
    public static final String RESOURCE_BUNDLE_GET_CUSTOMER_TYPE_HRA = "hraCustomersType";

    public static final String RESOURCE_BUNDLE_GET_CUSTOMER_TYPE_FROM_LEVEL_UPGRADE = "fromLevelUpgradeCustomersType";
    public static final String RESOURCE_BUNDLE_GET_CUSTOMER_TYPE_TO_LEVEL_UPGRADE = "toLevelUpgradeCustomersType";

    public static final String RESOURCE_BUNDLE_GET_FINGER_INDEX = "fingerIndex";
    public static final String RESOURCE_BUNDLE_GET_ALL_CUSTOMER_TYPE_ALL_BACK = "allCustomersTypeBack";
    public static final String RESOURCE_BUNDLE_GET_ALL_CUSTOMER_TYPE_FOR_BULK = "allCustomersTypeForBulk";
    public static final String RESOURCE_BUNDLE_GET_ALL_CUSTOMER_TYPE_BO = "customersTypeBO";
    public static final String RESOURCE_BUNDLE_GET_ALL_ACCOUNT_TYPE = "accountType";
    public static final String RESOURCE_BUNDLE_GET_ALL_ACCOUNT_NATURE = "accountNature";
    public static final String RESOURCE_BUNDLE_GET_ALL_EDIT_CUSTOMER_ACTIONS = "editCustomerActions";
    public static final String RESOURCE_BUNDLE_GET_ALL_RETURN_OPTION = "returnOption";
    public static final String RESOURCE_BUNDLE_GET_ALL_PARENT_GL_ACCOUNTS = "parentGlAccounts";
    public static final String RESOURCE_BUNDLE_GET_ALL_REJECT_REASONS_FOR_CUSTOMER = "rejectReason";
    public static final String RESOURCE_BUNDLE_GET_ALL_RETURN_REASONS_FOR_CUSTOMER = "returnReason";
    public static final String RESOURCE_BUNDLE_GET_ALL_FORWARD_TO_BO2_FOR_CUSTOMER = "forwardToBO2Actions";
    public static final String RESOURCE_BUNDLE_GET_ALL_FORWARD_TO_BO2_ACTIONS_CUSTOMER = "BO2Actions";
    public static final String RESOURCE_BUNDLE_GET_APPROVAL_ACTIONS_CUSTOM = "editApprovalActions";
    public static final String RESOURCE_BUNDLE_GET_ALL_MARITAL_STATUS = "maritialStatus";
    public static final String RESOURCE_BUNDLE_GET_ALL_CUSTOMETR_RESIDENCE = "customerResidence";
    public static final String RESOURCE_BUNDLE_GET_ALL_CUSTOMETR_OPERATION_INSTRUCTION = "customerOperationInstruction";
    public static final String RESOURCE_BUNDLE_GET_ALL_ZAKAT_DEDUCTION_REASON = "zakatDeductionReason";
    public static final String RESOURCE_BUNDLE_GET_ALL_EMPLOYMENT_TYPE = "employmentType";
    public static final String RESOURCE_BUNDLE_GET_ALL_NATURE_OF_JOB = "natureOfJob";
    public static final String RESOURCE_BUNDLE_GET_ALL_CUSTOMER_TYPE_BANK_OFFICER = "bankOfficer";
    public static final String RESOURCE_BUNDLE_GET_ALL_CUSTOMER_TYPE_BANK_ADMIN = "bankAdmin";
    public static final String RESOURCE_BUNDLE_GET_ALL_BACK_OFFICE_USERS = "getBackOfficeUsers";
    public static final String RESOURCE_BUNDLE_GET_ALL_CUSTOMER_TYPE_SUPER_ADMIN = "superAdmin";

    public static final String RESOURCE_BUNDLE_GET_ALL_CITIES = "cities";
    public static final String RESOURCE_BUNDLE_GET_ALL_TRANSFER_TYPES = "transferTypes";
    public static final String RESOURCE_BUNDLE_GET_ALL_DEBIT_ACCOUNTS = "debitac";
    public static final String RESOURCE_BUNDLE_GET_REQUEST_TYPE = "requestType";
    public static final String RESOURCE_BUNDLE_GET_ALL_CORPORATES = "corporates";
    public static final String RESOURCE_BUNDLE_GET_ALL_BULK_CORPORATES = "bulkCorporates";

    public static final String RESOURCE_BUNDLE_GET_CNIC_BLACKLISTING_TYPES = "cnicBlacklistingType";

    //Page Parameters Values
    public static final String PARAM_VALUE_CUSTOMER_REGISTRATION_APPROVAL_BO1 = "CUSTOMER_REGISTRATION_APPROVAL_BO1";
    public static final String PARAM_VALUE_CUSTOMER_REGISTRATION_APPROVAL_BO2 = "CUSTOMER_REGISTRATION_APPROVAL_BO2";
    public static final String PARAM_VALUE_CUSTOMER_RETURNED_REQUEST_BO1 = "CUSTOMER_RETURNED_REQUEST_BO1";
    public static final String PARAM_VALUE_AP_CUSTOMER_REGISTRATION_REQUEST = "AP_CUSTOMER_REGISTRATION_REQUEST";
    public static final String PARAM_VALUE_BP_CUSTOMER_REGISTRATION_REQUEST = "BP_CUSTOMER_REGISTRATION_REQUEST";
    public static final String PARAM_VALUE_CUSTOMER_RETURNED_TO_REQUEST_AGENT = "CUSTOMER_RETURNED_TO_REQUEST_AGENT";
    public static final String PARAM_VALUE_UI_BP_CUSTOMER_REGISTRATION_MAKER = "UI_BP_CUSTOMER_REGISTRATION_MAKER";
    public static final String PARAM_VALUE_UI_BP_CUSTOMER_REGISTRATION_REJECTED_REQUEST = "UI_BP_CUSTOMER_REGISTRATION_REJECTED_REQUEST";
    public static final String PARAM_VALUE_UI_BP_CUSTOMER_REGISTRATION_RETURNED_REQUEST = "UI_BP_CUSTOMER_REGISTRATION_RETURNED_REQUEST";
    public static final String PARAM_VALUE_UI_BP_CUSTOMER_REGISTRATION_APPROVAL = "UI_BP_CUSTOMER_REGISTRATION_APPROVAL";

    public static final String CUSTOMER_TYPE_ROLE_CUSTOMER_L0 = "L0";
    // Customer Type XML (Customer Type Drop Down)
    public static final String CUSTOMER_TYPE_ROLE_SMART_WALLET_L1 = "Smart Wallet L1";
    public static final String CUSTOMER_TYPE_ROLE_CUSTOMER_L2 = "L2";
    public static final String CUSTOMER_TYPE_ROLE_CUSTOMER_CORPORATE = "Corporate";
    //    public static final String CUSTOMER_TYPE_ROLE_CUSTOMER_PAYROLL_L0 = "Payroll L0";
    public static final String CUSTOMER_TYPE_ROLE_CUSTOMER_PAYROLL_L1 = "Smart Disbursement Solution";
    public static final String CUSTOMER_TYPE_ROLE_CUSTOMER_HRA = "HRA";
    public static final String CUSTOMER_TYPE_ROLE_CUSTOMER_L0_AMA = "AMA L0";

    public static final String DEFAULT_AGENT_CLASS_L0 = "defaultAgentClassL0";
    public static final String DEFAULT_AGENT_CLASS_L1 = "defaultAgentClassL1";
    public static final String DEFAULT_LIMIT_CLASS_L0 = "defaultLimitClassL0";
    public static final String DEFAULT_LIMIT_CLASS_L1 = "defaultLimitClassL1";
    public static final String MAX_INITIAL_DEPOSIT_L0 = "maxInitialDepositL0";
    public static final String MAX_INITIAL_DEPOSIT_L1 = "maxInitialDepositL1";
    public static final String MIN_INITIAL_DEPOSIT = "minInitialDeposit";
    public static final String MIN_INITIAL_DEPOSIT_L0 = "minInitialDepositL0";
    public static final String MIN_INITIAL_DEPOSIT_L1 = "minInitialDepositL1";

    public static final String DEFAULT_AGENT_CLASS_ID_L0 = "501398215";
    public static final String DEFAULT_AGENT_CLASS_ID_L1 = "501411601";

    public static final String DEFAULT_LIMIT_CLASS_ID_L0 = "103";
    public static final String DEFAULT_LIMIT_CLASS_ID_L1 = "103";

    public static final String PARAM_VALUE_HANDLER_REGISTRATION_APPROVAL = "PARAM_VALUE_HANDLER_REGISTRATION_APPROVAL";
    public static final String PARAM_VALUE_HANDLER_REGISTRATION_REJECTED = "PARAM_VALUE_HANDLER_REGISTRATION_REJECTED";
    public static final String PARAM_VALUE_HANDLER_REGISTRATION_RETURNED = "PARAM_VALUE_HANDLER_REGISTRATION_RETURNED";
    public static final String PARAM_VALUE_HANDLER_REGISTRATION_REQUEST = "PARAM_VALUE_HANDLER_REGISTRATION_REQUEST";
    public static final String PARAM_VALUE_EDIT_HANDLER_DETAILS = "PARAM_VALUE_EDIT_HANDLER_DETAILS";
    public static final String PARAM_VALUE_VIEW_HANDLER_DETAILS = "PARAM_VALUE_VIEW_HANDLER_DETAILS";
    public static final String EMPLOYMENT_TYPE_SALARIED = "Salaried";
    public static final String EMPLOYMENT_TYPE_SELF_EMPLOYED = "Self-Employed";

    // Lookup
    public static final String RESOURCE_BUNDLE_GET_ALL_GL_ACCOUNTS = "glAccounts";
    public static final String RESOURCE_BUNDLE_GET_ALL_PREFERED_LANGUAGE = "preferedLanguage";
    public static final String RESOURCE_BUNDLE_GET_ALL_TERRITORY_CODE_CUSTOMER = "territoryCodeCustomer";
    public static final String RESOURCE_BUNDLE_GET_ALL_TEHSIL_DISTRICT_CODE = "tehsildistrict";
    public static final String RESOURCE_BUNDLE_GET_ALL_AREA_CODE = "area";
    public static final String RESOURCE_BUNDLE_GET_ALL_TERRITORY_CODE_AGENT = "territoryCodeAgent";
    public static final String RESOURCE_BUNDLE_GET_ALL_NATIONALITY = "nationality";

    // Customer Type
    public static final String CUSTOMER_TYPE_L0 = "L0";
    //    public static final String CUSTOMER_TYPE_PAYROLL_L0 = "Payroll L0";
    public static final String CUSTOMER_TYPE_PAYROLL_L1 = "Smart Disbursement Solution";
    public static final String CUSTOMER_TYPE_CORPORATE_L2 = "L2";
    public static final int CUSTOMER_TYPE_ID_PAYROLL_L0 = 51;
    public static final int CUSTOMER_TYPE_ID_PAYROLL_L1 = 59;

    public static final String PRIV_BP_CUSTOMER_DEBITCARD_LINKING = "UI_BP_CUSTOMER_DEBITCARD_LINKING";
    public static final int BLACKLIST_REASON_ACTIVE = 0;
    public static final int BLACKLIST_REASON_SUSPEND = 7;
    public static final String PRIV_BULK_CUSTOMER_REG_FILE_UPLOAD = "UI_BULK_CUSTOMER_REG_UPLOAD";
    public static final String PRIV_BULK_EDIT_CUSTOMER_FILE_UPLOAD = "UI_BULK_EDIT_CUSTOMER_UPLOAD";
    public static final String PRIV_BULK_CDD_EDIT_FILE_UPLOAD = "UI_BULK_CDD_EDIT_UPLOAD";
    public static final String PRIV_UI_BULK_CDD_EDIT_FILE_CHECKER = "UI_BULK_CDD_EDIT_FILE_CHECKER";

    public static final String PRIV_UI_HANDLER_REGISTRATION_REQUEST = "UI_HANDLER_REGISTRATION_REQUEST";
    public static final String PRIV_UI_BULK_DISBURSEMENT = "UI_BULK_DISBURSEMENT";
    public static final String PRIV_UI_BULK_DISBURSEMENT_CHECKER = "UI_BULK_DISBURSEMENT_CHECKER";
    public static final String PRIV_UI_BULK_CNIC_DISBURSEMENT = "UI_BULK_CNIC_DISBURSEMENT";
    public static final String PRIV_UI_BULK_CNIC_DISBURSEMENT_CHECKER = "UI_BULK_CNIC_DISBURSEMENT_CHECKER";
    public static final String PRIV_UI_BULK_CNIC_DISBURSEMENT_REVERSAL = "UI_BULK_CNIC_DISBURSEMENT_REVERSAL";
    public static final String PRIV_UI_BULK_CNIC_DISBURSEMENT_REVERSAL_CHECKER = "UI_BULK_CNIC_DISBURSEMENT_REVERSAL_CHECKER";
    public static final String PRIV_UI_BULK_CNIC_DISBURSEMENT_REVERSAL_APPROVAL_DETAILS = "UI_BULK_CNIC_DISBURSEMENT_REVERSAL_APPROVAL_DETAILS";
    public static final String PRIV_UI_BULK_MSISDN_UPDATE = "UI_BULK_MSISDN_UPDATE";
    public static final String PRIV_UI_BULK_MSISDN_UPDATE_CHECKER = "UI_BULK_MSISDN_UPDATE_CHECKER";
    public static final String PRIV_UI_BULK_MSISDN_UPDATE_APPROVAL_DETAILS = "UI_BULK_MSISDN_UPDATE_APPROVAL_DETAILS";
    public static final String PRIV_UI_BULK_CUSTOMER_REGISTRATION_FILE_CHECKER = "UI_BULK_CUSTOMER_REGISTRATION_CHECKER";
    public static final String PRIV_UI_BULK_EDIT_CUSTOMER_FILE_CHECKER = "UI_BULK_EDIT_CUSTOMER_CHECKER";
    public static final String PRIV_UI_BULK_CUSTOMER_REGISTRATION_MAKER = "UI_BULK_CUSTOMER_REGISTRATION_MAKER";
    public static final String PRIV_UI_BULK_CUSTOMER_REGISTRATION_CHECKER = "UI_BULK_CUSTOMER_REGISTRATION_CHECKER";
    public static final String PRIV_UI_BULK_DISB_LIFECYCLE_MGT = "UI_BULK_DISB_LIFECYCLE_MGT";
    public static final String PRIV_UI_BULK_DISB_LIFECYCLE_MGT_CHECKER = "UI_BULK_DISB_LIFECYCLE_MGT_CHECKER";
    public static final String PRIV_UI_BULK_CUSTOMER_REG_LIFECYCLE_MGT_CHECKER = "UI_BULK_CUSTOMER_REG_LIFECYCLE_MGT_CHECKER";
    public static final String PRIV_UI_BULK_DISB_LIFECYCLE_MGT_DETAIL = "UI_BULK_DISB_LIFECYCLE_MGT_DETAIL";
    public static final String PRIV_UI_BULK_CNIC_DISB_LIFECYCLE_MGT = "UI_BULK_CNIC_DISB_LIFECYCLE_MGT";
    public static final String PRIV_UI_BULK_CNIC_DISB_LIFECYCLE_MGT_CHECKER = "UI_BULK_CNIC_DISB_LIFECYCLE_MGT_CHECKER";
    public static final String PRIV_UI_BULK_CNIC_DISB_LIFECYCLE_MGT_DETAIL = "UI_BULK_CNIC_DISB_LIFECYCLE_MGT_DETAIL";
    public static final String PRIV_UI_BULK_CUSTOMER_LIFECYCLE_MGT = "UI_BULK_CUSTOMER_REG_LIFECYCLE_MGT";
    public static final String PRIV_UI_BULK_CUSTOMER_LIFECYCLE_MGT_DETAIL = "UI_BULK_CUSTOMER_LIFECYCLE_MGT_DETAIL";
    public static final String PRIV_UI_BULK_DISBURSEMENT_APPROVAL_DETAILS = "UI_BULK_DISBURSEMENT_APPROVAL_DETAILS";
    public static final String PRIV_UI_BULK_CNIC_DISBURSEMENT_APPROVAL_DETAILS = "UI_BULK_CNIC_DISBURSEMENT_APPROVAL_DETAILS";
    public static final String PRIV_UI_BULK_CUSTOMER_REGISTRATION_APPROVAL_DETAILS = "UI_BULK_CUSTOMER_REGISTRATION_APPROVAL_DETAILS";
    public static final String PRIV_UI_BULK_EDIT_CUSTOMER_APPROVAL_DETAILS = "UI_BULK_EDIT_CUSTOMER_APPROVAL_DETAILS";
    public static final String PRIV_UI_BULK_CUSTOMER_REGISTRATION_RETURNED_REQ = "UI_BULK_CUSTOMER_REGISTRATION_RETURNED_REQ";
    public static final String PRIV_UI_CUSTOMER_REGISTRATION_RETURNED_REQ = "UI_CUSTOMER_REGISTRATION_RETURNED_REQ";
    public static final String PRIV_UI_HRA_CUSTOMER_REGISTRATION_RETURNED_REQ = "UI_HRA_CUSTOMER_REGISTRATION_RETURNED_REQ";
    public static final String UI_BULK_CUSTOMER_REGISTRATION_DOWNLOAD_FILE = "UI_BULK_CUSTOMER_REGISTRATION_DOWNLOAD_FILE";
    public static final String UI_BULK_CUSTOMER_REGISTRATION_UPLOAD_FILE = "UI_BULK_CUSTOMER_REGISTRATION_UPLOAD_FILE";

    public static final String REGEX_POC = "^(?=.*[1-9])[0-9+]{5}(-){1}[0-9+]{7}(-){1}[0-9]{1}$";
    public static final String REGEX_NICOP = "^(?=.*[1-9])[0-9+]{5}(-){1}[0-9+]{7}(-){1}[0-9]{1}$";
    public static final String REGEX_NAME = "[A-Za-z ]*";

    public static final String COUNTRY_CODE = "92";

    public static final String PRIV_LIMIT_SET_APPROVAL = "UI_BP_LIMIT_SET_APPROVAL";
    public static final String PRIV_LIMIT_SET_CONFIGURATION = "UI_LIMIT_SET_CONFIGURATION";

    public static final String PRIV_LIMIT_CLASS_APPROVAL = "UI_BP_LIMIT_CLASS_APPROVAL";
    public static final String PRIV_LIMIT_CLASS_CONFIGURATION = "UI_LIMIT_CLASS_CONFIGURATION";

    public static final String PRIV_BP_CREATE_ROLE = "UI_BP_CREATE_ROLE";
    public static final String PRIV_BP_FIND_EDIT_ROLE = "UI_BP_FIND_EDIT_ROLE";

    public static final String PRIV_DORMANT_REQUEST = "UI_DORMANT_REQUEST";
    public static final String PRIV_DORMANT_APPROVAL = "UI_DORMANT_APPROVAL";

    public static final String PRIV_SUSPENSION_REQUEST = "UI_SUSPENSION_REQUEST";
    public static final String PRIV_SUSPENSION_APPROVAL = "UI_SUSPENSION_APPROVAL";
    public static final String PRIV_ACCOUNT_CLOSURE_REQUEST = "UI_ACCOUNT_CLOSURE_REQUEST";
    public static final String PRIV_ACCOUNT_CLOSURE_APPROVAL = "UI_ACCOUNT_CLOSURE_APPROVAL";
    public static final String PRIV_SUSPENSION_RETURN = "UI_SUSPENSION_RETURN";
    public static final String PRIV_PDU_APPROVAL = "UI_PDU_APPROVAL";
    public static final String ACTION_REGISTER = "1";
    public static final String REGEX_ALPHA_NUMARIC_LOWER_CASE = "^[a-z0-9_]+";

    public static final String PRIV_UI_BP_AGENT_SEARCH_PAGE = "UI_BP_AGENT_SEARCH_PAGE";
    public static final String TRANSACTION_STATUS_OK = "OK";


    public static final String BANK_FEE = "Same_Bank_Fee";
    public static final String BANK_COMMISSION = "Same_Bank_Commission";

    public static final String CUSTOMER_TYPE_L2_REQUEST = "customertypeL2";
    public static final String REGISTRATION_TYPE_LEVEL2_CUSTOMER = "L2";
    public static final String PRIV_UI_LEVEL2_CUSTOMER_REGISTRATION = "UI_LEVEL2_CUSTOMER_REGISTRATION_PAGE";
    public static final String PRIV_UI_L1_AND_L2_CUSTOMER_REGISTRATION = "UI_L1_AND_L2_CUSTOMER_REGISTRATION_PAGE";
    public static final String PRIV_UI_LEVEL2_CUSTOMER_REGISTRATION_CHECKER = "UI_LEVEL2_CUSTOMER_REGISTRATION_CHECKER";
    public static final String PRIV_UI_LEVEL2_CUSTOMER_REGISTRATION_SEARCH = "UI_LEVEL2_REGISTRATION_SEARCH";
    public static final String PRIV_UI_BLACKLISTING_AGENT_CUSTOMER = "UI_BLACKLISTING_AGENT_CUSTOMER";
    public static final String PRIV_UI_BLACKLISTING_AGENT_CUSTOMER_APPROVAL = "UI_BLACKLISTING_AGENT_CUSTOMER_APPROVAL";

    public static final String PRIV_UI_HRA_CUSTOMER_REGISTRATION = "UI_HRA_CUSTOMER_REGISTRATION_PAGE";
    public static final String PRIV_UI_BP_HRA_CUSTOMER_REGISTRATION_WITHOUT_BIOMETRIC = "BP_UI_HRA_CUSTOMER_REGISTRATION_WITHOUT_BIOMETRIC";

    public static final String PRIV_UI_RECEIVE_MONEY_PAGE = "UI_RECEIVE_MONEY_PAGE";

    public static final String PRIV_UI_INDIVIDUAL_LEVEL_UPGRADE_PAGE = "UI_INDIVIDUAL_LEVEL_UPGRADE_PAGE";
    public static final String PRIV_UI_INDIVIDUAL_LEVEL_UPGRADE_APPROVAL_PAGE = "UI_INDIVIDUAL_LEVEL_UPGRADE_APPROVAL_PAGE";


    public static final String PRIV_UI_BULK_LEVEL_UPGRADE_PAGE = "UI_BULK_LEVEL_UPGRADE_PAGE_MAKER";
    public static final String PRIV_UI_BULK_LEVEL_UPGRADE_APPROVAL_PAGE = "UI_BULK_LEVEL_UPGRADE_APPROVAL_PAGE_CHECKER";


    public static final String PAGE_TYPE_SUSPEND_UNSUSPEND_APPROVAL = "PAGE_TYPE_SUSPEND_UNSUSPEND_APPROVAL";
    public static final String PAGE_TYPE_ACCOUNT_CLOSURE_RETURN = "PAGE_TYPE_ACCOUNT_CLOSURE_RETURN";

    public static final String PAGE_TYPE_ACCOUNT_CLOSURE_APPROVAL = "PAGE_TYPE_ACCOUNT_CLOSURE_APPROVAL";
    public static final String PAGE_TYPE_SUSPEND_UNSUSPEND_RETURN = "PAGE_TYPE_SUSPEND_UNSUSPEND_RETURN";

    public static final String PAGE_TYPE_AGENT_CUSTOMER_BLACKLISTING_APPROVAL = "PAGE_TYPE_AGENT_CUSTOMER_BLACKLISTING_APPROVAL";
    public static final String PAGE_TYPE_AGENT_CUSTOMER_BLACKLISTING_RETURN = "PAGE_TYPE_AGENT_CUSTOMER_BLACKLISTING_RETURN";
    public static final String RESOURCE_BUNDLE_BULK_CHECKER_ACTIONS = "bulkCheckerActions";
    public static final String RESOURCE_BUNDLE_BULK_ACCOUNT_CLOSURE_CHECKER_ACTIONS = "bulkAccountClosureCheckerActions";

    public static final String PRIV_UI_CUSTOMER_REGISTRATION_CHECKER = "UI_CUSTOMER_REGISTRATION_CHECKER";
    public static final String PRIV_UI_HRA_CUSTOMER_REGISTRATION_CHECKER = "UI_HRA_CUSTOMER_REGISTRATION_CHECKER";

    public static final String PRIV_UI_AGENTCLASS_APPROVAL = "UI_AGENT_CLASS_APPROVAL";
    public static final String PARAM_LEVEL2_CUSTOMER_REGISTRATION_MAKER = "LEVEL2_CUSTOMER_REGISTRATION_MAKER";
    public static final String PRIV_UI_CUSTOMER_EDIT_MAKER = "UI_CUSTOMER_EDIT_MAKER";
    public static final String PRIV_UI_SEARCH_CUSTOMER_VIEW = "SEARCH_VIEW_CUSTOMER";
    public static final String PRIV_UI_HRA_CUSTOMER_EDIT_MAKER = "UI_HRA_CUSTOMER_EDIT_MAKER";
    public static final String PRIV_SEARCH_HRA_CUSTOMER_VIEW = "SEARCH_HRA_CUSTOMER_VIEW";

    public static final String PRIV_UI_CUSTOMER_EDIT_CHECKER = "UI_CUSTOMER_EDIT_CHECKER";
    public static final String PRIV_UI_HRA_CUSTOMER_EDIT_CHECKER = "UI_HRA_CUSTOMER_EDIT_CHECKER";
    public static final String PRIV_UI_CUSTOMER_EDIT_RETURN = "UI_CUSTOMER_EDIT_RETURN";
    public static final String PRIV_UI_HRA_CUSTOMER_EDIT_RETURN = "UI_HRA_CUSTOMER_EDIT_RETURN";

    public static final String PRIV_UI_KAFALA_EDIT_MAKER = "UI_KAFALA_EDIT_MAKER";
    public static final String PRIV_UI_KAFALA_EDIT_CHECKER = "UI_KAFALA_EDIT_CHECKER";

    public static final String LOOKUP_PROVINCES = "provinces";
    public static final String PARAM_AGENT_CLASS_EDIT_APPROVAL = "AGENT_CLASS_EDIT_APPROVAL";

    public static final String PRIV_UI_LEVEL1_CUSTOMER_REGISTRATION = "UI_LEVEL1_CUSTOMER_REGISTRATION_PAGE";
    public static final String PRIV_UI_LEVEL0_CUSTOMER_REGISTRATION = "UI_LEVEL0_CUSTOMER_REGISTRATION_PAGE";
    public static final String PRIV_UI_KAFALA_CUSTOMER_REGISTRATION = "UI_KAFALA_CUSTOMER_REGISTRATION_PAGE";

    public static final String PRIV_UI_BP_HANDLER_SEARCH_PAGE = "UI_BP_HANDLER_SEARCH_PAGE";
    public static final String PRIV_UI_HANDLER_REGISTRATION_APPROVAL = "UI_BP_HANDLER_APPROVAL_PAGE";
    public static final String PRIV_UI_HANDLER_REGISTRATION_RETURNED = "UI_BP_HANDLER_RETURN_PAGE";

    public static final String ORG_UNIT = "01";
    public static final int SOURCE_MODULE_BACK_OFFICE_TRANSACTIONS = 20;
    public static final int SOURCE_MODULE_COC_REMMITTANCE = 25;
    public static final String TRANSACTION_TYPE_COC_REMMITTANCE = "COC Remittance Credit";


    public static final String UI_REVERSAL_TRANSACTION_APPROVAL = "UI_REVERSAL_TRANSACTION_APPROVAL";

    public static final String PRIV_UI_GET_CONSUMED_LIMITS = "UI_GET_CONSUMED_LIMITS";

    public static final long UI_USE_CASE_IBFT = 1021L;
    public static final long UI_USE_CASE_LFT = 1022L;
    public static final long UI_USE_CASE_UBP = 1023L;
    public static final long UI_USE_CASE_ATM_CASH_WITHDRAWAL = 1025L;
    public static final long UI_USE_CASE_LFT_AMA = 2067L;
    public static final long UI_USE_CASE_UPB_AMA = 2069L;

    public static final long UI_USE_CASE_IBFT_OBDX = 1069L;
    public static final long UI_USE_CASE_IBFT_AMA = 2071L;
    public static final long UI_USE_CASE_WALLET_TO_WALLET_AMA = 2073L;

    public static final long UI_USE_CASE_GL_TO_MOBILE_WALLET = 1041L;
    public static final long UI_USE_CASE_MOBILE_WALLET_TO_GL = 1042L;

    public static final long UI_USE_CASE_SVA_TO_SVA = 1043L;
    public static final long UI_USE_CASE_GL_TO_GL = 1044L;
    public static final long UI_USE_CASE_GL_TO_CBA = 1045L;
    public static final long UI_USE_CASE_CBA_TO_GL = 1046L;
    public static final int IDENTITY_TYPE_CNIC = 2;
    public static final int IDENTITY_TYPE_NTN = 4;


    public static final String CUSTOMER_TYPE_CORPORATE = "Corporate Customer";
    public static final long CUSTOMER_TYPE_HRA = 54;
    public static final long CUSTOMER_TYPE_AMA_L0 = 58;


    public static final long UI_USE_CASE_CBA_TO_SVA = 1047L;
    public static final long UI_USE_CASE_SVA_TO_CBA = 1048L;
    public static final String PRIV_UI_BULK_ACCOUNT_CLOSURE_UPLOAD = "UI_BULK_ACCOUNT_CLOSURE_UPLOAD";
    public static final String PRIV_UI_BULK_ACCOUNT_CLOSURE_CHECKER = "UI_BULK_ACCOUNT_CLOSURE_CHECKER";
    public static final String PRIV_UI_BULK_ACCOUNT_CLOSURE_APPROVAL_DETAILS = "UI_BULK_ACCOUNT_CLOSURE_APPROVAL_DETAILS";

    public static final String PRIV_UI_BULK_ACCOUNT_SUSPENSION_UPLOAD = "UI_BULK_ACCOUNT_SUSPENSION_UPLOAD";
    public static final String PRIV_UI_BULK_ACCOUNT_SUSPENSION_CHECKER = "UI_BULK_ACCOUNT_SUSPENSION_CHECKER";
    public static final String PRIV_UI_BULK_ACCOUNT_SUSPENSION_APPROVAL_DETAILS = "UI_BULK_ACCOUNT_SUSPENSION_APPROVAL_DETAILS";

    public static final String PARAM_UN_COLLECTED = "UNCOLLECTED";
    public static final int ERROR_PAYER_SINGLE_LIMIT = 12026;
    public static final int USE_CASE_ATM_CASH_WITHDRAWAL_REVERSAL = 1026;
    public static final String KAFALAH_POLICY_ACTIVE = "Y";
    public static final String KAFALAH_POLICY_IN_ACTIVE = "N";
    public static final String ERROR_MAX_BALANCE_LIMIT_EXCEEDED_MSG = "Customer's max balance limit is exceeding";
    public static final String ERROR_EXTERNAL_TRANSACTION_SINGLE_MINIMUM_UNDERRUN_MSG = "Customer's single transaction limit is hit";
    public static final int BULK_REC_STATUS_DE_ACTIVATE = 6;
    public static final int BULK_REC_STATUS_ACTIVATE = 7;

    public static final int USE_CASE_ID_GL_TO_SVA = 1041;
    public static final int USE_CASE_ID_SVA_TO_SVA = 1043;
    public static final int USE_CASE_ID_BA_TO_SVA = 1047;
    public static final String PRIV_UI_CUSTOMER_EDIT_DEBIT_BLOCK_CHECKER = "PRIV_UI_CUSTOMER_EDIT_DEBIT_BLOCK_CHECKER";
    public static final Integer MODULE_ID_CUSTOMER_IBFT_FEE_CHARGES =47 ;
    public static final String REGEX_ALPHANUMERIC_PLUS_UNDERSCORE_HYPHEN = "^[-_0-9a-zA-Z ']*$";

}

