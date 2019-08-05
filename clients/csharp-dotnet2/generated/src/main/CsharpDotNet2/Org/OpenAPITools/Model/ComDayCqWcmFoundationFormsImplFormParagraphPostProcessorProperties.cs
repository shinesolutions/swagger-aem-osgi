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
  public class ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties {
    /// <summary>
    /// Gets or Sets FormsFormparagraphpostprocessorEnabled
    /// </summary>
    [DataMember(Name="forms.formparagraphpostprocessor.enabled", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "forms.formparagraphpostprocessor.enabled")]
    public ConfigNodePropertyBoolean FormsFormparagraphpostprocessorEnabled { get; set; }

    /// <summary>
    /// Gets or Sets FormsFormparagraphpostprocessorFormresourcetypes
    /// </summary>
    [DataMember(Name="forms.formparagraphpostprocessor.formresourcetypes", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "forms.formparagraphpostprocessor.formresourcetypes")]
    public ConfigNodePropertyArray FormsFormparagraphpostprocessorFormresourcetypes { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties {\n");
      sb.Append("  FormsFormparagraphpostprocessorEnabled: ").Append(FormsFormparagraphpostprocessorEnabled).Append("\n");
      sb.Append("  FormsFormparagraphpostprocessorFormresourcetypes: ").Append(FormsFormparagraphpostprocessorFormresourcetypes).Append("\n");
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
