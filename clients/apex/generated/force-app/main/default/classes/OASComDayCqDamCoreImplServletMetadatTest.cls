@isTest
private class OASComDayCqDamCoreImplServletMetadatTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqDamCoreImplServletMetadat comDayCqDamCoreImplServletMetadataGetServletProperties1 = OASComDayCqDamCoreImplServletMetadat.getExample();
        OASComDayCqDamCoreImplServletMetadat comDayCqDamCoreImplServletMetadataGetServletProperties2 = comDayCqDamCoreImplServletMetadataGetServletProperties1;
        OASComDayCqDamCoreImplServletMetadat comDayCqDamCoreImplServletMetadataGetServletProperties3 = new OASComDayCqDamCoreImplServletMetadat();
        OASComDayCqDamCoreImplServletMetadat comDayCqDamCoreImplServletMetadataGetServletProperties4 = comDayCqDamCoreImplServletMetadataGetServletProperties3;

        System.assert(comDayCqDamCoreImplServletMetadataGetServletProperties1.equals(comDayCqDamCoreImplServletMetadataGetServletProperties2));
        System.assert(comDayCqDamCoreImplServletMetadataGetServletProperties2.equals(comDayCqDamCoreImplServletMetadataGetServletProperties1));
        System.assert(comDayCqDamCoreImplServletMetadataGetServletProperties1.equals(comDayCqDamCoreImplServletMetadataGetServletProperties1));
        System.assert(comDayCqDamCoreImplServletMetadataGetServletProperties3.equals(comDayCqDamCoreImplServletMetadataGetServletProperties4));
        System.assert(comDayCqDamCoreImplServletMetadataGetServletProperties4.equals(comDayCqDamCoreImplServletMetadataGetServletProperties3));
        System.assert(comDayCqDamCoreImplServletMetadataGetServletProperties3.equals(comDayCqDamCoreImplServletMetadataGetServletProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqDamCoreImplServletMetadat comDayCqDamCoreImplServletMetadataGetServletProperties1 = OASComDayCqDamCoreImplServletMetadat.getExample();
        OASComDayCqDamCoreImplServletMetadat comDayCqDamCoreImplServletMetadataGetServletProperties2 = OASComDayCqDamCoreImplServletMetadat.getExample();
        OASComDayCqDamCoreImplServletMetadat comDayCqDamCoreImplServletMetadataGetServletProperties3 = new OASComDayCqDamCoreImplServletMetadat();
        OASComDayCqDamCoreImplServletMetadat comDayCqDamCoreImplServletMetadataGetServletProperties4 = new OASComDayCqDamCoreImplServletMetadat();

        System.assert(comDayCqDamCoreImplServletMetadataGetServletProperties1.equals(comDayCqDamCoreImplServletMetadataGetServletProperties2));
        System.assert(comDayCqDamCoreImplServletMetadataGetServletProperties2.equals(comDayCqDamCoreImplServletMetadataGetServletProperties1));
        System.assert(comDayCqDamCoreImplServletMetadataGetServletProperties3.equals(comDayCqDamCoreImplServletMetadataGetServletProperties4));
        System.assert(comDayCqDamCoreImplServletMetadataGetServletProperties4.equals(comDayCqDamCoreImplServletMetadataGetServletProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqDamCoreImplServletMetadat comDayCqDamCoreImplServletMetadataGetServletProperties1 = OASComDayCqDamCoreImplServletMetadat.getExample();
        OASComDayCqDamCoreImplServletMetadat comDayCqDamCoreImplServletMetadataGetServletProperties2 = new OASComDayCqDamCoreImplServletMetadat();

        System.assertEquals(false, comDayCqDamCoreImplServletMetadataGetServletProperties1.equals('foo'));
        System.assertEquals(false, comDayCqDamCoreImplServletMetadataGetServletProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqDamCoreImplServletMetadat comDayCqDamCoreImplServletMetadataGetServletProperties1 = OASComDayCqDamCoreImplServletMetadat.getExample();
        OASComDayCqDamCoreImplServletMetadat comDayCqDamCoreImplServletMetadataGetServletProperties2 = new OASComDayCqDamCoreImplServletMetadat();
        OASComDayCqDamCoreImplServletMetadat comDayCqDamCoreImplServletMetadataGetServletProperties3;

        System.assertEquals(false, comDayCqDamCoreImplServletMetadataGetServletProperties1.equals(comDayCqDamCoreImplServletMetadataGetServletProperties3));
        System.assertEquals(false, comDayCqDamCoreImplServletMetadataGetServletProperties2.equals(comDayCqDamCoreImplServletMetadataGetServletProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqDamCoreImplServletMetadat comDayCqDamCoreImplServletMetadataGetServletProperties1 = OASComDayCqDamCoreImplServletMetadat.getExample();
        OASComDayCqDamCoreImplServletMetadat comDayCqDamCoreImplServletMetadataGetServletProperties2 = new OASComDayCqDamCoreImplServletMetadat();

        System.assertEquals(comDayCqDamCoreImplServletMetadataGetServletProperties1.hashCode(), comDayCqDamCoreImplServletMetadataGetServletProperties1.hashCode());
        System.assertEquals(comDayCqDamCoreImplServletMetadataGetServletProperties2.hashCode(), comDayCqDamCoreImplServletMetadataGetServletProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqDamCoreImplServletMetadat comDayCqDamCoreImplServletMetadataGetServletProperties1 = OASComDayCqDamCoreImplServletMetadat.getExample();
        OASComDayCqDamCoreImplServletMetadat comDayCqDamCoreImplServletMetadataGetServletProperties2 = OASComDayCqDamCoreImplServletMetadat.getExample();
        OASComDayCqDamCoreImplServletMetadat comDayCqDamCoreImplServletMetadataGetServletProperties3 = new OASComDayCqDamCoreImplServletMetadat();
        OASComDayCqDamCoreImplServletMetadat comDayCqDamCoreImplServletMetadataGetServletProperties4 = new OASComDayCqDamCoreImplServletMetadat();

        System.assert(comDayCqDamCoreImplServletMetadataGetServletProperties1.equals(comDayCqDamCoreImplServletMetadataGetServletProperties2));
        System.assert(comDayCqDamCoreImplServletMetadataGetServletProperties3.equals(comDayCqDamCoreImplServletMetadataGetServletProperties4));
        System.assertEquals(comDayCqDamCoreImplServletMetadataGetServletProperties1.hashCode(), comDayCqDamCoreImplServletMetadataGetServletProperties2.hashCode());
        System.assertEquals(comDayCqDamCoreImplServletMetadataGetServletProperties3.hashCode(), comDayCqDamCoreImplServletMetadataGetServletProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComDayCqDamCoreImplServletMetadat comDayCqDamCoreImplServletMetadataGetServletProperties = new OASComDayCqDamCoreImplServletMetadat();
        Map<String, String> propertyMappings = comDayCqDamCoreImplServletMetadataGetServletProperties.getPropertyMappings();
        System.assertEquals('slingServletResourceTypes', propertyMappings.get('sling.servlet.resourceTypes'));
        System.assertEquals('slingServletMethods', propertyMappings.get('sling.servlet.methods'));
        System.assertEquals('slingServletExtensions', propertyMappings.get('sling.servlet.extensions'));
        System.assertEquals('slingServletSelectors', propertyMappings.get('sling.servlet.selectors'));
    }
}
