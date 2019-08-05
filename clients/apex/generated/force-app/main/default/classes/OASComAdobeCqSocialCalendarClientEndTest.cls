@isTest
private class OASComAdobeCqSocialCalendarClientEndTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeCqSocialCalendarClientEnd comAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties1 = OASComAdobeCqSocialCalendarClientEnd.getExample();
        OASComAdobeCqSocialCalendarClientEnd comAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties2 = comAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties1;
        OASComAdobeCqSocialCalendarClientEnd comAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties3 = new OASComAdobeCqSocialCalendarClientEnd();
        OASComAdobeCqSocialCalendarClientEnd comAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties4 = comAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties3;

        System.assert(comAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties1.equals(comAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties2));
        System.assert(comAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties2.equals(comAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties1));
        System.assert(comAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties1.equals(comAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties1));
        System.assert(comAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties3.equals(comAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties4));
        System.assert(comAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties4.equals(comAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties3));
        System.assert(comAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties3.equals(comAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeCqSocialCalendarClientEnd comAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties1 = OASComAdobeCqSocialCalendarClientEnd.getExample();
        OASComAdobeCqSocialCalendarClientEnd comAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties2 = OASComAdobeCqSocialCalendarClientEnd.getExample();
        OASComAdobeCqSocialCalendarClientEnd comAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties3 = new OASComAdobeCqSocialCalendarClientEnd();
        OASComAdobeCqSocialCalendarClientEnd comAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties4 = new OASComAdobeCqSocialCalendarClientEnd();

        System.assert(comAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties1.equals(comAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties2));
        System.assert(comAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties2.equals(comAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties1));
        System.assert(comAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties3.equals(comAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties4));
        System.assert(comAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties4.equals(comAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeCqSocialCalendarClientEnd comAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties1 = OASComAdobeCqSocialCalendarClientEnd.getExample();
        OASComAdobeCqSocialCalendarClientEnd comAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties2 = new OASComAdobeCqSocialCalendarClientEnd();

        System.assertEquals(false, comAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties1.equals('foo'));
        System.assertEquals(false, comAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeCqSocialCalendarClientEnd comAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties1 = OASComAdobeCqSocialCalendarClientEnd.getExample();
        OASComAdobeCqSocialCalendarClientEnd comAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties2 = new OASComAdobeCqSocialCalendarClientEnd();
        OASComAdobeCqSocialCalendarClientEnd comAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties3;

        System.assertEquals(false, comAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties1.equals(comAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties3));
        System.assertEquals(false, comAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties2.equals(comAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeCqSocialCalendarClientEnd comAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties1 = OASComAdobeCqSocialCalendarClientEnd.getExample();
        OASComAdobeCqSocialCalendarClientEnd comAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties2 = new OASComAdobeCqSocialCalendarClientEnd();

        System.assertEquals(comAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties1.hashCode(), comAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties1.hashCode());
        System.assertEquals(comAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties2.hashCode(), comAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeCqSocialCalendarClientEnd comAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties1 = OASComAdobeCqSocialCalendarClientEnd.getExample();
        OASComAdobeCqSocialCalendarClientEnd comAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties2 = OASComAdobeCqSocialCalendarClientEnd.getExample();
        OASComAdobeCqSocialCalendarClientEnd comAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties3 = new OASComAdobeCqSocialCalendarClientEnd();
        OASComAdobeCqSocialCalendarClientEnd comAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties4 = new OASComAdobeCqSocialCalendarClientEnd();

        System.assert(comAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties1.equals(comAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties2));
        System.assert(comAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties3.equals(comAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties4));
        System.assertEquals(comAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties1.hashCode(), comAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties2.hashCode());
        System.assertEquals(comAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties3.hashCode(), comAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeCqSocialCalendarClientEnd comAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties = new OASComAdobeCqSocialCalendarClientEnd();
        Map<String, String> propertyMappings = comAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties.getPropertyMappings();
        System.assertEquals('maxRetry', propertyMappings.get('MaxRetry'));
    }
}
