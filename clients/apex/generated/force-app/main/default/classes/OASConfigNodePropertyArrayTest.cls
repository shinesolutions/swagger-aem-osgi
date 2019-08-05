@isTest
private class OASConfigNodePropertyArrayTest {
    @isTest
    private static void equalsSameInstance() {
        OASConfigNodePropertyArray configNodePropertyArray1 = OASConfigNodePropertyArray.getExample();
        OASConfigNodePropertyArray configNodePropertyArray2 = configNodePropertyArray1;
        OASConfigNodePropertyArray configNodePropertyArray3 = new OASConfigNodePropertyArray();
        OASConfigNodePropertyArray configNodePropertyArray4 = configNodePropertyArray3;

        System.assert(configNodePropertyArray1.equals(configNodePropertyArray2));
        System.assert(configNodePropertyArray2.equals(configNodePropertyArray1));
        System.assert(configNodePropertyArray1.equals(configNodePropertyArray1));
        System.assert(configNodePropertyArray3.equals(configNodePropertyArray4));
        System.assert(configNodePropertyArray4.equals(configNodePropertyArray3));
        System.assert(configNodePropertyArray3.equals(configNodePropertyArray3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASConfigNodePropertyArray configNodePropertyArray1 = OASConfigNodePropertyArray.getExample();
        OASConfigNodePropertyArray configNodePropertyArray2 = OASConfigNodePropertyArray.getExample();
        OASConfigNodePropertyArray configNodePropertyArray3 = new OASConfigNodePropertyArray();
        OASConfigNodePropertyArray configNodePropertyArray4 = new OASConfigNodePropertyArray();

        System.assert(configNodePropertyArray1.equals(configNodePropertyArray2));
        System.assert(configNodePropertyArray2.equals(configNodePropertyArray1));
        System.assert(configNodePropertyArray3.equals(configNodePropertyArray4));
        System.assert(configNodePropertyArray4.equals(configNodePropertyArray3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASConfigNodePropertyArray configNodePropertyArray1 = OASConfigNodePropertyArray.getExample();
        OASConfigNodePropertyArray configNodePropertyArray2 = new OASConfigNodePropertyArray();

        System.assertEquals(false, configNodePropertyArray1.equals('foo'));
        System.assertEquals(false, configNodePropertyArray2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASConfigNodePropertyArray configNodePropertyArray1 = OASConfigNodePropertyArray.getExample();
        OASConfigNodePropertyArray configNodePropertyArray2 = new OASConfigNodePropertyArray();
        OASConfigNodePropertyArray configNodePropertyArray3;

        System.assertEquals(false, configNodePropertyArray1.equals(configNodePropertyArray3));
        System.assertEquals(false, configNodePropertyArray2.equals(configNodePropertyArray3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASConfigNodePropertyArray configNodePropertyArray1 = OASConfigNodePropertyArray.getExample();
        OASConfigNodePropertyArray configNodePropertyArray2 = new OASConfigNodePropertyArray();

        System.assertEquals(configNodePropertyArray1.hashCode(), configNodePropertyArray1.hashCode());
        System.assertEquals(configNodePropertyArray2.hashCode(), configNodePropertyArray2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASConfigNodePropertyArray configNodePropertyArray1 = OASConfigNodePropertyArray.getExample();
        OASConfigNodePropertyArray configNodePropertyArray2 = OASConfigNodePropertyArray.getExample();
        OASConfigNodePropertyArray configNodePropertyArray3 = new OASConfigNodePropertyArray();
        OASConfigNodePropertyArray configNodePropertyArray4 = new OASConfigNodePropertyArray();

        System.assert(configNodePropertyArray1.equals(configNodePropertyArray2));
        System.assert(configNodePropertyArray3.equals(configNodePropertyArray4));
        System.assertEquals(configNodePropertyArray1.hashCode(), configNodePropertyArray2.hashCode());
        System.assertEquals(configNodePropertyArray3.hashCode(), configNodePropertyArray4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASConfigNodePropertyArray configNodePropertyArray = new OASConfigNodePropertyArray();
        Map<String, String> propertyMappings = configNodePropertyArray.getPropertyMappings();
        System.assertEquals('isSet', propertyMappings.get('is_set'));
        System.assertEquals('r_type', propertyMappings.get('type'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASConfigNodePropertyArray configNodePropertyArray = new OASConfigNodePropertyArray();
        System.assertEquals(new List<String>(), configNodePropertyArray.values);
        System.assertEquals(null, configNodePropertyArray.name);
        System.assertEquals(null, configNodePropertyArray.optional);
        System.assertEquals(null, configNodePropertyArray.isSet);
        System.assertEquals(null, configNodePropertyArray.r_type);
        System.assertEquals(null, configNodePropertyArray.description);
    }
}
