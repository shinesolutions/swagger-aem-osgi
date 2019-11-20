//
// ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation



public struct ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties: Codable {

    public var mailerEmailEmbed: ConfigNodePropertyBoolean?
    public var mailerEmailCharset: ConfigNodePropertyString?
    public var mailerEmailRetrieverUserID: ConfigNodePropertyString?
    public var mailerEmailRetrieverUserPWD: ConfigNodePropertyString?

    public init(mailerEmailEmbed: ConfigNodePropertyBoolean?, mailerEmailCharset: ConfigNodePropertyString?, mailerEmailRetrieverUserID: ConfigNodePropertyString?, mailerEmailRetrieverUserPWD: ConfigNodePropertyString?) {
        self.mailerEmailEmbed = mailerEmailEmbed
        self.mailerEmailCharset = mailerEmailCharset
        self.mailerEmailRetrieverUserID = mailerEmailRetrieverUserID
        self.mailerEmailRetrieverUserPWD = mailerEmailRetrieverUserPWD
    }

    public enum CodingKeys: String, CodingKey { 
        case mailerEmailEmbed = "mailer.email.embed"
        case mailerEmailCharset = "mailer.email.charset"
        case mailerEmailRetrieverUserID = "mailer.email.retrieverUserID"
        case mailerEmailRetrieverUserPWD = "mailer.email.retrieverUserPWD"
    }


}
