@isTest
private class OASComAdobeCqSocialMembersEndpointsITest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeCqSocialMembersEndpointsI comAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOProperties1 = OASComAdobeCqSocialMembersEndpointsI.getExample();
        OASComAdobeCqSocialMembersEndpointsI comAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOProperties2 = comAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOProperties1;
        OASComAdobeCqSocialMembersEndpointsI comAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOProperties3 = new OASComAdobeCqSocialMembersEndpointsI();
        OASComAdobeCqSocialMembersEndpointsI comAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOProperties4 = comAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOProperties3;

        System.assert(comAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOProperties1.equals(comAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOProperties2));
        System.assert(comAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOProperties2.equals(comAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOProperties1));
        System.assert(comAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOProperties1.equals(comAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOProperties1));
        System.assert(comAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOProperties3.equals(comAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOProperties4));
        System.assert(comAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOProperties4.equals(comAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOProperties3));
        System.assert(comAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOProperties3.equals(comAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeCqSocialMembersEndpointsI comAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOProperties1 = OASComAdobeCqSocialMembersEndpointsI.getExample();
        OASComAdobeCqSocialMembersEndpointsI comAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOProperties2 = OASComAdobeCqSocialMembersEndpointsI.getExample();
        OASComAdobeCqSocialMembersEndpointsI comAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOProperties3 = new OASComAdobeCqSocialMembersEndpointsI();
        OASComAdobeCqSocialMembersEndpointsI comAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOProperties4 = new OASComAdobeCqSocialMembersEndpointsI();

        System.assert(comAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOProperties1.equals(comAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOProperties2));
        System.assert(comAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOProperties2.equals(comAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOProperties1));
        System.assert(comAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOProperties3.equals(comAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOProperties4));
        System.assert(comAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOProperties4.equals(comAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeCqSocialMembersEndpointsI comAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOProperties1 = OASComAdobeCqSocialMembersEndpointsI.getExample();
        OASComAdobeCqSocialMembersEndpointsI comAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOProperties2 = new OASComAdobeCqSocialMembersEndpointsI();

        System.assertEquals(false, comAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOProperties1.equals('foo'));
        System.assertEquals(false, comAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeCqSocialMembersEndpointsI comAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOProperties1 = OASComAdobeCqSocialMembersEndpointsI.getExample();
        OASComAdobeCqSocialMembersEndpointsI comAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOProperties2 = new OASComAdobeCqSocialMembersEndpointsI();
        OASComAdobeCqSocialMembersEndpointsI comAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOProperties3;

        System.assertEquals(false, comAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOProperties1.equals(comAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOProperties3));
        System.assertEquals(false, comAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOProperties2.equals(comAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeCqSocialMembersEndpointsI comAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOProperties1 = OASComAdobeCqSocialMembersEndpointsI.getExample();
        OASComAdobeCqSocialMembersEndpointsI comAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOProperties2 = new OASComAdobeCqSocialMembersEndpointsI();

        System.assertEquals(comAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOProperties1.hashCode(), comAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOProperties1.hashCode());
        System.assertEquals(comAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOProperties2.hashCode(), comAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeCqSocialMembersEndpointsI comAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOProperties1 = OASComAdobeCqSocialMembersEndpointsI.getExample();
        OASComAdobeCqSocialMembersEndpointsI comAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOProperties2 = OASComAdobeCqSocialMembersEndpointsI.getExample();
        OASComAdobeCqSocialMembersEndpointsI comAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOProperties3 = new OASComAdobeCqSocialMembersEndpointsI();
        OASComAdobeCqSocialMembersEndpointsI comAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOProperties4 = new OASComAdobeCqSocialMembersEndpointsI();

        System.assert(comAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOProperties1.equals(comAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOProperties2));
        System.assert(comAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOProperties3.equals(comAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOProperties4));
        System.assertEquals(comAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOProperties1.hashCode(), comAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOProperties2.hashCode());
        System.assertEquals(comAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOProperties3.hashCode(), comAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOProperties4.hashCode());
    }
}
