@isTest
private class OASOrgApacheSlingSecurityImplReferreTest {
    @isTest
    private static void equalsSameInstance() {
        OASOrgApacheSlingSecurityImplReferre orgApacheSlingSecurityImplReferrerFilterProperties1 = OASOrgApacheSlingSecurityImplReferre.getExample();
        OASOrgApacheSlingSecurityImplReferre orgApacheSlingSecurityImplReferrerFilterProperties2 = orgApacheSlingSecurityImplReferrerFilterProperties1;
        OASOrgApacheSlingSecurityImplReferre orgApacheSlingSecurityImplReferrerFilterProperties3 = new OASOrgApacheSlingSecurityImplReferre();
        OASOrgApacheSlingSecurityImplReferre orgApacheSlingSecurityImplReferrerFilterProperties4 = orgApacheSlingSecurityImplReferrerFilterProperties3;

        System.assert(orgApacheSlingSecurityImplReferrerFilterProperties1.equals(orgApacheSlingSecurityImplReferrerFilterProperties2));
        System.assert(orgApacheSlingSecurityImplReferrerFilterProperties2.equals(orgApacheSlingSecurityImplReferrerFilterProperties1));
        System.assert(orgApacheSlingSecurityImplReferrerFilterProperties1.equals(orgApacheSlingSecurityImplReferrerFilterProperties1));
        System.assert(orgApacheSlingSecurityImplReferrerFilterProperties3.equals(orgApacheSlingSecurityImplReferrerFilterProperties4));
        System.assert(orgApacheSlingSecurityImplReferrerFilterProperties4.equals(orgApacheSlingSecurityImplReferrerFilterProperties3));
        System.assert(orgApacheSlingSecurityImplReferrerFilterProperties3.equals(orgApacheSlingSecurityImplReferrerFilterProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOrgApacheSlingSecurityImplReferre orgApacheSlingSecurityImplReferrerFilterProperties1 = OASOrgApacheSlingSecurityImplReferre.getExample();
        OASOrgApacheSlingSecurityImplReferre orgApacheSlingSecurityImplReferrerFilterProperties2 = OASOrgApacheSlingSecurityImplReferre.getExample();
        OASOrgApacheSlingSecurityImplReferre orgApacheSlingSecurityImplReferrerFilterProperties3 = new OASOrgApacheSlingSecurityImplReferre();
        OASOrgApacheSlingSecurityImplReferre orgApacheSlingSecurityImplReferrerFilterProperties4 = new OASOrgApacheSlingSecurityImplReferre();

        System.assert(orgApacheSlingSecurityImplReferrerFilterProperties1.equals(orgApacheSlingSecurityImplReferrerFilterProperties2));
        System.assert(orgApacheSlingSecurityImplReferrerFilterProperties2.equals(orgApacheSlingSecurityImplReferrerFilterProperties1));
        System.assert(orgApacheSlingSecurityImplReferrerFilterProperties3.equals(orgApacheSlingSecurityImplReferrerFilterProperties4));
        System.assert(orgApacheSlingSecurityImplReferrerFilterProperties4.equals(orgApacheSlingSecurityImplReferrerFilterProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOrgApacheSlingSecurityImplReferre orgApacheSlingSecurityImplReferrerFilterProperties1 = OASOrgApacheSlingSecurityImplReferre.getExample();
        OASOrgApacheSlingSecurityImplReferre orgApacheSlingSecurityImplReferrerFilterProperties2 = new OASOrgApacheSlingSecurityImplReferre();

        System.assertEquals(false, orgApacheSlingSecurityImplReferrerFilterProperties1.equals('foo'));
        System.assertEquals(false, orgApacheSlingSecurityImplReferrerFilterProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOrgApacheSlingSecurityImplReferre orgApacheSlingSecurityImplReferrerFilterProperties1 = OASOrgApacheSlingSecurityImplReferre.getExample();
        OASOrgApacheSlingSecurityImplReferre orgApacheSlingSecurityImplReferrerFilterProperties2 = new OASOrgApacheSlingSecurityImplReferre();
        OASOrgApacheSlingSecurityImplReferre orgApacheSlingSecurityImplReferrerFilterProperties3;

        System.assertEquals(false, orgApacheSlingSecurityImplReferrerFilterProperties1.equals(orgApacheSlingSecurityImplReferrerFilterProperties3));
        System.assertEquals(false, orgApacheSlingSecurityImplReferrerFilterProperties2.equals(orgApacheSlingSecurityImplReferrerFilterProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOrgApacheSlingSecurityImplReferre orgApacheSlingSecurityImplReferrerFilterProperties1 = OASOrgApacheSlingSecurityImplReferre.getExample();
        OASOrgApacheSlingSecurityImplReferre orgApacheSlingSecurityImplReferrerFilterProperties2 = new OASOrgApacheSlingSecurityImplReferre();

        System.assertEquals(orgApacheSlingSecurityImplReferrerFilterProperties1.hashCode(), orgApacheSlingSecurityImplReferrerFilterProperties1.hashCode());
        System.assertEquals(orgApacheSlingSecurityImplReferrerFilterProperties2.hashCode(), orgApacheSlingSecurityImplReferrerFilterProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOrgApacheSlingSecurityImplReferre orgApacheSlingSecurityImplReferrerFilterProperties1 = OASOrgApacheSlingSecurityImplReferre.getExample();
        OASOrgApacheSlingSecurityImplReferre orgApacheSlingSecurityImplReferrerFilterProperties2 = OASOrgApacheSlingSecurityImplReferre.getExample();
        OASOrgApacheSlingSecurityImplReferre orgApacheSlingSecurityImplReferrerFilterProperties3 = new OASOrgApacheSlingSecurityImplReferre();
        OASOrgApacheSlingSecurityImplReferre orgApacheSlingSecurityImplReferrerFilterProperties4 = new OASOrgApacheSlingSecurityImplReferre();

        System.assert(orgApacheSlingSecurityImplReferrerFilterProperties1.equals(orgApacheSlingSecurityImplReferrerFilterProperties2));
        System.assert(orgApacheSlingSecurityImplReferrerFilterProperties3.equals(orgApacheSlingSecurityImplReferrerFilterProperties4));
        System.assertEquals(orgApacheSlingSecurityImplReferrerFilterProperties1.hashCode(), orgApacheSlingSecurityImplReferrerFilterProperties2.hashCode());
        System.assertEquals(orgApacheSlingSecurityImplReferrerFilterProperties3.hashCode(), orgApacheSlingSecurityImplReferrerFilterProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASOrgApacheSlingSecurityImplReferre orgApacheSlingSecurityImplReferrerFilterProperties = new OASOrgApacheSlingSecurityImplReferre();
        Map<String, String> propertyMappings = orgApacheSlingSecurityImplReferrerFilterProperties.getPropertyMappings();
        System.assertEquals('allowEmpty', propertyMappings.get('allow.empty'));
        System.assertEquals('allowHosts', propertyMappings.get('allow.hosts'));
        System.assertEquals('allowHostsRegexp', propertyMappings.get('allow.hosts.regexp'));
        System.assertEquals('filterMethods', propertyMappings.get('filter.methods'));
        System.assertEquals('excludeAgentsRegexp', propertyMappings.get('exclude.agents.regexp'));
    }
}
