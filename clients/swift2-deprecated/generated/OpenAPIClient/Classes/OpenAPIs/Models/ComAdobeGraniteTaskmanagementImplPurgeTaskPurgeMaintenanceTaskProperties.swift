//
// ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation


public class ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties: JSONEncodable {
    public var purgeCompleted: ConfigNodePropertyBoolean?
    public var completedAge: ConfigNodePropertyInteger?
    public var purgeActive: ConfigNodePropertyBoolean?
    public var activeAge: ConfigNodePropertyInteger?
    public var saveThreshold: ConfigNodePropertyInteger?

    public init() {}

    // MARK: JSONEncodable
    func encodeToJSON() -> AnyObject {
        var nillableDictionary = [String:AnyObject?]()
        nillableDictionary["purgeCompleted"] = self.purgeCompleted?.encodeToJSON()
        nillableDictionary["completedAge"] = self.completedAge?.encodeToJSON()
        nillableDictionary["purgeActive"] = self.purgeActive?.encodeToJSON()
        nillableDictionary["activeAge"] = self.activeAge?.encodeToJSON()
        nillableDictionary["saveThreshold"] = self.saveThreshold?.encodeToJSON()
        let dictionary: [String:AnyObject] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}