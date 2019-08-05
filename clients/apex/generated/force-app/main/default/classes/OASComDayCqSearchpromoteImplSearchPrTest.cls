@isTest
private class OASComDayCqSearchpromoteImplSearchPrTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqSearchpromoteImplSearchPr comDayCqSearchpromoteImplSearchPromoteServiceImplProperties1 = OASComDayCqSearchpromoteImplSearchPr.getExample();
        OASComDayCqSearchpromoteImplSearchPr comDayCqSearchpromoteImplSearchPromoteServiceImplProperties2 = comDayCqSearchpromoteImplSearchPromoteServiceImplProperties1;
        OASComDayCqSearchpromoteImplSearchPr comDayCqSearchpromoteImplSearchPromoteServiceImplProperties3 = new OASComDayCqSearchpromoteImplSearchPr();
        OASComDayCqSearchpromoteImplSearchPr comDayCqSearchpromoteImplSearchPromoteServiceImplProperties4 = comDayCqSearchpromoteImplSearchPromoteServiceImplProperties3;

        System.assert(comDayCqSearchpromoteImplSearchPromoteServiceImplProperties1.equals(comDayCqSearchpromoteImplSearchPromoteServiceImplProperties2));
        System.assert(comDayCqSearchpromoteImplSearchPromoteServiceImplProperties2.equals(comDayCqSearchpromoteImplSearchPromoteServiceImplProperties1));
        System.assert(comDayCqSearchpromoteImplSearchPromoteServiceImplProperties1.equals(comDayCqSearchpromoteImplSearchPromoteServiceImplProperties1));
        System.assert(comDayCqSearchpromoteImplSearchPromoteServiceImplProperties3.equals(comDayCqSearchpromoteImplSearchPromoteServiceImplProperties4));
        System.assert(comDayCqSearchpromoteImplSearchPromoteServiceImplProperties4.equals(comDayCqSearchpromoteImplSearchPromoteServiceImplProperties3));
        System.assert(comDayCqSearchpromoteImplSearchPromoteServiceImplProperties3.equals(comDayCqSearchpromoteImplSearchPromoteServiceImplProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqSearchpromoteImplSearchPr comDayCqSearchpromoteImplSearchPromoteServiceImplProperties1 = OASComDayCqSearchpromoteImplSearchPr.getExample();
        OASComDayCqSearchpromoteImplSearchPr comDayCqSearchpromoteImplSearchPromoteServiceImplProperties2 = OASComDayCqSearchpromoteImplSearchPr.getExample();
        OASComDayCqSearchpromoteImplSearchPr comDayCqSearchpromoteImplSearchPromoteServiceImplProperties3 = new OASComDayCqSearchpromoteImplSearchPr();
        OASComDayCqSearchpromoteImplSearchPr comDayCqSearchpromoteImplSearchPromoteServiceImplProperties4 = new OASComDayCqSearchpromoteImplSearchPr();

        System.assert(comDayCqSearchpromoteImplSearchPromoteServiceImplProperties1.equals(comDayCqSearchpromoteImplSearchPromoteServiceImplProperties2));
        System.assert(comDayCqSearchpromoteImplSearchPromoteServiceImplProperties2.equals(comDayCqSearchpromoteImplSearchPromoteServiceImplProperties1));
        System.assert(comDayCqSearchpromoteImplSearchPromoteServiceImplProperties3.equals(comDayCqSearchpromoteImplSearchPromoteServiceImplProperties4));
        System.assert(comDayCqSearchpromoteImplSearchPromoteServiceImplProperties4.equals(comDayCqSearchpromoteImplSearchPromoteServiceImplProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqSearchpromoteImplSearchPr comDayCqSearchpromoteImplSearchPromoteServiceImplProperties1 = OASComDayCqSearchpromoteImplSearchPr.getExample();
        OASComDayCqSearchpromoteImplSearchPr comDayCqSearchpromoteImplSearchPromoteServiceImplProperties2 = new OASComDayCqSearchpromoteImplSearchPr();

        System.assertEquals(false, comDayCqSearchpromoteImplSearchPromoteServiceImplProperties1.equals('foo'));
        System.assertEquals(false, comDayCqSearchpromoteImplSearchPromoteServiceImplProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqSearchpromoteImplSearchPr comDayCqSearchpromoteImplSearchPromoteServiceImplProperties1 = OASComDayCqSearchpromoteImplSearchPr.getExample();
        OASComDayCqSearchpromoteImplSearchPr comDayCqSearchpromoteImplSearchPromoteServiceImplProperties2 = new OASComDayCqSearchpromoteImplSearchPr();
        OASComDayCqSearchpromoteImplSearchPr comDayCqSearchpromoteImplSearchPromoteServiceImplProperties3;

        System.assertEquals(false, comDayCqSearchpromoteImplSearchPromoteServiceImplProperties1.equals(comDayCqSearchpromoteImplSearchPromoteServiceImplProperties3));
        System.assertEquals(false, comDayCqSearchpromoteImplSearchPromoteServiceImplProperties2.equals(comDayCqSearchpromoteImplSearchPromoteServiceImplProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqSearchpromoteImplSearchPr comDayCqSearchpromoteImplSearchPromoteServiceImplProperties1 = OASComDayCqSearchpromoteImplSearchPr.getExample();
        OASComDayCqSearchpromoteImplSearchPr comDayCqSearchpromoteImplSearchPromoteServiceImplProperties2 = new OASComDayCqSearchpromoteImplSearchPr();

        System.assertEquals(comDayCqSearchpromoteImplSearchPromoteServiceImplProperties1.hashCode(), comDayCqSearchpromoteImplSearchPromoteServiceImplProperties1.hashCode());
        System.assertEquals(comDayCqSearchpromoteImplSearchPromoteServiceImplProperties2.hashCode(), comDayCqSearchpromoteImplSearchPromoteServiceImplProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqSearchpromoteImplSearchPr comDayCqSearchpromoteImplSearchPromoteServiceImplProperties1 = OASComDayCqSearchpromoteImplSearchPr.getExample();
        OASComDayCqSearchpromoteImplSearchPr comDayCqSearchpromoteImplSearchPromoteServiceImplProperties2 = OASComDayCqSearchpromoteImplSearchPr.getExample();
        OASComDayCqSearchpromoteImplSearchPr comDayCqSearchpromoteImplSearchPromoteServiceImplProperties3 = new OASComDayCqSearchpromoteImplSearchPr();
        OASComDayCqSearchpromoteImplSearchPr comDayCqSearchpromoteImplSearchPromoteServiceImplProperties4 = new OASComDayCqSearchpromoteImplSearchPr();

        System.assert(comDayCqSearchpromoteImplSearchPromoteServiceImplProperties1.equals(comDayCqSearchpromoteImplSearchPromoteServiceImplProperties2));
        System.assert(comDayCqSearchpromoteImplSearchPromoteServiceImplProperties3.equals(comDayCqSearchpromoteImplSearchPromoteServiceImplProperties4));
        System.assertEquals(comDayCqSearchpromoteImplSearchPromoteServiceImplProperties1.hashCode(), comDayCqSearchpromoteImplSearchPromoteServiceImplProperties2.hashCode());
        System.assertEquals(comDayCqSearchpromoteImplSearchPromoteServiceImplProperties3.hashCode(), comDayCqSearchpromoteImplSearchPromoteServiceImplProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComDayCqSearchpromoteImplSearchPr comDayCqSearchpromoteImplSearchPromoteServiceImplProperties = new OASComDayCqSearchpromoteImplSearchPr();
        Map<String, String> propertyMappings = comDayCqSearchpromoteImplSearchPromoteServiceImplProperties.getPropertyMappings();
        System.assertEquals('cqSearchpromoteConfigurationServerUri', propertyMappings.get('cq.searchpromote.configuration.server.uri'));
        System.assertEquals('cqSearchpromoteConfigurationEnvironment', propertyMappings.get('cq.searchpromote.configuration.environment'));
        System.assertEquals('connectionTimeout', propertyMappings.get('connection.timeout'));
        System.assertEquals('socketTimeout', propertyMappings.get('socket.timeout'));
    }
}
