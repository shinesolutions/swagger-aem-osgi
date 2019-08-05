@isTest
private class OASComDayCqDamScene7ImplScene7ConfigTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqDamScene7ImplScene7Config comDayCqDamScene7ImplScene7ConfigurationEventListenerProperties1 = OASComDayCqDamScene7ImplScene7Config.getExample();
        OASComDayCqDamScene7ImplScene7Config comDayCqDamScene7ImplScene7ConfigurationEventListenerProperties2 = comDayCqDamScene7ImplScene7ConfigurationEventListenerProperties1;
        OASComDayCqDamScene7ImplScene7Config comDayCqDamScene7ImplScene7ConfigurationEventListenerProperties3 = new OASComDayCqDamScene7ImplScene7Config();
        OASComDayCqDamScene7ImplScene7Config comDayCqDamScene7ImplScene7ConfigurationEventListenerProperties4 = comDayCqDamScene7ImplScene7ConfigurationEventListenerProperties3;

        System.assert(comDayCqDamScene7ImplScene7ConfigurationEventListenerProperties1.equals(comDayCqDamScene7ImplScene7ConfigurationEventListenerProperties2));
        System.assert(comDayCqDamScene7ImplScene7ConfigurationEventListenerProperties2.equals(comDayCqDamScene7ImplScene7ConfigurationEventListenerProperties1));
        System.assert(comDayCqDamScene7ImplScene7ConfigurationEventListenerProperties1.equals(comDayCqDamScene7ImplScene7ConfigurationEventListenerProperties1));
        System.assert(comDayCqDamScene7ImplScene7ConfigurationEventListenerProperties3.equals(comDayCqDamScene7ImplScene7ConfigurationEventListenerProperties4));
        System.assert(comDayCqDamScene7ImplScene7ConfigurationEventListenerProperties4.equals(comDayCqDamScene7ImplScene7ConfigurationEventListenerProperties3));
        System.assert(comDayCqDamScene7ImplScene7ConfigurationEventListenerProperties3.equals(comDayCqDamScene7ImplScene7ConfigurationEventListenerProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqDamScene7ImplScene7Config comDayCqDamScene7ImplScene7ConfigurationEventListenerProperties1 = OASComDayCqDamScene7ImplScene7Config.getExample();
        OASComDayCqDamScene7ImplScene7Config comDayCqDamScene7ImplScene7ConfigurationEventListenerProperties2 = OASComDayCqDamScene7ImplScene7Config.getExample();
        OASComDayCqDamScene7ImplScene7Config comDayCqDamScene7ImplScene7ConfigurationEventListenerProperties3 = new OASComDayCqDamScene7ImplScene7Config();
        OASComDayCqDamScene7ImplScene7Config comDayCqDamScene7ImplScene7ConfigurationEventListenerProperties4 = new OASComDayCqDamScene7ImplScene7Config();

        System.assert(comDayCqDamScene7ImplScene7ConfigurationEventListenerProperties1.equals(comDayCqDamScene7ImplScene7ConfigurationEventListenerProperties2));
        System.assert(comDayCqDamScene7ImplScene7ConfigurationEventListenerProperties2.equals(comDayCqDamScene7ImplScene7ConfigurationEventListenerProperties1));
        System.assert(comDayCqDamScene7ImplScene7ConfigurationEventListenerProperties3.equals(comDayCqDamScene7ImplScene7ConfigurationEventListenerProperties4));
        System.assert(comDayCqDamScene7ImplScene7ConfigurationEventListenerProperties4.equals(comDayCqDamScene7ImplScene7ConfigurationEventListenerProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqDamScene7ImplScene7Config comDayCqDamScene7ImplScene7ConfigurationEventListenerProperties1 = OASComDayCqDamScene7ImplScene7Config.getExample();
        OASComDayCqDamScene7ImplScene7Config comDayCqDamScene7ImplScene7ConfigurationEventListenerProperties2 = new OASComDayCqDamScene7ImplScene7Config();

        System.assertEquals(false, comDayCqDamScene7ImplScene7ConfigurationEventListenerProperties1.equals('foo'));
        System.assertEquals(false, comDayCqDamScene7ImplScene7ConfigurationEventListenerProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqDamScene7ImplScene7Config comDayCqDamScene7ImplScene7ConfigurationEventListenerProperties1 = OASComDayCqDamScene7ImplScene7Config.getExample();
        OASComDayCqDamScene7ImplScene7Config comDayCqDamScene7ImplScene7ConfigurationEventListenerProperties2 = new OASComDayCqDamScene7ImplScene7Config();
        OASComDayCqDamScene7ImplScene7Config comDayCqDamScene7ImplScene7ConfigurationEventListenerProperties3;

        System.assertEquals(false, comDayCqDamScene7ImplScene7ConfigurationEventListenerProperties1.equals(comDayCqDamScene7ImplScene7ConfigurationEventListenerProperties3));
        System.assertEquals(false, comDayCqDamScene7ImplScene7ConfigurationEventListenerProperties2.equals(comDayCqDamScene7ImplScene7ConfigurationEventListenerProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqDamScene7ImplScene7Config comDayCqDamScene7ImplScene7ConfigurationEventListenerProperties1 = OASComDayCqDamScene7ImplScene7Config.getExample();
        OASComDayCqDamScene7ImplScene7Config comDayCqDamScene7ImplScene7ConfigurationEventListenerProperties2 = new OASComDayCqDamScene7ImplScene7Config();

        System.assertEquals(comDayCqDamScene7ImplScene7ConfigurationEventListenerProperties1.hashCode(), comDayCqDamScene7ImplScene7ConfigurationEventListenerProperties1.hashCode());
        System.assertEquals(comDayCqDamScene7ImplScene7ConfigurationEventListenerProperties2.hashCode(), comDayCqDamScene7ImplScene7ConfigurationEventListenerProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqDamScene7ImplScene7Config comDayCqDamScene7ImplScene7ConfigurationEventListenerProperties1 = OASComDayCqDamScene7ImplScene7Config.getExample();
        OASComDayCqDamScene7ImplScene7Config comDayCqDamScene7ImplScene7ConfigurationEventListenerProperties2 = OASComDayCqDamScene7ImplScene7Config.getExample();
        OASComDayCqDamScene7ImplScene7Config comDayCqDamScene7ImplScene7ConfigurationEventListenerProperties3 = new OASComDayCqDamScene7ImplScene7Config();
        OASComDayCqDamScene7ImplScene7Config comDayCqDamScene7ImplScene7ConfigurationEventListenerProperties4 = new OASComDayCqDamScene7ImplScene7Config();

        System.assert(comDayCqDamScene7ImplScene7ConfigurationEventListenerProperties1.equals(comDayCqDamScene7ImplScene7ConfigurationEventListenerProperties2));
        System.assert(comDayCqDamScene7ImplScene7ConfigurationEventListenerProperties3.equals(comDayCqDamScene7ImplScene7ConfigurationEventListenerProperties4));
        System.assertEquals(comDayCqDamScene7ImplScene7ConfigurationEventListenerProperties1.hashCode(), comDayCqDamScene7ImplScene7ConfigurationEventListenerProperties2.hashCode());
        System.assertEquals(comDayCqDamScene7ImplScene7ConfigurationEventListenerProperties3.hashCode(), comDayCqDamScene7ImplScene7ConfigurationEventListenerProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComDayCqDamScene7ImplScene7Config comDayCqDamScene7ImplScene7ConfigurationEventListenerProperties = new OASComDayCqDamScene7ImplScene7Config();
        Map<String, String> propertyMappings = comDayCqDamScene7ImplScene7ConfigurationEventListenerProperties.getPropertyMappings();
        System.assertEquals('cqDamScene7ConfigurationeventlistenerEnabled', propertyMappings.get('cq.dam.scene7.configurationeventlistener.enabled'));
    }
}
