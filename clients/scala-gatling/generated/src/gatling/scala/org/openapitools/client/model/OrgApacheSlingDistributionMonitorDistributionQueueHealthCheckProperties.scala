
package org.openapitools.client.model


case class OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties (
    _hcName: Option[ConfigNodePropertyString],
    _hcTags: Option[ConfigNodePropertyArray],
    _hcMbeanName: Option[ConfigNodePropertyString],
    _numberOfRetriesAllowed: Option[ConfigNodePropertyInteger]
)
object OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties {
    def toStringBody(var_hcName: Object, var_hcTags: Object, var_hcMbeanName: Object, var_numberOfRetriesAllowed: Object) =
        s"""
        | {
        | "hcName":$var_hcName,"hcTags":$var_hcTags,"hcMbeanName":$var_hcMbeanName,"numberOfRetriesAllowed":$var_numberOfRetriesAllowed
        | }
        """.stripMargin
}
