@isTest
private class OASComAdobeGraniteOauthServerImplAccTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeGraniteOauthServerImplAcc comAdobeGraniteOauthServerImplAccessTokenCleanupTaskProperties1 = OASComAdobeGraniteOauthServerImplAcc.getExample();
        OASComAdobeGraniteOauthServerImplAcc comAdobeGraniteOauthServerImplAccessTokenCleanupTaskProperties2 = comAdobeGraniteOauthServerImplAccessTokenCleanupTaskProperties1;
        OASComAdobeGraniteOauthServerImplAcc comAdobeGraniteOauthServerImplAccessTokenCleanupTaskProperties3 = new OASComAdobeGraniteOauthServerImplAcc();
        OASComAdobeGraniteOauthServerImplAcc comAdobeGraniteOauthServerImplAccessTokenCleanupTaskProperties4 = comAdobeGraniteOauthServerImplAccessTokenCleanupTaskProperties3;

        System.assert(comAdobeGraniteOauthServerImplAccessTokenCleanupTaskProperties1.equals(comAdobeGraniteOauthServerImplAccessTokenCleanupTaskProperties2));
        System.assert(comAdobeGraniteOauthServerImplAccessTokenCleanupTaskProperties2.equals(comAdobeGraniteOauthServerImplAccessTokenCleanupTaskProperties1));
        System.assert(comAdobeGraniteOauthServerImplAccessTokenCleanupTaskProperties1.equals(comAdobeGraniteOauthServerImplAccessTokenCleanupTaskProperties1));
        System.assert(comAdobeGraniteOauthServerImplAccessTokenCleanupTaskProperties3.equals(comAdobeGraniteOauthServerImplAccessTokenCleanupTaskProperties4));
        System.assert(comAdobeGraniteOauthServerImplAccessTokenCleanupTaskProperties4.equals(comAdobeGraniteOauthServerImplAccessTokenCleanupTaskProperties3));
        System.assert(comAdobeGraniteOauthServerImplAccessTokenCleanupTaskProperties3.equals(comAdobeGraniteOauthServerImplAccessTokenCleanupTaskProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeGraniteOauthServerImplAcc comAdobeGraniteOauthServerImplAccessTokenCleanupTaskProperties1 = OASComAdobeGraniteOauthServerImplAcc.getExample();
        OASComAdobeGraniteOauthServerImplAcc comAdobeGraniteOauthServerImplAccessTokenCleanupTaskProperties2 = OASComAdobeGraniteOauthServerImplAcc.getExample();
        OASComAdobeGraniteOauthServerImplAcc comAdobeGraniteOauthServerImplAccessTokenCleanupTaskProperties3 = new OASComAdobeGraniteOauthServerImplAcc();
        OASComAdobeGraniteOauthServerImplAcc comAdobeGraniteOauthServerImplAccessTokenCleanupTaskProperties4 = new OASComAdobeGraniteOauthServerImplAcc();

        System.assert(comAdobeGraniteOauthServerImplAccessTokenCleanupTaskProperties1.equals(comAdobeGraniteOauthServerImplAccessTokenCleanupTaskProperties2));
        System.assert(comAdobeGraniteOauthServerImplAccessTokenCleanupTaskProperties2.equals(comAdobeGraniteOauthServerImplAccessTokenCleanupTaskProperties1));
        System.assert(comAdobeGraniteOauthServerImplAccessTokenCleanupTaskProperties3.equals(comAdobeGraniteOauthServerImplAccessTokenCleanupTaskProperties4));
        System.assert(comAdobeGraniteOauthServerImplAccessTokenCleanupTaskProperties4.equals(comAdobeGraniteOauthServerImplAccessTokenCleanupTaskProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeGraniteOauthServerImplAcc comAdobeGraniteOauthServerImplAccessTokenCleanupTaskProperties1 = OASComAdobeGraniteOauthServerImplAcc.getExample();
        OASComAdobeGraniteOauthServerImplAcc comAdobeGraniteOauthServerImplAccessTokenCleanupTaskProperties2 = new OASComAdobeGraniteOauthServerImplAcc();

        System.assertEquals(false, comAdobeGraniteOauthServerImplAccessTokenCleanupTaskProperties1.equals('foo'));
        System.assertEquals(false, comAdobeGraniteOauthServerImplAccessTokenCleanupTaskProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeGraniteOauthServerImplAcc comAdobeGraniteOauthServerImplAccessTokenCleanupTaskProperties1 = OASComAdobeGraniteOauthServerImplAcc.getExample();
        OASComAdobeGraniteOauthServerImplAcc comAdobeGraniteOauthServerImplAccessTokenCleanupTaskProperties2 = new OASComAdobeGraniteOauthServerImplAcc();
        OASComAdobeGraniteOauthServerImplAcc comAdobeGraniteOauthServerImplAccessTokenCleanupTaskProperties3;

        System.assertEquals(false, comAdobeGraniteOauthServerImplAccessTokenCleanupTaskProperties1.equals(comAdobeGraniteOauthServerImplAccessTokenCleanupTaskProperties3));
        System.assertEquals(false, comAdobeGraniteOauthServerImplAccessTokenCleanupTaskProperties2.equals(comAdobeGraniteOauthServerImplAccessTokenCleanupTaskProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeGraniteOauthServerImplAcc comAdobeGraniteOauthServerImplAccessTokenCleanupTaskProperties1 = OASComAdobeGraniteOauthServerImplAcc.getExample();
        OASComAdobeGraniteOauthServerImplAcc comAdobeGraniteOauthServerImplAccessTokenCleanupTaskProperties2 = new OASComAdobeGraniteOauthServerImplAcc();

        System.assertEquals(comAdobeGraniteOauthServerImplAccessTokenCleanupTaskProperties1.hashCode(), comAdobeGraniteOauthServerImplAccessTokenCleanupTaskProperties1.hashCode());
        System.assertEquals(comAdobeGraniteOauthServerImplAccessTokenCleanupTaskProperties2.hashCode(), comAdobeGraniteOauthServerImplAccessTokenCleanupTaskProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeGraniteOauthServerImplAcc comAdobeGraniteOauthServerImplAccessTokenCleanupTaskProperties1 = OASComAdobeGraniteOauthServerImplAcc.getExample();
        OASComAdobeGraniteOauthServerImplAcc comAdobeGraniteOauthServerImplAccessTokenCleanupTaskProperties2 = OASComAdobeGraniteOauthServerImplAcc.getExample();
        OASComAdobeGraniteOauthServerImplAcc comAdobeGraniteOauthServerImplAccessTokenCleanupTaskProperties3 = new OASComAdobeGraniteOauthServerImplAcc();
        OASComAdobeGraniteOauthServerImplAcc comAdobeGraniteOauthServerImplAccessTokenCleanupTaskProperties4 = new OASComAdobeGraniteOauthServerImplAcc();

        System.assert(comAdobeGraniteOauthServerImplAccessTokenCleanupTaskProperties1.equals(comAdobeGraniteOauthServerImplAccessTokenCleanupTaskProperties2));
        System.assert(comAdobeGraniteOauthServerImplAccessTokenCleanupTaskProperties3.equals(comAdobeGraniteOauthServerImplAccessTokenCleanupTaskProperties4));
        System.assertEquals(comAdobeGraniteOauthServerImplAccessTokenCleanupTaskProperties1.hashCode(), comAdobeGraniteOauthServerImplAccessTokenCleanupTaskProperties2.hashCode());
        System.assertEquals(comAdobeGraniteOauthServerImplAccessTokenCleanupTaskProperties3.hashCode(), comAdobeGraniteOauthServerImplAccessTokenCleanupTaskProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeGraniteOauthServerImplAcc comAdobeGraniteOauthServerImplAccessTokenCleanupTaskProperties = new OASComAdobeGraniteOauthServerImplAcc();
        Map<String, String> propertyMappings = comAdobeGraniteOauthServerImplAccessTokenCleanupTaskProperties.getPropertyMappings();
        System.assertEquals('schedulerExpression', propertyMappings.get('scheduler.expression'));
    }
}
