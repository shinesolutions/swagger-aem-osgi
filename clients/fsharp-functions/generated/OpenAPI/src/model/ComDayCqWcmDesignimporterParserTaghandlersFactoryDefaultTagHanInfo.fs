namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultTagHanProperties

module ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultTagHanInfo =

  //#region ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultTagHanInfo

  [<CLIMutable>]
  type ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultTagHanInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultTagHanProperties;
  }

  //#endregion
