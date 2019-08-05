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
  public class OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderProperties {
    /// <summary>
    /// Gets or Sets Dir
    /// </summary>
    [DataMember(Name="dir", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "dir")]
    public ConfigNodePropertyString Dir { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderProperties {\n");
      sb.Append("  Dir: ").Append(Dir).Append("\n");
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
