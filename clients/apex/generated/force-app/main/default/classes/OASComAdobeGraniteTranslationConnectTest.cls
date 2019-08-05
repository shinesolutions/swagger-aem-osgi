@isTest
private class OASComAdobeGraniteTranslationConnectTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeGraniteTranslationConnect comAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties1 = OASComAdobeGraniteTranslationConnect.getExample();
        OASComAdobeGraniteTranslationConnect comAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties2 = comAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties1;
        OASComAdobeGraniteTranslationConnect comAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties3 = new OASComAdobeGraniteTranslationConnect();
        OASComAdobeGraniteTranslationConnect comAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties4 = comAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties3;

        System.assert(comAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties1.equals(comAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties2));
        System.assert(comAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties2.equals(comAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties1));
        System.assert(comAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties1.equals(comAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties1));
        System.assert(comAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties3.equals(comAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties4));
        System.assert(comAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties4.equals(comAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties3));
        System.assert(comAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties3.equals(comAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeGraniteTranslationConnect comAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties1 = OASComAdobeGraniteTranslationConnect.getExample();
        OASComAdobeGraniteTranslationConnect comAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties2 = OASComAdobeGraniteTranslationConnect.getExample();
        OASComAdobeGraniteTranslationConnect comAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties3 = new OASComAdobeGraniteTranslationConnect();
        OASComAdobeGraniteTranslationConnect comAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties4 = new OASComAdobeGraniteTranslationConnect();

        System.assert(comAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties1.equals(comAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties2));
        System.assert(comAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties2.equals(comAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties1));
        System.assert(comAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties3.equals(comAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties4));
        System.assert(comAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties4.equals(comAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeGraniteTranslationConnect comAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties1 = OASComAdobeGraniteTranslationConnect.getExample();
        OASComAdobeGraniteTranslationConnect comAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties2 = new OASComAdobeGraniteTranslationConnect();

        System.assertEquals(false, comAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties1.equals('foo'));
        System.assertEquals(false, comAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeGraniteTranslationConnect comAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties1 = OASComAdobeGraniteTranslationConnect.getExample();
        OASComAdobeGraniteTranslationConnect comAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties2 = new OASComAdobeGraniteTranslationConnect();
        OASComAdobeGraniteTranslationConnect comAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties3;

        System.assertEquals(false, comAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties1.equals(comAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties3));
        System.assertEquals(false, comAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties2.equals(comAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeGraniteTranslationConnect comAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties1 = OASComAdobeGraniteTranslationConnect.getExample();
        OASComAdobeGraniteTranslationConnect comAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties2 = new OASComAdobeGraniteTranslationConnect();

        System.assertEquals(comAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties1.hashCode(), comAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties1.hashCode());
        System.assertEquals(comAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties2.hashCode(), comAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeGraniteTranslationConnect comAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties1 = OASComAdobeGraniteTranslationConnect.getExample();
        OASComAdobeGraniteTranslationConnect comAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties2 = OASComAdobeGraniteTranslationConnect.getExample();
        OASComAdobeGraniteTranslationConnect comAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties3 = new OASComAdobeGraniteTranslationConnect();
        OASComAdobeGraniteTranslationConnect comAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties4 = new OASComAdobeGraniteTranslationConnect();

        System.assert(comAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties1.equals(comAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties2));
        System.assert(comAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties3.equals(comAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties4));
        System.assertEquals(comAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties1.hashCode(), comAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties2.hashCode());
        System.assertEquals(comAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties3.hashCode(), comAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties4.hashCode());
    }
}
