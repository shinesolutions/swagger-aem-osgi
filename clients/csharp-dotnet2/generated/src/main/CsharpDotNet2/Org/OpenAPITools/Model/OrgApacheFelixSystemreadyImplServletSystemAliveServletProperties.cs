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
  public class OrgApacheFelixSystemreadyImplServletSystemAliveServletProperties {
    /// <summary>
    /// Gets or Sets OsgiHttpWhiteboardServletPattern
    /// </summary>
    [DataMember(Name="osgi.http.whiteboard.servlet.pattern", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "osgi.http.whiteboard.servlet.pattern")]
    public ConfigNodePropertyString OsgiHttpWhiteboardServletPattern { get; set; }

    /// <summary>
    /// Gets or Sets OsgiHttpWhiteboardContextSelect
    /// </summary>
    [DataMember(Name="osgi.http.whiteboard.context.select", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "osgi.http.whiteboard.context.select")]
    public ConfigNodePropertyString OsgiHttpWhiteboardContextSelect { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class OrgApacheFelixSystemreadyImplServletSystemAliveServletProperties {\n");
      sb.Append("  OsgiHttpWhiteboardServletPattern: ").Append(OsgiHttpWhiteboardServletPattern).Append("\n");
      sb.Append("  OsgiHttpWhiteboardContextSelect: ").Append(OsgiHttpWhiteboardContextSelect).Append("\n");
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
