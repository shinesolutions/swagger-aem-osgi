namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.OrgApacheFelixJaasConfigurationFactoryProperties

module OrgApacheFelixJaasConfigurationFactoryInfo =

  //#region OrgApacheFelixJaasConfigurationFactoryInfo

  [<CLIMutable>]
  type OrgApacheFelixJaasConfigurationFactoryInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : OrgApacheFelixJaasConfigurationFactoryProperties;
  }

  //#endregion
