namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConfigNodePropertyDropDown
open OpenAPI.Model.ConfigNodePropertyInteger

module OrgApacheSlingEventImplJobsDefaultJobManagerProperties =

  //#region OrgApacheSlingEventImplJobsDefaultJobManagerProperties


  type orgApacheSlingEventImplJobsDefaultJobManagerProperties = {
    QueuePriority : ConfigNodePropertyDropDown;
    QueueRetries : ConfigNodePropertyInteger;
    QueueRetrydelay : ConfigNodePropertyInteger;
    QueueMaxparallel : ConfigNodePropertyInteger;
  }
  //#endregion
