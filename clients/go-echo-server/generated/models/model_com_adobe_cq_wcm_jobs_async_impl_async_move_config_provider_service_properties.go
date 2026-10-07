package models

type ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties struct {

	Threshold ConfigNodePropertyInteger `json:"threshold,omitempty"`

	JobTopicName ConfigNodePropertyString `json:"jobTopicName,omitempty"`

	EmailEnabled ConfigNodePropertyBoolean `json:"emailEnabled,omitempty"`
}
