package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties(
  serviceRanking: Option[ConfigNodePropertyInteger],
  globalSize: Option[ConfigNodePropertyInteger],
  maxDiskUsage: Option[ConfigNodePropertyInteger],
  persistenceEnabled: Option[ConfigNodePropertyBoolean],
  threadPoolMaxSize: Option[ConfigNodePropertyInteger],
  scheduledThreadPoolMaxSize: Option[ConfigNodePropertyInteger],
  gracefulShutdownTimeout: Option[ConfigNodePropertyInteger],
  queues: Option[ConfigNodePropertyArray],
  topics: Option[ConfigNodePropertyArray],
  addressesMaxDeliveryAttempts: Option[ConfigNodePropertyInteger],
  addressesExpiryDelay: Option[ConfigNodePropertyInteger],
  addressesAddressFullMessagePolicy: Option[ConfigNodePropertyDropDown],
  addressesMaxSizeBytes: Option[ConfigNodePropertyInteger],
  addressesPageSizeBytes: Option[ConfigNodePropertyInteger],
  addressesPageCacheMaxSize: Option[ConfigNodePropertyInteger],
  clusterUser: Option[ConfigNodePropertyString],
  clusterPassword: Option[ConfigNodePropertyString],
  clusterCallTimeout: Option[ConfigNodePropertyInteger],
  clusterCallFailoverTimeout: Option[ConfigNodePropertyInteger],
  clusterClientFailureCheckPeriod: Option[ConfigNodePropertyInteger],
  clusterNotificationAttempts: Option[ConfigNodePropertyInteger],
  clusterNotificationInterval: Option[ConfigNodePropertyInteger],
  idCacheSize: Option[ConfigNodePropertyInteger],
  clusterConfirmationWindowSize: Option[ConfigNodePropertyInteger],
  clusterConnectionTtl: Option[ConfigNodePropertyInteger],
  clusterDuplicateDetection: Option[ConfigNodePropertyBoolean],
  clusterInitialConnectAttempts: Option[ConfigNodePropertyInteger],
  clusterMaxRetryInterval: Option[ConfigNodePropertyInteger],
  clusterMinLargeMessageSize: Option[ConfigNodePropertyInteger],
  clusterProducerWindowSize: Option[ConfigNodePropertyInteger],
  clusterReconnectAttempts: Option[ConfigNodePropertyInteger],
  clusterRetryInterval: Option[ConfigNodePropertyInteger],
  clusterRetryIntervalMultiplier: Option[ConfigNodePropertyFloat]
)

object ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties {
  implicit lazy val comAdobeCqScreensMqActivemqImplArtemisJMSProviderPropertiesJsonFormat: Format[ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties] = Json.format[ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties]
}

