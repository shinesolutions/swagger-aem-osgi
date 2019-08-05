@isTest
private class OASComDayCqDamS7damCommonS7damDamChaTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqDamS7damCommonS7damDamCha comDayCqDamS7damCommonS7damDamChangeEventListenerProperties1 = OASComDayCqDamS7damCommonS7damDamCha.getExample();
        OASComDayCqDamS7damCommonS7damDamCha comDayCqDamS7damCommonS7damDamChangeEventListenerProperties2 = comDayCqDamS7damCommonS7damDamChangeEventListenerProperties1;
        OASComDayCqDamS7damCommonS7damDamCha comDayCqDamS7damCommonS7damDamChangeEventListenerProperties3 = new OASComDayCqDamS7damCommonS7damDamCha();
        OASComDayCqDamS7damCommonS7damDamCha comDayCqDamS7damCommonS7damDamChangeEventListenerProperties4 = comDayCqDamS7damCommonS7damDamChangeEventListenerProperties3;

        System.assert(comDayCqDamS7damCommonS7damDamChangeEventListenerProperties1.equals(comDayCqDamS7damCommonS7damDamChangeEventListenerProperties2));
        System.assert(comDayCqDamS7damCommonS7damDamChangeEventListenerProperties2.equals(comDayCqDamS7damCommonS7damDamChangeEventListenerProperties1));
        System.assert(comDayCqDamS7damCommonS7damDamChangeEventListenerProperties1.equals(comDayCqDamS7damCommonS7damDamChangeEventListenerProperties1));
        System.assert(comDayCqDamS7damCommonS7damDamChangeEventListenerProperties3.equals(comDayCqDamS7damCommonS7damDamChangeEventListenerProperties4));
        System.assert(comDayCqDamS7damCommonS7damDamChangeEventListenerProperties4.equals(comDayCqDamS7damCommonS7damDamChangeEventListenerProperties3));
        System.assert(comDayCqDamS7damCommonS7damDamChangeEventListenerProperties3.equals(comDayCqDamS7damCommonS7damDamChangeEventListenerProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqDamS7damCommonS7damDamCha comDayCqDamS7damCommonS7damDamChangeEventListenerProperties1 = OASComDayCqDamS7damCommonS7damDamCha.getExample();
        OASComDayCqDamS7damCommonS7damDamCha comDayCqDamS7damCommonS7damDamChangeEventListenerProperties2 = OASComDayCqDamS7damCommonS7damDamCha.getExample();
        OASComDayCqDamS7damCommonS7damDamCha comDayCqDamS7damCommonS7damDamChangeEventListenerProperties3 = new OASComDayCqDamS7damCommonS7damDamCha();
        OASComDayCqDamS7damCommonS7damDamCha comDayCqDamS7damCommonS7damDamChangeEventListenerProperties4 = new OASComDayCqDamS7damCommonS7damDamCha();

        System.assert(comDayCqDamS7damCommonS7damDamChangeEventListenerProperties1.equals(comDayCqDamS7damCommonS7damDamChangeEventListenerProperties2));
        System.assert(comDayCqDamS7damCommonS7damDamChangeEventListenerProperties2.equals(comDayCqDamS7damCommonS7damDamChangeEventListenerProperties1));
        System.assert(comDayCqDamS7damCommonS7damDamChangeEventListenerProperties3.equals(comDayCqDamS7damCommonS7damDamChangeEventListenerProperties4));
        System.assert(comDayCqDamS7damCommonS7damDamChangeEventListenerProperties4.equals(comDayCqDamS7damCommonS7damDamChangeEventListenerProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqDamS7damCommonS7damDamCha comDayCqDamS7damCommonS7damDamChangeEventListenerProperties1 = OASComDayCqDamS7damCommonS7damDamCha.getExample();
        OASComDayCqDamS7damCommonS7damDamCha comDayCqDamS7damCommonS7damDamChangeEventListenerProperties2 = new OASComDayCqDamS7damCommonS7damDamCha();

        System.assertEquals(false, comDayCqDamS7damCommonS7damDamChangeEventListenerProperties1.equals('foo'));
        System.assertEquals(false, comDayCqDamS7damCommonS7damDamChangeEventListenerProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqDamS7damCommonS7damDamCha comDayCqDamS7damCommonS7damDamChangeEventListenerProperties1 = OASComDayCqDamS7damCommonS7damDamCha.getExample();
        OASComDayCqDamS7damCommonS7damDamCha comDayCqDamS7damCommonS7damDamChangeEventListenerProperties2 = new OASComDayCqDamS7damCommonS7damDamCha();
        OASComDayCqDamS7damCommonS7damDamCha comDayCqDamS7damCommonS7damDamChangeEventListenerProperties3;

        System.assertEquals(false, comDayCqDamS7damCommonS7damDamChangeEventListenerProperties1.equals(comDayCqDamS7damCommonS7damDamChangeEventListenerProperties3));
        System.assertEquals(false, comDayCqDamS7damCommonS7damDamChangeEventListenerProperties2.equals(comDayCqDamS7damCommonS7damDamChangeEventListenerProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqDamS7damCommonS7damDamCha comDayCqDamS7damCommonS7damDamChangeEventListenerProperties1 = OASComDayCqDamS7damCommonS7damDamCha.getExample();
        OASComDayCqDamS7damCommonS7damDamCha comDayCqDamS7damCommonS7damDamChangeEventListenerProperties2 = new OASComDayCqDamS7damCommonS7damDamCha();

        System.assertEquals(comDayCqDamS7damCommonS7damDamChangeEventListenerProperties1.hashCode(), comDayCqDamS7damCommonS7damDamChangeEventListenerProperties1.hashCode());
        System.assertEquals(comDayCqDamS7damCommonS7damDamChangeEventListenerProperties2.hashCode(), comDayCqDamS7damCommonS7damDamChangeEventListenerProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqDamS7damCommonS7damDamCha comDayCqDamS7damCommonS7damDamChangeEventListenerProperties1 = OASComDayCqDamS7damCommonS7damDamCha.getExample();
        OASComDayCqDamS7damCommonS7damDamCha comDayCqDamS7damCommonS7damDamChangeEventListenerProperties2 = OASComDayCqDamS7damCommonS7damDamCha.getExample();
        OASComDayCqDamS7damCommonS7damDamCha comDayCqDamS7damCommonS7damDamChangeEventListenerProperties3 = new OASComDayCqDamS7damCommonS7damDamCha();
        OASComDayCqDamS7damCommonS7damDamCha comDayCqDamS7damCommonS7damDamChangeEventListenerProperties4 = new OASComDayCqDamS7damCommonS7damDamCha();

        System.assert(comDayCqDamS7damCommonS7damDamChangeEventListenerProperties1.equals(comDayCqDamS7damCommonS7damDamChangeEventListenerProperties2));
        System.assert(comDayCqDamS7damCommonS7damDamChangeEventListenerProperties3.equals(comDayCqDamS7damCommonS7damDamChangeEventListenerProperties4));
        System.assertEquals(comDayCqDamS7damCommonS7damDamChangeEventListenerProperties1.hashCode(), comDayCqDamS7damCommonS7damDamChangeEventListenerProperties2.hashCode());
        System.assertEquals(comDayCqDamS7damCommonS7damDamChangeEventListenerProperties3.hashCode(), comDayCqDamS7damCommonS7damDamChangeEventListenerProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComDayCqDamS7damCommonS7damDamCha comDayCqDamS7damCommonS7damDamChangeEventListenerProperties = new OASComDayCqDamS7damCommonS7damDamCha();
        Map<String, String> propertyMappings = comDayCqDamS7damCommonS7damDamChangeEventListenerProperties.getPropertyMappings();
        System.assertEquals('cqDamS7damDamchangeeventlistenerEnabled', propertyMappings.get('cq.dam.s7dam.damchangeeventlistener.enabled'));
    }
}
