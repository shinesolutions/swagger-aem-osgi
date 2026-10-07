namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComDayCqWcmDesignimporterDesignPackageImporterProperties

module ComDayCqWcmDesignimporterDesignPackageImporterInfo =

  //#region ComDayCqWcmDesignimporterDesignPackageImporterInfo

  [<CLIMutable>]
  type ComDayCqWcmDesignimporterDesignPackageImporterInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComDayCqWcmDesignimporterDesignPackageImporterProperties;
  }

  //#endregion
