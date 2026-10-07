namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyString

module ComDayCqDamIdsImplIDSJobProcessorProperties =

  //#region ComDayCqDamIdsImplIDSJobProcessorProperties


  type comDayCqDamIdsImplIDSJobProcessorProperties = {
    EnableMultisession : ConfigNodePropertyBoolean;
    IdsCcEnable : ConfigNodePropertyBoolean;
    EnableRetry : ConfigNodePropertyBoolean;
    EnableRetryScripterror : ConfigNodePropertyBoolean;
    ExternalizerDomainCqhost : ConfigNodePropertyString;
    ExternalizerDomainHttp : ConfigNodePropertyString;
  }
  //#endregion
