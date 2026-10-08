namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyDropDown
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties =

  //#region OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties

  [<CLIMutable>]
  type OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties = {
    [<JsonProperty(PropertyName = "name")>]
    Name : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "minPoolSize")>]
    MinPoolSize : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "maxPoolSize")>]
    MaxPoolSize : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "queueSize")>]
    QueueSize : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "maxThreadAge")>]
    MaxThreadAge : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "keepAliveTime")>]
    KeepAliveTime : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "blockPolicy")>]
    BlockPolicy : ConfigNodePropertyDropDown;
    [<JsonProperty(PropertyName = "shutdownGraceful")>]
    ShutdownGraceful : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "daemon")>]
    Daemon : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "shutdownWaitTime")>]
    ShutdownWaitTime : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "priority")>]
    Priority : ConfigNodePropertyDropDown;
  }

  //#endregion
