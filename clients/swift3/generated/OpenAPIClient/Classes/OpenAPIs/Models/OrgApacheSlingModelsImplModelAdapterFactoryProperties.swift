//
// OrgApacheSlingModelsImplModelAdapterFactoryProperties.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation


open class OrgApacheSlingModelsImplModelAdapterFactoryProperties: JSONEncodable {

    public var osgiHttpWhiteboardListener: ConfigNodePropertyString?
    public var osgiHttpWhiteboardContextSelect: ConfigNodePropertyString?
    public var maxRecursionDepth: ConfigNodePropertyInteger?
    public var cleanupJobPeriod: ConfigNodePropertyInteger?

    public init() {}

    // MARK: JSONEncodable
    open func encodeToJSON() -> Any {
        var nillableDictionary = [String:Any?]()
        nillableDictionary["osgi.http.whiteboard.listener"] = self.osgiHttpWhiteboardListener?.encodeToJSON()
        nillableDictionary["osgi.http.whiteboard.context.select"] = self.osgiHttpWhiteboardContextSelect?.encodeToJSON()
        nillableDictionary["max.recursion.depth"] = self.maxRecursionDepth?.encodeToJSON()
        nillableDictionary["cleanup.job.period"] = self.cleanupJobPeriod?.encodeToJSON()

        let dictionary: [String:Any] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}
