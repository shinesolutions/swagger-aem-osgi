namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.OrgApacheSlingEngineImplLogRequestLoggerServiceProperties

module OrgApacheSlingEngineImplLogRequestLoggerServiceInfo =

  //#region OrgApacheSlingEngineImplLogRequestLoggerServiceInfo

  [<CLIMutable>]
  type OrgApacheSlingEngineImplLogRequestLoggerServiceInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : OrgApacheSlingEngineImplLogRequestLoggerServiceProperties;
  }

  //#endregion
