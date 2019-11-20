//
// ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation


open class ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties: JSONEncodable {

    public var maxRetry: ConfigNodePropertyInteger?
    public var fieldWhitelist: ConfigNodePropertyArray?
    public var attachmentTypeBlacklist: ConfigNodePropertyArray?

    public init() {}

    // MARK: JSONEncodable
    open func encodeToJSON() -> Any {
        var nillableDictionary = [String:Any?]()
        nillableDictionary["MaxRetry"] = self.maxRetry?.encodeToJSON()
        nillableDictionary["fieldWhitelist"] = self.fieldWhitelist?.encodeToJSON()
        nillableDictionary["attachmentTypeBlacklist"] = self.attachmentTypeBlacklist?.encodeToJSON()

        let dictionary: [String:Any] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}
