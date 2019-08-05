@isTest
private class OASComAdobeFdFpConfigFormsPortalDrafTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeFdFpConfigFormsPortalDraf comAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties1 = OASComAdobeFdFpConfigFormsPortalDraf.getExample();
        OASComAdobeFdFpConfigFormsPortalDraf comAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties2 = comAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties1;
        OASComAdobeFdFpConfigFormsPortalDraf comAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties3 = new OASComAdobeFdFpConfigFormsPortalDraf();
        OASComAdobeFdFpConfigFormsPortalDraf comAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties4 = comAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties3;

        System.assert(comAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties1.equals(comAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties2));
        System.assert(comAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties2.equals(comAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties1));
        System.assert(comAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties1.equals(comAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties1));
        System.assert(comAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties3.equals(comAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties4));
        System.assert(comAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties4.equals(comAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties3));
        System.assert(comAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties3.equals(comAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeFdFpConfigFormsPortalDraf comAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties1 = OASComAdobeFdFpConfigFormsPortalDraf.getExample();
        OASComAdobeFdFpConfigFormsPortalDraf comAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties2 = OASComAdobeFdFpConfigFormsPortalDraf.getExample();
        OASComAdobeFdFpConfigFormsPortalDraf comAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties3 = new OASComAdobeFdFpConfigFormsPortalDraf();
        OASComAdobeFdFpConfigFormsPortalDraf comAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties4 = new OASComAdobeFdFpConfigFormsPortalDraf();

        System.assert(comAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties1.equals(comAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties2));
        System.assert(comAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties2.equals(comAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties1));
        System.assert(comAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties3.equals(comAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties4));
        System.assert(comAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties4.equals(comAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeFdFpConfigFormsPortalDraf comAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties1 = OASComAdobeFdFpConfigFormsPortalDraf.getExample();
        OASComAdobeFdFpConfigFormsPortalDraf comAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties2 = new OASComAdobeFdFpConfigFormsPortalDraf();

        System.assertEquals(false, comAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties1.equals('foo'));
        System.assertEquals(false, comAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeFdFpConfigFormsPortalDraf comAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties1 = OASComAdobeFdFpConfigFormsPortalDraf.getExample();
        OASComAdobeFdFpConfigFormsPortalDraf comAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties2 = new OASComAdobeFdFpConfigFormsPortalDraf();
        OASComAdobeFdFpConfigFormsPortalDraf comAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties3;

        System.assertEquals(false, comAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties1.equals(comAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties3));
        System.assertEquals(false, comAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties2.equals(comAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeFdFpConfigFormsPortalDraf comAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties1 = OASComAdobeFdFpConfigFormsPortalDraf.getExample();
        OASComAdobeFdFpConfigFormsPortalDraf comAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties2 = new OASComAdobeFdFpConfigFormsPortalDraf();

        System.assertEquals(comAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties1.hashCode(), comAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties1.hashCode());
        System.assertEquals(comAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties2.hashCode(), comAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeFdFpConfigFormsPortalDraf comAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties1 = OASComAdobeFdFpConfigFormsPortalDraf.getExample();
        OASComAdobeFdFpConfigFormsPortalDraf comAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties2 = OASComAdobeFdFpConfigFormsPortalDraf.getExample();
        OASComAdobeFdFpConfigFormsPortalDraf comAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties3 = new OASComAdobeFdFpConfigFormsPortalDraf();
        OASComAdobeFdFpConfigFormsPortalDraf comAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties4 = new OASComAdobeFdFpConfigFormsPortalDraf();

        System.assert(comAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties1.equals(comAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties2));
        System.assert(comAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties3.equals(comAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties4));
        System.assertEquals(comAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties1.hashCode(), comAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties2.hashCode());
        System.assertEquals(comAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties3.hashCode(), comAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeFdFpConfigFormsPortalDraf comAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties = new OASComAdobeFdFpConfigFormsPortalDraf();
        Map<String, String> propertyMappings = comAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties.getPropertyMappings();
        System.assertEquals('portalOutboxes', propertyMappings.get('portal.outboxes'));
        System.assertEquals('draftDataService', propertyMappings.get('draft.data.service'));
        System.assertEquals('draftMetadataService', propertyMappings.get('draft.metadata.service'));
        System.assertEquals('submitDataService', propertyMappings.get('submit.data.service'));
        System.assertEquals('submitMetadataService', propertyMappings.get('submit.metadata.service'));
        System.assertEquals('pendingSignDataService', propertyMappings.get('pendingSign.data.service'));
        System.assertEquals('pendingSignMetadataService', propertyMappings.get('pendingSign.metadata.service'));
    }
}
