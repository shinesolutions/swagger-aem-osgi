@isTest
private class OASComAdobeGraniteLoggingImplLogErroTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeGraniteLoggingImplLogErro comAdobeGraniteLoggingImplLogErrorHealthCheckProperties1 = OASComAdobeGraniteLoggingImplLogErro.getExample();
        OASComAdobeGraniteLoggingImplLogErro comAdobeGraniteLoggingImplLogErrorHealthCheckProperties2 = comAdobeGraniteLoggingImplLogErrorHealthCheckProperties1;
        OASComAdobeGraniteLoggingImplLogErro comAdobeGraniteLoggingImplLogErrorHealthCheckProperties3 = new OASComAdobeGraniteLoggingImplLogErro();
        OASComAdobeGraniteLoggingImplLogErro comAdobeGraniteLoggingImplLogErrorHealthCheckProperties4 = comAdobeGraniteLoggingImplLogErrorHealthCheckProperties3;

        System.assert(comAdobeGraniteLoggingImplLogErrorHealthCheckProperties1.equals(comAdobeGraniteLoggingImplLogErrorHealthCheckProperties2));
        System.assert(comAdobeGraniteLoggingImplLogErrorHealthCheckProperties2.equals(comAdobeGraniteLoggingImplLogErrorHealthCheckProperties1));
        System.assert(comAdobeGraniteLoggingImplLogErrorHealthCheckProperties1.equals(comAdobeGraniteLoggingImplLogErrorHealthCheckProperties1));
        System.assert(comAdobeGraniteLoggingImplLogErrorHealthCheckProperties3.equals(comAdobeGraniteLoggingImplLogErrorHealthCheckProperties4));
        System.assert(comAdobeGraniteLoggingImplLogErrorHealthCheckProperties4.equals(comAdobeGraniteLoggingImplLogErrorHealthCheckProperties3));
        System.assert(comAdobeGraniteLoggingImplLogErrorHealthCheckProperties3.equals(comAdobeGraniteLoggingImplLogErrorHealthCheckProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeGraniteLoggingImplLogErro comAdobeGraniteLoggingImplLogErrorHealthCheckProperties1 = OASComAdobeGraniteLoggingImplLogErro.getExample();
        OASComAdobeGraniteLoggingImplLogErro comAdobeGraniteLoggingImplLogErrorHealthCheckProperties2 = OASComAdobeGraniteLoggingImplLogErro.getExample();
        OASComAdobeGraniteLoggingImplLogErro comAdobeGraniteLoggingImplLogErrorHealthCheckProperties3 = new OASComAdobeGraniteLoggingImplLogErro();
        OASComAdobeGraniteLoggingImplLogErro comAdobeGraniteLoggingImplLogErrorHealthCheckProperties4 = new OASComAdobeGraniteLoggingImplLogErro();

        System.assert(comAdobeGraniteLoggingImplLogErrorHealthCheckProperties1.equals(comAdobeGraniteLoggingImplLogErrorHealthCheckProperties2));
        System.assert(comAdobeGraniteLoggingImplLogErrorHealthCheckProperties2.equals(comAdobeGraniteLoggingImplLogErrorHealthCheckProperties1));
        System.assert(comAdobeGraniteLoggingImplLogErrorHealthCheckProperties3.equals(comAdobeGraniteLoggingImplLogErrorHealthCheckProperties4));
        System.assert(comAdobeGraniteLoggingImplLogErrorHealthCheckProperties4.equals(comAdobeGraniteLoggingImplLogErrorHealthCheckProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeGraniteLoggingImplLogErro comAdobeGraniteLoggingImplLogErrorHealthCheckProperties1 = OASComAdobeGraniteLoggingImplLogErro.getExample();
        OASComAdobeGraniteLoggingImplLogErro comAdobeGraniteLoggingImplLogErrorHealthCheckProperties2 = new OASComAdobeGraniteLoggingImplLogErro();

        System.assertEquals(false, comAdobeGraniteLoggingImplLogErrorHealthCheckProperties1.equals('foo'));
        System.assertEquals(false, comAdobeGraniteLoggingImplLogErrorHealthCheckProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeGraniteLoggingImplLogErro comAdobeGraniteLoggingImplLogErrorHealthCheckProperties1 = OASComAdobeGraniteLoggingImplLogErro.getExample();
        OASComAdobeGraniteLoggingImplLogErro comAdobeGraniteLoggingImplLogErrorHealthCheckProperties2 = new OASComAdobeGraniteLoggingImplLogErro();
        OASComAdobeGraniteLoggingImplLogErro comAdobeGraniteLoggingImplLogErrorHealthCheckProperties3;

        System.assertEquals(false, comAdobeGraniteLoggingImplLogErrorHealthCheckProperties1.equals(comAdobeGraniteLoggingImplLogErrorHealthCheckProperties3));
        System.assertEquals(false, comAdobeGraniteLoggingImplLogErrorHealthCheckProperties2.equals(comAdobeGraniteLoggingImplLogErrorHealthCheckProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeGraniteLoggingImplLogErro comAdobeGraniteLoggingImplLogErrorHealthCheckProperties1 = OASComAdobeGraniteLoggingImplLogErro.getExample();
        OASComAdobeGraniteLoggingImplLogErro comAdobeGraniteLoggingImplLogErrorHealthCheckProperties2 = new OASComAdobeGraniteLoggingImplLogErro();

        System.assertEquals(comAdobeGraniteLoggingImplLogErrorHealthCheckProperties1.hashCode(), comAdobeGraniteLoggingImplLogErrorHealthCheckProperties1.hashCode());
        System.assertEquals(comAdobeGraniteLoggingImplLogErrorHealthCheckProperties2.hashCode(), comAdobeGraniteLoggingImplLogErrorHealthCheckProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeGraniteLoggingImplLogErro comAdobeGraniteLoggingImplLogErrorHealthCheckProperties1 = OASComAdobeGraniteLoggingImplLogErro.getExample();
        OASComAdobeGraniteLoggingImplLogErro comAdobeGraniteLoggingImplLogErrorHealthCheckProperties2 = OASComAdobeGraniteLoggingImplLogErro.getExample();
        OASComAdobeGraniteLoggingImplLogErro comAdobeGraniteLoggingImplLogErrorHealthCheckProperties3 = new OASComAdobeGraniteLoggingImplLogErro();
        OASComAdobeGraniteLoggingImplLogErro comAdobeGraniteLoggingImplLogErrorHealthCheckProperties4 = new OASComAdobeGraniteLoggingImplLogErro();

        System.assert(comAdobeGraniteLoggingImplLogErrorHealthCheckProperties1.equals(comAdobeGraniteLoggingImplLogErrorHealthCheckProperties2));
        System.assert(comAdobeGraniteLoggingImplLogErrorHealthCheckProperties3.equals(comAdobeGraniteLoggingImplLogErrorHealthCheckProperties4));
        System.assertEquals(comAdobeGraniteLoggingImplLogErrorHealthCheckProperties1.hashCode(), comAdobeGraniteLoggingImplLogErrorHealthCheckProperties2.hashCode());
        System.assertEquals(comAdobeGraniteLoggingImplLogErrorHealthCheckProperties3.hashCode(), comAdobeGraniteLoggingImplLogErrorHealthCheckProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeGraniteLoggingImplLogErro comAdobeGraniteLoggingImplLogErrorHealthCheckProperties = new OASComAdobeGraniteLoggingImplLogErro();
        Map<String, String> propertyMappings = comAdobeGraniteLoggingImplLogErrorHealthCheckProperties.getPropertyMappings();
        System.assertEquals('hcTags', propertyMappings.get('hc.tags'));
    }
}
