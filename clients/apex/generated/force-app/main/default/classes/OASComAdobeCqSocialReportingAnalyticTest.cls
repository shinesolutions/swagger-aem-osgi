@isTest
private class OASComAdobeCqSocialReportingAnalyticTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeCqSocialReportingAnalytic comAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties1 = OASComAdobeCqSocialReportingAnalytic.getExample();
        OASComAdobeCqSocialReportingAnalytic comAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties2 = comAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties1;
        OASComAdobeCqSocialReportingAnalytic comAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties3 = new OASComAdobeCqSocialReportingAnalytic();
        OASComAdobeCqSocialReportingAnalytic comAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties4 = comAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties3;

        System.assert(comAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties1.equals(comAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties2));
        System.assert(comAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties2.equals(comAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties1));
        System.assert(comAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties1.equals(comAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties1));
        System.assert(comAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties3.equals(comAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties4));
        System.assert(comAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties4.equals(comAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties3));
        System.assert(comAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties3.equals(comAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeCqSocialReportingAnalytic comAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties1 = OASComAdobeCqSocialReportingAnalytic.getExample();
        OASComAdobeCqSocialReportingAnalytic comAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties2 = OASComAdobeCqSocialReportingAnalytic.getExample();
        OASComAdobeCqSocialReportingAnalytic comAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties3 = new OASComAdobeCqSocialReportingAnalytic();
        OASComAdobeCqSocialReportingAnalytic comAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties4 = new OASComAdobeCqSocialReportingAnalytic();

        System.assert(comAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties1.equals(comAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties2));
        System.assert(comAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties2.equals(comAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties1));
        System.assert(comAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties3.equals(comAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties4));
        System.assert(comAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties4.equals(comAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeCqSocialReportingAnalytic comAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties1 = OASComAdobeCqSocialReportingAnalytic.getExample();
        OASComAdobeCqSocialReportingAnalytic comAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties2 = new OASComAdobeCqSocialReportingAnalytic();

        System.assertEquals(false, comAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties1.equals('foo'));
        System.assertEquals(false, comAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeCqSocialReportingAnalytic comAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties1 = OASComAdobeCqSocialReportingAnalytic.getExample();
        OASComAdobeCqSocialReportingAnalytic comAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties2 = new OASComAdobeCqSocialReportingAnalytic();
        OASComAdobeCqSocialReportingAnalytic comAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties3;

        System.assertEquals(false, comAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties1.equals(comAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties3));
        System.assertEquals(false, comAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties2.equals(comAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeCqSocialReportingAnalytic comAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties1 = OASComAdobeCqSocialReportingAnalytic.getExample();
        OASComAdobeCqSocialReportingAnalytic comAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties2 = new OASComAdobeCqSocialReportingAnalytic();

        System.assertEquals(comAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties1.hashCode(), comAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties1.hashCode());
        System.assertEquals(comAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties2.hashCode(), comAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeCqSocialReportingAnalytic comAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties1 = OASComAdobeCqSocialReportingAnalytic.getExample();
        OASComAdobeCqSocialReportingAnalytic comAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties2 = OASComAdobeCqSocialReportingAnalytic.getExample();
        OASComAdobeCqSocialReportingAnalytic comAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties3 = new OASComAdobeCqSocialReportingAnalytic();
        OASComAdobeCqSocialReportingAnalytic comAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties4 = new OASComAdobeCqSocialReportingAnalytic();

        System.assert(comAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties1.equals(comAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties2));
        System.assert(comAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties3.equals(comAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties4));
        System.assertEquals(comAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties1.hashCode(), comAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties2.hashCode());
        System.assertEquals(comAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties3.hashCode(), comAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeCqSocialReportingAnalytic comAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties = new OASComAdobeCqSocialReportingAnalytic();
        Map<String, String> propertyMappings = comAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties.getPropertyMappings();
        System.assertEquals('cqSocialConsoleAnalyticsSitesMapping', propertyMappings.get('cq.social.console.analytics.sites.mapping'));
    }
}
