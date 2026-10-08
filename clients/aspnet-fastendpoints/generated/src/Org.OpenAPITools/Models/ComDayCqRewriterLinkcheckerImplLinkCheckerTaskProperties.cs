namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties 
{
    public ConfigNodePropertyInteger SchedulerPeriod { get; set; }
    public ConfigNodePropertyBoolean SchedulerConcurrent { get; set; }
    public ConfigNodePropertyInteger GoodLinkTestInterval { get; set; }
    public ConfigNodePropertyInteger BadLinkTestInterval { get; set; }
    public ConfigNodePropertyInteger LinkUnusedInterval { get; set; }
    public ConfigNodePropertyInteger ConnectionTimeout { get; set; }
}


