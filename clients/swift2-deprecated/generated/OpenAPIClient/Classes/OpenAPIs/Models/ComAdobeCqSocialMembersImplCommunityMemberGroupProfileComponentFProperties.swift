//
// ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation


public class ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties: JSONEncodable {
    public var everyoneLimit: ConfigNodePropertyInteger?
    public var priority: ConfigNodePropertyInteger?

    public init() {}

    // MARK: JSONEncodable
    func encodeToJSON() -> AnyObject {
        var nillableDictionary = [String:AnyObject?]()
        nillableDictionary["everyoneLimit"] = self.everyoneLimit?.encodeToJSON()
        nillableDictionary["priority"] = self.priority?.encodeToJSON()
        let dictionary: [String:AnyObject] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}