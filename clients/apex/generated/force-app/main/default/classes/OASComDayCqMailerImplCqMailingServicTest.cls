@isTest
private class OASComDayCqMailerImplCqMailingServicTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqMailerImplCqMailingServic comDayCqMailerImplCqMailingServiceProperties1 = OASComDayCqMailerImplCqMailingServic.getExample();
        OASComDayCqMailerImplCqMailingServic comDayCqMailerImplCqMailingServiceProperties2 = comDayCqMailerImplCqMailingServiceProperties1;
        OASComDayCqMailerImplCqMailingServic comDayCqMailerImplCqMailingServiceProperties3 = new OASComDayCqMailerImplCqMailingServic();
        OASComDayCqMailerImplCqMailingServic comDayCqMailerImplCqMailingServiceProperties4 = comDayCqMailerImplCqMailingServiceProperties3;

        System.assert(comDayCqMailerImplCqMailingServiceProperties1.equals(comDayCqMailerImplCqMailingServiceProperties2));
        System.assert(comDayCqMailerImplCqMailingServiceProperties2.equals(comDayCqMailerImplCqMailingServiceProperties1));
        System.assert(comDayCqMailerImplCqMailingServiceProperties1.equals(comDayCqMailerImplCqMailingServiceProperties1));
        System.assert(comDayCqMailerImplCqMailingServiceProperties3.equals(comDayCqMailerImplCqMailingServiceProperties4));
        System.assert(comDayCqMailerImplCqMailingServiceProperties4.equals(comDayCqMailerImplCqMailingServiceProperties3));
        System.assert(comDayCqMailerImplCqMailingServiceProperties3.equals(comDayCqMailerImplCqMailingServiceProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqMailerImplCqMailingServic comDayCqMailerImplCqMailingServiceProperties1 = OASComDayCqMailerImplCqMailingServic.getExample();
        OASComDayCqMailerImplCqMailingServic comDayCqMailerImplCqMailingServiceProperties2 = OASComDayCqMailerImplCqMailingServic.getExample();
        OASComDayCqMailerImplCqMailingServic comDayCqMailerImplCqMailingServiceProperties3 = new OASComDayCqMailerImplCqMailingServic();
        OASComDayCqMailerImplCqMailingServic comDayCqMailerImplCqMailingServiceProperties4 = new OASComDayCqMailerImplCqMailingServic();

        System.assert(comDayCqMailerImplCqMailingServiceProperties1.equals(comDayCqMailerImplCqMailingServiceProperties2));
        System.assert(comDayCqMailerImplCqMailingServiceProperties2.equals(comDayCqMailerImplCqMailingServiceProperties1));
        System.assert(comDayCqMailerImplCqMailingServiceProperties3.equals(comDayCqMailerImplCqMailingServiceProperties4));
        System.assert(comDayCqMailerImplCqMailingServiceProperties4.equals(comDayCqMailerImplCqMailingServiceProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqMailerImplCqMailingServic comDayCqMailerImplCqMailingServiceProperties1 = OASComDayCqMailerImplCqMailingServic.getExample();
        OASComDayCqMailerImplCqMailingServic comDayCqMailerImplCqMailingServiceProperties2 = new OASComDayCqMailerImplCqMailingServic();

        System.assertEquals(false, comDayCqMailerImplCqMailingServiceProperties1.equals('foo'));
        System.assertEquals(false, comDayCqMailerImplCqMailingServiceProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqMailerImplCqMailingServic comDayCqMailerImplCqMailingServiceProperties1 = OASComDayCqMailerImplCqMailingServic.getExample();
        OASComDayCqMailerImplCqMailingServic comDayCqMailerImplCqMailingServiceProperties2 = new OASComDayCqMailerImplCqMailingServic();
        OASComDayCqMailerImplCqMailingServic comDayCqMailerImplCqMailingServiceProperties3;

        System.assertEquals(false, comDayCqMailerImplCqMailingServiceProperties1.equals(comDayCqMailerImplCqMailingServiceProperties3));
        System.assertEquals(false, comDayCqMailerImplCqMailingServiceProperties2.equals(comDayCqMailerImplCqMailingServiceProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqMailerImplCqMailingServic comDayCqMailerImplCqMailingServiceProperties1 = OASComDayCqMailerImplCqMailingServic.getExample();
        OASComDayCqMailerImplCqMailingServic comDayCqMailerImplCqMailingServiceProperties2 = new OASComDayCqMailerImplCqMailingServic();

        System.assertEquals(comDayCqMailerImplCqMailingServiceProperties1.hashCode(), comDayCqMailerImplCqMailingServiceProperties1.hashCode());
        System.assertEquals(comDayCqMailerImplCqMailingServiceProperties2.hashCode(), comDayCqMailerImplCqMailingServiceProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqMailerImplCqMailingServic comDayCqMailerImplCqMailingServiceProperties1 = OASComDayCqMailerImplCqMailingServic.getExample();
        OASComDayCqMailerImplCqMailingServic comDayCqMailerImplCqMailingServiceProperties2 = OASComDayCqMailerImplCqMailingServic.getExample();
        OASComDayCqMailerImplCqMailingServic comDayCqMailerImplCqMailingServiceProperties3 = new OASComDayCqMailerImplCqMailingServic();
        OASComDayCqMailerImplCqMailingServic comDayCqMailerImplCqMailingServiceProperties4 = new OASComDayCqMailerImplCqMailingServic();

        System.assert(comDayCqMailerImplCqMailingServiceProperties1.equals(comDayCqMailerImplCqMailingServiceProperties2));
        System.assert(comDayCqMailerImplCqMailingServiceProperties3.equals(comDayCqMailerImplCqMailingServiceProperties4));
        System.assertEquals(comDayCqMailerImplCqMailingServiceProperties1.hashCode(), comDayCqMailerImplCqMailingServiceProperties2.hashCode());
        System.assertEquals(comDayCqMailerImplCqMailingServiceProperties3.hashCode(), comDayCqMailerImplCqMailingServiceProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComDayCqMailerImplCqMailingServic comDayCqMailerImplCqMailingServiceProperties = new OASComDayCqMailerImplCqMailingServic();
        Map<String, String> propertyMappings = comDayCqMailerImplCqMailingServiceProperties.getPropertyMappings();
        System.assertEquals('maxRecipientCount', propertyMappings.get('max.recipient.count'));
    }
}
