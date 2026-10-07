
package org.openapitools.client.model


case class ComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties (
    _defaultConnectorName: Option[ConfigNodePropertyString],
    _defaultCategory: Option[ConfigNodePropertyString]
)
object ComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties {
    def toStringBody(var_defaultConnectorName: Object, var_defaultCategory: Object) =
        s"""
        | {
        | "defaultConnectorName":$var_defaultConnectorName,"defaultCategory":$var_defaultCategory
        | }
        """.stripMargin
}
