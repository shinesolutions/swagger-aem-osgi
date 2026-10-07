namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyString

module ComDayCqDamIdsImplIDSJobProcessorProperties =

  //#region ComDayCqDamIdsImplIDSJobProcessorProperties

  [<CLIMutable>]
  type ComDayCqDamIdsImplIDSJobProcessorProperties = {
    [<JsonProperty(PropertyName = "enable.multisession")>]
    EnableMultisession : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "ids.cc.enable")>]
    IdsCcEnable : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "enable.retry")>]
    EnableRetry : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "enable.retry.scripterror")>]
    EnableRetryScripterror : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "externalizer.domain.cqhost")>]
    ExternalizerDomainCqhost : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "externalizer.domain.http")>]
    ExternalizerDomainHttp : ConfigNodePropertyString;
  }

  //#endregion
