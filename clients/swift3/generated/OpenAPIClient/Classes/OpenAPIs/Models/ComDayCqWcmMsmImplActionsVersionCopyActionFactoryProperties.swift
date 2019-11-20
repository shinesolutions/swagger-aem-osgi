//
// ComDayCqWcmMsmImplActionsVersionCopyActionFactoryProperties.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation


open class ComDayCqWcmMsmImplActionsVersionCopyActionFactoryProperties: JSONEncodable {

    public var cqWcmMsmActionExcludednodetypes: ConfigNodePropertyArray?
    public var cqWcmMsmActionExcludedparagraphitems: ConfigNodePropertyArray?
    public var cqWcmMsmActionExcludedprops: ConfigNodePropertyArray?

    public init() {}

    // MARK: JSONEncodable
    open func encodeToJSON() -> Any {
        var nillableDictionary = [String:Any?]()
        nillableDictionary["cq.wcm.msm.action.excludednodetypes"] = self.cqWcmMsmActionExcludednodetypes?.encodeToJSON()
        nillableDictionary["cq.wcm.msm.action.excludedparagraphitems"] = self.cqWcmMsmActionExcludedparagraphitems?.encodeToJSON()
        nillableDictionary["cq.wcm.msm.action.excludedprops"] = self.cqWcmMsmActionExcludedprops?.encodeToJSON()

        let dictionary: [String:Any] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}
