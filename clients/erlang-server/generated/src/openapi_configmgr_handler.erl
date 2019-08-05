%% basic handler
-module(openapi_configmgr_handler).

%% Cowboy REST callbacks
-export([allowed_methods/2]).
-export([init/3]).
-export([rest_init/2]).
-export([allow_missing_post/2]).
-export([content_types_accepted/2]).
-export([content_types_provided/2]).
-export([delete_resource/2]).
-export([is_authorized/2]).
-export([known_content_type/2]).
-export([malformed_request/2]).
-export([valid_content_headers/2]).
-export([valid_entity_length/2]).

%% Handlers
-export([handle_request_json/2]).

-record(state, {
    operation_id :: openapi_api:operation_id(),
    logic_handler :: atom(),
    validator_state :: jesse_state:state(),
    context=#{} :: #{}
}).

-type state() :: state().

-spec init(TransportName :: atom(), Req :: cowboy_req:req(), Opts :: openapi_router:init_opts()) ->
    {upgrade, protocol, cowboy_rest, Req :: cowboy_req:req(), Opts :: openapi_router:init_opts()}.

init(_Transport, Req, Opts) ->
    {upgrade, protocol, cowboy_rest, Req, Opts}.

-spec rest_init(Req :: cowboy_req:req(), Opts :: openapi_router:init_opts()) ->
    {ok, Req :: cowboy_req:req(), State :: state()}.

rest_init(Req0, {Operations, LogicHandler, ValidatorState}) ->
    {Method, Req} = cowboy_req:method(Req0),
    OperationID = maps:get(Method, Operations, undefined),

    error_logger:info_msg("Attempt to process operation: ~p", [OperationID]),

    State = #state{
        operation_id = OperationID,
        logic_handler = LogicHandler,
        validator_state = ValidatorState
    },
    {ok, Req, State}.

-spec allowed_methods(Req :: cowboy_req:req(), State :: state()) ->
    {Value :: [binary()], Req :: cowboy_req:req(), State :: state()}.


allowed_methods(
    Req,
    State = #state{
        operation_id = 'AdaptiveFormAndInteractiveCommunicationWebChannelConfiguration'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigur'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'AnalyticsComponentQueryCacheService'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ApacheSlingHealthCheckResultHTMLSerializer'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfiguration'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeAemTransactionCoreImplTransactionRecorder'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHC'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHC'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImpl'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImpl'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeCqAccountApiAccountManagementService'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeCqAccountImplAccountManagementServlet'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeCqAddressImplLocationLocationListServlet'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeCqAuditPurgeDam'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeCqAuditPurgePages'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeCqAuditPurgeReplication'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeCqCdnRewriterImplAWSCloudFrontRewriter'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeCqCdnRewriterImplCDNConfigServiceImpl'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeCqCdnRewriterImplCDNRewriter'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandle'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeCqCommerceImplAssetDynamicImageHandler'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImpl'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeCqCommerceImplAssetStaticImageHandler'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeCqCommerceImplAssetVideoHandler'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeCqCommerceImplPromotionPromotionManagerImpl'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImpl'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeCqCommercePimImplPageEventListener'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeCqCommercePimImplProductfeedProductFeedServiceImpl'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeCqContentinsightImplReportingServicesSettingsProvider'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeCqContentinsightImplServletsBrightEdgeProxyServlet'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeCqContentinsightImplServletsReportingServicesProxyServle'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeCqDamCfmImplComponentComponentConfigImpl'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeCqDamCfmImplConfFeatureConfigImpl'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeCqDamCfmImplContentRewriterAssetProcessor'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeCqDamCfmImplContentRewriterParRangeFilter'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeCqDamCfmImplContentRewriterPayloadFilter'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeCqDamDmProcessImagePTiffManagerImpl'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorker'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeCqDamMacSyncHelperImplMACSyncClientImpl'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeCqDamMacSyncImplDAMSyncServiceImpl'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeCqDamProcessorNuiImplNuiAssetProcessor'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeCqDamS7imagingImplIsImageServerComponent'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeCqDamS7imagingImplPsPlatformServerServlet'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeCqDamWebdavImplIoAssetIOHandler'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJob'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeCqDamWebdavImplIoSpecialFilesHandler'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeCqDeserfwImplDeserializationFirewallImpl'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeCqDtmImplServiceDTMWebServiceImpl'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeCqDtmImplServletsDTMDeployHookServlet'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeCqDtmReactorImplServiceWebServiceImpl'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeCqExperiencelogImplExperienceLogConfigServlet'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeCqHcContentPackagesHealthCheck'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeCqHistoryImplHistoryRequestFilter'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeCqHistoryImplHistoryServiceImpl'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeCqInboxImplTypeproviderItemTypeProvider'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeCqProjectsImplServletProjectImageServlet'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeCqProjectsPurgeScheduler'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeCqScheduledExporterImplScheduledExporterImpl'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImpl'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeCqScreensDeviceImplDeviceService'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImpl'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeCqScreensImplHandlerChannelsUpdateHandler'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJob'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeCqScreensImplRemoteImplDistributedHttpClientImpl'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeCqScreensImplScreensChannelPostProcessor'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImpl'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeCqScreensMqActivemqImplArtemisJMSProvider'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImpl'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImpl'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeCqScreensSegmentationImplSegmentationFeatureFlag'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthCh'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheck'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheck'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheck'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheck'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeCqSocialAccountverificationImplAccountManagementConfigIm'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponen'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCo'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandler'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeCqSocialActivitystreamsListenerImplModerationEventExten'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivityS'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStre'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsI'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmen'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeCqSocialCalendarServletsTimeZoneServlet'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEvent'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSe'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperati'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialC'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPos'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeCqSocialCommonsCorsCORSAuthenticationFilter'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProvider'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImpl'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListener'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeCqSocialCommonsEmailreplyImplCustomEmailClientProvider'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImp'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImp'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporter'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeCqSocialCommonsEmailreplyImplGmailEmailClientProvider'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProvider'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProvider'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeCqSocialCommonsEmailreplyImplOutLookEmailClientProvider'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProvider'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProvider'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUpload'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImpl'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimit'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeCqSocialConnectOauthImplFacebookProviderImpl'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandle'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapper'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeCqSocialConnectOauthImplTwitterProviderImpl'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmen'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeCqSocialDatastoreAsImplASResourceProviderFactory'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactory'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactor'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorF'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFacto'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeCqSocialEnablementLearningpathEndpointsImplEnablementL'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResou'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeCqSocialEnablementServicesImplAuthorMarkerImpl'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGe'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOpera'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeCqSocialForumClientEndpointsImplForumOperationsService'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeCqSocialForumDispatcherImplFlushOperations'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponen'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeCqSocialGroupImplGroupServiceImpl'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeCqSocialHandlebarsGuavaTemplateCacheImpl'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsS'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSer'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfile'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileO'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentF'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperation'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponen'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeCqSocialModerationDashboardApiModerationDashboardSocial'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponen'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSoci'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeCqSocialNotificationsImplMentionsRouter'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeCqSocialNotificationsImplNotificationManagerImpl'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeCqSocialNotificationsImplNotificationsRouter'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServic'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportI'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportM'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportS'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServi'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServlet'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServlet'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeCqSocialScoringImplScoringEventListener'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImpl'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeCqSocialSiteEndpointsImplSiteOperationService'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceIm'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeCqSocialSiteImplSiteConfiguratorImpl'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeCqSocialSrpImplSocialSolrConnector'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeCqSocialSyncImplDiffChangesObserver'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeCqSocialSyncImplGroupSyncListenerImpl'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeCqSocialSyncImplPublisherSyncServiceImpl'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeCqSocialSyncImplUserSyncListenerImpl'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeCqSocialTranslationImplTranslationServiceConfigManager'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeCqSocialTranslationImplUGCLanguageDetector'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImpl'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImpl'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeCqSocialUgcbaseImplPublisherConfigurationImpl'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeCqSocialUgcbaseImplSocialUtilsImpl'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeCqSocialUgcbaseModerationImplAutoModerationImpl'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeCqSocialUgcbaseModerationImplSentimentProcess'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackli'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImpl'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServlet'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeCqSocialUserImplTransportHttpToPublisher'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFact'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeCqUpgradesCleanupImplUpgradeContentCleanup'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanup'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderService'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTask'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderService'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderService'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeCqWcmLaunchesImplLaunchesEventHandler'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeCqWcmMobileQrcodeServletQRCodeImageGenerator'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImpl'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImpl'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigService'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeFdFpConfigFormsPortalSchedulerService'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeFormsCommonServiceImplDefaultDataProvider'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImp'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeFormsCommonServletTempCleanUpTask'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeGraniteAcpPlatformPlatformServlet'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeGraniteActivitystreamsImplActivityManagerImpl'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeGraniteAnalyzerBaseSystemStatusServlet'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServlet'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeGraniteApicontrollerFilterResolverHookFactory'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeGraniteAuthCertImplClientCertAuthHandler'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeGraniteAuthIms'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtension'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImpl'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidator'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeGraniteAuthImsImplIMSProviderImpl'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeGraniteAuthImsImplImsConfigProviderImpl'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeGraniteAuthOauthAccesstokenProvider'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeGraniteAuthOauthImplBearerAuthenticationHandler'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImpl'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeGraniteAuthOauthImplFacebookProviderImpl'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeGraniteAuthOauthImplGithubProviderImpl'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeGraniteAuthOauthImplGraniteProvider'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeGraniteAuthOauthImplHelperProviderConfigManager'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternal'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandler'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeGraniteAuthOauthImplTwitterProviderImpl'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeGraniteAuthOauthProvider'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeGraniteAuthRequirementImplDefaultRequirementHandler'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeGraniteAuthSamlSamlAuthenticationHandler'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeGraniteAuthSsoImplSsoAuthenticationHandler'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeGraniteBundlesHcImplCodeCacheHealthCheck'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheck'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeGraniteBundlesHcImplDavExBundleHealthCheck'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheck'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeGraniteBundlesHcImplJobsHealthCheck'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeGraniteBundlesHcImplSlingGetServletHealthCheck'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheck'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheck'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheck'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheck'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFac'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImpl'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeGraniteCompatrouterImplRoutingConfig'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeGraniteCompatrouterImplSwitchMappingConfig'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolving'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeGraniteContexthubImplContextHubImpl'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeGraniteCorsImplCORSPolicyImpl'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeGraniteCsrfImplCSRFFilter'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeGraniteCsrfImplCSRFServlet'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSe'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserver'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeGraniteDistributionCoreImplDiffDiffEventListener'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeGraniteDistributionCoreImplDistributionToReplicationEven'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicat'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeGraniteDistributionCoreImplReplicationDistributionTrans'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribu'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeGraniteFragsImplCheckHttpHeaderFlag'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeGraniteFragsImplRandomFeature'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeGraniteHttpcacheFileFileCacheStore'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeGraniteHttpcacheImplOuterCacheFilter'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeGraniteI18nImplBundlePseudoTranslations'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeGraniteI18nImplPreferencesLocaleResolverService'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeGraniteInfocollectorInfoCollector'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeGraniteJettySslInternalGraniteSslConnectorFactory'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeGraniteLicenseImplLicenseCheckFilter'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeGraniteLoggingImplLogAnalyserImpl'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeGraniteLoggingImplLogErrorHealthCheck'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTask'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTask'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTask'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeGraniteMonitoringImplScriptConfigImpl'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHan'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeGraniteOauthServerImplAccessTokenCleanupTask'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServlet'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServlet'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServlet'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServlet'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeGraniteOffloadingImplOffloadingConfigurator'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeGraniteOffloadingImplOffloadingJobCloner'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeGraniteOffloadingImplOffloadingJobOffloader'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManager'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspo'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImpl'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeGraniteOptoutImplOptOutServiceImpl'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheck'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeGraniteQueriesImplHcLargeIndexHealthCheck'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheck'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeGraniteQueriesImplHcQueryHealthCheckMetrics'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheck'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheck'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthC'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheck'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthC'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeGraniteRepositoryHcImplContinuousRGCHealthCheck'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthChe'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheck'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheck'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheck'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeGraniteRepositoryImplCommitStatsConfig'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeGraniteRepositoryServiceUserConfiguration'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckIm'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeGraniteResourcestatusImplCompositeStatusType'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeGraniteResourcestatusImplStatusResourceProviderImpl'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeGraniteRestAssetsImplAssetContentDispositionFilter'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImpl'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeGraniteRestImplServletDefaultGETServlet'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationS'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeGraniteSecurityUserUserPropertiesService'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeGraniteSocialgraphImplSocialGraphFactoryImpl'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImpl'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactory'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeGraniteTaskmanagementImplJcrTaskArchiveService'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTask'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactor'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeGraniteThreaddumpThreadDumpCollector'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTransl'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeGraniteTranslationCoreImplTranslationManagerImpl'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImpl'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeature'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventService'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManager'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandler'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeGraniteWorkflowCoreJobJobHandler'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsum'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeGraniteWorkflowCorePayloadMapCache'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListener'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeGraniteWorkflowCoreWorkflowConfig'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeGraniteWorkflowCoreWorkflowSessionFactory'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeGraniteWorkflowPurgeScheduler'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeOctopusNcommBootstrap'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullS'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComAdobeXmpWorkerFilesNcommXMPFilesNComm'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCommonsDatasourceJdbcpoolJdbcPoolService'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCommonsHttpclient'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqAnalyticsImplStorePropertiesChangeListener'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporte'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqAnalyticsSitecatalystImplImporterReportImporter'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactory'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImpl'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdater'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListener'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListener'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqAnalyticsTestandtargetImplSegmentImporter'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqAnalyticsTestandtargetImplServiceWebServiceImpl'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqAnalyticsTestandtargetImplServletsAdminServerServlet'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImpl'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqAuthImplCugCugSupportImpl'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqAuthImplLoginSelectorHandler'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqCommonsImplExternalizerImpl'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqCommonsServletsRootMappingServlet'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionChecke'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreList'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelist'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqContentsyncImplContentSyncManagerImpl'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqDamCommonsHandlerStandardImageHandler'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqDamCommonsMetadataXmpFilterBlackWhite'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqDamCommonsUtilImplAssetCacheImpl'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfig'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqDamCoreImplAssetMoveListener'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqDamCoreImplAssethomeAssetHomePageConfiguration'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServlet'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqDamCoreImplCacheCQBufferedImageCache'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqDamCoreImplDamChangeEventListener'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqDamCoreImplDamEventPurgeService'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqDamCoreImplDamEventRecorderImpl'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqDamCoreImplEventDamEventAuditListener'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqDamCoreImplExpiryNotificationJobImpl'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeat'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqDamCoreImplGfxCommonsGfxRenderer'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqDamCoreImplHandlerEPSFormatHandler'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqDamCoreImplHandlerIndesignFormatHandler'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqDamCoreImplHandlerJpegHandler'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqDamCoreImplHandlerXmpNCommXMPHandler'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqDamCoreImplJmxAssetIndexUpdateMonitor'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqDamCoreImplJmxAssetMigrationMBeanImpl'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqDamCoreImplJmxAssetUpdateMonitorImpl'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfig'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfig'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqDamCoreImplLightboxLightboxServlet'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqDamCoreImplMetadataEditorSelectComponentHandler'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelper'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImpl'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqDamCoreImplMissingMetadataNotificationJob'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPr'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqDamCoreImplProcessTextExtractionProcess'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqDamCoreImplRenditionMakerImpl'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqDamCoreImplReportsReportExportService'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqDamCoreImplReportsReportPurgeService'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqDamCoreImplServletAssetDownloadServlet'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqDamCoreImplServletAssetStatusServlet'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqDamCoreImplServletAssetXMPSearchServlet'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqDamCoreImplServletBatchMetadataServlet'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqDamCoreImplServletBinaryProviderServlet'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqDamCoreImplServletCollectionServlet'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqDamCoreImplServletCollectionsServlet'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqDamCoreImplServletCompanionServlet'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqDamCoreImplServletCreateAssetServlet'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqDamCoreImplServletDamContentDispositionFilter'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqDamCoreImplServletGuidLookupFilter'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqDamCoreImplServletHealthCheckServlet'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqDamCoreImplServletMetadataGetServlet'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqDamCoreImplServletMultipleLicenseAcceptServlet'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqDamCoreImplServletResourceCollectionServlet'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImpl'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqDamCoreImplUnzipUnzipConfig'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqDamCoreProcessExifToolExtractMetadataProcess'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqDamCoreProcessExtractMetadataProcess'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqDamCoreProcessMetadataProcessorProcess'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqDamHandlerFfmpegLocatorImpl'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImpl'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqDamHandlerStandardPdfPdfHandler'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqDamHandlerStandardPsPostScriptHandler'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqDamHandlerStandardPsdPsdHandler'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqDamIdsImplIDSJobProcessor'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqDamIdsImplIDSPoolManagerImpl'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqDamInddImplHandlerIndesignXMPHandler'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqDamInddImplServletSnippetCreationServlet'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqDamInddProcessINDDMediaExtractProcess'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImpl'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJob'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadPro'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEven'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunner'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqDamS7damCommonPostServletsSetCreateHandler'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqDamS7damCommonPostServletsSetModifyHandler'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcess'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqDamS7damCommonS7damDamChangeEventListener'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqDamS7damCommonServletsS7damProductInfoServlet'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImpl'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqDamScene7ImplScene7APIClientImpl'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImpl'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqDamScene7ImplScene7ConfigurationEventListener'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqDamScene7ImplScene7DamChangeEventListener'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqDamScene7ImplScene7FlashTemplatesServiceImpl'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqDamScene7ImplScene7UploadServiceImpl'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSer'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqDamStockIntegrationImplConfigurationStockConfiguration'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqDamVideoImplServletVideoTestServlet'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqExtwidgetServletsImageSpriteServlet'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqImageInternalFontFontHelper'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqJcrclustersupportClusterStartLevelController'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqMailerDefaultMailService'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqMailerImplCqMailingService'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqMailerImplEmailCqEmailTemplateFactory'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqMailerImplEmailCqRetrieverTemplateFactory'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqMcmCampaignImplIntegrationConfigImpl'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqMcmCampaignImporterPersonalizedTextHandlerFactory'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqMcmCoreNewsletterNewsletterEmailServiceImpl'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqMcmImplMCMConfiguration'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponen'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThroug'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponent'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHa'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagH'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqNotificationImplNotificationServiceImpl'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqPersonalizationImplServletsTargetingConfigurationServlet'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqPollingImporterImplManagedPollConfigImpl'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqPollingImporterImplManagedPollingImporterImpl'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqPollingImporterImplPollingImporterImpl'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqReplicationAuditReplicationEventListener'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqReplicationContentStaticContentBuilder'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqReplicationImplAgentManagerImpl'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqReplicationImplContentDurboBinaryLessContentBuilder'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqReplicationImplContentDurboDurboImportConfigurationProv'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqReplicationImplReplicationContentFactoryProviderImpl'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqReplicationImplReplicationReceiverImpl'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqReplicationImplReplicatorImpl'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqReplicationImplReverseReplicator'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqReplicationImplTransportBinaryLessTransportHandler'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqReplicationImplTransportHttp'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqReportingImplCacheCacheImpl'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqReportingImplConfigServiceImpl'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqReportingImplRLogAnalyzer'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqRewriterLinkcheckerImplLinkCheckerImpl'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqRewriterLinkcheckerImplLinkCheckerTask'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactory'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqRewriterLinkcheckerImplLinkInfoStorageImpl'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqRewriterProcessorImplHtmlParserFactory'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqSearchImplBuilderQueryBuilderImpl'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqSearchSuggestImplSuggestionIndexManagerImpl'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandler'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqSearchpromoteImplSearchPromoteServiceImpl'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqSecurityACLSetup'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqStatisticsImplStatisticsServiceImpl'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqTaggingImplJcrTagManagerFactoryImpl'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqTaggingImplSearchTagPredicateEvaluator'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqTaggingImplTagGarbageCollector'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqWcmContentsyncImplHandlerPagesUpdateHandler'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactor'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqWcmCoreImplAuthoringUIModeServiceImpl'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqWcmCoreImplCommandsWCMCommandServlet'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImpl'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqWcmCoreImplEventPageEventAuditListener'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqWcmCoreImplEventPagePostProcessor'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqWcmCoreImplEventRepositoryChangeEventListener'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqWcmCoreImplEventTemplatePostProcessor'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqWcmCoreImplLanguageManagerImpl'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImpl'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqWcmCoreImplPagePageInfoAggregatorImpl'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqWcmCoreImplPagePageManagerFactoryImpl'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqWcmCoreImplReferencesContentContentReferenceConfig'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqWcmCoreImplServletsContentfinderAssetViewHandler'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVie'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqWcmCoreImplServletsContentfinderPageViewHandler'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqWcmCoreImplServletsFindReplaceServlet'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqWcmCoreImplServletsReferenceSearchServlet'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqWcmCoreImplServletsThumbnailServlet'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqWcmCoreImplUtilsDefaultPageNameValidator'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqWcmCoreImplVariantsPageVariantsProviderImpl'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqWcmCoreImplVersionManagerImpl'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqWcmCoreImplVersionPurgeTask'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqWcmCoreImplWCMDebugFilter'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqWcmCoreImplWCMDeveloperModeFilter'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqWcmCoreImplWarpTimeWarpFilter'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqWcmCoreMvtMVTStatisticsImpl'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqWcmCoreStatsPageViewStatisticsImpl'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqWcmCoreWCMRequestFilter'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqWcmDesignimporterDesignPackageImporter'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqWcmDesignimporterImplCanvasBuilderImpl'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqWcmDesignimporterImplCanvasPageDeleteHandler'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqWcmDesignimporterImplEntryPreprocessorImpl'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqWcmDesignimporterImplMobileCanvasBuilderImpl'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqWcmDesignimporterParserTaghandlersFactoryCanvasCompone'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultCompon'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultTagHan'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqWcmDesignimporterParserTaghandlersFactoryHeadTagHandle'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqWcmDesignimporterParserTaghandlersFactoryIFrameTagHand'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqWcmDesignimporterParserTaghandlersFactoryImageComponen'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandler'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqWcmDesignimporterParserTaghandlersFactoryInlineScriptT'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqWcmDesignimporterParserTaghandlersFactoryLinkTagHandle'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqWcmDesignimporterParserTaghandlersFactoryMetaTagHandle'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqWcmDesignimporterParserTaghandlersFactoryNonScriptTagH'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqWcmDesignimporterParserTaghandlersFactoryParsysCompone'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqWcmDesignimporterParserTaghandlersFactoryScriptTagHand'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqWcmDesignimporterParserTaghandlersFactoryStyleTagHandl'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqWcmDesignimporterParserTaghandlersFactoryTextComponent'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleComponen'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleTagHandl'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqWcmFoundationFormsImplFormChooserServlet'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqWcmFoundationFormsImplFormParagraphPostProcessor'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqWcmFoundationFormsImplFormsHandlingServlet'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqWcmFoundationFormsImplMailServlet'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqWcmFoundationImplAdaptiveImageComponentServlet'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqWcmFoundationImplHTTPAuthHandler'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqWcmFoundationImplPageImpressionsTracker'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqWcmFoundationImplPageRedirectServlet'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklist'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImpl'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactory'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqWcmMobileCoreImplRedirectRedirectFilter'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqWcmMsmImplActionsContentCopyActionFactory'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqWcmMsmImplActionsContentDeleteActionFactory'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqWcmMsmImplActionsContentUpdateActionFactory'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqWcmMsmImplActionsOrderChildrenActionFactory'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqWcmMsmImplActionsPageMoveActionFactory'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqWcmMsmImplActionsReferencesUpdateActionFactory'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqWcmMsmImplActionsVersionCopyActionFactory'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqWcmMsmImplLiveRelationshipManagerImpl'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqWcmMsmImplRolloutManagerImpl'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqWcmMsmImplServletsAuditLogServlet'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqWcmNotificationEmailImplEmailChannel'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqWcmNotificationImplNotificationManagerImpl'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqWcmScriptingImplBVPManager'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqWcmUndoUndoConfig'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqWcmWebservicesupportImplReplicationEventListener'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqWcmWorkflowImplWcmWorkflowServiceImpl'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqWcmWorkflowImplWorkflowPackageInfoProvider'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqWidgetImplHtmlLibraryManagerImpl'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqWidgetImplWidgetExtensionProviderImpl'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqWorkflowImplEmailEMailNotificationService'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCqWorkflowImplEmailTaskEMailNotificationService'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCrxSecurityTokenImplImplTokenAuthenticationHandler'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ComDayCrxSecurityTokenImplTokenCleanupTask'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'GuideLocalizationService'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'MessagingUserComponentFactory'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'OrgApacheAriesJmxFrameworkStateConfig'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'OrgApacheFelixEventadminImplEventAdmin'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'OrgApacheFelixHttp'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'OrgApacheFelixHttpSslfilterSslFilter'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'OrgApacheFelixJaasConfigurationFactory'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'OrgApacheFelixJaasConfigurationSpi'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'OrgApacheFelixScrScrService'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'OrgApacheFelixSystemreadyImplComponentsCheck'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'OrgApacheFelixSystemreadyImplFrameworkStartCheck'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'OrgApacheFelixSystemreadyImplServicesCheck'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'OrgApacheFelixSystemreadyImplServletSystemAliveServlet'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'OrgApacheFelixSystemreadyImplServletSystemReadyServlet'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'OrgApacheFelixSystemreadySystemReadyMonitor'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'OrgApacheFelixWebconsoleInternalServletOsgiManager'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'OrgApacheFelixWebconsolePluginsEventInternalPluginServlet'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCo'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'OrgApacheHttpProxyconfigurator'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProvider'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStore'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreService'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePre'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCac'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'OrgApacheJackrabbitOakPluginsIndexAsyncIndexerService'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServ'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCo'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServers'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfiguration'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConf'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvid'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSe'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactory'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'OrgApacheJackrabbitOakPluginsObservationChangeCollectorProvider'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'OrgApacheJackrabbitOakQueryQueryEngineSettingsService'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfig'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdenti'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfigura'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigur'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistrati'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeName'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'OrgApacheJackrabbitOakSecurityUserUserConfigurationImpl'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreService'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactory'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorService'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'OrgApacheJackrabbitOakSegmentSegmentNodeStoreService'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreService'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDe'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplEx'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPr'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfi'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExclu'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizable'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'OrgApacheJackrabbitVaultPackagingImplPackagingImpl'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistry'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'OrgApacheSlingAuthCoreImplLogoutServlet'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'OrgApacheSlingCaconfigImplConfigurationBindingsValueProvider'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'OrgApacheSlingCaconfigImplConfigurationResolverImpl'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStra'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStra'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProvi'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOve'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'OrgApacheSlingCaconfigManagementImplConfigurationManagementSetti'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResour'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategy'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParser'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'OrgApacheSlingCommonsLogLogManager'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'OrgApacheSlingCommonsLogLogManagerFactoryConfig'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'OrgApacheSlingCommonsLogLogManagerFactoryWriter'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'OrgApacheSlingCommonsMetricsInternalLogReporter'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporter'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'OrgApacheSlingCommonsMimeInternalMimeTypeServiceImpl'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'OrgApacheSlingCommonsSchedulerImplQuartzScheduler'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheck'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactory'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'OrgApacheSlingDatasourceDataSourceFactory'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'OrgApacheSlingDatasourceJNDIDataSourceFactory'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'OrgApacheSlingDiscoveryOakConfig'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheck'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'OrgApacheSlingDistributionAgentImplForwardDistributionAgentFacto'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestA'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactory'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'OrgApacheSlingDistributionAgentImplReverseDistributionAgentFacto'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactor'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactory'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'OrgApacheSlingDistributionMonitorDistributionQueueHealthCheck'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'OrgApacheSlingDistributionPackagingImplExporterAgentDistributio'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'OrgApacheSlingDistributionPackagingImplExporterLocalDistributio'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'OrgApacheSlingDistributionPackagingImplExporterRemoteDistributi'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'OrgApacheSlingDistributionPackagingImplImporterLocalDistributio'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'OrgApacheSlingDistributionPackagingImplImporterRemoteDistributi'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'OrgApacheSlingDistributionPackagingImplImporterRepositoryDistri'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'OrgApacheSlingDistributionResourcesImplDistributionConfiguration'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'OrgApacheSlingDistributionResourcesImplDistributionServiceResour'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'OrgApacheSlingDistributionSerializationImplDistributionPackageBu'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'OrgApacheSlingDistributionSerializationImplVltVaultDistribution'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'OrgApacheSlingDistributionTransportImplUserCredentialsDistributi'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'OrgApacheSlingDistributionTriggerImplDistributionEventDistribute'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'OrgApacheSlingDistributionTriggerImplJcrEventDistributionTrigger'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributi'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrig'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'OrgApacheSlingDistributionTriggerImplResourceEventDistributionTr'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'OrgApacheSlingDistributionTriggerImplScheduledDistributionTrigge'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'OrgApacheSlingEngineImplAuthSlingAuthenticator'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilter'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'OrgApacheSlingEngineImplLogRequestLogger'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'OrgApacheSlingEngineImplLogRequestLoggerService'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'OrgApacheSlingEngineImplSlingMainServlet'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'OrgApacheSlingEngineParameters'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'OrgApacheSlingEventImplEventingThreadPool'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'OrgApacheSlingEventImplJobsDefaultJobManager'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'OrgApacheSlingEventImplJobsJcrPersistenceHandler'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'OrgApacheSlingEventImplJobsJobConsumerManager'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'OrgApacheSlingEventJobsQueueConfiguration'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingW'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'OrgApacheSlingFeatureflagsFeature'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'OrgApacheSlingFeatureflagsImplConfiguredFeature'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'OrgApacheSlingHapiImplHApiUtilImpl'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'OrgApacheSlingHcCoreImplCompositeHealthCheck'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImpl'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'OrgApacheSlingHcCoreImplJmxAttributeHealthCheck'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'OrgApacheSlingHcCoreImplScriptableHealthCheck'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'OrgApacheSlingHcCoreImplServletHealthCheckExecutorServlet'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializer'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'OrgApacheSlingI18nImplI18NFilter'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'OrgApacheSlingI18nImplJcrResourceBundleProvider'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'OrgApacheSlingInstallerProviderJcrImplJcrInstaller'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'OrgApacheSlingJcrBaseInternalLoginAdminWhitelist'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragment'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'OrgApacheSlingJcrDavexImplServletsSlingDavExServlet'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupport'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupport'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'OrgApacheSlingJcrRepoinitImplRepositoryInitializer'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'OrgApacheSlingJcrRepoinitRepositoryInitializer'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImpl'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'OrgApacheSlingJcrResourceInternalJcrSystemUserValidator'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactory'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerService'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServic'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServlet'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'OrgApacheSlingJmxProviderImplJMXResourceProvider'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'OrgApacheSlingModelsImplModelAdapterFactory'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'OrgApacheSlingModelsJacksonexporterImplResourceModuleProvider'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFacto'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'OrgApacheSlingResourcemergerImplMergedResourceProviderFactory'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'OrgApacheSlingResourcemergerPickerOverriding'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'OrgApacheSlingScriptingCoreImplScriptCacheImpl'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'OrgApacheSlingScriptingCoreImplScriptingResourceResolverProvider'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'OrgApacheSlingScriptingJavaImplJavaScriptEngineFactory'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFa'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'OrgApacheSlingScriptingJspJspScriptEngineFactory'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProv'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'OrgApacheSlingSecurityImplContentDispositionFilter'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'OrgApacheSlingSecurityImplReferrerFilter'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'OrgApacheSlingServiceusermappingImplServiceUserMapperImpl'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmended'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'OrgApacheSlingServletsGetDefaultGetServlet'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'OrgApacheSlingServletsGetImplVersionVersionInfoServlet'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'OrgApacheSlingServletsPostImplHelperChunkCleanUpTask'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'OrgApacheSlingServletsPostImplSlingPostServlet'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'OrgApacheSlingServletsResolverSlingServletResolver'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'OrgApacheSlingSettingsImplSlingSettingsServiceImpl'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'OrgApacheSlingStartupfilterImplStartupFilterImpl'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'OrgApacheSlingTenantInternalTenantProviderImpl'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'OrgApacheSlingTracerInternalLogTracer'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'OrgApacheSlingXssImplXSSFilterImpl'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(Req, State) ->
    {[], Req, State}.

-spec is_authorized(Req :: cowboy_req:req(), State :: state()) ->
    {
        Value :: true | {false, AuthHeader :: iodata()},
        Req :: cowboy_req:req(),
        State :: state()
    }.
is_authorized(
    Req0,
    State = #state{
        operation_id = 'AdaptiveFormAndInteractiveCommunicationWebChannelConfiguration' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigur' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'AnalyticsComponentQueryCacheService' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ApacheSlingHealthCheckResultHTMLSerializer' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfiguration' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeAemTransactionCoreImplTransactionRecorder' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHC' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHC' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImpl' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImpl' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqAccountApiAccountManagementService' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqAccountImplAccountManagementServlet' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqAddressImplLocationLocationListServlet' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqAuditPurgeDam' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqAuditPurgePages' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqAuditPurgeReplication' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqCdnRewriterImplAWSCloudFrontRewriter' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqCdnRewriterImplCDNConfigServiceImpl' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqCdnRewriterImplCDNRewriter' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandle' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqCommerceImplAssetDynamicImageHandler' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImpl' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqCommerceImplAssetStaticImageHandler' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqCommerceImplAssetVideoHandler' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqCommerceImplPromotionPromotionManagerImpl' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImpl' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqCommercePimImplPageEventListener' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqCommercePimImplProductfeedProductFeedServiceImpl' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqContentinsightImplReportingServicesSettingsProvider' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqContentinsightImplServletsBrightEdgeProxyServlet' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqContentinsightImplServletsReportingServicesProxyServle' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqDamCfmImplComponentComponentConfigImpl' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqDamCfmImplConfFeatureConfigImpl' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqDamCfmImplContentRewriterAssetProcessor' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqDamCfmImplContentRewriterParRangeFilter' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqDamCfmImplContentRewriterPayloadFilter' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqDamDmProcessImagePTiffManagerImpl' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorker' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqDamMacSyncHelperImplMACSyncClientImpl' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqDamMacSyncImplDAMSyncServiceImpl' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqDamProcessorNuiImplNuiAssetProcessor' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqDamS7imagingImplIsImageServerComponent' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqDamS7imagingImplPsPlatformServerServlet' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqDamWebdavImplIoAssetIOHandler' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJob' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqDamWebdavImplIoSpecialFilesHandler' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqDeserfwImplDeserializationFirewallImpl' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqDtmImplServiceDTMWebServiceImpl' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqDtmImplServletsDTMDeployHookServlet' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqDtmReactorImplServiceWebServiceImpl' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqExperiencelogImplExperienceLogConfigServlet' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqHcContentPackagesHealthCheck' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqHistoryImplHistoryRequestFilter' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqHistoryImplHistoryServiceImpl' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqInboxImplTypeproviderItemTypeProvider' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqProjectsImplServletProjectImageServlet' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqProjectsPurgeScheduler' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqScheduledExporterImplScheduledExporterImpl' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImpl' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqScreensDeviceImplDeviceService' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImpl' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqScreensImplHandlerChannelsUpdateHandler' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJob' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqScreensImplRemoteImplDistributedHttpClientImpl' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqScreensImplScreensChannelPostProcessor' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImpl' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqScreensMqActivemqImplArtemisJMSProvider' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImpl' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImpl' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqScreensSegmentationImplSegmentationFeatureFlag' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthCh' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheck' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheck' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheck' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheck' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialAccountverificationImplAccountManagementConfigIm' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponen' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCo' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandler' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialActivitystreamsListenerImplModerationEventExten' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivityS' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStre' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsI' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmen' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialCalendarServletsTimeZoneServlet' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEvent' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSe' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperati' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialC' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPos' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialCommonsCorsCORSAuthenticationFilter' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProvider' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImpl' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListener' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialCommonsEmailreplyImplCustomEmailClientProvider' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImp' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImp' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporter' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialCommonsEmailreplyImplGmailEmailClientProvider' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProvider' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProvider' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialCommonsEmailreplyImplOutLookEmailClientProvider' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProvider' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProvider' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUpload' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImpl' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimit' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialConnectOauthImplFacebookProviderImpl' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandle' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapper' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialConnectOauthImplTwitterProviderImpl' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmen' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialDatastoreAsImplASResourceProviderFactory' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactory' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactor' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorF' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFacto' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialEnablementLearningpathEndpointsImplEnablementL' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResou' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialEnablementServicesImplAuthorMarkerImpl' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGe' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOpera' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialForumClientEndpointsImplForumOperationsService' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialForumDispatcherImplFlushOperations' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponen' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialGroupImplGroupServiceImpl' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialHandlebarsGuavaTemplateCacheImpl' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsS' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSer' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfile' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileO' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentF' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperation' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponen' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialModerationDashboardApiModerationDashboardSocial' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponen' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSoci' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialNotificationsImplMentionsRouter' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialNotificationsImplNotificationManagerImpl' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialNotificationsImplNotificationsRouter' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServic' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportI' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportM' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportS' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServi' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServlet' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServlet' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialScoringImplScoringEventListener' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImpl' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialSiteEndpointsImplSiteOperationService' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceIm' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialSiteImplSiteConfiguratorImpl' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialSrpImplSocialSolrConnector' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialSyncImplDiffChangesObserver' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialSyncImplGroupSyncListenerImpl' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialSyncImplPublisherSyncServiceImpl' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialSyncImplUserSyncListenerImpl' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialTranslationImplTranslationServiceConfigManager' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialTranslationImplUGCLanguageDetector' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImpl' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImpl' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialUgcbaseImplPublisherConfigurationImpl' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialUgcbaseImplSocialUtilsImpl' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialUgcbaseModerationImplAutoModerationImpl' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialUgcbaseModerationImplSentimentProcess' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackli' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImpl' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServlet' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialUserImplTransportHttpToPublisher' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFact' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqUpgradesCleanupImplUpgradeContentCleanup' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanup' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderService' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTask' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderService' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderService' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqWcmLaunchesImplLaunchesEventHandler' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqWcmMobileQrcodeServletQRCodeImageGenerator' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImpl' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImpl' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigService' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeFdFpConfigFormsPortalSchedulerService' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeFormsCommonServiceImplDefaultDataProvider' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImp' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeFormsCommonServletTempCleanUpTask' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteAcpPlatformPlatformServlet' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteActivitystreamsImplActivityManagerImpl' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteAnalyzerBaseSystemStatusServlet' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServlet' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteApicontrollerFilterResolverHookFactory' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteAuthCertImplClientCertAuthHandler' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteAuthIms' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtension' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImpl' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidator' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteAuthImsImplIMSProviderImpl' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteAuthImsImplImsConfigProviderImpl' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteAuthOauthAccesstokenProvider' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteAuthOauthImplBearerAuthenticationHandler' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImpl' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteAuthOauthImplFacebookProviderImpl' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteAuthOauthImplGithubProviderImpl' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteAuthOauthImplGraniteProvider' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteAuthOauthImplHelperProviderConfigManager' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternal' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandler' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteAuthOauthImplTwitterProviderImpl' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteAuthOauthProvider' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteAuthRequirementImplDefaultRequirementHandler' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteAuthSamlSamlAuthenticationHandler' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteAuthSsoImplSsoAuthenticationHandler' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteBundlesHcImplCodeCacheHealthCheck' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheck' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteBundlesHcImplDavExBundleHealthCheck' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheck' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteBundlesHcImplJobsHealthCheck' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteBundlesHcImplSlingGetServletHealthCheck' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheck' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheck' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheck' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheck' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFac' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImpl' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteCompatrouterImplRoutingConfig' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteCompatrouterImplSwitchMappingConfig' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolving' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteContexthubImplContextHubImpl' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteCorsImplCORSPolicyImpl' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteCsrfImplCSRFFilter' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteCsrfImplCSRFServlet' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSe' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserver' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteDistributionCoreImplDiffDiffEventListener' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteDistributionCoreImplDistributionToReplicationEven' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicat' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteDistributionCoreImplReplicationDistributionTrans' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribu' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteFragsImplCheckHttpHeaderFlag' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteFragsImplRandomFeature' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteHttpcacheFileFileCacheStore' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteHttpcacheImplOuterCacheFilter' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteI18nImplBundlePseudoTranslations' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteI18nImplPreferencesLocaleResolverService' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteInfocollectorInfoCollector' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteJettySslInternalGraniteSslConnectorFactory' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteLicenseImplLicenseCheckFilter' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteLoggingImplLogAnalyserImpl' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteLoggingImplLogErrorHealthCheck' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTask' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTask' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTask' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteMonitoringImplScriptConfigImpl' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHan' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteOauthServerImplAccessTokenCleanupTask' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServlet' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServlet' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServlet' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServlet' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteOffloadingImplOffloadingConfigurator' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteOffloadingImplOffloadingJobCloner' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteOffloadingImplOffloadingJobOffloader' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManager' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspo' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImpl' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteOptoutImplOptOutServiceImpl' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheck' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteQueriesImplHcLargeIndexHealthCheck' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheck' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteQueriesImplHcQueryHealthCheckMetrics' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheck' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheck' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthC' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheck' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthC' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteRepositoryHcImplContinuousRGCHealthCheck' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthChe' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheck' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheck' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheck' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteRepositoryImplCommitStatsConfig' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteRepositoryServiceUserConfiguration' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckIm' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteResourcestatusImplCompositeStatusType' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteResourcestatusImplStatusResourceProviderImpl' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteRestAssetsImplAssetContentDispositionFilter' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImpl' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteRestImplServletDefaultGETServlet' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationS' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteSecurityUserUserPropertiesService' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteSocialgraphImplSocialGraphFactoryImpl' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImpl' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactory' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteTaskmanagementImplJcrTaskArchiveService' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTask' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactor' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteThreaddumpThreadDumpCollector' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTransl' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteTranslationCoreImplTranslationManagerImpl' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImpl' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeature' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventService' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManager' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandler' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteWorkflowCoreJobJobHandler' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsum' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteWorkflowCorePayloadMapCache' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListener' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteWorkflowCoreWorkflowConfig' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteWorkflowCoreWorkflowSessionFactory' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteWorkflowPurgeScheduler' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeOctopusNcommBootstrap' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullS' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComAdobeXmpWorkerFilesNcommXMPFilesNComm' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCommonsDatasourceJdbcpoolJdbcPoolService' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCommonsHttpclient' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqAnalyticsImplStorePropertiesChangeListener' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporte' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqAnalyticsSitecatalystImplImporterReportImporter' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactory' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImpl' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdater' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListener' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListener' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqAnalyticsTestandtargetImplSegmentImporter' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqAnalyticsTestandtargetImplServiceWebServiceImpl' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqAnalyticsTestandtargetImplServletsAdminServerServlet' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImpl' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqAuthImplCugCugSupportImpl' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqAuthImplLoginSelectorHandler' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqCommonsImplExternalizerImpl' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqCommonsServletsRootMappingServlet' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionChecke' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreList' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelist' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqContentsyncImplContentSyncManagerImpl' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqDamCommonsHandlerStandardImageHandler' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqDamCommonsMetadataXmpFilterBlackWhite' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqDamCommonsUtilImplAssetCacheImpl' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfig' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqDamCoreImplAssetMoveListener' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqDamCoreImplAssethomeAssetHomePageConfiguration' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServlet' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqDamCoreImplCacheCQBufferedImageCache' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqDamCoreImplDamChangeEventListener' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqDamCoreImplDamEventPurgeService' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqDamCoreImplDamEventRecorderImpl' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqDamCoreImplEventDamEventAuditListener' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqDamCoreImplExpiryNotificationJobImpl' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeat' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqDamCoreImplGfxCommonsGfxRenderer' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqDamCoreImplHandlerEPSFormatHandler' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqDamCoreImplHandlerIndesignFormatHandler' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqDamCoreImplHandlerJpegHandler' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqDamCoreImplHandlerXmpNCommXMPHandler' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqDamCoreImplJmxAssetIndexUpdateMonitor' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqDamCoreImplJmxAssetMigrationMBeanImpl' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqDamCoreImplJmxAssetUpdateMonitorImpl' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfig' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfig' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqDamCoreImplLightboxLightboxServlet' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqDamCoreImplMetadataEditorSelectComponentHandler' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelper' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImpl' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqDamCoreImplMissingMetadataNotificationJob' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPr' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqDamCoreImplProcessTextExtractionProcess' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqDamCoreImplRenditionMakerImpl' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqDamCoreImplReportsReportExportService' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqDamCoreImplReportsReportPurgeService' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqDamCoreImplServletAssetDownloadServlet' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqDamCoreImplServletAssetStatusServlet' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqDamCoreImplServletAssetXMPSearchServlet' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqDamCoreImplServletBatchMetadataServlet' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqDamCoreImplServletBinaryProviderServlet' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqDamCoreImplServletCollectionServlet' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqDamCoreImplServletCollectionsServlet' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqDamCoreImplServletCompanionServlet' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqDamCoreImplServletCreateAssetServlet' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqDamCoreImplServletDamContentDispositionFilter' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqDamCoreImplServletGuidLookupFilter' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqDamCoreImplServletHealthCheckServlet' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqDamCoreImplServletMetadataGetServlet' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqDamCoreImplServletMultipleLicenseAcceptServlet' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqDamCoreImplServletResourceCollectionServlet' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImpl' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqDamCoreImplUnzipUnzipConfig' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqDamCoreProcessExifToolExtractMetadataProcess' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqDamCoreProcessExtractMetadataProcess' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqDamCoreProcessMetadataProcessorProcess' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqDamHandlerFfmpegLocatorImpl' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImpl' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqDamHandlerStandardPdfPdfHandler' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqDamHandlerStandardPsPostScriptHandler' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqDamHandlerStandardPsdPsdHandler' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqDamIdsImplIDSJobProcessor' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqDamIdsImplIDSPoolManagerImpl' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqDamInddImplHandlerIndesignXMPHandler' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqDamInddImplServletSnippetCreationServlet' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqDamInddProcessINDDMediaExtractProcess' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImpl' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJob' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadPro' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEven' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunner' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqDamS7damCommonPostServletsSetCreateHandler' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqDamS7damCommonPostServletsSetModifyHandler' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcess' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqDamS7damCommonS7damDamChangeEventListener' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqDamS7damCommonServletsS7damProductInfoServlet' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImpl' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqDamScene7ImplScene7APIClientImpl' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImpl' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqDamScene7ImplScene7ConfigurationEventListener' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqDamScene7ImplScene7DamChangeEventListener' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqDamScene7ImplScene7FlashTemplatesServiceImpl' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqDamScene7ImplScene7UploadServiceImpl' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSer' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqDamStockIntegrationImplConfigurationStockConfiguration' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqDamVideoImplServletVideoTestServlet' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqExtwidgetServletsImageSpriteServlet' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqImageInternalFontFontHelper' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqJcrclustersupportClusterStartLevelController' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqMailerDefaultMailService' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqMailerImplCqMailingService' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqMailerImplEmailCqEmailTemplateFactory' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqMailerImplEmailCqRetrieverTemplateFactory' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqMcmCampaignImplIntegrationConfigImpl' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqMcmCampaignImporterPersonalizedTextHandlerFactory' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqMcmCoreNewsletterNewsletterEmailServiceImpl' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqMcmImplMCMConfiguration' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponen' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThroug' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponent' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHa' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagH' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqNotificationImplNotificationServiceImpl' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqPersonalizationImplServletsTargetingConfigurationServlet' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqPollingImporterImplManagedPollConfigImpl' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqPollingImporterImplManagedPollingImporterImpl' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqPollingImporterImplPollingImporterImpl' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqReplicationAuditReplicationEventListener' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqReplicationContentStaticContentBuilder' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqReplicationImplAgentManagerImpl' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqReplicationImplContentDurboBinaryLessContentBuilder' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqReplicationImplContentDurboDurboImportConfigurationProv' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqReplicationImplReplicationContentFactoryProviderImpl' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqReplicationImplReplicationReceiverImpl' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqReplicationImplReplicatorImpl' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqReplicationImplReverseReplicator' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqReplicationImplTransportBinaryLessTransportHandler' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqReplicationImplTransportHttp' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqReportingImplCacheCacheImpl' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqReportingImplConfigServiceImpl' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqReportingImplRLogAnalyzer' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqRewriterLinkcheckerImplLinkCheckerImpl' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqRewriterLinkcheckerImplLinkCheckerTask' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactory' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqRewriterLinkcheckerImplLinkInfoStorageImpl' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqRewriterProcessorImplHtmlParserFactory' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqSearchImplBuilderQueryBuilderImpl' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqSearchSuggestImplSuggestionIndexManagerImpl' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandler' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqSearchpromoteImplSearchPromoteServiceImpl' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqSecurityACLSetup' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqStatisticsImplStatisticsServiceImpl' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqTaggingImplJcrTagManagerFactoryImpl' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqTaggingImplSearchTagPredicateEvaluator' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqTaggingImplTagGarbageCollector' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqWcmContentsyncImplHandlerPagesUpdateHandler' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactor' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqWcmCoreImplAuthoringUIModeServiceImpl' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqWcmCoreImplCommandsWCMCommandServlet' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImpl' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqWcmCoreImplEventPageEventAuditListener' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqWcmCoreImplEventPagePostProcessor' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqWcmCoreImplEventRepositoryChangeEventListener' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqWcmCoreImplEventTemplatePostProcessor' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqWcmCoreImplLanguageManagerImpl' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImpl' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqWcmCoreImplPagePageInfoAggregatorImpl' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqWcmCoreImplPagePageManagerFactoryImpl' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqWcmCoreImplReferencesContentContentReferenceConfig' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqWcmCoreImplServletsContentfinderAssetViewHandler' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVie' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqWcmCoreImplServletsContentfinderPageViewHandler' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqWcmCoreImplServletsFindReplaceServlet' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqWcmCoreImplServletsReferenceSearchServlet' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqWcmCoreImplServletsThumbnailServlet' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqWcmCoreImplUtilsDefaultPageNameValidator' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqWcmCoreImplVariantsPageVariantsProviderImpl' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqWcmCoreImplVersionManagerImpl' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqWcmCoreImplVersionPurgeTask' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqWcmCoreImplWCMDebugFilter' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqWcmCoreImplWCMDeveloperModeFilter' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqWcmCoreImplWarpTimeWarpFilter' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqWcmCoreMvtMVTStatisticsImpl' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqWcmCoreStatsPageViewStatisticsImpl' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqWcmCoreWCMRequestFilter' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqWcmDesignimporterDesignPackageImporter' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqWcmDesignimporterImplCanvasBuilderImpl' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqWcmDesignimporterImplCanvasPageDeleteHandler' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqWcmDesignimporterImplEntryPreprocessorImpl' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqWcmDesignimporterImplMobileCanvasBuilderImpl' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqWcmDesignimporterParserTaghandlersFactoryCanvasCompone' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultCompon' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultTagHan' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqWcmDesignimporterParserTaghandlersFactoryHeadTagHandle' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqWcmDesignimporterParserTaghandlersFactoryIFrameTagHand' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqWcmDesignimporterParserTaghandlersFactoryImageComponen' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandler' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqWcmDesignimporterParserTaghandlersFactoryInlineScriptT' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqWcmDesignimporterParserTaghandlersFactoryLinkTagHandle' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqWcmDesignimporterParserTaghandlersFactoryMetaTagHandle' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqWcmDesignimporterParserTaghandlersFactoryNonScriptTagH' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqWcmDesignimporterParserTaghandlersFactoryParsysCompone' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqWcmDesignimporterParserTaghandlersFactoryScriptTagHand' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqWcmDesignimporterParserTaghandlersFactoryStyleTagHandl' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqWcmDesignimporterParserTaghandlersFactoryTextComponent' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleComponen' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleTagHandl' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqWcmFoundationFormsImplFormChooserServlet' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqWcmFoundationFormsImplFormParagraphPostProcessor' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqWcmFoundationFormsImplFormsHandlingServlet' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqWcmFoundationFormsImplMailServlet' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqWcmFoundationImplAdaptiveImageComponentServlet' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqWcmFoundationImplHTTPAuthHandler' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqWcmFoundationImplPageImpressionsTracker' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqWcmFoundationImplPageRedirectServlet' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklist' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImpl' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactory' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqWcmMobileCoreImplRedirectRedirectFilter' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqWcmMsmImplActionsContentCopyActionFactory' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqWcmMsmImplActionsContentDeleteActionFactory' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqWcmMsmImplActionsContentUpdateActionFactory' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqWcmMsmImplActionsOrderChildrenActionFactory' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqWcmMsmImplActionsPageMoveActionFactory' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqWcmMsmImplActionsReferencesUpdateActionFactory' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqWcmMsmImplActionsVersionCopyActionFactory' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqWcmMsmImplLiveRelationshipManagerImpl' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqWcmMsmImplRolloutManagerImpl' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqWcmMsmImplServletsAuditLogServlet' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqWcmNotificationEmailImplEmailChannel' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqWcmNotificationImplNotificationManagerImpl' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqWcmScriptingImplBVPManager' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqWcmUndoUndoConfig' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqWcmWebservicesupportImplReplicationEventListener' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqWcmWorkflowImplWcmWorkflowServiceImpl' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqWcmWorkflowImplWorkflowPackageInfoProvider' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqWidgetImplHtmlLibraryManagerImpl' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqWidgetImplWidgetExtensionProviderImpl' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqWorkflowImplEmailEMailNotificationService' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCqWorkflowImplEmailTaskEMailNotificationService' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCrxSecurityTokenImplImplTokenAuthenticationHandler' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'ComDayCrxSecurityTokenImplTokenCleanupTask' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'GuideLocalizationService' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'MessagingUserComponentFactory' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'OrgApacheAriesJmxFrameworkStateConfig' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'OrgApacheFelixEventadminImplEventAdmin' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'OrgApacheFelixHttp' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'OrgApacheFelixHttpSslfilterSslFilter' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'OrgApacheFelixJaasConfigurationFactory' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'OrgApacheFelixJaasConfigurationSpi' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'OrgApacheFelixScrScrService' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'OrgApacheFelixSystemreadyImplComponentsCheck' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'OrgApacheFelixSystemreadyImplFrameworkStartCheck' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'OrgApacheFelixSystemreadyImplServicesCheck' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'OrgApacheFelixSystemreadyImplServletSystemAliveServlet' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'OrgApacheFelixSystemreadyImplServletSystemReadyServlet' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'OrgApacheFelixSystemreadySystemReadyMonitor' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'OrgApacheFelixWebconsoleInternalServletOsgiManager' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'OrgApacheFelixWebconsolePluginsEventInternalPluginServlet' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCo' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'OrgApacheHttpProxyconfigurator' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProvider' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStore' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreService' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePre' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCac' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'OrgApacheJackrabbitOakPluginsIndexAsyncIndexerService' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServ' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCo' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServers' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfiguration' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConf' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvid' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSe' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactory' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'OrgApacheJackrabbitOakPluginsObservationChangeCollectorProvider' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'OrgApacheJackrabbitOakQueryQueryEngineSettingsService' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfig' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdenti' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfigura' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigur' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistrati' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeName' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'OrgApacheJackrabbitOakSecurityUserUserConfigurationImpl' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreService' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactory' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorService' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'OrgApacheJackrabbitOakSegmentSegmentNodeStoreService' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreService' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDe' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplEx' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPr' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfi' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExclu' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizable' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'OrgApacheJackrabbitVaultPackagingImplPackagingImpl' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistry' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingAuthCoreImplLogoutServlet' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingCaconfigImplConfigurationBindingsValueProvider' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingCaconfigImplConfigurationResolverImpl' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStra' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStra' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProvi' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOve' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingCaconfigManagementImplConfigurationManagementSetti' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResour' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategy' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParser' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingCommonsLogLogManager' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingCommonsLogLogManagerFactoryConfig' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingCommonsLogLogManagerFactoryWriter' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingCommonsMetricsInternalLogReporter' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporter' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingCommonsMimeInternalMimeTypeServiceImpl' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingCommonsSchedulerImplQuartzScheduler' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheck' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactory' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingDatasourceDataSourceFactory' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingDatasourceJNDIDataSourceFactory' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingDiscoveryOakConfig' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheck' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingDistributionAgentImplForwardDistributionAgentFacto' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestA' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactory' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingDistributionAgentImplReverseDistributionAgentFacto' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactor' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactory' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingDistributionMonitorDistributionQueueHealthCheck' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingDistributionPackagingImplExporterAgentDistributio' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingDistributionPackagingImplExporterLocalDistributio' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingDistributionPackagingImplExporterRemoteDistributi' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingDistributionPackagingImplImporterLocalDistributio' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingDistributionPackagingImplImporterRemoteDistributi' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingDistributionPackagingImplImporterRepositoryDistri' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingDistributionResourcesImplDistributionConfiguration' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingDistributionResourcesImplDistributionServiceResour' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingDistributionSerializationImplDistributionPackageBu' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingDistributionSerializationImplVltVaultDistribution' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingDistributionTransportImplUserCredentialsDistributi' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingDistributionTriggerImplDistributionEventDistribute' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingDistributionTriggerImplJcrEventDistributionTrigger' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributi' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrig' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingDistributionTriggerImplResourceEventDistributionTr' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingDistributionTriggerImplScheduledDistributionTrigge' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingEngineImplAuthSlingAuthenticator' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilter' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingEngineImplLogRequestLogger' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingEngineImplLogRequestLoggerService' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingEngineImplSlingMainServlet' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingEngineParameters' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingEventImplEventingThreadPool' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingEventImplJobsDefaultJobManager' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingEventImplJobsJcrPersistenceHandler' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingEventImplJobsJobConsumerManager' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingEventJobsQueueConfiguration' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingW' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingFeatureflagsFeature' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingFeatureflagsImplConfiguredFeature' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingHapiImplHApiUtilImpl' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingHcCoreImplCompositeHealthCheck' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImpl' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingHcCoreImplJmxAttributeHealthCheck' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingHcCoreImplScriptableHealthCheck' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingHcCoreImplServletHealthCheckExecutorServlet' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializer' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingI18nImplI18NFilter' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingI18nImplJcrResourceBundleProvider' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingInstallerProviderJcrImplJcrInstaller' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingJcrBaseInternalLoginAdminWhitelist' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragment' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingJcrDavexImplServletsSlingDavExServlet' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupport' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupport' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingJcrRepoinitImplRepositoryInitializer' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingJcrRepoinitRepositoryInitializer' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImpl' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingJcrResourceInternalJcrSystemUserValidator' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactory' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerService' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServic' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServlet' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingJmxProviderImplJMXResourceProvider' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingModelsImplModelAdapterFactory' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingModelsJacksonexporterImplResourceModuleProvider' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFacto' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingResourcemergerImplMergedResourceProviderFactory' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingResourcemergerPickerOverriding' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingScriptingCoreImplScriptCacheImpl' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingScriptingCoreImplScriptingResourceResolverProvider' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingScriptingJavaImplJavaScriptEngineFactory' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFa' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingScriptingJspJspScriptEngineFactory' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProv' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingSecurityImplContentDispositionFilter' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingSecurityImplReferrerFilter' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingServiceusermappingImplServiceUserMapperImpl' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmended' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingServletsGetDefaultGetServlet' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingServletsGetImplVersionVersionInfoServlet' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingServletsPostImplHelperChunkCleanUpTask' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingServletsPostImplSlingPostServlet' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingServletsResolverSlingServletResolver' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingSettingsImplSlingSettingsServiceImpl' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingStartupfilterImplStartupFilterImpl' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingTenantInternalTenantProviderImpl' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingTracerInternalLogTracer' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingXssImplXSSFilterImpl' = OperationID,
        logic_handler = LogicHandler
    }
) ->
is_authorized(Req, State) ->
    {true, Req, State}.

-spec content_types_accepted(Req :: cowboy_req:req(), State :: state()) ->
    {
        Value :: [{binary(), AcceptResource :: atom()}],
        Req :: cowboy_req:req(),
        State :: state()
    }.

content_types_accepted(Req, State) ->
    {[
        {<<"application/json">>, handle_request_json}
    ], Req, State}.

-spec valid_content_headers(Req :: cowboy_req:req(), State :: state()) ->
    {Value :: boolean(), Req :: cowboy_req:req(), State :: state()}.

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'AdaptiveFormAndInteractiveCommunicationWebChannelConfiguration'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigur'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'AnalyticsComponentQueryCacheService'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ApacheSlingHealthCheckResultHTMLSerializer'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfiguration'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeAemTransactionCoreImplTransactionRecorder'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHC'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHC'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImpl'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImpl'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqAccountApiAccountManagementService'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqAccountImplAccountManagementServlet'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqAddressImplLocationLocationListServlet'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqAuditPurgeDam'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqAuditPurgePages'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqAuditPurgeReplication'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqCdnRewriterImplAWSCloudFrontRewriter'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqCdnRewriterImplCDNConfigServiceImpl'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqCdnRewriterImplCDNRewriter'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandle'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqCommerceImplAssetDynamicImageHandler'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImpl'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqCommerceImplAssetStaticImageHandler'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqCommerceImplAssetVideoHandler'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqCommerceImplPromotionPromotionManagerImpl'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImpl'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqCommercePimImplPageEventListener'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqCommercePimImplProductfeedProductFeedServiceImpl'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqContentinsightImplReportingServicesSettingsProvider'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqContentinsightImplServletsBrightEdgeProxyServlet'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqContentinsightImplServletsReportingServicesProxyServle'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqDamCfmImplComponentComponentConfigImpl'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqDamCfmImplConfFeatureConfigImpl'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqDamCfmImplContentRewriterAssetProcessor'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqDamCfmImplContentRewriterParRangeFilter'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqDamCfmImplContentRewriterPayloadFilter'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqDamDmProcessImagePTiffManagerImpl'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorker'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqDamMacSyncHelperImplMACSyncClientImpl'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqDamMacSyncImplDAMSyncServiceImpl'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqDamProcessorNuiImplNuiAssetProcessor'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqDamS7imagingImplIsImageServerComponent'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqDamS7imagingImplPsPlatformServerServlet'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqDamWebdavImplIoAssetIOHandler'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJob'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqDamWebdavImplIoSpecialFilesHandler'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqDeserfwImplDeserializationFirewallImpl'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqDtmImplServiceDTMWebServiceImpl'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqDtmImplServletsDTMDeployHookServlet'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqDtmReactorImplServiceWebServiceImpl'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqExperiencelogImplExperienceLogConfigServlet'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqHcContentPackagesHealthCheck'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqHistoryImplHistoryRequestFilter'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqHistoryImplHistoryServiceImpl'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqInboxImplTypeproviderItemTypeProvider'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqProjectsImplServletProjectImageServlet'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqProjectsPurgeScheduler'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqScheduledExporterImplScheduledExporterImpl'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImpl'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqScreensDeviceImplDeviceService'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImpl'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqScreensImplHandlerChannelsUpdateHandler'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJob'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqScreensImplRemoteImplDistributedHttpClientImpl'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqScreensImplScreensChannelPostProcessor'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImpl'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqScreensMqActivemqImplArtemisJMSProvider'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImpl'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImpl'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqScreensSegmentationImplSegmentationFeatureFlag'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthCh'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheck'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheck'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheck'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheck'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialAccountverificationImplAccountManagementConfigIm'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponen'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCo'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandler'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialActivitystreamsListenerImplModerationEventExten'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivityS'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStre'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsI'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmen'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialCalendarServletsTimeZoneServlet'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEvent'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSe'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperati'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialC'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPos'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialCommonsCorsCORSAuthenticationFilter'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProvider'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImpl'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListener'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialCommonsEmailreplyImplCustomEmailClientProvider'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImp'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImp'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporter'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialCommonsEmailreplyImplGmailEmailClientProvider'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProvider'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProvider'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialCommonsEmailreplyImplOutLookEmailClientProvider'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProvider'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProvider'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUpload'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImpl'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimit'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialConnectOauthImplFacebookProviderImpl'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandle'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapper'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialConnectOauthImplTwitterProviderImpl'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmen'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialDatastoreAsImplASResourceProviderFactory'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactory'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactor'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorF'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFacto'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialEnablementLearningpathEndpointsImplEnablementL'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResou'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialEnablementServicesImplAuthorMarkerImpl'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGe'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOpera'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialForumClientEndpointsImplForumOperationsService'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialForumDispatcherImplFlushOperations'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponen'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialGroupImplGroupServiceImpl'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialHandlebarsGuavaTemplateCacheImpl'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsS'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSer'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfile'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileO'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentF'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperation'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponen'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialModerationDashboardApiModerationDashboardSocial'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponen'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSoci'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialNotificationsImplMentionsRouter'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialNotificationsImplNotificationManagerImpl'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialNotificationsImplNotificationsRouter'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServic'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportI'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportM'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportS'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServi'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServlet'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServlet'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialScoringImplScoringEventListener'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImpl'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialSiteEndpointsImplSiteOperationService'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceIm'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialSiteImplSiteConfiguratorImpl'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialSrpImplSocialSolrConnector'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialSyncImplDiffChangesObserver'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialSyncImplGroupSyncListenerImpl'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialSyncImplPublisherSyncServiceImpl'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialSyncImplUserSyncListenerImpl'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialTranslationImplTranslationServiceConfigManager'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialTranslationImplUGCLanguageDetector'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImpl'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImpl'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialUgcbaseImplPublisherConfigurationImpl'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialUgcbaseImplSocialUtilsImpl'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialUgcbaseModerationImplAutoModerationImpl'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialUgcbaseModerationImplSentimentProcess'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackli'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImpl'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServlet'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqSocialUserImplTransportHttpToPublisher'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFact'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqUpgradesCleanupImplUpgradeContentCleanup'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanup'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderService'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTask'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderService'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderService'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqWcmLaunchesImplLaunchesEventHandler'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqWcmMobileQrcodeServletQRCodeImageGenerator'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImpl'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImpl'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigService'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeFdFpConfigFormsPortalSchedulerService'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeFormsCommonServiceImplDefaultDataProvider'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImp'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeFormsCommonServletTempCleanUpTask'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteAcpPlatformPlatformServlet'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteActivitystreamsImplActivityManagerImpl'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteAnalyzerBaseSystemStatusServlet'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServlet'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteApicontrollerFilterResolverHookFactory'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteAuthCertImplClientCertAuthHandler'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteAuthIms'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtension'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImpl'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidator'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteAuthImsImplIMSProviderImpl'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteAuthImsImplImsConfigProviderImpl'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteAuthOauthAccesstokenProvider'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteAuthOauthImplBearerAuthenticationHandler'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImpl'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteAuthOauthImplFacebookProviderImpl'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteAuthOauthImplGithubProviderImpl'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteAuthOauthImplGraniteProvider'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteAuthOauthImplHelperProviderConfigManager'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternal'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandler'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteAuthOauthImplTwitterProviderImpl'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteAuthOauthProvider'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteAuthRequirementImplDefaultRequirementHandler'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteAuthSamlSamlAuthenticationHandler'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteAuthSsoImplSsoAuthenticationHandler'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteBundlesHcImplCodeCacheHealthCheck'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheck'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteBundlesHcImplDavExBundleHealthCheck'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheck'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteBundlesHcImplJobsHealthCheck'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteBundlesHcImplSlingGetServletHealthCheck'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheck'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheck'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheck'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheck'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFac'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImpl'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteCompatrouterImplRoutingConfig'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteCompatrouterImplSwitchMappingConfig'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolving'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteContexthubImplContextHubImpl'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteCorsImplCORSPolicyImpl'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteCsrfImplCSRFFilter'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteCsrfImplCSRFServlet'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSe'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserver'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteDistributionCoreImplDiffDiffEventListener'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteDistributionCoreImplDistributionToReplicationEven'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicat'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteDistributionCoreImplReplicationDistributionTrans'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribu'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteFragsImplCheckHttpHeaderFlag'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteFragsImplRandomFeature'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteHttpcacheFileFileCacheStore'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteHttpcacheImplOuterCacheFilter'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteI18nImplBundlePseudoTranslations'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteI18nImplPreferencesLocaleResolverService'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteInfocollectorInfoCollector'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteJettySslInternalGraniteSslConnectorFactory'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteLicenseImplLicenseCheckFilter'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteLoggingImplLogAnalyserImpl'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteLoggingImplLogErrorHealthCheck'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTask'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTask'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTask'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteMonitoringImplScriptConfigImpl'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHan'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteOauthServerImplAccessTokenCleanupTask'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServlet'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServlet'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServlet'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServlet'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteOffloadingImplOffloadingConfigurator'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteOffloadingImplOffloadingJobCloner'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteOffloadingImplOffloadingJobOffloader'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManager'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspo'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImpl'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteOptoutImplOptOutServiceImpl'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheck'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteQueriesImplHcLargeIndexHealthCheck'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheck'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteQueriesImplHcQueryHealthCheckMetrics'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheck'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheck'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthC'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheck'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthC'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteRepositoryHcImplContinuousRGCHealthCheck'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthChe'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheck'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheck'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheck'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteRepositoryImplCommitStatsConfig'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteRepositoryServiceUserConfiguration'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckIm'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteResourcestatusImplCompositeStatusType'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteResourcestatusImplStatusResourceProviderImpl'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteRestAssetsImplAssetContentDispositionFilter'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImpl'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteRestImplServletDefaultGETServlet'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationS'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteSecurityUserUserPropertiesService'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteSocialgraphImplSocialGraphFactoryImpl'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImpl'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactory'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteTaskmanagementImplJcrTaskArchiveService'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTask'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactor'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteThreaddumpThreadDumpCollector'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTransl'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteTranslationCoreImplTranslationManagerImpl'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImpl'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeature'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventService'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManager'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandler'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteWorkflowCoreJobJobHandler'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsum'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteWorkflowCorePayloadMapCache'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListener'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteWorkflowCoreWorkflowConfig'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteWorkflowCoreWorkflowSessionFactory'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeGraniteWorkflowPurgeScheduler'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeOctopusNcommBootstrap'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullS'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComAdobeXmpWorkerFilesNcommXMPFilesNComm'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCommonsDatasourceJdbcpoolJdbcPoolService'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCommonsHttpclient'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqAnalyticsImplStorePropertiesChangeListener'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporte'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqAnalyticsSitecatalystImplImporterReportImporter'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactory'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImpl'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdater'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListener'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListener'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqAnalyticsTestandtargetImplSegmentImporter'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqAnalyticsTestandtargetImplServiceWebServiceImpl'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqAnalyticsTestandtargetImplServletsAdminServerServlet'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImpl'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqAuthImplCugCugSupportImpl'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqAuthImplLoginSelectorHandler'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqCommonsImplExternalizerImpl'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqCommonsServletsRootMappingServlet'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionChecke'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreList'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelist'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqContentsyncImplContentSyncManagerImpl'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqDamCommonsHandlerStandardImageHandler'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqDamCommonsMetadataXmpFilterBlackWhite'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqDamCommonsUtilImplAssetCacheImpl'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfig'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqDamCoreImplAssetMoveListener'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqDamCoreImplAssethomeAssetHomePageConfiguration'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServlet'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqDamCoreImplCacheCQBufferedImageCache'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqDamCoreImplDamChangeEventListener'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqDamCoreImplDamEventPurgeService'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqDamCoreImplDamEventRecorderImpl'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqDamCoreImplEventDamEventAuditListener'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqDamCoreImplExpiryNotificationJobImpl'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeat'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqDamCoreImplGfxCommonsGfxRenderer'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqDamCoreImplHandlerEPSFormatHandler'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqDamCoreImplHandlerIndesignFormatHandler'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqDamCoreImplHandlerJpegHandler'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqDamCoreImplHandlerXmpNCommXMPHandler'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqDamCoreImplJmxAssetIndexUpdateMonitor'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqDamCoreImplJmxAssetMigrationMBeanImpl'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqDamCoreImplJmxAssetUpdateMonitorImpl'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfig'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfig'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqDamCoreImplLightboxLightboxServlet'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqDamCoreImplMetadataEditorSelectComponentHandler'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelper'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImpl'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqDamCoreImplMissingMetadataNotificationJob'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPr'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqDamCoreImplProcessTextExtractionProcess'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqDamCoreImplRenditionMakerImpl'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqDamCoreImplReportsReportExportService'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqDamCoreImplReportsReportPurgeService'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqDamCoreImplServletAssetDownloadServlet'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqDamCoreImplServletAssetStatusServlet'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqDamCoreImplServletAssetXMPSearchServlet'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqDamCoreImplServletBatchMetadataServlet'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqDamCoreImplServletBinaryProviderServlet'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqDamCoreImplServletCollectionServlet'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqDamCoreImplServletCollectionsServlet'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqDamCoreImplServletCompanionServlet'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqDamCoreImplServletCreateAssetServlet'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqDamCoreImplServletDamContentDispositionFilter'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqDamCoreImplServletGuidLookupFilter'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqDamCoreImplServletHealthCheckServlet'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqDamCoreImplServletMetadataGetServlet'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqDamCoreImplServletMultipleLicenseAcceptServlet'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqDamCoreImplServletResourceCollectionServlet'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImpl'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqDamCoreImplUnzipUnzipConfig'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqDamCoreProcessExifToolExtractMetadataProcess'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqDamCoreProcessExtractMetadataProcess'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqDamCoreProcessMetadataProcessorProcess'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqDamHandlerFfmpegLocatorImpl'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImpl'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqDamHandlerStandardPdfPdfHandler'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqDamHandlerStandardPsPostScriptHandler'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqDamHandlerStandardPsdPsdHandler'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqDamIdsImplIDSJobProcessor'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqDamIdsImplIDSPoolManagerImpl'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqDamInddImplHandlerIndesignXMPHandler'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqDamInddImplServletSnippetCreationServlet'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqDamInddProcessINDDMediaExtractProcess'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImpl'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJob'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadPro'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEven'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunner'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqDamS7damCommonPostServletsSetCreateHandler'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqDamS7damCommonPostServletsSetModifyHandler'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcess'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqDamS7damCommonS7damDamChangeEventListener'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqDamS7damCommonServletsS7damProductInfoServlet'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImpl'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqDamScene7ImplScene7APIClientImpl'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImpl'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqDamScene7ImplScene7ConfigurationEventListener'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqDamScene7ImplScene7DamChangeEventListener'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqDamScene7ImplScene7FlashTemplatesServiceImpl'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqDamScene7ImplScene7UploadServiceImpl'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSer'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqDamStockIntegrationImplConfigurationStockConfiguration'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqDamVideoImplServletVideoTestServlet'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqExtwidgetServletsImageSpriteServlet'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqImageInternalFontFontHelper'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqJcrclustersupportClusterStartLevelController'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqMailerDefaultMailService'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqMailerImplCqMailingService'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqMailerImplEmailCqEmailTemplateFactory'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqMailerImplEmailCqRetrieverTemplateFactory'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqMcmCampaignImplIntegrationConfigImpl'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqMcmCampaignImporterPersonalizedTextHandlerFactory'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqMcmCoreNewsletterNewsletterEmailServiceImpl'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqMcmImplMCMConfiguration'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponen'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThroug'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponent'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHa'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagH'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqNotificationImplNotificationServiceImpl'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqPersonalizationImplServletsTargetingConfigurationServlet'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqPollingImporterImplManagedPollConfigImpl'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqPollingImporterImplManagedPollingImporterImpl'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqPollingImporterImplPollingImporterImpl'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqReplicationAuditReplicationEventListener'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqReplicationContentStaticContentBuilder'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqReplicationImplAgentManagerImpl'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqReplicationImplContentDurboBinaryLessContentBuilder'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqReplicationImplContentDurboDurboImportConfigurationProv'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqReplicationImplReplicationContentFactoryProviderImpl'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqReplicationImplReplicationReceiverImpl'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqReplicationImplReplicatorImpl'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqReplicationImplReverseReplicator'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqReplicationImplTransportBinaryLessTransportHandler'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqReplicationImplTransportHttp'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqReportingImplCacheCacheImpl'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqReportingImplConfigServiceImpl'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqReportingImplRLogAnalyzer'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqRewriterLinkcheckerImplLinkCheckerImpl'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqRewriterLinkcheckerImplLinkCheckerTask'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactory'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqRewriterLinkcheckerImplLinkInfoStorageImpl'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqRewriterProcessorImplHtmlParserFactory'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqSearchImplBuilderQueryBuilderImpl'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqSearchSuggestImplSuggestionIndexManagerImpl'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandler'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqSearchpromoteImplSearchPromoteServiceImpl'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqSecurityACLSetup'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqStatisticsImplStatisticsServiceImpl'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqTaggingImplJcrTagManagerFactoryImpl'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqTaggingImplSearchTagPredicateEvaluator'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqTaggingImplTagGarbageCollector'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqWcmContentsyncImplHandlerPagesUpdateHandler'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactor'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqWcmCoreImplAuthoringUIModeServiceImpl'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqWcmCoreImplCommandsWCMCommandServlet'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImpl'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqWcmCoreImplEventPageEventAuditListener'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqWcmCoreImplEventPagePostProcessor'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqWcmCoreImplEventRepositoryChangeEventListener'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqWcmCoreImplEventTemplatePostProcessor'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqWcmCoreImplLanguageManagerImpl'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImpl'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqWcmCoreImplPagePageInfoAggregatorImpl'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqWcmCoreImplPagePageManagerFactoryImpl'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqWcmCoreImplReferencesContentContentReferenceConfig'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqWcmCoreImplServletsContentfinderAssetViewHandler'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVie'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqWcmCoreImplServletsContentfinderPageViewHandler'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqWcmCoreImplServletsFindReplaceServlet'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqWcmCoreImplServletsReferenceSearchServlet'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqWcmCoreImplServletsThumbnailServlet'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqWcmCoreImplUtilsDefaultPageNameValidator'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqWcmCoreImplVariantsPageVariantsProviderImpl'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqWcmCoreImplVersionManagerImpl'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqWcmCoreImplVersionPurgeTask'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqWcmCoreImplWCMDebugFilter'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqWcmCoreImplWCMDeveloperModeFilter'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqWcmCoreImplWarpTimeWarpFilter'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqWcmCoreMvtMVTStatisticsImpl'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqWcmCoreStatsPageViewStatisticsImpl'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqWcmCoreWCMRequestFilter'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqWcmDesignimporterDesignPackageImporter'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqWcmDesignimporterImplCanvasBuilderImpl'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqWcmDesignimporterImplCanvasPageDeleteHandler'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqWcmDesignimporterImplEntryPreprocessorImpl'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqWcmDesignimporterImplMobileCanvasBuilderImpl'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqWcmDesignimporterParserTaghandlersFactoryCanvasCompone'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultCompon'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultTagHan'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqWcmDesignimporterParserTaghandlersFactoryHeadTagHandle'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqWcmDesignimporterParserTaghandlersFactoryIFrameTagHand'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqWcmDesignimporterParserTaghandlersFactoryImageComponen'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandler'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqWcmDesignimporterParserTaghandlersFactoryInlineScriptT'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqWcmDesignimporterParserTaghandlersFactoryLinkTagHandle'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqWcmDesignimporterParserTaghandlersFactoryMetaTagHandle'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqWcmDesignimporterParserTaghandlersFactoryNonScriptTagH'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqWcmDesignimporterParserTaghandlersFactoryParsysCompone'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqWcmDesignimporterParserTaghandlersFactoryScriptTagHand'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqWcmDesignimporterParserTaghandlersFactoryStyleTagHandl'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqWcmDesignimporterParserTaghandlersFactoryTextComponent'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleComponen'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleTagHandl'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqWcmFoundationFormsImplFormChooserServlet'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqWcmFoundationFormsImplFormParagraphPostProcessor'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqWcmFoundationFormsImplFormsHandlingServlet'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqWcmFoundationFormsImplMailServlet'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqWcmFoundationImplAdaptiveImageComponentServlet'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqWcmFoundationImplHTTPAuthHandler'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqWcmFoundationImplPageImpressionsTracker'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqWcmFoundationImplPageRedirectServlet'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklist'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImpl'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactory'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqWcmMobileCoreImplRedirectRedirectFilter'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqWcmMsmImplActionsContentCopyActionFactory'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqWcmMsmImplActionsContentDeleteActionFactory'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqWcmMsmImplActionsContentUpdateActionFactory'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqWcmMsmImplActionsOrderChildrenActionFactory'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqWcmMsmImplActionsPageMoveActionFactory'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqWcmMsmImplActionsReferencesUpdateActionFactory'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqWcmMsmImplActionsVersionCopyActionFactory'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqWcmMsmImplLiveRelationshipManagerImpl'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqWcmMsmImplRolloutManagerImpl'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqWcmMsmImplServletsAuditLogServlet'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqWcmNotificationEmailImplEmailChannel'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqWcmNotificationImplNotificationManagerImpl'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqWcmScriptingImplBVPManager'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqWcmUndoUndoConfig'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqWcmWebservicesupportImplReplicationEventListener'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqWcmWorkflowImplWcmWorkflowServiceImpl'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqWcmWorkflowImplWorkflowPackageInfoProvider'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqWidgetImplHtmlLibraryManagerImpl'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqWidgetImplWidgetExtensionProviderImpl'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqWorkflowImplEmailEMailNotificationService'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCqWorkflowImplEmailTaskEMailNotificationService'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCrxSecurityTokenImplImplTokenAuthenticationHandler'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ComDayCrxSecurityTokenImplTokenCleanupTask'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'GuideLocalizationService'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'MessagingUserComponentFactory'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'OrgApacheAriesJmxFrameworkStateConfig'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'OrgApacheFelixEventadminImplEventAdmin'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'OrgApacheFelixHttp'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'OrgApacheFelixHttpSslfilterSslFilter'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'OrgApacheFelixJaasConfigurationFactory'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'OrgApacheFelixJaasConfigurationSpi'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'OrgApacheFelixScrScrService'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'OrgApacheFelixSystemreadyImplComponentsCheck'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'OrgApacheFelixSystemreadyImplFrameworkStartCheck'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'OrgApacheFelixSystemreadyImplServicesCheck'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'OrgApacheFelixSystemreadyImplServletSystemAliveServlet'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'OrgApacheFelixSystemreadyImplServletSystemReadyServlet'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'OrgApacheFelixSystemreadySystemReadyMonitor'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'OrgApacheFelixWebconsoleInternalServletOsgiManager'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'OrgApacheFelixWebconsolePluginsEventInternalPluginServlet'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCo'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'OrgApacheHttpProxyconfigurator'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProvider'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStore'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreService'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePre'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCac'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'OrgApacheJackrabbitOakPluginsIndexAsyncIndexerService'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServ'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCo'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServers'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfiguration'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConf'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvid'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSe'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactory'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'OrgApacheJackrabbitOakPluginsObservationChangeCollectorProvider'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'OrgApacheJackrabbitOakQueryQueryEngineSettingsService'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfig'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdenti'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfigura'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigur'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistrati'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeName'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'OrgApacheJackrabbitOakSecurityUserUserConfigurationImpl'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreService'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactory'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorService'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'OrgApacheJackrabbitOakSegmentSegmentNodeStoreService'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreService'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDe'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplEx'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPr'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfi'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExclu'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizable'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'OrgApacheJackrabbitVaultPackagingImplPackagingImpl'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistry'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingAuthCoreImplLogoutServlet'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingCaconfigImplConfigurationBindingsValueProvider'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingCaconfigImplConfigurationResolverImpl'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStra'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStra'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProvi'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOve'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingCaconfigManagementImplConfigurationManagementSetti'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResour'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategy'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParser'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingCommonsLogLogManager'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingCommonsLogLogManagerFactoryConfig'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingCommonsLogLogManagerFactoryWriter'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingCommonsMetricsInternalLogReporter'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporter'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingCommonsMimeInternalMimeTypeServiceImpl'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingCommonsSchedulerImplQuartzScheduler'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheck'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactory'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingDatasourceDataSourceFactory'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingDatasourceJNDIDataSourceFactory'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingDiscoveryOakConfig'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheck'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingDistributionAgentImplForwardDistributionAgentFacto'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestA'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactory'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingDistributionAgentImplReverseDistributionAgentFacto'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactor'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactory'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingDistributionMonitorDistributionQueueHealthCheck'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingDistributionPackagingImplExporterAgentDistributio'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingDistributionPackagingImplExporterLocalDistributio'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingDistributionPackagingImplExporterRemoteDistributi'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingDistributionPackagingImplImporterLocalDistributio'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingDistributionPackagingImplImporterRemoteDistributi'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingDistributionPackagingImplImporterRepositoryDistri'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingDistributionResourcesImplDistributionConfiguration'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingDistributionResourcesImplDistributionServiceResour'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingDistributionSerializationImplDistributionPackageBu'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingDistributionSerializationImplVltVaultDistribution'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingDistributionTransportImplUserCredentialsDistributi'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingDistributionTriggerImplDistributionEventDistribute'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingDistributionTriggerImplJcrEventDistributionTrigger'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributi'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrig'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingDistributionTriggerImplResourceEventDistributionTr'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingDistributionTriggerImplScheduledDistributionTrigge'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingEngineImplAuthSlingAuthenticator'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilter'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingEngineImplLogRequestLogger'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingEngineImplLogRequestLoggerService'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingEngineImplSlingMainServlet'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingEngineParameters'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingEventImplEventingThreadPool'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingEventImplJobsDefaultJobManager'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingEventImplJobsJcrPersistenceHandler'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingEventImplJobsJobConsumerManager'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingEventJobsQueueConfiguration'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingW'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingFeatureflagsFeature'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingFeatureflagsImplConfiguredFeature'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingHapiImplHApiUtilImpl'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingHcCoreImplCompositeHealthCheck'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImpl'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingHcCoreImplJmxAttributeHealthCheck'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingHcCoreImplScriptableHealthCheck'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingHcCoreImplServletHealthCheckExecutorServlet'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializer'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingI18nImplI18NFilter'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingI18nImplJcrResourceBundleProvider'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingInstallerProviderJcrImplJcrInstaller'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingJcrBaseInternalLoginAdminWhitelist'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragment'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingJcrDavexImplServletsSlingDavExServlet'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupport'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupport'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingJcrRepoinitImplRepositoryInitializer'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingJcrRepoinitRepositoryInitializer'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImpl'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingJcrResourceInternalJcrSystemUserValidator'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactory'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerService'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServic'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServlet'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingJmxProviderImplJMXResourceProvider'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingModelsImplModelAdapterFactory'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingModelsJacksonexporterImplResourceModuleProvider'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFacto'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingResourcemergerImplMergedResourceProviderFactory'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingResourcemergerPickerOverriding'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingScriptingCoreImplScriptCacheImpl'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingScriptingCoreImplScriptingResourceResolverProvider'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingScriptingJavaImplJavaScriptEngineFactory'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFa'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingScriptingJspJspScriptEngineFactory'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProv'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingSecurityImplContentDispositionFilter'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingSecurityImplReferrerFilter'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingServiceusermappingImplServiceUserMapperImpl'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmended'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingServletsGetDefaultGetServlet'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingServletsGetImplVersionVersionInfoServlet'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingServletsPostImplHelperChunkCleanUpTask'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingServletsPostImplSlingPostServlet'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingServletsResolverSlingServletResolver'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingSettingsImplSlingSettingsServiceImpl'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingStartupfilterImplStartupFilterImpl'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingTenantInternalTenantProviderImpl'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingTracerInternalLogTracer'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'OrgApacheSlingXssImplXSSFilterImpl'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(Req, State) ->
    {false, Req, State}.

-spec content_types_provided(Req :: cowboy_req:req(), State :: state()) ->
    {
        Value :: [{binary(), ProvideResource :: atom()}],
        Req :: cowboy_req:req(),
        State :: state()
    }.

content_types_provided(Req, State) ->
    {[
        {<<"application/json">>, handle_request_json}
    ], Req, State}.

-spec malformed_request(Req :: cowboy_req:req(), State :: state()) ->
    {Value :: false, Req :: cowboy_req:req(), State :: state()}.

malformed_request(Req, State) ->
    {false, Req, State}.

-spec allow_missing_post(Req :: cowboy_req:req(), State :: state()) ->
    {Value :: false, Req :: cowboy_req:req(), State :: state()}.

allow_missing_post(Req, State) ->
    {false, Req, State}.

-spec delete_resource(Req :: cowboy_req:req(), State :: state()) ->
    processed_response().

delete_resource(Req, State) ->
    handle_request_json(Req, State).

-spec known_content_type(Req :: cowboy_req:req(), State :: state()) ->
    {Value :: true, Req :: cowboy_req:req(), State :: state()}.

known_content_type(Req, State) ->
    {true, Req, State}.

-spec valid_entity_length(Req :: cowboy_req:req(), State :: state()) ->
    {Value :: true, Req :: cowboy_req:req(), State :: state()}.

valid_entity_length(Req, State) ->
    %% @TODO check the length
    {true, Req, State}.

%%%%

-type result_ok() :: {
    ok,
    {Status :: cowboy:http_status(), Headers :: cowboy:http_headers(), Body :: iodata()}
}.

-type result_error() :: {error, Reason :: any()}.

-type processed_response() :: {halt, cowboy_req:req(), state()}.

-spec process_response(result_ok() | result_error(), cowboy_req:req(), state()) ->
    processed_response().

process_response(Response, Req0, State = #state{operation_id = OperationID}) ->
    case Response of
        {ok, {Code, Headers, Body}} ->
            {ok, Req} = cowboy_req:reply(Code, Headers, Body, Req0),
            {halt, Req, State};
        {error, Message} ->
            error_logger:error_msg("Unable to process request for ~p: ~p", [OperationID, Message]),

            {ok, Req} = cowboy_req:reply(400, Req0),
            {halt, Req, State}
    end.

-spec handle_request_json(cowboy_req:req(), state()) -> {halt, cowboy_req:req(), state()}.

handle_request_json(
    Req0,
    State = #state{
        operation_id = OperationID,
        logic_handler = LogicHandler,
        validator_state = ValidatorState,
        context = Context
    }
) ->
    case openapi_api:populate_request(OperationID, Req0, ValidatorState) of
        {ok, Populated, Req1} ->
            {Code, Headers, Body} = openapi_logic_handler:handle_request(
                LogicHandler,
                OperationID,
                Populated,
                Context
            ),
            _ = openapi_api:validate_response(
                OperationID,
                Code,
                Body,
                ValidatorState
            ),
            PreparedBody = jsx:encode(Body),
            Response = {ok, {Code, Headers, PreparedBody}},
            process_response(Response, Req1, State);
        {error, Reason, Req1} ->
            process_response({error, Reason}, Req1, State)
    end.

validate_headers(_, Req) -> {true, Req}.
