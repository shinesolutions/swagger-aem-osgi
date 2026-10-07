package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiProperties(
  fieldWhitelist: Option[ConfigNodePropertyArray],
  attachmentTypeBlacklist: Option[ConfigNodePropertyArray]
)

object ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiProperties {
  implicit lazy val comAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiPropertiesJsonFormat: Format[ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiProperties] = Json.format[ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiProperties]
}

