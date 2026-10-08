namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyInteger

module OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties =

  //#region OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties

  [<CLIMutable>]
  type OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties = {
    [<JsonProperty(PropertyName = "maxItems")>]
    MaxItems : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "maxPathDepth")>]
    MaxPathDepth : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "enabled")>]
    Enabled : ConfigNodePropertyBoolean;
  }

  //#endregion
