namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module ComDayCqMailerDefaultMailServiceProperties =

  //#region ComDayCqMailerDefaultMailServiceProperties


  type comDayCqMailerDefaultMailServiceProperties = {
    SmtpHost : ConfigNodePropertyString;
    SmtpPort : ConfigNodePropertyInteger;
    SmtpUser : ConfigNodePropertyString;
    SmtpPassword : ConfigNodePropertyString;
    FromAddress : ConfigNodePropertyString;
    SmtpSsl : ConfigNodePropertyBoolean;
    SmtpStarttls : ConfigNodePropertyBoolean;
    DebugEmail : ConfigNodePropertyBoolean;
  }
  //#endregion
