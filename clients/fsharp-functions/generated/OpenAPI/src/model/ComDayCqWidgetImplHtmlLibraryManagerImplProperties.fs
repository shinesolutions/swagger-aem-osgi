namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module ComDayCqWidgetImplHtmlLibraryManagerImplProperties =

  //#region ComDayCqWidgetImplHtmlLibraryManagerImplProperties

  [<CLIMutable>]
  type ComDayCqWidgetImplHtmlLibraryManagerImplProperties = {
    [<JsonProperty(PropertyName = "htmllibmanager.clientmanager")>]
    HtmllibmanagerClientmanager : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "htmllibmanager.debug")>]
    HtmllibmanagerDebug : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "htmllibmanager.debug.console")>]
    HtmllibmanagerDebugConsole : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "htmllibmanager.debug.init.js")>]
    HtmllibmanagerDebugInitJs : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "htmllibmanager.defaultthemename")>]
    HtmllibmanagerDefaultthemename : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "htmllibmanager.defaultuserthemename")>]
    HtmllibmanagerDefaultuserthemename : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "htmllibmanager.firebuglite.path")>]
    HtmllibmanagerFirebuglitePath : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "htmllibmanager.forceCQUrlInfo")>]
    HtmllibmanagerForceCQUrlInfo : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "htmllibmanager.gzip")>]
    HtmllibmanagerGzip : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "htmllibmanager.maxage")>]
    HtmllibmanagerMaxage : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "htmllibmanager.maxDataUriSize")>]
    HtmllibmanagerMaxDataUriSize : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "htmllibmanager.minify")>]
    HtmllibmanagerMinify : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "htmllibmanager.path.list")>]
    HtmllibmanagerPathList : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "htmllibmanager.timing")>]
    HtmllibmanagerTiming : ConfigNodePropertyBoolean;
  }

  //#endregion
