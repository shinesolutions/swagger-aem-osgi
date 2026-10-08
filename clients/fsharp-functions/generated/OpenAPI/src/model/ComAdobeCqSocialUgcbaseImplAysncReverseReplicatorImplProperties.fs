namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyInteger

module ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties =

  //#region ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties

  [<CLIMutable>]
  type ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties = {
    [<JsonProperty(PropertyName = "poolSize")>]
    PoolSize : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "maxPoolSize")>]
    MaxPoolSize : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "queueSize")>]
    QueueSize : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "keepAliveTime")>]
    KeepAliveTime : ConfigNodePropertyInteger;
  }

  //#endregion
