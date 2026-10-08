
package org.openapitools.client.model


case class ComAdobeFormsCommonServiceImplDefaultDataProviderProperties (
    _alloweddataFileLocations: Option[ConfigNodePropertyArray]
)
object ComAdobeFormsCommonServiceImplDefaultDataProviderProperties {
    def toStringBody(var_alloweddataFileLocations: Object) =
        s"""
        | {
        | "alloweddataFileLocations":$var_alloweddataFileLocations
        | }
        """.stripMargin
}
