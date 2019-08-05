package org.openapitools.handler;

import com.networknt.config.Config;
import com.networknt.server.HandlerProvider;
import io.undertow.Handlers;
import io.undertow.server.HttpHandler;
import io.undertow.server.HttpServerExchange;
import io.undertow.util.Methods;

public class PathHandlerProvider implements HandlerProvider {

    public HttpHandler getHandler() {
        HttpHandler handler = Handlers.routing()


            .add(Methods.POST, "//system/console/configMgr/Adaptive Form and Interactive Communication Web Channel Configuration", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("adaptiveFormAndInteractiveCommunicationWebChannelConfiguration");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/Adaptive Form and Interactive Communication Web Channel Theme Configuration", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("adaptiveFormAndInteractiveCommunicationWebChannelThemeConfigur");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/Analytics Component Query Cache Service", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("analyticsComponentQueryCacheService");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/Apache Sling Health Check Result HTML Serializer", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("apacheSlingHealthCheckResultHTMLSerializer");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.aem.formsndocuments.config.AEMFormsManagerConfiguration", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeAemFormsndocumentsConfigAEMFormsManagerConfiguration");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.aem.transaction.core.impl.TransactionRecorder", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeAemTransactionCoreImplTransactionRecorder");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.aem.upgrade.prechecks.hc.impl.DeprecateIndexesHC", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeAemUpgradePrechecksHcImplDeprecateIndexesHC");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.aem.upgrade.prechecks.hc.impl.ReplicationAgentsDisabledHC", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHC");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.aem.upgrade.prechecks.mbean.impl.PreUpgradeTasksMBeanImpl", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImpl");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.aem.upgrade.prechecks.tasks.impl.ConsistencyCheckTaskImpl", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImpl");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.cq.account.api.AccountManagementService", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeCqAccountApiAccountManagementService");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.cq.account.impl.AccountManagementServlet", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeCqAccountImplAccountManagementServlet");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.cq.address.impl.location.LocationListServlet", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeCqAddressImplLocationLocationListServlet");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.cq.audit.purge.Dam", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeCqAuditPurgeDam");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.cq.audit.purge.Pages", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeCqAuditPurgePages");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.cq.audit.purge.Replication", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeCqAuditPurgeReplication");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.cq.cdn.rewriter.impl.AWSCloudFrontRewriter", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeCqCdnRewriterImplAWSCloudFrontRewriter");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.cq.cdn.rewriter.impl.CDNConfigServiceImpl", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeCqCdnRewriterImplCDNConfigServiceImpl");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.cq.cdn.rewriter.impl.CDNRewriter", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeCqCdnRewriterImplCDNRewriter");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.cq.cloudconfig.core.impl.ConfigurationReplicationEventHandler", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandle");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.cq.commerce.impl.asset.DynamicImageHandler", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeCqCommerceImplAssetDynamicImageHandler");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.cq.commerce.impl.asset.ProductAssetHandlerProviderImpl", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeCqCommerceImplAssetProductAssetHandlerProviderImpl");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.cq.commerce.impl.asset.StaticImageHandler", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeCqCommerceImplAssetStaticImageHandler");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.cq.commerce.impl.asset.VideoHandler", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeCqCommerceImplAssetVideoHandler");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.cq.commerce.impl.promotion.PromotionManagerImpl", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeCqCommerceImplPromotionPromotionManagerImpl");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.cq.commerce.pim.impl.cataloggenerator.CatalogGeneratorImpl", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImpl");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.cq.commerce.pim.impl.PageEventListener", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeCqCommercePimImplPageEventListener");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.cq.commerce.pim.impl.productfeed.ProductFeedServiceImpl", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeCqCommercePimImplProductfeedProductFeedServiceImpl");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.cq.contentinsight.impl.ReportingServicesSettingsProvider", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeCqContentinsightImplReportingServicesSettingsProvider");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.cq.contentinsight.impl.servlets.BrightEdgeProxyServlet", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeCqContentinsightImplServletsBrightEdgeProxyServlet");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.cq.contentinsight.impl.servlets.ReportingServicesProxyServlet", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeCqContentinsightImplServletsReportingServicesProxyServle");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.cq.dam.cfm.impl.component.ComponentConfigImpl", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeCqDamCfmImplComponentComponentConfigImpl");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.cq.dam.cfm.impl.conf.FeatureConfigImpl", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeCqDamCfmImplConfFeatureConfigImpl");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.cq.dam.cfm.impl.content.rewriter.AssetProcessor", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeCqDamCfmImplContentRewriterAssetProcessor");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.cq.dam.cfm.impl.content.rewriter.ParRangeFilter", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeCqDamCfmImplContentRewriterParRangeFilter");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.cq.dam.cfm.impl.content.rewriter.PayloadFilter", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeCqDamCfmImplContentRewriterPayloadFilter");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.cq.dam.dm.process.image.PTiffManagerImpl", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeCqDamDmProcessImagePTiffManagerImpl");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.cq.dam.ips.impl.replication.trigger.ReplicateOnModifyWorker", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorker");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.cq.dam.mac.sync.helper.impl.MACSyncClientImpl", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeCqDamMacSyncHelperImplMACSyncClientImpl");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.cq.dam.mac.sync.impl.DAMSyncServiceImpl", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeCqDamMacSyncImplDAMSyncServiceImpl");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.cq.dam.processor.nui.impl.NuiAssetProcessor", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeCqDamProcessorNuiImplNuiAssetProcessor");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.cq.dam.s7imaging.impl.is.ImageServerComponent", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeCqDamS7imagingImplIsImageServerComponent");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.cq.dam.s7imaging.impl.ps.PlatformServerServlet", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeCqDamS7imagingImplPsPlatformServerServlet");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.cq.dam.webdav.impl.io.AssetIOHandler", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeCqDamWebdavImplIoAssetIOHandler");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.cq.dam.webdav.impl.io.DamWebdavVersionLinkingJob", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJob");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.cq.dam.webdav.impl.io.SpecialFilesHandler", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeCqDamWebdavImplIoSpecialFilesHandler");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.cq.deserfw.impl.DeserializationFirewallImpl", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeCqDeserfwImplDeserializationFirewallImpl");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.cq.dtm.impl.service.DTMWebServiceImpl", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeCqDtmImplServiceDTMWebServiceImpl");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.cq.dtm.impl.servlets.DTMDeployHookServlet", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeCqDtmImplServletsDTMDeployHookServlet");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.cq.dtm.reactor.impl.service.WebServiceImpl", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeCqDtmReactorImplServiceWebServiceImpl");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.cq.experiencelog.impl.ExperienceLogConfigServlet", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeCqExperiencelogImplExperienceLogConfigServlet");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.cq.hc.ContentPackagesHealthCheck", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeCqHcContentPackagesHealthCheck");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.cq.history.impl.HistoryRequestFilter", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeCqHistoryImplHistoryRequestFilter");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.cq.history.impl.HistoryServiceImpl", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeCqHistoryImplHistoryServiceImpl");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.cq.inbox.impl.typeprovider.ItemTypeProvider", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeCqInboxImplTypeproviderItemTypeProvider");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.cq.projects.impl.servlet.ProjectImageServlet", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeCqProjectsImplServletProjectImageServlet");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.cq.projects.purge.Scheduler", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeCqProjectsPurgeScheduler");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.cq.scheduled.exporter.impl.ScheduledExporterImpl", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeCqScheduledExporterImplScheduledExporterImpl");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.cq.screens.analytics.impl.ScreensAnalyticsServiceImpl", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImpl");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.cq.screens.device.impl.DeviceService", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeCqScreensDeviceImplDeviceService");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.cq.screens.device.registration.impl.RegistrationServiceImpl", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeCqScreensDeviceRegistrationImplRegistrationServiceImpl");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.cq.screens.impl.handler.ChannelsUpdateHandler", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeCqScreensImplHandlerChannelsUpdateHandler");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.cq.screens.impl.jobs.DistributedDevicesStatiUpdateJob", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJob");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.cq.screens.impl.remote.impl.DistributedHttpClientImpl", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeCqScreensImplRemoteImplDistributedHttpClientImpl");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.cq.screens.impl.ScreensChannelPostProcessor", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeCqScreensImplScreensChannelPostProcessor");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeCqScreensMonitoringImplScreensMonitoringServiceImpl");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.cq.screens.mq.activemq.impl.ArtemisJMSProvider", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeCqScreensMqActivemqImplArtemisJMSProvider");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.cq.screens.offlinecontent.impl.BulkOfflineUpdateServiceImpl", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImpl");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.cq.screens.offlinecontent.impl.OfflineContentServiceImpl", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeCqScreensOfflinecontentImplOfflineContentServiceImpl");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.cq.screens.segmentation.impl.SegmentationFeatureFlag", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeCqScreensSegmentationImplSegmentationFeatureFlag");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.cq.security.hc.bundles.impl.HtmlLibraryManagerConfigHealthCheck", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthCh");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.cq.security.hc.bundles.impl.WcmFilterHealthCheck", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeCqSecurityHcBundlesImplWcmFilterHealthCheck");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.cq.security.hc.dispatcher.impl.DispatcherAccessHealthCheck", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheck");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.cq.security.hc.packages.impl.ExampleContentHealthCheck", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeCqSecurityHcPackagesImplExampleContentHealthCheck");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.cq.security.hc.webserver.impl.ClickjackingHealthCheck", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeCqSecurityHcWebserverImplClickjackingHealthCheck");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.cq.social.accountverification.impl.AccountManagementConfigImpl", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeCqSocialAccountverificationImplAccountManagementConfigIm");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.cq.social.activitystreams.client.impl.SocialActivityComponentFactoryImpl", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeCqSocialActivitystreamsClientImplSocialActivityComponen");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.cq.social.activitystreams.client.impl.SocialActivityStreamComponentFactory", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCo");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.cq.social.activitystreams.listener.impl.EventListenerHandler", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeCqSocialActivitystreamsListenerImplEventListenerHandler");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.cq.social.activitystreams.listener.impl.ModerationEventExtension", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeCqSocialActivitystreamsListenerImplModerationEventExten");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.cq.social.activitystreams.listener.impl.RatingEventActivitySuppressor", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeCqSocialActivitystreamsListenerImplRatingEventActivityS");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.cq.social.activitystreams.listener.impl.ResourceActivityStreamProviderFactory", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeCqSocialActivitystreamsListenerImplResourceActivityStre");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.cq.social.calendar.client.endpoints.impl.CalendarOperationsImpl", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsI");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.cq.social.calendar.client.operationextensions.EventAttachment", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeCqSocialCalendarClientOperationextensionsEventAttachmen");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.cq.social.calendar.servlets.TimeZoneServlet", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeCqSocialCalendarServletsTimeZoneServlet");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.cq.social.commons.comments.endpoints.impl.CommentDeleteEventActivitySuppressor", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEvent");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.cq.social.commons.comments.endpoints.impl.CommentOperationService", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSe");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.cq.social.commons.comments.endpoints.impl.TranslationOperationService", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperati");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.cq.social.commons.comments.listing.impl.SearchCommentSocialComponentListProvider", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialC");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.cq.social.commons.comments.scheduler.impl.SearchScheduledPosts", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPos");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.cq.social.commons.cors.CORSAuthenticationFilter", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeCqSocialCommonsCorsCORSAuthenticationFilter");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.cq.social.commons.emailreply.impl.AndroidEmailClientProvider", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProvider");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.cq.social.commons.emailreply.impl.CommentEmailBuilderImpl", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImpl");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.cq.social.commons.emailreply.impl.CommentEmailEventListener", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListener");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.cq.social.commons.emailreply.impl.CustomEmailClientProvider", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeCqSocialCommonsEmailreplyImplCustomEmailClientProvider");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.cq.social.commons.emailreply.impl.EmailQuotedTextPatternsImpl", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImp");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.cq.social.commons.emailreply.impl.EmailReplyConfigurationImpl", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImp");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.cq.social.commons.emailreply.impl.EmailReplyImporter", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeCqSocialCommonsEmailreplyImplEmailReplyImporter");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.cq.social.commons.emailreply.impl.GmailEmailClientProvider", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeCqSocialCommonsEmailreplyImplGmailEmailClientProvider");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.cq.social.commons.emailreply.impl.IOSEmailClientProvider", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProvider");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.cq.social.commons.emailreply.impl.MacmailEmailClientProvider", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProvider");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.cq.social.commons.emailreply.impl.OutLookEmailClientProvider", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeCqSocialCommonsEmailreplyImplOutLookEmailClientProvider");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.cq.social.commons.emailreply.impl.UnknownEmailClientProvider", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProvider");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.cq.social.commons.emailreply.impl.YahooEmailClientProvider", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProvider");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.cq.social.commons.maintainance.impl.DeleteTempUGCImageUploads", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUpload");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.cq.social.commons.ugclimiter.impl.UGCLimiterServiceImpl", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImpl");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.cq.social.commons.ugclimitsconfig.impl.CommunityUserUGCLimitsConfigImpl", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimit");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.cq.social.connect.oauth.impl.FacebookProviderImpl", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeCqSocialConnectOauthImplFacebookProviderImpl");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.cq.social.connect.oauth.impl.SocialOAuthAuthenticationHandler", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandle");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.cq.social.connect.oauth.impl.SocialOAuthUserProfileMapper", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapper");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.cq.social.connect.oauth.impl.TwitterProviderImpl", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeCqSocialConnectOauthImplTwitterProviderImpl");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.cq.social.content.fragments.services.impl.CommunitiesFragmentCreationServiceImpl", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmen");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.cq.social.datastore.as.impl.ASResourceProviderFactory", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeCqSocialDatastoreAsImplASResourceProviderFactory");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.cq.social.datastore.op.impl.SocialMSResourceProviderFactory", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactory");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.cq.social.datastore.rdb.impl.SocialRDBResourceProviderFactory", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactor");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.cq.social.enablement.adaptors.EnablementLearningPathAdaptorFactory", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorF");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.cq.social.enablement.adaptors.EnablementResourceAdaptorFactory", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFacto");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.cq.social.enablement.learningpath.endpoints.impl.EnablementLearningPathModelOperationService", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeCqSocialEnablementLearningpathEndpointsImplEnablementL");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.cq.social.enablement.resource.endpoints.impl.EnablementResourceModelOperationService", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeCqSocialEnablementResourceEndpointsImplEnablementResou");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.cq.social.enablement.services.impl.AuthorMarkerImpl", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeCqSocialEnablementServicesImplAuthorMarkerImpl");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.cq.social.filelibrary.client.endpoints.FilelibraryDownloadGetServlet", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGe");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.cq.social.filelibrary.client.endpoints.impl.FileLibraryOperationsService", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOpera");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.cq.social.forum.client.endpoints.impl.ForumOperationsService", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeCqSocialForumClientEndpointsImplForumOperationsService");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.cq.social.forum.dispatcher.impl.FlushOperations", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeCqSocialForumDispatcherImplFlushOperations");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.cq.social.group.client.impl.CommunityGroupCollectionComponentFactory", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeCqSocialGroupClientImplCommunityGroupCollectionComponen");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.cq.social.group.impl.GroupServiceImpl", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeCqSocialGroupImplGroupServiceImpl");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.cq.social.handlebars.GuavaTemplateCacheImpl", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeCqSocialHandlebarsGuavaTemplateCacheImpl");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.cq.social.ideation.client.endpoints.impl.IdeationOperationsService", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsS");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.cq.social.journal.client.endpoints.impl.JournalOperationsService", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeCqSocialJournalClientEndpointsImplJournalOperationsSer");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.cq.social.members.endpoints.impl.CommunityMemberGroupProfileOperationService", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfile");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.cq.social.members.endpoints.impl.CommunityMemberUserProfileOperationService", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileO");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.cq.social.members.impl.CommunityMemberGroupProfileComponentFactory", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentF");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.cq.social.messaging.client.endpoints.impl.MessagingOperationsServiceImpl", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeCqSocialMessagingClientEndpointsImplMessagingOperation");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.cq.social.moderation.dashboard.api.FilterGroupSocialComponentFactory", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeCqSocialModerationDashboardApiFilterGroupSocialComponen");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.cq.social.moderation.dashboard.api.ModerationDashboardSocialComponentFactory", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeCqSocialModerationDashboardApiModerationDashboardSocial");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.cq.social.moderation.dashboard.api.UserDetailsSocialComponentFactory", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeCqSocialModerationDashboardApiUserDetailsSocialComponen");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.cq.social.moderation.dashboard.internal.impl.FilterGroupSocialComponentFactoryV2", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeCqSocialModerationDashboardInternalImplFilterGroupSoci");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.cq.social.notifications.impl.MentionsRouter", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeCqSocialNotificationsImplMentionsRouter");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.cq.social.notifications.impl.NotificationManagerImpl", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeCqSocialNotificationsImplNotificationManagerImpl");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.cq.social.notifications.impl.NotificationsRouter", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeCqSocialNotificationsImplNotificationsRouter");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.cq.social.qna.client.endpoints.impl.QnaForumOperationsService", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServic");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.cq.social.reporting.analytics.services.impl.AnalyticsReportImporterServiceImpl", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportI");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.cq.social.reporting.analytics.services.impl.AnalyticsReportManagementServiceImpl", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportM");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.cq.social.reporting.analytics.services.impl.SiteTrendReportSocialComponentFactory", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportS");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.cq.social.review.client.endpoints.impl.ReviewOperationsService", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeCqSocialReviewClientEndpointsImplReviewOperationsServi");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.cq.social.scf.core.operations.impl.SocialOperationsServlet", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeCqSocialScfCoreOperationsImplSocialOperationsServlet");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.cq.social.scf.endpoints.impl.DefaultSocialGetServlet", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeCqSocialScfEndpointsImplDefaultSocialGetServlet");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.cq.social.scoring.impl.ScoringEventListener", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeCqSocialScoringImplScoringEventListener");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.cq.social.serviceusers.internal.impl.ServiceUserWrapperImpl", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeCqSocialServiceusersInternalImplServiceUserWrapperImpl");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.cq.social.site.endpoints.impl.SiteOperationService", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeCqSocialSiteEndpointsImplSiteOperationService");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.cq.social.site.impl.AnalyticsComponentConfigurationServiceImpl", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceIm");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.cq.social.site.impl.SiteConfiguratorImpl", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeCqSocialSiteImplSiteConfiguratorImpl");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.cq.social.srp.impl.SocialSolrConnector", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeCqSocialSrpImplSocialSolrConnector");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.cq.social.sync.impl.DiffChangesObserver", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeCqSocialSyncImplDiffChangesObserver");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.cq.social.sync.impl.GroupSyncListenerImpl", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeCqSocialSyncImplGroupSyncListenerImpl");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.cq.social.sync.impl.PublisherSyncServiceImpl", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeCqSocialSyncImplPublisherSyncServiceImpl");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.cq.social.sync.impl.UserSyncListenerImpl", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeCqSocialSyncImplUserSyncListenerImpl");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.cq.social.translation.impl.TranslationServiceConfigManager", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeCqSocialTranslationImplTranslationServiceConfigManager");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.cq.social.translation.impl.UGCLanguageDetector", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeCqSocialTranslationImplUGCLanguageDetector");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.cq.social.ugcbase.dispatcher.impl.FlushServiceImpl", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeCqSocialUgcbaseDispatcherImplFlushServiceImpl");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.cq.social.ugcbase.impl.AysncReverseReplicatorImpl", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeCqSocialUgcbaseImplAysncReverseReplicatorImpl");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.cq.social.ugcbase.impl.PublisherConfigurationImpl", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeCqSocialUgcbaseImplPublisherConfigurationImpl");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.cq.social.ugcbase.impl.SocialUtilsImpl", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeCqSocialUgcbaseImplSocialUtilsImpl");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.cq.social.ugcbase.moderation.impl.AutoModerationImpl", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeCqSocialUgcbaseModerationImplAutoModerationImpl");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.cq.social.ugcbase.moderation.impl.SentimentProcess", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeCqSocialUgcbaseModerationImplSentimentProcess");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.cq.social.ugcbase.security.impl.DefaultAttachmentTypeBlacklistService", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackli");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.cq.social.ugcbase.security.impl.SaferSlingPostValidatorImpl", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImpl");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.cq.social.user.endpoints.impl.UsersGroupFromPublishServlet", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServlet");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.cq.social.user.impl.transport.HttpToPublisher", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeCqSocialUserImplTransportHttpToPublisher");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.cq.ui.wcm.commons.internal.servlets.rte.RTEFilterServletFactory.amended", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFact");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.cq.upgrades.cleanup.impl.UpgradeContentCleanup", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeCqUpgradesCleanupImplUpgradeContentCleanup");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.cq.upgrades.cleanup.impl.UpgradeInstallFolderCleanup", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanup");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.cq.wcm.jobs.async.impl.AsyncDeleteConfigProviderService", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderService");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.cq.wcm.jobs.async.impl.AsyncJobCleanUpTask", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTask");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.cq.wcm.jobs.async.impl.AsyncMoveConfigProviderService", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderService");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.cq.wcm.jobs.async.impl.AsyncPageMoveConfigProviderService", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderService");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.cq.wcm.launches.impl.LaunchesEventHandler", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeCqWcmLaunchesImplLaunchesEventHandler");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.cq.wcm.mobile.qrcode.servlet.QRCodeImageGenerator", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeCqWcmMobileQrcodeServletQRCodeImageGenerator");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.cq.wcm.style.internal.ComponentStyleInfoCacheImpl", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeCqWcmStyleInternalComponentStyleInfoCacheImpl");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.cq.wcm.translation.impl.TranslationPlatformConfigurationImpl", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeCqWcmTranslationImplTranslationPlatformConfigurationImpl");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.fd.fp.config.FormsPortalDraftsandSubmissionConfigService", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigService");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.fd.fp.config.FormsPortalSchedulerService", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeFdFpConfigFormsPortalSchedulerService");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.forms.common.service.impl.DefaultDataProvider", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeFormsCommonServiceImplDefaultDataProvider");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.forms.common.service.impl.FormsCommonConfigurationServiceImpl", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImp");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.forms.common.servlet.TempCleanUpTask", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeFormsCommonServletTempCleanUpTask");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.granite.acp.platform.PlatformServlet", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeGraniteAcpPlatformPlatformServlet");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.granite.activitystreams.impl.ActivityManagerImpl", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeGraniteActivitystreamsImplActivityManagerImpl");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.granite.analyzer.base.SystemStatusServlet", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeGraniteAnalyzerBaseSystemStatusServlet");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.granite.analyzer.scripts.compile.AllScriptsCompilerServlet", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServlet");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.granite.apicontroller.FilterResolverHookFactory", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeGraniteApicontrollerFilterResolverHookFactory");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.granite.auth.cert.impl.ClientCertAuthHandler", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeGraniteAuthCertImplClientCertAuthHandler");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.granite.auth.ims", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeGraniteAuthIms");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.granite.auth.ims.impl.ExternalUserIdMappingProviderExtension", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtension");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.granite.auth.ims.impl.IMSAccessTokenRequestCustomizerImpl", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImpl");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.granite.auth.ims.impl.IMSInstanceCredentialsValidator", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeGraniteAuthImsImplIMSInstanceCredentialsValidator");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.granite.auth.ims.impl.IMSProviderImpl", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeGraniteAuthImsImplIMSProviderImpl");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.granite.auth.ims.impl.ImsConfigProviderImpl", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeGraniteAuthImsImplImsConfigProviderImpl");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.granite.auth.oauth.accesstoken.provider", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeGraniteAuthOauthAccesstokenProvider");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.granite.auth.oauth.impl.BearerAuthenticationHandler", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeGraniteAuthOauthImplBearerAuthenticationHandler");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.granite.auth.oauth.impl.DefaultTokenValidatorImpl", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeGraniteAuthOauthImplDefaultTokenValidatorImpl");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.granite.auth.oauth.impl.FacebookProviderImpl", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeGraniteAuthOauthImplFacebookProviderImpl");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.granite.auth.oauth.impl.GithubProviderImpl", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeGraniteAuthOauthImplGithubProviderImpl");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.granite.auth.oauth.impl.GraniteProvider", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeGraniteAuthOauthImplGraniteProvider");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.granite.auth.oauth.impl.helper.ProviderConfigManager", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeGraniteAuthOauthImplHelperProviderConfigManager");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.granite.auth.oauth.impl.helper.ProviderConfigManagerInternal", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternal");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.granite.auth.oauth.impl.OAuthAuthenticationHandler", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeGraniteAuthOauthImplOAuthAuthenticationHandler");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.granite.auth.oauth.impl.TwitterProviderImpl", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeGraniteAuthOauthImplTwitterProviderImpl");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.granite.auth.oauth.provider", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeGraniteAuthOauthProvider");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.granite.auth.requirement.impl.DefaultRequirementHandler", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeGraniteAuthRequirementImplDefaultRequirementHandler");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.granite.auth.saml.SamlAuthenticationHandler", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeGraniteAuthSamlSamlAuthenticationHandler");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.granite.auth.sso.impl.SsoAuthenticationHandler", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeGraniteAuthSsoImplSsoAuthenticationHandler");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.granite.bundles.hc.impl.CodeCacheHealthCheck", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeGraniteBundlesHcImplCodeCacheHealthCheck");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.granite.bundles.hc.impl.CrxdeSupportBundleHealthCheck", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheck");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.granite.bundles.hc.impl.DavExBundleHealthCheck", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeGraniteBundlesHcImplDavExBundleHealthCheck");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.granite.bundles.hc.impl.InactiveBundlesHealthCheck", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeGraniteBundlesHcImplInactiveBundlesHealthCheck");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.granite.bundles.hc.impl.JobsHealthCheck", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeGraniteBundlesHcImplJobsHealthCheck");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.granite.bundles.hc.impl.SlingGetServletHealthCheck", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeGraniteBundlesHcImplSlingGetServletHealthCheck");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.granite.bundles.hc.impl.SlingJavaScriptHandlerHealthCheck", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheck");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.granite.bundles.hc.impl.SlingJspScriptHandlerHealthCheck", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheck");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.granite.bundles.hc.impl.SlingReferrerFilterHealthCheck", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheck");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.granite.bundles.hc.impl.WebDavBundleHealthCheck", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeGraniteBundlesHcImplWebDavBundleHealthCheck");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.granite.comments.internal.CommentReplicationContentFilterFactory", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeGraniteCommentsInternalCommentReplicationContentFilterFac");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.granite.compatrouter.impl.CompatSwitchingServiceImpl", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeGraniteCompatrouterImplCompatSwitchingServiceImpl");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.granite.compatrouter.impl.RoutingConfig", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeGraniteCompatrouterImplRoutingConfig");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.granite.compatrouter.impl.SwitchMappingConfig", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeGraniteCompatrouterImplSwitchMappingConfig");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.granite.conf.impl.RuntimeAwareConfigurationResourceResolvingStrategy", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolving");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.granite.contexthub.impl.ContextHubImpl", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeGraniteContexthubImplContextHubImpl");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.granite.cors.impl.CORSPolicyImpl", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeGraniteCorsImplCORSPolicyImpl");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.granite.csrf.impl.CSRFFilter", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeGraniteCsrfImplCSRFFilter");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.granite.csrf.impl.CSRFServlet", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeGraniteCsrfImplCSRFServlet");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.granite.distribution.core.impl.CryptoDistributionTransportSecretProvider", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeGraniteDistributionCoreImplCryptoDistributionTransportSe");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.granite.distribution.core.impl.diff.DiffChangesObserver", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeGraniteDistributionCoreImplDiffDiffChangesObserver");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.granite.distribution.core.impl.diff.DiffEventListener", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeGraniteDistributionCoreImplDiffDiffEventListener");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.granite.distribution.core.impl.DistributionToReplicationEventTransformer", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeGraniteDistributionCoreImplDistributionToReplicationEven");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.granite.distribution.core.impl.replication.adapters.ReplicationAgentProvider", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeGraniteDistributionCoreImplReplicationAdaptersReplicat");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.granite.distribution.core.impl.replication.DistributionTransportHandler", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeGraniteDistributionCoreImplReplicationDistributionTrans");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.granite.distribution.core.impl.transport.AccessTokenDistributionTransportSecretProvider", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeGraniteDistributionCoreImplTransportAccessTokenDistribu");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.granite.frags.impl.CheckHttpHeaderFlag", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeGraniteFragsImplCheckHttpHeaderFlag");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.granite.frags.impl.RandomFeature", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeGraniteFragsImplRandomFeature");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.granite.httpcache.file.FileCacheStore", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeGraniteHttpcacheFileFileCacheStore");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.granite.httpcache.impl.OuterCacheFilter", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeGraniteHttpcacheImplOuterCacheFilter");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.granite.i18n.impl.bundle.PseudoTranslations", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeGraniteI18nImplBundlePseudoTranslations");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.granite.i18n.impl.PreferencesLocaleResolverService", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeGraniteI18nImplPreferencesLocaleResolverService");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.granite.infocollector.InfoCollector", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeGraniteInfocollectorInfoCollector");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.granite.jetty.ssl.internal.GraniteSslConnectorFactory", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeGraniteJettySslInternalGraniteSslConnectorFactory");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.granite.license.impl.LicenseCheckFilter", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeGraniteLicenseImplLicenseCheckFilter");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.granite.logging.impl.LogAnalyserImpl", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeGraniteLoggingImplLogAnalyserImpl");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.granite.logging.impl.LogErrorHealthCheck", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeGraniteLoggingImplLogErrorHealthCheck");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.granite.maintenance.crx.impl.DataStoreGarbageCollectionTask", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTask");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.granite.maintenance.crx.impl.LuceneBinariesCleanupTask", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTask");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.granite.maintenance.crx.impl.RevisionCleanupTask", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeGraniteMaintenanceCrxImplRevisionCleanupTask");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.granite.monitoring.impl.ScriptConfigImpl", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeGraniteMonitoringImplScriptConfigImpl");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.granite.oauth.server.auth.impl.OAuth2ServerAuthenticationHandler", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHan");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.granite.oauth.server.impl.AccessTokenCleanupTask", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeGraniteOauthServerImplAccessTokenCleanupTask");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.granite.oauth.server.impl.OAuth2ClientRevocationServlet", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeGraniteOauthServerImplOAuth2ClientRevocationServlet");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.granite.oauth.server.impl.OAuth2RevocationEndpointServlet", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeGraniteOauthServerImplOAuth2RevocationEndpointServlet");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.granite.oauth.server.impl.OAuth2TokenEndpointServlet", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeGraniteOauthServerImplOAuth2TokenEndpointServlet");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.granite.oauth.server.impl.OAuth2TokenRevocationServlet", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeGraniteOauthServerImplOAuth2TokenRevocationServlet");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.granite.offloading.impl.OffloadingConfigurator", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeGraniteOffloadingImplOffloadingConfigurator");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.granite.offloading.impl.OffloadingJobCloner", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeGraniteOffloadingImplOffloadingJobCloner");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.granite.offloading.impl.OffloadingJobOffloader", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeGraniteOffloadingImplOffloadingJobOffloader");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.granite.offloading.impl.transporter.OffloadingAgentManager", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeGraniteOffloadingImplTransporterOffloadingAgentManager");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.granite.offloading.impl.transporter.OffloadingDefaultTransporter", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspo");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.granite.omnisearch.impl.core.OmniSearchServiceImpl", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeGraniteOmnisearchImplCoreOmniSearchServiceImpl");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.granite.optout.impl.OptOutServiceImpl", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeGraniteOptoutImplOptOutServiceImpl");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.granite.queries.impl.hc.AsyncIndexHealthCheck", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeGraniteQueriesImplHcAsyncIndexHealthCheck");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.granite.queries.impl.hc.LargeIndexHealthCheck", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeGraniteQueriesImplHcLargeIndexHealthCheck");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.granite.queries.impl.hc.QueriesStatusHealthCheck", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeGraniteQueriesImplHcQueriesStatusHealthCheck");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.granite.queries.impl.hc.QueryHealthCheckMetrics", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeGraniteQueriesImplHcQueryHealthCheckMetrics");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.granite.queries.impl.hc.QueryLimitsHealthCheck", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeGraniteQueriesImplHcQueryLimitsHealthCheck");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.granite.replication.hc.impl.ReplicationQueueHealthCheck", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeGraniteReplicationHcImplReplicationQueueHealthCheck");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.granite.replication.hc.impl.ReplicationTransportUsersHealthCheck", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeGraniteReplicationHcImplReplicationTransportUsersHealthC");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.granite.repository.hc.impl.AuthorizableNodeNameHealthCheck", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheck");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.granite.repository.hc.impl.content.sling.SlingContentHealthCheck", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthC");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.granite.repository.hc.impl.ContinuousRGCHealthCheck", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeGraniteRepositoryHcImplContinuousRGCHealthCheck");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.granite.repository.hc.impl.DefaultAccessUserProfileHealthCheck", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthChe");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.granite.repository.hc.impl.DefaultLoginsHealthCheck", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheck");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.granite.repository.hc.impl.DiskSpaceHealthCheck", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeGraniteRepositoryHcImplDiskSpaceHealthCheck");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.granite.repository.hc.impl.ObservationQueueLengthHealthCheck", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheck");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.granite.repository.impl.CommitStatsConfig", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeGraniteRepositoryImplCommitStatsConfig");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.granite.repository.ServiceUserConfiguration", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeGraniteRepositoryServiceUserConfiguration");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.granite.requests.logging.impl.hc.RequestsStatusHealthCheckImpl", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckIm");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.granite.resourcestatus.impl.CompositeStatusType", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeGraniteResourcestatusImplCompositeStatusType");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.granite.resourcestatus.impl.StatusResourceProviderImpl", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeGraniteResourcestatusImplStatusResourceProviderImpl");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.granite.rest.assets.impl.AssetContentDispositionFilter", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeGraniteRestAssetsImplAssetContentDispositionFilter");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.granite.rest.impl.ApiEndpointResourceProviderFactoryImpl", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeGraniteRestImplApiEndpointResourceProviderFactoryImpl");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.granite.rest.impl.servlet.DefaultGETServlet", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeGraniteRestImplServletDefaultGETServlet");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.granite.security.user.ui.internal.servlets.SSLConfigurationServlet", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationS");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.granite.security.user.UserPropertiesService", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeGraniteSecurityUserUserPropertiesService");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.granite.socialgraph.impl.SocialGraphFactoryImpl", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeGraniteSocialgraphImplSocialGraphFactoryImpl");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.granite.system.monitoring.impl.SystemStatsMBeanImpl", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeGraniteSystemMonitoringImplSystemStatsMBeanImpl");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.granite.taskmanagement.impl.jcr.TaskAdapterFactory", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeGraniteTaskmanagementImplJcrTaskAdapterFactory");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.granite.taskmanagement.impl.jcr.TaskArchiveService", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeGraniteTaskmanagementImplJcrTaskArchiveService");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.granite.taskmanagement.impl.purge.TaskPurgeMaintenanceTask", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTask");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.granite.taskmanagement.impl.service.TaskManagerAdapterFactory", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactor");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.granite.threaddump.ThreadDumpCollector", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeGraniteThreaddumpThreadDumpCollector");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.granite.translation.connector.msft.core.impl.MicrosoftTranslationServiceFactoryImpl", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTransl");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.granite.translation.core.impl.TranslationManagerImpl", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeGraniteTranslationCoreImplTranslationManagerImpl");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.granite.ui.clientlibs.impl.HtmlLibraryManagerImpl", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeGraniteUiClientlibsImplHtmlLibraryManagerImpl");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.granite.workflow.console.frags.WorkflowWithdrawFeature", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeature");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.granite.workflow.console.publish.WorkflowPublishEventService", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeGraniteWorkflowConsolePublishWorkflowPublishEventService");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.granite.workflow.core.jcr.WorkflowBucketManager", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeGraniteWorkflowCoreJcrWorkflowBucketManager");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.granite.workflow.core.job.ExternalProcessJobHandler", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeGraniteWorkflowCoreJobExternalProcessJobHandler");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.granite.workflow.core.job.JobHandler", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeGraniteWorkflowCoreJobJobHandler");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.granite.workflow.core.offloading.WorkflowOffloadingJobConsumer", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsum");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.granite.workflow.core.PayloadMapCache", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeGraniteWorkflowCorePayloadMapCache");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.granite.workflow.core.payloadmap.PayloadMoveListener", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeGraniteWorkflowCorePayloadmapPayloadMoveListener");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.granite.workflow.core.WorkflowConfig", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeGraniteWorkflowCoreWorkflowConfig");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.granite.workflow.core.WorkflowSessionFactory", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeGraniteWorkflowCoreWorkflowSessionFactory");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.granite.workflow.purge.Scheduler", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeGraniteWorkflowPurgeScheduler");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.octopus.ncomm.bootstrap", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeOctopusNcommBootstrap");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.social.integrations.livefyre.user.pingforpull.impl.PingPullServlet", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullS");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.adobe.xmp.worker.files.ncomm.XMPFilesNComm", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comAdobeXmpWorkerFilesNcommXMPFilesNComm");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.commons.datasource.jdbcpool.JdbcPoolService", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCommonsDatasourceJdbcpoolJdbcPoolService");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.commons.httpclient", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCommonsHttpclient");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.analytics.impl.StorePropertiesChangeListener", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqAnalyticsImplStorePropertiesChangeListener");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.analytics.sitecatalyst.impl.exporter.ClassificationsExporter", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqAnalyticsSitecatalystImplExporterClassificationsExporte");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.analytics.sitecatalyst.impl.importer.ReportImporter", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqAnalyticsSitecatalystImplImporterReportImporter");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.analytics.sitecatalyst.impl.SitecatalystAdapterFactory", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactory");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.analytics.sitecatalyst.impl.SitecatalystHttpClientImpl", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImpl");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.analytics.testandtarget.impl.AccountOptionsUpdater", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqAnalyticsTestandtargetImplAccountOptionsUpdater");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.analytics.testandtarget.impl.DeleteAuthorActivityListener", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListener");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.analytics.testandtarget.impl.PushAuthorCampaignPageListener", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListener");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.analytics.testandtarget.impl.SegmentImporter", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqAnalyticsTestandtargetImplSegmentImporter");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.analytics.testandtarget.impl.service.WebServiceImpl", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqAnalyticsTestandtargetImplServiceWebServiceImpl");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.analytics.testandtarget.impl.servlets.AdminServerServlet", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqAnalyticsTestandtargetImplServletsAdminServerServlet");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.analytics.testandtarget.impl.TestandtargetHttpClientImpl", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImpl");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.auth.impl.cug.CugSupportImpl", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqAuthImplCugCugSupportImpl");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.auth.impl.LoginSelectorHandler", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqAuthImplLoginSelectorHandler");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.commons.impl.ExternalizerImpl", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqCommonsImplExternalizerImpl");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.commons.servlets.RootMappingServlet", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqCommonsServletsRootMappingServlet");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.compat.codeupgrade.impl.CodeUpgradeExecutionConditionChecker", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionChecke");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.compat.codeupgrade.impl.UpgradeTaskIgnoreList", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqCompatCodeupgradeImplUpgradeTaskIgnoreList");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.compat.codeupgrade.impl.VersionRangeTaskIgnorelist", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelist");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.contentsync.impl.ContentSyncManagerImpl", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqContentsyncImplContentSyncManagerImpl");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.dam.commons.handler.StandardImageHandler", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqDamCommonsHandlerStandardImageHandler");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.dam.commons.metadata.XmpFilterBlackWhite", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqDamCommonsMetadataXmpFilterBlackWhite");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.dam.commons.util.impl.AssetCacheImpl", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqDamCommonsUtilImplAssetCacheImpl");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.dam.core.impl.annotation.pdf.AnnotationPdfConfig", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqDamCoreImplAnnotationPdfAnnotationPdfConfig");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.dam.core.impl.AssetMoveListener", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqDamCoreImplAssetMoveListener");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.dam.core.impl.assethome.AssetHomePageConfiguration", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqDamCoreImplAssethomeAssetHomePageConfiguration");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.dam.core.impl.assetlinkshare.AdhocAssetShareProxyServlet", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServlet");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.dam.core.impl.cache.CQBufferedImageCache", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqDamCoreImplCacheCQBufferedImageCache");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.dam.core.impl.DamChangeEventListener", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqDamCoreImplDamChangeEventListener");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.dam.core.impl.DamEventPurgeService", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqDamCoreImplDamEventPurgeService");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.dam.core.impl.DamEventRecorderImpl", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqDamCoreImplDamEventRecorderImpl");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.dam.core.impl.event.DamEventAuditListener", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqDamCoreImplEventDamEventAuditListener");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.dam.core.impl.ExpiryNotificationJobImpl", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqDamCoreImplExpiryNotificationJobImpl");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.dam.core.impl.foldermetadataschema.FolderMetadataSchemaFeatureFlag", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeat");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.dam.core.impl.gfx.CommonsGfxRenderer", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqDamCoreImplGfxCommonsGfxRenderer");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.dam.core.impl.handler.EPSFormatHandler", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqDamCoreImplHandlerEPSFormatHandler");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.dam.core.impl.handler.IndesignFormatHandler", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqDamCoreImplHandlerIndesignFormatHandler");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.dam.core.impl.handler.JpegHandler", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqDamCoreImplHandlerJpegHandler");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.dam.core.impl.handler.xmp.NCommXMPHandler", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqDamCoreImplHandlerXmpNCommXMPHandler");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.dam.core.impl.jmx.AssetIndexUpdateMonitor", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqDamCoreImplJmxAssetIndexUpdateMonitor");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.dam.core.impl.jmx.AssetMigrationMBeanImpl", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqDamCoreImplJmxAssetMigrationMBeanImpl");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.dam.core.impl.jmx.AssetUpdateMonitorImpl", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqDamCoreImplJmxAssetUpdateMonitorImpl");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.dam.core.impl.jobs.metadataexport.AsyncMetadataExportConfigProviderService", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfig");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.dam.core.impl.jobs.metadataimport.AsyncMetadataImportConfigProviderService", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfig");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.dam.core.impl.lightbox.LightboxServlet", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqDamCoreImplLightboxLightboxServlet");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.dam.core.impl.metadata.editor.SelectComponentHandler", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqDamCoreImplMetadataEditorSelectComponentHandler");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.dam.core.impl.mimeType.AssetUploadRestrictionHelper", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelper");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.dam.core.impl.mimeType.DamMimeTypeServiceImpl", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqDamCoreImplMimeTypeDamMimeTypeServiceImpl");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.dam.core.impl.MissingMetadataNotificationJob", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqDamCoreImplMissingMetadataNotificationJob");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.dam.core.impl.process.SendTransientWorkflowCompletedEmailProcess", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPr");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.dam.core.impl.process.TextExtractionProcess", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqDamCoreImplProcessTextExtractionProcess");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.dam.core.impl.RenditionMakerImpl", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqDamCoreImplRenditionMakerImpl");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.dam.core.impl.reports.ReportExportService", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqDamCoreImplReportsReportExportService");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.dam.core.impl.reports.ReportPurgeService", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqDamCoreImplReportsReportPurgeService");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.dam.core.impl.servlet.AssetDownloadServlet", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqDamCoreImplServletAssetDownloadServlet");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.dam.core.impl.servlet.AssetStatusServlet", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqDamCoreImplServletAssetStatusServlet");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.dam.core.impl.servlet.AssetXMPSearchServlet", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqDamCoreImplServletAssetXMPSearchServlet");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.dam.core.impl.servlet.BatchMetadataServlet", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqDamCoreImplServletBatchMetadataServlet");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.dam.core.impl.servlet.BinaryProviderServlet", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqDamCoreImplServletBinaryProviderServlet");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.dam.core.impl.servlet.CollectionServlet", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqDamCoreImplServletCollectionServlet");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.dam.core.impl.servlet.CollectionsServlet", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqDamCoreImplServletCollectionsServlet");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.dam.core.impl.servlet.CompanionServlet", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqDamCoreImplServletCompanionServlet");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.dam.core.impl.servlet.CreateAssetServlet", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqDamCoreImplServletCreateAssetServlet");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.dam.core.impl.servlet.DamContentDispositionFilter", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqDamCoreImplServletDamContentDispositionFilter");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.dam.core.impl.servlet.GuidLookupFilter", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqDamCoreImplServletGuidLookupFilter");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.dam.core.impl.servlet.HealthCheckServlet", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqDamCoreImplServletHealthCheckServlet");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.dam.core.impl.servlet.MetadataGetServlet", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqDamCoreImplServletMetadataGetServlet");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.dam.core.impl.servlet.MultipleLicenseAcceptServlet", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqDamCoreImplServletMultipleLicenseAcceptServlet");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.dam.core.impl.servlet.ResourceCollectionServlet", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqDamCoreImplServletResourceCollectionServlet");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.dam.core.impl.ui.preview.FolderPreviewUpdaterImpl", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImpl");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.dam.core.impl.unzip.UnzipConfig", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqDamCoreImplUnzipUnzipConfig");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.dam.core.process.ExifToolExtractMetadataProcess", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqDamCoreProcessExifToolExtractMetadataProcess");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.dam.core.process.ExtractMetadataProcess", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqDamCoreProcessExtractMetadataProcess");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.dam.core.process.MetadataProcessorProcess", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqDamCoreProcessMetadataProcessorProcess");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.dam.handler.ffmpeg.LocatorImpl", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqDamHandlerFfmpegLocatorImpl");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.dam.handler.gibson.fontmanager.impl.FontManagerServiceImpl", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImpl");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.dam.handler.standard.pdf.PdfHandler", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqDamHandlerStandardPdfPdfHandler");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.dam.handler.standard.ps.PostScriptHandler", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqDamHandlerStandardPsPostScriptHandler");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.dam.handler.standard.psd.PsdHandler", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqDamHandlerStandardPsdPsdHandler");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.dam.ids.impl.IDSJobProcessor", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqDamIdsImplIDSJobProcessor");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.dam.ids.impl.IDSPoolManagerImpl", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqDamIdsImplIDSPoolManagerImpl");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.dam.indd.impl.handler.IndesignXMPHandler", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqDamInddImplHandlerIndesignXMPHandler");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.dam.indd.impl.servlet.SnippetCreationServlet", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqDamInddImplServletSnippetCreationServlet");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.dam.indd.process.INDDMediaExtractProcess", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqDamInddProcessINDDMediaExtractProcess");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.dam.performance.internal.AssetPerformanceDataHandlerImpl", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqDamPerformanceInternalAssetPerformanceDataHandlerImpl");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.dam.performance.internal.AssetPerformanceReportSyncJob", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqDamPerformanceInternalAssetPerformanceReportSyncJob");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.dam.pim.impl.sourcing.upload.process.ProductAssetsUploadProcess", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqDamPimImplSourcingUploadProcessProductAssetsUploadPro");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.dam.s7dam.common.analytics.impl.S7damDynamicMediaConfigEventListener", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEven");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.dam.s7dam.common.analytics.impl.SiteCatalystReportRunner", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunner");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.dam.s7dam.common.post.servlets.SetCreateHandler", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqDamS7damCommonPostServletsSetCreateHandler");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.dam.s7dam.common.post.servlets.SetModifyHandler", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqDamS7damCommonPostServletsSetModifyHandler");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.dam.s7dam.common.process.VideoThumbnailDownloadProcess", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqDamS7damCommonProcessVideoThumbnailDownloadProcess");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.dam.s7dam.common.S7damDamChangeEventListener", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqDamS7damCommonS7damDamChangeEventListener");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.dam.s7dam.common.servlets.S7damProductInfoServlet", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqDamS7damCommonServletsS7damProductInfoServlet");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.dam.s7dam.common.video.impl.VideoProxyClientServiceImpl", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqDamS7damCommonVideoImplVideoProxyClientServiceImpl");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.dam.scene7.impl.Scene7APIClientImpl", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqDamScene7ImplScene7APIClientImpl");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.dam.scene7.impl.Scene7AssetMimeTypeServiceImpl", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqDamScene7ImplScene7AssetMimeTypeServiceImpl");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.dam.scene7.impl.Scene7ConfigurationEventListener", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqDamScene7ImplScene7ConfigurationEventListener");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.dam.scene7.impl.Scene7DamChangeEventListener", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqDamScene7ImplScene7DamChangeEventListener");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.dam.scene7.impl.Scene7FlashTemplatesServiceImpl", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqDamScene7ImplScene7FlashTemplatesServiceImpl");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.dam.scene7.impl.Scene7UploadServiceImpl", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqDamScene7ImplScene7UploadServiceImpl");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.dam.stock.integration.impl.cache.StockCacheConfigurationServiceImpl", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqDamStockIntegrationImplCacheStockCacheConfigurationSer");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.dam.stock.integration.impl.configuration.StockConfigurationImpl", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqDamStockIntegrationImplConfigurationStockConfiguration");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.dam.video.impl.servlet.VideoTestServlet", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqDamVideoImplServletVideoTestServlet");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.extwidget.servlets.ImageSpriteServlet", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqExtwidgetServletsImageSpriteServlet");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.image.internal.font.FontHelper", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqImageInternalFontFontHelper");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.jcrclustersupport.ClusterStartLevelController", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqJcrclustersupportClusterStartLevelController");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.mailer.DefaultMailService", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqMailerDefaultMailService");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.mailer.impl.CqMailingService", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqMailerImplCqMailingService");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.mailer.impl.email.CqEmailTemplateFactory", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqMailerImplEmailCqEmailTemplateFactory");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.mailer.impl.email.CqRetrieverTemplateFactory", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqMailerImplEmailCqRetrieverTemplateFactory");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.mcm.campaign.impl.IntegrationConfigImpl", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqMcmCampaignImplIntegrationConfigImpl");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.mcm.campaign.importer.PersonalizedTextHandlerFactory", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqMcmCampaignImporterPersonalizedTextHandlerFactory");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.mcm.core.newsletter.NewsletterEmailServiceImpl", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqMcmCoreNewsletterNewsletterEmailServiceImpl");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.mcm.impl.MCMConfiguration", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqMcmImplMCMConfiguration");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.mcm.landingpage.parser.taghandlers.cta.ClickThroughComponentTagHandlerFactory", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponen");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.mcm.landingpage.parser.taghandlers.cta.GraphicalClickThroughComponentTagHandlerFactory", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThroug");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.mcm.landingpage.parser.taghandlers.cta.LeadFormCTAComponentTagHandlerFactory", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponent");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.mcm.landingpage.parser.taghandlers.mbox.MBoxExperienceTagHandlerFactory", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHa");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.mcm.landingpage.parser.taghandlers.mbox.TargetComponentTagHandlerFactory", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagH");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.notification.impl.NotificationServiceImpl", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqNotificationImplNotificationServiceImpl");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.personalization.impl.servlets.TargetingConfigurationServlet", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqPersonalizationImplServletsTargetingConfigurationServlet");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.polling.importer.impl.ManagedPollConfigImpl", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqPollingImporterImplManagedPollConfigImpl");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.polling.importer.impl.ManagedPollingImporterImpl", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqPollingImporterImplManagedPollingImporterImpl");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.polling.importer.impl.PollingImporterImpl", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqPollingImporterImplPollingImporterImpl");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.replication.audit.ReplicationEventListener", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqReplicationAuditReplicationEventListener");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.replication.content.StaticContentBuilder", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqReplicationContentStaticContentBuilder");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.replication.impl.AgentManagerImpl", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqReplicationImplAgentManagerImpl");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.replication.impl.content.durbo.BinaryLessContentBuilder", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqReplicationImplContentDurboBinaryLessContentBuilder");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.replication.impl.content.durbo.DurboImportConfigurationProviderService", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqReplicationImplContentDurboDurboImportConfigurationProv");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.replication.impl.ReplicationContentFactoryProviderImpl", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqReplicationImplReplicationContentFactoryProviderImpl");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.replication.impl.ReplicationReceiverImpl", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqReplicationImplReplicationReceiverImpl");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.replication.impl.ReplicatorImpl", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqReplicationImplReplicatorImpl");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.replication.impl.ReverseReplicator", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqReplicationImplReverseReplicator");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.replication.impl.transport.BinaryLessTransportHandler", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqReplicationImplTransportBinaryLessTransportHandler");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.replication.impl.transport.Http", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqReplicationImplTransportHttp");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.reporting.impl.cache.CacheImpl", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqReportingImplCacheCacheImpl");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.reporting.impl.ConfigServiceImpl", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqReportingImplConfigServiceImpl");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.reporting.impl.RLogAnalyzer", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqReportingImplRLogAnalyzer");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.rewriter.linkchecker.impl.LinkCheckerImpl", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqRewriterLinkcheckerImplLinkCheckerImpl");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.rewriter.linkchecker.impl.LinkCheckerTask", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqRewriterLinkcheckerImplLinkCheckerTask");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.rewriter.linkchecker.impl.LinkCheckerTransformerFactory", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactory");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.rewriter.linkchecker.impl.LinkInfoStorageImpl", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqRewriterLinkcheckerImplLinkInfoStorageImpl");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.rewriter.processor.impl.HtmlParserFactory", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqRewriterProcessorImplHtmlParserFactory");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.search.impl.builder.QueryBuilderImpl", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqSearchImplBuilderQueryBuilderImpl");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.search.suggest.impl.SuggestionIndexManagerImpl", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqSearchSuggestImplSuggestionIndexManagerImpl");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.searchpromote.impl.PublishSearchPromoteConfigHandler", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqSearchpromoteImplPublishSearchPromoteConfigHandler");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.searchpromote.impl.SearchPromoteServiceImpl", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqSearchpromoteImplSearchPromoteServiceImpl");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.security.ACLSetup", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqSecurityACLSetup");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.statistics.impl.StatisticsServiceImpl", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqStatisticsImplStatisticsServiceImpl");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.tagging.impl.JcrTagManagerFactoryImpl", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqTaggingImplJcrTagManagerFactoryImpl");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.tagging.impl.search.TagPredicateEvaluator", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqTaggingImplSearchTagPredicateEvaluator");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.tagging.impl.TagGarbageCollector", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqTaggingImplTagGarbageCollector");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.wcm.contentsync.impl.handler.PagesUpdateHandler", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqWcmContentsyncImplHandlerPagesUpdateHandler");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.wcm.contentsync.impl.rewriter.PathRewriterTransformerFactory", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactor");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.wcm.core.impl.AuthoringUIModeServiceImpl", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqWcmCoreImplAuthoringUIModeServiceImpl");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.wcm.core.impl.commands.WCMCommandServlet", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqWcmCoreImplCommandsWCMCommandServlet");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.wcm.core.impl.devicedetection.DeviceIdentificationModeImpl", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImpl");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.wcm.core.impl.event.PageEventAuditListener", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqWcmCoreImplEventPageEventAuditListener");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.wcm.core.impl.event.PagePostProcessor", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqWcmCoreImplEventPagePostProcessor");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.wcm.core.impl.event.RepositoryChangeEventListener", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqWcmCoreImplEventRepositoryChangeEventListener");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.wcm.core.impl.event.TemplatePostProcessor", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqWcmCoreImplEventTemplatePostProcessor");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.wcm.core.impl.LanguageManagerImpl", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqWcmCoreImplLanguageManagerImpl");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.wcm.core.impl.LinkCheckerConfigurationFactoryImpl", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqWcmCoreImplLinkCheckerConfigurationFactoryImpl");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.wcm.core.impl.page.PageInfoAggregatorImpl", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqWcmCoreImplPagePageInfoAggregatorImpl");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.wcm.core.impl.page.PageManagerFactoryImpl", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqWcmCoreImplPagePageManagerFactoryImpl");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.wcm.core.impl.references.content.ContentReferenceConfig", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqWcmCoreImplReferencesContentContentReferenceConfig");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.wcm.core.impl.servlets.contentfinder.AssetViewHandler", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqWcmCoreImplServletsContentfinderAssetViewHandler");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.wcm.core.impl.servlets.contentfinder.connector.ConnectorViewHandler", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqWcmCoreImplServletsContentfinderConnectorConnectorVie");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.wcm.core.impl.servlets.contentfinder.PageViewHandler", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqWcmCoreImplServletsContentfinderPageViewHandler");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.wcm.core.impl.servlets.FindReplaceServlet", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqWcmCoreImplServletsFindReplaceServlet");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.wcm.core.impl.servlets.ReferenceSearchServlet", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqWcmCoreImplServletsReferenceSearchServlet");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.wcm.core.impl.servlets.ThumbnailServlet", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqWcmCoreImplServletsThumbnailServlet");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.wcm.core.impl.utils.DefaultPageNameValidator", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqWcmCoreImplUtilsDefaultPageNameValidator");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.wcm.core.impl.variants.PageVariantsProviderImpl", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqWcmCoreImplVariantsPageVariantsProviderImpl");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.wcm.core.impl.VersionManagerImpl", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqWcmCoreImplVersionManagerImpl");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.wcm.core.impl.VersionPurgeTask", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqWcmCoreImplVersionPurgeTask");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.wcm.core.impl.WCMDebugFilter", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqWcmCoreImplWCMDebugFilter");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.wcm.core.impl.WCMDeveloperModeFilter", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqWcmCoreImplWCMDeveloperModeFilter");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.wcm.core.impl.warp.TimeWarpFilter", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqWcmCoreImplWarpTimeWarpFilter");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.wcm.core.mvt.MVTStatisticsImpl", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqWcmCoreMvtMVTStatisticsImpl");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.wcm.core.stats.PageViewStatisticsImpl", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqWcmCoreStatsPageViewStatisticsImpl");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.wcm.core.WCMRequestFilter", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqWcmCoreWCMRequestFilter");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.wcm.designimporter.DesignPackageImporter", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqWcmDesignimporterDesignPackageImporter");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.wcm.designimporter.impl.CanvasBuilderImpl", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqWcmDesignimporterImplCanvasBuilderImpl");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.wcm.designimporter.impl.CanvasPageDeleteHandler", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqWcmDesignimporterImplCanvasPageDeleteHandler");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.wcm.designimporter.impl.EntryPreprocessorImpl", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqWcmDesignimporterImplEntryPreprocessorImpl");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.wcm.designimporter.impl.MobileCanvasBuilderImpl", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqWcmDesignimporterImplMobileCanvasBuilderImpl");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.CanvasComponentTagHandlerFactory", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqWcmDesignimporterParserTaghandlersFactoryCanvasCompone");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.DefaultComponentTagHandlerFactory", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqWcmDesignimporterParserTaghandlersFactoryDefaultCompon");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.DefaultTagHandlerFactory", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqWcmDesignimporterParserTaghandlersFactoryDefaultTagHan");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.HeadTagHandlerFactory", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqWcmDesignimporterParserTaghandlersFactoryHeadTagHandle");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.IFrameTagHandlerFactory", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqWcmDesignimporterParserTaghandlersFactoryIFrameTagHand");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.ImageComponentTagHandlerFactory", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqWcmDesignimporterParserTaghandlersFactoryImageComponen");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.ImgTagHandlerFactory", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandler");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.InlineScriptTagHandlerFactory", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqWcmDesignimporterParserTaghandlersFactoryInlineScriptT");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.LinkTagHandlerFactory", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqWcmDesignimporterParserTaghandlersFactoryLinkTagHandle");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.MetaTagHandlerFactory", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqWcmDesignimporterParserTaghandlersFactoryMetaTagHandle");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.NonScriptTagHandlerFactory", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqWcmDesignimporterParserTaghandlersFactoryNonScriptTagH");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.ParsysComponentTagHandlerFactory", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqWcmDesignimporterParserTaghandlersFactoryParsysCompone");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.ScriptTagHandlerFactory", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqWcmDesignimporterParserTaghandlersFactoryScriptTagHand");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.StyleTagHandlerFactory", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqWcmDesignimporterParserTaghandlersFactoryStyleTagHandl");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.TextComponentTagHandlerFactory", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqWcmDesignimporterParserTaghandlersFactoryTextComponent");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.TitleComponentTagHandlerFactory", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqWcmDesignimporterParserTaghandlersFactoryTitleComponen");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.TitleTagHandlerFactory", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqWcmDesignimporterParserTaghandlersFactoryTitleTagHandl");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.wcm.foundation.forms.impl.FormChooserServlet", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqWcmFoundationFormsImplFormChooserServlet");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.wcm.foundation.forms.impl.FormParagraphPostProcessor", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqWcmFoundationFormsImplFormParagraphPostProcessor");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.wcm.foundation.forms.impl.FormsHandlingServlet", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqWcmFoundationFormsImplFormsHandlingServlet");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.wcm.foundation.forms.impl.MailServlet", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqWcmFoundationFormsImplMailServlet");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.wcm.foundation.impl.AdaptiveImageComponentServlet", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqWcmFoundationImplAdaptiveImageComponentServlet");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.wcm.foundation.impl.HTTPAuthHandler", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqWcmFoundationImplHTTPAuthHandler");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.wcm.foundation.impl.PageImpressionsTracker", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqWcmFoundationImplPageImpressionsTracker");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.wcm.foundation.impl.PageRedirectServlet", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqWcmFoundationImplPageRedirectServlet");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.wcm.foundation.security.impl.DefaultAttachmentTypeBlacklistService", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklist");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.wcm.foundation.security.impl.SaferSlingPostValidatorImpl", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImpl");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.wcm.mobile.core.impl.device.DeviceInfoTransformerFactory", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactory");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.wcm.mobile.core.impl.redirect.RedirectFilter", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqWcmMobileCoreImplRedirectRedirectFilter");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.wcm.msm.impl.actions.ContentCopyActionFactory", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqWcmMsmImplActionsContentCopyActionFactory");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.wcm.msm.impl.actions.ContentDeleteActionFactory", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqWcmMsmImplActionsContentDeleteActionFactory");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.wcm.msm.impl.actions.ContentUpdateActionFactory", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqWcmMsmImplActionsContentUpdateActionFactory");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.wcm.msm.impl.actions.OrderChildrenActionFactory", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqWcmMsmImplActionsOrderChildrenActionFactory");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.wcm.msm.impl.actions.PageMoveActionFactory", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqWcmMsmImplActionsPageMoveActionFactory");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.wcm.msm.impl.actions.ReferencesUpdateActionFactory", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqWcmMsmImplActionsReferencesUpdateActionFactory");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.wcm.msm.impl.actions.VersionCopyActionFactory", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqWcmMsmImplActionsVersionCopyActionFactory");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.wcm.msm.impl.LiveRelationshipManagerImpl", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqWcmMsmImplLiveRelationshipManagerImpl");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.wcm.msm.impl.RolloutManagerImpl", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqWcmMsmImplRolloutManagerImpl");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.wcm.msm.impl.servlets.AuditLogServlet", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqWcmMsmImplServletsAuditLogServlet");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.wcm.notification.email.impl.EmailChannel", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqWcmNotificationEmailImplEmailChannel");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.wcm.notification.impl.NotificationManagerImpl", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqWcmNotificationImplNotificationManagerImpl");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.wcm.scripting.impl.BVPManager", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqWcmScriptingImplBVPManager");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.wcm.undo.UndoConfig", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqWcmUndoUndoConfig");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.wcm.webservicesupport.impl.ReplicationEventListener", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqWcmWebservicesupportImplReplicationEventListener");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.wcm.workflow.impl.WcmWorkflowServiceImpl", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqWcmWorkflowImplWcmWorkflowServiceImpl");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.wcm.workflow.impl.WorkflowPackageInfoProvider", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqWcmWorkflowImplWorkflowPackageInfoProvider");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.widget.impl.HtmlLibraryManagerImpl", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqWidgetImplHtmlLibraryManagerImpl");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.widget.impl.WidgetExtensionProviderImpl", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqWidgetImplWidgetExtensionProviderImpl");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.workflow.impl.email.EMailNotificationService", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqWorkflowImplEmailEMailNotificationService");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.cq.workflow.impl.email.TaskEMailNotificationService", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCqWorkflowImplEmailTaskEMailNotificationService");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.crx.security.token.impl.impl.TokenAuthenticationHandler", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCrxSecurityTokenImplImplTokenAuthenticationHandler");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/com.day.crx.security.token.impl.TokenCleanupTask", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("comDayCrxSecurityTokenImplTokenCleanupTask");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/Guide Localization Service", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("guideLocalizationService");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/MessagingUserComponentFactory", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("messagingUserComponentFactory");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/org.apache.aries.jmx.framework.StateConfig", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("orgApacheAriesJmxFrameworkStateConfig");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/org.apache.felix.eventadmin.impl.EventAdmin", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("orgApacheFelixEventadminImplEventAdmin");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/org.apache.felix.http", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("orgApacheFelixHttp");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/org.apache.felix.http.sslfilter.SslFilter", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("orgApacheFelixHttpSslfilterSslFilter");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/org.apache.felix.jaas.Configuration.factory", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("orgApacheFelixJaasConfigurationFactory");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/org.apache.felix.jaas.ConfigurationSpi", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("orgApacheFelixJaasConfigurationSpi");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/org.apache.felix.scr.ScrService", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("orgApacheFelixScrScrService");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/org.apache.felix.systemready.impl.ComponentsCheck", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("orgApacheFelixSystemreadyImplComponentsCheck");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/org.apache.felix.systemready.impl.FrameworkStartCheck", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("orgApacheFelixSystemreadyImplFrameworkStartCheck");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/org.apache.felix.systemready.impl.ServicesCheck", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("orgApacheFelixSystemreadyImplServicesCheck");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/org.apache.felix.systemready.impl.servlet.SystemAliveServlet", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("orgApacheFelixSystemreadyImplServletSystemAliveServlet");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/org.apache.felix.systemready.impl.servlet.SystemReadyServlet", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("orgApacheFelixSystemreadyImplServletSystemReadyServlet");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/org.apache.felix.systemready.SystemReadyMonitor", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("orgApacheFelixSystemreadySystemReadyMonitor");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/org.apache.felix.webconsole.internal.servlet.OsgiManager", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("orgApacheFelixWebconsoleInternalServletOsgiManager");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/org.apache.felix.webconsole.plugins.event.internal.PluginServlet", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("orgApacheFelixWebconsolePluginsEventInternalPluginServlet");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/org.apache.felix.webconsole.plugins.memoryusage.internal.MemoryUsageConfigurator", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("orgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCo");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/org.apache.http.proxyconfigurator", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("orgApacheHttpProxyconfigurator");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreTextProviderService", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("orgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProvider");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/org.apache.jackrabbit.oak.plugins.blob.datastore.FileDataStore", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("orgApacheJackrabbitOakPluginsBlobDatastoreFileDataStore");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/org.apache.jackrabbit.oak.plugins.document.DocumentNodeStoreService", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("orgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreService");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/org.apache.jackrabbit.oak.plugins.document.DocumentNodeStoreServicePreset", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("orgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePre");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/org.apache.jackrabbit.oak.plugins.document.secondary.SecondaryStoreCacheService", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("orgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCac");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/org.apache.jackrabbit.oak.plugins.index.AsyncIndexerService", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("orgApacheJackrabbitOakPluginsIndexAsyncIndexerService");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/org.apache.jackrabbit.oak.plugins.index.lucene.LuceneIndexProviderService", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("orgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServ");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/org.apache.jackrabbit.oak.plugins.index.solr.osgi.EmbeddedSolrServerConfigurationProvider", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("orgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCo");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/org.apache.jackrabbit.oak.plugins.index.solr.osgi.NodeStateSolrServersObserverService", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("orgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServers");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/org.apache.jackrabbit.oak.plugins.index.solr.osgi.OakSolrConfigurationProviderService", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("orgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfiguration");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/org.apache.jackrabbit.oak.plugins.index.solr.osgi.RemoteSolrServerConfigurationProvider", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("orgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConf");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/org.apache.jackrabbit.oak.plugins.index.solr.osgi.SolrQueryIndexProviderService", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("orgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvid");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/org.apache.jackrabbit.oak.plugins.index.solr.osgi.SolrServerProviderService", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("orgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSe");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/org.apache.jackrabbit.oak.plugins.metric.StatisticsProviderFactory", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("orgApacheJackrabbitOakPluginsMetricStatisticsProviderFactory");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/org.apache.jackrabbit.oak.plugins.observation.ChangeCollectorProvider", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("orgApacheJackrabbitOakPluginsObservationChangeCollectorProvider");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/org.apache.jackrabbit.oak.query.QueryEngineSettingsService", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("orgApacheJackrabbitOakQueryQueryEngineSettingsService");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/org.apache.jackrabbit.oak.security.authentication.AuthenticationConfigurationImpl", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("orgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfig");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/org.apache.jackrabbit.oak.security.authentication.ldap.impl.LdapIdentityProvider", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdenti");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/org.apache.jackrabbit.oak.security.authentication.token.TokenConfigurationImpl", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("orgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfigura");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/org.apache.jackrabbit.oak.security.authorization.AuthorizationConfigurationImpl", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("orgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigur");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/org.apache.jackrabbit.oak.security.internal.SecurityProviderRegistration", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("orgApacheJackrabbitOakSecurityInternalSecurityProviderRegistrati");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/org.apache.jackrabbit.oak.security.user.RandomAuthorizableNodeName", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("orgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeName");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/org.apache.jackrabbit.oak.security.user.UserConfigurationImpl", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("orgApacheJackrabbitOakSecurityUserUserConfigurationImpl");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/org.apache.jackrabbit.oak.segment.azure.AzureSegmentStoreService", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("orgApacheJackrabbitOakSegmentAzureAzureSegmentStoreService");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/org.apache.jackrabbit.oak.segment.SegmentNodeStoreFactory", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("orgApacheJackrabbitOakSegmentSegmentNodeStoreFactory");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/org.apache.jackrabbit.oak.segment.SegmentNodeStoreMonitorService", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("orgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorService");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/org.apache.jackrabbit.oak.segment.SegmentNodeStoreService", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("orgApacheJackrabbitOakSegmentSegmentNodeStoreService");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/org.apache.jackrabbit.oak.segment.standby.store.StandbyStoreService", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("orgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreService");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/org.apache.jackrabbit.oak.spi.security.authentication.external.impl.DefaultSyncHandler", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDe");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/org.apache.jackrabbit.oak.spi.security.authentication.external.impl.ExternalLoginModuleFactory", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplEx");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/org.apache.jackrabbit.oak.spi.security.authentication.external.impl.principal.ExternalPrincipalConfiguration", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPr");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/org.apache.jackrabbit.oak.spi.security.authorization.cug.impl.CugConfiguration", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("orgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfi");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/org.apache.jackrabbit.oak.spi.security.authorization.cug.impl.CugExcludeImpl", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("orgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExclu");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/org.apache.jackrabbit.oak.spi.security.user.action.DefaultAuthorizableActionProvider", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("orgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizable");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/org.apache.jackrabbit.vault.packaging.impl.PackagingImpl", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("orgApacheJackrabbitVaultPackagingImplPackagingImpl");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/org.apache.jackrabbit.vault.packaging.registry.impl.FSPackageRegistry", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("orgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistry");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/org.apache.sling.auth.core.impl.LogoutServlet", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("orgApacheSlingAuthCoreImplLogoutServlet");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/org.apache.sling.caconfig.impl.ConfigurationBindingsValueProvider", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("orgApacheSlingCaconfigImplConfigurationBindingsValueProvider");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/org.apache.sling.caconfig.impl.ConfigurationResolverImpl", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("orgApacheSlingCaconfigImplConfigurationResolverImpl");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/org.apache.sling.caconfig.impl.def.DefaultConfigurationInheritanceStrategy", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("orgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStra");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/org.apache.sling.caconfig.impl.def.DefaultConfigurationPersistenceStrategy", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("orgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStra");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/org.apache.sling.caconfig.impl.override.OsgiConfigurationOverrideProvider", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("orgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProvi");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/org.apache.sling.caconfig.impl.override.SystemPropertyConfigurationOverrideProvider", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("orgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOve");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/org.apache.sling.caconfig.management.impl.ConfigurationManagementSettingsImpl", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("orgApacheSlingCaconfigManagementImplConfigurationManagementSetti");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/org.apache.sling.caconfig.resource.impl.def.DefaultConfigurationResourceResolvingStrategy", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("orgApacheSlingCaconfigResourceImplDefDefaultConfigurationResour");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/org.apache.sling.caconfig.resource.impl.def.DefaultContextPathStrategy", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("orgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategy");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/org.apache.sling.commons.html.internal.TagsoupHtmlParser", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("orgApacheSlingCommonsHtmlInternalTagsoupHtmlParser");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/org.apache.sling.commons.log.LogManager", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("orgApacheSlingCommonsLogLogManager");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/org.apache.sling.commons.log.LogManager.factory.config", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("orgApacheSlingCommonsLogLogManagerFactoryConfig");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/org.apache.sling.commons.log.LogManager.factory.writer", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("orgApacheSlingCommonsLogLogManagerFactoryWriter");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/org.apache.sling.commons.metrics.internal.LogReporter", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("orgApacheSlingCommonsMetricsInternalLogReporter");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/org.apache.sling.commons.metrics.rrd4j.impl.CodahaleMetricsReporter", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("orgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporter");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/org.apache.sling.commons.mime.internal.MimeTypeServiceImpl", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("orgApacheSlingCommonsMimeInternalMimeTypeServiceImpl");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/org.apache.sling.commons.scheduler.impl.QuartzScheduler", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("orgApacheSlingCommonsSchedulerImplQuartzScheduler");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/org.apache.sling.commons.scheduler.impl.SchedulerHealthCheck", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("orgApacheSlingCommonsSchedulerImplSchedulerHealthCheck");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/org.apache.sling.commons.threads.impl.DefaultThreadPool.factory", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("orgApacheSlingCommonsThreadsImplDefaultThreadPoolFactory");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/org.apache.sling.datasource.DataSourceFactory", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("orgApacheSlingDatasourceDataSourceFactory");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/org.apache.sling.datasource.JNDIDataSourceFactory", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("orgApacheSlingDatasourceJNDIDataSourceFactory");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/org.apache.sling.discovery.oak.Config", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("orgApacheSlingDiscoveryOakConfig");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/org.apache.sling.discovery.oak.SynchronizedClocksHealthCheck", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("orgApacheSlingDiscoveryOakSynchronizedClocksHealthCheck");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/org.apache.sling.distribution.agent.impl.ForwardDistributionAgentFactory", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("orgApacheSlingDistributionAgentImplForwardDistributionAgentFacto");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/org.apache.sling.distribution.agent.impl.PrivilegeDistributionRequestAuthorizationStrategyFactory", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("orgApacheSlingDistributionAgentImplPrivilegeDistributionRequestA");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/org.apache.sling.distribution.agent.impl.QueueDistributionAgentFactory", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("orgApacheSlingDistributionAgentImplQueueDistributionAgentFactory");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/org.apache.sling.distribution.agent.impl.ReverseDistributionAgentFactory", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("orgApacheSlingDistributionAgentImplReverseDistributionAgentFacto");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/org.apache.sling.distribution.agent.impl.SimpleDistributionAgentFactory", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("orgApacheSlingDistributionAgentImplSimpleDistributionAgentFactor");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/org.apache.sling.distribution.agent.impl.SyncDistributionAgentFactory", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("orgApacheSlingDistributionAgentImplSyncDistributionAgentFactory");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/org.apache.sling.distribution.monitor.DistributionQueueHealthCheck", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("orgApacheSlingDistributionMonitorDistributionQueueHealthCheck");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/org.apache.sling.distribution.packaging.impl.exporter.AgentDistributionPackageExporterFactory", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("orgApacheSlingDistributionPackagingImplExporterAgentDistributio");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/org.apache.sling.distribution.packaging.impl.exporter.LocalDistributionPackageExporterFactory", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("orgApacheSlingDistributionPackagingImplExporterLocalDistributio");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/org.apache.sling.distribution.packaging.impl.exporter.RemoteDistributionPackageExporterFactory", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("orgApacheSlingDistributionPackagingImplExporterRemoteDistributi");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/org.apache.sling.distribution.packaging.impl.importer.LocalDistributionPackageImporterFactory", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("orgApacheSlingDistributionPackagingImplImporterLocalDistributio");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/org.apache.sling.distribution.packaging.impl.importer.RemoteDistributionPackageImporterFactory", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("orgApacheSlingDistributionPackagingImplImporterRemoteDistributi");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/org.apache.sling.distribution.packaging.impl.importer.RepositoryDistributionPackageImporterFactory", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("orgApacheSlingDistributionPackagingImplImporterRepositoryDistri");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/org.apache.sling.distribution.resources.impl.DistributionConfigurationResourceProviderFactory", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("orgApacheSlingDistributionResourcesImplDistributionConfiguration");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/org.apache.sling.distribution.resources.impl.DistributionServiceResourceProviderFactory", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("orgApacheSlingDistributionResourcesImplDistributionServiceResour");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/org.apache.sling.distribution.serialization.impl.DistributionPackageBuilderFactory", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("orgApacheSlingDistributionSerializationImplDistributionPackageBu");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/org.apache.sling.distribution.serialization.impl.vlt.VaultDistributionPackageBuilderFactory", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("orgApacheSlingDistributionSerializationImplVltVaultDistribution");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/org.apache.sling.distribution.transport.impl.UserCredentialsDistributionTransportSecretProvider", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("orgApacheSlingDistributionTransportImplUserCredentialsDistributi");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/org.apache.sling.distribution.trigger.impl.DistributionEventDistributeDistributionTriggerFactory", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("orgApacheSlingDistributionTriggerImplDistributionEventDistribute");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/org.apache.sling.distribution.trigger.impl.JcrEventDistributionTriggerFactory", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("orgApacheSlingDistributionTriggerImplJcrEventDistributionTrigger");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/org.apache.sling.distribution.trigger.impl.PersistedJcrEventDistributionTriggerFactory", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("orgApacheSlingDistributionTriggerImplPersistedJcrEventDistributi");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/org.apache.sling.distribution.trigger.impl.RemoteEventDistributionTriggerFactory", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("orgApacheSlingDistributionTriggerImplRemoteEventDistributionTrig");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/org.apache.sling.distribution.trigger.impl.ResourceEventDistributionTriggerFactory", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("orgApacheSlingDistributionTriggerImplResourceEventDistributionTr");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/org.apache.sling.distribution.trigger.impl.ScheduledDistributionTriggerFactory", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("orgApacheSlingDistributionTriggerImplScheduledDistributionTrigge");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/org.apache.sling.engine.impl.auth.SlingAuthenticator", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("orgApacheSlingEngineImplAuthSlingAuthenticator");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/org.apache.sling.engine.impl.debug.RequestProgressTrackerLogFilter", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("orgApacheSlingEngineImplDebugRequestProgressTrackerLogFilter");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/org.apache.sling.engine.impl.log.RequestLogger", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("orgApacheSlingEngineImplLogRequestLogger");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/org.apache.sling.engine.impl.log.RequestLoggerService", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("orgApacheSlingEngineImplLogRequestLoggerService");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/org.apache.sling.engine.impl.SlingMainServlet", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("orgApacheSlingEngineImplSlingMainServlet");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/org.apache.sling.engine.parameters", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("orgApacheSlingEngineParameters");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/org.apache.sling.event.impl.EventingThreadPool", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("orgApacheSlingEventImplEventingThreadPool");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/org.apache.sling.event.impl.jobs.DefaultJobManager", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("orgApacheSlingEventImplJobsDefaultJobManager");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/org.apache.sling.event.impl.jobs.jcr.PersistenceHandler", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("orgApacheSlingEventImplJobsJcrPersistenceHandler");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/org.apache.sling.event.impl.jobs.JobConsumerManager", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("orgApacheSlingEventImplJobsJobConsumerManager");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/org.apache.sling.event.jobs.QueueConfiguration", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("orgApacheSlingEventJobsQueueConfiguration");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/org.apache.sling.extensions.webconsolesecurityprovider.internal.SlingWebConsoleSecurityProvider", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("orgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingW");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/org.apache.sling.featureflags.Feature", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("orgApacheSlingFeatureflagsFeature");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/org.apache.sling.featureflags.impl.ConfiguredFeature", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("orgApacheSlingFeatureflagsImplConfiguredFeature");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/org.apache.sling.hapi.impl.HApiUtilImpl", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("orgApacheSlingHapiImplHApiUtilImpl");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/org.apache.sling.hc.core.impl.CompositeHealthCheck", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("orgApacheSlingHcCoreImplCompositeHealthCheck");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/org.apache.sling.hc.core.impl.executor.HealthCheckExecutorImpl", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("orgApacheSlingHcCoreImplExecutorHealthCheckExecutorImpl");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/org.apache.sling.hc.core.impl.JmxAttributeHealthCheck", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("orgApacheSlingHcCoreImplJmxAttributeHealthCheck");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/org.apache.sling.hc.core.impl.ScriptableHealthCheck", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("orgApacheSlingHcCoreImplScriptableHealthCheck");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/org.apache.sling.hc.core.impl.servlet.HealthCheckExecutorServlet", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("orgApacheSlingHcCoreImplServletHealthCheckExecutorServlet");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/org.apache.sling.hc.core.impl.servlet.ResultTxtVerboseSerializer", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("orgApacheSlingHcCoreImplServletResultTxtVerboseSerializer");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/org.apache.sling.i18n.impl.I18NFilter", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("orgApacheSlingI18nImplI18NFilter");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/org.apache.sling.i18n.impl.JcrResourceBundleProvider", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("orgApacheSlingI18nImplJcrResourceBundleProvider");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/org.apache.sling.installer.provider.jcr.impl.JcrInstaller", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("orgApacheSlingInstallerProviderJcrImplJcrInstaller");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/org.apache.sling.jcr.base.internal.LoginAdminWhitelist", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("orgApacheSlingJcrBaseInternalLoginAdminWhitelist");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/org.apache.sling.jcr.base.internal.LoginAdminWhitelist.fragment", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("orgApacheSlingJcrBaseInternalLoginAdminWhitelistFragment");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/org.apache.sling.jcr.davex.impl.servlets.SlingDavExServlet", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("orgApacheSlingJcrDavexImplServletsSlingDavExServlet");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/org.apache.sling.jcr.jackrabbit.server.JndiRegistrationSupport", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("orgApacheSlingJcrJackrabbitServerJndiRegistrationSupport");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/org.apache.sling.jcr.jackrabbit.server.RmiRegistrationSupport", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("orgApacheSlingJcrJackrabbitServerRmiRegistrationSupport");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/org.apache.sling.jcr.repoinit.impl.RepositoryInitializer", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("orgApacheSlingJcrRepoinitImplRepositoryInitializer");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/org.apache.sling.jcr.repoinit.RepositoryInitializer", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("orgApacheSlingJcrRepoinitRepositoryInitializer");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/org.apache.sling.jcr.resource.internal.JcrResourceResolverFactoryImpl", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("orgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImpl");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/org.apache.sling.jcr.resource.internal.JcrSystemUserValidator", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("orgApacheSlingJcrResourceInternalJcrSystemUserValidator");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/org.apache.sling.jcr.resourcesecurity.impl.ResourceAccessGateFactory", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("orgApacheSlingJcrResourcesecurityImplResourceAccessGateFactory");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/org.apache.sling.jcr.webdav.impl.handler.DefaultHandlerService", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("orgApacheSlingJcrWebdavImplHandlerDefaultHandlerService");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/org.apache.sling.jcr.webdav.impl.handler.DirListingExportHandlerService", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("orgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServic");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/org.apache.sling.jcr.webdav.impl.servlets.SimpleWebDavServlet", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("orgApacheSlingJcrWebdavImplServletsSimpleWebDavServlet");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/org.apache.sling.jmx.provider.impl.JMXResourceProvider", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("orgApacheSlingJmxProviderImplJMXResourceProvider");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/org.apache.sling.models.impl.ModelAdapterFactory", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("orgApacheSlingModelsImplModelAdapterFactory");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/org.apache.sling.models.jacksonexporter.impl.ResourceModuleProvider", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("orgApacheSlingModelsJacksonexporterImplResourceModuleProvider");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/org.apache.sling.resource.inventory.impl.ResourceInventoryPrinterFactory", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("orgApacheSlingResourceInventoryImplResourceInventoryPrinterFacto");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/org.apache.sling.resourcemerger.impl.MergedResourceProviderFactory", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("orgApacheSlingResourcemergerImplMergedResourceProviderFactory");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/org.apache.sling.resourcemerger.picker.overriding", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("orgApacheSlingResourcemergerPickerOverriding");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/org.apache.sling.scripting.core.impl.ScriptCacheImpl", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("orgApacheSlingScriptingCoreImplScriptCacheImpl");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/org.apache.sling.scripting.core.impl.ScriptingResourceResolverProviderImpl", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("orgApacheSlingScriptingCoreImplScriptingResourceResolverProvider");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/org.apache.sling.scripting.java.impl.JavaScriptEngineFactory", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("orgApacheSlingScriptingJavaImplJavaScriptEngineFactory");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/org.apache.sling.scripting.javascript.internal.RhinoJavaScriptEngineFactory", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("orgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFa");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/org.apache.sling.scripting.jsp.JspScriptEngineFactory", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("orgApacheSlingScriptingJspJspScriptEngineFactory");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/org.apache.sling.scripting.sightly.js.impl.jsapi.SlyBindingsValuesProvider", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("orgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProv");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/org.apache.sling.security.impl.ContentDispositionFilter", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("orgApacheSlingSecurityImplContentDispositionFilter");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/org.apache.sling.security.impl.ReferrerFilter", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("orgApacheSlingSecurityImplReferrerFilter");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/org.apache.sling.serviceusermapping.impl.ServiceUserMapperImpl", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("orgApacheSlingServiceusermappingImplServiceUserMapperImpl");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/org.apache.sling.serviceusermapping.impl.ServiceUserMapperImpl.amended", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("orgApacheSlingServiceusermappingImplServiceUserMapperImplAmended");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/org.apache.sling.servlets.get.DefaultGetServlet", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("orgApacheSlingServletsGetDefaultGetServlet");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/org.apache.sling.servlets.get.impl.version.VersionInfoServlet", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("orgApacheSlingServletsGetImplVersionVersionInfoServlet");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/org.apache.sling.servlets.post.impl.helper.ChunkCleanUpTask", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("orgApacheSlingServletsPostImplHelperChunkCleanUpTask");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/org.apache.sling.servlets.post.impl.SlingPostServlet", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("orgApacheSlingServletsPostImplSlingPostServlet");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/org.apache.sling.servlets.resolver.SlingServletResolver", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("orgApacheSlingServletsResolverSlingServletResolver");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/org.apache.sling.settings.impl.SlingSettingsServiceImpl", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("orgApacheSlingSettingsImplSlingSettingsServiceImpl");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/org.apache.sling.startupfilter.impl.StartupFilterImpl", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("orgApacheSlingStartupfilterImplStartupFilterImpl");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/org.apache.sling.tenant.internal.TenantProviderImpl", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("orgApacheSlingTenantInternalTenantProviderImpl");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/org.apache.sling.tracer.internal.LogTracer", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("orgApacheSlingTracerInternalLogTracer");
                        }
                    })


            .add(Methods.POST, "//system/console/configMgr/org.apache.sling.xss.impl.XSSFilterImpl", new HttpHandler() {
                        public void handleRequest(HttpServerExchange exchange) throws Exception {
                            exchange.getResponseSender().send("orgApacheSlingXssImplXSSFilterImpl");
                        }
                    })

        ;
        return handler;
    }
}

