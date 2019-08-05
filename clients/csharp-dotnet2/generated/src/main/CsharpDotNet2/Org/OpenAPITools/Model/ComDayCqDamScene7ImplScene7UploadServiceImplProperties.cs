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
  public class ComDayCqDamScene7ImplScene7UploadServiceImplProperties {
    /// <summary>
    /// Gets or Sets CqDamScene7UploadserviceActivejobtimeoutLabel
    /// </summary>
    [DataMember(Name="cq.dam.scene7.uploadservice.activejobtimeout.label", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cq.dam.scene7.uploadservice.activejobtimeout.label")]
    public ConfigNodePropertyInteger CqDamScene7UploadserviceActivejobtimeoutLabel { get; set; }

    /// <summary>
    /// Gets or Sets CqDamScene7UploadserviceConnectionmaxperrouteLabel
    /// </summary>
    [DataMember(Name="cq.dam.scene7.uploadservice.connectionmaxperroute.label", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cq.dam.scene7.uploadservice.connectionmaxperroute.label")]
    public ConfigNodePropertyInteger CqDamScene7UploadserviceConnectionmaxperrouteLabel { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComDayCqDamScene7ImplScene7UploadServiceImplProperties {\n");
      sb.Append("  CqDamScene7UploadserviceActivejobtimeoutLabel: ").Append(CqDamScene7UploadserviceActivejobtimeoutLabel).Append("\n");
      sb.Append("  CqDamScene7UploadserviceConnectionmaxperrouteLabel: ").Append(CqDamScene7UploadserviceConnectionmaxperrouteLabel).Append("\n");
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
