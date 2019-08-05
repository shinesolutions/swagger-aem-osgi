@isTest
private class OASComAdobeCqSocialCommonsEmailreplyTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeCqSocialCommonsEmailreply comAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties1 = OASComAdobeCqSocialCommonsEmailreply.getExample();
        OASComAdobeCqSocialCommonsEmailreply comAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties2 = comAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties1;
        OASComAdobeCqSocialCommonsEmailreply comAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties3 = new OASComAdobeCqSocialCommonsEmailreply();
        OASComAdobeCqSocialCommonsEmailreply comAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties4 = comAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties3;

        System.assert(comAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties1.equals(comAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties2));
        System.assert(comAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties2.equals(comAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties1));
        System.assert(comAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties1.equals(comAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties1));
        System.assert(comAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties3.equals(comAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties4));
        System.assert(comAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties4.equals(comAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties3));
        System.assert(comAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties3.equals(comAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeCqSocialCommonsEmailreply comAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties1 = OASComAdobeCqSocialCommonsEmailreply.getExample();
        OASComAdobeCqSocialCommonsEmailreply comAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties2 = OASComAdobeCqSocialCommonsEmailreply.getExample();
        OASComAdobeCqSocialCommonsEmailreply comAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties3 = new OASComAdobeCqSocialCommonsEmailreply();
        OASComAdobeCqSocialCommonsEmailreply comAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties4 = new OASComAdobeCqSocialCommonsEmailreply();

        System.assert(comAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties1.equals(comAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties2));
        System.assert(comAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties2.equals(comAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties1));
        System.assert(comAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties3.equals(comAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties4));
        System.assert(comAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties4.equals(comAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeCqSocialCommonsEmailreply comAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties1 = OASComAdobeCqSocialCommonsEmailreply.getExample();
        OASComAdobeCqSocialCommonsEmailreply comAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties2 = new OASComAdobeCqSocialCommonsEmailreply();

        System.assertEquals(false, comAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties1.equals('foo'));
        System.assertEquals(false, comAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeCqSocialCommonsEmailreply comAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties1 = OASComAdobeCqSocialCommonsEmailreply.getExample();
        OASComAdobeCqSocialCommonsEmailreply comAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties2 = new OASComAdobeCqSocialCommonsEmailreply();
        OASComAdobeCqSocialCommonsEmailreply comAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties3;

        System.assertEquals(false, comAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties1.equals(comAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties3));
        System.assertEquals(false, comAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties2.equals(comAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeCqSocialCommonsEmailreply comAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties1 = OASComAdobeCqSocialCommonsEmailreply.getExample();
        OASComAdobeCqSocialCommonsEmailreply comAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties2 = new OASComAdobeCqSocialCommonsEmailreply();

        System.assertEquals(comAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties1.hashCode(), comAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties1.hashCode());
        System.assertEquals(comAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties2.hashCode(), comAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeCqSocialCommonsEmailreply comAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties1 = OASComAdobeCqSocialCommonsEmailreply.getExample();
        OASComAdobeCqSocialCommonsEmailreply comAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties2 = OASComAdobeCqSocialCommonsEmailreply.getExample();
        OASComAdobeCqSocialCommonsEmailreply comAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties3 = new OASComAdobeCqSocialCommonsEmailreply();
        OASComAdobeCqSocialCommonsEmailreply comAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties4 = new OASComAdobeCqSocialCommonsEmailreply();

        System.assert(comAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties1.equals(comAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties2));
        System.assert(comAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties3.equals(comAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties4));
        System.assertEquals(comAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties1.hashCode(), comAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties2.hashCode());
        System.assertEquals(comAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties3.hashCode(), comAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeCqSocialCommonsEmailreply comAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties = new OASComAdobeCqSocialCommonsEmailreply();
        Map<String, String> propertyMappings = comAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties.getPropertyMappings();
        System.assertEquals('emailName', propertyMappings.get('email.name'));
        System.assertEquals('emailCreatePostFromReply', propertyMappings.get('email.createPostFromReply'));
        System.assertEquals('emailAddCommentIdTo', propertyMappings.get('email.addCommentIdTo'));
        System.assertEquals('emailSubjectMaximumLength', propertyMappings.get('email.subjectMaximumLength'));
        System.assertEquals('emailReplyToAddress', propertyMappings.get('email.replyToAddress'));
        System.assertEquals('emailReplyToDelimiter', propertyMappings.get('email.replyToDelimiter'));
        System.assertEquals('emailTrackerIdPrefixInSubject', propertyMappings.get('email.trackerIdPrefixInSubject'));
        System.assertEquals('emailTrackerIdPrefixInBody', propertyMappings.get('email.trackerIdPrefixInBody'));
        System.assertEquals('emailAsHTML', propertyMappings.get('email.asHTML'));
        System.assertEquals('emailDefaultUserName', propertyMappings.get('email.defaultUserName'));
        System.assertEquals('emailTemplatesRootPath', propertyMappings.get('email.templates.rootPath'));
    }
}
