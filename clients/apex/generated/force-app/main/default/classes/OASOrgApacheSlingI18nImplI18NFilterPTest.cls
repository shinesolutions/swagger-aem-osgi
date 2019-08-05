@isTest
private class OASOrgApacheSlingI18nImplI18NFilterPTest {
    @isTest
    private static void equalsSameInstance() {
        OASOrgApacheSlingI18nImplI18NFilterP orgApacheSlingI18nImplI18NFilterProperties1 = OASOrgApacheSlingI18nImplI18NFilterP.getExample();
        OASOrgApacheSlingI18nImplI18NFilterP orgApacheSlingI18nImplI18NFilterProperties2 = orgApacheSlingI18nImplI18NFilterProperties1;
        OASOrgApacheSlingI18nImplI18NFilterP orgApacheSlingI18nImplI18NFilterProperties3 = new OASOrgApacheSlingI18nImplI18NFilterP();
        OASOrgApacheSlingI18nImplI18NFilterP orgApacheSlingI18nImplI18NFilterProperties4 = orgApacheSlingI18nImplI18NFilterProperties3;

        System.assert(orgApacheSlingI18nImplI18NFilterProperties1.equals(orgApacheSlingI18nImplI18NFilterProperties2));
        System.assert(orgApacheSlingI18nImplI18NFilterProperties2.equals(orgApacheSlingI18nImplI18NFilterProperties1));
        System.assert(orgApacheSlingI18nImplI18NFilterProperties1.equals(orgApacheSlingI18nImplI18NFilterProperties1));
        System.assert(orgApacheSlingI18nImplI18NFilterProperties3.equals(orgApacheSlingI18nImplI18NFilterProperties4));
        System.assert(orgApacheSlingI18nImplI18NFilterProperties4.equals(orgApacheSlingI18nImplI18NFilterProperties3));
        System.assert(orgApacheSlingI18nImplI18NFilterProperties3.equals(orgApacheSlingI18nImplI18NFilterProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOrgApacheSlingI18nImplI18NFilterP orgApacheSlingI18nImplI18NFilterProperties1 = OASOrgApacheSlingI18nImplI18NFilterP.getExample();
        OASOrgApacheSlingI18nImplI18NFilterP orgApacheSlingI18nImplI18NFilterProperties2 = OASOrgApacheSlingI18nImplI18NFilterP.getExample();
        OASOrgApacheSlingI18nImplI18NFilterP orgApacheSlingI18nImplI18NFilterProperties3 = new OASOrgApacheSlingI18nImplI18NFilterP();
        OASOrgApacheSlingI18nImplI18NFilterP orgApacheSlingI18nImplI18NFilterProperties4 = new OASOrgApacheSlingI18nImplI18NFilterP();

        System.assert(orgApacheSlingI18nImplI18NFilterProperties1.equals(orgApacheSlingI18nImplI18NFilterProperties2));
        System.assert(orgApacheSlingI18nImplI18NFilterProperties2.equals(orgApacheSlingI18nImplI18NFilterProperties1));
        System.assert(orgApacheSlingI18nImplI18NFilterProperties3.equals(orgApacheSlingI18nImplI18NFilterProperties4));
        System.assert(orgApacheSlingI18nImplI18NFilterProperties4.equals(orgApacheSlingI18nImplI18NFilterProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOrgApacheSlingI18nImplI18NFilterP orgApacheSlingI18nImplI18NFilterProperties1 = OASOrgApacheSlingI18nImplI18NFilterP.getExample();
        OASOrgApacheSlingI18nImplI18NFilterP orgApacheSlingI18nImplI18NFilterProperties2 = new OASOrgApacheSlingI18nImplI18NFilterP();

        System.assertEquals(false, orgApacheSlingI18nImplI18NFilterProperties1.equals('foo'));
        System.assertEquals(false, orgApacheSlingI18nImplI18NFilterProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOrgApacheSlingI18nImplI18NFilterP orgApacheSlingI18nImplI18NFilterProperties1 = OASOrgApacheSlingI18nImplI18NFilterP.getExample();
        OASOrgApacheSlingI18nImplI18NFilterP orgApacheSlingI18nImplI18NFilterProperties2 = new OASOrgApacheSlingI18nImplI18NFilterP();
        OASOrgApacheSlingI18nImplI18NFilterP orgApacheSlingI18nImplI18NFilterProperties3;

        System.assertEquals(false, orgApacheSlingI18nImplI18NFilterProperties1.equals(orgApacheSlingI18nImplI18NFilterProperties3));
        System.assertEquals(false, orgApacheSlingI18nImplI18NFilterProperties2.equals(orgApacheSlingI18nImplI18NFilterProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOrgApacheSlingI18nImplI18NFilterP orgApacheSlingI18nImplI18NFilterProperties1 = OASOrgApacheSlingI18nImplI18NFilterP.getExample();
        OASOrgApacheSlingI18nImplI18NFilterP orgApacheSlingI18nImplI18NFilterProperties2 = new OASOrgApacheSlingI18nImplI18NFilterP();

        System.assertEquals(orgApacheSlingI18nImplI18NFilterProperties1.hashCode(), orgApacheSlingI18nImplI18NFilterProperties1.hashCode());
        System.assertEquals(orgApacheSlingI18nImplI18NFilterProperties2.hashCode(), orgApacheSlingI18nImplI18NFilterProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOrgApacheSlingI18nImplI18NFilterP orgApacheSlingI18nImplI18NFilterProperties1 = OASOrgApacheSlingI18nImplI18NFilterP.getExample();
        OASOrgApacheSlingI18nImplI18NFilterP orgApacheSlingI18nImplI18NFilterProperties2 = OASOrgApacheSlingI18nImplI18NFilterP.getExample();
        OASOrgApacheSlingI18nImplI18NFilterP orgApacheSlingI18nImplI18NFilterProperties3 = new OASOrgApacheSlingI18nImplI18NFilterP();
        OASOrgApacheSlingI18nImplI18NFilterP orgApacheSlingI18nImplI18NFilterProperties4 = new OASOrgApacheSlingI18nImplI18NFilterP();

        System.assert(orgApacheSlingI18nImplI18NFilterProperties1.equals(orgApacheSlingI18nImplI18NFilterProperties2));
        System.assert(orgApacheSlingI18nImplI18NFilterProperties3.equals(orgApacheSlingI18nImplI18NFilterProperties4));
        System.assertEquals(orgApacheSlingI18nImplI18NFilterProperties1.hashCode(), orgApacheSlingI18nImplI18NFilterProperties2.hashCode());
        System.assertEquals(orgApacheSlingI18nImplI18NFilterProperties3.hashCode(), orgApacheSlingI18nImplI18NFilterProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASOrgApacheSlingI18nImplI18NFilterP orgApacheSlingI18nImplI18NFilterProperties = new OASOrgApacheSlingI18nImplI18NFilterP();
        Map<String, String> propertyMappings = orgApacheSlingI18nImplI18NFilterProperties.getPropertyMappings();
        System.assertEquals('serviceRanking', propertyMappings.get('service.ranking'));
        System.assertEquals('slingFilterScope', propertyMappings.get('sling.filter.scope'));
    }
}
