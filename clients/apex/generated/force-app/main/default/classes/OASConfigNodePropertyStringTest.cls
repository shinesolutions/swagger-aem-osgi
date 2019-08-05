@isTest
private class OASConfigNodePropertyStringTest {
    @isTest
    private static void equalsSameInstance() {
        OASConfigNodePropertyString configNodePropertyString1 = OASConfigNodePropertyString.getExample();
        OASConfigNodePropertyString configNodePropertyString2 = configNodePropertyString1;
        OASConfigNodePropertyString configNodePropertyString3 = new OASConfigNodePropertyString();
        OASConfigNodePropertyString configNodePropertyString4 = configNodePropertyString3;

        System.assert(configNodePropertyString1.equals(configNodePropertyString2));
        System.assert(configNodePropertyString2.equals(configNodePropertyString1));
        System.assert(configNodePropertyString1.equals(configNodePropertyString1));
        System.assert(configNodePropertyString3.equals(configNodePropertyString4));
        System.assert(configNodePropertyString4.equals(configNodePropertyString3));
        System.assert(configNodePropertyString3.equals(configNodePropertyString3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASConfigNodePropertyString configNodePropertyString1 = OASConfigNodePropertyString.getExample();
        OASConfigNodePropertyString configNodePropertyString2 = OASConfigNodePropertyString.getExample();
        OASConfigNodePropertyString configNodePropertyString3 = new OASConfigNodePropertyString();
        OASConfigNodePropertyString configNodePropertyString4 = new OASConfigNodePropertyString();

        System.assert(configNodePropertyString1.equals(configNodePropertyString2));
        System.assert(configNodePropertyString2.equals(configNodePropertyString1));
        System.assert(configNodePropertyString3.equals(configNodePropertyString4));
        System.assert(configNodePropertyString4.equals(configNodePropertyString3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASConfigNodePropertyString configNodePropertyString1 = OASConfigNodePropertyString.getExample();
        OASConfigNodePropertyString configNodePropertyString2 = new OASConfigNodePropertyString();

        System.assertEquals(false, configNodePropertyString1.equals('foo'));
        System.assertEquals(false, configNodePropertyString2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASConfigNodePropertyString configNodePropertyString1 = OASConfigNodePropertyString.getExample();
        OASConfigNodePropertyString configNodePropertyString2 = new OASConfigNodePropertyString();
        OASConfigNodePropertyString configNodePropertyString3;

        System.assertEquals(false, configNodePropertyString1.equals(configNodePropertyString3));
        System.assertEquals(false, configNodePropertyString2.equals(configNodePropertyString3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASConfigNodePropertyString configNodePropertyString1 = OASConfigNodePropertyString.getExample();
        OASConfigNodePropertyString configNodePropertyString2 = new OASConfigNodePropertyString();

        System.assertEquals(configNodePropertyString1.hashCode(), configNodePropertyString1.hashCode());
        System.assertEquals(configNodePropertyString2.hashCode(), configNodePropertyString2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASConfigNodePropertyString configNodePropertyString1 = OASConfigNodePropertyString.getExample();
        OASConfigNodePropertyString configNodePropertyString2 = OASConfigNodePropertyString.getExample();
        OASConfigNodePropertyString configNodePropertyString3 = new OASConfigNodePropertyString();
        OASConfigNodePropertyString configNodePropertyString4 = new OASConfigNodePropertyString();

        System.assert(configNodePropertyString1.equals(configNodePropertyString2));
        System.assert(configNodePropertyString3.equals(configNodePropertyString4));
        System.assertEquals(configNodePropertyString1.hashCode(), configNodePropertyString2.hashCode());
        System.assertEquals(configNodePropertyString3.hashCode(), configNodePropertyString4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASConfigNodePropertyString configNodePropertyString = new OASConfigNodePropertyString();
        Map<String, String> propertyMappings = configNodePropertyString.getPropertyMappings();
        System.assertEquals('isSet', propertyMappings.get('is_set'));
        System.assertEquals('r_type', propertyMappings.get('type'));
    }
}
