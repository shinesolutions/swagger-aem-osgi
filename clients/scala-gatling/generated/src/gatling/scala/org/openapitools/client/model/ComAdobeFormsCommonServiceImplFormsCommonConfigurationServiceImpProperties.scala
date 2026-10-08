
package org.openapitools.client.model


case class ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties (
    _tempStorageConfig: Option[ConfigNodePropertyDropDown]
)
object ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties {
    def toStringBody(var_tempStorageConfig: Object) =
        s"""
        | {
        | "tempStorageConfig":$var_tempStorageConfig
        | }
        """.stripMargin
}
