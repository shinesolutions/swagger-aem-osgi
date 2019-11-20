//
// OrgApacheSlingDistributionPackagingImplImporterLocalDistributioProperties.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation


open class OrgApacheSlingDistributionPackagingImplImporterLocalDistributioProperties: JSONEncodable {

    public var name: ConfigNodePropertyString?
    public var packageBuilderTarget: ConfigNodePropertyString?

    public init() {}

    // MARK: JSONEncodable
    open func encodeToJSON() -> Any {
        var nillableDictionary = [String:Any?]()
        nillableDictionary["name"] = self.name?.encodeToJSON()
        nillableDictionary["packageBuilder.target"] = self.packageBuilderTarget?.encodeToJSON()

        let dictionary: [String:Any] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}
