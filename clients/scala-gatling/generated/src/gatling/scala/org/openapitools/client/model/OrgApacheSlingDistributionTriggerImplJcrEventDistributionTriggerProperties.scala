
package org.openapitools.client.model


case class OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties (
    _name: Option[ConfigNodePropertyString],
    _path: Option[ConfigNodePropertyString],
    _ignoredPathsPatterns: Option[ConfigNodePropertyArray],
    _serviceName: Option[ConfigNodePropertyString],
    _deep: Option[ConfigNodePropertyBoolean]
)
object OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties {
    def toStringBody(var_name: Object, var_path: Object, var_ignoredPathsPatterns: Object, var_serviceName: Object, var_deep: Object) =
        s"""
        | {
        | "name":$var_name,"path":$var_path,"ignoredPathsPatterns":$var_ignoredPathsPatterns,"serviceName":$var_serviceName,"deep":$var_deep
        | }
        """.stripMargin
}
