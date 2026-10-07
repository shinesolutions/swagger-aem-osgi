package models

type ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties struct {

	TranslateLanguage ConfigNodePropertyDropDown `json:"translate.language,omitempty"`

	TranslateDisplay ConfigNodePropertyDropDown `json:"translate.display,omitempty"`

	TranslateAttribution ConfigNodePropertyBoolean `json:"translate.attribution,omitempty"`

	TranslateCaching ConfigNodePropertyDropDown `json:"translate.caching,omitempty"`

	TranslateSmartRendering ConfigNodePropertyDropDown `json:"translate.smart.rendering,omitempty"`

	TranslateCachingDuration ConfigNodePropertyString `json:"translate.caching.duration,omitempty"`

	TranslateSessionSaveInterval ConfigNodePropertyString `json:"translate.session.save.interval,omitempty"`

	TranslateSessionSaveBatchLimit ConfigNodePropertyString `json:"translate.session.save.batchLimit,omitempty"`
}
