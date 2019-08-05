@isTest
private class OASComAdobeCqDamCfmImplContentRewritTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeCqDamCfmImplContentRewrit comAdobeCqDamCfmImplContentRewriterPayloadFilterProperties1 = OASComAdobeCqDamCfmImplContentRewrit.getExample();
        OASComAdobeCqDamCfmImplContentRewrit comAdobeCqDamCfmImplContentRewriterPayloadFilterProperties2 = comAdobeCqDamCfmImplContentRewriterPayloadFilterProperties1;
        OASComAdobeCqDamCfmImplContentRewrit comAdobeCqDamCfmImplContentRewriterPayloadFilterProperties3 = new OASComAdobeCqDamCfmImplContentRewrit();
        OASComAdobeCqDamCfmImplContentRewrit comAdobeCqDamCfmImplContentRewriterPayloadFilterProperties4 = comAdobeCqDamCfmImplContentRewriterPayloadFilterProperties3;

        System.assert(comAdobeCqDamCfmImplContentRewriterPayloadFilterProperties1.equals(comAdobeCqDamCfmImplContentRewriterPayloadFilterProperties2));
        System.assert(comAdobeCqDamCfmImplContentRewriterPayloadFilterProperties2.equals(comAdobeCqDamCfmImplContentRewriterPayloadFilterProperties1));
        System.assert(comAdobeCqDamCfmImplContentRewriterPayloadFilterProperties1.equals(comAdobeCqDamCfmImplContentRewriterPayloadFilterProperties1));
        System.assert(comAdobeCqDamCfmImplContentRewriterPayloadFilterProperties3.equals(comAdobeCqDamCfmImplContentRewriterPayloadFilterProperties4));
        System.assert(comAdobeCqDamCfmImplContentRewriterPayloadFilterProperties4.equals(comAdobeCqDamCfmImplContentRewriterPayloadFilterProperties3));
        System.assert(comAdobeCqDamCfmImplContentRewriterPayloadFilterProperties3.equals(comAdobeCqDamCfmImplContentRewriterPayloadFilterProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeCqDamCfmImplContentRewrit comAdobeCqDamCfmImplContentRewriterPayloadFilterProperties1 = OASComAdobeCqDamCfmImplContentRewrit.getExample();
        OASComAdobeCqDamCfmImplContentRewrit comAdobeCqDamCfmImplContentRewriterPayloadFilterProperties2 = OASComAdobeCqDamCfmImplContentRewrit.getExample();
        OASComAdobeCqDamCfmImplContentRewrit comAdobeCqDamCfmImplContentRewriterPayloadFilterProperties3 = new OASComAdobeCqDamCfmImplContentRewrit();
        OASComAdobeCqDamCfmImplContentRewrit comAdobeCqDamCfmImplContentRewriterPayloadFilterProperties4 = new OASComAdobeCqDamCfmImplContentRewrit();

        System.assert(comAdobeCqDamCfmImplContentRewriterPayloadFilterProperties1.equals(comAdobeCqDamCfmImplContentRewriterPayloadFilterProperties2));
        System.assert(comAdobeCqDamCfmImplContentRewriterPayloadFilterProperties2.equals(comAdobeCqDamCfmImplContentRewriterPayloadFilterProperties1));
        System.assert(comAdobeCqDamCfmImplContentRewriterPayloadFilterProperties3.equals(comAdobeCqDamCfmImplContentRewriterPayloadFilterProperties4));
        System.assert(comAdobeCqDamCfmImplContentRewriterPayloadFilterProperties4.equals(comAdobeCqDamCfmImplContentRewriterPayloadFilterProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeCqDamCfmImplContentRewrit comAdobeCqDamCfmImplContentRewriterPayloadFilterProperties1 = OASComAdobeCqDamCfmImplContentRewrit.getExample();
        OASComAdobeCqDamCfmImplContentRewrit comAdobeCqDamCfmImplContentRewriterPayloadFilterProperties2 = new OASComAdobeCqDamCfmImplContentRewrit();

        System.assertEquals(false, comAdobeCqDamCfmImplContentRewriterPayloadFilterProperties1.equals('foo'));
        System.assertEquals(false, comAdobeCqDamCfmImplContentRewriterPayloadFilterProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeCqDamCfmImplContentRewrit comAdobeCqDamCfmImplContentRewriterPayloadFilterProperties1 = OASComAdobeCqDamCfmImplContentRewrit.getExample();
        OASComAdobeCqDamCfmImplContentRewrit comAdobeCqDamCfmImplContentRewriterPayloadFilterProperties2 = new OASComAdobeCqDamCfmImplContentRewrit();
        OASComAdobeCqDamCfmImplContentRewrit comAdobeCqDamCfmImplContentRewriterPayloadFilterProperties3;

        System.assertEquals(false, comAdobeCqDamCfmImplContentRewriterPayloadFilterProperties1.equals(comAdobeCqDamCfmImplContentRewriterPayloadFilterProperties3));
        System.assertEquals(false, comAdobeCqDamCfmImplContentRewriterPayloadFilterProperties2.equals(comAdobeCqDamCfmImplContentRewriterPayloadFilterProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeCqDamCfmImplContentRewrit comAdobeCqDamCfmImplContentRewriterPayloadFilterProperties1 = OASComAdobeCqDamCfmImplContentRewrit.getExample();
        OASComAdobeCqDamCfmImplContentRewrit comAdobeCqDamCfmImplContentRewriterPayloadFilterProperties2 = new OASComAdobeCqDamCfmImplContentRewrit();

        System.assertEquals(comAdobeCqDamCfmImplContentRewriterPayloadFilterProperties1.hashCode(), comAdobeCqDamCfmImplContentRewriterPayloadFilterProperties1.hashCode());
        System.assertEquals(comAdobeCqDamCfmImplContentRewriterPayloadFilterProperties2.hashCode(), comAdobeCqDamCfmImplContentRewriterPayloadFilterProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeCqDamCfmImplContentRewrit comAdobeCqDamCfmImplContentRewriterPayloadFilterProperties1 = OASComAdobeCqDamCfmImplContentRewrit.getExample();
        OASComAdobeCqDamCfmImplContentRewrit comAdobeCqDamCfmImplContentRewriterPayloadFilterProperties2 = OASComAdobeCqDamCfmImplContentRewrit.getExample();
        OASComAdobeCqDamCfmImplContentRewrit comAdobeCqDamCfmImplContentRewriterPayloadFilterProperties3 = new OASComAdobeCqDamCfmImplContentRewrit();
        OASComAdobeCqDamCfmImplContentRewrit comAdobeCqDamCfmImplContentRewriterPayloadFilterProperties4 = new OASComAdobeCqDamCfmImplContentRewrit();

        System.assert(comAdobeCqDamCfmImplContentRewriterPayloadFilterProperties1.equals(comAdobeCqDamCfmImplContentRewriterPayloadFilterProperties2));
        System.assert(comAdobeCqDamCfmImplContentRewriterPayloadFilterProperties3.equals(comAdobeCqDamCfmImplContentRewriterPayloadFilterProperties4));
        System.assertEquals(comAdobeCqDamCfmImplContentRewriterPayloadFilterProperties1.hashCode(), comAdobeCqDamCfmImplContentRewriterPayloadFilterProperties2.hashCode());
        System.assertEquals(comAdobeCqDamCfmImplContentRewriterPayloadFilterProperties3.hashCode(), comAdobeCqDamCfmImplContentRewriterPayloadFilterProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeCqDamCfmImplContentRewrit comAdobeCqDamCfmImplContentRewriterPayloadFilterProperties = new OASComAdobeCqDamCfmImplContentRewrit();
        Map<String, String> propertyMappings = comAdobeCqDamCfmImplContentRewriterPayloadFilterProperties.getPropertyMappings();
        System.assertEquals('pipelineType', propertyMappings.get('pipeline.type'));
    }
}
