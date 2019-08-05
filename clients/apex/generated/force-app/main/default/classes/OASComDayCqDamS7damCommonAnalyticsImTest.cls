@isTest
private class OASComDayCqDamS7damCommonAnalyticsImTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqDamS7damCommonAnalyticsIm comDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties1 = OASComDayCqDamS7damCommonAnalyticsIm.getExample();
        OASComDayCqDamS7damCommonAnalyticsIm comDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties2 = comDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties1;
        OASComDayCqDamS7damCommonAnalyticsIm comDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties3 = new OASComDayCqDamS7damCommonAnalyticsIm();
        OASComDayCqDamS7damCommonAnalyticsIm comDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties4 = comDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties3;

        System.assert(comDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties1.equals(comDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties2));
        System.assert(comDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties2.equals(comDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties1));
        System.assert(comDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties1.equals(comDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties1));
        System.assert(comDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties3.equals(comDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties4));
        System.assert(comDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties4.equals(comDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties3));
        System.assert(comDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties3.equals(comDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqDamS7damCommonAnalyticsIm comDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties1 = OASComDayCqDamS7damCommonAnalyticsIm.getExample();
        OASComDayCqDamS7damCommonAnalyticsIm comDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties2 = OASComDayCqDamS7damCommonAnalyticsIm.getExample();
        OASComDayCqDamS7damCommonAnalyticsIm comDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties3 = new OASComDayCqDamS7damCommonAnalyticsIm();
        OASComDayCqDamS7damCommonAnalyticsIm comDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties4 = new OASComDayCqDamS7damCommonAnalyticsIm();

        System.assert(comDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties1.equals(comDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties2));
        System.assert(comDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties2.equals(comDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties1));
        System.assert(comDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties3.equals(comDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties4));
        System.assert(comDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties4.equals(comDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqDamS7damCommonAnalyticsIm comDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties1 = OASComDayCqDamS7damCommonAnalyticsIm.getExample();
        OASComDayCqDamS7damCommonAnalyticsIm comDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties2 = new OASComDayCqDamS7damCommonAnalyticsIm();

        System.assertEquals(false, comDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties1.equals('foo'));
        System.assertEquals(false, comDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqDamS7damCommonAnalyticsIm comDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties1 = OASComDayCqDamS7damCommonAnalyticsIm.getExample();
        OASComDayCqDamS7damCommonAnalyticsIm comDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties2 = new OASComDayCqDamS7damCommonAnalyticsIm();
        OASComDayCqDamS7damCommonAnalyticsIm comDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties3;

        System.assertEquals(false, comDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties1.equals(comDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties3));
        System.assertEquals(false, comDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties2.equals(comDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqDamS7damCommonAnalyticsIm comDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties1 = OASComDayCqDamS7damCommonAnalyticsIm.getExample();
        OASComDayCqDamS7damCommonAnalyticsIm comDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties2 = new OASComDayCqDamS7damCommonAnalyticsIm();

        System.assertEquals(comDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties1.hashCode(), comDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties1.hashCode());
        System.assertEquals(comDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties2.hashCode(), comDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqDamS7damCommonAnalyticsIm comDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties1 = OASComDayCqDamS7damCommonAnalyticsIm.getExample();
        OASComDayCqDamS7damCommonAnalyticsIm comDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties2 = OASComDayCqDamS7damCommonAnalyticsIm.getExample();
        OASComDayCqDamS7damCommonAnalyticsIm comDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties3 = new OASComDayCqDamS7damCommonAnalyticsIm();
        OASComDayCqDamS7damCommonAnalyticsIm comDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties4 = new OASComDayCqDamS7damCommonAnalyticsIm();

        System.assert(comDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties1.equals(comDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties2));
        System.assert(comDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties3.equals(comDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties4));
        System.assertEquals(comDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties1.hashCode(), comDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties2.hashCode());
        System.assertEquals(comDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties3.hashCode(), comDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComDayCqDamS7damCommonAnalyticsIm comDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties = new OASComDayCqDamS7damCommonAnalyticsIm();
        Map<String, String> propertyMappings = comDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties.getPropertyMappings();
        System.assertEquals('schedulerExpression', propertyMappings.get('scheduler.expression'));
        System.assertEquals('schedulerConcurrent', propertyMappings.get('scheduler.concurrent'));
    }
}
