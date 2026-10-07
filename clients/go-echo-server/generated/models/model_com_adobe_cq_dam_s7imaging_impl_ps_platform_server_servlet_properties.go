package models

type ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties struct {

	CacheEnable ConfigNodePropertyBoolean `json:"cache.enable,omitempty"`

	CacheRootPaths ConfigNodePropertyArray `json:"cache.rootPaths,omitempty"`

	CacheMaxSize ConfigNodePropertyInteger `json:"cache.maxSize,omitempty"`

	CacheMaxEntries ConfigNodePropertyInteger `json:"cache.maxEntries,omitempty"`
}
