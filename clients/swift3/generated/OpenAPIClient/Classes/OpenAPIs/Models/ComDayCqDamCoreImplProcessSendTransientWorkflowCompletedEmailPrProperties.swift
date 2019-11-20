//
// ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation


open class ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties: JSONEncodable {

    public var processLabel: ConfigNodePropertyString?
    public var notifyOnComplete: ConfigNodePropertyBoolean?

    public init() {}

    // MARK: JSONEncodable
    open func encodeToJSON() -> Any {
        var nillableDictionary = [String:Any?]()
        nillableDictionary["process.label"] = self.processLabel?.encodeToJSON()
        nillableDictionary["Notify on Complete"] = self.notifyOnComplete?.encodeToJSON()

        let dictionary: [String:Any] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}
