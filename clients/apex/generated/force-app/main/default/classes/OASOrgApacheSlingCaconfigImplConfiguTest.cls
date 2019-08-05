@isTest
private class OASOrgApacheSlingCaconfigImplConfiguTest {
    @isTest
    private static void equalsSameInstance() {
        OASOrgApacheSlingCaconfigImplConfigu orgApacheSlingCaconfigImplConfigurationResolverImplProperties1 = OASOrgApacheSlingCaconfigImplConfigu.getExample();
        OASOrgApacheSlingCaconfigImplConfigu orgApacheSlingCaconfigImplConfigurationResolverImplProperties2 = orgApacheSlingCaconfigImplConfigurationResolverImplProperties1;
        OASOrgApacheSlingCaconfigImplConfigu orgApacheSlingCaconfigImplConfigurationResolverImplProperties3 = new OASOrgApacheSlingCaconfigImplConfigu();
        OASOrgApacheSlingCaconfigImplConfigu orgApacheSlingCaconfigImplConfigurationResolverImplProperties4 = orgApacheSlingCaconfigImplConfigurationResolverImplProperties3;

        System.assert(orgApacheSlingCaconfigImplConfigurationResolverImplProperties1.equals(orgApacheSlingCaconfigImplConfigurationResolverImplProperties2));
        System.assert(orgApacheSlingCaconfigImplConfigurationResolverImplProperties2.equals(orgApacheSlingCaconfigImplConfigurationResolverImplProperties1));
        System.assert(orgApacheSlingCaconfigImplConfigurationResolverImplProperties1.equals(orgApacheSlingCaconfigImplConfigurationResolverImplProperties1));
        System.assert(orgApacheSlingCaconfigImplConfigurationResolverImplProperties3.equals(orgApacheSlingCaconfigImplConfigurationResolverImplProperties4));
        System.assert(orgApacheSlingCaconfigImplConfigurationResolverImplProperties4.equals(orgApacheSlingCaconfigImplConfigurationResolverImplProperties3));
        System.assert(orgApacheSlingCaconfigImplConfigurationResolverImplProperties3.equals(orgApacheSlingCaconfigImplConfigurationResolverImplProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOrgApacheSlingCaconfigImplConfigu orgApacheSlingCaconfigImplConfigurationResolverImplProperties1 = OASOrgApacheSlingCaconfigImplConfigu.getExample();
        OASOrgApacheSlingCaconfigImplConfigu orgApacheSlingCaconfigImplConfigurationResolverImplProperties2 = OASOrgApacheSlingCaconfigImplConfigu.getExample();
        OASOrgApacheSlingCaconfigImplConfigu orgApacheSlingCaconfigImplConfigurationResolverImplProperties3 = new OASOrgApacheSlingCaconfigImplConfigu();
        OASOrgApacheSlingCaconfigImplConfigu orgApacheSlingCaconfigImplConfigurationResolverImplProperties4 = new OASOrgApacheSlingCaconfigImplConfigu();

        System.assert(orgApacheSlingCaconfigImplConfigurationResolverImplProperties1.equals(orgApacheSlingCaconfigImplConfigurationResolverImplProperties2));
        System.assert(orgApacheSlingCaconfigImplConfigurationResolverImplProperties2.equals(orgApacheSlingCaconfigImplConfigurationResolverImplProperties1));
        System.assert(orgApacheSlingCaconfigImplConfigurationResolverImplProperties3.equals(orgApacheSlingCaconfigImplConfigurationResolverImplProperties4));
        System.assert(orgApacheSlingCaconfigImplConfigurationResolverImplProperties4.equals(orgApacheSlingCaconfigImplConfigurationResolverImplProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOrgApacheSlingCaconfigImplConfigu orgApacheSlingCaconfigImplConfigurationResolverImplProperties1 = OASOrgApacheSlingCaconfigImplConfigu.getExample();
        OASOrgApacheSlingCaconfigImplConfigu orgApacheSlingCaconfigImplConfigurationResolverImplProperties2 = new OASOrgApacheSlingCaconfigImplConfigu();

        System.assertEquals(false, orgApacheSlingCaconfigImplConfigurationResolverImplProperties1.equals('foo'));
        System.assertEquals(false, orgApacheSlingCaconfigImplConfigurationResolverImplProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOrgApacheSlingCaconfigImplConfigu orgApacheSlingCaconfigImplConfigurationResolverImplProperties1 = OASOrgApacheSlingCaconfigImplConfigu.getExample();
        OASOrgApacheSlingCaconfigImplConfigu orgApacheSlingCaconfigImplConfigurationResolverImplProperties2 = new OASOrgApacheSlingCaconfigImplConfigu();
        OASOrgApacheSlingCaconfigImplConfigu orgApacheSlingCaconfigImplConfigurationResolverImplProperties3;

        System.assertEquals(false, orgApacheSlingCaconfigImplConfigurationResolverImplProperties1.equals(orgApacheSlingCaconfigImplConfigurationResolverImplProperties3));
        System.assertEquals(false, orgApacheSlingCaconfigImplConfigurationResolverImplProperties2.equals(orgApacheSlingCaconfigImplConfigurationResolverImplProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOrgApacheSlingCaconfigImplConfigu orgApacheSlingCaconfigImplConfigurationResolverImplProperties1 = OASOrgApacheSlingCaconfigImplConfigu.getExample();
        OASOrgApacheSlingCaconfigImplConfigu orgApacheSlingCaconfigImplConfigurationResolverImplProperties2 = new OASOrgApacheSlingCaconfigImplConfigu();

        System.assertEquals(orgApacheSlingCaconfigImplConfigurationResolverImplProperties1.hashCode(), orgApacheSlingCaconfigImplConfigurationResolverImplProperties1.hashCode());
        System.assertEquals(orgApacheSlingCaconfigImplConfigurationResolverImplProperties2.hashCode(), orgApacheSlingCaconfigImplConfigurationResolverImplProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOrgApacheSlingCaconfigImplConfigu orgApacheSlingCaconfigImplConfigurationResolverImplProperties1 = OASOrgApacheSlingCaconfigImplConfigu.getExample();
        OASOrgApacheSlingCaconfigImplConfigu orgApacheSlingCaconfigImplConfigurationResolverImplProperties2 = OASOrgApacheSlingCaconfigImplConfigu.getExample();
        OASOrgApacheSlingCaconfigImplConfigu orgApacheSlingCaconfigImplConfigurationResolverImplProperties3 = new OASOrgApacheSlingCaconfigImplConfigu();
        OASOrgApacheSlingCaconfigImplConfigu orgApacheSlingCaconfigImplConfigurationResolverImplProperties4 = new OASOrgApacheSlingCaconfigImplConfigu();

        System.assert(orgApacheSlingCaconfigImplConfigurationResolverImplProperties1.equals(orgApacheSlingCaconfigImplConfigurationResolverImplProperties2));
        System.assert(orgApacheSlingCaconfigImplConfigurationResolverImplProperties3.equals(orgApacheSlingCaconfigImplConfigurationResolverImplProperties4));
        System.assertEquals(orgApacheSlingCaconfigImplConfigurationResolverImplProperties1.hashCode(), orgApacheSlingCaconfigImplConfigurationResolverImplProperties2.hashCode());
        System.assertEquals(orgApacheSlingCaconfigImplConfigurationResolverImplProperties3.hashCode(), orgApacheSlingCaconfigImplConfigurationResolverImplProperties4.hashCode());
    }
}
