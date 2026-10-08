namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties

module ComDayCqWcmDesignimporterImplEntryPreprocessorImplInfo =

  //#region ComDayCqWcmDesignimporterImplEntryPreprocessorImplInfo

  [<CLIMutable>]
  type ComDayCqWcmDesignimporterImplEntryPreprocessorImplInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties;
  }

  //#endregion
