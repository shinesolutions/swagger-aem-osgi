package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties(
  linkcheckertransformerDisableRewriting: Option[ConfigNodePropertyBoolean],
  linkcheckertransformerDisableChecking: Option[ConfigNodePropertyBoolean],
  linkcheckertransformerMapCacheSize: Option[ConfigNodePropertyInteger],
  linkcheckertransformerStrictExtensionCheck: Option[ConfigNodePropertyBoolean],
  linkcheckertransformerStripHtmltExtension: Option[ConfigNodePropertyBoolean],
  linkcheckertransformerRewriteElements: Option[ConfigNodePropertyArray],
  linkcheckertransformerStripExtensionPathBlacklist: Option[ConfigNodePropertyArray]
)

object ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties {
  implicit lazy val comDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryPropertiesJsonFormat: Format[ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties] = Json.format[ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties]
}

