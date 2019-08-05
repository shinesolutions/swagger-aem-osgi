@isTest
private class OASComDayCqMailerImplEmailCqEmailTemTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqMailerImplEmailCqEmailTem comDayCqMailerImplEmailCqEmailTemplateFactoryProperties1 = OASComDayCqMailerImplEmailCqEmailTem.getExample();
        OASComDayCqMailerImplEmailCqEmailTem comDayCqMailerImplEmailCqEmailTemplateFactoryProperties2 = comDayCqMailerImplEmailCqEmailTemplateFactoryProperties1;
        OASComDayCqMailerImplEmailCqEmailTem comDayCqMailerImplEmailCqEmailTemplateFactoryProperties3 = new OASComDayCqMailerImplEmailCqEmailTem();
        OASComDayCqMailerImplEmailCqEmailTem comDayCqMailerImplEmailCqEmailTemplateFactoryProperties4 = comDayCqMailerImplEmailCqEmailTemplateFactoryProperties3;

        System.assert(comDayCqMailerImplEmailCqEmailTemplateFactoryProperties1.equals(comDayCqMailerImplEmailCqEmailTemplateFactoryProperties2));
        System.assert(comDayCqMailerImplEmailCqEmailTemplateFactoryProperties2.equals(comDayCqMailerImplEmailCqEmailTemplateFactoryProperties1));
        System.assert(comDayCqMailerImplEmailCqEmailTemplateFactoryProperties1.equals(comDayCqMailerImplEmailCqEmailTemplateFactoryProperties1));
        System.assert(comDayCqMailerImplEmailCqEmailTemplateFactoryProperties3.equals(comDayCqMailerImplEmailCqEmailTemplateFactoryProperties4));
        System.assert(comDayCqMailerImplEmailCqEmailTemplateFactoryProperties4.equals(comDayCqMailerImplEmailCqEmailTemplateFactoryProperties3));
        System.assert(comDayCqMailerImplEmailCqEmailTemplateFactoryProperties3.equals(comDayCqMailerImplEmailCqEmailTemplateFactoryProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqMailerImplEmailCqEmailTem comDayCqMailerImplEmailCqEmailTemplateFactoryProperties1 = OASComDayCqMailerImplEmailCqEmailTem.getExample();
        OASComDayCqMailerImplEmailCqEmailTem comDayCqMailerImplEmailCqEmailTemplateFactoryProperties2 = OASComDayCqMailerImplEmailCqEmailTem.getExample();
        OASComDayCqMailerImplEmailCqEmailTem comDayCqMailerImplEmailCqEmailTemplateFactoryProperties3 = new OASComDayCqMailerImplEmailCqEmailTem();
        OASComDayCqMailerImplEmailCqEmailTem comDayCqMailerImplEmailCqEmailTemplateFactoryProperties4 = new OASComDayCqMailerImplEmailCqEmailTem();

        System.assert(comDayCqMailerImplEmailCqEmailTemplateFactoryProperties1.equals(comDayCqMailerImplEmailCqEmailTemplateFactoryProperties2));
        System.assert(comDayCqMailerImplEmailCqEmailTemplateFactoryProperties2.equals(comDayCqMailerImplEmailCqEmailTemplateFactoryProperties1));
        System.assert(comDayCqMailerImplEmailCqEmailTemplateFactoryProperties3.equals(comDayCqMailerImplEmailCqEmailTemplateFactoryProperties4));
        System.assert(comDayCqMailerImplEmailCqEmailTemplateFactoryProperties4.equals(comDayCqMailerImplEmailCqEmailTemplateFactoryProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqMailerImplEmailCqEmailTem comDayCqMailerImplEmailCqEmailTemplateFactoryProperties1 = OASComDayCqMailerImplEmailCqEmailTem.getExample();
        OASComDayCqMailerImplEmailCqEmailTem comDayCqMailerImplEmailCqEmailTemplateFactoryProperties2 = new OASComDayCqMailerImplEmailCqEmailTem();

        System.assertEquals(false, comDayCqMailerImplEmailCqEmailTemplateFactoryProperties1.equals('foo'));
        System.assertEquals(false, comDayCqMailerImplEmailCqEmailTemplateFactoryProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqMailerImplEmailCqEmailTem comDayCqMailerImplEmailCqEmailTemplateFactoryProperties1 = OASComDayCqMailerImplEmailCqEmailTem.getExample();
        OASComDayCqMailerImplEmailCqEmailTem comDayCqMailerImplEmailCqEmailTemplateFactoryProperties2 = new OASComDayCqMailerImplEmailCqEmailTem();
        OASComDayCqMailerImplEmailCqEmailTem comDayCqMailerImplEmailCqEmailTemplateFactoryProperties3;

        System.assertEquals(false, comDayCqMailerImplEmailCqEmailTemplateFactoryProperties1.equals(comDayCqMailerImplEmailCqEmailTemplateFactoryProperties3));
        System.assertEquals(false, comDayCqMailerImplEmailCqEmailTemplateFactoryProperties2.equals(comDayCqMailerImplEmailCqEmailTemplateFactoryProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqMailerImplEmailCqEmailTem comDayCqMailerImplEmailCqEmailTemplateFactoryProperties1 = OASComDayCqMailerImplEmailCqEmailTem.getExample();
        OASComDayCqMailerImplEmailCqEmailTem comDayCqMailerImplEmailCqEmailTemplateFactoryProperties2 = new OASComDayCqMailerImplEmailCqEmailTem();

        System.assertEquals(comDayCqMailerImplEmailCqEmailTemplateFactoryProperties1.hashCode(), comDayCqMailerImplEmailCqEmailTemplateFactoryProperties1.hashCode());
        System.assertEquals(comDayCqMailerImplEmailCqEmailTemplateFactoryProperties2.hashCode(), comDayCqMailerImplEmailCqEmailTemplateFactoryProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqMailerImplEmailCqEmailTem comDayCqMailerImplEmailCqEmailTemplateFactoryProperties1 = OASComDayCqMailerImplEmailCqEmailTem.getExample();
        OASComDayCqMailerImplEmailCqEmailTem comDayCqMailerImplEmailCqEmailTemplateFactoryProperties2 = OASComDayCqMailerImplEmailCqEmailTem.getExample();
        OASComDayCqMailerImplEmailCqEmailTem comDayCqMailerImplEmailCqEmailTemplateFactoryProperties3 = new OASComDayCqMailerImplEmailCqEmailTem();
        OASComDayCqMailerImplEmailCqEmailTem comDayCqMailerImplEmailCqEmailTemplateFactoryProperties4 = new OASComDayCqMailerImplEmailCqEmailTem();

        System.assert(comDayCqMailerImplEmailCqEmailTemplateFactoryProperties1.equals(comDayCqMailerImplEmailCqEmailTemplateFactoryProperties2));
        System.assert(comDayCqMailerImplEmailCqEmailTemplateFactoryProperties3.equals(comDayCqMailerImplEmailCqEmailTemplateFactoryProperties4));
        System.assertEquals(comDayCqMailerImplEmailCqEmailTemplateFactoryProperties1.hashCode(), comDayCqMailerImplEmailCqEmailTemplateFactoryProperties2.hashCode());
        System.assertEquals(comDayCqMailerImplEmailCqEmailTemplateFactoryProperties3.hashCode(), comDayCqMailerImplEmailCqEmailTemplateFactoryProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComDayCqMailerImplEmailCqEmailTem comDayCqMailerImplEmailCqEmailTemplateFactoryProperties = new OASComDayCqMailerImplEmailCqEmailTem();
        Map<String, String> propertyMappings = comDayCqMailerImplEmailCqEmailTemplateFactoryProperties.getPropertyMappings();
        System.assertEquals('mailerEmailCharset', propertyMappings.get('mailer.email.charset'));
    }
}
