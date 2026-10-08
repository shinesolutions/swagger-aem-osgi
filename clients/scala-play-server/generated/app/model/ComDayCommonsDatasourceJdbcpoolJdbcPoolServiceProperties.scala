package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties(
  jdbcDriverClass: Option[ConfigNodePropertyString],
  jdbcConnectionUri: Option[ConfigNodePropertyString],
  jdbcUsername: Option[ConfigNodePropertyString],
  jdbcPassword: Option[ConfigNodePropertyString],
  jdbcValidationQuery: Option[ConfigNodePropertyString],
  defaultReadonly: Option[ConfigNodePropertyBoolean],
  defaultAutocommit: Option[ConfigNodePropertyBoolean],
  poolSize: Option[ConfigNodePropertyInteger],
  poolMaxWaitMsec: Option[ConfigNodePropertyInteger],
  datasourceName: Option[ConfigNodePropertyString],
  datasourceSvcProperties: Option[ConfigNodePropertyArray]
)

object ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties {
  implicit lazy val comDayCommonsDatasourceJdbcpoolJdbcPoolServicePropertiesJsonFormat: Format[ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties] = Json.format[ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties]
}

