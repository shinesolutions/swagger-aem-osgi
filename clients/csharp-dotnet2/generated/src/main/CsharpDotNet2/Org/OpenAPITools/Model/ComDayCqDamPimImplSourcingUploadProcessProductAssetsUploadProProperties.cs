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
  public class ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties {
    /// <summary>
    /// Gets or Sets DeleteZipFile
    /// </summary>
    [DataMember(Name="delete.zip.file", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "delete.zip.file")]
    public ConfigNodePropertyBoolean DeleteZipFile { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties {\n");
      sb.Append("  DeleteZipFile: ").Append(DeleteZipFile).Append("\n");
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
