package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties(
  portalOutboxes: Option[ConfigNodePropertyArray],
  draftDataService: Option[ConfigNodePropertyString],
  draftMetadataService: Option[ConfigNodePropertyString],
  submitDataService: Option[ConfigNodePropertyString],
  submitMetadataService: Option[ConfigNodePropertyString],
  pendingSignDataService: Option[ConfigNodePropertyString],
  pendingSignMetadataService: Option[ConfigNodePropertyString]
)

object ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties {
  implicit lazy val comAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServicePropertiesJsonFormat: Format[ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties] = Json.format[ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties]
}

