
package org.openapitools.client.model


case class ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties (
    _cqPagesupdatehandlerImageresourcetypes: Option[ConfigNodePropertyArray]
)
object ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties {
    def toStringBody(var_cqPagesupdatehandlerImageresourcetypes: Object) =
        s"""
        | {
        | "cqPagesupdatehandlerImageresourcetypes":$var_cqPagesupdatehandlerImageresourcetypes
        | }
        """.stripMargin
}
