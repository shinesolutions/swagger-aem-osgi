
package org.openapitools.client.model


case class ComDayCqDamCoreImplServletMetadataGetServletProperties (
    _slingServletResourceTypes: Option[ConfigNodePropertyString],
    _slingServletMethods: Option[ConfigNodePropertyString],
    _slingServletExtensions: Option[ConfigNodePropertyString],
    _slingServletSelectors: Option[ConfigNodePropertyString]
)
object ComDayCqDamCoreImplServletMetadataGetServletProperties {
    def toStringBody(var_slingServletResourceTypes: Object, var_slingServletMethods: Object, var_slingServletExtensions: Object, var_slingServletSelectors: Object) =
        s"""
        | {
        | "slingServletResourceTypes":$var_slingServletResourceTypes,"slingServletMethods":$var_slingServletMethods,"slingServletExtensions":$var_slingServletExtensions,"slingServletSelectors":$var_slingServletSelectors
        | }
        """.stripMargin
}
