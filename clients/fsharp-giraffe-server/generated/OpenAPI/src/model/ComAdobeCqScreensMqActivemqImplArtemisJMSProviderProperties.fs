namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyDropDown
open OpenAPI.Model.ConfigNodePropertyFloat
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties =

  //#region ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties


  type comAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties = {
    ServiceRanking : ConfigNodePropertyInteger;
    GlobalSize : ConfigNodePropertyInteger;
    MaxDiskUsage : ConfigNodePropertyInteger;
    PersistenceEnabled : ConfigNodePropertyBoolean;
    ThreadPoolMaxSize : ConfigNodePropertyInteger;
    ScheduledThreadPoolMaxSize : ConfigNodePropertyInteger;
    GracefulShutdownTimeout : ConfigNodePropertyInteger;
    Queues : ConfigNodePropertyArray;
    Topics : ConfigNodePropertyArray;
    AddressesMaxDeliveryAttempts : ConfigNodePropertyInteger;
    AddressesExpiryDelay : ConfigNodePropertyInteger;
    AddressesAddressFullMessagePolicy : ConfigNodePropertyDropDown;
    AddressesMaxSizeBytes : ConfigNodePropertyInteger;
    AddressesPageSizeBytes : ConfigNodePropertyInteger;
    AddressesPageCacheMaxSize : ConfigNodePropertyInteger;
    ClusterUser : ConfigNodePropertyString;
    ClusterPassword : ConfigNodePropertyString;
    ClusterCallTimeout : ConfigNodePropertyInteger;
    ClusterCallFailoverTimeout : ConfigNodePropertyInteger;
    ClusterClientFailureCheckPeriod : ConfigNodePropertyInteger;
    ClusterNotificationAttempts : ConfigNodePropertyInteger;
    ClusterNotificationInterval : ConfigNodePropertyInteger;
    IdCacheSize : ConfigNodePropertyInteger;
    ClusterConfirmationWindowSize : ConfigNodePropertyInteger;
    ClusterConnectionTtl : ConfigNodePropertyInteger;
    ClusterDuplicateDetection : ConfigNodePropertyBoolean;
    ClusterInitialConnectAttempts : ConfigNodePropertyInteger;
    ClusterMaxRetryInterval : ConfigNodePropertyInteger;
    ClusterMinLargeMessageSize : ConfigNodePropertyInteger;
    ClusterProducerWindowSize : ConfigNodePropertyInteger;
    ClusterReconnectAttempts : ConfigNodePropertyInteger;
    ClusterRetryInterval : ConfigNodePropertyInteger;
    ClusterRetryIntervalMultiplier : ConfigNodePropertyFloat;
  }
  //#endregion
