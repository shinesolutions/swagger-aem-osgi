@isTest
private class OASComDayCqPersonalizationImplServleTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqPersonalizationImplServle comDayCqPersonalizationImplServletsTargetingConfigurationServletProperties1 = OASComDayCqPersonalizationImplServle.getExample();
        OASComDayCqPersonalizationImplServle comDayCqPersonalizationImplServletsTargetingConfigurationServletProperties2 = comDayCqPersonalizationImplServletsTargetingConfigurationServletProperties1;
        OASComDayCqPersonalizationImplServle comDayCqPersonalizationImplServletsTargetingConfigurationServletProperties3 = new OASComDayCqPersonalizationImplServle();
        OASComDayCqPersonalizationImplServle comDayCqPersonalizationImplServletsTargetingConfigurationServletProperties4 = comDayCqPersonalizationImplServletsTargetingConfigurationServletProperties3;

        System.assert(comDayCqPersonalizationImplServletsTargetingConfigurationServletProperties1.equals(comDayCqPersonalizationImplServletsTargetingConfigurationServletProperties2));
        System.assert(comDayCqPersonalizationImplServletsTargetingConfigurationServletProperties2.equals(comDayCqPersonalizationImplServletsTargetingConfigurationServletProperties1));
        System.assert(comDayCqPersonalizationImplServletsTargetingConfigurationServletProperties1.equals(comDayCqPersonalizationImplServletsTargetingConfigurationServletProperties1));
        System.assert(comDayCqPersonalizationImplServletsTargetingConfigurationServletProperties3.equals(comDayCqPersonalizationImplServletsTargetingConfigurationServletProperties4));
        System.assert(comDayCqPersonalizationImplServletsTargetingConfigurationServletProperties4.equals(comDayCqPersonalizationImplServletsTargetingConfigurationServletProperties3));
        System.assert(comDayCqPersonalizationImplServletsTargetingConfigurationServletProperties3.equals(comDayCqPersonalizationImplServletsTargetingConfigurationServletProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqPersonalizationImplServle comDayCqPersonalizationImplServletsTargetingConfigurationServletProperties1 = OASComDayCqPersonalizationImplServle.getExample();
        OASComDayCqPersonalizationImplServle comDayCqPersonalizationImplServletsTargetingConfigurationServletProperties2 = OASComDayCqPersonalizationImplServle.getExample();
        OASComDayCqPersonalizationImplServle comDayCqPersonalizationImplServletsTargetingConfigurationServletProperties3 = new OASComDayCqPersonalizationImplServle();
        OASComDayCqPersonalizationImplServle comDayCqPersonalizationImplServletsTargetingConfigurationServletProperties4 = new OASComDayCqPersonalizationImplServle();

        System.assert(comDayCqPersonalizationImplServletsTargetingConfigurationServletProperties1.equals(comDayCqPersonalizationImplServletsTargetingConfigurationServletProperties2));
        System.assert(comDayCqPersonalizationImplServletsTargetingConfigurationServletProperties2.equals(comDayCqPersonalizationImplServletsTargetingConfigurationServletProperties1));
        System.assert(comDayCqPersonalizationImplServletsTargetingConfigurationServletProperties3.equals(comDayCqPersonalizationImplServletsTargetingConfigurationServletProperties4));
        System.assert(comDayCqPersonalizationImplServletsTargetingConfigurationServletProperties4.equals(comDayCqPersonalizationImplServletsTargetingConfigurationServletProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqPersonalizationImplServle comDayCqPersonalizationImplServletsTargetingConfigurationServletProperties1 = OASComDayCqPersonalizationImplServle.getExample();
        OASComDayCqPersonalizationImplServle comDayCqPersonalizationImplServletsTargetingConfigurationServletProperties2 = new OASComDayCqPersonalizationImplServle();

        System.assertEquals(false, comDayCqPersonalizationImplServletsTargetingConfigurationServletProperties1.equals('foo'));
        System.assertEquals(false, comDayCqPersonalizationImplServletsTargetingConfigurationServletProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqPersonalizationImplServle comDayCqPersonalizationImplServletsTargetingConfigurationServletProperties1 = OASComDayCqPersonalizationImplServle.getExample();
        OASComDayCqPersonalizationImplServle comDayCqPersonalizationImplServletsTargetingConfigurationServletProperties2 = new OASComDayCqPersonalizationImplServle();
        OASComDayCqPersonalizationImplServle comDayCqPersonalizationImplServletsTargetingConfigurationServletProperties3;

        System.assertEquals(false, comDayCqPersonalizationImplServletsTargetingConfigurationServletProperties1.equals(comDayCqPersonalizationImplServletsTargetingConfigurationServletProperties3));
        System.assertEquals(false, comDayCqPersonalizationImplServletsTargetingConfigurationServletProperties2.equals(comDayCqPersonalizationImplServletsTargetingConfigurationServletProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqPersonalizationImplServle comDayCqPersonalizationImplServletsTargetingConfigurationServletProperties1 = OASComDayCqPersonalizationImplServle.getExample();
        OASComDayCqPersonalizationImplServle comDayCqPersonalizationImplServletsTargetingConfigurationServletProperties2 = new OASComDayCqPersonalizationImplServle();

        System.assertEquals(comDayCqPersonalizationImplServletsTargetingConfigurationServletProperties1.hashCode(), comDayCqPersonalizationImplServletsTargetingConfigurationServletProperties1.hashCode());
        System.assertEquals(comDayCqPersonalizationImplServletsTargetingConfigurationServletProperties2.hashCode(), comDayCqPersonalizationImplServletsTargetingConfigurationServletProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqPersonalizationImplServle comDayCqPersonalizationImplServletsTargetingConfigurationServletProperties1 = OASComDayCqPersonalizationImplServle.getExample();
        OASComDayCqPersonalizationImplServle comDayCqPersonalizationImplServletsTargetingConfigurationServletProperties2 = OASComDayCqPersonalizationImplServle.getExample();
        OASComDayCqPersonalizationImplServle comDayCqPersonalizationImplServletsTargetingConfigurationServletProperties3 = new OASComDayCqPersonalizationImplServle();
        OASComDayCqPersonalizationImplServle comDayCqPersonalizationImplServletsTargetingConfigurationServletProperties4 = new OASComDayCqPersonalizationImplServle();

        System.assert(comDayCqPersonalizationImplServletsTargetingConfigurationServletProperties1.equals(comDayCqPersonalizationImplServletsTargetingConfigurationServletProperties2));
        System.assert(comDayCqPersonalizationImplServletsTargetingConfigurationServletProperties3.equals(comDayCqPersonalizationImplServletsTargetingConfigurationServletProperties4));
        System.assertEquals(comDayCqPersonalizationImplServletsTargetingConfigurationServletProperties1.hashCode(), comDayCqPersonalizationImplServletsTargetingConfigurationServletProperties2.hashCode());
        System.assertEquals(comDayCqPersonalizationImplServletsTargetingConfigurationServletProperties3.hashCode(), comDayCqPersonalizationImplServletsTargetingConfigurationServletProperties4.hashCode());
    }
}
