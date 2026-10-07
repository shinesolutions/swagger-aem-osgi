
package org.openapitools.client.model


case class ComDayCqDamCoreImplServletResourceCollectionServletProperties (
    _slingServletResourceTypes: Option[ConfigNodePropertyArray],
    _slingServletMethods: Option[ConfigNodePropertyString],
    _slingServletSelectors: Option[ConfigNodePropertyString],
    _downloadConfig: Option[ConfigNodePropertyString],
    _viewSelector: Option[ConfigNodePropertyString],
    _sendEmail: Option[ConfigNodePropertyBoolean]
)
object ComDayCqDamCoreImplServletResourceCollectionServletProperties {
    def toStringBody(var_slingServletResourceTypes: Object, var_slingServletMethods: Object, var_slingServletSelectors: Object, var_downloadConfig: Object, var_viewSelector: Object, var_sendEmail: Object) =
        s"""
        | {
        | "slingServletResourceTypes":$var_slingServletResourceTypes,"slingServletMethods":$var_slingServletMethods,"slingServletSelectors":$var_slingServletSelectors,"downloadConfig":$var_downloadConfig,"viewSelector":$var_viewSelector,"sendEmail":$var_sendEmail
        | }
        """.stripMargin
}
