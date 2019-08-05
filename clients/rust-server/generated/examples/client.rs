#![allow(missing_docs, unused_variables, trivial_casts)]

extern crate swagger_client;
#[allow(unused_extern_crates)]
extern crate futures;
#[allow(unused_extern_crates)]
#[macro_use]
extern crate swagger;
#[allow(unused_extern_crates)]
extern crate uuid;
extern crate clap;
extern crate tokio_core;

use swagger::{ContextBuilder, EmptyContext, XSpanIdString, Has, Push, AuthData};

#[allow(unused_imports)]
use futures::{Future, future, Stream, stream};
use tokio_core::reactor;
#[allow(unused_imports)]
use swagger_client::{ApiNoContext, ContextWrapperExt,
                      ApiError,
                      AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationResponse,
                      AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurResponse,
                      AnalyticsComponentQueryCacheServiceResponse,
                      ApacheSlingHealthCheckResultHTMLSerializerResponse,
                      ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationResponse,
                      ComAdobeAemTransactionCoreImplTransactionRecorderResponse,
                      ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCResponse,
                      ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCResponse,
                      ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplResponse,
                      ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplResponse,
                      ComAdobeCqAccountApiAccountManagementServiceResponse,
                      ComAdobeCqAccountImplAccountManagementServletResponse,
                      ComAdobeCqAddressImplLocationLocationListServletResponse,
                      ComAdobeCqAuditPurgeDamResponse,
                      ComAdobeCqAuditPurgePagesResponse,
                      ComAdobeCqAuditPurgeReplicationResponse,
                      ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterResponse,
                      ComAdobeCqCdnRewriterImplCDNConfigServiceImplResponse,
                      ComAdobeCqCdnRewriterImplCDNRewriterResponse,
                      ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleResponse,
                      ComAdobeCqCommerceImplAssetDynamicImageHandlerResponse,
                      ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplResponse,
                      ComAdobeCqCommerceImplAssetStaticImageHandlerResponse,
                      ComAdobeCqCommerceImplAssetVideoHandlerResponse,
                      ComAdobeCqCommerceImplPromotionPromotionManagerImplResponse,
                      ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplResponse,
                      ComAdobeCqCommercePimImplPageEventListenerResponse,
                      ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplResponse,
                      ComAdobeCqContentinsightImplReportingServicesSettingsProviderResponse,
                      ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletResponse,
                      ComAdobeCqContentinsightImplServletsReportingServicesProxyServleResponse,
                      ComAdobeCqDamCfmImplComponentComponentConfigImplResponse,
                      ComAdobeCqDamCfmImplConfFeatureConfigImplResponse,
                      ComAdobeCqDamCfmImplContentRewriterAssetProcessorResponse,
                      ComAdobeCqDamCfmImplContentRewriterParRangeFilterResponse,
                      ComAdobeCqDamCfmImplContentRewriterPayloadFilterResponse,
                      ComAdobeCqDamDmProcessImagePTiffManagerImplResponse,
                      ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerResponse,
                      ComAdobeCqDamMacSyncHelperImplMACSyncClientImplResponse,
                      ComAdobeCqDamMacSyncImplDAMSyncServiceImplResponse,
                      ComAdobeCqDamProcessorNuiImplNuiAssetProcessorResponse,
                      ComAdobeCqDamS7imagingImplIsImageServerComponentResponse,
                      ComAdobeCqDamS7imagingImplPsPlatformServerServletResponse,
                      ComAdobeCqDamWebdavImplIoAssetIOHandlerResponse,
                      ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobResponse,
                      ComAdobeCqDamWebdavImplIoSpecialFilesHandlerResponse,
                      ComAdobeCqDeserfwImplDeserializationFirewallImplResponse,
                      ComAdobeCqDtmImplServiceDTMWebServiceImplResponse,
                      ComAdobeCqDtmImplServletsDTMDeployHookServletResponse,
                      ComAdobeCqDtmReactorImplServiceWebServiceImplResponse,
                      ComAdobeCqExperiencelogImplExperienceLogConfigServletResponse,
                      ComAdobeCqHcContentPackagesHealthCheckResponse,
                      ComAdobeCqHistoryImplHistoryRequestFilterResponse,
                      ComAdobeCqHistoryImplHistoryServiceImplResponse,
                      ComAdobeCqInboxImplTypeproviderItemTypeProviderResponse,
                      ComAdobeCqProjectsImplServletProjectImageServletResponse,
                      ComAdobeCqProjectsPurgeSchedulerResponse,
                      ComAdobeCqScheduledExporterImplScheduledExporterImplResponse,
                      ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplResponse,
                      ComAdobeCqScreensDeviceImplDeviceServiceResponse,
                      ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplResponse,
                      ComAdobeCqScreensImplHandlerChannelsUpdateHandlerResponse,
                      ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobResponse,
                      ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplResponse,
                      ComAdobeCqScreensImplScreensChannelPostProcessorResponse,
                      ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplResponse,
                      ComAdobeCqScreensMqActivemqImplArtemisJMSProviderResponse,
                      ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplResponse,
                      ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplResponse,
                      ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagResponse,
                      ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChResponse,
                      ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckResponse,
                      ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckResponse,
                      ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckResponse,
                      ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckResponse,
                      ComAdobeCqSocialAccountverificationImplAccountManagementConfigImResponse,
                      ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenResponse,
                      ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoResponse,
                      ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerResponse,
                      ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenResponse,
                      ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySResponse,
                      ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreResponse,
                      ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIResponse,
                      ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenResponse,
                      ComAdobeCqSocialCalendarServletsTimeZoneServletResponse,
                      ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventResponse,
                      ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSeResponse,
                      ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiResponse,
                      ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCResponse,
                      ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosResponse,
                      ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterResponse,
                      ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderResponse,
                      ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplResponse,
                      ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerResponse,
                      ComAdobeCqSocialCommonsEmailreplyImplCustomEmailClientProviderResponse,
                      ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpResponse,
                      ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpResponse,
                      ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterResponse,
                      ComAdobeCqSocialCommonsEmailreplyImplGmailEmailClientProviderResponse,
                      ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderResponse,
                      ComAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProviderResponse,
                      ComAdobeCqSocialCommonsEmailreplyImplOutLookEmailClientProviderResponse,
                      ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderResponse,
                      ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderResponse,
                      ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadResponse,
                      ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplResponse,
                      ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitResponse,
                      ComAdobeCqSocialConnectOauthImplFacebookProviderImplResponse,
                      ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleResponse,
                      ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperResponse,
                      ComAdobeCqSocialConnectOauthImplTwitterProviderImplResponse,
                      ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenResponse,
                      ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryResponse,
                      ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryResponse,
                      ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorResponse,
                      ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFResponse,
                      ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoResponse,
                      ComAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLResponse,
                      ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResouResponse,
                      ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplResponse,
                      ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGeResponse,
                      ComAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaResponse,
                      ComAdobeCqSocialForumClientEndpointsImplForumOperationsServiceResponse,
                      ComAdobeCqSocialForumDispatcherImplFlushOperationsResponse,
                      ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenResponse,
                      ComAdobeCqSocialGroupImplGroupServiceImplResponse,
                      ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplResponse,
                      ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSResponse,
                      ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerResponse,
                      ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileResponse,
                      ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOResponse,
                      ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFResponse,
                      ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationResponse,
                      ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenResponse,
                      ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialResponse,
                      ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenResponse,
                      ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociResponse,
                      ComAdobeCqSocialNotificationsImplMentionsRouterResponse,
                      ComAdobeCqSocialNotificationsImplNotificationManagerImplResponse,
                      ComAdobeCqSocialNotificationsImplNotificationsRouterResponse,
                      ComAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicResponse,
                      ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIResponse,
                      ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMResponse,
                      ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSResponse,
                      ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiResponse,
                      ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletResponse,
                      ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletResponse,
                      ComAdobeCqSocialScoringImplScoringEventListenerResponse,
                      ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplResponse,
                      ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceResponse,
                      ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImResponse,
                      ComAdobeCqSocialSiteImplSiteConfiguratorImplResponse,
                      ComAdobeCqSocialSrpImplSocialSolrConnectorResponse,
                      ComAdobeCqSocialSyncImplDiffChangesObserverResponse,
                      ComAdobeCqSocialSyncImplGroupSyncListenerImplResponse,
                      ComAdobeCqSocialSyncImplPublisherSyncServiceImplResponse,
                      ComAdobeCqSocialSyncImplUserSyncListenerImplResponse,
                      ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerResponse,
                      ComAdobeCqSocialTranslationImplUGCLanguageDetectorResponse,
                      ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplResponse,
                      ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplResponse,
                      ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplResponse,
                      ComAdobeCqSocialUgcbaseImplSocialUtilsImplResponse,
                      ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplResponse,
                      ComAdobeCqSocialUgcbaseModerationImplSentimentProcessResponse,
                      ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliResponse,
                      ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplResponse,
                      ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletResponse,
                      ComAdobeCqSocialUserImplTransportHttpToPublisherResponse,
                      ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactResponse,
                      ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupResponse,
                      ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupResponse,
                      ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceResponse,
                      ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskResponse,
                      ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceResponse,
                      ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceResponse,
                      ComAdobeCqWcmLaunchesImplLaunchesEventHandlerResponse,
                      ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorResponse,
                      ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplResponse,
                      ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplResponse,
                      ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceResponse,
                      ComAdobeFdFpConfigFormsPortalSchedulerServiceResponse,
                      ComAdobeFormsCommonServiceImplDefaultDataProviderResponse,
                      ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpResponse,
                      ComAdobeFormsCommonServletTempCleanUpTaskResponse,
                      ComAdobeGraniteAcpPlatformPlatformServletResponse,
                      ComAdobeGraniteActivitystreamsImplActivityManagerImplResponse,
                      ComAdobeGraniteAnalyzerBaseSystemStatusServletResponse,
                      ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletResponse,
                      ComAdobeGraniteApicontrollerFilterResolverHookFactoryResponse,
                      ComAdobeGraniteAuthCertImplClientCertAuthHandlerResponse,
                      ComAdobeGraniteAuthImsResponse,
                      ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionResponse,
                      ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplResponse,
                      ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorResponse,
                      ComAdobeGraniteAuthImsImplIMSProviderImplResponse,
                      ComAdobeGraniteAuthImsImplImsConfigProviderImplResponse,
                      ComAdobeGraniteAuthOauthAccesstokenProviderResponse,
                      ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerResponse,
                      ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplResponse,
                      ComAdobeGraniteAuthOauthImplFacebookProviderImplResponse,
                      ComAdobeGraniteAuthOauthImplGithubProviderImplResponse,
                      ComAdobeGraniteAuthOauthImplGraniteProviderResponse,
                      ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerResponse,
                      ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalResponse,
                      ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerResponse,
                      ComAdobeGraniteAuthOauthImplTwitterProviderImplResponse,
                      ComAdobeGraniteAuthOauthProviderResponse,
                      ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerResponse,
                      ComAdobeGraniteAuthSamlSamlAuthenticationHandlerResponse,
                      ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerResponse,
                      ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckResponse,
                      ComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckResponse,
                      ComAdobeGraniteBundlesHcImplDavExBundleHealthCheckResponse,
                      ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckResponse,
                      ComAdobeGraniteBundlesHcImplJobsHealthCheckResponse,
                      ComAdobeGraniteBundlesHcImplSlingGetServletHealthCheckResponse,
                      ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckResponse,
                      ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckResponse,
                      ComAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckResponse,
                      ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheckResponse,
                      ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacResponse,
                      ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplResponse,
                      ComAdobeGraniteCompatrouterImplRoutingConfigResponse,
                      ComAdobeGraniteCompatrouterImplSwitchMappingConfigResponse,
                      ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingResponse,
                      ComAdobeGraniteContexthubImplContextHubImplResponse,
                      ComAdobeGraniteCorsImplCORSPolicyImplResponse,
                      ComAdobeGraniteCsrfImplCSRFFilterResponse,
                      ComAdobeGraniteCsrfImplCSRFServletResponse,
                      ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeResponse,
                      ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverResponse,
                      ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerResponse,
                      ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenResponse,
                      ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatResponse,
                      ComAdobeGraniteDistributionCoreImplReplicationDistributionTransResponse,
                      ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuResponse,
                      ComAdobeGraniteFragsImplCheckHttpHeaderFlagResponse,
                      ComAdobeGraniteFragsImplRandomFeatureResponse,
                      ComAdobeGraniteHttpcacheFileFileCacheStoreResponse,
                      ComAdobeGraniteHttpcacheImplOuterCacheFilterResponse,
                      ComAdobeGraniteI18nImplBundlePseudoTranslationsResponse,
                      ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceResponse,
                      ComAdobeGraniteInfocollectorInfoCollectorResponse,
                      ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryResponse,
                      ComAdobeGraniteLicenseImplLicenseCheckFilterResponse,
                      ComAdobeGraniteLoggingImplLogAnalyserImplResponse,
                      ComAdobeGraniteLoggingImplLogErrorHealthCheckResponse,
                      ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskResponse,
                      ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskResponse,
                      ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskResponse,
                      ComAdobeGraniteMonitoringImplScriptConfigImplResponse,
                      ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanResponse,
                      ComAdobeGraniteOauthServerImplAccessTokenCleanupTaskResponse,
                      ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletResponse,
                      ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletResponse,
                      ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletResponse,
                      ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletResponse,
                      ComAdobeGraniteOffloadingImplOffloadingConfiguratorResponse,
                      ComAdobeGraniteOffloadingImplOffloadingJobClonerResponse,
                      ComAdobeGraniteOffloadingImplOffloadingJobOffloaderResponse,
                      ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerResponse,
                      ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoResponse,
                      ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplResponse,
                      ComAdobeGraniteOptoutImplOptOutServiceImplResponse,
                      ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckResponse,
                      ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckResponse,
                      ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheckResponse,
                      ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsResponse,
                      ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckResponse,
                      ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckResponse,
                      ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCResponse,
                      ComAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckResponse,
                      ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCResponse,
                      ComAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckResponse,
                      ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheResponse,
                      ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckResponse,
                      ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckResponse,
                      ComAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckResponse,
                      ComAdobeGraniteRepositoryImplCommitStatsConfigResponse,
                      ComAdobeGraniteRepositoryServiceUserConfigurationResponse,
                      ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImResponse,
                      ComAdobeGraniteResourcestatusImplCompositeStatusTypeResponse,
                      ComAdobeGraniteResourcestatusImplStatusResourceProviderImplResponse,
                      ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterResponse,
                      ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplResponse,
                      ComAdobeGraniteRestImplServletDefaultGETServletResponse,
                      ComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSResponse,
                      ComAdobeGraniteSecurityUserUserPropertiesServiceResponse,
                      ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplResponse,
                      ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplResponse,
                      ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryResponse,
                      ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceResponse,
                      ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskResponse,
                      ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorResponse,
                      ComAdobeGraniteThreaddumpThreadDumpCollectorResponse,
                      ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslResponse,
                      ComAdobeGraniteTranslationCoreImplTranslationManagerImplResponse,
                      ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplResponse,
                      ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureResponse,
                      ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceResponse,
                      ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerResponse,
                      ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerResponse,
                      ComAdobeGraniteWorkflowCoreJobJobHandlerResponse,
                      ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumResponse,
                      ComAdobeGraniteWorkflowCorePayloadMapCacheResponse,
                      ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerResponse,
                      ComAdobeGraniteWorkflowCoreWorkflowConfigResponse,
                      ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryResponse,
                      ComAdobeGraniteWorkflowPurgeSchedulerResponse,
                      ComAdobeOctopusNcommBootstrapResponse,
                      ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSResponse,
                      ComAdobeXmpWorkerFilesNcommXMPFilesNCommResponse,
                      ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceResponse,
                      ComDayCommonsHttpclientResponse,
                      ComDayCqAnalyticsImplStorePropertiesChangeListenerResponse,
                      ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteResponse,
                      ComDayCqAnalyticsSitecatalystImplImporterReportImporterResponse,
                      ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryResponse,
                      ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplResponse,
                      ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterResponse,
                      ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerResponse,
                      ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerResponse,
                      ComDayCqAnalyticsTestandtargetImplSegmentImporterResponse,
                      ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplResponse,
                      ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletResponse,
                      ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplResponse,
                      ComDayCqAuthImplCugCugSupportImplResponse,
                      ComDayCqAuthImplLoginSelectorHandlerResponse,
                      ComDayCqCommonsImplExternalizerImplResponse,
                      ComDayCqCommonsServletsRootMappingServletResponse,
                      ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeResponse,
                      ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListResponse,
                      ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistResponse,
                      ComDayCqContentsyncImplContentSyncManagerImplResponse,
                      ComDayCqDamCommonsHandlerStandardImageHandlerResponse,
                      ComDayCqDamCommonsMetadataXmpFilterBlackWhiteResponse,
                      ComDayCqDamCommonsUtilImplAssetCacheImplResponse,
                      ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigResponse,
                      ComDayCqDamCoreImplAssetMoveListenerResponse,
                      ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationResponse,
                      ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletResponse,
                      ComDayCqDamCoreImplCacheCQBufferedImageCacheResponse,
                      ComDayCqDamCoreImplDamChangeEventListenerResponse,
                      ComDayCqDamCoreImplDamEventPurgeServiceResponse,
                      ComDayCqDamCoreImplDamEventRecorderImplResponse,
                      ComDayCqDamCoreImplEventDamEventAuditListenerResponse,
                      ComDayCqDamCoreImplExpiryNotificationJobImplResponse,
                      ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatResponse,
                      ComDayCqDamCoreImplGfxCommonsGfxRendererResponse,
                      ComDayCqDamCoreImplHandlerEPSFormatHandlerResponse,
                      ComDayCqDamCoreImplHandlerIndesignFormatHandlerResponse,
                      ComDayCqDamCoreImplHandlerJpegHandlerResponse,
                      ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerResponse,
                      ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorResponse,
                      ComDayCqDamCoreImplJmxAssetMigrationMBeanImplResponse,
                      ComDayCqDamCoreImplJmxAssetUpdateMonitorImplResponse,
                      ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigResponse,
                      ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigResponse,
                      ComDayCqDamCoreImplLightboxLightboxServletResponse,
                      ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerResponse,
                      ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperResponse,
                      ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplResponse,
                      ComDayCqDamCoreImplMissingMetadataNotificationJobResponse,
                      ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrResponse,
                      ComDayCqDamCoreImplProcessTextExtractionProcessResponse,
                      ComDayCqDamCoreImplRenditionMakerImplResponse,
                      ComDayCqDamCoreImplReportsReportExportServiceResponse,
                      ComDayCqDamCoreImplReportsReportPurgeServiceResponse,
                      ComDayCqDamCoreImplServletAssetDownloadServletResponse,
                      ComDayCqDamCoreImplServletAssetStatusServletResponse,
                      ComDayCqDamCoreImplServletAssetXMPSearchServletResponse,
                      ComDayCqDamCoreImplServletBatchMetadataServletResponse,
                      ComDayCqDamCoreImplServletBinaryProviderServletResponse,
                      ComDayCqDamCoreImplServletCollectionServletResponse,
                      ComDayCqDamCoreImplServletCollectionsServletResponse,
                      ComDayCqDamCoreImplServletCompanionServletResponse,
                      ComDayCqDamCoreImplServletCreateAssetServletResponse,
                      ComDayCqDamCoreImplServletDamContentDispositionFilterResponse,
                      ComDayCqDamCoreImplServletGuidLookupFilterResponse,
                      ComDayCqDamCoreImplServletHealthCheckServletResponse,
                      ComDayCqDamCoreImplServletMetadataGetServletResponse,
                      ComDayCqDamCoreImplServletMultipleLicenseAcceptServletResponse,
                      ComDayCqDamCoreImplServletResourceCollectionServletResponse,
                      ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplResponse,
                      ComDayCqDamCoreImplUnzipUnzipConfigResponse,
                      ComDayCqDamCoreProcessExifToolExtractMetadataProcessResponse,
                      ComDayCqDamCoreProcessExtractMetadataProcessResponse,
                      ComDayCqDamCoreProcessMetadataProcessorProcessResponse,
                      ComDayCqDamHandlerFfmpegLocatorImplResponse,
                      ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplResponse,
                      ComDayCqDamHandlerStandardPdfPdfHandlerResponse,
                      ComDayCqDamHandlerStandardPsPostScriptHandlerResponse,
                      ComDayCqDamHandlerStandardPsdPsdHandlerResponse,
                      ComDayCqDamIdsImplIDSJobProcessorResponse,
                      ComDayCqDamIdsImplIDSPoolManagerImplResponse,
                      ComDayCqDamInddImplHandlerIndesignXMPHandlerResponse,
                      ComDayCqDamInddImplServletSnippetCreationServletResponse,
                      ComDayCqDamInddProcessINDDMediaExtractProcessResponse,
                      ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplResponse,
                      ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobResponse,
                      ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProResponse,
                      ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenResponse,
                      ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerResponse,
                      ComDayCqDamS7damCommonPostServletsSetCreateHandlerResponse,
                      ComDayCqDamS7damCommonPostServletsSetModifyHandlerResponse,
                      ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessResponse,
                      ComDayCqDamS7damCommonS7damDamChangeEventListenerResponse,
                      ComDayCqDamS7damCommonServletsS7damProductInfoServletResponse,
                      ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplResponse,
                      ComDayCqDamScene7ImplScene7APIClientImplResponse,
                      ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplResponse,
                      ComDayCqDamScene7ImplScene7ConfigurationEventListenerResponse,
                      ComDayCqDamScene7ImplScene7DamChangeEventListenerResponse,
                      ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplResponse,
                      ComDayCqDamScene7ImplScene7UploadServiceImplResponse,
                      ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerResponse,
                      ComDayCqDamStockIntegrationImplConfigurationStockConfigurationResponse,
                      ComDayCqDamVideoImplServletVideoTestServletResponse,
                      ComDayCqExtwidgetServletsImageSpriteServletResponse,
                      ComDayCqImageInternalFontFontHelperResponse,
                      ComDayCqJcrclustersupportClusterStartLevelControllerResponse,
                      ComDayCqMailerDefaultMailServiceResponse,
                      ComDayCqMailerImplCqMailingServiceResponse,
                      ComDayCqMailerImplEmailCqEmailTemplateFactoryResponse,
                      ComDayCqMailerImplEmailCqRetrieverTemplateFactoryResponse,
                      ComDayCqMcmCampaignImplIntegrationConfigImplResponse,
                      ComDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryResponse,
                      ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplResponse,
                      ComDayCqMcmImplMCMConfigurationResponse,
                      ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenResponse,
                      ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougResponse,
                      ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponentResponse,
                      ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaResponse,
                      ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHResponse,
                      ComDayCqNotificationImplNotificationServiceImplResponse,
                      ComDayCqPersonalizationImplServletsTargetingConfigurationServletResponse,
                      ComDayCqPollingImporterImplManagedPollConfigImplResponse,
                      ComDayCqPollingImporterImplManagedPollingImporterImplResponse,
                      ComDayCqPollingImporterImplPollingImporterImplResponse,
                      ComDayCqReplicationAuditReplicationEventListenerResponse,
                      ComDayCqReplicationContentStaticContentBuilderResponse,
                      ComDayCqReplicationImplAgentManagerImplResponse,
                      ComDayCqReplicationImplContentDurboBinaryLessContentBuilderResponse,
                      ComDayCqReplicationImplContentDurboDurboImportConfigurationProvResponse,
                      ComDayCqReplicationImplReplicationContentFactoryProviderImplResponse,
                      ComDayCqReplicationImplReplicationReceiverImplResponse,
                      ComDayCqReplicationImplReplicatorImplResponse,
                      ComDayCqReplicationImplReverseReplicatorResponse,
                      ComDayCqReplicationImplTransportBinaryLessTransportHandlerResponse,
                      ComDayCqReplicationImplTransportHttpResponse,
                      ComDayCqReportingImplCacheCacheImplResponse,
                      ComDayCqReportingImplConfigServiceImplResponse,
                      ComDayCqReportingImplRLogAnalyzerResponse,
                      ComDayCqRewriterLinkcheckerImplLinkCheckerImplResponse,
                      ComDayCqRewriterLinkcheckerImplLinkCheckerTaskResponse,
                      ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryResponse,
                      ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplResponse,
                      ComDayCqRewriterProcessorImplHtmlParserFactoryResponse,
                      ComDayCqSearchImplBuilderQueryBuilderImplResponse,
                      ComDayCqSearchSuggestImplSuggestionIndexManagerImplResponse,
                      ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerResponse,
                      ComDayCqSearchpromoteImplSearchPromoteServiceImplResponse,
                      ComDayCqSecurityACLSetupResponse,
                      ComDayCqStatisticsImplStatisticsServiceImplResponse,
                      ComDayCqTaggingImplJcrTagManagerFactoryImplResponse,
                      ComDayCqTaggingImplSearchTagPredicateEvaluatorResponse,
                      ComDayCqTaggingImplTagGarbageCollectorResponse,
                      ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerResponse,
                      ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorResponse,
                      ComDayCqWcmCoreImplAuthoringUIModeServiceImplResponse,
                      ComDayCqWcmCoreImplCommandsWCMCommandServletResponse,
                      ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplResponse,
                      ComDayCqWcmCoreImplEventPageEventAuditListenerResponse,
                      ComDayCqWcmCoreImplEventPagePostProcessorResponse,
                      ComDayCqWcmCoreImplEventRepositoryChangeEventListenerResponse,
                      ComDayCqWcmCoreImplEventTemplatePostProcessorResponse,
                      ComDayCqWcmCoreImplLanguageManagerImplResponse,
                      ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplResponse,
                      ComDayCqWcmCoreImplPagePageInfoAggregatorImplResponse,
                      ComDayCqWcmCoreImplPagePageManagerFactoryImplResponse,
                      ComDayCqWcmCoreImplReferencesContentContentReferenceConfigResponse,
                      ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerResponse,
                      ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieResponse,
                      ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerResponse,
                      ComDayCqWcmCoreImplServletsFindReplaceServletResponse,
                      ComDayCqWcmCoreImplServletsReferenceSearchServletResponse,
                      ComDayCqWcmCoreImplServletsThumbnailServletResponse,
                      ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorResponse,
                      ComDayCqWcmCoreImplVariantsPageVariantsProviderImplResponse,
                      ComDayCqWcmCoreImplVersionManagerImplResponse,
                      ComDayCqWcmCoreImplVersionPurgeTaskResponse,
                      ComDayCqWcmCoreImplWCMDebugFilterResponse,
                      ComDayCqWcmCoreImplWCMDeveloperModeFilterResponse,
                      ComDayCqWcmCoreImplWarpTimeWarpFilterResponse,
                      ComDayCqWcmCoreMvtMVTStatisticsImplResponse,
                      ComDayCqWcmCoreStatsPageViewStatisticsImplResponse,
                      ComDayCqWcmCoreWCMRequestFilterResponse,
                      ComDayCqWcmDesignimporterDesignPackageImporterResponse,
                      ComDayCqWcmDesignimporterImplCanvasBuilderImplResponse,
                      ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerResponse,
                      ComDayCqWcmDesignimporterImplEntryPreprocessorImplResponse,
                      ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplResponse,
                      ComDayCqWcmDesignimporterParserTaghandlersFactoryCanvasComponeResponse,
                      ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultComponResponse,
                      ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultTagHanResponse,
                      ComDayCqWcmDesignimporterParserTaghandlersFactoryHeadTagHandleResponse,
                      ComDayCqWcmDesignimporterParserTaghandlersFactoryIFrameTagHandResponse,
                      ComDayCqWcmDesignimporterParserTaghandlersFactoryImageComponenResponse,
                      ComDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandlerResponse,
                      ComDayCqWcmDesignimporterParserTaghandlersFactoryInlineScriptTResponse,
                      ComDayCqWcmDesignimporterParserTaghandlersFactoryLinkTagHandleResponse,
                      ComDayCqWcmDesignimporterParserTaghandlersFactoryMetaTagHandleResponse,
                      ComDayCqWcmDesignimporterParserTaghandlersFactoryNonScriptTagHResponse,
                      ComDayCqWcmDesignimporterParserTaghandlersFactoryParsysComponeResponse,
                      ComDayCqWcmDesignimporterParserTaghandlersFactoryScriptTagHandResponse,
                      ComDayCqWcmDesignimporterParserTaghandlersFactoryStyleTagHandlResponse,
                      ComDayCqWcmDesignimporterParserTaghandlersFactoryTextComponentResponse,
                      ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleComponenResponse,
                      ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleTagHandlResponse,
                      ComDayCqWcmFoundationFormsImplFormChooserServletResponse,
                      ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorResponse,
                      ComDayCqWcmFoundationFormsImplFormsHandlingServletResponse,
                      ComDayCqWcmFoundationFormsImplMailServletResponse,
                      ComDayCqWcmFoundationImplAdaptiveImageComponentServletResponse,
                      ComDayCqWcmFoundationImplHTTPAuthHandlerResponse,
                      ComDayCqWcmFoundationImplPageImpressionsTrackerResponse,
                      ComDayCqWcmFoundationImplPageRedirectServletResponse,
                      ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistResponse,
                      ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplResponse,
                      ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryResponse,
                      ComDayCqWcmMobileCoreImplRedirectRedirectFilterResponse,
                      ComDayCqWcmMsmImplActionsContentCopyActionFactoryResponse,
                      ComDayCqWcmMsmImplActionsContentDeleteActionFactoryResponse,
                      ComDayCqWcmMsmImplActionsContentUpdateActionFactoryResponse,
                      ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryResponse,
                      ComDayCqWcmMsmImplActionsPageMoveActionFactoryResponse,
                      ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryResponse,
                      ComDayCqWcmMsmImplActionsVersionCopyActionFactoryResponse,
                      ComDayCqWcmMsmImplLiveRelationshipManagerImplResponse,
                      ComDayCqWcmMsmImplRolloutManagerImplResponse,
                      ComDayCqWcmMsmImplServletsAuditLogServletResponse,
                      ComDayCqWcmNotificationEmailImplEmailChannelResponse,
                      ComDayCqWcmNotificationImplNotificationManagerImplResponse,
                      ComDayCqWcmScriptingImplBVPManagerResponse,
                      ComDayCqWcmUndoUndoConfigResponse,
                      ComDayCqWcmWebservicesupportImplReplicationEventListenerResponse,
                      ComDayCqWcmWorkflowImplWcmWorkflowServiceImplResponse,
                      ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderResponse,
                      ComDayCqWidgetImplHtmlLibraryManagerImplResponse,
                      ComDayCqWidgetImplWidgetExtensionProviderImplResponse,
                      ComDayCqWorkflowImplEmailEMailNotificationServiceResponse,
                      ComDayCqWorkflowImplEmailTaskEMailNotificationServiceResponse,
                      ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerResponse,
                      ComDayCrxSecurityTokenImplTokenCleanupTaskResponse,
                      GuideLocalizationServiceResponse,
                      MessagingUserComponentFactoryResponse,
                      OrgApacheAriesJmxFrameworkStateConfigResponse,
                      OrgApacheFelixEventadminImplEventAdminResponse,
                      OrgApacheFelixHttpResponse,
                      OrgApacheFelixHttpSslfilterSslFilterResponse,
                      OrgApacheFelixJaasConfigurationFactoryResponse,
                      OrgApacheFelixJaasConfigurationSpiResponse,
                      OrgApacheFelixScrScrServiceResponse,
                      OrgApacheFelixSystemreadyImplComponentsCheckResponse,
                      OrgApacheFelixSystemreadyImplFrameworkStartCheckResponse,
                      OrgApacheFelixSystemreadyImplServicesCheckResponse,
                      OrgApacheFelixSystemreadyImplServletSystemAliveServletResponse,
                      OrgApacheFelixSystemreadyImplServletSystemReadyServletResponse,
                      OrgApacheFelixSystemreadySystemReadyMonitorResponse,
                      OrgApacheFelixWebconsoleInternalServletOsgiManagerResponse,
                      OrgApacheFelixWebconsolePluginsEventInternalPluginServletResponse,
                      OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoResponse,
                      OrgApacheHttpProxyconfiguratorResponse,
                      OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderResponse,
                      OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreResponse,
                      OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceResponse,
                      OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreResponse,
                      OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacResponse,
                      OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceResponse,
                      OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServResponse,
                      OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoResponse,
                      OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersResponse,
                      OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationResponse,
                      OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfResponse,
                      OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidResponse,
                      OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeResponse,
                      OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryResponse,
                      OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderResponse,
                      OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceResponse,
                      OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigResponse,
                      OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiResponse,
                      OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraResponse,
                      OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurResponse,
                      OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiResponse,
                      OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameResponse,
                      OrgApacheJackrabbitOakSecurityUserUserConfigurationImplResponse,
                      OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceResponse,
                      OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryResponse,
                      OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceResponse,
                      OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceResponse,
                      OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceResponse,
                      OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeResponse,
                      OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExResponse,
                      OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrResponse,
                      OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiResponse,
                      OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluResponse,
                      OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableResponse,
                      OrgApacheJackrabbitVaultPackagingImplPackagingImplResponse,
                      OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryResponse,
                      OrgApacheSlingAuthCoreImplLogoutServletResponse,
                      OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderResponse,
                      OrgApacheSlingCaconfigImplConfigurationResolverImplResponse,
                      OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraResponse,
                      OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraResponse,
                      OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviResponse,
                      OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveResponse,
                      OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiResponse,
                      OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourResponse,
                      OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyResponse,
                      OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserResponse,
                      OrgApacheSlingCommonsLogLogManagerResponse,
                      OrgApacheSlingCommonsLogLogManagerFactoryConfigResponse,
                      OrgApacheSlingCommonsLogLogManagerFactoryWriterResponse,
                      OrgApacheSlingCommonsMetricsInternalLogReporterResponse,
                      OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterResponse,
                      OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplResponse,
                      OrgApacheSlingCommonsSchedulerImplQuartzSchedulerResponse,
                      OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckResponse,
                      OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryResponse,
                      OrgApacheSlingDatasourceDataSourceFactoryResponse,
                      OrgApacheSlingDatasourceJNDIDataSourceFactoryResponse,
                      OrgApacheSlingDiscoveryOakConfigResponse,
                      OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckResponse,
                      OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoResponse,
                      OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAResponse,
                      OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryResponse,
                      OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoResponse,
                      OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorResponse,
                      OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryResponse,
                      OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckResponse,
                      OrgApacheSlingDistributionPackagingImplExporterAgentDistributioResponse,
                      OrgApacheSlingDistributionPackagingImplExporterLocalDistributioResponse,
                      OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiResponse,
                      OrgApacheSlingDistributionPackagingImplImporterLocalDistributioResponse,
                      OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiResponse,
                      OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriResponse,
                      OrgApacheSlingDistributionResourcesImplDistributionConfigurationResponse,
                      OrgApacheSlingDistributionResourcesImplDistributionServiceResourResponse,
                      OrgApacheSlingDistributionSerializationImplDistributionPackageBuResponse,
                      OrgApacheSlingDistributionSerializationImplVltVaultDistributionResponse,
                      OrgApacheSlingDistributionTransportImplUserCredentialsDistributiResponse,
                      OrgApacheSlingDistributionTriggerImplDistributionEventDistributeResponse,
                      OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerResponse,
                      OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiResponse,
                      OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigResponse,
                      OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrResponse,
                      OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeResponse,
                      OrgApacheSlingEngineImplAuthSlingAuthenticatorResponse,
                      OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterResponse,
                      OrgApacheSlingEngineImplLogRequestLoggerResponse,
                      OrgApacheSlingEngineImplLogRequestLoggerServiceResponse,
                      OrgApacheSlingEngineImplSlingMainServletResponse,
                      OrgApacheSlingEngineParametersResponse,
                      OrgApacheSlingEventImplEventingThreadPoolResponse,
                      OrgApacheSlingEventImplJobsDefaultJobManagerResponse,
                      OrgApacheSlingEventImplJobsJcrPersistenceHandlerResponse,
                      OrgApacheSlingEventImplJobsJobConsumerManagerResponse,
                      OrgApacheSlingEventJobsQueueConfigurationResponse,
                      OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWResponse,
                      OrgApacheSlingFeatureflagsFeatureResponse,
                      OrgApacheSlingFeatureflagsImplConfiguredFeatureResponse,
                      OrgApacheSlingHapiImplHApiUtilImplResponse,
                      OrgApacheSlingHcCoreImplCompositeHealthCheckResponse,
                      OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplResponse,
                      OrgApacheSlingHcCoreImplJmxAttributeHealthCheckResponse,
                      OrgApacheSlingHcCoreImplScriptableHealthCheckResponse,
                      OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletResponse,
                      OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerResponse,
                      OrgApacheSlingI18nImplI18NFilterResponse,
                      OrgApacheSlingI18nImplJcrResourceBundleProviderResponse,
                      OrgApacheSlingInstallerProviderJcrImplJcrInstallerResponse,
                      OrgApacheSlingJcrBaseInternalLoginAdminWhitelistResponse,
                      OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentResponse,
                      OrgApacheSlingJcrDavexImplServletsSlingDavExServletResponse,
                      OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportResponse,
                      OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportResponse,
                      OrgApacheSlingJcrRepoinitImplRepositoryInitializerResponse,
                      OrgApacheSlingJcrRepoinitRepositoryInitializerResponse,
                      OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplResponse,
                      OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorResponse,
                      OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryResponse,
                      OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceResponse,
                      OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicResponse,
                      OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletResponse,
                      OrgApacheSlingJmxProviderImplJMXResourceProviderResponse,
                      OrgApacheSlingModelsImplModelAdapterFactoryResponse,
                      OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderResponse,
                      OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoResponse,
                      OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryResponse,
                      OrgApacheSlingResourcemergerPickerOverridingResponse,
                      OrgApacheSlingScriptingCoreImplScriptCacheImplResponse,
                      OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderResponse,
                      OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryResponse,
                      OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaResponse,
                      OrgApacheSlingScriptingJspJspScriptEngineFactoryResponse,
                      OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvResponse,
                      OrgApacheSlingSecurityImplContentDispositionFilterResponse,
                      OrgApacheSlingSecurityImplReferrerFilterResponse,
                      OrgApacheSlingServiceusermappingImplServiceUserMapperImplResponse,
                      OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedResponse,
                      OrgApacheSlingServletsGetDefaultGetServletResponse,
                      OrgApacheSlingServletsGetImplVersionVersionInfoServletResponse,
                      OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskResponse,
                      OrgApacheSlingServletsPostImplSlingPostServletResponse,
                      OrgApacheSlingServletsResolverSlingServletResolverResponse,
                      OrgApacheSlingSettingsImplSlingSettingsServiceImplResponse,
                      OrgApacheSlingStartupfilterImplStartupFilterImplResponse,
                      OrgApacheSlingTenantInternalTenantProviderImplResponse,
                      OrgApacheSlingTracerInternalLogTracerResponse,
                      OrgApacheSlingXssImplXSSFilterImplResponse
                     };
use clap::{App, Arg};

fn main() {
    let matches = App::new("client")
        .arg(Arg::with_name("operation")
            .help("Sets the operation to run")
            .possible_values(&[
    "AdaptiveFormAndInteractiveCommunicationWebChannelConfiguration",
    "AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigur",
    "AnalyticsComponentQueryCacheService",
    "ApacheSlingHealthCheckResultHTMLSerializer",
    "ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfiguration",
    "ComAdobeAemTransactionCoreImplTransactionRecorder",
    "ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHC",
    "ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHC",
    "ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImpl",
    "ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImpl",
    "ComAdobeCqAccountApiAccountManagementService",
    "ComAdobeCqAccountImplAccountManagementServlet",
    "ComAdobeCqAddressImplLocationLocationListServlet",
    "ComAdobeCqAuditPurgeDam",
    "ComAdobeCqAuditPurgePages",
    "ComAdobeCqAuditPurgeReplication",
    "ComAdobeCqCdnRewriterImplAWSCloudFrontRewriter",
    "ComAdobeCqCdnRewriterImplCDNConfigServiceImpl",
    "ComAdobeCqCdnRewriterImplCDNRewriter",
    "ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandle",
    "ComAdobeCqCommerceImplAssetDynamicImageHandler",
    "ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImpl",
    "ComAdobeCqCommerceImplAssetStaticImageHandler",
    "ComAdobeCqCommerceImplAssetVideoHandler",
    "ComAdobeCqCommerceImplPromotionPromotionManagerImpl",
    "ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImpl",
    "ComAdobeCqCommercePimImplPageEventListener",
    "ComAdobeCqCommercePimImplProductfeedProductFeedServiceImpl",
    "ComAdobeCqContentinsightImplReportingServicesSettingsProvider",
    "ComAdobeCqContentinsightImplServletsBrightEdgeProxyServlet",
    "ComAdobeCqContentinsightImplServletsReportingServicesProxyServle",
    "ComAdobeCqDamCfmImplComponentComponentConfigImpl",
    "ComAdobeCqDamCfmImplConfFeatureConfigImpl",
    "ComAdobeCqDamCfmImplContentRewriterAssetProcessor",
    "ComAdobeCqDamCfmImplContentRewriterParRangeFilter",
    "ComAdobeCqDamCfmImplContentRewriterPayloadFilter",
    "ComAdobeCqDamDmProcessImagePTiffManagerImpl",
    "ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorker",
    "ComAdobeCqDamMacSyncHelperImplMACSyncClientImpl",
    "ComAdobeCqDamMacSyncImplDAMSyncServiceImpl",
    "ComAdobeCqDamProcessorNuiImplNuiAssetProcessor",
    "ComAdobeCqDamS7imagingImplIsImageServerComponent",
    "ComAdobeCqDamS7imagingImplPsPlatformServerServlet",
    "ComAdobeCqDamWebdavImplIoAssetIOHandler",
    "ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJob",
    "ComAdobeCqDamWebdavImplIoSpecialFilesHandler",
    "ComAdobeCqDeserfwImplDeserializationFirewallImpl",
    "ComAdobeCqDtmImplServiceDTMWebServiceImpl",
    "ComAdobeCqDtmImplServletsDTMDeployHookServlet",
    "ComAdobeCqDtmReactorImplServiceWebServiceImpl",
    "ComAdobeCqExperiencelogImplExperienceLogConfigServlet",
    "ComAdobeCqHcContentPackagesHealthCheck",
    "ComAdobeCqHistoryImplHistoryRequestFilter",
    "ComAdobeCqHistoryImplHistoryServiceImpl",
    "ComAdobeCqInboxImplTypeproviderItemTypeProvider",
    "ComAdobeCqProjectsImplServletProjectImageServlet",
    "ComAdobeCqProjectsPurgeScheduler",
    "ComAdobeCqScheduledExporterImplScheduledExporterImpl",
    "ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImpl",
    "ComAdobeCqScreensDeviceImplDeviceService",
    "ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImpl",
    "ComAdobeCqScreensImplHandlerChannelsUpdateHandler",
    "ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJob",
    "ComAdobeCqScreensImplRemoteImplDistributedHttpClientImpl",
    "ComAdobeCqScreensImplScreensChannelPostProcessor",
    "ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImpl",
    "ComAdobeCqScreensMqActivemqImplArtemisJMSProvider",
    "ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImpl",
    "ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImpl",
    "ComAdobeCqScreensSegmentationImplSegmentationFeatureFlag",
    "ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthCh",
    "ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheck",
    "ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheck",
    "ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheck",
    "ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheck",
    "ComAdobeCqSocialAccountverificationImplAccountManagementConfigIm",
    "ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponen",
    "ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCo",
    "ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandler",
    "ComAdobeCqSocialActivitystreamsListenerImplModerationEventExten",
    "ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivityS",
    "ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStre",
    "ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsI",
    "ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmen",
    "ComAdobeCqSocialCalendarServletsTimeZoneServlet",
    "ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEvent",
    "ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSe",
    "ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperati",
    "ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialC",
    "ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPos",
    "ComAdobeCqSocialCommonsCorsCORSAuthenticationFilter",
    "ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProvider",
    "ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImpl",
    "ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListener",
    "ComAdobeCqSocialCommonsEmailreplyImplCustomEmailClientProvider",
    "ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImp",
    "ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImp",
    "ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporter",
    "ComAdobeCqSocialCommonsEmailreplyImplGmailEmailClientProvider",
    "ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProvider",
    "ComAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProvider",
    "ComAdobeCqSocialCommonsEmailreplyImplOutLookEmailClientProvider",
    "ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProvider",
    "ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProvider",
    "ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUpload",
    "ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImpl",
    "ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimit",
    "ComAdobeCqSocialConnectOauthImplFacebookProviderImpl",
    "ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandle",
    "ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapper",
    "ComAdobeCqSocialConnectOauthImplTwitterProviderImpl",
    "ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmen",
    "ComAdobeCqSocialDatastoreAsImplASResourceProviderFactory",
    "ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactory",
    "ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactor",
    "ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorF",
    "ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFacto",
    "ComAdobeCqSocialEnablementLearningpathEndpointsImplEnablementL",
    "ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResou",
    "ComAdobeCqSocialEnablementServicesImplAuthorMarkerImpl",
    "ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGe",
    "ComAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOpera",
    "ComAdobeCqSocialForumClientEndpointsImplForumOperationsService",
    "ComAdobeCqSocialForumDispatcherImplFlushOperations",
    "ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponen",
    "ComAdobeCqSocialGroupImplGroupServiceImpl",
    "ComAdobeCqSocialHandlebarsGuavaTemplateCacheImpl",
    "ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsS",
    "ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSer",
    "ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfile",
    "ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileO",
    "ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentF",
    "ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperation",
    "ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponen",
    "ComAdobeCqSocialModerationDashboardApiModerationDashboardSocial",
    "ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponen",
    "ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSoci",
    "ComAdobeCqSocialNotificationsImplMentionsRouter",
    "ComAdobeCqSocialNotificationsImplNotificationManagerImpl",
    "ComAdobeCqSocialNotificationsImplNotificationsRouter",
    "ComAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServic",
    "ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportI",
    "ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportM",
    "ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportS",
    "ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServi",
    "ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServlet",
    "ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServlet",
    "ComAdobeCqSocialScoringImplScoringEventListener",
    "ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImpl",
    "ComAdobeCqSocialSiteEndpointsImplSiteOperationService",
    "ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceIm",
    "ComAdobeCqSocialSiteImplSiteConfiguratorImpl",
    "ComAdobeCqSocialSrpImplSocialSolrConnector",
    "ComAdobeCqSocialSyncImplDiffChangesObserver",
    "ComAdobeCqSocialSyncImplGroupSyncListenerImpl",
    "ComAdobeCqSocialSyncImplPublisherSyncServiceImpl",
    "ComAdobeCqSocialSyncImplUserSyncListenerImpl",
    "ComAdobeCqSocialTranslationImplTranslationServiceConfigManager",
    "ComAdobeCqSocialTranslationImplUGCLanguageDetector",
    "ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImpl",
    "ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImpl",
    "ComAdobeCqSocialUgcbaseImplPublisherConfigurationImpl",
    "ComAdobeCqSocialUgcbaseImplSocialUtilsImpl",
    "ComAdobeCqSocialUgcbaseModerationImplAutoModerationImpl",
    "ComAdobeCqSocialUgcbaseModerationImplSentimentProcess",
    "ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackli",
    "ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImpl",
    "ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServlet",
    "ComAdobeCqSocialUserImplTransportHttpToPublisher",
    "ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFact",
    "ComAdobeCqUpgradesCleanupImplUpgradeContentCleanup",
    "ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanup",
    "ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderService",
    "ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTask",
    "ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderService",
    "ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderService",
    "ComAdobeCqWcmLaunchesImplLaunchesEventHandler",
    "ComAdobeCqWcmMobileQrcodeServletQRCodeImageGenerator",
    "ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImpl",
    "ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImpl",
    "ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigService",
    "ComAdobeFdFpConfigFormsPortalSchedulerService",
    "ComAdobeFormsCommonServiceImplDefaultDataProvider",
    "ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImp",
    "ComAdobeFormsCommonServletTempCleanUpTask",
    "ComAdobeGraniteAcpPlatformPlatformServlet",
    "ComAdobeGraniteActivitystreamsImplActivityManagerImpl",
    "ComAdobeGraniteAnalyzerBaseSystemStatusServlet",
    "ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServlet",
    "ComAdobeGraniteApicontrollerFilterResolverHookFactory",
    "ComAdobeGraniteAuthCertImplClientCertAuthHandler",
    "ComAdobeGraniteAuthIms",
    "ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtension",
    "ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImpl",
    "ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidator",
    "ComAdobeGraniteAuthImsImplIMSProviderImpl",
    "ComAdobeGraniteAuthImsImplImsConfigProviderImpl",
    "ComAdobeGraniteAuthOauthAccesstokenProvider",
    "ComAdobeGraniteAuthOauthImplBearerAuthenticationHandler",
    "ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImpl",
    "ComAdobeGraniteAuthOauthImplFacebookProviderImpl",
    "ComAdobeGraniteAuthOauthImplGithubProviderImpl",
    "ComAdobeGraniteAuthOauthImplGraniteProvider",
    "ComAdobeGraniteAuthOauthImplHelperProviderConfigManager",
    "ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternal",
    "ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandler",
    "ComAdobeGraniteAuthOauthImplTwitterProviderImpl",
    "ComAdobeGraniteAuthOauthProvider",
    "ComAdobeGraniteAuthRequirementImplDefaultRequirementHandler",
    "ComAdobeGraniteAuthSamlSamlAuthenticationHandler",
    "ComAdobeGraniteAuthSsoImplSsoAuthenticationHandler",
    "ComAdobeGraniteBundlesHcImplCodeCacheHealthCheck",
    "ComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheck",
    "ComAdobeGraniteBundlesHcImplDavExBundleHealthCheck",
    "ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheck",
    "ComAdobeGraniteBundlesHcImplJobsHealthCheck",
    "ComAdobeGraniteBundlesHcImplSlingGetServletHealthCheck",
    "ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheck",
    "ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheck",
    "ComAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheck",
    "ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheck",
    "ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFac",
    "ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImpl",
    "ComAdobeGraniteCompatrouterImplRoutingConfig",
    "ComAdobeGraniteCompatrouterImplSwitchMappingConfig",
    "ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolving",
    "ComAdobeGraniteContexthubImplContextHubImpl",
    "ComAdobeGraniteCorsImplCORSPolicyImpl",
    "ComAdobeGraniteCsrfImplCSRFFilter",
    "ComAdobeGraniteCsrfImplCSRFServlet",
    "ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSe",
    "ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserver",
    "ComAdobeGraniteDistributionCoreImplDiffDiffEventListener",
    "ComAdobeGraniteDistributionCoreImplDistributionToReplicationEven",
    "ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicat",
    "ComAdobeGraniteDistributionCoreImplReplicationDistributionTrans",
    "ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribu",
    "ComAdobeGraniteFragsImplCheckHttpHeaderFlag",
    "ComAdobeGraniteFragsImplRandomFeature",
    "ComAdobeGraniteHttpcacheFileFileCacheStore",
    "ComAdobeGraniteHttpcacheImplOuterCacheFilter",
    "ComAdobeGraniteI18nImplBundlePseudoTranslations",
    "ComAdobeGraniteI18nImplPreferencesLocaleResolverService",
    "ComAdobeGraniteInfocollectorInfoCollector",
    "ComAdobeGraniteJettySslInternalGraniteSslConnectorFactory",
    "ComAdobeGraniteLicenseImplLicenseCheckFilter",
    "ComAdobeGraniteLoggingImplLogAnalyserImpl",
    "ComAdobeGraniteLoggingImplLogErrorHealthCheck",
    "ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTask",
    "ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTask",
    "ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTask",
    "ComAdobeGraniteMonitoringImplScriptConfigImpl",
    "ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHan",
    "ComAdobeGraniteOauthServerImplAccessTokenCleanupTask",
    "ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServlet",
    "ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServlet",
    "ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServlet",
    "ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServlet",
    "ComAdobeGraniteOffloadingImplOffloadingConfigurator",
    "ComAdobeGraniteOffloadingImplOffloadingJobCloner",
    "ComAdobeGraniteOffloadingImplOffloadingJobOffloader",
    "ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManager",
    "ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspo",
    "ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImpl",
    "ComAdobeGraniteOptoutImplOptOutServiceImpl",
    "ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheck",
    "ComAdobeGraniteQueriesImplHcLargeIndexHealthCheck",
    "ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheck",
    "ComAdobeGraniteQueriesImplHcQueryHealthCheckMetrics",
    "ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheck",
    "ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheck",
    "ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthC",
    "ComAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheck",
    "ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthC",
    "ComAdobeGraniteRepositoryHcImplContinuousRGCHealthCheck",
    "ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthChe",
    "ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheck",
    "ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheck",
    "ComAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheck",
    "ComAdobeGraniteRepositoryImplCommitStatsConfig",
    "ComAdobeGraniteRepositoryServiceUserConfiguration",
    "ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckIm",
    "ComAdobeGraniteResourcestatusImplCompositeStatusType",
    "ComAdobeGraniteResourcestatusImplStatusResourceProviderImpl",
    "ComAdobeGraniteRestAssetsImplAssetContentDispositionFilter",
    "ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImpl",
    "ComAdobeGraniteRestImplServletDefaultGETServlet",
    "ComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationS",
    "ComAdobeGraniteSecurityUserUserPropertiesService",
    "ComAdobeGraniteSocialgraphImplSocialGraphFactoryImpl",
    "ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImpl",
    "ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactory",
    "ComAdobeGraniteTaskmanagementImplJcrTaskArchiveService",
    "ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTask",
    "ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactor",
    "ComAdobeGraniteThreaddumpThreadDumpCollector",
    "ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTransl",
    "ComAdobeGraniteTranslationCoreImplTranslationManagerImpl",
    "ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImpl",
    "ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeature",
    "ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventService",
    "ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManager",
    "ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandler",
    "ComAdobeGraniteWorkflowCoreJobJobHandler",
    "ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsum",
    "ComAdobeGraniteWorkflowCorePayloadMapCache",
    "ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListener",
    "ComAdobeGraniteWorkflowCoreWorkflowConfig",
    "ComAdobeGraniteWorkflowCoreWorkflowSessionFactory",
    "ComAdobeGraniteWorkflowPurgeScheduler",
    "ComAdobeOctopusNcommBootstrap",
    "ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullS",
    "ComAdobeXmpWorkerFilesNcommXMPFilesNComm",
    "ComDayCommonsDatasourceJdbcpoolJdbcPoolService",
    "ComDayCommonsHttpclient",
    "ComDayCqAnalyticsImplStorePropertiesChangeListener",
    "ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporte",
    "ComDayCqAnalyticsSitecatalystImplImporterReportImporter",
    "ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactory",
    "ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImpl",
    "ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdater",
    "ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListener",
    "ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListener",
    "ComDayCqAnalyticsTestandtargetImplSegmentImporter",
    "ComDayCqAnalyticsTestandtargetImplServiceWebServiceImpl",
    "ComDayCqAnalyticsTestandtargetImplServletsAdminServerServlet",
    "ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImpl",
    "ComDayCqAuthImplCugCugSupportImpl",
    "ComDayCqAuthImplLoginSelectorHandler",
    "ComDayCqCommonsImplExternalizerImpl",
    "ComDayCqCommonsServletsRootMappingServlet",
    "ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionChecke",
    "ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreList",
    "ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelist",
    "ComDayCqContentsyncImplContentSyncManagerImpl",
    "ComDayCqDamCommonsHandlerStandardImageHandler",
    "ComDayCqDamCommonsMetadataXmpFilterBlackWhite",
    "ComDayCqDamCommonsUtilImplAssetCacheImpl",
    "ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfig",
    "ComDayCqDamCoreImplAssetMoveListener",
    "ComDayCqDamCoreImplAssethomeAssetHomePageConfiguration",
    "ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServlet",
    "ComDayCqDamCoreImplCacheCQBufferedImageCache",
    "ComDayCqDamCoreImplDamChangeEventListener",
    "ComDayCqDamCoreImplDamEventPurgeService",
    "ComDayCqDamCoreImplDamEventRecorderImpl",
    "ComDayCqDamCoreImplEventDamEventAuditListener",
    "ComDayCqDamCoreImplExpiryNotificationJobImpl",
    "ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeat",
    "ComDayCqDamCoreImplGfxCommonsGfxRenderer",
    "ComDayCqDamCoreImplHandlerEPSFormatHandler",
    "ComDayCqDamCoreImplHandlerIndesignFormatHandler",
    "ComDayCqDamCoreImplHandlerJpegHandler",
    "ComDayCqDamCoreImplHandlerXmpNCommXMPHandler",
    "ComDayCqDamCoreImplJmxAssetIndexUpdateMonitor",
    "ComDayCqDamCoreImplJmxAssetMigrationMBeanImpl",
    "ComDayCqDamCoreImplJmxAssetUpdateMonitorImpl",
    "ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfig",
    "ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfig",
    "ComDayCqDamCoreImplLightboxLightboxServlet",
    "ComDayCqDamCoreImplMetadataEditorSelectComponentHandler",
    "ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelper",
    "ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImpl",
    "ComDayCqDamCoreImplMissingMetadataNotificationJob",
    "ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPr",
    "ComDayCqDamCoreImplProcessTextExtractionProcess",
    "ComDayCqDamCoreImplRenditionMakerImpl",
    "ComDayCqDamCoreImplReportsReportExportService",
    "ComDayCqDamCoreImplReportsReportPurgeService",
    "ComDayCqDamCoreImplServletAssetDownloadServlet",
    "ComDayCqDamCoreImplServletAssetStatusServlet",
    "ComDayCqDamCoreImplServletAssetXMPSearchServlet",
    "ComDayCqDamCoreImplServletBatchMetadataServlet",
    "ComDayCqDamCoreImplServletBinaryProviderServlet",
    "ComDayCqDamCoreImplServletCollectionServlet",
    "ComDayCqDamCoreImplServletCollectionsServlet",
    "ComDayCqDamCoreImplServletCompanionServlet",
    "ComDayCqDamCoreImplServletCreateAssetServlet",
    "ComDayCqDamCoreImplServletDamContentDispositionFilter",
    "ComDayCqDamCoreImplServletGuidLookupFilter",
    "ComDayCqDamCoreImplServletHealthCheckServlet",
    "ComDayCqDamCoreImplServletMetadataGetServlet",
    "ComDayCqDamCoreImplServletMultipleLicenseAcceptServlet",
    "ComDayCqDamCoreImplServletResourceCollectionServlet",
    "ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImpl",
    "ComDayCqDamCoreImplUnzipUnzipConfig",
    "ComDayCqDamCoreProcessExifToolExtractMetadataProcess",
    "ComDayCqDamCoreProcessExtractMetadataProcess",
    "ComDayCqDamCoreProcessMetadataProcessorProcess",
    "ComDayCqDamHandlerFfmpegLocatorImpl",
    "ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImpl",
    "ComDayCqDamHandlerStandardPdfPdfHandler",
    "ComDayCqDamHandlerStandardPsPostScriptHandler",
    "ComDayCqDamHandlerStandardPsdPsdHandler",
    "ComDayCqDamIdsImplIDSJobProcessor",
    "ComDayCqDamIdsImplIDSPoolManagerImpl",
    "ComDayCqDamInddImplHandlerIndesignXMPHandler",
    "ComDayCqDamInddImplServletSnippetCreationServlet",
    "ComDayCqDamInddProcessINDDMediaExtractProcess",
    "ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImpl",
    "ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJob",
    "ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadPro",
    "ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEven",
    "ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunner",
    "ComDayCqDamS7damCommonPostServletsSetCreateHandler",
    "ComDayCqDamS7damCommonPostServletsSetModifyHandler",
    "ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcess",
    "ComDayCqDamS7damCommonS7damDamChangeEventListener",
    "ComDayCqDamS7damCommonServletsS7damProductInfoServlet",
    "ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImpl",
    "ComDayCqDamScene7ImplScene7APIClientImpl",
    "ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImpl",
    "ComDayCqDamScene7ImplScene7ConfigurationEventListener",
    "ComDayCqDamScene7ImplScene7DamChangeEventListener",
    "ComDayCqDamScene7ImplScene7FlashTemplatesServiceImpl",
    "ComDayCqDamScene7ImplScene7UploadServiceImpl",
    "ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSer",
    "ComDayCqDamStockIntegrationImplConfigurationStockConfiguration",
    "ComDayCqDamVideoImplServletVideoTestServlet",
    "ComDayCqExtwidgetServletsImageSpriteServlet",
    "ComDayCqImageInternalFontFontHelper",
    "ComDayCqJcrclustersupportClusterStartLevelController",
    "ComDayCqMailerDefaultMailService",
    "ComDayCqMailerImplCqMailingService",
    "ComDayCqMailerImplEmailCqEmailTemplateFactory",
    "ComDayCqMailerImplEmailCqRetrieverTemplateFactory",
    "ComDayCqMcmCampaignImplIntegrationConfigImpl",
    "ComDayCqMcmCampaignImporterPersonalizedTextHandlerFactory",
    "ComDayCqMcmCoreNewsletterNewsletterEmailServiceImpl",
    "ComDayCqMcmImplMCMConfiguration",
    "ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponen",
    "ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThroug",
    "ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponent",
    "ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHa",
    "ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagH",
    "ComDayCqNotificationImplNotificationServiceImpl",
    "ComDayCqPersonalizationImplServletsTargetingConfigurationServlet",
    "ComDayCqPollingImporterImplManagedPollConfigImpl",
    "ComDayCqPollingImporterImplManagedPollingImporterImpl",
    "ComDayCqPollingImporterImplPollingImporterImpl",
    "ComDayCqReplicationAuditReplicationEventListener",
    "ComDayCqReplicationContentStaticContentBuilder",
    "ComDayCqReplicationImplAgentManagerImpl",
    "ComDayCqReplicationImplContentDurboBinaryLessContentBuilder",
    "ComDayCqReplicationImplContentDurboDurboImportConfigurationProv",
    "ComDayCqReplicationImplReplicationContentFactoryProviderImpl",
    "ComDayCqReplicationImplReplicationReceiverImpl",
    "ComDayCqReplicationImplReplicatorImpl",
    "ComDayCqReplicationImplReverseReplicator",
    "ComDayCqReplicationImplTransportBinaryLessTransportHandler",
    "ComDayCqReplicationImplTransportHttp",
    "ComDayCqReportingImplCacheCacheImpl",
    "ComDayCqReportingImplConfigServiceImpl",
    "ComDayCqReportingImplRLogAnalyzer",
    "ComDayCqRewriterLinkcheckerImplLinkCheckerImpl",
    "ComDayCqRewriterLinkcheckerImplLinkCheckerTask",
    "ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactory",
    "ComDayCqRewriterLinkcheckerImplLinkInfoStorageImpl",
    "ComDayCqRewriterProcessorImplHtmlParserFactory",
    "ComDayCqSearchImplBuilderQueryBuilderImpl",
    "ComDayCqSearchSuggestImplSuggestionIndexManagerImpl",
    "ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandler",
    "ComDayCqSearchpromoteImplSearchPromoteServiceImpl",
    "ComDayCqSecurityACLSetup",
    "ComDayCqStatisticsImplStatisticsServiceImpl",
    "ComDayCqTaggingImplJcrTagManagerFactoryImpl",
    "ComDayCqTaggingImplSearchTagPredicateEvaluator",
    "ComDayCqTaggingImplTagGarbageCollector",
    "ComDayCqWcmContentsyncImplHandlerPagesUpdateHandler",
    "ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactor",
    "ComDayCqWcmCoreImplAuthoringUIModeServiceImpl",
    "ComDayCqWcmCoreImplCommandsWCMCommandServlet",
    "ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImpl",
    "ComDayCqWcmCoreImplEventPageEventAuditListener",
    "ComDayCqWcmCoreImplEventPagePostProcessor",
    "ComDayCqWcmCoreImplEventRepositoryChangeEventListener",
    "ComDayCqWcmCoreImplEventTemplatePostProcessor",
    "ComDayCqWcmCoreImplLanguageManagerImpl",
    "ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImpl",
    "ComDayCqWcmCoreImplPagePageInfoAggregatorImpl",
    "ComDayCqWcmCoreImplPagePageManagerFactoryImpl",
    "ComDayCqWcmCoreImplReferencesContentContentReferenceConfig",
    "ComDayCqWcmCoreImplServletsContentfinderAssetViewHandler",
    "ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVie",
    "ComDayCqWcmCoreImplServletsContentfinderPageViewHandler",
    "ComDayCqWcmCoreImplServletsFindReplaceServlet",
    "ComDayCqWcmCoreImplServletsReferenceSearchServlet",
    "ComDayCqWcmCoreImplServletsThumbnailServlet",
    "ComDayCqWcmCoreImplUtilsDefaultPageNameValidator",
    "ComDayCqWcmCoreImplVariantsPageVariantsProviderImpl",
    "ComDayCqWcmCoreImplVersionManagerImpl",
    "ComDayCqWcmCoreImplVersionPurgeTask",
    "ComDayCqWcmCoreImplWCMDebugFilter",
    "ComDayCqWcmCoreImplWCMDeveloperModeFilter",
    "ComDayCqWcmCoreImplWarpTimeWarpFilter",
    "ComDayCqWcmCoreMvtMVTStatisticsImpl",
    "ComDayCqWcmCoreStatsPageViewStatisticsImpl",
    "ComDayCqWcmCoreWCMRequestFilter",
    "ComDayCqWcmDesignimporterDesignPackageImporter",
    "ComDayCqWcmDesignimporterImplCanvasBuilderImpl",
    "ComDayCqWcmDesignimporterImplCanvasPageDeleteHandler",
    "ComDayCqWcmDesignimporterImplEntryPreprocessorImpl",
    "ComDayCqWcmDesignimporterImplMobileCanvasBuilderImpl",
    "ComDayCqWcmDesignimporterParserTaghandlersFactoryCanvasCompone",
    "ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultCompon",
    "ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultTagHan",
    "ComDayCqWcmDesignimporterParserTaghandlersFactoryHeadTagHandle",
    "ComDayCqWcmDesignimporterParserTaghandlersFactoryIFrameTagHand",
    "ComDayCqWcmDesignimporterParserTaghandlersFactoryImageComponen",
    "ComDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandler",
    "ComDayCqWcmDesignimporterParserTaghandlersFactoryInlineScriptT",
    "ComDayCqWcmDesignimporterParserTaghandlersFactoryLinkTagHandle",
    "ComDayCqWcmDesignimporterParserTaghandlersFactoryMetaTagHandle",
    "ComDayCqWcmDesignimporterParserTaghandlersFactoryNonScriptTagH",
    "ComDayCqWcmDesignimporterParserTaghandlersFactoryParsysCompone",
    "ComDayCqWcmDesignimporterParserTaghandlersFactoryScriptTagHand",
    "ComDayCqWcmDesignimporterParserTaghandlersFactoryStyleTagHandl",
    "ComDayCqWcmDesignimporterParserTaghandlersFactoryTextComponent",
    "ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleComponen",
    "ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleTagHandl",
    "ComDayCqWcmFoundationFormsImplFormChooserServlet",
    "ComDayCqWcmFoundationFormsImplFormParagraphPostProcessor",
    "ComDayCqWcmFoundationFormsImplFormsHandlingServlet",
    "ComDayCqWcmFoundationFormsImplMailServlet",
    "ComDayCqWcmFoundationImplAdaptiveImageComponentServlet",
    "ComDayCqWcmFoundationImplHTTPAuthHandler",
    "ComDayCqWcmFoundationImplPageImpressionsTracker",
    "ComDayCqWcmFoundationImplPageRedirectServlet",
    "ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklist",
    "ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImpl",
    "ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactory",
    "ComDayCqWcmMobileCoreImplRedirectRedirectFilter",
    "ComDayCqWcmMsmImplActionsContentCopyActionFactory",
    "ComDayCqWcmMsmImplActionsContentDeleteActionFactory",
    "ComDayCqWcmMsmImplActionsContentUpdateActionFactory",
    "ComDayCqWcmMsmImplActionsOrderChildrenActionFactory",
    "ComDayCqWcmMsmImplActionsPageMoveActionFactory",
    "ComDayCqWcmMsmImplActionsReferencesUpdateActionFactory",
    "ComDayCqWcmMsmImplActionsVersionCopyActionFactory",
    "ComDayCqWcmMsmImplLiveRelationshipManagerImpl",
    "ComDayCqWcmMsmImplRolloutManagerImpl",
    "ComDayCqWcmMsmImplServletsAuditLogServlet",
    "ComDayCqWcmNotificationEmailImplEmailChannel",
    "ComDayCqWcmNotificationImplNotificationManagerImpl",
    "ComDayCqWcmScriptingImplBVPManager",
    "ComDayCqWcmUndoUndoConfig",
    "ComDayCqWcmWebservicesupportImplReplicationEventListener",
    "ComDayCqWcmWorkflowImplWcmWorkflowServiceImpl",
    "ComDayCqWcmWorkflowImplWorkflowPackageInfoProvider",
    "ComDayCqWidgetImplHtmlLibraryManagerImpl",
    "ComDayCqWidgetImplWidgetExtensionProviderImpl",
    "ComDayCqWorkflowImplEmailEMailNotificationService",
    "ComDayCqWorkflowImplEmailTaskEMailNotificationService",
    "ComDayCrxSecurityTokenImplImplTokenAuthenticationHandler",
    "ComDayCrxSecurityTokenImplTokenCleanupTask",
    "GuideLocalizationService",
    "MessagingUserComponentFactory",
    "OrgApacheAriesJmxFrameworkStateConfig",
    "OrgApacheFelixEventadminImplEventAdmin",
    "OrgApacheFelixHttp",
    "OrgApacheFelixHttpSslfilterSslFilter",
    "OrgApacheFelixJaasConfigurationFactory",
    "OrgApacheFelixJaasConfigurationSpi",
    "OrgApacheFelixScrScrService",
    "OrgApacheFelixSystemreadyImplComponentsCheck",
    "OrgApacheFelixSystemreadyImplFrameworkStartCheck",
    "OrgApacheFelixSystemreadyImplServicesCheck",
    "OrgApacheFelixSystemreadyImplServletSystemAliveServlet",
    "OrgApacheFelixSystemreadyImplServletSystemReadyServlet",
    "OrgApacheFelixSystemreadySystemReadyMonitor",
    "OrgApacheFelixWebconsoleInternalServletOsgiManager",
    "OrgApacheFelixWebconsolePluginsEventInternalPluginServlet",
    "OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCo",
    "OrgApacheHttpProxyconfigurator",
    "OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProvider",
    "OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStore",
    "OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreService",
    "OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePre",
    "OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCac",
    "OrgApacheJackrabbitOakPluginsIndexAsyncIndexerService",
    "OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServ",
    "OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCo",
    "OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServers",
    "OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfiguration",
    "OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConf",
    "OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvid",
    "OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSe",
    "OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactory",
    "OrgApacheJackrabbitOakPluginsObservationChangeCollectorProvider",
    "OrgApacheJackrabbitOakQueryQueryEngineSettingsService",
    "OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfig",
    "OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdenti",
    "OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfigura",
    "OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigur",
    "OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistrati",
    "OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeName",
    "OrgApacheJackrabbitOakSecurityUserUserConfigurationImpl",
    "OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreService",
    "OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactory",
    "OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorService",
    "OrgApacheJackrabbitOakSegmentSegmentNodeStoreService",
    "OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreService",
    "OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDe",
    "OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplEx",
    "OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPr",
    "OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfi",
    "OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExclu",
    "OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizable",
    "OrgApacheJackrabbitVaultPackagingImplPackagingImpl",
    "OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistry",
    "OrgApacheSlingAuthCoreImplLogoutServlet",
    "OrgApacheSlingCaconfigImplConfigurationBindingsValueProvider",
    "OrgApacheSlingCaconfigImplConfigurationResolverImpl",
    "OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStra",
    "OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStra",
    "OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProvi",
    "OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOve",
    "OrgApacheSlingCaconfigManagementImplConfigurationManagementSetti",
    "OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResour",
    "OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategy",
    "OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParser",
    "OrgApacheSlingCommonsLogLogManager",
    "OrgApacheSlingCommonsLogLogManagerFactoryConfig",
    "OrgApacheSlingCommonsLogLogManagerFactoryWriter",
    "OrgApacheSlingCommonsMetricsInternalLogReporter",
    "OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporter",
    "OrgApacheSlingCommonsMimeInternalMimeTypeServiceImpl",
    "OrgApacheSlingCommonsSchedulerImplQuartzScheduler",
    "OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheck",
    "OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactory",
    "OrgApacheSlingDatasourceDataSourceFactory",
    "OrgApacheSlingDatasourceJNDIDataSourceFactory",
    "OrgApacheSlingDiscoveryOakConfig",
    "OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheck",
    "OrgApacheSlingDistributionAgentImplForwardDistributionAgentFacto",
    "OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestA",
    "OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactory",
    "OrgApacheSlingDistributionAgentImplReverseDistributionAgentFacto",
    "OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactor",
    "OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactory",
    "OrgApacheSlingDistributionMonitorDistributionQueueHealthCheck",
    "OrgApacheSlingDistributionPackagingImplExporterAgentDistributio",
    "OrgApacheSlingDistributionPackagingImplExporterLocalDistributio",
    "OrgApacheSlingDistributionPackagingImplExporterRemoteDistributi",
    "OrgApacheSlingDistributionPackagingImplImporterLocalDistributio",
    "OrgApacheSlingDistributionPackagingImplImporterRemoteDistributi",
    "OrgApacheSlingDistributionPackagingImplImporterRepositoryDistri",
    "OrgApacheSlingDistributionResourcesImplDistributionConfiguration",
    "OrgApacheSlingDistributionResourcesImplDistributionServiceResour",
    "OrgApacheSlingDistributionSerializationImplDistributionPackageBu",
    "OrgApacheSlingDistributionSerializationImplVltVaultDistribution",
    "OrgApacheSlingDistributionTransportImplUserCredentialsDistributi",
    "OrgApacheSlingDistributionTriggerImplDistributionEventDistribute",
    "OrgApacheSlingDistributionTriggerImplJcrEventDistributionTrigger",
    "OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributi",
    "OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrig",
    "OrgApacheSlingDistributionTriggerImplResourceEventDistributionTr",
    "OrgApacheSlingDistributionTriggerImplScheduledDistributionTrigge",
    "OrgApacheSlingEngineImplAuthSlingAuthenticator",
    "OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilter",
    "OrgApacheSlingEngineImplLogRequestLogger",
    "OrgApacheSlingEngineImplLogRequestLoggerService",
    "OrgApacheSlingEngineImplSlingMainServlet",
    "OrgApacheSlingEngineParameters",
    "OrgApacheSlingEventImplEventingThreadPool",
    "OrgApacheSlingEventImplJobsDefaultJobManager",
    "OrgApacheSlingEventImplJobsJcrPersistenceHandler",
    "OrgApacheSlingEventImplJobsJobConsumerManager",
    "OrgApacheSlingEventJobsQueueConfiguration",
    "OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingW",
    "OrgApacheSlingFeatureflagsFeature",
    "OrgApacheSlingFeatureflagsImplConfiguredFeature",
    "OrgApacheSlingHapiImplHApiUtilImpl",
    "OrgApacheSlingHcCoreImplCompositeHealthCheck",
    "OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImpl",
    "OrgApacheSlingHcCoreImplJmxAttributeHealthCheck",
    "OrgApacheSlingHcCoreImplScriptableHealthCheck",
    "OrgApacheSlingHcCoreImplServletHealthCheckExecutorServlet",
    "OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializer",
    "OrgApacheSlingI18nImplI18NFilter",
    "OrgApacheSlingI18nImplJcrResourceBundleProvider",
    "OrgApacheSlingInstallerProviderJcrImplJcrInstaller",
    "OrgApacheSlingJcrBaseInternalLoginAdminWhitelist",
    "OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragment",
    "OrgApacheSlingJcrDavexImplServletsSlingDavExServlet",
    "OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupport",
    "OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupport",
    "OrgApacheSlingJcrRepoinitImplRepositoryInitializer",
    "OrgApacheSlingJcrRepoinitRepositoryInitializer",
    "OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImpl",
    "OrgApacheSlingJcrResourceInternalJcrSystemUserValidator",
    "OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactory",
    "OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerService",
    "OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServic",
    "OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServlet",
    "OrgApacheSlingJmxProviderImplJMXResourceProvider",
    "OrgApacheSlingModelsImplModelAdapterFactory",
    "OrgApacheSlingModelsJacksonexporterImplResourceModuleProvider",
    "OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFacto",
    "OrgApacheSlingResourcemergerImplMergedResourceProviderFactory",
    "OrgApacheSlingResourcemergerPickerOverriding",
    "OrgApacheSlingScriptingCoreImplScriptCacheImpl",
    "OrgApacheSlingScriptingCoreImplScriptingResourceResolverProvider",
    "OrgApacheSlingScriptingJavaImplJavaScriptEngineFactory",
    "OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFa",
    "OrgApacheSlingScriptingJspJspScriptEngineFactory",
    "OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProv",
    "OrgApacheSlingSecurityImplContentDispositionFilter",
    "OrgApacheSlingSecurityImplReferrerFilter",
    "OrgApacheSlingServiceusermappingImplServiceUserMapperImpl",
    "OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmended",
    "OrgApacheSlingServletsGetDefaultGetServlet",
    "OrgApacheSlingServletsGetImplVersionVersionInfoServlet",
    "OrgApacheSlingServletsPostImplHelperChunkCleanUpTask",
    "OrgApacheSlingServletsPostImplSlingPostServlet",
    "OrgApacheSlingServletsResolverSlingServletResolver",
    "OrgApacheSlingSettingsImplSlingSettingsServiceImpl",
    "OrgApacheSlingStartupfilterImplStartupFilterImpl",
    "OrgApacheSlingTenantInternalTenantProviderImpl",
    "OrgApacheSlingTracerInternalLogTracer",
    "OrgApacheSlingXssImplXSSFilterImpl",
])
            .required(true)
            .index(1))
        .arg(Arg::with_name("https")
            .long("https")
            .help("Whether to use HTTPS or not"))
        .arg(Arg::with_name("host")
            .long("host")
            .takes_value(true)
            .default_value("localhost")
            .help("Hostname to contact"))
        .arg(Arg::with_name("port")
            .long("port")
            .takes_value(true)
            .default_value("80")
            .help("Port to contact"))
        .get_matches();

    let mut core = reactor::Core::new().unwrap();
    let is_https = matches.is_present("https");
    let base_url = format!("{}://{}:{}",
                           if is_https { "https" } else { "http" },
                           matches.value_of("host").unwrap(),
                           matches.value_of("port").unwrap());
    let client = if matches.is_present("https") {
        // Using Simple HTTPS
        swagger_client::Client::try_new_https(core.handle(), &base_url, "examples/ca.pem")
            .expect("Failed to create HTTPS client")
    } else {
        // Using HTTP
        swagger_client::Client::try_new_http(core.handle(), &base_url)
            .expect("Failed to create HTTP client")
    };

    let context: make_context_ty!(ContextBuilder, EmptyContext, Option<AuthData>, XSpanIdString) =
        make_context!(ContextBuilder, EmptyContext, None, XSpanIdString(self::uuid::Uuid::new_v4().to_string()));
    let client = client.with_context(context);

    match matches.value_of("operation") {

        Some("AdaptiveFormAndInteractiveCommunicationWebChannelConfiguration") => {
            let result = core.run(client.adaptive_form_and_interactive_communication_web_channel_configuration(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(true), Some(56), Some("af_scripting_compatversion_example".to_string()), Some(true), Some(true)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigur") => {
            let result = core.run(client.adaptive_form_and_interactive_communication_web_channel_theme_configur(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("AnalyticsComponentQueryCacheService") => {
            let result = core.run(client.analytics_component_query_cache_service(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(56)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ApacheSlingHealthCheckResultHTMLSerializer") => {
            let result = core.run(client.apache_sling_health_check_result_html_serializer(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("style_string_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfiguration") => {
            let result = core.run(client.com_adobe_aem_formsndocuments_config_aem_forms_manager_configuration(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(true), Some(true)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeAemTransactionCoreImplTransactionRecorder") => {
            let result = core.run(client.com_adobe_aem_transaction_core_impl_transaction_recorder(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(true)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHC") => {
            let result = core.run(client.com_adobe_aem_upgrade_prechecks_hc_impl_deprecate_indexes_hc(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("hc_name_example".to_string()), Some(&Vec::new()), Some("hc_mbean_name_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHC") => {
            let result = core.run(client.com_adobe_aem_upgrade_prechecks_hc_impl_replication_agents_disabled_hc(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("hc_name_example".to_string()), Some(&Vec::new()), Some("hc_mbean_name_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImpl") => {
            let result = core.run(client.com_adobe_aem_upgrade_prechecks_mbean_impl_pre_upgrade_tasks_m_bean_impl(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new()), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImpl") => {
            let result = core.run(client.com_adobe_aem_upgrade_prechecks_tasks_impl_consistency_check_task_impl(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("root_path_example".to_string()), Some(true)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeCqAccountApiAccountManagementService") => {
            let result = core.run(client.com_adobe_cq_account_api_account_management_service(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(56), Some("cq_accountmanager_config_requestnewaccount_mail_example".to_string()), Some("cq_accountmanager_config_requestnewpwd_mail_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeCqAccountImplAccountManagementServlet") => {
            let result = core.run(client.com_adobe_cq_account_impl_account_management_servlet(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("cq_accountmanager_config_informnewaccount_mail_example".to_string()), Some("cq_accountmanager_config_informnewpwd_mail_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeCqAddressImplLocationLocationListServlet") => {
            let result = core.run(client.com_adobe_cq_address_impl_location_location_list_servlet(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(56)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeCqAuditPurgeDam") => {
            let result = core.run(client.com_adobe_cq_audit_purge_dam(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("auditlog_rule_name_example".to_string()), Some("auditlog_rule_contentpath_example".to_string()), Some(56), Some("auditlog_rule_types_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeCqAuditPurgePages") => {
            let result = core.run(client.com_adobe_cq_audit_purge_pages(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("auditlog_rule_name_example".to_string()), Some("auditlog_rule_contentpath_example".to_string()), Some(56), Some("auditlog_rule_types_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeCqAuditPurgeReplication") => {
            let result = core.run(client.com_adobe_cq_audit_purge_replication(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("auditlog_rule_name_example".to_string()), Some("auditlog_rule_contentpath_example".to_string()), Some(56), Some("auditlog_rule_types_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeCqCdnRewriterImplAWSCloudFrontRewriter") => {
            let result = core.run(client.com_adobe_cq_cdn_rewriter_impl_aws_cloud_front_rewriter(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(56), Some("keypair_id_example".to_string()), Some("keypair_alias_example".to_string()), Some(&Vec::new()), Some("cdn_rewriter_distribution_domain_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeCqCdnRewriterImplCDNConfigServiceImpl") => {
            let result = core.run(client.com_adobe_cq_cdn_rewriter_impl_cdn_config_service_impl(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("cdn_config_distribution_domain_example".to_string()), Some(true), Some(&Vec::new()), Some(56), Some("cdn_config_application_protocol_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeCqCdnRewriterImplCDNRewriter") => {
            let result = core.run(client.com_adobe_cq_cdn_rewriter_impl_cdn_rewriter(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(56), Some(&Vec::new()), Some("cdn_rewriter_distribution_domain_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandle") => {
            let result = core.run(client.com_adobe_cq_cloudconfig_core_impl_configuration_replication_event_handle(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeCqCommerceImplAssetDynamicImageHandler") => {
            let result = core.run(client.com_adobe_cq_commerce_impl_asset_dynamic_image_handler(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(true), Some("cq_commerce_asset_handler_name_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImpl") => {
            let result = core.run(client.com_adobe_cq_commerce_impl_asset_product_asset_handler_provider_impl(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("cq_commerce_asset_handler_fallback_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeCqCommerceImplAssetStaticImageHandler") => {
            let result = core.run(client.com_adobe_cq_commerce_impl_asset_static_image_handler(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(true), Some("cq_commerce_asset_handler_name_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeCqCommerceImplAssetVideoHandler") => {
            let result = core.run(client.com_adobe_cq_commerce_impl_asset_video_handler(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(true), Some("cq_commerce_asset_handler_name_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeCqCommerceImplPromotionPromotionManagerImpl") => {
            let result = core.run(client.com_adobe_cq_commerce_impl_promotion_promotion_manager_impl(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("cq_commerce_promotion_root_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImpl") => {
            let result = core.run(client.com_adobe_cq_commerce_pim_impl_cataloggenerator_catalog_generator_impl(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(56), Some("cq_commerce_cataloggenerator_bucketname_example".to_string()), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeCqCommercePimImplPageEventListener") => {
            let result = core.run(client.com_adobe_cq_commerce_pim_impl_page_event_listener(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(true)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeCqCommercePimImplProductfeedProductFeedServiceImpl") => {
            let result = core.run(client.com_adobe_cq_commerce_pim_impl_productfeed_product_feed_service_impl(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("feed_generator_algorithm_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeCqContentinsightImplReportingServicesSettingsProvider") => {
            let result = core.run(client.com_adobe_cq_contentinsight_impl_reporting_services_settings_provider(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("reportingservices_url_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeCqContentinsightImplServletsBrightEdgeProxyServlet") => {
            let result = core.run(client.com_adobe_cq_contentinsight_impl_servlets_bright_edge_proxy_servlet(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("brightedge_url_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeCqContentinsightImplServletsReportingServicesProxyServle") => {
            let result = core.run(client.com_adobe_cq_contentinsight_impl_servlets_reporting_services_proxy_servle(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeCqDamCfmImplComponentComponentConfigImpl") => {
            let result = core.run(client.com_adobe_cq_dam_cfm_impl_component_component_config_impl(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("dam_cfm_component_resource_type_example".to_string()), Some("dam_cfm_component_file_reference_prop_example".to_string()), Some("dam_cfm_component_elements_prop_example".to_string()), Some("dam_cfm_component_variation_prop_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeCqDamCfmImplConfFeatureConfigImpl") => {
            let result = core.run(client.com_adobe_cq_dam_cfm_impl_conf_feature_config_impl(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new()), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeCqDamCfmImplContentRewriterAssetProcessor") => {
            let result = core.run(client.com_adobe_cq_dam_cfm_impl_content_rewriter_asset_processor(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("pipeline_type_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeCqDamCfmImplContentRewriterParRangeFilter") => {
            let result = core.run(client.com_adobe_cq_dam_cfm_impl_content_rewriter_par_range_filter(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("pipeline_type_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeCqDamCfmImplContentRewriterPayloadFilter") => {
            let result = core.run(client.com_adobe_cq_dam_cfm_impl_content_rewriter_payload_filter(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("pipeline_type_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeCqDamDmProcessImagePTiffManagerImpl") => {
            let result = core.run(client.com_adobe_cq_dam_dm_process_image_p_tiff_manager_impl(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(56)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorker") => {
            let result = core.run(client.com_adobe_cq_dam_ips_impl_replication_trigger_replicate_on_modify_worker(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(true), Some(true)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeCqDamMacSyncHelperImplMACSyncClientImpl") => {
            let result = core.run(client.com_adobe_cq_dam_mac_sync_helper_impl_mac_sync_client_impl(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(56)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeCqDamMacSyncImplDAMSyncServiceImpl") => {
            let result = core.run(client.com_adobe_cq_dam_mac_sync_impl_dam_sync_service_impl(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new()), Some(true), Some(56), Some("com_adobe_cq_dam_mac_sync_damsyncservice_platform_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeCqDamProcessorNuiImplNuiAssetProcessor") => {
            let result = core.run(client.com_adobe_cq_dam_processor_nui_impl_nui_asset_processor(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(true), Some("nui_service_url_example".to_string()), Some("nui_api_key_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeCqDamS7imagingImplIsImageServerComponent") => {
            let result = core.run(client.com_adobe_cq_dam_s7imaging_impl_is_image_server_component(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("tcp_port_example".to_string()), Some(true), Some("max_render_rgn_pixels_example".to_string()), Some("max_message_size_example".to_string()), Some(56), Some(56)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeCqDamS7imagingImplPsPlatformServerServlet") => {
            let result = core.run(client.com_adobe_cq_dam_s7imaging_impl_ps_platform_server_servlet(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(true), Some(&Vec::new()), Some(56), Some(56)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeCqDamWebdavImplIoAssetIOHandler") => {
            let result = core.run(client.com_adobe_cq_dam_webdav_impl_io_asset_io_handler(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(56), Some("path_prefix_example".to_string()), Some(true)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJob") => {
            let result = core.run(client.com_adobe_cq_dam_webdav_impl_io_dam_webdav_version_linking_job(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(true), Some(56), Some(56)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeCqDamWebdavImplIoSpecialFilesHandler") => {
            let result = core.run(client.com_adobe_cq_dam_webdav_impl_io_special_files_handler(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeCqDeserfwImplDeserializationFirewallImpl") => {
            let result = core.run(client.com_adobe_cq_deserfw_impl_deserialization_firewall_impl(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new()), Some(&Vec::new()), Some("firewall_deserialization_diagnostics_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeCqDtmImplServiceDTMWebServiceImpl") => {
            let result = core.run(client.com_adobe_cq_dtm_impl_service_dtm_web_service_impl(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(56), Some(56)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeCqDtmImplServletsDTMDeployHookServlet") => {
            let result = core.run(client.com_adobe_cq_dtm_impl_servlets_dtm_deploy_hook_servlet(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new()), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeCqDtmReactorImplServiceWebServiceImpl") => {
            let result = core.run(client.com_adobe_cq_dtm_reactor_impl_service_web_service_impl(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("endpoint_uri_example".to_string()), Some(56), Some(56)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeCqExperiencelogImplExperienceLogConfigServlet") => {
            let result = core.run(client.com_adobe_cq_experiencelog_impl_experience_log_config_servlet(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(true), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeCqHcContentPackagesHealthCheck") => {
            let result = core.run(client.com_adobe_cq_hc_content_packages_health_check(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("hc_name_example".to_string()), Some(&Vec::new()), Some("hc_mbean_name_example".to_string()), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeCqHistoryImplHistoryRequestFilter") => {
            let result = core.run(client.com_adobe_cq_history_impl_history_request_filter(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new()), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeCqHistoryImplHistoryServiceImpl") => {
            let result = core.run(client.com_adobe_cq_history_impl_history_service_impl(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new()), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeCqInboxImplTypeproviderItemTypeProvider") => {
            let result = core.run(client.com_adobe_cq_inbox_impl_typeprovider_item_type_provider(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new()), Some(&Vec::new()), Some("inbox_impl_typeprovider_defaulturl_failureitem_example".to_string()), Some("inbox_impl_typeprovider_defaulturl_workitem_example".to_string()), Some("inbox_impl_typeprovider_defaulturl_task_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeCqProjectsImplServletProjectImageServlet") => {
            let result = core.run(client.com_adobe_cq_projects_impl_servlet_project_image_servlet(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("image_quality_example".to_string()), Some("image_supported_resolutions_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeCqProjectsPurgeScheduler") => {
            let result = core.run(client.com_adobe_cq_projects_purge_scheduler(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("scheduledpurge_name_example".to_string()), Some(true), Some(&Vec::new()), Some(true), Some(true), Some(true), Some(56), Some(56)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeCqScheduledExporterImplScheduledExporterImpl") => {
            let result = core.run(client.com_adobe_cq_scheduled_exporter_impl_scheduled_exporter_impl(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new()), Some("exporter_user_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImpl") => {
            let result = core.run(client.com_adobe_cq_screens_analytics_impl_screens_analytics_service_impl(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("com_adobe_cq_screens_analytics_impl_url_example".to_string()), Some("com_adobe_cq_screens_analytics_impl_apikey_example".to_string()), Some("com_adobe_cq_screens_analytics_impl_project_example".to_string()), Some("com_adobe_cq_screens_analytics_impl_environment_example".to_string()), Some(56)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeCqScreensDeviceImplDeviceService") => {
            let result = core.run(client.com_adobe_cq_screens_device_impl_device_service(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(56), Some("com_adobe_aem_screens_device_pasword_specialchars_example".to_string()), Some(56), Some(56), Some(56), Some(56), Some(56)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImpl") => {
            let result = core.run(client.com_adobe_cq_screens_device_registration_impl_registration_service_impl(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(56)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeCqScreensImplHandlerChannelsUpdateHandler") => {
            let result = core.run(client.com_adobe_cq_screens_impl_handler_channels_update_handler(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new()), Some(&Vec::new()), Some(&Vec::new()), Some(&Vec::new()), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJob") => {
            let result = core.run(client.com_adobe_cq_screens_impl_jobs_distributed_devices_stati_update_job(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("scheduler_expression_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeCqScreensImplRemoteImplDistributedHttpClientImpl") => {
            let result = core.run(client.com_adobe_cq_screens_impl_remote_impl_distributed_http_client_impl(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(56)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeCqScreensImplScreensChannelPostProcessor") => {
            let result = core.run(client.com_adobe_cq_screens_impl_screens_channel_post_processor(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImpl") => {
            let result = core.run(client.com_adobe_cq_screens_monitoring_impl_screens_monitoring_service_impl(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new()), Some("com_adobe_cq_screens_monitoring_impl_screens_monitoring_service_impl_schedule_frequency_example".to_string()), Some(56), Some("com_adobe_cq_screens_monitoring_impl_screens_monitoring_service_impl_recipients_example".to_string()), Some("com_adobe_cq_screens_monitoring_impl_screens_monitoring_service_impl_smtpserver_example".to_string()), Some(56), Some(true), Some("com_adobe_cq_screens_monitoring_impl_screens_monitoring_service_impl_username_example".to_string()), Some("com_adobe_cq_screens_monitoring_impl_screens_monitoring_service_impl_password_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeCqScreensMqActivemqImplArtemisJMSProvider") => {
            let result = core.run(client.com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(56), Some(56), Some(56), Some(true), Some(56), Some(56), Some(56), Some(&Vec::new()), Some(&Vec::new()), Some(56), Some(56), Some("addresses_address_full_message_policy_example".to_string()), Some(56), Some(56), Some(56), Some("cluster_user_example".to_string()), Some("cluster_password_example".to_string()), Some(56), Some(56), Some(56), Some(56), Some(56), Some(56), Some(56), Some(56), Some(true), Some(56), Some(56), Some(56), Some(56), Some(56), Some(56), Some(1.2)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImpl") => {
            let result = core.run(client.com_adobe_cq_screens_offlinecontent_impl_bulk_offline_update_service_impl(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new()), Some("com_adobe_cq_screens_offlinecontent_impl_bulk_offline_update_service_impl_schedule_frequency_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImpl") => {
            let result = core.run(client.com_adobe_cq_screens_offlinecontent_impl_offline_content_service_impl(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(true)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeCqScreensSegmentationImplSegmentationFeatureFlag") => {
            let result = core.run(client.com_adobe_cq_screens_segmentation_impl_segmentation_feature_flag(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(true)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthCh") => {
            let result = core.run(client.com_adobe_cq_security_hc_bundles_impl_html_library_manager_config_health_ch(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheck") => {
            let result = core.run(client.com_adobe_cq_security_hc_bundles_impl_wcm_filter_health_check(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheck") => {
            let result = core.run(client.com_adobe_cq_security_hc_dispatcher_impl_dispatcher_access_health_check(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new()), Some("dispatcher_address_example".to_string()), Some(&Vec::new()), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheck") => {
            let result = core.run(client.com_adobe_cq_security_hc_packages_impl_example_content_health_check(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheck") => {
            let result = core.run(client.com_adobe_cq_security_hc_webserver_impl_clickjacking_health_check(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new()), Some("webserver_address_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeCqSocialAccountverificationImplAccountManagementConfigIm") => {
            let result = core.run(client.com_adobe_cq_social_accountverification_impl_account_management_config_im(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(true), Some(56), Some(56)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponen") => {
            let result = core.run(client.com_adobe_cq_social_activitystreams_client_impl_social_activity_componen(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(56)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCo") => {
            let result = core.run(client.com_adobe_cq_social_activitystreams_client_impl_social_activity_stream_co(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(56)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandler") => {
            let result = core.run(client.com_adobe_cq_social_activitystreams_listener_impl_event_listener_handler(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("event_topics_example".to_string()), Some("event_filter_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeCqSocialActivitystreamsListenerImplModerationEventExten") => {
            let result = core.run(client.com_adobe_cq_social_activitystreams_listener_impl_moderation_event_exten(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(true), Some(56)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivityS") => {
            let result = core.run(client.com_adobe_cq_social_activitystreams_listener_impl_rating_event_activity_s(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(56), Some(true)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStre") => {
            let result = core.run(client.com_adobe_cq_social_activitystreams_listener_impl_resource_activity_stre(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("stream_path_example".to_string()), Some("stream_name_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsI") => {
            let result = core.run(client.com_adobe_cq_social_calendar_client_endpoints_impl_calendar_operations_i(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(56), Some(&Vec::new()), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmen") => {
            let result = core.run(client.com_adobe_cq_social_calendar_client_operationextensions_event_attachmen(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("attachment_type_blacklist_example".to_string()), Some(56)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeCqSocialCalendarServletsTimeZoneServlet") => {
            let result = core.run(client.com_adobe_cq_social_calendar_servlets_time_zone_servlet(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(56)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEvent") => {
            let result = core.run(client.com_adobe_cq_social_commons_comments_endpoints_impl_comment_delete_event(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(56)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSe") => {
            let result = core.run(client.com_adobe_cq_social_commons_comments_endpoints_impl_comment_operation_se(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new()), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperati") => {
            let result = core.run(client.com_adobe_cq_social_commons_comments_endpoints_impl_translation_operati(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new()), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialC") => {
            let result = core.run(client.com_adobe_cq_social_commons_comments_listing_impl_search_comment_social_c(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(56)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPos") => {
            let result = core.run(client.com_adobe_cq_social_commons_comments_scheduler_impl_search_scheduled_pos(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(true), Some(56), Some(56)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeCqSocialCommonsCorsCORSAuthenticationFilter") => {
            let result = core.run(client.com_adobe_cq_social_commons_cors_cors_authentication_filter(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(true)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProvider") => {
            let result = core.run(client.com_adobe_cq_social_commons_emailreply_impl_android_email_client_provider(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(56), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImpl") => {
            let result = core.run(client.com_adobe_cq_social_commons_emailreply_impl_comment_email_builder_impl(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("context_path_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListener") => {
            let result = core.run(client.com_adobe_cq_social_commons_emailreply_impl_comment_email_event_listener(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("event_topics_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeCqSocialCommonsEmailreplyImplCustomEmailClientProvider") => {
            let result = core.run(client.com_adobe_cq_social_commons_emailreply_impl_custom_email_client_provider(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(56), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImp") => {
            let result = core.run(client.com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_imp(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("pattern_time_example".to_string()), Some("pattern_newline_example".to_string()), Some("pattern_day_of_month_example".to_string()), Some("pattern_month_example".to_string()), Some("pattern_year_example".to_string()), Some("pattern_date_example".to_string()), Some("pattern_date_time_example".to_string()), Some("pattern_email_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImp") => {
            let result = core.run(client.com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("email_name_example".to_string()), Some(true), Some("email_add_comment_id_to_example".to_string()), Some(56), Some("email_reply_to_address_example".to_string()), Some("email_reply_to_delimiter_example".to_string()), Some("email_tracker_id_prefix_in_subject_example".to_string()), Some("email_tracker_id_prefix_in_body_example".to_string()), Some(true), Some("email_default_user_name_example".to_string()), Some("email_templates_root_path_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporter") => {
            let result = core.run(client.com_adobe_cq_social_commons_emailreply_impl_email_reply_importer(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("connect_protocol_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeCqSocialCommonsEmailreplyImplGmailEmailClientProvider") => {
            let result = core.run(client.com_adobe_cq_social_commons_emailreply_impl_gmail_email_client_provider(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(56), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProvider") => {
            let result = core.run(client.com_adobe_cq_social_commons_emailreply_impl_ios_email_client_provider(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(56), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProvider") => {
            let result = core.run(client.com_adobe_cq_social_commons_emailreply_impl_macmail_email_client_provider(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(56), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeCqSocialCommonsEmailreplyImplOutLookEmailClientProvider") => {
            let result = core.run(client.com_adobe_cq_social_commons_emailreply_impl_out_look_email_client_provider(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(56), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProvider") => {
            let result = core.run(client.com_adobe_cq_social_commons_emailreply_impl_unknown_email_client_provider(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new()), Some(56)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProvider") => {
            let result = core.run(client.com_adobe_cq_social_commons_emailreply_impl_yahoo_email_client_provider(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(56), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUpload") => {
            let result = core.run(client.com_adobe_cq_social_commons_maintainance_impl_delete_temp_ugc_image_upload(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(56), Some(56)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImpl") => {
            let result = core.run(client.com_adobe_cq_social_commons_ugclimiter_impl_ugc_limiter_service_impl(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("event_topics_example".to_string()), Some("event_filter_example".to_string()), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimit") => {
            let result = core.run(client.com_adobe_cq_social_commons_ugclimitsconfig_impl_community_user_ugc_limit(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(true), Some(56), Some(56), Some(&Vec::new()), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeCqSocialConnectOauthImplFacebookProviderImpl") => {
            let result = core.run(client.com_adobe_cq_social_connect_oauth_impl_facebook_provider_impl(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("oauth_provider_id_example".to_string()), Some("oauth_cloud_config_root_example".to_string()), Some("provider_config_root_example".to_string()), Some(true), Some("provider_config_user_folder_example".to_string()), Some(true), Some(&Vec::new()), Some(true)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandle") => {
            let result = core.run(client.com_adobe_cq_social_connect_oauth_impl_social_o_auth_authentication_handle(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new()), Some(56)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapper") => {
            let result = core.run(client.com_adobe_cq_social_connect_oauth_impl_social_o_auth_user_profile_mapper(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new()), Some(&Vec::new()), Some("provider_config_user_folder_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeCqSocialConnectOauthImplTwitterProviderImpl") => {
            let result = core.run(client.com_adobe_cq_social_connect_oauth_impl_twitter_provider_impl(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("oauth_provider_id_example".to_string()), Some("oauth_cloud_config_root_example".to_string()), Some("provider_config_root_example".to_string()), Some("provider_config_user_folder_example".to_string()), Some(true), Some(&Vec::new()), Some(true)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmen") => {
            let result = core.run(client.com_adobe_cq_social_content_fragments_services_impl_communities_fragmen(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(true), Some(56)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeCqSocialDatastoreAsImplASResourceProviderFactory") => {
            let result = core.run(client.com_adobe_cq_social_datastore_as_impl_as_resource_provider_factory(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("version_id_example".to_string()), Some(true), Some(56), Some(56), Some(56), Some(56), Some(56)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactory") => {
            let result = core.run(client.com_adobe_cq_social_datastore_op_impl_social_ms_resource_provider_factory(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("solr_zk_timeout_example".to_string()), Some("solr_commit_example".to_string()), Some(true), Some(56), Some(56), Some(56), Some(56)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactor") => {
            let result = core.run(client.com_adobe_cq_social_datastore_rdb_impl_social_rdb_resource_provider_factor(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("solr_zk_timeout_example".to_string()), Some("solr_commit_example".to_string()), Some(true), Some(56), Some(56), Some(56), Some(56)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorF") => {
            let result = core.run(client.com_adobe_cq_social_enablement_adaptors_enablement_learning_path_adaptor_f(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(true)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFacto") => {
            let result = core.run(client.com_adobe_cq_social_enablement_adaptors_enablement_resource_adaptor_facto(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(true)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeCqSocialEnablementLearningpathEndpointsImplEnablementL") => {
            let result = core.run(client.com_adobe_cq_social_enablement_learningpath_endpoints_impl_enablement_l(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResou") => {
            let result = core.run(client.com_adobe_cq_social_enablement_resource_endpoints_impl_enablement_resou(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeCqSocialEnablementServicesImplAuthorMarkerImpl") => {
            let result = core.run(client.com_adobe_cq_social_enablement_services_impl_author_marker_impl(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(56)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGe") => {
            let result = core.run(client.com_adobe_cq_social_filelibrary_client_endpoints_filelibrary_download_ge(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("sling_servlet_selectors_example".to_string()), Some("sling_servlet_extensions_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOpera") => {
            let result = core.run(client.com_adobe_cq_social_filelibrary_client_endpoints_impl_file_library_opera(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new()), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeCqSocialForumClientEndpointsImplForumOperationsService") => {
            let result = core.run(client.com_adobe_cq_social_forum_client_endpoints_impl_forum_operations_service(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new()), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeCqSocialForumDispatcherImplFlushOperations") => {
            let result = core.run(client.com_adobe_cq_social_forum_dispatcher_impl_flush_operations(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(56), Some(true)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponen") => {
            let result = core.run(client.com_adobe_cq_social_group_client_impl_community_group_collection_componen(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(true), Some(true), Some(56), Some(56)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeCqSocialGroupImplGroupServiceImpl") => {
            let result = core.run(client.com_adobe_cq_social_group_impl_group_service_impl(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(56), Some(56)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeCqSocialHandlebarsGuavaTemplateCacheImpl") => {
            let result = core.run(client.com_adobe_cq_social_handlebars_guava_template_cache_impl(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(true), Some("parameter_guava_cache_params_example".to_string()), Some(true), Some(56)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsS") => {
            let result = core.run(client.com_adobe_cq_social_ideation_client_endpoints_impl_ideation_operations_s(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new()), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSer") => {
            let result = core.run(client.com_adobe_cq_social_journal_client_endpoints_impl_journal_operations_ser(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new()), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfile") => {
            let result = core.run(client.com_adobe_cq_social_members_endpoints_impl_community_member_group_profile(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileO") => {
            let result = core.run(client.com_adobe_cq_social_members_endpoints_impl_community_member_user_profile_o(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentF") => {
            let result = core.run(client.com_adobe_cq_social_members_impl_community_member_group_profile_component_f(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(56), Some(56)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperation") => {
            let result = core.run(client.com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new()), Some(56), Some(56), Some(true), Some("failure_message_from_example".to_string()), Some("failure_template_path_example".to_string()), Some(56), Some(56), Some(56), Some("inbox_path_example".to_string()), Some("sentitems_path_example".to_string()), Some(true), Some(true), Some(56), Some(56), Some(56), Some(&Vec::new()), Some(&Vec::new()), Some("service_selector_example".to_string()), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponen") => {
            let result = core.run(client.com_adobe_cq_social_moderation_dashboard_api_filter_group_social_componen(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new()), Some(56)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeCqSocialModerationDashboardApiModerationDashboardSocial") => {
            let result = core.run(client.com_adobe_cq_social_moderation_dashboard_api_moderation_dashboard_social(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(56)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponen") => {
            let result = core.run(client.com_adobe_cq_social_moderation_dashboard_api_user_details_social_componen(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(56)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSoci") => {
            let result = core.run(client.com_adobe_cq_social_moderation_dashboard_internal_impl_filter_group_soci(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new()), Some(56)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeCqSocialNotificationsImplMentionsRouter") => {
            let result = core.run(client.com_adobe_cq_social_notifications_impl_mentions_router(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("event_topics_example".to_string()), Some("event_filter_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeCqSocialNotificationsImplNotificationManagerImpl") => {
            let result = core.run(client.com_adobe_cq_social_notifications_impl_notification_manager_impl(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(56)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeCqSocialNotificationsImplNotificationsRouter") => {
            let result = core.run(client.com_adobe_cq_social_notifications_impl_notifications_router(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("event_topics_example".to_string()), Some("event_filter_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServic") => {
            let result = core.run(client.com_adobe_cq_social_qna_client_endpoints_impl_qna_forum_operations_servic(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new()), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportI") => {
            let result = core.run(client.com_adobe_cq_social_reporting_analytics_services_impl_analytics_report_i(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(56), Some(56)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportM") => {
            let result = core.run(client.com_adobe_cq_social_reporting_analytics_services_impl_analytics_report_m(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(56)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportS") => {
            let result = core.run(client.com_adobe_cq_social_reporting_analytics_services_impl_site_trend_report_s(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new()), Some(56)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServi") => {
            let result = core.run(client.com_adobe_cq_social_review_client_endpoints_impl_review_operations_servi(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new()), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServlet") => {
            let result = core.run(client.com_adobe_cq_social_scf_core_operations_impl_social_operations_servlet(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("sling_servlet_selectors_example".to_string()), Some("sling_servlet_extensions_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServlet") => {
            let result = core.run(client.com_adobe_cq_social_scf_endpoints_impl_default_social_get_servlet(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new()), Some("sling_servlet_extensions_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeCqSocialScoringImplScoringEventListener") => {
            let result = core.run(client.com_adobe_cq_social_scoring_impl_scoring_event_listener(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("event_topics_example".to_string()), Some("event_filter_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImpl") => {
            let result = core.run(client.com_adobe_cq_social_serviceusers_internal_impl_service_user_wrapper_impl(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(true)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeCqSocialSiteEndpointsImplSiteOperationService") => {
            let result = core.run(client.com_adobe_cq_social_site_endpoints_impl_site_operation_service(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new()), Some(&Vec::new()), Some("site_package_group_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceIm") => {
            let result = core.run(client.com_adobe_cq_social_site_impl_analytics_component_configuration_service_im(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeCqSocialSiteImplSiteConfiguratorImpl") => {
            let result = core.run(client.com_adobe_cq_social_site_impl_site_configurator_impl(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeCqSocialSrpImplSocialSolrConnector") => {
            let result = core.run(client.com_adobe_cq_social_srp_impl_social_solr_connector(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("srp_type_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeCqSocialSyncImplDiffChangesObserver") => {
            let result = core.run(client.com_adobe_cq_social_sync_impl_diff_changes_observer(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(true), Some("agent_name_example".to_string()), Some("diff_path_example".to_string()), Some("property_names_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeCqSocialSyncImplGroupSyncListenerImpl") => {
            let result = core.run(client.com_adobe_cq_social_sync_impl_group_sync_listener_impl(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new()), Some(&Vec::new()), Some("ignorablenodes_example".to_string()), Some(true), Some("distfolders_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeCqSocialSyncImplPublisherSyncServiceImpl") => {
            let result = core.run(client.com_adobe_cq_social_sync_impl_publisher_sync_service_impl(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeCqSocialSyncImplUserSyncListenerImpl") => {
            let result = core.run(client.com_adobe_cq_social_sync_impl_user_sync_listener_impl(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new()), Some(&Vec::new()), Some(&Vec::new()), Some(true), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeCqSocialTranslationImplTranslationServiceConfigManager") => {
            let result = core.run(client.com_adobe_cq_social_translation_impl_translation_service_config_manager(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("translate_language_example".to_string()), Some("translate_display_example".to_string()), Some(true), Some("translate_caching_example".to_string()), Some("translate_smart_rendering_example".to_string()), Some("translate_caching_duration_example".to_string()), Some("translate_session_save_interval_example".to_string()), Some("translate_session_save_batch_limit_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeCqSocialTranslationImplUGCLanguageDetector") => {
            let result = core.run(client.com_adobe_cq_social_translation_impl_ugc_language_detector(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("event_topics_example".to_string()), Some("event_filter_example".to_string()), Some(&Vec::new()), Some(&Vec::new()), Some(56), Some(56), Some(56), Some(56)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImpl") => {
            let result = core.run(client.com_adobe_cq_social_ugcbase_dispatcher_impl_flush_service_impl(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(56), Some(56), Some(56)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImpl") => {
            let result = core.run(client.com_adobe_cq_social_ugcbase_impl_aysnc_reverse_replicator_impl(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(56), Some(56), Some(56), Some(56)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeCqSocialUgcbaseImplPublisherConfigurationImpl") => {
            let result = core.run(client.com_adobe_cq_social_ugcbase_impl_publisher_configuration_impl(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(true)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeCqSocialUgcbaseImplSocialUtilsImpl") => {
            let result = core.run(client.com_adobe_cq_social_ugcbase_impl_social_utils_impl(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(true)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeCqSocialUgcbaseModerationImplAutoModerationImpl") => {
            let result = core.run(client.com_adobe_cq_social_ugcbase_moderation_impl_auto_moderation_impl(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new()), Some(true)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeCqSocialUgcbaseModerationImplSentimentProcess") => {
            let result = core.run(client.com_adobe_cq_social_ugcbase_moderation_impl_sentiment_process(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new()), Some(&Vec::new()), Some("watchwords_path_example".to_string()), Some("sentiment_path_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackli") => {
            let result = core.run(client.com_adobe_cq_social_ugcbase_security_impl_default_attachment_type_blackli(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new()), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImpl") => {
            let result = core.run(client.com_adobe_cq_social_ugcbase_security_impl_safer_sling_post_validator_impl(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new()), Some(&Vec::new()), Some(&Vec::new()), Some(&Vec::new()), Some(&Vec::new()), Some(&Vec::new()), Some(&Vec::new()), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServlet") => {
            let result = core.run(client.com_adobe_cq_social_user_endpoints_impl_users_group_from_publish_servlet(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("sling_servlet_extensions_example".to_string()), Some("sling_servlet_paths_example".to_string()), Some("sling_servlet_methods_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeCqSocialUserImplTransportHttpToPublisher") => {
            let result = core.run(client.com_adobe_cq_social_user_impl_transport_http_to_publisher(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(true), Some(&Vec::new()), Some("context_path_example".to_string()), Some(&Vec::new()), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFact") => {
            let result = core.run(client.com_adobe_cq_ui_wcm_commons_internal_servlets_rte_rte_filter_servlet_fact(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeCqUpgradesCleanupImplUpgradeContentCleanup") => {
            let result = core.run(client.com_adobe_cq_upgrades_cleanup_impl_upgrade_content_cleanup(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new()), Some("delete_sql2_query_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanup") => {
            let result = core.run(client.com_adobe_cq_upgrades_cleanup_impl_upgrade_install_folder_cleanup(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderService") => {
            let result = core.run(client.com_adobe_cq_wcm_jobs_async_impl_async_delete_config_provider_service(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(56), Some("job_topic_name_example".to_string()), Some(true)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTask") => {
            let result = core.run(client.com_adobe_cq_wcm_jobs_async_impl_async_job_clean_up_task(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("scheduler_expression_example".to_string()), Some(56), Some(56)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderService") => {
            let result = core.run(client.com_adobe_cq_wcm_jobs_async_impl_async_move_config_provider_service(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(56), Some("job_topic_name_example".to_string()), Some(true)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderService") => {
            let result = core.run(client.com_adobe_cq_wcm_jobs_async_impl_async_page_move_config_provider_service(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(56), Some("job_topic_name_example".to_string()), Some(true)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeCqWcmLaunchesImplLaunchesEventHandler") => {
            let result = core.run(client.com_adobe_cq_wcm_launches_impl_launches_event_handler(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("event_filter_example".to_string()), Some(56), Some("launches_eventhandler_threadpool_priority_example".to_string()), Some(true)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeCqWcmMobileQrcodeServletQRCodeImageGenerator") => {
            let result = core.run(client.com_adobe_cq_wcm_mobile_qrcode_servlet_qr_code_image_generator(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImpl") => {
            let result = core.run(client.com_adobe_cq_wcm_style_internal_component_style_info_cache_impl(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(56)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImpl") => {
            let result = core.run(client.com_adobe_cq_wcm_translation_impl_translation_platform_configuration_impl(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("sync_translation_state_scheduling_format_example".to_string()), Some("scheduling_repeat_translation_scheduling_format_example".to_string()), Some("sync_translation_state_lock_timeout_in_minutes_example".to_string()), Some("export_format_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigService") => {
            let result = core.run(client.com_adobe_fd_fp_config_forms_portal_draftsand_submission_config_service(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new()), Some("draft_data_service_example".to_string()), Some("draft_metadata_service_example".to_string()), Some("submit_data_service_example".to_string()), Some("submit_metadata_service_example".to_string()), Some("pending_sign_data_service_example".to_string()), Some("pending_sign_metadata_service_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeFdFpConfigFormsPortalSchedulerService") => {
            let result = core.run(client.com_adobe_fd_fp_config_forms_portal_scheduler_service(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("formportal_interval_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeFormsCommonServiceImplDefaultDataProvider") => {
            let result = core.run(client.com_adobe_forms_common_service_impl_default_data_provider(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImp") => {
            let result = core.run(client.com_adobe_forms_common_service_impl_forms_common_configuration_service_imp(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("temp_storage_config_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeFormsCommonServletTempCleanUpTask") => {
            let result = core.run(client.com_adobe_forms_common_servlet_temp_clean_up_task(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("scheduler_expression_example".to_string()), Some("duration_for_temporary_storage_example".to_string()), Some("duration_for_anonymous_storage_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeGraniteAcpPlatformPlatformServlet") => {
            let result = core.run(client.com_adobe_granite_acp_platform_platform_servlet(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(56), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeGraniteActivitystreamsImplActivityManagerImpl") => {
            let result = core.run(client.com_adobe_granite_activitystreams_impl_activity_manager_impl(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new()), Some(true)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeGraniteAnalyzerBaseSystemStatusServlet") => {
            let result = core.run(client.com_adobe_granite_analyzer_base_system_status_servlet(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(true)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServlet") => {
            let result = core.run(client.com_adobe_granite_analyzer_scripts_compile_all_scripts_compiler_servlet(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(true)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeGraniteApicontrollerFilterResolverHookFactory") => {
            let result = core.run(client.com_adobe_granite_apicontroller_filter_resolver_hook_factory(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("com_adobe_cq_cdn_cdn_rewriter_example".to_string()), Some("com_adobe_cq_cloud_config_components_example".to_string()), Some("com_adobe_cq_cloud_config_core_example".to_string()), Some("com_adobe_cq_cloud_config_ui_example".to_string()), Some("com_adobe_cq_com_adobe_cq_editor_example".to_string()), Some("com_adobe_cq_com_adobe_cq_projects_core_example".to_string()), Some("com_adobe_cq_com_adobe_cq_projects_wcm_core_example".to_string()), Some("com_adobe_cq_com_adobe_cq_ui_commons_example".to_string()), Some("com_adobe_cq_com_adobe_cq_wcm_style_example".to_string()), Some("com_adobe_cq_cq_activitymap_integration_example".to_string()), Some("com_adobe_cq_cq_contexthub_commons_example".to_string()), Some("com_adobe_cq_cq_dtm_example".to_string()), Some("com_adobe_cq_cq_healthcheck_example".to_string()), Some("com_adobe_cq_cq_multisite_targeting_example".to_string()), Some("com_adobe_cq_cq_pre_upgrade_cleanup_example".to_string()), Some("com_adobe_cq_cq_product_info_provider_example".to_string()), Some("com_adobe_cq_cq_rest_sites_example".to_string()), Some("com_adobe_cq_cq_security_hc_example".to_string()), Some("com_adobe_cq_dam_cq_dam_svg_handler_example".to_string()), Some("com_adobe_cq_dam_cq_scene7_imaging_example".to_string()), Some("com_adobe_cq_dtm_reactor_core_example".to_string()), Some("com_adobe_cq_dtm_reactor_ui_example".to_string()), Some("com_adobe_cq_exp_jspel_resolver_example".to_string()), Some("com_adobe_cq_inbox_cq_inbox_example".to_string()), Some("com_adobe_cq_json_schema_parser_example".to_string()), Some("com_adobe_cq_media_cq_media_publishing_dps_fp_core_example".to_string()), Some("com_adobe_cq_mobile_cq_mobile_caas_example".to_string()), Some("com_adobe_cq_mobile_cq_mobile_index_builder_example".to_string()), Some("com_adobe_cq_mobile_cq_mobile_phonegap_build_example".to_string()), Some("com_adobe_cq_myspell_example".to_string()), Some("com_adobe_cq_sample_we_retail_core_example".to_string()), Some("com_adobe_cq_screens_com_adobe_cq_screens_dcc_example".to_string()), Some("com_adobe_cq_screens_com_adobe_cq_screens_mq_core_example".to_string()), Some("com_adobe_cq_social_cq_social_as_provider_example".to_string()), Some("com_adobe_cq_social_cq_social_badging_basic_impl_example".to_string()), Some("com_adobe_cq_social_cq_social_badging_impl_example".to_string()), Some("com_adobe_cq_social_cq_social_calendar_impl_example".to_string()), Some("com_adobe_cq_social_cq_social_content_fragments_impl_example".to_string()), Some("com_adobe_cq_social_cq_social_enablement_impl_example".to_string()), Some("com_adobe_cq_social_cq_social_graph_impl_example".to_string()), Some("com_adobe_cq_social_cq_social_ideation_impl_example".to_string()), Some("com_adobe_cq_social_cq_social_jcr_provider_example".to_string()), Some("com_adobe_cq_social_cq_social_members_impl_example".to_string()), Some("com_adobe_cq_social_cq_social_ms_provider_example".to_string()), Some("com_adobe_cq_social_cq_social_notifications_channels_web_example".to_string()), Some("com_adobe_cq_social_cq_social_notifications_impl_example".to_string()), Some("com_adobe_cq_social_cq_social_rdb_provider_example".to_string()), Some("com_adobe_cq_social_cq_social_scf_impl_example".to_string()), Some("com_adobe_cq_social_cq_social_scoring_basic_impl_example".to_string()), Some("com_adobe_cq_social_cq_social_scoring_impl_example".to_string()), Some("com_adobe_cq_social_cq_social_serviceusers_impl_example".to_string()), Some("com_adobe_cq_social_cq_social_srp_impl_example".to_string()), Some("com_adobe_cq_social_cq_social_ugcbase_impl_example".to_string()), Some("com_adobe_dam_cq_dam_cfm_impl_example".to_string()), Some("com_adobe_forms_foundation_forms_foundation_base_example".to_string()), Some("com_adobe_granite_apicontroller_example".to_string()), Some("com_adobe_granite_asset_core_example".to_string()), Some("com_adobe_granite_auth_sso_example".to_string()), Some("com_adobe_granite_bundles_hc_impl_example".to_string()), Some("com_adobe_granite_compat_router_example".to_string()), Some("com_adobe_granite_conf_example".to_string()), Some("com_adobe_granite_conf_ui_core_example".to_string()), Some("com_adobe_granite_cors_example".to_string()), Some("com_adobe_granite_crx_explorer_example".to_string()), Some("com_adobe_granite_crxde_lite_example".to_string()), Some("com_adobe_granite_crypto_config_example".to_string()), Some("com_adobe_granite_crypto_extension_example".to_string()), Some("com_adobe_granite_crypto_file_example".to_string()), Some("com_adobe_granite_crypto_jcr_example".to_string()), Some("com_adobe_granite_csrf_example".to_string()), Some("com_adobe_granite_distribution_core_example".to_string()), Some("com_adobe_granite_dropwizard_metrics_example".to_string()), Some("com_adobe_granite_frags_impl_example".to_string()), Some("com_adobe_granite_gibson_example".to_string()), Some("com_adobe_granite_infocollector_example".to_string()), Some("com_adobe_granite_installer_factory_packages_example".to_string()), Some("com_adobe_granite_jetty_ssl_example".to_string()), Some("com_adobe_granite_jobs_async_example".to_string()), Some("com_adobe_granite_maintenance_oak_example".to_string()), Some("com_adobe_granite_monitoring_core_example".to_string()), Some("com_adobe_granite_queries_example".to_string()), Some("com_adobe_granite_replication_hc_impl_example".to_string()), Some("com_adobe_granite_repository_checker_example".to_string()), Some("com_adobe_granite_repository_hc_impl_example".to_string()), Some("com_adobe_granite_rest_assets_example".to_string()), Some("com_adobe_granite_security_ui_example".to_string()), Some("com_adobe_granite_startup_example".to_string()), Some("com_adobe_granite_tagsoup_example".to_string()), Some("com_adobe_granite_taskmanagement_core_example".to_string()), Some("com_adobe_granite_taskmanagement_workflow_example".to_string()), Some("com_adobe_granite_ui_clientlibs_compiler_less_example".to_string()), Some("com_adobe_granite_ui_clientlibs_processor_gcc_example".to_string()), Some("com_adobe_granite_webconsole_plugins_example".to_string()), Some("com_adobe_granite_workflow_console_example".to_string()), Some("com_adobe_xmp_worker_files_native_fragment_linux_example".to_string()), Some("com_adobe_xmp_worker_files_native_fragment_macosx_example".to_string()), Some("com_adobe_xmp_worker_files_native_fragment_win_example".to_string()), Some("com_day_commons_osgi_wrapper_simple_jndi_example".to_string()), Some("com_day_cq_cq_authhandler_example".to_string()), Some("com_day_cq_cq_compat_configupdate_example".to_string()), Some("com_day_cq_cq_licensebranding_example".to_string()), Some("com_day_cq_cq_notifcation_impl_example".to_string()), Some("com_day_cq_cq_replication_audit_example".to_string()), Some("com_day_cq_cq_search_ext_example".to_string()), Some("com_day_cq_dam_cq_dam_annotation_print_example".to_string()), Some("com_day_cq_dam_cq_dam_asset_usage_example".to_string()), Some("com_day_cq_dam_cq_dam_s7dam_example".to_string()), Some("com_day_cq_dam_cq_dam_similaritysearch_example".to_string()), Some("com_day_cq_dam_dam_webdav_support_example".to_string()), Some("com_day_cq_pre_upgrade_tasks_example".to_string()), Some("com_day_cq_replication_extensions_example".to_string()), Some("com_day_cq_wcm_cq_msm_core_example".to_string()), Some("com_day_cq_wcm_cq_wcm_translation_example".to_string()), Some("day_commons_jrawio_example".to_string()), Some("org_apache_aries_jmx_whiteboard_example".to_string()), Some("org_apache_felix_http_sslfilter_example".to_string()), Some("org_apache_felix_org_apache_felix_threaddump_example".to_string()), Some("org_apache_felix_webconsole_plugins_ds_example".to_string()), Some("org_apache_felix_webconsole_plugins_event_example".to_string()), Some("org_apache_felix_webconsole_plugins_memoryusage_example".to_string()), Some("org_apache_felix_webconsole_plugins_packageadmin_example".to_string()), Some("org_apache_jackrabbit_oak_auth_ldap_example".to_string()), Some("org_apache_jackrabbit_oak_segment_tar_example".to_string()), Some("org_apache_jackrabbit_oak_solr_osgi_example".to_string()), Some("org_apache_sling_bundleresource_impl_example".to_string()), Some("org_apache_sling_commons_fsclassloader_example".to_string()), Some("org_apache_sling_commons_log_webconsole_example".to_string()), Some("org_apache_sling_datasource_example".to_string()), Some("org_apache_sling_discovery_base_example".to_string()), Some("org_apache_sling_discovery_oak_example".to_string()), Some("org_apache_sling_discovery_support_example".to_string()), Some("org_apache_sling_distribution_api_example".to_string()), Some("org_apache_sling_distribution_core_example".to_string()), Some("org_apache_sling_extensions_webconsolesecurityprovider_example".to_string()), Some("org_apache_sling_hc_webconsole_example".to_string()), Some("org_apache_sling_installer_console_example".to_string()), Some("org_apache_sling_installer_provider_file_example".to_string()), Some("org_apache_sling_installer_provider_jcr_example".to_string()), Some("org_apache_sling_jcr_davex_example".to_string()), Some("org_apache_sling_jcr_resourcesecurity_example".to_string()), Some("org_apache_sling_jmx_provider_example".to_string()), Some("org_apache_sling_launchpad_installer_example".to_string()), Some("org_apache_sling_models_impl_example".to_string()), Some("org_apache_sling_repoinit_parser_example".to_string()), Some("org_apache_sling_resource_inventory_example".to_string()), Some("org_apache_sling_resourceresolver_example".to_string()), Some("org_apache_sling_scripting_javascript_example".to_string()), Some("org_apache_sling_scripting_jst_example".to_string()), Some("org_apache_sling_scripting_sightly_js_provider_example".to_string()), Some("org_apache_sling_scripting_sightly_models_provider_example".to_string()), Some("org_apache_sling_security_example".to_string()), Some("org_apache_sling_servlets_compat_example".to_string()), Some("org_apache_sling_servlets_get_example".to_string()), Some("org_apache_sling_startupfilter_disabler_example".to_string()), Some("org_apache_sling_tracer_example".to_string()), Some("we_retail_client_app_core_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeGraniteAuthCertImplClientCertAuthHandler") => {
            let result = core.run(client.com_adobe_granite_auth_cert_impl_client_cert_auth_handler(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("path_example".to_string()), Some(56)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeGraniteAuthIms") => {
            let result = core.run(client.com_adobe_granite_auth_ims(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("configid_example".to_string()), Some("scope_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtension") => {
            let result = core.run(client.com_adobe_granite_auth_ims_impl_external_user_id_mapping_provider_extension(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("oauth_provider_id_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImpl") => {
            let result = core.run(client.com_adobe_granite_auth_ims_impl_ims_access_token_request_customizer_impl(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("auth_ims_client_secret_example".to_string()), Some("customizer_type_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidator") => {
            let result = core.run(client.com_adobe_granite_auth_ims_impl_ims_instance_credentials_validator(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("oauth_provider_id_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeGraniteAuthImsImplIMSProviderImpl") => {
            let result = core.run(client.com_adobe_granite_auth_ims_impl_ims_provider_impl(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("oauth_provider_id_example".to_string()), Some("oauth_provider_ims_authorization_url_example".to_string()), Some("oauth_provider_ims_token_url_example".to_string()), Some("oauth_provider_ims_profile_url_example".to_string()), Some(&Vec::new()), Some("oauth_provider_ims_validate_token_url_example".to_string()), Some("oauth_provider_ims_session_property_example".to_string()), Some("oauth_provider_ims_service_token_client_id_example".to_string()), Some("oauth_provider_ims_service_token_client_secret_example".to_string()), Some("oauth_provider_ims_service_token_example".to_string()), Some("ims_org_ref_example".to_string()), Some(&Vec::new()), Some(true)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeGraniteAuthImsImplImsConfigProviderImpl") => {
            let result = core.run(client.com_adobe_granite_auth_ims_impl_ims_config_provider_impl(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("oauth_configmanager_ims_configid_example".to_string()), Some("ims_owning_entity_example".to_string()), Some("aem_instance_id_example".to_string()), Some("ims_service_code_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeGraniteAuthOauthAccesstokenProvider") => {
            let result = core.run(client.com_adobe_granite_auth_oauth_accesstoken_provider(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("name_example".to_string()), Some("auth_token_provider_title_example".to_string()), Some(&Vec::new()), Some("auth_token_provider_endpoint_example".to_string()), Some("auth_access_token_request_example".to_string()), Some("auth_token_provider_keypair_alias_example".to_string()), Some(56), Some(56), Some("auth_token_provider_client_id_example".to_string()), Some("auth_token_provider_scope_example".to_string()), Some(true), Some(true), Some("token_request_customizer_type_example".to_string()), Some("auth_token_validator_type_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeGraniteAuthOauthImplBearerAuthenticationHandler") => {
            let result = core.run(client.com_adobe_granite_auth_oauth_impl_bearer_authentication_handler(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("path_example".to_string()), Some(&Vec::new()), Some(true), Some("auth_token_request_parameter_example".to_string()), Some("oauth_bearer_configid_example".to_string()), Some(true)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImpl") => {
            let result = core.run(client.com_adobe_granite_auth_oauth_impl_default_token_validator_impl(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("auth_token_validator_type_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeGraniteAuthOauthImplFacebookProviderImpl") => {
            let result = core.run(client.com_adobe_granite_auth_oauth_impl_facebook_provider_impl(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("oauth_provider_id_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeGraniteAuthOauthImplGithubProviderImpl") => {
            let result = core.run(client.com_adobe_granite_auth_oauth_impl_github_provider_impl(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("oauth_provider_id_example".to_string()), Some("oauth_provider_github_authorization_url_example".to_string()), Some("oauth_provider_github_token_url_example".to_string()), Some("oauth_provider_github_profile_url_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeGraniteAuthOauthImplGraniteProvider") => {
            let result = core.run(client.com_adobe_granite_auth_oauth_impl_granite_provider(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("oauth_provider_id_example".to_string()), Some("oauth_provider_granite_authorization_url_example".to_string()), Some("oauth_provider_granite_token_url_example".to_string()), Some("oauth_provider_granite_profile_url_example".to_string()), Some("oauth_provider_granite_extended_details_urls_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeGraniteAuthOauthImplHelperProviderConfigManager") => {
            let result = core.run(client.com_adobe_granite_auth_oauth_impl_helper_provider_config_manager(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("oauth_cookie_login_timeout_example".to_string()), Some("oauth_cookie_max_age_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternal") => {
            let result = core.run(client.com_adobe_granite_auth_oauth_impl_helper_provider_config_manager_internal(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("oauth_cookie_login_timeout_example".to_string()), Some("oauth_cookie_max_age_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandler") => {
            let result = core.run(client.com_adobe_granite_auth_oauth_impl_o_auth_authentication_handler(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("path_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeGraniteAuthOauthImplTwitterProviderImpl") => {
            let result = core.run(client.com_adobe_granite_auth_oauth_impl_twitter_provider_impl(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("oauth_provider_id_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeGraniteAuthOauthProvider") => {
            let result = core.run(client.com_adobe_granite_auth_oauth_provider(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("oauth_config_id_example".to_string()), Some("oauth_client_id_example".to_string()), Some("oauth_client_secret_example".to_string()), Some(&Vec::new()), Some("oauth_config_provider_id_example".to_string()), Some(true), Some("oauth_userid_property_example".to_string()), Some(true), Some(true), Some(true), Some("oauth_call_back_url_example".to_string()), Some(true), Some(true), Some(true), Some(true), Some(true)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeGraniteAuthRequirementImplDefaultRequirementHandler") => {
            let result = core.run(client.com_adobe_granite_auth_requirement_impl_default_requirement_handler(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeGraniteAuthSamlSamlAuthenticationHandler") => {
            let result = core.run(client.com_adobe_granite_auth_saml_saml_authentication_handler(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new()), Some(56), Some("idp_url_example".to_string()), Some("idp_cert_alias_example".to_string()), Some(true), Some("service_provider_entity_id_example".to_string()), Some("assertion_consumer_service_url_example".to_string()), Some("sp_private_key_alias_example".to_string()), Some("key_store_password_example".to_string()), Some("default_redirect_url_example".to_string()), Some("user_id_attribute_example".to_string()), Some(true), Some(true), Some("user_intermediate_path_example".to_string()), Some(true), Some("group_membership_attribute_example".to_string()), Some(&Vec::new()), Some("name_id_format_example".to_string()), Some(&Vec::new()), Some(true), Some("logout_url_example".to_string()), Some(56), Some("digest_method_example".to_string()), Some("signature_method_example".to_string()), Some("identity_sync_type_example".to_string()), Some("idp_identifier_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeGraniteAuthSsoImplSsoAuthenticationHandler") => {
            let result = core.run(client.com_adobe_granite_auth_sso_impl_sso_authentication_handler(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("path_example".to_string()), Some(56), Some("jaas_control_flag_example".to_string()), Some("jaas_realm_name_example".to_string()), Some(56), Some(&Vec::new()), Some(&Vec::new()), Some(&Vec::new()), Some(&Vec::new()), Some("format_example".to_string()), Some("trusted_credentials_attribute_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeGraniteBundlesHcImplCodeCacheHealthCheck") => {
            let result = core.run(client.com_adobe_granite_bundles_hc_impl_code_cache_health_check(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new()), Some(56)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheck") => {
            let result = core.run(client.com_adobe_granite_bundles_hc_impl_crxde_support_bundle_health_check(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeGraniteBundlesHcImplDavExBundleHealthCheck") => {
            let result = core.run(client.com_adobe_granite_bundles_hc_impl_dav_ex_bundle_health_check(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheck") => {
            let result = core.run(client.com_adobe_granite_bundles_hc_impl_inactive_bundles_health_check(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new()), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeGraniteBundlesHcImplJobsHealthCheck") => {
            let result = core.run(client.com_adobe_granite_bundles_hc_impl_jobs_health_check(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new()), Some(56)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeGraniteBundlesHcImplSlingGetServletHealthCheck") => {
            let result = core.run(client.com_adobe_granite_bundles_hc_impl_sling_get_servlet_health_check(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheck") => {
            let result = core.run(client.com_adobe_granite_bundles_hc_impl_sling_java_script_handler_health_check(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheck") => {
            let result = core.run(client.com_adobe_granite_bundles_hc_impl_sling_jsp_script_handler_health_check(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheck") => {
            let result = core.run(client.com_adobe_granite_bundles_hc_impl_sling_referrer_filter_health_check(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheck") => {
            let result = core.run(client.com_adobe_granite_bundles_hc_impl_web_dav_bundle_health_check(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFac") => {
            let result = core.run(client.com_adobe_granite_comments_internal_comment_replication_content_filter_fac(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImpl") => {
            let result = core.run(client.com_adobe_granite_compatrouter_impl_compat_switching_service_impl(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new()), Some(true)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeGraniteCompatrouterImplRoutingConfig") => {
            let result = core.run(client.com_adobe_granite_compatrouter_impl_routing_config(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("id_example".to_string()), Some("compat_path_example".to_string()), Some("new_path_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeGraniteCompatrouterImplSwitchMappingConfig") => {
            let result = core.run(client.com_adobe_granite_compatrouter_impl_switch_mapping_config(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("group_example".to_string()), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolving") => {
            let result = core.run(client.com_adobe_granite_conf_impl_runtime_aware_configuration_resource_resolving(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(true), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeGraniteContexthubImplContextHubImpl") => {
            let result = core.run(client.com_adobe_granite_contexthub_impl_context_hub_impl(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(true), Some(true)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeGraniteCorsImplCORSPolicyImpl") => {
            let result = core.run(client.com_adobe_granite_cors_impl_cors_policy_impl(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new()), Some(&Vec::new()), Some(&Vec::new()), Some(&Vec::new()), Some(56), Some(&Vec::new()), Some(&Vec::new()), Some(true)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeGraniteCsrfImplCSRFFilter") => {
            let result = core.run(client.com_adobe_granite_csrf_impl_csrf_filter(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new()), Some(true), Some(&Vec::new()), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeGraniteCsrfImplCSRFServlet") => {
            let result = core.run(client.com_adobe_granite_csrf_impl_csrf_servlet(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(56), Some("sling_auth_requirements_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSe") => {
            let result = core.run(client.com_adobe_granite_distribution_core_impl_crypto_distribution_transport_se(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("name_example".to_string()), Some("username_example".to_string()), Some("encrypted_password_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserver") => {
            let result = core.run(client.com_adobe_granite_distribution_core_impl_diff_diff_changes_observer(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(true), Some("agent_name_example".to_string()), Some("diff_path_example".to_string()), Some("observed_path_example".to_string()), Some("service_name_example".to_string()), Some("property_names_example".to_string()), Some(56), Some("service_user_target_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeGraniteDistributionCoreImplDiffDiffEventListener") => {
            let result = core.run(client.com_adobe_granite_distribution_core_impl_diff_diff_event_listener(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("diff_path_example".to_string()), Some("service_name_example".to_string()), Some("service_user_target_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeGraniteDistributionCoreImplDistributionToReplicationEven") => {
            let result = core.run(client.com_adobe_granite_distribution_core_impl_distribution_to_replication_even(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicat") => {
            let result = core.run(client.com_adobe_granite_distribution_core_impl_replication_adapters_replicat(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("provider_name_example".to_string()), Some(true)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeGraniteDistributionCoreImplReplicationDistributionTrans") => {
            let result = core.run(client.com_adobe_granite_distribution_core_impl_replication_distribution_trans(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(true)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribu") => {
            let result = core.run(client.com_adobe_granite_distribution_core_impl_transport_access_token_distribu(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("name_example".to_string()), Some("service_name_example".to_string()), Some("user_id_example".to_string()), Some("access_token_provider_target_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeGraniteFragsImplCheckHttpHeaderFlag") => {
            let result = core.run(client.com_adobe_granite_frags_impl_check_http_header_flag(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("feature_name_example".to_string()), Some("feature_description_example".to_string()), Some("http_header_name_example".to_string()), Some("http_header_valuepattern_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeGraniteFragsImplRandomFeature") => {
            let result = core.run(client.com_adobe_granite_frags_impl_random_feature(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("feature_name_example".to_string()), Some("feature_description_example".to_string()), Some("active_percentage_example".to_string()), Some("cookie_name_example".to_string()), Some(56)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeGraniteHttpcacheFileFileCacheStore") => {
            let result = core.run(client.com_adobe_granite_httpcache_file_file_cache_store(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("com_adobe_granite_httpcache_file_document_root_example".to_string()), Some("com_adobe_granite_httpcache_file_include_host_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeGraniteHttpcacheImplOuterCacheFilter") => {
            let result = core.run(client.com_adobe_granite_httpcache_impl_outer_cache_filter(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeGraniteI18nImplBundlePseudoTranslations") => {
            let result = core.run(client.com_adobe_granite_i18n_impl_bundle_pseudo_translations(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeGraniteI18nImplPreferencesLocaleResolverService") => {
            let result = core.run(client.com_adobe_granite_i18n_impl_preferences_locale_resolver_service(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("security_preferences_name_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeGraniteInfocollectorInfoCollector") => {
            let result = core.run(client.com_adobe_granite_infocollector_info_collector(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(true), Some(true)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeGraniteJettySslInternalGraniteSslConnectorFactory") => {
            let result = core.run(client.com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_factory(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(56), Some("com_adobe_granite_jetty_ssl_keystore_user_example".to_string()), Some("com_adobe_granite_jetty_ssl_keystore_password_example".to_string()), Some(&Vec::new()), Some(&Vec::new()), Some("com_adobe_granite_jetty_ssl_client_certificate_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeGraniteLicenseImplLicenseCheckFilter") => {
            let result = core.run(client.com_adobe_granite_license_impl_license_check_filter(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(56), Some(&Vec::new()), Some(true)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeGraniteLoggingImplLogAnalyserImpl") => {
            let result = core.run(client.com_adobe_granite_logging_impl_log_analyser_impl(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(56), Some(&Vec::new()), Some(56)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeGraniteLoggingImplLogErrorHealthCheck") => {
            let result = core.run(client.com_adobe_granite_logging_impl_log_error_health_check(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTask") => {
            let result = core.run(client.com_adobe_granite_maintenance_crx_impl_data_store_garbage_collection_task(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(true), Some("job_topics_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTask") => {
            let result = core.run(client.com_adobe_granite_maintenance_crx_impl_lucene_binaries_cleanup_task(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("job_topics_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTask") => {
            let result = core.run(client.com_adobe_granite_maintenance_crx_impl_revision_cleanup_task(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeGraniteMonitoringImplScriptConfigImpl") => {
            let result = core.run(client.com_adobe_granite_monitoring_impl_script_config_impl(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("script_filename_example".to_string()), Some("script_display_example".to_string()), Some("script_path_example".to_string()), Some(&Vec::new()), Some(56), Some("jmxdomain_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHan") => {
            let result = core.run(client.com_adobe_granite_oauth_server_auth_impl_o_auth2_server_authentication_han(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("path_example".to_string()), Some("jaas_control_flag_example".to_string()), Some("jaas_realm_name_example".to_string()), Some(56), Some(true)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeGraniteOauthServerImplAccessTokenCleanupTask") => {
            let result = core.run(client.com_adobe_granite_oauth_server_impl_access_token_cleanup_task(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("scheduler_expression_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServlet") => {
            let result = core.run(client.com_adobe_granite_oauth_server_impl_o_auth2_client_revocation_servlet(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(true)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServlet") => {
            let result = core.run(client.com_adobe_granite_oauth_server_impl_o_auth2_revocation_endpoint_servlet(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("sling_servlet_paths_example".to_string()), Some(true)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServlet") => {
            let result = core.run(client.com_adobe_granite_oauth_server_impl_o_auth2_token_endpoint_servlet(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("oauth_issuer_example".to_string()), Some("oauth_access_token_expires_in_example".to_string()), Some("osgi_http_whiteboard_servlet_pattern_example".to_string()), Some("osgi_http_whiteboard_context_select_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServlet") => {
            let result = core.run(client.com_adobe_granite_oauth_server_impl_o_auth2_token_revocation_servlet(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(true)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeGraniteOffloadingImplOffloadingConfigurator") => {
            let result = core.run(client.com_adobe_granite_offloading_impl_offloading_configurator(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("offloading_transporter_example".to_string()), Some(true)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeGraniteOffloadingImplOffloadingJobCloner") => {
            let result = core.run(client.com_adobe_granite_offloading_impl_offloading_job_cloner(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(true)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeGraniteOffloadingImplOffloadingJobOffloader") => {
            let result = core.run(client.com_adobe_granite_offloading_impl_offloading_job_offloader(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(true)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManager") => {
            let result = core.run(client.com_adobe_granite_offloading_impl_transporter_offloading_agent_manager(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(true)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspo") => {
            let result = core.run(client.com_adobe_granite_offloading_impl_transporter_offloading_default_transpo(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("default_transport_agent_to_worker_prefix_example".to_string()), Some("default_transport_agent_to_master_prefix_example".to_string()), Some("default_transport_input_package_example".to_string()), Some("default_transport_output_package_example".to_string()), Some(true), Some(true), Some(true)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImpl") => {
            let result = core.run(client.com_adobe_granite_omnisearch_impl_core_omni_search_service_impl(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(56), Some(true)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeGraniteOptoutImplOptOutServiceImpl") => {
            let result = core.run(client.com_adobe_granite_optout_impl_opt_out_service_impl(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new()), Some(&Vec::new()), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheck") => {
            let result = core.run(client.com_adobe_granite_queries_impl_hc_async_index_health_check(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(56), Some(56), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeGraniteQueriesImplHcLargeIndexHealthCheck") => {
            let result = core.run(client.com_adobe_granite_queries_impl_hc_large_index_health_check(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(56), Some(56), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheck") => {
            let result = core.run(client.com_adobe_granite_queries_impl_hc_queries_status_health_check(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeGraniteQueriesImplHcQueryHealthCheckMetrics") => {
            let result = core.run(client.com_adobe_granite_queries_impl_hc_query_health_check_metrics(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(56)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheck") => {
            let result = core.run(client.com_adobe_granite_queries_impl_hc_query_limits_health_check(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheck") => {
            let result = core.run(client.com_adobe_granite_replication_hc_impl_replication_queue_health_check(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(56), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthC") => {
            let result = core.run(client.com_adobe_granite_replication_hc_impl_replication_transport_users_health_c(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheck") => {
            let result = core.run(client.com_adobe_granite_repository_hc_impl_authorizable_node_name_health_check(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthC") => {
            let result = core.run(client.com_adobe_granite_repository_hc_impl_content_sling_sling_content_health_c(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new()), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeGraniteRepositoryHcImplContinuousRGCHealthCheck") => {
            let result = core.run(client.com_adobe_granite_repository_hc_impl_continuous_rgc_health_check(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthChe") => {
            let result = core.run(client.com_adobe_granite_repository_hc_impl_default_access_user_profile_health_che(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheck") => {
            let result = core.run(client.com_adobe_granite_repository_hc_impl_default_logins_health_check(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new()), Some(&Vec::new()), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheck") => {
            let result = core.run(client.com_adobe_granite_repository_hc_impl_disk_space_health_check(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new()), Some(56), Some(56)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheck") => {
            let result = core.run(client.com_adobe_granite_repository_hc_impl_observation_queue_length_health_check(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeGraniteRepositoryImplCommitStatsConfig") => {
            let result = core.run(client.com_adobe_granite_repository_impl_commit_stats_config(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(true), Some(56), Some(56), Some(56), Some(56), Some(56), Some(&Vec::new()), Some(56), Some("greedy_stack_matchers_example".to_string()), Some(&Vec::new()), Some(&Vec::new()), Some(&Vec::new()), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeGraniteRepositoryServiceUserConfiguration") => {
            let result = core.run(client.com_adobe_granite_repository_service_user_configuration(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(56), Some(true), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckIm") => {
            let result = core.run(client.com_adobe_granite_requests_logging_impl_hc_requests_status_health_check_im(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeGraniteResourcestatusImplCompositeStatusType") => {
            let result = core.run(client.com_adobe_granite_resourcestatus_impl_composite_status_type(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("name_example".to_string()), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeGraniteResourcestatusImplStatusResourceProviderImpl") => {
            let result = core.run(client.com_adobe_granite_resourcestatus_impl_status_resource_provider_impl(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("provider_root_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeGraniteRestAssetsImplAssetContentDispositionFilter") => {
            let result = core.run(client.com_adobe_granite_rest_assets_impl_asset_content_disposition_filter(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(true), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImpl") => {
            let result = core.run(client.com_adobe_granite_rest_impl_api_endpoint_resource_provider_factory_impl(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("provider_roots_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeGraniteRestImplServletDefaultGETServlet") => {
            let result = core.run(client.com_adobe_granite_rest_impl_servlet_default_get_servlet(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(56), Some(true)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationS") => {
            let result = core.run(client.com_adobe_granite_security_user_ui_internal_servlets_ssl_configuration_s(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeGraniteSecurityUserUserPropertiesService") => {
            let result = core.run(client.com_adobe_granite_security_user_user_properties_service(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("adapter_condition_example".to_string()), Some(&Vec::new()), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeGraniteSocialgraphImplSocialGraphFactoryImpl") => {
            let result = core.run(client.com_adobe_granite_socialgraph_impl_social_graph_factory_impl(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("group2member_relationship_outgoing_example".to_string()), Some(&Vec::new()), Some("group2member_relationship_incoming_example".to_string()), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImpl") => {
            let result = core.run(client.com_adobe_granite_system_monitoring_impl_system_stats_m_bean_impl(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("scheduler_expression_example".to_string()), Some("jmx_objectname_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactory") => {
            let result = core.run(client.com_adobe_granite_taskmanagement_impl_jcr_task_adapter_factory(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("adapter_condition_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeGraniteTaskmanagementImplJcrTaskArchiveService") => {
            let result = core.run(client.com_adobe_granite_taskmanagement_impl_jcr_task_archive_service(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(true), Some("scheduler_expression_example".to_string()), Some(56)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTask") => {
            let result = core.run(client.com_adobe_granite_taskmanagement_impl_purge_task_purge_maintenance_task(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(true), Some(56), Some(true), Some(56), Some(56)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactor") => {
            let result = core.run(client.com_adobe_granite_taskmanagement_impl_service_task_manager_adapter_factor(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("adapter_condition_example".to_string()), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeGraniteThreaddumpThreadDumpCollector") => {
            let result = core.run(client.com_adobe_granite_threaddump_thread_dump_collector(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(56), Some("scheduler_run_on_example".to_string()), Some(true), Some(56), Some(true), Some(true), Some(true), Some(56), Some("granite_threaddump_backup_clean_trigger_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTransl") => {
            let result = core.run(client.com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("translation_factory_example".to_string()), Some("default_connector_label_example".to_string()), Some("default_connector_attribution_example".to_string()), Some("default_connector_workspace_id_example".to_string()), Some("default_connector_subscription_key_example".to_string()), Some("language_map_location_example".to_string()), Some("category_map_location_example".to_string()), Some(56), Some(56)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeGraniteTranslationCoreImplTranslationManagerImpl") => {
            let result = core.run(client.com_adobe_granite_translation_core_impl_translation_manager_impl(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("default_connector_name_example".to_string()), Some("default_category_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImpl") => {
            let result = core.run(client.com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(true), Some("htmllibmanager_debug_init_js_example".to_string()), Some(true), Some(true), Some(true), Some(56), Some(56), Some(true), Some("htmllibmanager_defaultthemename_example".to_string()), Some("htmllibmanager_defaultuserthemename_example".to_string()), Some("htmllibmanager_clientmanager_example".to_string()), Some(&Vec::new()), Some(&Vec::new()), Some(&Vec::new()), Some(&Vec::new()), Some(&Vec::new()), Some("htmllibmanager_longcache_format_example".to_string()), Some(true), Some("htmllibmanager_file_system_output_cache_location_example".to_string()), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeature") => {
            let result = core.run(client.com_adobe_granite_workflow_console_frags_workflow_withdraw_feature(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(true)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventService") => {
            let result = core.run(client.com_adobe_granite_workflow_console_publish_workflow_publish_event_service(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(true)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManager") => {
            let result = core.run(client.com_adobe_granite_workflow_core_jcr_workflow_bucket_manager(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(56)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandler") => {
            let result = core.run(client.com_adobe_granite_workflow_core_job_external_process_job_handler(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(56), Some(56), Some(56)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeGraniteWorkflowCoreJobJobHandler") => {
            let result = core.run(client.com_adobe_granite_workflow_core_job_job_handler(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new()), Some(true)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsum") => {
            let result = core.run(client.com_adobe_granite_workflow_core_offloading_workflow_offloading_job_consum(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("job_topics_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeGraniteWorkflowCorePayloadMapCache") => {
            let result = core.run(client.com_adobe_granite_workflow_core_payload_map_cache(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new()), Some("get_package_root_path_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListener") => {
            let result = core.run(client.com_adobe_granite_workflow_core_payloadmap_payload_move_listener(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new()), Some(true)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeGraniteWorkflowCoreWorkflowConfig") => {
            let result = core.run(client.com_adobe_granite_workflow_core_workflow_config(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new()), Some(true), Some(true)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeGraniteWorkflowCoreWorkflowSessionFactory") => {
            let result = core.run(client.com_adobe_granite_workflow_core_workflow_session_factory(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("granite_workflowinbox_sort_property_name_example".to_string()), Some("granite_workflowinbox_sort_order_example".to_string()), Some(56), Some(&Vec::new()), Some(56), Some(true), Some(true), Some(true), Some(true), Some(56), Some(56)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeGraniteWorkflowPurgeScheduler") => {
            let result = core.run(client.com_adobe_granite_workflow_purge_scheduler(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("scheduledpurge_name_example".to_string()), Some("scheduledpurge_workflow_status_example".to_string()), Some(&Vec::new()), Some(56)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeOctopusNcommBootstrap") => {
            let result = core.run(client.com_adobe_octopus_ncomm_bootstrap(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(56), Some(56), Some(56), Some(56), Some(56)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullS") => {
            let result = core.run(client.com_adobe_social_integrations_livefyre_user_pingforpull_impl_ping_pull_s(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("communities_integration_livefyre_sling_event_filter_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComAdobeXmpWorkerFilesNcommXMPFilesNComm") => {
            let result = core.run(client.com_adobe_xmp_worker_files_ncomm_xmp_files_n_comm(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("max_connections_example".to_string()), Some("max_requests_example".to_string()), Some("request_timeout_example".to_string()), Some("log_dir_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCommonsDatasourceJdbcpoolJdbcPoolService") => {
            let result = core.run(client.com_day_commons_datasource_jdbcpool_jdbc_pool_service(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("jdbc_driver_class_example".to_string()), Some("jdbc_connection_uri_example".to_string()), Some("jdbc_username_example".to_string()), Some("jdbc_password_example".to_string()), Some("jdbc_validation_query_example".to_string()), Some(true), Some(true), Some(56), Some(56), Some("datasource_name_example".to_string()), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCommonsHttpclient") => {
            let result = core.run(client.com_day_commons_httpclient(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(true), Some("proxy_host_example".to_string()), Some("proxy_user_example".to_string()), Some("proxy_password_example".to_string()), Some("proxy_ntlm_host_example".to_string()), Some("proxy_ntlm_domain_example".to_string()), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqAnalyticsImplStorePropertiesChangeListener") => {
            let result = core.run(client.com_day_cq_analytics_impl_store_properties_change_listener(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporte") => {
            let result = core.run(client.com_day_cq_analytics_sitecatalyst_impl_exporter_classifications_exporte(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new()), Some(56)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqAnalyticsSitecatalystImplImporterReportImporter") => {
            let result = core.run(client.com_day_cq_analytics_sitecatalyst_impl_importer_report_importer(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(56), Some(56)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactory") => {
            let result = core.run(client.com_day_cq_analytics_sitecatalyst_impl_sitecatalyst_adapter_factory(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImpl") => {
            let result = core.run(client.com_day_cq_analytics_sitecatalyst_impl_sitecatalyst_http_client_impl(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new()), Some(&Vec::new()), Some(56), Some(56)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdater") => {
            let result = core.run(client.com_day_cq_analytics_testandtarget_impl_account_options_updater(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(true)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListener") => {
            let result = core.run(client.com_day_cq_analytics_testandtarget_impl_delete_author_activity_listener(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(true)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListener") => {
            let result = core.run(client.com_day_cq_analytics_testandtarget_impl_push_author_campaign_page_listener(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(true)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqAnalyticsTestandtargetImplSegmentImporter") => {
            let result = core.run(client.com_day_cq_analytics_testandtarget_impl_segment_importer(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(true)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqAnalyticsTestandtargetImplServiceWebServiceImpl") => {
            let result = core.run(client.com_day_cq_analytics_testandtarget_impl_service_web_service_impl(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("endpoint_uri_example".to_string()), Some(56), Some(56)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqAnalyticsTestandtargetImplServletsAdminServerServlet") => {
            let result = core.run(client.com_day_cq_analytics_testandtarget_impl_servlets_admin_server_servlet(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("testandtarget_endpoint_url_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImpl") => {
            let result = core.run(client.com_day_cq_analytics_testandtarget_impl_testandtarget_http_client_impl(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("cq_analytics_testandtarget_api_url_example".to_string()), Some(56), Some(56), Some("cq_analytics_testandtarget_recommendations_url_replace_example".to_string()), Some("cq_analytics_testandtarget_recommendations_url_replacewith_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqAuthImplCugCugSupportImpl") => {
            let result = core.run(client.com_day_cq_auth_impl_cug_cug_support_impl(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new()), Some(true), Some("cug_principals_regex_example".to_string()), Some("cug_principals_replacement_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqAuthImplLoginSelectorHandler") => {
            let result = core.run(client.com_day_cq_auth_impl_login_selector_handler(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("path_example".to_string()), Some(56), Some(&Vec::new()), Some(&Vec::new()), Some("auth_loginselector_defaultloginpage_example".to_string()), Some("auth_loginselector_defaultchangepwpage_example".to_string()), Some(&Vec::new()), Some(true)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqCommonsImplExternalizerImpl") => {
            let result = core.run(client.com_day_cq_commons_impl_externalizer_impl(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new()), Some("externalizer_host_example".to_string()), Some("externalizer_contextpath_example".to_string()), Some(true)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqCommonsServletsRootMappingServlet") => {
            let result = core.run(client.com_day_cq_commons_servlets_root_mapping_servlet(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("rootmapping_target_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionChecke") => {
            let result = core.run(client.com_day_cq_compat_codeupgrade_impl_code_upgrade_execution_condition_checke(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new()), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreList") => {
            let result = core.run(client.com_day_cq_compat_codeupgrade_impl_upgrade_task_ignore_list(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelist") => {
            let result = core.run(client.com_day_cq_compat_codeupgrade_impl_version_range_task_ignorelist(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("effective_bundle_list_path_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqContentsyncImplContentSyncManagerImpl") => {
            let result = core.run(client.com_day_cq_contentsync_impl_content_sync_manager_impl(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("contentsync_fallback_authorizable_example".to_string()), Some("contentsync_fallback_updateuser_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqDamCommonsHandlerStandardImageHandler") => {
            let result = core.run(client.com_day_cq_dam_commons_handler_standard_image_handler(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(56), Some(56), Some(true)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqDamCommonsMetadataXmpFilterBlackWhite") => {
            let result = core.run(client.com_day_cq_dam_commons_metadata_xmp_filter_black_white(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(true), Some(&Vec::new()), Some(true), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqDamCommonsUtilImplAssetCacheImpl") => {
            let result = core.run(client.com_day_cq_dam_commons_util_impl_asset_cache_impl(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(56), Some(true), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfig") => {
            let result = core.run(client.com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(56), Some(56), Some(56), Some(56), Some(56), Some("cq_dam_config_annotation_pdf_font_color_example".to_string()), Some("cq_dam_config_annotation_pdf_font_family_example".to_string()), Some("cq_dam_config_annotation_pdf_font_light_example".to_string()), Some(56), Some(56), Some(56), Some("cq_dam_config_annotation_pdf_review_status_color_approved_example".to_string()), Some("cq_dam_config_annotation_pdf_review_status_color_rejected_example".to_string()), Some("cq_dam_config_annotation_pdf_review_status_color_changes_requested_example".to_string()), Some(56), Some(56)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqDamCoreImplAssetMoveListener") => {
            let result = core.run(client.com_day_cq_dam_core_impl_asset_move_listener(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(true)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqDamCoreImplAssethomeAssetHomePageConfiguration") => {
            let result = core.run(client.com_day_cq_dam_core_impl_assethome_asset_home_page_configuration(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(true)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServlet") => {
            let result = core.run(client.com_day_cq_dam_core_impl_assetlinkshare_adhoc_asset_share_proxy_servlet(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(56)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqDamCoreImplCacheCQBufferedImageCache") => {
            let result = core.run(client.com_day_cq_dam_core_impl_cache_cq_buffered_image_cache(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(56), Some(56), Some("cq_dam_image_cache_max_dimension_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqDamCoreImplDamChangeEventListener") => {
            let result = core.run(client.com_day_cq_dam_core_impl_dam_change_event_listener(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqDamCoreImplDamEventPurgeService") => {
            let result = core.run(client.com_day_cq_dam_core_impl_dam_event_purge_service(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("scheduler_expression_example".to_string()), Some(56), Some(56), Some(true), Some("event_types_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqDamCoreImplDamEventRecorderImpl") => {
            let result = core.run(client.com_day_cq_dam_core_impl_dam_event_recorder_impl(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("event_filter_example".to_string()), Some(56), Some(true), Some(&Vec::new()), Some("eventrecorder_eventtypes_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqDamCoreImplEventDamEventAuditListener") => {
            let result = core.run(client.com_day_cq_dam_core_impl_event_dam_event_audit_listener(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("event_filter_example".to_string()), Some(true)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqDamCoreImplExpiryNotificationJobImpl") => {
            let result = core.run(client.com_day_cq_dam_core_impl_expiry_notification_job_impl(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(true), Some("cq_dam_expiry_notification_scheduler_timebased_rule_example".to_string()), Some(56), Some(true), Some(56), Some(56), Some("cq_dam_expiry_notification_url_protocol_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeat") => {
            let result = core.run(client.com_day_cq_dam_core_impl_foldermetadataschema_folder_metadata_schema_feat(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(true)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqDamCoreImplGfxCommonsGfxRenderer") => {
            let result = core.run(client.com_day_cq_dam_core_impl_gfx_commons_gfx_renderer(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(true)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqDamCoreImplHandlerEPSFormatHandler") => {
            let result = core.run(client.com_day_cq_dam_core_impl_handler_eps_format_handler(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("mimetype_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqDamCoreImplHandlerIndesignFormatHandler") => {
            let result = core.run(client.com_day_cq_dam_core_impl_handler_indesign_format_handler(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqDamCoreImplHandlerJpegHandler") => {
            let result = core.run(client.com_day_cq_dam_core_impl_handler_jpeg_handler(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(true), Some(56), Some(56)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqDamCoreImplHandlerXmpNCommXMPHandler") => {
            let result = core.run(client.com_day_cq_dam_core_impl_handler_xmp_n_comm_xmp_handler(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqDamCoreImplJmxAssetIndexUpdateMonitor") => {
            let result = core.run(client.com_day_cq_dam_core_impl_jmx_asset_index_update_monitor(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("jmx_objectname_example".to_string()), Some(true), Some("property_name_example".to_string()), Some(56), Some(1.2), Some(true), Some("fulltext_name_example".to_string()), Some(56), Some(1.2)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqDamCoreImplJmxAssetMigrationMBeanImpl") => {
            let result = core.run(client.com_day_cq_dam_core_impl_jmx_asset_migration_m_bean_impl(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("jmx_objectname_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqDamCoreImplJmxAssetUpdateMonitorImpl") => {
            let result = core.run(client.com_day_cq_dam_core_impl_jmx_asset_update_monitor_impl(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("jmx_objectname_example".to_string()), Some(true)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfig") => {
            let result = core.run(client.com_day_cq_dam_core_impl_jobs_metadataexport_async_metadata_export_config(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("operation_example".to_string()), Some(true)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfig") => {
            let result = core.run(client.com_day_cq_dam_core_impl_jobs_metadataimport_async_metadata_import_config(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("operation_example".to_string()), Some("operation_icon_example".to_string()), Some("topic_name_example".to_string()), Some(true)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqDamCoreImplLightboxLightboxServlet") => {
            let result = core.run(client.com_day_cq_dam_core_impl_lightbox_lightbox_servlet(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("sling_servlet_paths_example".to_string()), Some(&Vec::new()), Some(true)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqDamCoreImplMetadataEditorSelectComponentHandler") => {
            let result = core.run(client.com_day_cq_dam_core_impl_metadata_editor_select_component_handler(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelper") => {
            let result = core.run(client.com_day_cq_dam_core_impl_mime_type_asset_upload_restriction_helper(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(true), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImpl") => {
            let result = core.run(client.com_day_cq_dam_core_impl_mime_type_dam_mime_type_service_impl(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(true)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqDamCoreImplMissingMetadataNotificationJob") => {
            let result = core.run(client.com_day_cq_dam_core_impl_missing_metadata_notification_job(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(true), Some("cq_dam_missingmetadata_notification_scheduler_timebased_rule_example".to_string()), Some(56), Some("cq_dam_missingmetadata_notification_recipient_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPr") => {
            let result = core.run(client.com_day_cq_dam_core_impl_process_send_transient_workflow_completed_email_pr(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("process_label_example".to_string()), Some(true)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqDamCoreImplProcessTextExtractionProcess") => {
            let result = core.run(client.com_day_cq_dam_core_impl_process_text_extraction_process(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new()), Some(56)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqDamCoreImplRenditionMakerImpl") => {
            let result = core.run(client.com_day_cq_dam_core_impl_rendition_maker_impl(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(true), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqDamCoreImplReportsReportExportService") => {
            let result = core.run(client.com_day_cq_dam_core_impl_reports_report_export_service(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(56)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqDamCoreImplReportsReportPurgeService") => {
            let result = core.run(client.com_day_cq_dam_core_impl_reports_report_purge_service(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("scheduler_expression_example".to_string()), Some(56), Some(56), Some(true)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqDamCoreImplServletAssetDownloadServlet") => {
            let result = core.run(client.com_day_cq_dam_core_impl_servlet_asset_download_servlet(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(true)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqDamCoreImplServletAssetStatusServlet") => {
            let result = core.run(client.com_day_cq_dam_core_impl_servlet_asset_status_servlet(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(56)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqDamCoreImplServletAssetXMPSearchServlet") => {
            let result = core.run(client.com_day_cq_dam_core_impl_servlet_asset_xmp_search_servlet(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(56)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqDamCoreImplServletBatchMetadataServlet") => {
            let result = core.run(client.com_day_cq_dam_core_impl_servlet_batch_metadata_servlet(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new()), Some(&Vec::new()), Some(56)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqDamCoreImplServletBinaryProviderServlet") => {
            let result = core.run(client.com_day_cq_dam_core_impl_servlet_binary_provider_servlet(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new()), Some(&Vec::new()), Some(true)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqDamCoreImplServletCollectionServlet") => {
            let result = core.run(client.com_day_cq_dam_core_impl_servlet_collection_servlet(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new()), Some(56)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqDamCoreImplServletCollectionsServlet") => {
            let result = core.run(client.com_day_cq_dam_core_impl_servlet_collections_servlet(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new()), Some(56)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqDamCoreImplServletCompanionServlet") => {
            let result = core.run(client.com_day_cq_dam_core_impl_servlet_companion_servlet(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("more_info_example".to_string()), Some("mntoverlaydamguicontentassetsmoreinfo_htmlpath_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqDamCoreImplServletCreateAssetServlet") => {
            let result = core.run(client.com_day_cq_dam_core_impl_servlet_create_asset_servlet(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(true)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqDamCoreImplServletDamContentDispositionFilter") => {
            let result = core.run(client.com_day_cq_dam_core_impl_servlet_dam_content_disposition_filter(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new()), Some(true)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqDamCoreImplServletGuidLookupFilter") => {
            let result = core.run(client.com_day_cq_dam_core_impl_servlet_guid_lookup_filter(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(true)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqDamCoreImplServletHealthCheckServlet") => {
            let result = core.run(client.com_day_cq_dam_core_impl_servlet_health_check_servlet(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("cq_dam_sync_workflow_id_example".to_string()), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqDamCoreImplServletMetadataGetServlet") => {
            let result = core.run(client.com_day_cq_dam_core_impl_servlet_metadata_get_servlet(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("sling_servlet_resource_types_example".to_string()), Some("sling_servlet_methods_example".to_string()), Some("sling_servlet_extensions_example".to_string()), Some("sling_servlet_selectors_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqDamCoreImplServletMultipleLicenseAcceptServlet") => {
            let result = core.run(client.com_day_cq_dam_core_impl_servlet_multiple_license_accept_servlet(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(true)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqDamCoreImplServletResourceCollectionServlet") => {
            let result = core.run(client.com_day_cq_dam_core_impl_servlet_resource_collection_servlet(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new()), Some("sling_servlet_methods_example".to_string()), Some("sling_servlet_selectors_example".to_string()), Some("download_config_example".to_string()), Some("view_selector_example".to_string()), Some(true)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImpl") => {
            let result = core.run(client.com_day_cq_dam_core_impl_ui_preview_folder_preview_updater_impl(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(true), Some(true), Some(56), Some("folder_preview_rendition_regex_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqDamCoreImplUnzipUnzipConfig") => {
            let result = core.run(client.com_day_cq_dam_core_impl_unzip_unzip_config(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(56), Some("cq_dam_config_unzip_encoding_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqDamCoreProcessExifToolExtractMetadataProcess") => {
            let result = core.run(client.com_day_cq_dam_core_process_exif_tool_extract_metadata_process(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("process_label_example".to_string()), Some(true)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqDamCoreProcessExtractMetadataProcess") => {
            let result = core.run(client.com_day_cq_dam_core_process_extract_metadata_process(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("process_label_example".to_string()), Some(true)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqDamCoreProcessMetadataProcessorProcess") => {
            let result = core.run(client.com_day_cq_dam_core_process_metadata_processor_process(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("process_label_example".to_string()), Some(true), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqDamHandlerFfmpegLocatorImpl") => {
            let result = core.run(client.com_day_cq_dam_handler_ffmpeg_locator_impl(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImpl") => {
            let result = core.run(client.com_day_cq_dam_handler_gibson_fontmanager_impl_font_manager_service_impl(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("event_filter_example".to_string()), Some(&Vec::new()), Some("fontmgr_adobe_font_dir_example".to_string()), Some("fontmgr_customer_font_dir_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqDamHandlerStandardPdfPdfHandler") => {
            let result = core.run(client.com_day_cq_dam_handler_standard_pdf_pdf_handler(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(true)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqDamHandlerStandardPsPostScriptHandler") => {
            let result = core.run(client.com_day_cq_dam_handler_standard_ps_post_script_handler(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(true)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqDamHandlerStandardPsdPsdHandler") => {
            let result = core.run(client.com_day_cq_dam_handler_standard_psd_psd_handler(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(56)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqDamIdsImplIDSJobProcessor") => {
            let result = core.run(client.com_day_cq_dam_ids_impl_ids_job_processor(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(true), Some(true), Some(true), Some(true), Some("externalizer_domain_cqhost_example".to_string()), Some("externalizer_domain_http_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqDamIdsImplIDSPoolManagerImpl") => {
            let result = core.run(client.com_day_cq_dam_ids_impl_ids_pool_manager_impl(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(56), Some(56), Some(56), Some(56), Some("process_label_example".to_string()), Some(56)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqDamInddImplHandlerIndesignXMPHandler") => {
            let result = core.run(client.com_day_cq_dam_indd_impl_handler_indesign_xmp_handler(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("process_label_example".to_string()), Some(true)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqDamInddImplServletSnippetCreationServlet") => {
            let result = core.run(client.com_day_cq_dam_indd_impl_servlet_snippet_creation_servlet(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(56)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqDamInddProcessINDDMediaExtractProcess") => {
            let result = core.run(client.com_day_cq_dam_indd_process_indd_media_extract_process(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("process_label_example".to_string()), Some("cq_dam_indd_pages_regex_example".to_string()), Some(true), Some("ids_job_workflow_model_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImpl") => {
            let result = core.run(client.com_day_cq_dam_performance_internal_asset_performance_data_handler_impl(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(56)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJob") => {
            let result = core.run(client.com_day_cq_dam_performance_internal_asset_performance_report_sync_job(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("scheduler_expression_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadPro") => {
            let result = core.run(client.com_day_cq_dam_pim_impl_sourcing_upload_process_product_assets_upload_pro(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(true)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEven") => {
            let result = core.run(client.com_day_cq_dam_s7dam_common_analytics_impl_s7dam_dynamic_media_config_even(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(true)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunner") => {
            let result = core.run(client.com_day_cq_dam_s7dam_common_analytics_impl_site_catalyst_report_runner(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("scheduler_expression_example".to_string()), Some(true)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqDamS7damCommonPostServletsSetCreateHandler") => {
            let result = core.run(client.com_day_cq_dam_s7dam_common_post_servlets_set_create_handler(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("sling_post_operation_example".to_string()), Some("sling_servlet_methods_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqDamS7damCommonPostServletsSetModifyHandler") => {
            let result = core.run(client.com_day_cq_dam_s7dam_common_post_servlets_set_modify_handler(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("sling_post_operation_example".to_string()), Some("sling_servlet_methods_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcess") => {
            let result = core.run(client.com_day_cq_dam_s7dam_common_process_video_thumbnail_download_process(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("process_label_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqDamS7damCommonS7damDamChangeEventListener") => {
            let result = core.run(client.com_day_cq_dam_s7dam_common_s7dam_dam_change_event_listener(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(true)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqDamS7damCommonServletsS7damProductInfoServlet") => {
            let result = core.run(client.com_day_cq_dam_s7dam_common_servlets_s7dam_product_info_servlet(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("sling_servlet_paths_example".to_string()), Some("sling_servlet_methods_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImpl") => {
            let result = core.run(client.com_day_cq_dam_s7dam_common_video_impl_video_proxy_client_service_impl(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(56), Some(56), Some(56), Some(56), Some(56), Some(56), Some(56)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqDamScene7ImplScene7APIClientImpl") => {
            let result = core.run(client.com_day_cq_dam_scene7_impl_scene7_api_client_impl(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(56), Some(56)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImpl") => {
            let result = core.run(client.com_day_cq_dam_scene7_impl_scene7_asset_mime_type_service_impl(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqDamScene7ImplScene7ConfigurationEventListener") => {
            let result = core.run(client.com_day_cq_dam_scene7_impl_scene7_configuration_event_listener(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(true)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqDamScene7ImplScene7DamChangeEventListener") => {
            let result = core.run(client.com_day_cq_dam_scene7_impl_scene7_dam_change_event_listener(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(true), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqDamScene7ImplScene7FlashTemplatesServiceImpl") => {
            let result = core.run(client.com_day_cq_dam_scene7_impl_scene7_flash_templates_service_impl(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("scene7_flash_templates_rti_example".to_string()), Some("scene7_flash_templates_rsi_example".to_string()), Some("scene7_flash_templates_rb_example".to_string()), Some("scene7_flash_templates_rurl_example".to_string()), Some("scene7_flash_template_url_format_parameter_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqDamScene7ImplScene7UploadServiceImpl") => {
            let result = core.run(client.com_day_cq_dam_scene7_impl_scene7_upload_service_impl(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(56), Some(56)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSer") => {
            let result = core.run(client.com_day_cq_dam_stock_integration_impl_cache_stock_cache_configuration_ser(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("get_cache_expiration_unit_example".to_string()), Some(56)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqDamStockIntegrationImplConfigurationStockConfiguration") => {
            let result = core.run(client.com_day_cq_dam_stock_integration_impl_configuration_stock_configuration(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("name_example".to_string()), Some("locale_example".to_string()), Some("ims_config_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqDamVideoImplServletVideoTestServlet") => {
            let result = core.run(client.com_day_cq_dam_video_impl_servlet_video_test_servlet(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(true)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqExtwidgetServletsImageSpriteServlet") => {
            let result = core.run(client.com_day_cq_extwidget_servlets_image_sprite_servlet(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(56), Some(56)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqImageInternalFontFontHelper") => {
            let result = core.run(client.com_day_cq_image_internal_font_font_helper(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new()), Some(56)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqJcrclustersupportClusterStartLevelController") => {
            let result = core.run(client.com_day_cq_jcrclustersupport_cluster_start_level_controller(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(true), Some(56), Some(56)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqMailerDefaultMailService") => {
            let result = core.run(client.com_day_cq_mailer_default_mail_service(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("smtp_host_example".to_string()), Some(56), Some("smtp_user_example".to_string()), Some("smtp_password_example".to_string()), Some("from_address_example".to_string()), Some(true), Some(true), Some(true)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqMailerImplCqMailingService") => {
            let result = core.run(client.com_day_cq_mailer_impl_cq_mailing_service(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("max_recipient_count_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqMailerImplEmailCqEmailTemplateFactory") => {
            let result = core.run(client.com_day_cq_mailer_impl_email_cq_email_template_factory(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("mailer_email_charset_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqMailerImplEmailCqRetrieverTemplateFactory") => {
            let result = core.run(client.com_day_cq_mailer_impl_email_cq_retriever_template_factory(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(true), Some("mailer_email_charset_example".to_string()), Some("mailer_email_retriever_user_id_example".to_string()), Some("mailer_email_retriever_user_pwd_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqMcmCampaignImplIntegrationConfigImpl") => {
            let result = core.run(client.com_day_cq_mcm_campaign_impl_integration_config_impl(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new()), Some("aem_mcm_campaign_public_url_example".to_string()), Some(true)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqMcmCampaignImporterPersonalizedTextHandlerFactory") => {
            let result = core.run(client.com_day_cq_mcm_campaign_importer_personalized_text_handler_factory(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(56), Some("tagpattern_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqMcmCoreNewsletterNewsletterEmailServiceImpl") => {
            let result = core.run(client.com_day_cq_mcm_core_newsletter_newsletter_email_service_impl(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("from_address_example".to_string()), Some("sender_host_example".to_string()), Some("max_bounce_count_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqMcmImplMCMConfiguration") => {
            let result = core.run(client.com_day_cq_mcm_impl_mcm_configuration(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new()), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponen") => {
            let result = core.run(client.com_day_cq_mcm_landingpage_parser_taghandlers_cta_click_through_componen(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(56), Some("tagpattern_example".to_string()), Some("component_resource_type_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThroug") => {
            let result = core.run(client.com_day_cq_mcm_landingpage_parser_taghandlers_cta_graphical_click_throug(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(56), Some("tagpattern_example".to_string()), Some("component_resource_type_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponent") => {
            let result = core.run(client.com_day_cq_mcm_landingpage_parser_taghandlers_cta_lead_form_cta_component(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(56), Some("tagpattern_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHa") => {
            let result = core.run(client.com_day_cq_mcm_landingpage_parser_taghandlers_mbox_m_box_experience_tag_ha(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(56), Some("tagpattern_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagH") => {
            let result = core.run(client.com_day_cq_mcm_landingpage_parser_taghandlers_mbox_target_component_tag_h(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(56), Some("tagpattern_example".to_string()), Some("component_resource_type_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqNotificationImplNotificationServiceImpl") => {
            let result = core.run(client.com_day_cq_notification_impl_notification_service_impl(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("event_filter_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqPersonalizationImplServletsTargetingConfigurationServlet") => {
            let result = core.run(client.com_day_cq_personalization_impl_servlets_targeting_configuration_servlet(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(true)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqPollingImporterImplManagedPollConfigImpl") => {
            let result = core.run(client.com_day_cq_polling_importer_impl_managed_poll_config_impl(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("id_example".to_string()), Some(true), Some(true), Some(56), Some("expression_example".to_string()), Some("source_example".to_string()), Some("target_example".to_string()), Some("login_example".to_string()), Some("password_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqPollingImporterImplManagedPollingImporterImpl") => {
            let result = core.run(client.com_day_cq_polling_importer_impl_managed_polling_importer_impl(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("importer_user_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqPollingImporterImplPollingImporterImpl") => {
            let result = core.run(client.com_day_cq_polling_importer_impl_polling_importer_impl(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(56), Some("importer_user_example".to_string()), Some(&Vec::new()), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqReplicationAuditReplicationEventListener") => {
            let result = core.run(client.com_day_cq_replication_audit_replication_event_listener(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(56)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqReplicationContentStaticContentBuilder") => {
            let result = core.run(client.com_day_cq_replication_content_static_content_builder(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("host_example".to_string()), Some(56)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqReplicationImplAgentManagerImpl") => {
            let result = core.run(client.com_day_cq_replication_impl_agent_manager_impl(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("job_topics_example".to_string()), Some("service_user_target_example".to_string()), Some("agent_provider_target_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqReplicationImplContentDurboBinaryLessContentBuilder") => {
            let result = core.run(client.com_day_cq_replication_impl_content_durbo_binary_less_content_builder(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(56)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqReplicationImplContentDurboDurboImportConfigurationProv") => {
            let result = core.run(client.com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(true), Some(true), Some(true), Some(56), Some(true), Some(true), Some(&Vec::new()), Some(&Vec::new()), Some(true)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqReplicationImplReplicationContentFactoryProviderImpl") => {
            let result = core.run(client.com_day_cq_replication_impl_replication_content_factory_provider_impl(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(true), Some(56)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqReplicationImplReplicationReceiverImpl") => {
            let result = core.run(client.com_day_cq_replication_impl_replication_receiver_impl(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(56), Some(true)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqReplicationImplReplicatorImpl") => {
            let result = core.run(client.com_day_cq_replication_impl_replicator_impl(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(true)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqReplicationImplReverseReplicator") => {
            let result = core.run(client.com_day_cq_replication_impl_reverse_replicator(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(56)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqReplicationImplTransportBinaryLessTransportHandler") => {
            let result = core.run(client.com_day_cq_replication_impl_transport_binary_less_transport_handler(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new()), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqReplicationImplTransportHttp") => {
            let result = core.run(client.com_day_cq_replication_impl_transport_http(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new()), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqReportingImplCacheCacheImpl") => {
            let result = core.run(client.com_day_cq_reporting_impl_cache_cache_impl(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(true), Some(56), Some(56)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqReportingImplConfigServiceImpl") => {
            let result = core.run(client.com_day_cq_reporting_impl_config_service_impl(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("repconf_timezone_example".to_string()), Some("repconf_locale_example".to_string()), Some("repconf_snapshots_example".to_string()), Some("repconf_repdir_example".to_string()), Some(56), Some(56), Some(56), Some(true), Some("repconf_snapshotuser_example".to_string()), Some(true)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqReportingImplRLogAnalyzer") => {
            let result = core.run(client.com_day_cq_reporting_impl_r_log_analyzer(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("request_log_output_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqRewriterLinkcheckerImplLinkCheckerImpl") => {
            let result = core.run(client.com_day_cq_rewriter_linkchecker_impl_link_checker_impl(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(56), Some(true), Some(56), Some(&Vec::new()), Some(true), Some(&Vec::new()), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqRewriterLinkcheckerImplLinkCheckerTask") => {
            let result = core.run(client.com_day_cq_rewriter_linkchecker_impl_link_checker_task(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(56), Some(true), Some(56), Some(56), Some(56), Some(56)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactory") => {
            let result = core.run(client.com_day_cq_rewriter_linkchecker_impl_link_checker_transformer_factory(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(true), Some(true), Some(56), Some(true), Some(true), Some(&Vec::new()), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqRewriterLinkcheckerImplLinkInfoStorageImpl") => {
            let result = core.run(client.com_day_cq_rewriter_linkchecker_impl_link_info_storage_impl(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(56), Some(true)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqRewriterProcessorImplHtmlParserFactory") => {
            let result = core.run(client.com_day_cq_rewriter_processor_impl_html_parser_factory(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new()), Some(true)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqSearchImplBuilderQueryBuilderImpl") => {
            let result = core.run(client.com_day_cq_search_impl_builder_query_builder_impl(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new()), Some(56), Some(56), Some(true)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqSearchSuggestImplSuggestionIndexManagerImpl") => {
            let result = core.run(client.com_day_cq_search_suggest_impl_suggestion_index_manager_impl(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("path_builder_target_example".to_string()), Some("suggest_basepath_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandler") => {
            let result = core.run(client.com_day_cq_searchpromote_impl_publish_search_promote_config_handler(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(true)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqSearchpromoteImplSearchPromoteServiceImpl") => {
            let result = core.run(client.com_day_cq_searchpromote_impl_search_promote_service_impl(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("cq_searchpromote_configuration_server_uri_example".to_string()), Some("cq_searchpromote_configuration_environment_example".to_string()), Some(56), Some(56)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqSecurityACLSetup") => {
            let result = core.run(client.com_day_cq_security_acl_setup(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqStatisticsImplStatisticsServiceImpl") => {
            let result = core.run(client.com_day_cq_statistics_impl_statistics_service_impl(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(56), Some(true), Some("path_example".to_string()), Some("workspace_example".to_string()), Some("keywords_path_example".to_string()), Some(true)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqTaggingImplJcrTagManagerFactoryImpl") => {
            let result = core.run(client.com_day_cq_tagging_impl_jcr_tag_manager_factory_impl(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(true)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqTaggingImplSearchTagPredicateEvaluator") => {
            let result = core.run(client.com_day_cq_tagging_impl_search_tag_predicate_evaluator(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(true)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqTaggingImplTagGarbageCollector") => {
            let result = core.run(client.com_day_cq_tagging_impl_tag_garbage_collector(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("scheduler_expression_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqWcmContentsyncImplHandlerPagesUpdateHandler") => {
            let result = core.run(client.com_day_cq_wcm_contentsync_impl_handler_pages_update_handler(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactor") => {
            let result = core.run(client.com_day_cq_wcm_contentsync_impl_rewriter_path_rewriter_transformer_factor(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new()), Some(&Vec::new()), Some(&Vec::new()), Some("cq_contentsync_pathrewritertransformer_attribute_pattern_example".to_string()), Some("cq_contentsync_pathrewritertransformer_clientlibrary_pattern_example".to_string()), Some("cq_contentsync_pathrewritertransformer_clientlibrary_replace_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqWcmCoreImplAuthoringUIModeServiceImpl") => {
            let result = core.run(client.com_day_cq_wcm_core_impl_authoring_ui_mode_service_impl(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("authoring_ui_mode_service_default_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqWcmCoreImplCommandsWCMCommandServlet") => {
            let result = core.run(client.com_day_cq_wcm_core_impl_commands_wcm_command_servlet(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImpl") => {
            let result = core.run(client.com_day_cq_wcm_core_impl_devicedetection_device_identification_mode_impl(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("dim_default_mode_example".to_string()), Some(true)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqWcmCoreImplEventPageEventAuditListener") => {
            let result = core.run(client.com_day_cq_wcm_core_impl_event_page_event_audit_listener(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("configured_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqWcmCoreImplEventPagePostProcessor") => {
            let result = core.run(client.com_day_cq_wcm_core_impl_event_page_post_processor(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqWcmCoreImplEventRepositoryChangeEventListener") => {
            let result = core.run(client.com_day_cq_wcm_core_impl_event_repository_change_event_listener(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new()), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqWcmCoreImplEventTemplatePostProcessor") => {
            let result = core.run(client.com_day_cq_wcm_core_impl_event_template_post_processor(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("paths_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqWcmCoreImplLanguageManagerImpl") => {
            let result = core.run(client.com_day_cq_wcm_core_impl_language_manager_impl(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("langmgr_list_path_example".to_string()), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImpl") => {
            let result = core.run(client.com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("link_expired_prefix_example".to_string()), Some(true), Some("link_expired_suffix_example".to_string()), Some("link_invalid_prefix_example".to_string()), Some(true), Some("link_invalid_suffix_example".to_string()), Some("link_predated_prefix_example".to_string()), Some(true), Some("link_predated_suffix_example".to_string()), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqWcmCoreImplPagePageInfoAggregatorImpl") => {
            let result = core.run(client.com_day_cq_wcm_core_impl_page_page_info_aggregator_impl(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("page_info_provider_property_regex_default_example".to_string()), Some("page_info_provider_property_name_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqWcmCoreImplPagePageManagerFactoryImpl") => {
            let result = core.run(client.com_day_cq_wcm_core_impl_page_page_manager_factory_impl(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("illegal_char_mapping_example".to_string()), Some(true)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqWcmCoreImplReferencesContentContentReferenceConfig") => {
            let result = core.run(client.com_day_cq_wcm_core_impl_references_content_content_reference_config(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqWcmCoreImplServletsContentfinderAssetViewHandler") => {
            let result = core.run(client.com_day_cq_wcm_core_impl_servlets_contentfinder_asset_view_handler(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(true), Some(true), Some(true), Some("guess_total_example".to_string()), Some("dam_expiry_property_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVie") => {
            let result = core.run(client.com_day_cq_wcm_core_impl_servlets_contentfinder_connector_connector_vie(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqWcmCoreImplServletsContentfinderPageViewHandler") => {
            let result = core.run(client.com_day_cq_wcm_core_impl_servlets_contentfinder_page_view_handler(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("guess_total_example".to_string()), Some(true)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqWcmCoreImplServletsFindReplaceServlet") => {
            let result = core.run(client.com_day_cq_wcm_core_impl_servlets_find_replace_servlet(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqWcmCoreImplServletsReferenceSearchServlet") => {
            let result = core.run(client.com_day_cq_wcm_core_impl_servlets_reference_search_servlet(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(56), Some(56)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqWcmCoreImplServletsThumbnailServlet") => {
            let result = core.run(client.com_day_cq_wcm_core_impl_servlets_thumbnail_servlet(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("workspace_example".to_string()), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqWcmCoreImplUtilsDefaultPageNameValidator") => {
            let result = core.run(client.com_day_cq_wcm_core_impl_utils_default_page_name_validator(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("non_valid_chars_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqWcmCoreImplVariantsPageVariantsProviderImpl") => {
            let result = core.run(client.com_day_cq_wcm_core_impl_variants_page_variants_provider_impl(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("default_externalizer_domain_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqWcmCoreImplVersionManagerImpl") => {
            let result = core.run(client.com_day_cq_wcm_core_impl_version_manager_impl(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(true), Some(true), Some(&Vec::new()), Some(&Vec::new()), Some(56), Some(56), Some(56)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqWcmCoreImplVersionPurgeTask") => {
            let result = core.run(client.com_day_cq_wcm_core_impl_version_purge_task(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new()), Some(true), Some(56), Some(56), Some(56)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqWcmCoreImplWCMDebugFilter") => {
            let result = core.run(client.com_day_cq_wcm_core_impl_wcm_debug_filter(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(true), Some(true)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqWcmCoreImplWCMDeveloperModeFilter") => {
            let result = core.run(client.com_day_cq_wcm_core_impl_wcm_developer_mode_filter(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(true)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqWcmCoreImplWarpTimeWarpFilter") => {
            let result = core.run(client.com_day_cq_wcm_core_impl_warp_time_warp_filter(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("filter_order_example".to_string()), Some("filter_scope_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqWcmCoreMvtMVTStatisticsImpl") => {
            let result = core.run(client.com_day_cq_wcm_core_mvt_mvt_statistics_impl(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("mvtstatistics_trackingurl_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqWcmCoreStatsPageViewStatisticsImpl") => {
            let result = core.run(client.com_day_cq_wcm_core_stats_page_view_statistics_impl(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("pageviewstatistics_trackingurl_example".to_string()), Some("pageviewstatistics_trackingscript_enabled_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqWcmCoreWCMRequestFilter") => {
            let result = core.run(client.com_day_cq_wcm_core_wcm_request_filter(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("wcmfilter_mode_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqWcmDesignimporterDesignPackageImporter") => {
            let result = core.run(client.com_day_cq_wcm_designimporter_design_package_importer(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqWcmDesignimporterImplCanvasBuilderImpl") => {
            let result = core.run(client.com_day_cq_wcm_designimporter_impl_canvas_builder_impl(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("filepattern_example".to_string()), Some(true), Some(true), Some(true)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqWcmDesignimporterImplCanvasPageDeleteHandler") => {
            let result = core.run(client.com_day_cq_wcm_designimporter_impl_canvas_page_delete_handler(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(56), Some(56)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqWcmDesignimporterImplEntryPreprocessorImpl") => {
            let result = core.run(client.com_day_cq_wcm_designimporter_impl_entry_preprocessor_impl(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("search_pattern_example".to_string()), Some("replace_pattern_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqWcmDesignimporterImplMobileCanvasBuilderImpl") => {
            let result = core.run(client.com_day_cq_wcm_designimporter_impl_mobile_canvas_builder_impl(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("filepattern_example".to_string()), Some(&Vec::new()), Some(true), Some(true), Some(true)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqWcmDesignimporterParserTaghandlersFactoryCanvasCompone") => {
            let result = core.run(client.com_day_cq_wcm_designimporter_parser_taghandlers_factory_canvas_compone(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(56), Some("tagpattern_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultCompon") => {
            let result = core.run(client.com_day_cq_wcm_designimporter_parser_taghandlers_factory_default_compon(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(56), Some("tagpattern_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultTagHan") => {
            let result = core.run(client.com_day_cq_wcm_designimporter_parser_taghandlers_factory_default_tag_han(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(56), Some("tagpattern_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqWcmDesignimporterParserTaghandlersFactoryHeadTagHandle") => {
            let result = core.run(client.com_day_cq_wcm_designimporter_parser_taghandlers_factory_head_tag_handle(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(56), Some("tagpattern_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqWcmDesignimporterParserTaghandlersFactoryIFrameTagHand") => {
            let result = core.run(client.com_day_cq_wcm_designimporter_parser_taghandlers_factory_i_frame_tag_hand(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(56), Some("tagpattern_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqWcmDesignimporterParserTaghandlersFactoryImageComponen") => {
            let result = core.run(client.com_day_cq_wcm_designimporter_parser_taghandlers_factory_image_componen(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(56), Some("tagpattern_example".to_string()), Some("component_resource_type_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandler") => {
            let result = core.run(client.com_day_cq_wcm_designimporter_parser_taghandlers_factory_img_tag_handler(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(56), Some("tagpattern_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqWcmDesignimporterParserTaghandlersFactoryInlineScriptT") => {
            let result = core.run(client.com_day_cq_wcm_designimporter_parser_taghandlers_factory_inline_script_t(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(56), Some("tagpattern_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqWcmDesignimporterParserTaghandlersFactoryLinkTagHandle") => {
            let result = core.run(client.com_day_cq_wcm_designimporter_parser_taghandlers_factory_link_tag_handle(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(56), Some("tagpattern_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqWcmDesignimporterParserTaghandlersFactoryMetaTagHandle") => {
            let result = core.run(client.com_day_cq_wcm_designimporter_parser_taghandlers_factory_meta_tag_handle(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(56), Some("tagpattern_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqWcmDesignimporterParserTaghandlersFactoryNonScriptTagH") => {
            let result = core.run(client.com_day_cq_wcm_designimporter_parser_taghandlers_factory_non_script_tag_h(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(56), Some("tagpattern_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqWcmDesignimporterParserTaghandlersFactoryParsysCompone") => {
            let result = core.run(client.com_day_cq_wcm_designimporter_parser_taghandlers_factory_parsys_compone(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(56), Some("tagpattern_example".to_string()), Some("component_resource_type_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqWcmDesignimporterParserTaghandlersFactoryScriptTagHand") => {
            let result = core.run(client.com_day_cq_wcm_designimporter_parser_taghandlers_factory_script_tag_hand(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(56), Some("tagpattern_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqWcmDesignimporterParserTaghandlersFactoryStyleTagHandl") => {
            let result = core.run(client.com_day_cq_wcm_designimporter_parser_taghandlers_factory_style_tag_handl(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(56), Some("tagpattern_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqWcmDesignimporterParserTaghandlersFactoryTextComponent") => {
            let result = core.run(client.com_day_cq_wcm_designimporter_parser_taghandlers_factory_text_component(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(56), Some("tagpattern_example".to_string()), Some("component_resource_type_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleComponen") => {
            let result = core.run(client.com_day_cq_wcm_designimporter_parser_taghandlers_factory_title_componen(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(56), Some("tagpattern_example".to_string()), Some("component_resource_type_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleTagHandl") => {
            let result = core.run(client.com_day_cq_wcm_designimporter_parser_taghandlers_factory_title_tag_handl(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(56), Some("tagpattern_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqWcmFoundationFormsImplFormChooserServlet") => {
            let result = core.run(client.com_day_cq_wcm_foundation_forms_impl_form_chooser_servlet(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("service_name_example".to_string()), Some("sling_servlet_resource_types_example".to_string()), Some("sling_servlet_selectors_example".to_string()), Some(&Vec::new()), Some(true)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqWcmFoundationFormsImplFormParagraphPostProcessor") => {
            let result = core.run(client.com_day_cq_wcm_foundation_forms_impl_form_paragraph_post_processor(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(true), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqWcmFoundationFormsImplFormsHandlingServlet") => {
            let result = core.run(client.com_day_cq_wcm_foundation_forms_impl_forms_handling_servlet(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("name_whitelist_example".to_string()), Some(true)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqWcmFoundationFormsImplMailServlet") => {
            let result = core.run(client.com_day_cq_wcm_foundation_forms_impl_mail_servlet(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("sling_servlet_resource_types_example".to_string()), Some("sling_servlet_selectors_example".to_string()), Some(&Vec::new()), Some("resource_blacklist_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqWcmFoundationImplAdaptiveImageComponentServlet") => {
            let result = core.run(client.com_day_cq_wcm_foundation_impl_adaptive_image_component_servlet(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqWcmFoundationImplHTTPAuthHandler") => {
            let result = core.run(client.com_day_cq_wcm_foundation_impl_http_auth_handler(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("path_example".to_string()), Some(true), Some("auth_http_realm_example".to_string()), Some("auth_default_loginpage_example".to_string()), Some(&Vec::new()), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqWcmFoundationImplPageImpressionsTracker") => {
            let result = core.run(client.com_day_cq_wcm_foundation_impl_page_impressions_tracker(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("sling_auth_requirements_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqWcmFoundationImplPageRedirectServlet") => {
            let result = core.run(client.com_day_cq_wcm_foundation_impl_page_redirect_servlet(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklist") => {
            let result = core.run(client.com_day_cq_wcm_foundation_security_impl_default_attachment_type_blacklist(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new()), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImpl") => {
            let result = core.run(client.com_day_cq_wcm_foundation_security_impl_safer_sling_post_validator_impl(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new()), Some(&Vec::new()), Some(&Vec::new()), Some(&Vec::new()), Some(&Vec::new()), Some(&Vec::new()), Some(&Vec::new()), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactory") => {
            let result = core.run(client.com_day_cq_wcm_mobile_core_impl_device_device_info_transformer_factory(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(true), Some("device_info_transformer_css_style_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqWcmMobileCoreImplRedirectRedirectFilter") => {
            let result = core.run(client.com_day_cq_wcm_mobile_core_impl_redirect_redirect_filter(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(true), Some(true), Some(&Vec::new()), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqWcmMsmImplActionsContentCopyActionFactory") => {
            let result = core.run(client.com_day_cq_wcm_msm_impl_actions_content_copy_action_factory(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new()), Some(&Vec::new()), Some(&Vec::new()), Some("contentcopyaction_order_style_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqWcmMsmImplActionsContentDeleteActionFactory") => {
            let result = core.run(client.com_day_cq_wcm_msm_impl_actions_content_delete_action_factory(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new()), Some(&Vec::new()), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqWcmMsmImplActionsContentUpdateActionFactory") => {
            let result = core.run(client.com_day_cq_wcm_msm_impl_actions_content_update_action_factory(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new()), Some(&Vec::new()), Some(&Vec::new()), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqWcmMsmImplActionsOrderChildrenActionFactory") => {
            let result = core.run(client.com_day_cq_wcm_msm_impl_actions_order_children_action_factory(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new()), Some(&Vec::new()), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqWcmMsmImplActionsPageMoveActionFactory") => {
            let result = core.run(client.com_day_cq_wcm_msm_impl_actions_page_move_action_factory(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new()), Some(&Vec::new()), Some(&Vec::new()), Some(true)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqWcmMsmImplActionsReferencesUpdateActionFactory") => {
            let result = core.run(client.com_day_cq_wcm_msm_impl_actions_references_update_action_factory(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new()), Some(&Vec::new()), Some(&Vec::new()), Some(true)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqWcmMsmImplActionsVersionCopyActionFactory") => {
            let result = core.run(client.com_day_cq_wcm_msm_impl_actions_version_copy_action_factory(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new()), Some(&Vec::new()), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqWcmMsmImplLiveRelationshipManagerImpl") => {
            let result = core.run(client.com_day_cq_wcm_msm_impl_live_relationship_manager_impl(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("liverelationshipmgr_relationsconfig_default_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqWcmMsmImplRolloutManagerImpl") => {
            let result = core.run(client.com_day_cq_wcm_msm_impl_rollout_manager_impl(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("event_filter_example".to_string()), Some(&Vec::new()), Some(&Vec::new()), Some(&Vec::new()), Some(56), Some(56), Some("rolloutmgr_threadpool_priority_example".to_string()), Some(56), Some(true)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqWcmMsmImplServletsAuditLogServlet") => {
            let result = core.run(client.com_day_cq_wcm_msm_impl_servlets_audit_log_servlet(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(56), Some("auditlogservlet_default_path_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqWcmNotificationEmailImplEmailChannel") => {
            let result = core.run(client.com_day_cq_wcm_notification_email_impl_email_channel(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("email_from_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqWcmNotificationImplNotificationManagerImpl") => {
            let result = core.run(client.com_day_cq_wcm_notification_impl_notification_manager_impl(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqWcmScriptingImplBVPManager") => {
            let result = core.run(client.com_day_cq_wcm_scripting_impl_bvp_manager(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqWcmUndoUndoConfig") => {
            let result = core.run(client.com_day_cq_wcm_undo_undo_config(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(true), Some("cq_wcm_undo_path_example".to_string()), Some(56), Some(56), Some("cq_wcm_undo_persistence_example".to_string()), Some(true), Some("cq_wcm_undo_markermode_example".to_string()), Some(&Vec::new()), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqWcmWebservicesupportImplReplicationEventListener") => {
            let result = core.run(client.com_day_cq_wcm_webservicesupport_impl_replication_event_listener(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqWcmWorkflowImplWcmWorkflowServiceImpl") => {
            let result = core.run(client.com_day_cq_wcm_workflow_impl_wcm_workflow_service_impl(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("event_filter_example".to_string()), Some(56), Some(56), Some(true), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqWcmWorkflowImplWorkflowPackageInfoProvider") => {
            let result = core.run(client.com_day_cq_wcm_workflow_impl_workflow_package_info_provider(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new()), Some("workflowpackageinfoprovider_filter_rootpath_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqWidgetImplHtmlLibraryManagerImpl") => {
            let result = core.run(client.com_day_cq_widget_impl_html_library_manager_impl(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("htmllibmanager_clientmanager_example".to_string()), Some(true), Some(true), Some("htmllibmanager_debug_init_js_example".to_string()), Some("htmllibmanager_defaultthemename_example".to_string()), Some("htmllibmanager_defaultuserthemename_example".to_string()), Some("htmllibmanager_firebuglite_path_example".to_string()), Some(true), Some(true), Some(56), Some(56), Some(true), Some(&Vec::new()), Some(true)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqWidgetImplWidgetExtensionProviderImpl") => {
            let result = core.run(client.com_day_cq_widget_impl_widget_extension_provider_impl(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new()), Some(true)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqWorkflowImplEmailEMailNotificationService") => {
            let result = core.run(client.com_day_cq_workflow_impl_email_e_mail_notification_service(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("from_address_example".to_string()), Some("host_prefix_example".to_string()), Some(true), Some(true), Some(true), Some(true)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCqWorkflowImplEmailTaskEMailNotificationService") => {
            let result = core.run(client.com_day_cq_workflow_impl_email_task_e_mail_notification_service(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(true), Some(true)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCrxSecurityTokenImplImplTokenAuthenticationHandler") => {
            let result = core.run(client.com_day_crx_security_token_impl_impl_token_authentication_handler(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("path_example".to_string()), Some("token_required_attr_example".to_string()), Some("token_alternate_url_example".to_string()), Some(true), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ComDayCrxSecurityTokenImplTokenCleanupTask") => {
            let result = core.run(client.com_day_crx_security_token_impl_token_cleanup_task(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(true), Some("scheduler_expression_example".to_string()), Some(56)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("GuideLocalizationService") => {
            let result = core.run(client.guide_localization_service(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new()), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("MessagingUserComponentFactory") => {
            let result = core.run(client.messaging_user_component_factory(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(56)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("OrgApacheAriesJmxFrameworkStateConfig") => {
            let result = core.run(client.org_apache_aries_jmx_framework_state_config(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(true)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("OrgApacheFelixEventadminImplEventAdmin") => {
            let result = core.run(client.org_apache_felix_eventadmin_impl_event_admin(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(56), Some(1.2), Some(56), Some(true), Some(&Vec::new()), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("OrgApacheFelixHttp") => {
            let result = core.run(client.org_apache_felix_http(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("org_apache_felix_http_host_example".to_string()), Some(true), Some(56), Some(56), Some(true), Some(56), Some("org_apache_felix_https_keystore_example".to_string()), Some("org_apache_felix_https_keystore_password_example".to_string()), Some("org_apache_felix_https_keystore_key_password_example".to_string()), Some("org_apache_felix_https_truststore_example".to_string()), Some("org_apache_felix_https_truststore_password_example".to_string()), Some("org_apache_felix_https_clientcertificate_example".to_string()), Some("org_apache_felix_http_context_path_example".to_string()), Some(true), Some(56), Some(56), Some(56), Some(56), Some(56), Some(56), Some(56), Some(56), Some(&Vec::new()), Some(&Vec::new()), Some(&Vec::new()), Some(true), Some(&Vec::new()), Some(&Vec::new()), Some(true), Some(true), Some(true), Some(true), Some("org_eclipse_jetty_servlet_session_id_path_parameter_name_example".to_string()), Some(true), Some("org_eclipse_jetty_servlet_session_cookie_example".to_string()), Some("org_eclipse_jetty_servlet_session_domain_example".to_string()), Some("org_eclipse_jetty_servlet_session_path_example".to_string()), Some(56), Some("org_apache_felix_http_name_example".to_string()), Some(true), Some(56), Some(56), Some(56), Some(true), Some(&Vec::new()), Some(&Vec::new()), Some(&Vec::new()), Some(&Vec::new()), Some(&Vec::new()), Some(&Vec::new()), Some(&Vec::new()), Some(true), Some(true)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("OrgApacheFelixHttpSslfilterSslFilter") => {
            let result = core.run(client.org_apache_felix_http_sslfilter_ssl_filter(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("ssl_forward_header_example".to_string()), Some("ssl_forward_value_example".to_string()), Some("ssl_forward_cert_header_example".to_string()), Some(true)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("OrgApacheFelixJaasConfigurationFactory") => {
            let result = core.run(client.org_apache_felix_jaas_configuration_factory(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("jaas_control_flag_example".to_string()), Some(56), Some("jaas_realm_name_example".to_string()), Some("jaas_classname_example".to_string()), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("OrgApacheFelixJaasConfigurationSpi") => {
            let result = core.run(client.org_apache_felix_jaas_configuration_spi(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("jaas_default_realm_name_example".to_string()), Some("jaas_config_provider_name_example".to_string()), Some("jaas_global_config_policy_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("OrgApacheFelixScrScrService") => {
            let result = core.run(client.org_apache_felix_scr_scr_service(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(56), Some(true), Some(true), Some(56), Some(56), Some(true)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("OrgApacheFelixSystemreadyImplComponentsCheck") => {
            let result = core.run(client.org_apache_felix_systemready_impl_components_check(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new()), Some("_type_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("OrgApacheFelixSystemreadyImplFrameworkStartCheck") => {
            let result = core.run(client.org_apache_felix_systemready_impl_framework_start_check(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(56), Some(56), Some("target_start_level_prop_name_example".to_string()), Some("_type_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("OrgApacheFelixSystemreadyImplServicesCheck") => {
            let result = core.run(client.org_apache_felix_systemready_impl_services_check(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new()), Some("_type_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("OrgApacheFelixSystemreadyImplServletSystemAliveServlet") => {
            let result = core.run(client.org_apache_felix_systemready_impl_servlet_system_alive_servlet(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("osgi_http_whiteboard_servlet_pattern_example".to_string()), Some("osgi_http_whiteboard_context_select_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("OrgApacheFelixSystemreadyImplServletSystemReadyServlet") => {
            let result = core.run(client.org_apache_felix_systemready_impl_servlet_system_ready_servlet(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("osgi_http_whiteboard_servlet_pattern_example".to_string()), Some("osgi_http_whiteboard_context_select_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("OrgApacheFelixSystemreadySystemReadyMonitor") => {
            let result = core.run(client.org_apache_felix_systemready_system_ready_monitor(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(56)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("OrgApacheFelixWebconsoleInternalServletOsgiManager") => {
            let result = core.run(client.org_apache_felix_webconsole_internal_servlet_osgi_manager(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("manager_root_example".to_string()), Some("http_service_filter_example".to_string()), Some("default_render_example".to_string()), Some("realm_example".to_string()), Some("username_example".to_string()), Some("password_example".to_string()), Some("category_example".to_string()), Some("locale_example".to_string()), Some(56), Some("plugins_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("OrgApacheFelixWebconsolePluginsEventInternalPluginServlet") => {
            let result = core.run(client.org_apache_felix_webconsole_plugins_event_internal_plugin_servlet(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(56)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCo") => {
            let result = core.run(client.org_apache_felix_webconsole_plugins_memoryusage_internal_memory_usage_co(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(56), Some(56), Some("felix_memoryusage_dump_location_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("OrgApacheHttpProxyconfigurator") => {
            let result = core.run(client.org_apache_http_proxyconfigurator(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(true), Some("proxy_host_example".to_string()), Some(56), Some("proxy_user_example".to_string()), Some("proxy_password_example".to_string()), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProvider") => {
            let result = core.run(client.org_apache_jackrabbit_oak_plugins_blob_datastore_data_store_text_provider(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("dir_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStore") => {
            let result = core.run(client.org_apache_jackrabbit_oak_plugins_blob_datastore_file_data_store(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("path_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreService") => {
            let result = core.run(client.org_apache_jackrabbit_oak_plugins_document_document_node_store_service(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("mongouri_example".to_string()), Some("db_example".to_string()), Some(true), Some(56), Some(56), Some(56), Some(56), Some(56), Some(56), Some(56), Some(56), Some("persistent_cache_example".to_string()), Some("journal_cache_example".to_string()), Some(true), Some(56), Some(56), Some(true), Some("role_example".to_string()), Some(56), Some("version_gc_expression_example".to_string()), Some(56), Some(56), Some(56), Some("repository_home_example".to_string()), Some(56), Some("document_store_type_example".to_string()), Some(true), Some(56), Some(&Vec::new()), Some("lease_check_mode_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePre") => {
            let result = core.run(client.org_apache_jackrabbit_oak_plugins_document_document_node_store_service_pre(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCac") => {
            let result = core.run(client.org_apache_jackrabbit_oak_plugins_document_secondary_secondary_store_cac(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new()), Some(true), Some(56)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("OrgApacheJackrabbitOakPluginsIndexAsyncIndexerService") => {
            let result = core.run(client.org_apache_jackrabbit_oak_plugins_index_async_indexer_service(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new()), Some(56), Some(56), Some(56)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServ") => {
            let result = core.run(client.org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(true), Some(true), Some("local_index_dir_example".to_string()), Some(true), Some(56), Some(true), Some(56), Some(56), Some(true), Some(56), Some(true), Some(56), Some(true), Some(true), Some(56), Some(true)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCo") => {
            let result = core.run(client.org_apache_jackrabbit_oak_plugins_index_solr_osgi_embedded_solr_server_co(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("solr_home_path_example".to_string()), Some("solr_core_name_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServers") => {
            let result = core.run(client.org_apache_jackrabbit_oak_plugins_index_solr_osgi_node_state_solr_servers(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(true)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfiguration") => {
            let result = core.run(client.org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("path_desc_field_example".to_string()), Some("path_child_field_example".to_string()), Some("path_parent_field_example".to_string()), Some("path_exact_field_example".to_string()), Some("catch_all_field_example".to_string()), Some("collapsed_path_field_example".to_string()), Some("path_depth_field_example".to_string()), Some("commit_policy_example".to_string()), Some(56), Some(true), Some(true), Some(true), Some(&Vec::new()), Some(&Vec::new()), Some(&Vec::new()), Some(&Vec::new()), Some(true)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConf") => {
            let result = core.run(client.org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_server_conf(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("solr_http_url_example".to_string()), Some("solr_zk_host_example".to_string()), Some("solr_collection_example".to_string()), Some(56), Some(56), Some(56), Some(56), Some("solr_conf_dir_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvid") => {
            let result = core.run(client.org_apache_jackrabbit_oak_plugins_index_solr_osgi_solr_query_index_provid(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(true)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSe") => {
            let result = core.run(client.org_apache_jackrabbit_oak_plugins_index_solr_osgi_solr_server_provider_se(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("server_type_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactory") => {
            let result = core.run(client.org_apache_jackrabbit_oak_plugins_metric_statistics_provider_factory(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("provider_type_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("OrgApacheJackrabbitOakPluginsObservationChangeCollectorProvider") => {
            let result = core.run(client.org_apache_jackrabbit_oak_plugins_observation_change_collector_provider(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(56), Some(56), Some(true)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("OrgApacheJackrabbitOakQueryQueryEngineSettingsService") => {
            let result = core.run(client.org_apache_jackrabbit_oak_query_query_engine_settings_service(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(56), Some(56), Some(true), Some(true)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfig") => {
            let result = core.run(client.org_apache_jackrabbit_oak_security_authentication_authentication_config(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("org_apache_jackrabbit_oak_authentication_app_name_example".to_string()), Some("org_apache_jackrabbit_oak_authentication_config_spi_name_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdenti") => {
            let result = core.run(client.org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("provider_name_example".to_string()), Some("host_name_example".to_string()), Some(56), Some(true), Some(true), Some(true), Some("bind_dn_example".to_string()), Some("bind_password_example".to_string()), Some("search_timeout_example".to_string()), Some(56), Some(true), Some(56), Some(true), Some("user_base_dn_example".to_string()), Some(&Vec::new()), Some("user_id_attribute_example".to_string()), Some("user_extra_filter_example".to_string()), Some(true), Some("group_base_dn_example".to_string()), Some(&Vec::new()), Some("group_name_attribute_example".to_string()), Some("group_extra_filter_example".to_string()), Some(true), Some("group_member_attribute_example".to_string()), Some(true), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfigura") => {
            let result = core.run(client.org_apache_jackrabbit_oak_security_authentication_token_token_configura(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("token_expiration_example".to_string()), Some("token_length_example".to_string()), Some(true), Some(56), Some("password_hash_algorithm_example".to_string()), Some(56), Some(56)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigur") => {
            let result = core.run(client.org_apache_jackrabbit_oak_security_authorization_authorization_configur(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("permissions_jr2_example".to_string()), Some("import_behavior_example".to_string()), Some(&Vec::new()), Some(&Vec::new()), Some(56)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistrati") => {
            let result = core.run(client.org_apache_jackrabbit_oak_security_internal_security_provider_registrati(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new()), Some("authorization_composition_type_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeName") => {
            let result = core.run(client.org_apache_jackrabbit_oak_security_user_random_authorizable_node_name(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(56)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("OrgApacheJackrabbitOakSecurityUserUserConfigurationImpl") => {
            let result = core.run(client.org_apache_jackrabbit_oak_security_user_user_configuration_impl(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("users_path_example".to_string()), Some("groups_path_example".to_string()), Some("system_relative_path_example".to_string()), Some(56), Some("import_behavior_example".to_string()), Some("password_hash_algorithm_example".to_string()), Some(56), Some(56), Some(true), Some(true), Some(56), Some(true), Some(56), Some(true), Some(56), Some(true)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreService") => {
            let result = core.run(client.org_apache_jackrabbit_oak_segment_azure_azure_segment_store_service(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("account_name_example".to_string()), Some("container_name_example".to_string()), Some("access_key_example".to_string()), Some("root_path_example".to_string()), Some("connection_url_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactory") => {
            let result = core.run(client.org_apache_jackrabbit_oak_segment_segment_node_store_factory(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("repository_home_example".to_string()), Some("tarmk_mode_example".to_string()), Some(56), Some(56), Some(56), Some(56), Some(56), Some(56), Some(56), Some(true), Some(56), Some(56), Some(56), Some(true), Some(56), Some(56), Some(56), Some(true), Some(true), Some(true), Some(true), Some("repository_backup_dir_example".to_string()), Some(56), Some(56), Some("role_example".to_string()), Some(true), Some(true)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorService") => {
            let result = core.run(client.org_apache_jackrabbit_oak_segment_segment_node_store_monitor_service(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("OrgApacheJackrabbitOakSegmentSegmentNodeStoreService") => {
            let result = core.run(client.org_apache_jackrabbit_oak_segment_segment_node_store_service(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("repository_home_example".to_string()), Some("tarmk_mode_example".to_string()), Some(56), Some(56), Some(56), Some(56), Some(56), Some(56), Some(56), Some(true), Some(56), Some(56), Some(56), Some(true), Some(56), Some(56), Some(56), Some(true), Some(true), Some(true), Some(true), Some("repository_backup_dir_example".to_string()), Some(56), Some(56)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreService") => {
            let result = core.run(client.org_apache_jackrabbit_oak_segment_standby_store_standby_store_service(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(true), Some("mode_example".to_string()), Some(56), Some("primary_host_example".to_string()), Some(56), Some(&Vec::new()), Some(true), Some(56), Some(true)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDe") => {
            let result = core.run(client.org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("handler_name_example".to_string()), Some("user_expiration_time_example".to_string()), Some(&Vec::new()), Some(&Vec::new()), Some("user_path_prefix_example".to_string()), Some("user_membership_exp_time_example".to_string()), Some(56), Some(true), Some(true), Some("group_expiration_time_example".to_string()), Some(&Vec::new()), Some(&Vec::new()), Some("group_path_prefix_example".to_string()), Some(true)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplEx") => {
            let result = core.run(client.org_apache_jackrabbit_oak_spi_security_authentication_external_impl_ex(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(56), Some("jaas_control_flag_example".to_string()), Some("jaas_realm_name_example".to_string()), Some("idp_name_example".to_string()), Some("sync_handler_name_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPr") => {
            let result = core.run(client.org_apache_jackrabbit_oak_spi_security_authentication_external_impl_pr(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(true)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfi") => {
            let result = core.run(client.org_apache_jackrabbit_oak_spi_security_authorization_cug_impl_cug_confi(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new()), Some(true), Some(56)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExclu") => {
            let result = core.run(client.org_apache_jackrabbit_oak_spi_security_authorization_cug_impl_cug_exclu(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizable") => {
            let result = core.run(client.org_apache_jackrabbit_oak_spi_security_user_action_default_authorizable(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("enabled_actions_example".to_string()), Some(&Vec::new()), Some(&Vec::new()), Some("constraint_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("OrgApacheJackrabbitVaultPackagingImplPackagingImpl") => {
            let result = core.run(client.org_apache_jackrabbit_vault_packaging_impl_packaging_impl(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistry") => {
            let result = core.run(client.org_apache_jackrabbit_vault_packaging_registry_impl_fs_package_registry(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("home_path_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("OrgApacheSlingAuthCoreImplLogoutServlet") => {
            let result = core.run(client.org_apache_sling_auth_core_impl_logout_servlet(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new()), Some("sling_servlet_paths_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("OrgApacheSlingCaconfigImplConfigurationBindingsValueProvider") => {
            let result = core.run(client.org_apache_sling_caconfig_impl_configuration_bindings_value_provider(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(true)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("OrgApacheSlingCaconfigImplConfigurationResolverImpl") => {
            let result = core.run(client.org_apache_sling_caconfig_impl_configuration_resolver_impl(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStra") => {
            let result = core.run(client.org_apache_sling_caconfig_impl_def_default_configuration_inheritance_stra(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(true), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStra") => {
            let result = core.run(client.org_apache_sling_caconfig_impl_def_default_configuration_persistence_stra(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(true)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProvi") => {
            let result = core.run(client.org_apache_sling_caconfig_impl_override_osgi_configuration_override_provi(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("description_example".to_string()), Some(&Vec::new()), Some(true), Some(56)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOve") => {
            let result = core.run(client.org_apache_sling_caconfig_impl_override_system_property_configuration_ove(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(true), Some(56)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("OrgApacheSlingCaconfigManagementImplConfigurationManagementSetti") => {
            let result = core.run(client.org_apache_sling_caconfig_management_impl_configuration_management_setti(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new()), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResour") => {
            let result = core.run(client.org_apache_sling_caconfig_resource_impl_def_default_configuration_resour(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(true), Some("config_path_example".to_string()), Some(&Vec::new()), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategy") => {
            let result = core.run(client.org_apache_sling_caconfig_resource_impl_def_default_context_path_strategy(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(true), Some(&Vec::new()), Some(&Vec::new()), Some(56)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParser") => {
            let result = core.run(client.org_apache_sling_commons_html_internal_tagsoup_html_parser(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("OrgApacheSlingCommonsLogLogManager") => {
            let result = core.run(client.org_apache_sling_commons_log_log_manager(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("org_apache_sling_commons_log_level_example".to_string()), Some("org_apache_sling_commons_log_file_example".to_string()), Some(56), Some("org_apache_sling_commons_log_file_size_example".to_string()), Some("org_apache_sling_commons_log_pattern_example".to_string()), Some("org_apache_sling_commons_log_configuration_file_example".to_string()), Some(true), Some(56), Some(56), Some(56)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("OrgApacheSlingCommonsLogLogManagerFactoryConfig") => {
            let result = core.run(client.org_apache_sling_commons_log_log_manager_factory_config(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("org_apache_sling_commons_log_level_example".to_string()), Some("org_apache_sling_commons_log_file_example".to_string()), Some("org_apache_sling_commons_log_pattern_example".to_string()), Some(&Vec::new()), Some(true)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("OrgApacheSlingCommonsLogLogManagerFactoryWriter") => {
            let result = core.run(client.org_apache_sling_commons_log_log_manager_factory_writer(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("org_apache_sling_commons_log_file_example".to_string()), Some(56), Some("org_apache_sling_commons_log_file_size_example".to_string()), Some(true)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("OrgApacheSlingCommonsMetricsInternalLogReporter") => {
            let result = core.run(client.org_apache_sling_commons_metrics_internal_log_reporter(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(56), Some("time_unit_example".to_string()), Some("level_example".to_string()), Some("logger_name_example".to_string()), Some("prefix_example".to_string()), Some("pattern_example".to_string()), Some("registry_name_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporter") => {
            let result = core.run(client.org_apache_sling_commons_metrics_rrd4j_impl_codahale_metrics_reporter(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new()), Some(56), Some(&Vec::new()), Some("path_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("OrgApacheSlingCommonsMimeInternalMimeTypeServiceImpl") => {
            let result = core.run(client.org_apache_sling_commons_mime_internal_mime_type_service_impl(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("OrgApacheSlingCommonsSchedulerImplQuartzScheduler") => {
            let result = core.run(client.org_apache_sling_commons_scheduler_impl_quartz_scheduler(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("pool_name_example".to_string()), Some(&Vec::new()), Some(true), Some(&Vec::new()), Some(56)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheck") => {
            let result = core.run(client.org_apache_sling_commons_scheduler_impl_scheduler_health_check(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(56)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactory") => {
            let result = core.run(client.org_apache_sling_commons_threads_impl_default_thread_pool_factory(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("name_example".to_string()), Some(56), Some(56), Some(56), Some(56), Some(56), Some("block_policy_example".to_string()), Some(true), Some(true), Some(56), Some("priority_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("OrgApacheSlingDatasourceDataSourceFactory") => {
            let result = core.run(client.org_apache_sling_datasource_data_source_factory(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("datasource_name_example".to_string()), Some("datasource_svc_prop_name_example".to_string()), Some("driver_class_name_example".to_string()), Some("url_example".to_string()), Some("username_example".to_string()), Some("password_example".to_string()), Some("default_auto_commit_example".to_string()), Some("default_read_only_example".to_string()), Some("default_transaction_isolation_example".to_string()), Some("default_catalog_example".to_string()), Some(56), Some(56), Some(56), Some(56), Some(56), Some(56), Some(true), Some(true), Some(true), Some("validation_query_example".to_string()), Some(56), Some(56), Some(56), Some("connection_properties_example".to_string()), Some("init_sql_example".to_string()), Some("jdbc_interceptors_example".to_string()), Some(56), Some(true), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("OrgApacheSlingDatasourceJNDIDataSourceFactory") => {
            let result = core.run(client.org_apache_sling_datasource_jndi_data_source_factory(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("datasource_name_example".to_string()), Some("datasource_svc_prop_name_example".to_string()), Some("datasource_jndi_name_example".to_string()), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("OrgApacheSlingDiscoveryOakConfig") => {
            let result = core.run(client.org_apache_sling_discovery_oak_config(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(56), Some(56), Some(56), Some(56), Some(56), Some(true), Some(56), Some(56), Some(56), Some(&Vec::new()), Some(&Vec::new()), Some(true), Some(true), Some(true), Some(true), Some("shared_key_example".to_string()), Some(56), Some("backoff_standby_factor_example".to_string()), Some("backoff_stable_factor_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheck") => {
            let result = core.run(client.org_apache_sling_discovery_oak_synchronized_clocks_health_check(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("hc_name_example".to_string()), Some(&Vec::new()), Some("hc_mbean_name_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("OrgApacheSlingDistributionAgentImplForwardDistributionAgentFacto") => {
            let result = core.run(client.org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("name_example".to_string()), Some("title_example".to_string()), Some("details_example".to_string()), Some(true), Some("service_name_example".to_string()), Some("log_level_example".to_string()), Some(&Vec::new()), Some(true), Some(&Vec::new()), Some(&Vec::new()), Some(&Vec::new()), Some("retry_strategy_example".to_string()), Some(56), Some("request_authorization_strategy_target_example".to_string()), Some("transport_secret_provider_target_example".to_string()), Some("package_builder_target_example".to_string()), Some("triggers_target_example".to_string()), Some("queue_provider_example".to_string()), Some(true), Some(56)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestA") => {
            let result = core.run(client.org_apache_sling_distribution_agent_impl_privilege_distribution_request_a(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("name_example".to_string()), Some("jcr_privilege_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactory") => {
            let result = core.run(client.org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("name_example".to_string()), Some("title_example".to_string()), Some("details_example".to_string()), Some(true), Some("service_name_example".to_string()), Some("log_level_example".to_string()), Some(&Vec::new()), Some("request_authorization_strategy_target_example".to_string()), Some("queue_provider_factory_target_example".to_string()), Some("package_builder_target_example".to_string()), Some("triggers_target_example".to_string()), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("OrgApacheSlingDistributionAgentImplReverseDistributionAgentFacto") => {
            let result = core.run(client.org_apache_sling_distribution_agent_impl_reverse_distribution_agent_facto(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("name_example".to_string()), Some("title_example".to_string()), Some("details_example".to_string()), Some(true), Some("service_name_example".to_string()), Some("log_level_example".to_string()), Some(true), Some(&Vec::new()), Some(56), Some(56), Some("request_authorization_strategy_target_example".to_string()), Some("transport_secret_provider_target_example".to_string()), Some("package_builder_target_example".to_string()), Some("triggers_target_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactor") => {
            let result = core.run(client.org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("name_example".to_string()), Some("title_example".to_string()), Some("details_example".to_string()), Some(true), Some("service_name_example".to_string()), Some("log_level_example".to_string()), Some(true), Some("package_exporter_target_example".to_string()), Some("package_importer_target_example".to_string()), Some("request_authorization_strategy_target_example".to_string()), Some("triggers_target_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactory") => {
            let result = core.run(client.org_apache_sling_distribution_agent_impl_sync_distribution_agent_factory(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("name_example".to_string()), Some("title_example".to_string()), Some("details_example".to_string()), Some(true), Some("service_name_example".to_string()), Some("log_level_example".to_string()), Some(true), Some(&Vec::new()), Some(&Vec::new()), Some(&Vec::new()), Some("retry_strategy_example".to_string()), Some(56), Some(56), Some(56), Some("request_authorization_strategy_target_example".to_string()), Some("transport_secret_provider_target_example".to_string()), Some("package_builder_target_example".to_string()), Some("triggers_target_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("OrgApacheSlingDistributionMonitorDistributionQueueHealthCheck") => {
            let result = core.run(client.org_apache_sling_distribution_monitor_distribution_queue_health_check(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("hc_name_example".to_string()), Some(&Vec::new()), Some("hc_mbean_name_example".to_string()), Some(56)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("OrgApacheSlingDistributionPackagingImplExporterAgentDistributio") => {
            let result = core.run(client.org_apache_sling_distribution_packaging_impl_exporter_agent_distributio(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("name_example".to_string()), Some("queue_example".to_string()), Some(true), Some("agent_target_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("OrgApacheSlingDistributionPackagingImplExporterLocalDistributio") => {
            let result = core.run(client.org_apache_sling_distribution_packaging_impl_exporter_local_distributio(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("name_example".to_string()), Some("package_builder_target_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("OrgApacheSlingDistributionPackagingImplExporterRemoteDistributi") => {
            let result = core.run(client.org_apache_sling_distribution_packaging_impl_exporter_remote_distributi(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("name_example".to_string()), Some(&Vec::new()), Some(56), Some("package_builder_target_example".to_string()), Some("transport_secret_provider_target_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("OrgApacheSlingDistributionPackagingImplImporterLocalDistributio") => {
            let result = core.run(client.org_apache_sling_distribution_packaging_impl_importer_local_distributio(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("name_example".to_string()), Some("package_builder_target_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("OrgApacheSlingDistributionPackagingImplImporterRemoteDistributi") => {
            let result = core.run(client.org_apache_sling_distribution_packaging_impl_importer_remote_distributi(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("name_example".to_string()), Some(&Vec::new()), Some("transport_secret_provider_target_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("OrgApacheSlingDistributionPackagingImplImporterRepositoryDistri") => {
            let result = core.run(client.org_apache_sling_distribution_packaging_impl_importer_repository_distri(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("name_example".to_string()), Some("service_name_example".to_string()), Some("path_example".to_string()), Some("privilege_name_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("OrgApacheSlingDistributionResourcesImplDistributionConfiguration") => {
            let result = core.run(client.org_apache_sling_distribution_resources_impl_distribution_configuration(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("provider_roots_example".to_string()), Some("kind_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("OrgApacheSlingDistributionResourcesImplDistributionServiceResour") => {
            let result = core.run(client.org_apache_sling_distribution_resources_impl_distribution_service_resour(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("provider_roots_example".to_string()), Some("kind_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("OrgApacheSlingDistributionSerializationImplDistributionPackageBu") => {
            let result = core.run(client.org_apache_sling_distribution_serialization_impl_distribution_package_bu(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("name_example".to_string()), Some("_type_example".to_string()), Some("format_target_example".to_string()), Some("temp_fs_folder_example".to_string()), Some(56), Some("memory_unit_example".to_string()), Some(true), Some("digest_algorithm_example".to_string()), Some(56), Some(56), Some(&Vec::new()), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("OrgApacheSlingDistributionSerializationImplVltVaultDistribution") => {
            let result = core.run(client.org_apache_sling_distribution_serialization_impl_vlt_vault_distribution(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("name_example".to_string()), Some("_type_example".to_string()), Some("import_mode_example".to_string()), Some("acl_handling_example".to_string()), Some("package_roots_example".to_string()), Some(&Vec::new()), Some(&Vec::new()), Some("temp_fs_folder_example".to_string()), Some(true), Some(56), Some(56), Some(56), Some("mega_bytes_example".to_string()), Some(true), Some("digest_algorithm_example".to_string()), Some(56), Some(&Vec::new()), Some(true)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("OrgApacheSlingDistributionTransportImplUserCredentialsDistributi") => {
            let result = core.run(client.org_apache_sling_distribution_transport_impl_user_credentials_distributi(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("name_example".to_string()), Some("username_example".to_string()), Some("password_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("OrgApacheSlingDistributionTriggerImplDistributionEventDistribute") => {
            let result = core.run(client.org_apache_sling_distribution_trigger_impl_distribution_event_distribute(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("name_example".to_string()), Some("path_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("OrgApacheSlingDistributionTriggerImplJcrEventDistributionTrigger") => {
            let result = core.run(client.org_apache_sling_distribution_trigger_impl_jcr_event_distribution_trigger(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("name_example".to_string()), Some("path_example".to_string()), Some(&Vec::new()), Some("service_name_example".to_string()), Some(true)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributi") => {
            let result = core.run(client.org_apache_sling_distribution_trigger_impl_persisted_jcr_event_distributi(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("name_example".to_string()), Some("path_example".to_string()), Some("service_name_example".to_string()), Some("nuggets_path_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrig") => {
            let result = core.run(client.org_apache_sling_distribution_trigger_impl_remote_event_distribution_trig(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("name_example".to_string()), Some("endpoint_example".to_string()), Some("transport_secret_provider_target_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("OrgApacheSlingDistributionTriggerImplResourceEventDistributionTr") => {
            let result = core.run(client.org_apache_sling_distribution_trigger_impl_resource_event_distribution_tr(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("name_example".to_string()), Some("path_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("OrgApacheSlingDistributionTriggerImplScheduledDistributionTrigge") => {
            let result = core.run(client.org_apache_sling_distribution_trigger_impl_scheduled_distribution_trigge(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("name_example".to_string()), Some("path_example".to_string()), Some("seconds_example".to_string()), Some("service_name_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("OrgApacheSlingEngineImplAuthSlingAuthenticator") => {
            let result = core.run(client.org_apache_sling_engine_impl_auth_sling_authenticator(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("osgi_http_whiteboard_context_select_example".to_string()), Some("osgi_http_whiteboard_listener_example".to_string()), Some("auth_sudo_cookie_example".to_string()), Some("auth_sudo_parameter_example".to_string()), Some(true), Some(&Vec::new()), Some("sling_auth_anonymous_user_example".to_string()), Some("sling_auth_anonymous_password_example".to_string()), Some("auth_http_example".to_string()), Some("auth_http_realm_example".to_string()), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilter") => {
            let result = core.run(client.org_apache_sling_engine_impl_debug_request_progress_tracker_log_filter(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new()), Some(56), Some(56), Some(true)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("OrgApacheSlingEngineImplLogRequestLogger") => {
            let result = core.run(client.org_apache_sling_engine_impl_log_request_logger(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("request_log_output_example".to_string()), Some(56), Some(true), Some("access_log_output_example".to_string()), Some(56), Some(true)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("OrgApacheSlingEngineImplLogRequestLoggerService") => {
            let result = core.run(client.org_apache_sling_engine_impl_log_request_logger_service(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("request_log_service_format_example".to_string()), Some("request_log_service_output_example".to_string()), Some(56), Some(true)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("OrgApacheSlingEngineImplSlingMainServlet") => {
            let result = core.run(client.org_apache_sling_engine_impl_sling_main_servlet(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(56), Some(56), Some(true), Some(56), Some(&Vec::new()), Some("sling_serverinfo_example".to_string()), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("OrgApacheSlingEngineParameters") => {
            let result = core.run(client.org_apache_sling_engine_parameters(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("sling_default_parameter_encoding_example".to_string()), Some(56), Some("file_location_example".to_string()), Some(56), Some(56), Some(56), Some(true)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("OrgApacheSlingEventImplEventingThreadPool") => {
            let result = core.run(client.org_apache_sling_event_impl_eventing_thread_pool(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(56)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("OrgApacheSlingEventImplJobsDefaultJobManager") => {
            let result = core.run(client.org_apache_sling_event_impl_jobs_default_job_manager(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("queue_priority_example".to_string()), Some(56), Some(56), Some(56)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("OrgApacheSlingEventImplJobsJcrPersistenceHandler") => {
            let result = core.run(client.org_apache_sling_event_impl_jobs_jcr_persistence_handler(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(true), Some(56), Some(56)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("OrgApacheSlingEventImplJobsJobConsumerManager") => {
            let result = core.run(client.org_apache_sling_event_impl_jobs_job_consumer_manager(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(true), Some(&Vec::new()), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("OrgApacheSlingEventJobsQueueConfiguration") => {
            let result = core.run(client.org_apache_sling_event_jobs_queue_configuration(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("queue_name_example".to_string()), Some(&Vec::new()), Some("queue_type_example".to_string()), Some("queue_priority_example".to_string()), Some(56), Some(56), Some(1.2), Some(true), Some(true), Some(56), Some(56)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingW") => {
            let result = core.run(client.org_apache_sling_extensions_webconsolesecurityprovider_internal_sling_w(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new()), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("OrgApacheSlingFeatureflagsFeature") => {
            let result = core.run(client.org_apache_sling_featureflags_feature(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("name_example".to_string()), Some("description_example".to_string()), Some(true)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("OrgApacheSlingFeatureflagsImplConfiguredFeature") => {
            let result = core.run(client.org_apache_sling_featureflags_impl_configured_feature(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("name_example".to_string()), Some("description_example".to_string()), Some(true)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("OrgApacheSlingHapiImplHApiUtilImpl") => {
            let result = core.run(client.org_apache_sling_hapi_impl_h_api_util_impl(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("org_apache_sling_hapi_tools_resourcetype_example".to_string()), Some("org_apache_sling_hapi_tools_collectionresourcetype_example".to_string()), Some(&Vec::new()), Some("org_apache_sling_hapi_tools_externalurl_example".to_string()), Some(true)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("OrgApacheSlingHcCoreImplCompositeHealthCheck") => {
            let result = core.run(client.org_apache_sling_hc_core_impl_composite_health_check(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("hc_name_example".to_string()), Some(&Vec::new()), Some("hc_mbean_name_example".to_string()), Some(&Vec::new()), Some(true)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImpl") => {
            let result = core.run(client.org_apache_sling_hc_core_impl_executor_health_check_executor_impl(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(56), Some(56), Some(56)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("OrgApacheSlingHcCoreImplJmxAttributeHealthCheck") => {
            let result = core.run(client.org_apache_sling_hc_core_impl_jmx_attribute_health_check(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("hc_name_example".to_string()), Some(&Vec::new()), Some("hc_mbean_name_example".to_string()), Some("mbean_name_example".to_string()), Some("attribute_name_example".to_string()), Some("attribute_value_constraint_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("OrgApacheSlingHcCoreImplScriptableHealthCheck") => {
            let result = core.run(client.org_apache_sling_hc_core_impl_scriptable_health_check(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("hc_name_example".to_string()), Some(&Vec::new()), Some("hc_mbean_name_example".to_string()), Some("expression_example".to_string()), Some("language_extension_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("OrgApacheSlingHcCoreImplServletHealthCheckExecutorServlet") => {
            let result = core.run(client.org_apache_sling_hc_core_impl_servlet_health_check_executor_servlet(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("servlet_path_example".to_string()), Some(true), Some("cors_access_control_allow_origin_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializer") => {
            let result = core.run(client.org_apache_sling_hc_core_impl_servlet_result_txt_verbose_serializer(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(56), Some(56), Some(56), Some(56)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("OrgApacheSlingI18nImplI18NFilter") => {
            let result = core.run(client.org_apache_sling_i18n_impl_i18_n_filter(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(56), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("OrgApacheSlingI18nImplJcrResourceBundleProvider") => {
            let result = core.run(client.org_apache_sling_i18n_impl_jcr_resource_bundle_provider(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("locale_default_example".to_string()), Some(true), Some(56)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("OrgApacheSlingInstallerProviderJcrImplJcrInstaller") => {
            let result = core.run(client.org_apache_sling_installer_provider_jcr_impl_jcr_installer(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new()), Some("sling_jcrinstall_folder_name_regexp_example".to_string()), Some(56), Some(&Vec::new()), Some("sling_jcrinstall_new_config_path_example".to_string()), Some("sling_jcrinstall_signal_path_example".to_string()), Some(true)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("OrgApacheSlingJcrBaseInternalLoginAdminWhitelist") => {
            let result = core.run(client.org_apache_sling_jcr_base_internal_login_admin_whitelist(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(true), Some("whitelist_bundles_regexp_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragment") => {
            let result = core.run(client.org_apache_sling_jcr_base_internal_login_admin_whitelist_fragment(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("whitelist_name_example".to_string()), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("OrgApacheSlingJcrDavexImplServletsSlingDavExServlet") => {
            let result = core.run(client.org_apache_sling_jcr_davex_impl_servlets_sling_dav_ex_servlet(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("alias_example".to_string()), Some(true), Some("dav_protectedhandlers_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupport") => {
            let result = core.run(client.org_apache_sling_jcr_jackrabbit_server_jndi_registration_support(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("java_naming_factory_initial_example".to_string()), Some("java_naming_provider_url_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupport") => {
            let result = core.run(client.org_apache_sling_jcr_jackrabbit_server_rmi_registration_support(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(56)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("OrgApacheSlingJcrRepoinitImplRepositoryInitializer") => {
            let result = core.run(client.org_apache_sling_jcr_repoinit_impl_repository_initializer(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("OrgApacheSlingJcrRepoinitRepositoryInitializer") => {
            let result = core.run(client.org_apache_sling_jcr_repoinit_repository_initializer(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new()), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImpl") => {
            let result = core.run(client.org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new()), Some(true), Some(true), Some(&Vec::new()), Some(&Vec::new()), Some(&Vec::new()), Some(&Vec::new()), Some("resource_resolver_map_location_example".to_string()), Some(&Vec::new()), Some(56), Some(true), Some(56), Some(true), Some(56), Some(true), Some(&Vec::new()), Some(&Vec::new()), Some(true), Some(true), Some(true), Some(true)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("OrgApacheSlingJcrResourceInternalJcrSystemUserValidator") => {
            let result = core.run(client.org_apache_sling_jcr_resource_internal_jcr_system_user_validator(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(true)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactory") => {
            let result = core.run(client.org_apache_sling_jcr_resourcesecurity_impl_resource_access_gate_factory(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("path_example".to_string()), Some("checkpath_prefix_example".to_string()), Some("jcr_path_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerService") => {
            let result = core.run(client.org_apache_sling_jcr_webdav_impl_handler_default_handler_service(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(56), Some("type_collections_example".to_string()), Some("type_noncollections_example".to_string()), Some("type_content_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServic") => {
            let result = core.run(client.org_apache_sling_jcr_webdav_impl_handler_dir_listing_export_handler_servic(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(56)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServlet") => {
            let result = core.run(client.org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("dav_root_example".to_string()), Some(true), Some("dav_realm_example".to_string()), Some(&Vec::new()), Some(&Vec::new()), Some("filter_types_example".to_string()), Some("filter_uris_example".to_string()), Some("type_collections_example".to_string()), Some("type_noncollections_example".to_string()), Some("type_content_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("OrgApacheSlingJmxProviderImplJMXResourceProvider") => {
            let result = core.run(client.org_apache_sling_jmx_provider_impl_jmx_resource_provider(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("provider_roots_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("OrgApacheSlingModelsImplModelAdapterFactory") => {
            let result = core.run(client.org_apache_sling_models_impl_model_adapter_factory(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("osgi_http_whiteboard_listener_example".to_string()), Some("osgi_http_whiteboard_context_select_example".to_string()), Some(56), Some(56)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("OrgApacheSlingModelsJacksonexporterImplResourceModuleProvider") => {
            let result = core.run(client.org_apache_sling_models_jacksonexporter_impl_resource_module_provider(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(56)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFacto") => {
            let result = core.run(client.org_apache_sling_resource_inventory_impl_resource_inventory_printer_facto(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("felix_inventory_printer_name_example".to_string()), Some("felix_inventory_printer_title_example".to_string()), Some("path_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("OrgApacheSlingResourcemergerImplMergedResourceProviderFactory") => {
            let result = core.run(client.org_apache_sling_resourcemerger_impl_merged_resource_provider_factory(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("merge_root_example".to_string()), Some(true)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("OrgApacheSlingResourcemergerPickerOverriding") => {
            let result = core.run(client.org_apache_sling_resourcemerger_picker_overriding(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("merge_root_example".to_string()), Some(true)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("OrgApacheSlingScriptingCoreImplScriptCacheImpl") => {
            let result = core.run(client.org_apache_sling_scripting_core_impl_script_cache_impl(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(56), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("OrgApacheSlingScriptingCoreImplScriptingResourceResolverProvider") => {
            let result = core.run(client.org_apache_sling_scripting_core_impl_scripting_resource_resolver_provider(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(true)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("OrgApacheSlingScriptingJavaImplJavaScriptEngineFactory") => {
            let result = core.run(client.org_apache_sling_scripting_java_impl_java_script_engine_factory(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(true), Some("java_java_encoding_example".to_string()), Some("java_compiler_source_vm_example".to_string()), Some("java_compiler_target_vm_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFa") => {
            let result = core.run(client.org_apache_sling_scripting_javascript_internal_rhino_java_script_engine_fa(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(56)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("OrgApacheSlingScriptingJspJspScriptEngineFactory") => {
            let result = core.run(client.org_apache_sling_scripting_jsp_jsp_script_engine_factory(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("jasper_compiler_target_vm_example".to_string()), Some("jasper_compiler_source_vm_example".to_string()), Some(true), Some(true), Some("jasper_ie_class_id_example".to_string()), Some(true), Some(true), Some(true), Some(true), Some(true), Some(true)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProv") => {
            let result = core.run(client.org_apache_sling_scripting_sightly_js_impl_jsapi_sly_bindings_values_prov(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("OrgApacheSlingSecurityImplContentDispositionFilter") => {
            let result = core.run(client.org_apache_sling_security_impl_content_disposition_filter(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new()), Some(&Vec::new()), Some(true)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("OrgApacheSlingSecurityImplReferrerFilter") => {
            let result = core.run(client.org_apache_sling_security_impl_referrer_filter(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(true), Some(&Vec::new()), Some(&Vec::new()), Some(&Vec::new()), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("OrgApacheSlingServiceusermappingImplServiceUserMapperImpl") => {
            let result = core.run(client.org_apache_sling_serviceusermapping_impl_service_user_mapper_impl(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new()), Some("user_default_example".to_string()), Some(true), Some(true)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmended") => {
            let result = core.run(client.org_apache_sling_serviceusermapping_impl_service_user_mapper_impl_amended(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(56), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("OrgApacheSlingServletsGetDefaultGetServlet") => {
            let result = core.run(client.org_apache_sling_servlets_get_default_get_servlet(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new()), Some(true), Some(&Vec::new()), Some(true), Some(true), Some(true), Some(true), Some(56), Some(true)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("OrgApacheSlingServletsGetImplVersionVersionInfoServlet") => {
            let result = core.run(client.org_apache_sling_servlets_get_impl_version_version_info_servlet(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new()), Some(true)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("OrgApacheSlingServletsPostImplHelperChunkCleanUpTask") => {
            let result = core.run(client.org_apache_sling_servlets_post_impl_helper_chunk_clean_up_task(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("scheduler_expression_example".to_string()), Some(true), Some(56)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("OrgApacheSlingServletsPostImplSlingPostServlet") => {
            let result = core.run(client.org_apache_sling_servlets_post_impl_sling_post_servlet(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new()), Some(&Vec::new()), Some(56), Some(true), Some(true), Some(true), Some("servlet_post_ignore_pattern_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("OrgApacheSlingServletsResolverSlingServletResolver") => {
            let result = core.run(client.org_apache_sling_servlets_resolver_sling_servlet_resolver(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("servletresolver_servlet_root_example".to_string()), Some(56), Some(&Vec::new()), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("OrgApacheSlingSettingsImplSlingSettingsServiceImpl") => {
            let result = core.run(client.org_apache_sling_settings_impl_sling_settings_service_impl(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("sling_name_example".to_string()), Some("sling_description_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("OrgApacheSlingStartupfilterImplStartupFilterImpl") => {
            let result = core.run(client.org_apache_sling_startupfilter_impl_startup_filter_impl(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(true), Some("default_message_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("OrgApacheSlingTenantInternalTenantProviderImpl") => {
            let result = core.run(client.org_apache_sling_tenant_internal_tenant_provider_impl(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("tenant_root_example".to_string()), Some(&Vec::new())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("OrgApacheSlingTracerInternalLogTracer") => {
            let result = core.run(client.org_apache_sling_tracer_internal_log_tracer(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some(&Vec::new()), Some(true), Some(true), Some(56), Some(56), Some(true), Some(true)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("OrgApacheSlingXssImplXSSFilterImpl") => {
            let result = core.run(client.org_apache_sling_xss_impl_xss_filter_impl(Some(true), Some(true), Some(true), Some("action_example".to_string()), Some("location_example".to_string()), Some(&Vec::new()), Some("policy_path_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        _ => {
            panic!("Invalid operation provided")
        }
    }
}

