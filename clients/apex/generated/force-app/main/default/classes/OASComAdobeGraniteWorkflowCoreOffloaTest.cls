@isTest
private class OASComAdobeGraniteWorkflowCoreOffloaTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeGraniteWorkflowCoreOffloa comAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties1 = OASComAdobeGraniteWorkflowCoreOffloa.getExample();
        OASComAdobeGraniteWorkflowCoreOffloa comAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties2 = comAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties1;
        OASComAdobeGraniteWorkflowCoreOffloa comAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties3 = new OASComAdobeGraniteWorkflowCoreOffloa();
        OASComAdobeGraniteWorkflowCoreOffloa comAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties4 = comAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties3;

        System.assert(comAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties1.equals(comAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties2));
        System.assert(comAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties2.equals(comAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties1));
        System.assert(comAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties1.equals(comAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties1));
        System.assert(comAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties3.equals(comAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties4));
        System.assert(comAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties4.equals(comAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties3));
        System.assert(comAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties3.equals(comAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeGraniteWorkflowCoreOffloa comAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties1 = OASComAdobeGraniteWorkflowCoreOffloa.getExample();
        OASComAdobeGraniteWorkflowCoreOffloa comAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties2 = OASComAdobeGraniteWorkflowCoreOffloa.getExample();
        OASComAdobeGraniteWorkflowCoreOffloa comAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties3 = new OASComAdobeGraniteWorkflowCoreOffloa();
        OASComAdobeGraniteWorkflowCoreOffloa comAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties4 = new OASComAdobeGraniteWorkflowCoreOffloa();

        System.assert(comAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties1.equals(comAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties2));
        System.assert(comAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties2.equals(comAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties1));
        System.assert(comAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties3.equals(comAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties4));
        System.assert(comAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties4.equals(comAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeGraniteWorkflowCoreOffloa comAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties1 = OASComAdobeGraniteWorkflowCoreOffloa.getExample();
        OASComAdobeGraniteWorkflowCoreOffloa comAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties2 = new OASComAdobeGraniteWorkflowCoreOffloa();

        System.assertEquals(false, comAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties1.equals('foo'));
        System.assertEquals(false, comAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeGraniteWorkflowCoreOffloa comAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties1 = OASComAdobeGraniteWorkflowCoreOffloa.getExample();
        OASComAdobeGraniteWorkflowCoreOffloa comAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties2 = new OASComAdobeGraniteWorkflowCoreOffloa();
        OASComAdobeGraniteWorkflowCoreOffloa comAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties3;

        System.assertEquals(false, comAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties1.equals(comAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties3));
        System.assertEquals(false, comAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties2.equals(comAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeGraniteWorkflowCoreOffloa comAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties1 = OASComAdobeGraniteWorkflowCoreOffloa.getExample();
        OASComAdobeGraniteWorkflowCoreOffloa comAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties2 = new OASComAdobeGraniteWorkflowCoreOffloa();

        System.assertEquals(comAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties1.hashCode(), comAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties1.hashCode());
        System.assertEquals(comAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties2.hashCode(), comAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeGraniteWorkflowCoreOffloa comAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties1 = OASComAdobeGraniteWorkflowCoreOffloa.getExample();
        OASComAdobeGraniteWorkflowCoreOffloa comAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties2 = OASComAdobeGraniteWorkflowCoreOffloa.getExample();
        OASComAdobeGraniteWorkflowCoreOffloa comAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties3 = new OASComAdobeGraniteWorkflowCoreOffloa();
        OASComAdobeGraniteWorkflowCoreOffloa comAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties4 = new OASComAdobeGraniteWorkflowCoreOffloa();

        System.assert(comAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties1.equals(comAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties2));
        System.assert(comAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties3.equals(comAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties4));
        System.assertEquals(comAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties1.hashCode(), comAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties2.hashCode());
        System.assertEquals(comAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties3.hashCode(), comAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeGraniteWorkflowCoreOffloa comAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties = new OASComAdobeGraniteWorkflowCoreOffloa();
        Map<String, String> propertyMappings = comAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties.getPropertyMappings();
        System.assertEquals('jobTopics', propertyMappings.get('job.topics'));
    }
}
