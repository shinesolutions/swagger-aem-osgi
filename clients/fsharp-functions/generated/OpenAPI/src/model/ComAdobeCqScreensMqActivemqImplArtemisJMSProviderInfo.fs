namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties

module ComAdobeCqScreensMqActivemqImplArtemisJMSProviderInfo =

  //#region ComAdobeCqScreensMqActivemqImplArtemisJMSProviderInfo

  [<CLIMutable>]
  type ComAdobeCqScreensMqActivemqImplArtemisJMSProviderInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties;
  }

  //#endregion
