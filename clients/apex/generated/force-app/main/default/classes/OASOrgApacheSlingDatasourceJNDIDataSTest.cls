@isTest
private class OASOrgApacheSlingDatasourceJNDIDataSTest {
    @isTest
    private static void equalsSameInstance() {
        OASOrgApacheSlingDatasourceJNDIDataS orgApacheSlingDatasourceJNDIDataSourceFactoryProperties1 = OASOrgApacheSlingDatasourceJNDIDataS.getExample();
        OASOrgApacheSlingDatasourceJNDIDataS orgApacheSlingDatasourceJNDIDataSourceFactoryProperties2 = orgApacheSlingDatasourceJNDIDataSourceFactoryProperties1;
        OASOrgApacheSlingDatasourceJNDIDataS orgApacheSlingDatasourceJNDIDataSourceFactoryProperties3 = new OASOrgApacheSlingDatasourceJNDIDataS();
        OASOrgApacheSlingDatasourceJNDIDataS orgApacheSlingDatasourceJNDIDataSourceFactoryProperties4 = orgApacheSlingDatasourceJNDIDataSourceFactoryProperties3;

        System.assert(orgApacheSlingDatasourceJNDIDataSourceFactoryProperties1.equals(orgApacheSlingDatasourceJNDIDataSourceFactoryProperties2));
        System.assert(orgApacheSlingDatasourceJNDIDataSourceFactoryProperties2.equals(orgApacheSlingDatasourceJNDIDataSourceFactoryProperties1));
        System.assert(orgApacheSlingDatasourceJNDIDataSourceFactoryProperties1.equals(orgApacheSlingDatasourceJNDIDataSourceFactoryProperties1));
        System.assert(orgApacheSlingDatasourceJNDIDataSourceFactoryProperties3.equals(orgApacheSlingDatasourceJNDIDataSourceFactoryProperties4));
        System.assert(orgApacheSlingDatasourceJNDIDataSourceFactoryProperties4.equals(orgApacheSlingDatasourceJNDIDataSourceFactoryProperties3));
        System.assert(orgApacheSlingDatasourceJNDIDataSourceFactoryProperties3.equals(orgApacheSlingDatasourceJNDIDataSourceFactoryProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOrgApacheSlingDatasourceJNDIDataS orgApacheSlingDatasourceJNDIDataSourceFactoryProperties1 = OASOrgApacheSlingDatasourceJNDIDataS.getExample();
        OASOrgApacheSlingDatasourceJNDIDataS orgApacheSlingDatasourceJNDIDataSourceFactoryProperties2 = OASOrgApacheSlingDatasourceJNDIDataS.getExample();
        OASOrgApacheSlingDatasourceJNDIDataS orgApacheSlingDatasourceJNDIDataSourceFactoryProperties3 = new OASOrgApacheSlingDatasourceJNDIDataS();
        OASOrgApacheSlingDatasourceJNDIDataS orgApacheSlingDatasourceJNDIDataSourceFactoryProperties4 = new OASOrgApacheSlingDatasourceJNDIDataS();

        System.assert(orgApacheSlingDatasourceJNDIDataSourceFactoryProperties1.equals(orgApacheSlingDatasourceJNDIDataSourceFactoryProperties2));
        System.assert(orgApacheSlingDatasourceJNDIDataSourceFactoryProperties2.equals(orgApacheSlingDatasourceJNDIDataSourceFactoryProperties1));
        System.assert(orgApacheSlingDatasourceJNDIDataSourceFactoryProperties3.equals(orgApacheSlingDatasourceJNDIDataSourceFactoryProperties4));
        System.assert(orgApacheSlingDatasourceJNDIDataSourceFactoryProperties4.equals(orgApacheSlingDatasourceJNDIDataSourceFactoryProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOrgApacheSlingDatasourceJNDIDataS orgApacheSlingDatasourceJNDIDataSourceFactoryProperties1 = OASOrgApacheSlingDatasourceJNDIDataS.getExample();
        OASOrgApacheSlingDatasourceJNDIDataS orgApacheSlingDatasourceJNDIDataSourceFactoryProperties2 = new OASOrgApacheSlingDatasourceJNDIDataS();

        System.assertEquals(false, orgApacheSlingDatasourceJNDIDataSourceFactoryProperties1.equals('foo'));
        System.assertEquals(false, orgApacheSlingDatasourceJNDIDataSourceFactoryProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOrgApacheSlingDatasourceJNDIDataS orgApacheSlingDatasourceJNDIDataSourceFactoryProperties1 = OASOrgApacheSlingDatasourceJNDIDataS.getExample();
        OASOrgApacheSlingDatasourceJNDIDataS orgApacheSlingDatasourceJNDIDataSourceFactoryProperties2 = new OASOrgApacheSlingDatasourceJNDIDataS();
        OASOrgApacheSlingDatasourceJNDIDataS orgApacheSlingDatasourceJNDIDataSourceFactoryProperties3;

        System.assertEquals(false, orgApacheSlingDatasourceJNDIDataSourceFactoryProperties1.equals(orgApacheSlingDatasourceJNDIDataSourceFactoryProperties3));
        System.assertEquals(false, orgApacheSlingDatasourceJNDIDataSourceFactoryProperties2.equals(orgApacheSlingDatasourceJNDIDataSourceFactoryProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOrgApacheSlingDatasourceJNDIDataS orgApacheSlingDatasourceJNDIDataSourceFactoryProperties1 = OASOrgApacheSlingDatasourceJNDIDataS.getExample();
        OASOrgApacheSlingDatasourceJNDIDataS orgApacheSlingDatasourceJNDIDataSourceFactoryProperties2 = new OASOrgApacheSlingDatasourceJNDIDataS();

        System.assertEquals(orgApacheSlingDatasourceJNDIDataSourceFactoryProperties1.hashCode(), orgApacheSlingDatasourceJNDIDataSourceFactoryProperties1.hashCode());
        System.assertEquals(orgApacheSlingDatasourceJNDIDataSourceFactoryProperties2.hashCode(), orgApacheSlingDatasourceJNDIDataSourceFactoryProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOrgApacheSlingDatasourceJNDIDataS orgApacheSlingDatasourceJNDIDataSourceFactoryProperties1 = OASOrgApacheSlingDatasourceJNDIDataS.getExample();
        OASOrgApacheSlingDatasourceJNDIDataS orgApacheSlingDatasourceJNDIDataSourceFactoryProperties2 = OASOrgApacheSlingDatasourceJNDIDataS.getExample();
        OASOrgApacheSlingDatasourceJNDIDataS orgApacheSlingDatasourceJNDIDataSourceFactoryProperties3 = new OASOrgApacheSlingDatasourceJNDIDataS();
        OASOrgApacheSlingDatasourceJNDIDataS orgApacheSlingDatasourceJNDIDataSourceFactoryProperties4 = new OASOrgApacheSlingDatasourceJNDIDataS();

        System.assert(orgApacheSlingDatasourceJNDIDataSourceFactoryProperties1.equals(orgApacheSlingDatasourceJNDIDataSourceFactoryProperties2));
        System.assert(orgApacheSlingDatasourceJNDIDataSourceFactoryProperties3.equals(orgApacheSlingDatasourceJNDIDataSourceFactoryProperties4));
        System.assertEquals(orgApacheSlingDatasourceJNDIDataSourceFactoryProperties1.hashCode(), orgApacheSlingDatasourceJNDIDataSourceFactoryProperties2.hashCode());
        System.assertEquals(orgApacheSlingDatasourceJNDIDataSourceFactoryProperties3.hashCode(), orgApacheSlingDatasourceJNDIDataSourceFactoryProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASOrgApacheSlingDatasourceJNDIDataS orgApacheSlingDatasourceJNDIDataSourceFactoryProperties = new OASOrgApacheSlingDatasourceJNDIDataS();
        Map<String, String> x-property-mappings = orgApacheSlingDatasourceJNDIDataSourceFactoryProperties.getx-property-mappings();
        System.assertEquals('datasourceName', x-property-mappings.get('datasource.name'));
        System.assertEquals('datasourceSvcPropName', x-property-mappings.get('datasource.svc.prop.name'));
        System.assertEquals('datasourceJndiName', x-property-mappings.get('datasource.jndi.name'));
        System.assertEquals('jndiProperties', x-property-mappings.get('jndi.properties'));
    }
}
