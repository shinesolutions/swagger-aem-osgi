@isTest
private class OASComAdobeCqExperiencelogImplExperiTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeCqExperiencelogImplExperi comAdobeCqExperiencelogImplExperienceLogConfigServletProperties1 = OASComAdobeCqExperiencelogImplExperi.getExample();
        OASComAdobeCqExperiencelogImplExperi comAdobeCqExperiencelogImplExperienceLogConfigServletProperties2 = comAdobeCqExperiencelogImplExperienceLogConfigServletProperties1;
        OASComAdobeCqExperiencelogImplExperi comAdobeCqExperiencelogImplExperienceLogConfigServletProperties3 = new OASComAdobeCqExperiencelogImplExperi();
        OASComAdobeCqExperiencelogImplExperi comAdobeCqExperiencelogImplExperienceLogConfigServletProperties4 = comAdobeCqExperiencelogImplExperienceLogConfigServletProperties3;

        System.assert(comAdobeCqExperiencelogImplExperienceLogConfigServletProperties1.equals(comAdobeCqExperiencelogImplExperienceLogConfigServletProperties2));
        System.assert(comAdobeCqExperiencelogImplExperienceLogConfigServletProperties2.equals(comAdobeCqExperiencelogImplExperienceLogConfigServletProperties1));
        System.assert(comAdobeCqExperiencelogImplExperienceLogConfigServletProperties1.equals(comAdobeCqExperiencelogImplExperienceLogConfigServletProperties1));
        System.assert(comAdobeCqExperiencelogImplExperienceLogConfigServletProperties3.equals(comAdobeCqExperiencelogImplExperienceLogConfigServletProperties4));
        System.assert(comAdobeCqExperiencelogImplExperienceLogConfigServletProperties4.equals(comAdobeCqExperiencelogImplExperienceLogConfigServletProperties3));
        System.assert(comAdobeCqExperiencelogImplExperienceLogConfigServletProperties3.equals(comAdobeCqExperiencelogImplExperienceLogConfigServletProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeCqExperiencelogImplExperi comAdobeCqExperiencelogImplExperienceLogConfigServletProperties1 = OASComAdobeCqExperiencelogImplExperi.getExample();
        OASComAdobeCqExperiencelogImplExperi comAdobeCqExperiencelogImplExperienceLogConfigServletProperties2 = OASComAdobeCqExperiencelogImplExperi.getExample();
        OASComAdobeCqExperiencelogImplExperi comAdobeCqExperiencelogImplExperienceLogConfigServletProperties3 = new OASComAdobeCqExperiencelogImplExperi();
        OASComAdobeCqExperiencelogImplExperi comAdobeCqExperiencelogImplExperienceLogConfigServletProperties4 = new OASComAdobeCqExperiencelogImplExperi();

        System.assert(comAdobeCqExperiencelogImplExperienceLogConfigServletProperties1.equals(comAdobeCqExperiencelogImplExperienceLogConfigServletProperties2));
        System.assert(comAdobeCqExperiencelogImplExperienceLogConfigServletProperties2.equals(comAdobeCqExperiencelogImplExperienceLogConfigServletProperties1));
        System.assert(comAdobeCqExperiencelogImplExperienceLogConfigServletProperties3.equals(comAdobeCqExperiencelogImplExperienceLogConfigServletProperties4));
        System.assert(comAdobeCqExperiencelogImplExperienceLogConfigServletProperties4.equals(comAdobeCqExperiencelogImplExperienceLogConfigServletProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeCqExperiencelogImplExperi comAdobeCqExperiencelogImplExperienceLogConfigServletProperties1 = OASComAdobeCqExperiencelogImplExperi.getExample();
        OASComAdobeCqExperiencelogImplExperi comAdobeCqExperiencelogImplExperienceLogConfigServletProperties2 = new OASComAdobeCqExperiencelogImplExperi();

        System.assertEquals(false, comAdobeCqExperiencelogImplExperienceLogConfigServletProperties1.equals('foo'));
        System.assertEquals(false, comAdobeCqExperiencelogImplExperienceLogConfigServletProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeCqExperiencelogImplExperi comAdobeCqExperiencelogImplExperienceLogConfigServletProperties1 = OASComAdobeCqExperiencelogImplExperi.getExample();
        OASComAdobeCqExperiencelogImplExperi comAdobeCqExperiencelogImplExperienceLogConfigServletProperties2 = new OASComAdobeCqExperiencelogImplExperi();
        OASComAdobeCqExperiencelogImplExperi comAdobeCqExperiencelogImplExperienceLogConfigServletProperties3;

        System.assertEquals(false, comAdobeCqExperiencelogImplExperienceLogConfigServletProperties1.equals(comAdobeCqExperiencelogImplExperienceLogConfigServletProperties3));
        System.assertEquals(false, comAdobeCqExperiencelogImplExperienceLogConfigServletProperties2.equals(comAdobeCqExperiencelogImplExperienceLogConfigServletProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeCqExperiencelogImplExperi comAdobeCqExperiencelogImplExperienceLogConfigServletProperties1 = OASComAdobeCqExperiencelogImplExperi.getExample();
        OASComAdobeCqExperiencelogImplExperi comAdobeCqExperiencelogImplExperienceLogConfigServletProperties2 = new OASComAdobeCqExperiencelogImplExperi();

        System.assertEquals(comAdobeCqExperiencelogImplExperienceLogConfigServletProperties1.hashCode(), comAdobeCqExperiencelogImplExperienceLogConfigServletProperties1.hashCode());
        System.assertEquals(comAdobeCqExperiencelogImplExperienceLogConfigServletProperties2.hashCode(), comAdobeCqExperiencelogImplExperienceLogConfigServletProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeCqExperiencelogImplExperi comAdobeCqExperiencelogImplExperienceLogConfigServletProperties1 = OASComAdobeCqExperiencelogImplExperi.getExample();
        OASComAdobeCqExperiencelogImplExperi comAdobeCqExperiencelogImplExperienceLogConfigServletProperties2 = OASComAdobeCqExperiencelogImplExperi.getExample();
        OASComAdobeCqExperiencelogImplExperi comAdobeCqExperiencelogImplExperienceLogConfigServletProperties3 = new OASComAdobeCqExperiencelogImplExperi();
        OASComAdobeCqExperiencelogImplExperi comAdobeCqExperiencelogImplExperienceLogConfigServletProperties4 = new OASComAdobeCqExperiencelogImplExperi();

        System.assert(comAdobeCqExperiencelogImplExperienceLogConfigServletProperties1.equals(comAdobeCqExperiencelogImplExperienceLogConfigServletProperties2));
        System.assert(comAdobeCqExperiencelogImplExperienceLogConfigServletProperties3.equals(comAdobeCqExperiencelogImplExperienceLogConfigServletProperties4));
        System.assertEquals(comAdobeCqExperiencelogImplExperienceLogConfigServletProperties1.hashCode(), comAdobeCqExperiencelogImplExperienceLogConfigServletProperties2.hashCode());
        System.assertEquals(comAdobeCqExperiencelogImplExperienceLogConfigServletProperties3.hashCode(), comAdobeCqExperiencelogImplExperienceLogConfigServletProperties4.hashCode());
    }
}
