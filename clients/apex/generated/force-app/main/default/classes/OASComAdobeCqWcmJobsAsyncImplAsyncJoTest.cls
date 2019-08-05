@isTest
private class OASComAdobeCqWcmJobsAsyncImplAsyncJoTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeCqWcmJobsAsyncImplAsyncJo comAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties1 = OASComAdobeCqWcmJobsAsyncImplAsyncJo.getExample();
        OASComAdobeCqWcmJobsAsyncImplAsyncJo comAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties2 = comAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties1;
        OASComAdobeCqWcmJobsAsyncImplAsyncJo comAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties3 = new OASComAdobeCqWcmJobsAsyncImplAsyncJo();
        OASComAdobeCqWcmJobsAsyncImplAsyncJo comAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties4 = comAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties3;

        System.assert(comAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties1.equals(comAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties2));
        System.assert(comAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties2.equals(comAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties1));
        System.assert(comAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties1.equals(comAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties1));
        System.assert(comAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties3.equals(comAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties4));
        System.assert(comAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties4.equals(comAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties3));
        System.assert(comAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties3.equals(comAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeCqWcmJobsAsyncImplAsyncJo comAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties1 = OASComAdobeCqWcmJobsAsyncImplAsyncJo.getExample();
        OASComAdobeCqWcmJobsAsyncImplAsyncJo comAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties2 = OASComAdobeCqWcmJobsAsyncImplAsyncJo.getExample();
        OASComAdobeCqWcmJobsAsyncImplAsyncJo comAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties3 = new OASComAdobeCqWcmJobsAsyncImplAsyncJo();
        OASComAdobeCqWcmJobsAsyncImplAsyncJo comAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties4 = new OASComAdobeCqWcmJobsAsyncImplAsyncJo();

        System.assert(comAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties1.equals(comAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties2));
        System.assert(comAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties2.equals(comAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties1));
        System.assert(comAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties3.equals(comAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties4));
        System.assert(comAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties4.equals(comAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeCqWcmJobsAsyncImplAsyncJo comAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties1 = OASComAdobeCqWcmJobsAsyncImplAsyncJo.getExample();
        OASComAdobeCqWcmJobsAsyncImplAsyncJo comAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties2 = new OASComAdobeCqWcmJobsAsyncImplAsyncJo();

        System.assertEquals(false, comAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties1.equals('foo'));
        System.assertEquals(false, comAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeCqWcmJobsAsyncImplAsyncJo comAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties1 = OASComAdobeCqWcmJobsAsyncImplAsyncJo.getExample();
        OASComAdobeCqWcmJobsAsyncImplAsyncJo comAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties2 = new OASComAdobeCqWcmJobsAsyncImplAsyncJo();
        OASComAdobeCqWcmJobsAsyncImplAsyncJo comAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties3;

        System.assertEquals(false, comAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties1.equals(comAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties3));
        System.assertEquals(false, comAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties2.equals(comAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeCqWcmJobsAsyncImplAsyncJo comAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties1 = OASComAdobeCqWcmJobsAsyncImplAsyncJo.getExample();
        OASComAdobeCqWcmJobsAsyncImplAsyncJo comAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties2 = new OASComAdobeCqWcmJobsAsyncImplAsyncJo();

        System.assertEquals(comAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties1.hashCode(), comAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties1.hashCode());
        System.assertEquals(comAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties2.hashCode(), comAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeCqWcmJobsAsyncImplAsyncJo comAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties1 = OASComAdobeCqWcmJobsAsyncImplAsyncJo.getExample();
        OASComAdobeCqWcmJobsAsyncImplAsyncJo comAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties2 = OASComAdobeCqWcmJobsAsyncImplAsyncJo.getExample();
        OASComAdobeCqWcmJobsAsyncImplAsyncJo comAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties3 = new OASComAdobeCqWcmJobsAsyncImplAsyncJo();
        OASComAdobeCqWcmJobsAsyncImplAsyncJo comAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties4 = new OASComAdobeCqWcmJobsAsyncImplAsyncJo();

        System.assert(comAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties1.equals(comAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties2));
        System.assert(comAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties3.equals(comAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties4));
        System.assertEquals(comAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties1.hashCode(), comAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties2.hashCode());
        System.assertEquals(comAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties3.hashCode(), comAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeCqWcmJobsAsyncImplAsyncJo comAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties = new OASComAdobeCqWcmJobsAsyncImplAsyncJo();
        Map<String, String> propertyMappings = comAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties.getPropertyMappings();
        System.assertEquals('schedulerExpression', propertyMappings.get('scheduler.expression'));
        System.assertEquals('jobPurgeThreshold', propertyMappings.get('job.purge.threshold'));
        System.assertEquals('jobPurgeMaxJobs', propertyMappings.get('job.purge.max.jobs'));
    }
}
