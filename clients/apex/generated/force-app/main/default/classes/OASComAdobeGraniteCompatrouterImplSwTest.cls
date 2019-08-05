@isTest
private class OASComAdobeGraniteCompatrouterImplSwTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeGraniteCompatrouterImplSw comAdobeGraniteCompatrouterImplSwitchMappingConfigProperties1 = OASComAdobeGraniteCompatrouterImplSw.getExample();
        OASComAdobeGraniteCompatrouterImplSw comAdobeGraniteCompatrouterImplSwitchMappingConfigProperties2 = comAdobeGraniteCompatrouterImplSwitchMappingConfigProperties1;
        OASComAdobeGraniteCompatrouterImplSw comAdobeGraniteCompatrouterImplSwitchMappingConfigProperties3 = new OASComAdobeGraniteCompatrouterImplSw();
        OASComAdobeGraniteCompatrouterImplSw comAdobeGraniteCompatrouterImplSwitchMappingConfigProperties4 = comAdobeGraniteCompatrouterImplSwitchMappingConfigProperties3;

        System.assert(comAdobeGraniteCompatrouterImplSwitchMappingConfigProperties1.equals(comAdobeGraniteCompatrouterImplSwitchMappingConfigProperties2));
        System.assert(comAdobeGraniteCompatrouterImplSwitchMappingConfigProperties2.equals(comAdobeGraniteCompatrouterImplSwitchMappingConfigProperties1));
        System.assert(comAdobeGraniteCompatrouterImplSwitchMappingConfigProperties1.equals(comAdobeGraniteCompatrouterImplSwitchMappingConfigProperties1));
        System.assert(comAdobeGraniteCompatrouterImplSwitchMappingConfigProperties3.equals(comAdobeGraniteCompatrouterImplSwitchMappingConfigProperties4));
        System.assert(comAdobeGraniteCompatrouterImplSwitchMappingConfigProperties4.equals(comAdobeGraniteCompatrouterImplSwitchMappingConfigProperties3));
        System.assert(comAdobeGraniteCompatrouterImplSwitchMappingConfigProperties3.equals(comAdobeGraniteCompatrouterImplSwitchMappingConfigProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeGraniteCompatrouterImplSw comAdobeGraniteCompatrouterImplSwitchMappingConfigProperties1 = OASComAdobeGraniteCompatrouterImplSw.getExample();
        OASComAdobeGraniteCompatrouterImplSw comAdobeGraniteCompatrouterImplSwitchMappingConfigProperties2 = OASComAdobeGraniteCompatrouterImplSw.getExample();
        OASComAdobeGraniteCompatrouterImplSw comAdobeGraniteCompatrouterImplSwitchMappingConfigProperties3 = new OASComAdobeGraniteCompatrouterImplSw();
        OASComAdobeGraniteCompatrouterImplSw comAdobeGraniteCompatrouterImplSwitchMappingConfigProperties4 = new OASComAdobeGraniteCompatrouterImplSw();

        System.assert(comAdobeGraniteCompatrouterImplSwitchMappingConfigProperties1.equals(comAdobeGraniteCompatrouterImplSwitchMappingConfigProperties2));
        System.assert(comAdobeGraniteCompatrouterImplSwitchMappingConfigProperties2.equals(comAdobeGraniteCompatrouterImplSwitchMappingConfigProperties1));
        System.assert(comAdobeGraniteCompatrouterImplSwitchMappingConfigProperties3.equals(comAdobeGraniteCompatrouterImplSwitchMappingConfigProperties4));
        System.assert(comAdobeGraniteCompatrouterImplSwitchMappingConfigProperties4.equals(comAdobeGraniteCompatrouterImplSwitchMappingConfigProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeGraniteCompatrouterImplSw comAdobeGraniteCompatrouterImplSwitchMappingConfigProperties1 = OASComAdobeGraniteCompatrouterImplSw.getExample();
        OASComAdobeGraniteCompatrouterImplSw comAdobeGraniteCompatrouterImplSwitchMappingConfigProperties2 = new OASComAdobeGraniteCompatrouterImplSw();

        System.assertEquals(false, comAdobeGraniteCompatrouterImplSwitchMappingConfigProperties1.equals('foo'));
        System.assertEquals(false, comAdobeGraniteCompatrouterImplSwitchMappingConfigProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeGraniteCompatrouterImplSw comAdobeGraniteCompatrouterImplSwitchMappingConfigProperties1 = OASComAdobeGraniteCompatrouterImplSw.getExample();
        OASComAdobeGraniteCompatrouterImplSw comAdobeGraniteCompatrouterImplSwitchMappingConfigProperties2 = new OASComAdobeGraniteCompatrouterImplSw();
        OASComAdobeGraniteCompatrouterImplSw comAdobeGraniteCompatrouterImplSwitchMappingConfigProperties3;

        System.assertEquals(false, comAdobeGraniteCompatrouterImplSwitchMappingConfigProperties1.equals(comAdobeGraniteCompatrouterImplSwitchMappingConfigProperties3));
        System.assertEquals(false, comAdobeGraniteCompatrouterImplSwitchMappingConfigProperties2.equals(comAdobeGraniteCompatrouterImplSwitchMappingConfigProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeGraniteCompatrouterImplSw comAdobeGraniteCompatrouterImplSwitchMappingConfigProperties1 = OASComAdobeGraniteCompatrouterImplSw.getExample();
        OASComAdobeGraniteCompatrouterImplSw comAdobeGraniteCompatrouterImplSwitchMappingConfigProperties2 = new OASComAdobeGraniteCompatrouterImplSw();

        System.assertEquals(comAdobeGraniteCompatrouterImplSwitchMappingConfigProperties1.hashCode(), comAdobeGraniteCompatrouterImplSwitchMappingConfigProperties1.hashCode());
        System.assertEquals(comAdobeGraniteCompatrouterImplSwitchMappingConfigProperties2.hashCode(), comAdobeGraniteCompatrouterImplSwitchMappingConfigProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeGraniteCompatrouterImplSw comAdobeGraniteCompatrouterImplSwitchMappingConfigProperties1 = OASComAdobeGraniteCompatrouterImplSw.getExample();
        OASComAdobeGraniteCompatrouterImplSw comAdobeGraniteCompatrouterImplSwitchMappingConfigProperties2 = OASComAdobeGraniteCompatrouterImplSw.getExample();
        OASComAdobeGraniteCompatrouterImplSw comAdobeGraniteCompatrouterImplSwitchMappingConfigProperties3 = new OASComAdobeGraniteCompatrouterImplSw();
        OASComAdobeGraniteCompatrouterImplSw comAdobeGraniteCompatrouterImplSwitchMappingConfigProperties4 = new OASComAdobeGraniteCompatrouterImplSw();

        System.assert(comAdobeGraniteCompatrouterImplSwitchMappingConfigProperties1.equals(comAdobeGraniteCompatrouterImplSwitchMappingConfigProperties2));
        System.assert(comAdobeGraniteCompatrouterImplSwitchMappingConfigProperties3.equals(comAdobeGraniteCompatrouterImplSwitchMappingConfigProperties4));
        System.assertEquals(comAdobeGraniteCompatrouterImplSwitchMappingConfigProperties1.hashCode(), comAdobeGraniteCompatrouterImplSwitchMappingConfigProperties2.hashCode());
        System.assertEquals(comAdobeGraniteCompatrouterImplSwitchMappingConfigProperties3.hashCode(), comAdobeGraniteCompatrouterImplSwitchMappingConfigProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeGraniteCompatrouterImplSw comAdobeGraniteCompatrouterImplSwitchMappingConfigProperties = new OASComAdobeGraniteCompatrouterImplSw();
        Map<String, String> propertyMappings = comAdobeGraniteCompatrouterImplSwitchMappingConfigProperties.getPropertyMappings();
        System.assertEquals('r_group', propertyMappings.get('group'));
    }
}
