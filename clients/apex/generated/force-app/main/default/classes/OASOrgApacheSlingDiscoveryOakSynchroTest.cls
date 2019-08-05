@isTest
private class OASOrgApacheSlingDiscoveryOakSynchroTest {
    @isTest
    private static void equalsSameInstance() {
        OASOrgApacheSlingDiscoveryOakSynchro orgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties1 = OASOrgApacheSlingDiscoveryOakSynchro.getExample();
        OASOrgApacheSlingDiscoveryOakSynchro orgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties2 = orgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties1;
        OASOrgApacheSlingDiscoveryOakSynchro orgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties3 = new OASOrgApacheSlingDiscoveryOakSynchro();
        OASOrgApacheSlingDiscoveryOakSynchro orgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties4 = orgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties3;

        System.assert(orgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties1.equals(orgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties2));
        System.assert(orgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties2.equals(orgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties1));
        System.assert(orgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties1.equals(orgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties1));
        System.assert(orgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties3.equals(orgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties4));
        System.assert(orgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties4.equals(orgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties3));
        System.assert(orgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties3.equals(orgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOrgApacheSlingDiscoveryOakSynchro orgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties1 = OASOrgApacheSlingDiscoveryOakSynchro.getExample();
        OASOrgApacheSlingDiscoveryOakSynchro orgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties2 = OASOrgApacheSlingDiscoveryOakSynchro.getExample();
        OASOrgApacheSlingDiscoveryOakSynchro orgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties3 = new OASOrgApacheSlingDiscoveryOakSynchro();
        OASOrgApacheSlingDiscoveryOakSynchro orgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties4 = new OASOrgApacheSlingDiscoveryOakSynchro();

        System.assert(orgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties1.equals(orgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties2));
        System.assert(orgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties2.equals(orgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties1));
        System.assert(orgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties3.equals(orgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties4));
        System.assert(orgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties4.equals(orgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOrgApacheSlingDiscoveryOakSynchro orgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties1 = OASOrgApacheSlingDiscoveryOakSynchro.getExample();
        OASOrgApacheSlingDiscoveryOakSynchro orgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties2 = new OASOrgApacheSlingDiscoveryOakSynchro();

        System.assertEquals(false, orgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties1.equals('foo'));
        System.assertEquals(false, orgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOrgApacheSlingDiscoveryOakSynchro orgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties1 = OASOrgApacheSlingDiscoveryOakSynchro.getExample();
        OASOrgApacheSlingDiscoveryOakSynchro orgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties2 = new OASOrgApacheSlingDiscoveryOakSynchro();
        OASOrgApacheSlingDiscoveryOakSynchro orgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties3;

        System.assertEquals(false, orgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties1.equals(orgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties3));
        System.assertEquals(false, orgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties2.equals(orgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOrgApacheSlingDiscoveryOakSynchro orgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties1 = OASOrgApacheSlingDiscoveryOakSynchro.getExample();
        OASOrgApacheSlingDiscoveryOakSynchro orgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties2 = new OASOrgApacheSlingDiscoveryOakSynchro();

        System.assertEquals(orgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties1.hashCode(), orgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties1.hashCode());
        System.assertEquals(orgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties2.hashCode(), orgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOrgApacheSlingDiscoveryOakSynchro orgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties1 = OASOrgApacheSlingDiscoveryOakSynchro.getExample();
        OASOrgApacheSlingDiscoveryOakSynchro orgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties2 = OASOrgApacheSlingDiscoveryOakSynchro.getExample();
        OASOrgApacheSlingDiscoveryOakSynchro orgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties3 = new OASOrgApacheSlingDiscoveryOakSynchro();
        OASOrgApacheSlingDiscoveryOakSynchro orgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties4 = new OASOrgApacheSlingDiscoveryOakSynchro();

        System.assert(orgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties1.equals(orgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties2));
        System.assert(orgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties3.equals(orgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties4));
        System.assertEquals(orgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties1.hashCode(), orgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties2.hashCode());
        System.assertEquals(orgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties3.hashCode(), orgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASOrgApacheSlingDiscoveryOakSynchro orgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties = new OASOrgApacheSlingDiscoveryOakSynchro();
        Map<String, String> propertyMappings = orgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties.getPropertyMappings();
        System.assertEquals('hcName', propertyMappings.get('hc.name'));
        System.assertEquals('hcTags', propertyMappings.get('hc.tags'));
        System.assertEquals('hcMbeanName', propertyMappings.get('hc.mbean.name'));
    }
}
