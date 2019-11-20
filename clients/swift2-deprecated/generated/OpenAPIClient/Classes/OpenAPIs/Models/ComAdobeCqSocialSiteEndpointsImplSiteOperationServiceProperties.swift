//
// ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation


public class ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties: JSONEncodable {
    public var fieldWhitelist: ConfigNodePropertyArray?
    public var sitePathFilters: ConfigNodePropertyArray?
    public var sitePackageGroup: ConfigNodePropertyString?

    public init() {}

    // MARK: JSONEncodable
    func encodeToJSON() -> AnyObject {
        var nillableDictionary = [String:AnyObject?]()
        nillableDictionary["fieldWhitelist"] = self.fieldWhitelist?.encodeToJSON()
        nillableDictionary["sitePathFilters"] = self.sitePathFilters?.encodeToJSON()
        nillableDictionary["sitePackageGroup"] = self.sitePackageGroup?.encodeToJSON()
        let dictionary: [String:AnyObject] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}