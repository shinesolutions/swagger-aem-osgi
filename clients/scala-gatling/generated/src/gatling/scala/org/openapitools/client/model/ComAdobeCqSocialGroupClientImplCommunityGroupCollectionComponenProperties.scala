
package org.openapitools.client.model


case class ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties (
    _groupListingPaginationEnable: Option[ConfigNodePropertyBoolean],
    _groupListingLazyloadingEnable: Option[ConfigNodePropertyBoolean],
    _pageSize: Option[ConfigNodePropertyInteger],
    _priority: Option[ConfigNodePropertyInteger]
)
object ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties {
    def toStringBody(var_groupListingPaginationEnable: Object, var_groupListingLazyloadingEnable: Object, var_pageSize: Object, var_priority: Object) =
        s"""
        | {
        | "groupListingPaginationEnable":$var_groupListingPaginationEnable,"groupListingLazyloadingEnable":$var_groupListingLazyloadingEnable,"pageSize":$var_pageSize,"priority":$var_priority
        | }
        """.stripMargin
}
