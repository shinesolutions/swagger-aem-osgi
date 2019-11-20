//
// ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation



public struct ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties: Codable {

    public var attachmentTypeBlacklist: ConfigNodePropertyString?
    public var extensionOrder: ConfigNodePropertyInteger?

    public init(attachmentTypeBlacklist: ConfigNodePropertyString?, extensionOrder: ConfigNodePropertyInteger?) {
        self.attachmentTypeBlacklist = attachmentTypeBlacklist
        self.extensionOrder = extensionOrder
    }

    public enum CodingKeys: String, CodingKey { 
        case attachmentTypeBlacklist
        case extensionOrder = "extension.order"
    }


}
