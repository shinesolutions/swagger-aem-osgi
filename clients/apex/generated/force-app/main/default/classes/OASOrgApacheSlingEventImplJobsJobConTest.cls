@isTest
private class OASOrgApacheSlingEventImplJobsJobConTest {
    @isTest
    private static void equalsSameInstance() {
        OASOrgApacheSlingEventImplJobsJobCon orgApacheSlingEventImplJobsJobConsumerManagerProperties1 = OASOrgApacheSlingEventImplJobsJobCon.getExample();
        OASOrgApacheSlingEventImplJobsJobCon orgApacheSlingEventImplJobsJobConsumerManagerProperties2 = orgApacheSlingEventImplJobsJobConsumerManagerProperties1;
        OASOrgApacheSlingEventImplJobsJobCon orgApacheSlingEventImplJobsJobConsumerManagerProperties3 = new OASOrgApacheSlingEventImplJobsJobCon();
        OASOrgApacheSlingEventImplJobsJobCon orgApacheSlingEventImplJobsJobConsumerManagerProperties4 = orgApacheSlingEventImplJobsJobConsumerManagerProperties3;

        System.assert(orgApacheSlingEventImplJobsJobConsumerManagerProperties1.equals(orgApacheSlingEventImplJobsJobConsumerManagerProperties2));
        System.assert(orgApacheSlingEventImplJobsJobConsumerManagerProperties2.equals(orgApacheSlingEventImplJobsJobConsumerManagerProperties1));
        System.assert(orgApacheSlingEventImplJobsJobConsumerManagerProperties1.equals(orgApacheSlingEventImplJobsJobConsumerManagerProperties1));
        System.assert(orgApacheSlingEventImplJobsJobConsumerManagerProperties3.equals(orgApacheSlingEventImplJobsJobConsumerManagerProperties4));
        System.assert(orgApacheSlingEventImplJobsJobConsumerManagerProperties4.equals(orgApacheSlingEventImplJobsJobConsumerManagerProperties3));
        System.assert(orgApacheSlingEventImplJobsJobConsumerManagerProperties3.equals(orgApacheSlingEventImplJobsJobConsumerManagerProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOrgApacheSlingEventImplJobsJobCon orgApacheSlingEventImplJobsJobConsumerManagerProperties1 = OASOrgApacheSlingEventImplJobsJobCon.getExample();
        OASOrgApacheSlingEventImplJobsJobCon orgApacheSlingEventImplJobsJobConsumerManagerProperties2 = OASOrgApacheSlingEventImplJobsJobCon.getExample();
        OASOrgApacheSlingEventImplJobsJobCon orgApacheSlingEventImplJobsJobConsumerManagerProperties3 = new OASOrgApacheSlingEventImplJobsJobCon();
        OASOrgApacheSlingEventImplJobsJobCon orgApacheSlingEventImplJobsJobConsumerManagerProperties4 = new OASOrgApacheSlingEventImplJobsJobCon();

        System.assert(orgApacheSlingEventImplJobsJobConsumerManagerProperties1.equals(orgApacheSlingEventImplJobsJobConsumerManagerProperties2));
        System.assert(orgApacheSlingEventImplJobsJobConsumerManagerProperties2.equals(orgApacheSlingEventImplJobsJobConsumerManagerProperties1));
        System.assert(orgApacheSlingEventImplJobsJobConsumerManagerProperties3.equals(orgApacheSlingEventImplJobsJobConsumerManagerProperties4));
        System.assert(orgApacheSlingEventImplJobsJobConsumerManagerProperties4.equals(orgApacheSlingEventImplJobsJobConsumerManagerProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOrgApacheSlingEventImplJobsJobCon orgApacheSlingEventImplJobsJobConsumerManagerProperties1 = OASOrgApacheSlingEventImplJobsJobCon.getExample();
        OASOrgApacheSlingEventImplJobsJobCon orgApacheSlingEventImplJobsJobConsumerManagerProperties2 = new OASOrgApacheSlingEventImplJobsJobCon();

        System.assertEquals(false, orgApacheSlingEventImplJobsJobConsumerManagerProperties1.equals('foo'));
        System.assertEquals(false, orgApacheSlingEventImplJobsJobConsumerManagerProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOrgApacheSlingEventImplJobsJobCon orgApacheSlingEventImplJobsJobConsumerManagerProperties1 = OASOrgApacheSlingEventImplJobsJobCon.getExample();
        OASOrgApacheSlingEventImplJobsJobCon orgApacheSlingEventImplJobsJobConsumerManagerProperties2 = new OASOrgApacheSlingEventImplJobsJobCon();
        OASOrgApacheSlingEventImplJobsJobCon orgApacheSlingEventImplJobsJobConsumerManagerProperties3;

        System.assertEquals(false, orgApacheSlingEventImplJobsJobConsumerManagerProperties1.equals(orgApacheSlingEventImplJobsJobConsumerManagerProperties3));
        System.assertEquals(false, orgApacheSlingEventImplJobsJobConsumerManagerProperties2.equals(orgApacheSlingEventImplJobsJobConsumerManagerProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOrgApacheSlingEventImplJobsJobCon orgApacheSlingEventImplJobsJobConsumerManagerProperties1 = OASOrgApacheSlingEventImplJobsJobCon.getExample();
        OASOrgApacheSlingEventImplJobsJobCon orgApacheSlingEventImplJobsJobConsumerManagerProperties2 = new OASOrgApacheSlingEventImplJobsJobCon();

        System.assertEquals(orgApacheSlingEventImplJobsJobConsumerManagerProperties1.hashCode(), orgApacheSlingEventImplJobsJobConsumerManagerProperties1.hashCode());
        System.assertEquals(orgApacheSlingEventImplJobsJobConsumerManagerProperties2.hashCode(), orgApacheSlingEventImplJobsJobConsumerManagerProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOrgApacheSlingEventImplJobsJobCon orgApacheSlingEventImplJobsJobConsumerManagerProperties1 = OASOrgApacheSlingEventImplJobsJobCon.getExample();
        OASOrgApacheSlingEventImplJobsJobCon orgApacheSlingEventImplJobsJobConsumerManagerProperties2 = OASOrgApacheSlingEventImplJobsJobCon.getExample();
        OASOrgApacheSlingEventImplJobsJobCon orgApacheSlingEventImplJobsJobConsumerManagerProperties3 = new OASOrgApacheSlingEventImplJobsJobCon();
        OASOrgApacheSlingEventImplJobsJobCon orgApacheSlingEventImplJobsJobConsumerManagerProperties4 = new OASOrgApacheSlingEventImplJobsJobCon();

        System.assert(orgApacheSlingEventImplJobsJobConsumerManagerProperties1.equals(orgApacheSlingEventImplJobsJobConsumerManagerProperties2));
        System.assert(orgApacheSlingEventImplJobsJobConsumerManagerProperties3.equals(orgApacheSlingEventImplJobsJobConsumerManagerProperties4));
        System.assertEquals(orgApacheSlingEventImplJobsJobConsumerManagerProperties1.hashCode(), orgApacheSlingEventImplJobsJobConsumerManagerProperties2.hashCode());
        System.assertEquals(orgApacheSlingEventImplJobsJobConsumerManagerProperties3.hashCode(), orgApacheSlingEventImplJobsJobConsumerManagerProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASOrgApacheSlingEventImplJobsJobCon orgApacheSlingEventImplJobsJobConsumerManagerProperties = new OASOrgApacheSlingEventImplJobsJobCon();
        Map<String, String> propertyMappings = orgApacheSlingEventImplJobsJobConsumerManagerProperties.getPropertyMappings();
        System.assertEquals('orgApacheSlingInstallerConfigurationPersist', propertyMappings.get('org.apache.sling.installer.configuration.persist'));
        System.assertEquals('jobConsumermanagerWhitelist', propertyMappings.get('job.consumermanager.whitelist'));
        System.assertEquals('jobConsumermanagerBlacklist', propertyMappings.get('job.consumermanager.blacklist'));
    }
}
