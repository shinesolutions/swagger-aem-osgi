@isTest
private class OASComAdobeGraniteSecurityUserUserPrTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeGraniteSecurityUserUserPr comAdobeGraniteSecurityUserUserPropertiesServiceProperties1 = OASComAdobeGraniteSecurityUserUserPr.getExample();
        OASComAdobeGraniteSecurityUserUserPr comAdobeGraniteSecurityUserUserPropertiesServiceProperties2 = comAdobeGraniteSecurityUserUserPropertiesServiceProperties1;
        OASComAdobeGraniteSecurityUserUserPr comAdobeGraniteSecurityUserUserPropertiesServiceProperties3 = new OASComAdobeGraniteSecurityUserUserPr();
        OASComAdobeGraniteSecurityUserUserPr comAdobeGraniteSecurityUserUserPropertiesServiceProperties4 = comAdobeGraniteSecurityUserUserPropertiesServiceProperties3;

        System.assert(comAdobeGraniteSecurityUserUserPropertiesServiceProperties1.equals(comAdobeGraniteSecurityUserUserPropertiesServiceProperties2));
        System.assert(comAdobeGraniteSecurityUserUserPropertiesServiceProperties2.equals(comAdobeGraniteSecurityUserUserPropertiesServiceProperties1));
        System.assert(comAdobeGraniteSecurityUserUserPropertiesServiceProperties1.equals(comAdobeGraniteSecurityUserUserPropertiesServiceProperties1));
        System.assert(comAdobeGraniteSecurityUserUserPropertiesServiceProperties3.equals(comAdobeGraniteSecurityUserUserPropertiesServiceProperties4));
        System.assert(comAdobeGraniteSecurityUserUserPropertiesServiceProperties4.equals(comAdobeGraniteSecurityUserUserPropertiesServiceProperties3));
        System.assert(comAdobeGraniteSecurityUserUserPropertiesServiceProperties3.equals(comAdobeGraniteSecurityUserUserPropertiesServiceProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeGraniteSecurityUserUserPr comAdobeGraniteSecurityUserUserPropertiesServiceProperties1 = OASComAdobeGraniteSecurityUserUserPr.getExample();
        OASComAdobeGraniteSecurityUserUserPr comAdobeGraniteSecurityUserUserPropertiesServiceProperties2 = OASComAdobeGraniteSecurityUserUserPr.getExample();
        OASComAdobeGraniteSecurityUserUserPr comAdobeGraniteSecurityUserUserPropertiesServiceProperties3 = new OASComAdobeGraniteSecurityUserUserPr();
        OASComAdobeGraniteSecurityUserUserPr comAdobeGraniteSecurityUserUserPropertiesServiceProperties4 = new OASComAdobeGraniteSecurityUserUserPr();

        System.assert(comAdobeGraniteSecurityUserUserPropertiesServiceProperties1.equals(comAdobeGraniteSecurityUserUserPropertiesServiceProperties2));
        System.assert(comAdobeGraniteSecurityUserUserPropertiesServiceProperties2.equals(comAdobeGraniteSecurityUserUserPropertiesServiceProperties1));
        System.assert(comAdobeGraniteSecurityUserUserPropertiesServiceProperties3.equals(comAdobeGraniteSecurityUserUserPropertiesServiceProperties4));
        System.assert(comAdobeGraniteSecurityUserUserPropertiesServiceProperties4.equals(comAdobeGraniteSecurityUserUserPropertiesServiceProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeGraniteSecurityUserUserPr comAdobeGraniteSecurityUserUserPropertiesServiceProperties1 = OASComAdobeGraniteSecurityUserUserPr.getExample();
        OASComAdobeGraniteSecurityUserUserPr comAdobeGraniteSecurityUserUserPropertiesServiceProperties2 = new OASComAdobeGraniteSecurityUserUserPr();

        System.assertEquals(false, comAdobeGraniteSecurityUserUserPropertiesServiceProperties1.equals('foo'));
        System.assertEquals(false, comAdobeGraniteSecurityUserUserPropertiesServiceProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeGraniteSecurityUserUserPr comAdobeGraniteSecurityUserUserPropertiesServiceProperties1 = OASComAdobeGraniteSecurityUserUserPr.getExample();
        OASComAdobeGraniteSecurityUserUserPr comAdobeGraniteSecurityUserUserPropertiesServiceProperties2 = new OASComAdobeGraniteSecurityUserUserPr();
        OASComAdobeGraniteSecurityUserUserPr comAdobeGraniteSecurityUserUserPropertiesServiceProperties3;

        System.assertEquals(false, comAdobeGraniteSecurityUserUserPropertiesServiceProperties1.equals(comAdobeGraniteSecurityUserUserPropertiesServiceProperties3));
        System.assertEquals(false, comAdobeGraniteSecurityUserUserPropertiesServiceProperties2.equals(comAdobeGraniteSecurityUserUserPropertiesServiceProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeGraniteSecurityUserUserPr comAdobeGraniteSecurityUserUserPropertiesServiceProperties1 = OASComAdobeGraniteSecurityUserUserPr.getExample();
        OASComAdobeGraniteSecurityUserUserPr comAdobeGraniteSecurityUserUserPropertiesServiceProperties2 = new OASComAdobeGraniteSecurityUserUserPr();

        System.assertEquals(comAdobeGraniteSecurityUserUserPropertiesServiceProperties1.hashCode(), comAdobeGraniteSecurityUserUserPropertiesServiceProperties1.hashCode());
        System.assertEquals(comAdobeGraniteSecurityUserUserPropertiesServiceProperties2.hashCode(), comAdobeGraniteSecurityUserUserPropertiesServiceProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeGraniteSecurityUserUserPr comAdobeGraniteSecurityUserUserPropertiesServiceProperties1 = OASComAdobeGraniteSecurityUserUserPr.getExample();
        OASComAdobeGraniteSecurityUserUserPr comAdobeGraniteSecurityUserUserPropertiesServiceProperties2 = OASComAdobeGraniteSecurityUserUserPr.getExample();
        OASComAdobeGraniteSecurityUserUserPr comAdobeGraniteSecurityUserUserPropertiesServiceProperties3 = new OASComAdobeGraniteSecurityUserUserPr();
        OASComAdobeGraniteSecurityUserUserPr comAdobeGraniteSecurityUserUserPropertiesServiceProperties4 = new OASComAdobeGraniteSecurityUserUserPr();

        System.assert(comAdobeGraniteSecurityUserUserPropertiesServiceProperties1.equals(comAdobeGraniteSecurityUserUserPropertiesServiceProperties2));
        System.assert(comAdobeGraniteSecurityUserUserPropertiesServiceProperties3.equals(comAdobeGraniteSecurityUserUserPropertiesServiceProperties4));
        System.assertEquals(comAdobeGraniteSecurityUserUserPropertiesServiceProperties1.hashCode(), comAdobeGraniteSecurityUserUserPropertiesServiceProperties2.hashCode());
        System.assertEquals(comAdobeGraniteSecurityUserUserPropertiesServiceProperties3.hashCode(), comAdobeGraniteSecurityUserUserPropertiesServiceProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeGraniteSecurityUserUserPr comAdobeGraniteSecurityUserUserPropertiesServiceProperties = new OASComAdobeGraniteSecurityUserUserPr();
        Map<String, String> propertyMappings = comAdobeGraniteSecurityUserUserPropertiesServiceProperties.getPropertyMappings();
        System.assertEquals('adapterCondition', propertyMappings.get('adapter.condition'));
        System.assertEquals('graniteUserpropertiesNodetypes', propertyMappings.get('granite.userproperties.nodetypes'));
        System.assertEquals('graniteUserpropertiesResourcetypes', propertyMappings.get('granite.userproperties.resourcetypes'));
    }
}
