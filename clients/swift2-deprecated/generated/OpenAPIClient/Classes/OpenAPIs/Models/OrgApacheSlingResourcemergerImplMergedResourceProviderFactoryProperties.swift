//
// OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation


public class OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties: JSONEncodable {
    public var mergeRoot: ConfigNodePropertyString?
    public var mergeReadOnly: ConfigNodePropertyBoolean?

    public init() {}

    // MARK: JSONEncodable
    func encodeToJSON() -> AnyObject {
        var nillableDictionary = [String:AnyObject?]()
        nillableDictionary["merge.root"] = self.mergeRoot?.encodeToJSON()
        nillableDictionary["merge.readOnly"] = self.mergeReadOnly?.encodeToJSON()
        let dictionary: [String:AnyObject] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}