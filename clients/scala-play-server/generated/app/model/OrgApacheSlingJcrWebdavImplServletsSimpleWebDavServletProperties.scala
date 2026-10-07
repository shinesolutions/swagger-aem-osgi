package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for orgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties(
  davRoot: Option[ConfigNodePropertyString],
  davCreateAbsoluteUri: Option[ConfigNodePropertyBoolean],
  davRealm: Option[ConfigNodePropertyString],
  collectionTypes: Option[ConfigNodePropertyArray],
  filterPrefixes: Option[ConfigNodePropertyArray],
  filterTypes: Option[ConfigNodePropertyString],
  filterUris: Option[ConfigNodePropertyString],
  typeCollections: Option[ConfigNodePropertyString],
  typeNoncollections: Option[ConfigNodePropertyString],
  typeContent: Option[ConfigNodePropertyString]
)

object OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties {
  implicit lazy val orgApacheSlingJcrWebdavImplServletsSimpleWebDavServletPropertiesJsonFormat: Format[OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties] = Json.format[OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties]
}

