@isTest
private class OASComDayCqDamCoreImplJobsMetadataexTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqDamCoreImplJobsMetadataex comDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties1 = OASComDayCqDamCoreImplJobsMetadataex.getExample();
        OASComDayCqDamCoreImplJobsMetadataex comDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties2 = comDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties1;
        OASComDayCqDamCoreImplJobsMetadataex comDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties3 = new OASComDayCqDamCoreImplJobsMetadataex();
        OASComDayCqDamCoreImplJobsMetadataex comDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties4 = comDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties3;

        System.assert(comDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties1.equals(comDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties2));
        System.assert(comDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties2.equals(comDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties1));
        System.assert(comDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties1.equals(comDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties1));
        System.assert(comDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties3.equals(comDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties4));
        System.assert(comDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties4.equals(comDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties3));
        System.assert(comDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties3.equals(comDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqDamCoreImplJobsMetadataex comDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties1 = OASComDayCqDamCoreImplJobsMetadataex.getExample();
        OASComDayCqDamCoreImplJobsMetadataex comDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties2 = OASComDayCqDamCoreImplJobsMetadataex.getExample();
        OASComDayCqDamCoreImplJobsMetadataex comDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties3 = new OASComDayCqDamCoreImplJobsMetadataex();
        OASComDayCqDamCoreImplJobsMetadataex comDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties4 = new OASComDayCqDamCoreImplJobsMetadataex();

        System.assert(comDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties1.equals(comDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties2));
        System.assert(comDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties2.equals(comDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties1));
        System.assert(comDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties3.equals(comDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties4));
        System.assert(comDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties4.equals(comDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqDamCoreImplJobsMetadataex comDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties1 = OASComDayCqDamCoreImplJobsMetadataex.getExample();
        OASComDayCqDamCoreImplJobsMetadataex comDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties2 = new OASComDayCqDamCoreImplJobsMetadataex();

        System.assertEquals(false, comDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties1.equals('foo'));
        System.assertEquals(false, comDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqDamCoreImplJobsMetadataex comDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties1 = OASComDayCqDamCoreImplJobsMetadataex.getExample();
        OASComDayCqDamCoreImplJobsMetadataex comDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties2 = new OASComDayCqDamCoreImplJobsMetadataex();
        OASComDayCqDamCoreImplJobsMetadataex comDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties3;

        System.assertEquals(false, comDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties1.equals(comDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties3));
        System.assertEquals(false, comDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties2.equals(comDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqDamCoreImplJobsMetadataex comDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties1 = OASComDayCqDamCoreImplJobsMetadataex.getExample();
        OASComDayCqDamCoreImplJobsMetadataex comDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties2 = new OASComDayCqDamCoreImplJobsMetadataex();

        System.assertEquals(comDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties1.hashCode(), comDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties1.hashCode());
        System.assertEquals(comDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties2.hashCode(), comDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqDamCoreImplJobsMetadataex comDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties1 = OASComDayCqDamCoreImplJobsMetadataex.getExample();
        OASComDayCqDamCoreImplJobsMetadataex comDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties2 = OASComDayCqDamCoreImplJobsMetadataex.getExample();
        OASComDayCqDamCoreImplJobsMetadataex comDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties3 = new OASComDayCqDamCoreImplJobsMetadataex();
        OASComDayCqDamCoreImplJobsMetadataex comDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties4 = new OASComDayCqDamCoreImplJobsMetadataex();

        System.assert(comDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties1.equals(comDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties2));
        System.assert(comDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties3.equals(comDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties4));
        System.assertEquals(comDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties1.hashCode(), comDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties2.hashCode());
        System.assertEquals(comDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties3.hashCode(), comDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties4.hashCode());
    }
}
