package models

type GuideLocalizationServiceProperties struct {

	SupportedLocales ConfigNodePropertyArray `json:"supportedLocales,omitempty"`

	LocalizableProperties ConfigNodePropertyArray `json:"Localizable Properties,omitempty"`
}
