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
  public class ComAdobeCqProjectsImplServletProjectImageServletProperties {
    /// <summary>
    /// Gets or Sets ImageQuality
    /// </summary>
    [DataMember(Name="image.quality", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "image.quality")]
    public ConfigNodePropertyString ImageQuality { get; set; }

    /// <summary>
    /// Gets or Sets ImageSupportedResolutions
    /// </summary>
    [DataMember(Name="image.supported.resolutions", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "image.supported.resolutions")]
    public ConfigNodePropertyString ImageSupportedResolutions { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComAdobeCqProjectsImplServletProjectImageServletProperties {\n");
      sb.Append("  ImageQuality: ").Append(ImageQuality).Append("\n");
      sb.Append("  ImageSupportedResolutions: ").Append(ImageSupportedResolutions).Append("\n");
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
