@isTest
private class OASComAdobeCqSocialUgcbaseImplAysncRTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeCqSocialUgcbaseImplAysncR comAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties1 = OASComAdobeCqSocialUgcbaseImplAysncR.getExample();
        OASComAdobeCqSocialUgcbaseImplAysncR comAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties2 = comAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties1;
        OASComAdobeCqSocialUgcbaseImplAysncR comAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties3 = new OASComAdobeCqSocialUgcbaseImplAysncR();
        OASComAdobeCqSocialUgcbaseImplAysncR comAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties4 = comAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties3;

        System.assert(comAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties1.equals(comAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties2));
        System.assert(comAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties2.equals(comAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties1));
        System.assert(comAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties1.equals(comAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties1));
        System.assert(comAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties3.equals(comAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties4));
        System.assert(comAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties4.equals(comAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties3));
        System.assert(comAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties3.equals(comAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeCqSocialUgcbaseImplAysncR comAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties1 = OASComAdobeCqSocialUgcbaseImplAysncR.getExample();
        OASComAdobeCqSocialUgcbaseImplAysncR comAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties2 = OASComAdobeCqSocialUgcbaseImplAysncR.getExample();
        OASComAdobeCqSocialUgcbaseImplAysncR comAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties3 = new OASComAdobeCqSocialUgcbaseImplAysncR();
        OASComAdobeCqSocialUgcbaseImplAysncR comAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties4 = new OASComAdobeCqSocialUgcbaseImplAysncR();

        System.assert(comAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties1.equals(comAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties2));
        System.assert(comAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties2.equals(comAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties1));
        System.assert(comAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties3.equals(comAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties4));
        System.assert(comAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties4.equals(comAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeCqSocialUgcbaseImplAysncR comAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties1 = OASComAdobeCqSocialUgcbaseImplAysncR.getExample();
        OASComAdobeCqSocialUgcbaseImplAysncR comAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties2 = new OASComAdobeCqSocialUgcbaseImplAysncR();

        System.assertEquals(false, comAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties1.equals('foo'));
        System.assertEquals(false, comAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeCqSocialUgcbaseImplAysncR comAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties1 = OASComAdobeCqSocialUgcbaseImplAysncR.getExample();
        OASComAdobeCqSocialUgcbaseImplAysncR comAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties2 = new OASComAdobeCqSocialUgcbaseImplAysncR();
        OASComAdobeCqSocialUgcbaseImplAysncR comAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties3;

        System.assertEquals(false, comAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties1.equals(comAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties3));
        System.assertEquals(false, comAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties2.equals(comAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeCqSocialUgcbaseImplAysncR comAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties1 = OASComAdobeCqSocialUgcbaseImplAysncR.getExample();
        OASComAdobeCqSocialUgcbaseImplAysncR comAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties2 = new OASComAdobeCqSocialUgcbaseImplAysncR();

        System.assertEquals(comAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties1.hashCode(), comAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties1.hashCode());
        System.assertEquals(comAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties2.hashCode(), comAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeCqSocialUgcbaseImplAysncR comAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties1 = OASComAdobeCqSocialUgcbaseImplAysncR.getExample();
        OASComAdobeCqSocialUgcbaseImplAysncR comAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties2 = OASComAdobeCqSocialUgcbaseImplAysncR.getExample();
        OASComAdobeCqSocialUgcbaseImplAysncR comAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties3 = new OASComAdobeCqSocialUgcbaseImplAysncR();
        OASComAdobeCqSocialUgcbaseImplAysncR comAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties4 = new OASComAdobeCqSocialUgcbaseImplAysncR();

        System.assert(comAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties1.equals(comAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties2));
        System.assert(comAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties3.equals(comAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties4));
        System.assertEquals(comAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties1.hashCode(), comAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties2.hashCode());
        System.assertEquals(comAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties3.hashCode(), comAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties4.hashCode());
    }
}
