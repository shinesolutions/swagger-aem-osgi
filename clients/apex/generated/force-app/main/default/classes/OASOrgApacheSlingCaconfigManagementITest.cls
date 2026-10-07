@isTest
private class OASOrgApacheSlingCaconfigManagementITest {
    @isTest
    private static void equalsSameInstance() {
        OASOrgApacheSlingCaconfigManagementI orgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties1 = OASOrgApacheSlingCaconfigManagementI.getExample();
        OASOrgApacheSlingCaconfigManagementI orgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties2 = orgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties1;
        OASOrgApacheSlingCaconfigManagementI orgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties3 = new OASOrgApacheSlingCaconfigManagementI();
        OASOrgApacheSlingCaconfigManagementI orgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties4 = orgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties3;

        System.assert(orgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties1.equals(orgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties2));
        System.assert(orgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties2.equals(orgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties1));
        System.assert(orgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties1.equals(orgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties1));
        System.assert(orgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties3.equals(orgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties4));
        System.assert(orgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties4.equals(orgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties3));
        System.assert(orgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties3.equals(orgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOrgApacheSlingCaconfigManagementI orgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties1 = OASOrgApacheSlingCaconfigManagementI.getExample();
        OASOrgApacheSlingCaconfigManagementI orgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties2 = OASOrgApacheSlingCaconfigManagementI.getExample();
        OASOrgApacheSlingCaconfigManagementI orgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties3 = new OASOrgApacheSlingCaconfigManagementI();
        OASOrgApacheSlingCaconfigManagementI orgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties4 = new OASOrgApacheSlingCaconfigManagementI();

        System.assert(orgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties1.equals(orgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties2));
        System.assert(orgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties2.equals(orgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties1));
        System.assert(orgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties3.equals(orgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties4));
        System.assert(orgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties4.equals(orgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOrgApacheSlingCaconfigManagementI orgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties1 = OASOrgApacheSlingCaconfigManagementI.getExample();
        OASOrgApacheSlingCaconfigManagementI orgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties2 = new OASOrgApacheSlingCaconfigManagementI();

        System.assertEquals(false, orgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties1.equals('foo'));
        System.assertEquals(false, orgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOrgApacheSlingCaconfigManagementI orgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties1 = OASOrgApacheSlingCaconfigManagementI.getExample();
        OASOrgApacheSlingCaconfigManagementI orgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties2 = new OASOrgApacheSlingCaconfigManagementI();
        OASOrgApacheSlingCaconfigManagementI orgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties3;

        System.assertEquals(false, orgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties1.equals(orgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties3));
        System.assertEquals(false, orgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties2.equals(orgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOrgApacheSlingCaconfigManagementI orgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties1 = OASOrgApacheSlingCaconfigManagementI.getExample();
        OASOrgApacheSlingCaconfigManagementI orgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties2 = new OASOrgApacheSlingCaconfigManagementI();

        System.assertEquals(orgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties1.hashCode(), orgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties1.hashCode());
        System.assertEquals(orgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties2.hashCode(), orgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOrgApacheSlingCaconfigManagementI orgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties1 = OASOrgApacheSlingCaconfigManagementI.getExample();
        OASOrgApacheSlingCaconfigManagementI orgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties2 = OASOrgApacheSlingCaconfigManagementI.getExample();
        OASOrgApacheSlingCaconfigManagementI orgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties3 = new OASOrgApacheSlingCaconfigManagementI();
        OASOrgApacheSlingCaconfigManagementI orgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties4 = new OASOrgApacheSlingCaconfigManagementI();

        System.assert(orgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties1.equals(orgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties2));
        System.assert(orgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties3.equals(orgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties4));
        System.assertEquals(orgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties1.hashCode(), orgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties2.hashCode());
        System.assertEquals(orgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties3.hashCode(), orgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties4.hashCode());
    }
}
