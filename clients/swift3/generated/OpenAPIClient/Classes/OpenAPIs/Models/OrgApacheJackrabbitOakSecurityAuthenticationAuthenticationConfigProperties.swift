//
// OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation


open class OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties: JSONEncodable {

    public var orgApacheJackrabbitOakAuthenticationAppName: ConfigNodePropertyString?
    public var orgApacheJackrabbitOakAuthenticationConfigSpiName: ConfigNodePropertyString?

    public init() {}

    // MARK: JSONEncodable
    open func encodeToJSON() -> Any {
        var nillableDictionary = [String:Any?]()
        nillableDictionary["org.apache.jackrabbit.oak.authentication.appName"] = self.orgApacheJackrabbitOakAuthenticationAppName?.encodeToJSON()
        nillableDictionary["org.apache.jackrabbit.oak.authentication.configSpiName"] = self.orgApacheJackrabbitOakAuthenticationConfigSpiName?.encodeToJSON()

        let dictionary: [String:Any] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}
