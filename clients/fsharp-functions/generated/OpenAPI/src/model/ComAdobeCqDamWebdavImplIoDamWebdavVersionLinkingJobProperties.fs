namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyInteger

module ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties =

  //#region ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties

  [<CLIMutable>]
  type ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties = {
    [<JsonProperty(PropertyName = "cq.dam.webdav.version.linking.enable")>]
    CqDamWebdavVersionLinkingEnable : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "cq.dam.webdav.version.linking.scheduler.period")>]
    CqDamWebdavVersionLinkingSchedulerPeriod : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "cq.dam.webdav.version.linking.staging.timeout")>]
    CqDamWebdavVersionLinkingStagingTimeout : ConfigNodePropertyInteger;
  }

  //#endregion
