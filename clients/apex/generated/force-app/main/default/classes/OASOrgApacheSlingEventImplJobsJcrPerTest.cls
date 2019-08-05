@isTest
private class OASOrgApacheSlingEventImplJobsJcrPerTest {
    @isTest
    private static void equalsSameInstance() {
        OASOrgApacheSlingEventImplJobsJcrPer orgApacheSlingEventImplJobsJcrPersistenceHandlerProperties1 = OASOrgApacheSlingEventImplJobsJcrPer.getExample();
        OASOrgApacheSlingEventImplJobsJcrPer orgApacheSlingEventImplJobsJcrPersistenceHandlerProperties2 = orgApacheSlingEventImplJobsJcrPersistenceHandlerProperties1;
        OASOrgApacheSlingEventImplJobsJcrPer orgApacheSlingEventImplJobsJcrPersistenceHandlerProperties3 = new OASOrgApacheSlingEventImplJobsJcrPer();
        OASOrgApacheSlingEventImplJobsJcrPer orgApacheSlingEventImplJobsJcrPersistenceHandlerProperties4 = orgApacheSlingEventImplJobsJcrPersistenceHandlerProperties3;

        System.assert(orgApacheSlingEventImplJobsJcrPersistenceHandlerProperties1.equals(orgApacheSlingEventImplJobsJcrPersistenceHandlerProperties2));
        System.assert(orgApacheSlingEventImplJobsJcrPersistenceHandlerProperties2.equals(orgApacheSlingEventImplJobsJcrPersistenceHandlerProperties1));
        System.assert(orgApacheSlingEventImplJobsJcrPersistenceHandlerProperties1.equals(orgApacheSlingEventImplJobsJcrPersistenceHandlerProperties1));
        System.assert(orgApacheSlingEventImplJobsJcrPersistenceHandlerProperties3.equals(orgApacheSlingEventImplJobsJcrPersistenceHandlerProperties4));
        System.assert(orgApacheSlingEventImplJobsJcrPersistenceHandlerProperties4.equals(orgApacheSlingEventImplJobsJcrPersistenceHandlerProperties3));
        System.assert(orgApacheSlingEventImplJobsJcrPersistenceHandlerProperties3.equals(orgApacheSlingEventImplJobsJcrPersistenceHandlerProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOrgApacheSlingEventImplJobsJcrPer orgApacheSlingEventImplJobsJcrPersistenceHandlerProperties1 = OASOrgApacheSlingEventImplJobsJcrPer.getExample();
        OASOrgApacheSlingEventImplJobsJcrPer orgApacheSlingEventImplJobsJcrPersistenceHandlerProperties2 = OASOrgApacheSlingEventImplJobsJcrPer.getExample();
        OASOrgApacheSlingEventImplJobsJcrPer orgApacheSlingEventImplJobsJcrPersistenceHandlerProperties3 = new OASOrgApacheSlingEventImplJobsJcrPer();
        OASOrgApacheSlingEventImplJobsJcrPer orgApacheSlingEventImplJobsJcrPersistenceHandlerProperties4 = new OASOrgApacheSlingEventImplJobsJcrPer();

        System.assert(orgApacheSlingEventImplJobsJcrPersistenceHandlerProperties1.equals(orgApacheSlingEventImplJobsJcrPersistenceHandlerProperties2));
        System.assert(orgApacheSlingEventImplJobsJcrPersistenceHandlerProperties2.equals(orgApacheSlingEventImplJobsJcrPersistenceHandlerProperties1));
        System.assert(orgApacheSlingEventImplJobsJcrPersistenceHandlerProperties3.equals(orgApacheSlingEventImplJobsJcrPersistenceHandlerProperties4));
        System.assert(orgApacheSlingEventImplJobsJcrPersistenceHandlerProperties4.equals(orgApacheSlingEventImplJobsJcrPersistenceHandlerProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOrgApacheSlingEventImplJobsJcrPer orgApacheSlingEventImplJobsJcrPersistenceHandlerProperties1 = OASOrgApacheSlingEventImplJobsJcrPer.getExample();
        OASOrgApacheSlingEventImplJobsJcrPer orgApacheSlingEventImplJobsJcrPersistenceHandlerProperties2 = new OASOrgApacheSlingEventImplJobsJcrPer();

        System.assertEquals(false, orgApacheSlingEventImplJobsJcrPersistenceHandlerProperties1.equals('foo'));
        System.assertEquals(false, orgApacheSlingEventImplJobsJcrPersistenceHandlerProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOrgApacheSlingEventImplJobsJcrPer orgApacheSlingEventImplJobsJcrPersistenceHandlerProperties1 = OASOrgApacheSlingEventImplJobsJcrPer.getExample();
        OASOrgApacheSlingEventImplJobsJcrPer orgApacheSlingEventImplJobsJcrPersistenceHandlerProperties2 = new OASOrgApacheSlingEventImplJobsJcrPer();
        OASOrgApacheSlingEventImplJobsJcrPer orgApacheSlingEventImplJobsJcrPersistenceHandlerProperties3;

        System.assertEquals(false, orgApacheSlingEventImplJobsJcrPersistenceHandlerProperties1.equals(orgApacheSlingEventImplJobsJcrPersistenceHandlerProperties3));
        System.assertEquals(false, orgApacheSlingEventImplJobsJcrPersistenceHandlerProperties2.equals(orgApacheSlingEventImplJobsJcrPersistenceHandlerProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOrgApacheSlingEventImplJobsJcrPer orgApacheSlingEventImplJobsJcrPersistenceHandlerProperties1 = OASOrgApacheSlingEventImplJobsJcrPer.getExample();
        OASOrgApacheSlingEventImplJobsJcrPer orgApacheSlingEventImplJobsJcrPersistenceHandlerProperties2 = new OASOrgApacheSlingEventImplJobsJcrPer();

        System.assertEquals(orgApacheSlingEventImplJobsJcrPersistenceHandlerProperties1.hashCode(), orgApacheSlingEventImplJobsJcrPersistenceHandlerProperties1.hashCode());
        System.assertEquals(orgApacheSlingEventImplJobsJcrPersistenceHandlerProperties2.hashCode(), orgApacheSlingEventImplJobsJcrPersistenceHandlerProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOrgApacheSlingEventImplJobsJcrPer orgApacheSlingEventImplJobsJcrPersistenceHandlerProperties1 = OASOrgApacheSlingEventImplJobsJcrPer.getExample();
        OASOrgApacheSlingEventImplJobsJcrPer orgApacheSlingEventImplJobsJcrPersistenceHandlerProperties2 = OASOrgApacheSlingEventImplJobsJcrPer.getExample();
        OASOrgApacheSlingEventImplJobsJcrPer orgApacheSlingEventImplJobsJcrPersistenceHandlerProperties3 = new OASOrgApacheSlingEventImplJobsJcrPer();
        OASOrgApacheSlingEventImplJobsJcrPer orgApacheSlingEventImplJobsJcrPersistenceHandlerProperties4 = new OASOrgApacheSlingEventImplJobsJcrPer();

        System.assert(orgApacheSlingEventImplJobsJcrPersistenceHandlerProperties1.equals(orgApacheSlingEventImplJobsJcrPersistenceHandlerProperties2));
        System.assert(orgApacheSlingEventImplJobsJcrPersistenceHandlerProperties3.equals(orgApacheSlingEventImplJobsJcrPersistenceHandlerProperties4));
        System.assertEquals(orgApacheSlingEventImplJobsJcrPersistenceHandlerProperties1.hashCode(), orgApacheSlingEventImplJobsJcrPersistenceHandlerProperties2.hashCode());
        System.assertEquals(orgApacheSlingEventImplJobsJcrPersistenceHandlerProperties3.hashCode(), orgApacheSlingEventImplJobsJcrPersistenceHandlerProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASOrgApacheSlingEventImplJobsJcrPer orgApacheSlingEventImplJobsJcrPersistenceHandlerProperties = new OASOrgApacheSlingEventImplJobsJcrPer();
        Map<String, String> propertyMappings = orgApacheSlingEventImplJobsJcrPersistenceHandlerProperties.getPropertyMappings();
        System.assertEquals('jobConsumermanagerDisableDistribution', propertyMappings.get('job.consumermanager.disableDistribution'));
        System.assertEquals('startupDelay', propertyMappings.get('startup.delay'));
        System.assertEquals('cleanupPeriod', propertyMappings.get('cleanup.period'));
    }
}
