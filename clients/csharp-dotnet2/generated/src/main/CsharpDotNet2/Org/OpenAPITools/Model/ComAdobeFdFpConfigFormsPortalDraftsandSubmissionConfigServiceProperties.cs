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
  public class ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties {
    /// <summary>
    /// Gets or Sets PortalOutboxes
    /// </summary>
    [DataMember(Name="portal.outboxes", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "portal.outboxes")]
    public ConfigNodePropertyArray PortalOutboxes { get; set; }

    /// <summary>
    /// Gets or Sets DraftDataService
    /// </summary>
    [DataMember(Name="draft.data.service", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "draft.data.service")]
    public ConfigNodePropertyString DraftDataService { get; set; }

    /// <summary>
    /// Gets or Sets DraftMetadataService
    /// </summary>
    [DataMember(Name="draft.metadata.service", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "draft.metadata.service")]
    public ConfigNodePropertyString DraftMetadataService { get; set; }

    /// <summary>
    /// Gets or Sets SubmitDataService
    /// </summary>
    [DataMember(Name="submit.data.service", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "submit.data.service")]
    public ConfigNodePropertyString SubmitDataService { get; set; }

    /// <summary>
    /// Gets or Sets SubmitMetadataService
    /// </summary>
    [DataMember(Name="submit.metadata.service", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "submit.metadata.service")]
    public ConfigNodePropertyString SubmitMetadataService { get; set; }

    /// <summary>
    /// Gets or Sets PendingSignDataService
    /// </summary>
    [DataMember(Name="pendingSign.data.service", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "pendingSign.data.service")]
    public ConfigNodePropertyString PendingSignDataService { get; set; }

    /// <summary>
    /// Gets or Sets PendingSignMetadataService
    /// </summary>
    [DataMember(Name="pendingSign.metadata.service", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "pendingSign.metadata.service")]
    public ConfigNodePropertyString PendingSignMetadataService { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties {\n");
      sb.Append("  PortalOutboxes: ").Append(PortalOutboxes).Append("\n");
      sb.Append("  DraftDataService: ").Append(DraftDataService).Append("\n");
      sb.Append("  DraftMetadataService: ").Append(DraftMetadataService).Append("\n");
      sb.Append("  SubmitDataService: ").Append(SubmitDataService).Append("\n");
      sb.Append("  SubmitMetadataService: ").Append(SubmitMetadataService).Append("\n");
      sb.Append("  PendingSignDataService: ").Append(PendingSignDataService).Append("\n");
      sb.Append("  PendingSignMetadataService: ").Append(PendingSignMetadataService).Append("\n");
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
