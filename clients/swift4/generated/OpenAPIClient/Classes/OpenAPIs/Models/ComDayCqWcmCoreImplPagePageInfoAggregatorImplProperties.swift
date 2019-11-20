//
// ComDayCqWcmCoreImplPagePageInfoAggregatorImplProperties.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation



public struct ComDayCqWcmCoreImplPagePageInfoAggregatorImplProperties: Codable {

    public var pageInfoProviderPropertyRegexDefault: ConfigNodePropertyString?
    public var pageInfoProviderPropertyName: ConfigNodePropertyString?

    public init(pageInfoProviderPropertyRegexDefault: ConfigNodePropertyString?, pageInfoProviderPropertyName: ConfigNodePropertyString?) {
        self.pageInfoProviderPropertyRegexDefault = pageInfoProviderPropertyRegexDefault
        self.pageInfoProviderPropertyName = pageInfoProviderPropertyName
    }

    public enum CodingKeys: String, CodingKey { 
        case pageInfoProviderPropertyRegexDefault = "page.info.provider.property.regex.default"
        case pageInfoProviderPropertyName = "page.info.provider.property.name"
    }


}
