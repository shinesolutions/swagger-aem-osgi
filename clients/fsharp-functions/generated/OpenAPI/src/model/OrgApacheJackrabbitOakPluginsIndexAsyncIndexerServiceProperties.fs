namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyInteger

module OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties =

  //#region OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties

  [<CLIMutable>]
  type OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties = {
    [<JsonProperty(PropertyName = "asyncConfigs")>]
    AsyncConfigs : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "leaseTimeOutMinutes")>]
    LeaseTimeOutMinutes : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "failingIndexTimeoutSeconds")>]
    FailingIndexTimeoutSeconds : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "errorWarnIntervalSeconds")>]
    ErrorWarnIntervalSeconds : ConfigNodePropertyInteger;
  }

  //#endregion
