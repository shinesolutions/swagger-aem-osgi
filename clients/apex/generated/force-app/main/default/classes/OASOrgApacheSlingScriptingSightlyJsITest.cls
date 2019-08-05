@isTest
private class OASOrgApacheSlingScriptingSightlyJsITest {
    @isTest
    private static void equalsSameInstance() {
        OASOrgApacheSlingScriptingSightlyJsI orgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties1 = OASOrgApacheSlingScriptingSightlyJsI.getExample();
        OASOrgApacheSlingScriptingSightlyJsI orgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties2 = orgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties1;
        OASOrgApacheSlingScriptingSightlyJsI orgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties3 = new OASOrgApacheSlingScriptingSightlyJsI();
        OASOrgApacheSlingScriptingSightlyJsI orgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties4 = orgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties3;

        System.assert(orgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties1.equals(orgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties2));
        System.assert(orgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties2.equals(orgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties1));
        System.assert(orgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties1.equals(orgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties1));
        System.assert(orgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties3.equals(orgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties4));
        System.assert(orgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties4.equals(orgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties3));
        System.assert(orgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties3.equals(orgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOrgApacheSlingScriptingSightlyJsI orgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties1 = OASOrgApacheSlingScriptingSightlyJsI.getExample();
        OASOrgApacheSlingScriptingSightlyJsI orgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties2 = OASOrgApacheSlingScriptingSightlyJsI.getExample();
        OASOrgApacheSlingScriptingSightlyJsI orgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties3 = new OASOrgApacheSlingScriptingSightlyJsI();
        OASOrgApacheSlingScriptingSightlyJsI orgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties4 = new OASOrgApacheSlingScriptingSightlyJsI();

        System.assert(orgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties1.equals(orgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties2));
        System.assert(orgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties2.equals(orgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties1));
        System.assert(orgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties3.equals(orgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties4));
        System.assert(orgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties4.equals(orgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOrgApacheSlingScriptingSightlyJsI orgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties1 = OASOrgApacheSlingScriptingSightlyJsI.getExample();
        OASOrgApacheSlingScriptingSightlyJsI orgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties2 = new OASOrgApacheSlingScriptingSightlyJsI();

        System.assertEquals(false, orgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties1.equals('foo'));
        System.assertEquals(false, orgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOrgApacheSlingScriptingSightlyJsI orgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties1 = OASOrgApacheSlingScriptingSightlyJsI.getExample();
        OASOrgApacheSlingScriptingSightlyJsI orgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties2 = new OASOrgApacheSlingScriptingSightlyJsI();
        OASOrgApacheSlingScriptingSightlyJsI orgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties3;

        System.assertEquals(false, orgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties1.equals(orgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties3));
        System.assertEquals(false, orgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties2.equals(orgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOrgApacheSlingScriptingSightlyJsI orgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties1 = OASOrgApacheSlingScriptingSightlyJsI.getExample();
        OASOrgApacheSlingScriptingSightlyJsI orgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties2 = new OASOrgApacheSlingScriptingSightlyJsI();

        System.assertEquals(orgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties1.hashCode(), orgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties1.hashCode());
        System.assertEquals(orgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties2.hashCode(), orgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOrgApacheSlingScriptingSightlyJsI orgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties1 = OASOrgApacheSlingScriptingSightlyJsI.getExample();
        OASOrgApacheSlingScriptingSightlyJsI orgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties2 = OASOrgApacheSlingScriptingSightlyJsI.getExample();
        OASOrgApacheSlingScriptingSightlyJsI orgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties3 = new OASOrgApacheSlingScriptingSightlyJsI();
        OASOrgApacheSlingScriptingSightlyJsI orgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties4 = new OASOrgApacheSlingScriptingSightlyJsI();

        System.assert(orgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties1.equals(orgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties2));
        System.assert(orgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties3.equals(orgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties4));
        System.assertEquals(orgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties1.hashCode(), orgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties2.hashCode());
        System.assertEquals(orgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties3.hashCode(), orgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASOrgApacheSlingScriptingSightlyJsI orgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties = new OASOrgApacheSlingScriptingSightlyJsI();
        Map<String, String> propertyMappings = orgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties.getPropertyMappings();
        System.assertEquals('orgApacheSlingScriptingSightlyJsBindings', propertyMappings.get('org.apache.sling.scripting.sightly.js.bindings'));
    }
}
