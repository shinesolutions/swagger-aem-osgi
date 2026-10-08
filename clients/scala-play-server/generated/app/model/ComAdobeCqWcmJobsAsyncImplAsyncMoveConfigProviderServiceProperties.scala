package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties(
  threshold: Option[ConfigNodePropertyInteger],
  jobTopicName: Option[ConfigNodePropertyString],
  emailEnabled: Option[ConfigNodePropertyBoolean]
)

object ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties {
  implicit lazy val comAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServicePropertiesJsonFormat: Format[ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties] = Json.format[ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties]
}

