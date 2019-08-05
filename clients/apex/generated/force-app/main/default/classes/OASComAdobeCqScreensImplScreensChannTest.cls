@isTest
private class OASComAdobeCqScreensImplScreensChannTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeCqScreensImplScreensChann comAdobeCqScreensImplScreensChannelPostProcessorProperties1 = OASComAdobeCqScreensImplScreensChann.getExample();
        OASComAdobeCqScreensImplScreensChann comAdobeCqScreensImplScreensChannelPostProcessorProperties2 = comAdobeCqScreensImplScreensChannelPostProcessorProperties1;
        OASComAdobeCqScreensImplScreensChann comAdobeCqScreensImplScreensChannelPostProcessorProperties3 = new OASComAdobeCqScreensImplScreensChann();
        OASComAdobeCqScreensImplScreensChann comAdobeCqScreensImplScreensChannelPostProcessorProperties4 = comAdobeCqScreensImplScreensChannelPostProcessorProperties3;

        System.assert(comAdobeCqScreensImplScreensChannelPostProcessorProperties1.equals(comAdobeCqScreensImplScreensChannelPostProcessorProperties2));
        System.assert(comAdobeCqScreensImplScreensChannelPostProcessorProperties2.equals(comAdobeCqScreensImplScreensChannelPostProcessorProperties1));
        System.assert(comAdobeCqScreensImplScreensChannelPostProcessorProperties1.equals(comAdobeCqScreensImplScreensChannelPostProcessorProperties1));
        System.assert(comAdobeCqScreensImplScreensChannelPostProcessorProperties3.equals(comAdobeCqScreensImplScreensChannelPostProcessorProperties4));
        System.assert(comAdobeCqScreensImplScreensChannelPostProcessorProperties4.equals(comAdobeCqScreensImplScreensChannelPostProcessorProperties3));
        System.assert(comAdobeCqScreensImplScreensChannelPostProcessorProperties3.equals(comAdobeCqScreensImplScreensChannelPostProcessorProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeCqScreensImplScreensChann comAdobeCqScreensImplScreensChannelPostProcessorProperties1 = OASComAdobeCqScreensImplScreensChann.getExample();
        OASComAdobeCqScreensImplScreensChann comAdobeCqScreensImplScreensChannelPostProcessorProperties2 = OASComAdobeCqScreensImplScreensChann.getExample();
        OASComAdobeCqScreensImplScreensChann comAdobeCqScreensImplScreensChannelPostProcessorProperties3 = new OASComAdobeCqScreensImplScreensChann();
        OASComAdobeCqScreensImplScreensChann comAdobeCqScreensImplScreensChannelPostProcessorProperties4 = new OASComAdobeCqScreensImplScreensChann();

        System.assert(comAdobeCqScreensImplScreensChannelPostProcessorProperties1.equals(comAdobeCqScreensImplScreensChannelPostProcessorProperties2));
        System.assert(comAdobeCqScreensImplScreensChannelPostProcessorProperties2.equals(comAdobeCqScreensImplScreensChannelPostProcessorProperties1));
        System.assert(comAdobeCqScreensImplScreensChannelPostProcessorProperties3.equals(comAdobeCqScreensImplScreensChannelPostProcessorProperties4));
        System.assert(comAdobeCqScreensImplScreensChannelPostProcessorProperties4.equals(comAdobeCqScreensImplScreensChannelPostProcessorProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeCqScreensImplScreensChann comAdobeCqScreensImplScreensChannelPostProcessorProperties1 = OASComAdobeCqScreensImplScreensChann.getExample();
        OASComAdobeCqScreensImplScreensChann comAdobeCqScreensImplScreensChannelPostProcessorProperties2 = new OASComAdobeCqScreensImplScreensChann();

        System.assertEquals(false, comAdobeCqScreensImplScreensChannelPostProcessorProperties1.equals('foo'));
        System.assertEquals(false, comAdobeCqScreensImplScreensChannelPostProcessorProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeCqScreensImplScreensChann comAdobeCqScreensImplScreensChannelPostProcessorProperties1 = OASComAdobeCqScreensImplScreensChann.getExample();
        OASComAdobeCqScreensImplScreensChann comAdobeCqScreensImplScreensChannelPostProcessorProperties2 = new OASComAdobeCqScreensImplScreensChann();
        OASComAdobeCqScreensImplScreensChann comAdobeCqScreensImplScreensChannelPostProcessorProperties3;

        System.assertEquals(false, comAdobeCqScreensImplScreensChannelPostProcessorProperties1.equals(comAdobeCqScreensImplScreensChannelPostProcessorProperties3));
        System.assertEquals(false, comAdobeCqScreensImplScreensChannelPostProcessorProperties2.equals(comAdobeCqScreensImplScreensChannelPostProcessorProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeCqScreensImplScreensChann comAdobeCqScreensImplScreensChannelPostProcessorProperties1 = OASComAdobeCqScreensImplScreensChann.getExample();
        OASComAdobeCqScreensImplScreensChann comAdobeCqScreensImplScreensChannelPostProcessorProperties2 = new OASComAdobeCqScreensImplScreensChann();

        System.assertEquals(comAdobeCqScreensImplScreensChannelPostProcessorProperties1.hashCode(), comAdobeCqScreensImplScreensChannelPostProcessorProperties1.hashCode());
        System.assertEquals(comAdobeCqScreensImplScreensChannelPostProcessorProperties2.hashCode(), comAdobeCqScreensImplScreensChannelPostProcessorProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeCqScreensImplScreensChann comAdobeCqScreensImplScreensChannelPostProcessorProperties1 = OASComAdobeCqScreensImplScreensChann.getExample();
        OASComAdobeCqScreensImplScreensChann comAdobeCqScreensImplScreensChannelPostProcessorProperties2 = OASComAdobeCqScreensImplScreensChann.getExample();
        OASComAdobeCqScreensImplScreensChann comAdobeCqScreensImplScreensChannelPostProcessorProperties3 = new OASComAdobeCqScreensImplScreensChann();
        OASComAdobeCqScreensImplScreensChann comAdobeCqScreensImplScreensChannelPostProcessorProperties4 = new OASComAdobeCqScreensImplScreensChann();

        System.assert(comAdobeCqScreensImplScreensChannelPostProcessorProperties1.equals(comAdobeCqScreensImplScreensChannelPostProcessorProperties2));
        System.assert(comAdobeCqScreensImplScreensChannelPostProcessorProperties3.equals(comAdobeCqScreensImplScreensChannelPostProcessorProperties4));
        System.assertEquals(comAdobeCqScreensImplScreensChannelPostProcessorProperties1.hashCode(), comAdobeCqScreensImplScreensChannelPostProcessorProperties2.hashCode());
        System.assertEquals(comAdobeCqScreensImplScreensChannelPostProcessorProperties3.hashCode(), comAdobeCqScreensImplScreensChannelPostProcessorProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeCqScreensImplScreensChann comAdobeCqScreensImplScreensChannelPostProcessorProperties = new OASComAdobeCqScreensImplScreensChann();
        Map<String, String> propertyMappings = comAdobeCqScreensImplScreensChannelPostProcessorProperties.getPropertyMappings();
        System.assertEquals('screensChannelsPropertiesToRemove', propertyMappings.get('screens.channels.properties.to.remove'));
    }
}
