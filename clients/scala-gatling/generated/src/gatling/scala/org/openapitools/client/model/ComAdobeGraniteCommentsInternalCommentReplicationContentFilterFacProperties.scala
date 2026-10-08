
package org.openapitools.client.model


case class ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties (
    _replicateCommentResourceTypes: Option[ConfigNodePropertyArray]
)
object ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties {
    def toStringBody(var_replicateCommentResourceTypes: Object) =
        s"""
        | {
        | "replicateCommentResourceTypes":$var_replicateCommentResourceTypes
        | }
        """.stripMargin
}
