namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties

module ComAdobeCqDamWebdavImplIoSpecialFilesHandlerInfo =

  //#region ComAdobeCqDamWebdavImplIoSpecialFilesHandlerInfo

  [<CLIMutable>]
  type ComAdobeCqDamWebdavImplIoSpecialFilesHandlerInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties;
  }

  //#endregion
