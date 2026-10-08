package models

type OrgApacheSlingI18nImplJcrResourceBundleProviderProperties struct {

	LocaleDefault ConfigNodePropertyString `json:"locale.default,omitempty"`

	PreloadBundles ConfigNodePropertyBoolean `json:"preload.bundles,omitempty"`

	InvalidationDelay ConfigNodePropertyInteger `json:"invalidation.delay,omitempty"`
}
