@isTest
private class OASComDayCqDamCoreImplJobsMetadataimTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqDamCoreImplJobsMetadataim comDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties1 = OASComDayCqDamCoreImplJobsMetadataim.getExample();
        OASComDayCqDamCoreImplJobsMetadataim comDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties2 = comDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties1;
        OASComDayCqDamCoreImplJobsMetadataim comDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties3 = new OASComDayCqDamCoreImplJobsMetadataim();
        OASComDayCqDamCoreImplJobsMetadataim comDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties4 = comDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties3;

        System.assert(comDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties1.equals(comDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties2));
        System.assert(comDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties2.equals(comDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties1));
        System.assert(comDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties1.equals(comDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties1));
        System.assert(comDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties3.equals(comDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties4));
        System.assert(comDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties4.equals(comDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties3));
        System.assert(comDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties3.equals(comDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqDamCoreImplJobsMetadataim comDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties1 = OASComDayCqDamCoreImplJobsMetadataim.getExample();
        OASComDayCqDamCoreImplJobsMetadataim comDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties2 = OASComDayCqDamCoreImplJobsMetadataim.getExample();
        OASComDayCqDamCoreImplJobsMetadataim comDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties3 = new OASComDayCqDamCoreImplJobsMetadataim();
        OASComDayCqDamCoreImplJobsMetadataim comDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties4 = new OASComDayCqDamCoreImplJobsMetadataim();

        System.assert(comDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties1.equals(comDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties2));
        System.assert(comDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties2.equals(comDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties1));
        System.assert(comDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties3.equals(comDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties4));
        System.assert(comDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties4.equals(comDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqDamCoreImplJobsMetadataim comDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties1 = OASComDayCqDamCoreImplJobsMetadataim.getExample();
        OASComDayCqDamCoreImplJobsMetadataim comDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties2 = new OASComDayCqDamCoreImplJobsMetadataim();

        System.assertEquals(false, comDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties1.equals('foo'));
        System.assertEquals(false, comDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqDamCoreImplJobsMetadataim comDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties1 = OASComDayCqDamCoreImplJobsMetadataim.getExample();
        OASComDayCqDamCoreImplJobsMetadataim comDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties2 = new OASComDayCqDamCoreImplJobsMetadataim();
        OASComDayCqDamCoreImplJobsMetadataim comDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties3;

        System.assertEquals(false, comDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties1.equals(comDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties3));
        System.assertEquals(false, comDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties2.equals(comDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqDamCoreImplJobsMetadataim comDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties1 = OASComDayCqDamCoreImplJobsMetadataim.getExample();
        OASComDayCqDamCoreImplJobsMetadataim comDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties2 = new OASComDayCqDamCoreImplJobsMetadataim();

        System.assertEquals(comDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties1.hashCode(), comDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties1.hashCode());
        System.assertEquals(comDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties2.hashCode(), comDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqDamCoreImplJobsMetadataim comDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties1 = OASComDayCqDamCoreImplJobsMetadataim.getExample();
        OASComDayCqDamCoreImplJobsMetadataim comDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties2 = OASComDayCqDamCoreImplJobsMetadataim.getExample();
        OASComDayCqDamCoreImplJobsMetadataim comDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties3 = new OASComDayCqDamCoreImplJobsMetadataim();
        OASComDayCqDamCoreImplJobsMetadataim comDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties4 = new OASComDayCqDamCoreImplJobsMetadataim();

        System.assert(comDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties1.equals(comDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties2));
        System.assert(comDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties3.equals(comDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties4));
        System.assertEquals(comDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties1.hashCode(), comDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties2.hashCode());
        System.assertEquals(comDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties3.hashCode(), comDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties4.hashCode());
    }
}
