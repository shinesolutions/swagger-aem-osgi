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
  public class ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties {
    /// <summary>
    /// Gets or Sets CqCommerceCataloggeneratorBucketsize
    /// </summary>
    [DataMember(Name="cq.commerce.cataloggenerator.bucketsize", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cq.commerce.cataloggenerator.bucketsize")]
    public ConfigNodePropertyInteger CqCommerceCataloggeneratorBucketsize { get; set; }

    /// <summary>
    /// Gets or Sets CqCommerceCataloggeneratorBucketname
    /// </summary>
    [DataMember(Name="cq.commerce.cataloggenerator.bucketname", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cq.commerce.cataloggenerator.bucketname")]
    public ConfigNodePropertyString CqCommerceCataloggeneratorBucketname { get; set; }

    /// <summary>
    /// Gets or Sets CqCommerceCataloggeneratorExcludedtemplateproperties
    /// </summary>
    [DataMember(Name="cq.commerce.cataloggenerator.excludedtemplateproperties", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cq.commerce.cataloggenerator.excludedtemplateproperties")]
    public ConfigNodePropertyArray CqCommerceCataloggeneratorExcludedtemplateproperties { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties {\n");
      sb.Append("  CqCommerceCataloggeneratorBucketsize: ").Append(CqCommerceCataloggeneratorBucketsize).Append("\n");
      sb.Append("  CqCommerceCataloggeneratorBucketname: ").Append(CqCommerceCataloggeneratorBucketname).Append("\n");
      sb.Append("  CqCommerceCataloggeneratorExcludedtemplateproperties: ").Append(CqCommerceCataloggeneratorExcludedtemplateproperties).Append("\n");
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
