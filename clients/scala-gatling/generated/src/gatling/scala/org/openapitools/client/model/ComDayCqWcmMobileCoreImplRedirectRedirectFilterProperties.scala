
package org.openapitools.client.model


case class ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties (
    _redirectEnabled: Option[ConfigNodePropertyBoolean],
    _redirectStatsEnabled: Option[ConfigNodePropertyBoolean],
    _redirectExtensions: Option[ConfigNodePropertyArray],
    _redirectPaths: Option[ConfigNodePropertyArray]
)
object ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties {
    def toStringBody(var_redirectEnabled: Object, var_redirectStatsEnabled: Object, var_redirectExtensions: Object, var_redirectPaths: Object) =
        s"""
        | {
        | "redirectEnabled":$var_redirectEnabled,"redirectStatsEnabled":$var_redirectStatsEnabled,"redirectExtensions":$var_redirectExtensions,"redirectPaths":$var_redirectPaths
        | }
        """.stripMargin
}
