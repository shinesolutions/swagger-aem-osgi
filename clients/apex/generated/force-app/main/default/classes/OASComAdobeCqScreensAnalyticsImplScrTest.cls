@isTest
private class OASComAdobeCqScreensAnalyticsImplScrTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeCqScreensAnalyticsImplScr comAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties1 = OASComAdobeCqScreensAnalyticsImplScr.getExample();
        OASComAdobeCqScreensAnalyticsImplScr comAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties2 = comAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties1;
        OASComAdobeCqScreensAnalyticsImplScr comAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties3 = new OASComAdobeCqScreensAnalyticsImplScr();
        OASComAdobeCqScreensAnalyticsImplScr comAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties4 = comAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties3;

        System.assert(comAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties1.equals(comAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties2));
        System.assert(comAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties2.equals(comAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties1));
        System.assert(comAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties1.equals(comAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties1));
        System.assert(comAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties3.equals(comAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties4));
        System.assert(comAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties4.equals(comAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties3));
        System.assert(comAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties3.equals(comAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeCqScreensAnalyticsImplScr comAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties1 = OASComAdobeCqScreensAnalyticsImplScr.getExample();
        OASComAdobeCqScreensAnalyticsImplScr comAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties2 = OASComAdobeCqScreensAnalyticsImplScr.getExample();
        OASComAdobeCqScreensAnalyticsImplScr comAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties3 = new OASComAdobeCqScreensAnalyticsImplScr();
        OASComAdobeCqScreensAnalyticsImplScr comAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties4 = new OASComAdobeCqScreensAnalyticsImplScr();

        System.assert(comAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties1.equals(comAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties2));
        System.assert(comAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties2.equals(comAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties1));
        System.assert(comAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties3.equals(comAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties4));
        System.assert(comAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties4.equals(comAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeCqScreensAnalyticsImplScr comAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties1 = OASComAdobeCqScreensAnalyticsImplScr.getExample();
        OASComAdobeCqScreensAnalyticsImplScr comAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties2 = new OASComAdobeCqScreensAnalyticsImplScr();

        System.assertEquals(false, comAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties1.equals('foo'));
        System.assertEquals(false, comAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeCqScreensAnalyticsImplScr comAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties1 = OASComAdobeCqScreensAnalyticsImplScr.getExample();
        OASComAdobeCqScreensAnalyticsImplScr comAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties2 = new OASComAdobeCqScreensAnalyticsImplScr();
        OASComAdobeCqScreensAnalyticsImplScr comAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties3;

        System.assertEquals(false, comAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties1.equals(comAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties3));
        System.assertEquals(false, comAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties2.equals(comAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeCqScreensAnalyticsImplScr comAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties1 = OASComAdobeCqScreensAnalyticsImplScr.getExample();
        OASComAdobeCqScreensAnalyticsImplScr comAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties2 = new OASComAdobeCqScreensAnalyticsImplScr();

        System.assertEquals(comAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties1.hashCode(), comAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties1.hashCode());
        System.assertEquals(comAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties2.hashCode(), comAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeCqScreensAnalyticsImplScr comAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties1 = OASComAdobeCqScreensAnalyticsImplScr.getExample();
        OASComAdobeCqScreensAnalyticsImplScr comAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties2 = OASComAdobeCqScreensAnalyticsImplScr.getExample();
        OASComAdobeCqScreensAnalyticsImplScr comAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties3 = new OASComAdobeCqScreensAnalyticsImplScr();
        OASComAdobeCqScreensAnalyticsImplScr comAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties4 = new OASComAdobeCqScreensAnalyticsImplScr();

        System.assert(comAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties1.equals(comAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties2));
        System.assert(comAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties3.equals(comAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties4));
        System.assertEquals(comAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties1.hashCode(), comAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties2.hashCode());
        System.assertEquals(comAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties3.hashCode(), comAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeCqScreensAnalyticsImplScr comAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties = new OASComAdobeCqScreensAnalyticsImplScr();
        Map<String, String> propertyMappings = comAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties.getPropertyMappings();
        System.assertEquals('comAdobeCqScreensAnalyticsImplUrl', propertyMappings.get('com.adobe.cq.screens.analytics.impl.url'));
        System.assertEquals('comAdobeCqScreensAnalyticsImplApikey', propertyMappings.get('com.adobe.cq.screens.analytics.impl.apikey'));
        System.assertEquals('comAdobeCqScreensAnalyticsImplProject', propertyMappings.get('com.adobe.cq.screens.analytics.impl.project'));
        System.assertEquals('comAdobeCqScreensAnalyticsImplEnvironment', propertyMappings.get('com.adobe.cq.screens.analytics.impl.environment'));
        System.assertEquals('comAdobeCqScreensAnalyticsImplSendFrequency', propertyMappings.get('com.adobe.cq.screens.analytics.impl.sendFrequency'));
    }
}
