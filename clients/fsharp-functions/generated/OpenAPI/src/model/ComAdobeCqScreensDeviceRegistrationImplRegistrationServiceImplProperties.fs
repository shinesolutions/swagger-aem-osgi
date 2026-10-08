namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyInteger

module ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties =

  //#region ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties

  [<CLIMutable>]
  type ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties = {
    [<JsonProperty(PropertyName = "deviceRegistrationTimeout")>]
    DeviceRegistrationTimeout : ConfigNodePropertyInteger;
  }

  //#endregion
