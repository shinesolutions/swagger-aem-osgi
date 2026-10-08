namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties

module ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceInfo =

  //#region ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceInfo

  [<CLIMutable>]
  type ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties;
  }

  //#endregion
