@isTest
private class OASComAdobeGraniteSystemMonitoringImTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeGraniteSystemMonitoringIm comAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties1 = OASComAdobeGraniteSystemMonitoringIm.getExample();
        OASComAdobeGraniteSystemMonitoringIm comAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties2 = comAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties1;
        OASComAdobeGraniteSystemMonitoringIm comAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties3 = new OASComAdobeGraniteSystemMonitoringIm();
        OASComAdobeGraniteSystemMonitoringIm comAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties4 = comAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties3;

        System.assert(comAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties1.equals(comAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties2));
        System.assert(comAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties2.equals(comAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties1));
        System.assert(comAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties1.equals(comAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties1));
        System.assert(comAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties3.equals(comAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties4));
        System.assert(comAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties4.equals(comAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties3));
        System.assert(comAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties3.equals(comAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeGraniteSystemMonitoringIm comAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties1 = OASComAdobeGraniteSystemMonitoringIm.getExample();
        OASComAdobeGraniteSystemMonitoringIm comAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties2 = OASComAdobeGraniteSystemMonitoringIm.getExample();
        OASComAdobeGraniteSystemMonitoringIm comAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties3 = new OASComAdobeGraniteSystemMonitoringIm();
        OASComAdobeGraniteSystemMonitoringIm comAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties4 = new OASComAdobeGraniteSystemMonitoringIm();

        System.assert(comAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties1.equals(comAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties2));
        System.assert(comAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties2.equals(comAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties1));
        System.assert(comAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties3.equals(comAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties4));
        System.assert(comAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties4.equals(comAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeGraniteSystemMonitoringIm comAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties1 = OASComAdobeGraniteSystemMonitoringIm.getExample();
        OASComAdobeGraniteSystemMonitoringIm comAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties2 = new OASComAdobeGraniteSystemMonitoringIm();

        System.assertEquals(false, comAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties1.equals('foo'));
        System.assertEquals(false, comAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeGraniteSystemMonitoringIm comAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties1 = OASComAdobeGraniteSystemMonitoringIm.getExample();
        OASComAdobeGraniteSystemMonitoringIm comAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties2 = new OASComAdobeGraniteSystemMonitoringIm();
        OASComAdobeGraniteSystemMonitoringIm comAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties3;

        System.assertEquals(false, comAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties1.equals(comAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties3));
        System.assertEquals(false, comAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties2.equals(comAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeGraniteSystemMonitoringIm comAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties1 = OASComAdobeGraniteSystemMonitoringIm.getExample();
        OASComAdobeGraniteSystemMonitoringIm comAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties2 = new OASComAdobeGraniteSystemMonitoringIm();

        System.assertEquals(comAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties1.hashCode(), comAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties1.hashCode());
        System.assertEquals(comAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties2.hashCode(), comAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeGraniteSystemMonitoringIm comAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties1 = OASComAdobeGraniteSystemMonitoringIm.getExample();
        OASComAdobeGraniteSystemMonitoringIm comAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties2 = OASComAdobeGraniteSystemMonitoringIm.getExample();
        OASComAdobeGraniteSystemMonitoringIm comAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties3 = new OASComAdobeGraniteSystemMonitoringIm();
        OASComAdobeGraniteSystemMonitoringIm comAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties4 = new OASComAdobeGraniteSystemMonitoringIm();

        System.assert(comAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties1.equals(comAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties2));
        System.assert(comAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties3.equals(comAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties4));
        System.assertEquals(comAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties1.hashCode(), comAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties2.hashCode());
        System.assertEquals(comAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties3.hashCode(), comAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeGraniteSystemMonitoringIm comAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties = new OASComAdobeGraniteSystemMonitoringIm();
        Map<String, String> propertyMappings = comAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties.getPropertyMappings();
        System.assertEquals('schedulerExpression', propertyMappings.get('scheduler.expression'));
        System.assertEquals('jmxObjectname', propertyMappings.get('jmx.objectname'));
    }
}
