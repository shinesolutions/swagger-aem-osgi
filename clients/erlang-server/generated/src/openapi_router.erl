-module(openapi_router).

-export([get_paths/1]).

-type operations() :: #{
    Method :: binary() => openapi_api:operation_id()
}.

-type init_opts()  :: {
    Operations :: operations(),
    LogicHandler :: atom(),
    ValidatorState :: jesse_state:state()
}.

-export_type([init_opts/0]).

-spec get_paths(LogicHandler :: atom()) ->  [{'_',[{
    Path :: string(),
    Handler :: atom(),
    InitOpts :: init_opts()
}]}].

get_paths(LogicHandler) ->
    ValidatorState = prepare_validator(),
    PreparedPaths = maps:fold(
        fun(Path, #{operations := Operations, handler := Handler}, Acc) ->
            [{Path, Handler, Operations} | Acc]
        end,
        [],
        group_paths()
    ),
    [
        {'_',
            [{P, H, {O, LogicHandler, ValidatorState}} || {P, H, O} <- PreparedPaths]
        }
    ].

group_paths() ->
    maps:fold(
        fun(OperationID, #{path := Path, method := Method, handler := Handler}, Acc) ->
            case maps:find(Path, Acc) of
                {ok, PathInfo0 = #{operations := Operations0}} ->
                    Operations = Operations0#{Method => OperationID},
                    PathInfo = PathInfo0#{operations => Operations},
                    Acc#{Path => PathInfo};
                error ->
                    Operations = #{Method => OperationID},
                    PathInfo = #{handler => Handler, operations => Operations},
                    Acc#{Path => PathInfo}
            end
        end,
        #{},
        get_operations()
    ).

get_operations() ->
    #{ 
        'AdaptiveFormAndInteractiveCommunicationWebChannelConfiguration' => #{
            path => "//system/console/configMgr/Adaptive Form and Interactive Communication Web Channel Configuration",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigur' => #{
            path => "//system/console/configMgr/Adaptive Form and Interactive Communication Web Channel Theme Configuration",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'AnalyticsComponentQueryCacheService' => #{
            path => "//system/console/configMgr/Analytics Component Query Cache Service",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ApacheSlingHealthCheckResultHTMLSerializer' => #{
            path => "//system/console/configMgr/Apache Sling Health Check Result HTML Serializer",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfiguration' => #{
            path => "//system/console/configMgr/com.adobe.aem.formsndocuments.config.AEMFormsManagerConfiguration",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeAemTransactionCoreImplTransactionRecorder' => #{
            path => "//system/console/configMgr/com.adobe.aem.transaction.core.impl.TransactionRecorder",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHC' => #{
            path => "//system/console/configMgr/com.adobe.aem.upgrade.prechecks.hc.impl.DeprecateIndexesHC",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHC' => #{
            path => "//system/console/configMgr/com.adobe.aem.upgrade.prechecks.hc.impl.ReplicationAgentsDisabledHC",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImpl' => #{
            path => "//system/console/configMgr/com.adobe.aem.upgrade.prechecks.mbean.impl.PreUpgradeTasksMBeanImpl",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImpl' => #{
            path => "//system/console/configMgr/com.adobe.aem.upgrade.prechecks.tasks.impl.ConsistencyCheckTaskImpl",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeCqAccountApiAccountManagementService' => #{
            path => "//system/console/configMgr/com.adobe.cq.account.api.AccountManagementService",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeCqAccountImplAccountManagementServlet' => #{
            path => "//system/console/configMgr/com.adobe.cq.account.impl.AccountManagementServlet",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeCqAddressImplLocationLocationListServlet' => #{
            path => "//system/console/configMgr/com.adobe.cq.address.impl.location.LocationListServlet",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeCqAuditPurgeDam' => #{
            path => "//system/console/configMgr/com.adobe.cq.audit.purge.Dam",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeCqAuditPurgePages' => #{
            path => "//system/console/configMgr/com.adobe.cq.audit.purge.Pages",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeCqAuditPurgeReplication' => #{
            path => "//system/console/configMgr/com.adobe.cq.audit.purge.Replication",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeCqCdnRewriterImplAWSCloudFrontRewriter' => #{
            path => "//system/console/configMgr/com.adobe.cq.cdn.rewriter.impl.AWSCloudFrontRewriter",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeCqCdnRewriterImplCDNConfigServiceImpl' => #{
            path => "//system/console/configMgr/com.adobe.cq.cdn.rewriter.impl.CDNConfigServiceImpl",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeCqCdnRewriterImplCDNRewriter' => #{
            path => "//system/console/configMgr/com.adobe.cq.cdn.rewriter.impl.CDNRewriter",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandle' => #{
            path => "//system/console/configMgr/com.adobe.cq.cloudconfig.core.impl.ConfigurationReplicationEventHandler",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeCqCommerceImplAssetDynamicImageHandler' => #{
            path => "//system/console/configMgr/com.adobe.cq.commerce.impl.asset.DynamicImageHandler",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImpl' => #{
            path => "//system/console/configMgr/com.adobe.cq.commerce.impl.asset.ProductAssetHandlerProviderImpl",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeCqCommerceImplAssetStaticImageHandler' => #{
            path => "//system/console/configMgr/com.adobe.cq.commerce.impl.asset.StaticImageHandler",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeCqCommerceImplAssetVideoHandler' => #{
            path => "//system/console/configMgr/com.adobe.cq.commerce.impl.asset.VideoHandler",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeCqCommerceImplPromotionPromotionManagerImpl' => #{
            path => "//system/console/configMgr/com.adobe.cq.commerce.impl.promotion.PromotionManagerImpl",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImpl' => #{
            path => "//system/console/configMgr/com.adobe.cq.commerce.pim.impl.cataloggenerator.CatalogGeneratorImpl",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeCqCommercePimImplPageEventListener' => #{
            path => "//system/console/configMgr/com.adobe.cq.commerce.pim.impl.PageEventListener",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeCqCommercePimImplProductfeedProductFeedServiceImpl' => #{
            path => "//system/console/configMgr/com.adobe.cq.commerce.pim.impl.productfeed.ProductFeedServiceImpl",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeCqContentinsightImplReportingServicesSettingsProvider' => #{
            path => "//system/console/configMgr/com.adobe.cq.contentinsight.impl.ReportingServicesSettingsProvider",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeCqContentinsightImplServletsBrightEdgeProxyServlet' => #{
            path => "//system/console/configMgr/com.adobe.cq.contentinsight.impl.servlets.BrightEdgeProxyServlet",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeCqContentinsightImplServletsReportingServicesProxyServle' => #{
            path => "//system/console/configMgr/com.adobe.cq.contentinsight.impl.servlets.ReportingServicesProxyServlet",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeCqDamCfmImplComponentComponentConfigImpl' => #{
            path => "//system/console/configMgr/com.adobe.cq.dam.cfm.impl.component.ComponentConfigImpl",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeCqDamCfmImplConfFeatureConfigImpl' => #{
            path => "//system/console/configMgr/com.adobe.cq.dam.cfm.impl.conf.FeatureConfigImpl",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeCqDamCfmImplContentRewriterAssetProcessor' => #{
            path => "//system/console/configMgr/com.adobe.cq.dam.cfm.impl.content.rewriter.AssetProcessor",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeCqDamCfmImplContentRewriterParRangeFilter' => #{
            path => "//system/console/configMgr/com.adobe.cq.dam.cfm.impl.content.rewriter.ParRangeFilter",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeCqDamCfmImplContentRewriterPayloadFilter' => #{
            path => "//system/console/configMgr/com.adobe.cq.dam.cfm.impl.content.rewriter.PayloadFilter",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeCqDamDmProcessImagePTiffManagerImpl' => #{
            path => "//system/console/configMgr/com.adobe.cq.dam.dm.process.image.PTiffManagerImpl",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorker' => #{
            path => "//system/console/configMgr/com.adobe.cq.dam.ips.impl.replication.trigger.ReplicateOnModifyWorker",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeCqDamMacSyncHelperImplMACSyncClientImpl' => #{
            path => "//system/console/configMgr/com.adobe.cq.dam.mac.sync.helper.impl.MACSyncClientImpl",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeCqDamMacSyncImplDAMSyncServiceImpl' => #{
            path => "//system/console/configMgr/com.adobe.cq.dam.mac.sync.impl.DAMSyncServiceImpl",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeCqDamProcessorNuiImplNuiAssetProcessor' => #{
            path => "//system/console/configMgr/com.adobe.cq.dam.processor.nui.impl.NuiAssetProcessor",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeCqDamS7imagingImplIsImageServerComponent' => #{
            path => "//system/console/configMgr/com.adobe.cq.dam.s7imaging.impl.is.ImageServerComponent",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeCqDamS7imagingImplPsPlatformServerServlet' => #{
            path => "//system/console/configMgr/com.adobe.cq.dam.s7imaging.impl.ps.PlatformServerServlet",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeCqDamWebdavImplIoAssetIOHandler' => #{
            path => "//system/console/configMgr/com.adobe.cq.dam.webdav.impl.io.AssetIOHandler",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJob' => #{
            path => "//system/console/configMgr/com.adobe.cq.dam.webdav.impl.io.DamWebdavVersionLinkingJob",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeCqDamWebdavImplIoSpecialFilesHandler' => #{
            path => "//system/console/configMgr/com.adobe.cq.dam.webdav.impl.io.SpecialFilesHandler",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeCqDeserfwImplDeserializationFirewallImpl' => #{
            path => "//system/console/configMgr/com.adobe.cq.deserfw.impl.DeserializationFirewallImpl",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeCqDtmImplServiceDTMWebServiceImpl' => #{
            path => "//system/console/configMgr/com.adobe.cq.dtm.impl.service.DTMWebServiceImpl",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeCqDtmImplServletsDTMDeployHookServlet' => #{
            path => "//system/console/configMgr/com.adobe.cq.dtm.impl.servlets.DTMDeployHookServlet",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeCqDtmReactorImplServiceWebServiceImpl' => #{
            path => "//system/console/configMgr/com.adobe.cq.dtm.reactor.impl.service.WebServiceImpl",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeCqExperiencelogImplExperienceLogConfigServlet' => #{
            path => "//system/console/configMgr/com.adobe.cq.experiencelog.impl.ExperienceLogConfigServlet",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeCqHcContentPackagesHealthCheck' => #{
            path => "//system/console/configMgr/com.adobe.cq.hc.ContentPackagesHealthCheck",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeCqHistoryImplHistoryRequestFilter' => #{
            path => "//system/console/configMgr/com.adobe.cq.history.impl.HistoryRequestFilter",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeCqHistoryImplHistoryServiceImpl' => #{
            path => "//system/console/configMgr/com.adobe.cq.history.impl.HistoryServiceImpl",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeCqInboxImplTypeproviderItemTypeProvider' => #{
            path => "//system/console/configMgr/com.adobe.cq.inbox.impl.typeprovider.ItemTypeProvider",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeCqProjectsImplServletProjectImageServlet' => #{
            path => "//system/console/configMgr/com.adobe.cq.projects.impl.servlet.ProjectImageServlet",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeCqProjectsPurgeScheduler' => #{
            path => "//system/console/configMgr/com.adobe.cq.projects.purge.Scheduler",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeCqScheduledExporterImplScheduledExporterImpl' => #{
            path => "//system/console/configMgr/com.adobe.cq.scheduled.exporter.impl.ScheduledExporterImpl",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImpl' => #{
            path => "//system/console/configMgr/com.adobe.cq.screens.analytics.impl.ScreensAnalyticsServiceImpl",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeCqScreensDeviceImplDeviceService' => #{
            path => "//system/console/configMgr/com.adobe.cq.screens.device.impl.DeviceService",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImpl' => #{
            path => "//system/console/configMgr/com.adobe.cq.screens.device.registration.impl.RegistrationServiceImpl",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeCqScreensImplHandlerChannelsUpdateHandler' => #{
            path => "//system/console/configMgr/com.adobe.cq.screens.impl.handler.ChannelsUpdateHandler",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJob' => #{
            path => "//system/console/configMgr/com.adobe.cq.screens.impl.jobs.DistributedDevicesStatiUpdateJob",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeCqScreensImplRemoteImplDistributedHttpClientImpl' => #{
            path => "//system/console/configMgr/com.adobe.cq.screens.impl.remote.impl.DistributedHttpClientImpl",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeCqScreensImplScreensChannelPostProcessor' => #{
            path => "//system/console/configMgr/com.adobe.cq.screens.impl.ScreensChannelPostProcessor",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImpl' => #{
            path => "//system/console/configMgr/com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeCqScreensMqActivemqImplArtemisJMSProvider' => #{
            path => "//system/console/configMgr/com.adobe.cq.screens.mq.activemq.impl.ArtemisJMSProvider",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImpl' => #{
            path => "//system/console/configMgr/com.adobe.cq.screens.offlinecontent.impl.BulkOfflineUpdateServiceImpl",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImpl' => #{
            path => "//system/console/configMgr/com.adobe.cq.screens.offlinecontent.impl.OfflineContentServiceImpl",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeCqScreensSegmentationImplSegmentationFeatureFlag' => #{
            path => "//system/console/configMgr/com.adobe.cq.screens.segmentation.impl.SegmentationFeatureFlag",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthCh' => #{
            path => "//system/console/configMgr/com.adobe.cq.security.hc.bundles.impl.HtmlLibraryManagerConfigHealthCheck",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheck' => #{
            path => "//system/console/configMgr/com.adobe.cq.security.hc.bundles.impl.WcmFilterHealthCheck",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheck' => #{
            path => "//system/console/configMgr/com.adobe.cq.security.hc.dispatcher.impl.DispatcherAccessHealthCheck",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheck' => #{
            path => "//system/console/configMgr/com.adobe.cq.security.hc.packages.impl.ExampleContentHealthCheck",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheck' => #{
            path => "//system/console/configMgr/com.adobe.cq.security.hc.webserver.impl.ClickjackingHealthCheck",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeCqSocialAccountverificationImplAccountManagementConfigIm' => #{
            path => "//system/console/configMgr/com.adobe.cq.social.accountverification.impl.AccountManagementConfigImpl",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponen' => #{
            path => "//system/console/configMgr/com.adobe.cq.social.activitystreams.client.impl.SocialActivityComponentFactoryImpl",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCo' => #{
            path => "//system/console/configMgr/com.adobe.cq.social.activitystreams.client.impl.SocialActivityStreamComponentFactory",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandler' => #{
            path => "//system/console/configMgr/com.adobe.cq.social.activitystreams.listener.impl.EventListenerHandler",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeCqSocialActivitystreamsListenerImplModerationEventExten' => #{
            path => "//system/console/configMgr/com.adobe.cq.social.activitystreams.listener.impl.ModerationEventExtension",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivityS' => #{
            path => "//system/console/configMgr/com.adobe.cq.social.activitystreams.listener.impl.RatingEventActivitySuppressor",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStre' => #{
            path => "//system/console/configMgr/com.adobe.cq.social.activitystreams.listener.impl.ResourceActivityStreamProviderFactory",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsI' => #{
            path => "//system/console/configMgr/com.adobe.cq.social.calendar.client.endpoints.impl.CalendarOperationsImpl",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmen' => #{
            path => "//system/console/configMgr/com.adobe.cq.social.calendar.client.operationextensions.EventAttachment",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeCqSocialCalendarServletsTimeZoneServlet' => #{
            path => "//system/console/configMgr/com.adobe.cq.social.calendar.servlets.TimeZoneServlet",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEvent' => #{
            path => "//system/console/configMgr/com.adobe.cq.social.commons.comments.endpoints.impl.CommentDeleteEventActivitySuppressor",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSe' => #{
            path => "//system/console/configMgr/com.adobe.cq.social.commons.comments.endpoints.impl.CommentOperationService",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperati' => #{
            path => "//system/console/configMgr/com.adobe.cq.social.commons.comments.endpoints.impl.TranslationOperationService",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialC' => #{
            path => "//system/console/configMgr/com.adobe.cq.social.commons.comments.listing.impl.SearchCommentSocialComponentListProvider",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPos' => #{
            path => "//system/console/configMgr/com.adobe.cq.social.commons.comments.scheduler.impl.SearchScheduledPosts",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeCqSocialCommonsCorsCORSAuthenticationFilter' => #{
            path => "//system/console/configMgr/com.adobe.cq.social.commons.cors.CORSAuthenticationFilter",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProvider' => #{
            path => "//system/console/configMgr/com.adobe.cq.social.commons.emailreply.impl.AndroidEmailClientProvider",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImpl' => #{
            path => "//system/console/configMgr/com.adobe.cq.social.commons.emailreply.impl.CommentEmailBuilderImpl",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListener' => #{
            path => "//system/console/configMgr/com.adobe.cq.social.commons.emailreply.impl.CommentEmailEventListener",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeCqSocialCommonsEmailreplyImplCustomEmailClientProvider' => #{
            path => "//system/console/configMgr/com.adobe.cq.social.commons.emailreply.impl.CustomEmailClientProvider",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImp' => #{
            path => "//system/console/configMgr/com.adobe.cq.social.commons.emailreply.impl.EmailQuotedTextPatternsImpl",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImp' => #{
            path => "//system/console/configMgr/com.adobe.cq.social.commons.emailreply.impl.EmailReplyConfigurationImpl",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporter' => #{
            path => "//system/console/configMgr/com.adobe.cq.social.commons.emailreply.impl.EmailReplyImporter",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeCqSocialCommonsEmailreplyImplGmailEmailClientProvider' => #{
            path => "//system/console/configMgr/com.adobe.cq.social.commons.emailreply.impl.GmailEmailClientProvider",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProvider' => #{
            path => "//system/console/configMgr/com.adobe.cq.social.commons.emailreply.impl.IOSEmailClientProvider",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProvider' => #{
            path => "//system/console/configMgr/com.adobe.cq.social.commons.emailreply.impl.MacmailEmailClientProvider",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeCqSocialCommonsEmailreplyImplOutLookEmailClientProvider' => #{
            path => "//system/console/configMgr/com.adobe.cq.social.commons.emailreply.impl.OutLookEmailClientProvider",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProvider' => #{
            path => "//system/console/configMgr/com.adobe.cq.social.commons.emailreply.impl.UnknownEmailClientProvider",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProvider' => #{
            path => "//system/console/configMgr/com.adobe.cq.social.commons.emailreply.impl.YahooEmailClientProvider",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUpload' => #{
            path => "//system/console/configMgr/com.adobe.cq.social.commons.maintainance.impl.DeleteTempUGCImageUploads",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImpl' => #{
            path => "//system/console/configMgr/com.adobe.cq.social.commons.ugclimiter.impl.UGCLimiterServiceImpl",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimit' => #{
            path => "//system/console/configMgr/com.adobe.cq.social.commons.ugclimitsconfig.impl.CommunityUserUGCLimitsConfigImpl",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeCqSocialConnectOauthImplFacebookProviderImpl' => #{
            path => "//system/console/configMgr/com.adobe.cq.social.connect.oauth.impl.FacebookProviderImpl",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandle' => #{
            path => "//system/console/configMgr/com.adobe.cq.social.connect.oauth.impl.SocialOAuthAuthenticationHandler",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapper' => #{
            path => "//system/console/configMgr/com.adobe.cq.social.connect.oauth.impl.SocialOAuthUserProfileMapper",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeCqSocialConnectOauthImplTwitterProviderImpl' => #{
            path => "//system/console/configMgr/com.adobe.cq.social.connect.oauth.impl.TwitterProviderImpl",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmen' => #{
            path => "//system/console/configMgr/com.adobe.cq.social.content.fragments.services.impl.CommunitiesFragmentCreationServiceImpl",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeCqSocialDatastoreAsImplASResourceProviderFactory' => #{
            path => "//system/console/configMgr/com.adobe.cq.social.datastore.as.impl.ASResourceProviderFactory",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactory' => #{
            path => "//system/console/configMgr/com.adobe.cq.social.datastore.op.impl.SocialMSResourceProviderFactory",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactor' => #{
            path => "//system/console/configMgr/com.adobe.cq.social.datastore.rdb.impl.SocialRDBResourceProviderFactory",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorF' => #{
            path => "//system/console/configMgr/com.adobe.cq.social.enablement.adaptors.EnablementLearningPathAdaptorFactory",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFacto' => #{
            path => "//system/console/configMgr/com.adobe.cq.social.enablement.adaptors.EnablementResourceAdaptorFactory",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeCqSocialEnablementLearningpathEndpointsImplEnablementL' => #{
            path => "//system/console/configMgr/com.adobe.cq.social.enablement.learningpath.endpoints.impl.EnablementLearningPathModelOperationService",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResou' => #{
            path => "//system/console/configMgr/com.adobe.cq.social.enablement.resource.endpoints.impl.EnablementResourceModelOperationService",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeCqSocialEnablementServicesImplAuthorMarkerImpl' => #{
            path => "//system/console/configMgr/com.adobe.cq.social.enablement.services.impl.AuthorMarkerImpl",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGe' => #{
            path => "//system/console/configMgr/com.adobe.cq.social.filelibrary.client.endpoints.FilelibraryDownloadGetServlet",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOpera' => #{
            path => "//system/console/configMgr/com.adobe.cq.social.filelibrary.client.endpoints.impl.FileLibraryOperationsService",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeCqSocialForumClientEndpointsImplForumOperationsService' => #{
            path => "//system/console/configMgr/com.adobe.cq.social.forum.client.endpoints.impl.ForumOperationsService",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeCqSocialForumDispatcherImplFlushOperations' => #{
            path => "//system/console/configMgr/com.adobe.cq.social.forum.dispatcher.impl.FlushOperations",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponen' => #{
            path => "//system/console/configMgr/com.adobe.cq.social.group.client.impl.CommunityGroupCollectionComponentFactory",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeCqSocialGroupImplGroupServiceImpl' => #{
            path => "//system/console/configMgr/com.adobe.cq.social.group.impl.GroupServiceImpl",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeCqSocialHandlebarsGuavaTemplateCacheImpl' => #{
            path => "//system/console/configMgr/com.adobe.cq.social.handlebars.GuavaTemplateCacheImpl",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsS' => #{
            path => "//system/console/configMgr/com.adobe.cq.social.ideation.client.endpoints.impl.IdeationOperationsService",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSer' => #{
            path => "//system/console/configMgr/com.adobe.cq.social.journal.client.endpoints.impl.JournalOperationsService",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfile' => #{
            path => "//system/console/configMgr/com.adobe.cq.social.members.endpoints.impl.CommunityMemberGroupProfileOperationService",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileO' => #{
            path => "//system/console/configMgr/com.adobe.cq.social.members.endpoints.impl.CommunityMemberUserProfileOperationService",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentF' => #{
            path => "//system/console/configMgr/com.adobe.cq.social.members.impl.CommunityMemberGroupProfileComponentFactory",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperation' => #{
            path => "//system/console/configMgr/com.adobe.cq.social.messaging.client.endpoints.impl.MessagingOperationsServiceImpl",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponen' => #{
            path => "//system/console/configMgr/com.adobe.cq.social.moderation.dashboard.api.FilterGroupSocialComponentFactory",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeCqSocialModerationDashboardApiModerationDashboardSocial' => #{
            path => "//system/console/configMgr/com.adobe.cq.social.moderation.dashboard.api.ModerationDashboardSocialComponentFactory",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponen' => #{
            path => "//system/console/configMgr/com.adobe.cq.social.moderation.dashboard.api.UserDetailsSocialComponentFactory",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSoci' => #{
            path => "//system/console/configMgr/com.adobe.cq.social.moderation.dashboard.internal.impl.FilterGroupSocialComponentFactoryV2",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeCqSocialNotificationsImplMentionsRouter' => #{
            path => "//system/console/configMgr/com.adobe.cq.social.notifications.impl.MentionsRouter",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeCqSocialNotificationsImplNotificationManagerImpl' => #{
            path => "//system/console/configMgr/com.adobe.cq.social.notifications.impl.NotificationManagerImpl",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeCqSocialNotificationsImplNotificationsRouter' => #{
            path => "//system/console/configMgr/com.adobe.cq.social.notifications.impl.NotificationsRouter",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServic' => #{
            path => "//system/console/configMgr/com.adobe.cq.social.qna.client.endpoints.impl.QnaForumOperationsService",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportI' => #{
            path => "//system/console/configMgr/com.adobe.cq.social.reporting.analytics.services.impl.AnalyticsReportImporterServiceImpl",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportM' => #{
            path => "//system/console/configMgr/com.adobe.cq.social.reporting.analytics.services.impl.AnalyticsReportManagementServiceImpl",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportS' => #{
            path => "//system/console/configMgr/com.adobe.cq.social.reporting.analytics.services.impl.SiteTrendReportSocialComponentFactory",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServi' => #{
            path => "//system/console/configMgr/com.adobe.cq.social.review.client.endpoints.impl.ReviewOperationsService",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServlet' => #{
            path => "//system/console/configMgr/com.adobe.cq.social.scf.core.operations.impl.SocialOperationsServlet",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServlet' => #{
            path => "//system/console/configMgr/com.adobe.cq.social.scf.endpoints.impl.DefaultSocialGetServlet",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeCqSocialScoringImplScoringEventListener' => #{
            path => "//system/console/configMgr/com.adobe.cq.social.scoring.impl.ScoringEventListener",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImpl' => #{
            path => "//system/console/configMgr/com.adobe.cq.social.serviceusers.internal.impl.ServiceUserWrapperImpl",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeCqSocialSiteEndpointsImplSiteOperationService' => #{
            path => "//system/console/configMgr/com.adobe.cq.social.site.endpoints.impl.SiteOperationService",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceIm' => #{
            path => "//system/console/configMgr/com.adobe.cq.social.site.impl.AnalyticsComponentConfigurationServiceImpl",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeCqSocialSiteImplSiteConfiguratorImpl' => #{
            path => "//system/console/configMgr/com.adobe.cq.social.site.impl.SiteConfiguratorImpl",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeCqSocialSrpImplSocialSolrConnector' => #{
            path => "//system/console/configMgr/com.adobe.cq.social.srp.impl.SocialSolrConnector",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeCqSocialSyncImplDiffChangesObserver' => #{
            path => "//system/console/configMgr/com.adobe.cq.social.sync.impl.DiffChangesObserver",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeCqSocialSyncImplGroupSyncListenerImpl' => #{
            path => "//system/console/configMgr/com.adobe.cq.social.sync.impl.GroupSyncListenerImpl",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeCqSocialSyncImplPublisherSyncServiceImpl' => #{
            path => "//system/console/configMgr/com.adobe.cq.social.sync.impl.PublisherSyncServiceImpl",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeCqSocialSyncImplUserSyncListenerImpl' => #{
            path => "//system/console/configMgr/com.adobe.cq.social.sync.impl.UserSyncListenerImpl",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeCqSocialTranslationImplTranslationServiceConfigManager' => #{
            path => "//system/console/configMgr/com.adobe.cq.social.translation.impl.TranslationServiceConfigManager",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeCqSocialTranslationImplUGCLanguageDetector' => #{
            path => "//system/console/configMgr/com.adobe.cq.social.translation.impl.UGCLanguageDetector",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImpl' => #{
            path => "//system/console/configMgr/com.adobe.cq.social.ugcbase.dispatcher.impl.FlushServiceImpl",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImpl' => #{
            path => "//system/console/configMgr/com.adobe.cq.social.ugcbase.impl.AysncReverseReplicatorImpl",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeCqSocialUgcbaseImplPublisherConfigurationImpl' => #{
            path => "//system/console/configMgr/com.adobe.cq.social.ugcbase.impl.PublisherConfigurationImpl",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeCqSocialUgcbaseImplSocialUtilsImpl' => #{
            path => "//system/console/configMgr/com.adobe.cq.social.ugcbase.impl.SocialUtilsImpl",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeCqSocialUgcbaseModerationImplAutoModerationImpl' => #{
            path => "//system/console/configMgr/com.adobe.cq.social.ugcbase.moderation.impl.AutoModerationImpl",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeCqSocialUgcbaseModerationImplSentimentProcess' => #{
            path => "//system/console/configMgr/com.adobe.cq.social.ugcbase.moderation.impl.SentimentProcess",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackli' => #{
            path => "//system/console/configMgr/com.adobe.cq.social.ugcbase.security.impl.DefaultAttachmentTypeBlacklistService",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImpl' => #{
            path => "//system/console/configMgr/com.adobe.cq.social.ugcbase.security.impl.SaferSlingPostValidatorImpl",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServlet' => #{
            path => "//system/console/configMgr/com.adobe.cq.social.user.endpoints.impl.UsersGroupFromPublishServlet",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeCqSocialUserImplTransportHttpToPublisher' => #{
            path => "//system/console/configMgr/com.adobe.cq.social.user.impl.transport.HttpToPublisher",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFact' => #{
            path => "//system/console/configMgr/com.adobe.cq.ui.wcm.commons.internal.servlets.rte.RTEFilterServletFactory.amended",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeCqUpgradesCleanupImplUpgradeContentCleanup' => #{
            path => "//system/console/configMgr/com.adobe.cq.upgrades.cleanup.impl.UpgradeContentCleanup",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanup' => #{
            path => "//system/console/configMgr/com.adobe.cq.upgrades.cleanup.impl.UpgradeInstallFolderCleanup",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderService' => #{
            path => "//system/console/configMgr/com.adobe.cq.wcm.jobs.async.impl.AsyncDeleteConfigProviderService",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTask' => #{
            path => "//system/console/configMgr/com.adobe.cq.wcm.jobs.async.impl.AsyncJobCleanUpTask",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderService' => #{
            path => "//system/console/configMgr/com.adobe.cq.wcm.jobs.async.impl.AsyncMoveConfigProviderService",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderService' => #{
            path => "//system/console/configMgr/com.adobe.cq.wcm.jobs.async.impl.AsyncPageMoveConfigProviderService",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeCqWcmLaunchesImplLaunchesEventHandler' => #{
            path => "//system/console/configMgr/com.adobe.cq.wcm.launches.impl.LaunchesEventHandler",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeCqWcmMobileQrcodeServletQRCodeImageGenerator' => #{
            path => "//system/console/configMgr/com.adobe.cq.wcm.mobile.qrcode.servlet.QRCodeImageGenerator",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImpl' => #{
            path => "//system/console/configMgr/com.adobe.cq.wcm.style.internal.ComponentStyleInfoCacheImpl",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImpl' => #{
            path => "//system/console/configMgr/com.adobe.cq.wcm.translation.impl.TranslationPlatformConfigurationImpl",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigService' => #{
            path => "//system/console/configMgr/com.adobe.fd.fp.config.FormsPortalDraftsandSubmissionConfigService",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeFdFpConfigFormsPortalSchedulerService' => #{
            path => "//system/console/configMgr/com.adobe.fd.fp.config.FormsPortalSchedulerService",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeFormsCommonServiceImplDefaultDataProvider' => #{
            path => "//system/console/configMgr/com.adobe.forms.common.service.impl.DefaultDataProvider",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImp' => #{
            path => "//system/console/configMgr/com.adobe.forms.common.service.impl.FormsCommonConfigurationServiceImpl",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeFormsCommonServletTempCleanUpTask' => #{
            path => "//system/console/configMgr/com.adobe.forms.common.servlet.TempCleanUpTask",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeGraniteAcpPlatformPlatformServlet' => #{
            path => "//system/console/configMgr/com.adobe.granite.acp.platform.PlatformServlet",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeGraniteActivitystreamsImplActivityManagerImpl' => #{
            path => "//system/console/configMgr/com.adobe.granite.activitystreams.impl.ActivityManagerImpl",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeGraniteAnalyzerBaseSystemStatusServlet' => #{
            path => "//system/console/configMgr/com.adobe.granite.analyzer.base.SystemStatusServlet",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServlet' => #{
            path => "//system/console/configMgr/com.adobe.granite.analyzer.scripts.compile.AllScriptsCompilerServlet",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeGraniteApicontrollerFilterResolverHookFactory' => #{
            path => "//system/console/configMgr/com.adobe.granite.apicontroller.FilterResolverHookFactory",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeGraniteAuthCertImplClientCertAuthHandler' => #{
            path => "//system/console/configMgr/com.adobe.granite.auth.cert.impl.ClientCertAuthHandler",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeGraniteAuthIms' => #{
            path => "//system/console/configMgr/com.adobe.granite.auth.ims",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtension' => #{
            path => "//system/console/configMgr/com.adobe.granite.auth.ims.impl.ExternalUserIdMappingProviderExtension",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImpl' => #{
            path => "//system/console/configMgr/com.adobe.granite.auth.ims.impl.IMSAccessTokenRequestCustomizerImpl",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidator' => #{
            path => "//system/console/configMgr/com.adobe.granite.auth.ims.impl.IMSInstanceCredentialsValidator",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeGraniteAuthImsImplIMSProviderImpl' => #{
            path => "//system/console/configMgr/com.adobe.granite.auth.ims.impl.IMSProviderImpl",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeGraniteAuthImsImplImsConfigProviderImpl' => #{
            path => "//system/console/configMgr/com.adobe.granite.auth.ims.impl.ImsConfigProviderImpl",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeGraniteAuthOauthAccesstokenProvider' => #{
            path => "//system/console/configMgr/com.adobe.granite.auth.oauth.accesstoken.provider",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeGraniteAuthOauthImplBearerAuthenticationHandler' => #{
            path => "//system/console/configMgr/com.adobe.granite.auth.oauth.impl.BearerAuthenticationHandler",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImpl' => #{
            path => "//system/console/configMgr/com.adobe.granite.auth.oauth.impl.DefaultTokenValidatorImpl",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeGraniteAuthOauthImplFacebookProviderImpl' => #{
            path => "//system/console/configMgr/com.adobe.granite.auth.oauth.impl.FacebookProviderImpl",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeGraniteAuthOauthImplGithubProviderImpl' => #{
            path => "//system/console/configMgr/com.adobe.granite.auth.oauth.impl.GithubProviderImpl",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeGraniteAuthOauthImplGraniteProvider' => #{
            path => "//system/console/configMgr/com.adobe.granite.auth.oauth.impl.GraniteProvider",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeGraniteAuthOauthImplHelperProviderConfigManager' => #{
            path => "//system/console/configMgr/com.adobe.granite.auth.oauth.impl.helper.ProviderConfigManager",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternal' => #{
            path => "//system/console/configMgr/com.adobe.granite.auth.oauth.impl.helper.ProviderConfigManagerInternal",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandler' => #{
            path => "//system/console/configMgr/com.adobe.granite.auth.oauth.impl.OAuthAuthenticationHandler",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeGraniteAuthOauthImplTwitterProviderImpl' => #{
            path => "//system/console/configMgr/com.adobe.granite.auth.oauth.impl.TwitterProviderImpl",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeGraniteAuthOauthProvider' => #{
            path => "//system/console/configMgr/com.adobe.granite.auth.oauth.provider",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeGraniteAuthRequirementImplDefaultRequirementHandler' => #{
            path => "//system/console/configMgr/com.adobe.granite.auth.requirement.impl.DefaultRequirementHandler",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeGraniteAuthSamlSamlAuthenticationHandler' => #{
            path => "//system/console/configMgr/com.adobe.granite.auth.saml.SamlAuthenticationHandler",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeGraniteAuthSsoImplSsoAuthenticationHandler' => #{
            path => "//system/console/configMgr/com.adobe.granite.auth.sso.impl.SsoAuthenticationHandler",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeGraniteBundlesHcImplCodeCacheHealthCheck' => #{
            path => "//system/console/configMgr/com.adobe.granite.bundles.hc.impl.CodeCacheHealthCheck",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheck' => #{
            path => "//system/console/configMgr/com.adobe.granite.bundles.hc.impl.CrxdeSupportBundleHealthCheck",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeGraniteBundlesHcImplDavExBundleHealthCheck' => #{
            path => "//system/console/configMgr/com.adobe.granite.bundles.hc.impl.DavExBundleHealthCheck",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheck' => #{
            path => "//system/console/configMgr/com.adobe.granite.bundles.hc.impl.InactiveBundlesHealthCheck",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeGraniteBundlesHcImplJobsHealthCheck' => #{
            path => "//system/console/configMgr/com.adobe.granite.bundles.hc.impl.JobsHealthCheck",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeGraniteBundlesHcImplSlingGetServletHealthCheck' => #{
            path => "//system/console/configMgr/com.adobe.granite.bundles.hc.impl.SlingGetServletHealthCheck",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheck' => #{
            path => "//system/console/configMgr/com.adobe.granite.bundles.hc.impl.SlingJavaScriptHandlerHealthCheck",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheck' => #{
            path => "//system/console/configMgr/com.adobe.granite.bundles.hc.impl.SlingJspScriptHandlerHealthCheck",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheck' => #{
            path => "//system/console/configMgr/com.adobe.granite.bundles.hc.impl.SlingReferrerFilterHealthCheck",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheck' => #{
            path => "//system/console/configMgr/com.adobe.granite.bundles.hc.impl.WebDavBundleHealthCheck",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFac' => #{
            path => "//system/console/configMgr/com.adobe.granite.comments.internal.CommentReplicationContentFilterFactory",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImpl' => #{
            path => "//system/console/configMgr/com.adobe.granite.compatrouter.impl.CompatSwitchingServiceImpl",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeGraniteCompatrouterImplRoutingConfig' => #{
            path => "//system/console/configMgr/com.adobe.granite.compatrouter.impl.RoutingConfig",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeGraniteCompatrouterImplSwitchMappingConfig' => #{
            path => "//system/console/configMgr/com.adobe.granite.compatrouter.impl.SwitchMappingConfig",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolving' => #{
            path => "//system/console/configMgr/com.adobe.granite.conf.impl.RuntimeAwareConfigurationResourceResolvingStrategy",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeGraniteContexthubImplContextHubImpl' => #{
            path => "//system/console/configMgr/com.adobe.granite.contexthub.impl.ContextHubImpl",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeGraniteCorsImplCORSPolicyImpl' => #{
            path => "//system/console/configMgr/com.adobe.granite.cors.impl.CORSPolicyImpl",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeGraniteCsrfImplCSRFFilter' => #{
            path => "//system/console/configMgr/com.adobe.granite.csrf.impl.CSRFFilter",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeGraniteCsrfImplCSRFServlet' => #{
            path => "//system/console/configMgr/com.adobe.granite.csrf.impl.CSRFServlet",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSe' => #{
            path => "//system/console/configMgr/com.adobe.granite.distribution.core.impl.CryptoDistributionTransportSecretProvider",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserver' => #{
            path => "//system/console/configMgr/com.adobe.granite.distribution.core.impl.diff.DiffChangesObserver",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeGraniteDistributionCoreImplDiffDiffEventListener' => #{
            path => "//system/console/configMgr/com.adobe.granite.distribution.core.impl.diff.DiffEventListener",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeGraniteDistributionCoreImplDistributionToReplicationEven' => #{
            path => "//system/console/configMgr/com.adobe.granite.distribution.core.impl.DistributionToReplicationEventTransformer",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicat' => #{
            path => "//system/console/configMgr/com.adobe.granite.distribution.core.impl.replication.adapters.ReplicationAgentProvider",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeGraniteDistributionCoreImplReplicationDistributionTrans' => #{
            path => "//system/console/configMgr/com.adobe.granite.distribution.core.impl.replication.DistributionTransportHandler",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribu' => #{
            path => "//system/console/configMgr/com.adobe.granite.distribution.core.impl.transport.AccessTokenDistributionTransportSecretProvider",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeGraniteFragsImplCheckHttpHeaderFlag' => #{
            path => "//system/console/configMgr/com.adobe.granite.frags.impl.CheckHttpHeaderFlag",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeGraniteFragsImplRandomFeature' => #{
            path => "//system/console/configMgr/com.adobe.granite.frags.impl.RandomFeature",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeGraniteHttpcacheFileFileCacheStore' => #{
            path => "//system/console/configMgr/com.adobe.granite.httpcache.file.FileCacheStore",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeGraniteHttpcacheImplOuterCacheFilter' => #{
            path => "//system/console/configMgr/com.adobe.granite.httpcache.impl.OuterCacheFilter",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeGraniteI18nImplBundlePseudoTranslations' => #{
            path => "//system/console/configMgr/com.adobe.granite.i18n.impl.bundle.PseudoTranslations",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeGraniteI18nImplPreferencesLocaleResolverService' => #{
            path => "//system/console/configMgr/com.adobe.granite.i18n.impl.PreferencesLocaleResolverService",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeGraniteInfocollectorInfoCollector' => #{
            path => "//system/console/configMgr/com.adobe.granite.infocollector.InfoCollector",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeGraniteJettySslInternalGraniteSslConnectorFactory' => #{
            path => "//system/console/configMgr/com.adobe.granite.jetty.ssl.internal.GraniteSslConnectorFactory",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeGraniteLicenseImplLicenseCheckFilter' => #{
            path => "//system/console/configMgr/com.adobe.granite.license.impl.LicenseCheckFilter",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeGraniteLoggingImplLogAnalyserImpl' => #{
            path => "//system/console/configMgr/com.adobe.granite.logging.impl.LogAnalyserImpl",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeGraniteLoggingImplLogErrorHealthCheck' => #{
            path => "//system/console/configMgr/com.adobe.granite.logging.impl.LogErrorHealthCheck",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTask' => #{
            path => "//system/console/configMgr/com.adobe.granite.maintenance.crx.impl.DataStoreGarbageCollectionTask",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTask' => #{
            path => "//system/console/configMgr/com.adobe.granite.maintenance.crx.impl.LuceneBinariesCleanupTask",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTask' => #{
            path => "//system/console/configMgr/com.adobe.granite.maintenance.crx.impl.RevisionCleanupTask",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeGraniteMonitoringImplScriptConfigImpl' => #{
            path => "//system/console/configMgr/com.adobe.granite.monitoring.impl.ScriptConfigImpl",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHan' => #{
            path => "//system/console/configMgr/com.adobe.granite.oauth.server.auth.impl.OAuth2ServerAuthenticationHandler",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeGraniteOauthServerImplAccessTokenCleanupTask' => #{
            path => "//system/console/configMgr/com.adobe.granite.oauth.server.impl.AccessTokenCleanupTask",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServlet' => #{
            path => "//system/console/configMgr/com.adobe.granite.oauth.server.impl.OAuth2ClientRevocationServlet",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServlet' => #{
            path => "//system/console/configMgr/com.adobe.granite.oauth.server.impl.OAuth2RevocationEndpointServlet",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServlet' => #{
            path => "//system/console/configMgr/com.adobe.granite.oauth.server.impl.OAuth2TokenEndpointServlet",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServlet' => #{
            path => "//system/console/configMgr/com.adobe.granite.oauth.server.impl.OAuth2TokenRevocationServlet",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeGraniteOffloadingImplOffloadingConfigurator' => #{
            path => "//system/console/configMgr/com.adobe.granite.offloading.impl.OffloadingConfigurator",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeGraniteOffloadingImplOffloadingJobCloner' => #{
            path => "//system/console/configMgr/com.adobe.granite.offloading.impl.OffloadingJobCloner",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeGraniteOffloadingImplOffloadingJobOffloader' => #{
            path => "//system/console/configMgr/com.adobe.granite.offloading.impl.OffloadingJobOffloader",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManager' => #{
            path => "//system/console/configMgr/com.adobe.granite.offloading.impl.transporter.OffloadingAgentManager",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspo' => #{
            path => "//system/console/configMgr/com.adobe.granite.offloading.impl.transporter.OffloadingDefaultTransporter",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImpl' => #{
            path => "//system/console/configMgr/com.adobe.granite.omnisearch.impl.core.OmniSearchServiceImpl",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeGraniteOptoutImplOptOutServiceImpl' => #{
            path => "//system/console/configMgr/com.adobe.granite.optout.impl.OptOutServiceImpl",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheck' => #{
            path => "//system/console/configMgr/com.adobe.granite.queries.impl.hc.AsyncIndexHealthCheck",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeGraniteQueriesImplHcLargeIndexHealthCheck' => #{
            path => "//system/console/configMgr/com.adobe.granite.queries.impl.hc.LargeIndexHealthCheck",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheck' => #{
            path => "//system/console/configMgr/com.adobe.granite.queries.impl.hc.QueriesStatusHealthCheck",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeGraniteQueriesImplHcQueryHealthCheckMetrics' => #{
            path => "//system/console/configMgr/com.adobe.granite.queries.impl.hc.QueryHealthCheckMetrics",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheck' => #{
            path => "//system/console/configMgr/com.adobe.granite.queries.impl.hc.QueryLimitsHealthCheck",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheck' => #{
            path => "//system/console/configMgr/com.adobe.granite.replication.hc.impl.ReplicationQueueHealthCheck",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthC' => #{
            path => "//system/console/configMgr/com.adobe.granite.replication.hc.impl.ReplicationTransportUsersHealthCheck",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheck' => #{
            path => "//system/console/configMgr/com.adobe.granite.repository.hc.impl.AuthorizableNodeNameHealthCheck",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthC' => #{
            path => "//system/console/configMgr/com.adobe.granite.repository.hc.impl.content.sling.SlingContentHealthCheck",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeGraniteRepositoryHcImplContinuousRGCHealthCheck' => #{
            path => "//system/console/configMgr/com.adobe.granite.repository.hc.impl.ContinuousRGCHealthCheck",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthChe' => #{
            path => "//system/console/configMgr/com.adobe.granite.repository.hc.impl.DefaultAccessUserProfileHealthCheck",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheck' => #{
            path => "//system/console/configMgr/com.adobe.granite.repository.hc.impl.DefaultLoginsHealthCheck",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheck' => #{
            path => "//system/console/configMgr/com.adobe.granite.repository.hc.impl.DiskSpaceHealthCheck",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheck' => #{
            path => "//system/console/configMgr/com.adobe.granite.repository.hc.impl.ObservationQueueLengthHealthCheck",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeGraniteRepositoryImplCommitStatsConfig' => #{
            path => "//system/console/configMgr/com.adobe.granite.repository.impl.CommitStatsConfig",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeGraniteRepositoryServiceUserConfiguration' => #{
            path => "//system/console/configMgr/com.adobe.granite.repository.ServiceUserConfiguration",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckIm' => #{
            path => "//system/console/configMgr/com.adobe.granite.requests.logging.impl.hc.RequestsStatusHealthCheckImpl",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeGraniteResourcestatusImplCompositeStatusType' => #{
            path => "//system/console/configMgr/com.adobe.granite.resourcestatus.impl.CompositeStatusType",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeGraniteResourcestatusImplStatusResourceProviderImpl' => #{
            path => "//system/console/configMgr/com.adobe.granite.resourcestatus.impl.StatusResourceProviderImpl",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeGraniteRestAssetsImplAssetContentDispositionFilter' => #{
            path => "//system/console/configMgr/com.adobe.granite.rest.assets.impl.AssetContentDispositionFilter",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImpl' => #{
            path => "//system/console/configMgr/com.adobe.granite.rest.impl.ApiEndpointResourceProviderFactoryImpl",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeGraniteRestImplServletDefaultGETServlet' => #{
            path => "//system/console/configMgr/com.adobe.granite.rest.impl.servlet.DefaultGETServlet",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationS' => #{
            path => "//system/console/configMgr/com.adobe.granite.security.user.ui.internal.servlets.SSLConfigurationServlet",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeGraniteSecurityUserUserPropertiesService' => #{
            path => "//system/console/configMgr/com.adobe.granite.security.user.UserPropertiesService",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeGraniteSocialgraphImplSocialGraphFactoryImpl' => #{
            path => "//system/console/configMgr/com.adobe.granite.socialgraph.impl.SocialGraphFactoryImpl",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImpl' => #{
            path => "//system/console/configMgr/com.adobe.granite.system.monitoring.impl.SystemStatsMBeanImpl",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactory' => #{
            path => "//system/console/configMgr/com.adobe.granite.taskmanagement.impl.jcr.TaskAdapterFactory",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeGraniteTaskmanagementImplJcrTaskArchiveService' => #{
            path => "//system/console/configMgr/com.adobe.granite.taskmanagement.impl.jcr.TaskArchiveService",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTask' => #{
            path => "//system/console/configMgr/com.adobe.granite.taskmanagement.impl.purge.TaskPurgeMaintenanceTask",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactor' => #{
            path => "//system/console/configMgr/com.adobe.granite.taskmanagement.impl.service.TaskManagerAdapterFactory",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeGraniteThreaddumpThreadDumpCollector' => #{
            path => "//system/console/configMgr/com.adobe.granite.threaddump.ThreadDumpCollector",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTransl' => #{
            path => "//system/console/configMgr/com.adobe.granite.translation.connector.msft.core.impl.MicrosoftTranslationServiceFactoryImpl",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeGraniteTranslationCoreImplTranslationManagerImpl' => #{
            path => "//system/console/configMgr/com.adobe.granite.translation.core.impl.TranslationManagerImpl",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImpl' => #{
            path => "//system/console/configMgr/com.adobe.granite.ui.clientlibs.impl.HtmlLibraryManagerImpl",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeature' => #{
            path => "//system/console/configMgr/com.adobe.granite.workflow.console.frags.WorkflowWithdrawFeature",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventService' => #{
            path => "//system/console/configMgr/com.adobe.granite.workflow.console.publish.WorkflowPublishEventService",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManager' => #{
            path => "//system/console/configMgr/com.adobe.granite.workflow.core.jcr.WorkflowBucketManager",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandler' => #{
            path => "//system/console/configMgr/com.adobe.granite.workflow.core.job.ExternalProcessJobHandler",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeGraniteWorkflowCoreJobJobHandler' => #{
            path => "//system/console/configMgr/com.adobe.granite.workflow.core.job.JobHandler",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsum' => #{
            path => "//system/console/configMgr/com.adobe.granite.workflow.core.offloading.WorkflowOffloadingJobConsumer",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeGraniteWorkflowCorePayloadMapCache' => #{
            path => "//system/console/configMgr/com.adobe.granite.workflow.core.PayloadMapCache",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListener' => #{
            path => "//system/console/configMgr/com.adobe.granite.workflow.core.payloadmap.PayloadMoveListener",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeGraniteWorkflowCoreWorkflowConfig' => #{
            path => "//system/console/configMgr/com.adobe.granite.workflow.core.WorkflowConfig",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeGraniteWorkflowCoreWorkflowSessionFactory' => #{
            path => "//system/console/configMgr/com.adobe.granite.workflow.core.WorkflowSessionFactory",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeGraniteWorkflowPurgeScheduler' => #{
            path => "//system/console/configMgr/com.adobe.granite.workflow.purge.Scheduler",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeOctopusNcommBootstrap' => #{
            path => "//system/console/configMgr/com.adobe.octopus.ncomm.bootstrap",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullS' => #{
            path => "//system/console/configMgr/com.adobe.social.integrations.livefyre.user.pingforpull.impl.PingPullServlet",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComAdobeXmpWorkerFilesNcommXMPFilesNComm' => #{
            path => "//system/console/configMgr/com.adobe.xmp.worker.files.ncomm.XMPFilesNComm",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCommonsDatasourceJdbcpoolJdbcPoolService' => #{
            path => "//system/console/configMgr/com.day.commons.datasource.jdbcpool.JdbcPoolService",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCommonsHttpclient' => #{
            path => "//system/console/configMgr/com.day.commons.httpclient",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqAnalyticsImplStorePropertiesChangeListener' => #{
            path => "//system/console/configMgr/com.day.cq.analytics.impl.StorePropertiesChangeListener",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporte' => #{
            path => "//system/console/configMgr/com.day.cq.analytics.sitecatalyst.impl.exporter.ClassificationsExporter",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqAnalyticsSitecatalystImplImporterReportImporter' => #{
            path => "//system/console/configMgr/com.day.cq.analytics.sitecatalyst.impl.importer.ReportImporter",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactory' => #{
            path => "//system/console/configMgr/com.day.cq.analytics.sitecatalyst.impl.SitecatalystAdapterFactory",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImpl' => #{
            path => "//system/console/configMgr/com.day.cq.analytics.sitecatalyst.impl.SitecatalystHttpClientImpl",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdater' => #{
            path => "//system/console/configMgr/com.day.cq.analytics.testandtarget.impl.AccountOptionsUpdater",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListener' => #{
            path => "//system/console/configMgr/com.day.cq.analytics.testandtarget.impl.DeleteAuthorActivityListener",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListener' => #{
            path => "//system/console/configMgr/com.day.cq.analytics.testandtarget.impl.PushAuthorCampaignPageListener",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqAnalyticsTestandtargetImplSegmentImporter' => #{
            path => "//system/console/configMgr/com.day.cq.analytics.testandtarget.impl.SegmentImporter",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqAnalyticsTestandtargetImplServiceWebServiceImpl' => #{
            path => "//system/console/configMgr/com.day.cq.analytics.testandtarget.impl.service.WebServiceImpl",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqAnalyticsTestandtargetImplServletsAdminServerServlet' => #{
            path => "//system/console/configMgr/com.day.cq.analytics.testandtarget.impl.servlets.AdminServerServlet",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImpl' => #{
            path => "//system/console/configMgr/com.day.cq.analytics.testandtarget.impl.TestandtargetHttpClientImpl",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqAuthImplCugCugSupportImpl' => #{
            path => "//system/console/configMgr/com.day.cq.auth.impl.cug.CugSupportImpl",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqAuthImplLoginSelectorHandler' => #{
            path => "//system/console/configMgr/com.day.cq.auth.impl.LoginSelectorHandler",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqCommonsImplExternalizerImpl' => #{
            path => "//system/console/configMgr/com.day.cq.commons.impl.ExternalizerImpl",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqCommonsServletsRootMappingServlet' => #{
            path => "//system/console/configMgr/com.day.cq.commons.servlets.RootMappingServlet",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionChecke' => #{
            path => "//system/console/configMgr/com.day.cq.compat.codeupgrade.impl.CodeUpgradeExecutionConditionChecker",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreList' => #{
            path => "//system/console/configMgr/com.day.cq.compat.codeupgrade.impl.UpgradeTaskIgnoreList",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelist' => #{
            path => "//system/console/configMgr/com.day.cq.compat.codeupgrade.impl.VersionRangeTaskIgnorelist",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqContentsyncImplContentSyncManagerImpl' => #{
            path => "//system/console/configMgr/com.day.cq.contentsync.impl.ContentSyncManagerImpl",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqDamCommonsHandlerStandardImageHandler' => #{
            path => "//system/console/configMgr/com.day.cq.dam.commons.handler.StandardImageHandler",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqDamCommonsMetadataXmpFilterBlackWhite' => #{
            path => "//system/console/configMgr/com.day.cq.dam.commons.metadata.XmpFilterBlackWhite",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqDamCommonsUtilImplAssetCacheImpl' => #{
            path => "//system/console/configMgr/com.day.cq.dam.commons.util.impl.AssetCacheImpl",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfig' => #{
            path => "//system/console/configMgr/com.day.cq.dam.core.impl.annotation.pdf.AnnotationPdfConfig",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqDamCoreImplAssetMoveListener' => #{
            path => "//system/console/configMgr/com.day.cq.dam.core.impl.AssetMoveListener",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqDamCoreImplAssethomeAssetHomePageConfiguration' => #{
            path => "//system/console/configMgr/com.day.cq.dam.core.impl.assethome.AssetHomePageConfiguration",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServlet' => #{
            path => "//system/console/configMgr/com.day.cq.dam.core.impl.assetlinkshare.AdhocAssetShareProxyServlet",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqDamCoreImplCacheCQBufferedImageCache' => #{
            path => "//system/console/configMgr/com.day.cq.dam.core.impl.cache.CQBufferedImageCache",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqDamCoreImplDamChangeEventListener' => #{
            path => "//system/console/configMgr/com.day.cq.dam.core.impl.DamChangeEventListener",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqDamCoreImplDamEventPurgeService' => #{
            path => "//system/console/configMgr/com.day.cq.dam.core.impl.DamEventPurgeService",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqDamCoreImplDamEventRecorderImpl' => #{
            path => "//system/console/configMgr/com.day.cq.dam.core.impl.DamEventRecorderImpl",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqDamCoreImplEventDamEventAuditListener' => #{
            path => "//system/console/configMgr/com.day.cq.dam.core.impl.event.DamEventAuditListener",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqDamCoreImplExpiryNotificationJobImpl' => #{
            path => "//system/console/configMgr/com.day.cq.dam.core.impl.ExpiryNotificationJobImpl",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeat' => #{
            path => "//system/console/configMgr/com.day.cq.dam.core.impl.foldermetadataschema.FolderMetadataSchemaFeatureFlag",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqDamCoreImplGfxCommonsGfxRenderer' => #{
            path => "//system/console/configMgr/com.day.cq.dam.core.impl.gfx.CommonsGfxRenderer",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqDamCoreImplHandlerEPSFormatHandler' => #{
            path => "//system/console/configMgr/com.day.cq.dam.core.impl.handler.EPSFormatHandler",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqDamCoreImplHandlerIndesignFormatHandler' => #{
            path => "//system/console/configMgr/com.day.cq.dam.core.impl.handler.IndesignFormatHandler",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqDamCoreImplHandlerJpegHandler' => #{
            path => "//system/console/configMgr/com.day.cq.dam.core.impl.handler.JpegHandler",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqDamCoreImplHandlerXmpNCommXMPHandler' => #{
            path => "//system/console/configMgr/com.day.cq.dam.core.impl.handler.xmp.NCommXMPHandler",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqDamCoreImplJmxAssetIndexUpdateMonitor' => #{
            path => "//system/console/configMgr/com.day.cq.dam.core.impl.jmx.AssetIndexUpdateMonitor",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqDamCoreImplJmxAssetMigrationMBeanImpl' => #{
            path => "//system/console/configMgr/com.day.cq.dam.core.impl.jmx.AssetMigrationMBeanImpl",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqDamCoreImplJmxAssetUpdateMonitorImpl' => #{
            path => "//system/console/configMgr/com.day.cq.dam.core.impl.jmx.AssetUpdateMonitorImpl",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfig' => #{
            path => "//system/console/configMgr/com.day.cq.dam.core.impl.jobs.metadataexport.AsyncMetadataExportConfigProviderService",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfig' => #{
            path => "//system/console/configMgr/com.day.cq.dam.core.impl.jobs.metadataimport.AsyncMetadataImportConfigProviderService",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqDamCoreImplLightboxLightboxServlet' => #{
            path => "//system/console/configMgr/com.day.cq.dam.core.impl.lightbox.LightboxServlet",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqDamCoreImplMetadataEditorSelectComponentHandler' => #{
            path => "//system/console/configMgr/com.day.cq.dam.core.impl.metadata.editor.SelectComponentHandler",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelper' => #{
            path => "//system/console/configMgr/com.day.cq.dam.core.impl.mimeType.AssetUploadRestrictionHelper",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImpl' => #{
            path => "//system/console/configMgr/com.day.cq.dam.core.impl.mimeType.DamMimeTypeServiceImpl",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqDamCoreImplMissingMetadataNotificationJob' => #{
            path => "//system/console/configMgr/com.day.cq.dam.core.impl.MissingMetadataNotificationJob",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPr' => #{
            path => "//system/console/configMgr/com.day.cq.dam.core.impl.process.SendTransientWorkflowCompletedEmailProcess",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqDamCoreImplProcessTextExtractionProcess' => #{
            path => "//system/console/configMgr/com.day.cq.dam.core.impl.process.TextExtractionProcess",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqDamCoreImplRenditionMakerImpl' => #{
            path => "//system/console/configMgr/com.day.cq.dam.core.impl.RenditionMakerImpl",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqDamCoreImplReportsReportExportService' => #{
            path => "//system/console/configMgr/com.day.cq.dam.core.impl.reports.ReportExportService",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqDamCoreImplReportsReportPurgeService' => #{
            path => "//system/console/configMgr/com.day.cq.dam.core.impl.reports.ReportPurgeService",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqDamCoreImplServletAssetDownloadServlet' => #{
            path => "//system/console/configMgr/com.day.cq.dam.core.impl.servlet.AssetDownloadServlet",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqDamCoreImplServletAssetStatusServlet' => #{
            path => "//system/console/configMgr/com.day.cq.dam.core.impl.servlet.AssetStatusServlet",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqDamCoreImplServletAssetXMPSearchServlet' => #{
            path => "//system/console/configMgr/com.day.cq.dam.core.impl.servlet.AssetXMPSearchServlet",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqDamCoreImplServletBatchMetadataServlet' => #{
            path => "//system/console/configMgr/com.day.cq.dam.core.impl.servlet.BatchMetadataServlet",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqDamCoreImplServletBinaryProviderServlet' => #{
            path => "//system/console/configMgr/com.day.cq.dam.core.impl.servlet.BinaryProviderServlet",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqDamCoreImplServletCollectionServlet' => #{
            path => "//system/console/configMgr/com.day.cq.dam.core.impl.servlet.CollectionServlet",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqDamCoreImplServletCollectionsServlet' => #{
            path => "//system/console/configMgr/com.day.cq.dam.core.impl.servlet.CollectionsServlet",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqDamCoreImplServletCompanionServlet' => #{
            path => "//system/console/configMgr/com.day.cq.dam.core.impl.servlet.CompanionServlet",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqDamCoreImplServletCreateAssetServlet' => #{
            path => "//system/console/configMgr/com.day.cq.dam.core.impl.servlet.CreateAssetServlet",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqDamCoreImplServletDamContentDispositionFilter' => #{
            path => "//system/console/configMgr/com.day.cq.dam.core.impl.servlet.DamContentDispositionFilter",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqDamCoreImplServletGuidLookupFilter' => #{
            path => "//system/console/configMgr/com.day.cq.dam.core.impl.servlet.GuidLookupFilter",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqDamCoreImplServletHealthCheckServlet' => #{
            path => "//system/console/configMgr/com.day.cq.dam.core.impl.servlet.HealthCheckServlet",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqDamCoreImplServletMetadataGetServlet' => #{
            path => "//system/console/configMgr/com.day.cq.dam.core.impl.servlet.MetadataGetServlet",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqDamCoreImplServletMultipleLicenseAcceptServlet' => #{
            path => "//system/console/configMgr/com.day.cq.dam.core.impl.servlet.MultipleLicenseAcceptServlet",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqDamCoreImplServletResourceCollectionServlet' => #{
            path => "//system/console/configMgr/com.day.cq.dam.core.impl.servlet.ResourceCollectionServlet",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImpl' => #{
            path => "//system/console/configMgr/com.day.cq.dam.core.impl.ui.preview.FolderPreviewUpdaterImpl",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqDamCoreImplUnzipUnzipConfig' => #{
            path => "//system/console/configMgr/com.day.cq.dam.core.impl.unzip.UnzipConfig",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqDamCoreProcessExifToolExtractMetadataProcess' => #{
            path => "//system/console/configMgr/com.day.cq.dam.core.process.ExifToolExtractMetadataProcess",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqDamCoreProcessExtractMetadataProcess' => #{
            path => "//system/console/configMgr/com.day.cq.dam.core.process.ExtractMetadataProcess",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqDamCoreProcessMetadataProcessorProcess' => #{
            path => "//system/console/configMgr/com.day.cq.dam.core.process.MetadataProcessorProcess",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqDamHandlerFfmpegLocatorImpl' => #{
            path => "//system/console/configMgr/com.day.cq.dam.handler.ffmpeg.LocatorImpl",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImpl' => #{
            path => "//system/console/configMgr/com.day.cq.dam.handler.gibson.fontmanager.impl.FontManagerServiceImpl",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqDamHandlerStandardPdfPdfHandler' => #{
            path => "//system/console/configMgr/com.day.cq.dam.handler.standard.pdf.PdfHandler",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqDamHandlerStandardPsPostScriptHandler' => #{
            path => "//system/console/configMgr/com.day.cq.dam.handler.standard.ps.PostScriptHandler",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqDamHandlerStandardPsdPsdHandler' => #{
            path => "//system/console/configMgr/com.day.cq.dam.handler.standard.psd.PsdHandler",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqDamIdsImplIDSJobProcessor' => #{
            path => "//system/console/configMgr/com.day.cq.dam.ids.impl.IDSJobProcessor",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqDamIdsImplIDSPoolManagerImpl' => #{
            path => "//system/console/configMgr/com.day.cq.dam.ids.impl.IDSPoolManagerImpl",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqDamInddImplHandlerIndesignXMPHandler' => #{
            path => "//system/console/configMgr/com.day.cq.dam.indd.impl.handler.IndesignXMPHandler",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqDamInddImplServletSnippetCreationServlet' => #{
            path => "//system/console/configMgr/com.day.cq.dam.indd.impl.servlet.SnippetCreationServlet",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqDamInddProcessINDDMediaExtractProcess' => #{
            path => "//system/console/configMgr/com.day.cq.dam.indd.process.INDDMediaExtractProcess",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImpl' => #{
            path => "//system/console/configMgr/com.day.cq.dam.performance.internal.AssetPerformanceDataHandlerImpl",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJob' => #{
            path => "//system/console/configMgr/com.day.cq.dam.performance.internal.AssetPerformanceReportSyncJob",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadPro' => #{
            path => "//system/console/configMgr/com.day.cq.dam.pim.impl.sourcing.upload.process.ProductAssetsUploadProcess",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEven' => #{
            path => "//system/console/configMgr/com.day.cq.dam.s7dam.common.analytics.impl.S7damDynamicMediaConfigEventListener",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunner' => #{
            path => "//system/console/configMgr/com.day.cq.dam.s7dam.common.analytics.impl.SiteCatalystReportRunner",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqDamS7damCommonPostServletsSetCreateHandler' => #{
            path => "//system/console/configMgr/com.day.cq.dam.s7dam.common.post.servlets.SetCreateHandler",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqDamS7damCommonPostServletsSetModifyHandler' => #{
            path => "//system/console/configMgr/com.day.cq.dam.s7dam.common.post.servlets.SetModifyHandler",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcess' => #{
            path => "//system/console/configMgr/com.day.cq.dam.s7dam.common.process.VideoThumbnailDownloadProcess",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqDamS7damCommonS7damDamChangeEventListener' => #{
            path => "//system/console/configMgr/com.day.cq.dam.s7dam.common.S7damDamChangeEventListener",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqDamS7damCommonServletsS7damProductInfoServlet' => #{
            path => "//system/console/configMgr/com.day.cq.dam.s7dam.common.servlets.S7damProductInfoServlet",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImpl' => #{
            path => "//system/console/configMgr/com.day.cq.dam.s7dam.common.video.impl.VideoProxyClientServiceImpl",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqDamScene7ImplScene7APIClientImpl' => #{
            path => "//system/console/configMgr/com.day.cq.dam.scene7.impl.Scene7APIClientImpl",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImpl' => #{
            path => "//system/console/configMgr/com.day.cq.dam.scene7.impl.Scene7AssetMimeTypeServiceImpl",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqDamScene7ImplScene7ConfigurationEventListener' => #{
            path => "//system/console/configMgr/com.day.cq.dam.scene7.impl.Scene7ConfigurationEventListener",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqDamScene7ImplScene7DamChangeEventListener' => #{
            path => "//system/console/configMgr/com.day.cq.dam.scene7.impl.Scene7DamChangeEventListener",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqDamScene7ImplScene7FlashTemplatesServiceImpl' => #{
            path => "//system/console/configMgr/com.day.cq.dam.scene7.impl.Scene7FlashTemplatesServiceImpl",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqDamScene7ImplScene7UploadServiceImpl' => #{
            path => "//system/console/configMgr/com.day.cq.dam.scene7.impl.Scene7UploadServiceImpl",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSer' => #{
            path => "//system/console/configMgr/com.day.cq.dam.stock.integration.impl.cache.StockCacheConfigurationServiceImpl",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqDamStockIntegrationImplConfigurationStockConfiguration' => #{
            path => "//system/console/configMgr/com.day.cq.dam.stock.integration.impl.configuration.StockConfigurationImpl",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqDamVideoImplServletVideoTestServlet' => #{
            path => "//system/console/configMgr/com.day.cq.dam.video.impl.servlet.VideoTestServlet",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqExtwidgetServletsImageSpriteServlet' => #{
            path => "//system/console/configMgr/com.day.cq.extwidget.servlets.ImageSpriteServlet",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqImageInternalFontFontHelper' => #{
            path => "//system/console/configMgr/com.day.cq.image.internal.font.FontHelper",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqJcrclustersupportClusterStartLevelController' => #{
            path => "//system/console/configMgr/com.day.cq.jcrclustersupport.ClusterStartLevelController",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqMailerDefaultMailService' => #{
            path => "//system/console/configMgr/com.day.cq.mailer.DefaultMailService",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqMailerImplCqMailingService' => #{
            path => "//system/console/configMgr/com.day.cq.mailer.impl.CqMailingService",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqMailerImplEmailCqEmailTemplateFactory' => #{
            path => "//system/console/configMgr/com.day.cq.mailer.impl.email.CqEmailTemplateFactory",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqMailerImplEmailCqRetrieverTemplateFactory' => #{
            path => "//system/console/configMgr/com.day.cq.mailer.impl.email.CqRetrieverTemplateFactory",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqMcmCampaignImplIntegrationConfigImpl' => #{
            path => "//system/console/configMgr/com.day.cq.mcm.campaign.impl.IntegrationConfigImpl",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqMcmCampaignImporterPersonalizedTextHandlerFactory' => #{
            path => "//system/console/configMgr/com.day.cq.mcm.campaign.importer.PersonalizedTextHandlerFactory",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqMcmCoreNewsletterNewsletterEmailServiceImpl' => #{
            path => "//system/console/configMgr/com.day.cq.mcm.core.newsletter.NewsletterEmailServiceImpl",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqMcmImplMCMConfiguration' => #{
            path => "//system/console/configMgr/com.day.cq.mcm.impl.MCMConfiguration",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponen' => #{
            path => "//system/console/configMgr/com.day.cq.mcm.landingpage.parser.taghandlers.cta.ClickThroughComponentTagHandlerFactory",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThroug' => #{
            path => "//system/console/configMgr/com.day.cq.mcm.landingpage.parser.taghandlers.cta.GraphicalClickThroughComponentTagHandlerFactory",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponent' => #{
            path => "//system/console/configMgr/com.day.cq.mcm.landingpage.parser.taghandlers.cta.LeadFormCTAComponentTagHandlerFactory",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHa' => #{
            path => "//system/console/configMgr/com.day.cq.mcm.landingpage.parser.taghandlers.mbox.MBoxExperienceTagHandlerFactory",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagH' => #{
            path => "//system/console/configMgr/com.day.cq.mcm.landingpage.parser.taghandlers.mbox.TargetComponentTagHandlerFactory",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqNotificationImplNotificationServiceImpl' => #{
            path => "//system/console/configMgr/com.day.cq.notification.impl.NotificationServiceImpl",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqPersonalizationImplServletsTargetingConfigurationServlet' => #{
            path => "//system/console/configMgr/com.day.cq.personalization.impl.servlets.TargetingConfigurationServlet",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqPollingImporterImplManagedPollConfigImpl' => #{
            path => "//system/console/configMgr/com.day.cq.polling.importer.impl.ManagedPollConfigImpl",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqPollingImporterImplManagedPollingImporterImpl' => #{
            path => "//system/console/configMgr/com.day.cq.polling.importer.impl.ManagedPollingImporterImpl",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqPollingImporterImplPollingImporterImpl' => #{
            path => "//system/console/configMgr/com.day.cq.polling.importer.impl.PollingImporterImpl",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqReplicationAuditReplicationEventListener' => #{
            path => "//system/console/configMgr/com.day.cq.replication.audit.ReplicationEventListener",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqReplicationContentStaticContentBuilder' => #{
            path => "//system/console/configMgr/com.day.cq.replication.content.StaticContentBuilder",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqReplicationImplAgentManagerImpl' => #{
            path => "//system/console/configMgr/com.day.cq.replication.impl.AgentManagerImpl",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqReplicationImplContentDurboBinaryLessContentBuilder' => #{
            path => "//system/console/configMgr/com.day.cq.replication.impl.content.durbo.BinaryLessContentBuilder",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqReplicationImplContentDurboDurboImportConfigurationProv' => #{
            path => "//system/console/configMgr/com.day.cq.replication.impl.content.durbo.DurboImportConfigurationProviderService",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqReplicationImplReplicationContentFactoryProviderImpl' => #{
            path => "//system/console/configMgr/com.day.cq.replication.impl.ReplicationContentFactoryProviderImpl",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqReplicationImplReplicationReceiverImpl' => #{
            path => "//system/console/configMgr/com.day.cq.replication.impl.ReplicationReceiverImpl",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqReplicationImplReplicatorImpl' => #{
            path => "//system/console/configMgr/com.day.cq.replication.impl.ReplicatorImpl",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqReplicationImplReverseReplicator' => #{
            path => "//system/console/configMgr/com.day.cq.replication.impl.ReverseReplicator",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqReplicationImplTransportBinaryLessTransportHandler' => #{
            path => "//system/console/configMgr/com.day.cq.replication.impl.transport.BinaryLessTransportHandler",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqReplicationImplTransportHttp' => #{
            path => "//system/console/configMgr/com.day.cq.replication.impl.transport.Http",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqReportingImplCacheCacheImpl' => #{
            path => "//system/console/configMgr/com.day.cq.reporting.impl.cache.CacheImpl",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqReportingImplConfigServiceImpl' => #{
            path => "//system/console/configMgr/com.day.cq.reporting.impl.ConfigServiceImpl",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqReportingImplRLogAnalyzer' => #{
            path => "//system/console/configMgr/com.day.cq.reporting.impl.RLogAnalyzer",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqRewriterLinkcheckerImplLinkCheckerImpl' => #{
            path => "//system/console/configMgr/com.day.cq.rewriter.linkchecker.impl.LinkCheckerImpl",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqRewriterLinkcheckerImplLinkCheckerTask' => #{
            path => "//system/console/configMgr/com.day.cq.rewriter.linkchecker.impl.LinkCheckerTask",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactory' => #{
            path => "//system/console/configMgr/com.day.cq.rewriter.linkchecker.impl.LinkCheckerTransformerFactory",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqRewriterLinkcheckerImplLinkInfoStorageImpl' => #{
            path => "//system/console/configMgr/com.day.cq.rewriter.linkchecker.impl.LinkInfoStorageImpl",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqRewriterProcessorImplHtmlParserFactory' => #{
            path => "//system/console/configMgr/com.day.cq.rewriter.processor.impl.HtmlParserFactory",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqSearchImplBuilderQueryBuilderImpl' => #{
            path => "//system/console/configMgr/com.day.cq.search.impl.builder.QueryBuilderImpl",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqSearchSuggestImplSuggestionIndexManagerImpl' => #{
            path => "//system/console/configMgr/com.day.cq.search.suggest.impl.SuggestionIndexManagerImpl",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandler' => #{
            path => "//system/console/configMgr/com.day.cq.searchpromote.impl.PublishSearchPromoteConfigHandler",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqSearchpromoteImplSearchPromoteServiceImpl' => #{
            path => "//system/console/configMgr/com.day.cq.searchpromote.impl.SearchPromoteServiceImpl",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqSecurityACLSetup' => #{
            path => "//system/console/configMgr/com.day.cq.security.ACLSetup",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqStatisticsImplStatisticsServiceImpl' => #{
            path => "//system/console/configMgr/com.day.cq.statistics.impl.StatisticsServiceImpl",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqTaggingImplJcrTagManagerFactoryImpl' => #{
            path => "//system/console/configMgr/com.day.cq.tagging.impl.JcrTagManagerFactoryImpl",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqTaggingImplSearchTagPredicateEvaluator' => #{
            path => "//system/console/configMgr/com.day.cq.tagging.impl.search.TagPredicateEvaluator",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqTaggingImplTagGarbageCollector' => #{
            path => "//system/console/configMgr/com.day.cq.tagging.impl.TagGarbageCollector",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqWcmContentsyncImplHandlerPagesUpdateHandler' => #{
            path => "//system/console/configMgr/com.day.cq.wcm.contentsync.impl.handler.PagesUpdateHandler",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactor' => #{
            path => "//system/console/configMgr/com.day.cq.wcm.contentsync.impl.rewriter.PathRewriterTransformerFactory",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqWcmCoreImplAuthoringUIModeServiceImpl' => #{
            path => "//system/console/configMgr/com.day.cq.wcm.core.impl.AuthoringUIModeServiceImpl",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqWcmCoreImplCommandsWCMCommandServlet' => #{
            path => "//system/console/configMgr/com.day.cq.wcm.core.impl.commands.WCMCommandServlet",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImpl' => #{
            path => "//system/console/configMgr/com.day.cq.wcm.core.impl.devicedetection.DeviceIdentificationModeImpl",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqWcmCoreImplEventPageEventAuditListener' => #{
            path => "//system/console/configMgr/com.day.cq.wcm.core.impl.event.PageEventAuditListener",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqWcmCoreImplEventPagePostProcessor' => #{
            path => "//system/console/configMgr/com.day.cq.wcm.core.impl.event.PagePostProcessor",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqWcmCoreImplEventRepositoryChangeEventListener' => #{
            path => "//system/console/configMgr/com.day.cq.wcm.core.impl.event.RepositoryChangeEventListener",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqWcmCoreImplEventTemplatePostProcessor' => #{
            path => "//system/console/configMgr/com.day.cq.wcm.core.impl.event.TemplatePostProcessor",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqWcmCoreImplLanguageManagerImpl' => #{
            path => "//system/console/configMgr/com.day.cq.wcm.core.impl.LanguageManagerImpl",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImpl' => #{
            path => "//system/console/configMgr/com.day.cq.wcm.core.impl.LinkCheckerConfigurationFactoryImpl",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqWcmCoreImplPagePageInfoAggregatorImpl' => #{
            path => "//system/console/configMgr/com.day.cq.wcm.core.impl.page.PageInfoAggregatorImpl",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqWcmCoreImplPagePageManagerFactoryImpl' => #{
            path => "//system/console/configMgr/com.day.cq.wcm.core.impl.page.PageManagerFactoryImpl",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqWcmCoreImplReferencesContentContentReferenceConfig' => #{
            path => "//system/console/configMgr/com.day.cq.wcm.core.impl.references.content.ContentReferenceConfig",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqWcmCoreImplServletsContentfinderAssetViewHandler' => #{
            path => "//system/console/configMgr/com.day.cq.wcm.core.impl.servlets.contentfinder.AssetViewHandler",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVie' => #{
            path => "//system/console/configMgr/com.day.cq.wcm.core.impl.servlets.contentfinder.connector.ConnectorViewHandler",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqWcmCoreImplServletsContentfinderPageViewHandler' => #{
            path => "//system/console/configMgr/com.day.cq.wcm.core.impl.servlets.contentfinder.PageViewHandler",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqWcmCoreImplServletsFindReplaceServlet' => #{
            path => "//system/console/configMgr/com.day.cq.wcm.core.impl.servlets.FindReplaceServlet",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqWcmCoreImplServletsReferenceSearchServlet' => #{
            path => "//system/console/configMgr/com.day.cq.wcm.core.impl.servlets.ReferenceSearchServlet",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqWcmCoreImplServletsThumbnailServlet' => #{
            path => "//system/console/configMgr/com.day.cq.wcm.core.impl.servlets.ThumbnailServlet",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqWcmCoreImplUtilsDefaultPageNameValidator' => #{
            path => "//system/console/configMgr/com.day.cq.wcm.core.impl.utils.DefaultPageNameValidator",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqWcmCoreImplVariantsPageVariantsProviderImpl' => #{
            path => "//system/console/configMgr/com.day.cq.wcm.core.impl.variants.PageVariantsProviderImpl",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqWcmCoreImplVersionManagerImpl' => #{
            path => "//system/console/configMgr/com.day.cq.wcm.core.impl.VersionManagerImpl",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqWcmCoreImplVersionPurgeTask' => #{
            path => "//system/console/configMgr/com.day.cq.wcm.core.impl.VersionPurgeTask",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqWcmCoreImplWCMDebugFilter' => #{
            path => "//system/console/configMgr/com.day.cq.wcm.core.impl.WCMDebugFilter",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqWcmCoreImplWCMDeveloperModeFilter' => #{
            path => "//system/console/configMgr/com.day.cq.wcm.core.impl.WCMDeveloperModeFilter",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqWcmCoreImplWarpTimeWarpFilter' => #{
            path => "//system/console/configMgr/com.day.cq.wcm.core.impl.warp.TimeWarpFilter",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqWcmCoreMvtMVTStatisticsImpl' => #{
            path => "//system/console/configMgr/com.day.cq.wcm.core.mvt.MVTStatisticsImpl",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqWcmCoreStatsPageViewStatisticsImpl' => #{
            path => "//system/console/configMgr/com.day.cq.wcm.core.stats.PageViewStatisticsImpl",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqWcmCoreWCMRequestFilter' => #{
            path => "//system/console/configMgr/com.day.cq.wcm.core.WCMRequestFilter",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqWcmDesignimporterDesignPackageImporter' => #{
            path => "//system/console/configMgr/com.day.cq.wcm.designimporter.DesignPackageImporter",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqWcmDesignimporterImplCanvasBuilderImpl' => #{
            path => "//system/console/configMgr/com.day.cq.wcm.designimporter.impl.CanvasBuilderImpl",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqWcmDesignimporterImplCanvasPageDeleteHandler' => #{
            path => "//system/console/configMgr/com.day.cq.wcm.designimporter.impl.CanvasPageDeleteHandler",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqWcmDesignimporterImplEntryPreprocessorImpl' => #{
            path => "//system/console/configMgr/com.day.cq.wcm.designimporter.impl.EntryPreprocessorImpl",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqWcmDesignimporterImplMobileCanvasBuilderImpl' => #{
            path => "//system/console/configMgr/com.day.cq.wcm.designimporter.impl.MobileCanvasBuilderImpl",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqWcmDesignimporterParserTaghandlersFactoryCanvasCompone' => #{
            path => "//system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.CanvasComponentTagHandlerFactory",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultCompon' => #{
            path => "//system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.DefaultComponentTagHandlerFactory",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultTagHan' => #{
            path => "//system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.DefaultTagHandlerFactory",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqWcmDesignimporterParserTaghandlersFactoryHeadTagHandle' => #{
            path => "//system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.HeadTagHandlerFactory",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqWcmDesignimporterParserTaghandlersFactoryIFrameTagHand' => #{
            path => "//system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.IFrameTagHandlerFactory",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqWcmDesignimporterParserTaghandlersFactoryImageComponen' => #{
            path => "//system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.ImageComponentTagHandlerFactory",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandler' => #{
            path => "//system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.ImgTagHandlerFactory",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqWcmDesignimporterParserTaghandlersFactoryInlineScriptT' => #{
            path => "//system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.InlineScriptTagHandlerFactory",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqWcmDesignimporterParserTaghandlersFactoryLinkTagHandle' => #{
            path => "//system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.LinkTagHandlerFactory",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqWcmDesignimporterParserTaghandlersFactoryMetaTagHandle' => #{
            path => "//system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.MetaTagHandlerFactory",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqWcmDesignimporterParserTaghandlersFactoryNonScriptTagH' => #{
            path => "//system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.NonScriptTagHandlerFactory",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqWcmDesignimporterParserTaghandlersFactoryParsysCompone' => #{
            path => "//system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.ParsysComponentTagHandlerFactory",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqWcmDesignimporterParserTaghandlersFactoryScriptTagHand' => #{
            path => "//system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.ScriptTagHandlerFactory",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqWcmDesignimporterParserTaghandlersFactoryStyleTagHandl' => #{
            path => "//system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.StyleTagHandlerFactory",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqWcmDesignimporterParserTaghandlersFactoryTextComponent' => #{
            path => "//system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.TextComponentTagHandlerFactory",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleComponen' => #{
            path => "//system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.TitleComponentTagHandlerFactory",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleTagHandl' => #{
            path => "//system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.TitleTagHandlerFactory",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqWcmFoundationFormsImplFormChooserServlet' => #{
            path => "//system/console/configMgr/com.day.cq.wcm.foundation.forms.impl.FormChooserServlet",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqWcmFoundationFormsImplFormParagraphPostProcessor' => #{
            path => "//system/console/configMgr/com.day.cq.wcm.foundation.forms.impl.FormParagraphPostProcessor",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqWcmFoundationFormsImplFormsHandlingServlet' => #{
            path => "//system/console/configMgr/com.day.cq.wcm.foundation.forms.impl.FormsHandlingServlet",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqWcmFoundationFormsImplMailServlet' => #{
            path => "//system/console/configMgr/com.day.cq.wcm.foundation.forms.impl.MailServlet",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqWcmFoundationImplAdaptiveImageComponentServlet' => #{
            path => "//system/console/configMgr/com.day.cq.wcm.foundation.impl.AdaptiveImageComponentServlet",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqWcmFoundationImplHTTPAuthHandler' => #{
            path => "//system/console/configMgr/com.day.cq.wcm.foundation.impl.HTTPAuthHandler",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqWcmFoundationImplPageImpressionsTracker' => #{
            path => "//system/console/configMgr/com.day.cq.wcm.foundation.impl.PageImpressionsTracker",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqWcmFoundationImplPageRedirectServlet' => #{
            path => "//system/console/configMgr/com.day.cq.wcm.foundation.impl.PageRedirectServlet",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklist' => #{
            path => "//system/console/configMgr/com.day.cq.wcm.foundation.security.impl.DefaultAttachmentTypeBlacklistService",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImpl' => #{
            path => "//system/console/configMgr/com.day.cq.wcm.foundation.security.impl.SaferSlingPostValidatorImpl",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactory' => #{
            path => "//system/console/configMgr/com.day.cq.wcm.mobile.core.impl.device.DeviceInfoTransformerFactory",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqWcmMobileCoreImplRedirectRedirectFilter' => #{
            path => "//system/console/configMgr/com.day.cq.wcm.mobile.core.impl.redirect.RedirectFilter",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqWcmMsmImplActionsContentCopyActionFactory' => #{
            path => "//system/console/configMgr/com.day.cq.wcm.msm.impl.actions.ContentCopyActionFactory",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqWcmMsmImplActionsContentDeleteActionFactory' => #{
            path => "//system/console/configMgr/com.day.cq.wcm.msm.impl.actions.ContentDeleteActionFactory",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqWcmMsmImplActionsContentUpdateActionFactory' => #{
            path => "//system/console/configMgr/com.day.cq.wcm.msm.impl.actions.ContentUpdateActionFactory",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqWcmMsmImplActionsOrderChildrenActionFactory' => #{
            path => "//system/console/configMgr/com.day.cq.wcm.msm.impl.actions.OrderChildrenActionFactory",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqWcmMsmImplActionsPageMoveActionFactory' => #{
            path => "//system/console/configMgr/com.day.cq.wcm.msm.impl.actions.PageMoveActionFactory",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqWcmMsmImplActionsReferencesUpdateActionFactory' => #{
            path => "//system/console/configMgr/com.day.cq.wcm.msm.impl.actions.ReferencesUpdateActionFactory",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqWcmMsmImplActionsVersionCopyActionFactory' => #{
            path => "//system/console/configMgr/com.day.cq.wcm.msm.impl.actions.VersionCopyActionFactory",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqWcmMsmImplLiveRelationshipManagerImpl' => #{
            path => "//system/console/configMgr/com.day.cq.wcm.msm.impl.LiveRelationshipManagerImpl",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqWcmMsmImplRolloutManagerImpl' => #{
            path => "//system/console/configMgr/com.day.cq.wcm.msm.impl.RolloutManagerImpl",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqWcmMsmImplServletsAuditLogServlet' => #{
            path => "//system/console/configMgr/com.day.cq.wcm.msm.impl.servlets.AuditLogServlet",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqWcmNotificationEmailImplEmailChannel' => #{
            path => "//system/console/configMgr/com.day.cq.wcm.notification.email.impl.EmailChannel",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqWcmNotificationImplNotificationManagerImpl' => #{
            path => "//system/console/configMgr/com.day.cq.wcm.notification.impl.NotificationManagerImpl",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqWcmScriptingImplBVPManager' => #{
            path => "//system/console/configMgr/com.day.cq.wcm.scripting.impl.BVPManager",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqWcmUndoUndoConfig' => #{
            path => "//system/console/configMgr/com.day.cq.wcm.undo.UndoConfig",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqWcmWebservicesupportImplReplicationEventListener' => #{
            path => "//system/console/configMgr/com.day.cq.wcm.webservicesupport.impl.ReplicationEventListener",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqWcmWorkflowImplWcmWorkflowServiceImpl' => #{
            path => "//system/console/configMgr/com.day.cq.wcm.workflow.impl.WcmWorkflowServiceImpl",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqWcmWorkflowImplWorkflowPackageInfoProvider' => #{
            path => "//system/console/configMgr/com.day.cq.wcm.workflow.impl.WorkflowPackageInfoProvider",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqWidgetImplHtmlLibraryManagerImpl' => #{
            path => "//system/console/configMgr/com.day.cq.widget.impl.HtmlLibraryManagerImpl",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqWidgetImplWidgetExtensionProviderImpl' => #{
            path => "//system/console/configMgr/com.day.cq.widget.impl.WidgetExtensionProviderImpl",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqWorkflowImplEmailEMailNotificationService' => #{
            path => "//system/console/configMgr/com.day.cq.workflow.impl.email.EMailNotificationService",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCqWorkflowImplEmailTaskEMailNotificationService' => #{
            path => "//system/console/configMgr/com.day.cq.workflow.impl.email.TaskEMailNotificationService",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCrxSecurityTokenImplImplTokenAuthenticationHandler' => #{
            path => "//system/console/configMgr/com.day.crx.security.token.impl.impl.TokenAuthenticationHandler",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'ComDayCrxSecurityTokenImplTokenCleanupTask' => #{
            path => "//system/console/configMgr/com.day.crx.security.token.impl.TokenCleanupTask",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'GuideLocalizationService' => #{
            path => "//system/console/configMgr/Guide Localization Service",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'MessagingUserComponentFactory' => #{
            path => "//system/console/configMgr/MessagingUserComponentFactory",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'OrgApacheAriesJmxFrameworkStateConfig' => #{
            path => "//system/console/configMgr/org.apache.aries.jmx.framework.StateConfig",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'OrgApacheFelixEventadminImplEventAdmin' => #{
            path => "//system/console/configMgr/org.apache.felix.eventadmin.impl.EventAdmin",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'OrgApacheFelixHttp' => #{
            path => "//system/console/configMgr/org.apache.felix.http",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'OrgApacheFelixHttpSslfilterSslFilter' => #{
            path => "//system/console/configMgr/org.apache.felix.http.sslfilter.SslFilter",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'OrgApacheFelixJaasConfigurationFactory' => #{
            path => "//system/console/configMgr/org.apache.felix.jaas.Configuration.factory",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'OrgApacheFelixJaasConfigurationSpi' => #{
            path => "//system/console/configMgr/org.apache.felix.jaas.ConfigurationSpi",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'OrgApacheFelixScrScrService' => #{
            path => "//system/console/configMgr/org.apache.felix.scr.ScrService",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'OrgApacheFelixSystemreadyImplComponentsCheck' => #{
            path => "//system/console/configMgr/org.apache.felix.systemready.impl.ComponentsCheck",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'OrgApacheFelixSystemreadyImplFrameworkStartCheck' => #{
            path => "//system/console/configMgr/org.apache.felix.systemready.impl.FrameworkStartCheck",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'OrgApacheFelixSystemreadyImplServicesCheck' => #{
            path => "//system/console/configMgr/org.apache.felix.systemready.impl.ServicesCheck",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'OrgApacheFelixSystemreadyImplServletSystemAliveServlet' => #{
            path => "//system/console/configMgr/org.apache.felix.systemready.impl.servlet.SystemAliveServlet",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'OrgApacheFelixSystemreadyImplServletSystemReadyServlet' => #{
            path => "//system/console/configMgr/org.apache.felix.systemready.impl.servlet.SystemReadyServlet",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'OrgApacheFelixSystemreadySystemReadyMonitor' => #{
            path => "//system/console/configMgr/org.apache.felix.systemready.SystemReadyMonitor",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'OrgApacheFelixWebconsoleInternalServletOsgiManager' => #{
            path => "//system/console/configMgr/org.apache.felix.webconsole.internal.servlet.OsgiManager",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'OrgApacheFelixWebconsolePluginsEventInternalPluginServlet' => #{
            path => "//system/console/configMgr/org.apache.felix.webconsole.plugins.event.internal.PluginServlet",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCo' => #{
            path => "//system/console/configMgr/org.apache.felix.webconsole.plugins.memoryusage.internal.MemoryUsageConfigurator",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'OrgApacheHttpProxyconfigurator' => #{
            path => "//system/console/configMgr/org.apache.http.proxyconfigurator",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProvider' => #{
            path => "//system/console/configMgr/org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreTextProviderService",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStore' => #{
            path => "//system/console/configMgr/org.apache.jackrabbit.oak.plugins.blob.datastore.FileDataStore",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreService' => #{
            path => "//system/console/configMgr/org.apache.jackrabbit.oak.plugins.document.DocumentNodeStoreService",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePre' => #{
            path => "//system/console/configMgr/org.apache.jackrabbit.oak.plugins.document.DocumentNodeStoreServicePreset",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCac' => #{
            path => "//system/console/configMgr/org.apache.jackrabbit.oak.plugins.document.secondary.SecondaryStoreCacheService",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'OrgApacheJackrabbitOakPluginsIndexAsyncIndexerService' => #{
            path => "//system/console/configMgr/org.apache.jackrabbit.oak.plugins.index.AsyncIndexerService",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServ' => #{
            path => "//system/console/configMgr/org.apache.jackrabbit.oak.plugins.index.lucene.LuceneIndexProviderService",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCo' => #{
            path => "//system/console/configMgr/org.apache.jackrabbit.oak.plugins.index.solr.osgi.EmbeddedSolrServerConfigurationProvider",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServers' => #{
            path => "//system/console/configMgr/org.apache.jackrabbit.oak.plugins.index.solr.osgi.NodeStateSolrServersObserverService",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfiguration' => #{
            path => "//system/console/configMgr/org.apache.jackrabbit.oak.plugins.index.solr.osgi.OakSolrConfigurationProviderService",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConf' => #{
            path => "//system/console/configMgr/org.apache.jackrabbit.oak.plugins.index.solr.osgi.RemoteSolrServerConfigurationProvider",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvid' => #{
            path => "//system/console/configMgr/org.apache.jackrabbit.oak.plugins.index.solr.osgi.SolrQueryIndexProviderService",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSe' => #{
            path => "//system/console/configMgr/org.apache.jackrabbit.oak.plugins.index.solr.osgi.SolrServerProviderService",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactory' => #{
            path => "//system/console/configMgr/org.apache.jackrabbit.oak.plugins.metric.StatisticsProviderFactory",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'OrgApacheJackrabbitOakPluginsObservationChangeCollectorProvider' => #{
            path => "//system/console/configMgr/org.apache.jackrabbit.oak.plugins.observation.ChangeCollectorProvider",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'OrgApacheJackrabbitOakQueryQueryEngineSettingsService' => #{
            path => "//system/console/configMgr/org.apache.jackrabbit.oak.query.QueryEngineSettingsService",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfig' => #{
            path => "//system/console/configMgr/org.apache.jackrabbit.oak.security.authentication.AuthenticationConfigurationImpl",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdenti' => #{
            path => "//system/console/configMgr/org.apache.jackrabbit.oak.security.authentication.ldap.impl.LdapIdentityProvider",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfigura' => #{
            path => "//system/console/configMgr/org.apache.jackrabbit.oak.security.authentication.token.TokenConfigurationImpl",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigur' => #{
            path => "//system/console/configMgr/org.apache.jackrabbit.oak.security.authorization.AuthorizationConfigurationImpl",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistrati' => #{
            path => "//system/console/configMgr/org.apache.jackrabbit.oak.security.internal.SecurityProviderRegistration",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeName' => #{
            path => "//system/console/configMgr/org.apache.jackrabbit.oak.security.user.RandomAuthorizableNodeName",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'OrgApacheJackrabbitOakSecurityUserUserConfigurationImpl' => #{
            path => "//system/console/configMgr/org.apache.jackrabbit.oak.security.user.UserConfigurationImpl",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreService' => #{
            path => "//system/console/configMgr/org.apache.jackrabbit.oak.segment.azure.AzureSegmentStoreService",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactory' => #{
            path => "//system/console/configMgr/org.apache.jackrabbit.oak.segment.SegmentNodeStoreFactory",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorService' => #{
            path => "//system/console/configMgr/org.apache.jackrabbit.oak.segment.SegmentNodeStoreMonitorService",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'OrgApacheJackrabbitOakSegmentSegmentNodeStoreService' => #{
            path => "//system/console/configMgr/org.apache.jackrabbit.oak.segment.SegmentNodeStoreService",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreService' => #{
            path => "//system/console/configMgr/org.apache.jackrabbit.oak.segment.standby.store.StandbyStoreService",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDe' => #{
            path => "//system/console/configMgr/org.apache.jackrabbit.oak.spi.security.authentication.external.impl.DefaultSyncHandler",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplEx' => #{
            path => "//system/console/configMgr/org.apache.jackrabbit.oak.spi.security.authentication.external.impl.ExternalLoginModuleFactory",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPr' => #{
            path => "//system/console/configMgr/org.apache.jackrabbit.oak.spi.security.authentication.external.impl.principal.ExternalPrincipalConfiguration",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfi' => #{
            path => "//system/console/configMgr/org.apache.jackrabbit.oak.spi.security.authorization.cug.impl.CugConfiguration",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExclu' => #{
            path => "//system/console/configMgr/org.apache.jackrabbit.oak.spi.security.authorization.cug.impl.CugExcludeImpl",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizable' => #{
            path => "//system/console/configMgr/org.apache.jackrabbit.oak.spi.security.user.action.DefaultAuthorizableActionProvider",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'OrgApacheJackrabbitVaultPackagingImplPackagingImpl' => #{
            path => "//system/console/configMgr/org.apache.jackrabbit.vault.packaging.impl.PackagingImpl",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistry' => #{
            path => "//system/console/configMgr/org.apache.jackrabbit.vault.packaging.registry.impl.FSPackageRegistry",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'OrgApacheSlingAuthCoreImplLogoutServlet' => #{
            path => "//system/console/configMgr/org.apache.sling.auth.core.impl.LogoutServlet",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'OrgApacheSlingCaconfigImplConfigurationBindingsValueProvider' => #{
            path => "//system/console/configMgr/org.apache.sling.caconfig.impl.ConfigurationBindingsValueProvider",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'OrgApacheSlingCaconfigImplConfigurationResolverImpl' => #{
            path => "//system/console/configMgr/org.apache.sling.caconfig.impl.ConfigurationResolverImpl",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStra' => #{
            path => "//system/console/configMgr/org.apache.sling.caconfig.impl.def.DefaultConfigurationInheritanceStrategy",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStra' => #{
            path => "//system/console/configMgr/org.apache.sling.caconfig.impl.def.DefaultConfigurationPersistenceStrategy",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProvi' => #{
            path => "//system/console/configMgr/org.apache.sling.caconfig.impl.override.OsgiConfigurationOverrideProvider",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOve' => #{
            path => "//system/console/configMgr/org.apache.sling.caconfig.impl.override.SystemPropertyConfigurationOverrideProvider",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'OrgApacheSlingCaconfigManagementImplConfigurationManagementSetti' => #{
            path => "//system/console/configMgr/org.apache.sling.caconfig.management.impl.ConfigurationManagementSettingsImpl",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResour' => #{
            path => "//system/console/configMgr/org.apache.sling.caconfig.resource.impl.def.DefaultConfigurationResourceResolvingStrategy",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategy' => #{
            path => "//system/console/configMgr/org.apache.sling.caconfig.resource.impl.def.DefaultContextPathStrategy",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParser' => #{
            path => "//system/console/configMgr/org.apache.sling.commons.html.internal.TagsoupHtmlParser",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'OrgApacheSlingCommonsLogLogManager' => #{
            path => "//system/console/configMgr/org.apache.sling.commons.log.LogManager",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'OrgApacheSlingCommonsLogLogManagerFactoryConfig' => #{
            path => "//system/console/configMgr/org.apache.sling.commons.log.LogManager.factory.config",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'OrgApacheSlingCommonsLogLogManagerFactoryWriter' => #{
            path => "//system/console/configMgr/org.apache.sling.commons.log.LogManager.factory.writer",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'OrgApacheSlingCommonsMetricsInternalLogReporter' => #{
            path => "//system/console/configMgr/org.apache.sling.commons.metrics.internal.LogReporter",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporter' => #{
            path => "//system/console/configMgr/org.apache.sling.commons.metrics.rrd4j.impl.CodahaleMetricsReporter",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'OrgApacheSlingCommonsMimeInternalMimeTypeServiceImpl' => #{
            path => "//system/console/configMgr/org.apache.sling.commons.mime.internal.MimeTypeServiceImpl",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'OrgApacheSlingCommonsSchedulerImplQuartzScheduler' => #{
            path => "//system/console/configMgr/org.apache.sling.commons.scheduler.impl.QuartzScheduler",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheck' => #{
            path => "//system/console/configMgr/org.apache.sling.commons.scheduler.impl.SchedulerHealthCheck",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactory' => #{
            path => "//system/console/configMgr/org.apache.sling.commons.threads.impl.DefaultThreadPool.factory",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'OrgApacheSlingDatasourceDataSourceFactory' => #{
            path => "//system/console/configMgr/org.apache.sling.datasource.DataSourceFactory",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'OrgApacheSlingDatasourceJNDIDataSourceFactory' => #{
            path => "//system/console/configMgr/org.apache.sling.datasource.JNDIDataSourceFactory",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'OrgApacheSlingDiscoveryOakConfig' => #{
            path => "//system/console/configMgr/org.apache.sling.discovery.oak.Config",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheck' => #{
            path => "//system/console/configMgr/org.apache.sling.discovery.oak.SynchronizedClocksHealthCheck",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'OrgApacheSlingDistributionAgentImplForwardDistributionAgentFacto' => #{
            path => "//system/console/configMgr/org.apache.sling.distribution.agent.impl.ForwardDistributionAgentFactory",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestA' => #{
            path => "//system/console/configMgr/org.apache.sling.distribution.agent.impl.PrivilegeDistributionRequestAuthorizationStrategyFactory",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactory' => #{
            path => "//system/console/configMgr/org.apache.sling.distribution.agent.impl.QueueDistributionAgentFactory",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'OrgApacheSlingDistributionAgentImplReverseDistributionAgentFacto' => #{
            path => "//system/console/configMgr/org.apache.sling.distribution.agent.impl.ReverseDistributionAgentFactory",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactor' => #{
            path => "//system/console/configMgr/org.apache.sling.distribution.agent.impl.SimpleDistributionAgentFactory",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactory' => #{
            path => "//system/console/configMgr/org.apache.sling.distribution.agent.impl.SyncDistributionAgentFactory",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'OrgApacheSlingDistributionMonitorDistributionQueueHealthCheck' => #{
            path => "//system/console/configMgr/org.apache.sling.distribution.monitor.DistributionQueueHealthCheck",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'OrgApacheSlingDistributionPackagingImplExporterAgentDistributio' => #{
            path => "//system/console/configMgr/org.apache.sling.distribution.packaging.impl.exporter.AgentDistributionPackageExporterFactory",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'OrgApacheSlingDistributionPackagingImplExporterLocalDistributio' => #{
            path => "//system/console/configMgr/org.apache.sling.distribution.packaging.impl.exporter.LocalDistributionPackageExporterFactory",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'OrgApacheSlingDistributionPackagingImplExporterRemoteDistributi' => #{
            path => "//system/console/configMgr/org.apache.sling.distribution.packaging.impl.exporter.RemoteDistributionPackageExporterFactory",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'OrgApacheSlingDistributionPackagingImplImporterLocalDistributio' => #{
            path => "//system/console/configMgr/org.apache.sling.distribution.packaging.impl.importer.LocalDistributionPackageImporterFactory",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'OrgApacheSlingDistributionPackagingImplImporterRemoteDistributi' => #{
            path => "//system/console/configMgr/org.apache.sling.distribution.packaging.impl.importer.RemoteDistributionPackageImporterFactory",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'OrgApacheSlingDistributionPackagingImplImporterRepositoryDistri' => #{
            path => "//system/console/configMgr/org.apache.sling.distribution.packaging.impl.importer.RepositoryDistributionPackageImporterFactory",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'OrgApacheSlingDistributionResourcesImplDistributionConfiguration' => #{
            path => "//system/console/configMgr/org.apache.sling.distribution.resources.impl.DistributionConfigurationResourceProviderFactory",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'OrgApacheSlingDistributionResourcesImplDistributionServiceResour' => #{
            path => "//system/console/configMgr/org.apache.sling.distribution.resources.impl.DistributionServiceResourceProviderFactory",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'OrgApacheSlingDistributionSerializationImplDistributionPackageBu' => #{
            path => "//system/console/configMgr/org.apache.sling.distribution.serialization.impl.DistributionPackageBuilderFactory",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'OrgApacheSlingDistributionSerializationImplVltVaultDistribution' => #{
            path => "//system/console/configMgr/org.apache.sling.distribution.serialization.impl.vlt.VaultDistributionPackageBuilderFactory",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'OrgApacheSlingDistributionTransportImplUserCredentialsDistributi' => #{
            path => "//system/console/configMgr/org.apache.sling.distribution.transport.impl.UserCredentialsDistributionTransportSecretProvider",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'OrgApacheSlingDistributionTriggerImplDistributionEventDistribute' => #{
            path => "//system/console/configMgr/org.apache.sling.distribution.trigger.impl.DistributionEventDistributeDistributionTriggerFactory",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'OrgApacheSlingDistributionTriggerImplJcrEventDistributionTrigger' => #{
            path => "//system/console/configMgr/org.apache.sling.distribution.trigger.impl.JcrEventDistributionTriggerFactory",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributi' => #{
            path => "//system/console/configMgr/org.apache.sling.distribution.trigger.impl.PersistedJcrEventDistributionTriggerFactory",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrig' => #{
            path => "//system/console/configMgr/org.apache.sling.distribution.trigger.impl.RemoteEventDistributionTriggerFactory",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'OrgApacheSlingDistributionTriggerImplResourceEventDistributionTr' => #{
            path => "//system/console/configMgr/org.apache.sling.distribution.trigger.impl.ResourceEventDistributionTriggerFactory",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'OrgApacheSlingDistributionTriggerImplScheduledDistributionTrigge' => #{
            path => "//system/console/configMgr/org.apache.sling.distribution.trigger.impl.ScheduledDistributionTriggerFactory",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'OrgApacheSlingEngineImplAuthSlingAuthenticator' => #{
            path => "//system/console/configMgr/org.apache.sling.engine.impl.auth.SlingAuthenticator",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilter' => #{
            path => "//system/console/configMgr/org.apache.sling.engine.impl.debug.RequestProgressTrackerLogFilter",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'OrgApacheSlingEngineImplLogRequestLogger' => #{
            path => "//system/console/configMgr/org.apache.sling.engine.impl.log.RequestLogger",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'OrgApacheSlingEngineImplLogRequestLoggerService' => #{
            path => "//system/console/configMgr/org.apache.sling.engine.impl.log.RequestLoggerService",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'OrgApacheSlingEngineImplSlingMainServlet' => #{
            path => "//system/console/configMgr/org.apache.sling.engine.impl.SlingMainServlet",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'OrgApacheSlingEngineParameters' => #{
            path => "//system/console/configMgr/org.apache.sling.engine.parameters",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'OrgApacheSlingEventImplEventingThreadPool' => #{
            path => "//system/console/configMgr/org.apache.sling.event.impl.EventingThreadPool",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'OrgApacheSlingEventImplJobsDefaultJobManager' => #{
            path => "//system/console/configMgr/org.apache.sling.event.impl.jobs.DefaultJobManager",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'OrgApacheSlingEventImplJobsJcrPersistenceHandler' => #{
            path => "//system/console/configMgr/org.apache.sling.event.impl.jobs.jcr.PersistenceHandler",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'OrgApacheSlingEventImplJobsJobConsumerManager' => #{
            path => "//system/console/configMgr/org.apache.sling.event.impl.jobs.JobConsumerManager",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'OrgApacheSlingEventJobsQueueConfiguration' => #{
            path => "//system/console/configMgr/org.apache.sling.event.jobs.QueueConfiguration",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingW' => #{
            path => "//system/console/configMgr/org.apache.sling.extensions.webconsolesecurityprovider.internal.SlingWebConsoleSecurityProvider",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'OrgApacheSlingFeatureflagsFeature' => #{
            path => "//system/console/configMgr/org.apache.sling.featureflags.Feature",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'OrgApacheSlingFeatureflagsImplConfiguredFeature' => #{
            path => "//system/console/configMgr/org.apache.sling.featureflags.impl.ConfiguredFeature",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'OrgApacheSlingHapiImplHApiUtilImpl' => #{
            path => "//system/console/configMgr/org.apache.sling.hapi.impl.HApiUtilImpl",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'OrgApacheSlingHcCoreImplCompositeHealthCheck' => #{
            path => "//system/console/configMgr/org.apache.sling.hc.core.impl.CompositeHealthCheck",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImpl' => #{
            path => "//system/console/configMgr/org.apache.sling.hc.core.impl.executor.HealthCheckExecutorImpl",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'OrgApacheSlingHcCoreImplJmxAttributeHealthCheck' => #{
            path => "//system/console/configMgr/org.apache.sling.hc.core.impl.JmxAttributeHealthCheck",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'OrgApacheSlingHcCoreImplScriptableHealthCheck' => #{
            path => "//system/console/configMgr/org.apache.sling.hc.core.impl.ScriptableHealthCheck",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'OrgApacheSlingHcCoreImplServletHealthCheckExecutorServlet' => #{
            path => "//system/console/configMgr/org.apache.sling.hc.core.impl.servlet.HealthCheckExecutorServlet",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializer' => #{
            path => "//system/console/configMgr/org.apache.sling.hc.core.impl.servlet.ResultTxtVerboseSerializer",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'OrgApacheSlingI18nImplI18NFilter' => #{
            path => "//system/console/configMgr/org.apache.sling.i18n.impl.I18NFilter",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'OrgApacheSlingI18nImplJcrResourceBundleProvider' => #{
            path => "//system/console/configMgr/org.apache.sling.i18n.impl.JcrResourceBundleProvider",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'OrgApacheSlingInstallerProviderJcrImplJcrInstaller' => #{
            path => "//system/console/configMgr/org.apache.sling.installer.provider.jcr.impl.JcrInstaller",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'OrgApacheSlingJcrBaseInternalLoginAdminWhitelist' => #{
            path => "//system/console/configMgr/org.apache.sling.jcr.base.internal.LoginAdminWhitelist",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragment' => #{
            path => "//system/console/configMgr/org.apache.sling.jcr.base.internal.LoginAdminWhitelist.fragment",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'OrgApacheSlingJcrDavexImplServletsSlingDavExServlet' => #{
            path => "//system/console/configMgr/org.apache.sling.jcr.davex.impl.servlets.SlingDavExServlet",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupport' => #{
            path => "//system/console/configMgr/org.apache.sling.jcr.jackrabbit.server.JndiRegistrationSupport",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupport' => #{
            path => "//system/console/configMgr/org.apache.sling.jcr.jackrabbit.server.RmiRegistrationSupport",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'OrgApacheSlingJcrRepoinitImplRepositoryInitializer' => #{
            path => "//system/console/configMgr/org.apache.sling.jcr.repoinit.impl.RepositoryInitializer",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'OrgApacheSlingJcrRepoinitRepositoryInitializer' => #{
            path => "//system/console/configMgr/org.apache.sling.jcr.repoinit.RepositoryInitializer",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImpl' => #{
            path => "//system/console/configMgr/org.apache.sling.jcr.resource.internal.JcrResourceResolverFactoryImpl",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'OrgApacheSlingJcrResourceInternalJcrSystemUserValidator' => #{
            path => "//system/console/configMgr/org.apache.sling.jcr.resource.internal.JcrSystemUserValidator",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactory' => #{
            path => "//system/console/configMgr/org.apache.sling.jcr.resourcesecurity.impl.ResourceAccessGateFactory",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerService' => #{
            path => "//system/console/configMgr/org.apache.sling.jcr.webdav.impl.handler.DefaultHandlerService",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServic' => #{
            path => "//system/console/configMgr/org.apache.sling.jcr.webdav.impl.handler.DirListingExportHandlerService",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServlet' => #{
            path => "//system/console/configMgr/org.apache.sling.jcr.webdav.impl.servlets.SimpleWebDavServlet",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'OrgApacheSlingJmxProviderImplJMXResourceProvider' => #{
            path => "//system/console/configMgr/org.apache.sling.jmx.provider.impl.JMXResourceProvider",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'OrgApacheSlingModelsImplModelAdapterFactory' => #{
            path => "//system/console/configMgr/org.apache.sling.models.impl.ModelAdapterFactory",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'OrgApacheSlingModelsJacksonexporterImplResourceModuleProvider' => #{
            path => "//system/console/configMgr/org.apache.sling.models.jacksonexporter.impl.ResourceModuleProvider",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFacto' => #{
            path => "//system/console/configMgr/org.apache.sling.resource.inventory.impl.ResourceInventoryPrinterFactory",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'OrgApacheSlingResourcemergerImplMergedResourceProviderFactory' => #{
            path => "//system/console/configMgr/org.apache.sling.resourcemerger.impl.MergedResourceProviderFactory",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'OrgApacheSlingResourcemergerPickerOverriding' => #{
            path => "//system/console/configMgr/org.apache.sling.resourcemerger.picker.overriding",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'OrgApacheSlingScriptingCoreImplScriptCacheImpl' => #{
            path => "//system/console/configMgr/org.apache.sling.scripting.core.impl.ScriptCacheImpl",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'OrgApacheSlingScriptingCoreImplScriptingResourceResolverProvider' => #{
            path => "//system/console/configMgr/org.apache.sling.scripting.core.impl.ScriptingResourceResolverProviderImpl",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'OrgApacheSlingScriptingJavaImplJavaScriptEngineFactory' => #{
            path => "//system/console/configMgr/org.apache.sling.scripting.java.impl.JavaScriptEngineFactory",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFa' => #{
            path => "//system/console/configMgr/org.apache.sling.scripting.javascript.internal.RhinoJavaScriptEngineFactory",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'OrgApacheSlingScriptingJspJspScriptEngineFactory' => #{
            path => "//system/console/configMgr/org.apache.sling.scripting.jsp.JspScriptEngineFactory",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProv' => #{
            path => "//system/console/configMgr/org.apache.sling.scripting.sightly.js.impl.jsapi.SlyBindingsValuesProvider",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'OrgApacheSlingSecurityImplContentDispositionFilter' => #{
            path => "//system/console/configMgr/org.apache.sling.security.impl.ContentDispositionFilter",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'OrgApacheSlingSecurityImplReferrerFilter' => #{
            path => "//system/console/configMgr/org.apache.sling.security.impl.ReferrerFilter",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'OrgApacheSlingServiceusermappingImplServiceUserMapperImpl' => #{
            path => "//system/console/configMgr/org.apache.sling.serviceusermapping.impl.ServiceUserMapperImpl",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmended' => #{
            path => "//system/console/configMgr/org.apache.sling.serviceusermapping.impl.ServiceUserMapperImpl.amended",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'OrgApacheSlingServletsGetDefaultGetServlet' => #{
            path => "//system/console/configMgr/org.apache.sling.servlets.get.DefaultGetServlet",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'OrgApacheSlingServletsGetImplVersionVersionInfoServlet' => #{
            path => "//system/console/configMgr/org.apache.sling.servlets.get.impl.version.VersionInfoServlet",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'OrgApacheSlingServletsPostImplHelperChunkCleanUpTask' => #{
            path => "//system/console/configMgr/org.apache.sling.servlets.post.impl.helper.ChunkCleanUpTask",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'OrgApacheSlingServletsPostImplSlingPostServlet' => #{
            path => "//system/console/configMgr/org.apache.sling.servlets.post.impl.SlingPostServlet",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'OrgApacheSlingServletsResolverSlingServletResolver' => #{
            path => "//system/console/configMgr/org.apache.sling.servlets.resolver.SlingServletResolver",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'OrgApacheSlingSettingsImplSlingSettingsServiceImpl' => #{
            path => "//system/console/configMgr/org.apache.sling.settings.impl.SlingSettingsServiceImpl",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'OrgApacheSlingStartupfilterImplStartupFilterImpl' => #{
            path => "//system/console/configMgr/org.apache.sling.startupfilter.impl.StartupFilterImpl",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'OrgApacheSlingTenantInternalTenantProviderImpl' => #{
            path => "//system/console/configMgr/org.apache.sling.tenant.internal.TenantProviderImpl",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'OrgApacheSlingTracerInternalLogTracer' => #{
            path => "//system/console/configMgr/org.apache.sling.tracer.internal.LogTracer",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        },
        'OrgApacheSlingXssImplXSSFilterImpl' => #{
            path => "//system/console/configMgr/org.apache.sling.xss.impl.XSSFilterImpl",
            method => <<"POST">>,
            handler => 'openapi_configmgr_handler'
        }
    }.

prepare_validator() ->
    R = jsx:decode(element(2, file:read_file(get_openapi_path()))),
    jesse_state:new(R, [{default_schema_ver, <<"http://json-schema.org/draft-04/schema#">>}]).


get_openapi_path() ->
    {ok, AppName} = application:get_application(?MODULE),
    filename:join(openapi_utils:priv_dir(AppName), "openapi.json").


