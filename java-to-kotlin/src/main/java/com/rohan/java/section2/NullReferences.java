package com.rohan.java.section2;

import org.jetbrains.annotations.Nullable;

public class NullReferences {

    public static void main(String[] args) {

        // NPE
        String str = null;
        str.toUpperCase();

        // Nested Null Checks
        BankBranch bankBranch = getBankBranch();
        if (bankBranch != null) {
            Address address = bankBranch.getAddress();
            if (address != null) {
                Country country = address.getCountry();
                if (country != null) {
                    // And after diving in this waterfall, we access what we want
                }
            }
        }
    }

    @Nullable
    private static BankBranch getBankBranch() {
        return null;
    }

    class BankBranch {
        Address getAddress() {
            return new Address();
        }
    }

    class Address {
        Country getCountry() {
            return new Country();
        }
    }

    class Country {

    }

}
