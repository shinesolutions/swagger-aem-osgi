
package org.openapitools.client.model


case class OrgApacheSlingHcCoreImplScriptableHealthCheckProperties (
    _hcName: Option[ConfigNodePropertyString],
    _hcTags: Option[ConfigNodePropertyArray],
    _hcMbeanName: Option[ConfigNodePropertyString],
    _expression: Option[ConfigNodePropertyString],
    _languageExtension: Option[ConfigNodePropertyString]
)
object OrgApacheSlingHcCoreImplScriptableHealthCheckProperties {
    def toStringBody(var_hcName: Object, var_hcTags: Object, var_hcMbeanName: Object, var_expression: Object, var_languageExtension: Object) =
        s"""
        | {
        | "hcName":$var_hcName,"hcTags":$var_hcTags,"hcMbeanName":$var_hcMbeanName,"expression":$var_expression,"languageExtension":$var_languageExtension
        | }
        """.stripMargin
}
