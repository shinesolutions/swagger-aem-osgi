@isTest
private class OASOrgApacheSlingModelsImplModelAdapTest {
    @isTest
    private static void equalsSameInstance() {
        OASOrgApacheSlingModelsImplModelAdap orgApacheSlingModelsImplModelAdapterFactoryProperties1 = OASOrgApacheSlingModelsImplModelAdap.getExample();
        OASOrgApacheSlingModelsImplModelAdap orgApacheSlingModelsImplModelAdapterFactoryProperties2 = orgApacheSlingModelsImplModelAdapterFactoryProperties1;
        OASOrgApacheSlingModelsImplModelAdap orgApacheSlingModelsImplModelAdapterFactoryProperties3 = new OASOrgApacheSlingModelsImplModelAdap();
        OASOrgApacheSlingModelsImplModelAdap orgApacheSlingModelsImplModelAdapterFactoryProperties4 = orgApacheSlingModelsImplModelAdapterFactoryProperties3;

        System.assert(orgApacheSlingModelsImplModelAdapterFactoryProperties1.equals(orgApacheSlingModelsImplModelAdapterFactoryProperties2));
        System.assert(orgApacheSlingModelsImplModelAdapterFactoryProperties2.equals(orgApacheSlingModelsImplModelAdapterFactoryProperties1));
        System.assert(orgApacheSlingModelsImplModelAdapterFactoryProperties1.equals(orgApacheSlingModelsImplModelAdapterFactoryProperties1));
        System.assert(orgApacheSlingModelsImplModelAdapterFactoryProperties3.equals(orgApacheSlingModelsImplModelAdapterFactoryProperties4));
        System.assert(orgApacheSlingModelsImplModelAdapterFactoryProperties4.equals(orgApacheSlingModelsImplModelAdapterFactoryProperties3));
        System.assert(orgApacheSlingModelsImplModelAdapterFactoryProperties3.equals(orgApacheSlingModelsImplModelAdapterFactoryProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOrgApacheSlingModelsImplModelAdap orgApacheSlingModelsImplModelAdapterFactoryProperties1 = OASOrgApacheSlingModelsImplModelAdap.getExample();
        OASOrgApacheSlingModelsImplModelAdap orgApacheSlingModelsImplModelAdapterFactoryProperties2 = OASOrgApacheSlingModelsImplModelAdap.getExample();
        OASOrgApacheSlingModelsImplModelAdap orgApacheSlingModelsImplModelAdapterFactoryProperties3 = new OASOrgApacheSlingModelsImplModelAdap();
        OASOrgApacheSlingModelsImplModelAdap orgApacheSlingModelsImplModelAdapterFactoryProperties4 = new OASOrgApacheSlingModelsImplModelAdap();

        System.assert(orgApacheSlingModelsImplModelAdapterFactoryProperties1.equals(orgApacheSlingModelsImplModelAdapterFactoryProperties2));
        System.assert(orgApacheSlingModelsImplModelAdapterFactoryProperties2.equals(orgApacheSlingModelsImplModelAdapterFactoryProperties1));
        System.assert(orgApacheSlingModelsImplModelAdapterFactoryProperties3.equals(orgApacheSlingModelsImplModelAdapterFactoryProperties4));
        System.assert(orgApacheSlingModelsImplModelAdapterFactoryProperties4.equals(orgApacheSlingModelsImplModelAdapterFactoryProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOrgApacheSlingModelsImplModelAdap orgApacheSlingModelsImplModelAdapterFactoryProperties1 = OASOrgApacheSlingModelsImplModelAdap.getExample();
        OASOrgApacheSlingModelsImplModelAdap orgApacheSlingModelsImplModelAdapterFactoryProperties2 = new OASOrgApacheSlingModelsImplModelAdap();

        System.assertEquals(false, orgApacheSlingModelsImplModelAdapterFactoryProperties1.equals('foo'));
        System.assertEquals(false, orgApacheSlingModelsImplModelAdapterFactoryProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOrgApacheSlingModelsImplModelAdap orgApacheSlingModelsImplModelAdapterFactoryProperties1 = OASOrgApacheSlingModelsImplModelAdap.getExample();
        OASOrgApacheSlingModelsImplModelAdap orgApacheSlingModelsImplModelAdapterFactoryProperties2 = new OASOrgApacheSlingModelsImplModelAdap();
        OASOrgApacheSlingModelsImplModelAdap orgApacheSlingModelsImplModelAdapterFactoryProperties3;

        System.assertEquals(false, orgApacheSlingModelsImplModelAdapterFactoryProperties1.equals(orgApacheSlingModelsImplModelAdapterFactoryProperties3));
        System.assertEquals(false, orgApacheSlingModelsImplModelAdapterFactoryProperties2.equals(orgApacheSlingModelsImplModelAdapterFactoryProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOrgApacheSlingModelsImplModelAdap orgApacheSlingModelsImplModelAdapterFactoryProperties1 = OASOrgApacheSlingModelsImplModelAdap.getExample();
        OASOrgApacheSlingModelsImplModelAdap orgApacheSlingModelsImplModelAdapterFactoryProperties2 = new OASOrgApacheSlingModelsImplModelAdap();

        System.assertEquals(orgApacheSlingModelsImplModelAdapterFactoryProperties1.hashCode(), orgApacheSlingModelsImplModelAdapterFactoryProperties1.hashCode());
        System.assertEquals(orgApacheSlingModelsImplModelAdapterFactoryProperties2.hashCode(), orgApacheSlingModelsImplModelAdapterFactoryProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOrgApacheSlingModelsImplModelAdap orgApacheSlingModelsImplModelAdapterFactoryProperties1 = OASOrgApacheSlingModelsImplModelAdap.getExample();
        OASOrgApacheSlingModelsImplModelAdap orgApacheSlingModelsImplModelAdapterFactoryProperties2 = OASOrgApacheSlingModelsImplModelAdap.getExample();
        OASOrgApacheSlingModelsImplModelAdap orgApacheSlingModelsImplModelAdapterFactoryProperties3 = new OASOrgApacheSlingModelsImplModelAdap();
        OASOrgApacheSlingModelsImplModelAdap orgApacheSlingModelsImplModelAdapterFactoryProperties4 = new OASOrgApacheSlingModelsImplModelAdap();

        System.assert(orgApacheSlingModelsImplModelAdapterFactoryProperties1.equals(orgApacheSlingModelsImplModelAdapterFactoryProperties2));
        System.assert(orgApacheSlingModelsImplModelAdapterFactoryProperties3.equals(orgApacheSlingModelsImplModelAdapterFactoryProperties4));
        System.assertEquals(orgApacheSlingModelsImplModelAdapterFactoryProperties1.hashCode(), orgApacheSlingModelsImplModelAdapterFactoryProperties2.hashCode());
        System.assertEquals(orgApacheSlingModelsImplModelAdapterFactoryProperties3.hashCode(), orgApacheSlingModelsImplModelAdapterFactoryProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASOrgApacheSlingModelsImplModelAdap orgApacheSlingModelsImplModelAdapterFactoryProperties = new OASOrgApacheSlingModelsImplModelAdap();
        Map<String, String> propertyMappings = orgApacheSlingModelsImplModelAdapterFactoryProperties.getPropertyMappings();
        System.assertEquals('osgiHttpWhiteboardListener', propertyMappings.get('osgi.http.whiteboard.listener'));
        System.assertEquals('osgiHttpWhiteboardContextSelect', propertyMappings.get('osgi.http.whiteboard.context.select'));
        System.assertEquals('maxRecursionDepth', propertyMappings.get('max.recursion.depth'));
        System.assertEquals('cleanupJobPeriod', propertyMappings.get('cleanup.job.period'));
    }
}
