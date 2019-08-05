@isTest
private class OASOrgApacheSlingScriptingJavaImplJaTest {
    @isTest
    private static void equalsSameInstance() {
        OASOrgApacheSlingScriptingJavaImplJa orgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties1 = OASOrgApacheSlingScriptingJavaImplJa.getExample();
        OASOrgApacheSlingScriptingJavaImplJa orgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties2 = orgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties1;
        OASOrgApacheSlingScriptingJavaImplJa orgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties3 = new OASOrgApacheSlingScriptingJavaImplJa();
        OASOrgApacheSlingScriptingJavaImplJa orgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties4 = orgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties3;

        System.assert(orgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties1.equals(orgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties2));
        System.assert(orgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties2.equals(orgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties1));
        System.assert(orgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties1.equals(orgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties1));
        System.assert(orgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties3.equals(orgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties4));
        System.assert(orgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties4.equals(orgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties3));
        System.assert(orgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties3.equals(orgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOrgApacheSlingScriptingJavaImplJa orgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties1 = OASOrgApacheSlingScriptingJavaImplJa.getExample();
        OASOrgApacheSlingScriptingJavaImplJa orgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties2 = OASOrgApacheSlingScriptingJavaImplJa.getExample();
        OASOrgApacheSlingScriptingJavaImplJa orgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties3 = new OASOrgApacheSlingScriptingJavaImplJa();
        OASOrgApacheSlingScriptingJavaImplJa orgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties4 = new OASOrgApacheSlingScriptingJavaImplJa();

        System.assert(orgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties1.equals(orgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties2));
        System.assert(orgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties2.equals(orgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties1));
        System.assert(orgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties3.equals(orgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties4));
        System.assert(orgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties4.equals(orgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOrgApacheSlingScriptingJavaImplJa orgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties1 = OASOrgApacheSlingScriptingJavaImplJa.getExample();
        OASOrgApacheSlingScriptingJavaImplJa orgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties2 = new OASOrgApacheSlingScriptingJavaImplJa();

        System.assertEquals(false, orgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties1.equals('foo'));
        System.assertEquals(false, orgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOrgApacheSlingScriptingJavaImplJa orgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties1 = OASOrgApacheSlingScriptingJavaImplJa.getExample();
        OASOrgApacheSlingScriptingJavaImplJa orgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties2 = new OASOrgApacheSlingScriptingJavaImplJa();
        OASOrgApacheSlingScriptingJavaImplJa orgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties3;

        System.assertEquals(false, orgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties1.equals(orgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties3));
        System.assertEquals(false, orgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties2.equals(orgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOrgApacheSlingScriptingJavaImplJa orgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties1 = OASOrgApacheSlingScriptingJavaImplJa.getExample();
        OASOrgApacheSlingScriptingJavaImplJa orgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties2 = new OASOrgApacheSlingScriptingJavaImplJa();

        System.assertEquals(orgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties1.hashCode(), orgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties1.hashCode());
        System.assertEquals(orgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties2.hashCode(), orgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOrgApacheSlingScriptingJavaImplJa orgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties1 = OASOrgApacheSlingScriptingJavaImplJa.getExample();
        OASOrgApacheSlingScriptingJavaImplJa orgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties2 = OASOrgApacheSlingScriptingJavaImplJa.getExample();
        OASOrgApacheSlingScriptingJavaImplJa orgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties3 = new OASOrgApacheSlingScriptingJavaImplJa();
        OASOrgApacheSlingScriptingJavaImplJa orgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties4 = new OASOrgApacheSlingScriptingJavaImplJa();

        System.assert(orgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties1.equals(orgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties2));
        System.assert(orgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties3.equals(orgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties4));
        System.assertEquals(orgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties1.hashCode(), orgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties2.hashCode());
        System.assertEquals(orgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties3.hashCode(), orgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASOrgApacheSlingScriptingJavaImplJa orgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties = new OASOrgApacheSlingScriptingJavaImplJa();
        Map<String, String> propertyMappings = orgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties.getPropertyMappings();
        System.assertEquals('javaClassdebuginfo', propertyMappings.get('java.classdebuginfo'));
        System.assertEquals('javaJavaEncoding', propertyMappings.get('java.javaEncoding'));
        System.assertEquals('javaCompilerSourceVM', propertyMappings.get('java.compilerSourceVM'));
        System.assertEquals('javaCompilerTargetVM', propertyMappings.get('java.compilerTargetVM'));
    }
}
