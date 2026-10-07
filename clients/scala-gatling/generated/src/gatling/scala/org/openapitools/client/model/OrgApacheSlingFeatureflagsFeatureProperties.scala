
package org.openapitools.client.model


case class OrgApacheSlingFeatureflagsFeatureProperties (
    _name: Option[ConfigNodePropertyString],
    _description: Option[ConfigNodePropertyString],
    _enabled: Option[ConfigNodePropertyBoolean]
)
object OrgApacheSlingFeatureflagsFeatureProperties {
    def toStringBody(var_name: Object, var_description: Object, var_enabled: Object) =
        s"""
        | {
        | "name":$var_name,"description":$var_description,"enabled":$var_enabled
        | }
        """.stripMargin
}
