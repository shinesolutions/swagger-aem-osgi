//
// ComAdobeGraniteOptoutImplOptOutServiceImplProperties.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation


open class ComAdobeGraniteOptoutImplOptOutServiceImplProperties: JSONEncodable {

    public var optoutCookies: ConfigNodePropertyArray?
    public var optoutHeaders: ConfigNodePropertyArray?
    public var optoutWhitelistCookies: ConfigNodePropertyArray?

    public init() {}

    // MARK: JSONEncodable
    open func encodeToJSON() -> Any {
        var nillableDictionary = [String:Any?]()
        nillableDictionary["optout.cookies"] = self.optoutCookies?.encodeToJSON()
        nillableDictionary["optout.headers"] = self.optoutHeaders?.encodeToJSON()
        nillableDictionary["optout.whitelist.cookies"] = self.optoutWhitelistCookies?.encodeToJSON()

        let dictionary: [String:Any] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}
