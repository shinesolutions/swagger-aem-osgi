//
// ComDayCqWcmCoreImplCommandsWCMCommandServletProperties.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation


open class ComDayCqWcmCoreImplCommandsWCMCommandServletProperties: JSONEncodable {

    public var wcmcommandservletDeleteWhitelist: ConfigNodePropertyArray?

    public init() {}

    // MARK: JSONEncodable
    open func encodeToJSON() -> Any {
        var nillableDictionary = [String:Any?]()
        nillableDictionary["wcmcommandservlet.delete_whitelist"] = self.wcmcommandservletDeleteWhitelist?.encodeToJSON()

        let dictionary: [String:Any] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}
