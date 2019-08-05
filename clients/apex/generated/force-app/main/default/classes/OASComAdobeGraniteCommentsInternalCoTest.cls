@isTest
private class OASComAdobeGraniteCommentsInternalCoTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeGraniteCommentsInternalCo comAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties1 = OASComAdobeGraniteCommentsInternalCo.getExample();
        OASComAdobeGraniteCommentsInternalCo comAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties2 = comAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties1;
        OASComAdobeGraniteCommentsInternalCo comAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties3 = new OASComAdobeGraniteCommentsInternalCo();
        OASComAdobeGraniteCommentsInternalCo comAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties4 = comAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties3;

        System.assert(comAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties1.equals(comAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties2));
        System.assert(comAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties2.equals(comAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties1));
        System.assert(comAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties1.equals(comAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties1));
        System.assert(comAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties3.equals(comAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties4));
        System.assert(comAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties4.equals(comAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties3));
        System.assert(comAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties3.equals(comAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeGraniteCommentsInternalCo comAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties1 = OASComAdobeGraniteCommentsInternalCo.getExample();
        OASComAdobeGraniteCommentsInternalCo comAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties2 = OASComAdobeGraniteCommentsInternalCo.getExample();
        OASComAdobeGraniteCommentsInternalCo comAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties3 = new OASComAdobeGraniteCommentsInternalCo();
        OASComAdobeGraniteCommentsInternalCo comAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties4 = new OASComAdobeGraniteCommentsInternalCo();

        System.assert(comAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties1.equals(comAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties2));
        System.assert(comAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties2.equals(comAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties1));
        System.assert(comAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties3.equals(comAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties4));
        System.assert(comAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties4.equals(comAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeGraniteCommentsInternalCo comAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties1 = OASComAdobeGraniteCommentsInternalCo.getExample();
        OASComAdobeGraniteCommentsInternalCo comAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties2 = new OASComAdobeGraniteCommentsInternalCo();

        System.assertEquals(false, comAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties1.equals('foo'));
        System.assertEquals(false, comAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeGraniteCommentsInternalCo comAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties1 = OASComAdobeGraniteCommentsInternalCo.getExample();
        OASComAdobeGraniteCommentsInternalCo comAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties2 = new OASComAdobeGraniteCommentsInternalCo();
        OASComAdobeGraniteCommentsInternalCo comAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties3;

        System.assertEquals(false, comAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties1.equals(comAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties3));
        System.assertEquals(false, comAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties2.equals(comAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeGraniteCommentsInternalCo comAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties1 = OASComAdobeGraniteCommentsInternalCo.getExample();
        OASComAdobeGraniteCommentsInternalCo comAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties2 = new OASComAdobeGraniteCommentsInternalCo();

        System.assertEquals(comAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties1.hashCode(), comAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties1.hashCode());
        System.assertEquals(comAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties2.hashCode(), comAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeGraniteCommentsInternalCo comAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties1 = OASComAdobeGraniteCommentsInternalCo.getExample();
        OASComAdobeGraniteCommentsInternalCo comAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties2 = OASComAdobeGraniteCommentsInternalCo.getExample();
        OASComAdobeGraniteCommentsInternalCo comAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties3 = new OASComAdobeGraniteCommentsInternalCo();
        OASComAdobeGraniteCommentsInternalCo comAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties4 = new OASComAdobeGraniteCommentsInternalCo();

        System.assert(comAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties1.equals(comAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties2));
        System.assert(comAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties3.equals(comAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties4));
        System.assertEquals(comAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties1.hashCode(), comAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties2.hashCode());
        System.assertEquals(comAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties3.hashCode(), comAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeGraniteCommentsInternalCo comAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties = new OASComAdobeGraniteCommentsInternalCo();
        Map<String, String> propertyMappings = comAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties.getPropertyMappings();
        System.assertEquals('replicateCommentResourceTypes', propertyMappings.get('replicate.comment.resourceTypes'));
    }
}
