//
// ComAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation



public struct ComAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties: Codable {

    public var offloadingOffloaderEnabled: ConfigNodePropertyBoolean?

    public init(offloadingOffloaderEnabled: ConfigNodePropertyBoolean?) {
        self.offloadingOffloaderEnabled = offloadingOffloaderEnabled
    }

    public enum CodingKeys: String, CodingKey { 
        case offloadingOffloaderEnabled = "offloading.offloader.enabled"
    }


}
