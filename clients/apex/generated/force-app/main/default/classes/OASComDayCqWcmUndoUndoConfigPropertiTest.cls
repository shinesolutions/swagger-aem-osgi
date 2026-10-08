@isTest
private class OASComDayCqWcmUndoUndoConfigPropertiTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqWcmUndoUndoConfigProperti comDayCqWcmUndoUndoConfigProperties1 = OASComDayCqWcmUndoUndoConfigProperti.getExample();
        OASComDayCqWcmUndoUndoConfigProperti comDayCqWcmUndoUndoConfigProperties2 = comDayCqWcmUndoUndoConfigProperties1;
        OASComDayCqWcmUndoUndoConfigProperti comDayCqWcmUndoUndoConfigProperties3 = new OASComDayCqWcmUndoUndoConfigProperti();
        OASComDayCqWcmUndoUndoConfigProperti comDayCqWcmUndoUndoConfigProperties4 = comDayCqWcmUndoUndoConfigProperties3;

        System.assert(comDayCqWcmUndoUndoConfigProperties1.equals(comDayCqWcmUndoUndoConfigProperties2));
        System.assert(comDayCqWcmUndoUndoConfigProperties2.equals(comDayCqWcmUndoUndoConfigProperties1));
        System.assert(comDayCqWcmUndoUndoConfigProperties1.equals(comDayCqWcmUndoUndoConfigProperties1));
        System.assert(comDayCqWcmUndoUndoConfigProperties3.equals(comDayCqWcmUndoUndoConfigProperties4));
        System.assert(comDayCqWcmUndoUndoConfigProperties4.equals(comDayCqWcmUndoUndoConfigProperties3));
        System.assert(comDayCqWcmUndoUndoConfigProperties3.equals(comDayCqWcmUndoUndoConfigProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqWcmUndoUndoConfigProperti comDayCqWcmUndoUndoConfigProperties1 = OASComDayCqWcmUndoUndoConfigProperti.getExample();
        OASComDayCqWcmUndoUndoConfigProperti comDayCqWcmUndoUndoConfigProperties2 = OASComDayCqWcmUndoUndoConfigProperti.getExample();
        OASComDayCqWcmUndoUndoConfigProperti comDayCqWcmUndoUndoConfigProperties3 = new OASComDayCqWcmUndoUndoConfigProperti();
        OASComDayCqWcmUndoUndoConfigProperti comDayCqWcmUndoUndoConfigProperties4 = new OASComDayCqWcmUndoUndoConfigProperti();

        System.assert(comDayCqWcmUndoUndoConfigProperties1.equals(comDayCqWcmUndoUndoConfigProperties2));
        System.assert(comDayCqWcmUndoUndoConfigProperties2.equals(comDayCqWcmUndoUndoConfigProperties1));
        System.assert(comDayCqWcmUndoUndoConfigProperties3.equals(comDayCqWcmUndoUndoConfigProperties4));
        System.assert(comDayCqWcmUndoUndoConfigProperties4.equals(comDayCqWcmUndoUndoConfigProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqWcmUndoUndoConfigProperti comDayCqWcmUndoUndoConfigProperties1 = OASComDayCqWcmUndoUndoConfigProperti.getExample();
        OASComDayCqWcmUndoUndoConfigProperti comDayCqWcmUndoUndoConfigProperties2 = new OASComDayCqWcmUndoUndoConfigProperti();

        System.assertEquals(false, comDayCqWcmUndoUndoConfigProperties1.equals('foo'));
        System.assertEquals(false, comDayCqWcmUndoUndoConfigProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqWcmUndoUndoConfigProperti comDayCqWcmUndoUndoConfigProperties1 = OASComDayCqWcmUndoUndoConfigProperti.getExample();
        OASComDayCqWcmUndoUndoConfigProperti comDayCqWcmUndoUndoConfigProperties2 = new OASComDayCqWcmUndoUndoConfigProperti();
        OASComDayCqWcmUndoUndoConfigProperti comDayCqWcmUndoUndoConfigProperties3;

        System.assertEquals(false, comDayCqWcmUndoUndoConfigProperties1.equals(comDayCqWcmUndoUndoConfigProperties3));
        System.assertEquals(false, comDayCqWcmUndoUndoConfigProperties2.equals(comDayCqWcmUndoUndoConfigProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqWcmUndoUndoConfigProperti comDayCqWcmUndoUndoConfigProperties1 = OASComDayCqWcmUndoUndoConfigProperti.getExample();
        OASComDayCqWcmUndoUndoConfigProperti comDayCqWcmUndoUndoConfigProperties2 = new OASComDayCqWcmUndoUndoConfigProperti();

        System.assertEquals(comDayCqWcmUndoUndoConfigProperties1.hashCode(), comDayCqWcmUndoUndoConfigProperties1.hashCode());
        System.assertEquals(comDayCqWcmUndoUndoConfigProperties2.hashCode(), comDayCqWcmUndoUndoConfigProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqWcmUndoUndoConfigProperti comDayCqWcmUndoUndoConfigProperties1 = OASComDayCqWcmUndoUndoConfigProperti.getExample();
        OASComDayCqWcmUndoUndoConfigProperti comDayCqWcmUndoUndoConfigProperties2 = OASComDayCqWcmUndoUndoConfigProperti.getExample();
        OASComDayCqWcmUndoUndoConfigProperti comDayCqWcmUndoUndoConfigProperties3 = new OASComDayCqWcmUndoUndoConfigProperti();
        OASComDayCqWcmUndoUndoConfigProperti comDayCqWcmUndoUndoConfigProperties4 = new OASComDayCqWcmUndoUndoConfigProperti();

        System.assert(comDayCqWcmUndoUndoConfigProperties1.equals(comDayCqWcmUndoUndoConfigProperties2));
        System.assert(comDayCqWcmUndoUndoConfigProperties3.equals(comDayCqWcmUndoUndoConfigProperties4));
        System.assertEquals(comDayCqWcmUndoUndoConfigProperties1.hashCode(), comDayCqWcmUndoUndoConfigProperties2.hashCode());
        System.assertEquals(comDayCqWcmUndoUndoConfigProperties3.hashCode(), comDayCqWcmUndoUndoConfigProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComDayCqWcmUndoUndoConfigProperti comDayCqWcmUndoUndoConfigProperties = new OASComDayCqWcmUndoUndoConfigProperti();
        Map<String, String> x-property-mappings = comDayCqWcmUndoUndoConfigProperties.getx-property-mappings();
        System.assertEquals('cqWcmUndoEnabled', x-property-mappings.get('cq.wcm.undo.enabled'));
        System.assertEquals('cqWcmUndoPath', x-property-mappings.get('cq.wcm.undo.path'));
        System.assertEquals('cqWcmUndoValidity', x-property-mappings.get('cq.wcm.undo.validity'));
        System.assertEquals('cqWcmUndoSteps', x-property-mappings.get('cq.wcm.undo.steps'));
        System.assertEquals('cqWcmUndoPersistence', x-property-mappings.get('cq.wcm.undo.persistence'));
        System.assertEquals('cqWcmUndoPersistenceMode', x-property-mappings.get('cq.wcm.undo.persistence.mode'));
        System.assertEquals('cqWcmUndoMarkermode', x-property-mappings.get('cq.wcm.undo.markermode'));
        System.assertEquals('cqWcmUndoWhitelist', x-property-mappings.get('cq.wcm.undo.whitelist'));
        System.assertEquals('cqWcmUndoBlacklist', x-property-mappings.get('cq.wcm.undo.blacklist'));
    }
}
