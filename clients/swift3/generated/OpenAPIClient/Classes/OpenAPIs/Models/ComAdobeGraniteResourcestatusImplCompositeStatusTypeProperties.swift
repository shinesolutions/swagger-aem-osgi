//
// ComAdobeGraniteResourcestatusImplCompositeStatusTypeProperties.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation


open class ComAdobeGraniteResourcestatusImplCompositeStatusTypeProperties: JSONEncodable {

    public var name: ConfigNodePropertyString?
    public var types: ConfigNodePropertyArray?

    public init() {}

    // MARK: JSONEncodable
    open func encodeToJSON() -> Any {
        var nillableDictionary = [String:Any?]()
        nillableDictionary["name"] = self.name?.encodeToJSON()
        nillableDictionary["types"] = self.types?.encodeToJSON()

        let dictionary: [String:Any] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}
