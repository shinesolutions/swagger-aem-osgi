//
// ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation


open class ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties: JSONEncodable {

    public var parameterGuavaCacheEnabled: ConfigNodePropertyBoolean?
    public var parameterGuavaCacheParams: ConfigNodePropertyString?
    public var parameterGuavaCacheReload: ConfigNodePropertyBoolean?
    public var serviceRanking: ConfigNodePropertyInteger?

    public init() {}

    // MARK: JSONEncodable
    open func encodeToJSON() -> Any {
        var nillableDictionary = [String:Any?]()
        nillableDictionary["parameter.guava.cache.enabled"] = self.parameterGuavaCacheEnabled?.encodeToJSON()
        nillableDictionary["parameter.guava.cache.params"] = self.parameterGuavaCacheParams?.encodeToJSON()
        nillableDictionary["parameter.guava.cache.reload"] = self.parameterGuavaCacheReload?.encodeToJSON()
        nillableDictionary["service.ranking"] = self.serviceRanking?.encodeToJSON()

        let dictionary: [String:Any] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}
