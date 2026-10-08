namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyString

module ComDayCqDamCoreImplServletResourceCollectionServletProperties =

  //#region ComDayCqDamCoreImplServletResourceCollectionServletProperties


  type comDayCqDamCoreImplServletResourceCollectionServletProperties = {
    SlingServletResourceTypes : ConfigNodePropertyArray;
    SlingServletMethods : ConfigNodePropertyString;
    SlingServletSelectors : ConfigNodePropertyString;
    DownloadConfig : ConfigNodePropertyString;
    ViewSelector : ConfigNodePropertyString;
    SendEmail : ConfigNodePropertyBoolean;
  }
  //#endregion
