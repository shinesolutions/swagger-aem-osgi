@isTest
private class OASComAdobeGraniteMonitoringImplScriTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeGraniteMonitoringImplScri comAdobeGraniteMonitoringImplScriptConfigImplProperties1 = OASComAdobeGraniteMonitoringImplScri.getExample();
        OASComAdobeGraniteMonitoringImplScri comAdobeGraniteMonitoringImplScriptConfigImplProperties2 = comAdobeGraniteMonitoringImplScriptConfigImplProperties1;
        OASComAdobeGraniteMonitoringImplScri comAdobeGraniteMonitoringImplScriptConfigImplProperties3 = new OASComAdobeGraniteMonitoringImplScri();
        OASComAdobeGraniteMonitoringImplScri comAdobeGraniteMonitoringImplScriptConfigImplProperties4 = comAdobeGraniteMonitoringImplScriptConfigImplProperties3;

        System.assert(comAdobeGraniteMonitoringImplScriptConfigImplProperties1.equals(comAdobeGraniteMonitoringImplScriptConfigImplProperties2));
        System.assert(comAdobeGraniteMonitoringImplScriptConfigImplProperties2.equals(comAdobeGraniteMonitoringImplScriptConfigImplProperties1));
        System.assert(comAdobeGraniteMonitoringImplScriptConfigImplProperties1.equals(comAdobeGraniteMonitoringImplScriptConfigImplProperties1));
        System.assert(comAdobeGraniteMonitoringImplScriptConfigImplProperties3.equals(comAdobeGraniteMonitoringImplScriptConfigImplProperties4));
        System.assert(comAdobeGraniteMonitoringImplScriptConfigImplProperties4.equals(comAdobeGraniteMonitoringImplScriptConfigImplProperties3));
        System.assert(comAdobeGraniteMonitoringImplScriptConfigImplProperties3.equals(comAdobeGraniteMonitoringImplScriptConfigImplProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeGraniteMonitoringImplScri comAdobeGraniteMonitoringImplScriptConfigImplProperties1 = OASComAdobeGraniteMonitoringImplScri.getExample();
        OASComAdobeGraniteMonitoringImplScri comAdobeGraniteMonitoringImplScriptConfigImplProperties2 = OASComAdobeGraniteMonitoringImplScri.getExample();
        OASComAdobeGraniteMonitoringImplScri comAdobeGraniteMonitoringImplScriptConfigImplProperties3 = new OASComAdobeGraniteMonitoringImplScri();
        OASComAdobeGraniteMonitoringImplScri comAdobeGraniteMonitoringImplScriptConfigImplProperties4 = new OASComAdobeGraniteMonitoringImplScri();

        System.assert(comAdobeGraniteMonitoringImplScriptConfigImplProperties1.equals(comAdobeGraniteMonitoringImplScriptConfigImplProperties2));
        System.assert(comAdobeGraniteMonitoringImplScriptConfigImplProperties2.equals(comAdobeGraniteMonitoringImplScriptConfigImplProperties1));
        System.assert(comAdobeGraniteMonitoringImplScriptConfigImplProperties3.equals(comAdobeGraniteMonitoringImplScriptConfigImplProperties4));
        System.assert(comAdobeGraniteMonitoringImplScriptConfigImplProperties4.equals(comAdobeGraniteMonitoringImplScriptConfigImplProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeGraniteMonitoringImplScri comAdobeGraniteMonitoringImplScriptConfigImplProperties1 = OASComAdobeGraniteMonitoringImplScri.getExample();
        OASComAdobeGraniteMonitoringImplScri comAdobeGraniteMonitoringImplScriptConfigImplProperties2 = new OASComAdobeGraniteMonitoringImplScri();

        System.assertEquals(false, comAdobeGraniteMonitoringImplScriptConfigImplProperties1.equals('foo'));
        System.assertEquals(false, comAdobeGraniteMonitoringImplScriptConfigImplProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeGraniteMonitoringImplScri comAdobeGraniteMonitoringImplScriptConfigImplProperties1 = OASComAdobeGraniteMonitoringImplScri.getExample();
        OASComAdobeGraniteMonitoringImplScri comAdobeGraniteMonitoringImplScriptConfigImplProperties2 = new OASComAdobeGraniteMonitoringImplScri();
        OASComAdobeGraniteMonitoringImplScri comAdobeGraniteMonitoringImplScriptConfigImplProperties3;

        System.assertEquals(false, comAdobeGraniteMonitoringImplScriptConfigImplProperties1.equals(comAdobeGraniteMonitoringImplScriptConfigImplProperties3));
        System.assertEquals(false, comAdobeGraniteMonitoringImplScriptConfigImplProperties2.equals(comAdobeGraniteMonitoringImplScriptConfigImplProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeGraniteMonitoringImplScri comAdobeGraniteMonitoringImplScriptConfigImplProperties1 = OASComAdobeGraniteMonitoringImplScri.getExample();
        OASComAdobeGraniteMonitoringImplScri comAdobeGraniteMonitoringImplScriptConfigImplProperties2 = new OASComAdobeGraniteMonitoringImplScri();

        System.assertEquals(comAdobeGraniteMonitoringImplScriptConfigImplProperties1.hashCode(), comAdobeGraniteMonitoringImplScriptConfigImplProperties1.hashCode());
        System.assertEquals(comAdobeGraniteMonitoringImplScriptConfigImplProperties2.hashCode(), comAdobeGraniteMonitoringImplScriptConfigImplProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeGraniteMonitoringImplScri comAdobeGraniteMonitoringImplScriptConfigImplProperties1 = OASComAdobeGraniteMonitoringImplScri.getExample();
        OASComAdobeGraniteMonitoringImplScri comAdobeGraniteMonitoringImplScriptConfigImplProperties2 = OASComAdobeGraniteMonitoringImplScri.getExample();
        OASComAdobeGraniteMonitoringImplScri comAdobeGraniteMonitoringImplScriptConfigImplProperties3 = new OASComAdobeGraniteMonitoringImplScri();
        OASComAdobeGraniteMonitoringImplScri comAdobeGraniteMonitoringImplScriptConfigImplProperties4 = new OASComAdobeGraniteMonitoringImplScri();

        System.assert(comAdobeGraniteMonitoringImplScriptConfigImplProperties1.equals(comAdobeGraniteMonitoringImplScriptConfigImplProperties2));
        System.assert(comAdobeGraniteMonitoringImplScriptConfigImplProperties3.equals(comAdobeGraniteMonitoringImplScriptConfigImplProperties4));
        System.assertEquals(comAdobeGraniteMonitoringImplScriptConfigImplProperties1.hashCode(), comAdobeGraniteMonitoringImplScriptConfigImplProperties2.hashCode());
        System.assertEquals(comAdobeGraniteMonitoringImplScriptConfigImplProperties3.hashCode(), comAdobeGraniteMonitoringImplScriptConfigImplProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeGraniteMonitoringImplScri comAdobeGraniteMonitoringImplScriptConfigImplProperties = new OASComAdobeGraniteMonitoringImplScri();
        Map<String, String> propertyMappings = comAdobeGraniteMonitoringImplScriptConfigImplProperties.getPropertyMappings();
        System.assertEquals('scriptFilename', propertyMappings.get('script.filename'));
        System.assertEquals('scriptDisplay', propertyMappings.get('script.display'));
        System.assertEquals('scriptPath', propertyMappings.get('script.path'));
        System.assertEquals('scriptPlatform', propertyMappings.get('script.platform'));
    }
}
