//
// ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation



public struct ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties: Codable {

    public var corsEnabling: ConfigNodePropertyBoolean?

    public init(corsEnabling: ConfigNodePropertyBoolean?) {
        self.corsEnabling = corsEnabling
    }

    public enum CodingKeys: String, CodingKey { 
        case corsEnabling = "cors.enabling"
    }


}
