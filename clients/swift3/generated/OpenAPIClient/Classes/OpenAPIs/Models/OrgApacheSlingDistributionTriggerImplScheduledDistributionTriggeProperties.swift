//
// OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation


open class OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties: JSONEncodable {

    public var name: ConfigNodePropertyString?
    public var path: ConfigNodePropertyString?
    public var seconds: ConfigNodePropertyString?
    public var serviceName: ConfigNodePropertyString?

    public init() {}

    // MARK: JSONEncodable
    open func encodeToJSON() -> Any {
        var nillableDictionary = [String:Any?]()
        nillableDictionary["name"] = self.name?.encodeToJSON()
        nillableDictionary["path"] = self.path?.encodeToJSON()
        nillableDictionary["seconds"] = self.seconds?.encodeToJSON()
        nillableDictionary["serviceName"] = self.serviceName?.encodeToJSON()

        let dictionary: [String:Any] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}
