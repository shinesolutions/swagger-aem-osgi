//
// ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation


open class ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties: JSONEncodable {

    public var inboxImplTypeproviderRegistrypaths: ConfigNodePropertyArray?
    public var inboxImplTypeproviderLegacypaths: ConfigNodePropertyArray?
    public var inboxImplTypeproviderDefaulturlFailureitem: ConfigNodePropertyString?
    public var inboxImplTypeproviderDefaulturlWorkitem: ConfigNodePropertyString?
    public var inboxImplTypeproviderDefaulturlTask: ConfigNodePropertyString?

    public init() {}

    // MARK: JSONEncodable
    open func encodeToJSON() -> Any {
        var nillableDictionary = [String:Any?]()
        nillableDictionary["inbox.impl.typeprovider.registrypaths"] = self.inboxImplTypeproviderRegistrypaths?.encodeToJSON()
        nillableDictionary["inbox.impl.typeprovider.legacypaths"] = self.inboxImplTypeproviderLegacypaths?.encodeToJSON()
        nillableDictionary["inbox.impl.typeprovider.defaulturl.failureitem"] = self.inboxImplTypeproviderDefaulturlFailureitem?.encodeToJSON()
        nillableDictionary["inbox.impl.typeprovider.defaulturl.workitem"] = self.inboxImplTypeproviderDefaulturlWorkitem?.encodeToJSON()
        nillableDictionary["inbox.impl.typeprovider.defaulturl.task"] = self.inboxImplTypeproviderDefaulturlTask?.encodeToJSON()

        let dictionary: [String:Any] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}
