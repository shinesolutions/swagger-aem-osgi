//
// ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation


open class ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties: JSONEncodable {

    public var cqDamImageCacheMaxMemory: ConfigNodePropertyInteger?
    public var cqDamImageCacheMaxAge: ConfigNodePropertyInteger?
    public var cqDamImageCacheMaxDimension: ConfigNodePropertyString?

    public init() {}

    // MARK: JSONEncodable
    open func encodeToJSON() -> Any {
        var nillableDictionary = [String:Any?]()
        nillableDictionary["cq.dam.image.cache.max.memory"] = self.cqDamImageCacheMaxMemory?.encodeToJSON()
        nillableDictionary["cq.dam.image.cache.max.age"] = self.cqDamImageCacheMaxAge?.encodeToJSON()
        nillableDictionary["cq.dam.image.cache.max.dimension"] = self.cqDamImageCacheMaxDimension?.encodeToJSON()

        let dictionary: [String:Any] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}
