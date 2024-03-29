//
// OrgApacheSlingTenantInternalTenantProviderImplProperties.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation


public class OrgApacheSlingTenantInternalTenantProviderImplProperties: JSONEncodable {
    public var tenantRoot: ConfigNodePropertyString?
    public var tenantPathMatcher: ConfigNodePropertyArray?

    public init() {}

    // MARK: JSONEncodable
    func encodeToJSON() -> AnyObject {
        var nillableDictionary = [String:AnyObject?]()
        nillableDictionary["tenant.root"] = self.tenantRoot?.encodeToJSON()
        nillableDictionary["tenant.path.matcher"] = self.tenantPathMatcher?.encodeToJSON()
        let dictionary: [String:AnyObject] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}
