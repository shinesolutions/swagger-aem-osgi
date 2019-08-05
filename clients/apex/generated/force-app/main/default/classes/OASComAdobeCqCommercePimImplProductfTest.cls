@isTest
private class OASComAdobeCqCommercePimImplProductfTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeCqCommercePimImplProductf comAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties1 = OASComAdobeCqCommercePimImplProductf.getExample();
        OASComAdobeCqCommercePimImplProductf comAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties2 = comAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties1;
        OASComAdobeCqCommercePimImplProductf comAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties3 = new OASComAdobeCqCommercePimImplProductf();
        OASComAdobeCqCommercePimImplProductf comAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties4 = comAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties3;

        System.assert(comAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties1.equals(comAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties2));
        System.assert(comAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties2.equals(comAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties1));
        System.assert(comAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties1.equals(comAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties1));
        System.assert(comAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties3.equals(comAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties4));
        System.assert(comAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties4.equals(comAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties3));
        System.assert(comAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties3.equals(comAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeCqCommercePimImplProductf comAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties1 = OASComAdobeCqCommercePimImplProductf.getExample();
        OASComAdobeCqCommercePimImplProductf comAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties2 = OASComAdobeCqCommercePimImplProductf.getExample();
        OASComAdobeCqCommercePimImplProductf comAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties3 = new OASComAdobeCqCommercePimImplProductf();
        OASComAdobeCqCommercePimImplProductf comAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties4 = new OASComAdobeCqCommercePimImplProductf();

        System.assert(comAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties1.equals(comAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties2));
        System.assert(comAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties2.equals(comAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties1));
        System.assert(comAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties3.equals(comAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties4));
        System.assert(comAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties4.equals(comAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeCqCommercePimImplProductf comAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties1 = OASComAdobeCqCommercePimImplProductf.getExample();
        OASComAdobeCqCommercePimImplProductf comAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties2 = new OASComAdobeCqCommercePimImplProductf();

        System.assertEquals(false, comAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties1.equals('foo'));
        System.assertEquals(false, comAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeCqCommercePimImplProductf comAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties1 = OASComAdobeCqCommercePimImplProductf.getExample();
        OASComAdobeCqCommercePimImplProductf comAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties2 = new OASComAdobeCqCommercePimImplProductf();
        OASComAdobeCqCommercePimImplProductf comAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties3;

        System.assertEquals(false, comAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties1.equals(comAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties3));
        System.assertEquals(false, comAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties2.equals(comAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeCqCommercePimImplProductf comAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties1 = OASComAdobeCqCommercePimImplProductf.getExample();
        OASComAdobeCqCommercePimImplProductf comAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties2 = new OASComAdobeCqCommercePimImplProductf();

        System.assertEquals(comAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties1.hashCode(), comAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties1.hashCode());
        System.assertEquals(comAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties2.hashCode(), comAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeCqCommercePimImplProductf comAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties1 = OASComAdobeCqCommercePimImplProductf.getExample();
        OASComAdobeCqCommercePimImplProductf comAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties2 = OASComAdobeCqCommercePimImplProductf.getExample();
        OASComAdobeCqCommercePimImplProductf comAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties3 = new OASComAdobeCqCommercePimImplProductf();
        OASComAdobeCqCommercePimImplProductf comAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties4 = new OASComAdobeCqCommercePimImplProductf();

        System.assert(comAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties1.equals(comAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties2));
        System.assert(comAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties3.equals(comAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties4));
        System.assertEquals(comAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties1.hashCode(), comAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties2.hashCode());
        System.assertEquals(comAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties3.hashCode(), comAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeCqCommercePimImplProductf comAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties = new OASComAdobeCqCommercePimImplProductf();
        Map<String, String> propertyMappings = comAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties.getPropertyMappings();
        System.assertEquals('feedGeneratorAlgorithm', propertyMappings.get('Feed generator algorithm'));
    }
}
