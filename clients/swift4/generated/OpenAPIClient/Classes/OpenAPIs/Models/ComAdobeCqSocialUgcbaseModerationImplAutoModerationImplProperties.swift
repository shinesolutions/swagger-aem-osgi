//
// ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation



public struct ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties: Codable {

    public var automoderationSequence: ConfigNodePropertyArray?
    public var automoderationOnfailurestop: ConfigNodePropertyBoolean?

    public init(automoderationSequence: ConfigNodePropertyArray?, automoderationOnfailurestop: ConfigNodePropertyBoolean?) {
        self.automoderationSequence = automoderationSequence
        self.automoderationOnfailurestop = automoderationOnfailurestop
    }

    public enum CodingKeys: String, CodingKey { 
        case automoderationSequence = "automoderation.sequence"
        case automoderationOnfailurestop = "automoderation.onfailurestop"
    }


}
