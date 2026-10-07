namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties =

  //#region ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties

  [<CLIMutable>]
  type ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties = {
    [<JsonProperty(PropertyName = "htmllibmanager.timing")>]
    HtmllibmanagerTiming : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "htmllibmanager.debug.init.js")>]
    HtmllibmanagerDebugInitJs : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "htmllibmanager.minify")>]
    HtmllibmanagerMinify : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "htmllibmanager.debug")>]
    HtmllibmanagerDebug : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "htmllibmanager.gzip")>]
    HtmllibmanagerGzip : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "htmllibmanager.maxDataUriSize")>]
    HtmllibmanagerMaxDataUriSize : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "htmllibmanager.maxage")>]
    HtmllibmanagerMaxage : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "htmllibmanager.forceCQUrlInfo")>]
    HtmllibmanagerForceCQUrlInfo : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "htmllibmanager.defaultthemename")>]
    HtmllibmanagerDefaultthemename : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "htmllibmanager.defaultuserthemename")>]
    HtmllibmanagerDefaultuserthemename : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "htmllibmanager.clientmanager")>]
    HtmllibmanagerClientmanager : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "htmllibmanager.path.list")>]
    HtmllibmanagerPathList : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "htmllibmanager.excluded.path.list")>]
    HtmllibmanagerExcludedPathList : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "htmllibmanager.processor.js")>]
    HtmllibmanagerProcessorJs : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "htmllibmanager.processor.css")>]
    HtmllibmanagerProcessorCss : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "htmllibmanager.longcache.patterns")>]
    HtmllibmanagerLongcachePatterns : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "htmllibmanager.longcache.format")>]
    HtmllibmanagerLongcacheFormat : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "htmllibmanager.useFileSystemOutputCache")>]
    HtmllibmanagerUseFileSystemOutputCache : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "htmllibmanager.fileSystemOutputCacheLocation")>]
    HtmllibmanagerFileSystemOutputCacheLocation : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "htmllibmanager.disable.replacement")>]
    HtmllibmanagerDisableReplacement : ConfigNodePropertyArray;
  }

  //#endregion
