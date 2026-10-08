package models

type OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties struct {

	IncludedPaths ConfigNodePropertyArray `json:"includedPaths,omitempty"`

	EnableAsyncObserver ConfigNodePropertyBoolean `json:"enableAsyncObserver,omitempty"`

	ObserverQueueSize ConfigNodePropertyInteger `json:"observerQueueSize,omitempty"`
}
