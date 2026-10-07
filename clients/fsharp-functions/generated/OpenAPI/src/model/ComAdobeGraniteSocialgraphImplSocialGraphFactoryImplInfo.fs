namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties

module ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplInfo =

  //#region ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplInfo

  [<CLIMutable>]
  type ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties;
  }

  //#endregion
