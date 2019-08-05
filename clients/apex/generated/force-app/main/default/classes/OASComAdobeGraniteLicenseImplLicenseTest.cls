@isTest
private class OASComAdobeGraniteLicenseImplLicenseTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeGraniteLicenseImplLicense comAdobeGraniteLicenseImplLicenseCheckFilterProperties1 = OASComAdobeGraniteLicenseImplLicense.getExample();
        OASComAdobeGraniteLicenseImplLicense comAdobeGraniteLicenseImplLicenseCheckFilterProperties2 = comAdobeGraniteLicenseImplLicenseCheckFilterProperties1;
        OASComAdobeGraniteLicenseImplLicense comAdobeGraniteLicenseImplLicenseCheckFilterProperties3 = new OASComAdobeGraniteLicenseImplLicense();
        OASComAdobeGraniteLicenseImplLicense comAdobeGraniteLicenseImplLicenseCheckFilterProperties4 = comAdobeGraniteLicenseImplLicenseCheckFilterProperties3;

        System.assert(comAdobeGraniteLicenseImplLicenseCheckFilterProperties1.equals(comAdobeGraniteLicenseImplLicenseCheckFilterProperties2));
        System.assert(comAdobeGraniteLicenseImplLicenseCheckFilterProperties2.equals(comAdobeGraniteLicenseImplLicenseCheckFilterProperties1));
        System.assert(comAdobeGraniteLicenseImplLicenseCheckFilterProperties1.equals(comAdobeGraniteLicenseImplLicenseCheckFilterProperties1));
        System.assert(comAdobeGraniteLicenseImplLicenseCheckFilterProperties3.equals(comAdobeGraniteLicenseImplLicenseCheckFilterProperties4));
        System.assert(comAdobeGraniteLicenseImplLicenseCheckFilterProperties4.equals(comAdobeGraniteLicenseImplLicenseCheckFilterProperties3));
        System.assert(comAdobeGraniteLicenseImplLicenseCheckFilterProperties3.equals(comAdobeGraniteLicenseImplLicenseCheckFilterProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeGraniteLicenseImplLicense comAdobeGraniteLicenseImplLicenseCheckFilterProperties1 = OASComAdobeGraniteLicenseImplLicense.getExample();
        OASComAdobeGraniteLicenseImplLicense comAdobeGraniteLicenseImplLicenseCheckFilterProperties2 = OASComAdobeGraniteLicenseImplLicense.getExample();
        OASComAdobeGraniteLicenseImplLicense comAdobeGraniteLicenseImplLicenseCheckFilterProperties3 = new OASComAdobeGraniteLicenseImplLicense();
        OASComAdobeGraniteLicenseImplLicense comAdobeGraniteLicenseImplLicenseCheckFilterProperties4 = new OASComAdobeGraniteLicenseImplLicense();

        System.assert(comAdobeGraniteLicenseImplLicenseCheckFilterProperties1.equals(comAdobeGraniteLicenseImplLicenseCheckFilterProperties2));
        System.assert(comAdobeGraniteLicenseImplLicenseCheckFilterProperties2.equals(comAdobeGraniteLicenseImplLicenseCheckFilterProperties1));
        System.assert(comAdobeGraniteLicenseImplLicenseCheckFilterProperties3.equals(comAdobeGraniteLicenseImplLicenseCheckFilterProperties4));
        System.assert(comAdobeGraniteLicenseImplLicenseCheckFilterProperties4.equals(comAdobeGraniteLicenseImplLicenseCheckFilterProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeGraniteLicenseImplLicense comAdobeGraniteLicenseImplLicenseCheckFilterProperties1 = OASComAdobeGraniteLicenseImplLicense.getExample();
        OASComAdobeGraniteLicenseImplLicense comAdobeGraniteLicenseImplLicenseCheckFilterProperties2 = new OASComAdobeGraniteLicenseImplLicense();

        System.assertEquals(false, comAdobeGraniteLicenseImplLicenseCheckFilterProperties1.equals('foo'));
        System.assertEquals(false, comAdobeGraniteLicenseImplLicenseCheckFilterProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeGraniteLicenseImplLicense comAdobeGraniteLicenseImplLicenseCheckFilterProperties1 = OASComAdobeGraniteLicenseImplLicense.getExample();
        OASComAdobeGraniteLicenseImplLicense comAdobeGraniteLicenseImplLicenseCheckFilterProperties2 = new OASComAdobeGraniteLicenseImplLicense();
        OASComAdobeGraniteLicenseImplLicense comAdobeGraniteLicenseImplLicenseCheckFilterProperties3;

        System.assertEquals(false, comAdobeGraniteLicenseImplLicenseCheckFilterProperties1.equals(comAdobeGraniteLicenseImplLicenseCheckFilterProperties3));
        System.assertEquals(false, comAdobeGraniteLicenseImplLicenseCheckFilterProperties2.equals(comAdobeGraniteLicenseImplLicenseCheckFilterProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeGraniteLicenseImplLicense comAdobeGraniteLicenseImplLicenseCheckFilterProperties1 = OASComAdobeGraniteLicenseImplLicense.getExample();
        OASComAdobeGraniteLicenseImplLicense comAdobeGraniteLicenseImplLicenseCheckFilterProperties2 = new OASComAdobeGraniteLicenseImplLicense();

        System.assertEquals(comAdobeGraniteLicenseImplLicenseCheckFilterProperties1.hashCode(), comAdobeGraniteLicenseImplLicenseCheckFilterProperties1.hashCode());
        System.assertEquals(comAdobeGraniteLicenseImplLicenseCheckFilterProperties2.hashCode(), comAdobeGraniteLicenseImplLicenseCheckFilterProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeGraniteLicenseImplLicense comAdobeGraniteLicenseImplLicenseCheckFilterProperties1 = OASComAdobeGraniteLicenseImplLicense.getExample();
        OASComAdobeGraniteLicenseImplLicense comAdobeGraniteLicenseImplLicenseCheckFilterProperties2 = OASComAdobeGraniteLicenseImplLicense.getExample();
        OASComAdobeGraniteLicenseImplLicense comAdobeGraniteLicenseImplLicenseCheckFilterProperties3 = new OASComAdobeGraniteLicenseImplLicense();
        OASComAdobeGraniteLicenseImplLicense comAdobeGraniteLicenseImplLicenseCheckFilterProperties4 = new OASComAdobeGraniteLicenseImplLicense();

        System.assert(comAdobeGraniteLicenseImplLicenseCheckFilterProperties1.equals(comAdobeGraniteLicenseImplLicenseCheckFilterProperties2));
        System.assert(comAdobeGraniteLicenseImplLicenseCheckFilterProperties3.equals(comAdobeGraniteLicenseImplLicenseCheckFilterProperties4));
        System.assertEquals(comAdobeGraniteLicenseImplLicenseCheckFilterProperties1.hashCode(), comAdobeGraniteLicenseImplLicenseCheckFilterProperties2.hashCode());
        System.assertEquals(comAdobeGraniteLicenseImplLicenseCheckFilterProperties3.hashCode(), comAdobeGraniteLicenseImplLicenseCheckFilterProperties4.hashCode());
    }
}
