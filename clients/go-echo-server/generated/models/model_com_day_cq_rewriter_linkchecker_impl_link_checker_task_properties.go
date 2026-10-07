package models

type ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties struct {

	SchedulerPeriod ConfigNodePropertyInteger `json:"scheduler.period,omitempty"`

	SchedulerConcurrent ConfigNodePropertyBoolean `json:"scheduler.concurrent,omitempty"`

	GoodLinkTestInterval ConfigNodePropertyInteger `json:"good_link_test_interval,omitempty"`

	BadLinkTestInterval ConfigNodePropertyInteger `json:"bad_link_test_interval,omitempty"`

	LinkUnusedInterval ConfigNodePropertyInteger `json:"link_unused_interval,omitempty"`

	ConnectionTimeout ConfigNodePropertyInteger `json:"connection.timeout,omitempty"`
}
