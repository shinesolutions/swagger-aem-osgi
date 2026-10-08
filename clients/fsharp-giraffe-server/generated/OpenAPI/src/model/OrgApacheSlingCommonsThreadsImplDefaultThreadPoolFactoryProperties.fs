namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyDropDown
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties =

  //#region OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties


  type orgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties = {
    Name : ConfigNodePropertyString;
    MinPoolSize : ConfigNodePropertyInteger;
    MaxPoolSize : ConfigNodePropertyInteger;
    QueueSize : ConfigNodePropertyInteger;
    MaxThreadAge : ConfigNodePropertyInteger;
    KeepAliveTime : ConfigNodePropertyInteger;
    BlockPolicy : ConfigNodePropertyDropDown;
    ShutdownGraceful : ConfigNodePropertyBoolean;
    Daemon : ConfigNodePropertyBoolean;
    ShutdownWaitTime : ConfigNodePropertyInteger;
    Priority : ConfigNodePropertyDropDown;
  }
  //#endregion
