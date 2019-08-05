@isTest
private class OASComDayCqSearchImplBuilderQueryBuiTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqSearchImplBuilderQueryBui comDayCqSearchImplBuilderQueryBuilderImplProperties1 = OASComDayCqSearchImplBuilderQueryBui.getExample();
        OASComDayCqSearchImplBuilderQueryBui comDayCqSearchImplBuilderQueryBuilderImplProperties2 = comDayCqSearchImplBuilderQueryBuilderImplProperties1;
        OASComDayCqSearchImplBuilderQueryBui comDayCqSearchImplBuilderQueryBuilderImplProperties3 = new OASComDayCqSearchImplBuilderQueryBui();
        OASComDayCqSearchImplBuilderQueryBui comDayCqSearchImplBuilderQueryBuilderImplProperties4 = comDayCqSearchImplBuilderQueryBuilderImplProperties3;

        System.assert(comDayCqSearchImplBuilderQueryBuilderImplProperties1.equals(comDayCqSearchImplBuilderQueryBuilderImplProperties2));
        System.assert(comDayCqSearchImplBuilderQueryBuilderImplProperties2.equals(comDayCqSearchImplBuilderQueryBuilderImplProperties1));
        System.assert(comDayCqSearchImplBuilderQueryBuilderImplProperties1.equals(comDayCqSearchImplBuilderQueryBuilderImplProperties1));
        System.assert(comDayCqSearchImplBuilderQueryBuilderImplProperties3.equals(comDayCqSearchImplBuilderQueryBuilderImplProperties4));
        System.assert(comDayCqSearchImplBuilderQueryBuilderImplProperties4.equals(comDayCqSearchImplBuilderQueryBuilderImplProperties3));
        System.assert(comDayCqSearchImplBuilderQueryBuilderImplProperties3.equals(comDayCqSearchImplBuilderQueryBuilderImplProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqSearchImplBuilderQueryBui comDayCqSearchImplBuilderQueryBuilderImplProperties1 = OASComDayCqSearchImplBuilderQueryBui.getExample();
        OASComDayCqSearchImplBuilderQueryBui comDayCqSearchImplBuilderQueryBuilderImplProperties2 = OASComDayCqSearchImplBuilderQueryBui.getExample();
        OASComDayCqSearchImplBuilderQueryBui comDayCqSearchImplBuilderQueryBuilderImplProperties3 = new OASComDayCqSearchImplBuilderQueryBui();
        OASComDayCqSearchImplBuilderQueryBui comDayCqSearchImplBuilderQueryBuilderImplProperties4 = new OASComDayCqSearchImplBuilderQueryBui();

        System.assert(comDayCqSearchImplBuilderQueryBuilderImplProperties1.equals(comDayCqSearchImplBuilderQueryBuilderImplProperties2));
        System.assert(comDayCqSearchImplBuilderQueryBuilderImplProperties2.equals(comDayCqSearchImplBuilderQueryBuilderImplProperties1));
        System.assert(comDayCqSearchImplBuilderQueryBuilderImplProperties3.equals(comDayCqSearchImplBuilderQueryBuilderImplProperties4));
        System.assert(comDayCqSearchImplBuilderQueryBuilderImplProperties4.equals(comDayCqSearchImplBuilderQueryBuilderImplProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqSearchImplBuilderQueryBui comDayCqSearchImplBuilderQueryBuilderImplProperties1 = OASComDayCqSearchImplBuilderQueryBui.getExample();
        OASComDayCqSearchImplBuilderQueryBui comDayCqSearchImplBuilderQueryBuilderImplProperties2 = new OASComDayCqSearchImplBuilderQueryBui();

        System.assertEquals(false, comDayCqSearchImplBuilderQueryBuilderImplProperties1.equals('foo'));
        System.assertEquals(false, comDayCqSearchImplBuilderQueryBuilderImplProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqSearchImplBuilderQueryBui comDayCqSearchImplBuilderQueryBuilderImplProperties1 = OASComDayCqSearchImplBuilderQueryBui.getExample();
        OASComDayCqSearchImplBuilderQueryBui comDayCqSearchImplBuilderQueryBuilderImplProperties2 = new OASComDayCqSearchImplBuilderQueryBui();
        OASComDayCqSearchImplBuilderQueryBui comDayCqSearchImplBuilderQueryBuilderImplProperties3;

        System.assertEquals(false, comDayCqSearchImplBuilderQueryBuilderImplProperties1.equals(comDayCqSearchImplBuilderQueryBuilderImplProperties3));
        System.assertEquals(false, comDayCqSearchImplBuilderQueryBuilderImplProperties2.equals(comDayCqSearchImplBuilderQueryBuilderImplProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqSearchImplBuilderQueryBui comDayCqSearchImplBuilderQueryBuilderImplProperties1 = OASComDayCqSearchImplBuilderQueryBui.getExample();
        OASComDayCqSearchImplBuilderQueryBui comDayCqSearchImplBuilderQueryBuilderImplProperties2 = new OASComDayCqSearchImplBuilderQueryBui();

        System.assertEquals(comDayCqSearchImplBuilderQueryBuilderImplProperties1.hashCode(), comDayCqSearchImplBuilderQueryBuilderImplProperties1.hashCode());
        System.assertEquals(comDayCqSearchImplBuilderQueryBuilderImplProperties2.hashCode(), comDayCqSearchImplBuilderQueryBuilderImplProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqSearchImplBuilderQueryBui comDayCqSearchImplBuilderQueryBuilderImplProperties1 = OASComDayCqSearchImplBuilderQueryBui.getExample();
        OASComDayCqSearchImplBuilderQueryBui comDayCqSearchImplBuilderQueryBuilderImplProperties2 = OASComDayCqSearchImplBuilderQueryBui.getExample();
        OASComDayCqSearchImplBuilderQueryBui comDayCqSearchImplBuilderQueryBuilderImplProperties3 = new OASComDayCqSearchImplBuilderQueryBui();
        OASComDayCqSearchImplBuilderQueryBui comDayCqSearchImplBuilderQueryBuilderImplProperties4 = new OASComDayCqSearchImplBuilderQueryBui();

        System.assert(comDayCqSearchImplBuilderQueryBuilderImplProperties1.equals(comDayCqSearchImplBuilderQueryBuilderImplProperties2));
        System.assert(comDayCqSearchImplBuilderQueryBuilderImplProperties3.equals(comDayCqSearchImplBuilderQueryBuilderImplProperties4));
        System.assertEquals(comDayCqSearchImplBuilderQueryBuilderImplProperties1.hashCode(), comDayCqSearchImplBuilderQueryBuilderImplProperties2.hashCode());
        System.assertEquals(comDayCqSearchImplBuilderQueryBuilderImplProperties3.hashCode(), comDayCqSearchImplBuilderQueryBuilderImplProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComDayCqSearchImplBuilderQueryBui comDayCqSearchImplBuilderQueryBuilderImplProperties = new OASComDayCqSearchImplBuilderQueryBui();
        Map<String, String> propertyMappings = comDayCqSearchImplBuilderQueryBuilderImplProperties.getPropertyMappings();
        System.assertEquals('excerptProperties', propertyMappings.get('excerpt.properties'));
        System.assertEquals('cacheMaxEntries', propertyMappings.get('cache.max.entries'));
        System.assertEquals('cacheEntryLifetime', propertyMappings.get('cache.entry.lifetime'));
        System.assertEquals('xpathUnion', propertyMappings.get('xpath.union'));
    }
}
