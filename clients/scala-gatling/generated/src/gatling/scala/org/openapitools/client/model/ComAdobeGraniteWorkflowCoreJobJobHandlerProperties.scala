
package org.openapitools.client.model


case class ComAdobeGraniteWorkflowCoreJobJobHandlerProperties (
    _jobTopics: Option[ConfigNodePropertyArray],
    _allowSelfProcessTermination: Option[ConfigNodePropertyBoolean]
)
object ComAdobeGraniteWorkflowCoreJobJobHandlerProperties {
    def toStringBody(var_jobTopics: Object, var_allowSelfProcessTermination: Object) =
        s"""
        | {
        | "jobTopics":$var_jobTopics,"allowSelfProcessTermination":$var_allowSelfProcessTermination
        | }
        """.stripMargin
}
