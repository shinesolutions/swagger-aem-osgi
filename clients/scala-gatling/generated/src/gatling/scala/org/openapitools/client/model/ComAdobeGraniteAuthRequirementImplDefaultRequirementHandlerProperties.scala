
package org.openapitools.client.model


case class ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties (
    _supportedPaths: Option[ConfigNodePropertyArray]
)
object ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties {
    def toStringBody(var_supportedPaths: Object) =
        s"""
        | {
        | "supportedPaths":$var_supportedPaths
        | }
        """.stripMargin
}
