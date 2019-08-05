@isTest
private class OASComDayCqDamPerformanceInternalAssTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqDamPerformanceInternalAss comDayCqDamPerformanceInternalAssetPerformanceReportSyncJobProperties1 = OASComDayCqDamPerformanceInternalAss.getExample();
        OASComDayCqDamPerformanceInternalAss comDayCqDamPerformanceInternalAssetPerformanceReportSyncJobProperties2 = comDayCqDamPerformanceInternalAssetPerformanceReportSyncJobProperties1;
        OASComDayCqDamPerformanceInternalAss comDayCqDamPerformanceInternalAssetPerformanceReportSyncJobProperties3 = new OASComDayCqDamPerformanceInternalAss();
        OASComDayCqDamPerformanceInternalAss comDayCqDamPerformanceInternalAssetPerformanceReportSyncJobProperties4 = comDayCqDamPerformanceInternalAssetPerformanceReportSyncJobProperties3;

        System.assert(comDayCqDamPerformanceInternalAssetPerformanceReportSyncJobProperties1.equals(comDayCqDamPerformanceInternalAssetPerformanceReportSyncJobProperties2));
        System.assert(comDayCqDamPerformanceInternalAssetPerformanceReportSyncJobProperties2.equals(comDayCqDamPerformanceInternalAssetPerformanceReportSyncJobProperties1));
        System.assert(comDayCqDamPerformanceInternalAssetPerformanceReportSyncJobProperties1.equals(comDayCqDamPerformanceInternalAssetPerformanceReportSyncJobProperties1));
        System.assert(comDayCqDamPerformanceInternalAssetPerformanceReportSyncJobProperties3.equals(comDayCqDamPerformanceInternalAssetPerformanceReportSyncJobProperties4));
        System.assert(comDayCqDamPerformanceInternalAssetPerformanceReportSyncJobProperties4.equals(comDayCqDamPerformanceInternalAssetPerformanceReportSyncJobProperties3));
        System.assert(comDayCqDamPerformanceInternalAssetPerformanceReportSyncJobProperties3.equals(comDayCqDamPerformanceInternalAssetPerformanceReportSyncJobProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqDamPerformanceInternalAss comDayCqDamPerformanceInternalAssetPerformanceReportSyncJobProperties1 = OASComDayCqDamPerformanceInternalAss.getExample();
        OASComDayCqDamPerformanceInternalAss comDayCqDamPerformanceInternalAssetPerformanceReportSyncJobProperties2 = OASComDayCqDamPerformanceInternalAss.getExample();
        OASComDayCqDamPerformanceInternalAss comDayCqDamPerformanceInternalAssetPerformanceReportSyncJobProperties3 = new OASComDayCqDamPerformanceInternalAss();
        OASComDayCqDamPerformanceInternalAss comDayCqDamPerformanceInternalAssetPerformanceReportSyncJobProperties4 = new OASComDayCqDamPerformanceInternalAss();

        System.assert(comDayCqDamPerformanceInternalAssetPerformanceReportSyncJobProperties1.equals(comDayCqDamPerformanceInternalAssetPerformanceReportSyncJobProperties2));
        System.assert(comDayCqDamPerformanceInternalAssetPerformanceReportSyncJobProperties2.equals(comDayCqDamPerformanceInternalAssetPerformanceReportSyncJobProperties1));
        System.assert(comDayCqDamPerformanceInternalAssetPerformanceReportSyncJobProperties3.equals(comDayCqDamPerformanceInternalAssetPerformanceReportSyncJobProperties4));
        System.assert(comDayCqDamPerformanceInternalAssetPerformanceReportSyncJobProperties4.equals(comDayCqDamPerformanceInternalAssetPerformanceReportSyncJobProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqDamPerformanceInternalAss comDayCqDamPerformanceInternalAssetPerformanceReportSyncJobProperties1 = OASComDayCqDamPerformanceInternalAss.getExample();
        OASComDayCqDamPerformanceInternalAss comDayCqDamPerformanceInternalAssetPerformanceReportSyncJobProperties2 = new OASComDayCqDamPerformanceInternalAss();

        System.assertEquals(false, comDayCqDamPerformanceInternalAssetPerformanceReportSyncJobProperties1.equals('foo'));
        System.assertEquals(false, comDayCqDamPerformanceInternalAssetPerformanceReportSyncJobProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqDamPerformanceInternalAss comDayCqDamPerformanceInternalAssetPerformanceReportSyncJobProperties1 = OASComDayCqDamPerformanceInternalAss.getExample();
        OASComDayCqDamPerformanceInternalAss comDayCqDamPerformanceInternalAssetPerformanceReportSyncJobProperties2 = new OASComDayCqDamPerformanceInternalAss();
        OASComDayCqDamPerformanceInternalAss comDayCqDamPerformanceInternalAssetPerformanceReportSyncJobProperties3;

        System.assertEquals(false, comDayCqDamPerformanceInternalAssetPerformanceReportSyncJobProperties1.equals(comDayCqDamPerformanceInternalAssetPerformanceReportSyncJobProperties3));
        System.assertEquals(false, comDayCqDamPerformanceInternalAssetPerformanceReportSyncJobProperties2.equals(comDayCqDamPerformanceInternalAssetPerformanceReportSyncJobProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqDamPerformanceInternalAss comDayCqDamPerformanceInternalAssetPerformanceReportSyncJobProperties1 = OASComDayCqDamPerformanceInternalAss.getExample();
        OASComDayCqDamPerformanceInternalAss comDayCqDamPerformanceInternalAssetPerformanceReportSyncJobProperties2 = new OASComDayCqDamPerformanceInternalAss();

        System.assertEquals(comDayCqDamPerformanceInternalAssetPerformanceReportSyncJobProperties1.hashCode(), comDayCqDamPerformanceInternalAssetPerformanceReportSyncJobProperties1.hashCode());
        System.assertEquals(comDayCqDamPerformanceInternalAssetPerformanceReportSyncJobProperties2.hashCode(), comDayCqDamPerformanceInternalAssetPerformanceReportSyncJobProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqDamPerformanceInternalAss comDayCqDamPerformanceInternalAssetPerformanceReportSyncJobProperties1 = OASComDayCqDamPerformanceInternalAss.getExample();
        OASComDayCqDamPerformanceInternalAss comDayCqDamPerformanceInternalAssetPerformanceReportSyncJobProperties2 = OASComDayCqDamPerformanceInternalAss.getExample();
        OASComDayCqDamPerformanceInternalAss comDayCqDamPerformanceInternalAssetPerformanceReportSyncJobProperties3 = new OASComDayCqDamPerformanceInternalAss();
        OASComDayCqDamPerformanceInternalAss comDayCqDamPerformanceInternalAssetPerformanceReportSyncJobProperties4 = new OASComDayCqDamPerformanceInternalAss();

        System.assert(comDayCqDamPerformanceInternalAssetPerformanceReportSyncJobProperties1.equals(comDayCqDamPerformanceInternalAssetPerformanceReportSyncJobProperties2));
        System.assert(comDayCqDamPerformanceInternalAssetPerformanceReportSyncJobProperties3.equals(comDayCqDamPerformanceInternalAssetPerformanceReportSyncJobProperties4));
        System.assertEquals(comDayCqDamPerformanceInternalAssetPerformanceReportSyncJobProperties1.hashCode(), comDayCqDamPerformanceInternalAssetPerformanceReportSyncJobProperties2.hashCode());
        System.assertEquals(comDayCqDamPerformanceInternalAssetPerformanceReportSyncJobProperties3.hashCode(), comDayCqDamPerformanceInternalAssetPerformanceReportSyncJobProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComDayCqDamPerformanceInternalAss comDayCqDamPerformanceInternalAssetPerformanceReportSyncJobProperties = new OASComDayCqDamPerformanceInternalAss();
        Map<String, String> propertyMappings = comDayCqDamPerformanceInternalAssetPerformanceReportSyncJobProperties.getPropertyMappings();
        System.assertEquals('schedulerExpression', propertyMappings.get('scheduler.expression'));
    }
}
