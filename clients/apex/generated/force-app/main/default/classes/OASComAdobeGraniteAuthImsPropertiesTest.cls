@isTest
private class OASComAdobeGraniteAuthImsPropertiesTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeGraniteAuthImsProperties comAdobeGraniteAuthImsProperties1 = OASComAdobeGraniteAuthImsProperties.getExample();
        OASComAdobeGraniteAuthImsProperties comAdobeGraniteAuthImsProperties2 = comAdobeGraniteAuthImsProperties1;
        OASComAdobeGraniteAuthImsProperties comAdobeGraniteAuthImsProperties3 = new OASComAdobeGraniteAuthImsProperties();
        OASComAdobeGraniteAuthImsProperties comAdobeGraniteAuthImsProperties4 = comAdobeGraniteAuthImsProperties3;

        System.assert(comAdobeGraniteAuthImsProperties1.equals(comAdobeGraniteAuthImsProperties2));
        System.assert(comAdobeGraniteAuthImsProperties2.equals(comAdobeGraniteAuthImsProperties1));
        System.assert(comAdobeGraniteAuthImsProperties1.equals(comAdobeGraniteAuthImsProperties1));
        System.assert(comAdobeGraniteAuthImsProperties3.equals(comAdobeGraniteAuthImsProperties4));
        System.assert(comAdobeGraniteAuthImsProperties4.equals(comAdobeGraniteAuthImsProperties3));
        System.assert(comAdobeGraniteAuthImsProperties3.equals(comAdobeGraniteAuthImsProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeGraniteAuthImsProperties comAdobeGraniteAuthImsProperties1 = OASComAdobeGraniteAuthImsProperties.getExample();
        OASComAdobeGraniteAuthImsProperties comAdobeGraniteAuthImsProperties2 = OASComAdobeGraniteAuthImsProperties.getExample();
        OASComAdobeGraniteAuthImsProperties comAdobeGraniteAuthImsProperties3 = new OASComAdobeGraniteAuthImsProperties();
        OASComAdobeGraniteAuthImsProperties comAdobeGraniteAuthImsProperties4 = new OASComAdobeGraniteAuthImsProperties();

        System.assert(comAdobeGraniteAuthImsProperties1.equals(comAdobeGraniteAuthImsProperties2));
        System.assert(comAdobeGraniteAuthImsProperties2.equals(comAdobeGraniteAuthImsProperties1));
        System.assert(comAdobeGraniteAuthImsProperties3.equals(comAdobeGraniteAuthImsProperties4));
        System.assert(comAdobeGraniteAuthImsProperties4.equals(comAdobeGraniteAuthImsProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeGraniteAuthImsProperties comAdobeGraniteAuthImsProperties1 = OASComAdobeGraniteAuthImsProperties.getExample();
        OASComAdobeGraniteAuthImsProperties comAdobeGraniteAuthImsProperties2 = new OASComAdobeGraniteAuthImsProperties();

        System.assertEquals(false, comAdobeGraniteAuthImsProperties1.equals('foo'));
        System.assertEquals(false, comAdobeGraniteAuthImsProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeGraniteAuthImsProperties comAdobeGraniteAuthImsProperties1 = OASComAdobeGraniteAuthImsProperties.getExample();
        OASComAdobeGraniteAuthImsProperties comAdobeGraniteAuthImsProperties2 = new OASComAdobeGraniteAuthImsProperties();
        OASComAdobeGraniteAuthImsProperties comAdobeGraniteAuthImsProperties3;

        System.assertEquals(false, comAdobeGraniteAuthImsProperties1.equals(comAdobeGraniteAuthImsProperties3));
        System.assertEquals(false, comAdobeGraniteAuthImsProperties2.equals(comAdobeGraniteAuthImsProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeGraniteAuthImsProperties comAdobeGraniteAuthImsProperties1 = OASComAdobeGraniteAuthImsProperties.getExample();
        OASComAdobeGraniteAuthImsProperties comAdobeGraniteAuthImsProperties2 = new OASComAdobeGraniteAuthImsProperties();

        System.assertEquals(comAdobeGraniteAuthImsProperties1.hashCode(), comAdobeGraniteAuthImsProperties1.hashCode());
        System.assertEquals(comAdobeGraniteAuthImsProperties2.hashCode(), comAdobeGraniteAuthImsProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeGraniteAuthImsProperties comAdobeGraniteAuthImsProperties1 = OASComAdobeGraniteAuthImsProperties.getExample();
        OASComAdobeGraniteAuthImsProperties comAdobeGraniteAuthImsProperties2 = OASComAdobeGraniteAuthImsProperties.getExample();
        OASComAdobeGraniteAuthImsProperties comAdobeGraniteAuthImsProperties3 = new OASComAdobeGraniteAuthImsProperties();
        OASComAdobeGraniteAuthImsProperties comAdobeGraniteAuthImsProperties4 = new OASComAdobeGraniteAuthImsProperties();

        System.assert(comAdobeGraniteAuthImsProperties1.equals(comAdobeGraniteAuthImsProperties2));
        System.assert(comAdobeGraniteAuthImsProperties3.equals(comAdobeGraniteAuthImsProperties4));
        System.assertEquals(comAdobeGraniteAuthImsProperties1.hashCode(), comAdobeGraniteAuthImsProperties2.hashCode());
        System.assertEquals(comAdobeGraniteAuthImsProperties3.hashCode(), comAdobeGraniteAuthImsProperties4.hashCode());
    }
}
