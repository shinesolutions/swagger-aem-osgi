package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties(
  patternTime: Option[ConfigNodePropertyString],
  patternNewline: Option[ConfigNodePropertyString],
  patternDayOfMonth: Option[ConfigNodePropertyString],
  patternMonth: Option[ConfigNodePropertyString],
  patternYear: Option[ConfigNodePropertyString],
  patternDate: Option[ConfigNodePropertyString],
  patternDateTime: Option[ConfigNodePropertyString],
  patternEmail: Option[ConfigNodePropertyString]
)

object ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties {
  implicit lazy val comAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpPropertiesJsonFormat: Format[ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties] = Json.format[ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties]
}

