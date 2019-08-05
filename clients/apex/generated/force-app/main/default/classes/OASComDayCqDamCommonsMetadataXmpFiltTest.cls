@isTest
private class OASComDayCqDamCommonsMetadataXmpFiltTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqDamCommonsMetadataXmpFilt comDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties1 = OASComDayCqDamCommonsMetadataXmpFilt.getExample();
        OASComDayCqDamCommonsMetadataXmpFilt comDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties2 = comDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties1;
        OASComDayCqDamCommonsMetadataXmpFilt comDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties3 = new OASComDayCqDamCommonsMetadataXmpFilt();
        OASComDayCqDamCommonsMetadataXmpFilt comDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties4 = comDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties3;

        System.assert(comDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties1.equals(comDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties2));
        System.assert(comDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties2.equals(comDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties1));
        System.assert(comDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties1.equals(comDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties1));
        System.assert(comDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties3.equals(comDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties4));
        System.assert(comDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties4.equals(comDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties3));
        System.assert(comDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties3.equals(comDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqDamCommonsMetadataXmpFilt comDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties1 = OASComDayCqDamCommonsMetadataXmpFilt.getExample();
        OASComDayCqDamCommonsMetadataXmpFilt comDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties2 = OASComDayCqDamCommonsMetadataXmpFilt.getExample();
        OASComDayCqDamCommonsMetadataXmpFilt comDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties3 = new OASComDayCqDamCommonsMetadataXmpFilt();
        OASComDayCqDamCommonsMetadataXmpFilt comDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties4 = new OASComDayCqDamCommonsMetadataXmpFilt();

        System.assert(comDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties1.equals(comDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties2));
        System.assert(comDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties2.equals(comDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties1));
        System.assert(comDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties3.equals(comDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties4));
        System.assert(comDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties4.equals(comDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqDamCommonsMetadataXmpFilt comDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties1 = OASComDayCqDamCommonsMetadataXmpFilt.getExample();
        OASComDayCqDamCommonsMetadataXmpFilt comDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties2 = new OASComDayCqDamCommonsMetadataXmpFilt();

        System.assertEquals(false, comDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties1.equals('foo'));
        System.assertEquals(false, comDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqDamCommonsMetadataXmpFilt comDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties1 = OASComDayCqDamCommonsMetadataXmpFilt.getExample();
        OASComDayCqDamCommonsMetadataXmpFilt comDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties2 = new OASComDayCqDamCommonsMetadataXmpFilt();
        OASComDayCqDamCommonsMetadataXmpFilt comDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties3;

        System.assertEquals(false, comDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties1.equals(comDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties3));
        System.assertEquals(false, comDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties2.equals(comDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqDamCommonsMetadataXmpFilt comDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties1 = OASComDayCqDamCommonsMetadataXmpFilt.getExample();
        OASComDayCqDamCommonsMetadataXmpFilt comDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties2 = new OASComDayCqDamCommonsMetadataXmpFilt();

        System.assertEquals(comDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties1.hashCode(), comDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties1.hashCode());
        System.assertEquals(comDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties2.hashCode(), comDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqDamCommonsMetadataXmpFilt comDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties1 = OASComDayCqDamCommonsMetadataXmpFilt.getExample();
        OASComDayCqDamCommonsMetadataXmpFilt comDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties2 = OASComDayCqDamCommonsMetadataXmpFilt.getExample();
        OASComDayCqDamCommonsMetadataXmpFilt comDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties3 = new OASComDayCqDamCommonsMetadataXmpFilt();
        OASComDayCqDamCommonsMetadataXmpFilt comDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties4 = new OASComDayCqDamCommonsMetadataXmpFilt();

        System.assert(comDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties1.equals(comDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties2));
        System.assert(comDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties3.equals(comDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties4));
        System.assertEquals(comDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties1.hashCode(), comDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties2.hashCode());
        System.assertEquals(comDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties3.hashCode(), comDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComDayCqDamCommonsMetadataXmpFilt comDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties = new OASComDayCqDamCommonsMetadataXmpFilt();
        Map<String, String> propertyMappings = comDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties.getPropertyMappings();
        System.assertEquals('xmpFilterApplyWhitelist', propertyMappings.get('xmp.filter.apply_whitelist'));
        System.assertEquals('xmpFilterWhitelist', propertyMappings.get('xmp.filter.whitelist'));
        System.assertEquals('xmpFilterApplyBlacklist', propertyMappings.get('xmp.filter.apply_blacklist'));
        System.assertEquals('xmpFilterBlacklist', propertyMappings.get('xmp.filter.blacklist'));
    }
}
