//
// OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation


public class OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties: JSONEncodable {
    public var poolName: ConfigNodePropertyString?
    public var allowedPoolNames: ConfigNodePropertyArray?
    public var schedulerUseleaderforsingle: ConfigNodePropertyBoolean?
    public var metricsFilters: ConfigNodePropertyArray?
    public var slowThresholdMillis: ConfigNodePropertyInteger?

    public init() {}

    // MARK: JSONEncodable
    func encodeToJSON() -> AnyObject {
        var nillableDictionary = [String:AnyObject?]()
        nillableDictionary["poolName"] = self.poolName?.encodeToJSON()
        nillableDictionary["allowedPoolNames"] = self.allowedPoolNames?.encodeToJSON()
        nillableDictionary["scheduler.useleaderforsingle"] = self.schedulerUseleaderforsingle?.encodeToJSON()
        nillableDictionary["metrics.filters"] = self.metricsFilters?.encodeToJSON()
        nillableDictionary["slowThresholdMillis"] = self.slowThresholdMillis?.encodeToJSON()
        let dictionary: [String:AnyObject] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}