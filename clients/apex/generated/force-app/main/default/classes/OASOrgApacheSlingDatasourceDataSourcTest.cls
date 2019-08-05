@isTest
private class OASOrgApacheSlingDatasourceDataSourcTest {
    @isTest
    private static void equalsSameInstance() {
        OASOrgApacheSlingDatasourceDataSourc orgApacheSlingDatasourceDataSourceFactoryProperties1 = OASOrgApacheSlingDatasourceDataSourc.getExample();
        OASOrgApacheSlingDatasourceDataSourc orgApacheSlingDatasourceDataSourceFactoryProperties2 = orgApacheSlingDatasourceDataSourceFactoryProperties1;
        OASOrgApacheSlingDatasourceDataSourc orgApacheSlingDatasourceDataSourceFactoryProperties3 = new OASOrgApacheSlingDatasourceDataSourc();
        OASOrgApacheSlingDatasourceDataSourc orgApacheSlingDatasourceDataSourceFactoryProperties4 = orgApacheSlingDatasourceDataSourceFactoryProperties3;

        System.assert(orgApacheSlingDatasourceDataSourceFactoryProperties1.equals(orgApacheSlingDatasourceDataSourceFactoryProperties2));
        System.assert(orgApacheSlingDatasourceDataSourceFactoryProperties2.equals(orgApacheSlingDatasourceDataSourceFactoryProperties1));
        System.assert(orgApacheSlingDatasourceDataSourceFactoryProperties1.equals(orgApacheSlingDatasourceDataSourceFactoryProperties1));
        System.assert(orgApacheSlingDatasourceDataSourceFactoryProperties3.equals(orgApacheSlingDatasourceDataSourceFactoryProperties4));
        System.assert(orgApacheSlingDatasourceDataSourceFactoryProperties4.equals(orgApacheSlingDatasourceDataSourceFactoryProperties3));
        System.assert(orgApacheSlingDatasourceDataSourceFactoryProperties3.equals(orgApacheSlingDatasourceDataSourceFactoryProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOrgApacheSlingDatasourceDataSourc orgApacheSlingDatasourceDataSourceFactoryProperties1 = OASOrgApacheSlingDatasourceDataSourc.getExample();
        OASOrgApacheSlingDatasourceDataSourc orgApacheSlingDatasourceDataSourceFactoryProperties2 = OASOrgApacheSlingDatasourceDataSourc.getExample();
        OASOrgApacheSlingDatasourceDataSourc orgApacheSlingDatasourceDataSourceFactoryProperties3 = new OASOrgApacheSlingDatasourceDataSourc();
        OASOrgApacheSlingDatasourceDataSourc orgApacheSlingDatasourceDataSourceFactoryProperties4 = new OASOrgApacheSlingDatasourceDataSourc();

        System.assert(orgApacheSlingDatasourceDataSourceFactoryProperties1.equals(orgApacheSlingDatasourceDataSourceFactoryProperties2));
        System.assert(orgApacheSlingDatasourceDataSourceFactoryProperties2.equals(orgApacheSlingDatasourceDataSourceFactoryProperties1));
        System.assert(orgApacheSlingDatasourceDataSourceFactoryProperties3.equals(orgApacheSlingDatasourceDataSourceFactoryProperties4));
        System.assert(orgApacheSlingDatasourceDataSourceFactoryProperties4.equals(orgApacheSlingDatasourceDataSourceFactoryProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOrgApacheSlingDatasourceDataSourc orgApacheSlingDatasourceDataSourceFactoryProperties1 = OASOrgApacheSlingDatasourceDataSourc.getExample();
        OASOrgApacheSlingDatasourceDataSourc orgApacheSlingDatasourceDataSourceFactoryProperties2 = new OASOrgApacheSlingDatasourceDataSourc();

        System.assertEquals(false, orgApacheSlingDatasourceDataSourceFactoryProperties1.equals('foo'));
        System.assertEquals(false, orgApacheSlingDatasourceDataSourceFactoryProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOrgApacheSlingDatasourceDataSourc orgApacheSlingDatasourceDataSourceFactoryProperties1 = OASOrgApacheSlingDatasourceDataSourc.getExample();
        OASOrgApacheSlingDatasourceDataSourc orgApacheSlingDatasourceDataSourceFactoryProperties2 = new OASOrgApacheSlingDatasourceDataSourc();
        OASOrgApacheSlingDatasourceDataSourc orgApacheSlingDatasourceDataSourceFactoryProperties3;

        System.assertEquals(false, orgApacheSlingDatasourceDataSourceFactoryProperties1.equals(orgApacheSlingDatasourceDataSourceFactoryProperties3));
        System.assertEquals(false, orgApacheSlingDatasourceDataSourceFactoryProperties2.equals(orgApacheSlingDatasourceDataSourceFactoryProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOrgApacheSlingDatasourceDataSourc orgApacheSlingDatasourceDataSourceFactoryProperties1 = OASOrgApacheSlingDatasourceDataSourc.getExample();
        OASOrgApacheSlingDatasourceDataSourc orgApacheSlingDatasourceDataSourceFactoryProperties2 = new OASOrgApacheSlingDatasourceDataSourc();

        System.assertEquals(orgApacheSlingDatasourceDataSourceFactoryProperties1.hashCode(), orgApacheSlingDatasourceDataSourceFactoryProperties1.hashCode());
        System.assertEquals(orgApacheSlingDatasourceDataSourceFactoryProperties2.hashCode(), orgApacheSlingDatasourceDataSourceFactoryProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOrgApacheSlingDatasourceDataSourc orgApacheSlingDatasourceDataSourceFactoryProperties1 = OASOrgApacheSlingDatasourceDataSourc.getExample();
        OASOrgApacheSlingDatasourceDataSourc orgApacheSlingDatasourceDataSourceFactoryProperties2 = OASOrgApacheSlingDatasourceDataSourc.getExample();
        OASOrgApacheSlingDatasourceDataSourc orgApacheSlingDatasourceDataSourceFactoryProperties3 = new OASOrgApacheSlingDatasourceDataSourc();
        OASOrgApacheSlingDatasourceDataSourc orgApacheSlingDatasourceDataSourceFactoryProperties4 = new OASOrgApacheSlingDatasourceDataSourc();

        System.assert(orgApacheSlingDatasourceDataSourceFactoryProperties1.equals(orgApacheSlingDatasourceDataSourceFactoryProperties2));
        System.assert(orgApacheSlingDatasourceDataSourceFactoryProperties3.equals(orgApacheSlingDatasourceDataSourceFactoryProperties4));
        System.assertEquals(orgApacheSlingDatasourceDataSourceFactoryProperties1.hashCode(), orgApacheSlingDatasourceDataSourceFactoryProperties2.hashCode());
        System.assertEquals(orgApacheSlingDatasourceDataSourceFactoryProperties3.hashCode(), orgApacheSlingDatasourceDataSourceFactoryProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASOrgApacheSlingDatasourceDataSourc orgApacheSlingDatasourceDataSourceFactoryProperties = new OASOrgApacheSlingDatasourceDataSourc();
        Map<String, String> propertyMappings = orgApacheSlingDatasourceDataSourceFactoryProperties.getPropertyMappings();
        System.assertEquals('datasourceName', propertyMappings.get('datasource.name'));
        System.assertEquals('datasourceSvcPropName', propertyMappings.get('datasource.svc.prop.name'));
        System.assertEquals('datasourceSvcProperties', propertyMappings.get('datasource.svc.properties'));
    }
}
