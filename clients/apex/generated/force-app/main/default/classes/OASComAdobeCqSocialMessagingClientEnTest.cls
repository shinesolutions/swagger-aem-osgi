@isTest
private class OASComAdobeCqSocialMessagingClientEnTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeCqSocialMessagingClientEn comAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties1 = OASComAdobeCqSocialMessagingClientEn.getExample();
        OASComAdobeCqSocialMessagingClientEn comAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties2 = comAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties1;
        OASComAdobeCqSocialMessagingClientEn comAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties3 = new OASComAdobeCqSocialMessagingClientEn();
        OASComAdobeCqSocialMessagingClientEn comAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties4 = comAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties3;

        System.assert(comAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties1.equals(comAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties2));
        System.assert(comAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties2.equals(comAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties1));
        System.assert(comAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties1.equals(comAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties1));
        System.assert(comAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties3.equals(comAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties4));
        System.assert(comAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties4.equals(comAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties3));
        System.assert(comAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties3.equals(comAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeCqSocialMessagingClientEn comAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties1 = OASComAdobeCqSocialMessagingClientEn.getExample();
        OASComAdobeCqSocialMessagingClientEn comAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties2 = OASComAdobeCqSocialMessagingClientEn.getExample();
        OASComAdobeCqSocialMessagingClientEn comAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties3 = new OASComAdobeCqSocialMessagingClientEn();
        OASComAdobeCqSocialMessagingClientEn comAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties4 = new OASComAdobeCqSocialMessagingClientEn();

        System.assert(comAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties1.equals(comAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties2));
        System.assert(comAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties2.equals(comAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties1));
        System.assert(comAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties3.equals(comAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties4));
        System.assert(comAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties4.equals(comAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeCqSocialMessagingClientEn comAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties1 = OASComAdobeCqSocialMessagingClientEn.getExample();
        OASComAdobeCqSocialMessagingClientEn comAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties2 = new OASComAdobeCqSocialMessagingClientEn();

        System.assertEquals(false, comAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties1.equals('foo'));
        System.assertEquals(false, comAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeCqSocialMessagingClientEn comAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties1 = OASComAdobeCqSocialMessagingClientEn.getExample();
        OASComAdobeCqSocialMessagingClientEn comAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties2 = new OASComAdobeCqSocialMessagingClientEn();
        OASComAdobeCqSocialMessagingClientEn comAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties3;

        System.assertEquals(false, comAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties1.equals(comAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties3));
        System.assertEquals(false, comAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties2.equals(comAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeCqSocialMessagingClientEn comAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties1 = OASComAdobeCqSocialMessagingClientEn.getExample();
        OASComAdobeCqSocialMessagingClientEn comAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties2 = new OASComAdobeCqSocialMessagingClientEn();

        System.assertEquals(comAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties1.hashCode(), comAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties1.hashCode());
        System.assertEquals(comAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties2.hashCode(), comAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeCqSocialMessagingClientEn comAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties1 = OASComAdobeCqSocialMessagingClientEn.getExample();
        OASComAdobeCqSocialMessagingClientEn comAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties2 = OASComAdobeCqSocialMessagingClientEn.getExample();
        OASComAdobeCqSocialMessagingClientEn comAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties3 = new OASComAdobeCqSocialMessagingClientEn();
        OASComAdobeCqSocialMessagingClientEn comAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties4 = new OASComAdobeCqSocialMessagingClientEn();

        System.assert(comAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties1.equals(comAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties2));
        System.assert(comAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties3.equals(comAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties4));
        System.assertEquals(comAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties1.hashCode(), comAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties2.hashCode());
        System.assertEquals(comAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties3.hashCode(), comAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeCqSocialMessagingClientEn comAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties = new OASComAdobeCqSocialMessagingClientEn();
        Map<String, String> propertyMappings = comAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties.getPropertyMappings();
        System.assertEquals('messageProperties', propertyMappings.get('message.properties'));
        System.assertEquals('inboxPath', propertyMappings.get('inbox.path'));
        System.assertEquals('sentitemsPath', propertyMappings.get('sentitems.path'));
    }
}
