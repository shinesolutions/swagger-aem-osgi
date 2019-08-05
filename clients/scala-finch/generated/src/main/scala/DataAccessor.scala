package org.openapitools

// TODO: properly handle custom imports
import java.io._
import java.util.UUID
import java.time._
import com.twitter.finagle.http.exp.Multipart.{FileUpload, InMemoryFileUpload, OnDiskFileUpload}

import org.openapitools.models._

trait DataAccessor {
    // TODO: apiInfo -> apis -> operations = TODO error
    private object TODO extends CommonError("Not implemented") {
        def message = "Not implemented"
    }

        /**
        * 
        * @return A AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationInfo
        */
        def Configmgr_adaptiveFormAndInteractiveCommunicationWebChannelConfiguration(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], showPlaceholder: Option[Boolean], maximumCacheEntries: Option[Int], afPeriodscriptingPeriodcompatversion: Option[String], makeFileNameUnique: Option[Boolean], generatingCompliantData: Option[Boolean]): Either[CommonError,AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationInfo] = Left(TODO)

        /**
        * 
        * @return A AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurInfo
        */
        def Configmgr_adaptiveFormAndInteractiveCommunicationWebChannelThemeConfigur(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], fontList: Seq[String]): Either[CommonError,AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurInfo] = Left(TODO)

        /**
        * 
        * @return A AnalyticsComponentQueryCacheServiceInfo
        */
        def Configmgr_analyticsComponentQueryCacheService(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], cqPeriodanalyticsPeriodcomponentPeriodqueryPeriodcachePeriodsize: Option[Int]): Either[CommonError,AnalyticsComponentQueryCacheServiceInfo] = Left(TODO)

        /**
        * 
        * @return A ApacheSlingHealthCheckResultHTMLSerializerInfo
        */
        def Configmgr_apacheSlingHealthCheckResultHTMLSerializer(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], styleString: Option[String]): Either[CommonError,ApacheSlingHealthCheckResultHTMLSerializerInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationInfo
        */
        def Configmgr_comAdobeAemFormsndocumentsConfigAEMFormsManagerConfiguration(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], formsManagerConfigPeriodincludeOOTBTemplates: Option[Boolean], formsManagerConfigPeriodincludeDeprecatedTemplates: Option[Boolean]): Either[CommonError,ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeAemTransactionCoreImplTransactionRecorderInfo
        */
        def Configmgr_comAdobeAemTransactionCoreImplTransactionRecorder(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], isTransactionRecordingEnabled: Option[Boolean]): Either[CommonError,ComAdobeAemTransactionCoreImplTransactionRecorderInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCInfo
        */
        def Configmgr_comAdobeAemUpgradePrechecksHcImplDeprecateIndexesHC(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], hcPeriodname: Option[String], hcPeriodtags: Seq[String], hcPeriodmbeanPeriodname: Option[String]): Either[CommonError,ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCInfo
        */
        def Configmgr_comAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHC(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], hcPeriodname: Option[String], hcPeriodtags: Seq[String], hcPeriodmbeanPeriodname: Option[String]): Either[CommonError,ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplInfo
        */
        def Configmgr_comAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImpl(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], preUpgradePeriodmaintenancePeriodtasks: Seq[String], preUpgradePeriodhcPeriodtags: Seq[String]): Either[CommonError,ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplInfo
        */
        def Configmgr_comAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImpl(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], rootPeriodpath: Option[String], fixPeriodinconsistencies: Option[Boolean]): Either[CommonError,ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeCqAccountApiAccountManagementServiceInfo
        */
        def Configmgr_comAdobeCqAccountApiAccountManagementService(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], cqPeriodaccountmanagerPeriodtokenPeriodvalidityPeriodperiod: Option[Int], cqPeriodaccountmanagerPeriodconfigPeriodrequestnewaccountPeriodmail: Option[String], cqPeriodaccountmanagerPeriodconfigPeriodrequestnewpwdPeriodmail: Option[String]): Either[CommonError,ComAdobeCqAccountApiAccountManagementServiceInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeCqAccountImplAccountManagementServletInfo
        */
        def Configmgr_comAdobeCqAccountImplAccountManagementServlet(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], cqPeriodaccountmanagerPeriodconfigPeriodinformnewaccountPeriodmail: Option[String], cqPeriodaccountmanagerPeriodconfigPeriodinformnewpwdPeriodmail: Option[String]): Either[CommonError,ComAdobeCqAccountImplAccountManagementServletInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeCqAddressImplLocationLocationListServletInfo
        */
        def Configmgr_comAdobeCqAddressImplLocationLocationListServlet(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], cqPeriodaddressPeriodlocationPerioddefaultPeriodmaxResults: Option[Int]): Either[CommonError,ComAdobeCqAddressImplLocationLocationListServletInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeCqAuditPurgeDamInfo
        */
        def Configmgr_comAdobeCqAuditPurgeDam(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], auditlogPeriodrulePeriodname: Option[String], auditlogPeriodrulePeriodcontentpath: Option[String], auditlogPeriodrulePeriodminimumage: Option[Int], auditlogPeriodrulePeriodtypes: Option[String]): Either[CommonError,ComAdobeCqAuditPurgeDamInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeCqAuditPurgePagesInfo
        */
        def Configmgr_comAdobeCqAuditPurgePages(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], auditlogPeriodrulePeriodname: Option[String], auditlogPeriodrulePeriodcontentpath: Option[String], auditlogPeriodrulePeriodminimumage: Option[Int], auditlogPeriodrulePeriodtypes: Option[String]): Either[CommonError,ComAdobeCqAuditPurgePagesInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeCqAuditPurgeReplicationInfo
        */
        def Configmgr_comAdobeCqAuditPurgeReplication(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], auditlogPeriodrulePeriodname: Option[String], auditlogPeriodrulePeriodcontentpath: Option[String], auditlogPeriodrulePeriodminimumage: Option[Int], auditlogPeriodrulePeriodtypes: Option[String]): Either[CommonError,ComAdobeCqAuditPurgeReplicationInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterInfo
        */
        def Configmgr_comAdobeCqCdnRewriterImplAWSCloudFrontRewriter(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], servicePeriodranking: Option[Int], keypairPeriodid: Option[String], keypairPeriodalias: Option[String], cdnrewriterPeriodattributes: Seq[String], cdnPeriodrewriterPerioddistributionPerioddomain: Option[String]): Either[CommonError,ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeCqCdnRewriterImplCDNConfigServiceImplInfo
        */
        def Configmgr_comAdobeCqCdnRewriterImplCDNConfigServiceImpl(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], cdnPeriodconfigPerioddistributionPerioddomain: Option[String], cdnPeriodconfigPeriodenablePeriodrewriting: Option[Boolean], cdnPeriodconfigPeriodpathPeriodprefixes: Seq[String], cdnPeriodconfigPeriodcdnttl: Option[Int], cdnPeriodconfigPeriodapplicationPeriodprotocol: Option[String]): Either[CommonError,ComAdobeCqCdnRewriterImplCDNConfigServiceImplInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeCqCdnRewriterImplCDNRewriterInfo
        */
        def Configmgr_comAdobeCqCdnRewriterImplCDNRewriter(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], servicePeriodranking: Option[Int], cdnrewriterPeriodattributes: Seq[String], cdnPeriodrewriterPerioddistributionPerioddomain: Option[String]): Either[CommonError,ComAdobeCqCdnRewriterImplCDNRewriterInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleInfo
        */
        def Configmgr_comAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandle(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], flushPeriodagents: Seq[String]): Either[CommonError,ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeCqCommerceImplAssetDynamicImageHandlerInfo
        */
        def Configmgr_comAdobeCqCommerceImplAssetDynamicImageHandler(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], cqPeriodcommercePeriodassetPeriodhandlerPeriodactive: Option[Boolean], cqPeriodcommercePeriodassetPeriodhandlerPeriodname: Option[String]): Either[CommonError,ComAdobeCqCommerceImplAssetDynamicImageHandlerInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplInfo
        */
        def Configmgr_comAdobeCqCommerceImplAssetProductAssetHandlerProviderImpl(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], cqPeriodcommercePeriodassetPeriodhandlerPeriodfallback: Option[String]): Either[CommonError,ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeCqCommerceImplAssetStaticImageHandlerInfo
        */
        def Configmgr_comAdobeCqCommerceImplAssetStaticImageHandler(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], cqPeriodcommercePeriodassetPeriodhandlerPeriodactive: Option[Boolean], cqPeriodcommercePeriodassetPeriodhandlerPeriodname: Option[String]): Either[CommonError,ComAdobeCqCommerceImplAssetStaticImageHandlerInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeCqCommerceImplAssetVideoHandlerInfo
        */
        def Configmgr_comAdobeCqCommerceImplAssetVideoHandler(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], cqPeriodcommercePeriodassetPeriodhandlerPeriodactive: Option[Boolean], cqPeriodcommercePeriodassetPeriodhandlerPeriodname: Option[String]): Either[CommonError,ComAdobeCqCommerceImplAssetVideoHandlerInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeCqCommerceImplPromotionPromotionManagerImplInfo
        */
        def Configmgr_comAdobeCqCommerceImplPromotionPromotionManagerImpl(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], cqPeriodcommercePeriodpromotionPeriodroot: Option[String]): Either[CommonError,ComAdobeCqCommerceImplPromotionPromotionManagerImplInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplInfo
        */
        def Configmgr_comAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImpl(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], cqPeriodcommercePeriodcataloggeneratorPeriodbucketsize: Option[Int], cqPeriodcommercePeriodcataloggeneratorPeriodbucketname: Option[String], cqPeriodcommercePeriodcataloggeneratorPeriodexcludedtemplateproperties: Seq[String]): Either[CommonError,ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeCqCommercePimImplPageEventListenerInfo
        */
        def Configmgr_comAdobeCqCommercePimImplPageEventListener(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], cqPeriodcommercePeriodpageeventlistenerPeriodenabled: Option[Boolean]): Either[CommonError,ComAdobeCqCommercePimImplPageEventListenerInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplInfo
        */
        def Configmgr_comAdobeCqCommercePimImplProductfeedProductFeedServiceImpl(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], feed generator algorithm: Option[String]): Either[CommonError,ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeCqContentinsightImplReportingServicesSettingsProviderInfo
        */
        def Configmgr_comAdobeCqContentinsightImplReportingServicesSettingsProvider(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], reportingservicesPeriodurl: Option[String]): Either[CommonError,ComAdobeCqContentinsightImplReportingServicesSettingsProviderInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletInfo
        */
        def Configmgr_comAdobeCqContentinsightImplServletsBrightEdgeProxyServlet(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], brightedgePeriodurl: Option[String]): Either[CommonError,ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeCqContentinsightImplServletsReportingServicesProxyServleInfo
        */
        def Configmgr_comAdobeCqContentinsightImplServletsReportingServicesProxyServle(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], reportingservicesPeriodproxyPeriodwhitelist: Seq[String]): Either[CommonError,ComAdobeCqContentinsightImplServletsReportingServicesProxyServleInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeCqDamCfmImplComponentComponentConfigImplInfo
        */
        def Configmgr_comAdobeCqDamCfmImplComponentComponentConfigImpl(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], damPeriodcfmPeriodcomponentPeriodresourceType: Option[String], damPeriodcfmPeriodcomponentPeriodfileReferenceProp: Option[String], damPeriodcfmPeriodcomponentPeriodelementsProp: Option[String], damPeriodcfmPeriodcomponentPeriodvariationProp: Option[String]): Either[CommonError,ComAdobeCqDamCfmImplComponentComponentConfigImplInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeCqDamCfmImplConfFeatureConfigImplInfo
        */
        def Configmgr_comAdobeCqDamCfmImplConfFeatureConfigImpl(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], damPeriodcfmPeriodresourceTypes: Seq[String], damPeriodcfmPeriodreferenceProperties: Seq[String]): Either[CommonError,ComAdobeCqDamCfmImplConfFeatureConfigImplInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeCqDamCfmImplContentRewriterAssetProcessorInfo
        */
        def Configmgr_comAdobeCqDamCfmImplContentRewriterAssetProcessor(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], pipelinePeriodtype: Option[String]): Either[CommonError,ComAdobeCqDamCfmImplContentRewriterAssetProcessorInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeCqDamCfmImplContentRewriterParRangeFilterInfo
        */
        def Configmgr_comAdobeCqDamCfmImplContentRewriterParRangeFilter(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], pipelinePeriodtype: Option[String]): Either[CommonError,ComAdobeCqDamCfmImplContentRewriterParRangeFilterInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeCqDamCfmImplContentRewriterPayloadFilterInfo
        */
        def Configmgr_comAdobeCqDamCfmImplContentRewriterPayloadFilter(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], pipelinePeriodtype: Option[String]): Either[CommonError,ComAdobeCqDamCfmImplContentRewriterPayloadFilterInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeCqDamDmProcessImagePTiffManagerImplInfo
        */
        def Configmgr_comAdobeCqDamDmProcessImagePTiffManagerImpl(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], maxMemory: Option[Int]): Either[CommonError,ComAdobeCqDamDmProcessImagePTiffManagerImplInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerInfo
        */
        def Configmgr_comAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorker(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], dmreplicateonmodifyPeriodenabled: Option[Boolean], dmreplicateonmodifyPeriodforcesyncdeletes: Option[Boolean]): Either[CommonError,ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeCqDamMacSyncHelperImplMACSyncClientImplInfo
        */
        def Configmgr_comAdobeCqDamMacSyncHelperImplMACSyncClientImpl(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], comPeriodadobePerioddamPeriodmacPeriodsyncPeriodclientPeriodsoPeriodtimeout: Option[Int]): Either[CommonError,ComAdobeCqDamMacSyncHelperImplMACSyncClientImplInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeCqDamMacSyncImplDAMSyncServiceImplInfo
        */
        def Configmgr_comAdobeCqDamMacSyncImplDAMSyncServiceImpl(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], comPeriodadobePeriodcqPerioddamPeriodmacPeriodsyncPerioddamsyncservicePeriodregisteredPaths: Seq[String], comPeriodadobePeriodcqPerioddamPeriodmacPeriodsyncPerioddamsyncservicePeriodsyncPeriodrenditions: Option[Boolean], comPeriodadobePeriodcqPerioddamPeriodmacPeriodsyncPerioddamsyncservicePeriodreplicatePeriodthreadPeriodwaitPeriodms: Option[Int], comPeriodadobePeriodcqPerioddamPeriodmacPeriodsyncPerioddamsyncservicePeriodplatform: Option[String]): Either[CommonError,ComAdobeCqDamMacSyncImplDAMSyncServiceImplInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeCqDamProcessorNuiImplNuiAssetProcessorInfo
        */
        def Configmgr_comAdobeCqDamProcessorNuiImplNuiAssetProcessor(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], nuiEnabled: Option[Boolean], nuiServiceUrl: Option[String], nuiApiKey: Option[String]): Either[CommonError,ComAdobeCqDamProcessorNuiImplNuiAssetProcessorInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeCqDamS7imagingImplIsImageServerComponentInfo
        */
        def Configmgr_comAdobeCqDamS7imagingImplIsImageServerComponent(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], tcpPort: Option[String], allowRemoteAccess: Option[Boolean], maxRenderRgnPixels: Option[String], maxMessageSize: Option[String], randomAccessUrlTimeout: Option[Int], workerThreads: Option[Int]): Either[CommonError,ComAdobeCqDamS7imagingImplIsImageServerComponentInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeCqDamS7imagingImplPsPlatformServerServletInfo
        */
        def Configmgr_comAdobeCqDamS7imagingImplPsPlatformServerServlet(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], cachePeriodenable: Option[Boolean], cachePeriodrootPaths: Seq[String], cachePeriodmaxSize: Option[Int], cachePeriodmaxEntries: Option[Int]): Either[CommonError,ComAdobeCqDamS7imagingImplPsPlatformServerServletInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeCqDamWebdavImplIoAssetIOHandlerInfo
        */
        def Configmgr_comAdobeCqDamWebdavImplIoAssetIOHandler(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], servicePeriodranking: Option[Int], pathPrefix: Option[String], createVersion: Option[Boolean]): Either[CommonError,ComAdobeCqDamWebdavImplIoAssetIOHandlerInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobInfo
        */
        def Configmgr_comAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJob(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], cqPerioddamPeriodwebdavPeriodversionPeriodlinkingPeriodenable: Option[Boolean], cqPerioddamPeriodwebdavPeriodversionPeriodlinkingPeriodschedulerPeriodperiod: Option[Int], cqPerioddamPeriodwebdavPeriodversionPeriodlinkingPeriodstagingPeriodtimeout: Option[Int]): Either[CommonError,ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeCqDamWebdavImplIoSpecialFilesHandlerInfo
        */
        def Configmgr_comAdobeCqDamWebdavImplIoSpecialFilesHandler(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], comPerioddayPeriodcqPerioddamPeriodcorePeriodimplPeriodioPeriodSpecialFilesHandlerPeriodfilepatters: Seq[String]): Either[CommonError,ComAdobeCqDamWebdavImplIoSpecialFilesHandlerInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeCqDeserfwImplDeserializationFirewallImplInfo
        */
        def Configmgr_comAdobeCqDeserfwImplDeserializationFirewallImpl(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], firewallPerioddeserializationPeriodwhitelist: Seq[String], firewallPerioddeserializationPeriodblacklist: Seq[String], firewallPerioddeserializationPerioddiagnostics: Option[String]): Either[CommonError,ComAdobeCqDeserfwImplDeserializationFirewallImplInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeCqDtmImplServiceDTMWebServiceImplInfo
        */
        def Configmgr_comAdobeCqDtmImplServiceDTMWebServiceImpl(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], connectionPeriodtimeout: Option[Int], socketPeriodtimeout: Option[Int]): Either[CommonError,ComAdobeCqDtmImplServiceDTMWebServiceImplInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeCqDtmImplServletsDTMDeployHookServletInfo
        */
        def Configmgr_comAdobeCqDtmImplServletsDTMDeployHookServlet(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], dtmPeriodstagingPeriodipPeriodwhitelist: Seq[String], dtmPeriodproductionPeriodipPeriodwhitelist: Seq[String]): Either[CommonError,ComAdobeCqDtmImplServletsDTMDeployHookServletInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeCqDtmReactorImplServiceWebServiceImplInfo
        */
        def Configmgr_comAdobeCqDtmReactorImplServiceWebServiceImpl(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], endpointUri: Option[String], connectionTimeout: Option[Int], socketTimeout: Option[Int]): Either[CommonError,ComAdobeCqDtmReactorImplServiceWebServiceImplInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeCqExperiencelogImplExperienceLogConfigServletInfo
        */
        def Configmgr_comAdobeCqExperiencelogImplExperienceLogConfigServlet(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], enabled: Option[Boolean], disabledForGroups: Seq[String]): Either[CommonError,ComAdobeCqExperiencelogImplExperienceLogConfigServletInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeCqHcContentPackagesHealthCheckInfo
        */
        def Configmgr_comAdobeCqHcContentPackagesHealthCheck(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], hcPeriodname: Option[String], hcPeriodtags: Seq[String], hcPeriodmbeanPeriodname: Option[String], packagePeriodnames: Seq[String]): Either[CommonError,ComAdobeCqHcContentPackagesHealthCheckInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeCqHistoryImplHistoryRequestFilterInfo
        */
        def Configmgr_comAdobeCqHistoryImplHistoryRequestFilter(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], historyPeriodrequestFilterPeriodexcludedSelectors: Seq[String], historyPeriodrequestFilterPeriodexcludedExtensions: Seq[String]): Either[CommonError,ComAdobeCqHistoryImplHistoryRequestFilterInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeCqHistoryImplHistoryServiceImplInfo
        */
        def Configmgr_comAdobeCqHistoryImplHistoryServiceImpl(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], historyPeriodservicePeriodresourceTypes: Seq[String], historyPeriodservicePeriodpathFilter: Seq[String]): Either[CommonError,ComAdobeCqHistoryImplHistoryServiceImplInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeCqInboxImplTypeproviderItemTypeProviderInfo
        */
        def Configmgr_comAdobeCqInboxImplTypeproviderItemTypeProvider(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], inboxPeriodimplPeriodtypeproviderPeriodregistrypaths: Seq[String], inboxPeriodimplPeriodtypeproviderPeriodlegacypaths: Seq[String], inboxPeriodimplPeriodtypeproviderPerioddefaulturlPeriodfailureitem: Option[String], inboxPeriodimplPeriodtypeproviderPerioddefaulturlPeriodworkitem: Option[String], inboxPeriodimplPeriodtypeproviderPerioddefaulturlPeriodtask: Option[String]): Either[CommonError,ComAdobeCqInboxImplTypeproviderItemTypeProviderInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeCqProjectsImplServletProjectImageServletInfo
        */
        def Configmgr_comAdobeCqProjectsImplServletProjectImageServlet(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], imagePeriodquality: Option[String], imagePeriodsupportedPeriodresolutions: Option[String]): Either[CommonError,ComAdobeCqProjectsImplServletProjectImageServletInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeCqProjectsPurgeSchedulerInfo
        */
        def Configmgr_comAdobeCqProjectsPurgeScheduler(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], scheduledpurgePeriodname: Option[String], scheduledpurgePeriodpurgeActive: Option[Boolean], scheduledpurgePeriodtemplates: Seq[String], scheduledpurgePeriodpurgeGroups: Option[Boolean], scheduledpurgePeriodpurgeAssets: Option[Boolean], scheduledpurgePeriodterminateRunningWorkflows: Option[Boolean], scheduledpurgePerioddaysold: Option[Int], scheduledpurgePeriodsaveThreshold: Option[Int]): Either[CommonError,ComAdobeCqProjectsPurgeSchedulerInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeCqScheduledExporterImplScheduledExporterImplInfo
        */
        def Configmgr_comAdobeCqScheduledExporterImplScheduledExporterImpl(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], includePeriodpaths: Seq[String], exporterPerioduser: Option[String]): Either[CommonError,ComAdobeCqScheduledExporterImplScheduledExporterImplInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplInfo
        */
        def Configmgr_comAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImpl(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], comPeriodadobePeriodcqPeriodscreensPeriodanalyticsPeriodimplPeriodurl: Option[String], comPeriodadobePeriodcqPeriodscreensPeriodanalyticsPeriodimplPeriodapikey: Option[String], comPeriodadobePeriodcqPeriodscreensPeriodanalyticsPeriodimplPeriodproject: Option[String], comPeriodadobePeriodcqPeriodscreensPeriodanalyticsPeriodimplPeriodenvironment: Option[String], comPeriodadobePeriodcqPeriodscreensPeriodanalyticsPeriodimplPeriodsendFrequency: Option[Int]): Either[CommonError,ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeCqScreensDeviceImplDeviceServiceInfo
        */
        def Configmgr_comAdobeCqScreensDeviceImplDeviceService(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], comPeriodadobePeriodaemPeriodscreensPeriodplayerPeriodpingfrequency: Option[Int], comPeriodadobePeriodaemPeriodscreensPerioddevicePeriodpaswordPeriodspecialchars: Option[String], comPeriodadobePeriodaemPeriodscreensPerioddevicePeriodpaswordPeriodminlowercasechars: Option[Int], comPeriodadobePeriodaemPeriodscreensPerioddevicePeriodpaswordPeriodminuppercasechars: Option[Int], comPeriodadobePeriodaemPeriodscreensPerioddevicePeriodpaswordPeriodminnumberchars: Option[Int], comPeriodadobePeriodaemPeriodscreensPerioddevicePeriodpaswordPeriodminspecialchars: Option[Int], comPeriodadobePeriodaemPeriodscreensPerioddevicePeriodpaswordPeriodminlength: Option[Int]): Either[CommonError,ComAdobeCqScreensDeviceImplDeviceServiceInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplInfo
        */
        def Configmgr_comAdobeCqScreensDeviceRegistrationImplRegistrationServiceImpl(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], deviceRegistrationTimeout: Option[Int]): Either[CommonError,ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeCqScreensImplHandlerChannelsUpdateHandlerInfo
        */
        def Configmgr_comAdobeCqScreensImplHandlerChannelsUpdateHandler(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], cqPeriodpagesupdatehandlerPeriodimageresourcetypes: Seq[String], cqPeriodpagesupdatehandlerPeriodproductresourcetypes: Seq[String], cqPeriodpagesupdatehandlerPeriodvideoresourcetypes: Seq[String], cqPeriodpagesupdatehandlerPerioddynamicsequenceresourcetypes: Seq[String], cqPeriodpagesupdatehandlerPeriodpreviewmodepaths: Seq[String]): Either[CommonError,ComAdobeCqScreensImplHandlerChannelsUpdateHandlerInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobInfo
        */
        def Configmgr_comAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJob(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], schedulerPeriodexpression: Option[String]): Either[CommonError,ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplInfo
        */
        def Configmgr_comAdobeCqScreensImplRemoteImplDistributedHttpClientImpl(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], comPeriodadobePeriodaemPeriodscreensPeriodimplPeriodremotePeriodrequestTimeout: Option[Int]): Either[CommonError,ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeCqScreensImplScreensChannelPostProcessorInfo
        */
        def Configmgr_comAdobeCqScreensImplScreensChannelPostProcessor(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], screensPeriodchannelsPeriodpropertiesPeriodtoPeriodremove: Seq[String]): Either[CommonError,ComAdobeCqScreensImplScreensChannelPostProcessorInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplInfo
        */
        def Configmgr_comAdobeCqScreensMonitoringImplScreensMonitoringServiceImpl(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], comPeriodadobePeriodcqPeriodscreensPeriodmonitoringPeriodimplPeriodScreensMonitoringServiceImplPeriodprojectPath: Seq[String], comPeriodadobePeriodcqPeriodscreensPeriodmonitoringPeriodimplPeriodScreensMonitoringServiceImplPeriodscheduleFrequency: Option[String], comPeriodadobePeriodcqPeriodscreensPeriodmonitoringPeriodimplPeriodScreensMonitoringServiceImplPeriodpingTimeout: Option[Int], comPeriodadobePeriodcqPeriodscreensPeriodmonitoringPeriodimplPeriodScreensMonitoringServiceImplPeriodrecipients: Option[String], comPeriodadobePeriodcqPeriodscreensPeriodmonitoringPeriodimplPeriodScreensMonitoringServiceImplPeriodsmtpserver: Option[String], comPeriodadobePeriodcqPeriodscreensPeriodmonitoringPeriodimplPeriodScreensMonitoringServiceImplPeriodsmtpport: Option[Int], comPeriodadobePeriodcqPeriodscreensPeriodmonitoringPeriodimplPeriodScreensMonitoringServiceImplPeriodusetls: Option[Boolean], comPeriodadobePeriodcqPeriodscreensPeriodmonitoringPeriodimplPeriodScreensMonitoringServiceImplPeriodusername: Option[String], comPeriodadobePeriodcqPeriodscreensPeriodmonitoringPeriodimplPeriodScreensMonitoringServiceImplPeriodpassword: Option[String]): Either[CommonError,ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeCqScreensMqActivemqImplArtemisJMSProviderInfo
        */
        def Configmgr_comAdobeCqScreensMqActivemqImplArtemisJMSProvider(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], servicePeriodranking: Option[Int], globalPeriodsize: Option[Int], maxPerioddiskPeriodusage: Option[Int], persistencePeriodenabled: Option[Boolean], threadPeriodpoolPeriodmaxPeriodsize: Option[Int], scheduledPeriodthreadPeriodpoolPeriodmaxPeriodsize: Option[Int], gracefulPeriodshutdownPeriodtimeout: Option[Int], queues: Seq[String], topics: Seq[String], addressesPeriodmaxPerioddeliveryPeriodattempts: Option[Int], addressesPeriodexpiryPerioddelay: Option[Int], addressesPeriodaddressPeriodfullPeriodmessagePeriodpolicy: Option[String], addressesPeriodmaxPeriodsizePeriodbytes: Option[Int], addressesPeriodpagePeriodsizePeriodbytes: Option[Int], addressesPeriodpagePeriodcachePeriodmaxPeriodsize: Option[Int], clusterPerioduser: Option[String], clusterPeriodpassword: Option[String], clusterPeriodcallPeriodtimeout: Option[Int], clusterPeriodcallPeriodfailoverPeriodtimeout: Option[Int], clusterPeriodclientPeriodfailurePeriodcheckPeriodperiod: Option[Int], clusterPeriodnotificationPeriodattempts: Option[Int], clusterPeriodnotificationPeriodinterval: Option[Int], idPeriodcachePeriodsize: Option[Int], clusterPeriodconfirmationPeriodwindowPeriodsize: Option[Int], clusterPeriodconnectionPeriodttl: Option[Int], clusterPeriodduplicatePerioddetection: Option[Boolean], clusterPeriodinitialPeriodconnectPeriodattempts: Option[Int], clusterPeriodmaxPeriodretryPeriodinterval: Option[Int], clusterPeriodminPeriodlargePeriodmessagePeriodsize: Option[Int], clusterPeriodproducerPeriodwindowPeriodsize: Option[Int], clusterPeriodreconnectPeriodattempts: Option[Int], clusterPeriodretryPeriodinterval: Option[Int], clusterPeriodretryPeriodintervalPeriodmultiplier: Option[BigDecimal]): Either[CommonError,ComAdobeCqScreensMqActivemqImplArtemisJMSProviderInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplInfo
        */
        def Configmgr_comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImpl(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], comPeriodadobePeriodcqPeriodscreensPeriodofflinecontentPeriodimplPeriodBulkOfflineUpdateServiceImplPeriodprojectPath: Seq[String], comPeriodadobePeriodcqPeriodscreensPeriodofflinecontentPeriodimplPeriodBulkOfflineUpdateServiceImplPeriodscheduleFrequency: Option[String]): Either[CommonError,ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplInfo
        */
        def Configmgr_comAdobeCqScreensOfflinecontentImplOfflineContentServiceImpl(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], disableSmartSync: Option[Boolean]): Either[CommonError,ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagInfo
        */
        def Configmgr_comAdobeCqScreensSegmentationImplSegmentationFeatureFlag(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], enableDataTriggeredContent: Option[Boolean]): Either[CommonError,ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChInfo
        */
        def Configmgr_comAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthCh(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], hcPeriodtags: Seq[String]): Either[CommonError,ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckInfo
        */
        def Configmgr_comAdobeCqSecurityHcBundlesImplWcmFilterHealthCheck(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], hcPeriodtags: Seq[String]): Either[CommonError,ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckInfo
        */
        def Configmgr_comAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheck(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], hcPeriodtags: Seq[String], dispatcherPeriodaddress: Option[String], dispatcherPeriodfilterPeriodallowed: Seq[String], dispatcherPeriodfilterPeriodblocked: Seq[String]): Either[CommonError,ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckInfo
        */
        def Configmgr_comAdobeCqSecurityHcPackagesImplExampleContentHealthCheck(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], hcPeriodtags: Seq[String]): Either[CommonError,ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckInfo
        */
        def Configmgr_comAdobeCqSecurityHcWebserverImplClickjackingHealthCheck(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], hcPeriodtags: Seq[String], webserverPeriodaddress: Option[String]): Either[CommonError,ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeCqSocialAccountverificationImplAccountManagementConfigImInfo
        */
        def Configmgr_comAdobeCqSocialAccountverificationImplAccountManagementConfigIm(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], enable: Option[Boolean], ttl1: Option[Int], ttl2: Option[Int]): Either[CommonError,ComAdobeCqSocialAccountverificationImplAccountManagementConfigImInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenInfo
        */
        def Configmgr_comAdobeCqSocialActivitystreamsClientImplSocialActivityComponen(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], priority: Option[Int]): Either[CommonError,ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoInfo
        */
        def Configmgr_comAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCo(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], priority: Option[Int]): Either[CommonError,ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerInfo
        */
        def Configmgr_comAdobeCqSocialActivitystreamsListenerImplEventListenerHandler(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], eventPeriodtopics: Option[String], eventPeriodfilter: Option[String]): Either[CommonError,ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenInfo
        */
        def Configmgr_comAdobeCqSocialActivitystreamsListenerImplModerationEventExten(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], accepted: Option[Boolean], ranked: Option[Int]): Either[CommonError,ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySInfo
        */
        def Configmgr_comAdobeCqSocialActivitystreamsListenerImplRatingEventActivityS(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], ranking: Option[Int], enable: Option[Boolean]): Either[CommonError,ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreInfo
        */
        def Configmgr_comAdobeCqSocialActivitystreamsListenerImplResourceActivityStre(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], streamPath: Option[String], streamName: Option[String]): Either[CommonError,ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIInfo
        */
        def Configmgr_comAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsI(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], maxRetry: Option[Int], fieldWhitelist: Seq[String], attachmentTypeBlacklist: Seq[String]): Either[CommonError,ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenInfo
        */
        def Configmgr_comAdobeCqSocialCalendarClientOperationextensionsEventAttachmen(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], attachmentTypeBlacklist: Option[String], extensionPeriodorder: Option[Int]): Either[CommonError,ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeCqSocialCalendarServletsTimeZoneServletInfo
        */
        def Configmgr_comAdobeCqSocialCalendarServletsTimeZoneServlet(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], timezonesPeriodexpirytime: Option[Int]): Either[CommonError,ComAdobeCqSocialCalendarServletsTimeZoneServletInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventInfo
        */
        def Configmgr_comAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEvent(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], ranking: Option[Int]): Either[CommonError,ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSeInfo
        */
        def Configmgr_comAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSe(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], fieldWhitelist: Seq[String], attachmentTypeBlacklist: Seq[String]): Either[CommonError,ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSeInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiInfo
        */
        def Configmgr_comAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperati(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], fieldWhitelist: Seq[String], attachmentTypeBlacklist: Seq[String]): Either[CommonError,ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCInfo
        */
        def Configmgr_comAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialC(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], numUserLimit: Option[Int]): Either[CommonError,ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosInfo
        */
        def Configmgr_comAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPos(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], enableScheduledPostsSearch: Option[Boolean], numberOfMinutes: Option[Int], maxSearchLimit: Option[Int]): Either[CommonError,ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterInfo
        */
        def Configmgr_comAdobeCqSocialCommonsCorsCORSAuthenticationFilter(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], corsPeriodenabling: Option[Boolean]): Either[CommonError,ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderInfo
        */
        def Configmgr_comAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProvider(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], priorityOrder: Option[Int], replyEmailPatterns: Seq[String]): Either[CommonError,ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplInfo
        */
        def Configmgr_comAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImpl(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], contextPeriodpath: Option[String]): Either[CommonError,ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerInfo
        */
        def Configmgr_comAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListener(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], eventPeriodtopics: Option[String]): Either[CommonError,ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeCqSocialCommonsEmailreplyImplCustomEmailClientProviderInfo
        */
        def Configmgr_comAdobeCqSocialCommonsEmailreplyImplCustomEmailClientProvider(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], priorityOrder: Option[Int], replyEmailPatterns: Seq[String]): Either[CommonError,ComAdobeCqSocialCommonsEmailreplyImplCustomEmailClientProviderInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpInfo
        */
        def Configmgr_comAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImp(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], patternPeriodtime: Option[String], patternPeriodnewline: Option[String], patternPerioddayOfMonth: Option[String], patternPeriodmonth: Option[String], patternPeriodyear: Option[String], patternPerioddate: Option[String], patternPerioddateTime: Option[String], patternPeriodemail: Option[String]): Either[CommonError,ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpInfo
        */
        def Configmgr_comAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImp(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], emailPeriodname: Option[String], emailPeriodcreatePostFromReply: Option[Boolean], emailPeriodaddCommentIdTo: Option[String], emailPeriodsubjectMaximumLength: Option[Int], emailPeriodreplyToAddress: Option[String], emailPeriodreplyToDelimiter: Option[String], emailPeriodtrackerIdPrefixInSubject: Option[String], emailPeriodtrackerIdPrefixInBody: Option[String], emailPeriodasHTML: Option[Boolean], emailPerioddefaultUserName: Option[String], emailPeriodtemplatesPeriodrootPath: Option[String]): Either[CommonError,ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterInfo
        */
        def Configmgr_comAdobeCqSocialCommonsEmailreplyImplEmailReplyImporter(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], connectProtocol: Option[String]): Either[CommonError,ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeCqSocialCommonsEmailreplyImplGmailEmailClientProviderInfo
        */
        def Configmgr_comAdobeCqSocialCommonsEmailreplyImplGmailEmailClientProvider(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], priorityOrder: Option[Int], replyEmailPatterns: Seq[String]): Either[CommonError,ComAdobeCqSocialCommonsEmailreplyImplGmailEmailClientProviderInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderInfo
        */
        def Configmgr_comAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProvider(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], priorityOrder: Option[Int], replyEmailPatterns: Seq[String]): Either[CommonError,ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProviderInfo
        */
        def Configmgr_comAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProvider(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], priorityOrder: Option[Int], replyEmailPatterns: Seq[String]): Either[CommonError,ComAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProviderInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeCqSocialCommonsEmailreplyImplOutLookEmailClientProviderInfo
        */
        def Configmgr_comAdobeCqSocialCommonsEmailreplyImplOutLookEmailClientProvider(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], priorityOrder: Option[Int], replyEmailPatterns: Seq[String]): Either[CommonError,ComAdobeCqSocialCommonsEmailreplyImplOutLookEmailClientProviderInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderInfo
        */
        def Configmgr_comAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProvider(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], replyEmailPatterns: Seq[String], priorityOrder: Option[Int]): Either[CommonError,ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderInfo
        */
        def Configmgr_comAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProvider(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], priorityOrder: Option[Int], replyEmailPatterns: Seq[String]): Either[CommonError,ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadInfo
        */
        def Configmgr_comAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUpload(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], numberOfDays: Option[Int], ageOfFile: Option[Int]): Either[CommonError,ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplInfo
        */
        def Configmgr_comAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImpl(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], eventPeriodtopics: Option[String], eventPeriodfilter: Option[String], verbs: Seq[String]): Either[CommonError,ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitInfo
        */
        def Configmgr_comAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimit(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], enable: Option[Boolean], uGCLimit: Option[Int], ugcLimitDuration: Option[Int], domains: Seq[String], toList: Seq[String]): Either[CommonError,ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeCqSocialConnectOauthImplFacebookProviderImplInfo
        */
        def Configmgr_comAdobeCqSocialConnectOauthImplFacebookProviderImpl(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], oauthPeriodproviderPeriodid: Option[String], oauthPeriodcloudPeriodconfigPeriodroot: Option[String], providerPeriodconfigPeriodroot: Option[String], providerPeriodconfigPeriodcreatePeriodtagsPeriodenabled: Option[Boolean], providerPeriodconfigPerioduserPeriodfolder: Option[String], providerPeriodconfigPeriodfacebookPeriodfetchPeriodfields: Option[Boolean], providerPeriodconfigPeriodfacebookPeriodfields: Seq[String], providerPeriodconfigPeriodrefreshPerioduserdataPeriodenabled: Option[Boolean]): Either[CommonError,ComAdobeCqSocialConnectOauthImplFacebookProviderImplInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleInfo
        */
        def Configmgr_comAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandle(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], path: Seq[String], servicePeriodranking: Option[Int]): Either[CommonError,ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperInfo
        */
        def Configmgr_comAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapper(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], facebook: Seq[String], twitter: Seq[String], providerPeriodconfigPerioduserPeriodfolder: Option[String]): Either[CommonError,ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeCqSocialConnectOauthImplTwitterProviderImplInfo
        */
        def Configmgr_comAdobeCqSocialConnectOauthImplTwitterProviderImpl(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], oauthPeriodproviderPeriodid: Option[String], oauthPeriodcloudPeriodconfigPeriodroot: Option[String], providerPeriodconfigPeriodroot: Option[String], providerPeriodconfigPerioduserPeriodfolder: Option[String], providerPeriodconfigPeriodtwitterPeriodenablePeriodparams: Option[Boolean], providerPeriodconfigPeriodtwitterPeriodparams: Seq[String], providerPeriodconfigPeriodrefreshPerioduserdataPeriodenabled: Option[Boolean]): Either[CommonError,ComAdobeCqSocialConnectOauthImplTwitterProviderImplInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenInfo
        */
        def Configmgr_comAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmen(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], cqPeriodsocialPeriodcontentPeriodfragmentsPeriodservicesPeriodenabled: Option[Boolean], cqPeriodsocialPeriodcontentPeriodfragmentsPeriodservicesPeriodwaitTimeSeconds: Option[Int]): Either[CommonError,ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryInfo
        */
        def Configmgr_comAdobeCqSocialDatastoreAsImplASResourceProviderFactory(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], versionPeriodid: Option[String], cachePeriodon: Option[Boolean], concurrencyPeriodlevel: Option[Int], cachePeriodstartPeriodsize: Option[Int], cachePeriodttl: Option[Int], cachePeriodsize: Option[Int], timePeriodlimit: Option[Int]): Either[CommonError,ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryInfo
        */
        def Configmgr_comAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactory(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], solrPeriodzkPeriodtimeout: Option[String], solrPeriodcommit: Option[String], cachePeriodon: Option[Boolean], concurrencyPeriodlevel: Option[Int], cachePeriodstartPeriodsize: Option[Int], cachePeriodttl: Option[Int], cachePeriodsize: Option[Int]): Either[CommonError,ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorInfo
        */
        def Configmgr_comAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactor(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], solrPeriodzkPeriodtimeout: Option[String], solrPeriodcommit: Option[String], cachePeriodon: Option[Boolean], concurrencyPeriodlevel: Option[Int], cachePeriodstartPeriodsize: Option[Int], cachePeriodttl: Option[Int], cachePeriodsize: Option[Int]): Either[CommonError,ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFInfo
        */
        def Configmgr_comAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorF(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], isMemberCheck: Option[Boolean]): Either[CommonError,ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoInfo
        */
        def Configmgr_comAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFacto(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], isMemberCheck: Option[Boolean]): Either[CommonError,ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLInfo
        */
        def Configmgr_comAdobeCqSocialEnablementLearningpathEndpointsImplEnablementL(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], fieldWhitelist: Seq[String]): Either[CommonError,ComAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResouInfo
        */
        def Configmgr_comAdobeCqSocialEnablementResourceEndpointsImplEnablementResou(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], fieldWhitelist: Seq[String]): Either[CommonError,ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResouInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplInfo
        */
        def Configmgr_comAdobeCqSocialEnablementServicesImplAuthorMarkerImpl(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], servicePeriodranking: Option[Int]): Either[CommonError,ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGeInfo
        */
        def Configmgr_comAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGe(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], slingPeriodservletPeriodselectors: Option[String], slingPeriodservletPeriodextensions: Option[String]): Either[CommonError,ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGeInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaInfo
        */
        def Configmgr_comAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOpera(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], fieldWhitelist: Seq[String], attachmentTypeBlacklist: Seq[String]): Either[CommonError,ComAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeCqSocialForumClientEndpointsImplForumOperationsServiceInfo
        */
        def Configmgr_comAdobeCqSocialForumClientEndpointsImplForumOperationsService(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], fieldWhitelist: Seq[String], attachmentTypeBlacklist: Seq[String]): Either[CommonError,ComAdobeCqSocialForumClientEndpointsImplForumOperationsServiceInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeCqSocialForumDispatcherImplFlushOperationsInfo
        */
        def Configmgr_comAdobeCqSocialForumDispatcherImplFlushOperations(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], extensionPeriodorder: Option[Int], flushPeriodforumontopic: Option[Boolean]): Either[CommonError,ComAdobeCqSocialForumDispatcherImplFlushOperationsInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenInfo
        */
        def Configmgr_comAdobeCqSocialGroupClientImplCommunityGroupCollectionComponen(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], groupPeriodlistingPeriodpaginationPeriodenable: Option[Boolean], groupPeriodlistingPeriodlazyloadingPeriodenable: Option[Boolean], pagePeriodsize: Option[Int], priority: Option[Int]): Either[CommonError,ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeCqSocialGroupImplGroupServiceImplInfo
        */
        def Configmgr_comAdobeCqSocialGroupImplGroupServiceImpl(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], maxWaitTime: Option[Int], minWaitBetweenRetries: Option[Int]): Either[CommonError,ComAdobeCqSocialGroupImplGroupServiceImplInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplInfo
        */
        def Configmgr_comAdobeCqSocialHandlebarsGuavaTemplateCacheImpl(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], parameterPeriodguavaPeriodcachePeriodenabled: Option[Boolean], parameterPeriodguavaPeriodcachePeriodparams: Option[String], parameterPeriodguavaPeriodcachePeriodreload: Option[Boolean], servicePeriodranking: Option[Int]): Either[CommonError,ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSInfo
        */
        def Configmgr_comAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsS(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], fieldWhitelist: Seq[String], attachmentTypeBlacklist: Seq[String]): Either[CommonError,ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerInfo
        */
        def Configmgr_comAdobeCqSocialJournalClientEndpointsImplJournalOperationsSer(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], fieldWhitelist: Seq[String], attachmentTypeBlacklist: Seq[String]): Either[CommonError,ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileInfo
        */
        def Configmgr_comAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfile(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], fieldWhitelist: Seq[String]): Either[CommonError,ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOInfo
        */
        def Configmgr_comAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileO(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], fieldWhitelist: Seq[String]): Either[CommonError,ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFInfo
        */
        def Configmgr_comAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentF(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], everyoneLimit: Option[Int], priority: Option[Int]): Either[CommonError,ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationInfo
        */
        def Configmgr_comAdobeCqSocialMessagingClientEndpointsImplMessagingOperation(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], messagePeriodproperties: Seq[String], messageBoxSizeLimit: Option[Int], messageCountLimit: Option[Int], notifyFailure: Option[Boolean], failureMessageFrom: Option[String], failureTemplatePath: Option[String], maxRetries: Option[Int], minWaitBetweenRetries: Option[Int], countUpdatePoolSize: Option[Int], inboxPeriodpath: Option[String], sentitemsPeriodpath: Option[String], supportAttachments: Option[Boolean], supportGroupMessaging: Option[Boolean], maxTotalRecipients: Option[Int], batchSize: Option[Int], maxTotalAttachmentSize: Option[Int], attachmentTypeBlacklist: Seq[String], allowedAttachmentTypes: Seq[String], serviceSelector: Option[String], fieldWhitelist: Seq[String]): Either[CommonError,ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenInfo
        */
        def Configmgr_comAdobeCqSocialModerationDashboardApiFilterGroupSocialComponen(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], resourceTypePeriodfilters: Seq[String], priority: Option[Int]): Either[CommonError,ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialInfo
        */
        def Configmgr_comAdobeCqSocialModerationDashboardApiModerationDashboardSocial(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], priority: Option[Int]): Either[CommonError,ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenInfo
        */
        def Configmgr_comAdobeCqSocialModerationDashboardApiUserDetailsSocialComponen(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], priority: Option[Int]): Either[CommonError,ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociInfo
        */
        def Configmgr_comAdobeCqSocialModerationDashboardInternalImplFilterGroupSoci(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], resourceTypePeriodfilters: Seq[String], priority: Option[Int]): Either[CommonError,ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeCqSocialNotificationsImplMentionsRouterInfo
        */
        def Configmgr_comAdobeCqSocialNotificationsImplMentionsRouter(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], eventPeriodtopics: Option[String], eventPeriodfilter: Option[String]): Either[CommonError,ComAdobeCqSocialNotificationsImplMentionsRouterInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeCqSocialNotificationsImplNotificationManagerImplInfo
        */
        def Configmgr_comAdobeCqSocialNotificationsImplNotificationManagerImpl(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], maxPeriodunreadPeriodnotificationPeriodcount: Option[Int]): Either[CommonError,ComAdobeCqSocialNotificationsImplNotificationManagerImplInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeCqSocialNotificationsImplNotificationsRouterInfo
        */
        def Configmgr_comAdobeCqSocialNotificationsImplNotificationsRouter(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], eventPeriodtopics: Option[String], eventPeriodfilter: Option[String]): Either[CommonError,ComAdobeCqSocialNotificationsImplNotificationsRouterInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicInfo
        */
        def Configmgr_comAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServic(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], fieldWhitelist: Seq[String], attachmentTypeBlacklist: Seq[String]): Either[CommonError,ComAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIInfo
        */
        def Configmgr_comAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportI(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], cqPeriodsocialPeriodreportingPeriodanalyticsPeriodpollingPeriodimporterPeriodinterval: Option[Int], cqPeriodsocialPeriodreportingPeriodanalyticsPeriodpollingPeriodimporterPeriodpageSize: Option[Int]): Either[CommonError,ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMInfo
        */
        def Configmgr_comAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportM(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], reportPeriodfetchPerioddelay: Option[Int]): Either[CommonError,ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSInfo
        */
        def Configmgr_comAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportS(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], cqPeriodsocialPeriodconsolePeriodanalyticsPeriodsitesPeriodmapping: Seq[String], priority: Option[Int]): Either[CommonError,ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiInfo
        */
        def Configmgr_comAdobeCqSocialReviewClientEndpointsImplReviewOperationsServi(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], fieldWhitelist: Seq[String], attachmentTypeBlacklist: Seq[String]): Either[CommonError,ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletInfo
        */
        def Configmgr_comAdobeCqSocialScfCoreOperationsImplSocialOperationsServlet(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], slingPeriodservletPeriodselectors: Option[String], slingPeriodservletPeriodextensions: Option[String]): Either[CommonError,ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletInfo
        */
        def Configmgr_comAdobeCqSocialScfEndpointsImplDefaultSocialGetServlet(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], slingPeriodservletPeriodselectors: Seq[String], slingPeriodservletPeriodextensions: Option[String]): Either[CommonError,ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeCqSocialScoringImplScoringEventListenerInfo
        */
        def Configmgr_comAdobeCqSocialScoringImplScoringEventListener(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], eventPeriodtopics: Option[String], eventPeriodfilter: Option[String]): Either[CommonError,ComAdobeCqSocialScoringImplScoringEventListenerInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplInfo
        */
        def Configmgr_comAdobeCqSocialServiceusersInternalImplServiceUserWrapperImpl(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], enableFallback: Option[Boolean]): Either[CommonError,ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceInfo
        */
        def Configmgr_comAdobeCqSocialSiteEndpointsImplSiteOperationService(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], fieldWhitelist: Seq[String], sitePathFilters: Seq[String], sitePackageGroup: Option[String]): Either[CommonError,ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImInfo
        */
        def Configmgr_comAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceIm(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], cqPeriodsocialPeriodconsolePeriodanalyticsPeriodcomponents: Seq[String]): Either[CommonError,ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeCqSocialSiteImplSiteConfiguratorImplInfo
        */
        def Configmgr_comAdobeCqSocialSiteImplSiteConfiguratorImpl(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], componentsUsingTags: Seq[String]): Either[CommonError,ComAdobeCqSocialSiteImplSiteConfiguratorImplInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeCqSocialSrpImplSocialSolrConnectorInfo
        */
        def Configmgr_comAdobeCqSocialSrpImplSocialSolrConnector(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], srpPeriodtype: Option[String]): Either[CommonError,ComAdobeCqSocialSrpImplSocialSolrConnectorInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeCqSocialSyncImplDiffChangesObserverInfo
        */
        def Configmgr_comAdobeCqSocialSyncImplDiffChangesObserver(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], enabled: Option[Boolean], agentName: Option[String], diffPath: Option[String], propertyNames: Option[String]): Either[CommonError,ComAdobeCqSocialSyncImplDiffChangesObserverInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeCqSocialSyncImplGroupSyncListenerImplInfo
        */
        def Configmgr_comAdobeCqSocialSyncImplGroupSyncListenerImpl(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], nodetypes: Seq[String], ignorableprops: Seq[String], ignorablenodes: Option[String], enabled: Option[Boolean], distfolders: Option[String]): Either[CommonError,ComAdobeCqSocialSyncImplGroupSyncListenerImplInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeCqSocialSyncImplPublisherSyncServiceImplInfo
        */
        def Configmgr_comAdobeCqSocialSyncImplPublisherSyncServiceImpl(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], activeRunModes: Seq[String]): Either[CommonError,ComAdobeCqSocialSyncImplPublisherSyncServiceImplInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeCqSocialSyncImplUserSyncListenerImplInfo
        */
        def Configmgr_comAdobeCqSocialSyncImplUserSyncListenerImpl(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], nodetypes: Seq[String], ignorableprops: Seq[String], ignorablenodes: Seq[String], enabled: Option[Boolean], distfolders: Seq[String]): Either[CommonError,ComAdobeCqSocialSyncImplUserSyncListenerImplInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerInfo
        */
        def Configmgr_comAdobeCqSocialTranslationImplTranslationServiceConfigManager(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], translatePeriodlanguage: Option[String], translatePerioddisplay: Option[String], translatePeriodattribution: Option[Boolean], translatePeriodcaching: Option[String], translatePeriodsmartPeriodrendering: Option[String], translatePeriodcachingPeriodduration: Option[String], translatePeriodsessionPeriodsavePeriodinterval: Option[String], translatePeriodsessionPeriodsavePeriodbatchLimit: Option[String]): Either[CommonError,ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeCqSocialTranslationImplUGCLanguageDetectorInfo
        */
        def Configmgr_comAdobeCqSocialTranslationImplUGCLanguageDetector(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], eventPeriodtopics: Option[String], eventPeriodfilter: Option[String], translatePeriodlistenerPeriodtype: Seq[String], translatePeriodpropertyPeriodlist: Seq[String], poolSize: Option[Int], maxPoolSize: Option[Int], queueSize: Option[Int], keepAliveTime: Option[Int]): Either[CommonError,ComAdobeCqSocialTranslationImplUGCLanguageDetectorInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplInfo
        */
        def Configmgr_comAdobeCqSocialUgcbaseDispatcherImplFlushServiceImpl(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], threadPoolSize: Option[Int], delayTime: Option[Int], workerSleepTime: Option[Int]): Either[CommonError,ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplInfo
        */
        def Configmgr_comAdobeCqSocialUgcbaseImplAysncReverseReplicatorImpl(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], poolSize: Option[Int], maxPoolSize: Option[Int], queueSize: Option[Int], keepAliveTime: Option[Int]): Either[CommonError,ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplInfo
        */
        def Configmgr_comAdobeCqSocialUgcbaseImplPublisherConfigurationImpl(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], isPrimaryPublisher: Option[Boolean]): Either[CommonError,ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeCqSocialUgcbaseImplSocialUtilsImplInfo
        */
        def Configmgr_comAdobeCqSocialUgcbaseImplSocialUtilsImpl(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], legacyCloudUGCPathMapping: Option[Boolean]): Either[CommonError,ComAdobeCqSocialUgcbaseImplSocialUtilsImplInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplInfo
        */
        def Configmgr_comAdobeCqSocialUgcbaseModerationImplAutoModerationImpl(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], automoderationPeriodsequence: Seq[String], automoderationPeriodonfailurestop: Option[Boolean]): Either[CommonError,ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeCqSocialUgcbaseModerationImplSentimentProcessInfo
        */
        def Configmgr_comAdobeCqSocialUgcbaseModerationImplSentimentProcess(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], watchwordsPeriodpositive: Seq[String], watchwordsPeriodnegative: Seq[String], watchwordsPeriodpath: Option[String], sentimentPeriodpath: Option[String]): Either[CommonError,ComAdobeCqSocialUgcbaseModerationImplSentimentProcessInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliInfo
        */
        def Configmgr_comAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackli(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], defaultPeriodattachmentPeriodtypePeriodblacklist: Seq[String], baselinePeriodattachmentPeriodtypePeriodblacklist: Seq[String]): Either[CommonError,ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplInfo
        */
        def Configmgr_comAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImpl(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], parameterPeriodwhitelist: Seq[String], parameterPeriodwhitelistPeriodprefixes: Seq[String], binaryPeriodparameterPeriodwhitelist: Seq[String], modifierPeriodwhitelist: Seq[String], operationPeriodwhitelist: Seq[String], operationPeriodwhitelistPeriodprefixes: Seq[String], typehintPeriodwhitelist: Seq[String], resourcetypePeriodwhitelist: Seq[String]): Either[CommonError,ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletInfo
        */
        def Configmgr_comAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServlet(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], slingPeriodservletPeriodextensions: Option[String], slingPeriodservletPeriodpaths: Option[String], slingPeriodservletPeriodmethods: Option[String]): Either[CommonError,ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeCqSocialUserImplTransportHttpToPublisherInfo
        */
        def Configmgr_comAdobeCqSocialUserImplTransportHttpToPublisher(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], enable: Option[Boolean], agentPeriodconfiguration: Seq[String], contextPeriodpath: Option[String], disabledPeriodcipherPeriodsuites: Seq[String], enabledPeriodcipherPeriodsuites: Seq[String]): Either[CommonError,ComAdobeCqSocialUserImplTransportHttpToPublisherInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactInfo
        */
        def Configmgr_comAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFact(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], resourcePeriodtypes: Seq[String]): Either[CommonError,ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupInfo
        */
        def Configmgr_comAdobeCqUpgradesCleanupImplUpgradeContentCleanup(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], deletePeriodpathPeriodregexps: Seq[String], deletePeriodsql2Periodquery: Option[String]): Either[CommonError,ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupInfo
        */
        def Configmgr_comAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanup(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], deletePeriodnamePeriodregexps: Seq[String]): Either[CommonError,ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceInfo
        */
        def Configmgr_comAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderService(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], threshold: Option[Int], jobTopicName: Option[String], emailEnabled: Option[Boolean]): Either[CommonError,ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskInfo
        */
        def Configmgr_comAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTask(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], schedulerPeriodexpression: Option[String], jobPeriodpurgePeriodthreshold: Option[Int], jobPeriodpurgePeriodmaxPeriodjobs: Option[Int]): Either[CommonError,ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceInfo
        */
        def Configmgr_comAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderService(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], threshold: Option[Int], jobTopicName: Option[String], emailEnabled: Option[Boolean]): Either[CommonError,ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceInfo
        */
        def Configmgr_comAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderService(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], threshold: Option[Int], jobTopicName: Option[String], emailEnabled: Option[Boolean]): Either[CommonError,ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeCqWcmLaunchesImplLaunchesEventHandlerInfo
        */
        def Configmgr_comAdobeCqWcmLaunchesImplLaunchesEventHandler(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], eventPeriodfilter: Option[String], launchesPeriodeventhandlerPeriodthreadpoolPeriodmaxsize: Option[Int], launchesPeriodeventhandlerPeriodthreadpoolPeriodpriority: Option[String], launchesPeriodeventhandlerPeriodupdatelastmodification: Option[Boolean]): Either[CommonError,ComAdobeCqWcmLaunchesImplLaunchesEventHandlerInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorInfo
        */
        def Configmgr_comAdobeCqWcmMobileQrcodeServletQRCodeImageGenerator(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], cqPeriodwcmPeriodqrcodePeriodservletPeriodwhitelist: Seq[String]): Either[CommonError,ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplInfo
        */
        def Configmgr_comAdobeCqWcmStyleInternalComponentStyleInfoCacheImpl(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], size: Option[Int]): Either[CommonError,ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplInfo
        */
        def Configmgr_comAdobeCqWcmTranslationImplTranslationPlatformConfigurationImpl(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], syncTranslationStatePeriodschedulingFormat: Option[String], schedulingRepeatTranslationPeriodschedulingFormat: Option[String], syncTranslationStatePeriodlockTimeoutInMinutes: Option[String], exportPeriodformat: Option[String]): Either[CommonError,ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceInfo
        */
        def Configmgr_comAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigService(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], portalPeriodoutboxes: Seq[String], draftPerioddataPeriodservice: Option[String], draftPeriodmetadataPeriodservice: Option[String], submitPerioddataPeriodservice: Option[String], submitPeriodmetadataPeriodservice: Option[String], pendingSignPerioddataPeriodservice: Option[String], pendingSignPeriodmetadataPeriodservice: Option[String]): Either[CommonError,ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeFdFpConfigFormsPortalSchedulerServiceInfo
        */
        def Configmgr_comAdobeFdFpConfigFormsPortalSchedulerService(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], formportalPeriodinterval: Option[String]): Either[CommonError,ComAdobeFdFpConfigFormsPortalSchedulerServiceInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeFormsCommonServiceImplDefaultDataProviderInfo
        */
        def Configmgr_comAdobeFormsCommonServiceImplDefaultDataProvider(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], alloweddataFileLocations: Seq[String]): Either[CommonError,ComAdobeFormsCommonServiceImplDefaultDataProviderInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpInfo
        */
        def Configmgr_comAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImp(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], tempStorageConfig: Option[String]): Either[CommonError,ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeFormsCommonServletTempCleanUpTaskInfo
        */
        def Configmgr_comAdobeFormsCommonServletTempCleanUpTask(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], schedulerPeriodexpression: Option[String], duration for Temporary Storage: Option[String], duration for Anonymous Storage: Option[String]): Either[CommonError,ComAdobeFormsCommonServletTempCleanUpTaskInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeGraniteAcpPlatformPlatformServletInfo
        */
        def Configmgr_comAdobeGraniteAcpPlatformPlatformServlet(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], queryPeriodlimit: Option[Int], filePeriodtypePeriodextensionPeriodmap: Seq[String]): Either[CommonError,ComAdobeGraniteAcpPlatformPlatformServletInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeGraniteActivitystreamsImplActivityManagerImplInfo
        */
        def Configmgr_comAdobeGraniteActivitystreamsImplActivityManagerImpl(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], aggregatePeriodrelationships: Seq[String], aggregatePerioddescendPeriodvirtual: Option[Boolean]): Either[CommonError,ComAdobeGraniteActivitystreamsImplActivityManagerImplInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeGraniteAnalyzerBaseSystemStatusServletInfo
        */
        def Configmgr_comAdobeGraniteAnalyzerBaseSystemStatusServlet(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], disabled: Option[Boolean]): Either[CommonError,ComAdobeGraniteAnalyzerBaseSystemStatusServletInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletInfo
        */
        def Configmgr_comAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServlet(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], disabled: Option[Boolean]): Either[CommonError,ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeGraniteApicontrollerFilterResolverHookFactoryInfo
        */
        def Configmgr_comAdobeGraniteApicontrollerFilterResolverHookFactory(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], comPeriodadobePeriodcqPeriodcdnPeriodcdnRewriter: Option[String], comPeriodadobePeriodcqPeriodcloudConfigPeriodcomponents: Option[String], comPeriodadobePeriodcqPeriodcloudConfigPeriodcore: Option[String], comPeriodadobePeriodcqPeriodcloudConfigPeriodui: Option[String], comPeriodadobePeriodcqPeriodcomPeriodadobePeriodcqPeriodeditor: Option[String], comPeriodadobePeriodcqPeriodcomPeriodadobePeriodcqPeriodprojectsPeriodcore: Option[String], comPeriodadobePeriodcqPeriodcomPeriodadobePeriodcqPeriodprojectsPeriodwcmPeriodcore: Option[String], comPeriodadobePeriodcqPeriodcomPeriodadobePeriodcqPerioduiPeriodcommons: Option[String], comPeriodadobePeriodcqPeriodcomPeriodadobePeriodcqPeriodwcmPeriodstyle: Option[String], comPeriodadobePeriodcqPeriodcqActivitymapIntegration: Option[String], comPeriodadobePeriodcqPeriodcqContexthubCommons: Option[String], comPeriodadobePeriodcqPeriodcqDtm: Option[String], comPeriodadobePeriodcqPeriodcqHealthcheck: Option[String], comPeriodadobePeriodcqPeriodcqMultisiteTargeting: Option[String], comPeriodadobePeriodcqPeriodcqPreUpgradeCleanup: Option[String], comPeriodadobePeriodcqPeriodcqProductInfoProvider: Option[String], comPeriodadobePeriodcqPeriodcqRestSites: Option[String], comPeriodadobePeriodcqPeriodcqSecurityHc: Option[String], comPeriodadobePeriodcqPerioddamPeriodcqDamSvgHandler: Option[String], comPeriodadobePeriodcqPerioddamPeriodcqScene7Imaging: Option[String], comPeriodadobePeriodcqPerioddtmReactorPeriodcore: Option[String], comPeriodadobePeriodcqPerioddtmReactorPeriodui: Option[String], comPeriodadobePeriodcqPeriodexpJspelResolver: Option[String], comPeriodadobePeriodcqPeriodinboxPeriodcqInbox: Option[String], comPeriodadobePeriodcqPeriodjsonSchemaParser: Option[String], comPeriodadobePeriodcqPeriodmediaPeriodcqMediaPublishingDpsFpCore: Option[String], comPeriodadobePeriodcqPeriodmobilePeriodcqMobileCaas: Option[String], comPeriodadobePeriodcqPeriodmobilePeriodcqMobileIndexBuilder: Option[String], comPeriodadobePeriodcqPeriodmobilePeriodcqMobilePhonegapBuild: Option[String], comPeriodadobePeriodcqPeriodmyspell: Option[String], comPeriodadobePeriodcqPeriodsamplePeriodwePeriodretailPeriodcore: Option[String], comPeriodadobePeriodcqPeriodscreensPeriodcomPeriodadobePeriodcqPeriodscreensPerioddcc: Option[String], comPeriodadobePeriodcqPeriodscreensPeriodcomPeriodadobePeriodcqPeriodscreensPeriodmqPeriodcore: Option[String], comPeriodadobePeriodcqPeriodsocialPeriodcqSocialAsProvider: Option[String], comPeriodadobePeriodcqPeriodsocialPeriodcqSocialBadgingBasicImpl: Option[String], comPeriodadobePeriodcqPeriodsocialPeriodcqSocialBadgingImpl: Option[String], comPeriodadobePeriodcqPeriodsocialPeriodcqSocialCalendarImpl: Option[String], comPeriodadobePeriodcqPeriodsocialPeriodcqSocialContentFragmentsImpl: Option[String], comPeriodadobePeriodcqPeriodsocialPeriodcqSocialEnablementImpl: Option[String], comPeriodadobePeriodcqPeriodsocialPeriodcqSocialGraphImpl: Option[String], comPeriodadobePeriodcqPeriodsocialPeriodcqSocialIdeationImpl: Option[String], comPeriodadobePeriodcqPeriodsocialPeriodcqSocialJcrProvider: Option[String], comPeriodadobePeriodcqPeriodsocialPeriodcqSocialMembersImpl: Option[String], comPeriodadobePeriodcqPeriodsocialPeriodcqSocialMsProvider: Option[String], comPeriodadobePeriodcqPeriodsocialPeriodcqSocialNotificationsChannelsWeb: Option[String], comPeriodadobePeriodcqPeriodsocialPeriodcqSocialNotificationsImpl: Option[String], comPeriodadobePeriodcqPeriodsocialPeriodcqSocialRdbProvider: Option[String], comPeriodadobePeriodcqPeriodsocialPeriodcqSocialScfImpl: Option[String], comPeriodadobePeriodcqPeriodsocialPeriodcqSocialScoringBasicImpl: Option[String], comPeriodadobePeriodcqPeriodsocialPeriodcqSocialScoringImpl: Option[String], comPeriodadobePeriodcqPeriodsocialPeriodcqSocialServiceusersImpl: Option[String], comPeriodadobePeriodcqPeriodsocialPeriodcqSocialSrpImpl: Option[String], comPeriodadobePeriodcqPeriodsocialPeriodcqSocialUgcbaseImpl: Option[String], comPeriodadobePerioddamPeriodcqDamCfmImpl: Option[String], comPeriodadobePeriodformsPeriodfoundationFormsFoundationBase: Option[String], comPeriodadobePeriodgranitePeriodapicontroller: Option[String], comPeriodadobePeriodgranitePeriodassetPeriodcore: Option[String], comPeriodadobePeriodgranitePeriodauthPeriodsso: Option[String], comPeriodadobePeriodgranitePeriodbundlesPeriodhcPeriodimpl: Option[String], comPeriodadobePeriodgranitePeriodcompatRouter: Option[String], comPeriodadobePeriodgranitePeriodconf: Option[String], comPeriodadobePeriodgranitePeriodconfPerioduiPeriodcore: Option[String], comPeriodadobePeriodgranitePeriodcors: Option[String], comPeriodadobePeriodgranitePeriodcrxExplorer: Option[String], comPeriodadobePeriodgranitePeriodcrxdeLite: Option[String], comPeriodadobePeriodgranitePeriodcryptoPeriodconfig: Option[String], comPeriodadobePeriodgranitePeriodcryptoPeriodextension: Option[String], comPeriodadobePeriodgranitePeriodcryptoPeriodfile: Option[String], comPeriodadobePeriodgranitePeriodcryptoPeriodjcr: Option[String], comPeriodadobePeriodgranitePeriodcsrf: Option[String], comPeriodadobePeriodgranitePerioddistributionPeriodcore: Option[String], comPeriodadobePeriodgranitePerioddropwizardPeriodmetrics: Option[String], comPeriodadobePeriodgranitePeriodfragsPeriodimpl: Option[String], comPeriodadobePeriodgranitePeriodgibson: Option[String], comPeriodadobePeriodgranitePeriodinfocollector: Option[String], comPeriodadobePeriodgranitePeriodinstallerPeriodfactoryPeriodpackages: Option[String], comPeriodadobePeriodgranitePeriodjettyPeriodssl: Option[String], comPeriodadobePeriodgranitePeriodjobsPeriodasync: Option[String], comPeriodadobePeriodgranitePeriodmaintenancePeriodoak: Option[String], comPeriodadobePeriodgranitePeriodmonitoringPeriodcore: Option[String], comPeriodadobePeriodgranitePeriodqueries: Option[String], comPeriodadobePeriodgranitePeriodreplicationPeriodhcPeriodimpl: Option[String], comPeriodadobePeriodgranitePeriodrepositoryPeriodchecker: Option[String], comPeriodadobePeriodgranitePeriodrepositoryPeriodhcPeriodimpl: Option[String], comPeriodadobePeriodgranitePeriodrestPeriodassets: Option[String], comPeriodadobePeriodgranitePeriodsecurityPeriodui: Option[String], comPeriodadobePeriodgranitePeriodstartup: Option[String], comPeriodadobePeriodgranitePeriodtagsoup: Option[String], comPeriodadobePeriodgranitePeriodtaskmanagementPeriodcore: Option[String], comPeriodadobePeriodgranitePeriodtaskmanagementPeriodworkflow: Option[String], comPeriodadobePeriodgranitePerioduiPeriodclientlibsPeriodcompilerPeriodless: Option[String], comPeriodadobePeriodgranitePerioduiPeriodclientlibsPeriodprocessorPeriodgcc: Option[String], comPeriodadobePeriodgranitePeriodwebconsolePeriodplugins: Option[String], comPeriodadobePeriodgranitePeriodworkflowPeriodconsole: Option[String], comPeriodadobePeriodxmpPeriodworkerPeriodfilesPeriodnativePeriodfragmentPeriodlinux: Option[String], comPeriodadobePeriodxmpPeriodworkerPeriodfilesPeriodnativePeriodfragmentPeriodmacosx: Option[String], comPeriodadobePeriodxmpPeriodworkerPeriodfilesPeriodnativePeriodfragmentPeriodwin: Option[String], comPerioddayPeriodcommonsPeriodosgiPeriodwrapperPeriodsimpleJndi: Option[String], comPerioddayPeriodcqPeriodcqAuthhandler: Option[String], comPerioddayPeriodcqPeriodcqCompatConfigupdate: Option[String], comPerioddayPeriodcqPeriodcqLicensebranding: Option[String], comPerioddayPeriodcqPeriodcqNotifcationImpl: Option[String], comPerioddayPeriodcqPeriodcqReplicationAudit: Option[String], comPerioddayPeriodcqPeriodcqSearchExt: Option[String], comPerioddayPeriodcqPerioddamPeriodcqDamAnnotationPrint: Option[String], comPerioddayPeriodcqPerioddamPeriodcqDamAssetUsage: Option[String], comPerioddayPeriodcqPerioddamPeriodcqDamS7dam: Option[String], comPerioddayPeriodcqPerioddamPeriodcqDamSimilaritysearch: Option[String], comPerioddayPeriodcqPerioddamPerioddamWebdavSupport: Option[String], comPerioddayPeriodcqPeriodpreUpgradeTasks: Option[String], comPerioddayPeriodcqPeriodreplicationPeriodextensions: Option[String], comPerioddayPeriodcqPeriodwcmPeriodcqMsmCore: Option[String], comPerioddayPeriodcqPeriodwcmPeriodcqWcmTranslation: Option[String], dayCommonsJrawio: Option[String], orgPeriodapachePeriodariesPeriodjmxPeriodwhiteboard: Option[String], orgPeriodapachePeriodfelixPeriodhttpPeriodsslfilter: Option[String], orgPeriodapachePeriodfelixPeriodorgPeriodapachePeriodfelixPeriodthreaddump: Option[String], orgPeriodapachePeriodfelixPeriodwebconsolePeriodpluginsPeriodds: Option[String], orgPeriodapachePeriodfelixPeriodwebconsolePeriodpluginsPeriodevent: Option[String], orgPeriodapachePeriodfelixPeriodwebconsolePeriodpluginsPeriodmemoryusage: Option[String], orgPeriodapachePeriodfelixPeriodwebconsolePeriodpluginsPeriodpackageadmin: Option[String], orgPeriodapachePeriodjackrabbitPeriodoakAuthLdap: Option[String], orgPeriodapachePeriodjackrabbitPeriodoakSegmentTar: Option[String], orgPeriodapachePeriodjackrabbitPeriodoakSolrOsgi: Option[String], orgPeriodapachePeriodslingPeriodbundleresourcePeriodimpl: Option[String], orgPeriodapachePeriodslingPeriodcommonsPeriodfsclassloader: Option[String], orgPeriodapachePeriodslingPeriodcommonsPeriodlogPeriodwebconsole: Option[String], orgPeriodapachePeriodslingPerioddatasource: Option[String], orgPeriodapachePeriodslingPerioddiscoveryPeriodbase: Option[String], orgPeriodapachePeriodslingPerioddiscoveryPeriodoak: Option[String], orgPeriodapachePeriodslingPerioddiscoveryPeriodsupport: Option[String], orgPeriodapachePeriodslingPerioddistributionPeriodapi: Option[String], orgPeriodapachePeriodslingPerioddistributionPeriodcore: Option[String], orgPeriodapachePeriodslingPeriodextensionsPeriodwebconsolesecurityprovider: Option[String], orgPeriodapachePeriodslingPeriodhcPeriodwebconsole: Option[String], orgPeriodapachePeriodslingPeriodinstallerPeriodconsole: Option[String], orgPeriodapachePeriodslingPeriodinstallerPeriodproviderPeriodfile: Option[String], orgPeriodapachePeriodslingPeriodinstallerPeriodproviderPeriodjcr: Option[String], orgPeriodapachePeriodslingPeriodjcrPerioddavex: Option[String], orgPeriodapachePeriodslingPeriodjcrPeriodresourcesecurity: Option[String], orgPeriodapachePeriodslingPeriodjmxPeriodprovider: Option[String], orgPeriodapachePeriodslingPeriodlaunchpadPeriodinstaller: Option[String], orgPeriodapachePeriodslingPeriodmodelsPeriodimpl: Option[String], orgPeriodapachePeriodslingPeriodrepoinitPeriodparser: Option[String], orgPeriodapachePeriodslingPeriodresourcePeriodinventory: Option[String], orgPeriodapachePeriodslingPeriodresourceresolver: Option[String], orgPeriodapachePeriodslingPeriodscriptingPeriodjavascript: Option[String], orgPeriodapachePeriodslingPeriodscriptingPeriodjst: Option[String], orgPeriodapachePeriodslingPeriodscriptingPeriodsightlyPeriodjsPeriodprovider: Option[String], orgPeriodapachePeriodslingPeriodscriptingPeriodsightlyPeriodmodelsPeriodprovider: Option[String], orgPeriodapachePeriodslingPeriodsecurity: Option[String], orgPeriodapachePeriodslingPeriodservletsPeriodcompat: Option[String], orgPeriodapachePeriodslingPeriodservletsPeriodget: Option[String], orgPeriodapachePeriodslingPeriodstartupfilterPerioddisabler: Option[String], orgPeriodapachePeriodslingPeriodtracer: Option[String], wePeriodretailPeriodclientPeriodappPeriodcore: Option[String]): Either[CommonError,ComAdobeGraniteApicontrollerFilterResolverHookFactoryInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeGraniteAuthCertImplClientCertAuthHandlerInfo
        */
        def Configmgr_comAdobeGraniteAuthCertImplClientCertAuthHandler(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], path: Option[String], servicePeriodranking: Option[Int]): Either[CommonError,ComAdobeGraniteAuthCertImplClientCertAuthHandlerInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeGraniteAuthImsInfo
        */
        def Configmgr_comAdobeGraniteAuthIms(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], configid: Option[String], scope: Option[String]): Either[CommonError,ComAdobeGraniteAuthImsInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionInfo
        */
        def Configmgr_comAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtension(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], oauthPeriodproviderPeriodid: Option[String]): Either[CommonError,ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplInfo
        */
        def Configmgr_comAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImpl(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], authPeriodimsPeriodclientPeriodsecret: Option[String], customizerPeriodtype: Option[String]): Either[CommonError,ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorInfo
        */
        def Configmgr_comAdobeGraniteAuthImsImplIMSInstanceCredentialsValidator(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], oauthPeriodproviderPeriodid: Option[String]): Either[CommonError,ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeGraniteAuthImsImplIMSProviderImplInfo
        */
        def Configmgr_comAdobeGraniteAuthImsImplIMSProviderImpl(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], oauthPeriodproviderPeriodid: Option[String], oauthPeriodproviderPeriodimsPeriodauthorizationPeriodurl: Option[String], oauthPeriodproviderPeriodimsPeriodtokenPeriodurl: Option[String], oauthPeriodproviderPeriodimsPeriodprofilePeriodurl: Option[String], oauthPeriodproviderPeriodimsPeriodextendedPerioddetailsPeriodurls: Seq[String], oauthPeriodproviderPeriodimsPeriodvalidatePeriodtokenPeriodurl: Option[String], oauthPeriodproviderPeriodimsPeriodsessionPeriodproperty: Option[String], oauthPeriodproviderPeriodimsPeriodservicePeriodtokenPeriodclientPeriodid: Option[String], oauthPeriodproviderPeriodimsPeriodservicePeriodtokenPeriodclientPeriodsecret: Option[String], oauthPeriodproviderPeriodimsPeriodservicePeriodtoken: Option[String], imsPeriodorgPeriodref: Option[String], imsPeriodgroupPeriodmapping: Seq[String], oauthPeriodproviderPeriodimsPeriodonlyPeriodlicensePeriodgroup: Option[Boolean]): Either[CommonError,ComAdobeGraniteAuthImsImplIMSProviderImplInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeGraniteAuthImsImplImsConfigProviderImplInfo
        */
        def Configmgr_comAdobeGraniteAuthImsImplImsConfigProviderImpl(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], oauthPeriodconfigmanagerPeriodimsPeriodconfigid: Option[String], imsPeriodowningEntity: Option[String], aemPeriodinstanceId: Option[String], imsPeriodserviceCode: Option[String]): Either[CommonError,ComAdobeGraniteAuthImsImplImsConfigProviderImplInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeGraniteAuthOauthAccesstokenProviderInfo
        */
        def Configmgr_comAdobeGraniteAuthOauthAccesstokenProvider(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], name: Option[String], authPeriodtokenPeriodproviderPeriodtitle: Option[String], authPeriodtokenPeriodproviderPerioddefaultPeriodclaims: Seq[String], authPeriodtokenPeriodproviderPeriodendpoint: Option[String], authPeriodaccessPeriodtokenPeriodrequest: Option[String], authPeriodtokenPeriodproviderPeriodkeypairPeriodalias: Option[String], authPeriodtokenPeriodproviderPeriodconnPeriodtimeout: Option[Int], authPeriodtokenPeriodproviderPeriodsoPeriodtimeout: Option[Int], authPeriodtokenPeriodproviderPeriodclientPeriodid: Option[String], authPeriodtokenPeriodproviderPeriodscope: Option[String], authPeriodtokenPeriodproviderPeriodreusePeriodaccessPeriodtoken: Option[Boolean], authPeriodtokenPeriodproviderPeriodrelaxedPeriodssl: Option[Boolean], tokenPeriodrequestPeriodcustomizerPeriodtype: Option[String], authPeriodtokenPeriodvalidatorPeriodtype: Option[String]): Either[CommonError,ComAdobeGraniteAuthOauthAccesstokenProviderInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerInfo
        */
        def Configmgr_comAdobeGraniteAuthOauthImplBearerAuthenticationHandler(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], path: Option[String], oauthPeriodclientIdsPeriodallowed: Seq[String], authPeriodbearerPeriodsyncPeriodims: Option[Boolean], authPeriodtokenRequestParameter: Option[String], oauthPeriodbearerPeriodconfigid: Option[String], oauthPeriodjwtPeriodsupport: Option[Boolean]): Either[CommonError,ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplInfo
        */
        def Configmgr_comAdobeGraniteAuthOauthImplDefaultTokenValidatorImpl(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], authPeriodtokenPeriodvalidatorPeriodtype: Option[String]): Either[CommonError,ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeGraniteAuthOauthImplFacebookProviderImplInfo
        */
        def Configmgr_comAdobeGraniteAuthOauthImplFacebookProviderImpl(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], oauthPeriodproviderPeriodid: Option[String]): Either[CommonError,ComAdobeGraniteAuthOauthImplFacebookProviderImplInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeGraniteAuthOauthImplGithubProviderImplInfo
        */
        def Configmgr_comAdobeGraniteAuthOauthImplGithubProviderImpl(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], oauthPeriodproviderPeriodid: Option[String], oauthPeriodproviderPeriodgithubPeriodauthorizationPeriodurl: Option[String], oauthPeriodproviderPeriodgithubPeriodtokenPeriodurl: Option[String], oauthPeriodproviderPeriodgithubPeriodprofilePeriodurl: Option[String]): Either[CommonError,ComAdobeGraniteAuthOauthImplGithubProviderImplInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeGraniteAuthOauthImplGraniteProviderInfo
        */
        def Configmgr_comAdobeGraniteAuthOauthImplGraniteProvider(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], oauthPeriodproviderPeriodid: Option[String], oauthPeriodproviderPeriodgranitePeriodauthorizationPeriodurl: Option[String], oauthPeriodproviderPeriodgranitePeriodtokenPeriodurl: Option[String], oauthPeriodproviderPeriodgranitePeriodprofilePeriodurl: Option[String], oauthPeriodproviderPeriodgranitePeriodextendedPerioddetailsPeriodurls: Option[String]): Either[CommonError,ComAdobeGraniteAuthOauthImplGraniteProviderInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInfo
        */
        def Configmgr_comAdobeGraniteAuthOauthImplHelperProviderConfigManager(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], oauthPeriodcookiePeriodloginPeriodtimeout: Option[String], oauthPeriodcookiePeriodmaxPeriodage: Option[String]): Either[CommonError,ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalInfo
        */
        def Configmgr_comAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternal(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], oauthPeriodcookiePeriodloginPeriodtimeout: Option[String], oauthPeriodcookiePeriodmaxPeriodage: Option[String]): Either[CommonError,ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerInfo
        */
        def Configmgr_comAdobeGraniteAuthOauthImplOAuthAuthenticationHandler(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], path: Option[String]): Either[CommonError,ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeGraniteAuthOauthImplTwitterProviderImplInfo
        */
        def Configmgr_comAdobeGraniteAuthOauthImplTwitterProviderImpl(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], oauthPeriodproviderPeriodid: Option[String]): Either[CommonError,ComAdobeGraniteAuthOauthImplTwitterProviderImplInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeGraniteAuthOauthProviderInfo
        */
        def Configmgr_comAdobeGraniteAuthOauthProvider(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], oauthPeriodconfigPeriodid: Option[String], oauthPeriodclientPeriodid: Option[String], oauthPeriodclientPeriodsecret: Option[String], oauthPeriodscope: Seq[String], oauthPeriodconfigPeriodproviderPeriodid: Option[String], oauthPeriodcreatePeriodusers: Option[Boolean], oauthPerioduseridPeriodproperty: Option[String], forcePeriodstrictPeriodusernamePeriodmatching: Option[Boolean], oauthPeriodencodePerioduserids: Option[Boolean], oauthPeriodhashPerioduserids: Option[Boolean], oauthPeriodcallBackUrl: Option[String], oauthPeriodaccessPeriodtokenPeriodpersist: Option[Boolean], oauthPeriodaccessPeriodtokenPeriodpersistPeriodcookie: Option[Boolean], oauthPeriodcsrfPeriodstatePeriodprotection: Option[Boolean], oauthPeriodredirectPeriodrequestPeriodparams: Option[Boolean], oauthPeriodconfigPeriodsiblingsPeriodallow: Option[Boolean]): Either[CommonError,ComAdobeGraniteAuthOauthProviderInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerInfo
        */
        def Configmgr_comAdobeGraniteAuthRequirementImplDefaultRequirementHandler(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], supportedPaths: Seq[String]): Either[CommonError,ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeGraniteAuthSamlSamlAuthenticationHandlerInfo
        */
        def Configmgr_comAdobeGraniteAuthSamlSamlAuthenticationHandler(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], path: Seq[String], servicePeriodranking: Option[Int], idpUrl: Option[String], idpCertAlias: Option[String], idpHttpRedirect: Option[Boolean], serviceProviderEntityId: Option[String], assertionConsumerServiceURL: Option[String], spPrivateKeyAlias: Option[String], keyStorePassword: Option[String], defaultRedirectUrl: Option[String], userIDAttribute: Option[String], useEncryption: Option[Boolean], createUser: Option[Boolean], userIntermediatePath: Option[String], addGroupMemberships: Option[Boolean], groupMembershipAttribute: Option[String], defaultGroups: Seq[String], nameIdFormat: Option[String], synchronizeAttributes: Seq[String], handleLogout: Option[Boolean], logoutUrl: Option[String], clockTolerance: Option[Int], digestMethod: Option[String], signatureMethod: Option[String], identitySyncType: Option[String], idpIdentifier: Option[String]): Either[CommonError,ComAdobeGraniteAuthSamlSamlAuthenticationHandlerInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerInfo
        */
        def Configmgr_comAdobeGraniteAuthSsoImplSsoAuthenticationHandler(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], path: Option[String], servicePeriodranking: Option[Int], jaasPeriodcontrolFlag: Option[String], jaasPeriodrealmName: Option[String], jaasPeriodranking: Option[Int], headers: Seq[String], cookies: Seq[String], parameters: Seq[String], usermap: Seq[String], format: Option[String], trustedCredentialsAttribute: Option[String]): Either[CommonError,ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckInfo
        */
        def Configmgr_comAdobeGraniteBundlesHcImplCodeCacheHealthCheck(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], hcPeriodtags: Seq[String], minimumPeriodcodePeriodcachePeriodsize: Option[Int]): Either[CommonError,ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckInfo
        */
        def Configmgr_comAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheck(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], hcPeriodtags: Seq[String]): Either[CommonError,ComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeGraniteBundlesHcImplDavExBundleHealthCheckInfo
        */
        def Configmgr_comAdobeGraniteBundlesHcImplDavExBundleHealthCheck(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], hcPeriodtags: Seq[String]): Either[CommonError,ComAdobeGraniteBundlesHcImplDavExBundleHealthCheckInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckInfo
        */
        def Configmgr_comAdobeGraniteBundlesHcImplInactiveBundlesHealthCheck(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], hcPeriodtags: Seq[String], ignoredPeriodbundles: Seq[String]): Either[CommonError,ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeGraniteBundlesHcImplJobsHealthCheckInfo
        */
        def Configmgr_comAdobeGraniteBundlesHcImplJobsHealthCheck(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], hcPeriodtags: Seq[String], maxPeriodqueuedPeriodjobs: Option[Int]): Either[CommonError,ComAdobeGraniteBundlesHcImplJobsHealthCheckInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeGraniteBundlesHcImplSlingGetServletHealthCheckInfo
        */
        def Configmgr_comAdobeGraniteBundlesHcImplSlingGetServletHealthCheck(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], hcPeriodtags: Seq[String]): Either[CommonError,ComAdobeGraniteBundlesHcImplSlingGetServletHealthCheckInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckInfo
        */
        def Configmgr_comAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheck(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], hcPeriodtags: Seq[String]): Either[CommonError,ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckInfo
        */
        def Configmgr_comAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheck(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], hcPeriodtags: Seq[String]): Either[CommonError,ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckInfo
        */
        def Configmgr_comAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheck(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], hcPeriodtags: Seq[String]): Either[CommonError,ComAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheckInfo
        */
        def Configmgr_comAdobeGraniteBundlesHcImplWebDavBundleHealthCheck(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], hcPeriodtags: Seq[String]): Either[CommonError,ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheckInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacInfo
        */
        def Configmgr_comAdobeGraniteCommentsInternalCommentReplicationContentFilterFac(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], replicatePeriodcommentPeriodresourceTypes: Seq[String]): Either[CommonError,ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplInfo
        */
        def Configmgr_comAdobeGraniteCompatrouterImplCompatSwitchingServiceImpl(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], compatgroups: Seq[String], enabled: Option[Boolean]): Either[CommonError,ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeGraniteCompatrouterImplRoutingConfigInfo
        */
        def Configmgr_comAdobeGraniteCompatrouterImplRoutingConfig(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], id: Option[String], compatPath: Option[String], newPath: Option[String]): Either[CommonError,ComAdobeGraniteCompatrouterImplRoutingConfigInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeGraniteCompatrouterImplSwitchMappingConfigInfo
        */
        def Configmgr_comAdobeGraniteCompatrouterImplSwitchMappingConfig(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], group: Option[String], ids: Seq[String]): Either[CommonError,ComAdobeGraniteCompatrouterImplSwitchMappingConfigInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingInfo
        */
        def Configmgr_comAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolving(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], enabled: Option[Boolean], fallbackPaths: Seq[String]): Either[CommonError,ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeGraniteContexthubImplContextHubImplInfo
        */
        def Configmgr_comAdobeGraniteContexthubImplContextHubImpl(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], comPeriodadobePeriodgranitePeriodcontexthubPeriodsilentMode: Option[Boolean], comPeriodadobePeriodgranitePeriodcontexthubPeriodshowUi: Option[Boolean]): Either[CommonError,ComAdobeGraniteContexthubImplContextHubImplInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeGraniteCorsImplCORSPolicyImplInfo
        */
        def Configmgr_comAdobeGraniteCorsImplCORSPolicyImpl(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], alloworigin: Seq[String], alloworiginregexp: Seq[String], allowedpaths: Seq[String], exposedheaders: Seq[String], maxage: Option[Int], supportedheaders: Seq[String], supportedmethods: Seq[String], supportscredentials: Option[Boolean]): Either[CommonError,ComAdobeGraniteCorsImplCORSPolicyImplInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeGraniteCsrfImplCSRFFilterInfo
        */
        def Configmgr_comAdobeGraniteCsrfImplCSRFFilter(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], filterPeriodmethods: Seq[String], filterPeriodenablePeriodsafePerioduserPeriodagents: Option[Boolean], filterPeriodsafePerioduserPeriodagents: Seq[String], filterPeriodexcludedPeriodpaths: Seq[String]): Either[CommonError,ComAdobeGraniteCsrfImplCSRFFilterInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeGraniteCsrfImplCSRFServletInfo
        */
        def Configmgr_comAdobeGraniteCsrfImplCSRFServlet(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], csrfPeriodtokenPeriodexpiresPeriodin: Option[Int], slingPeriodauthPeriodrequirements: Option[String]): Either[CommonError,ComAdobeGraniteCsrfImplCSRFServletInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeInfo
        */
        def Configmgr_comAdobeGraniteDistributionCoreImplCryptoDistributionTransportSe(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], name: Option[String], username: Option[String], encryptedPassword: Option[String]): Either[CommonError,ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverInfo
        */
        def Configmgr_comAdobeGraniteDistributionCoreImplDiffDiffChangesObserver(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], enabled: Option[Boolean], agentName: Option[String], diffPath: Option[String], observedPath: Option[String], serviceName: Option[String], propertyNames: Option[String], distributionDelay: Option[Int], serviceUserPeriodtarget: Option[String]): Either[CommonError,ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerInfo
        */
        def Configmgr_comAdobeGraniteDistributionCoreImplDiffDiffEventListener(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], diffPath: Option[String], serviceName: Option[String], serviceUserPeriodtarget: Option[String]): Either[CommonError,ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenInfo
        */
        def Configmgr_comAdobeGraniteDistributionCoreImplDistributionToReplicationEven(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], importerPeriodname: Seq[String]): Either[CommonError,ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatInfo
        */
        def Configmgr_comAdobeGraniteDistributionCoreImplReplicationAdaptersReplicat(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], providerName: Option[String], forwardPeriodrequests: Option[Boolean]): Either[CommonError,ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeGraniteDistributionCoreImplReplicationDistributionTransInfo
        */
        def Configmgr_comAdobeGraniteDistributionCoreImplReplicationDistributionTrans(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], forwardPeriodrequests: Option[Boolean]): Either[CommonError,ComAdobeGraniteDistributionCoreImplReplicationDistributionTransInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuInfo
        */
        def Configmgr_comAdobeGraniteDistributionCoreImplTransportAccessTokenDistribu(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], name: Option[String], serviceName: Option[String], userId: Option[String], accessTokenProviderPeriodtarget: Option[String]): Either[CommonError,ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeGraniteFragsImplCheckHttpHeaderFlagInfo
        */
        def Configmgr_comAdobeGraniteFragsImplCheckHttpHeaderFlag(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], featurePeriodname: Option[String], featurePerioddescription: Option[String], httpPeriodheaderPeriodname: Option[String], httpPeriodheaderPeriodvaluepattern: Option[String]): Either[CommonError,ComAdobeGraniteFragsImplCheckHttpHeaderFlagInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeGraniteFragsImplRandomFeatureInfo
        */
        def Configmgr_comAdobeGraniteFragsImplRandomFeature(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], featurePeriodname: Option[String], featurePerioddescription: Option[String], activePeriodpercentage: Option[String], cookiePeriodname: Option[String], cookiePeriodmaxAge: Option[Int]): Either[CommonError,ComAdobeGraniteFragsImplRandomFeatureInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeGraniteHttpcacheFileFileCacheStoreInfo
        */
        def Configmgr_comAdobeGraniteHttpcacheFileFileCacheStore(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], comPeriodadobePeriodgranitePeriodhttpcachePeriodfilePerioddocumentRoot: Option[String], comPeriodadobePeriodgranitePeriodhttpcachePeriodfilePeriodincludeHost: Option[String]): Either[CommonError,ComAdobeGraniteHttpcacheFileFileCacheStoreInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeGraniteHttpcacheImplOuterCacheFilterInfo
        */
        def Configmgr_comAdobeGraniteHttpcacheImplOuterCacheFilter(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], comPeriodadobePeriodgranitePeriodhttpcachePeriodurlPeriodpaths: Seq[String]): Either[CommonError,ComAdobeGraniteHttpcacheImplOuterCacheFilterInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeGraniteI18nImplBundlePseudoTranslationsInfo
        */
        def Configmgr_comAdobeGraniteI18nImplBundlePseudoTranslations(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], pseudoPeriodpatterns: Seq[String]): Either[CommonError,ComAdobeGraniteI18nImplBundlePseudoTranslationsInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceInfo
        */
        def Configmgr_comAdobeGraniteI18nImplPreferencesLocaleResolverService(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], securityPeriodpreferencesPeriodname: Option[String]): Either[CommonError,ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeGraniteInfocollectorInfoCollectorInfo
        */
        def Configmgr_comAdobeGraniteInfocollectorInfoCollector(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], granitePeriodinfocollectorPeriodincludeThreadDumps: Option[Boolean], granitePeriodinfocollectorPeriodincludeHeapDump: Option[Boolean]): Either[CommonError,ComAdobeGraniteInfocollectorInfoCollectorInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryInfo
        */
        def Configmgr_comAdobeGraniteJettySslInternalGraniteSslConnectorFactory(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], comPeriodadobePeriodgranitePeriodjettyPeriodsslPeriodport: Option[Int], comPeriodadobePeriodgranitePeriodjettyPeriodsslPeriodkeystorePerioduser: Option[String], comPeriodadobePeriodgranitePeriodjettyPeriodsslPeriodkeystorePeriodpassword: Option[String], comPeriodadobePeriodgranitePeriodjettyPeriodsslPeriodciphersuitesPeriodexcluded: Seq[String], comPeriodadobePeriodgranitePeriodjettyPeriodsslPeriodciphersuitesPeriodincluded: Seq[String], comPeriodadobePeriodgranitePeriodjettyPeriodsslPeriodclientPeriodcertificate: Option[String]): Either[CommonError,ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeGraniteLicenseImplLicenseCheckFilterInfo
        */
        def Configmgr_comAdobeGraniteLicenseImplLicenseCheckFilter(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], checkInternval: Option[Int], excludeIds: Seq[String], encryptPing: Option[Boolean]): Either[CommonError,ComAdobeGraniteLicenseImplLicenseCheckFilterInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeGraniteLoggingImplLogAnalyserImplInfo
        */
        def Configmgr_comAdobeGraniteLoggingImplLogAnalyserImpl(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], messagesPeriodqueuePeriodsize: Option[Int], loggerPeriodconfig: Seq[String], messagesPeriodsize: Option[Int]): Either[CommonError,ComAdobeGraniteLoggingImplLogAnalyserImplInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeGraniteLoggingImplLogErrorHealthCheckInfo
        */
        def Configmgr_comAdobeGraniteLoggingImplLogErrorHealthCheck(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], hcPeriodtags: Seq[String]): Either[CommonError,ComAdobeGraniteLoggingImplLogErrorHealthCheckInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskInfo
        */
        def Configmgr_comAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTask(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], granitePeriodmaintenancePeriodmandatory: Option[Boolean], jobPeriodtopics: Option[String]): Either[CommonError,ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskInfo
        */
        def Configmgr_comAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTask(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], jobPeriodtopics: Option[String]): Either[CommonError,ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskInfo
        */
        def Configmgr_comAdobeGraniteMaintenanceCrxImplRevisionCleanupTask(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], fullPeriodgcPerioddays: Seq[String]): Either[CommonError,ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeGraniteMonitoringImplScriptConfigImplInfo
        */
        def Configmgr_comAdobeGraniteMonitoringImplScriptConfigImpl(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], scriptPeriodfilename: Option[String], scriptPerioddisplay: Option[String], scriptPeriodpath: Option[String], scriptPeriodplatform: Seq[String], interval: Option[Int], jmxdomain: Option[String]): Either[CommonError,ComAdobeGraniteMonitoringImplScriptConfigImplInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanInfo
        */
        def Configmgr_comAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHan(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], path: Option[String], jaasPeriodcontrolFlag: Option[String], jaasPeriodrealmName: Option[String], jaasPeriodranking: Option[Int], oauthPeriodofflinePeriodvalidation: Option[Boolean]): Either[CommonError,ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeGraniteOauthServerImplAccessTokenCleanupTaskInfo
        */
        def Configmgr_comAdobeGraniteOauthServerImplAccessTokenCleanupTask(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], schedulerPeriodexpression: Option[String]): Either[CommonError,ComAdobeGraniteOauthServerImplAccessTokenCleanupTaskInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletInfo
        */
        def Configmgr_comAdobeGraniteOauthServerImplOAuth2ClientRevocationServlet(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], oauthPeriodclientPeriodrevocationPeriodactive: Option[Boolean]): Either[CommonError,ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletInfo
        */
        def Configmgr_comAdobeGraniteOauthServerImplOAuth2RevocationEndpointServlet(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], slingPeriodservletPeriodpaths: Option[String], oauthPeriodrevocationPeriodactive: Option[Boolean]): Either[CommonError,ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletInfo
        */
        def Configmgr_comAdobeGraniteOauthServerImplOAuth2TokenEndpointServlet(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], oauthPeriodissuer: Option[String], oauthPeriodaccessPeriodtokenPeriodexpiresPeriodin: Option[String], osgiPeriodhttpPeriodwhiteboardPeriodservletPeriodpattern: Option[String], osgiPeriodhttpPeriodwhiteboardPeriodcontextPeriodselect: Option[String]): Either[CommonError,ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletInfo
        */
        def Configmgr_comAdobeGraniteOauthServerImplOAuth2TokenRevocationServlet(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], oauthPeriodtokenPeriodrevocationPeriodactive: Option[Boolean]): Either[CommonError,ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeGraniteOffloadingImplOffloadingConfiguratorInfo
        */
        def Configmgr_comAdobeGraniteOffloadingImplOffloadingConfigurator(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], offloadingPeriodtransporter: Option[String], offloadingPeriodcleanupPeriodpayload: Option[Boolean]): Either[CommonError,ComAdobeGraniteOffloadingImplOffloadingConfiguratorInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeGraniteOffloadingImplOffloadingJobClonerInfo
        */
        def Configmgr_comAdobeGraniteOffloadingImplOffloadingJobCloner(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], offloadingPeriodjobclonerPeriodenabled: Option[Boolean]): Either[CommonError,ComAdobeGraniteOffloadingImplOffloadingJobClonerInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeGraniteOffloadingImplOffloadingJobOffloaderInfo
        */
        def Configmgr_comAdobeGraniteOffloadingImplOffloadingJobOffloader(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], offloadingPeriodoffloaderPeriodenabled: Option[Boolean]): Either[CommonError,ComAdobeGraniteOffloadingImplOffloadingJobOffloaderInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerInfo
        */
        def Configmgr_comAdobeGraniteOffloadingImplTransporterOffloadingAgentManager(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], offloadingPeriodagentmanagerPeriodenabled: Option[Boolean]): Either[CommonError,ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoInfo
        */
        def Configmgr_comAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspo(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], defaultPeriodtransportPeriodagentToWorkerPeriodprefix: Option[String], defaultPeriodtransportPeriodagentToMasterPeriodprefix: Option[String], defaultPeriodtransportPeriodinputPeriodpackage: Option[String], defaultPeriodtransportPeriodoutputPeriodpackage: Option[String], defaultPeriodtransportPeriodreplicationPeriodsynchronous: Option[Boolean], defaultPeriodtransportPeriodcontentpackage: Option[Boolean], offloadingPeriodtransporterPerioddefaultPeriodenabled: Option[Boolean]): Either[CommonError,ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplInfo
        */
        def Configmgr_comAdobeGraniteOmnisearchImplCoreOmniSearchServiceImpl(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], omnisearchPeriodsuggestionPeriodrequiretextPeriodmin: Option[Int], omnisearchPeriodsuggestionPeriodspellcheckPeriodrequire: Option[Boolean]): Either[CommonError,ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeGraniteOptoutImplOptOutServiceImplInfo
        */
        def Configmgr_comAdobeGraniteOptoutImplOptOutServiceImpl(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], optoutPeriodcookies: Seq[String], optoutPeriodheaders: Seq[String], optoutPeriodwhitelistPeriodcookies: Seq[String]): Either[CommonError,ComAdobeGraniteOptoutImplOptOutServiceImplInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckInfo
        */
        def Configmgr_comAdobeGraniteQueriesImplHcAsyncIndexHealthCheck(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], indexingPeriodcriticalPeriodthreshold: Option[Int], indexingPeriodwarnPeriodthreshold: Option[Int], hcPeriodtags: Seq[String]): Either[CommonError,ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckInfo
        */
        def Configmgr_comAdobeGraniteQueriesImplHcLargeIndexHealthCheck(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], largePeriodindexPeriodcriticalPeriodthreshold: Option[Int], largePeriodindexPeriodwarnPeriodthreshold: Option[Int], hcPeriodtags: Seq[String]): Either[CommonError,ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheckInfo
        */
        def Configmgr_comAdobeGraniteQueriesImplHcQueriesStatusHealthCheck(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], hcPeriodtags: Seq[String]): Either[CommonError,ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheckInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsInfo
        */
        def Configmgr_comAdobeGraniteQueriesImplHcQueryHealthCheckMetrics(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], getPeriod: Option[Int]): Either[CommonError,ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckInfo
        */
        def Configmgr_comAdobeGraniteQueriesImplHcQueryLimitsHealthCheck(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], hcPeriodtags: Seq[String]): Either[CommonError,ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckInfo
        */
        def Configmgr_comAdobeGraniteReplicationHcImplReplicationQueueHealthCheck(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], numberPeriodofPeriodretriesPeriodallowed: Option[Int], hcPeriodtags: Seq[String]): Either[CommonError,ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCInfo
        */
        def Configmgr_comAdobeGraniteReplicationHcImplReplicationTransportUsersHealthC(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], hcPeriodtags: Seq[String]): Either[CommonError,ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckInfo
        */
        def Configmgr_comAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheck(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], hcPeriodtags: Seq[String]): Either[CommonError,ComAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCInfo
        */
        def Configmgr_comAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthC(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], hcPeriodtags: Seq[String], excludePeriodsearchPeriodpath: Seq[String]): Either[CommonError,ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckInfo
        */
        def Configmgr_comAdobeGraniteRepositoryHcImplContinuousRGCHealthCheck(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], hcPeriodtags: Seq[String]): Either[CommonError,ComAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheInfo
        */
        def Configmgr_comAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthChe(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], hcPeriodtags: Seq[String]): Either[CommonError,ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckInfo
        */
        def Configmgr_comAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheck(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], hcPeriodtags: Seq[String], accountPeriodlogins: Seq[String], consolePeriodlogins: Seq[String]): Either[CommonError,ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckInfo
        */
        def Configmgr_comAdobeGraniteRepositoryHcImplDiskSpaceHealthCheck(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], hcPeriodtags: Seq[String], diskPeriodspacePeriodwarnPeriodthreshold: Option[Int], diskPeriodspacePerioderrorPeriodthreshold: Option[Int]): Either[CommonError,ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckInfo
        */
        def Configmgr_comAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheck(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], hcPeriodtags: Seq[String]): Either[CommonError,ComAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeGraniteRepositoryImplCommitStatsConfigInfo
        */
        def Configmgr_comAdobeGraniteRepositoryImplCommitStatsConfig(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], enabled: Option[Boolean], intervalSeconds: Option[Int], commitsPerIntervalThreshold: Option[Int], maxLocationLength: Option[Int], maxDetailsShown: Option[Int], minDetailsPercentage: Option[Int], threadMatchers: Seq[String], maxGreedyDepth: Option[Int], greedyStackMatchers: Option[String], stackFilters: Seq[String], stackMatchers: Seq[String], stackCategorizers: Seq[String], stackShorteners: Seq[String]): Either[CommonError,ComAdobeGraniteRepositoryImplCommitStatsConfigInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeGraniteRepositoryServiceUserConfigurationInfo
        */
        def Configmgr_comAdobeGraniteRepositoryServiceUserConfiguration(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], servicePeriodranking: Option[Int], serviceusersPeriodsimpleSubjectPopulation: Option[Boolean], serviceusersPeriodlist: Seq[String]): Either[CommonError,ComAdobeGraniteRepositoryServiceUserConfigurationInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImInfo
        */
        def Configmgr_comAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckIm(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], hcPeriodtags: Seq[String]): Either[CommonError,ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeGraniteResourcestatusImplCompositeStatusTypeInfo
        */
        def Configmgr_comAdobeGraniteResourcestatusImplCompositeStatusType(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], name: Option[String], types: Seq[String]): Either[CommonError,ComAdobeGraniteResourcestatusImplCompositeStatusTypeInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeGraniteResourcestatusImplStatusResourceProviderImplInfo
        */
        def Configmgr_comAdobeGraniteResourcestatusImplStatusResourceProviderImpl(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], providerPeriodroot: Option[String]): Either[CommonError,ComAdobeGraniteResourcestatusImplStatusResourceProviderImplInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterInfo
        */
        def Configmgr_comAdobeGraniteRestAssetsImplAssetContentDispositionFilter(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], mimePeriodallowEmpty: Option[Boolean], mimePeriodallowed: Seq[String]): Either[CommonError,ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplInfo
        */
        def Configmgr_comAdobeGraniteRestImplApiEndpointResourceProviderFactoryImpl(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], providerPeriodroots: Option[String]): Either[CommonError,ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeGraniteRestImplServletDefaultGETServletInfo
        */
        def Configmgr_comAdobeGraniteRestImplServletDefaultGETServlet(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], defaultPeriodlimit: Option[Int], usePeriodabsolutePerioduri: Option[Boolean]): Either[CommonError,ComAdobeGraniteRestImplServletDefaultGETServletInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSInfo
        */
        def Configmgr_comAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationS(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], hcPeriodtags: Seq[String]): Either[CommonError,ComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeGraniteSecurityUserUserPropertiesServiceInfo
        */
        def Configmgr_comAdobeGraniteSecurityUserUserPropertiesService(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], adapterPeriodcondition: Option[String], granitePerioduserpropertiesPeriodnodetypes: Seq[String], granitePerioduserpropertiesPeriodresourcetypes: Seq[String]): Either[CommonError,ComAdobeGraniteSecurityUserUserPropertiesServiceInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplInfo
        */
        def Configmgr_comAdobeGraniteSocialgraphImplSocialGraphFactoryImpl(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], group2memberPeriodrelationshipPeriodoutgoing: Option[String], group2memberPeriodexcludedPeriodoutgoing: Seq[String], group2memberPeriodrelationshipPeriodincoming: Option[String], group2memberPeriodexcludedPeriodincoming: Seq[String]): Either[CommonError,ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplInfo
        */
        def Configmgr_comAdobeGraniteSystemMonitoringImplSystemStatsMBeanImpl(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], schedulerPeriodexpression: Option[String], jmxPeriodobjectname: Option[String]): Either[CommonError,ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryInfo
        */
        def Configmgr_comAdobeGraniteTaskmanagementImplJcrTaskAdapterFactory(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], adapterPeriodcondition: Option[String]): Either[CommonError,ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceInfo
        */
        def Configmgr_comAdobeGraniteTaskmanagementImplJcrTaskArchiveService(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], archivingPeriodenabled: Option[Boolean], schedulerPeriodexpression: Option[String], archivePeriodsincePerioddaysPeriodcompleted: Option[Int]): Either[CommonError,ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskInfo
        */
        def Configmgr_comAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTask(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], purgeCompleted: Option[Boolean], completedAge: Option[Int], purgeActive: Option[Boolean], activeAge: Option[Int], saveThreshold: Option[Int]): Either[CommonError,ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorInfo
        */
        def Configmgr_comAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactor(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], adapterPeriodcondition: Option[String], taskmanagerPeriodadmingroups: Seq[String]): Either[CommonError,ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeGraniteThreaddumpThreadDumpCollectorInfo
        */
        def Configmgr_comAdobeGraniteThreaddumpThreadDumpCollector(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], schedulerPeriodperiod: Option[Int], schedulerPeriodrunOn: Option[String], granitePeriodthreaddumpPeriodenabled: Option[Boolean], granitePeriodthreaddumpPerioddumpsPerFile: Option[Int], granitePeriodthreaddumpPeriodenableGzipCompression: Option[Boolean], granitePeriodthreaddumpPeriodenableDirectoriesCompression: Option[Boolean], granitePeriodthreaddumpPeriodenableJStack: Option[Boolean], granitePeriodthreaddumpPeriodmaxBackupDays: Option[Int], granitePeriodthreaddumpPeriodbackupCleanTrigger: Option[String]): Either[CommonError,ComAdobeGraniteThreaddumpThreadDumpCollectorInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslInfo
        */
        def Configmgr_comAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTransl(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], translationFactory: Option[String], defaultConnectorLabel: Option[String], defaultConnectorAttribution: Option[String], defaultConnectorWorkspaceId: Option[String], defaultConnectorSubscriptionKey: Option[String], languageMapLocation: Option[String], categoryMapLocation: Option[String], retryAttempts: Option[Int], timeoutCount: Option[Int]): Either[CommonError,ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeGraniteTranslationCoreImplTranslationManagerImplInfo
        */
        def Configmgr_comAdobeGraniteTranslationCoreImplTranslationManagerImpl(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], defaultConnectorName: Option[String], defaultCategory: Option[String]): Either[CommonError,ComAdobeGraniteTranslationCoreImplTranslationManagerImplInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplInfo
        */
        def Configmgr_comAdobeGraniteUiClientlibsImplHtmlLibraryManagerImpl(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], htmllibmanagerPeriodtiming: Option[Boolean], htmllibmanagerPerioddebugPeriodinitPeriodjs: Option[String], htmllibmanagerPeriodminify: Option[Boolean], htmllibmanagerPerioddebug: Option[Boolean], htmllibmanagerPeriodgzip: Option[Boolean], htmllibmanagerPeriodmaxDataUriSize: Option[Int], htmllibmanagerPeriodmaxage: Option[Int], htmllibmanagerPeriodforceCQUrlInfo: Option[Boolean], htmllibmanagerPerioddefaultthemename: Option[String], htmllibmanagerPerioddefaultuserthemename: Option[String], htmllibmanagerPeriodclientmanager: Option[String], htmllibmanagerPeriodpathPeriodlist: Seq[String], htmllibmanagerPeriodexcludedPeriodpathPeriodlist: Seq[String], htmllibmanagerPeriodprocessorPeriodjs: Seq[String], htmllibmanagerPeriodprocessorPeriodcss: Seq[String], htmllibmanagerPeriodlongcachePeriodpatterns: Seq[String], htmllibmanagerPeriodlongcachePeriodformat: Option[String], htmllibmanagerPerioduseFileSystemOutputCache: Option[Boolean], htmllibmanagerPeriodfileSystemOutputCacheLocation: Option[String], htmllibmanagerPerioddisablePeriodreplacement: Seq[String]): Either[CommonError,ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureInfo
        */
        def Configmgr_comAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeature(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], enabled: Option[Boolean]): Either[CommonError,ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceInfo
        */
        def Configmgr_comAdobeGraniteWorkflowConsolePublishWorkflowPublishEventService(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], granitePeriodworkflowPeriodWorkflowPublishEventServicePeriodenabled: Option[Boolean]): Either[CommonError,ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerInfo
        */
        def Configmgr_comAdobeGraniteWorkflowCoreJcrWorkflowBucketManager(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], bucketSize: Option[Int]): Either[CommonError,ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerInfo
        */
        def Configmgr_comAdobeGraniteWorkflowCoreJobExternalProcessJobHandler(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], defaultPeriodtimeout: Option[Int], maxPeriodtimeout: Option[Int], defaultPeriodperiod: Option[Int]): Either[CommonError,ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeGraniteWorkflowCoreJobJobHandlerInfo
        */
        def Configmgr_comAdobeGraniteWorkflowCoreJobJobHandler(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], jobPeriodtopics: Seq[String], allowPeriodselfPeriodprocessPeriodtermination: Option[Boolean]): Either[CommonError,ComAdobeGraniteWorkflowCoreJobJobHandlerInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumInfo
        */
        def Configmgr_comAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsum(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], jobPeriodtopics: Option[String]): Either[CommonError,ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeGraniteWorkflowCorePayloadMapCacheInfo
        */
        def Configmgr_comAdobeGraniteWorkflowCorePayloadMapCache(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], getSystemWorkflowModels: Seq[String], getPackageRootPath: Option[String]): Either[CommonError,ComAdobeGraniteWorkflowCorePayloadMapCacheInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerInfo
        */
        def Configmgr_comAdobeGraniteWorkflowCorePayloadmapPayloadMoveListener(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], payloadPeriodmovePeriodwhitePeriodlist: Seq[String], payloadPeriodmovePeriodhandlePeriodfromPeriodworkflowPeriodprocess: Option[Boolean]): Either[CommonError,ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeGraniteWorkflowCoreWorkflowConfigInfo
        */
        def Configmgr_comAdobeGraniteWorkflowCoreWorkflowConfig(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], cqPeriodworkflowPeriodconfigPeriodworkflowPeriodpackagesPeriodrootPeriodpath: Seq[String], cqPeriodworkflowPeriodconfigPeriodworkflowPeriodprocessPeriodlegacyPeriodmode: Option[Boolean], cqPeriodworkflowPeriodconfigPeriodallowPeriodlocking: Option[Boolean]): Either[CommonError,ComAdobeGraniteWorkflowCoreWorkflowConfigInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryInfo
        */
        def Configmgr_comAdobeGraniteWorkflowCoreWorkflowSessionFactory(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], granitePeriodworkflowinboxPeriodsortPeriodpropertyName: Option[String], granitePeriodworkflowinboxPeriodsortPeriodorder: Option[String], cqPeriodworkflowPeriodjobPeriodretry: Option[Int], cqPeriodworkflowPeriodsuperuser: Seq[String], granitePeriodworkflowPeriodinboxQuerySize: Option[Int], granitePeriodworkflowPeriodadminUserGroupFilter: Option[Boolean], granitePeriodworkflowPeriodenforceWorkitemAssigneePermissions: Option[Boolean], granitePeriodworkflowPeriodenforceWorkflowInitiatorPermissions: Option[Boolean], granitePeriodworkflowPeriodinjectTenantIdInJobTopics: Option[Boolean], granitePeriodworkflowPeriodmaxPurgeSaveThreshold: Option[Int], granitePeriodworkflowPeriodmaxPurgeQueryCount: Option[Int]): Either[CommonError,ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeGraniteWorkflowPurgeSchedulerInfo
        */
        def Configmgr_comAdobeGraniteWorkflowPurgeScheduler(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], scheduledpurgePeriodname: Option[String], scheduledpurgePeriodworkflowStatus: Option[String], scheduledpurgePeriodmodelIds: Seq[String], scheduledpurgePerioddaysold: Option[Int]): Either[CommonError,ComAdobeGraniteWorkflowPurgeSchedulerInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeOctopusNcommBootstrapInfo
        */
        def Configmgr_comAdobeOctopusNcommBootstrap(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], maxConnections: Option[Int], maxRequests: Option[Int], requestTimeout: Option[Int], requestRetries: Option[Int], launchTimeout: Option[Int]): Either[CommonError,ComAdobeOctopusNcommBootstrapInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSInfo
        */
        def Configmgr_comAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullS(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], communitiesPeriodintegrationPeriodlivefyrePeriodslingPeriodeventPeriodfilter: Option[String]): Either[CommonError,ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSInfo] = Left(TODO)

        /**
        * 
        * @return A ComAdobeXmpWorkerFilesNcommXMPFilesNCommInfo
        */
        def Configmgr_comAdobeXmpWorkerFilesNcommXMPFilesNComm(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], maxConnections: Option[String], maxRequests: Option[String], requestTimeout: Option[String], logDir: Option[String]): Either[CommonError,ComAdobeXmpWorkerFilesNcommXMPFilesNCommInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceInfo
        */
        def Configmgr_comDayCommonsDatasourceJdbcpoolJdbcPoolService(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], jdbcPerioddriverPeriodclass: Option[String], jdbcPeriodconnectionPerioduri: Option[String], jdbcPeriodusername: Option[String], jdbcPeriodpassword: Option[String], jdbcPeriodvalidationPeriodquery: Option[String], defaultPeriodreadonly: Option[Boolean], defaultPeriodautocommit: Option[Boolean], poolPeriodsize: Option[Int], poolPeriodmaxPeriodwaitPeriodmsec: Option[Int], datasourcePeriodname: Option[String], datasourcePeriodsvcPeriodproperties: Seq[String]): Either[CommonError,ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCommonsHttpclientInfo
        */
        def Configmgr_comDayCommonsHttpclient(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], proxyPeriodenabled: Option[Boolean], proxyPeriodhost: Option[String], proxyPerioduser: Option[String], proxyPeriodpassword: Option[String], proxyPeriodntlmPeriodhost: Option[String], proxyPeriodntlmPerioddomain: Option[String], proxyPeriodexceptions: Seq[String]): Either[CommonError,ComDayCommonsHttpclientInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqAnalyticsImplStorePropertiesChangeListenerInfo
        */
        def Configmgr_comDayCqAnalyticsImplStorePropertiesChangeListener(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], cqPeriodstorePeriodlistenerPeriodadditionalStorePaths: Seq[String]): Either[CommonError,ComDayCqAnalyticsImplStorePropertiesChangeListenerInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteInfo
        */
        def Configmgr_comDayCqAnalyticsSitecatalystImplExporterClassificationsExporte(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], allowedPeriodpaths: Seq[String], cqPeriodanalyticsPeriodsaintPeriodexporterPeriodpagesize: Option[Int]): Either[CommonError,ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqAnalyticsSitecatalystImplImporterReportImporterInfo
        */
        def Configmgr_comDayCqAnalyticsSitecatalystImplImporterReportImporter(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], reportPeriodfetchPeriodattempts: Option[Int], reportPeriodfetchPerioddelay: Option[Int]): Either[CommonError,ComDayCqAnalyticsSitecatalystImplImporterReportImporterInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryInfo
        */
        def Configmgr_comDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactory(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], cqPeriodanalyticsPeriodadapterfactoryPeriodcontextstores: Seq[String]): Either[CommonError,ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplInfo
        */
        def Configmgr_comDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImpl(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], cqPeriodanalyticsPeriodsitecatalystPeriodservicePerioddatacenterPeriodurl: Seq[String], devhostnamepatterns: Seq[String], connectionPeriodtimeout: Option[Int], socketPeriodtimeout: Option[Int]): Either[CommonError,ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterInfo
        */
        def Configmgr_comDayCqAnalyticsTestandtargetImplAccountOptionsUpdater(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], cqPeriodanalyticsPeriodtestandtargetPeriodaccountoptionsupdaterPeriodenabled: Option[Boolean]): Either[CommonError,ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerInfo
        */
        def Configmgr_comDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListener(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], cqPeriodanalyticsPeriodtestandtargetPerioddeleteauthoractivitylistenerPeriodenabled: Option[Boolean]): Either[CommonError,ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerInfo
        */
        def Configmgr_comDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListener(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], cqPeriodanalyticsPeriodtestandtargetPeriodpushauthorcampaignpagelistenerPeriodenabled: Option[Boolean]): Either[CommonError,ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqAnalyticsTestandtargetImplSegmentImporterInfo
        */
        def Configmgr_comDayCqAnalyticsTestandtargetImplSegmentImporter(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], cqPeriodanalyticsPeriodtestandtargetPeriodsegmentimporterPeriodenabled: Option[Boolean]): Either[CommonError,ComDayCqAnalyticsTestandtargetImplSegmentImporterInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplInfo
        */
        def Configmgr_comDayCqAnalyticsTestandtargetImplServiceWebServiceImpl(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], endpointUri: Option[String], connectionTimeout: Option[Int], socketTimeout: Option[Int]): Either[CommonError,ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletInfo
        */
        def Configmgr_comDayCqAnalyticsTestandtargetImplServletsAdminServerServlet(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], testandtargetPeriodendpointPeriodurl: Option[String]): Either[CommonError,ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplInfo
        */
        def Configmgr_comDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImpl(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], cqPeriodanalyticsPeriodtestandtargetPeriodapiPeriodurl: Option[String], cqPeriodanalyticsPeriodtestandtargetPeriodtimeout: Option[Int], cqPeriodanalyticsPeriodtestandtargetPeriodsockettimeout: Option[Int], cqPeriodanalyticsPeriodtestandtargetPeriodrecommendationsPeriodurlPeriodreplace: Option[String], cqPeriodanalyticsPeriodtestandtargetPeriodrecommendationsPeriodurlPeriodreplacewith: Option[String]): Either[CommonError,ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqAuthImplCugCugSupportImplInfo
        */
        def Configmgr_comDayCqAuthImplCugCugSupportImpl(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], cugPeriodexemptedPeriodprincipals: Seq[String], cugPeriodenabled: Option[Boolean], cugPeriodprincipalsPeriodregex: Option[String], cugPeriodprincipalsPeriodreplacement: Option[String]): Either[CommonError,ComDayCqAuthImplCugCugSupportImplInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqAuthImplLoginSelectorHandlerInfo
        */
        def Configmgr_comDayCqAuthImplLoginSelectorHandler(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], path: Option[String], servicePeriodranking: Option[Int], authPeriodloginselectorPeriodmappings: Seq[String], authPeriodloginselectorPeriodchangepwPeriodmappings: Seq[String], authPeriodloginselectorPerioddefaultloginpage: Option[String], authPeriodloginselectorPerioddefaultchangepwpage: Option[String], authPeriodloginselectorPeriodhandle: Seq[String], authPeriodloginselectorPeriodhandlePeriodallPeriodextensions: Option[Boolean]): Either[CommonError,ComDayCqAuthImplLoginSelectorHandlerInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqCommonsImplExternalizerImplInfo
        */
        def Configmgr_comDayCqCommonsImplExternalizerImpl(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], externalizerPerioddomains: Seq[String], externalizerPeriodhost: Option[String], externalizerPeriodcontextpath: Option[String], externalizerPeriodencodedpath: Option[Boolean]): Either[CommonError,ComDayCqCommonsImplExternalizerImplInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqCommonsServletsRootMappingServletInfo
        */
        def Configmgr_comDayCqCommonsServletsRootMappingServlet(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], rootmappingPeriodtarget: Option[String]): Either[CommonError,ComDayCqCommonsServletsRootMappingServletInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeInfo
        */
        def Configmgr_comDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionChecke(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], codeupgradetasks: Seq[String], codeupgradetaskfilters: Seq[String]): Either[CommonError,ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListInfo
        */
        def Configmgr_comDayCqCompatCodeupgradeImplUpgradeTaskIgnoreList(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], upgradeTaskIgnoreList: Seq[String]): Either[CommonError,ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistInfo
        */
        def Configmgr_comDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelist(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], effectiveBundleListPath: Option[String]): Either[CommonError,ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqContentsyncImplContentSyncManagerImplInfo
        */
        def Configmgr_comDayCqContentsyncImplContentSyncManagerImpl(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], contentsyncPeriodfallbackPeriodauthorizable: Option[String], contentsyncPeriodfallbackPeriodupdateuser: Option[String]): Either[CommonError,ComDayCqContentsyncImplContentSyncManagerImplInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqDamCommonsHandlerStandardImageHandlerInfo
        */
        def Configmgr_comDayCqDamCommonsHandlerStandardImageHandler(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], largeFileThreshold: Option[Int], largeCommentThreshold: Option[Int], cqPerioddamPeriodenablePeriodextPeriodmetaPeriodextraction: Option[Boolean]): Either[CommonError,ComDayCqDamCommonsHandlerStandardImageHandlerInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqDamCommonsMetadataXmpFilterBlackWhiteInfo
        */
        def Configmgr_comDayCqDamCommonsMetadataXmpFilterBlackWhite(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], xmpPeriodfilterPeriodapplyWhitelist: Option[Boolean], xmpPeriodfilterPeriodwhitelist: Seq[String], xmpPeriodfilterPeriodapplyBlacklist: Option[Boolean], xmpPeriodfilterPeriodblacklist: Seq[String]): Either[CommonError,ComDayCqDamCommonsMetadataXmpFilterBlackWhiteInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqDamCommonsUtilImplAssetCacheImplInfo
        */
        def Configmgr_comDayCqDamCommonsUtilImplAssetCacheImpl(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], largePeriodfilePeriodmin: Option[Int], cachePeriodapply: Option[Boolean], mimePeriodtypes: Seq[String]): Either[CommonError,ComDayCqDamCommonsUtilImplAssetCacheImplInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigInfo
        */
        def Configmgr_comDayCqDamCoreImplAnnotationPdfAnnotationPdfConfig(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], cqPerioddamPeriodconfigPeriodannotationPeriodpdfPerioddocumentPeriodwidth: Option[Int], cqPerioddamPeriodconfigPeriodannotationPeriodpdfPerioddocumentPeriodheight: Option[Int], cqPerioddamPeriodconfigPeriodannotationPeriodpdfPerioddocumentPeriodpaddingPeriodhorizontal: Option[Int], cqPerioddamPeriodconfigPeriodannotationPeriodpdfPerioddocumentPeriodpaddingPeriodvertical: Option[Int], cqPerioddamPeriodconfigPeriodannotationPeriodpdfPeriodfontPeriodsize: Option[Int], cqPerioddamPeriodconfigPeriodannotationPeriodpdfPeriodfontPeriodcolor: Option[String], cqPerioddamPeriodconfigPeriodannotationPeriodpdfPeriodfontPeriodfamily: Option[String], cqPerioddamPeriodconfigPeriodannotationPeriodpdfPeriodfontPeriodlight: Option[String], cqPerioddamPeriodconfigPeriodannotationPeriodpdfPeriodmarginTextImage: Option[Int], cqPerioddamPeriodconfigPeriodannotationPeriodpdfPeriodminImageHeight: Option[Int], cqPerioddamPeriodconfigPeriodannotationPeriodpdfPeriodreviewStatusPeriodwidth: Option[Int], cqPerioddamPeriodconfigPeriodannotationPeriodpdfPeriodreviewStatusPeriodcolorPeriodapproved: Option[String], cqPerioddamPeriodconfigPeriodannotationPeriodpdfPeriodreviewStatusPeriodcolorPeriodrejected: Option[String], cqPerioddamPeriodconfigPeriodannotationPeriodpdfPeriodreviewStatusPeriodcolorPeriodchangesRequested: Option[String], cqPerioddamPeriodconfigPeriodannotationPeriodpdfPeriodannotationMarkerPeriodwidth: Option[Int], cqPerioddamPeriodconfigPeriodannotationPeriodpdfPeriodassetPeriodminheight: Option[Int]): Either[CommonError,ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqDamCoreImplAssetMoveListenerInfo
        */
        def Configmgr_comDayCqDamCoreImplAssetMoveListener(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], enabled: Option[Boolean]): Either[CommonError,ComDayCqDamCoreImplAssetMoveListenerInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationInfo
        */
        def Configmgr_comDayCqDamCoreImplAssethomeAssetHomePageConfiguration(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], isEnabled: Option[Boolean]): Either[CommonError,ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletInfo
        */
        def Configmgr_comDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServlet(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], cqPerioddamPeriodadhocPeriodassetPeriodsharePeriodprezipPeriodmaxcontentsize: Option[Int]): Either[CommonError,ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqDamCoreImplCacheCQBufferedImageCacheInfo
        */
        def Configmgr_comDayCqDamCoreImplCacheCQBufferedImageCache(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], cqPerioddamPeriodimagePeriodcachePeriodmaxPeriodmemory: Option[Int], cqPerioddamPeriodimagePeriodcachePeriodmaxPeriodage: Option[Int], cqPerioddamPeriodimagePeriodcachePeriodmaxPerioddimension: Option[String]): Either[CommonError,ComDayCqDamCoreImplCacheCQBufferedImageCacheInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqDamCoreImplDamChangeEventListenerInfo
        */
        def Configmgr_comDayCqDamCoreImplDamChangeEventListener(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], changeeventlistenerPeriodobservedPeriodpaths: Seq[String]): Either[CommonError,ComDayCqDamCoreImplDamChangeEventListenerInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqDamCoreImplDamEventPurgeServiceInfo
        */
        def Configmgr_comDayCqDamCoreImplDamEventPurgeService(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], schedulerPeriodexpression: Option[String], maxSavedActivities: Option[Int], saveInterval: Option[Int], enableActivityPurge: Option[Boolean], eventTypes: Option[String]): Either[CommonError,ComDayCqDamCoreImplDamEventPurgeServiceInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqDamCoreImplDamEventRecorderImplInfo
        */
        def Configmgr_comDayCqDamCoreImplDamEventRecorderImpl(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], eventPeriodfilter: Option[String], eventPeriodqueuePeriodlength: Option[Int], eventrecorderPeriodenabled: Option[Boolean], eventrecorderPeriodblacklist: Seq[String], eventrecorderPeriodeventtypes: Option[String]): Either[CommonError,ComDayCqDamCoreImplDamEventRecorderImplInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqDamCoreImplEventDamEventAuditListenerInfo
        */
        def Configmgr_comDayCqDamCoreImplEventDamEventAuditListener(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], eventPeriodfilter: Option[String], enabled: Option[Boolean]): Either[CommonError,ComDayCqDamCoreImplEventDamEventAuditListenerInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqDamCoreImplExpiryNotificationJobImplInfo
        */
        def Configmgr_comDayCqDamCoreImplExpiryNotificationJobImpl(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], cqPerioddamPeriodexpiryPeriodnotificationPeriodschedulerPeriodistimebased: Option[Boolean], cqPerioddamPeriodexpiryPeriodnotificationPeriodschedulerPeriodtimebasedPeriodrule: Option[String], cqPerioddamPeriodexpiryPeriodnotificationPeriodschedulerPeriodperiodPeriodrule: Option[Int], sendEmail: Option[Boolean], assetExpiredLimit: Option[Int], priorNotificationSeconds: Option[Int], cqPerioddamPeriodexpiryPeriodnotificationPeriodurlPeriodprotocol: Option[String]): Either[CommonError,ComDayCqDamCoreImplExpiryNotificationJobImplInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatInfo
        */
        def Configmgr_comDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeat(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], isEnabled: Option[Boolean]): Either[CommonError,ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqDamCoreImplGfxCommonsGfxRendererInfo
        */
        def Configmgr_comDayCqDamCoreImplGfxCommonsGfxRenderer(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], skipPeriodbufferedcache: Option[Boolean]): Either[CommonError,ComDayCqDamCoreImplGfxCommonsGfxRendererInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqDamCoreImplHandlerEPSFormatHandlerInfo
        */
        def Configmgr_comDayCqDamCoreImplHandlerEPSFormatHandler(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], mimetype: Option[String]): Either[CommonError,ComDayCqDamCoreImplHandlerEPSFormatHandlerInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqDamCoreImplHandlerIndesignFormatHandlerInfo
        */
        def Configmgr_comDayCqDamCoreImplHandlerIndesignFormatHandler(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], mimetype: Seq[String]): Either[CommonError,ComDayCqDamCoreImplHandlerIndesignFormatHandlerInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqDamCoreImplHandlerJpegHandlerInfo
        */
        def Configmgr_comDayCqDamCoreImplHandlerJpegHandler(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], cqPerioddamPeriodenablePeriodextPeriodmetaPeriodextraction: Option[Boolean], largeFileThreshold: Option[Int], largeCommentThreshold: Option[Int]): Either[CommonError,ComDayCqDamCoreImplHandlerJpegHandlerInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerInfo
        */
        def Configmgr_comDayCqDamCoreImplHandlerXmpNCommXMPHandler(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], xmphandlerPeriodcqPeriodformats: Seq[String]): Either[CommonError,ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorInfo
        */
        def Configmgr_comDayCqDamCoreImplJmxAssetIndexUpdateMonitor(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], jmxPeriodobjectname: Option[String], propertyPeriodmeasurePeriodenabled: Option[Boolean], propertyPeriodname: Option[String], propertyPeriodmaxPeriodwaitPeriodms: Option[Int], propertyPeriodmaxPeriodrate: Option[BigDecimal], fulltextPeriodmeasurePeriodenabled: Option[Boolean], fulltextPeriodname: Option[String], fulltextPeriodmaxPeriodwaitPeriodms: Option[Int], fulltextPeriodmaxPeriodrate: Option[BigDecimal]): Either[CommonError,ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqDamCoreImplJmxAssetMigrationMBeanImplInfo
        */
        def Configmgr_comDayCqDamCoreImplJmxAssetMigrationMBeanImpl(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], jmxPeriodobjectname: Option[String]): Either[CommonError,ComDayCqDamCoreImplJmxAssetMigrationMBeanImplInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqDamCoreImplJmxAssetUpdateMonitorImplInfo
        */
        def Configmgr_comDayCqDamCoreImplJmxAssetUpdateMonitorImpl(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], jmxPeriodobjectname: Option[String], active: Option[Boolean]): Either[CommonError,ComDayCqDamCoreImplJmxAssetUpdateMonitorImplInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigInfo
        */
        def Configmgr_comDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfig(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], operation: Option[String], emailEnabled: Option[Boolean]): Either[CommonError,ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigInfo
        */
        def Configmgr_comDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfig(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], operation: Option[String], operationIcon: Option[String], topicName: Option[String], emailEnabled: Option[Boolean]): Either[CommonError,ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqDamCoreImplLightboxLightboxServletInfo
        */
        def Configmgr_comDayCqDamCoreImplLightboxLightboxServlet(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], slingPeriodservletPeriodpaths: Option[String], slingPeriodservletPeriodmethods: Seq[String], cqPerioddamPeriodenablePeriodanonymous: Option[Boolean]): Either[CommonError,ComDayCqDamCoreImplLightboxLightboxServletInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerInfo
        */
        def Configmgr_comDayCqDamCoreImplMetadataEditorSelectComponentHandler(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], graniteData: Seq[String]): Either[CommonError,ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperInfo
        */
        def Configmgr_comDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelper(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], cqPerioddamPeriodallowPeriodallPeriodmime: Option[Boolean], cqPerioddamPeriodallowedPeriodassetPeriodmimes: Seq[String]): Either[CommonError,ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplInfo
        */
        def Configmgr_comDayCqDamCoreImplMimeTypeDamMimeTypeServiceImpl(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], cqPerioddamPerioddetectPeriodassetPeriodmimePeriodfromPeriodcontent: Option[Boolean]): Either[CommonError,ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqDamCoreImplMissingMetadataNotificationJobInfo
        */
        def Configmgr_comDayCqDamCoreImplMissingMetadataNotificationJob(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], cqPerioddamPeriodmissingmetadataPeriodnotificationPeriodschedulerPeriodistimebased: Option[Boolean], cqPerioddamPeriodmissingmetadataPeriodnotificationPeriodschedulerPeriodtimebasedPeriodrule: Option[String], cqPerioddamPeriodmissingmetadataPeriodnotificationPeriodschedulerPeriodperiodPeriodrule: Option[Int], cqPerioddamPeriodmissingmetadataPeriodnotificationPeriodrecipient: Option[String]): Either[CommonError,ComDayCqDamCoreImplMissingMetadataNotificationJobInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrInfo
        */
        def Configmgr_comDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPr(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], processPeriodlabel: Option[String], notify on Complete: Option[Boolean]): Either[CommonError,ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqDamCoreImplProcessTextExtractionProcessInfo
        */
        def Configmgr_comDayCqDamCoreImplProcessTextExtractionProcess(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], mimeTypes: Seq[String], maxExtract: Option[Int]): Either[CommonError,ComDayCqDamCoreImplProcessTextExtractionProcessInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqDamCoreImplRenditionMakerImplInfo
        */
        def Configmgr_comDayCqDamCoreImplRenditionMakerImpl(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], xmpPeriodpropagate: Option[Boolean], xmpPeriodexcludes: Seq[String]): Either[CommonError,ComDayCqDamCoreImplRenditionMakerImplInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqDamCoreImplReportsReportExportServiceInfo
        */
        def Configmgr_comDayCqDamCoreImplReportsReportExportService(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], queryBatchSize: Option[Int]): Either[CommonError,ComDayCqDamCoreImplReportsReportExportServiceInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqDamCoreImplReportsReportPurgeServiceInfo
        */
        def Configmgr_comDayCqDamCoreImplReportsReportPurgeService(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], schedulerPeriodexpression: Option[String], maxSavedReports: Option[Int], timeDuration: Option[Int], enableReportPurge: Option[Boolean]): Either[CommonError,ComDayCqDamCoreImplReportsReportPurgeServiceInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqDamCoreImplServletAssetDownloadServletInfo
        */
        def Configmgr_comDayCqDamCoreImplServletAssetDownloadServlet(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], enabled: Option[Boolean]): Either[CommonError,ComDayCqDamCoreImplServletAssetDownloadServletInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqDamCoreImplServletAssetStatusServletInfo
        */
        def Configmgr_comDayCqDamCoreImplServletAssetStatusServlet(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], cqPerioddamPeriodbatchPeriodstatusPeriodmaxassets: Option[Int]): Either[CommonError,ComDayCqDamCoreImplServletAssetStatusServletInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqDamCoreImplServletAssetXMPSearchServletInfo
        */
        def Configmgr_comDayCqDamCoreImplServletAssetXMPSearchServlet(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], cqPerioddamPeriodbatchPeriodindesignPeriodmaxassets: Option[Int]): Either[CommonError,ComDayCqDamCoreImplServletAssetXMPSearchServletInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqDamCoreImplServletBatchMetadataServletInfo
        */
        def Configmgr_comDayCqDamCoreImplServletBatchMetadataServlet(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], cqPerioddamPeriodbatchPeriodmetadataPeriodassetPerioddefault: Seq[String], cqPerioddamPeriodbatchPeriodmetadataPeriodcollectionPerioddefault: Seq[String], cqPerioddamPeriodbatchPeriodmetadataPeriodmaxresources: Option[Int]): Either[CommonError,ComDayCqDamCoreImplServletBatchMetadataServletInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqDamCoreImplServletBinaryProviderServletInfo
        */
        def Configmgr_comDayCqDamCoreImplServletBinaryProviderServlet(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], slingPeriodservletPeriodresourceTypes: Seq[String], slingPeriodservletPeriodmethods: Seq[String], cqPerioddamPerioddrmPeriodenable: Option[Boolean]): Either[CommonError,ComDayCqDamCoreImplServletBinaryProviderServletInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqDamCoreImplServletCollectionServletInfo
        */
        def Configmgr_comDayCqDamCoreImplServletCollectionServlet(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], cqPerioddamPeriodbatchPeriodcollectionPeriodproperties: Seq[String], cqPerioddamPeriodbatchPeriodcollectionPeriodmaxcollections: Option[Int]): Either[CommonError,ComDayCqDamCoreImplServletCollectionServletInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqDamCoreImplServletCollectionsServletInfo
        */
        def Configmgr_comDayCqDamCoreImplServletCollectionsServlet(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], cqPerioddamPeriodbatchPeriodcollectionsPeriodproperties: Seq[String], cqPerioddamPeriodbatchPeriodcollectionsPeriodlimit: Option[Int]): Either[CommonError,ComDayCqDamCoreImplServletCollectionsServletInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqDamCoreImplServletCompanionServletInfo
        */
        def Configmgr_comDayCqDamCoreImplServletCompanionServlet(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], more Info: Option[String], SlashmntSlashoverlaySlashdamSlashguiSlashcontentSlashassetsSlashmoreinfoPeriodhtmlSlashDollarLeft_Curly_BracketpathRight_Curly_Bracket: Option[String]): Either[CommonError,ComDayCqDamCoreImplServletCompanionServletInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqDamCoreImplServletCreateAssetServletInfo
        */
        def Configmgr_comDayCqDamCoreImplServletCreateAssetServlet(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], detectDuplicate: Option[Boolean]): Either[CommonError,ComDayCqDamCoreImplServletCreateAssetServletInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqDamCoreImplServletDamContentDispositionFilterInfo
        */
        def Configmgr_comDayCqDamCoreImplServletDamContentDispositionFilter(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], cqPeriodmimePeriodtypePeriodblacklist: Seq[String], cqPerioddamPeriodemptyPeriodmime: Option[Boolean]): Either[CommonError,ComDayCqDamCoreImplServletDamContentDispositionFilterInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqDamCoreImplServletGuidLookupFilterInfo
        */
        def Configmgr_comDayCqDamCoreImplServletGuidLookupFilter(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], cqPerioddamPeriodcorePeriodguidlookupfilterPeriodenabled: Option[Boolean]): Either[CommonError,ComDayCqDamCoreImplServletGuidLookupFilterInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqDamCoreImplServletHealthCheckServletInfo
        */
        def Configmgr_comDayCqDamCoreImplServletHealthCheckServlet(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], cqPerioddamPeriodsyncPeriodworkflowPeriodid: Option[String], cqPerioddamPeriodsyncPeriodfolderPeriodtypes: Seq[String]): Either[CommonError,ComDayCqDamCoreImplServletHealthCheckServletInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqDamCoreImplServletMetadataGetServletInfo
        */
        def Configmgr_comDayCqDamCoreImplServletMetadataGetServlet(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], slingPeriodservletPeriodresourceTypes: Option[String], slingPeriodservletPeriodmethods: Option[String], slingPeriodservletPeriodextensions: Option[String], slingPeriodservletPeriodselectors: Option[String]): Either[CommonError,ComDayCqDamCoreImplServletMetadataGetServletInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqDamCoreImplServletMultipleLicenseAcceptServletInfo
        */
        def Configmgr_comDayCqDamCoreImplServletMultipleLicenseAcceptServlet(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], cqPerioddamPerioddrmPeriodenable: Option[Boolean]): Either[CommonError,ComDayCqDamCoreImplServletMultipleLicenseAcceptServletInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqDamCoreImplServletResourceCollectionServletInfo
        */
        def Configmgr_comDayCqDamCoreImplServletResourceCollectionServlet(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], slingPeriodservletPeriodresourceTypes: Seq[String], slingPeriodservletPeriodmethods: Option[String], slingPeriodservletPeriodselectors: Option[String], downloadPeriodconfig: Option[String], viewPeriodselector: Option[String], sendEmail: Option[Boolean]): Either[CommonError,ComDayCqDamCoreImplServletResourceCollectionServletInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplInfo
        */
        def Configmgr_comDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImpl(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], createPreviewEnabled: Option[Boolean], updatePreviewEnabled: Option[Boolean], queueSize: Option[Int], folderPreviewRenditionRegex: Option[String]): Either[CommonError,ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqDamCoreImplUnzipUnzipConfigInfo
        */
        def Configmgr_comDayCqDamCoreImplUnzipUnzipConfig(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], cqPerioddamPeriodconfigPeriodunzipPeriodmaxuncompressedsize: Option[Int], cqPerioddamPeriodconfigPeriodunzipPeriodencoding: Option[String]): Either[CommonError,ComDayCqDamCoreImplUnzipUnzipConfigInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqDamCoreProcessExifToolExtractMetadataProcessInfo
        */
        def Configmgr_comDayCqDamCoreProcessExifToolExtractMetadataProcess(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], processPeriodlabel: Option[String], cqPerioddamPeriodenablePeriodsha1: Option[Boolean]): Either[CommonError,ComDayCqDamCoreProcessExifToolExtractMetadataProcessInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqDamCoreProcessExtractMetadataProcessInfo
        */
        def Configmgr_comDayCqDamCoreProcessExtractMetadataProcess(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], processPeriodlabel: Option[String], cqPerioddamPeriodenablePeriodsha1: Option[Boolean]): Either[CommonError,ComDayCqDamCoreProcessExtractMetadataProcessInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqDamCoreProcessMetadataProcessorProcessInfo
        */
        def Configmgr_comDayCqDamCoreProcessMetadataProcessorProcess(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], processPeriodlabel: Option[String], cqPerioddamPeriodenablePeriodsha1: Option[Boolean], cqPerioddamPeriodmetadataPeriodxssprotectedPeriodproperties: Seq[String]): Either[CommonError,ComDayCqDamCoreProcessMetadataProcessorProcessInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqDamHandlerFfmpegLocatorImplInfo
        */
        def Configmgr_comDayCqDamHandlerFfmpegLocatorImpl(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], executablePeriodsearchpath: Seq[String]): Either[CommonError,ComDayCqDamHandlerFfmpegLocatorImplInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplInfo
        */
        def Configmgr_comDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImpl(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], eventPeriodfilter: Option[String], fontmgrPeriodsystemPeriodfontPerioddir: Seq[String], fontmgrPeriodadobePeriodfontPerioddir: Option[String], fontmgrPeriodcustomerPeriodfontPerioddir: Option[String]): Either[CommonError,ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqDamHandlerStandardPdfPdfHandlerInfo
        */
        def Configmgr_comDayCqDamHandlerStandardPdfPdfHandler(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], rasterPeriodannotation: Option[Boolean]): Either[CommonError,ComDayCqDamHandlerStandardPdfPdfHandlerInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqDamHandlerStandardPsPostScriptHandlerInfo
        */
        def Configmgr_comDayCqDamHandlerStandardPsPostScriptHandler(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], rasterPeriodannotation: Option[Boolean]): Either[CommonError,ComDayCqDamHandlerStandardPsPostScriptHandlerInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqDamHandlerStandardPsdPsdHandlerInfo
        */
        def Configmgr_comDayCqDamHandlerStandardPsdPsdHandler(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], largeFileThreshold: Option[Int]): Either[CommonError,ComDayCqDamHandlerStandardPsdPsdHandlerInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqDamIdsImplIDSJobProcessorInfo
        */
        def Configmgr_comDayCqDamIdsImplIDSJobProcessor(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], enablePeriodmultisession: Option[Boolean], idsPeriodccPeriodenable: Option[Boolean], enablePeriodretry: Option[Boolean], enablePeriodretryPeriodscripterror: Option[Boolean], externalizerPerioddomainPeriodcqhost: Option[String], externalizerPerioddomainPeriodhttp: Option[String]): Either[CommonError,ComDayCqDamIdsImplIDSJobProcessorInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqDamIdsImplIDSPoolManagerImplInfo
        */
        def Configmgr_comDayCqDamIdsImplIDSPoolManagerImpl(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], maxPerioderrorsPeriodtoPeriodblacklist: Option[Int], retryPeriodintervalPeriodtoPeriodwhitelist: Option[Int], connectPeriodtimeout: Option[Int], socketPeriodtimeout: Option[Int], processPeriodlabel: Option[String], connectionPeriodusePeriodmax: Option[Int]): Either[CommonError,ComDayCqDamIdsImplIDSPoolManagerImplInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqDamInddImplHandlerIndesignXMPHandlerInfo
        */
        def Configmgr_comDayCqDamInddImplHandlerIndesignXMPHandler(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], processPeriodlabel: Option[String], extractPeriodpages: Option[Boolean]): Either[CommonError,ComDayCqDamInddImplHandlerIndesignXMPHandlerInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqDamInddImplServletSnippetCreationServletInfo
        */
        def Configmgr_comDayCqDamInddImplServletSnippetCreationServlet(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], snippetcreationPeriodmaxcollections: Option[Int]): Either[CommonError,ComDayCqDamInddImplServletSnippetCreationServletInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqDamInddProcessINDDMediaExtractProcessInfo
        */
        def Configmgr_comDayCqDamInddProcessINDDMediaExtractProcess(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], processPeriodlabel: Option[String], cqPerioddamPeriodinddPeriodpagesPeriodregex: Option[String], idsPeriodjobPerioddecoupled: Option[Boolean], idsPeriodjobPeriodworkflowPeriodmodel: Option[String]): Either[CommonError,ComDayCqDamInddProcessINDDMediaExtractProcessInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplInfo
        */
        def Configmgr_comDayCqDamPerformanceInternalAssetPerformanceDataHandlerImpl(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], batchPeriodcommitPeriodsize: Option[Int]): Either[CommonError,ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobInfo
        */
        def Configmgr_comDayCqDamPerformanceInternalAssetPerformanceReportSyncJob(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], schedulerPeriodexpression: Option[String]): Either[CommonError,ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProInfo
        */
        def Configmgr_comDayCqDamPimImplSourcingUploadProcessProductAssetsUploadPro(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], deletePeriodzipPeriodfile: Option[Boolean]): Either[CommonError,ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenInfo
        */
        def Configmgr_comDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEven(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], cqPerioddamPeriods7damPerioddynamicmediaconfigeventlistenerPeriodenabled: Option[Boolean]): Either[CommonError,ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerInfo
        */
        def Configmgr_comDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunner(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], schedulerPeriodexpression: Option[String], schedulerPeriodconcurrent: Option[Boolean]): Either[CommonError,ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqDamS7damCommonPostServletsSetCreateHandlerInfo
        */
        def Configmgr_comDayCqDamS7damCommonPostServletsSetCreateHandler(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], slingPeriodpostPeriodoperation: Option[String], slingPeriodservletPeriodmethods: Option[String]): Either[CommonError,ComDayCqDamS7damCommonPostServletsSetCreateHandlerInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqDamS7damCommonPostServletsSetModifyHandlerInfo
        */
        def Configmgr_comDayCqDamS7damCommonPostServletsSetModifyHandler(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], slingPeriodpostPeriodoperation: Option[String], slingPeriodservletPeriodmethods: Option[String]): Either[CommonError,ComDayCqDamS7damCommonPostServletsSetModifyHandlerInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessInfo
        */
        def Configmgr_comDayCqDamS7damCommonProcessVideoThumbnailDownloadProcess(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], processPeriodlabel: Option[String]): Either[CommonError,ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqDamS7damCommonS7damDamChangeEventListenerInfo
        */
        def Configmgr_comDayCqDamS7damCommonS7damDamChangeEventListener(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], cqPerioddamPeriods7damPerioddamchangeeventlistenerPeriodenabled: Option[Boolean]): Either[CommonError,ComDayCqDamS7damCommonS7damDamChangeEventListenerInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqDamS7damCommonServletsS7damProductInfoServletInfo
        */
        def Configmgr_comDayCqDamS7damCommonServletsS7damProductInfoServlet(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], slingPeriodservletPeriodpaths: Option[String], slingPeriodservletPeriodmethods: Option[String]): Either[CommonError,ComDayCqDamS7damCommonServletsS7damProductInfoServletInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplInfo
        */
        def Configmgr_comDayCqDamS7damCommonVideoImplVideoProxyClientServiceImpl(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], cqPerioddamPeriods7damPeriodvideoproxyclientservicePeriodmultipartuploadPeriodminsizePeriodname: Option[Int], cqPerioddamPeriods7damPeriodvideoproxyclientservicePeriodmultipartuploadPeriodpartsizePeriodname: Option[Int], cqPerioddamPeriods7damPeriodvideoproxyclientservicePeriodmultipartuploadPeriodnumthreadPeriodname: Option[Int], cqPerioddamPeriods7damPeriodvideoproxyclientservicePeriodhttpPeriodreadtimeoutPeriodname: Option[Int], cqPerioddamPeriods7damPeriodvideoproxyclientservicePeriodhttpPeriodconnectiontimeoutPeriodname: Option[Int], cqPerioddamPeriods7damPeriodvideoproxyclientservicePeriodhttpPeriodmaxretrycountPeriodname: Option[Int], cqPerioddamPeriods7damPeriodvideoproxyclientservicePerioduploadprogressPeriodintervalPeriodname: Option[Int]): Either[CommonError,ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqDamScene7ImplScene7APIClientImplInfo
        */
        def Configmgr_comDayCqDamScene7ImplScene7APIClientImpl(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], cqPerioddamPeriodscene7PeriodapiclientPeriodrecordsperpagePeriodnofilterPeriodname: Option[Int], cqPerioddamPeriodscene7PeriodapiclientPeriodrecordsperpagePeriodwithfilterPeriodname: Option[Int]): Either[CommonError,ComDayCqDamScene7ImplScene7APIClientImplInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplInfo
        */
        def Configmgr_comDayCqDamScene7ImplScene7AssetMimeTypeServiceImpl(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], cqPerioddamPeriodscene7PeriodassetmimetypeservicePeriodmapping: Seq[String]): Either[CommonError,ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqDamScene7ImplScene7ConfigurationEventListenerInfo
        */
        def Configmgr_comDayCqDamScene7ImplScene7ConfigurationEventListener(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], cqPerioddamPeriodscene7PeriodconfigurationeventlistenerPeriodenabled: Option[Boolean]): Either[CommonError,ComDayCqDamScene7ImplScene7ConfigurationEventListenerInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqDamScene7ImplScene7DamChangeEventListenerInfo
        */
        def Configmgr_comDayCqDamScene7ImplScene7DamChangeEventListener(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], cqPerioddamPeriodscene7PerioddamchangeeventlistenerPeriodenabled: Option[Boolean], cqPerioddamPeriodscene7PerioddamchangeeventlistenerPeriodobservedPeriodpaths: Seq[String]): Either[CommonError,ComDayCqDamScene7ImplScene7DamChangeEventListenerInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplInfo
        */
        def Configmgr_comDayCqDamScene7ImplScene7FlashTemplatesServiceImpl(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], scene7FlashTemplatesPeriodrti: Option[String], scene7FlashTemplatesPeriodrsi: Option[String], scene7FlashTemplatesPeriodrb: Option[String], scene7FlashTemplatesPeriodrurl: Option[String], scene7FlashTemplatePeriodurlFormatParameter: Option[String]): Either[CommonError,ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqDamScene7ImplScene7UploadServiceImplInfo
        */
        def Configmgr_comDayCqDamScene7ImplScene7UploadServiceImpl(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], cqPerioddamPeriodscene7PerioduploadservicePeriodactivejobtimeoutPeriodlabel: Option[Int], cqPerioddamPeriodscene7PerioduploadservicePeriodconnectionmaxperroutePeriodlabel: Option[Int]): Either[CommonError,ComDayCqDamScene7ImplScene7UploadServiceImplInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerInfo
        */
        def Configmgr_comDayCqDamStockIntegrationImplCacheStockCacheConfigurationSer(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], getCacheExpirationUnit: Option[String], getCacheExpirationValue: Option[Int]): Either[CommonError,ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqDamStockIntegrationImplConfigurationStockConfigurationInfo
        */
        def Configmgr_comDayCqDamStockIntegrationImplConfigurationStockConfiguration(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], name: Option[String], locale: Option[String], imsConfig: Option[String]): Either[CommonError,ComDayCqDamStockIntegrationImplConfigurationStockConfigurationInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqDamVideoImplServletVideoTestServletInfo
        */
        def Configmgr_comDayCqDamVideoImplServletVideoTestServlet(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], enabled: Option[Boolean]): Either[CommonError,ComDayCqDamVideoImplServletVideoTestServletInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqExtwidgetServletsImageSpriteServletInfo
        */
        def Configmgr_comDayCqExtwidgetServletsImageSpriteServlet(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], maxWidth: Option[Int], maxHeight: Option[Int]): Either[CommonError,ComDayCqExtwidgetServletsImageSpriteServletInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqImageInternalFontFontHelperInfo
        */
        def Configmgr_comDayCqImageInternalFontFontHelper(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], fontpath: Seq[String], oversamplingFactor: Option[Int]): Either[CommonError,ComDayCqImageInternalFontFontHelperInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqJcrclustersupportClusterStartLevelControllerInfo
        */
        def Configmgr_comDayCqJcrclustersupportClusterStartLevelController(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], clusterPeriodlevelPeriodenable: Option[Boolean], clusterPeriodmasterPeriodlevel: Option[Int], clusterPeriodslavePeriodlevel: Option[Int]): Either[CommonError,ComDayCqJcrclustersupportClusterStartLevelControllerInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqMailerDefaultMailServiceInfo
        */
        def Configmgr_comDayCqMailerDefaultMailService(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], smtpPeriodhost: Option[String], smtpPeriodport: Option[Int], smtpPerioduser: Option[String], smtpPeriodpassword: Option[String], fromPeriodaddress: Option[String], smtpPeriodssl: Option[Boolean], smtpPeriodstarttls: Option[Boolean], debugPeriodemail: Option[Boolean]): Either[CommonError,ComDayCqMailerDefaultMailServiceInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqMailerImplCqMailingServiceInfo
        */
        def Configmgr_comDayCqMailerImplCqMailingService(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], maxPeriodrecipientPeriodcount: Option[String]): Either[CommonError,ComDayCqMailerImplCqMailingServiceInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqMailerImplEmailCqEmailTemplateFactoryInfo
        */
        def Configmgr_comDayCqMailerImplEmailCqEmailTemplateFactory(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], mailerPeriodemailPeriodcharset: Option[String]): Either[CommonError,ComDayCqMailerImplEmailCqEmailTemplateFactoryInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqMailerImplEmailCqRetrieverTemplateFactoryInfo
        */
        def Configmgr_comDayCqMailerImplEmailCqRetrieverTemplateFactory(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], mailerPeriodemailPeriodembed: Option[Boolean], mailerPeriodemailPeriodcharset: Option[String], mailerPeriodemailPeriodretrieverUserID: Option[String], mailerPeriodemailPeriodretrieverUserPWD: Option[String]): Either[CommonError,ComDayCqMailerImplEmailCqRetrieverTemplateFactoryInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqMcmCampaignImplIntegrationConfigImplInfo
        */
        def Configmgr_comDayCqMcmCampaignImplIntegrationConfigImpl(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], aemPeriodmcmPeriodcampaignPeriodformConstraints: Seq[String], aemPeriodmcmPeriodcampaignPeriodpublicUrl: Option[String], aemPeriodmcmPeriodcampaignPeriodrelaxedSSL: Option[Boolean]): Either[CommonError,ComDayCqMcmCampaignImplIntegrationConfigImplInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryInfo
        */
        def Configmgr_comDayCqMcmCampaignImporterPersonalizedTextHandlerFactory(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], servicePeriodranking: Option[Int], tagpattern: Option[String]): Either[CommonError,ComDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplInfo
        */
        def Configmgr_comDayCqMcmCoreNewsletterNewsletterEmailServiceImpl(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], fromPeriodaddress: Option[String], senderPeriodhost: Option[String], maxPeriodbouncePeriodcount: Option[String]): Either[CommonError,ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqMcmImplMCMConfigurationInfo
        */
        def Configmgr_comDayCqMcmImplMCMConfiguration(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], experiencePeriodindirection: Seq[String], touchpointPeriodindirection: Seq[String]): Either[CommonError,ComDayCqMcmImplMCMConfigurationInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenInfo
        */
        def Configmgr_comDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponen(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], servicePeriodranking: Option[Int], tagpattern: Option[String], componentPeriodresourceType: Option[String]): Either[CommonError,ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougInfo
        */
        def Configmgr_comDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThroug(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], servicePeriodranking: Option[Int], tagpattern: Option[String], componentPeriodresourceType: Option[String]): Either[CommonError,ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponentInfo
        */
        def Configmgr_comDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponent(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], servicePeriodranking: Option[Int], tagpattern: Option[String]): Either[CommonError,ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponentInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaInfo
        */
        def Configmgr_comDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHa(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], servicePeriodranking: Option[Int], tagpattern: Option[String]): Either[CommonError,ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHInfo
        */
        def Configmgr_comDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagH(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], servicePeriodranking: Option[Int], tagpattern: Option[String], componentPeriodresourceType: Option[String]): Either[CommonError,ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqNotificationImplNotificationServiceImplInfo
        */
        def Configmgr_comDayCqNotificationImplNotificationServiceImpl(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], eventPeriodfilter: Option[String]): Either[CommonError,ComDayCqNotificationImplNotificationServiceImplInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqPersonalizationImplServletsTargetingConfigurationServletInfo
        */
        def Configmgr_comDayCqPersonalizationImplServletsTargetingConfigurationServlet(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], forcelocation: Option[Boolean]): Either[CommonError,ComDayCqPersonalizationImplServletsTargetingConfigurationServletInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqPollingImporterImplManagedPollConfigImplInfo
        */
        def Configmgr_comDayCqPollingImporterImplManagedPollConfigImpl(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], id: Option[String], enabled: Option[Boolean], reference: Option[Boolean], interval: Option[Int], expression: Option[String], source: Option[String], target: Option[String], login: Option[String], password: Option[String]): Either[CommonError,ComDayCqPollingImporterImplManagedPollConfigImplInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqPollingImporterImplManagedPollingImporterImplInfo
        */
        def Configmgr_comDayCqPollingImporterImplManagedPollingImporterImpl(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], importerPerioduser: Option[String]): Either[CommonError,ComDayCqPollingImporterImplManagedPollingImporterImplInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqPollingImporterImplPollingImporterImplInfo
        */
        def Configmgr_comDayCqPollingImporterImplPollingImporterImpl(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], importerPeriodminPeriodinterval: Option[Int], importerPerioduser: Option[String], excludePeriodpaths: Seq[String], includePeriodpaths: Seq[String]): Either[CommonError,ComDayCqPollingImporterImplPollingImporterImplInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqReplicationAuditReplicationEventListenerInfo
        */
        def Configmgr_comDayCqReplicationAuditReplicationEventListener(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], servicePeriodranking: Option[Int]): Either[CommonError,ComDayCqReplicationAuditReplicationEventListenerInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqReplicationContentStaticContentBuilderInfo
        */
        def Configmgr_comDayCqReplicationContentStaticContentBuilder(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], host: Option[String], port: Option[Int]): Either[CommonError,ComDayCqReplicationContentStaticContentBuilderInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqReplicationImplAgentManagerImplInfo
        */
        def Configmgr_comDayCqReplicationImplAgentManagerImpl(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], jobPeriodtopics: Option[String], serviceUserPeriodtarget: Option[String], agentProviderPeriodtarget: Option[String]): Either[CommonError,ComDayCqReplicationImplAgentManagerImplInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqReplicationImplContentDurboBinaryLessContentBuilderInfo
        */
        def Configmgr_comDayCqReplicationImplContentDurboBinaryLessContentBuilder(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], binaryPeriodthreshold: Option[Int]): Either[CommonError,ComDayCqReplicationImplContentDurboBinaryLessContentBuilderInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqReplicationImplContentDurboDurboImportConfigurationProvInfo
        */
        def Configmgr_comDayCqReplicationImplContentDurboDurboImportConfigurationProv(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], preservePeriodhierarchyPeriodnodes: Option[Boolean], ignorePeriodversioning: Option[Boolean], importPeriodacl: Option[Boolean], savePeriodthreshold: Option[Int], preservePerioduserPeriodpaths: Option[Boolean], preservePerioduuid: Option[Boolean], preservePerioduuidPeriodnodetypes: Seq[String], preservePerioduuidPeriodsubtrees: Seq[String], autoPeriodcommit: Option[Boolean]): Either[CommonError,ComDayCqReplicationImplContentDurboDurboImportConfigurationProvInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqReplicationImplReplicationContentFactoryProviderImplInfo
        */
        def Configmgr_comDayCqReplicationImplReplicationContentFactoryProviderImpl(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], replicationPeriodcontentPerioduseFileStorage: Option[Boolean], replicationPeriodcontentPeriodmaxCommitAttempts: Option[Int]): Either[CommonError,ComDayCqReplicationImplReplicationContentFactoryProviderImplInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqReplicationImplReplicationReceiverImplInfo
        */
        def Configmgr_comDayCqReplicationImplReplicationReceiverImpl(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], receiverPeriodtmpfilePeriodthreshold: Option[Int], receiverPeriodpackagesPeriodusePeriodinstall: Option[Boolean]): Either[CommonError,ComDayCqReplicationImplReplicationReceiverImplInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqReplicationImplReplicatorImplInfo
        */
        def Configmgr_comDayCqReplicationImplReplicatorImpl(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], distributeEvents: Option[Boolean]): Either[CommonError,ComDayCqReplicationImplReplicatorImplInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqReplicationImplReverseReplicatorInfo
        */
        def Configmgr_comDayCqReplicationImplReverseReplicator(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], schedulerPeriodperiod: Option[Int]): Either[CommonError,ComDayCqReplicationImplReverseReplicatorInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqReplicationImplTransportBinaryLessTransportHandlerInfo
        */
        def Configmgr_comDayCqReplicationImplTransportBinaryLessTransportHandler(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], disabledPeriodcipherPeriodsuites: Seq[String], enabledPeriodcipherPeriodsuites: Seq[String]): Either[CommonError,ComDayCqReplicationImplTransportBinaryLessTransportHandlerInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqReplicationImplTransportHttpInfo
        */
        def Configmgr_comDayCqReplicationImplTransportHttp(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], disabledPeriodcipherPeriodsuites: Seq[String], enabledPeriodcipherPeriodsuites: Seq[String]): Either[CommonError,ComDayCqReplicationImplTransportHttpInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqReportingImplCacheCacheImplInfo
        */
        def Configmgr_comDayCqReportingImplCacheCacheImpl(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], repcachePeriodenable: Option[Boolean], repcachePeriodttl: Option[Int], repcachePeriodmax: Option[Int]): Either[CommonError,ComDayCqReportingImplCacheCacheImplInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqReportingImplConfigServiceImplInfo
        */
        def Configmgr_comDayCqReportingImplConfigServiceImpl(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], repconfPeriodtimezone: Option[String], repconfPeriodlocale: Option[String], repconfPeriodsnapshots: Option[String], repconfPeriodrepdir: Option[String], repconfPeriodhourofday: Option[Int], repconfPeriodminofhour: Option[Int], repconfPeriodmaxrows: Option[Int], repconfPeriodfakedata: Option[Boolean], repconfPeriodsnapshotuser: Option[String], repconfPeriodenforcesnapshotuser: Option[Boolean]): Either[CommonError,ComDayCqReportingImplConfigServiceImplInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqReportingImplRLogAnalyzerInfo
        */
        def Configmgr_comDayCqReportingImplRLogAnalyzer(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], requestPeriodlogPeriodoutput: Option[String]): Either[CommonError,ComDayCqReportingImplRLogAnalyzerInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqRewriterLinkcheckerImplLinkCheckerImplInfo
        */
        def Configmgr_comDayCqRewriterLinkcheckerImplLinkCheckerImpl(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], schedulerPeriodperiod: Option[Int], schedulerPeriodconcurrent: Option[Boolean], servicePeriodbadLinkToleranceInterval: Option[Int], servicePeriodcheckOverridePatterns: Seq[String], servicePeriodcacheBrokenInternalLinks: Option[Boolean], servicePeriodspecialLinkPrefix: Seq[String], servicePeriodspecialLinkPatterns: Seq[String]): Either[CommonError,ComDayCqRewriterLinkcheckerImplLinkCheckerImplInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqRewriterLinkcheckerImplLinkCheckerTaskInfo
        */
        def Configmgr_comDayCqRewriterLinkcheckerImplLinkCheckerTask(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], schedulerPeriodperiod: Option[Int], schedulerPeriodconcurrent: Option[Boolean], goodLinkTestInterval: Option[Int], badLinkTestInterval: Option[Int], linkUnusedInterval: Option[Int], connectionPeriodtimeout: Option[Int]): Either[CommonError,ComDayCqRewriterLinkcheckerImplLinkCheckerTaskInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryInfo
        */
        def Configmgr_comDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactory(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], linkcheckertransformerPerioddisableRewriting: Option[Boolean], linkcheckertransformerPerioddisableChecking: Option[Boolean], linkcheckertransformerPeriodmapCacheSize: Option[Int], linkcheckertransformerPeriodstrictExtensionCheck: Option[Boolean], linkcheckertransformerPeriodstripHtmltExtension: Option[Boolean], linkcheckertransformerPeriodrewriteElements: Seq[String], linkcheckertransformerPeriodstripExtensionPathBlacklist: Seq[String]): Either[CommonError,ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplInfo
        */
        def Configmgr_comDayCqRewriterLinkcheckerImplLinkInfoStorageImpl(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], servicePeriodmaxLinksPerHost: Option[Int], servicePeriodsaveExternalLinkReferences: Option[Boolean]): Either[CommonError,ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqRewriterProcessorImplHtmlParserFactoryInfo
        */
        def Configmgr_comDayCqRewriterProcessorImplHtmlParserFactory(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], htmlparserPeriodprocessTags: Seq[String], htmlparserPeriodpreserveCamelCase: Option[Boolean]): Either[CommonError,ComDayCqRewriterProcessorImplHtmlParserFactoryInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqSearchImplBuilderQueryBuilderImplInfo
        */
        def Configmgr_comDayCqSearchImplBuilderQueryBuilderImpl(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], excerptPeriodproperties: Seq[String], cachePeriodmaxPeriodentries: Option[Int], cachePeriodentryPeriodlifetime: Option[Int], xpathPeriodunion: Option[Boolean]): Either[CommonError,ComDayCqSearchImplBuilderQueryBuilderImplInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqSearchSuggestImplSuggestionIndexManagerImplInfo
        */
        def Configmgr_comDayCqSearchSuggestImplSuggestionIndexManagerImpl(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], pathBuilderPeriodtarget: Option[String], suggestPeriodbasepath: Option[String]): Either[CommonError,ComDayCqSearchSuggestImplSuggestionIndexManagerImplInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerInfo
        */
        def Configmgr_comDayCqSearchpromoteImplPublishSearchPromoteConfigHandler(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], cqPeriodsearchpromotePeriodconfighandlerPeriodenabled: Option[Boolean]): Either[CommonError,ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqSearchpromoteImplSearchPromoteServiceImplInfo
        */
        def Configmgr_comDayCqSearchpromoteImplSearchPromoteServiceImpl(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], cqPeriodsearchpromotePeriodconfigurationPeriodserverPerioduri: Option[String], cqPeriodsearchpromotePeriodconfigurationPeriodenvironment: Option[String], connectionPeriodtimeout: Option[Int], socketPeriodtimeout: Option[Int]): Either[CommonError,ComDayCqSearchpromoteImplSearchPromoteServiceImplInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqSecurityACLSetupInfo
        */
        def Configmgr_comDayCqSecurityACLSetup(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], cqPeriodaclsetupPeriodrules: Seq[String]): Either[CommonError,ComDayCqSecurityACLSetupInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqStatisticsImplStatisticsServiceImplInfo
        */
        def Configmgr_comDayCqStatisticsImplStatisticsServiceImpl(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], schedulerPeriodperiod: Option[Int], schedulerPeriodconcurrent: Option[Boolean], path: Option[String], workspace: Option[String], keywordsPath: Option[String], asyncEntries: Option[Boolean]): Either[CommonError,ComDayCqStatisticsImplStatisticsServiceImplInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqTaggingImplJcrTagManagerFactoryImplInfo
        */
        def Configmgr_comDayCqTaggingImplJcrTagManagerFactoryImpl(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], validationPeriodenabled: Option[Boolean]): Either[CommonError,ComDayCqTaggingImplJcrTagManagerFactoryImplInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqTaggingImplSearchTagPredicateEvaluatorInfo
        */
        def Configmgr_comDayCqTaggingImplSearchTagPredicateEvaluator(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], ignorePath: Option[Boolean]): Either[CommonError,ComDayCqTaggingImplSearchTagPredicateEvaluatorInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqTaggingImplTagGarbageCollectorInfo
        */
        def Configmgr_comDayCqTaggingImplTagGarbageCollector(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], schedulerPeriodexpression: Option[String]): Either[CommonError,ComDayCqTaggingImplTagGarbageCollectorInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerInfo
        */
        def Configmgr_comDayCqWcmContentsyncImplHandlerPagesUpdateHandler(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], cqPeriodpagesupdatehandlerPeriodimageresourcetypes: Seq[String]): Either[CommonError,ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorInfo
        */
        def Configmgr_comDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactor(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], cqPeriodcontentsyncPeriodpathrewritertransformerPeriodmappingPeriodlinks: Seq[String], cqPeriodcontentsyncPeriodpathrewritertransformerPeriodmappingPeriodclientlibs: Seq[String], cqPeriodcontentsyncPeriodpathrewritertransformerPeriodmappingPeriodimages: Seq[String], cqPeriodcontentsyncPeriodpathrewritertransformerPeriodattributePeriodpattern: Option[String], cqPeriodcontentsyncPeriodpathrewritertransformerPeriodclientlibraryPeriodpattern: Option[String], cqPeriodcontentsyncPeriodpathrewritertransformerPeriodclientlibraryPeriodreplace: Option[String]): Either[CommonError,ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqWcmCoreImplAuthoringUIModeServiceImplInfo
        */
        def Configmgr_comDayCqWcmCoreImplAuthoringUIModeServiceImpl(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], authoringUIModeServicePerioddefault: Option[String]): Either[CommonError,ComDayCqWcmCoreImplAuthoringUIModeServiceImplInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqWcmCoreImplCommandsWCMCommandServletInfo
        */
        def Configmgr_comDayCqWcmCoreImplCommandsWCMCommandServlet(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], wcmcommandservletPerioddeleteWhitelist: Seq[String]): Either[CommonError,ComDayCqWcmCoreImplCommandsWCMCommandServletInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplInfo
        */
        def Configmgr_comDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImpl(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], dimPerioddefaultPeriodmode: Option[String], dimPeriodappcachePeriodenabled: Option[Boolean]): Either[CommonError,ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqWcmCoreImplEventPageEventAuditListenerInfo
        */
        def Configmgr_comDayCqWcmCoreImplEventPageEventAuditListener(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], configured: Option[String]): Either[CommonError,ComDayCqWcmCoreImplEventPageEventAuditListenerInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqWcmCoreImplEventPagePostProcessorInfo
        */
        def Configmgr_comDayCqWcmCoreImplEventPagePostProcessor(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], paths: Seq[String]): Either[CommonError,ComDayCqWcmCoreImplEventPagePostProcessorInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqWcmCoreImplEventRepositoryChangeEventListenerInfo
        */
        def Configmgr_comDayCqWcmCoreImplEventRepositoryChangeEventListener(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], paths: Seq[String], excludedPaths: Seq[String]): Either[CommonError,ComDayCqWcmCoreImplEventRepositoryChangeEventListenerInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqWcmCoreImplEventTemplatePostProcessorInfo
        */
        def Configmgr_comDayCqWcmCoreImplEventTemplatePostProcessor(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], paths: Option[String]): Either[CommonError,ComDayCqWcmCoreImplEventTemplatePostProcessorInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqWcmCoreImplLanguageManagerImplInfo
        */
        def Configmgr_comDayCqWcmCoreImplLanguageManagerImpl(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], langmgrPeriodlistPeriodpath: Option[String], langmgrPeriodcountryPerioddefault: Seq[String]): Either[CommonError,ComDayCqWcmCoreImplLanguageManagerImplInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplInfo
        */
        def Configmgr_comDayCqWcmCoreImplLinkCheckerConfigurationFactoryImpl(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], linkPeriodexpiredPeriodprefix: Option[String], linkPeriodexpiredPeriodremove: Option[Boolean], linkPeriodexpiredPeriodsuffix: Option[String], linkPeriodinvalidPeriodprefix: Option[String], linkPeriodinvalidPeriodremove: Option[Boolean], linkPeriodinvalidPeriodsuffix: Option[String], linkPeriodpredatedPeriodprefix: Option[String], linkPeriodpredatedPeriodremove: Option[Boolean], linkPeriodpredatedPeriodsuffix: Option[String], linkPeriodwcmmodes: Seq[String]): Either[CommonError,ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqWcmCoreImplPagePageInfoAggregatorImplInfo
        */
        def Configmgr_comDayCqWcmCoreImplPagePageInfoAggregatorImpl(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], pagePeriodinfoPeriodproviderPeriodpropertyPeriodregexPerioddefault: Option[String], pagePeriodinfoPeriodproviderPeriodpropertyPeriodname: Option[String]): Either[CommonError,ComDayCqWcmCoreImplPagePageInfoAggregatorImplInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqWcmCoreImplPagePageManagerFactoryImplInfo
        */
        def Configmgr_comDayCqWcmCoreImplPagePageManagerFactoryImpl(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], illegalCharMapping: Option[String], pageSubTreeActivationCheck: Option[Boolean]): Either[CommonError,ComDayCqWcmCoreImplPagePageManagerFactoryImplInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqWcmCoreImplReferencesContentContentReferenceConfigInfo
        */
        def Configmgr_comDayCqWcmCoreImplReferencesContentContentReferenceConfig(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], contentReferenceConfigPeriodresourceTypes: Seq[String]): Either[CommonError,ComDayCqWcmCoreImplReferencesContentContentReferenceConfigInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerInfo
        */
        def Configmgr_comDayCqWcmCoreImplServletsContentfinderAssetViewHandler(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], damPeriodshowexpired: Option[Boolean], damPeriodshowhidden: Option[Boolean], tagTitleSearch: Option[Boolean], guessTotal: Option[String], damPeriodexpiryProperty: Option[String]): Either[CommonError,ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieInfo
        */
        def Configmgr_comDayCqWcmCoreImplServletsContentfinderConnectorConnectorVie(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], itemPeriodresourcePeriodtypes: Seq[String]): Either[CommonError,ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerInfo
        */
        def Configmgr_comDayCqWcmCoreImplServletsContentfinderPageViewHandler(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], guessTotal: Option[String], tagTitleSearch: Option[Boolean]): Either[CommonError,ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqWcmCoreImplServletsFindReplaceServletInfo
        */
        def Configmgr_comDayCqWcmCoreImplServletsFindReplaceServlet(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], scope: Seq[String]): Either[CommonError,ComDayCqWcmCoreImplServletsFindReplaceServletInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqWcmCoreImplServletsReferenceSearchServletInfo
        */
        def Configmgr_comDayCqWcmCoreImplServletsReferenceSearchServlet(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], referencesearchservletPeriodmaxReferencesPerPage: Option[Int], referencesearchservletPeriodmaxPages: Option[Int]): Either[CommonError,ComDayCqWcmCoreImplServletsReferenceSearchServletInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqWcmCoreImplServletsThumbnailServletInfo
        */
        def Configmgr_comDayCqWcmCoreImplServletsThumbnailServlet(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], workspace: Option[String], dimensions: Seq[String]): Either[CommonError,ComDayCqWcmCoreImplServletsThumbnailServletInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorInfo
        */
        def Configmgr_comDayCqWcmCoreImplUtilsDefaultPageNameValidator(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], nonValidChars: Option[String]): Either[CommonError,ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqWcmCoreImplVariantsPageVariantsProviderImplInfo
        */
        def Configmgr_comDayCqWcmCoreImplVariantsPageVariantsProviderImpl(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], defaultPeriodexternalizerPerioddomain: Option[String]): Either[CommonError,ComDayCqWcmCoreImplVariantsPageVariantsProviderImplInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqWcmCoreImplVersionManagerImplInfo
        */
        def Configmgr_comDayCqWcmCoreImplVersionManagerImpl(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], versionmanagerPeriodcreateVersionOnActivation: Option[Boolean], versionmanagerPeriodpurgingEnabled: Option[Boolean], versionmanagerPeriodpurgePaths: Seq[String], versionmanagerPeriodivPaths: Seq[String], versionmanagerPeriodmaxAgeDays: Option[Int], versionmanagerPeriodmaxNumberVersions: Option[Int], versionmanagerPeriodminNumberVersions: Option[Int]): Either[CommonError,ComDayCqWcmCoreImplVersionManagerImplInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqWcmCoreImplVersionPurgeTaskInfo
        */
        def Configmgr_comDayCqWcmCoreImplVersionPurgeTask(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], versionpurgePeriodpaths: Seq[String], versionpurgePeriodrecursive: Option[Boolean], versionpurgePeriodmaxVersions: Option[Int], versionpurgePeriodminVersions: Option[Int], versionpurgePeriodmaxAgeDays: Option[Int]): Either[CommonError,ComDayCqWcmCoreImplVersionPurgeTaskInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqWcmCoreImplWCMDebugFilterInfo
        */
        def Configmgr_comDayCqWcmCoreImplWCMDebugFilter(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], wcmdbgfilterPeriodenabled: Option[Boolean], wcmdbgfilterPeriodjspDebug: Option[Boolean]): Either[CommonError,ComDayCqWcmCoreImplWCMDebugFilterInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqWcmCoreImplWCMDeveloperModeFilterInfo
        */
        def Configmgr_comDayCqWcmCoreImplWCMDeveloperModeFilter(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], wcmdevmodefilterPeriodenabled: Option[Boolean]): Either[CommonError,ComDayCqWcmCoreImplWCMDeveloperModeFilterInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqWcmCoreImplWarpTimeWarpFilterInfo
        */
        def Configmgr_comDayCqWcmCoreImplWarpTimeWarpFilter(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], filterPeriodorder: Option[String], filterPeriodscope: Option[String]): Either[CommonError,ComDayCqWcmCoreImplWarpTimeWarpFilterInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqWcmCoreMvtMVTStatisticsImplInfo
        */
        def Configmgr_comDayCqWcmCoreMvtMVTStatisticsImpl(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], mvtstatisticsPeriodtrackingurl: Option[String]): Either[CommonError,ComDayCqWcmCoreMvtMVTStatisticsImplInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqWcmCoreStatsPageViewStatisticsImplInfo
        */
        def Configmgr_comDayCqWcmCoreStatsPageViewStatisticsImpl(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], pageviewstatisticsPeriodtrackingurl: Option[String], pageviewstatisticsPeriodtrackingscriptPeriodenabled: Option[String]): Either[CommonError,ComDayCqWcmCoreStatsPageViewStatisticsImplInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqWcmCoreWCMRequestFilterInfo
        */
        def Configmgr_comDayCqWcmCoreWCMRequestFilter(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], wcmfilterPeriodmode: Option[String]): Either[CommonError,ComDayCqWcmCoreWCMRequestFilterInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqWcmDesignimporterDesignPackageImporterInfo
        */
        def Configmgr_comDayCqWcmDesignimporterDesignPackageImporter(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], extractPeriodfilter: Seq[String]): Either[CommonError,ComDayCqWcmDesignimporterDesignPackageImporterInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqWcmDesignimporterImplCanvasBuilderImplInfo
        */
        def Configmgr_comDayCqWcmDesignimporterImplCanvasBuilderImpl(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], filepattern: Option[String], buildPeriodpagePeriodnodes: Option[Boolean], buildPeriodclientPeriodlibs: Option[Boolean], buildPeriodcanvasPeriodcomponent: Option[Boolean]): Either[CommonError,ComDayCqWcmDesignimporterImplCanvasBuilderImplInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerInfo
        */
        def Configmgr_comDayCqWcmDesignimporterImplCanvasPageDeleteHandler(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], minThreadPoolSize: Option[Int], maxThreadPoolSize: Option[Int]): Either[CommonError,ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqWcmDesignimporterImplEntryPreprocessorImplInfo
        */
        def Configmgr_comDayCqWcmDesignimporterImplEntryPreprocessorImpl(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], searchPeriodpattern: Option[String], replacePeriodpattern: Option[String]): Either[CommonError,ComDayCqWcmDesignimporterImplEntryPreprocessorImplInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplInfo
        */
        def Configmgr_comDayCqWcmDesignimporterImplMobileCanvasBuilderImpl(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], filepattern: Option[String], devicePeriodgroups: Seq[String], buildPeriodpagePeriodnodes: Option[Boolean], buildPeriodclientPeriodlibs: Option[Boolean], buildPeriodcanvasPeriodcomponent: Option[Boolean]): Either[CommonError,ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqWcmDesignimporterParserTaghandlersFactoryCanvasComponeInfo
        */
        def Configmgr_comDayCqWcmDesignimporterParserTaghandlersFactoryCanvasCompone(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], servicePeriodranking: Option[Int], tagpattern: Option[String]): Either[CommonError,ComDayCqWcmDesignimporterParserTaghandlersFactoryCanvasComponeInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultComponInfo
        */
        def Configmgr_comDayCqWcmDesignimporterParserTaghandlersFactoryDefaultCompon(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], servicePeriodranking: Option[Int], tagpattern: Option[String]): Either[CommonError,ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultComponInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultTagHanInfo
        */
        def Configmgr_comDayCqWcmDesignimporterParserTaghandlersFactoryDefaultTagHan(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], servicePeriodranking: Option[Int], tagpattern: Option[String]): Either[CommonError,ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultTagHanInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqWcmDesignimporterParserTaghandlersFactoryHeadTagHandleInfo
        */
        def Configmgr_comDayCqWcmDesignimporterParserTaghandlersFactoryHeadTagHandle(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], servicePeriodranking: Option[Int], tagpattern: Option[String]): Either[CommonError,ComDayCqWcmDesignimporterParserTaghandlersFactoryHeadTagHandleInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqWcmDesignimporterParserTaghandlersFactoryIFrameTagHandInfo
        */
        def Configmgr_comDayCqWcmDesignimporterParserTaghandlersFactoryIFrameTagHand(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], servicePeriodranking: Option[Int], tagpattern: Option[String]): Either[CommonError,ComDayCqWcmDesignimporterParserTaghandlersFactoryIFrameTagHandInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqWcmDesignimporterParserTaghandlersFactoryImageComponenInfo
        */
        def Configmgr_comDayCqWcmDesignimporterParserTaghandlersFactoryImageComponen(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], servicePeriodranking: Option[Int], tagpattern: Option[String], componentPeriodresourceType: Option[String]): Either[CommonError,ComDayCqWcmDesignimporterParserTaghandlersFactoryImageComponenInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandlerInfo
        */
        def Configmgr_comDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandler(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], servicePeriodranking: Option[Int], tagpattern: Option[String]): Either[CommonError,ComDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandlerInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqWcmDesignimporterParserTaghandlersFactoryInlineScriptTInfo
        */
        def Configmgr_comDayCqWcmDesignimporterParserTaghandlersFactoryInlineScriptT(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], servicePeriodranking: Option[Int], tagpattern: Option[String]): Either[CommonError,ComDayCqWcmDesignimporterParserTaghandlersFactoryInlineScriptTInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqWcmDesignimporterParserTaghandlersFactoryLinkTagHandleInfo
        */
        def Configmgr_comDayCqWcmDesignimporterParserTaghandlersFactoryLinkTagHandle(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], servicePeriodranking: Option[Int], tagpattern: Option[String]): Either[CommonError,ComDayCqWcmDesignimporterParserTaghandlersFactoryLinkTagHandleInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqWcmDesignimporterParserTaghandlersFactoryMetaTagHandleInfo
        */
        def Configmgr_comDayCqWcmDesignimporterParserTaghandlersFactoryMetaTagHandle(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], servicePeriodranking: Option[Int], tagpattern: Option[String]): Either[CommonError,ComDayCqWcmDesignimporterParserTaghandlersFactoryMetaTagHandleInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqWcmDesignimporterParserTaghandlersFactoryNonScriptTagHInfo
        */
        def Configmgr_comDayCqWcmDesignimporterParserTaghandlersFactoryNonScriptTagH(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], servicePeriodranking: Option[Int], tagpattern: Option[String]): Either[CommonError,ComDayCqWcmDesignimporterParserTaghandlersFactoryNonScriptTagHInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqWcmDesignimporterParserTaghandlersFactoryParsysComponeInfo
        */
        def Configmgr_comDayCqWcmDesignimporterParserTaghandlersFactoryParsysCompone(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], servicePeriodranking: Option[Int], tagpattern: Option[String], componentPeriodresourceType: Option[String]): Either[CommonError,ComDayCqWcmDesignimporterParserTaghandlersFactoryParsysComponeInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqWcmDesignimporterParserTaghandlersFactoryScriptTagHandInfo
        */
        def Configmgr_comDayCqWcmDesignimporterParserTaghandlersFactoryScriptTagHand(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], servicePeriodranking: Option[Int], tagpattern: Option[String]): Either[CommonError,ComDayCqWcmDesignimporterParserTaghandlersFactoryScriptTagHandInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqWcmDesignimporterParserTaghandlersFactoryStyleTagHandlInfo
        */
        def Configmgr_comDayCqWcmDesignimporterParserTaghandlersFactoryStyleTagHandl(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], servicePeriodranking: Option[Int], tagpattern: Option[String]): Either[CommonError,ComDayCqWcmDesignimporterParserTaghandlersFactoryStyleTagHandlInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqWcmDesignimporterParserTaghandlersFactoryTextComponentInfo
        */
        def Configmgr_comDayCqWcmDesignimporterParserTaghandlersFactoryTextComponent(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], servicePeriodranking: Option[Int], tagpattern: Option[String], componentPeriodresourceType: Option[String]): Either[CommonError,ComDayCqWcmDesignimporterParserTaghandlersFactoryTextComponentInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleComponenInfo
        */
        def Configmgr_comDayCqWcmDesignimporterParserTaghandlersFactoryTitleComponen(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], servicePeriodranking: Option[Int], tagpattern: Option[String], componentPeriodresourceType: Option[String]): Either[CommonError,ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleComponenInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleTagHandlInfo
        */
        def Configmgr_comDayCqWcmDesignimporterParserTaghandlersFactoryTitleTagHandl(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], servicePeriodranking: Option[Int], tagpattern: Option[String]): Either[CommonError,ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleTagHandlInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqWcmFoundationFormsImplFormChooserServletInfo
        */
        def Configmgr_comDayCqWcmFoundationFormsImplFormChooserServlet(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], servicePeriodname: Option[String], slingPeriodservletPeriodresourceTypes: Option[String], slingPeriodservletPeriodselectors: Option[String], slingPeriodservletPeriodmethods: Seq[String], formsPeriodformchooserservletPeriodadvansesearchPeriodrequire: Option[Boolean]): Either[CommonError,ComDayCqWcmFoundationFormsImplFormChooserServletInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorInfo
        */
        def Configmgr_comDayCqWcmFoundationFormsImplFormParagraphPostProcessor(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], formsPeriodformparagraphpostprocessorPeriodenabled: Option[Boolean], formsPeriodformparagraphpostprocessorPeriodformresourcetypes: Seq[String]): Either[CommonError,ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqWcmFoundationFormsImplFormsHandlingServletInfo
        */
        def Configmgr_comDayCqWcmFoundationFormsImplFormsHandlingServlet(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], namePeriodwhitelist: Option[String], allowPeriodexpressions: Option[Boolean]): Either[CommonError,ComDayCqWcmFoundationFormsImplFormsHandlingServletInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqWcmFoundationFormsImplMailServletInfo
        */
        def Configmgr_comDayCqWcmFoundationFormsImplMailServlet(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], slingPeriodservletPeriodresourceTypes: Option[String], slingPeriodservletPeriodselectors: Option[String], resourcePeriodwhitelist: Seq[String], resourcePeriodblacklist: Option[String]): Either[CommonError,ComDayCqWcmFoundationFormsImplMailServletInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqWcmFoundationImplAdaptiveImageComponentServletInfo
        */
        def Configmgr_comDayCqWcmFoundationImplAdaptiveImageComponentServlet(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], adaptPeriodsupportedPeriodwidths: Seq[String]): Either[CommonError,ComDayCqWcmFoundationImplAdaptiveImageComponentServletInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqWcmFoundationImplHTTPAuthHandlerInfo
        */
        def Configmgr_comDayCqWcmFoundationImplHTTPAuthHandler(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], path: Option[String], authPeriodhttpPeriodnologin: Option[Boolean], authPeriodhttpPeriodrealm: Option[String], authPerioddefaultPeriodloginpage: Option[String], authPeriodcredPeriodform: Seq[String], authPeriodcredPeriodutf8: Seq[String]): Either[CommonError,ComDayCqWcmFoundationImplHTTPAuthHandlerInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqWcmFoundationImplPageImpressionsTrackerInfo
        */
        def Configmgr_comDayCqWcmFoundationImplPageImpressionsTracker(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], slingPeriodauthPeriodrequirements: Option[String]): Either[CommonError,ComDayCqWcmFoundationImplPageImpressionsTrackerInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqWcmFoundationImplPageRedirectServletInfo
        */
        def Configmgr_comDayCqWcmFoundationImplPageRedirectServlet(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], excludedPeriodresourcePeriodtypes: Seq[String]): Either[CommonError,ComDayCqWcmFoundationImplPageRedirectServletInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistInfo
        */
        def Configmgr_comDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklist(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], defaultPeriodattachmentPeriodtypePeriodblacklist: Seq[String], baselinePeriodattachmentPeriodtypePeriodblacklist: Seq[String]): Either[CommonError,ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplInfo
        */
        def Configmgr_comDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImpl(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], parameterPeriodwhitelist: Seq[String], parameterPeriodwhitelistPeriodprefixes: Seq[String], binaryPeriodparameterPeriodwhitelist: Seq[String], modifierPeriodwhitelist: Seq[String], operationPeriodwhitelist: Seq[String], operationPeriodwhitelistPeriodprefixes: Seq[String], typehintPeriodwhitelist: Seq[String], resourcetypePeriodwhitelist: Seq[String]): Either[CommonError,ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryInfo
        */
        def Configmgr_comDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactory(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], devicePeriodinfoPeriodtransformerPeriodenabled: Option[Boolean], devicePeriodinfoPeriodtransformerPeriodcssPeriodstyle: Option[String]): Either[CommonError,ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqWcmMobileCoreImplRedirectRedirectFilterInfo
        */
        def Configmgr_comDayCqWcmMobileCoreImplRedirectRedirectFilter(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], redirectPeriodenabled: Option[Boolean], redirectPeriodstatsPeriodenabled: Option[Boolean], redirectPeriodextensions: Seq[String], redirectPeriodpaths: Seq[String]): Either[CommonError,ComDayCqWcmMobileCoreImplRedirectRedirectFilterInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqWcmMsmImplActionsContentCopyActionFactoryInfo
        */
        def Configmgr_comDayCqWcmMsmImplActionsContentCopyActionFactory(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], cqPeriodwcmPeriodmsmPeriodactionPeriodexcludednodetypes: Seq[String], cqPeriodwcmPeriodmsmPeriodactionPeriodexcludedparagraphitems: Seq[String], cqPeriodwcmPeriodmsmPeriodactionPeriodexcludedprops: Seq[String], contentcopyactionPeriodorderPeriodstyle: Option[String]): Either[CommonError,ComDayCqWcmMsmImplActionsContentCopyActionFactoryInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqWcmMsmImplActionsContentDeleteActionFactoryInfo
        */
        def Configmgr_comDayCqWcmMsmImplActionsContentDeleteActionFactory(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], cqPeriodwcmPeriodmsmPeriodactionPeriodexcludednodetypes: Seq[String], cqPeriodwcmPeriodmsmPeriodactionPeriodexcludedparagraphitems: Seq[String], cqPeriodwcmPeriodmsmPeriodactionPeriodexcludedprops: Seq[String]): Either[CommonError,ComDayCqWcmMsmImplActionsContentDeleteActionFactoryInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqWcmMsmImplActionsContentUpdateActionFactoryInfo
        */
        def Configmgr_comDayCqWcmMsmImplActionsContentUpdateActionFactory(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], cqPeriodwcmPeriodmsmPeriodactionPeriodexcludednodetypes: Seq[String], cqPeriodwcmPeriodmsmPeriodactionPeriodexcludedparagraphitems: Seq[String], cqPeriodwcmPeriodmsmPeriodactionPeriodexcludedprops: Seq[String], cqPeriodwcmPeriodmsmPeriodactionPeriodignoredMixin: Seq[String]): Either[CommonError,ComDayCqWcmMsmImplActionsContentUpdateActionFactoryInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryInfo
        */
        def Configmgr_comDayCqWcmMsmImplActionsOrderChildrenActionFactory(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], cqPeriodwcmPeriodmsmPeriodactionPeriodexcludednodetypes: Seq[String], cqPeriodwcmPeriodmsmPeriodactionPeriodexcludedparagraphitems: Seq[String], cqPeriodwcmPeriodmsmPeriodactionPeriodexcludedprops: Seq[String]): Either[CommonError,ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqWcmMsmImplActionsPageMoveActionFactoryInfo
        */
        def Configmgr_comDayCqWcmMsmImplActionsPageMoveActionFactory(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], cqPeriodwcmPeriodmsmPeriodactionPeriodexcludednodetypes: Seq[String], cqPeriodwcmPeriodmsmPeriodactionPeriodexcludedparagraphitems: Seq[String], cqPeriodwcmPeriodmsmPeriodactionPeriodexcludedprops: Seq[String], cqPeriodwcmPeriodmsmPeriodimplPeriodactionsPeriodpagemovePeriodpropReferenceUpdate: Option[Boolean]): Either[CommonError,ComDayCqWcmMsmImplActionsPageMoveActionFactoryInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryInfo
        */
        def Configmgr_comDayCqWcmMsmImplActionsReferencesUpdateActionFactory(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], cqPeriodwcmPeriodmsmPeriodactionPeriodexcludednodetypes: Seq[String], cqPeriodwcmPeriodmsmPeriodactionPeriodexcludedparagraphitems: Seq[String], cqPeriodwcmPeriodmsmPeriodactionPeriodexcludedprops: Seq[String], cqPeriodwcmPeriodmsmPeriodimplPeriodactionPeriodreferencesupdatePeriodpropUpdateNested: Option[Boolean]): Either[CommonError,ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqWcmMsmImplActionsVersionCopyActionFactoryInfo
        */
        def Configmgr_comDayCqWcmMsmImplActionsVersionCopyActionFactory(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], cqPeriodwcmPeriodmsmPeriodactionPeriodexcludednodetypes: Seq[String], cqPeriodwcmPeriodmsmPeriodactionPeriodexcludedparagraphitems: Seq[String], cqPeriodwcmPeriodmsmPeriodactionPeriodexcludedprops: Seq[String]): Either[CommonError,ComDayCqWcmMsmImplActionsVersionCopyActionFactoryInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqWcmMsmImplLiveRelationshipManagerImplInfo
        */
        def Configmgr_comDayCqWcmMsmImplLiveRelationshipManagerImpl(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], liverelationshipmgrPeriodrelationsconfigPerioddefault: Option[String]): Either[CommonError,ComDayCqWcmMsmImplLiveRelationshipManagerImplInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqWcmMsmImplRolloutManagerImplInfo
        */
        def Configmgr_comDayCqWcmMsmImplRolloutManagerImpl(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], eventPeriodfilter: Option[String], rolloutmgrPeriodexcludedpropsPerioddefault: Seq[String], rolloutmgrPeriodexcludedparagraphpropsPerioddefault: Seq[String], rolloutmgrPeriodexcludednodetypesPerioddefault: Seq[String], rolloutmgrPeriodthreadpoolPeriodmaxsize: Option[Int], rolloutmgrPeriodthreadpoolPeriodmaxshutdowntime: Option[Int], rolloutmgrPeriodthreadpoolPeriodpriority: Option[String], rolloutmgrPeriodcommitPeriodsize: Option[Int], rolloutmgrPeriodconflicthandlingPeriodenabled: Option[Boolean]): Either[CommonError,ComDayCqWcmMsmImplRolloutManagerImplInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqWcmMsmImplServletsAuditLogServletInfo
        */
        def Configmgr_comDayCqWcmMsmImplServletsAuditLogServlet(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], auditlogservletPerioddefaultPeriodeventsPeriodcount: Option[Int], auditlogservletPerioddefaultPeriodpath: Option[String]): Either[CommonError,ComDayCqWcmMsmImplServletsAuditLogServletInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqWcmNotificationEmailImplEmailChannelInfo
        */
        def Configmgr_comDayCqWcmNotificationEmailImplEmailChannel(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], emailPeriodfrom: Option[String]): Either[CommonError,ComDayCqWcmNotificationEmailImplEmailChannelInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqWcmNotificationImplNotificationManagerImplInfo
        */
        def Configmgr_comDayCqWcmNotificationImplNotificationManagerImpl(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], eventPeriodtopics: Seq[String]): Either[CommonError,ComDayCqWcmNotificationImplNotificationManagerImplInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqWcmScriptingImplBVPManagerInfo
        */
        def Configmgr_comDayCqWcmScriptingImplBVPManager(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], comPerioddayPeriodcqPeriodwcmPeriodscriptingPeriodbvpPeriodscriptPeriodengines: Seq[String]): Either[CommonError,ComDayCqWcmScriptingImplBVPManagerInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqWcmUndoUndoConfigInfo
        */
        def Configmgr_comDayCqWcmUndoUndoConfig(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], cqPeriodwcmPeriodundoPeriodenabled: Option[Boolean], cqPeriodwcmPeriodundoPeriodpath: Option[String], cqPeriodwcmPeriodundoPeriodvalidity: Option[Int], cqPeriodwcmPeriodundoPeriodsteps: Option[Int], cqPeriodwcmPeriodundoPeriodpersistence: Option[String], cqPeriodwcmPeriodundoPeriodpersistencePeriodmode: Option[Boolean], cqPeriodwcmPeriodundoPeriodmarkermode: Option[String], cqPeriodwcmPeriodundoPeriodwhitelist: Seq[String], cqPeriodwcmPeriodundoPeriodblacklist: Seq[String]): Either[CommonError,ComDayCqWcmUndoUndoConfigInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqWcmWebservicesupportImplReplicationEventListenerInfo
        */
        def Configmgr_comDayCqWcmWebservicesupportImplReplicationEventListener(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], flush agents: Seq[String]): Either[CommonError,ComDayCqWcmWebservicesupportImplReplicationEventListenerInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqWcmWorkflowImplWcmWorkflowServiceImplInfo
        */
        def Configmgr_comDayCqWcmWorkflowImplWcmWorkflowServiceImpl(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], eventPeriodfilter: Option[String], minThreadPoolSize: Option[Int], maxThreadPoolSize: Option[Int], cqPeriodwcmPeriodworkflowPeriodterminatePeriodonPeriodactivate: Option[Boolean], cqPeriodwcmPeriodworklfowPeriodterminatePeriodexclusionPeriodlist: Seq[String]): Either[CommonError,ComDayCqWcmWorkflowImplWcmWorkflowServiceImplInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderInfo
        */
        def Configmgr_comDayCqWcmWorkflowImplWorkflowPackageInfoProvider(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], workflowpackageinfoproviderPeriodfilter: Seq[String], workflowpackageinfoproviderPeriodfilterPeriodrootpath: Option[String]): Either[CommonError,ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqWidgetImplHtmlLibraryManagerImplInfo
        */
        def Configmgr_comDayCqWidgetImplHtmlLibraryManagerImpl(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], htmllibmanagerPeriodclientmanager: Option[String], htmllibmanagerPerioddebug: Option[Boolean], htmllibmanagerPerioddebugPeriodconsole: Option[Boolean], htmllibmanagerPerioddebugPeriodinitPeriodjs: Option[String], htmllibmanagerPerioddefaultthemename: Option[String], htmllibmanagerPerioddefaultuserthemename: Option[String], htmllibmanagerPeriodfirebuglitePeriodpath: Option[String], htmllibmanagerPeriodforceCQUrlInfo: Option[Boolean], htmllibmanagerPeriodgzip: Option[Boolean], htmllibmanagerPeriodmaxage: Option[Int], htmllibmanagerPeriodmaxDataUriSize: Option[Int], htmllibmanagerPeriodminify: Option[Boolean], htmllibmanagerPeriodpathPeriodlist: Seq[String], htmllibmanagerPeriodtiming: Option[Boolean]): Either[CommonError,ComDayCqWidgetImplHtmlLibraryManagerImplInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqWidgetImplWidgetExtensionProviderImplInfo
        */
        def Configmgr_comDayCqWidgetImplWidgetExtensionProviderImpl(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], extendablePeriodwidgets: Seq[String], widgetextensionproviderPerioddebug: Option[Boolean]): Either[CommonError,ComDayCqWidgetImplWidgetExtensionProviderImplInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqWorkflowImplEmailEMailNotificationServiceInfo
        */
        def Configmgr_comDayCqWorkflowImplEmailEMailNotificationService(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], fromPeriodaddress: Option[String], hostPeriodprefix: Option[String], notifyPeriodonabort: Option[Boolean], notifyPeriodoncomplete: Option[Boolean], notifyPeriodoncontainercomplete: Option[Boolean], notifyPerioduseronly: Option[Boolean]): Either[CommonError,ComDayCqWorkflowImplEmailEMailNotificationServiceInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCqWorkflowImplEmailTaskEMailNotificationServiceInfo
        */
        def Configmgr_comDayCqWorkflowImplEmailTaskEMailNotificationService(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], notifyPeriodonupdate: Option[Boolean], notifyPeriodoncomplete: Option[Boolean]): Either[CommonError,ComDayCqWorkflowImplEmailTaskEMailNotificationServiceInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerInfo
        */
        def Configmgr_comDayCrxSecurityTokenImplImplTokenAuthenticationHandler(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], path: Option[String], tokenPeriodrequiredPeriodattr: Option[String], tokenPeriodalternatePeriodurl: Option[String], tokenPeriodencapsulated: Option[Boolean], skipPeriodtokenPeriodrefresh: Seq[String]): Either[CommonError,ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerInfo] = Left(TODO)

        /**
        * 
        * @return A ComDayCrxSecurityTokenImplTokenCleanupTaskInfo
        */
        def Configmgr_comDayCrxSecurityTokenImplTokenCleanupTask(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], enablePeriodtokenPeriodcleanupPeriodtask: Option[Boolean], schedulerPeriodexpression: Option[String], batchPeriodsize: Option[Int]): Either[CommonError,ComDayCrxSecurityTokenImplTokenCleanupTaskInfo] = Left(TODO)

        /**
        * 
        * @return A GuideLocalizationServiceInfo
        */
        def Configmgr_guideLocalizationService(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], supportedLocales: Seq[String], localizable Properties: Seq[String]): Either[CommonError,GuideLocalizationServiceInfo] = Left(TODO)

        /**
        * 
        * @return A MessagingUserComponentFactoryInfo
        */
        def Configmgr_messagingUserComponentFactory(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], priority: Option[Int]): Either[CommonError,MessagingUserComponentFactoryInfo] = Left(TODO)

        /**
        * 
        * @return A OrgApacheAriesJmxFrameworkStateConfigInfo
        */
        def Configmgr_orgApacheAriesJmxFrameworkStateConfig(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], attributeChangeNotificationEnabled: Option[Boolean]): Either[CommonError,OrgApacheAriesJmxFrameworkStateConfigInfo] = Left(TODO)

        /**
        * 
        * @return A OrgApacheFelixEventadminImplEventAdminInfo
        */
        def Configmgr_orgApacheFelixEventadminImplEventAdmin(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], orgPeriodapachePeriodfelixPeriodeventadminPeriodThreadPoolSize: Option[Int], orgPeriodapachePeriodfelixPeriodeventadminPeriodAsyncToSyncThreadRatio: Option[BigDecimal], orgPeriodapachePeriodfelixPeriodeventadminPeriodTimeout: Option[Int], orgPeriodapachePeriodfelixPeriodeventadminPeriodRequireTopic: Option[Boolean], orgPeriodapachePeriodfelixPeriodeventadminPeriodIgnoreTimeout: Seq[String], orgPeriodapachePeriodfelixPeriodeventadminPeriodIgnoreTopic: Seq[String]): Either[CommonError,OrgApacheFelixEventadminImplEventAdminInfo] = Left(TODO)

        /**
        * 
        * @return A OrgApacheFelixHttpInfo
        */
        def Configmgr_orgApacheFelixHttp(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], orgPeriodapachePeriodfelixPeriodhttpPeriodhost: Option[String], orgPeriodapachePeriodfelixPeriodhttpPeriodenable: Option[Boolean], orgPeriodosgiPeriodservicePeriodhttpPeriodport: Option[Int], orgPeriodapachePeriodfelixPeriodhttpPeriodtimeout: Option[Int], orgPeriodapachePeriodfelixPeriodhttpsPeriodenable: Option[Boolean], orgPeriodosgiPeriodservicePeriodhttpPeriodportPeriodsecure: Option[Int], orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystore: Option[String], orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodpassword: Option[String], orgPeriodapachePeriodfelixPeriodhttpsPeriodkeystorePeriodkeyPeriodpassword: Option[String], orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststore: Option[String], orgPeriodapachePeriodfelixPeriodhttpsPeriodtruststorePeriodpassword: Option[String], orgPeriodapachePeriodfelixPeriodhttpsPeriodclientcertificate: Option[String], orgPeriodapachePeriodfelixPeriodhttpPeriodcontextPath: Option[String], orgPeriodapachePeriodfelixPeriodhttpPeriodmbeans: Option[Boolean], orgPeriodapachePeriodfelixPeriodhttpPeriodsessionPeriodtimeout: Option[Int], orgPeriodapachePeriodfelixPeriodhttpPeriodjettyPeriodthreadpoolPeriodmax: Option[Int], orgPeriodapachePeriodfelixPeriodhttpPeriodjettyPeriodacceptors: Option[Int], orgPeriodapachePeriodfelixPeriodhttpPeriodjettyPeriodselectors: Option[Int], orgPeriodapachePeriodfelixPeriodhttpPeriodjettyPeriodheaderBufferSize: Option[Int], orgPeriodapachePeriodfelixPeriodhttpPeriodjettyPeriodrequestBufferSize: Option[Int], orgPeriodapachePeriodfelixPeriodhttpPeriodjettyPeriodresponseBufferSize: Option[Int], orgPeriodapachePeriodfelixPeriodhttpPeriodjettyPeriodmaxFormSize: Option[Int], orgPeriodapachePeriodfelixPeriodhttpPeriodpathExclusions: Seq[String], orgPeriodapachePeriodfelixPeriodhttpsPeriodjettyPeriodciphersuitesPeriodexcluded: Seq[String], orgPeriodapachePeriodfelixPeriodhttpsPeriodjettyPeriodciphersuitesPeriodincluded: Seq[String], orgPeriodapachePeriodfelixPeriodhttpPeriodjettyPeriodsendServerHeader: Option[Boolean], orgPeriodapachePeriodfelixPeriodhttpsPeriodjettyPeriodprotocolsPeriodincluded: Seq[String], orgPeriodapachePeriodfelixPeriodhttpsPeriodjettyPeriodprotocolsPeriodexcluded: Seq[String], orgPeriodapachePeriodfelixPeriodproxyPeriodloadPeriodbalancerPeriodconnectionPeriodenable: Option[Boolean], orgPeriodapachePeriodfelixPeriodhttpsPeriodjettyPeriodrenegotiateAllowed: Option[Boolean], orgPeriodapachePeriodfelixPeriodhttpsPeriodjettyPeriodsessionPeriodcookiePeriodhttpOnly: Option[Boolean], orgPeriodapachePeriodfelixPeriodhttpsPeriodjettyPeriodsessionPeriodcookiePeriodsecure: Option[Boolean], orgPeriodeclipsePeriodjettyPeriodservletPeriodSessionIdPathParameterName: Option[String], orgPeriodeclipsePeriodjettyPeriodservletPeriodCheckingRemoteSessionIdEncoding: Option[Boolean], orgPeriodeclipsePeriodjettyPeriodservletPeriodSessionCookie: Option[String], orgPeriodeclipsePeriodjettyPeriodservletPeriodSessionDomain: Option[String], orgPeriodeclipsePeriodjettyPeriodservletPeriodSessionPath: Option[String], orgPeriodeclipsePeriodjettyPeriodservletPeriodMaxAge: Option[Int], orgPeriodapachePeriodfelixPeriodhttpPeriodname: Option[String], orgPeriodapachePeriodfelixPeriodjettyPeriodgziphandlerPeriodenable: Option[Boolean], orgPeriodapachePeriodfelixPeriodjettyPeriodgzipPeriodminGzipSize: Option[Int], orgPeriodapachePeriodfelixPeriodjettyPeriodgzipPeriodcompressionLevel: Option[Int], orgPeriodapachePeriodfelixPeriodjettyPeriodgzipPeriodinflateBufferSize: Option[Int], orgPeriodapachePeriodfelixPeriodjettyPeriodgzipPeriodsyncFlush: Option[Boolean], orgPeriodapachePeriodfelixPeriodjettyPeriodgzipPeriodexcludedUserAgents: Seq[String], orgPeriodapachePeriodfelixPeriodjettyPeriodgzipPeriodincludedMethods: Seq[String], orgPeriodapachePeriodfelixPeriodjettyPeriodgzipPeriodexcludedMethods: Seq[String], orgPeriodapachePeriodfelixPeriodjettyPeriodgzipPeriodincludedPaths: Seq[String], orgPeriodapachePeriodfelixPeriodjettyPeriodgzipPeriodexcludedPaths: Seq[String], orgPeriodapachePeriodfelixPeriodjettyPeriodgzipPeriodincludedMimeTypes: Seq[String], orgPeriodapachePeriodfelixPeriodjettyPeriodgzipPeriodexcludedMimeTypes: Seq[String], orgPeriodapachePeriodfelixPeriodhttpPeriodsessionPeriodinvalidate: Option[Boolean], orgPeriodapachePeriodfelixPeriodhttpPeriodsessionPerioduniqueid: Option[Boolean]): Either[CommonError,OrgApacheFelixHttpInfo] = Left(TODO)

        /**
        * 
        * @return A OrgApacheFelixHttpSslfilterSslFilterInfo
        */
        def Configmgr_orgApacheFelixHttpSslfilterSslFilter(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], sslForwardPeriodheader: Option[String], sslForwardPeriodvalue: Option[String], sslForwardCertPeriodheader: Option[String], rewritePeriodabsolutePeriodurls: Option[Boolean]): Either[CommonError,OrgApacheFelixHttpSslfilterSslFilterInfo] = Left(TODO)

        /**
        * 
        * @return A OrgApacheFelixJaasConfigurationFactoryInfo
        */
        def Configmgr_orgApacheFelixJaasConfigurationFactory(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], jaasPeriodcontrolFlag: Option[String], jaasPeriodranking: Option[Int], jaasPeriodrealmName: Option[String], jaasPeriodclassname: Option[String], jaasPeriodoptions: Seq[String]): Either[CommonError,OrgApacheFelixJaasConfigurationFactoryInfo] = Left(TODO)

        /**
        * 
        * @return A OrgApacheFelixJaasConfigurationSpiInfo
        */
        def Configmgr_orgApacheFelixJaasConfigurationSpi(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], jaasPerioddefaultRealmName: Option[String], jaasPeriodconfigProviderName: Option[String], jaasPeriodglobalConfigPolicy: Option[String]): Either[CommonError,OrgApacheFelixJaasConfigurationSpiInfo] = Left(TODO)

        /**
        * 
        * @return A OrgApacheFelixScrScrServiceInfo
        */
        def Configmgr_orgApacheFelixScrScrService(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], dsPeriodloglevel: Option[Int], dsPeriodfactoryPeriodenabled: Option[Boolean], dsPerioddelayedPeriodkeepInstances: Option[Boolean], dsPeriodlockPeriodtimeoutPeriodmilliseconds: Option[Int], dsPeriodstopPeriodtimeoutPeriodmilliseconds: Option[Int], dsPeriodglobalPeriodextender: Option[Boolean]): Either[CommonError,OrgApacheFelixScrScrServiceInfo] = Left(TODO)

        /**
        * 
        * @return A OrgApacheFelixSystemreadyImplComponentsCheckInfo
        */
        def Configmgr_orgApacheFelixSystemreadyImplComponentsCheck(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], componentsPeriodlist: Seq[String], _type: Option[String]): Either[CommonError,OrgApacheFelixSystemreadyImplComponentsCheckInfo] = Left(TODO)

        /**
        * 
        * @return A OrgApacheFelixSystemreadyImplFrameworkStartCheckInfo
        */
        def Configmgr_orgApacheFelixSystemreadyImplFrameworkStartCheck(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], timeout: Option[Int], targetPeriodstartPeriodlevel: Option[Int], targetPeriodstartPeriodlevelPeriodpropPeriodname: Option[String], _type: Option[String]): Either[CommonError,OrgApacheFelixSystemreadyImplFrameworkStartCheckInfo] = Left(TODO)

        /**
        * 
        * @return A OrgApacheFelixSystemreadyImplServicesCheckInfo
        */
        def Configmgr_orgApacheFelixSystemreadyImplServicesCheck(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], servicesPeriodlist: Seq[String], _type: Option[String]): Either[CommonError,OrgApacheFelixSystemreadyImplServicesCheckInfo] = Left(TODO)

        /**
        * 
        * @return A OrgApacheFelixSystemreadyImplServletSystemAliveServletInfo
        */
        def Configmgr_orgApacheFelixSystemreadyImplServletSystemAliveServlet(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], osgiPeriodhttpPeriodwhiteboardPeriodservletPeriodpattern: Option[String], osgiPeriodhttpPeriodwhiteboardPeriodcontextPeriodselect: Option[String]): Either[CommonError,OrgApacheFelixSystemreadyImplServletSystemAliveServletInfo] = Left(TODO)

        /**
        * 
        * @return A OrgApacheFelixSystemreadyImplServletSystemReadyServletInfo
        */
        def Configmgr_orgApacheFelixSystemreadyImplServletSystemReadyServlet(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], osgiPeriodhttpPeriodwhiteboardPeriodservletPeriodpattern: Option[String], osgiPeriodhttpPeriodwhiteboardPeriodcontextPeriodselect: Option[String]): Either[CommonError,OrgApacheFelixSystemreadyImplServletSystemReadyServletInfo] = Left(TODO)

        /**
        * 
        * @return A OrgApacheFelixSystemreadySystemReadyMonitorInfo
        */
        def Configmgr_orgApacheFelixSystemreadySystemReadyMonitor(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], pollPeriodinterval: Option[Int]): Either[CommonError,OrgApacheFelixSystemreadySystemReadyMonitorInfo] = Left(TODO)

        /**
        * 
        * @return A OrgApacheFelixWebconsoleInternalServletOsgiManagerInfo
        */
        def Configmgr_orgApacheFelixWebconsoleInternalServletOsgiManager(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], managerPeriodroot: Option[String], httpPeriodservicePeriodfilter: Option[String], defaultPeriodrender: Option[String], realm: Option[String], username: Option[String], password: Option[String], category: Option[String], locale: Option[String], loglevel: Option[Int], plugins: Option[String]): Either[CommonError,OrgApacheFelixWebconsoleInternalServletOsgiManagerInfo] = Left(TODO)

        /**
        * 
        * @return A OrgApacheFelixWebconsolePluginsEventInternalPluginServletInfo
        */
        def Configmgr_orgApacheFelixWebconsolePluginsEventInternalPluginServlet(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], maxPeriodsize: Option[Int]): Either[CommonError,OrgApacheFelixWebconsolePluginsEventInternalPluginServletInfo] = Left(TODO)

        /**
        * 
        * @return A OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoInfo
        */
        def Configmgr_orgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCo(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], felixPeriodmemoryusagePerioddumpPeriodthreshold: Option[Int], felixPeriodmemoryusagePerioddumpPeriodinterval: Option[Int], felixPeriodmemoryusagePerioddumpPeriodlocation: Option[String]): Either[CommonError,OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoInfo] = Left(TODO)

        /**
        * 
        * @return A OrgApacheHttpProxyconfiguratorInfo
        */
        def Configmgr_orgApacheHttpProxyconfigurator(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], proxyPeriodenabled: Option[Boolean], proxyPeriodhost: Option[String], proxyPeriodport: Option[Int], proxyPerioduser: Option[String], proxyPeriodpassword: Option[String], proxyPeriodexceptions: Seq[String]): Either[CommonError,OrgApacheHttpProxyconfiguratorInfo] = Left(TODO)

        /**
        * 
        * @return A OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderInfo
        */
        def Configmgr_orgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProvider(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], dir: Option[String]): Either[CommonError,OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderInfo] = Left(TODO)

        /**
        * 
        * @return A OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreInfo
        */
        def Configmgr_orgApacheJackrabbitOakPluginsBlobDatastoreFileDataStore(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], path: Option[String]): Either[CommonError,OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreInfo] = Left(TODO)

        /**
        * 
        * @return A OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceInfo
        */
        def Configmgr_orgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreService(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], mongouri: Option[String], db: Option[String], socketKeepAlive: Option[Boolean], cache: Option[Int], nodeCachePercentage: Option[Int], prevDocCachePercentage: Option[Int], childrenCachePercentage: Option[Int], diffCachePercentage: Option[Int], cacheSegmentCount: Option[Int], cacheStackMoveDistance: Option[Int], blobCacheSize: Option[Int], persistentCache: Option[String], journalCache: Option[String], customBlobStore: Option[Boolean], journalGCInterval: Option[Int], journalGCMaxAge: Option[Int], prefetchExternalChanges: Option[Boolean], role: Option[String], versionGcMaxAgeInSecs: Option[Int], versionGCExpression: Option[String], versionGCTimeLimitInSecs: Option[Int], blobGcMaxAgeInSecs: Option[Int], blobTrackSnapshotIntervalInSecs: Option[Int], repositoryPeriodhome: Option[String], maxReplicationLagInSecs: Option[Int], documentStoreType: Option[String], bundlingDisabled: Option[Boolean], updateLimit: Option[Int], persistentCacheIncludes: Seq[String], leaseCheckMode: Option[String]): Either[CommonError,OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceInfo] = Left(TODO)

        /**
        * 
        * @return A OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreInfo
        */
        def Configmgr_orgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePre(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], persistentCacheIncludes: Seq[String]): Either[CommonError,OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreInfo] = Left(TODO)

        /**
        * 
        * @return A OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacInfo
        */
        def Configmgr_orgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCac(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], includedPaths: Seq[String], enableAsyncObserver: Option[Boolean], observerQueueSize: Option[Int]): Either[CommonError,OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacInfo] = Left(TODO)

        /**
        * 
        * @return A OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceInfo
        */
        def Configmgr_orgApacheJackrabbitOakPluginsIndexAsyncIndexerService(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], asyncConfigs: Seq[String], leaseTimeOutMinutes: Option[Int], failingIndexTimeoutSeconds: Option[Int], errorWarnIntervalSeconds: Option[Int]): Either[CommonError,OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceInfo] = Left(TODO)

        /**
        * 
        * @return A OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServInfo
        */
        def Configmgr_orgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServ(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], disabled: Option[Boolean], debug: Option[Boolean], localIndexDir: Option[String], enableOpenIndexAsync: Option[Boolean], threadPoolSize: Option[Int], prefetchIndexFiles: Option[Boolean], extractedTextCacheSizeInMB: Option[Int], extractedTextCacheExpiryInSecs: Option[Int], alwaysUsePreExtractedCache: Option[Boolean], booleanClauseLimit: Option[Int], enableHybridIndexing: Option[Boolean], hybridQueueSize: Option[Int], disableStoredIndexDefinition: Option[Boolean], deletedBlobsCollectionEnabled: Option[Boolean], propIndexCleanerIntervalInSecs: Option[Int], enableSingleBlobIndexFiles: Option[Boolean]): Either[CommonError,OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServInfo] = Left(TODO)

        /**
        * 
        * @return A OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoInfo
        */
        def Configmgr_orgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCo(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], solrPeriodhomePeriodpath: Option[String], solrPeriodcorePeriodname: Option[String]): Either[CommonError,OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoInfo] = Left(TODO)

        /**
        * 
        * @return A OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersInfo
        */
        def Configmgr_orgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServers(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], enabled: Option[Boolean]): Either[CommonError,OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersInfo] = Left(TODO)

        /**
        * 
        * @return A OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationInfo
        */
        def Configmgr_orgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfiguration(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], pathPerioddescPeriodfield: Option[String], pathPeriodchildPeriodfield: Option[String], pathPeriodparentPeriodfield: Option[String], pathPeriodexactPeriodfield: Option[String], catchPeriodallPeriodfield: Option[String], collapsedPeriodpathPeriodfield: Option[String], pathPerioddepthPeriodfield: Option[String], commitPeriodpolicy: Option[String], rows: Option[Int], pathPeriodrestrictions: Option[Boolean], propertyPeriodrestrictions: Option[Boolean], primarytypesPeriodrestrictions: Option[Boolean], ignoredPeriodproperties: Seq[String], usedPeriodproperties: Seq[String], typePeriodmappings: Seq[String], propertyPeriodmappings: Seq[String], collapsePeriodjcrcontentPeriodnodes: Option[Boolean]): Either[CommonError,OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationInfo] = Left(TODO)

        /**
        * 
        * @return A OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfInfo
        */
        def Configmgr_orgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConf(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], solrPeriodhttpPeriodurl: Option[String], solrPeriodzkPeriodhost: Option[String], solrPeriodcollection: Option[String], solrPeriodsocketPeriodtimeout: Option[Int], solrPeriodconnectionPeriodtimeout: Option[Int], solrPeriodshardsPeriodno: Option[Int], solrPeriodreplicationPeriodfactor: Option[Int], solrPeriodconfPerioddir: Option[String]): Either[CommonError,OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfInfo] = Left(TODO)

        /**
        * 
        * @return A OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidInfo
        */
        def Configmgr_orgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvid(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], queryPeriodaggregation: Option[Boolean]): Either[CommonError,OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidInfo] = Left(TODO)

        /**
        * 
        * @return A OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeInfo
        */
        def Configmgr_orgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSe(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], serverPeriodtype: Option[String]): Either[CommonError,OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeInfo] = Left(TODO)

        /**
        * 
        * @return A OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryInfo
        */
        def Configmgr_orgApacheJackrabbitOakPluginsMetricStatisticsProviderFactory(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], providerType: Option[String]): Either[CommonError,OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryInfo] = Left(TODO)

        /**
        * 
        * @return A OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderInfo
        */
        def Configmgr_orgApacheJackrabbitOakPluginsObservationChangeCollectorProvider(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], maxItems: Option[Int], maxPathDepth: Option[Int], enabled: Option[Boolean]): Either[CommonError,OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderInfo] = Left(TODO)

        /**
        * 
        * @return A OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceInfo
        */
        def Configmgr_orgApacheJackrabbitOakQueryQueryEngineSettingsService(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], queryLimitInMemory: Option[Int], queryLimitReads: Option[Int], queryFailTraversal: Option[Boolean], fastQuerySize: Option[Boolean]): Either[CommonError,OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceInfo] = Left(TODO)

        /**
        * 
        * @return A OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigInfo
        */
        def Configmgr_orgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfig(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], orgPeriodapachePeriodjackrabbitPeriodoakPeriodauthenticationPeriodappName: Option[String], orgPeriodapachePeriodjackrabbitPeriodoakPeriodauthenticationPeriodconfigSpiName: Option[String]): Either[CommonError,OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigInfo] = Left(TODO)

        /**
        * 
        * @return A OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiInfo
        */
        def Configmgr_orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdenti(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], providerPeriodname: Option[String], hostPeriodname: Option[String], hostPeriodport: Option[Int], hostPeriodssl: Option[Boolean], hostPeriodtls: Option[Boolean], hostPeriodnoCertCheck: Option[Boolean], bindPerioddn: Option[String], bindPeriodpassword: Option[String], searchTimeout: Option[String], adminPoolPeriodmaxActive: Option[Int], adminPoolPeriodlookupOnValidate: Option[Boolean], userPoolPeriodmaxActive: Option[Int], userPoolPeriodlookupOnValidate: Option[Boolean], userPeriodbaseDN: Option[String], userPeriodobjectclass: Seq[String], userPeriodidAttribute: Option[String], userPeriodextraFilter: Option[String], userPeriodmakeDnPath: Option[Boolean], groupPeriodbaseDN: Option[String], groupPeriodobjectclass: Seq[String], groupPeriodnameAttribute: Option[String], groupPeriodextraFilter: Option[String], groupPeriodmakeDnPath: Option[Boolean], groupPeriodmemberAttribute: Option[String], useUidForExtId: Option[Boolean], customattributes: Seq[String]): Either[CommonError,OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiInfo] = Left(TODO)

        /**
        * 
        * @return A OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraInfo
        */
        def Configmgr_orgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfigura(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], tokenExpiration: Option[String], tokenLength: Option[String], tokenRefresh: Option[Boolean], tokenCleanupThreshold: Option[Int], passwordHashAlgorithm: Option[String], passwordHashIterations: Option[Int], passwordSaltSize: Option[Int]): Either[CommonError,OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraInfo] = Left(TODO)

        /**
        * 
        * @return A OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurInfo
        */
        def Configmgr_orgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigur(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], permissionsJr2: Option[String], importBehavior: Option[String], readPaths: Seq[String], administrativePrincipals: Seq[String], configurationRanking: Option[Int]): Either[CommonError,OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurInfo] = Left(TODO)

        /**
        * 
        * @return A OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiInfo
        */
        def Configmgr_orgApacheJackrabbitOakSecurityInternalSecurityProviderRegistrati(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], requiredServicePids: Seq[String], authorizationCompositionType: Option[String]): Either[CommonError,OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiInfo] = Left(TODO)

        /**
        * 
        * @return A OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameInfo
        */
        def Configmgr_orgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeName(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], length: Option[Int]): Either[CommonError,OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameInfo] = Left(TODO)

        /**
        * 
        * @return A OrgApacheJackrabbitOakSecurityUserUserConfigurationImplInfo
        */
        def Configmgr_orgApacheJackrabbitOakSecurityUserUserConfigurationImpl(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], usersPath: Option[String], groupsPath: Option[String], systemRelativePath: Option[String], defaultDepth: Option[Int], importBehavior: Option[String], passwordHashAlgorithm: Option[String], passwordHashIterations: Option[Int], passwordSaltSize: Option[Int], omitAdminPw: Option[Boolean], supportAutoSave: Option[Boolean], passwordMaxAge: Option[Int], initialPasswordChange: Option[Boolean], passwordHistorySize: Option[Int], passwordExpiryForAdmin: Option[Boolean], cacheExpiration: Option[Int], enableRFC7613UsercaseMappedProfile: Option[Boolean]): Either[CommonError,OrgApacheJackrabbitOakSecurityUserUserConfigurationImplInfo] = Left(TODO)

        /**
        * 
        * @return A OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceInfo
        */
        def Configmgr_orgApacheJackrabbitOakSegmentAzureAzureSegmentStoreService(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], accountName: Option[String], containerName: Option[String], accessKey: Option[String], rootPath: Option[String], connectionURL: Option[String]): Either[CommonError,OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceInfo] = Left(TODO)

        /**
        * 
        * @return A OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryInfo
        */
        def Configmgr_orgApacheJackrabbitOakSegmentSegmentNodeStoreFactory(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], repositoryPeriodhome: Option[String], tarmkPeriodmode: Option[String], tarmkPeriodsize: Option[Int], segmentCachePeriodsize: Option[Int], stringCachePeriodsize: Option[Int], templateCachePeriodsize: Option[Int], stringDeduplicationCachePeriodsize: Option[Int], templateDeduplicationCachePeriodsize: Option[Int], nodeDeduplicationCachePeriodsize: Option[Int], pauseCompaction: Option[Boolean], compactionPeriodretryCount: Option[Int], compactionPeriodforcePeriodtimeout: Option[Int], compactionPeriodsizeDeltaEstimation: Option[Int], compactionPerioddisableEstimation: Option[Boolean], compactionPeriodretainedGenerations: Option[Int], compactionPeriodmemoryThreshold: Option[Int], compactionPeriodprogressLog: Option[Int], standby: Option[Boolean], customBlobStore: Option[Boolean], customSegmentStore: Option[Boolean], splitPersistence: Option[Boolean], repositoryPeriodbackupPerioddir: Option[String], blobGcMaxAgeInSecs: Option[Int], blobTrackSnapshotIntervalInSecs: Option[Int], role: Option[String], registerDescriptors: Option[Boolean], dispatchChanges: Option[Boolean]): Either[CommonError,OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryInfo] = Left(TODO)

        /**
        * 
        * @return A OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceInfo
        */
        def Configmgr_orgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorService(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], commitsTrackerWriterGroups: Seq[String]): Either[CommonError,OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceInfo] = Left(TODO)

        /**
        * 
        * @return A OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceInfo
        */
        def Configmgr_orgApacheJackrabbitOakSegmentSegmentNodeStoreService(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], repositoryPeriodhome: Option[String], tarmkPeriodmode: Option[String], tarmkPeriodsize: Option[Int], segmentCachePeriodsize: Option[Int], stringCachePeriodsize: Option[Int], templateCachePeriodsize: Option[Int], stringDeduplicationCachePeriodsize: Option[Int], templateDeduplicationCachePeriodsize: Option[Int], nodeDeduplicationCachePeriodsize: Option[Int], pauseCompaction: Option[Boolean], compactionPeriodretryCount: Option[Int], compactionPeriodforcePeriodtimeout: Option[Int], compactionPeriodsizeDeltaEstimation: Option[Int], compactionPerioddisableEstimation: Option[Boolean], compactionPeriodretainedGenerations: Option[Int], compactionPeriodmemoryThreshold: Option[Int], compactionPeriodprogressLog: Option[Int], standby: Option[Boolean], customBlobStore: Option[Boolean], customSegmentStore: Option[Boolean], splitPersistence: Option[Boolean], repositoryPeriodbackupPerioddir: Option[String], blobGcMaxAgeInSecs: Option[Int], blobTrackSnapshotIntervalInSecs: Option[Int]): Either[CommonError,OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceInfo] = Left(TODO)

        /**
        * 
        * @return A OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceInfo
        */
        def Configmgr_orgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreService(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], orgPeriodapachePeriodslingPeriodinstallerPeriodconfigurationPeriodpersist: Option[Boolean], mode: Option[String], port: Option[Int], primaryPeriodhost: Option[String], interval: Option[Int], primaryPeriodallowedClientIpRanges: Seq[String], secure: Option[Boolean], standbyPeriodreadtimeout: Option[Int], standbyPeriodautoclean: Option[Boolean]): Either[CommonError,OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceInfo] = Left(TODO)

        /**
        * 
        * @return A OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeInfo
        */
        def Configmgr_orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDe(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], handlerPeriodname: Option[String], userPeriodexpirationTime: Option[String], userPeriodautoMembership: Seq[String], userPeriodpropertyMapping: Seq[String], userPeriodpathPrefix: Option[String], userPeriodmembershipExpTime: Option[String], userPeriodmembershipNestingDepth: Option[Int], userPerioddynamicMembership: Option[Boolean], userPerioddisableMissing: Option[Boolean], groupPeriodexpirationTime: Option[String], groupPeriodautoMembership: Seq[String], groupPeriodpropertyMapping: Seq[String], groupPeriodpathPrefix: Option[String], enableRFC7613UsercaseMappedProfile: Option[Boolean]): Either[CommonError,OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeInfo] = Left(TODO)

        /**
        * 
        * @return A OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExInfo
        */
        def Configmgr_orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplEx(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], jaasPeriodranking: Option[Int], jaasPeriodcontrolFlag: Option[String], jaasPeriodrealmName: Option[String], idpPeriodname: Option[String], syncPeriodhandlerName: Option[String]): Either[CommonError,OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExInfo] = Left(TODO)

        /**
        * 
        * @return A OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrInfo
        */
        def Configmgr_orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPr(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], protectExternalId: Option[Boolean]): Either[CommonError,OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrInfo] = Left(TODO)

        /**
        * 
        * @return A OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiInfo
        */
        def Configmgr_orgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfi(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], cugSupportedPaths: Seq[String], cugEnabled: Option[Boolean], configurationRanking: Option[Int]): Either[CommonError,OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiInfo] = Left(TODO)

        /**
        * 
        * @return A OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluInfo
        */
        def Configmgr_orgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExclu(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], principalNames: Seq[String]): Either[CommonError,OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluInfo] = Left(TODO)

        /**
        * 
        * @return A OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableInfo
        */
        def Configmgr_orgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizable(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], enabledActions: Option[String], userPrivilegeNames: Seq[String], groupPrivilegeNames: Seq[String], constraint: Option[String]): Either[CommonError,OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableInfo] = Left(TODO)

        /**
        * 
        * @return A OrgApacheJackrabbitVaultPackagingImplPackagingImplInfo
        */
        def Configmgr_orgApacheJackrabbitVaultPackagingImplPackagingImpl(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], packageRoots: Seq[String]): Either[CommonError,OrgApacheJackrabbitVaultPackagingImplPackagingImplInfo] = Left(TODO)

        /**
        * 
        * @return A OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryInfo
        */
        def Configmgr_orgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistry(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], homePath: Option[String]): Either[CommonError,OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryInfo] = Left(TODO)

        /**
        * 
        * @return A OrgApacheSlingAuthCoreImplLogoutServletInfo
        */
        def Configmgr_orgApacheSlingAuthCoreImplLogoutServlet(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], slingPeriodservletPeriodmethods: Seq[String], slingPeriodservletPeriodpaths: Option[String]): Either[CommonError,OrgApacheSlingAuthCoreImplLogoutServletInfo] = Left(TODO)

        /**
        * 
        * @return A OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderInfo
        */
        def Configmgr_orgApacheSlingCaconfigImplConfigurationBindingsValueProvider(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], enabled: Option[Boolean]): Either[CommonError,OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderInfo] = Left(TODO)

        /**
        * 
        * @return A OrgApacheSlingCaconfigImplConfigurationResolverImplInfo
        */
        def Configmgr_orgApacheSlingCaconfigImplConfigurationResolverImpl(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], configBucketNames: Seq[String]): Either[CommonError,OrgApacheSlingCaconfigImplConfigurationResolverImplInfo] = Left(TODO)

        /**
        * 
        * @return A OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraInfo
        */
        def Configmgr_orgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStra(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], enabled: Option[Boolean], configPropertyInheritancePropertyNames: Seq[String]): Either[CommonError,OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraInfo] = Left(TODO)

        /**
        * 
        * @return A OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraInfo
        */
        def Configmgr_orgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStra(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], enabled: Option[Boolean]): Either[CommonError,OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraInfo] = Left(TODO)

        /**
        * 
        * @return A OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviInfo
        */
        def Configmgr_orgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProvi(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], description: Option[String], overrides: Seq[String], enabled: Option[Boolean], servicePeriodranking: Option[Int]): Either[CommonError,OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviInfo] = Left(TODO)

        /**
        * 
        * @return A OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveInfo
        */
        def Configmgr_orgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOve(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], enabled: Option[Boolean], servicePeriodranking: Option[Int]): Either[CommonError,OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveInfo] = Left(TODO)

        /**
        * 
        * @return A OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiInfo
        */
        def Configmgr_orgApacheSlingCaconfigManagementImplConfigurationManagementSetti(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], ignorePropertyNameRegex: Seq[String], configCollectionPropertiesResourceNames: Seq[String]): Either[CommonError,OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiInfo] = Left(TODO)

        /**
        * 
        * @return A OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourInfo
        */
        def Configmgr_orgApacheSlingCaconfigResourceImplDefDefaultConfigurationResour(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], enabled: Option[Boolean], configPath: Option[String], fallbackPaths: Seq[String], configCollectionInheritancePropertyNames: Seq[String]): Either[CommonError,OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourInfo] = Left(TODO)

        /**
        * 
        * @return A OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyInfo
        */
        def Configmgr_orgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategy(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], enabled: Option[Boolean], configRefResourceNames: Seq[String], configRefPropertyNames: Seq[String], servicePeriodranking: Option[Int]): Either[CommonError,OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyInfo] = Left(TODO)

        /**
        * 
        * @return A OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserInfo
        */
        def Configmgr_orgApacheSlingCommonsHtmlInternalTagsoupHtmlParser(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], parserPeriodfeatures: Seq[String]): Either[CommonError,OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserInfo] = Left(TODO)

        /**
        * 
        * @return A OrgApacheSlingCommonsLogLogManagerInfo
        */
        def Configmgr_orgApacheSlingCommonsLogLogManager(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], orgPeriodapachePeriodslingPeriodcommonsPeriodlogPeriodlevel: Option[String], orgPeriodapachePeriodslingPeriodcommonsPeriodlogPeriodfile: Option[String], orgPeriodapachePeriodslingPeriodcommonsPeriodlogPeriodfilePeriodnumber: Option[Int], orgPeriodapachePeriodslingPeriodcommonsPeriodlogPeriodfilePeriodsize: Option[String], orgPeriodapachePeriodslingPeriodcommonsPeriodlogPeriodpattern: Option[String], orgPeriodapachePeriodslingPeriodcommonsPeriodlogPeriodconfigurationFile: Option[String], orgPeriodapachePeriodslingPeriodcommonsPeriodlogPeriodpackagingDataEnabled: Option[Boolean], orgPeriodapachePeriodslingPeriodcommonsPeriodlogPeriodmaxCallerDataDepth: Option[Int], orgPeriodapachePeriodslingPeriodcommonsPeriodlogPeriodmaxOldFileCountInDump: Option[Int], orgPeriodapachePeriodslingPeriodcommonsPeriodlogPeriodnumOfLines: Option[Int]): Either[CommonError,OrgApacheSlingCommonsLogLogManagerInfo] = Left(TODO)

        /**
        * 
        * @return A OrgApacheSlingCommonsLogLogManagerFactoryConfigInfo
        */
        def Configmgr_orgApacheSlingCommonsLogLogManagerFactoryConfig(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], orgPeriodapachePeriodslingPeriodcommonsPeriodlogPeriodlevel: Option[String], orgPeriodapachePeriodslingPeriodcommonsPeriodlogPeriodfile: Option[String], orgPeriodapachePeriodslingPeriodcommonsPeriodlogPeriodpattern: Option[String], orgPeriodapachePeriodslingPeriodcommonsPeriodlogPeriodnames: Seq[String], orgPeriodapachePeriodslingPeriodcommonsPeriodlogPeriodadditiv: Option[Boolean]): Either[CommonError,OrgApacheSlingCommonsLogLogManagerFactoryConfigInfo] = Left(TODO)

        /**
        * 
        * @return A OrgApacheSlingCommonsLogLogManagerFactoryWriterInfo
        */
        def Configmgr_orgApacheSlingCommonsLogLogManagerFactoryWriter(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], orgPeriodapachePeriodslingPeriodcommonsPeriodlogPeriodfile: Option[String], orgPeriodapachePeriodslingPeriodcommonsPeriodlogPeriodfilePeriodnumber: Option[Int], orgPeriodapachePeriodslingPeriodcommonsPeriodlogPeriodfilePeriodsize: Option[String], orgPeriodapachePeriodslingPeriodcommonsPeriodlogPeriodfilePeriodbuffered: Option[Boolean]): Either[CommonError,OrgApacheSlingCommonsLogLogManagerFactoryWriterInfo] = Left(TODO)

        /**
        * 
        * @return A OrgApacheSlingCommonsMetricsInternalLogReporterInfo
        */
        def Configmgr_orgApacheSlingCommonsMetricsInternalLogReporter(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], period: Option[Int], timeUnit: Option[String], level: Option[String], loggerName: Option[String], prefix: Option[String], pattern: Option[String], registryName: Option[String]): Either[CommonError,OrgApacheSlingCommonsMetricsInternalLogReporterInfo] = Left(TODO)

        /**
        * 
        * @return A OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterInfo
        */
        def Configmgr_orgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporter(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], datasources: Seq[String], step: Option[Int], archives: Seq[String], path: Option[String]): Either[CommonError,OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterInfo] = Left(TODO)

        /**
        * 
        * @return A OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplInfo
        */
        def Configmgr_orgApacheSlingCommonsMimeInternalMimeTypeServiceImpl(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], mimePeriodtypes: Seq[String]): Either[CommonError,OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplInfo] = Left(TODO)

        /**
        * 
        * @return A OrgApacheSlingCommonsSchedulerImplQuartzSchedulerInfo
        */
        def Configmgr_orgApacheSlingCommonsSchedulerImplQuartzScheduler(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], poolName: Option[String], allowedPoolNames: Seq[String], schedulerPerioduseleaderforsingle: Option[Boolean], metricsPeriodfilters: Seq[String], slowThresholdMillis: Option[Int]): Either[CommonError,OrgApacheSlingCommonsSchedulerImplQuartzSchedulerInfo] = Left(TODO)

        /**
        * 
        * @return A OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckInfo
        */
        def Configmgr_orgApacheSlingCommonsSchedulerImplSchedulerHealthCheck(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], maxPeriodquartzJobPerioddurationPeriodacceptable: Option[Int]): Either[CommonError,OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckInfo] = Left(TODO)

        /**
        * 
        * @return A OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryInfo
        */
        def Configmgr_orgApacheSlingCommonsThreadsImplDefaultThreadPoolFactory(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], name: Option[String], minPoolSize: Option[Int], maxPoolSize: Option[Int], queueSize: Option[Int], maxThreadAge: Option[Int], keepAliveTime: Option[Int], blockPolicy: Option[String], shutdownGraceful: Option[Boolean], daemon: Option[Boolean], shutdownWaitTime: Option[Int], priority: Option[String]): Either[CommonError,OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryInfo] = Left(TODO)

        /**
        * 
        * @return A OrgApacheSlingDatasourceDataSourceFactoryInfo
        */
        def Configmgr_orgApacheSlingDatasourceDataSourceFactory(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], datasourcePeriodname: Option[String], datasourcePeriodsvcPeriodpropPeriodname: Option[String], driverClassName: Option[String], url: Option[String], username: Option[String], password: Option[String], defaultAutoCommit: Option[String], defaultReadOnly: Option[String], defaultTransactionIsolation: Option[String], defaultCatalog: Option[String], maxActive: Option[Int], maxIdle: Option[Int], minIdle: Option[Int], initialSize: Option[Int], maxWait: Option[Int], maxAge: Option[Int], testOnBorrow: Option[Boolean], testOnReturn: Option[Boolean], testWhileIdle: Option[Boolean], validationQuery: Option[String], validationQueryTimeout: Option[Int], timeBetweenEvictionRunsMillis: Option[Int], minEvictableIdleTimeMillis: Option[Int], connectionProperties: Option[String], initSQL: Option[String], jdbcInterceptors: Option[String], validationInterval: Option[Int], logValidationErrors: Option[Boolean], datasourcePeriodsvcPeriodproperties: Seq[String]): Either[CommonError,OrgApacheSlingDatasourceDataSourceFactoryInfo] = Left(TODO)

        /**
        * 
        * @return A OrgApacheSlingDatasourceJNDIDataSourceFactoryInfo
        */
        def Configmgr_orgApacheSlingDatasourceJNDIDataSourceFactory(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], datasourcePeriodname: Option[String], datasourcePeriodsvcPeriodpropPeriodname: Option[String], datasourcePeriodjndiPeriodname: Option[String], jndiPeriodproperties: Seq[String]): Either[CommonError,OrgApacheSlingDatasourceJNDIDataSourceFactoryInfo] = Left(TODO)

        /**
        * 
        * @return A OrgApacheSlingDiscoveryOakConfigInfo
        */
        def Configmgr_orgApacheSlingDiscoveryOakConfig(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], connectorPingTimeout: Option[Int], connectorPingInterval: Option[Int], discoveryLiteCheckInterval: Option[Int], clusterSyncServiceTimeout: Option[Int], clusterSyncServiceInterval: Option[Int], enableSyncToken: Option[Boolean], minEventDelay: Option[Int], socketConnectTimeout: Option[Int], soTimeout: Option[Int], topologyConnectorUrls: Seq[String], topologyConnectorWhitelist: Seq[String], autoStopLocalLoopEnabled: Option[Boolean], gzipConnectorRequestsEnabled: Option[Boolean], hmacEnabled: Option[Boolean], enableEncryption: Option[Boolean], sharedKey: Option[String], hmacSharedKeyTTL: Option[Int], backoffStandbyFactor: Option[String], backoffStableFactor: Option[String]): Either[CommonError,OrgApacheSlingDiscoveryOakConfigInfo] = Left(TODO)

        /**
        * 
        * @return A OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckInfo
        */
        def Configmgr_orgApacheSlingDiscoveryOakSynchronizedClocksHealthCheck(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], hcPeriodname: Option[String], hcPeriodtags: Seq[String], hcPeriodmbeanPeriodname: Option[String]): Either[CommonError,OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckInfo] = Left(TODO)

        /**
        * 
        * @return A OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoInfo
        */
        def Configmgr_orgApacheSlingDistributionAgentImplForwardDistributionAgentFacto(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], name: Option[String], title: Option[String], details: Option[String], enabled: Option[Boolean], serviceName: Option[String], logPeriodlevel: Option[String], allowedPeriodroots: Seq[String], queuePeriodprocessingPeriodenabled: Option[Boolean], packageImporterPeriodendpoints: Seq[String], passiveQueues: Seq[String], priorityQueues: Seq[String], retryPeriodstrategy: Option[String], retryPeriodattempts: Option[Int], requestAuthorizationStrategyPeriodtarget: Option[String], transportSecretProviderPeriodtarget: Option[String], packageBuilderPeriodtarget: Option[String], triggersPeriodtarget: Option[String], queuePeriodprovider: Option[String], asyncPerioddelivery: Option[Boolean], httpPeriodconnPeriodtimeout: Option[Int]): Either[CommonError,OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoInfo] = Left(TODO)

        /**
        * 
        * @return A OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAInfo
        */
        def Configmgr_orgApacheSlingDistributionAgentImplPrivilegeDistributionRequestA(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], name: Option[String], jcrPrivilege: Option[String]): Either[CommonError,OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAInfo] = Left(TODO)

        /**
        * 
        * @return A OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryInfo
        */
        def Configmgr_orgApacheSlingDistributionAgentImplQueueDistributionAgentFactory(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], name: Option[String], title: Option[String], details: Option[String], enabled: Option[Boolean], serviceName: Option[String], logPeriodlevel: Option[String], allowedPeriodroots: Seq[String], requestAuthorizationStrategyPeriodtarget: Option[String], queueProviderFactoryPeriodtarget: Option[String], packageBuilderPeriodtarget: Option[String], triggersPeriodtarget: Option[String], priorityQueues: Seq[String]): Either[CommonError,OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryInfo] = Left(TODO)

        /**
        * 
        * @return A OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoInfo
        */
        def Configmgr_orgApacheSlingDistributionAgentImplReverseDistributionAgentFacto(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], name: Option[String], title: Option[String], details: Option[String], enabled: Option[Boolean], serviceName: Option[String], logPeriodlevel: Option[String], queuePeriodprocessingPeriodenabled: Option[Boolean], packageExporterPeriodendpoints: Seq[String], pullPerioditems: Option[Int], httpPeriodconnPeriodtimeout: Option[Int], requestAuthorizationStrategyPeriodtarget: Option[String], transportSecretProviderPeriodtarget: Option[String], packageBuilderPeriodtarget: Option[String], triggersPeriodtarget: Option[String]): Either[CommonError,OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoInfo] = Left(TODO)

        /**
        * 
        * @return A OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorInfo
        */
        def Configmgr_orgApacheSlingDistributionAgentImplSimpleDistributionAgentFactor(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], name: Option[String], title: Option[String], details: Option[String], enabled: Option[Boolean], serviceName: Option[String], logPeriodlevel: Option[String], queuePeriodprocessingPeriodenabled: Option[Boolean], packageExporterPeriodtarget: Option[String], packageImporterPeriodtarget: Option[String], requestAuthorizationStrategyPeriodtarget: Option[String], triggersPeriodtarget: Option[String]): Either[CommonError,OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorInfo] = Left(TODO)

        /**
        * 
        * @return A OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryInfo
        */
        def Configmgr_orgApacheSlingDistributionAgentImplSyncDistributionAgentFactory(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], name: Option[String], title: Option[String], details: Option[String], enabled: Option[Boolean], serviceName: Option[String], logPeriodlevel: Option[String], queuePeriodprocessingPeriodenabled: Option[Boolean], passiveQueues: Seq[String], packageExporterPeriodendpoints: Seq[String], packageImporterPeriodendpoints: Seq[String], retryPeriodstrategy: Option[String], retryPeriodattempts: Option[Int], pullPerioditems: Option[Int], httpPeriodconnPeriodtimeout: Option[Int], requestAuthorizationStrategyPeriodtarget: Option[String], transportSecretProviderPeriodtarget: Option[String], packageBuilderPeriodtarget: Option[String], triggersPeriodtarget: Option[String]): Either[CommonError,OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryInfo] = Left(TODO)

        /**
        * 
        * @return A OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckInfo
        */
        def Configmgr_orgApacheSlingDistributionMonitorDistributionQueueHealthCheck(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], hcPeriodname: Option[String], hcPeriodtags: Seq[String], hcPeriodmbeanPeriodname: Option[String], numberOfRetriesAllowed: Option[Int]): Either[CommonError,OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckInfo] = Left(TODO)

        /**
        * 
        * @return A OrgApacheSlingDistributionPackagingImplExporterAgentDistributioInfo
        */
        def Configmgr_orgApacheSlingDistributionPackagingImplExporterAgentDistributio(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], name: Option[String], queue: Option[String], dropPeriodinvalidPerioditems: Option[Boolean], agentPeriodtarget: Option[String]): Either[CommonError,OrgApacheSlingDistributionPackagingImplExporterAgentDistributioInfo] = Left(TODO)

        /**
        * 
        * @return A OrgApacheSlingDistributionPackagingImplExporterLocalDistributioInfo
        */
        def Configmgr_orgApacheSlingDistributionPackagingImplExporterLocalDistributio(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], name: Option[String], packageBuilderPeriodtarget: Option[String]): Either[CommonError,OrgApacheSlingDistributionPackagingImplExporterLocalDistributioInfo] = Left(TODO)

        /**
        * 
        * @return A OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiInfo
        */
        def Configmgr_orgApacheSlingDistributionPackagingImplExporterRemoteDistributi(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], name: Option[String], endpoints: Seq[String], pullPerioditems: Option[Int], packageBuilderPeriodtarget: Option[String], transportSecretProviderPeriodtarget: Option[String]): Either[CommonError,OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiInfo] = Left(TODO)

        /**
        * 
        * @return A OrgApacheSlingDistributionPackagingImplImporterLocalDistributioInfo
        */
        def Configmgr_orgApacheSlingDistributionPackagingImplImporterLocalDistributio(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], name: Option[String], packageBuilderPeriodtarget: Option[String]): Either[CommonError,OrgApacheSlingDistributionPackagingImplImporterLocalDistributioInfo] = Left(TODO)

        /**
        * 
        * @return A OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiInfo
        */
        def Configmgr_orgApacheSlingDistributionPackagingImplImporterRemoteDistributi(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], name: Option[String], endpoints: Seq[String], transportSecretProviderPeriodtarget: Option[String]): Either[CommonError,OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiInfo] = Left(TODO)

        /**
        * 
        * @return A OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriInfo
        */
        def Configmgr_orgApacheSlingDistributionPackagingImplImporterRepositoryDistri(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], name: Option[String], servicePeriodname: Option[String], path: Option[String], privilegePeriodname: Option[String]): Either[CommonError,OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriInfo] = Left(TODO)

        /**
        * 
        * @return A OrgApacheSlingDistributionResourcesImplDistributionConfigurationInfo
        */
        def Configmgr_orgApacheSlingDistributionResourcesImplDistributionConfiguration(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], providerPeriodroots: Option[String], kind: Option[String]): Either[CommonError,OrgApacheSlingDistributionResourcesImplDistributionConfigurationInfo] = Left(TODO)

        /**
        * 
        * @return A OrgApacheSlingDistributionResourcesImplDistributionServiceResourInfo
        */
        def Configmgr_orgApacheSlingDistributionResourcesImplDistributionServiceResour(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], providerPeriodroots: Option[String], kind: Option[String]): Either[CommonError,OrgApacheSlingDistributionResourcesImplDistributionServiceResourInfo] = Left(TODO)

        /**
        * 
        * @return A OrgApacheSlingDistributionSerializationImplDistributionPackageBuInfo
        */
        def Configmgr_orgApacheSlingDistributionSerializationImplDistributionPackageBu(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], name: Option[String], _type: Option[String], formatPeriodtarget: Option[String], tempFsFolder: Option[String], fileThreshold: Option[Int], memoryUnit: Option[String], useOffHeapMemory: Option[Boolean], digestAlgorithm: Option[String], monitoringQueueSize: Option[Int], cleanupDelay: Option[Int], packagePeriodfilters: Seq[String], propertyPeriodfilters: Seq[String]): Either[CommonError,OrgApacheSlingDistributionSerializationImplDistributionPackageBuInfo] = Left(TODO)

        /**
        * 
        * @return A OrgApacheSlingDistributionSerializationImplVltVaultDistributionInfo
        */
        def Configmgr_orgApacheSlingDistributionSerializationImplVltVaultDistribution(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], name: Option[String], _type: Option[String], importMode: Option[String], aclHandling: Option[String], packagePeriodroots: Option[String], packagePeriodfilters: Seq[String], propertyPeriodfilters: Seq[String], tempFsFolder: Option[String], useBinaryReferences: Option[Boolean], autoSaveThreshold: Option[Int], cleanupDelay: Option[Int], fileThreshold: Option[Int], mEGABYTES: Option[String], useOffHeapMemory: Option[Boolean], digestAlgorithm: Option[String], monitoringQueueSize: Option[Int], pathsMapping: Seq[String], strictImport: Option[Boolean]): Either[CommonError,OrgApacheSlingDistributionSerializationImplVltVaultDistributionInfo] = Left(TODO)

        /**
        * 
        * @return A OrgApacheSlingDistributionTransportImplUserCredentialsDistributiInfo
        */
        def Configmgr_orgApacheSlingDistributionTransportImplUserCredentialsDistributi(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], name: Option[String], username: Option[String], password: Option[String]): Either[CommonError,OrgApacheSlingDistributionTransportImplUserCredentialsDistributiInfo] = Left(TODO)

        /**
        * 
        * @return A OrgApacheSlingDistributionTriggerImplDistributionEventDistributeInfo
        */
        def Configmgr_orgApacheSlingDistributionTriggerImplDistributionEventDistribute(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], name: Option[String], path: Option[String]): Either[CommonError,OrgApacheSlingDistributionTriggerImplDistributionEventDistributeInfo] = Left(TODO)

        /**
        * 
        * @return A OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerInfo
        */
        def Configmgr_orgApacheSlingDistributionTriggerImplJcrEventDistributionTrigger(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], name: Option[String], path: Option[String], ignoredPathsPatterns: Seq[String], serviceName: Option[String], deep: Option[Boolean]): Either[CommonError,OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerInfo] = Left(TODO)

        /**
        * 
        * @return A OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiInfo
        */
        def Configmgr_orgApacheSlingDistributionTriggerImplPersistedJcrEventDistributi(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], name: Option[String], path: Option[String], serviceName: Option[String], nuggetsPath: Option[String]): Either[CommonError,OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiInfo] = Left(TODO)

        /**
        * 
        * @return A OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigInfo
        */
        def Configmgr_orgApacheSlingDistributionTriggerImplRemoteEventDistributionTrig(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], name: Option[String], endpoint: Option[String], transportSecretProviderPeriodtarget: Option[String]): Either[CommonError,OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigInfo] = Left(TODO)

        /**
        * 
        * @return A OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrInfo
        */
        def Configmgr_orgApacheSlingDistributionTriggerImplResourceEventDistributionTr(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], name: Option[String], path: Option[String]): Either[CommonError,OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrInfo] = Left(TODO)

        /**
        * 
        * @return A OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeInfo
        */
        def Configmgr_orgApacheSlingDistributionTriggerImplScheduledDistributionTrigge(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], name: Option[String], path: Option[String], seconds: Option[String], serviceName: Option[String]): Either[CommonError,OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeInfo] = Left(TODO)

        /**
        * 
        * @return A OrgApacheSlingEngineImplAuthSlingAuthenticatorInfo
        */
        def Configmgr_orgApacheSlingEngineImplAuthSlingAuthenticator(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], osgiPeriodhttpPeriodwhiteboardPeriodcontextPeriodselect: Option[String], osgiPeriodhttpPeriodwhiteboardPeriodlistener: Option[String], authPeriodsudoPeriodcookie: Option[String], authPeriodsudoPeriodparameter: Option[String], authPeriodannonymous: Option[Boolean], slingPeriodauthPeriodrequirements: Seq[String], slingPeriodauthPeriodanonymousPerioduser: Option[String], slingPeriodauthPeriodanonymousPeriodpassword: Option[String], authPeriodhttp: Option[String], authPeriodhttpPeriodrealm: Option[String], authPerioduriPeriodsuffix: Seq[String]): Either[CommonError,OrgApacheSlingEngineImplAuthSlingAuthenticatorInfo] = Left(TODO)

        /**
        * 
        * @return A OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterInfo
        */
        def Configmgr_orgApacheSlingEngineImplDebugRequestProgressTrackerLogFilter(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], extensions: Seq[String], minDurationMs: Option[Int], maxDurationMs: Option[Int], compactLogFormat: Option[Boolean]): Either[CommonError,OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterInfo] = Left(TODO)

        /**
        * 
        * @return A OrgApacheSlingEngineImplLogRequestLoggerInfo
        */
        def Configmgr_orgApacheSlingEngineImplLogRequestLogger(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], requestPeriodlogPeriodoutput: Option[String], requestPeriodlogPeriodoutputtype: Option[Int], requestPeriodlogPeriodenabled: Option[Boolean], accessPeriodlogPeriodoutput: Option[String], accessPeriodlogPeriodoutputtype: Option[Int], accessPeriodlogPeriodenabled: Option[Boolean]): Either[CommonError,OrgApacheSlingEngineImplLogRequestLoggerInfo] = Left(TODO)

        /**
        * 
        * @return A OrgApacheSlingEngineImplLogRequestLoggerServiceInfo
        */
        def Configmgr_orgApacheSlingEngineImplLogRequestLoggerService(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], requestPeriodlogPeriodservicePeriodformat: Option[String], requestPeriodlogPeriodservicePeriodoutput: Option[String], requestPeriodlogPeriodservicePeriodoutputtype: Option[Int], requestPeriodlogPeriodservicePeriodonentry: Option[Boolean]): Either[CommonError,OrgApacheSlingEngineImplLogRequestLoggerServiceInfo] = Left(TODO)

        /**
        * 
        * @return A OrgApacheSlingEngineImplSlingMainServletInfo
        */
        def Configmgr_orgApacheSlingEngineImplSlingMainServlet(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], slingPeriodmaxPeriodcalls: Option[Int], slingPeriodmaxPeriodinclusions: Option[Int], slingPeriodtracePeriodallow: Option[Boolean], slingPeriodmaxPeriodrecordPeriodrequests: Option[Int], slingPeriodstorePeriodpatternPeriodrequests: Seq[String], slingPeriodserverinfo: Option[String], slingPeriodadditionalPeriodresponsePeriodheaders: Seq[String]): Either[CommonError,OrgApacheSlingEngineImplSlingMainServletInfo] = Left(TODO)

        /**
        * 
        * @return A OrgApacheSlingEngineParametersInfo
        */
        def Configmgr_orgApacheSlingEngineParameters(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], slingPerioddefaultPeriodparameterPeriodencoding: Option[String], slingPerioddefaultPeriodmaxPeriodparameters: Option[Int], filePeriodlocation: Option[String], filePeriodthreshold: Option[Int], filePeriodmax: Option[Int], requestPeriodmax: Option[Int], slingPerioddefaultPeriodparameterPeriodcheckForAdditionalContainerParameters: Option[Boolean]): Either[CommonError,OrgApacheSlingEngineParametersInfo] = Left(TODO)

        /**
        * 
        * @return A OrgApacheSlingEventImplEventingThreadPoolInfo
        */
        def Configmgr_orgApacheSlingEventImplEventingThreadPool(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], minPoolSize: Option[Int]): Either[CommonError,OrgApacheSlingEventImplEventingThreadPoolInfo] = Left(TODO)

        /**
        * 
        * @return A OrgApacheSlingEventImplJobsDefaultJobManagerInfo
        */
        def Configmgr_orgApacheSlingEventImplJobsDefaultJobManager(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], queuePeriodpriority: Option[String], queuePeriodretries: Option[Int], queuePeriodretrydelay: Option[Int], queuePeriodmaxparallel: Option[Int]): Either[CommonError,OrgApacheSlingEventImplJobsDefaultJobManagerInfo] = Left(TODO)

        /**
        * 
        * @return A OrgApacheSlingEventImplJobsJcrPersistenceHandlerInfo
        */
        def Configmgr_orgApacheSlingEventImplJobsJcrPersistenceHandler(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], jobPeriodconsumermanagerPerioddisableDistribution: Option[Boolean], startupPerioddelay: Option[Int], cleanupPeriodperiod: Option[Int]): Either[CommonError,OrgApacheSlingEventImplJobsJcrPersistenceHandlerInfo] = Left(TODO)

        /**
        * 
        * @return A OrgApacheSlingEventImplJobsJobConsumerManagerInfo
        */
        def Configmgr_orgApacheSlingEventImplJobsJobConsumerManager(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], orgPeriodapachePeriodslingPeriodinstallerPeriodconfigurationPeriodpersist: Option[Boolean], jobPeriodconsumermanagerPeriodwhitelist: Seq[String], jobPeriodconsumermanagerPeriodblacklist: Seq[String]): Either[CommonError,OrgApacheSlingEventImplJobsJobConsumerManagerInfo] = Left(TODO)

        /**
        * 
        * @return A OrgApacheSlingEventJobsQueueConfigurationInfo
        */
        def Configmgr_orgApacheSlingEventJobsQueueConfiguration(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], queuePeriodname: Option[String], queuePeriodtopics: Seq[String], queuePeriodtype: Option[String], queuePeriodpriority: Option[String], queuePeriodretries: Option[Int], queuePeriodretrydelay: Option[Int], queuePeriodmaxparallel: Option[BigDecimal], queuePeriodkeepJobs: Option[Boolean], queuePeriodpreferRunOnCreationInstance: Option[Boolean], queuePeriodthreadPoolSize: Option[Int], servicePeriodranking: Option[Int]): Either[CommonError,OrgApacheSlingEventJobsQueueConfigurationInfo] = Left(TODO)

        /**
        * 
        * @return A OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWInfo
        */
        def Configmgr_orgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingW(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], users: Seq[String], groups: Seq[String]): Either[CommonError,OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWInfo] = Left(TODO)

        /**
        * 
        * @return A OrgApacheSlingFeatureflagsFeatureInfo
        */
        def Configmgr_orgApacheSlingFeatureflagsFeature(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], name: Option[String], description: Option[String], enabled: Option[Boolean]): Either[CommonError,OrgApacheSlingFeatureflagsFeatureInfo] = Left(TODO)

        /**
        * 
        * @return A OrgApacheSlingFeatureflagsImplConfiguredFeatureInfo
        */
        def Configmgr_orgApacheSlingFeatureflagsImplConfiguredFeature(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], name: Option[String], description: Option[String], enabled: Option[Boolean]): Either[CommonError,OrgApacheSlingFeatureflagsImplConfiguredFeatureInfo] = Left(TODO)

        /**
        * 
        * @return A OrgApacheSlingHapiImplHApiUtilImplInfo
        */
        def Configmgr_orgApacheSlingHapiImplHApiUtilImpl(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], orgPeriodapachePeriodslingPeriodhapiPeriodtoolsPeriodresourcetype: Option[String], orgPeriodapachePeriodslingPeriodhapiPeriodtoolsPeriodcollectionresourcetype: Option[String], orgPeriodapachePeriodslingPeriodhapiPeriodtoolsPeriodsearchpaths: Seq[String], orgPeriodapachePeriodslingPeriodhapiPeriodtoolsPeriodexternalurl: Option[String], orgPeriodapachePeriodslingPeriodhapiPeriodtoolsPeriodenabled: Option[Boolean]): Either[CommonError,OrgApacheSlingHapiImplHApiUtilImplInfo] = Left(TODO)

        /**
        * 
        * @return A OrgApacheSlingHcCoreImplCompositeHealthCheckInfo
        */
        def Configmgr_orgApacheSlingHcCoreImplCompositeHealthCheck(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], hcPeriodname: Option[String], hcPeriodtags: Seq[String], hcPeriodmbeanPeriodname: Option[String], filterPeriodtags: Seq[String], filterPeriodcombineTagsWithOr: Option[Boolean]): Either[CommonError,OrgApacheSlingHcCoreImplCompositeHealthCheckInfo] = Left(TODO)

        /**
        * 
        * @return A OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplInfo
        */
        def Configmgr_orgApacheSlingHcCoreImplExecutorHealthCheckExecutorImpl(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], timeoutInMs: Option[Int], longRunningFutureThresholdForCriticalMs: Option[Int], resultCacheTtlInMs: Option[Int]): Either[CommonError,OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplInfo] = Left(TODO)

        /**
        * 
        * @return A OrgApacheSlingHcCoreImplJmxAttributeHealthCheckInfo
        */
        def Configmgr_orgApacheSlingHcCoreImplJmxAttributeHealthCheck(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], hcPeriodname: Option[String], hcPeriodtags: Seq[String], hcPeriodmbeanPeriodname: Option[String], mbeanPeriodname: Option[String], attributePeriodname: Option[String], attributePeriodvaluePeriodconstraint: Option[String]): Either[CommonError,OrgApacheSlingHcCoreImplJmxAttributeHealthCheckInfo] = Left(TODO)

        /**
        * 
        * @return A OrgApacheSlingHcCoreImplScriptableHealthCheckInfo
        */
        def Configmgr_orgApacheSlingHcCoreImplScriptableHealthCheck(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], hcPeriodname: Option[String], hcPeriodtags: Seq[String], hcPeriodmbeanPeriodname: Option[String], expression: Option[String], languagePeriodextension: Option[String]): Either[CommonError,OrgApacheSlingHcCoreImplScriptableHealthCheckInfo] = Left(TODO)

        /**
        * 
        * @return A OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletInfo
        */
        def Configmgr_orgApacheSlingHcCoreImplServletHealthCheckExecutorServlet(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], servletPath: Option[String], disabled: Option[Boolean], corsPeriodaccessControlAllowOrigin: Option[String]): Either[CommonError,OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletInfo] = Left(TODO)

        /**
        * 
        * @return A OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerInfo
        */
        def Configmgr_orgApacheSlingHcCoreImplServletResultTxtVerboseSerializer(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], totalWidth: Option[Int], colWidthName: Option[Int], colWidthResult: Option[Int], colWidthTiming: Option[Int]): Either[CommonError,OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerInfo] = Left(TODO)

        /**
        * 
        * @return A OrgApacheSlingI18nImplI18NFilterInfo
        */
        def Configmgr_orgApacheSlingI18nImplI18NFilter(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], servicePeriodranking: Option[Int], slingPeriodfilterPeriodscope: Seq[String]): Either[CommonError,OrgApacheSlingI18nImplI18NFilterInfo] = Left(TODO)

        /**
        * 
        * @return A OrgApacheSlingI18nImplJcrResourceBundleProviderInfo
        */
        def Configmgr_orgApacheSlingI18nImplJcrResourceBundleProvider(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], localePerioddefault: Option[String], preloadPeriodbundles: Option[Boolean], invalidationPerioddelay: Option[Int]): Either[CommonError,OrgApacheSlingI18nImplJcrResourceBundleProviderInfo] = Left(TODO)

        /**
        * 
        * @return A OrgApacheSlingInstallerProviderJcrImplJcrInstallerInfo
        */
        def Configmgr_orgApacheSlingInstallerProviderJcrImplJcrInstaller(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], handlerPeriodschemes: Seq[String], slingPeriodjcrinstallPeriodfolderPeriodnamePeriodregexp: Option[String], slingPeriodjcrinstallPeriodfolderPeriodmaxPerioddepth: Option[Int], slingPeriodjcrinstallPeriodsearchPeriodpath: Seq[String], slingPeriodjcrinstallPeriodnewPeriodconfigPeriodpath: Option[String], slingPeriodjcrinstallPeriodsignalPeriodpath: Option[String], slingPeriodjcrinstallPeriodenablePeriodwriteback: Option[Boolean]): Either[CommonError,OrgApacheSlingInstallerProviderJcrImplJcrInstallerInfo] = Left(TODO)

        /**
        * 
        * @return A OrgApacheSlingJcrBaseInternalLoginAdminWhitelistInfo
        */
        def Configmgr_orgApacheSlingJcrBaseInternalLoginAdminWhitelist(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], whitelistPeriodbypass: Option[Boolean], whitelistPeriodbundlesPeriodregexp: Option[String]): Either[CommonError,OrgApacheSlingJcrBaseInternalLoginAdminWhitelistInfo] = Left(TODO)

        /**
        * 
        * @return A OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentInfo
        */
        def Configmgr_orgApacheSlingJcrBaseInternalLoginAdminWhitelistFragment(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], whitelistPeriodname: Option[String], whitelistPeriodbundles: Seq[String]): Either[CommonError,OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentInfo] = Left(TODO)

        /**
        * 
        * @return A OrgApacheSlingJcrDavexImplServletsSlingDavExServletInfo
        */
        def Configmgr_orgApacheSlingJcrDavexImplServletsSlingDavExServlet(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], alias: Option[String], davPeriodcreateAbsoluteUri: Option[Boolean], davPeriodprotectedhandlers: Option[String]): Either[CommonError,OrgApacheSlingJcrDavexImplServletsSlingDavExServletInfo] = Left(TODO)

        /**
        * 
        * @return A OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportInfo
        */
        def Configmgr_orgApacheSlingJcrJackrabbitServerJndiRegistrationSupport(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], javaPeriodnamingPeriodfactoryPeriodinitial: Option[String], javaPeriodnamingPeriodproviderPeriodurl: Option[String]): Either[CommonError,OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportInfo] = Left(TODO)

        /**
        * 
        * @return A OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportInfo
        */
        def Configmgr_orgApacheSlingJcrJackrabbitServerRmiRegistrationSupport(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], port: Option[Int]): Either[CommonError,OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportInfo] = Left(TODO)

        /**
        * 
        * @return A OrgApacheSlingJcrRepoinitImplRepositoryInitializerInfo
        */
        def Configmgr_orgApacheSlingJcrRepoinitImplRepositoryInitializer(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], references: Seq[String]): Either[CommonError,OrgApacheSlingJcrRepoinitImplRepositoryInitializerInfo] = Left(TODO)

        /**
        * 
        * @return A OrgApacheSlingJcrRepoinitRepositoryInitializerInfo
        */
        def Configmgr_orgApacheSlingJcrRepoinitRepositoryInitializer(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], references: Seq[String], scripts: Seq[String]): Either[CommonError,OrgApacheSlingJcrRepoinitRepositoryInitializerInfo] = Left(TODO)

        /**
        * 
        * @return A OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplInfo
        */
        def Configmgr_orgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImpl(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], resourcePeriodresolverPeriodsearchpath: Seq[String], resourcePeriodresolverPeriodmanglenamespaces: Option[Boolean], resourcePeriodresolverPeriodallowDirect: Option[Boolean], resourcePeriodresolverPeriodrequiredPeriodproviders: Seq[String], resourcePeriodresolverPeriodrequiredPeriodprovidernames: Seq[String], resourcePeriodresolverPeriodvirtual: Seq[String], resourcePeriodresolverPeriodmapping: Seq[String], resourcePeriodresolverPeriodmapPeriodlocation: Option[String], resourcePeriodresolverPeriodmapPeriodobservation: Seq[String], resourcePeriodresolverPerioddefaultPeriodvanityPeriodredirectPeriodstatus: Option[Int], resourcePeriodresolverPeriodenablePeriodvanitypath: Option[Boolean], resourcePeriodresolverPeriodvanitypathPeriodmaxEntries: Option[Int], resourcePeriodresolverPeriodvanitypathPeriodmaxEntriesPeriodstartup: Option[Boolean], resourcePeriodresolverPeriodvanitypathPeriodbloomfilterPeriodmaxBytes: Option[Int], resourcePeriodresolverPeriodoptimizePeriodaliasPeriodresolution: Option[Boolean], resourcePeriodresolverPeriodvanitypathPeriodwhitelist: Seq[String], resourcePeriodresolverPeriodvanitypathPeriodblacklist: Seq[String], resourcePeriodresolverPeriodvanityPeriodprecedence: Option[Boolean], resourcePeriodresolverPeriodproviderhandlingPeriodparanoid: Option[Boolean], resourcePeriodresolverPeriodlogPeriodclosing: Option[Boolean], resourcePeriodresolverPeriodlogPeriodunclosed: Option[Boolean]): Either[CommonError,OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplInfo] = Left(TODO)

        /**
        * 
        * @return A OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorInfo
        */
        def Configmgr_orgApacheSlingJcrResourceInternalJcrSystemUserValidator(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], allowPeriodonlyPeriodsystemPerioduser: Option[Boolean]): Either[CommonError,OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorInfo] = Left(TODO)

        /**
        * 
        * @return A OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryInfo
        */
        def Configmgr_orgApacheSlingJcrResourcesecurityImplResourceAccessGateFactory(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], path: Option[String], checkpathPeriodprefix: Option[String], jcrPath: Option[String]): Either[CommonError,OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryInfo] = Left(TODO)

        /**
        * 
        * @return A OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceInfo
        */
        def Configmgr_orgApacheSlingJcrWebdavImplHandlerDefaultHandlerService(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], servicePeriodranking: Option[Int], typePeriodcollections: Option[String], typePeriodnoncollections: Option[String], typePeriodcontent: Option[String]): Either[CommonError,OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceInfo] = Left(TODO)

        /**
        * 
        * @return A OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicInfo
        */
        def Configmgr_orgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServic(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], servicePeriodranking: Option[Int]): Either[CommonError,OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicInfo] = Left(TODO)

        /**
        * 
        * @return A OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletInfo
        */
        def Configmgr_orgApacheSlingJcrWebdavImplServletsSimpleWebDavServlet(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], davPeriodroot: Option[String], davPeriodcreateAbsoluteUri: Option[Boolean], davPeriodrealm: Option[String], collectionPeriodtypes: Seq[String], filterPeriodprefixes: Seq[String], filterPeriodtypes: Option[String], filterPerioduris: Option[String], typePeriodcollections: Option[String], typePeriodnoncollections: Option[String], typePeriodcontent: Option[String]): Either[CommonError,OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletInfo] = Left(TODO)

        /**
        * 
        * @return A OrgApacheSlingJmxProviderImplJMXResourceProviderInfo
        */
        def Configmgr_orgApacheSlingJmxProviderImplJMXResourceProvider(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], providerPeriodroots: Option[String]): Either[CommonError,OrgApacheSlingJmxProviderImplJMXResourceProviderInfo] = Left(TODO)

        /**
        * 
        * @return A OrgApacheSlingModelsImplModelAdapterFactoryInfo
        */
        def Configmgr_orgApacheSlingModelsImplModelAdapterFactory(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], osgiPeriodhttpPeriodwhiteboardPeriodlistener: Option[String], osgiPeriodhttpPeriodwhiteboardPeriodcontextPeriodselect: Option[String], maxPeriodrecursionPerioddepth: Option[Int], cleanupPeriodjobPeriodperiod: Option[Int]): Either[CommonError,OrgApacheSlingModelsImplModelAdapterFactoryInfo] = Left(TODO)

        /**
        * 
        * @return A OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderInfo
        */
        def Configmgr_orgApacheSlingModelsJacksonexporterImplResourceModuleProvider(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], maxPeriodrecursionPeriodlevels: Option[Int]): Either[CommonError,OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderInfo] = Left(TODO)

        /**
        * 
        * @return A OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoInfo
        */
        def Configmgr_orgApacheSlingResourceInventoryImplResourceInventoryPrinterFacto(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], felixPeriodinventoryPeriodprinterPeriodname: Option[String], felixPeriodinventoryPeriodprinterPeriodtitle: Option[String], path: Option[String]): Either[CommonError,OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoInfo] = Left(TODO)

        /**
        * 
        * @return A OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryInfo
        */
        def Configmgr_orgApacheSlingResourcemergerImplMergedResourceProviderFactory(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], mergePeriodroot: Option[String], mergePeriodreadOnly: Option[Boolean]): Either[CommonError,OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryInfo] = Left(TODO)

        /**
        * 
        * @return A OrgApacheSlingResourcemergerPickerOverridingInfo
        */
        def Configmgr_orgApacheSlingResourcemergerPickerOverriding(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], mergePeriodroot: Option[String], mergePeriodreadOnly: Option[Boolean]): Either[CommonError,OrgApacheSlingResourcemergerPickerOverridingInfo] = Left(TODO)

        /**
        * 
        * @return A OrgApacheSlingScriptingCoreImplScriptCacheImplInfo
        */
        def Configmgr_orgApacheSlingScriptingCoreImplScriptCacheImpl(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], orgPeriodapachePeriodslingPeriodscriptingPeriodcachePeriodsize: Option[Int], orgPeriodapachePeriodslingPeriodscriptingPeriodcachePeriodadditionalExtensions: Seq[String]): Either[CommonError,OrgApacheSlingScriptingCoreImplScriptCacheImplInfo] = Left(TODO)

        /**
        * 
        * @return A OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderInfo
        */
        def Configmgr_orgApacheSlingScriptingCoreImplScriptingResourceResolverProvider(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], logPeriodstacktracePeriodonclose: Option[Boolean]): Either[CommonError,OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderInfo] = Left(TODO)

        /**
        * 
        * @return A OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryInfo
        */
        def Configmgr_orgApacheSlingScriptingJavaImplJavaScriptEngineFactory(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], javaPeriodclassdebuginfo: Option[Boolean], javaPeriodjavaEncoding: Option[String], javaPeriodcompilerSourceVM: Option[String], javaPeriodcompilerTargetVM: Option[String]): Either[CommonError,OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryInfo] = Left(TODO)

        /**
        * 
        * @return A OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaInfo
        */
        def Configmgr_orgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFa(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], orgPeriodapachePeriodslingPeriodscriptingPeriodjavascriptPeriodrhinoPeriodoptLevel: Option[Int]): Either[CommonError,OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaInfo] = Left(TODO)

        /**
        * 
        * @return A OrgApacheSlingScriptingJspJspScriptEngineFactoryInfo
        */
        def Configmgr_orgApacheSlingScriptingJspJspScriptEngineFactory(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], jasperPeriodcompilerTargetVM: Option[String], jasperPeriodcompilerSourceVM: Option[String], jasperPeriodclassdebuginfo: Option[Boolean], jasperPeriodenablePooling: Option[Boolean], jasperPeriodieClassId: Option[String], jasperPeriodgenStringAsCharArray: Option[Boolean], jasperPeriodkeepgenerated: Option[Boolean], jasperPeriodmappedfile: Option[Boolean], jasperPeriodtrimSpaces: Option[Boolean], jasperPerioddisplaySourceFragments: Option[Boolean], defaultPeriodisPeriodsession: Option[Boolean]): Either[CommonError,OrgApacheSlingScriptingJspJspScriptEngineFactoryInfo] = Left(TODO)

        /**
        * 
        * @return A OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvInfo
        */
        def Configmgr_orgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProv(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], orgPeriodapachePeriodslingPeriodscriptingPeriodsightlyPeriodjsPeriodbindings: Seq[String]): Either[CommonError,OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvInfo] = Left(TODO)

        /**
        * 
        * @return A OrgApacheSlingSecurityImplContentDispositionFilterInfo
        */
        def Configmgr_orgApacheSlingSecurityImplContentDispositionFilter(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], slingPeriodcontentPerioddispositionPeriodpaths: Seq[String], slingPeriodcontentPerioddispositionPeriodexcludedPeriodpaths: Seq[String], slingPeriodcontentPerioddispositionPeriodallPeriodpaths: Option[Boolean]): Either[CommonError,OrgApacheSlingSecurityImplContentDispositionFilterInfo] = Left(TODO)

        /**
        * 
        * @return A OrgApacheSlingSecurityImplReferrerFilterInfo
        */
        def Configmgr_orgApacheSlingSecurityImplReferrerFilter(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], allowPeriodempty: Option[Boolean], allowPeriodhosts: Seq[String], allowPeriodhostsPeriodregexp: Seq[String], filterPeriodmethods: Seq[String], excludePeriodagentsPeriodregexp: Seq[String]): Either[CommonError,OrgApacheSlingSecurityImplReferrerFilterInfo] = Left(TODO)

        /**
        * 
        * @return A OrgApacheSlingServiceusermappingImplServiceUserMapperImplInfo
        */
        def Configmgr_orgApacheSlingServiceusermappingImplServiceUserMapperImpl(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], userPeriodmapping: Seq[String], userPerioddefault: Option[String], userPeriodenablePerioddefaultPeriodmapping: Option[Boolean], requirePeriodvalidation: Option[Boolean]): Either[CommonError,OrgApacheSlingServiceusermappingImplServiceUserMapperImplInfo] = Left(TODO)

        /**
        * 
        * @return A OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedInfo
        */
        def Configmgr_orgApacheSlingServiceusermappingImplServiceUserMapperImplAmended(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], servicePeriodranking: Option[Int], userPeriodmapping: Seq[String]): Either[CommonError,OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedInfo] = Left(TODO)

        /**
        * 
        * @return A OrgApacheSlingServletsGetDefaultGetServletInfo
        */
        def Configmgr_orgApacheSlingServletsGetDefaultGetServlet(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], aliases: Seq[String], index: Option[Boolean], indexPeriodfiles: Seq[String], enablePeriodhtml: Option[Boolean], enablePeriodjson: Option[Boolean], enablePeriodtxt: Option[Boolean], enablePeriodxml: Option[Boolean], jsonPeriodmaximumresults: Option[Int], ecmaSuport: Option[Boolean]): Either[CommonError,OrgApacheSlingServletsGetDefaultGetServletInfo] = Left(TODO)

        /**
        * 
        * @return A OrgApacheSlingServletsGetImplVersionVersionInfoServletInfo
        */
        def Configmgr_orgApacheSlingServletsGetImplVersionVersionInfoServlet(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], slingPeriodservletPeriodselectors: Seq[String], ecmaSuport: Option[Boolean]): Either[CommonError,OrgApacheSlingServletsGetImplVersionVersionInfoServletInfo] = Left(TODO)

        /**
        * 
        * @return A OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskInfo
        */
        def Configmgr_orgApacheSlingServletsPostImplHelperChunkCleanUpTask(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], schedulerPeriodexpression: Option[String], schedulerPeriodconcurrent: Option[Boolean], chunkPeriodcleanupPeriodage: Option[Int]): Either[CommonError,OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskInfo] = Left(TODO)

        /**
        * 
        * @return A OrgApacheSlingServletsPostImplSlingPostServletInfo
        */
        def Configmgr_orgApacheSlingServletsPostImplSlingPostServlet(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], servletPeriodpostPerioddateFormats: Seq[String], servletPeriodpostPeriodnodeNameHints: Seq[String], servletPeriodpostPeriodnodeNameMaxLength: Option[Int], servletPeriodpostPeriodcheckinNewVersionableNodes: Option[Boolean], servletPeriodpostPeriodautoCheckout: Option[Boolean], servletPeriodpostPeriodautoCheckin: Option[Boolean], servletPeriodpostPeriodignorePattern: Option[String]): Either[CommonError,OrgApacheSlingServletsPostImplSlingPostServletInfo] = Left(TODO)

        /**
        * 
        * @return A OrgApacheSlingServletsResolverSlingServletResolverInfo
        */
        def Configmgr_orgApacheSlingServletsResolverSlingServletResolver(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], servletresolverPeriodservletRoot: Option[String], servletresolverPeriodcacheSize: Option[Int], servletresolverPeriodpaths: Seq[String], servletresolverPerioddefaultExtensions: Seq[String]): Either[CommonError,OrgApacheSlingServletsResolverSlingServletResolverInfo] = Left(TODO)

        /**
        * 
        * @return A OrgApacheSlingSettingsImplSlingSettingsServiceImplInfo
        */
        def Configmgr_orgApacheSlingSettingsImplSlingSettingsServiceImpl(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], slingPeriodname: Option[String], slingPerioddescription: Option[String]): Either[CommonError,OrgApacheSlingSettingsImplSlingSettingsServiceImplInfo] = Left(TODO)

        /**
        * 
        * @return A OrgApacheSlingStartupfilterImplStartupFilterImplInfo
        */
        def Configmgr_orgApacheSlingStartupfilterImplStartupFilterImpl(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], activePeriodbyPerioddefault: Option[Boolean], defaultPeriodmessage: Option[String]): Either[CommonError,OrgApacheSlingStartupfilterImplStartupFilterImplInfo] = Left(TODO)

        /**
        * 
        * @return A OrgApacheSlingTenantInternalTenantProviderImplInfo
        */
        def Configmgr_orgApacheSlingTenantInternalTenantProviderImpl(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], tenantPeriodroot: Option[String], tenantPeriodpathPeriodmatcher: Seq[String]): Either[CommonError,OrgApacheSlingTenantInternalTenantProviderImplInfo] = Left(TODO)

        /**
        * 
        * @return A OrgApacheSlingTracerInternalLogTracerInfo
        */
        def Configmgr_orgApacheSlingTracerInternalLogTracer(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], tracerSets: Seq[String], enabled: Option[Boolean], servletEnabled: Option[Boolean], recordingCacheSizeInMB: Option[Int], recordingCacheDurationInSecs: Option[Int], recordingCompressionEnabled: Option[Boolean], gzipResponse: Option[Boolean]): Either[CommonError,OrgApacheSlingTracerInternalLogTracerInfo] = Left(TODO)

        /**
        * 
        * @return A OrgApacheSlingXssImplXSSFilterImplInfo
        */
        def Configmgr_orgApacheSlingXssImplXSSFilterImpl(post: Option[Boolean], apply: Option[Boolean], delete: Option[Boolean], action: Option[String], Dollarlocation: Option[String], propertylist: Seq[String], policyPath: Option[String]): Either[CommonError,OrgApacheSlingXssImplXSSFilterImplInfo] = Left(TODO)

}