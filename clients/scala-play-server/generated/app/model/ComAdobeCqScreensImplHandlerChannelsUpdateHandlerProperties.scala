package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties(
  cqPagesupdatehandlerImageresourcetypes: Option[ConfigNodePropertyArray],
  cqPagesupdatehandlerProductresourcetypes: Option[ConfigNodePropertyArray],
  cqPagesupdatehandlerVideoresourcetypes: Option[ConfigNodePropertyArray],
  cqPagesupdatehandlerDynamicsequenceresourcetypes: Option[ConfigNodePropertyArray],
  cqPagesupdatehandlerPreviewmodepaths: Option[ConfigNodePropertyArray]
)

object ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties {
  implicit lazy val comAdobeCqScreensImplHandlerChannelsUpdateHandlerPropertiesJsonFormat: Format[ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties] = Json.format[ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties]
}

