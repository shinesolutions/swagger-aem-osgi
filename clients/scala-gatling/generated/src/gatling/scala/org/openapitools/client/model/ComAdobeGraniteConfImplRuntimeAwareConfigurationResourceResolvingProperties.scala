
package org.openapitools.client.model


case class ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties (
    _enabled: Option[ConfigNodePropertyBoolean],
    _fallbackPaths: Option[ConfigNodePropertyArray]
)
object ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties {
    def toStringBody(var_enabled: Object, var_fallbackPaths: Object) =
        s"""
        | {
        | "enabled":$var_enabled,"fallbackPaths":$var_fallbackPaths
        | }
        """.stripMargin
}
