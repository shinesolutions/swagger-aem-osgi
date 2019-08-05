@isTest
private class OASOrgApacheSlingEngineImplSlingMainTest {
    @isTest
    private static void equalsSameInstance() {
        OASOrgApacheSlingEngineImplSlingMain orgApacheSlingEngineImplSlingMainServletProperties1 = OASOrgApacheSlingEngineImplSlingMain.getExample();
        OASOrgApacheSlingEngineImplSlingMain orgApacheSlingEngineImplSlingMainServletProperties2 = orgApacheSlingEngineImplSlingMainServletProperties1;
        OASOrgApacheSlingEngineImplSlingMain orgApacheSlingEngineImplSlingMainServletProperties3 = new OASOrgApacheSlingEngineImplSlingMain();
        OASOrgApacheSlingEngineImplSlingMain orgApacheSlingEngineImplSlingMainServletProperties4 = orgApacheSlingEngineImplSlingMainServletProperties3;

        System.assert(orgApacheSlingEngineImplSlingMainServletProperties1.equals(orgApacheSlingEngineImplSlingMainServletProperties2));
        System.assert(orgApacheSlingEngineImplSlingMainServletProperties2.equals(orgApacheSlingEngineImplSlingMainServletProperties1));
        System.assert(orgApacheSlingEngineImplSlingMainServletProperties1.equals(orgApacheSlingEngineImplSlingMainServletProperties1));
        System.assert(orgApacheSlingEngineImplSlingMainServletProperties3.equals(orgApacheSlingEngineImplSlingMainServletProperties4));
        System.assert(orgApacheSlingEngineImplSlingMainServletProperties4.equals(orgApacheSlingEngineImplSlingMainServletProperties3));
        System.assert(orgApacheSlingEngineImplSlingMainServletProperties3.equals(orgApacheSlingEngineImplSlingMainServletProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOrgApacheSlingEngineImplSlingMain orgApacheSlingEngineImplSlingMainServletProperties1 = OASOrgApacheSlingEngineImplSlingMain.getExample();
        OASOrgApacheSlingEngineImplSlingMain orgApacheSlingEngineImplSlingMainServletProperties2 = OASOrgApacheSlingEngineImplSlingMain.getExample();
        OASOrgApacheSlingEngineImplSlingMain orgApacheSlingEngineImplSlingMainServletProperties3 = new OASOrgApacheSlingEngineImplSlingMain();
        OASOrgApacheSlingEngineImplSlingMain orgApacheSlingEngineImplSlingMainServletProperties4 = new OASOrgApacheSlingEngineImplSlingMain();

        System.assert(orgApacheSlingEngineImplSlingMainServletProperties1.equals(orgApacheSlingEngineImplSlingMainServletProperties2));
        System.assert(orgApacheSlingEngineImplSlingMainServletProperties2.equals(orgApacheSlingEngineImplSlingMainServletProperties1));
        System.assert(orgApacheSlingEngineImplSlingMainServletProperties3.equals(orgApacheSlingEngineImplSlingMainServletProperties4));
        System.assert(orgApacheSlingEngineImplSlingMainServletProperties4.equals(orgApacheSlingEngineImplSlingMainServletProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOrgApacheSlingEngineImplSlingMain orgApacheSlingEngineImplSlingMainServletProperties1 = OASOrgApacheSlingEngineImplSlingMain.getExample();
        OASOrgApacheSlingEngineImplSlingMain orgApacheSlingEngineImplSlingMainServletProperties2 = new OASOrgApacheSlingEngineImplSlingMain();

        System.assertEquals(false, orgApacheSlingEngineImplSlingMainServletProperties1.equals('foo'));
        System.assertEquals(false, orgApacheSlingEngineImplSlingMainServletProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOrgApacheSlingEngineImplSlingMain orgApacheSlingEngineImplSlingMainServletProperties1 = OASOrgApacheSlingEngineImplSlingMain.getExample();
        OASOrgApacheSlingEngineImplSlingMain orgApacheSlingEngineImplSlingMainServletProperties2 = new OASOrgApacheSlingEngineImplSlingMain();
        OASOrgApacheSlingEngineImplSlingMain orgApacheSlingEngineImplSlingMainServletProperties3;

        System.assertEquals(false, orgApacheSlingEngineImplSlingMainServletProperties1.equals(orgApacheSlingEngineImplSlingMainServletProperties3));
        System.assertEquals(false, orgApacheSlingEngineImplSlingMainServletProperties2.equals(orgApacheSlingEngineImplSlingMainServletProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOrgApacheSlingEngineImplSlingMain orgApacheSlingEngineImplSlingMainServletProperties1 = OASOrgApacheSlingEngineImplSlingMain.getExample();
        OASOrgApacheSlingEngineImplSlingMain orgApacheSlingEngineImplSlingMainServletProperties2 = new OASOrgApacheSlingEngineImplSlingMain();

        System.assertEquals(orgApacheSlingEngineImplSlingMainServletProperties1.hashCode(), orgApacheSlingEngineImplSlingMainServletProperties1.hashCode());
        System.assertEquals(orgApacheSlingEngineImplSlingMainServletProperties2.hashCode(), orgApacheSlingEngineImplSlingMainServletProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOrgApacheSlingEngineImplSlingMain orgApacheSlingEngineImplSlingMainServletProperties1 = OASOrgApacheSlingEngineImplSlingMain.getExample();
        OASOrgApacheSlingEngineImplSlingMain orgApacheSlingEngineImplSlingMainServletProperties2 = OASOrgApacheSlingEngineImplSlingMain.getExample();
        OASOrgApacheSlingEngineImplSlingMain orgApacheSlingEngineImplSlingMainServletProperties3 = new OASOrgApacheSlingEngineImplSlingMain();
        OASOrgApacheSlingEngineImplSlingMain orgApacheSlingEngineImplSlingMainServletProperties4 = new OASOrgApacheSlingEngineImplSlingMain();

        System.assert(orgApacheSlingEngineImplSlingMainServletProperties1.equals(orgApacheSlingEngineImplSlingMainServletProperties2));
        System.assert(orgApacheSlingEngineImplSlingMainServletProperties3.equals(orgApacheSlingEngineImplSlingMainServletProperties4));
        System.assertEquals(orgApacheSlingEngineImplSlingMainServletProperties1.hashCode(), orgApacheSlingEngineImplSlingMainServletProperties2.hashCode());
        System.assertEquals(orgApacheSlingEngineImplSlingMainServletProperties3.hashCode(), orgApacheSlingEngineImplSlingMainServletProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASOrgApacheSlingEngineImplSlingMain orgApacheSlingEngineImplSlingMainServletProperties = new OASOrgApacheSlingEngineImplSlingMain();
        Map<String, String> propertyMappings = orgApacheSlingEngineImplSlingMainServletProperties.getPropertyMappings();
        System.assertEquals('slingMaxCalls', propertyMappings.get('sling.max.calls'));
        System.assertEquals('slingMaxInclusions', propertyMappings.get('sling.max.inclusions'));
        System.assertEquals('slingTraceAllow', propertyMappings.get('sling.trace.allow'));
        System.assertEquals('slingMaxRecordRequests', propertyMappings.get('sling.max.record.requests'));
        System.assertEquals('slingStorePatternRequests', propertyMappings.get('sling.store.pattern.requests'));
        System.assertEquals('slingServerinfo', propertyMappings.get('sling.serverinfo'));
        System.assertEquals('slingAdditionalResponseHeaders', propertyMappings.get('sling.additional.response.headers'));
    }
}
