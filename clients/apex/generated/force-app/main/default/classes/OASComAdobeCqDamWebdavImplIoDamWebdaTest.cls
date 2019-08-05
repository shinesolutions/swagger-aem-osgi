@isTest
private class OASComAdobeCqDamWebdavImplIoDamWebdaTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeCqDamWebdavImplIoDamWebda comAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties1 = OASComAdobeCqDamWebdavImplIoDamWebda.getExample();
        OASComAdobeCqDamWebdavImplIoDamWebda comAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties2 = comAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties1;
        OASComAdobeCqDamWebdavImplIoDamWebda comAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties3 = new OASComAdobeCqDamWebdavImplIoDamWebda();
        OASComAdobeCqDamWebdavImplIoDamWebda comAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties4 = comAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties3;

        System.assert(comAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties1.equals(comAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties2));
        System.assert(comAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties2.equals(comAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties1));
        System.assert(comAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties1.equals(comAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties1));
        System.assert(comAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties3.equals(comAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties4));
        System.assert(comAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties4.equals(comAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties3));
        System.assert(comAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties3.equals(comAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeCqDamWebdavImplIoDamWebda comAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties1 = OASComAdobeCqDamWebdavImplIoDamWebda.getExample();
        OASComAdobeCqDamWebdavImplIoDamWebda comAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties2 = OASComAdobeCqDamWebdavImplIoDamWebda.getExample();
        OASComAdobeCqDamWebdavImplIoDamWebda comAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties3 = new OASComAdobeCqDamWebdavImplIoDamWebda();
        OASComAdobeCqDamWebdavImplIoDamWebda comAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties4 = new OASComAdobeCqDamWebdavImplIoDamWebda();

        System.assert(comAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties1.equals(comAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties2));
        System.assert(comAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties2.equals(comAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties1));
        System.assert(comAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties3.equals(comAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties4));
        System.assert(comAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties4.equals(comAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeCqDamWebdavImplIoDamWebda comAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties1 = OASComAdobeCqDamWebdavImplIoDamWebda.getExample();
        OASComAdobeCqDamWebdavImplIoDamWebda comAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties2 = new OASComAdobeCqDamWebdavImplIoDamWebda();

        System.assertEquals(false, comAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties1.equals('foo'));
        System.assertEquals(false, comAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeCqDamWebdavImplIoDamWebda comAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties1 = OASComAdobeCqDamWebdavImplIoDamWebda.getExample();
        OASComAdobeCqDamWebdavImplIoDamWebda comAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties2 = new OASComAdobeCqDamWebdavImplIoDamWebda();
        OASComAdobeCqDamWebdavImplIoDamWebda comAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties3;

        System.assertEquals(false, comAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties1.equals(comAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties3));
        System.assertEquals(false, comAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties2.equals(comAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeCqDamWebdavImplIoDamWebda comAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties1 = OASComAdobeCqDamWebdavImplIoDamWebda.getExample();
        OASComAdobeCqDamWebdavImplIoDamWebda comAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties2 = new OASComAdobeCqDamWebdavImplIoDamWebda();

        System.assertEquals(comAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties1.hashCode(), comAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties1.hashCode());
        System.assertEquals(comAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties2.hashCode(), comAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeCqDamWebdavImplIoDamWebda comAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties1 = OASComAdobeCqDamWebdavImplIoDamWebda.getExample();
        OASComAdobeCqDamWebdavImplIoDamWebda comAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties2 = OASComAdobeCqDamWebdavImplIoDamWebda.getExample();
        OASComAdobeCqDamWebdavImplIoDamWebda comAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties3 = new OASComAdobeCqDamWebdavImplIoDamWebda();
        OASComAdobeCqDamWebdavImplIoDamWebda comAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties4 = new OASComAdobeCqDamWebdavImplIoDamWebda();

        System.assert(comAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties1.equals(comAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties2));
        System.assert(comAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties3.equals(comAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties4));
        System.assertEquals(comAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties1.hashCode(), comAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties2.hashCode());
        System.assertEquals(comAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties3.hashCode(), comAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeCqDamWebdavImplIoDamWebda comAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties = new OASComAdobeCqDamWebdavImplIoDamWebda();
        Map<String, String> propertyMappings = comAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties.getPropertyMappings();
        System.assertEquals('cqDamWebdavVersionLinkingEnable', propertyMappings.get('cq.dam.webdav.version.linking.enable'));
        System.assertEquals('cqDamWebdavVersionLinkingSchedulerPeriod', propertyMappings.get('cq.dam.webdav.version.linking.scheduler.period'));
        System.assertEquals('cqDamWebdavVersionLinkingStagingTimeout', propertyMappings.get('cq.dam.webdav.version.linking.staging.timeout'));
    }
}
