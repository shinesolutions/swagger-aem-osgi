@isTest
private class OASComDayCqDamCoreImplReportsReportETest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqDamCoreImplReportsReportE comDayCqDamCoreImplReportsReportExportServiceProperties1 = OASComDayCqDamCoreImplReportsReportE.getExample();
        OASComDayCqDamCoreImplReportsReportE comDayCqDamCoreImplReportsReportExportServiceProperties2 = comDayCqDamCoreImplReportsReportExportServiceProperties1;
        OASComDayCqDamCoreImplReportsReportE comDayCqDamCoreImplReportsReportExportServiceProperties3 = new OASComDayCqDamCoreImplReportsReportE();
        OASComDayCqDamCoreImplReportsReportE comDayCqDamCoreImplReportsReportExportServiceProperties4 = comDayCqDamCoreImplReportsReportExportServiceProperties3;

        System.assert(comDayCqDamCoreImplReportsReportExportServiceProperties1.equals(comDayCqDamCoreImplReportsReportExportServiceProperties2));
        System.assert(comDayCqDamCoreImplReportsReportExportServiceProperties2.equals(comDayCqDamCoreImplReportsReportExportServiceProperties1));
        System.assert(comDayCqDamCoreImplReportsReportExportServiceProperties1.equals(comDayCqDamCoreImplReportsReportExportServiceProperties1));
        System.assert(comDayCqDamCoreImplReportsReportExportServiceProperties3.equals(comDayCqDamCoreImplReportsReportExportServiceProperties4));
        System.assert(comDayCqDamCoreImplReportsReportExportServiceProperties4.equals(comDayCqDamCoreImplReportsReportExportServiceProperties3));
        System.assert(comDayCqDamCoreImplReportsReportExportServiceProperties3.equals(comDayCqDamCoreImplReportsReportExportServiceProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqDamCoreImplReportsReportE comDayCqDamCoreImplReportsReportExportServiceProperties1 = OASComDayCqDamCoreImplReportsReportE.getExample();
        OASComDayCqDamCoreImplReportsReportE comDayCqDamCoreImplReportsReportExportServiceProperties2 = OASComDayCqDamCoreImplReportsReportE.getExample();
        OASComDayCqDamCoreImplReportsReportE comDayCqDamCoreImplReportsReportExportServiceProperties3 = new OASComDayCqDamCoreImplReportsReportE();
        OASComDayCqDamCoreImplReportsReportE comDayCqDamCoreImplReportsReportExportServiceProperties4 = new OASComDayCqDamCoreImplReportsReportE();

        System.assert(comDayCqDamCoreImplReportsReportExportServiceProperties1.equals(comDayCqDamCoreImplReportsReportExportServiceProperties2));
        System.assert(comDayCqDamCoreImplReportsReportExportServiceProperties2.equals(comDayCqDamCoreImplReportsReportExportServiceProperties1));
        System.assert(comDayCqDamCoreImplReportsReportExportServiceProperties3.equals(comDayCqDamCoreImplReportsReportExportServiceProperties4));
        System.assert(comDayCqDamCoreImplReportsReportExportServiceProperties4.equals(comDayCqDamCoreImplReportsReportExportServiceProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqDamCoreImplReportsReportE comDayCqDamCoreImplReportsReportExportServiceProperties1 = OASComDayCqDamCoreImplReportsReportE.getExample();
        OASComDayCqDamCoreImplReportsReportE comDayCqDamCoreImplReportsReportExportServiceProperties2 = new OASComDayCqDamCoreImplReportsReportE();

        System.assertEquals(false, comDayCqDamCoreImplReportsReportExportServiceProperties1.equals('foo'));
        System.assertEquals(false, comDayCqDamCoreImplReportsReportExportServiceProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqDamCoreImplReportsReportE comDayCqDamCoreImplReportsReportExportServiceProperties1 = OASComDayCqDamCoreImplReportsReportE.getExample();
        OASComDayCqDamCoreImplReportsReportE comDayCqDamCoreImplReportsReportExportServiceProperties2 = new OASComDayCqDamCoreImplReportsReportE();
        OASComDayCqDamCoreImplReportsReportE comDayCqDamCoreImplReportsReportExportServiceProperties3;

        System.assertEquals(false, comDayCqDamCoreImplReportsReportExportServiceProperties1.equals(comDayCqDamCoreImplReportsReportExportServiceProperties3));
        System.assertEquals(false, comDayCqDamCoreImplReportsReportExportServiceProperties2.equals(comDayCqDamCoreImplReportsReportExportServiceProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqDamCoreImplReportsReportE comDayCqDamCoreImplReportsReportExportServiceProperties1 = OASComDayCqDamCoreImplReportsReportE.getExample();
        OASComDayCqDamCoreImplReportsReportE comDayCqDamCoreImplReportsReportExportServiceProperties2 = new OASComDayCqDamCoreImplReportsReportE();

        System.assertEquals(comDayCqDamCoreImplReportsReportExportServiceProperties1.hashCode(), comDayCqDamCoreImplReportsReportExportServiceProperties1.hashCode());
        System.assertEquals(comDayCqDamCoreImplReportsReportExportServiceProperties2.hashCode(), comDayCqDamCoreImplReportsReportExportServiceProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqDamCoreImplReportsReportE comDayCqDamCoreImplReportsReportExportServiceProperties1 = OASComDayCqDamCoreImplReportsReportE.getExample();
        OASComDayCqDamCoreImplReportsReportE comDayCqDamCoreImplReportsReportExportServiceProperties2 = OASComDayCqDamCoreImplReportsReportE.getExample();
        OASComDayCqDamCoreImplReportsReportE comDayCqDamCoreImplReportsReportExportServiceProperties3 = new OASComDayCqDamCoreImplReportsReportE();
        OASComDayCqDamCoreImplReportsReportE comDayCqDamCoreImplReportsReportExportServiceProperties4 = new OASComDayCqDamCoreImplReportsReportE();

        System.assert(comDayCqDamCoreImplReportsReportExportServiceProperties1.equals(comDayCqDamCoreImplReportsReportExportServiceProperties2));
        System.assert(comDayCqDamCoreImplReportsReportExportServiceProperties3.equals(comDayCqDamCoreImplReportsReportExportServiceProperties4));
        System.assertEquals(comDayCqDamCoreImplReportsReportExportServiceProperties1.hashCode(), comDayCqDamCoreImplReportsReportExportServiceProperties2.hashCode());
        System.assertEquals(comDayCqDamCoreImplReportsReportExportServiceProperties3.hashCode(), comDayCqDamCoreImplReportsReportExportServiceProperties4.hashCode());
    }
}
