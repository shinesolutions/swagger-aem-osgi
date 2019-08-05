@isTest
private class OASConfigNodePropertyIntegerTest {
    @isTest
    private static void equalsSameInstance() {
        OASConfigNodePropertyInteger configNodePropertyInteger1 = OASConfigNodePropertyInteger.getExample();
        OASConfigNodePropertyInteger configNodePropertyInteger2 = configNodePropertyInteger1;
        OASConfigNodePropertyInteger configNodePropertyInteger3 = new OASConfigNodePropertyInteger();
        OASConfigNodePropertyInteger configNodePropertyInteger4 = configNodePropertyInteger3;

        System.assert(configNodePropertyInteger1.equals(configNodePropertyInteger2));
        System.assert(configNodePropertyInteger2.equals(configNodePropertyInteger1));
        System.assert(configNodePropertyInteger1.equals(configNodePropertyInteger1));
        System.assert(configNodePropertyInteger3.equals(configNodePropertyInteger4));
        System.assert(configNodePropertyInteger4.equals(configNodePropertyInteger3));
        System.assert(configNodePropertyInteger3.equals(configNodePropertyInteger3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASConfigNodePropertyInteger configNodePropertyInteger1 = OASConfigNodePropertyInteger.getExample();
        OASConfigNodePropertyInteger configNodePropertyInteger2 = OASConfigNodePropertyInteger.getExample();
        OASConfigNodePropertyInteger configNodePropertyInteger3 = new OASConfigNodePropertyInteger();
        OASConfigNodePropertyInteger configNodePropertyInteger4 = new OASConfigNodePropertyInteger();

        System.assert(configNodePropertyInteger1.equals(configNodePropertyInteger2));
        System.assert(configNodePropertyInteger2.equals(configNodePropertyInteger1));
        System.assert(configNodePropertyInteger3.equals(configNodePropertyInteger4));
        System.assert(configNodePropertyInteger4.equals(configNodePropertyInteger3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASConfigNodePropertyInteger configNodePropertyInteger1 = OASConfigNodePropertyInteger.getExample();
        OASConfigNodePropertyInteger configNodePropertyInteger2 = new OASConfigNodePropertyInteger();

        System.assertEquals(false, configNodePropertyInteger1.equals('foo'));
        System.assertEquals(false, configNodePropertyInteger2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASConfigNodePropertyInteger configNodePropertyInteger1 = OASConfigNodePropertyInteger.getExample();
        OASConfigNodePropertyInteger configNodePropertyInteger2 = new OASConfigNodePropertyInteger();
        OASConfigNodePropertyInteger configNodePropertyInteger3;

        System.assertEquals(false, configNodePropertyInteger1.equals(configNodePropertyInteger3));
        System.assertEquals(false, configNodePropertyInteger2.equals(configNodePropertyInteger3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASConfigNodePropertyInteger configNodePropertyInteger1 = OASConfigNodePropertyInteger.getExample();
        OASConfigNodePropertyInteger configNodePropertyInteger2 = new OASConfigNodePropertyInteger();

        System.assertEquals(configNodePropertyInteger1.hashCode(), configNodePropertyInteger1.hashCode());
        System.assertEquals(configNodePropertyInteger2.hashCode(), configNodePropertyInteger2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASConfigNodePropertyInteger configNodePropertyInteger1 = OASConfigNodePropertyInteger.getExample();
        OASConfigNodePropertyInteger configNodePropertyInteger2 = OASConfigNodePropertyInteger.getExample();
        OASConfigNodePropertyInteger configNodePropertyInteger3 = new OASConfigNodePropertyInteger();
        OASConfigNodePropertyInteger configNodePropertyInteger4 = new OASConfigNodePropertyInteger();

        System.assert(configNodePropertyInteger1.equals(configNodePropertyInteger2));
        System.assert(configNodePropertyInteger3.equals(configNodePropertyInteger4));
        System.assertEquals(configNodePropertyInteger1.hashCode(), configNodePropertyInteger2.hashCode());
        System.assertEquals(configNodePropertyInteger3.hashCode(), configNodePropertyInteger4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASConfigNodePropertyInteger configNodePropertyInteger = new OASConfigNodePropertyInteger();
        Map<String, String> propertyMappings = configNodePropertyInteger.getPropertyMappings();
        System.assertEquals('isSet', propertyMappings.get('is_set'));
        System.assertEquals('r_type', propertyMappings.get('type'));
    }
}
