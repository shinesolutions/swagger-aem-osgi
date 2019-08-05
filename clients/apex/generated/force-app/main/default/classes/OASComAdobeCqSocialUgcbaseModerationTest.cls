@isTest
private class OASComAdobeCqSocialUgcbaseModerationTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeCqSocialUgcbaseModeration comAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties1 = OASComAdobeCqSocialUgcbaseModeration.getExample();
        OASComAdobeCqSocialUgcbaseModeration comAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties2 = comAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties1;
        OASComAdobeCqSocialUgcbaseModeration comAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties3 = new OASComAdobeCqSocialUgcbaseModeration();
        OASComAdobeCqSocialUgcbaseModeration comAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties4 = comAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties3;

        System.assert(comAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties1.equals(comAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties2));
        System.assert(comAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties2.equals(comAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties1));
        System.assert(comAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties1.equals(comAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties1));
        System.assert(comAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties3.equals(comAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties4));
        System.assert(comAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties4.equals(comAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties3));
        System.assert(comAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties3.equals(comAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeCqSocialUgcbaseModeration comAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties1 = OASComAdobeCqSocialUgcbaseModeration.getExample();
        OASComAdobeCqSocialUgcbaseModeration comAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties2 = OASComAdobeCqSocialUgcbaseModeration.getExample();
        OASComAdobeCqSocialUgcbaseModeration comAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties3 = new OASComAdobeCqSocialUgcbaseModeration();
        OASComAdobeCqSocialUgcbaseModeration comAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties4 = new OASComAdobeCqSocialUgcbaseModeration();

        System.assert(comAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties1.equals(comAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties2));
        System.assert(comAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties2.equals(comAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties1));
        System.assert(comAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties3.equals(comAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties4));
        System.assert(comAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties4.equals(comAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeCqSocialUgcbaseModeration comAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties1 = OASComAdobeCqSocialUgcbaseModeration.getExample();
        OASComAdobeCqSocialUgcbaseModeration comAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties2 = new OASComAdobeCqSocialUgcbaseModeration();

        System.assertEquals(false, comAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties1.equals('foo'));
        System.assertEquals(false, comAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeCqSocialUgcbaseModeration comAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties1 = OASComAdobeCqSocialUgcbaseModeration.getExample();
        OASComAdobeCqSocialUgcbaseModeration comAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties2 = new OASComAdobeCqSocialUgcbaseModeration();
        OASComAdobeCqSocialUgcbaseModeration comAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties3;

        System.assertEquals(false, comAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties1.equals(comAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties3));
        System.assertEquals(false, comAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties2.equals(comAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeCqSocialUgcbaseModeration comAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties1 = OASComAdobeCqSocialUgcbaseModeration.getExample();
        OASComAdobeCqSocialUgcbaseModeration comAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties2 = new OASComAdobeCqSocialUgcbaseModeration();

        System.assertEquals(comAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties1.hashCode(), comAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties1.hashCode());
        System.assertEquals(comAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties2.hashCode(), comAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeCqSocialUgcbaseModeration comAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties1 = OASComAdobeCqSocialUgcbaseModeration.getExample();
        OASComAdobeCqSocialUgcbaseModeration comAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties2 = OASComAdobeCqSocialUgcbaseModeration.getExample();
        OASComAdobeCqSocialUgcbaseModeration comAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties3 = new OASComAdobeCqSocialUgcbaseModeration();
        OASComAdobeCqSocialUgcbaseModeration comAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties4 = new OASComAdobeCqSocialUgcbaseModeration();

        System.assert(comAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties1.equals(comAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties2));
        System.assert(comAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties3.equals(comAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties4));
        System.assertEquals(comAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties1.hashCode(), comAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties2.hashCode());
        System.assertEquals(comAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties3.hashCode(), comAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeCqSocialUgcbaseModeration comAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties = new OASComAdobeCqSocialUgcbaseModeration();
        Map<String, String> propertyMappings = comAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties.getPropertyMappings();
        System.assertEquals('watchwordsPositive', propertyMappings.get('watchwords.positive'));
        System.assertEquals('watchwordsNegative', propertyMappings.get('watchwords.negative'));
        System.assertEquals('watchwordsPath', propertyMappings.get('watchwords.path'));
        System.assertEquals('sentimentPath', propertyMappings.get('sentiment.path'));
    }
}
