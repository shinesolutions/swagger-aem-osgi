namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyString

module ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties =

  //#region ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties


  type comDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties = {
    LinkExpiredPrefix : ConfigNodePropertyString;
    LinkExpiredRemove : ConfigNodePropertyBoolean;
    LinkExpiredSuffix : ConfigNodePropertyString;
    LinkInvalidPrefix : ConfigNodePropertyString;
    LinkInvalidRemove : ConfigNodePropertyBoolean;
    LinkInvalidSuffix : ConfigNodePropertyString;
    LinkPredatedPrefix : ConfigNodePropertyString;
    LinkPredatedRemove : ConfigNodePropertyBoolean;
    LinkPredatedSuffix : ConfigNodePropertyString;
    LinkWcmmodes : ConfigNodePropertyArray;
  }
  //#endregion
