//
// ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation


public class ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties: JSONEncodable {
    public var effectiveBundleListPath: ConfigNodePropertyString?

    public init() {}

    // MARK: JSONEncodable
    func encodeToJSON() -> AnyObject {
        var nillableDictionary = [String:AnyObject?]()
        nillableDictionary["effectiveBundleListPath"] = self.effectiveBundleListPath?.encodeToJSON()
        let dictionary: [String:AnyObject] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}