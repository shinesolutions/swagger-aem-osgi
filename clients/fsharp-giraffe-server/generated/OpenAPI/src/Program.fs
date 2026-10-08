namespace OpenAPI

open System
open System.Net.Http
open System.Security.Claims
open System.Threading
open Microsoft.AspNetCore
open Microsoft.AspNetCore.Builder
open Microsoft.AspNetCore.Hosting
open Microsoft.AspNetCore.Http
open Microsoft.AspNetCore.Http.Features
open Microsoft.AspNetCore.Authentication
open Microsoft.AspNetCore.Authentication.Cookies
open Microsoft.Extensions.Configuration
open Microsoft.Extensions.Logging
open Microsoft.Extensions.DependencyInjection
open FSharp.Control.Tasks.V2.ContextInsensitive
open System.Diagnostics
open Giraffe.GiraffeViewEngine
open AspNet.Security.ApiKey.Providers

open ConfigmgrApiHandlerParams
open Giraffe

module App =

  // ---------------------------------
  // Error handler
  // ---------------------------------

  let errorHandler (ex : Exception) (logger : ILogger) =
    logger.LogError(EventId(), ex, "An unhandled exception has occurred while executing the request.")
    clearResponse >=> setStatusCode 500 >=> text ex.Message

  // ---------------------------------
  // Web app
  // ---------------------------------

  let HttpGet = GET
  let HttpPost = POST
  let HttpPut = PUT
  let HttpDelete = DELETE

  let authFailure : HttpHandler =
    setStatusCode 401 >=> text "You must be authenticated to access this resource."

  let webApp =
    choose (CustomHandlers.handlers @ [
      HttpPost >=> route "/system/console/configMgr/Adaptive Form and Interactive Communication Web Channel Configuration" >=>  >=>  ConfigmgrApiHandler.AdaptiveFormAndInteractiveCommunicationWebChannelConfiguration;
      HttpPost >=> route "/system/console/configMgr/Adaptive Form and Interactive Communication Web Channel Theme Configuration" >=>  >=>  ConfigmgrApiHandler.AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigur;
      HttpPost >=> route "/system/console/configMgr/Analytics Component Query Cache Service" >=>  >=>  ConfigmgrApiHandler.AnalyticsComponentQueryCacheService;
      HttpPost >=> route "/system/console/configMgr/Apache Sling Health Check Result HTML Serializer" >=>  >=>  ConfigmgrApiHandler.ApacheSlingHealthCheckResultHTMLSerializer;
      HttpPost >=> route "/system/console/configMgr/com.adobe.aem.formsndocuments.config.AEMFormsManagerConfiguration" >=>  >=>  ConfigmgrApiHandler.ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfiguration;
      HttpPost >=> route "/system/console/configMgr/com.adobe.aem.transaction.core.impl.TransactionRecorder" >=>  >=>  ConfigmgrApiHandler.ComAdobeAemTransactionCoreImplTransactionRecorder;
      HttpPost >=> route "/system/console/configMgr/com.adobe.aem.upgrade.prechecks.hc.impl.DeprecateIndexesHC" >=>  >=>  ConfigmgrApiHandler.ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHC;
      HttpPost >=> route "/system/console/configMgr/com.adobe.aem.upgrade.prechecks.hc.impl.ReplicationAgentsDisabledHC" >=>  >=>  ConfigmgrApiHandler.ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHC;
      HttpPost >=> route "/system/console/configMgr/com.adobe.aem.upgrade.prechecks.mbean.impl.PreUpgradeTasksMBeanImpl" >=>  >=>  ConfigmgrApiHandler.ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImpl;
      HttpPost >=> route "/system/console/configMgr/com.adobe.aem.upgrade.prechecks.tasks.impl.ConsistencyCheckTaskImpl" >=>  >=>  ConfigmgrApiHandler.ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImpl;
      HttpPost >=> route "/system/console/configMgr/com.adobe.cq.account.api.AccountManagementService" >=>  >=>  ConfigmgrApiHandler.ComAdobeCqAccountApiAccountManagementService;
      HttpPost >=> route "/system/console/configMgr/com.adobe.cq.account.impl.AccountManagementServlet" >=>  >=>  ConfigmgrApiHandler.ComAdobeCqAccountImplAccountManagementServlet;
      HttpPost >=> route "/system/console/configMgr/com.adobe.cq.address.impl.location.LocationListServlet" >=>  >=>  ConfigmgrApiHandler.ComAdobeCqAddressImplLocationLocationListServlet;
      HttpPost >=> route "/system/console/configMgr/com.adobe.cq.audit.purge.Dam" >=>  >=>  ConfigmgrApiHandler.ComAdobeCqAuditPurgeDam;
      HttpPost >=> route "/system/console/configMgr/com.adobe.cq.audit.purge.Pages" >=>  >=>  ConfigmgrApiHandler.ComAdobeCqAuditPurgePages;
      HttpPost >=> route "/system/console/configMgr/com.adobe.cq.audit.purge.Replication" >=>  >=>  ConfigmgrApiHandler.ComAdobeCqAuditPurgeReplication;
      HttpPost >=> route "/system/console/configMgr/com.adobe.cq.cdn.rewriter.impl.AWSCloudFrontRewriter" >=>  >=>  ConfigmgrApiHandler.ComAdobeCqCdnRewriterImplAWSCloudFrontRewriter;
      HttpPost >=> route "/system/console/configMgr/com.adobe.cq.cdn.rewriter.impl.CDNConfigServiceImpl" >=>  >=>  ConfigmgrApiHandler.ComAdobeCqCdnRewriterImplCDNConfigServiceImpl;
      HttpPost >=> route "/system/console/configMgr/com.adobe.cq.cdn.rewriter.impl.CDNRewriter" >=>  >=>  ConfigmgrApiHandler.ComAdobeCqCdnRewriterImplCDNRewriter;
      HttpPost >=> route "/system/console/configMgr/com.adobe.cq.cloudconfig.core.impl.ConfigurationReplicationEventHandler" >=>  >=>  ConfigmgrApiHandler.ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandle;
      HttpPost >=> route "/system/console/configMgr/com.adobe.cq.commerce.impl.asset.DynamicImageHandler" >=>  >=>  ConfigmgrApiHandler.ComAdobeCqCommerceImplAssetDynamicImageHandler;
      HttpPost >=> route "/system/console/configMgr/com.adobe.cq.commerce.impl.asset.ProductAssetHandlerProviderImpl" >=>  >=>  ConfigmgrApiHandler.ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImpl;
      HttpPost >=> route "/system/console/configMgr/com.adobe.cq.commerce.impl.asset.StaticImageHandler" >=>  >=>  ConfigmgrApiHandler.ComAdobeCqCommerceImplAssetStaticImageHandler;
      HttpPost >=> route "/system/console/configMgr/com.adobe.cq.commerce.impl.asset.VideoHandler" >=>  >=>  ConfigmgrApiHandler.ComAdobeCqCommerceImplAssetVideoHandler;
      HttpPost >=> route "/system/console/configMgr/com.adobe.cq.commerce.impl.promotion.PromotionManagerImpl" >=>  >=>  ConfigmgrApiHandler.ComAdobeCqCommerceImplPromotionPromotionManagerImpl;
      HttpPost >=> route "/system/console/configMgr/com.adobe.cq.commerce.pim.impl.cataloggenerator.CatalogGeneratorImpl" >=>  >=>  ConfigmgrApiHandler.ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImpl;
      HttpPost >=> route "/system/console/configMgr/com.adobe.cq.commerce.pim.impl.PageEventListener" >=>  >=>  ConfigmgrApiHandler.ComAdobeCqCommercePimImplPageEventListener;
      HttpPost >=> route "/system/console/configMgr/com.adobe.cq.commerce.pim.impl.productfeed.ProductFeedServiceImpl" >=>  >=>  ConfigmgrApiHandler.ComAdobeCqCommercePimImplProductfeedProductFeedServiceImpl;
      HttpPost >=> route "/system/console/configMgr/com.adobe.cq.contentinsight.impl.ReportingServicesSettingsProvider" >=>  >=>  ConfigmgrApiHandler.ComAdobeCqContentinsightImplReportingServicesSettingsProvider;
      HttpPost >=> route "/system/console/configMgr/com.adobe.cq.contentinsight.impl.servlets.BrightEdgeProxyServlet" >=>  >=>  ConfigmgrApiHandler.ComAdobeCqContentinsightImplServletsBrightEdgeProxyServlet;
      HttpPost >=> route "/system/console/configMgr/com.adobe.cq.contentinsight.impl.servlets.ReportingServicesProxyServlet" >=>  >=>  ConfigmgrApiHandler.ComAdobeCqContentinsightImplServletsReportingServicesProxyServle;
      HttpPost >=> route "/system/console/configMgr/com.adobe.cq.dam.cfm.impl.component.ComponentConfigImpl" >=>  >=>  ConfigmgrApiHandler.ComAdobeCqDamCfmImplComponentComponentConfigImpl;
      HttpPost >=> route "/system/console/configMgr/com.adobe.cq.dam.cfm.impl.conf.FeatureConfigImpl" >=>  >=>  ConfigmgrApiHandler.ComAdobeCqDamCfmImplConfFeatureConfigImpl;
      HttpPost >=> route "/system/console/configMgr/com.adobe.cq.dam.cfm.impl.content.rewriter.AssetProcessor" >=>  >=>  ConfigmgrApiHandler.ComAdobeCqDamCfmImplContentRewriterAssetProcessor;
      HttpPost >=> route "/system/console/configMgr/com.adobe.cq.dam.cfm.impl.content.rewriter.ParRangeFilter" >=>  >=>  ConfigmgrApiHandler.ComAdobeCqDamCfmImplContentRewriterParRangeFilter;
      HttpPost >=> route "/system/console/configMgr/com.adobe.cq.dam.cfm.impl.content.rewriter.PayloadFilter" >=>  >=>  ConfigmgrApiHandler.ComAdobeCqDamCfmImplContentRewriterPayloadFilter;
      HttpPost >=> route "/system/console/configMgr/com.adobe.cq.dam.dm.process.image.PTiffManagerImpl" >=>  >=>  ConfigmgrApiHandler.ComAdobeCqDamDmProcessImagePTiffManagerImpl;
      HttpPost >=> route "/system/console/configMgr/com.adobe.cq.dam.ips.impl.replication.trigger.ReplicateOnModifyWorker" >=>  >=>  ConfigmgrApiHandler.ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorker;
      HttpPost >=> route "/system/console/configMgr/com.adobe.cq.dam.mac.sync.helper.impl.MACSyncClientImpl" >=>  >=>  ConfigmgrApiHandler.ComAdobeCqDamMacSyncHelperImplMACSyncClientImpl;
      HttpPost >=> route "/system/console/configMgr/com.adobe.cq.dam.mac.sync.impl.DAMSyncServiceImpl" >=>  >=>  ConfigmgrApiHandler.ComAdobeCqDamMacSyncImplDAMSyncServiceImpl;
      HttpPost >=> route "/system/console/configMgr/com.adobe.cq.dam.processor.nui.impl.NuiAssetProcessor" >=>  >=>  ConfigmgrApiHandler.ComAdobeCqDamProcessorNuiImplNuiAssetProcessor;
      HttpPost >=> route "/system/console/configMgr/com.adobe.cq.dam.s7imaging.impl.is.ImageServerComponent" >=>  >=>  ConfigmgrApiHandler.ComAdobeCqDamS7imagingImplIsImageServerComponent;
      HttpPost >=> route "/system/console/configMgr/com.adobe.cq.dam.s7imaging.impl.ps.PlatformServerServlet" >=>  >=>  ConfigmgrApiHandler.ComAdobeCqDamS7imagingImplPsPlatformServerServlet;
      HttpPost >=> route "/system/console/configMgr/com.adobe.cq.dam.webdav.impl.io.AssetIOHandler" >=>  >=>  ConfigmgrApiHandler.ComAdobeCqDamWebdavImplIoAssetIOHandler;
      HttpPost >=> route "/system/console/configMgr/com.adobe.cq.dam.webdav.impl.io.DamWebdavVersionLinkingJob" >=>  >=>  ConfigmgrApiHandler.ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJob;
      HttpPost >=> route "/system/console/configMgr/com.adobe.cq.dam.webdav.impl.io.SpecialFilesHandler" >=>  >=>  ConfigmgrApiHandler.ComAdobeCqDamWebdavImplIoSpecialFilesHandler;
      HttpPost >=> route "/system/console/configMgr/com.adobe.cq.deserfw.impl.DeserializationFirewallImpl" >=>  >=>  ConfigmgrApiHandler.ComAdobeCqDeserfwImplDeserializationFirewallImpl;
      HttpPost >=> route "/system/console/configMgr/com.adobe.cq.dtm.impl.service.DTMWebServiceImpl" >=>  >=>  ConfigmgrApiHandler.ComAdobeCqDtmImplServiceDTMWebServiceImpl;
      HttpPost >=> route "/system/console/configMgr/com.adobe.cq.dtm.impl.servlets.DTMDeployHookServlet" >=>  >=>  ConfigmgrApiHandler.ComAdobeCqDtmImplServletsDTMDeployHookServlet;
      HttpPost >=> route "/system/console/configMgr/com.adobe.cq.dtm.reactor.impl.service.WebServiceImpl" >=>  >=>  ConfigmgrApiHandler.ComAdobeCqDtmReactorImplServiceWebServiceImpl;
      HttpPost >=> route "/system/console/configMgr/com.adobe.cq.experiencelog.impl.ExperienceLogConfigServlet" >=>  >=>  ConfigmgrApiHandler.ComAdobeCqExperiencelogImplExperienceLogConfigServlet;
      HttpPost >=> route "/system/console/configMgr/com.adobe.cq.hc.ContentPackagesHealthCheck" >=>  >=>  ConfigmgrApiHandler.ComAdobeCqHcContentPackagesHealthCheck;
      HttpPost >=> route "/system/console/configMgr/com.adobe.cq.history.impl.HistoryRequestFilter" >=>  >=>  ConfigmgrApiHandler.ComAdobeCqHistoryImplHistoryRequestFilter;
      HttpPost >=> route "/system/console/configMgr/com.adobe.cq.history.impl.HistoryServiceImpl" >=>  >=>  ConfigmgrApiHandler.ComAdobeCqHistoryImplHistoryServiceImpl;
      HttpPost >=> route "/system/console/configMgr/com.adobe.cq.inbox.impl.typeprovider.ItemTypeProvider" >=>  >=>  ConfigmgrApiHandler.ComAdobeCqInboxImplTypeproviderItemTypeProvider;
      HttpPost >=> route "/system/console/configMgr/com.adobe.cq.projects.impl.servlet.ProjectImageServlet" >=>  >=>  ConfigmgrApiHandler.ComAdobeCqProjectsImplServletProjectImageServlet;
      HttpPost >=> route "/system/console/configMgr/com.adobe.cq.projects.purge.Scheduler" >=>  >=>  ConfigmgrApiHandler.ComAdobeCqProjectsPurgeScheduler;
      HttpPost >=> route "/system/console/configMgr/com.adobe.cq.scheduled.exporter.impl.ScheduledExporterImpl" >=>  >=>  ConfigmgrApiHandler.ComAdobeCqScheduledExporterImplScheduledExporterImpl;
      HttpPost >=> route "/system/console/configMgr/com.adobe.cq.screens.analytics.impl.ScreensAnalyticsServiceImpl" >=>  >=>  ConfigmgrApiHandler.ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImpl;
      HttpPost >=> route "/system/console/configMgr/com.adobe.cq.screens.device.impl.DeviceService" >=>  >=>  ConfigmgrApiHandler.ComAdobeCqScreensDeviceImplDeviceService;
      HttpPost >=> route "/system/console/configMgr/com.adobe.cq.screens.device.registration.impl.RegistrationServiceImpl" >=>  >=>  ConfigmgrApiHandler.ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImpl;
      HttpPost >=> route "/system/console/configMgr/com.adobe.cq.screens.impl.handler.ChannelsUpdateHandler" >=>  >=>  ConfigmgrApiHandler.ComAdobeCqScreensImplHandlerChannelsUpdateHandler;
      HttpPost >=> route "/system/console/configMgr/com.adobe.cq.screens.impl.jobs.DistributedDevicesStatiUpdateJob" >=>  >=>  ConfigmgrApiHandler.ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJob;
      HttpPost >=> route "/system/console/configMgr/com.adobe.cq.screens.impl.remote.impl.DistributedHttpClientImpl" >=>  >=>  ConfigmgrApiHandler.ComAdobeCqScreensImplRemoteImplDistributedHttpClientImpl;
      HttpPost >=> route "/system/console/configMgr/com.adobe.cq.screens.impl.ScreensChannelPostProcessor" >=>  >=>  ConfigmgrApiHandler.ComAdobeCqScreensImplScreensChannelPostProcessor;
      HttpPost >=> route "/system/console/configMgr/com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl" >=>  >=>  ConfigmgrApiHandler.ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImpl;
      HttpPost >=> route "/system/console/configMgr/com.adobe.cq.screens.mq.activemq.impl.ArtemisJMSProvider" >=>  >=>  ConfigmgrApiHandler.ComAdobeCqScreensMqActivemqImplArtemisJMSProvider;
      HttpPost >=> route "/system/console/configMgr/com.adobe.cq.screens.offlinecontent.impl.BulkOfflineUpdateServiceImpl" >=>  >=>  ConfigmgrApiHandler.ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImpl;
      HttpPost >=> route "/system/console/configMgr/com.adobe.cq.screens.offlinecontent.impl.OfflineContentServiceImpl" >=>  >=>  ConfigmgrApiHandler.ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImpl;
      HttpPost >=> route "/system/console/configMgr/com.adobe.cq.screens.segmentation.impl.SegmentationFeatureFlag" >=>  >=>  ConfigmgrApiHandler.ComAdobeCqScreensSegmentationImplSegmentationFeatureFlag;
      HttpPost >=> route "/system/console/configMgr/com.adobe.cq.security.hc.bundles.impl.HtmlLibraryManagerConfigHealthCheck" >=>  >=>  ConfigmgrApiHandler.ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthCh;
      HttpPost >=> route "/system/console/configMgr/com.adobe.cq.security.hc.bundles.impl.WcmFilterHealthCheck" >=>  >=>  ConfigmgrApiHandler.ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheck;
      HttpPost >=> route "/system/console/configMgr/com.adobe.cq.security.hc.dispatcher.impl.DispatcherAccessHealthCheck" >=>  >=>  ConfigmgrApiHandler.ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheck;
      HttpPost >=> route "/system/console/configMgr/com.adobe.cq.security.hc.packages.impl.ExampleContentHealthCheck" >=>  >=>  ConfigmgrApiHandler.ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheck;
      HttpPost >=> route "/system/console/configMgr/com.adobe.cq.security.hc.webserver.impl.ClickjackingHealthCheck" >=>  >=>  ConfigmgrApiHandler.ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheck;
      HttpPost >=> route "/system/console/configMgr/com.adobe.cq.social.accountverification.impl.AccountManagementConfigImpl" >=>  >=>  ConfigmgrApiHandler.ComAdobeCqSocialAccountverificationImplAccountManagementConfigIm;
      HttpPost >=> route "/system/console/configMgr/com.adobe.cq.social.activitystreams.client.impl.SocialActivityComponentFactoryImpl" >=>  >=>  ConfigmgrApiHandler.ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponen;
      HttpPost >=> route "/system/console/configMgr/com.adobe.cq.social.activitystreams.client.impl.SocialActivityStreamComponentFactory" >=>  >=>  ConfigmgrApiHandler.ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCo;
      HttpPost >=> route "/system/console/configMgr/com.adobe.cq.social.activitystreams.listener.impl.EventListenerHandler" >=>  >=>  ConfigmgrApiHandler.ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandler;
      HttpPost >=> route "/system/console/configMgr/com.adobe.cq.social.activitystreams.listener.impl.ModerationEventExtension" >=>  >=>  ConfigmgrApiHandler.ComAdobeCqSocialActivitystreamsListenerImplModerationEventExten;
      HttpPost >=> route "/system/console/configMgr/com.adobe.cq.social.activitystreams.listener.impl.RatingEventActivitySuppressor" >=>  >=>  ConfigmgrApiHandler.ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivityS;
      HttpPost >=> route "/system/console/configMgr/com.adobe.cq.social.activitystreams.listener.impl.ResourceActivityStreamProviderFactory" >=>  >=>  ConfigmgrApiHandler.ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStre;
      HttpPost >=> route "/system/console/configMgr/com.adobe.cq.social.calendar.client.endpoints.impl.CalendarOperationsImpl" >=>  >=>  ConfigmgrApiHandler.ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsI;
      HttpPost >=> route "/system/console/configMgr/com.adobe.cq.social.calendar.client.operationextensions.EventAttachment" >=>  >=>  ConfigmgrApiHandler.ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmen;
      HttpPost >=> route "/system/console/configMgr/com.adobe.cq.social.calendar.servlets.TimeZoneServlet" >=>  >=>  ConfigmgrApiHandler.ComAdobeCqSocialCalendarServletsTimeZoneServlet;
      HttpPost >=> route "/system/console/configMgr/com.adobe.cq.social.commons.comments.endpoints.impl.CommentDeleteEventActivitySuppressor" >=>  >=>  ConfigmgrApiHandler.ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEvent;
      HttpPost >=> route "/system/console/configMgr/com.adobe.cq.social.commons.comments.endpoints.impl.CommentOperationService" >=>  >=>  ConfigmgrApiHandler.ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSe;
      HttpPost >=> route "/system/console/configMgr/com.adobe.cq.social.commons.comments.endpoints.impl.TranslationOperationService" >=>  >=>  ConfigmgrApiHandler.ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperati;
      HttpPost >=> route "/system/console/configMgr/com.adobe.cq.social.commons.comments.listing.impl.SearchCommentSocialComponentListProvider" >=>  >=>  ConfigmgrApiHandler.ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialC;
      HttpPost >=> route "/system/console/configMgr/com.adobe.cq.social.commons.comments.scheduler.impl.SearchScheduledPosts" >=>  >=>  ConfigmgrApiHandler.ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPos;
      HttpPost >=> route "/system/console/configMgr/com.adobe.cq.social.commons.cors.CORSAuthenticationFilter" >=>  >=>  ConfigmgrApiHandler.ComAdobeCqSocialCommonsCorsCORSAuthenticationFilter;
      HttpPost >=> route "/system/console/configMgr/com.adobe.cq.social.commons.emailreply.impl.AndroidEmailClientProvider" >=>  >=>  ConfigmgrApiHandler.ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProvider;
      HttpPost >=> route "/system/console/configMgr/com.adobe.cq.social.commons.emailreply.impl.CommentEmailBuilderImpl" >=>  >=>  ConfigmgrApiHandler.ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImpl;
      HttpPost >=> route "/system/console/configMgr/com.adobe.cq.social.commons.emailreply.impl.CommentEmailEventListener" >=>  >=>  ConfigmgrApiHandler.ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListener;
      HttpPost >=> route "/system/console/configMgr/com.adobe.cq.social.commons.emailreply.impl.CustomEmailClientProvider" >=>  >=>  ConfigmgrApiHandler.ComAdobeCqSocialCommonsEmailreplyImplCustomEmailClientProvider;
      HttpPost >=> route "/system/console/configMgr/com.adobe.cq.social.commons.emailreply.impl.EmailQuotedTextPatternsImpl" >=>  >=>  ConfigmgrApiHandler.ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImp;
      HttpPost >=> route "/system/console/configMgr/com.adobe.cq.social.commons.emailreply.impl.EmailReplyConfigurationImpl" >=>  >=>  ConfigmgrApiHandler.ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImp;
      HttpPost >=> route "/system/console/configMgr/com.adobe.cq.social.commons.emailreply.impl.EmailReplyImporter" >=>  >=>  ConfigmgrApiHandler.ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporter;
      HttpPost >=> route "/system/console/configMgr/com.adobe.cq.social.commons.emailreply.impl.GmailEmailClientProvider" >=>  >=>  ConfigmgrApiHandler.ComAdobeCqSocialCommonsEmailreplyImplGmailEmailClientProvider;
      HttpPost >=> route "/system/console/configMgr/com.adobe.cq.social.commons.emailreply.impl.IOSEmailClientProvider" >=>  >=>  ConfigmgrApiHandler.ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProvider;
      HttpPost >=> route "/system/console/configMgr/com.adobe.cq.social.commons.emailreply.impl.MacmailEmailClientProvider" >=>  >=>  ConfigmgrApiHandler.ComAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProvider;
      HttpPost >=> route "/system/console/configMgr/com.adobe.cq.social.commons.emailreply.impl.OutLookEmailClientProvider" >=>  >=>  ConfigmgrApiHandler.ComAdobeCqSocialCommonsEmailreplyImplOutLookEmailClientProvider;
      HttpPost >=> route "/system/console/configMgr/com.adobe.cq.social.commons.emailreply.impl.UnknownEmailClientProvider" >=>  >=>  ConfigmgrApiHandler.ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProvider;
      HttpPost >=> route "/system/console/configMgr/com.adobe.cq.social.commons.emailreply.impl.YahooEmailClientProvider" >=>  >=>  ConfigmgrApiHandler.ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProvider;
      HttpPost >=> route "/system/console/configMgr/com.adobe.cq.social.commons.maintainance.impl.DeleteTempUGCImageUploads" >=>  >=>  ConfigmgrApiHandler.ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUpload;
      HttpPost >=> route "/system/console/configMgr/com.adobe.cq.social.commons.ugclimiter.impl.UGCLimiterServiceImpl" >=>  >=>  ConfigmgrApiHandler.ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImpl;
      HttpPost >=> route "/system/console/configMgr/com.adobe.cq.social.commons.ugclimitsconfig.impl.CommunityUserUGCLimitsConfigImpl" >=>  >=>  ConfigmgrApiHandler.ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimit;
      HttpPost >=> route "/system/console/configMgr/com.adobe.cq.social.connect.oauth.impl.FacebookProviderImpl" >=>  >=>  ConfigmgrApiHandler.ComAdobeCqSocialConnectOauthImplFacebookProviderImpl;
      HttpPost >=> route "/system/console/configMgr/com.adobe.cq.social.connect.oauth.impl.SocialOAuthAuthenticationHandler" >=>  >=>  ConfigmgrApiHandler.ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandle;
      HttpPost >=> route "/system/console/configMgr/com.adobe.cq.social.connect.oauth.impl.SocialOAuthUserProfileMapper" >=>  >=>  ConfigmgrApiHandler.ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapper;
      HttpPost >=> route "/system/console/configMgr/com.adobe.cq.social.connect.oauth.impl.TwitterProviderImpl" >=>  >=>  ConfigmgrApiHandler.ComAdobeCqSocialConnectOauthImplTwitterProviderImpl;
      HttpPost >=> route "/system/console/configMgr/com.adobe.cq.social.content.fragments.services.impl.CommunitiesFragmentCreationServiceImpl" >=>  >=>  ConfigmgrApiHandler.ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmen;
      HttpPost >=> route "/system/console/configMgr/com.adobe.cq.social.datastore.as.impl.ASResourceProviderFactory" >=>  >=>  ConfigmgrApiHandler.ComAdobeCqSocialDatastoreAsImplASResourceProviderFactory;
      HttpPost >=> route "/system/console/configMgr/com.adobe.cq.social.datastore.op.impl.SocialMSResourceProviderFactory" >=>  >=>  ConfigmgrApiHandler.ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactory;
      HttpPost >=> route "/system/console/configMgr/com.adobe.cq.social.datastore.rdb.impl.SocialRDBResourceProviderFactory" >=>  >=>  ConfigmgrApiHandler.ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactor;
      HttpPost >=> route "/system/console/configMgr/com.adobe.cq.social.enablement.adaptors.EnablementLearningPathAdaptorFactory" >=>  >=>  ConfigmgrApiHandler.ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorF;
      HttpPost >=> route "/system/console/configMgr/com.adobe.cq.social.enablement.adaptors.EnablementResourceAdaptorFactory" >=>  >=>  ConfigmgrApiHandler.ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFacto;
      HttpPost >=> route "/system/console/configMgr/com.adobe.cq.social.enablement.learningpath.endpoints.impl.EnablementLearningPathModelOperationService" >=>  >=>  ConfigmgrApiHandler.ComAdobeCqSocialEnablementLearningpathEndpointsImplEnablementL;
      HttpPost >=> route "/system/console/configMgr/com.adobe.cq.social.enablement.resource.endpoints.impl.EnablementResourceModelOperationService" >=>  >=>  ConfigmgrApiHandler.ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResou;
      HttpPost >=> route "/system/console/configMgr/com.adobe.cq.social.enablement.services.impl.AuthorMarkerImpl" >=>  >=>  ConfigmgrApiHandler.ComAdobeCqSocialEnablementServicesImplAuthorMarkerImpl;
      HttpPost >=> route "/system/console/configMgr/com.adobe.cq.social.filelibrary.client.endpoints.FilelibraryDownloadGetServlet" >=>  >=>  ConfigmgrApiHandler.ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGe;
      HttpPost >=> route "/system/console/configMgr/com.adobe.cq.social.filelibrary.client.endpoints.impl.FileLibraryOperationsService" >=>  >=>  ConfigmgrApiHandler.ComAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOpera;
      HttpPost >=> route "/system/console/configMgr/com.adobe.cq.social.forum.client.endpoints.impl.ForumOperationsService" >=>  >=>  ConfigmgrApiHandler.ComAdobeCqSocialForumClientEndpointsImplForumOperationsService;
      HttpPost >=> route "/system/console/configMgr/com.adobe.cq.social.forum.dispatcher.impl.FlushOperations" >=>  >=>  ConfigmgrApiHandler.ComAdobeCqSocialForumDispatcherImplFlushOperations;
      HttpPost >=> route "/system/console/configMgr/com.adobe.cq.social.group.client.impl.CommunityGroupCollectionComponentFactory" >=>  >=>  ConfigmgrApiHandler.ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponen;
      HttpPost >=> route "/system/console/configMgr/com.adobe.cq.social.group.impl.GroupServiceImpl" >=>  >=>  ConfigmgrApiHandler.ComAdobeCqSocialGroupImplGroupServiceImpl;
      HttpPost >=> route "/system/console/configMgr/com.adobe.cq.social.handlebars.GuavaTemplateCacheImpl" >=>  >=>  ConfigmgrApiHandler.ComAdobeCqSocialHandlebarsGuavaTemplateCacheImpl;
      HttpPost >=> route "/system/console/configMgr/com.adobe.cq.social.ideation.client.endpoints.impl.IdeationOperationsService" >=>  >=>  ConfigmgrApiHandler.ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsS;
      HttpPost >=> route "/system/console/configMgr/com.adobe.cq.social.journal.client.endpoints.impl.JournalOperationsService" >=>  >=>  ConfigmgrApiHandler.ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSer;
      HttpPost >=> route "/system/console/configMgr/com.adobe.cq.social.members.endpoints.impl.CommunityMemberGroupProfileOperationService" >=>  >=>  ConfigmgrApiHandler.ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfile;
      HttpPost >=> route "/system/console/configMgr/com.adobe.cq.social.members.endpoints.impl.CommunityMemberUserProfileOperationService" >=>  >=>  ConfigmgrApiHandler.ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileO;
      HttpPost >=> route "/system/console/configMgr/com.adobe.cq.social.members.impl.CommunityMemberGroupProfileComponentFactory" >=>  >=>  ConfigmgrApiHandler.ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentF;
      HttpPost >=> route "/system/console/configMgr/com.adobe.cq.social.messaging.client.endpoints.impl.MessagingOperationsServiceImpl" >=>  >=>  ConfigmgrApiHandler.ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperation;
      HttpPost >=> route "/system/console/configMgr/com.adobe.cq.social.moderation.dashboard.api.FilterGroupSocialComponentFactory" >=>  >=>  ConfigmgrApiHandler.ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponen;
      HttpPost >=> route "/system/console/configMgr/com.adobe.cq.social.moderation.dashboard.api.ModerationDashboardSocialComponentFactory" >=>  >=>  ConfigmgrApiHandler.ComAdobeCqSocialModerationDashboardApiModerationDashboardSocial;
      HttpPost >=> route "/system/console/configMgr/com.adobe.cq.social.moderation.dashboard.api.UserDetailsSocialComponentFactory" >=>  >=>  ConfigmgrApiHandler.ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponen;
      HttpPost >=> route "/system/console/configMgr/com.adobe.cq.social.moderation.dashboard.internal.impl.FilterGroupSocialComponentFactoryV2" >=>  >=>  ConfigmgrApiHandler.ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSoci;
      HttpPost >=> route "/system/console/configMgr/com.adobe.cq.social.notifications.impl.MentionsRouter" >=>  >=>  ConfigmgrApiHandler.ComAdobeCqSocialNotificationsImplMentionsRouter;
      HttpPost >=> route "/system/console/configMgr/com.adobe.cq.social.notifications.impl.NotificationManagerImpl" >=>  >=>  ConfigmgrApiHandler.ComAdobeCqSocialNotificationsImplNotificationManagerImpl;
      HttpPost >=> route "/system/console/configMgr/com.adobe.cq.social.notifications.impl.NotificationsRouter" >=>  >=>  ConfigmgrApiHandler.ComAdobeCqSocialNotificationsImplNotificationsRouter;
      HttpPost >=> route "/system/console/configMgr/com.adobe.cq.social.qna.client.endpoints.impl.QnaForumOperationsService" >=>  >=>  ConfigmgrApiHandler.ComAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServic;
      HttpPost >=> route "/system/console/configMgr/com.adobe.cq.social.reporting.analytics.services.impl.AnalyticsReportImporterServiceImpl" >=>  >=>  ConfigmgrApiHandler.ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportI;
      HttpPost >=> route "/system/console/configMgr/com.adobe.cq.social.reporting.analytics.services.impl.AnalyticsReportManagementServiceImpl" >=>  >=>  ConfigmgrApiHandler.ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportM;
      HttpPost >=> route "/system/console/configMgr/com.adobe.cq.social.reporting.analytics.services.impl.SiteTrendReportSocialComponentFactory" >=>  >=>  ConfigmgrApiHandler.ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportS;
      HttpPost >=> route "/system/console/configMgr/com.adobe.cq.social.review.client.endpoints.impl.ReviewOperationsService" >=>  >=>  ConfigmgrApiHandler.ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServi;
      HttpPost >=> route "/system/console/configMgr/com.adobe.cq.social.scf.core.operations.impl.SocialOperationsServlet" >=>  >=>  ConfigmgrApiHandler.ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServlet;
      HttpPost >=> route "/system/console/configMgr/com.adobe.cq.social.scf.endpoints.impl.DefaultSocialGetServlet" >=>  >=>  ConfigmgrApiHandler.ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServlet;
      HttpPost >=> route "/system/console/configMgr/com.adobe.cq.social.scoring.impl.ScoringEventListener" >=>  >=>  ConfigmgrApiHandler.ComAdobeCqSocialScoringImplScoringEventListener;
      HttpPost >=> route "/system/console/configMgr/com.adobe.cq.social.serviceusers.internal.impl.ServiceUserWrapperImpl" >=>  >=>  ConfigmgrApiHandler.ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImpl;
      HttpPost >=> route "/system/console/configMgr/com.adobe.cq.social.site.endpoints.impl.SiteOperationService" >=>  >=>  ConfigmgrApiHandler.ComAdobeCqSocialSiteEndpointsImplSiteOperationService;
      HttpPost >=> route "/system/console/configMgr/com.adobe.cq.social.site.impl.AnalyticsComponentConfigurationServiceImpl" >=>  >=>  ConfigmgrApiHandler.ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceIm;
      HttpPost >=> route "/system/console/configMgr/com.adobe.cq.social.site.impl.SiteConfiguratorImpl" >=>  >=>  ConfigmgrApiHandler.ComAdobeCqSocialSiteImplSiteConfiguratorImpl;
      HttpPost >=> route "/system/console/configMgr/com.adobe.cq.social.srp.impl.SocialSolrConnector" >=>  >=>  ConfigmgrApiHandler.ComAdobeCqSocialSrpImplSocialSolrConnector;
      HttpPost >=> route "/system/console/configMgr/com.adobe.cq.social.sync.impl.DiffChangesObserver" >=>  >=>  ConfigmgrApiHandler.ComAdobeCqSocialSyncImplDiffChangesObserver;
      HttpPost >=> route "/system/console/configMgr/com.adobe.cq.social.sync.impl.GroupSyncListenerImpl" >=>  >=>  ConfigmgrApiHandler.ComAdobeCqSocialSyncImplGroupSyncListenerImpl;
      HttpPost >=> route "/system/console/configMgr/com.adobe.cq.social.sync.impl.PublisherSyncServiceImpl" >=>  >=>  ConfigmgrApiHandler.ComAdobeCqSocialSyncImplPublisherSyncServiceImpl;
      HttpPost >=> route "/system/console/configMgr/com.adobe.cq.social.sync.impl.UserSyncListenerImpl" >=>  >=>  ConfigmgrApiHandler.ComAdobeCqSocialSyncImplUserSyncListenerImpl;
      HttpPost >=> route "/system/console/configMgr/com.adobe.cq.social.translation.impl.TranslationServiceConfigManager" >=>  >=>  ConfigmgrApiHandler.ComAdobeCqSocialTranslationImplTranslationServiceConfigManager;
      HttpPost >=> route "/system/console/configMgr/com.adobe.cq.social.translation.impl.UGCLanguageDetector" >=>  >=>  ConfigmgrApiHandler.ComAdobeCqSocialTranslationImplUGCLanguageDetector;
      HttpPost >=> route "/system/console/configMgr/com.adobe.cq.social.ugcbase.dispatcher.impl.FlushServiceImpl" >=>  >=>  ConfigmgrApiHandler.ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImpl;
      HttpPost >=> route "/system/console/configMgr/com.adobe.cq.social.ugcbase.impl.AysncReverseReplicatorImpl" >=>  >=>  ConfigmgrApiHandler.ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImpl;
      HttpPost >=> route "/system/console/configMgr/com.adobe.cq.social.ugcbase.impl.PublisherConfigurationImpl" >=>  >=>  ConfigmgrApiHandler.ComAdobeCqSocialUgcbaseImplPublisherConfigurationImpl;
      HttpPost >=> route "/system/console/configMgr/com.adobe.cq.social.ugcbase.impl.SocialUtilsImpl" >=>  >=>  ConfigmgrApiHandler.ComAdobeCqSocialUgcbaseImplSocialUtilsImpl;
      HttpPost >=> route "/system/console/configMgr/com.adobe.cq.social.ugcbase.moderation.impl.AutoModerationImpl" >=>  >=>  ConfigmgrApiHandler.ComAdobeCqSocialUgcbaseModerationImplAutoModerationImpl;
      HttpPost >=> route "/system/console/configMgr/com.adobe.cq.social.ugcbase.moderation.impl.SentimentProcess" >=>  >=>  ConfigmgrApiHandler.ComAdobeCqSocialUgcbaseModerationImplSentimentProcess;
      HttpPost >=> route "/system/console/configMgr/com.adobe.cq.social.ugcbase.security.impl.DefaultAttachmentTypeBlacklistService" >=>  >=>  ConfigmgrApiHandler.ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackli;
      HttpPost >=> route "/system/console/configMgr/com.adobe.cq.social.ugcbase.security.impl.SaferSlingPostValidatorImpl" >=>  >=>  ConfigmgrApiHandler.ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImpl;
      HttpPost >=> route "/system/console/configMgr/com.adobe.cq.social.user.endpoints.impl.UsersGroupFromPublishServlet" >=>  >=>  ConfigmgrApiHandler.ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServlet;
      HttpPost >=> route "/system/console/configMgr/com.adobe.cq.social.user.impl.transport.HttpToPublisher" >=>  >=>  ConfigmgrApiHandler.ComAdobeCqSocialUserImplTransportHttpToPublisher;
      HttpPost >=> route "/system/console/configMgr/com.adobe.cq.ui.wcm.commons.internal.servlets.rte.RTEFilterServletFactory.amended" >=>  >=>  ConfigmgrApiHandler.ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFact;
      HttpPost >=> route "/system/console/configMgr/com.adobe.cq.upgrades.cleanup.impl.UpgradeContentCleanup" >=>  >=>  ConfigmgrApiHandler.ComAdobeCqUpgradesCleanupImplUpgradeContentCleanup;
      HttpPost >=> route "/system/console/configMgr/com.adobe.cq.upgrades.cleanup.impl.UpgradeInstallFolderCleanup" >=>  >=>  ConfigmgrApiHandler.ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanup;
      HttpPost >=> route "/system/console/configMgr/com.adobe.cq.wcm.jobs.async.impl.AsyncDeleteConfigProviderService" >=>  >=>  ConfigmgrApiHandler.ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderService;
      HttpPost >=> route "/system/console/configMgr/com.adobe.cq.wcm.jobs.async.impl.AsyncJobCleanUpTask" >=>  >=>  ConfigmgrApiHandler.ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTask;
      HttpPost >=> route "/system/console/configMgr/com.adobe.cq.wcm.jobs.async.impl.AsyncMoveConfigProviderService" >=>  >=>  ConfigmgrApiHandler.ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderService;
      HttpPost >=> route "/system/console/configMgr/com.adobe.cq.wcm.jobs.async.impl.AsyncPageMoveConfigProviderService" >=>  >=>  ConfigmgrApiHandler.ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderService;
      HttpPost >=> route "/system/console/configMgr/com.adobe.cq.wcm.launches.impl.LaunchesEventHandler" >=>  >=>  ConfigmgrApiHandler.ComAdobeCqWcmLaunchesImplLaunchesEventHandler;
      HttpPost >=> route "/system/console/configMgr/com.adobe.cq.wcm.mobile.qrcode.servlet.QRCodeImageGenerator" >=>  >=>  ConfigmgrApiHandler.ComAdobeCqWcmMobileQrcodeServletQRCodeImageGenerator;
      HttpPost >=> route "/system/console/configMgr/com.adobe.cq.wcm.style.internal.ComponentStyleInfoCacheImpl" >=>  >=>  ConfigmgrApiHandler.ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImpl;
      HttpPost >=> route "/system/console/configMgr/com.adobe.cq.wcm.translation.impl.TranslationPlatformConfigurationImpl" >=>  >=>  ConfigmgrApiHandler.ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImpl;
      HttpPost >=> route "/system/console/configMgr/com.adobe.fd.fp.config.FormsPortalDraftsandSubmissionConfigService" >=>  >=>  ConfigmgrApiHandler.ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigService;
      HttpPost >=> route "/system/console/configMgr/com.adobe.fd.fp.config.FormsPortalSchedulerService" >=>  >=>  ConfigmgrApiHandler.ComAdobeFdFpConfigFormsPortalSchedulerService;
      HttpPost >=> route "/system/console/configMgr/com.adobe.forms.common.service.impl.DefaultDataProvider" >=>  >=>  ConfigmgrApiHandler.ComAdobeFormsCommonServiceImplDefaultDataProvider;
      HttpPost >=> route "/system/console/configMgr/com.adobe.forms.common.service.impl.FormsCommonConfigurationServiceImpl" >=>  >=>  ConfigmgrApiHandler.ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImp;
      HttpPost >=> route "/system/console/configMgr/com.adobe.forms.common.servlet.TempCleanUpTask" >=>  >=>  ConfigmgrApiHandler.ComAdobeFormsCommonServletTempCleanUpTask;
      HttpPost >=> route "/system/console/configMgr/com.adobe.granite.acp.platform.PlatformServlet" >=>  >=>  ConfigmgrApiHandler.ComAdobeGraniteAcpPlatformPlatformServlet;
      HttpPost >=> route "/system/console/configMgr/com.adobe.granite.activitystreams.impl.ActivityManagerImpl" >=>  >=>  ConfigmgrApiHandler.ComAdobeGraniteActivitystreamsImplActivityManagerImpl;
      HttpPost >=> route "/system/console/configMgr/com.adobe.granite.analyzer.base.SystemStatusServlet" >=>  >=>  ConfigmgrApiHandler.ComAdobeGraniteAnalyzerBaseSystemStatusServlet;
      HttpPost >=> route "/system/console/configMgr/com.adobe.granite.analyzer.scripts.compile.AllScriptsCompilerServlet" >=>  >=>  ConfigmgrApiHandler.ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServlet;
      HttpPost >=> route "/system/console/configMgr/com.adobe.granite.apicontroller.FilterResolverHookFactory" >=>  >=>  ConfigmgrApiHandler.ComAdobeGraniteApicontrollerFilterResolverHookFactory;
      HttpPost >=> route "/system/console/configMgr/com.adobe.granite.auth.cert.impl.ClientCertAuthHandler" >=>  >=>  ConfigmgrApiHandler.ComAdobeGraniteAuthCertImplClientCertAuthHandler;
      HttpPost >=> route "/system/console/configMgr/com.adobe.granite.auth.ims" >=>  >=>  ConfigmgrApiHandler.ComAdobeGraniteAuthIms;
      HttpPost >=> route "/system/console/configMgr/com.adobe.granite.auth.ims.impl.ExternalUserIdMappingProviderExtension" >=>  >=>  ConfigmgrApiHandler.ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtension;
      HttpPost >=> route "/system/console/configMgr/com.adobe.granite.auth.ims.impl.IMSAccessTokenRequestCustomizerImpl" >=>  >=>  ConfigmgrApiHandler.ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImpl;
      HttpPost >=> route "/system/console/configMgr/com.adobe.granite.auth.ims.impl.IMSInstanceCredentialsValidator" >=>  >=>  ConfigmgrApiHandler.ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidator;
      HttpPost >=> route "/system/console/configMgr/com.adobe.granite.auth.ims.impl.IMSProviderImpl" >=>  >=>  ConfigmgrApiHandler.ComAdobeGraniteAuthImsImplIMSProviderImpl;
      HttpPost >=> route "/system/console/configMgr/com.adobe.granite.auth.ims.impl.ImsConfigProviderImpl" >=>  >=>  ConfigmgrApiHandler.ComAdobeGraniteAuthImsImplImsConfigProviderImpl;
      HttpPost >=> route "/system/console/configMgr/com.adobe.granite.auth.oauth.accesstoken.provider" >=>  >=>  ConfigmgrApiHandler.ComAdobeGraniteAuthOauthAccesstokenProvider;
      HttpPost >=> route "/system/console/configMgr/com.adobe.granite.auth.oauth.impl.BearerAuthenticationHandler" >=>  >=>  ConfigmgrApiHandler.ComAdobeGraniteAuthOauthImplBearerAuthenticationHandler;
      HttpPost >=> route "/system/console/configMgr/com.adobe.granite.auth.oauth.impl.DefaultTokenValidatorImpl" >=>  >=>  ConfigmgrApiHandler.ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImpl;
      HttpPost >=> route "/system/console/configMgr/com.adobe.granite.auth.oauth.impl.FacebookProviderImpl" >=>  >=>  ConfigmgrApiHandler.ComAdobeGraniteAuthOauthImplFacebookProviderImpl;
      HttpPost >=> route "/system/console/configMgr/com.adobe.granite.auth.oauth.impl.GithubProviderImpl" >=>  >=>  ConfigmgrApiHandler.ComAdobeGraniteAuthOauthImplGithubProviderImpl;
      HttpPost >=> route "/system/console/configMgr/com.adobe.granite.auth.oauth.impl.GraniteProvider" >=>  >=>  ConfigmgrApiHandler.ComAdobeGraniteAuthOauthImplGraniteProvider;
      HttpPost >=> route "/system/console/configMgr/com.adobe.granite.auth.oauth.impl.helper.ProviderConfigManager" >=>  >=>  ConfigmgrApiHandler.ComAdobeGraniteAuthOauthImplHelperProviderConfigManager;
      HttpPost >=> route "/system/console/configMgr/com.adobe.granite.auth.oauth.impl.helper.ProviderConfigManagerInternal" >=>  >=>  ConfigmgrApiHandler.ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternal;
      HttpPost >=> route "/system/console/configMgr/com.adobe.granite.auth.oauth.impl.OAuthAuthenticationHandler" >=>  >=>  ConfigmgrApiHandler.ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandler;
      HttpPost >=> route "/system/console/configMgr/com.adobe.granite.auth.oauth.impl.TwitterProviderImpl" >=>  >=>  ConfigmgrApiHandler.ComAdobeGraniteAuthOauthImplTwitterProviderImpl;
      HttpPost >=> route "/system/console/configMgr/com.adobe.granite.auth.oauth.provider" >=>  >=>  ConfigmgrApiHandler.ComAdobeGraniteAuthOauthProvider;
      HttpPost >=> route "/system/console/configMgr/com.adobe.granite.auth.requirement.impl.DefaultRequirementHandler" >=>  >=>  ConfigmgrApiHandler.ComAdobeGraniteAuthRequirementImplDefaultRequirementHandler;
      HttpPost >=> route "/system/console/configMgr/com.adobe.granite.auth.saml.SamlAuthenticationHandler" >=>  >=>  ConfigmgrApiHandler.ComAdobeGraniteAuthSamlSamlAuthenticationHandler;
      HttpPost >=> route "/system/console/configMgr/com.adobe.granite.auth.sso.impl.SsoAuthenticationHandler" >=>  >=>  ConfigmgrApiHandler.ComAdobeGraniteAuthSsoImplSsoAuthenticationHandler;
      HttpPost >=> route "/system/console/configMgr/com.adobe.granite.bundles.hc.impl.CodeCacheHealthCheck" >=>  >=>  ConfigmgrApiHandler.ComAdobeGraniteBundlesHcImplCodeCacheHealthCheck;
      HttpPost >=> route "/system/console/configMgr/com.adobe.granite.bundles.hc.impl.CrxdeSupportBundleHealthCheck" >=>  >=>  ConfigmgrApiHandler.ComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheck;
      HttpPost >=> route "/system/console/configMgr/com.adobe.granite.bundles.hc.impl.DavExBundleHealthCheck" >=>  >=>  ConfigmgrApiHandler.ComAdobeGraniteBundlesHcImplDavExBundleHealthCheck;
      HttpPost >=> route "/system/console/configMgr/com.adobe.granite.bundles.hc.impl.InactiveBundlesHealthCheck" >=>  >=>  ConfigmgrApiHandler.ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheck;
      HttpPost >=> route "/system/console/configMgr/com.adobe.granite.bundles.hc.impl.JobsHealthCheck" >=>  >=>  ConfigmgrApiHandler.ComAdobeGraniteBundlesHcImplJobsHealthCheck;
      HttpPost >=> route "/system/console/configMgr/com.adobe.granite.bundles.hc.impl.SlingGetServletHealthCheck" >=>  >=>  ConfigmgrApiHandler.ComAdobeGraniteBundlesHcImplSlingGetServletHealthCheck;
      HttpPost >=> route "/system/console/configMgr/com.adobe.granite.bundles.hc.impl.SlingJavaScriptHandlerHealthCheck" >=>  >=>  ConfigmgrApiHandler.ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheck;
      HttpPost >=> route "/system/console/configMgr/com.adobe.granite.bundles.hc.impl.SlingJspScriptHandlerHealthCheck" >=>  >=>  ConfigmgrApiHandler.ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheck;
      HttpPost >=> route "/system/console/configMgr/com.adobe.granite.bundles.hc.impl.SlingReferrerFilterHealthCheck" >=>  >=>  ConfigmgrApiHandler.ComAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheck;
      HttpPost >=> route "/system/console/configMgr/com.adobe.granite.bundles.hc.impl.WebDavBundleHealthCheck" >=>  >=>  ConfigmgrApiHandler.ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheck;
      HttpPost >=> route "/system/console/configMgr/com.adobe.granite.comments.internal.CommentReplicationContentFilterFactory" >=>  >=>  ConfigmgrApiHandler.ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFac;
      HttpPost >=> route "/system/console/configMgr/com.adobe.granite.compatrouter.impl.CompatSwitchingServiceImpl" >=>  >=>  ConfigmgrApiHandler.ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImpl;
      HttpPost >=> route "/system/console/configMgr/com.adobe.granite.compatrouter.impl.RoutingConfig" >=>  >=>  ConfigmgrApiHandler.ComAdobeGraniteCompatrouterImplRoutingConfig;
      HttpPost >=> route "/system/console/configMgr/com.adobe.granite.compatrouter.impl.SwitchMappingConfig" >=>  >=>  ConfigmgrApiHandler.ComAdobeGraniteCompatrouterImplSwitchMappingConfig;
      HttpPost >=> route "/system/console/configMgr/com.adobe.granite.conf.impl.RuntimeAwareConfigurationResourceResolvingStrategy" >=>  >=>  ConfigmgrApiHandler.ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolving;
      HttpPost >=> route "/system/console/configMgr/com.adobe.granite.contexthub.impl.ContextHubImpl" >=>  >=>  ConfigmgrApiHandler.ComAdobeGraniteContexthubImplContextHubImpl;
      HttpPost >=> route "/system/console/configMgr/com.adobe.granite.cors.impl.CORSPolicyImpl" >=>  >=>  ConfigmgrApiHandler.ComAdobeGraniteCorsImplCORSPolicyImpl;
      HttpPost >=> route "/system/console/configMgr/com.adobe.granite.csrf.impl.CSRFFilter" >=>  >=>  ConfigmgrApiHandler.ComAdobeGraniteCsrfImplCSRFFilter;
      HttpPost >=> route "/system/console/configMgr/com.adobe.granite.csrf.impl.CSRFServlet" >=>  >=>  ConfigmgrApiHandler.ComAdobeGraniteCsrfImplCSRFServlet;
      HttpPost >=> route "/system/console/configMgr/com.adobe.granite.distribution.core.impl.CryptoDistributionTransportSecretProvider" >=>  >=>  ConfigmgrApiHandler.ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSe;
      HttpPost >=> route "/system/console/configMgr/com.adobe.granite.distribution.core.impl.diff.DiffChangesObserver" >=>  >=>  ConfigmgrApiHandler.ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserver;
      HttpPost >=> route "/system/console/configMgr/com.adobe.granite.distribution.core.impl.diff.DiffEventListener" >=>  >=>  ConfigmgrApiHandler.ComAdobeGraniteDistributionCoreImplDiffDiffEventListener;
      HttpPost >=> route "/system/console/configMgr/com.adobe.granite.distribution.core.impl.DistributionToReplicationEventTransformer" >=>  >=>  ConfigmgrApiHandler.ComAdobeGraniteDistributionCoreImplDistributionToReplicationEven;
      HttpPost >=> route "/system/console/configMgr/com.adobe.granite.distribution.core.impl.replication.adapters.ReplicationAgentProvider" >=>  >=>  ConfigmgrApiHandler.ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicat;
      HttpPost >=> route "/system/console/configMgr/com.adobe.granite.distribution.core.impl.replication.DistributionTransportHandler" >=>  >=>  ConfigmgrApiHandler.ComAdobeGraniteDistributionCoreImplReplicationDistributionTrans;
      HttpPost >=> route "/system/console/configMgr/com.adobe.granite.distribution.core.impl.transport.AccessTokenDistributionTransportSecretProvider" >=>  >=>  ConfigmgrApiHandler.ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribu;
      HttpPost >=> route "/system/console/configMgr/com.adobe.granite.frags.impl.CheckHttpHeaderFlag" >=>  >=>  ConfigmgrApiHandler.ComAdobeGraniteFragsImplCheckHttpHeaderFlag;
      HttpPost >=> route "/system/console/configMgr/com.adobe.granite.frags.impl.RandomFeature" >=>  >=>  ConfigmgrApiHandler.ComAdobeGraniteFragsImplRandomFeature;
      HttpPost >=> route "/system/console/configMgr/com.adobe.granite.httpcache.file.FileCacheStore" >=>  >=>  ConfigmgrApiHandler.ComAdobeGraniteHttpcacheFileFileCacheStore;
      HttpPost >=> route "/system/console/configMgr/com.adobe.granite.httpcache.impl.OuterCacheFilter" >=>  >=>  ConfigmgrApiHandler.ComAdobeGraniteHttpcacheImplOuterCacheFilter;
      HttpPost >=> route "/system/console/configMgr/com.adobe.granite.i18n.impl.bundle.PseudoTranslations" >=>  >=>  ConfigmgrApiHandler.ComAdobeGraniteI18nImplBundlePseudoTranslations;
      HttpPost >=> route "/system/console/configMgr/com.adobe.granite.i18n.impl.PreferencesLocaleResolverService" >=>  >=>  ConfigmgrApiHandler.ComAdobeGraniteI18nImplPreferencesLocaleResolverService;
      HttpPost >=> route "/system/console/configMgr/com.adobe.granite.infocollector.InfoCollector" >=>  >=>  ConfigmgrApiHandler.ComAdobeGraniteInfocollectorInfoCollector;
      HttpPost >=> route "/system/console/configMgr/com.adobe.granite.jetty.ssl.internal.GraniteSslConnectorFactory" >=>  >=>  ConfigmgrApiHandler.ComAdobeGraniteJettySslInternalGraniteSslConnectorFactory;
      HttpPost >=> route "/system/console/configMgr/com.adobe.granite.license.impl.LicenseCheckFilter" >=>  >=>  ConfigmgrApiHandler.ComAdobeGraniteLicenseImplLicenseCheckFilter;
      HttpPost >=> route "/system/console/configMgr/com.adobe.granite.logging.impl.LogAnalyserImpl" >=>  >=>  ConfigmgrApiHandler.ComAdobeGraniteLoggingImplLogAnalyserImpl;
      HttpPost >=> route "/system/console/configMgr/com.adobe.granite.logging.impl.LogErrorHealthCheck" >=>  >=>  ConfigmgrApiHandler.ComAdobeGraniteLoggingImplLogErrorHealthCheck;
      HttpPost >=> route "/system/console/configMgr/com.adobe.granite.maintenance.crx.impl.DataStoreGarbageCollectionTask" >=>  >=>  ConfigmgrApiHandler.ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTask;
      HttpPost >=> route "/system/console/configMgr/com.adobe.granite.maintenance.crx.impl.LuceneBinariesCleanupTask" >=>  >=>  ConfigmgrApiHandler.ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTask;
      HttpPost >=> route "/system/console/configMgr/com.adobe.granite.maintenance.crx.impl.RevisionCleanupTask" >=>  >=>  ConfigmgrApiHandler.ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTask;
      HttpPost >=> route "/system/console/configMgr/com.adobe.granite.monitoring.impl.ScriptConfigImpl" >=>  >=>  ConfigmgrApiHandler.ComAdobeGraniteMonitoringImplScriptConfigImpl;
      HttpPost >=> route "/system/console/configMgr/com.adobe.granite.oauth.server.auth.impl.OAuth2ServerAuthenticationHandler" >=>  >=>  ConfigmgrApiHandler.ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHan;
      HttpPost >=> route "/system/console/configMgr/com.adobe.granite.oauth.server.impl.AccessTokenCleanupTask" >=>  >=>  ConfigmgrApiHandler.ComAdobeGraniteOauthServerImplAccessTokenCleanupTask;
      HttpPost >=> route "/system/console/configMgr/com.adobe.granite.oauth.server.impl.OAuth2ClientRevocationServlet" >=>  >=>  ConfigmgrApiHandler.ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServlet;
      HttpPost >=> route "/system/console/configMgr/com.adobe.granite.oauth.server.impl.OAuth2RevocationEndpointServlet" >=>  >=>  ConfigmgrApiHandler.ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServlet;
      HttpPost >=> route "/system/console/configMgr/com.adobe.granite.oauth.server.impl.OAuth2TokenEndpointServlet" >=>  >=>  ConfigmgrApiHandler.ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServlet;
      HttpPost >=> route "/system/console/configMgr/com.adobe.granite.oauth.server.impl.OAuth2TokenRevocationServlet" >=>  >=>  ConfigmgrApiHandler.ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServlet;
      HttpPost >=> route "/system/console/configMgr/com.adobe.granite.offloading.impl.OffloadingConfigurator" >=>  >=>  ConfigmgrApiHandler.ComAdobeGraniteOffloadingImplOffloadingConfigurator;
      HttpPost >=> route "/system/console/configMgr/com.adobe.granite.offloading.impl.OffloadingJobCloner" >=>  >=>  ConfigmgrApiHandler.ComAdobeGraniteOffloadingImplOffloadingJobCloner;
      HttpPost >=> route "/system/console/configMgr/com.adobe.granite.offloading.impl.OffloadingJobOffloader" >=>  >=>  ConfigmgrApiHandler.ComAdobeGraniteOffloadingImplOffloadingJobOffloader;
      HttpPost >=> route "/system/console/configMgr/com.adobe.granite.offloading.impl.transporter.OffloadingAgentManager" >=>  >=>  ConfigmgrApiHandler.ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManager;
      HttpPost >=> route "/system/console/configMgr/com.adobe.granite.offloading.impl.transporter.OffloadingDefaultTransporter" >=>  >=>  ConfigmgrApiHandler.ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspo;
      HttpPost >=> route "/system/console/configMgr/com.adobe.granite.omnisearch.impl.core.OmniSearchServiceImpl" >=>  >=>  ConfigmgrApiHandler.ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImpl;
      HttpPost >=> route "/system/console/configMgr/com.adobe.granite.optout.impl.OptOutServiceImpl" >=>  >=>  ConfigmgrApiHandler.ComAdobeGraniteOptoutImplOptOutServiceImpl;
      HttpPost >=> route "/system/console/configMgr/com.adobe.granite.queries.impl.hc.AsyncIndexHealthCheck" >=>  >=>  ConfigmgrApiHandler.ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheck;
      HttpPost >=> route "/system/console/configMgr/com.adobe.granite.queries.impl.hc.LargeIndexHealthCheck" >=>  >=>  ConfigmgrApiHandler.ComAdobeGraniteQueriesImplHcLargeIndexHealthCheck;
      HttpPost >=> route "/system/console/configMgr/com.adobe.granite.queries.impl.hc.QueriesStatusHealthCheck" >=>  >=>  ConfigmgrApiHandler.ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheck;
      HttpPost >=> route "/system/console/configMgr/com.adobe.granite.queries.impl.hc.QueryHealthCheckMetrics" >=>  >=>  ConfigmgrApiHandler.ComAdobeGraniteQueriesImplHcQueryHealthCheckMetrics;
      HttpPost >=> route "/system/console/configMgr/com.adobe.granite.queries.impl.hc.QueryLimitsHealthCheck" >=>  >=>  ConfigmgrApiHandler.ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheck;
      HttpPost >=> route "/system/console/configMgr/com.adobe.granite.replication.hc.impl.ReplicationQueueHealthCheck" >=>  >=>  ConfigmgrApiHandler.ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheck;
      HttpPost >=> route "/system/console/configMgr/com.adobe.granite.replication.hc.impl.ReplicationTransportUsersHealthCheck" >=>  >=>  ConfigmgrApiHandler.ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthC;
      HttpPost >=> route "/system/console/configMgr/com.adobe.granite.repository.hc.impl.AuthorizableNodeNameHealthCheck" >=>  >=>  ConfigmgrApiHandler.ComAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheck;
      HttpPost >=> route "/system/console/configMgr/com.adobe.granite.repository.hc.impl.content.sling.SlingContentHealthCheck" >=>  >=>  ConfigmgrApiHandler.ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthC;
      HttpPost >=> route "/system/console/configMgr/com.adobe.granite.repository.hc.impl.ContinuousRGCHealthCheck" >=>  >=>  ConfigmgrApiHandler.ComAdobeGraniteRepositoryHcImplContinuousRGCHealthCheck;
      HttpPost >=> route "/system/console/configMgr/com.adobe.granite.repository.hc.impl.DefaultAccessUserProfileHealthCheck" >=>  >=>  ConfigmgrApiHandler.ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthChe;
      HttpPost >=> route "/system/console/configMgr/com.adobe.granite.repository.hc.impl.DefaultLoginsHealthCheck" >=>  >=>  ConfigmgrApiHandler.ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheck;
      HttpPost >=> route "/system/console/configMgr/com.adobe.granite.repository.hc.impl.DiskSpaceHealthCheck" >=>  >=>  ConfigmgrApiHandler.ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheck;
      HttpPost >=> route "/system/console/configMgr/com.adobe.granite.repository.hc.impl.ObservationQueueLengthHealthCheck" >=>  >=>  ConfigmgrApiHandler.ComAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheck;
      HttpPost >=> route "/system/console/configMgr/com.adobe.granite.repository.impl.CommitStatsConfig" >=>  >=>  ConfigmgrApiHandler.ComAdobeGraniteRepositoryImplCommitStatsConfig;
      HttpPost >=> route "/system/console/configMgr/com.adobe.granite.repository.ServiceUserConfiguration" >=>  >=>  ConfigmgrApiHandler.ComAdobeGraniteRepositoryServiceUserConfiguration;
      HttpPost >=> route "/system/console/configMgr/com.adobe.granite.requests.logging.impl.hc.RequestsStatusHealthCheckImpl" >=>  >=>  ConfigmgrApiHandler.ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckIm;
      HttpPost >=> route "/system/console/configMgr/com.adobe.granite.resourcestatus.impl.CompositeStatusType" >=>  >=>  ConfigmgrApiHandler.ComAdobeGraniteResourcestatusImplCompositeStatusType;
      HttpPost >=> route "/system/console/configMgr/com.adobe.granite.resourcestatus.impl.StatusResourceProviderImpl" >=>  >=>  ConfigmgrApiHandler.ComAdobeGraniteResourcestatusImplStatusResourceProviderImpl;
      HttpPost >=> route "/system/console/configMgr/com.adobe.granite.rest.assets.impl.AssetContentDispositionFilter" >=>  >=>  ConfigmgrApiHandler.ComAdobeGraniteRestAssetsImplAssetContentDispositionFilter;
      HttpPost >=> route "/system/console/configMgr/com.adobe.granite.rest.impl.ApiEndpointResourceProviderFactoryImpl" >=>  >=>  ConfigmgrApiHandler.ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImpl;
      HttpPost >=> route "/system/console/configMgr/com.adobe.granite.rest.impl.servlet.DefaultGETServlet" >=>  >=>  ConfigmgrApiHandler.ComAdobeGraniteRestImplServletDefaultGETServlet;
      HttpPost >=> route "/system/console/configMgr/com.adobe.granite.security.user.ui.internal.servlets.SSLConfigurationServlet" >=>  >=>  ConfigmgrApiHandler.ComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationS;
      HttpPost >=> route "/system/console/configMgr/com.adobe.granite.security.user.UserPropertiesService" >=>  >=>  ConfigmgrApiHandler.ComAdobeGraniteSecurityUserUserPropertiesService;
      HttpPost >=> route "/system/console/configMgr/com.adobe.granite.socialgraph.impl.SocialGraphFactoryImpl" >=>  >=>  ConfigmgrApiHandler.ComAdobeGraniteSocialgraphImplSocialGraphFactoryImpl;
      HttpPost >=> route "/system/console/configMgr/com.adobe.granite.system.monitoring.impl.SystemStatsMBeanImpl" >=>  >=>  ConfigmgrApiHandler.ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImpl;
      HttpPost >=> route "/system/console/configMgr/com.adobe.granite.taskmanagement.impl.jcr.TaskAdapterFactory" >=>  >=>  ConfigmgrApiHandler.ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactory;
      HttpPost >=> route "/system/console/configMgr/com.adobe.granite.taskmanagement.impl.jcr.TaskArchiveService" >=>  >=>  ConfigmgrApiHandler.ComAdobeGraniteTaskmanagementImplJcrTaskArchiveService;
      HttpPost >=> route "/system/console/configMgr/com.adobe.granite.taskmanagement.impl.purge.TaskPurgeMaintenanceTask" >=>  >=>  ConfigmgrApiHandler.ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTask;
      HttpPost >=> route "/system/console/configMgr/com.adobe.granite.taskmanagement.impl.service.TaskManagerAdapterFactory" >=>  >=>  ConfigmgrApiHandler.ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactor;
      HttpPost >=> route "/system/console/configMgr/com.adobe.granite.threaddump.ThreadDumpCollector" >=>  >=>  ConfigmgrApiHandler.ComAdobeGraniteThreaddumpThreadDumpCollector;
      HttpPost >=> route "/system/console/configMgr/com.adobe.granite.translation.connector.msft.core.impl.MicrosoftTranslationServiceFactoryImpl" >=>  >=>  ConfigmgrApiHandler.ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTransl;
      HttpPost >=> route "/system/console/configMgr/com.adobe.granite.translation.core.impl.TranslationManagerImpl" >=>  >=>  ConfigmgrApiHandler.ComAdobeGraniteTranslationCoreImplTranslationManagerImpl;
      HttpPost >=> route "/system/console/configMgr/com.adobe.granite.ui.clientlibs.impl.HtmlLibraryManagerImpl" >=>  >=>  ConfigmgrApiHandler.ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImpl;
      HttpPost >=> route "/system/console/configMgr/com.adobe.granite.workflow.console.frags.WorkflowWithdrawFeature" >=>  >=>  ConfigmgrApiHandler.ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeature;
      HttpPost >=> route "/system/console/configMgr/com.adobe.granite.workflow.console.publish.WorkflowPublishEventService" >=>  >=>  ConfigmgrApiHandler.ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventService;
      HttpPost >=> route "/system/console/configMgr/com.adobe.granite.workflow.core.jcr.WorkflowBucketManager" >=>  >=>  ConfigmgrApiHandler.ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManager;
      HttpPost >=> route "/system/console/configMgr/com.adobe.granite.workflow.core.job.ExternalProcessJobHandler" >=>  >=>  ConfigmgrApiHandler.ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandler;
      HttpPost >=> route "/system/console/configMgr/com.adobe.granite.workflow.core.job.JobHandler" >=>  >=>  ConfigmgrApiHandler.ComAdobeGraniteWorkflowCoreJobJobHandler;
      HttpPost >=> route "/system/console/configMgr/com.adobe.granite.workflow.core.offloading.WorkflowOffloadingJobConsumer" >=>  >=>  ConfigmgrApiHandler.ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsum;
      HttpPost >=> route "/system/console/configMgr/com.adobe.granite.workflow.core.PayloadMapCache" >=>  >=>  ConfigmgrApiHandler.ComAdobeGraniteWorkflowCorePayloadMapCache;
      HttpPost >=> route "/system/console/configMgr/com.adobe.granite.workflow.core.payloadmap.PayloadMoveListener" >=>  >=>  ConfigmgrApiHandler.ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListener;
      HttpPost >=> route "/system/console/configMgr/com.adobe.granite.workflow.core.WorkflowConfig" >=>  >=>  ConfigmgrApiHandler.ComAdobeGraniteWorkflowCoreWorkflowConfig;
      HttpPost >=> route "/system/console/configMgr/com.adobe.granite.workflow.core.WorkflowSessionFactory" >=>  >=>  ConfigmgrApiHandler.ComAdobeGraniteWorkflowCoreWorkflowSessionFactory;
      HttpPost >=> route "/system/console/configMgr/com.adobe.granite.workflow.purge.Scheduler" >=>  >=>  ConfigmgrApiHandler.ComAdobeGraniteWorkflowPurgeScheduler;
      HttpPost >=> route "/system/console/configMgr/com.adobe.octopus.ncomm.bootstrap" >=>  >=>  ConfigmgrApiHandler.ComAdobeOctopusNcommBootstrap;
      HttpPost >=> route "/system/console/configMgr/com.adobe.social.integrations.livefyre.user.pingforpull.impl.PingPullServlet" >=>  >=>  ConfigmgrApiHandler.ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullS;
      HttpPost >=> route "/system/console/configMgr/com.adobe.xmp.worker.files.ncomm.XMPFilesNComm" >=>  >=>  ConfigmgrApiHandler.ComAdobeXmpWorkerFilesNcommXMPFilesNComm;
      HttpPost >=> route "/system/console/configMgr/com.day.commons.datasource.jdbcpool.JdbcPoolService" >=>  >=>  ConfigmgrApiHandler.ComDayCommonsDatasourceJdbcpoolJdbcPoolService;
      HttpPost >=> route "/system/console/configMgr/com.day.commons.httpclient" >=>  >=>  ConfigmgrApiHandler.ComDayCommonsHttpclient;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.analytics.impl.StorePropertiesChangeListener" >=>  >=>  ConfigmgrApiHandler.ComDayCqAnalyticsImplStorePropertiesChangeListener;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.analytics.sitecatalyst.impl.exporter.ClassificationsExporter" >=>  >=>  ConfigmgrApiHandler.ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporte;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.analytics.sitecatalyst.impl.importer.ReportImporter" >=>  >=>  ConfigmgrApiHandler.ComDayCqAnalyticsSitecatalystImplImporterReportImporter;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.analytics.sitecatalyst.impl.SitecatalystAdapterFactory" >=>  >=>  ConfigmgrApiHandler.ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactory;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.analytics.sitecatalyst.impl.SitecatalystHttpClientImpl" >=>  >=>  ConfigmgrApiHandler.ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImpl;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.analytics.testandtarget.impl.AccountOptionsUpdater" >=>  >=>  ConfigmgrApiHandler.ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdater;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.analytics.testandtarget.impl.DeleteAuthorActivityListener" >=>  >=>  ConfigmgrApiHandler.ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListener;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.analytics.testandtarget.impl.PushAuthorCampaignPageListener" >=>  >=>  ConfigmgrApiHandler.ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListener;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.analytics.testandtarget.impl.SegmentImporter" >=>  >=>  ConfigmgrApiHandler.ComDayCqAnalyticsTestandtargetImplSegmentImporter;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.analytics.testandtarget.impl.service.WebServiceImpl" >=>  >=>  ConfigmgrApiHandler.ComDayCqAnalyticsTestandtargetImplServiceWebServiceImpl;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.analytics.testandtarget.impl.servlets.AdminServerServlet" >=>  >=>  ConfigmgrApiHandler.ComDayCqAnalyticsTestandtargetImplServletsAdminServerServlet;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.analytics.testandtarget.impl.TestandtargetHttpClientImpl" >=>  >=>  ConfigmgrApiHandler.ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImpl;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.auth.impl.cug.CugSupportImpl" >=>  >=>  ConfigmgrApiHandler.ComDayCqAuthImplCugCugSupportImpl;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.auth.impl.LoginSelectorHandler" >=>  >=>  ConfigmgrApiHandler.ComDayCqAuthImplLoginSelectorHandler;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.commons.impl.ExternalizerImpl" >=>  >=>  ConfigmgrApiHandler.ComDayCqCommonsImplExternalizerImpl;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.commons.servlets.RootMappingServlet" >=>  >=>  ConfigmgrApiHandler.ComDayCqCommonsServletsRootMappingServlet;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.compat.codeupgrade.impl.CodeUpgradeExecutionConditionChecker" >=>  >=>  ConfigmgrApiHandler.ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionChecke;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.compat.codeupgrade.impl.UpgradeTaskIgnoreList" >=>  >=>  ConfigmgrApiHandler.ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreList;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.compat.codeupgrade.impl.VersionRangeTaskIgnorelist" >=>  >=>  ConfigmgrApiHandler.ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelist;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.contentsync.impl.ContentSyncManagerImpl" >=>  >=>  ConfigmgrApiHandler.ComDayCqContentsyncImplContentSyncManagerImpl;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.dam.commons.handler.StandardImageHandler" >=>  >=>  ConfigmgrApiHandler.ComDayCqDamCommonsHandlerStandardImageHandler;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.dam.commons.metadata.XmpFilterBlackWhite" >=>  >=>  ConfigmgrApiHandler.ComDayCqDamCommonsMetadataXmpFilterBlackWhite;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.dam.commons.util.impl.AssetCacheImpl" >=>  >=>  ConfigmgrApiHandler.ComDayCqDamCommonsUtilImplAssetCacheImpl;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.dam.core.impl.annotation.pdf.AnnotationPdfConfig" >=>  >=>  ConfigmgrApiHandler.ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfig;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.dam.core.impl.AssetMoveListener" >=>  >=>  ConfigmgrApiHandler.ComDayCqDamCoreImplAssetMoveListener;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.dam.core.impl.assethome.AssetHomePageConfiguration" >=>  >=>  ConfigmgrApiHandler.ComDayCqDamCoreImplAssethomeAssetHomePageConfiguration;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.dam.core.impl.assetlinkshare.AdhocAssetShareProxyServlet" >=>  >=>  ConfigmgrApiHandler.ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServlet;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.dam.core.impl.cache.CQBufferedImageCache" >=>  >=>  ConfigmgrApiHandler.ComDayCqDamCoreImplCacheCQBufferedImageCache;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.dam.core.impl.DamChangeEventListener" >=>  >=>  ConfigmgrApiHandler.ComDayCqDamCoreImplDamChangeEventListener;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.dam.core.impl.DamEventPurgeService" >=>  >=>  ConfigmgrApiHandler.ComDayCqDamCoreImplDamEventPurgeService;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.dam.core.impl.DamEventRecorderImpl" >=>  >=>  ConfigmgrApiHandler.ComDayCqDamCoreImplDamEventRecorderImpl;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.dam.core.impl.event.DamEventAuditListener" >=>  >=>  ConfigmgrApiHandler.ComDayCqDamCoreImplEventDamEventAuditListener;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.dam.core.impl.ExpiryNotificationJobImpl" >=>  >=>  ConfigmgrApiHandler.ComDayCqDamCoreImplExpiryNotificationJobImpl;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.dam.core.impl.foldermetadataschema.FolderMetadataSchemaFeatureFlag" >=>  >=>  ConfigmgrApiHandler.ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeat;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.dam.core.impl.gfx.CommonsGfxRenderer" >=>  >=>  ConfigmgrApiHandler.ComDayCqDamCoreImplGfxCommonsGfxRenderer;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.dam.core.impl.handler.EPSFormatHandler" >=>  >=>  ConfigmgrApiHandler.ComDayCqDamCoreImplHandlerEPSFormatHandler;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.dam.core.impl.handler.IndesignFormatHandler" >=>  >=>  ConfigmgrApiHandler.ComDayCqDamCoreImplHandlerIndesignFormatHandler;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.dam.core.impl.handler.JpegHandler" >=>  >=>  ConfigmgrApiHandler.ComDayCqDamCoreImplHandlerJpegHandler;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.dam.core.impl.handler.xmp.NCommXMPHandler" >=>  >=>  ConfigmgrApiHandler.ComDayCqDamCoreImplHandlerXmpNCommXMPHandler;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.dam.core.impl.jmx.AssetIndexUpdateMonitor" >=>  >=>  ConfigmgrApiHandler.ComDayCqDamCoreImplJmxAssetIndexUpdateMonitor;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.dam.core.impl.jmx.AssetMigrationMBeanImpl" >=>  >=>  ConfigmgrApiHandler.ComDayCqDamCoreImplJmxAssetMigrationMBeanImpl;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.dam.core.impl.jmx.AssetUpdateMonitorImpl" >=>  >=>  ConfigmgrApiHandler.ComDayCqDamCoreImplJmxAssetUpdateMonitorImpl;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.dam.core.impl.jobs.metadataexport.AsyncMetadataExportConfigProviderService" >=>  >=>  ConfigmgrApiHandler.ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfig;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.dam.core.impl.jobs.metadataimport.AsyncMetadataImportConfigProviderService" >=>  >=>  ConfigmgrApiHandler.ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfig;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.dam.core.impl.lightbox.LightboxServlet" >=>  >=>  ConfigmgrApiHandler.ComDayCqDamCoreImplLightboxLightboxServlet;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.dam.core.impl.metadata.editor.SelectComponentHandler" >=>  >=>  ConfigmgrApiHandler.ComDayCqDamCoreImplMetadataEditorSelectComponentHandler;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.dam.core.impl.mimeType.AssetUploadRestrictionHelper" >=>  >=>  ConfigmgrApiHandler.ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelper;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.dam.core.impl.mimeType.DamMimeTypeServiceImpl" >=>  >=>  ConfigmgrApiHandler.ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImpl;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.dam.core.impl.MissingMetadataNotificationJob" >=>  >=>  ConfigmgrApiHandler.ComDayCqDamCoreImplMissingMetadataNotificationJob;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.dam.core.impl.process.SendTransientWorkflowCompletedEmailProcess" >=>  >=>  ConfigmgrApiHandler.ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPr;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.dam.core.impl.process.TextExtractionProcess" >=>  >=>  ConfigmgrApiHandler.ComDayCqDamCoreImplProcessTextExtractionProcess;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.dam.core.impl.RenditionMakerImpl" >=>  >=>  ConfigmgrApiHandler.ComDayCqDamCoreImplRenditionMakerImpl;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.dam.core.impl.reports.ReportExportService" >=>  >=>  ConfigmgrApiHandler.ComDayCqDamCoreImplReportsReportExportService;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.dam.core.impl.reports.ReportPurgeService" >=>  >=>  ConfigmgrApiHandler.ComDayCqDamCoreImplReportsReportPurgeService;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.dam.core.impl.servlet.AssetDownloadServlet" >=>  >=>  ConfigmgrApiHandler.ComDayCqDamCoreImplServletAssetDownloadServlet;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.dam.core.impl.servlet.AssetStatusServlet" >=>  >=>  ConfigmgrApiHandler.ComDayCqDamCoreImplServletAssetStatusServlet;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.dam.core.impl.servlet.AssetXMPSearchServlet" >=>  >=>  ConfigmgrApiHandler.ComDayCqDamCoreImplServletAssetXMPSearchServlet;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.dam.core.impl.servlet.BatchMetadataServlet" >=>  >=>  ConfigmgrApiHandler.ComDayCqDamCoreImplServletBatchMetadataServlet;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.dam.core.impl.servlet.BinaryProviderServlet" >=>  >=>  ConfigmgrApiHandler.ComDayCqDamCoreImplServletBinaryProviderServlet;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.dam.core.impl.servlet.CollectionServlet" >=>  >=>  ConfigmgrApiHandler.ComDayCqDamCoreImplServletCollectionServlet;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.dam.core.impl.servlet.CollectionsServlet" >=>  >=>  ConfigmgrApiHandler.ComDayCqDamCoreImplServletCollectionsServlet;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.dam.core.impl.servlet.CompanionServlet" >=>  >=>  ConfigmgrApiHandler.ComDayCqDamCoreImplServletCompanionServlet;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.dam.core.impl.servlet.CreateAssetServlet" >=>  >=>  ConfigmgrApiHandler.ComDayCqDamCoreImplServletCreateAssetServlet;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.dam.core.impl.servlet.DamContentDispositionFilter" >=>  >=>  ConfigmgrApiHandler.ComDayCqDamCoreImplServletDamContentDispositionFilter;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.dam.core.impl.servlet.GuidLookupFilter" >=>  >=>  ConfigmgrApiHandler.ComDayCqDamCoreImplServletGuidLookupFilter;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.dam.core.impl.servlet.HealthCheckServlet" >=>  >=>  ConfigmgrApiHandler.ComDayCqDamCoreImplServletHealthCheckServlet;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.dam.core.impl.servlet.MetadataGetServlet" >=>  >=>  ConfigmgrApiHandler.ComDayCqDamCoreImplServletMetadataGetServlet;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.dam.core.impl.servlet.MultipleLicenseAcceptServlet" >=>  >=>  ConfigmgrApiHandler.ComDayCqDamCoreImplServletMultipleLicenseAcceptServlet;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.dam.core.impl.servlet.ResourceCollectionServlet" >=>  >=>  ConfigmgrApiHandler.ComDayCqDamCoreImplServletResourceCollectionServlet;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.dam.core.impl.ui.preview.FolderPreviewUpdaterImpl" >=>  >=>  ConfigmgrApiHandler.ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImpl;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.dam.core.impl.unzip.UnzipConfig" >=>  >=>  ConfigmgrApiHandler.ComDayCqDamCoreImplUnzipUnzipConfig;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.dam.core.process.ExifToolExtractMetadataProcess" >=>  >=>  ConfigmgrApiHandler.ComDayCqDamCoreProcessExifToolExtractMetadataProcess;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.dam.core.process.ExtractMetadataProcess" >=>  >=>  ConfigmgrApiHandler.ComDayCqDamCoreProcessExtractMetadataProcess;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.dam.core.process.MetadataProcessorProcess" >=>  >=>  ConfigmgrApiHandler.ComDayCqDamCoreProcessMetadataProcessorProcess;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.dam.handler.ffmpeg.LocatorImpl" >=>  >=>  ConfigmgrApiHandler.ComDayCqDamHandlerFfmpegLocatorImpl;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.dam.handler.gibson.fontmanager.impl.FontManagerServiceImpl" >=>  >=>  ConfigmgrApiHandler.ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImpl;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.dam.handler.standard.pdf.PdfHandler" >=>  >=>  ConfigmgrApiHandler.ComDayCqDamHandlerStandardPdfPdfHandler;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.dam.handler.standard.ps.PostScriptHandler" >=>  >=>  ConfigmgrApiHandler.ComDayCqDamHandlerStandardPsPostScriptHandler;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.dam.handler.standard.psd.PsdHandler" >=>  >=>  ConfigmgrApiHandler.ComDayCqDamHandlerStandardPsdPsdHandler;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.dam.ids.impl.IDSJobProcessor" >=>  >=>  ConfigmgrApiHandler.ComDayCqDamIdsImplIDSJobProcessor;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.dam.ids.impl.IDSPoolManagerImpl" >=>  >=>  ConfigmgrApiHandler.ComDayCqDamIdsImplIDSPoolManagerImpl;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.dam.indd.impl.handler.IndesignXMPHandler" >=>  >=>  ConfigmgrApiHandler.ComDayCqDamInddImplHandlerIndesignXMPHandler;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.dam.indd.impl.servlet.SnippetCreationServlet" >=>  >=>  ConfigmgrApiHandler.ComDayCqDamInddImplServletSnippetCreationServlet;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.dam.indd.process.INDDMediaExtractProcess" >=>  >=>  ConfigmgrApiHandler.ComDayCqDamInddProcessINDDMediaExtractProcess;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.dam.performance.internal.AssetPerformanceDataHandlerImpl" >=>  >=>  ConfigmgrApiHandler.ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImpl;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.dam.performance.internal.AssetPerformanceReportSyncJob" >=>  >=>  ConfigmgrApiHandler.ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJob;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.dam.pim.impl.sourcing.upload.process.ProductAssetsUploadProcess" >=>  >=>  ConfigmgrApiHandler.ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadPro;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.dam.s7dam.common.analytics.impl.S7damDynamicMediaConfigEventListener" >=>  >=>  ConfigmgrApiHandler.ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEven;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.dam.s7dam.common.analytics.impl.SiteCatalystReportRunner" >=>  >=>  ConfigmgrApiHandler.ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunner;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.dam.s7dam.common.post.servlets.SetCreateHandler" >=>  >=>  ConfigmgrApiHandler.ComDayCqDamS7damCommonPostServletsSetCreateHandler;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.dam.s7dam.common.post.servlets.SetModifyHandler" >=>  >=>  ConfigmgrApiHandler.ComDayCqDamS7damCommonPostServletsSetModifyHandler;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.dam.s7dam.common.process.VideoThumbnailDownloadProcess" >=>  >=>  ConfigmgrApiHandler.ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcess;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.dam.s7dam.common.S7damDamChangeEventListener" >=>  >=>  ConfigmgrApiHandler.ComDayCqDamS7damCommonS7damDamChangeEventListener;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.dam.s7dam.common.servlets.S7damProductInfoServlet" >=>  >=>  ConfigmgrApiHandler.ComDayCqDamS7damCommonServletsS7damProductInfoServlet;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.dam.s7dam.common.video.impl.VideoProxyClientServiceImpl" >=>  >=>  ConfigmgrApiHandler.ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImpl;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.dam.scene7.impl.Scene7APIClientImpl" >=>  >=>  ConfigmgrApiHandler.ComDayCqDamScene7ImplScene7APIClientImpl;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.dam.scene7.impl.Scene7AssetMimeTypeServiceImpl" >=>  >=>  ConfigmgrApiHandler.ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImpl;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.dam.scene7.impl.Scene7ConfigurationEventListener" >=>  >=>  ConfigmgrApiHandler.ComDayCqDamScene7ImplScene7ConfigurationEventListener;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.dam.scene7.impl.Scene7DamChangeEventListener" >=>  >=>  ConfigmgrApiHandler.ComDayCqDamScene7ImplScene7DamChangeEventListener;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.dam.scene7.impl.Scene7FlashTemplatesServiceImpl" >=>  >=>  ConfigmgrApiHandler.ComDayCqDamScene7ImplScene7FlashTemplatesServiceImpl;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.dam.scene7.impl.Scene7UploadServiceImpl" >=>  >=>  ConfigmgrApiHandler.ComDayCqDamScene7ImplScene7UploadServiceImpl;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.dam.stock.integration.impl.cache.StockCacheConfigurationServiceImpl" >=>  >=>  ConfigmgrApiHandler.ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSer;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.dam.stock.integration.impl.configuration.StockConfigurationImpl" >=>  >=>  ConfigmgrApiHandler.ComDayCqDamStockIntegrationImplConfigurationStockConfiguration;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.dam.video.impl.servlet.VideoTestServlet" >=>  >=>  ConfigmgrApiHandler.ComDayCqDamVideoImplServletVideoTestServlet;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.extwidget.servlets.ImageSpriteServlet" >=>  >=>  ConfigmgrApiHandler.ComDayCqExtwidgetServletsImageSpriteServlet;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.image.internal.font.FontHelper" >=>  >=>  ConfigmgrApiHandler.ComDayCqImageInternalFontFontHelper;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.jcrclustersupport.ClusterStartLevelController" >=>  >=>  ConfigmgrApiHandler.ComDayCqJcrclustersupportClusterStartLevelController;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.mailer.DefaultMailService" >=>  >=>  ConfigmgrApiHandler.ComDayCqMailerDefaultMailService;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.mailer.impl.CqMailingService" >=>  >=>  ConfigmgrApiHandler.ComDayCqMailerImplCqMailingService;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.mailer.impl.email.CqEmailTemplateFactory" >=>  >=>  ConfigmgrApiHandler.ComDayCqMailerImplEmailCqEmailTemplateFactory;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.mailer.impl.email.CqRetrieverTemplateFactory" >=>  >=>  ConfigmgrApiHandler.ComDayCqMailerImplEmailCqRetrieverTemplateFactory;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.mcm.campaign.impl.IntegrationConfigImpl" >=>  >=>  ConfigmgrApiHandler.ComDayCqMcmCampaignImplIntegrationConfigImpl;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.mcm.campaign.importer.PersonalizedTextHandlerFactory" >=>  >=>  ConfigmgrApiHandler.ComDayCqMcmCampaignImporterPersonalizedTextHandlerFactory;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.mcm.core.newsletter.NewsletterEmailServiceImpl" >=>  >=>  ConfigmgrApiHandler.ComDayCqMcmCoreNewsletterNewsletterEmailServiceImpl;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.mcm.impl.MCMConfiguration" >=>  >=>  ConfigmgrApiHandler.ComDayCqMcmImplMCMConfiguration;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.mcm.landingpage.parser.taghandlers.cta.ClickThroughComponentTagHandlerFactory" >=>  >=>  ConfigmgrApiHandler.ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponen;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.mcm.landingpage.parser.taghandlers.cta.GraphicalClickThroughComponentTagHandlerFactory" >=>  >=>  ConfigmgrApiHandler.ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThroug;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.mcm.landingpage.parser.taghandlers.cta.LeadFormCTAComponentTagHandlerFactory" >=>  >=>  ConfigmgrApiHandler.ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponent;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.mcm.landingpage.parser.taghandlers.mbox.MBoxExperienceTagHandlerFactory" >=>  >=>  ConfigmgrApiHandler.ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHa;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.mcm.landingpage.parser.taghandlers.mbox.TargetComponentTagHandlerFactory" >=>  >=>  ConfigmgrApiHandler.ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagH;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.notification.impl.NotificationServiceImpl" >=>  >=>  ConfigmgrApiHandler.ComDayCqNotificationImplNotificationServiceImpl;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.personalization.impl.servlets.TargetingConfigurationServlet" >=>  >=>  ConfigmgrApiHandler.ComDayCqPersonalizationImplServletsTargetingConfigurationServlet;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.polling.importer.impl.ManagedPollConfigImpl" >=>  >=>  ConfigmgrApiHandler.ComDayCqPollingImporterImplManagedPollConfigImpl;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.polling.importer.impl.ManagedPollingImporterImpl" >=>  >=>  ConfigmgrApiHandler.ComDayCqPollingImporterImplManagedPollingImporterImpl;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.polling.importer.impl.PollingImporterImpl" >=>  >=>  ConfigmgrApiHandler.ComDayCqPollingImporterImplPollingImporterImpl;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.replication.audit.ReplicationEventListener" >=>  >=>  ConfigmgrApiHandler.ComDayCqReplicationAuditReplicationEventListener;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.replication.content.StaticContentBuilder" >=>  >=>  ConfigmgrApiHandler.ComDayCqReplicationContentStaticContentBuilder;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.replication.impl.AgentManagerImpl" >=>  >=>  ConfigmgrApiHandler.ComDayCqReplicationImplAgentManagerImpl;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.replication.impl.content.durbo.BinaryLessContentBuilder" >=>  >=>  ConfigmgrApiHandler.ComDayCqReplicationImplContentDurboBinaryLessContentBuilder;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.replication.impl.content.durbo.DurboImportConfigurationProviderService" >=>  >=>  ConfigmgrApiHandler.ComDayCqReplicationImplContentDurboDurboImportConfigurationProv;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.replication.impl.ReplicationContentFactoryProviderImpl" >=>  >=>  ConfigmgrApiHandler.ComDayCqReplicationImplReplicationContentFactoryProviderImpl;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.replication.impl.ReplicationReceiverImpl" >=>  >=>  ConfigmgrApiHandler.ComDayCqReplicationImplReplicationReceiverImpl;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.replication.impl.ReplicatorImpl" >=>  >=>  ConfigmgrApiHandler.ComDayCqReplicationImplReplicatorImpl;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.replication.impl.ReverseReplicator" >=>  >=>  ConfigmgrApiHandler.ComDayCqReplicationImplReverseReplicator;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.replication.impl.transport.BinaryLessTransportHandler" >=>  >=>  ConfigmgrApiHandler.ComDayCqReplicationImplTransportBinaryLessTransportHandler;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.replication.impl.transport.Http" >=>  >=>  ConfigmgrApiHandler.ComDayCqReplicationImplTransportHttp;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.reporting.impl.cache.CacheImpl" >=>  >=>  ConfigmgrApiHandler.ComDayCqReportingImplCacheCacheImpl;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.reporting.impl.ConfigServiceImpl" >=>  >=>  ConfigmgrApiHandler.ComDayCqReportingImplConfigServiceImpl;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.reporting.impl.RLogAnalyzer" >=>  >=>  ConfigmgrApiHandler.ComDayCqReportingImplRLogAnalyzer;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.rewriter.linkchecker.impl.LinkCheckerImpl" >=>  >=>  ConfigmgrApiHandler.ComDayCqRewriterLinkcheckerImplLinkCheckerImpl;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.rewriter.linkchecker.impl.LinkCheckerTask" >=>  >=>  ConfigmgrApiHandler.ComDayCqRewriterLinkcheckerImplLinkCheckerTask;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.rewriter.linkchecker.impl.LinkCheckerTransformerFactory" >=>  >=>  ConfigmgrApiHandler.ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactory;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.rewriter.linkchecker.impl.LinkInfoStorageImpl" >=>  >=>  ConfigmgrApiHandler.ComDayCqRewriterLinkcheckerImplLinkInfoStorageImpl;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.rewriter.processor.impl.HtmlParserFactory" >=>  >=>  ConfigmgrApiHandler.ComDayCqRewriterProcessorImplHtmlParserFactory;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.search.impl.builder.QueryBuilderImpl" >=>  >=>  ConfigmgrApiHandler.ComDayCqSearchImplBuilderQueryBuilderImpl;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.search.suggest.impl.SuggestionIndexManagerImpl" >=>  >=>  ConfigmgrApiHandler.ComDayCqSearchSuggestImplSuggestionIndexManagerImpl;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.searchpromote.impl.PublishSearchPromoteConfigHandler" >=>  >=>  ConfigmgrApiHandler.ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandler;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.searchpromote.impl.SearchPromoteServiceImpl" >=>  >=>  ConfigmgrApiHandler.ComDayCqSearchpromoteImplSearchPromoteServiceImpl;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.security.ACLSetup" >=>  >=>  ConfigmgrApiHandler.ComDayCqSecurityACLSetup;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.statistics.impl.StatisticsServiceImpl" >=>  >=>  ConfigmgrApiHandler.ComDayCqStatisticsImplStatisticsServiceImpl;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.tagging.impl.JcrTagManagerFactoryImpl" >=>  >=>  ConfigmgrApiHandler.ComDayCqTaggingImplJcrTagManagerFactoryImpl;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.tagging.impl.search.TagPredicateEvaluator" >=>  >=>  ConfigmgrApiHandler.ComDayCqTaggingImplSearchTagPredicateEvaluator;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.tagging.impl.TagGarbageCollector" >=>  >=>  ConfigmgrApiHandler.ComDayCqTaggingImplTagGarbageCollector;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.wcm.contentsync.impl.handler.PagesUpdateHandler" >=>  >=>  ConfigmgrApiHandler.ComDayCqWcmContentsyncImplHandlerPagesUpdateHandler;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.wcm.contentsync.impl.rewriter.PathRewriterTransformerFactory" >=>  >=>  ConfigmgrApiHandler.ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactor;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.wcm.core.impl.AuthoringUIModeServiceImpl" >=>  >=>  ConfigmgrApiHandler.ComDayCqWcmCoreImplAuthoringUIModeServiceImpl;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.wcm.core.impl.commands.WCMCommandServlet" >=>  >=>  ConfigmgrApiHandler.ComDayCqWcmCoreImplCommandsWCMCommandServlet;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.wcm.core.impl.devicedetection.DeviceIdentificationModeImpl" >=>  >=>  ConfigmgrApiHandler.ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImpl;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.wcm.core.impl.event.PageEventAuditListener" >=>  >=>  ConfigmgrApiHandler.ComDayCqWcmCoreImplEventPageEventAuditListener;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.wcm.core.impl.event.PagePostProcessor" >=>  >=>  ConfigmgrApiHandler.ComDayCqWcmCoreImplEventPagePostProcessor;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.wcm.core.impl.event.RepositoryChangeEventListener" >=>  >=>  ConfigmgrApiHandler.ComDayCqWcmCoreImplEventRepositoryChangeEventListener;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.wcm.core.impl.event.TemplatePostProcessor" >=>  >=>  ConfigmgrApiHandler.ComDayCqWcmCoreImplEventTemplatePostProcessor;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.wcm.core.impl.LanguageManagerImpl" >=>  >=>  ConfigmgrApiHandler.ComDayCqWcmCoreImplLanguageManagerImpl;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.wcm.core.impl.LinkCheckerConfigurationFactoryImpl" >=>  >=>  ConfigmgrApiHandler.ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImpl;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.wcm.core.impl.page.PageInfoAggregatorImpl" >=>  >=>  ConfigmgrApiHandler.ComDayCqWcmCoreImplPagePageInfoAggregatorImpl;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.wcm.core.impl.page.PageManagerFactoryImpl" >=>  >=>  ConfigmgrApiHandler.ComDayCqWcmCoreImplPagePageManagerFactoryImpl;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.wcm.core.impl.references.content.ContentReferenceConfig" >=>  >=>  ConfigmgrApiHandler.ComDayCqWcmCoreImplReferencesContentContentReferenceConfig;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.wcm.core.impl.servlets.contentfinder.AssetViewHandler" >=>  >=>  ConfigmgrApiHandler.ComDayCqWcmCoreImplServletsContentfinderAssetViewHandler;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.wcm.core.impl.servlets.contentfinder.connector.ConnectorViewHandler" >=>  >=>  ConfigmgrApiHandler.ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVie;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.wcm.core.impl.servlets.contentfinder.PageViewHandler" >=>  >=>  ConfigmgrApiHandler.ComDayCqWcmCoreImplServletsContentfinderPageViewHandler;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.wcm.core.impl.servlets.FindReplaceServlet" >=>  >=>  ConfigmgrApiHandler.ComDayCqWcmCoreImplServletsFindReplaceServlet;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.wcm.core.impl.servlets.ReferenceSearchServlet" >=>  >=>  ConfigmgrApiHandler.ComDayCqWcmCoreImplServletsReferenceSearchServlet;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.wcm.core.impl.servlets.ThumbnailServlet" >=>  >=>  ConfigmgrApiHandler.ComDayCqWcmCoreImplServletsThumbnailServlet;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.wcm.core.impl.utils.DefaultPageNameValidator" >=>  >=>  ConfigmgrApiHandler.ComDayCqWcmCoreImplUtilsDefaultPageNameValidator;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.wcm.core.impl.variants.PageVariantsProviderImpl" >=>  >=>  ConfigmgrApiHandler.ComDayCqWcmCoreImplVariantsPageVariantsProviderImpl;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.wcm.core.impl.VersionManagerImpl" >=>  >=>  ConfigmgrApiHandler.ComDayCqWcmCoreImplVersionManagerImpl;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.wcm.core.impl.VersionPurgeTask" >=>  >=>  ConfigmgrApiHandler.ComDayCqWcmCoreImplVersionPurgeTask;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.wcm.core.impl.WCMDebugFilter" >=>  >=>  ConfigmgrApiHandler.ComDayCqWcmCoreImplWCMDebugFilter;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.wcm.core.impl.WCMDeveloperModeFilter" >=>  >=>  ConfigmgrApiHandler.ComDayCqWcmCoreImplWCMDeveloperModeFilter;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.wcm.core.impl.warp.TimeWarpFilter" >=>  >=>  ConfigmgrApiHandler.ComDayCqWcmCoreImplWarpTimeWarpFilter;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.wcm.core.mvt.MVTStatisticsImpl" >=>  >=>  ConfigmgrApiHandler.ComDayCqWcmCoreMvtMVTStatisticsImpl;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.wcm.core.stats.PageViewStatisticsImpl" >=>  >=>  ConfigmgrApiHandler.ComDayCqWcmCoreStatsPageViewStatisticsImpl;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.wcm.core.WCMRequestFilter" >=>  >=>  ConfigmgrApiHandler.ComDayCqWcmCoreWCMRequestFilter;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.wcm.designimporter.DesignPackageImporter" >=>  >=>  ConfigmgrApiHandler.ComDayCqWcmDesignimporterDesignPackageImporter;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.wcm.designimporter.impl.CanvasBuilderImpl" >=>  >=>  ConfigmgrApiHandler.ComDayCqWcmDesignimporterImplCanvasBuilderImpl;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.wcm.designimporter.impl.CanvasPageDeleteHandler" >=>  >=>  ConfigmgrApiHandler.ComDayCqWcmDesignimporterImplCanvasPageDeleteHandler;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.wcm.designimporter.impl.EntryPreprocessorImpl" >=>  >=>  ConfigmgrApiHandler.ComDayCqWcmDesignimporterImplEntryPreprocessorImpl;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.wcm.designimporter.impl.MobileCanvasBuilderImpl" >=>  >=>  ConfigmgrApiHandler.ComDayCqWcmDesignimporterImplMobileCanvasBuilderImpl;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.CanvasComponentTagHandlerFactory" >=>  >=>  ConfigmgrApiHandler.ComDayCqWcmDesignimporterParserTaghandlersFactoryCanvasCompone;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.DefaultComponentTagHandlerFactory" >=>  >=>  ConfigmgrApiHandler.ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultCompon;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.DefaultTagHandlerFactory" >=>  >=>  ConfigmgrApiHandler.ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultTagHan;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.HeadTagHandlerFactory" >=>  >=>  ConfigmgrApiHandler.ComDayCqWcmDesignimporterParserTaghandlersFactoryHeadTagHandle;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.IFrameTagHandlerFactory" >=>  >=>  ConfigmgrApiHandler.ComDayCqWcmDesignimporterParserTaghandlersFactoryIFrameTagHand;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.ImageComponentTagHandlerFactory" >=>  >=>  ConfigmgrApiHandler.ComDayCqWcmDesignimporterParserTaghandlersFactoryImageComponen;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.ImgTagHandlerFactory" >=>  >=>  ConfigmgrApiHandler.ComDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandler;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.InlineScriptTagHandlerFactory" >=>  >=>  ConfigmgrApiHandler.ComDayCqWcmDesignimporterParserTaghandlersFactoryInlineScriptT;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.LinkTagHandlerFactory" >=>  >=>  ConfigmgrApiHandler.ComDayCqWcmDesignimporterParserTaghandlersFactoryLinkTagHandle;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.MetaTagHandlerFactory" >=>  >=>  ConfigmgrApiHandler.ComDayCqWcmDesignimporterParserTaghandlersFactoryMetaTagHandle;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.NonScriptTagHandlerFactory" >=>  >=>  ConfigmgrApiHandler.ComDayCqWcmDesignimporterParserTaghandlersFactoryNonScriptTagH;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.ParsysComponentTagHandlerFactory" >=>  >=>  ConfigmgrApiHandler.ComDayCqWcmDesignimporterParserTaghandlersFactoryParsysCompone;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.ScriptTagHandlerFactory" >=>  >=>  ConfigmgrApiHandler.ComDayCqWcmDesignimporterParserTaghandlersFactoryScriptTagHand;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.StyleTagHandlerFactory" >=>  >=>  ConfigmgrApiHandler.ComDayCqWcmDesignimporterParserTaghandlersFactoryStyleTagHandl;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.TextComponentTagHandlerFactory" >=>  >=>  ConfigmgrApiHandler.ComDayCqWcmDesignimporterParserTaghandlersFactoryTextComponent;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.TitleComponentTagHandlerFactory" >=>  >=>  ConfigmgrApiHandler.ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleComponen;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.TitleTagHandlerFactory" >=>  >=>  ConfigmgrApiHandler.ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleTagHandl;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.wcm.foundation.forms.impl.FormChooserServlet" >=>  >=>  ConfigmgrApiHandler.ComDayCqWcmFoundationFormsImplFormChooserServlet;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.wcm.foundation.forms.impl.FormParagraphPostProcessor" >=>  >=>  ConfigmgrApiHandler.ComDayCqWcmFoundationFormsImplFormParagraphPostProcessor;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.wcm.foundation.forms.impl.FormsHandlingServlet" >=>  >=>  ConfigmgrApiHandler.ComDayCqWcmFoundationFormsImplFormsHandlingServlet;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.wcm.foundation.forms.impl.MailServlet" >=>  >=>  ConfigmgrApiHandler.ComDayCqWcmFoundationFormsImplMailServlet;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.wcm.foundation.impl.AdaptiveImageComponentServlet" >=>  >=>  ConfigmgrApiHandler.ComDayCqWcmFoundationImplAdaptiveImageComponentServlet;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.wcm.foundation.impl.HTTPAuthHandler" >=>  >=>  ConfigmgrApiHandler.ComDayCqWcmFoundationImplHTTPAuthHandler;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.wcm.foundation.impl.PageImpressionsTracker" >=>  >=>  ConfigmgrApiHandler.ComDayCqWcmFoundationImplPageImpressionsTracker;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.wcm.foundation.impl.PageRedirectServlet" >=>  >=>  ConfigmgrApiHandler.ComDayCqWcmFoundationImplPageRedirectServlet;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.wcm.foundation.security.impl.DefaultAttachmentTypeBlacklistService" >=>  >=>  ConfigmgrApiHandler.ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklist;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.wcm.foundation.security.impl.SaferSlingPostValidatorImpl" >=>  >=>  ConfigmgrApiHandler.ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImpl;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.wcm.mobile.core.impl.device.DeviceInfoTransformerFactory" >=>  >=>  ConfigmgrApiHandler.ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactory;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.wcm.mobile.core.impl.redirect.RedirectFilter" >=>  >=>  ConfigmgrApiHandler.ComDayCqWcmMobileCoreImplRedirectRedirectFilter;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.wcm.msm.impl.actions.ContentCopyActionFactory" >=>  >=>  ConfigmgrApiHandler.ComDayCqWcmMsmImplActionsContentCopyActionFactory;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.wcm.msm.impl.actions.ContentDeleteActionFactory" >=>  >=>  ConfigmgrApiHandler.ComDayCqWcmMsmImplActionsContentDeleteActionFactory;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.wcm.msm.impl.actions.ContentUpdateActionFactory" >=>  >=>  ConfigmgrApiHandler.ComDayCqWcmMsmImplActionsContentUpdateActionFactory;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.wcm.msm.impl.actions.OrderChildrenActionFactory" >=>  >=>  ConfigmgrApiHandler.ComDayCqWcmMsmImplActionsOrderChildrenActionFactory;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.wcm.msm.impl.actions.PageMoveActionFactory" >=>  >=>  ConfigmgrApiHandler.ComDayCqWcmMsmImplActionsPageMoveActionFactory;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.wcm.msm.impl.actions.ReferencesUpdateActionFactory" >=>  >=>  ConfigmgrApiHandler.ComDayCqWcmMsmImplActionsReferencesUpdateActionFactory;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.wcm.msm.impl.actions.VersionCopyActionFactory" >=>  >=>  ConfigmgrApiHandler.ComDayCqWcmMsmImplActionsVersionCopyActionFactory;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.wcm.msm.impl.LiveRelationshipManagerImpl" >=>  >=>  ConfigmgrApiHandler.ComDayCqWcmMsmImplLiveRelationshipManagerImpl;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.wcm.msm.impl.RolloutManagerImpl" >=>  >=>  ConfigmgrApiHandler.ComDayCqWcmMsmImplRolloutManagerImpl;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.wcm.msm.impl.servlets.AuditLogServlet" >=>  >=>  ConfigmgrApiHandler.ComDayCqWcmMsmImplServletsAuditLogServlet;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.wcm.notification.email.impl.EmailChannel" >=>  >=>  ConfigmgrApiHandler.ComDayCqWcmNotificationEmailImplEmailChannel;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.wcm.notification.impl.NotificationManagerImpl" >=>  >=>  ConfigmgrApiHandler.ComDayCqWcmNotificationImplNotificationManagerImpl;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.wcm.scripting.impl.BVPManager" >=>  >=>  ConfigmgrApiHandler.ComDayCqWcmScriptingImplBVPManager;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.wcm.undo.UndoConfig" >=>  >=>  ConfigmgrApiHandler.ComDayCqWcmUndoUndoConfig;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.wcm.webservicesupport.impl.ReplicationEventListener" >=>  >=>  ConfigmgrApiHandler.ComDayCqWcmWebservicesupportImplReplicationEventListener;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.wcm.workflow.impl.WcmWorkflowServiceImpl" >=>  >=>  ConfigmgrApiHandler.ComDayCqWcmWorkflowImplWcmWorkflowServiceImpl;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.wcm.workflow.impl.WorkflowPackageInfoProvider" >=>  >=>  ConfigmgrApiHandler.ComDayCqWcmWorkflowImplWorkflowPackageInfoProvider;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.widget.impl.HtmlLibraryManagerImpl" >=>  >=>  ConfigmgrApiHandler.ComDayCqWidgetImplHtmlLibraryManagerImpl;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.widget.impl.WidgetExtensionProviderImpl" >=>  >=>  ConfigmgrApiHandler.ComDayCqWidgetImplWidgetExtensionProviderImpl;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.workflow.impl.email.EMailNotificationService" >=>  >=>  ConfigmgrApiHandler.ComDayCqWorkflowImplEmailEMailNotificationService;
      HttpPost >=> route "/system/console/configMgr/com.day.cq.workflow.impl.email.TaskEMailNotificationService" >=>  >=>  ConfigmgrApiHandler.ComDayCqWorkflowImplEmailTaskEMailNotificationService;
      HttpPost >=> route "/system/console/configMgr/com.day.crx.security.token.impl.impl.TokenAuthenticationHandler" >=>  >=>  ConfigmgrApiHandler.ComDayCrxSecurityTokenImplImplTokenAuthenticationHandler;
      HttpPost >=> route "/system/console/configMgr/com.day.crx.security.token.impl.TokenCleanupTask" >=>  >=>  ConfigmgrApiHandler.ComDayCrxSecurityTokenImplTokenCleanupTask;
      HttpPost >=> route "/system/console/configMgr/Guide Localization Service" >=>  >=>  ConfigmgrApiHandler.GuideLocalizationService;
      HttpPost >=> route "/system/console/configMgr/MessagingUserComponentFactory" >=>  >=>  ConfigmgrApiHandler.MessagingUserComponentFactory;
      HttpPost >=> route "/system/console/configMgr/org.apache.aries.jmx.framework.StateConfig" >=>  >=>  ConfigmgrApiHandler.OrgApacheAriesJmxFrameworkStateConfig;
      HttpPost >=> route "/system/console/configMgr/org.apache.felix.eventadmin.impl.EventAdmin" >=>  >=>  ConfigmgrApiHandler.OrgApacheFelixEventadminImplEventAdmin;
      HttpPost >=> route "/system/console/configMgr/org.apache.felix.http" >=>  >=>  ConfigmgrApiHandler.OrgApacheFelixHttp;
      HttpPost >=> route "/system/console/configMgr/org.apache.felix.http.sslfilter.SslFilter" >=>  >=>  ConfigmgrApiHandler.OrgApacheFelixHttpSslfilterSslFilter;
      HttpPost >=> route "/system/console/configMgr/org.apache.felix.jaas.Configuration.factory" >=>  >=>  ConfigmgrApiHandler.OrgApacheFelixJaasConfigurationFactory;
      HttpPost >=> route "/system/console/configMgr/org.apache.felix.jaas.ConfigurationSpi" >=>  >=>  ConfigmgrApiHandler.OrgApacheFelixJaasConfigurationSpi;
      HttpPost >=> route "/system/console/configMgr/org.apache.felix.scr.ScrService" >=>  >=>  ConfigmgrApiHandler.OrgApacheFelixScrScrService;
      HttpPost >=> route "/system/console/configMgr/org.apache.felix.systemready.impl.ComponentsCheck" >=>  >=>  ConfigmgrApiHandler.OrgApacheFelixSystemreadyImplComponentsCheck;
      HttpPost >=> route "/system/console/configMgr/org.apache.felix.systemready.impl.FrameworkStartCheck" >=>  >=>  ConfigmgrApiHandler.OrgApacheFelixSystemreadyImplFrameworkStartCheck;
      HttpPost >=> route "/system/console/configMgr/org.apache.felix.systemready.impl.ServicesCheck" >=>  >=>  ConfigmgrApiHandler.OrgApacheFelixSystemreadyImplServicesCheck;
      HttpPost >=> route "/system/console/configMgr/org.apache.felix.systemready.impl.servlet.SystemAliveServlet" >=>  >=>  ConfigmgrApiHandler.OrgApacheFelixSystemreadyImplServletSystemAliveServlet;
      HttpPost >=> route "/system/console/configMgr/org.apache.felix.systemready.impl.servlet.SystemReadyServlet" >=>  >=>  ConfigmgrApiHandler.OrgApacheFelixSystemreadyImplServletSystemReadyServlet;
      HttpPost >=> route "/system/console/configMgr/org.apache.felix.systemready.SystemReadyMonitor" >=>  >=>  ConfigmgrApiHandler.OrgApacheFelixSystemreadySystemReadyMonitor;
      HttpPost >=> route "/system/console/configMgr/org.apache.felix.webconsole.internal.servlet.OsgiManager" >=>  >=>  ConfigmgrApiHandler.OrgApacheFelixWebconsoleInternalServletOsgiManager;
      HttpPost >=> route "/system/console/configMgr/org.apache.felix.webconsole.plugins.event.internal.PluginServlet" >=>  >=>  ConfigmgrApiHandler.OrgApacheFelixWebconsolePluginsEventInternalPluginServlet;
      HttpPost >=> route "/system/console/configMgr/org.apache.felix.webconsole.plugins.memoryusage.internal.MemoryUsageConfigurator" >=>  >=>  ConfigmgrApiHandler.OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCo;
      HttpPost >=> route "/system/console/configMgr/org.apache.http.proxyconfigurator" >=>  >=>  ConfigmgrApiHandler.OrgApacheHttpProxyconfigurator;
      HttpPost >=> route "/system/console/configMgr/org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreTextProviderService" >=>  >=>  ConfigmgrApiHandler.OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProvider;
      HttpPost >=> route "/system/console/configMgr/org.apache.jackrabbit.oak.plugins.blob.datastore.FileDataStore" >=>  >=>  ConfigmgrApiHandler.OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStore;
      HttpPost >=> route "/system/console/configMgr/org.apache.jackrabbit.oak.plugins.document.DocumentNodeStoreService" >=>  >=>  ConfigmgrApiHandler.OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreService;
      HttpPost >=> route "/system/console/configMgr/org.apache.jackrabbit.oak.plugins.document.DocumentNodeStoreServicePreset" >=>  >=>  ConfigmgrApiHandler.OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePre;
      HttpPost >=> route "/system/console/configMgr/org.apache.jackrabbit.oak.plugins.document.secondary.SecondaryStoreCacheService" >=>  >=>  ConfigmgrApiHandler.OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCac;
      HttpPost >=> route "/system/console/configMgr/org.apache.jackrabbit.oak.plugins.index.AsyncIndexerService" >=>  >=>  ConfigmgrApiHandler.OrgApacheJackrabbitOakPluginsIndexAsyncIndexerService;
      HttpPost >=> route "/system/console/configMgr/org.apache.jackrabbit.oak.plugins.index.lucene.LuceneIndexProviderService" >=>  >=>  ConfigmgrApiHandler.OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServ;
      HttpPost >=> route "/system/console/configMgr/org.apache.jackrabbit.oak.plugins.index.solr.osgi.EmbeddedSolrServerConfigurationProvider" >=>  >=>  ConfigmgrApiHandler.OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCo;
      HttpPost >=> route "/system/console/configMgr/org.apache.jackrabbit.oak.plugins.index.solr.osgi.NodeStateSolrServersObserverService" >=>  >=>  ConfigmgrApiHandler.OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServers;
      HttpPost >=> route "/system/console/configMgr/org.apache.jackrabbit.oak.plugins.index.solr.osgi.OakSolrConfigurationProviderService" >=>  >=>  ConfigmgrApiHandler.OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfiguration;
      HttpPost >=> route "/system/console/configMgr/org.apache.jackrabbit.oak.plugins.index.solr.osgi.RemoteSolrServerConfigurationProvider" >=>  >=>  ConfigmgrApiHandler.OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConf;
      HttpPost >=> route "/system/console/configMgr/org.apache.jackrabbit.oak.plugins.index.solr.osgi.SolrQueryIndexProviderService" >=>  >=>  ConfigmgrApiHandler.OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvid;
      HttpPost >=> route "/system/console/configMgr/org.apache.jackrabbit.oak.plugins.index.solr.osgi.SolrServerProviderService" >=>  >=>  ConfigmgrApiHandler.OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSe;
      HttpPost >=> route "/system/console/configMgr/org.apache.jackrabbit.oak.plugins.metric.StatisticsProviderFactory" >=>  >=>  ConfigmgrApiHandler.OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactory;
      HttpPost >=> route "/system/console/configMgr/org.apache.jackrabbit.oak.plugins.observation.ChangeCollectorProvider" >=>  >=>  ConfigmgrApiHandler.OrgApacheJackrabbitOakPluginsObservationChangeCollectorProvider;
      HttpPost >=> route "/system/console/configMgr/org.apache.jackrabbit.oak.query.QueryEngineSettingsService" >=>  >=>  ConfigmgrApiHandler.OrgApacheJackrabbitOakQueryQueryEngineSettingsService;
      HttpPost >=> route "/system/console/configMgr/org.apache.jackrabbit.oak.security.authentication.AuthenticationConfigurationImpl" >=>  >=>  ConfigmgrApiHandler.OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfig;
      HttpPost >=> route "/system/console/configMgr/org.apache.jackrabbit.oak.security.authentication.ldap.impl.LdapIdentityProvider" >=>  >=>  ConfigmgrApiHandler.OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdenti;
      HttpPost >=> route "/system/console/configMgr/org.apache.jackrabbit.oak.security.authentication.token.TokenConfigurationImpl" >=>  >=>  ConfigmgrApiHandler.OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfigura;
      HttpPost >=> route "/system/console/configMgr/org.apache.jackrabbit.oak.security.authorization.AuthorizationConfigurationImpl" >=>  >=>  ConfigmgrApiHandler.OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigur;
      HttpPost >=> route "/system/console/configMgr/org.apache.jackrabbit.oak.security.internal.SecurityProviderRegistration" >=>  >=>  ConfigmgrApiHandler.OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistrati;
      HttpPost >=> route "/system/console/configMgr/org.apache.jackrabbit.oak.security.user.RandomAuthorizableNodeName" >=>  >=>  ConfigmgrApiHandler.OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeName;
      HttpPost >=> route "/system/console/configMgr/org.apache.jackrabbit.oak.security.user.UserConfigurationImpl" >=>  >=>  ConfigmgrApiHandler.OrgApacheJackrabbitOakSecurityUserUserConfigurationImpl;
      HttpPost >=> route "/system/console/configMgr/org.apache.jackrabbit.oak.segment.azure.AzureSegmentStoreService" >=>  >=>  ConfigmgrApiHandler.OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreService;
      HttpPost >=> route "/system/console/configMgr/org.apache.jackrabbit.oak.segment.SegmentNodeStoreFactory" >=>  >=>  ConfigmgrApiHandler.OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactory;
      HttpPost >=> route "/system/console/configMgr/org.apache.jackrabbit.oak.segment.SegmentNodeStoreMonitorService" >=>  >=>  ConfigmgrApiHandler.OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorService;
      HttpPost >=> route "/system/console/configMgr/org.apache.jackrabbit.oak.segment.SegmentNodeStoreService" >=>  >=>  ConfigmgrApiHandler.OrgApacheJackrabbitOakSegmentSegmentNodeStoreService;
      HttpPost >=> route "/system/console/configMgr/org.apache.jackrabbit.oak.segment.standby.store.StandbyStoreService" >=>  >=>  ConfigmgrApiHandler.OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreService;
      HttpPost >=> route "/system/console/configMgr/org.apache.jackrabbit.oak.spi.security.authentication.external.impl.DefaultSyncHandler" >=>  >=>  ConfigmgrApiHandler.OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDe;
      HttpPost >=> route "/system/console/configMgr/org.apache.jackrabbit.oak.spi.security.authentication.external.impl.ExternalLoginModuleFactory" >=>  >=>  ConfigmgrApiHandler.OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplEx;
      HttpPost >=> route "/system/console/configMgr/org.apache.jackrabbit.oak.spi.security.authentication.external.impl.principal.ExternalPrincipalConfiguration" >=>  >=>  ConfigmgrApiHandler.OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPr;
      HttpPost >=> route "/system/console/configMgr/org.apache.jackrabbit.oak.spi.security.authorization.cug.impl.CugConfiguration" >=>  >=>  ConfigmgrApiHandler.OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfi;
      HttpPost >=> route "/system/console/configMgr/org.apache.jackrabbit.oak.spi.security.authorization.cug.impl.CugExcludeImpl" >=>  >=>  ConfigmgrApiHandler.OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExclu;
      HttpPost >=> route "/system/console/configMgr/org.apache.jackrabbit.oak.spi.security.user.action.DefaultAuthorizableActionProvider" >=>  >=>  ConfigmgrApiHandler.OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizable;
      HttpPost >=> route "/system/console/configMgr/org.apache.jackrabbit.vault.packaging.impl.PackagingImpl" >=>  >=>  ConfigmgrApiHandler.OrgApacheJackrabbitVaultPackagingImplPackagingImpl;
      HttpPost >=> route "/system/console/configMgr/org.apache.jackrabbit.vault.packaging.registry.impl.FSPackageRegistry" >=>  >=>  ConfigmgrApiHandler.OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistry;
      HttpPost >=> route "/system/console/configMgr/org.apache.sling.auth.core.impl.LogoutServlet" >=>  >=>  ConfigmgrApiHandler.OrgApacheSlingAuthCoreImplLogoutServlet;
      HttpPost >=> route "/system/console/configMgr/org.apache.sling.caconfig.impl.ConfigurationBindingsValueProvider" >=>  >=>  ConfigmgrApiHandler.OrgApacheSlingCaconfigImplConfigurationBindingsValueProvider;
      HttpPost >=> route "/system/console/configMgr/org.apache.sling.caconfig.impl.ConfigurationResolverImpl" >=>  >=>  ConfigmgrApiHandler.OrgApacheSlingCaconfigImplConfigurationResolverImpl;
      HttpPost >=> route "/system/console/configMgr/org.apache.sling.caconfig.impl.def.DefaultConfigurationInheritanceStrategy" >=>  >=>  ConfigmgrApiHandler.OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStra;
      HttpPost >=> route "/system/console/configMgr/org.apache.sling.caconfig.impl.def.DefaultConfigurationPersistenceStrategy" >=>  >=>  ConfigmgrApiHandler.OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStra;
      HttpPost >=> route "/system/console/configMgr/org.apache.sling.caconfig.impl.override.OsgiConfigurationOverrideProvider" >=>  >=>  ConfigmgrApiHandler.OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProvi;
      HttpPost >=> route "/system/console/configMgr/org.apache.sling.caconfig.impl.override.SystemPropertyConfigurationOverrideProvider" >=>  >=>  ConfigmgrApiHandler.OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOve;
      HttpPost >=> route "/system/console/configMgr/org.apache.sling.caconfig.management.impl.ConfigurationManagementSettingsImpl" >=>  >=>  ConfigmgrApiHandler.OrgApacheSlingCaconfigManagementImplConfigurationManagementSetti;
      HttpPost >=> route "/system/console/configMgr/org.apache.sling.caconfig.resource.impl.def.DefaultConfigurationResourceResolvingStrategy" >=>  >=>  ConfigmgrApiHandler.OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResour;
      HttpPost >=> route "/system/console/configMgr/org.apache.sling.caconfig.resource.impl.def.DefaultContextPathStrategy" >=>  >=>  ConfigmgrApiHandler.OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategy;
      HttpPost >=> route "/system/console/configMgr/org.apache.sling.commons.html.internal.TagsoupHtmlParser" >=>  >=>  ConfigmgrApiHandler.OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParser;
      HttpPost >=> route "/system/console/configMgr/org.apache.sling.commons.log.LogManager" >=>  >=>  ConfigmgrApiHandler.OrgApacheSlingCommonsLogLogManager;
      HttpPost >=> route "/system/console/configMgr/org.apache.sling.commons.log.LogManager.factory.config" >=>  >=>  ConfigmgrApiHandler.OrgApacheSlingCommonsLogLogManagerFactoryConfig;
      HttpPost >=> route "/system/console/configMgr/org.apache.sling.commons.log.LogManager.factory.writer" >=>  >=>  ConfigmgrApiHandler.OrgApacheSlingCommonsLogLogManagerFactoryWriter;
      HttpPost >=> route "/system/console/configMgr/org.apache.sling.commons.metrics.internal.LogReporter" >=>  >=>  ConfigmgrApiHandler.OrgApacheSlingCommonsMetricsInternalLogReporter;
      HttpPost >=> route "/system/console/configMgr/org.apache.sling.commons.metrics.rrd4j.impl.CodahaleMetricsReporter" >=>  >=>  ConfigmgrApiHandler.OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporter;
      HttpPost >=> route "/system/console/configMgr/org.apache.sling.commons.mime.internal.MimeTypeServiceImpl" >=>  >=>  ConfigmgrApiHandler.OrgApacheSlingCommonsMimeInternalMimeTypeServiceImpl;
      HttpPost >=> route "/system/console/configMgr/org.apache.sling.commons.scheduler.impl.QuartzScheduler" >=>  >=>  ConfigmgrApiHandler.OrgApacheSlingCommonsSchedulerImplQuartzScheduler;
      HttpPost >=> route "/system/console/configMgr/org.apache.sling.commons.scheduler.impl.SchedulerHealthCheck" >=>  >=>  ConfigmgrApiHandler.OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheck;
      HttpPost >=> route "/system/console/configMgr/org.apache.sling.commons.threads.impl.DefaultThreadPool.factory" >=>  >=>  ConfigmgrApiHandler.OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactory;
      HttpPost >=> route "/system/console/configMgr/org.apache.sling.datasource.DataSourceFactory" >=>  >=>  ConfigmgrApiHandler.OrgApacheSlingDatasourceDataSourceFactory;
      HttpPost >=> route "/system/console/configMgr/org.apache.sling.datasource.JNDIDataSourceFactory" >=>  >=>  ConfigmgrApiHandler.OrgApacheSlingDatasourceJNDIDataSourceFactory;
      HttpPost >=> route "/system/console/configMgr/org.apache.sling.discovery.oak.Config" >=>  >=>  ConfigmgrApiHandler.OrgApacheSlingDiscoveryOakConfig;
      HttpPost >=> route "/system/console/configMgr/org.apache.sling.discovery.oak.SynchronizedClocksHealthCheck" >=>  >=>  ConfigmgrApiHandler.OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheck;
      HttpPost >=> route "/system/console/configMgr/org.apache.sling.distribution.agent.impl.ForwardDistributionAgentFactory" >=>  >=>  ConfigmgrApiHandler.OrgApacheSlingDistributionAgentImplForwardDistributionAgentFacto;
      HttpPost >=> route "/system/console/configMgr/org.apache.sling.distribution.agent.impl.PrivilegeDistributionRequestAuthorizationStrategyFactory" >=>  >=>  ConfigmgrApiHandler.OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestA;
      HttpPost >=> route "/system/console/configMgr/org.apache.sling.distribution.agent.impl.QueueDistributionAgentFactory" >=>  >=>  ConfigmgrApiHandler.OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactory;
      HttpPost >=> route "/system/console/configMgr/org.apache.sling.distribution.agent.impl.ReverseDistributionAgentFactory" >=>  >=>  ConfigmgrApiHandler.OrgApacheSlingDistributionAgentImplReverseDistributionAgentFacto;
      HttpPost >=> route "/system/console/configMgr/org.apache.sling.distribution.agent.impl.SimpleDistributionAgentFactory" >=>  >=>  ConfigmgrApiHandler.OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactor;
      HttpPost >=> route "/system/console/configMgr/org.apache.sling.distribution.agent.impl.SyncDistributionAgentFactory" >=>  >=>  ConfigmgrApiHandler.OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactory;
      HttpPost >=> route "/system/console/configMgr/org.apache.sling.distribution.monitor.DistributionQueueHealthCheck" >=>  >=>  ConfigmgrApiHandler.OrgApacheSlingDistributionMonitorDistributionQueueHealthCheck;
      HttpPost >=> route "/system/console/configMgr/org.apache.sling.distribution.packaging.impl.exporter.AgentDistributionPackageExporterFactory" >=>  >=>  ConfigmgrApiHandler.OrgApacheSlingDistributionPackagingImplExporterAgentDistributio;
      HttpPost >=> route "/system/console/configMgr/org.apache.sling.distribution.packaging.impl.exporter.LocalDistributionPackageExporterFactory" >=>  >=>  ConfigmgrApiHandler.OrgApacheSlingDistributionPackagingImplExporterLocalDistributio;
      HttpPost >=> route "/system/console/configMgr/org.apache.sling.distribution.packaging.impl.exporter.RemoteDistributionPackageExporterFactory" >=>  >=>  ConfigmgrApiHandler.OrgApacheSlingDistributionPackagingImplExporterRemoteDistributi;
      HttpPost >=> route "/system/console/configMgr/org.apache.sling.distribution.packaging.impl.importer.LocalDistributionPackageImporterFactory" >=>  >=>  ConfigmgrApiHandler.OrgApacheSlingDistributionPackagingImplImporterLocalDistributio;
      HttpPost >=> route "/system/console/configMgr/org.apache.sling.distribution.packaging.impl.importer.RemoteDistributionPackageImporterFactory" >=>  >=>  ConfigmgrApiHandler.OrgApacheSlingDistributionPackagingImplImporterRemoteDistributi;
      HttpPost >=> route "/system/console/configMgr/org.apache.sling.distribution.packaging.impl.importer.RepositoryDistributionPackageImporterFactory" >=>  >=>  ConfigmgrApiHandler.OrgApacheSlingDistributionPackagingImplImporterRepositoryDistri;
      HttpPost >=> route "/system/console/configMgr/org.apache.sling.distribution.resources.impl.DistributionConfigurationResourceProviderFactory" >=>  >=>  ConfigmgrApiHandler.OrgApacheSlingDistributionResourcesImplDistributionConfiguration;
      HttpPost >=> route "/system/console/configMgr/org.apache.sling.distribution.resources.impl.DistributionServiceResourceProviderFactory" >=>  >=>  ConfigmgrApiHandler.OrgApacheSlingDistributionResourcesImplDistributionServiceResour;
      HttpPost >=> route "/system/console/configMgr/org.apache.sling.distribution.serialization.impl.DistributionPackageBuilderFactory" >=>  >=>  ConfigmgrApiHandler.OrgApacheSlingDistributionSerializationImplDistributionPackageBu;
      HttpPost >=> route "/system/console/configMgr/org.apache.sling.distribution.serialization.impl.vlt.VaultDistributionPackageBuilderFactory" >=>  >=>  ConfigmgrApiHandler.OrgApacheSlingDistributionSerializationImplVltVaultDistribution;
      HttpPost >=> route "/system/console/configMgr/org.apache.sling.distribution.transport.impl.UserCredentialsDistributionTransportSecretProvider" >=>  >=>  ConfigmgrApiHandler.OrgApacheSlingDistributionTransportImplUserCredentialsDistributi;
      HttpPost >=> route "/system/console/configMgr/org.apache.sling.distribution.trigger.impl.DistributionEventDistributeDistributionTriggerFactory" >=>  >=>  ConfigmgrApiHandler.OrgApacheSlingDistributionTriggerImplDistributionEventDistribute;
      HttpPost >=> route "/system/console/configMgr/org.apache.sling.distribution.trigger.impl.JcrEventDistributionTriggerFactory" >=>  >=>  ConfigmgrApiHandler.OrgApacheSlingDistributionTriggerImplJcrEventDistributionTrigger;
      HttpPost >=> route "/system/console/configMgr/org.apache.sling.distribution.trigger.impl.PersistedJcrEventDistributionTriggerFactory" >=>  >=>  ConfigmgrApiHandler.OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributi;
      HttpPost >=> route "/system/console/configMgr/org.apache.sling.distribution.trigger.impl.RemoteEventDistributionTriggerFactory" >=>  >=>  ConfigmgrApiHandler.OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrig;
      HttpPost >=> route "/system/console/configMgr/org.apache.sling.distribution.trigger.impl.ResourceEventDistributionTriggerFactory" >=>  >=>  ConfigmgrApiHandler.OrgApacheSlingDistributionTriggerImplResourceEventDistributionTr;
      HttpPost >=> route "/system/console/configMgr/org.apache.sling.distribution.trigger.impl.ScheduledDistributionTriggerFactory" >=>  >=>  ConfigmgrApiHandler.OrgApacheSlingDistributionTriggerImplScheduledDistributionTrigge;
      HttpPost >=> route "/system/console/configMgr/org.apache.sling.engine.impl.auth.SlingAuthenticator" >=>  >=>  ConfigmgrApiHandler.OrgApacheSlingEngineImplAuthSlingAuthenticator;
      HttpPost >=> route "/system/console/configMgr/org.apache.sling.engine.impl.debug.RequestProgressTrackerLogFilter" >=>  >=>  ConfigmgrApiHandler.OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilter;
      HttpPost >=> route "/system/console/configMgr/org.apache.sling.engine.impl.log.RequestLogger" >=>  >=>  ConfigmgrApiHandler.OrgApacheSlingEngineImplLogRequestLogger;
      HttpPost >=> route "/system/console/configMgr/org.apache.sling.engine.impl.log.RequestLoggerService" >=>  >=>  ConfigmgrApiHandler.OrgApacheSlingEngineImplLogRequestLoggerService;
      HttpPost >=> route "/system/console/configMgr/org.apache.sling.engine.impl.SlingMainServlet" >=>  >=>  ConfigmgrApiHandler.OrgApacheSlingEngineImplSlingMainServlet;
      HttpPost >=> route "/system/console/configMgr/org.apache.sling.engine.parameters" >=>  >=>  ConfigmgrApiHandler.OrgApacheSlingEngineParameters;
      HttpPost >=> route "/system/console/configMgr/org.apache.sling.event.impl.EventingThreadPool" >=>  >=>  ConfigmgrApiHandler.OrgApacheSlingEventImplEventingThreadPool;
      HttpPost >=> route "/system/console/configMgr/org.apache.sling.event.impl.jobs.DefaultJobManager" >=>  >=>  ConfigmgrApiHandler.OrgApacheSlingEventImplJobsDefaultJobManager;
      HttpPost >=> route "/system/console/configMgr/org.apache.sling.event.impl.jobs.jcr.PersistenceHandler" >=>  >=>  ConfigmgrApiHandler.OrgApacheSlingEventImplJobsJcrPersistenceHandler;
      HttpPost >=> route "/system/console/configMgr/org.apache.sling.event.impl.jobs.JobConsumerManager" >=>  >=>  ConfigmgrApiHandler.OrgApacheSlingEventImplJobsJobConsumerManager;
      HttpPost >=> route "/system/console/configMgr/org.apache.sling.event.jobs.QueueConfiguration" >=>  >=>  ConfigmgrApiHandler.OrgApacheSlingEventJobsQueueConfiguration;
      HttpPost >=> route "/system/console/configMgr/org.apache.sling.extensions.webconsolesecurityprovider.internal.SlingWebConsoleSecurityProvider" >=>  >=>  ConfigmgrApiHandler.OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingW;
      HttpPost >=> route "/system/console/configMgr/org.apache.sling.featureflags.Feature" >=>  >=>  ConfigmgrApiHandler.OrgApacheSlingFeatureflagsFeature;
      HttpPost >=> route "/system/console/configMgr/org.apache.sling.featureflags.impl.ConfiguredFeature" >=>  >=>  ConfigmgrApiHandler.OrgApacheSlingFeatureflagsImplConfiguredFeature;
      HttpPost >=> route "/system/console/configMgr/org.apache.sling.hapi.impl.HApiUtilImpl" >=>  >=>  ConfigmgrApiHandler.OrgApacheSlingHapiImplHApiUtilImpl;
      HttpPost >=> route "/system/console/configMgr/org.apache.sling.hc.core.impl.CompositeHealthCheck" >=>  >=>  ConfigmgrApiHandler.OrgApacheSlingHcCoreImplCompositeHealthCheck;
      HttpPost >=> route "/system/console/configMgr/org.apache.sling.hc.core.impl.executor.HealthCheckExecutorImpl" >=>  >=>  ConfigmgrApiHandler.OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImpl;
      HttpPost >=> route "/system/console/configMgr/org.apache.sling.hc.core.impl.JmxAttributeHealthCheck" >=>  >=>  ConfigmgrApiHandler.OrgApacheSlingHcCoreImplJmxAttributeHealthCheck;
      HttpPost >=> route "/system/console/configMgr/org.apache.sling.hc.core.impl.ScriptableHealthCheck" >=>  >=>  ConfigmgrApiHandler.OrgApacheSlingHcCoreImplScriptableHealthCheck;
      HttpPost >=> route "/system/console/configMgr/org.apache.sling.hc.core.impl.servlet.HealthCheckExecutorServlet" >=>  >=>  ConfigmgrApiHandler.OrgApacheSlingHcCoreImplServletHealthCheckExecutorServlet;
      HttpPost >=> route "/system/console/configMgr/org.apache.sling.hc.core.impl.servlet.ResultTxtVerboseSerializer" >=>  >=>  ConfigmgrApiHandler.OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializer;
      HttpPost >=> route "/system/console/configMgr/org.apache.sling.i18n.impl.I18NFilter" >=>  >=>  ConfigmgrApiHandler.OrgApacheSlingI18nImplI18NFilter;
      HttpPost >=> route "/system/console/configMgr/org.apache.sling.i18n.impl.JcrResourceBundleProvider" >=>  >=>  ConfigmgrApiHandler.OrgApacheSlingI18nImplJcrResourceBundleProvider;
      HttpPost >=> route "/system/console/configMgr/org.apache.sling.installer.provider.jcr.impl.JcrInstaller" >=>  >=>  ConfigmgrApiHandler.OrgApacheSlingInstallerProviderJcrImplJcrInstaller;
      HttpPost >=> route "/system/console/configMgr/org.apache.sling.jcr.base.internal.LoginAdminWhitelist" >=>  >=>  ConfigmgrApiHandler.OrgApacheSlingJcrBaseInternalLoginAdminWhitelist;
      HttpPost >=> route "/system/console/configMgr/org.apache.sling.jcr.base.internal.LoginAdminWhitelist.fragment" >=>  >=>  ConfigmgrApiHandler.OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragment;
      HttpPost >=> route "/system/console/configMgr/org.apache.sling.jcr.davex.impl.servlets.SlingDavExServlet" >=>  >=>  ConfigmgrApiHandler.OrgApacheSlingJcrDavexImplServletsSlingDavExServlet;
      HttpPost >=> route "/system/console/configMgr/org.apache.sling.jcr.jackrabbit.server.JndiRegistrationSupport" >=>  >=>  ConfigmgrApiHandler.OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupport;
      HttpPost >=> route "/system/console/configMgr/org.apache.sling.jcr.jackrabbit.server.RmiRegistrationSupport" >=>  >=>  ConfigmgrApiHandler.OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupport;
      HttpPost >=> route "/system/console/configMgr/org.apache.sling.jcr.repoinit.impl.RepositoryInitializer" >=>  >=>  ConfigmgrApiHandler.OrgApacheSlingJcrRepoinitImplRepositoryInitializer;
      HttpPost >=> route "/system/console/configMgr/org.apache.sling.jcr.repoinit.RepositoryInitializer" >=>  >=>  ConfigmgrApiHandler.OrgApacheSlingJcrRepoinitRepositoryInitializer;
      HttpPost >=> route "/system/console/configMgr/org.apache.sling.jcr.resource.internal.JcrResourceResolverFactoryImpl" >=>  >=>  ConfigmgrApiHandler.OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImpl;
      HttpPost >=> route "/system/console/configMgr/org.apache.sling.jcr.resource.internal.JcrSystemUserValidator" >=>  >=>  ConfigmgrApiHandler.OrgApacheSlingJcrResourceInternalJcrSystemUserValidator;
      HttpPost >=> route "/system/console/configMgr/org.apache.sling.jcr.resourcesecurity.impl.ResourceAccessGateFactory" >=>  >=>  ConfigmgrApiHandler.OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactory;
      HttpPost >=> route "/system/console/configMgr/org.apache.sling.jcr.webdav.impl.handler.DefaultHandlerService" >=>  >=>  ConfigmgrApiHandler.OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerService;
      HttpPost >=> route "/system/console/configMgr/org.apache.sling.jcr.webdav.impl.handler.DirListingExportHandlerService" >=>  >=>  ConfigmgrApiHandler.OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServic;
      HttpPost >=> route "/system/console/configMgr/org.apache.sling.jcr.webdav.impl.servlets.SimpleWebDavServlet" >=>  >=>  ConfigmgrApiHandler.OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServlet;
      HttpPost >=> route "/system/console/configMgr/org.apache.sling.jmx.provider.impl.JMXResourceProvider" >=>  >=>  ConfigmgrApiHandler.OrgApacheSlingJmxProviderImplJMXResourceProvider;
      HttpPost >=> route "/system/console/configMgr/org.apache.sling.models.impl.ModelAdapterFactory" >=>  >=>  ConfigmgrApiHandler.OrgApacheSlingModelsImplModelAdapterFactory;
      HttpPost >=> route "/system/console/configMgr/org.apache.sling.models.jacksonexporter.impl.ResourceModuleProvider" >=>  >=>  ConfigmgrApiHandler.OrgApacheSlingModelsJacksonexporterImplResourceModuleProvider;
      HttpPost >=> route "/system/console/configMgr/org.apache.sling.resource.inventory.impl.ResourceInventoryPrinterFactory" >=>  >=>  ConfigmgrApiHandler.OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFacto;
      HttpPost >=> route "/system/console/configMgr/org.apache.sling.resourcemerger.impl.MergedResourceProviderFactory" >=>  >=>  ConfigmgrApiHandler.OrgApacheSlingResourcemergerImplMergedResourceProviderFactory;
      HttpPost >=> route "/system/console/configMgr/org.apache.sling.resourcemerger.picker.overriding" >=>  >=>  ConfigmgrApiHandler.OrgApacheSlingResourcemergerPickerOverriding;
      HttpPost >=> route "/system/console/configMgr/org.apache.sling.scripting.core.impl.ScriptCacheImpl" >=>  >=>  ConfigmgrApiHandler.OrgApacheSlingScriptingCoreImplScriptCacheImpl;
      HttpPost >=> route "/system/console/configMgr/org.apache.sling.scripting.core.impl.ScriptingResourceResolverProviderImpl" >=>  >=>  ConfigmgrApiHandler.OrgApacheSlingScriptingCoreImplScriptingResourceResolverProvider;
      HttpPost >=> route "/system/console/configMgr/org.apache.sling.scripting.java.impl.JavaScriptEngineFactory" >=>  >=>  ConfigmgrApiHandler.OrgApacheSlingScriptingJavaImplJavaScriptEngineFactory;
      HttpPost >=> route "/system/console/configMgr/org.apache.sling.scripting.javascript.internal.RhinoJavaScriptEngineFactory" >=>  >=>  ConfigmgrApiHandler.OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFa;
      HttpPost >=> route "/system/console/configMgr/org.apache.sling.scripting.jsp.JspScriptEngineFactory" >=>  >=>  ConfigmgrApiHandler.OrgApacheSlingScriptingJspJspScriptEngineFactory;
      HttpPost >=> route "/system/console/configMgr/org.apache.sling.scripting.sightly.js.impl.jsapi.SlyBindingsValuesProvider" >=>  >=>  ConfigmgrApiHandler.OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProv;
      HttpPost >=> route "/system/console/configMgr/org.apache.sling.security.impl.ContentDispositionFilter" >=>  >=>  ConfigmgrApiHandler.OrgApacheSlingSecurityImplContentDispositionFilter;
      HttpPost >=> route "/system/console/configMgr/org.apache.sling.security.impl.ReferrerFilter" >=>  >=>  ConfigmgrApiHandler.OrgApacheSlingSecurityImplReferrerFilter;
      HttpPost >=> route "/system/console/configMgr/org.apache.sling.serviceusermapping.impl.ServiceUserMapperImpl" >=>  >=>  ConfigmgrApiHandler.OrgApacheSlingServiceusermappingImplServiceUserMapperImpl;
      HttpPost >=> route "/system/console/configMgr/org.apache.sling.serviceusermapping.impl.ServiceUserMapperImpl.amended" >=>  >=>  ConfigmgrApiHandler.OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmended;
      HttpPost >=> route "/system/console/configMgr/org.apache.sling.servlets.get.DefaultGetServlet" >=>  >=>  ConfigmgrApiHandler.OrgApacheSlingServletsGetDefaultGetServlet;
      HttpPost >=> route "/system/console/configMgr/org.apache.sling.servlets.get.impl.version.VersionInfoServlet" >=>  >=>  ConfigmgrApiHandler.OrgApacheSlingServletsGetImplVersionVersionInfoServlet;
      HttpPost >=> route "/system/console/configMgr/org.apache.sling.servlets.post.impl.helper.ChunkCleanUpTask" >=>  >=>  ConfigmgrApiHandler.OrgApacheSlingServletsPostImplHelperChunkCleanUpTask;
      HttpPost >=> route "/system/console/configMgr/org.apache.sling.servlets.post.impl.SlingPostServlet" >=>  >=>  ConfigmgrApiHandler.OrgApacheSlingServletsPostImplSlingPostServlet;
      HttpPost >=> route "/system/console/configMgr/org.apache.sling.servlets.resolver.SlingServletResolver" >=>  >=>  ConfigmgrApiHandler.OrgApacheSlingServletsResolverSlingServletResolver;
      HttpPost >=> route "/system/console/configMgr/org.apache.sling.settings.impl.SlingSettingsServiceImpl" >=>  >=>  ConfigmgrApiHandler.OrgApacheSlingSettingsImplSlingSettingsServiceImpl;
      HttpPost >=> route "/system/console/configMgr/org.apache.sling.startupfilter.impl.StartupFilterImpl" >=>  >=>  ConfigmgrApiHandler.OrgApacheSlingStartupfilterImplStartupFilterImpl;
      HttpPost >=> route "/system/console/configMgr/org.apache.sling.tenant.internal.TenantProviderImpl" >=>  >=>  ConfigmgrApiHandler.OrgApacheSlingTenantInternalTenantProviderImpl;
      HttpPost >=> route "/system/console/configMgr/org.apache.sling.tracer.internal.LogTracer" >=>  >=>  ConfigmgrApiHandler.OrgApacheSlingTracerInternalLogTracer;
      HttpPost >=> route "/system/console/configMgr/org.apache.sling.xss.impl.XSSFilterImpl" >=>  >=>  ConfigmgrApiHandler.OrgApacheSlingXssImplXSSFilterImpl;
      RequestErrors.notFound (text "Not Found")
    ])
  // ---------------------------------
  // Main
  // ---------------------------------

  let configureApp (app : IApplicationBuilder) =
    app.UseGiraffeErrorHandler(errorHandler)
      .UseStaticFiles()
      .UseAuthentication()
      .UseResponseCaching() |> ignore
    CustomHandlers.configureApp app |> ignore
    app.UseGiraffe webApp |> ignore


  let configureServices (services : IServiceCollection) =
    services
          .AddResponseCaching()
          .AddGiraffe()
          |> AuthSchemes.configureServices
          |> CustomHandlers.configureServices services
          |> ignore
    services.AddDataProtection() |> ignore

  let configureLogging (loggerBuilder : ILoggingBuilder) =
    loggerBuilder.AddFilter(fun lvl -> lvl.Equals LogLevel.Error)
                  .AddConsole()
                  .AddDebug() |> ignore

  [<EntryPoint>]
  let main _ =
    let builder = WebHost.CreateDefaultBuilder()
                    .Configure(Action<IApplicationBuilder> configureApp)
                    .ConfigureServices(configureServices)
                    .ConfigureLogging(configureLogging)
                    |> CustomHandlers.configureWebHost
    builder.Build()
            .Run()
    0