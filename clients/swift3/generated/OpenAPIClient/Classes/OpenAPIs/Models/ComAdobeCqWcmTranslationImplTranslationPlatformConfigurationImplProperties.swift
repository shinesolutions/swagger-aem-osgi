//
// ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation


open class ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties: JSONEncodable {

    public var syncTranslationStateSchedulingFormat: ConfigNodePropertyString?
    public var schedulingRepeatTranslationSchedulingFormat: ConfigNodePropertyString?
    public var syncTranslationStateLockTimeoutInMinutes: ConfigNodePropertyString?
    public var exportFormat: ConfigNodePropertyDropDown?

    public init() {}

    // MARK: JSONEncodable
    open func encodeToJSON() -> Any {
        var nillableDictionary = [String:Any?]()
        nillableDictionary["syncTranslationState.schedulingFormat"] = self.syncTranslationStateSchedulingFormat?.encodeToJSON()
        nillableDictionary["schedulingRepeatTranslation.schedulingFormat"] = self.schedulingRepeatTranslationSchedulingFormat?.encodeToJSON()
        nillableDictionary["syncTranslationState.lockTimeoutInMinutes"] = self.syncTranslationStateLockTimeoutInMinutes?.encodeToJSON()
        nillableDictionary["export.format"] = self.exportFormat?.encodeToJSON()

        let dictionary: [String:Any] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}
