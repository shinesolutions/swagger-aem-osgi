namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyInteger

module ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties =

  //#region ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties


  type comDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties = {
    LinkcheckertransformerDisableRewriting : ConfigNodePropertyBoolean;
    LinkcheckertransformerDisableChecking : ConfigNodePropertyBoolean;
    LinkcheckertransformerMapCacheSize : ConfigNodePropertyInteger;
    LinkcheckertransformerStrictExtensionCheck : ConfigNodePropertyBoolean;
    LinkcheckertransformerStripHtmltExtension : ConfigNodePropertyBoolean;
    LinkcheckertransformerRewriteElements : ConfigNodePropertyArray;
    LinkcheckertransformerStripExtensionPathBlacklist : ConfigNodePropertyArray;
  }
  //#endregion
