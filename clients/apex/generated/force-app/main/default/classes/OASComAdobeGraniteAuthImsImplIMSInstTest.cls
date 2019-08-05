@isTest
private class OASComAdobeGraniteAuthImsImplIMSInstTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeGraniteAuthImsImplIMSInst comAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorProperties1 = OASComAdobeGraniteAuthImsImplIMSInst.getExample();
        OASComAdobeGraniteAuthImsImplIMSInst comAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorProperties2 = comAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorProperties1;
        OASComAdobeGraniteAuthImsImplIMSInst comAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorProperties3 = new OASComAdobeGraniteAuthImsImplIMSInst();
        OASComAdobeGraniteAuthImsImplIMSInst comAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorProperties4 = comAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorProperties3;

        System.assert(comAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorProperties1.equals(comAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorProperties2));
        System.assert(comAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorProperties2.equals(comAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorProperties1));
        System.assert(comAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorProperties1.equals(comAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorProperties1));
        System.assert(comAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorProperties3.equals(comAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorProperties4));
        System.assert(comAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorProperties4.equals(comAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorProperties3));
        System.assert(comAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorProperties3.equals(comAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeGraniteAuthImsImplIMSInst comAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorProperties1 = OASComAdobeGraniteAuthImsImplIMSInst.getExample();
        OASComAdobeGraniteAuthImsImplIMSInst comAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorProperties2 = OASComAdobeGraniteAuthImsImplIMSInst.getExample();
        OASComAdobeGraniteAuthImsImplIMSInst comAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorProperties3 = new OASComAdobeGraniteAuthImsImplIMSInst();
        OASComAdobeGraniteAuthImsImplIMSInst comAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorProperties4 = new OASComAdobeGraniteAuthImsImplIMSInst();

        System.assert(comAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorProperties1.equals(comAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorProperties2));
        System.assert(comAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorProperties2.equals(comAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorProperties1));
        System.assert(comAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorProperties3.equals(comAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorProperties4));
        System.assert(comAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorProperties4.equals(comAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeGraniteAuthImsImplIMSInst comAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorProperties1 = OASComAdobeGraniteAuthImsImplIMSInst.getExample();
        OASComAdobeGraniteAuthImsImplIMSInst comAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorProperties2 = new OASComAdobeGraniteAuthImsImplIMSInst();

        System.assertEquals(false, comAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorProperties1.equals('foo'));
        System.assertEquals(false, comAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeGraniteAuthImsImplIMSInst comAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorProperties1 = OASComAdobeGraniteAuthImsImplIMSInst.getExample();
        OASComAdobeGraniteAuthImsImplIMSInst comAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorProperties2 = new OASComAdobeGraniteAuthImsImplIMSInst();
        OASComAdobeGraniteAuthImsImplIMSInst comAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorProperties3;

        System.assertEquals(false, comAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorProperties1.equals(comAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorProperties3));
        System.assertEquals(false, comAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorProperties2.equals(comAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeGraniteAuthImsImplIMSInst comAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorProperties1 = OASComAdobeGraniteAuthImsImplIMSInst.getExample();
        OASComAdobeGraniteAuthImsImplIMSInst comAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorProperties2 = new OASComAdobeGraniteAuthImsImplIMSInst();

        System.assertEquals(comAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorProperties1.hashCode(), comAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorProperties1.hashCode());
        System.assertEquals(comAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorProperties2.hashCode(), comAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeGraniteAuthImsImplIMSInst comAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorProperties1 = OASComAdobeGraniteAuthImsImplIMSInst.getExample();
        OASComAdobeGraniteAuthImsImplIMSInst comAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorProperties2 = OASComAdobeGraniteAuthImsImplIMSInst.getExample();
        OASComAdobeGraniteAuthImsImplIMSInst comAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorProperties3 = new OASComAdobeGraniteAuthImsImplIMSInst();
        OASComAdobeGraniteAuthImsImplIMSInst comAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorProperties4 = new OASComAdobeGraniteAuthImsImplIMSInst();

        System.assert(comAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorProperties1.equals(comAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorProperties2));
        System.assert(comAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorProperties3.equals(comAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorProperties4));
        System.assertEquals(comAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorProperties1.hashCode(), comAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorProperties2.hashCode());
        System.assertEquals(comAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorProperties3.hashCode(), comAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeGraniteAuthImsImplIMSInst comAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorProperties = new OASComAdobeGraniteAuthImsImplIMSInst();
        Map<String, String> propertyMappings = comAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorProperties.getPropertyMappings();
        System.assertEquals('oauthProviderId', propertyMappings.get('oauth.provider.id'));
    }
}
