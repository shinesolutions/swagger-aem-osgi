@isTest
private class OASConfigNodePropertyDropDownTest {
    @isTest
    private static void equalsSameInstance() {
        OASConfigNodePropertyDropDown configNodePropertyDropDown1 = OASConfigNodePropertyDropDown.getExample();
        OASConfigNodePropertyDropDown configNodePropertyDropDown2 = configNodePropertyDropDown1;
        OASConfigNodePropertyDropDown configNodePropertyDropDown3 = new OASConfigNodePropertyDropDown();
        OASConfigNodePropertyDropDown configNodePropertyDropDown4 = configNodePropertyDropDown3;

        System.assert(configNodePropertyDropDown1.equals(configNodePropertyDropDown2));
        System.assert(configNodePropertyDropDown2.equals(configNodePropertyDropDown1));
        System.assert(configNodePropertyDropDown1.equals(configNodePropertyDropDown1));
        System.assert(configNodePropertyDropDown3.equals(configNodePropertyDropDown4));
        System.assert(configNodePropertyDropDown4.equals(configNodePropertyDropDown3));
        System.assert(configNodePropertyDropDown3.equals(configNodePropertyDropDown3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASConfigNodePropertyDropDown configNodePropertyDropDown1 = OASConfigNodePropertyDropDown.getExample();
        OASConfigNodePropertyDropDown configNodePropertyDropDown2 = OASConfigNodePropertyDropDown.getExample();
        OASConfigNodePropertyDropDown configNodePropertyDropDown3 = new OASConfigNodePropertyDropDown();
        OASConfigNodePropertyDropDown configNodePropertyDropDown4 = new OASConfigNodePropertyDropDown();

        System.assert(configNodePropertyDropDown1.equals(configNodePropertyDropDown2));
        System.assert(configNodePropertyDropDown2.equals(configNodePropertyDropDown1));
        System.assert(configNodePropertyDropDown3.equals(configNodePropertyDropDown4));
        System.assert(configNodePropertyDropDown4.equals(configNodePropertyDropDown3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASConfigNodePropertyDropDown configNodePropertyDropDown1 = OASConfigNodePropertyDropDown.getExample();
        OASConfigNodePropertyDropDown configNodePropertyDropDown2 = new OASConfigNodePropertyDropDown();

        System.assertEquals(false, configNodePropertyDropDown1.equals('foo'));
        System.assertEquals(false, configNodePropertyDropDown2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASConfigNodePropertyDropDown configNodePropertyDropDown1 = OASConfigNodePropertyDropDown.getExample();
        OASConfigNodePropertyDropDown configNodePropertyDropDown2 = new OASConfigNodePropertyDropDown();
        OASConfigNodePropertyDropDown configNodePropertyDropDown3;

        System.assertEquals(false, configNodePropertyDropDown1.equals(configNodePropertyDropDown3));
        System.assertEquals(false, configNodePropertyDropDown2.equals(configNodePropertyDropDown3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASConfigNodePropertyDropDown configNodePropertyDropDown1 = OASConfigNodePropertyDropDown.getExample();
        OASConfigNodePropertyDropDown configNodePropertyDropDown2 = new OASConfigNodePropertyDropDown();

        System.assertEquals(configNodePropertyDropDown1.hashCode(), configNodePropertyDropDown1.hashCode());
        System.assertEquals(configNodePropertyDropDown2.hashCode(), configNodePropertyDropDown2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASConfigNodePropertyDropDown configNodePropertyDropDown1 = OASConfigNodePropertyDropDown.getExample();
        OASConfigNodePropertyDropDown configNodePropertyDropDown2 = OASConfigNodePropertyDropDown.getExample();
        OASConfigNodePropertyDropDown configNodePropertyDropDown3 = new OASConfigNodePropertyDropDown();
        OASConfigNodePropertyDropDown configNodePropertyDropDown4 = new OASConfigNodePropertyDropDown();

        System.assert(configNodePropertyDropDown1.equals(configNodePropertyDropDown2));
        System.assert(configNodePropertyDropDown3.equals(configNodePropertyDropDown4));
        System.assertEquals(configNodePropertyDropDown1.hashCode(), configNodePropertyDropDown2.hashCode());
        System.assertEquals(configNodePropertyDropDown3.hashCode(), configNodePropertyDropDown4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASConfigNodePropertyDropDown configNodePropertyDropDown = new OASConfigNodePropertyDropDown();
        Map<String, String> propertyMappings = configNodePropertyDropDown.getPropertyMappings();
        System.assertEquals('isSet', propertyMappings.get('is_set'));
        System.assertEquals('r_type', propertyMappings.get('type'));
    }
}
