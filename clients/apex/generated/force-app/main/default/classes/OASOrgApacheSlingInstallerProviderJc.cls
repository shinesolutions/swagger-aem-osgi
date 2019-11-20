/*
 * Adobe Experience Manager OSGI config (AEM) API
 * Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
 *
 * OpenAPI spec version: 1.0.0-pre.0
 * Contact: opensource@shinesolutions.com
 *
 * NOTE: This class is auto generated by the OAS code generator program.
 * https://github.com/OAS-api/OAS-codegen.git
 * Do not edit the class manually.
 */

/**
 * OASOrgApacheSlingInstallerProviderJc
 */
public class OASOrgApacheSlingInstallerProviderJc implements OAS.MappedProperties {
    /**
     * Get handlerSchemes
     * @return handlerSchemes
     */
    public OASConfigNodePropertyArray handlerSchemes { get; set; }

    /**
     * Get slingJcrinstallFolderNameRegexp
     * @return slingJcrinstallFolderNameRegexp
     */
    public OASConfigNodePropertyString slingJcrinstallFolderNameRegexp { get; set; }

    /**
     * Get slingJcrinstallFolderMaxDepth
     * @return slingJcrinstallFolderMaxDepth
     */
    public OASConfigNodePropertyInteger slingJcrinstallFolderMaxDepth { get; set; }

    /**
     * Get slingJcrinstallSearchPath
     * @return slingJcrinstallSearchPath
     */
    public OASConfigNodePropertyArray slingJcrinstallSearchPath { get; set; }

    /**
     * Get slingJcrinstallNewConfigPath
     * @return slingJcrinstallNewConfigPath
     */
    public OASConfigNodePropertyString slingJcrinstallNewConfigPath { get; set; }

    /**
     * Get slingJcrinstallSignalPath
     * @return slingJcrinstallSignalPath
     */
    public OASConfigNodePropertyString slingJcrinstallSignalPath { get; set; }

    /**
     * Get slingJcrinstallEnableWriteback
     * @return slingJcrinstallEnableWriteback
     */
    public OASConfigNodePropertyBoolean slingJcrinstallEnableWriteback { get; set; }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'handler.schemes' => 'handlerSchemes',
        'sling.jcrinstall.folder.name.regexp' => 'slingJcrinstallFolderNameRegexp',
        'sling.jcrinstall.folder.max.depth' => 'slingJcrinstallFolderMaxDepth',
        'sling.jcrinstall.search.path' => 'slingJcrinstallSearchPath',
        'sling.jcrinstall.new.config.path' => 'slingJcrinstallNewConfigPath',
        'sling.jcrinstall.signal.path' => 'slingJcrinstallSignalPath',
        'sling.jcrinstall.enable.writeback' => 'slingJcrinstallEnableWriteback'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    public static OASOrgApacheSlingInstallerProviderJc getExample() {
        OASOrgApacheSlingInstallerProviderJc orgApacheSlingInstallerProviderJcrImplJcrInstallerProperties = new OASOrgApacheSlingInstallerProviderJc();
          orgApacheSlingInstallerProviderJcrImplJcrInstallerProperties.handlerSchemes = OASConfigNodePropertyArray.getExample();
          orgApacheSlingInstallerProviderJcrImplJcrInstallerProperties.slingJcrinstallFolderNameRegexp = OASConfigNodePropertyString.getExample();
          orgApacheSlingInstallerProviderJcrImplJcrInstallerProperties.slingJcrinstallFolderMaxDepth = OASConfigNodePropertyInteger.getExample();
          orgApacheSlingInstallerProviderJcrImplJcrInstallerProperties.slingJcrinstallSearchPath = OASConfigNodePropertyArray.getExample();
          orgApacheSlingInstallerProviderJcrImplJcrInstallerProperties.slingJcrinstallNewConfigPath = OASConfigNodePropertyString.getExample();
          orgApacheSlingInstallerProviderJcrImplJcrInstallerProperties.slingJcrinstallSignalPath = OASConfigNodePropertyString.getExample();
          orgApacheSlingInstallerProviderJcrImplJcrInstallerProperties.slingJcrinstallEnableWriteback = OASConfigNodePropertyBoolean.getExample();
        return orgApacheSlingInstallerProviderJcrImplJcrInstallerProperties;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASOrgApacheSlingInstallerProviderJc) {           
            OASOrgApacheSlingInstallerProviderJc orgApacheSlingInstallerProviderJcrImplJcrInstallerProperties = (OASOrgApacheSlingInstallerProviderJc) obj;
            return this.handlerSchemes == orgApacheSlingInstallerProviderJcrImplJcrInstallerProperties.handlerSchemes
                && this.slingJcrinstallFolderNameRegexp == orgApacheSlingInstallerProviderJcrImplJcrInstallerProperties.slingJcrinstallFolderNameRegexp
                && this.slingJcrinstallFolderMaxDepth == orgApacheSlingInstallerProviderJcrImplJcrInstallerProperties.slingJcrinstallFolderMaxDepth
                && this.slingJcrinstallSearchPath == orgApacheSlingInstallerProviderJcrImplJcrInstallerProperties.slingJcrinstallSearchPath
                && this.slingJcrinstallNewConfigPath == orgApacheSlingInstallerProviderJcrImplJcrInstallerProperties.slingJcrinstallNewConfigPath
                && this.slingJcrinstallSignalPath == orgApacheSlingInstallerProviderJcrImplJcrInstallerProperties.slingJcrinstallSignalPath
                && this.slingJcrinstallEnableWriteback == orgApacheSlingInstallerProviderJcrImplJcrInstallerProperties.slingJcrinstallEnableWriteback;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (handlerSchemes == null ? 0 : System.hashCode(handlerSchemes));
        hashCode = (17 * hashCode) + (slingJcrinstallFolderNameRegexp == null ? 0 : System.hashCode(slingJcrinstallFolderNameRegexp));
        hashCode = (17 * hashCode) + (slingJcrinstallFolderMaxDepth == null ? 0 : System.hashCode(slingJcrinstallFolderMaxDepth));
        hashCode = (17 * hashCode) + (slingJcrinstallSearchPath == null ? 0 : System.hashCode(slingJcrinstallSearchPath));
        hashCode = (17 * hashCode) + (slingJcrinstallNewConfigPath == null ? 0 : System.hashCode(slingJcrinstallNewConfigPath));
        hashCode = (17 * hashCode) + (slingJcrinstallSignalPath == null ? 0 : System.hashCode(slingJcrinstallSignalPath));
        hashCode = (17 * hashCode) + (slingJcrinstallEnableWriteback == null ? 0 : System.hashCode(slingJcrinstallEnableWriteback));
        return hashCode;
    }
}
