//
// ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation


public class ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties: JSONEncodable {
    public var comAdobeGraniteJettySslPort: ConfigNodePropertyInteger?
    public var comAdobeGraniteJettySslKeystoreUser: ConfigNodePropertyString?
    public var comAdobeGraniteJettySslKeystorePassword: ConfigNodePropertyString?
    public var comAdobeGraniteJettySslCiphersuitesExcluded: ConfigNodePropertyArray?
    public var comAdobeGraniteJettySslCiphersuitesIncluded: ConfigNodePropertyArray?
    public var comAdobeGraniteJettySslClientCertificate: ConfigNodePropertyDropDown?

    public init() {}

    // MARK: JSONEncodable
    func encodeToJSON() -> AnyObject {
        var nillableDictionary = [String:AnyObject?]()
        nillableDictionary["com.adobe.granite.jetty.ssl.port"] = self.comAdobeGraniteJettySslPort?.encodeToJSON()
        nillableDictionary["com.adobe.granite.jetty.ssl.keystore.user"] = self.comAdobeGraniteJettySslKeystoreUser?.encodeToJSON()
        nillableDictionary["com.adobe.granite.jetty.ssl.keystore.password"] = self.comAdobeGraniteJettySslKeystorePassword?.encodeToJSON()
        nillableDictionary["com.adobe.granite.jetty.ssl.ciphersuites.excluded"] = self.comAdobeGraniteJettySslCiphersuitesExcluded?.encodeToJSON()
        nillableDictionary["com.adobe.granite.jetty.ssl.ciphersuites.included"] = self.comAdobeGraniteJettySslCiphersuitesIncluded?.encodeToJSON()
        nillableDictionary["com.adobe.granite.jetty.ssl.client.certificate"] = self.comAdobeGraniteJettySslClientCertificate?.encodeToJSON()
        let dictionary: [String:AnyObject] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}