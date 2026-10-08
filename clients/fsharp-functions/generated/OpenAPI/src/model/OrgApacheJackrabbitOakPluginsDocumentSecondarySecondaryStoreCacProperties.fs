namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyInteger

module OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties =

  //#region OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties

  [<CLIMutable>]
  type OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties = {
    [<JsonProperty(PropertyName = "includedPaths")>]
    IncludedPaths : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "enableAsyncObserver")>]
    EnableAsyncObserver : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "observerQueueSize")>]
    ObserverQueueSize : ConfigNodePropertyInteger;
  }

  //#endregion
