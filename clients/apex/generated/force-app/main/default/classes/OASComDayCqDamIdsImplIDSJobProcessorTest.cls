@isTest
private class OASComDayCqDamIdsImplIDSJobProcessorTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqDamIdsImplIDSJobProcessor comDayCqDamIdsImplIDSJobProcessorProperties1 = OASComDayCqDamIdsImplIDSJobProcessor.getExample();
        OASComDayCqDamIdsImplIDSJobProcessor comDayCqDamIdsImplIDSJobProcessorProperties2 = comDayCqDamIdsImplIDSJobProcessorProperties1;
        OASComDayCqDamIdsImplIDSJobProcessor comDayCqDamIdsImplIDSJobProcessorProperties3 = new OASComDayCqDamIdsImplIDSJobProcessor();
        OASComDayCqDamIdsImplIDSJobProcessor comDayCqDamIdsImplIDSJobProcessorProperties4 = comDayCqDamIdsImplIDSJobProcessorProperties3;

        System.assert(comDayCqDamIdsImplIDSJobProcessorProperties1.equals(comDayCqDamIdsImplIDSJobProcessorProperties2));
        System.assert(comDayCqDamIdsImplIDSJobProcessorProperties2.equals(comDayCqDamIdsImplIDSJobProcessorProperties1));
        System.assert(comDayCqDamIdsImplIDSJobProcessorProperties1.equals(comDayCqDamIdsImplIDSJobProcessorProperties1));
        System.assert(comDayCqDamIdsImplIDSJobProcessorProperties3.equals(comDayCqDamIdsImplIDSJobProcessorProperties4));
        System.assert(comDayCqDamIdsImplIDSJobProcessorProperties4.equals(comDayCqDamIdsImplIDSJobProcessorProperties3));
        System.assert(comDayCqDamIdsImplIDSJobProcessorProperties3.equals(comDayCqDamIdsImplIDSJobProcessorProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqDamIdsImplIDSJobProcessor comDayCqDamIdsImplIDSJobProcessorProperties1 = OASComDayCqDamIdsImplIDSJobProcessor.getExample();
        OASComDayCqDamIdsImplIDSJobProcessor comDayCqDamIdsImplIDSJobProcessorProperties2 = OASComDayCqDamIdsImplIDSJobProcessor.getExample();
        OASComDayCqDamIdsImplIDSJobProcessor comDayCqDamIdsImplIDSJobProcessorProperties3 = new OASComDayCqDamIdsImplIDSJobProcessor();
        OASComDayCqDamIdsImplIDSJobProcessor comDayCqDamIdsImplIDSJobProcessorProperties4 = new OASComDayCqDamIdsImplIDSJobProcessor();

        System.assert(comDayCqDamIdsImplIDSJobProcessorProperties1.equals(comDayCqDamIdsImplIDSJobProcessorProperties2));
        System.assert(comDayCqDamIdsImplIDSJobProcessorProperties2.equals(comDayCqDamIdsImplIDSJobProcessorProperties1));
        System.assert(comDayCqDamIdsImplIDSJobProcessorProperties3.equals(comDayCqDamIdsImplIDSJobProcessorProperties4));
        System.assert(comDayCqDamIdsImplIDSJobProcessorProperties4.equals(comDayCqDamIdsImplIDSJobProcessorProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqDamIdsImplIDSJobProcessor comDayCqDamIdsImplIDSJobProcessorProperties1 = OASComDayCqDamIdsImplIDSJobProcessor.getExample();
        OASComDayCqDamIdsImplIDSJobProcessor comDayCqDamIdsImplIDSJobProcessorProperties2 = new OASComDayCqDamIdsImplIDSJobProcessor();

        System.assertEquals(false, comDayCqDamIdsImplIDSJobProcessorProperties1.equals('foo'));
        System.assertEquals(false, comDayCqDamIdsImplIDSJobProcessorProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqDamIdsImplIDSJobProcessor comDayCqDamIdsImplIDSJobProcessorProperties1 = OASComDayCqDamIdsImplIDSJobProcessor.getExample();
        OASComDayCqDamIdsImplIDSJobProcessor comDayCqDamIdsImplIDSJobProcessorProperties2 = new OASComDayCqDamIdsImplIDSJobProcessor();
        OASComDayCqDamIdsImplIDSJobProcessor comDayCqDamIdsImplIDSJobProcessorProperties3;

        System.assertEquals(false, comDayCqDamIdsImplIDSJobProcessorProperties1.equals(comDayCqDamIdsImplIDSJobProcessorProperties3));
        System.assertEquals(false, comDayCqDamIdsImplIDSJobProcessorProperties2.equals(comDayCqDamIdsImplIDSJobProcessorProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqDamIdsImplIDSJobProcessor comDayCqDamIdsImplIDSJobProcessorProperties1 = OASComDayCqDamIdsImplIDSJobProcessor.getExample();
        OASComDayCqDamIdsImplIDSJobProcessor comDayCqDamIdsImplIDSJobProcessorProperties2 = new OASComDayCqDamIdsImplIDSJobProcessor();

        System.assertEquals(comDayCqDamIdsImplIDSJobProcessorProperties1.hashCode(), comDayCqDamIdsImplIDSJobProcessorProperties1.hashCode());
        System.assertEquals(comDayCqDamIdsImplIDSJobProcessorProperties2.hashCode(), comDayCqDamIdsImplIDSJobProcessorProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqDamIdsImplIDSJobProcessor comDayCqDamIdsImplIDSJobProcessorProperties1 = OASComDayCqDamIdsImplIDSJobProcessor.getExample();
        OASComDayCqDamIdsImplIDSJobProcessor comDayCqDamIdsImplIDSJobProcessorProperties2 = OASComDayCqDamIdsImplIDSJobProcessor.getExample();
        OASComDayCqDamIdsImplIDSJobProcessor comDayCqDamIdsImplIDSJobProcessorProperties3 = new OASComDayCqDamIdsImplIDSJobProcessor();
        OASComDayCqDamIdsImplIDSJobProcessor comDayCqDamIdsImplIDSJobProcessorProperties4 = new OASComDayCqDamIdsImplIDSJobProcessor();

        System.assert(comDayCqDamIdsImplIDSJobProcessorProperties1.equals(comDayCqDamIdsImplIDSJobProcessorProperties2));
        System.assert(comDayCqDamIdsImplIDSJobProcessorProperties3.equals(comDayCqDamIdsImplIDSJobProcessorProperties4));
        System.assertEquals(comDayCqDamIdsImplIDSJobProcessorProperties1.hashCode(), comDayCqDamIdsImplIDSJobProcessorProperties2.hashCode());
        System.assertEquals(comDayCqDamIdsImplIDSJobProcessorProperties3.hashCode(), comDayCqDamIdsImplIDSJobProcessorProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComDayCqDamIdsImplIDSJobProcessor comDayCqDamIdsImplIDSJobProcessorProperties = new OASComDayCqDamIdsImplIDSJobProcessor();
        Map<String, String> propertyMappings = comDayCqDamIdsImplIDSJobProcessorProperties.getPropertyMappings();
        System.assertEquals('enableMultisession', propertyMappings.get('enable.multisession'));
        System.assertEquals('idsCcEnable', propertyMappings.get('ids.cc.enable'));
        System.assertEquals('enableRetry', propertyMappings.get('enable.retry'));
        System.assertEquals('enableRetryScripterror', propertyMappings.get('enable.retry.scripterror'));
        System.assertEquals('externalizerDomainCqhost', propertyMappings.get('externalizer.domain.cqhost'));
        System.assertEquals('externalizerDomainHttp', propertyMappings.get('externalizer.domain.http'));
    }
}
