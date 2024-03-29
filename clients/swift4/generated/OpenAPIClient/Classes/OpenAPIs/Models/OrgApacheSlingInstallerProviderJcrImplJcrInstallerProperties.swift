//
// OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation



public struct OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties: Codable {

    public var handlerSchemes: ConfigNodePropertyArray?
    public var slingJcrinstallFolderNameRegexp: ConfigNodePropertyString?
    public var slingJcrinstallFolderMaxDepth: ConfigNodePropertyInteger?
    public var slingJcrinstallSearchPath: ConfigNodePropertyArray?
    public var slingJcrinstallNewConfigPath: ConfigNodePropertyString?
    public var slingJcrinstallSignalPath: ConfigNodePropertyString?
    public var slingJcrinstallEnableWriteback: ConfigNodePropertyBoolean?

    public init(handlerSchemes: ConfigNodePropertyArray?, slingJcrinstallFolderNameRegexp: ConfigNodePropertyString?, slingJcrinstallFolderMaxDepth: ConfigNodePropertyInteger?, slingJcrinstallSearchPath: ConfigNodePropertyArray?, slingJcrinstallNewConfigPath: ConfigNodePropertyString?, slingJcrinstallSignalPath: ConfigNodePropertyString?, slingJcrinstallEnableWriteback: ConfigNodePropertyBoolean?) {
        self.handlerSchemes = handlerSchemes
        self.slingJcrinstallFolderNameRegexp = slingJcrinstallFolderNameRegexp
        self.slingJcrinstallFolderMaxDepth = slingJcrinstallFolderMaxDepth
        self.slingJcrinstallSearchPath = slingJcrinstallSearchPath
        self.slingJcrinstallNewConfigPath = slingJcrinstallNewConfigPath
        self.slingJcrinstallSignalPath = slingJcrinstallSignalPath
        self.slingJcrinstallEnableWriteback = slingJcrinstallEnableWriteback
    }

    public enum CodingKeys: String, CodingKey { 
        case handlerSchemes = "handler.schemes"
        case slingJcrinstallFolderNameRegexp = "sling.jcrinstall.folder.name.regexp"
        case slingJcrinstallFolderMaxDepth = "sling.jcrinstall.folder.max.depth"
        case slingJcrinstallSearchPath = "sling.jcrinstall.search.path"
        case slingJcrinstallNewConfigPath = "sling.jcrinstall.new.config.path"
        case slingJcrinstallSignalPath = "sling.jcrinstall.signal.path"
        case slingJcrinstallEnableWriteback = "sling.jcrinstall.enable.writeback"
    }


}

