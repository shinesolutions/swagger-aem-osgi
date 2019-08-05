@isTest
private class OASComAdobeOctopusNcommBootstrapInfoTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeOctopusNcommBootstrapInfo comAdobeOctopusNcommBootstrapInfo1 = OASComAdobeOctopusNcommBootstrapInfo.getExample();
        OASComAdobeOctopusNcommBootstrapInfo comAdobeOctopusNcommBootstrapInfo2 = comAdobeOctopusNcommBootstrapInfo1;
        OASComAdobeOctopusNcommBootstrapInfo comAdobeOctopusNcommBootstrapInfo3 = new OASComAdobeOctopusNcommBootstrapInfo();
        OASComAdobeOctopusNcommBootstrapInfo comAdobeOctopusNcommBootstrapInfo4 = comAdobeOctopusNcommBootstrapInfo3;

        System.assert(comAdobeOctopusNcommBootstrapInfo1.equals(comAdobeOctopusNcommBootstrapInfo2));
        System.assert(comAdobeOctopusNcommBootstrapInfo2.equals(comAdobeOctopusNcommBootstrapInfo1));
        System.assert(comAdobeOctopusNcommBootstrapInfo1.equals(comAdobeOctopusNcommBootstrapInfo1));
        System.assert(comAdobeOctopusNcommBootstrapInfo3.equals(comAdobeOctopusNcommBootstrapInfo4));
        System.assert(comAdobeOctopusNcommBootstrapInfo4.equals(comAdobeOctopusNcommBootstrapInfo3));
        System.assert(comAdobeOctopusNcommBootstrapInfo3.equals(comAdobeOctopusNcommBootstrapInfo3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeOctopusNcommBootstrapInfo comAdobeOctopusNcommBootstrapInfo1 = OASComAdobeOctopusNcommBootstrapInfo.getExample();
        OASComAdobeOctopusNcommBootstrapInfo comAdobeOctopusNcommBootstrapInfo2 = OASComAdobeOctopusNcommBootstrapInfo.getExample();
        OASComAdobeOctopusNcommBootstrapInfo comAdobeOctopusNcommBootstrapInfo3 = new OASComAdobeOctopusNcommBootstrapInfo();
        OASComAdobeOctopusNcommBootstrapInfo comAdobeOctopusNcommBootstrapInfo4 = new OASComAdobeOctopusNcommBootstrapInfo();

        System.assert(comAdobeOctopusNcommBootstrapInfo1.equals(comAdobeOctopusNcommBootstrapInfo2));
        System.assert(comAdobeOctopusNcommBootstrapInfo2.equals(comAdobeOctopusNcommBootstrapInfo1));
        System.assert(comAdobeOctopusNcommBootstrapInfo3.equals(comAdobeOctopusNcommBootstrapInfo4));
        System.assert(comAdobeOctopusNcommBootstrapInfo4.equals(comAdobeOctopusNcommBootstrapInfo3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeOctopusNcommBootstrapInfo comAdobeOctopusNcommBootstrapInfo1 = OASComAdobeOctopusNcommBootstrapInfo.getExample();
        OASComAdobeOctopusNcommBootstrapInfo comAdobeOctopusNcommBootstrapInfo2 = new OASComAdobeOctopusNcommBootstrapInfo();

        System.assertEquals(false, comAdobeOctopusNcommBootstrapInfo1.equals('foo'));
        System.assertEquals(false, comAdobeOctopusNcommBootstrapInfo2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeOctopusNcommBootstrapInfo comAdobeOctopusNcommBootstrapInfo1 = OASComAdobeOctopusNcommBootstrapInfo.getExample();
        OASComAdobeOctopusNcommBootstrapInfo comAdobeOctopusNcommBootstrapInfo2 = new OASComAdobeOctopusNcommBootstrapInfo();
        OASComAdobeOctopusNcommBootstrapInfo comAdobeOctopusNcommBootstrapInfo3;

        System.assertEquals(false, comAdobeOctopusNcommBootstrapInfo1.equals(comAdobeOctopusNcommBootstrapInfo3));
        System.assertEquals(false, comAdobeOctopusNcommBootstrapInfo2.equals(comAdobeOctopusNcommBootstrapInfo3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeOctopusNcommBootstrapInfo comAdobeOctopusNcommBootstrapInfo1 = OASComAdobeOctopusNcommBootstrapInfo.getExample();
        OASComAdobeOctopusNcommBootstrapInfo comAdobeOctopusNcommBootstrapInfo2 = new OASComAdobeOctopusNcommBootstrapInfo();

        System.assertEquals(comAdobeOctopusNcommBootstrapInfo1.hashCode(), comAdobeOctopusNcommBootstrapInfo1.hashCode());
        System.assertEquals(comAdobeOctopusNcommBootstrapInfo2.hashCode(), comAdobeOctopusNcommBootstrapInfo2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeOctopusNcommBootstrapInfo comAdobeOctopusNcommBootstrapInfo1 = OASComAdobeOctopusNcommBootstrapInfo.getExample();
        OASComAdobeOctopusNcommBootstrapInfo comAdobeOctopusNcommBootstrapInfo2 = OASComAdobeOctopusNcommBootstrapInfo.getExample();
        OASComAdobeOctopusNcommBootstrapInfo comAdobeOctopusNcommBootstrapInfo3 = new OASComAdobeOctopusNcommBootstrapInfo();
        OASComAdobeOctopusNcommBootstrapInfo comAdobeOctopusNcommBootstrapInfo4 = new OASComAdobeOctopusNcommBootstrapInfo();

        System.assert(comAdobeOctopusNcommBootstrapInfo1.equals(comAdobeOctopusNcommBootstrapInfo2));
        System.assert(comAdobeOctopusNcommBootstrapInfo3.equals(comAdobeOctopusNcommBootstrapInfo4));
        System.assertEquals(comAdobeOctopusNcommBootstrapInfo1.hashCode(), comAdobeOctopusNcommBootstrapInfo2.hashCode());
        System.assertEquals(comAdobeOctopusNcommBootstrapInfo3.hashCode(), comAdobeOctopusNcommBootstrapInfo4.hashCode());
    }
}
