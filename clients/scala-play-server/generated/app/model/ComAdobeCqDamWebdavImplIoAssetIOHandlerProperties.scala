package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comAdobeCqDamWebdavImplIoAssetIOHandlerProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComAdobeCqDamWebdavImplIoAssetIOHandlerProperties(
  serviceRanking: Option[ConfigNodePropertyInteger],
  pathPrefix: Option[ConfigNodePropertyString],
  createVersion: Option[ConfigNodePropertyBoolean]
)

object ComAdobeCqDamWebdavImplIoAssetIOHandlerProperties {
  implicit lazy val comAdobeCqDamWebdavImplIoAssetIOHandlerPropertiesJsonFormat: Format[ComAdobeCqDamWebdavImplIoAssetIOHandlerProperties] = Json.format[ComAdobeCqDamWebdavImplIoAssetIOHandlerProperties]
}

