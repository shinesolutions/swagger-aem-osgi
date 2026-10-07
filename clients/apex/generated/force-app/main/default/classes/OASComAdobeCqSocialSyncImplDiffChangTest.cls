@isTest
private class OASComAdobeCqSocialSyncImplDiffChangTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeCqSocialSyncImplDiffChang comAdobeCqSocialSyncImplDiffChangesObserverProperties1 = OASComAdobeCqSocialSyncImplDiffChang.getExample();
        OASComAdobeCqSocialSyncImplDiffChang comAdobeCqSocialSyncImplDiffChangesObserverProperties2 = comAdobeCqSocialSyncImplDiffChangesObserverProperties1;
        OASComAdobeCqSocialSyncImplDiffChang comAdobeCqSocialSyncImplDiffChangesObserverProperties3 = new OASComAdobeCqSocialSyncImplDiffChang();
        OASComAdobeCqSocialSyncImplDiffChang comAdobeCqSocialSyncImplDiffChangesObserverProperties4 = comAdobeCqSocialSyncImplDiffChangesObserverProperties3;

        System.assert(comAdobeCqSocialSyncImplDiffChangesObserverProperties1.equals(comAdobeCqSocialSyncImplDiffChangesObserverProperties2));
        System.assert(comAdobeCqSocialSyncImplDiffChangesObserverProperties2.equals(comAdobeCqSocialSyncImplDiffChangesObserverProperties1));
        System.assert(comAdobeCqSocialSyncImplDiffChangesObserverProperties1.equals(comAdobeCqSocialSyncImplDiffChangesObserverProperties1));
        System.assert(comAdobeCqSocialSyncImplDiffChangesObserverProperties3.equals(comAdobeCqSocialSyncImplDiffChangesObserverProperties4));
        System.assert(comAdobeCqSocialSyncImplDiffChangesObserverProperties4.equals(comAdobeCqSocialSyncImplDiffChangesObserverProperties3));
        System.assert(comAdobeCqSocialSyncImplDiffChangesObserverProperties3.equals(comAdobeCqSocialSyncImplDiffChangesObserverProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeCqSocialSyncImplDiffChang comAdobeCqSocialSyncImplDiffChangesObserverProperties1 = OASComAdobeCqSocialSyncImplDiffChang.getExample();
        OASComAdobeCqSocialSyncImplDiffChang comAdobeCqSocialSyncImplDiffChangesObserverProperties2 = OASComAdobeCqSocialSyncImplDiffChang.getExample();
        OASComAdobeCqSocialSyncImplDiffChang comAdobeCqSocialSyncImplDiffChangesObserverProperties3 = new OASComAdobeCqSocialSyncImplDiffChang();
        OASComAdobeCqSocialSyncImplDiffChang comAdobeCqSocialSyncImplDiffChangesObserverProperties4 = new OASComAdobeCqSocialSyncImplDiffChang();

        System.assert(comAdobeCqSocialSyncImplDiffChangesObserverProperties1.equals(comAdobeCqSocialSyncImplDiffChangesObserverProperties2));
        System.assert(comAdobeCqSocialSyncImplDiffChangesObserverProperties2.equals(comAdobeCqSocialSyncImplDiffChangesObserverProperties1));
        System.assert(comAdobeCqSocialSyncImplDiffChangesObserverProperties3.equals(comAdobeCqSocialSyncImplDiffChangesObserverProperties4));
        System.assert(comAdobeCqSocialSyncImplDiffChangesObserverProperties4.equals(comAdobeCqSocialSyncImplDiffChangesObserverProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeCqSocialSyncImplDiffChang comAdobeCqSocialSyncImplDiffChangesObserverProperties1 = OASComAdobeCqSocialSyncImplDiffChang.getExample();
        OASComAdobeCqSocialSyncImplDiffChang comAdobeCqSocialSyncImplDiffChangesObserverProperties2 = new OASComAdobeCqSocialSyncImplDiffChang();

        System.assertEquals(false, comAdobeCqSocialSyncImplDiffChangesObserverProperties1.equals('foo'));
        System.assertEquals(false, comAdobeCqSocialSyncImplDiffChangesObserverProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeCqSocialSyncImplDiffChang comAdobeCqSocialSyncImplDiffChangesObserverProperties1 = OASComAdobeCqSocialSyncImplDiffChang.getExample();
        OASComAdobeCqSocialSyncImplDiffChang comAdobeCqSocialSyncImplDiffChangesObserverProperties2 = new OASComAdobeCqSocialSyncImplDiffChang();
        OASComAdobeCqSocialSyncImplDiffChang comAdobeCqSocialSyncImplDiffChangesObserverProperties3;

        System.assertEquals(false, comAdobeCqSocialSyncImplDiffChangesObserverProperties1.equals(comAdobeCqSocialSyncImplDiffChangesObserverProperties3));
        System.assertEquals(false, comAdobeCqSocialSyncImplDiffChangesObserverProperties2.equals(comAdobeCqSocialSyncImplDiffChangesObserverProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeCqSocialSyncImplDiffChang comAdobeCqSocialSyncImplDiffChangesObserverProperties1 = OASComAdobeCqSocialSyncImplDiffChang.getExample();
        OASComAdobeCqSocialSyncImplDiffChang comAdobeCqSocialSyncImplDiffChangesObserverProperties2 = new OASComAdobeCqSocialSyncImplDiffChang();

        System.assertEquals(comAdobeCqSocialSyncImplDiffChangesObserverProperties1.hashCode(), comAdobeCqSocialSyncImplDiffChangesObserverProperties1.hashCode());
        System.assertEquals(comAdobeCqSocialSyncImplDiffChangesObserverProperties2.hashCode(), comAdobeCqSocialSyncImplDiffChangesObserverProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeCqSocialSyncImplDiffChang comAdobeCqSocialSyncImplDiffChangesObserverProperties1 = OASComAdobeCqSocialSyncImplDiffChang.getExample();
        OASComAdobeCqSocialSyncImplDiffChang comAdobeCqSocialSyncImplDiffChangesObserverProperties2 = OASComAdobeCqSocialSyncImplDiffChang.getExample();
        OASComAdobeCqSocialSyncImplDiffChang comAdobeCqSocialSyncImplDiffChangesObserverProperties3 = new OASComAdobeCqSocialSyncImplDiffChang();
        OASComAdobeCqSocialSyncImplDiffChang comAdobeCqSocialSyncImplDiffChangesObserverProperties4 = new OASComAdobeCqSocialSyncImplDiffChang();

        System.assert(comAdobeCqSocialSyncImplDiffChangesObserverProperties1.equals(comAdobeCqSocialSyncImplDiffChangesObserverProperties2));
        System.assert(comAdobeCqSocialSyncImplDiffChangesObserverProperties3.equals(comAdobeCqSocialSyncImplDiffChangesObserverProperties4));
        System.assertEquals(comAdobeCqSocialSyncImplDiffChangesObserverProperties1.hashCode(), comAdobeCqSocialSyncImplDiffChangesObserverProperties2.hashCode());
        System.assertEquals(comAdobeCqSocialSyncImplDiffChangesObserverProperties3.hashCode(), comAdobeCqSocialSyncImplDiffChangesObserverProperties4.hashCode());
    }
}
