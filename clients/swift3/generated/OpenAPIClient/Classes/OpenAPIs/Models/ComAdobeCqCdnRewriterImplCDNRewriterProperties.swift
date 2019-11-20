//
// ComAdobeCqCdnRewriterImplCDNRewriterProperties.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation


open class ComAdobeCqCdnRewriterImplCDNRewriterProperties: JSONEncodable {

    public var serviceRanking: ConfigNodePropertyInteger?
    public var cdnrewriterAttributes: ConfigNodePropertyArray?
    public var cdnRewriterDistributionDomain: ConfigNodePropertyString?

    public init() {}

    // MARK: JSONEncodable
    open func encodeToJSON() -> Any {
        var nillableDictionary = [String:Any?]()
        nillableDictionary["service.ranking"] = self.serviceRanking?.encodeToJSON()
        nillableDictionary["cdnrewriter.attributes"] = self.cdnrewriterAttributes?.encodeToJSON()
        nillableDictionary["cdn.rewriter.distribution.domain"] = self.cdnRewriterDistributionDomain?.encodeToJSON()

        let dictionary: [String:Any] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}
