@isTest
private class OASOrgApacheSlingDiscoveryOakConfigPTest {
    @isTest
    private static void equalsSameInstance() {
        OASOrgApacheSlingDiscoveryOakConfigP orgApacheSlingDiscoveryOakConfigProperties1 = OASOrgApacheSlingDiscoveryOakConfigP.getExample();
        OASOrgApacheSlingDiscoveryOakConfigP orgApacheSlingDiscoveryOakConfigProperties2 = orgApacheSlingDiscoveryOakConfigProperties1;
        OASOrgApacheSlingDiscoveryOakConfigP orgApacheSlingDiscoveryOakConfigProperties3 = new OASOrgApacheSlingDiscoveryOakConfigP();
        OASOrgApacheSlingDiscoveryOakConfigP orgApacheSlingDiscoveryOakConfigProperties4 = orgApacheSlingDiscoveryOakConfigProperties3;

        System.assert(orgApacheSlingDiscoveryOakConfigProperties1.equals(orgApacheSlingDiscoveryOakConfigProperties2));
        System.assert(orgApacheSlingDiscoveryOakConfigProperties2.equals(orgApacheSlingDiscoveryOakConfigProperties1));
        System.assert(orgApacheSlingDiscoveryOakConfigProperties1.equals(orgApacheSlingDiscoveryOakConfigProperties1));
        System.assert(orgApacheSlingDiscoveryOakConfigProperties3.equals(orgApacheSlingDiscoveryOakConfigProperties4));
        System.assert(orgApacheSlingDiscoveryOakConfigProperties4.equals(orgApacheSlingDiscoveryOakConfigProperties3));
        System.assert(orgApacheSlingDiscoveryOakConfigProperties3.equals(orgApacheSlingDiscoveryOakConfigProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOrgApacheSlingDiscoveryOakConfigP orgApacheSlingDiscoveryOakConfigProperties1 = OASOrgApacheSlingDiscoveryOakConfigP.getExample();
        OASOrgApacheSlingDiscoveryOakConfigP orgApacheSlingDiscoveryOakConfigProperties2 = OASOrgApacheSlingDiscoveryOakConfigP.getExample();
        OASOrgApacheSlingDiscoveryOakConfigP orgApacheSlingDiscoveryOakConfigProperties3 = new OASOrgApacheSlingDiscoveryOakConfigP();
        OASOrgApacheSlingDiscoveryOakConfigP orgApacheSlingDiscoveryOakConfigProperties4 = new OASOrgApacheSlingDiscoveryOakConfigP();

        System.assert(orgApacheSlingDiscoveryOakConfigProperties1.equals(orgApacheSlingDiscoveryOakConfigProperties2));
        System.assert(orgApacheSlingDiscoveryOakConfigProperties2.equals(orgApacheSlingDiscoveryOakConfigProperties1));
        System.assert(orgApacheSlingDiscoveryOakConfigProperties3.equals(orgApacheSlingDiscoveryOakConfigProperties4));
        System.assert(orgApacheSlingDiscoveryOakConfigProperties4.equals(orgApacheSlingDiscoveryOakConfigProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOrgApacheSlingDiscoveryOakConfigP orgApacheSlingDiscoveryOakConfigProperties1 = OASOrgApacheSlingDiscoveryOakConfigP.getExample();
        OASOrgApacheSlingDiscoveryOakConfigP orgApacheSlingDiscoveryOakConfigProperties2 = new OASOrgApacheSlingDiscoveryOakConfigP();

        System.assertEquals(false, orgApacheSlingDiscoveryOakConfigProperties1.equals('foo'));
        System.assertEquals(false, orgApacheSlingDiscoveryOakConfigProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOrgApacheSlingDiscoveryOakConfigP orgApacheSlingDiscoveryOakConfigProperties1 = OASOrgApacheSlingDiscoveryOakConfigP.getExample();
        OASOrgApacheSlingDiscoveryOakConfigP orgApacheSlingDiscoveryOakConfigProperties2 = new OASOrgApacheSlingDiscoveryOakConfigP();
        OASOrgApacheSlingDiscoveryOakConfigP orgApacheSlingDiscoveryOakConfigProperties3;

        System.assertEquals(false, orgApacheSlingDiscoveryOakConfigProperties1.equals(orgApacheSlingDiscoveryOakConfigProperties3));
        System.assertEquals(false, orgApacheSlingDiscoveryOakConfigProperties2.equals(orgApacheSlingDiscoveryOakConfigProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOrgApacheSlingDiscoveryOakConfigP orgApacheSlingDiscoveryOakConfigProperties1 = OASOrgApacheSlingDiscoveryOakConfigP.getExample();
        OASOrgApacheSlingDiscoveryOakConfigP orgApacheSlingDiscoveryOakConfigProperties2 = new OASOrgApacheSlingDiscoveryOakConfigP();

        System.assertEquals(orgApacheSlingDiscoveryOakConfigProperties1.hashCode(), orgApacheSlingDiscoveryOakConfigProperties1.hashCode());
        System.assertEquals(orgApacheSlingDiscoveryOakConfigProperties2.hashCode(), orgApacheSlingDiscoveryOakConfigProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOrgApacheSlingDiscoveryOakConfigP orgApacheSlingDiscoveryOakConfigProperties1 = OASOrgApacheSlingDiscoveryOakConfigP.getExample();
        OASOrgApacheSlingDiscoveryOakConfigP orgApacheSlingDiscoveryOakConfigProperties2 = OASOrgApacheSlingDiscoveryOakConfigP.getExample();
        OASOrgApacheSlingDiscoveryOakConfigP orgApacheSlingDiscoveryOakConfigProperties3 = new OASOrgApacheSlingDiscoveryOakConfigP();
        OASOrgApacheSlingDiscoveryOakConfigP orgApacheSlingDiscoveryOakConfigProperties4 = new OASOrgApacheSlingDiscoveryOakConfigP();

        System.assert(orgApacheSlingDiscoveryOakConfigProperties1.equals(orgApacheSlingDiscoveryOakConfigProperties2));
        System.assert(orgApacheSlingDiscoveryOakConfigProperties3.equals(orgApacheSlingDiscoveryOakConfigProperties4));
        System.assertEquals(orgApacheSlingDiscoveryOakConfigProperties1.hashCode(), orgApacheSlingDiscoveryOakConfigProperties2.hashCode());
        System.assertEquals(orgApacheSlingDiscoveryOakConfigProperties3.hashCode(), orgApacheSlingDiscoveryOakConfigProperties4.hashCode());
    }
}
