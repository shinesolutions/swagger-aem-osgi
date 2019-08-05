@isTest
private class OASComDayCqAuthImplLoginSelectorHandTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqAuthImplLoginSelectorHand comDayCqAuthImplLoginSelectorHandlerProperties1 = OASComDayCqAuthImplLoginSelectorHand.getExample();
        OASComDayCqAuthImplLoginSelectorHand comDayCqAuthImplLoginSelectorHandlerProperties2 = comDayCqAuthImplLoginSelectorHandlerProperties1;
        OASComDayCqAuthImplLoginSelectorHand comDayCqAuthImplLoginSelectorHandlerProperties3 = new OASComDayCqAuthImplLoginSelectorHand();
        OASComDayCqAuthImplLoginSelectorHand comDayCqAuthImplLoginSelectorHandlerProperties4 = comDayCqAuthImplLoginSelectorHandlerProperties3;

        System.assert(comDayCqAuthImplLoginSelectorHandlerProperties1.equals(comDayCqAuthImplLoginSelectorHandlerProperties2));
        System.assert(comDayCqAuthImplLoginSelectorHandlerProperties2.equals(comDayCqAuthImplLoginSelectorHandlerProperties1));
        System.assert(comDayCqAuthImplLoginSelectorHandlerProperties1.equals(comDayCqAuthImplLoginSelectorHandlerProperties1));
        System.assert(comDayCqAuthImplLoginSelectorHandlerProperties3.equals(comDayCqAuthImplLoginSelectorHandlerProperties4));
        System.assert(comDayCqAuthImplLoginSelectorHandlerProperties4.equals(comDayCqAuthImplLoginSelectorHandlerProperties3));
        System.assert(comDayCqAuthImplLoginSelectorHandlerProperties3.equals(comDayCqAuthImplLoginSelectorHandlerProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqAuthImplLoginSelectorHand comDayCqAuthImplLoginSelectorHandlerProperties1 = OASComDayCqAuthImplLoginSelectorHand.getExample();
        OASComDayCqAuthImplLoginSelectorHand comDayCqAuthImplLoginSelectorHandlerProperties2 = OASComDayCqAuthImplLoginSelectorHand.getExample();
        OASComDayCqAuthImplLoginSelectorHand comDayCqAuthImplLoginSelectorHandlerProperties3 = new OASComDayCqAuthImplLoginSelectorHand();
        OASComDayCqAuthImplLoginSelectorHand comDayCqAuthImplLoginSelectorHandlerProperties4 = new OASComDayCqAuthImplLoginSelectorHand();

        System.assert(comDayCqAuthImplLoginSelectorHandlerProperties1.equals(comDayCqAuthImplLoginSelectorHandlerProperties2));
        System.assert(comDayCqAuthImplLoginSelectorHandlerProperties2.equals(comDayCqAuthImplLoginSelectorHandlerProperties1));
        System.assert(comDayCqAuthImplLoginSelectorHandlerProperties3.equals(comDayCqAuthImplLoginSelectorHandlerProperties4));
        System.assert(comDayCqAuthImplLoginSelectorHandlerProperties4.equals(comDayCqAuthImplLoginSelectorHandlerProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqAuthImplLoginSelectorHand comDayCqAuthImplLoginSelectorHandlerProperties1 = OASComDayCqAuthImplLoginSelectorHand.getExample();
        OASComDayCqAuthImplLoginSelectorHand comDayCqAuthImplLoginSelectorHandlerProperties2 = new OASComDayCqAuthImplLoginSelectorHand();

        System.assertEquals(false, comDayCqAuthImplLoginSelectorHandlerProperties1.equals('foo'));
        System.assertEquals(false, comDayCqAuthImplLoginSelectorHandlerProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqAuthImplLoginSelectorHand comDayCqAuthImplLoginSelectorHandlerProperties1 = OASComDayCqAuthImplLoginSelectorHand.getExample();
        OASComDayCqAuthImplLoginSelectorHand comDayCqAuthImplLoginSelectorHandlerProperties2 = new OASComDayCqAuthImplLoginSelectorHand();
        OASComDayCqAuthImplLoginSelectorHand comDayCqAuthImplLoginSelectorHandlerProperties3;

        System.assertEquals(false, comDayCqAuthImplLoginSelectorHandlerProperties1.equals(comDayCqAuthImplLoginSelectorHandlerProperties3));
        System.assertEquals(false, comDayCqAuthImplLoginSelectorHandlerProperties2.equals(comDayCqAuthImplLoginSelectorHandlerProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqAuthImplLoginSelectorHand comDayCqAuthImplLoginSelectorHandlerProperties1 = OASComDayCqAuthImplLoginSelectorHand.getExample();
        OASComDayCqAuthImplLoginSelectorHand comDayCqAuthImplLoginSelectorHandlerProperties2 = new OASComDayCqAuthImplLoginSelectorHand();

        System.assertEquals(comDayCqAuthImplLoginSelectorHandlerProperties1.hashCode(), comDayCqAuthImplLoginSelectorHandlerProperties1.hashCode());
        System.assertEquals(comDayCqAuthImplLoginSelectorHandlerProperties2.hashCode(), comDayCqAuthImplLoginSelectorHandlerProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqAuthImplLoginSelectorHand comDayCqAuthImplLoginSelectorHandlerProperties1 = OASComDayCqAuthImplLoginSelectorHand.getExample();
        OASComDayCqAuthImplLoginSelectorHand comDayCqAuthImplLoginSelectorHandlerProperties2 = OASComDayCqAuthImplLoginSelectorHand.getExample();
        OASComDayCqAuthImplLoginSelectorHand comDayCqAuthImplLoginSelectorHandlerProperties3 = new OASComDayCqAuthImplLoginSelectorHand();
        OASComDayCqAuthImplLoginSelectorHand comDayCqAuthImplLoginSelectorHandlerProperties4 = new OASComDayCqAuthImplLoginSelectorHand();

        System.assert(comDayCqAuthImplLoginSelectorHandlerProperties1.equals(comDayCqAuthImplLoginSelectorHandlerProperties2));
        System.assert(comDayCqAuthImplLoginSelectorHandlerProperties3.equals(comDayCqAuthImplLoginSelectorHandlerProperties4));
        System.assertEquals(comDayCqAuthImplLoginSelectorHandlerProperties1.hashCode(), comDayCqAuthImplLoginSelectorHandlerProperties2.hashCode());
        System.assertEquals(comDayCqAuthImplLoginSelectorHandlerProperties3.hashCode(), comDayCqAuthImplLoginSelectorHandlerProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComDayCqAuthImplLoginSelectorHand comDayCqAuthImplLoginSelectorHandlerProperties = new OASComDayCqAuthImplLoginSelectorHand();
        Map<String, String> propertyMappings = comDayCqAuthImplLoginSelectorHandlerProperties.getPropertyMappings();
        System.assertEquals('serviceRanking', propertyMappings.get('service.ranking'));
        System.assertEquals('authLoginselectorMappings', propertyMappings.get('auth.loginselector.mappings'));
        System.assertEquals('authLoginselectorChangepwMappings', propertyMappings.get('auth.loginselector.changepw.mappings'));
        System.assertEquals('authLoginselectorDefaultloginpage', propertyMappings.get('auth.loginselector.defaultloginpage'));
        System.assertEquals('authLoginselectorDefaultchangepwpage', propertyMappings.get('auth.loginselector.defaultchangepwpage'));
        System.assertEquals('authLoginselectorHandle', propertyMappings.get('auth.loginselector.handle'));
        System.assertEquals('authLoginselectorHandleAllExtensions', propertyMappings.get('auth.loginselector.handle.all.extensions'));
    }
}
