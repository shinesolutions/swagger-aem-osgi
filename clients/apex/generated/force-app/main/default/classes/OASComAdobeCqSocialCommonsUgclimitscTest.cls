@isTest
private class OASComAdobeCqSocialCommonsUgclimitscTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeCqSocialCommonsUgclimitsc comAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties1 = OASComAdobeCqSocialCommonsUgclimitsc.getExample();
        OASComAdobeCqSocialCommonsUgclimitsc comAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties2 = comAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties1;
        OASComAdobeCqSocialCommonsUgclimitsc comAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties3 = new OASComAdobeCqSocialCommonsUgclimitsc();
        OASComAdobeCqSocialCommonsUgclimitsc comAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties4 = comAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties3;

        System.assert(comAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties1.equals(comAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties2));
        System.assert(comAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties2.equals(comAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties1));
        System.assert(comAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties1.equals(comAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties1));
        System.assert(comAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties3.equals(comAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties4));
        System.assert(comAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties4.equals(comAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties3));
        System.assert(comAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties3.equals(comAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeCqSocialCommonsUgclimitsc comAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties1 = OASComAdobeCqSocialCommonsUgclimitsc.getExample();
        OASComAdobeCqSocialCommonsUgclimitsc comAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties2 = OASComAdobeCqSocialCommonsUgclimitsc.getExample();
        OASComAdobeCqSocialCommonsUgclimitsc comAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties3 = new OASComAdobeCqSocialCommonsUgclimitsc();
        OASComAdobeCqSocialCommonsUgclimitsc comAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties4 = new OASComAdobeCqSocialCommonsUgclimitsc();

        System.assert(comAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties1.equals(comAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties2));
        System.assert(comAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties2.equals(comAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties1));
        System.assert(comAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties3.equals(comAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties4));
        System.assert(comAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties4.equals(comAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeCqSocialCommonsUgclimitsc comAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties1 = OASComAdobeCqSocialCommonsUgclimitsc.getExample();
        OASComAdobeCqSocialCommonsUgclimitsc comAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties2 = new OASComAdobeCqSocialCommonsUgclimitsc();

        System.assertEquals(false, comAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties1.equals('foo'));
        System.assertEquals(false, comAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeCqSocialCommonsUgclimitsc comAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties1 = OASComAdobeCqSocialCommonsUgclimitsc.getExample();
        OASComAdobeCqSocialCommonsUgclimitsc comAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties2 = new OASComAdobeCqSocialCommonsUgclimitsc();
        OASComAdobeCqSocialCommonsUgclimitsc comAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties3;

        System.assertEquals(false, comAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties1.equals(comAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties3));
        System.assertEquals(false, comAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties2.equals(comAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeCqSocialCommonsUgclimitsc comAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties1 = OASComAdobeCqSocialCommonsUgclimitsc.getExample();
        OASComAdobeCqSocialCommonsUgclimitsc comAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties2 = new OASComAdobeCqSocialCommonsUgclimitsc();

        System.assertEquals(comAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties1.hashCode(), comAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties1.hashCode());
        System.assertEquals(comAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties2.hashCode(), comAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeCqSocialCommonsUgclimitsc comAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties1 = OASComAdobeCqSocialCommonsUgclimitsc.getExample();
        OASComAdobeCqSocialCommonsUgclimitsc comAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties2 = OASComAdobeCqSocialCommonsUgclimitsc.getExample();
        OASComAdobeCqSocialCommonsUgclimitsc comAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties3 = new OASComAdobeCqSocialCommonsUgclimitsc();
        OASComAdobeCqSocialCommonsUgclimitsc comAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties4 = new OASComAdobeCqSocialCommonsUgclimitsc();

        System.assert(comAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties1.equals(comAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties2));
        System.assert(comAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties3.equals(comAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties4));
        System.assertEquals(comAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties1.hashCode(), comAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties2.hashCode());
        System.assertEquals(comAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties3.hashCode(), comAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeCqSocialCommonsUgclimitsc comAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties = new OASComAdobeCqSocialCommonsUgclimitsc();
        Map<String, String> propertyMappings = comAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties.getPropertyMappings();
        System.assertEquals('ugCLimit', propertyMappings.get('UGCLimit'));
    }
}
