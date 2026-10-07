
package org.openapitools.client.model


case class ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties (
    _formsManagerConfigIncludeOOTBTemplates: Option[ConfigNodePropertyBoolean],
    _formsManagerConfigIncludeDeprecatedTemplates: Option[ConfigNodePropertyBoolean]
)
object ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties {
    def toStringBody(var_formsManagerConfigIncludeOOTBTemplates: Object, var_formsManagerConfigIncludeDeprecatedTemplates: Object) =
        s"""
        | {
        | "formsManagerConfigIncludeOOTBTemplates":$var_formsManagerConfigIncludeOOTBTemplates,"formsManagerConfigIncludeDeprecatedTemplates":$var_formsManagerConfigIncludeDeprecatedTemplates
        | }
        """.stripMargin
}
