//
// ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation


public class ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties: JSONEncodable {
    public var cqPagesupdatehandlerImageresourcetypes: ConfigNodePropertyArray?
    public var cqPagesupdatehandlerProductresourcetypes: ConfigNodePropertyArray?
    public var cqPagesupdatehandlerVideoresourcetypes: ConfigNodePropertyArray?
    public var cqPagesupdatehandlerDynamicsequenceresourcetypes: ConfigNodePropertyArray?
    public var cqPagesupdatehandlerPreviewmodepaths: ConfigNodePropertyArray?

    public init() {}

    // MARK: JSONEncodable
    func encodeToJSON() -> AnyObject {
        var nillableDictionary = [String:AnyObject?]()
        nillableDictionary["cq.pagesupdatehandler.imageresourcetypes"] = self.cqPagesupdatehandlerImageresourcetypes?.encodeToJSON()
        nillableDictionary["cq.pagesupdatehandler.productresourcetypes"] = self.cqPagesupdatehandlerProductresourcetypes?.encodeToJSON()
        nillableDictionary["cq.pagesupdatehandler.videoresourcetypes"] = self.cqPagesupdatehandlerVideoresourcetypes?.encodeToJSON()
        nillableDictionary["cq.pagesupdatehandler.dynamicsequenceresourcetypes"] = self.cqPagesupdatehandlerDynamicsequenceresourcetypes?.encodeToJSON()
        nillableDictionary["cq.pagesupdatehandler.previewmodepaths"] = self.cqPagesupdatehandlerPreviewmodepaths?.encodeToJSON()
        let dictionary: [String:AnyObject] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}