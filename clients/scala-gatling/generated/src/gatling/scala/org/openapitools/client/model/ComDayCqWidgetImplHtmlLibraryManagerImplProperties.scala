
package org.openapitools.client.model


case class ComDayCqWidgetImplHtmlLibraryManagerImplProperties (
    _htmllibmanagerClientmanager: Option[ConfigNodePropertyString],
    _htmllibmanagerDebug: Option[ConfigNodePropertyBoolean],
    _htmllibmanagerDebugConsole: Option[ConfigNodePropertyBoolean],
    _htmllibmanagerDebugInitJs: Option[ConfigNodePropertyString],
    _htmllibmanagerDefaultthemename: Option[ConfigNodePropertyString],
    _htmllibmanagerDefaultuserthemename: Option[ConfigNodePropertyString],
    _htmllibmanagerFirebuglitePath: Option[ConfigNodePropertyString],
    _htmllibmanagerForceCQUrlInfo: Option[ConfigNodePropertyBoolean],
    _htmllibmanagerGzip: Option[ConfigNodePropertyBoolean],
    _htmllibmanagerMaxage: Option[ConfigNodePropertyInteger],
    _htmllibmanagerMaxDataUriSize: Option[ConfigNodePropertyInteger],
    _htmllibmanagerMinify: Option[ConfigNodePropertyBoolean],
    _htmllibmanagerPathList: Option[ConfigNodePropertyArray],
    _htmllibmanagerTiming: Option[ConfigNodePropertyBoolean]
)
object ComDayCqWidgetImplHtmlLibraryManagerImplProperties {
    def toStringBody(var_htmllibmanagerClientmanager: Object, var_htmllibmanagerDebug: Object, var_htmllibmanagerDebugConsole: Object, var_htmllibmanagerDebugInitJs: Object, var_htmllibmanagerDefaultthemename: Object, var_htmllibmanagerDefaultuserthemename: Object, var_htmllibmanagerFirebuglitePath: Object, var_htmllibmanagerForceCQUrlInfo: Object, var_htmllibmanagerGzip: Object, var_htmllibmanagerMaxage: Object, var_htmllibmanagerMaxDataUriSize: Object, var_htmllibmanagerMinify: Object, var_htmllibmanagerPathList: Object, var_htmllibmanagerTiming: Object) =
        s"""
        | {
        | "htmllibmanagerClientmanager":$var_htmllibmanagerClientmanager,"htmllibmanagerDebug":$var_htmllibmanagerDebug,"htmllibmanagerDebugConsole":$var_htmllibmanagerDebugConsole,"htmllibmanagerDebugInitJs":$var_htmllibmanagerDebugInitJs,"htmllibmanagerDefaultthemename":$var_htmllibmanagerDefaultthemename,"htmllibmanagerDefaultuserthemename":$var_htmllibmanagerDefaultuserthemename,"htmllibmanagerFirebuglitePath":$var_htmllibmanagerFirebuglitePath,"htmllibmanagerForceCQUrlInfo":$var_htmllibmanagerForceCQUrlInfo,"htmllibmanagerGzip":$var_htmllibmanagerGzip,"htmllibmanagerMaxage":$var_htmllibmanagerMaxage,"htmllibmanagerMaxDataUriSize":$var_htmllibmanagerMaxDataUriSize,"htmllibmanagerMinify":$var_htmllibmanagerMinify,"htmllibmanagerPathList":$var_htmllibmanagerPathList,"htmllibmanagerTiming":$var_htmllibmanagerTiming
        | }
        """.stripMargin
}
