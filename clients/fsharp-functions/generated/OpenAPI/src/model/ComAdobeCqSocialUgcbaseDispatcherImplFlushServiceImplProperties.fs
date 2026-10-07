namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyInteger

module ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties =

  //#region ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties

  [<CLIMutable>]
  type ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties = {
    [<JsonProperty(PropertyName = "threadPoolSize")>]
    ThreadPoolSize : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "delayTime")>]
    DelayTime : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "workerSleepTime")>]
    WorkerSleepTime : ConfigNodePropertyInteger;
  }

  //#endregion
