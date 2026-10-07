package models

type ComDayCqPollingImporterImplManagedPollConfigImplProperties struct {

	Id ConfigNodePropertyString `json:"id,omitempty"`

	Enabled ConfigNodePropertyBoolean `json:"enabled,omitempty"`

	Reference ConfigNodePropertyBoolean `json:"reference,omitempty"`

	Interval ConfigNodePropertyInteger `json:"interval,omitempty"`

	Expression ConfigNodePropertyString `json:"expression,omitempty"`

	Source ConfigNodePropertyString `json:"source,omitempty"`

	Target ConfigNodePropertyString `json:"target,omitempty"`

	Login ConfigNodePropertyString `json:"login,omitempty"`

	Password ConfigNodePropertyString `json:"password,omitempty"`
}
