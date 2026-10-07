@isTest
private class OASComAdobeCqWcmStyleInternalComponeTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeCqWcmStyleInternalCompone comAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties1 = OASComAdobeCqWcmStyleInternalCompone.getExample();
        OASComAdobeCqWcmStyleInternalCompone comAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties2 = comAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties1;
        OASComAdobeCqWcmStyleInternalCompone comAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties3 = new OASComAdobeCqWcmStyleInternalCompone();
        OASComAdobeCqWcmStyleInternalCompone comAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties4 = comAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties3;

        System.assert(comAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties1.equals(comAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties2));
        System.assert(comAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties2.equals(comAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties1));
        System.assert(comAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties1.equals(comAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties1));
        System.assert(comAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties3.equals(comAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties4));
        System.assert(comAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties4.equals(comAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties3));
        System.assert(comAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties3.equals(comAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeCqWcmStyleInternalCompone comAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties1 = OASComAdobeCqWcmStyleInternalCompone.getExample();
        OASComAdobeCqWcmStyleInternalCompone comAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties2 = OASComAdobeCqWcmStyleInternalCompone.getExample();
        OASComAdobeCqWcmStyleInternalCompone comAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties3 = new OASComAdobeCqWcmStyleInternalCompone();
        OASComAdobeCqWcmStyleInternalCompone comAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties4 = new OASComAdobeCqWcmStyleInternalCompone();

        System.assert(comAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties1.equals(comAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties2));
        System.assert(comAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties2.equals(comAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties1));
        System.assert(comAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties3.equals(comAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties4));
        System.assert(comAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties4.equals(comAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeCqWcmStyleInternalCompone comAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties1 = OASComAdobeCqWcmStyleInternalCompone.getExample();
        OASComAdobeCqWcmStyleInternalCompone comAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties2 = new OASComAdobeCqWcmStyleInternalCompone();

        System.assertEquals(false, comAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties1.equals('foo'));
        System.assertEquals(false, comAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeCqWcmStyleInternalCompone comAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties1 = OASComAdobeCqWcmStyleInternalCompone.getExample();
        OASComAdobeCqWcmStyleInternalCompone comAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties2 = new OASComAdobeCqWcmStyleInternalCompone();
        OASComAdobeCqWcmStyleInternalCompone comAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties3;

        System.assertEquals(false, comAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties1.equals(comAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties3));
        System.assertEquals(false, comAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties2.equals(comAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeCqWcmStyleInternalCompone comAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties1 = OASComAdobeCqWcmStyleInternalCompone.getExample();
        OASComAdobeCqWcmStyleInternalCompone comAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties2 = new OASComAdobeCqWcmStyleInternalCompone();

        System.assertEquals(comAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties1.hashCode(), comAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties1.hashCode());
        System.assertEquals(comAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties2.hashCode(), comAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeCqWcmStyleInternalCompone comAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties1 = OASComAdobeCqWcmStyleInternalCompone.getExample();
        OASComAdobeCqWcmStyleInternalCompone comAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties2 = OASComAdobeCqWcmStyleInternalCompone.getExample();
        OASComAdobeCqWcmStyleInternalCompone comAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties3 = new OASComAdobeCqWcmStyleInternalCompone();
        OASComAdobeCqWcmStyleInternalCompone comAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties4 = new OASComAdobeCqWcmStyleInternalCompone();

        System.assert(comAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties1.equals(comAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties2));
        System.assert(comAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties3.equals(comAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties4));
        System.assertEquals(comAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties1.hashCode(), comAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties2.hashCode());
        System.assertEquals(comAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties3.hashCode(), comAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties4.hashCode());
    }
}
