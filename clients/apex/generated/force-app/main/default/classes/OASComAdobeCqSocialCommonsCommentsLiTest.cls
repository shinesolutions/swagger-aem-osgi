@isTest
private class OASComAdobeCqSocialCommonsCommentsLiTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeCqSocialCommonsCommentsLi comAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties1 = OASComAdobeCqSocialCommonsCommentsLi.getExample();
        OASComAdobeCqSocialCommonsCommentsLi comAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties2 = comAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties1;
        OASComAdobeCqSocialCommonsCommentsLi comAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties3 = new OASComAdobeCqSocialCommonsCommentsLi();
        OASComAdobeCqSocialCommonsCommentsLi comAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties4 = comAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties3;

        System.assert(comAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties1.equals(comAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties2));
        System.assert(comAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties2.equals(comAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties1));
        System.assert(comAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties1.equals(comAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties1));
        System.assert(comAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties3.equals(comAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties4));
        System.assert(comAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties4.equals(comAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties3));
        System.assert(comAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties3.equals(comAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeCqSocialCommonsCommentsLi comAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties1 = OASComAdobeCqSocialCommonsCommentsLi.getExample();
        OASComAdobeCqSocialCommonsCommentsLi comAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties2 = OASComAdobeCqSocialCommonsCommentsLi.getExample();
        OASComAdobeCqSocialCommonsCommentsLi comAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties3 = new OASComAdobeCqSocialCommonsCommentsLi();
        OASComAdobeCqSocialCommonsCommentsLi comAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties4 = new OASComAdobeCqSocialCommonsCommentsLi();

        System.assert(comAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties1.equals(comAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties2));
        System.assert(comAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties2.equals(comAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties1));
        System.assert(comAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties3.equals(comAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties4));
        System.assert(comAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties4.equals(comAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeCqSocialCommonsCommentsLi comAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties1 = OASComAdobeCqSocialCommonsCommentsLi.getExample();
        OASComAdobeCqSocialCommonsCommentsLi comAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties2 = new OASComAdobeCqSocialCommonsCommentsLi();

        System.assertEquals(false, comAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties1.equals('foo'));
        System.assertEquals(false, comAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeCqSocialCommonsCommentsLi comAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties1 = OASComAdobeCqSocialCommonsCommentsLi.getExample();
        OASComAdobeCqSocialCommonsCommentsLi comAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties2 = new OASComAdobeCqSocialCommonsCommentsLi();
        OASComAdobeCqSocialCommonsCommentsLi comAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties3;

        System.assertEquals(false, comAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties1.equals(comAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties3));
        System.assertEquals(false, comAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties2.equals(comAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeCqSocialCommonsCommentsLi comAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties1 = OASComAdobeCqSocialCommonsCommentsLi.getExample();
        OASComAdobeCqSocialCommonsCommentsLi comAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties2 = new OASComAdobeCqSocialCommonsCommentsLi();

        System.assertEquals(comAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties1.hashCode(), comAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties1.hashCode());
        System.assertEquals(comAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties2.hashCode(), comAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeCqSocialCommonsCommentsLi comAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties1 = OASComAdobeCqSocialCommonsCommentsLi.getExample();
        OASComAdobeCqSocialCommonsCommentsLi comAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties2 = OASComAdobeCqSocialCommonsCommentsLi.getExample();
        OASComAdobeCqSocialCommonsCommentsLi comAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties3 = new OASComAdobeCqSocialCommonsCommentsLi();
        OASComAdobeCqSocialCommonsCommentsLi comAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties4 = new OASComAdobeCqSocialCommonsCommentsLi();

        System.assert(comAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties1.equals(comAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties2));
        System.assert(comAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties3.equals(comAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties4));
        System.assertEquals(comAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties1.hashCode(), comAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties2.hashCode());
        System.assertEquals(comAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties3.hashCode(), comAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties4.hashCode());
    }
}
