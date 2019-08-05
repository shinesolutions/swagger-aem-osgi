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
        Map<String, String> propertyMappings = orgApacheSlingEventJobsQueueConfigurationProperties.getPropertyMappings();
        System.assertEquals('queueName', propertyMappings.get('queue.name'));
        System.assertEquals('queueTopics', propertyMappings.get('queue.topics'));
        System.assertEquals('queueType', propertyMappings.get('queue.type'));
        System.assertEquals('queuePriority', propertyMappings.get('queue.priority'));
        System.assertEquals('queueRetries', propertyMappings.get('queue.retries'));
        System.assertEquals('queueRetrydelay', propertyMappings.get('queue.retrydelay'));
        System.assertEquals('queueMaxparallel', propertyMappings.get('queue.maxparallel'));
        System.assertEquals('queueKeepJobs', propertyMappings.get('queue.keepJobs'));
        System.assertEquals('queuePreferRunOnCreationInstance', propertyMappings.get('queue.preferRunOnCreationInstance'));
        System.assertEquals('queueThreadPoolSize', propertyMappings.get('queue.threadPoolSize'));
        System.assertEquals('serviceRanking', propertyMappings.get('service.ranking'));
    }
}
