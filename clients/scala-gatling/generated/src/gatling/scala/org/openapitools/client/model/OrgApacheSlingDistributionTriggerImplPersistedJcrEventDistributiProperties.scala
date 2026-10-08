
package org.openapitools.client.model


case class OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties (
    _name: Option[ConfigNodePropertyString],
    _path: Option[ConfigNodePropertyString],
    _serviceName: Option[ConfigNodePropertyString],
    _nuggetsPath: Option[ConfigNodePropertyString]
)
object OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties {
    def toStringBody(var_name: Object, var_path: Object, var_serviceName: Object, var_nuggetsPath: Object) =
        s"""
        | {
        | "name":$var_name,"path":$var_path,"serviceName":$var_serviceName,"nuggetsPath":$var_nuggetsPath
        | }
        """.stripMargin
}
