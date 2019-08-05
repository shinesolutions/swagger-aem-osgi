@isTest
private class OASComAdobeCqSocialServiceusersInterTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeCqSocialServiceusersInter comAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties1 = OASComAdobeCqSocialServiceusersInter.getExample();
        OASComAdobeCqSocialServiceusersInter comAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties2 = comAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties1;
        OASComAdobeCqSocialServiceusersInter comAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties3 = new OASComAdobeCqSocialServiceusersInter();
        OASComAdobeCqSocialServiceusersInter comAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties4 = comAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties3;

        System.assert(comAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties1.equals(comAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties2));
        System.assert(comAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties2.equals(comAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties1));
        System.assert(comAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties1.equals(comAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties1));
        System.assert(comAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties3.equals(comAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties4));
        System.assert(comAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties4.equals(comAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties3));
        System.assert(comAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties3.equals(comAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeCqSocialServiceusersInter comAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties1 = OASComAdobeCqSocialServiceusersInter.getExample();
        OASComAdobeCqSocialServiceusersInter comAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties2 = OASComAdobeCqSocialServiceusersInter.getExample();
        OASComAdobeCqSocialServiceusersInter comAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties3 = new OASComAdobeCqSocialServiceusersInter();
        OASComAdobeCqSocialServiceusersInter comAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties4 = new OASComAdobeCqSocialServiceusersInter();

        System.assert(comAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties1.equals(comAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties2));
        System.assert(comAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties2.equals(comAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties1));
        System.assert(comAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties3.equals(comAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties4));
        System.assert(comAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties4.equals(comAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeCqSocialServiceusersInter comAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties1 = OASComAdobeCqSocialServiceusersInter.getExample();
        OASComAdobeCqSocialServiceusersInter comAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties2 = new OASComAdobeCqSocialServiceusersInter();

        System.assertEquals(false, comAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties1.equals('foo'));
        System.assertEquals(false, comAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeCqSocialServiceusersInter comAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties1 = OASComAdobeCqSocialServiceusersInter.getExample();
        OASComAdobeCqSocialServiceusersInter comAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties2 = new OASComAdobeCqSocialServiceusersInter();
        OASComAdobeCqSocialServiceusersInter comAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties3;

        System.assertEquals(false, comAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties1.equals(comAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties3));
        System.assertEquals(false, comAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties2.equals(comAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeCqSocialServiceusersInter comAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties1 = OASComAdobeCqSocialServiceusersInter.getExample();
        OASComAdobeCqSocialServiceusersInter comAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties2 = new OASComAdobeCqSocialServiceusersInter();

        System.assertEquals(comAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties1.hashCode(), comAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties1.hashCode());
        System.assertEquals(comAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties2.hashCode(), comAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeCqSocialServiceusersInter comAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties1 = OASComAdobeCqSocialServiceusersInter.getExample();
        OASComAdobeCqSocialServiceusersInter comAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties2 = OASComAdobeCqSocialServiceusersInter.getExample();
        OASComAdobeCqSocialServiceusersInter comAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties3 = new OASComAdobeCqSocialServiceusersInter();
        OASComAdobeCqSocialServiceusersInter comAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties4 = new OASComAdobeCqSocialServiceusersInter();

        System.assert(comAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties1.equals(comAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties2));
        System.assert(comAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties3.equals(comAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties4));
        System.assertEquals(comAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties1.hashCode(), comAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties2.hashCode());
        System.assertEquals(comAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties3.hashCode(), comAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties4.hashCode());
    }
}
