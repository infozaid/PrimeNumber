package com.mobiliser.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class AnyTest {

    public static final int value=58;

    public static boolean isIdentityAlreadyExistWithoutBankUsers() {

        List<Integer> identityList = Arrays.asList(0);
        int identity;
        if (identityList != null && identityList.size() > 1) {
            return true;
        } else {
            identity = identityList == null ? null : identityList.get(0);
        }
        if (identity != 0) {


            int identityId = value;

            if (identityId == CustomConstants.CUSTOMER_TYPE_HRA
                    || identityId == CustomConstants.CUSTOMER_TYPE_PAYROLL_L1 || identityId == CustomConstants.CUSTOMER_TYPE_CORPORATE_L2
                    || identityId == CustomConstants.CUSTOMER_TYPE_SMART_WALLET_L1 || identityId == CustomConstants.CUSTOMER_TYPE_AMA_L0) {

                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,4,5,8,9};
        int N= arr.length;

        int diff = arr[0];

        for(int i=0; i<N; i++){

            while(arr[i]-i>diff){
                System.out.println((i+diff)+" ");
                diff++;
            }
        }
    }
}

