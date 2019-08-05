@isTest
private class OASComDayCqDamScene7ImplScene7AssetMTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqDamScene7ImplScene7AssetM comDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties1 = OASComDayCqDamScene7ImplScene7AssetM.getExample();
        OASComDayCqDamScene7ImplScene7AssetM comDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties2 = comDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties1;
        OASComDayCqDamScene7ImplScene7AssetM comDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties3 = new OASComDayCqDamScene7ImplScene7AssetM();
        OASComDayCqDamScene7ImplScene7AssetM comDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties4 = comDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties3;

        System.assert(comDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties1.equals(comDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties2));
        System.assert(comDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties2.equals(comDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties1));
        System.assert(comDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties1.equals(comDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties1));
        System.assert(comDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties3.equals(comDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties4));
        System.assert(comDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties4.equals(comDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties3));
        System.assert(comDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties3.equals(comDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqDamScene7ImplScene7AssetM comDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties1 = OASComDayCqDamScene7ImplScene7AssetM.getExample();
        OASComDayCqDamScene7ImplScene7AssetM comDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties2 = OASComDayCqDamScene7ImplScene7AssetM.getExample();
        OASComDayCqDamScene7ImplScene7AssetM comDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties3 = new OASComDayCqDamScene7ImplScene7AssetM();
        OASComDayCqDamScene7ImplScene7AssetM comDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties4 = new OASComDayCqDamScene7ImplScene7AssetM();

        System.assert(comDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties1.equals(comDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties2));
        System.assert(comDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties2.equals(comDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties1));
        System.assert(comDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties3.equals(comDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties4));
        System.assert(comDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties4.equals(comDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqDamScene7ImplScene7AssetM comDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties1 = OASComDayCqDamScene7ImplScene7AssetM.getExample();
        OASComDayCqDamScene7ImplScene7AssetM comDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties2 = new OASComDayCqDamScene7ImplScene7AssetM();

        System.assertEquals(false, comDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties1.equals('foo'));
        System.assertEquals(false, comDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqDamScene7ImplScene7AssetM comDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties1 = OASComDayCqDamScene7ImplScene7AssetM.getExample();
        OASComDayCqDamScene7ImplScene7AssetM comDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties2 = new OASComDayCqDamScene7ImplScene7AssetM();
        OASComDayCqDamScene7ImplScene7AssetM comDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties3;

        System.assertEquals(false, comDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties1.equals(comDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties3));
        System.assertEquals(false, comDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties2.equals(comDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqDamScene7ImplScene7AssetM comDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties1 = OASComDayCqDamScene7ImplScene7AssetM.getExample();
        OASComDayCqDamScene7ImplScene7AssetM comDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties2 = new OASComDayCqDamScene7ImplScene7AssetM();

        System.assertEquals(comDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties1.hashCode(), comDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties1.hashCode());
        System.assertEquals(comDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties2.hashCode(), comDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqDamScene7ImplScene7AssetM comDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties1 = OASComDayCqDamScene7ImplScene7AssetM.getExample();
        OASComDayCqDamScene7ImplScene7AssetM comDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties2 = OASComDayCqDamScene7ImplScene7AssetM.getExample();
        OASComDayCqDamScene7ImplScene7AssetM comDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties3 = new OASComDayCqDamScene7ImplScene7AssetM();
        OASComDayCqDamScene7ImplScene7AssetM comDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties4 = new OASComDayCqDamScene7ImplScene7AssetM();

        System.assert(comDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties1.equals(comDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties2));
        System.assert(comDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties3.equals(comDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties4));
        System.assertEquals(comDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties1.hashCode(), comDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties2.hashCode());
        System.assertEquals(comDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties3.hashCode(), comDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComDayCqDamScene7ImplScene7AssetM comDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties = new OASComDayCqDamScene7ImplScene7AssetM();
        Map<String, String> propertyMappings = comDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties.getPropertyMappings();
        System.assertEquals('cqDamScene7AssetmimetypeserviceMapping', propertyMappings.get('cq.dam.scene7.assetmimetypeservice.mapping'));
    }
}
