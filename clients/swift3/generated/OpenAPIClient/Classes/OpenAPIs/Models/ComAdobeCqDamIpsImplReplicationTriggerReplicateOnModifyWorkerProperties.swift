//
// ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation


open class ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties: JSONEncodable {

    public var dmreplicateonmodifyEnabled: ConfigNodePropertyBoolean?
    public var dmreplicateonmodifyForcesyncdeletes: ConfigNodePropertyBoolean?

    public init() {}

    // MARK: JSONEncodable
    open func encodeToJSON() -> Any {
        var nillableDictionary = [String:Any?]()
        nillableDictionary["dmreplicateonmodify.enabled"] = self.dmreplicateonmodifyEnabled?.encodeToJSON()
        nillableDictionary["dmreplicateonmodify.forcesyncdeletes"] = self.dmreplicateonmodifyForcesyncdeletes?.encodeToJSON()

        let dictionary: [String:Any] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}

