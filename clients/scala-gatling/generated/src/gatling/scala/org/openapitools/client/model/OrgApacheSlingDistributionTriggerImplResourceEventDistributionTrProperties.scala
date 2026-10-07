
package org.openapitools.client.model


case class OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrProperties (
    _name: Option[ConfigNodePropertyString],
    _path: Option[ConfigNodePropertyString]
)
object OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrProperties {
    def toStringBody(var_name: Object, var_path: Object) =
        s"""
        | {
        | "name":$var_name,"path":$var_path
        | }
        """.stripMargin
}
