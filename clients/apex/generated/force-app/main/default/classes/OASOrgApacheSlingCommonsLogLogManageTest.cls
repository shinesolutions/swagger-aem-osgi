@isTest
private class OASOrgApacheSlingCommonsLogLogManageTest {
    @isTest
    private static void equalsSameInstance() {
        OASOrgApacheSlingCommonsLogLogManage orgApacheSlingCommonsLogLogManagerFactoryWriterProperties1 = OASOrgApacheSlingCommonsLogLogManage.getExample();
        OASOrgApacheSlingCommonsLogLogManage orgApacheSlingCommonsLogLogManagerFactoryWriterProperties2 = orgApacheSlingCommonsLogLogManagerFactoryWriterProperties1;
        OASOrgApacheSlingCommonsLogLogManage orgApacheSlingCommonsLogLogManagerFactoryWriterProperties3 = new OASOrgApacheSlingCommonsLogLogManage();
        OASOrgApacheSlingCommonsLogLogManage orgApacheSlingCommonsLogLogManagerFactoryWriterProperties4 = orgApacheSlingCommonsLogLogManagerFactoryWriterProperties3;

        System.assert(orgApacheSlingCommonsLogLogManagerFactoryWriterProperties1.equals(orgApacheSlingCommonsLogLogManagerFactoryWriterProperties2));
        System.assert(orgApacheSlingCommonsLogLogManagerFactoryWriterProperties2.equals(orgApacheSlingCommonsLogLogManagerFactoryWriterProperties1));
        System.assert(orgApacheSlingCommonsLogLogManagerFactoryWriterProperties1.equals(orgApacheSlingCommonsLogLogManagerFactoryWriterProperties1));
        System.assert(orgApacheSlingCommonsLogLogManagerFactoryWriterProperties3.equals(orgApacheSlingCommonsLogLogManagerFactoryWriterProperties4));
        System.assert(orgApacheSlingCommonsLogLogManagerFactoryWriterProperties4.equals(orgApacheSlingCommonsLogLogManagerFactoryWriterProperties3));
        System.assert(orgApacheSlingCommonsLogLogManagerFactoryWriterProperties3.equals(orgApacheSlingCommonsLogLogManagerFactoryWriterProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOrgApacheSlingCommonsLogLogManage orgApacheSlingCommonsLogLogManagerFactoryWriterProperties1 = OASOrgApacheSlingCommonsLogLogManage.getExample();
        OASOrgApacheSlingCommonsLogLogManage orgApacheSlingCommonsLogLogManagerFactoryWriterProperties2 = OASOrgApacheSlingCommonsLogLogManage.getExample();
        OASOrgApacheSlingCommonsLogLogManage orgApacheSlingCommonsLogLogManagerFactoryWriterProperties3 = new OASOrgApacheSlingCommonsLogLogManage();
        OASOrgApacheSlingCommonsLogLogManage orgApacheSlingCommonsLogLogManagerFactoryWriterProperties4 = new OASOrgApacheSlingCommonsLogLogManage();

        System.assert(orgApacheSlingCommonsLogLogManagerFactoryWriterProperties1.equals(orgApacheSlingCommonsLogLogManagerFactoryWriterProperties2));
        System.assert(orgApacheSlingCommonsLogLogManagerFactoryWriterProperties2.equals(orgApacheSlingCommonsLogLogManagerFactoryWriterProperties1));
        System.assert(orgApacheSlingCommonsLogLogManagerFactoryWriterProperties3.equals(orgApacheSlingCommonsLogLogManagerFactoryWriterProperties4));
        System.assert(orgApacheSlingCommonsLogLogManagerFactoryWriterProperties4.equals(orgApacheSlingCommonsLogLogManagerFactoryWriterProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOrgApacheSlingCommonsLogLogManage orgApacheSlingCommonsLogLogManagerFactoryWriterProperties1 = OASOrgApacheSlingCommonsLogLogManage.getExample();
        OASOrgApacheSlingCommonsLogLogManage orgApacheSlingCommonsLogLogManagerFactoryWriterProperties2 = new OASOrgApacheSlingCommonsLogLogManage();

        System.assertEquals(false, orgApacheSlingCommonsLogLogManagerFactoryWriterProperties1.equals('foo'));
        System.assertEquals(false, orgApacheSlingCommonsLogLogManagerFactoryWriterProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOrgApacheSlingCommonsLogLogManage orgApacheSlingCommonsLogLogManagerFactoryWriterProperties1 = OASOrgApacheSlingCommonsLogLogManage.getExample();
        OASOrgApacheSlingCommonsLogLogManage orgApacheSlingCommonsLogLogManagerFactoryWriterProperties2 = new OASOrgApacheSlingCommonsLogLogManage();
        OASOrgApacheSlingCommonsLogLogManage orgApacheSlingCommonsLogLogManagerFactoryWriterProperties3;

        System.assertEquals(false, orgApacheSlingCommonsLogLogManagerFactoryWriterProperties1.equals(orgApacheSlingCommonsLogLogManagerFactoryWriterProperties3));
        System.assertEquals(false, orgApacheSlingCommonsLogLogManagerFactoryWriterProperties2.equals(orgApacheSlingCommonsLogLogManagerFactoryWriterProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOrgApacheSlingCommonsLogLogManage orgApacheSlingCommonsLogLogManagerFactoryWriterProperties1 = OASOrgApacheSlingCommonsLogLogManage.getExample();
        OASOrgApacheSlingCommonsLogLogManage orgApacheSlingCommonsLogLogManagerFactoryWriterProperties2 = new OASOrgApacheSlingCommonsLogLogManage();

        System.assertEquals(orgApacheSlingCommonsLogLogManagerFactoryWriterProperties1.hashCode(), orgApacheSlingCommonsLogLogManagerFactoryWriterProperties1.hashCode());
        System.assertEquals(orgApacheSlingCommonsLogLogManagerFactoryWriterProperties2.hashCode(), orgApacheSlingCommonsLogLogManagerFactoryWriterProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOrgApacheSlingCommonsLogLogManage orgApacheSlingCommonsLogLogManagerFactoryWriterProperties1 = OASOrgApacheSlingCommonsLogLogManage.getExample();
        OASOrgApacheSlingCommonsLogLogManage orgApacheSlingCommonsLogLogManagerFactoryWriterProperties2 = OASOrgApacheSlingCommonsLogLogManage.getExample();
        OASOrgApacheSlingCommonsLogLogManage orgApacheSlingCommonsLogLogManagerFactoryWriterProperties3 = new OASOrgApacheSlingCommonsLogLogManage();
        OASOrgApacheSlingCommonsLogLogManage orgApacheSlingCommonsLogLogManagerFactoryWriterProperties4 = new OASOrgApacheSlingCommonsLogLogManage();

        System.assert(orgApacheSlingCommonsLogLogManagerFactoryWriterProperties1.equals(orgApacheSlingCommonsLogLogManagerFactoryWriterProperties2));
        System.assert(orgApacheSlingCommonsLogLogManagerFactoryWriterProperties3.equals(orgApacheSlingCommonsLogLogManagerFactoryWriterProperties4));
        System.assertEquals(orgApacheSlingCommonsLogLogManagerFactoryWriterProperties1.hashCode(), orgApacheSlingCommonsLogLogManagerFactoryWriterProperties2.hashCode());
        System.assertEquals(orgApacheSlingCommonsLogLogManagerFactoryWriterProperties3.hashCode(), orgApacheSlingCommonsLogLogManagerFactoryWriterProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASOrgApacheSlingCommonsLogLogManage orgApacheSlingCommonsLogLogManagerFactoryWriterProperties = new OASOrgApacheSlingCommonsLogLogManage();
        Map<String, String> propertyMappings = orgApacheSlingCommonsLogLogManagerFactoryWriterProperties.getPropertyMappings();
        System.assertEquals('orgApacheSlingCommonsLogFile', propertyMappings.get('org.apache.sling.commons.log.file'));
        System.assertEquals('orgApacheSlingCommonsLogFileNumber', propertyMappings.get('org.apache.sling.commons.log.file.number'));
        System.assertEquals('orgApacheSlingCommonsLogFileSize', propertyMappings.get('org.apache.sling.commons.log.file.size'));
        System.assertEquals('orgApacheSlingCommonsLogFileBuffered', propertyMappings.get('org.apache.sling.commons.log.file.buffered'));
    }
}
