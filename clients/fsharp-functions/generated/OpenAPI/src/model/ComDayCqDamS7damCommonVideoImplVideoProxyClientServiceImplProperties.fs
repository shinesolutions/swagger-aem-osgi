namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyInteger

module ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties =

  //#region ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties

  [<CLIMutable>]
  type ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties = {
    [<JsonProperty(PropertyName = "cq.dam.s7dam.videoproxyclientservice.multipartupload.minsize.name")>]
    CqDamS7damVideoproxyclientserviceMultipartuploadMinsizeName : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "cq.dam.s7dam.videoproxyclientservice.multipartupload.partsize.name")>]
    CqDamS7damVideoproxyclientserviceMultipartuploadPartsizeName : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "cq.dam.s7dam.videoproxyclientservice.multipartupload.numthread.name")>]
    CqDamS7damVideoproxyclientserviceMultipartuploadNumthreadName : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "cq.dam.s7dam.videoproxyclientservice.http.readtimeout.name")>]
    CqDamS7damVideoproxyclientserviceHttpReadtimeoutName : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "cq.dam.s7dam.videoproxyclientservice.http.connectiontimeout.name")>]
    CqDamS7damVideoproxyclientserviceHttpConnectiontimeoutName : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "cq.dam.s7dam.videoproxyclientservice.http.maxretrycount.name")>]
    CqDamS7damVideoproxyclientserviceHttpMaxretrycountName : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "cq.dam.s7dam.videoproxyclientservice.uploadprogress.interval.name")>]
    CqDamS7damVideoproxyclientserviceUploadprogressIntervalName : ConfigNodePropertyInteger;
  }

  //#endregion
