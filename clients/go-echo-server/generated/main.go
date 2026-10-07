package main

import (
	"github.com/shinesolutions/swagger-aem-osgi/handlers"
	"github.com/labstack/echo/v4"
	"github.com/labstack/echo/v4/middleware"
)

func main() {
	e := echo.New()

	//todo: handle the error!
	c, _ := handlers.NewContainer()

	// Middleware
	e.Use(middleware.Logger())
	e.Use(middleware.Recover())


	// AdaptiveFormAndInteractiveCommunicationWebChannelConfiguration - 
	e.POST("/system/console/configMgr/Adaptive Form and Interactive Communication Web Channel Configuration", c.AdaptiveFormAndInteractiveCommunicationWebChannelConfiguration)

	// AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigur - 
	e.POST("/system/console/configMgr/Adaptive Form and Interactive Communication Web Channel Theme Configuration", c.AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigur)

	// AnalyticsComponentQueryCacheService - 
	e.POST("/system/console/configMgr/Analytics Component Query Cache Service", c.AnalyticsComponentQueryCacheService)

	// ApacheSlingHealthCheckResultHTMLSerializer - 
	e.POST("/system/console/configMgr/Apache Sling Health Check Result HTML Serializer", c.ApacheSlingHealthCheckResultHTMLSerializer)

	// ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfiguration - 
	e.POST("/system/console/configMgr/com.adobe.aem.formsndocuments.config.AEMFormsManagerConfiguration", c.ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfiguration)

	// ComAdobeAemTransactionCoreImplTransactionRecorder - 
	e.POST("/system/console/configMgr/com.adobe.aem.transaction.core.impl.TransactionRecorder", c.ComAdobeAemTransactionCoreImplTransactionRecorder)

	// ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHC - 
	e.POST("/system/console/configMgr/com.adobe.aem.upgrade.prechecks.hc.impl.DeprecateIndexesHC", c.ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHC)

	// ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHC - 
	e.POST("/system/console/configMgr/com.adobe.aem.upgrade.prechecks.hc.impl.ReplicationAgentsDisabledHC", c.ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHC)

	// ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImpl - 
	e.POST("/system/console/configMgr/com.adobe.aem.upgrade.prechecks.mbean.impl.PreUpgradeTasksMBeanImpl", c.ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImpl)

	// ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImpl - 
	e.POST("/system/console/configMgr/com.adobe.aem.upgrade.prechecks.tasks.impl.ConsistencyCheckTaskImpl", c.ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImpl)

	// ComAdobeCqAccountApiAccountManagementService - 
	e.POST("/system/console/configMgr/com.adobe.cq.account.api.AccountManagementService", c.ComAdobeCqAccountApiAccountManagementService)

	// ComAdobeCqAccountImplAccountManagementServlet - 
	e.POST("/system/console/configMgr/com.adobe.cq.account.impl.AccountManagementServlet", c.ComAdobeCqAccountImplAccountManagementServlet)

	// ComAdobeCqAddressImplLocationLocationListServlet - 
	e.POST("/system/console/configMgr/com.adobe.cq.address.impl.location.LocationListServlet", c.ComAdobeCqAddressImplLocationLocationListServlet)

	// ComAdobeCqAuditPurgeDam - 
	e.POST("/system/console/configMgr/com.adobe.cq.audit.purge.Dam", c.ComAdobeCqAuditPurgeDam)

	// ComAdobeCqAuditPurgePages - 
	e.POST("/system/console/configMgr/com.adobe.cq.audit.purge.Pages", c.ComAdobeCqAuditPurgePages)

	// ComAdobeCqAuditPurgeReplication - 
	e.POST("/system/console/configMgr/com.adobe.cq.audit.purge.Replication", c.ComAdobeCqAuditPurgeReplication)

	// ComAdobeCqCdnRewriterImplAWSCloudFrontRewriter - 
	e.POST("/system/console/configMgr/com.adobe.cq.cdn.rewriter.impl.AWSCloudFrontRewriter", c.ComAdobeCqCdnRewriterImplAWSCloudFrontRewriter)

	// ComAdobeCqCdnRewriterImplCDNConfigServiceImpl - 
	e.POST("/system/console/configMgr/com.adobe.cq.cdn.rewriter.impl.CDNConfigServiceImpl", c.ComAdobeCqCdnRewriterImplCDNConfigServiceImpl)

	// ComAdobeCqCdnRewriterImplCDNRewriter - 
	e.POST("/system/console/configMgr/com.adobe.cq.cdn.rewriter.impl.CDNRewriter", c.ComAdobeCqCdnRewriterImplCDNRewriter)

	// ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandle - 
	e.POST("/system/console/configMgr/com.adobe.cq.cloudconfig.core.impl.ConfigurationReplicationEventHandler", c.ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandle)

	// ComAdobeCqCommerceImplAssetDynamicImageHandler - 
	e.POST("/system/console/configMgr/com.adobe.cq.commerce.impl.asset.DynamicImageHandler", c.ComAdobeCqCommerceImplAssetDynamicImageHandler)

	// ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImpl - 
	e.POST("/system/console/configMgr/com.adobe.cq.commerce.impl.asset.ProductAssetHandlerProviderImpl", c.ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImpl)

	// ComAdobeCqCommerceImplAssetStaticImageHandler - 
	e.POST("/system/console/configMgr/com.adobe.cq.commerce.impl.asset.StaticImageHandler", c.ComAdobeCqCommerceImplAssetStaticImageHandler)

	// ComAdobeCqCommerceImplAssetVideoHandler - 
	e.POST("/system/console/configMgr/com.adobe.cq.commerce.impl.asset.VideoHandler", c.ComAdobeCqCommerceImplAssetVideoHandler)

	// ComAdobeCqCommerceImplPromotionPromotionManagerImpl - 
	e.POST("/system/console/configMgr/com.adobe.cq.commerce.impl.promotion.PromotionManagerImpl", c.ComAdobeCqCommerceImplPromotionPromotionManagerImpl)

	// ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImpl - 
	e.POST("/system/console/configMgr/com.adobe.cq.commerce.pim.impl.cataloggenerator.CatalogGeneratorImpl", c.ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImpl)

	// ComAdobeCqCommercePimImplPageEventListener - 
	e.POST("/system/console/configMgr/com.adobe.cq.commerce.pim.impl.PageEventListener", c.ComAdobeCqCommercePimImplPageEventListener)

	// ComAdobeCqCommercePimImplProductfeedProductFeedServiceImpl - 
	e.POST("/system/console/configMgr/com.adobe.cq.commerce.pim.impl.productfeed.ProductFeedServiceImpl", c.ComAdobeCqCommercePimImplProductfeedProductFeedServiceImpl)

	// ComAdobeCqContentinsightImplReportingServicesSettingsProvider - 
	e.POST("/system/console/configMgr/com.adobe.cq.contentinsight.impl.ReportingServicesSettingsProvider", c.ComAdobeCqContentinsightImplReportingServicesSettingsProvider)

	// ComAdobeCqContentinsightImplServletsBrightEdgeProxyServlet - 
	e.POST("/system/console/configMgr/com.adobe.cq.contentinsight.impl.servlets.BrightEdgeProxyServlet", c.ComAdobeCqContentinsightImplServletsBrightEdgeProxyServlet)

	// ComAdobeCqContentinsightImplServletsReportingServicesProxyServle - 
	e.POST("/system/console/configMgr/com.adobe.cq.contentinsight.impl.servlets.ReportingServicesProxyServlet", c.ComAdobeCqContentinsightImplServletsReportingServicesProxyServle)

	// ComAdobeCqDamCfmImplComponentComponentConfigImpl - 
	e.POST("/system/console/configMgr/com.adobe.cq.dam.cfm.impl.component.ComponentConfigImpl", c.ComAdobeCqDamCfmImplComponentComponentConfigImpl)

	// ComAdobeCqDamCfmImplConfFeatureConfigImpl - 
	e.POST("/system/console/configMgr/com.adobe.cq.dam.cfm.impl.conf.FeatureConfigImpl", c.ComAdobeCqDamCfmImplConfFeatureConfigImpl)

	// ComAdobeCqDamCfmImplContentRewriterAssetProcessor - 
	e.POST("/system/console/configMgr/com.adobe.cq.dam.cfm.impl.content.rewriter.AssetProcessor", c.ComAdobeCqDamCfmImplContentRewriterAssetProcessor)

	// ComAdobeCqDamCfmImplContentRewriterParRangeFilter - 
	e.POST("/system/console/configMgr/com.adobe.cq.dam.cfm.impl.content.rewriter.ParRangeFilter", c.ComAdobeCqDamCfmImplContentRewriterParRangeFilter)

	// ComAdobeCqDamCfmImplContentRewriterPayloadFilter - 
	e.POST("/system/console/configMgr/com.adobe.cq.dam.cfm.impl.content.rewriter.PayloadFilter", c.ComAdobeCqDamCfmImplContentRewriterPayloadFilter)

	// ComAdobeCqDamDmProcessImagePTiffManagerImpl - 
	e.POST("/system/console/configMgr/com.adobe.cq.dam.dm.process.image.PTiffManagerImpl", c.ComAdobeCqDamDmProcessImagePTiffManagerImpl)

	// ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorker - 
	e.POST("/system/console/configMgr/com.adobe.cq.dam.ips.impl.replication.trigger.ReplicateOnModifyWorker", c.ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorker)

	// ComAdobeCqDamMacSyncHelperImplMACSyncClientImpl - 
	e.POST("/system/console/configMgr/com.adobe.cq.dam.mac.sync.helper.impl.MACSyncClientImpl", c.ComAdobeCqDamMacSyncHelperImplMACSyncClientImpl)

	// ComAdobeCqDamMacSyncImplDAMSyncServiceImpl - 
	e.POST("/system/console/configMgr/com.adobe.cq.dam.mac.sync.impl.DAMSyncServiceImpl", c.ComAdobeCqDamMacSyncImplDAMSyncServiceImpl)

	// ComAdobeCqDamProcessorNuiImplNuiAssetProcessor - 
	e.POST("/system/console/configMgr/com.adobe.cq.dam.processor.nui.impl.NuiAssetProcessor", c.ComAdobeCqDamProcessorNuiImplNuiAssetProcessor)

	// ComAdobeCqDamS7imagingImplIsImageServerComponent - 
	e.POST("/system/console/configMgr/com.adobe.cq.dam.s7imaging.impl.is.ImageServerComponent", c.ComAdobeCqDamS7imagingImplIsImageServerComponent)

	// ComAdobeCqDamS7imagingImplPsPlatformServerServlet - 
	e.POST("/system/console/configMgr/com.adobe.cq.dam.s7imaging.impl.ps.PlatformServerServlet", c.ComAdobeCqDamS7imagingImplPsPlatformServerServlet)

	// ComAdobeCqDamWebdavImplIoAssetIOHandler - 
	e.POST("/system/console/configMgr/com.adobe.cq.dam.webdav.impl.io.AssetIOHandler", c.ComAdobeCqDamWebdavImplIoAssetIOHandler)

	// ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJob - 
	e.POST("/system/console/configMgr/com.adobe.cq.dam.webdav.impl.io.DamWebdavVersionLinkingJob", c.ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJob)

	// ComAdobeCqDamWebdavImplIoSpecialFilesHandler - 
	e.POST("/system/console/configMgr/com.adobe.cq.dam.webdav.impl.io.SpecialFilesHandler", c.ComAdobeCqDamWebdavImplIoSpecialFilesHandler)

	// ComAdobeCqDeserfwImplDeserializationFirewallImpl - 
	e.POST("/system/console/configMgr/com.adobe.cq.deserfw.impl.DeserializationFirewallImpl", c.ComAdobeCqDeserfwImplDeserializationFirewallImpl)

	// ComAdobeCqDtmImplServiceDTMWebServiceImpl - 
	e.POST("/system/console/configMgr/com.adobe.cq.dtm.impl.service.DTMWebServiceImpl", c.ComAdobeCqDtmImplServiceDTMWebServiceImpl)

	// ComAdobeCqDtmImplServletsDTMDeployHookServlet - 
	e.POST("/system/console/configMgr/com.adobe.cq.dtm.impl.servlets.DTMDeployHookServlet", c.ComAdobeCqDtmImplServletsDTMDeployHookServlet)

	// ComAdobeCqDtmReactorImplServiceWebServiceImpl - 
	e.POST("/system/console/configMgr/com.adobe.cq.dtm.reactor.impl.service.WebServiceImpl", c.ComAdobeCqDtmReactorImplServiceWebServiceImpl)

	// ComAdobeCqExperiencelogImplExperienceLogConfigServlet - 
	e.POST("/system/console/configMgr/com.adobe.cq.experiencelog.impl.ExperienceLogConfigServlet", c.ComAdobeCqExperiencelogImplExperienceLogConfigServlet)

	// ComAdobeCqHcContentPackagesHealthCheck - 
	e.POST("/system/console/configMgr/com.adobe.cq.hc.ContentPackagesHealthCheck", c.ComAdobeCqHcContentPackagesHealthCheck)

	// ComAdobeCqHistoryImplHistoryRequestFilter - 
	e.POST("/system/console/configMgr/com.adobe.cq.history.impl.HistoryRequestFilter", c.ComAdobeCqHistoryImplHistoryRequestFilter)

	// ComAdobeCqHistoryImplHistoryServiceImpl - 
	e.POST("/system/console/configMgr/com.adobe.cq.history.impl.HistoryServiceImpl", c.ComAdobeCqHistoryImplHistoryServiceImpl)

	// ComAdobeCqInboxImplTypeproviderItemTypeProvider - 
	e.POST("/system/console/configMgr/com.adobe.cq.inbox.impl.typeprovider.ItemTypeProvider", c.ComAdobeCqInboxImplTypeproviderItemTypeProvider)

	// ComAdobeCqProjectsImplServletProjectImageServlet - 
	e.POST("/system/console/configMgr/com.adobe.cq.projects.impl.servlet.ProjectImageServlet", c.ComAdobeCqProjectsImplServletProjectImageServlet)

	// ComAdobeCqProjectsPurgeScheduler - 
	e.POST("/system/console/configMgr/com.adobe.cq.projects.purge.Scheduler", c.ComAdobeCqProjectsPurgeScheduler)

	// ComAdobeCqScheduledExporterImplScheduledExporterImpl - 
	e.POST("/system/console/configMgr/com.adobe.cq.scheduled.exporter.impl.ScheduledExporterImpl", c.ComAdobeCqScheduledExporterImplScheduledExporterImpl)

	// ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImpl - 
	e.POST("/system/console/configMgr/com.adobe.cq.screens.analytics.impl.ScreensAnalyticsServiceImpl", c.ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImpl)

	// ComAdobeCqScreensDeviceImplDeviceService - 
	e.POST("/system/console/configMgr/com.adobe.cq.screens.device.impl.DeviceService", c.ComAdobeCqScreensDeviceImplDeviceService)

	// ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImpl - 
	e.POST("/system/console/configMgr/com.adobe.cq.screens.device.registration.impl.RegistrationServiceImpl", c.ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImpl)

	// ComAdobeCqScreensImplHandlerChannelsUpdateHandler - 
	e.POST("/system/console/configMgr/com.adobe.cq.screens.impl.handler.ChannelsUpdateHandler", c.ComAdobeCqScreensImplHandlerChannelsUpdateHandler)

	// ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJob - 
	e.POST("/system/console/configMgr/com.adobe.cq.screens.impl.jobs.DistributedDevicesStatiUpdateJob", c.ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJob)

	// ComAdobeCqScreensImplRemoteImplDistributedHttpClientImpl - 
	e.POST("/system/console/configMgr/com.adobe.cq.screens.impl.remote.impl.DistributedHttpClientImpl", c.ComAdobeCqScreensImplRemoteImplDistributedHttpClientImpl)

	// ComAdobeCqScreensImplScreensChannelPostProcessor - 
	e.POST("/system/console/configMgr/com.adobe.cq.screens.impl.ScreensChannelPostProcessor", c.ComAdobeCqScreensImplScreensChannelPostProcessor)

	// ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImpl - 
	e.POST("/system/console/configMgr/com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl", c.ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImpl)

	// ComAdobeCqScreensMqActivemqImplArtemisJMSProvider - 
	e.POST("/system/console/configMgr/com.adobe.cq.screens.mq.activemq.impl.ArtemisJMSProvider", c.ComAdobeCqScreensMqActivemqImplArtemisJMSProvider)

	// ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImpl - 
	e.POST("/system/console/configMgr/com.adobe.cq.screens.offlinecontent.impl.BulkOfflineUpdateServiceImpl", c.ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImpl)

	// ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImpl - 
	e.POST("/system/console/configMgr/com.adobe.cq.screens.offlinecontent.impl.OfflineContentServiceImpl", c.ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImpl)

	// ComAdobeCqScreensSegmentationImplSegmentationFeatureFlag - 
	e.POST("/system/console/configMgr/com.adobe.cq.screens.segmentation.impl.SegmentationFeatureFlag", c.ComAdobeCqScreensSegmentationImplSegmentationFeatureFlag)

	// ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthCh - 
	e.POST("/system/console/configMgr/com.adobe.cq.security.hc.bundles.impl.HtmlLibraryManagerConfigHealthCheck", c.ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthCh)

	// ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheck - 
	e.POST("/system/console/configMgr/com.adobe.cq.security.hc.bundles.impl.WcmFilterHealthCheck", c.ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheck)

	// ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheck - 
	e.POST("/system/console/configMgr/com.adobe.cq.security.hc.dispatcher.impl.DispatcherAccessHealthCheck", c.ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheck)

	// ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheck - 
	e.POST("/system/console/configMgr/com.adobe.cq.security.hc.packages.impl.ExampleContentHealthCheck", c.ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheck)

	// ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheck - 
	e.POST("/system/console/configMgr/com.adobe.cq.security.hc.webserver.impl.ClickjackingHealthCheck", c.ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheck)

	// ComAdobeCqSocialAccountverificationImplAccountManagementConfigIm - 
	e.POST("/system/console/configMgr/com.adobe.cq.social.accountverification.impl.AccountManagementConfigImpl", c.ComAdobeCqSocialAccountverificationImplAccountManagementConfigIm)

	// ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponen - 
	e.POST("/system/console/configMgr/com.adobe.cq.social.activitystreams.client.impl.SocialActivityComponentFactoryImpl", c.ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponen)

	// ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCo - 
	e.POST("/system/console/configMgr/com.adobe.cq.social.activitystreams.client.impl.SocialActivityStreamComponentFactory", c.ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCo)

	// ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandler - 
	e.POST("/system/console/configMgr/com.adobe.cq.social.activitystreams.listener.impl.EventListenerHandler", c.ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandler)

	// ComAdobeCqSocialActivitystreamsListenerImplModerationEventExten - 
	e.POST("/system/console/configMgr/com.adobe.cq.social.activitystreams.listener.impl.ModerationEventExtension", c.ComAdobeCqSocialActivitystreamsListenerImplModerationEventExten)

	// ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivityS - 
	e.POST("/system/console/configMgr/com.adobe.cq.social.activitystreams.listener.impl.RatingEventActivitySuppressor", c.ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivityS)

	// ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStre - 
	e.POST("/system/console/configMgr/com.adobe.cq.social.activitystreams.listener.impl.ResourceActivityStreamProviderFactory", c.ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStre)

	// ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsI - 
	e.POST("/system/console/configMgr/com.adobe.cq.social.calendar.client.endpoints.impl.CalendarOperationsImpl", c.ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsI)

	// ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmen - 
	e.POST("/system/console/configMgr/com.adobe.cq.social.calendar.client.operationextensions.EventAttachment", c.ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmen)

	// ComAdobeCqSocialCalendarServletsTimeZoneServlet - 
	e.POST("/system/console/configMgr/com.adobe.cq.social.calendar.servlets.TimeZoneServlet", c.ComAdobeCqSocialCalendarServletsTimeZoneServlet)

	// ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEvent - 
	e.POST("/system/console/configMgr/com.adobe.cq.social.commons.comments.endpoints.impl.CommentDeleteEventActivitySuppressor", c.ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEvent)

	// ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSe - 
	e.POST("/system/console/configMgr/com.adobe.cq.social.commons.comments.endpoints.impl.CommentOperationService", c.ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSe)

	// ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperati - 
	e.POST("/system/console/configMgr/com.adobe.cq.social.commons.comments.endpoints.impl.TranslationOperationService", c.ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperati)

	// ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialC - 
	e.POST("/system/console/configMgr/com.adobe.cq.social.commons.comments.listing.impl.SearchCommentSocialComponentListProvider", c.ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialC)

	// ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPos - 
	e.POST("/system/console/configMgr/com.adobe.cq.social.commons.comments.scheduler.impl.SearchScheduledPosts", c.ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPos)

	// ComAdobeCqSocialCommonsCorsCORSAuthenticationFilter - 
	e.POST("/system/console/configMgr/com.adobe.cq.social.commons.cors.CORSAuthenticationFilter", c.ComAdobeCqSocialCommonsCorsCORSAuthenticationFilter)

	// ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProvider - 
	e.POST("/system/console/configMgr/com.adobe.cq.social.commons.emailreply.impl.AndroidEmailClientProvider", c.ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProvider)

	// ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImpl - 
	e.POST("/system/console/configMgr/com.adobe.cq.social.commons.emailreply.impl.CommentEmailBuilderImpl", c.ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImpl)

	// ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListener - 
	e.POST("/system/console/configMgr/com.adobe.cq.social.commons.emailreply.impl.CommentEmailEventListener", c.ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListener)

	// ComAdobeCqSocialCommonsEmailreplyImplCustomEmailClientProvider - 
	e.POST("/system/console/configMgr/com.adobe.cq.social.commons.emailreply.impl.CustomEmailClientProvider", c.ComAdobeCqSocialCommonsEmailreplyImplCustomEmailClientProvider)

	// ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImp - 
	e.POST("/system/console/configMgr/com.adobe.cq.social.commons.emailreply.impl.EmailQuotedTextPatternsImpl", c.ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImp)

	// ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImp - 
	e.POST("/system/console/configMgr/com.adobe.cq.social.commons.emailreply.impl.EmailReplyConfigurationImpl", c.ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImp)

	// ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporter - 
	e.POST("/system/console/configMgr/com.adobe.cq.social.commons.emailreply.impl.EmailReplyImporter", c.ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporter)

	// ComAdobeCqSocialCommonsEmailreplyImplGmailEmailClientProvider - 
	e.POST("/system/console/configMgr/com.adobe.cq.social.commons.emailreply.impl.GmailEmailClientProvider", c.ComAdobeCqSocialCommonsEmailreplyImplGmailEmailClientProvider)

	// ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProvider - 
	e.POST("/system/console/configMgr/com.adobe.cq.social.commons.emailreply.impl.IOSEmailClientProvider", c.ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProvider)

	// ComAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProvider - 
	e.POST("/system/console/configMgr/com.adobe.cq.social.commons.emailreply.impl.MacmailEmailClientProvider", c.ComAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProvider)

	// ComAdobeCqSocialCommonsEmailreplyImplOutLookEmailClientProvider - 
	e.POST("/system/console/configMgr/com.adobe.cq.social.commons.emailreply.impl.OutLookEmailClientProvider", c.ComAdobeCqSocialCommonsEmailreplyImplOutLookEmailClientProvider)

	// ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProvider - 
	e.POST("/system/console/configMgr/com.adobe.cq.social.commons.emailreply.impl.UnknownEmailClientProvider", c.ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProvider)

	// ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProvider - 
	e.POST("/system/console/configMgr/com.adobe.cq.social.commons.emailreply.impl.YahooEmailClientProvider", c.ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProvider)

	// ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUpload - 
	e.POST("/system/console/configMgr/com.adobe.cq.social.commons.maintainance.impl.DeleteTempUGCImageUploads", c.ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUpload)

	// ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImpl - 
	e.POST("/system/console/configMgr/com.adobe.cq.social.commons.ugclimiter.impl.UGCLimiterServiceImpl", c.ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImpl)

	// ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimit - 
	e.POST("/system/console/configMgr/com.adobe.cq.social.commons.ugclimitsconfig.impl.CommunityUserUGCLimitsConfigImpl", c.ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimit)

	// ComAdobeCqSocialConnectOauthImplFacebookProviderImpl - 
	e.POST("/system/console/configMgr/com.adobe.cq.social.connect.oauth.impl.FacebookProviderImpl", c.ComAdobeCqSocialConnectOauthImplFacebookProviderImpl)

	// ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandle - 
	e.POST("/system/console/configMgr/com.adobe.cq.social.connect.oauth.impl.SocialOAuthAuthenticationHandler", c.ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandle)

	// ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapper - 
	e.POST("/system/console/configMgr/com.adobe.cq.social.connect.oauth.impl.SocialOAuthUserProfileMapper", c.ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapper)

	// ComAdobeCqSocialConnectOauthImplTwitterProviderImpl - 
	e.POST("/system/console/configMgr/com.adobe.cq.social.connect.oauth.impl.TwitterProviderImpl", c.ComAdobeCqSocialConnectOauthImplTwitterProviderImpl)

	// ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmen - 
	e.POST("/system/console/configMgr/com.adobe.cq.social.content.fragments.services.impl.CommunitiesFragmentCreationServiceImpl", c.ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmen)

	// ComAdobeCqSocialDatastoreAsImplASResourceProviderFactory - 
	e.POST("/system/console/configMgr/com.adobe.cq.social.datastore.as.impl.ASResourceProviderFactory", c.ComAdobeCqSocialDatastoreAsImplASResourceProviderFactory)

	// ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactory - 
	e.POST("/system/console/configMgr/com.adobe.cq.social.datastore.op.impl.SocialMSResourceProviderFactory", c.ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactory)

	// ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactor - 
	e.POST("/system/console/configMgr/com.adobe.cq.social.datastore.rdb.impl.SocialRDBResourceProviderFactory", c.ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactor)

	// ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorF - 
	e.POST("/system/console/configMgr/com.adobe.cq.social.enablement.adaptors.EnablementLearningPathAdaptorFactory", c.ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorF)

	// ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFacto - 
	e.POST("/system/console/configMgr/com.adobe.cq.social.enablement.adaptors.EnablementResourceAdaptorFactory", c.ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFacto)

	// ComAdobeCqSocialEnablementLearningpathEndpointsImplEnablementL - 
	e.POST("/system/console/configMgr/com.adobe.cq.social.enablement.learningpath.endpoints.impl.EnablementLearningPathModelOperationService", c.ComAdobeCqSocialEnablementLearningpathEndpointsImplEnablementL)

	// ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResou - 
	e.POST("/system/console/configMgr/com.adobe.cq.social.enablement.resource.endpoints.impl.EnablementResourceModelOperationService", c.ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResou)

	// ComAdobeCqSocialEnablementServicesImplAuthorMarkerImpl - 
	e.POST("/system/console/configMgr/com.adobe.cq.social.enablement.services.impl.AuthorMarkerImpl", c.ComAdobeCqSocialEnablementServicesImplAuthorMarkerImpl)

	// ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGe - 
	e.POST("/system/console/configMgr/com.adobe.cq.social.filelibrary.client.endpoints.FilelibraryDownloadGetServlet", c.ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGe)

	// ComAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOpera - 
	e.POST("/system/console/configMgr/com.adobe.cq.social.filelibrary.client.endpoints.impl.FileLibraryOperationsService", c.ComAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOpera)

	// ComAdobeCqSocialForumClientEndpointsImplForumOperationsService - 
	e.POST("/system/console/configMgr/com.adobe.cq.social.forum.client.endpoints.impl.ForumOperationsService", c.ComAdobeCqSocialForumClientEndpointsImplForumOperationsService)

	// ComAdobeCqSocialForumDispatcherImplFlushOperations - 
	e.POST("/system/console/configMgr/com.adobe.cq.social.forum.dispatcher.impl.FlushOperations", c.ComAdobeCqSocialForumDispatcherImplFlushOperations)

	// ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponen - 
	e.POST("/system/console/configMgr/com.adobe.cq.social.group.client.impl.CommunityGroupCollectionComponentFactory", c.ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponen)

	// ComAdobeCqSocialGroupImplGroupServiceImpl - 
	e.POST("/system/console/configMgr/com.adobe.cq.social.group.impl.GroupServiceImpl", c.ComAdobeCqSocialGroupImplGroupServiceImpl)

	// ComAdobeCqSocialHandlebarsGuavaTemplateCacheImpl - 
	e.POST("/system/console/configMgr/com.adobe.cq.social.handlebars.GuavaTemplateCacheImpl", c.ComAdobeCqSocialHandlebarsGuavaTemplateCacheImpl)

	// ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsS - 
	e.POST("/system/console/configMgr/com.adobe.cq.social.ideation.client.endpoints.impl.IdeationOperationsService", c.ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsS)

	// ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSer - 
	e.POST("/system/console/configMgr/com.adobe.cq.social.journal.client.endpoints.impl.JournalOperationsService", c.ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSer)

	// ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfile - 
	e.POST("/system/console/configMgr/com.adobe.cq.social.members.endpoints.impl.CommunityMemberGroupProfileOperationService", c.ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfile)

	// ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileO - 
	e.POST("/system/console/configMgr/com.adobe.cq.social.members.endpoints.impl.CommunityMemberUserProfileOperationService", c.ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileO)

	// ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentF - 
	e.POST("/system/console/configMgr/com.adobe.cq.social.members.impl.CommunityMemberGroupProfileComponentFactory", c.ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentF)

	// ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperation - 
	e.POST("/system/console/configMgr/com.adobe.cq.social.messaging.client.endpoints.impl.MessagingOperationsServiceImpl", c.ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperation)

	// ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponen - 
	e.POST("/system/console/configMgr/com.adobe.cq.social.moderation.dashboard.api.FilterGroupSocialComponentFactory", c.ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponen)

	// ComAdobeCqSocialModerationDashboardApiModerationDashboardSocial - 
	e.POST("/system/console/configMgr/com.adobe.cq.social.moderation.dashboard.api.ModerationDashboardSocialComponentFactory", c.ComAdobeCqSocialModerationDashboardApiModerationDashboardSocial)

	// ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponen - 
	e.POST("/system/console/configMgr/com.adobe.cq.social.moderation.dashboard.api.UserDetailsSocialComponentFactory", c.ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponen)

	// ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSoci - 
	e.POST("/system/console/configMgr/com.adobe.cq.social.moderation.dashboard.internal.impl.FilterGroupSocialComponentFactoryV2", c.ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSoci)

	// ComAdobeCqSocialNotificationsImplMentionsRouter - 
	e.POST("/system/console/configMgr/com.adobe.cq.social.notifications.impl.MentionsRouter", c.ComAdobeCqSocialNotificationsImplMentionsRouter)

	// ComAdobeCqSocialNotificationsImplNotificationManagerImpl - 
	e.POST("/system/console/configMgr/com.adobe.cq.social.notifications.impl.NotificationManagerImpl", c.ComAdobeCqSocialNotificationsImplNotificationManagerImpl)

	// ComAdobeCqSocialNotificationsImplNotificationsRouter - 
	e.POST("/system/console/configMgr/com.adobe.cq.social.notifications.impl.NotificationsRouter", c.ComAdobeCqSocialNotificationsImplNotificationsRouter)

	// ComAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServic - 
	e.POST("/system/console/configMgr/com.adobe.cq.social.qna.client.endpoints.impl.QnaForumOperationsService", c.ComAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServic)

	// ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportI - 
	e.POST("/system/console/configMgr/com.adobe.cq.social.reporting.analytics.services.impl.AnalyticsReportImporterServiceImpl", c.ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportI)

	// ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportM - 
	e.POST("/system/console/configMgr/com.adobe.cq.social.reporting.analytics.services.impl.AnalyticsReportManagementServiceImpl", c.ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportM)

	// ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportS - 
	e.POST("/system/console/configMgr/com.adobe.cq.social.reporting.analytics.services.impl.SiteTrendReportSocialComponentFactory", c.ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportS)

	// ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServi - 
	e.POST("/system/console/configMgr/com.adobe.cq.social.review.client.endpoints.impl.ReviewOperationsService", c.ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServi)

	// ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServlet - 
	e.POST("/system/console/configMgr/com.adobe.cq.social.scf.core.operations.impl.SocialOperationsServlet", c.ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServlet)

	// ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServlet - 
	e.POST("/system/console/configMgr/com.adobe.cq.social.scf.endpoints.impl.DefaultSocialGetServlet", c.ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServlet)

	// ComAdobeCqSocialScoringImplScoringEventListener - 
	e.POST("/system/console/configMgr/com.adobe.cq.social.scoring.impl.ScoringEventListener", c.ComAdobeCqSocialScoringImplScoringEventListener)

	// ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImpl - 
	e.POST("/system/console/configMgr/com.adobe.cq.social.serviceusers.internal.impl.ServiceUserWrapperImpl", c.ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImpl)

	// ComAdobeCqSocialSiteEndpointsImplSiteOperationService - 
	e.POST("/system/console/configMgr/com.adobe.cq.social.site.endpoints.impl.SiteOperationService", c.ComAdobeCqSocialSiteEndpointsImplSiteOperationService)

	// ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceIm - 
	e.POST("/system/console/configMgr/com.adobe.cq.social.site.impl.AnalyticsComponentConfigurationServiceImpl", c.ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceIm)

	// ComAdobeCqSocialSiteImplSiteConfiguratorImpl - 
	e.POST("/system/console/configMgr/com.adobe.cq.social.site.impl.SiteConfiguratorImpl", c.ComAdobeCqSocialSiteImplSiteConfiguratorImpl)

	// ComAdobeCqSocialSrpImplSocialSolrConnector - 
	e.POST("/system/console/configMgr/com.adobe.cq.social.srp.impl.SocialSolrConnector", c.ComAdobeCqSocialSrpImplSocialSolrConnector)

	// ComAdobeCqSocialSyncImplDiffChangesObserver - 
	e.POST("/system/console/configMgr/com.adobe.cq.social.sync.impl.DiffChangesObserver", c.ComAdobeCqSocialSyncImplDiffChangesObserver)

	// ComAdobeCqSocialSyncImplGroupSyncListenerImpl - 
	e.POST("/system/console/configMgr/com.adobe.cq.social.sync.impl.GroupSyncListenerImpl", c.ComAdobeCqSocialSyncImplGroupSyncListenerImpl)

	// ComAdobeCqSocialSyncImplPublisherSyncServiceImpl - 
	e.POST("/system/console/configMgr/com.adobe.cq.social.sync.impl.PublisherSyncServiceImpl", c.ComAdobeCqSocialSyncImplPublisherSyncServiceImpl)

	// ComAdobeCqSocialSyncImplUserSyncListenerImpl - 
	e.POST("/system/console/configMgr/com.adobe.cq.social.sync.impl.UserSyncListenerImpl", c.ComAdobeCqSocialSyncImplUserSyncListenerImpl)

	// ComAdobeCqSocialTranslationImplTranslationServiceConfigManager - 
	e.POST("/system/console/configMgr/com.adobe.cq.social.translation.impl.TranslationServiceConfigManager", c.ComAdobeCqSocialTranslationImplTranslationServiceConfigManager)

	// ComAdobeCqSocialTranslationImplUGCLanguageDetector - 
	e.POST("/system/console/configMgr/com.adobe.cq.social.translation.impl.UGCLanguageDetector", c.ComAdobeCqSocialTranslationImplUGCLanguageDetector)

	// ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImpl - 
	e.POST("/system/console/configMgr/com.adobe.cq.social.ugcbase.dispatcher.impl.FlushServiceImpl", c.ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImpl)

	// ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImpl - 
	e.POST("/system/console/configMgr/com.adobe.cq.social.ugcbase.impl.AysncReverseReplicatorImpl", c.ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImpl)

	// ComAdobeCqSocialUgcbaseImplPublisherConfigurationImpl - 
	e.POST("/system/console/configMgr/com.adobe.cq.social.ugcbase.impl.PublisherConfigurationImpl", c.ComAdobeCqSocialUgcbaseImplPublisherConfigurationImpl)

	// ComAdobeCqSocialUgcbaseImplSocialUtilsImpl - 
	e.POST("/system/console/configMgr/com.adobe.cq.social.ugcbase.impl.SocialUtilsImpl", c.ComAdobeCqSocialUgcbaseImplSocialUtilsImpl)

	// ComAdobeCqSocialUgcbaseModerationImplAutoModerationImpl - 
	e.POST("/system/console/configMgr/com.adobe.cq.social.ugcbase.moderation.impl.AutoModerationImpl", c.ComAdobeCqSocialUgcbaseModerationImplAutoModerationImpl)

	// ComAdobeCqSocialUgcbaseModerationImplSentimentProcess - 
	e.POST("/system/console/configMgr/com.adobe.cq.social.ugcbase.moderation.impl.SentimentProcess", c.ComAdobeCqSocialUgcbaseModerationImplSentimentProcess)

	// ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackli - 
	e.POST("/system/console/configMgr/com.adobe.cq.social.ugcbase.security.impl.DefaultAttachmentTypeBlacklistService", c.ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackli)

	// ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImpl - 
	e.POST("/system/console/configMgr/com.adobe.cq.social.ugcbase.security.impl.SaferSlingPostValidatorImpl", c.ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImpl)

	// ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServlet - 
	e.POST("/system/console/configMgr/com.adobe.cq.social.user.endpoints.impl.UsersGroupFromPublishServlet", c.ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServlet)

	// ComAdobeCqSocialUserImplTransportHttpToPublisher - 
	e.POST("/system/console/configMgr/com.adobe.cq.social.user.impl.transport.HttpToPublisher", c.ComAdobeCqSocialUserImplTransportHttpToPublisher)

	// ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFact - 
	e.POST("/system/console/configMgr/com.adobe.cq.ui.wcm.commons.internal.servlets.rte.RTEFilterServletFactory.amended", c.ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFact)

	// ComAdobeCqUpgradesCleanupImplUpgradeContentCleanup - 
	e.POST("/system/console/configMgr/com.adobe.cq.upgrades.cleanup.impl.UpgradeContentCleanup", c.ComAdobeCqUpgradesCleanupImplUpgradeContentCleanup)

	// ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanup - 
	e.POST("/system/console/configMgr/com.adobe.cq.upgrades.cleanup.impl.UpgradeInstallFolderCleanup", c.ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanup)

	// ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderService - 
	e.POST("/system/console/configMgr/com.adobe.cq.wcm.jobs.async.impl.AsyncDeleteConfigProviderService", c.ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderService)

	// ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTask - 
	e.POST("/system/console/configMgr/com.adobe.cq.wcm.jobs.async.impl.AsyncJobCleanUpTask", c.ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTask)

	// ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderService - 
	e.POST("/system/console/configMgr/com.adobe.cq.wcm.jobs.async.impl.AsyncMoveConfigProviderService", c.ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderService)

	// ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderService - 
	e.POST("/system/console/configMgr/com.adobe.cq.wcm.jobs.async.impl.AsyncPageMoveConfigProviderService", c.ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderService)

	// ComAdobeCqWcmLaunchesImplLaunchesEventHandler - 
	e.POST("/system/console/configMgr/com.adobe.cq.wcm.launches.impl.LaunchesEventHandler", c.ComAdobeCqWcmLaunchesImplLaunchesEventHandler)

	// ComAdobeCqWcmMobileQrcodeServletQRCodeImageGenerator - 
	e.POST("/system/console/configMgr/com.adobe.cq.wcm.mobile.qrcode.servlet.QRCodeImageGenerator", c.ComAdobeCqWcmMobileQrcodeServletQRCodeImageGenerator)

	// ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImpl - 
	e.POST("/system/console/configMgr/com.adobe.cq.wcm.style.internal.ComponentStyleInfoCacheImpl", c.ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImpl)

	// ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImpl - 
	e.POST("/system/console/configMgr/com.adobe.cq.wcm.translation.impl.TranslationPlatformConfigurationImpl", c.ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImpl)

	// ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigService - 
	e.POST("/system/console/configMgr/com.adobe.fd.fp.config.FormsPortalDraftsandSubmissionConfigService", c.ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigService)

	// ComAdobeFdFpConfigFormsPortalSchedulerService - 
	e.POST("/system/console/configMgr/com.adobe.fd.fp.config.FormsPortalSchedulerService", c.ComAdobeFdFpConfigFormsPortalSchedulerService)

	// ComAdobeFormsCommonServiceImplDefaultDataProvider - 
	e.POST("/system/console/configMgr/com.adobe.forms.common.service.impl.DefaultDataProvider", c.ComAdobeFormsCommonServiceImplDefaultDataProvider)

	// ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImp - 
	e.POST("/system/console/configMgr/com.adobe.forms.common.service.impl.FormsCommonConfigurationServiceImpl", c.ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImp)

	// ComAdobeFormsCommonServletTempCleanUpTask - 
	e.POST("/system/console/configMgr/com.adobe.forms.common.servlet.TempCleanUpTask", c.ComAdobeFormsCommonServletTempCleanUpTask)

	// ComAdobeGraniteAcpPlatformPlatformServlet - 
	e.POST("/system/console/configMgr/com.adobe.granite.acp.platform.PlatformServlet", c.ComAdobeGraniteAcpPlatformPlatformServlet)

	// ComAdobeGraniteActivitystreamsImplActivityManagerImpl - 
	e.POST("/system/console/configMgr/com.adobe.granite.activitystreams.impl.ActivityManagerImpl", c.ComAdobeGraniteActivitystreamsImplActivityManagerImpl)

	// ComAdobeGraniteAnalyzerBaseSystemStatusServlet - 
	e.POST("/system/console/configMgr/com.adobe.granite.analyzer.base.SystemStatusServlet", c.ComAdobeGraniteAnalyzerBaseSystemStatusServlet)

	// ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServlet - 
	e.POST("/system/console/configMgr/com.adobe.granite.analyzer.scripts.compile.AllScriptsCompilerServlet", c.ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServlet)

	// ComAdobeGraniteApicontrollerFilterResolverHookFactory - 
	e.POST("/system/console/configMgr/com.adobe.granite.apicontroller.FilterResolverHookFactory", c.ComAdobeGraniteApicontrollerFilterResolverHookFactory)

	// ComAdobeGraniteAuthCertImplClientCertAuthHandler - 
	e.POST("/system/console/configMgr/com.adobe.granite.auth.cert.impl.ClientCertAuthHandler", c.ComAdobeGraniteAuthCertImplClientCertAuthHandler)

	// ComAdobeGraniteAuthIms - 
	e.POST("/system/console/configMgr/com.adobe.granite.auth.ims", c.ComAdobeGraniteAuthIms)

	// ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtension - 
	e.POST("/system/console/configMgr/com.adobe.granite.auth.ims.impl.ExternalUserIdMappingProviderExtension", c.ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtension)

	// ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImpl - 
	e.POST("/system/console/configMgr/com.adobe.granite.auth.ims.impl.IMSAccessTokenRequestCustomizerImpl", c.ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImpl)

	// ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidator - 
	e.POST("/system/console/configMgr/com.adobe.granite.auth.ims.impl.IMSInstanceCredentialsValidator", c.ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidator)

	// ComAdobeGraniteAuthImsImplIMSProviderImpl - 
	e.POST("/system/console/configMgr/com.adobe.granite.auth.ims.impl.IMSProviderImpl", c.ComAdobeGraniteAuthImsImplIMSProviderImpl)

	// ComAdobeGraniteAuthImsImplImsConfigProviderImpl - 
	e.POST("/system/console/configMgr/com.adobe.granite.auth.ims.impl.ImsConfigProviderImpl", c.ComAdobeGraniteAuthImsImplImsConfigProviderImpl)

	// ComAdobeGraniteAuthOauthAccesstokenProvider - 
	e.POST("/system/console/configMgr/com.adobe.granite.auth.oauth.accesstoken.provider", c.ComAdobeGraniteAuthOauthAccesstokenProvider)

	// ComAdobeGraniteAuthOauthImplBearerAuthenticationHandler - 
	e.POST("/system/console/configMgr/com.adobe.granite.auth.oauth.impl.BearerAuthenticationHandler", c.ComAdobeGraniteAuthOauthImplBearerAuthenticationHandler)

	// ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImpl - 
	e.POST("/system/console/configMgr/com.adobe.granite.auth.oauth.impl.DefaultTokenValidatorImpl", c.ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImpl)

	// ComAdobeGraniteAuthOauthImplFacebookProviderImpl - 
	e.POST("/system/console/configMgr/com.adobe.granite.auth.oauth.impl.FacebookProviderImpl", c.ComAdobeGraniteAuthOauthImplFacebookProviderImpl)

	// ComAdobeGraniteAuthOauthImplGithubProviderImpl - 
	e.POST("/system/console/configMgr/com.adobe.granite.auth.oauth.impl.GithubProviderImpl", c.ComAdobeGraniteAuthOauthImplGithubProviderImpl)

	// ComAdobeGraniteAuthOauthImplGraniteProvider - 
	e.POST("/system/console/configMgr/com.adobe.granite.auth.oauth.impl.GraniteProvider", c.ComAdobeGraniteAuthOauthImplGraniteProvider)

	// ComAdobeGraniteAuthOauthImplHelperProviderConfigManager - 
	e.POST("/system/console/configMgr/com.adobe.granite.auth.oauth.impl.helper.ProviderConfigManager", c.ComAdobeGraniteAuthOauthImplHelperProviderConfigManager)

	// ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternal - 
	e.POST("/system/console/configMgr/com.adobe.granite.auth.oauth.impl.helper.ProviderConfigManagerInternal", c.ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternal)

	// ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandler - 
	e.POST("/system/console/configMgr/com.adobe.granite.auth.oauth.impl.OAuthAuthenticationHandler", c.ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandler)

	// ComAdobeGraniteAuthOauthImplTwitterProviderImpl - 
	e.POST("/system/console/configMgr/com.adobe.granite.auth.oauth.impl.TwitterProviderImpl", c.ComAdobeGraniteAuthOauthImplTwitterProviderImpl)

	// ComAdobeGraniteAuthOauthProvider - 
	e.POST("/system/console/configMgr/com.adobe.granite.auth.oauth.provider", c.ComAdobeGraniteAuthOauthProvider)

	// ComAdobeGraniteAuthRequirementImplDefaultRequirementHandler - 
	e.POST("/system/console/configMgr/com.adobe.granite.auth.requirement.impl.DefaultRequirementHandler", c.ComAdobeGraniteAuthRequirementImplDefaultRequirementHandler)

	// ComAdobeGraniteAuthSamlSamlAuthenticationHandler - 
	e.POST("/system/console/configMgr/com.adobe.granite.auth.saml.SamlAuthenticationHandler", c.ComAdobeGraniteAuthSamlSamlAuthenticationHandler)

	// ComAdobeGraniteAuthSsoImplSsoAuthenticationHandler - 
	e.POST("/system/console/configMgr/com.adobe.granite.auth.sso.impl.SsoAuthenticationHandler", c.ComAdobeGraniteAuthSsoImplSsoAuthenticationHandler)

	// ComAdobeGraniteBundlesHcImplCodeCacheHealthCheck - 
	e.POST("/system/console/configMgr/com.adobe.granite.bundles.hc.impl.CodeCacheHealthCheck", c.ComAdobeGraniteBundlesHcImplCodeCacheHealthCheck)

	// ComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheck - 
	e.POST("/system/console/configMgr/com.adobe.granite.bundles.hc.impl.CrxdeSupportBundleHealthCheck", c.ComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheck)

	// ComAdobeGraniteBundlesHcImplDavExBundleHealthCheck - 
	e.POST("/system/console/configMgr/com.adobe.granite.bundles.hc.impl.DavExBundleHealthCheck", c.ComAdobeGraniteBundlesHcImplDavExBundleHealthCheck)

	// ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheck - 
	e.POST("/system/console/configMgr/com.adobe.granite.bundles.hc.impl.InactiveBundlesHealthCheck", c.ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheck)

	// ComAdobeGraniteBundlesHcImplJobsHealthCheck - 
	e.POST("/system/console/configMgr/com.adobe.granite.bundles.hc.impl.JobsHealthCheck", c.ComAdobeGraniteBundlesHcImplJobsHealthCheck)

	// ComAdobeGraniteBundlesHcImplSlingGetServletHealthCheck - 
	e.POST("/system/console/configMgr/com.adobe.granite.bundles.hc.impl.SlingGetServletHealthCheck", c.ComAdobeGraniteBundlesHcImplSlingGetServletHealthCheck)

	// ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheck - 
	e.POST("/system/console/configMgr/com.adobe.granite.bundles.hc.impl.SlingJavaScriptHandlerHealthCheck", c.ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheck)

	// ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheck - 
	e.POST("/system/console/configMgr/com.adobe.granite.bundles.hc.impl.SlingJspScriptHandlerHealthCheck", c.ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheck)

	// ComAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheck - 
	e.POST("/system/console/configMgr/com.adobe.granite.bundles.hc.impl.SlingReferrerFilterHealthCheck", c.ComAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheck)

	// ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheck - 
	e.POST("/system/console/configMgr/com.adobe.granite.bundles.hc.impl.WebDavBundleHealthCheck", c.ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheck)

	// ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFac - 
	e.POST("/system/console/configMgr/com.adobe.granite.comments.internal.CommentReplicationContentFilterFactory", c.ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFac)

	// ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImpl - 
	e.POST("/system/console/configMgr/com.adobe.granite.compatrouter.impl.CompatSwitchingServiceImpl", c.ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImpl)

	// ComAdobeGraniteCompatrouterImplRoutingConfig - 
	e.POST("/system/console/configMgr/com.adobe.granite.compatrouter.impl.RoutingConfig", c.ComAdobeGraniteCompatrouterImplRoutingConfig)

	// ComAdobeGraniteCompatrouterImplSwitchMappingConfig - 
	e.POST("/system/console/configMgr/com.adobe.granite.compatrouter.impl.SwitchMappingConfig", c.ComAdobeGraniteCompatrouterImplSwitchMappingConfig)

	// ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolving - 
	e.POST("/system/console/configMgr/com.adobe.granite.conf.impl.RuntimeAwareConfigurationResourceResolvingStrategy", c.ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolving)

	// ComAdobeGraniteContexthubImplContextHubImpl - 
	e.POST("/system/console/configMgr/com.adobe.granite.contexthub.impl.ContextHubImpl", c.ComAdobeGraniteContexthubImplContextHubImpl)

	// ComAdobeGraniteCorsImplCORSPolicyImpl - 
	e.POST("/system/console/configMgr/com.adobe.granite.cors.impl.CORSPolicyImpl", c.ComAdobeGraniteCorsImplCORSPolicyImpl)

	// ComAdobeGraniteCsrfImplCSRFFilter - 
	e.POST("/system/console/configMgr/com.adobe.granite.csrf.impl.CSRFFilter", c.ComAdobeGraniteCsrfImplCSRFFilter)

	// ComAdobeGraniteCsrfImplCSRFServlet - 
	e.POST("/system/console/configMgr/com.adobe.granite.csrf.impl.CSRFServlet", c.ComAdobeGraniteCsrfImplCSRFServlet)

	// ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSe - 
	e.POST("/system/console/configMgr/com.adobe.granite.distribution.core.impl.CryptoDistributionTransportSecretProvider", c.ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSe)

	// ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserver - 
	e.POST("/system/console/configMgr/com.adobe.granite.distribution.core.impl.diff.DiffChangesObserver", c.ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserver)

	// ComAdobeGraniteDistributionCoreImplDiffDiffEventListener - 
	e.POST("/system/console/configMgr/com.adobe.granite.distribution.core.impl.diff.DiffEventListener", c.ComAdobeGraniteDistributionCoreImplDiffDiffEventListener)

	// ComAdobeGraniteDistributionCoreImplDistributionToReplicationEven - 
	e.POST("/system/console/configMgr/com.adobe.granite.distribution.core.impl.DistributionToReplicationEventTransformer", c.ComAdobeGraniteDistributionCoreImplDistributionToReplicationEven)

	// ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicat - 
	e.POST("/system/console/configMgr/com.adobe.granite.distribution.core.impl.replication.adapters.ReplicationAgentProvider", c.ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicat)

	// ComAdobeGraniteDistributionCoreImplReplicationDistributionTrans - 
	e.POST("/system/console/configMgr/com.adobe.granite.distribution.core.impl.replication.DistributionTransportHandler", c.ComAdobeGraniteDistributionCoreImplReplicationDistributionTrans)

	// ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribu - 
	e.POST("/system/console/configMgr/com.adobe.granite.distribution.core.impl.transport.AccessTokenDistributionTransportSecretProvider", c.ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribu)

	// ComAdobeGraniteFragsImplCheckHttpHeaderFlag - 
	e.POST("/system/console/configMgr/com.adobe.granite.frags.impl.CheckHttpHeaderFlag", c.ComAdobeGraniteFragsImplCheckHttpHeaderFlag)

	// ComAdobeGraniteFragsImplRandomFeature - 
	e.POST("/system/console/configMgr/com.adobe.granite.frags.impl.RandomFeature", c.ComAdobeGraniteFragsImplRandomFeature)

	// ComAdobeGraniteHttpcacheFileFileCacheStore - 
	e.POST("/system/console/configMgr/com.adobe.granite.httpcache.file.FileCacheStore", c.ComAdobeGraniteHttpcacheFileFileCacheStore)

	// ComAdobeGraniteHttpcacheImplOuterCacheFilter - 
	e.POST("/system/console/configMgr/com.adobe.granite.httpcache.impl.OuterCacheFilter", c.ComAdobeGraniteHttpcacheImplOuterCacheFilter)

	// ComAdobeGraniteI18nImplBundlePseudoTranslations - 
	e.POST("/system/console/configMgr/com.adobe.granite.i18n.impl.bundle.PseudoTranslations", c.ComAdobeGraniteI18nImplBundlePseudoTranslations)

	// ComAdobeGraniteI18nImplPreferencesLocaleResolverService - 
	e.POST("/system/console/configMgr/com.adobe.granite.i18n.impl.PreferencesLocaleResolverService", c.ComAdobeGraniteI18nImplPreferencesLocaleResolverService)

	// ComAdobeGraniteInfocollectorInfoCollector - 
	e.POST("/system/console/configMgr/com.adobe.granite.infocollector.InfoCollector", c.ComAdobeGraniteInfocollectorInfoCollector)

	// ComAdobeGraniteJettySslInternalGraniteSslConnectorFactory - 
	e.POST("/system/console/configMgr/com.adobe.granite.jetty.ssl.internal.GraniteSslConnectorFactory", c.ComAdobeGraniteJettySslInternalGraniteSslConnectorFactory)

	// ComAdobeGraniteLicenseImplLicenseCheckFilter - 
	e.POST("/system/console/configMgr/com.adobe.granite.license.impl.LicenseCheckFilter", c.ComAdobeGraniteLicenseImplLicenseCheckFilter)

	// ComAdobeGraniteLoggingImplLogAnalyserImpl - 
	e.POST("/system/console/configMgr/com.adobe.granite.logging.impl.LogAnalyserImpl", c.ComAdobeGraniteLoggingImplLogAnalyserImpl)

	// ComAdobeGraniteLoggingImplLogErrorHealthCheck - 
	e.POST("/system/console/configMgr/com.adobe.granite.logging.impl.LogErrorHealthCheck", c.ComAdobeGraniteLoggingImplLogErrorHealthCheck)

	// ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTask - 
	e.POST("/system/console/configMgr/com.adobe.granite.maintenance.crx.impl.DataStoreGarbageCollectionTask", c.ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTask)

	// ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTask - 
	e.POST("/system/console/configMgr/com.adobe.granite.maintenance.crx.impl.LuceneBinariesCleanupTask", c.ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTask)

	// ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTask - 
	e.POST("/system/console/configMgr/com.adobe.granite.maintenance.crx.impl.RevisionCleanupTask", c.ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTask)

	// ComAdobeGraniteMonitoringImplScriptConfigImpl - 
	e.POST("/system/console/configMgr/com.adobe.granite.monitoring.impl.ScriptConfigImpl", c.ComAdobeGraniteMonitoringImplScriptConfigImpl)

	// ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHan - 
	e.POST("/system/console/configMgr/com.adobe.granite.oauth.server.auth.impl.OAuth2ServerAuthenticationHandler", c.ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHan)

	// ComAdobeGraniteOauthServerImplAccessTokenCleanupTask - 
	e.POST("/system/console/configMgr/com.adobe.granite.oauth.server.impl.AccessTokenCleanupTask", c.ComAdobeGraniteOauthServerImplAccessTokenCleanupTask)

	// ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServlet - 
	e.POST("/system/console/configMgr/com.adobe.granite.oauth.server.impl.OAuth2ClientRevocationServlet", c.ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServlet)

	// ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServlet - 
	e.POST("/system/console/configMgr/com.adobe.granite.oauth.server.impl.OAuth2RevocationEndpointServlet", c.ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServlet)

	// ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServlet - 
	e.POST("/system/console/configMgr/com.adobe.granite.oauth.server.impl.OAuth2TokenEndpointServlet", c.ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServlet)

	// ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServlet - 
	e.POST("/system/console/configMgr/com.adobe.granite.oauth.server.impl.OAuth2TokenRevocationServlet", c.ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServlet)

	// ComAdobeGraniteOffloadingImplOffloadingConfigurator - 
	e.POST("/system/console/configMgr/com.adobe.granite.offloading.impl.OffloadingConfigurator", c.ComAdobeGraniteOffloadingImplOffloadingConfigurator)

	// ComAdobeGraniteOffloadingImplOffloadingJobCloner - 
	e.POST("/system/console/configMgr/com.adobe.granite.offloading.impl.OffloadingJobCloner", c.ComAdobeGraniteOffloadingImplOffloadingJobCloner)

	// ComAdobeGraniteOffloadingImplOffloadingJobOffloader - 
	e.POST("/system/console/configMgr/com.adobe.granite.offloading.impl.OffloadingJobOffloader", c.ComAdobeGraniteOffloadingImplOffloadingJobOffloader)

	// ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManager - 
	e.POST("/system/console/configMgr/com.adobe.granite.offloading.impl.transporter.OffloadingAgentManager", c.ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManager)

	// ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspo - 
	e.POST("/system/console/configMgr/com.adobe.granite.offloading.impl.transporter.OffloadingDefaultTransporter", c.ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspo)

	// ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImpl - 
	e.POST("/system/console/configMgr/com.adobe.granite.omnisearch.impl.core.OmniSearchServiceImpl", c.ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImpl)

	// ComAdobeGraniteOptoutImplOptOutServiceImpl - 
	e.POST("/system/console/configMgr/com.adobe.granite.optout.impl.OptOutServiceImpl", c.ComAdobeGraniteOptoutImplOptOutServiceImpl)

	// ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheck - 
	e.POST("/system/console/configMgr/com.adobe.granite.queries.impl.hc.AsyncIndexHealthCheck", c.ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheck)

	// ComAdobeGraniteQueriesImplHcLargeIndexHealthCheck - 
	e.POST("/system/console/configMgr/com.adobe.granite.queries.impl.hc.LargeIndexHealthCheck", c.ComAdobeGraniteQueriesImplHcLargeIndexHealthCheck)

	// ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheck - 
	e.POST("/system/console/configMgr/com.adobe.granite.queries.impl.hc.QueriesStatusHealthCheck", c.ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheck)

	// ComAdobeGraniteQueriesImplHcQueryHealthCheckMetrics - 
	e.POST("/system/console/configMgr/com.adobe.granite.queries.impl.hc.QueryHealthCheckMetrics", c.ComAdobeGraniteQueriesImplHcQueryHealthCheckMetrics)

	// ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheck - 
	e.POST("/system/console/configMgr/com.adobe.granite.queries.impl.hc.QueryLimitsHealthCheck", c.ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheck)

	// ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheck - 
	e.POST("/system/console/configMgr/com.adobe.granite.replication.hc.impl.ReplicationQueueHealthCheck", c.ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheck)

	// ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthC - 
	e.POST("/system/console/configMgr/com.adobe.granite.replication.hc.impl.ReplicationTransportUsersHealthCheck", c.ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthC)

	// ComAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheck - 
	e.POST("/system/console/configMgr/com.adobe.granite.repository.hc.impl.AuthorizableNodeNameHealthCheck", c.ComAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheck)

	// ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthC - 
	e.POST("/system/console/configMgr/com.adobe.granite.repository.hc.impl.content.sling.SlingContentHealthCheck", c.ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthC)

	// ComAdobeGraniteRepositoryHcImplContinuousRGCHealthCheck - 
	e.POST("/system/console/configMgr/com.adobe.granite.repository.hc.impl.ContinuousRGCHealthCheck", c.ComAdobeGraniteRepositoryHcImplContinuousRGCHealthCheck)

	// ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthChe - 
	e.POST("/system/console/configMgr/com.adobe.granite.repository.hc.impl.DefaultAccessUserProfileHealthCheck", c.ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthChe)

	// ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheck - 
	e.POST("/system/console/configMgr/com.adobe.granite.repository.hc.impl.DefaultLoginsHealthCheck", c.ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheck)

	// ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheck - 
	e.POST("/system/console/configMgr/com.adobe.granite.repository.hc.impl.DiskSpaceHealthCheck", c.ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheck)

	// ComAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheck - 
	e.POST("/system/console/configMgr/com.adobe.granite.repository.hc.impl.ObservationQueueLengthHealthCheck", c.ComAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheck)

	// ComAdobeGraniteRepositoryImplCommitStatsConfig - 
	e.POST("/system/console/configMgr/com.adobe.granite.repository.impl.CommitStatsConfig", c.ComAdobeGraniteRepositoryImplCommitStatsConfig)

	// ComAdobeGraniteRepositoryServiceUserConfiguration - 
	e.POST("/system/console/configMgr/com.adobe.granite.repository.ServiceUserConfiguration", c.ComAdobeGraniteRepositoryServiceUserConfiguration)

	// ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckIm - 
	e.POST("/system/console/configMgr/com.adobe.granite.requests.logging.impl.hc.RequestsStatusHealthCheckImpl", c.ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckIm)

	// ComAdobeGraniteResourcestatusImplCompositeStatusType - 
	e.POST("/system/console/configMgr/com.adobe.granite.resourcestatus.impl.CompositeStatusType", c.ComAdobeGraniteResourcestatusImplCompositeStatusType)

	// ComAdobeGraniteResourcestatusImplStatusResourceProviderImpl - 
	e.POST("/system/console/configMgr/com.adobe.granite.resourcestatus.impl.StatusResourceProviderImpl", c.ComAdobeGraniteResourcestatusImplStatusResourceProviderImpl)

	// ComAdobeGraniteRestAssetsImplAssetContentDispositionFilter - 
	e.POST("/system/console/configMgr/com.adobe.granite.rest.assets.impl.AssetContentDispositionFilter", c.ComAdobeGraniteRestAssetsImplAssetContentDispositionFilter)

	// ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImpl - 
	e.POST("/system/console/configMgr/com.adobe.granite.rest.impl.ApiEndpointResourceProviderFactoryImpl", c.ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImpl)

	// ComAdobeGraniteRestImplServletDefaultGETServlet - 
	e.POST("/system/console/configMgr/com.adobe.granite.rest.impl.servlet.DefaultGETServlet", c.ComAdobeGraniteRestImplServletDefaultGETServlet)

	// ComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationS - 
	e.POST("/system/console/configMgr/com.adobe.granite.security.user.ui.internal.servlets.SSLConfigurationServlet", c.ComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationS)

	// ComAdobeGraniteSecurityUserUserPropertiesService - 
	e.POST("/system/console/configMgr/com.adobe.granite.security.user.UserPropertiesService", c.ComAdobeGraniteSecurityUserUserPropertiesService)

	// ComAdobeGraniteSocialgraphImplSocialGraphFactoryImpl - 
	e.POST("/system/console/configMgr/com.adobe.granite.socialgraph.impl.SocialGraphFactoryImpl", c.ComAdobeGraniteSocialgraphImplSocialGraphFactoryImpl)

	// ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImpl - 
	e.POST("/system/console/configMgr/com.adobe.granite.system.monitoring.impl.SystemStatsMBeanImpl", c.ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImpl)

	// ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactory - 
	e.POST("/system/console/configMgr/com.adobe.granite.taskmanagement.impl.jcr.TaskAdapterFactory", c.ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactory)

	// ComAdobeGraniteTaskmanagementImplJcrTaskArchiveService - 
	e.POST("/system/console/configMgr/com.adobe.granite.taskmanagement.impl.jcr.TaskArchiveService", c.ComAdobeGraniteTaskmanagementImplJcrTaskArchiveService)

	// ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTask - 
	e.POST("/system/console/configMgr/com.adobe.granite.taskmanagement.impl.purge.TaskPurgeMaintenanceTask", c.ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTask)

	// ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactor - 
	e.POST("/system/console/configMgr/com.adobe.granite.taskmanagement.impl.service.TaskManagerAdapterFactory", c.ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactor)

	// ComAdobeGraniteThreaddumpThreadDumpCollector - 
	e.POST("/system/console/configMgr/com.adobe.granite.threaddump.ThreadDumpCollector", c.ComAdobeGraniteThreaddumpThreadDumpCollector)

	// ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTransl - 
	e.POST("/system/console/configMgr/com.adobe.granite.translation.connector.msft.core.impl.MicrosoftTranslationServiceFactoryImpl", c.ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTransl)

	// ComAdobeGraniteTranslationCoreImplTranslationManagerImpl - 
	e.POST("/system/console/configMgr/com.adobe.granite.translation.core.impl.TranslationManagerImpl", c.ComAdobeGraniteTranslationCoreImplTranslationManagerImpl)

	// ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImpl - 
	e.POST("/system/console/configMgr/com.adobe.granite.ui.clientlibs.impl.HtmlLibraryManagerImpl", c.ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImpl)

	// ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeature - 
	e.POST("/system/console/configMgr/com.adobe.granite.workflow.console.frags.WorkflowWithdrawFeature", c.ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeature)

	// ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventService - 
	e.POST("/system/console/configMgr/com.adobe.granite.workflow.console.publish.WorkflowPublishEventService", c.ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventService)

	// ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManager - 
	e.POST("/system/console/configMgr/com.adobe.granite.workflow.core.jcr.WorkflowBucketManager", c.ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManager)

	// ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandler - 
	e.POST("/system/console/configMgr/com.adobe.granite.workflow.core.job.ExternalProcessJobHandler", c.ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandler)

	// ComAdobeGraniteWorkflowCoreJobJobHandler - 
	e.POST("/system/console/configMgr/com.adobe.granite.workflow.core.job.JobHandler", c.ComAdobeGraniteWorkflowCoreJobJobHandler)

	// ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsum - 
	e.POST("/system/console/configMgr/com.adobe.granite.workflow.core.offloading.WorkflowOffloadingJobConsumer", c.ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsum)

	// ComAdobeGraniteWorkflowCorePayloadMapCache - 
	e.POST("/system/console/configMgr/com.adobe.granite.workflow.core.PayloadMapCache", c.ComAdobeGraniteWorkflowCorePayloadMapCache)

	// ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListener - 
	e.POST("/system/console/configMgr/com.adobe.granite.workflow.core.payloadmap.PayloadMoveListener", c.ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListener)

	// ComAdobeGraniteWorkflowCoreWorkflowConfig - 
	e.POST("/system/console/configMgr/com.adobe.granite.workflow.core.WorkflowConfig", c.ComAdobeGraniteWorkflowCoreWorkflowConfig)

	// ComAdobeGraniteWorkflowCoreWorkflowSessionFactory - 
	e.POST("/system/console/configMgr/com.adobe.granite.workflow.core.WorkflowSessionFactory", c.ComAdobeGraniteWorkflowCoreWorkflowSessionFactory)

	// ComAdobeGraniteWorkflowPurgeScheduler - 
	e.POST("/system/console/configMgr/com.adobe.granite.workflow.purge.Scheduler", c.ComAdobeGraniteWorkflowPurgeScheduler)

	// ComAdobeOctopusNcommBootstrap - 
	e.POST("/system/console/configMgr/com.adobe.octopus.ncomm.bootstrap", c.ComAdobeOctopusNcommBootstrap)

	// ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullS - 
	e.POST("/system/console/configMgr/com.adobe.social.integrations.livefyre.user.pingforpull.impl.PingPullServlet", c.ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullS)

	// ComAdobeXmpWorkerFilesNcommXMPFilesNComm - 
	e.POST("/system/console/configMgr/com.adobe.xmp.worker.files.ncomm.XMPFilesNComm", c.ComAdobeXmpWorkerFilesNcommXMPFilesNComm)

	// ComDayCommonsDatasourceJdbcpoolJdbcPoolService - 
	e.POST("/system/console/configMgr/com.day.commons.datasource.jdbcpool.JdbcPoolService", c.ComDayCommonsDatasourceJdbcpoolJdbcPoolService)

	// ComDayCommonsHttpclient - 
	e.POST("/system/console/configMgr/com.day.commons.httpclient", c.ComDayCommonsHttpclient)

	// ComDayCqAnalyticsImplStorePropertiesChangeListener - 
	e.POST("/system/console/configMgr/com.day.cq.analytics.impl.StorePropertiesChangeListener", c.ComDayCqAnalyticsImplStorePropertiesChangeListener)

	// ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporte - 
	e.POST("/system/console/configMgr/com.day.cq.analytics.sitecatalyst.impl.exporter.ClassificationsExporter", c.ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporte)

	// ComDayCqAnalyticsSitecatalystImplImporterReportImporter - 
	e.POST("/system/console/configMgr/com.day.cq.analytics.sitecatalyst.impl.importer.ReportImporter", c.ComDayCqAnalyticsSitecatalystImplImporterReportImporter)

	// ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactory - 
	e.POST("/system/console/configMgr/com.day.cq.analytics.sitecatalyst.impl.SitecatalystAdapterFactory", c.ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactory)

	// ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImpl - 
	e.POST("/system/console/configMgr/com.day.cq.analytics.sitecatalyst.impl.SitecatalystHttpClientImpl", c.ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImpl)

	// ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdater - 
	e.POST("/system/console/configMgr/com.day.cq.analytics.testandtarget.impl.AccountOptionsUpdater", c.ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdater)

	// ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListener - 
	e.POST("/system/console/configMgr/com.day.cq.analytics.testandtarget.impl.DeleteAuthorActivityListener", c.ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListener)

	// ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListener - 
	e.POST("/system/console/configMgr/com.day.cq.analytics.testandtarget.impl.PushAuthorCampaignPageListener", c.ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListener)

	// ComDayCqAnalyticsTestandtargetImplSegmentImporter - 
	e.POST("/system/console/configMgr/com.day.cq.analytics.testandtarget.impl.SegmentImporter", c.ComDayCqAnalyticsTestandtargetImplSegmentImporter)

	// ComDayCqAnalyticsTestandtargetImplServiceWebServiceImpl - 
	e.POST("/system/console/configMgr/com.day.cq.analytics.testandtarget.impl.service.WebServiceImpl", c.ComDayCqAnalyticsTestandtargetImplServiceWebServiceImpl)

	// ComDayCqAnalyticsTestandtargetImplServletsAdminServerServlet - 
	e.POST("/system/console/configMgr/com.day.cq.analytics.testandtarget.impl.servlets.AdminServerServlet", c.ComDayCqAnalyticsTestandtargetImplServletsAdminServerServlet)

	// ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImpl - 
	e.POST("/system/console/configMgr/com.day.cq.analytics.testandtarget.impl.TestandtargetHttpClientImpl", c.ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImpl)

	// ComDayCqAuthImplCugCugSupportImpl - 
	e.POST("/system/console/configMgr/com.day.cq.auth.impl.cug.CugSupportImpl", c.ComDayCqAuthImplCugCugSupportImpl)

	// ComDayCqAuthImplLoginSelectorHandler - 
	e.POST("/system/console/configMgr/com.day.cq.auth.impl.LoginSelectorHandler", c.ComDayCqAuthImplLoginSelectorHandler)

	// ComDayCqCommonsImplExternalizerImpl - 
	e.POST("/system/console/configMgr/com.day.cq.commons.impl.ExternalizerImpl", c.ComDayCqCommonsImplExternalizerImpl)

	// ComDayCqCommonsServletsRootMappingServlet - 
	e.POST("/system/console/configMgr/com.day.cq.commons.servlets.RootMappingServlet", c.ComDayCqCommonsServletsRootMappingServlet)

	// ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionChecke - 
	e.POST("/system/console/configMgr/com.day.cq.compat.codeupgrade.impl.CodeUpgradeExecutionConditionChecker", c.ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionChecke)

	// ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreList - 
	e.POST("/system/console/configMgr/com.day.cq.compat.codeupgrade.impl.UpgradeTaskIgnoreList", c.ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreList)

	// ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelist - 
	e.POST("/system/console/configMgr/com.day.cq.compat.codeupgrade.impl.VersionRangeTaskIgnorelist", c.ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelist)

	// ComDayCqContentsyncImplContentSyncManagerImpl - 
	e.POST("/system/console/configMgr/com.day.cq.contentsync.impl.ContentSyncManagerImpl", c.ComDayCqContentsyncImplContentSyncManagerImpl)

	// ComDayCqDamCommonsHandlerStandardImageHandler - 
	e.POST("/system/console/configMgr/com.day.cq.dam.commons.handler.StandardImageHandler", c.ComDayCqDamCommonsHandlerStandardImageHandler)

	// ComDayCqDamCommonsMetadataXmpFilterBlackWhite - 
	e.POST("/system/console/configMgr/com.day.cq.dam.commons.metadata.XmpFilterBlackWhite", c.ComDayCqDamCommonsMetadataXmpFilterBlackWhite)

	// ComDayCqDamCommonsUtilImplAssetCacheImpl - 
	e.POST("/system/console/configMgr/com.day.cq.dam.commons.util.impl.AssetCacheImpl", c.ComDayCqDamCommonsUtilImplAssetCacheImpl)

	// ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfig - 
	e.POST("/system/console/configMgr/com.day.cq.dam.core.impl.annotation.pdf.AnnotationPdfConfig", c.ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfig)

	// ComDayCqDamCoreImplAssetMoveListener - 
	e.POST("/system/console/configMgr/com.day.cq.dam.core.impl.AssetMoveListener", c.ComDayCqDamCoreImplAssetMoveListener)

	// ComDayCqDamCoreImplAssethomeAssetHomePageConfiguration - 
	e.POST("/system/console/configMgr/com.day.cq.dam.core.impl.assethome.AssetHomePageConfiguration", c.ComDayCqDamCoreImplAssethomeAssetHomePageConfiguration)

	// ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServlet - 
	e.POST("/system/console/configMgr/com.day.cq.dam.core.impl.assetlinkshare.AdhocAssetShareProxyServlet", c.ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServlet)

	// ComDayCqDamCoreImplCacheCQBufferedImageCache - 
	e.POST("/system/console/configMgr/com.day.cq.dam.core.impl.cache.CQBufferedImageCache", c.ComDayCqDamCoreImplCacheCQBufferedImageCache)

	// ComDayCqDamCoreImplDamChangeEventListener - 
	e.POST("/system/console/configMgr/com.day.cq.dam.core.impl.DamChangeEventListener", c.ComDayCqDamCoreImplDamChangeEventListener)

	// ComDayCqDamCoreImplDamEventPurgeService - 
	e.POST("/system/console/configMgr/com.day.cq.dam.core.impl.DamEventPurgeService", c.ComDayCqDamCoreImplDamEventPurgeService)

	// ComDayCqDamCoreImplDamEventRecorderImpl - 
	e.POST("/system/console/configMgr/com.day.cq.dam.core.impl.DamEventRecorderImpl", c.ComDayCqDamCoreImplDamEventRecorderImpl)

	// ComDayCqDamCoreImplEventDamEventAuditListener - 
	e.POST("/system/console/configMgr/com.day.cq.dam.core.impl.event.DamEventAuditListener", c.ComDayCqDamCoreImplEventDamEventAuditListener)

	// ComDayCqDamCoreImplExpiryNotificationJobImpl - 
	e.POST("/system/console/configMgr/com.day.cq.dam.core.impl.ExpiryNotificationJobImpl", c.ComDayCqDamCoreImplExpiryNotificationJobImpl)

	// ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeat - 
	e.POST("/system/console/configMgr/com.day.cq.dam.core.impl.foldermetadataschema.FolderMetadataSchemaFeatureFlag", c.ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeat)

	// ComDayCqDamCoreImplGfxCommonsGfxRenderer - 
	e.POST("/system/console/configMgr/com.day.cq.dam.core.impl.gfx.CommonsGfxRenderer", c.ComDayCqDamCoreImplGfxCommonsGfxRenderer)

	// ComDayCqDamCoreImplHandlerEPSFormatHandler - 
	e.POST("/system/console/configMgr/com.day.cq.dam.core.impl.handler.EPSFormatHandler", c.ComDayCqDamCoreImplHandlerEPSFormatHandler)

	// ComDayCqDamCoreImplHandlerIndesignFormatHandler - 
	e.POST("/system/console/configMgr/com.day.cq.dam.core.impl.handler.IndesignFormatHandler", c.ComDayCqDamCoreImplHandlerIndesignFormatHandler)

	// ComDayCqDamCoreImplHandlerJpegHandler - 
	e.POST("/system/console/configMgr/com.day.cq.dam.core.impl.handler.JpegHandler", c.ComDayCqDamCoreImplHandlerJpegHandler)

	// ComDayCqDamCoreImplHandlerXmpNCommXMPHandler - 
	e.POST("/system/console/configMgr/com.day.cq.dam.core.impl.handler.xmp.NCommXMPHandler", c.ComDayCqDamCoreImplHandlerXmpNCommXMPHandler)

	// ComDayCqDamCoreImplJmxAssetIndexUpdateMonitor - 
	e.POST("/system/console/configMgr/com.day.cq.dam.core.impl.jmx.AssetIndexUpdateMonitor", c.ComDayCqDamCoreImplJmxAssetIndexUpdateMonitor)

	// ComDayCqDamCoreImplJmxAssetMigrationMBeanImpl - 
	e.POST("/system/console/configMgr/com.day.cq.dam.core.impl.jmx.AssetMigrationMBeanImpl", c.ComDayCqDamCoreImplJmxAssetMigrationMBeanImpl)

	// ComDayCqDamCoreImplJmxAssetUpdateMonitorImpl - 
	e.POST("/system/console/configMgr/com.day.cq.dam.core.impl.jmx.AssetUpdateMonitorImpl", c.ComDayCqDamCoreImplJmxAssetUpdateMonitorImpl)

	// ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfig - 
	e.POST("/system/console/configMgr/com.day.cq.dam.core.impl.jobs.metadataexport.AsyncMetadataExportConfigProviderService", c.ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfig)

	// ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfig - 
	e.POST("/system/console/configMgr/com.day.cq.dam.core.impl.jobs.metadataimport.AsyncMetadataImportConfigProviderService", c.ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfig)

	// ComDayCqDamCoreImplLightboxLightboxServlet - 
	e.POST("/system/console/configMgr/com.day.cq.dam.core.impl.lightbox.LightboxServlet", c.ComDayCqDamCoreImplLightboxLightboxServlet)

	// ComDayCqDamCoreImplMetadataEditorSelectComponentHandler - 
	e.POST("/system/console/configMgr/com.day.cq.dam.core.impl.metadata.editor.SelectComponentHandler", c.ComDayCqDamCoreImplMetadataEditorSelectComponentHandler)

	// ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelper - 
	e.POST("/system/console/configMgr/com.day.cq.dam.core.impl.mimeType.AssetUploadRestrictionHelper", c.ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelper)

	// ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImpl - 
	e.POST("/system/console/configMgr/com.day.cq.dam.core.impl.mimeType.DamMimeTypeServiceImpl", c.ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImpl)

	// ComDayCqDamCoreImplMissingMetadataNotificationJob - 
	e.POST("/system/console/configMgr/com.day.cq.dam.core.impl.MissingMetadataNotificationJob", c.ComDayCqDamCoreImplMissingMetadataNotificationJob)

	// ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPr - 
	e.POST("/system/console/configMgr/com.day.cq.dam.core.impl.process.SendTransientWorkflowCompletedEmailProcess", c.ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPr)

	// ComDayCqDamCoreImplProcessTextExtractionProcess - 
	e.POST("/system/console/configMgr/com.day.cq.dam.core.impl.process.TextExtractionProcess", c.ComDayCqDamCoreImplProcessTextExtractionProcess)

	// ComDayCqDamCoreImplRenditionMakerImpl - 
	e.POST("/system/console/configMgr/com.day.cq.dam.core.impl.RenditionMakerImpl", c.ComDayCqDamCoreImplRenditionMakerImpl)

	// ComDayCqDamCoreImplReportsReportExportService - 
	e.POST("/system/console/configMgr/com.day.cq.dam.core.impl.reports.ReportExportService", c.ComDayCqDamCoreImplReportsReportExportService)

	// ComDayCqDamCoreImplReportsReportPurgeService - 
	e.POST("/system/console/configMgr/com.day.cq.dam.core.impl.reports.ReportPurgeService", c.ComDayCqDamCoreImplReportsReportPurgeService)

	// ComDayCqDamCoreImplServletAssetDownloadServlet - 
	e.POST("/system/console/configMgr/com.day.cq.dam.core.impl.servlet.AssetDownloadServlet", c.ComDayCqDamCoreImplServletAssetDownloadServlet)

	// ComDayCqDamCoreImplServletAssetStatusServlet - 
	e.POST("/system/console/configMgr/com.day.cq.dam.core.impl.servlet.AssetStatusServlet", c.ComDayCqDamCoreImplServletAssetStatusServlet)

	// ComDayCqDamCoreImplServletAssetXMPSearchServlet - 
	e.POST("/system/console/configMgr/com.day.cq.dam.core.impl.servlet.AssetXMPSearchServlet", c.ComDayCqDamCoreImplServletAssetXMPSearchServlet)

	// ComDayCqDamCoreImplServletBatchMetadataServlet - 
	e.POST("/system/console/configMgr/com.day.cq.dam.core.impl.servlet.BatchMetadataServlet", c.ComDayCqDamCoreImplServletBatchMetadataServlet)

	// ComDayCqDamCoreImplServletBinaryProviderServlet - 
	e.POST("/system/console/configMgr/com.day.cq.dam.core.impl.servlet.BinaryProviderServlet", c.ComDayCqDamCoreImplServletBinaryProviderServlet)

	// ComDayCqDamCoreImplServletCollectionServlet - 
	e.POST("/system/console/configMgr/com.day.cq.dam.core.impl.servlet.CollectionServlet", c.ComDayCqDamCoreImplServletCollectionServlet)

	// ComDayCqDamCoreImplServletCollectionsServlet - 
	e.POST("/system/console/configMgr/com.day.cq.dam.core.impl.servlet.CollectionsServlet", c.ComDayCqDamCoreImplServletCollectionsServlet)

	// ComDayCqDamCoreImplServletCompanionServlet - 
	e.POST("/system/console/configMgr/com.day.cq.dam.core.impl.servlet.CompanionServlet", c.ComDayCqDamCoreImplServletCompanionServlet)

	// ComDayCqDamCoreImplServletCreateAssetServlet - 
	e.POST("/system/console/configMgr/com.day.cq.dam.core.impl.servlet.CreateAssetServlet", c.ComDayCqDamCoreImplServletCreateAssetServlet)

	// ComDayCqDamCoreImplServletDamContentDispositionFilter - 
	e.POST("/system/console/configMgr/com.day.cq.dam.core.impl.servlet.DamContentDispositionFilter", c.ComDayCqDamCoreImplServletDamContentDispositionFilter)

	// ComDayCqDamCoreImplServletGuidLookupFilter - 
	e.POST("/system/console/configMgr/com.day.cq.dam.core.impl.servlet.GuidLookupFilter", c.ComDayCqDamCoreImplServletGuidLookupFilter)

	// ComDayCqDamCoreImplServletHealthCheckServlet - 
	e.POST("/system/console/configMgr/com.day.cq.dam.core.impl.servlet.HealthCheckServlet", c.ComDayCqDamCoreImplServletHealthCheckServlet)

	// ComDayCqDamCoreImplServletMetadataGetServlet - 
	e.POST("/system/console/configMgr/com.day.cq.dam.core.impl.servlet.MetadataGetServlet", c.ComDayCqDamCoreImplServletMetadataGetServlet)

	// ComDayCqDamCoreImplServletMultipleLicenseAcceptServlet - 
	e.POST("/system/console/configMgr/com.day.cq.dam.core.impl.servlet.MultipleLicenseAcceptServlet", c.ComDayCqDamCoreImplServletMultipleLicenseAcceptServlet)

	// ComDayCqDamCoreImplServletResourceCollectionServlet - 
	e.POST("/system/console/configMgr/com.day.cq.dam.core.impl.servlet.ResourceCollectionServlet", c.ComDayCqDamCoreImplServletResourceCollectionServlet)

	// ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImpl - 
	e.POST("/system/console/configMgr/com.day.cq.dam.core.impl.ui.preview.FolderPreviewUpdaterImpl", c.ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImpl)

	// ComDayCqDamCoreImplUnzipUnzipConfig - 
	e.POST("/system/console/configMgr/com.day.cq.dam.core.impl.unzip.UnzipConfig", c.ComDayCqDamCoreImplUnzipUnzipConfig)

	// ComDayCqDamCoreProcessExifToolExtractMetadataProcess - 
	e.POST("/system/console/configMgr/com.day.cq.dam.core.process.ExifToolExtractMetadataProcess", c.ComDayCqDamCoreProcessExifToolExtractMetadataProcess)

	// ComDayCqDamCoreProcessExtractMetadataProcess - 
	e.POST("/system/console/configMgr/com.day.cq.dam.core.process.ExtractMetadataProcess", c.ComDayCqDamCoreProcessExtractMetadataProcess)

	// ComDayCqDamCoreProcessMetadataProcessorProcess - 
	e.POST("/system/console/configMgr/com.day.cq.dam.core.process.MetadataProcessorProcess", c.ComDayCqDamCoreProcessMetadataProcessorProcess)

	// ComDayCqDamHandlerFfmpegLocatorImpl - 
	e.POST("/system/console/configMgr/com.day.cq.dam.handler.ffmpeg.LocatorImpl", c.ComDayCqDamHandlerFfmpegLocatorImpl)

	// ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImpl - 
	e.POST("/system/console/configMgr/com.day.cq.dam.handler.gibson.fontmanager.impl.FontManagerServiceImpl", c.ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImpl)

	// ComDayCqDamHandlerStandardPdfPdfHandler - 
	e.POST("/system/console/configMgr/com.day.cq.dam.handler.standard.pdf.PdfHandler", c.ComDayCqDamHandlerStandardPdfPdfHandler)

	// ComDayCqDamHandlerStandardPsPostScriptHandler - 
	e.POST("/system/console/configMgr/com.day.cq.dam.handler.standard.ps.PostScriptHandler", c.ComDayCqDamHandlerStandardPsPostScriptHandler)

	// ComDayCqDamHandlerStandardPsdPsdHandler - 
	e.POST("/system/console/configMgr/com.day.cq.dam.handler.standard.psd.PsdHandler", c.ComDayCqDamHandlerStandardPsdPsdHandler)

	// ComDayCqDamIdsImplIDSJobProcessor - 
	e.POST("/system/console/configMgr/com.day.cq.dam.ids.impl.IDSJobProcessor", c.ComDayCqDamIdsImplIDSJobProcessor)

	// ComDayCqDamIdsImplIDSPoolManagerImpl - 
	e.POST("/system/console/configMgr/com.day.cq.dam.ids.impl.IDSPoolManagerImpl", c.ComDayCqDamIdsImplIDSPoolManagerImpl)

	// ComDayCqDamInddImplHandlerIndesignXMPHandler - 
	e.POST("/system/console/configMgr/com.day.cq.dam.indd.impl.handler.IndesignXMPHandler", c.ComDayCqDamInddImplHandlerIndesignXMPHandler)

	// ComDayCqDamInddImplServletSnippetCreationServlet - 
	e.POST("/system/console/configMgr/com.day.cq.dam.indd.impl.servlet.SnippetCreationServlet", c.ComDayCqDamInddImplServletSnippetCreationServlet)

	// ComDayCqDamInddProcessINDDMediaExtractProcess - 
	e.POST("/system/console/configMgr/com.day.cq.dam.indd.process.INDDMediaExtractProcess", c.ComDayCqDamInddProcessINDDMediaExtractProcess)

	// ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImpl - 
	e.POST("/system/console/configMgr/com.day.cq.dam.performance.internal.AssetPerformanceDataHandlerImpl", c.ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImpl)

	// ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJob - 
	e.POST("/system/console/configMgr/com.day.cq.dam.performance.internal.AssetPerformanceReportSyncJob", c.ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJob)

	// ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadPro - 
	e.POST("/system/console/configMgr/com.day.cq.dam.pim.impl.sourcing.upload.process.ProductAssetsUploadProcess", c.ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadPro)

	// ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEven - 
	e.POST("/system/console/configMgr/com.day.cq.dam.s7dam.common.analytics.impl.S7damDynamicMediaConfigEventListener", c.ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEven)

	// ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunner - 
	e.POST("/system/console/configMgr/com.day.cq.dam.s7dam.common.analytics.impl.SiteCatalystReportRunner", c.ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunner)

	// ComDayCqDamS7damCommonPostServletsSetCreateHandler - 
	e.POST("/system/console/configMgr/com.day.cq.dam.s7dam.common.post.servlets.SetCreateHandler", c.ComDayCqDamS7damCommonPostServletsSetCreateHandler)

	// ComDayCqDamS7damCommonPostServletsSetModifyHandler - 
	e.POST("/system/console/configMgr/com.day.cq.dam.s7dam.common.post.servlets.SetModifyHandler", c.ComDayCqDamS7damCommonPostServletsSetModifyHandler)

	// ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcess - 
	e.POST("/system/console/configMgr/com.day.cq.dam.s7dam.common.process.VideoThumbnailDownloadProcess", c.ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcess)

	// ComDayCqDamS7damCommonS7damDamChangeEventListener - 
	e.POST("/system/console/configMgr/com.day.cq.dam.s7dam.common.S7damDamChangeEventListener", c.ComDayCqDamS7damCommonS7damDamChangeEventListener)

	// ComDayCqDamS7damCommonServletsS7damProductInfoServlet - 
	e.POST("/system/console/configMgr/com.day.cq.dam.s7dam.common.servlets.S7damProductInfoServlet", c.ComDayCqDamS7damCommonServletsS7damProductInfoServlet)

	// ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImpl - 
	e.POST("/system/console/configMgr/com.day.cq.dam.s7dam.common.video.impl.VideoProxyClientServiceImpl", c.ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImpl)

	// ComDayCqDamScene7ImplScene7APIClientImpl - 
	e.POST("/system/console/configMgr/com.day.cq.dam.scene7.impl.Scene7APIClientImpl", c.ComDayCqDamScene7ImplScene7APIClientImpl)

	// ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImpl - 
	e.POST("/system/console/configMgr/com.day.cq.dam.scene7.impl.Scene7AssetMimeTypeServiceImpl", c.ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImpl)

	// ComDayCqDamScene7ImplScene7ConfigurationEventListener - 
	e.POST("/system/console/configMgr/com.day.cq.dam.scene7.impl.Scene7ConfigurationEventListener", c.ComDayCqDamScene7ImplScene7ConfigurationEventListener)

	// ComDayCqDamScene7ImplScene7DamChangeEventListener - 
	e.POST("/system/console/configMgr/com.day.cq.dam.scene7.impl.Scene7DamChangeEventListener", c.ComDayCqDamScene7ImplScene7DamChangeEventListener)

	// ComDayCqDamScene7ImplScene7FlashTemplatesServiceImpl - 
	e.POST("/system/console/configMgr/com.day.cq.dam.scene7.impl.Scene7FlashTemplatesServiceImpl", c.ComDayCqDamScene7ImplScene7FlashTemplatesServiceImpl)

	// ComDayCqDamScene7ImplScene7UploadServiceImpl - 
	e.POST("/system/console/configMgr/com.day.cq.dam.scene7.impl.Scene7UploadServiceImpl", c.ComDayCqDamScene7ImplScene7UploadServiceImpl)

	// ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSer - 
	e.POST("/system/console/configMgr/com.day.cq.dam.stock.integration.impl.cache.StockCacheConfigurationServiceImpl", c.ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSer)

	// ComDayCqDamStockIntegrationImplConfigurationStockConfiguration - 
	e.POST("/system/console/configMgr/com.day.cq.dam.stock.integration.impl.configuration.StockConfigurationImpl", c.ComDayCqDamStockIntegrationImplConfigurationStockConfiguration)

	// ComDayCqDamVideoImplServletVideoTestServlet - 
	e.POST("/system/console/configMgr/com.day.cq.dam.video.impl.servlet.VideoTestServlet", c.ComDayCqDamVideoImplServletVideoTestServlet)

	// ComDayCqExtwidgetServletsImageSpriteServlet - 
	e.POST("/system/console/configMgr/com.day.cq.extwidget.servlets.ImageSpriteServlet", c.ComDayCqExtwidgetServletsImageSpriteServlet)

	// ComDayCqImageInternalFontFontHelper - 
	e.POST("/system/console/configMgr/com.day.cq.image.internal.font.FontHelper", c.ComDayCqImageInternalFontFontHelper)

	// ComDayCqJcrclustersupportClusterStartLevelController - 
	e.POST("/system/console/configMgr/com.day.cq.jcrclustersupport.ClusterStartLevelController", c.ComDayCqJcrclustersupportClusterStartLevelController)

	// ComDayCqMailerDefaultMailService - 
	e.POST("/system/console/configMgr/com.day.cq.mailer.DefaultMailService", c.ComDayCqMailerDefaultMailService)

	// ComDayCqMailerImplCqMailingService - 
	e.POST("/system/console/configMgr/com.day.cq.mailer.impl.CqMailingService", c.ComDayCqMailerImplCqMailingService)

	// ComDayCqMailerImplEmailCqEmailTemplateFactory - 
	e.POST("/system/console/configMgr/com.day.cq.mailer.impl.email.CqEmailTemplateFactory", c.ComDayCqMailerImplEmailCqEmailTemplateFactory)

	// ComDayCqMailerImplEmailCqRetrieverTemplateFactory - 
	e.POST("/system/console/configMgr/com.day.cq.mailer.impl.email.CqRetrieverTemplateFactory", c.ComDayCqMailerImplEmailCqRetrieverTemplateFactory)

	// ComDayCqMcmCampaignImplIntegrationConfigImpl - 
	e.POST("/system/console/configMgr/com.day.cq.mcm.campaign.impl.IntegrationConfigImpl", c.ComDayCqMcmCampaignImplIntegrationConfigImpl)

	// ComDayCqMcmCampaignImporterPersonalizedTextHandlerFactory - 
	e.POST("/system/console/configMgr/com.day.cq.mcm.campaign.importer.PersonalizedTextHandlerFactory", c.ComDayCqMcmCampaignImporterPersonalizedTextHandlerFactory)

	// ComDayCqMcmCoreNewsletterNewsletterEmailServiceImpl - 
	e.POST("/system/console/configMgr/com.day.cq.mcm.core.newsletter.NewsletterEmailServiceImpl", c.ComDayCqMcmCoreNewsletterNewsletterEmailServiceImpl)

	// ComDayCqMcmImplMCMConfiguration - 
	e.POST("/system/console/configMgr/com.day.cq.mcm.impl.MCMConfiguration", c.ComDayCqMcmImplMCMConfiguration)

	// ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponen - 
	e.POST("/system/console/configMgr/com.day.cq.mcm.landingpage.parser.taghandlers.cta.ClickThroughComponentTagHandlerFactory", c.ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponen)

	// ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThroug - 
	e.POST("/system/console/configMgr/com.day.cq.mcm.landingpage.parser.taghandlers.cta.GraphicalClickThroughComponentTagHandlerFactory", c.ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThroug)

	// ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponent - 
	e.POST("/system/console/configMgr/com.day.cq.mcm.landingpage.parser.taghandlers.cta.LeadFormCTAComponentTagHandlerFactory", c.ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponent)

	// ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHa - 
	e.POST("/system/console/configMgr/com.day.cq.mcm.landingpage.parser.taghandlers.mbox.MBoxExperienceTagHandlerFactory", c.ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHa)

	// ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagH - 
	e.POST("/system/console/configMgr/com.day.cq.mcm.landingpage.parser.taghandlers.mbox.TargetComponentTagHandlerFactory", c.ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagH)

	// ComDayCqNotificationImplNotificationServiceImpl - 
	e.POST("/system/console/configMgr/com.day.cq.notification.impl.NotificationServiceImpl", c.ComDayCqNotificationImplNotificationServiceImpl)

	// ComDayCqPersonalizationImplServletsTargetingConfigurationServlet - 
	e.POST("/system/console/configMgr/com.day.cq.personalization.impl.servlets.TargetingConfigurationServlet", c.ComDayCqPersonalizationImplServletsTargetingConfigurationServlet)

	// ComDayCqPollingImporterImplManagedPollConfigImpl - 
	e.POST("/system/console/configMgr/com.day.cq.polling.importer.impl.ManagedPollConfigImpl", c.ComDayCqPollingImporterImplManagedPollConfigImpl)

	// ComDayCqPollingImporterImplManagedPollingImporterImpl - 
	e.POST("/system/console/configMgr/com.day.cq.polling.importer.impl.ManagedPollingImporterImpl", c.ComDayCqPollingImporterImplManagedPollingImporterImpl)

	// ComDayCqPollingImporterImplPollingImporterImpl - 
	e.POST("/system/console/configMgr/com.day.cq.polling.importer.impl.PollingImporterImpl", c.ComDayCqPollingImporterImplPollingImporterImpl)

	// ComDayCqReplicationAuditReplicationEventListener - 
	e.POST("/system/console/configMgr/com.day.cq.replication.audit.ReplicationEventListener", c.ComDayCqReplicationAuditReplicationEventListener)

	// ComDayCqReplicationContentStaticContentBuilder - 
	e.POST("/system/console/configMgr/com.day.cq.replication.content.StaticContentBuilder", c.ComDayCqReplicationContentStaticContentBuilder)

	// ComDayCqReplicationImplAgentManagerImpl - 
	e.POST("/system/console/configMgr/com.day.cq.replication.impl.AgentManagerImpl", c.ComDayCqReplicationImplAgentManagerImpl)

	// ComDayCqReplicationImplContentDurboBinaryLessContentBuilder - 
	e.POST("/system/console/configMgr/com.day.cq.replication.impl.content.durbo.BinaryLessContentBuilder", c.ComDayCqReplicationImplContentDurboBinaryLessContentBuilder)

	// ComDayCqReplicationImplContentDurboDurboImportConfigurationProv - 
	e.POST("/system/console/configMgr/com.day.cq.replication.impl.content.durbo.DurboImportConfigurationProviderService", c.ComDayCqReplicationImplContentDurboDurboImportConfigurationProv)

	// ComDayCqReplicationImplReplicationContentFactoryProviderImpl - 
	e.POST("/system/console/configMgr/com.day.cq.replication.impl.ReplicationContentFactoryProviderImpl", c.ComDayCqReplicationImplReplicationContentFactoryProviderImpl)

	// ComDayCqReplicationImplReplicationReceiverImpl - 
	e.POST("/system/console/configMgr/com.day.cq.replication.impl.ReplicationReceiverImpl", c.ComDayCqReplicationImplReplicationReceiverImpl)

	// ComDayCqReplicationImplReplicatorImpl - 
	e.POST("/system/console/configMgr/com.day.cq.replication.impl.ReplicatorImpl", c.ComDayCqReplicationImplReplicatorImpl)

	// ComDayCqReplicationImplReverseReplicator - 
	e.POST("/system/console/configMgr/com.day.cq.replication.impl.ReverseReplicator", c.ComDayCqReplicationImplReverseReplicator)

	// ComDayCqReplicationImplTransportBinaryLessTransportHandler - 
	e.POST("/system/console/configMgr/com.day.cq.replication.impl.transport.BinaryLessTransportHandler", c.ComDayCqReplicationImplTransportBinaryLessTransportHandler)

	// ComDayCqReplicationImplTransportHttp - 
	e.POST("/system/console/configMgr/com.day.cq.replication.impl.transport.Http", c.ComDayCqReplicationImplTransportHttp)

	// ComDayCqReportingImplCacheCacheImpl - 
	e.POST("/system/console/configMgr/com.day.cq.reporting.impl.cache.CacheImpl", c.ComDayCqReportingImplCacheCacheImpl)

	// ComDayCqReportingImplConfigServiceImpl - 
	e.POST("/system/console/configMgr/com.day.cq.reporting.impl.ConfigServiceImpl", c.ComDayCqReportingImplConfigServiceImpl)

	// ComDayCqReportingImplRLogAnalyzer - 
	e.POST("/system/console/configMgr/com.day.cq.reporting.impl.RLogAnalyzer", c.ComDayCqReportingImplRLogAnalyzer)

	// ComDayCqRewriterLinkcheckerImplLinkCheckerImpl - 
	e.POST("/system/console/configMgr/com.day.cq.rewriter.linkchecker.impl.LinkCheckerImpl", c.ComDayCqRewriterLinkcheckerImplLinkCheckerImpl)

	// ComDayCqRewriterLinkcheckerImplLinkCheckerTask - 
	e.POST("/system/console/configMgr/com.day.cq.rewriter.linkchecker.impl.LinkCheckerTask", c.ComDayCqRewriterLinkcheckerImplLinkCheckerTask)

	// ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactory - 
	e.POST("/system/console/configMgr/com.day.cq.rewriter.linkchecker.impl.LinkCheckerTransformerFactory", c.ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactory)

	// ComDayCqRewriterLinkcheckerImplLinkInfoStorageImpl - 
	e.POST("/system/console/configMgr/com.day.cq.rewriter.linkchecker.impl.LinkInfoStorageImpl", c.ComDayCqRewriterLinkcheckerImplLinkInfoStorageImpl)

	// ComDayCqRewriterProcessorImplHtmlParserFactory - 
	e.POST("/system/console/configMgr/com.day.cq.rewriter.processor.impl.HtmlParserFactory", c.ComDayCqRewriterProcessorImplHtmlParserFactory)

	// ComDayCqSearchImplBuilderQueryBuilderImpl - 
	e.POST("/system/console/configMgr/com.day.cq.search.impl.builder.QueryBuilderImpl", c.ComDayCqSearchImplBuilderQueryBuilderImpl)

	// ComDayCqSearchSuggestImplSuggestionIndexManagerImpl - 
	e.POST("/system/console/configMgr/com.day.cq.search.suggest.impl.SuggestionIndexManagerImpl", c.ComDayCqSearchSuggestImplSuggestionIndexManagerImpl)

	// ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandler - 
	e.POST("/system/console/configMgr/com.day.cq.searchpromote.impl.PublishSearchPromoteConfigHandler", c.ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandler)

	// ComDayCqSearchpromoteImplSearchPromoteServiceImpl - 
	e.POST("/system/console/configMgr/com.day.cq.searchpromote.impl.SearchPromoteServiceImpl", c.ComDayCqSearchpromoteImplSearchPromoteServiceImpl)

	// ComDayCqSecurityACLSetup - 
	e.POST("/system/console/configMgr/com.day.cq.security.ACLSetup", c.ComDayCqSecurityACLSetup)

	// ComDayCqStatisticsImplStatisticsServiceImpl - 
	e.POST("/system/console/configMgr/com.day.cq.statistics.impl.StatisticsServiceImpl", c.ComDayCqStatisticsImplStatisticsServiceImpl)

	// ComDayCqTaggingImplJcrTagManagerFactoryImpl - 
	e.POST("/system/console/configMgr/com.day.cq.tagging.impl.JcrTagManagerFactoryImpl", c.ComDayCqTaggingImplJcrTagManagerFactoryImpl)

	// ComDayCqTaggingImplSearchTagPredicateEvaluator - 
	e.POST("/system/console/configMgr/com.day.cq.tagging.impl.search.TagPredicateEvaluator", c.ComDayCqTaggingImplSearchTagPredicateEvaluator)

	// ComDayCqTaggingImplTagGarbageCollector - 
	e.POST("/system/console/configMgr/com.day.cq.tagging.impl.TagGarbageCollector", c.ComDayCqTaggingImplTagGarbageCollector)

	// ComDayCqWcmContentsyncImplHandlerPagesUpdateHandler - 
	e.POST("/system/console/configMgr/com.day.cq.wcm.contentsync.impl.handler.PagesUpdateHandler", c.ComDayCqWcmContentsyncImplHandlerPagesUpdateHandler)

	// ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactor - 
	e.POST("/system/console/configMgr/com.day.cq.wcm.contentsync.impl.rewriter.PathRewriterTransformerFactory", c.ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactor)

	// ComDayCqWcmCoreImplAuthoringUIModeServiceImpl - 
	e.POST("/system/console/configMgr/com.day.cq.wcm.core.impl.AuthoringUIModeServiceImpl", c.ComDayCqWcmCoreImplAuthoringUIModeServiceImpl)

	// ComDayCqWcmCoreImplCommandsWCMCommandServlet - 
	e.POST("/system/console/configMgr/com.day.cq.wcm.core.impl.commands.WCMCommandServlet", c.ComDayCqWcmCoreImplCommandsWCMCommandServlet)

	// ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImpl - 
	e.POST("/system/console/configMgr/com.day.cq.wcm.core.impl.devicedetection.DeviceIdentificationModeImpl", c.ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImpl)

	// ComDayCqWcmCoreImplEventPageEventAuditListener - 
	e.POST("/system/console/configMgr/com.day.cq.wcm.core.impl.event.PageEventAuditListener", c.ComDayCqWcmCoreImplEventPageEventAuditListener)

	// ComDayCqWcmCoreImplEventPagePostProcessor - 
	e.POST("/system/console/configMgr/com.day.cq.wcm.core.impl.event.PagePostProcessor", c.ComDayCqWcmCoreImplEventPagePostProcessor)

	// ComDayCqWcmCoreImplEventRepositoryChangeEventListener - 
	e.POST("/system/console/configMgr/com.day.cq.wcm.core.impl.event.RepositoryChangeEventListener", c.ComDayCqWcmCoreImplEventRepositoryChangeEventListener)

	// ComDayCqWcmCoreImplEventTemplatePostProcessor - 
	e.POST("/system/console/configMgr/com.day.cq.wcm.core.impl.event.TemplatePostProcessor", c.ComDayCqWcmCoreImplEventTemplatePostProcessor)

	// ComDayCqWcmCoreImplLanguageManagerImpl - 
	e.POST("/system/console/configMgr/com.day.cq.wcm.core.impl.LanguageManagerImpl", c.ComDayCqWcmCoreImplLanguageManagerImpl)

	// ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImpl - 
	e.POST("/system/console/configMgr/com.day.cq.wcm.core.impl.LinkCheckerConfigurationFactoryImpl", c.ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImpl)

	// ComDayCqWcmCoreImplPagePageInfoAggregatorImpl - 
	e.POST("/system/console/configMgr/com.day.cq.wcm.core.impl.page.PageInfoAggregatorImpl", c.ComDayCqWcmCoreImplPagePageInfoAggregatorImpl)

	// ComDayCqWcmCoreImplPagePageManagerFactoryImpl - 
	e.POST("/system/console/configMgr/com.day.cq.wcm.core.impl.page.PageManagerFactoryImpl", c.ComDayCqWcmCoreImplPagePageManagerFactoryImpl)

	// ComDayCqWcmCoreImplReferencesContentContentReferenceConfig - 
	e.POST("/system/console/configMgr/com.day.cq.wcm.core.impl.references.content.ContentReferenceConfig", c.ComDayCqWcmCoreImplReferencesContentContentReferenceConfig)

	// ComDayCqWcmCoreImplServletsContentfinderAssetViewHandler - 
	e.POST("/system/console/configMgr/com.day.cq.wcm.core.impl.servlets.contentfinder.AssetViewHandler", c.ComDayCqWcmCoreImplServletsContentfinderAssetViewHandler)

	// ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVie - 
	e.POST("/system/console/configMgr/com.day.cq.wcm.core.impl.servlets.contentfinder.connector.ConnectorViewHandler", c.ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVie)

	// ComDayCqWcmCoreImplServletsContentfinderPageViewHandler - 
	e.POST("/system/console/configMgr/com.day.cq.wcm.core.impl.servlets.contentfinder.PageViewHandler", c.ComDayCqWcmCoreImplServletsContentfinderPageViewHandler)

	// ComDayCqWcmCoreImplServletsFindReplaceServlet - 
	e.POST("/system/console/configMgr/com.day.cq.wcm.core.impl.servlets.FindReplaceServlet", c.ComDayCqWcmCoreImplServletsFindReplaceServlet)

	// ComDayCqWcmCoreImplServletsReferenceSearchServlet - 
	e.POST("/system/console/configMgr/com.day.cq.wcm.core.impl.servlets.ReferenceSearchServlet", c.ComDayCqWcmCoreImplServletsReferenceSearchServlet)

	// ComDayCqWcmCoreImplServletsThumbnailServlet - 
	e.POST("/system/console/configMgr/com.day.cq.wcm.core.impl.servlets.ThumbnailServlet", c.ComDayCqWcmCoreImplServletsThumbnailServlet)

	// ComDayCqWcmCoreImplUtilsDefaultPageNameValidator - 
	e.POST("/system/console/configMgr/com.day.cq.wcm.core.impl.utils.DefaultPageNameValidator", c.ComDayCqWcmCoreImplUtilsDefaultPageNameValidator)

	// ComDayCqWcmCoreImplVariantsPageVariantsProviderImpl - 
	e.POST("/system/console/configMgr/com.day.cq.wcm.core.impl.variants.PageVariantsProviderImpl", c.ComDayCqWcmCoreImplVariantsPageVariantsProviderImpl)

	// ComDayCqWcmCoreImplVersionManagerImpl - 
	e.POST("/system/console/configMgr/com.day.cq.wcm.core.impl.VersionManagerImpl", c.ComDayCqWcmCoreImplVersionManagerImpl)

	// ComDayCqWcmCoreImplVersionPurgeTask - 
	e.POST("/system/console/configMgr/com.day.cq.wcm.core.impl.VersionPurgeTask", c.ComDayCqWcmCoreImplVersionPurgeTask)

	// ComDayCqWcmCoreImplWCMDebugFilter - 
	e.POST("/system/console/configMgr/com.day.cq.wcm.core.impl.WCMDebugFilter", c.ComDayCqWcmCoreImplWCMDebugFilter)

	// ComDayCqWcmCoreImplWCMDeveloperModeFilter - 
	e.POST("/system/console/configMgr/com.day.cq.wcm.core.impl.WCMDeveloperModeFilter", c.ComDayCqWcmCoreImplWCMDeveloperModeFilter)

	// ComDayCqWcmCoreImplWarpTimeWarpFilter - 
	e.POST("/system/console/configMgr/com.day.cq.wcm.core.impl.warp.TimeWarpFilter", c.ComDayCqWcmCoreImplWarpTimeWarpFilter)

	// ComDayCqWcmCoreMvtMVTStatisticsImpl - 
	e.POST("/system/console/configMgr/com.day.cq.wcm.core.mvt.MVTStatisticsImpl", c.ComDayCqWcmCoreMvtMVTStatisticsImpl)

	// ComDayCqWcmCoreStatsPageViewStatisticsImpl - 
	e.POST("/system/console/configMgr/com.day.cq.wcm.core.stats.PageViewStatisticsImpl", c.ComDayCqWcmCoreStatsPageViewStatisticsImpl)

	// ComDayCqWcmCoreWCMRequestFilter - 
	e.POST("/system/console/configMgr/com.day.cq.wcm.core.WCMRequestFilter", c.ComDayCqWcmCoreWCMRequestFilter)

	// ComDayCqWcmDesignimporterDesignPackageImporter - 
	e.POST("/system/console/configMgr/com.day.cq.wcm.designimporter.DesignPackageImporter", c.ComDayCqWcmDesignimporterDesignPackageImporter)

	// ComDayCqWcmDesignimporterImplCanvasBuilderImpl - 
	e.POST("/system/console/configMgr/com.day.cq.wcm.designimporter.impl.CanvasBuilderImpl", c.ComDayCqWcmDesignimporterImplCanvasBuilderImpl)

	// ComDayCqWcmDesignimporterImplCanvasPageDeleteHandler - 
	e.POST("/system/console/configMgr/com.day.cq.wcm.designimporter.impl.CanvasPageDeleteHandler", c.ComDayCqWcmDesignimporterImplCanvasPageDeleteHandler)

	// ComDayCqWcmDesignimporterImplEntryPreprocessorImpl - 
	e.POST("/system/console/configMgr/com.day.cq.wcm.designimporter.impl.EntryPreprocessorImpl", c.ComDayCqWcmDesignimporterImplEntryPreprocessorImpl)

	// ComDayCqWcmDesignimporterImplMobileCanvasBuilderImpl - 
	e.POST("/system/console/configMgr/com.day.cq.wcm.designimporter.impl.MobileCanvasBuilderImpl", c.ComDayCqWcmDesignimporterImplMobileCanvasBuilderImpl)

	// ComDayCqWcmDesignimporterParserTaghandlersFactoryCanvasCompone - 
	e.POST("/system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.CanvasComponentTagHandlerFactory", c.ComDayCqWcmDesignimporterParserTaghandlersFactoryCanvasCompone)

	// ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultCompon - 
	e.POST("/system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.DefaultComponentTagHandlerFactory", c.ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultCompon)

	// ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultTagHan - 
	e.POST("/system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.DefaultTagHandlerFactory", c.ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultTagHan)

	// ComDayCqWcmDesignimporterParserTaghandlersFactoryHeadTagHandle - 
	e.POST("/system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.HeadTagHandlerFactory", c.ComDayCqWcmDesignimporterParserTaghandlersFactoryHeadTagHandle)

	// ComDayCqWcmDesignimporterParserTaghandlersFactoryIFrameTagHand - 
	e.POST("/system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.IFrameTagHandlerFactory", c.ComDayCqWcmDesignimporterParserTaghandlersFactoryIFrameTagHand)

	// ComDayCqWcmDesignimporterParserTaghandlersFactoryImageComponen - 
	e.POST("/system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.ImageComponentTagHandlerFactory", c.ComDayCqWcmDesignimporterParserTaghandlersFactoryImageComponen)

	// ComDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandler - 
	e.POST("/system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.ImgTagHandlerFactory", c.ComDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandler)

	// ComDayCqWcmDesignimporterParserTaghandlersFactoryInlineScriptT - 
	e.POST("/system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.InlineScriptTagHandlerFactory", c.ComDayCqWcmDesignimporterParserTaghandlersFactoryInlineScriptT)

	// ComDayCqWcmDesignimporterParserTaghandlersFactoryLinkTagHandle - 
	e.POST("/system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.LinkTagHandlerFactory", c.ComDayCqWcmDesignimporterParserTaghandlersFactoryLinkTagHandle)

	// ComDayCqWcmDesignimporterParserTaghandlersFactoryMetaTagHandle - 
	e.POST("/system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.MetaTagHandlerFactory", c.ComDayCqWcmDesignimporterParserTaghandlersFactoryMetaTagHandle)

	// ComDayCqWcmDesignimporterParserTaghandlersFactoryNonScriptTagH - 
	e.POST("/system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.NonScriptTagHandlerFactory", c.ComDayCqWcmDesignimporterParserTaghandlersFactoryNonScriptTagH)

	// ComDayCqWcmDesignimporterParserTaghandlersFactoryParsysCompone - 
	e.POST("/system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.ParsysComponentTagHandlerFactory", c.ComDayCqWcmDesignimporterParserTaghandlersFactoryParsysCompone)

	// ComDayCqWcmDesignimporterParserTaghandlersFactoryScriptTagHand - 
	e.POST("/system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.ScriptTagHandlerFactory", c.ComDayCqWcmDesignimporterParserTaghandlersFactoryScriptTagHand)

	// ComDayCqWcmDesignimporterParserTaghandlersFactoryStyleTagHandl - 
	e.POST("/system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.StyleTagHandlerFactory", c.ComDayCqWcmDesignimporterParserTaghandlersFactoryStyleTagHandl)

	// ComDayCqWcmDesignimporterParserTaghandlersFactoryTextComponent - 
	e.POST("/system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.TextComponentTagHandlerFactory", c.ComDayCqWcmDesignimporterParserTaghandlersFactoryTextComponent)

	// ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleComponen - 
	e.POST("/system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.TitleComponentTagHandlerFactory", c.ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleComponen)

	// ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleTagHandl - 
	e.POST("/system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.TitleTagHandlerFactory", c.ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleTagHandl)

	// ComDayCqWcmFoundationFormsImplFormChooserServlet - 
	e.POST("/system/console/configMgr/com.day.cq.wcm.foundation.forms.impl.FormChooserServlet", c.ComDayCqWcmFoundationFormsImplFormChooserServlet)

	// ComDayCqWcmFoundationFormsImplFormParagraphPostProcessor - 
	e.POST("/system/console/configMgr/com.day.cq.wcm.foundation.forms.impl.FormParagraphPostProcessor", c.ComDayCqWcmFoundationFormsImplFormParagraphPostProcessor)

	// ComDayCqWcmFoundationFormsImplFormsHandlingServlet - 
	e.POST("/system/console/configMgr/com.day.cq.wcm.foundation.forms.impl.FormsHandlingServlet", c.ComDayCqWcmFoundationFormsImplFormsHandlingServlet)

	// ComDayCqWcmFoundationFormsImplMailServlet - 
	e.POST("/system/console/configMgr/com.day.cq.wcm.foundation.forms.impl.MailServlet", c.ComDayCqWcmFoundationFormsImplMailServlet)

	// ComDayCqWcmFoundationImplAdaptiveImageComponentServlet - 
	e.POST("/system/console/configMgr/com.day.cq.wcm.foundation.impl.AdaptiveImageComponentServlet", c.ComDayCqWcmFoundationImplAdaptiveImageComponentServlet)

	// ComDayCqWcmFoundationImplHTTPAuthHandler - 
	e.POST("/system/console/configMgr/com.day.cq.wcm.foundation.impl.HTTPAuthHandler", c.ComDayCqWcmFoundationImplHTTPAuthHandler)

	// ComDayCqWcmFoundationImplPageImpressionsTracker - 
	e.POST("/system/console/configMgr/com.day.cq.wcm.foundation.impl.PageImpressionsTracker", c.ComDayCqWcmFoundationImplPageImpressionsTracker)

	// ComDayCqWcmFoundationImplPageRedirectServlet - 
	e.POST("/system/console/configMgr/com.day.cq.wcm.foundation.impl.PageRedirectServlet", c.ComDayCqWcmFoundationImplPageRedirectServlet)

	// ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklist - 
	e.POST("/system/console/configMgr/com.day.cq.wcm.foundation.security.impl.DefaultAttachmentTypeBlacklistService", c.ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklist)

	// ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImpl - 
	e.POST("/system/console/configMgr/com.day.cq.wcm.foundation.security.impl.SaferSlingPostValidatorImpl", c.ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImpl)

	// ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactory - 
	e.POST("/system/console/configMgr/com.day.cq.wcm.mobile.core.impl.device.DeviceInfoTransformerFactory", c.ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactory)

	// ComDayCqWcmMobileCoreImplRedirectRedirectFilter - 
	e.POST("/system/console/configMgr/com.day.cq.wcm.mobile.core.impl.redirect.RedirectFilter", c.ComDayCqWcmMobileCoreImplRedirectRedirectFilter)

	// ComDayCqWcmMsmImplActionsContentCopyActionFactory - 
	e.POST("/system/console/configMgr/com.day.cq.wcm.msm.impl.actions.ContentCopyActionFactory", c.ComDayCqWcmMsmImplActionsContentCopyActionFactory)

	// ComDayCqWcmMsmImplActionsContentDeleteActionFactory - 
	e.POST("/system/console/configMgr/com.day.cq.wcm.msm.impl.actions.ContentDeleteActionFactory", c.ComDayCqWcmMsmImplActionsContentDeleteActionFactory)

	// ComDayCqWcmMsmImplActionsContentUpdateActionFactory - 
	e.POST("/system/console/configMgr/com.day.cq.wcm.msm.impl.actions.ContentUpdateActionFactory", c.ComDayCqWcmMsmImplActionsContentUpdateActionFactory)

	// ComDayCqWcmMsmImplActionsOrderChildrenActionFactory - 
	e.POST("/system/console/configMgr/com.day.cq.wcm.msm.impl.actions.OrderChildrenActionFactory", c.ComDayCqWcmMsmImplActionsOrderChildrenActionFactory)

	// ComDayCqWcmMsmImplActionsPageMoveActionFactory - 
	e.POST("/system/console/configMgr/com.day.cq.wcm.msm.impl.actions.PageMoveActionFactory", c.ComDayCqWcmMsmImplActionsPageMoveActionFactory)

	// ComDayCqWcmMsmImplActionsReferencesUpdateActionFactory - 
	e.POST("/system/console/configMgr/com.day.cq.wcm.msm.impl.actions.ReferencesUpdateActionFactory", c.ComDayCqWcmMsmImplActionsReferencesUpdateActionFactory)

	// ComDayCqWcmMsmImplActionsVersionCopyActionFactory - 
	e.POST("/system/console/configMgr/com.day.cq.wcm.msm.impl.actions.VersionCopyActionFactory", c.ComDayCqWcmMsmImplActionsVersionCopyActionFactory)

	// ComDayCqWcmMsmImplLiveRelationshipManagerImpl - 
	e.POST("/system/console/configMgr/com.day.cq.wcm.msm.impl.LiveRelationshipManagerImpl", c.ComDayCqWcmMsmImplLiveRelationshipManagerImpl)

	// ComDayCqWcmMsmImplRolloutManagerImpl - 
	e.POST("/system/console/configMgr/com.day.cq.wcm.msm.impl.RolloutManagerImpl", c.ComDayCqWcmMsmImplRolloutManagerImpl)

	// ComDayCqWcmMsmImplServletsAuditLogServlet - 
	e.POST("/system/console/configMgr/com.day.cq.wcm.msm.impl.servlets.AuditLogServlet", c.ComDayCqWcmMsmImplServletsAuditLogServlet)

	// ComDayCqWcmNotificationEmailImplEmailChannel - 
	e.POST("/system/console/configMgr/com.day.cq.wcm.notification.email.impl.EmailChannel", c.ComDayCqWcmNotificationEmailImplEmailChannel)

	// ComDayCqWcmNotificationImplNotificationManagerImpl - 
	e.POST("/system/console/configMgr/com.day.cq.wcm.notification.impl.NotificationManagerImpl", c.ComDayCqWcmNotificationImplNotificationManagerImpl)

	// ComDayCqWcmScriptingImplBVPManager - 
	e.POST("/system/console/configMgr/com.day.cq.wcm.scripting.impl.BVPManager", c.ComDayCqWcmScriptingImplBVPManager)

	// ComDayCqWcmUndoUndoConfig - 
	e.POST("/system/console/configMgr/com.day.cq.wcm.undo.UndoConfig", c.ComDayCqWcmUndoUndoConfig)

	// ComDayCqWcmWebservicesupportImplReplicationEventListener - 
	e.POST("/system/console/configMgr/com.day.cq.wcm.webservicesupport.impl.ReplicationEventListener", c.ComDayCqWcmWebservicesupportImplReplicationEventListener)

	// ComDayCqWcmWorkflowImplWcmWorkflowServiceImpl - 
	e.POST("/system/console/configMgr/com.day.cq.wcm.workflow.impl.WcmWorkflowServiceImpl", c.ComDayCqWcmWorkflowImplWcmWorkflowServiceImpl)

	// ComDayCqWcmWorkflowImplWorkflowPackageInfoProvider - 
	e.POST("/system/console/configMgr/com.day.cq.wcm.workflow.impl.WorkflowPackageInfoProvider", c.ComDayCqWcmWorkflowImplWorkflowPackageInfoProvider)

	// ComDayCqWidgetImplHtmlLibraryManagerImpl - 
	e.POST("/system/console/configMgr/com.day.cq.widget.impl.HtmlLibraryManagerImpl", c.ComDayCqWidgetImplHtmlLibraryManagerImpl)

	// ComDayCqWidgetImplWidgetExtensionProviderImpl - 
	e.POST("/system/console/configMgr/com.day.cq.widget.impl.WidgetExtensionProviderImpl", c.ComDayCqWidgetImplWidgetExtensionProviderImpl)

	// ComDayCqWorkflowImplEmailEMailNotificationService - 
	e.POST("/system/console/configMgr/com.day.cq.workflow.impl.email.EMailNotificationService", c.ComDayCqWorkflowImplEmailEMailNotificationService)

	// ComDayCqWorkflowImplEmailTaskEMailNotificationService - 
	e.POST("/system/console/configMgr/com.day.cq.workflow.impl.email.TaskEMailNotificationService", c.ComDayCqWorkflowImplEmailTaskEMailNotificationService)

	// ComDayCrxSecurityTokenImplImplTokenAuthenticationHandler - 
	e.POST("/system/console/configMgr/com.day.crx.security.token.impl.impl.TokenAuthenticationHandler", c.ComDayCrxSecurityTokenImplImplTokenAuthenticationHandler)

	// ComDayCrxSecurityTokenImplTokenCleanupTask - 
	e.POST("/system/console/configMgr/com.day.crx.security.token.impl.TokenCleanupTask", c.ComDayCrxSecurityTokenImplTokenCleanupTask)

	// GuideLocalizationService - 
	e.POST("/system/console/configMgr/Guide Localization Service", c.GuideLocalizationService)

	// MessagingUserComponentFactory - 
	e.POST("/system/console/configMgr/MessagingUserComponentFactory", c.MessagingUserComponentFactory)

	// OrgApacheAriesJmxFrameworkStateConfig - 
	e.POST("/system/console/configMgr/org.apache.aries.jmx.framework.StateConfig", c.OrgApacheAriesJmxFrameworkStateConfig)

	// OrgApacheFelixEventadminImplEventAdmin - 
	e.POST("/system/console/configMgr/org.apache.felix.eventadmin.impl.EventAdmin", c.OrgApacheFelixEventadminImplEventAdmin)

	// OrgApacheFelixHttp - 
	e.POST("/system/console/configMgr/org.apache.felix.http", c.OrgApacheFelixHttp)

	// OrgApacheFelixHttpSslfilterSslFilter - 
	e.POST("/system/console/configMgr/org.apache.felix.http.sslfilter.SslFilter", c.OrgApacheFelixHttpSslfilterSslFilter)

	// OrgApacheFelixJaasConfigurationFactory - 
	e.POST("/system/console/configMgr/org.apache.felix.jaas.Configuration.factory", c.OrgApacheFelixJaasConfigurationFactory)

	// OrgApacheFelixJaasConfigurationSpi - 
	e.POST("/system/console/configMgr/org.apache.felix.jaas.ConfigurationSpi", c.OrgApacheFelixJaasConfigurationSpi)

	// OrgApacheFelixScrScrService - 
	e.POST("/system/console/configMgr/org.apache.felix.scr.ScrService", c.OrgApacheFelixScrScrService)

	// OrgApacheFelixSystemreadyImplComponentsCheck - 
	e.POST("/system/console/configMgr/org.apache.felix.systemready.impl.ComponentsCheck", c.OrgApacheFelixSystemreadyImplComponentsCheck)

	// OrgApacheFelixSystemreadyImplFrameworkStartCheck - 
	e.POST("/system/console/configMgr/org.apache.felix.systemready.impl.FrameworkStartCheck", c.OrgApacheFelixSystemreadyImplFrameworkStartCheck)

	// OrgApacheFelixSystemreadyImplServicesCheck - 
	e.POST("/system/console/configMgr/org.apache.felix.systemready.impl.ServicesCheck", c.OrgApacheFelixSystemreadyImplServicesCheck)

	// OrgApacheFelixSystemreadyImplServletSystemAliveServlet - 
	e.POST("/system/console/configMgr/org.apache.felix.systemready.impl.servlet.SystemAliveServlet", c.OrgApacheFelixSystemreadyImplServletSystemAliveServlet)

	// OrgApacheFelixSystemreadyImplServletSystemReadyServlet - 
	e.POST("/system/console/configMgr/org.apache.felix.systemready.impl.servlet.SystemReadyServlet", c.OrgApacheFelixSystemreadyImplServletSystemReadyServlet)

	// OrgApacheFelixSystemreadySystemReadyMonitor - 
	e.POST("/system/console/configMgr/org.apache.felix.systemready.SystemReadyMonitor", c.OrgApacheFelixSystemreadySystemReadyMonitor)

	// OrgApacheFelixWebconsoleInternalServletOsgiManager - 
	e.POST("/system/console/configMgr/org.apache.felix.webconsole.internal.servlet.OsgiManager", c.OrgApacheFelixWebconsoleInternalServletOsgiManager)

	// OrgApacheFelixWebconsolePluginsEventInternalPluginServlet - 
	e.POST("/system/console/configMgr/org.apache.felix.webconsole.plugins.event.internal.PluginServlet", c.OrgApacheFelixWebconsolePluginsEventInternalPluginServlet)

	// OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCo - 
	e.POST("/system/console/configMgr/org.apache.felix.webconsole.plugins.memoryusage.internal.MemoryUsageConfigurator", c.OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCo)

	// OrgApacheHttpProxyconfigurator - 
	e.POST("/system/console/configMgr/org.apache.http.proxyconfigurator", c.OrgApacheHttpProxyconfigurator)

	// OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProvider - 
	e.POST("/system/console/configMgr/org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreTextProviderService", c.OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProvider)

	// OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStore - 
	e.POST("/system/console/configMgr/org.apache.jackrabbit.oak.plugins.blob.datastore.FileDataStore", c.OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStore)

	// OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreService - 
	e.POST("/system/console/configMgr/org.apache.jackrabbit.oak.plugins.document.DocumentNodeStoreService", c.OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreService)

	// OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePre - 
	e.POST("/system/console/configMgr/org.apache.jackrabbit.oak.plugins.document.DocumentNodeStoreServicePreset", c.OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePre)

	// OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCac - 
	e.POST("/system/console/configMgr/org.apache.jackrabbit.oak.plugins.document.secondary.SecondaryStoreCacheService", c.OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCac)

	// OrgApacheJackrabbitOakPluginsIndexAsyncIndexerService - 
	e.POST("/system/console/configMgr/org.apache.jackrabbit.oak.plugins.index.AsyncIndexerService", c.OrgApacheJackrabbitOakPluginsIndexAsyncIndexerService)

	// OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServ - 
	e.POST("/system/console/configMgr/org.apache.jackrabbit.oak.plugins.index.lucene.LuceneIndexProviderService", c.OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServ)

	// OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCo - 
	e.POST("/system/console/configMgr/org.apache.jackrabbit.oak.plugins.index.solr.osgi.EmbeddedSolrServerConfigurationProvider", c.OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCo)

	// OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServers - 
	e.POST("/system/console/configMgr/org.apache.jackrabbit.oak.plugins.index.solr.osgi.NodeStateSolrServersObserverService", c.OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServers)

	// OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfiguration - 
	e.POST("/system/console/configMgr/org.apache.jackrabbit.oak.plugins.index.solr.osgi.OakSolrConfigurationProviderService", c.OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfiguration)

	// OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConf - 
	e.POST("/system/console/configMgr/org.apache.jackrabbit.oak.plugins.index.solr.osgi.RemoteSolrServerConfigurationProvider", c.OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConf)

	// OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvid - 
	e.POST("/system/console/configMgr/org.apache.jackrabbit.oak.plugins.index.solr.osgi.SolrQueryIndexProviderService", c.OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvid)

	// OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSe - 
	e.POST("/system/console/configMgr/org.apache.jackrabbit.oak.plugins.index.solr.osgi.SolrServerProviderService", c.OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSe)

	// OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactory - 
	e.POST("/system/console/configMgr/org.apache.jackrabbit.oak.plugins.metric.StatisticsProviderFactory", c.OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactory)

	// OrgApacheJackrabbitOakPluginsObservationChangeCollectorProvider - 
	e.POST("/system/console/configMgr/org.apache.jackrabbit.oak.plugins.observation.ChangeCollectorProvider", c.OrgApacheJackrabbitOakPluginsObservationChangeCollectorProvider)

	// OrgApacheJackrabbitOakQueryQueryEngineSettingsService - 
	e.POST("/system/console/configMgr/org.apache.jackrabbit.oak.query.QueryEngineSettingsService", c.OrgApacheJackrabbitOakQueryQueryEngineSettingsService)

	// OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfig - 
	e.POST("/system/console/configMgr/org.apache.jackrabbit.oak.security.authentication.AuthenticationConfigurationImpl", c.OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfig)

	// OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdenti - 
	e.POST("/system/console/configMgr/org.apache.jackrabbit.oak.security.authentication.ldap.impl.LdapIdentityProvider", c.OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdenti)

	// OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfigura - 
	e.POST("/system/console/configMgr/org.apache.jackrabbit.oak.security.authentication.token.TokenConfigurationImpl", c.OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfigura)

	// OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigur - 
	e.POST("/system/console/configMgr/org.apache.jackrabbit.oak.security.authorization.AuthorizationConfigurationImpl", c.OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigur)

	// OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistrati - 
	e.POST("/system/console/configMgr/org.apache.jackrabbit.oak.security.internal.SecurityProviderRegistration", c.OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistrati)

	// OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeName - 
	e.POST("/system/console/configMgr/org.apache.jackrabbit.oak.security.user.RandomAuthorizableNodeName", c.OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeName)

	// OrgApacheJackrabbitOakSecurityUserUserConfigurationImpl - 
	e.POST("/system/console/configMgr/org.apache.jackrabbit.oak.security.user.UserConfigurationImpl", c.OrgApacheJackrabbitOakSecurityUserUserConfigurationImpl)

	// OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreService - 
	e.POST("/system/console/configMgr/org.apache.jackrabbit.oak.segment.azure.AzureSegmentStoreService", c.OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreService)

	// OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactory - 
	e.POST("/system/console/configMgr/org.apache.jackrabbit.oak.segment.SegmentNodeStoreFactory", c.OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactory)

	// OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorService - 
	e.POST("/system/console/configMgr/org.apache.jackrabbit.oak.segment.SegmentNodeStoreMonitorService", c.OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorService)

	// OrgApacheJackrabbitOakSegmentSegmentNodeStoreService - 
	e.POST("/system/console/configMgr/org.apache.jackrabbit.oak.segment.SegmentNodeStoreService", c.OrgApacheJackrabbitOakSegmentSegmentNodeStoreService)

	// OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreService - 
	e.POST("/system/console/configMgr/org.apache.jackrabbit.oak.segment.standby.store.StandbyStoreService", c.OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreService)

	// OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDe - 
	e.POST("/system/console/configMgr/org.apache.jackrabbit.oak.spi.security.authentication.external.impl.DefaultSyncHandler", c.OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDe)

	// OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplEx - 
	e.POST("/system/console/configMgr/org.apache.jackrabbit.oak.spi.security.authentication.external.impl.ExternalLoginModuleFactory", c.OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplEx)

	// OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPr - 
	e.POST("/system/console/configMgr/org.apache.jackrabbit.oak.spi.security.authentication.external.impl.principal.ExternalPrincipalConfiguration", c.OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPr)

	// OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfi - 
	e.POST("/system/console/configMgr/org.apache.jackrabbit.oak.spi.security.authorization.cug.impl.CugConfiguration", c.OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfi)

	// OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExclu - 
	e.POST("/system/console/configMgr/org.apache.jackrabbit.oak.spi.security.authorization.cug.impl.CugExcludeImpl", c.OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExclu)

	// OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizable - 
	e.POST("/system/console/configMgr/org.apache.jackrabbit.oak.spi.security.user.action.DefaultAuthorizableActionProvider", c.OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizable)

	// OrgApacheJackrabbitVaultPackagingImplPackagingImpl - 
	e.POST("/system/console/configMgr/org.apache.jackrabbit.vault.packaging.impl.PackagingImpl", c.OrgApacheJackrabbitVaultPackagingImplPackagingImpl)

	// OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistry - 
	e.POST("/system/console/configMgr/org.apache.jackrabbit.vault.packaging.registry.impl.FSPackageRegistry", c.OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistry)

	// OrgApacheSlingAuthCoreImplLogoutServlet - 
	e.POST("/system/console/configMgr/org.apache.sling.auth.core.impl.LogoutServlet", c.OrgApacheSlingAuthCoreImplLogoutServlet)

	// OrgApacheSlingCaconfigImplConfigurationBindingsValueProvider - 
	e.POST("/system/console/configMgr/org.apache.sling.caconfig.impl.ConfigurationBindingsValueProvider", c.OrgApacheSlingCaconfigImplConfigurationBindingsValueProvider)

	// OrgApacheSlingCaconfigImplConfigurationResolverImpl - 
	e.POST("/system/console/configMgr/org.apache.sling.caconfig.impl.ConfigurationResolverImpl", c.OrgApacheSlingCaconfigImplConfigurationResolverImpl)

	// OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStra - 
	e.POST("/system/console/configMgr/org.apache.sling.caconfig.impl.def.DefaultConfigurationInheritanceStrategy", c.OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStra)

	// OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStra - 
	e.POST("/system/console/configMgr/org.apache.sling.caconfig.impl.def.DefaultConfigurationPersistenceStrategy", c.OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStra)

	// OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProvi - 
	e.POST("/system/console/configMgr/org.apache.sling.caconfig.impl.override.OsgiConfigurationOverrideProvider", c.OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProvi)

	// OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOve - 
	e.POST("/system/console/configMgr/org.apache.sling.caconfig.impl.override.SystemPropertyConfigurationOverrideProvider", c.OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOve)

	// OrgApacheSlingCaconfigManagementImplConfigurationManagementSetti - 
	e.POST("/system/console/configMgr/org.apache.sling.caconfig.management.impl.ConfigurationManagementSettingsImpl", c.OrgApacheSlingCaconfigManagementImplConfigurationManagementSetti)

	// OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResour - 
	e.POST("/system/console/configMgr/org.apache.sling.caconfig.resource.impl.def.DefaultConfigurationResourceResolvingStrategy", c.OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResour)

	// OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategy - 
	e.POST("/system/console/configMgr/org.apache.sling.caconfig.resource.impl.def.DefaultContextPathStrategy", c.OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategy)

	// OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParser - 
	e.POST("/system/console/configMgr/org.apache.sling.commons.html.internal.TagsoupHtmlParser", c.OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParser)

	// OrgApacheSlingCommonsLogLogManager - 
	e.POST("/system/console/configMgr/org.apache.sling.commons.log.LogManager", c.OrgApacheSlingCommonsLogLogManager)

	// OrgApacheSlingCommonsLogLogManagerFactoryConfig - 
	e.POST("/system/console/configMgr/org.apache.sling.commons.log.LogManager.factory.config", c.OrgApacheSlingCommonsLogLogManagerFactoryConfig)

	// OrgApacheSlingCommonsLogLogManagerFactoryWriter - 
	e.POST("/system/console/configMgr/org.apache.sling.commons.log.LogManager.factory.writer", c.OrgApacheSlingCommonsLogLogManagerFactoryWriter)

	// OrgApacheSlingCommonsMetricsInternalLogReporter - 
	e.POST("/system/console/configMgr/org.apache.sling.commons.metrics.internal.LogReporter", c.OrgApacheSlingCommonsMetricsInternalLogReporter)

	// OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporter - 
	e.POST("/system/console/configMgr/org.apache.sling.commons.metrics.rrd4j.impl.CodahaleMetricsReporter", c.OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporter)

	// OrgApacheSlingCommonsMimeInternalMimeTypeServiceImpl - 
	e.POST("/system/console/configMgr/org.apache.sling.commons.mime.internal.MimeTypeServiceImpl", c.OrgApacheSlingCommonsMimeInternalMimeTypeServiceImpl)

	// OrgApacheSlingCommonsSchedulerImplQuartzScheduler - 
	e.POST("/system/console/configMgr/org.apache.sling.commons.scheduler.impl.QuartzScheduler", c.OrgApacheSlingCommonsSchedulerImplQuartzScheduler)

	// OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheck - 
	e.POST("/system/console/configMgr/org.apache.sling.commons.scheduler.impl.SchedulerHealthCheck", c.OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheck)

	// OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactory - 
	e.POST("/system/console/configMgr/org.apache.sling.commons.threads.impl.DefaultThreadPool.factory", c.OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactory)

	// OrgApacheSlingDatasourceDataSourceFactory - 
	e.POST("/system/console/configMgr/org.apache.sling.datasource.DataSourceFactory", c.OrgApacheSlingDatasourceDataSourceFactory)

	// OrgApacheSlingDatasourceJNDIDataSourceFactory - 
	e.POST("/system/console/configMgr/org.apache.sling.datasource.JNDIDataSourceFactory", c.OrgApacheSlingDatasourceJNDIDataSourceFactory)

	// OrgApacheSlingDiscoveryOakConfig - 
	e.POST("/system/console/configMgr/org.apache.sling.discovery.oak.Config", c.OrgApacheSlingDiscoveryOakConfig)

	// OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheck - 
	e.POST("/system/console/configMgr/org.apache.sling.discovery.oak.SynchronizedClocksHealthCheck", c.OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheck)

	// OrgApacheSlingDistributionAgentImplForwardDistributionAgentFacto - 
	e.POST("/system/console/configMgr/org.apache.sling.distribution.agent.impl.ForwardDistributionAgentFactory", c.OrgApacheSlingDistributionAgentImplForwardDistributionAgentFacto)

	// OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestA - 
	e.POST("/system/console/configMgr/org.apache.sling.distribution.agent.impl.PrivilegeDistributionRequestAuthorizationStrategyFactory", c.OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestA)

	// OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactory - 
	e.POST("/system/console/configMgr/org.apache.sling.distribution.agent.impl.QueueDistributionAgentFactory", c.OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactory)

	// OrgApacheSlingDistributionAgentImplReverseDistributionAgentFacto - 
	e.POST("/system/console/configMgr/org.apache.sling.distribution.agent.impl.ReverseDistributionAgentFactory", c.OrgApacheSlingDistributionAgentImplReverseDistributionAgentFacto)

	// OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactor - 
	e.POST("/system/console/configMgr/org.apache.sling.distribution.agent.impl.SimpleDistributionAgentFactory", c.OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactor)

	// OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactory - 
	e.POST("/system/console/configMgr/org.apache.sling.distribution.agent.impl.SyncDistributionAgentFactory", c.OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactory)

	// OrgApacheSlingDistributionMonitorDistributionQueueHealthCheck - 
	e.POST("/system/console/configMgr/org.apache.sling.distribution.monitor.DistributionQueueHealthCheck", c.OrgApacheSlingDistributionMonitorDistributionQueueHealthCheck)

	// OrgApacheSlingDistributionPackagingImplExporterAgentDistributio - 
	e.POST("/system/console/configMgr/org.apache.sling.distribution.packaging.impl.exporter.AgentDistributionPackageExporterFactory", c.OrgApacheSlingDistributionPackagingImplExporterAgentDistributio)

	// OrgApacheSlingDistributionPackagingImplExporterLocalDistributio - 
	e.POST("/system/console/configMgr/org.apache.sling.distribution.packaging.impl.exporter.LocalDistributionPackageExporterFactory", c.OrgApacheSlingDistributionPackagingImplExporterLocalDistributio)

	// OrgApacheSlingDistributionPackagingImplExporterRemoteDistributi - 
	e.POST("/system/console/configMgr/org.apache.sling.distribution.packaging.impl.exporter.RemoteDistributionPackageExporterFactory", c.OrgApacheSlingDistributionPackagingImplExporterRemoteDistributi)

	// OrgApacheSlingDistributionPackagingImplImporterLocalDistributio - 
	e.POST("/system/console/configMgr/org.apache.sling.distribution.packaging.impl.importer.LocalDistributionPackageImporterFactory", c.OrgApacheSlingDistributionPackagingImplImporterLocalDistributio)

	// OrgApacheSlingDistributionPackagingImplImporterRemoteDistributi - 
	e.POST("/system/console/configMgr/org.apache.sling.distribution.packaging.impl.importer.RemoteDistributionPackageImporterFactory", c.OrgApacheSlingDistributionPackagingImplImporterRemoteDistributi)

	// OrgApacheSlingDistributionPackagingImplImporterRepositoryDistri - 
	e.POST("/system/console/configMgr/org.apache.sling.distribution.packaging.impl.importer.RepositoryDistributionPackageImporterFactory", c.OrgApacheSlingDistributionPackagingImplImporterRepositoryDistri)

	// OrgApacheSlingDistributionResourcesImplDistributionConfiguration - 
	e.POST("/system/console/configMgr/org.apache.sling.distribution.resources.impl.DistributionConfigurationResourceProviderFactory", c.OrgApacheSlingDistributionResourcesImplDistributionConfiguration)

	// OrgApacheSlingDistributionResourcesImplDistributionServiceResour - 
	e.POST("/system/console/configMgr/org.apache.sling.distribution.resources.impl.DistributionServiceResourceProviderFactory", c.OrgApacheSlingDistributionResourcesImplDistributionServiceResour)

	// OrgApacheSlingDistributionSerializationImplDistributionPackageBu - 
	e.POST("/system/console/configMgr/org.apache.sling.distribution.serialization.impl.DistributionPackageBuilderFactory", c.OrgApacheSlingDistributionSerializationImplDistributionPackageBu)

	// OrgApacheSlingDistributionSerializationImplVltVaultDistribution - 
	e.POST("/system/console/configMgr/org.apache.sling.distribution.serialization.impl.vlt.VaultDistributionPackageBuilderFactory", c.OrgApacheSlingDistributionSerializationImplVltVaultDistribution)

	// OrgApacheSlingDistributionTransportImplUserCredentialsDistributi - 
	e.POST("/system/console/configMgr/org.apache.sling.distribution.transport.impl.UserCredentialsDistributionTransportSecretProvider", c.OrgApacheSlingDistributionTransportImplUserCredentialsDistributi)

	// OrgApacheSlingDistributionTriggerImplDistributionEventDistribute - 
	e.POST("/system/console/configMgr/org.apache.sling.distribution.trigger.impl.DistributionEventDistributeDistributionTriggerFactory", c.OrgApacheSlingDistributionTriggerImplDistributionEventDistribute)

	// OrgApacheSlingDistributionTriggerImplJcrEventDistributionTrigger - 
	e.POST("/system/console/configMgr/org.apache.sling.distribution.trigger.impl.JcrEventDistributionTriggerFactory", c.OrgApacheSlingDistributionTriggerImplJcrEventDistributionTrigger)

	// OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributi - 
	e.POST("/system/console/configMgr/org.apache.sling.distribution.trigger.impl.PersistedJcrEventDistributionTriggerFactory", c.OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributi)

	// OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrig - 
	e.POST("/system/console/configMgr/org.apache.sling.distribution.trigger.impl.RemoteEventDistributionTriggerFactory", c.OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrig)

	// OrgApacheSlingDistributionTriggerImplResourceEventDistributionTr - 
	e.POST("/system/console/configMgr/org.apache.sling.distribution.trigger.impl.ResourceEventDistributionTriggerFactory", c.OrgApacheSlingDistributionTriggerImplResourceEventDistributionTr)

	// OrgApacheSlingDistributionTriggerImplScheduledDistributionTrigge - 
	e.POST("/system/console/configMgr/org.apache.sling.distribution.trigger.impl.ScheduledDistributionTriggerFactory", c.OrgApacheSlingDistributionTriggerImplScheduledDistributionTrigge)

	// OrgApacheSlingEngineImplAuthSlingAuthenticator - 
	e.POST("/system/console/configMgr/org.apache.sling.engine.impl.auth.SlingAuthenticator", c.OrgApacheSlingEngineImplAuthSlingAuthenticator)

	// OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilter - 
	e.POST("/system/console/configMgr/org.apache.sling.engine.impl.debug.RequestProgressTrackerLogFilter", c.OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilter)

	// OrgApacheSlingEngineImplLogRequestLogger - 
	e.POST("/system/console/configMgr/org.apache.sling.engine.impl.log.RequestLogger", c.OrgApacheSlingEngineImplLogRequestLogger)

	// OrgApacheSlingEngineImplLogRequestLoggerService - 
	e.POST("/system/console/configMgr/org.apache.sling.engine.impl.log.RequestLoggerService", c.OrgApacheSlingEngineImplLogRequestLoggerService)

	// OrgApacheSlingEngineImplSlingMainServlet - 
	e.POST("/system/console/configMgr/org.apache.sling.engine.impl.SlingMainServlet", c.OrgApacheSlingEngineImplSlingMainServlet)

	// OrgApacheSlingEngineParameters - 
	e.POST("/system/console/configMgr/org.apache.sling.engine.parameters", c.OrgApacheSlingEngineParameters)

	// OrgApacheSlingEventImplEventingThreadPool - 
	e.POST("/system/console/configMgr/org.apache.sling.event.impl.EventingThreadPool", c.OrgApacheSlingEventImplEventingThreadPool)

	// OrgApacheSlingEventImplJobsDefaultJobManager - 
	e.POST("/system/console/configMgr/org.apache.sling.event.impl.jobs.DefaultJobManager", c.OrgApacheSlingEventImplJobsDefaultJobManager)

	// OrgApacheSlingEventImplJobsJcrPersistenceHandler - 
	e.POST("/system/console/configMgr/org.apache.sling.event.impl.jobs.jcr.PersistenceHandler", c.OrgApacheSlingEventImplJobsJcrPersistenceHandler)

	// OrgApacheSlingEventImplJobsJobConsumerManager - 
	e.POST("/system/console/configMgr/org.apache.sling.event.impl.jobs.JobConsumerManager", c.OrgApacheSlingEventImplJobsJobConsumerManager)

	// OrgApacheSlingEventJobsQueueConfiguration - 
	e.POST("/system/console/configMgr/org.apache.sling.event.jobs.QueueConfiguration", c.OrgApacheSlingEventJobsQueueConfiguration)

	// OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingW - 
	e.POST("/system/console/configMgr/org.apache.sling.extensions.webconsolesecurityprovider.internal.SlingWebConsoleSecurityProvider", c.OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingW)

	// OrgApacheSlingFeatureflagsFeature - 
	e.POST("/system/console/configMgr/org.apache.sling.featureflags.Feature", c.OrgApacheSlingFeatureflagsFeature)

	// OrgApacheSlingFeatureflagsImplConfiguredFeature - 
	e.POST("/system/console/configMgr/org.apache.sling.featureflags.impl.ConfiguredFeature", c.OrgApacheSlingFeatureflagsImplConfiguredFeature)

	// OrgApacheSlingHapiImplHApiUtilImpl - 
	e.POST("/system/console/configMgr/org.apache.sling.hapi.impl.HApiUtilImpl", c.OrgApacheSlingHapiImplHApiUtilImpl)

	// OrgApacheSlingHcCoreImplCompositeHealthCheck - 
	e.POST("/system/console/configMgr/org.apache.sling.hc.core.impl.CompositeHealthCheck", c.OrgApacheSlingHcCoreImplCompositeHealthCheck)

	// OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImpl - 
	e.POST("/system/console/configMgr/org.apache.sling.hc.core.impl.executor.HealthCheckExecutorImpl", c.OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImpl)

	// OrgApacheSlingHcCoreImplJmxAttributeHealthCheck - 
	e.POST("/system/console/configMgr/org.apache.sling.hc.core.impl.JmxAttributeHealthCheck", c.OrgApacheSlingHcCoreImplJmxAttributeHealthCheck)

	// OrgApacheSlingHcCoreImplScriptableHealthCheck - 
	e.POST("/system/console/configMgr/org.apache.sling.hc.core.impl.ScriptableHealthCheck", c.OrgApacheSlingHcCoreImplScriptableHealthCheck)

	// OrgApacheSlingHcCoreImplServletHealthCheckExecutorServlet - 
	e.POST("/system/console/configMgr/org.apache.sling.hc.core.impl.servlet.HealthCheckExecutorServlet", c.OrgApacheSlingHcCoreImplServletHealthCheckExecutorServlet)

	// OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializer - 
	e.POST("/system/console/configMgr/org.apache.sling.hc.core.impl.servlet.ResultTxtVerboseSerializer", c.OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializer)

	// OrgApacheSlingI18nImplI18NFilter - 
	e.POST("/system/console/configMgr/org.apache.sling.i18n.impl.I18NFilter", c.OrgApacheSlingI18nImplI18NFilter)

	// OrgApacheSlingI18nImplJcrResourceBundleProvider - 
	e.POST("/system/console/configMgr/org.apache.sling.i18n.impl.JcrResourceBundleProvider", c.OrgApacheSlingI18nImplJcrResourceBundleProvider)

	// OrgApacheSlingInstallerProviderJcrImplJcrInstaller - 
	e.POST("/system/console/configMgr/org.apache.sling.installer.provider.jcr.impl.JcrInstaller", c.OrgApacheSlingInstallerProviderJcrImplJcrInstaller)

	// OrgApacheSlingJcrBaseInternalLoginAdminWhitelist - 
	e.POST("/system/console/configMgr/org.apache.sling.jcr.base.internal.LoginAdminWhitelist", c.OrgApacheSlingJcrBaseInternalLoginAdminWhitelist)

	// OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragment - 
	e.POST("/system/console/configMgr/org.apache.sling.jcr.base.internal.LoginAdminWhitelist.fragment", c.OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragment)

	// OrgApacheSlingJcrDavexImplServletsSlingDavExServlet - 
	e.POST("/system/console/configMgr/org.apache.sling.jcr.davex.impl.servlets.SlingDavExServlet", c.OrgApacheSlingJcrDavexImplServletsSlingDavExServlet)

	// OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupport - 
	e.POST("/system/console/configMgr/org.apache.sling.jcr.jackrabbit.server.JndiRegistrationSupport", c.OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupport)

	// OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupport - 
	e.POST("/system/console/configMgr/org.apache.sling.jcr.jackrabbit.server.RmiRegistrationSupport", c.OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupport)

	// OrgApacheSlingJcrRepoinitImplRepositoryInitializer - 
	e.POST("/system/console/configMgr/org.apache.sling.jcr.repoinit.impl.RepositoryInitializer", c.OrgApacheSlingJcrRepoinitImplRepositoryInitializer)

	// OrgApacheSlingJcrRepoinitRepositoryInitializer - 
	e.POST("/system/console/configMgr/org.apache.sling.jcr.repoinit.RepositoryInitializer", c.OrgApacheSlingJcrRepoinitRepositoryInitializer)

	// OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImpl - 
	e.POST("/system/console/configMgr/org.apache.sling.jcr.resource.internal.JcrResourceResolverFactoryImpl", c.OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImpl)

	// OrgApacheSlingJcrResourceInternalJcrSystemUserValidator - 
	e.POST("/system/console/configMgr/org.apache.sling.jcr.resource.internal.JcrSystemUserValidator", c.OrgApacheSlingJcrResourceInternalJcrSystemUserValidator)

	// OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactory - 
	e.POST("/system/console/configMgr/org.apache.sling.jcr.resourcesecurity.impl.ResourceAccessGateFactory", c.OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactory)

	// OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerService - 
	e.POST("/system/console/configMgr/org.apache.sling.jcr.webdav.impl.handler.DefaultHandlerService", c.OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerService)

	// OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServic - 
	e.POST("/system/console/configMgr/org.apache.sling.jcr.webdav.impl.handler.DirListingExportHandlerService", c.OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServic)

	// OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServlet - 
	e.POST("/system/console/configMgr/org.apache.sling.jcr.webdav.impl.servlets.SimpleWebDavServlet", c.OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServlet)

	// OrgApacheSlingJmxProviderImplJMXResourceProvider - 
	e.POST("/system/console/configMgr/org.apache.sling.jmx.provider.impl.JMXResourceProvider", c.OrgApacheSlingJmxProviderImplJMXResourceProvider)

	// OrgApacheSlingModelsImplModelAdapterFactory - 
	e.POST("/system/console/configMgr/org.apache.sling.models.impl.ModelAdapterFactory", c.OrgApacheSlingModelsImplModelAdapterFactory)

	// OrgApacheSlingModelsJacksonexporterImplResourceModuleProvider - 
	e.POST("/system/console/configMgr/org.apache.sling.models.jacksonexporter.impl.ResourceModuleProvider", c.OrgApacheSlingModelsJacksonexporterImplResourceModuleProvider)

	// OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFacto - 
	e.POST("/system/console/configMgr/org.apache.sling.resource.inventory.impl.ResourceInventoryPrinterFactory", c.OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFacto)

	// OrgApacheSlingResourcemergerImplMergedResourceProviderFactory - 
	e.POST("/system/console/configMgr/org.apache.sling.resourcemerger.impl.MergedResourceProviderFactory", c.OrgApacheSlingResourcemergerImplMergedResourceProviderFactory)

	// OrgApacheSlingResourcemergerPickerOverriding - 
	e.POST("/system/console/configMgr/org.apache.sling.resourcemerger.picker.overriding", c.OrgApacheSlingResourcemergerPickerOverriding)

	// OrgApacheSlingScriptingCoreImplScriptCacheImpl - 
	e.POST("/system/console/configMgr/org.apache.sling.scripting.core.impl.ScriptCacheImpl", c.OrgApacheSlingScriptingCoreImplScriptCacheImpl)

	// OrgApacheSlingScriptingCoreImplScriptingResourceResolverProvider - 
	e.POST("/system/console/configMgr/org.apache.sling.scripting.core.impl.ScriptingResourceResolverProviderImpl", c.OrgApacheSlingScriptingCoreImplScriptingResourceResolverProvider)

	// OrgApacheSlingScriptingJavaImplJavaScriptEngineFactory - 
	e.POST("/system/console/configMgr/org.apache.sling.scripting.java.impl.JavaScriptEngineFactory", c.OrgApacheSlingScriptingJavaImplJavaScriptEngineFactory)

	// OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFa - 
	e.POST("/system/console/configMgr/org.apache.sling.scripting.javascript.internal.RhinoJavaScriptEngineFactory", c.OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFa)

	// OrgApacheSlingScriptingJspJspScriptEngineFactory - 
	e.POST("/system/console/configMgr/org.apache.sling.scripting.jsp.JspScriptEngineFactory", c.OrgApacheSlingScriptingJspJspScriptEngineFactory)

	// OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProv - 
	e.POST("/system/console/configMgr/org.apache.sling.scripting.sightly.js.impl.jsapi.SlyBindingsValuesProvider", c.OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProv)

	// OrgApacheSlingSecurityImplContentDispositionFilter - 
	e.POST("/system/console/configMgr/org.apache.sling.security.impl.ContentDispositionFilter", c.OrgApacheSlingSecurityImplContentDispositionFilter)

	// OrgApacheSlingSecurityImplReferrerFilter - 
	e.POST("/system/console/configMgr/org.apache.sling.security.impl.ReferrerFilter", c.OrgApacheSlingSecurityImplReferrerFilter)

	// OrgApacheSlingServiceusermappingImplServiceUserMapperImpl - 
	e.POST("/system/console/configMgr/org.apache.sling.serviceusermapping.impl.ServiceUserMapperImpl", c.OrgApacheSlingServiceusermappingImplServiceUserMapperImpl)

	// OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmended - 
	e.POST("/system/console/configMgr/org.apache.sling.serviceusermapping.impl.ServiceUserMapperImpl.amended", c.OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmended)

	// OrgApacheSlingServletsGetDefaultGetServlet - 
	e.POST("/system/console/configMgr/org.apache.sling.servlets.get.DefaultGetServlet", c.OrgApacheSlingServletsGetDefaultGetServlet)

	// OrgApacheSlingServletsGetImplVersionVersionInfoServlet - 
	e.POST("/system/console/configMgr/org.apache.sling.servlets.get.impl.version.VersionInfoServlet", c.OrgApacheSlingServletsGetImplVersionVersionInfoServlet)

	// OrgApacheSlingServletsPostImplHelperChunkCleanUpTask - 
	e.POST("/system/console/configMgr/org.apache.sling.servlets.post.impl.helper.ChunkCleanUpTask", c.OrgApacheSlingServletsPostImplHelperChunkCleanUpTask)

	// OrgApacheSlingServletsPostImplSlingPostServlet - 
	e.POST("/system/console/configMgr/org.apache.sling.servlets.post.impl.SlingPostServlet", c.OrgApacheSlingServletsPostImplSlingPostServlet)

	// OrgApacheSlingServletsResolverSlingServletResolver - 
	e.POST("/system/console/configMgr/org.apache.sling.servlets.resolver.SlingServletResolver", c.OrgApacheSlingServletsResolverSlingServletResolver)

	// OrgApacheSlingSettingsImplSlingSettingsServiceImpl - 
	e.POST("/system/console/configMgr/org.apache.sling.settings.impl.SlingSettingsServiceImpl", c.OrgApacheSlingSettingsImplSlingSettingsServiceImpl)

	// OrgApacheSlingStartupfilterImplStartupFilterImpl - 
	e.POST("/system/console/configMgr/org.apache.sling.startupfilter.impl.StartupFilterImpl", c.OrgApacheSlingStartupfilterImplStartupFilterImpl)

	// OrgApacheSlingTenantInternalTenantProviderImpl - 
	e.POST("/system/console/configMgr/org.apache.sling.tenant.internal.TenantProviderImpl", c.OrgApacheSlingTenantInternalTenantProviderImpl)

	// OrgApacheSlingTracerInternalLogTracer - 
	e.POST("/system/console/configMgr/org.apache.sling.tracer.internal.LogTracer", c.OrgApacheSlingTracerInternalLogTracer)

	// OrgApacheSlingXssImplXSSFilterImpl - 
	e.POST("/system/console/configMgr/org.apache.sling.xss.impl.XSSFilterImpl", c.OrgApacheSlingXssImplXSSFilterImpl)


	// Start server
	e.Logger.Fatal(e.Start(":8080"))
}
