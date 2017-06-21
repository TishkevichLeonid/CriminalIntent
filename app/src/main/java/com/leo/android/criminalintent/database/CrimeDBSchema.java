package com.leo.android.criminalintent.database;

/**
 * Created by leonidtiskevic on 21.06.17.
 */

public class CrimeDBSchema {
    public static final class CrimeTable{
        public static final String NAME = "crimes";

        public static final class Cols{
            public static final String UUID = "uuid";
            public static final String TITLE = "title";
            public static final String DATE = "date";
            public static final String TIME = "time";
            public static final String SOLVED = "solved";
        }
    }
}
