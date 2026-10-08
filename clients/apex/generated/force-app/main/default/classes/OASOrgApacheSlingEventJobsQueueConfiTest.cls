@isTest
private class OASOrgApacheSlingEventJobsQueueConfiTest {
    @isTest
    private static void equalsSameInstance() {
        OASOrgApacheSlingEventJobsQueueConfi orgApacheSlingEventJobsQueueConfigurationProperties1 = OASOrgApacheSlingEventJobsQueueConfi.getExample();
        OASOrgApacheSlingEventJobsQueueConfi orgApacheSlingEventJobsQueueConfigurationProperties2 = orgApacheSlingEventJobsQueueConfigurationProperties1;
        OASOrgApacheSlingEventJobsQueueConfi orgApacheSlingEventJobsQueueConfigurationProperties3 = new OASOrgApacheSlingEventJobsQueueConfi();
        OASOrgApacheSlingEventJobsQueueConfi orgApacheSlingEventJobsQueueConfigurationProperties4 = orgApacheSlingEventJobsQueueConfigurationProperties3;

        System.assert(orgApacheSlingEventJobsQueueConfigurationProperties1.equals(orgApacheSlingEventJobsQueueConfigurationProperties2));
        System.assert(orgApacheSlingEventJobsQueueConfigurationProperties2.equals(orgApacheSlingEventJobsQueueConfigurationProperties1));
        System.assert(orgApacheSlingEventJobsQueueConfigurationProperties1.equals(orgApacheSlingEventJobsQueueConfigurationProperties1));
        System.assert(orgApacheSlingEventJobsQueueConfigurationProperties3.equals(orgApacheSlingEventJobsQueueConfigurationProperties4));
        System.assert(orgApacheSlingEventJobsQueueConfigurationProperties4.equals(orgApacheSlingEventJobsQueueConfigurationProperties3));
        System.assert(orgApacheSlingEventJobsQueueConfigurationProperties3.equals(orgApacheSlingEventJobsQueueConfigurationProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOrgApacheSlingEventJobsQueueConfi orgApacheSlingEventJobsQueueConfigurationProperties1 = OASOrgApacheSlingEventJobsQueueConfi.getExample();
        OASOrgApacheSlingEventJobsQueueConfi orgApacheSlingEventJobsQueueConfigurationProperties2 = OASOrgApacheSlingEventJobsQueueConfi.getExample();
        OASOrgApacheSlingEventJobsQueueConfi orgApacheSlingEventJobsQueueConfigurationProperties3 = new OASOrgApacheSlingEventJobsQueueConfi();
        OASOrgApacheSlingEventJobsQueueConfi orgApacheSlingEventJobsQueueConfigurationProperties4 = new OASOrgApacheSlingEventJobsQueueConfi();

        System.assert(orgApacheSlingEventJobsQueueConfigurationProperties1.equals(orgApacheSlingEventJobsQueueConfigurationProperties2));
        System.assert(orgApacheSlingEventJobsQueueConfigurationProperties2.equals(orgApacheSlingEventJobsQueueConfigurationProperties1));
        System.assert(orgApacheSlingEventJobsQueueConfigurationProperties3.equals(orgApacheSlingEventJobsQueueConfigurationProperties4));
        System.assert(orgApacheSlingEventJobsQueueConfigurationProperties4.equals(orgApacheSlingEventJobsQueueConfigurationProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOrgApacheSlingEventJobsQueueConfi orgApacheSlingEventJobsQueueConfigurationProperties1 = OASOrgApacheSlingEventJobsQueueConfi.getExample();
        OASOrgApacheSlingEventJobsQueueConfi orgApacheSlingEventJobsQueueConfigurationProperties2 = new OASOrgApacheSlingEventJobsQueueConfi();

        System.assertEquals(false, orgApacheSlingEventJobsQueueConfigurationProperties1.equals('foo'));
        System.assertEquals(false, orgApacheSlingEventJobsQueueConfigurationProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOrgApacheSlingEventJobsQueueConfi orgApacheSlingEventJobsQueueConfigurationProperties1 = OASOrgApacheSlingEventJobsQueueConfi.getExample();
        OASOrgApacheSlingEventJobsQueueConfi orgApacheSlingEventJobsQueueConfigurationProperties2 = new OASOrgApacheSlingEventJobsQueueConfi();
        OASOrgApacheSlingEventJobsQueueConfi orgApacheSlingEventJobsQueueConfigurationProperties3;

        System.assertEquals(false, orgApacheSlingEventJobsQueueConfigurationProperties1.equals(orgApacheSlingEventJobsQueueConfigurationProperties3));
        System.assertEquals(false, orgApacheSlingEventJobsQueueConfigurationProperties2.equals(orgApacheSlingEventJobsQueueConfigurationProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOrgApacheSlingEventJobsQueueConfi orgApacheSlingEventJobsQueueConfigurationProperties1 = OASOrgApacheSlingEventJobsQueueConfi.getExample();
        OASOrgApacheSlingEventJobsQueueConfi orgApacheSlingEventJobsQueueConfigurationProperties2 = new OASOrgApacheSlingEventJobsQueueConfi();

        System.assertEquals(orgApacheSlingEventJobsQueueConfigurationProperties1.hashCode(), orgApacheSlingEventJobsQueueConfigurationProperties1.hashCode());
        System.assertEquals(orgApacheSlingEventJobsQueueConfigurationProperties2.hashCode(), orgApacheSlingEventJobsQueueConfigurationProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOrgApacheSlingEventJobsQueueConfi orgApacheSlingEventJobsQueueConfigurationProperties1 = OASOrgApacheSlingEventJobsQueueConfi.getExample();
        OASOrgApacheSlingEventJobsQueueConfi orgApacheSlingEventJobsQueueConfigurationProperties2 = OASOrgApacheSlingEventJobsQueueConfi.getExample();
        OASOrgApacheSlingEventJobsQueueConfi orgApacheSlingEventJobsQueueConfigurationProperties3 = new OASOrgApacheSlingEventJobsQueueConfi();
        OASOrgApacheSlingEventJobsQueueConfi orgApacheSlingEventJobsQueueConfigurationProperties4 = new OASOrgApacheSlingEventJobsQueueConfi();

        System.assert(orgApacheSlingEventJobsQueueConfigurationProperties1.equals(orgApacheSlingEventJobsQueueConfigurationProperties2));
        System.assert(orgApacheSlingEventJobsQueueConfigurationProperties3.equals(orgApacheSlingEventJobsQueueConfigurationProperties4));
        System.assertEquals(orgApacheSlingEventJobsQueueConfigurationProperties1.hashCode(), orgApacheSlingEventJobsQueueConfigurationProperties2.hashCode());
        System.assertEquals(orgApacheSlingEventJobsQueueConfigurationProperties3.hashCode(), orgApacheSlingEventJobsQueueConfigurationProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASOrgApacheSlingEventJobsQueueConfi orgApacheSlingEventJobsQueueConfigurationProperties = new OASOrgApacheSlingEventJobsQueueConfi();
        Map<String, String> x-property-mappings = orgApacheSlingEventJobsQueueConfigurationProperties.getx-property-mappings();
        System.assertEquals('queueName', x-property-mappings.get('queue.name'));
        System.assertEquals('queueTopics', x-property-mappings.get('queue.topics'));
        System.assertEquals('queueType', x-property-mappings.get('queue.type'));
        System.assertEquals('queuePriority', x-property-mappings.get('queue.priority'));
        System.assertEquals('queueRetries', x-property-mappings.get('queue.retries'));
        System.assertEquals('queueRetrydelay', x-property-mappings.get('queue.retrydelay'));
        System.assertEquals('queueMaxparallel', x-property-mappings.get('queue.maxparallel'));
        System.assertEquals('queueKeepJobs', x-property-mappings.get('queue.keepJobs'));
        System.assertEquals('queuePreferRunOnCreationInstance', x-property-mappings.get('queue.preferRunOnCreationInstance'));
        System.assertEquals('queueThreadPoolSize', x-property-mappings.get('queue.threadPoolSize'));
        System.assertEquals('serviceRanking', x-property-mappings.get('service.ranking'));
    }
}
