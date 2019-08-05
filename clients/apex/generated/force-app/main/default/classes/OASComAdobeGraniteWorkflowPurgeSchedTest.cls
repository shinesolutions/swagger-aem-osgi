@isTest
private class OASComAdobeGraniteWorkflowPurgeSchedTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeGraniteWorkflowPurgeSched comAdobeGraniteWorkflowPurgeSchedulerProperties1 = OASComAdobeGraniteWorkflowPurgeSched.getExample();
        OASComAdobeGraniteWorkflowPurgeSched comAdobeGraniteWorkflowPurgeSchedulerProperties2 = comAdobeGraniteWorkflowPurgeSchedulerProperties1;
        OASComAdobeGraniteWorkflowPurgeSched comAdobeGraniteWorkflowPurgeSchedulerProperties3 = new OASComAdobeGraniteWorkflowPurgeSched();
        OASComAdobeGraniteWorkflowPurgeSched comAdobeGraniteWorkflowPurgeSchedulerProperties4 = comAdobeGraniteWorkflowPurgeSchedulerProperties3;

        System.assert(comAdobeGraniteWorkflowPurgeSchedulerProperties1.equals(comAdobeGraniteWorkflowPurgeSchedulerProperties2));
        System.assert(comAdobeGraniteWorkflowPurgeSchedulerProperties2.equals(comAdobeGraniteWorkflowPurgeSchedulerProperties1));
        System.assert(comAdobeGraniteWorkflowPurgeSchedulerProperties1.equals(comAdobeGraniteWorkflowPurgeSchedulerProperties1));
        System.assert(comAdobeGraniteWorkflowPurgeSchedulerProperties3.equals(comAdobeGraniteWorkflowPurgeSchedulerProperties4));
        System.assert(comAdobeGraniteWorkflowPurgeSchedulerProperties4.equals(comAdobeGraniteWorkflowPurgeSchedulerProperties3));
        System.assert(comAdobeGraniteWorkflowPurgeSchedulerProperties3.equals(comAdobeGraniteWorkflowPurgeSchedulerProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeGraniteWorkflowPurgeSched comAdobeGraniteWorkflowPurgeSchedulerProperties1 = OASComAdobeGraniteWorkflowPurgeSched.getExample();
        OASComAdobeGraniteWorkflowPurgeSched comAdobeGraniteWorkflowPurgeSchedulerProperties2 = OASComAdobeGraniteWorkflowPurgeSched.getExample();
        OASComAdobeGraniteWorkflowPurgeSched comAdobeGraniteWorkflowPurgeSchedulerProperties3 = new OASComAdobeGraniteWorkflowPurgeSched();
        OASComAdobeGraniteWorkflowPurgeSched comAdobeGraniteWorkflowPurgeSchedulerProperties4 = new OASComAdobeGraniteWorkflowPurgeSched();

        System.assert(comAdobeGraniteWorkflowPurgeSchedulerProperties1.equals(comAdobeGraniteWorkflowPurgeSchedulerProperties2));
        System.assert(comAdobeGraniteWorkflowPurgeSchedulerProperties2.equals(comAdobeGraniteWorkflowPurgeSchedulerProperties1));
        System.assert(comAdobeGraniteWorkflowPurgeSchedulerProperties3.equals(comAdobeGraniteWorkflowPurgeSchedulerProperties4));
        System.assert(comAdobeGraniteWorkflowPurgeSchedulerProperties4.equals(comAdobeGraniteWorkflowPurgeSchedulerProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeGraniteWorkflowPurgeSched comAdobeGraniteWorkflowPurgeSchedulerProperties1 = OASComAdobeGraniteWorkflowPurgeSched.getExample();
        OASComAdobeGraniteWorkflowPurgeSched comAdobeGraniteWorkflowPurgeSchedulerProperties2 = new OASComAdobeGraniteWorkflowPurgeSched();

        System.assertEquals(false, comAdobeGraniteWorkflowPurgeSchedulerProperties1.equals('foo'));
        System.assertEquals(false, comAdobeGraniteWorkflowPurgeSchedulerProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeGraniteWorkflowPurgeSched comAdobeGraniteWorkflowPurgeSchedulerProperties1 = OASComAdobeGraniteWorkflowPurgeSched.getExample();
        OASComAdobeGraniteWorkflowPurgeSched comAdobeGraniteWorkflowPurgeSchedulerProperties2 = new OASComAdobeGraniteWorkflowPurgeSched();
        OASComAdobeGraniteWorkflowPurgeSched comAdobeGraniteWorkflowPurgeSchedulerProperties3;

        System.assertEquals(false, comAdobeGraniteWorkflowPurgeSchedulerProperties1.equals(comAdobeGraniteWorkflowPurgeSchedulerProperties3));
        System.assertEquals(false, comAdobeGraniteWorkflowPurgeSchedulerProperties2.equals(comAdobeGraniteWorkflowPurgeSchedulerProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeGraniteWorkflowPurgeSched comAdobeGraniteWorkflowPurgeSchedulerProperties1 = OASComAdobeGraniteWorkflowPurgeSched.getExample();
        OASComAdobeGraniteWorkflowPurgeSched comAdobeGraniteWorkflowPurgeSchedulerProperties2 = new OASComAdobeGraniteWorkflowPurgeSched();

        System.assertEquals(comAdobeGraniteWorkflowPurgeSchedulerProperties1.hashCode(), comAdobeGraniteWorkflowPurgeSchedulerProperties1.hashCode());
        System.assertEquals(comAdobeGraniteWorkflowPurgeSchedulerProperties2.hashCode(), comAdobeGraniteWorkflowPurgeSchedulerProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeGraniteWorkflowPurgeSched comAdobeGraniteWorkflowPurgeSchedulerProperties1 = OASComAdobeGraniteWorkflowPurgeSched.getExample();
        OASComAdobeGraniteWorkflowPurgeSched comAdobeGraniteWorkflowPurgeSchedulerProperties2 = OASComAdobeGraniteWorkflowPurgeSched.getExample();
        OASComAdobeGraniteWorkflowPurgeSched comAdobeGraniteWorkflowPurgeSchedulerProperties3 = new OASComAdobeGraniteWorkflowPurgeSched();
        OASComAdobeGraniteWorkflowPurgeSched comAdobeGraniteWorkflowPurgeSchedulerProperties4 = new OASComAdobeGraniteWorkflowPurgeSched();

        System.assert(comAdobeGraniteWorkflowPurgeSchedulerProperties1.equals(comAdobeGraniteWorkflowPurgeSchedulerProperties2));
        System.assert(comAdobeGraniteWorkflowPurgeSchedulerProperties3.equals(comAdobeGraniteWorkflowPurgeSchedulerProperties4));
        System.assertEquals(comAdobeGraniteWorkflowPurgeSchedulerProperties1.hashCode(), comAdobeGraniteWorkflowPurgeSchedulerProperties2.hashCode());
        System.assertEquals(comAdobeGraniteWorkflowPurgeSchedulerProperties3.hashCode(), comAdobeGraniteWorkflowPurgeSchedulerProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeGraniteWorkflowPurgeSched comAdobeGraniteWorkflowPurgeSchedulerProperties = new OASComAdobeGraniteWorkflowPurgeSched();
        Map<String, String> propertyMappings = comAdobeGraniteWorkflowPurgeSchedulerProperties.getPropertyMappings();
        System.assertEquals('scheduledpurgeName', propertyMappings.get('scheduledpurge.name'));
        System.assertEquals('scheduledpurgeWorkflowStatus', propertyMappings.get('scheduledpurge.workflowStatus'));
        System.assertEquals('scheduledpurgeModelIds', propertyMappings.get('scheduledpurge.modelIds'));
        System.assertEquals('scheduledpurgeDaysold', propertyMappings.get('scheduledpurge.daysold'));
    }
}
