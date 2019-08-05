@isTest
private class OASComAdobeCqWcmLaunchesImplLaunchesTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeCqWcmLaunchesImplLaunches comAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties1 = OASComAdobeCqWcmLaunchesImplLaunches.getExample();
        OASComAdobeCqWcmLaunchesImplLaunches comAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties2 = comAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties1;
        OASComAdobeCqWcmLaunchesImplLaunches comAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties3 = new OASComAdobeCqWcmLaunchesImplLaunches();
        OASComAdobeCqWcmLaunchesImplLaunches comAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties4 = comAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties3;

        System.assert(comAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties1.equals(comAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties2));
        System.assert(comAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties2.equals(comAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties1));
        System.assert(comAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties1.equals(comAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties1));
        System.assert(comAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties3.equals(comAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties4));
        System.assert(comAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties4.equals(comAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties3));
        System.assert(comAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties3.equals(comAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeCqWcmLaunchesImplLaunches comAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties1 = OASComAdobeCqWcmLaunchesImplLaunches.getExample();
        OASComAdobeCqWcmLaunchesImplLaunches comAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties2 = OASComAdobeCqWcmLaunchesImplLaunches.getExample();
        OASComAdobeCqWcmLaunchesImplLaunches comAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties3 = new OASComAdobeCqWcmLaunchesImplLaunches();
        OASComAdobeCqWcmLaunchesImplLaunches comAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties4 = new OASComAdobeCqWcmLaunchesImplLaunches();

        System.assert(comAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties1.equals(comAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties2));
        System.assert(comAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties2.equals(comAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties1));
        System.assert(comAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties3.equals(comAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties4));
        System.assert(comAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties4.equals(comAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeCqWcmLaunchesImplLaunches comAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties1 = OASComAdobeCqWcmLaunchesImplLaunches.getExample();
        OASComAdobeCqWcmLaunchesImplLaunches comAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties2 = new OASComAdobeCqWcmLaunchesImplLaunches();

        System.assertEquals(false, comAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties1.equals('foo'));
        System.assertEquals(false, comAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeCqWcmLaunchesImplLaunches comAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties1 = OASComAdobeCqWcmLaunchesImplLaunches.getExample();
        OASComAdobeCqWcmLaunchesImplLaunches comAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties2 = new OASComAdobeCqWcmLaunchesImplLaunches();
        OASComAdobeCqWcmLaunchesImplLaunches comAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties3;

        System.assertEquals(false, comAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties1.equals(comAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties3));
        System.assertEquals(false, comAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties2.equals(comAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeCqWcmLaunchesImplLaunches comAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties1 = OASComAdobeCqWcmLaunchesImplLaunches.getExample();
        OASComAdobeCqWcmLaunchesImplLaunches comAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties2 = new OASComAdobeCqWcmLaunchesImplLaunches();

        System.assertEquals(comAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties1.hashCode(), comAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties1.hashCode());
        System.assertEquals(comAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties2.hashCode(), comAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeCqWcmLaunchesImplLaunches comAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties1 = OASComAdobeCqWcmLaunchesImplLaunches.getExample();
        OASComAdobeCqWcmLaunchesImplLaunches comAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties2 = OASComAdobeCqWcmLaunchesImplLaunches.getExample();
        OASComAdobeCqWcmLaunchesImplLaunches comAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties3 = new OASComAdobeCqWcmLaunchesImplLaunches();
        OASComAdobeCqWcmLaunchesImplLaunches comAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties4 = new OASComAdobeCqWcmLaunchesImplLaunches();

        System.assert(comAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties1.equals(comAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties2));
        System.assert(comAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties3.equals(comAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties4));
        System.assertEquals(comAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties1.hashCode(), comAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties2.hashCode());
        System.assertEquals(comAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties3.hashCode(), comAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeCqWcmLaunchesImplLaunches comAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties = new OASComAdobeCqWcmLaunchesImplLaunches();
        Map<String, String> propertyMappings = comAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties.getPropertyMappings();
        System.assertEquals('eventFilter', propertyMappings.get('event.filter'));
        System.assertEquals('launchesEventhandlerThreadpoolMaxsize', propertyMappings.get('launches.eventhandler.threadpool.maxsize'));
        System.assertEquals('launchesEventhandlerThreadpoolPriority', propertyMappings.get('launches.eventhandler.threadpool.priority'));
        System.assertEquals('launchesEventhandlerUpdatelastmodification', propertyMappings.get('launches.eventhandler.updatelastmodification'));
    }
}
