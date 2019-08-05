@isTest
private class OASComDayCqWcmCoreImplEventTemplatePTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqWcmCoreImplEventTemplateP comDayCqWcmCoreImplEventTemplatePostProcessorProperties1 = OASComDayCqWcmCoreImplEventTemplateP.getExample();
        OASComDayCqWcmCoreImplEventTemplateP comDayCqWcmCoreImplEventTemplatePostProcessorProperties2 = comDayCqWcmCoreImplEventTemplatePostProcessorProperties1;
        OASComDayCqWcmCoreImplEventTemplateP comDayCqWcmCoreImplEventTemplatePostProcessorProperties3 = new OASComDayCqWcmCoreImplEventTemplateP();
        OASComDayCqWcmCoreImplEventTemplateP comDayCqWcmCoreImplEventTemplatePostProcessorProperties4 = comDayCqWcmCoreImplEventTemplatePostProcessorProperties3;

        System.assert(comDayCqWcmCoreImplEventTemplatePostProcessorProperties1.equals(comDayCqWcmCoreImplEventTemplatePostProcessorProperties2));
        System.assert(comDayCqWcmCoreImplEventTemplatePostProcessorProperties2.equals(comDayCqWcmCoreImplEventTemplatePostProcessorProperties1));
        System.assert(comDayCqWcmCoreImplEventTemplatePostProcessorProperties1.equals(comDayCqWcmCoreImplEventTemplatePostProcessorProperties1));
        System.assert(comDayCqWcmCoreImplEventTemplatePostProcessorProperties3.equals(comDayCqWcmCoreImplEventTemplatePostProcessorProperties4));
        System.assert(comDayCqWcmCoreImplEventTemplatePostProcessorProperties4.equals(comDayCqWcmCoreImplEventTemplatePostProcessorProperties3));
        System.assert(comDayCqWcmCoreImplEventTemplatePostProcessorProperties3.equals(comDayCqWcmCoreImplEventTemplatePostProcessorProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqWcmCoreImplEventTemplateP comDayCqWcmCoreImplEventTemplatePostProcessorProperties1 = OASComDayCqWcmCoreImplEventTemplateP.getExample();
        OASComDayCqWcmCoreImplEventTemplateP comDayCqWcmCoreImplEventTemplatePostProcessorProperties2 = OASComDayCqWcmCoreImplEventTemplateP.getExample();
        OASComDayCqWcmCoreImplEventTemplateP comDayCqWcmCoreImplEventTemplatePostProcessorProperties3 = new OASComDayCqWcmCoreImplEventTemplateP();
        OASComDayCqWcmCoreImplEventTemplateP comDayCqWcmCoreImplEventTemplatePostProcessorProperties4 = new OASComDayCqWcmCoreImplEventTemplateP();

        System.assert(comDayCqWcmCoreImplEventTemplatePostProcessorProperties1.equals(comDayCqWcmCoreImplEventTemplatePostProcessorProperties2));
        System.assert(comDayCqWcmCoreImplEventTemplatePostProcessorProperties2.equals(comDayCqWcmCoreImplEventTemplatePostProcessorProperties1));
        System.assert(comDayCqWcmCoreImplEventTemplatePostProcessorProperties3.equals(comDayCqWcmCoreImplEventTemplatePostProcessorProperties4));
        System.assert(comDayCqWcmCoreImplEventTemplatePostProcessorProperties4.equals(comDayCqWcmCoreImplEventTemplatePostProcessorProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqWcmCoreImplEventTemplateP comDayCqWcmCoreImplEventTemplatePostProcessorProperties1 = OASComDayCqWcmCoreImplEventTemplateP.getExample();
        OASComDayCqWcmCoreImplEventTemplateP comDayCqWcmCoreImplEventTemplatePostProcessorProperties2 = new OASComDayCqWcmCoreImplEventTemplateP();

        System.assertEquals(false, comDayCqWcmCoreImplEventTemplatePostProcessorProperties1.equals('foo'));
        System.assertEquals(false, comDayCqWcmCoreImplEventTemplatePostProcessorProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqWcmCoreImplEventTemplateP comDayCqWcmCoreImplEventTemplatePostProcessorProperties1 = OASComDayCqWcmCoreImplEventTemplateP.getExample();
        OASComDayCqWcmCoreImplEventTemplateP comDayCqWcmCoreImplEventTemplatePostProcessorProperties2 = new OASComDayCqWcmCoreImplEventTemplateP();
        OASComDayCqWcmCoreImplEventTemplateP comDayCqWcmCoreImplEventTemplatePostProcessorProperties3;

        System.assertEquals(false, comDayCqWcmCoreImplEventTemplatePostProcessorProperties1.equals(comDayCqWcmCoreImplEventTemplatePostProcessorProperties3));
        System.assertEquals(false, comDayCqWcmCoreImplEventTemplatePostProcessorProperties2.equals(comDayCqWcmCoreImplEventTemplatePostProcessorProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqWcmCoreImplEventTemplateP comDayCqWcmCoreImplEventTemplatePostProcessorProperties1 = OASComDayCqWcmCoreImplEventTemplateP.getExample();
        OASComDayCqWcmCoreImplEventTemplateP comDayCqWcmCoreImplEventTemplatePostProcessorProperties2 = new OASComDayCqWcmCoreImplEventTemplateP();

        System.assertEquals(comDayCqWcmCoreImplEventTemplatePostProcessorProperties1.hashCode(), comDayCqWcmCoreImplEventTemplatePostProcessorProperties1.hashCode());
        System.assertEquals(comDayCqWcmCoreImplEventTemplatePostProcessorProperties2.hashCode(), comDayCqWcmCoreImplEventTemplatePostProcessorProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqWcmCoreImplEventTemplateP comDayCqWcmCoreImplEventTemplatePostProcessorProperties1 = OASComDayCqWcmCoreImplEventTemplateP.getExample();
        OASComDayCqWcmCoreImplEventTemplateP comDayCqWcmCoreImplEventTemplatePostProcessorProperties2 = OASComDayCqWcmCoreImplEventTemplateP.getExample();
        OASComDayCqWcmCoreImplEventTemplateP comDayCqWcmCoreImplEventTemplatePostProcessorProperties3 = new OASComDayCqWcmCoreImplEventTemplateP();
        OASComDayCqWcmCoreImplEventTemplateP comDayCqWcmCoreImplEventTemplatePostProcessorProperties4 = new OASComDayCqWcmCoreImplEventTemplateP();

        System.assert(comDayCqWcmCoreImplEventTemplatePostProcessorProperties1.equals(comDayCqWcmCoreImplEventTemplatePostProcessorProperties2));
        System.assert(comDayCqWcmCoreImplEventTemplatePostProcessorProperties3.equals(comDayCqWcmCoreImplEventTemplatePostProcessorProperties4));
        System.assertEquals(comDayCqWcmCoreImplEventTemplatePostProcessorProperties1.hashCode(), comDayCqWcmCoreImplEventTemplatePostProcessorProperties2.hashCode());
        System.assertEquals(comDayCqWcmCoreImplEventTemplatePostProcessorProperties3.hashCode(), comDayCqWcmCoreImplEventTemplatePostProcessorProperties4.hashCode());
    }
}
