@isTest
private class OASComDayCqDamScene7ImplScene7DamChaTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqDamScene7ImplScene7DamCha comDayCqDamScene7ImplScene7DamChangeEventListenerProperties1 = OASComDayCqDamScene7ImplScene7DamCha.getExample();
        OASComDayCqDamScene7ImplScene7DamCha comDayCqDamScene7ImplScene7DamChangeEventListenerProperties2 = comDayCqDamScene7ImplScene7DamChangeEventListenerProperties1;
        OASComDayCqDamScene7ImplScene7DamCha comDayCqDamScene7ImplScene7DamChangeEventListenerProperties3 = new OASComDayCqDamScene7ImplScene7DamCha();
        OASComDayCqDamScene7ImplScene7DamCha comDayCqDamScene7ImplScene7DamChangeEventListenerProperties4 = comDayCqDamScene7ImplScene7DamChangeEventListenerProperties3;

        System.assert(comDayCqDamScene7ImplScene7DamChangeEventListenerProperties1.equals(comDayCqDamScene7ImplScene7DamChangeEventListenerProperties2));
        System.assert(comDayCqDamScene7ImplScene7DamChangeEventListenerProperties2.equals(comDayCqDamScene7ImplScene7DamChangeEventListenerProperties1));
        System.assert(comDayCqDamScene7ImplScene7DamChangeEventListenerProperties1.equals(comDayCqDamScene7ImplScene7DamChangeEventListenerProperties1));
        System.assert(comDayCqDamScene7ImplScene7DamChangeEventListenerProperties3.equals(comDayCqDamScene7ImplScene7DamChangeEventListenerProperties4));
        System.assert(comDayCqDamScene7ImplScene7DamChangeEventListenerProperties4.equals(comDayCqDamScene7ImplScene7DamChangeEventListenerProperties3));
        System.assert(comDayCqDamScene7ImplScene7DamChangeEventListenerProperties3.equals(comDayCqDamScene7ImplScene7DamChangeEventListenerProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqDamScene7ImplScene7DamCha comDayCqDamScene7ImplScene7DamChangeEventListenerProperties1 = OASComDayCqDamScene7ImplScene7DamCha.getExample();
        OASComDayCqDamScene7ImplScene7DamCha comDayCqDamScene7ImplScene7DamChangeEventListenerProperties2 = OASComDayCqDamScene7ImplScene7DamCha.getExample();
        OASComDayCqDamScene7ImplScene7DamCha comDayCqDamScene7ImplScene7DamChangeEventListenerProperties3 = new OASComDayCqDamScene7ImplScene7DamCha();
        OASComDayCqDamScene7ImplScene7DamCha comDayCqDamScene7ImplScene7DamChangeEventListenerProperties4 = new OASComDayCqDamScene7ImplScene7DamCha();

        System.assert(comDayCqDamScene7ImplScene7DamChangeEventListenerProperties1.equals(comDayCqDamScene7ImplScene7DamChangeEventListenerProperties2));
        System.assert(comDayCqDamScene7ImplScene7DamChangeEventListenerProperties2.equals(comDayCqDamScene7ImplScene7DamChangeEventListenerProperties1));
        System.assert(comDayCqDamScene7ImplScene7DamChangeEventListenerProperties3.equals(comDayCqDamScene7ImplScene7DamChangeEventListenerProperties4));
        System.assert(comDayCqDamScene7ImplScene7DamChangeEventListenerProperties4.equals(comDayCqDamScene7ImplScene7DamChangeEventListenerProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqDamScene7ImplScene7DamCha comDayCqDamScene7ImplScene7DamChangeEventListenerProperties1 = OASComDayCqDamScene7ImplScene7DamCha.getExample();
        OASComDayCqDamScene7ImplScene7DamCha comDayCqDamScene7ImplScene7DamChangeEventListenerProperties2 = new OASComDayCqDamScene7ImplScene7DamCha();

        System.assertEquals(false, comDayCqDamScene7ImplScene7DamChangeEventListenerProperties1.equals('foo'));
        System.assertEquals(false, comDayCqDamScene7ImplScene7DamChangeEventListenerProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqDamScene7ImplScene7DamCha comDayCqDamScene7ImplScene7DamChangeEventListenerProperties1 = OASComDayCqDamScene7ImplScene7DamCha.getExample();
        OASComDayCqDamScene7ImplScene7DamCha comDayCqDamScene7ImplScene7DamChangeEventListenerProperties2 = new OASComDayCqDamScene7ImplScene7DamCha();
        OASComDayCqDamScene7ImplScene7DamCha comDayCqDamScene7ImplScene7DamChangeEventListenerProperties3;

        System.assertEquals(false, comDayCqDamScene7ImplScene7DamChangeEventListenerProperties1.equals(comDayCqDamScene7ImplScene7DamChangeEventListenerProperties3));
        System.assertEquals(false, comDayCqDamScene7ImplScene7DamChangeEventListenerProperties2.equals(comDayCqDamScene7ImplScene7DamChangeEventListenerProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqDamScene7ImplScene7DamCha comDayCqDamScene7ImplScene7DamChangeEventListenerProperties1 = OASComDayCqDamScene7ImplScene7DamCha.getExample();
        OASComDayCqDamScene7ImplScene7DamCha comDayCqDamScene7ImplScene7DamChangeEventListenerProperties2 = new OASComDayCqDamScene7ImplScene7DamCha();

        System.assertEquals(comDayCqDamScene7ImplScene7DamChangeEventListenerProperties1.hashCode(), comDayCqDamScene7ImplScene7DamChangeEventListenerProperties1.hashCode());
        System.assertEquals(comDayCqDamScene7ImplScene7DamChangeEventListenerProperties2.hashCode(), comDayCqDamScene7ImplScene7DamChangeEventListenerProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqDamScene7ImplScene7DamCha comDayCqDamScene7ImplScene7DamChangeEventListenerProperties1 = OASComDayCqDamScene7ImplScene7DamCha.getExample();
        OASComDayCqDamScene7ImplScene7DamCha comDayCqDamScene7ImplScene7DamChangeEventListenerProperties2 = OASComDayCqDamScene7ImplScene7DamCha.getExample();
        OASComDayCqDamScene7ImplScene7DamCha comDayCqDamScene7ImplScene7DamChangeEventListenerProperties3 = new OASComDayCqDamScene7ImplScene7DamCha();
        OASComDayCqDamScene7ImplScene7DamCha comDayCqDamScene7ImplScene7DamChangeEventListenerProperties4 = new OASComDayCqDamScene7ImplScene7DamCha();

        System.assert(comDayCqDamScene7ImplScene7DamChangeEventListenerProperties1.equals(comDayCqDamScene7ImplScene7DamChangeEventListenerProperties2));
        System.assert(comDayCqDamScene7ImplScene7DamChangeEventListenerProperties3.equals(comDayCqDamScene7ImplScene7DamChangeEventListenerProperties4));
        System.assertEquals(comDayCqDamScene7ImplScene7DamChangeEventListenerProperties1.hashCode(), comDayCqDamScene7ImplScene7DamChangeEventListenerProperties2.hashCode());
        System.assertEquals(comDayCqDamScene7ImplScene7DamChangeEventListenerProperties3.hashCode(), comDayCqDamScene7ImplScene7DamChangeEventListenerProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComDayCqDamScene7ImplScene7DamCha comDayCqDamScene7ImplScene7DamChangeEventListenerProperties = new OASComDayCqDamScene7ImplScene7DamCha();
        Map<String, String> propertyMappings = comDayCqDamScene7ImplScene7DamChangeEventListenerProperties.getPropertyMappings();
        System.assertEquals('cqDamScene7DamchangeeventlistenerEnabled', propertyMappings.get('cq.dam.scene7.damchangeeventlistener.enabled'));
        System.assertEquals('cqDamScene7DamchangeeventlistenerObservedPaths', propertyMappings.get('cq.dam.scene7.damchangeeventlistener.observed.paths'));
    }
}
