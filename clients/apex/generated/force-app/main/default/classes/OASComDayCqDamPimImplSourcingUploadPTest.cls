@isTest
private class OASComDayCqDamPimImplSourcingUploadPTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqDamPimImplSourcingUploadP comDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties1 = OASComDayCqDamPimImplSourcingUploadP.getExample();
        OASComDayCqDamPimImplSourcingUploadP comDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties2 = comDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties1;
        OASComDayCqDamPimImplSourcingUploadP comDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties3 = new OASComDayCqDamPimImplSourcingUploadP();
        OASComDayCqDamPimImplSourcingUploadP comDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties4 = comDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties3;

        System.assert(comDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties1.equals(comDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties2));
        System.assert(comDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties2.equals(comDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties1));
        System.assert(comDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties1.equals(comDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties1));
        System.assert(comDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties3.equals(comDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties4));
        System.assert(comDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties4.equals(comDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties3));
        System.assert(comDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties3.equals(comDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqDamPimImplSourcingUploadP comDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties1 = OASComDayCqDamPimImplSourcingUploadP.getExample();
        OASComDayCqDamPimImplSourcingUploadP comDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties2 = OASComDayCqDamPimImplSourcingUploadP.getExample();
        OASComDayCqDamPimImplSourcingUploadP comDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties3 = new OASComDayCqDamPimImplSourcingUploadP();
        OASComDayCqDamPimImplSourcingUploadP comDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties4 = new OASComDayCqDamPimImplSourcingUploadP();

        System.assert(comDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties1.equals(comDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties2));
        System.assert(comDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties2.equals(comDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties1));
        System.assert(comDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties3.equals(comDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties4));
        System.assert(comDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties4.equals(comDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqDamPimImplSourcingUploadP comDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties1 = OASComDayCqDamPimImplSourcingUploadP.getExample();
        OASComDayCqDamPimImplSourcingUploadP comDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties2 = new OASComDayCqDamPimImplSourcingUploadP();

        System.assertEquals(false, comDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties1.equals('foo'));
        System.assertEquals(false, comDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqDamPimImplSourcingUploadP comDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties1 = OASComDayCqDamPimImplSourcingUploadP.getExample();
        OASComDayCqDamPimImplSourcingUploadP comDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties2 = new OASComDayCqDamPimImplSourcingUploadP();
        OASComDayCqDamPimImplSourcingUploadP comDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties3;

        System.assertEquals(false, comDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties1.equals(comDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties3));
        System.assertEquals(false, comDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties2.equals(comDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqDamPimImplSourcingUploadP comDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties1 = OASComDayCqDamPimImplSourcingUploadP.getExample();
        OASComDayCqDamPimImplSourcingUploadP comDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties2 = new OASComDayCqDamPimImplSourcingUploadP();

        System.assertEquals(comDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties1.hashCode(), comDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties1.hashCode());
        System.assertEquals(comDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties2.hashCode(), comDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqDamPimImplSourcingUploadP comDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties1 = OASComDayCqDamPimImplSourcingUploadP.getExample();
        OASComDayCqDamPimImplSourcingUploadP comDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties2 = OASComDayCqDamPimImplSourcingUploadP.getExample();
        OASComDayCqDamPimImplSourcingUploadP comDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties3 = new OASComDayCqDamPimImplSourcingUploadP();
        OASComDayCqDamPimImplSourcingUploadP comDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties4 = new OASComDayCqDamPimImplSourcingUploadP();

        System.assert(comDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties1.equals(comDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties2));
        System.assert(comDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties3.equals(comDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties4));
        System.assertEquals(comDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties1.hashCode(), comDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties2.hashCode());
        System.assertEquals(comDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties3.hashCode(), comDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComDayCqDamPimImplSourcingUploadP comDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties = new OASComDayCqDamPimImplSourcingUploadP();
        Map<String, String> propertyMappings = comDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties.getPropertyMappings();
        System.assertEquals('deleteZipFile', propertyMappings.get('delete.zip.file'));
    }
}
