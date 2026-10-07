namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyString

module OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties =

  //#region OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties

  [<CLIMutable>]
  type OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties = {
    [<JsonProperty(PropertyName = "accountName")>]
    AccountName : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "containerName")>]
    ContainerName : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "accessKey")>]
    AccessKey : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "rootPath")>]
    RootPath : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "connectionURL")>]
    ConnectionURL : ConfigNodePropertyString;
  }

  //#endregion
