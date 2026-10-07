@isTest
private class OASComDayCqWcmCoreImplEventPagePostPTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqWcmCoreImplEventPagePostP comDayCqWcmCoreImplEventPagePostProcessorProperties1 = OASComDayCqWcmCoreImplEventPagePostP.getExample();
        OASComDayCqWcmCoreImplEventPagePostP comDayCqWcmCoreImplEventPagePostProcessorProperties2 = comDayCqWcmCoreImplEventPagePostProcessorProperties1;
        OASComDayCqWcmCoreImplEventPagePostP comDayCqWcmCoreImplEventPagePostProcessorProperties3 = new OASComDayCqWcmCoreImplEventPagePostP();
        OASComDayCqWcmCoreImplEventPagePostP comDayCqWcmCoreImplEventPagePostProcessorProperties4 = comDayCqWcmCoreImplEventPagePostProcessorProperties3;

        System.assert(comDayCqWcmCoreImplEventPagePostProcessorProperties1.equals(comDayCqWcmCoreImplEventPagePostProcessorProperties2));
        System.assert(comDayCqWcmCoreImplEventPagePostProcessorProperties2.equals(comDayCqWcmCoreImplEventPagePostProcessorProperties1));
        System.assert(comDayCqWcmCoreImplEventPagePostProcessorProperties1.equals(comDayCqWcmCoreImplEventPagePostProcessorProperties1));
        System.assert(comDayCqWcmCoreImplEventPagePostProcessorProperties3.equals(comDayCqWcmCoreImplEventPagePostProcessorProperties4));
        System.assert(comDayCqWcmCoreImplEventPagePostProcessorProperties4.equals(comDayCqWcmCoreImplEventPagePostProcessorProperties3));
        System.assert(comDayCqWcmCoreImplEventPagePostProcessorProperties3.equals(comDayCqWcmCoreImplEventPagePostProcessorProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqWcmCoreImplEventPagePostP comDayCqWcmCoreImplEventPagePostProcessorProperties1 = OASComDayCqWcmCoreImplEventPagePostP.getExample();
        OASComDayCqWcmCoreImplEventPagePostP comDayCqWcmCoreImplEventPagePostProcessorProperties2 = OASComDayCqWcmCoreImplEventPagePostP.getExample();
        OASComDayCqWcmCoreImplEventPagePostP comDayCqWcmCoreImplEventPagePostProcessorProperties3 = new OASComDayCqWcmCoreImplEventPagePostP();
        OASComDayCqWcmCoreImplEventPagePostP comDayCqWcmCoreImplEventPagePostProcessorProperties4 = new OASComDayCqWcmCoreImplEventPagePostP();

        System.assert(comDayCqWcmCoreImplEventPagePostProcessorProperties1.equals(comDayCqWcmCoreImplEventPagePostProcessorProperties2));
        System.assert(comDayCqWcmCoreImplEventPagePostProcessorProperties2.equals(comDayCqWcmCoreImplEventPagePostProcessorProperties1));
        System.assert(comDayCqWcmCoreImplEventPagePostProcessorProperties3.equals(comDayCqWcmCoreImplEventPagePostProcessorProperties4));
        System.assert(comDayCqWcmCoreImplEventPagePostProcessorProperties4.equals(comDayCqWcmCoreImplEventPagePostProcessorProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqWcmCoreImplEventPagePostP comDayCqWcmCoreImplEventPagePostProcessorProperties1 = OASComDayCqWcmCoreImplEventPagePostP.getExample();
        OASComDayCqWcmCoreImplEventPagePostP comDayCqWcmCoreImplEventPagePostProcessorProperties2 = new OASComDayCqWcmCoreImplEventPagePostP();

        System.assertEquals(false, comDayCqWcmCoreImplEventPagePostProcessorProperties1.equals('foo'));
        System.assertEquals(false, comDayCqWcmCoreImplEventPagePostProcessorProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqWcmCoreImplEventPagePostP comDayCqWcmCoreImplEventPagePostProcessorProperties1 = OASComDayCqWcmCoreImplEventPagePostP.getExample();
        OASComDayCqWcmCoreImplEventPagePostP comDayCqWcmCoreImplEventPagePostProcessorProperties2 = new OASComDayCqWcmCoreImplEventPagePostP();
        OASComDayCqWcmCoreImplEventPagePostP comDayCqWcmCoreImplEventPagePostProcessorProperties3;

        System.assertEquals(false, comDayCqWcmCoreImplEventPagePostProcessorProperties1.equals(comDayCqWcmCoreImplEventPagePostProcessorProperties3));
        System.assertEquals(false, comDayCqWcmCoreImplEventPagePostProcessorProperties2.equals(comDayCqWcmCoreImplEventPagePostProcessorProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqWcmCoreImplEventPagePostP comDayCqWcmCoreImplEventPagePostProcessorProperties1 = OASComDayCqWcmCoreImplEventPagePostP.getExample();
        OASComDayCqWcmCoreImplEventPagePostP comDayCqWcmCoreImplEventPagePostProcessorProperties2 = new OASComDayCqWcmCoreImplEventPagePostP();

        System.assertEquals(comDayCqWcmCoreImplEventPagePostProcessorProperties1.hashCode(), comDayCqWcmCoreImplEventPagePostProcessorProperties1.hashCode());
        System.assertEquals(comDayCqWcmCoreImplEventPagePostProcessorProperties2.hashCode(), comDayCqWcmCoreImplEventPagePostProcessorProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqWcmCoreImplEventPagePostP comDayCqWcmCoreImplEventPagePostProcessorProperties1 = OASComDayCqWcmCoreImplEventPagePostP.getExample();
        OASComDayCqWcmCoreImplEventPagePostP comDayCqWcmCoreImplEventPagePostProcessorProperties2 = OASComDayCqWcmCoreImplEventPagePostP.getExample();
        OASComDayCqWcmCoreImplEventPagePostP comDayCqWcmCoreImplEventPagePostProcessorProperties3 = new OASComDayCqWcmCoreImplEventPagePostP();
        OASComDayCqWcmCoreImplEventPagePostP comDayCqWcmCoreImplEventPagePostProcessorProperties4 = new OASComDayCqWcmCoreImplEventPagePostP();

        System.assert(comDayCqWcmCoreImplEventPagePostProcessorProperties1.equals(comDayCqWcmCoreImplEventPagePostProcessorProperties2));
        System.assert(comDayCqWcmCoreImplEventPagePostProcessorProperties3.equals(comDayCqWcmCoreImplEventPagePostProcessorProperties4));
        System.assertEquals(comDayCqWcmCoreImplEventPagePostProcessorProperties1.hashCode(), comDayCqWcmCoreImplEventPagePostProcessorProperties2.hashCode());
        System.assertEquals(comDayCqWcmCoreImplEventPagePostProcessorProperties3.hashCode(), comDayCqWcmCoreImplEventPagePostProcessorProperties4.hashCode());
    }
}
