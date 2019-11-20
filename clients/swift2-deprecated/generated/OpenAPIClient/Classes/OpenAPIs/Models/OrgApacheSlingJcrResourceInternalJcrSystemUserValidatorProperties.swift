//
// OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation


public class OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties: JSONEncodable {
    public var allowOnlySystemUser: ConfigNodePropertyBoolean?

    public init() {}

    // MARK: JSONEncodable
    func encodeToJSON() -> AnyObject {
        var nillableDictionary = [String:AnyObject?]()
        nillableDictionary["allow.only.system.user"] = self.allowOnlySystemUser?.encodeToJSON()
        let dictionary: [String:AnyObject] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}