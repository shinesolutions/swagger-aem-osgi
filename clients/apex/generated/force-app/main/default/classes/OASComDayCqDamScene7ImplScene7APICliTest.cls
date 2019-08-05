@isTest
private class OASComDayCqDamScene7ImplScene7APICliTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqDamScene7ImplScene7APICli comDayCqDamScene7ImplScene7APIClientImplProperties1 = OASComDayCqDamScene7ImplScene7APICli.getExample();
        OASComDayCqDamScene7ImplScene7APICli comDayCqDamScene7ImplScene7APIClientImplProperties2 = comDayCqDamScene7ImplScene7APIClientImplProperties1;
        OASComDayCqDamScene7ImplScene7APICli comDayCqDamScene7ImplScene7APIClientImplProperties3 = new OASComDayCqDamScene7ImplScene7APICli();
        OASComDayCqDamScene7ImplScene7APICli comDayCqDamScene7ImplScene7APIClientImplProperties4 = comDayCqDamScene7ImplScene7APIClientImplProperties3;

        System.assert(comDayCqDamScene7ImplScene7APIClientImplProperties1.equals(comDayCqDamScene7ImplScene7APIClientImplProperties2));
        System.assert(comDayCqDamScene7ImplScene7APIClientImplProperties2.equals(comDayCqDamScene7ImplScene7APIClientImplProperties1));
        System.assert(comDayCqDamScene7ImplScene7APIClientImplProperties1.equals(comDayCqDamScene7ImplScene7APIClientImplProperties1));
        System.assert(comDayCqDamScene7ImplScene7APIClientImplProperties3.equals(comDayCqDamScene7ImplScene7APIClientImplProperties4));
        System.assert(comDayCqDamScene7ImplScene7APIClientImplProperties4.equals(comDayCqDamScene7ImplScene7APIClientImplProperties3));
        System.assert(comDayCqDamScene7ImplScene7APIClientImplProperties3.equals(comDayCqDamScene7ImplScene7APIClientImplProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqDamScene7ImplScene7APICli comDayCqDamScene7ImplScene7APIClientImplProperties1 = OASComDayCqDamScene7ImplScene7APICli.getExample();
        OASComDayCqDamScene7ImplScene7APICli comDayCqDamScene7ImplScene7APIClientImplProperties2 = OASComDayCqDamScene7ImplScene7APICli.getExample();
        OASComDayCqDamScene7ImplScene7APICli comDayCqDamScene7ImplScene7APIClientImplProperties3 = new OASComDayCqDamScene7ImplScene7APICli();
        OASComDayCqDamScene7ImplScene7APICli comDayCqDamScene7ImplScene7APIClientImplProperties4 = new OASComDayCqDamScene7ImplScene7APICli();

        System.assert(comDayCqDamScene7ImplScene7APIClientImplProperties1.equals(comDayCqDamScene7ImplScene7APIClientImplProperties2));
        System.assert(comDayCqDamScene7ImplScene7APIClientImplProperties2.equals(comDayCqDamScene7ImplScene7APIClientImplProperties1));
        System.assert(comDayCqDamScene7ImplScene7APIClientImplProperties3.equals(comDayCqDamScene7ImplScene7APIClientImplProperties4));
        System.assert(comDayCqDamScene7ImplScene7APIClientImplProperties4.equals(comDayCqDamScene7ImplScene7APIClientImplProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqDamScene7ImplScene7APICli comDayCqDamScene7ImplScene7APIClientImplProperties1 = OASComDayCqDamScene7ImplScene7APICli.getExample();
        OASComDayCqDamScene7ImplScene7APICli comDayCqDamScene7ImplScene7APIClientImplProperties2 = new OASComDayCqDamScene7ImplScene7APICli();

        System.assertEquals(false, comDayCqDamScene7ImplScene7APIClientImplProperties1.equals('foo'));
        System.assertEquals(false, comDayCqDamScene7ImplScene7APIClientImplProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqDamScene7ImplScene7APICli comDayCqDamScene7ImplScene7APIClientImplProperties1 = OASComDayCqDamScene7ImplScene7APICli.getExample();
        OASComDayCqDamScene7ImplScene7APICli comDayCqDamScene7ImplScene7APIClientImplProperties2 = new OASComDayCqDamScene7ImplScene7APICli();
        OASComDayCqDamScene7ImplScene7APICli comDayCqDamScene7ImplScene7APIClientImplProperties3;

        System.assertEquals(false, comDayCqDamScene7ImplScene7APIClientImplProperties1.equals(comDayCqDamScene7ImplScene7APIClientImplProperties3));
        System.assertEquals(false, comDayCqDamScene7ImplScene7APIClientImplProperties2.equals(comDayCqDamScene7ImplScene7APIClientImplProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqDamScene7ImplScene7APICli comDayCqDamScene7ImplScene7APIClientImplProperties1 = OASComDayCqDamScene7ImplScene7APICli.getExample();
        OASComDayCqDamScene7ImplScene7APICli comDayCqDamScene7ImplScene7APIClientImplProperties2 = new OASComDayCqDamScene7ImplScene7APICli();

        System.assertEquals(comDayCqDamScene7ImplScene7APIClientImplProperties1.hashCode(), comDayCqDamScene7ImplScene7APIClientImplProperties1.hashCode());
        System.assertEquals(comDayCqDamScene7ImplScene7APIClientImplProperties2.hashCode(), comDayCqDamScene7ImplScene7APIClientImplProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqDamScene7ImplScene7APICli comDayCqDamScene7ImplScene7APIClientImplProperties1 = OASComDayCqDamScene7ImplScene7APICli.getExample();
        OASComDayCqDamScene7ImplScene7APICli comDayCqDamScene7ImplScene7APIClientImplProperties2 = OASComDayCqDamScene7ImplScene7APICli.getExample();
        OASComDayCqDamScene7ImplScene7APICli comDayCqDamScene7ImplScene7APIClientImplProperties3 = new OASComDayCqDamScene7ImplScene7APICli();
        OASComDayCqDamScene7ImplScene7APICli comDayCqDamScene7ImplScene7APIClientImplProperties4 = new OASComDayCqDamScene7ImplScene7APICli();

        System.assert(comDayCqDamScene7ImplScene7APIClientImplProperties1.equals(comDayCqDamScene7ImplScene7APIClientImplProperties2));
        System.assert(comDayCqDamScene7ImplScene7APIClientImplProperties3.equals(comDayCqDamScene7ImplScene7APIClientImplProperties4));
        System.assertEquals(comDayCqDamScene7ImplScene7APIClientImplProperties1.hashCode(), comDayCqDamScene7ImplScene7APIClientImplProperties2.hashCode());
        System.assertEquals(comDayCqDamScene7ImplScene7APIClientImplProperties3.hashCode(), comDayCqDamScene7ImplScene7APIClientImplProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComDayCqDamScene7ImplScene7APICli comDayCqDamScene7ImplScene7APIClientImplProperties = new OASComDayCqDamScene7ImplScene7APICli();
        Map<String, String> propertyMappings = comDayCqDamScene7ImplScene7APIClientImplProperties.getPropertyMappings();
        System.assertEquals('cqDamScene7ApiclientRecordsperpageNofilterName', propertyMappings.get('cq.dam.scene7.apiclient.recordsperpage.nofilter.name'));
        System.assertEquals('cqDamScene7ApiclientRecordsperpageWithfilterName', propertyMappings.get('cq.dam.scene7.apiclient.recordsperpage.withfilter.name'));
    }
}
