//
// ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation


public class ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties: JSONEncodable {
    public var securityPreferencesName: ConfigNodePropertyString?

    public init() {}

    // MARK: JSONEncodable
    func encodeToJSON() -> AnyObject {
        var nillableDictionary = [String:AnyObject?]()
        nillableDictionary["security.preferences.name"] = self.securityPreferencesName?.encodeToJSON()
        let dictionary: [String:AnyObject] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}