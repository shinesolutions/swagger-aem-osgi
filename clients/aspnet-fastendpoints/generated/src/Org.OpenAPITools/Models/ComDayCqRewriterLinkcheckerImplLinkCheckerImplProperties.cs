namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties 
{
    public ConfigNodePropertyInteger SchedulerPeriod { get; set; }
    public ConfigNodePropertyBoolean SchedulerConcurrent { get; set; }
    public ConfigNodePropertyInteger ServiceBadLinkToleranceInterval { get; set; }
    public ConfigNodePropertyArray ServiceCheckOverridePatterns { get; set; }
    public ConfigNodePropertyBoolean ServiceCacheBrokenInternalLinks { get; set; }
    public ConfigNodePropertyArray ServiceSpecialLinkPrefix { get; set; }
    public ConfigNodePropertyArray ServiceSpecialLinkPatterns { get; set; }
}


