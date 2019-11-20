//
// OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation


open class OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties: JSONEncodable {

    public var jaasRanking: ConfigNodePropertyInteger?
    public var jaasControlFlag: ConfigNodePropertyString?
    public var jaasRealmName: ConfigNodePropertyString?
    public var idpName: ConfigNodePropertyString?
    public var syncHandlerName: ConfigNodePropertyString?

    public init() {}

    // MARK: JSONEncodable
    open func encodeToJSON() -> Any {
        var nillableDictionary = [String:Any?]()
        nillableDictionary["jaas.ranking"] = self.jaasRanking?.encodeToJSON()
        nillableDictionary["jaas.controlFlag"] = self.jaasControlFlag?.encodeToJSON()
        nillableDictionary["jaas.realmName"] = self.jaasRealmName?.encodeToJSON()
        nillableDictionary["idp.name"] = self.idpName?.encodeToJSON()
        nillableDictionary["sync.handlerName"] = self.syncHandlerName?.encodeToJSON()

        let dictionary: [String:Any] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}
