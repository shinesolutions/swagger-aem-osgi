//
// ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySInfo.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation


open class ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySInfo: JSONEncodable {

    public var pid: String?
    public var title: String?
    public var description: String?
    public var properties: ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties?

    public init() {}

    // MARK: JSONEncodable
    open func encodeToJSON() -> Any {
        var nillableDictionary = [String:Any?]()
        nillableDictionary["pid"] = self.pid
        nillableDictionary["title"] = self.title
        nillableDictionary["description"] = self.description
        nillableDictionary["properties"] = self.properties?.encodeToJSON()

        let dictionary: [String:Any] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}
