@isTest
private class OASComAdobeCqSocialSiteImplSiteConfiTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeCqSocialSiteImplSiteConfi comAdobeCqSocialSiteImplSiteConfiguratorImplProperties1 = OASComAdobeCqSocialSiteImplSiteConfi.getExample();
        OASComAdobeCqSocialSiteImplSiteConfi comAdobeCqSocialSiteImplSiteConfiguratorImplProperties2 = comAdobeCqSocialSiteImplSiteConfiguratorImplProperties1;
        OASComAdobeCqSocialSiteImplSiteConfi comAdobeCqSocialSiteImplSiteConfiguratorImplProperties3 = new OASComAdobeCqSocialSiteImplSiteConfi();
        OASComAdobeCqSocialSiteImplSiteConfi comAdobeCqSocialSiteImplSiteConfiguratorImplProperties4 = comAdobeCqSocialSiteImplSiteConfiguratorImplProperties3;

        System.assert(comAdobeCqSocialSiteImplSiteConfiguratorImplProperties1.equals(comAdobeCqSocialSiteImplSiteConfiguratorImplProperties2));
        System.assert(comAdobeCqSocialSiteImplSiteConfiguratorImplProperties2.equals(comAdobeCqSocialSiteImplSiteConfiguratorImplProperties1));
        System.assert(comAdobeCqSocialSiteImplSiteConfiguratorImplProperties1.equals(comAdobeCqSocialSiteImplSiteConfiguratorImplProperties1));
        System.assert(comAdobeCqSocialSiteImplSiteConfiguratorImplProperties3.equals(comAdobeCqSocialSiteImplSiteConfiguratorImplProperties4));
        System.assert(comAdobeCqSocialSiteImplSiteConfiguratorImplProperties4.equals(comAdobeCqSocialSiteImplSiteConfiguratorImplProperties3));
        System.assert(comAdobeCqSocialSiteImplSiteConfiguratorImplProperties3.equals(comAdobeCqSocialSiteImplSiteConfiguratorImplProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeCqSocialSiteImplSiteConfi comAdobeCqSocialSiteImplSiteConfiguratorImplProperties1 = OASComAdobeCqSocialSiteImplSiteConfi.getExample();
        OASComAdobeCqSocialSiteImplSiteConfi comAdobeCqSocialSiteImplSiteConfiguratorImplProperties2 = OASComAdobeCqSocialSiteImplSiteConfi.getExample();
        OASComAdobeCqSocialSiteImplSiteConfi comAdobeCqSocialSiteImplSiteConfiguratorImplProperties3 = new OASComAdobeCqSocialSiteImplSiteConfi();
        OASComAdobeCqSocialSiteImplSiteConfi comAdobeCqSocialSiteImplSiteConfiguratorImplProperties4 = new OASComAdobeCqSocialSiteImplSiteConfi();

        System.assert(comAdobeCqSocialSiteImplSiteConfiguratorImplProperties1.equals(comAdobeCqSocialSiteImplSiteConfiguratorImplProperties2));
        System.assert(comAdobeCqSocialSiteImplSiteConfiguratorImplProperties2.equals(comAdobeCqSocialSiteImplSiteConfiguratorImplProperties1));
        System.assert(comAdobeCqSocialSiteImplSiteConfiguratorImplProperties3.equals(comAdobeCqSocialSiteImplSiteConfiguratorImplProperties4));
        System.assert(comAdobeCqSocialSiteImplSiteConfiguratorImplProperties4.equals(comAdobeCqSocialSiteImplSiteConfiguratorImplProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeCqSocialSiteImplSiteConfi comAdobeCqSocialSiteImplSiteConfiguratorImplProperties1 = OASComAdobeCqSocialSiteImplSiteConfi.getExample();
        OASComAdobeCqSocialSiteImplSiteConfi comAdobeCqSocialSiteImplSiteConfiguratorImplProperties2 = new OASComAdobeCqSocialSiteImplSiteConfi();

        System.assertEquals(false, comAdobeCqSocialSiteImplSiteConfiguratorImplProperties1.equals('foo'));
        System.assertEquals(false, comAdobeCqSocialSiteImplSiteConfiguratorImplProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeCqSocialSiteImplSiteConfi comAdobeCqSocialSiteImplSiteConfiguratorImplProperties1 = OASComAdobeCqSocialSiteImplSiteConfi.getExample();
        OASComAdobeCqSocialSiteImplSiteConfi comAdobeCqSocialSiteImplSiteConfiguratorImplProperties2 = new OASComAdobeCqSocialSiteImplSiteConfi();
        OASComAdobeCqSocialSiteImplSiteConfi comAdobeCqSocialSiteImplSiteConfiguratorImplProperties3;

        System.assertEquals(false, comAdobeCqSocialSiteImplSiteConfiguratorImplProperties1.equals(comAdobeCqSocialSiteImplSiteConfiguratorImplProperties3));
        System.assertEquals(false, comAdobeCqSocialSiteImplSiteConfiguratorImplProperties2.equals(comAdobeCqSocialSiteImplSiteConfiguratorImplProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeCqSocialSiteImplSiteConfi comAdobeCqSocialSiteImplSiteConfiguratorImplProperties1 = OASComAdobeCqSocialSiteImplSiteConfi.getExample();
        OASComAdobeCqSocialSiteImplSiteConfi comAdobeCqSocialSiteImplSiteConfiguratorImplProperties2 = new OASComAdobeCqSocialSiteImplSiteConfi();

        System.assertEquals(comAdobeCqSocialSiteImplSiteConfiguratorImplProperties1.hashCode(), comAdobeCqSocialSiteImplSiteConfiguratorImplProperties1.hashCode());
        System.assertEquals(comAdobeCqSocialSiteImplSiteConfiguratorImplProperties2.hashCode(), comAdobeCqSocialSiteImplSiteConfiguratorImplProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeCqSocialSiteImplSiteConfi comAdobeCqSocialSiteImplSiteConfiguratorImplProperties1 = OASComAdobeCqSocialSiteImplSiteConfi.getExample();
        OASComAdobeCqSocialSiteImplSiteConfi comAdobeCqSocialSiteImplSiteConfiguratorImplProperties2 = OASComAdobeCqSocialSiteImplSiteConfi.getExample();
        OASComAdobeCqSocialSiteImplSiteConfi comAdobeCqSocialSiteImplSiteConfiguratorImplProperties3 = new OASComAdobeCqSocialSiteImplSiteConfi();
        OASComAdobeCqSocialSiteImplSiteConfi comAdobeCqSocialSiteImplSiteConfiguratorImplProperties4 = new OASComAdobeCqSocialSiteImplSiteConfi();

        System.assert(comAdobeCqSocialSiteImplSiteConfiguratorImplProperties1.equals(comAdobeCqSocialSiteImplSiteConfiguratorImplProperties2));
        System.assert(comAdobeCqSocialSiteImplSiteConfiguratorImplProperties3.equals(comAdobeCqSocialSiteImplSiteConfiguratorImplProperties4));
        System.assertEquals(comAdobeCqSocialSiteImplSiteConfiguratorImplProperties1.hashCode(), comAdobeCqSocialSiteImplSiteConfiguratorImplProperties2.hashCode());
        System.assertEquals(comAdobeCqSocialSiteImplSiteConfiguratorImplProperties3.hashCode(), comAdobeCqSocialSiteImplSiteConfiguratorImplProperties4.hashCode());
    }
}
