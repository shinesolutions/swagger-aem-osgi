//
// ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckInfo.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation


open class ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckInfo: JSONEncodable {

    public var pid: String?
    public var title: String?
    public var description: String?
    public var properties: ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckProperties?
    public var additionalProperties: String?
    public var bundleLocation: String?
    public var serviceLocation: String?

    public init() {}

    // MARK: JSONEncodable
    open func encodeToJSON() -> Any {
        var nillableDictionary = [String:Any?]()
        nillableDictionary["pid"] = self.pid
        nillableDictionary["title"] = self.title
        nillableDictionary["description"] = self.description
        nillableDictionary["properties"] = self.properties?.encodeToJSON()
        nillableDictionary["additionalProperties"] = self.additionalProperties
        nillableDictionary["bundle_location"] = self.bundleLocation
        nillableDictionary["service_location"] = self.serviceLocation

        let dictionary: [String:Any] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}
