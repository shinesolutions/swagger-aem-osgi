@isTest
private class OASComDayCqDamCoreImplMetadataEditorTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqDamCoreImplMetadataEditor comDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties1 = OASComDayCqDamCoreImplMetadataEditor.getExample();
        OASComDayCqDamCoreImplMetadataEditor comDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties2 = comDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties1;
        OASComDayCqDamCoreImplMetadataEditor comDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties3 = new OASComDayCqDamCoreImplMetadataEditor();
        OASComDayCqDamCoreImplMetadataEditor comDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties4 = comDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties3;

        System.assert(comDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties1.equals(comDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties2));
        System.assert(comDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties2.equals(comDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties1));
        System.assert(comDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties1.equals(comDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties1));
        System.assert(comDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties3.equals(comDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties4));
        System.assert(comDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties4.equals(comDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties3));
        System.assert(comDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties3.equals(comDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqDamCoreImplMetadataEditor comDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties1 = OASComDayCqDamCoreImplMetadataEditor.getExample();
        OASComDayCqDamCoreImplMetadataEditor comDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties2 = OASComDayCqDamCoreImplMetadataEditor.getExample();
        OASComDayCqDamCoreImplMetadataEditor comDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties3 = new OASComDayCqDamCoreImplMetadataEditor();
        OASComDayCqDamCoreImplMetadataEditor comDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties4 = new OASComDayCqDamCoreImplMetadataEditor();

        System.assert(comDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties1.equals(comDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties2));
        System.assert(comDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties2.equals(comDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties1));
        System.assert(comDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties3.equals(comDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties4));
        System.assert(comDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties4.equals(comDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqDamCoreImplMetadataEditor comDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties1 = OASComDayCqDamCoreImplMetadataEditor.getExample();
        OASComDayCqDamCoreImplMetadataEditor comDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties2 = new OASComDayCqDamCoreImplMetadataEditor();

        System.assertEquals(false, comDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties1.equals('foo'));
        System.assertEquals(false, comDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqDamCoreImplMetadataEditor comDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties1 = OASComDayCqDamCoreImplMetadataEditor.getExample();
        OASComDayCqDamCoreImplMetadataEditor comDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties2 = new OASComDayCqDamCoreImplMetadataEditor();
        OASComDayCqDamCoreImplMetadataEditor comDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties3;

        System.assertEquals(false, comDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties1.equals(comDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties3));
        System.assertEquals(false, comDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties2.equals(comDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqDamCoreImplMetadataEditor comDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties1 = OASComDayCqDamCoreImplMetadataEditor.getExample();
        OASComDayCqDamCoreImplMetadataEditor comDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties2 = new OASComDayCqDamCoreImplMetadataEditor();

        System.assertEquals(comDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties1.hashCode(), comDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties1.hashCode());
        System.assertEquals(comDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties2.hashCode(), comDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqDamCoreImplMetadataEditor comDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties1 = OASComDayCqDamCoreImplMetadataEditor.getExample();
        OASComDayCqDamCoreImplMetadataEditor comDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties2 = OASComDayCqDamCoreImplMetadataEditor.getExample();
        OASComDayCqDamCoreImplMetadataEditor comDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties3 = new OASComDayCqDamCoreImplMetadataEditor();
        OASComDayCqDamCoreImplMetadataEditor comDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties4 = new OASComDayCqDamCoreImplMetadataEditor();

        System.assert(comDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties1.equals(comDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties2));
        System.assert(comDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties3.equals(comDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties4));
        System.assertEquals(comDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties1.hashCode(), comDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties2.hashCode());
        System.assertEquals(comDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties3.hashCode(), comDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComDayCqDamCoreImplMetadataEditor comDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties = new OASComDayCqDamCoreImplMetadataEditor();
        Map<String, String> propertyMappings = comDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties.getPropertyMappings();
        System.assertEquals('granitedata', propertyMappings.get('granite:data'));
    }
}
