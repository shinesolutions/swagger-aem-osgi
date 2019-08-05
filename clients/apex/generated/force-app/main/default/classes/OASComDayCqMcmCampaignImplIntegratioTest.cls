@isTest
private class OASComDayCqMcmCampaignImplIntegratioTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqMcmCampaignImplIntegratio comDayCqMcmCampaignImplIntegrationConfigImplProperties1 = OASComDayCqMcmCampaignImplIntegratio.getExample();
        OASComDayCqMcmCampaignImplIntegratio comDayCqMcmCampaignImplIntegrationConfigImplProperties2 = comDayCqMcmCampaignImplIntegrationConfigImplProperties1;
        OASComDayCqMcmCampaignImplIntegratio comDayCqMcmCampaignImplIntegrationConfigImplProperties3 = new OASComDayCqMcmCampaignImplIntegratio();
        OASComDayCqMcmCampaignImplIntegratio comDayCqMcmCampaignImplIntegrationConfigImplProperties4 = comDayCqMcmCampaignImplIntegrationConfigImplProperties3;

        System.assert(comDayCqMcmCampaignImplIntegrationConfigImplProperties1.equals(comDayCqMcmCampaignImplIntegrationConfigImplProperties2));
        System.assert(comDayCqMcmCampaignImplIntegrationConfigImplProperties2.equals(comDayCqMcmCampaignImplIntegrationConfigImplProperties1));
        System.assert(comDayCqMcmCampaignImplIntegrationConfigImplProperties1.equals(comDayCqMcmCampaignImplIntegrationConfigImplProperties1));
        System.assert(comDayCqMcmCampaignImplIntegrationConfigImplProperties3.equals(comDayCqMcmCampaignImplIntegrationConfigImplProperties4));
        System.assert(comDayCqMcmCampaignImplIntegrationConfigImplProperties4.equals(comDayCqMcmCampaignImplIntegrationConfigImplProperties3));
        System.assert(comDayCqMcmCampaignImplIntegrationConfigImplProperties3.equals(comDayCqMcmCampaignImplIntegrationConfigImplProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqMcmCampaignImplIntegratio comDayCqMcmCampaignImplIntegrationConfigImplProperties1 = OASComDayCqMcmCampaignImplIntegratio.getExample();
        OASComDayCqMcmCampaignImplIntegratio comDayCqMcmCampaignImplIntegrationConfigImplProperties2 = OASComDayCqMcmCampaignImplIntegratio.getExample();
        OASComDayCqMcmCampaignImplIntegratio comDayCqMcmCampaignImplIntegrationConfigImplProperties3 = new OASComDayCqMcmCampaignImplIntegratio();
        OASComDayCqMcmCampaignImplIntegratio comDayCqMcmCampaignImplIntegrationConfigImplProperties4 = new OASComDayCqMcmCampaignImplIntegratio();

        System.assert(comDayCqMcmCampaignImplIntegrationConfigImplProperties1.equals(comDayCqMcmCampaignImplIntegrationConfigImplProperties2));
        System.assert(comDayCqMcmCampaignImplIntegrationConfigImplProperties2.equals(comDayCqMcmCampaignImplIntegrationConfigImplProperties1));
        System.assert(comDayCqMcmCampaignImplIntegrationConfigImplProperties3.equals(comDayCqMcmCampaignImplIntegrationConfigImplProperties4));
        System.assert(comDayCqMcmCampaignImplIntegrationConfigImplProperties4.equals(comDayCqMcmCampaignImplIntegrationConfigImplProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqMcmCampaignImplIntegratio comDayCqMcmCampaignImplIntegrationConfigImplProperties1 = OASComDayCqMcmCampaignImplIntegratio.getExample();
        OASComDayCqMcmCampaignImplIntegratio comDayCqMcmCampaignImplIntegrationConfigImplProperties2 = new OASComDayCqMcmCampaignImplIntegratio();

        System.assertEquals(false, comDayCqMcmCampaignImplIntegrationConfigImplProperties1.equals('foo'));
        System.assertEquals(false, comDayCqMcmCampaignImplIntegrationConfigImplProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqMcmCampaignImplIntegratio comDayCqMcmCampaignImplIntegrationConfigImplProperties1 = OASComDayCqMcmCampaignImplIntegratio.getExample();
        OASComDayCqMcmCampaignImplIntegratio comDayCqMcmCampaignImplIntegrationConfigImplProperties2 = new OASComDayCqMcmCampaignImplIntegratio();
        OASComDayCqMcmCampaignImplIntegratio comDayCqMcmCampaignImplIntegrationConfigImplProperties3;

        System.assertEquals(false, comDayCqMcmCampaignImplIntegrationConfigImplProperties1.equals(comDayCqMcmCampaignImplIntegrationConfigImplProperties3));
        System.assertEquals(false, comDayCqMcmCampaignImplIntegrationConfigImplProperties2.equals(comDayCqMcmCampaignImplIntegrationConfigImplProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqMcmCampaignImplIntegratio comDayCqMcmCampaignImplIntegrationConfigImplProperties1 = OASComDayCqMcmCampaignImplIntegratio.getExample();
        OASComDayCqMcmCampaignImplIntegratio comDayCqMcmCampaignImplIntegrationConfigImplProperties2 = new OASComDayCqMcmCampaignImplIntegratio();

        System.assertEquals(comDayCqMcmCampaignImplIntegrationConfigImplProperties1.hashCode(), comDayCqMcmCampaignImplIntegrationConfigImplProperties1.hashCode());
        System.assertEquals(comDayCqMcmCampaignImplIntegrationConfigImplProperties2.hashCode(), comDayCqMcmCampaignImplIntegrationConfigImplProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqMcmCampaignImplIntegratio comDayCqMcmCampaignImplIntegrationConfigImplProperties1 = OASComDayCqMcmCampaignImplIntegratio.getExample();
        OASComDayCqMcmCampaignImplIntegratio comDayCqMcmCampaignImplIntegrationConfigImplProperties2 = OASComDayCqMcmCampaignImplIntegratio.getExample();
        OASComDayCqMcmCampaignImplIntegratio comDayCqMcmCampaignImplIntegrationConfigImplProperties3 = new OASComDayCqMcmCampaignImplIntegratio();
        OASComDayCqMcmCampaignImplIntegratio comDayCqMcmCampaignImplIntegrationConfigImplProperties4 = new OASComDayCqMcmCampaignImplIntegratio();

        System.assert(comDayCqMcmCampaignImplIntegrationConfigImplProperties1.equals(comDayCqMcmCampaignImplIntegrationConfigImplProperties2));
        System.assert(comDayCqMcmCampaignImplIntegrationConfigImplProperties3.equals(comDayCqMcmCampaignImplIntegrationConfigImplProperties4));
        System.assertEquals(comDayCqMcmCampaignImplIntegrationConfigImplProperties1.hashCode(), comDayCqMcmCampaignImplIntegrationConfigImplProperties2.hashCode());
        System.assertEquals(comDayCqMcmCampaignImplIntegrationConfigImplProperties3.hashCode(), comDayCqMcmCampaignImplIntegrationConfigImplProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComDayCqMcmCampaignImplIntegratio comDayCqMcmCampaignImplIntegrationConfigImplProperties = new OASComDayCqMcmCampaignImplIntegratio();
        Map<String, String> propertyMappings = comDayCqMcmCampaignImplIntegrationConfigImplProperties.getPropertyMappings();
        System.assertEquals('aemMcmCampaignFormConstraints', propertyMappings.get('aem.mcm.campaign.formConstraints'));
        System.assertEquals('aemMcmCampaignPublicUrl', propertyMappings.get('aem.mcm.campaign.publicUrl'));
        System.assertEquals('aemMcmCampaignRelaxedSSL', propertyMappings.get('aem.mcm.campaign.relaxedSSL'));
    }
}
