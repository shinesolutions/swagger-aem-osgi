package org.openapitools.server.model


/**
 * @param serviceRanking  for example: ''null''
 * @param globalSize  for example: ''null''
 * @param maxDiskUsage  for example: ''null''
 * @param persistenceEnabled  for example: ''null''
 * @param threadPoolMaxSize  for example: ''null''
 * @param scheduledThreadPoolMaxSize  for example: ''null''
 * @param gracefulShutdownTimeout  for example: ''null''
 * @param queues  for example: ''null''
 * @param topics  for example: ''null''
 * @param addressesMaxDeliveryAttempts  for example: ''null''
 * @param addressesExpiryDelay  for example: ''null''
 * @param addressesAddressFullMessagePolicy  for example: ''null''
 * @param addressesMaxSizeBytes  for example: ''null''
 * @param addressesPageSizeBytes  for example: ''null''
 * @param addressesPageCacheMaxSize  for example: ''null''
 * @param clusterUser  for example: ''null''
 * @param clusterPassword  for example: ''null''
 * @param clusterCallTimeout  for example: ''null''
 * @param clusterCallFailoverTimeout  for example: ''null''
 * @param clusterClientFailureCheckPeriod  for example: ''null''
 * @param clusterNotificationAttempts  for example: ''null''
 * @param clusterNotificationInterval  for example: ''null''
 * @param idCacheSize  for example: ''null''
 * @param clusterConfirmationWindowSize  for example: ''null''
 * @param clusterConnectionTtl  for example: ''null''
 * @param clusterDuplicateDetection  for example: ''null''
 * @param clusterInitialConnectAttempts  for example: ''null''
 * @param clusterMaxRetryInterval  for example: ''null''
 * @param clusterMinLargeMessageSize  for example: ''null''
 * @param clusterProducerWindowSize  for example: ''null''
 * @param clusterReconnectAttempts  for example: ''null''
 * @param clusterRetryInterval  for example: ''null''
 * @param clusterRetryIntervalMultiplier  for example: ''null''
*/
final case class ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties (
  serviceRanking: Option[ConfigNodePropertyInteger] = None,
  globalSize: Option[ConfigNodePropertyInteger] = None,
  maxDiskUsage: Option[ConfigNodePropertyInteger] = None,
  persistenceEnabled: Option[ConfigNodePropertyBoolean] = None,
  threadPoolMaxSize: Option[ConfigNodePropertyInteger] = None,
  scheduledThreadPoolMaxSize: Option[ConfigNodePropertyInteger] = None,
  gracefulShutdownTimeout: Option[ConfigNodePropertyInteger] = None,
  queues: Option[ConfigNodePropertyArray] = None,
  topics: Option[ConfigNodePropertyArray] = None,
  addressesMaxDeliveryAttempts: Option[ConfigNodePropertyInteger] = None,
  addressesExpiryDelay: Option[ConfigNodePropertyInteger] = None,
  addressesAddressFullMessagePolicy: Option[ConfigNodePropertyDropDown] = None,
  addressesMaxSizeBytes: Option[ConfigNodePropertyInteger] = None,
  addressesPageSizeBytes: Option[ConfigNodePropertyInteger] = None,
  addressesPageCacheMaxSize: Option[ConfigNodePropertyInteger] = None,
  clusterUser: Option[ConfigNodePropertyString] = None,
  clusterPassword: Option[ConfigNodePropertyString] = None,
  clusterCallTimeout: Option[ConfigNodePropertyInteger] = None,
  clusterCallFailoverTimeout: Option[ConfigNodePropertyInteger] = None,
  clusterClientFailureCheckPeriod: Option[ConfigNodePropertyInteger] = None,
  clusterNotificationAttempts: Option[ConfigNodePropertyInteger] = None,
  clusterNotificationInterval: Option[ConfigNodePropertyInteger] = None,
  idCacheSize: Option[ConfigNodePropertyInteger] = None,
  clusterConfirmationWindowSize: Option[ConfigNodePropertyInteger] = None,
  clusterConnectionTtl: Option[ConfigNodePropertyInteger] = None,
  clusterDuplicateDetection: Option[ConfigNodePropertyBoolean] = None,
  clusterInitialConnectAttempts: Option[ConfigNodePropertyInteger] = None,
  clusterMaxRetryInterval: Option[ConfigNodePropertyInteger] = None,
  clusterMinLargeMessageSize: Option[ConfigNodePropertyInteger] = None,
  clusterProducerWindowSize: Option[ConfigNodePropertyInteger] = None,
  clusterReconnectAttempts: Option[ConfigNodePropertyInteger] = None,
  clusterRetryInterval: Option[ConfigNodePropertyInteger] = None,
  clusterRetryIntervalMultiplier: Option[ConfigNodePropertyFloat] = None
)

