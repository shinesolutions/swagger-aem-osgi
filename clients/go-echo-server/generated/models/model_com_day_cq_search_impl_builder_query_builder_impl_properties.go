package models

type ComDayCqSearchImplBuilderQueryBuilderImplProperties struct {

	ExcerptProperties ConfigNodePropertyArray `json:"excerpt.properties,omitempty"`

	CacheMaxEntries ConfigNodePropertyInteger `json:"cache.max.entries,omitempty"`

	CacheEntryLifetime ConfigNodePropertyInteger `json:"cache.entry.lifetime,omitempty"`

	XpathUnion ConfigNodePropertyBoolean `json:"xpath.union,omitempty"`
}
