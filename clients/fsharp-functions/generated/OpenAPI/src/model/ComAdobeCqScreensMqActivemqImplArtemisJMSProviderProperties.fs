namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyDropDown
open OpenAPI.Model.ConfigNodePropertyFloat
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties =

  //#region ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties

  [<CLIMutable>]
  type ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties = {
    [<JsonProperty(PropertyName = "service.ranking")>]
    ServiceRanking : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "global.size")>]
    GlobalSize : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "max.disk.usage")>]
    MaxDiskUsage : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "persistence.enabled")>]
    PersistenceEnabled : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "thread.pool.max.size")>]
    ThreadPoolMaxSize : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "scheduled.thread.pool.max.size")>]
    ScheduledThreadPoolMaxSize : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "graceful.shutdown.timeout")>]
    GracefulShutdownTimeout : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "queues")>]
    Queues : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "topics")>]
    Topics : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "addresses.max.delivery.attempts")>]
    AddressesMaxDeliveryAttempts : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "addresses.expiry.delay")>]
    AddressesExpiryDelay : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "addresses.address.full.message.policy")>]
    AddressesAddressFullMessagePolicy : ConfigNodePropertyDropDown;
    [<JsonProperty(PropertyName = "addresses.max.size.bytes")>]
    AddressesMaxSizeBytes : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "addresses.page.size.bytes")>]
    AddressesPageSizeBytes : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "addresses.page.cache.max.size")>]
    AddressesPageCacheMaxSize : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "cluster.user")>]
    ClusterUser : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "cluster.password")>]
    ClusterPassword : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "cluster.call.timeout")>]
    ClusterCallTimeout : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "cluster.call.failover.timeout")>]
    ClusterCallFailoverTimeout : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "cluster.client.failure.check.period")>]
    ClusterClientFailureCheckPeriod : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "cluster.notification.attempts")>]
    ClusterNotificationAttempts : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "cluster.notification.interval")>]
    ClusterNotificationInterval : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "id.cache.size")>]
    IdCacheSize : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "cluster.confirmation.window.size")>]
    ClusterConfirmationWindowSize : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "cluster.connection.ttl")>]
    ClusterConnectionTtl : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "cluster.duplicate.detection")>]
    ClusterDuplicateDetection : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "cluster.initial.connect.attempts")>]
    ClusterInitialConnectAttempts : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "cluster.max.retry.interval")>]
    ClusterMaxRetryInterval : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "cluster.min.large.message.size")>]
    ClusterMinLargeMessageSize : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "cluster.producer.window.size")>]
    ClusterProducerWindowSize : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "cluster.reconnect.attempts")>]
    ClusterReconnectAttempts : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "cluster.retry.interval")>]
    ClusterRetryInterval : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "cluster.retry.interval.multiplier")>]
    ClusterRetryIntervalMultiplier : ConfigNodePropertyFloat;
  }

  //#endregion
