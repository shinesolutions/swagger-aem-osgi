package models

type ComDayCqDamIdsImplIdsJobProcessorProperties struct {

	EnableMultisession ConfigNodePropertyBoolean `json:"enable.multisession,omitempty"`

	IdsCcEnable ConfigNodePropertyBoolean `json:"ids.cc.enable,omitempty"`

	EnableRetry ConfigNodePropertyBoolean `json:"enable.retry,omitempty"`

	EnableRetryScripterror ConfigNodePropertyBoolean `json:"enable.retry.scripterror,omitempty"`

	ExternalizerDomainCqhost ConfigNodePropertyString `json:"externalizer.domain.cqhost,omitempty"`

	ExternalizerDomainHttp ConfigNodePropertyString `json:"externalizer.domain.http,omitempty"`
}
