@isTest
private class OASOrgApacheSlingScriptingJspJspScriTest {
    @isTest
    private static void equalsSameInstance() {
        OASOrgApacheSlingScriptingJspJspScri orgApacheSlingScriptingJspJspScriptEngineFactoryProperties1 = OASOrgApacheSlingScriptingJspJspScri.getExample();
        OASOrgApacheSlingScriptingJspJspScri orgApacheSlingScriptingJspJspScriptEngineFactoryProperties2 = orgApacheSlingScriptingJspJspScriptEngineFactoryProperties1;
        OASOrgApacheSlingScriptingJspJspScri orgApacheSlingScriptingJspJspScriptEngineFactoryProperties3 = new OASOrgApacheSlingScriptingJspJspScri();
        OASOrgApacheSlingScriptingJspJspScri orgApacheSlingScriptingJspJspScriptEngineFactoryProperties4 = orgApacheSlingScriptingJspJspScriptEngineFactoryProperties3;

        System.assert(orgApacheSlingScriptingJspJspScriptEngineFactoryProperties1.equals(orgApacheSlingScriptingJspJspScriptEngineFactoryProperties2));
        System.assert(orgApacheSlingScriptingJspJspScriptEngineFactoryProperties2.equals(orgApacheSlingScriptingJspJspScriptEngineFactoryProperties1));
        System.assert(orgApacheSlingScriptingJspJspScriptEngineFactoryProperties1.equals(orgApacheSlingScriptingJspJspScriptEngineFactoryProperties1));
        System.assert(orgApacheSlingScriptingJspJspScriptEngineFactoryProperties3.equals(orgApacheSlingScriptingJspJspScriptEngineFactoryProperties4));
        System.assert(orgApacheSlingScriptingJspJspScriptEngineFactoryProperties4.equals(orgApacheSlingScriptingJspJspScriptEngineFactoryProperties3));
        System.assert(orgApacheSlingScriptingJspJspScriptEngineFactoryProperties3.equals(orgApacheSlingScriptingJspJspScriptEngineFactoryProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOrgApacheSlingScriptingJspJspScri orgApacheSlingScriptingJspJspScriptEngineFactoryProperties1 = OASOrgApacheSlingScriptingJspJspScri.getExample();
        OASOrgApacheSlingScriptingJspJspScri orgApacheSlingScriptingJspJspScriptEngineFactoryProperties2 = OASOrgApacheSlingScriptingJspJspScri.getExample();
        OASOrgApacheSlingScriptingJspJspScri orgApacheSlingScriptingJspJspScriptEngineFactoryProperties3 = new OASOrgApacheSlingScriptingJspJspScri();
        OASOrgApacheSlingScriptingJspJspScri orgApacheSlingScriptingJspJspScriptEngineFactoryProperties4 = new OASOrgApacheSlingScriptingJspJspScri();

        System.assert(orgApacheSlingScriptingJspJspScriptEngineFactoryProperties1.equals(orgApacheSlingScriptingJspJspScriptEngineFactoryProperties2));
        System.assert(orgApacheSlingScriptingJspJspScriptEngineFactoryProperties2.equals(orgApacheSlingScriptingJspJspScriptEngineFactoryProperties1));
        System.assert(orgApacheSlingScriptingJspJspScriptEngineFactoryProperties3.equals(orgApacheSlingScriptingJspJspScriptEngineFactoryProperties4));
        System.assert(orgApacheSlingScriptingJspJspScriptEngineFactoryProperties4.equals(orgApacheSlingScriptingJspJspScriptEngineFactoryProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOrgApacheSlingScriptingJspJspScri orgApacheSlingScriptingJspJspScriptEngineFactoryProperties1 = OASOrgApacheSlingScriptingJspJspScri.getExample();
        OASOrgApacheSlingScriptingJspJspScri orgApacheSlingScriptingJspJspScriptEngineFactoryProperties2 = new OASOrgApacheSlingScriptingJspJspScri();

        System.assertEquals(false, orgApacheSlingScriptingJspJspScriptEngineFactoryProperties1.equals('foo'));
        System.assertEquals(false, orgApacheSlingScriptingJspJspScriptEngineFactoryProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOrgApacheSlingScriptingJspJspScri orgApacheSlingScriptingJspJspScriptEngineFactoryProperties1 = OASOrgApacheSlingScriptingJspJspScri.getExample();
        OASOrgApacheSlingScriptingJspJspScri orgApacheSlingScriptingJspJspScriptEngineFactoryProperties2 = new OASOrgApacheSlingScriptingJspJspScri();
        OASOrgApacheSlingScriptingJspJspScri orgApacheSlingScriptingJspJspScriptEngineFactoryProperties3;

        System.assertEquals(false, orgApacheSlingScriptingJspJspScriptEngineFactoryProperties1.equals(orgApacheSlingScriptingJspJspScriptEngineFactoryProperties3));
        System.assertEquals(false, orgApacheSlingScriptingJspJspScriptEngineFactoryProperties2.equals(orgApacheSlingScriptingJspJspScriptEngineFactoryProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOrgApacheSlingScriptingJspJspScri orgApacheSlingScriptingJspJspScriptEngineFactoryProperties1 = OASOrgApacheSlingScriptingJspJspScri.getExample();
        OASOrgApacheSlingScriptingJspJspScri orgApacheSlingScriptingJspJspScriptEngineFactoryProperties2 = new OASOrgApacheSlingScriptingJspJspScri();

        System.assertEquals(orgApacheSlingScriptingJspJspScriptEngineFactoryProperties1.hashCode(), orgApacheSlingScriptingJspJspScriptEngineFactoryProperties1.hashCode());
        System.assertEquals(orgApacheSlingScriptingJspJspScriptEngineFactoryProperties2.hashCode(), orgApacheSlingScriptingJspJspScriptEngineFactoryProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOrgApacheSlingScriptingJspJspScri orgApacheSlingScriptingJspJspScriptEngineFactoryProperties1 = OASOrgApacheSlingScriptingJspJspScri.getExample();
        OASOrgApacheSlingScriptingJspJspScri orgApacheSlingScriptingJspJspScriptEngineFactoryProperties2 = OASOrgApacheSlingScriptingJspJspScri.getExample();
        OASOrgApacheSlingScriptingJspJspScri orgApacheSlingScriptingJspJspScriptEngineFactoryProperties3 = new OASOrgApacheSlingScriptingJspJspScri();
        OASOrgApacheSlingScriptingJspJspScri orgApacheSlingScriptingJspJspScriptEngineFactoryProperties4 = new OASOrgApacheSlingScriptingJspJspScri();

        System.assert(orgApacheSlingScriptingJspJspScriptEngineFactoryProperties1.equals(orgApacheSlingScriptingJspJspScriptEngineFactoryProperties2));
        System.assert(orgApacheSlingScriptingJspJspScriptEngineFactoryProperties3.equals(orgApacheSlingScriptingJspJspScriptEngineFactoryProperties4));
        System.assertEquals(orgApacheSlingScriptingJspJspScriptEngineFactoryProperties1.hashCode(), orgApacheSlingScriptingJspJspScriptEngineFactoryProperties2.hashCode());
        System.assertEquals(orgApacheSlingScriptingJspJspScriptEngineFactoryProperties3.hashCode(), orgApacheSlingScriptingJspJspScriptEngineFactoryProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASOrgApacheSlingScriptingJspJspScri orgApacheSlingScriptingJspJspScriptEngineFactoryProperties = new OASOrgApacheSlingScriptingJspJspScri();
        Map<String, String> x-property-mappings = orgApacheSlingScriptingJspJspScriptEngineFactoryProperties.getx-property-mappings();
        System.assertEquals('jasperCompilerTargetVM', x-property-mappings.get('jasper.compilerTargetVM'));
        System.assertEquals('jasperCompilerSourceVM', x-property-mappings.get('jasper.compilerSourceVM'));
        System.assertEquals('jasperClassdebuginfo', x-property-mappings.get('jasper.classdebuginfo'));
        System.assertEquals('jasperEnablePooling', x-property-mappings.get('jasper.enablePooling'));
        System.assertEquals('jasperIeClassId', x-property-mappings.get('jasper.ieClassId'));
        System.assertEquals('jasperGenStringAsCharArray', x-property-mappings.get('jasper.genStringAsCharArray'));
        System.assertEquals('jasperKeepgenerated', x-property-mappings.get('jasper.keepgenerated'));
        System.assertEquals('jasperMappedfile', x-property-mappings.get('jasper.mappedfile'));
        System.assertEquals('jasperTrimSpaces', x-property-mappings.get('jasper.trimSpaces'));
        System.assertEquals('jasperDisplaySourceFragments', x-property-mappings.get('jasper.displaySourceFragments'));
        System.assertEquals('defaultIsSession', x-property-mappings.get('default.is.session'));
    }
}
