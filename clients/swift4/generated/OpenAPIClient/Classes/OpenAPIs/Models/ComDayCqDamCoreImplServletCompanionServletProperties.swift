//
// ComDayCqDamCoreImplServletCompanionServletProperties.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation



public struct ComDayCqDamCoreImplServletCompanionServletProperties: Codable {

    public var moreInfo: ConfigNodePropertyString?
    public var mntoverlaydamguicontentassetsmoreinfoHtmlpath: ConfigNodePropertyString?

    public init(moreInfo: ConfigNodePropertyString?, mntoverlaydamguicontentassetsmoreinfoHtmlpath: ConfigNodePropertyString?) {
        self.moreInfo = moreInfo
        self.mntoverlaydamguicontentassetsmoreinfoHtmlpath = mntoverlaydamguicontentassetsmoreinfoHtmlpath
    }

    public enum CodingKeys: String, CodingKey { 
        case moreInfo = "More Info"
        case mntoverlaydamguicontentassetsmoreinfoHtmlpath = "/mnt/overlay/dam/gui/content/assets/moreinfo.html/${path}"
    }


}
