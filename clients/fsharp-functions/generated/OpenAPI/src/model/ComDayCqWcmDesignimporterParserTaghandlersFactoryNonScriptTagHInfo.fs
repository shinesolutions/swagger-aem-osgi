namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComDayCqWcmDesignimporterParserTaghandlersFactoryNonScriptTagHProperties

module ComDayCqWcmDesignimporterParserTaghandlersFactoryNonScriptTagHInfo =

  //#region ComDayCqWcmDesignimporterParserTaghandlersFactoryNonScriptTagHInfo

  [<CLIMutable>]
  type ComDayCqWcmDesignimporterParserTaghandlersFactoryNonScriptTagHInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComDayCqWcmDesignimporterParserTaghandlersFactoryNonScriptTagHProperties;
  }

  //#endregion
