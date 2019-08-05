@isTest
private class OASComAdobeCqSocialEnablementServiceTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeCqSocialEnablementService comAdobeCqSocialEnablementServicesImplAuthorMarkerImplProperties1 = OASComAdobeCqSocialEnablementService.getExample();
        OASComAdobeCqSocialEnablementService comAdobeCqSocialEnablementServicesImplAuthorMarkerImplProperties2 = comAdobeCqSocialEnablementServicesImplAuthorMarkerImplProperties1;
        OASComAdobeCqSocialEnablementService comAdobeCqSocialEnablementServicesImplAuthorMarkerImplProperties3 = new OASComAdobeCqSocialEnablementService();
        OASComAdobeCqSocialEnablementService comAdobeCqSocialEnablementServicesImplAuthorMarkerImplProperties4 = comAdobeCqSocialEnablementServicesImplAuthorMarkerImplProperties3;

        System.assert(comAdobeCqSocialEnablementServicesImplAuthorMarkerImplProperties1.equals(comAdobeCqSocialEnablementServicesImplAuthorMarkerImplProperties2));
        System.assert(comAdobeCqSocialEnablementServicesImplAuthorMarkerImplProperties2.equals(comAdobeCqSocialEnablementServicesImplAuthorMarkerImplProperties1));
        System.assert(comAdobeCqSocialEnablementServicesImplAuthorMarkerImplProperties1.equals(comAdobeCqSocialEnablementServicesImplAuthorMarkerImplProperties1));
        System.assert(comAdobeCqSocialEnablementServicesImplAuthorMarkerImplProperties3.equals(comAdobeCqSocialEnablementServicesImplAuthorMarkerImplProperties4));
        System.assert(comAdobeCqSocialEnablementServicesImplAuthorMarkerImplProperties4.equals(comAdobeCqSocialEnablementServicesImplAuthorMarkerImplProperties3));
        System.assert(comAdobeCqSocialEnablementServicesImplAuthorMarkerImplProperties3.equals(comAdobeCqSocialEnablementServicesImplAuthorMarkerImplProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeCqSocialEnablementService comAdobeCqSocialEnablementServicesImplAuthorMarkerImplProperties1 = OASComAdobeCqSocialEnablementService.getExample();
        OASComAdobeCqSocialEnablementService comAdobeCqSocialEnablementServicesImplAuthorMarkerImplProperties2 = OASComAdobeCqSocialEnablementService.getExample();
        OASComAdobeCqSocialEnablementService comAdobeCqSocialEnablementServicesImplAuthorMarkerImplProperties3 = new OASComAdobeCqSocialEnablementService();
        OASComAdobeCqSocialEnablementService comAdobeCqSocialEnablementServicesImplAuthorMarkerImplProperties4 = new OASComAdobeCqSocialEnablementService();

        System.assert(comAdobeCqSocialEnablementServicesImplAuthorMarkerImplProperties1.equals(comAdobeCqSocialEnablementServicesImplAuthorMarkerImplProperties2));
        System.assert(comAdobeCqSocialEnablementServicesImplAuthorMarkerImplProperties2.equals(comAdobeCqSocialEnablementServicesImplAuthorMarkerImplProperties1));
        System.assert(comAdobeCqSocialEnablementServicesImplAuthorMarkerImplProperties3.equals(comAdobeCqSocialEnablementServicesImplAuthorMarkerImplProperties4));
        System.assert(comAdobeCqSocialEnablementServicesImplAuthorMarkerImplProperties4.equals(comAdobeCqSocialEnablementServicesImplAuthorMarkerImplProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeCqSocialEnablementService comAdobeCqSocialEnablementServicesImplAuthorMarkerImplProperties1 = OASComAdobeCqSocialEnablementService.getExample();
        OASComAdobeCqSocialEnablementService comAdobeCqSocialEnablementServicesImplAuthorMarkerImplProperties2 = new OASComAdobeCqSocialEnablementService();

        System.assertEquals(false, comAdobeCqSocialEnablementServicesImplAuthorMarkerImplProperties1.equals('foo'));
        System.assertEquals(false, comAdobeCqSocialEnablementServicesImplAuthorMarkerImplProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeCqSocialEnablementService comAdobeCqSocialEnablementServicesImplAuthorMarkerImplProperties1 = OASComAdobeCqSocialEnablementService.getExample();
        OASComAdobeCqSocialEnablementService comAdobeCqSocialEnablementServicesImplAuthorMarkerImplProperties2 = new OASComAdobeCqSocialEnablementService();
        OASComAdobeCqSocialEnablementService comAdobeCqSocialEnablementServicesImplAuthorMarkerImplProperties3;

        System.assertEquals(false, comAdobeCqSocialEnablementServicesImplAuthorMarkerImplProperties1.equals(comAdobeCqSocialEnablementServicesImplAuthorMarkerImplProperties3));
        System.assertEquals(false, comAdobeCqSocialEnablementServicesImplAuthorMarkerImplProperties2.equals(comAdobeCqSocialEnablementServicesImplAuthorMarkerImplProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeCqSocialEnablementService comAdobeCqSocialEnablementServicesImplAuthorMarkerImplProperties1 = OASComAdobeCqSocialEnablementService.getExample();
        OASComAdobeCqSocialEnablementService comAdobeCqSocialEnablementServicesImplAuthorMarkerImplProperties2 = new OASComAdobeCqSocialEnablementService();

        System.assertEquals(comAdobeCqSocialEnablementServicesImplAuthorMarkerImplProperties1.hashCode(), comAdobeCqSocialEnablementServicesImplAuthorMarkerImplProperties1.hashCode());
        System.assertEquals(comAdobeCqSocialEnablementServicesImplAuthorMarkerImplProperties2.hashCode(), comAdobeCqSocialEnablementServicesImplAuthorMarkerImplProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeCqSocialEnablementService comAdobeCqSocialEnablementServicesImplAuthorMarkerImplProperties1 = OASComAdobeCqSocialEnablementService.getExample();
        OASComAdobeCqSocialEnablementService comAdobeCqSocialEnablementServicesImplAuthorMarkerImplProperties2 = OASComAdobeCqSocialEnablementService.getExample();
        OASComAdobeCqSocialEnablementService comAdobeCqSocialEnablementServicesImplAuthorMarkerImplProperties3 = new OASComAdobeCqSocialEnablementService();
        OASComAdobeCqSocialEnablementService comAdobeCqSocialEnablementServicesImplAuthorMarkerImplProperties4 = new OASComAdobeCqSocialEnablementService();

        System.assert(comAdobeCqSocialEnablementServicesImplAuthorMarkerImplProperties1.equals(comAdobeCqSocialEnablementServicesImplAuthorMarkerImplProperties2));
        System.assert(comAdobeCqSocialEnablementServicesImplAuthorMarkerImplProperties3.equals(comAdobeCqSocialEnablementServicesImplAuthorMarkerImplProperties4));
        System.assertEquals(comAdobeCqSocialEnablementServicesImplAuthorMarkerImplProperties1.hashCode(), comAdobeCqSocialEnablementServicesImplAuthorMarkerImplProperties2.hashCode());
        System.assertEquals(comAdobeCqSocialEnablementServicesImplAuthorMarkerImplProperties3.hashCode(), comAdobeCqSocialEnablementServicesImplAuthorMarkerImplProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeCqSocialEnablementService comAdobeCqSocialEnablementServicesImplAuthorMarkerImplProperties = new OASComAdobeCqSocialEnablementService();
        Map<String, String> propertyMappings = comAdobeCqSocialEnablementServicesImplAuthorMarkerImplProperties.getPropertyMappings();
        System.assertEquals('serviceRanking', propertyMappings.get('service.ranking'));
    }
}
