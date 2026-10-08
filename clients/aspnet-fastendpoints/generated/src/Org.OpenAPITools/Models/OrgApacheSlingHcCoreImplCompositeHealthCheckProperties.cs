namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class OrgApacheSlingHcCoreImplCompositeHealthCheckProperties 
{
    public ConfigNodePropertyString HcName { get; set; }
    public ConfigNodePropertyArray HcTags { get; set; }
    public ConfigNodePropertyString HcMbeanName { get; set; }
    public ConfigNodePropertyArray FilterTags { get; set; }
    public ConfigNodePropertyBoolean FilterCombineTagsWithOr { get; set; }
}


