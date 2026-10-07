namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class ComAdobeGraniteRepositoryImplCommitStatsConfigProperties 
{
    public ConfigNodePropertyBoolean Enabled { get; set; }
    public ConfigNodePropertyInteger IntervalSeconds { get; set; }
    public ConfigNodePropertyInteger CommitsPerIntervalThreshold { get; set; }
    public ConfigNodePropertyInteger MaxLocationLength { get; set; }
    public ConfigNodePropertyInteger MaxDetailsShown { get; set; }
    public ConfigNodePropertyInteger MinDetailsPercentage { get; set; }
    public ConfigNodePropertyArray ThreadMatchers { get; set; }
    public ConfigNodePropertyInteger MaxGreedyDepth { get; set; }
    public ConfigNodePropertyString GreedyStackMatchers { get; set; }
    public ConfigNodePropertyArray StackFilters { get; set; }
    public ConfigNodePropertyArray StackMatchers { get; set; }
    public ConfigNodePropertyArray StackCategorizers { get; set; }
    public ConfigNodePropertyArray StackShorteners { get; set; }
}


