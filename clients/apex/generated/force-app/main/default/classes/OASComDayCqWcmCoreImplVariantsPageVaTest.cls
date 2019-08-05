@isTest
private class OASComDayCqWcmCoreImplVariantsPageVaTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqWcmCoreImplVariantsPageVa comDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties1 = OASComDayCqWcmCoreImplVariantsPageVa.getExample();
        OASComDayCqWcmCoreImplVariantsPageVa comDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties2 = comDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties1;
        OASComDayCqWcmCoreImplVariantsPageVa comDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties3 = new OASComDayCqWcmCoreImplVariantsPageVa();
        OASComDayCqWcmCoreImplVariantsPageVa comDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties4 = comDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties3;

        System.assert(comDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties1.equals(comDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties2));
        System.assert(comDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties2.equals(comDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties1));
        System.assert(comDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties1.equals(comDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties1));
        System.assert(comDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties3.equals(comDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties4));
        System.assert(comDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties4.equals(comDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties3));
        System.assert(comDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties3.equals(comDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqWcmCoreImplVariantsPageVa comDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties1 = OASComDayCqWcmCoreImplVariantsPageVa.getExample();
        OASComDayCqWcmCoreImplVariantsPageVa comDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties2 = OASComDayCqWcmCoreImplVariantsPageVa.getExample();
        OASComDayCqWcmCoreImplVariantsPageVa comDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties3 = new OASComDayCqWcmCoreImplVariantsPageVa();
        OASComDayCqWcmCoreImplVariantsPageVa comDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties4 = new OASComDayCqWcmCoreImplVariantsPageVa();

        System.assert(comDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties1.equals(comDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties2));
        System.assert(comDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties2.equals(comDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties1));
        System.assert(comDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties3.equals(comDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties4));
        System.assert(comDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties4.equals(comDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqWcmCoreImplVariantsPageVa comDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties1 = OASComDayCqWcmCoreImplVariantsPageVa.getExample();
        OASComDayCqWcmCoreImplVariantsPageVa comDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties2 = new OASComDayCqWcmCoreImplVariantsPageVa();

        System.assertEquals(false, comDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties1.equals('foo'));
        System.assertEquals(false, comDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqWcmCoreImplVariantsPageVa comDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties1 = OASComDayCqWcmCoreImplVariantsPageVa.getExample();
        OASComDayCqWcmCoreImplVariantsPageVa comDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties2 = new OASComDayCqWcmCoreImplVariantsPageVa();
        OASComDayCqWcmCoreImplVariantsPageVa comDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties3;

        System.assertEquals(false, comDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties1.equals(comDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties3));
        System.assertEquals(false, comDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties2.equals(comDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqWcmCoreImplVariantsPageVa comDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties1 = OASComDayCqWcmCoreImplVariantsPageVa.getExample();
        OASComDayCqWcmCoreImplVariantsPageVa comDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties2 = new OASComDayCqWcmCoreImplVariantsPageVa();

        System.assertEquals(comDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties1.hashCode(), comDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties1.hashCode());
        System.assertEquals(comDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties2.hashCode(), comDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqWcmCoreImplVariantsPageVa comDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties1 = OASComDayCqWcmCoreImplVariantsPageVa.getExample();
        OASComDayCqWcmCoreImplVariantsPageVa comDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties2 = OASComDayCqWcmCoreImplVariantsPageVa.getExample();
        OASComDayCqWcmCoreImplVariantsPageVa comDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties3 = new OASComDayCqWcmCoreImplVariantsPageVa();
        OASComDayCqWcmCoreImplVariantsPageVa comDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties4 = new OASComDayCqWcmCoreImplVariantsPageVa();

        System.assert(comDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties1.equals(comDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties2));
        System.assert(comDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties3.equals(comDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties4));
        System.assertEquals(comDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties1.hashCode(), comDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties2.hashCode());
        System.assertEquals(comDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties3.hashCode(), comDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComDayCqWcmCoreImplVariantsPageVa comDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties = new OASComDayCqWcmCoreImplVariantsPageVa();
        Map<String, String> propertyMappings = comDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties.getPropertyMappings();
        System.assertEquals('defaultExternalizerDomain', propertyMappings.get('default.externalizer.domain'));
    }
}
