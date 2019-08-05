@isTest
private class OASOrgApacheSlingDistributionMonitorTest {
    @isTest
    private static void equalsSameInstance() {
        OASOrgApacheSlingDistributionMonitor orgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties1 = OASOrgApacheSlingDistributionMonitor.getExample();
        OASOrgApacheSlingDistributionMonitor orgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties2 = orgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties1;
        OASOrgApacheSlingDistributionMonitor orgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties3 = new OASOrgApacheSlingDistributionMonitor();
        OASOrgApacheSlingDistributionMonitor orgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties4 = orgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties3;

        System.assert(orgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties1.equals(orgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties2));
        System.assert(orgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties2.equals(orgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties1));
        System.assert(orgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties1.equals(orgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties1));
        System.assert(orgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties3.equals(orgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties4));
        System.assert(orgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties4.equals(orgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties3));
        System.assert(orgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties3.equals(orgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOrgApacheSlingDistributionMonitor orgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties1 = OASOrgApacheSlingDistributionMonitor.getExample();
        OASOrgApacheSlingDistributionMonitor orgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties2 = OASOrgApacheSlingDistributionMonitor.getExample();
        OASOrgApacheSlingDistributionMonitor orgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties3 = new OASOrgApacheSlingDistributionMonitor();
        OASOrgApacheSlingDistributionMonitor orgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties4 = new OASOrgApacheSlingDistributionMonitor();

        System.assert(orgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties1.equals(orgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties2));
        System.assert(orgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties2.equals(orgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties1));
        System.assert(orgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties3.equals(orgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties4));
        System.assert(orgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties4.equals(orgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOrgApacheSlingDistributionMonitor orgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties1 = OASOrgApacheSlingDistributionMonitor.getExample();
        OASOrgApacheSlingDistributionMonitor orgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties2 = new OASOrgApacheSlingDistributionMonitor();

        System.assertEquals(false, orgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties1.equals('foo'));
        System.assertEquals(false, orgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOrgApacheSlingDistributionMonitor orgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties1 = OASOrgApacheSlingDistributionMonitor.getExample();
        OASOrgApacheSlingDistributionMonitor orgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties2 = new OASOrgApacheSlingDistributionMonitor();
        OASOrgApacheSlingDistributionMonitor orgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties3;

        System.assertEquals(false, orgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties1.equals(orgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties3));
        System.assertEquals(false, orgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties2.equals(orgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOrgApacheSlingDistributionMonitor orgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties1 = OASOrgApacheSlingDistributionMonitor.getExample();
        OASOrgApacheSlingDistributionMonitor orgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties2 = new OASOrgApacheSlingDistributionMonitor();

        System.assertEquals(orgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties1.hashCode(), orgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties1.hashCode());
        System.assertEquals(orgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties2.hashCode(), orgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOrgApacheSlingDistributionMonitor orgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties1 = OASOrgApacheSlingDistributionMonitor.getExample();
        OASOrgApacheSlingDistributionMonitor orgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties2 = OASOrgApacheSlingDistributionMonitor.getExample();
        OASOrgApacheSlingDistributionMonitor orgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties3 = new OASOrgApacheSlingDistributionMonitor();
        OASOrgApacheSlingDistributionMonitor orgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties4 = new OASOrgApacheSlingDistributionMonitor();

        System.assert(orgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties1.equals(orgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties2));
        System.assert(orgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties3.equals(orgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties4));
        System.assertEquals(orgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties1.hashCode(), orgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties2.hashCode());
        System.assertEquals(orgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties3.hashCode(), orgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASOrgApacheSlingDistributionMonitor orgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties = new OASOrgApacheSlingDistributionMonitor();
        Map<String, String> propertyMappings = orgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties.getPropertyMappings();
        System.assertEquals('hcName', propertyMappings.get('hc.name'));
        System.assertEquals('hcTags', propertyMappings.get('hc.tags'));
        System.assertEquals('hcMbeanName', propertyMappings.get('hc.mbean.name'));
    }
}
