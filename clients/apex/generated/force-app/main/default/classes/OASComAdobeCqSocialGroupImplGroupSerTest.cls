@isTest
private class OASComAdobeCqSocialGroupImplGroupSerTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeCqSocialGroupImplGroupSer comAdobeCqSocialGroupImplGroupServiceImplProperties1 = OASComAdobeCqSocialGroupImplGroupSer.getExample();
        OASComAdobeCqSocialGroupImplGroupSer comAdobeCqSocialGroupImplGroupServiceImplProperties2 = comAdobeCqSocialGroupImplGroupServiceImplProperties1;
        OASComAdobeCqSocialGroupImplGroupSer comAdobeCqSocialGroupImplGroupServiceImplProperties3 = new OASComAdobeCqSocialGroupImplGroupSer();
        OASComAdobeCqSocialGroupImplGroupSer comAdobeCqSocialGroupImplGroupServiceImplProperties4 = comAdobeCqSocialGroupImplGroupServiceImplProperties3;

        System.assert(comAdobeCqSocialGroupImplGroupServiceImplProperties1.equals(comAdobeCqSocialGroupImplGroupServiceImplProperties2));
        System.assert(comAdobeCqSocialGroupImplGroupServiceImplProperties2.equals(comAdobeCqSocialGroupImplGroupServiceImplProperties1));
        System.assert(comAdobeCqSocialGroupImplGroupServiceImplProperties1.equals(comAdobeCqSocialGroupImplGroupServiceImplProperties1));
        System.assert(comAdobeCqSocialGroupImplGroupServiceImplProperties3.equals(comAdobeCqSocialGroupImplGroupServiceImplProperties4));
        System.assert(comAdobeCqSocialGroupImplGroupServiceImplProperties4.equals(comAdobeCqSocialGroupImplGroupServiceImplProperties3));
        System.assert(comAdobeCqSocialGroupImplGroupServiceImplProperties3.equals(comAdobeCqSocialGroupImplGroupServiceImplProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeCqSocialGroupImplGroupSer comAdobeCqSocialGroupImplGroupServiceImplProperties1 = OASComAdobeCqSocialGroupImplGroupSer.getExample();
        OASComAdobeCqSocialGroupImplGroupSer comAdobeCqSocialGroupImplGroupServiceImplProperties2 = OASComAdobeCqSocialGroupImplGroupSer.getExample();
        OASComAdobeCqSocialGroupImplGroupSer comAdobeCqSocialGroupImplGroupServiceImplProperties3 = new OASComAdobeCqSocialGroupImplGroupSer();
        OASComAdobeCqSocialGroupImplGroupSer comAdobeCqSocialGroupImplGroupServiceImplProperties4 = new OASComAdobeCqSocialGroupImplGroupSer();

        System.assert(comAdobeCqSocialGroupImplGroupServiceImplProperties1.equals(comAdobeCqSocialGroupImplGroupServiceImplProperties2));
        System.assert(comAdobeCqSocialGroupImplGroupServiceImplProperties2.equals(comAdobeCqSocialGroupImplGroupServiceImplProperties1));
        System.assert(comAdobeCqSocialGroupImplGroupServiceImplProperties3.equals(comAdobeCqSocialGroupImplGroupServiceImplProperties4));
        System.assert(comAdobeCqSocialGroupImplGroupServiceImplProperties4.equals(comAdobeCqSocialGroupImplGroupServiceImplProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeCqSocialGroupImplGroupSer comAdobeCqSocialGroupImplGroupServiceImplProperties1 = OASComAdobeCqSocialGroupImplGroupSer.getExample();
        OASComAdobeCqSocialGroupImplGroupSer comAdobeCqSocialGroupImplGroupServiceImplProperties2 = new OASComAdobeCqSocialGroupImplGroupSer();

        System.assertEquals(false, comAdobeCqSocialGroupImplGroupServiceImplProperties1.equals('foo'));
        System.assertEquals(false, comAdobeCqSocialGroupImplGroupServiceImplProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeCqSocialGroupImplGroupSer comAdobeCqSocialGroupImplGroupServiceImplProperties1 = OASComAdobeCqSocialGroupImplGroupSer.getExample();
        OASComAdobeCqSocialGroupImplGroupSer comAdobeCqSocialGroupImplGroupServiceImplProperties2 = new OASComAdobeCqSocialGroupImplGroupSer();
        OASComAdobeCqSocialGroupImplGroupSer comAdobeCqSocialGroupImplGroupServiceImplProperties3;

        System.assertEquals(false, comAdobeCqSocialGroupImplGroupServiceImplProperties1.equals(comAdobeCqSocialGroupImplGroupServiceImplProperties3));
        System.assertEquals(false, comAdobeCqSocialGroupImplGroupServiceImplProperties2.equals(comAdobeCqSocialGroupImplGroupServiceImplProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeCqSocialGroupImplGroupSer comAdobeCqSocialGroupImplGroupServiceImplProperties1 = OASComAdobeCqSocialGroupImplGroupSer.getExample();
        OASComAdobeCqSocialGroupImplGroupSer comAdobeCqSocialGroupImplGroupServiceImplProperties2 = new OASComAdobeCqSocialGroupImplGroupSer();

        System.assertEquals(comAdobeCqSocialGroupImplGroupServiceImplProperties1.hashCode(), comAdobeCqSocialGroupImplGroupServiceImplProperties1.hashCode());
        System.assertEquals(comAdobeCqSocialGroupImplGroupServiceImplProperties2.hashCode(), comAdobeCqSocialGroupImplGroupServiceImplProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeCqSocialGroupImplGroupSer comAdobeCqSocialGroupImplGroupServiceImplProperties1 = OASComAdobeCqSocialGroupImplGroupSer.getExample();
        OASComAdobeCqSocialGroupImplGroupSer comAdobeCqSocialGroupImplGroupServiceImplProperties2 = OASComAdobeCqSocialGroupImplGroupSer.getExample();
        OASComAdobeCqSocialGroupImplGroupSer comAdobeCqSocialGroupImplGroupServiceImplProperties3 = new OASComAdobeCqSocialGroupImplGroupSer();
        OASComAdobeCqSocialGroupImplGroupSer comAdobeCqSocialGroupImplGroupServiceImplProperties4 = new OASComAdobeCqSocialGroupImplGroupSer();

        System.assert(comAdobeCqSocialGroupImplGroupServiceImplProperties1.equals(comAdobeCqSocialGroupImplGroupServiceImplProperties2));
        System.assert(comAdobeCqSocialGroupImplGroupServiceImplProperties3.equals(comAdobeCqSocialGroupImplGroupServiceImplProperties4));
        System.assertEquals(comAdobeCqSocialGroupImplGroupServiceImplProperties1.hashCode(), comAdobeCqSocialGroupImplGroupServiceImplProperties2.hashCode());
        System.assertEquals(comAdobeCqSocialGroupImplGroupServiceImplProperties3.hashCode(), comAdobeCqSocialGroupImplGroupServiceImplProperties4.hashCode());
    }
}
