package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import OrgApacheSlingDatasourceDataSourceFactoryProperties._

case class OrgApacheSlingDatasourceDataSourceFactoryProperties (
  datasourceName: Option[ConfigNodePropertyString],
datasourceSvcPropName: Option[ConfigNodePropertyString],
driverClassName: Option[ConfigNodePropertyString],
url: Option[ConfigNodePropertyString],
username: Option[ConfigNodePropertyString],
password: Option[ConfigNodePropertyString],
defaultAutoCommit: Option[ConfigNodePropertyDropDown],
defaultReadOnly: Option[ConfigNodePropertyDropDown],
defaultTransactionIsolation: Option[ConfigNodePropertyDropDown],
defaultCatalog: Option[ConfigNodePropertyString],
maxActive: Option[ConfigNodePropertyInteger],
maxIdle: Option[ConfigNodePropertyInteger],
minIdle: Option[ConfigNodePropertyInteger],
initialSize: Option[ConfigNodePropertyInteger],
maxWait: Option[ConfigNodePropertyInteger],
maxAge: Option[ConfigNodePropertyInteger],
testOnBorrow: Option[ConfigNodePropertyBoolean],
testOnReturn: Option[ConfigNodePropertyBoolean],
testWhileIdle: Option[ConfigNodePropertyBoolean],
validationQuery: Option[ConfigNodePropertyString],
validationQueryTimeout: Option[ConfigNodePropertyInteger],
timeBetweenEvictionRunsMillis: Option[ConfigNodePropertyInteger],
minEvictableIdleTimeMillis: Option[ConfigNodePropertyInteger],
connectionProperties: Option[ConfigNodePropertyString],
initSQL: Option[ConfigNodePropertyString],
jdbcInterceptors: Option[ConfigNodePropertyString],
validationInterval: Option[ConfigNodePropertyInteger],
logValidationErrors: Option[ConfigNodePropertyBoolean],
datasourceSvcProperties: Option[ConfigNodePropertyArray])

object OrgApacheSlingDatasourceDataSourceFactoryProperties {
  import DateTimeCodecs._

  implicit val OrgApacheSlingDatasourceDataSourceFactoryPropertiesCodecJson: CodecJson[OrgApacheSlingDatasourceDataSourceFactoryProperties] = CodecJson.derive[OrgApacheSlingDatasourceDataSourceFactoryProperties]
  implicit val OrgApacheSlingDatasourceDataSourceFactoryPropertiesDecoder: EntityDecoder[OrgApacheSlingDatasourceDataSourceFactoryProperties] = jsonOf[OrgApacheSlingDatasourceDataSourceFactoryProperties]
  implicit val OrgApacheSlingDatasourceDataSourceFactoryPropertiesEncoder: EntityEncoder[OrgApacheSlingDatasourceDataSourceFactoryProperties] = jsonEncoderOf[OrgApacheSlingDatasourceDataSourceFactoryProperties]
}
