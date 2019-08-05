using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Runtime.Serialization;
using Newtonsoft.Json;

namespace Org.OpenAPITools.Model {

  /// <summary>
  /// 
  /// </summary>
  [DataContract]
  public class ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties {
    /// <summary>
    /// Gets or Sets CqDamConfigAnnotationPdfDocumentWidth
    /// </summary>
    [DataMember(Name="cq.dam.config.annotation.pdf.document.width", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cq.dam.config.annotation.pdf.document.width")]
    public ConfigNodePropertyInteger CqDamConfigAnnotationPdfDocumentWidth { get; set; }

    /// <summary>
    /// Gets or Sets CqDamConfigAnnotationPdfDocumentHeight
    /// </summary>
    [DataMember(Name="cq.dam.config.annotation.pdf.document.height", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cq.dam.config.annotation.pdf.document.height")]
    public ConfigNodePropertyInteger CqDamConfigAnnotationPdfDocumentHeight { get; set; }

    /// <summary>
    /// Gets or Sets CqDamConfigAnnotationPdfDocumentPaddingHorizontal
    /// </summary>
    [DataMember(Name="cq.dam.config.annotation.pdf.document.padding.horizontal", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cq.dam.config.annotation.pdf.document.padding.horizontal")]
    public ConfigNodePropertyInteger CqDamConfigAnnotationPdfDocumentPaddingHorizontal { get; set; }

    /// <summary>
    /// Gets or Sets CqDamConfigAnnotationPdfDocumentPaddingVertical
    /// </summary>
    [DataMember(Name="cq.dam.config.annotation.pdf.document.padding.vertical", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cq.dam.config.annotation.pdf.document.padding.vertical")]
    public ConfigNodePropertyInteger CqDamConfigAnnotationPdfDocumentPaddingVertical { get; set; }

    /// <summary>
    /// Gets or Sets CqDamConfigAnnotationPdfFontSize
    /// </summary>
    [DataMember(Name="cq.dam.config.annotation.pdf.font.size", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cq.dam.config.annotation.pdf.font.size")]
    public ConfigNodePropertyInteger CqDamConfigAnnotationPdfFontSize { get; set; }

    /// <summary>
    /// Gets or Sets CqDamConfigAnnotationPdfFontColor
    /// </summary>
    [DataMember(Name="cq.dam.config.annotation.pdf.font.color", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cq.dam.config.annotation.pdf.font.color")]
    public ConfigNodePropertyString CqDamConfigAnnotationPdfFontColor { get; set; }

    /// <summary>
    /// Gets or Sets CqDamConfigAnnotationPdfFontFamily
    /// </summary>
    [DataMember(Name="cq.dam.config.annotation.pdf.font.family", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cq.dam.config.annotation.pdf.font.family")]
    public ConfigNodePropertyString CqDamConfigAnnotationPdfFontFamily { get; set; }

    /// <summary>
    /// Gets or Sets CqDamConfigAnnotationPdfFontLight
    /// </summary>
    [DataMember(Name="cq.dam.config.annotation.pdf.font.light", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cq.dam.config.annotation.pdf.font.light")]
    public ConfigNodePropertyString CqDamConfigAnnotationPdfFontLight { get; set; }

    /// <summary>
    /// Gets or Sets CqDamConfigAnnotationPdfMarginTextImage
    /// </summary>
    [DataMember(Name="cq.dam.config.annotation.pdf.marginTextImage", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cq.dam.config.annotation.pdf.marginTextImage")]
    public ConfigNodePropertyInteger CqDamConfigAnnotationPdfMarginTextImage { get; set; }

    /// <summary>
    /// Gets or Sets CqDamConfigAnnotationPdfMinImageHeight
    /// </summary>
    [DataMember(Name="cq.dam.config.annotation.pdf.minImageHeight", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cq.dam.config.annotation.pdf.minImageHeight")]
    public ConfigNodePropertyInteger CqDamConfigAnnotationPdfMinImageHeight { get; set; }

    /// <summary>
    /// Gets or Sets CqDamConfigAnnotationPdfReviewStatusWidth
    /// </summary>
    [DataMember(Name="cq.dam.config.annotation.pdf.reviewStatus.width", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cq.dam.config.annotation.pdf.reviewStatus.width")]
    public ConfigNodePropertyInteger CqDamConfigAnnotationPdfReviewStatusWidth { get; set; }

    /// <summary>
    /// Gets or Sets CqDamConfigAnnotationPdfReviewStatusColorApproved
    /// </summary>
    [DataMember(Name="cq.dam.config.annotation.pdf.reviewStatus.color.approved", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cq.dam.config.annotation.pdf.reviewStatus.color.approved")]
    public ConfigNodePropertyString CqDamConfigAnnotationPdfReviewStatusColorApproved { get; set; }

    /// <summary>
    /// Gets or Sets CqDamConfigAnnotationPdfReviewStatusColorRejected
    /// </summary>
    [DataMember(Name="cq.dam.config.annotation.pdf.reviewStatus.color.rejected", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cq.dam.config.annotation.pdf.reviewStatus.color.rejected")]
    public ConfigNodePropertyString CqDamConfigAnnotationPdfReviewStatusColorRejected { get; set; }

    /// <summary>
    /// Gets or Sets CqDamConfigAnnotationPdfReviewStatusColorChangesRequested
    /// </summary>
    [DataMember(Name="cq.dam.config.annotation.pdf.reviewStatus.color.changesRequested", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cq.dam.config.annotation.pdf.reviewStatus.color.changesRequested")]
    public ConfigNodePropertyString CqDamConfigAnnotationPdfReviewStatusColorChangesRequested { get; set; }

    /// <summary>
    /// Gets or Sets CqDamConfigAnnotationPdfAnnotationMarkerWidth
    /// </summary>
    [DataMember(Name="cq.dam.config.annotation.pdf.annotationMarker.width", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cq.dam.config.annotation.pdf.annotationMarker.width")]
    public ConfigNodePropertyInteger CqDamConfigAnnotationPdfAnnotationMarkerWidth { get; set; }

    /// <summary>
    /// Gets or Sets CqDamConfigAnnotationPdfAssetMinheight
    /// </summary>
    [DataMember(Name="cq.dam.config.annotation.pdf.asset.minheight", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cq.dam.config.annotation.pdf.asset.minheight")]
    public ConfigNodePropertyInteger CqDamConfigAnnotationPdfAssetMinheight { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties {\n");
      sb.Append("  CqDamConfigAnnotationPdfDocumentWidth: ").Append(CqDamConfigAnnotationPdfDocumentWidth).Append("\n");
      sb.Append("  CqDamConfigAnnotationPdfDocumentHeight: ").Append(CqDamConfigAnnotationPdfDocumentHeight).Append("\n");
      sb.Append("  CqDamConfigAnnotationPdfDocumentPaddingHorizontal: ").Append(CqDamConfigAnnotationPdfDocumentPaddingHorizontal).Append("\n");
      sb.Append("  CqDamConfigAnnotationPdfDocumentPaddingVertical: ").Append(CqDamConfigAnnotationPdfDocumentPaddingVertical).Append("\n");
      sb.Append("  CqDamConfigAnnotationPdfFontSize: ").Append(CqDamConfigAnnotationPdfFontSize).Append("\n");
      sb.Append("  CqDamConfigAnnotationPdfFontColor: ").Append(CqDamConfigAnnotationPdfFontColor).Append("\n");
      sb.Append("  CqDamConfigAnnotationPdfFontFamily: ").Append(CqDamConfigAnnotationPdfFontFamily).Append("\n");
      sb.Append("  CqDamConfigAnnotationPdfFontLight: ").Append(CqDamConfigAnnotationPdfFontLight).Append("\n");
      sb.Append("  CqDamConfigAnnotationPdfMarginTextImage: ").Append(CqDamConfigAnnotationPdfMarginTextImage).Append("\n");
      sb.Append("  CqDamConfigAnnotationPdfMinImageHeight: ").Append(CqDamConfigAnnotationPdfMinImageHeight).Append("\n");
      sb.Append("  CqDamConfigAnnotationPdfReviewStatusWidth: ").Append(CqDamConfigAnnotationPdfReviewStatusWidth).Append("\n");
      sb.Append("  CqDamConfigAnnotationPdfReviewStatusColorApproved: ").Append(CqDamConfigAnnotationPdfReviewStatusColorApproved).Append("\n");
      sb.Append("  CqDamConfigAnnotationPdfReviewStatusColorRejected: ").Append(CqDamConfigAnnotationPdfReviewStatusColorRejected).Append("\n");
      sb.Append("  CqDamConfigAnnotationPdfReviewStatusColorChangesRequested: ").Append(CqDamConfigAnnotationPdfReviewStatusColorChangesRequested).Append("\n");
      sb.Append("  CqDamConfigAnnotationPdfAnnotationMarkerWidth: ").Append(CqDamConfigAnnotationPdfAnnotationMarkerWidth).Append("\n");
      sb.Append("  CqDamConfigAnnotationPdfAssetMinheight: ").Append(CqDamConfigAnnotationPdfAssetMinheight).Append("\n");
      sb.Append("}\n");
      return sb.ToString();
    }

    /// <summary>
    /// Get the JSON string presentation of the object
    /// </summary>
    /// <returns>JSON string presentation of the object</returns>
    public string ToJson() {
      return JsonConvert.SerializeObject(this, Formatting.Indented);
    }

}
}
