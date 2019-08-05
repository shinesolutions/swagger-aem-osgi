@isTest
private class OASComDayCqDamHandlerStandardPsdPsdHTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqDamHandlerStandardPsdPsdH comDayCqDamHandlerStandardPsdPsdHandlerProperties1 = OASComDayCqDamHandlerStandardPsdPsdH.getExample();
        OASComDayCqDamHandlerStandardPsdPsdH comDayCqDamHandlerStandardPsdPsdHandlerProperties2 = comDayCqDamHandlerStandardPsdPsdHandlerProperties1;
        OASComDayCqDamHandlerStandardPsdPsdH comDayCqDamHandlerStandardPsdPsdHandlerProperties3 = new OASComDayCqDamHandlerStandardPsdPsdH();
        OASComDayCqDamHandlerStandardPsdPsdH comDayCqDamHandlerStandardPsdPsdHandlerProperties4 = comDayCqDamHandlerStandardPsdPsdHandlerProperties3;

        System.assert(comDayCqDamHandlerStandardPsdPsdHandlerProperties1.equals(comDayCqDamHandlerStandardPsdPsdHandlerProperties2));
        System.assert(comDayCqDamHandlerStandardPsdPsdHandlerProperties2.equals(comDayCqDamHandlerStandardPsdPsdHandlerProperties1));
        System.assert(comDayCqDamHandlerStandardPsdPsdHandlerProperties1.equals(comDayCqDamHandlerStandardPsdPsdHandlerProperties1));
        System.assert(comDayCqDamHandlerStandardPsdPsdHandlerProperties3.equals(comDayCqDamHandlerStandardPsdPsdHandlerProperties4));
        System.assert(comDayCqDamHandlerStandardPsdPsdHandlerProperties4.equals(comDayCqDamHandlerStandardPsdPsdHandlerProperties3));
        System.assert(comDayCqDamHandlerStandardPsdPsdHandlerProperties3.equals(comDayCqDamHandlerStandardPsdPsdHandlerProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqDamHandlerStandardPsdPsdH comDayCqDamHandlerStandardPsdPsdHandlerProperties1 = OASComDayCqDamHandlerStandardPsdPsdH.getExample();
        OASComDayCqDamHandlerStandardPsdPsdH comDayCqDamHandlerStandardPsdPsdHandlerProperties2 = OASComDayCqDamHandlerStandardPsdPsdH.getExample();
        OASComDayCqDamHandlerStandardPsdPsdH comDayCqDamHandlerStandardPsdPsdHandlerProperties3 = new OASComDayCqDamHandlerStandardPsdPsdH();
        OASComDayCqDamHandlerStandardPsdPsdH comDayCqDamHandlerStandardPsdPsdHandlerProperties4 = new OASComDayCqDamHandlerStandardPsdPsdH();

        System.assert(comDayCqDamHandlerStandardPsdPsdHandlerProperties1.equals(comDayCqDamHandlerStandardPsdPsdHandlerProperties2));
        System.assert(comDayCqDamHandlerStandardPsdPsdHandlerProperties2.equals(comDayCqDamHandlerStandardPsdPsdHandlerProperties1));
        System.assert(comDayCqDamHandlerStandardPsdPsdHandlerProperties3.equals(comDayCqDamHandlerStandardPsdPsdHandlerProperties4));
        System.assert(comDayCqDamHandlerStandardPsdPsdHandlerProperties4.equals(comDayCqDamHandlerStandardPsdPsdHandlerProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqDamHandlerStandardPsdPsdH comDayCqDamHandlerStandardPsdPsdHandlerProperties1 = OASComDayCqDamHandlerStandardPsdPsdH.getExample();
        OASComDayCqDamHandlerStandardPsdPsdH comDayCqDamHandlerStandardPsdPsdHandlerProperties2 = new OASComDayCqDamHandlerStandardPsdPsdH();

        System.assertEquals(false, comDayCqDamHandlerStandardPsdPsdHandlerProperties1.equals('foo'));
        System.assertEquals(false, comDayCqDamHandlerStandardPsdPsdHandlerProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqDamHandlerStandardPsdPsdH comDayCqDamHandlerStandardPsdPsdHandlerProperties1 = OASComDayCqDamHandlerStandardPsdPsdH.getExample();
        OASComDayCqDamHandlerStandardPsdPsdH comDayCqDamHandlerStandardPsdPsdHandlerProperties2 = new OASComDayCqDamHandlerStandardPsdPsdH();
        OASComDayCqDamHandlerStandardPsdPsdH comDayCqDamHandlerStandardPsdPsdHandlerProperties3;

        System.assertEquals(false, comDayCqDamHandlerStandardPsdPsdHandlerProperties1.equals(comDayCqDamHandlerStandardPsdPsdHandlerProperties3));
        System.assertEquals(false, comDayCqDamHandlerStandardPsdPsdHandlerProperties2.equals(comDayCqDamHandlerStandardPsdPsdHandlerProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqDamHandlerStandardPsdPsdH comDayCqDamHandlerStandardPsdPsdHandlerProperties1 = OASComDayCqDamHandlerStandardPsdPsdH.getExample();
        OASComDayCqDamHandlerStandardPsdPsdH comDayCqDamHandlerStandardPsdPsdHandlerProperties2 = new OASComDayCqDamHandlerStandardPsdPsdH();

        System.assertEquals(comDayCqDamHandlerStandardPsdPsdHandlerProperties1.hashCode(), comDayCqDamHandlerStandardPsdPsdHandlerProperties1.hashCode());
        System.assertEquals(comDayCqDamHandlerStandardPsdPsdHandlerProperties2.hashCode(), comDayCqDamHandlerStandardPsdPsdHandlerProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqDamHandlerStandardPsdPsdH comDayCqDamHandlerStandardPsdPsdHandlerProperties1 = OASComDayCqDamHandlerStandardPsdPsdH.getExample();
        OASComDayCqDamHandlerStandardPsdPsdH comDayCqDamHandlerStandardPsdPsdHandlerProperties2 = OASComDayCqDamHandlerStandardPsdPsdH.getExample();
        OASComDayCqDamHandlerStandardPsdPsdH comDayCqDamHandlerStandardPsdPsdHandlerProperties3 = new OASComDayCqDamHandlerStandardPsdPsdH();
        OASComDayCqDamHandlerStandardPsdPsdH comDayCqDamHandlerStandardPsdPsdHandlerProperties4 = new OASComDayCqDamHandlerStandardPsdPsdH();

        System.assert(comDayCqDamHandlerStandardPsdPsdHandlerProperties1.equals(comDayCqDamHandlerStandardPsdPsdHandlerProperties2));
        System.assert(comDayCqDamHandlerStandardPsdPsdHandlerProperties3.equals(comDayCqDamHandlerStandardPsdPsdHandlerProperties4));
        System.assertEquals(comDayCqDamHandlerStandardPsdPsdHandlerProperties1.hashCode(), comDayCqDamHandlerStandardPsdPsdHandlerProperties2.hashCode());
        System.assertEquals(comDayCqDamHandlerStandardPsdPsdHandlerProperties3.hashCode(), comDayCqDamHandlerStandardPsdPsdHandlerProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComDayCqDamHandlerStandardPsdPsdH comDayCqDamHandlerStandardPsdPsdHandlerProperties = new OASComDayCqDamHandlerStandardPsdPsdH();
        Map<String, String> propertyMappings = comDayCqDamHandlerStandardPsdPsdHandlerProperties.getPropertyMappings();
        System.assertEquals('largeFileThreshold', propertyMappings.get('large_file_threshold'));
    }
}
