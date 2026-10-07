
package org.openapitools.client.model


case class ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties (
    _htmllibmanagerTiming: Option[ConfigNodePropertyBoolean],
    _htmllibmanagerDebugInitJs: Option[ConfigNodePropertyString],
    _htmllibmanagerMinify: Option[ConfigNodePropertyBoolean],
    _htmllibmanagerDebug: Option[ConfigNodePropertyBoolean],
    _htmllibmanagerGzip: Option[ConfigNodePropertyBoolean],
    _htmllibmanagerMaxDataUriSize: Option[ConfigNodePropertyInteger],
    _htmllibmanagerMaxage: Option[ConfigNodePropertyInteger],
    _htmllibmanagerForceCQUrlInfo: Option[ConfigNodePropertyBoolean],
    _htmllibmanagerDefaultthemename: Option[ConfigNodePropertyString],
    _htmllibmanagerDefaultuserthemename: Option[ConfigNodePropertyString],
    _htmllibmanagerClientmanager: Option[ConfigNodePropertyString],
    _htmllibmanagerPathList: Option[ConfigNodePropertyArray],
    _htmllibmanagerExcludedPathList: Option[ConfigNodePropertyArray],
    _htmllibmanagerProcessorJs: Option[ConfigNodePropertyArray],
    _htmllibmanagerProcessorCss: Option[ConfigNodePropertyArray],
    _htmllibmanagerLongcachePatterns: Option[ConfigNodePropertyArray],
    _htmllibmanagerLongcacheFormat: Option[ConfigNodePropertyString],
    _htmllibmanagerUseFileSystemOutputCache: Option[ConfigNodePropertyBoolean],
    _htmllibmanagerFileSystemOutputCacheLocation: Option[ConfigNodePropertyString],
    _htmllibmanagerDisableReplacement: Option[ConfigNodePropertyArray]
)
object ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties {
    def toStringBody(var_htmllibmanagerTiming: Object, var_htmllibmanagerDebugInitJs: Object, var_htmllibmanagerMinify: Object, var_htmllibmanagerDebug: Object, var_htmllibmanagerGzip: Object, var_htmllibmanagerMaxDataUriSize: Object, var_htmllibmanagerMaxage: Object, var_htmllibmanagerForceCQUrlInfo: Object, var_htmllibmanagerDefaultthemename: Object, var_htmllibmanagerDefaultuserthemename: Object, var_htmllibmanagerClientmanager: Object, var_htmllibmanagerPathList: Object, var_htmllibmanagerExcludedPathList: Object, var_htmllibmanagerProcessorJs: Object, var_htmllibmanagerProcessorCss: Object, var_htmllibmanagerLongcachePatterns: Object, var_htmllibmanagerLongcacheFormat: Object, var_htmllibmanagerUseFileSystemOutputCache: Object, var_htmllibmanagerFileSystemOutputCacheLocation: Object, var_htmllibmanagerDisableReplacement: Object) =
        s"""
        | {
        | "htmllibmanagerTiming":$var_htmllibmanagerTiming,"htmllibmanagerDebugInitJs":$var_htmllibmanagerDebugInitJs,"htmllibmanagerMinify":$var_htmllibmanagerMinify,"htmllibmanagerDebug":$var_htmllibmanagerDebug,"htmllibmanagerGzip":$var_htmllibmanagerGzip,"htmllibmanagerMaxDataUriSize":$var_htmllibmanagerMaxDataUriSize,"htmllibmanagerMaxage":$var_htmllibmanagerMaxage,"htmllibmanagerForceCQUrlInfo":$var_htmllibmanagerForceCQUrlInfo,"htmllibmanagerDefaultthemename":$var_htmllibmanagerDefaultthemename,"htmllibmanagerDefaultuserthemename":$var_htmllibmanagerDefaultuserthemename,"htmllibmanagerClientmanager":$var_htmllibmanagerClientmanager,"htmllibmanagerPathList":$var_htmllibmanagerPathList,"htmllibmanagerExcludedPathList":$var_htmllibmanagerExcludedPathList,"htmllibmanagerProcessorJs":$var_htmllibmanagerProcessorJs,"htmllibmanagerProcessorCss":$var_htmllibmanagerProcessorCss,"htmllibmanagerLongcachePatterns":$var_htmllibmanagerLongcachePatterns,"htmllibmanagerLongcacheFormat":$var_htmllibmanagerLongcacheFormat,"htmllibmanagerUseFileSystemOutputCache":$var_htmllibmanagerUseFileSystemOutputCache,"htmllibmanagerFileSystemOutputCacheLocation":$var_htmllibmanagerFileSystemOutputCacheLocation,"htmllibmanagerDisableReplacement":$var_htmllibmanagerDisableReplacement
        | }
        """.stripMargin
}
