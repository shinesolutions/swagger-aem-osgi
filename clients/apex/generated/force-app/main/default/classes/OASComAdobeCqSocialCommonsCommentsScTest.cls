@isTest
private class OASComAdobeCqSocialCommonsCommentsScTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeCqSocialCommonsCommentsSc comAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties1 = OASComAdobeCqSocialCommonsCommentsSc.getExample();
        OASComAdobeCqSocialCommonsCommentsSc comAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties2 = comAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties1;
        OASComAdobeCqSocialCommonsCommentsSc comAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties3 = new OASComAdobeCqSocialCommonsCommentsSc();
        OASComAdobeCqSocialCommonsCommentsSc comAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties4 = comAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties3;

        System.assert(comAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties1.equals(comAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties2));
        System.assert(comAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties2.equals(comAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties1));
        System.assert(comAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties1.equals(comAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties1));
        System.assert(comAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties3.equals(comAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties4));
        System.assert(comAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties4.equals(comAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties3));
        System.assert(comAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties3.equals(comAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeCqSocialCommonsCommentsSc comAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties1 = OASComAdobeCqSocialCommonsCommentsSc.getExample();
        OASComAdobeCqSocialCommonsCommentsSc comAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties2 = OASComAdobeCqSocialCommonsCommentsSc.getExample();
        OASComAdobeCqSocialCommonsCommentsSc comAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties3 = new OASComAdobeCqSocialCommonsCommentsSc();
        OASComAdobeCqSocialCommonsCommentsSc comAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties4 = new OASComAdobeCqSocialCommonsCommentsSc();

        System.assert(comAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties1.equals(comAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties2));
        System.assert(comAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties2.equals(comAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties1));
        System.assert(comAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties3.equals(comAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties4));
        System.assert(comAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties4.equals(comAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeCqSocialCommonsCommentsSc comAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties1 = OASComAdobeCqSocialCommonsCommentsSc.getExample();
        OASComAdobeCqSocialCommonsCommentsSc comAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties2 = new OASComAdobeCqSocialCommonsCommentsSc();

        System.assertEquals(false, comAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties1.equals('foo'));
        System.assertEquals(false, comAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeCqSocialCommonsCommentsSc comAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties1 = OASComAdobeCqSocialCommonsCommentsSc.getExample();
        OASComAdobeCqSocialCommonsCommentsSc comAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties2 = new OASComAdobeCqSocialCommonsCommentsSc();
        OASComAdobeCqSocialCommonsCommentsSc comAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties3;

        System.assertEquals(false, comAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties1.equals(comAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties3));
        System.assertEquals(false, comAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties2.equals(comAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeCqSocialCommonsCommentsSc comAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties1 = OASComAdobeCqSocialCommonsCommentsSc.getExample();
        OASComAdobeCqSocialCommonsCommentsSc comAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties2 = new OASComAdobeCqSocialCommonsCommentsSc();

        System.assertEquals(comAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties1.hashCode(), comAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties1.hashCode());
        System.assertEquals(comAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties2.hashCode(), comAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeCqSocialCommonsCommentsSc comAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties1 = OASComAdobeCqSocialCommonsCommentsSc.getExample();
        OASComAdobeCqSocialCommonsCommentsSc comAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties2 = OASComAdobeCqSocialCommonsCommentsSc.getExample();
        OASComAdobeCqSocialCommonsCommentsSc comAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties3 = new OASComAdobeCqSocialCommonsCommentsSc();
        OASComAdobeCqSocialCommonsCommentsSc comAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties4 = new OASComAdobeCqSocialCommonsCommentsSc();

        System.assert(comAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties1.equals(comAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties2));
        System.assert(comAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties3.equals(comAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties4));
        System.assertEquals(comAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties1.hashCode(), comAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties2.hashCode());
        System.assertEquals(comAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties3.hashCode(), comAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties4.hashCode());
    }
}
