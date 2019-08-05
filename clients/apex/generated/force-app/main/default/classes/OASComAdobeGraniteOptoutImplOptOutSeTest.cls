@isTest
private class OASComAdobeGraniteOptoutImplOptOutSeTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeGraniteOptoutImplOptOutSe comAdobeGraniteOptoutImplOptOutServiceImplProperties1 = OASComAdobeGraniteOptoutImplOptOutSe.getExample();
        OASComAdobeGraniteOptoutImplOptOutSe comAdobeGraniteOptoutImplOptOutServiceImplProperties2 = comAdobeGraniteOptoutImplOptOutServiceImplProperties1;
        OASComAdobeGraniteOptoutImplOptOutSe comAdobeGraniteOptoutImplOptOutServiceImplProperties3 = new OASComAdobeGraniteOptoutImplOptOutSe();
        OASComAdobeGraniteOptoutImplOptOutSe comAdobeGraniteOptoutImplOptOutServiceImplProperties4 = comAdobeGraniteOptoutImplOptOutServiceImplProperties3;

        System.assert(comAdobeGraniteOptoutImplOptOutServiceImplProperties1.equals(comAdobeGraniteOptoutImplOptOutServiceImplProperties2));
        System.assert(comAdobeGraniteOptoutImplOptOutServiceImplProperties2.equals(comAdobeGraniteOptoutImplOptOutServiceImplProperties1));
        System.assert(comAdobeGraniteOptoutImplOptOutServiceImplProperties1.equals(comAdobeGraniteOptoutImplOptOutServiceImplProperties1));
        System.assert(comAdobeGraniteOptoutImplOptOutServiceImplProperties3.equals(comAdobeGraniteOptoutImplOptOutServiceImplProperties4));
        System.assert(comAdobeGraniteOptoutImplOptOutServiceImplProperties4.equals(comAdobeGraniteOptoutImplOptOutServiceImplProperties3));
        System.assert(comAdobeGraniteOptoutImplOptOutServiceImplProperties3.equals(comAdobeGraniteOptoutImplOptOutServiceImplProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeGraniteOptoutImplOptOutSe comAdobeGraniteOptoutImplOptOutServiceImplProperties1 = OASComAdobeGraniteOptoutImplOptOutSe.getExample();
        OASComAdobeGraniteOptoutImplOptOutSe comAdobeGraniteOptoutImplOptOutServiceImplProperties2 = OASComAdobeGraniteOptoutImplOptOutSe.getExample();
        OASComAdobeGraniteOptoutImplOptOutSe comAdobeGraniteOptoutImplOptOutServiceImplProperties3 = new OASComAdobeGraniteOptoutImplOptOutSe();
        OASComAdobeGraniteOptoutImplOptOutSe comAdobeGraniteOptoutImplOptOutServiceImplProperties4 = new OASComAdobeGraniteOptoutImplOptOutSe();

        System.assert(comAdobeGraniteOptoutImplOptOutServiceImplProperties1.equals(comAdobeGraniteOptoutImplOptOutServiceImplProperties2));
        System.assert(comAdobeGraniteOptoutImplOptOutServiceImplProperties2.equals(comAdobeGraniteOptoutImplOptOutServiceImplProperties1));
        System.assert(comAdobeGraniteOptoutImplOptOutServiceImplProperties3.equals(comAdobeGraniteOptoutImplOptOutServiceImplProperties4));
        System.assert(comAdobeGraniteOptoutImplOptOutServiceImplProperties4.equals(comAdobeGraniteOptoutImplOptOutServiceImplProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeGraniteOptoutImplOptOutSe comAdobeGraniteOptoutImplOptOutServiceImplProperties1 = OASComAdobeGraniteOptoutImplOptOutSe.getExample();
        OASComAdobeGraniteOptoutImplOptOutSe comAdobeGraniteOptoutImplOptOutServiceImplProperties2 = new OASComAdobeGraniteOptoutImplOptOutSe();

        System.assertEquals(false, comAdobeGraniteOptoutImplOptOutServiceImplProperties1.equals('foo'));
        System.assertEquals(false, comAdobeGraniteOptoutImplOptOutServiceImplProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeGraniteOptoutImplOptOutSe comAdobeGraniteOptoutImplOptOutServiceImplProperties1 = OASComAdobeGraniteOptoutImplOptOutSe.getExample();
        OASComAdobeGraniteOptoutImplOptOutSe comAdobeGraniteOptoutImplOptOutServiceImplProperties2 = new OASComAdobeGraniteOptoutImplOptOutSe();
        OASComAdobeGraniteOptoutImplOptOutSe comAdobeGraniteOptoutImplOptOutServiceImplProperties3;

        System.assertEquals(false, comAdobeGraniteOptoutImplOptOutServiceImplProperties1.equals(comAdobeGraniteOptoutImplOptOutServiceImplProperties3));
        System.assertEquals(false, comAdobeGraniteOptoutImplOptOutServiceImplProperties2.equals(comAdobeGraniteOptoutImplOptOutServiceImplProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeGraniteOptoutImplOptOutSe comAdobeGraniteOptoutImplOptOutServiceImplProperties1 = OASComAdobeGraniteOptoutImplOptOutSe.getExample();
        OASComAdobeGraniteOptoutImplOptOutSe comAdobeGraniteOptoutImplOptOutServiceImplProperties2 = new OASComAdobeGraniteOptoutImplOptOutSe();

        System.assertEquals(comAdobeGraniteOptoutImplOptOutServiceImplProperties1.hashCode(), comAdobeGraniteOptoutImplOptOutServiceImplProperties1.hashCode());
        System.assertEquals(comAdobeGraniteOptoutImplOptOutServiceImplProperties2.hashCode(), comAdobeGraniteOptoutImplOptOutServiceImplProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeGraniteOptoutImplOptOutSe comAdobeGraniteOptoutImplOptOutServiceImplProperties1 = OASComAdobeGraniteOptoutImplOptOutSe.getExample();
        OASComAdobeGraniteOptoutImplOptOutSe comAdobeGraniteOptoutImplOptOutServiceImplProperties2 = OASComAdobeGraniteOptoutImplOptOutSe.getExample();
        OASComAdobeGraniteOptoutImplOptOutSe comAdobeGraniteOptoutImplOptOutServiceImplProperties3 = new OASComAdobeGraniteOptoutImplOptOutSe();
        OASComAdobeGraniteOptoutImplOptOutSe comAdobeGraniteOptoutImplOptOutServiceImplProperties4 = new OASComAdobeGraniteOptoutImplOptOutSe();

        System.assert(comAdobeGraniteOptoutImplOptOutServiceImplProperties1.equals(comAdobeGraniteOptoutImplOptOutServiceImplProperties2));
        System.assert(comAdobeGraniteOptoutImplOptOutServiceImplProperties3.equals(comAdobeGraniteOptoutImplOptOutServiceImplProperties4));
        System.assertEquals(comAdobeGraniteOptoutImplOptOutServiceImplProperties1.hashCode(), comAdobeGraniteOptoutImplOptOutServiceImplProperties2.hashCode());
        System.assertEquals(comAdobeGraniteOptoutImplOptOutServiceImplProperties3.hashCode(), comAdobeGraniteOptoutImplOptOutServiceImplProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeGraniteOptoutImplOptOutSe comAdobeGraniteOptoutImplOptOutServiceImplProperties = new OASComAdobeGraniteOptoutImplOptOutSe();
        Map<String, String> propertyMappings = comAdobeGraniteOptoutImplOptOutServiceImplProperties.getPropertyMappings();
        System.assertEquals('optoutCookies', propertyMappings.get('optout.cookies'));
        System.assertEquals('optoutHeaders', propertyMappings.get('optout.headers'));
        System.assertEquals('optoutWhitelistCookies', propertyMappings.get('optout.whitelist.cookies'));
    }
}
