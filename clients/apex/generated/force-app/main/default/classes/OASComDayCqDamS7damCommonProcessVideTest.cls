@isTest
private class OASComDayCqDamS7damCommonProcessVideTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqDamS7damCommonProcessVide comDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties1 = OASComDayCqDamS7damCommonProcessVide.getExample();
        OASComDayCqDamS7damCommonProcessVide comDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties2 = comDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties1;
        OASComDayCqDamS7damCommonProcessVide comDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties3 = new OASComDayCqDamS7damCommonProcessVide();
        OASComDayCqDamS7damCommonProcessVide comDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties4 = comDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties3;

        System.assert(comDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties1.equals(comDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties2));
        System.assert(comDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties2.equals(comDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties1));
        System.assert(comDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties1.equals(comDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties1));
        System.assert(comDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties3.equals(comDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties4));
        System.assert(comDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties4.equals(comDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties3));
        System.assert(comDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties3.equals(comDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqDamS7damCommonProcessVide comDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties1 = OASComDayCqDamS7damCommonProcessVide.getExample();
        OASComDayCqDamS7damCommonProcessVide comDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties2 = OASComDayCqDamS7damCommonProcessVide.getExample();
        OASComDayCqDamS7damCommonProcessVide comDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties3 = new OASComDayCqDamS7damCommonProcessVide();
        OASComDayCqDamS7damCommonProcessVide comDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties4 = new OASComDayCqDamS7damCommonProcessVide();

        System.assert(comDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties1.equals(comDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties2));
        System.assert(comDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties2.equals(comDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties1));
        System.assert(comDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties3.equals(comDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties4));
        System.assert(comDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties4.equals(comDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqDamS7damCommonProcessVide comDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties1 = OASComDayCqDamS7damCommonProcessVide.getExample();
        OASComDayCqDamS7damCommonProcessVide comDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties2 = new OASComDayCqDamS7damCommonProcessVide();

        System.assertEquals(false, comDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties1.equals('foo'));
        System.assertEquals(false, comDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqDamS7damCommonProcessVide comDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties1 = OASComDayCqDamS7damCommonProcessVide.getExample();
        OASComDayCqDamS7damCommonProcessVide comDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties2 = new OASComDayCqDamS7damCommonProcessVide();
        OASComDayCqDamS7damCommonProcessVide comDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties3;

        System.assertEquals(false, comDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties1.equals(comDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties3));
        System.assertEquals(false, comDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties2.equals(comDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqDamS7damCommonProcessVide comDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties1 = OASComDayCqDamS7damCommonProcessVide.getExample();
        OASComDayCqDamS7damCommonProcessVide comDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties2 = new OASComDayCqDamS7damCommonProcessVide();

        System.assertEquals(comDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties1.hashCode(), comDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties1.hashCode());
        System.assertEquals(comDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties2.hashCode(), comDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqDamS7damCommonProcessVide comDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties1 = OASComDayCqDamS7damCommonProcessVide.getExample();
        OASComDayCqDamS7damCommonProcessVide comDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties2 = OASComDayCqDamS7damCommonProcessVide.getExample();
        OASComDayCqDamS7damCommonProcessVide comDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties3 = new OASComDayCqDamS7damCommonProcessVide();
        OASComDayCqDamS7damCommonProcessVide comDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties4 = new OASComDayCqDamS7damCommonProcessVide();

        System.assert(comDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties1.equals(comDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties2));
        System.assert(comDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties3.equals(comDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties4));
        System.assertEquals(comDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties1.hashCode(), comDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties2.hashCode());
        System.assertEquals(comDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties3.hashCode(), comDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComDayCqDamS7damCommonProcessVide comDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties = new OASComDayCqDamS7damCommonProcessVide();
        Map<String, String> propertyMappings = comDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties.getPropertyMappings();
        System.assertEquals('processLabel', propertyMappings.get('process.label'));
    }
}
