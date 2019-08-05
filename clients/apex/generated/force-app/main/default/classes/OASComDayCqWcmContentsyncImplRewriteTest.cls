@isTest
private class OASComDayCqWcmContentsyncImplRewriteTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqWcmContentsyncImplRewrite comDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties1 = OASComDayCqWcmContentsyncImplRewrite.getExample();
        OASComDayCqWcmContentsyncImplRewrite comDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties2 = comDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties1;
        OASComDayCqWcmContentsyncImplRewrite comDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties3 = new OASComDayCqWcmContentsyncImplRewrite();
        OASComDayCqWcmContentsyncImplRewrite comDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties4 = comDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties3;

        System.assert(comDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties1.equals(comDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties2));
        System.assert(comDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties2.equals(comDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties1));
        System.assert(comDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties1.equals(comDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties1));
        System.assert(comDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties3.equals(comDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties4));
        System.assert(comDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties4.equals(comDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties3));
        System.assert(comDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties3.equals(comDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqWcmContentsyncImplRewrite comDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties1 = OASComDayCqWcmContentsyncImplRewrite.getExample();
        OASComDayCqWcmContentsyncImplRewrite comDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties2 = OASComDayCqWcmContentsyncImplRewrite.getExample();
        OASComDayCqWcmContentsyncImplRewrite comDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties3 = new OASComDayCqWcmContentsyncImplRewrite();
        OASComDayCqWcmContentsyncImplRewrite comDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties4 = new OASComDayCqWcmContentsyncImplRewrite();

        System.assert(comDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties1.equals(comDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties2));
        System.assert(comDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties2.equals(comDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties1));
        System.assert(comDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties3.equals(comDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties4));
        System.assert(comDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties4.equals(comDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqWcmContentsyncImplRewrite comDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties1 = OASComDayCqWcmContentsyncImplRewrite.getExample();
        OASComDayCqWcmContentsyncImplRewrite comDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties2 = new OASComDayCqWcmContentsyncImplRewrite();

        System.assertEquals(false, comDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties1.equals('foo'));
        System.assertEquals(false, comDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqWcmContentsyncImplRewrite comDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties1 = OASComDayCqWcmContentsyncImplRewrite.getExample();
        OASComDayCqWcmContentsyncImplRewrite comDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties2 = new OASComDayCqWcmContentsyncImplRewrite();
        OASComDayCqWcmContentsyncImplRewrite comDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties3;

        System.assertEquals(false, comDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties1.equals(comDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties3));
        System.assertEquals(false, comDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties2.equals(comDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqWcmContentsyncImplRewrite comDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties1 = OASComDayCqWcmContentsyncImplRewrite.getExample();
        OASComDayCqWcmContentsyncImplRewrite comDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties2 = new OASComDayCqWcmContentsyncImplRewrite();

        System.assertEquals(comDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties1.hashCode(), comDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties1.hashCode());
        System.assertEquals(comDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties2.hashCode(), comDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqWcmContentsyncImplRewrite comDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties1 = OASComDayCqWcmContentsyncImplRewrite.getExample();
        OASComDayCqWcmContentsyncImplRewrite comDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties2 = OASComDayCqWcmContentsyncImplRewrite.getExample();
        OASComDayCqWcmContentsyncImplRewrite comDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties3 = new OASComDayCqWcmContentsyncImplRewrite();
        OASComDayCqWcmContentsyncImplRewrite comDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties4 = new OASComDayCqWcmContentsyncImplRewrite();

        System.assert(comDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties1.equals(comDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties2));
        System.assert(comDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties3.equals(comDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties4));
        System.assertEquals(comDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties1.hashCode(), comDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties2.hashCode());
        System.assertEquals(comDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties3.hashCode(), comDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComDayCqWcmContentsyncImplRewrite comDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties = new OASComDayCqWcmContentsyncImplRewrite();
        Map<String, String> propertyMappings = comDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties.getPropertyMappings();
        System.assertEquals('cqContentsyncPathrewritertransformerMappingLinks', propertyMappings.get('cq.contentsync.pathrewritertransformer.mapping.links'));
        System.assertEquals('cqContentsyncPathrewritertransformerMappingClientlibs', propertyMappings.get('cq.contentsync.pathrewritertransformer.mapping.clientlibs'));
        System.assertEquals('cqContentsyncPathrewritertransformerMappingImages', propertyMappings.get('cq.contentsync.pathrewritertransformer.mapping.images'));
        System.assertEquals('cqContentsyncPathrewritertransformerAttributePattern', propertyMappings.get('cq.contentsync.pathrewritertransformer.attribute.pattern'));
        System.assertEquals('cqContentsyncPathrewritertransformerClientlibraryPattern', propertyMappings.get('cq.contentsync.pathrewritertransformer.clientlibrary.pattern'));
        System.assertEquals('cqContentsyncPathrewritertransformerClientlibraryReplace', propertyMappings.get('cq.contentsync.pathrewritertransformer.clientlibrary.replace'));
    }
}
