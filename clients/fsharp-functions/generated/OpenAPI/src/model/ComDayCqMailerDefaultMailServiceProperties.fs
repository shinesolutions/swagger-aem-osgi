namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module ComDayCqMailerDefaultMailServiceProperties =

  //#region ComDayCqMailerDefaultMailServiceProperties

  [<CLIMutable>]
  type ComDayCqMailerDefaultMailServiceProperties = {
    [<JsonProperty(PropertyName = "smtp.host")>]
    SmtpHost : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "smtp.port")>]
    SmtpPort : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "smtp.user")>]
    SmtpUser : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "smtp.password")>]
    SmtpPassword : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "from.address")>]
    FromAddress : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "smtp.ssl")>]
    SmtpSsl : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "smtp.starttls")>]
    SmtpStarttls : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "debug.email")>]
    DebugEmail : ConfigNodePropertyBoolean;
  }

  //#endregion
