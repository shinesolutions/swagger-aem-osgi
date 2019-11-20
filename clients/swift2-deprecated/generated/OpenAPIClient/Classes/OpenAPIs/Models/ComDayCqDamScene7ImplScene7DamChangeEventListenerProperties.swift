//
// ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation


public class ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties: JSONEncodable {
    public var cqDamScene7DamchangeeventlistenerEnabled: ConfigNodePropertyBoolean?
    public var cqDamScene7DamchangeeventlistenerObservedPaths: ConfigNodePropertyArray?

    public init() {}

    // MARK: JSONEncodable
    func encodeToJSON() -> AnyObject {
        var nillableDictionary = [String:AnyObject?]()
        nillableDictionary["cq.dam.scene7.damchangeeventlistener.enabled"] = self.cqDamScene7DamchangeeventlistenerEnabled?.encodeToJSON()
        nillableDictionary["cq.dam.scene7.damchangeeventlistener.observed.paths"] = self.cqDamScene7DamchangeeventlistenerObservedPaths?.encodeToJSON()
        let dictionary: [String:AnyObject] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}