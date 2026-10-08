
package org.openapitools.client.model


case class OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties (
    _name: Option[ConfigNodePropertyString],
    _path: Option[ConfigNodePropertyString],
    _seconds: Option[ConfigNodePropertyString],
    _serviceName: Option[ConfigNodePropertyString]
)
object OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties {
    def toStringBody(var_name: Object, var_path: Object, var_seconds: Object, var_serviceName: Object) =
        s"""
        | {
        | "name":$var_name,"path":$var_path,"seconds":$var_seconds,"serviceName":$var_serviceName
        | }
        """.stripMargin
}
