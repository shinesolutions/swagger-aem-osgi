
package org.openapitools.client.model


case class ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureProperties (
    _enabled: Option[ConfigNodePropertyBoolean]
)
object ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureProperties {
    def toStringBody(var_enabled: Object) =
        s"""
        | {
        | "enabled":$var_enabled
        | }
        """.stripMargin
}
