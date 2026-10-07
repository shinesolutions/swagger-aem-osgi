@isTest
private class OASOrgApacheJackrabbitOakSegmentAzurTest {
    @isTest
    private static void equalsSameInstance() {
        OASOrgApacheJackrabbitOakSegmentAzur orgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties1 = OASOrgApacheJackrabbitOakSegmentAzur.getExample();
        OASOrgApacheJackrabbitOakSegmentAzur orgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties2 = orgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties1;
        OASOrgApacheJackrabbitOakSegmentAzur orgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties3 = new OASOrgApacheJackrabbitOakSegmentAzur();
        OASOrgApacheJackrabbitOakSegmentAzur orgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties4 = orgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties3;

        System.assert(orgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties1.equals(orgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties2));
        System.assert(orgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties2.equals(orgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties1));
        System.assert(orgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties1.equals(orgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties1));
        System.assert(orgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties3.equals(orgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties4));
        System.assert(orgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties4.equals(orgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties3));
        System.assert(orgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties3.equals(orgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOrgApacheJackrabbitOakSegmentAzur orgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties1 = OASOrgApacheJackrabbitOakSegmentAzur.getExample();
        OASOrgApacheJackrabbitOakSegmentAzur orgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties2 = OASOrgApacheJackrabbitOakSegmentAzur.getExample();
        OASOrgApacheJackrabbitOakSegmentAzur orgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties3 = new OASOrgApacheJackrabbitOakSegmentAzur();
        OASOrgApacheJackrabbitOakSegmentAzur orgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties4 = new OASOrgApacheJackrabbitOakSegmentAzur();

        System.assert(orgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties1.equals(orgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties2));
        System.assert(orgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties2.equals(orgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties1));
        System.assert(orgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties3.equals(orgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties4));
        System.assert(orgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties4.equals(orgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOrgApacheJackrabbitOakSegmentAzur orgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties1 = OASOrgApacheJackrabbitOakSegmentAzur.getExample();
        OASOrgApacheJackrabbitOakSegmentAzur orgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties2 = new OASOrgApacheJackrabbitOakSegmentAzur();

        System.assertEquals(false, orgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties1.equals('foo'));
        System.assertEquals(false, orgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOrgApacheJackrabbitOakSegmentAzur orgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties1 = OASOrgApacheJackrabbitOakSegmentAzur.getExample();
        OASOrgApacheJackrabbitOakSegmentAzur orgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties2 = new OASOrgApacheJackrabbitOakSegmentAzur();
        OASOrgApacheJackrabbitOakSegmentAzur orgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties3;

        System.assertEquals(false, orgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties1.equals(orgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties3));
        System.assertEquals(false, orgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties2.equals(orgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOrgApacheJackrabbitOakSegmentAzur orgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties1 = OASOrgApacheJackrabbitOakSegmentAzur.getExample();
        OASOrgApacheJackrabbitOakSegmentAzur orgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties2 = new OASOrgApacheJackrabbitOakSegmentAzur();

        System.assertEquals(orgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties1.hashCode(), orgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties1.hashCode());
        System.assertEquals(orgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties2.hashCode(), orgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOrgApacheJackrabbitOakSegmentAzur orgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties1 = OASOrgApacheJackrabbitOakSegmentAzur.getExample();
        OASOrgApacheJackrabbitOakSegmentAzur orgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties2 = OASOrgApacheJackrabbitOakSegmentAzur.getExample();
        OASOrgApacheJackrabbitOakSegmentAzur orgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties3 = new OASOrgApacheJackrabbitOakSegmentAzur();
        OASOrgApacheJackrabbitOakSegmentAzur orgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties4 = new OASOrgApacheJackrabbitOakSegmentAzur();

        System.assert(orgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties1.equals(orgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties2));
        System.assert(orgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties3.equals(orgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties4));
        System.assertEquals(orgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties1.hashCode(), orgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties2.hashCode());
        System.assertEquals(orgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties3.hashCode(), orgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties4.hashCode());
    }
}
