//
// ComAdobeCqSocialSyncImplGroupSyncListenerImplProperties.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation


public class ComAdobeCqSocialSyncImplGroupSyncListenerImplProperties: JSONEncodable {
    public var nodetypes: ConfigNodePropertyArray?
    public var ignorableprops: ConfigNodePropertyArray?
    public var ignorablenodes: ConfigNodePropertyString?
    public var enabled: ConfigNodePropertyBoolean?
    public var distfolders: ConfigNodePropertyString?

    public init() {}

    // MARK: JSONEncodable
    func encodeToJSON() -> AnyObject {
        var nillableDictionary = [String:AnyObject?]()
        nillableDictionary["nodetypes"] = self.nodetypes?.encodeToJSON()
        nillableDictionary["ignorableprops"] = self.ignorableprops?.encodeToJSON()
        nillableDictionary["ignorablenodes"] = self.ignorablenodes?.encodeToJSON()
        nillableDictionary["enabled"] = self.enabled?.encodeToJSON()
        nillableDictionary["distfolders"] = self.distfolders?.encodeToJSON()
        let dictionary: [String:AnyObject] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}