
package org.openapitools.client.model


case class ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties (
    _linkcheckertransformerDisableRewriting: Option[ConfigNodePropertyBoolean],
    _linkcheckertransformerDisableChecking: Option[ConfigNodePropertyBoolean],
    _linkcheckertransformerMapCacheSize: Option[ConfigNodePropertyInteger],
    _linkcheckertransformerStrictExtensionCheck: Option[ConfigNodePropertyBoolean],
    _linkcheckertransformerStripHtmltExtension: Option[ConfigNodePropertyBoolean],
    _linkcheckertransformerRewriteElements: Option[ConfigNodePropertyArray],
    _linkcheckertransformerStripExtensionPathBlacklist: Option[ConfigNodePropertyArray]
)
object ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties {
    def toStringBody(var_linkcheckertransformerDisableRewriting: Object, var_linkcheckertransformerDisableChecking: Object, var_linkcheckertransformerMapCacheSize: Object, var_linkcheckertransformerStrictExtensionCheck: Object, var_linkcheckertransformerStripHtmltExtension: Object, var_linkcheckertransformerRewriteElements: Object, var_linkcheckertransformerStripExtensionPathBlacklist: Object) =
        s"""
        | {
        | "linkcheckertransformerDisableRewriting":$var_linkcheckertransformerDisableRewriting,"linkcheckertransformerDisableChecking":$var_linkcheckertransformerDisableChecking,"linkcheckertransformerMapCacheSize":$var_linkcheckertransformerMapCacheSize,"linkcheckertransformerStrictExtensionCheck":$var_linkcheckertransformerStrictExtensionCheck,"linkcheckertransformerStripHtmltExtension":$var_linkcheckertransformerStripHtmltExtension,"linkcheckertransformerRewriteElements":$var_linkcheckertransformerRewriteElements,"linkcheckertransformerStripExtensionPathBlacklist":$var_linkcheckertransformerStripExtensionPathBlacklist
        | }
        """.stripMargin
}
