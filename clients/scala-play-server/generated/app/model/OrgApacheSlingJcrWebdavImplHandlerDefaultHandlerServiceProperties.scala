package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for orgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties(
  serviceRanking: Option[ConfigNodePropertyInteger],
  typeCollections: Option[ConfigNodePropertyString],
  typeNoncollections: Option[ConfigNodePropertyString],
  typeContent: Option[ConfigNodePropertyString]
)

object OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties {
  implicit lazy val orgApacheSlingJcrWebdavImplHandlerDefaultHandlerServicePropertiesJsonFormat: Format[OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties] = Json.format[OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties]
}

