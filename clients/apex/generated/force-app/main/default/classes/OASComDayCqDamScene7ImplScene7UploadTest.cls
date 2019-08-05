@isTest
private class OASComDayCqDamScene7ImplScene7UploadTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqDamScene7ImplScene7Upload comDayCqDamScene7ImplScene7UploadServiceImplProperties1 = OASComDayCqDamScene7ImplScene7Upload.getExample();
        OASComDayCqDamScene7ImplScene7Upload comDayCqDamScene7ImplScene7UploadServiceImplProperties2 = comDayCqDamScene7ImplScene7UploadServiceImplProperties1;
        OASComDayCqDamScene7ImplScene7Upload comDayCqDamScene7ImplScene7UploadServiceImplProperties3 = new OASComDayCqDamScene7ImplScene7Upload();
        OASComDayCqDamScene7ImplScene7Upload comDayCqDamScene7ImplScene7UploadServiceImplProperties4 = comDayCqDamScene7ImplScene7UploadServiceImplProperties3;

        System.assert(comDayCqDamScene7ImplScene7UploadServiceImplProperties1.equals(comDayCqDamScene7ImplScene7UploadServiceImplProperties2));
        System.assert(comDayCqDamScene7ImplScene7UploadServiceImplProperties2.equals(comDayCqDamScene7ImplScene7UploadServiceImplProperties1));
        System.assert(comDayCqDamScene7ImplScene7UploadServiceImplProperties1.equals(comDayCqDamScene7ImplScene7UploadServiceImplProperties1));
        System.assert(comDayCqDamScene7ImplScene7UploadServiceImplProperties3.equals(comDayCqDamScene7ImplScene7UploadServiceImplProperties4));
        System.assert(comDayCqDamScene7ImplScene7UploadServiceImplProperties4.equals(comDayCqDamScene7ImplScene7UploadServiceImplProperties3));
        System.assert(comDayCqDamScene7ImplScene7UploadServiceImplProperties3.equals(comDayCqDamScene7ImplScene7UploadServiceImplProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqDamScene7ImplScene7Upload comDayCqDamScene7ImplScene7UploadServiceImplProperties1 = OASComDayCqDamScene7ImplScene7Upload.getExample();
        OASComDayCqDamScene7ImplScene7Upload comDayCqDamScene7ImplScene7UploadServiceImplProperties2 = OASComDayCqDamScene7ImplScene7Upload.getExample();
        OASComDayCqDamScene7ImplScene7Upload comDayCqDamScene7ImplScene7UploadServiceImplProperties3 = new OASComDayCqDamScene7ImplScene7Upload();
        OASComDayCqDamScene7ImplScene7Upload comDayCqDamScene7ImplScene7UploadServiceImplProperties4 = new OASComDayCqDamScene7ImplScene7Upload();

        System.assert(comDayCqDamScene7ImplScene7UploadServiceImplProperties1.equals(comDayCqDamScene7ImplScene7UploadServiceImplProperties2));
        System.assert(comDayCqDamScene7ImplScene7UploadServiceImplProperties2.equals(comDayCqDamScene7ImplScene7UploadServiceImplProperties1));
        System.assert(comDayCqDamScene7ImplScene7UploadServiceImplProperties3.equals(comDayCqDamScene7ImplScene7UploadServiceImplProperties4));
        System.assert(comDayCqDamScene7ImplScene7UploadServiceImplProperties4.equals(comDayCqDamScene7ImplScene7UploadServiceImplProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqDamScene7ImplScene7Upload comDayCqDamScene7ImplScene7UploadServiceImplProperties1 = OASComDayCqDamScene7ImplScene7Upload.getExample();
        OASComDayCqDamScene7ImplScene7Upload comDayCqDamScene7ImplScene7UploadServiceImplProperties2 = new OASComDayCqDamScene7ImplScene7Upload();

        System.assertEquals(false, comDayCqDamScene7ImplScene7UploadServiceImplProperties1.equals('foo'));
        System.assertEquals(false, comDayCqDamScene7ImplScene7UploadServiceImplProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqDamScene7ImplScene7Upload comDayCqDamScene7ImplScene7UploadServiceImplProperties1 = OASComDayCqDamScene7ImplScene7Upload.getExample();
        OASComDayCqDamScene7ImplScene7Upload comDayCqDamScene7ImplScene7UploadServiceImplProperties2 = new OASComDayCqDamScene7ImplScene7Upload();
        OASComDayCqDamScene7ImplScene7Upload comDayCqDamScene7ImplScene7UploadServiceImplProperties3;

        System.assertEquals(false, comDayCqDamScene7ImplScene7UploadServiceImplProperties1.equals(comDayCqDamScene7ImplScene7UploadServiceImplProperties3));
        System.assertEquals(false, comDayCqDamScene7ImplScene7UploadServiceImplProperties2.equals(comDayCqDamScene7ImplScene7UploadServiceImplProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqDamScene7ImplScene7Upload comDayCqDamScene7ImplScene7UploadServiceImplProperties1 = OASComDayCqDamScene7ImplScene7Upload.getExample();
        OASComDayCqDamScene7ImplScene7Upload comDayCqDamScene7ImplScene7UploadServiceImplProperties2 = new OASComDayCqDamScene7ImplScene7Upload();

        System.assertEquals(comDayCqDamScene7ImplScene7UploadServiceImplProperties1.hashCode(), comDayCqDamScene7ImplScene7UploadServiceImplProperties1.hashCode());
        System.assertEquals(comDayCqDamScene7ImplScene7UploadServiceImplProperties2.hashCode(), comDayCqDamScene7ImplScene7UploadServiceImplProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqDamScene7ImplScene7Upload comDayCqDamScene7ImplScene7UploadServiceImplProperties1 = OASComDayCqDamScene7ImplScene7Upload.getExample();
        OASComDayCqDamScene7ImplScene7Upload comDayCqDamScene7ImplScene7UploadServiceImplProperties2 = OASComDayCqDamScene7ImplScene7Upload.getExample();
        OASComDayCqDamScene7ImplScene7Upload comDayCqDamScene7ImplScene7UploadServiceImplProperties3 = new OASComDayCqDamScene7ImplScene7Upload();
        OASComDayCqDamScene7ImplScene7Upload comDayCqDamScene7ImplScene7UploadServiceImplProperties4 = new OASComDayCqDamScene7ImplScene7Upload();

        System.assert(comDayCqDamScene7ImplScene7UploadServiceImplProperties1.equals(comDayCqDamScene7ImplScene7UploadServiceImplProperties2));
        System.assert(comDayCqDamScene7ImplScene7UploadServiceImplProperties3.equals(comDayCqDamScene7ImplScene7UploadServiceImplProperties4));
        System.assertEquals(comDayCqDamScene7ImplScene7UploadServiceImplProperties1.hashCode(), comDayCqDamScene7ImplScene7UploadServiceImplProperties2.hashCode());
        System.assertEquals(comDayCqDamScene7ImplScene7UploadServiceImplProperties3.hashCode(), comDayCqDamScene7ImplScene7UploadServiceImplProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComDayCqDamScene7ImplScene7Upload comDayCqDamScene7ImplScene7UploadServiceImplProperties = new OASComDayCqDamScene7ImplScene7Upload();
        Map<String, String> propertyMappings = comDayCqDamScene7ImplScene7UploadServiceImplProperties.getPropertyMappings();
        System.assertEquals('cqDamScene7UploadserviceActivejobtimeoutLabel', propertyMappings.get('cq.dam.scene7.uploadservice.activejobtimeout.label'));
        System.assertEquals('cqDamScene7UploadserviceConnectionmaxperrouteLabel', propertyMappings.get('cq.dam.scene7.uploadservice.connectionmaxperroute.label'));
    }
}
