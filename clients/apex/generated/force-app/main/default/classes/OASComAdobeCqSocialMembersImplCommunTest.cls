@isTest
private class OASComAdobeCqSocialMembersImplCommunTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeCqSocialMembersImplCommun comAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties1 = OASComAdobeCqSocialMembersImplCommun.getExample();
        OASComAdobeCqSocialMembersImplCommun comAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties2 = comAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties1;
        OASComAdobeCqSocialMembersImplCommun comAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties3 = new OASComAdobeCqSocialMembersImplCommun();
        OASComAdobeCqSocialMembersImplCommun comAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties4 = comAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties3;

        System.assert(comAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties1.equals(comAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties2));
        System.assert(comAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties2.equals(comAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties1));
        System.assert(comAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties1.equals(comAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties1));
        System.assert(comAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties3.equals(comAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties4));
        System.assert(comAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties4.equals(comAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties3));
        System.assert(comAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties3.equals(comAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeCqSocialMembersImplCommun comAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties1 = OASComAdobeCqSocialMembersImplCommun.getExample();
        OASComAdobeCqSocialMembersImplCommun comAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties2 = OASComAdobeCqSocialMembersImplCommun.getExample();
        OASComAdobeCqSocialMembersImplCommun comAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties3 = new OASComAdobeCqSocialMembersImplCommun();
        OASComAdobeCqSocialMembersImplCommun comAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties4 = new OASComAdobeCqSocialMembersImplCommun();

        System.assert(comAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties1.equals(comAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties2));
        System.assert(comAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties2.equals(comAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties1));
        System.assert(comAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties3.equals(comAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties4));
        System.assert(comAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties4.equals(comAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeCqSocialMembersImplCommun comAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties1 = OASComAdobeCqSocialMembersImplCommun.getExample();
        OASComAdobeCqSocialMembersImplCommun comAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties2 = new OASComAdobeCqSocialMembersImplCommun();

        System.assertEquals(false, comAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties1.equals('foo'));
        System.assertEquals(false, comAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeCqSocialMembersImplCommun comAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties1 = OASComAdobeCqSocialMembersImplCommun.getExample();
        OASComAdobeCqSocialMembersImplCommun comAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties2 = new OASComAdobeCqSocialMembersImplCommun();
        OASComAdobeCqSocialMembersImplCommun comAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties3;

        System.assertEquals(false, comAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties1.equals(comAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties3));
        System.assertEquals(false, comAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties2.equals(comAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeCqSocialMembersImplCommun comAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties1 = OASComAdobeCqSocialMembersImplCommun.getExample();
        OASComAdobeCqSocialMembersImplCommun comAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties2 = new OASComAdobeCqSocialMembersImplCommun();

        System.assertEquals(comAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties1.hashCode(), comAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties1.hashCode());
        System.assertEquals(comAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties2.hashCode(), comAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeCqSocialMembersImplCommun comAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties1 = OASComAdobeCqSocialMembersImplCommun.getExample();
        OASComAdobeCqSocialMembersImplCommun comAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties2 = OASComAdobeCqSocialMembersImplCommun.getExample();
        OASComAdobeCqSocialMembersImplCommun comAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties3 = new OASComAdobeCqSocialMembersImplCommun();
        OASComAdobeCqSocialMembersImplCommun comAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties4 = new OASComAdobeCqSocialMembersImplCommun();

        System.assert(comAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties1.equals(comAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties2));
        System.assert(comAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties3.equals(comAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties4));
        System.assertEquals(comAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties1.hashCode(), comAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties2.hashCode());
        System.assertEquals(comAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties3.hashCode(), comAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties4.hashCode());
    }
}
