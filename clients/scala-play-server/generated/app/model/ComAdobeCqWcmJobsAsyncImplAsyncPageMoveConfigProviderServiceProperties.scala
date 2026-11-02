package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-02T01:20:33.584884879Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties(
  threshold: Option[ConfigNodePropertyInteger],
  jobTopicName: Option[ConfigNodePropertyString],
  emailEnabled: Option[ConfigNodePropertyBoolean]
)

object ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties {
  implicit lazy val comAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServicePropertiesJsonFormat: Format[ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties] = Json.format[ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties]
}

