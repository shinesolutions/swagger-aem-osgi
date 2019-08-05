@isTest
private class OASComDayCqMcmCoreNewsletterNewslettTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqMcmCoreNewsletterNewslett comDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties1 = OASComDayCqMcmCoreNewsletterNewslett.getExample();
        OASComDayCqMcmCoreNewsletterNewslett comDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties2 = comDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties1;
        OASComDayCqMcmCoreNewsletterNewslett comDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties3 = new OASComDayCqMcmCoreNewsletterNewslett();
        OASComDayCqMcmCoreNewsletterNewslett comDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties4 = comDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties3;

        System.assert(comDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties1.equals(comDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties2));
        System.assert(comDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties2.equals(comDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties1));
        System.assert(comDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties1.equals(comDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties1));
        System.assert(comDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties3.equals(comDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties4));
        System.assert(comDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties4.equals(comDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties3));
        System.assert(comDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties3.equals(comDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqMcmCoreNewsletterNewslett comDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties1 = OASComDayCqMcmCoreNewsletterNewslett.getExample();
        OASComDayCqMcmCoreNewsletterNewslett comDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties2 = OASComDayCqMcmCoreNewsletterNewslett.getExample();
        OASComDayCqMcmCoreNewsletterNewslett comDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties3 = new OASComDayCqMcmCoreNewsletterNewslett();
        OASComDayCqMcmCoreNewsletterNewslett comDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties4 = new OASComDayCqMcmCoreNewsletterNewslett();

        System.assert(comDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties1.equals(comDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties2));
        System.assert(comDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties2.equals(comDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties1));
        System.assert(comDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties3.equals(comDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties4));
        System.assert(comDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties4.equals(comDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqMcmCoreNewsletterNewslett comDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties1 = OASComDayCqMcmCoreNewsletterNewslett.getExample();
        OASComDayCqMcmCoreNewsletterNewslett comDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties2 = new OASComDayCqMcmCoreNewsletterNewslett();

        System.assertEquals(false, comDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties1.equals('foo'));
        System.assertEquals(false, comDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqMcmCoreNewsletterNewslett comDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties1 = OASComDayCqMcmCoreNewsletterNewslett.getExample();
        OASComDayCqMcmCoreNewsletterNewslett comDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties2 = new OASComDayCqMcmCoreNewsletterNewslett();
        OASComDayCqMcmCoreNewsletterNewslett comDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties3;

        System.assertEquals(false, comDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties1.equals(comDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties3));
        System.assertEquals(false, comDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties2.equals(comDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqMcmCoreNewsletterNewslett comDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties1 = OASComDayCqMcmCoreNewsletterNewslett.getExample();
        OASComDayCqMcmCoreNewsletterNewslett comDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties2 = new OASComDayCqMcmCoreNewsletterNewslett();

        System.assertEquals(comDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties1.hashCode(), comDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties1.hashCode());
        System.assertEquals(comDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties2.hashCode(), comDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqMcmCoreNewsletterNewslett comDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties1 = OASComDayCqMcmCoreNewsletterNewslett.getExample();
        OASComDayCqMcmCoreNewsletterNewslett comDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties2 = OASComDayCqMcmCoreNewsletterNewslett.getExample();
        OASComDayCqMcmCoreNewsletterNewslett comDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties3 = new OASComDayCqMcmCoreNewsletterNewslett();
        OASComDayCqMcmCoreNewsletterNewslett comDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties4 = new OASComDayCqMcmCoreNewsletterNewslett();

        System.assert(comDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties1.equals(comDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties2));
        System.assert(comDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties3.equals(comDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties4));
        System.assertEquals(comDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties1.hashCode(), comDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties2.hashCode());
        System.assertEquals(comDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties3.hashCode(), comDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComDayCqMcmCoreNewsletterNewslett comDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties = new OASComDayCqMcmCoreNewsletterNewslett();
        Map<String, String> propertyMappings = comDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties.getPropertyMappings();
        System.assertEquals('fromAddress', propertyMappings.get('from.address'));
        System.assertEquals('senderHost', propertyMappings.get('sender.host'));
        System.assertEquals('maxBounceCount', propertyMappings.get('max.bounce.count'));
    }
}
