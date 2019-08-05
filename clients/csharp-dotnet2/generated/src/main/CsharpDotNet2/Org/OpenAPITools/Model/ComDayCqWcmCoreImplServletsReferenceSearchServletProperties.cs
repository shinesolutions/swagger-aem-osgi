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
  public class ComDayCqWcmCoreImplServletsReferenceSearchServletProperties {
    /// <summary>
    /// Gets or Sets ReferencesearchservletMaxReferencesPerPage
    /// </summary>
    [DataMember(Name="referencesearchservlet.maxReferencesPerPage", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "referencesearchservlet.maxReferencesPerPage")]
    public ConfigNodePropertyInteger ReferencesearchservletMaxReferencesPerPage { get; set; }

    /// <summary>
    /// Gets or Sets ReferencesearchservletMaxPages
    /// </summary>
    [DataMember(Name="referencesearchservlet.maxPages", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "referencesearchservlet.maxPages")]
    public ConfigNodePropertyInteger ReferencesearchservletMaxPages { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComDayCqWcmCoreImplServletsReferenceSearchServletProperties {\n");
      sb.Append("  ReferencesearchservletMaxReferencesPerPage: ").Append(ReferencesearchservletMaxReferencesPerPage).Append("\n");
      sb.Append("  ReferencesearchservletMaxPages: ").Append(ReferencesearchservletMaxPages).Append("\n");
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
