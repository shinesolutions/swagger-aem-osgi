
package org.openapitools.client.model


case class OrgApacheSlingEventImplJobsDefaultJobManagerProperties (
    _queuePriority: Option[ConfigNodePropertyDropDown],
    _queueRetries: Option[ConfigNodePropertyInteger],
    _queueRetrydelay: Option[ConfigNodePropertyInteger],
    _queueMaxparallel: Option[ConfigNodePropertyInteger]
)
object OrgApacheSlingEventImplJobsDefaultJobManagerProperties {
    def toStringBody(var_queuePriority: Object, var_queueRetries: Object, var_queueRetrydelay: Object, var_queueMaxparallel: Object) =
        s"""
        | {
        | "queuePriority":$var_queuePriority,"queueRetries":$var_queueRetries,"queueRetrydelay":$var_queueRetrydelay,"queueMaxparallel":$var_queueMaxparallel
        | }
        """.stripMargin
}
