package models

type OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties struct {

	Extensions ConfigNodePropertyArray `json:"extensions,omitempty"`

	MinDurationMs ConfigNodePropertyInteger `json:"minDurationMs,omitempty"`

	MaxDurationMs ConfigNodePropertyInteger `json:"maxDurationMs,omitempty"`

	CompactLogFormat ConfigNodePropertyBoolean `json:"compactLogFormat,omitempty"`
}
