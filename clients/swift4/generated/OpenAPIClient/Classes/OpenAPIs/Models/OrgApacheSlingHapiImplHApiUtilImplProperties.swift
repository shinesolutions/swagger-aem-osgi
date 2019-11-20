//
// OrgApacheSlingHapiImplHApiUtilImplProperties.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation



public struct OrgApacheSlingHapiImplHApiUtilImplProperties: Codable {

    public var orgApacheSlingHapiToolsResourcetype: ConfigNodePropertyString?
    public var orgApacheSlingHapiToolsCollectionresourcetype: ConfigNodePropertyString?
    public var orgApacheSlingHapiToolsSearchpaths: ConfigNodePropertyArray?
    public var orgApacheSlingHapiToolsExternalurl: ConfigNodePropertyString?
    public var orgApacheSlingHapiToolsEnabled: ConfigNodePropertyBoolean?

    public init(orgApacheSlingHapiToolsResourcetype: ConfigNodePropertyString?, orgApacheSlingHapiToolsCollectionresourcetype: ConfigNodePropertyString?, orgApacheSlingHapiToolsSearchpaths: ConfigNodePropertyArray?, orgApacheSlingHapiToolsExternalurl: ConfigNodePropertyString?, orgApacheSlingHapiToolsEnabled: ConfigNodePropertyBoolean?) {
        self.orgApacheSlingHapiToolsResourcetype = orgApacheSlingHapiToolsResourcetype
        self.orgApacheSlingHapiToolsCollectionresourcetype = orgApacheSlingHapiToolsCollectionresourcetype
        self.orgApacheSlingHapiToolsSearchpaths = orgApacheSlingHapiToolsSearchpaths
        self.orgApacheSlingHapiToolsExternalurl = orgApacheSlingHapiToolsExternalurl
        self.orgApacheSlingHapiToolsEnabled = orgApacheSlingHapiToolsEnabled
    }

    public enum CodingKeys: String, CodingKey { 
        case orgApacheSlingHapiToolsResourcetype = "org.apache.sling.hapi.tools.resourcetype"
        case orgApacheSlingHapiToolsCollectionresourcetype = "org.apache.sling.hapi.tools.collectionresourcetype"
        case orgApacheSlingHapiToolsSearchpaths = "org.apache.sling.hapi.tools.searchpaths"
        case orgApacheSlingHapiToolsExternalurl = "org.apache.sling.hapi.tools.externalurl"
        case orgApacheSlingHapiToolsEnabled = "org.apache.sling.hapi.tools.enabled"
    }


}
