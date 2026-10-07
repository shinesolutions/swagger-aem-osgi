package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties(
  serviceMaxLinksPerHost: Option[ConfigNodePropertyInteger],
  serviceSaveExternalLinkReferences: Option[ConfigNodePropertyBoolean]
)

object ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties {
  implicit lazy val comDayCqRewriterLinkcheckerImplLinkInfoStorageImplPropertiesJsonFormat: Format[ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties] = Json.format[ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties]
}

