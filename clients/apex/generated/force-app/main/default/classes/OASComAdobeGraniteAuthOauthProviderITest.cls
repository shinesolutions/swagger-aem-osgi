@isTest
private class OASComAdobeGraniteAuthOauthProviderITest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeGraniteAuthOauthProviderI comAdobeGraniteAuthOauthProviderInfo1 = OASComAdobeGraniteAuthOauthProviderI.getExample();
        OASComAdobeGraniteAuthOauthProviderI comAdobeGraniteAuthOauthProviderInfo2 = comAdobeGraniteAuthOauthProviderInfo1;
        OASComAdobeGraniteAuthOauthProviderI comAdobeGraniteAuthOauthProviderInfo3 = new OASComAdobeGraniteAuthOauthProviderI();
        OASComAdobeGraniteAuthOauthProviderI comAdobeGraniteAuthOauthProviderInfo4 = comAdobeGraniteAuthOauthProviderInfo3;

        System.assert(comAdobeGraniteAuthOauthProviderInfo1.equals(comAdobeGraniteAuthOauthProviderInfo2));
        System.assert(comAdobeGraniteAuthOauthProviderInfo2.equals(comAdobeGraniteAuthOauthProviderInfo1));
        System.assert(comAdobeGraniteAuthOauthProviderInfo1.equals(comAdobeGraniteAuthOauthProviderInfo1));
        System.assert(comAdobeGraniteAuthOauthProviderInfo3.equals(comAdobeGraniteAuthOauthProviderInfo4));
        System.assert(comAdobeGraniteAuthOauthProviderInfo4.equals(comAdobeGraniteAuthOauthProviderInfo3));
        System.assert(comAdobeGraniteAuthOauthProviderInfo3.equals(comAdobeGraniteAuthOauthProviderInfo3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeGraniteAuthOauthProviderI comAdobeGraniteAuthOauthProviderInfo1 = OASComAdobeGraniteAuthOauthProviderI.getExample();
        OASComAdobeGraniteAuthOauthProviderI comAdobeGraniteAuthOauthProviderInfo2 = OASComAdobeGraniteAuthOauthProviderI.getExample();
        OASComAdobeGraniteAuthOauthProviderI comAdobeGraniteAuthOauthProviderInfo3 = new OASComAdobeGraniteAuthOauthProviderI();
        OASComAdobeGraniteAuthOauthProviderI comAdobeGraniteAuthOauthProviderInfo4 = new OASComAdobeGraniteAuthOauthProviderI();

        System.assert(comAdobeGraniteAuthOauthProviderInfo1.equals(comAdobeGraniteAuthOauthProviderInfo2));
        System.assert(comAdobeGraniteAuthOauthProviderInfo2.equals(comAdobeGraniteAuthOauthProviderInfo1));
        System.assert(comAdobeGraniteAuthOauthProviderInfo3.equals(comAdobeGraniteAuthOauthProviderInfo4));
        System.assert(comAdobeGraniteAuthOauthProviderInfo4.equals(comAdobeGraniteAuthOauthProviderInfo3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeGraniteAuthOauthProviderI comAdobeGraniteAuthOauthProviderInfo1 = OASComAdobeGraniteAuthOauthProviderI.getExample();
        OASComAdobeGraniteAuthOauthProviderI comAdobeGraniteAuthOauthProviderInfo2 = new OASComAdobeGraniteAuthOauthProviderI();

        System.assertEquals(false, comAdobeGraniteAuthOauthProviderInfo1.equals('foo'));
        System.assertEquals(false, comAdobeGraniteAuthOauthProviderInfo2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeGraniteAuthOauthProviderI comAdobeGraniteAuthOauthProviderInfo1 = OASComAdobeGraniteAuthOauthProviderI.getExample();
        OASComAdobeGraniteAuthOauthProviderI comAdobeGraniteAuthOauthProviderInfo2 = new OASComAdobeGraniteAuthOauthProviderI();
        OASComAdobeGraniteAuthOauthProviderI comAdobeGraniteAuthOauthProviderInfo3;

        System.assertEquals(false, comAdobeGraniteAuthOauthProviderInfo1.equals(comAdobeGraniteAuthOauthProviderInfo3));
        System.assertEquals(false, comAdobeGraniteAuthOauthProviderInfo2.equals(comAdobeGraniteAuthOauthProviderInfo3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeGraniteAuthOauthProviderI comAdobeGraniteAuthOauthProviderInfo1 = OASComAdobeGraniteAuthOauthProviderI.getExample();
        OASComAdobeGraniteAuthOauthProviderI comAdobeGraniteAuthOauthProviderInfo2 = new OASComAdobeGraniteAuthOauthProviderI();

        System.assertEquals(comAdobeGraniteAuthOauthProviderInfo1.hashCode(), comAdobeGraniteAuthOauthProviderInfo1.hashCode());
        System.assertEquals(comAdobeGraniteAuthOauthProviderInfo2.hashCode(), comAdobeGraniteAuthOauthProviderInfo2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeGraniteAuthOauthProviderI comAdobeGraniteAuthOauthProviderInfo1 = OASComAdobeGraniteAuthOauthProviderI.getExample();
        OASComAdobeGraniteAuthOauthProviderI comAdobeGraniteAuthOauthProviderInfo2 = OASComAdobeGraniteAuthOauthProviderI.getExample();
        OASComAdobeGraniteAuthOauthProviderI comAdobeGraniteAuthOauthProviderInfo3 = new OASComAdobeGraniteAuthOauthProviderI();
        OASComAdobeGraniteAuthOauthProviderI comAdobeGraniteAuthOauthProviderInfo4 = new OASComAdobeGraniteAuthOauthProviderI();

        System.assert(comAdobeGraniteAuthOauthProviderInfo1.equals(comAdobeGraniteAuthOauthProviderInfo2));
        System.assert(comAdobeGraniteAuthOauthProviderInfo3.equals(comAdobeGraniteAuthOauthProviderInfo4));
        System.assertEquals(comAdobeGraniteAuthOauthProviderInfo1.hashCode(), comAdobeGraniteAuthOauthProviderInfo2.hashCode());
        System.assertEquals(comAdobeGraniteAuthOauthProviderInfo3.hashCode(), comAdobeGraniteAuthOauthProviderInfo4.hashCode());
    }
}
