//
// ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation



public struct ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties: Codable {

    public var cqAnalyticsSitecatalystServiceDatacenterUrl: ConfigNodePropertyArray?
    public var devhostnamepatterns: ConfigNodePropertyArray?
    public var connectionTimeout: ConfigNodePropertyInteger?
    public var socketTimeout: ConfigNodePropertyInteger?

    public init(cqAnalyticsSitecatalystServiceDatacenterUrl: ConfigNodePropertyArray?, devhostnamepatterns: ConfigNodePropertyArray?, connectionTimeout: ConfigNodePropertyInteger?, socketTimeout: ConfigNodePropertyInteger?) {
        self.cqAnalyticsSitecatalystServiceDatacenterUrl = cqAnalyticsSitecatalystServiceDatacenterUrl
        self.devhostnamepatterns = devhostnamepatterns
        self.connectionTimeout = connectionTimeout
        self.socketTimeout = socketTimeout
    }

    public enum CodingKeys: String, CodingKey { 
        case cqAnalyticsSitecatalystServiceDatacenterUrl = "cq.analytics.sitecatalyst.service.datacenter.url"
        case devhostnamepatterns
        case connectionTimeout = "connection.timeout"
        case socketTimeout = "socket.timeout"
    }


}
