//
// GuideLocalizationServiceInfo.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation



public struct GuideLocalizationServiceInfo: Codable {

    public var pid: String?
    public var title: String?
    public var _description: String?
    public var properties: GuideLocalizationServiceProperties?

    public init(pid: String?, title: String?, _description: String?, properties: GuideLocalizationServiceProperties?) {
        self.pid = pid
        self.title = title
        self._description = _description
        self.properties = properties
    }

    public enum CodingKeys: String, CodingKey { 
        case pid
        case title
        case _description = "description"
        case properties
    }


}
