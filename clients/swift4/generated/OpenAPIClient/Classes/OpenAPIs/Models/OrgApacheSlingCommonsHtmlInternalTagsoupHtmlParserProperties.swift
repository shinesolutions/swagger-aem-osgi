//
// OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation



public struct OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties: Codable {

    public var parserFeatures: ConfigNodePropertyArray?

    public init(parserFeatures: ConfigNodePropertyArray?) {
        self.parserFeatures = parserFeatures
    }

    public enum CodingKeys: String, CodingKey { 
        case parserFeatures = "parser.features"
    }


}
