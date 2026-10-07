namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray

module ComAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties =

  //#region ComAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties

  [<CLIMutable>]
  type ComAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties = {
    [<JsonProperty(PropertyName = "com.day.cq.dam.core.impl.io.SpecialFilesHandler.filepatters")>]
    ComDayCqDamCoreImplIoSpecialFilesHandlerFilepatters : ConfigNodePropertyArray;
  }

  //#endregion
