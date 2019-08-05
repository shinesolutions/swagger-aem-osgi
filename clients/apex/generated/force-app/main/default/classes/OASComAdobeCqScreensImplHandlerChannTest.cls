@isTest
private class OASComAdobeCqScreensImplHandlerChannTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeCqScreensImplHandlerChann comAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties1 = OASComAdobeCqScreensImplHandlerChann.getExample();
        OASComAdobeCqScreensImplHandlerChann comAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties2 = comAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties1;
        OASComAdobeCqScreensImplHandlerChann comAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties3 = new OASComAdobeCqScreensImplHandlerChann();
        OASComAdobeCqScreensImplHandlerChann comAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties4 = comAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties3;

        System.assert(comAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties1.equals(comAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties2));
        System.assert(comAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties2.equals(comAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties1));
        System.assert(comAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties1.equals(comAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties1));
        System.assert(comAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties3.equals(comAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties4));
        System.assert(comAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties4.equals(comAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties3));
        System.assert(comAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties3.equals(comAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeCqScreensImplHandlerChann comAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties1 = OASComAdobeCqScreensImplHandlerChann.getExample();
        OASComAdobeCqScreensImplHandlerChann comAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties2 = OASComAdobeCqScreensImplHandlerChann.getExample();
        OASComAdobeCqScreensImplHandlerChann comAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties3 = new OASComAdobeCqScreensImplHandlerChann();
        OASComAdobeCqScreensImplHandlerChann comAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties4 = new OASComAdobeCqScreensImplHandlerChann();

        System.assert(comAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties1.equals(comAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties2));
        System.assert(comAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties2.equals(comAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties1));
        System.assert(comAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties3.equals(comAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties4));
        System.assert(comAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties4.equals(comAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeCqScreensImplHandlerChann comAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties1 = OASComAdobeCqScreensImplHandlerChann.getExample();
        OASComAdobeCqScreensImplHandlerChann comAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties2 = new OASComAdobeCqScreensImplHandlerChann();

        System.assertEquals(false, comAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties1.equals('foo'));
        System.assertEquals(false, comAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeCqScreensImplHandlerChann comAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties1 = OASComAdobeCqScreensImplHandlerChann.getExample();
        OASComAdobeCqScreensImplHandlerChann comAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties2 = new OASComAdobeCqScreensImplHandlerChann();
        OASComAdobeCqScreensImplHandlerChann comAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties3;

        System.assertEquals(false, comAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties1.equals(comAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties3));
        System.assertEquals(false, comAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties2.equals(comAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeCqScreensImplHandlerChann comAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties1 = OASComAdobeCqScreensImplHandlerChann.getExample();
        OASComAdobeCqScreensImplHandlerChann comAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties2 = new OASComAdobeCqScreensImplHandlerChann();

        System.assertEquals(comAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties1.hashCode(), comAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties1.hashCode());
        System.assertEquals(comAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties2.hashCode(), comAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeCqScreensImplHandlerChann comAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties1 = OASComAdobeCqScreensImplHandlerChann.getExample();
        OASComAdobeCqScreensImplHandlerChann comAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties2 = OASComAdobeCqScreensImplHandlerChann.getExample();
        OASComAdobeCqScreensImplHandlerChann comAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties3 = new OASComAdobeCqScreensImplHandlerChann();
        OASComAdobeCqScreensImplHandlerChann comAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties4 = new OASComAdobeCqScreensImplHandlerChann();

        System.assert(comAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties1.equals(comAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties2));
        System.assert(comAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties3.equals(comAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties4));
        System.assertEquals(comAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties1.hashCode(), comAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties2.hashCode());
        System.assertEquals(comAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties3.hashCode(), comAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeCqScreensImplHandlerChann comAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties = new OASComAdobeCqScreensImplHandlerChann();
        Map<String, String> propertyMappings = comAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties.getPropertyMappings();
        System.assertEquals('cqPagesupdatehandlerImageresourcetypes', propertyMappings.get('cq.pagesupdatehandler.imageresourcetypes'));
        System.assertEquals('cqPagesupdatehandlerProductresourcetypes', propertyMappings.get('cq.pagesupdatehandler.productresourcetypes'));
        System.assertEquals('cqPagesupdatehandlerVideoresourcetypes', propertyMappings.get('cq.pagesupdatehandler.videoresourcetypes'));
        System.assertEquals('cqPagesupdatehandlerDynamicsequenceresourcetypes', propertyMappings.get('cq.pagesupdatehandler.dynamicsequenceresourcetypes'));
        System.assertEquals('cqPagesupdatehandlerPreviewmodepaths', propertyMappings.get('cq.pagesupdatehandler.previewmodepaths'));
    }
}
