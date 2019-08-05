@isTest
private class OASOrgApacheSlingTracerInternalLogTrTest {
    @isTest
    private static void equalsSameInstance() {
        OASOrgApacheSlingTracerInternalLogTr orgApacheSlingTracerInternalLogTracerProperties1 = OASOrgApacheSlingTracerInternalLogTr.getExample();
        OASOrgApacheSlingTracerInternalLogTr orgApacheSlingTracerInternalLogTracerProperties2 = orgApacheSlingTracerInternalLogTracerProperties1;
        OASOrgApacheSlingTracerInternalLogTr orgApacheSlingTracerInternalLogTracerProperties3 = new OASOrgApacheSlingTracerInternalLogTr();
        OASOrgApacheSlingTracerInternalLogTr orgApacheSlingTracerInternalLogTracerProperties4 = orgApacheSlingTracerInternalLogTracerProperties3;

        System.assert(orgApacheSlingTracerInternalLogTracerProperties1.equals(orgApacheSlingTracerInternalLogTracerProperties2));
        System.assert(orgApacheSlingTracerInternalLogTracerProperties2.equals(orgApacheSlingTracerInternalLogTracerProperties1));
        System.assert(orgApacheSlingTracerInternalLogTracerProperties1.equals(orgApacheSlingTracerInternalLogTracerProperties1));
        System.assert(orgApacheSlingTracerInternalLogTracerProperties3.equals(orgApacheSlingTracerInternalLogTracerProperties4));
        System.assert(orgApacheSlingTracerInternalLogTracerProperties4.equals(orgApacheSlingTracerInternalLogTracerProperties3));
        System.assert(orgApacheSlingTracerInternalLogTracerProperties3.equals(orgApacheSlingTracerInternalLogTracerProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOrgApacheSlingTracerInternalLogTr orgApacheSlingTracerInternalLogTracerProperties1 = OASOrgApacheSlingTracerInternalLogTr.getExample();
        OASOrgApacheSlingTracerInternalLogTr orgApacheSlingTracerInternalLogTracerProperties2 = OASOrgApacheSlingTracerInternalLogTr.getExample();
        OASOrgApacheSlingTracerInternalLogTr orgApacheSlingTracerInternalLogTracerProperties3 = new OASOrgApacheSlingTracerInternalLogTr();
        OASOrgApacheSlingTracerInternalLogTr orgApacheSlingTracerInternalLogTracerProperties4 = new OASOrgApacheSlingTracerInternalLogTr();

        System.assert(orgApacheSlingTracerInternalLogTracerProperties1.equals(orgApacheSlingTracerInternalLogTracerProperties2));
        System.assert(orgApacheSlingTracerInternalLogTracerProperties2.equals(orgApacheSlingTracerInternalLogTracerProperties1));
        System.assert(orgApacheSlingTracerInternalLogTracerProperties3.equals(orgApacheSlingTracerInternalLogTracerProperties4));
        System.assert(orgApacheSlingTracerInternalLogTracerProperties4.equals(orgApacheSlingTracerInternalLogTracerProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOrgApacheSlingTracerInternalLogTr orgApacheSlingTracerInternalLogTracerProperties1 = OASOrgApacheSlingTracerInternalLogTr.getExample();
        OASOrgApacheSlingTracerInternalLogTr orgApacheSlingTracerInternalLogTracerProperties2 = new OASOrgApacheSlingTracerInternalLogTr();

        System.assertEquals(false, orgApacheSlingTracerInternalLogTracerProperties1.equals('foo'));
        System.assertEquals(false, orgApacheSlingTracerInternalLogTracerProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOrgApacheSlingTracerInternalLogTr orgApacheSlingTracerInternalLogTracerProperties1 = OASOrgApacheSlingTracerInternalLogTr.getExample();
        OASOrgApacheSlingTracerInternalLogTr orgApacheSlingTracerInternalLogTracerProperties2 = new OASOrgApacheSlingTracerInternalLogTr();
        OASOrgApacheSlingTracerInternalLogTr orgApacheSlingTracerInternalLogTracerProperties3;

        System.assertEquals(false, orgApacheSlingTracerInternalLogTracerProperties1.equals(orgApacheSlingTracerInternalLogTracerProperties3));
        System.assertEquals(false, orgApacheSlingTracerInternalLogTracerProperties2.equals(orgApacheSlingTracerInternalLogTracerProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOrgApacheSlingTracerInternalLogTr orgApacheSlingTracerInternalLogTracerProperties1 = OASOrgApacheSlingTracerInternalLogTr.getExample();
        OASOrgApacheSlingTracerInternalLogTr orgApacheSlingTracerInternalLogTracerProperties2 = new OASOrgApacheSlingTracerInternalLogTr();

        System.assertEquals(orgApacheSlingTracerInternalLogTracerProperties1.hashCode(), orgApacheSlingTracerInternalLogTracerProperties1.hashCode());
        System.assertEquals(orgApacheSlingTracerInternalLogTracerProperties2.hashCode(), orgApacheSlingTracerInternalLogTracerProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOrgApacheSlingTracerInternalLogTr orgApacheSlingTracerInternalLogTracerProperties1 = OASOrgApacheSlingTracerInternalLogTr.getExample();
        OASOrgApacheSlingTracerInternalLogTr orgApacheSlingTracerInternalLogTracerProperties2 = OASOrgApacheSlingTracerInternalLogTr.getExample();
        OASOrgApacheSlingTracerInternalLogTr orgApacheSlingTracerInternalLogTracerProperties3 = new OASOrgApacheSlingTracerInternalLogTr();
        OASOrgApacheSlingTracerInternalLogTr orgApacheSlingTracerInternalLogTracerProperties4 = new OASOrgApacheSlingTracerInternalLogTr();

        System.assert(orgApacheSlingTracerInternalLogTracerProperties1.equals(orgApacheSlingTracerInternalLogTracerProperties2));
        System.assert(orgApacheSlingTracerInternalLogTracerProperties3.equals(orgApacheSlingTracerInternalLogTracerProperties4));
        System.assertEquals(orgApacheSlingTracerInternalLogTracerProperties1.hashCode(), orgApacheSlingTracerInternalLogTracerProperties2.hashCode());
        System.assertEquals(orgApacheSlingTracerInternalLogTracerProperties3.hashCode(), orgApacheSlingTracerInternalLogTracerProperties4.hashCode());
    }
}
