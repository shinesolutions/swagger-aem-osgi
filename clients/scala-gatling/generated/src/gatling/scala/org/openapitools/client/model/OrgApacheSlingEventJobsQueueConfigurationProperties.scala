
package org.openapitools.client.model


case class OrgApacheSlingEventJobsQueueConfigurationProperties (
    _queueName: Option[ConfigNodePropertyString],
    _queueTopics: Option[ConfigNodePropertyArray],
    _queueType: Option[ConfigNodePropertyDropDown],
    _queuePriority: Option[ConfigNodePropertyDropDown],
    _queueRetries: Option[ConfigNodePropertyInteger],
    _queueRetrydelay: Option[ConfigNodePropertyInteger],
    _queueMaxparallel: Option[ConfigNodePropertyFloat],
    _queueKeepJobs: Option[ConfigNodePropertyBoolean],
    _queuePreferRunOnCreationInstance: Option[ConfigNodePropertyBoolean],
    _queueThreadPoolSize: Option[ConfigNodePropertyInteger],
    _serviceRanking: Option[ConfigNodePropertyInteger]
)
object OrgApacheSlingEventJobsQueueConfigurationProperties {
    def toStringBody(var_queueName: Object, var_queueTopics: Object, var_queueType: Object, var_queuePriority: Object, var_queueRetries: Object, var_queueRetrydelay: Object, var_queueMaxparallel: Object, var_queueKeepJobs: Object, var_queuePreferRunOnCreationInstance: Object, var_queueThreadPoolSize: Object, var_serviceRanking: Object) =
        s"""
        | {
        | "queueName":$var_queueName,"queueTopics":$var_queueTopics,"queueType":$var_queueType,"queuePriority":$var_queuePriority,"queueRetries":$var_queueRetries,"queueRetrydelay":$var_queueRetrydelay,"queueMaxparallel":$var_queueMaxparallel,"queueKeepJobs":$var_queueKeepJobs,"queuePreferRunOnCreationInstance":$var_queuePreferRunOnCreationInstance,"queueThreadPoolSize":$var_queueThreadPoolSize,"serviceRanking":$var_serviceRanking
        | }
        """.stripMargin
}
