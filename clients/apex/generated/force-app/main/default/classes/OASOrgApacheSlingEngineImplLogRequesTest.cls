@isTest
private class OASOrgApacheSlingEngineImplLogRequesTest {
    @isTest
    private static void equalsSameInstance() {
        OASOrgApacheSlingEngineImplLogReques orgApacheSlingEngineImplLogRequestLoggerServiceProperties1 = OASOrgApacheSlingEngineImplLogReques.getExample();
        OASOrgApacheSlingEngineImplLogReques orgApacheSlingEngineImplLogRequestLoggerServiceProperties2 = orgApacheSlingEngineImplLogRequestLoggerServiceProperties1;
        OASOrgApacheSlingEngineImplLogReques orgApacheSlingEngineImplLogRequestLoggerServiceProperties3 = new OASOrgApacheSlingEngineImplLogReques();
        OASOrgApacheSlingEngineImplLogReques orgApacheSlingEngineImplLogRequestLoggerServiceProperties4 = orgApacheSlingEngineImplLogRequestLoggerServiceProperties3;

        System.assert(orgApacheSlingEngineImplLogRequestLoggerServiceProperties1.equals(orgApacheSlingEngineImplLogRequestLoggerServiceProperties2));
        System.assert(orgApacheSlingEngineImplLogRequestLoggerServiceProperties2.equals(orgApacheSlingEngineImplLogRequestLoggerServiceProperties1));
        System.assert(orgApacheSlingEngineImplLogRequestLoggerServiceProperties1.equals(orgApacheSlingEngineImplLogRequestLoggerServiceProperties1));
        System.assert(orgApacheSlingEngineImplLogRequestLoggerServiceProperties3.equals(orgApacheSlingEngineImplLogRequestLoggerServiceProperties4));
        System.assert(orgApacheSlingEngineImplLogRequestLoggerServiceProperties4.equals(orgApacheSlingEngineImplLogRequestLoggerServiceProperties3));
        System.assert(orgApacheSlingEngineImplLogRequestLoggerServiceProperties3.equals(orgApacheSlingEngineImplLogRequestLoggerServiceProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOrgApacheSlingEngineImplLogReques orgApacheSlingEngineImplLogRequestLoggerServiceProperties1 = OASOrgApacheSlingEngineImplLogReques.getExample();
        OASOrgApacheSlingEngineImplLogReques orgApacheSlingEngineImplLogRequestLoggerServiceProperties2 = OASOrgApacheSlingEngineImplLogReques.getExample();
        OASOrgApacheSlingEngineImplLogReques orgApacheSlingEngineImplLogRequestLoggerServiceProperties3 = new OASOrgApacheSlingEngineImplLogReques();
        OASOrgApacheSlingEngineImplLogReques orgApacheSlingEngineImplLogRequestLoggerServiceProperties4 = new OASOrgApacheSlingEngineImplLogReques();

        System.assert(orgApacheSlingEngineImplLogRequestLoggerServiceProperties1.equals(orgApacheSlingEngineImplLogRequestLoggerServiceProperties2));
        System.assert(orgApacheSlingEngineImplLogRequestLoggerServiceProperties2.equals(orgApacheSlingEngineImplLogRequestLoggerServiceProperties1));
        System.assert(orgApacheSlingEngineImplLogRequestLoggerServiceProperties3.equals(orgApacheSlingEngineImplLogRequestLoggerServiceProperties4));
        System.assert(orgApacheSlingEngineImplLogRequestLoggerServiceProperties4.equals(orgApacheSlingEngineImplLogRequestLoggerServiceProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOrgApacheSlingEngineImplLogReques orgApacheSlingEngineImplLogRequestLoggerServiceProperties1 = OASOrgApacheSlingEngineImplLogReques.getExample();
        OASOrgApacheSlingEngineImplLogReques orgApacheSlingEngineImplLogRequestLoggerServiceProperties2 = new OASOrgApacheSlingEngineImplLogReques();

        System.assertEquals(false, orgApacheSlingEngineImplLogRequestLoggerServiceProperties1.equals('foo'));
        System.assertEquals(false, orgApacheSlingEngineImplLogRequestLoggerServiceProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOrgApacheSlingEngineImplLogReques orgApacheSlingEngineImplLogRequestLoggerServiceProperties1 = OASOrgApacheSlingEngineImplLogReques.getExample();
        OASOrgApacheSlingEngineImplLogReques orgApacheSlingEngineImplLogRequestLoggerServiceProperties2 = new OASOrgApacheSlingEngineImplLogReques();
        OASOrgApacheSlingEngineImplLogReques orgApacheSlingEngineImplLogRequestLoggerServiceProperties3;

        System.assertEquals(false, orgApacheSlingEngineImplLogRequestLoggerServiceProperties1.equals(orgApacheSlingEngineImplLogRequestLoggerServiceProperties3));
        System.assertEquals(false, orgApacheSlingEngineImplLogRequestLoggerServiceProperties2.equals(orgApacheSlingEngineImplLogRequestLoggerServiceProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOrgApacheSlingEngineImplLogReques orgApacheSlingEngineImplLogRequestLoggerServiceProperties1 = OASOrgApacheSlingEngineImplLogReques.getExample();
        OASOrgApacheSlingEngineImplLogReques orgApacheSlingEngineImplLogRequestLoggerServiceProperties2 = new OASOrgApacheSlingEngineImplLogReques();

        System.assertEquals(orgApacheSlingEngineImplLogRequestLoggerServiceProperties1.hashCode(), orgApacheSlingEngineImplLogRequestLoggerServiceProperties1.hashCode());
        System.assertEquals(orgApacheSlingEngineImplLogRequestLoggerServiceProperties2.hashCode(), orgApacheSlingEngineImplLogRequestLoggerServiceProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOrgApacheSlingEngineImplLogReques orgApacheSlingEngineImplLogRequestLoggerServiceProperties1 = OASOrgApacheSlingEngineImplLogReques.getExample();
        OASOrgApacheSlingEngineImplLogReques orgApacheSlingEngineImplLogRequestLoggerServiceProperties2 = OASOrgApacheSlingEngineImplLogReques.getExample();
        OASOrgApacheSlingEngineImplLogReques orgApacheSlingEngineImplLogRequestLoggerServiceProperties3 = new OASOrgApacheSlingEngineImplLogReques();
        OASOrgApacheSlingEngineImplLogReques orgApacheSlingEngineImplLogRequestLoggerServiceProperties4 = new OASOrgApacheSlingEngineImplLogReques();

        System.assert(orgApacheSlingEngineImplLogRequestLoggerServiceProperties1.equals(orgApacheSlingEngineImplLogRequestLoggerServiceProperties2));
        System.assert(orgApacheSlingEngineImplLogRequestLoggerServiceProperties3.equals(orgApacheSlingEngineImplLogRequestLoggerServiceProperties4));
        System.assertEquals(orgApacheSlingEngineImplLogRequestLoggerServiceProperties1.hashCode(), orgApacheSlingEngineImplLogRequestLoggerServiceProperties2.hashCode());
        System.assertEquals(orgApacheSlingEngineImplLogRequestLoggerServiceProperties3.hashCode(), orgApacheSlingEngineImplLogRequestLoggerServiceProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASOrgApacheSlingEngineImplLogReques orgApacheSlingEngineImplLogRequestLoggerServiceProperties = new OASOrgApacheSlingEngineImplLogReques();
        Map<String, String> propertyMappings = orgApacheSlingEngineImplLogRequestLoggerServiceProperties.getPropertyMappings();
        System.assertEquals('requestLogServiceFormat', propertyMappings.get('request.log.service.format'));
        System.assertEquals('requestLogServiceOutput', propertyMappings.get('request.log.service.output'));
        System.assertEquals('requestLogServiceOutputtype', propertyMappings.get('request.log.service.outputtype'));
        System.assertEquals('requestLogServiceOnentry', propertyMappings.get('request.log.service.onentry'));
    }
}
