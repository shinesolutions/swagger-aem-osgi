namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray

module ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties =

  //#region ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties

  [<CLIMutable>]
  type ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties = {
    [<JsonProperty(PropertyName = "cq.pagesupdatehandler.imageresourcetypes")>]
    CqPagesupdatehandlerImageresourcetypes : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "cq.pagesupdatehandler.productresourcetypes")>]
    CqPagesupdatehandlerProductresourcetypes : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "cq.pagesupdatehandler.videoresourcetypes")>]
    CqPagesupdatehandlerVideoresourcetypes : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "cq.pagesupdatehandler.dynamicsequenceresourcetypes")>]
    CqPagesupdatehandlerDynamicsequenceresourcetypes : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "cq.pagesupdatehandler.previewmodepaths")>]
    CqPagesupdatehandlerPreviewmodepaths : ConfigNodePropertyArray;
  }

  //#endregion
