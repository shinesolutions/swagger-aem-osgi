package models

type ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties struct {

	SyncTranslationStateSchedulingFormat ConfigNodePropertyString `json:"syncTranslationState.schedulingFormat,omitempty"`

	SchedulingRepeatTranslationSchedulingFormat ConfigNodePropertyString `json:"schedulingRepeatTranslation.schedulingFormat,omitempty"`

	SyncTranslationStateLockTimeoutInMinutes ConfigNodePropertyString `json:"syncTranslationState.lockTimeoutInMinutes,omitempty"`

	ExportFormat ConfigNodePropertyDropDown `json:"export.format,omitempty"`
}
