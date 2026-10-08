namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.OrgApacheFelixScrScrServiceProperties

module OrgApacheFelixScrScrServiceInfo =

  //#region OrgApacheFelixScrScrServiceInfo

  [<CLIMutable>]
  type OrgApacheFelixScrScrServiceInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : OrgApacheFelixScrScrServiceProperties;
  }

  //#endregion
