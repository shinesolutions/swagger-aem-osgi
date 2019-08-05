@isTest
private class OASOrgApacheSlingCaconfigImplOverridTest {
    @isTest
    private static void equalsSameInstance() {
        OASOrgApacheSlingCaconfigImplOverrid orgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties1 = OASOrgApacheSlingCaconfigImplOverrid.getExample();
        OASOrgApacheSlingCaconfigImplOverrid orgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties2 = orgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties1;
        OASOrgApacheSlingCaconfigImplOverrid orgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties3 = new OASOrgApacheSlingCaconfigImplOverrid();
        OASOrgApacheSlingCaconfigImplOverrid orgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties4 = orgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties3;

        System.assert(orgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties1.equals(orgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties2));
        System.assert(orgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties2.equals(orgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties1));
        System.assert(orgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties1.equals(orgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties1));
        System.assert(orgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties3.equals(orgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties4));
        System.assert(orgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties4.equals(orgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties3));
        System.assert(orgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties3.equals(orgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOrgApacheSlingCaconfigImplOverrid orgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties1 = OASOrgApacheSlingCaconfigImplOverrid.getExample();
        OASOrgApacheSlingCaconfigImplOverrid orgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties2 = OASOrgApacheSlingCaconfigImplOverrid.getExample();
        OASOrgApacheSlingCaconfigImplOverrid orgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties3 = new OASOrgApacheSlingCaconfigImplOverrid();
        OASOrgApacheSlingCaconfigImplOverrid orgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties4 = new OASOrgApacheSlingCaconfigImplOverrid();

        System.assert(orgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties1.equals(orgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties2));
        System.assert(orgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties2.equals(orgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties1));
        System.assert(orgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties3.equals(orgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties4));
        System.assert(orgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties4.equals(orgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOrgApacheSlingCaconfigImplOverrid orgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties1 = OASOrgApacheSlingCaconfigImplOverrid.getExample();
        OASOrgApacheSlingCaconfigImplOverrid orgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties2 = new OASOrgApacheSlingCaconfigImplOverrid();

        System.assertEquals(false, orgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties1.equals('foo'));
        System.assertEquals(false, orgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOrgApacheSlingCaconfigImplOverrid orgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties1 = OASOrgApacheSlingCaconfigImplOverrid.getExample();
        OASOrgApacheSlingCaconfigImplOverrid orgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties2 = new OASOrgApacheSlingCaconfigImplOverrid();
        OASOrgApacheSlingCaconfigImplOverrid orgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties3;

        System.assertEquals(false, orgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties1.equals(orgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties3));
        System.assertEquals(false, orgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties2.equals(orgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOrgApacheSlingCaconfigImplOverrid orgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties1 = OASOrgApacheSlingCaconfigImplOverrid.getExample();
        OASOrgApacheSlingCaconfigImplOverrid orgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties2 = new OASOrgApacheSlingCaconfigImplOverrid();

        System.assertEquals(orgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties1.hashCode(), orgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties1.hashCode());
        System.assertEquals(orgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties2.hashCode(), orgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOrgApacheSlingCaconfigImplOverrid orgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties1 = OASOrgApacheSlingCaconfigImplOverrid.getExample();
        OASOrgApacheSlingCaconfigImplOverrid orgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties2 = OASOrgApacheSlingCaconfigImplOverrid.getExample();
        OASOrgApacheSlingCaconfigImplOverrid orgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties3 = new OASOrgApacheSlingCaconfigImplOverrid();
        OASOrgApacheSlingCaconfigImplOverrid orgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties4 = new OASOrgApacheSlingCaconfigImplOverrid();

        System.assert(orgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties1.equals(orgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties2));
        System.assert(orgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties3.equals(orgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties4));
        System.assertEquals(orgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties1.hashCode(), orgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties2.hashCode());
        System.assertEquals(orgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties3.hashCode(), orgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASOrgApacheSlingCaconfigImplOverrid orgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties = new OASOrgApacheSlingCaconfigImplOverrid();
        Map<String, String> propertyMappings = orgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties.getPropertyMappings();
        System.assertEquals('serviceRanking', propertyMappings.get('service.ranking'));
    }
}
