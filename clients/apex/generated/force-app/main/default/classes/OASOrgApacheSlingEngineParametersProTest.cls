@isTest
private class OASOrgApacheSlingEngineParametersProTest {
    @isTest
    private static void equalsSameInstance() {
        OASOrgApacheSlingEngineParametersPro orgApacheSlingEngineParametersProperties1 = OASOrgApacheSlingEngineParametersPro.getExample();
        OASOrgApacheSlingEngineParametersPro orgApacheSlingEngineParametersProperties2 = orgApacheSlingEngineParametersProperties1;
        OASOrgApacheSlingEngineParametersPro orgApacheSlingEngineParametersProperties3 = new OASOrgApacheSlingEngineParametersPro();
        OASOrgApacheSlingEngineParametersPro orgApacheSlingEngineParametersProperties4 = orgApacheSlingEngineParametersProperties3;

        System.assert(orgApacheSlingEngineParametersProperties1.equals(orgApacheSlingEngineParametersProperties2));
        System.assert(orgApacheSlingEngineParametersProperties2.equals(orgApacheSlingEngineParametersProperties1));
        System.assert(orgApacheSlingEngineParametersProperties1.equals(orgApacheSlingEngineParametersProperties1));
        System.assert(orgApacheSlingEngineParametersProperties3.equals(orgApacheSlingEngineParametersProperties4));
        System.assert(orgApacheSlingEngineParametersProperties4.equals(orgApacheSlingEngineParametersProperties3));
        System.assert(orgApacheSlingEngineParametersProperties3.equals(orgApacheSlingEngineParametersProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOrgApacheSlingEngineParametersPro orgApacheSlingEngineParametersProperties1 = OASOrgApacheSlingEngineParametersPro.getExample();
        OASOrgApacheSlingEngineParametersPro orgApacheSlingEngineParametersProperties2 = OASOrgApacheSlingEngineParametersPro.getExample();
        OASOrgApacheSlingEngineParametersPro orgApacheSlingEngineParametersProperties3 = new OASOrgApacheSlingEngineParametersPro();
        OASOrgApacheSlingEngineParametersPro orgApacheSlingEngineParametersProperties4 = new OASOrgApacheSlingEngineParametersPro();

        System.assert(orgApacheSlingEngineParametersProperties1.equals(orgApacheSlingEngineParametersProperties2));
        System.assert(orgApacheSlingEngineParametersProperties2.equals(orgApacheSlingEngineParametersProperties1));
        System.assert(orgApacheSlingEngineParametersProperties3.equals(orgApacheSlingEngineParametersProperties4));
        System.assert(orgApacheSlingEngineParametersProperties4.equals(orgApacheSlingEngineParametersProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOrgApacheSlingEngineParametersPro orgApacheSlingEngineParametersProperties1 = OASOrgApacheSlingEngineParametersPro.getExample();
        OASOrgApacheSlingEngineParametersPro orgApacheSlingEngineParametersProperties2 = new OASOrgApacheSlingEngineParametersPro();

        System.assertEquals(false, orgApacheSlingEngineParametersProperties1.equals('foo'));
        System.assertEquals(false, orgApacheSlingEngineParametersProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOrgApacheSlingEngineParametersPro orgApacheSlingEngineParametersProperties1 = OASOrgApacheSlingEngineParametersPro.getExample();
        OASOrgApacheSlingEngineParametersPro orgApacheSlingEngineParametersProperties2 = new OASOrgApacheSlingEngineParametersPro();
        OASOrgApacheSlingEngineParametersPro orgApacheSlingEngineParametersProperties3;

        System.assertEquals(false, orgApacheSlingEngineParametersProperties1.equals(orgApacheSlingEngineParametersProperties3));
        System.assertEquals(false, orgApacheSlingEngineParametersProperties2.equals(orgApacheSlingEngineParametersProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOrgApacheSlingEngineParametersPro orgApacheSlingEngineParametersProperties1 = OASOrgApacheSlingEngineParametersPro.getExample();
        OASOrgApacheSlingEngineParametersPro orgApacheSlingEngineParametersProperties2 = new OASOrgApacheSlingEngineParametersPro();

        System.assertEquals(orgApacheSlingEngineParametersProperties1.hashCode(), orgApacheSlingEngineParametersProperties1.hashCode());
        System.assertEquals(orgApacheSlingEngineParametersProperties2.hashCode(), orgApacheSlingEngineParametersProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOrgApacheSlingEngineParametersPro orgApacheSlingEngineParametersProperties1 = OASOrgApacheSlingEngineParametersPro.getExample();
        OASOrgApacheSlingEngineParametersPro orgApacheSlingEngineParametersProperties2 = OASOrgApacheSlingEngineParametersPro.getExample();
        OASOrgApacheSlingEngineParametersPro orgApacheSlingEngineParametersProperties3 = new OASOrgApacheSlingEngineParametersPro();
        OASOrgApacheSlingEngineParametersPro orgApacheSlingEngineParametersProperties4 = new OASOrgApacheSlingEngineParametersPro();

        System.assert(orgApacheSlingEngineParametersProperties1.equals(orgApacheSlingEngineParametersProperties2));
        System.assert(orgApacheSlingEngineParametersProperties3.equals(orgApacheSlingEngineParametersProperties4));
        System.assertEquals(orgApacheSlingEngineParametersProperties1.hashCode(), orgApacheSlingEngineParametersProperties2.hashCode());
        System.assertEquals(orgApacheSlingEngineParametersProperties3.hashCode(), orgApacheSlingEngineParametersProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASOrgApacheSlingEngineParametersPro orgApacheSlingEngineParametersProperties = new OASOrgApacheSlingEngineParametersPro();
        Map<String, String> propertyMappings = orgApacheSlingEngineParametersProperties.getPropertyMappings();
        System.assertEquals('slingDefaultParameterEncoding', propertyMappings.get('sling.default.parameter.encoding'));
        System.assertEquals('slingDefaultMaxParameters', propertyMappings.get('sling.default.max.parameters'));
        System.assertEquals('fileLocation', propertyMappings.get('file.location'));
        System.assertEquals('fileThreshold', propertyMappings.get('file.threshold'));
        System.assertEquals('fileMax', propertyMappings.get('file.max'));
        System.assertEquals('requestMax', propertyMappings.get('request.max'));
        System.assertEquals('slingDefaultParameterCheckForAdditionalContainerParameters', propertyMappings.get('sling.default.parameter.checkForAdditionalContainerParameters'));
    }
}
