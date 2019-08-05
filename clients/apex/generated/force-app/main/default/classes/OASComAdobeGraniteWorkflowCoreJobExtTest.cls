@isTest
private class OASComAdobeGraniteWorkflowCoreJobExtTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeGraniteWorkflowCoreJobExt comAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties1 = OASComAdobeGraniteWorkflowCoreJobExt.getExample();
        OASComAdobeGraniteWorkflowCoreJobExt comAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties2 = comAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties1;
        OASComAdobeGraniteWorkflowCoreJobExt comAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties3 = new OASComAdobeGraniteWorkflowCoreJobExt();
        OASComAdobeGraniteWorkflowCoreJobExt comAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties4 = comAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties3;

        System.assert(comAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties1.equals(comAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties2));
        System.assert(comAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties2.equals(comAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties1));
        System.assert(comAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties1.equals(comAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties1));
        System.assert(comAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties3.equals(comAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties4));
        System.assert(comAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties4.equals(comAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties3));
        System.assert(comAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties3.equals(comAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeGraniteWorkflowCoreJobExt comAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties1 = OASComAdobeGraniteWorkflowCoreJobExt.getExample();
        OASComAdobeGraniteWorkflowCoreJobExt comAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties2 = OASComAdobeGraniteWorkflowCoreJobExt.getExample();
        OASComAdobeGraniteWorkflowCoreJobExt comAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties3 = new OASComAdobeGraniteWorkflowCoreJobExt();
        OASComAdobeGraniteWorkflowCoreJobExt comAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties4 = new OASComAdobeGraniteWorkflowCoreJobExt();

        System.assert(comAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties1.equals(comAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties2));
        System.assert(comAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties2.equals(comAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties1));
        System.assert(comAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties3.equals(comAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties4));
        System.assert(comAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties4.equals(comAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeGraniteWorkflowCoreJobExt comAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties1 = OASComAdobeGraniteWorkflowCoreJobExt.getExample();
        OASComAdobeGraniteWorkflowCoreJobExt comAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties2 = new OASComAdobeGraniteWorkflowCoreJobExt();

        System.assertEquals(false, comAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties1.equals('foo'));
        System.assertEquals(false, comAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeGraniteWorkflowCoreJobExt comAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties1 = OASComAdobeGraniteWorkflowCoreJobExt.getExample();
        OASComAdobeGraniteWorkflowCoreJobExt comAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties2 = new OASComAdobeGraniteWorkflowCoreJobExt();
        OASComAdobeGraniteWorkflowCoreJobExt comAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties3;

        System.assertEquals(false, comAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties1.equals(comAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties3));
        System.assertEquals(false, comAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties2.equals(comAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeGraniteWorkflowCoreJobExt comAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties1 = OASComAdobeGraniteWorkflowCoreJobExt.getExample();
        OASComAdobeGraniteWorkflowCoreJobExt comAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties2 = new OASComAdobeGraniteWorkflowCoreJobExt();

        System.assertEquals(comAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties1.hashCode(), comAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties1.hashCode());
        System.assertEquals(comAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties2.hashCode(), comAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeGraniteWorkflowCoreJobExt comAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties1 = OASComAdobeGraniteWorkflowCoreJobExt.getExample();
        OASComAdobeGraniteWorkflowCoreJobExt comAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties2 = OASComAdobeGraniteWorkflowCoreJobExt.getExample();
        OASComAdobeGraniteWorkflowCoreJobExt comAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties3 = new OASComAdobeGraniteWorkflowCoreJobExt();
        OASComAdobeGraniteWorkflowCoreJobExt comAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties4 = new OASComAdobeGraniteWorkflowCoreJobExt();

        System.assert(comAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties1.equals(comAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties2));
        System.assert(comAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties3.equals(comAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties4));
        System.assertEquals(comAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties1.hashCode(), comAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties2.hashCode());
        System.assertEquals(comAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties3.hashCode(), comAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeGraniteWorkflowCoreJobExt comAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties = new OASComAdobeGraniteWorkflowCoreJobExt();
        Map<String, String> propertyMappings = comAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties.getPropertyMappings();
        System.assertEquals('defaultTimeout', propertyMappings.get('default.timeout'));
        System.assertEquals('maxTimeout', propertyMappings.get('max.timeout'));
        System.assertEquals('defaultPeriod', propertyMappings.get('default.period'));
    }
}
