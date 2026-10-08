namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyInteger

module ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties =

  //#region ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties

  [<CLIMutable>]
  type ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties = {
    [<JsonProperty(PropertyName = "linkcheckertransformer.disableRewriting")>]
    LinkcheckertransformerDisableRewriting : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "linkcheckertransformer.disableChecking")>]
    LinkcheckertransformerDisableChecking : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "linkcheckertransformer.mapCacheSize")>]
    LinkcheckertransformerMapCacheSize : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "linkcheckertransformer.strictExtensionCheck")>]
    LinkcheckertransformerStrictExtensionCheck : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "linkcheckertransformer.stripHtmltExtension")>]
    LinkcheckertransformerStripHtmltExtension : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "linkcheckertransformer.rewriteElements")>]
    LinkcheckertransformerRewriteElements : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "linkcheckertransformer.stripExtensionPathBlacklist")>]
    LinkcheckertransformerStripExtensionPathBlacklist : ConfigNodePropertyArray;
  }

  //#endregion
