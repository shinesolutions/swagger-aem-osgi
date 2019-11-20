//
// ComAdobeCqDtmImplServiceDTMWebServiceImplProperties.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation



public struct ComAdobeCqDtmImplServiceDTMWebServiceImplProperties: Codable {

    public var connectionTimeout: ConfigNodePropertyInteger?
    public var socketTimeout: ConfigNodePropertyInteger?

    public init(connectionTimeout: ConfigNodePropertyInteger?, socketTimeout: ConfigNodePropertyInteger?) {
        self.connectionTimeout = connectionTimeout
        self.socketTimeout = socketTimeout
    }

    public enum CodingKeys: String, CodingKey { 
        case connectionTimeout = "connection.timeout"
        case socketTimeout = "socket.timeout"
    }


}
