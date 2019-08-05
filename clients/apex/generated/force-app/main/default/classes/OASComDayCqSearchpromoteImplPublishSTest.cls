@isTest
private class OASComDayCqSearchpromoteImplPublishSTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqSearchpromoteImplPublishS comDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties1 = OASComDayCqSearchpromoteImplPublishS.getExample();
        OASComDayCqSearchpromoteImplPublishS comDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties2 = comDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties1;
        OASComDayCqSearchpromoteImplPublishS comDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties3 = new OASComDayCqSearchpromoteImplPublishS();
        OASComDayCqSearchpromoteImplPublishS comDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties4 = comDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties3;

        System.assert(comDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties1.equals(comDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties2));
        System.assert(comDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties2.equals(comDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties1));
        System.assert(comDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties1.equals(comDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties1));
        System.assert(comDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties3.equals(comDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties4));
        System.assert(comDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties4.equals(comDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties3));
        System.assert(comDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties3.equals(comDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqSearchpromoteImplPublishS comDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties1 = OASComDayCqSearchpromoteImplPublishS.getExample();
        OASComDayCqSearchpromoteImplPublishS comDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties2 = OASComDayCqSearchpromoteImplPublishS.getExample();
        OASComDayCqSearchpromoteImplPublishS comDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties3 = new OASComDayCqSearchpromoteImplPublishS();
        OASComDayCqSearchpromoteImplPublishS comDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties4 = new OASComDayCqSearchpromoteImplPublishS();

        System.assert(comDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties1.equals(comDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties2));
        System.assert(comDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties2.equals(comDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties1));
        System.assert(comDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties3.equals(comDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties4));
        System.assert(comDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties4.equals(comDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqSearchpromoteImplPublishS comDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties1 = OASComDayCqSearchpromoteImplPublishS.getExample();
        OASComDayCqSearchpromoteImplPublishS comDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties2 = new OASComDayCqSearchpromoteImplPublishS();

        System.assertEquals(false, comDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties1.equals('foo'));
        System.assertEquals(false, comDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqSearchpromoteImplPublishS comDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties1 = OASComDayCqSearchpromoteImplPublishS.getExample();
        OASComDayCqSearchpromoteImplPublishS comDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties2 = new OASComDayCqSearchpromoteImplPublishS();
        OASComDayCqSearchpromoteImplPublishS comDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties3;

        System.assertEquals(false, comDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties1.equals(comDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties3));
        System.assertEquals(false, comDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties2.equals(comDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqSearchpromoteImplPublishS comDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties1 = OASComDayCqSearchpromoteImplPublishS.getExample();
        OASComDayCqSearchpromoteImplPublishS comDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties2 = new OASComDayCqSearchpromoteImplPublishS();

        System.assertEquals(comDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties1.hashCode(), comDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties1.hashCode());
        System.assertEquals(comDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties2.hashCode(), comDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqSearchpromoteImplPublishS comDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties1 = OASComDayCqSearchpromoteImplPublishS.getExample();
        OASComDayCqSearchpromoteImplPublishS comDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties2 = OASComDayCqSearchpromoteImplPublishS.getExample();
        OASComDayCqSearchpromoteImplPublishS comDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties3 = new OASComDayCqSearchpromoteImplPublishS();
        OASComDayCqSearchpromoteImplPublishS comDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties4 = new OASComDayCqSearchpromoteImplPublishS();

        System.assert(comDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties1.equals(comDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties2));
        System.assert(comDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties3.equals(comDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties4));
        System.assertEquals(comDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties1.hashCode(), comDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties2.hashCode());
        System.assertEquals(comDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties3.hashCode(), comDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComDayCqSearchpromoteImplPublishS comDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties = new OASComDayCqSearchpromoteImplPublishS();
        Map<String, String> propertyMappings = comDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties.getPropertyMappings();
        System.assertEquals('cqSearchpromoteConfighandlerEnabled', propertyMappings.get('cq.searchpromote.confighandler.enabled'));
    }
}
