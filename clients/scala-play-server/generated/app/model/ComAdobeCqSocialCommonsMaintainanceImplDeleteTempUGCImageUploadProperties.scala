package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties(
  numberOfDays: Option[ConfigNodePropertyInteger],
  ageOfFile: Option[ConfigNodePropertyInteger]
)

object ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties {
  implicit lazy val comAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadPropertiesJsonFormat: Format[ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties] = Json.format[ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties]
}

