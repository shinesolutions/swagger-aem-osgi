//
// ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleTagHandlProperties.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation



public struct ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleTagHandlProperties: Codable {

    public var serviceRanking: ConfigNodePropertyInteger?
    public var tagpattern: ConfigNodePropertyString?

    public init(serviceRanking: ConfigNodePropertyInteger?, tagpattern: ConfigNodePropertyString?) {
        self.serviceRanking = serviceRanking
        self.tagpattern = tagpattern
    }

    public enum CodingKeys: String, CodingKey { 
        case serviceRanking = "service.ranking"
        case tagpattern
    }


}
