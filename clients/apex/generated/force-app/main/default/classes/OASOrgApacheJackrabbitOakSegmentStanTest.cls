@isTest
private class OASOrgApacheJackrabbitOakSegmentStanTest {
    @isTest
    private static void equalsSameInstance() {
        OASOrgApacheJackrabbitOakSegmentStan orgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties1 = OASOrgApacheJackrabbitOakSegmentStan.getExample();
        OASOrgApacheJackrabbitOakSegmentStan orgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties2 = orgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties1;
        OASOrgApacheJackrabbitOakSegmentStan orgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties3 = new OASOrgApacheJackrabbitOakSegmentStan();
        OASOrgApacheJackrabbitOakSegmentStan orgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties4 = orgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties3;

        System.assert(orgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties1.equals(orgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties2));
        System.assert(orgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties2.equals(orgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties1));
        System.assert(orgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties1.equals(orgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties1));
        System.assert(orgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties3.equals(orgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties4));
        System.assert(orgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties4.equals(orgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties3));
        System.assert(orgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties3.equals(orgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOrgApacheJackrabbitOakSegmentStan orgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties1 = OASOrgApacheJackrabbitOakSegmentStan.getExample();
        OASOrgApacheJackrabbitOakSegmentStan orgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties2 = OASOrgApacheJackrabbitOakSegmentStan.getExample();
        OASOrgApacheJackrabbitOakSegmentStan orgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties3 = new OASOrgApacheJackrabbitOakSegmentStan();
        OASOrgApacheJackrabbitOakSegmentStan orgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties4 = new OASOrgApacheJackrabbitOakSegmentStan();

        System.assert(orgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties1.equals(orgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties2));
        System.assert(orgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties2.equals(orgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties1));
        System.assert(orgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties3.equals(orgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties4));
        System.assert(orgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties4.equals(orgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOrgApacheJackrabbitOakSegmentStan orgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties1 = OASOrgApacheJackrabbitOakSegmentStan.getExample();
        OASOrgApacheJackrabbitOakSegmentStan orgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties2 = new OASOrgApacheJackrabbitOakSegmentStan();

        System.assertEquals(false, orgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties1.equals('foo'));
        System.assertEquals(false, orgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOrgApacheJackrabbitOakSegmentStan orgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties1 = OASOrgApacheJackrabbitOakSegmentStan.getExample();
        OASOrgApacheJackrabbitOakSegmentStan orgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties2 = new OASOrgApacheJackrabbitOakSegmentStan();
        OASOrgApacheJackrabbitOakSegmentStan orgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties3;

        System.assertEquals(false, orgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties1.equals(orgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties3));
        System.assertEquals(false, orgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties2.equals(orgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOrgApacheJackrabbitOakSegmentStan orgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties1 = OASOrgApacheJackrabbitOakSegmentStan.getExample();
        OASOrgApacheJackrabbitOakSegmentStan orgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties2 = new OASOrgApacheJackrabbitOakSegmentStan();

        System.assertEquals(orgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties1.hashCode(), orgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties1.hashCode());
        System.assertEquals(orgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties2.hashCode(), orgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOrgApacheJackrabbitOakSegmentStan orgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties1 = OASOrgApacheJackrabbitOakSegmentStan.getExample();
        OASOrgApacheJackrabbitOakSegmentStan orgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties2 = OASOrgApacheJackrabbitOakSegmentStan.getExample();
        OASOrgApacheJackrabbitOakSegmentStan orgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties3 = new OASOrgApacheJackrabbitOakSegmentStan();
        OASOrgApacheJackrabbitOakSegmentStan orgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties4 = new OASOrgApacheJackrabbitOakSegmentStan();

        System.assert(orgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties1.equals(orgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties2));
        System.assert(orgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties3.equals(orgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties4));
        System.assertEquals(orgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties1.hashCode(), orgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties2.hashCode());
        System.assertEquals(orgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties3.hashCode(), orgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASOrgApacheJackrabbitOakSegmentStan orgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties = new OASOrgApacheJackrabbitOakSegmentStan();
        Map<String, String> propertyMappings = orgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties.getPropertyMappings();
        System.assertEquals('orgApacheSlingInstallerConfigurationPersist', propertyMappings.get('org.apache.sling.installer.configuration.persist'));
        System.assertEquals('primaryHost', propertyMappings.get('primary.host'));
        System.assertEquals('primaryAllowedClientIpRanges', propertyMappings.get('primary.allowed-client-ip-ranges'));
        System.assertEquals('standbyReadtimeout', propertyMappings.get('standby.readtimeout'));
        System.assertEquals('standbyAutoclean', propertyMappings.get('standby.autoclean'));
    }
}
