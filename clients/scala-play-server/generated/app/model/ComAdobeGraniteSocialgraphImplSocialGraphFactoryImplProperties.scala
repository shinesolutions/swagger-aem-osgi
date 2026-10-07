package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties(
  group2memberRelationshipOutgoing: Option[ConfigNodePropertyString],
  group2memberExcludedOutgoing: Option[ConfigNodePropertyArray],
  group2memberRelationshipIncoming: Option[ConfigNodePropertyString],
  group2memberExcludedIncoming: Option[ConfigNodePropertyArray]
)

object ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties {
  implicit lazy val comAdobeGraniteSocialgraphImplSocialGraphFactoryImplPropertiesJsonFormat: Format[ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties] = Json.format[ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties]
}

