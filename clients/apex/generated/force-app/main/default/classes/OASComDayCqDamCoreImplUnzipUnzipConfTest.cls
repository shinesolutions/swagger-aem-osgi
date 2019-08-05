@isTest
private class OASComDayCqDamCoreImplUnzipUnzipConfTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqDamCoreImplUnzipUnzipConf comDayCqDamCoreImplUnzipUnzipConfigProperties1 = OASComDayCqDamCoreImplUnzipUnzipConf.getExample();
        OASComDayCqDamCoreImplUnzipUnzipConf comDayCqDamCoreImplUnzipUnzipConfigProperties2 = comDayCqDamCoreImplUnzipUnzipConfigProperties1;
        OASComDayCqDamCoreImplUnzipUnzipConf comDayCqDamCoreImplUnzipUnzipConfigProperties3 = new OASComDayCqDamCoreImplUnzipUnzipConf();
        OASComDayCqDamCoreImplUnzipUnzipConf comDayCqDamCoreImplUnzipUnzipConfigProperties4 = comDayCqDamCoreImplUnzipUnzipConfigProperties3;

        System.assert(comDayCqDamCoreImplUnzipUnzipConfigProperties1.equals(comDayCqDamCoreImplUnzipUnzipConfigProperties2));
        System.assert(comDayCqDamCoreImplUnzipUnzipConfigProperties2.equals(comDayCqDamCoreImplUnzipUnzipConfigProperties1));
        System.assert(comDayCqDamCoreImplUnzipUnzipConfigProperties1.equals(comDayCqDamCoreImplUnzipUnzipConfigProperties1));
        System.assert(comDayCqDamCoreImplUnzipUnzipConfigProperties3.equals(comDayCqDamCoreImplUnzipUnzipConfigProperties4));
        System.assert(comDayCqDamCoreImplUnzipUnzipConfigProperties4.equals(comDayCqDamCoreImplUnzipUnzipConfigProperties3));
        System.assert(comDayCqDamCoreImplUnzipUnzipConfigProperties3.equals(comDayCqDamCoreImplUnzipUnzipConfigProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqDamCoreImplUnzipUnzipConf comDayCqDamCoreImplUnzipUnzipConfigProperties1 = OASComDayCqDamCoreImplUnzipUnzipConf.getExample();
        OASComDayCqDamCoreImplUnzipUnzipConf comDayCqDamCoreImplUnzipUnzipConfigProperties2 = OASComDayCqDamCoreImplUnzipUnzipConf.getExample();
        OASComDayCqDamCoreImplUnzipUnzipConf comDayCqDamCoreImplUnzipUnzipConfigProperties3 = new OASComDayCqDamCoreImplUnzipUnzipConf();
        OASComDayCqDamCoreImplUnzipUnzipConf comDayCqDamCoreImplUnzipUnzipConfigProperties4 = new OASComDayCqDamCoreImplUnzipUnzipConf();

        System.assert(comDayCqDamCoreImplUnzipUnzipConfigProperties1.equals(comDayCqDamCoreImplUnzipUnzipConfigProperties2));
        System.assert(comDayCqDamCoreImplUnzipUnzipConfigProperties2.equals(comDayCqDamCoreImplUnzipUnzipConfigProperties1));
        System.assert(comDayCqDamCoreImplUnzipUnzipConfigProperties3.equals(comDayCqDamCoreImplUnzipUnzipConfigProperties4));
        System.assert(comDayCqDamCoreImplUnzipUnzipConfigProperties4.equals(comDayCqDamCoreImplUnzipUnzipConfigProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqDamCoreImplUnzipUnzipConf comDayCqDamCoreImplUnzipUnzipConfigProperties1 = OASComDayCqDamCoreImplUnzipUnzipConf.getExample();
        OASComDayCqDamCoreImplUnzipUnzipConf comDayCqDamCoreImplUnzipUnzipConfigProperties2 = new OASComDayCqDamCoreImplUnzipUnzipConf();

        System.assertEquals(false, comDayCqDamCoreImplUnzipUnzipConfigProperties1.equals('foo'));
        System.assertEquals(false, comDayCqDamCoreImplUnzipUnzipConfigProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqDamCoreImplUnzipUnzipConf comDayCqDamCoreImplUnzipUnzipConfigProperties1 = OASComDayCqDamCoreImplUnzipUnzipConf.getExample();
        OASComDayCqDamCoreImplUnzipUnzipConf comDayCqDamCoreImplUnzipUnzipConfigProperties2 = new OASComDayCqDamCoreImplUnzipUnzipConf();
        OASComDayCqDamCoreImplUnzipUnzipConf comDayCqDamCoreImplUnzipUnzipConfigProperties3;

        System.assertEquals(false, comDayCqDamCoreImplUnzipUnzipConfigProperties1.equals(comDayCqDamCoreImplUnzipUnzipConfigProperties3));
        System.assertEquals(false, comDayCqDamCoreImplUnzipUnzipConfigProperties2.equals(comDayCqDamCoreImplUnzipUnzipConfigProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqDamCoreImplUnzipUnzipConf comDayCqDamCoreImplUnzipUnzipConfigProperties1 = OASComDayCqDamCoreImplUnzipUnzipConf.getExample();
        OASComDayCqDamCoreImplUnzipUnzipConf comDayCqDamCoreImplUnzipUnzipConfigProperties2 = new OASComDayCqDamCoreImplUnzipUnzipConf();

        System.assertEquals(comDayCqDamCoreImplUnzipUnzipConfigProperties1.hashCode(), comDayCqDamCoreImplUnzipUnzipConfigProperties1.hashCode());
        System.assertEquals(comDayCqDamCoreImplUnzipUnzipConfigProperties2.hashCode(), comDayCqDamCoreImplUnzipUnzipConfigProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqDamCoreImplUnzipUnzipConf comDayCqDamCoreImplUnzipUnzipConfigProperties1 = OASComDayCqDamCoreImplUnzipUnzipConf.getExample();
        OASComDayCqDamCoreImplUnzipUnzipConf comDayCqDamCoreImplUnzipUnzipConfigProperties2 = OASComDayCqDamCoreImplUnzipUnzipConf.getExample();
        OASComDayCqDamCoreImplUnzipUnzipConf comDayCqDamCoreImplUnzipUnzipConfigProperties3 = new OASComDayCqDamCoreImplUnzipUnzipConf();
        OASComDayCqDamCoreImplUnzipUnzipConf comDayCqDamCoreImplUnzipUnzipConfigProperties4 = new OASComDayCqDamCoreImplUnzipUnzipConf();

        System.assert(comDayCqDamCoreImplUnzipUnzipConfigProperties1.equals(comDayCqDamCoreImplUnzipUnzipConfigProperties2));
        System.assert(comDayCqDamCoreImplUnzipUnzipConfigProperties3.equals(comDayCqDamCoreImplUnzipUnzipConfigProperties4));
        System.assertEquals(comDayCqDamCoreImplUnzipUnzipConfigProperties1.hashCode(), comDayCqDamCoreImplUnzipUnzipConfigProperties2.hashCode());
        System.assertEquals(comDayCqDamCoreImplUnzipUnzipConfigProperties3.hashCode(), comDayCqDamCoreImplUnzipUnzipConfigProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComDayCqDamCoreImplUnzipUnzipConf comDayCqDamCoreImplUnzipUnzipConfigProperties = new OASComDayCqDamCoreImplUnzipUnzipConf();
        Map<String, String> propertyMappings = comDayCqDamCoreImplUnzipUnzipConfigProperties.getPropertyMappings();
        System.assertEquals('cqDamConfigUnzipMaxuncompressedsize', propertyMappings.get('cq.dam.config.unzip.maxuncompressedsize'));
        System.assertEquals('cqDamConfigUnzipEncoding', propertyMappings.get('cq.dam.config.unzip.encoding'));
    }
}
