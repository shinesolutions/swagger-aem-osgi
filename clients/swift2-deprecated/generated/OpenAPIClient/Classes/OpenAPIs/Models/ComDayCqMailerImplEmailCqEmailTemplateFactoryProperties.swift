//
// ComDayCqMailerImplEmailCqEmailTemplateFactoryProperties.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation


public class ComDayCqMailerImplEmailCqEmailTemplateFactoryProperties: JSONEncodable {
    public var mailerEmailCharset: ConfigNodePropertyString?

    public init() {}

    // MARK: JSONEncodable
    func encodeToJSON() -> AnyObject {
        var nillableDictionary = [String:AnyObject?]()
        nillableDictionary["mailer.email.charset"] = self.mailerEmailCharset?.encodeToJSON()
        let dictionary: [String:AnyObject] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}