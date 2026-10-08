
package org.openapitools.client.model


case class ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties (
    _payloadMoveWhiteList: Option[ConfigNodePropertyArray],
    _payloadMoveHandleFromWorkflowProcess: Option[ConfigNodePropertyBoolean]
)
object ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties {
    def toStringBody(var_payloadMoveWhiteList: Object, var_payloadMoveHandleFromWorkflowProcess: Object) =
        s"""
        | {
        | "payloadMoveWhiteList":$var_payloadMoveWhiteList,"payloadMoveHandleFromWorkflowProcess":$var_payloadMoveHandleFromWorkflowProcess
        | }
        """.stripMargin
}
