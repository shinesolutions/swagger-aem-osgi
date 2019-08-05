@isTest
private class OASComAdobeGraniteWorkflowCoreJobJobTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeGraniteWorkflowCoreJobJob comAdobeGraniteWorkflowCoreJobJobHandlerProperties1 = OASComAdobeGraniteWorkflowCoreJobJob.getExample();
        OASComAdobeGraniteWorkflowCoreJobJob comAdobeGraniteWorkflowCoreJobJobHandlerProperties2 = comAdobeGraniteWorkflowCoreJobJobHandlerProperties1;
        OASComAdobeGraniteWorkflowCoreJobJob comAdobeGraniteWorkflowCoreJobJobHandlerProperties3 = new OASComAdobeGraniteWorkflowCoreJobJob();
        OASComAdobeGraniteWorkflowCoreJobJob comAdobeGraniteWorkflowCoreJobJobHandlerProperties4 = comAdobeGraniteWorkflowCoreJobJobHandlerProperties3;

        System.assert(comAdobeGraniteWorkflowCoreJobJobHandlerProperties1.equals(comAdobeGraniteWorkflowCoreJobJobHandlerProperties2));
        System.assert(comAdobeGraniteWorkflowCoreJobJobHandlerProperties2.equals(comAdobeGraniteWorkflowCoreJobJobHandlerProperties1));
        System.assert(comAdobeGraniteWorkflowCoreJobJobHandlerProperties1.equals(comAdobeGraniteWorkflowCoreJobJobHandlerProperties1));
        System.assert(comAdobeGraniteWorkflowCoreJobJobHandlerProperties3.equals(comAdobeGraniteWorkflowCoreJobJobHandlerProperties4));
        System.assert(comAdobeGraniteWorkflowCoreJobJobHandlerProperties4.equals(comAdobeGraniteWorkflowCoreJobJobHandlerProperties3));
        System.assert(comAdobeGraniteWorkflowCoreJobJobHandlerProperties3.equals(comAdobeGraniteWorkflowCoreJobJobHandlerProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeGraniteWorkflowCoreJobJob comAdobeGraniteWorkflowCoreJobJobHandlerProperties1 = OASComAdobeGraniteWorkflowCoreJobJob.getExample();
        OASComAdobeGraniteWorkflowCoreJobJob comAdobeGraniteWorkflowCoreJobJobHandlerProperties2 = OASComAdobeGraniteWorkflowCoreJobJob.getExample();
        OASComAdobeGraniteWorkflowCoreJobJob comAdobeGraniteWorkflowCoreJobJobHandlerProperties3 = new OASComAdobeGraniteWorkflowCoreJobJob();
        OASComAdobeGraniteWorkflowCoreJobJob comAdobeGraniteWorkflowCoreJobJobHandlerProperties4 = new OASComAdobeGraniteWorkflowCoreJobJob();

        System.assert(comAdobeGraniteWorkflowCoreJobJobHandlerProperties1.equals(comAdobeGraniteWorkflowCoreJobJobHandlerProperties2));
        System.assert(comAdobeGraniteWorkflowCoreJobJobHandlerProperties2.equals(comAdobeGraniteWorkflowCoreJobJobHandlerProperties1));
        System.assert(comAdobeGraniteWorkflowCoreJobJobHandlerProperties3.equals(comAdobeGraniteWorkflowCoreJobJobHandlerProperties4));
        System.assert(comAdobeGraniteWorkflowCoreJobJobHandlerProperties4.equals(comAdobeGraniteWorkflowCoreJobJobHandlerProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeGraniteWorkflowCoreJobJob comAdobeGraniteWorkflowCoreJobJobHandlerProperties1 = OASComAdobeGraniteWorkflowCoreJobJob.getExample();
        OASComAdobeGraniteWorkflowCoreJobJob comAdobeGraniteWorkflowCoreJobJobHandlerProperties2 = new OASComAdobeGraniteWorkflowCoreJobJob();

        System.assertEquals(false, comAdobeGraniteWorkflowCoreJobJobHandlerProperties1.equals('foo'));
        System.assertEquals(false, comAdobeGraniteWorkflowCoreJobJobHandlerProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeGraniteWorkflowCoreJobJob comAdobeGraniteWorkflowCoreJobJobHandlerProperties1 = OASComAdobeGraniteWorkflowCoreJobJob.getExample();
        OASComAdobeGraniteWorkflowCoreJobJob comAdobeGraniteWorkflowCoreJobJobHandlerProperties2 = new OASComAdobeGraniteWorkflowCoreJobJob();
        OASComAdobeGraniteWorkflowCoreJobJob comAdobeGraniteWorkflowCoreJobJobHandlerProperties3;

        System.assertEquals(false, comAdobeGraniteWorkflowCoreJobJobHandlerProperties1.equals(comAdobeGraniteWorkflowCoreJobJobHandlerProperties3));
        System.assertEquals(false, comAdobeGraniteWorkflowCoreJobJobHandlerProperties2.equals(comAdobeGraniteWorkflowCoreJobJobHandlerProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeGraniteWorkflowCoreJobJob comAdobeGraniteWorkflowCoreJobJobHandlerProperties1 = OASComAdobeGraniteWorkflowCoreJobJob.getExample();
        OASComAdobeGraniteWorkflowCoreJobJob comAdobeGraniteWorkflowCoreJobJobHandlerProperties2 = new OASComAdobeGraniteWorkflowCoreJobJob();

        System.assertEquals(comAdobeGraniteWorkflowCoreJobJobHandlerProperties1.hashCode(), comAdobeGraniteWorkflowCoreJobJobHandlerProperties1.hashCode());
        System.assertEquals(comAdobeGraniteWorkflowCoreJobJobHandlerProperties2.hashCode(), comAdobeGraniteWorkflowCoreJobJobHandlerProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeGraniteWorkflowCoreJobJob comAdobeGraniteWorkflowCoreJobJobHandlerProperties1 = OASComAdobeGraniteWorkflowCoreJobJob.getExample();
        OASComAdobeGraniteWorkflowCoreJobJob comAdobeGraniteWorkflowCoreJobJobHandlerProperties2 = OASComAdobeGraniteWorkflowCoreJobJob.getExample();
        OASComAdobeGraniteWorkflowCoreJobJob comAdobeGraniteWorkflowCoreJobJobHandlerProperties3 = new OASComAdobeGraniteWorkflowCoreJobJob();
        OASComAdobeGraniteWorkflowCoreJobJob comAdobeGraniteWorkflowCoreJobJobHandlerProperties4 = new OASComAdobeGraniteWorkflowCoreJobJob();

        System.assert(comAdobeGraniteWorkflowCoreJobJobHandlerProperties1.equals(comAdobeGraniteWorkflowCoreJobJobHandlerProperties2));
        System.assert(comAdobeGraniteWorkflowCoreJobJobHandlerProperties3.equals(comAdobeGraniteWorkflowCoreJobJobHandlerProperties4));
        System.assertEquals(comAdobeGraniteWorkflowCoreJobJobHandlerProperties1.hashCode(), comAdobeGraniteWorkflowCoreJobJobHandlerProperties2.hashCode());
        System.assertEquals(comAdobeGraniteWorkflowCoreJobJobHandlerProperties3.hashCode(), comAdobeGraniteWorkflowCoreJobJobHandlerProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeGraniteWorkflowCoreJobJob comAdobeGraniteWorkflowCoreJobJobHandlerProperties = new OASComAdobeGraniteWorkflowCoreJobJob();
        Map<String, String> propertyMappings = comAdobeGraniteWorkflowCoreJobJobHandlerProperties.getPropertyMappings();
        System.assertEquals('jobTopics', propertyMappings.get('job.topics'));
        System.assertEquals('allowSelfProcessTermination', propertyMappings.get('allow.self.process.termination'));
    }
}
