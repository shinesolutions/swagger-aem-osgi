@isTest
private class OASComAdobeSocialIntegrationsLivefyrTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeSocialIntegrationsLivefyr comAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties1 = OASComAdobeSocialIntegrationsLivefyr.getExample();
        OASComAdobeSocialIntegrationsLivefyr comAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties2 = comAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties1;
        OASComAdobeSocialIntegrationsLivefyr comAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties3 = new OASComAdobeSocialIntegrationsLivefyr();
        OASComAdobeSocialIntegrationsLivefyr comAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties4 = comAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties3;

        System.assert(comAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties1.equals(comAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties2));
        System.assert(comAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties2.equals(comAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties1));
        System.assert(comAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties1.equals(comAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties1));
        System.assert(comAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties3.equals(comAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties4));
        System.assert(comAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties4.equals(comAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties3));
        System.assert(comAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties3.equals(comAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeSocialIntegrationsLivefyr comAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties1 = OASComAdobeSocialIntegrationsLivefyr.getExample();
        OASComAdobeSocialIntegrationsLivefyr comAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties2 = OASComAdobeSocialIntegrationsLivefyr.getExample();
        OASComAdobeSocialIntegrationsLivefyr comAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties3 = new OASComAdobeSocialIntegrationsLivefyr();
        OASComAdobeSocialIntegrationsLivefyr comAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties4 = new OASComAdobeSocialIntegrationsLivefyr();

        System.assert(comAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties1.equals(comAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties2));
        System.assert(comAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties2.equals(comAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties1));
        System.assert(comAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties3.equals(comAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties4));
        System.assert(comAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties4.equals(comAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeSocialIntegrationsLivefyr comAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties1 = OASComAdobeSocialIntegrationsLivefyr.getExample();
        OASComAdobeSocialIntegrationsLivefyr comAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties2 = new OASComAdobeSocialIntegrationsLivefyr();

        System.assertEquals(false, comAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties1.equals('foo'));
        System.assertEquals(false, comAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeSocialIntegrationsLivefyr comAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties1 = OASComAdobeSocialIntegrationsLivefyr.getExample();
        OASComAdobeSocialIntegrationsLivefyr comAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties2 = new OASComAdobeSocialIntegrationsLivefyr();
        OASComAdobeSocialIntegrationsLivefyr comAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties3;

        System.assertEquals(false, comAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties1.equals(comAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties3));
        System.assertEquals(false, comAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties2.equals(comAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeSocialIntegrationsLivefyr comAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties1 = OASComAdobeSocialIntegrationsLivefyr.getExample();
        OASComAdobeSocialIntegrationsLivefyr comAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties2 = new OASComAdobeSocialIntegrationsLivefyr();

        System.assertEquals(comAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties1.hashCode(), comAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties1.hashCode());
        System.assertEquals(comAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties2.hashCode(), comAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeSocialIntegrationsLivefyr comAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties1 = OASComAdobeSocialIntegrationsLivefyr.getExample();
        OASComAdobeSocialIntegrationsLivefyr comAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties2 = OASComAdobeSocialIntegrationsLivefyr.getExample();
        OASComAdobeSocialIntegrationsLivefyr comAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties3 = new OASComAdobeSocialIntegrationsLivefyr();
        OASComAdobeSocialIntegrationsLivefyr comAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties4 = new OASComAdobeSocialIntegrationsLivefyr();

        System.assert(comAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties1.equals(comAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties2));
        System.assert(comAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties3.equals(comAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties4));
        System.assertEquals(comAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties1.hashCode(), comAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties2.hashCode());
        System.assertEquals(comAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties3.hashCode(), comAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeSocialIntegrationsLivefyr comAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties = new OASComAdobeSocialIntegrationsLivefyr();
        Map<String, String> propertyMappings = comAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties.getPropertyMappings();
        System.assertEquals('communitiesIntegrationLivefyreSlingEventFilter', propertyMappings.get('communities.integration.livefyre.sling.event.filter'));
    }
}
