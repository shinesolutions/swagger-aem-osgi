//
// ComAdobeCqSocialUserImplTransportHttpToPublisherProperties.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation


public class ComAdobeCqSocialUserImplTransportHttpToPublisherProperties: JSONEncodable {
    public var enable: ConfigNodePropertyBoolean?
    public var agentConfiguration: ConfigNodePropertyArray?
    public var contextPath: ConfigNodePropertyString?
    public var disabledCipherSuites: ConfigNodePropertyArray?
    public var enabledCipherSuites: ConfigNodePropertyArray?

    public init() {}

    // MARK: JSONEncodable
    func encodeToJSON() -> AnyObject {
        var nillableDictionary = [String:AnyObject?]()
        nillableDictionary["enable"] = self.enable?.encodeToJSON()
        nillableDictionary["agent.configuration"] = self.agentConfiguration?.encodeToJSON()
        nillableDictionary["context.path"] = self.contextPath?.encodeToJSON()
        nillableDictionary["disabled.cipher.suites"] = self.disabledCipherSuites?.encodeToJSON()
        nillableDictionary["enabled.cipher.suites"] = self.enabledCipherSuites?.encodeToJSON()
        let dictionary: [String:AnyObject] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}