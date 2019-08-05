@isTest
private class OASComAdobeGraniteWorkflowConsolePubTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeGraniteWorkflowConsolePub comAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties1 = OASComAdobeGraniteWorkflowConsolePub.getExample();
        OASComAdobeGraniteWorkflowConsolePub comAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties2 = comAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties1;
        OASComAdobeGraniteWorkflowConsolePub comAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties3 = new OASComAdobeGraniteWorkflowConsolePub();
        OASComAdobeGraniteWorkflowConsolePub comAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties4 = comAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties3;

        System.assert(comAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties1.equals(comAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties2));
        System.assert(comAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties2.equals(comAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties1));
        System.assert(comAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties1.equals(comAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties1));
        System.assert(comAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties3.equals(comAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties4));
        System.assert(comAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties4.equals(comAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties3));
        System.assert(comAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties3.equals(comAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeGraniteWorkflowConsolePub comAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties1 = OASComAdobeGraniteWorkflowConsolePub.getExample();
        OASComAdobeGraniteWorkflowConsolePub comAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties2 = OASComAdobeGraniteWorkflowConsolePub.getExample();
        OASComAdobeGraniteWorkflowConsolePub comAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties3 = new OASComAdobeGraniteWorkflowConsolePub();
        OASComAdobeGraniteWorkflowConsolePub comAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties4 = new OASComAdobeGraniteWorkflowConsolePub();

        System.assert(comAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties1.equals(comAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties2));
        System.assert(comAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties2.equals(comAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties1));
        System.assert(comAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties3.equals(comAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties4));
        System.assert(comAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties4.equals(comAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeGraniteWorkflowConsolePub comAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties1 = OASComAdobeGraniteWorkflowConsolePub.getExample();
        OASComAdobeGraniteWorkflowConsolePub comAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties2 = new OASComAdobeGraniteWorkflowConsolePub();

        System.assertEquals(false, comAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties1.equals('foo'));
        System.assertEquals(false, comAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeGraniteWorkflowConsolePub comAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties1 = OASComAdobeGraniteWorkflowConsolePub.getExample();
        OASComAdobeGraniteWorkflowConsolePub comAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties2 = new OASComAdobeGraniteWorkflowConsolePub();
        OASComAdobeGraniteWorkflowConsolePub comAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties3;

        System.assertEquals(false, comAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties1.equals(comAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties3));
        System.assertEquals(false, comAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties2.equals(comAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeGraniteWorkflowConsolePub comAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties1 = OASComAdobeGraniteWorkflowConsolePub.getExample();
        OASComAdobeGraniteWorkflowConsolePub comAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties2 = new OASComAdobeGraniteWorkflowConsolePub();

        System.assertEquals(comAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties1.hashCode(), comAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties1.hashCode());
        System.assertEquals(comAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties2.hashCode(), comAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeGraniteWorkflowConsolePub comAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties1 = OASComAdobeGraniteWorkflowConsolePub.getExample();
        OASComAdobeGraniteWorkflowConsolePub comAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties2 = OASComAdobeGraniteWorkflowConsolePub.getExample();
        OASComAdobeGraniteWorkflowConsolePub comAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties3 = new OASComAdobeGraniteWorkflowConsolePub();
        OASComAdobeGraniteWorkflowConsolePub comAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties4 = new OASComAdobeGraniteWorkflowConsolePub();

        System.assert(comAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties1.equals(comAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties2));
        System.assert(comAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties3.equals(comAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties4));
        System.assertEquals(comAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties1.hashCode(), comAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties2.hashCode());
        System.assertEquals(comAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties3.hashCode(), comAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeGraniteWorkflowConsolePub comAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties = new OASComAdobeGraniteWorkflowConsolePub();
        Map<String, String> propertyMappings = comAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties.getPropertyMappings();
        System.assertEquals('graniteWorkflowWorkflowPublishEventServiceEnabled', propertyMappings.get('granite.workflow.WorkflowPublishEventService.enabled'));
    }
}
