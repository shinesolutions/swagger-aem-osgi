@isTest
private class OASComDayCqDamCoreImplProcessTextExtTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqDamCoreImplProcessTextExt comDayCqDamCoreImplProcessTextExtractionProcessProperties1 = OASComDayCqDamCoreImplProcessTextExt.getExample();
        OASComDayCqDamCoreImplProcessTextExt comDayCqDamCoreImplProcessTextExtractionProcessProperties2 = comDayCqDamCoreImplProcessTextExtractionProcessProperties1;
        OASComDayCqDamCoreImplProcessTextExt comDayCqDamCoreImplProcessTextExtractionProcessProperties3 = new OASComDayCqDamCoreImplProcessTextExt();
        OASComDayCqDamCoreImplProcessTextExt comDayCqDamCoreImplProcessTextExtractionProcessProperties4 = comDayCqDamCoreImplProcessTextExtractionProcessProperties3;

        System.assert(comDayCqDamCoreImplProcessTextExtractionProcessProperties1.equals(comDayCqDamCoreImplProcessTextExtractionProcessProperties2));
        System.assert(comDayCqDamCoreImplProcessTextExtractionProcessProperties2.equals(comDayCqDamCoreImplProcessTextExtractionProcessProperties1));
        System.assert(comDayCqDamCoreImplProcessTextExtractionProcessProperties1.equals(comDayCqDamCoreImplProcessTextExtractionProcessProperties1));
        System.assert(comDayCqDamCoreImplProcessTextExtractionProcessProperties3.equals(comDayCqDamCoreImplProcessTextExtractionProcessProperties4));
        System.assert(comDayCqDamCoreImplProcessTextExtractionProcessProperties4.equals(comDayCqDamCoreImplProcessTextExtractionProcessProperties3));
        System.assert(comDayCqDamCoreImplProcessTextExtractionProcessProperties3.equals(comDayCqDamCoreImplProcessTextExtractionProcessProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqDamCoreImplProcessTextExt comDayCqDamCoreImplProcessTextExtractionProcessProperties1 = OASComDayCqDamCoreImplProcessTextExt.getExample();
        OASComDayCqDamCoreImplProcessTextExt comDayCqDamCoreImplProcessTextExtractionProcessProperties2 = OASComDayCqDamCoreImplProcessTextExt.getExample();
        OASComDayCqDamCoreImplProcessTextExt comDayCqDamCoreImplProcessTextExtractionProcessProperties3 = new OASComDayCqDamCoreImplProcessTextExt();
        OASComDayCqDamCoreImplProcessTextExt comDayCqDamCoreImplProcessTextExtractionProcessProperties4 = new OASComDayCqDamCoreImplProcessTextExt();

        System.assert(comDayCqDamCoreImplProcessTextExtractionProcessProperties1.equals(comDayCqDamCoreImplProcessTextExtractionProcessProperties2));
        System.assert(comDayCqDamCoreImplProcessTextExtractionProcessProperties2.equals(comDayCqDamCoreImplProcessTextExtractionProcessProperties1));
        System.assert(comDayCqDamCoreImplProcessTextExtractionProcessProperties3.equals(comDayCqDamCoreImplProcessTextExtractionProcessProperties4));
        System.assert(comDayCqDamCoreImplProcessTextExtractionProcessProperties4.equals(comDayCqDamCoreImplProcessTextExtractionProcessProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqDamCoreImplProcessTextExt comDayCqDamCoreImplProcessTextExtractionProcessProperties1 = OASComDayCqDamCoreImplProcessTextExt.getExample();
        OASComDayCqDamCoreImplProcessTextExt comDayCqDamCoreImplProcessTextExtractionProcessProperties2 = new OASComDayCqDamCoreImplProcessTextExt();

        System.assertEquals(false, comDayCqDamCoreImplProcessTextExtractionProcessProperties1.equals('foo'));
        System.assertEquals(false, comDayCqDamCoreImplProcessTextExtractionProcessProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqDamCoreImplProcessTextExt comDayCqDamCoreImplProcessTextExtractionProcessProperties1 = OASComDayCqDamCoreImplProcessTextExt.getExample();
        OASComDayCqDamCoreImplProcessTextExt comDayCqDamCoreImplProcessTextExtractionProcessProperties2 = new OASComDayCqDamCoreImplProcessTextExt();
        OASComDayCqDamCoreImplProcessTextExt comDayCqDamCoreImplProcessTextExtractionProcessProperties3;

        System.assertEquals(false, comDayCqDamCoreImplProcessTextExtractionProcessProperties1.equals(comDayCqDamCoreImplProcessTextExtractionProcessProperties3));
        System.assertEquals(false, comDayCqDamCoreImplProcessTextExtractionProcessProperties2.equals(comDayCqDamCoreImplProcessTextExtractionProcessProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqDamCoreImplProcessTextExt comDayCqDamCoreImplProcessTextExtractionProcessProperties1 = OASComDayCqDamCoreImplProcessTextExt.getExample();
        OASComDayCqDamCoreImplProcessTextExt comDayCqDamCoreImplProcessTextExtractionProcessProperties2 = new OASComDayCqDamCoreImplProcessTextExt();

        System.assertEquals(comDayCqDamCoreImplProcessTextExtractionProcessProperties1.hashCode(), comDayCqDamCoreImplProcessTextExtractionProcessProperties1.hashCode());
        System.assertEquals(comDayCqDamCoreImplProcessTextExtractionProcessProperties2.hashCode(), comDayCqDamCoreImplProcessTextExtractionProcessProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqDamCoreImplProcessTextExt comDayCqDamCoreImplProcessTextExtractionProcessProperties1 = OASComDayCqDamCoreImplProcessTextExt.getExample();
        OASComDayCqDamCoreImplProcessTextExt comDayCqDamCoreImplProcessTextExtractionProcessProperties2 = OASComDayCqDamCoreImplProcessTextExt.getExample();
        OASComDayCqDamCoreImplProcessTextExt comDayCqDamCoreImplProcessTextExtractionProcessProperties3 = new OASComDayCqDamCoreImplProcessTextExt();
        OASComDayCqDamCoreImplProcessTextExt comDayCqDamCoreImplProcessTextExtractionProcessProperties4 = new OASComDayCqDamCoreImplProcessTextExt();

        System.assert(comDayCqDamCoreImplProcessTextExtractionProcessProperties1.equals(comDayCqDamCoreImplProcessTextExtractionProcessProperties2));
        System.assert(comDayCqDamCoreImplProcessTextExtractionProcessProperties3.equals(comDayCqDamCoreImplProcessTextExtractionProcessProperties4));
        System.assertEquals(comDayCqDamCoreImplProcessTextExtractionProcessProperties1.hashCode(), comDayCqDamCoreImplProcessTextExtractionProcessProperties2.hashCode());
        System.assertEquals(comDayCqDamCoreImplProcessTextExtractionProcessProperties3.hashCode(), comDayCqDamCoreImplProcessTextExtractionProcessProperties4.hashCode());
    }
}
