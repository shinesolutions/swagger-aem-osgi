//! Main library entry point for openapi_client implementation.

#![allow(unused_imports)]

use async_trait::async_trait;
use futures::{future, Stream, StreamExt, TryFutureExt, TryStreamExt};
use hyper::server::conn::http1;
use hyper_util::rt::TokioIo;
use hyper::service::{service_fn, Service};
use log::info;
use std::future::Future;
use std::marker::PhantomData;
use std::net::SocketAddr;
use std::sync::{Arc, Mutex};
use std::task::{Context, Poll};
use swagger::{Has, XSpanIdString};
use swagger::auth::MakeAllowAllAuthenticator;
use swagger::EmptyContext;
use tokio::net::TcpListener;

#[cfg(not(any(target_os = "macos", target_os = "windows", target_os = "ios")))]
use openssl::ssl::{Ssl, SslAcceptor, SslAcceptorBuilder, SslFiletype, SslMethod};

use openapi_client::models;

/// Builds an SSL implementation for Simple HTTPS from some hard-coded file names
pub async fn create(addr: &str, https: bool) {
    let addr: SocketAddr = addr.parse().expect("Failed to parse bind address");
    let listener = TcpListener::bind(&addr).await.unwrap();

    let server = Server::new();

    let service = MakeService::new(server);
    let service = MakeAllowAllAuthenticator::new(service, "cosmo");

    #[allow(unused_mut)]
    let mut service =
        openapi_client::server::context::MakeAddContext::<_, EmptyContext>::new(
            service
        );

    if https {
        #[cfg(any(target_os = "macos", target_os = "windows", target_os = "ios"))]
        {
            unimplemented!("SSL is not implemented for the examples on MacOS, Windows or iOS");
        }

        #[cfg(not(any(target_os = "macos", target_os = "windows", target_os = "ios")))]
        {
            let mut ssl = SslAcceptor::mozilla_intermediate_v5(SslMethod::tls()).expect("Failed to create SSL Acceptor");

            // Server authentication
            ssl.set_private_key_file("examples/server-key.pem", SslFiletype::PEM).expect("Failed to set private key");
            ssl.set_certificate_chain_file("examples/server-chain.pem").expect("Failed to set certificate chain");
            ssl.check_private_key().expect("Failed to check private key");

            let tls_acceptor = ssl.build();

            info!("Starting a server (with https)");
            loop {
                if let Ok((tcp, addr)) = listener.accept().await {
                    let ssl = Ssl::new(tls_acceptor.context()).unwrap();
                    let service = service.call(addr);

                    tokio::spawn(async move {
                        let tls = tokio_openssl::SslStream::new(ssl, tcp).map_err(|_| ())?;
                        let service = service.await.map_err(|_| ())?;

                        http1::Builder::new()
                            .serve_connection(TokioIo::new(tls), service)
                            .await
                            .map_err(|_| ())
                    });
                }
            }
        }
    } else {
        info!("Starting a server (over http, so no TLS)");
        println!("Listening on http://{}", addr);

        loop {
            // When an incoming TCP connection is received grab a TCP stream for
            // client<->server communication.
            //
            // Note, this is a .await point, this loop will loop forever but is not a busy loop. The
            // .await point allows the Tokio runtime to pull the task off of the thread until the task
            // has work to do. In this case, a connection arrives on the port we are listening on and
            // the task is woken up, at which point the task is then put back on a thread, and is
            // driven forward by the runtime, eventually yielding a TCP stream.
            let (tcp_stream, addr) = listener.accept().await.expect("Failed to accept connection");

            let service = service.call(addr).await.unwrap();
            let io = TokioIo::new(tcp_stream);
            // Spin up a new task in Tokio so we can continue to listen for new TCP connection on the
            // current task without waiting for the processing of the HTTP1 connection we just received
            // to finish
            tokio::task::spawn(async move {
                // Handle the connection from the client using HTTP1 and pass any
                // HTTP requests received on that connection to the `hello` function
                let result = http1::Builder::new()
                    .serve_connection(io, service)
                    .await;
                if let Err(err) = result
                {
                    println!("Error serving connection: {err:?}");
                }
            });
        }
    }
}

#[derive(Copy)]
pub struct Server<C> {
    marker: PhantomData<C>,
}

impl<C> Server<C> {
    pub fn new() -> Self {
        Server{marker: PhantomData}
    }
}

impl<C> Clone for Server<C> {
    fn clone(&self) -> Self {
        Self {
            marker: PhantomData,
        }
    }
}


use jsonwebtoken::{decode, encode, errors::Error as JwtError, Algorithm, DecodingKey, EncodingKey, Header, TokenData, Validation};
use serde::{Deserialize, Serialize};
use swagger::auth::Authorization;
use crate::server_auth;


use openapi_client::{
    Api,
    AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationResponse,
    AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurResponse,
    AnalyticsComponentQueryCacheServiceResponse,
    ApacheSlingHealthCheckResultHtmlSerializerResponse,
    ComAdobeAemFormsndocumentsConfigAemFormsManagerConfigurationResponse,
    ComAdobeAemTransactionCoreImplTransactionRecorderResponse,
    ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHcResponse,
    ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHcResponse,
    ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplResponse,
    ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplResponse,
    ComAdobeCqAccountApiAccountManagementServiceResponse,
    ComAdobeCqAccountImplAccountManagementServletResponse,
    ComAdobeCqAddressImplLocationLocationListServletResponse,
    ComAdobeCqAuditPurgeDamResponse,
    ComAdobeCqAuditPurgePagesResponse,
    ComAdobeCqAuditPurgeReplicationResponse,
    ComAdobeCqCdnRewriterImplAwsCloudFrontRewriterResponse,
    ComAdobeCqCdnRewriterImplCdnConfigServiceImplResponse,
    ComAdobeCqCdnRewriterImplCdnRewriterResponse,
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
    ComAdobeCqDamMacSyncHelperImplMacSyncClientImplResponse,
    ComAdobeCqDamMacSyncImplDamSyncServiceImplResponse,
    ComAdobeCqDamProcessorNuiImplNuiAssetProcessorResponse,
    ComAdobeCqDamS7imagingImplIsImageServerComponentResponse,
    ComAdobeCqDamS7imagingImplPsPlatformServerServletResponse,
    ComAdobeCqDamWebdavImplIoAssetIoHandlerResponse,
    ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobResponse,
    ComAdobeCqDamWebdavImplIoSpecialFilesHandlerResponse,
    ComAdobeCqDeserfwImplDeserializationFirewallImplResponse,
    ComAdobeCqDtmImplServiceDtmWebServiceImplResponse,
    ComAdobeCqDtmImplServletsDtmDeployHookServletResponse,
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
    ComAdobeCqScreensMqActivemqImplArtemisJmsProviderResponse,
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
    ComAdobeCqSocialCommonsCorsCorsAuthenticationFilterResponse,
    ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderResponse,
    ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplResponse,
    ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerResponse,
    ComAdobeCqSocialCommonsEmailreplyImplCustomEmailClientProviderResponse,
    ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpResponse,
    ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpResponse,
    ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterResponse,
    ComAdobeCqSocialCommonsEmailreplyImplGmailEmailClientProviderResponse,
    ComAdobeCqSocialCommonsEmailreplyImplIosEmailClientProviderResponse,
    ComAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProviderResponse,
    ComAdobeCqSocialCommonsEmailreplyImplOutLookEmailClientProviderResponse,
    ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderResponse,
    ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderResponse,
    ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUgcImageUploadResponse,
    ComAdobeCqSocialCommonsUgclimiterImplUgcLimiterServiceImplResponse,
    ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUgcLimitResponse,
    ComAdobeCqSocialConnectOauthImplFacebookProviderImplResponse,
    ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleResponse,
    ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperResponse,
    ComAdobeCqSocialConnectOauthImplTwitterProviderImplResponse,
    ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenResponse,
    ComAdobeCqSocialDatastoreAsImplAsResourceProviderFactoryResponse,
    ComAdobeCqSocialDatastoreOpImplSocialMsResourceProviderFactoryResponse,
    ComAdobeCqSocialDatastoreRdbImplSocialRdbResourceProviderFactorResponse,
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
    ComAdobeCqSocialTranslationImplUgcLanguageDetectorResponse,
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
    ComAdobeCqUiWcmCommonsInternalServletsRteRteFilterServletFactResponse,
    ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupResponse,
    ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupResponse,
    ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceResponse,
    ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskResponse,
    ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceResponse,
    ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceResponse,
    ComAdobeCqWcmLaunchesImplLaunchesEventHandlerResponse,
    ComAdobeCqWcmMobileQrcodeServletQrCodeImageGeneratorResponse,
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
    ComAdobeGraniteAuthImsImplImsAccessTokenRequestCustomizerImplResponse,
    ComAdobeGraniteAuthImsImplImsConfigProviderImplResponse,
    ComAdobeGraniteAuthImsImplImsInstanceCredentialsValidatorResponse,
    ComAdobeGraniteAuthImsImplImsProviderImplResponse,
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
    ComAdobeGraniteCorsImplCorsPolicyImplResponse,
    ComAdobeGraniteCsrfImplCsrfFilterResponse,
    ComAdobeGraniteCsrfImplCsrfServletResponse,
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
    ComAdobeGraniteRepositoryHcImplContinuousRgcHealthCheckResponse,
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
    ComAdobeGraniteRestImplServletDefaultGetServletResponse,
    ComAdobeGraniteSecurityUserUiInternalServletsSslConfigurationSResponse,
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
    ComAdobeXmpWorkerFilesNcommXmpFilesNCommResponse,
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
    ComDayCqDamCoreImplCacheCqBufferedImageCacheResponse,
    ComDayCqDamCoreImplDamChangeEventListenerResponse,
    ComDayCqDamCoreImplDamEventPurgeServiceResponse,
    ComDayCqDamCoreImplDamEventRecorderImplResponse,
    ComDayCqDamCoreImplEventDamEventAuditListenerResponse,
    ComDayCqDamCoreImplExpiryNotificationJobImplResponse,
    ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatResponse,
    ComDayCqDamCoreImplGfxCommonsGfxRendererResponse,
    ComDayCqDamCoreImplHandlerEpsFormatHandlerResponse,
    ComDayCqDamCoreImplHandlerIndesignFormatHandlerResponse,
    ComDayCqDamCoreImplHandlerJpegHandlerResponse,
    ComDayCqDamCoreImplHandlerXmpNCommXmpHandlerResponse,
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
    ComDayCqDamCoreImplServletAssetXmpSearchServletResponse,
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
    ComDayCqDamIdsImplIdsJobProcessorResponse,
    ComDayCqDamIdsImplIdsPoolManagerImplResponse,
    ComDayCqDamInddImplHandlerIndesignXmpHandlerResponse,
    ComDayCqDamInddImplServletSnippetCreationServletResponse,
    ComDayCqDamInddProcessInddMediaExtractProcessResponse,
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
    ComDayCqDamScene7ImplScene7ApiClientImplResponse,
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
    ComDayCqMcmImplMcmConfigurationResponse,
    ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenResponse,
    ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougResponse,
    ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCtaComponentResponse,
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
    ComDayCqSecurityAclSetupResponse,
    ComDayCqStatisticsImplStatisticsServiceImplResponse,
    ComDayCqTaggingImplJcrTagManagerFactoryImplResponse,
    ComDayCqTaggingImplSearchTagPredicateEvaluatorResponse,
    ComDayCqTaggingImplTagGarbageCollectorResponse,
    ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerResponse,
    ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorResponse,
    ComDayCqWcmCoreImplAuthoringUiModeServiceImplResponse,
    ComDayCqWcmCoreImplCommandsWcmCommandServletResponse,
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
    ComDayCqWcmCoreImplWarpTimeWarpFilterResponse,
    ComDayCqWcmCoreImplWcmDebugFilterResponse,
    ComDayCqWcmCoreImplWcmDeveloperModeFilterResponse,
    ComDayCqWcmCoreMvtMvtStatisticsImplResponse,
    ComDayCqWcmCoreStatsPageViewStatisticsImplResponse,
    ComDayCqWcmCoreWcmRequestFilterResponse,
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
    ComDayCqWcmFoundationImplHttpAuthHandlerResponse,
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
    ComDayCqWcmScriptingImplBvpManagerResponse,
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
    OrgApacheJackrabbitVaultPackagingRegistryImplFsPackageRegistryResponse,
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
    OrgApacheSlingDatasourceJndiDataSourceFactoryResponse,
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
    OrgApacheSlingJmxProviderImplJmxResourceProviderResponse,
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
    OrgApacheSlingXssImplXssFilterImplResponse,
};
use openapi_client::server::MakeService;
use std::error::Error;
use swagger::ApiError;

#[async_trait]
impl<C> Api<C> for Server<C> where C: Has<XSpanIdString> + Send + Sync
{
    async fn adaptive_form_and_interactive_communication_web_channel_configuration(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        show_placeholder: Option<bool>,
        maximum_cache_entries: Option<i32>,
        af_scripting_compatversion: Option<String>,
        make_file_name_unique: Option<bool>,
        generating_compliant_data: Option<bool>,
        context: &C) -> Result<AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationResponse, ApiError>
    {
        info!("adaptive_form_and_interactive_communication_web_channel_configuration({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, show_placeholder, maximum_cache_entries, af_scripting_compatversion, make_file_name_unique, generating_compliant_data, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn adaptive_form_and_interactive_communication_web_channel_theme_configur(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        font_list: Option<&Vec<String>>,
        context: &C) -> Result<AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurResponse, ApiError>
    {
        info!("adaptive_form_and_interactive_communication_web_channel_theme_configur({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, font_list, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn analytics_component_query_cache_service(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        cq_analytics_component_query_cache_size: Option<i32>,
        context: &C) -> Result<AnalyticsComponentQueryCacheServiceResponse, ApiError>
    {
        info!("analytics_component_query_cache_service({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, cq_analytics_component_query_cache_size, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn apache_sling_health_check_result_html_serializer(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        style_string: Option<String>,
        context: &C) -> Result<ApacheSlingHealthCheckResultHtmlSerializerResponse, ApiError>
    {
        info!("apache_sling_health_check_result_html_serializer({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, style_string, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_aem_formsndocuments_config_aem_forms_manager_configuration(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        forms_manager_config_include_ootb_templates: Option<bool>,
        forms_manager_config_include_deprecated_templates: Option<bool>,
        context: &C) -> Result<ComAdobeAemFormsndocumentsConfigAemFormsManagerConfigurationResponse, ApiError>
    {
        info!("com_adobe_aem_formsndocuments_config_aem_forms_manager_configuration({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, forms_manager_config_include_ootb_templates, forms_manager_config_include_deprecated_templates, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_aem_transaction_core_impl_transaction_recorder(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        is_transaction_recording_enabled: Option<bool>,
        context: &C) -> Result<ComAdobeAemTransactionCoreImplTransactionRecorderResponse, ApiError>
    {
        info!("com_adobe_aem_transaction_core_impl_transaction_recorder({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, is_transaction_recording_enabled, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_aem_upgrade_prechecks_hc_impl_deprecate_indexes_hc(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        hc_name: Option<String>,
        hc_tags: Option<&Vec<String>>,
        hc_mbean_name: Option<String>,
        context: &C) -> Result<ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHcResponse, ApiError>
    {
        info!("com_adobe_aem_upgrade_prechecks_hc_impl_deprecate_indexes_hc({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, hc_name, hc_tags, hc_mbean_name, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_aem_upgrade_prechecks_hc_impl_replication_agents_disabled_hc(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        hc_name: Option<String>,
        hc_tags: Option<&Vec<String>>,
        hc_mbean_name: Option<String>,
        context: &C) -> Result<ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHcResponse, ApiError>
    {
        info!("com_adobe_aem_upgrade_prechecks_hc_impl_replication_agents_disabled_hc({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, hc_name, hc_tags, hc_mbean_name, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_aem_upgrade_prechecks_mbean_impl_pre_upgrade_tasks_m_bean_impl(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        pre_upgrade_maintenance_tasks: Option<&Vec<String>>,
        pre_upgrade_hc_tags: Option<&Vec<String>>,
        context: &C) -> Result<ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplResponse, ApiError>
    {
        info!("com_adobe_aem_upgrade_prechecks_mbean_impl_pre_upgrade_tasks_m_bean_impl({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, pre_upgrade_maintenance_tasks, pre_upgrade_hc_tags, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_aem_upgrade_prechecks_tasks_impl_consistency_check_task_impl(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        root_path: Option<String>,
        fix_inconsistencies: Option<bool>,
        context: &C) -> Result<ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplResponse, ApiError>
    {
        info!("com_adobe_aem_upgrade_prechecks_tasks_impl_consistency_check_task_impl({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, root_path, fix_inconsistencies, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_cq_account_api_account_management_service(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        cq_accountmanager_token_validity_period: Option<i32>,
        cq_accountmanager_config_requestnewaccount_mail: Option<String>,
        cq_accountmanager_config_requestnewpwd_mail: Option<String>,
        context: &C) -> Result<ComAdobeCqAccountApiAccountManagementServiceResponse, ApiError>
    {
        info!("com_adobe_cq_account_api_account_management_service({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, cq_accountmanager_token_validity_period, cq_accountmanager_config_requestnewaccount_mail, cq_accountmanager_config_requestnewpwd_mail, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_cq_account_impl_account_management_servlet(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        cq_accountmanager_config_informnewaccount_mail: Option<String>,
        cq_accountmanager_config_informnewpwd_mail: Option<String>,
        context: &C) -> Result<ComAdobeCqAccountImplAccountManagementServletResponse, ApiError>
    {
        info!("com_adobe_cq_account_impl_account_management_servlet({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, cq_accountmanager_config_informnewaccount_mail, cq_accountmanager_config_informnewpwd_mail, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_cq_address_impl_location_location_list_servlet(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        cq_address_location_default_max_results: Option<i32>,
        context: &C) -> Result<ComAdobeCqAddressImplLocationLocationListServletResponse, ApiError>
    {
        info!("com_adobe_cq_address_impl_location_location_list_servlet({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, cq_address_location_default_max_results, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_cq_audit_purge_dam(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        auditlog_rule_name: Option<String>,
        auditlog_rule_contentpath: Option<String>,
        auditlog_rule_minimumage: Option<i32>,
        auditlog_rule_types: Option<String>,
        context: &C) -> Result<ComAdobeCqAuditPurgeDamResponse, ApiError>
    {
        info!("com_adobe_cq_audit_purge_dam({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, auditlog_rule_name, auditlog_rule_contentpath, auditlog_rule_minimumage, auditlog_rule_types, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_cq_audit_purge_pages(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        auditlog_rule_name: Option<String>,
        auditlog_rule_contentpath: Option<String>,
        auditlog_rule_minimumage: Option<i32>,
        auditlog_rule_types: Option<String>,
        context: &C) -> Result<ComAdobeCqAuditPurgePagesResponse, ApiError>
    {
        info!("com_adobe_cq_audit_purge_pages({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, auditlog_rule_name, auditlog_rule_contentpath, auditlog_rule_minimumage, auditlog_rule_types, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_cq_audit_purge_replication(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        auditlog_rule_name: Option<String>,
        auditlog_rule_contentpath: Option<String>,
        auditlog_rule_minimumage: Option<i32>,
        auditlog_rule_types: Option<String>,
        context: &C) -> Result<ComAdobeCqAuditPurgeReplicationResponse, ApiError>
    {
        info!("com_adobe_cq_audit_purge_replication({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, auditlog_rule_name, auditlog_rule_contentpath, auditlog_rule_minimumage, auditlog_rule_types, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_cq_cdn_rewriter_impl_aws_cloud_front_rewriter(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        service_ranking: Option<i32>,
        keypair_id: Option<String>,
        keypair_alias: Option<String>,
        cdnrewriter_attributes: Option<&Vec<String>>,
        cdn_rewriter_distribution_domain: Option<String>,
        context: &C) -> Result<ComAdobeCqCdnRewriterImplAwsCloudFrontRewriterResponse, ApiError>
    {
        info!("com_adobe_cq_cdn_rewriter_impl_aws_cloud_front_rewriter({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, service_ranking, keypair_id, keypair_alias, cdnrewriter_attributes, cdn_rewriter_distribution_domain, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_cq_cdn_rewriter_impl_cdn_config_service_impl(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        cdn_config_distribution_domain: Option<String>,
        cdn_config_enable_rewriting: Option<bool>,
        cdn_config_path_prefixes: Option<&Vec<String>>,
        cdn_config_cdnttl: Option<i32>,
        cdn_config_application_protocol: Option<String>,
        context: &C) -> Result<ComAdobeCqCdnRewriterImplCdnConfigServiceImplResponse, ApiError>
    {
        info!("com_adobe_cq_cdn_rewriter_impl_cdn_config_service_impl({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, cdn_config_distribution_domain, cdn_config_enable_rewriting, cdn_config_path_prefixes, cdn_config_cdnttl, cdn_config_application_protocol, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_cq_cdn_rewriter_impl_cdn_rewriter(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        service_ranking: Option<i32>,
        cdnrewriter_attributes: Option<&Vec<String>>,
        cdn_rewriter_distribution_domain: Option<String>,
        context: &C) -> Result<ComAdobeCqCdnRewriterImplCdnRewriterResponse, ApiError>
    {
        info!("com_adobe_cq_cdn_rewriter_impl_cdn_rewriter({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, service_ranking, cdnrewriter_attributes, cdn_rewriter_distribution_domain, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_cq_cloudconfig_core_impl_configuration_replication_event_handle(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        flush_agents: Option<&Vec<String>>,
        context: &C) -> Result<ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleResponse, ApiError>
    {
        info!("com_adobe_cq_cloudconfig_core_impl_configuration_replication_event_handle({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, flush_agents, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_cq_commerce_impl_asset_dynamic_image_handler(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        cq_commerce_asset_handler_active: Option<bool>,
        cq_commerce_asset_handler_name: Option<String>,
        context: &C) -> Result<ComAdobeCqCommerceImplAssetDynamicImageHandlerResponse, ApiError>
    {
        info!("com_adobe_cq_commerce_impl_asset_dynamic_image_handler({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, cq_commerce_asset_handler_active, cq_commerce_asset_handler_name, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_cq_commerce_impl_asset_product_asset_handler_provider_impl(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        cq_commerce_asset_handler_fallback: Option<String>,
        context: &C) -> Result<ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplResponse, ApiError>
    {
        info!("com_adobe_cq_commerce_impl_asset_product_asset_handler_provider_impl({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, cq_commerce_asset_handler_fallback, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_cq_commerce_impl_asset_static_image_handler(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        cq_commerce_asset_handler_active: Option<bool>,
        cq_commerce_asset_handler_name: Option<String>,
        context: &C) -> Result<ComAdobeCqCommerceImplAssetStaticImageHandlerResponse, ApiError>
    {
        info!("com_adobe_cq_commerce_impl_asset_static_image_handler({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, cq_commerce_asset_handler_active, cq_commerce_asset_handler_name, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_cq_commerce_impl_asset_video_handler(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        cq_commerce_asset_handler_active: Option<bool>,
        cq_commerce_asset_handler_name: Option<String>,
        context: &C) -> Result<ComAdobeCqCommerceImplAssetVideoHandlerResponse, ApiError>
    {
        info!("com_adobe_cq_commerce_impl_asset_video_handler({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, cq_commerce_asset_handler_active, cq_commerce_asset_handler_name, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_cq_commerce_impl_promotion_promotion_manager_impl(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        cq_commerce_promotion_root: Option<String>,
        context: &C) -> Result<ComAdobeCqCommerceImplPromotionPromotionManagerImplResponse, ApiError>
    {
        info!("com_adobe_cq_commerce_impl_promotion_promotion_manager_impl({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, cq_commerce_promotion_root, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_cq_commerce_pim_impl_cataloggenerator_catalog_generator_impl(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        cq_commerce_cataloggenerator_bucketsize: Option<i32>,
        cq_commerce_cataloggenerator_bucketname: Option<String>,
        cq_commerce_cataloggenerator_excludedtemplateproperties: Option<&Vec<String>>,
        context: &C) -> Result<ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplResponse, ApiError>
    {
        info!("com_adobe_cq_commerce_pim_impl_cataloggenerator_catalog_generator_impl({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, cq_commerce_cataloggenerator_bucketsize, cq_commerce_cataloggenerator_bucketname, cq_commerce_cataloggenerator_excludedtemplateproperties, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_cq_commerce_pim_impl_page_event_listener(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        cq_commerce_pageeventlistener_enabled: Option<bool>,
        context: &C) -> Result<ComAdobeCqCommercePimImplPageEventListenerResponse, ApiError>
    {
        info!("com_adobe_cq_commerce_pim_impl_page_event_listener({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, cq_commerce_pageeventlistener_enabled, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_cq_commerce_pim_impl_productfeed_product_feed_service_impl(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        feed_generator_algorithm: Option<String>,
        context: &C) -> Result<ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplResponse, ApiError>
    {
        info!("com_adobe_cq_commerce_pim_impl_productfeed_product_feed_service_impl({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, feed_generator_algorithm, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_cq_contentinsight_impl_reporting_services_settings_provider(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        reportingservices_url: Option<String>,
        context: &C) -> Result<ComAdobeCqContentinsightImplReportingServicesSettingsProviderResponse, ApiError>
    {
        info!("com_adobe_cq_contentinsight_impl_reporting_services_settings_provider({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, reportingservices_url, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_cq_contentinsight_impl_servlets_bright_edge_proxy_servlet(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        brightedge_url: Option<String>,
        context: &C) -> Result<ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletResponse, ApiError>
    {
        info!("com_adobe_cq_contentinsight_impl_servlets_bright_edge_proxy_servlet({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, brightedge_url, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_cq_contentinsight_impl_servlets_reporting_services_proxy_servle(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        reportingservices_proxy_whitelist: Option<&Vec<String>>,
        context: &C) -> Result<ComAdobeCqContentinsightImplServletsReportingServicesProxyServleResponse, ApiError>
    {
        info!("com_adobe_cq_contentinsight_impl_servlets_reporting_services_proxy_servle({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, reportingservices_proxy_whitelist, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_cq_dam_cfm_impl_component_component_config_impl(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        dam_cfm_component_resource_type: Option<String>,
        dam_cfm_component_file_reference_prop: Option<String>,
        dam_cfm_component_elements_prop: Option<String>,
        dam_cfm_component_variation_prop: Option<String>,
        context: &C) -> Result<ComAdobeCqDamCfmImplComponentComponentConfigImplResponse, ApiError>
    {
        info!("com_adobe_cq_dam_cfm_impl_component_component_config_impl({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, dam_cfm_component_resource_type, dam_cfm_component_file_reference_prop, dam_cfm_component_elements_prop, dam_cfm_component_variation_prop, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_cq_dam_cfm_impl_conf_feature_config_impl(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        dam_cfm_resource_types: Option<&Vec<String>>,
        dam_cfm_reference_properties: Option<&Vec<String>>,
        context: &C) -> Result<ComAdobeCqDamCfmImplConfFeatureConfigImplResponse, ApiError>
    {
        info!("com_adobe_cq_dam_cfm_impl_conf_feature_config_impl({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, dam_cfm_resource_types, dam_cfm_reference_properties, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_cq_dam_cfm_impl_content_rewriter_asset_processor(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        pipeline_type: Option<String>,
        context: &C) -> Result<ComAdobeCqDamCfmImplContentRewriterAssetProcessorResponse, ApiError>
    {
        info!("com_adobe_cq_dam_cfm_impl_content_rewriter_asset_processor({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, pipeline_type, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_cq_dam_cfm_impl_content_rewriter_par_range_filter(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        pipeline_type: Option<String>,
        context: &C) -> Result<ComAdobeCqDamCfmImplContentRewriterParRangeFilterResponse, ApiError>
    {
        info!("com_adobe_cq_dam_cfm_impl_content_rewriter_par_range_filter({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, pipeline_type, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_cq_dam_cfm_impl_content_rewriter_payload_filter(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        pipeline_type: Option<String>,
        context: &C) -> Result<ComAdobeCqDamCfmImplContentRewriterPayloadFilterResponse, ApiError>
    {
        info!("com_adobe_cq_dam_cfm_impl_content_rewriter_payload_filter({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, pipeline_type, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_cq_dam_dm_process_image_p_tiff_manager_impl(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        max_memory: Option<i32>,
        context: &C) -> Result<ComAdobeCqDamDmProcessImagePTiffManagerImplResponse, ApiError>
    {
        info!("com_adobe_cq_dam_dm_process_image_p_tiff_manager_impl({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, max_memory, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_cq_dam_ips_impl_replication_trigger_replicate_on_modify_worker(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        dmreplicateonmodify_enabled: Option<bool>,
        dmreplicateonmodify_forcesyncdeletes: Option<bool>,
        context: &C) -> Result<ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerResponse, ApiError>
    {
        info!("com_adobe_cq_dam_ips_impl_replication_trigger_replicate_on_modify_worker({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, dmreplicateonmodify_enabled, dmreplicateonmodify_forcesyncdeletes, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_cq_dam_mac_sync_helper_impl_mac_sync_client_impl(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        com_adobe_dam_mac_sync_client_so_timeout: Option<i32>,
        context: &C) -> Result<ComAdobeCqDamMacSyncHelperImplMacSyncClientImplResponse, ApiError>
    {
        info!("com_adobe_cq_dam_mac_sync_helper_impl_mac_sync_client_impl({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, com_adobe_dam_mac_sync_client_so_timeout, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_cq_dam_mac_sync_impl_dam_sync_service_impl(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        com_adobe_cq_dam_mac_sync_damsyncservice_registered_paths: Option<&Vec<String>>,
        com_adobe_cq_dam_mac_sync_damsyncservice_sync_renditions: Option<bool>,
        com_adobe_cq_dam_mac_sync_damsyncservice_replicate_thread_wait_ms: Option<i32>,
        com_adobe_cq_dam_mac_sync_damsyncservice_platform: Option<String>,
        context: &C) -> Result<ComAdobeCqDamMacSyncImplDamSyncServiceImplResponse, ApiError>
    {
        info!("com_adobe_cq_dam_mac_sync_impl_dam_sync_service_impl({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, com_adobe_cq_dam_mac_sync_damsyncservice_registered_paths, com_adobe_cq_dam_mac_sync_damsyncservice_sync_renditions, com_adobe_cq_dam_mac_sync_damsyncservice_replicate_thread_wait_ms, com_adobe_cq_dam_mac_sync_damsyncservice_platform, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_cq_dam_processor_nui_impl_nui_asset_processor(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        nui_enabled: Option<bool>,
        nui_service_url: Option<String>,
        nui_api_key: Option<String>,
        context: &C) -> Result<ComAdobeCqDamProcessorNuiImplNuiAssetProcessorResponse, ApiError>
    {
        info!("com_adobe_cq_dam_processor_nui_impl_nui_asset_processor({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, nui_enabled, nui_service_url, nui_api_key, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_cq_dam_s7imaging_impl_is_image_server_component(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        tcp_port: Option<String>,
        allow_remote_access: Option<bool>,
        max_render_rgn_pixels: Option<String>,
        max_message_size: Option<String>,
        random_access_url_timeout: Option<i32>,
        worker_threads: Option<i32>,
        context: &C) -> Result<ComAdobeCqDamS7imagingImplIsImageServerComponentResponse, ApiError>
    {
        info!("com_adobe_cq_dam_s7imaging_impl_is_image_server_component({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, tcp_port, allow_remote_access, max_render_rgn_pixels, max_message_size, random_access_url_timeout, worker_threads, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_cq_dam_s7imaging_impl_ps_platform_server_servlet(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        cache_enable: Option<bool>,
        cache_root_paths: Option<&Vec<String>>,
        cache_max_size: Option<i32>,
        cache_max_entries: Option<i32>,
        context: &C) -> Result<ComAdobeCqDamS7imagingImplPsPlatformServerServletResponse, ApiError>
    {
        info!("com_adobe_cq_dam_s7imaging_impl_ps_platform_server_servlet({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, cache_enable, cache_root_paths, cache_max_size, cache_max_entries, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_cq_dam_webdav_impl_io_asset_io_handler(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        service_ranking: Option<i32>,
        path_prefix: Option<String>,
        create_version: Option<bool>,
        context: &C) -> Result<ComAdobeCqDamWebdavImplIoAssetIoHandlerResponse, ApiError>
    {
        info!("com_adobe_cq_dam_webdav_impl_io_asset_io_handler({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, service_ranking, path_prefix, create_version, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_cq_dam_webdav_impl_io_dam_webdav_version_linking_job(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        cq_dam_webdav_version_linking_enable: Option<bool>,
        cq_dam_webdav_version_linking_scheduler_period: Option<i32>,
        cq_dam_webdav_version_linking_staging_timeout: Option<i32>,
        context: &C) -> Result<ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobResponse, ApiError>
    {
        info!("com_adobe_cq_dam_webdav_impl_io_dam_webdav_version_linking_job({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, cq_dam_webdav_version_linking_enable, cq_dam_webdav_version_linking_scheduler_period, cq_dam_webdav_version_linking_staging_timeout, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_cq_dam_webdav_impl_io_special_files_handler(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        com_day_cq_dam_core_impl_io_special_files_handler_filepatters: Option<&Vec<String>>,
        context: &C) -> Result<ComAdobeCqDamWebdavImplIoSpecialFilesHandlerResponse, ApiError>
    {
        info!("com_adobe_cq_dam_webdav_impl_io_special_files_handler({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, com_day_cq_dam_core_impl_io_special_files_handler_filepatters, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_cq_deserfw_impl_deserialization_firewall_impl(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        firewall_deserialization_whitelist: Option<&Vec<String>>,
        firewall_deserialization_blacklist: Option<&Vec<String>>,
        firewall_deserialization_diagnostics: Option<String>,
        context: &C) -> Result<ComAdobeCqDeserfwImplDeserializationFirewallImplResponse, ApiError>
    {
        info!("com_adobe_cq_deserfw_impl_deserialization_firewall_impl({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, firewall_deserialization_whitelist, firewall_deserialization_blacklist, firewall_deserialization_diagnostics, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_cq_dtm_impl_service_dtm_web_service_impl(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        connection_timeout: Option<i32>,
        socket_timeout: Option<i32>,
        context: &C) -> Result<ComAdobeCqDtmImplServiceDtmWebServiceImplResponse, ApiError>
    {
        info!("com_adobe_cq_dtm_impl_service_dtm_web_service_impl({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, connection_timeout, socket_timeout, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_cq_dtm_impl_servlets_dtm_deploy_hook_servlet(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        dtm_staging_ip_whitelist: Option<&Vec<String>>,
        dtm_production_ip_whitelist: Option<&Vec<String>>,
        context: &C) -> Result<ComAdobeCqDtmImplServletsDtmDeployHookServletResponse, ApiError>
    {
        info!("com_adobe_cq_dtm_impl_servlets_dtm_deploy_hook_servlet({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, dtm_staging_ip_whitelist, dtm_production_ip_whitelist, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_cq_dtm_reactor_impl_service_web_service_impl(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        endpoint_uri: Option<String>,
        connection_timeout: Option<i32>,
        socket_timeout: Option<i32>,
        context: &C) -> Result<ComAdobeCqDtmReactorImplServiceWebServiceImplResponse, ApiError>
    {
        info!("com_adobe_cq_dtm_reactor_impl_service_web_service_impl({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, endpoint_uri, connection_timeout, socket_timeout, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_cq_experiencelog_impl_experience_log_config_servlet(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        enabled: Option<bool>,
        disabled_for_groups: Option<&Vec<String>>,
        context: &C) -> Result<ComAdobeCqExperiencelogImplExperienceLogConfigServletResponse, ApiError>
    {
        info!("com_adobe_cq_experiencelog_impl_experience_log_config_servlet({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, enabled, disabled_for_groups, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_cq_hc_content_packages_health_check(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        hc_name: Option<String>,
        hc_tags: Option<&Vec<String>>,
        hc_mbean_name: Option<String>,
        package_names: Option<&Vec<String>>,
        context: &C) -> Result<ComAdobeCqHcContentPackagesHealthCheckResponse, ApiError>
    {
        info!("com_adobe_cq_hc_content_packages_health_check({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, hc_name, hc_tags, hc_mbean_name, package_names, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_cq_history_impl_history_request_filter(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        history_request_filter_excluded_selectors: Option<&Vec<String>>,
        history_request_filter_excluded_extensions: Option<&Vec<String>>,
        context: &C) -> Result<ComAdobeCqHistoryImplHistoryRequestFilterResponse, ApiError>
    {
        info!("com_adobe_cq_history_impl_history_request_filter({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, history_request_filter_excluded_selectors, history_request_filter_excluded_extensions, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_cq_history_impl_history_service_impl(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        history_service_resource_types: Option<&Vec<String>>,
        history_service_path_filter: Option<&Vec<String>>,
        context: &C) -> Result<ComAdobeCqHistoryImplHistoryServiceImplResponse, ApiError>
    {
        info!("com_adobe_cq_history_impl_history_service_impl({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, history_service_resource_types, history_service_path_filter, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_cq_inbox_impl_typeprovider_item_type_provider(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        inbox_impl_typeprovider_registrypaths: Option<&Vec<String>>,
        inbox_impl_typeprovider_legacypaths: Option<&Vec<String>>,
        inbox_impl_typeprovider_defaulturl_failureitem: Option<String>,
        inbox_impl_typeprovider_defaulturl_workitem: Option<String>,
        inbox_impl_typeprovider_defaulturl_task: Option<String>,
        context: &C) -> Result<ComAdobeCqInboxImplTypeproviderItemTypeProviderResponse, ApiError>
    {
        info!("com_adobe_cq_inbox_impl_typeprovider_item_type_provider({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, inbox_impl_typeprovider_registrypaths, inbox_impl_typeprovider_legacypaths, inbox_impl_typeprovider_defaulturl_failureitem, inbox_impl_typeprovider_defaulturl_workitem, inbox_impl_typeprovider_defaulturl_task, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_cq_projects_impl_servlet_project_image_servlet(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        image_quality: Option<String>,
        image_supported_resolutions: Option<String>,
        context: &C) -> Result<ComAdobeCqProjectsImplServletProjectImageServletResponse, ApiError>
    {
        info!("com_adobe_cq_projects_impl_servlet_project_image_servlet({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, image_quality, image_supported_resolutions, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_cq_projects_purge_scheduler(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        scheduledpurge_name: Option<String>,
        scheduledpurge_purge_active: Option<bool>,
        scheduledpurge_templates: Option<&Vec<String>>,
        scheduledpurge_purge_groups: Option<bool>,
        scheduledpurge_purge_assets: Option<bool>,
        scheduledpurge_terminate_running_workflows: Option<bool>,
        scheduledpurge_daysold: Option<i32>,
        scheduledpurge_save_threshold: Option<i32>,
        context: &C) -> Result<ComAdobeCqProjectsPurgeSchedulerResponse, ApiError>
    {
        info!("com_adobe_cq_projects_purge_scheduler({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, scheduledpurge_name, scheduledpurge_purge_active, scheduledpurge_templates, scheduledpurge_purge_groups, scheduledpurge_purge_assets, scheduledpurge_terminate_running_workflows, scheduledpurge_daysold, scheduledpurge_save_threshold, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_cq_scheduled_exporter_impl_scheduled_exporter_impl(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        include_paths: Option<&Vec<String>>,
        exporter_user: Option<String>,
        context: &C) -> Result<ComAdobeCqScheduledExporterImplScheduledExporterImplResponse, ApiError>
    {
        info!("com_adobe_cq_scheduled_exporter_impl_scheduled_exporter_impl({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, include_paths, exporter_user, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_cq_screens_analytics_impl_screens_analytics_service_impl(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        com_adobe_cq_screens_analytics_impl_url: Option<String>,
        com_adobe_cq_screens_analytics_impl_apikey: Option<String>,
        com_adobe_cq_screens_analytics_impl_project: Option<String>,
        com_adobe_cq_screens_analytics_impl_environment: Option<String>,
        com_adobe_cq_screens_analytics_impl_send_frequency: Option<i32>,
        context: &C) -> Result<ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplResponse, ApiError>
    {
        info!("com_adobe_cq_screens_analytics_impl_screens_analytics_service_impl({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, com_adobe_cq_screens_analytics_impl_url, com_adobe_cq_screens_analytics_impl_apikey, com_adobe_cq_screens_analytics_impl_project, com_adobe_cq_screens_analytics_impl_environment, com_adobe_cq_screens_analytics_impl_send_frequency, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_cq_screens_device_impl_device_service(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        com_adobe_aem_screens_player_pingfrequency: Option<i32>,
        com_adobe_aem_screens_device_pasword_specialchars: Option<String>,
        com_adobe_aem_screens_device_pasword_minlowercasechars: Option<i32>,
        com_adobe_aem_screens_device_pasword_minuppercasechars: Option<i32>,
        com_adobe_aem_screens_device_pasword_minnumberchars: Option<i32>,
        com_adobe_aem_screens_device_pasword_minspecialchars: Option<i32>,
        com_adobe_aem_screens_device_pasword_minlength: Option<i32>,
        context: &C) -> Result<ComAdobeCqScreensDeviceImplDeviceServiceResponse, ApiError>
    {
        info!("com_adobe_cq_screens_device_impl_device_service({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, com_adobe_aem_screens_player_pingfrequency, com_adobe_aem_screens_device_pasword_specialchars, com_adobe_aem_screens_device_pasword_minlowercasechars, com_adobe_aem_screens_device_pasword_minuppercasechars, com_adobe_aem_screens_device_pasword_minnumberchars, com_adobe_aem_screens_device_pasword_minspecialchars, com_adobe_aem_screens_device_pasword_minlength, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_cq_screens_device_registration_impl_registration_service_impl(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        device_registration_timeout: Option<i32>,
        context: &C) -> Result<ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplResponse, ApiError>
    {
        info!("com_adobe_cq_screens_device_registration_impl_registration_service_impl({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, device_registration_timeout, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_cq_screens_impl_handler_channels_update_handler(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        cq_pagesupdatehandler_imageresourcetypes: Option<&Vec<String>>,
        cq_pagesupdatehandler_productresourcetypes: Option<&Vec<String>>,
        cq_pagesupdatehandler_videoresourcetypes: Option<&Vec<String>>,
        cq_pagesupdatehandler_dynamicsequenceresourcetypes: Option<&Vec<String>>,
        cq_pagesupdatehandler_previewmodepaths: Option<&Vec<String>>,
        context: &C) -> Result<ComAdobeCqScreensImplHandlerChannelsUpdateHandlerResponse, ApiError>
    {
        info!("com_adobe_cq_screens_impl_handler_channels_update_handler({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, cq_pagesupdatehandler_imageresourcetypes, cq_pagesupdatehandler_productresourcetypes, cq_pagesupdatehandler_videoresourcetypes, cq_pagesupdatehandler_dynamicsequenceresourcetypes, cq_pagesupdatehandler_previewmodepaths, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_cq_screens_impl_jobs_distributed_devices_stati_update_job(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        scheduler_expression: Option<String>,
        context: &C) -> Result<ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobResponse, ApiError>
    {
        info!("com_adobe_cq_screens_impl_jobs_distributed_devices_stati_update_job({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, scheduler_expression, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_cq_screens_impl_remote_impl_distributed_http_client_impl(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        com_adobe_aem_screens_impl_remote_request_timeout: Option<i32>,
        context: &C) -> Result<ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplResponse, ApiError>
    {
        info!("com_adobe_cq_screens_impl_remote_impl_distributed_http_client_impl({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, com_adobe_aem_screens_impl_remote_request_timeout, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_cq_screens_impl_screens_channel_post_processor(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        screens_channels_properties_to_remove: Option<&Vec<String>>,
        context: &C) -> Result<ComAdobeCqScreensImplScreensChannelPostProcessorResponse, ApiError>
    {
        info!("com_adobe_cq_screens_impl_screens_channel_post_processor({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, screens_channels_properties_to_remove, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_cq_screens_monitoring_impl_screens_monitoring_service_impl(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        com_adobe_cq_screens_monitoring_impl_screens_monitoring_service_impl_project_path: Option<&Vec<String>>,
        com_adobe_cq_screens_monitoring_impl_screens_monitoring_service_impl_schedule_frequency: Option<String>,
        com_adobe_cq_screens_monitoring_impl_screens_monitoring_service_impl_ping_timeout: Option<i32>,
        com_adobe_cq_screens_monitoring_impl_screens_monitoring_service_impl_recipients: Option<String>,
        com_adobe_cq_screens_monitoring_impl_screens_monitoring_service_impl_smtpserver: Option<String>,
        com_adobe_cq_screens_monitoring_impl_screens_monitoring_service_impl_smtpport: Option<i32>,
        com_adobe_cq_screens_monitoring_impl_screens_monitoring_service_impl_usetls: Option<bool>,
        com_adobe_cq_screens_monitoring_impl_screens_monitoring_service_impl_username: Option<String>,
        com_adobe_cq_screens_monitoring_impl_screens_monitoring_service_impl_password: Option<String>,
        context: &C) -> Result<ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplResponse, ApiError>
    {
        info!("com_adobe_cq_screens_monitoring_impl_screens_monitoring_service_impl({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, com_adobe_cq_screens_monitoring_impl_screens_monitoring_service_impl_project_path, com_adobe_cq_screens_monitoring_impl_screens_monitoring_service_impl_schedule_frequency, com_adobe_cq_screens_monitoring_impl_screens_monitoring_service_impl_ping_timeout, com_adobe_cq_screens_monitoring_impl_screens_monitoring_service_impl_recipients, com_adobe_cq_screens_monitoring_impl_screens_monitoring_service_impl_smtpserver, com_adobe_cq_screens_monitoring_impl_screens_monitoring_service_impl_smtpport, com_adobe_cq_screens_monitoring_impl_screens_monitoring_service_impl_usetls, com_adobe_cq_screens_monitoring_impl_screens_monitoring_service_impl_username, com_adobe_cq_screens_monitoring_impl_screens_monitoring_service_impl_password, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        service_ranking: Option<i32>,
        global_size: Option<i32>,
        max_disk_usage: Option<i32>,
        persistence_enabled: Option<bool>,
        thread_pool_max_size: Option<i32>,
        scheduled_thread_pool_max_size: Option<i32>,
        graceful_shutdown_timeout: Option<i32>,
        queues: Option<&Vec<String>>,
        topics: Option<&Vec<String>>,
        addresses_max_delivery_attempts: Option<i32>,
        addresses_expiry_delay: Option<i32>,
        addresses_address_full_message_policy: Option<String>,
        addresses_max_size_bytes: Option<i32>,
        addresses_page_size_bytes: Option<i32>,
        addresses_page_cache_max_size: Option<i32>,
        cluster_user: Option<String>,
        cluster_password: Option<String>,
        cluster_call_timeout: Option<i32>,
        cluster_call_failover_timeout: Option<i32>,
        cluster_client_failure_check_period: Option<i32>,
        cluster_notification_attempts: Option<i32>,
        cluster_notification_interval: Option<i32>,
        id_cache_size: Option<i32>,
        cluster_confirmation_window_size: Option<i32>,
        cluster_connection_ttl: Option<i32>,
        cluster_duplicate_detection: Option<bool>,
        cluster_initial_connect_attempts: Option<i32>,
        cluster_max_retry_interval: Option<i32>,
        cluster_min_large_message_size: Option<i32>,
        cluster_producer_window_size: Option<i32>,
        cluster_reconnect_attempts: Option<i32>,
        cluster_retry_interval: Option<i32>,
        cluster_retry_interval_multiplier: Option<f64>,
        context: &C) -> Result<ComAdobeCqScreensMqActivemqImplArtemisJmsProviderResponse, ApiError>
    {
        info!("com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, service_ranking, global_size, max_disk_usage, persistence_enabled, thread_pool_max_size, scheduled_thread_pool_max_size, graceful_shutdown_timeout, queues, topics, addresses_max_delivery_attempts, addresses_expiry_delay, addresses_address_full_message_policy, addresses_max_size_bytes, addresses_page_size_bytes, addresses_page_cache_max_size, cluster_user, cluster_password, cluster_call_timeout, cluster_call_failover_timeout, cluster_client_failure_check_period, cluster_notification_attempts, cluster_notification_interval, id_cache_size, cluster_confirmation_window_size, cluster_connection_ttl, cluster_duplicate_detection, cluster_initial_connect_attempts, cluster_max_retry_interval, cluster_min_large_message_size, cluster_producer_window_size, cluster_reconnect_attempts, cluster_retry_interval, cluster_retry_interval_multiplier, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_cq_screens_offlinecontent_impl_bulk_offline_update_service_impl(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        com_adobe_cq_screens_offlinecontent_impl_bulk_offline_update_service_impl_project_path: Option<&Vec<String>>,
        com_adobe_cq_screens_offlinecontent_impl_bulk_offline_update_service_impl_schedule_frequency: Option<String>,
        context: &C) -> Result<ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplResponse, ApiError>
    {
        info!("com_adobe_cq_screens_offlinecontent_impl_bulk_offline_update_service_impl({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, com_adobe_cq_screens_offlinecontent_impl_bulk_offline_update_service_impl_project_path, com_adobe_cq_screens_offlinecontent_impl_bulk_offline_update_service_impl_schedule_frequency, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_cq_screens_offlinecontent_impl_offline_content_service_impl(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        disable_smart_sync: Option<bool>,
        context: &C) -> Result<ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplResponse, ApiError>
    {
        info!("com_adobe_cq_screens_offlinecontent_impl_offline_content_service_impl({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, disable_smart_sync, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_cq_screens_segmentation_impl_segmentation_feature_flag(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        enable_data_triggered_content: Option<bool>,
        context: &C) -> Result<ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagResponse, ApiError>
    {
        info!("com_adobe_cq_screens_segmentation_impl_segmentation_feature_flag({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, enable_data_triggered_content, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_cq_security_hc_bundles_impl_html_library_manager_config_health_ch(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        hc_tags: Option<&Vec<String>>,
        context: &C) -> Result<ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChResponse, ApiError>
    {
        info!("com_adobe_cq_security_hc_bundles_impl_html_library_manager_config_health_ch({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, hc_tags, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_cq_security_hc_bundles_impl_wcm_filter_health_check(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        hc_tags: Option<&Vec<String>>,
        context: &C) -> Result<ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckResponse, ApiError>
    {
        info!("com_adobe_cq_security_hc_bundles_impl_wcm_filter_health_check({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, hc_tags, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_cq_security_hc_dispatcher_impl_dispatcher_access_health_check(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        hc_tags: Option<&Vec<String>>,
        dispatcher_address: Option<String>,
        dispatcher_filter_allowed: Option<&Vec<String>>,
        dispatcher_filter_blocked: Option<&Vec<String>>,
        context: &C) -> Result<ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckResponse, ApiError>
    {
        info!("com_adobe_cq_security_hc_dispatcher_impl_dispatcher_access_health_check({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, hc_tags, dispatcher_address, dispatcher_filter_allowed, dispatcher_filter_blocked, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_cq_security_hc_packages_impl_example_content_health_check(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        hc_tags: Option<&Vec<String>>,
        context: &C) -> Result<ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckResponse, ApiError>
    {
        info!("com_adobe_cq_security_hc_packages_impl_example_content_health_check({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, hc_tags, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_cq_security_hc_webserver_impl_clickjacking_health_check(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        hc_tags: Option<&Vec<String>>,
        webserver_address: Option<String>,
        context: &C) -> Result<ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckResponse, ApiError>
    {
        info!("com_adobe_cq_security_hc_webserver_impl_clickjacking_health_check({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, hc_tags, webserver_address, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_cq_social_accountverification_impl_account_management_config_im(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        enable: Option<bool>,
        ttl1: Option<i32>,
        ttl2: Option<i32>,
        context: &C) -> Result<ComAdobeCqSocialAccountverificationImplAccountManagementConfigImResponse, ApiError>
    {
        info!("com_adobe_cq_social_accountverification_impl_account_management_config_im({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, enable, ttl1, ttl2, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_cq_social_activitystreams_client_impl_social_activity_componen(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        priority: Option<i32>,
        context: &C) -> Result<ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenResponse, ApiError>
    {
        info!("com_adobe_cq_social_activitystreams_client_impl_social_activity_componen({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, priority, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_cq_social_activitystreams_client_impl_social_activity_stream_co(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        priority: Option<i32>,
        context: &C) -> Result<ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoResponse, ApiError>
    {
        info!("com_adobe_cq_social_activitystreams_client_impl_social_activity_stream_co({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, priority, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_cq_social_activitystreams_listener_impl_event_listener_handler(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        event_topics: Option<String>,
        event_filter: Option<String>,
        context: &C) -> Result<ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerResponse, ApiError>
    {
        info!("com_adobe_cq_social_activitystreams_listener_impl_event_listener_handler({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, event_topics, event_filter, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_cq_social_activitystreams_listener_impl_moderation_event_exten(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        accepted: Option<bool>,
        ranked: Option<i32>,
        context: &C) -> Result<ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenResponse, ApiError>
    {
        info!("com_adobe_cq_social_activitystreams_listener_impl_moderation_event_exten({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, accepted, ranked, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_cq_social_activitystreams_listener_impl_rating_event_activity_s(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        ranking: Option<i32>,
        enable: Option<bool>,
        context: &C) -> Result<ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySResponse, ApiError>
    {
        info!("com_adobe_cq_social_activitystreams_listener_impl_rating_event_activity_s({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, ranking, enable, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_cq_social_activitystreams_listener_impl_resource_activity_stre(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        stream_path: Option<String>,
        stream_name: Option<String>,
        context: &C) -> Result<ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreResponse, ApiError>
    {
        info!("com_adobe_cq_social_activitystreams_listener_impl_resource_activity_stre({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, stream_path, stream_name, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_cq_social_calendar_client_endpoints_impl_calendar_operations_i(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        max_retry: Option<i32>,
        field_whitelist: Option<&Vec<String>>,
        attachment_type_blacklist: Option<&Vec<String>>,
        context: &C) -> Result<ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIResponse, ApiError>
    {
        info!("com_adobe_cq_social_calendar_client_endpoints_impl_calendar_operations_i({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, max_retry, field_whitelist, attachment_type_blacklist, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_cq_social_calendar_client_operationextensions_event_attachmen(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        attachment_type_blacklist: Option<String>,
        extension_order: Option<i32>,
        context: &C) -> Result<ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenResponse, ApiError>
    {
        info!("com_adobe_cq_social_calendar_client_operationextensions_event_attachmen({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, attachment_type_blacklist, extension_order, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_cq_social_calendar_servlets_time_zone_servlet(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        timezones_expirytime: Option<i32>,
        context: &C) -> Result<ComAdobeCqSocialCalendarServletsTimeZoneServletResponse, ApiError>
    {
        info!("com_adobe_cq_social_calendar_servlets_time_zone_servlet({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, timezones_expirytime, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_cq_social_commons_comments_endpoints_impl_comment_delete_event(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        ranking: Option<i32>,
        context: &C) -> Result<ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventResponse, ApiError>
    {
        info!("com_adobe_cq_social_commons_comments_endpoints_impl_comment_delete_event({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, ranking, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_cq_social_commons_comments_endpoints_impl_comment_operation_se(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        field_whitelist: Option<&Vec<String>>,
        attachment_type_blacklist: Option<&Vec<String>>,
        context: &C) -> Result<ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSeResponse, ApiError>
    {
        info!("com_adobe_cq_social_commons_comments_endpoints_impl_comment_operation_se({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, field_whitelist, attachment_type_blacklist, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_cq_social_commons_comments_endpoints_impl_translation_operati(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        field_whitelist: Option<&Vec<String>>,
        attachment_type_blacklist: Option<&Vec<String>>,
        context: &C) -> Result<ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiResponse, ApiError>
    {
        info!("com_adobe_cq_social_commons_comments_endpoints_impl_translation_operati({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, field_whitelist, attachment_type_blacklist, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_cq_social_commons_comments_listing_impl_search_comment_social_c(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        num_user_limit: Option<i32>,
        context: &C) -> Result<ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCResponse, ApiError>
    {
        info!("com_adobe_cq_social_commons_comments_listing_impl_search_comment_social_c({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, num_user_limit, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_cq_social_commons_comments_scheduler_impl_search_scheduled_pos(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        enable_scheduled_posts_search: Option<bool>,
        number_of_minutes: Option<i32>,
        max_search_limit: Option<i32>,
        context: &C) -> Result<ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosResponse, ApiError>
    {
        info!("com_adobe_cq_social_commons_comments_scheduler_impl_search_scheduled_pos({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, enable_scheduled_posts_search, number_of_minutes, max_search_limit, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_cq_social_commons_cors_cors_authentication_filter(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        cors_enabling: Option<bool>,
        context: &C) -> Result<ComAdobeCqSocialCommonsCorsCorsAuthenticationFilterResponse, ApiError>
    {
        info!("com_adobe_cq_social_commons_cors_cors_authentication_filter({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, cors_enabling, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_cq_social_commons_emailreply_impl_android_email_client_provider(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        priority_order: Option<i32>,
        reply_email_patterns: Option<&Vec<String>>,
        context: &C) -> Result<ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderResponse, ApiError>
    {
        info!("com_adobe_cq_social_commons_emailreply_impl_android_email_client_provider({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, priority_order, reply_email_patterns, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_cq_social_commons_emailreply_impl_comment_email_builder_impl(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        context_path: Option<String>,
        context: &C) -> Result<ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplResponse, ApiError>
    {
        info!("com_adobe_cq_social_commons_emailreply_impl_comment_email_builder_impl({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, context_path, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_cq_social_commons_emailreply_impl_comment_email_event_listener(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        event_topics: Option<String>,
        context: &C) -> Result<ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerResponse, ApiError>
    {
        info!("com_adobe_cq_social_commons_emailreply_impl_comment_email_event_listener({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, event_topics, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_cq_social_commons_emailreply_impl_custom_email_client_provider(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        priority_order: Option<i32>,
        reply_email_patterns: Option<&Vec<String>>,
        context: &C) -> Result<ComAdobeCqSocialCommonsEmailreplyImplCustomEmailClientProviderResponse, ApiError>
    {
        info!("com_adobe_cq_social_commons_emailreply_impl_custom_email_client_provider({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, priority_order, reply_email_patterns, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_imp(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        pattern_time: Option<String>,
        pattern_newline: Option<String>,
        pattern_day_of_month: Option<String>,
        pattern_month: Option<String>,
        pattern_year: Option<String>,
        pattern_date: Option<String>,
        pattern_date_time: Option<String>,
        pattern_email: Option<String>,
        context: &C) -> Result<ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpResponse, ApiError>
    {
        info!("com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_imp({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, pattern_time, pattern_newline, pattern_day_of_month, pattern_month, pattern_year, pattern_date, pattern_date_time, pattern_email, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        email_name: Option<String>,
        email_create_post_from_reply: Option<bool>,
        email_add_comment_id_to: Option<String>,
        email_subject_maximum_length: Option<i32>,
        email_reply_to_address: Option<String>,
        email_reply_to_delimiter: Option<String>,
        email_tracker_id_prefix_in_subject: Option<String>,
        email_tracker_id_prefix_in_body: Option<String>,
        email_as_html: Option<bool>,
        email_default_user_name: Option<String>,
        email_templates_root_path: Option<String>,
        context: &C) -> Result<ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpResponse, ApiError>
    {
        info!("com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, email_name, email_create_post_from_reply, email_add_comment_id_to, email_subject_maximum_length, email_reply_to_address, email_reply_to_delimiter, email_tracker_id_prefix_in_subject, email_tracker_id_prefix_in_body, email_as_html, email_default_user_name, email_templates_root_path, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_cq_social_commons_emailreply_impl_email_reply_importer(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        connect_protocol: Option<String>,
        context: &C) -> Result<ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterResponse, ApiError>
    {
        info!("com_adobe_cq_social_commons_emailreply_impl_email_reply_importer({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, connect_protocol, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_cq_social_commons_emailreply_impl_gmail_email_client_provider(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        priority_order: Option<i32>,
        reply_email_patterns: Option<&Vec<String>>,
        context: &C) -> Result<ComAdobeCqSocialCommonsEmailreplyImplGmailEmailClientProviderResponse, ApiError>
    {
        info!("com_adobe_cq_social_commons_emailreply_impl_gmail_email_client_provider({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, priority_order, reply_email_patterns, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_cq_social_commons_emailreply_impl_ios_email_client_provider(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        priority_order: Option<i32>,
        reply_email_patterns: Option<&Vec<String>>,
        context: &C) -> Result<ComAdobeCqSocialCommonsEmailreplyImplIosEmailClientProviderResponse, ApiError>
    {
        info!("com_adobe_cq_social_commons_emailreply_impl_ios_email_client_provider({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, priority_order, reply_email_patterns, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_cq_social_commons_emailreply_impl_macmail_email_client_provider(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        priority_order: Option<i32>,
        reply_email_patterns: Option<&Vec<String>>,
        context: &C) -> Result<ComAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProviderResponse, ApiError>
    {
        info!("com_adobe_cq_social_commons_emailreply_impl_macmail_email_client_provider({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, priority_order, reply_email_patterns, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_cq_social_commons_emailreply_impl_out_look_email_client_provider(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        priority_order: Option<i32>,
        reply_email_patterns: Option<&Vec<String>>,
        context: &C) -> Result<ComAdobeCqSocialCommonsEmailreplyImplOutLookEmailClientProviderResponse, ApiError>
    {
        info!("com_adobe_cq_social_commons_emailreply_impl_out_look_email_client_provider({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, priority_order, reply_email_patterns, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_cq_social_commons_emailreply_impl_unknown_email_client_provider(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        reply_email_patterns: Option<&Vec<String>>,
        priority_order: Option<i32>,
        context: &C) -> Result<ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderResponse, ApiError>
    {
        info!("com_adobe_cq_social_commons_emailreply_impl_unknown_email_client_provider({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, reply_email_patterns, priority_order, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_cq_social_commons_emailreply_impl_yahoo_email_client_provider(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        priority_order: Option<i32>,
        reply_email_patterns: Option<&Vec<String>>,
        context: &C) -> Result<ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderResponse, ApiError>
    {
        info!("com_adobe_cq_social_commons_emailreply_impl_yahoo_email_client_provider({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, priority_order, reply_email_patterns, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_cq_social_commons_maintainance_impl_delete_temp_ugc_image_upload(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        number_of_days: Option<i32>,
        age_of_file: Option<i32>,
        context: &C) -> Result<ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUgcImageUploadResponse, ApiError>
    {
        info!("com_adobe_cq_social_commons_maintainance_impl_delete_temp_ugc_image_upload({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, number_of_days, age_of_file, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_cq_social_commons_ugclimiter_impl_ugc_limiter_service_impl(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        event_topics: Option<String>,
        event_filter: Option<String>,
        verbs: Option<&Vec<String>>,
        context: &C) -> Result<ComAdobeCqSocialCommonsUgclimiterImplUgcLimiterServiceImplResponse, ApiError>
    {
        info!("com_adobe_cq_social_commons_ugclimiter_impl_ugc_limiter_service_impl({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, event_topics, event_filter, verbs, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_cq_social_commons_ugclimitsconfig_impl_community_user_ugc_limit(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        enable: Option<bool>,
        ugc_limit: Option<i32>,
        ugc_limit_duration: Option<i32>,
        domains: Option<&Vec<String>>,
        to_list: Option<&Vec<String>>,
        context: &C) -> Result<ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUgcLimitResponse, ApiError>
    {
        info!("com_adobe_cq_social_commons_ugclimitsconfig_impl_community_user_ugc_limit({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, enable, ugc_limit, ugc_limit_duration, domains, to_list, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_cq_social_connect_oauth_impl_facebook_provider_impl(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        oauth_provider_id: Option<String>,
        oauth_cloud_config_root: Option<String>,
        provider_config_root: Option<String>,
        provider_config_create_tags_enabled: Option<bool>,
        provider_config_user_folder: Option<String>,
        provider_config_facebook_fetch_fields: Option<bool>,
        provider_config_facebook_fields: Option<&Vec<String>>,
        provider_config_refresh_userdata_enabled: Option<bool>,
        context: &C) -> Result<ComAdobeCqSocialConnectOauthImplFacebookProviderImplResponse, ApiError>
    {
        info!("com_adobe_cq_social_connect_oauth_impl_facebook_provider_impl({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, oauth_provider_id, oauth_cloud_config_root, provider_config_root, provider_config_create_tags_enabled, provider_config_user_folder, provider_config_facebook_fetch_fields, provider_config_facebook_fields, provider_config_refresh_userdata_enabled, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_cq_social_connect_oauth_impl_social_o_auth_authentication_handle(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        path: Option<&Vec<String>>,
        service_ranking: Option<i32>,
        context: &C) -> Result<ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleResponse, ApiError>
    {
        info!("com_adobe_cq_social_connect_oauth_impl_social_o_auth_authentication_handle({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, path, service_ranking, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_cq_social_connect_oauth_impl_social_o_auth_user_profile_mapper(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        facebook: Option<&Vec<String>>,
        twitter: Option<&Vec<String>>,
        provider_config_user_folder: Option<String>,
        context: &C) -> Result<ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperResponse, ApiError>
    {
        info!("com_adobe_cq_social_connect_oauth_impl_social_o_auth_user_profile_mapper({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, facebook, twitter, provider_config_user_folder, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_cq_social_connect_oauth_impl_twitter_provider_impl(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        oauth_provider_id: Option<String>,
        oauth_cloud_config_root: Option<String>,
        provider_config_root: Option<String>,
        provider_config_user_folder: Option<String>,
        provider_config_twitter_enable_params: Option<bool>,
        provider_config_twitter_params: Option<&Vec<String>>,
        provider_config_refresh_userdata_enabled: Option<bool>,
        context: &C) -> Result<ComAdobeCqSocialConnectOauthImplTwitterProviderImplResponse, ApiError>
    {
        info!("com_adobe_cq_social_connect_oauth_impl_twitter_provider_impl({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, oauth_provider_id, oauth_cloud_config_root, provider_config_root, provider_config_user_folder, provider_config_twitter_enable_params, provider_config_twitter_params, provider_config_refresh_userdata_enabled, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_cq_social_content_fragments_services_impl_communities_fragmen(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        cq_social_content_fragments_services_enabled: Option<bool>,
        cq_social_content_fragments_services_wait_time_seconds: Option<i32>,
        context: &C) -> Result<ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenResponse, ApiError>
    {
        info!("com_adobe_cq_social_content_fragments_services_impl_communities_fragmen({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, cq_social_content_fragments_services_enabled, cq_social_content_fragments_services_wait_time_seconds, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_cq_social_datastore_as_impl_as_resource_provider_factory(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        version_id: Option<String>,
        cache_on: Option<bool>,
        concurrency_level: Option<i32>,
        cache_start_size: Option<i32>,
        cache_ttl: Option<i32>,
        cache_size: Option<i32>,
        time_limit: Option<i32>,
        context: &C) -> Result<ComAdobeCqSocialDatastoreAsImplAsResourceProviderFactoryResponse, ApiError>
    {
        info!("com_adobe_cq_social_datastore_as_impl_as_resource_provider_factory({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, version_id, cache_on, concurrency_level, cache_start_size, cache_ttl, cache_size, time_limit, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_cq_social_datastore_op_impl_social_ms_resource_provider_factory(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        solr_zk_timeout: Option<String>,
        solr_commit: Option<String>,
        cache_on: Option<bool>,
        concurrency_level: Option<i32>,
        cache_start_size: Option<i32>,
        cache_ttl: Option<i32>,
        cache_size: Option<i32>,
        context: &C) -> Result<ComAdobeCqSocialDatastoreOpImplSocialMsResourceProviderFactoryResponse, ApiError>
    {
        info!("com_adobe_cq_social_datastore_op_impl_social_ms_resource_provider_factory({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, solr_zk_timeout, solr_commit, cache_on, concurrency_level, cache_start_size, cache_ttl, cache_size, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_cq_social_datastore_rdb_impl_social_rdb_resource_provider_factor(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        solr_zk_timeout: Option<String>,
        solr_commit: Option<String>,
        cache_on: Option<bool>,
        concurrency_level: Option<i32>,
        cache_start_size: Option<i32>,
        cache_ttl: Option<i32>,
        cache_size: Option<i32>,
        context: &C) -> Result<ComAdobeCqSocialDatastoreRdbImplSocialRdbResourceProviderFactorResponse, ApiError>
    {
        info!("com_adobe_cq_social_datastore_rdb_impl_social_rdb_resource_provider_factor({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, solr_zk_timeout, solr_commit, cache_on, concurrency_level, cache_start_size, cache_ttl, cache_size, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_cq_social_enablement_adaptors_enablement_learning_path_adaptor_f(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        is_member_check: Option<bool>,
        context: &C) -> Result<ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFResponse, ApiError>
    {
        info!("com_adobe_cq_social_enablement_adaptors_enablement_learning_path_adaptor_f({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, is_member_check, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_cq_social_enablement_adaptors_enablement_resource_adaptor_facto(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        is_member_check: Option<bool>,
        context: &C) -> Result<ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoResponse, ApiError>
    {
        info!("com_adobe_cq_social_enablement_adaptors_enablement_resource_adaptor_facto({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, is_member_check, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_cq_social_enablement_learningpath_endpoints_impl_enablement_l(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        field_whitelist: Option<&Vec<String>>,
        context: &C) -> Result<ComAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLResponse, ApiError>
    {
        info!("com_adobe_cq_social_enablement_learningpath_endpoints_impl_enablement_l({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, field_whitelist, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_cq_social_enablement_resource_endpoints_impl_enablement_resou(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        field_whitelist: Option<&Vec<String>>,
        context: &C) -> Result<ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResouResponse, ApiError>
    {
        info!("com_adobe_cq_social_enablement_resource_endpoints_impl_enablement_resou({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, field_whitelist, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_cq_social_enablement_services_impl_author_marker_impl(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        service_ranking: Option<i32>,
        context: &C) -> Result<ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplResponse, ApiError>
    {
        info!("com_adobe_cq_social_enablement_services_impl_author_marker_impl({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, service_ranking, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_cq_social_filelibrary_client_endpoints_filelibrary_download_ge(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        sling_servlet_selectors: Option<String>,
        sling_servlet_extensions: Option<String>,
        context: &C) -> Result<ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGeResponse, ApiError>
    {
        info!("com_adobe_cq_social_filelibrary_client_endpoints_filelibrary_download_ge({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, sling_servlet_selectors, sling_servlet_extensions, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_cq_social_filelibrary_client_endpoints_impl_file_library_opera(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        field_whitelist: Option<&Vec<String>>,
        attachment_type_blacklist: Option<&Vec<String>>,
        context: &C) -> Result<ComAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaResponse, ApiError>
    {
        info!("com_adobe_cq_social_filelibrary_client_endpoints_impl_file_library_opera({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, field_whitelist, attachment_type_blacklist, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_cq_social_forum_client_endpoints_impl_forum_operations_service(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        field_whitelist: Option<&Vec<String>>,
        attachment_type_blacklist: Option<&Vec<String>>,
        context: &C) -> Result<ComAdobeCqSocialForumClientEndpointsImplForumOperationsServiceResponse, ApiError>
    {
        info!("com_adobe_cq_social_forum_client_endpoints_impl_forum_operations_service({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, field_whitelist, attachment_type_blacklist, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_cq_social_forum_dispatcher_impl_flush_operations(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        extension_order: Option<i32>,
        flush_forumontopic: Option<bool>,
        context: &C) -> Result<ComAdobeCqSocialForumDispatcherImplFlushOperationsResponse, ApiError>
    {
        info!("com_adobe_cq_social_forum_dispatcher_impl_flush_operations({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, extension_order, flush_forumontopic, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_cq_social_group_client_impl_community_group_collection_componen(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        group_listing_pagination_enable: Option<bool>,
        group_listing_lazyloading_enable: Option<bool>,
        page_size: Option<i32>,
        priority: Option<i32>,
        context: &C) -> Result<ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenResponse, ApiError>
    {
        info!("com_adobe_cq_social_group_client_impl_community_group_collection_componen({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, group_listing_pagination_enable, group_listing_lazyloading_enable, page_size, priority, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_cq_social_group_impl_group_service_impl(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        max_wait_time: Option<i32>,
        min_wait_between_retries: Option<i32>,
        context: &C) -> Result<ComAdobeCqSocialGroupImplGroupServiceImplResponse, ApiError>
    {
        info!("com_adobe_cq_social_group_impl_group_service_impl({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, max_wait_time, min_wait_between_retries, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_cq_social_handlebars_guava_template_cache_impl(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        parameter_guava_cache_enabled: Option<bool>,
        parameter_guava_cache_params: Option<String>,
        parameter_guava_cache_reload: Option<bool>,
        service_ranking: Option<i32>,
        context: &C) -> Result<ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplResponse, ApiError>
    {
        info!("com_adobe_cq_social_handlebars_guava_template_cache_impl({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, parameter_guava_cache_enabled, parameter_guava_cache_params, parameter_guava_cache_reload, service_ranking, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_cq_social_ideation_client_endpoints_impl_ideation_operations_s(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        field_whitelist: Option<&Vec<String>>,
        attachment_type_blacklist: Option<&Vec<String>>,
        context: &C) -> Result<ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSResponse, ApiError>
    {
        info!("com_adobe_cq_social_ideation_client_endpoints_impl_ideation_operations_s({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, field_whitelist, attachment_type_blacklist, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_cq_social_journal_client_endpoints_impl_journal_operations_ser(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        field_whitelist: Option<&Vec<String>>,
        attachment_type_blacklist: Option<&Vec<String>>,
        context: &C) -> Result<ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerResponse, ApiError>
    {
        info!("com_adobe_cq_social_journal_client_endpoints_impl_journal_operations_ser({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, field_whitelist, attachment_type_blacklist, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_cq_social_members_endpoints_impl_community_member_group_profile(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        field_whitelist: Option<&Vec<String>>,
        context: &C) -> Result<ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileResponse, ApiError>
    {
        info!("com_adobe_cq_social_members_endpoints_impl_community_member_group_profile({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, field_whitelist, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_cq_social_members_endpoints_impl_community_member_user_profile_o(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        field_whitelist: Option<&Vec<String>>,
        context: &C) -> Result<ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOResponse, ApiError>
    {
        info!("com_adobe_cq_social_members_endpoints_impl_community_member_user_profile_o({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, field_whitelist, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_cq_social_members_impl_community_member_group_profile_component_f(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        everyone_limit: Option<i32>,
        priority: Option<i32>,
        context: &C) -> Result<ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFResponse, ApiError>
    {
        info!("com_adobe_cq_social_members_impl_community_member_group_profile_component_f({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, everyone_limit, priority, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        message_properties: Option<&Vec<String>>,
        message_box_size_limit: Option<i32>,
        message_count_limit: Option<i32>,
        notify_failure: Option<bool>,
        failure_message_from: Option<String>,
        failure_template_path: Option<String>,
        max_retries: Option<i32>,
        min_wait_between_retries: Option<i32>,
        count_update_pool_size: Option<i32>,
        inbox_path: Option<String>,
        sentitems_path: Option<String>,
        support_attachments: Option<bool>,
        support_group_messaging: Option<bool>,
        max_total_recipients: Option<i32>,
        batch_size: Option<i32>,
        max_total_attachment_size: Option<i32>,
        attachment_type_blacklist: Option<&Vec<String>>,
        allowed_attachment_types: Option<&Vec<String>>,
        service_selector: Option<String>,
        field_whitelist: Option<&Vec<String>>,
        context: &C) -> Result<ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationResponse, ApiError>
    {
        info!("com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, message_properties, message_box_size_limit, message_count_limit, notify_failure, failure_message_from, failure_template_path, max_retries, min_wait_between_retries, count_update_pool_size, inbox_path, sentitems_path, support_attachments, support_group_messaging, max_total_recipients, batch_size, max_total_attachment_size, attachment_type_blacklist, allowed_attachment_types, service_selector, field_whitelist, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_cq_social_moderation_dashboard_api_filter_group_social_componen(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        resource_type_filters: Option<&Vec<String>>,
        priority: Option<i32>,
        context: &C) -> Result<ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenResponse, ApiError>
    {
        info!("com_adobe_cq_social_moderation_dashboard_api_filter_group_social_componen({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, resource_type_filters, priority, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_cq_social_moderation_dashboard_api_moderation_dashboard_social(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        priority: Option<i32>,
        context: &C) -> Result<ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialResponse, ApiError>
    {
        info!("com_adobe_cq_social_moderation_dashboard_api_moderation_dashboard_social({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, priority, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_cq_social_moderation_dashboard_api_user_details_social_componen(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        priority: Option<i32>,
        context: &C) -> Result<ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenResponse, ApiError>
    {
        info!("com_adobe_cq_social_moderation_dashboard_api_user_details_social_componen({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, priority, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_cq_social_moderation_dashboard_internal_impl_filter_group_soci(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        resource_type_filters: Option<&Vec<String>>,
        priority: Option<i32>,
        context: &C) -> Result<ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociResponse, ApiError>
    {
        info!("com_adobe_cq_social_moderation_dashboard_internal_impl_filter_group_soci({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, resource_type_filters, priority, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_cq_social_notifications_impl_mentions_router(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        event_topics: Option<String>,
        event_filter: Option<String>,
        context: &C) -> Result<ComAdobeCqSocialNotificationsImplMentionsRouterResponse, ApiError>
    {
        info!("com_adobe_cq_social_notifications_impl_mentions_router({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, event_topics, event_filter, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_cq_social_notifications_impl_notification_manager_impl(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        max_unread_notification_count: Option<i32>,
        context: &C) -> Result<ComAdobeCqSocialNotificationsImplNotificationManagerImplResponse, ApiError>
    {
        info!("com_adobe_cq_social_notifications_impl_notification_manager_impl({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, max_unread_notification_count, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_cq_social_notifications_impl_notifications_router(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        event_topics: Option<String>,
        event_filter: Option<String>,
        context: &C) -> Result<ComAdobeCqSocialNotificationsImplNotificationsRouterResponse, ApiError>
    {
        info!("com_adobe_cq_social_notifications_impl_notifications_router({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, event_topics, event_filter, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_cq_social_qna_client_endpoints_impl_qna_forum_operations_servic(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        field_whitelist: Option<&Vec<String>>,
        attachment_type_blacklist: Option<&Vec<String>>,
        context: &C) -> Result<ComAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicResponse, ApiError>
    {
        info!("com_adobe_cq_social_qna_client_endpoints_impl_qna_forum_operations_servic({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, field_whitelist, attachment_type_blacklist, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_cq_social_reporting_analytics_services_impl_analytics_report_i(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        cq_social_reporting_analytics_polling_importer_interval: Option<i32>,
        cq_social_reporting_analytics_polling_importer_page_size: Option<i32>,
        context: &C) -> Result<ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIResponse, ApiError>
    {
        info!("com_adobe_cq_social_reporting_analytics_services_impl_analytics_report_i({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, cq_social_reporting_analytics_polling_importer_interval, cq_social_reporting_analytics_polling_importer_page_size, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_cq_social_reporting_analytics_services_impl_analytics_report_m(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        report_fetch_delay: Option<i32>,
        context: &C) -> Result<ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMResponse, ApiError>
    {
        info!("com_adobe_cq_social_reporting_analytics_services_impl_analytics_report_m({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, report_fetch_delay, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_cq_social_reporting_analytics_services_impl_site_trend_report_s(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        cq_social_console_analytics_sites_mapping: Option<&Vec<String>>,
        priority: Option<i32>,
        context: &C) -> Result<ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSResponse, ApiError>
    {
        info!("com_adobe_cq_social_reporting_analytics_services_impl_site_trend_report_s({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, cq_social_console_analytics_sites_mapping, priority, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_cq_social_review_client_endpoints_impl_review_operations_servi(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        field_whitelist: Option<&Vec<String>>,
        attachment_type_blacklist: Option<&Vec<String>>,
        context: &C) -> Result<ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiResponse, ApiError>
    {
        info!("com_adobe_cq_social_review_client_endpoints_impl_review_operations_servi({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, field_whitelist, attachment_type_blacklist, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_cq_social_scf_core_operations_impl_social_operations_servlet(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        sling_servlet_selectors: Option<String>,
        sling_servlet_extensions: Option<String>,
        context: &C) -> Result<ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletResponse, ApiError>
    {
        info!("com_adobe_cq_social_scf_core_operations_impl_social_operations_servlet({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, sling_servlet_selectors, sling_servlet_extensions, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_cq_social_scf_endpoints_impl_default_social_get_servlet(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        sling_servlet_selectors: Option<&Vec<String>>,
        sling_servlet_extensions: Option<String>,
        context: &C) -> Result<ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletResponse, ApiError>
    {
        info!("com_adobe_cq_social_scf_endpoints_impl_default_social_get_servlet({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, sling_servlet_selectors, sling_servlet_extensions, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_cq_social_scoring_impl_scoring_event_listener(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        event_topics: Option<String>,
        event_filter: Option<String>,
        context: &C) -> Result<ComAdobeCqSocialScoringImplScoringEventListenerResponse, ApiError>
    {
        info!("com_adobe_cq_social_scoring_impl_scoring_event_listener({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, event_topics, event_filter, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_cq_social_serviceusers_internal_impl_service_user_wrapper_impl(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        enable_fallback: Option<bool>,
        context: &C) -> Result<ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplResponse, ApiError>
    {
        info!("com_adobe_cq_social_serviceusers_internal_impl_service_user_wrapper_impl({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, enable_fallback, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_cq_social_site_endpoints_impl_site_operation_service(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        field_whitelist: Option<&Vec<String>>,
        site_path_filters: Option<&Vec<String>>,
        site_package_group: Option<String>,
        context: &C) -> Result<ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceResponse, ApiError>
    {
        info!("com_adobe_cq_social_site_endpoints_impl_site_operation_service({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, field_whitelist, site_path_filters, site_package_group, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_cq_social_site_impl_analytics_component_configuration_service_im(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        cq_social_console_analytics_components: Option<&Vec<String>>,
        context: &C) -> Result<ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImResponse, ApiError>
    {
        info!("com_adobe_cq_social_site_impl_analytics_component_configuration_service_im({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, cq_social_console_analytics_components, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_cq_social_site_impl_site_configurator_impl(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        components_using_tags: Option<&Vec<String>>,
        context: &C) -> Result<ComAdobeCqSocialSiteImplSiteConfiguratorImplResponse, ApiError>
    {
        info!("com_adobe_cq_social_site_impl_site_configurator_impl({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, components_using_tags, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_cq_social_srp_impl_social_solr_connector(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        srp_type: Option<String>,
        context: &C) -> Result<ComAdobeCqSocialSrpImplSocialSolrConnectorResponse, ApiError>
    {
        info!("com_adobe_cq_social_srp_impl_social_solr_connector({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, srp_type, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_cq_social_sync_impl_diff_changes_observer(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        enabled: Option<bool>,
        agent_name: Option<String>,
        diff_path: Option<String>,
        property_names: Option<String>,
        context: &C) -> Result<ComAdobeCqSocialSyncImplDiffChangesObserverResponse, ApiError>
    {
        info!("com_adobe_cq_social_sync_impl_diff_changes_observer({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, enabled, agent_name, diff_path, property_names, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_cq_social_sync_impl_group_sync_listener_impl(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        nodetypes: Option<&Vec<String>>,
        ignorableprops: Option<&Vec<String>>,
        ignorablenodes: Option<String>,
        enabled: Option<bool>,
        distfolders: Option<String>,
        context: &C) -> Result<ComAdobeCqSocialSyncImplGroupSyncListenerImplResponse, ApiError>
    {
        info!("com_adobe_cq_social_sync_impl_group_sync_listener_impl({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, nodetypes, ignorableprops, ignorablenodes, enabled, distfolders, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_cq_social_sync_impl_publisher_sync_service_impl(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        active_run_modes: Option<&Vec<String>>,
        context: &C) -> Result<ComAdobeCqSocialSyncImplPublisherSyncServiceImplResponse, ApiError>
    {
        info!("com_adobe_cq_social_sync_impl_publisher_sync_service_impl({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, active_run_modes, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_cq_social_sync_impl_user_sync_listener_impl(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        nodetypes: Option<&Vec<String>>,
        ignorableprops: Option<&Vec<String>>,
        ignorablenodes: Option<&Vec<String>>,
        enabled: Option<bool>,
        distfolders: Option<&Vec<String>>,
        context: &C) -> Result<ComAdobeCqSocialSyncImplUserSyncListenerImplResponse, ApiError>
    {
        info!("com_adobe_cq_social_sync_impl_user_sync_listener_impl({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, nodetypes, ignorableprops, ignorablenodes, enabled, distfolders, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_cq_social_translation_impl_translation_service_config_manager(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        translate_language: Option<String>,
        translate_display: Option<String>,
        translate_attribution: Option<bool>,
        translate_caching: Option<String>,
        translate_smart_rendering: Option<String>,
        translate_caching_duration: Option<String>,
        translate_session_save_interval: Option<String>,
        translate_session_save_batch_limit: Option<String>,
        context: &C) -> Result<ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerResponse, ApiError>
    {
        info!("com_adobe_cq_social_translation_impl_translation_service_config_manager({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, translate_language, translate_display, translate_attribution, translate_caching, translate_smart_rendering, translate_caching_duration, translate_session_save_interval, translate_session_save_batch_limit, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_cq_social_translation_impl_ugc_language_detector(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        event_topics: Option<String>,
        event_filter: Option<String>,
        translate_listener_type: Option<&Vec<String>>,
        translate_property_list: Option<&Vec<String>>,
        pool_size: Option<i32>,
        max_pool_size: Option<i32>,
        queue_size: Option<i32>,
        keep_alive_time: Option<i32>,
        context: &C) -> Result<ComAdobeCqSocialTranslationImplUgcLanguageDetectorResponse, ApiError>
    {
        info!("com_adobe_cq_social_translation_impl_ugc_language_detector({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, event_topics, event_filter, translate_listener_type, translate_property_list, pool_size, max_pool_size, queue_size, keep_alive_time, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_cq_social_ugcbase_dispatcher_impl_flush_service_impl(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        thread_pool_size: Option<i32>,
        delay_time: Option<i32>,
        worker_sleep_time: Option<i32>,
        context: &C) -> Result<ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplResponse, ApiError>
    {
        info!("com_adobe_cq_social_ugcbase_dispatcher_impl_flush_service_impl({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, thread_pool_size, delay_time, worker_sleep_time, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_cq_social_ugcbase_impl_aysnc_reverse_replicator_impl(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        pool_size: Option<i32>,
        max_pool_size: Option<i32>,
        queue_size: Option<i32>,
        keep_alive_time: Option<i32>,
        context: &C) -> Result<ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplResponse, ApiError>
    {
        info!("com_adobe_cq_social_ugcbase_impl_aysnc_reverse_replicator_impl({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, pool_size, max_pool_size, queue_size, keep_alive_time, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_cq_social_ugcbase_impl_publisher_configuration_impl(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        is_primary_publisher: Option<bool>,
        context: &C) -> Result<ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplResponse, ApiError>
    {
        info!("com_adobe_cq_social_ugcbase_impl_publisher_configuration_impl({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, is_primary_publisher, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_cq_social_ugcbase_impl_social_utils_impl(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        legacy_cloud_ugc_path_mapping: Option<bool>,
        context: &C) -> Result<ComAdobeCqSocialUgcbaseImplSocialUtilsImplResponse, ApiError>
    {
        info!("com_adobe_cq_social_ugcbase_impl_social_utils_impl({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, legacy_cloud_ugc_path_mapping, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_cq_social_ugcbase_moderation_impl_auto_moderation_impl(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        automoderation_sequence: Option<&Vec<String>>,
        automoderation_onfailurestop: Option<bool>,
        context: &C) -> Result<ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplResponse, ApiError>
    {
        info!("com_adobe_cq_social_ugcbase_moderation_impl_auto_moderation_impl({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, automoderation_sequence, automoderation_onfailurestop, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_cq_social_ugcbase_moderation_impl_sentiment_process(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        watchwords_positive: Option<&Vec<String>>,
        watchwords_negative: Option<&Vec<String>>,
        watchwords_path: Option<String>,
        sentiment_path: Option<String>,
        context: &C) -> Result<ComAdobeCqSocialUgcbaseModerationImplSentimentProcessResponse, ApiError>
    {
        info!("com_adobe_cq_social_ugcbase_moderation_impl_sentiment_process({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, watchwords_positive, watchwords_negative, watchwords_path, sentiment_path, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_cq_social_ugcbase_security_impl_default_attachment_type_blackli(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        default_attachment_type_blacklist: Option<&Vec<String>>,
        baseline_attachment_type_blacklist: Option<&Vec<String>>,
        context: &C) -> Result<ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliResponse, ApiError>
    {
        info!("com_adobe_cq_social_ugcbase_security_impl_default_attachment_type_blackli({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, default_attachment_type_blacklist, baseline_attachment_type_blacklist, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_cq_social_ugcbase_security_impl_safer_sling_post_validator_impl(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        parameter_whitelist: Option<&Vec<String>>,
        parameter_whitelist_prefixes: Option<&Vec<String>>,
        binary_parameter_whitelist: Option<&Vec<String>>,
        modifier_whitelist: Option<&Vec<String>>,
        operation_whitelist: Option<&Vec<String>>,
        operation_whitelist_prefixes: Option<&Vec<String>>,
        typehint_whitelist: Option<&Vec<String>>,
        resourcetype_whitelist: Option<&Vec<String>>,
        context: &C) -> Result<ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplResponse, ApiError>
    {
        info!("com_adobe_cq_social_ugcbase_security_impl_safer_sling_post_validator_impl({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, parameter_whitelist, parameter_whitelist_prefixes, binary_parameter_whitelist, modifier_whitelist, operation_whitelist, operation_whitelist_prefixes, typehint_whitelist, resourcetype_whitelist, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_cq_social_user_endpoints_impl_users_group_from_publish_servlet(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        sling_servlet_extensions: Option<String>,
        sling_servlet_paths: Option<String>,
        sling_servlet_methods: Option<String>,
        context: &C) -> Result<ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletResponse, ApiError>
    {
        info!("com_adobe_cq_social_user_endpoints_impl_users_group_from_publish_servlet({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, sling_servlet_extensions, sling_servlet_paths, sling_servlet_methods, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_cq_social_user_impl_transport_http_to_publisher(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        enable: Option<bool>,
        agent_configuration: Option<&Vec<String>>,
        context_path: Option<String>,
        disabled_cipher_suites: Option<&Vec<String>>,
        enabled_cipher_suites: Option<&Vec<String>>,
        context: &C) -> Result<ComAdobeCqSocialUserImplTransportHttpToPublisherResponse, ApiError>
    {
        info!("com_adobe_cq_social_user_impl_transport_http_to_publisher({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, enable, agent_configuration, context_path, disabled_cipher_suites, enabled_cipher_suites, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_cq_ui_wcm_commons_internal_servlets_rte_rte_filter_servlet_fact(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        resource_types: Option<&Vec<String>>,
        context: &C) -> Result<ComAdobeCqUiWcmCommonsInternalServletsRteRteFilterServletFactResponse, ApiError>
    {
        info!("com_adobe_cq_ui_wcm_commons_internal_servlets_rte_rte_filter_servlet_fact({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, resource_types, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_cq_upgrades_cleanup_impl_upgrade_content_cleanup(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        delete_path_regexps: Option<&Vec<String>>,
        delete_sql2_query: Option<String>,
        context: &C) -> Result<ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupResponse, ApiError>
    {
        info!("com_adobe_cq_upgrades_cleanup_impl_upgrade_content_cleanup({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, delete_path_regexps, delete_sql2_query, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_cq_upgrades_cleanup_impl_upgrade_install_folder_cleanup(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        delete_name_regexps: Option<&Vec<String>>,
        context: &C) -> Result<ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupResponse, ApiError>
    {
        info!("com_adobe_cq_upgrades_cleanup_impl_upgrade_install_folder_cleanup({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, delete_name_regexps, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_cq_wcm_jobs_async_impl_async_delete_config_provider_service(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        threshold: Option<i32>,
        job_topic_name: Option<String>,
        email_enabled: Option<bool>,
        context: &C) -> Result<ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceResponse, ApiError>
    {
        info!("com_adobe_cq_wcm_jobs_async_impl_async_delete_config_provider_service({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, threshold, job_topic_name, email_enabled, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_cq_wcm_jobs_async_impl_async_job_clean_up_task(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        scheduler_expression: Option<String>,
        job_purge_threshold: Option<i32>,
        job_purge_max_jobs: Option<i32>,
        context: &C) -> Result<ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskResponse, ApiError>
    {
        info!("com_adobe_cq_wcm_jobs_async_impl_async_job_clean_up_task({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, scheduler_expression, job_purge_threshold, job_purge_max_jobs, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_cq_wcm_jobs_async_impl_async_move_config_provider_service(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        threshold: Option<i32>,
        job_topic_name: Option<String>,
        email_enabled: Option<bool>,
        context: &C) -> Result<ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceResponse, ApiError>
    {
        info!("com_adobe_cq_wcm_jobs_async_impl_async_move_config_provider_service({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, threshold, job_topic_name, email_enabled, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_cq_wcm_jobs_async_impl_async_page_move_config_provider_service(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        threshold: Option<i32>,
        job_topic_name: Option<String>,
        email_enabled: Option<bool>,
        context: &C) -> Result<ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceResponse, ApiError>
    {
        info!("com_adobe_cq_wcm_jobs_async_impl_async_page_move_config_provider_service({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, threshold, job_topic_name, email_enabled, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_cq_wcm_launches_impl_launches_event_handler(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        event_filter: Option<String>,
        launches_eventhandler_threadpool_maxsize: Option<i32>,
        launches_eventhandler_threadpool_priority: Option<String>,
        launches_eventhandler_updatelastmodification: Option<bool>,
        context: &C) -> Result<ComAdobeCqWcmLaunchesImplLaunchesEventHandlerResponse, ApiError>
    {
        info!("com_adobe_cq_wcm_launches_impl_launches_event_handler({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, event_filter, launches_eventhandler_threadpool_maxsize, launches_eventhandler_threadpool_priority, launches_eventhandler_updatelastmodification, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_cq_wcm_mobile_qrcode_servlet_qr_code_image_generator(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        cq_wcm_qrcode_servlet_whitelist: Option<&Vec<String>>,
        context: &C) -> Result<ComAdobeCqWcmMobileQrcodeServletQrCodeImageGeneratorResponse, ApiError>
    {
        info!("com_adobe_cq_wcm_mobile_qrcode_servlet_qr_code_image_generator({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, cq_wcm_qrcode_servlet_whitelist, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_cq_wcm_style_internal_component_style_info_cache_impl(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        size: Option<i32>,
        context: &C) -> Result<ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplResponse, ApiError>
    {
        info!("com_adobe_cq_wcm_style_internal_component_style_info_cache_impl({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, size, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_cq_wcm_translation_impl_translation_platform_configuration_impl(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        sync_translation_state_scheduling_format: Option<String>,
        scheduling_repeat_translation_scheduling_format: Option<String>,
        sync_translation_state_lock_timeout_in_minutes: Option<String>,
        export_format: Option<String>,
        context: &C) -> Result<ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplResponse, ApiError>
    {
        info!("com_adobe_cq_wcm_translation_impl_translation_platform_configuration_impl({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, sync_translation_state_scheduling_format, scheduling_repeat_translation_scheduling_format, sync_translation_state_lock_timeout_in_minutes, export_format, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_fd_fp_config_forms_portal_draftsand_submission_config_service(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        portal_outboxes: Option<&Vec<String>>,
        draft_data_service: Option<String>,
        draft_metadata_service: Option<String>,
        submit_data_service: Option<String>,
        submit_metadata_service: Option<String>,
        pending_sign_data_service: Option<String>,
        pending_sign_metadata_service: Option<String>,
        context: &C) -> Result<ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceResponse, ApiError>
    {
        info!("com_adobe_fd_fp_config_forms_portal_draftsand_submission_config_service({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, portal_outboxes, draft_data_service, draft_metadata_service, submit_data_service, submit_metadata_service, pending_sign_data_service, pending_sign_metadata_service, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_fd_fp_config_forms_portal_scheduler_service(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        formportal_interval: Option<String>,
        context: &C) -> Result<ComAdobeFdFpConfigFormsPortalSchedulerServiceResponse, ApiError>
    {
        info!("com_adobe_fd_fp_config_forms_portal_scheduler_service({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, formportal_interval, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_forms_common_service_impl_default_data_provider(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        alloweddata_file_locations: Option<&Vec<String>>,
        context: &C) -> Result<ComAdobeFormsCommonServiceImplDefaultDataProviderResponse, ApiError>
    {
        info!("com_adobe_forms_common_service_impl_default_data_provider({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, alloweddata_file_locations, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_forms_common_service_impl_forms_common_configuration_service_imp(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        temp_storage_config: Option<String>,
        context: &C) -> Result<ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpResponse, ApiError>
    {
        info!("com_adobe_forms_common_service_impl_forms_common_configuration_service_imp({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, temp_storage_config, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_forms_common_servlet_temp_clean_up_task(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        scheduler_expression: Option<String>,
        duration_for_temporary_storage: Option<String>,
        duration_for_anonymous_storage: Option<String>,
        context: &C) -> Result<ComAdobeFormsCommonServletTempCleanUpTaskResponse, ApiError>
    {
        info!("com_adobe_forms_common_servlet_temp_clean_up_task({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, scheduler_expression, duration_for_temporary_storage, duration_for_anonymous_storage, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_granite_acp_platform_platform_servlet(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        query_limit: Option<i32>,
        file_type_extension_map: Option<&Vec<String>>,
        context: &C) -> Result<ComAdobeGraniteAcpPlatformPlatformServletResponse, ApiError>
    {
        info!("com_adobe_granite_acp_platform_platform_servlet({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, query_limit, file_type_extension_map, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_granite_activitystreams_impl_activity_manager_impl(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        aggregate_relationships: Option<&Vec<String>>,
        aggregate_descend_virtual: Option<bool>,
        context: &C) -> Result<ComAdobeGraniteActivitystreamsImplActivityManagerImplResponse, ApiError>
    {
        info!("com_adobe_granite_activitystreams_impl_activity_manager_impl({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, aggregate_relationships, aggregate_descend_virtual, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_granite_analyzer_base_system_status_servlet(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        disabled: Option<bool>,
        context: &C) -> Result<ComAdobeGraniteAnalyzerBaseSystemStatusServletResponse, ApiError>
    {
        info!("com_adobe_granite_analyzer_base_system_status_servlet({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, disabled, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_granite_analyzer_scripts_compile_all_scripts_compiler_servlet(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        disabled: Option<bool>,
        context: &C) -> Result<ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletResponse, ApiError>
    {
        info!("com_adobe_granite_analyzer_scripts_compile_all_scripts_compiler_servlet({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, disabled, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_granite_apicontroller_filter_resolver_hook_factory(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        com_adobe_cq_cdn_cdn_rewriter: Option<String>,
        com_adobe_cq_cloud_config_components: Option<String>,
        com_adobe_cq_cloud_config_core: Option<String>,
        com_adobe_cq_cloud_config_ui: Option<String>,
        com_adobe_cq_com_adobe_cq_editor: Option<String>,
        com_adobe_cq_com_adobe_cq_projects_core: Option<String>,
        com_adobe_cq_com_adobe_cq_projects_wcm_core: Option<String>,
        com_adobe_cq_com_adobe_cq_ui_commons: Option<String>,
        com_adobe_cq_com_adobe_cq_wcm_style: Option<String>,
        com_adobe_cq_cq_activitymap_integration: Option<String>,
        com_adobe_cq_cq_contexthub_commons: Option<String>,
        com_adobe_cq_cq_dtm: Option<String>,
        com_adobe_cq_cq_healthcheck: Option<String>,
        com_adobe_cq_cq_multisite_targeting: Option<String>,
        com_adobe_cq_cq_pre_upgrade_cleanup: Option<String>,
        com_adobe_cq_cq_product_info_provider: Option<String>,
        com_adobe_cq_cq_rest_sites: Option<String>,
        com_adobe_cq_cq_security_hc: Option<String>,
        com_adobe_cq_dam_cq_dam_svg_handler: Option<String>,
        com_adobe_cq_dam_cq_scene7_imaging: Option<String>,
        com_adobe_cq_dtm_reactor_core: Option<String>,
        com_adobe_cq_dtm_reactor_ui: Option<String>,
        com_adobe_cq_exp_jspel_resolver: Option<String>,
        com_adobe_cq_inbox_cq_inbox: Option<String>,
        com_adobe_cq_json_schema_parser: Option<String>,
        com_adobe_cq_media_cq_media_publishing_dps_fp_core: Option<String>,
        com_adobe_cq_mobile_cq_mobile_caas: Option<String>,
        com_adobe_cq_mobile_cq_mobile_index_builder: Option<String>,
        com_adobe_cq_mobile_cq_mobile_phonegap_build: Option<String>,
        com_adobe_cq_myspell: Option<String>,
        com_adobe_cq_sample_we_retail_core: Option<String>,
        com_adobe_cq_screens_com_adobe_cq_screens_dcc: Option<String>,
        com_adobe_cq_screens_com_adobe_cq_screens_mq_core: Option<String>,
        com_adobe_cq_social_cq_social_as_provider: Option<String>,
        com_adobe_cq_social_cq_social_badging_basic_impl: Option<String>,
        com_adobe_cq_social_cq_social_badging_impl: Option<String>,
        com_adobe_cq_social_cq_social_calendar_impl: Option<String>,
        com_adobe_cq_social_cq_social_content_fragments_impl: Option<String>,
        com_adobe_cq_social_cq_social_enablement_impl: Option<String>,
        com_adobe_cq_social_cq_social_graph_impl: Option<String>,
        com_adobe_cq_social_cq_social_ideation_impl: Option<String>,
        com_adobe_cq_social_cq_social_jcr_provider: Option<String>,
        com_adobe_cq_social_cq_social_members_impl: Option<String>,
        com_adobe_cq_social_cq_social_ms_provider: Option<String>,
        com_adobe_cq_social_cq_social_notifications_channels_web: Option<String>,
        com_adobe_cq_social_cq_social_notifications_impl: Option<String>,
        com_adobe_cq_social_cq_social_rdb_provider: Option<String>,
        com_adobe_cq_social_cq_social_scf_impl: Option<String>,
        com_adobe_cq_social_cq_social_scoring_basic_impl: Option<String>,
        com_adobe_cq_social_cq_social_scoring_impl: Option<String>,
        com_adobe_cq_social_cq_social_serviceusers_impl: Option<String>,
        com_adobe_cq_social_cq_social_srp_impl: Option<String>,
        com_adobe_cq_social_cq_social_ugcbase_impl: Option<String>,
        com_adobe_dam_cq_dam_cfm_impl: Option<String>,
        com_adobe_forms_foundation_forms_foundation_base: Option<String>,
        com_adobe_granite_apicontroller: Option<String>,
        com_adobe_granite_asset_core: Option<String>,
        com_adobe_granite_auth_sso: Option<String>,
        com_adobe_granite_bundles_hc_impl: Option<String>,
        com_adobe_granite_compat_router: Option<String>,
        com_adobe_granite_conf: Option<String>,
        com_adobe_granite_conf_ui_core: Option<String>,
        com_adobe_granite_cors: Option<String>,
        com_adobe_granite_crx_explorer: Option<String>,
        com_adobe_granite_crxde_lite: Option<String>,
        com_adobe_granite_crypto_config: Option<String>,
        com_adobe_granite_crypto_extension: Option<String>,
        com_adobe_granite_crypto_file: Option<String>,
        com_adobe_granite_crypto_jcr: Option<String>,
        com_adobe_granite_csrf: Option<String>,
        com_adobe_granite_distribution_core: Option<String>,
        com_adobe_granite_dropwizard_metrics: Option<String>,
        com_adobe_granite_frags_impl: Option<String>,
        com_adobe_granite_gibson: Option<String>,
        com_adobe_granite_infocollector: Option<String>,
        com_adobe_granite_installer_factory_packages: Option<String>,
        com_adobe_granite_jetty_ssl: Option<String>,
        com_adobe_granite_jobs_async: Option<String>,
        com_adobe_granite_maintenance_oak: Option<String>,
        com_adobe_granite_monitoring_core: Option<String>,
        com_adobe_granite_queries: Option<String>,
        com_adobe_granite_replication_hc_impl: Option<String>,
        com_adobe_granite_repository_checker: Option<String>,
        com_adobe_granite_repository_hc_impl: Option<String>,
        com_adobe_granite_rest_assets: Option<String>,
        com_adobe_granite_security_ui: Option<String>,
        com_adobe_granite_startup: Option<String>,
        com_adobe_granite_tagsoup: Option<String>,
        com_adobe_granite_taskmanagement_core: Option<String>,
        com_adobe_granite_taskmanagement_workflow: Option<String>,
        com_adobe_granite_ui_clientlibs_compiler_less: Option<String>,
        com_adobe_granite_ui_clientlibs_processor_gcc: Option<String>,
        com_adobe_granite_webconsole_plugins: Option<String>,
        com_adobe_granite_workflow_console: Option<String>,
        com_adobe_xmp_worker_files_native_fragment_linux: Option<String>,
        com_adobe_xmp_worker_files_native_fragment_macosx: Option<String>,
        com_adobe_xmp_worker_files_native_fragment_win: Option<String>,
        com_day_commons_osgi_wrapper_simple_jndi: Option<String>,
        com_day_cq_cq_authhandler: Option<String>,
        com_day_cq_cq_compat_configupdate: Option<String>,
        com_day_cq_cq_licensebranding: Option<String>,
        com_day_cq_cq_notifcation_impl: Option<String>,
        com_day_cq_cq_replication_audit: Option<String>,
        com_day_cq_cq_search_ext: Option<String>,
        com_day_cq_dam_cq_dam_annotation_print: Option<String>,
        com_day_cq_dam_cq_dam_asset_usage: Option<String>,
        com_day_cq_dam_cq_dam_s7dam: Option<String>,
        com_day_cq_dam_cq_dam_similaritysearch: Option<String>,
        com_day_cq_dam_dam_webdav_support: Option<String>,
        com_day_cq_pre_upgrade_tasks: Option<String>,
        com_day_cq_replication_extensions: Option<String>,
        com_day_cq_wcm_cq_msm_core: Option<String>,
        com_day_cq_wcm_cq_wcm_translation: Option<String>,
        day_commons_jrawio: Option<String>,
        org_apache_aries_jmx_whiteboard: Option<String>,
        org_apache_felix_http_sslfilter: Option<String>,
        org_apache_felix_org_apache_felix_threaddump: Option<String>,
        org_apache_felix_webconsole_plugins_ds: Option<String>,
        org_apache_felix_webconsole_plugins_event: Option<String>,
        org_apache_felix_webconsole_plugins_memoryusage: Option<String>,
        org_apache_felix_webconsole_plugins_packageadmin: Option<String>,
        org_apache_jackrabbit_oak_auth_ldap: Option<String>,
        org_apache_jackrabbit_oak_segment_tar: Option<String>,
        org_apache_jackrabbit_oak_solr_osgi: Option<String>,
        org_apache_sling_bundleresource_impl: Option<String>,
        org_apache_sling_commons_fsclassloader: Option<String>,
        org_apache_sling_commons_log_webconsole: Option<String>,
        org_apache_sling_datasource: Option<String>,
        org_apache_sling_discovery_base: Option<String>,
        org_apache_sling_discovery_oak: Option<String>,
        org_apache_sling_discovery_support: Option<String>,
        org_apache_sling_distribution_api: Option<String>,
        org_apache_sling_distribution_core: Option<String>,
        org_apache_sling_extensions_webconsolesecurityprovider: Option<String>,
        org_apache_sling_hc_webconsole: Option<String>,
        org_apache_sling_installer_console: Option<String>,
        org_apache_sling_installer_provider_file: Option<String>,
        org_apache_sling_installer_provider_jcr: Option<String>,
        org_apache_sling_jcr_davex: Option<String>,
        org_apache_sling_jcr_resourcesecurity: Option<String>,
        org_apache_sling_jmx_provider: Option<String>,
        org_apache_sling_launchpad_installer: Option<String>,
        org_apache_sling_models_impl: Option<String>,
        org_apache_sling_repoinit_parser: Option<String>,
        org_apache_sling_resource_inventory: Option<String>,
        org_apache_sling_resourceresolver: Option<String>,
        org_apache_sling_scripting_javascript: Option<String>,
        org_apache_sling_scripting_jst: Option<String>,
        org_apache_sling_scripting_sightly_js_provider: Option<String>,
        org_apache_sling_scripting_sightly_models_provider: Option<String>,
        org_apache_sling_security: Option<String>,
        org_apache_sling_servlets_compat: Option<String>,
        org_apache_sling_servlets_get: Option<String>,
        org_apache_sling_startupfilter_disabler: Option<String>,
        org_apache_sling_tracer: Option<String>,
        we_retail_client_app_core: Option<String>,
        context: &C) -> Result<ComAdobeGraniteApicontrollerFilterResolverHookFactoryResponse, ApiError>
    {
        info!("com_adobe_granite_apicontroller_filter_resolver_hook_factory({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, com_adobe_cq_cdn_cdn_rewriter, com_adobe_cq_cloud_config_components, com_adobe_cq_cloud_config_core, com_adobe_cq_cloud_config_ui, com_adobe_cq_com_adobe_cq_editor, com_adobe_cq_com_adobe_cq_projects_core, com_adobe_cq_com_adobe_cq_projects_wcm_core, com_adobe_cq_com_adobe_cq_ui_commons, com_adobe_cq_com_adobe_cq_wcm_style, com_adobe_cq_cq_activitymap_integration, com_adobe_cq_cq_contexthub_commons, com_adobe_cq_cq_dtm, com_adobe_cq_cq_healthcheck, com_adobe_cq_cq_multisite_targeting, com_adobe_cq_cq_pre_upgrade_cleanup, com_adobe_cq_cq_product_info_provider, com_adobe_cq_cq_rest_sites, com_adobe_cq_cq_security_hc, com_adobe_cq_dam_cq_dam_svg_handler, com_adobe_cq_dam_cq_scene7_imaging, com_adobe_cq_dtm_reactor_core, com_adobe_cq_dtm_reactor_ui, com_adobe_cq_exp_jspel_resolver, com_adobe_cq_inbox_cq_inbox, com_adobe_cq_json_schema_parser, com_adobe_cq_media_cq_media_publishing_dps_fp_core, com_adobe_cq_mobile_cq_mobile_caas, com_adobe_cq_mobile_cq_mobile_index_builder, com_adobe_cq_mobile_cq_mobile_phonegap_build, com_adobe_cq_myspell, com_adobe_cq_sample_we_retail_core, com_adobe_cq_screens_com_adobe_cq_screens_dcc, com_adobe_cq_screens_com_adobe_cq_screens_mq_core, com_adobe_cq_social_cq_social_as_provider, com_adobe_cq_social_cq_social_badging_basic_impl, com_adobe_cq_social_cq_social_badging_impl, com_adobe_cq_social_cq_social_calendar_impl, com_adobe_cq_social_cq_social_content_fragments_impl, com_adobe_cq_social_cq_social_enablement_impl, com_adobe_cq_social_cq_social_graph_impl, com_adobe_cq_social_cq_social_ideation_impl, com_adobe_cq_social_cq_social_jcr_provider, com_adobe_cq_social_cq_social_members_impl, com_adobe_cq_social_cq_social_ms_provider, com_adobe_cq_social_cq_social_notifications_channels_web, com_adobe_cq_social_cq_social_notifications_impl, com_adobe_cq_social_cq_social_rdb_provider, com_adobe_cq_social_cq_social_scf_impl, com_adobe_cq_social_cq_social_scoring_basic_impl, com_adobe_cq_social_cq_social_scoring_impl, com_adobe_cq_social_cq_social_serviceusers_impl, com_adobe_cq_social_cq_social_srp_impl, com_adobe_cq_social_cq_social_ugcbase_impl, com_adobe_dam_cq_dam_cfm_impl, com_adobe_forms_foundation_forms_foundation_base, com_adobe_granite_apicontroller, com_adobe_granite_asset_core, com_adobe_granite_auth_sso, com_adobe_granite_bundles_hc_impl, com_adobe_granite_compat_router, com_adobe_granite_conf, com_adobe_granite_conf_ui_core, com_adobe_granite_cors, com_adobe_granite_crx_explorer, com_adobe_granite_crxde_lite, com_adobe_granite_crypto_config, com_adobe_granite_crypto_extension, com_adobe_granite_crypto_file, com_adobe_granite_crypto_jcr, com_adobe_granite_csrf, com_adobe_granite_distribution_core, com_adobe_granite_dropwizard_metrics, com_adobe_granite_frags_impl, com_adobe_granite_gibson, com_adobe_granite_infocollector, com_adobe_granite_installer_factory_packages, com_adobe_granite_jetty_ssl, com_adobe_granite_jobs_async, com_adobe_granite_maintenance_oak, com_adobe_granite_monitoring_core, com_adobe_granite_queries, com_adobe_granite_replication_hc_impl, com_adobe_granite_repository_checker, com_adobe_granite_repository_hc_impl, com_adobe_granite_rest_assets, com_adobe_granite_security_ui, com_adobe_granite_startup, com_adobe_granite_tagsoup, com_adobe_granite_taskmanagement_core, com_adobe_granite_taskmanagement_workflow, com_adobe_granite_ui_clientlibs_compiler_less, com_adobe_granite_ui_clientlibs_processor_gcc, com_adobe_granite_webconsole_plugins, com_adobe_granite_workflow_console, com_adobe_xmp_worker_files_native_fragment_linux, com_adobe_xmp_worker_files_native_fragment_macosx, com_adobe_xmp_worker_files_native_fragment_win, com_day_commons_osgi_wrapper_simple_jndi, com_day_cq_cq_authhandler, com_day_cq_cq_compat_configupdate, com_day_cq_cq_licensebranding, com_day_cq_cq_notifcation_impl, com_day_cq_cq_replication_audit, com_day_cq_cq_search_ext, com_day_cq_dam_cq_dam_annotation_print, com_day_cq_dam_cq_dam_asset_usage, com_day_cq_dam_cq_dam_s7dam, com_day_cq_dam_cq_dam_similaritysearch, com_day_cq_dam_dam_webdav_support, com_day_cq_pre_upgrade_tasks, com_day_cq_replication_extensions, com_day_cq_wcm_cq_msm_core, com_day_cq_wcm_cq_wcm_translation, day_commons_jrawio, org_apache_aries_jmx_whiteboard, org_apache_felix_http_sslfilter, org_apache_felix_org_apache_felix_threaddump, org_apache_felix_webconsole_plugins_ds, org_apache_felix_webconsole_plugins_event, org_apache_felix_webconsole_plugins_memoryusage, org_apache_felix_webconsole_plugins_packageadmin, org_apache_jackrabbit_oak_auth_ldap, org_apache_jackrabbit_oak_segment_tar, org_apache_jackrabbit_oak_solr_osgi, org_apache_sling_bundleresource_impl, org_apache_sling_commons_fsclassloader, org_apache_sling_commons_log_webconsole, org_apache_sling_datasource, org_apache_sling_discovery_base, org_apache_sling_discovery_oak, org_apache_sling_discovery_support, org_apache_sling_distribution_api, org_apache_sling_distribution_core, org_apache_sling_extensions_webconsolesecurityprovider, org_apache_sling_hc_webconsole, org_apache_sling_installer_console, org_apache_sling_installer_provider_file, org_apache_sling_installer_provider_jcr, org_apache_sling_jcr_davex, org_apache_sling_jcr_resourcesecurity, org_apache_sling_jmx_provider, org_apache_sling_launchpad_installer, org_apache_sling_models_impl, org_apache_sling_repoinit_parser, org_apache_sling_resource_inventory, org_apache_sling_resourceresolver, org_apache_sling_scripting_javascript, org_apache_sling_scripting_jst, org_apache_sling_scripting_sightly_js_provider, org_apache_sling_scripting_sightly_models_provider, org_apache_sling_security, org_apache_sling_servlets_compat, org_apache_sling_servlets_get, org_apache_sling_startupfilter_disabler, org_apache_sling_tracer, we_retail_client_app_core, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_granite_auth_cert_impl_client_cert_auth_handler(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        path: Option<String>,
        service_ranking: Option<i32>,
        context: &C) -> Result<ComAdobeGraniteAuthCertImplClientCertAuthHandlerResponse, ApiError>
    {
        info!("com_adobe_granite_auth_cert_impl_client_cert_auth_handler({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, path, service_ranking, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_granite_auth_ims(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        configid: Option<String>,
        scope: Option<String>,
        context: &C) -> Result<ComAdobeGraniteAuthImsResponse, ApiError>
    {
        info!("com_adobe_granite_auth_ims({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, configid, scope, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_granite_auth_ims_impl_external_user_id_mapping_provider_extension(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        oauth_provider_id: Option<String>,
        context: &C) -> Result<ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionResponse, ApiError>
    {
        info!("com_adobe_granite_auth_ims_impl_external_user_id_mapping_provider_extension({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, oauth_provider_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_granite_auth_ims_impl_ims_access_token_request_customizer_impl(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        auth_ims_client_secret: Option<String>,
        customizer_type: Option<String>,
        context: &C) -> Result<ComAdobeGraniteAuthImsImplImsAccessTokenRequestCustomizerImplResponse, ApiError>
    {
        info!("com_adobe_granite_auth_ims_impl_ims_access_token_request_customizer_impl({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, auth_ims_client_secret, customizer_type, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_granite_auth_ims_impl_ims_config_provider_impl(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        oauth_configmanager_ims_configid: Option<String>,
        ims_owning_entity: Option<String>,
        aem_instance_id: Option<String>,
        ims_service_code: Option<String>,
        context: &C) -> Result<ComAdobeGraniteAuthImsImplImsConfigProviderImplResponse, ApiError>
    {
        info!("com_adobe_granite_auth_ims_impl_ims_config_provider_impl({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, oauth_configmanager_ims_configid, ims_owning_entity, aem_instance_id, ims_service_code, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_granite_auth_ims_impl_ims_instance_credentials_validator(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        oauth_provider_id: Option<String>,
        context: &C) -> Result<ComAdobeGraniteAuthImsImplImsInstanceCredentialsValidatorResponse, ApiError>
    {
        info!("com_adobe_granite_auth_ims_impl_ims_instance_credentials_validator({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, oauth_provider_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_granite_auth_ims_impl_ims_provider_impl(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        oauth_provider_id: Option<String>,
        oauth_provider_ims_authorization_url: Option<String>,
        oauth_provider_ims_token_url: Option<String>,
        oauth_provider_ims_profile_url: Option<String>,
        oauth_provider_ims_extended_details_urls: Option<&Vec<String>>,
        oauth_provider_ims_validate_token_url: Option<String>,
        oauth_provider_ims_session_property: Option<String>,
        oauth_provider_ims_service_token_client_id: Option<String>,
        oauth_provider_ims_service_token_client_secret: Option<String>,
        oauth_provider_ims_service_token: Option<String>,
        ims_org_ref: Option<String>,
        ims_group_mapping: Option<&Vec<String>>,
        oauth_provider_ims_only_license_group: Option<bool>,
        context: &C) -> Result<ComAdobeGraniteAuthImsImplImsProviderImplResponse, ApiError>
    {
        info!("com_adobe_granite_auth_ims_impl_ims_provider_impl({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, oauth_provider_id, oauth_provider_ims_authorization_url, oauth_provider_ims_token_url, oauth_provider_ims_profile_url, oauth_provider_ims_extended_details_urls, oauth_provider_ims_validate_token_url, oauth_provider_ims_session_property, oauth_provider_ims_service_token_client_id, oauth_provider_ims_service_token_client_secret, oauth_provider_ims_service_token, ims_org_ref, ims_group_mapping, oauth_provider_ims_only_license_group, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_granite_auth_oauth_accesstoken_provider(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        name: Option<String>,
        auth_token_provider_title: Option<String>,
        auth_token_provider_default_claims: Option<&Vec<String>>,
        auth_token_provider_endpoint: Option<String>,
        auth_access_token_request: Option<String>,
        auth_token_provider_keypair_alias: Option<String>,
        auth_token_provider_conn_timeout: Option<i32>,
        auth_token_provider_so_timeout: Option<i32>,
        auth_token_provider_client_id: Option<String>,
        auth_token_provider_scope: Option<String>,
        auth_token_provider_reuse_access_token: Option<bool>,
        auth_token_provider_relaxed_ssl: Option<bool>,
        token_request_customizer_type: Option<String>,
        auth_token_validator_type: Option<String>,
        context: &C) -> Result<ComAdobeGraniteAuthOauthAccesstokenProviderResponse, ApiError>
    {
        info!("com_adobe_granite_auth_oauth_accesstoken_provider({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, name, auth_token_provider_title, auth_token_provider_default_claims, auth_token_provider_endpoint, auth_access_token_request, auth_token_provider_keypair_alias, auth_token_provider_conn_timeout, auth_token_provider_so_timeout, auth_token_provider_client_id, auth_token_provider_scope, auth_token_provider_reuse_access_token, auth_token_provider_relaxed_ssl, token_request_customizer_type, auth_token_validator_type, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_granite_auth_oauth_impl_bearer_authentication_handler(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        path: Option<String>,
        oauth_client_ids_allowed: Option<&Vec<String>>,
        auth_bearer_sync_ims: Option<bool>,
        auth_token_request_parameter: Option<String>,
        oauth_bearer_configid: Option<String>,
        oauth_jwt_support: Option<bool>,
        context: &C) -> Result<ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerResponse, ApiError>
    {
        info!("com_adobe_granite_auth_oauth_impl_bearer_authentication_handler({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, path, oauth_client_ids_allowed, auth_bearer_sync_ims, auth_token_request_parameter, oauth_bearer_configid, oauth_jwt_support, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_granite_auth_oauth_impl_default_token_validator_impl(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        auth_token_validator_type: Option<String>,
        context: &C) -> Result<ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplResponse, ApiError>
    {
        info!("com_adobe_granite_auth_oauth_impl_default_token_validator_impl({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, auth_token_validator_type, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_granite_auth_oauth_impl_facebook_provider_impl(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        oauth_provider_id: Option<String>,
        context: &C) -> Result<ComAdobeGraniteAuthOauthImplFacebookProviderImplResponse, ApiError>
    {
        info!("com_adobe_granite_auth_oauth_impl_facebook_provider_impl({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, oauth_provider_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_granite_auth_oauth_impl_github_provider_impl(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        oauth_provider_id: Option<String>,
        oauth_provider_github_authorization_url: Option<String>,
        oauth_provider_github_token_url: Option<String>,
        oauth_provider_github_profile_url: Option<String>,
        context: &C) -> Result<ComAdobeGraniteAuthOauthImplGithubProviderImplResponse, ApiError>
    {
        info!("com_adobe_granite_auth_oauth_impl_github_provider_impl({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, oauth_provider_id, oauth_provider_github_authorization_url, oauth_provider_github_token_url, oauth_provider_github_profile_url, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_granite_auth_oauth_impl_granite_provider(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        oauth_provider_id: Option<String>,
        oauth_provider_granite_authorization_url: Option<String>,
        oauth_provider_granite_token_url: Option<String>,
        oauth_provider_granite_profile_url: Option<String>,
        oauth_provider_granite_extended_details_urls: Option<String>,
        context: &C) -> Result<ComAdobeGraniteAuthOauthImplGraniteProviderResponse, ApiError>
    {
        info!("com_adobe_granite_auth_oauth_impl_granite_provider({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, oauth_provider_id, oauth_provider_granite_authorization_url, oauth_provider_granite_token_url, oauth_provider_granite_profile_url, oauth_provider_granite_extended_details_urls, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_granite_auth_oauth_impl_helper_provider_config_manager(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        oauth_cookie_login_timeout: Option<String>,
        oauth_cookie_max_age: Option<String>,
        context: &C) -> Result<ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerResponse, ApiError>
    {
        info!("com_adobe_granite_auth_oauth_impl_helper_provider_config_manager({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, oauth_cookie_login_timeout, oauth_cookie_max_age, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_granite_auth_oauth_impl_helper_provider_config_manager_internal(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        oauth_cookie_login_timeout: Option<String>,
        oauth_cookie_max_age: Option<String>,
        context: &C) -> Result<ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalResponse, ApiError>
    {
        info!("com_adobe_granite_auth_oauth_impl_helper_provider_config_manager_internal({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, oauth_cookie_login_timeout, oauth_cookie_max_age, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_granite_auth_oauth_impl_o_auth_authentication_handler(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        path: Option<String>,
        context: &C) -> Result<ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerResponse, ApiError>
    {
        info!("com_adobe_granite_auth_oauth_impl_o_auth_authentication_handler({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, path, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_granite_auth_oauth_impl_twitter_provider_impl(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        oauth_provider_id: Option<String>,
        context: &C) -> Result<ComAdobeGraniteAuthOauthImplTwitterProviderImplResponse, ApiError>
    {
        info!("com_adobe_granite_auth_oauth_impl_twitter_provider_impl({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, oauth_provider_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_granite_auth_oauth_provider(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        oauth_config_id: Option<String>,
        oauth_client_id: Option<String>,
        oauth_client_secret: Option<String>,
        oauth_scope: Option<&Vec<String>>,
        oauth_config_provider_id: Option<String>,
        oauth_create_users: Option<bool>,
        oauth_userid_property: Option<String>,
        force_strict_username_matching: Option<bool>,
        oauth_encode_userids: Option<bool>,
        oauth_hash_userids: Option<bool>,
        oauth_call_back_url: Option<String>,
        oauth_access_token_persist: Option<bool>,
        oauth_access_token_persist_cookie: Option<bool>,
        oauth_csrf_state_protection: Option<bool>,
        oauth_redirect_request_params: Option<bool>,
        oauth_config_siblings_allow: Option<bool>,
        context: &C) -> Result<ComAdobeGraniteAuthOauthProviderResponse, ApiError>
    {
        info!("com_adobe_granite_auth_oauth_provider({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, oauth_config_id, oauth_client_id, oauth_client_secret, oauth_scope, oauth_config_provider_id, oauth_create_users, oauth_userid_property, force_strict_username_matching, oauth_encode_userids, oauth_hash_userids, oauth_call_back_url, oauth_access_token_persist, oauth_access_token_persist_cookie, oauth_csrf_state_protection, oauth_redirect_request_params, oauth_config_siblings_allow, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_granite_auth_requirement_impl_default_requirement_handler(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        supported_paths: Option<&Vec<String>>,
        context: &C) -> Result<ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerResponse, ApiError>
    {
        info!("com_adobe_granite_auth_requirement_impl_default_requirement_handler({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, supported_paths, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_granite_auth_saml_saml_authentication_handler(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        path: Option<&Vec<String>>,
        service_ranking: Option<i32>,
        idp_url: Option<String>,
        idp_cert_alias: Option<String>,
        idp_http_redirect: Option<bool>,
        service_provider_entity_id: Option<String>,
        assertion_consumer_service_url: Option<String>,
        sp_private_key_alias: Option<String>,
        key_store_password: Option<String>,
        default_redirect_url: Option<String>,
        user_id_attribute: Option<String>,
        use_encryption: Option<bool>,
        create_user: Option<bool>,
        user_intermediate_path: Option<String>,
        add_group_memberships: Option<bool>,
        group_membership_attribute: Option<String>,
        default_groups: Option<&Vec<String>>,
        name_id_format: Option<String>,
        synchronize_attributes: Option<&Vec<String>>,
        handle_logout: Option<bool>,
        logout_url: Option<String>,
        clock_tolerance: Option<i32>,
        digest_method: Option<String>,
        signature_method: Option<String>,
        identity_sync_type: Option<String>,
        idp_identifier: Option<String>,
        context: &C) -> Result<ComAdobeGraniteAuthSamlSamlAuthenticationHandlerResponse, ApiError>
    {
        info!("com_adobe_granite_auth_saml_saml_authentication_handler({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, path, service_ranking, idp_url, idp_cert_alias, idp_http_redirect, service_provider_entity_id, assertion_consumer_service_url, sp_private_key_alias, key_store_password, default_redirect_url, user_id_attribute, use_encryption, create_user, user_intermediate_path, add_group_memberships, group_membership_attribute, default_groups, name_id_format, synchronize_attributes, handle_logout, logout_url, clock_tolerance, digest_method, signature_method, identity_sync_type, idp_identifier, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_granite_auth_sso_impl_sso_authentication_handler(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        path: Option<String>,
        service_ranking: Option<i32>,
        jaas_control_flag: Option<String>,
        jaas_realm_name: Option<String>,
        jaas_ranking: Option<i32>,
        headers: Option<&Vec<String>>,
        cookies: Option<&Vec<String>>,
        parameters: Option<&Vec<String>>,
        usermap: Option<&Vec<String>>,
        format: Option<String>,
        trusted_credentials_attribute: Option<String>,
        context: &C) -> Result<ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerResponse, ApiError>
    {
        info!("com_adobe_granite_auth_sso_impl_sso_authentication_handler({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, path, service_ranking, jaas_control_flag, jaas_realm_name, jaas_ranking, headers, cookies, parameters, usermap, format, trusted_credentials_attribute, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_granite_bundles_hc_impl_code_cache_health_check(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        hc_tags: Option<&Vec<String>>,
        minimum_code_cache_size: Option<i32>,
        context: &C) -> Result<ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckResponse, ApiError>
    {
        info!("com_adobe_granite_bundles_hc_impl_code_cache_health_check({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, hc_tags, minimum_code_cache_size, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_granite_bundles_hc_impl_crxde_support_bundle_health_check(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        hc_tags: Option<&Vec<String>>,
        context: &C) -> Result<ComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckResponse, ApiError>
    {
        info!("com_adobe_granite_bundles_hc_impl_crxde_support_bundle_health_check({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, hc_tags, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_granite_bundles_hc_impl_dav_ex_bundle_health_check(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        hc_tags: Option<&Vec<String>>,
        context: &C) -> Result<ComAdobeGraniteBundlesHcImplDavExBundleHealthCheckResponse, ApiError>
    {
        info!("com_adobe_granite_bundles_hc_impl_dav_ex_bundle_health_check({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, hc_tags, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_granite_bundles_hc_impl_inactive_bundles_health_check(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        hc_tags: Option<&Vec<String>>,
        ignored_bundles: Option<&Vec<String>>,
        context: &C) -> Result<ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckResponse, ApiError>
    {
        info!("com_adobe_granite_bundles_hc_impl_inactive_bundles_health_check({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, hc_tags, ignored_bundles, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_granite_bundles_hc_impl_jobs_health_check(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        hc_tags: Option<&Vec<String>>,
        max_queued_jobs: Option<i32>,
        context: &C) -> Result<ComAdobeGraniteBundlesHcImplJobsHealthCheckResponse, ApiError>
    {
        info!("com_adobe_granite_bundles_hc_impl_jobs_health_check({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, hc_tags, max_queued_jobs, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_granite_bundles_hc_impl_sling_get_servlet_health_check(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        hc_tags: Option<&Vec<String>>,
        context: &C) -> Result<ComAdobeGraniteBundlesHcImplSlingGetServletHealthCheckResponse, ApiError>
    {
        info!("com_adobe_granite_bundles_hc_impl_sling_get_servlet_health_check({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, hc_tags, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_granite_bundles_hc_impl_sling_java_script_handler_health_check(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        hc_tags: Option<&Vec<String>>,
        context: &C) -> Result<ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckResponse, ApiError>
    {
        info!("com_adobe_granite_bundles_hc_impl_sling_java_script_handler_health_check({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, hc_tags, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_granite_bundles_hc_impl_sling_jsp_script_handler_health_check(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        hc_tags: Option<&Vec<String>>,
        context: &C) -> Result<ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckResponse, ApiError>
    {
        info!("com_adobe_granite_bundles_hc_impl_sling_jsp_script_handler_health_check({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, hc_tags, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_granite_bundles_hc_impl_sling_referrer_filter_health_check(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        hc_tags: Option<&Vec<String>>,
        context: &C) -> Result<ComAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckResponse, ApiError>
    {
        info!("com_adobe_granite_bundles_hc_impl_sling_referrer_filter_health_check({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, hc_tags, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_granite_bundles_hc_impl_web_dav_bundle_health_check(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        hc_tags: Option<&Vec<String>>,
        context: &C) -> Result<ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheckResponse, ApiError>
    {
        info!("com_adobe_granite_bundles_hc_impl_web_dav_bundle_health_check({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, hc_tags, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_granite_comments_internal_comment_replication_content_filter_fac(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        replicate_comment_resource_types: Option<&Vec<String>>,
        context: &C) -> Result<ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacResponse, ApiError>
    {
        info!("com_adobe_granite_comments_internal_comment_replication_content_filter_fac({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, replicate_comment_resource_types, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_granite_compatrouter_impl_compat_switching_service_impl(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        compatgroups: Option<&Vec<String>>,
        enabled: Option<bool>,
        context: &C) -> Result<ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplResponse, ApiError>
    {
        info!("com_adobe_granite_compatrouter_impl_compat_switching_service_impl({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, compatgroups, enabled, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_granite_compatrouter_impl_routing_config(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        id: Option<String>,
        compat_path: Option<String>,
        new_path: Option<String>,
        context: &C) -> Result<ComAdobeGraniteCompatrouterImplRoutingConfigResponse, ApiError>
    {
        info!("com_adobe_granite_compatrouter_impl_routing_config({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, id, compat_path, new_path, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_granite_compatrouter_impl_switch_mapping_config(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        group: Option<String>,
        ids: Option<&Vec<String>>,
        context: &C) -> Result<ComAdobeGraniteCompatrouterImplSwitchMappingConfigResponse, ApiError>
    {
        info!("com_adobe_granite_compatrouter_impl_switch_mapping_config({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, group, ids, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_granite_conf_impl_runtime_aware_configuration_resource_resolving(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        enabled: Option<bool>,
        fallback_paths: Option<&Vec<String>>,
        context: &C) -> Result<ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingResponse, ApiError>
    {
        info!("com_adobe_granite_conf_impl_runtime_aware_configuration_resource_resolving({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, enabled, fallback_paths, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_granite_contexthub_impl_context_hub_impl(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        com_adobe_granite_contexthub_silent_mode: Option<bool>,
        com_adobe_granite_contexthub_show_ui: Option<bool>,
        context: &C) -> Result<ComAdobeGraniteContexthubImplContextHubImplResponse, ApiError>
    {
        info!("com_adobe_granite_contexthub_impl_context_hub_impl({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, com_adobe_granite_contexthub_silent_mode, com_adobe_granite_contexthub_show_ui, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_granite_cors_impl_cors_policy_impl(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        alloworigin: Option<&Vec<String>>,
        alloworiginregexp: Option<&Vec<String>>,
        allowedpaths: Option<&Vec<String>>,
        exposedheaders: Option<&Vec<String>>,
        maxage: Option<i32>,
        supportedheaders: Option<&Vec<String>>,
        supportedmethods: Option<&Vec<String>>,
        supportscredentials: Option<bool>,
        context: &C) -> Result<ComAdobeGraniteCorsImplCorsPolicyImplResponse, ApiError>
    {
        info!("com_adobe_granite_cors_impl_cors_policy_impl({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, alloworigin, alloworiginregexp, allowedpaths, exposedheaders, maxage, supportedheaders, supportedmethods, supportscredentials, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_granite_csrf_impl_csrf_filter(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        filter_methods: Option<&Vec<String>>,
        filter_enable_safe_user_agents: Option<bool>,
        filter_safe_user_agents: Option<&Vec<String>>,
        filter_excluded_paths: Option<&Vec<String>>,
        context: &C) -> Result<ComAdobeGraniteCsrfImplCsrfFilterResponse, ApiError>
    {
        info!("com_adobe_granite_csrf_impl_csrf_filter({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, filter_methods, filter_enable_safe_user_agents, filter_safe_user_agents, filter_excluded_paths, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_granite_csrf_impl_csrf_servlet(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        csrf_token_expires_in: Option<i32>,
        sling_auth_requirements: Option<String>,
        context: &C) -> Result<ComAdobeGraniteCsrfImplCsrfServletResponse, ApiError>
    {
        info!("com_adobe_granite_csrf_impl_csrf_servlet({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, csrf_token_expires_in, sling_auth_requirements, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_granite_distribution_core_impl_crypto_distribution_transport_se(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        name: Option<String>,
        username: Option<String>,
        encrypted_password: Option<String>,
        context: &C) -> Result<ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeResponse, ApiError>
    {
        info!("com_adobe_granite_distribution_core_impl_crypto_distribution_transport_se({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, name, username, encrypted_password, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_granite_distribution_core_impl_diff_diff_changes_observer(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        enabled: Option<bool>,
        agent_name: Option<String>,
        diff_path: Option<String>,
        observed_path: Option<String>,
        service_name: Option<String>,
        property_names: Option<String>,
        distribution_delay: Option<i32>,
        service_user_target: Option<String>,
        context: &C) -> Result<ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverResponse, ApiError>
    {
        info!("com_adobe_granite_distribution_core_impl_diff_diff_changes_observer({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, enabled, agent_name, diff_path, observed_path, service_name, property_names, distribution_delay, service_user_target, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_granite_distribution_core_impl_diff_diff_event_listener(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        diff_path: Option<String>,
        service_name: Option<String>,
        service_user_target: Option<String>,
        context: &C) -> Result<ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerResponse, ApiError>
    {
        info!("com_adobe_granite_distribution_core_impl_diff_diff_event_listener({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, diff_path, service_name, service_user_target, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_granite_distribution_core_impl_distribution_to_replication_even(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        importer_name: Option<&Vec<String>>,
        context: &C) -> Result<ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenResponse, ApiError>
    {
        info!("com_adobe_granite_distribution_core_impl_distribution_to_replication_even({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, importer_name, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_granite_distribution_core_impl_replication_adapters_replicat(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        provider_name: Option<String>,
        forward_requests: Option<bool>,
        context: &C) -> Result<ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatResponse, ApiError>
    {
        info!("com_adobe_granite_distribution_core_impl_replication_adapters_replicat({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, provider_name, forward_requests, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_granite_distribution_core_impl_replication_distribution_trans(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        forward_requests: Option<bool>,
        context: &C) -> Result<ComAdobeGraniteDistributionCoreImplReplicationDistributionTransResponse, ApiError>
    {
        info!("com_adobe_granite_distribution_core_impl_replication_distribution_trans({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, forward_requests, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_granite_distribution_core_impl_transport_access_token_distribu(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        name: Option<String>,
        service_name: Option<String>,
        user_id: Option<String>,
        access_token_provider_target: Option<String>,
        context: &C) -> Result<ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuResponse, ApiError>
    {
        info!("com_adobe_granite_distribution_core_impl_transport_access_token_distribu({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, name, service_name, user_id, access_token_provider_target, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_granite_frags_impl_check_http_header_flag(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        feature_name: Option<String>,
        feature_description: Option<String>,
        http_header_name: Option<String>,
        http_header_valuepattern: Option<String>,
        context: &C) -> Result<ComAdobeGraniteFragsImplCheckHttpHeaderFlagResponse, ApiError>
    {
        info!("com_adobe_granite_frags_impl_check_http_header_flag({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, feature_name, feature_description, http_header_name, http_header_valuepattern, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_granite_frags_impl_random_feature(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        feature_name: Option<String>,
        feature_description: Option<String>,
        active_percentage: Option<String>,
        cookie_name: Option<String>,
        cookie_max_age: Option<i32>,
        context: &C) -> Result<ComAdobeGraniteFragsImplRandomFeatureResponse, ApiError>
    {
        info!("com_adobe_granite_frags_impl_random_feature({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, feature_name, feature_description, active_percentage, cookie_name, cookie_max_age, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_granite_httpcache_file_file_cache_store(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        com_adobe_granite_httpcache_file_document_root: Option<String>,
        com_adobe_granite_httpcache_file_include_host: Option<String>,
        context: &C) -> Result<ComAdobeGraniteHttpcacheFileFileCacheStoreResponse, ApiError>
    {
        info!("com_adobe_granite_httpcache_file_file_cache_store({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, com_adobe_granite_httpcache_file_document_root, com_adobe_granite_httpcache_file_include_host, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_granite_httpcache_impl_outer_cache_filter(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        com_adobe_granite_httpcache_url_paths: Option<&Vec<String>>,
        context: &C) -> Result<ComAdobeGraniteHttpcacheImplOuterCacheFilterResponse, ApiError>
    {
        info!("com_adobe_granite_httpcache_impl_outer_cache_filter({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, com_adobe_granite_httpcache_url_paths, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_granite_i18n_impl_bundle_pseudo_translations(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        pseudo_patterns: Option<&Vec<String>>,
        context: &C) -> Result<ComAdobeGraniteI18nImplBundlePseudoTranslationsResponse, ApiError>
    {
        info!("com_adobe_granite_i18n_impl_bundle_pseudo_translations({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, pseudo_patterns, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_granite_i18n_impl_preferences_locale_resolver_service(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        security_preferences_name: Option<String>,
        context: &C) -> Result<ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceResponse, ApiError>
    {
        info!("com_adobe_granite_i18n_impl_preferences_locale_resolver_service({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, security_preferences_name, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_granite_infocollector_info_collector(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        granite_infocollector_include_thread_dumps: Option<bool>,
        granite_infocollector_include_heap_dump: Option<bool>,
        context: &C) -> Result<ComAdobeGraniteInfocollectorInfoCollectorResponse, ApiError>
    {
        info!("com_adobe_granite_infocollector_info_collector({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, granite_infocollector_include_thread_dumps, granite_infocollector_include_heap_dump, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_factory(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        com_adobe_granite_jetty_ssl_port: Option<i32>,
        com_adobe_granite_jetty_ssl_keystore_user: Option<String>,
        com_adobe_granite_jetty_ssl_keystore_password: Option<String>,
        com_adobe_granite_jetty_ssl_ciphersuites_excluded: Option<&Vec<String>>,
        com_adobe_granite_jetty_ssl_ciphersuites_included: Option<&Vec<String>>,
        com_adobe_granite_jetty_ssl_client_certificate: Option<String>,
        context: &C) -> Result<ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryResponse, ApiError>
    {
        info!("com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_factory({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, com_adobe_granite_jetty_ssl_port, com_adobe_granite_jetty_ssl_keystore_user, com_adobe_granite_jetty_ssl_keystore_password, com_adobe_granite_jetty_ssl_ciphersuites_excluded, com_adobe_granite_jetty_ssl_ciphersuites_included, com_adobe_granite_jetty_ssl_client_certificate, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_granite_license_impl_license_check_filter(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        check_internval: Option<i32>,
        exclude_ids: Option<&Vec<String>>,
        encrypt_ping: Option<bool>,
        context: &C) -> Result<ComAdobeGraniteLicenseImplLicenseCheckFilterResponse, ApiError>
    {
        info!("com_adobe_granite_license_impl_license_check_filter({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, check_internval, exclude_ids, encrypt_ping, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_granite_logging_impl_log_analyser_impl(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        messages_queue_size: Option<i32>,
        logger_config: Option<&Vec<String>>,
        messages_size: Option<i32>,
        context: &C) -> Result<ComAdobeGraniteLoggingImplLogAnalyserImplResponse, ApiError>
    {
        info!("com_adobe_granite_logging_impl_log_analyser_impl({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, messages_queue_size, logger_config, messages_size, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_granite_logging_impl_log_error_health_check(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        hc_tags: Option<&Vec<String>>,
        context: &C) -> Result<ComAdobeGraniteLoggingImplLogErrorHealthCheckResponse, ApiError>
    {
        info!("com_adobe_granite_logging_impl_log_error_health_check({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, hc_tags, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_granite_maintenance_crx_impl_data_store_garbage_collection_task(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        granite_maintenance_mandatory: Option<bool>,
        job_topics: Option<String>,
        context: &C) -> Result<ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskResponse, ApiError>
    {
        info!("com_adobe_granite_maintenance_crx_impl_data_store_garbage_collection_task({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, granite_maintenance_mandatory, job_topics, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_granite_maintenance_crx_impl_lucene_binaries_cleanup_task(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        job_topics: Option<String>,
        context: &C) -> Result<ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskResponse, ApiError>
    {
        info!("com_adobe_granite_maintenance_crx_impl_lucene_binaries_cleanup_task({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, job_topics, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_granite_maintenance_crx_impl_revision_cleanup_task(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        full_gc_days: Option<&Vec<String>>,
        context: &C) -> Result<ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskResponse, ApiError>
    {
        info!("com_adobe_granite_maintenance_crx_impl_revision_cleanup_task({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, full_gc_days, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_granite_monitoring_impl_script_config_impl(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        script_filename: Option<String>,
        script_display: Option<String>,
        script_path: Option<String>,
        script_platform: Option<&Vec<String>>,
        interval: Option<i32>,
        jmxdomain: Option<String>,
        context: &C) -> Result<ComAdobeGraniteMonitoringImplScriptConfigImplResponse, ApiError>
    {
        info!("com_adobe_granite_monitoring_impl_script_config_impl({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, script_filename, script_display, script_path, script_platform, interval, jmxdomain, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_granite_oauth_server_auth_impl_o_auth2_server_authentication_han(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        path: Option<String>,
        jaas_control_flag: Option<String>,
        jaas_realm_name: Option<String>,
        jaas_ranking: Option<i32>,
        oauth_offline_validation: Option<bool>,
        context: &C) -> Result<ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanResponse, ApiError>
    {
        info!("com_adobe_granite_oauth_server_auth_impl_o_auth2_server_authentication_han({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, path, jaas_control_flag, jaas_realm_name, jaas_ranking, oauth_offline_validation, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_granite_oauth_server_impl_access_token_cleanup_task(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        scheduler_expression: Option<String>,
        context: &C) -> Result<ComAdobeGraniteOauthServerImplAccessTokenCleanupTaskResponse, ApiError>
    {
        info!("com_adobe_granite_oauth_server_impl_access_token_cleanup_task({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, scheduler_expression, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_granite_oauth_server_impl_o_auth2_client_revocation_servlet(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        oauth_client_revocation_active: Option<bool>,
        context: &C) -> Result<ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletResponse, ApiError>
    {
        info!("com_adobe_granite_oauth_server_impl_o_auth2_client_revocation_servlet({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, oauth_client_revocation_active, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_granite_oauth_server_impl_o_auth2_revocation_endpoint_servlet(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        sling_servlet_paths: Option<String>,
        oauth_revocation_active: Option<bool>,
        context: &C) -> Result<ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletResponse, ApiError>
    {
        info!("com_adobe_granite_oauth_server_impl_o_auth2_revocation_endpoint_servlet({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, sling_servlet_paths, oauth_revocation_active, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_granite_oauth_server_impl_o_auth2_token_endpoint_servlet(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        oauth_issuer: Option<String>,
        oauth_access_token_expires_in: Option<String>,
        osgi_http_whiteboard_servlet_pattern: Option<String>,
        osgi_http_whiteboard_context_select: Option<String>,
        context: &C) -> Result<ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletResponse, ApiError>
    {
        info!("com_adobe_granite_oauth_server_impl_o_auth2_token_endpoint_servlet({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, oauth_issuer, oauth_access_token_expires_in, osgi_http_whiteboard_servlet_pattern, osgi_http_whiteboard_context_select, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_granite_oauth_server_impl_o_auth2_token_revocation_servlet(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        oauth_token_revocation_active: Option<bool>,
        context: &C) -> Result<ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletResponse, ApiError>
    {
        info!("com_adobe_granite_oauth_server_impl_o_auth2_token_revocation_servlet({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, oauth_token_revocation_active, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_granite_offloading_impl_offloading_configurator(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        offloading_transporter: Option<String>,
        offloading_cleanup_payload: Option<bool>,
        context: &C) -> Result<ComAdobeGraniteOffloadingImplOffloadingConfiguratorResponse, ApiError>
    {
        info!("com_adobe_granite_offloading_impl_offloading_configurator({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, offloading_transporter, offloading_cleanup_payload, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_granite_offloading_impl_offloading_job_cloner(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        offloading_jobcloner_enabled: Option<bool>,
        context: &C) -> Result<ComAdobeGraniteOffloadingImplOffloadingJobClonerResponse, ApiError>
    {
        info!("com_adobe_granite_offloading_impl_offloading_job_cloner({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, offloading_jobcloner_enabled, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_granite_offloading_impl_offloading_job_offloader(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        offloading_offloader_enabled: Option<bool>,
        context: &C) -> Result<ComAdobeGraniteOffloadingImplOffloadingJobOffloaderResponse, ApiError>
    {
        info!("com_adobe_granite_offloading_impl_offloading_job_offloader({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, offloading_offloader_enabled, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_granite_offloading_impl_transporter_offloading_agent_manager(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        offloading_agentmanager_enabled: Option<bool>,
        context: &C) -> Result<ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerResponse, ApiError>
    {
        info!("com_adobe_granite_offloading_impl_transporter_offloading_agent_manager({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, offloading_agentmanager_enabled, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_granite_offloading_impl_transporter_offloading_default_transpo(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        default_transport_agent_to_worker_prefix: Option<String>,
        default_transport_agent_to_master_prefix: Option<String>,
        default_transport_input_package: Option<String>,
        default_transport_output_package: Option<String>,
        default_transport_replication_synchronous: Option<bool>,
        default_transport_contentpackage: Option<bool>,
        offloading_transporter_default_enabled: Option<bool>,
        context: &C) -> Result<ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoResponse, ApiError>
    {
        info!("com_adobe_granite_offloading_impl_transporter_offloading_default_transpo({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, default_transport_agent_to_worker_prefix, default_transport_agent_to_master_prefix, default_transport_input_package, default_transport_output_package, default_transport_replication_synchronous, default_transport_contentpackage, offloading_transporter_default_enabled, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_granite_omnisearch_impl_core_omni_search_service_impl(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        omnisearch_suggestion_requiretext_min: Option<i32>,
        omnisearch_suggestion_spellcheck_require: Option<bool>,
        context: &C) -> Result<ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplResponse, ApiError>
    {
        info!("com_adobe_granite_omnisearch_impl_core_omni_search_service_impl({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, omnisearch_suggestion_requiretext_min, omnisearch_suggestion_spellcheck_require, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_granite_optout_impl_opt_out_service_impl(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        optout_cookies: Option<&Vec<String>>,
        optout_headers: Option<&Vec<String>>,
        optout_whitelist_cookies: Option<&Vec<String>>,
        context: &C) -> Result<ComAdobeGraniteOptoutImplOptOutServiceImplResponse, ApiError>
    {
        info!("com_adobe_granite_optout_impl_opt_out_service_impl({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, optout_cookies, optout_headers, optout_whitelist_cookies, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_granite_queries_impl_hc_async_index_health_check(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        indexing_critical_threshold: Option<i32>,
        indexing_warn_threshold: Option<i32>,
        hc_tags: Option<&Vec<String>>,
        context: &C) -> Result<ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckResponse, ApiError>
    {
        info!("com_adobe_granite_queries_impl_hc_async_index_health_check({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, indexing_critical_threshold, indexing_warn_threshold, hc_tags, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_granite_queries_impl_hc_large_index_health_check(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        large_index_critical_threshold: Option<i32>,
        large_index_warn_threshold: Option<i32>,
        hc_tags: Option<&Vec<String>>,
        context: &C) -> Result<ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckResponse, ApiError>
    {
        info!("com_adobe_granite_queries_impl_hc_large_index_health_check({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, large_index_critical_threshold, large_index_warn_threshold, hc_tags, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_granite_queries_impl_hc_queries_status_health_check(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        hc_tags: Option<&Vec<String>>,
        context: &C) -> Result<ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheckResponse, ApiError>
    {
        info!("com_adobe_granite_queries_impl_hc_queries_status_health_check({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, hc_tags, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_granite_queries_impl_hc_query_health_check_metrics(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        get_period: Option<i32>,
        context: &C) -> Result<ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsResponse, ApiError>
    {
        info!("com_adobe_granite_queries_impl_hc_query_health_check_metrics({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, get_period, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_granite_queries_impl_hc_query_limits_health_check(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        hc_tags: Option<&Vec<String>>,
        context: &C) -> Result<ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckResponse, ApiError>
    {
        info!("com_adobe_granite_queries_impl_hc_query_limits_health_check({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, hc_tags, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_granite_replication_hc_impl_replication_queue_health_check(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        number_of_retries_allowed: Option<i32>,
        hc_tags: Option<&Vec<String>>,
        context: &C) -> Result<ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckResponse, ApiError>
    {
        info!("com_adobe_granite_replication_hc_impl_replication_queue_health_check({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, number_of_retries_allowed, hc_tags, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_granite_replication_hc_impl_replication_transport_users_health_c(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        hc_tags: Option<&Vec<String>>,
        context: &C) -> Result<ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCResponse, ApiError>
    {
        info!("com_adobe_granite_replication_hc_impl_replication_transport_users_health_c({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, hc_tags, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_granite_repository_hc_impl_authorizable_node_name_health_check(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        hc_tags: Option<&Vec<String>>,
        context: &C) -> Result<ComAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckResponse, ApiError>
    {
        info!("com_adobe_granite_repository_hc_impl_authorizable_node_name_health_check({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, hc_tags, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_granite_repository_hc_impl_content_sling_sling_content_health_c(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        hc_tags: Option<&Vec<String>>,
        exclude_search_path: Option<&Vec<String>>,
        context: &C) -> Result<ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCResponse, ApiError>
    {
        info!("com_adobe_granite_repository_hc_impl_content_sling_sling_content_health_c({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, hc_tags, exclude_search_path, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_granite_repository_hc_impl_continuous_rgc_health_check(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        hc_tags: Option<&Vec<String>>,
        context: &C) -> Result<ComAdobeGraniteRepositoryHcImplContinuousRgcHealthCheckResponse, ApiError>
    {
        info!("com_adobe_granite_repository_hc_impl_continuous_rgc_health_check({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, hc_tags, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_granite_repository_hc_impl_default_access_user_profile_health_che(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        hc_tags: Option<&Vec<String>>,
        context: &C) -> Result<ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheResponse, ApiError>
    {
        info!("com_adobe_granite_repository_hc_impl_default_access_user_profile_health_che({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, hc_tags, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_granite_repository_hc_impl_default_logins_health_check(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        hc_tags: Option<&Vec<String>>,
        account_logins: Option<&Vec<String>>,
        console_logins: Option<&Vec<String>>,
        context: &C) -> Result<ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckResponse, ApiError>
    {
        info!("com_adobe_granite_repository_hc_impl_default_logins_health_check({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, hc_tags, account_logins, console_logins, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_granite_repository_hc_impl_disk_space_health_check(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        hc_tags: Option<&Vec<String>>,
        disk_space_warn_threshold: Option<i32>,
        disk_space_error_threshold: Option<i32>,
        context: &C) -> Result<ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckResponse, ApiError>
    {
        info!("com_adobe_granite_repository_hc_impl_disk_space_health_check({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, hc_tags, disk_space_warn_threshold, disk_space_error_threshold, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_granite_repository_hc_impl_observation_queue_length_health_check(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        hc_tags: Option<&Vec<String>>,
        context: &C) -> Result<ComAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckResponse, ApiError>
    {
        info!("com_adobe_granite_repository_hc_impl_observation_queue_length_health_check({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, hc_tags, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_granite_repository_impl_commit_stats_config(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        enabled: Option<bool>,
        interval_seconds: Option<i32>,
        commits_per_interval_threshold: Option<i32>,
        max_location_length: Option<i32>,
        max_details_shown: Option<i32>,
        min_details_percentage: Option<i32>,
        thread_matchers: Option<&Vec<String>>,
        max_greedy_depth: Option<i32>,
        greedy_stack_matchers: Option<String>,
        stack_filters: Option<&Vec<String>>,
        stack_matchers: Option<&Vec<String>>,
        stack_categorizers: Option<&Vec<String>>,
        stack_shorteners: Option<&Vec<String>>,
        context: &C) -> Result<ComAdobeGraniteRepositoryImplCommitStatsConfigResponse, ApiError>
    {
        info!("com_adobe_granite_repository_impl_commit_stats_config({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, enabled, interval_seconds, commits_per_interval_threshold, max_location_length, max_details_shown, min_details_percentage, thread_matchers, max_greedy_depth, greedy_stack_matchers, stack_filters, stack_matchers, stack_categorizers, stack_shorteners, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_granite_repository_service_user_configuration(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        service_ranking: Option<i32>,
        serviceusers_simple_subject_population: Option<bool>,
        serviceusers_list: Option<&Vec<String>>,
        context: &C) -> Result<ComAdobeGraniteRepositoryServiceUserConfigurationResponse, ApiError>
    {
        info!("com_adobe_granite_repository_service_user_configuration({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, service_ranking, serviceusers_simple_subject_population, serviceusers_list, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_granite_requests_logging_impl_hc_requests_status_health_check_im(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        hc_tags: Option<&Vec<String>>,
        context: &C) -> Result<ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImResponse, ApiError>
    {
        info!("com_adobe_granite_requests_logging_impl_hc_requests_status_health_check_im({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, hc_tags, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_granite_resourcestatus_impl_composite_status_type(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        name: Option<String>,
        types: Option<&Vec<String>>,
        context: &C) -> Result<ComAdobeGraniteResourcestatusImplCompositeStatusTypeResponse, ApiError>
    {
        info!("com_adobe_granite_resourcestatus_impl_composite_status_type({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, name, types, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_granite_resourcestatus_impl_status_resource_provider_impl(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        provider_root: Option<String>,
        context: &C) -> Result<ComAdobeGraniteResourcestatusImplStatusResourceProviderImplResponse, ApiError>
    {
        info!("com_adobe_granite_resourcestatus_impl_status_resource_provider_impl({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, provider_root, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_granite_rest_assets_impl_asset_content_disposition_filter(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        mime_allow_empty: Option<bool>,
        mime_allowed: Option<&Vec<String>>,
        context: &C) -> Result<ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterResponse, ApiError>
    {
        info!("com_adobe_granite_rest_assets_impl_asset_content_disposition_filter({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, mime_allow_empty, mime_allowed, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_granite_rest_impl_api_endpoint_resource_provider_factory_impl(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        provider_roots: Option<String>,
        context: &C) -> Result<ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplResponse, ApiError>
    {
        info!("com_adobe_granite_rest_impl_api_endpoint_resource_provider_factory_impl({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, provider_roots, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_granite_rest_impl_servlet_default_get_servlet(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        default_limit: Option<i32>,
        use_absolute_uri: Option<bool>,
        context: &C) -> Result<ComAdobeGraniteRestImplServletDefaultGetServletResponse, ApiError>
    {
        info!("com_adobe_granite_rest_impl_servlet_default_get_servlet({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, default_limit, use_absolute_uri, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_granite_security_user_ui_internal_servlets_ssl_configuration_s(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        hc_tags: Option<&Vec<String>>,
        context: &C) -> Result<ComAdobeGraniteSecurityUserUiInternalServletsSslConfigurationSResponse, ApiError>
    {
        info!("com_adobe_granite_security_user_ui_internal_servlets_ssl_configuration_s({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, hc_tags, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_granite_security_user_user_properties_service(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        adapter_condition: Option<String>,
        granite_userproperties_nodetypes: Option<&Vec<String>>,
        granite_userproperties_resourcetypes: Option<&Vec<String>>,
        context: &C) -> Result<ComAdobeGraniteSecurityUserUserPropertiesServiceResponse, ApiError>
    {
        info!("com_adobe_granite_security_user_user_properties_service({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, adapter_condition, granite_userproperties_nodetypes, granite_userproperties_resourcetypes, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_granite_socialgraph_impl_social_graph_factory_impl(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        group2member_relationship_outgoing: Option<String>,
        group2member_excluded_outgoing: Option<&Vec<String>>,
        group2member_relationship_incoming: Option<String>,
        group2member_excluded_incoming: Option<&Vec<String>>,
        context: &C) -> Result<ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplResponse, ApiError>
    {
        info!("com_adobe_granite_socialgraph_impl_social_graph_factory_impl({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, group2member_relationship_outgoing, group2member_excluded_outgoing, group2member_relationship_incoming, group2member_excluded_incoming, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_granite_system_monitoring_impl_system_stats_m_bean_impl(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        scheduler_expression: Option<String>,
        jmx_objectname: Option<String>,
        context: &C) -> Result<ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplResponse, ApiError>
    {
        info!("com_adobe_granite_system_monitoring_impl_system_stats_m_bean_impl({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, scheduler_expression, jmx_objectname, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_granite_taskmanagement_impl_jcr_task_adapter_factory(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        adapter_condition: Option<String>,
        context: &C) -> Result<ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryResponse, ApiError>
    {
        info!("com_adobe_granite_taskmanagement_impl_jcr_task_adapter_factory({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, adapter_condition, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_granite_taskmanagement_impl_jcr_task_archive_service(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        archiving_enabled: Option<bool>,
        scheduler_expression: Option<String>,
        archive_since_days_completed: Option<i32>,
        context: &C) -> Result<ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceResponse, ApiError>
    {
        info!("com_adobe_granite_taskmanagement_impl_jcr_task_archive_service({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, archiving_enabled, scheduler_expression, archive_since_days_completed, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_granite_taskmanagement_impl_purge_task_purge_maintenance_task(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        purge_completed: Option<bool>,
        completed_age: Option<i32>,
        purge_active: Option<bool>,
        active_age: Option<i32>,
        save_threshold: Option<i32>,
        context: &C) -> Result<ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskResponse, ApiError>
    {
        info!("com_adobe_granite_taskmanagement_impl_purge_task_purge_maintenance_task({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, purge_completed, completed_age, purge_active, active_age, save_threshold, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_granite_taskmanagement_impl_service_task_manager_adapter_factor(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        adapter_condition: Option<String>,
        taskmanager_admingroups: Option<&Vec<String>>,
        context: &C) -> Result<ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorResponse, ApiError>
    {
        info!("com_adobe_granite_taskmanagement_impl_service_task_manager_adapter_factor({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, adapter_condition, taskmanager_admingroups, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_granite_threaddump_thread_dump_collector(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        scheduler_period: Option<i32>,
        scheduler_run_on: Option<String>,
        granite_threaddump_enabled: Option<bool>,
        granite_threaddump_dumps_per_file: Option<i32>,
        granite_threaddump_enable_gzip_compression: Option<bool>,
        granite_threaddump_enable_directories_compression: Option<bool>,
        granite_threaddump_enable_j_stack: Option<bool>,
        granite_threaddump_max_backup_days: Option<i32>,
        granite_threaddump_backup_clean_trigger: Option<String>,
        context: &C) -> Result<ComAdobeGraniteThreaddumpThreadDumpCollectorResponse, ApiError>
    {
        info!("com_adobe_granite_threaddump_thread_dump_collector({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, scheduler_period, scheduler_run_on, granite_threaddump_enabled, granite_threaddump_dumps_per_file, granite_threaddump_enable_gzip_compression, granite_threaddump_enable_directories_compression, granite_threaddump_enable_j_stack, granite_threaddump_max_backup_days, granite_threaddump_backup_clean_trigger, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        translation_factory: Option<String>,
        default_connector_label: Option<String>,
        default_connector_attribution: Option<String>,
        default_connector_workspace_id: Option<String>,
        default_connector_subscription_key: Option<String>,
        language_map_location: Option<String>,
        category_map_location: Option<String>,
        retry_attempts: Option<i32>,
        timeout_count: Option<i32>,
        context: &C) -> Result<ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslResponse, ApiError>
    {
        info!("com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, translation_factory, default_connector_label, default_connector_attribution, default_connector_workspace_id, default_connector_subscription_key, language_map_location, category_map_location, retry_attempts, timeout_count, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_granite_translation_core_impl_translation_manager_impl(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        default_connector_name: Option<String>,
        default_category: Option<String>,
        context: &C) -> Result<ComAdobeGraniteTranslationCoreImplTranslationManagerImplResponse, ApiError>
    {
        info!("com_adobe_granite_translation_core_impl_translation_manager_impl({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, default_connector_name, default_category, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        htmllibmanager_timing: Option<bool>,
        htmllibmanager_debug_init_js: Option<String>,
        htmllibmanager_minify: Option<bool>,
        htmllibmanager_debug: Option<bool>,
        htmllibmanager_gzip: Option<bool>,
        htmllibmanager_max_data_uri_size: Option<i32>,
        htmllibmanager_maxage: Option<i32>,
        htmllibmanager_force_cq_url_info: Option<bool>,
        htmllibmanager_defaultthemename: Option<String>,
        htmllibmanager_defaultuserthemename: Option<String>,
        htmllibmanager_clientmanager: Option<String>,
        htmllibmanager_path_list: Option<&Vec<String>>,
        htmllibmanager_excluded_path_list: Option<&Vec<String>>,
        htmllibmanager_processor_js: Option<&Vec<String>>,
        htmllibmanager_processor_css: Option<&Vec<String>>,
        htmllibmanager_longcache_patterns: Option<&Vec<String>>,
        htmllibmanager_longcache_format: Option<String>,
        htmllibmanager_use_file_system_output_cache: Option<bool>,
        htmllibmanager_file_system_output_cache_location: Option<String>,
        htmllibmanager_disable_replacement: Option<&Vec<String>>,
        context: &C) -> Result<ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplResponse, ApiError>
    {
        info!("com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, htmllibmanager_timing, htmllibmanager_debug_init_js, htmllibmanager_minify, htmllibmanager_debug, htmllibmanager_gzip, htmllibmanager_max_data_uri_size, htmllibmanager_maxage, htmllibmanager_force_cq_url_info, htmllibmanager_defaultthemename, htmllibmanager_defaultuserthemename, htmllibmanager_clientmanager, htmllibmanager_path_list, htmllibmanager_excluded_path_list, htmllibmanager_processor_js, htmllibmanager_processor_css, htmllibmanager_longcache_patterns, htmllibmanager_longcache_format, htmllibmanager_use_file_system_output_cache, htmllibmanager_file_system_output_cache_location, htmllibmanager_disable_replacement, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_granite_workflow_console_frags_workflow_withdraw_feature(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        enabled: Option<bool>,
        context: &C) -> Result<ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureResponse, ApiError>
    {
        info!("com_adobe_granite_workflow_console_frags_workflow_withdraw_feature({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, enabled, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_granite_workflow_console_publish_workflow_publish_event_service(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        granite_workflow_workflow_publish_event_service_enabled: Option<bool>,
        context: &C) -> Result<ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceResponse, ApiError>
    {
        info!("com_adobe_granite_workflow_console_publish_workflow_publish_event_service({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, granite_workflow_workflow_publish_event_service_enabled, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_granite_workflow_core_jcr_workflow_bucket_manager(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        bucket_size: Option<i32>,
        context: &C) -> Result<ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerResponse, ApiError>
    {
        info!("com_adobe_granite_workflow_core_jcr_workflow_bucket_manager({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, bucket_size, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_granite_workflow_core_job_external_process_job_handler(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        default_timeout: Option<i32>,
        max_timeout: Option<i32>,
        default_period: Option<i32>,
        context: &C) -> Result<ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerResponse, ApiError>
    {
        info!("com_adobe_granite_workflow_core_job_external_process_job_handler({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, default_timeout, max_timeout, default_period, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_granite_workflow_core_job_job_handler(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        job_topics: Option<&Vec<String>>,
        allow_self_process_termination: Option<bool>,
        context: &C) -> Result<ComAdobeGraniteWorkflowCoreJobJobHandlerResponse, ApiError>
    {
        info!("com_adobe_granite_workflow_core_job_job_handler({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, job_topics, allow_self_process_termination, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_granite_workflow_core_offloading_workflow_offloading_job_consum(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        job_topics: Option<String>,
        context: &C) -> Result<ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumResponse, ApiError>
    {
        info!("com_adobe_granite_workflow_core_offloading_workflow_offloading_job_consum({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, job_topics, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_granite_workflow_core_payload_map_cache(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        get_system_workflow_models: Option<&Vec<String>>,
        get_package_root_path: Option<String>,
        context: &C) -> Result<ComAdobeGraniteWorkflowCorePayloadMapCacheResponse, ApiError>
    {
        info!("com_adobe_granite_workflow_core_payload_map_cache({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, get_system_workflow_models, get_package_root_path, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_granite_workflow_core_payloadmap_payload_move_listener(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        payload_move_white_list: Option<&Vec<String>>,
        payload_move_handle_from_workflow_process: Option<bool>,
        context: &C) -> Result<ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerResponse, ApiError>
    {
        info!("com_adobe_granite_workflow_core_payloadmap_payload_move_listener({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, payload_move_white_list, payload_move_handle_from_workflow_process, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_granite_workflow_core_workflow_config(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        cq_workflow_config_workflow_packages_root_path: Option<&Vec<String>>,
        cq_workflow_config_workflow_process_legacy_mode: Option<bool>,
        cq_workflow_config_allow_locking: Option<bool>,
        context: &C) -> Result<ComAdobeGraniteWorkflowCoreWorkflowConfigResponse, ApiError>
    {
        info!("com_adobe_granite_workflow_core_workflow_config({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, cq_workflow_config_workflow_packages_root_path, cq_workflow_config_workflow_process_legacy_mode, cq_workflow_config_allow_locking, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_granite_workflow_core_workflow_session_factory(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        granite_workflowinbox_sort_property_name: Option<String>,
        granite_workflowinbox_sort_order: Option<String>,
        cq_workflow_job_retry: Option<i32>,
        cq_workflow_superuser: Option<&Vec<String>>,
        granite_workflow_inbox_query_size: Option<i32>,
        granite_workflow_admin_user_group_filter: Option<bool>,
        granite_workflow_enforce_workitem_assignee_permissions: Option<bool>,
        granite_workflow_enforce_workflow_initiator_permissions: Option<bool>,
        granite_workflow_inject_tenant_id_in_job_topics: Option<bool>,
        granite_workflow_max_purge_save_threshold: Option<i32>,
        granite_workflow_max_purge_query_count: Option<i32>,
        context: &C) -> Result<ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryResponse, ApiError>
    {
        info!("com_adobe_granite_workflow_core_workflow_session_factory({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, granite_workflowinbox_sort_property_name, granite_workflowinbox_sort_order, cq_workflow_job_retry, cq_workflow_superuser, granite_workflow_inbox_query_size, granite_workflow_admin_user_group_filter, granite_workflow_enforce_workitem_assignee_permissions, granite_workflow_enforce_workflow_initiator_permissions, granite_workflow_inject_tenant_id_in_job_topics, granite_workflow_max_purge_save_threshold, granite_workflow_max_purge_query_count, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_granite_workflow_purge_scheduler(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        scheduledpurge_name: Option<String>,
        scheduledpurge_workflow_status: Option<String>,
        scheduledpurge_model_ids: Option<&Vec<String>>,
        scheduledpurge_daysold: Option<i32>,
        context: &C) -> Result<ComAdobeGraniteWorkflowPurgeSchedulerResponse, ApiError>
    {
        info!("com_adobe_granite_workflow_purge_scheduler({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, scheduledpurge_name, scheduledpurge_workflow_status, scheduledpurge_model_ids, scheduledpurge_daysold, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_octopus_ncomm_bootstrap(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        max_connections: Option<i32>,
        max_requests: Option<i32>,
        request_timeout: Option<i32>,
        request_retries: Option<i32>,
        launch_timeout: Option<i32>,
        context: &C) -> Result<ComAdobeOctopusNcommBootstrapResponse, ApiError>
    {
        info!("com_adobe_octopus_ncomm_bootstrap({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, max_connections, max_requests, request_timeout, request_retries, launch_timeout, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_social_integrations_livefyre_user_pingforpull_impl_ping_pull_s(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        communities_integration_livefyre_sling_event_filter: Option<String>,
        context: &C) -> Result<ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSResponse, ApiError>
    {
        info!("com_adobe_social_integrations_livefyre_user_pingforpull_impl_ping_pull_s({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, communities_integration_livefyre_sling_event_filter, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_adobe_xmp_worker_files_ncomm_xmp_files_n_comm(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        max_connections: Option<String>,
        max_requests: Option<String>,
        request_timeout: Option<String>,
        log_dir: Option<String>,
        context: &C) -> Result<ComAdobeXmpWorkerFilesNcommXmpFilesNCommResponse, ApiError>
    {
        info!("com_adobe_xmp_worker_files_ncomm_xmp_files_n_comm({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, max_connections, max_requests, request_timeout, log_dir, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_commons_datasource_jdbcpool_jdbc_pool_service(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        jdbc_driver_class: Option<String>,
        jdbc_connection_uri: Option<String>,
        jdbc_username: Option<String>,
        jdbc_password: Option<String>,
        jdbc_validation_query: Option<String>,
        default_readonly: Option<bool>,
        default_autocommit: Option<bool>,
        pool_size: Option<i32>,
        pool_max_wait_msec: Option<i32>,
        datasource_name: Option<String>,
        datasource_svc_properties: Option<&Vec<String>>,
        context: &C) -> Result<ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceResponse, ApiError>
    {
        info!("com_day_commons_datasource_jdbcpool_jdbc_pool_service({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, jdbc_driver_class, jdbc_connection_uri, jdbc_username, jdbc_password, jdbc_validation_query, default_readonly, default_autocommit, pool_size, pool_max_wait_msec, datasource_name, datasource_svc_properties, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_commons_httpclient(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        proxy_enabled: Option<bool>,
        proxy_host: Option<String>,
        proxy_user: Option<String>,
        proxy_password: Option<String>,
        proxy_ntlm_host: Option<String>,
        proxy_ntlm_domain: Option<String>,
        proxy_exceptions: Option<&Vec<String>>,
        context: &C) -> Result<ComDayCommonsHttpclientResponse, ApiError>
    {
        info!("com_day_commons_httpclient({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, proxy_enabled, proxy_host, proxy_user, proxy_password, proxy_ntlm_host, proxy_ntlm_domain, proxy_exceptions, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_analytics_impl_store_properties_change_listener(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        cq_store_listener_additional_store_paths: Option<&Vec<String>>,
        context: &C) -> Result<ComDayCqAnalyticsImplStorePropertiesChangeListenerResponse, ApiError>
    {
        info!("com_day_cq_analytics_impl_store_properties_change_listener({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, cq_store_listener_additional_store_paths, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_analytics_sitecatalyst_impl_exporter_classifications_exporte(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        allowed_paths: Option<&Vec<String>>,
        cq_analytics_saint_exporter_pagesize: Option<i32>,
        context: &C) -> Result<ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteResponse, ApiError>
    {
        info!("com_day_cq_analytics_sitecatalyst_impl_exporter_classifications_exporte({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, allowed_paths, cq_analytics_saint_exporter_pagesize, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_analytics_sitecatalyst_impl_importer_report_importer(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        report_fetch_attempts: Option<i32>,
        report_fetch_delay: Option<i32>,
        context: &C) -> Result<ComDayCqAnalyticsSitecatalystImplImporterReportImporterResponse, ApiError>
    {
        info!("com_day_cq_analytics_sitecatalyst_impl_importer_report_importer({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, report_fetch_attempts, report_fetch_delay, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_analytics_sitecatalyst_impl_sitecatalyst_adapter_factory(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        cq_analytics_adapterfactory_contextstores: Option<&Vec<String>>,
        context: &C) -> Result<ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryResponse, ApiError>
    {
        info!("com_day_cq_analytics_sitecatalyst_impl_sitecatalyst_adapter_factory({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, cq_analytics_adapterfactory_contextstores, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_analytics_sitecatalyst_impl_sitecatalyst_http_client_impl(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        cq_analytics_sitecatalyst_service_datacenter_url: Option<&Vec<String>>,
        devhostnamepatterns: Option<&Vec<String>>,
        connection_timeout: Option<i32>,
        socket_timeout: Option<i32>,
        context: &C) -> Result<ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplResponse, ApiError>
    {
        info!("com_day_cq_analytics_sitecatalyst_impl_sitecatalyst_http_client_impl({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, cq_analytics_sitecatalyst_service_datacenter_url, devhostnamepatterns, connection_timeout, socket_timeout, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_analytics_testandtarget_impl_account_options_updater(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        cq_analytics_testandtarget_accountoptionsupdater_enabled: Option<bool>,
        context: &C) -> Result<ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterResponse, ApiError>
    {
        info!("com_day_cq_analytics_testandtarget_impl_account_options_updater({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, cq_analytics_testandtarget_accountoptionsupdater_enabled, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_analytics_testandtarget_impl_delete_author_activity_listener(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        cq_analytics_testandtarget_deleteauthoractivitylistener_enabled: Option<bool>,
        context: &C) -> Result<ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerResponse, ApiError>
    {
        info!("com_day_cq_analytics_testandtarget_impl_delete_author_activity_listener({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, cq_analytics_testandtarget_deleteauthoractivitylistener_enabled, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_analytics_testandtarget_impl_push_author_campaign_page_listener(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        cq_analytics_testandtarget_pushauthorcampaignpagelistener_enabled: Option<bool>,
        context: &C) -> Result<ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerResponse, ApiError>
    {
        info!("com_day_cq_analytics_testandtarget_impl_push_author_campaign_page_listener({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, cq_analytics_testandtarget_pushauthorcampaignpagelistener_enabled, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_analytics_testandtarget_impl_segment_importer(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        cq_analytics_testandtarget_segmentimporter_enabled: Option<bool>,
        context: &C) -> Result<ComDayCqAnalyticsTestandtargetImplSegmentImporterResponse, ApiError>
    {
        info!("com_day_cq_analytics_testandtarget_impl_segment_importer({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, cq_analytics_testandtarget_segmentimporter_enabled, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_analytics_testandtarget_impl_service_web_service_impl(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        endpoint_uri: Option<String>,
        connection_timeout: Option<i32>,
        socket_timeout: Option<i32>,
        context: &C) -> Result<ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplResponse, ApiError>
    {
        info!("com_day_cq_analytics_testandtarget_impl_service_web_service_impl({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, endpoint_uri, connection_timeout, socket_timeout, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_analytics_testandtarget_impl_servlets_admin_server_servlet(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        testandtarget_endpoint_url: Option<String>,
        context: &C) -> Result<ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletResponse, ApiError>
    {
        info!("com_day_cq_analytics_testandtarget_impl_servlets_admin_server_servlet({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, testandtarget_endpoint_url, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_analytics_testandtarget_impl_testandtarget_http_client_impl(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        cq_analytics_testandtarget_api_url: Option<String>,
        cq_analytics_testandtarget_timeout: Option<i32>,
        cq_analytics_testandtarget_sockettimeout: Option<i32>,
        cq_analytics_testandtarget_recommendations_url_replace: Option<String>,
        cq_analytics_testandtarget_recommendations_url_replacewith: Option<String>,
        context: &C) -> Result<ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplResponse, ApiError>
    {
        info!("com_day_cq_analytics_testandtarget_impl_testandtarget_http_client_impl({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, cq_analytics_testandtarget_api_url, cq_analytics_testandtarget_timeout, cq_analytics_testandtarget_sockettimeout, cq_analytics_testandtarget_recommendations_url_replace, cq_analytics_testandtarget_recommendations_url_replacewith, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_auth_impl_cug_cug_support_impl(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        cug_exempted_principals: Option<&Vec<String>>,
        cug_enabled: Option<bool>,
        cug_principals_regex: Option<String>,
        cug_principals_replacement: Option<String>,
        context: &C) -> Result<ComDayCqAuthImplCugCugSupportImplResponse, ApiError>
    {
        info!("com_day_cq_auth_impl_cug_cug_support_impl({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, cug_exempted_principals, cug_enabled, cug_principals_regex, cug_principals_replacement, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_auth_impl_login_selector_handler(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        path: Option<String>,
        service_ranking: Option<i32>,
        auth_loginselector_mappings: Option<&Vec<String>>,
        auth_loginselector_changepw_mappings: Option<&Vec<String>>,
        auth_loginselector_defaultloginpage: Option<String>,
        auth_loginselector_defaultchangepwpage: Option<String>,
        auth_loginselector_handle: Option<&Vec<String>>,
        auth_loginselector_handle_all_extensions: Option<bool>,
        context: &C) -> Result<ComDayCqAuthImplLoginSelectorHandlerResponse, ApiError>
    {
        info!("com_day_cq_auth_impl_login_selector_handler({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, path, service_ranking, auth_loginselector_mappings, auth_loginselector_changepw_mappings, auth_loginselector_defaultloginpage, auth_loginselector_defaultchangepwpage, auth_loginselector_handle, auth_loginselector_handle_all_extensions, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_commons_impl_externalizer_impl(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        externalizer_domains: Option<&Vec<String>>,
        externalizer_host: Option<String>,
        externalizer_contextpath: Option<String>,
        externalizer_encodedpath: Option<bool>,
        context: &C) -> Result<ComDayCqCommonsImplExternalizerImplResponse, ApiError>
    {
        info!("com_day_cq_commons_impl_externalizer_impl({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, externalizer_domains, externalizer_host, externalizer_contextpath, externalizer_encodedpath, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_commons_servlets_root_mapping_servlet(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        rootmapping_target: Option<String>,
        context: &C) -> Result<ComDayCqCommonsServletsRootMappingServletResponse, ApiError>
    {
        info!("com_day_cq_commons_servlets_root_mapping_servlet({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, rootmapping_target, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_compat_codeupgrade_impl_code_upgrade_execution_condition_checke(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        codeupgradetasks: Option<&Vec<String>>,
        codeupgradetaskfilters: Option<&Vec<String>>,
        context: &C) -> Result<ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeResponse, ApiError>
    {
        info!("com_day_cq_compat_codeupgrade_impl_code_upgrade_execution_condition_checke({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, codeupgradetasks, codeupgradetaskfilters, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_compat_codeupgrade_impl_upgrade_task_ignore_list(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        upgrade_task_ignore_list: Option<&Vec<String>>,
        context: &C) -> Result<ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListResponse, ApiError>
    {
        info!("com_day_cq_compat_codeupgrade_impl_upgrade_task_ignore_list({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, upgrade_task_ignore_list, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_compat_codeupgrade_impl_version_range_task_ignorelist(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        effective_bundle_list_path: Option<String>,
        context: &C) -> Result<ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistResponse, ApiError>
    {
        info!("com_day_cq_compat_codeupgrade_impl_version_range_task_ignorelist({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, effective_bundle_list_path, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_contentsync_impl_content_sync_manager_impl(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        contentsync_fallback_authorizable: Option<String>,
        contentsync_fallback_updateuser: Option<String>,
        context: &C) -> Result<ComDayCqContentsyncImplContentSyncManagerImplResponse, ApiError>
    {
        info!("com_day_cq_contentsync_impl_content_sync_manager_impl({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, contentsync_fallback_authorizable, contentsync_fallback_updateuser, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_dam_commons_handler_standard_image_handler(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        large_file_threshold: Option<i32>,
        large_comment_threshold: Option<i32>,
        cq_dam_enable_ext_meta_extraction: Option<bool>,
        context: &C) -> Result<ComDayCqDamCommonsHandlerStandardImageHandlerResponse, ApiError>
    {
        info!("com_day_cq_dam_commons_handler_standard_image_handler({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, large_file_threshold, large_comment_threshold, cq_dam_enable_ext_meta_extraction, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_dam_commons_metadata_xmp_filter_black_white(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        xmp_filter_apply_whitelist: Option<bool>,
        xmp_filter_whitelist: Option<&Vec<String>>,
        xmp_filter_apply_blacklist: Option<bool>,
        xmp_filter_blacklist: Option<&Vec<String>>,
        context: &C) -> Result<ComDayCqDamCommonsMetadataXmpFilterBlackWhiteResponse, ApiError>
    {
        info!("com_day_cq_dam_commons_metadata_xmp_filter_black_white({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, xmp_filter_apply_whitelist, xmp_filter_whitelist, xmp_filter_apply_blacklist, xmp_filter_blacklist, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_dam_commons_util_impl_asset_cache_impl(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        large_file_min: Option<i32>,
        cache_apply: Option<bool>,
        mime_types: Option<&Vec<String>>,
        context: &C) -> Result<ComDayCqDamCommonsUtilImplAssetCacheImplResponse, ApiError>
    {
        info!("com_day_cq_dam_commons_util_impl_asset_cache_impl({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, large_file_min, cache_apply, mime_types, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        cq_dam_config_annotation_pdf_document_width: Option<i32>,
        cq_dam_config_annotation_pdf_document_height: Option<i32>,
        cq_dam_config_annotation_pdf_document_padding_horizontal: Option<i32>,
        cq_dam_config_annotation_pdf_document_padding_vertical: Option<i32>,
        cq_dam_config_annotation_pdf_font_size: Option<i32>,
        cq_dam_config_annotation_pdf_font_color: Option<String>,
        cq_dam_config_annotation_pdf_font_family: Option<String>,
        cq_dam_config_annotation_pdf_font_light: Option<String>,
        cq_dam_config_annotation_pdf_margin_text_image: Option<i32>,
        cq_dam_config_annotation_pdf_min_image_height: Option<i32>,
        cq_dam_config_annotation_pdf_review_status_width: Option<i32>,
        cq_dam_config_annotation_pdf_review_status_color_approved: Option<String>,
        cq_dam_config_annotation_pdf_review_status_color_rejected: Option<String>,
        cq_dam_config_annotation_pdf_review_status_color_changes_requested: Option<String>,
        cq_dam_config_annotation_pdf_annotation_marker_width: Option<i32>,
        cq_dam_config_annotation_pdf_asset_minheight: Option<i32>,
        context: &C) -> Result<ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigResponse, ApiError>
    {
        info!("com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, cq_dam_config_annotation_pdf_document_width, cq_dam_config_annotation_pdf_document_height, cq_dam_config_annotation_pdf_document_padding_horizontal, cq_dam_config_annotation_pdf_document_padding_vertical, cq_dam_config_annotation_pdf_font_size, cq_dam_config_annotation_pdf_font_color, cq_dam_config_annotation_pdf_font_family, cq_dam_config_annotation_pdf_font_light, cq_dam_config_annotation_pdf_margin_text_image, cq_dam_config_annotation_pdf_min_image_height, cq_dam_config_annotation_pdf_review_status_width, cq_dam_config_annotation_pdf_review_status_color_approved, cq_dam_config_annotation_pdf_review_status_color_rejected, cq_dam_config_annotation_pdf_review_status_color_changes_requested, cq_dam_config_annotation_pdf_annotation_marker_width, cq_dam_config_annotation_pdf_asset_minheight, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_dam_core_impl_asset_move_listener(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        enabled: Option<bool>,
        context: &C) -> Result<ComDayCqDamCoreImplAssetMoveListenerResponse, ApiError>
    {
        info!("com_day_cq_dam_core_impl_asset_move_listener({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, enabled, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_dam_core_impl_assethome_asset_home_page_configuration(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        is_enabled: Option<bool>,
        context: &C) -> Result<ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationResponse, ApiError>
    {
        info!("com_day_cq_dam_core_impl_assethome_asset_home_page_configuration({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, is_enabled, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_dam_core_impl_assetlinkshare_adhoc_asset_share_proxy_servlet(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        cq_dam_adhoc_asset_share_prezip_maxcontentsize: Option<i32>,
        context: &C) -> Result<ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletResponse, ApiError>
    {
        info!("com_day_cq_dam_core_impl_assetlinkshare_adhoc_asset_share_proxy_servlet({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, cq_dam_adhoc_asset_share_prezip_maxcontentsize, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_dam_core_impl_cache_cq_buffered_image_cache(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        cq_dam_image_cache_max_memory: Option<i32>,
        cq_dam_image_cache_max_age: Option<i32>,
        cq_dam_image_cache_max_dimension: Option<String>,
        context: &C) -> Result<ComDayCqDamCoreImplCacheCqBufferedImageCacheResponse, ApiError>
    {
        info!("com_day_cq_dam_core_impl_cache_cq_buffered_image_cache({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, cq_dam_image_cache_max_memory, cq_dam_image_cache_max_age, cq_dam_image_cache_max_dimension, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_dam_core_impl_dam_change_event_listener(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        changeeventlistener_observed_paths: Option<&Vec<String>>,
        context: &C) -> Result<ComDayCqDamCoreImplDamChangeEventListenerResponse, ApiError>
    {
        info!("com_day_cq_dam_core_impl_dam_change_event_listener({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, changeeventlistener_observed_paths, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_dam_core_impl_dam_event_purge_service(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        scheduler_expression: Option<String>,
        max_saved_activities: Option<i32>,
        save_interval: Option<i32>,
        enable_activity_purge: Option<bool>,
        event_types: Option<String>,
        context: &C) -> Result<ComDayCqDamCoreImplDamEventPurgeServiceResponse, ApiError>
    {
        info!("com_day_cq_dam_core_impl_dam_event_purge_service({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, scheduler_expression, max_saved_activities, save_interval, enable_activity_purge, event_types, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_dam_core_impl_dam_event_recorder_impl(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        event_filter: Option<String>,
        event_queue_length: Option<i32>,
        eventrecorder_enabled: Option<bool>,
        eventrecorder_blacklist: Option<&Vec<String>>,
        eventrecorder_eventtypes: Option<String>,
        context: &C) -> Result<ComDayCqDamCoreImplDamEventRecorderImplResponse, ApiError>
    {
        info!("com_day_cq_dam_core_impl_dam_event_recorder_impl({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, event_filter, event_queue_length, eventrecorder_enabled, eventrecorder_blacklist, eventrecorder_eventtypes, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_dam_core_impl_event_dam_event_audit_listener(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        event_filter: Option<String>,
        enabled: Option<bool>,
        context: &C) -> Result<ComDayCqDamCoreImplEventDamEventAuditListenerResponse, ApiError>
    {
        info!("com_day_cq_dam_core_impl_event_dam_event_audit_listener({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, event_filter, enabled, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_dam_core_impl_expiry_notification_job_impl(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        cq_dam_expiry_notification_scheduler_istimebased: Option<bool>,
        cq_dam_expiry_notification_scheduler_timebased_rule: Option<String>,
        cq_dam_expiry_notification_scheduler_period_rule: Option<i32>,
        send_email: Option<bool>,
        asset_expired_limit: Option<i32>,
        prior_notification_seconds: Option<i32>,
        cq_dam_expiry_notification_url_protocol: Option<String>,
        context: &C) -> Result<ComDayCqDamCoreImplExpiryNotificationJobImplResponse, ApiError>
    {
        info!("com_day_cq_dam_core_impl_expiry_notification_job_impl({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, cq_dam_expiry_notification_scheduler_istimebased, cq_dam_expiry_notification_scheduler_timebased_rule, cq_dam_expiry_notification_scheduler_period_rule, send_email, asset_expired_limit, prior_notification_seconds, cq_dam_expiry_notification_url_protocol, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_dam_core_impl_foldermetadataschema_folder_metadata_schema_feat(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        is_enabled: Option<bool>,
        context: &C) -> Result<ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatResponse, ApiError>
    {
        info!("com_day_cq_dam_core_impl_foldermetadataschema_folder_metadata_schema_feat({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, is_enabled, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_dam_core_impl_gfx_commons_gfx_renderer(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        skip_bufferedcache: Option<bool>,
        context: &C) -> Result<ComDayCqDamCoreImplGfxCommonsGfxRendererResponse, ApiError>
    {
        info!("com_day_cq_dam_core_impl_gfx_commons_gfx_renderer({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, skip_bufferedcache, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_dam_core_impl_handler_eps_format_handler(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        mimetype: Option<String>,
        context: &C) -> Result<ComDayCqDamCoreImplHandlerEpsFormatHandlerResponse, ApiError>
    {
        info!("com_day_cq_dam_core_impl_handler_eps_format_handler({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, mimetype, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_dam_core_impl_handler_indesign_format_handler(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        mimetype: Option<&Vec<String>>,
        context: &C) -> Result<ComDayCqDamCoreImplHandlerIndesignFormatHandlerResponse, ApiError>
    {
        info!("com_day_cq_dam_core_impl_handler_indesign_format_handler({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, mimetype, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_dam_core_impl_handler_jpeg_handler(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        cq_dam_enable_ext_meta_extraction: Option<bool>,
        large_file_threshold: Option<i32>,
        large_comment_threshold: Option<i32>,
        context: &C) -> Result<ComDayCqDamCoreImplHandlerJpegHandlerResponse, ApiError>
    {
        info!("com_day_cq_dam_core_impl_handler_jpeg_handler({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, cq_dam_enable_ext_meta_extraction, large_file_threshold, large_comment_threshold, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_dam_core_impl_handler_xmp_n_comm_xmp_handler(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        xmphandler_cq_formats: Option<&Vec<String>>,
        context: &C) -> Result<ComDayCqDamCoreImplHandlerXmpNCommXmpHandlerResponse, ApiError>
    {
        info!("com_day_cq_dam_core_impl_handler_xmp_n_comm_xmp_handler({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, xmphandler_cq_formats, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_dam_core_impl_jmx_asset_index_update_monitor(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        jmx_objectname: Option<String>,
        property_measure_enabled: Option<bool>,
        property_name: Option<String>,
        property_max_wait_ms: Option<i32>,
        property_max_rate: Option<f64>,
        fulltext_measure_enabled: Option<bool>,
        fulltext_name: Option<String>,
        fulltext_max_wait_ms: Option<i32>,
        fulltext_max_rate: Option<f64>,
        context: &C) -> Result<ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorResponse, ApiError>
    {
        info!("com_day_cq_dam_core_impl_jmx_asset_index_update_monitor({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, jmx_objectname, property_measure_enabled, property_name, property_max_wait_ms, property_max_rate, fulltext_measure_enabled, fulltext_name, fulltext_max_wait_ms, fulltext_max_rate, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_dam_core_impl_jmx_asset_migration_m_bean_impl(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        jmx_objectname: Option<String>,
        context: &C) -> Result<ComDayCqDamCoreImplJmxAssetMigrationMBeanImplResponse, ApiError>
    {
        info!("com_day_cq_dam_core_impl_jmx_asset_migration_m_bean_impl({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, jmx_objectname, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_dam_core_impl_jmx_asset_update_monitor_impl(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        jmx_objectname: Option<String>,
        active: Option<bool>,
        context: &C) -> Result<ComDayCqDamCoreImplJmxAssetUpdateMonitorImplResponse, ApiError>
    {
        info!("com_day_cq_dam_core_impl_jmx_asset_update_monitor_impl({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, jmx_objectname, active, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_dam_core_impl_jobs_metadataexport_async_metadata_export_config(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        operation: Option<String>,
        email_enabled: Option<bool>,
        context: &C) -> Result<ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigResponse, ApiError>
    {
        info!("com_day_cq_dam_core_impl_jobs_metadataexport_async_metadata_export_config({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, operation, email_enabled, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_dam_core_impl_jobs_metadataimport_async_metadata_import_config(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        operation: Option<String>,
        operation_icon: Option<String>,
        topic_name: Option<String>,
        email_enabled: Option<bool>,
        context: &C) -> Result<ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigResponse, ApiError>
    {
        info!("com_day_cq_dam_core_impl_jobs_metadataimport_async_metadata_import_config({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, operation, operation_icon, topic_name, email_enabled, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_dam_core_impl_lightbox_lightbox_servlet(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        sling_servlet_paths: Option<String>,
        sling_servlet_methods: Option<&Vec<String>>,
        cq_dam_enable_anonymous: Option<bool>,
        context: &C) -> Result<ComDayCqDamCoreImplLightboxLightboxServletResponse, ApiError>
    {
        info!("com_day_cq_dam_core_impl_lightbox_lightbox_servlet({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, sling_servlet_paths, sling_servlet_methods, cq_dam_enable_anonymous, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_dam_core_impl_metadata_editor_select_component_handler(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        granite_colon_data: Option<&Vec<String>>,
        context: &C) -> Result<ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerResponse, ApiError>
    {
        info!("com_day_cq_dam_core_impl_metadata_editor_select_component_handler({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, granite_colon_data, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_dam_core_impl_mime_type_asset_upload_restriction_helper(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        cq_dam_allow_all_mime: Option<bool>,
        cq_dam_allowed_asset_mimes: Option<&Vec<String>>,
        context: &C) -> Result<ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperResponse, ApiError>
    {
        info!("com_day_cq_dam_core_impl_mime_type_asset_upload_restriction_helper({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, cq_dam_allow_all_mime, cq_dam_allowed_asset_mimes, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_dam_core_impl_mime_type_dam_mime_type_service_impl(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        cq_dam_detect_asset_mime_from_content: Option<bool>,
        context: &C) -> Result<ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplResponse, ApiError>
    {
        info!("com_day_cq_dam_core_impl_mime_type_dam_mime_type_service_impl({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, cq_dam_detect_asset_mime_from_content, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_dam_core_impl_missing_metadata_notification_job(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        cq_dam_missingmetadata_notification_scheduler_istimebased: Option<bool>,
        cq_dam_missingmetadata_notification_scheduler_timebased_rule: Option<String>,
        cq_dam_missingmetadata_notification_scheduler_period_rule: Option<i32>,
        cq_dam_missingmetadata_notification_recipient: Option<String>,
        context: &C) -> Result<ComDayCqDamCoreImplMissingMetadataNotificationJobResponse, ApiError>
    {
        info!("com_day_cq_dam_core_impl_missing_metadata_notification_job({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, cq_dam_missingmetadata_notification_scheduler_istimebased, cq_dam_missingmetadata_notification_scheduler_timebased_rule, cq_dam_missingmetadata_notification_scheduler_period_rule, cq_dam_missingmetadata_notification_recipient, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_dam_core_impl_process_send_transient_workflow_completed_email_pr(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        process_label: Option<String>,
        notify_on_complete: Option<bool>,
        context: &C) -> Result<ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrResponse, ApiError>
    {
        info!("com_day_cq_dam_core_impl_process_send_transient_workflow_completed_email_pr({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, process_label, notify_on_complete, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_dam_core_impl_process_text_extraction_process(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        mime_types: Option<&Vec<String>>,
        max_extract: Option<i32>,
        context: &C) -> Result<ComDayCqDamCoreImplProcessTextExtractionProcessResponse, ApiError>
    {
        info!("com_day_cq_dam_core_impl_process_text_extraction_process({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, mime_types, max_extract, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_dam_core_impl_rendition_maker_impl(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        xmp_propagate: Option<bool>,
        xmp_excludes: Option<&Vec<String>>,
        context: &C) -> Result<ComDayCqDamCoreImplRenditionMakerImplResponse, ApiError>
    {
        info!("com_day_cq_dam_core_impl_rendition_maker_impl({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, xmp_propagate, xmp_excludes, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_dam_core_impl_reports_report_export_service(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        query_batch_size: Option<i32>,
        context: &C) -> Result<ComDayCqDamCoreImplReportsReportExportServiceResponse, ApiError>
    {
        info!("com_day_cq_dam_core_impl_reports_report_export_service({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, query_batch_size, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_dam_core_impl_reports_report_purge_service(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        scheduler_expression: Option<String>,
        max_saved_reports: Option<i32>,
        time_duration: Option<i32>,
        enable_report_purge: Option<bool>,
        context: &C) -> Result<ComDayCqDamCoreImplReportsReportPurgeServiceResponse, ApiError>
    {
        info!("com_day_cq_dam_core_impl_reports_report_purge_service({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, scheduler_expression, max_saved_reports, time_duration, enable_report_purge, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_dam_core_impl_servlet_asset_download_servlet(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        enabled: Option<bool>,
        context: &C) -> Result<ComDayCqDamCoreImplServletAssetDownloadServletResponse, ApiError>
    {
        info!("com_day_cq_dam_core_impl_servlet_asset_download_servlet({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, enabled, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_dam_core_impl_servlet_asset_status_servlet(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        cq_dam_batch_status_maxassets: Option<i32>,
        context: &C) -> Result<ComDayCqDamCoreImplServletAssetStatusServletResponse, ApiError>
    {
        info!("com_day_cq_dam_core_impl_servlet_asset_status_servlet({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, cq_dam_batch_status_maxassets, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_dam_core_impl_servlet_asset_xmp_search_servlet(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        cq_dam_batch_indesign_maxassets: Option<i32>,
        context: &C) -> Result<ComDayCqDamCoreImplServletAssetXmpSearchServletResponse, ApiError>
    {
        info!("com_day_cq_dam_core_impl_servlet_asset_xmp_search_servlet({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, cq_dam_batch_indesign_maxassets, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_dam_core_impl_servlet_batch_metadata_servlet(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        cq_dam_batch_metadata_asset_default: Option<&Vec<String>>,
        cq_dam_batch_metadata_collection_default: Option<&Vec<String>>,
        cq_dam_batch_metadata_maxresources: Option<i32>,
        context: &C) -> Result<ComDayCqDamCoreImplServletBatchMetadataServletResponse, ApiError>
    {
        info!("com_day_cq_dam_core_impl_servlet_batch_metadata_servlet({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, cq_dam_batch_metadata_asset_default, cq_dam_batch_metadata_collection_default, cq_dam_batch_metadata_maxresources, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_dam_core_impl_servlet_binary_provider_servlet(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        sling_servlet_resource_types: Option<&Vec<String>>,
        sling_servlet_methods: Option<&Vec<String>>,
        cq_dam_drm_enable: Option<bool>,
        context: &C) -> Result<ComDayCqDamCoreImplServletBinaryProviderServletResponse, ApiError>
    {
        info!("com_day_cq_dam_core_impl_servlet_binary_provider_servlet({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, sling_servlet_resource_types, sling_servlet_methods, cq_dam_drm_enable, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_dam_core_impl_servlet_collection_servlet(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        cq_dam_batch_collection_properties: Option<&Vec<String>>,
        cq_dam_batch_collection_maxcollections: Option<i32>,
        context: &C) -> Result<ComDayCqDamCoreImplServletCollectionServletResponse, ApiError>
    {
        info!("com_day_cq_dam_core_impl_servlet_collection_servlet({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, cq_dam_batch_collection_properties, cq_dam_batch_collection_maxcollections, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_dam_core_impl_servlet_collections_servlet(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        cq_dam_batch_collections_properties: Option<&Vec<String>>,
        cq_dam_batch_collections_limit: Option<i32>,
        context: &C) -> Result<ComDayCqDamCoreImplServletCollectionsServletResponse, ApiError>
    {
        info!("com_day_cq_dam_core_impl_servlet_collections_servlet({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, cq_dam_batch_collections_properties, cq_dam_batch_collections_limit, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_dam_core_impl_servlet_companion_servlet(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        more_info: Option<String>,
        slash_mnt_slash_overlay_slash_dam_slash_gui_slash_content_slash_assets_slash_moreinfo_html_slash_dollar_left_curly_bracket_path_right_curly_bracket: Option<String>,
        context: &C) -> Result<ComDayCqDamCoreImplServletCompanionServletResponse, ApiError>
    {
        info!("com_day_cq_dam_core_impl_servlet_companion_servlet({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, more_info, slash_mnt_slash_overlay_slash_dam_slash_gui_slash_content_slash_assets_slash_moreinfo_html_slash_dollar_left_curly_bracket_path_right_curly_bracket, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_dam_core_impl_servlet_create_asset_servlet(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        detect_duplicate: Option<bool>,
        context: &C) -> Result<ComDayCqDamCoreImplServletCreateAssetServletResponse, ApiError>
    {
        info!("com_day_cq_dam_core_impl_servlet_create_asset_servlet({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, detect_duplicate, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_dam_core_impl_servlet_dam_content_disposition_filter(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        cq_mime_type_blacklist: Option<&Vec<String>>,
        cq_dam_empty_mime: Option<bool>,
        context: &C) -> Result<ComDayCqDamCoreImplServletDamContentDispositionFilterResponse, ApiError>
    {
        info!("com_day_cq_dam_core_impl_servlet_dam_content_disposition_filter({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, cq_mime_type_blacklist, cq_dam_empty_mime, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_dam_core_impl_servlet_guid_lookup_filter(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        cq_dam_core_guidlookupfilter_enabled: Option<bool>,
        context: &C) -> Result<ComDayCqDamCoreImplServletGuidLookupFilterResponse, ApiError>
    {
        info!("com_day_cq_dam_core_impl_servlet_guid_lookup_filter({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, cq_dam_core_guidlookupfilter_enabled, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_dam_core_impl_servlet_health_check_servlet(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        cq_dam_sync_workflow_id: Option<String>,
        cq_dam_sync_folder_types: Option<&Vec<String>>,
        context: &C) -> Result<ComDayCqDamCoreImplServletHealthCheckServletResponse, ApiError>
    {
        info!("com_day_cq_dam_core_impl_servlet_health_check_servlet({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, cq_dam_sync_workflow_id, cq_dam_sync_folder_types, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_dam_core_impl_servlet_metadata_get_servlet(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        sling_servlet_resource_types: Option<String>,
        sling_servlet_methods: Option<String>,
        sling_servlet_extensions: Option<String>,
        sling_servlet_selectors: Option<String>,
        context: &C) -> Result<ComDayCqDamCoreImplServletMetadataGetServletResponse, ApiError>
    {
        info!("com_day_cq_dam_core_impl_servlet_metadata_get_servlet({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, sling_servlet_resource_types, sling_servlet_methods, sling_servlet_extensions, sling_servlet_selectors, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_dam_core_impl_servlet_multiple_license_accept_servlet(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        cq_dam_drm_enable: Option<bool>,
        context: &C) -> Result<ComDayCqDamCoreImplServletMultipleLicenseAcceptServletResponse, ApiError>
    {
        info!("com_day_cq_dam_core_impl_servlet_multiple_license_accept_servlet({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, cq_dam_drm_enable, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_dam_core_impl_servlet_resource_collection_servlet(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        sling_servlet_resource_types: Option<&Vec<String>>,
        sling_servlet_methods: Option<String>,
        sling_servlet_selectors: Option<String>,
        download_config: Option<String>,
        view_selector: Option<String>,
        send_email: Option<bool>,
        context: &C) -> Result<ComDayCqDamCoreImplServletResourceCollectionServletResponse, ApiError>
    {
        info!("com_day_cq_dam_core_impl_servlet_resource_collection_servlet({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, sling_servlet_resource_types, sling_servlet_methods, sling_servlet_selectors, download_config, view_selector, send_email, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_dam_core_impl_ui_preview_folder_preview_updater_impl(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        create_preview_enabled: Option<bool>,
        update_preview_enabled: Option<bool>,
        queue_size: Option<i32>,
        folder_preview_rendition_regex: Option<String>,
        context: &C) -> Result<ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplResponse, ApiError>
    {
        info!("com_day_cq_dam_core_impl_ui_preview_folder_preview_updater_impl({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, create_preview_enabled, update_preview_enabled, queue_size, folder_preview_rendition_regex, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_dam_core_impl_unzip_unzip_config(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        cq_dam_config_unzip_maxuncompressedsize: Option<i32>,
        cq_dam_config_unzip_encoding: Option<String>,
        context: &C) -> Result<ComDayCqDamCoreImplUnzipUnzipConfigResponse, ApiError>
    {
        info!("com_day_cq_dam_core_impl_unzip_unzip_config({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, cq_dam_config_unzip_maxuncompressedsize, cq_dam_config_unzip_encoding, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_dam_core_process_exif_tool_extract_metadata_process(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        process_label: Option<String>,
        cq_dam_enable_sha1: Option<bool>,
        context: &C) -> Result<ComDayCqDamCoreProcessExifToolExtractMetadataProcessResponse, ApiError>
    {
        info!("com_day_cq_dam_core_process_exif_tool_extract_metadata_process({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, process_label, cq_dam_enable_sha1, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_dam_core_process_extract_metadata_process(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        process_label: Option<String>,
        cq_dam_enable_sha1: Option<bool>,
        context: &C) -> Result<ComDayCqDamCoreProcessExtractMetadataProcessResponse, ApiError>
    {
        info!("com_day_cq_dam_core_process_extract_metadata_process({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, process_label, cq_dam_enable_sha1, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_dam_core_process_metadata_processor_process(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        process_label: Option<String>,
        cq_dam_enable_sha1: Option<bool>,
        cq_dam_metadata_xssprotected_properties: Option<&Vec<String>>,
        context: &C) -> Result<ComDayCqDamCoreProcessMetadataProcessorProcessResponse, ApiError>
    {
        info!("com_day_cq_dam_core_process_metadata_processor_process({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, process_label, cq_dam_enable_sha1, cq_dam_metadata_xssprotected_properties, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_dam_handler_ffmpeg_locator_impl(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        executable_searchpath: Option<&Vec<String>>,
        context: &C) -> Result<ComDayCqDamHandlerFfmpegLocatorImplResponse, ApiError>
    {
        info!("com_day_cq_dam_handler_ffmpeg_locator_impl({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, executable_searchpath, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_dam_handler_gibson_fontmanager_impl_font_manager_service_impl(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        event_filter: Option<String>,
        fontmgr_system_font_dir: Option<&Vec<String>>,
        fontmgr_adobe_font_dir: Option<String>,
        fontmgr_customer_font_dir: Option<String>,
        context: &C) -> Result<ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplResponse, ApiError>
    {
        info!("com_day_cq_dam_handler_gibson_fontmanager_impl_font_manager_service_impl({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, event_filter, fontmgr_system_font_dir, fontmgr_adobe_font_dir, fontmgr_customer_font_dir, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_dam_handler_standard_pdf_pdf_handler(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        raster_annotation: Option<bool>,
        context: &C) -> Result<ComDayCqDamHandlerStandardPdfPdfHandlerResponse, ApiError>
    {
        info!("com_day_cq_dam_handler_standard_pdf_pdf_handler({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, raster_annotation, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_dam_handler_standard_ps_post_script_handler(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        raster_annotation: Option<bool>,
        context: &C) -> Result<ComDayCqDamHandlerStandardPsPostScriptHandlerResponse, ApiError>
    {
        info!("com_day_cq_dam_handler_standard_ps_post_script_handler({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, raster_annotation, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_dam_handler_standard_psd_psd_handler(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        large_file_threshold: Option<i32>,
        context: &C) -> Result<ComDayCqDamHandlerStandardPsdPsdHandlerResponse, ApiError>
    {
        info!("com_day_cq_dam_handler_standard_psd_psd_handler({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, large_file_threshold, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_dam_ids_impl_ids_job_processor(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        enable_multisession: Option<bool>,
        ids_cc_enable: Option<bool>,
        enable_retry: Option<bool>,
        enable_retry_scripterror: Option<bool>,
        externalizer_domain_cqhost: Option<String>,
        externalizer_domain_http: Option<String>,
        context: &C) -> Result<ComDayCqDamIdsImplIdsJobProcessorResponse, ApiError>
    {
        info!("com_day_cq_dam_ids_impl_ids_job_processor({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, enable_multisession, ids_cc_enable, enable_retry, enable_retry_scripterror, externalizer_domain_cqhost, externalizer_domain_http, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_dam_ids_impl_ids_pool_manager_impl(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        max_errors_to_blacklist: Option<i32>,
        retry_interval_to_whitelist: Option<i32>,
        connect_timeout: Option<i32>,
        socket_timeout: Option<i32>,
        process_label: Option<String>,
        connection_use_max: Option<i32>,
        context: &C) -> Result<ComDayCqDamIdsImplIdsPoolManagerImplResponse, ApiError>
    {
        info!("com_day_cq_dam_ids_impl_ids_pool_manager_impl({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, max_errors_to_blacklist, retry_interval_to_whitelist, connect_timeout, socket_timeout, process_label, connection_use_max, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_dam_indd_impl_handler_indesign_xmp_handler(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        process_label: Option<String>,
        extract_pages: Option<bool>,
        context: &C) -> Result<ComDayCqDamInddImplHandlerIndesignXmpHandlerResponse, ApiError>
    {
        info!("com_day_cq_dam_indd_impl_handler_indesign_xmp_handler({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, process_label, extract_pages, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_dam_indd_impl_servlet_snippet_creation_servlet(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        snippetcreation_maxcollections: Option<i32>,
        context: &C) -> Result<ComDayCqDamInddImplServletSnippetCreationServletResponse, ApiError>
    {
        info!("com_day_cq_dam_indd_impl_servlet_snippet_creation_servlet({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, snippetcreation_maxcollections, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_dam_indd_process_indd_media_extract_process(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        process_label: Option<String>,
        cq_dam_indd_pages_regex: Option<String>,
        ids_job_decoupled: Option<bool>,
        ids_job_workflow_model: Option<String>,
        context: &C) -> Result<ComDayCqDamInddProcessInddMediaExtractProcessResponse, ApiError>
    {
        info!("com_day_cq_dam_indd_process_indd_media_extract_process({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, process_label, cq_dam_indd_pages_regex, ids_job_decoupled, ids_job_workflow_model, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_dam_performance_internal_asset_performance_data_handler_impl(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        batch_commit_size: Option<i32>,
        context: &C) -> Result<ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplResponse, ApiError>
    {
        info!("com_day_cq_dam_performance_internal_asset_performance_data_handler_impl({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, batch_commit_size, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_dam_performance_internal_asset_performance_report_sync_job(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        scheduler_expression: Option<String>,
        context: &C) -> Result<ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobResponse, ApiError>
    {
        info!("com_day_cq_dam_performance_internal_asset_performance_report_sync_job({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, scheduler_expression, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_dam_pim_impl_sourcing_upload_process_product_assets_upload_pro(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        delete_zip_file: Option<bool>,
        context: &C) -> Result<ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProResponse, ApiError>
    {
        info!("com_day_cq_dam_pim_impl_sourcing_upload_process_product_assets_upload_pro({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, delete_zip_file, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_dam_s7dam_common_analytics_impl_s7dam_dynamic_media_config_even(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        cq_dam_s7dam_dynamicmediaconfigeventlistener_enabled: Option<bool>,
        context: &C) -> Result<ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenResponse, ApiError>
    {
        info!("com_day_cq_dam_s7dam_common_analytics_impl_s7dam_dynamic_media_config_even({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, cq_dam_s7dam_dynamicmediaconfigeventlistener_enabled, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_dam_s7dam_common_analytics_impl_site_catalyst_report_runner(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        scheduler_expression: Option<String>,
        scheduler_concurrent: Option<bool>,
        context: &C) -> Result<ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerResponse, ApiError>
    {
        info!("com_day_cq_dam_s7dam_common_analytics_impl_site_catalyst_report_runner({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, scheduler_expression, scheduler_concurrent, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_dam_s7dam_common_post_servlets_set_create_handler(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        sling_post_operation: Option<String>,
        sling_servlet_methods: Option<String>,
        context: &C) -> Result<ComDayCqDamS7damCommonPostServletsSetCreateHandlerResponse, ApiError>
    {
        info!("com_day_cq_dam_s7dam_common_post_servlets_set_create_handler({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, sling_post_operation, sling_servlet_methods, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_dam_s7dam_common_post_servlets_set_modify_handler(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        sling_post_operation: Option<String>,
        sling_servlet_methods: Option<String>,
        context: &C) -> Result<ComDayCqDamS7damCommonPostServletsSetModifyHandlerResponse, ApiError>
    {
        info!("com_day_cq_dam_s7dam_common_post_servlets_set_modify_handler({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, sling_post_operation, sling_servlet_methods, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_dam_s7dam_common_process_video_thumbnail_download_process(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        process_label: Option<String>,
        context: &C) -> Result<ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessResponse, ApiError>
    {
        info!("com_day_cq_dam_s7dam_common_process_video_thumbnail_download_process({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, process_label, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_dam_s7dam_common_s7dam_dam_change_event_listener(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        cq_dam_s7dam_damchangeeventlistener_enabled: Option<bool>,
        context: &C) -> Result<ComDayCqDamS7damCommonS7damDamChangeEventListenerResponse, ApiError>
    {
        info!("com_day_cq_dam_s7dam_common_s7dam_dam_change_event_listener({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, cq_dam_s7dam_damchangeeventlistener_enabled, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_dam_s7dam_common_servlets_s7dam_product_info_servlet(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        sling_servlet_paths: Option<String>,
        sling_servlet_methods: Option<String>,
        context: &C) -> Result<ComDayCqDamS7damCommonServletsS7damProductInfoServletResponse, ApiError>
    {
        info!("com_day_cq_dam_s7dam_common_servlets_s7dam_product_info_servlet({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, sling_servlet_paths, sling_servlet_methods, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_dam_s7dam_common_video_impl_video_proxy_client_service_impl(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        cq_dam_s7dam_videoproxyclientservice_multipartupload_minsize_name: Option<i32>,
        cq_dam_s7dam_videoproxyclientservice_multipartupload_partsize_name: Option<i32>,
        cq_dam_s7dam_videoproxyclientservice_multipartupload_numthread_name: Option<i32>,
        cq_dam_s7dam_videoproxyclientservice_http_readtimeout_name: Option<i32>,
        cq_dam_s7dam_videoproxyclientservice_http_connectiontimeout_name: Option<i32>,
        cq_dam_s7dam_videoproxyclientservice_http_maxretrycount_name: Option<i32>,
        cq_dam_s7dam_videoproxyclientservice_uploadprogress_interval_name: Option<i32>,
        context: &C) -> Result<ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplResponse, ApiError>
    {
        info!("com_day_cq_dam_s7dam_common_video_impl_video_proxy_client_service_impl({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, cq_dam_s7dam_videoproxyclientservice_multipartupload_minsize_name, cq_dam_s7dam_videoproxyclientservice_multipartupload_partsize_name, cq_dam_s7dam_videoproxyclientservice_multipartupload_numthread_name, cq_dam_s7dam_videoproxyclientservice_http_readtimeout_name, cq_dam_s7dam_videoproxyclientservice_http_connectiontimeout_name, cq_dam_s7dam_videoproxyclientservice_http_maxretrycount_name, cq_dam_s7dam_videoproxyclientservice_uploadprogress_interval_name, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_dam_scene7_impl_scene7_api_client_impl(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        cq_dam_scene7_apiclient_recordsperpage_nofilter_name: Option<i32>,
        cq_dam_scene7_apiclient_recordsperpage_withfilter_name: Option<i32>,
        context: &C) -> Result<ComDayCqDamScene7ImplScene7ApiClientImplResponse, ApiError>
    {
        info!("com_day_cq_dam_scene7_impl_scene7_api_client_impl({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, cq_dam_scene7_apiclient_recordsperpage_nofilter_name, cq_dam_scene7_apiclient_recordsperpage_withfilter_name, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_dam_scene7_impl_scene7_asset_mime_type_service_impl(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        cq_dam_scene7_assetmimetypeservice_mapping: Option<&Vec<String>>,
        context: &C) -> Result<ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplResponse, ApiError>
    {
        info!("com_day_cq_dam_scene7_impl_scene7_asset_mime_type_service_impl({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, cq_dam_scene7_assetmimetypeservice_mapping, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_dam_scene7_impl_scene7_configuration_event_listener(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        cq_dam_scene7_configurationeventlistener_enabled: Option<bool>,
        context: &C) -> Result<ComDayCqDamScene7ImplScene7ConfigurationEventListenerResponse, ApiError>
    {
        info!("com_day_cq_dam_scene7_impl_scene7_configuration_event_listener({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, cq_dam_scene7_configurationeventlistener_enabled, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_dam_scene7_impl_scene7_dam_change_event_listener(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        cq_dam_scene7_damchangeeventlistener_enabled: Option<bool>,
        cq_dam_scene7_damchangeeventlistener_observed_paths: Option<&Vec<String>>,
        context: &C) -> Result<ComDayCqDamScene7ImplScene7DamChangeEventListenerResponse, ApiError>
    {
        info!("com_day_cq_dam_scene7_impl_scene7_dam_change_event_listener({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, cq_dam_scene7_damchangeeventlistener_enabled, cq_dam_scene7_damchangeeventlistener_observed_paths, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_dam_scene7_impl_scene7_flash_templates_service_impl(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        scene7_flash_templates_rti: Option<String>,
        scene7_flash_templates_rsi: Option<String>,
        scene7_flash_templates_rb: Option<String>,
        scene7_flash_templates_rurl: Option<String>,
        scene7_flash_template_url_format_parameter: Option<String>,
        context: &C) -> Result<ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplResponse, ApiError>
    {
        info!("com_day_cq_dam_scene7_impl_scene7_flash_templates_service_impl({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, scene7_flash_templates_rti, scene7_flash_templates_rsi, scene7_flash_templates_rb, scene7_flash_templates_rurl, scene7_flash_template_url_format_parameter, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_dam_scene7_impl_scene7_upload_service_impl(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        cq_dam_scene7_uploadservice_activejobtimeout_label: Option<i32>,
        cq_dam_scene7_uploadservice_connectionmaxperroute_label: Option<i32>,
        context: &C) -> Result<ComDayCqDamScene7ImplScene7UploadServiceImplResponse, ApiError>
    {
        info!("com_day_cq_dam_scene7_impl_scene7_upload_service_impl({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, cq_dam_scene7_uploadservice_activejobtimeout_label, cq_dam_scene7_uploadservice_connectionmaxperroute_label, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_dam_stock_integration_impl_cache_stock_cache_configuration_ser(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        get_cache_expiration_unit: Option<String>,
        get_cache_expiration_value: Option<i32>,
        context: &C) -> Result<ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerResponse, ApiError>
    {
        info!("com_day_cq_dam_stock_integration_impl_cache_stock_cache_configuration_ser({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, get_cache_expiration_unit, get_cache_expiration_value, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_dam_stock_integration_impl_configuration_stock_configuration(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        name: Option<String>,
        locale: Option<String>,
        ims_config: Option<String>,
        context: &C) -> Result<ComDayCqDamStockIntegrationImplConfigurationStockConfigurationResponse, ApiError>
    {
        info!("com_day_cq_dam_stock_integration_impl_configuration_stock_configuration({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, name, locale, ims_config, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_dam_video_impl_servlet_video_test_servlet(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        enabled: Option<bool>,
        context: &C) -> Result<ComDayCqDamVideoImplServletVideoTestServletResponse, ApiError>
    {
        info!("com_day_cq_dam_video_impl_servlet_video_test_servlet({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, enabled, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_extwidget_servlets_image_sprite_servlet(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        max_width: Option<i32>,
        max_height: Option<i32>,
        context: &C) -> Result<ComDayCqExtwidgetServletsImageSpriteServletResponse, ApiError>
    {
        info!("com_day_cq_extwidget_servlets_image_sprite_servlet({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, max_width, max_height, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_image_internal_font_font_helper(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        fontpath: Option<&Vec<String>>,
        oversampling_factor: Option<i32>,
        context: &C) -> Result<ComDayCqImageInternalFontFontHelperResponse, ApiError>
    {
        info!("com_day_cq_image_internal_font_font_helper({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, fontpath, oversampling_factor, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_jcrclustersupport_cluster_start_level_controller(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        cluster_level_enable: Option<bool>,
        cluster_master_level: Option<i32>,
        cluster_slave_level: Option<i32>,
        context: &C) -> Result<ComDayCqJcrclustersupportClusterStartLevelControllerResponse, ApiError>
    {
        info!("com_day_cq_jcrclustersupport_cluster_start_level_controller({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, cluster_level_enable, cluster_master_level, cluster_slave_level, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_mailer_default_mail_service(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        smtp_host: Option<String>,
        smtp_port: Option<i32>,
        smtp_user: Option<String>,
        smtp_password: Option<String>,
        from_address: Option<String>,
        smtp_ssl: Option<bool>,
        smtp_starttls: Option<bool>,
        debug_email: Option<bool>,
        context: &C) -> Result<ComDayCqMailerDefaultMailServiceResponse, ApiError>
    {
        info!("com_day_cq_mailer_default_mail_service({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, smtp_host, smtp_port, smtp_user, smtp_password, from_address, smtp_ssl, smtp_starttls, debug_email, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_mailer_impl_cq_mailing_service(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        max_recipient_count: Option<String>,
        context: &C) -> Result<ComDayCqMailerImplCqMailingServiceResponse, ApiError>
    {
        info!("com_day_cq_mailer_impl_cq_mailing_service({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, max_recipient_count, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_mailer_impl_email_cq_email_template_factory(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        mailer_email_charset: Option<String>,
        context: &C) -> Result<ComDayCqMailerImplEmailCqEmailTemplateFactoryResponse, ApiError>
    {
        info!("com_day_cq_mailer_impl_email_cq_email_template_factory({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, mailer_email_charset, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_mailer_impl_email_cq_retriever_template_factory(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        mailer_email_embed: Option<bool>,
        mailer_email_charset: Option<String>,
        mailer_email_retriever_user_id: Option<String>,
        mailer_email_retriever_user_pwd: Option<String>,
        context: &C) -> Result<ComDayCqMailerImplEmailCqRetrieverTemplateFactoryResponse, ApiError>
    {
        info!("com_day_cq_mailer_impl_email_cq_retriever_template_factory({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, mailer_email_embed, mailer_email_charset, mailer_email_retriever_user_id, mailer_email_retriever_user_pwd, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_mcm_campaign_impl_integration_config_impl(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        aem_mcm_campaign_form_constraints: Option<&Vec<String>>,
        aem_mcm_campaign_public_url: Option<String>,
        aem_mcm_campaign_relaxed_ssl: Option<bool>,
        context: &C) -> Result<ComDayCqMcmCampaignImplIntegrationConfigImplResponse, ApiError>
    {
        info!("com_day_cq_mcm_campaign_impl_integration_config_impl({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, aem_mcm_campaign_form_constraints, aem_mcm_campaign_public_url, aem_mcm_campaign_relaxed_ssl, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_mcm_campaign_importer_personalized_text_handler_factory(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        service_ranking: Option<i32>,
        tagpattern: Option<String>,
        context: &C) -> Result<ComDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryResponse, ApiError>
    {
        info!("com_day_cq_mcm_campaign_importer_personalized_text_handler_factory({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, service_ranking, tagpattern, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_mcm_core_newsletter_newsletter_email_service_impl(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        from_address: Option<String>,
        sender_host: Option<String>,
        max_bounce_count: Option<String>,
        context: &C) -> Result<ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplResponse, ApiError>
    {
        info!("com_day_cq_mcm_core_newsletter_newsletter_email_service_impl({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, from_address, sender_host, max_bounce_count, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_mcm_impl_mcm_configuration(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        experience_indirection: Option<&Vec<String>>,
        touchpoint_indirection: Option<&Vec<String>>,
        context: &C) -> Result<ComDayCqMcmImplMcmConfigurationResponse, ApiError>
    {
        info!("com_day_cq_mcm_impl_mcm_configuration({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, experience_indirection, touchpoint_indirection, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_mcm_landingpage_parser_taghandlers_cta_click_through_componen(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        service_ranking: Option<i32>,
        tagpattern: Option<String>,
        component_resource_type: Option<String>,
        context: &C) -> Result<ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenResponse, ApiError>
    {
        info!("com_day_cq_mcm_landingpage_parser_taghandlers_cta_click_through_componen({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, service_ranking, tagpattern, component_resource_type, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_mcm_landingpage_parser_taghandlers_cta_graphical_click_throug(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        service_ranking: Option<i32>,
        tagpattern: Option<String>,
        component_resource_type: Option<String>,
        context: &C) -> Result<ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougResponse, ApiError>
    {
        info!("com_day_cq_mcm_landingpage_parser_taghandlers_cta_graphical_click_throug({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, service_ranking, tagpattern, component_resource_type, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_mcm_landingpage_parser_taghandlers_cta_lead_form_cta_component(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        service_ranking: Option<i32>,
        tagpattern: Option<String>,
        context: &C) -> Result<ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCtaComponentResponse, ApiError>
    {
        info!("com_day_cq_mcm_landingpage_parser_taghandlers_cta_lead_form_cta_component({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, service_ranking, tagpattern, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_mcm_landingpage_parser_taghandlers_mbox_m_box_experience_tag_ha(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        service_ranking: Option<i32>,
        tagpattern: Option<String>,
        context: &C) -> Result<ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaResponse, ApiError>
    {
        info!("com_day_cq_mcm_landingpage_parser_taghandlers_mbox_m_box_experience_tag_ha({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, service_ranking, tagpattern, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_mcm_landingpage_parser_taghandlers_mbox_target_component_tag_h(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        service_ranking: Option<i32>,
        tagpattern: Option<String>,
        component_resource_type: Option<String>,
        context: &C) -> Result<ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHResponse, ApiError>
    {
        info!("com_day_cq_mcm_landingpage_parser_taghandlers_mbox_target_component_tag_h({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, service_ranking, tagpattern, component_resource_type, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_notification_impl_notification_service_impl(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        event_filter: Option<String>,
        context: &C) -> Result<ComDayCqNotificationImplNotificationServiceImplResponse, ApiError>
    {
        info!("com_day_cq_notification_impl_notification_service_impl({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, event_filter, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_personalization_impl_servlets_targeting_configuration_servlet(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        forcelocation: Option<bool>,
        context: &C) -> Result<ComDayCqPersonalizationImplServletsTargetingConfigurationServletResponse, ApiError>
    {
        info!("com_day_cq_personalization_impl_servlets_targeting_configuration_servlet({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, forcelocation, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_polling_importer_impl_managed_poll_config_impl(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        id: Option<String>,
        enabled: Option<bool>,
        reference: Option<bool>,
        interval: Option<i32>,
        expression: Option<String>,
        source: Option<String>,
        target: Option<String>,
        login: Option<String>,
        password: Option<String>,
        context: &C) -> Result<ComDayCqPollingImporterImplManagedPollConfigImplResponse, ApiError>
    {
        info!("com_day_cq_polling_importer_impl_managed_poll_config_impl({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, id, enabled, reference, interval, expression, source, target, login, password, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_polling_importer_impl_managed_polling_importer_impl(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        importer_user: Option<String>,
        context: &C) -> Result<ComDayCqPollingImporterImplManagedPollingImporterImplResponse, ApiError>
    {
        info!("com_day_cq_polling_importer_impl_managed_polling_importer_impl({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, importer_user, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_polling_importer_impl_polling_importer_impl(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        importer_min_interval: Option<i32>,
        importer_user: Option<String>,
        exclude_paths: Option<&Vec<String>>,
        include_paths: Option<&Vec<String>>,
        context: &C) -> Result<ComDayCqPollingImporterImplPollingImporterImplResponse, ApiError>
    {
        info!("com_day_cq_polling_importer_impl_polling_importer_impl({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, importer_min_interval, importer_user, exclude_paths, include_paths, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_replication_audit_replication_event_listener(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        service_ranking: Option<i32>,
        context: &C) -> Result<ComDayCqReplicationAuditReplicationEventListenerResponse, ApiError>
    {
        info!("com_day_cq_replication_audit_replication_event_listener({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, service_ranking, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_replication_content_static_content_builder(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        host: Option<String>,
        port: Option<i32>,
        context: &C) -> Result<ComDayCqReplicationContentStaticContentBuilderResponse, ApiError>
    {
        info!("com_day_cq_replication_content_static_content_builder({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, host, port, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_replication_impl_agent_manager_impl(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        job_topics: Option<String>,
        service_user_target: Option<String>,
        agent_provider_target: Option<String>,
        context: &C) -> Result<ComDayCqReplicationImplAgentManagerImplResponse, ApiError>
    {
        info!("com_day_cq_replication_impl_agent_manager_impl({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, job_topics, service_user_target, agent_provider_target, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_replication_impl_content_durbo_binary_less_content_builder(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        binary_threshold: Option<i32>,
        context: &C) -> Result<ComDayCqReplicationImplContentDurboBinaryLessContentBuilderResponse, ApiError>
    {
        info!("com_day_cq_replication_impl_content_durbo_binary_less_content_builder({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, binary_threshold, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        preserve_hierarchy_nodes: Option<bool>,
        ignore_versioning: Option<bool>,
        import_acl: Option<bool>,
        save_threshold: Option<i32>,
        preserve_user_paths: Option<bool>,
        preserve_uuid: Option<bool>,
        preserve_uuid_nodetypes: Option<&Vec<String>>,
        preserve_uuid_subtrees: Option<&Vec<String>>,
        auto_commit: Option<bool>,
        context: &C) -> Result<ComDayCqReplicationImplContentDurboDurboImportConfigurationProvResponse, ApiError>
    {
        info!("com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, preserve_hierarchy_nodes, ignore_versioning, import_acl, save_threshold, preserve_user_paths, preserve_uuid, preserve_uuid_nodetypes, preserve_uuid_subtrees, auto_commit, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_replication_impl_replication_content_factory_provider_impl(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        replication_content_use_file_storage: Option<bool>,
        replication_content_max_commit_attempts: Option<i32>,
        context: &C) -> Result<ComDayCqReplicationImplReplicationContentFactoryProviderImplResponse, ApiError>
    {
        info!("com_day_cq_replication_impl_replication_content_factory_provider_impl({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, replication_content_use_file_storage, replication_content_max_commit_attempts, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_replication_impl_replication_receiver_impl(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        receiver_tmpfile_threshold: Option<i32>,
        receiver_packages_use_install: Option<bool>,
        context: &C) -> Result<ComDayCqReplicationImplReplicationReceiverImplResponse, ApiError>
    {
        info!("com_day_cq_replication_impl_replication_receiver_impl({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, receiver_tmpfile_threshold, receiver_packages_use_install, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_replication_impl_replicator_impl(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        distribute_events: Option<bool>,
        context: &C) -> Result<ComDayCqReplicationImplReplicatorImplResponse, ApiError>
    {
        info!("com_day_cq_replication_impl_replicator_impl({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, distribute_events, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_replication_impl_reverse_replicator(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        scheduler_period: Option<i32>,
        context: &C) -> Result<ComDayCqReplicationImplReverseReplicatorResponse, ApiError>
    {
        info!("com_day_cq_replication_impl_reverse_replicator({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, scheduler_period, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_replication_impl_transport_binary_less_transport_handler(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        disabled_cipher_suites: Option<&Vec<String>>,
        enabled_cipher_suites: Option<&Vec<String>>,
        context: &C) -> Result<ComDayCqReplicationImplTransportBinaryLessTransportHandlerResponse, ApiError>
    {
        info!("com_day_cq_replication_impl_transport_binary_less_transport_handler({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, disabled_cipher_suites, enabled_cipher_suites, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_replication_impl_transport_http(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        disabled_cipher_suites: Option<&Vec<String>>,
        enabled_cipher_suites: Option<&Vec<String>>,
        context: &C) -> Result<ComDayCqReplicationImplTransportHttpResponse, ApiError>
    {
        info!("com_day_cq_replication_impl_transport_http({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, disabled_cipher_suites, enabled_cipher_suites, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_reporting_impl_cache_cache_impl(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        repcache_enable: Option<bool>,
        repcache_ttl: Option<i32>,
        repcache_max: Option<i32>,
        context: &C) -> Result<ComDayCqReportingImplCacheCacheImplResponse, ApiError>
    {
        info!("com_day_cq_reporting_impl_cache_cache_impl({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, repcache_enable, repcache_ttl, repcache_max, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_reporting_impl_config_service_impl(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        repconf_timezone: Option<String>,
        repconf_locale: Option<String>,
        repconf_snapshots: Option<String>,
        repconf_repdir: Option<String>,
        repconf_hourofday: Option<i32>,
        repconf_minofhour: Option<i32>,
        repconf_maxrows: Option<i32>,
        repconf_fakedata: Option<bool>,
        repconf_snapshotuser: Option<String>,
        repconf_enforcesnapshotuser: Option<bool>,
        context: &C) -> Result<ComDayCqReportingImplConfigServiceImplResponse, ApiError>
    {
        info!("com_day_cq_reporting_impl_config_service_impl({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, repconf_timezone, repconf_locale, repconf_snapshots, repconf_repdir, repconf_hourofday, repconf_minofhour, repconf_maxrows, repconf_fakedata, repconf_snapshotuser, repconf_enforcesnapshotuser, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_reporting_impl_r_log_analyzer(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        request_log_output: Option<String>,
        context: &C) -> Result<ComDayCqReportingImplRLogAnalyzerResponse, ApiError>
    {
        info!("com_day_cq_reporting_impl_r_log_analyzer({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, request_log_output, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_rewriter_linkchecker_impl_link_checker_impl(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        scheduler_period: Option<i32>,
        scheduler_concurrent: Option<bool>,
        service_bad_link_tolerance_interval: Option<i32>,
        service_check_override_patterns: Option<&Vec<String>>,
        service_cache_broken_internal_links: Option<bool>,
        service_special_link_prefix: Option<&Vec<String>>,
        service_special_link_patterns: Option<&Vec<String>>,
        context: &C) -> Result<ComDayCqRewriterLinkcheckerImplLinkCheckerImplResponse, ApiError>
    {
        info!("com_day_cq_rewriter_linkchecker_impl_link_checker_impl({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, scheduler_period, scheduler_concurrent, service_bad_link_tolerance_interval, service_check_override_patterns, service_cache_broken_internal_links, service_special_link_prefix, service_special_link_patterns, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_rewriter_linkchecker_impl_link_checker_task(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        scheduler_period: Option<i32>,
        scheduler_concurrent: Option<bool>,
        good_link_test_interval: Option<i32>,
        bad_link_test_interval: Option<i32>,
        link_unused_interval: Option<i32>,
        connection_timeout: Option<i32>,
        context: &C) -> Result<ComDayCqRewriterLinkcheckerImplLinkCheckerTaskResponse, ApiError>
    {
        info!("com_day_cq_rewriter_linkchecker_impl_link_checker_task({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, scheduler_period, scheduler_concurrent, good_link_test_interval, bad_link_test_interval, link_unused_interval, connection_timeout, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_rewriter_linkchecker_impl_link_checker_transformer_factory(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        linkcheckertransformer_disable_rewriting: Option<bool>,
        linkcheckertransformer_disable_checking: Option<bool>,
        linkcheckertransformer_map_cache_size: Option<i32>,
        linkcheckertransformer_strict_extension_check: Option<bool>,
        linkcheckertransformer_strip_htmlt_extension: Option<bool>,
        linkcheckertransformer_rewrite_elements: Option<&Vec<String>>,
        linkcheckertransformer_strip_extension_path_blacklist: Option<&Vec<String>>,
        context: &C) -> Result<ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryResponse, ApiError>
    {
        info!("com_day_cq_rewriter_linkchecker_impl_link_checker_transformer_factory({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, linkcheckertransformer_disable_rewriting, linkcheckertransformer_disable_checking, linkcheckertransformer_map_cache_size, linkcheckertransformer_strict_extension_check, linkcheckertransformer_strip_htmlt_extension, linkcheckertransformer_rewrite_elements, linkcheckertransformer_strip_extension_path_blacklist, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_rewriter_linkchecker_impl_link_info_storage_impl(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        service_max_links_per_host: Option<i32>,
        service_save_external_link_references: Option<bool>,
        context: &C) -> Result<ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplResponse, ApiError>
    {
        info!("com_day_cq_rewriter_linkchecker_impl_link_info_storage_impl({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, service_max_links_per_host, service_save_external_link_references, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_rewriter_processor_impl_html_parser_factory(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        htmlparser_process_tags: Option<&Vec<String>>,
        htmlparser_preserve_camel_case: Option<bool>,
        context: &C) -> Result<ComDayCqRewriterProcessorImplHtmlParserFactoryResponse, ApiError>
    {
        info!("com_day_cq_rewriter_processor_impl_html_parser_factory({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, htmlparser_process_tags, htmlparser_preserve_camel_case, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_search_impl_builder_query_builder_impl(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        excerpt_properties: Option<&Vec<String>>,
        cache_max_entries: Option<i32>,
        cache_entry_lifetime: Option<i32>,
        xpath_union: Option<bool>,
        context: &C) -> Result<ComDayCqSearchImplBuilderQueryBuilderImplResponse, ApiError>
    {
        info!("com_day_cq_search_impl_builder_query_builder_impl({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, excerpt_properties, cache_max_entries, cache_entry_lifetime, xpath_union, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_search_suggest_impl_suggestion_index_manager_impl(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        path_builder_target: Option<String>,
        suggest_basepath: Option<String>,
        context: &C) -> Result<ComDayCqSearchSuggestImplSuggestionIndexManagerImplResponse, ApiError>
    {
        info!("com_day_cq_search_suggest_impl_suggestion_index_manager_impl({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, path_builder_target, suggest_basepath, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_searchpromote_impl_publish_search_promote_config_handler(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        cq_searchpromote_confighandler_enabled: Option<bool>,
        context: &C) -> Result<ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerResponse, ApiError>
    {
        info!("com_day_cq_searchpromote_impl_publish_search_promote_config_handler({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, cq_searchpromote_confighandler_enabled, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_searchpromote_impl_search_promote_service_impl(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        cq_searchpromote_configuration_server_uri: Option<String>,
        cq_searchpromote_configuration_environment: Option<String>,
        connection_timeout: Option<i32>,
        socket_timeout: Option<i32>,
        context: &C) -> Result<ComDayCqSearchpromoteImplSearchPromoteServiceImplResponse, ApiError>
    {
        info!("com_day_cq_searchpromote_impl_search_promote_service_impl({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, cq_searchpromote_configuration_server_uri, cq_searchpromote_configuration_environment, connection_timeout, socket_timeout, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_security_acl_setup(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        cq_aclsetup_rules: Option<&Vec<String>>,
        context: &C) -> Result<ComDayCqSecurityAclSetupResponse, ApiError>
    {
        info!("com_day_cq_security_acl_setup({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, cq_aclsetup_rules, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_statistics_impl_statistics_service_impl(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        scheduler_period: Option<i32>,
        scheduler_concurrent: Option<bool>,
        path: Option<String>,
        workspace: Option<String>,
        keywords_path: Option<String>,
        async_entries: Option<bool>,
        context: &C) -> Result<ComDayCqStatisticsImplStatisticsServiceImplResponse, ApiError>
    {
        info!("com_day_cq_statistics_impl_statistics_service_impl({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, scheduler_period, scheduler_concurrent, path, workspace, keywords_path, async_entries, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_tagging_impl_jcr_tag_manager_factory_impl(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        validation_enabled: Option<bool>,
        context: &C) -> Result<ComDayCqTaggingImplJcrTagManagerFactoryImplResponse, ApiError>
    {
        info!("com_day_cq_tagging_impl_jcr_tag_manager_factory_impl({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, validation_enabled, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_tagging_impl_search_tag_predicate_evaluator(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        ignore_path: Option<bool>,
        context: &C) -> Result<ComDayCqTaggingImplSearchTagPredicateEvaluatorResponse, ApiError>
    {
        info!("com_day_cq_tagging_impl_search_tag_predicate_evaluator({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, ignore_path, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_tagging_impl_tag_garbage_collector(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        scheduler_expression: Option<String>,
        context: &C) -> Result<ComDayCqTaggingImplTagGarbageCollectorResponse, ApiError>
    {
        info!("com_day_cq_tagging_impl_tag_garbage_collector({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, scheduler_expression, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_wcm_contentsync_impl_handler_pages_update_handler(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        cq_pagesupdatehandler_imageresourcetypes: Option<&Vec<String>>,
        context: &C) -> Result<ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerResponse, ApiError>
    {
        info!("com_day_cq_wcm_contentsync_impl_handler_pages_update_handler({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, cq_pagesupdatehandler_imageresourcetypes, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_wcm_contentsync_impl_rewriter_path_rewriter_transformer_factor(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        cq_contentsync_pathrewritertransformer_mapping_links: Option<&Vec<String>>,
        cq_contentsync_pathrewritertransformer_mapping_clientlibs: Option<&Vec<String>>,
        cq_contentsync_pathrewritertransformer_mapping_images: Option<&Vec<String>>,
        cq_contentsync_pathrewritertransformer_attribute_pattern: Option<String>,
        cq_contentsync_pathrewritertransformer_clientlibrary_pattern: Option<String>,
        cq_contentsync_pathrewritertransformer_clientlibrary_replace: Option<String>,
        context: &C) -> Result<ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorResponse, ApiError>
    {
        info!("com_day_cq_wcm_contentsync_impl_rewriter_path_rewriter_transformer_factor({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, cq_contentsync_pathrewritertransformer_mapping_links, cq_contentsync_pathrewritertransformer_mapping_clientlibs, cq_contentsync_pathrewritertransformer_mapping_images, cq_contentsync_pathrewritertransformer_attribute_pattern, cq_contentsync_pathrewritertransformer_clientlibrary_pattern, cq_contentsync_pathrewritertransformer_clientlibrary_replace, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_wcm_core_impl_authoring_ui_mode_service_impl(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        authoring_ui_mode_service_default: Option<String>,
        context: &C) -> Result<ComDayCqWcmCoreImplAuthoringUiModeServiceImplResponse, ApiError>
    {
        info!("com_day_cq_wcm_core_impl_authoring_ui_mode_service_impl({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, authoring_ui_mode_service_default, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_wcm_core_impl_commands_wcm_command_servlet(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        wcmcommandservlet_delete_whitelist: Option<&Vec<String>>,
        context: &C) -> Result<ComDayCqWcmCoreImplCommandsWcmCommandServletResponse, ApiError>
    {
        info!("com_day_cq_wcm_core_impl_commands_wcm_command_servlet({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, wcmcommandservlet_delete_whitelist, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_wcm_core_impl_devicedetection_device_identification_mode_impl(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        dim_default_mode: Option<String>,
        dim_appcache_enabled: Option<bool>,
        context: &C) -> Result<ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplResponse, ApiError>
    {
        info!("com_day_cq_wcm_core_impl_devicedetection_device_identification_mode_impl({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, dim_default_mode, dim_appcache_enabled, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_wcm_core_impl_event_page_event_audit_listener(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        configured: Option<String>,
        context: &C) -> Result<ComDayCqWcmCoreImplEventPageEventAuditListenerResponse, ApiError>
    {
        info!("com_day_cq_wcm_core_impl_event_page_event_audit_listener({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, configured, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_wcm_core_impl_event_page_post_processor(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        paths: Option<&Vec<String>>,
        context: &C) -> Result<ComDayCqWcmCoreImplEventPagePostProcessorResponse, ApiError>
    {
        info!("com_day_cq_wcm_core_impl_event_page_post_processor({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, paths, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_wcm_core_impl_event_repository_change_event_listener(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        paths: Option<&Vec<String>>,
        excluded_paths: Option<&Vec<String>>,
        context: &C) -> Result<ComDayCqWcmCoreImplEventRepositoryChangeEventListenerResponse, ApiError>
    {
        info!("com_day_cq_wcm_core_impl_event_repository_change_event_listener({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, paths, excluded_paths, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_wcm_core_impl_event_template_post_processor(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        paths: Option<String>,
        context: &C) -> Result<ComDayCqWcmCoreImplEventTemplatePostProcessorResponse, ApiError>
    {
        info!("com_day_cq_wcm_core_impl_event_template_post_processor({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, paths, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_wcm_core_impl_language_manager_impl(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        langmgr_list_path: Option<String>,
        langmgr_country_default: Option<&Vec<String>>,
        context: &C) -> Result<ComDayCqWcmCoreImplLanguageManagerImplResponse, ApiError>
    {
        info!("com_day_cq_wcm_core_impl_language_manager_impl({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, langmgr_list_path, langmgr_country_default, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        link_expired_prefix: Option<String>,
        link_expired_remove: Option<bool>,
        link_expired_suffix: Option<String>,
        link_invalid_prefix: Option<String>,
        link_invalid_remove: Option<bool>,
        link_invalid_suffix: Option<String>,
        link_predated_prefix: Option<String>,
        link_predated_remove: Option<bool>,
        link_predated_suffix: Option<String>,
        link_wcmmodes: Option<&Vec<String>>,
        context: &C) -> Result<ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplResponse, ApiError>
    {
        info!("com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, link_expired_prefix, link_expired_remove, link_expired_suffix, link_invalid_prefix, link_invalid_remove, link_invalid_suffix, link_predated_prefix, link_predated_remove, link_predated_suffix, link_wcmmodes, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_wcm_core_impl_page_page_info_aggregator_impl(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        page_info_provider_property_regex_default: Option<String>,
        page_info_provider_property_name: Option<String>,
        context: &C) -> Result<ComDayCqWcmCoreImplPagePageInfoAggregatorImplResponse, ApiError>
    {
        info!("com_day_cq_wcm_core_impl_page_page_info_aggregator_impl({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, page_info_provider_property_regex_default, page_info_provider_property_name, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_wcm_core_impl_page_page_manager_factory_impl(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        illegal_char_mapping: Option<String>,
        page_sub_tree_activation_check: Option<bool>,
        context: &C) -> Result<ComDayCqWcmCoreImplPagePageManagerFactoryImplResponse, ApiError>
    {
        info!("com_day_cq_wcm_core_impl_page_page_manager_factory_impl({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, illegal_char_mapping, page_sub_tree_activation_check, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_wcm_core_impl_references_content_content_reference_config(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        content_reference_config_resource_types: Option<&Vec<String>>,
        context: &C) -> Result<ComDayCqWcmCoreImplReferencesContentContentReferenceConfigResponse, ApiError>
    {
        info!("com_day_cq_wcm_core_impl_references_content_content_reference_config({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, content_reference_config_resource_types, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_wcm_core_impl_servlets_contentfinder_asset_view_handler(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        dam_showexpired: Option<bool>,
        dam_showhidden: Option<bool>,
        tag_title_search: Option<bool>,
        guess_total: Option<String>,
        dam_expiry_property: Option<String>,
        context: &C) -> Result<ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerResponse, ApiError>
    {
        info!("com_day_cq_wcm_core_impl_servlets_contentfinder_asset_view_handler({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, dam_showexpired, dam_showhidden, tag_title_search, guess_total, dam_expiry_property, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_wcm_core_impl_servlets_contentfinder_connector_connector_vie(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        item_resource_types: Option<&Vec<String>>,
        context: &C) -> Result<ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieResponse, ApiError>
    {
        info!("com_day_cq_wcm_core_impl_servlets_contentfinder_connector_connector_vie({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, item_resource_types, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_wcm_core_impl_servlets_contentfinder_page_view_handler(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        guess_total: Option<String>,
        tag_title_search: Option<bool>,
        context: &C) -> Result<ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerResponse, ApiError>
    {
        info!("com_day_cq_wcm_core_impl_servlets_contentfinder_page_view_handler({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, guess_total, tag_title_search, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_wcm_core_impl_servlets_find_replace_servlet(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        scope: Option<&Vec<String>>,
        context: &C) -> Result<ComDayCqWcmCoreImplServletsFindReplaceServletResponse, ApiError>
    {
        info!("com_day_cq_wcm_core_impl_servlets_find_replace_servlet({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, scope, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_wcm_core_impl_servlets_reference_search_servlet(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        referencesearchservlet_max_references_per_page: Option<i32>,
        referencesearchservlet_max_pages: Option<i32>,
        context: &C) -> Result<ComDayCqWcmCoreImplServletsReferenceSearchServletResponse, ApiError>
    {
        info!("com_day_cq_wcm_core_impl_servlets_reference_search_servlet({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, referencesearchservlet_max_references_per_page, referencesearchservlet_max_pages, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_wcm_core_impl_servlets_thumbnail_servlet(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        workspace: Option<String>,
        dimensions: Option<&Vec<String>>,
        context: &C) -> Result<ComDayCqWcmCoreImplServletsThumbnailServletResponse, ApiError>
    {
        info!("com_day_cq_wcm_core_impl_servlets_thumbnail_servlet({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, workspace, dimensions, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_wcm_core_impl_utils_default_page_name_validator(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        non_valid_chars: Option<String>,
        context: &C) -> Result<ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorResponse, ApiError>
    {
        info!("com_day_cq_wcm_core_impl_utils_default_page_name_validator({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, non_valid_chars, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_wcm_core_impl_variants_page_variants_provider_impl(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        default_externalizer_domain: Option<String>,
        context: &C) -> Result<ComDayCqWcmCoreImplVariantsPageVariantsProviderImplResponse, ApiError>
    {
        info!("com_day_cq_wcm_core_impl_variants_page_variants_provider_impl({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, default_externalizer_domain, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_wcm_core_impl_version_manager_impl(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        versionmanager_create_version_on_activation: Option<bool>,
        versionmanager_purging_enabled: Option<bool>,
        versionmanager_purge_paths: Option<&Vec<String>>,
        versionmanager_iv_paths: Option<&Vec<String>>,
        versionmanager_max_age_days: Option<i32>,
        versionmanager_max_number_versions: Option<i32>,
        versionmanager_min_number_versions: Option<i32>,
        context: &C) -> Result<ComDayCqWcmCoreImplVersionManagerImplResponse, ApiError>
    {
        info!("com_day_cq_wcm_core_impl_version_manager_impl({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, versionmanager_create_version_on_activation, versionmanager_purging_enabled, versionmanager_purge_paths, versionmanager_iv_paths, versionmanager_max_age_days, versionmanager_max_number_versions, versionmanager_min_number_versions, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_wcm_core_impl_version_purge_task(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        versionpurge_paths: Option<&Vec<String>>,
        versionpurge_recursive: Option<bool>,
        versionpurge_max_versions: Option<i32>,
        versionpurge_min_versions: Option<i32>,
        versionpurge_max_age_days: Option<i32>,
        context: &C) -> Result<ComDayCqWcmCoreImplVersionPurgeTaskResponse, ApiError>
    {
        info!("com_day_cq_wcm_core_impl_version_purge_task({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, versionpurge_paths, versionpurge_recursive, versionpurge_max_versions, versionpurge_min_versions, versionpurge_max_age_days, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_wcm_core_impl_warp_time_warp_filter(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        filter_order: Option<String>,
        filter_scope: Option<String>,
        context: &C) -> Result<ComDayCqWcmCoreImplWarpTimeWarpFilterResponse, ApiError>
    {
        info!("com_day_cq_wcm_core_impl_warp_time_warp_filter({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, filter_order, filter_scope, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_wcm_core_impl_wcm_debug_filter(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        wcmdbgfilter_enabled: Option<bool>,
        wcmdbgfilter_jsp_debug: Option<bool>,
        context: &C) -> Result<ComDayCqWcmCoreImplWcmDebugFilterResponse, ApiError>
    {
        info!("com_day_cq_wcm_core_impl_wcm_debug_filter({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, wcmdbgfilter_enabled, wcmdbgfilter_jsp_debug, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_wcm_core_impl_wcm_developer_mode_filter(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        wcmdevmodefilter_enabled: Option<bool>,
        context: &C) -> Result<ComDayCqWcmCoreImplWcmDeveloperModeFilterResponse, ApiError>
    {
        info!("com_day_cq_wcm_core_impl_wcm_developer_mode_filter({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, wcmdevmodefilter_enabled, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_wcm_core_mvt_mvt_statistics_impl(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        mvtstatistics_trackingurl: Option<String>,
        context: &C) -> Result<ComDayCqWcmCoreMvtMvtStatisticsImplResponse, ApiError>
    {
        info!("com_day_cq_wcm_core_mvt_mvt_statistics_impl({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, mvtstatistics_trackingurl, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_wcm_core_stats_page_view_statistics_impl(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        pageviewstatistics_trackingurl: Option<String>,
        pageviewstatistics_trackingscript_enabled: Option<String>,
        context: &C) -> Result<ComDayCqWcmCoreStatsPageViewStatisticsImplResponse, ApiError>
    {
        info!("com_day_cq_wcm_core_stats_page_view_statistics_impl({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, pageviewstatistics_trackingurl, pageviewstatistics_trackingscript_enabled, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_wcm_core_wcm_request_filter(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        wcmfilter_mode: Option<String>,
        context: &C) -> Result<ComDayCqWcmCoreWcmRequestFilterResponse, ApiError>
    {
        info!("com_day_cq_wcm_core_wcm_request_filter({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, wcmfilter_mode, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_wcm_designimporter_design_package_importer(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        extract_filter: Option<&Vec<String>>,
        context: &C) -> Result<ComDayCqWcmDesignimporterDesignPackageImporterResponse, ApiError>
    {
        info!("com_day_cq_wcm_designimporter_design_package_importer({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, extract_filter, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_wcm_designimporter_impl_canvas_builder_impl(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        filepattern: Option<String>,
        build_page_nodes: Option<bool>,
        build_client_libs: Option<bool>,
        build_canvas_component: Option<bool>,
        context: &C) -> Result<ComDayCqWcmDesignimporterImplCanvasBuilderImplResponse, ApiError>
    {
        info!("com_day_cq_wcm_designimporter_impl_canvas_builder_impl({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, filepattern, build_page_nodes, build_client_libs, build_canvas_component, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_wcm_designimporter_impl_canvas_page_delete_handler(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        min_thread_pool_size: Option<i32>,
        max_thread_pool_size: Option<i32>,
        context: &C) -> Result<ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerResponse, ApiError>
    {
        info!("com_day_cq_wcm_designimporter_impl_canvas_page_delete_handler({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, min_thread_pool_size, max_thread_pool_size, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_wcm_designimporter_impl_entry_preprocessor_impl(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        search_pattern: Option<String>,
        replace_pattern: Option<String>,
        context: &C) -> Result<ComDayCqWcmDesignimporterImplEntryPreprocessorImplResponse, ApiError>
    {
        info!("com_day_cq_wcm_designimporter_impl_entry_preprocessor_impl({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, search_pattern, replace_pattern, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_wcm_designimporter_impl_mobile_canvas_builder_impl(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        filepattern: Option<String>,
        device_groups: Option<&Vec<String>>,
        build_page_nodes: Option<bool>,
        build_client_libs: Option<bool>,
        build_canvas_component: Option<bool>,
        context: &C) -> Result<ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplResponse, ApiError>
    {
        info!("com_day_cq_wcm_designimporter_impl_mobile_canvas_builder_impl({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, filepattern, device_groups, build_page_nodes, build_client_libs, build_canvas_component, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_wcm_designimporter_parser_taghandlers_factory_canvas_compone(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        service_ranking: Option<i32>,
        tagpattern: Option<String>,
        context: &C) -> Result<ComDayCqWcmDesignimporterParserTaghandlersFactoryCanvasComponeResponse, ApiError>
    {
        info!("com_day_cq_wcm_designimporter_parser_taghandlers_factory_canvas_compone({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, service_ranking, tagpattern, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_wcm_designimporter_parser_taghandlers_factory_default_compon(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        service_ranking: Option<i32>,
        tagpattern: Option<String>,
        context: &C) -> Result<ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultComponResponse, ApiError>
    {
        info!("com_day_cq_wcm_designimporter_parser_taghandlers_factory_default_compon({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, service_ranking, tagpattern, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_wcm_designimporter_parser_taghandlers_factory_default_tag_han(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        service_ranking: Option<i32>,
        tagpattern: Option<String>,
        context: &C) -> Result<ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultTagHanResponse, ApiError>
    {
        info!("com_day_cq_wcm_designimporter_parser_taghandlers_factory_default_tag_han({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, service_ranking, tagpattern, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_wcm_designimporter_parser_taghandlers_factory_head_tag_handle(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        service_ranking: Option<i32>,
        tagpattern: Option<String>,
        context: &C) -> Result<ComDayCqWcmDesignimporterParserTaghandlersFactoryHeadTagHandleResponse, ApiError>
    {
        info!("com_day_cq_wcm_designimporter_parser_taghandlers_factory_head_tag_handle({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, service_ranking, tagpattern, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_wcm_designimporter_parser_taghandlers_factory_i_frame_tag_hand(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        service_ranking: Option<i32>,
        tagpattern: Option<String>,
        context: &C) -> Result<ComDayCqWcmDesignimporterParserTaghandlersFactoryIFrameTagHandResponse, ApiError>
    {
        info!("com_day_cq_wcm_designimporter_parser_taghandlers_factory_i_frame_tag_hand({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, service_ranking, tagpattern, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_wcm_designimporter_parser_taghandlers_factory_image_componen(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        service_ranking: Option<i32>,
        tagpattern: Option<String>,
        component_resource_type: Option<String>,
        context: &C) -> Result<ComDayCqWcmDesignimporterParserTaghandlersFactoryImageComponenResponse, ApiError>
    {
        info!("com_day_cq_wcm_designimporter_parser_taghandlers_factory_image_componen({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, service_ranking, tagpattern, component_resource_type, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_wcm_designimporter_parser_taghandlers_factory_img_tag_handler(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        service_ranking: Option<i32>,
        tagpattern: Option<String>,
        context: &C) -> Result<ComDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandlerResponse, ApiError>
    {
        info!("com_day_cq_wcm_designimporter_parser_taghandlers_factory_img_tag_handler({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, service_ranking, tagpattern, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_wcm_designimporter_parser_taghandlers_factory_inline_script_t(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        service_ranking: Option<i32>,
        tagpattern: Option<String>,
        context: &C) -> Result<ComDayCqWcmDesignimporterParserTaghandlersFactoryInlineScriptTResponse, ApiError>
    {
        info!("com_day_cq_wcm_designimporter_parser_taghandlers_factory_inline_script_t({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, service_ranking, tagpattern, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_wcm_designimporter_parser_taghandlers_factory_link_tag_handle(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        service_ranking: Option<i32>,
        tagpattern: Option<String>,
        context: &C) -> Result<ComDayCqWcmDesignimporterParserTaghandlersFactoryLinkTagHandleResponse, ApiError>
    {
        info!("com_day_cq_wcm_designimporter_parser_taghandlers_factory_link_tag_handle({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, service_ranking, tagpattern, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_wcm_designimporter_parser_taghandlers_factory_meta_tag_handle(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        service_ranking: Option<i32>,
        tagpattern: Option<String>,
        context: &C) -> Result<ComDayCqWcmDesignimporterParserTaghandlersFactoryMetaTagHandleResponse, ApiError>
    {
        info!("com_day_cq_wcm_designimporter_parser_taghandlers_factory_meta_tag_handle({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, service_ranking, tagpattern, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_wcm_designimporter_parser_taghandlers_factory_non_script_tag_h(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        service_ranking: Option<i32>,
        tagpattern: Option<String>,
        context: &C) -> Result<ComDayCqWcmDesignimporterParserTaghandlersFactoryNonScriptTagHResponse, ApiError>
    {
        info!("com_day_cq_wcm_designimporter_parser_taghandlers_factory_non_script_tag_h({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, service_ranking, tagpattern, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_wcm_designimporter_parser_taghandlers_factory_parsys_compone(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        service_ranking: Option<i32>,
        tagpattern: Option<String>,
        component_resource_type: Option<String>,
        context: &C) -> Result<ComDayCqWcmDesignimporterParserTaghandlersFactoryParsysComponeResponse, ApiError>
    {
        info!("com_day_cq_wcm_designimporter_parser_taghandlers_factory_parsys_compone({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, service_ranking, tagpattern, component_resource_type, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_wcm_designimporter_parser_taghandlers_factory_script_tag_hand(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        service_ranking: Option<i32>,
        tagpattern: Option<String>,
        context: &C) -> Result<ComDayCqWcmDesignimporterParserTaghandlersFactoryScriptTagHandResponse, ApiError>
    {
        info!("com_day_cq_wcm_designimporter_parser_taghandlers_factory_script_tag_hand({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, service_ranking, tagpattern, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_wcm_designimporter_parser_taghandlers_factory_style_tag_handl(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        service_ranking: Option<i32>,
        tagpattern: Option<String>,
        context: &C) -> Result<ComDayCqWcmDesignimporterParserTaghandlersFactoryStyleTagHandlResponse, ApiError>
    {
        info!("com_day_cq_wcm_designimporter_parser_taghandlers_factory_style_tag_handl({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, service_ranking, tagpattern, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_wcm_designimporter_parser_taghandlers_factory_text_component(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        service_ranking: Option<i32>,
        tagpattern: Option<String>,
        component_resource_type: Option<String>,
        context: &C) -> Result<ComDayCqWcmDesignimporterParserTaghandlersFactoryTextComponentResponse, ApiError>
    {
        info!("com_day_cq_wcm_designimporter_parser_taghandlers_factory_text_component({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, service_ranking, tagpattern, component_resource_type, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_wcm_designimporter_parser_taghandlers_factory_title_componen(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        service_ranking: Option<i32>,
        tagpattern: Option<String>,
        component_resource_type: Option<String>,
        context: &C) -> Result<ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleComponenResponse, ApiError>
    {
        info!("com_day_cq_wcm_designimporter_parser_taghandlers_factory_title_componen({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, service_ranking, tagpattern, component_resource_type, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_wcm_designimporter_parser_taghandlers_factory_title_tag_handl(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        service_ranking: Option<i32>,
        tagpattern: Option<String>,
        context: &C) -> Result<ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleTagHandlResponse, ApiError>
    {
        info!("com_day_cq_wcm_designimporter_parser_taghandlers_factory_title_tag_handl({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, service_ranking, tagpattern, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_wcm_foundation_forms_impl_form_chooser_servlet(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        service_name: Option<String>,
        sling_servlet_resource_types: Option<String>,
        sling_servlet_selectors: Option<String>,
        sling_servlet_methods: Option<&Vec<String>>,
        forms_formchooserservlet_advansesearch_require: Option<bool>,
        context: &C) -> Result<ComDayCqWcmFoundationFormsImplFormChooserServletResponse, ApiError>
    {
        info!("com_day_cq_wcm_foundation_forms_impl_form_chooser_servlet({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, service_name, sling_servlet_resource_types, sling_servlet_selectors, sling_servlet_methods, forms_formchooserservlet_advansesearch_require, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_wcm_foundation_forms_impl_form_paragraph_post_processor(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        forms_formparagraphpostprocessor_enabled: Option<bool>,
        forms_formparagraphpostprocessor_formresourcetypes: Option<&Vec<String>>,
        context: &C) -> Result<ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorResponse, ApiError>
    {
        info!("com_day_cq_wcm_foundation_forms_impl_form_paragraph_post_processor({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, forms_formparagraphpostprocessor_enabled, forms_formparagraphpostprocessor_formresourcetypes, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_wcm_foundation_forms_impl_forms_handling_servlet(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        name_whitelist: Option<String>,
        allow_expressions: Option<bool>,
        context: &C) -> Result<ComDayCqWcmFoundationFormsImplFormsHandlingServletResponse, ApiError>
    {
        info!("com_day_cq_wcm_foundation_forms_impl_forms_handling_servlet({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, name_whitelist, allow_expressions, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_wcm_foundation_forms_impl_mail_servlet(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        sling_servlet_resource_types: Option<String>,
        sling_servlet_selectors: Option<String>,
        resource_whitelist: Option<&Vec<String>>,
        resource_blacklist: Option<String>,
        context: &C) -> Result<ComDayCqWcmFoundationFormsImplMailServletResponse, ApiError>
    {
        info!("com_day_cq_wcm_foundation_forms_impl_mail_servlet({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, sling_servlet_resource_types, sling_servlet_selectors, resource_whitelist, resource_blacklist, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_wcm_foundation_impl_adaptive_image_component_servlet(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        adapt_supported_widths: Option<&Vec<String>>,
        context: &C) -> Result<ComDayCqWcmFoundationImplAdaptiveImageComponentServletResponse, ApiError>
    {
        info!("com_day_cq_wcm_foundation_impl_adaptive_image_component_servlet({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, adapt_supported_widths, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_wcm_foundation_impl_http_auth_handler(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        path: Option<String>,
        auth_http_nologin: Option<bool>,
        auth_http_realm: Option<String>,
        auth_default_loginpage: Option<String>,
        auth_cred_form: Option<&Vec<String>>,
        auth_cred_utf8: Option<&Vec<String>>,
        context: &C) -> Result<ComDayCqWcmFoundationImplHttpAuthHandlerResponse, ApiError>
    {
        info!("com_day_cq_wcm_foundation_impl_http_auth_handler({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, path, auth_http_nologin, auth_http_realm, auth_default_loginpage, auth_cred_form, auth_cred_utf8, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_wcm_foundation_impl_page_impressions_tracker(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        sling_auth_requirements: Option<String>,
        context: &C) -> Result<ComDayCqWcmFoundationImplPageImpressionsTrackerResponse, ApiError>
    {
        info!("com_day_cq_wcm_foundation_impl_page_impressions_tracker({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, sling_auth_requirements, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_wcm_foundation_impl_page_redirect_servlet(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        excluded_resource_types: Option<&Vec<String>>,
        context: &C) -> Result<ComDayCqWcmFoundationImplPageRedirectServletResponse, ApiError>
    {
        info!("com_day_cq_wcm_foundation_impl_page_redirect_servlet({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, excluded_resource_types, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_wcm_foundation_security_impl_default_attachment_type_blacklist(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        default_attachment_type_blacklist: Option<&Vec<String>>,
        baseline_attachment_type_blacklist: Option<&Vec<String>>,
        context: &C) -> Result<ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistResponse, ApiError>
    {
        info!("com_day_cq_wcm_foundation_security_impl_default_attachment_type_blacklist({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, default_attachment_type_blacklist, baseline_attachment_type_blacklist, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_wcm_foundation_security_impl_safer_sling_post_validator_impl(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        parameter_whitelist: Option<&Vec<String>>,
        parameter_whitelist_prefixes: Option<&Vec<String>>,
        binary_parameter_whitelist: Option<&Vec<String>>,
        modifier_whitelist: Option<&Vec<String>>,
        operation_whitelist: Option<&Vec<String>>,
        operation_whitelist_prefixes: Option<&Vec<String>>,
        typehint_whitelist: Option<&Vec<String>>,
        resourcetype_whitelist: Option<&Vec<String>>,
        context: &C) -> Result<ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplResponse, ApiError>
    {
        info!("com_day_cq_wcm_foundation_security_impl_safer_sling_post_validator_impl({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, parameter_whitelist, parameter_whitelist_prefixes, binary_parameter_whitelist, modifier_whitelist, operation_whitelist, operation_whitelist_prefixes, typehint_whitelist, resourcetype_whitelist, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_wcm_mobile_core_impl_device_device_info_transformer_factory(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        device_info_transformer_enabled: Option<bool>,
        device_info_transformer_css_style: Option<String>,
        context: &C) -> Result<ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryResponse, ApiError>
    {
        info!("com_day_cq_wcm_mobile_core_impl_device_device_info_transformer_factory({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, device_info_transformer_enabled, device_info_transformer_css_style, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_wcm_mobile_core_impl_redirect_redirect_filter(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        redirect_enabled: Option<bool>,
        redirect_stats_enabled: Option<bool>,
        redirect_extensions: Option<&Vec<String>>,
        redirect_paths: Option<&Vec<String>>,
        context: &C) -> Result<ComDayCqWcmMobileCoreImplRedirectRedirectFilterResponse, ApiError>
    {
        info!("com_day_cq_wcm_mobile_core_impl_redirect_redirect_filter({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, redirect_enabled, redirect_stats_enabled, redirect_extensions, redirect_paths, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_wcm_msm_impl_actions_content_copy_action_factory(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        cq_wcm_msm_action_excludednodetypes: Option<&Vec<String>>,
        cq_wcm_msm_action_excludedparagraphitems: Option<&Vec<String>>,
        cq_wcm_msm_action_excludedprops: Option<&Vec<String>>,
        contentcopyaction_order_style: Option<String>,
        context: &C) -> Result<ComDayCqWcmMsmImplActionsContentCopyActionFactoryResponse, ApiError>
    {
        info!("com_day_cq_wcm_msm_impl_actions_content_copy_action_factory({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, cq_wcm_msm_action_excludednodetypes, cq_wcm_msm_action_excludedparagraphitems, cq_wcm_msm_action_excludedprops, contentcopyaction_order_style, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_wcm_msm_impl_actions_content_delete_action_factory(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        cq_wcm_msm_action_excludednodetypes: Option<&Vec<String>>,
        cq_wcm_msm_action_excludedparagraphitems: Option<&Vec<String>>,
        cq_wcm_msm_action_excludedprops: Option<&Vec<String>>,
        context: &C) -> Result<ComDayCqWcmMsmImplActionsContentDeleteActionFactoryResponse, ApiError>
    {
        info!("com_day_cq_wcm_msm_impl_actions_content_delete_action_factory({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, cq_wcm_msm_action_excludednodetypes, cq_wcm_msm_action_excludedparagraphitems, cq_wcm_msm_action_excludedprops, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_wcm_msm_impl_actions_content_update_action_factory(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        cq_wcm_msm_action_excludednodetypes: Option<&Vec<String>>,
        cq_wcm_msm_action_excludedparagraphitems: Option<&Vec<String>>,
        cq_wcm_msm_action_excludedprops: Option<&Vec<String>>,
        cq_wcm_msm_action_ignored_mixin: Option<&Vec<String>>,
        context: &C) -> Result<ComDayCqWcmMsmImplActionsContentUpdateActionFactoryResponse, ApiError>
    {
        info!("com_day_cq_wcm_msm_impl_actions_content_update_action_factory({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, cq_wcm_msm_action_excludednodetypes, cq_wcm_msm_action_excludedparagraphitems, cq_wcm_msm_action_excludedprops, cq_wcm_msm_action_ignored_mixin, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_wcm_msm_impl_actions_order_children_action_factory(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        cq_wcm_msm_action_excludednodetypes: Option<&Vec<String>>,
        cq_wcm_msm_action_excludedparagraphitems: Option<&Vec<String>>,
        cq_wcm_msm_action_excludedprops: Option<&Vec<String>>,
        context: &C) -> Result<ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryResponse, ApiError>
    {
        info!("com_day_cq_wcm_msm_impl_actions_order_children_action_factory({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, cq_wcm_msm_action_excludednodetypes, cq_wcm_msm_action_excludedparagraphitems, cq_wcm_msm_action_excludedprops, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_wcm_msm_impl_actions_page_move_action_factory(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        cq_wcm_msm_action_excludednodetypes: Option<&Vec<String>>,
        cq_wcm_msm_action_excludedparagraphitems: Option<&Vec<String>>,
        cq_wcm_msm_action_excludedprops: Option<&Vec<String>>,
        cq_wcm_msm_impl_actions_pagemove_prop_reference_update: Option<bool>,
        context: &C) -> Result<ComDayCqWcmMsmImplActionsPageMoveActionFactoryResponse, ApiError>
    {
        info!("com_day_cq_wcm_msm_impl_actions_page_move_action_factory({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, cq_wcm_msm_action_excludednodetypes, cq_wcm_msm_action_excludedparagraphitems, cq_wcm_msm_action_excludedprops, cq_wcm_msm_impl_actions_pagemove_prop_reference_update, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_wcm_msm_impl_actions_references_update_action_factory(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        cq_wcm_msm_action_excludednodetypes: Option<&Vec<String>>,
        cq_wcm_msm_action_excludedparagraphitems: Option<&Vec<String>>,
        cq_wcm_msm_action_excludedprops: Option<&Vec<String>>,
        cq_wcm_msm_impl_action_referencesupdate_prop_update_nested: Option<bool>,
        context: &C) -> Result<ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryResponse, ApiError>
    {
        info!("com_day_cq_wcm_msm_impl_actions_references_update_action_factory({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, cq_wcm_msm_action_excludednodetypes, cq_wcm_msm_action_excludedparagraphitems, cq_wcm_msm_action_excludedprops, cq_wcm_msm_impl_action_referencesupdate_prop_update_nested, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_wcm_msm_impl_actions_version_copy_action_factory(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        cq_wcm_msm_action_excludednodetypes: Option<&Vec<String>>,
        cq_wcm_msm_action_excludedparagraphitems: Option<&Vec<String>>,
        cq_wcm_msm_action_excludedprops: Option<&Vec<String>>,
        context: &C) -> Result<ComDayCqWcmMsmImplActionsVersionCopyActionFactoryResponse, ApiError>
    {
        info!("com_day_cq_wcm_msm_impl_actions_version_copy_action_factory({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, cq_wcm_msm_action_excludednodetypes, cq_wcm_msm_action_excludedparagraphitems, cq_wcm_msm_action_excludedprops, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_wcm_msm_impl_live_relationship_manager_impl(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        liverelationshipmgr_relationsconfig_default: Option<String>,
        context: &C) -> Result<ComDayCqWcmMsmImplLiveRelationshipManagerImplResponse, ApiError>
    {
        info!("com_day_cq_wcm_msm_impl_live_relationship_manager_impl({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, liverelationshipmgr_relationsconfig_default, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_wcm_msm_impl_rollout_manager_impl(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        event_filter: Option<String>,
        rolloutmgr_excludedprops_default: Option<&Vec<String>>,
        rolloutmgr_excludedparagraphprops_default: Option<&Vec<String>>,
        rolloutmgr_excludednodetypes_default: Option<&Vec<String>>,
        rolloutmgr_threadpool_maxsize: Option<i32>,
        rolloutmgr_threadpool_maxshutdowntime: Option<i32>,
        rolloutmgr_threadpool_priority: Option<String>,
        rolloutmgr_commit_size: Option<i32>,
        rolloutmgr_conflicthandling_enabled: Option<bool>,
        context: &C) -> Result<ComDayCqWcmMsmImplRolloutManagerImplResponse, ApiError>
    {
        info!("com_day_cq_wcm_msm_impl_rollout_manager_impl({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, event_filter, rolloutmgr_excludedprops_default, rolloutmgr_excludedparagraphprops_default, rolloutmgr_excludednodetypes_default, rolloutmgr_threadpool_maxsize, rolloutmgr_threadpool_maxshutdowntime, rolloutmgr_threadpool_priority, rolloutmgr_commit_size, rolloutmgr_conflicthandling_enabled, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_wcm_msm_impl_servlets_audit_log_servlet(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        auditlogservlet_default_events_count: Option<i32>,
        auditlogservlet_default_path: Option<String>,
        context: &C) -> Result<ComDayCqWcmMsmImplServletsAuditLogServletResponse, ApiError>
    {
        info!("com_day_cq_wcm_msm_impl_servlets_audit_log_servlet({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, auditlogservlet_default_events_count, auditlogservlet_default_path, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_wcm_notification_email_impl_email_channel(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        email_from: Option<String>,
        context: &C) -> Result<ComDayCqWcmNotificationEmailImplEmailChannelResponse, ApiError>
    {
        info!("com_day_cq_wcm_notification_email_impl_email_channel({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, email_from, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_wcm_notification_impl_notification_manager_impl(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        event_topics: Option<&Vec<String>>,
        context: &C) -> Result<ComDayCqWcmNotificationImplNotificationManagerImplResponse, ApiError>
    {
        info!("com_day_cq_wcm_notification_impl_notification_manager_impl({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, event_topics, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_wcm_scripting_impl_bvp_manager(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        com_day_cq_wcm_scripting_bvp_script_engines: Option<&Vec<String>>,
        context: &C) -> Result<ComDayCqWcmScriptingImplBvpManagerResponse, ApiError>
    {
        info!("com_day_cq_wcm_scripting_impl_bvp_manager({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, com_day_cq_wcm_scripting_bvp_script_engines, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_wcm_undo_undo_config(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        cq_wcm_undo_enabled: Option<bool>,
        cq_wcm_undo_path: Option<String>,
        cq_wcm_undo_validity: Option<i32>,
        cq_wcm_undo_steps: Option<i32>,
        cq_wcm_undo_persistence: Option<String>,
        cq_wcm_undo_persistence_mode: Option<bool>,
        cq_wcm_undo_markermode: Option<String>,
        cq_wcm_undo_whitelist: Option<&Vec<String>>,
        cq_wcm_undo_blacklist: Option<&Vec<String>>,
        context: &C) -> Result<ComDayCqWcmUndoUndoConfigResponse, ApiError>
    {
        info!("com_day_cq_wcm_undo_undo_config({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, cq_wcm_undo_enabled, cq_wcm_undo_path, cq_wcm_undo_validity, cq_wcm_undo_steps, cq_wcm_undo_persistence, cq_wcm_undo_persistence_mode, cq_wcm_undo_markermode, cq_wcm_undo_whitelist, cq_wcm_undo_blacklist, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_wcm_webservicesupport_impl_replication_event_listener(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        flush_agents: Option<&Vec<String>>,
        context: &C) -> Result<ComDayCqWcmWebservicesupportImplReplicationEventListenerResponse, ApiError>
    {
        info!("com_day_cq_wcm_webservicesupport_impl_replication_event_listener({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, flush_agents, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_wcm_workflow_impl_wcm_workflow_service_impl(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        event_filter: Option<String>,
        min_thread_pool_size: Option<i32>,
        max_thread_pool_size: Option<i32>,
        cq_wcm_workflow_terminate_on_activate: Option<bool>,
        cq_wcm_worklfow_terminate_exclusion_list: Option<&Vec<String>>,
        context: &C) -> Result<ComDayCqWcmWorkflowImplWcmWorkflowServiceImplResponse, ApiError>
    {
        info!("com_day_cq_wcm_workflow_impl_wcm_workflow_service_impl({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, event_filter, min_thread_pool_size, max_thread_pool_size, cq_wcm_workflow_terminate_on_activate, cq_wcm_worklfow_terminate_exclusion_list, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_wcm_workflow_impl_workflow_package_info_provider(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        workflowpackageinfoprovider_filter: Option<&Vec<String>>,
        workflowpackageinfoprovider_filter_rootpath: Option<String>,
        context: &C) -> Result<ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderResponse, ApiError>
    {
        info!("com_day_cq_wcm_workflow_impl_workflow_package_info_provider({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, workflowpackageinfoprovider_filter, workflowpackageinfoprovider_filter_rootpath, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_widget_impl_html_library_manager_impl(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        htmllibmanager_clientmanager: Option<String>,
        htmllibmanager_debug: Option<bool>,
        htmllibmanager_debug_console: Option<bool>,
        htmllibmanager_debug_init_js: Option<String>,
        htmllibmanager_defaultthemename: Option<String>,
        htmllibmanager_defaultuserthemename: Option<String>,
        htmllibmanager_firebuglite_path: Option<String>,
        htmllibmanager_force_cq_url_info: Option<bool>,
        htmllibmanager_gzip: Option<bool>,
        htmllibmanager_maxage: Option<i32>,
        htmllibmanager_max_data_uri_size: Option<i32>,
        htmllibmanager_minify: Option<bool>,
        htmllibmanager_path_list: Option<&Vec<String>>,
        htmllibmanager_timing: Option<bool>,
        context: &C) -> Result<ComDayCqWidgetImplHtmlLibraryManagerImplResponse, ApiError>
    {
        info!("com_day_cq_widget_impl_html_library_manager_impl({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, htmllibmanager_clientmanager, htmllibmanager_debug, htmllibmanager_debug_console, htmllibmanager_debug_init_js, htmllibmanager_defaultthemename, htmllibmanager_defaultuserthemename, htmllibmanager_firebuglite_path, htmllibmanager_force_cq_url_info, htmllibmanager_gzip, htmllibmanager_maxage, htmllibmanager_max_data_uri_size, htmllibmanager_minify, htmllibmanager_path_list, htmllibmanager_timing, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_widget_impl_widget_extension_provider_impl(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        extendable_widgets: Option<&Vec<String>>,
        widgetextensionprovider_debug: Option<bool>,
        context: &C) -> Result<ComDayCqWidgetImplWidgetExtensionProviderImplResponse, ApiError>
    {
        info!("com_day_cq_widget_impl_widget_extension_provider_impl({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, extendable_widgets, widgetextensionprovider_debug, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_workflow_impl_email_e_mail_notification_service(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        from_address: Option<String>,
        host_prefix: Option<String>,
        notify_onabort: Option<bool>,
        notify_oncomplete: Option<bool>,
        notify_oncontainercomplete: Option<bool>,
        notify_useronly: Option<bool>,
        context: &C) -> Result<ComDayCqWorkflowImplEmailEMailNotificationServiceResponse, ApiError>
    {
        info!("com_day_cq_workflow_impl_email_e_mail_notification_service({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, from_address, host_prefix, notify_onabort, notify_oncomplete, notify_oncontainercomplete, notify_useronly, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_cq_workflow_impl_email_task_e_mail_notification_service(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        notify_onupdate: Option<bool>,
        notify_oncomplete: Option<bool>,
        context: &C) -> Result<ComDayCqWorkflowImplEmailTaskEMailNotificationServiceResponse, ApiError>
    {
        info!("com_day_cq_workflow_impl_email_task_e_mail_notification_service({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, notify_onupdate, notify_oncomplete, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_crx_security_token_impl_impl_token_authentication_handler(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        path: Option<String>,
        token_required_attr: Option<String>,
        token_alternate_url: Option<String>,
        token_encapsulated: Option<bool>,
        skip_token_refresh: Option<&Vec<String>>,
        context: &C) -> Result<ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerResponse, ApiError>
    {
        info!("com_day_crx_security_token_impl_impl_token_authentication_handler({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, path, token_required_attr, token_alternate_url, token_encapsulated, skip_token_refresh, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn com_day_crx_security_token_impl_token_cleanup_task(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        enable_token_cleanup_task: Option<bool>,
        scheduler_expression: Option<String>,
        batch_size: Option<i32>,
        context: &C) -> Result<ComDayCrxSecurityTokenImplTokenCleanupTaskResponse, ApiError>
    {
        info!("com_day_crx_security_token_impl_token_cleanup_task({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, enable_token_cleanup_task, scheduler_expression, batch_size, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn guide_localization_service(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        supported_locales: Option<&Vec<String>>,
        localizable_properties: Option<&Vec<String>>,
        context: &C) -> Result<GuideLocalizationServiceResponse, ApiError>
    {
        info!("guide_localization_service({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, supported_locales, localizable_properties, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn messaging_user_component_factory(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        priority: Option<i32>,
        context: &C) -> Result<MessagingUserComponentFactoryResponse, ApiError>
    {
        info!("messaging_user_component_factory({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, priority, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn org_apache_aries_jmx_framework_state_config(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        attribute_change_notification_enabled: Option<bool>,
        context: &C) -> Result<OrgApacheAriesJmxFrameworkStateConfigResponse, ApiError>
    {
        info!("org_apache_aries_jmx_framework_state_config({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, attribute_change_notification_enabled, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn org_apache_felix_eventadmin_impl_event_admin(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        org_apache_felix_eventadmin_thread_pool_size: Option<i32>,
        org_apache_felix_eventadmin_async_to_sync_thread_ratio: Option<f64>,
        org_apache_felix_eventadmin_timeout: Option<i32>,
        org_apache_felix_eventadmin_require_topic: Option<bool>,
        org_apache_felix_eventadmin_ignore_timeout: Option<&Vec<String>>,
        org_apache_felix_eventadmin_ignore_topic: Option<&Vec<String>>,
        context: &C) -> Result<OrgApacheFelixEventadminImplEventAdminResponse, ApiError>
    {
        info!("org_apache_felix_eventadmin_impl_event_admin({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, org_apache_felix_eventadmin_thread_pool_size, org_apache_felix_eventadmin_async_to_sync_thread_ratio, org_apache_felix_eventadmin_timeout, org_apache_felix_eventadmin_require_topic, org_apache_felix_eventadmin_ignore_timeout, org_apache_felix_eventadmin_ignore_topic, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn org_apache_felix_http(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        org_apache_felix_http_host: Option<String>,
        org_apache_felix_http_enable: Option<bool>,
        org_osgi_service_http_port: Option<i32>,
        org_apache_felix_http_timeout: Option<i32>,
        org_apache_felix_https_enable: Option<bool>,
        org_osgi_service_http_port_secure: Option<i32>,
        org_apache_felix_https_keystore: Option<String>,
        org_apache_felix_https_keystore_password: Option<String>,
        org_apache_felix_https_keystore_key_password: Option<String>,
        org_apache_felix_https_truststore: Option<String>,
        org_apache_felix_https_truststore_password: Option<String>,
        org_apache_felix_https_clientcertificate: Option<String>,
        org_apache_felix_http_context_path: Option<String>,
        org_apache_felix_http_mbeans: Option<bool>,
        org_apache_felix_http_session_timeout: Option<i32>,
        org_apache_felix_http_jetty_threadpool_max: Option<i32>,
        org_apache_felix_http_jetty_acceptors: Option<i32>,
        org_apache_felix_http_jetty_selectors: Option<i32>,
        org_apache_felix_http_jetty_header_buffer_size: Option<i32>,
        org_apache_felix_http_jetty_request_buffer_size: Option<i32>,
        org_apache_felix_http_jetty_response_buffer_size: Option<i32>,
        org_apache_felix_http_jetty_max_form_size: Option<i32>,
        org_apache_felix_http_path_exclusions: Option<&Vec<String>>,
        org_apache_felix_https_jetty_ciphersuites_excluded: Option<&Vec<String>>,
        org_apache_felix_https_jetty_ciphersuites_included: Option<&Vec<String>>,
        org_apache_felix_http_jetty_send_server_header: Option<bool>,
        org_apache_felix_https_jetty_protocols_included: Option<&Vec<String>>,
        org_apache_felix_https_jetty_protocols_excluded: Option<&Vec<String>>,
        org_apache_felix_proxy_load_balancer_connection_enable: Option<bool>,
        org_apache_felix_https_jetty_renegotiate_allowed: Option<bool>,
        org_apache_felix_https_jetty_session_cookie_http_only: Option<bool>,
        org_apache_felix_https_jetty_session_cookie_secure: Option<bool>,
        org_eclipse_jetty_servlet_session_id_path_parameter_name: Option<String>,
        org_eclipse_jetty_servlet_checking_remote_session_id_encoding: Option<bool>,
        org_eclipse_jetty_servlet_session_cookie: Option<String>,
        org_eclipse_jetty_servlet_session_domain: Option<String>,
        org_eclipse_jetty_servlet_session_path: Option<String>,
        org_eclipse_jetty_servlet_max_age: Option<i32>,
        org_apache_felix_http_name: Option<String>,
        org_apache_felix_jetty_gziphandler_enable: Option<bool>,
        org_apache_felix_jetty_gzip_min_gzip_size: Option<i32>,
        org_apache_felix_jetty_gzip_compression_level: Option<i32>,
        org_apache_felix_jetty_gzip_inflate_buffer_size: Option<i32>,
        org_apache_felix_jetty_gzip_sync_flush: Option<bool>,
        org_apache_felix_jetty_gzip_excluded_user_agents: Option<&Vec<String>>,
        org_apache_felix_jetty_gzip_included_methods: Option<&Vec<String>>,
        org_apache_felix_jetty_gzip_excluded_methods: Option<&Vec<String>>,
        org_apache_felix_jetty_gzip_included_paths: Option<&Vec<String>>,
        org_apache_felix_jetty_gzip_excluded_paths: Option<&Vec<String>>,
        org_apache_felix_jetty_gzip_included_mime_types: Option<&Vec<String>>,
        org_apache_felix_jetty_gzip_excluded_mime_types: Option<&Vec<String>>,
        org_apache_felix_http_session_invalidate: Option<bool>,
        org_apache_felix_http_session_uniqueid: Option<bool>,
        context: &C) -> Result<OrgApacheFelixHttpResponse, ApiError>
    {
        info!("org_apache_felix_http({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, org_apache_felix_http_host, org_apache_felix_http_enable, org_osgi_service_http_port, org_apache_felix_http_timeout, org_apache_felix_https_enable, org_osgi_service_http_port_secure, org_apache_felix_https_keystore, org_apache_felix_https_keystore_password, org_apache_felix_https_keystore_key_password, org_apache_felix_https_truststore, org_apache_felix_https_truststore_password, org_apache_felix_https_clientcertificate, org_apache_felix_http_context_path, org_apache_felix_http_mbeans, org_apache_felix_http_session_timeout, org_apache_felix_http_jetty_threadpool_max, org_apache_felix_http_jetty_acceptors, org_apache_felix_http_jetty_selectors, org_apache_felix_http_jetty_header_buffer_size, org_apache_felix_http_jetty_request_buffer_size, org_apache_felix_http_jetty_response_buffer_size, org_apache_felix_http_jetty_max_form_size, org_apache_felix_http_path_exclusions, org_apache_felix_https_jetty_ciphersuites_excluded, org_apache_felix_https_jetty_ciphersuites_included, org_apache_felix_http_jetty_send_server_header, org_apache_felix_https_jetty_protocols_included, org_apache_felix_https_jetty_protocols_excluded, org_apache_felix_proxy_load_balancer_connection_enable, org_apache_felix_https_jetty_renegotiate_allowed, org_apache_felix_https_jetty_session_cookie_http_only, org_apache_felix_https_jetty_session_cookie_secure, org_eclipse_jetty_servlet_session_id_path_parameter_name, org_eclipse_jetty_servlet_checking_remote_session_id_encoding, org_eclipse_jetty_servlet_session_cookie, org_eclipse_jetty_servlet_session_domain, org_eclipse_jetty_servlet_session_path, org_eclipse_jetty_servlet_max_age, org_apache_felix_http_name, org_apache_felix_jetty_gziphandler_enable, org_apache_felix_jetty_gzip_min_gzip_size, org_apache_felix_jetty_gzip_compression_level, org_apache_felix_jetty_gzip_inflate_buffer_size, org_apache_felix_jetty_gzip_sync_flush, org_apache_felix_jetty_gzip_excluded_user_agents, org_apache_felix_jetty_gzip_included_methods, org_apache_felix_jetty_gzip_excluded_methods, org_apache_felix_jetty_gzip_included_paths, org_apache_felix_jetty_gzip_excluded_paths, org_apache_felix_jetty_gzip_included_mime_types, org_apache_felix_jetty_gzip_excluded_mime_types, org_apache_felix_http_session_invalidate, org_apache_felix_http_session_uniqueid, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn org_apache_felix_http_sslfilter_ssl_filter(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        ssl_forward_header: Option<String>,
        ssl_forward_value: Option<String>,
        ssl_forward_cert_header: Option<String>,
        rewrite_absolute_urls: Option<bool>,
        context: &C) -> Result<OrgApacheFelixHttpSslfilterSslFilterResponse, ApiError>
    {
        info!("org_apache_felix_http_sslfilter_ssl_filter({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, ssl_forward_header, ssl_forward_value, ssl_forward_cert_header, rewrite_absolute_urls, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn org_apache_felix_jaas_configuration_factory(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        jaas_control_flag: Option<String>,
        jaas_ranking: Option<i32>,
        jaas_realm_name: Option<String>,
        jaas_classname: Option<String>,
        jaas_options: Option<&Vec<String>>,
        context: &C) -> Result<OrgApacheFelixJaasConfigurationFactoryResponse, ApiError>
    {
        info!("org_apache_felix_jaas_configuration_factory({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, jaas_control_flag, jaas_ranking, jaas_realm_name, jaas_classname, jaas_options, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn org_apache_felix_jaas_configuration_spi(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        jaas_default_realm_name: Option<String>,
        jaas_config_provider_name: Option<String>,
        jaas_global_config_policy: Option<String>,
        context: &C) -> Result<OrgApacheFelixJaasConfigurationSpiResponse, ApiError>
    {
        info!("org_apache_felix_jaas_configuration_spi({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, jaas_default_realm_name, jaas_config_provider_name, jaas_global_config_policy, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn org_apache_felix_scr_scr_service(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        ds_loglevel: Option<i32>,
        ds_factory_enabled: Option<bool>,
        ds_delayed_keep_instances: Option<bool>,
        ds_lock_timeout_milliseconds: Option<i32>,
        ds_stop_timeout_milliseconds: Option<i32>,
        ds_global_extender: Option<bool>,
        context: &C) -> Result<OrgApacheFelixScrScrServiceResponse, ApiError>
    {
        info!("org_apache_felix_scr_scr_service({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, ds_loglevel, ds_factory_enabled, ds_delayed_keep_instances, ds_lock_timeout_milliseconds, ds_stop_timeout_milliseconds, ds_global_extender, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn org_apache_felix_systemready_impl_components_check(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        components_list: Option<&Vec<String>>,
        r#type: Option<String>,
        context: &C) -> Result<OrgApacheFelixSystemreadyImplComponentsCheckResponse, ApiError>
    {
        info!("org_apache_felix_systemready_impl_components_check({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, components_list, r#type, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn org_apache_felix_systemready_impl_framework_start_check(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        timeout: Option<i32>,
        target_start_level: Option<i32>,
        target_start_level_prop_name: Option<String>,
        r#type: Option<String>,
        context: &C) -> Result<OrgApacheFelixSystemreadyImplFrameworkStartCheckResponse, ApiError>
    {
        info!("org_apache_felix_systemready_impl_framework_start_check({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, timeout, target_start_level, target_start_level_prop_name, r#type, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn org_apache_felix_systemready_impl_services_check(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        services_list: Option<&Vec<String>>,
        r#type: Option<String>,
        context: &C) -> Result<OrgApacheFelixSystemreadyImplServicesCheckResponse, ApiError>
    {
        info!("org_apache_felix_systemready_impl_services_check({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, services_list, r#type, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn org_apache_felix_systemready_impl_servlet_system_alive_servlet(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        osgi_http_whiteboard_servlet_pattern: Option<String>,
        osgi_http_whiteboard_context_select: Option<String>,
        context: &C) -> Result<OrgApacheFelixSystemreadyImplServletSystemAliveServletResponse, ApiError>
    {
        info!("org_apache_felix_systemready_impl_servlet_system_alive_servlet({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, osgi_http_whiteboard_servlet_pattern, osgi_http_whiteboard_context_select, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn org_apache_felix_systemready_impl_servlet_system_ready_servlet(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        osgi_http_whiteboard_servlet_pattern: Option<String>,
        osgi_http_whiteboard_context_select: Option<String>,
        context: &C) -> Result<OrgApacheFelixSystemreadyImplServletSystemReadyServletResponse, ApiError>
    {
        info!("org_apache_felix_systemready_impl_servlet_system_ready_servlet({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, osgi_http_whiteboard_servlet_pattern, osgi_http_whiteboard_context_select, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn org_apache_felix_systemready_system_ready_monitor(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        poll_interval: Option<i32>,
        context: &C) -> Result<OrgApacheFelixSystemreadySystemReadyMonitorResponse, ApiError>
    {
        info!("org_apache_felix_systemready_system_ready_monitor({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, poll_interval, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn org_apache_felix_webconsole_internal_servlet_osgi_manager(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        manager_root: Option<String>,
        http_service_filter: Option<String>,
        default_render: Option<String>,
        realm: Option<String>,
        username: Option<String>,
        password: Option<String>,
        category: Option<String>,
        locale: Option<String>,
        loglevel: Option<i32>,
        plugins: Option<String>,
        context: &C) -> Result<OrgApacheFelixWebconsoleInternalServletOsgiManagerResponse, ApiError>
    {
        info!("org_apache_felix_webconsole_internal_servlet_osgi_manager({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, manager_root, http_service_filter, default_render, realm, username, password, category, locale, loglevel, plugins, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn org_apache_felix_webconsole_plugins_event_internal_plugin_servlet(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        max_size: Option<i32>,
        context: &C) -> Result<OrgApacheFelixWebconsolePluginsEventInternalPluginServletResponse, ApiError>
    {
        info!("org_apache_felix_webconsole_plugins_event_internal_plugin_servlet({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, max_size, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn org_apache_felix_webconsole_plugins_memoryusage_internal_memory_usage_co(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        felix_memoryusage_dump_threshold: Option<i32>,
        felix_memoryusage_dump_interval: Option<i32>,
        felix_memoryusage_dump_location: Option<String>,
        context: &C) -> Result<OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoResponse, ApiError>
    {
        info!("org_apache_felix_webconsole_plugins_memoryusage_internal_memory_usage_co({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, felix_memoryusage_dump_threshold, felix_memoryusage_dump_interval, felix_memoryusage_dump_location, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn org_apache_http_proxyconfigurator(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        proxy_enabled: Option<bool>,
        proxy_host: Option<String>,
        proxy_port: Option<i32>,
        proxy_user: Option<String>,
        proxy_password: Option<String>,
        proxy_exceptions: Option<&Vec<String>>,
        context: &C) -> Result<OrgApacheHttpProxyconfiguratorResponse, ApiError>
    {
        info!("org_apache_http_proxyconfigurator({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, proxy_enabled, proxy_host, proxy_port, proxy_user, proxy_password, proxy_exceptions, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn org_apache_jackrabbit_oak_plugins_blob_datastore_data_store_text_provider(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        dir: Option<String>,
        context: &C) -> Result<OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderResponse, ApiError>
    {
        info!("org_apache_jackrabbit_oak_plugins_blob_datastore_data_store_text_provider({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, dir, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn org_apache_jackrabbit_oak_plugins_blob_datastore_file_data_store(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        path: Option<String>,
        context: &C) -> Result<OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreResponse, ApiError>
    {
        info!("org_apache_jackrabbit_oak_plugins_blob_datastore_file_data_store({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, path, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn org_apache_jackrabbit_oak_plugins_document_document_node_store_service(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        mongouri: Option<String>,
        db: Option<String>,
        socket_keep_alive: Option<bool>,
        cache: Option<i32>,
        node_cache_percentage: Option<i32>,
        prev_doc_cache_percentage: Option<i32>,
        children_cache_percentage: Option<i32>,
        diff_cache_percentage: Option<i32>,
        cache_segment_count: Option<i32>,
        cache_stack_move_distance: Option<i32>,
        blob_cache_size: Option<i32>,
        persistent_cache: Option<String>,
        journal_cache: Option<String>,
        custom_blob_store: Option<bool>,
        journal_gc_interval: Option<i32>,
        journal_gc_max_age: Option<i32>,
        prefetch_external_changes: Option<bool>,
        role: Option<String>,
        version_gc_max_age_in_secs: Option<i32>,
        version_gc_expression: Option<String>,
        version_gc_time_limit_in_secs: Option<i32>,
        blob_gc_max_age_in_secs: Option<i32>,
        blob_track_snapshot_interval_in_secs: Option<i32>,
        repository_home: Option<String>,
        max_replication_lag_in_secs: Option<i32>,
        document_store_type: Option<String>,
        bundling_disabled: Option<bool>,
        update_limit: Option<i32>,
        persistent_cache_includes: Option<&Vec<String>>,
        lease_check_mode: Option<String>,
        context: &C) -> Result<OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceResponse, ApiError>
    {
        info!("org_apache_jackrabbit_oak_plugins_document_document_node_store_service({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, mongouri, db, socket_keep_alive, cache, node_cache_percentage, prev_doc_cache_percentage, children_cache_percentage, diff_cache_percentage, cache_segment_count, cache_stack_move_distance, blob_cache_size, persistent_cache, journal_cache, custom_blob_store, journal_gc_interval, journal_gc_max_age, prefetch_external_changes, role, version_gc_max_age_in_secs, version_gc_expression, version_gc_time_limit_in_secs, blob_gc_max_age_in_secs, blob_track_snapshot_interval_in_secs, repository_home, max_replication_lag_in_secs, document_store_type, bundling_disabled, update_limit, persistent_cache_includes, lease_check_mode, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn org_apache_jackrabbit_oak_plugins_document_document_node_store_service_pre(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        persistent_cache_includes: Option<&Vec<String>>,
        context: &C) -> Result<OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreResponse, ApiError>
    {
        info!("org_apache_jackrabbit_oak_plugins_document_document_node_store_service_pre({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, persistent_cache_includes, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn org_apache_jackrabbit_oak_plugins_document_secondary_secondary_store_cac(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        included_paths: Option<&Vec<String>>,
        enable_async_observer: Option<bool>,
        observer_queue_size: Option<i32>,
        context: &C) -> Result<OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacResponse, ApiError>
    {
        info!("org_apache_jackrabbit_oak_plugins_document_secondary_secondary_store_cac({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, included_paths, enable_async_observer, observer_queue_size, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn org_apache_jackrabbit_oak_plugins_index_async_indexer_service(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        async_configs: Option<&Vec<String>>,
        lease_time_out_minutes: Option<i32>,
        failing_index_timeout_seconds: Option<i32>,
        error_warn_interval_seconds: Option<i32>,
        context: &C) -> Result<OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceResponse, ApiError>
    {
        info!("org_apache_jackrabbit_oak_plugins_index_async_indexer_service({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, async_configs, lease_time_out_minutes, failing_index_timeout_seconds, error_warn_interval_seconds, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        disabled: Option<bool>,
        debug: Option<bool>,
        local_index_dir: Option<String>,
        enable_open_index_async: Option<bool>,
        thread_pool_size: Option<i32>,
        prefetch_index_files: Option<bool>,
        extracted_text_cache_size_in_mb: Option<i32>,
        extracted_text_cache_expiry_in_secs: Option<i32>,
        always_use_pre_extracted_cache: Option<bool>,
        boolean_clause_limit: Option<i32>,
        enable_hybrid_indexing: Option<bool>,
        hybrid_queue_size: Option<i32>,
        disable_stored_index_definition: Option<bool>,
        deleted_blobs_collection_enabled: Option<bool>,
        prop_index_cleaner_interval_in_secs: Option<i32>,
        enable_single_blob_index_files: Option<bool>,
        context: &C) -> Result<OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServResponse, ApiError>
    {
        info!("org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, disabled, debug, local_index_dir, enable_open_index_async, thread_pool_size, prefetch_index_files, extracted_text_cache_size_in_mb, extracted_text_cache_expiry_in_secs, always_use_pre_extracted_cache, boolean_clause_limit, enable_hybrid_indexing, hybrid_queue_size, disable_stored_index_definition, deleted_blobs_collection_enabled, prop_index_cleaner_interval_in_secs, enable_single_blob_index_files, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn org_apache_jackrabbit_oak_plugins_index_solr_osgi_embedded_solr_server_co(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        solr_home_path: Option<String>,
        solr_core_name: Option<String>,
        context: &C) -> Result<OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoResponse, ApiError>
    {
        info!("org_apache_jackrabbit_oak_plugins_index_solr_osgi_embedded_solr_server_co({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, solr_home_path, solr_core_name, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn org_apache_jackrabbit_oak_plugins_index_solr_osgi_node_state_solr_servers(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        enabled: Option<bool>,
        context: &C) -> Result<OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersResponse, ApiError>
    {
        info!("org_apache_jackrabbit_oak_plugins_index_solr_osgi_node_state_solr_servers({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, enabled, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        path_desc_field: Option<String>,
        path_child_field: Option<String>,
        path_parent_field: Option<String>,
        path_exact_field: Option<String>,
        catch_all_field: Option<String>,
        collapsed_path_field: Option<String>,
        path_depth_field: Option<String>,
        commit_policy: Option<String>,
        rows: Option<i32>,
        path_restrictions: Option<bool>,
        property_restrictions: Option<bool>,
        primarytypes_restrictions: Option<bool>,
        ignored_properties: Option<&Vec<String>>,
        used_properties: Option<&Vec<String>>,
        type_mappings: Option<&Vec<String>>,
        property_mappings: Option<&Vec<String>>,
        collapse_jcrcontent_nodes: Option<bool>,
        context: &C) -> Result<OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationResponse, ApiError>
    {
        info!("org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, path_desc_field, path_child_field, path_parent_field, path_exact_field, catch_all_field, collapsed_path_field, path_depth_field, commit_policy, rows, path_restrictions, property_restrictions, primarytypes_restrictions, ignored_properties, used_properties, type_mappings, property_mappings, collapse_jcrcontent_nodes, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_server_conf(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        solr_http_url: Option<String>,
        solr_zk_host: Option<String>,
        solr_collection: Option<String>,
        solr_socket_timeout: Option<i32>,
        solr_connection_timeout: Option<i32>,
        solr_shards_no: Option<i32>,
        solr_replication_factor: Option<i32>,
        solr_conf_dir: Option<String>,
        context: &C) -> Result<OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfResponse, ApiError>
    {
        info!("org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_server_conf({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, solr_http_url, solr_zk_host, solr_collection, solr_socket_timeout, solr_connection_timeout, solr_shards_no, solr_replication_factor, solr_conf_dir, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn org_apache_jackrabbit_oak_plugins_index_solr_osgi_solr_query_index_provid(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        query_aggregation: Option<bool>,
        context: &C) -> Result<OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidResponse, ApiError>
    {
        info!("org_apache_jackrabbit_oak_plugins_index_solr_osgi_solr_query_index_provid({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, query_aggregation, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn org_apache_jackrabbit_oak_plugins_index_solr_osgi_solr_server_provider_se(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        server_type: Option<String>,
        context: &C) -> Result<OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeResponse, ApiError>
    {
        info!("org_apache_jackrabbit_oak_plugins_index_solr_osgi_solr_server_provider_se({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, server_type, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn org_apache_jackrabbit_oak_plugins_metric_statistics_provider_factory(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        provider_type: Option<String>,
        context: &C) -> Result<OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryResponse, ApiError>
    {
        info!("org_apache_jackrabbit_oak_plugins_metric_statistics_provider_factory({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, provider_type, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn org_apache_jackrabbit_oak_plugins_observation_change_collector_provider(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        max_items: Option<i32>,
        max_path_depth: Option<i32>,
        enabled: Option<bool>,
        context: &C) -> Result<OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderResponse, ApiError>
    {
        info!("org_apache_jackrabbit_oak_plugins_observation_change_collector_provider({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, max_items, max_path_depth, enabled, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn org_apache_jackrabbit_oak_query_query_engine_settings_service(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        query_limit_in_memory: Option<i32>,
        query_limit_reads: Option<i32>,
        query_fail_traversal: Option<bool>,
        fast_query_size: Option<bool>,
        context: &C) -> Result<OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceResponse, ApiError>
    {
        info!("org_apache_jackrabbit_oak_query_query_engine_settings_service({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, query_limit_in_memory, query_limit_reads, query_fail_traversal, fast_query_size, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn org_apache_jackrabbit_oak_security_authentication_authentication_config(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        org_apache_jackrabbit_oak_authentication_app_name: Option<String>,
        org_apache_jackrabbit_oak_authentication_config_spi_name: Option<String>,
        context: &C) -> Result<OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigResponse, ApiError>
    {
        info!("org_apache_jackrabbit_oak_security_authentication_authentication_config({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, org_apache_jackrabbit_oak_authentication_app_name, org_apache_jackrabbit_oak_authentication_config_spi_name, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        provider_name: Option<String>,
        host_name: Option<String>,
        host_port: Option<i32>,
        host_ssl: Option<bool>,
        host_tls: Option<bool>,
        host_no_cert_check: Option<bool>,
        bind_dn: Option<String>,
        bind_password: Option<String>,
        search_timeout: Option<String>,
        admin_pool_max_active: Option<i32>,
        admin_pool_lookup_on_validate: Option<bool>,
        user_pool_max_active: Option<i32>,
        user_pool_lookup_on_validate: Option<bool>,
        user_base_dn: Option<String>,
        user_objectclass: Option<&Vec<String>>,
        user_id_attribute: Option<String>,
        user_extra_filter: Option<String>,
        user_make_dn_path: Option<bool>,
        group_base_dn: Option<String>,
        group_objectclass: Option<&Vec<String>>,
        group_name_attribute: Option<String>,
        group_extra_filter: Option<String>,
        group_make_dn_path: Option<bool>,
        group_member_attribute: Option<String>,
        use_uid_for_ext_id: Option<bool>,
        customattributes: Option<&Vec<String>>,
        context: &C) -> Result<OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiResponse, ApiError>
    {
        info!("org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, provider_name, host_name, host_port, host_ssl, host_tls, host_no_cert_check, bind_dn, bind_password, search_timeout, admin_pool_max_active, admin_pool_lookup_on_validate, user_pool_max_active, user_pool_lookup_on_validate, user_base_dn, user_objectclass, user_id_attribute, user_extra_filter, user_make_dn_path, group_base_dn, group_objectclass, group_name_attribute, group_extra_filter, group_make_dn_path, group_member_attribute, use_uid_for_ext_id, customattributes, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn org_apache_jackrabbit_oak_security_authentication_token_token_configura(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        token_expiration: Option<String>,
        token_length: Option<String>,
        token_refresh: Option<bool>,
        token_cleanup_threshold: Option<i32>,
        password_hash_algorithm: Option<String>,
        password_hash_iterations: Option<i32>,
        password_salt_size: Option<i32>,
        context: &C) -> Result<OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraResponse, ApiError>
    {
        info!("org_apache_jackrabbit_oak_security_authentication_token_token_configura({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, token_expiration, token_length, token_refresh, token_cleanup_threshold, password_hash_algorithm, password_hash_iterations, password_salt_size, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn org_apache_jackrabbit_oak_security_authorization_authorization_configur(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        permissions_jr2: Option<String>,
        import_behavior: Option<String>,
        read_paths: Option<&Vec<String>>,
        administrative_principals: Option<&Vec<String>>,
        configuration_ranking: Option<i32>,
        context: &C) -> Result<OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurResponse, ApiError>
    {
        info!("org_apache_jackrabbit_oak_security_authorization_authorization_configur({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, permissions_jr2, import_behavior, read_paths, administrative_principals, configuration_ranking, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn org_apache_jackrabbit_oak_security_internal_security_provider_registrati(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        required_service_pids: Option<&Vec<String>>,
        authorization_composition_type: Option<String>,
        context: &C) -> Result<OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiResponse, ApiError>
    {
        info!("org_apache_jackrabbit_oak_security_internal_security_provider_registrati({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, required_service_pids, authorization_composition_type, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn org_apache_jackrabbit_oak_security_user_random_authorizable_node_name(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        length: Option<i32>,
        context: &C) -> Result<OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameResponse, ApiError>
    {
        info!("org_apache_jackrabbit_oak_security_user_random_authorizable_node_name({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, length, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn org_apache_jackrabbit_oak_security_user_user_configuration_impl(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        users_path: Option<String>,
        groups_path: Option<String>,
        system_relative_path: Option<String>,
        default_depth: Option<i32>,
        import_behavior: Option<String>,
        password_hash_algorithm: Option<String>,
        password_hash_iterations: Option<i32>,
        password_salt_size: Option<i32>,
        omit_admin_pw: Option<bool>,
        support_auto_save: Option<bool>,
        password_max_age: Option<i32>,
        initial_password_change: Option<bool>,
        password_history_size: Option<i32>,
        password_expiry_for_admin: Option<bool>,
        cache_expiration: Option<i32>,
        enable_rfc7613_usercase_mapped_profile: Option<bool>,
        context: &C) -> Result<OrgApacheJackrabbitOakSecurityUserUserConfigurationImplResponse, ApiError>
    {
        info!("org_apache_jackrabbit_oak_security_user_user_configuration_impl({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, users_path, groups_path, system_relative_path, default_depth, import_behavior, password_hash_algorithm, password_hash_iterations, password_salt_size, omit_admin_pw, support_auto_save, password_max_age, initial_password_change, password_history_size, password_expiry_for_admin, cache_expiration, enable_rfc7613_usercase_mapped_profile, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn org_apache_jackrabbit_oak_segment_azure_azure_segment_store_service(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        account_name: Option<String>,
        container_name: Option<String>,
        access_key: Option<String>,
        root_path: Option<String>,
        connection_url: Option<String>,
        context: &C) -> Result<OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceResponse, ApiError>
    {
        info!("org_apache_jackrabbit_oak_segment_azure_azure_segment_store_service({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, account_name, container_name, access_key, root_path, connection_url, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn org_apache_jackrabbit_oak_segment_segment_node_store_factory(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        repository_home: Option<String>,
        tarmk_mode: Option<String>,
        tarmk_size: Option<i32>,
        segment_cache_size: Option<i32>,
        string_cache_size: Option<i32>,
        template_cache_size: Option<i32>,
        string_deduplication_cache_size: Option<i32>,
        template_deduplication_cache_size: Option<i32>,
        node_deduplication_cache_size: Option<i32>,
        pause_compaction: Option<bool>,
        compaction_retry_count: Option<i32>,
        compaction_force_timeout: Option<i32>,
        compaction_size_delta_estimation: Option<i32>,
        compaction_disable_estimation: Option<bool>,
        compaction_retained_generations: Option<i32>,
        compaction_memory_threshold: Option<i32>,
        compaction_progress_log: Option<i32>,
        standby: Option<bool>,
        custom_blob_store: Option<bool>,
        custom_segment_store: Option<bool>,
        split_persistence: Option<bool>,
        repository_backup_dir: Option<String>,
        blob_gc_max_age_in_secs: Option<i32>,
        blob_track_snapshot_interval_in_secs: Option<i32>,
        role: Option<String>,
        register_descriptors: Option<bool>,
        dispatch_changes: Option<bool>,
        context: &C) -> Result<OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryResponse, ApiError>
    {
        info!("org_apache_jackrabbit_oak_segment_segment_node_store_factory({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, repository_home, tarmk_mode, tarmk_size, segment_cache_size, string_cache_size, template_cache_size, string_deduplication_cache_size, template_deduplication_cache_size, node_deduplication_cache_size, pause_compaction, compaction_retry_count, compaction_force_timeout, compaction_size_delta_estimation, compaction_disable_estimation, compaction_retained_generations, compaction_memory_threshold, compaction_progress_log, standby, custom_blob_store, custom_segment_store, split_persistence, repository_backup_dir, blob_gc_max_age_in_secs, blob_track_snapshot_interval_in_secs, role, register_descriptors, dispatch_changes, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn org_apache_jackrabbit_oak_segment_segment_node_store_monitor_service(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        commits_tracker_writer_groups: Option<&Vec<String>>,
        context: &C) -> Result<OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceResponse, ApiError>
    {
        info!("org_apache_jackrabbit_oak_segment_segment_node_store_monitor_service({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, commits_tracker_writer_groups, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn org_apache_jackrabbit_oak_segment_segment_node_store_service(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        repository_home: Option<String>,
        tarmk_mode: Option<String>,
        tarmk_size: Option<i32>,
        segment_cache_size: Option<i32>,
        string_cache_size: Option<i32>,
        template_cache_size: Option<i32>,
        string_deduplication_cache_size: Option<i32>,
        template_deduplication_cache_size: Option<i32>,
        node_deduplication_cache_size: Option<i32>,
        pause_compaction: Option<bool>,
        compaction_retry_count: Option<i32>,
        compaction_force_timeout: Option<i32>,
        compaction_size_delta_estimation: Option<i32>,
        compaction_disable_estimation: Option<bool>,
        compaction_retained_generations: Option<i32>,
        compaction_memory_threshold: Option<i32>,
        compaction_progress_log: Option<i32>,
        standby: Option<bool>,
        custom_blob_store: Option<bool>,
        custom_segment_store: Option<bool>,
        split_persistence: Option<bool>,
        repository_backup_dir: Option<String>,
        blob_gc_max_age_in_secs: Option<i32>,
        blob_track_snapshot_interval_in_secs: Option<i32>,
        context: &C) -> Result<OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceResponse, ApiError>
    {
        info!("org_apache_jackrabbit_oak_segment_segment_node_store_service({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, repository_home, tarmk_mode, tarmk_size, segment_cache_size, string_cache_size, template_cache_size, string_deduplication_cache_size, template_deduplication_cache_size, node_deduplication_cache_size, pause_compaction, compaction_retry_count, compaction_force_timeout, compaction_size_delta_estimation, compaction_disable_estimation, compaction_retained_generations, compaction_memory_threshold, compaction_progress_log, standby, custom_blob_store, custom_segment_store, split_persistence, repository_backup_dir, blob_gc_max_age_in_secs, blob_track_snapshot_interval_in_secs, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn org_apache_jackrabbit_oak_segment_standby_store_standby_store_service(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        org_apache_sling_installer_configuration_persist: Option<bool>,
        mode: Option<String>,
        port: Option<i32>,
        primary_host: Option<String>,
        interval: Option<i32>,
        primary_allowed_client_ip_ranges: Option<&Vec<String>>,
        secure: Option<bool>,
        standby_readtimeout: Option<i32>,
        standby_autoclean: Option<bool>,
        context: &C) -> Result<OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceResponse, ApiError>
    {
        info!("org_apache_jackrabbit_oak_segment_standby_store_standby_store_service({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, org_apache_sling_installer_configuration_persist, mode, port, primary_host, interval, primary_allowed_client_ip_ranges, secure, standby_readtimeout, standby_autoclean, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        handler_name: Option<String>,
        user_expiration_time: Option<String>,
        user_auto_membership: Option<&Vec<String>>,
        user_property_mapping: Option<&Vec<String>>,
        user_path_prefix: Option<String>,
        user_membership_exp_time: Option<String>,
        user_membership_nesting_depth: Option<i32>,
        user_dynamic_membership: Option<bool>,
        user_disable_missing: Option<bool>,
        group_expiration_time: Option<String>,
        group_auto_membership: Option<&Vec<String>>,
        group_property_mapping: Option<&Vec<String>>,
        group_path_prefix: Option<String>,
        enable_rfc7613_usercase_mapped_profile: Option<bool>,
        context: &C) -> Result<OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeResponse, ApiError>
    {
        info!("org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, handler_name, user_expiration_time, user_auto_membership, user_property_mapping, user_path_prefix, user_membership_exp_time, user_membership_nesting_depth, user_dynamic_membership, user_disable_missing, group_expiration_time, group_auto_membership, group_property_mapping, group_path_prefix, enable_rfc7613_usercase_mapped_profile, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn org_apache_jackrabbit_oak_spi_security_authentication_external_impl_ex(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        jaas_ranking: Option<i32>,
        jaas_control_flag: Option<String>,
        jaas_realm_name: Option<String>,
        idp_name: Option<String>,
        sync_handler_name: Option<String>,
        context: &C) -> Result<OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExResponse, ApiError>
    {
        info!("org_apache_jackrabbit_oak_spi_security_authentication_external_impl_ex({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, jaas_ranking, jaas_control_flag, jaas_realm_name, idp_name, sync_handler_name, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn org_apache_jackrabbit_oak_spi_security_authentication_external_impl_pr(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        protect_external_id: Option<bool>,
        context: &C) -> Result<OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrResponse, ApiError>
    {
        info!("org_apache_jackrabbit_oak_spi_security_authentication_external_impl_pr({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, protect_external_id, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn org_apache_jackrabbit_oak_spi_security_authorization_cug_impl_cug_confi(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        cug_supported_paths: Option<&Vec<String>>,
        cug_enabled: Option<bool>,
        configuration_ranking: Option<i32>,
        context: &C) -> Result<OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiResponse, ApiError>
    {
        info!("org_apache_jackrabbit_oak_spi_security_authorization_cug_impl_cug_confi({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, cug_supported_paths, cug_enabled, configuration_ranking, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn org_apache_jackrabbit_oak_spi_security_authorization_cug_impl_cug_exclu(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        principal_names: Option<&Vec<String>>,
        context: &C) -> Result<OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluResponse, ApiError>
    {
        info!("org_apache_jackrabbit_oak_spi_security_authorization_cug_impl_cug_exclu({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, principal_names, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn org_apache_jackrabbit_oak_spi_security_user_action_default_authorizable(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        enabled_actions: Option<String>,
        user_privilege_names: Option<&Vec<String>>,
        group_privilege_names: Option<&Vec<String>>,
        constraint: Option<String>,
        context: &C) -> Result<OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableResponse, ApiError>
    {
        info!("org_apache_jackrabbit_oak_spi_security_user_action_default_authorizable({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, enabled_actions, user_privilege_names, group_privilege_names, constraint, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn org_apache_jackrabbit_vault_packaging_impl_packaging_impl(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        package_roots: Option<&Vec<String>>,
        context: &C) -> Result<OrgApacheJackrabbitVaultPackagingImplPackagingImplResponse, ApiError>
    {
        info!("org_apache_jackrabbit_vault_packaging_impl_packaging_impl({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, package_roots, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn org_apache_jackrabbit_vault_packaging_registry_impl_fs_package_registry(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        home_path: Option<String>,
        context: &C) -> Result<OrgApacheJackrabbitVaultPackagingRegistryImplFsPackageRegistryResponse, ApiError>
    {
        info!("org_apache_jackrabbit_vault_packaging_registry_impl_fs_package_registry({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, home_path, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn org_apache_sling_auth_core_impl_logout_servlet(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        sling_servlet_methods: Option<&Vec<String>>,
        sling_servlet_paths: Option<String>,
        context: &C) -> Result<OrgApacheSlingAuthCoreImplLogoutServletResponse, ApiError>
    {
        info!("org_apache_sling_auth_core_impl_logout_servlet({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, sling_servlet_methods, sling_servlet_paths, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn org_apache_sling_caconfig_impl_configuration_bindings_value_provider(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        enabled: Option<bool>,
        context: &C) -> Result<OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderResponse, ApiError>
    {
        info!("org_apache_sling_caconfig_impl_configuration_bindings_value_provider({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, enabled, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn org_apache_sling_caconfig_impl_configuration_resolver_impl(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        config_bucket_names: Option<&Vec<String>>,
        context: &C) -> Result<OrgApacheSlingCaconfigImplConfigurationResolverImplResponse, ApiError>
    {
        info!("org_apache_sling_caconfig_impl_configuration_resolver_impl({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, config_bucket_names, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn org_apache_sling_caconfig_impl_def_default_configuration_inheritance_stra(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        enabled: Option<bool>,
        config_property_inheritance_property_names: Option<&Vec<String>>,
        context: &C) -> Result<OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraResponse, ApiError>
    {
        info!("org_apache_sling_caconfig_impl_def_default_configuration_inheritance_stra({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, enabled, config_property_inheritance_property_names, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn org_apache_sling_caconfig_impl_def_default_configuration_persistence_stra(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        enabled: Option<bool>,
        context: &C) -> Result<OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraResponse, ApiError>
    {
        info!("org_apache_sling_caconfig_impl_def_default_configuration_persistence_stra({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, enabled, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn org_apache_sling_caconfig_impl_override_osgi_configuration_override_provi(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        description: Option<String>,
        overrides: Option<&Vec<String>>,
        enabled: Option<bool>,
        service_ranking: Option<i32>,
        context: &C) -> Result<OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviResponse, ApiError>
    {
        info!("org_apache_sling_caconfig_impl_override_osgi_configuration_override_provi({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, description, overrides, enabled, service_ranking, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn org_apache_sling_caconfig_impl_override_system_property_configuration_ove(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        enabled: Option<bool>,
        service_ranking: Option<i32>,
        context: &C) -> Result<OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveResponse, ApiError>
    {
        info!("org_apache_sling_caconfig_impl_override_system_property_configuration_ove({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, enabled, service_ranking, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn org_apache_sling_caconfig_management_impl_configuration_management_setti(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        ignore_property_name_regex: Option<&Vec<String>>,
        config_collection_properties_resource_names: Option<&Vec<String>>,
        context: &C) -> Result<OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiResponse, ApiError>
    {
        info!("org_apache_sling_caconfig_management_impl_configuration_management_setti({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, ignore_property_name_regex, config_collection_properties_resource_names, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn org_apache_sling_caconfig_resource_impl_def_default_configuration_resour(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        enabled: Option<bool>,
        config_path: Option<String>,
        fallback_paths: Option<&Vec<String>>,
        config_collection_inheritance_property_names: Option<&Vec<String>>,
        context: &C) -> Result<OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourResponse, ApiError>
    {
        info!("org_apache_sling_caconfig_resource_impl_def_default_configuration_resour({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, enabled, config_path, fallback_paths, config_collection_inheritance_property_names, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn org_apache_sling_caconfig_resource_impl_def_default_context_path_strategy(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        enabled: Option<bool>,
        config_ref_resource_names: Option<&Vec<String>>,
        config_ref_property_names: Option<&Vec<String>>,
        service_ranking: Option<i32>,
        context: &C) -> Result<OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyResponse, ApiError>
    {
        info!("org_apache_sling_caconfig_resource_impl_def_default_context_path_strategy({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, enabled, config_ref_resource_names, config_ref_property_names, service_ranking, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn org_apache_sling_commons_html_internal_tagsoup_html_parser(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        parser_features: Option<&Vec<String>>,
        context: &C) -> Result<OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserResponse, ApiError>
    {
        info!("org_apache_sling_commons_html_internal_tagsoup_html_parser({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, parser_features, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn org_apache_sling_commons_log_log_manager(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        org_apache_sling_commons_log_level: Option<String>,
        org_apache_sling_commons_log_file: Option<String>,
        org_apache_sling_commons_log_file_number: Option<i32>,
        org_apache_sling_commons_log_file_size: Option<String>,
        org_apache_sling_commons_log_pattern: Option<String>,
        org_apache_sling_commons_log_configuration_file: Option<String>,
        org_apache_sling_commons_log_packaging_data_enabled: Option<bool>,
        org_apache_sling_commons_log_max_caller_data_depth: Option<i32>,
        org_apache_sling_commons_log_max_old_file_count_in_dump: Option<i32>,
        org_apache_sling_commons_log_num_of_lines: Option<i32>,
        context: &C) -> Result<OrgApacheSlingCommonsLogLogManagerResponse, ApiError>
    {
        info!("org_apache_sling_commons_log_log_manager({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, org_apache_sling_commons_log_level, org_apache_sling_commons_log_file, org_apache_sling_commons_log_file_number, org_apache_sling_commons_log_file_size, org_apache_sling_commons_log_pattern, org_apache_sling_commons_log_configuration_file, org_apache_sling_commons_log_packaging_data_enabled, org_apache_sling_commons_log_max_caller_data_depth, org_apache_sling_commons_log_max_old_file_count_in_dump, org_apache_sling_commons_log_num_of_lines, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn org_apache_sling_commons_log_log_manager_factory_config(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        org_apache_sling_commons_log_level: Option<String>,
        org_apache_sling_commons_log_file: Option<String>,
        org_apache_sling_commons_log_pattern: Option<String>,
        org_apache_sling_commons_log_names: Option<&Vec<String>>,
        org_apache_sling_commons_log_additiv: Option<bool>,
        context: &C) -> Result<OrgApacheSlingCommonsLogLogManagerFactoryConfigResponse, ApiError>
    {
        info!("org_apache_sling_commons_log_log_manager_factory_config({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, org_apache_sling_commons_log_level, org_apache_sling_commons_log_file, org_apache_sling_commons_log_pattern, org_apache_sling_commons_log_names, org_apache_sling_commons_log_additiv, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn org_apache_sling_commons_log_log_manager_factory_writer(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        org_apache_sling_commons_log_file: Option<String>,
        org_apache_sling_commons_log_file_number: Option<i32>,
        org_apache_sling_commons_log_file_size: Option<String>,
        org_apache_sling_commons_log_file_buffered: Option<bool>,
        context: &C) -> Result<OrgApacheSlingCommonsLogLogManagerFactoryWriterResponse, ApiError>
    {
        info!("org_apache_sling_commons_log_log_manager_factory_writer({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, org_apache_sling_commons_log_file, org_apache_sling_commons_log_file_number, org_apache_sling_commons_log_file_size, org_apache_sling_commons_log_file_buffered, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn org_apache_sling_commons_metrics_internal_log_reporter(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        period: Option<i32>,
        time_unit: Option<String>,
        level: Option<String>,
        logger_name: Option<String>,
        prefix: Option<String>,
        pattern: Option<String>,
        registry_name: Option<String>,
        context: &C) -> Result<OrgApacheSlingCommonsMetricsInternalLogReporterResponse, ApiError>
    {
        info!("org_apache_sling_commons_metrics_internal_log_reporter({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, period, time_unit, level, logger_name, prefix, pattern, registry_name, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn org_apache_sling_commons_metrics_rrd4j_impl_codahale_metrics_reporter(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        datasources: Option<&Vec<String>>,
        step: Option<i32>,
        archives: Option<&Vec<String>>,
        path: Option<String>,
        context: &C) -> Result<OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterResponse, ApiError>
    {
        info!("org_apache_sling_commons_metrics_rrd4j_impl_codahale_metrics_reporter({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, datasources, step, archives, path, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn org_apache_sling_commons_mime_internal_mime_type_service_impl(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        mime_types: Option<&Vec<String>>,
        context: &C) -> Result<OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplResponse, ApiError>
    {
        info!("org_apache_sling_commons_mime_internal_mime_type_service_impl({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, mime_types, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn org_apache_sling_commons_scheduler_impl_quartz_scheduler(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        pool_name: Option<String>,
        allowed_pool_names: Option<&Vec<String>>,
        scheduler_useleaderforsingle: Option<bool>,
        metrics_filters: Option<&Vec<String>>,
        slow_threshold_millis: Option<i32>,
        context: &C) -> Result<OrgApacheSlingCommonsSchedulerImplQuartzSchedulerResponse, ApiError>
    {
        info!("org_apache_sling_commons_scheduler_impl_quartz_scheduler({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, pool_name, allowed_pool_names, scheduler_useleaderforsingle, metrics_filters, slow_threshold_millis, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn org_apache_sling_commons_scheduler_impl_scheduler_health_check(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        max_quartz_job_duration_acceptable: Option<i32>,
        context: &C) -> Result<OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckResponse, ApiError>
    {
        info!("org_apache_sling_commons_scheduler_impl_scheduler_health_check({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, max_quartz_job_duration_acceptable, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn org_apache_sling_commons_threads_impl_default_thread_pool_factory(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        name: Option<String>,
        min_pool_size: Option<i32>,
        max_pool_size: Option<i32>,
        queue_size: Option<i32>,
        max_thread_age: Option<i32>,
        keep_alive_time: Option<i32>,
        block_policy: Option<String>,
        shutdown_graceful: Option<bool>,
        daemon: Option<bool>,
        shutdown_wait_time: Option<i32>,
        priority: Option<String>,
        context: &C) -> Result<OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryResponse, ApiError>
    {
        info!("org_apache_sling_commons_threads_impl_default_thread_pool_factory({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, name, min_pool_size, max_pool_size, queue_size, max_thread_age, keep_alive_time, block_policy, shutdown_graceful, daemon, shutdown_wait_time, priority, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn org_apache_sling_datasource_data_source_factory(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        datasource_name: Option<String>,
        datasource_svc_prop_name: Option<String>,
        driver_class_name: Option<String>,
        url: Option<String>,
        username: Option<String>,
        password: Option<String>,
        default_auto_commit: Option<String>,
        default_read_only: Option<String>,
        default_transaction_isolation: Option<String>,
        default_catalog: Option<String>,
        max_active: Option<i32>,
        max_idle: Option<i32>,
        min_idle: Option<i32>,
        initial_size: Option<i32>,
        max_wait: Option<i32>,
        max_age: Option<i32>,
        test_on_borrow: Option<bool>,
        test_on_return: Option<bool>,
        test_while_idle: Option<bool>,
        validation_query: Option<String>,
        validation_query_timeout: Option<i32>,
        time_between_eviction_runs_millis: Option<i32>,
        min_evictable_idle_time_millis: Option<i32>,
        connection_properties: Option<String>,
        init_sql: Option<String>,
        jdbc_interceptors: Option<String>,
        validation_interval: Option<i32>,
        log_validation_errors: Option<bool>,
        datasource_svc_properties: Option<&Vec<String>>,
        context: &C) -> Result<OrgApacheSlingDatasourceDataSourceFactoryResponse, ApiError>
    {
        info!("org_apache_sling_datasource_data_source_factory({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, datasource_name, datasource_svc_prop_name, driver_class_name, url, username, password, default_auto_commit, default_read_only, default_transaction_isolation, default_catalog, max_active, max_idle, min_idle, initial_size, max_wait, max_age, test_on_borrow, test_on_return, test_while_idle, validation_query, validation_query_timeout, time_between_eviction_runs_millis, min_evictable_idle_time_millis, connection_properties, init_sql, jdbc_interceptors, validation_interval, log_validation_errors, datasource_svc_properties, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn org_apache_sling_datasource_jndi_data_source_factory(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        datasource_name: Option<String>,
        datasource_svc_prop_name: Option<String>,
        datasource_jndi_name: Option<String>,
        jndi_properties: Option<&Vec<String>>,
        context: &C) -> Result<OrgApacheSlingDatasourceJndiDataSourceFactoryResponse, ApiError>
    {
        info!("org_apache_sling_datasource_jndi_data_source_factory({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, datasource_name, datasource_svc_prop_name, datasource_jndi_name, jndi_properties, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn org_apache_sling_discovery_oak_config(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        connector_ping_timeout: Option<i32>,
        connector_ping_interval: Option<i32>,
        discovery_lite_check_interval: Option<i32>,
        cluster_sync_service_timeout: Option<i32>,
        cluster_sync_service_interval: Option<i32>,
        enable_sync_token: Option<bool>,
        min_event_delay: Option<i32>,
        socket_connect_timeout: Option<i32>,
        so_timeout: Option<i32>,
        topology_connector_urls: Option<&Vec<String>>,
        topology_connector_whitelist: Option<&Vec<String>>,
        auto_stop_local_loop_enabled: Option<bool>,
        gzip_connector_requests_enabled: Option<bool>,
        hmac_enabled: Option<bool>,
        enable_encryption: Option<bool>,
        shared_key: Option<String>,
        hmac_shared_key_ttl: Option<i32>,
        backoff_standby_factor: Option<String>,
        backoff_stable_factor: Option<String>,
        context: &C) -> Result<OrgApacheSlingDiscoveryOakConfigResponse, ApiError>
    {
        info!("org_apache_sling_discovery_oak_config({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, connector_ping_timeout, connector_ping_interval, discovery_lite_check_interval, cluster_sync_service_timeout, cluster_sync_service_interval, enable_sync_token, min_event_delay, socket_connect_timeout, so_timeout, topology_connector_urls, topology_connector_whitelist, auto_stop_local_loop_enabled, gzip_connector_requests_enabled, hmac_enabled, enable_encryption, shared_key, hmac_shared_key_ttl, backoff_standby_factor, backoff_stable_factor, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn org_apache_sling_discovery_oak_synchronized_clocks_health_check(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        hc_name: Option<String>,
        hc_tags: Option<&Vec<String>>,
        hc_mbean_name: Option<String>,
        context: &C) -> Result<OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckResponse, ApiError>
    {
        info!("org_apache_sling_discovery_oak_synchronized_clocks_health_check({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, hc_name, hc_tags, hc_mbean_name, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        name: Option<String>,
        title: Option<String>,
        details: Option<String>,
        enabled: Option<bool>,
        service_name: Option<String>,
        log_level: Option<String>,
        allowed_roots: Option<&Vec<String>>,
        queue_processing_enabled: Option<bool>,
        package_importer_endpoints: Option<&Vec<String>>,
        passive_queues: Option<&Vec<String>>,
        priority_queues: Option<&Vec<String>>,
        retry_strategy: Option<String>,
        retry_attempts: Option<i32>,
        request_authorization_strategy_target: Option<String>,
        transport_secret_provider_target: Option<String>,
        package_builder_target: Option<String>,
        triggers_target: Option<String>,
        queue_provider: Option<String>,
        async_delivery: Option<bool>,
        http_conn_timeout: Option<i32>,
        context: &C) -> Result<OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoResponse, ApiError>
    {
        info!("org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, name, title, details, enabled, service_name, log_level, allowed_roots, queue_processing_enabled, package_importer_endpoints, passive_queues, priority_queues, retry_strategy, retry_attempts, request_authorization_strategy_target, transport_secret_provider_target, package_builder_target, triggers_target, queue_provider, async_delivery, http_conn_timeout, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn org_apache_sling_distribution_agent_impl_privilege_distribution_request_a(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        name: Option<String>,
        jcr_privilege: Option<String>,
        context: &C) -> Result<OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAResponse, ApiError>
    {
        info!("org_apache_sling_distribution_agent_impl_privilege_distribution_request_a({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, name, jcr_privilege, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        name: Option<String>,
        title: Option<String>,
        details: Option<String>,
        enabled: Option<bool>,
        service_name: Option<String>,
        log_level: Option<String>,
        allowed_roots: Option<&Vec<String>>,
        request_authorization_strategy_target: Option<String>,
        queue_provider_factory_target: Option<String>,
        package_builder_target: Option<String>,
        triggers_target: Option<String>,
        priority_queues: Option<&Vec<String>>,
        context: &C) -> Result<OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryResponse, ApiError>
    {
        info!("org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, name, title, details, enabled, service_name, log_level, allowed_roots, request_authorization_strategy_target, queue_provider_factory_target, package_builder_target, triggers_target, priority_queues, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn org_apache_sling_distribution_agent_impl_reverse_distribution_agent_facto(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        name: Option<String>,
        title: Option<String>,
        details: Option<String>,
        enabled: Option<bool>,
        service_name: Option<String>,
        log_level: Option<String>,
        queue_processing_enabled: Option<bool>,
        package_exporter_endpoints: Option<&Vec<String>>,
        pull_items: Option<i32>,
        http_conn_timeout: Option<i32>,
        request_authorization_strategy_target: Option<String>,
        transport_secret_provider_target: Option<String>,
        package_builder_target: Option<String>,
        triggers_target: Option<String>,
        context: &C) -> Result<OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoResponse, ApiError>
    {
        info!("org_apache_sling_distribution_agent_impl_reverse_distribution_agent_facto({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, name, title, details, enabled, service_name, log_level, queue_processing_enabled, package_exporter_endpoints, pull_items, http_conn_timeout, request_authorization_strategy_target, transport_secret_provider_target, package_builder_target, triggers_target, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        name: Option<String>,
        title: Option<String>,
        details: Option<String>,
        enabled: Option<bool>,
        service_name: Option<String>,
        log_level: Option<String>,
        queue_processing_enabled: Option<bool>,
        package_exporter_target: Option<String>,
        package_importer_target: Option<String>,
        request_authorization_strategy_target: Option<String>,
        triggers_target: Option<String>,
        context: &C) -> Result<OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorResponse, ApiError>
    {
        info!("org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, name, title, details, enabled, service_name, log_level, queue_processing_enabled, package_exporter_target, package_importer_target, request_authorization_strategy_target, triggers_target, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn org_apache_sling_distribution_agent_impl_sync_distribution_agent_factory(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        name: Option<String>,
        title: Option<String>,
        details: Option<String>,
        enabled: Option<bool>,
        service_name: Option<String>,
        log_level: Option<String>,
        queue_processing_enabled: Option<bool>,
        passive_queues: Option<&Vec<String>>,
        package_exporter_endpoints: Option<&Vec<String>>,
        package_importer_endpoints: Option<&Vec<String>>,
        retry_strategy: Option<String>,
        retry_attempts: Option<i32>,
        pull_items: Option<i32>,
        http_conn_timeout: Option<i32>,
        request_authorization_strategy_target: Option<String>,
        transport_secret_provider_target: Option<String>,
        package_builder_target: Option<String>,
        triggers_target: Option<String>,
        context: &C) -> Result<OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryResponse, ApiError>
    {
        info!("org_apache_sling_distribution_agent_impl_sync_distribution_agent_factory({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, name, title, details, enabled, service_name, log_level, queue_processing_enabled, passive_queues, package_exporter_endpoints, package_importer_endpoints, retry_strategy, retry_attempts, pull_items, http_conn_timeout, request_authorization_strategy_target, transport_secret_provider_target, package_builder_target, triggers_target, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn org_apache_sling_distribution_monitor_distribution_queue_health_check(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        hc_name: Option<String>,
        hc_tags: Option<&Vec<String>>,
        hc_mbean_name: Option<String>,
        number_of_retries_allowed: Option<i32>,
        context: &C) -> Result<OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckResponse, ApiError>
    {
        info!("org_apache_sling_distribution_monitor_distribution_queue_health_check({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, hc_name, hc_tags, hc_mbean_name, number_of_retries_allowed, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn org_apache_sling_distribution_packaging_impl_exporter_agent_distributio(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        name: Option<String>,
        queue: Option<String>,
        drop_invalid_items: Option<bool>,
        agent_target: Option<String>,
        context: &C) -> Result<OrgApacheSlingDistributionPackagingImplExporterAgentDistributioResponse, ApiError>
    {
        info!("org_apache_sling_distribution_packaging_impl_exporter_agent_distributio({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, name, queue, drop_invalid_items, agent_target, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn org_apache_sling_distribution_packaging_impl_exporter_local_distributio(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        name: Option<String>,
        package_builder_target: Option<String>,
        context: &C) -> Result<OrgApacheSlingDistributionPackagingImplExporterLocalDistributioResponse, ApiError>
    {
        info!("org_apache_sling_distribution_packaging_impl_exporter_local_distributio({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, name, package_builder_target, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn org_apache_sling_distribution_packaging_impl_exporter_remote_distributi(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        name: Option<String>,
        endpoints: Option<&Vec<String>>,
        pull_items: Option<i32>,
        package_builder_target: Option<String>,
        transport_secret_provider_target: Option<String>,
        context: &C) -> Result<OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiResponse, ApiError>
    {
        info!("org_apache_sling_distribution_packaging_impl_exporter_remote_distributi({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, name, endpoints, pull_items, package_builder_target, transport_secret_provider_target, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn org_apache_sling_distribution_packaging_impl_importer_local_distributio(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        name: Option<String>,
        package_builder_target: Option<String>,
        context: &C) -> Result<OrgApacheSlingDistributionPackagingImplImporterLocalDistributioResponse, ApiError>
    {
        info!("org_apache_sling_distribution_packaging_impl_importer_local_distributio({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, name, package_builder_target, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn org_apache_sling_distribution_packaging_impl_importer_remote_distributi(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        name: Option<String>,
        endpoints: Option<&Vec<String>>,
        transport_secret_provider_target: Option<String>,
        context: &C) -> Result<OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiResponse, ApiError>
    {
        info!("org_apache_sling_distribution_packaging_impl_importer_remote_distributi({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, name, endpoints, transport_secret_provider_target, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn org_apache_sling_distribution_packaging_impl_importer_repository_distri(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        name: Option<String>,
        service_name: Option<String>,
        path: Option<String>,
        privilege_name: Option<String>,
        context: &C) -> Result<OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriResponse, ApiError>
    {
        info!("org_apache_sling_distribution_packaging_impl_importer_repository_distri({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, name, service_name, path, privilege_name, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn org_apache_sling_distribution_resources_impl_distribution_configuration(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        provider_roots: Option<String>,
        kind: Option<String>,
        context: &C) -> Result<OrgApacheSlingDistributionResourcesImplDistributionConfigurationResponse, ApiError>
    {
        info!("org_apache_sling_distribution_resources_impl_distribution_configuration({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, provider_roots, kind, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn org_apache_sling_distribution_resources_impl_distribution_service_resour(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        provider_roots: Option<String>,
        kind: Option<String>,
        context: &C) -> Result<OrgApacheSlingDistributionResourcesImplDistributionServiceResourResponse, ApiError>
    {
        info!("org_apache_sling_distribution_resources_impl_distribution_service_resour({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, provider_roots, kind, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn org_apache_sling_distribution_serialization_impl_distribution_package_bu(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        name: Option<String>,
        r#type: Option<String>,
        format_target: Option<String>,
        temp_fs_folder: Option<String>,
        file_threshold: Option<i32>,
        memory_unit: Option<String>,
        use_off_heap_memory: Option<bool>,
        digest_algorithm: Option<String>,
        monitoring_queue_size: Option<i32>,
        cleanup_delay: Option<i32>,
        package_filters: Option<&Vec<String>>,
        property_filters: Option<&Vec<String>>,
        context: &C) -> Result<OrgApacheSlingDistributionSerializationImplDistributionPackageBuResponse, ApiError>
    {
        info!("org_apache_sling_distribution_serialization_impl_distribution_package_bu({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, name, r#type, format_target, temp_fs_folder, file_threshold, memory_unit, use_off_heap_memory, digest_algorithm, monitoring_queue_size, cleanup_delay, package_filters, property_filters, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn org_apache_sling_distribution_serialization_impl_vlt_vault_distribution(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        name: Option<String>,
        r#type: Option<String>,
        import_mode: Option<String>,
        acl_handling: Option<String>,
        package_roots: Option<String>,
        package_filters: Option<&Vec<String>>,
        property_filters: Option<&Vec<String>>,
        temp_fs_folder: Option<String>,
        use_binary_references: Option<bool>,
        auto_save_threshold: Option<i32>,
        cleanup_delay: Option<i32>,
        file_threshold: Option<i32>,
        mega_bytes: Option<String>,
        use_off_heap_memory: Option<bool>,
        digest_algorithm: Option<String>,
        monitoring_queue_size: Option<i32>,
        paths_mapping: Option<&Vec<String>>,
        strict_import: Option<bool>,
        context: &C) -> Result<OrgApacheSlingDistributionSerializationImplVltVaultDistributionResponse, ApiError>
    {
        info!("org_apache_sling_distribution_serialization_impl_vlt_vault_distribution({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, name, r#type, import_mode, acl_handling, package_roots, package_filters, property_filters, temp_fs_folder, use_binary_references, auto_save_threshold, cleanup_delay, file_threshold, mega_bytes, use_off_heap_memory, digest_algorithm, monitoring_queue_size, paths_mapping, strict_import, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn org_apache_sling_distribution_transport_impl_user_credentials_distributi(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        name: Option<String>,
        username: Option<String>,
        password: Option<String>,
        context: &C) -> Result<OrgApacheSlingDistributionTransportImplUserCredentialsDistributiResponse, ApiError>
    {
        info!("org_apache_sling_distribution_transport_impl_user_credentials_distributi({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, name, username, password, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn org_apache_sling_distribution_trigger_impl_distribution_event_distribute(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        name: Option<String>,
        path: Option<String>,
        context: &C) -> Result<OrgApacheSlingDistributionTriggerImplDistributionEventDistributeResponse, ApiError>
    {
        info!("org_apache_sling_distribution_trigger_impl_distribution_event_distribute({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, name, path, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn org_apache_sling_distribution_trigger_impl_jcr_event_distribution_trigger(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        name: Option<String>,
        path: Option<String>,
        ignored_paths_patterns: Option<&Vec<String>>,
        service_name: Option<String>,
        deep: Option<bool>,
        context: &C) -> Result<OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerResponse, ApiError>
    {
        info!("org_apache_sling_distribution_trigger_impl_jcr_event_distribution_trigger({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, name, path, ignored_paths_patterns, service_name, deep, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn org_apache_sling_distribution_trigger_impl_persisted_jcr_event_distributi(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        name: Option<String>,
        path: Option<String>,
        service_name: Option<String>,
        nuggets_path: Option<String>,
        context: &C) -> Result<OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiResponse, ApiError>
    {
        info!("org_apache_sling_distribution_trigger_impl_persisted_jcr_event_distributi({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, name, path, service_name, nuggets_path, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn org_apache_sling_distribution_trigger_impl_remote_event_distribution_trig(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        name: Option<String>,
        endpoint: Option<String>,
        transport_secret_provider_target: Option<String>,
        context: &C) -> Result<OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigResponse, ApiError>
    {
        info!("org_apache_sling_distribution_trigger_impl_remote_event_distribution_trig({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, name, endpoint, transport_secret_provider_target, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn org_apache_sling_distribution_trigger_impl_resource_event_distribution_tr(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        name: Option<String>,
        path: Option<String>,
        context: &C) -> Result<OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrResponse, ApiError>
    {
        info!("org_apache_sling_distribution_trigger_impl_resource_event_distribution_tr({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, name, path, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn org_apache_sling_distribution_trigger_impl_scheduled_distribution_trigge(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        name: Option<String>,
        path: Option<String>,
        seconds: Option<String>,
        service_name: Option<String>,
        context: &C) -> Result<OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeResponse, ApiError>
    {
        info!("org_apache_sling_distribution_trigger_impl_scheduled_distribution_trigge({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, name, path, seconds, service_name, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn org_apache_sling_engine_impl_auth_sling_authenticator(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        osgi_http_whiteboard_context_select: Option<String>,
        osgi_http_whiteboard_listener: Option<String>,
        auth_sudo_cookie: Option<String>,
        auth_sudo_parameter: Option<String>,
        auth_annonymous: Option<bool>,
        sling_auth_requirements: Option<&Vec<String>>,
        sling_auth_anonymous_user: Option<String>,
        sling_auth_anonymous_password: Option<String>,
        auth_http: Option<String>,
        auth_http_realm: Option<String>,
        auth_uri_suffix: Option<&Vec<String>>,
        context: &C) -> Result<OrgApacheSlingEngineImplAuthSlingAuthenticatorResponse, ApiError>
    {
        info!("org_apache_sling_engine_impl_auth_sling_authenticator({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, osgi_http_whiteboard_context_select, osgi_http_whiteboard_listener, auth_sudo_cookie, auth_sudo_parameter, auth_annonymous, sling_auth_requirements, sling_auth_anonymous_user, sling_auth_anonymous_password, auth_http, auth_http_realm, auth_uri_suffix, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn org_apache_sling_engine_impl_debug_request_progress_tracker_log_filter(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        extensions: Option<&Vec<String>>,
        min_duration_ms: Option<i32>,
        max_duration_ms: Option<i32>,
        compact_log_format: Option<bool>,
        context: &C) -> Result<OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterResponse, ApiError>
    {
        info!("org_apache_sling_engine_impl_debug_request_progress_tracker_log_filter({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, extensions, min_duration_ms, max_duration_ms, compact_log_format, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn org_apache_sling_engine_impl_log_request_logger(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        request_log_output: Option<String>,
        request_log_outputtype: Option<i32>,
        request_log_enabled: Option<bool>,
        access_log_output: Option<String>,
        access_log_outputtype: Option<i32>,
        access_log_enabled: Option<bool>,
        context: &C) -> Result<OrgApacheSlingEngineImplLogRequestLoggerResponse, ApiError>
    {
        info!("org_apache_sling_engine_impl_log_request_logger({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, request_log_output, request_log_outputtype, request_log_enabled, access_log_output, access_log_outputtype, access_log_enabled, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn org_apache_sling_engine_impl_log_request_logger_service(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        request_log_service_format: Option<String>,
        request_log_service_output: Option<String>,
        request_log_service_outputtype: Option<i32>,
        request_log_service_onentry: Option<bool>,
        context: &C) -> Result<OrgApacheSlingEngineImplLogRequestLoggerServiceResponse, ApiError>
    {
        info!("org_apache_sling_engine_impl_log_request_logger_service({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, request_log_service_format, request_log_service_output, request_log_service_outputtype, request_log_service_onentry, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn org_apache_sling_engine_impl_sling_main_servlet(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        sling_max_calls: Option<i32>,
        sling_max_inclusions: Option<i32>,
        sling_trace_allow: Option<bool>,
        sling_max_record_requests: Option<i32>,
        sling_store_pattern_requests: Option<&Vec<String>>,
        sling_serverinfo: Option<String>,
        sling_additional_response_headers: Option<&Vec<String>>,
        context: &C) -> Result<OrgApacheSlingEngineImplSlingMainServletResponse, ApiError>
    {
        info!("org_apache_sling_engine_impl_sling_main_servlet({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, sling_max_calls, sling_max_inclusions, sling_trace_allow, sling_max_record_requests, sling_store_pattern_requests, sling_serverinfo, sling_additional_response_headers, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn org_apache_sling_engine_parameters(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        sling_default_parameter_encoding: Option<String>,
        sling_default_max_parameters: Option<i32>,
        file_location: Option<String>,
        file_threshold: Option<i32>,
        file_max: Option<i32>,
        request_max: Option<i32>,
        sling_default_parameter_check_for_additional_container_parameters: Option<bool>,
        context: &C) -> Result<OrgApacheSlingEngineParametersResponse, ApiError>
    {
        info!("org_apache_sling_engine_parameters({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, sling_default_parameter_encoding, sling_default_max_parameters, file_location, file_threshold, file_max, request_max, sling_default_parameter_check_for_additional_container_parameters, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn org_apache_sling_event_impl_eventing_thread_pool(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        min_pool_size: Option<i32>,
        context: &C) -> Result<OrgApacheSlingEventImplEventingThreadPoolResponse, ApiError>
    {
        info!("org_apache_sling_event_impl_eventing_thread_pool({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, min_pool_size, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn org_apache_sling_event_impl_jobs_default_job_manager(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        queue_priority: Option<String>,
        queue_retries: Option<i32>,
        queue_retrydelay: Option<i32>,
        queue_maxparallel: Option<i32>,
        context: &C) -> Result<OrgApacheSlingEventImplJobsDefaultJobManagerResponse, ApiError>
    {
        info!("org_apache_sling_event_impl_jobs_default_job_manager({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, queue_priority, queue_retries, queue_retrydelay, queue_maxparallel, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn org_apache_sling_event_impl_jobs_jcr_persistence_handler(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        job_consumermanager_disable_distribution: Option<bool>,
        startup_delay: Option<i32>,
        cleanup_period: Option<i32>,
        context: &C) -> Result<OrgApacheSlingEventImplJobsJcrPersistenceHandlerResponse, ApiError>
    {
        info!("org_apache_sling_event_impl_jobs_jcr_persistence_handler({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, job_consumermanager_disable_distribution, startup_delay, cleanup_period, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn org_apache_sling_event_impl_jobs_job_consumer_manager(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        org_apache_sling_installer_configuration_persist: Option<bool>,
        job_consumermanager_whitelist: Option<&Vec<String>>,
        job_consumermanager_blacklist: Option<&Vec<String>>,
        context: &C) -> Result<OrgApacheSlingEventImplJobsJobConsumerManagerResponse, ApiError>
    {
        info!("org_apache_sling_event_impl_jobs_job_consumer_manager({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, org_apache_sling_installer_configuration_persist, job_consumermanager_whitelist, job_consumermanager_blacklist, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn org_apache_sling_event_jobs_queue_configuration(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        queue_name: Option<String>,
        queue_topics: Option<&Vec<String>>,
        queue_type: Option<String>,
        queue_priority: Option<String>,
        queue_retries: Option<i32>,
        queue_retrydelay: Option<i32>,
        queue_maxparallel: Option<f64>,
        queue_keep_jobs: Option<bool>,
        queue_prefer_run_on_creation_instance: Option<bool>,
        queue_thread_pool_size: Option<i32>,
        service_ranking: Option<i32>,
        context: &C) -> Result<OrgApacheSlingEventJobsQueueConfigurationResponse, ApiError>
    {
        info!("org_apache_sling_event_jobs_queue_configuration({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, queue_name, queue_topics, queue_type, queue_priority, queue_retries, queue_retrydelay, queue_maxparallel, queue_keep_jobs, queue_prefer_run_on_creation_instance, queue_thread_pool_size, service_ranking, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn org_apache_sling_extensions_webconsolesecurityprovider_internal_sling_w(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        users: Option<&Vec<String>>,
        groups: Option<&Vec<String>>,
        context: &C) -> Result<OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWResponse, ApiError>
    {
        info!("org_apache_sling_extensions_webconsolesecurityprovider_internal_sling_w({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, users, groups, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn org_apache_sling_featureflags_feature(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        name: Option<String>,
        description: Option<String>,
        enabled: Option<bool>,
        context: &C) -> Result<OrgApacheSlingFeatureflagsFeatureResponse, ApiError>
    {
        info!("org_apache_sling_featureflags_feature({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, name, description, enabled, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn org_apache_sling_featureflags_impl_configured_feature(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        name: Option<String>,
        description: Option<String>,
        enabled: Option<bool>,
        context: &C) -> Result<OrgApacheSlingFeatureflagsImplConfiguredFeatureResponse, ApiError>
    {
        info!("org_apache_sling_featureflags_impl_configured_feature({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, name, description, enabled, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn org_apache_sling_hapi_impl_h_api_util_impl(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        org_apache_sling_hapi_tools_resourcetype: Option<String>,
        org_apache_sling_hapi_tools_collectionresourcetype: Option<String>,
        org_apache_sling_hapi_tools_searchpaths: Option<&Vec<String>>,
        org_apache_sling_hapi_tools_externalurl: Option<String>,
        org_apache_sling_hapi_tools_enabled: Option<bool>,
        context: &C) -> Result<OrgApacheSlingHapiImplHApiUtilImplResponse, ApiError>
    {
        info!("org_apache_sling_hapi_impl_h_api_util_impl({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, org_apache_sling_hapi_tools_resourcetype, org_apache_sling_hapi_tools_collectionresourcetype, org_apache_sling_hapi_tools_searchpaths, org_apache_sling_hapi_tools_externalurl, org_apache_sling_hapi_tools_enabled, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn org_apache_sling_hc_core_impl_composite_health_check(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        hc_name: Option<String>,
        hc_tags: Option<&Vec<String>>,
        hc_mbean_name: Option<String>,
        filter_tags: Option<&Vec<String>>,
        filter_combine_tags_with_or: Option<bool>,
        context: &C) -> Result<OrgApacheSlingHcCoreImplCompositeHealthCheckResponse, ApiError>
    {
        info!("org_apache_sling_hc_core_impl_composite_health_check({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, hc_name, hc_tags, hc_mbean_name, filter_tags, filter_combine_tags_with_or, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn org_apache_sling_hc_core_impl_executor_health_check_executor_impl(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        timeout_in_ms: Option<i32>,
        long_running_future_threshold_for_critical_ms: Option<i32>,
        result_cache_ttl_in_ms: Option<i32>,
        context: &C) -> Result<OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplResponse, ApiError>
    {
        info!("org_apache_sling_hc_core_impl_executor_health_check_executor_impl({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, timeout_in_ms, long_running_future_threshold_for_critical_ms, result_cache_ttl_in_ms, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn org_apache_sling_hc_core_impl_jmx_attribute_health_check(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        hc_name: Option<String>,
        hc_tags: Option<&Vec<String>>,
        hc_mbean_name: Option<String>,
        mbean_name: Option<String>,
        attribute_name: Option<String>,
        attribute_value_constraint: Option<String>,
        context: &C) -> Result<OrgApacheSlingHcCoreImplJmxAttributeHealthCheckResponse, ApiError>
    {
        info!("org_apache_sling_hc_core_impl_jmx_attribute_health_check({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, hc_name, hc_tags, hc_mbean_name, mbean_name, attribute_name, attribute_value_constraint, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn org_apache_sling_hc_core_impl_scriptable_health_check(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        hc_name: Option<String>,
        hc_tags: Option<&Vec<String>>,
        hc_mbean_name: Option<String>,
        expression: Option<String>,
        language_extension: Option<String>,
        context: &C) -> Result<OrgApacheSlingHcCoreImplScriptableHealthCheckResponse, ApiError>
    {
        info!("org_apache_sling_hc_core_impl_scriptable_health_check({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, hc_name, hc_tags, hc_mbean_name, expression, language_extension, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn org_apache_sling_hc_core_impl_servlet_health_check_executor_servlet(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        servlet_path: Option<String>,
        disabled: Option<bool>,
        cors_access_control_allow_origin: Option<String>,
        context: &C) -> Result<OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletResponse, ApiError>
    {
        info!("org_apache_sling_hc_core_impl_servlet_health_check_executor_servlet({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, servlet_path, disabled, cors_access_control_allow_origin, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn org_apache_sling_hc_core_impl_servlet_result_txt_verbose_serializer(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        total_width: Option<i32>,
        col_width_name: Option<i32>,
        col_width_result: Option<i32>,
        col_width_timing: Option<i32>,
        context: &C) -> Result<OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerResponse, ApiError>
    {
        info!("org_apache_sling_hc_core_impl_servlet_result_txt_verbose_serializer({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, total_width, col_width_name, col_width_result, col_width_timing, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn org_apache_sling_i18n_impl_i18_n_filter(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        service_ranking: Option<i32>,
        sling_filter_scope: Option<&Vec<String>>,
        context: &C) -> Result<OrgApacheSlingI18nImplI18NFilterResponse, ApiError>
    {
        info!("org_apache_sling_i18n_impl_i18_n_filter({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, service_ranking, sling_filter_scope, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn org_apache_sling_i18n_impl_jcr_resource_bundle_provider(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        locale_default: Option<String>,
        preload_bundles: Option<bool>,
        invalidation_delay: Option<i32>,
        context: &C) -> Result<OrgApacheSlingI18nImplJcrResourceBundleProviderResponse, ApiError>
    {
        info!("org_apache_sling_i18n_impl_jcr_resource_bundle_provider({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, locale_default, preload_bundles, invalidation_delay, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn org_apache_sling_installer_provider_jcr_impl_jcr_installer(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        handler_schemes: Option<&Vec<String>>,
        sling_jcrinstall_folder_name_regexp: Option<String>,
        sling_jcrinstall_folder_max_depth: Option<i32>,
        sling_jcrinstall_search_path: Option<&Vec<String>>,
        sling_jcrinstall_new_config_path: Option<String>,
        sling_jcrinstall_signal_path: Option<String>,
        sling_jcrinstall_enable_writeback: Option<bool>,
        context: &C) -> Result<OrgApacheSlingInstallerProviderJcrImplJcrInstallerResponse, ApiError>
    {
        info!("org_apache_sling_installer_provider_jcr_impl_jcr_installer({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, handler_schemes, sling_jcrinstall_folder_name_regexp, sling_jcrinstall_folder_max_depth, sling_jcrinstall_search_path, sling_jcrinstall_new_config_path, sling_jcrinstall_signal_path, sling_jcrinstall_enable_writeback, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn org_apache_sling_jcr_base_internal_login_admin_whitelist(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        whitelist_bypass: Option<bool>,
        whitelist_bundles_regexp: Option<String>,
        context: &C) -> Result<OrgApacheSlingJcrBaseInternalLoginAdminWhitelistResponse, ApiError>
    {
        info!("org_apache_sling_jcr_base_internal_login_admin_whitelist({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, whitelist_bypass, whitelist_bundles_regexp, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn org_apache_sling_jcr_base_internal_login_admin_whitelist_fragment(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        whitelist_name: Option<String>,
        whitelist_bundles: Option<&Vec<String>>,
        context: &C) -> Result<OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentResponse, ApiError>
    {
        info!("org_apache_sling_jcr_base_internal_login_admin_whitelist_fragment({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, whitelist_name, whitelist_bundles, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn org_apache_sling_jcr_davex_impl_servlets_sling_dav_ex_servlet(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        alias: Option<String>,
        dav_create_absolute_uri: Option<bool>,
        dav_protectedhandlers: Option<String>,
        context: &C) -> Result<OrgApacheSlingJcrDavexImplServletsSlingDavExServletResponse, ApiError>
    {
        info!("org_apache_sling_jcr_davex_impl_servlets_sling_dav_ex_servlet({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, alias, dav_create_absolute_uri, dav_protectedhandlers, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn org_apache_sling_jcr_jackrabbit_server_jndi_registration_support(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        java_naming_factory_initial: Option<String>,
        java_naming_provider_url: Option<String>,
        context: &C) -> Result<OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportResponse, ApiError>
    {
        info!("org_apache_sling_jcr_jackrabbit_server_jndi_registration_support({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, java_naming_factory_initial, java_naming_provider_url, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn org_apache_sling_jcr_jackrabbit_server_rmi_registration_support(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        port: Option<i32>,
        context: &C) -> Result<OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportResponse, ApiError>
    {
        info!("org_apache_sling_jcr_jackrabbit_server_rmi_registration_support({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, port, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn org_apache_sling_jcr_repoinit_impl_repository_initializer(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        references: Option<&Vec<String>>,
        context: &C) -> Result<OrgApacheSlingJcrRepoinitImplRepositoryInitializerResponse, ApiError>
    {
        info!("org_apache_sling_jcr_repoinit_impl_repository_initializer({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, references, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn org_apache_sling_jcr_repoinit_repository_initializer(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        references: Option<&Vec<String>>,
        scripts: Option<&Vec<String>>,
        context: &C) -> Result<OrgApacheSlingJcrRepoinitRepositoryInitializerResponse, ApiError>
    {
        info!("org_apache_sling_jcr_repoinit_repository_initializer({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, references, scripts, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        resource_resolver_searchpath: Option<&Vec<String>>,
        resource_resolver_manglenamespaces: Option<bool>,
        resource_resolver_allow_direct: Option<bool>,
        resource_resolver_required_providers: Option<&Vec<String>>,
        resource_resolver_required_providernames: Option<&Vec<String>>,
        resource_resolver_virtual: Option<&Vec<String>>,
        resource_resolver_mapping: Option<&Vec<String>>,
        resource_resolver_map_location: Option<String>,
        resource_resolver_map_observation: Option<&Vec<String>>,
        resource_resolver_default_vanity_redirect_status: Option<i32>,
        resource_resolver_enable_vanitypath: Option<bool>,
        resource_resolver_vanitypath_max_entries: Option<i32>,
        resource_resolver_vanitypath_max_entries_startup: Option<bool>,
        resource_resolver_vanitypath_bloomfilter_max_bytes: Option<i32>,
        resource_resolver_optimize_alias_resolution: Option<bool>,
        resource_resolver_vanitypath_whitelist: Option<&Vec<String>>,
        resource_resolver_vanitypath_blacklist: Option<&Vec<String>>,
        resource_resolver_vanity_precedence: Option<bool>,
        resource_resolver_providerhandling_paranoid: Option<bool>,
        resource_resolver_log_closing: Option<bool>,
        resource_resolver_log_unclosed: Option<bool>,
        context: &C) -> Result<OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplResponse, ApiError>
    {
        info!("org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, resource_resolver_searchpath, resource_resolver_manglenamespaces, resource_resolver_allow_direct, resource_resolver_required_providers, resource_resolver_required_providernames, resource_resolver_virtual, resource_resolver_mapping, resource_resolver_map_location, resource_resolver_map_observation, resource_resolver_default_vanity_redirect_status, resource_resolver_enable_vanitypath, resource_resolver_vanitypath_max_entries, resource_resolver_vanitypath_max_entries_startup, resource_resolver_vanitypath_bloomfilter_max_bytes, resource_resolver_optimize_alias_resolution, resource_resolver_vanitypath_whitelist, resource_resolver_vanitypath_blacklist, resource_resolver_vanity_precedence, resource_resolver_providerhandling_paranoid, resource_resolver_log_closing, resource_resolver_log_unclosed, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn org_apache_sling_jcr_resource_internal_jcr_system_user_validator(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        allow_only_system_user: Option<bool>,
        context: &C) -> Result<OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorResponse, ApiError>
    {
        info!("org_apache_sling_jcr_resource_internal_jcr_system_user_validator({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, allow_only_system_user, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn org_apache_sling_jcr_resourcesecurity_impl_resource_access_gate_factory(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        path: Option<String>,
        checkpath_prefix: Option<String>,
        jcr_path: Option<String>,
        context: &C) -> Result<OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryResponse, ApiError>
    {
        info!("org_apache_sling_jcr_resourcesecurity_impl_resource_access_gate_factory({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, path, checkpath_prefix, jcr_path, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn org_apache_sling_jcr_webdav_impl_handler_default_handler_service(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        service_ranking: Option<i32>,
        type_collections: Option<String>,
        type_noncollections: Option<String>,
        type_content: Option<String>,
        context: &C) -> Result<OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceResponse, ApiError>
    {
        info!("org_apache_sling_jcr_webdav_impl_handler_default_handler_service({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, service_ranking, type_collections, type_noncollections, type_content, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn org_apache_sling_jcr_webdav_impl_handler_dir_listing_export_handler_servic(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        service_ranking: Option<i32>,
        context: &C) -> Result<OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicResponse, ApiError>
    {
        info!("org_apache_sling_jcr_webdav_impl_handler_dir_listing_export_handler_servic({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, service_ranking, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        dav_root: Option<String>,
        dav_create_absolute_uri: Option<bool>,
        dav_realm: Option<String>,
        collection_types: Option<&Vec<String>>,
        filter_prefixes: Option<&Vec<String>>,
        filter_types: Option<String>,
        filter_uris: Option<String>,
        type_collections: Option<String>,
        type_noncollections: Option<String>,
        type_content: Option<String>,
        context: &C) -> Result<OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletResponse, ApiError>
    {
        info!("org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, dav_root, dav_create_absolute_uri, dav_realm, collection_types, filter_prefixes, filter_types, filter_uris, type_collections, type_noncollections, type_content, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn org_apache_sling_jmx_provider_impl_jmx_resource_provider(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        provider_roots: Option<String>,
        context: &C) -> Result<OrgApacheSlingJmxProviderImplJmxResourceProviderResponse, ApiError>
    {
        info!("org_apache_sling_jmx_provider_impl_jmx_resource_provider({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, provider_roots, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn org_apache_sling_models_impl_model_adapter_factory(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        osgi_http_whiteboard_listener: Option<String>,
        osgi_http_whiteboard_context_select: Option<String>,
        max_recursion_depth: Option<i32>,
        cleanup_job_period: Option<i32>,
        context: &C) -> Result<OrgApacheSlingModelsImplModelAdapterFactoryResponse, ApiError>
    {
        info!("org_apache_sling_models_impl_model_adapter_factory({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, osgi_http_whiteboard_listener, osgi_http_whiteboard_context_select, max_recursion_depth, cleanup_job_period, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn org_apache_sling_models_jacksonexporter_impl_resource_module_provider(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        max_recursion_levels: Option<i32>,
        context: &C) -> Result<OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderResponse, ApiError>
    {
        info!("org_apache_sling_models_jacksonexporter_impl_resource_module_provider({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, max_recursion_levels, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn org_apache_sling_resource_inventory_impl_resource_inventory_printer_facto(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        felix_inventory_printer_name: Option<String>,
        felix_inventory_printer_title: Option<String>,
        path: Option<String>,
        context: &C) -> Result<OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoResponse, ApiError>
    {
        info!("org_apache_sling_resource_inventory_impl_resource_inventory_printer_facto({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, felix_inventory_printer_name, felix_inventory_printer_title, path, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn org_apache_sling_resourcemerger_impl_merged_resource_provider_factory(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        merge_root: Option<String>,
        merge_read_only: Option<bool>,
        context: &C) -> Result<OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryResponse, ApiError>
    {
        info!("org_apache_sling_resourcemerger_impl_merged_resource_provider_factory({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, merge_root, merge_read_only, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn org_apache_sling_resourcemerger_picker_overriding(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        merge_root: Option<String>,
        merge_read_only: Option<bool>,
        context: &C) -> Result<OrgApacheSlingResourcemergerPickerOverridingResponse, ApiError>
    {
        info!("org_apache_sling_resourcemerger_picker_overriding({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, merge_root, merge_read_only, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn org_apache_sling_scripting_core_impl_script_cache_impl(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        org_apache_sling_scripting_cache_size: Option<i32>,
        org_apache_sling_scripting_cache_additional_extensions: Option<&Vec<String>>,
        context: &C) -> Result<OrgApacheSlingScriptingCoreImplScriptCacheImplResponse, ApiError>
    {
        info!("org_apache_sling_scripting_core_impl_script_cache_impl({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, org_apache_sling_scripting_cache_size, org_apache_sling_scripting_cache_additional_extensions, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn org_apache_sling_scripting_core_impl_scripting_resource_resolver_provider(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        log_stacktrace_onclose: Option<bool>,
        context: &C) -> Result<OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderResponse, ApiError>
    {
        info!("org_apache_sling_scripting_core_impl_scripting_resource_resolver_provider({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, log_stacktrace_onclose, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn org_apache_sling_scripting_java_impl_java_script_engine_factory(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        java_classdebuginfo: Option<bool>,
        java_java_encoding: Option<String>,
        java_compiler_source_vm: Option<String>,
        java_compiler_target_vm: Option<String>,
        context: &C) -> Result<OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryResponse, ApiError>
    {
        info!("org_apache_sling_scripting_java_impl_java_script_engine_factory({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, java_classdebuginfo, java_java_encoding, java_compiler_source_vm, java_compiler_target_vm, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn org_apache_sling_scripting_javascript_internal_rhino_java_script_engine_fa(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        org_apache_sling_scripting_javascript_rhino_opt_level: Option<i32>,
        context: &C) -> Result<OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaResponse, ApiError>
    {
        info!("org_apache_sling_scripting_javascript_internal_rhino_java_script_engine_fa({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, org_apache_sling_scripting_javascript_rhino_opt_level, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn org_apache_sling_scripting_jsp_jsp_script_engine_factory(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        jasper_compiler_target_vm: Option<String>,
        jasper_compiler_source_vm: Option<String>,
        jasper_classdebuginfo: Option<bool>,
        jasper_enable_pooling: Option<bool>,
        jasper_ie_class_id: Option<String>,
        jasper_gen_string_as_char_array: Option<bool>,
        jasper_keepgenerated: Option<bool>,
        jasper_mappedfile: Option<bool>,
        jasper_trim_spaces: Option<bool>,
        jasper_display_source_fragments: Option<bool>,
        default_is_session: Option<bool>,
        context: &C) -> Result<OrgApacheSlingScriptingJspJspScriptEngineFactoryResponse, ApiError>
    {
        info!("org_apache_sling_scripting_jsp_jsp_script_engine_factory({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, jasper_compiler_target_vm, jasper_compiler_source_vm, jasper_classdebuginfo, jasper_enable_pooling, jasper_ie_class_id, jasper_gen_string_as_char_array, jasper_keepgenerated, jasper_mappedfile, jasper_trim_spaces, jasper_display_source_fragments, default_is_session, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn org_apache_sling_scripting_sightly_js_impl_jsapi_sly_bindings_values_prov(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        org_apache_sling_scripting_sightly_js_bindings: Option<&Vec<String>>,
        context: &C) -> Result<OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvResponse, ApiError>
    {
        info!("org_apache_sling_scripting_sightly_js_impl_jsapi_sly_bindings_values_prov({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, org_apache_sling_scripting_sightly_js_bindings, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn org_apache_sling_security_impl_content_disposition_filter(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        sling_content_disposition_paths: Option<&Vec<String>>,
        sling_content_disposition_excluded_paths: Option<&Vec<String>>,
        sling_content_disposition_all_paths: Option<bool>,
        context: &C) -> Result<OrgApacheSlingSecurityImplContentDispositionFilterResponse, ApiError>
    {
        info!("org_apache_sling_security_impl_content_disposition_filter({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, sling_content_disposition_paths, sling_content_disposition_excluded_paths, sling_content_disposition_all_paths, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn org_apache_sling_security_impl_referrer_filter(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        allow_empty: Option<bool>,
        allow_hosts: Option<&Vec<String>>,
        allow_hosts_regexp: Option<&Vec<String>>,
        filter_methods: Option<&Vec<String>>,
        exclude_agents_regexp: Option<&Vec<String>>,
        context: &C) -> Result<OrgApacheSlingSecurityImplReferrerFilterResponse, ApiError>
    {
        info!("org_apache_sling_security_impl_referrer_filter({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, allow_empty, allow_hosts, allow_hosts_regexp, filter_methods, exclude_agents_regexp, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn org_apache_sling_serviceusermapping_impl_service_user_mapper_impl(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        user_mapping: Option<&Vec<String>>,
        user_default: Option<String>,
        user_enable_default_mapping: Option<bool>,
        require_validation: Option<bool>,
        context: &C) -> Result<OrgApacheSlingServiceusermappingImplServiceUserMapperImplResponse, ApiError>
    {
        info!("org_apache_sling_serviceusermapping_impl_service_user_mapper_impl({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, user_mapping, user_default, user_enable_default_mapping, require_validation, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn org_apache_sling_serviceusermapping_impl_service_user_mapper_impl_amended(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        service_ranking: Option<i32>,
        user_mapping: Option<&Vec<String>>,
        context: &C) -> Result<OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedResponse, ApiError>
    {
        info!("org_apache_sling_serviceusermapping_impl_service_user_mapper_impl_amended({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, service_ranking, user_mapping, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn org_apache_sling_servlets_get_default_get_servlet(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        aliases: Option<&Vec<String>>,
        index: Option<bool>,
        index_files: Option<&Vec<String>>,
        enable_html: Option<bool>,
        enable_json: Option<bool>,
        enable_txt: Option<bool>,
        enable_xml: Option<bool>,
        json_maximumresults: Option<i32>,
        ecma_suport: Option<bool>,
        context: &C) -> Result<OrgApacheSlingServletsGetDefaultGetServletResponse, ApiError>
    {
        info!("org_apache_sling_servlets_get_default_get_servlet({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, aliases, index, index_files, enable_html, enable_json, enable_txt, enable_xml, json_maximumresults, ecma_suport, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn org_apache_sling_servlets_get_impl_version_version_info_servlet(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        sling_servlet_selectors: Option<&Vec<String>>,
        ecma_suport: Option<bool>,
        context: &C) -> Result<OrgApacheSlingServletsGetImplVersionVersionInfoServletResponse, ApiError>
    {
        info!("org_apache_sling_servlets_get_impl_version_version_info_servlet({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, sling_servlet_selectors, ecma_suport, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn org_apache_sling_servlets_post_impl_helper_chunk_clean_up_task(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        scheduler_expression: Option<String>,
        scheduler_concurrent: Option<bool>,
        chunk_cleanup_age: Option<i32>,
        context: &C) -> Result<OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskResponse, ApiError>
    {
        info!("org_apache_sling_servlets_post_impl_helper_chunk_clean_up_task({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, scheduler_expression, scheduler_concurrent, chunk_cleanup_age, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn org_apache_sling_servlets_post_impl_sling_post_servlet(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        servlet_post_date_formats: Option<&Vec<String>>,
        servlet_post_node_name_hints: Option<&Vec<String>>,
        servlet_post_node_name_max_length: Option<i32>,
        servlet_post_checkin_new_versionable_nodes: Option<bool>,
        servlet_post_auto_checkout: Option<bool>,
        servlet_post_auto_checkin: Option<bool>,
        servlet_post_ignore_pattern: Option<String>,
        context: &C) -> Result<OrgApacheSlingServletsPostImplSlingPostServletResponse, ApiError>
    {
        info!("org_apache_sling_servlets_post_impl_sling_post_servlet({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, servlet_post_date_formats, servlet_post_node_name_hints, servlet_post_node_name_max_length, servlet_post_checkin_new_versionable_nodes, servlet_post_auto_checkout, servlet_post_auto_checkin, servlet_post_ignore_pattern, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn org_apache_sling_servlets_resolver_sling_servlet_resolver(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        servletresolver_servlet_root: Option<String>,
        servletresolver_cache_size: Option<i32>,
        servletresolver_paths: Option<&Vec<String>>,
        servletresolver_default_extensions: Option<&Vec<String>>,
        context: &C) -> Result<OrgApacheSlingServletsResolverSlingServletResolverResponse, ApiError>
    {
        info!("org_apache_sling_servlets_resolver_sling_servlet_resolver({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, servletresolver_servlet_root, servletresolver_cache_size, servletresolver_paths, servletresolver_default_extensions, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn org_apache_sling_settings_impl_sling_settings_service_impl(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        sling_name: Option<String>,
        sling_description: Option<String>,
        context: &C) -> Result<OrgApacheSlingSettingsImplSlingSettingsServiceImplResponse, ApiError>
    {
        info!("org_apache_sling_settings_impl_sling_settings_service_impl({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, sling_name, sling_description, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn org_apache_sling_startupfilter_impl_startup_filter_impl(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        active_by_default: Option<bool>,
        default_message: Option<String>,
        context: &C) -> Result<OrgApacheSlingStartupfilterImplStartupFilterImplResponse, ApiError>
    {
        info!("org_apache_sling_startupfilter_impl_startup_filter_impl({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, active_by_default, default_message, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn org_apache_sling_tenant_internal_tenant_provider_impl(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        tenant_root: Option<String>,
        tenant_path_matcher: Option<&Vec<String>>,
        context: &C) -> Result<OrgApacheSlingTenantInternalTenantProviderImplResponse, ApiError>
    {
        info!("org_apache_sling_tenant_internal_tenant_provider_impl({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, tenant_root, tenant_path_matcher, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn org_apache_sling_tracer_internal_log_tracer(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        tracer_sets: Option<&Vec<String>>,
        enabled: Option<bool>,
        servlet_enabled: Option<bool>,
        recording_cache_size_in_mb: Option<i32>,
        recording_cache_duration_in_secs: Option<i32>,
        recording_compression_enabled: Option<bool>,
        gzip_response: Option<bool>,
        context: &C) -> Result<OrgApacheSlingTracerInternalLogTracerResponse, ApiError>
    {
        info!("org_apache_sling_tracer_internal_log_tracer({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, tracer_sets, enabled, servlet_enabled, recording_cache_size_in_mb, recording_cache_duration_in_secs, recording_compression_enabled, gzip_response, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

    async fn org_apache_sling_xss_impl_xss_filter_impl(
        &self,
        post: Option<bool>,
        apply: Option<bool>,
        delete: Option<bool>,
        action: Option<String>,
        dollar_location: Option<String>,
        propertylist: Option<&Vec<String>>,
        policy_path: Option<String>,
        context: &C) -> Result<OrgApacheSlingXssImplXssFilterImplResponse, ApiError>
    {
        info!("org_apache_sling_xss_impl_xss_filter_impl({:?}, {:?}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", post, apply, delete, action, dollar_location, propertylist, policy_path, context.get().0.clone());
        Err(ApiError("Api-Error: Operation is NOT implemented".into()))
    }

}
