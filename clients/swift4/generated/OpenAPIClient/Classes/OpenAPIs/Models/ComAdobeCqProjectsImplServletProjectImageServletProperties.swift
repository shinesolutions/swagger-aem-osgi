//
// ComAdobeCqProjectsImplServletProjectImageServletProperties.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation



public struct ComAdobeCqProjectsImplServletProjectImageServletProperties: Codable {

    public var imageQuality: ConfigNodePropertyString?
    public var imageSupportedResolutions: ConfigNodePropertyString?

    public init(imageQuality: ConfigNodePropertyString?, imageSupportedResolutions: ConfigNodePropertyString?) {
        self.imageQuality = imageQuality
        self.imageSupportedResolutions = imageSupportedResolutions
    }

    public enum CodingKeys: String, CodingKey { 
        case imageQuality = "image.quality"
        case imageSupportedResolutions = "image.supported.resolutions"
    }


}
