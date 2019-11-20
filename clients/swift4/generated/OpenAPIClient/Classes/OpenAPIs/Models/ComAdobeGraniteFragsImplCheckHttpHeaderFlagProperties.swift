//
// ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation



public struct ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties: Codable {

    public var featureName: ConfigNodePropertyString?
    public var featureDescription: ConfigNodePropertyString?
    public var httpHeaderName: ConfigNodePropertyString?
    public var httpHeaderValuepattern: ConfigNodePropertyString?

    public init(featureName: ConfigNodePropertyString?, featureDescription: ConfigNodePropertyString?, httpHeaderName: ConfigNodePropertyString?, httpHeaderValuepattern: ConfigNodePropertyString?) {
        self.featureName = featureName
        self.featureDescription = featureDescription
        self.httpHeaderName = httpHeaderName
        self.httpHeaderValuepattern = httpHeaderValuepattern
    }

    public enum CodingKeys: String, CodingKey { 
        case featureName = "feature.name"
        case featureDescription = "feature.description"
        case httpHeaderName = "http.header.name"
        case httpHeaderValuepattern = "http.header.valuepattern"
    }


}
