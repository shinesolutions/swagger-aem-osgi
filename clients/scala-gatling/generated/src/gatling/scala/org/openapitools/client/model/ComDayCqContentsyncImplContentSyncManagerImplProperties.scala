
package org.openapitools.client.model


case class ComDayCqContentsyncImplContentSyncManagerImplProperties (
    _contentsyncFallbackAuthorizable: Option[ConfigNodePropertyString],
    _contentsyncFallbackUpdateuser: Option[ConfigNodePropertyString]
)
object ComDayCqContentsyncImplContentSyncManagerImplProperties {
    def toStringBody(var_contentsyncFallbackAuthorizable: Object, var_contentsyncFallbackUpdateuser: Object) =
        s"""
        | {
        | "contentsyncFallbackAuthorizable":$var_contentsyncFallbackAuthorizable,"contentsyncFallbackUpdateuser":$var_contentsyncFallbackUpdateuser
        | }
        """.stripMargin
}
