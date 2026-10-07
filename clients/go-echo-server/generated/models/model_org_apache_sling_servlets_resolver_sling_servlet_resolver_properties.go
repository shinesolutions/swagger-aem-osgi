package models

type OrgApacheSlingServletsResolverSlingServletResolverProperties struct {

	ServletresolverServletRoot ConfigNodePropertyString `json:"servletresolver.servletRoot,omitempty"`

	ServletresolverCacheSize ConfigNodePropertyInteger `json:"servletresolver.cacheSize,omitempty"`

	ServletresolverPaths ConfigNodePropertyArray `json:"servletresolver.paths,omitempty"`

	ServletresolverDefaultExtensions ConfigNodePropertyArray `json:"servletresolver.defaultExtensions,omitempty"`
}
