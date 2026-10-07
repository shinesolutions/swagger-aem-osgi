
package org.openapitools.client.model


case class ComDayCqDamCoreImplServletCompanionServletProperties (
    _moreInfo: Option[ConfigNodePropertyString],
    _mntOverlayDamGuiContentAssetsMoreinfoHtmlPath: Option[ConfigNodePropertyString]
)
object ComDayCqDamCoreImplServletCompanionServletProperties {
    def toStringBody(var_moreInfo: Object, var_mntOverlayDamGuiContentAssetsMoreinfoHtmlPath: Object) =
        s"""
        | {
        | "moreInfo":$var_moreInfo,"mntOverlayDamGuiContentAssetsMoreinfoHtmlPath":$var_mntOverlayDamGuiContentAssetsMoreinfoHtmlPath
        | }
        """.stripMargin
}
