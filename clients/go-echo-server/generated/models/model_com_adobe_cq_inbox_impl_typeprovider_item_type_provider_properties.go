package models

type ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties struct {

	InboxImplTypeproviderRegistrypaths ConfigNodePropertyArray `json:"inbox.impl.typeprovider.registrypaths,omitempty"`

	InboxImplTypeproviderLegacypaths ConfigNodePropertyArray `json:"inbox.impl.typeprovider.legacypaths,omitempty"`

	InboxImplTypeproviderDefaulturlFailureitem ConfigNodePropertyString `json:"inbox.impl.typeprovider.defaulturl.failureitem,omitempty"`

	InboxImplTypeproviderDefaulturlWorkitem ConfigNodePropertyString `json:"inbox.impl.typeprovider.defaulturl.workitem,omitempty"`

	InboxImplTypeproviderDefaulturlTask ConfigNodePropertyString `json:"inbox.impl.typeprovider.defaulturl.task,omitempty"`
}
