namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties =

  //#region ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties

  [<CLIMutable>]
  type ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties = {
    [<JsonProperty(PropertyName = "cq.dam.config.annotation.pdf.document.width")>]
    CqDamConfigAnnotationPdfDocumentWidth : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "cq.dam.config.annotation.pdf.document.height")>]
    CqDamConfigAnnotationPdfDocumentHeight : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "cq.dam.config.annotation.pdf.document.padding.horizontal")>]
    CqDamConfigAnnotationPdfDocumentPaddingHorizontal : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "cq.dam.config.annotation.pdf.document.padding.vertical")>]
    CqDamConfigAnnotationPdfDocumentPaddingVertical : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "cq.dam.config.annotation.pdf.font.size")>]
    CqDamConfigAnnotationPdfFontSize : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "cq.dam.config.annotation.pdf.font.color")>]
    CqDamConfigAnnotationPdfFontColor : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "cq.dam.config.annotation.pdf.font.family")>]
    CqDamConfigAnnotationPdfFontFamily : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "cq.dam.config.annotation.pdf.font.light")>]
    CqDamConfigAnnotationPdfFontLight : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "cq.dam.config.annotation.pdf.marginTextImage")>]
    CqDamConfigAnnotationPdfMarginTextImage : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "cq.dam.config.annotation.pdf.minImageHeight")>]
    CqDamConfigAnnotationPdfMinImageHeight : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "cq.dam.config.annotation.pdf.reviewStatus.width")>]
    CqDamConfigAnnotationPdfReviewStatusWidth : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "cq.dam.config.annotation.pdf.reviewStatus.color.approved")>]
    CqDamConfigAnnotationPdfReviewStatusColorApproved : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "cq.dam.config.annotation.pdf.reviewStatus.color.rejected")>]
    CqDamConfigAnnotationPdfReviewStatusColorRejected : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "cq.dam.config.annotation.pdf.reviewStatus.color.changesRequested")>]
    CqDamConfigAnnotationPdfReviewStatusColorChangesRequested : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "cq.dam.config.annotation.pdf.annotationMarker.width")>]
    CqDamConfigAnnotationPdfAnnotationMarkerWidth : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "cq.dam.config.annotation.pdf.asset.minheight")>]
    CqDamConfigAnnotationPdfAssetMinheight : ConfigNodePropertyInteger;
  }

  //#endregion
