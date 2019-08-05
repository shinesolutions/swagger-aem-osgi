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
  public class ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties {
    /// <summary>
    /// Gets or Sets CqPagesupdatehandlerImageresourcetypes
    /// </summary>
    [DataMember(Name="cq.pagesupdatehandler.imageresourcetypes", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cq.pagesupdatehandler.imageresourcetypes")]
    public ConfigNodePropertyArray CqPagesupdatehandlerImageresourcetypes { get; set; }

    /// <summary>
    /// Gets or Sets CqPagesupdatehandlerProductresourcetypes
    /// </summary>
    [DataMember(Name="cq.pagesupdatehandler.productresourcetypes", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cq.pagesupdatehandler.productresourcetypes")]
    public ConfigNodePropertyArray CqPagesupdatehandlerProductresourcetypes { get; set; }

    /// <summary>
    /// Gets or Sets CqPagesupdatehandlerVideoresourcetypes
    /// </summary>
    [DataMember(Name="cq.pagesupdatehandler.videoresourcetypes", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cq.pagesupdatehandler.videoresourcetypes")]
    public ConfigNodePropertyArray CqPagesupdatehandlerVideoresourcetypes { get; set; }

    /// <summary>
    /// Gets or Sets CqPagesupdatehandlerDynamicsequenceresourcetypes
    /// </summary>
    [DataMember(Name="cq.pagesupdatehandler.dynamicsequenceresourcetypes", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cq.pagesupdatehandler.dynamicsequenceresourcetypes")]
    public ConfigNodePropertyArray CqPagesupdatehandlerDynamicsequenceresourcetypes { get; set; }

    /// <summary>
    /// Gets or Sets CqPagesupdatehandlerPreviewmodepaths
    /// </summary>
    [DataMember(Name="cq.pagesupdatehandler.previewmodepaths", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cq.pagesupdatehandler.previewmodepaths")]
    public ConfigNodePropertyArray CqPagesupdatehandlerPreviewmodepaths { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties {\n");
      sb.Append("  CqPagesupdatehandlerImageresourcetypes: ").Append(CqPagesupdatehandlerImageresourcetypes).Append("\n");
      sb.Append("  CqPagesupdatehandlerProductresourcetypes: ").Append(CqPagesupdatehandlerProductresourcetypes).Append("\n");
      sb.Append("  CqPagesupdatehandlerVideoresourcetypes: ").Append(CqPagesupdatehandlerVideoresourcetypes).Append("\n");
      sb.Append("  CqPagesupdatehandlerDynamicsequenceresourcetypes: ").Append(CqPagesupdatehandlerDynamicsequenceresourcetypes).Append("\n");
      sb.Append("  CqPagesupdatehandlerPreviewmodepaths: ").Append(CqPagesupdatehandlerPreviewmodepaths).Append("\n");
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
