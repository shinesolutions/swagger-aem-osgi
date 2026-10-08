package models

type ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties struct {

	SchedulerPeriod ConfigNodePropertyInteger `json:"scheduler.period,omitempty"`

	SchedulerConcurrent ConfigNodePropertyBoolean `json:"scheduler.concurrent,omitempty"`

	ServiceBadLinkToleranceInterval ConfigNodePropertyInteger `json:"service.bad_link_tolerance_interval,omitempty"`

	ServiceCheckOverridePatterns ConfigNodePropertyArray `json:"service.check_override_patterns,omitempty"`

	ServiceCacheBrokenInternalLinks ConfigNodePropertyBoolean `json:"service.cache_broken_internal_links,omitempty"`

	ServiceSpecialLinkPrefix ConfigNodePropertyArray `json:"service.special_link_prefix,omitempty"`

	ServiceSpecialLinkPatterns ConfigNodePropertyArray `json:"service.special_link_patterns,omitempty"`
}
