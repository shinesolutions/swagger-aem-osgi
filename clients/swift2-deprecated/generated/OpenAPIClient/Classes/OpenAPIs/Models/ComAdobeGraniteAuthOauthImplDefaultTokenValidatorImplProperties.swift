//
// ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation


public class ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties: JSONEncodable {
    public var authTokenValidatorType: ConfigNodePropertyString?

    public init() {}

    // MARK: JSONEncodable
    func encodeToJSON() -> AnyObject {
        var nillableDictionary = [String:AnyObject?]()
        nillableDictionary["auth.token.validator.type"] = self.authTokenValidatorType?.encodeToJSON()
        let dictionary: [String:AnyObject] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}