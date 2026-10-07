
package org.openapitools.client.model


case class ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties (
    _graniteWorkflowWorkflowPublishEventServiceEnabled: Option[ConfigNodePropertyBoolean]
)
object ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties {
    def toStringBody(var_graniteWorkflowWorkflowPublishEventServiceEnabled: Object) =
        s"""
        | {
        | "graniteWorkflowWorkflowPublishEventServiceEnabled":$var_graniteWorkflowWorkflowPublishEventServiceEnabled
        | }
        """.stripMargin
}
