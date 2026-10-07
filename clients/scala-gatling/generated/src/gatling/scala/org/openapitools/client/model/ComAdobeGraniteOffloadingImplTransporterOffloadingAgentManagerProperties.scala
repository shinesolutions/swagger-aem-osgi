
package org.openapitools.client.model


case class ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerProperties (
    _offloadingAgentmanagerEnabled: Option[ConfigNodePropertyBoolean]
)
object ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerProperties {
    def toStringBody(var_offloadingAgentmanagerEnabled: Object) =
        s"""
        | {
        | "offloadingAgentmanagerEnabled":$var_offloadingAgentmanagerEnabled
        | }
        """.stripMargin
}
