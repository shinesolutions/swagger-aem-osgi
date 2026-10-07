namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties =

  //#region ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties

  [<CLIMutable>]
  type ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties = {
    [<JsonProperty(PropertyName = "inbox.impl.typeprovider.registrypaths")>]
    InboxImplTypeproviderRegistrypaths : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "inbox.impl.typeprovider.legacypaths")>]
    InboxImplTypeproviderLegacypaths : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "inbox.impl.typeprovider.defaulturl.failureitem")>]
    InboxImplTypeproviderDefaulturlFailureitem : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "inbox.impl.typeprovider.defaulturl.workitem")>]
    InboxImplTypeproviderDefaulturlWorkitem : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "inbox.impl.typeprovider.defaulturl.task")>]
    InboxImplTypeproviderDefaulturlTask : ConfigNodePropertyString;
  }

  //#endregion
