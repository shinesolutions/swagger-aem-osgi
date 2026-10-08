package org.openapitools.server.model


/**
 * @param linkcheckertransformerDisableRewriting  for example: ''null''
 * @param linkcheckertransformerDisableChecking  for example: ''null''
 * @param linkcheckertransformerMapCacheSize  for example: ''null''
 * @param linkcheckertransformerStrictExtensionCheck  for example: ''null''
 * @param linkcheckertransformerStripHtmltExtension  for example: ''null''
 * @param linkcheckertransformerRewriteElements  for example: ''null''
 * @param linkcheckertransformerStripExtensionPathBlacklist  for example: ''null''
*/
final case class ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties (
  linkcheckertransformerDisableRewriting: Option[ConfigNodePropertyBoolean] = None,
  linkcheckertransformerDisableChecking: Option[ConfigNodePropertyBoolean] = None,
  linkcheckertransformerMapCacheSize: Option[ConfigNodePropertyInteger] = None,
  linkcheckertransformerStrictExtensionCheck: Option[ConfigNodePropertyBoolean] = None,
  linkcheckertransformerStripHtmltExtension: Option[ConfigNodePropertyBoolean] = None,
  linkcheckertransformerRewriteElements: Option[ConfigNodePropertyArray] = None,
  linkcheckertransformerStripExtensionPathBlacklist: Option[ConfigNodePropertyArray] = None
)

