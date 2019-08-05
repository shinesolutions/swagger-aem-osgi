@isTest
private class OASComAdobeCqSocialCommonsCorsCORSAuTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeCqSocialCommonsCorsCORSAu comAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties1 = OASComAdobeCqSocialCommonsCorsCORSAu.getExample();
        OASComAdobeCqSocialCommonsCorsCORSAu comAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties2 = comAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties1;
        OASComAdobeCqSocialCommonsCorsCORSAu comAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties3 = new OASComAdobeCqSocialCommonsCorsCORSAu();
        OASComAdobeCqSocialCommonsCorsCORSAu comAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties4 = comAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties3;

        System.assert(comAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties1.equals(comAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties2));
        System.assert(comAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties2.equals(comAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties1));
        System.assert(comAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties1.equals(comAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties1));
        System.assert(comAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties3.equals(comAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties4));
        System.assert(comAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties4.equals(comAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties3));
        System.assert(comAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties3.equals(comAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeCqSocialCommonsCorsCORSAu comAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties1 = OASComAdobeCqSocialCommonsCorsCORSAu.getExample();
        OASComAdobeCqSocialCommonsCorsCORSAu comAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties2 = OASComAdobeCqSocialCommonsCorsCORSAu.getExample();
        OASComAdobeCqSocialCommonsCorsCORSAu comAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties3 = new OASComAdobeCqSocialCommonsCorsCORSAu();
        OASComAdobeCqSocialCommonsCorsCORSAu comAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties4 = new OASComAdobeCqSocialCommonsCorsCORSAu();

        System.assert(comAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties1.equals(comAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties2));
        System.assert(comAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties2.equals(comAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties1));
        System.assert(comAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties3.equals(comAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties4));
        System.assert(comAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties4.equals(comAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeCqSocialCommonsCorsCORSAu comAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties1 = OASComAdobeCqSocialCommonsCorsCORSAu.getExample();
        OASComAdobeCqSocialCommonsCorsCORSAu comAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties2 = new OASComAdobeCqSocialCommonsCorsCORSAu();

        System.assertEquals(false, comAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties1.equals('foo'));
        System.assertEquals(false, comAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeCqSocialCommonsCorsCORSAu comAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties1 = OASComAdobeCqSocialCommonsCorsCORSAu.getExample();
        OASComAdobeCqSocialCommonsCorsCORSAu comAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties2 = new OASComAdobeCqSocialCommonsCorsCORSAu();
        OASComAdobeCqSocialCommonsCorsCORSAu comAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties3;

        System.assertEquals(false, comAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties1.equals(comAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties3));
        System.assertEquals(false, comAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties2.equals(comAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeCqSocialCommonsCorsCORSAu comAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties1 = OASComAdobeCqSocialCommonsCorsCORSAu.getExample();
        OASComAdobeCqSocialCommonsCorsCORSAu comAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties2 = new OASComAdobeCqSocialCommonsCorsCORSAu();

        System.assertEquals(comAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties1.hashCode(), comAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties1.hashCode());
        System.assertEquals(comAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties2.hashCode(), comAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeCqSocialCommonsCorsCORSAu comAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties1 = OASComAdobeCqSocialCommonsCorsCORSAu.getExample();
        OASComAdobeCqSocialCommonsCorsCORSAu comAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties2 = OASComAdobeCqSocialCommonsCorsCORSAu.getExample();
        OASComAdobeCqSocialCommonsCorsCORSAu comAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties3 = new OASComAdobeCqSocialCommonsCorsCORSAu();
        OASComAdobeCqSocialCommonsCorsCORSAu comAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties4 = new OASComAdobeCqSocialCommonsCorsCORSAu();

        System.assert(comAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties1.equals(comAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties2));
        System.assert(comAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties3.equals(comAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties4));
        System.assertEquals(comAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties1.hashCode(), comAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties2.hashCode());
        System.assertEquals(comAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties3.hashCode(), comAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeCqSocialCommonsCorsCORSAu comAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties = new OASComAdobeCqSocialCommonsCorsCORSAu();
        Map<String, String> propertyMappings = comAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties.getPropertyMappings();
        System.assertEquals('corsEnabling', propertyMappings.get('cors.enabling'));
    }
}
