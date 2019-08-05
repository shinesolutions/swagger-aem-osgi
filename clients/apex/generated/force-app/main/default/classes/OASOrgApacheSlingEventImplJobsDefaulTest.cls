@isTest
private class OASOrgApacheSlingEventImplJobsDefaulTest {
    @isTest
    private static void equalsSameInstance() {
        OASOrgApacheSlingEventImplJobsDefaul orgApacheSlingEventImplJobsDefaultJobManagerProperties1 = OASOrgApacheSlingEventImplJobsDefaul.getExample();
        OASOrgApacheSlingEventImplJobsDefaul orgApacheSlingEventImplJobsDefaultJobManagerProperties2 = orgApacheSlingEventImplJobsDefaultJobManagerProperties1;
        OASOrgApacheSlingEventImplJobsDefaul orgApacheSlingEventImplJobsDefaultJobManagerProperties3 = new OASOrgApacheSlingEventImplJobsDefaul();
        OASOrgApacheSlingEventImplJobsDefaul orgApacheSlingEventImplJobsDefaultJobManagerProperties4 = orgApacheSlingEventImplJobsDefaultJobManagerProperties3;

        System.assert(orgApacheSlingEventImplJobsDefaultJobManagerProperties1.equals(orgApacheSlingEventImplJobsDefaultJobManagerProperties2));
        System.assert(orgApacheSlingEventImplJobsDefaultJobManagerProperties2.equals(orgApacheSlingEventImplJobsDefaultJobManagerProperties1));
        System.assert(orgApacheSlingEventImplJobsDefaultJobManagerProperties1.equals(orgApacheSlingEventImplJobsDefaultJobManagerProperties1));
        System.assert(orgApacheSlingEventImplJobsDefaultJobManagerProperties3.equals(orgApacheSlingEventImplJobsDefaultJobManagerProperties4));
        System.assert(orgApacheSlingEventImplJobsDefaultJobManagerProperties4.equals(orgApacheSlingEventImplJobsDefaultJobManagerProperties3));
        System.assert(orgApacheSlingEventImplJobsDefaultJobManagerProperties3.equals(orgApacheSlingEventImplJobsDefaultJobManagerProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOrgApacheSlingEventImplJobsDefaul orgApacheSlingEventImplJobsDefaultJobManagerProperties1 = OASOrgApacheSlingEventImplJobsDefaul.getExample();
        OASOrgApacheSlingEventImplJobsDefaul orgApacheSlingEventImplJobsDefaultJobManagerProperties2 = OASOrgApacheSlingEventImplJobsDefaul.getExample();
        OASOrgApacheSlingEventImplJobsDefaul orgApacheSlingEventImplJobsDefaultJobManagerProperties3 = new OASOrgApacheSlingEventImplJobsDefaul();
        OASOrgApacheSlingEventImplJobsDefaul orgApacheSlingEventImplJobsDefaultJobManagerProperties4 = new OASOrgApacheSlingEventImplJobsDefaul();

        System.assert(orgApacheSlingEventImplJobsDefaultJobManagerProperties1.equals(orgApacheSlingEventImplJobsDefaultJobManagerProperties2));
        System.assert(orgApacheSlingEventImplJobsDefaultJobManagerProperties2.equals(orgApacheSlingEventImplJobsDefaultJobManagerProperties1));
        System.assert(orgApacheSlingEventImplJobsDefaultJobManagerProperties3.equals(orgApacheSlingEventImplJobsDefaultJobManagerProperties4));
        System.assert(orgApacheSlingEventImplJobsDefaultJobManagerProperties4.equals(orgApacheSlingEventImplJobsDefaultJobManagerProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOrgApacheSlingEventImplJobsDefaul orgApacheSlingEventImplJobsDefaultJobManagerProperties1 = OASOrgApacheSlingEventImplJobsDefaul.getExample();
        OASOrgApacheSlingEventImplJobsDefaul orgApacheSlingEventImplJobsDefaultJobManagerProperties2 = new OASOrgApacheSlingEventImplJobsDefaul();

        System.assertEquals(false, orgApacheSlingEventImplJobsDefaultJobManagerProperties1.equals('foo'));
        System.assertEquals(false, orgApacheSlingEventImplJobsDefaultJobManagerProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOrgApacheSlingEventImplJobsDefaul orgApacheSlingEventImplJobsDefaultJobManagerProperties1 = OASOrgApacheSlingEventImplJobsDefaul.getExample();
        OASOrgApacheSlingEventImplJobsDefaul orgApacheSlingEventImplJobsDefaultJobManagerProperties2 = new OASOrgApacheSlingEventImplJobsDefaul();
        OASOrgApacheSlingEventImplJobsDefaul orgApacheSlingEventImplJobsDefaultJobManagerProperties3;

        System.assertEquals(false, orgApacheSlingEventImplJobsDefaultJobManagerProperties1.equals(orgApacheSlingEventImplJobsDefaultJobManagerProperties3));
        System.assertEquals(false, orgApacheSlingEventImplJobsDefaultJobManagerProperties2.equals(orgApacheSlingEventImplJobsDefaultJobManagerProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOrgApacheSlingEventImplJobsDefaul orgApacheSlingEventImplJobsDefaultJobManagerProperties1 = OASOrgApacheSlingEventImplJobsDefaul.getExample();
        OASOrgApacheSlingEventImplJobsDefaul orgApacheSlingEventImplJobsDefaultJobManagerProperties2 = new OASOrgApacheSlingEventImplJobsDefaul();

        System.assertEquals(orgApacheSlingEventImplJobsDefaultJobManagerProperties1.hashCode(), orgApacheSlingEventImplJobsDefaultJobManagerProperties1.hashCode());
        System.assertEquals(orgApacheSlingEventImplJobsDefaultJobManagerProperties2.hashCode(), orgApacheSlingEventImplJobsDefaultJobManagerProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOrgApacheSlingEventImplJobsDefaul orgApacheSlingEventImplJobsDefaultJobManagerProperties1 = OASOrgApacheSlingEventImplJobsDefaul.getExample();
        OASOrgApacheSlingEventImplJobsDefaul orgApacheSlingEventImplJobsDefaultJobManagerProperties2 = OASOrgApacheSlingEventImplJobsDefaul.getExample();
        OASOrgApacheSlingEventImplJobsDefaul orgApacheSlingEventImplJobsDefaultJobManagerProperties3 = new OASOrgApacheSlingEventImplJobsDefaul();
        OASOrgApacheSlingEventImplJobsDefaul orgApacheSlingEventImplJobsDefaultJobManagerProperties4 = new OASOrgApacheSlingEventImplJobsDefaul();

        System.assert(orgApacheSlingEventImplJobsDefaultJobManagerProperties1.equals(orgApacheSlingEventImplJobsDefaultJobManagerProperties2));
        System.assert(orgApacheSlingEventImplJobsDefaultJobManagerProperties3.equals(orgApacheSlingEventImplJobsDefaultJobManagerProperties4));
        System.assertEquals(orgApacheSlingEventImplJobsDefaultJobManagerProperties1.hashCode(), orgApacheSlingEventImplJobsDefaultJobManagerProperties2.hashCode());
        System.assertEquals(orgApacheSlingEventImplJobsDefaultJobManagerProperties3.hashCode(), orgApacheSlingEventImplJobsDefaultJobManagerProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASOrgApacheSlingEventImplJobsDefaul orgApacheSlingEventImplJobsDefaultJobManagerProperties = new OASOrgApacheSlingEventImplJobsDefaul();
        Map<String, String> propertyMappings = orgApacheSlingEventImplJobsDefaultJobManagerProperties.getPropertyMappings();
        System.assertEquals('queuePriority', propertyMappings.get('queue.priority'));
        System.assertEquals('queueRetries', propertyMappings.get('queue.retries'));
        System.assertEquals('queueRetrydelay', propertyMappings.get('queue.retrydelay'));
        System.assertEquals('queueMaxparallel', propertyMappings.get('queue.maxparallel'));
    }
}
