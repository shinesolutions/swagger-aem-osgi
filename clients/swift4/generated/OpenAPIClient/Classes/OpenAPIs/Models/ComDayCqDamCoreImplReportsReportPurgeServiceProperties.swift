//
// ComDayCqDamCoreImplReportsReportPurgeServiceProperties.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation



public struct ComDayCqDamCoreImplReportsReportPurgeServiceProperties: Codable {

    public var schedulerExpression: ConfigNodePropertyString?
    public var maxSavedReports: ConfigNodePropertyInteger?
    public var timeDuration: ConfigNodePropertyInteger?
    public var enableReportPurge: ConfigNodePropertyBoolean?

    public init(schedulerExpression: ConfigNodePropertyString?, maxSavedReports: ConfigNodePropertyInteger?, timeDuration: ConfigNodePropertyInteger?, enableReportPurge: ConfigNodePropertyBoolean?) {
        self.schedulerExpression = schedulerExpression
        self.maxSavedReports = maxSavedReports
        self.timeDuration = timeDuration
        self.enableReportPurge = enableReportPurge
    }

    public enum CodingKeys: String, CodingKey { 
        case schedulerExpression = "scheduler.expression"
        case maxSavedReports
        case timeDuration
        case enableReportPurge
    }


}
