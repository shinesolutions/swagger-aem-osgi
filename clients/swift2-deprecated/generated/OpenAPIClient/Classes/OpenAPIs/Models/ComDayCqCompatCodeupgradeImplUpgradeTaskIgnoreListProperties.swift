//
// ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation


public class ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties: JSONEncodable {
    public var upgradeTaskIgnoreList: ConfigNodePropertyArray?

    public init() {}

    // MARK: JSONEncodable
    func encodeToJSON() -> AnyObject {
        var nillableDictionary = [String:AnyObject?]()
        nillableDictionary["upgradeTaskIgnoreList"] = self.upgradeTaskIgnoreList?.encodeToJSON()
        let dictionary: [String:AnyObject] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}