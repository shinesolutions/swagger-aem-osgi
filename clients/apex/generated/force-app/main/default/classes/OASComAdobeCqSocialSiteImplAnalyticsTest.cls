@isTest
private class OASComAdobeCqSocialSiteImplAnalyticsTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeCqSocialSiteImplAnalytics comAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties1 = OASComAdobeCqSocialSiteImplAnalytics.getExample();
        OASComAdobeCqSocialSiteImplAnalytics comAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties2 = comAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties1;
        OASComAdobeCqSocialSiteImplAnalytics comAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties3 = new OASComAdobeCqSocialSiteImplAnalytics();
        OASComAdobeCqSocialSiteImplAnalytics comAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties4 = comAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties3;

        System.assert(comAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties1.equals(comAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties2));
        System.assert(comAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties2.equals(comAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties1));
        System.assert(comAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties1.equals(comAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties1));
        System.assert(comAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties3.equals(comAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties4));
        System.assert(comAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties4.equals(comAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties3));
        System.assert(comAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties3.equals(comAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeCqSocialSiteImplAnalytics comAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties1 = OASComAdobeCqSocialSiteImplAnalytics.getExample();
        OASComAdobeCqSocialSiteImplAnalytics comAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties2 = OASComAdobeCqSocialSiteImplAnalytics.getExample();
        OASComAdobeCqSocialSiteImplAnalytics comAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties3 = new OASComAdobeCqSocialSiteImplAnalytics();
        OASComAdobeCqSocialSiteImplAnalytics comAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties4 = new OASComAdobeCqSocialSiteImplAnalytics();

        System.assert(comAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties1.equals(comAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties2));
        System.assert(comAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties2.equals(comAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties1));
        System.assert(comAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties3.equals(comAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties4));
        System.assert(comAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties4.equals(comAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeCqSocialSiteImplAnalytics comAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties1 = OASComAdobeCqSocialSiteImplAnalytics.getExample();
        OASComAdobeCqSocialSiteImplAnalytics comAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties2 = new OASComAdobeCqSocialSiteImplAnalytics();

        System.assertEquals(false, comAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties1.equals('foo'));
        System.assertEquals(false, comAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeCqSocialSiteImplAnalytics comAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties1 = OASComAdobeCqSocialSiteImplAnalytics.getExample();
        OASComAdobeCqSocialSiteImplAnalytics comAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties2 = new OASComAdobeCqSocialSiteImplAnalytics();
        OASComAdobeCqSocialSiteImplAnalytics comAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties3;

        System.assertEquals(false, comAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties1.equals(comAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties3));
        System.assertEquals(false, comAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties2.equals(comAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeCqSocialSiteImplAnalytics comAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties1 = OASComAdobeCqSocialSiteImplAnalytics.getExample();
        OASComAdobeCqSocialSiteImplAnalytics comAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties2 = new OASComAdobeCqSocialSiteImplAnalytics();

        System.assertEquals(comAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties1.hashCode(), comAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties1.hashCode());
        System.assertEquals(comAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties2.hashCode(), comAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeCqSocialSiteImplAnalytics comAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties1 = OASComAdobeCqSocialSiteImplAnalytics.getExample();
        OASComAdobeCqSocialSiteImplAnalytics comAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties2 = OASComAdobeCqSocialSiteImplAnalytics.getExample();
        OASComAdobeCqSocialSiteImplAnalytics comAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties3 = new OASComAdobeCqSocialSiteImplAnalytics();
        OASComAdobeCqSocialSiteImplAnalytics comAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties4 = new OASComAdobeCqSocialSiteImplAnalytics();

        System.assert(comAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties1.equals(comAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties2));
        System.assert(comAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties3.equals(comAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties4));
        System.assertEquals(comAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties1.hashCode(), comAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties2.hashCode());
        System.assertEquals(comAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties3.hashCode(), comAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeCqSocialSiteImplAnalytics comAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties = new OASComAdobeCqSocialSiteImplAnalytics();
        Map<String, String> propertyMappings = comAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties.getPropertyMappings();
        System.assertEquals('cqSocialConsoleAnalyticsComponents', propertyMappings.get('cq.social.console.analytics.components'));
    }
}
