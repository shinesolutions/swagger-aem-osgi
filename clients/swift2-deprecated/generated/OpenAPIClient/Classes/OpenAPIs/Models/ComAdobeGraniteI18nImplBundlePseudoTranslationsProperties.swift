//
// ComAdobeGraniteI18nImplBundlePseudoTranslationsProperties.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation


public class ComAdobeGraniteI18nImplBundlePseudoTranslationsProperties: JSONEncodable {
    public var pseudoPatterns: ConfigNodePropertyArray?

    public init() {}

    // MARK: JSONEncodable
    func encodeToJSON() -> AnyObject {
        var nillableDictionary = [String:AnyObject?]()
        nillableDictionary["pseudo.patterns"] = self.pseudoPatterns?.encodeToJSON()
        let dictionary: [String:AnyObject] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}