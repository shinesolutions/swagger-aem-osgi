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
  public class ComDayCqDamInddProcessINDDMediaExtractProcessProperties {
    /// <summary>
    /// Gets or Sets ProcessLabel
    /// </summary>
    [DataMember(Name="process.label", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "process.label")]
    public ConfigNodePropertyString ProcessLabel { get; set; }

    /// <summary>
    /// Gets or Sets CqDamInddPagesRegex
    /// </summary>
    [DataMember(Name="cq.dam.indd.pages.regex", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cq.dam.indd.pages.regex")]
    public ConfigNodePropertyString CqDamInddPagesRegex { get; set; }

    /// <summary>
    /// Gets or Sets IdsJobDecoupled
    /// </summary>
    [DataMember(Name="ids.job.decoupled", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "ids.job.decoupled")]
    public ConfigNodePropertyBoolean IdsJobDecoupled { get; set; }

    /// <summary>
    /// Gets or Sets IdsJobWorkflowModel
    /// </summary>
    [DataMember(Name="ids.job.workflow.model", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "ids.job.workflow.model")]
    public ConfigNodePropertyString IdsJobWorkflowModel { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComDayCqDamInddProcessINDDMediaExtractProcessProperties {\n");
      sb.Append("  ProcessLabel: ").Append(ProcessLabel).Append("\n");
      sb.Append("  CqDamInddPagesRegex: ").Append(CqDamInddPagesRegex).Append("\n");
      sb.Append("  IdsJobDecoupled: ").Append(IdsJobDecoupled).Append("\n");
      sb.Append("  IdsJobWorkflowModel: ").Append(IdsJobWorkflowModel).Append("\n");
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
