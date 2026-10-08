namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.OrgApacheFelixSystemreadyImplServicesCheckProperties

module OrgApacheFelixSystemreadyImplServicesCheckInfo =

  //#region OrgApacheFelixSystemreadyImplServicesCheckInfo

  [<CLIMutable>]
  type OrgApacheFelixSystemreadyImplServicesCheckInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : OrgApacheFelixSystemreadyImplServicesCheckProperties;
    [<JsonProperty(PropertyName = "bundle_location")>]
    BundleLocation : string;
    [<JsonProperty(PropertyName = "service_location")>]
    ServiceLocation : string;
  }

  //#endregion
