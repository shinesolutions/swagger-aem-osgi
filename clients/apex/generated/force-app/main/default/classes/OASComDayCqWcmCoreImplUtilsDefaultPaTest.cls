@isTest
private class OASComDayCqWcmCoreImplUtilsDefaultPaTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqWcmCoreImplUtilsDefaultPa comDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties1 = OASComDayCqWcmCoreImplUtilsDefaultPa.getExample();
        OASComDayCqWcmCoreImplUtilsDefaultPa comDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties2 = comDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties1;
        OASComDayCqWcmCoreImplUtilsDefaultPa comDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties3 = new OASComDayCqWcmCoreImplUtilsDefaultPa();
        OASComDayCqWcmCoreImplUtilsDefaultPa comDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties4 = comDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties3;

        System.assert(comDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties1.equals(comDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties2));
        System.assert(comDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties2.equals(comDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties1));
        System.assert(comDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties1.equals(comDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties1));
        System.assert(comDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties3.equals(comDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties4));
        System.assert(comDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties4.equals(comDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties3));
        System.assert(comDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties3.equals(comDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqWcmCoreImplUtilsDefaultPa comDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties1 = OASComDayCqWcmCoreImplUtilsDefaultPa.getExample();
        OASComDayCqWcmCoreImplUtilsDefaultPa comDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties2 = OASComDayCqWcmCoreImplUtilsDefaultPa.getExample();
        OASComDayCqWcmCoreImplUtilsDefaultPa comDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties3 = new OASComDayCqWcmCoreImplUtilsDefaultPa();
        OASComDayCqWcmCoreImplUtilsDefaultPa comDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties4 = new OASComDayCqWcmCoreImplUtilsDefaultPa();

        System.assert(comDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties1.equals(comDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties2));
        System.assert(comDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties2.equals(comDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties1));
        System.assert(comDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties3.equals(comDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties4));
        System.assert(comDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties4.equals(comDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqWcmCoreImplUtilsDefaultPa comDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties1 = OASComDayCqWcmCoreImplUtilsDefaultPa.getExample();
        OASComDayCqWcmCoreImplUtilsDefaultPa comDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties2 = new OASComDayCqWcmCoreImplUtilsDefaultPa();

        System.assertEquals(false, comDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties1.equals('foo'));
        System.assertEquals(false, comDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqWcmCoreImplUtilsDefaultPa comDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties1 = OASComDayCqWcmCoreImplUtilsDefaultPa.getExample();
        OASComDayCqWcmCoreImplUtilsDefaultPa comDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties2 = new OASComDayCqWcmCoreImplUtilsDefaultPa();
        OASComDayCqWcmCoreImplUtilsDefaultPa comDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties3;

        System.assertEquals(false, comDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties1.equals(comDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties3));
        System.assertEquals(false, comDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties2.equals(comDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqWcmCoreImplUtilsDefaultPa comDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties1 = OASComDayCqWcmCoreImplUtilsDefaultPa.getExample();
        OASComDayCqWcmCoreImplUtilsDefaultPa comDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties2 = new OASComDayCqWcmCoreImplUtilsDefaultPa();

        System.assertEquals(comDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties1.hashCode(), comDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties1.hashCode());
        System.assertEquals(comDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties2.hashCode(), comDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqWcmCoreImplUtilsDefaultPa comDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties1 = OASComDayCqWcmCoreImplUtilsDefaultPa.getExample();
        OASComDayCqWcmCoreImplUtilsDefaultPa comDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties2 = OASComDayCqWcmCoreImplUtilsDefaultPa.getExample();
        OASComDayCqWcmCoreImplUtilsDefaultPa comDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties3 = new OASComDayCqWcmCoreImplUtilsDefaultPa();
        OASComDayCqWcmCoreImplUtilsDefaultPa comDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties4 = new OASComDayCqWcmCoreImplUtilsDefaultPa();

        System.assert(comDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties1.equals(comDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties2));
        System.assert(comDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties3.equals(comDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties4));
        System.assertEquals(comDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties1.hashCode(), comDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties2.hashCode());
        System.assertEquals(comDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties3.hashCode(), comDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties4.hashCode());
    }
}
