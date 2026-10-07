package models

type AnalyticsComponentQueryCacheServiceInfo struct {

	Pid string `json:"pid,omitempty"`

	Title string `json:"title,omitempty"`

	Description string `json:"description,omitempty"`

	Properties AnalyticsComponentQueryCacheServiceProperties `json:"properties,omitempty"`
}
