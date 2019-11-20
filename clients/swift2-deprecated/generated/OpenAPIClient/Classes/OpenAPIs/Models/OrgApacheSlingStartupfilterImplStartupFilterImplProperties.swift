//
// OrgApacheSlingStartupfilterImplStartupFilterImplProperties.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation


public class OrgApacheSlingStartupfilterImplStartupFilterImplProperties: JSONEncodable {
    public var activeByDefault: ConfigNodePropertyBoolean?
    public var defaultMessage: ConfigNodePropertyString?

    public init() {}

    // MARK: JSONEncodable
    func encodeToJSON() -> AnyObject {
        var nillableDictionary = [String:AnyObject?]()
        nillableDictionary["active.by.default"] = self.activeByDefault?.encodeToJSON()
        nillableDictionary["default.message"] = self.defaultMessage?.encodeToJSON()
        let dictionary: [String:AnyObject] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}