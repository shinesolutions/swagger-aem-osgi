@isTest
private class OASComDayCqTaggingImplJcrTagManagerFTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqTaggingImplJcrTagManagerF comDayCqTaggingImplJcrTagManagerFactoryImplProperties1 = OASComDayCqTaggingImplJcrTagManagerF.getExample();
        OASComDayCqTaggingImplJcrTagManagerF comDayCqTaggingImplJcrTagManagerFactoryImplProperties2 = comDayCqTaggingImplJcrTagManagerFactoryImplProperties1;
        OASComDayCqTaggingImplJcrTagManagerF comDayCqTaggingImplJcrTagManagerFactoryImplProperties3 = new OASComDayCqTaggingImplJcrTagManagerF();
        OASComDayCqTaggingImplJcrTagManagerF comDayCqTaggingImplJcrTagManagerFactoryImplProperties4 = comDayCqTaggingImplJcrTagManagerFactoryImplProperties3;

        System.assert(comDayCqTaggingImplJcrTagManagerFactoryImplProperties1.equals(comDayCqTaggingImplJcrTagManagerFactoryImplProperties2));
        System.assert(comDayCqTaggingImplJcrTagManagerFactoryImplProperties2.equals(comDayCqTaggingImplJcrTagManagerFactoryImplProperties1));
        System.assert(comDayCqTaggingImplJcrTagManagerFactoryImplProperties1.equals(comDayCqTaggingImplJcrTagManagerFactoryImplProperties1));
        System.assert(comDayCqTaggingImplJcrTagManagerFactoryImplProperties3.equals(comDayCqTaggingImplJcrTagManagerFactoryImplProperties4));
        System.assert(comDayCqTaggingImplJcrTagManagerFactoryImplProperties4.equals(comDayCqTaggingImplJcrTagManagerFactoryImplProperties3));
        System.assert(comDayCqTaggingImplJcrTagManagerFactoryImplProperties3.equals(comDayCqTaggingImplJcrTagManagerFactoryImplProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqTaggingImplJcrTagManagerF comDayCqTaggingImplJcrTagManagerFactoryImplProperties1 = OASComDayCqTaggingImplJcrTagManagerF.getExample();
        OASComDayCqTaggingImplJcrTagManagerF comDayCqTaggingImplJcrTagManagerFactoryImplProperties2 = OASComDayCqTaggingImplJcrTagManagerF.getExample();
        OASComDayCqTaggingImplJcrTagManagerF comDayCqTaggingImplJcrTagManagerFactoryImplProperties3 = new OASComDayCqTaggingImplJcrTagManagerF();
        OASComDayCqTaggingImplJcrTagManagerF comDayCqTaggingImplJcrTagManagerFactoryImplProperties4 = new OASComDayCqTaggingImplJcrTagManagerF();

        System.assert(comDayCqTaggingImplJcrTagManagerFactoryImplProperties1.equals(comDayCqTaggingImplJcrTagManagerFactoryImplProperties2));
        System.assert(comDayCqTaggingImplJcrTagManagerFactoryImplProperties2.equals(comDayCqTaggingImplJcrTagManagerFactoryImplProperties1));
        System.assert(comDayCqTaggingImplJcrTagManagerFactoryImplProperties3.equals(comDayCqTaggingImplJcrTagManagerFactoryImplProperties4));
        System.assert(comDayCqTaggingImplJcrTagManagerFactoryImplProperties4.equals(comDayCqTaggingImplJcrTagManagerFactoryImplProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqTaggingImplJcrTagManagerF comDayCqTaggingImplJcrTagManagerFactoryImplProperties1 = OASComDayCqTaggingImplJcrTagManagerF.getExample();
        OASComDayCqTaggingImplJcrTagManagerF comDayCqTaggingImplJcrTagManagerFactoryImplProperties2 = new OASComDayCqTaggingImplJcrTagManagerF();

        System.assertEquals(false, comDayCqTaggingImplJcrTagManagerFactoryImplProperties1.equals('foo'));
        System.assertEquals(false, comDayCqTaggingImplJcrTagManagerFactoryImplProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqTaggingImplJcrTagManagerF comDayCqTaggingImplJcrTagManagerFactoryImplProperties1 = OASComDayCqTaggingImplJcrTagManagerF.getExample();
        OASComDayCqTaggingImplJcrTagManagerF comDayCqTaggingImplJcrTagManagerFactoryImplProperties2 = new OASComDayCqTaggingImplJcrTagManagerF();
        OASComDayCqTaggingImplJcrTagManagerF comDayCqTaggingImplJcrTagManagerFactoryImplProperties3;

        System.assertEquals(false, comDayCqTaggingImplJcrTagManagerFactoryImplProperties1.equals(comDayCqTaggingImplJcrTagManagerFactoryImplProperties3));
        System.assertEquals(false, comDayCqTaggingImplJcrTagManagerFactoryImplProperties2.equals(comDayCqTaggingImplJcrTagManagerFactoryImplProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqTaggingImplJcrTagManagerF comDayCqTaggingImplJcrTagManagerFactoryImplProperties1 = OASComDayCqTaggingImplJcrTagManagerF.getExample();
        OASComDayCqTaggingImplJcrTagManagerF comDayCqTaggingImplJcrTagManagerFactoryImplProperties2 = new OASComDayCqTaggingImplJcrTagManagerF();

        System.assertEquals(comDayCqTaggingImplJcrTagManagerFactoryImplProperties1.hashCode(), comDayCqTaggingImplJcrTagManagerFactoryImplProperties1.hashCode());
        System.assertEquals(comDayCqTaggingImplJcrTagManagerFactoryImplProperties2.hashCode(), comDayCqTaggingImplJcrTagManagerFactoryImplProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqTaggingImplJcrTagManagerF comDayCqTaggingImplJcrTagManagerFactoryImplProperties1 = OASComDayCqTaggingImplJcrTagManagerF.getExample();
        OASComDayCqTaggingImplJcrTagManagerF comDayCqTaggingImplJcrTagManagerFactoryImplProperties2 = OASComDayCqTaggingImplJcrTagManagerF.getExample();
        OASComDayCqTaggingImplJcrTagManagerF comDayCqTaggingImplJcrTagManagerFactoryImplProperties3 = new OASComDayCqTaggingImplJcrTagManagerF();
        OASComDayCqTaggingImplJcrTagManagerF comDayCqTaggingImplJcrTagManagerFactoryImplProperties4 = new OASComDayCqTaggingImplJcrTagManagerF();

        System.assert(comDayCqTaggingImplJcrTagManagerFactoryImplProperties1.equals(comDayCqTaggingImplJcrTagManagerFactoryImplProperties2));
        System.assert(comDayCqTaggingImplJcrTagManagerFactoryImplProperties3.equals(comDayCqTaggingImplJcrTagManagerFactoryImplProperties4));
        System.assertEquals(comDayCqTaggingImplJcrTagManagerFactoryImplProperties1.hashCode(), comDayCqTaggingImplJcrTagManagerFactoryImplProperties2.hashCode());
        System.assertEquals(comDayCqTaggingImplJcrTagManagerFactoryImplProperties3.hashCode(), comDayCqTaggingImplJcrTagManagerFactoryImplProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComDayCqTaggingImplJcrTagManagerF comDayCqTaggingImplJcrTagManagerFactoryImplProperties = new OASComDayCqTaggingImplJcrTagManagerF();
        Map<String, String> propertyMappings = comDayCqTaggingImplJcrTagManagerFactoryImplProperties.getPropertyMappings();
        System.assertEquals('validationEnabled', propertyMappings.get('validation.enabled'));
    }
}
