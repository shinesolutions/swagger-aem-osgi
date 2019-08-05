@isTest
private class OASConfigNodePropertyBooleanTest {
    @isTest
    private static void equalsSameInstance() {
        OASConfigNodePropertyBoolean configNodePropertyBoolean1 = OASConfigNodePropertyBoolean.getExample();
        OASConfigNodePropertyBoolean configNodePropertyBoolean2 = configNodePropertyBoolean1;
        OASConfigNodePropertyBoolean configNodePropertyBoolean3 = new OASConfigNodePropertyBoolean();
        OASConfigNodePropertyBoolean configNodePropertyBoolean4 = configNodePropertyBoolean3;

        System.assert(configNodePropertyBoolean1.equals(configNodePropertyBoolean2));
        System.assert(configNodePropertyBoolean2.equals(configNodePropertyBoolean1));
        System.assert(configNodePropertyBoolean1.equals(configNodePropertyBoolean1));
        System.assert(configNodePropertyBoolean3.equals(configNodePropertyBoolean4));
        System.assert(configNodePropertyBoolean4.equals(configNodePropertyBoolean3));
        System.assert(configNodePropertyBoolean3.equals(configNodePropertyBoolean3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASConfigNodePropertyBoolean configNodePropertyBoolean1 = OASConfigNodePropertyBoolean.getExample();
        OASConfigNodePropertyBoolean configNodePropertyBoolean2 = OASConfigNodePropertyBoolean.getExample();
        OASConfigNodePropertyBoolean configNodePropertyBoolean3 = new OASConfigNodePropertyBoolean();
        OASConfigNodePropertyBoolean configNodePropertyBoolean4 = new OASConfigNodePropertyBoolean();

        System.assert(configNodePropertyBoolean1.equals(configNodePropertyBoolean2));
        System.assert(configNodePropertyBoolean2.equals(configNodePropertyBoolean1));
        System.assert(configNodePropertyBoolean3.equals(configNodePropertyBoolean4));
        System.assert(configNodePropertyBoolean4.equals(configNodePropertyBoolean3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASConfigNodePropertyBoolean configNodePropertyBoolean1 = OASConfigNodePropertyBoolean.getExample();
        OASConfigNodePropertyBoolean configNodePropertyBoolean2 = new OASConfigNodePropertyBoolean();

        System.assertEquals(false, configNodePropertyBoolean1.equals('foo'));
        System.assertEquals(false, configNodePropertyBoolean2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASConfigNodePropertyBoolean configNodePropertyBoolean1 = OASConfigNodePropertyBoolean.getExample();
        OASConfigNodePropertyBoolean configNodePropertyBoolean2 = new OASConfigNodePropertyBoolean();
        OASConfigNodePropertyBoolean configNodePropertyBoolean3;

        System.assertEquals(false, configNodePropertyBoolean1.equals(configNodePropertyBoolean3));
        System.assertEquals(false, configNodePropertyBoolean2.equals(configNodePropertyBoolean3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASConfigNodePropertyBoolean configNodePropertyBoolean1 = OASConfigNodePropertyBoolean.getExample();
        OASConfigNodePropertyBoolean configNodePropertyBoolean2 = new OASConfigNodePropertyBoolean();

        System.assertEquals(configNodePropertyBoolean1.hashCode(), configNodePropertyBoolean1.hashCode());
        System.assertEquals(configNodePropertyBoolean2.hashCode(), configNodePropertyBoolean2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASConfigNodePropertyBoolean configNodePropertyBoolean1 = OASConfigNodePropertyBoolean.getExample();
        OASConfigNodePropertyBoolean configNodePropertyBoolean2 = OASConfigNodePropertyBoolean.getExample();
        OASConfigNodePropertyBoolean configNodePropertyBoolean3 = new OASConfigNodePropertyBoolean();
        OASConfigNodePropertyBoolean configNodePropertyBoolean4 = new OASConfigNodePropertyBoolean();

        System.assert(configNodePropertyBoolean1.equals(configNodePropertyBoolean2));
        System.assert(configNodePropertyBoolean3.equals(configNodePropertyBoolean4));
        System.assertEquals(configNodePropertyBoolean1.hashCode(), configNodePropertyBoolean2.hashCode());
        System.assertEquals(configNodePropertyBoolean3.hashCode(), configNodePropertyBoolean4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASConfigNodePropertyBoolean configNodePropertyBoolean = new OASConfigNodePropertyBoolean();
        Map<String, String> propertyMappings = configNodePropertyBoolean.getPropertyMappings();
        System.assertEquals('isSet', propertyMappings.get('is_set'));
        System.assertEquals('r_type', propertyMappings.get('type'));
    }
}
