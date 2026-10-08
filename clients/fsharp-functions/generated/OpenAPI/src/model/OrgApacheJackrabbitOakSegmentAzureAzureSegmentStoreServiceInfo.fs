namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties

module OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceInfo =

  //#region OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceInfo

  [<CLIMutable>]
  type OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties;
  }

  //#endregion
