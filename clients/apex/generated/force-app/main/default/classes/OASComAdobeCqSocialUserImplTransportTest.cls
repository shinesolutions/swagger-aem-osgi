@isTest
private class OASComAdobeCqSocialUserImplTransportTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeCqSocialUserImplTransport comAdobeCqSocialUserImplTransportHttpToPublisherProperties1 = OASComAdobeCqSocialUserImplTransport.getExample();
        OASComAdobeCqSocialUserImplTransport comAdobeCqSocialUserImplTransportHttpToPublisherProperties2 = comAdobeCqSocialUserImplTransportHttpToPublisherProperties1;
        OASComAdobeCqSocialUserImplTransport comAdobeCqSocialUserImplTransportHttpToPublisherProperties3 = new OASComAdobeCqSocialUserImplTransport();
        OASComAdobeCqSocialUserImplTransport comAdobeCqSocialUserImplTransportHttpToPublisherProperties4 = comAdobeCqSocialUserImplTransportHttpToPublisherProperties3;

        System.assert(comAdobeCqSocialUserImplTransportHttpToPublisherProperties1.equals(comAdobeCqSocialUserImplTransportHttpToPublisherProperties2));
        System.assert(comAdobeCqSocialUserImplTransportHttpToPublisherProperties2.equals(comAdobeCqSocialUserImplTransportHttpToPublisherProperties1));
        System.assert(comAdobeCqSocialUserImplTransportHttpToPublisherProperties1.equals(comAdobeCqSocialUserImplTransportHttpToPublisherProperties1));
        System.assert(comAdobeCqSocialUserImplTransportHttpToPublisherProperties3.equals(comAdobeCqSocialUserImplTransportHttpToPublisherProperties4));
        System.assert(comAdobeCqSocialUserImplTransportHttpToPublisherProperties4.equals(comAdobeCqSocialUserImplTransportHttpToPublisherProperties3));
        System.assert(comAdobeCqSocialUserImplTransportHttpToPublisherProperties3.equals(comAdobeCqSocialUserImplTransportHttpToPublisherProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeCqSocialUserImplTransport comAdobeCqSocialUserImplTransportHttpToPublisherProperties1 = OASComAdobeCqSocialUserImplTransport.getExample();
        OASComAdobeCqSocialUserImplTransport comAdobeCqSocialUserImplTransportHttpToPublisherProperties2 = OASComAdobeCqSocialUserImplTransport.getExample();
        OASComAdobeCqSocialUserImplTransport comAdobeCqSocialUserImplTransportHttpToPublisherProperties3 = new OASComAdobeCqSocialUserImplTransport();
        OASComAdobeCqSocialUserImplTransport comAdobeCqSocialUserImplTransportHttpToPublisherProperties4 = new OASComAdobeCqSocialUserImplTransport();

        System.assert(comAdobeCqSocialUserImplTransportHttpToPublisherProperties1.equals(comAdobeCqSocialUserImplTransportHttpToPublisherProperties2));
        System.assert(comAdobeCqSocialUserImplTransportHttpToPublisherProperties2.equals(comAdobeCqSocialUserImplTransportHttpToPublisherProperties1));
        System.assert(comAdobeCqSocialUserImplTransportHttpToPublisherProperties3.equals(comAdobeCqSocialUserImplTransportHttpToPublisherProperties4));
        System.assert(comAdobeCqSocialUserImplTransportHttpToPublisherProperties4.equals(comAdobeCqSocialUserImplTransportHttpToPublisherProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeCqSocialUserImplTransport comAdobeCqSocialUserImplTransportHttpToPublisherProperties1 = OASComAdobeCqSocialUserImplTransport.getExample();
        OASComAdobeCqSocialUserImplTransport comAdobeCqSocialUserImplTransportHttpToPublisherProperties2 = new OASComAdobeCqSocialUserImplTransport();

        System.assertEquals(false, comAdobeCqSocialUserImplTransportHttpToPublisherProperties1.equals('foo'));
        System.assertEquals(false, comAdobeCqSocialUserImplTransportHttpToPublisherProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeCqSocialUserImplTransport comAdobeCqSocialUserImplTransportHttpToPublisherProperties1 = OASComAdobeCqSocialUserImplTransport.getExample();
        OASComAdobeCqSocialUserImplTransport comAdobeCqSocialUserImplTransportHttpToPublisherProperties2 = new OASComAdobeCqSocialUserImplTransport();
        OASComAdobeCqSocialUserImplTransport comAdobeCqSocialUserImplTransportHttpToPublisherProperties3;

        System.assertEquals(false, comAdobeCqSocialUserImplTransportHttpToPublisherProperties1.equals(comAdobeCqSocialUserImplTransportHttpToPublisherProperties3));
        System.assertEquals(false, comAdobeCqSocialUserImplTransportHttpToPublisherProperties2.equals(comAdobeCqSocialUserImplTransportHttpToPublisherProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeCqSocialUserImplTransport comAdobeCqSocialUserImplTransportHttpToPublisherProperties1 = OASComAdobeCqSocialUserImplTransport.getExample();
        OASComAdobeCqSocialUserImplTransport comAdobeCqSocialUserImplTransportHttpToPublisherProperties2 = new OASComAdobeCqSocialUserImplTransport();

        System.assertEquals(comAdobeCqSocialUserImplTransportHttpToPublisherProperties1.hashCode(), comAdobeCqSocialUserImplTransportHttpToPublisherProperties1.hashCode());
        System.assertEquals(comAdobeCqSocialUserImplTransportHttpToPublisherProperties2.hashCode(), comAdobeCqSocialUserImplTransportHttpToPublisherProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeCqSocialUserImplTransport comAdobeCqSocialUserImplTransportHttpToPublisherProperties1 = OASComAdobeCqSocialUserImplTransport.getExample();
        OASComAdobeCqSocialUserImplTransport comAdobeCqSocialUserImplTransportHttpToPublisherProperties2 = OASComAdobeCqSocialUserImplTransport.getExample();
        OASComAdobeCqSocialUserImplTransport comAdobeCqSocialUserImplTransportHttpToPublisherProperties3 = new OASComAdobeCqSocialUserImplTransport();
        OASComAdobeCqSocialUserImplTransport comAdobeCqSocialUserImplTransportHttpToPublisherProperties4 = new OASComAdobeCqSocialUserImplTransport();

        System.assert(comAdobeCqSocialUserImplTransportHttpToPublisherProperties1.equals(comAdobeCqSocialUserImplTransportHttpToPublisherProperties2));
        System.assert(comAdobeCqSocialUserImplTransportHttpToPublisherProperties3.equals(comAdobeCqSocialUserImplTransportHttpToPublisherProperties4));
        System.assertEquals(comAdobeCqSocialUserImplTransportHttpToPublisherProperties1.hashCode(), comAdobeCqSocialUserImplTransportHttpToPublisherProperties2.hashCode());
        System.assertEquals(comAdobeCqSocialUserImplTransportHttpToPublisherProperties3.hashCode(), comAdobeCqSocialUserImplTransportHttpToPublisherProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeCqSocialUserImplTransport comAdobeCqSocialUserImplTransportHttpToPublisherProperties = new OASComAdobeCqSocialUserImplTransport();
        Map<String, String> propertyMappings = comAdobeCqSocialUserImplTransportHttpToPublisherProperties.getPropertyMappings();
        System.assertEquals('agentConfiguration', propertyMappings.get('agent.configuration'));
        System.assertEquals('contextPath', propertyMappings.get('context.path'));
        System.assertEquals('disabledCipherSuites', propertyMappings.get('disabled.cipher.suites'));
        System.assertEquals('enabledCipherSuites', propertyMappings.get('enabled.cipher.suites'));
    }
}
