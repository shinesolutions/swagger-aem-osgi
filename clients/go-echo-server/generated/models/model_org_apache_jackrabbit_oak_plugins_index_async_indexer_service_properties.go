package models

type OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties struct {

	AsyncConfigs ConfigNodePropertyArray `json:"asyncConfigs,omitempty"`

	LeaseTimeOutMinutes ConfigNodePropertyInteger `json:"leaseTimeOutMinutes,omitempty"`

	FailingIndexTimeoutSeconds ConfigNodePropertyInteger `json:"failingIndexTimeoutSeconds,omitempty"`

	ErrorWarnIntervalSeconds ConfigNodePropertyInteger `json:"errorWarnIntervalSeconds,omitempty"`
}
