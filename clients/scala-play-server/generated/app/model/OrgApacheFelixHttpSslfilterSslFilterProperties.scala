package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for orgApacheFelixHttpSslfilterSslFilterProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-02T01:20:33.584884879Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class OrgApacheFelixHttpSslfilterSslFilterProperties(
  sslForwardHeader: Option[ConfigNodePropertyString],
  sslForwardValue: Option[ConfigNodePropertyString],
  sslForwardCertHeader: Option[ConfigNodePropertyString],
  rewriteAbsoluteUrls: Option[ConfigNodePropertyBoolean]
)

object OrgApacheFelixHttpSslfilterSslFilterProperties {
  implicit lazy val orgApacheFelixHttpSslfilterSslFilterPropertiesJsonFormat: Format[OrgApacheFelixHttpSslfilterSslFilterProperties] = Json.format[OrgApacheFelixHttpSslfilterSslFilterProperties]
}

