@isTest
private class OASConfigNodePropertyDropDownTypeTest {
    @isTest
    private static void equalsSameInstance() {
        OASConfigNodePropertyDropDownType configNodePropertyDropDownType1 = OASConfigNodePropertyDropDownType.getExample();
        OASConfigNodePropertyDropDownType configNodePropertyDropDownType2 = configNodePropertyDropDownType1;
        OASConfigNodePropertyDropDownType configNodePropertyDropDownType3 = new OASConfigNodePropertyDropDownType();
        OASConfigNodePropertyDropDownType configNodePropertyDropDownType4 = configNodePropertyDropDownType3;

        System.assert(configNodePropertyDropDownType1.equals(configNodePropertyDropDownType2));
        System.assert(configNodePropertyDropDownType2.equals(configNodePropertyDropDownType1));
        System.assert(configNodePropertyDropDownType1.equals(configNodePropertyDropDownType1));
        System.assert(configNodePropertyDropDownType3.equals(configNodePropertyDropDownType4));
        System.assert(configNodePropertyDropDownType4.equals(configNodePropertyDropDownType3));
        System.assert(configNodePropertyDropDownType3.equals(configNodePropertyDropDownType3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASConfigNodePropertyDropDownType configNodePropertyDropDownType1 = OASConfigNodePropertyDropDownType.getExample();
        OASConfigNodePropertyDropDownType configNodePropertyDropDownType2 = OASConfigNodePropertyDropDownType.getExample();
        OASConfigNodePropertyDropDownType configNodePropertyDropDownType3 = new OASConfigNodePropertyDropDownType();
        OASConfigNodePropertyDropDownType configNodePropertyDropDownType4 = new OASConfigNodePropertyDropDownType();

        System.assert(configNodePropertyDropDownType1.equals(configNodePropertyDropDownType2));
        System.assert(configNodePropertyDropDownType2.equals(configNodePropertyDropDownType1));
        System.assert(configNodePropertyDropDownType3.equals(configNodePropertyDropDownType4));
        System.assert(configNodePropertyDropDownType4.equals(configNodePropertyDropDownType3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASConfigNodePropertyDropDownType configNodePropertyDropDownType1 = OASConfigNodePropertyDropDownType.getExample();
        OASConfigNodePropertyDropDownType configNodePropertyDropDownType2 = new OASConfigNodePropertyDropDownType();

        System.assertEquals(false, configNodePropertyDropDownType1.equals('foo'));
        System.assertEquals(false, configNodePropertyDropDownType2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASConfigNodePropertyDropDownType configNodePropertyDropDownType1 = OASConfigNodePropertyDropDownType.getExample();
        OASConfigNodePropertyDropDownType configNodePropertyDropDownType2 = new OASConfigNodePropertyDropDownType();
        OASConfigNodePropertyDropDownType configNodePropertyDropDownType3;

        System.assertEquals(false, configNodePropertyDropDownType1.equals(configNodePropertyDropDownType3));
        System.assertEquals(false, configNodePropertyDropDownType2.equals(configNodePropertyDropDownType3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASConfigNodePropertyDropDownType configNodePropertyDropDownType1 = OASConfigNodePropertyDropDownType.getExample();
        OASConfigNodePropertyDropDownType configNodePropertyDropDownType2 = new OASConfigNodePropertyDropDownType();

        System.assertEquals(configNodePropertyDropDownType1.hashCode(), configNodePropertyDropDownType1.hashCode());
        System.assertEquals(configNodePropertyDropDownType2.hashCode(), configNodePropertyDropDownType2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASConfigNodePropertyDropDownType configNodePropertyDropDownType1 = OASConfigNodePropertyDropDownType.getExample();
        OASConfigNodePropertyDropDownType configNodePropertyDropDownType2 = OASConfigNodePropertyDropDownType.getExample();
        OASConfigNodePropertyDropDownType configNodePropertyDropDownType3 = new OASConfigNodePropertyDropDownType();
        OASConfigNodePropertyDropDownType configNodePropertyDropDownType4 = new OASConfigNodePropertyDropDownType();

        System.assert(configNodePropertyDropDownType1.equals(configNodePropertyDropDownType2));
        System.assert(configNodePropertyDropDownType3.equals(configNodePropertyDropDownType4));
        System.assertEquals(configNodePropertyDropDownType1.hashCode(), configNodePropertyDropDownType2.hashCode());
        System.assertEquals(configNodePropertyDropDownType3.hashCode(), configNodePropertyDropDownType4.hashCode());
    }
}
