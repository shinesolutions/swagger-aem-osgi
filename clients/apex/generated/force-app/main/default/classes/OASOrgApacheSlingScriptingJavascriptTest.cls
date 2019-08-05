@isTest
private class OASOrgApacheSlingScriptingJavascriptTest {
    @isTest
    private static void equalsSameInstance() {
        OASOrgApacheSlingScriptingJavascript orgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties1 = OASOrgApacheSlingScriptingJavascript.getExample();
        OASOrgApacheSlingScriptingJavascript orgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties2 = orgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties1;
        OASOrgApacheSlingScriptingJavascript orgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties3 = new OASOrgApacheSlingScriptingJavascript();
        OASOrgApacheSlingScriptingJavascript orgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties4 = orgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties3;

        System.assert(orgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties1.equals(orgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties2));
        System.assert(orgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties2.equals(orgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties1));
        System.assert(orgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties1.equals(orgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties1));
        System.assert(orgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties3.equals(orgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties4));
        System.assert(orgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties4.equals(orgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties3));
        System.assert(orgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties3.equals(orgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOrgApacheSlingScriptingJavascript orgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties1 = OASOrgApacheSlingScriptingJavascript.getExample();
        OASOrgApacheSlingScriptingJavascript orgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties2 = OASOrgApacheSlingScriptingJavascript.getExample();
        OASOrgApacheSlingScriptingJavascript orgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties3 = new OASOrgApacheSlingScriptingJavascript();
        OASOrgApacheSlingScriptingJavascript orgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties4 = new OASOrgApacheSlingScriptingJavascript();

        System.assert(orgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties1.equals(orgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties2));
        System.assert(orgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties2.equals(orgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties1));
        System.assert(orgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties3.equals(orgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties4));
        System.assert(orgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties4.equals(orgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOrgApacheSlingScriptingJavascript orgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties1 = OASOrgApacheSlingScriptingJavascript.getExample();
        OASOrgApacheSlingScriptingJavascript orgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties2 = new OASOrgApacheSlingScriptingJavascript();

        System.assertEquals(false, orgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties1.equals('foo'));
        System.assertEquals(false, orgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOrgApacheSlingScriptingJavascript orgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties1 = OASOrgApacheSlingScriptingJavascript.getExample();
        OASOrgApacheSlingScriptingJavascript orgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties2 = new OASOrgApacheSlingScriptingJavascript();
        OASOrgApacheSlingScriptingJavascript orgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties3;

        System.assertEquals(false, orgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties1.equals(orgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties3));
        System.assertEquals(false, orgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties2.equals(orgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOrgApacheSlingScriptingJavascript orgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties1 = OASOrgApacheSlingScriptingJavascript.getExample();
        OASOrgApacheSlingScriptingJavascript orgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties2 = new OASOrgApacheSlingScriptingJavascript();

        System.assertEquals(orgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties1.hashCode(), orgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties1.hashCode());
        System.assertEquals(orgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties2.hashCode(), orgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOrgApacheSlingScriptingJavascript orgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties1 = OASOrgApacheSlingScriptingJavascript.getExample();
        OASOrgApacheSlingScriptingJavascript orgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties2 = OASOrgApacheSlingScriptingJavascript.getExample();
        OASOrgApacheSlingScriptingJavascript orgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties3 = new OASOrgApacheSlingScriptingJavascript();
        OASOrgApacheSlingScriptingJavascript orgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties4 = new OASOrgApacheSlingScriptingJavascript();

        System.assert(orgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties1.equals(orgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties2));
        System.assert(orgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties3.equals(orgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties4));
        System.assertEquals(orgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties1.hashCode(), orgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties2.hashCode());
        System.assertEquals(orgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties3.hashCode(), orgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASOrgApacheSlingScriptingJavascript orgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties = new OASOrgApacheSlingScriptingJavascript();
        Map<String, String> propertyMappings = orgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties.getPropertyMappings();
        System.assertEquals('orgApacheSlingScriptingJavascriptRhinoOptLevel', propertyMappings.get('org.apache.sling.scripting.javascript.rhino.optLevel'));
    }
}
