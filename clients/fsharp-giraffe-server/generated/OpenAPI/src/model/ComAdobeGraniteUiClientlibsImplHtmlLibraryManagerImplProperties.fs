namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties =

  //#region ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties


  type comAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties = {
    HtmllibmanagerTiming : ConfigNodePropertyBoolean;
    HtmllibmanagerDebugInitJs : ConfigNodePropertyString;
    HtmllibmanagerMinify : ConfigNodePropertyBoolean;
    HtmllibmanagerDebug : ConfigNodePropertyBoolean;
    HtmllibmanagerGzip : ConfigNodePropertyBoolean;
    HtmllibmanagerMaxDataUriSize : ConfigNodePropertyInteger;
    HtmllibmanagerMaxage : ConfigNodePropertyInteger;
    HtmllibmanagerForceCQUrlInfo : ConfigNodePropertyBoolean;
    HtmllibmanagerDefaultthemename : ConfigNodePropertyString;
    HtmllibmanagerDefaultuserthemename : ConfigNodePropertyString;
    HtmllibmanagerClientmanager : ConfigNodePropertyString;
    HtmllibmanagerPathList : ConfigNodePropertyArray;
    HtmllibmanagerExcludedPathList : ConfigNodePropertyArray;
    HtmllibmanagerProcessorJs : ConfigNodePropertyArray;
    HtmllibmanagerProcessorCss : ConfigNodePropertyArray;
    HtmllibmanagerLongcachePatterns : ConfigNodePropertyArray;
    HtmllibmanagerLongcacheFormat : ConfigNodePropertyString;
    HtmllibmanagerUseFileSystemOutputCache : ConfigNodePropertyBoolean;
    HtmllibmanagerFileSystemOutputCacheLocation : ConfigNodePropertyString;
    HtmllibmanagerDisableReplacement : ConfigNodePropertyArray;
  }
  //#endregion
