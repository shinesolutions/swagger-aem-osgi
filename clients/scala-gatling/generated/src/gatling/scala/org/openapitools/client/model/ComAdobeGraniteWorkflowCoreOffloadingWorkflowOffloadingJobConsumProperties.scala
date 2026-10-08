
package org.openapitools.client.model


case class ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties (
    _jobTopics: Option[ConfigNodePropertyString]
)
object ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties {
    def toStringBody(var_jobTopics: Object) =
        s"""
        | {
        | "jobTopics":$var_jobTopics
        | }
        """.stripMargin
}
