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
  public class ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties {
    /// <summary>
    /// Gets or Sets Scene7FlashTemplatesRti
    /// </summary>
    [DataMember(Name="scene7FlashTemplates.rti", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "scene7FlashTemplates.rti")]
    public ConfigNodePropertyString Scene7FlashTemplatesRti { get; set; }

    /// <summary>
    /// Gets or Sets Scene7FlashTemplatesRsi
    /// </summary>
    [DataMember(Name="scene7FlashTemplates.rsi", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "scene7FlashTemplates.rsi")]
    public ConfigNodePropertyString Scene7FlashTemplatesRsi { get; set; }

    /// <summary>
    /// Gets or Sets Scene7FlashTemplatesRb
    /// </summary>
    [DataMember(Name="scene7FlashTemplates.rb", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "scene7FlashTemplates.rb")]
    public ConfigNodePropertyString Scene7FlashTemplatesRb { get; set; }

    /// <summary>
    /// Gets or Sets Scene7FlashTemplatesRurl
    /// </summary>
    [DataMember(Name="scene7FlashTemplates.rurl", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "scene7FlashTemplates.rurl")]
    public ConfigNodePropertyString Scene7FlashTemplatesRurl { get; set; }

    /// <summary>
    /// Gets or Sets Scene7FlashTemplateUrlFormatParameter
    /// </summary>
    [DataMember(Name="scene7FlashTemplate.urlFormatParameter", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "scene7FlashTemplate.urlFormatParameter")]
    public ConfigNodePropertyString Scene7FlashTemplateUrlFormatParameter { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties {\n");
      sb.Append("  Scene7FlashTemplatesRti: ").Append(Scene7FlashTemplatesRti).Append("\n");
      sb.Append("  Scene7FlashTemplatesRsi: ").Append(Scene7FlashTemplatesRsi).Append("\n");
      sb.Append("  Scene7FlashTemplatesRb: ").Append(Scene7FlashTemplatesRb).Append("\n");
      sb.Append("  Scene7FlashTemplatesRurl: ").Append(Scene7FlashTemplatesRurl).Append("\n");
      sb.Append("  Scene7FlashTemplateUrlFormatParameter: ").Append(Scene7FlashTemplateUrlFormatParameter).Append("\n");
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
