@isTest
private class OASOrgApacheJackrabbitOakPluginsMetrTest {
    @isTest
    private static void equalsSameInstance() {
        OASOrgApacheJackrabbitOakPluginsMetr orgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties1 = OASOrgApacheJackrabbitOakPluginsMetr.getExample();
        OASOrgApacheJackrabbitOakPluginsMetr orgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties2 = orgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties1;
        OASOrgApacheJackrabbitOakPluginsMetr orgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties3 = new OASOrgApacheJackrabbitOakPluginsMetr();
        OASOrgApacheJackrabbitOakPluginsMetr orgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties4 = orgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties3;

        System.assert(orgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties1.equals(orgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties2));
        System.assert(orgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties2.equals(orgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties1));
        System.assert(orgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties1.equals(orgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties1));
        System.assert(orgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties3.equals(orgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties4));
        System.assert(orgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties4.equals(orgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties3));
        System.assert(orgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties3.equals(orgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOrgApacheJackrabbitOakPluginsMetr orgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties1 = OASOrgApacheJackrabbitOakPluginsMetr.getExample();
        OASOrgApacheJackrabbitOakPluginsMetr orgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties2 = OASOrgApacheJackrabbitOakPluginsMetr.getExample();
        OASOrgApacheJackrabbitOakPluginsMetr orgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties3 = new OASOrgApacheJackrabbitOakPluginsMetr();
        OASOrgApacheJackrabbitOakPluginsMetr orgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties4 = new OASOrgApacheJackrabbitOakPluginsMetr();

        System.assert(orgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties1.equals(orgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties2));
        System.assert(orgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties2.equals(orgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties1));
        System.assert(orgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties3.equals(orgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties4));
        System.assert(orgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties4.equals(orgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOrgApacheJackrabbitOakPluginsMetr orgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties1 = OASOrgApacheJackrabbitOakPluginsMetr.getExample();
        OASOrgApacheJackrabbitOakPluginsMetr orgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties2 = new OASOrgApacheJackrabbitOakPluginsMetr();

        System.assertEquals(false, orgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties1.equals('foo'));
        System.assertEquals(false, orgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOrgApacheJackrabbitOakPluginsMetr orgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties1 = OASOrgApacheJackrabbitOakPluginsMetr.getExample();
        OASOrgApacheJackrabbitOakPluginsMetr orgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties2 = new OASOrgApacheJackrabbitOakPluginsMetr();
        OASOrgApacheJackrabbitOakPluginsMetr orgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties3;

        System.assertEquals(false, orgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties1.equals(orgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties3));
        System.assertEquals(false, orgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties2.equals(orgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOrgApacheJackrabbitOakPluginsMetr orgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties1 = OASOrgApacheJackrabbitOakPluginsMetr.getExample();
        OASOrgApacheJackrabbitOakPluginsMetr orgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties2 = new OASOrgApacheJackrabbitOakPluginsMetr();

        System.assertEquals(orgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties1.hashCode(), orgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties1.hashCode());
        System.assertEquals(orgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties2.hashCode(), orgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOrgApacheJackrabbitOakPluginsMetr orgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties1 = OASOrgApacheJackrabbitOakPluginsMetr.getExample();
        OASOrgApacheJackrabbitOakPluginsMetr orgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties2 = OASOrgApacheJackrabbitOakPluginsMetr.getExample();
        OASOrgApacheJackrabbitOakPluginsMetr orgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties3 = new OASOrgApacheJackrabbitOakPluginsMetr();
        OASOrgApacheJackrabbitOakPluginsMetr orgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties4 = new OASOrgApacheJackrabbitOakPluginsMetr();

        System.assert(orgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties1.equals(orgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties2));
        System.assert(orgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties3.equals(orgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties4));
        System.assertEquals(orgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties1.hashCode(), orgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties2.hashCode());
        System.assertEquals(orgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties3.hashCode(), orgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties4.hashCode());
    }
}
