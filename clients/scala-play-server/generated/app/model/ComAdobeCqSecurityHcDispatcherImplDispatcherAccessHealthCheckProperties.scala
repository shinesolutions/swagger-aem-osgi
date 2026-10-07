package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties(
  hcTags: Option[ConfigNodePropertyArray],
  dispatcherAddress: Option[ConfigNodePropertyString],
  dispatcherFilterAllowed: Option[ConfigNodePropertyArray],
  dispatcherFilterBlocked: Option[ConfigNodePropertyArray]
)

object ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties {
  implicit lazy val comAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckPropertiesJsonFormat: Format[ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties] = Json.format[ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties]
}

