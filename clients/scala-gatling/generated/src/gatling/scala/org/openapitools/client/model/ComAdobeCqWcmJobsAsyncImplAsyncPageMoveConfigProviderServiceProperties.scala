
package org.openapitools.client.model


case class ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties (
    _threshold: Option[ConfigNodePropertyInteger],
    _jobTopicName: Option[ConfigNodePropertyString],
    _emailEnabled: Option[ConfigNodePropertyBoolean]
)
object ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties {
    def toStringBody(var_threshold: Object, var_jobTopicName: Object, var_emailEnabled: Object) =
        s"""
        | {
        | "threshold":$var_threshold,"jobTopicName":$var_jobTopicName,"emailEnabled":$var_emailEnabled
        | }
        """.stripMargin
}
