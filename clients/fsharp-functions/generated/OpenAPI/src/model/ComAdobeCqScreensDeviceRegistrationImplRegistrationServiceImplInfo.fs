namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties

module ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplInfo =

  //#region ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplInfo

  [<CLIMutable>]
  type ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties;
  }

  //#endregion
