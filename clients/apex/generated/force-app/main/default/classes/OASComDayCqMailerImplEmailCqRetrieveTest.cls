@isTest
private class OASComDayCqMailerImplEmailCqRetrieveTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqMailerImplEmailCqRetrieve comDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties1 = OASComDayCqMailerImplEmailCqRetrieve.getExample();
        OASComDayCqMailerImplEmailCqRetrieve comDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties2 = comDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties1;
        OASComDayCqMailerImplEmailCqRetrieve comDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties3 = new OASComDayCqMailerImplEmailCqRetrieve();
        OASComDayCqMailerImplEmailCqRetrieve comDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties4 = comDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties3;

        System.assert(comDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties1.equals(comDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties2));
        System.assert(comDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties2.equals(comDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties1));
        System.assert(comDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties1.equals(comDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties1));
        System.assert(comDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties3.equals(comDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties4));
        System.assert(comDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties4.equals(comDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties3));
        System.assert(comDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties3.equals(comDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqMailerImplEmailCqRetrieve comDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties1 = OASComDayCqMailerImplEmailCqRetrieve.getExample();
        OASComDayCqMailerImplEmailCqRetrieve comDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties2 = OASComDayCqMailerImplEmailCqRetrieve.getExample();
        OASComDayCqMailerImplEmailCqRetrieve comDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties3 = new OASComDayCqMailerImplEmailCqRetrieve();
        OASComDayCqMailerImplEmailCqRetrieve comDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties4 = new OASComDayCqMailerImplEmailCqRetrieve();

        System.assert(comDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties1.equals(comDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties2));
        System.assert(comDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties2.equals(comDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties1));
        System.assert(comDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties3.equals(comDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties4));
        System.assert(comDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties4.equals(comDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqMailerImplEmailCqRetrieve comDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties1 = OASComDayCqMailerImplEmailCqRetrieve.getExample();
        OASComDayCqMailerImplEmailCqRetrieve comDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties2 = new OASComDayCqMailerImplEmailCqRetrieve();

        System.assertEquals(false, comDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties1.equals('foo'));
        System.assertEquals(false, comDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqMailerImplEmailCqRetrieve comDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties1 = OASComDayCqMailerImplEmailCqRetrieve.getExample();
        OASComDayCqMailerImplEmailCqRetrieve comDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties2 = new OASComDayCqMailerImplEmailCqRetrieve();
        OASComDayCqMailerImplEmailCqRetrieve comDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties3;

        System.assertEquals(false, comDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties1.equals(comDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties3));
        System.assertEquals(false, comDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties2.equals(comDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqMailerImplEmailCqRetrieve comDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties1 = OASComDayCqMailerImplEmailCqRetrieve.getExample();
        OASComDayCqMailerImplEmailCqRetrieve comDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties2 = new OASComDayCqMailerImplEmailCqRetrieve();

        System.assertEquals(comDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties1.hashCode(), comDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties1.hashCode());
        System.assertEquals(comDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties2.hashCode(), comDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqMailerImplEmailCqRetrieve comDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties1 = OASComDayCqMailerImplEmailCqRetrieve.getExample();
        OASComDayCqMailerImplEmailCqRetrieve comDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties2 = OASComDayCqMailerImplEmailCqRetrieve.getExample();
        OASComDayCqMailerImplEmailCqRetrieve comDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties3 = new OASComDayCqMailerImplEmailCqRetrieve();
        OASComDayCqMailerImplEmailCqRetrieve comDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties4 = new OASComDayCqMailerImplEmailCqRetrieve();

        System.assert(comDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties1.equals(comDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties2));
        System.assert(comDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties3.equals(comDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties4));
        System.assertEquals(comDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties1.hashCode(), comDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties2.hashCode());
        System.assertEquals(comDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties3.hashCode(), comDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComDayCqMailerImplEmailCqRetrieve comDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties = new OASComDayCqMailerImplEmailCqRetrieve();
        Map<String, String> propertyMappings = comDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties.getPropertyMappings();
        System.assertEquals('mailerEmailEmbed', propertyMappings.get('mailer.email.embed'));
        System.assertEquals('mailerEmailCharset', propertyMappings.get('mailer.email.charset'));
        System.assertEquals('mailerEmailRetrieverUserID', propertyMappings.get('mailer.email.retrieverUserID'));
        System.assertEquals('mailerEmailRetrieverUserPWD', propertyMappings.get('mailer.email.retrieverUserPWD'));
    }
}
