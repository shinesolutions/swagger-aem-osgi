@isTest
private class OASComAdobeGraniteLoggingImplLogAnalTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeGraniteLoggingImplLogAnal comAdobeGraniteLoggingImplLogAnalyserImplProperties1 = OASComAdobeGraniteLoggingImplLogAnal.getExample();
        OASComAdobeGraniteLoggingImplLogAnal comAdobeGraniteLoggingImplLogAnalyserImplProperties2 = comAdobeGraniteLoggingImplLogAnalyserImplProperties1;
        OASComAdobeGraniteLoggingImplLogAnal comAdobeGraniteLoggingImplLogAnalyserImplProperties3 = new OASComAdobeGraniteLoggingImplLogAnal();
        OASComAdobeGraniteLoggingImplLogAnal comAdobeGraniteLoggingImplLogAnalyserImplProperties4 = comAdobeGraniteLoggingImplLogAnalyserImplProperties3;

        System.assert(comAdobeGraniteLoggingImplLogAnalyserImplProperties1.equals(comAdobeGraniteLoggingImplLogAnalyserImplProperties2));
        System.assert(comAdobeGraniteLoggingImplLogAnalyserImplProperties2.equals(comAdobeGraniteLoggingImplLogAnalyserImplProperties1));
        System.assert(comAdobeGraniteLoggingImplLogAnalyserImplProperties1.equals(comAdobeGraniteLoggingImplLogAnalyserImplProperties1));
        System.assert(comAdobeGraniteLoggingImplLogAnalyserImplProperties3.equals(comAdobeGraniteLoggingImplLogAnalyserImplProperties4));
        System.assert(comAdobeGraniteLoggingImplLogAnalyserImplProperties4.equals(comAdobeGraniteLoggingImplLogAnalyserImplProperties3));
        System.assert(comAdobeGraniteLoggingImplLogAnalyserImplProperties3.equals(comAdobeGraniteLoggingImplLogAnalyserImplProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeGraniteLoggingImplLogAnal comAdobeGraniteLoggingImplLogAnalyserImplProperties1 = OASComAdobeGraniteLoggingImplLogAnal.getExample();
        OASComAdobeGraniteLoggingImplLogAnal comAdobeGraniteLoggingImplLogAnalyserImplProperties2 = OASComAdobeGraniteLoggingImplLogAnal.getExample();
        OASComAdobeGraniteLoggingImplLogAnal comAdobeGraniteLoggingImplLogAnalyserImplProperties3 = new OASComAdobeGraniteLoggingImplLogAnal();
        OASComAdobeGraniteLoggingImplLogAnal comAdobeGraniteLoggingImplLogAnalyserImplProperties4 = new OASComAdobeGraniteLoggingImplLogAnal();

        System.assert(comAdobeGraniteLoggingImplLogAnalyserImplProperties1.equals(comAdobeGraniteLoggingImplLogAnalyserImplProperties2));
        System.assert(comAdobeGraniteLoggingImplLogAnalyserImplProperties2.equals(comAdobeGraniteLoggingImplLogAnalyserImplProperties1));
        System.assert(comAdobeGraniteLoggingImplLogAnalyserImplProperties3.equals(comAdobeGraniteLoggingImplLogAnalyserImplProperties4));
        System.assert(comAdobeGraniteLoggingImplLogAnalyserImplProperties4.equals(comAdobeGraniteLoggingImplLogAnalyserImplProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeGraniteLoggingImplLogAnal comAdobeGraniteLoggingImplLogAnalyserImplProperties1 = OASComAdobeGraniteLoggingImplLogAnal.getExample();
        OASComAdobeGraniteLoggingImplLogAnal comAdobeGraniteLoggingImplLogAnalyserImplProperties2 = new OASComAdobeGraniteLoggingImplLogAnal();

        System.assertEquals(false, comAdobeGraniteLoggingImplLogAnalyserImplProperties1.equals('foo'));
        System.assertEquals(false, comAdobeGraniteLoggingImplLogAnalyserImplProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeGraniteLoggingImplLogAnal comAdobeGraniteLoggingImplLogAnalyserImplProperties1 = OASComAdobeGraniteLoggingImplLogAnal.getExample();
        OASComAdobeGraniteLoggingImplLogAnal comAdobeGraniteLoggingImplLogAnalyserImplProperties2 = new OASComAdobeGraniteLoggingImplLogAnal();
        OASComAdobeGraniteLoggingImplLogAnal comAdobeGraniteLoggingImplLogAnalyserImplProperties3;

        System.assertEquals(false, comAdobeGraniteLoggingImplLogAnalyserImplProperties1.equals(comAdobeGraniteLoggingImplLogAnalyserImplProperties3));
        System.assertEquals(false, comAdobeGraniteLoggingImplLogAnalyserImplProperties2.equals(comAdobeGraniteLoggingImplLogAnalyserImplProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeGraniteLoggingImplLogAnal comAdobeGraniteLoggingImplLogAnalyserImplProperties1 = OASComAdobeGraniteLoggingImplLogAnal.getExample();
        OASComAdobeGraniteLoggingImplLogAnal comAdobeGraniteLoggingImplLogAnalyserImplProperties2 = new OASComAdobeGraniteLoggingImplLogAnal();

        System.assertEquals(comAdobeGraniteLoggingImplLogAnalyserImplProperties1.hashCode(), comAdobeGraniteLoggingImplLogAnalyserImplProperties1.hashCode());
        System.assertEquals(comAdobeGraniteLoggingImplLogAnalyserImplProperties2.hashCode(), comAdobeGraniteLoggingImplLogAnalyserImplProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeGraniteLoggingImplLogAnal comAdobeGraniteLoggingImplLogAnalyserImplProperties1 = OASComAdobeGraniteLoggingImplLogAnal.getExample();
        OASComAdobeGraniteLoggingImplLogAnal comAdobeGraniteLoggingImplLogAnalyserImplProperties2 = OASComAdobeGraniteLoggingImplLogAnal.getExample();
        OASComAdobeGraniteLoggingImplLogAnal comAdobeGraniteLoggingImplLogAnalyserImplProperties3 = new OASComAdobeGraniteLoggingImplLogAnal();
        OASComAdobeGraniteLoggingImplLogAnal comAdobeGraniteLoggingImplLogAnalyserImplProperties4 = new OASComAdobeGraniteLoggingImplLogAnal();

        System.assert(comAdobeGraniteLoggingImplLogAnalyserImplProperties1.equals(comAdobeGraniteLoggingImplLogAnalyserImplProperties2));
        System.assert(comAdobeGraniteLoggingImplLogAnalyserImplProperties3.equals(comAdobeGraniteLoggingImplLogAnalyserImplProperties4));
        System.assertEquals(comAdobeGraniteLoggingImplLogAnalyserImplProperties1.hashCode(), comAdobeGraniteLoggingImplLogAnalyserImplProperties2.hashCode());
        System.assertEquals(comAdobeGraniteLoggingImplLogAnalyserImplProperties3.hashCode(), comAdobeGraniteLoggingImplLogAnalyserImplProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeGraniteLoggingImplLogAnal comAdobeGraniteLoggingImplLogAnalyserImplProperties = new OASComAdobeGraniteLoggingImplLogAnal();
        Map<String, String> propertyMappings = comAdobeGraniteLoggingImplLogAnalyserImplProperties.getPropertyMappings();
        System.assertEquals('messagesQueueSize', propertyMappings.get('messages.queue.size'));
        System.assertEquals('loggerConfig', propertyMappings.get('logger.config'));
        System.assertEquals('messagesSize', propertyMappings.get('messages.size'));
    }
}
