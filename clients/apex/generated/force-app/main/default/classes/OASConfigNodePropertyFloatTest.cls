@isTest
private class OASConfigNodePropertyFloatTest {
    @isTest
    private static void equalsSameInstance() {
        OASConfigNodePropertyFloat configNodePropertyFloat1 = OASConfigNodePropertyFloat.getExample();
        OASConfigNodePropertyFloat configNodePropertyFloat2 = configNodePropertyFloat1;
        OASConfigNodePropertyFloat configNodePropertyFloat3 = new OASConfigNodePropertyFloat();
        OASConfigNodePropertyFloat configNodePropertyFloat4 = configNodePropertyFloat3;

        System.assert(configNodePropertyFloat1.equals(configNodePropertyFloat2));
        System.assert(configNodePropertyFloat2.equals(configNodePropertyFloat1));
        System.assert(configNodePropertyFloat1.equals(configNodePropertyFloat1));
        System.assert(configNodePropertyFloat3.equals(configNodePropertyFloat4));
        System.assert(configNodePropertyFloat4.equals(configNodePropertyFloat3));
        System.assert(configNodePropertyFloat3.equals(configNodePropertyFloat3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASConfigNodePropertyFloat configNodePropertyFloat1 = OASConfigNodePropertyFloat.getExample();
        OASConfigNodePropertyFloat configNodePropertyFloat2 = OASConfigNodePropertyFloat.getExample();
        OASConfigNodePropertyFloat configNodePropertyFloat3 = new OASConfigNodePropertyFloat();
        OASConfigNodePropertyFloat configNodePropertyFloat4 = new OASConfigNodePropertyFloat();

        System.assert(configNodePropertyFloat1.equals(configNodePropertyFloat2));
        System.assert(configNodePropertyFloat2.equals(configNodePropertyFloat1));
        System.assert(configNodePropertyFloat3.equals(configNodePropertyFloat4));
        System.assert(configNodePropertyFloat4.equals(configNodePropertyFloat3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASConfigNodePropertyFloat configNodePropertyFloat1 = OASConfigNodePropertyFloat.getExample();
        OASConfigNodePropertyFloat configNodePropertyFloat2 = new OASConfigNodePropertyFloat();

        System.assertEquals(false, configNodePropertyFloat1.equals('foo'));
        System.assertEquals(false, configNodePropertyFloat2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASConfigNodePropertyFloat configNodePropertyFloat1 = OASConfigNodePropertyFloat.getExample();
        OASConfigNodePropertyFloat configNodePropertyFloat2 = new OASConfigNodePropertyFloat();
        OASConfigNodePropertyFloat configNodePropertyFloat3;

        System.assertEquals(false, configNodePropertyFloat1.equals(configNodePropertyFloat3));
        System.assertEquals(false, configNodePropertyFloat2.equals(configNodePropertyFloat3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASConfigNodePropertyFloat configNodePropertyFloat1 = OASConfigNodePropertyFloat.getExample();
        OASConfigNodePropertyFloat configNodePropertyFloat2 = new OASConfigNodePropertyFloat();

        System.assertEquals(configNodePropertyFloat1.hashCode(), configNodePropertyFloat1.hashCode());
        System.assertEquals(configNodePropertyFloat2.hashCode(), configNodePropertyFloat2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASConfigNodePropertyFloat configNodePropertyFloat1 = OASConfigNodePropertyFloat.getExample();
        OASConfigNodePropertyFloat configNodePropertyFloat2 = OASConfigNodePropertyFloat.getExample();
        OASConfigNodePropertyFloat configNodePropertyFloat3 = new OASConfigNodePropertyFloat();
        OASConfigNodePropertyFloat configNodePropertyFloat4 = new OASConfigNodePropertyFloat();

        System.assert(configNodePropertyFloat1.equals(configNodePropertyFloat2));
        System.assert(configNodePropertyFloat3.equals(configNodePropertyFloat4));
        System.assertEquals(configNodePropertyFloat1.hashCode(), configNodePropertyFloat2.hashCode());
        System.assertEquals(configNodePropertyFloat3.hashCode(), configNodePropertyFloat4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASConfigNodePropertyFloat configNodePropertyFloat = new OASConfigNodePropertyFloat();
        Map<String, String> propertyMappings = configNodePropertyFloat.getPropertyMappings();
        System.assertEquals('isSet', propertyMappings.get('is_set'));
        System.assertEquals('r_type', propertyMappings.get('type'));
    }
}
