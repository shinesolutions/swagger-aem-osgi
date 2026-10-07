@isTest
private class OASComDayCqDamIdsImplIDSPoolManagerITest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqDamIdsImplIDSPoolManagerI comDayCqDamIdsImplIDSPoolManagerImplProperties1 = OASComDayCqDamIdsImplIDSPoolManagerI.getExample();
        OASComDayCqDamIdsImplIDSPoolManagerI comDayCqDamIdsImplIDSPoolManagerImplProperties2 = comDayCqDamIdsImplIDSPoolManagerImplProperties1;
        OASComDayCqDamIdsImplIDSPoolManagerI comDayCqDamIdsImplIDSPoolManagerImplProperties3 = new OASComDayCqDamIdsImplIDSPoolManagerI();
        OASComDayCqDamIdsImplIDSPoolManagerI comDayCqDamIdsImplIDSPoolManagerImplProperties4 = comDayCqDamIdsImplIDSPoolManagerImplProperties3;

        System.assert(comDayCqDamIdsImplIDSPoolManagerImplProperties1.equals(comDayCqDamIdsImplIDSPoolManagerImplProperties2));
        System.assert(comDayCqDamIdsImplIDSPoolManagerImplProperties2.equals(comDayCqDamIdsImplIDSPoolManagerImplProperties1));
        System.assert(comDayCqDamIdsImplIDSPoolManagerImplProperties1.equals(comDayCqDamIdsImplIDSPoolManagerImplProperties1));
        System.assert(comDayCqDamIdsImplIDSPoolManagerImplProperties3.equals(comDayCqDamIdsImplIDSPoolManagerImplProperties4));
        System.assert(comDayCqDamIdsImplIDSPoolManagerImplProperties4.equals(comDayCqDamIdsImplIDSPoolManagerImplProperties3));
        System.assert(comDayCqDamIdsImplIDSPoolManagerImplProperties3.equals(comDayCqDamIdsImplIDSPoolManagerImplProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqDamIdsImplIDSPoolManagerI comDayCqDamIdsImplIDSPoolManagerImplProperties1 = OASComDayCqDamIdsImplIDSPoolManagerI.getExample();
        OASComDayCqDamIdsImplIDSPoolManagerI comDayCqDamIdsImplIDSPoolManagerImplProperties2 = OASComDayCqDamIdsImplIDSPoolManagerI.getExample();
        OASComDayCqDamIdsImplIDSPoolManagerI comDayCqDamIdsImplIDSPoolManagerImplProperties3 = new OASComDayCqDamIdsImplIDSPoolManagerI();
        OASComDayCqDamIdsImplIDSPoolManagerI comDayCqDamIdsImplIDSPoolManagerImplProperties4 = new OASComDayCqDamIdsImplIDSPoolManagerI();

        System.assert(comDayCqDamIdsImplIDSPoolManagerImplProperties1.equals(comDayCqDamIdsImplIDSPoolManagerImplProperties2));
        System.assert(comDayCqDamIdsImplIDSPoolManagerImplProperties2.equals(comDayCqDamIdsImplIDSPoolManagerImplProperties1));
        System.assert(comDayCqDamIdsImplIDSPoolManagerImplProperties3.equals(comDayCqDamIdsImplIDSPoolManagerImplProperties4));
        System.assert(comDayCqDamIdsImplIDSPoolManagerImplProperties4.equals(comDayCqDamIdsImplIDSPoolManagerImplProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqDamIdsImplIDSPoolManagerI comDayCqDamIdsImplIDSPoolManagerImplProperties1 = OASComDayCqDamIdsImplIDSPoolManagerI.getExample();
        OASComDayCqDamIdsImplIDSPoolManagerI comDayCqDamIdsImplIDSPoolManagerImplProperties2 = new OASComDayCqDamIdsImplIDSPoolManagerI();

        System.assertEquals(false, comDayCqDamIdsImplIDSPoolManagerImplProperties1.equals('foo'));
        System.assertEquals(false, comDayCqDamIdsImplIDSPoolManagerImplProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqDamIdsImplIDSPoolManagerI comDayCqDamIdsImplIDSPoolManagerImplProperties1 = OASComDayCqDamIdsImplIDSPoolManagerI.getExample();
        OASComDayCqDamIdsImplIDSPoolManagerI comDayCqDamIdsImplIDSPoolManagerImplProperties2 = new OASComDayCqDamIdsImplIDSPoolManagerI();
        OASComDayCqDamIdsImplIDSPoolManagerI comDayCqDamIdsImplIDSPoolManagerImplProperties3;

        System.assertEquals(false, comDayCqDamIdsImplIDSPoolManagerImplProperties1.equals(comDayCqDamIdsImplIDSPoolManagerImplProperties3));
        System.assertEquals(false, comDayCqDamIdsImplIDSPoolManagerImplProperties2.equals(comDayCqDamIdsImplIDSPoolManagerImplProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqDamIdsImplIDSPoolManagerI comDayCqDamIdsImplIDSPoolManagerImplProperties1 = OASComDayCqDamIdsImplIDSPoolManagerI.getExample();
        OASComDayCqDamIdsImplIDSPoolManagerI comDayCqDamIdsImplIDSPoolManagerImplProperties2 = new OASComDayCqDamIdsImplIDSPoolManagerI();

        System.assertEquals(comDayCqDamIdsImplIDSPoolManagerImplProperties1.hashCode(), comDayCqDamIdsImplIDSPoolManagerImplProperties1.hashCode());
        System.assertEquals(comDayCqDamIdsImplIDSPoolManagerImplProperties2.hashCode(), comDayCqDamIdsImplIDSPoolManagerImplProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqDamIdsImplIDSPoolManagerI comDayCqDamIdsImplIDSPoolManagerImplProperties1 = OASComDayCqDamIdsImplIDSPoolManagerI.getExample();
        OASComDayCqDamIdsImplIDSPoolManagerI comDayCqDamIdsImplIDSPoolManagerImplProperties2 = OASComDayCqDamIdsImplIDSPoolManagerI.getExample();
        OASComDayCqDamIdsImplIDSPoolManagerI comDayCqDamIdsImplIDSPoolManagerImplProperties3 = new OASComDayCqDamIdsImplIDSPoolManagerI();
        OASComDayCqDamIdsImplIDSPoolManagerI comDayCqDamIdsImplIDSPoolManagerImplProperties4 = new OASComDayCqDamIdsImplIDSPoolManagerI();

        System.assert(comDayCqDamIdsImplIDSPoolManagerImplProperties1.equals(comDayCqDamIdsImplIDSPoolManagerImplProperties2));
        System.assert(comDayCqDamIdsImplIDSPoolManagerImplProperties3.equals(comDayCqDamIdsImplIDSPoolManagerImplProperties4));
        System.assertEquals(comDayCqDamIdsImplIDSPoolManagerImplProperties1.hashCode(), comDayCqDamIdsImplIDSPoolManagerImplProperties2.hashCode());
        System.assertEquals(comDayCqDamIdsImplIDSPoolManagerImplProperties3.hashCode(), comDayCqDamIdsImplIDSPoolManagerImplProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComDayCqDamIdsImplIDSPoolManagerI comDayCqDamIdsImplIDSPoolManagerImplProperties = new OASComDayCqDamIdsImplIDSPoolManagerI();
        Map<String, String> x-property-mappings = comDayCqDamIdsImplIDSPoolManagerImplProperties.getx-property-mappings();
        System.assertEquals('maxErrorsToBlacklist', x-property-mappings.get('max.errors.to.blacklist'));
        System.assertEquals('retryIntervalToWhitelist', x-property-mappings.get('retry.interval.to.whitelist'));
        System.assertEquals('connectTimeout', x-property-mappings.get('connect.timeout'));
        System.assertEquals('socketTimeout', x-property-mappings.get('socket.timeout'));
        System.assertEquals('processLabel', x-property-mappings.get('process.label'));
        System.assertEquals('connectionUseMax', x-property-mappings.get('connection.use.max'));
    }
}
