@isTest
private class OASComAdobeGraniteAuthImsImplIMSAcceTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeGraniteAuthImsImplIMSAcce comAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties1 = OASComAdobeGraniteAuthImsImplIMSAcce.getExample();
        OASComAdobeGraniteAuthImsImplIMSAcce comAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties2 = comAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties1;
        OASComAdobeGraniteAuthImsImplIMSAcce comAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties3 = new OASComAdobeGraniteAuthImsImplIMSAcce();
        OASComAdobeGraniteAuthImsImplIMSAcce comAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties4 = comAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties3;

        System.assert(comAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties1.equals(comAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties2));
        System.assert(comAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties2.equals(comAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties1));
        System.assert(comAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties1.equals(comAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties1));
        System.assert(comAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties3.equals(comAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties4));
        System.assert(comAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties4.equals(comAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties3));
        System.assert(comAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties3.equals(comAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeGraniteAuthImsImplIMSAcce comAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties1 = OASComAdobeGraniteAuthImsImplIMSAcce.getExample();
        OASComAdobeGraniteAuthImsImplIMSAcce comAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties2 = OASComAdobeGraniteAuthImsImplIMSAcce.getExample();
        OASComAdobeGraniteAuthImsImplIMSAcce comAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties3 = new OASComAdobeGraniteAuthImsImplIMSAcce();
        OASComAdobeGraniteAuthImsImplIMSAcce comAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties4 = new OASComAdobeGraniteAuthImsImplIMSAcce();

        System.assert(comAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties1.equals(comAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties2));
        System.assert(comAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties2.equals(comAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties1));
        System.assert(comAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties3.equals(comAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties4));
        System.assert(comAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties4.equals(comAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeGraniteAuthImsImplIMSAcce comAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties1 = OASComAdobeGraniteAuthImsImplIMSAcce.getExample();
        OASComAdobeGraniteAuthImsImplIMSAcce comAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties2 = new OASComAdobeGraniteAuthImsImplIMSAcce();

        System.assertEquals(false, comAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties1.equals('foo'));
        System.assertEquals(false, comAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeGraniteAuthImsImplIMSAcce comAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties1 = OASComAdobeGraniteAuthImsImplIMSAcce.getExample();
        OASComAdobeGraniteAuthImsImplIMSAcce comAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties2 = new OASComAdobeGraniteAuthImsImplIMSAcce();
        OASComAdobeGraniteAuthImsImplIMSAcce comAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties3;

        System.assertEquals(false, comAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties1.equals(comAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties3));
        System.assertEquals(false, comAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties2.equals(comAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeGraniteAuthImsImplIMSAcce comAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties1 = OASComAdobeGraniteAuthImsImplIMSAcce.getExample();
        OASComAdobeGraniteAuthImsImplIMSAcce comAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties2 = new OASComAdobeGraniteAuthImsImplIMSAcce();

        System.assertEquals(comAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties1.hashCode(), comAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties1.hashCode());
        System.assertEquals(comAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties2.hashCode(), comAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeGraniteAuthImsImplIMSAcce comAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties1 = OASComAdobeGraniteAuthImsImplIMSAcce.getExample();
        OASComAdobeGraniteAuthImsImplIMSAcce comAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties2 = OASComAdobeGraniteAuthImsImplIMSAcce.getExample();
        OASComAdobeGraniteAuthImsImplIMSAcce comAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties3 = new OASComAdobeGraniteAuthImsImplIMSAcce();
        OASComAdobeGraniteAuthImsImplIMSAcce comAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties4 = new OASComAdobeGraniteAuthImsImplIMSAcce();

        System.assert(comAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties1.equals(comAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties2));
        System.assert(comAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties3.equals(comAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties4));
        System.assertEquals(comAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties1.hashCode(), comAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties2.hashCode());
        System.assertEquals(comAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties3.hashCode(), comAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeGraniteAuthImsImplIMSAcce comAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties = new OASComAdobeGraniteAuthImsImplIMSAcce();
        Map<String, String> propertyMappings = comAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties.getPropertyMappings();
        System.assertEquals('authImsClientSecret', propertyMappings.get('auth.ims.client.secret'));
        System.assertEquals('customizerType', propertyMappings.get('customizer.type'));
    }
}
