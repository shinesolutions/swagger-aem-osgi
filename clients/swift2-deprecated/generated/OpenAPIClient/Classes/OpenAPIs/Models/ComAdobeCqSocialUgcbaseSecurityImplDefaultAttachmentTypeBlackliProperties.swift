//
// ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliProperties.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation


public class ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliProperties: JSONEncodable {
    public var defaultAttachmentTypeBlacklist: ConfigNodePropertyArray?
    public var baselineAttachmentTypeBlacklist: ConfigNodePropertyArray?

    public init() {}

    // MARK: JSONEncodable
    func encodeToJSON() -> AnyObject {
        var nillableDictionary = [String:AnyObject?]()
        nillableDictionary["default.attachment.type.blacklist"] = self.defaultAttachmentTypeBlacklist?.encodeToJSON()
        nillableDictionary["baseline.attachment.type.blacklist"] = self.baselineAttachmentTypeBlacklist?.encodeToJSON()
        let dictionary: [String:AnyObject] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}