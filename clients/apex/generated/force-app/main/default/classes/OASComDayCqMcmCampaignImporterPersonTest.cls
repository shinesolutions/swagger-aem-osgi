@isTest
private class OASComDayCqMcmCampaignImporterPersonTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqMcmCampaignImporterPerson comDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryProperties1 = OASComDayCqMcmCampaignImporterPerson.getExample();
        OASComDayCqMcmCampaignImporterPerson comDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryProperties2 = comDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryProperties1;
        OASComDayCqMcmCampaignImporterPerson comDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryProperties3 = new OASComDayCqMcmCampaignImporterPerson();
        OASComDayCqMcmCampaignImporterPerson comDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryProperties4 = comDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryProperties3;

        System.assert(comDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryProperties1.equals(comDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryProperties2));
        System.assert(comDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryProperties2.equals(comDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryProperties1));
        System.assert(comDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryProperties1.equals(comDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryProperties1));
        System.assert(comDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryProperties3.equals(comDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryProperties4));
        System.assert(comDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryProperties4.equals(comDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryProperties3));
        System.assert(comDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryProperties3.equals(comDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqMcmCampaignImporterPerson comDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryProperties1 = OASComDayCqMcmCampaignImporterPerson.getExample();
        OASComDayCqMcmCampaignImporterPerson comDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryProperties2 = OASComDayCqMcmCampaignImporterPerson.getExample();
        OASComDayCqMcmCampaignImporterPerson comDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryProperties3 = new OASComDayCqMcmCampaignImporterPerson();
        OASComDayCqMcmCampaignImporterPerson comDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryProperties4 = new OASComDayCqMcmCampaignImporterPerson();

        System.assert(comDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryProperties1.equals(comDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryProperties2));
        System.assert(comDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryProperties2.equals(comDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryProperties1));
        System.assert(comDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryProperties3.equals(comDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryProperties4));
        System.assert(comDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryProperties4.equals(comDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqMcmCampaignImporterPerson comDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryProperties1 = OASComDayCqMcmCampaignImporterPerson.getExample();
        OASComDayCqMcmCampaignImporterPerson comDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryProperties2 = new OASComDayCqMcmCampaignImporterPerson();

        System.assertEquals(false, comDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryProperties1.equals('foo'));
        System.assertEquals(false, comDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqMcmCampaignImporterPerson comDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryProperties1 = OASComDayCqMcmCampaignImporterPerson.getExample();
        OASComDayCqMcmCampaignImporterPerson comDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryProperties2 = new OASComDayCqMcmCampaignImporterPerson();
        OASComDayCqMcmCampaignImporterPerson comDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryProperties3;

        System.assertEquals(false, comDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryProperties1.equals(comDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryProperties3));
        System.assertEquals(false, comDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryProperties2.equals(comDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqMcmCampaignImporterPerson comDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryProperties1 = OASComDayCqMcmCampaignImporterPerson.getExample();
        OASComDayCqMcmCampaignImporterPerson comDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryProperties2 = new OASComDayCqMcmCampaignImporterPerson();

        System.assertEquals(comDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryProperties1.hashCode(), comDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryProperties1.hashCode());
        System.assertEquals(comDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryProperties2.hashCode(), comDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqMcmCampaignImporterPerson comDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryProperties1 = OASComDayCqMcmCampaignImporterPerson.getExample();
        OASComDayCqMcmCampaignImporterPerson comDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryProperties2 = OASComDayCqMcmCampaignImporterPerson.getExample();
        OASComDayCqMcmCampaignImporterPerson comDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryProperties3 = new OASComDayCqMcmCampaignImporterPerson();
        OASComDayCqMcmCampaignImporterPerson comDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryProperties4 = new OASComDayCqMcmCampaignImporterPerson();

        System.assert(comDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryProperties1.equals(comDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryProperties2));
        System.assert(comDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryProperties3.equals(comDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryProperties4));
        System.assertEquals(comDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryProperties1.hashCode(), comDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryProperties2.hashCode());
        System.assertEquals(comDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryProperties3.hashCode(), comDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComDayCqMcmCampaignImporterPerson comDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryProperties = new OASComDayCqMcmCampaignImporterPerson();
        Map<String, String> propertyMappings = comDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryProperties.getPropertyMappings();
        System.assertEquals('serviceRanking', propertyMappings.get('service.ranking'));
    }
}
