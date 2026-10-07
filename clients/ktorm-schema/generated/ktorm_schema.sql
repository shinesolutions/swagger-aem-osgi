

-- --------------------------------------------------------------------------
-- Table structure for table `adaptiveFormAndInteractiveCommunicationWebChannelConfigurationInfo` generated from model 'adaptiveFormAndInteractiveCommunicationWebChannelConfigurationInfo'
--

CREATE TABLE IF NOT EXISTS `adaptiveFormAndInteractiveCommunicationWebChannelConfigurationInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `adaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties` generated from model 'adaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties'
--

CREATE TABLE IF NOT EXISTS `adaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties` (
  `showPlaceholder` long,
  `maximumCacheEntries` long,
  `afscriptingcompatversion` long,
  `makeFileNameUnique` long,
  `generatingCompliantData` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `adaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurInfo` generated from model 'adaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurInfo'
--

CREATE TABLE IF NOT EXISTS `adaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `adaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties` generated from model 'adaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties'
--

CREATE TABLE IF NOT EXISTS `adaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties` (
  `fontList` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `analyticsComponentQueryCacheServiceInfo` generated from model 'analyticsComponentQueryCacheServiceInfo'
--

CREATE TABLE IF NOT EXISTS `analyticsComponentQueryCacheServiceInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `analyticsComponentQueryCacheServiceProperties` generated from model 'analyticsComponentQueryCacheServiceProperties'
--

CREATE TABLE IF NOT EXISTS `analyticsComponentQueryCacheServiceProperties` (
  `cqanalyticscomponentquerycachesize` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `apacheSlingHealthCheckResultHTMLSerializerInfo` generated from model 'apacheSlingHealthCheckResultHTMLSerializerInfo'
--

CREATE TABLE IF NOT EXISTS `apacheSlingHealthCheckResultHTMLSerializerInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `apacheSlingHealthCheckResultHTMLSerializerProperties` generated from model 'apacheSlingHealthCheckResultHTMLSerializerProperties'
--

CREATE TABLE IF NOT EXISTS `apacheSlingHealthCheckResultHTMLSerializerProperties` (
  `styleString` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationInfo` generated from model 'comAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties` generated from model 'comAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties` (
  `formsManagerConfigincludeOOTBTemplates` long,
  `formsManagerConfigincludeDeprecatedTemplates` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeAemTransactionCoreImplTransactionRecorderInfo` generated from model 'comAdobeAemTransactionCoreImplTransactionRecorderInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeAemTransactionCoreImplTransactionRecorderInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeAemTransactionCoreImplTransactionRecorderProperties` generated from model 'comAdobeAemTransactionCoreImplTransactionRecorderProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeAemTransactionCoreImplTransactionRecorderProperties` (
  `isTransactionRecordingEnabled` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCInfo` generated from model 'comAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCProperties` generated from model 'comAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCProperties` (
  `hcname` long,
  `hctags` long,
  `hcmbeanname` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCInfo` generated from model 'comAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties` generated from model 'comAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties` (
  `hcname` long,
  `hctags` long,
  `hcmbeanname` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplInfo` generated from model 'comAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long,
  `bundle_location` text,
  `service_location` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties` generated from model 'comAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties` (
  `preupgrademaintenancetasks` long,
  `preupgradehctags` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplInfo` generated from model 'comAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties` generated from model 'comAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties` (
  `rootpath` long,
  `fixinconsistencies` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqAccountApiAccountManagementServiceInfo` generated from model 'comAdobeCqAccountApiAccountManagementServiceInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqAccountApiAccountManagementServiceInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long,
  `additionalProperties` text,
  `bundle_location` text,
  `service_location` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqAccountApiAccountManagementServiceProperties` generated from model 'comAdobeCqAccountApiAccountManagementServiceProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqAccountApiAccountManagementServiceProperties` (
  `cqaccountmanagertokenvalidityperiod` long,
  `cqaccountmanagerconfigrequestnewaccountmail` long,
  `cqaccountmanagerconfigrequestnewpwdmail` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqAccountImplAccountManagementServletInfo` generated from model 'comAdobeCqAccountImplAccountManagementServletInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqAccountImplAccountManagementServletInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqAccountImplAccountManagementServletProperties` generated from model 'comAdobeCqAccountImplAccountManagementServletProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqAccountImplAccountManagementServletProperties` (
  `cqaccountmanagerconfiginformnewaccountmail` long,
  `cqaccountmanagerconfiginformnewpwdmail` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqAddressImplLocationLocationListServletInfo` generated from model 'comAdobeCqAddressImplLocationLocationListServletInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqAddressImplLocationLocationListServletInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqAddressImplLocationLocationListServletProperties` generated from model 'comAdobeCqAddressImplLocationLocationListServletProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqAddressImplLocationLocationListServletProperties` (
  `cqaddresslocationdefaultmaxResults` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqAuditPurgeDamInfo` generated from model 'comAdobeCqAuditPurgeDamInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqAuditPurgeDamInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqAuditPurgeDamProperties` generated from model 'comAdobeCqAuditPurgeDamProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqAuditPurgeDamProperties` (
  `auditlogrulename` long,
  `auditlogrulecontentpath` long,
  `auditlogruleminimumage` long,
  `auditlogruletypes` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqAuditPurgePagesInfo` generated from model 'comAdobeCqAuditPurgePagesInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqAuditPurgePagesInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqAuditPurgePagesProperties` generated from model 'comAdobeCqAuditPurgePagesProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqAuditPurgePagesProperties` (
  `auditlogrulename` long,
  `auditlogrulecontentpath` long,
  `auditlogruleminimumage` long,
  `auditlogruletypes` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqAuditPurgeReplicationInfo` generated from model 'comAdobeCqAuditPurgeReplicationInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqAuditPurgeReplicationInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqAuditPurgeReplicationProperties` generated from model 'comAdobeCqAuditPurgeReplicationProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqAuditPurgeReplicationProperties` (
  `auditlogrulename` long,
  `auditlogrulecontentpath` long,
  `auditlogruleminimumage` long,
  `auditlogruletypes` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqCdnRewriterImplAWSCloudFrontRewriterInfo` generated from model 'comAdobeCqCdnRewriterImplAWSCloudFrontRewriterInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqCdnRewriterImplAWSCloudFrontRewriterInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties` generated from model 'comAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties` (
  `serviceranking` long,
  `keypairid` long,
  `keypairalias` long,
  `cdnrewriterattributes` long,
  `cdnrewriterdistributiondomain` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqCdnRewriterImplCDNConfigServiceImplInfo` generated from model 'comAdobeCqCdnRewriterImplCDNConfigServiceImplInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqCdnRewriterImplCDNConfigServiceImplInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqCdnRewriterImplCDNConfigServiceImplProperties` generated from model 'comAdobeCqCdnRewriterImplCDNConfigServiceImplProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqCdnRewriterImplCDNConfigServiceImplProperties` (
  `cdnconfigdistributiondomain` long,
  `cdnconfigenablerewriting` long,
  `cdnconfigpathprefixes` long,
  `cdnconfigcdnttl` long,
  `cdnconfigapplicationprotocol` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqCdnRewriterImplCDNRewriterInfo` generated from model 'comAdobeCqCdnRewriterImplCDNRewriterInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqCdnRewriterImplCDNRewriterInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqCdnRewriterImplCDNRewriterProperties` generated from model 'comAdobeCqCdnRewriterImplCDNRewriterProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqCdnRewriterImplCDNRewriterProperties` (
  `serviceranking` long,
  `cdnrewriterattributes` long,
  `cdnrewriterdistributiondomain` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleInfo` generated from model 'comAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties` generated from model 'comAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties` (
  `flushagents` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqCommerceImplAssetDynamicImageHandlerInfo` generated from model 'comAdobeCqCommerceImplAssetDynamicImageHandlerInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqCommerceImplAssetDynamicImageHandlerInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqCommerceImplAssetDynamicImageHandlerProperties` generated from model 'comAdobeCqCommerceImplAssetDynamicImageHandlerProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqCommerceImplAssetDynamicImageHandlerProperties` (
  `cqcommerceassethandleractive` long,
  `cqcommerceassethandlername` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqCommerceImplAssetProductAssetHandlerProviderImplInfo` generated from model 'comAdobeCqCommerceImplAssetProductAssetHandlerProviderImplInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqCommerceImplAssetProductAssetHandlerProviderImplInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties` generated from model 'comAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties` (
  `cqcommerceassethandlerfallback` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqCommerceImplAssetStaticImageHandlerInfo` generated from model 'comAdobeCqCommerceImplAssetStaticImageHandlerInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqCommerceImplAssetStaticImageHandlerInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqCommerceImplAssetStaticImageHandlerProperties` generated from model 'comAdobeCqCommerceImplAssetStaticImageHandlerProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqCommerceImplAssetStaticImageHandlerProperties` (
  `cqcommerceassethandleractive` long,
  `cqcommerceassethandlername` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqCommerceImplAssetVideoHandlerInfo` generated from model 'comAdobeCqCommerceImplAssetVideoHandlerInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqCommerceImplAssetVideoHandlerInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqCommerceImplAssetVideoHandlerProperties` generated from model 'comAdobeCqCommerceImplAssetVideoHandlerProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqCommerceImplAssetVideoHandlerProperties` (
  `cqcommerceassethandleractive` long,
  `cqcommerceassethandlername` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqCommerceImplPromotionPromotionManagerImplInfo` generated from model 'comAdobeCqCommerceImplPromotionPromotionManagerImplInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqCommerceImplPromotionPromotionManagerImplInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqCommerceImplPromotionPromotionManagerImplProperties` generated from model 'comAdobeCqCommerceImplPromotionPromotionManagerImplProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqCommerceImplPromotionPromotionManagerImplProperties` (
  `cqcommercepromotionroot` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplInfo` generated from model 'comAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties` generated from model 'comAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties` (
  `cqcommercecataloggeneratorbucketsize` long,
  `cqcommercecataloggeneratorbucketname` long,
  `cqcommercecataloggeneratorexcludedtemplateproperties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqCommercePimImplPageEventListenerInfo` generated from model 'comAdobeCqCommercePimImplPageEventListenerInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqCommercePimImplPageEventListenerInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqCommercePimImplPageEventListenerProperties` generated from model 'comAdobeCqCommercePimImplPageEventListenerProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqCommercePimImplPageEventListenerProperties` (
  `cqcommercepageeventlistenerenabled` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqCommercePimImplProductfeedProductFeedServiceImplInfo` generated from model 'comAdobeCqCommercePimImplProductfeedProductFeedServiceImplInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqCommercePimImplProductfeedProductFeedServiceImplInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties` generated from model 'comAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties` (
  `Feedgeneratoralgorithm` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqContentinsightImplReportingServicesSettingsProviderInfo` generated from model 'comAdobeCqContentinsightImplReportingServicesSettingsProviderInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqContentinsightImplReportingServicesSettingsProviderInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqContentinsightImplReportingServicesSettingsProviderProperties` generated from model 'comAdobeCqContentinsightImplReportingServicesSettingsProviderProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqContentinsightImplReportingServicesSettingsProviderProperties` (
  `reportingservicesurl` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqContentinsightImplServletsBrightEdgeProxyServletInfo` generated from model 'comAdobeCqContentinsightImplServletsBrightEdgeProxyServletInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqContentinsightImplServletsBrightEdgeProxyServletInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqContentinsightImplServletsBrightEdgeProxyServletProperties` generated from model 'comAdobeCqContentinsightImplServletsBrightEdgeProxyServletProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqContentinsightImplServletsBrightEdgeProxyServletProperties` (
  `brightedgeurl` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqContentinsightImplServletsReportingServicesProxyServleInfo` generated from model 'comAdobeCqContentinsightImplServletsReportingServicesProxyServleInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqContentinsightImplServletsReportingServicesProxyServleInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties` generated from model 'comAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties` (
  `reportingservicesproxywhitelist` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqDamCfmImplComponentComponentConfigImplInfo` generated from model 'comAdobeCqDamCfmImplComponentComponentConfigImplInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqDamCfmImplComponentComponentConfigImplInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqDamCfmImplComponentComponentConfigImplProperties` generated from model 'comAdobeCqDamCfmImplComponentComponentConfigImplProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqDamCfmImplComponentComponentConfigImplProperties` (
  `damcfmcomponentresourceType` long,
  `damcfmcomponentfileReferenceProp` long,
  `damcfmcomponentelementsProp` long,
  `damcfmcomponentvariationProp` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqDamCfmImplConfFeatureConfigImplInfo` generated from model 'comAdobeCqDamCfmImplConfFeatureConfigImplInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqDamCfmImplConfFeatureConfigImplInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqDamCfmImplConfFeatureConfigImplProperties` generated from model 'comAdobeCqDamCfmImplConfFeatureConfigImplProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqDamCfmImplConfFeatureConfigImplProperties` (
  `damcfmresourceTypes` long,
  `damcfmreferenceProperties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqDamCfmImplContentRewriterAssetProcessorInfo` generated from model 'comAdobeCqDamCfmImplContentRewriterAssetProcessorInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqDamCfmImplContentRewriterAssetProcessorInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqDamCfmImplContentRewriterAssetProcessorProperties` generated from model 'comAdobeCqDamCfmImplContentRewriterAssetProcessorProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqDamCfmImplContentRewriterAssetProcessorProperties` (
  `pipelinetype` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqDamCfmImplContentRewriterParRangeFilterInfo` generated from model 'comAdobeCqDamCfmImplContentRewriterParRangeFilterInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqDamCfmImplContentRewriterParRangeFilterInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqDamCfmImplContentRewriterParRangeFilterProperties` generated from model 'comAdobeCqDamCfmImplContentRewriterParRangeFilterProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqDamCfmImplContentRewriterParRangeFilterProperties` (
  `pipelinetype` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqDamCfmImplContentRewriterPayloadFilterInfo` generated from model 'comAdobeCqDamCfmImplContentRewriterPayloadFilterInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqDamCfmImplContentRewriterPayloadFilterInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqDamCfmImplContentRewriterPayloadFilterProperties` generated from model 'comAdobeCqDamCfmImplContentRewriterPayloadFilterProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqDamCfmImplContentRewriterPayloadFilterProperties` (
  `pipelinetype` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqDamDmProcessImagePTiffManagerImplInfo` generated from model 'comAdobeCqDamDmProcessImagePTiffManagerImplInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqDamDmProcessImagePTiffManagerImplInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqDamDmProcessImagePTiffManagerImplProperties` generated from model 'comAdobeCqDamDmProcessImagePTiffManagerImplProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqDamDmProcessImagePTiffManagerImplProperties` (
  `maxMemory` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerInfo` generated from model 'comAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties` generated from model 'comAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties` (
  `dmreplicateonmodifyenabled` long,
  `dmreplicateonmodifyforcesyncdeletes` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqDamMacSyncHelperImplMACSyncClientImplInfo` generated from model 'comAdobeCqDamMacSyncHelperImplMACSyncClientImplInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqDamMacSyncHelperImplMACSyncClientImplInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties` generated from model 'comAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties` (
  `comadobedammacsyncclientsotimeout` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqDamMacSyncImplDAMSyncServiceImplInfo` generated from model 'comAdobeCqDamMacSyncImplDAMSyncServiceImplInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqDamMacSyncImplDAMSyncServiceImplInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqDamMacSyncImplDAMSyncServiceImplProperties` generated from model 'comAdobeCqDamMacSyncImplDAMSyncServiceImplProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqDamMacSyncImplDAMSyncServiceImplProperties` (
  `comadobecqdammacsyncdamsyncserviceregistered_paths` long,
  `comadobecqdammacsyncdamsyncservicesyncrenditions` long,
  `comadobecqdammacsyncdamsyncservicereplicatethreadwaitms` long,
  `comadobecqdammacsyncdamsyncserviceplatform` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqDamProcessorNuiImplNuiAssetProcessorInfo` generated from model 'comAdobeCqDamProcessorNuiImplNuiAssetProcessorInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqDamProcessorNuiImplNuiAssetProcessorInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties` generated from model 'comAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties` (
  `nuiEnabled` long,
  `nuiServiceUrl` long,
  `nuiApiKey` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqDamS7imagingImplIsImageServerComponentInfo` generated from model 'comAdobeCqDamS7imagingImplIsImageServerComponentInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqDamS7imagingImplIsImageServerComponentInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqDamS7imagingImplIsImageServerComponentProperties` generated from model 'comAdobeCqDamS7imagingImplIsImageServerComponentProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqDamS7imagingImplIsImageServerComponentProperties` (
  `TcpPort` long,
  `AllowRemoteAccess` long,
  `MaxRenderRgnPixels` long,
  `MaxMessageSize` long,
  `RandomAccessUrlTimeout` long,
  `WorkerThreads` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqDamS7imagingImplPsPlatformServerServletInfo` generated from model 'comAdobeCqDamS7imagingImplPsPlatformServerServletInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqDamS7imagingImplPsPlatformServerServletInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqDamS7imagingImplPsPlatformServerServletProperties` generated from model 'comAdobeCqDamS7imagingImplPsPlatformServerServletProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqDamS7imagingImplPsPlatformServerServletProperties` (
  `cacheenable` long,
  `cacherootPaths` long,
  `cachemaxSize` long,
  `cachemaxEntries` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqDamWebdavImplIoAssetIOHandlerInfo` generated from model 'comAdobeCqDamWebdavImplIoAssetIOHandlerInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqDamWebdavImplIoAssetIOHandlerInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqDamWebdavImplIoAssetIOHandlerProperties` generated from model 'comAdobeCqDamWebdavImplIoAssetIOHandlerProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqDamWebdavImplIoAssetIOHandlerProperties` (
  `serviceranking` long,
  `pathPrefix` long,
  `createVersion` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobInfo` generated from model 'comAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties` generated from model 'comAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties` (
  `cqdamwebdavversionlinkingenable` long,
  `cqdamwebdavversionlinkingschedulerperiod` long,
  `cqdamwebdavversionlinkingstagingtimeout` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqDamWebdavImplIoSpecialFilesHandlerInfo` generated from model 'comAdobeCqDamWebdavImplIoSpecialFilesHandlerInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqDamWebdavImplIoSpecialFilesHandlerInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties` generated from model 'comAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties` (
  `comdaycqdamcoreimplioSpecialFilesHandlerfilepatters` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqDeserfwImplDeserializationFirewallImplInfo` generated from model 'comAdobeCqDeserfwImplDeserializationFirewallImplInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqDeserfwImplDeserializationFirewallImplInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqDeserfwImplDeserializationFirewallImplProperties` generated from model 'comAdobeCqDeserfwImplDeserializationFirewallImplProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqDeserfwImplDeserializationFirewallImplProperties` (
  `firewalldeserializationwhitelist` long,
  `firewalldeserializationblacklist` long,
  `firewalldeserializationdiagnostics` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqDtmImplServiceDTMWebServiceImplInfo` generated from model 'comAdobeCqDtmImplServiceDTMWebServiceImplInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqDtmImplServiceDTMWebServiceImplInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqDtmImplServiceDTMWebServiceImplProperties` generated from model 'comAdobeCqDtmImplServiceDTMWebServiceImplProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqDtmImplServiceDTMWebServiceImplProperties` (
  `connectiontimeout` long,
  `sockettimeout` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqDtmImplServletsDTMDeployHookServletInfo` generated from model 'comAdobeCqDtmImplServletsDTMDeployHookServletInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqDtmImplServletsDTMDeployHookServletInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqDtmImplServletsDTMDeployHookServletProperties` generated from model 'comAdobeCqDtmImplServletsDTMDeployHookServletProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqDtmImplServletsDTMDeployHookServletProperties` (
  `dtmstagingipwhitelist` long,
  `dtmproductionipwhitelist` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqDtmReactorImplServiceWebServiceImplInfo` generated from model 'comAdobeCqDtmReactorImplServiceWebServiceImplInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqDtmReactorImplServiceWebServiceImplInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqDtmReactorImplServiceWebServiceImplProperties` generated from model 'comAdobeCqDtmReactorImplServiceWebServiceImplProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqDtmReactorImplServiceWebServiceImplProperties` (
  `endpointUri` long,
  `connectionTimeout` long,
  `socketTimeout` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqExperiencelogImplExperienceLogConfigServletInfo` generated from model 'comAdobeCqExperiencelogImplExperienceLogConfigServletInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqExperiencelogImplExperienceLogConfigServletInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long,
  `additionalProperties` text,
  `bundle_location` text,
  `service_location` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqExperiencelogImplExperienceLogConfigServletProperties` generated from model 'comAdobeCqExperiencelogImplExperienceLogConfigServletProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqExperiencelogImplExperienceLogConfigServletProperties` (
  `enabled` long,
  `disabledForGroups` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqHcContentPackagesHealthCheckInfo` generated from model 'comAdobeCqHcContentPackagesHealthCheckInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqHcContentPackagesHealthCheckInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqHcContentPackagesHealthCheckProperties` generated from model 'comAdobeCqHcContentPackagesHealthCheckProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqHcContentPackagesHealthCheckProperties` (
  `hcname` long,
  `hctags` long,
  `hcmbeanname` long,
  `packagenames` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqHistoryImplHistoryRequestFilterInfo` generated from model 'comAdobeCqHistoryImplHistoryRequestFilterInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqHistoryImplHistoryRequestFilterInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long,
  `bundle_location` text,
  `service_location` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqHistoryImplHistoryRequestFilterProperties` generated from model 'comAdobeCqHistoryImplHistoryRequestFilterProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqHistoryImplHistoryRequestFilterProperties` (
  `historyrequestFilterexcludedSelectors` long,
  `historyrequestFilterexcludedExtensions` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqHistoryImplHistoryServiceImplInfo` generated from model 'comAdobeCqHistoryImplHistoryServiceImplInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqHistoryImplHistoryServiceImplInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long,
  `additionalProperties` text,
  `bundle_location` text,
  `service_location` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqHistoryImplHistoryServiceImplProperties` generated from model 'comAdobeCqHistoryImplHistoryServiceImplProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqHistoryImplHistoryServiceImplProperties` (
  `historyserviceresourceTypes` long,
  `historyservicepathFilter` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqInboxImplTypeproviderItemTypeProviderInfo` generated from model 'comAdobeCqInboxImplTypeproviderItemTypeProviderInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqInboxImplTypeproviderItemTypeProviderInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqInboxImplTypeproviderItemTypeProviderProperties` generated from model 'comAdobeCqInboxImplTypeproviderItemTypeProviderProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqInboxImplTypeproviderItemTypeProviderProperties` (
  `inboximpltypeproviderregistrypaths` long,
  `inboximpltypeproviderlegacypaths` long,
  `inboximpltypeproviderdefaulturlfailureitem` long,
  `inboximpltypeproviderdefaulturlworkitem` long,
  `inboximpltypeproviderdefaulturltask` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqProjectsImplServletProjectImageServletInfo` generated from model 'comAdobeCqProjectsImplServletProjectImageServletInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqProjectsImplServletProjectImageServletInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqProjectsImplServletProjectImageServletProperties` generated from model 'comAdobeCqProjectsImplServletProjectImageServletProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqProjectsImplServletProjectImageServletProperties` (
  `imagequality` long,
  `imagesupportedresolutions` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqProjectsPurgeSchedulerInfo` generated from model 'comAdobeCqProjectsPurgeSchedulerInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqProjectsPurgeSchedulerInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqProjectsPurgeSchedulerProperties` generated from model 'comAdobeCqProjectsPurgeSchedulerProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqProjectsPurgeSchedulerProperties` (
  `scheduledpurgename` long,
  `scheduledpurgepurgeActive` long,
  `scheduledpurgetemplates` long,
  `scheduledpurgepurgeGroups` long,
  `scheduledpurgepurgeAssets` long,
  `scheduledpurgeterminateRunningWorkflows` long,
  `scheduledpurgedaysold` long,
  `scheduledpurgesaveThreshold` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqScheduledExporterImplScheduledExporterImplInfo` generated from model 'comAdobeCqScheduledExporterImplScheduledExporterImplInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqScheduledExporterImplScheduledExporterImplInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqScheduledExporterImplScheduledExporterImplProperties` generated from model 'comAdobeCqScheduledExporterImplScheduledExporterImplProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqScheduledExporterImplScheduledExporterImplProperties` (
  `includepaths` long,
  `exporteruser` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplInfo` generated from model 'comAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties` generated from model 'comAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties` (
  `comadobecqscreensanalyticsimplurl` long,
  `comadobecqscreensanalyticsimplapikey` long,
  `comadobecqscreensanalyticsimplproject` long,
  `comadobecqscreensanalyticsimplenvironment` long,
  `comadobecqscreensanalyticsimplsendFrequency` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqScreensDeviceImplDeviceServiceInfo` generated from model 'comAdobeCqScreensDeviceImplDeviceServiceInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqScreensDeviceImplDeviceServiceInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqScreensDeviceImplDeviceServiceProperties` generated from model 'comAdobeCqScreensDeviceImplDeviceServiceProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqScreensDeviceImplDeviceServiceProperties` (
  `comadobeaemscreensplayerpingfrequency` long,
  `comadobeaemscreensdevicepaswordspecialchars` long,
  `comadobeaemscreensdevicepaswordminlowercasechars` long,
  `comadobeaemscreensdevicepaswordminuppercasechars` long,
  `comadobeaemscreensdevicepaswordminnumberchars` long,
  `comadobeaemscreensdevicepaswordminspecialchars` long,
  `comadobeaemscreensdevicepaswordminlength` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplInfo` generated from model 'comAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties` generated from model 'comAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties` (
  `deviceRegistrationTimeout` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqScreensImplHandlerChannelsUpdateHandlerInfo` generated from model 'comAdobeCqScreensImplHandlerChannelsUpdateHandlerInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqScreensImplHandlerChannelsUpdateHandlerInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties` generated from model 'comAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties` (
  `cqpagesupdatehandlerimageresourcetypes` long,
  `cqpagesupdatehandlerproductresourcetypes` long,
  `cqpagesupdatehandlervideoresourcetypes` long,
  `cqpagesupdatehandlerdynamicsequenceresourcetypes` long,
  `cqpagesupdatehandlerpreviewmodepaths` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobInfo` generated from model 'comAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobProperties` generated from model 'comAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobProperties` (
  `schedulerexpression` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqScreensImplRemoteImplDistributedHttpClientImplInfo` generated from model 'comAdobeCqScreensImplRemoteImplDistributedHttpClientImplInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqScreensImplRemoteImplDistributedHttpClientImplInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties` generated from model 'comAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties` (
  `comadobeaemscreensimplremoterequest_timeout` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqScreensImplScreensChannelPostProcessorInfo` generated from model 'comAdobeCqScreensImplScreensChannelPostProcessorInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqScreensImplScreensChannelPostProcessorInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqScreensImplScreensChannelPostProcessorProperties` generated from model 'comAdobeCqScreensImplScreensChannelPostProcessorProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqScreensImplScreensChannelPostProcessorProperties` (
  `screenschannelspropertiestoremove` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplInfo` generated from model 'comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties` generated from model 'comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties` (
  `comadobecqscreensmonitoringimplScreensMonitoringServiceImplprojectPath` long,
  `comadobecqscreensmonitoringimplScreensMonitoringServiceImplscheduleFrequency` long,
  `comadobecqscreensmonitoringimplScreensMonitoringServiceImplpingTimeout` long,
  `comadobecqscreensmonitoringimplScreensMonitoringServiceImplrecipients` long,
  `comadobecqscreensmonitoringimplScreensMonitoringServiceImplsmtpserver` long,
  `comadobecqscreensmonitoringimplScreensMonitoringServiceImplsmtpport` long,
  `comadobecqscreensmonitoringimplScreensMonitoringServiceImplusetls` long,
  `comadobecqscreensmonitoringimplScreensMonitoringServiceImplusername` long,
  `comadobecqscreensmonitoringimplScreensMonitoringServiceImplpassword` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqScreensMqActivemqImplArtemisJMSProviderInfo` generated from model 'comAdobeCqScreensMqActivemqImplArtemisJMSProviderInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqScreensMqActivemqImplArtemisJMSProviderInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties` generated from model 'comAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties` (
  `serviceranking` long,
  `globalsize` long,
  `maxdiskusage` long,
  `persistenceenabled` long,
  `threadpoolmaxsize` long,
  `scheduledthreadpoolmaxsize` long,
  `gracefulshutdowntimeout` long,
  `queues` long,
  `topics` long,
  `addressesmaxdeliveryattempts` long,
  `addressesexpirydelay` long,
  `addressesaddressfullmessagepolicy` long,
  `addressesmaxsizebytes` long,
  `addressespagesizebytes` long,
  `addressespagecachemaxsize` long,
  `clusteruser` long,
  `clusterpassword` long,
  `clustercalltimeout` long,
  `clustercallfailovertimeout` long,
  `clusterclientfailurecheckperiod` long,
  `clusternotificationattempts` long,
  `clusternotificationinterval` long,
  `idcachesize` long,
  `clusterconfirmationwindowsize` long,
  `clusterconnectionttl` long,
  `clusterduplicatedetection` long,
  `clusterinitialconnectattempts` long,
  `clustermaxretryinterval` long,
  `clusterminlargemessagesize` long,
  `clusterproducerwindowsize` long,
  `clusterreconnectattempts` long,
  `clusterretryinterval` long,
  `clusterretryintervalmultiplier` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplInfo` generated from model 'comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties` generated from model 'comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties` (
  `comadobecqscreensofflinecontentimplBulkOfflineUpdateServiceImplprojectPath` long,
  `comadobecqscreensofflinecontentimplBulkOfflineUpdateServiceImplscheduleFrequency` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqScreensOfflinecontentImplOfflineContentServiceImplInfo` generated from model 'comAdobeCqScreensOfflinecontentImplOfflineContentServiceImplInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqScreensOfflinecontentImplOfflineContentServiceImplInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties` generated from model 'comAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties` (
  `disableSmartSync` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqScreensSegmentationImplSegmentationFeatureFlagInfo` generated from model 'comAdobeCqScreensSegmentationImplSegmentationFeatureFlagInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqScreensSegmentationImplSegmentationFeatureFlagInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties` generated from model 'comAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties` (
  `enableDataTriggeredContent` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChInfo` generated from model 'comAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChProperties` generated from model 'comAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChProperties` (
  `hctags` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckInfo` generated from model 'comAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckProperties` generated from model 'comAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckProperties` (
  `hctags` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckInfo` generated from model 'comAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties` generated from model 'comAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties` (
  `hctags` long,
  `dispatcheraddress` long,
  `dispatcherfilterallowed` long,
  `dispatcherfilterblocked` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSecurityHcPackagesImplExampleContentHealthCheckInfo` generated from model 'comAdobeCqSecurityHcPackagesImplExampleContentHealthCheckInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSecurityHcPackagesImplExampleContentHealthCheckInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long,
  `additionalProperties` text,
  `bundle_location` text,
  `service_location` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSecurityHcPackagesImplExampleContentHealthCheckProperties` generated from model 'comAdobeCqSecurityHcPackagesImplExampleContentHealthCheckProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSecurityHcPackagesImplExampleContentHealthCheckProperties` (
  `hctags` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSecurityHcWebserverImplClickjackingHealthCheckInfo` generated from model 'comAdobeCqSecurityHcWebserverImplClickjackingHealthCheckInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSecurityHcWebserverImplClickjackingHealthCheckInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties` generated from model 'comAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties` (
  `hctags` long,
  `webserveraddress` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialAccountverificationImplAccountManagementConfigImInfo` generated from model 'comAdobeCqSocialAccountverificationImplAccountManagementConfigImInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialAccountverificationImplAccountManagementConfigImInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties` generated from model 'comAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties` (
  `enable` long,
  `ttl1` long,
  `ttl2` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialActivitystreamsClientImplSocialActivityComponenInfo` generated from model 'comAdobeCqSocialActivitystreamsClientImplSocialActivityComponenInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialActivitystreamsClientImplSocialActivityComponenInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialActivitystreamsClientImplSocialActivityComponenProperties` generated from model 'comAdobeCqSocialActivitystreamsClientImplSocialActivityComponenProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialActivitystreamsClientImplSocialActivityComponenProperties` (
  `priority` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoInfo` generated from model 'comAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoProperties` generated from model 'comAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoProperties` (
  `priority` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerInfo` generated from model 'comAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerProperties` generated from model 'comAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerProperties` (
  `eventtopics` long,
  `eventfilter` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialActivitystreamsListenerImplModerationEventExtenInfo` generated from model 'comAdobeCqSocialActivitystreamsListenerImplModerationEventExtenInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialActivitystreamsListenerImplModerationEventExtenInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties` generated from model 'comAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties` (
  `accepted` long,
  `ranked` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySInfo` generated from model 'comAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties` generated from model 'comAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties` (
  `ranking` long,
  `enable` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialActivitystreamsListenerImplResourceActivityStreInfo` generated from model 'comAdobeCqSocialActivitystreamsListenerImplResourceActivityStreInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialActivitystreamsListenerImplResourceActivityStreInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long,
  `bundle_location` text,
  `service_location` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties` generated from model 'comAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties` (
  `streamPath` long,
  `streamName` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIInfo` generated from model 'comAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties` generated from model 'comAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties` (
  `MaxRetry` long,
  `fieldWhitelist` long,
  `attachmentTypeBlacklist` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialCalendarClientOperationextensionsEventAttachmenInfo` generated from model 'comAdobeCqSocialCalendarClientOperationextensionsEventAttachmenInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialCalendarClientOperationextensionsEventAttachmenInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties` generated from model 'comAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties` (
  `attachmentTypeBlacklist` long,
  `extensionorder` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialCalendarServletsTimeZoneServletInfo` generated from model 'comAdobeCqSocialCalendarServletsTimeZoneServletInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialCalendarServletsTimeZoneServletInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialCalendarServletsTimeZoneServletProperties` generated from model 'comAdobeCqSocialCalendarServletsTimeZoneServletProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialCalendarServletsTimeZoneServletProperties` (
  `timezonesexpirytime` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventInfo` generated from model 'comAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventProperties` generated from model 'comAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventProperties` (
  `ranking` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSeInfo` generated from model 'comAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSeInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSeInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSeProperties` generated from model 'comAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSeProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSeProperties` (
  `fieldWhitelist` long,
  `attachmentTypeBlacklist` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiInfo` generated from model 'comAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiProperties` generated from model 'comAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiProperties` (
  `fieldWhitelist` long,
  `attachmentTypeBlacklist` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCInfo` generated from model 'comAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties` generated from model 'comAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties` (
  `numUserLimit` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosInfo` generated from model 'comAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties` generated from model 'comAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties` (
  `enableScheduledPostsSearch` long,
  `numberOfMinutes` long,
  `maxSearchLimit` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialCommonsCorsCORSAuthenticationFilterInfo` generated from model 'comAdobeCqSocialCommonsCorsCORSAuthenticationFilterInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialCommonsCorsCORSAuthenticationFilterInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties` generated from model 'comAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties` (
  `corsenabling` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderInfo` generated from model 'comAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderProperties` generated from model 'comAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderProperties` (
  `priorityOrder` long,
  `replyEmailPatterns` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplInfo` generated from model 'comAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplProperties` generated from model 'comAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplProperties` (
  `contextpath` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerInfo` generated from model 'comAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerProperties` generated from model 'comAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerProperties` (
  `eventtopics` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialCommonsEmailreplyImplCustomEmailClientProviderInfo` generated from model 'comAdobeCqSocialCommonsEmailreplyImplCustomEmailClientProviderInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialCommonsEmailreplyImplCustomEmailClientProviderInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialCommonsEmailreplyImplCustomEmailClientProviderProperties` generated from model 'comAdobeCqSocialCommonsEmailreplyImplCustomEmailClientProviderProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialCommonsEmailreplyImplCustomEmailClientProviderProperties` (
  `priorityOrder` long,
  `replyEmailPatterns` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpInfo` generated from model 'comAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties` generated from model 'comAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties` (
  `patterntime` long,
  `patternnewline` long,
  `patterndayOfMonth` long,
  `patternmonth` long,
  `patternyear` long,
  `patterndate` long,
  `patterndateTime` long,
  `patternemail` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpInfo` generated from model 'comAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties` generated from model 'comAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties` (
  `emailname` long,
  `emailcreatePostFromReply` long,
  `emailaddCommentIdTo` long,
  `emailsubjectMaximumLength` long,
  `emailreplyToAddress` long,
  `emailreplyToDelimiter` long,
  `emailtrackerIdPrefixInSubject` long,
  `emailtrackerIdPrefixInBody` long,
  `emailasHTML` long,
  `emaildefaultUserName` long,
  `emailtemplatesrootPath` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterInfo` generated from model 'comAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterProperties` generated from model 'comAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterProperties` (
  `connectProtocol` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialCommonsEmailreplyImplGmailEmailClientProviderInfo` generated from model 'comAdobeCqSocialCommonsEmailreplyImplGmailEmailClientProviderInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialCommonsEmailreplyImplGmailEmailClientProviderInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialCommonsEmailreplyImplGmailEmailClientProviderProperties` generated from model 'comAdobeCqSocialCommonsEmailreplyImplGmailEmailClientProviderProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialCommonsEmailreplyImplGmailEmailClientProviderProperties` (
  `priorityOrder` long,
  `replyEmailPatterns` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderInfo` generated from model 'comAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderProperties` generated from model 'comAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderProperties` (
  `priorityOrder` long,
  `replyEmailPatterns` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProviderInfo` generated from model 'comAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProviderInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProviderInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProviderProperties` generated from model 'comAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProviderProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProviderProperties` (
  `priorityOrder` long,
  `replyEmailPatterns` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialCommonsEmailreplyImplOutLookEmailClientProviderInfo` generated from model 'comAdobeCqSocialCommonsEmailreplyImplOutLookEmailClientProviderInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialCommonsEmailreplyImplOutLookEmailClientProviderInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialCommonsEmailreplyImplOutLookEmailClientProviderProperties` generated from model 'comAdobeCqSocialCommonsEmailreplyImplOutLookEmailClientProviderProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialCommonsEmailreplyImplOutLookEmailClientProviderProperties` (
  `priorityOrder` long,
  `replyEmailPatterns` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderInfo` generated from model 'comAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderProperties` generated from model 'comAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderProperties` (
  `replyEmailPatterns` long,
  `priorityOrder` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderInfo` generated from model 'comAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderProperties` generated from model 'comAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderProperties` (
  `priorityOrder` long,
  `replyEmailPatterns` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadInfo` generated from model 'comAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties` generated from model 'comAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties` (
  `numberOfDays` long,
  `ageOfFile` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplInfo` generated from model 'comAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties` generated from model 'comAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties` (
  `eventtopics` long,
  `eventfilter` long,
  `verbs` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitInfo` generated from model 'comAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties` generated from model 'comAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties` (
  `enable` long,
  `UGCLimit` long,
  `ugcLimitDuration` long,
  `domains` long,
  `toList` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialConnectOauthImplFacebookProviderImplInfo` generated from model 'comAdobeCqSocialConnectOauthImplFacebookProviderImplInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialConnectOauthImplFacebookProviderImplInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialConnectOauthImplFacebookProviderImplProperties` generated from model 'comAdobeCqSocialConnectOauthImplFacebookProviderImplProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialConnectOauthImplFacebookProviderImplProperties` (
  `oauthproviderid` long,
  `oauthcloudconfigroot` long,
  `providerconfigroot` long,
  `providerconfigcreatetagsenabled` long,
  `providerconfiguserfolder` long,
  `providerconfigfacebookfetchfields` long,
  `providerconfigfacebookfields` long,
  `providerconfigrefreshuserdataenabled` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleInfo` generated from model 'comAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleProperties` generated from model 'comAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleProperties` (
  `path` long,
  `serviceranking` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperInfo` generated from model 'comAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties` generated from model 'comAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties` (
  `facebook` long,
  `twitter` long,
  `providerconfiguserfolder` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialConnectOauthImplTwitterProviderImplInfo` generated from model 'comAdobeCqSocialConnectOauthImplTwitterProviderImplInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialConnectOauthImplTwitterProviderImplInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialConnectOauthImplTwitterProviderImplProperties` generated from model 'comAdobeCqSocialConnectOauthImplTwitterProviderImplProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialConnectOauthImplTwitterProviderImplProperties` (
  `oauthproviderid` long,
  `oauthcloudconfigroot` long,
  `providerconfigroot` long,
  `providerconfiguserfolder` long,
  `providerconfigtwitterenableparams` long,
  `providerconfigtwitterparams` long,
  `providerconfigrefreshuserdataenabled` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenInfo` generated from model 'comAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties` generated from model 'comAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties` (
  `cqsocialcontentfragmentsservicesenabled` long,
  `cqsocialcontentfragmentsserviceswaitTimeSeconds` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialDatastoreAsImplASResourceProviderFactoryInfo` generated from model 'comAdobeCqSocialDatastoreAsImplASResourceProviderFactoryInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialDatastoreAsImplASResourceProviderFactoryInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties` generated from model 'comAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties` (
  `versionid` long,
  `cacheon` long,
  `concurrencylevel` long,
  `cachestartsize` long,
  `cachettl` long,
  `cachesize` long,
  `timelimit` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryInfo` generated from model 'comAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties` generated from model 'comAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties` (
  `solrzktimeout` long,
  `solrcommit` long,
  `cacheon` long,
  `concurrencylevel` long,
  `cachestartsize` long,
  `cachettl` long,
  `cachesize` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorInfo` generated from model 'comAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties` generated from model 'comAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties` (
  `solrzktimeout` long,
  `solrcommit` long,
  `cacheon` long,
  `concurrencylevel` long,
  `cachestartsize` long,
  `cachettl` long,
  `cachesize` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFInfo` generated from model 'comAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFProperties` generated from model 'comAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFProperties` (
  `isMemberCheck` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoInfo` generated from model 'comAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties` generated from model 'comAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties` (
  `isMemberCheck` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLInfo` generated from model 'comAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLProperties` generated from model 'comAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLProperties` (
  `fieldWhitelist` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialEnablementResourceEndpointsImplEnablementResouInfo` generated from model 'comAdobeCqSocialEnablementResourceEndpointsImplEnablementResouInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialEnablementResourceEndpointsImplEnablementResouInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialEnablementResourceEndpointsImplEnablementResouProperties` generated from model 'comAdobeCqSocialEnablementResourceEndpointsImplEnablementResouProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialEnablementResourceEndpointsImplEnablementResouProperties` (
  `fieldWhitelist` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialEnablementServicesImplAuthorMarkerImplInfo` generated from model 'comAdobeCqSocialEnablementServicesImplAuthorMarkerImplInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialEnablementServicesImplAuthorMarkerImplInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long,
  `bundle_location` text,
  `service_location` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialEnablementServicesImplAuthorMarkerImplProperties` generated from model 'comAdobeCqSocialEnablementServicesImplAuthorMarkerImplProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialEnablementServicesImplAuthorMarkerImplProperties` (
  `serviceranking` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGeInfo` generated from model 'comAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGeInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGeInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGeProperties` generated from model 'comAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGeProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGeProperties` (
  `slingservletselectors` long,
  `slingservletextensions` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaInfo` generated from model 'comAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaProperties` generated from model 'comAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaProperties` (
  `fieldWhitelist` long,
  `attachmentTypeBlacklist` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialForumClientEndpointsImplForumOperationsServiceInfo` generated from model 'comAdobeCqSocialForumClientEndpointsImplForumOperationsServiceInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialForumClientEndpointsImplForumOperationsServiceInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialForumClientEndpointsImplForumOperationsServiceProperties` generated from model 'comAdobeCqSocialForumClientEndpointsImplForumOperationsServiceProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialForumClientEndpointsImplForumOperationsServiceProperties` (
  `fieldWhitelist` long,
  `attachmentTypeBlacklist` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialForumDispatcherImplFlushOperationsInfo` generated from model 'comAdobeCqSocialForumDispatcherImplFlushOperationsInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialForumDispatcherImplFlushOperationsInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialForumDispatcherImplFlushOperationsProperties` generated from model 'comAdobeCqSocialForumDispatcherImplFlushOperationsProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialForumDispatcherImplFlushOperationsProperties` (
  `extensionorder` long,
  `flushforumontopic` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenInfo` generated from model 'comAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties` generated from model 'comAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties` (
  `grouplistingpaginationenable` long,
  `grouplistinglazyloadingenable` long,
  `pagesize` long,
  `priority` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialGroupImplGroupServiceImplInfo` generated from model 'comAdobeCqSocialGroupImplGroupServiceImplInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialGroupImplGroupServiceImplInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialGroupImplGroupServiceImplProperties` generated from model 'comAdobeCqSocialGroupImplGroupServiceImplProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialGroupImplGroupServiceImplProperties` (
  `maxWaitTime` long,
  `minWaitBetweenRetries` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialHandlebarsGuavaTemplateCacheImplInfo` generated from model 'comAdobeCqSocialHandlebarsGuavaTemplateCacheImplInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialHandlebarsGuavaTemplateCacheImplInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long,
  `bundle_location` text,
  `service_location` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties` generated from model 'comAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties` (
  `parameterguavacacheenabled` long,
  `parameterguavacacheparams` long,
  `parameterguavacachereload` long,
  `serviceranking` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSInfo` generated from model 'comAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSProperties` generated from model 'comAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSProperties` (
  `fieldWhitelist` long,
  `attachmentTypeBlacklist` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerInfo` generated from model 'comAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerProperties` generated from model 'comAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerProperties` (
  `fieldWhitelist` long,
  `attachmentTypeBlacklist` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileInfo` generated from model 'comAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileProperties` generated from model 'comAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileProperties` (
  `fieldWhitelist` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOInfo` generated from model 'comAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOProperties` generated from model 'comAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOProperties` (
  `fieldWhitelist` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFInfo` generated from model 'comAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties` generated from model 'comAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties` (
  `everyoneLimit` long,
  `priority` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialMessagingClientEndpointsImplMessagingOperationInfo` generated from model 'comAdobeCqSocialMessagingClientEndpointsImplMessagingOperationInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialMessagingClientEndpointsImplMessagingOperationInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties` generated from model 'comAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties` (
  `messageproperties` long,
  `messageBoxSizeLimit` long,
  `messageCountLimit` long,
  `notifyFailure` long,
  `failureMessageFrom` long,
  `failureTemplatePath` long,
  `maxRetries` long,
  `minWaitBetweenRetries` long,
  `countUpdatePoolSize` long,
  `inboxpath` long,
  `sentitemspath` long,
  `supportAttachments` long,
  `supportGroupMessaging` long,
  `maxTotalRecipients` long,
  `batchSize` long,
  `maxTotalAttachmentSize` long,
  `attachmentTypeBlacklist` long,
  `allowedAttachmentTypes` long,
  `serviceSelector` long,
  `fieldWhitelist` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenInfo` generated from model 'comAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenProperties` generated from model 'comAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenProperties` (
  `resourceTypefilters` long,
  `priority` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialModerationDashboardApiModerationDashboardSocialInfo` generated from model 'comAdobeCqSocialModerationDashboardApiModerationDashboardSocialInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialModerationDashboardApiModerationDashboardSocialInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialModerationDashboardApiModerationDashboardSocialProperties` generated from model 'comAdobeCqSocialModerationDashboardApiModerationDashboardSocialProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialModerationDashboardApiModerationDashboardSocialProperties` (
  `priority` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenInfo` generated from model 'comAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenProperties` generated from model 'comAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenProperties` (
  `priority` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialModerationDashboardInternalImplFilterGroupSociInfo` generated from model 'comAdobeCqSocialModerationDashboardInternalImplFilterGroupSociInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialModerationDashboardInternalImplFilterGroupSociInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties` generated from model 'comAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties` (
  `resourceTypefilters` long,
  `priority` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialNotificationsImplMentionsRouterInfo` generated from model 'comAdobeCqSocialNotificationsImplMentionsRouterInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialNotificationsImplMentionsRouterInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialNotificationsImplMentionsRouterProperties` generated from model 'comAdobeCqSocialNotificationsImplMentionsRouterProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialNotificationsImplMentionsRouterProperties` (
  `eventtopics` long,
  `eventfilter` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialNotificationsImplNotificationManagerImplInfo` generated from model 'comAdobeCqSocialNotificationsImplNotificationManagerImplInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialNotificationsImplNotificationManagerImplInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialNotificationsImplNotificationManagerImplProperties` generated from model 'comAdobeCqSocialNotificationsImplNotificationManagerImplProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialNotificationsImplNotificationManagerImplProperties` (
  `maxunreadnotificationcount` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialNotificationsImplNotificationsRouterInfo` generated from model 'comAdobeCqSocialNotificationsImplNotificationsRouterInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialNotificationsImplNotificationsRouterInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialNotificationsImplNotificationsRouterProperties` generated from model 'comAdobeCqSocialNotificationsImplNotificationsRouterProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialNotificationsImplNotificationsRouterProperties` (
  `eventtopics` long,
  `eventfilter` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicInfo` generated from model 'comAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicProperties` generated from model 'comAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicProperties` (
  `fieldWhitelist` long,
  `attachmentTypeBlacklist` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIInfo` generated from model 'comAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIProperties` generated from model 'comAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIProperties` (
  `cqsocialreportinganalyticspollingimporterinterval` long,
  `cqsocialreportinganalyticspollingimporterpageSize` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMInfo` generated from model 'comAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMProperties` generated from model 'comAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMProperties` (
  `reportfetchdelay` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSInfo` generated from model 'comAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties` generated from model 'comAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties` (
  `cqsocialconsoleanalyticssitesmapping` long,
  `priority` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiInfo` generated from model 'comAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiProperties` generated from model 'comAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiProperties` (
  `fieldWhitelist` long,
  `attachmentTypeBlacklist` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialScfCoreOperationsImplSocialOperationsServletInfo` generated from model 'comAdobeCqSocialScfCoreOperationsImplSocialOperationsServletInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialScfCoreOperationsImplSocialOperationsServletInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties` generated from model 'comAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties` (
  `slingservletselectors` long,
  `slingservletextensions` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialScfEndpointsImplDefaultSocialGetServletInfo` generated from model 'comAdobeCqSocialScfEndpointsImplDefaultSocialGetServletInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialScfEndpointsImplDefaultSocialGetServletInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties` generated from model 'comAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties` (
  `slingservletselectors` long,
  `slingservletextensions` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialScoringImplScoringEventListenerInfo` generated from model 'comAdobeCqSocialScoringImplScoringEventListenerInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialScoringImplScoringEventListenerInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialScoringImplScoringEventListenerProperties` generated from model 'comAdobeCqSocialScoringImplScoringEventListenerProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialScoringImplScoringEventListenerProperties` (
  `eventtopics` long,
  `eventfilter` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplInfo` generated from model 'comAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties` generated from model 'comAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties` (
  `enableFallback` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialSiteEndpointsImplSiteOperationServiceInfo` generated from model 'comAdobeCqSocialSiteEndpointsImplSiteOperationServiceInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialSiteEndpointsImplSiteOperationServiceInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties` generated from model 'comAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties` (
  `fieldWhitelist` long,
  `sitePathFilters` long,
  `sitePackageGroup` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImInfo` generated from model 'comAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties` generated from model 'comAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties` (
  `cqsocialconsoleanalyticscomponents` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialSiteImplSiteConfiguratorImplInfo` generated from model 'comAdobeCqSocialSiteImplSiteConfiguratorImplInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialSiteImplSiteConfiguratorImplInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialSiteImplSiteConfiguratorImplProperties` generated from model 'comAdobeCqSocialSiteImplSiteConfiguratorImplProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialSiteImplSiteConfiguratorImplProperties` (
  `componentsUsingTags` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialSrpImplSocialSolrConnectorInfo` generated from model 'comAdobeCqSocialSrpImplSocialSolrConnectorInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialSrpImplSocialSolrConnectorInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialSrpImplSocialSolrConnectorProperties` generated from model 'comAdobeCqSocialSrpImplSocialSolrConnectorProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialSrpImplSocialSolrConnectorProperties` (
  `srptype` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialSyncImplDiffChangesObserverInfo` generated from model 'comAdobeCqSocialSyncImplDiffChangesObserverInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialSyncImplDiffChangesObserverInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialSyncImplDiffChangesObserverProperties` generated from model 'comAdobeCqSocialSyncImplDiffChangesObserverProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialSyncImplDiffChangesObserverProperties` (
  `enabled` long,
  `agentName` long,
  `diffPath` long,
  `propertyNames` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialSyncImplGroupSyncListenerImplInfo` generated from model 'comAdobeCqSocialSyncImplGroupSyncListenerImplInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialSyncImplGroupSyncListenerImplInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialSyncImplGroupSyncListenerImplProperties` generated from model 'comAdobeCqSocialSyncImplGroupSyncListenerImplProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialSyncImplGroupSyncListenerImplProperties` (
  `nodetypes` long,
  `ignorableprops` long,
  `ignorablenodes` long,
  `enabled` long,
  `distfolders` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialSyncImplPublisherSyncServiceImplInfo` generated from model 'comAdobeCqSocialSyncImplPublisherSyncServiceImplInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialSyncImplPublisherSyncServiceImplInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialSyncImplPublisherSyncServiceImplProperties` generated from model 'comAdobeCqSocialSyncImplPublisherSyncServiceImplProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialSyncImplPublisherSyncServiceImplProperties` (
  `activeRunModes` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialSyncImplUserSyncListenerImplInfo` generated from model 'comAdobeCqSocialSyncImplUserSyncListenerImplInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialSyncImplUserSyncListenerImplInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialSyncImplUserSyncListenerImplProperties` generated from model 'comAdobeCqSocialSyncImplUserSyncListenerImplProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialSyncImplUserSyncListenerImplProperties` (
  `nodetypes` long,
  `ignorableprops` long,
  `ignorablenodes` long,
  `enabled` long,
  `distfolders` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialTranslationImplTranslationServiceConfigManagerInfo` generated from model 'comAdobeCqSocialTranslationImplTranslationServiceConfigManagerInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialTranslationImplTranslationServiceConfigManagerInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties` generated from model 'comAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties` (
  `translatelanguage` long,
  `translatedisplay` long,
  `translateattribution` long,
  `translatecaching` long,
  `translatesmartrendering` long,
  `translatecachingduration` long,
  `translatesessionsaveinterval` long,
  `translatesessionsavebatchLimit` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialTranslationImplUGCLanguageDetectorInfo` generated from model 'comAdobeCqSocialTranslationImplUGCLanguageDetectorInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialTranslationImplUGCLanguageDetectorInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialTranslationImplUGCLanguageDetectorProperties` generated from model 'comAdobeCqSocialTranslationImplUGCLanguageDetectorProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialTranslationImplUGCLanguageDetectorProperties` (
  `eventtopics` long,
  `eventfilter` long,
  `translatelistenertype` long,
  `translatepropertylist` long,
  `poolSize` long,
  `maxPoolSize` long,
  `queueSize` long,
  `keepAliveTime` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplInfo` generated from model 'comAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties` generated from model 'comAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties` (
  `threadPoolSize` long,
  `delayTime` long,
  `workerSleepTime` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplInfo` generated from model 'comAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties` generated from model 'comAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties` (
  `poolSize` long,
  `maxPoolSize` long,
  `queueSize` long,
  `keepAliveTime` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialUgcbaseImplPublisherConfigurationImplInfo` generated from model 'comAdobeCqSocialUgcbaseImplPublisherConfigurationImplInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialUgcbaseImplPublisherConfigurationImplInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties` generated from model 'comAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties` (
  `isPrimaryPublisher` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialUgcbaseImplSocialUtilsImplInfo` generated from model 'comAdobeCqSocialUgcbaseImplSocialUtilsImplInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialUgcbaseImplSocialUtilsImplInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialUgcbaseImplSocialUtilsImplProperties` generated from model 'comAdobeCqSocialUgcbaseImplSocialUtilsImplProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialUgcbaseImplSocialUtilsImplProperties` (
  `legacyCloudUGCPathMapping` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialUgcbaseModerationImplAutoModerationImplInfo` generated from model 'comAdobeCqSocialUgcbaseModerationImplAutoModerationImplInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialUgcbaseModerationImplAutoModerationImplInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties` generated from model 'comAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties` (
  `automoderationsequence` long,
  `automoderationonfailurestop` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialUgcbaseModerationImplSentimentProcessInfo` generated from model 'comAdobeCqSocialUgcbaseModerationImplSentimentProcessInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialUgcbaseModerationImplSentimentProcessInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties` generated from model 'comAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties` (
  `watchwordspositive` long,
  `watchwordsnegative` long,
  `watchwordspath` long,
  `sentimentpath` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliInfo` generated from model 'comAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliProperties` generated from model 'comAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliProperties` (
  `defaultattachmenttypeblacklist` long,
  `baselineattachmenttypeblacklist` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplInfo` generated from model 'comAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties` generated from model 'comAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties` (
  `parameterwhitelist` long,
  `parameterwhitelistprefixes` long,
  `binaryparameterwhitelist` long,
  `modifierwhitelist` long,
  `operationwhitelist` long,
  `operationwhitelistprefixes` long,
  `typehintwhitelist` long,
  `resourcetypewhitelist` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletInfo` generated from model 'comAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties` generated from model 'comAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties` (
  `slingservletextensions` long,
  `slingservletpaths` long,
  `slingservletmethods` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialUserImplTransportHttpToPublisherInfo` generated from model 'comAdobeCqSocialUserImplTransportHttpToPublisherInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialUserImplTransportHttpToPublisherInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqSocialUserImplTransportHttpToPublisherProperties` generated from model 'comAdobeCqSocialUserImplTransportHttpToPublisherProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqSocialUserImplTransportHttpToPublisherProperties` (
  `enable` long,
  `agentconfiguration` long,
  `contextpath` long,
  `disabledciphersuites` long,
  `enabledciphersuites` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactInfo` generated from model 'comAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties` generated from model 'comAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties` (
  `resourcetypes` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqUpgradesCleanupImplUpgradeContentCleanupInfo` generated from model 'comAdobeCqUpgradesCleanupImplUpgradeContentCleanupInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqUpgradesCleanupImplUpgradeContentCleanupInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties` generated from model 'comAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties` (
  `deletepathregexps` long,
  `deletesql2query` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupInfo` generated from model 'comAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties` generated from model 'comAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties` (
  `deletenameregexps` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceInfo` generated from model 'comAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProperties` generated from model 'comAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProperties` (
  `threshold` long,
  `jobTopicName` long,
  `emailEnabled` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskInfo` generated from model 'comAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties` generated from model 'comAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties` (
  `schedulerexpression` long,
  `jobpurgethreshold` long,
  `jobpurgemaxjobs` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceInfo` generated from model 'comAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties` generated from model 'comAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties` (
  `threshold` long,
  `jobTopicName` long,
  `emailEnabled` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceInfo` generated from model 'comAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties` generated from model 'comAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties` (
  `threshold` long,
  `jobTopicName` long,
  `emailEnabled` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqWcmLaunchesImplLaunchesEventHandlerInfo` generated from model 'comAdobeCqWcmLaunchesImplLaunchesEventHandlerInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqWcmLaunchesImplLaunchesEventHandlerInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties` generated from model 'comAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties` (
  `eventfilter` long,
  `launcheseventhandlerthreadpoolmaxsize` long,
  `launcheseventhandlerthreadpoolpriority` long,
  `launcheseventhandlerupdatelastmodification` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorInfo` generated from model 'comAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties` generated from model 'comAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties` (
  `cqwcmqrcodeservletwhitelist` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqWcmStyleInternalComponentStyleInfoCacheImplInfo` generated from model 'comAdobeCqWcmStyleInternalComponentStyleInfoCacheImplInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqWcmStyleInternalComponentStyleInfoCacheImplInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties` generated from model 'comAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties` (
  `size` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplInfo` generated from model 'comAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties` generated from model 'comAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties` (
  `syncTranslationStateschedulingFormat` long,
  `schedulingRepeatTranslationschedulingFormat` long,
  `syncTranslationStatelockTimeoutInMinutes` long,
  `exportformat` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceInfo` generated from model 'comAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties` generated from model 'comAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties` (
  `portaloutboxes` long,
  `draftdataservice` long,
  `draftmetadataservice` long,
  `submitdataservice` long,
  `submitmetadataservice` long,
  `pendingSigndataservice` long,
  `pendingSignmetadataservice` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeFdFpConfigFormsPortalSchedulerServiceInfo` generated from model 'comAdobeFdFpConfigFormsPortalSchedulerServiceInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeFdFpConfigFormsPortalSchedulerServiceInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeFdFpConfigFormsPortalSchedulerServiceProperties` generated from model 'comAdobeFdFpConfigFormsPortalSchedulerServiceProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeFdFpConfigFormsPortalSchedulerServiceProperties` (
  `formportalinterval` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeFormsCommonServiceImplDefaultDataProviderInfo` generated from model 'comAdobeFormsCommonServiceImplDefaultDataProviderInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeFormsCommonServiceImplDefaultDataProviderInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeFormsCommonServiceImplDefaultDataProviderProperties` generated from model 'comAdobeFormsCommonServiceImplDefaultDataProviderProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeFormsCommonServiceImplDefaultDataProviderProperties` (
  `alloweddataFileLocations` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpInfo` generated from model 'comAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties` generated from model 'comAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties` (
  `tempStorageConfig` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeFormsCommonServletTempCleanUpTaskInfo` generated from model 'comAdobeFormsCommonServletTempCleanUpTaskInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeFormsCommonServletTempCleanUpTaskInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeFormsCommonServletTempCleanUpTaskProperties` generated from model 'comAdobeFormsCommonServletTempCleanUpTaskProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeFormsCommonServletTempCleanUpTaskProperties` (
  `schedulerexpression` long,
  `DurationforTemporaryStorage` long,
  `DurationforAnonymousStorage` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteAcpPlatformPlatformServletInfo` generated from model 'comAdobeGraniteAcpPlatformPlatformServletInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteAcpPlatformPlatformServletInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteAcpPlatformPlatformServletProperties` generated from model 'comAdobeGraniteAcpPlatformPlatformServletProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteAcpPlatformPlatformServletProperties` (
  `querylimit` long,
  `filetypeextensionmap` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteActivitystreamsImplActivityManagerImplInfo` generated from model 'comAdobeGraniteActivitystreamsImplActivityManagerImplInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteActivitystreamsImplActivityManagerImplInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteActivitystreamsImplActivityManagerImplProperties` generated from model 'comAdobeGraniteActivitystreamsImplActivityManagerImplProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteActivitystreamsImplActivityManagerImplProperties` (
  `aggregaterelationships` long,
  `aggregatedescendvirtual` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteAnalyzerBaseSystemStatusServletInfo` generated from model 'comAdobeGraniteAnalyzerBaseSystemStatusServletInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteAnalyzerBaseSystemStatusServletInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long,
  `bundle_location` text,
  `service_location` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteAnalyzerBaseSystemStatusServletProperties` generated from model 'comAdobeGraniteAnalyzerBaseSystemStatusServletProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteAnalyzerBaseSystemStatusServletProperties` (
  `disabled` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletInfo` generated from model 'comAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long,
  `bundle_location` text,
  `service_location` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties` generated from model 'comAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties` (
  `disabled` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteApicontrollerFilterResolverHookFactoryInfo` generated from model 'comAdobeGraniteApicontrollerFilterResolverHookFactoryInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteApicontrollerFilterResolverHookFactoryInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long,
  `bundle_location` text,
  `service_location` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties` generated from model 'comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties` (
  `comadobecqcdncdnrewriter` long,
  `comadobecqcloudconfigcomponents` long,
  `comadobecqcloudconfigcore` long,
  `comadobecqcloudconfigui` long,
  `comadobecqcomadobecqeditor` long,
  `comadobecqcomadobecqprojectscore` long,
  `comadobecqcomadobecqprojectswcmcore` long,
  `comadobecqcomadobecquicommons` long,
  `comadobecqcomadobecqwcmstyle` long,
  `comadobecqcqactivitymapintegration` long,
  `comadobecqcqcontexthubcommons` long,
  `comadobecqcqdtm` long,
  `comadobecqcqhealthcheck` long,
  `comadobecqcqmultisitetargeting` long,
  `comadobecqcqpreupgradecleanup` long,
  `comadobecqcqproductinfoprovider` long,
  `comadobecqcqrestsites` long,
  `comadobecqcqsecurityhc` long,
  `comadobecqdamcqdamsvghandler` long,
  `comadobecqdamcqscene7imaging` long,
  `comadobecqdtmreactorcore` long,
  `comadobecqdtmreactorui` long,
  `comadobecqexpjspelresolver` long,
  `comadobecqinboxcqinbox` long,
  `comadobecqjsonschemaparser` long,
  `comadobecqmediacqmediapublishingdpsfpcore` long,
  `comadobecqmobilecqmobilecaas` long,
  `comadobecqmobilecqmobileindexbuilder` long,
  `comadobecqmobilecqmobilephonegapbuild` long,
  `comadobecqmyspell` long,
  `comadobecqsampleweretailcore` long,
  `comadobecqscreenscomadobecqscreensdcc` long,
  `comadobecqscreenscomadobecqscreensmqcore` long,
  `comadobecqsocialcqsocialasprovider` long,
  `comadobecqsocialcqsocialbadgingbasicimpl` long,
  `comadobecqsocialcqsocialbadgingimpl` long,
  `comadobecqsocialcqsocialcalendarimpl` long,
  `comadobecqsocialcqsocialcontentfragmentsimpl` long,
  `comadobecqsocialcqsocialenablementimpl` long,
  `comadobecqsocialcqsocialgraphimpl` long,
  `comadobecqsocialcqsocialideationimpl` long,
  `comadobecqsocialcqsocialjcrprovider` long,
  `comadobecqsocialcqsocialmembersimpl` long,
  `comadobecqsocialcqsocialmsprovider` long,
  `comadobecqsocialcqsocialnotificationschannelsweb` long,
  `comadobecqsocialcqsocialnotificationsimpl` long,
  `comadobecqsocialcqsocialrdbprovider` long,
  `comadobecqsocialcqsocialscfimpl` long,
  `comadobecqsocialcqsocialscoringbasicimpl` long,
  `comadobecqsocialcqsocialscoringimpl` long,
  `comadobecqsocialcqsocialserviceusersimpl` long,
  `comadobecqsocialcqsocialsrpimpl` long,
  `comadobecqsocialcqsocialugcbaseimpl` long,
  `comadobedamcqdamcfmimpl` long,
  `comadobeformsfoundationformsfoundationbase` long,
  `comadobegraniteapicontroller` long,
  `comadobegraniteassetcore` long,
  `comadobegraniteauthsso` long,
  `comadobegranitebundleshcimpl` long,
  `comadobegranitecompatrouter` long,
  `comadobegraniteconf` long,
  `comadobegraniteconfuicore` long,
  `comadobegranitecors` long,
  `comadobegranitecrxexplorer` long,
  `comadobegranitecrxdelite` long,
  `comadobegranitecryptoconfig` long,
  `comadobegranitecryptoextension` long,
  `comadobegranitecryptofile` long,
  `comadobegranitecryptojcr` long,
  `comadobegranitecsrf` long,
  `comadobegranitedistributioncore` long,
  `comadobegranitedropwizardmetrics` long,
  `comadobegranitefragsimpl` long,
  `comadobegranitegibson` long,
  `comadobegraniteinfocollector` long,
  `comadobegraniteinstallerfactorypackages` long,
  `comadobegranitejettyssl` long,
  `comadobegranitejobsasync` long,
  `comadobegranitemaintenanceoak` long,
  `comadobegranitemonitoringcore` long,
  `comadobegranitequeries` long,
  `comadobegranitereplicationhcimpl` long,
  `comadobegraniterepositorychecker` long,
  `comadobegraniterepositoryhcimpl` long,
  `comadobegraniterestassets` long,
  `comadobegranitesecurityui` long,
  `comadobegranitestartup` long,
  `comadobegranitetagsoup` long,
  `comadobegranitetaskmanagementcore` long,
  `comadobegranitetaskmanagementworkflow` long,
  `comadobegraniteuiclientlibscompilerless` long,
  `comadobegraniteuiclientlibsprocessorgcc` long,
  `comadobegranitewebconsoleplugins` long,
  `comadobegraniteworkflowconsole` long,
  `comadobexmpworkerfilesnativefragmentlinux` long,
  `comadobexmpworkerfilesnativefragmentmacosx` long,
  `comadobexmpworkerfilesnativefragmentwin` long,
  `comdaycommonsosgiwrappersimplejndi` long,
  `comdaycqcqauthhandler` long,
  `comdaycqcqcompatconfigupdate` long,
  `comdaycqcqlicensebranding` long,
  `comdaycqcqnotifcationimpl` long,
  `comdaycqcqreplicationaudit` long,
  `comdaycqcqsearchext` long,
  `comdaycqdamcqdamannotationprint` long,
  `comdaycqdamcqdamassetusage` long,
  `comdaycqdamcqdams7dam` long,
  `comdaycqdamcqdamsimilaritysearch` long,
  `comdaycqdamdamwebdavsupport` long,
  `comdaycqpreupgradetasks` long,
  `comdaycqreplicationextensions` long,
  `comdaycqwcmcqmsmcore` long,
  `comdaycqwcmcqwcmtranslation` long,
  `daycommonsjrawio` long,
  `orgapacheariesjmxwhiteboard` long,
  `orgapachefelixhttpsslfilter` long,
  `orgapachefelixorgapachefelixthreaddump` long,
  `orgapachefelixwebconsolepluginsds` long,
  `orgapachefelixwebconsolepluginsevent` long,
  `orgapachefelixwebconsolepluginsmemoryusage` long,
  `orgapachefelixwebconsolepluginspackageadmin` long,
  `orgapachejackrabbitoakauthldap` long,
  `orgapachejackrabbitoaksegmenttar` long,
  `orgapachejackrabbitoaksolrosgi` long,
  `orgapacheslingbundleresourceimpl` long,
  `orgapacheslingcommonsfsclassloader` long,
  `orgapacheslingcommonslogwebconsole` long,
  `orgapacheslingdatasource` long,
  `orgapacheslingdiscoverybase` long,
  `orgapacheslingdiscoveryoak` long,
  `orgapacheslingdiscoverysupport` long,
  `orgapacheslingdistributionapi` long,
  `orgapacheslingdistributioncore` long,
  `orgapacheslingextensionswebconsolesecurityprovider` long,
  `orgapacheslinghcwebconsole` long,
  `orgapacheslinginstallerconsole` long,
  `orgapacheslinginstallerproviderfile` long,
  `orgapacheslinginstallerproviderjcr` long,
  `orgapacheslingjcrdavex` long,
  `orgapacheslingjcrresourcesecurity` long,
  `orgapacheslingjmxprovider` long,
  `orgapacheslinglaunchpadinstaller` long,
  `orgapacheslingmodelsimpl` long,
  `orgapacheslingrepoinitparser` long,
  `orgapacheslingresourceinventory` long,
  `orgapacheslingresourceresolver` long,
  `orgapacheslingscriptingjavascript` long,
  `orgapacheslingscriptingjst` long,
  `orgapacheslingscriptingsightlyjsprovider` long,
  `orgapacheslingscriptingsightlymodelsprovider` long,
  `orgapacheslingsecurity` long,
  `orgapacheslingservletscompat` long,
  `orgapacheslingservletsget` long,
  `orgapacheslingstartupfilterdisabler` long,
  `orgapacheslingtracer` long,
  `weretailclientappcore` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteAuthCertImplClientCertAuthHandlerInfo` generated from model 'comAdobeGraniteAuthCertImplClientCertAuthHandlerInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteAuthCertImplClientCertAuthHandlerInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteAuthCertImplClientCertAuthHandlerProperties` generated from model 'comAdobeGraniteAuthCertImplClientCertAuthHandlerProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteAuthCertImplClientCertAuthHandlerProperties` (
  `path` long,
  `serviceranking` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionInfo` generated from model 'comAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionProperties` generated from model 'comAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionProperties` (
  `oauthproviderid` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplInfo` generated from model 'comAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties` generated from model 'comAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties` (
  `authimsclientsecret` long,
  `customizertype` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorInfo` generated from model 'comAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorProperties` generated from model 'comAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorProperties` (
  `oauthproviderid` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteAuthImsImplIMSProviderImplInfo` generated from model 'comAdobeGraniteAuthImsImplIMSProviderImplInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteAuthImsImplIMSProviderImplInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteAuthImsImplIMSProviderImplProperties` generated from model 'comAdobeGraniteAuthImsImplIMSProviderImplProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteAuthImsImplIMSProviderImplProperties` (
  `oauthproviderid` long,
  `oauthproviderimsauthorizationurl` long,
  `oauthproviderimstokenurl` long,
  `oauthproviderimsprofileurl` long,
  `oauthproviderimsextendeddetailsurls` long,
  `oauthproviderimsvalidatetokenurl` long,
  `oauthproviderimssessionproperty` long,
  `oauthproviderimsservicetokenclientid` long,
  `oauthproviderimsservicetokenclientsecret` long,
  `oauthproviderimsservicetoken` long,
  `imsorgref` long,
  `imsgroupmapping` long,
  `oauthproviderimsonlylicensegroup` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteAuthImsImplImsConfigProviderImplInfo` generated from model 'comAdobeGraniteAuthImsImplImsConfigProviderImplInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteAuthImsImplImsConfigProviderImplInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteAuthImsImplImsConfigProviderImplProperties` generated from model 'comAdobeGraniteAuthImsImplImsConfigProviderImplProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteAuthImsImplImsConfigProviderImplProperties` (
  `oauthconfigmanagerimsconfigid` long,
  `imsowningEntity` long,
  `aeminstanceId` long,
  `imsserviceCode` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteAuthImsInfo` generated from model 'comAdobeGraniteAuthImsInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteAuthImsInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long,
  `bundle_location` text,
  `service_location` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteAuthImsProperties` generated from model 'comAdobeGraniteAuthImsProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteAuthImsProperties` (
  `configid` long,
  `scope` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteAuthOauthAccesstokenProviderInfo` generated from model 'comAdobeGraniteAuthOauthAccesstokenProviderInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteAuthOauthAccesstokenProviderInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteAuthOauthAccesstokenProviderProperties` generated from model 'comAdobeGraniteAuthOauthAccesstokenProviderProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteAuthOauthAccesstokenProviderProperties` (
  `name` long,
  `authtokenprovidertitle` long,
  `authtokenproviderdefaultclaims` long,
  `authtokenproviderendpoint` long,
  `authaccesstokenrequest` long,
  `authtokenproviderkeypairalias` long,
  `authtokenproviderconntimeout` long,
  `authtokenprovidersotimeout` long,
  `authtokenproviderclientid` long,
  `authtokenproviderscope` long,
  `authtokenproviderreuseaccesstoken` long,
  `authtokenproviderrelaxedssl` long,
  `tokenrequestcustomizertype` long,
  `authtokenvalidatortype` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteAuthOauthImplBearerAuthenticationHandlerInfo` generated from model 'comAdobeGraniteAuthOauthImplBearerAuthenticationHandlerInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteAuthOauthImplBearerAuthenticationHandlerInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties` generated from model 'comAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties` (
  `path` long,
  `oauthclientIdsallowed` long,
  `authbearersyncims` long,
  `authtokenRequestParameter` long,
  `oauthbearerconfigid` long,
  `oauthjwtsupport` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteAuthOauthImplDefaultTokenValidatorImplInfo` generated from model 'comAdobeGraniteAuthOauthImplDefaultTokenValidatorImplInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteAuthOauthImplDefaultTokenValidatorImplInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties` generated from model 'comAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties` (
  `authtokenvalidatortype` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteAuthOauthImplFacebookProviderImplInfo` generated from model 'comAdobeGraniteAuthOauthImplFacebookProviderImplInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteAuthOauthImplFacebookProviderImplInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteAuthOauthImplFacebookProviderImplProperties` generated from model 'comAdobeGraniteAuthOauthImplFacebookProviderImplProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteAuthOauthImplFacebookProviderImplProperties` (
  `oauthproviderid` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteAuthOauthImplGithubProviderImplInfo` generated from model 'comAdobeGraniteAuthOauthImplGithubProviderImplInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteAuthOauthImplGithubProviderImplInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteAuthOauthImplGithubProviderImplProperties` generated from model 'comAdobeGraniteAuthOauthImplGithubProviderImplProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteAuthOauthImplGithubProviderImplProperties` (
  `oauthproviderid` long,
  `oauthprovidergithubauthorizationurl` long,
  `oauthprovidergithubtokenurl` long,
  `oauthprovidergithubprofileurl` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteAuthOauthImplGraniteProviderInfo` generated from model 'comAdobeGraniteAuthOauthImplGraniteProviderInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteAuthOauthImplGraniteProviderInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteAuthOauthImplGraniteProviderProperties` generated from model 'comAdobeGraniteAuthOauthImplGraniteProviderProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteAuthOauthImplGraniteProviderProperties` (
  `oauthproviderid` long,
  `oauthprovidergraniteauthorizationurl` long,
  `oauthprovidergranitetokenurl` long,
  `oauthprovidergraniteprofileurl` long,
  `oauthprovidergraniteextendeddetailsurls` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteAuthOauthImplHelperProviderConfigManagerInfo` generated from model 'comAdobeGraniteAuthOauthImplHelperProviderConfigManagerInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteAuthOauthImplHelperProviderConfigManagerInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long,
  `bundle_location` text,
  `service_location` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalInfo` generated from model 'comAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties` generated from model 'comAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties` (
  `oauthcookielogintimeout` long,
  `oauthcookiemaxage` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteAuthOauthImplHelperProviderConfigManagerProperties` generated from model 'comAdobeGraniteAuthOauthImplHelperProviderConfigManagerProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteAuthOauthImplHelperProviderConfigManagerProperties` (
  `oauthcookielogintimeout` long,
  `oauthcookiemaxage` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerInfo` generated from model 'comAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerProperties` generated from model 'comAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerProperties` (
  `path` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteAuthOauthImplTwitterProviderImplInfo` generated from model 'comAdobeGraniteAuthOauthImplTwitterProviderImplInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteAuthOauthImplTwitterProviderImplInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteAuthOauthImplTwitterProviderImplProperties` generated from model 'comAdobeGraniteAuthOauthImplTwitterProviderImplProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteAuthOauthImplTwitterProviderImplProperties` (
  `oauthproviderid` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteAuthOauthProviderInfo` generated from model 'comAdobeGraniteAuthOauthProviderInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteAuthOauthProviderInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteAuthOauthProviderProperties` generated from model 'comAdobeGraniteAuthOauthProviderProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteAuthOauthProviderProperties` (
  `oauthconfigid` long,
  `oauthclientid` long,
  `oauthclientsecret` long,
  `oauthscope` long,
  `oauthconfigproviderid` long,
  `oauthcreateusers` long,
  `oauthuseridproperty` long,
  `forcestrictusernamematching` long,
  `oauthencodeuserids` long,
  `oauthhashuserids` long,
  `oauthcallBackUrl` long,
  `oauthaccesstokenpersist` long,
  `oauthaccesstokenpersistcookie` long,
  `oauthcsrfstateprotection` long,
  `oauthredirectrequestparams` long,
  `oauthconfigsiblingsallow` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteAuthRequirementImplDefaultRequirementHandlerInfo` generated from model 'comAdobeGraniteAuthRequirementImplDefaultRequirementHandlerInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteAuthRequirementImplDefaultRequirementHandlerInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties` generated from model 'comAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties` (
  `supportedPaths` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteAuthSamlSamlAuthenticationHandlerInfo` generated from model 'comAdobeGraniteAuthSamlSamlAuthenticationHandlerInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteAuthSamlSamlAuthenticationHandlerInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long,
  `bundle_location` text,
  `service_location` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties` generated from model 'comAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties` (
  `path` long,
  `serviceranking` long,
  `idpUrl` long,
  `idpCertAlias` long,
  `idpHttpRedirect` long,
  `serviceProviderEntityId` long,
  `assertionConsumerServiceURL` long,
  `spPrivateKeyAlias` long,
  `keyStorePassword` long,
  `defaultRedirectUrl` long,
  `userIDAttribute` long,
  `useEncryption` long,
  `createUser` long,
  `userIntermediatePath` long,
  `addGroupMemberships` long,
  `groupMembershipAttribute` long,
  `defaultGroups` long,
  `nameIdFormat` long,
  `synchronizeAttributes` long,
  `handleLogout` long,
  `logoutUrl` long,
  `clockTolerance` long,
  `digestMethod` long,
  `signatureMethod` long,
  `identitySyncType` long,
  `idpIdentifier` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteAuthSsoImplSsoAuthenticationHandlerInfo` generated from model 'comAdobeGraniteAuthSsoImplSsoAuthenticationHandlerInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteAuthSsoImplSsoAuthenticationHandlerInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties` generated from model 'comAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties` (
  `path` long,
  `serviceranking` long,
  `jaascontrolFlag` long,
  `jaasrealmName` long,
  `jaasranking` long,
  `headers` long,
  `cookies` long,
  `parameters` long,
  `usermap` long,
  `format` long,
  `trustedCredentialsAttribute` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteBundlesHcImplCodeCacheHealthCheckInfo` generated from model 'comAdobeGraniteBundlesHcImplCodeCacheHealthCheckInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteBundlesHcImplCodeCacheHealthCheckInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties` generated from model 'comAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties` (
  `hctags` long,
  `minimumcodecachesize` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckInfo` generated from model 'comAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckProperties` generated from model 'comAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckProperties` (
  `hctags` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteBundlesHcImplDavExBundleHealthCheckInfo` generated from model 'comAdobeGraniteBundlesHcImplDavExBundleHealthCheckInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteBundlesHcImplDavExBundleHealthCheckInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteBundlesHcImplDavExBundleHealthCheckProperties` generated from model 'comAdobeGraniteBundlesHcImplDavExBundleHealthCheckProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteBundlesHcImplDavExBundleHealthCheckProperties` (
  `hctags` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckInfo` generated from model 'comAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties` generated from model 'comAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties` (
  `hctags` long,
  `ignoredbundles` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteBundlesHcImplJobsHealthCheckInfo` generated from model 'comAdobeGraniteBundlesHcImplJobsHealthCheckInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteBundlesHcImplJobsHealthCheckInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteBundlesHcImplJobsHealthCheckProperties` generated from model 'comAdobeGraniteBundlesHcImplJobsHealthCheckProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteBundlesHcImplJobsHealthCheckProperties` (
  `hctags` long,
  `maxqueuedjobs` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteBundlesHcImplSlingGetServletHealthCheckInfo` generated from model 'comAdobeGraniteBundlesHcImplSlingGetServletHealthCheckInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteBundlesHcImplSlingGetServletHealthCheckInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteBundlesHcImplSlingGetServletHealthCheckProperties` generated from model 'comAdobeGraniteBundlesHcImplSlingGetServletHealthCheckProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteBundlesHcImplSlingGetServletHealthCheckProperties` (
  `hctags` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckInfo` generated from model 'comAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckProperties` generated from model 'comAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckProperties` (
  `hctags` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckInfo` generated from model 'comAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckProperties` generated from model 'comAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckProperties` (
  `hctags` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckInfo` generated from model 'comAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckProperties` generated from model 'comAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckProperties` (
  `hctags` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteBundlesHcImplWebDavBundleHealthCheckInfo` generated from model 'comAdobeGraniteBundlesHcImplWebDavBundleHealthCheckInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteBundlesHcImplWebDavBundleHealthCheckInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteBundlesHcImplWebDavBundleHealthCheckProperties` generated from model 'comAdobeGraniteBundlesHcImplWebDavBundleHealthCheckProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteBundlesHcImplWebDavBundleHealthCheckProperties` (
  `hctags` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteCommentsInternalCommentReplicationContentFilterFacInfo` generated from model 'comAdobeGraniteCommentsInternalCommentReplicationContentFilterFacInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteCommentsInternalCommentReplicationContentFilterFacInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties` generated from model 'comAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties` (
  `replicatecommentresourceTypes` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteCompatrouterImplCompatSwitchingServiceImplInfo` generated from model 'comAdobeGraniteCompatrouterImplCompatSwitchingServiceImplInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteCompatrouterImplCompatSwitchingServiceImplInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties` generated from model 'comAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties` (
  `compatgroups` long,
  `enabled` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteCompatrouterImplRoutingConfigInfo` generated from model 'comAdobeGraniteCompatrouterImplRoutingConfigInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteCompatrouterImplRoutingConfigInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteCompatrouterImplRoutingConfigProperties` generated from model 'comAdobeGraniteCompatrouterImplRoutingConfigProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteCompatrouterImplRoutingConfigProperties` (
  `id` long PRIMARY KEY,
  `compatPath` long,
  `newPath` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteCompatrouterImplSwitchMappingConfigInfo` generated from model 'comAdobeGraniteCompatrouterImplSwitchMappingConfigInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteCompatrouterImplSwitchMappingConfigInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteCompatrouterImplSwitchMappingConfigProperties` generated from model 'comAdobeGraniteCompatrouterImplSwitchMappingConfigProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteCompatrouterImplSwitchMappingConfigProperties` (
  `group` long,
  `ids` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingInfo` generated from model 'comAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties` generated from model 'comAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties` (
  `enabled` long,
  `fallbackPaths` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteContexthubImplContextHubImplInfo` generated from model 'comAdobeGraniteContexthubImplContextHubImplInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteContexthubImplContextHubImplInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteContexthubImplContextHubImplProperties` generated from model 'comAdobeGraniteContexthubImplContextHubImplProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteContexthubImplContextHubImplProperties` (
  `comadobegranitecontexthubsilent_mode` long,
  `comadobegranitecontexthubshow_ui` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteCorsImplCORSPolicyImplInfo` generated from model 'comAdobeGraniteCorsImplCORSPolicyImplInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteCorsImplCORSPolicyImplInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteCorsImplCORSPolicyImplProperties` generated from model 'comAdobeGraniteCorsImplCORSPolicyImplProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteCorsImplCORSPolicyImplProperties` (
  `alloworigin` long,
  `alloworiginregexp` long,
  `allowedpaths` long,
  `exposedheaders` long,
  `maxage` long,
  `supportedheaders` long,
  `supportedmethods` long,
  `supportscredentials` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteCsrfImplCSRFFilterInfo` generated from model 'comAdobeGraniteCsrfImplCSRFFilterInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteCsrfImplCSRFFilterInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long,
  `bundle_location` text,
  `service_location` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteCsrfImplCSRFFilterProperties` generated from model 'comAdobeGraniteCsrfImplCSRFFilterProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteCsrfImplCSRFFilterProperties` (
  `filtermethods` long,
  `filterenablesafeuseragents` long,
  `filtersafeuseragents` long,
  `filterexcludedpaths` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteCsrfImplCSRFServletInfo` generated from model 'comAdobeGraniteCsrfImplCSRFServletInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteCsrfImplCSRFServletInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteCsrfImplCSRFServletProperties` generated from model 'comAdobeGraniteCsrfImplCSRFServletProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteCsrfImplCSRFServletProperties` (
  `csrftokenexpiresin` long,
  `slingauthrequirements` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeInfo` generated from model 'comAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeProperties` generated from model 'comAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeProperties` (
  `name` long,
  `username` long,
  `encryptedPassword` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteDistributionCoreImplDiffDiffChangesObserverInfo` generated from model 'comAdobeGraniteDistributionCoreImplDiffDiffChangesObserverInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteDistributionCoreImplDiffDiffChangesObserverInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties` generated from model 'comAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties` (
  `enabled` long,
  `agentName` long,
  `diffPath` long,
  `observedPath` long,
  `serviceName` long,
  `propertyNames` long,
  `distributionDelay` long,
  `serviceUsertarget` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteDistributionCoreImplDiffDiffEventListenerInfo` generated from model 'comAdobeGraniteDistributionCoreImplDiffDiffEventListenerInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteDistributionCoreImplDiffDiffEventListenerInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties` generated from model 'comAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties` (
  `diffPath` long,
  `serviceName` long,
  `serviceUsertarget` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteDistributionCoreImplDistributionToReplicationEvenInfo` generated from model 'comAdobeGraniteDistributionCoreImplDistributionToReplicationEvenInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteDistributionCoreImplDistributionToReplicationEvenInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteDistributionCoreImplDistributionToReplicationEvenProperties` generated from model 'comAdobeGraniteDistributionCoreImplDistributionToReplicationEvenProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteDistributionCoreImplDistributionToReplicationEvenProperties` (
  `importername` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatInfo` generated from model 'comAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties` generated from model 'comAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties` (
  `providerName` long,
  `forwardrequests` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteDistributionCoreImplReplicationDistributionTransInfo` generated from model 'comAdobeGraniteDistributionCoreImplReplicationDistributionTransInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteDistributionCoreImplReplicationDistributionTransInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteDistributionCoreImplReplicationDistributionTransProperties` generated from model 'comAdobeGraniteDistributionCoreImplReplicationDistributionTransProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteDistributionCoreImplReplicationDistributionTransProperties` (
  `forwardrequests` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuInfo` generated from model 'comAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties` generated from model 'comAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties` (
  `name` long,
  `serviceName` long,
  `userId` long,
  `accessTokenProvidertarget` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteFragsImplCheckHttpHeaderFlagInfo` generated from model 'comAdobeGraniteFragsImplCheckHttpHeaderFlagInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteFragsImplCheckHttpHeaderFlagInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteFragsImplCheckHttpHeaderFlagProperties` generated from model 'comAdobeGraniteFragsImplCheckHttpHeaderFlagProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteFragsImplCheckHttpHeaderFlagProperties` (
  `featurename` long,
  `featuredescription` long,
  `httpheadername` long,
  `httpheadervaluepattern` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteFragsImplRandomFeatureInfo` generated from model 'comAdobeGraniteFragsImplRandomFeatureInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteFragsImplRandomFeatureInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteFragsImplRandomFeatureProperties` generated from model 'comAdobeGraniteFragsImplRandomFeatureProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteFragsImplRandomFeatureProperties` (
  `featurename` long,
  `featuredescription` long,
  `activepercentage` long,
  `cookiename` long,
  `cookiemaxAge` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteHttpcacheFileFileCacheStoreInfo` generated from model 'comAdobeGraniteHttpcacheFileFileCacheStoreInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteHttpcacheFileFileCacheStoreInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteHttpcacheFileFileCacheStoreProperties` generated from model 'comAdobeGraniteHttpcacheFileFileCacheStoreProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteHttpcacheFileFileCacheStoreProperties` (
  `comadobegranitehttpcachefiledocumentRoot` long,
  `comadobegranitehttpcachefileincludeHost` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteHttpcacheImplOuterCacheFilterInfo` generated from model 'comAdobeGraniteHttpcacheImplOuterCacheFilterInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteHttpcacheImplOuterCacheFilterInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteHttpcacheImplOuterCacheFilterProperties` generated from model 'comAdobeGraniteHttpcacheImplOuterCacheFilterProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteHttpcacheImplOuterCacheFilterProperties` (
  `comadobegranitehttpcacheurlpaths` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteI18nImplBundlePseudoTranslationsInfo` generated from model 'comAdobeGraniteI18nImplBundlePseudoTranslationsInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteI18nImplBundlePseudoTranslationsInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteI18nImplBundlePseudoTranslationsProperties` generated from model 'comAdobeGraniteI18nImplBundlePseudoTranslationsProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteI18nImplBundlePseudoTranslationsProperties` (
  `pseudopatterns` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteI18nImplPreferencesLocaleResolverServiceInfo` generated from model 'comAdobeGraniteI18nImplPreferencesLocaleResolverServiceInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteI18nImplPreferencesLocaleResolverServiceInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties` generated from model 'comAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties` (
  `securitypreferencesname` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteInfocollectorInfoCollectorInfo` generated from model 'comAdobeGraniteInfocollectorInfoCollectorInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteInfocollectorInfoCollectorInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteInfocollectorInfoCollectorProperties` generated from model 'comAdobeGraniteInfocollectorInfoCollectorProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteInfocollectorInfoCollectorProperties` (
  `graniteinfocollectorincludeThreadDumps` long,
  `graniteinfocollectorincludeHeapDump` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteJettySslInternalGraniteSslConnectorFactoryInfo` generated from model 'comAdobeGraniteJettySslInternalGraniteSslConnectorFactoryInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteJettySslInternalGraniteSslConnectorFactoryInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long,
  `additionalProperties` text,
  `bundle_location` text,
  `service_location` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties` generated from model 'comAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties` (
  `comadobegranitejettysslport` long,
  `comadobegranitejettysslkeystoreuser` long,
  `comadobegranitejettysslkeystorepassword` long,
  `comadobegranitejettysslciphersuitesexcluded` long,
  `comadobegranitejettysslciphersuitesincluded` long,
  `comadobegranitejettysslclientcertificate` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteLicenseImplLicenseCheckFilterInfo` generated from model 'comAdobeGraniteLicenseImplLicenseCheckFilterInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteLicenseImplLicenseCheckFilterInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteLicenseImplLicenseCheckFilterProperties` generated from model 'comAdobeGraniteLicenseImplLicenseCheckFilterProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteLicenseImplLicenseCheckFilterProperties` (
  `checkInternval` long,
  `excludeIds` long,
  `encryptPing` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteLoggingImplLogAnalyserImplInfo` generated from model 'comAdobeGraniteLoggingImplLogAnalyserImplInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteLoggingImplLogAnalyserImplInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteLoggingImplLogAnalyserImplProperties` generated from model 'comAdobeGraniteLoggingImplLogAnalyserImplProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteLoggingImplLogAnalyserImplProperties` (
  `messagesqueuesize` long,
  `loggerconfig` long,
  `messagessize` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteLoggingImplLogErrorHealthCheckInfo` generated from model 'comAdobeGraniteLoggingImplLogErrorHealthCheckInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteLoggingImplLogErrorHealthCheckInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteLoggingImplLogErrorHealthCheckProperties` generated from model 'comAdobeGraniteLoggingImplLogErrorHealthCheckProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteLoggingImplLogErrorHealthCheckProperties` (
  `hctags` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskInfo` generated from model 'comAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long,
  `bundle_location` text,
  `service_location` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties` generated from model 'comAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties` (
  `granitemaintenancemandatory` long,
  `jobtopics` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskInfo` generated from model 'comAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long,
  `bundle_location` text,
  `service_location` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskProperties` generated from model 'comAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskProperties` (
  `jobtopics` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskInfo` generated from model 'comAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties` generated from model 'comAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties` (
  `fullgcdays` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteMonitoringImplScriptConfigImplInfo` generated from model 'comAdobeGraniteMonitoringImplScriptConfigImplInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteMonitoringImplScriptConfigImplInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteMonitoringImplScriptConfigImplProperties` generated from model 'comAdobeGraniteMonitoringImplScriptConfigImplProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteMonitoringImplScriptConfigImplProperties` (
  `scriptfilename` long,
  `scriptdisplay` long,
  `scriptpath` long,
  `scriptplatform` long,
  `interval` long,
  `jmxdomain` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanInfo` generated from model 'comAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties` generated from model 'comAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties` (
  `path` long,
  `jaascontrolFlag` long,
  `jaasrealmName` long,
  `jaasranking` long,
  `oauthofflinevalidation` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteOauthServerImplAccessTokenCleanupTaskInfo` generated from model 'comAdobeGraniteOauthServerImplAccessTokenCleanupTaskInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteOauthServerImplAccessTokenCleanupTaskInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteOauthServerImplAccessTokenCleanupTaskProperties` generated from model 'comAdobeGraniteOauthServerImplAccessTokenCleanupTaskProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteOauthServerImplAccessTokenCleanupTaskProperties` (
  `schedulerexpression` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteOauthServerImplOAuth2ClientRevocationServletInfo` generated from model 'comAdobeGraniteOauthServerImplOAuth2ClientRevocationServletInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteOauthServerImplOAuth2ClientRevocationServletInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteOauthServerImplOAuth2ClientRevocationServletProperties` generated from model 'comAdobeGraniteOauthServerImplOAuth2ClientRevocationServletProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteOauthServerImplOAuth2ClientRevocationServletProperties` (
  `oauthclientrevocationactive` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletInfo` generated from model 'comAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties` generated from model 'comAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties` (
  `slingservletpaths` long,
  `oauthrevocationactive` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteOauthServerImplOAuth2TokenEndpointServletInfo` generated from model 'comAdobeGraniteOauthServerImplOAuth2TokenEndpointServletInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteOauthServerImplOAuth2TokenEndpointServletInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties` generated from model 'comAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties` (
  `oauthissuer` long,
  `oauthaccesstokenexpiresin` long,
  `osgihttpwhiteboardservletpattern` long,
  `osgihttpwhiteboardcontextselect` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteOauthServerImplOAuth2TokenRevocationServletInfo` generated from model 'comAdobeGraniteOauthServerImplOAuth2TokenRevocationServletInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteOauthServerImplOAuth2TokenRevocationServletInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties` generated from model 'comAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties` (
  `oauthtokenrevocationactive` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteOffloadingImplOffloadingConfiguratorInfo` generated from model 'comAdobeGraniteOffloadingImplOffloadingConfiguratorInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteOffloadingImplOffloadingConfiguratorInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteOffloadingImplOffloadingConfiguratorProperties` generated from model 'comAdobeGraniteOffloadingImplOffloadingConfiguratorProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteOffloadingImplOffloadingConfiguratorProperties` (
  `offloadingtransporter` long,
  `offloadingcleanuppayload` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteOffloadingImplOffloadingJobClonerInfo` generated from model 'comAdobeGraniteOffloadingImplOffloadingJobClonerInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteOffloadingImplOffloadingJobClonerInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long,
  `bundle_location` text,
  `service_location` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteOffloadingImplOffloadingJobClonerProperties` generated from model 'comAdobeGraniteOffloadingImplOffloadingJobClonerProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteOffloadingImplOffloadingJobClonerProperties` (
  `offloadingjobclonerenabled` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteOffloadingImplOffloadingJobOffloaderInfo` generated from model 'comAdobeGraniteOffloadingImplOffloadingJobOffloaderInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteOffloadingImplOffloadingJobOffloaderInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long,
  `bundle_location` text,
  `service_location` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties` generated from model 'comAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties` (
  `offloadingoffloaderenabled` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerInfo` generated from model 'comAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long,
  `bundle_location` text,
  `service_location` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerProperties` generated from model 'comAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerProperties` (
  `offloadingagentmanagerenabled` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoInfo` generated from model 'comAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long,
  `bundle_location` text,
  `service_location` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties` generated from model 'comAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties` (
  `defaulttransportagenttoworkerprefix` long,
  `defaulttransportagenttomasterprefix` long,
  `defaulttransportinputpackage` long,
  `defaulttransportoutputpackage` long,
  `defaulttransportreplicationsynchronous` long,
  `defaulttransportcontentpackage` long,
  `offloadingtransporterdefaultenabled` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplInfo` generated from model 'comAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties` generated from model 'comAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties` (
  `omnisearchsuggestionrequiretextmin` long,
  `omnisearchsuggestionspellcheckrequire` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteOptoutImplOptOutServiceImplInfo` generated from model 'comAdobeGraniteOptoutImplOptOutServiceImplInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteOptoutImplOptOutServiceImplInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long,
  `bundle_location` text,
  `service_location` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteOptoutImplOptOutServiceImplProperties` generated from model 'comAdobeGraniteOptoutImplOptOutServiceImplProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteOptoutImplOptOutServiceImplProperties` (
  `optoutcookies` long,
  `optoutheaders` long,
  `optoutwhitelistcookies` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteQueriesImplHcAsyncIndexHealthCheckInfo` generated from model 'comAdobeGraniteQueriesImplHcAsyncIndexHealthCheckInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteQueriesImplHcAsyncIndexHealthCheckInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties` generated from model 'comAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties` (
  `indexingcriticalthreshold` long,
  `indexingwarnthreshold` long,
  `hctags` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteQueriesImplHcLargeIndexHealthCheckInfo` generated from model 'comAdobeGraniteQueriesImplHcLargeIndexHealthCheckInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteQueriesImplHcLargeIndexHealthCheckInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties` generated from model 'comAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties` (
  `largeindexcriticalthreshold` long,
  `largeindexwarnthreshold` long,
  `hctags` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteQueriesImplHcQueriesStatusHealthCheckInfo` generated from model 'comAdobeGraniteQueriesImplHcQueriesStatusHealthCheckInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteQueriesImplHcQueriesStatusHealthCheckInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteQueriesImplHcQueriesStatusHealthCheckProperties` generated from model 'comAdobeGraniteQueriesImplHcQueriesStatusHealthCheckProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteQueriesImplHcQueriesStatusHealthCheckProperties` (
  `hctags` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteQueriesImplHcQueryHealthCheckMetricsInfo` generated from model 'comAdobeGraniteQueriesImplHcQueryHealthCheckMetricsInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteQueriesImplHcQueryHealthCheckMetricsInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteQueriesImplHcQueryHealthCheckMetricsProperties` generated from model 'comAdobeGraniteQueriesImplHcQueryHealthCheckMetricsProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteQueriesImplHcQueryHealthCheckMetricsProperties` (
  `getPeriod` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteQueriesImplHcQueryLimitsHealthCheckInfo` generated from model 'comAdobeGraniteQueriesImplHcQueryLimitsHealthCheckInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteQueriesImplHcQueryLimitsHealthCheckInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteQueriesImplHcQueryLimitsHealthCheckProperties` generated from model 'comAdobeGraniteQueriesImplHcQueryLimitsHealthCheckProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteQueriesImplHcQueryLimitsHealthCheckProperties` (
  `hctags` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteReplicationHcImplReplicationQueueHealthCheckInfo` generated from model 'comAdobeGraniteReplicationHcImplReplicationQueueHealthCheckInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteReplicationHcImplReplicationQueueHealthCheckInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties` generated from model 'comAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties` (
  `numberofretriesallowed` long,
  `hctags` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCInfo` generated from model 'comAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCProperties` generated from model 'comAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCProperties` (
  `hctags` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckInfo` generated from model 'comAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckProperties` generated from model 'comAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckProperties` (
  `hctags` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCInfo` generated from model 'comAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCProperties` generated from model 'comAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCProperties` (
  `hctags` long,
  `excludesearchpath` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckInfo` generated from model 'comAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckProperties` generated from model 'comAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckProperties` (
  `hctags` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheInfo` generated from model 'comAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheProperties` generated from model 'comAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheProperties` (
  `hctags` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckInfo` generated from model 'comAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties` generated from model 'comAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties` (
  `hctags` long,
  `accountlogins` long,
  `consolelogins` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckInfo` generated from model 'comAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties` generated from model 'comAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties` (
  `hctags` long,
  `diskspacewarnthreshold` long,
  `diskspaceerrorthreshold` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckInfo` generated from model 'comAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckProperties` generated from model 'comAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckProperties` (
  `hctags` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteRepositoryImplCommitStatsConfigInfo` generated from model 'comAdobeGraniteRepositoryImplCommitStatsConfigInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteRepositoryImplCommitStatsConfigInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long,
  `bundle_location` text,
  `service_location` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteRepositoryImplCommitStatsConfigProperties` generated from model 'comAdobeGraniteRepositoryImplCommitStatsConfigProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteRepositoryImplCommitStatsConfigProperties` (
  `enabled` long,
  `intervalSeconds` long,
  `commitsPerIntervalThreshold` long,
  `maxLocationLength` long,
  `maxDetailsShown` long,
  `minDetailsPercentage` long,
  `threadMatchers` long,
  `maxGreedyDepth` long,
  `greedyStackMatchers` long,
  `stackFilters` long,
  `stackMatchers` long,
  `stackCategorizers` long,
  `stackShorteners` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteRepositoryServiceUserConfigurationInfo` generated from model 'comAdobeGraniteRepositoryServiceUserConfigurationInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteRepositoryServiceUserConfigurationInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteRepositoryServiceUserConfigurationProperties` generated from model 'comAdobeGraniteRepositoryServiceUserConfigurationProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteRepositoryServiceUserConfigurationProperties` (
  `serviceranking` long,
  `serviceuserssimpleSubjectPopulation` long,
  `serviceuserslist` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImInfo` generated from model 'comAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImProperties` generated from model 'comAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImProperties` (
  `hctags` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteResourcestatusImplCompositeStatusTypeInfo` generated from model 'comAdobeGraniteResourcestatusImplCompositeStatusTypeInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteResourcestatusImplCompositeStatusTypeInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteResourcestatusImplCompositeStatusTypeProperties` generated from model 'comAdobeGraniteResourcestatusImplCompositeStatusTypeProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteResourcestatusImplCompositeStatusTypeProperties` (
  `name` long,
  `types` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteResourcestatusImplStatusResourceProviderImplInfo` generated from model 'comAdobeGraniteResourcestatusImplStatusResourceProviderImplInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteResourcestatusImplStatusResourceProviderImplInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteResourcestatusImplStatusResourceProviderImplProperties` generated from model 'comAdobeGraniteResourcestatusImplStatusResourceProviderImplProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteResourcestatusImplStatusResourceProviderImplProperties` (
  `providerroot` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteRestAssetsImplAssetContentDispositionFilterInfo` generated from model 'comAdobeGraniteRestAssetsImplAssetContentDispositionFilterInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteRestAssetsImplAssetContentDispositionFilterInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties` generated from model 'comAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties` (
  `mimeallowEmpty` long,
  `mimeallowed` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplInfo` generated from model 'comAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties` generated from model 'comAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties` (
  `providerroots` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteRestImplServletDefaultGETServletInfo` generated from model 'comAdobeGraniteRestImplServletDefaultGETServletInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteRestImplServletDefaultGETServletInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteRestImplServletDefaultGETServletProperties` generated from model 'comAdobeGraniteRestImplServletDefaultGETServletProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteRestImplServletDefaultGETServletProperties` (
  `defaultlimit` long,
  `useabsoluteuri` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSInfo` generated from model 'comAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSProperties` generated from model 'comAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSProperties` (
  `hctags` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteSecurityUserUserPropertiesServiceInfo` generated from model 'comAdobeGraniteSecurityUserUserPropertiesServiceInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteSecurityUserUserPropertiesServiceInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long,
  `bundle_location` text,
  `service_location` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteSecurityUserUserPropertiesServiceProperties` generated from model 'comAdobeGraniteSecurityUserUserPropertiesServiceProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteSecurityUserUserPropertiesServiceProperties` (
  `adaptercondition` long,
  `graniteuserpropertiesnodetypes` long,
  `graniteuserpropertiesresourcetypes` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteSocialgraphImplSocialGraphFactoryImplInfo` generated from model 'comAdobeGraniteSocialgraphImplSocialGraphFactoryImplInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteSocialgraphImplSocialGraphFactoryImplInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties` generated from model 'comAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties` (
  `group2memberrelationshipoutgoing` long,
  `group2memberexcludedoutgoing` long,
  `group2memberrelationshipincoming` long,
  `group2memberexcludedincoming` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplInfo` generated from model 'comAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties` generated from model 'comAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties` (
  `schedulerexpression` long,
  `jmxobjectname` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryInfo` generated from model 'comAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryProperties` generated from model 'comAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryProperties` (
  `adaptercondition` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceInfo` generated from model 'comAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties` generated from model 'comAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties` (
  `archivingenabled` long,
  `schedulerexpression` long,
  `archivesincedayscompleted` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskInfo` generated from model 'comAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties` generated from model 'comAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties` (
  `purgeCompleted` long,
  `completedAge` long,
  `purgeActive` long,
  `activeAge` long,
  `saveThreshold` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorInfo` generated from model 'comAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties` generated from model 'comAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties` (
  `adaptercondition` long,
  `taskmanageradmingroups` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteThreaddumpThreadDumpCollectorInfo` generated from model 'comAdobeGraniteThreaddumpThreadDumpCollectorInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteThreaddumpThreadDumpCollectorInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteThreaddumpThreadDumpCollectorProperties` generated from model 'comAdobeGraniteThreaddumpThreadDumpCollectorProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteThreaddumpThreadDumpCollectorProperties` (
  `schedulerperiod` long,
  `schedulerrunOn` long,
  `granitethreaddumpenabled` long,
  `granitethreaddumpdumpsPerFile` long,
  `granitethreaddumpenableGzipCompression` long,
  `granitethreaddumpenableDirectoriesCompression` long,
  `granitethreaddumpenableJStack` long,
  `granitethreaddumpmaxBackupDays` long,
  `granitethreaddumpbackupCleanTrigger` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslInfo` generated from model 'comAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties` generated from model 'comAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties` (
  `translationFactory` long,
  `defaultConnectorLabel` long,
  `defaultConnectorAttribution` long,
  `defaultConnectorWorkspaceId` long,
  `defaultConnectorSubscriptionKey` long,
  `languageMapLocation` long,
  `categoryMapLocation` long,
  `retryAttempts` long,
  `timeoutCount` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteTranslationCoreImplTranslationManagerImplInfo` generated from model 'comAdobeGraniteTranslationCoreImplTranslationManagerImplInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteTranslationCoreImplTranslationManagerImplInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteTranslationCoreImplTranslationManagerImplProperties` generated from model 'comAdobeGraniteTranslationCoreImplTranslationManagerImplProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteTranslationCoreImplTranslationManagerImplProperties` (
  `defaultConnectorName` long,
  `defaultCategory` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplInfo` generated from model 'comAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long,
  `bundle_location` text,
  `service_location` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties` generated from model 'comAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties` (
  `htmllibmanagertiming` long,
  `htmllibmanagerdebuginitjs` long,
  `htmllibmanagerminify` long,
  `htmllibmanagerdebug` long,
  `htmllibmanagergzip` long,
  `htmllibmanagermaxDataUriSize` long,
  `htmllibmanagermaxage` long,
  `htmllibmanagerforceCQUrlInfo` long,
  `htmllibmanagerdefaultthemename` long,
  `htmllibmanagerdefaultuserthemename` long,
  `htmllibmanagerclientmanager` long,
  `htmllibmanagerpathlist` long,
  `htmllibmanagerexcludedpathlist` long,
  `htmllibmanagerprocessorjs` long,
  `htmllibmanagerprocessorcss` long,
  `htmllibmanagerlongcachepatterns` long,
  `htmllibmanagerlongcacheformat` long,
  `htmllibmanageruseFileSystemOutputCache` long,
  `htmllibmanagerfileSystemOutputCacheLocation` long,
  `htmllibmanagerdisablereplacement` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureInfo` generated from model 'comAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureProperties` generated from model 'comAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureProperties` (
  `enabled` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceInfo` generated from model 'comAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties` generated from model 'comAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties` (
  `graniteworkflowWorkflowPublishEventServiceenabled` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerInfo` generated from model 'comAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties` generated from model 'comAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties` (
  `bucketSize` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerInfo` generated from model 'comAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties` generated from model 'comAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties` (
  `defaulttimeout` long,
  `maxtimeout` long,
  `defaultperiod` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteWorkflowCoreJobJobHandlerInfo` generated from model 'comAdobeGraniteWorkflowCoreJobJobHandlerInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteWorkflowCoreJobJobHandlerInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteWorkflowCoreJobJobHandlerProperties` generated from model 'comAdobeGraniteWorkflowCoreJobJobHandlerProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteWorkflowCoreJobJobHandlerProperties` (
  `jobtopics` long,
  `allowselfprocesstermination` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumInfo` generated from model 'comAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties` generated from model 'comAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties` (
  `jobtopics` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteWorkflowCorePayloadMapCacheInfo` generated from model 'comAdobeGraniteWorkflowCorePayloadMapCacheInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteWorkflowCorePayloadMapCacheInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteWorkflowCorePayloadMapCacheProperties` generated from model 'comAdobeGraniteWorkflowCorePayloadMapCacheProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteWorkflowCorePayloadMapCacheProperties` (
  `getSystemWorkflowModels` long,
  `getPackageRootPath` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerInfo` generated from model 'comAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties` generated from model 'comAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties` (
  `payloadmovewhitelist` long,
  `payloadmovehandlefromworkflowprocess` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteWorkflowCoreWorkflowConfigInfo` generated from model 'comAdobeGraniteWorkflowCoreWorkflowConfigInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteWorkflowCoreWorkflowConfigInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteWorkflowCoreWorkflowConfigProperties` generated from model 'comAdobeGraniteWorkflowCoreWorkflowConfigProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteWorkflowCoreWorkflowConfigProperties` (
  `cqworkflowconfigworkflowpackagesrootpath` long,
  `cqworkflowconfigworkflowprocesslegacymode` long,
  `cqworkflowconfigallowlocking` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteWorkflowCoreWorkflowSessionFactoryInfo` generated from model 'comAdobeGraniteWorkflowCoreWorkflowSessionFactoryInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteWorkflowCoreWorkflowSessionFactoryInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties` generated from model 'comAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties` (
  `graniteworkflowinboxsortpropertyName` long,
  `graniteworkflowinboxsortorder` long,
  `cqworkflowjobretry` long,
  `cqworkflowsuperuser` long,
  `graniteworkflowinboxQuerySize` long,
  `graniteworkflowadminUserGroupFilter` long,
  `graniteworkflowenforceWorkitemAssigneePermissions` long,
  `graniteworkflowenforceWorkflowInitiatorPermissions` long,
  `graniteworkflowinjectTenantIdInJobTopics` long,
  `graniteworkflowmaxPurgeSaveThreshold` long,
  `graniteworkflowmaxPurgeQueryCount` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteWorkflowPurgeSchedulerInfo` generated from model 'comAdobeGraniteWorkflowPurgeSchedulerInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteWorkflowPurgeSchedulerInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeGraniteWorkflowPurgeSchedulerProperties` generated from model 'comAdobeGraniteWorkflowPurgeSchedulerProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeGraniteWorkflowPurgeSchedulerProperties` (
  `scheduledpurgename` long,
  `scheduledpurgeworkflowStatus` long,
  `scheduledpurgemodelIds` long,
  `scheduledpurgedaysold` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeOctopusNcommBootstrapInfo` generated from model 'comAdobeOctopusNcommBootstrapInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeOctopusNcommBootstrapInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeOctopusNcommBootstrapProperties` generated from model 'comAdobeOctopusNcommBootstrapProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeOctopusNcommBootstrapProperties` (
  `maxConnections` long,
  `maxRequests` long,
  `requestTimeout` long,
  `requestRetries` long,
  `launchTimeout` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSInfo` generated from model 'comAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties` generated from model 'comAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties` (
  `communitiesintegrationlivefyreslingeventfilter` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeXmpWorkerFilesNcommXMPFilesNCommInfo` generated from model 'comAdobeXmpWorkerFilesNcommXMPFilesNCommInfo'
--

CREATE TABLE IF NOT EXISTS `comAdobeXmpWorkerFilesNcommXMPFilesNCommInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long,
  `bundle_location` text,
  `service_location` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comAdobeXmpWorkerFilesNcommXMPFilesNCommProperties` generated from model 'comAdobeXmpWorkerFilesNcommXMPFilesNCommProperties'
--

CREATE TABLE IF NOT EXISTS `comAdobeXmpWorkerFilesNcommXMPFilesNCommProperties` (
  `maxConnections` long,
  `maxRequests` long,
  `requestTimeout` long,
  `logDir` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCommonsDatasourceJdbcpoolJdbcPoolServiceInfo` generated from model 'comDayCommonsDatasourceJdbcpoolJdbcPoolServiceInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCommonsDatasourceJdbcpoolJdbcPoolServiceInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties` generated from model 'comDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties` (
  `jdbcdriverclass` long,
  `jdbcconnectionuri` long,
  `jdbcusername` long,
  `jdbcpassword` long,
  `jdbcvalidationquery` long,
  `defaultreadonly` long,
  `defaultautocommit` long,
  `poolsize` long,
  `poolmaxwaitmsec` long,
  `datasourcename` long,
  `datasourcesvcproperties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCommonsHttpclientInfo` generated from model 'comDayCommonsHttpclientInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCommonsHttpclientInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCommonsHttpclientProperties` generated from model 'comDayCommonsHttpclientProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCommonsHttpclientProperties` (
  `proxyenabled` long,
  `proxyhost` long,
  `proxyuser` long,
  `proxypassword` long,
  `proxyntlmhost` long,
  `proxyntlmdomain` long,
  `proxyexceptions` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqAnalyticsImplStorePropertiesChangeListenerInfo` generated from model 'comDayCqAnalyticsImplStorePropertiesChangeListenerInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqAnalyticsImplStorePropertiesChangeListenerInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqAnalyticsImplStorePropertiesChangeListenerProperties` generated from model 'comDayCqAnalyticsImplStorePropertiesChangeListenerProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqAnalyticsImplStorePropertiesChangeListenerProperties` (
  `cqstorelisteneradditionalStorePaths` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqAnalyticsSitecatalystImplExporterClassificationsExporteInfo` generated from model 'comDayCqAnalyticsSitecatalystImplExporterClassificationsExporteInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqAnalyticsSitecatalystImplExporterClassificationsExporteInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties` generated from model 'comDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties` (
  `allowedpaths` long,
  `cqanalyticssaintexporterpagesize` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqAnalyticsSitecatalystImplImporterReportImporterInfo` generated from model 'comDayCqAnalyticsSitecatalystImplImporterReportImporterInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqAnalyticsSitecatalystImplImporterReportImporterInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqAnalyticsSitecatalystImplImporterReportImporterProperties` generated from model 'comDayCqAnalyticsSitecatalystImplImporterReportImporterProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqAnalyticsSitecatalystImplImporterReportImporterProperties` (
  `reportfetchattempts` long,
  `reportfetchdelay` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryInfo` generated from model 'comDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryProperties` generated from model 'comDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryProperties` (
  `cqanalyticsadapterfactorycontextstores` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplInfo` generated from model 'comDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long,
  `additionalProperties` text,
  `bundle_location` text,
  `service_location` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties` generated from model 'comDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties` (
  `cqanalyticssitecatalystservicedatacenterurl` long,
  `devhostnamepatterns` long,
  `connectiontimeout` long,
  `sockettimeout` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterInfo` generated from model 'comDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterProperties` generated from model 'comDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterProperties` (
  `cqanalyticstestandtargetaccountoptionsupdaterenabled` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerInfo` generated from model 'comDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerProperties` generated from model 'comDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerProperties` (
  `cqanalyticstestandtargetdeleteauthoractivitylistenerenabled` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerInfo` generated from model 'comDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long,
  `bundle_location` text,
  `service_location` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerProperties` generated from model 'comDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerProperties` (
  `cqanalyticstestandtargetpushauthorcampaignpagelistenerenabled` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqAnalyticsTestandtargetImplSegmentImporterInfo` generated from model 'comDayCqAnalyticsTestandtargetImplSegmentImporterInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqAnalyticsTestandtargetImplSegmentImporterInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqAnalyticsTestandtargetImplSegmentImporterProperties` generated from model 'comDayCqAnalyticsTestandtargetImplSegmentImporterProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqAnalyticsTestandtargetImplSegmentImporterProperties` (
  `cqanalyticstestandtargetsegmentimporterenabled` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqAnalyticsTestandtargetImplServiceWebServiceImplInfo` generated from model 'comDayCqAnalyticsTestandtargetImplServiceWebServiceImplInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqAnalyticsTestandtargetImplServiceWebServiceImplInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties` generated from model 'comDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties` (
  `endpointUri` long,
  `connectionTimeout` long,
  `socketTimeout` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqAnalyticsTestandtargetImplServletsAdminServerServletInfo` generated from model 'comDayCqAnalyticsTestandtargetImplServletsAdminServerServletInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqAnalyticsTestandtargetImplServletsAdminServerServletInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqAnalyticsTestandtargetImplServletsAdminServerServletProperties` generated from model 'comDayCqAnalyticsTestandtargetImplServletsAdminServerServletProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqAnalyticsTestandtargetImplServletsAdminServerServletProperties` (
  `testandtargetendpointurl` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplInfo` generated from model 'comDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties` generated from model 'comDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties` (
  `cqanalyticstestandtargetapiurl` long,
  `cqanalyticstestandtargettimeout` long,
  `cqanalyticstestandtargetsockettimeout` long,
  `cqanalyticstestandtargetrecommendationsurlreplace` long,
  `cqanalyticstestandtargetrecommendationsurlreplacewith` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqAuthImplCugCugSupportImplInfo` generated from model 'comDayCqAuthImplCugCugSupportImplInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqAuthImplCugCugSupportImplInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqAuthImplCugCugSupportImplProperties` generated from model 'comDayCqAuthImplCugCugSupportImplProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqAuthImplCugCugSupportImplProperties` (
  `cugexemptedprincipals` long,
  `cugenabled` long,
  `cugprincipalsregex` long,
  `cugprincipalsreplacement` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqAuthImplLoginSelectorHandlerInfo` generated from model 'comDayCqAuthImplLoginSelectorHandlerInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqAuthImplLoginSelectorHandlerInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long,
  `bundle_location` text,
  `service_location` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqAuthImplLoginSelectorHandlerProperties` generated from model 'comDayCqAuthImplLoginSelectorHandlerProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqAuthImplLoginSelectorHandlerProperties` (
  `path` long,
  `serviceranking` long,
  `authloginselectormappings` long,
  `authloginselectorchangepwmappings` long,
  `authloginselectordefaultloginpage` long,
  `authloginselectordefaultchangepwpage` long,
  `authloginselectorhandle` long,
  `authloginselectorhandleallextensions` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqCommonsImplExternalizerImplInfo` generated from model 'comDayCqCommonsImplExternalizerImplInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqCommonsImplExternalizerImplInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long,
  `bundle_location` text,
  `service_location` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqCommonsImplExternalizerImplProperties` generated from model 'comDayCqCommonsImplExternalizerImplProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqCommonsImplExternalizerImplProperties` (
  `externalizerdomains` long,
  `externalizerhost` long,
  `externalizercontextpath` long,
  `externalizerencodedpath` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqCommonsServletsRootMappingServletInfo` generated from model 'comDayCqCommonsServletsRootMappingServletInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqCommonsServletsRootMappingServletInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long,
  `bundle_location` text,
  `service_location` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqCommonsServletsRootMappingServletProperties` generated from model 'comDayCqCommonsServletsRootMappingServletProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqCommonsServletsRootMappingServletProperties` (
  `rootmappingtarget` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeInfo` generated from model 'comDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties` generated from model 'comDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties` (
  `codeupgradetasks` long,
  `codeupgradetaskfilters` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListInfo` generated from model 'comDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties` generated from model 'comDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties` (
  `upgradeTaskIgnoreList` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistInfo` generated from model 'comDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties` generated from model 'comDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties` (
  `effectiveBundleListPath` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqContentsyncImplContentSyncManagerImplInfo` generated from model 'comDayCqContentsyncImplContentSyncManagerImplInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqContentsyncImplContentSyncManagerImplInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqContentsyncImplContentSyncManagerImplProperties` generated from model 'comDayCqContentsyncImplContentSyncManagerImplProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqContentsyncImplContentSyncManagerImplProperties` (
  `contentsyncfallbackauthorizable` long,
  `contentsyncfallbackupdateuser` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqDamCommonsHandlerStandardImageHandlerInfo` generated from model 'comDayCqDamCommonsHandlerStandardImageHandlerInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqDamCommonsHandlerStandardImageHandlerInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqDamCommonsHandlerStandardImageHandlerProperties` generated from model 'comDayCqDamCommonsHandlerStandardImageHandlerProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqDamCommonsHandlerStandardImageHandlerProperties` (
  `large_file_threshold` long,
  `large_comment_threshold` long,
  `cqdamenableextmetaextraction` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqDamCommonsMetadataXmpFilterBlackWhiteInfo` generated from model 'comDayCqDamCommonsMetadataXmpFilterBlackWhiteInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqDamCommonsMetadataXmpFilterBlackWhiteInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties` generated from model 'comDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties` (
  `xmpfilterapply_whitelist` long,
  `xmpfilterwhitelist` long,
  `xmpfilterapply_blacklist` long,
  `xmpfilterblacklist` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqDamCommonsUtilImplAssetCacheImplInfo` generated from model 'comDayCqDamCommonsUtilImplAssetCacheImplInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqDamCommonsUtilImplAssetCacheImplInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqDamCommonsUtilImplAssetCacheImplProperties` generated from model 'comDayCqDamCommonsUtilImplAssetCacheImplProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqDamCommonsUtilImplAssetCacheImplProperties` (
  `largefilemin` long,
  `cacheapply` long,
  `mimetypes` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigInfo` generated from model 'comDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties` generated from model 'comDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties` (
  `cqdamconfigannotationpdfdocumentwidth` long,
  `cqdamconfigannotationpdfdocumentheight` long,
  `cqdamconfigannotationpdfdocumentpaddinghorizontal` long,
  `cqdamconfigannotationpdfdocumentpaddingvertical` long,
  `cqdamconfigannotationpdffontsize` long,
  `cqdamconfigannotationpdffontcolor` long,
  `cqdamconfigannotationpdffontfamily` long,
  `cqdamconfigannotationpdffontlight` long,
  `cqdamconfigannotationpdfmarginTextImage` long,
  `cqdamconfigannotationpdfminImageHeight` long,
  `cqdamconfigannotationpdfreviewStatuswidth` long,
  `cqdamconfigannotationpdfreviewStatuscolorapproved` long,
  `cqdamconfigannotationpdfreviewStatuscolorrejected` long,
  `cqdamconfigannotationpdfreviewStatuscolorchangesRequested` long,
  `cqdamconfigannotationpdfannotationMarkerwidth` long,
  `cqdamconfigannotationpdfassetminheight` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqDamCoreImplAssetMoveListenerInfo` generated from model 'comDayCqDamCoreImplAssetMoveListenerInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqDamCoreImplAssetMoveListenerInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqDamCoreImplAssetMoveListenerProperties` generated from model 'comDayCqDamCoreImplAssetMoveListenerProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqDamCoreImplAssetMoveListenerProperties` (
  `enabled` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqDamCoreImplAssethomeAssetHomePageConfigurationInfo` generated from model 'comDayCqDamCoreImplAssethomeAssetHomePageConfigurationInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqDamCoreImplAssethomeAssetHomePageConfigurationInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties` generated from model 'comDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties` (
  `isEnabled` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletInfo` generated from model 'comDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties` generated from model 'comDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties` (
  `cqdamadhocassetshareprezipmaxcontentsize` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqDamCoreImplCacheCQBufferedImageCacheInfo` generated from model 'comDayCqDamCoreImplCacheCQBufferedImageCacheInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqDamCoreImplCacheCQBufferedImageCacheInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqDamCoreImplCacheCQBufferedImageCacheProperties` generated from model 'comDayCqDamCoreImplCacheCQBufferedImageCacheProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqDamCoreImplCacheCQBufferedImageCacheProperties` (
  `cqdamimagecachemaxmemory` long,
  `cqdamimagecachemaxage` long,
  `cqdamimagecachemaxdimension` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqDamCoreImplDamChangeEventListenerInfo` generated from model 'comDayCqDamCoreImplDamChangeEventListenerInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqDamCoreImplDamChangeEventListenerInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqDamCoreImplDamChangeEventListenerProperties` generated from model 'comDayCqDamCoreImplDamChangeEventListenerProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqDamCoreImplDamChangeEventListenerProperties` (
  `changeeventlistenerobservedpaths` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqDamCoreImplDamEventPurgeServiceInfo` generated from model 'comDayCqDamCoreImplDamEventPurgeServiceInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqDamCoreImplDamEventPurgeServiceInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqDamCoreImplDamEventPurgeServiceProperties` generated from model 'comDayCqDamCoreImplDamEventPurgeServiceProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqDamCoreImplDamEventPurgeServiceProperties` (
  `schedulerexpression` long,
  `maxSavedActivities` long,
  `saveInterval` long,
  `enableActivityPurge` long,
  `eventTypes` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqDamCoreImplDamEventRecorderImplInfo` generated from model 'comDayCqDamCoreImplDamEventRecorderImplInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqDamCoreImplDamEventRecorderImplInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqDamCoreImplDamEventRecorderImplProperties` generated from model 'comDayCqDamCoreImplDamEventRecorderImplProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqDamCoreImplDamEventRecorderImplProperties` (
  `eventfilter` long,
  `eventqueuelength` long,
  `eventrecorderenabled` long,
  `eventrecorderblacklist` long,
  `eventrecordereventtypes` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqDamCoreImplEventDamEventAuditListenerInfo` generated from model 'comDayCqDamCoreImplEventDamEventAuditListenerInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqDamCoreImplEventDamEventAuditListenerInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqDamCoreImplEventDamEventAuditListenerProperties` generated from model 'comDayCqDamCoreImplEventDamEventAuditListenerProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqDamCoreImplEventDamEventAuditListenerProperties` (
  `eventfilter` long,
  `enabled` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqDamCoreImplExpiryNotificationJobImplInfo` generated from model 'comDayCqDamCoreImplExpiryNotificationJobImplInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqDamCoreImplExpiryNotificationJobImplInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqDamCoreImplExpiryNotificationJobImplProperties` generated from model 'comDayCqDamCoreImplExpiryNotificationJobImplProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqDamCoreImplExpiryNotificationJobImplProperties` (
  `cqdamexpirynotificationscheduleristimebased` long,
  `cqdamexpirynotificationschedulertimebasedrule` long,
  `cqdamexpirynotificationschedulerperiodrule` long,
  `send_email` long,
  `asset_expired_limit` long,
  `prior_notification_seconds` long,
  `cqdamexpirynotificationurlprotocol` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatInfo` generated from model 'comDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties` generated from model 'comDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties` (
  `isEnabled` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqDamCoreImplGfxCommonsGfxRendererInfo` generated from model 'comDayCqDamCoreImplGfxCommonsGfxRendererInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqDamCoreImplGfxCommonsGfxRendererInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqDamCoreImplGfxCommonsGfxRendererProperties` generated from model 'comDayCqDamCoreImplGfxCommonsGfxRendererProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqDamCoreImplGfxCommonsGfxRendererProperties` (
  `skipbufferedcache` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqDamCoreImplHandlerEPSFormatHandlerInfo` generated from model 'comDayCqDamCoreImplHandlerEPSFormatHandlerInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqDamCoreImplHandlerEPSFormatHandlerInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqDamCoreImplHandlerEPSFormatHandlerProperties` generated from model 'comDayCqDamCoreImplHandlerEPSFormatHandlerProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqDamCoreImplHandlerEPSFormatHandlerProperties` (
  `mimetype` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqDamCoreImplHandlerIndesignFormatHandlerInfo` generated from model 'comDayCqDamCoreImplHandlerIndesignFormatHandlerInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqDamCoreImplHandlerIndesignFormatHandlerInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqDamCoreImplHandlerIndesignFormatHandlerProperties` generated from model 'comDayCqDamCoreImplHandlerIndesignFormatHandlerProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqDamCoreImplHandlerIndesignFormatHandlerProperties` (
  `mimetype` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqDamCoreImplHandlerJpegHandlerInfo` generated from model 'comDayCqDamCoreImplHandlerJpegHandlerInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqDamCoreImplHandlerJpegHandlerInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqDamCoreImplHandlerJpegHandlerProperties` generated from model 'comDayCqDamCoreImplHandlerJpegHandlerProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqDamCoreImplHandlerJpegHandlerProperties` (
  `cqdamenableextmetaextraction` long,
  `large_file_threshold` long,
  `large_comment_threshold` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqDamCoreImplHandlerXmpNCommXMPHandlerInfo` generated from model 'comDayCqDamCoreImplHandlerXmpNCommXMPHandlerInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqDamCoreImplHandlerXmpNCommXMPHandlerInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties` generated from model 'comDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties` (
  `xmphandlercqformats` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqDamCoreImplJmxAssetIndexUpdateMonitorInfo` generated from model 'comDayCqDamCoreImplJmxAssetIndexUpdateMonitorInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqDamCoreImplJmxAssetIndexUpdateMonitorInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties` generated from model 'comDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties` (
  `jmxobjectname` long,
  `propertymeasureenabled` long,
  `propertyname` long,
  `propertymaxwaitms` long,
  `propertymaxrate` long,
  `fulltextmeasureenabled` long,
  `fulltextname` long,
  `fulltextmaxwaitms` long,
  `fulltextmaxrate` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqDamCoreImplJmxAssetMigrationMBeanImplInfo` generated from model 'comDayCqDamCoreImplJmxAssetMigrationMBeanImplInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqDamCoreImplJmxAssetMigrationMBeanImplInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long,
  `bundle_location` text,
  `service_location` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties` generated from model 'comDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties` (
  `jmxobjectname` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqDamCoreImplJmxAssetUpdateMonitorImplInfo` generated from model 'comDayCqDamCoreImplJmxAssetUpdateMonitorImplInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqDamCoreImplJmxAssetUpdateMonitorImplInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties` generated from model 'comDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties` (
  `jmxobjectname` long,
  `active` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigInfo` generated from model 'comDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties` generated from model 'comDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties` (
  `operation` long,
  `emailEnabled` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigInfo` generated from model 'comDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties` generated from model 'comDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties` (
  `operation` long,
  `operationIcon` long,
  `topicName` long,
  `emailEnabled` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqDamCoreImplLightboxLightboxServletInfo` generated from model 'comDayCqDamCoreImplLightboxLightboxServletInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqDamCoreImplLightboxLightboxServletInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqDamCoreImplLightboxLightboxServletProperties` generated from model 'comDayCqDamCoreImplLightboxLightboxServletProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqDamCoreImplLightboxLightboxServletProperties` (
  `slingservletpaths` long,
  `slingservletmethods` long,
  `cqdamenableanonymous` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqDamCoreImplMetadataEditorSelectComponentHandlerInfo` generated from model 'comDayCqDamCoreImplMetadataEditorSelectComponentHandlerInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqDamCoreImplMetadataEditorSelectComponentHandlerInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties` generated from model 'comDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties` (
  `granite:data` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperInfo` generated from model 'comDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties` generated from model 'comDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties` (
  `cqdamallowallmime` long,
  `cqdamallowedassetmimes` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplInfo` generated from model 'comDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties` generated from model 'comDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties` (
  `cqdamdetectassetmimefromcontent` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqDamCoreImplMissingMetadataNotificationJobInfo` generated from model 'comDayCqDamCoreImplMissingMetadataNotificationJobInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqDamCoreImplMissingMetadataNotificationJobInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqDamCoreImplMissingMetadataNotificationJobProperties` generated from model 'comDayCqDamCoreImplMissingMetadataNotificationJobProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqDamCoreImplMissingMetadataNotificationJobProperties` (
  `cqdammissingmetadatanotificationscheduleristimebased` long,
  `cqdammissingmetadatanotificationschedulertimebasedrule` long,
  `cqdammissingmetadatanotificationschedulerperiodrule` long,
  `cqdammissingmetadatanotificationrecipient` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrInfo` generated from model 'comDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties` generated from model 'comDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties` (
  `processlabel` long,
  `NotifyonComplete` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqDamCoreImplProcessTextExtractionProcessInfo` generated from model 'comDayCqDamCoreImplProcessTextExtractionProcessInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqDamCoreImplProcessTextExtractionProcessInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqDamCoreImplProcessTextExtractionProcessProperties` generated from model 'comDayCqDamCoreImplProcessTextExtractionProcessProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqDamCoreImplProcessTextExtractionProcessProperties` (
  `mimeTypes` long,
  `maxExtract` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqDamCoreImplRenditionMakerImplInfo` generated from model 'comDayCqDamCoreImplRenditionMakerImplInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqDamCoreImplRenditionMakerImplInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqDamCoreImplRenditionMakerImplProperties` generated from model 'comDayCqDamCoreImplRenditionMakerImplProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqDamCoreImplRenditionMakerImplProperties` (
  `xmppropagate` long,
  `xmpexcludes` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqDamCoreImplReportsReportExportServiceInfo` generated from model 'comDayCqDamCoreImplReportsReportExportServiceInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqDamCoreImplReportsReportExportServiceInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqDamCoreImplReportsReportExportServiceProperties` generated from model 'comDayCqDamCoreImplReportsReportExportServiceProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqDamCoreImplReportsReportExportServiceProperties` (
  `queryBatchSize` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqDamCoreImplReportsReportPurgeServiceInfo` generated from model 'comDayCqDamCoreImplReportsReportPurgeServiceInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqDamCoreImplReportsReportPurgeServiceInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqDamCoreImplReportsReportPurgeServiceProperties` generated from model 'comDayCqDamCoreImplReportsReportPurgeServiceProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqDamCoreImplReportsReportPurgeServiceProperties` (
  `schedulerexpression` long,
  `maxSavedReports` long,
  `timeDuration` long,
  `enableReportPurge` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqDamCoreImplServletAssetDownloadServletInfo` generated from model 'comDayCqDamCoreImplServletAssetDownloadServletInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqDamCoreImplServletAssetDownloadServletInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long,
  `bundle_location` text,
  `service_location` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqDamCoreImplServletAssetDownloadServletProperties` generated from model 'comDayCqDamCoreImplServletAssetDownloadServletProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqDamCoreImplServletAssetDownloadServletProperties` (
  `enabled` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqDamCoreImplServletAssetStatusServletInfo` generated from model 'comDayCqDamCoreImplServletAssetStatusServletInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqDamCoreImplServletAssetStatusServletInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqDamCoreImplServletAssetStatusServletProperties` generated from model 'comDayCqDamCoreImplServletAssetStatusServletProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqDamCoreImplServletAssetStatusServletProperties` (
  `cqdambatchstatusmaxassets` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqDamCoreImplServletAssetXMPSearchServletInfo` generated from model 'comDayCqDamCoreImplServletAssetXMPSearchServletInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqDamCoreImplServletAssetXMPSearchServletInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqDamCoreImplServletAssetXMPSearchServletProperties` generated from model 'comDayCqDamCoreImplServletAssetXMPSearchServletProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqDamCoreImplServletAssetXMPSearchServletProperties` (
  `cqdambatchindesignmaxassets` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqDamCoreImplServletBatchMetadataServletInfo` generated from model 'comDayCqDamCoreImplServletBatchMetadataServletInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqDamCoreImplServletBatchMetadataServletInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqDamCoreImplServletBatchMetadataServletProperties` generated from model 'comDayCqDamCoreImplServletBatchMetadataServletProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqDamCoreImplServletBatchMetadataServletProperties` (
  `cqdambatchmetadataassetdefault` long,
  `cqdambatchmetadatacollectiondefault` long,
  `cqdambatchmetadatamaxresources` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqDamCoreImplServletBinaryProviderServletInfo` generated from model 'comDayCqDamCoreImplServletBinaryProviderServletInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqDamCoreImplServletBinaryProviderServletInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqDamCoreImplServletBinaryProviderServletProperties` generated from model 'comDayCqDamCoreImplServletBinaryProviderServletProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqDamCoreImplServletBinaryProviderServletProperties` (
  `slingservletresourceTypes` long,
  `slingservletmethods` long,
  `cqdamdrmenable` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqDamCoreImplServletCollectionServletInfo` generated from model 'comDayCqDamCoreImplServletCollectionServletInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqDamCoreImplServletCollectionServletInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqDamCoreImplServletCollectionServletProperties` generated from model 'comDayCqDamCoreImplServletCollectionServletProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqDamCoreImplServletCollectionServletProperties` (
  `cqdambatchcollectionproperties` long,
  `cqdambatchcollectionmaxcollections` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqDamCoreImplServletCollectionsServletInfo` generated from model 'comDayCqDamCoreImplServletCollectionsServletInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqDamCoreImplServletCollectionsServletInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqDamCoreImplServletCollectionsServletProperties` generated from model 'comDayCqDamCoreImplServletCollectionsServletProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqDamCoreImplServletCollectionsServletProperties` (
  `cqdambatchcollectionsproperties` long,
  `cqdambatchcollectionslimit` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqDamCoreImplServletCompanionServletInfo` generated from model 'comDayCqDamCoreImplServletCompanionServletInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqDamCoreImplServletCompanionServletInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqDamCoreImplServletCompanionServletProperties` generated from model 'comDayCqDamCoreImplServletCompanionServletProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqDamCoreImplServletCompanionServletProperties` (
  `MoreInfo` long,
  `mntoverlaydamguicontentassetsmoreinfohtml${path}` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqDamCoreImplServletCreateAssetServletInfo` generated from model 'comDayCqDamCoreImplServletCreateAssetServletInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqDamCoreImplServletCreateAssetServletInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqDamCoreImplServletCreateAssetServletProperties` generated from model 'comDayCqDamCoreImplServletCreateAssetServletProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqDamCoreImplServletCreateAssetServletProperties` (
  `detect_duplicate` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqDamCoreImplServletDamContentDispositionFilterInfo` generated from model 'comDayCqDamCoreImplServletDamContentDispositionFilterInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqDamCoreImplServletDamContentDispositionFilterInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqDamCoreImplServletDamContentDispositionFilterProperties` generated from model 'comDayCqDamCoreImplServletDamContentDispositionFilterProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqDamCoreImplServletDamContentDispositionFilterProperties` (
  `cqmimetypeblacklist` long,
  `cqdamemptymime` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqDamCoreImplServletGuidLookupFilterInfo` generated from model 'comDayCqDamCoreImplServletGuidLookupFilterInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqDamCoreImplServletGuidLookupFilterInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long,
  `bundle_location` text,
  `service_location` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqDamCoreImplServletGuidLookupFilterProperties` generated from model 'comDayCqDamCoreImplServletGuidLookupFilterProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqDamCoreImplServletGuidLookupFilterProperties` (
  `cqdamcoreguidlookupfilterenabled` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqDamCoreImplServletHealthCheckServletInfo` generated from model 'comDayCqDamCoreImplServletHealthCheckServletInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqDamCoreImplServletHealthCheckServletInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqDamCoreImplServletHealthCheckServletProperties` generated from model 'comDayCqDamCoreImplServletHealthCheckServletProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqDamCoreImplServletHealthCheckServletProperties` (
  `cqdamsyncworkflowid` long,
  `cqdamsyncfoldertypes` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqDamCoreImplServletMetadataGetServletInfo` generated from model 'comDayCqDamCoreImplServletMetadataGetServletInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqDamCoreImplServletMetadataGetServletInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqDamCoreImplServletMetadataGetServletProperties` generated from model 'comDayCqDamCoreImplServletMetadataGetServletProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqDamCoreImplServletMetadataGetServletProperties` (
  `slingservletresourceTypes` long,
  `slingservletmethods` long,
  `slingservletextensions` long,
  `slingservletselectors` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqDamCoreImplServletMultipleLicenseAcceptServletInfo` generated from model 'comDayCqDamCoreImplServletMultipleLicenseAcceptServletInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqDamCoreImplServletMultipleLicenseAcceptServletInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties` generated from model 'comDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties` (
  `cqdamdrmenable` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqDamCoreImplServletResourceCollectionServletInfo` generated from model 'comDayCqDamCoreImplServletResourceCollectionServletInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqDamCoreImplServletResourceCollectionServletInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqDamCoreImplServletResourceCollectionServletProperties` generated from model 'comDayCqDamCoreImplServletResourceCollectionServletProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqDamCoreImplServletResourceCollectionServletProperties` (
  `slingservletresourceTypes` long,
  `slingservletmethods` long,
  `slingservletselectors` long,
  `downloadconfig` long,
  `viewselector` long,
  `send_email` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplInfo` generated from model 'comDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties` generated from model 'comDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties` (
  `createPreviewEnabled` long,
  `updatePreviewEnabled` long,
  `queueSize` long,
  `folderPreviewRenditionRegex` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqDamCoreImplUnzipUnzipConfigInfo` generated from model 'comDayCqDamCoreImplUnzipUnzipConfigInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqDamCoreImplUnzipUnzipConfigInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqDamCoreImplUnzipUnzipConfigProperties` generated from model 'comDayCqDamCoreImplUnzipUnzipConfigProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqDamCoreImplUnzipUnzipConfigProperties` (
  `cqdamconfigunzipmaxuncompressedsize` long,
  `cqdamconfigunzipencoding` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqDamCoreProcessExifToolExtractMetadataProcessInfo` generated from model 'comDayCqDamCoreProcessExifToolExtractMetadataProcessInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqDamCoreProcessExifToolExtractMetadataProcessInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqDamCoreProcessExifToolExtractMetadataProcessProperties` generated from model 'comDayCqDamCoreProcessExifToolExtractMetadataProcessProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqDamCoreProcessExifToolExtractMetadataProcessProperties` (
  `processlabel` long,
  `cqdamenablesha1` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqDamCoreProcessExtractMetadataProcessInfo` generated from model 'comDayCqDamCoreProcessExtractMetadataProcessInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqDamCoreProcessExtractMetadataProcessInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqDamCoreProcessExtractMetadataProcessProperties` generated from model 'comDayCqDamCoreProcessExtractMetadataProcessProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqDamCoreProcessExtractMetadataProcessProperties` (
  `processlabel` long,
  `cqdamenablesha1` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqDamCoreProcessMetadataProcessorProcessInfo` generated from model 'comDayCqDamCoreProcessMetadataProcessorProcessInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqDamCoreProcessMetadataProcessorProcessInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqDamCoreProcessMetadataProcessorProcessProperties` generated from model 'comDayCqDamCoreProcessMetadataProcessorProcessProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqDamCoreProcessMetadataProcessorProcessProperties` (
  `processlabel` long,
  `cqdamenablesha1` long,
  `cqdammetadataxssprotectedproperties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqDamHandlerFfmpegLocatorImplInfo` generated from model 'comDayCqDamHandlerFfmpegLocatorImplInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqDamHandlerFfmpegLocatorImplInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqDamHandlerFfmpegLocatorImplProperties` generated from model 'comDayCqDamHandlerFfmpegLocatorImplProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqDamHandlerFfmpegLocatorImplProperties` (
  `executablesearchpath` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplInfo` generated from model 'comDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties` generated from model 'comDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties` (
  `eventfilter` long,
  `fontmgrsystemfontdir` long,
  `fontmgradobefontdir` long,
  `fontmgrcustomerfontdir` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqDamHandlerStandardPdfPdfHandlerInfo` generated from model 'comDayCqDamHandlerStandardPdfPdfHandlerInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqDamHandlerStandardPdfPdfHandlerInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqDamHandlerStandardPdfPdfHandlerProperties` generated from model 'comDayCqDamHandlerStandardPdfPdfHandlerProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqDamHandlerStandardPdfPdfHandlerProperties` (
  `rasterannotation` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqDamHandlerStandardPsPostScriptHandlerInfo` generated from model 'comDayCqDamHandlerStandardPsPostScriptHandlerInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqDamHandlerStandardPsPostScriptHandlerInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqDamHandlerStandardPsPostScriptHandlerProperties` generated from model 'comDayCqDamHandlerStandardPsPostScriptHandlerProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqDamHandlerStandardPsPostScriptHandlerProperties` (
  `rasterannotation` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqDamHandlerStandardPsdPsdHandlerInfo` generated from model 'comDayCqDamHandlerStandardPsdPsdHandlerInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqDamHandlerStandardPsdPsdHandlerInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqDamHandlerStandardPsdPsdHandlerProperties` generated from model 'comDayCqDamHandlerStandardPsdPsdHandlerProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqDamHandlerStandardPsdPsdHandlerProperties` (
  `large_file_threshold` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqDamIdsImplIDSJobProcessorInfo` generated from model 'comDayCqDamIdsImplIDSJobProcessorInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqDamIdsImplIDSJobProcessorInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqDamIdsImplIDSJobProcessorProperties` generated from model 'comDayCqDamIdsImplIDSJobProcessorProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqDamIdsImplIDSJobProcessorProperties` (
  `enablemultisession` long,
  `idsccenable` long,
  `enableretry` long,
  `enableretryscripterror` long,
  `externalizerdomaincqhost` long,
  `externalizerdomainhttp` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqDamIdsImplIDSPoolManagerImplInfo` generated from model 'comDayCqDamIdsImplIDSPoolManagerImplInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqDamIdsImplIDSPoolManagerImplInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqDamIdsImplIDSPoolManagerImplProperties` generated from model 'comDayCqDamIdsImplIDSPoolManagerImplProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqDamIdsImplIDSPoolManagerImplProperties` (
  `maxerrorstoblacklist` long,
  `retryintervaltowhitelist` long,
  `connecttimeout` long,
  `sockettimeout` long,
  `processlabel` long,
  `connectionusemax` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqDamInddImplHandlerIndesignXMPHandlerInfo` generated from model 'comDayCqDamInddImplHandlerIndesignXMPHandlerInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqDamInddImplHandlerIndesignXMPHandlerInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqDamInddImplHandlerIndesignXMPHandlerProperties` generated from model 'comDayCqDamInddImplHandlerIndesignXMPHandlerProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqDamInddImplHandlerIndesignXMPHandlerProperties` (
  `processlabel` long,
  `extractpages` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqDamInddImplServletSnippetCreationServletInfo` generated from model 'comDayCqDamInddImplServletSnippetCreationServletInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqDamInddImplServletSnippetCreationServletInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqDamInddImplServletSnippetCreationServletProperties` generated from model 'comDayCqDamInddImplServletSnippetCreationServletProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqDamInddImplServletSnippetCreationServletProperties` (
  `snippetcreationmaxcollections` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqDamInddProcessINDDMediaExtractProcessInfo` generated from model 'comDayCqDamInddProcessINDDMediaExtractProcessInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqDamInddProcessINDDMediaExtractProcessInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqDamInddProcessINDDMediaExtractProcessProperties` generated from model 'comDayCqDamInddProcessINDDMediaExtractProcessProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqDamInddProcessINDDMediaExtractProcessProperties` (
  `processlabel` long,
  `cqdaminddpagesregex` long,
  `idsjobdecoupled` long,
  `idsjobworkflowmodel` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplInfo` generated from model 'comDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties` generated from model 'comDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties` (
  `batchcommitsize` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqDamPerformanceInternalAssetPerformanceReportSyncJobInfo` generated from model 'comDayCqDamPerformanceInternalAssetPerformanceReportSyncJobInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqDamPerformanceInternalAssetPerformanceReportSyncJobInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqDamPerformanceInternalAssetPerformanceReportSyncJobProperties` generated from model 'comDayCqDamPerformanceInternalAssetPerformanceReportSyncJobProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqDamPerformanceInternalAssetPerformanceReportSyncJobProperties` (
  `schedulerexpression` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProInfo` generated from model 'comDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties` generated from model 'comDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties` (
  `deletezipfile` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenInfo` generated from model 'comDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties` generated from model 'comDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties` (
  `cqdams7damdynamicmediaconfigeventlistenerenabled` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerInfo` generated from model 'comDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties` generated from model 'comDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties` (
  `schedulerexpression` long,
  `schedulerconcurrent` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqDamS7damCommonPostServletsSetCreateHandlerInfo` generated from model 'comDayCqDamS7damCommonPostServletsSetCreateHandlerInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqDamS7damCommonPostServletsSetCreateHandlerInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqDamS7damCommonPostServletsSetCreateHandlerProperties` generated from model 'comDayCqDamS7damCommonPostServletsSetCreateHandlerProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqDamS7damCommonPostServletsSetCreateHandlerProperties` (
  `slingpostoperation` long,
  `slingservletmethods` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqDamS7damCommonPostServletsSetModifyHandlerInfo` generated from model 'comDayCqDamS7damCommonPostServletsSetModifyHandlerInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqDamS7damCommonPostServletsSetModifyHandlerInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqDamS7damCommonPostServletsSetModifyHandlerProperties` generated from model 'comDayCqDamS7damCommonPostServletsSetModifyHandlerProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqDamS7damCommonPostServletsSetModifyHandlerProperties` (
  `slingpostoperation` long,
  `slingservletmethods` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessInfo` generated from model 'comDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties` generated from model 'comDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties` (
  `processlabel` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqDamS7damCommonS7damDamChangeEventListenerInfo` generated from model 'comDayCqDamS7damCommonS7damDamChangeEventListenerInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqDamS7damCommonS7damDamChangeEventListenerInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqDamS7damCommonS7damDamChangeEventListenerProperties` generated from model 'comDayCqDamS7damCommonS7damDamChangeEventListenerProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqDamS7damCommonS7damDamChangeEventListenerProperties` (
  `cqdams7damdamchangeeventlistenerenabled` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqDamS7damCommonServletsS7damProductInfoServletInfo` generated from model 'comDayCqDamS7damCommonServletsS7damProductInfoServletInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqDamS7damCommonServletsS7damProductInfoServletInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqDamS7damCommonServletsS7damProductInfoServletProperties` generated from model 'comDayCqDamS7damCommonServletsS7damProductInfoServletProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqDamS7damCommonServletsS7damProductInfoServletProperties` (
  `slingservletpaths` long,
  `slingservletmethods` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplInfo` generated from model 'comDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties` generated from model 'comDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties` (
  `cqdams7damvideoproxyclientservicemultipartuploadminsizename` long,
  `cqdams7damvideoproxyclientservicemultipartuploadpartsizename` long,
  `cqdams7damvideoproxyclientservicemultipartuploadnumthreadname` long,
  `cqdams7damvideoproxyclientservicehttpreadtimeoutname` long,
  `cqdams7damvideoproxyclientservicehttpconnectiontimeoutname` long,
  `cqdams7damvideoproxyclientservicehttpmaxretrycountname` long,
  `cqdams7damvideoproxyclientserviceuploadprogressintervalname` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqDamScene7ImplScene7APIClientImplInfo` generated from model 'comDayCqDamScene7ImplScene7APIClientImplInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqDamScene7ImplScene7APIClientImplInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqDamScene7ImplScene7APIClientImplProperties` generated from model 'comDayCqDamScene7ImplScene7APIClientImplProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqDamScene7ImplScene7APIClientImplProperties` (
  `cqdamscene7apiclientrecordsperpagenofiltername` long,
  `cqdamscene7apiclientrecordsperpagewithfiltername` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqDamScene7ImplScene7AssetMimeTypeServiceImplInfo` generated from model 'comDayCqDamScene7ImplScene7AssetMimeTypeServiceImplInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqDamScene7ImplScene7AssetMimeTypeServiceImplInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties` generated from model 'comDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties` (
  `cqdamscene7assetmimetypeservicemapping` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqDamScene7ImplScene7ConfigurationEventListenerInfo` generated from model 'comDayCqDamScene7ImplScene7ConfigurationEventListenerInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqDamScene7ImplScene7ConfigurationEventListenerInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long,
  `bundle_location` text,
  `service_location` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqDamScene7ImplScene7ConfigurationEventListenerProperties` generated from model 'comDayCqDamScene7ImplScene7ConfigurationEventListenerProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqDamScene7ImplScene7ConfigurationEventListenerProperties` (
  `cqdamscene7configurationeventlistenerenabled` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqDamScene7ImplScene7DamChangeEventListenerInfo` generated from model 'comDayCqDamScene7ImplScene7DamChangeEventListenerInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqDamScene7ImplScene7DamChangeEventListenerInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long,
  `bundle_location` text,
  `service_location` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqDamScene7ImplScene7DamChangeEventListenerProperties` generated from model 'comDayCqDamScene7ImplScene7DamChangeEventListenerProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqDamScene7ImplScene7DamChangeEventListenerProperties` (
  `cqdamscene7damchangeeventlistenerenabled` long,
  `cqdamscene7damchangeeventlistenerobservedpaths` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqDamScene7ImplScene7FlashTemplatesServiceImplInfo` generated from model 'comDayCqDamScene7ImplScene7FlashTemplatesServiceImplInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqDamScene7ImplScene7FlashTemplatesServiceImplInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties` generated from model 'comDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties` (
  `scene7FlashTemplatesrti` long,
  `scene7FlashTemplatesrsi` long,
  `scene7FlashTemplatesrb` long,
  `scene7FlashTemplatesrurl` long,
  `scene7FlashTemplateurlFormatParameter` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqDamScene7ImplScene7UploadServiceImplInfo` generated from model 'comDayCqDamScene7ImplScene7UploadServiceImplInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqDamScene7ImplScene7UploadServiceImplInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqDamScene7ImplScene7UploadServiceImplProperties` generated from model 'comDayCqDamScene7ImplScene7UploadServiceImplProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqDamScene7ImplScene7UploadServiceImplProperties` (
  `cqdamscene7uploadserviceactivejobtimeoutlabel` long,
  `cqdamscene7uploadserviceconnectionmaxperroutelabel` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerInfo` generated from model 'comDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties` generated from model 'comDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties` (
  `getCacheExpirationUnit` long,
  `getCacheExpirationValue` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqDamStockIntegrationImplConfigurationStockConfigurationInfo` generated from model 'comDayCqDamStockIntegrationImplConfigurationStockConfigurationInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqDamStockIntegrationImplConfigurationStockConfigurationInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties` generated from model 'comDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties` (
  `name` long,
  `locale` long,
  `imsConfig` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqDamVideoImplServletVideoTestServletInfo` generated from model 'comDayCqDamVideoImplServletVideoTestServletInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqDamVideoImplServletVideoTestServletInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long,
  `bundle_location` text,
  `service_location` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqDamVideoImplServletVideoTestServletProperties` generated from model 'comDayCqDamVideoImplServletVideoTestServletProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqDamVideoImplServletVideoTestServletProperties` (
  `enabled` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqExtwidgetServletsImageSpriteServletInfo` generated from model 'comDayCqExtwidgetServletsImageSpriteServletInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqExtwidgetServletsImageSpriteServletInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqExtwidgetServletsImageSpriteServletProperties` generated from model 'comDayCqExtwidgetServletsImageSpriteServletProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqExtwidgetServletsImageSpriteServletProperties` (
  `maxWidth` long,
  `maxHeight` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqImageInternalFontFontHelperInfo` generated from model 'comDayCqImageInternalFontFontHelperInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqImageInternalFontFontHelperInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqImageInternalFontFontHelperProperties` generated from model 'comDayCqImageInternalFontFontHelperProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqImageInternalFontFontHelperProperties` (
  `fontpath` long,
  `oversamplingFactor` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqJcrclustersupportClusterStartLevelControllerInfo` generated from model 'comDayCqJcrclustersupportClusterStartLevelControllerInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqJcrclustersupportClusterStartLevelControllerInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqJcrclustersupportClusterStartLevelControllerProperties` generated from model 'comDayCqJcrclustersupportClusterStartLevelControllerProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqJcrclustersupportClusterStartLevelControllerProperties` (
  `clusterlevelenable` long,
  `clustermasterlevel` long,
  `clusterslavelevel` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqMailerDefaultMailServiceInfo` generated from model 'comDayCqMailerDefaultMailServiceInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqMailerDefaultMailServiceInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqMailerDefaultMailServiceProperties` generated from model 'comDayCqMailerDefaultMailServiceProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqMailerDefaultMailServiceProperties` (
  `smtphost` long,
  `smtpport` long,
  `smtpuser` long,
  `smtppassword` long,
  `fromaddress` long,
  `smtpssl` long,
  `smtpstarttls` long,
  `debugemail` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqMailerImplCqMailingServiceInfo` generated from model 'comDayCqMailerImplCqMailingServiceInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqMailerImplCqMailingServiceInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqMailerImplCqMailingServiceProperties` generated from model 'comDayCqMailerImplCqMailingServiceProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqMailerImplCqMailingServiceProperties` (
  `maxrecipientcount` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqMailerImplEmailCqEmailTemplateFactoryInfo` generated from model 'comDayCqMailerImplEmailCqEmailTemplateFactoryInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqMailerImplEmailCqEmailTemplateFactoryInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqMailerImplEmailCqEmailTemplateFactoryProperties` generated from model 'comDayCqMailerImplEmailCqEmailTemplateFactoryProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqMailerImplEmailCqEmailTemplateFactoryProperties` (
  `maileremailcharset` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqMailerImplEmailCqRetrieverTemplateFactoryInfo` generated from model 'comDayCqMailerImplEmailCqRetrieverTemplateFactoryInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqMailerImplEmailCqRetrieverTemplateFactoryInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties` generated from model 'comDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties` (
  `maileremailembed` long,
  `maileremailcharset` long,
  `maileremailretrieverUserID` long,
  `maileremailretrieverUserPWD` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqMcmCampaignImplIntegrationConfigImplInfo` generated from model 'comDayCqMcmCampaignImplIntegrationConfigImplInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqMcmCampaignImplIntegrationConfigImplInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqMcmCampaignImplIntegrationConfigImplProperties` generated from model 'comDayCqMcmCampaignImplIntegrationConfigImplProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqMcmCampaignImplIntegrationConfigImplProperties` (
  `aemmcmcampaignformConstraints` long,
  `aemmcmcampaignpublicUrl` long,
  `aemmcmcampaignrelaxedSSL` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryInfo` generated from model 'comDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryProperties` generated from model 'comDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryProperties` (
  `serviceranking` long,
  `tagpattern` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqMcmCoreNewsletterNewsletterEmailServiceImplInfo` generated from model 'comDayCqMcmCoreNewsletterNewsletterEmailServiceImplInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqMcmCoreNewsletterNewsletterEmailServiceImplInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties` generated from model 'comDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties` (
  `fromaddress` long,
  `senderhost` long,
  `maxbouncecount` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqMcmImplMCMConfigurationInfo` generated from model 'comDayCqMcmImplMCMConfigurationInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqMcmImplMCMConfigurationInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqMcmImplMCMConfigurationProperties` generated from model 'comDayCqMcmImplMCMConfigurationProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqMcmImplMCMConfigurationProperties` (
  `experienceindirection` long,
  `touchpointindirection` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenInfo` generated from model 'comDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenProperties` generated from model 'comDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenProperties` (
  `serviceranking` long,
  `tagpattern` long,
  `componentresourceType` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougInfo` generated from model 'comDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougProperties` generated from model 'comDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougProperties` (
  `serviceranking` long,
  `tagpattern` long,
  `componentresourceType` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponentInfo` generated from model 'comDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponentInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponentInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponentProperties` generated from model 'comDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponentProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponentProperties` (
  `serviceranking` long,
  `tagpattern` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaInfo` generated from model 'comDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaProperties` generated from model 'comDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaProperties` (
  `serviceranking` long,
  `tagpattern` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHInfo` generated from model 'comDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHProperties` generated from model 'comDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHProperties` (
  `serviceranking` long,
  `tagpattern` long,
  `componentresourceType` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqNotificationImplNotificationServiceImplInfo` generated from model 'comDayCqNotificationImplNotificationServiceImplInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqNotificationImplNotificationServiceImplInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqNotificationImplNotificationServiceImplProperties` generated from model 'comDayCqNotificationImplNotificationServiceImplProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqNotificationImplNotificationServiceImplProperties` (
  `eventfilter` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqPersonalizationImplServletsTargetingConfigurationServletInfo` generated from model 'comDayCqPersonalizationImplServletsTargetingConfigurationServletInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqPersonalizationImplServletsTargetingConfigurationServletInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqPersonalizationImplServletsTargetingConfigurationServletProperties` generated from model 'comDayCqPersonalizationImplServletsTargetingConfigurationServletProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqPersonalizationImplServletsTargetingConfigurationServletProperties` (
  `forcelocation` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqPollingImporterImplManagedPollConfigImplInfo` generated from model 'comDayCqPollingImporterImplManagedPollConfigImplInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqPollingImporterImplManagedPollConfigImplInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqPollingImporterImplManagedPollConfigImplProperties` generated from model 'comDayCqPollingImporterImplManagedPollConfigImplProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqPollingImporterImplManagedPollConfigImplProperties` (
  `id` long PRIMARY KEY,
  `enabled` long,
  `reference` long,
  `interval` long,
  `expression` long,
  `source` long,
  `target` long,
  `login` long,
  `password` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqPollingImporterImplManagedPollingImporterImplInfo` generated from model 'comDayCqPollingImporterImplManagedPollingImporterImplInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqPollingImporterImplManagedPollingImporterImplInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqPollingImporterImplManagedPollingImporterImplProperties` generated from model 'comDayCqPollingImporterImplManagedPollingImporterImplProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqPollingImporterImplManagedPollingImporterImplProperties` (
  `importeruser` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqPollingImporterImplPollingImporterImplInfo` generated from model 'comDayCqPollingImporterImplPollingImporterImplInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqPollingImporterImplPollingImporterImplInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqPollingImporterImplPollingImporterImplProperties` generated from model 'comDayCqPollingImporterImplPollingImporterImplProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqPollingImporterImplPollingImporterImplProperties` (
  `importermininterval` long,
  `importeruser` long,
  `excludepaths` long,
  `includepaths` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqReplicationAuditReplicationEventListenerInfo` generated from model 'comDayCqReplicationAuditReplicationEventListenerInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqReplicationAuditReplicationEventListenerInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long,
  `bundle_location` text,
  `service_location` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqReplicationAuditReplicationEventListenerProperties` generated from model 'comDayCqReplicationAuditReplicationEventListenerProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqReplicationAuditReplicationEventListenerProperties` (
  `serviceranking` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqReplicationContentStaticContentBuilderInfo` generated from model 'comDayCqReplicationContentStaticContentBuilderInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqReplicationContentStaticContentBuilderInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqReplicationContentStaticContentBuilderProperties` generated from model 'comDayCqReplicationContentStaticContentBuilderProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqReplicationContentStaticContentBuilderProperties` (
  `host` long,
  `port` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqReplicationImplAgentManagerImplInfo` generated from model 'comDayCqReplicationImplAgentManagerImplInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqReplicationImplAgentManagerImplInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqReplicationImplAgentManagerImplProperties` generated from model 'comDayCqReplicationImplAgentManagerImplProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqReplicationImplAgentManagerImplProperties` (
  `jobtopics` long,
  `serviceUsertarget` long,
  `agentProvidertarget` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqReplicationImplContentDurboBinaryLessContentBuilderInfo` generated from model 'comDayCqReplicationImplContentDurboBinaryLessContentBuilderInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqReplicationImplContentDurboBinaryLessContentBuilderInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqReplicationImplContentDurboBinaryLessContentBuilderProperties` generated from model 'comDayCqReplicationImplContentDurboBinaryLessContentBuilderProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqReplicationImplContentDurboBinaryLessContentBuilderProperties` (
  `binarythreshold` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqReplicationImplContentDurboDurboImportConfigurationProvInfo` generated from model 'comDayCqReplicationImplContentDurboDurboImportConfigurationProvInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqReplicationImplContentDurboDurboImportConfigurationProvInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties` generated from model 'comDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties` (
  `preservehierarchynodes` long,
  `ignoreversioning` long,
  `importacl` long,
  `savethreshold` long,
  `preserveuserpaths` long,
  `preserveuuid` long,
  `preserveuuidnodetypes` long,
  `preserveuuidsubtrees` long,
  `autocommit` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqReplicationImplReplicationContentFactoryProviderImplInfo` generated from model 'comDayCqReplicationImplReplicationContentFactoryProviderImplInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqReplicationImplReplicationContentFactoryProviderImplInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long,
  `bundle_location` text,
  `service_location` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqReplicationImplReplicationContentFactoryProviderImplProperties` generated from model 'comDayCqReplicationImplReplicationContentFactoryProviderImplProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqReplicationImplReplicationContentFactoryProviderImplProperties` (
  `replicationcontentuseFileStorage` long,
  `replicationcontentmaxCommitAttempts` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqReplicationImplReplicationReceiverImplInfo` generated from model 'comDayCqReplicationImplReplicationReceiverImplInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqReplicationImplReplicationReceiverImplInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqReplicationImplReplicationReceiverImplProperties` generated from model 'comDayCqReplicationImplReplicationReceiverImplProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqReplicationImplReplicationReceiverImplProperties` (
  `receivertmpfilethreshold` long,
  `receiverpackagesuseinstall` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqReplicationImplReplicatorImplInfo` generated from model 'comDayCqReplicationImplReplicatorImplInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqReplicationImplReplicatorImplInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqReplicationImplReplicatorImplProperties` generated from model 'comDayCqReplicationImplReplicatorImplProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqReplicationImplReplicatorImplProperties` (
  `distribute_events` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqReplicationImplReverseReplicatorInfo` generated from model 'comDayCqReplicationImplReverseReplicatorInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqReplicationImplReverseReplicatorInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long,
  `additionalProperties` text,
  `bundle_location` text,
  `service_location` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqReplicationImplReverseReplicatorProperties` generated from model 'comDayCqReplicationImplReverseReplicatorProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqReplicationImplReverseReplicatorProperties` (
  `schedulerperiod` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqReplicationImplTransportBinaryLessTransportHandlerInfo` generated from model 'comDayCqReplicationImplTransportBinaryLessTransportHandlerInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqReplicationImplTransportBinaryLessTransportHandlerInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqReplicationImplTransportBinaryLessTransportHandlerProperties` generated from model 'comDayCqReplicationImplTransportBinaryLessTransportHandlerProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqReplicationImplTransportBinaryLessTransportHandlerProperties` (
  `disabledciphersuites` long,
  `enabledciphersuites` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqReplicationImplTransportHttpInfo` generated from model 'comDayCqReplicationImplTransportHttpInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqReplicationImplTransportHttpInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqReplicationImplTransportHttpProperties` generated from model 'comDayCqReplicationImplTransportHttpProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqReplicationImplTransportHttpProperties` (
  `disabledciphersuites` long,
  `enabledciphersuites` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqReportingImplCacheCacheImplInfo` generated from model 'comDayCqReportingImplCacheCacheImplInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqReportingImplCacheCacheImplInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqReportingImplCacheCacheImplProperties` generated from model 'comDayCqReportingImplCacheCacheImplProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqReportingImplCacheCacheImplProperties` (
  `repcacheenable` long,
  `repcachettl` long,
  `repcachemax` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqReportingImplConfigServiceImplInfo` generated from model 'comDayCqReportingImplConfigServiceImplInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqReportingImplConfigServiceImplInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqReportingImplConfigServiceImplProperties` generated from model 'comDayCqReportingImplConfigServiceImplProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqReportingImplConfigServiceImplProperties` (
  `repconftimezone` long,
  `repconflocale` long,
  `repconfsnapshots` long,
  `repconfrepdir` long,
  `repconfhourofday` long,
  `repconfminofhour` long,
  `repconfmaxrows` long,
  `repconffakedata` long,
  `repconfsnapshotuser` long,
  `repconfenforcesnapshotuser` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqReportingImplRLogAnalyzerInfo` generated from model 'comDayCqReportingImplRLogAnalyzerInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqReportingImplRLogAnalyzerInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqReportingImplRLogAnalyzerProperties` generated from model 'comDayCqReportingImplRLogAnalyzerProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqReportingImplRLogAnalyzerProperties` (
  `requestlogoutput` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqRewriterLinkcheckerImplLinkCheckerImplInfo` generated from model 'comDayCqRewriterLinkcheckerImplLinkCheckerImplInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqRewriterLinkcheckerImplLinkCheckerImplInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long,
  `bundle_location` text,
  `service_location` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqRewriterLinkcheckerImplLinkCheckerImplProperties` generated from model 'comDayCqRewriterLinkcheckerImplLinkCheckerImplProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqRewriterLinkcheckerImplLinkCheckerImplProperties` (
  `schedulerperiod` long,
  `schedulerconcurrent` long,
  `servicebad_link_tolerance_interval` long,
  `servicecheck_override_patterns` long,
  `servicecache_broken_internal_links` long,
  `servicespecial_link_prefix` long,
  `servicespecial_link_patterns` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqRewriterLinkcheckerImplLinkCheckerTaskInfo` generated from model 'comDayCqRewriterLinkcheckerImplLinkCheckerTaskInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqRewriterLinkcheckerImplLinkCheckerTaskInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties` generated from model 'comDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties` (
  `schedulerperiod` long,
  `schedulerconcurrent` long,
  `good_link_test_interval` long,
  `bad_link_test_interval` long,
  `link_unused_interval` long,
  `connectiontimeout` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryInfo` generated from model 'comDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties` generated from model 'comDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties` (
  `linkcheckertransformerdisableRewriting` long,
  `linkcheckertransformerdisableChecking` long,
  `linkcheckertransformermapCacheSize` long,
  `linkcheckertransformerstrictExtensionCheck` long,
  `linkcheckertransformerstripHtmltExtension` long,
  `linkcheckertransformerrewriteElements` long,
  `linkcheckertransformerstripExtensionPathBlacklist` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqRewriterLinkcheckerImplLinkInfoStorageImplInfo` generated from model 'comDayCqRewriterLinkcheckerImplLinkInfoStorageImplInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqRewriterLinkcheckerImplLinkInfoStorageImplInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long,
  `bundle_location` text,
  `service_location` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties` generated from model 'comDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties` (
  `servicemax_links_per_host` long,
  `servicesave_external_link_references` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqRewriterProcessorImplHtmlParserFactoryInfo` generated from model 'comDayCqRewriterProcessorImplHtmlParserFactoryInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqRewriterProcessorImplHtmlParserFactoryInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqRewriterProcessorImplHtmlParserFactoryProperties` generated from model 'comDayCqRewriterProcessorImplHtmlParserFactoryProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqRewriterProcessorImplHtmlParserFactoryProperties` (
  `htmlparserprocessTags` long,
  `htmlparserpreserveCamelCase` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqSearchImplBuilderQueryBuilderImplInfo` generated from model 'comDayCqSearchImplBuilderQueryBuilderImplInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqSearchImplBuilderQueryBuilderImplInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqSearchImplBuilderQueryBuilderImplProperties` generated from model 'comDayCqSearchImplBuilderQueryBuilderImplProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqSearchImplBuilderQueryBuilderImplProperties` (
  `excerptproperties` long,
  `cachemaxentries` long,
  `cacheentrylifetime` long,
  `xpathunion` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqSearchSuggestImplSuggestionIndexManagerImplInfo` generated from model 'comDayCqSearchSuggestImplSuggestionIndexManagerImplInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqSearchSuggestImplSuggestionIndexManagerImplInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqSearchSuggestImplSuggestionIndexManagerImplProperties` generated from model 'comDayCqSearchSuggestImplSuggestionIndexManagerImplProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqSearchSuggestImplSuggestionIndexManagerImplProperties` (
  `pathBuildertarget` long,
  `suggestbasepath` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerInfo` generated from model 'comDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long,
  `bundle_location` text,
  `service_location` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties` generated from model 'comDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties` (
  `cqsearchpromoteconfighandlerenabled` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqSearchpromoteImplSearchPromoteServiceImplInfo` generated from model 'comDayCqSearchpromoteImplSearchPromoteServiceImplInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqSearchpromoteImplSearchPromoteServiceImplInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long,
  `bundle_location` text,
  `service_location` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqSearchpromoteImplSearchPromoteServiceImplProperties` generated from model 'comDayCqSearchpromoteImplSearchPromoteServiceImplProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqSearchpromoteImplSearchPromoteServiceImplProperties` (
  `cqsearchpromoteconfigurationserveruri` long,
  `cqsearchpromoteconfigurationenvironment` long,
  `connectiontimeout` long,
  `sockettimeout` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqSecurityACLSetupInfo` generated from model 'comDayCqSecurityACLSetupInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqSecurityACLSetupInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long,
  `bundle_location` text,
  `service_location` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqSecurityACLSetupProperties` generated from model 'comDayCqSecurityACLSetupProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqSecurityACLSetupProperties` (
  `cqaclsetuprules` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqStatisticsImplStatisticsServiceImplInfo` generated from model 'comDayCqStatisticsImplStatisticsServiceImplInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqStatisticsImplStatisticsServiceImplInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqStatisticsImplStatisticsServiceImplProperties` generated from model 'comDayCqStatisticsImplStatisticsServiceImplProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqStatisticsImplStatisticsServiceImplProperties` (
  `schedulerperiod` long,
  `schedulerconcurrent` long,
  `path` long,
  `workspace` long,
  `keywordsPath` long,
  `asyncEntries` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqTaggingImplJcrTagManagerFactoryImplInfo` generated from model 'comDayCqTaggingImplJcrTagManagerFactoryImplInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqTaggingImplJcrTagManagerFactoryImplInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqTaggingImplJcrTagManagerFactoryImplProperties` generated from model 'comDayCqTaggingImplJcrTagManagerFactoryImplProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqTaggingImplJcrTagManagerFactoryImplProperties` (
  `validationenabled` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqTaggingImplSearchTagPredicateEvaluatorInfo` generated from model 'comDayCqTaggingImplSearchTagPredicateEvaluatorInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqTaggingImplSearchTagPredicateEvaluatorInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqTaggingImplSearchTagPredicateEvaluatorProperties` generated from model 'comDayCqTaggingImplSearchTagPredicateEvaluatorProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqTaggingImplSearchTagPredicateEvaluatorProperties` (
  `ignore_path` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqTaggingImplTagGarbageCollectorInfo` generated from model 'comDayCqTaggingImplTagGarbageCollectorInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqTaggingImplTagGarbageCollectorInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqTaggingImplTagGarbageCollectorProperties` generated from model 'comDayCqTaggingImplTagGarbageCollectorProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqTaggingImplTagGarbageCollectorProperties` (
  `schedulerexpression` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqWcmContentsyncImplHandlerPagesUpdateHandlerInfo` generated from model 'comDayCqWcmContentsyncImplHandlerPagesUpdateHandlerInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqWcmContentsyncImplHandlerPagesUpdateHandlerInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties` generated from model 'comDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties` (
  `cqpagesupdatehandlerimageresourcetypes` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorInfo` generated from model 'comDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties` generated from model 'comDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties` (
  `cqcontentsyncpathrewritertransformermappinglinks` long,
  `cqcontentsyncpathrewritertransformermappingclientlibs` long,
  `cqcontentsyncpathrewritertransformermappingimages` long,
  `cqcontentsyncpathrewritertransformerattributepattern` long,
  `cqcontentsyncpathrewritertransformerclientlibrarypattern` long,
  `cqcontentsyncpathrewritertransformerclientlibraryreplace` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqWcmCoreImplAuthoringUIModeServiceImplInfo` generated from model 'comDayCqWcmCoreImplAuthoringUIModeServiceImplInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqWcmCoreImplAuthoringUIModeServiceImplInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long,
  `additionalProperties` text,
  `bundle_location` text,
  `service_location` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqWcmCoreImplAuthoringUIModeServiceImplProperties` generated from model 'comDayCqWcmCoreImplAuthoringUIModeServiceImplProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqWcmCoreImplAuthoringUIModeServiceImplProperties` (
  `authoringUIModeServicedefault` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqWcmCoreImplCommandsWCMCommandServletInfo` generated from model 'comDayCqWcmCoreImplCommandsWCMCommandServletInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqWcmCoreImplCommandsWCMCommandServletInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqWcmCoreImplCommandsWCMCommandServletProperties` generated from model 'comDayCqWcmCoreImplCommandsWCMCommandServletProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqWcmCoreImplCommandsWCMCommandServletProperties` (
  `wcmcommandservletdelete_whitelist` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplInfo` generated from model 'comDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties` generated from model 'comDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties` (
  `dimdefaultmode` long,
  `dimappcacheenabled` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqWcmCoreImplEventPageEventAuditListenerInfo` generated from model 'comDayCqWcmCoreImplEventPageEventAuditListenerInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqWcmCoreImplEventPageEventAuditListenerInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long,
  `bundle_location` text,
  `service_location` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqWcmCoreImplEventPageEventAuditListenerProperties` generated from model 'comDayCqWcmCoreImplEventPageEventAuditListenerProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqWcmCoreImplEventPageEventAuditListenerProperties` (
  `configured` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqWcmCoreImplEventPagePostProcessorInfo` generated from model 'comDayCqWcmCoreImplEventPagePostProcessorInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqWcmCoreImplEventPagePostProcessorInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqWcmCoreImplEventPagePostProcessorProperties` generated from model 'comDayCqWcmCoreImplEventPagePostProcessorProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqWcmCoreImplEventPagePostProcessorProperties` (
  `paths` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqWcmCoreImplEventRepositoryChangeEventListenerInfo` generated from model 'comDayCqWcmCoreImplEventRepositoryChangeEventListenerInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqWcmCoreImplEventRepositoryChangeEventListenerInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties` generated from model 'comDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties` (
  `paths` long,
  `excludedPaths` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqWcmCoreImplEventTemplatePostProcessorInfo` generated from model 'comDayCqWcmCoreImplEventTemplatePostProcessorInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqWcmCoreImplEventTemplatePostProcessorInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqWcmCoreImplEventTemplatePostProcessorProperties` generated from model 'comDayCqWcmCoreImplEventTemplatePostProcessorProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqWcmCoreImplEventTemplatePostProcessorProperties` (
  `paths` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqWcmCoreImplLanguageManagerImplInfo` generated from model 'comDayCqWcmCoreImplLanguageManagerImplInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqWcmCoreImplLanguageManagerImplInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqWcmCoreImplLanguageManagerImplProperties` generated from model 'comDayCqWcmCoreImplLanguageManagerImplProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqWcmCoreImplLanguageManagerImplProperties` (
  `langmgrlistpath` long,
  `langmgrcountrydefault` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplInfo` generated from model 'comDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties` generated from model 'comDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties` (
  `linkexpiredprefix` long,
  `linkexpiredremove` long,
  `linkexpiredsuffix` long,
  `linkinvalidprefix` long,
  `linkinvalidremove` long,
  `linkinvalidsuffix` long,
  `linkpredatedprefix` long,
  `linkpredatedremove` long,
  `linkpredatedsuffix` long,
  `linkwcmmodes` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqWcmCoreImplPagePageInfoAggregatorImplInfo` generated from model 'comDayCqWcmCoreImplPagePageInfoAggregatorImplInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqWcmCoreImplPagePageInfoAggregatorImplInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqWcmCoreImplPagePageInfoAggregatorImplProperties` generated from model 'comDayCqWcmCoreImplPagePageInfoAggregatorImplProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqWcmCoreImplPagePageInfoAggregatorImplProperties` (
  `pageinfoproviderpropertyregexdefault` long,
  `pageinfoproviderpropertyname` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqWcmCoreImplPagePageManagerFactoryImplInfo` generated from model 'comDayCqWcmCoreImplPagePageManagerFactoryImplInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqWcmCoreImplPagePageManagerFactoryImplInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqWcmCoreImplPagePageManagerFactoryImplProperties` generated from model 'comDayCqWcmCoreImplPagePageManagerFactoryImplProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqWcmCoreImplPagePageManagerFactoryImplProperties` (
  `illegalCharMapping` long,
  `pageSubTreeActivationCheck` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqWcmCoreImplReferencesContentContentReferenceConfigInfo` generated from model 'comDayCqWcmCoreImplReferencesContentContentReferenceConfigInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqWcmCoreImplReferencesContentContentReferenceConfigInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties` generated from model 'comDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties` (
  `contentReferenceConfigresourceTypes` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqWcmCoreImplServletsContentfinderAssetViewHandlerInfo` generated from model 'comDayCqWcmCoreImplServletsContentfinderAssetViewHandlerInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqWcmCoreImplServletsContentfinderAssetViewHandlerInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties` generated from model 'comDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties` (
  `damshowexpired` long,
  `damshowhidden` long,
  `tagTitleSearch` long,
  `guessTotal` long,
  `damexpiryProperty` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieInfo` generated from model 'comDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieProperties` generated from model 'comDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieProperties` (
  `itemresourcetypes` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqWcmCoreImplServletsContentfinderPageViewHandlerInfo` generated from model 'comDayCqWcmCoreImplServletsContentfinderPageViewHandlerInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqWcmCoreImplServletsContentfinderPageViewHandlerInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties` generated from model 'comDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties` (
  `guessTotal` long,
  `tagTitleSearch` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqWcmCoreImplServletsFindReplaceServletInfo` generated from model 'comDayCqWcmCoreImplServletsFindReplaceServletInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqWcmCoreImplServletsFindReplaceServletInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqWcmCoreImplServletsFindReplaceServletProperties` generated from model 'comDayCqWcmCoreImplServletsFindReplaceServletProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqWcmCoreImplServletsFindReplaceServletProperties` (
  `scope` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqWcmCoreImplServletsReferenceSearchServletInfo` generated from model 'comDayCqWcmCoreImplServletsReferenceSearchServletInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqWcmCoreImplServletsReferenceSearchServletInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqWcmCoreImplServletsReferenceSearchServletProperties` generated from model 'comDayCqWcmCoreImplServletsReferenceSearchServletProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqWcmCoreImplServletsReferenceSearchServletProperties` (
  `referencesearchservletmaxReferencesPerPage` long,
  `referencesearchservletmaxPages` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqWcmCoreImplServletsThumbnailServletInfo` generated from model 'comDayCqWcmCoreImplServletsThumbnailServletInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqWcmCoreImplServletsThumbnailServletInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqWcmCoreImplServletsThumbnailServletProperties` generated from model 'comDayCqWcmCoreImplServletsThumbnailServletProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqWcmCoreImplServletsThumbnailServletProperties` (
  `workspace` long,
  `dimensions` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqWcmCoreImplUtilsDefaultPageNameValidatorInfo` generated from model 'comDayCqWcmCoreImplUtilsDefaultPageNameValidatorInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqWcmCoreImplUtilsDefaultPageNameValidatorInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties` generated from model 'comDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties` (
  `nonValidChars` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqWcmCoreImplVariantsPageVariantsProviderImplInfo` generated from model 'comDayCqWcmCoreImplVariantsPageVariantsProviderImplInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqWcmCoreImplVariantsPageVariantsProviderImplInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long,
  `bundle_location` text,
  `service_location` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties` generated from model 'comDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties` (
  `defaultexternalizerdomain` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqWcmCoreImplVersionManagerImplInfo` generated from model 'comDayCqWcmCoreImplVersionManagerImplInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqWcmCoreImplVersionManagerImplInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqWcmCoreImplVersionManagerImplProperties` generated from model 'comDayCqWcmCoreImplVersionManagerImplProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqWcmCoreImplVersionManagerImplProperties` (
  `versionmanagercreateVersionOnActivation` long,
  `versionmanagerpurgingEnabled` long,
  `versionmanagerpurgePaths` long,
  `versionmanagerivPaths` long,
  `versionmanagermaxAgeDays` long,
  `versionmanagermaxNumberVersions` long,
  `versionmanagerminNumberVersions` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqWcmCoreImplVersionPurgeTaskInfo` generated from model 'comDayCqWcmCoreImplVersionPurgeTaskInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqWcmCoreImplVersionPurgeTaskInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqWcmCoreImplVersionPurgeTaskProperties` generated from model 'comDayCqWcmCoreImplVersionPurgeTaskProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqWcmCoreImplVersionPurgeTaskProperties` (
  `versionpurgepaths` long,
  `versionpurgerecursive` long,
  `versionpurgemaxVersions` long,
  `versionpurgeminVersions` long,
  `versionpurgemaxAgeDays` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqWcmCoreImplWCMDebugFilterInfo` generated from model 'comDayCqWcmCoreImplWCMDebugFilterInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqWcmCoreImplWCMDebugFilterInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long,
  `bundle_location` text,
  `service_location` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqWcmCoreImplWCMDebugFilterProperties` generated from model 'comDayCqWcmCoreImplWCMDebugFilterProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqWcmCoreImplWCMDebugFilterProperties` (
  `wcmdbgfilterenabled` long,
  `wcmdbgfilterjspDebug` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqWcmCoreImplWCMDeveloperModeFilterInfo` generated from model 'comDayCqWcmCoreImplWCMDeveloperModeFilterInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqWcmCoreImplWCMDeveloperModeFilterInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long,
  `additionalProperties` text,
  `bundle_location` text,
  `service_location` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqWcmCoreImplWCMDeveloperModeFilterProperties` generated from model 'comDayCqWcmCoreImplWCMDeveloperModeFilterProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqWcmCoreImplWCMDeveloperModeFilterProperties` (
  `wcmdevmodefilterenabled` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqWcmCoreImplWarpTimeWarpFilterInfo` generated from model 'comDayCqWcmCoreImplWarpTimeWarpFilterInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqWcmCoreImplWarpTimeWarpFilterInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long,
  `bundle_location` text,
  `service_location` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqWcmCoreImplWarpTimeWarpFilterProperties` generated from model 'comDayCqWcmCoreImplWarpTimeWarpFilterProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqWcmCoreImplWarpTimeWarpFilterProperties` (
  `filterorder` long,
  `filterscope` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqWcmCoreMvtMVTStatisticsImplInfo` generated from model 'comDayCqWcmCoreMvtMVTStatisticsImplInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqWcmCoreMvtMVTStatisticsImplInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long,
  `bundle_location` text,
  `service_location` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqWcmCoreMvtMVTStatisticsImplProperties` generated from model 'comDayCqWcmCoreMvtMVTStatisticsImplProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqWcmCoreMvtMVTStatisticsImplProperties` (
  `mvtstatisticstrackingurl` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqWcmCoreStatsPageViewStatisticsImplInfo` generated from model 'comDayCqWcmCoreStatsPageViewStatisticsImplInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqWcmCoreStatsPageViewStatisticsImplInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long,
  `bundle_location` text,
  `service_location` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqWcmCoreStatsPageViewStatisticsImplProperties` generated from model 'comDayCqWcmCoreStatsPageViewStatisticsImplProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqWcmCoreStatsPageViewStatisticsImplProperties` (
  `pageviewstatisticstrackingurl` long,
  `pageviewstatisticstrackingscriptenabled` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqWcmCoreWCMRequestFilterInfo` generated from model 'comDayCqWcmCoreWCMRequestFilterInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqWcmCoreWCMRequestFilterInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long,
  `bundle_location` text,
  `service_location` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqWcmCoreWCMRequestFilterProperties` generated from model 'comDayCqWcmCoreWCMRequestFilterProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqWcmCoreWCMRequestFilterProperties` (
  `wcmfiltermode` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqWcmDesignimporterDesignPackageImporterInfo` generated from model 'comDayCqWcmDesignimporterDesignPackageImporterInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqWcmDesignimporterDesignPackageImporterInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqWcmDesignimporterDesignPackageImporterProperties` generated from model 'comDayCqWcmDesignimporterDesignPackageImporterProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqWcmDesignimporterDesignPackageImporterProperties` (
  `extractfilter` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqWcmDesignimporterImplCanvasBuilderImplInfo` generated from model 'comDayCqWcmDesignimporterImplCanvasBuilderImplInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqWcmDesignimporterImplCanvasBuilderImplInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqWcmDesignimporterImplCanvasBuilderImplProperties` generated from model 'comDayCqWcmDesignimporterImplCanvasBuilderImplProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqWcmDesignimporterImplCanvasBuilderImplProperties` (
  `filepattern` long,
  `buildpagenodes` long,
  `buildclientlibs` long,
  `buildcanvascomponent` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqWcmDesignimporterImplCanvasPageDeleteHandlerInfo` generated from model 'comDayCqWcmDesignimporterImplCanvasPageDeleteHandlerInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqWcmDesignimporterImplCanvasPageDeleteHandlerInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties` generated from model 'comDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties` (
  `minThreadPoolSize` long,
  `maxThreadPoolSize` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqWcmDesignimporterImplEntryPreprocessorImplInfo` generated from model 'comDayCqWcmDesignimporterImplEntryPreprocessorImplInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqWcmDesignimporterImplEntryPreprocessorImplInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqWcmDesignimporterImplEntryPreprocessorImplProperties` generated from model 'comDayCqWcmDesignimporterImplEntryPreprocessorImplProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqWcmDesignimporterImplEntryPreprocessorImplProperties` (
  `searchpattern` long,
  `replacepattern` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqWcmDesignimporterImplMobileCanvasBuilderImplInfo` generated from model 'comDayCqWcmDesignimporterImplMobileCanvasBuilderImplInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqWcmDesignimporterImplMobileCanvasBuilderImplInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties` generated from model 'comDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties` (
  `filepattern` long,
  `devicegroups` long,
  `buildpagenodes` long,
  `buildclientlibs` long,
  `buildcanvascomponent` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqWcmDesignimporterParserTaghandlersFactoryCanvasComponeInfo` generated from model 'comDayCqWcmDesignimporterParserTaghandlersFactoryCanvasComponeInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqWcmDesignimporterParserTaghandlersFactoryCanvasComponeInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqWcmDesignimporterParserTaghandlersFactoryCanvasComponeProperties` generated from model 'comDayCqWcmDesignimporterParserTaghandlersFactoryCanvasComponeProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqWcmDesignimporterParserTaghandlersFactoryCanvasComponeProperties` (
  `serviceranking` long,
  `tagpattern` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqWcmDesignimporterParserTaghandlersFactoryDefaultComponInfo` generated from model 'comDayCqWcmDesignimporterParserTaghandlersFactoryDefaultComponInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqWcmDesignimporterParserTaghandlersFactoryDefaultComponInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqWcmDesignimporterParserTaghandlersFactoryDefaultComponProperties` generated from model 'comDayCqWcmDesignimporterParserTaghandlersFactoryDefaultComponProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqWcmDesignimporterParserTaghandlersFactoryDefaultComponProperties` (
  `serviceranking` long,
  `tagpattern` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqWcmDesignimporterParserTaghandlersFactoryDefaultTagHanInfo` generated from model 'comDayCqWcmDesignimporterParserTaghandlersFactoryDefaultTagHanInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqWcmDesignimporterParserTaghandlersFactoryDefaultTagHanInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqWcmDesignimporterParserTaghandlersFactoryDefaultTagHanProperties` generated from model 'comDayCqWcmDesignimporterParserTaghandlersFactoryDefaultTagHanProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqWcmDesignimporterParserTaghandlersFactoryDefaultTagHanProperties` (
  `serviceranking` long,
  `tagpattern` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqWcmDesignimporterParserTaghandlersFactoryHeadTagHandleInfo` generated from model 'comDayCqWcmDesignimporterParserTaghandlersFactoryHeadTagHandleInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqWcmDesignimporterParserTaghandlersFactoryHeadTagHandleInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqWcmDesignimporterParserTaghandlersFactoryHeadTagHandleProperties` generated from model 'comDayCqWcmDesignimporterParserTaghandlersFactoryHeadTagHandleProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqWcmDesignimporterParserTaghandlersFactoryHeadTagHandleProperties` (
  `serviceranking` long,
  `tagpattern` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqWcmDesignimporterParserTaghandlersFactoryIFrameTagHandInfo` generated from model 'comDayCqWcmDesignimporterParserTaghandlersFactoryIFrameTagHandInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqWcmDesignimporterParserTaghandlersFactoryIFrameTagHandInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqWcmDesignimporterParserTaghandlersFactoryIFrameTagHandProperties` generated from model 'comDayCqWcmDesignimporterParserTaghandlersFactoryIFrameTagHandProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqWcmDesignimporterParserTaghandlersFactoryIFrameTagHandProperties` (
  `serviceranking` long,
  `tagpattern` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqWcmDesignimporterParserTaghandlersFactoryImageComponenInfo` generated from model 'comDayCqWcmDesignimporterParserTaghandlersFactoryImageComponenInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqWcmDesignimporterParserTaghandlersFactoryImageComponenInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqWcmDesignimporterParserTaghandlersFactoryImageComponenProperties` generated from model 'comDayCqWcmDesignimporterParserTaghandlersFactoryImageComponenProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqWcmDesignimporterParserTaghandlersFactoryImageComponenProperties` (
  `serviceranking` long,
  `tagpattern` long,
  `componentresourceType` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandlerInfo` generated from model 'comDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandlerInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandlerInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandlerProperties` generated from model 'comDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandlerProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandlerProperties` (
  `serviceranking` long,
  `tagpattern` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqWcmDesignimporterParserTaghandlersFactoryInlineScriptTInfo` generated from model 'comDayCqWcmDesignimporterParserTaghandlersFactoryInlineScriptTInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqWcmDesignimporterParserTaghandlersFactoryInlineScriptTInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqWcmDesignimporterParserTaghandlersFactoryInlineScriptTProperties` generated from model 'comDayCqWcmDesignimporterParserTaghandlersFactoryInlineScriptTProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqWcmDesignimporterParserTaghandlersFactoryInlineScriptTProperties` (
  `serviceranking` long,
  `tagpattern` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqWcmDesignimporterParserTaghandlersFactoryLinkTagHandleInfo` generated from model 'comDayCqWcmDesignimporterParserTaghandlersFactoryLinkTagHandleInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqWcmDesignimporterParserTaghandlersFactoryLinkTagHandleInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqWcmDesignimporterParserTaghandlersFactoryLinkTagHandleProperties` generated from model 'comDayCqWcmDesignimporterParserTaghandlersFactoryLinkTagHandleProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqWcmDesignimporterParserTaghandlersFactoryLinkTagHandleProperties` (
  `serviceranking` long,
  `tagpattern` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqWcmDesignimporterParserTaghandlersFactoryMetaTagHandleInfo` generated from model 'comDayCqWcmDesignimporterParserTaghandlersFactoryMetaTagHandleInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqWcmDesignimporterParserTaghandlersFactoryMetaTagHandleInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqWcmDesignimporterParserTaghandlersFactoryMetaTagHandleProperties` generated from model 'comDayCqWcmDesignimporterParserTaghandlersFactoryMetaTagHandleProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqWcmDesignimporterParserTaghandlersFactoryMetaTagHandleProperties` (
  `serviceranking` long,
  `tagpattern` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqWcmDesignimporterParserTaghandlersFactoryNonScriptTagHInfo` generated from model 'comDayCqWcmDesignimporterParserTaghandlersFactoryNonScriptTagHInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqWcmDesignimporterParserTaghandlersFactoryNonScriptTagHInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqWcmDesignimporterParserTaghandlersFactoryNonScriptTagHProperties` generated from model 'comDayCqWcmDesignimporterParserTaghandlersFactoryNonScriptTagHProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqWcmDesignimporterParserTaghandlersFactoryNonScriptTagHProperties` (
  `serviceranking` long,
  `tagpattern` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqWcmDesignimporterParserTaghandlersFactoryParsysComponeInfo` generated from model 'comDayCqWcmDesignimporterParserTaghandlersFactoryParsysComponeInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqWcmDesignimporterParserTaghandlersFactoryParsysComponeInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqWcmDesignimporterParserTaghandlersFactoryParsysComponeProperties` generated from model 'comDayCqWcmDesignimporterParserTaghandlersFactoryParsysComponeProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqWcmDesignimporterParserTaghandlersFactoryParsysComponeProperties` (
  `serviceranking` long,
  `tagpattern` long,
  `componentresourceType` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqWcmDesignimporterParserTaghandlersFactoryScriptTagHandInfo` generated from model 'comDayCqWcmDesignimporterParserTaghandlersFactoryScriptTagHandInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqWcmDesignimporterParserTaghandlersFactoryScriptTagHandInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqWcmDesignimporterParserTaghandlersFactoryScriptTagHandProperties` generated from model 'comDayCqWcmDesignimporterParserTaghandlersFactoryScriptTagHandProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqWcmDesignimporterParserTaghandlersFactoryScriptTagHandProperties` (
  `serviceranking` long,
  `tagpattern` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqWcmDesignimporterParserTaghandlersFactoryStyleTagHandlInfo` generated from model 'comDayCqWcmDesignimporterParserTaghandlersFactoryStyleTagHandlInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqWcmDesignimporterParserTaghandlersFactoryStyleTagHandlInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqWcmDesignimporterParserTaghandlersFactoryStyleTagHandlProperties` generated from model 'comDayCqWcmDesignimporterParserTaghandlersFactoryStyleTagHandlProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqWcmDesignimporterParserTaghandlersFactoryStyleTagHandlProperties` (
  `serviceranking` long,
  `tagpattern` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqWcmDesignimporterParserTaghandlersFactoryTextComponentInfo` generated from model 'comDayCqWcmDesignimporterParserTaghandlersFactoryTextComponentInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqWcmDesignimporterParserTaghandlersFactoryTextComponentInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqWcmDesignimporterParserTaghandlersFactoryTextComponentProperties` generated from model 'comDayCqWcmDesignimporterParserTaghandlersFactoryTextComponentProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqWcmDesignimporterParserTaghandlersFactoryTextComponentProperties` (
  `serviceranking` long,
  `tagpattern` long,
  `componentresourceType` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqWcmDesignimporterParserTaghandlersFactoryTitleComponenInfo` generated from model 'comDayCqWcmDesignimporterParserTaghandlersFactoryTitleComponenInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqWcmDesignimporterParserTaghandlersFactoryTitleComponenInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqWcmDesignimporterParserTaghandlersFactoryTitleComponenProperties` generated from model 'comDayCqWcmDesignimporterParserTaghandlersFactoryTitleComponenProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqWcmDesignimporterParserTaghandlersFactoryTitleComponenProperties` (
  `serviceranking` long,
  `tagpattern` long,
  `componentresourceType` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqWcmDesignimporterParserTaghandlersFactoryTitleTagHandlInfo` generated from model 'comDayCqWcmDesignimporterParserTaghandlersFactoryTitleTagHandlInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqWcmDesignimporterParserTaghandlersFactoryTitleTagHandlInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqWcmDesignimporterParserTaghandlersFactoryTitleTagHandlProperties` generated from model 'comDayCqWcmDesignimporterParserTaghandlersFactoryTitleTagHandlProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqWcmDesignimporterParserTaghandlersFactoryTitleTagHandlProperties` (
  `serviceranking` long,
  `tagpattern` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqWcmFoundationFormsImplFormChooserServletInfo` generated from model 'comDayCqWcmFoundationFormsImplFormChooserServletInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqWcmFoundationFormsImplFormChooserServletInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqWcmFoundationFormsImplFormChooserServletProperties` generated from model 'comDayCqWcmFoundationFormsImplFormChooserServletProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqWcmFoundationFormsImplFormChooserServletProperties` (
  `servicename` long,
  `slingservletresourceTypes` long,
  `slingservletselectors` long,
  `slingservletmethods` long,
  `formsformchooserservletadvansesearchrequire` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqWcmFoundationFormsImplFormParagraphPostProcessorInfo` generated from model 'comDayCqWcmFoundationFormsImplFormParagraphPostProcessorInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqWcmFoundationFormsImplFormParagraphPostProcessorInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties` generated from model 'comDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties` (
  `formsformparagraphpostprocessorenabled` long,
  `formsformparagraphpostprocessorformresourcetypes` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqWcmFoundationFormsImplFormsHandlingServletInfo` generated from model 'comDayCqWcmFoundationFormsImplFormsHandlingServletInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqWcmFoundationFormsImplFormsHandlingServletInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqWcmFoundationFormsImplFormsHandlingServletProperties` generated from model 'comDayCqWcmFoundationFormsImplFormsHandlingServletProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqWcmFoundationFormsImplFormsHandlingServletProperties` (
  `namewhitelist` long,
  `allowexpressions` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqWcmFoundationFormsImplMailServletInfo` generated from model 'comDayCqWcmFoundationFormsImplMailServletInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqWcmFoundationFormsImplMailServletInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqWcmFoundationFormsImplMailServletProperties` generated from model 'comDayCqWcmFoundationFormsImplMailServletProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqWcmFoundationFormsImplMailServletProperties` (
  `slingservletresourceTypes` long,
  `slingservletselectors` long,
  `resourcewhitelist` long,
  `resourceblacklist` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqWcmFoundationImplAdaptiveImageComponentServletInfo` generated from model 'comDayCqWcmFoundationImplAdaptiveImageComponentServletInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqWcmFoundationImplAdaptiveImageComponentServletInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqWcmFoundationImplAdaptiveImageComponentServletProperties` generated from model 'comDayCqWcmFoundationImplAdaptiveImageComponentServletProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqWcmFoundationImplAdaptiveImageComponentServletProperties` (
  `adaptsupportedwidths` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqWcmFoundationImplHTTPAuthHandlerInfo` generated from model 'comDayCqWcmFoundationImplHTTPAuthHandlerInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqWcmFoundationImplHTTPAuthHandlerInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqWcmFoundationImplHTTPAuthHandlerProperties` generated from model 'comDayCqWcmFoundationImplHTTPAuthHandlerProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqWcmFoundationImplHTTPAuthHandlerProperties` (
  `path` long,
  `authhttpnologin` long,
  `authhttprealm` long,
  `authdefaultloginpage` long,
  `authcredform` long,
  `authcredutf8` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqWcmFoundationImplPageImpressionsTrackerInfo` generated from model 'comDayCqWcmFoundationImplPageImpressionsTrackerInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqWcmFoundationImplPageImpressionsTrackerInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqWcmFoundationImplPageImpressionsTrackerProperties` generated from model 'comDayCqWcmFoundationImplPageImpressionsTrackerProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqWcmFoundationImplPageImpressionsTrackerProperties` (
  `slingauthrequirements` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqWcmFoundationImplPageRedirectServletInfo` generated from model 'comDayCqWcmFoundationImplPageRedirectServletInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqWcmFoundationImplPageRedirectServletInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqWcmFoundationImplPageRedirectServletProperties` generated from model 'comDayCqWcmFoundationImplPageRedirectServletProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqWcmFoundationImplPageRedirectServletProperties` (
  `excludedresourcetypes` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistInfo` generated from model 'comDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistProperties` generated from model 'comDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistProperties` (
  `defaultattachmenttypeblacklist` long,
  `baselineattachmenttypeblacklist` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplInfo` generated from model 'comDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long,
  `bundle_location` text,
  `service_location` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties` generated from model 'comDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties` (
  `parameterwhitelist` long,
  `parameterwhitelistprefixes` long,
  `binaryparameterwhitelist` long,
  `modifierwhitelist` long,
  `operationwhitelist` long,
  `operationwhitelistprefixes` long,
  `typehintwhitelist` long,
  `resourcetypewhitelist` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryInfo` generated from model 'comDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long,
  `bundle_location` text,
  `service_location` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties` generated from model 'comDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties` (
  `deviceinfotransformerenabled` long,
  `deviceinfotransformercssstyle` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqWcmMobileCoreImplRedirectRedirectFilterInfo` generated from model 'comDayCqWcmMobileCoreImplRedirectRedirectFilterInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqWcmMobileCoreImplRedirectRedirectFilterInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long,
  `bundle_location` text,
  `service_location` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqWcmMobileCoreImplRedirectRedirectFilterProperties` generated from model 'comDayCqWcmMobileCoreImplRedirectRedirectFilterProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqWcmMobileCoreImplRedirectRedirectFilterProperties` (
  `redirectenabled` long,
  `redirectstatsenabled` long,
  `redirectextensions` long,
  `redirectpaths` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqWcmMsmImplActionsContentCopyActionFactoryInfo` generated from model 'comDayCqWcmMsmImplActionsContentCopyActionFactoryInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqWcmMsmImplActionsContentCopyActionFactoryInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long,
  `bundle_location` text,
  `service_location` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqWcmMsmImplActionsContentCopyActionFactoryProperties` generated from model 'comDayCqWcmMsmImplActionsContentCopyActionFactoryProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqWcmMsmImplActionsContentCopyActionFactoryProperties` (
  `cqwcmmsmactionexcludednodetypes` long,
  `cqwcmmsmactionexcludedparagraphitems` long,
  `cqwcmmsmactionexcludedprops` long,
  `contentcopyactionorderstyle` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqWcmMsmImplActionsContentDeleteActionFactoryInfo` generated from model 'comDayCqWcmMsmImplActionsContentDeleteActionFactoryInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqWcmMsmImplActionsContentDeleteActionFactoryInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long,
  `bundle_location` text,
  `service_location` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties` generated from model 'comDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties` (
  `cqwcmmsmactionexcludednodetypes` long,
  `cqwcmmsmactionexcludedparagraphitems` long,
  `cqwcmmsmactionexcludedprops` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqWcmMsmImplActionsContentUpdateActionFactoryInfo` generated from model 'comDayCqWcmMsmImplActionsContentUpdateActionFactoryInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqWcmMsmImplActionsContentUpdateActionFactoryInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long,
  `bundle_location` text,
  `service_location` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqWcmMsmImplActionsContentUpdateActionFactoryProperties` generated from model 'comDayCqWcmMsmImplActionsContentUpdateActionFactoryProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqWcmMsmImplActionsContentUpdateActionFactoryProperties` (
  `cqwcmmsmactionexcludednodetypes` long,
  `cqwcmmsmactionexcludedparagraphitems` long,
  `cqwcmmsmactionexcludedprops` long,
  `cqwcmmsmactionignoredMixin` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqWcmMsmImplActionsOrderChildrenActionFactoryInfo` generated from model 'comDayCqWcmMsmImplActionsOrderChildrenActionFactoryInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqWcmMsmImplActionsOrderChildrenActionFactoryInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long,
  `bundle_location` text,
  `service_location` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties` generated from model 'comDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties` (
  `cqwcmmsmactionexcludednodetypes` long,
  `cqwcmmsmactionexcludedparagraphitems` long,
  `cqwcmmsmactionexcludedprops` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqWcmMsmImplActionsPageMoveActionFactoryInfo` generated from model 'comDayCqWcmMsmImplActionsPageMoveActionFactoryInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqWcmMsmImplActionsPageMoveActionFactoryInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqWcmMsmImplActionsPageMoveActionFactoryProperties` generated from model 'comDayCqWcmMsmImplActionsPageMoveActionFactoryProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqWcmMsmImplActionsPageMoveActionFactoryProperties` (
  `cqwcmmsmactionexcludednodetypes` long,
  `cqwcmmsmactionexcludedparagraphitems` long,
  `cqwcmmsmactionexcludedprops` long,
  `cqwcmmsmimplactionspagemoveprop_referenceUpdate` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqWcmMsmImplActionsReferencesUpdateActionFactoryInfo` generated from model 'comDayCqWcmMsmImplActionsReferencesUpdateActionFactoryInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqWcmMsmImplActionsReferencesUpdateActionFactoryInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long,
  `bundle_location` text,
  `service_location` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties` generated from model 'comDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties` (
  `cqwcmmsmactionexcludednodetypes` long,
  `cqwcmmsmactionexcludedparagraphitems` long,
  `cqwcmmsmactionexcludedprops` long,
  `cqwcmmsmimplactionreferencesupdateprop_updateNested` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqWcmMsmImplActionsVersionCopyActionFactoryInfo` generated from model 'comDayCqWcmMsmImplActionsVersionCopyActionFactoryInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqWcmMsmImplActionsVersionCopyActionFactoryInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long,
  `bundle_location` text,
  `service_location` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqWcmMsmImplActionsVersionCopyActionFactoryProperties` generated from model 'comDayCqWcmMsmImplActionsVersionCopyActionFactoryProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqWcmMsmImplActionsVersionCopyActionFactoryProperties` (
  `cqwcmmsmactionexcludednodetypes` long,
  `cqwcmmsmactionexcludedparagraphitems` long,
  `cqwcmmsmactionexcludedprops` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqWcmMsmImplLiveRelationshipManagerImplInfo` generated from model 'comDayCqWcmMsmImplLiveRelationshipManagerImplInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqWcmMsmImplLiveRelationshipManagerImplInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqWcmMsmImplLiveRelationshipManagerImplProperties` generated from model 'comDayCqWcmMsmImplLiveRelationshipManagerImplProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqWcmMsmImplLiveRelationshipManagerImplProperties` (
  `liverelationshipmgrrelationsconfigdefault` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqWcmMsmImplRolloutManagerImplInfo` generated from model 'comDayCqWcmMsmImplRolloutManagerImplInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqWcmMsmImplRolloutManagerImplInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long,
  `additionalProperties` text,
  `bundle_location` text,
  `service_location` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqWcmMsmImplRolloutManagerImplProperties` generated from model 'comDayCqWcmMsmImplRolloutManagerImplProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqWcmMsmImplRolloutManagerImplProperties` (
  `eventfilter` long,
  `rolloutmgrexcludedpropsdefault` long,
  `rolloutmgrexcludedparagraphpropsdefault` long,
  `rolloutmgrexcludednodetypesdefault` long,
  `rolloutmgrthreadpoolmaxsize` long,
  `rolloutmgrthreadpoolmaxshutdowntime` long,
  `rolloutmgrthreadpoolpriority` long,
  `rolloutmgrcommitsize` long,
  `rolloutmgrconflicthandlingenabled` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqWcmMsmImplServletsAuditLogServletInfo` generated from model 'comDayCqWcmMsmImplServletsAuditLogServletInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqWcmMsmImplServletsAuditLogServletInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqWcmMsmImplServletsAuditLogServletProperties` generated from model 'comDayCqWcmMsmImplServletsAuditLogServletProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqWcmMsmImplServletsAuditLogServletProperties` (
  `auditlogservletdefaulteventscount` long,
  `auditlogservletdefaultpath` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqWcmNotificationEmailImplEmailChannelInfo` generated from model 'comDayCqWcmNotificationEmailImplEmailChannelInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqWcmNotificationEmailImplEmailChannelInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqWcmNotificationEmailImplEmailChannelProperties` generated from model 'comDayCqWcmNotificationEmailImplEmailChannelProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqWcmNotificationEmailImplEmailChannelProperties` (
  `emailfrom` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqWcmNotificationImplNotificationManagerImplInfo` generated from model 'comDayCqWcmNotificationImplNotificationManagerImplInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqWcmNotificationImplNotificationManagerImplInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long,
  `bundle_location` text,
  `service_location` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqWcmNotificationImplNotificationManagerImplProperties` generated from model 'comDayCqWcmNotificationImplNotificationManagerImplProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqWcmNotificationImplNotificationManagerImplProperties` (
  `eventtopics` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqWcmScriptingImplBVPManagerInfo` generated from model 'comDayCqWcmScriptingImplBVPManagerInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqWcmScriptingImplBVPManagerInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqWcmScriptingImplBVPManagerProperties` generated from model 'comDayCqWcmScriptingImplBVPManagerProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqWcmScriptingImplBVPManagerProperties` (
  `comdaycqwcmscriptingbvpscriptengines` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqWcmUndoUndoConfigInfo` generated from model 'comDayCqWcmUndoUndoConfigInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqWcmUndoUndoConfigInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long,
  `bundle_location` text,
  `service_location` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqWcmUndoUndoConfigProperties` generated from model 'comDayCqWcmUndoUndoConfigProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqWcmUndoUndoConfigProperties` (
  `cqwcmundoenabled` long,
  `cqwcmundopath` long,
  `cqwcmundovalidity` long,
  `cqwcmundosteps` long,
  `cqwcmundopersistence` long,
  `cqwcmundopersistencemode` long,
  `cqwcmundomarkermode` long,
  `cqwcmundowhitelist` long,
  `cqwcmundoblacklist` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqWcmWebservicesupportImplReplicationEventListenerInfo` generated from model 'comDayCqWcmWebservicesupportImplReplicationEventListenerInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqWcmWebservicesupportImplReplicationEventListenerInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqWcmWebservicesupportImplReplicationEventListenerProperties` generated from model 'comDayCqWcmWebservicesupportImplReplicationEventListenerProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqWcmWebservicesupportImplReplicationEventListenerProperties` (
  `Flushagents` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqWcmWorkflowImplWcmWorkflowServiceImplInfo` generated from model 'comDayCqWcmWorkflowImplWcmWorkflowServiceImplInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqWcmWorkflowImplWcmWorkflowServiceImplInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties` generated from model 'comDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties` (
  `eventfilter` long,
  `minThreadPoolSize` long,
  `maxThreadPoolSize` long,
  `cqwcmworkflowterminateonactivate` long,
  `cqwcmworklfowterminateexclusionlist` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqWcmWorkflowImplWorkflowPackageInfoProviderInfo` generated from model 'comDayCqWcmWorkflowImplWorkflowPackageInfoProviderInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqWcmWorkflowImplWorkflowPackageInfoProviderInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties` generated from model 'comDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties` (
  `workflowpackageinfoproviderfilter` long,
  `workflowpackageinfoproviderfilterrootpath` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqWidgetImplHtmlLibraryManagerImplInfo` generated from model 'comDayCqWidgetImplHtmlLibraryManagerImplInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqWidgetImplHtmlLibraryManagerImplInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long,
  `bundle_location` text,
  `service_location` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqWidgetImplHtmlLibraryManagerImplProperties` generated from model 'comDayCqWidgetImplHtmlLibraryManagerImplProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqWidgetImplHtmlLibraryManagerImplProperties` (
  `htmllibmanagerclientmanager` long,
  `htmllibmanagerdebug` long,
  `htmllibmanagerdebugconsole` long,
  `htmllibmanagerdebuginitjs` long,
  `htmllibmanagerdefaultthemename` long,
  `htmllibmanagerdefaultuserthemename` long,
  `htmllibmanagerfirebuglitepath` long,
  `htmllibmanagerforceCQUrlInfo` long,
  `htmllibmanagergzip` long,
  `htmllibmanagermaxage` long,
  `htmllibmanagermaxDataUriSize` long,
  `htmllibmanagerminify` long,
  `htmllibmanagerpathlist` long,
  `htmllibmanagertiming` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqWidgetImplWidgetExtensionProviderImplInfo` generated from model 'comDayCqWidgetImplWidgetExtensionProviderImplInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqWidgetImplWidgetExtensionProviderImplInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long,
  `bundle_location` text,
  `service_location` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqWidgetImplWidgetExtensionProviderImplProperties` generated from model 'comDayCqWidgetImplWidgetExtensionProviderImplProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqWidgetImplWidgetExtensionProviderImplProperties` (
  `extendablewidgets` long,
  `widgetextensionproviderdebug` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqWorkflowImplEmailEMailNotificationServiceInfo` generated from model 'comDayCqWorkflowImplEmailEMailNotificationServiceInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqWorkflowImplEmailEMailNotificationServiceInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqWorkflowImplEmailEMailNotificationServiceProperties` generated from model 'comDayCqWorkflowImplEmailEMailNotificationServiceProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqWorkflowImplEmailEMailNotificationServiceProperties` (
  `fromaddress` long,
  `hostprefix` long,
  `notifyonabort` long,
  `notifyoncomplete` long,
  `notifyoncontainercomplete` long,
  `notifyuseronly` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqWorkflowImplEmailTaskEMailNotificationServiceInfo` generated from model 'comDayCqWorkflowImplEmailTaskEMailNotificationServiceInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCqWorkflowImplEmailTaskEMailNotificationServiceInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties` generated from model 'comDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties` (
  `notifyonupdate` long,
  `notifyoncomplete` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCrxSecurityTokenImplImplTokenAuthenticationHandlerInfo` generated from model 'comDayCrxSecurityTokenImplImplTokenAuthenticationHandlerInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCrxSecurityTokenImplImplTokenAuthenticationHandlerInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long,
  `bundle_location` text,
  `service_location` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties` generated from model 'comDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties` (
  `path` long,
  `tokenrequiredattr` long,
  `tokenalternateurl` long,
  `tokenencapsulated` long,
  `skiptokenrefresh` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCrxSecurityTokenImplTokenCleanupTaskInfo` generated from model 'comDayCrxSecurityTokenImplTokenCleanupTaskInfo'
--

CREATE TABLE IF NOT EXISTS `comDayCrxSecurityTokenImplTokenCleanupTaskInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `comDayCrxSecurityTokenImplTokenCleanupTaskProperties` generated from model 'comDayCrxSecurityTokenImplTokenCleanupTaskProperties'
--

CREATE TABLE IF NOT EXISTS `comDayCrxSecurityTokenImplTokenCleanupTaskProperties` (
  `enabletokencleanuptask` long,
  `schedulerexpression` long,
  `batchsize` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `configNodePropertyArray` generated from model 'configNodePropertyArray'
--

CREATE TABLE IF NOT EXISTS `configNodePropertyArray` (
  `name` text /*property name*/,
  `optional` boolean /*True if optional*/,
  `is_set` boolean /*True if property is set*/,
  `type` int /*Property type, 1&#x3D;String, 2&#x3D;Long, 3&#x3D;Integer, 7&#x3D;Float, 11&#x3D;Boolean, 12&#x3D;Secrets(String)*/,
  `description` text /*Property description*/
); 

-- --------------------------------------------------------------------------
-- Table structure for table `ConfigNodePropertyArrayPropertyValues` generated from model 'ConfigNodePropertyArrayPropertyValues'

CREATE TABLE IF NOT EXISTS `ConfigNodePropertyArrayPropertyValues` (
  `configNodePropertyArray` long NOT NULL
  `propertyValues` text NOT NULL
);


-- --------------------------------------------------------------------------
-- Table structure for table `configNodePropertyBoolean` generated from model 'configNodePropertyBoolean'
--

CREATE TABLE IF NOT EXISTS `configNodePropertyBoolean` (
  `name` text /*property name*/,
  `optional` boolean /*True if optional*/,
  `is_set` boolean /*True if property is set*/,
  `type` int /*Property type, 1&#x3D;String, 2&#x3D;Long, 3&#x3D;Integer, 7&#x3D;Float, 11&#x3D;Boolean, 12&#x3D;Secrets(String)*/,
  `value` boolean /*Property value*/,
  `description` text /*Property description*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `configNodePropertyDropDown` generated from model 'configNodePropertyDropDown'
--

CREATE TABLE IF NOT EXISTS `configNodePropertyDropDown` (
  `name` text /*property name*/,
  `optional` boolean /*True if optional*/,
  `is_set` boolean /*True if property is set*/,
  `type` long,
  `value` blob /*Property value*/,
  `description` text /*Property description*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `configNodePropertyDropDown_type` generated from model 'configNodePropertyDropDownType'
--

CREATE TABLE IF NOT EXISTS `configNodePropertyDropDown_type` (
  `labels` blob /*Drop Down label*/,
  `values` blob /*Drown Down value*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `configNodePropertyFloat` generated from model 'configNodePropertyFloat'
--

CREATE TABLE IF NOT EXISTS `configNodePropertyFloat` (
  `name` text /*property name*/,
  `optional` boolean /*True if optional*/,
  `is_set` boolean /*True if property is set*/,
  `type` int /*Property type, 1&#x3D;String, 2&#x3D;Long, 3&#x3D;Integer, 7&#x3D;Float, 11&#x3D;Boolean, 12&#x3D;Secrets(String)*/,
  `value` decimal /*Property value*/,
  `description` text /*Property description*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `configNodePropertyInteger` generated from model 'configNodePropertyInteger'
--

CREATE TABLE IF NOT EXISTS `configNodePropertyInteger` (
  `name` text /*property name*/,
  `optional` boolean /*True if optional*/,
  `is_set` boolean /*True if property is set*/,
  `type` int /*Property type, 1&#x3D;String, 2&#x3D;Long, 3&#x3D;Integer, 7&#x3D;Float, 11&#x3D;Boolean, 12&#x3D;Secrets(String)*/,
  `value` int /*Property value*/,
  `description` text /*Property description*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `configNodePropertyString` generated from model 'configNodePropertyString'
--

CREATE TABLE IF NOT EXISTS `configNodePropertyString` (
  `name` text /*property name*/,
  `optional` boolean /*True if optional*/,
  `is_set` boolean /*True if property is set*/,
  `type` int /*Property type, 1&#x3D;String, 2&#x3D;Long, 3&#x3D;Integer, 7&#x3D;Float, 11&#x3D;Boolean, 12&#x3D;Secrets(String)*/,
  `value` text /*Property value*/,
  `description` text /*Property description*/
); 


-- --------------------------------------------------------------------------
-- Table structure for table `guideLocalizationServiceInfo` generated from model 'guideLocalizationServiceInfo'
--

CREATE TABLE IF NOT EXISTS `guideLocalizationServiceInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `guideLocalizationServiceProperties` generated from model 'guideLocalizationServiceProperties'
--

CREATE TABLE IF NOT EXISTS `guideLocalizationServiceProperties` (
  `supportedLocales` long,
  `LocalizableProperties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `MessagingUserComponentFactoryInfo` generated from model 'messagingUserComponentFactoryInfo'
--

CREATE TABLE IF NOT EXISTS `MessagingUserComponentFactoryInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `MessagingUserComponentFactoryProperties` generated from model 'messagingUserComponentFactoryProperties'
--

CREATE TABLE IF NOT EXISTS `MessagingUserComponentFactoryProperties` (
  `priority` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheAriesJmxFrameworkStateConfigInfo` generated from model 'orgApacheAriesJmxFrameworkStateConfigInfo'
--

CREATE TABLE IF NOT EXISTS `orgApacheAriesJmxFrameworkStateConfigInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long,
  `bundle_location` text,
  `service_location` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheAriesJmxFrameworkStateConfigProperties` generated from model 'orgApacheAriesJmxFrameworkStateConfigProperties'
--

CREATE TABLE IF NOT EXISTS `orgApacheAriesJmxFrameworkStateConfigProperties` (
  `attributeChangeNotificationEnabled` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheFelixEventadminImplEventAdminInfo` generated from model 'orgApacheFelixEventadminImplEventAdminInfo'
--

CREATE TABLE IF NOT EXISTS `orgApacheFelixEventadminImplEventAdminInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long,
  `bundle_location` text,
  `service_location` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheFelixEventadminImplEventAdminProperties` generated from model 'orgApacheFelixEventadminImplEventAdminProperties'
--

CREATE TABLE IF NOT EXISTS `orgApacheFelixEventadminImplEventAdminProperties` (
  `orgapachefelixeventadminThreadPoolSize` long,
  `orgapachefelixeventadminAsyncToSyncThreadRatio` long,
  `orgapachefelixeventadminTimeout` long,
  `orgapachefelixeventadminRequireTopic` long,
  `orgapachefelixeventadminIgnoreTimeout` long,
  `orgapachefelixeventadminIgnoreTopic` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheFelixHttpInfo` generated from model 'orgApacheFelixHttpInfo'
--

CREATE TABLE IF NOT EXISTS `orgApacheFelixHttpInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long,
  `bundle_location` text,
  `service_location` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheFelixHttpProperties` generated from model 'orgApacheFelixHttpProperties'
--

CREATE TABLE IF NOT EXISTS `orgApacheFelixHttpProperties` (
  `orgapachefelixhttphost` long,
  `orgapachefelixhttpenable` long,
  `orgosgiservicehttpport` long,
  `orgapachefelixhttptimeout` long,
  `orgapachefelixhttpsenable` long,
  `orgosgiservicehttpportsecure` long,
  `orgapachefelixhttpskeystore` long,
  `orgapachefelixhttpskeystorepassword` long,
  `orgapachefelixhttpskeystorekeypassword` long,
  `orgapachefelixhttpstruststore` long,
  `orgapachefelixhttpstruststorepassword` long,
  `orgapachefelixhttpsclientcertificate` long,
  `orgapachefelixhttpcontext_path` long,
  `orgapachefelixhttpmbeans` long,
  `orgapachefelixhttpsessiontimeout` long,
  `orgapachefelixhttpjettythreadpoolmax` long,
  `orgapachefelixhttpjettyacceptors` long,
  `orgapachefelixhttpjettyselectors` long,
  `orgapachefelixhttpjettyheaderBufferSize` long,
  `orgapachefelixhttpjettyrequestBufferSize` long,
  `orgapachefelixhttpjettyresponseBufferSize` long,
  `orgapachefelixhttpjettymaxFormSize` long,
  `orgapachefelixhttppath_exclusions` long,
  `orgapachefelixhttpsjettyciphersuitesexcluded` long,
  `orgapachefelixhttpsjettyciphersuitesincluded` long,
  `orgapachefelixhttpjettysendServerHeader` long,
  `orgapachefelixhttpsjettyprotocolsincluded` long,
  `orgapachefelixhttpsjettyprotocolsexcluded` long,
  `orgapachefelixproxyloadbalancerconnectionenable` long,
  `orgapachefelixhttpsjettyrenegotiateAllowed` long,
  `orgapachefelixhttpsjettysessioncookiehttpOnly` long,
  `orgapachefelixhttpsjettysessioncookiesecure` long,
  `orgeclipsejettyservletSessionIdPathParameterName` long,
  `orgeclipsejettyservletCheckingRemoteSessionIdEncoding` long,
  `orgeclipsejettyservletSessionCookie` long,
  `orgeclipsejettyservletSessionDomain` long,
  `orgeclipsejettyservletSessionPath` long,
  `orgeclipsejettyservletMaxAge` long,
  `orgapachefelixhttpname` long,
  `orgapachefelixjettygziphandlerenable` long,
  `orgapachefelixjettygzipminGzipSize` long,
  `orgapachefelixjettygzipcompressionLevel` long,
  `orgapachefelixjettygzipinflateBufferSize` long,
  `orgapachefelixjettygzipsyncFlush` long,
  `orgapachefelixjettygzipexcludedUserAgents` long,
  `orgapachefelixjettygzipincludedMethods` long,
  `orgapachefelixjettygzipexcludedMethods` long,
  `orgapachefelixjettygzipincludedPaths` long,
  `orgapachefelixjettygzipexcludedPaths` long,
  `orgapachefelixjettygzipincludedMimeTypes` long,
  `orgapachefelixjettygzipexcludedMimeTypes` long,
  `orgapachefelixhttpsessioninvalidate` long,
  `orgapachefelixhttpsessionuniqueid` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheFelixHttpSslfilterSslFilterInfo` generated from model 'orgApacheFelixHttpSslfilterSslFilterInfo'
--

CREATE TABLE IF NOT EXISTS `orgApacheFelixHttpSslfilterSslFilterInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheFelixHttpSslfilterSslFilterProperties` generated from model 'orgApacheFelixHttpSslfilterSslFilterProperties'
--

CREATE TABLE IF NOT EXISTS `orgApacheFelixHttpSslfilterSslFilterProperties` (
  `sslforwardheader` long,
  `sslforwardvalue` long,
  `sslforwardcertheader` long,
  `rewriteabsoluteurls` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheFelixJaasConfigurationFactoryInfo` generated from model 'orgApacheFelixJaasConfigurationFactoryInfo'
--

CREATE TABLE IF NOT EXISTS `orgApacheFelixJaasConfigurationFactoryInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheFelixJaasConfigurationFactoryProperties` generated from model 'orgApacheFelixJaasConfigurationFactoryProperties'
--

CREATE TABLE IF NOT EXISTS `orgApacheFelixJaasConfigurationFactoryProperties` (
  `jaascontrolFlag` long,
  `jaasranking` long,
  `jaasrealmName` long,
  `jaasclassname` long,
  `jaasoptions` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheFelixJaasConfigurationSpiInfo` generated from model 'orgApacheFelixJaasConfigurationSpiInfo'
--

CREATE TABLE IF NOT EXISTS `orgApacheFelixJaasConfigurationSpiInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long,
  `bundle_location` text,
  `service_location` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheFelixJaasConfigurationSpiProperties` generated from model 'orgApacheFelixJaasConfigurationSpiProperties'
--

CREATE TABLE IF NOT EXISTS `orgApacheFelixJaasConfigurationSpiProperties` (
  `jaasdefaultRealmName` long,
  `jaasconfigProviderName` long,
  `jaasglobalConfigPolicy` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheFelixScrScrServiceInfo` generated from model 'orgApacheFelixScrScrServiceInfo'
--

CREATE TABLE IF NOT EXISTS `orgApacheFelixScrScrServiceInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheFelixScrScrServiceProperties` generated from model 'orgApacheFelixScrScrServiceProperties'
--

CREATE TABLE IF NOT EXISTS `orgApacheFelixScrScrServiceProperties` (
  `dsloglevel` long,
  `dsfactoryenabled` long,
  `dsdelayedkeepInstances` long,
  `dslocktimeoutmilliseconds` long,
  `dsstoptimeoutmilliseconds` long,
  `dsglobalextender` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheFelixSystemreadyImplComponentsCheckInfo` generated from model 'orgApacheFelixSystemreadyImplComponentsCheckInfo'
--

CREATE TABLE IF NOT EXISTS `orgApacheFelixSystemreadyImplComponentsCheckInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheFelixSystemreadyImplComponentsCheckProperties` generated from model 'orgApacheFelixSystemreadyImplComponentsCheckProperties'
--

CREATE TABLE IF NOT EXISTS `orgApacheFelixSystemreadyImplComponentsCheckProperties` (
  `componentslist` long,
  `type` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheFelixSystemreadyImplFrameworkStartCheckInfo` generated from model 'orgApacheFelixSystemreadyImplFrameworkStartCheckInfo'
--

CREATE TABLE IF NOT EXISTS `orgApacheFelixSystemreadyImplFrameworkStartCheckInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheFelixSystemreadyImplFrameworkStartCheckProperties` generated from model 'orgApacheFelixSystemreadyImplFrameworkStartCheckProperties'
--

CREATE TABLE IF NOT EXISTS `orgApacheFelixSystemreadyImplFrameworkStartCheckProperties` (
  `timeout` long,
  `targetstartlevel` long,
  `targetstartlevelpropname` long,
  `type` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheFelixSystemreadyImplServicesCheckInfo` generated from model 'orgApacheFelixSystemreadyImplServicesCheckInfo'
--

CREATE TABLE IF NOT EXISTS `orgApacheFelixSystemreadyImplServicesCheckInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long,
  `bundle_location` text,
  `service_location` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheFelixSystemreadyImplServicesCheckProperties` generated from model 'orgApacheFelixSystemreadyImplServicesCheckProperties'
--

CREATE TABLE IF NOT EXISTS `orgApacheFelixSystemreadyImplServicesCheckProperties` (
  `serviceslist` long,
  `type` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheFelixSystemreadyImplServletSystemAliveServletInfo` generated from model 'orgApacheFelixSystemreadyImplServletSystemAliveServletInfo'
--

CREATE TABLE IF NOT EXISTS `orgApacheFelixSystemreadyImplServletSystemAliveServletInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long,
  `bundle_location` text,
  `service_location` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheFelixSystemreadyImplServletSystemAliveServletProperties` generated from model 'orgApacheFelixSystemreadyImplServletSystemAliveServletProperties'
--

CREATE TABLE IF NOT EXISTS `orgApacheFelixSystemreadyImplServletSystemAliveServletProperties` (
  `osgihttpwhiteboardservletpattern` long,
  `osgihttpwhiteboardcontextselect` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheFelixSystemreadyImplServletSystemReadyServletInfo` generated from model 'orgApacheFelixSystemreadyImplServletSystemReadyServletInfo'
--

CREATE TABLE IF NOT EXISTS `orgApacheFelixSystemreadyImplServletSystemReadyServletInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long,
  `bundle_location` text,
  `service_location` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheFelixSystemreadyImplServletSystemReadyServletProperties` generated from model 'orgApacheFelixSystemreadyImplServletSystemReadyServletProperties'
--

CREATE TABLE IF NOT EXISTS `orgApacheFelixSystemreadyImplServletSystemReadyServletProperties` (
  `osgihttpwhiteboardservletpattern` long,
  `osgihttpwhiteboardcontextselect` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheFelixSystemreadySystemReadyMonitorInfo` generated from model 'orgApacheFelixSystemreadySystemReadyMonitorInfo'
--

CREATE TABLE IF NOT EXISTS `orgApacheFelixSystemreadySystemReadyMonitorInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheFelixSystemreadySystemReadyMonitorProperties` generated from model 'orgApacheFelixSystemreadySystemReadyMonitorProperties'
--

CREATE TABLE IF NOT EXISTS `orgApacheFelixSystemreadySystemReadyMonitorProperties` (
  `pollinterval` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheFelixWebconsoleInternalServletOsgiManagerInfo` generated from model 'orgApacheFelixWebconsoleInternalServletOsgiManagerInfo'
--

CREATE TABLE IF NOT EXISTS `orgApacheFelixWebconsoleInternalServletOsgiManagerInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheFelixWebconsoleInternalServletOsgiManagerProperties` generated from model 'orgApacheFelixWebconsoleInternalServletOsgiManagerProperties'
--

CREATE TABLE IF NOT EXISTS `orgApacheFelixWebconsoleInternalServletOsgiManagerProperties` (
  `managerroot` long,
  `httpservicefilter` long,
  `defaultrender` long,
  `realm` long,
  `username` long,
  `password` long,
  `category` long,
  `locale` long,
  `loglevel` long,
  `plugins` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheFelixWebconsolePluginsEventInternalPluginServletInfo` generated from model 'orgApacheFelixWebconsolePluginsEventInternalPluginServletInfo'
--

CREATE TABLE IF NOT EXISTS `orgApacheFelixWebconsolePluginsEventInternalPluginServletInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheFelixWebconsolePluginsEventInternalPluginServletProperties` generated from model 'orgApacheFelixWebconsolePluginsEventInternalPluginServletProperties'
--

CREATE TABLE IF NOT EXISTS `orgApacheFelixWebconsolePluginsEventInternalPluginServletProperties` (
  `maxsize` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoInfo` generated from model 'orgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoInfo'
--

CREATE TABLE IF NOT EXISTS `orgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties` generated from model 'orgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties'
--

CREATE TABLE IF NOT EXISTS `orgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties` (
  `felixmemoryusagedumpthreshold` long,
  `felixmemoryusagedumpinterval` long,
  `felixmemoryusagedumplocation` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheHttpProxyconfiguratorInfo` generated from model 'orgApacheHttpProxyconfiguratorInfo'
--

CREATE TABLE IF NOT EXISTS `orgApacheHttpProxyconfiguratorInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheHttpProxyconfiguratorProperties` generated from model 'orgApacheHttpProxyconfiguratorProperties'
--

CREATE TABLE IF NOT EXISTS `orgApacheHttpProxyconfiguratorProperties` (
  `proxyenabled` long,
  `proxyhost` long,
  `proxyport` long,
  `proxyuser` long,
  `proxypassword` long,
  `proxyexceptions` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderInfo` generated from model 'orgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderInfo'
--

CREATE TABLE IF NOT EXISTS `orgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderProperties` generated from model 'orgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderProperties'
--

CREATE TABLE IF NOT EXISTS `orgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderProperties` (
  `dir` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreInfo` generated from model 'orgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreInfo'
--

CREATE TABLE IF NOT EXISTS `orgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long,
  `bundle_location` text,
  `service_location` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreProperties` generated from model 'orgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreProperties'
--

CREATE TABLE IF NOT EXISTS `orgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreProperties` (
  `path` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceInfo` generated from model 'orgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceInfo'
--

CREATE TABLE IF NOT EXISTS `orgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreInfo` generated from model 'orgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreInfo'
--

CREATE TABLE IF NOT EXISTS `orgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long,
  `bundle_location` text,
  `service_location` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreProperties` generated from model 'orgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreProperties'
--

CREATE TABLE IF NOT EXISTS `orgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreProperties` (
  `persistentCacheIncludes` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties` generated from model 'orgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties'
--

CREATE TABLE IF NOT EXISTS `orgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties` (
  `mongouri` long,
  `db` long,
  `socketKeepAlive` long,
  `cache` long,
  `nodeCachePercentage` long,
  `prevDocCachePercentage` long,
  `childrenCachePercentage` long,
  `diffCachePercentage` long,
  `cacheSegmentCount` long,
  `cacheStackMoveDistance` long,
  `blobCacheSize` long,
  `persistentCache` long,
  `journalCache` long,
  `customBlobStore` long,
  `journalGCInterval` long,
  `journalGCMaxAge` long,
  `prefetchExternalChanges` long,
  `role` long,
  `versionGcMaxAgeInSecs` long,
  `versionGCExpression` long,
  `versionGCTimeLimitInSecs` long,
  `blobGcMaxAgeInSecs` long,
  `blobTrackSnapshotIntervalInSecs` long,
  `repositoryhome` long,
  `maxReplicationLagInSecs` long,
  `documentStoreType` long,
  `bundlingDisabled` long,
  `updateLimit` long,
  `persistentCacheIncludes` long,
  `leaseCheckMode` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacInfo` generated from model 'orgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacInfo'
--

CREATE TABLE IF NOT EXISTS `orgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties` generated from model 'orgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties'
--

CREATE TABLE IF NOT EXISTS `orgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties` (
  `includedPaths` long,
  `enableAsyncObserver` long,
  `observerQueueSize` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceInfo` generated from model 'orgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceInfo'
--

CREATE TABLE IF NOT EXISTS `orgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long,
  `bundle_location` text,
  `service_location` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties` generated from model 'orgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties'
--

CREATE TABLE IF NOT EXISTS `orgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties` (
  `asyncConfigs` long,
  `leaseTimeOutMinutes` long,
  `failingIndexTimeoutSeconds` long,
  `errorWarnIntervalSeconds` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServInfo` generated from model 'orgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServInfo'
--

CREATE TABLE IF NOT EXISTS `orgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long,
  `additionalProperties` text,
  `bundle_location` text,
  `service_location` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties` generated from model 'orgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties'
--

CREATE TABLE IF NOT EXISTS `orgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties` (
  `disabled` long,
  `debug` long,
  `localIndexDir` long,
  `enableOpenIndexAsync` long,
  `threadPoolSize` long,
  `prefetchIndexFiles` long,
  `extractedTextCacheSizeInMB` long,
  `extractedTextCacheExpiryInSecs` long,
  `alwaysUsePreExtractedCache` long,
  `booleanClauseLimit` long,
  `enableHybridIndexing` long,
  `hybridQueueSize` long,
  `disableStoredIndexDefinition` long,
  `deletedBlobsCollectionEnabled` long,
  `propIndexCleanerIntervalInSecs` long,
  `enableSingleBlobIndexFiles` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoInfo` generated from model 'orgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoInfo'
--

CREATE TABLE IF NOT EXISTS `orgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties` generated from model 'orgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties'
--

CREATE TABLE IF NOT EXISTS `orgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties` (
  `solrhomepath` long,
  `solrcorename` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersInfo` generated from model 'orgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersInfo'
--

CREATE TABLE IF NOT EXISTS `orgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersProperties` generated from model 'orgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersProperties'
--

CREATE TABLE IF NOT EXISTS `orgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersProperties` (
  `enabled` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationInfo` generated from model 'orgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationInfo'
--

CREATE TABLE IF NOT EXISTS `orgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties` generated from model 'orgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties'
--

CREATE TABLE IF NOT EXISTS `orgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties` (
  `pathdescfield` long,
  `pathchildfield` long,
  `pathparentfield` long,
  `pathexactfield` long,
  `catchallfield` long,
  `collapsedpathfield` long,
  `pathdepthfield` long,
  `commitpolicy` long,
  `rows` long,
  `pathrestrictions` long,
  `propertyrestrictions` long,
  `primarytypesrestrictions` long,
  `ignoredproperties` long,
  `usedproperties` long,
  `typemappings` long,
  `propertymappings` long,
  `collapsejcrcontentnodes` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfInfo` generated from model 'orgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfInfo'
--

CREATE TABLE IF NOT EXISTS `orgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties` generated from model 'orgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties'
--

CREATE TABLE IF NOT EXISTS `orgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties` (
  `solrhttpurl` long,
  `solrzkhost` long,
  `solrcollection` long,
  `solrsockettimeout` long,
  `solrconnectiontimeout` long,
  `solrshardsno` long,
  `solrreplicationfactor` long,
  `solrconfdir` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidInfo` generated from model 'orgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidInfo'
--

CREATE TABLE IF NOT EXISTS `orgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidProperties` generated from model 'orgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidProperties'
--

CREATE TABLE IF NOT EXISTS `orgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidProperties` (
  `queryaggregation` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeInfo` generated from model 'orgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeInfo'
--

CREATE TABLE IF NOT EXISTS `orgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties` generated from model 'orgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties'
--

CREATE TABLE IF NOT EXISTS `orgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties` (
  `servertype` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryInfo` generated from model 'orgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryInfo'
--

CREATE TABLE IF NOT EXISTS `orgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties` generated from model 'orgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties'
--

CREATE TABLE IF NOT EXISTS `orgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties` (
  `providerType` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheJackrabbitOakPluginsObservationChangeCollectorProviderInfo` generated from model 'orgApacheJackrabbitOakPluginsObservationChangeCollectorProviderInfo'
--

CREATE TABLE IF NOT EXISTS `orgApacheJackrabbitOakPluginsObservationChangeCollectorProviderInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long,
  `bundle_location` text,
  `service_location` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties` generated from model 'orgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties'
--

CREATE TABLE IF NOT EXISTS `orgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties` (
  `maxItems` long,
  `maxPathDepth` long,
  `enabled` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheJackrabbitOakQueryQueryEngineSettingsServiceInfo` generated from model 'orgApacheJackrabbitOakQueryQueryEngineSettingsServiceInfo'
--

CREATE TABLE IF NOT EXISTS `orgApacheJackrabbitOakQueryQueryEngineSettingsServiceInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties` generated from model 'orgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties'
--

CREATE TABLE IF NOT EXISTS `orgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties` (
  `queryLimitInMemory` long,
  `queryLimitReads` long,
  `queryFailTraversal` long,
  `fastQuerySize` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigInfo` generated from model 'orgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigInfo'
--

CREATE TABLE IF NOT EXISTS `orgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties` generated from model 'orgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties'
--

CREATE TABLE IF NOT EXISTS `orgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties` (
  `orgapachejackrabbitoakauthenticationappName` long,
  `orgapachejackrabbitoakauthenticationconfigSpiName` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiInfo` generated from model 'orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiInfo'
--

CREATE TABLE IF NOT EXISTS `orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties` generated from model 'orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties'
--

CREATE TABLE IF NOT EXISTS `orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties` (
  `providername` long,
  `hostname` long,
  `hostport` long,
  `hostssl` long,
  `hosttls` long,
  `hostnoCertCheck` long,
  `binddn` long,
  `bindpassword` long,
  `searchTimeout` long,
  `adminPoolmaxActive` long,
  `adminPoollookupOnValidate` long,
  `userPoolmaxActive` long,
  `userPoollookupOnValidate` long,
  `userbaseDN` long,
  `userobjectclass` long,
  `useridAttribute` long,
  `userextraFilter` long,
  `usermakeDnPath` long,
  `groupbaseDN` long,
  `groupobjectclass` long,
  `groupnameAttribute` long,
  `groupextraFilter` long,
  `groupmakeDnPath` long,
  `groupmemberAttribute` long,
  `useUidForExtId` long,
  `customattributes` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraInfo` generated from model 'orgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraInfo'
--

CREATE TABLE IF NOT EXISTS `orgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long,
  `bundle_location` text,
  `service_location` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties` generated from model 'orgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties'
--

CREATE TABLE IF NOT EXISTS `orgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties` (
  `tokenExpiration` long,
  `tokenLength` long,
  `tokenRefresh` long,
  `tokenCleanupThreshold` long,
  `passwordHashAlgorithm` long,
  `passwordHashIterations` long,
  `passwordSaltSize` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurInfo` generated from model 'orgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurInfo'
--

CREATE TABLE IF NOT EXISTS `orgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long,
  `bundle_location` text,
  `service_location` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties` generated from model 'orgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties'
--

CREATE TABLE IF NOT EXISTS `orgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties` (
  `permissionsJr2` long,
  `importBehavior` long,
  `readPaths` long,
  `administrativePrincipals` long,
  `configurationRanking` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiInfo` generated from model 'orgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiInfo'
--

CREATE TABLE IF NOT EXISTS `orgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long,
  `bundle_location` text,
  `service_location` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties` generated from model 'orgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties'
--

CREATE TABLE IF NOT EXISTS `orgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties` (
  `requiredServicePids` long,
  `authorizationCompositionType` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameInfo` generated from model 'orgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameInfo'
--

CREATE TABLE IF NOT EXISTS `orgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long,
  `bundle_location` text,
  `service_location` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameProperties` generated from model 'orgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameProperties'
--

CREATE TABLE IF NOT EXISTS `orgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameProperties` (
  `length` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheJackrabbitOakSecurityUserUserConfigurationImplInfo` generated from model 'orgApacheJackrabbitOakSecurityUserUserConfigurationImplInfo'
--

CREATE TABLE IF NOT EXISTS `orgApacheJackrabbitOakSecurityUserUserConfigurationImplInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long,
  `bundle_location` text,
  `service_location` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties` generated from model 'orgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties'
--

CREATE TABLE IF NOT EXISTS `orgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties` (
  `usersPath` long,
  `groupsPath` long,
  `systemRelativePath` long,
  `defaultDepth` long,
  `importBehavior` long,
  `passwordHashAlgorithm` long,
  `passwordHashIterations` long,
  `passwordSaltSize` long,
  `omitAdminPw` long,
  `supportAutoSave` long,
  `passwordMaxAge` long,
  `initialPasswordChange` long,
  `passwordHistorySize` long,
  `passwordExpiryForAdmin` long,
  `cacheExpiration` long,
  `enableRFC7613UsercaseMappedProfile` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceInfo` generated from model 'orgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceInfo'
--

CREATE TABLE IF NOT EXISTS `orgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties` generated from model 'orgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties'
--

CREATE TABLE IF NOT EXISTS `orgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties` (
  `accountName` long,
  `containerName` long,
  `accessKey` long,
  `rootPath` long,
  `connectionURL` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryInfo` generated from model 'orgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryInfo'
--

CREATE TABLE IF NOT EXISTS `orgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties` generated from model 'orgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties'
--

CREATE TABLE IF NOT EXISTS `orgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties` (
  `repositoryhome` long,
  `tarmkmode` long,
  `tarmksize` long,
  `segmentCachesize` long,
  `stringCachesize` long,
  `templateCachesize` long,
  `stringDeduplicationCachesize` long,
  `templateDeduplicationCachesize` long,
  `nodeDeduplicationCachesize` long,
  `pauseCompaction` long,
  `compactionretryCount` long,
  `compactionforcetimeout` long,
  `compactionsizeDeltaEstimation` long,
  `compactiondisableEstimation` long,
  `compactionretainedGenerations` long,
  `compactionmemoryThreshold` long,
  `compactionprogressLog` long,
  `standby` long,
  `customBlobStore` long,
  `customSegmentStore` long,
  `splitPersistence` long,
  `repositorybackupdir` long,
  `blobGcMaxAgeInSecs` long,
  `blobTrackSnapshotIntervalInSecs` long,
  `role` long,
  `registerDescriptors` long,
  `dispatchChanges` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceInfo` generated from model 'orgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceInfo'
--

CREATE TABLE IF NOT EXISTS `orgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long,
  `bundle_location` text,
  `service_location` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceProperties` generated from model 'orgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceProperties'
--

CREATE TABLE IF NOT EXISTS `orgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceProperties` (
  `commitsTrackerWriterGroups` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheJackrabbitOakSegmentSegmentNodeStoreServiceInfo` generated from model 'orgApacheJackrabbitOakSegmentSegmentNodeStoreServiceInfo'
--

CREATE TABLE IF NOT EXISTS `orgApacheJackrabbitOakSegmentSegmentNodeStoreServiceInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long,
  `additionalProperties` text,
  `bundle_location` text,
  `service_location` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties` generated from model 'orgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties'
--

CREATE TABLE IF NOT EXISTS `orgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties` (
  `repositoryhome` long,
  `tarmkmode` long,
  `tarmksize` long,
  `segmentCachesize` long,
  `stringCachesize` long,
  `templateCachesize` long,
  `stringDeduplicationCachesize` long,
  `templateDeduplicationCachesize` long,
  `nodeDeduplicationCachesize` long,
  `pauseCompaction` long,
  `compactionretryCount` long,
  `compactionforcetimeout` long,
  `compactionsizeDeltaEstimation` long,
  `compactiondisableEstimation` long,
  `compactionretainedGenerations` long,
  `compactionmemoryThreshold` long,
  `compactionprogressLog` long,
  `standby` long,
  `customBlobStore` long,
  `customSegmentStore` long,
  `splitPersistence` long,
  `repositorybackupdir` long,
  `blobGcMaxAgeInSecs` long,
  `blobTrackSnapshotIntervalInSecs` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceInfo` generated from model 'orgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceInfo'
--

CREATE TABLE IF NOT EXISTS `orgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties` generated from model 'orgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties'
--

CREATE TABLE IF NOT EXISTS `orgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties` (
  `orgapacheslinginstallerconfigurationpersist` long,
  `mode` long,
  `port` long,
  `primaryhost` long,
  `interval` long,
  `primaryallowedclientipranges` long,
  `secure` long,
  `standbyreadtimeout` long,
  `standbyautoclean` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeInfo` generated from model 'orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeInfo'
--

CREATE TABLE IF NOT EXISTS `orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties` generated from model 'orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties'
--

CREATE TABLE IF NOT EXISTS `orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties` (
  `handlername` long,
  `userexpirationTime` long,
  `userautoMembership` long,
  `userpropertyMapping` long,
  `userpathPrefix` long,
  `usermembershipExpTime` long,
  `usermembershipNestingDepth` long,
  `userdynamicMembership` long,
  `userdisableMissing` long,
  `groupexpirationTime` long,
  `groupautoMembership` long,
  `grouppropertyMapping` long,
  `grouppathPrefix` long,
  `enableRFC7613UsercaseMappedProfile` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExInfo` generated from model 'orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExInfo'
--

CREATE TABLE IF NOT EXISTS `orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties` generated from model 'orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties'
--

CREATE TABLE IF NOT EXISTS `orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties` (
  `jaasranking` long,
  `jaascontrolFlag` long,
  `jaasrealmName` long,
  `idpname` long,
  `synchandlerName` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrInfo` generated from model 'orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrInfo'
--

CREATE TABLE IF NOT EXISTS `orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrProperties` generated from model 'orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrProperties'
--

CREATE TABLE IF NOT EXISTS `orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrProperties` (
  `protectExternalId` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiInfo` generated from model 'orgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiInfo'
--

CREATE TABLE IF NOT EXISTS `orgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long,
  `bundle_location` text,
  `service_location` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties` generated from model 'orgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties'
--

CREATE TABLE IF NOT EXISTS `orgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties` (
  `cugSupportedPaths` long,
  `cugEnabled` long,
  `configurationRanking` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluInfo` generated from model 'orgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluInfo'
--

CREATE TABLE IF NOT EXISTS `orgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluProperties` generated from model 'orgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluProperties'
--

CREATE TABLE IF NOT EXISTS `orgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluProperties` (
  `principalNames` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableInfo` generated from model 'orgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableInfo'
--

CREATE TABLE IF NOT EXISTS `orgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long,
  `bundle_location` text,
  `service_location` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties` generated from model 'orgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties'
--

CREATE TABLE IF NOT EXISTS `orgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties` (
  `enabledActions` long,
  `userPrivilegeNames` long,
  `groupPrivilegeNames` long,
  `constraint` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheJackrabbitVaultPackagingImplPackagingImplInfo` generated from model 'orgApacheJackrabbitVaultPackagingImplPackagingImplInfo'
--

CREATE TABLE IF NOT EXISTS `orgApacheJackrabbitVaultPackagingImplPackagingImplInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheJackrabbitVaultPackagingImplPackagingImplProperties` generated from model 'orgApacheJackrabbitVaultPackagingImplPackagingImplProperties'
--

CREATE TABLE IF NOT EXISTS `orgApacheJackrabbitVaultPackagingImplPackagingImplProperties` (
  `packageRoots` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryInfo` generated from model 'orgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryInfo'
--

CREATE TABLE IF NOT EXISTS `orgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties` generated from model 'orgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties'
--

CREATE TABLE IF NOT EXISTS `orgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties` (
  `homePath` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingAuthCoreImplLogoutServletInfo` generated from model 'orgApacheSlingAuthCoreImplLogoutServletInfo'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingAuthCoreImplLogoutServletInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingAuthCoreImplLogoutServletProperties` generated from model 'orgApacheSlingAuthCoreImplLogoutServletProperties'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingAuthCoreImplLogoutServletProperties` (
  `slingservletmethods` long,
  `slingservletpaths` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingCaconfigImplConfigurationBindingsValueProviderInfo` generated from model 'orgApacheSlingCaconfigImplConfigurationBindingsValueProviderInfo'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingCaconfigImplConfigurationBindingsValueProviderInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingCaconfigImplConfigurationBindingsValueProviderProperties` generated from model 'orgApacheSlingCaconfigImplConfigurationBindingsValueProviderProperties'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingCaconfigImplConfigurationBindingsValueProviderProperties` (
  `enabled` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingCaconfigImplConfigurationResolverImplInfo` generated from model 'orgApacheSlingCaconfigImplConfigurationResolverImplInfo'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingCaconfigImplConfigurationResolverImplInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long,
  `bundle_location` text,
  `service_location` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingCaconfigImplConfigurationResolverImplProperties` generated from model 'orgApacheSlingCaconfigImplConfigurationResolverImplProperties'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingCaconfigImplConfigurationResolverImplProperties` (
  `configBucketNames` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraInfo` generated from model 'orgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraInfo'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraProperties` generated from model 'orgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraProperties'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraProperties` (
  `enabled` long,
  `configPropertyInheritancePropertyNames` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraInfo` generated from model 'orgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraInfo'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraProperties` generated from model 'orgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraProperties'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraProperties` (
  `enabled` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviInfo` generated from model 'orgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviInfo'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties` generated from model 'orgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties` (
  `description` long,
  `overrides` long,
  `enabled` long,
  `serviceranking` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveInfo` generated from model 'orgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveInfo'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveProperties` generated from model 'orgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveProperties'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveProperties` (
  `enabled` long,
  `serviceranking` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingCaconfigManagementImplConfigurationManagementSettiInfo` generated from model 'orgApacheSlingCaconfigManagementImplConfigurationManagementSettiInfo'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingCaconfigManagementImplConfigurationManagementSettiInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long,
  `bundle_location` text,
  `service_location` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties` generated from model 'orgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties` (
  `ignorePropertyNameRegex` long,
  `configCollectionPropertiesResourceNames` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourInfo` generated from model 'orgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourInfo'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long,
  `bundle_location` text,
  `service_location` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties` generated from model 'orgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties` (
  `enabled` long,
  `configPath` long,
  `fallbackPaths` long,
  `configCollectionInheritancePropertyNames` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyInfo` generated from model 'orgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyInfo'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long,
  `bundle_location` text,
  `service_location` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties` generated from model 'orgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties` (
  `enabled` long,
  `configRefResourceNames` long,
  `configRefPropertyNames` long,
  `serviceranking` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingCommonsHtmlInternalTagsoupHtmlParserInfo` generated from model 'orgApacheSlingCommonsHtmlInternalTagsoupHtmlParserInfo'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingCommonsHtmlInternalTagsoupHtmlParserInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties` generated from model 'orgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties` (
  `parserfeatures` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingCommonsLogLogManagerFactoryConfigInfo` generated from model 'orgApacheSlingCommonsLogLogManagerFactoryConfigInfo'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingCommonsLogLogManagerFactoryConfigInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingCommonsLogLogManagerFactoryConfigProperties` generated from model 'orgApacheSlingCommonsLogLogManagerFactoryConfigProperties'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingCommonsLogLogManagerFactoryConfigProperties` (
  `orgapacheslingcommonsloglevel` long,
  `orgapacheslingcommonslogfile` long,
  `orgapacheslingcommonslogpattern` long,
  `orgapacheslingcommonslognames` long,
  `orgapacheslingcommonslogadditiv` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingCommonsLogLogManagerFactoryWriterInfo` generated from model 'orgApacheSlingCommonsLogLogManagerFactoryWriterInfo'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingCommonsLogLogManagerFactoryWriterInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingCommonsLogLogManagerFactoryWriterProperties` generated from model 'orgApacheSlingCommonsLogLogManagerFactoryWriterProperties'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingCommonsLogLogManagerFactoryWriterProperties` (
  `orgapacheslingcommonslogfile` long,
  `orgapacheslingcommonslogfilenumber` long,
  `orgapacheslingcommonslogfilesize` long,
  `orgapacheslingcommonslogfilebuffered` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingCommonsLogLogManagerInfo` generated from model 'orgApacheSlingCommonsLogLogManagerInfo'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingCommonsLogLogManagerInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long,
  `bundle_location` text,
  `service_location` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingCommonsLogLogManagerProperties` generated from model 'orgApacheSlingCommonsLogLogManagerProperties'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingCommonsLogLogManagerProperties` (
  `orgapacheslingcommonsloglevel` long,
  `orgapacheslingcommonslogfile` long,
  `orgapacheslingcommonslogfilenumber` long,
  `orgapacheslingcommonslogfilesize` long,
  `orgapacheslingcommonslogpattern` long,
  `orgapacheslingcommonslogconfigurationFile` long,
  `orgapacheslingcommonslogpackagingDataEnabled` long,
  `orgapacheslingcommonslogmaxCallerDataDepth` long,
  `orgapacheslingcommonslogmaxOldFileCountInDump` long,
  `orgapacheslingcommonslognumOfLines` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingCommonsMetricsInternalLogReporterInfo` generated from model 'orgApacheSlingCommonsMetricsInternalLogReporterInfo'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingCommonsMetricsInternalLogReporterInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingCommonsMetricsInternalLogReporterProperties` generated from model 'orgApacheSlingCommonsMetricsInternalLogReporterProperties'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingCommonsMetricsInternalLogReporterProperties` (
  `period` long,
  `timeUnit` long,
  `level` long,
  `loggerName` long,
  `prefix` long,
  `pattern` long,
  `registryName` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterInfo` generated from model 'orgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterInfo'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long,
  `bundle_location` text,
  `service_location` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties` generated from model 'orgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties` (
  `datasources` long,
  `step` long,
  `archives` long,
  `path` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingCommonsMimeInternalMimeTypeServiceImplInfo` generated from model 'orgApacheSlingCommonsMimeInternalMimeTypeServiceImplInfo'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingCommonsMimeInternalMimeTypeServiceImplInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long,
  `bundle_location` text,
  `service_location` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties` generated from model 'orgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties` (
  `mimetypes` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingCommonsSchedulerImplQuartzSchedulerInfo` generated from model 'orgApacheSlingCommonsSchedulerImplQuartzSchedulerInfo'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingCommonsSchedulerImplQuartzSchedulerInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long,
  `bundle_location` text,
  `service_location` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties` generated from model 'orgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties` (
  `poolName` long,
  `allowedPoolNames` long,
  `scheduleruseleaderforsingle` long,
  `metricsfilters` long,
  `slowThresholdMillis` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingCommonsSchedulerImplSchedulerHealthCheckInfo` generated from model 'orgApacheSlingCommonsSchedulerImplSchedulerHealthCheckInfo'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingCommonsSchedulerImplSchedulerHealthCheckInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties` generated from model 'orgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties` (
  `maxquartzJobdurationacceptable` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryInfo` generated from model 'orgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryInfo'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties` generated from model 'orgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties` (
  `name` long,
  `minPoolSize` long,
  `maxPoolSize` long,
  `queueSize` long,
  `maxThreadAge` long,
  `keepAliveTime` long,
  `blockPolicy` long,
  `shutdownGraceful` long,
  `daemon` long,
  `shutdownWaitTime` long,
  `priority` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingDatasourceDataSourceFactoryInfo` generated from model 'orgApacheSlingDatasourceDataSourceFactoryInfo'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingDatasourceDataSourceFactoryInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingDatasourceDataSourceFactoryProperties` generated from model 'orgApacheSlingDatasourceDataSourceFactoryProperties'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingDatasourceDataSourceFactoryProperties` (
  `datasourcename` long,
  `datasourcesvcpropname` long,
  `driverClassName` long,
  `url` long,
  `username` long,
  `password` long,
  `defaultAutoCommit` long,
  `defaultReadOnly` long,
  `defaultTransactionIsolation` long,
  `defaultCatalog` long,
  `maxActive` long,
  `maxIdle` long,
  `minIdle` long,
  `initialSize` long,
  `maxWait` long,
  `maxAge` long,
  `testOnBorrow` long,
  `testOnReturn` long,
  `testWhileIdle` long,
  `validationQuery` long,
  `validationQueryTimeout` long,
  `timeBetweenEvictionRunsMillis` long,
  `minEvictableIdleTimeMillis` long,
  `connectionProperties` long,
  `initSQL` long,
  `jdbcInterceptors` long,
  `validationInterval` long,
  `logValidationErrors` long,
  `datasourcesvcproperties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingDatasourceJNDIDataSourceFactoryInfo` generated from model 'orgApacheSlingDatasourceJNDIDataSourceFactoryInfo'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingDatasourceJNDIDataSourceFactoryInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingDatasourceJNDIDataSourceFactoryProperties` generated from model 'orgApacheSlingDatasourceJNDIDataSourceFactoryProperties'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingDatasourceJNDIDataSourceFactoryProperties` (
  `datasourcename` long,
  `datasourcesvcpropname` long,
  `datasourcejndiname` long,
  `jndiproperties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingDiscoveryOakConfigInfo` generated from model 'orgApacheSlingDiscoveryOakConfigInfo'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingDiscoveryOakConfigInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long,
  `bundle_location` text,
  `service_location` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingDiscoveryOakConfigProperties` generated from model 'orgApacheSlingDiscoveryOakConfigProperties'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingDiscoveryOakConfigProperties` (
  `connectorPingTimeout` long,
  `connectorPingInterval` long,
  `discoveryLiteCheckInterval` long,
  `clusterSyncServiceTimeout` long,
  `clusterSyncServiceInterval` long,
  `enableSyncToken` long,
  `minEventDelay` long,
  `socketConnectTimeout` long,
  `soTimeout` long,
  `topologyConnectorUrls` long,
  `topologyConnectorWhitelist` long,
  `autoStopLocalLoopEnabled` long,
  `gzipConnectorRequestsEnabled` long,
  `hmacEnabled` long,
  `enableEncryption` long,
  `sharedKey` long,
  `hmacSharedKeyTTL` long,
  `backoffStandbyFactor` long,
  `backoffStableFactor` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckInfo` generated from model 'orgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckInfo'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties` generated from model 'orgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties` (
  `hcname` long,
  `hctags` long,
  `hcmbeanname` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingDistributionAgentImplForwardDistributionAgentFactoInfo` generated from model 'orgApacheSlingDistributionAgentImplForwardDistributionAgentFactoInfo'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingDistributionAgentImplForwardDistributionAgentFactoInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties` generated from model 'orgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties` (
  `name` long,
  `title` long,
  `details` long,
  `enabled` long,
  `serviceName` long,
  `loglevel` long,
  `allowedroots` long,
  `queueprocessingenabled` long,
  `packageImporterendpoints` long,
  `passiveQueues` long,
  `priorityQueues` long,
  `retrystrategy` long,
  `retryattempts` long,
  `requestAuthorizationStrategytarget` long,
  `transportSecretProvidertarget` long,
  `packageBuildertarget` long,
  `triggerstarget` long,
  `queueprovider` long,
  `asyncdelivery` long,
  `httpconntimeout` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAInfo` generated from model 'orgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAInfo'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties` generated from model 'orgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties` (
  `name` long,
  `jcrPrivilege` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryInfo` generated from model 'orgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryInfo'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties` generated from model 'orgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties` (
  `name` long,
  `title` long,
  `details` long,
  `enabled` long,
  `serviceName` long,
  `loglevel` long,
  `allowedroots` long,
  `requestAuthorizationStrategytarget` long,
  `queueProviderFactorytarget` long,
  `packageBuildertarget` long,
  `triggerstarget` long,
  `priorityQueues` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingDistributionAgentImplReverseDistributionAgentFactoInfo` generated from model 'orgApacheSlingDistributionAgentImplReverseDistributionAgentFactoInfo'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingDistributionAgentImplReverseDistributionAgentFactoInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties` generated from model 'orgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties` (
  `name` long,
  `title` long,
  `details` long,
  `enabled` long,
  `serviceName` long,
  `loglevel` long,
  `queueprocessingenabled` long,
  `packageExporterendpoints` long,
  `pullitems` long,
  `httpconntimeout` long,
  `requestAuthorizationStrategytarget` long,
  `transportSecretProvidertarget` long,
  `packageBuildertarget` long,
  `triggerstarget` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorInfo` generated from model 'orgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorInfo'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties` generated from model 'orgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties` (
  `name` long,
  `title` long,
  `details` long,
  `enabled` long,
  `serviceName` long,
  `loglevel` long,
  `queueprocessingenabled` long,
  `packageExportertarget` long,
  `packageImportertarget` long,
  `requestAuthorizationStrategytarget` long,
  `triggerstarget` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryInfo` generated from model 'orgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryInfo'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties` generated from model 'orgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties` (
  `name` long,
  `title` long,
  `details` long,
  `enabled` long,
  `serviceName` long,
  `loglevel` long,
  `queueprocessingenabled` long,
  `passiveQueues` long,
  `packageExporterendpoints` long,
  `packageImporterendpoints` long,
  `retrystrategy` long,
  `retryattempts` long,
  `pullitems` long,
  `httpconntimeout` long,
  `requestAuthorizationStrategytarget` long,
  `transportSecretProvidertarget` long,
  `packageBuildertarget` long,
  `triggerstarget` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingDistributionMonitorDistributionQueueHealthCheckInfo` generated from model 'orgApacheSlingDistributionMonitorDistributionQueueHealthCheckInfo'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingDistributionMonitorDistributionQueueHealthCheckInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties` generated from model 'orgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties` (
  `hcname` long,
  `hctags` long,
  `hcmbeanname` long,
  `numberOfRetriesAllowed` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingDistributionPackagingImplExporterAgentDistributioInfo` generated from model 'orgApacheSlingDistributionPackagingImplExporterAgentDistributioInfo'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingDistributionPackagingImplExporterAgentDistributioInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingDistributionPackagingImplExporterAgentDistributioProperties` generated from model 'orgApacheSlingDistributionPackagingImplExporterAgentDistributioProperties'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingDistributionPackagingImplExporterAgentDistributioProperties` (
  `name` long,
  `queue` long,
  `dropinvaliditems` long,
  `agenttarget` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingDistributionPackagingImplExporterLocalDistributioInfo` generated from model 'orgApacheSlingDistributionPackagingImplExporterLocalDistributioInfo'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingDistributionPackagingImplExporterLocalDistributioInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingDistributionPackagingImplExporterLocalDistributioProperties` generated from model 'orgApacheSlingDistributionPackagingImplExporterLocalDistributioProperties'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingDistributionPackagingImplExporterLocalDistributioProperties` (
  `name` long,
  `packageBuildertarget` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingDistributionPackagingImplExporterRemoteDistributiInfo` generated from model 'orgApacheSlingDistributionPackagingImplExporterRemoteDistributiInfo'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingDistributionPackagingImplExporterRemoteDistributiInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties` generated from model 'orgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties` (
  `name` long,
  `endpoints` long,
  `pullitems` long,
  `packageBuildertarget` long,
  `transportSecretProvidertarget` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingDistributionPackagingImplImporterLocalDistributioInfo` generated from model 'orgApacheSlingDistributionPackagingImplImporterLocalDistributioInfo'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingDistributionPackagingImplImporterLocalDistributioInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingDistributionPackagingImplImporterLocalDistributioProperties` generated from model 'orgApacheSlingDistributionPackagingImplImporterLocalDistributioProperties'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingDistributionPackagingImplImporterLocalDistributioProperties` (
  `name` long,
  `packageBuildertarget` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingDistributionPackagingImplImporterRemoteDistributiInfo` generated from model 'orgApacheSlingDistributionPackagingImplImporterRemoteDistributiInfo'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingDistributionPackagingImplImporterRemoteDistributiInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties` generated from model 'orgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties` (
  `name` long,
  `endpoints` long,
  `transportSecretProvidertarget` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingDistributionPackagingImplImporterRepositoryDistriInfo` generated from model 'orgApacheSlingDistributionPackagingImplImporterRepositoryDistriInfo'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingDistributionPackagingImplImporterRepositoryDistriInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties` generated from model 'orgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties` (
  `name` long,
  `servicename` long,
  `path` long,
  `privilegename` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingDistributionResourcesImplDistributionConfigurationInfo` generated from model 'orgApacheSlingDistributionResourcesImplDistributionConfigurationInfo'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingDistributionResourcesImplDistributionConfigurationInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingDistributionResourcesImplDistributionConfigurationProperties` generated from model 'orgApacheSlingDistributionResourcesImplDistributionConfigurationProperties'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingDistributionResourcesImplDistributionConfigurationProperties` (
  `providerroots` long,
  `kind` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingDistributionResourcesImplDistributionServiceResourInfo` generated from model 'orgApacheSlingDistributionResourcesImplDistributionServiceResourInfo'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingDistributionResourcesImplDistributionServiceResourInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingDistributionResourcesImplDistributionServiceResourProperties` generated from model 'orgApacheSlingDistributionResourcesImplDistributionServiceResourProperties'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingDistributionResourcesImplDistributionServiceResourProperties` (
  `providerroots` long,
  `kind` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingDistributionSerializationImplDistributionPackageBuInfo` generated from model 'orgApacheSlingDistributionSerializationImplDistributionPackageBuInfo'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingDistributionSerializationImplDistributionPackageBuInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingDistributionSerializationImplDistributionPackageBuProperties` generated from model 'orgApacheSlingDistributionSerializationImplDistributionPackageBuProperties'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingDistributionSerializationImplDistributionPackageBuProperties` (
  `name` long,
  `type` long,
  `formattarget` long,
  `tempFsFolder` long,
  `fileThreshold` long,
  `memoryUnit` long,
  `useOffHeapMemory` long,
  `digestAlgorithm` long,
  `monitoringQueueSize` long,
  `cleanupDelay` long,
  `packagefilters` long,
  `propertyfilters` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingDistributionSerializationImplVltVaultDistributionInfo` generated from model 'orgApacheSlingDistributionSerializationImplVltVaultDistributionInfo'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingDistributionSerializationImplVltVaultDistributionInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingDistributionSerializationImplVltVaultDistributionProperties` generated from model 'orgApacheSlingDistributionSerializationImplVltVaultDistributionProperties'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingDistributionSerializationImplVltVaultDistributionProperties` (
  `name` long,
  `type` long,
  `importMode` long,
  `aclHandling` long,
  `packageroots` long,
  `packagefilters` long,
  `propertyfilters` long,
  `tempFsFolder` long,
  `useBinaryReferences` long,
  `autoSaveThreshold` long,
  `cleanupDelay` long,
  `fileThreshold` long,
  `MEGA_BYTES` long,
  `useOffHeapMemory` long,
  `digestAlgorithm` long,
  `monitoringQueueSize` long,
  `pathsMapping` long,
  `strictImport` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingDistributionTransportImplUserCredentialsDistributiInfo` generated from model 'orgApacheSlingDistributionTransportImplUserCredentialsDistributiInfo'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingDistributionTransportImplUserCredentialsDistributiInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties` generated from model 'orgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties` (
  `name` long,
  `username` long,
  `password` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingDistributionTriggerImplDistributionEventDistributeInfo` generated from model 'orgApacheSlingDistributionTriggerImplDistributionEventDistributeInfo'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingDistributionTriggerImplDistributionEventDistributeInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingDistributionTriggerImplDistributionEventDistributeProperties` generated from model 'orgApacheSlingDistributionTriggerImplDistributionEventDistributeProperties'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingDistributionTriggerImplDistributionEventDistributeProperties` (
  `name` long,
  `path` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerInfo` generated from model 'orgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerInfo'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties` generated from model 'orgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties` (
  `name` long,
  `path` long,
  `ignoredPathsPatterns` long,
  `serviceName` long,
  `deep` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiInfo` generated from model 'orgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiInfo'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties` generated from model 'orgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties` (
  `name` long,
  `path` long,
  `serviceName` long,
  `nuggetsPath` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigInfo` generated from model 'orgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigInfo'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigProperties` generated from model 'orgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigProperties'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigProperties` (
  `name` long,
  `endpoint` long,
  `transportSecretProvidertarget` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingDistributionTriggerImplResourceEventDistributionTrInfo` generated from model 'orgApacheSlingDistributionTriggerImplResourceEventDistributionTrInfo'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingDistributionTriggerImplResourceEventDistributionTrInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingDistributionTriggerImplResourceEventDistributionTrProperties` generated from model 'orgApacheSlingDistributionTriggerImplResourceEventDistributionTrProperties'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingDistributionTriggerImplResourceEventDistributionTrProperties` (
  `name` long,
  `path` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingDistributionTriggerImplScheduledDistributionTriggeInfo` generated from model 'orgApacheSlingDistributionTriggerImplScheduledDistributionTriggeInfo'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingDistributionTriggerImplScheduledDistributionTriggeInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties` generated from model 'orgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties` (
  `name` long,
  `path` long,
  `seconds` long,
  `serviceName` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingEngineImplAuthSlingAuthenticatorInfo` generated from model 'orgApacheSlingEngineImplAuthSlingAuthenticatorInfo'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingEngineImplAuthSlingAuthenticatorInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long,
  `bundle_location` text,
  `service_location` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingEngineImplAuthSlingAuthenticatorProperties` generated from model 'orgApacheSlingEngineImplAuthSlingAuthenticatorProperties'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingEngineImplAuthSlingAuthenticatorProperties` (
  `osgihttpwhiteboardcontextselect` long,
  `osgihttpwhiteboardlistener` long,
  `authsudocookie` long,
  `authsudoparameter` long,
  `authannonymous` long,
  `slingauthrequirements` long,
  `slingauthanonymoususer` long,
  `slingauthanonymouspassword` long,
  `authhttp` long,
  `authhttprealm` long,
  `authurisuffix` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterInfo` generated from model 'orgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterInfo'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties` generated from model 'orgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties` (
  `extensions` long,
  `minDurationMs` long,
  `maxDurationMs` long,
  `compactLogFormat` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingEngineImplLogRequestLoggerInfo` generated from model 'orgApacheSlingEngineImplLogRequestLoggerInfo'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingEngineImplLogRequestLoggerInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long,
  `bundle_location` text,
  `service_location` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingEngineImplLogRequestLoggerProperties` generated from model 'orgApacheSlingEngineImplLogRequestLoggerProperties'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingEngineImplLogRequestLoggerProperties` (
  `requestlogoutput` long,
  `requestlogoutputtype` long,
  `requestlogenabled` long,
  `accesslogoutput` long,
  `accesslogoutputtype` long,
  `accesslogenabled` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingEngineImplLogRequestLoggerServiceInfo` generated from model 'orgApacheSlingEngineImplLogRequestLoggerServiceInfo'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingEngineImplLogRequestLoggerServiceInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingEngineImplLogRequestLoggerServiceProperties` generated from model 'orgApacheSlingEngineImplLogRequestLoggerServiceProperties'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingEngineImplLogRequestLoggerServiceProperties` (
  `requestlogserviceformat` long,
  `requestlogserviceoutput` long,
  `requestlogserviceoutputtype` long,
  `requestlogserviceonentry` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingEngineImplSlingMainServletInfo` generated from model 'orgApacheSlingEngineImplSlingMainServletInfo'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingEngineImplSlingMainServletInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long,
  `bundle_location` text,
  `service_location` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingEngineImplSlingMainServletProperties` generated from model 'orgApacheSlingEngineImplSlingMainServletProperties'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingEngineImplSlingMainServletProperties` (
  `slingmaxcalls` long,
  `slingmaxinclusions` long,
  `slingtraceallow` long,
  `slingmaxrecordrequests` long,
  `slingstorepatternrequests` long,
  `slingserverinfo` long,
  `slingadditionalresponseheaders` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingEngineParametersInfo` generated from model 'orgApacheSlingEngineParametersInfo'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingEngineParametersInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long,
  `bundle_location` text,
  `service_location` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingEngineParametersProperties` generated from model 'orgApacheSlingEngineParametersProperties'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingEngineParametersProperties` (
  `slingdefaultparameterencoding` long,
  `slingdefaultmaxparameters` long,
  `filelocation` long,
  `filethreshold` long,
  `filemax` long,
  `requestmax` long,
  `slingdefaultparametercheckForAdditionalContainerParameters` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingEventImplEventingThreadPoolInfo` generated from model 'orgApacheSlingEventImplEventingThreadPoolInfo'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingEventImplEventingThreadPoolInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingEventImplEventingThreadPoolProperties` generated from model 'orgApacheSlingEventImplEventingThreadPoolProperties'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingEventImplEventingThreadPoolProperties` (
  `minPoolSize` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingEventImplJobsDefaultJobManagerInfo` generated from model 'orgApacheSlingEventImplJobsDefaultJobManagerInfo'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingEventImplJobsDefaultJobManagerInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingEventImplJobsDefaultJobManagerProperties` generated from model 'orgApacheSlingEventImplJobsDefaultJobManagerProperties'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingEventImplJobsDefaultJobManagerProperties` (
  `queuepriority` long,
  `queueretries` long,
  `queueretrydelay` long,
  `queuemaxparallel` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingEventImplJobsJcrPersistenceHandlerInfo` generated from model 'orgApacheSlingEventImplJobsJcrPersistenceHandlerInfo'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingEventImplJobsJcrPersistenceHandlerInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long,
  `bundle_location` text,
  `service_location` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingEventImplJobsJcrPersistenceHandlerProperties` generated from model 'orgApacheSlingEventImplJobsJcrPersistenceHandlerProperties'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingEventImplJobsJcrPersistenceHandlerProperties` (
  `jobconsumermanagerdisableDistribution` long,
  `startupdelay` long,
  `cleanupperiod` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingEventImplJobsJobConsumerManagerInfo` generated from model 'orgApacheSlingEventImplJobsJobConsumerManagerInfo'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingEventImplJobsJobConsumerManagerInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long,
  `bundle_location` text,
  `service_location` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingEventImplJobsJobConsumerManagerProperties` generated from model 'orgApacheSlingEventImplJobsJobConsumerManagerProperties'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingEventImplJobsJobConsumerManagerProperties` (
  `orgapacheslinginstallerconfigurationpersist` long,
  `jobconsumermanagerwhitelist` long,
  `jobconsumermanagerblacklist` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingEventJobsQueueConfigurationInfo` generated from model 'orgApacheSlingEventJobsQueueConfigurationInfo'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingEventJobsQueueConfigurationInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingEventJobsQueueConfigurationProperties` generated from model 'orgApacheSlingEventJobsQueueConfigurationProperties'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingEventJobsQueueConfigurationProperties` (
  `queuename` long,
  `queuetopics` long,
  `queuetype` long,
  `queuepriority` long,
  `queueretries` long,
  `queueretrydelay` long,
  `queuemaxparallel` long,
  `queuekeepJobs` long,
  `queuepreferRunOnCreationInstance` long,
  `queuethreadPoolSize` long,
  `serviceranking` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWInfo` generated from model 'orgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWInfo'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties` generated from model 'orgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties` (
  `users` long,
  `groups` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingFeatureflagsFeatureInfo` generated from model 'orgApacheSlingFeatureflagsFeatureInfo'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingFeatureflagsFeatureInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingFeatureflagsFeatureProperties` generated from model 'orgApacheSlingFeatureflagsFeatureProperties'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingFeatureflagsFeatureProperties` (
  `name` long,
  `description` long,
  `enabled` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingFeatureflagsImplConfiguredFeatureInfo` generated from model 'orgApacheSlingFeatureflagsImplConfiguredFeatureInfo'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingFeatureflagsImplConfiguredFeatureInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingFeatureflagsImplConfiguredFeatureProperties` generated from model 'orgApacheSlingFeatureflagsImplConfiguredFeatureProperties'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingFeatureflagsImplConfiguredFeatureProperties` (
  `name` long,
  `description` long,
  `enabled` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingHapiImplHApiUtilImplInfo` generated from model 'orgApacheSlingHapiImplHApiUtilImplInfo'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingHapiImplHApiUtilImplInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingHapiImplHApiUtilImplProperties` generated from model 'orgApacheSlingHapiImplHApiUtilImplProperties'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingHapiImplHApiUtilImplProperties` (
  `orgapacheslinghapitoolsresourcetype` long,
  `orgapacheslinghapitoolscollectionresourcetype` long,
  `orgapacheslinghapitoolssearchpaths` long,
  `orgapacheslinghapitoolsexternalurl` long,
  `orgapacheslinghapitoolsenabled` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingHcCoreImplCompositeHealthCheckInfo` generated from model 'orgApacheSlingHcCoreImplCompositeHealthCheckInfo'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingHcCoreImplCompositeHealthCheckInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingHcCoreImplCompositeHealthCheckProperties` generated from model 'orgApacheSlingHcCoreImplCompositeHealthCheckProperties'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingHcCoreImplCompositeHealthCheckProperties` (
  `hcname` long,
  `hctags` long,
  `hcmbeanname` long,
  `filtertags` long,
  `filtercombineTagsWithOr` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplInfo` generated from model 'orgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplInfo'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties` generated from model 'orgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties` (
  `timeoutInMs` long,
  `longRunningFutureThresholdForCriticalMs` long,
  `resultCacheTtlInMs` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingHcCoreImplJmxAttributeHealthCheckInfo` generated from model 'orgApacheSlingHcCoreImplJmxAttributeHealthCheckInfo'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingHcCoreImplJmxAttributeHealthCheckInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties` generated from model 'orgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties` (
  `hcname` long,
  `hctags` long,
  `hcmbeanname` long,
  `mbeanname` long,
  `attributename` long,
  `attributevalueconstraint` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingHcCoreImplScriptableHealthCheckInfo` generated from model 'orgApacheSlingHcCoreImplScriptableHealthCheckInfo'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingHcCoreImplScriptableHealthCheckInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingHcCoreImplScriptableHealthCheckProperties` generated from model 'orgApacheSlingHcCoreImplScriptableHealthCheckProperties'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingHcCoreImplScriptableHealthCheckProperties` (
  `hcname` long,
  `hctags` long,
  `hcmbeanname` long,
  `expression` long,
  `languageextension` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingHcCoreImplServletHealthCheckExecutorServletInfo` generated from model 'orgApacheSlingHcCoreImplServletHealthCheckExecutorServletInfo'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingHcCoreImplServletHealthCheckExecutorServletInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties` generated from model 'orgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties` (
  `servletPath` long,
  `disabled` long,
  `corsaccessControlAllowOrigin` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingHcCoreImplServletResultTxtVerboseSerializerInfo` generated from model 'orgApacheSlingHcCoreImplServletResultTxtVerboseSerializerInfo'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingHcCoreImplServletResultTxtVerboseSerializerInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties` generated from model 'orgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties` (
  `totalWidth` long,
  `colWidthName` long,
  `colWidthResult` long,
  `colWidthTiming` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingI18nImplI18NFilterInfo` generated from model 'orgApacheSlingI18nImplI18NFilterInfo'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingI18nImplI18NFilterInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long,
  `bundle_location` text,
  `service_location` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingI18nImplI18NFilterProperties` generated from model 'orgApacheSlingI18nImplI18NFilterProperties'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingI18nImplI18NFilterProperties` (
  `serviceranking` long,
  `slingfilterscope` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingI18nImplJcrResourceBundleProviderInfo` generated from model 'orgApacheSlingI18nImplJcrResourceBundleProviderInfo'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingI18nImplJcrResourceBundleProviderInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long,
  `additionalProperties` text,
  `bundle_location` text,
  `service_location` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingI18nImplJcrResourceBundleProviderProperties` generated from model 'orgApacheSlingI18nImplJcrResourceBundleProviderProperties'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingI18nImplJcrResourceBundleProviderProperties` (
  `localedefault` long,
  `preloadbundles` long,
  `invalidationdelay` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingInstallerProviderJcrImplJcrInstallerInfo` generated from model 'orgApacheSlingInstallerProviderJcrImplJcrInstallerInfo'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingInstallerProviderJcrImplJcrInstallerInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long,
  `bundle_location` text,
  `service_location` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingInstallerProviderJcrImplJcrInstallerProperties` generated from model 'orgApacheSlingInstallerProviderJcrImplJcrInstallerProperties'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingInstallerProviderJcrImplJcrInstallerProperties` (
  `handlerschemes` long,
  `slingjcrinstallfoldernameregexp` long,
  `slingjcrinstallfoldermaxdepth` long,
  `slingjcrinstallsearchpath` long,
  `slingjcrinstallnewconfigpath` long,
  `slingjcrinstallsignalpath` long,
  `slingjcrinstallenablewriteback` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentInfo` generated from model 'orgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentInfo'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties` generated from model 'orgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties` (
  `whitelistname` long,
  `whitelistbundles` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingJcrBaseInternalLoginAdminWhitelistInfo` generated from model 'orgApacheSlingJcrBaseInternalLoginAdminWhitelistInfo'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingJcrBaseInternalLoginAdminWhitelistInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties` generated from model 'orgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties` (
  `whitelistbypass` long,
  `whitelistbundlesregexp` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingJcrDavexImplServletsSlingDavExServletInfo` generated from model 'orgApacheSlingJcrDavexImplServletsSlingDavExServletInfo'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingJcrDavexImplServletsSlingDavExServletInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingJcrDavexImplServletsSlingDavExServletProperties` generated from model 'orgApacheSlingJcrDavexImplServletsSlingDavExServletProperties'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingJcrDavexImplServletsSlingDavExServletProperties` (
  `alias` long,
  `davcreateabsoluteuri` long,
  `davprotectedhandlers` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingJcrJackrabbitServerJndiRegistrationSupportInfo` generated from model 'orgApacheSlingJcrJackrabbitServerJndiRegistrationSupportInfo'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingJcrJackrabbitServerJndiRegistrationSupportInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties` generated from model 'orgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties` (
  `javanamingfactoryinitial` long,
  `javanamingproviderurl` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingJcrJackrabbitServerRmiRegistrationSupportInfo` generated from model 'orgApacheSlingJcrJackrabbitServerRmiRegistrationSupportInfo'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingJcrJackrabbitServerRmiRegistrationSupportInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties` generated from model 'orgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties` (
  `port` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingJcrRepoinitImplRepositoryInitializerInfo` generated from model 'orgApacheSlingJcrRepoinitImplRepositoryInitializerInfo'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingJcrRepoinitImplRepositoryInitializerInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long,
  `bundle_location` text,
  `service_location` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingJcrRepoinitImplRepositoryInitializerProperties` generated from model 'orgApacheSlingJcrRepoinitImplRepositoryInitializerProperties'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingJcrRepoinitImplRepositoryInitializerProperties` (
  `references` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingJcrRepoinitRepositoryInitializerInfo` generated from model 'orgApacheSlingJcrRepoinitRepositoryInitializerInfo'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingJcrRepoinitRepositoryInitializerInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingJcrRepoinitRepositoryInitializerProperties` generated from model 'orgApacheSlingJcrRepoinitRepositoryInitializerProperties'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingJcrRepoinitRepositoryInitializerProperties` (
  `references` long,
  `scripts` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplInfo` generated from model 'orgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplInfo'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long,
  `bundle_location` text,
  `service_location` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties` generated from model 'orgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties` (
  `resourceresolversearchpath` long,
  `resourceresolvermanglenamespaces` long,
  `resourceresolverallowDirect` long,
  `resourceresolverrequiredproviders` long,
  `resourceresolverrequiredprovidernames` long,
  `resourceresolvervirtual` long,
  `resourceresolvermapping` long,
  `resourceresolvermaplocation` long,
  `resourceresolvermapobservation` long,
  `resourceresolverdefaultvanityredirectstatus` long,
  `resourceresolverenablevanitypath` long,
  `resourceresolvervanitypathmaxEntries` long,
  `resourceresolvervanitypathmaxEntriesstartup` long,
  `resourceresolvervanitypathbloomfiltermaxBytes` long,
  `resourceresolveroptimizealiasresolution` long,
  `resourceresolvervanitypathwhitelist` long,
  `resourceresolvervanitypathblacklist` long,
  `resourceresolvervanityprecedence` long,
  `resourceresolverproviderhandlingparanoid` long,
  `resourceresolverlogclosing` long,
  `resourceresolverlogunclosed` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingJcrResourceInternalJcrSystemUserValidatorInfo` generated from model 'orgApacheSlingJcrResourceInternalJcrSystemUserValidatorInfo'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingJcrResourceInternalJcrSystemUserValidatorInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties` generated from model 'orgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties` (
  `allowonlysystemuser` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryInfo` generated from model 'orgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryInfo'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties` generated from model 'orgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties` (
  `path` long,
  `checkpathprefix` long,
  `jcrPath` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceInfo` generated from model 'orgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceInfo'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties` generated from model 'orgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties` (
  `serviceranking` long,
  `typecollections` long,
  `typenoncollections` long,
  `typecontent` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicInfo` generated from model 'orgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicInfo'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties` generated from model 'orgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties` (
  `serviceranking` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingJcrWebdavImplServletsSimpleWebDavServletInfo` generated from model 'orgApacheSlingJcrWebdavImplServletsSimpleWebDavServletInfo'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingJcrWebdavImplServletsSimpleWebDavServletInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long,
  `bundle_location` text,
  `service_location` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties` generated from model 'orgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties` (
  `davroot` long,
  `davcreateabsoluteuri` long,
  `davrealm` long,
  `collectiontypes` long,
  `filterprefixes` long,
  `filtertypes` long,
  `filteruris` long,
  `typecollections` long,
  `typenoncollections` long,
  `typecontent` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingJmxProviderImplJMXResourceProviderInfo` generated from model 'orgApacheSlingJmxProviderImplJMXResourceProviderInfo'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingJmxProviderImplJMXResourceProviderInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingJmxProviderImplJMXResourceProviderProperties` generated from model 'orgApacheSlingJmxProviderImplJMXResourceProviderProperties'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingJmxProviderImplJMXResourceProviderProperties` (
  `providerroots` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingModelsImplModelAdapterFactoryInfo` generated from model 'orgApacheSlingModelsImplModelAdapterFactoryInfo'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingModelsImplModelAdapterFactoryInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingModelsImplModelAdapterFactoryProperties` generated from model 'orgApacheSlingModelsImplModelAdapterFactoryProperties'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingModelsImplModelAdapterFactoryProperties` (
  `osgihttpwhiteboardlistener` long,
  `osgihttpwhiteboardcontextselect` long,
  `maxrecursiondepth` long,
  `cleanupjobperiod` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingModelsJacksonexporterImplResourceModuleProviderInfo` generated from model 'orgApacheSlingModelsJacksonexporterImplResourceModuleProviderInfo'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingModelsJacksonexporterImplResourceModuleProviderInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties` generated from model 'orgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties` (
  `maxrecursionlevels` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoInfo` generated from model 'orgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoInfo'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties` generated from model 'orgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties` (
  `felixinventoryprintername` long,
  `felixinventoryprintertitle` long,
  `path` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingResourcemergerImplMergedResourceProviderFactoryInfo` generated from model 'orgApacheSlingResourcemergerImplMergedResourceProviderFactoryInfo'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingResourcemergerImplMergedResourceProviderFactoryInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties` generated from model 'orgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties` (
  `mergeroot` long,
  `mergereadOnly` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingResourcemergerPickerOverridingInfo` generated from model 'orgApacheSlingResourcemergerPickerOverridingInfo'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingResourcemergerPickerOverridingInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long,
  `additionalProperties` text,
  `bundle_location` text,
  `service_location` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingResourcemergerPickerOverridingProperties` generated from model 'orgApacheSlingResourcemergerPickerOverridingProperties'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingResourcemergerPickerOverridingProperties` (
  `mergeroot` long,
  `mergereadOnly` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingScriptingCoreImplScriptCacheImplInfo` generated from model 'orgApacheSlingScriptingCoreImplScriptCacheImplInfo'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingScriptingCoreImplScriptCacheImplInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long,
  `bundle_location` text,
  `service_location` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingScriptingCoreImplScriptCacheImplProperties` generated from model 'orgApacheSlingScriptingCoreImplScriptCacheImplProperties'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingScriptingCoreImplScriptCacheImplProperties` (
  `orgapacheslingscriptingcachesize` long,
  `orgapacheslingscriptingcacheadditional_extensions` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingScriptingCoreImplScriptingResourceResolverProviderInfo` generated from model 'orgApacheSlingScriptingCoreImplScriptingResourceResolverProviderInfo'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingScriptingCoreImplScriptingResourceResolverProviderInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties` generated from model 'orgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties` (
  `logstacktraceonclose` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingScriptingJavaImplJavaScriptEngineFactoryInfo` generated from model 'orgApacheSlingScriptingJavaImplJavaScriptEngineFactoryInfo'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingScriptingJavaImplJavaScriptEngineFactoryInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long,
  `bundle_location` text,
  `service_location` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties` generated from model 'orgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties` (
  `javaclassdebuginfo` long,
  `javajavaEncoding` long,
  `javacompilerSourceVM` long,
  `javacompilerTargetVM` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaInfo` generated from model 'orgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaInfo'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties` generated from model 'orgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties` (
  `orgapacheslingscriptingjavascriptrhinooptLevel` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingScriptingJspJspScriptEngineFactoryInfo` generated from model 'orgApacheSlingScriptingJspJspScriptEngineFactoryInfo'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingScriptingJspJspScriptEngineFactoryInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long,
  `bundle_location` text,
  `service_location` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingScriptingJspJspScriptEngineFactoryProperties` generated from model 'orgApacheSlingScriptingJspJspScriptEngineFactoryProperties'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingScriptingJspJspScriptEngineFactoryProperties` (
  `jaspercompilerTargetVM` long,
  `jaspercompilerSourceVM` long,
  `jasperclassdebuginfo` long,
  `jasperenablePooling` long,
  `jasperieClassId` long,
  `jaspergenStringAsCharArray` long,
  `jasperkeepgenerated` long,
  `jaspermappedfile` long,
  `jaspertrimSpaces` long,
  `jasperdisplaySourceFragments` long,
  `defaultissession` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvInfo` generated from model 'orgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvInfo'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long,
  `bundle_location` text,
  `service_location` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties` generated from model 'orgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties` (
  `orgapacheslingscriptingsightlyjsbindings` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingSecurityImplContentDispositionFilterInfo` generated from model 'orgApacheSlingSecurityImplContentDispositionFilterInfo'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingSecurityImplContentDispositionFilterInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long,
  `bundle_location` text,
  `service_location` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingSecurityImplContentDispositionFilterProperties` generated from model 'orgApacheSlingSecurityImplContentDispositionFilterProperties'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingSecurityImplContentDispositionFilterProperties` (
  `slingcontentdispositionpaths` long,
  `slingcontentdispositionexcludedpaths` long,
  `slingcontentdispositionallpaths` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingSecurityImplReferrerFilterInfo` generated from model 'orgApacheSlingSecurityImplReferrerFilterInfo'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingSecurityImplReferrerFilterInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long,
  `bundle_location` text,
  `service_location` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingSecurityImplReferrerFilterProperties` generated from model 'orgApacheSlingSecurityImplReferrerFilterProperties'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingSecurityImplReferrerFilterProperties` (
  `allowempty` long,
  `allowhosts` long,
  `allowhostsregexp` long,
  `filtermethods` long,
  `excludeagentsregexp` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedInfo` generated from model 'orgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedInfo'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties` generated from model 'orgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties` (
  `serviceranking` long,
  `usermapping` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingServiceusermappingImplServiceUserMapperImplInfo` generated from model 'orgApacheSlingServiceusermappingImplServiceUserMapperImplInfo'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingServiceusermappingImplServiceUserMapperImplInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long,
  `bundle_location` text,
  `service_location` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingServiceusermappingImplServiceUserMapperImplProperties` generated from model 'orgApacheSlingServiceusermappingImplServiceUserMapperImplProperties'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingServiceusermappingImplServiceUserMapperImplProperties` (
  `usermapping` long,
  `userdefault` long,
  `userenabledefaultmapping` long,
  `requirevalidation` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingServletsGetDefaultGetServletInfo` generated from model 'orgApacheSlingServletsGetDefaultGetServletInfo'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingServletsGetDefaultGetServletInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long,
  `bundle_location` text,
  `service_location` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingServletsGetDefaultGetServletProperties` generated from model 'orgApacheSlingServletsGetDefaultGetServletProperties'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingServletsGetDefaultGetServletProperties` (
  `aliases` long,
  `index` long,
  `indexfiles` long,
  `enablehtml` long,
  `enablejson` long,
  `enabletxt` long,
  `enablexml` long,
  `jsonmaximumresults` long,
  `ecmaSuport` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingServletsGetImplVersionVersionInfoServletInfo` generated from model 'orgApacheSlingServletsGetImplVersionVersionInfoServletInfo'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingServletsGetImplVersionVersionInfoServletInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingServletsGetImplVersionVersionInfoServletProperties` generated from model 'orgApacheSlingServletsGetImplVersionVersionInfoServletProperties'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingServletsGetImplVersionVersionInfoServletProperties` (
  `slingservletselectors` long,
  `ecmaSuport` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingServletsPostImplHelperChunkCleanUpTaskInfo` generated from model 'orgApacheSlingServletsPostImplHelperChunkCleanUpTaskInfo'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingServletsPostImplHelperChunkCleanUpTaskInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties` generated from model 'orgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties` (
  `schedulerexpression` long,
  `schedulerconcurrent` long,
  `chunkcleanupage` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingServletsPostImplSlingPostServletInfo` generated from model 'orgApacheSlingServletsPostImplSlingPostServletInfo'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingServletsPostImplSlingPostServletInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingServletsPostImplSlingPostServletProperties` generated from model 'orgApacheSlingServletsPostImplSlingPostServletProperties'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingServletsPostImplSlingPostServletProperties` (
  `servletpostdateFormats` long,
  `servletpostnodeNameHints` long,
  `servletpostnodeNameMaxLength` long,
  `servletpostcheckinNewVersionableNodes` long,
  `servletpostautoCheckout` long,
  `servletpostautoCheckin` long,
  `servletpostignorePattern` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingServletsResolverSlingServletResolverInfo` generated from model 'orgApacheSlingServletsResolverSlingServletResolverInfo'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingServletsResolverSlingServletResolverInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long,
  `bundle_location` text,
  `service_location` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingServletsResolverSlingServletResolverProperties` generated from model 'orgApacheSlingServletsResolverSlingServletResolverProperties'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingServletsResolverSlingServletResolverProperties` (
  `servletresolverservletRoot` long,
  `servletresolvercacheSize` long,
  `servletresolverpaths` long,
  `servletresolverdefaultExtensions` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingSettingsImplSlingSettingsServiceImplInfo` generated from model 'orgApacheSlingSettingsImplSlingSettingsServiceImplInfo'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingSettingsImplSlingSettingsServiceImplInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingSettingsImplSlingSettingsServiceImplProperties` generated from model 'orgApacheSlingSettingsImplSlingSettingsServiceImplProperties'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingSettingsImplSlingSettingsServiceImplProperties` (
  `slingname` long,
  `slingdescription` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingStartupfilterImplStartupFilterImplInfo` generated from model 'orgApacheSlingStartupfilterImplStartupFilterImplInfo'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingStartupfilterImplStartupFilterImplInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingStartupfilterImplStartupFilterImplProperties` generated from model 'orgApacheSlingStartupfilterImplStartupFilterImplProperties'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingStartupfilterImplStartupFilterImplProperties` (
  `activebydefault` long,
  `defaultmessage` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingTenantInternalTenantProviderImplInfo` generated from model 'orgApacheSlingTenantInternalTenantProviderImplInfo'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingTenantInternalTenantProviderImplInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingTenantInternalTenantProviderImplProperties` generated from model 'orgApacheSlingTenantInternalTenantProviderImplProperties'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingTenantInternalTenantProviderImplProperties` (
  `tenantroot` long,
  `tenantpathmatcher` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingTracerInternalLogTracerInfo` generated from model 'orgApacheSlingTracerInternalLogTracerInfo'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingTracerInternalLogTracerInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingTracerInternalLogTracerProperties` generated from model 'orgApacheSlingTracerInternalLogTracerProperties'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingTracerInternalLogTracerProperties` (
  `tracerSets` long,
  `enabled` long,
  `servletEnabled` long,
  `recordingCacheSizeInMB` long,
  `recordingCacheDurationInSecs` long,
  `recordingCompressionEnabled` long,
  `gzipResponse` long
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingXssImplXSSFilterImplInfo` generated from model 'orgApacheSlingXssImplXSSFilterImplInfo'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingXssImplXSSFilterImplInfo` (
  `pid` text,
  `title` text,
  `description` text,
  `properties` long,
  `bundle_location` text,
  `service_location` text
); 


-- --------------------------------------------------------------------------
-- Table structure for table `orgApacheSlingXssImplXSSFilterImplProperties` generated from model 'orgApacheSlingXssImplXSSFilterImplProperties'
--

CREATE TABLE IF NOT EXISTS `orgApacheSlingXssImplXSSFilterImplProperties` (
  `policyPath` long
); 



--
-- Table structure for table `_db_version`
--
CREATE TABLE IF NOT EXISTS `_db_version` (
  `version`    LONG    DEFAULT 1
);
