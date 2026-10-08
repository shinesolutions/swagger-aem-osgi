/*
 * Adobe Experience Manager OSGI config (AEM) API
 *
 * Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
 *
 * OpenAPI document version: 1.0.0-pre.0
 * Maintained by: opensource@shinesolutions.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.handler;

import com.networknt.server.HandlerProvider;
import io.undertow.Handlers;
import io.undertow.server.HttpHandler;
import io.undertow.server.HttpServerExchange;
import io.undertow.server.RoutingHandler;
import io.undertow.server.handlers.PathHandler;
import io.undertow.util.Methods;

/**
 * The default implementation for {@link HandlerProvider} and {@link PathHandlerInterface}.
 *
 * <p>There are two flavors of {@link HttpHandler}s to choose from, depending on your needs:</p>
 *
 * <ul>
 * <li>
 * <b>Stateless</b>: if a specific endpoint is called more than once from multiple sessions,
 * its state is not retained – a different {@link HttpHandler} is instantiated for every new
 * session. This is the default behavior.
 * </li>
 * <li>
 * <b>Stateful</b>: if a specific endpoint is called more than once from multiple sessions,
 * its state is retained properly. For example, if you want to keep a class property that counts
 * the number of requests or the last time a request was received.
 * </li>
 * </ul>
 * <p>Note: <b>Stateful</b> flavor is more performant than <b>Stateless</b>.</p>
 */
@SuppressWarnings("TooManyFunctions")
abstract public class PathHandlerProvider implements HandlerProvider, PathHandlerInterface {
    /**
     * Returns the default base path to access this server.
     */
    @javax.annotation.Nonnull
    public String getBasePath() {
        return "";
    }

    /**
     * Returns a stateless {@link HttpHandler} that configures all endpoints in this server.
     *
     * <p>Endpoints bound in this method do NOT start with "", and
     * it's your responsibility to configure a {@link PathHandler} with a prefix path
     * by calling {@link PathHandler#addPrefixPath} like so:</p>
     *
     * <code>pathHandler.addPrefixPath("", handler)</code>
     *
     * <p>Note: the endpoints bound to the returned {@link HttpHandler} are stateless and won't
    * retain any state between multiple sessions.</p>
     *
     * @return an {@link HttpHandler} of type {@link RoutingHandler}
     */
    @javax.annotation.Nonnull
    @Override
    public HttpHandler getHandler() {
        return getHandler(false);
    }

    /**
     * Returns a stateless {@link HttpHandler} that configures all endpoints in this server.
     *
     * <p>Note: the endpoints bound to the returned {@link HttpHandler} are stateless and won't
     * retain any state between multiple sessions.</p>
     *
     * @param withBasePath if true, all endpoints would start with ""
     * @return an {@link HttpHandler} of type {@link RoutingHandler}
     */
    @javax.annotation.Nonnull
    public HttpHandler getHandler(final boolean withBasePath) {
        return getHandler(withBasePath ? getBasePath() : "");
    }

    /**
     * Returns a stateless {@link HttpHandler} that configures all endpoints in this server.
     *
     * <p>Note: the endpoints bound to the returned {@link HttpHandler} are stateless and won't
     * retain any state between multiple sessions.</p>
     *
     * @param basePath base path to set for all endpoints
     * @return an {@link HttpHandler} of type {@link RoutingHandler}
     */
    @SuppressWarnings("Convert2Lambda")
    @javax.annotation.Nonnull
    public HttpHandler getHandler(final String basePath) {
        return Handlers.routing()
            .add(Methods.POST, basePath + "/system/console/configMgr/Adaptive Form and Interactive Communication Web Channel Configuration", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    adaptiveFormAndInteractiveCommunicationWebChannelConfiguration().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/Adaptive Form and Interactive Communication Web Channel Theme Configuration", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    adaptiveFormAndInteractiveCommunicationWebChannelThemeConfigur().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/Analytics Component Query Cache Service", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    analyticsComponentQueryCacheService().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/Apache Sling Health Check Result HTML Serializer", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    apacheSlingHealthCheckResultHTMLSerializer().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.aem.formsndocuments.config.AEMFormsManagerConfiguration", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeAemFormsndocumentsConfigAEMFormsManagerConfiguration().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.aem.transaction.core.impl.TransactionRecorder", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeAemTransactionCoreImplTransactionRecorder().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.aem.upgrade.prechecks.hc.impl.DeprecateIndexesHC", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeAemUpgradePrechecksHcImplDeprecateIndexesHC().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.aem.upgrade.prechecks.hc.impl.ReplicationAgentsDisabledHC", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHC().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.aem.upgrade.prechecks.mbean.impl.PreUpgradeTasksMBeanImpl", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImpl().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.aem.upgrade.prechecks.tasks.impl.ConsistencyCheckTaskImpl", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImpl().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.account.api.AccountManagementService", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeCqAccountApiAccountManagementService().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.account.impl.AccountManagementServlet", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeCqAccountImplAccountManagementServlet().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.address.impl.location.LocationListServlet", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeCqAddressImplLocationLocationListServlet().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.audit.purge.Dam", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeCqAuditPurgeDam().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.audit.purge.Pages", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeCqAuditPurgePages().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.audit.purge.Replication", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeCqAuditPurgeReplication().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.cdn.rewriter.impl.AWSCloudFrontRewriter", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeCqCdnRewriterImplAWSCloudFrontRewriter().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.cdn.rewriter.impl.CDNConfigServiceImpl", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeCqCdnRewriterImplCDNConfigServiceImpl().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.cdn.rewriter.impl.CDNRewriter", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeCqCdnRewriterImplCDNRewriter().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.cloudconfig.core.impl.ConfigurationReplicationEventHandler", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandle().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.commerce.impl.asset.DynamicImageHandler", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeCqCommerceImplAssetDynamicImageHandler().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.commerce.impl.asset.ProductAssetHandlerProviderImpl", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeCqCommerceImplAssetProductAssetHandlerProviderImpl().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.commerce.impl.asset.StaticImageHandler", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeCqCommerceImplAssetStaticImageHandler().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.commerce.impl.asset.VideoHandler", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeCqCommerceImplAssetVideoHandler().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.commerce.impl.promotion.PromotionManagerImpl", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeCqCommerceImplPromotionPromotionManagerImpl().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.commerce.pim.impl.cataloggenerator.CatalogGeneratorImpl", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImpl().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.commerce.pim.impl.PageEventListener", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeCqCommercePimImplPageEventListener().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.commerce.pim.impl.productfeed.ProductFeedServiceImpl", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeCqCommercePimImplProductfeedProductFeedServiceImpl().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.contentinsight.impl.ReportingServicesSettingsProvider", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeCqContentinsightImplReportingServicesSettingsProvider().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.contentinsight.impl.servlets.BrightEdgeProxyServlet", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeCqContentinsightImplServletsBrightEdgeProxyServlet().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.contentinsight.impl.servlets.ReportingServicesProxyServlet", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeCqContentinsightImplServletsReportingServicesProxyServle().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.dam.cfm.impl.component.ComponentConfigImpl", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeCqDamCfmImplComponentComponentConfigImpl().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.dam.cfm.impl.conf.FeatureConfigImpl", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeCqDamCfmImplConfFeatureConfigImpl().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.dam.cfm.impl.content.rewriter.AssetProcessor", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeCqDamCfmImplContentRewriterAssetProcessor().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.dam.cfm.impl.content.rewriter.ParRangeFilter", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeCqDamCfmImplContentRewriterParRangeFilter().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.dam.cfm.impl.content.rewriter.PayloadFilter", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeCqDamCfmImplContentRewriterPayloadFilter().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.dam.dm.process.image.PTiffManagerImpl", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeCqDamDmProcessImagePTiffManagerImpl().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.dam.ips.impl.replication.trigger.ReplicateOnModifyWorker", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorker().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.dam.mac.sync.helper.impl.MACSyncClientImpl", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeCqDamMacSyncHelperImplMACSyncClientImpl().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.dam.mac.sync.impl.DAMSyncServiceImpl", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeCqDamMacSyncImplDAMSyncServiceImpl().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.dam.processor.nui.impl.NuiAssetProcessor", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeCqDamProcessorNuiImplNuiAssetProcessor().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.dam.s7imaging.impl.is.ImageServerComponent", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeCqDamS7imagingImplIsImageServerComponent().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.dam.s7imaging.impl.ps.PlatformServerServlet", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeCqDamS7imagingImplPsPlatformServerServlet().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.dam.webdav.impl.io.AssetIOHandler", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeCqDamWebdavImplIoAssetIOHandler().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.dam.webdav.impl.io.DamWebdavVersionLinkingJob", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJob().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.dam.webdav.impl.io.SpecialFilesHandler", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeCqDamWebdavImplIoSpecialFilesHandler().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.deserfw.impl.DeserializationFirewallImpl", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeCqDeserfwImplDeserializationFirewallImpl().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.dtm.impl.service.DTMWebServiceImpl", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeCqDtmImplServiceDTMWebServiceImpl().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.dtm.impl.servlets.DTMDeployHookServlet", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeCqDtmImplServletsDTMDeployHookServlet().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.dtm.reactor.impl.service.WebServiceImpl", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeCqDtmReactorImplServiceWebServiceImpl().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.experiencelog.impl.ExperienceLogConfigServlet", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeCqExperiencelogImplExperienceLogConfigServlet().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.hc.ContentPackagesHealthCheck", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeCqHcContentPackagesHealthCheck().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.history.impl.HistoryRequestFilter", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeCqHistoryImplHistoryRequestFilter().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.history.impl.HistoryServiceImpl", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeCqHistoryImplHistoryServiceImpl().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.inbox.impl.typeprovider.ItemTypeProvider", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeCqInboxImplTypeproviderItemTypeProvider().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.projects.impl.servlet.ProjectImageServlet", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeCqProjectsImplServletProjectImageServlet().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.projects.purge.Scheduler", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeCqProjectsPurgeScheduler().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.scheduled.exporter.impl.ScheduledExporterImpl", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeCqScheduledExporterImplScheduledExporterImpl().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.screens.analytics.impl.ScreensAnalyticsServiceImpl", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImpl().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.screens.device.impl.DeviceService", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeCqScreensDeviceImplDeviceService().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.screens.device.registration.impl.RegistrationServiceImpl", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeCqScreensDeviceRegistrationImplRegistrationServiceImpl().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.screens.impl.handler.ChannelsUpdateHandler", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeCqScreensImplHandlerChannelsUpdateHandler().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.screens.impl.jobs.DistributedDevicesStatiUpdateJob", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJob().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.screens.impl.remote.impl.DistributedHttpClientImpl", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeCqScreensImplRemoteImplDistributedHttpClientImpl().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.screens.impl.ScreensChannelPostProcessor", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeCqScreensImplScreensChannelPostProcessor().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeCqScreensMonitoringImplScreensMonitoringServiceImpl().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.screens.mq.activemq.impl.ArtemisJMSProvider", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeCqScreensMqActivemqImplArtemisJMSProvider().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.screens.offlinecontent.impl.BulkOfflineUpdateServiceImpl", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImpl().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.screens.offlinecontent.impl.OfflineContentServiceImpl", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeCqScreensOfflinecontentImplOfflineContentServiceImpl().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.screens.segmentation.impl.SegmentationFeatureFlag", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeCqScreensSegmentationImplSegmentationFeatureFlag().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.security.hc.bundles.impl.HtmlLibraryManagerConfigHealthCheck", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthCh().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.security.hc.bundles.impl.WcmFilterHealthCheck", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeCqSecurityHcBundlesImplWcmFilterHealthCheck().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.security.hc.dispatcher.impl.DispatcherAccessHealthCheck", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheck().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.security.hc.packages.impl.ExampleContentHealthCheck", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeCqSecurityHcPackagesImplExampleContentHealthCheck().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.security.hc.webserver.impl.ClickjackingHealthCheck", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeCqSecurityHcWebserverImplClickjackingHealthCheck().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.accountverification.impl.AccountManagementConfigImpl", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeCqSocialAccountverificationImplAccountManagementConfigIm().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.activitystreams.client.impl.SocialActivityComponentFactoryImpl", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeCqSocialActivitystreamsClientImplSocialActivityComponen().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.activitystreams.client.impl.SocialActivityStreamComponentFactory", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCo().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.activitystreams.listener.impl.EventListenerHandler", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeCqSocialActivitystreamsListenerImplEventListenerHandler().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.activitystreams.listener.impl.ModerationEventExtension", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeCqSocialActivitystreamsListenerImplModerationEventExten().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.activitystreams.listener.impl.RatingEventActivitySuppressor", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeCqSocialActivitystreamsListenerImplRatingEventActivityS().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.activitystreams.listener.impl.ResourceActivityStreamProviderFactory", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeCqSocialActivitystreamsListenerImplResourceActivityStre().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.calendar.client.endpoints.impl.CalendarOperationsImpl", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsI().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.calendar.client.operationextensions.EventAttachment", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeCqSocialCalendarClientOperationextensionsEventAttachmen().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.calendar.servlets.TimeZoneServlet", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeCqSocialCalendarServletsTimeZoneServlet().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.commons.comments.endpoints.impl.CommentDeleteEventActivitySuppressor", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEvent().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.commons.comments.endpoints.impl.CommentOperationService", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSe().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.commons.comments.endpoints.impl.TranslationOperationService", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperati().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.commons.comments.listing.impl.SearchCommentSocialComponentListProvider", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialC().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.commons.comments.scheduler.impl.SearchScheduledPosts", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPos().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.commons.cors.CORSAuthenticationFilter", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeCqSocialCommonsCorsCORSAuthenticationFilter().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.commons.emailreply.impl.AndroidEmailClientProvider", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProvider().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.commons.emailreply.impl.CommentEmailBuilderImpl", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImpl().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.commons.emailreply.impl.CommentEmailEventListener", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListener().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.commons.emailreply.impl.CustomEmailClientProvider", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeCqSocialCommonsEmailreplyImplCustomEmailClientProvider().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.commons.emailreply.impl.EmailQuotedTextPatternsImpl", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImp().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.commons.emailreply.impl.EmailReplyConfigurationImpl", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImp().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.commons.emailreply.impl.EmailReplyImporter", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeCqSocialCommonsEmailreplyImplEmailReplyImporter().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.commons.emailreply.impl.GmailEmailClientProvider", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeCqSocialCommonsEmailreplyImplGmailEmailClientProvider().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.commons.emailreply.impl.IOSEmailClientProvider", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProvider().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.commons.emailreply.impl.MacmailEmailClientProvider", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProvider().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.commons.emailreply.impl.OutLookEmailClientProvider", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeCqSocialCommonsEmailreplyImplOutLookEmailClientProvider().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.commons.emailreply.impl.UnknownEmailClientProvider", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProvider().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.commons.emailreply.impl.YahooEmailClientProvider", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProvider().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.commons.maintainance.impl.DeleteTempUGCImageUploads", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUpload().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.commons.ugclimiter.impl.UGCLimiterServiceImpl", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImpl().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.commons.ugclimitsconfig.impl.CommunityUserUGCLimitsConfigImpl", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimit().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.connect.oauth.impl.FacebookProviderImpl", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeCqSocialConnectOauthImplFacebookProviderImpl().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.connect.oauth.impl.SocialOAuthAuthenticationHandler", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandle().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.connect.oauth.impl.SocialOAuthUserProfileMapper", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapper().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.connect.oauth.impl.TwitterProviderImpl", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeCqSocialConnectOauthImplTwitterProviderImpl().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.content.fragments.services.impl.CommunitiesFragmentCreationServiceImpl", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmen().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.datastore.as.impl.ASResourceProviderFactory", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeCqSocialDatastoreAsImplASResourceProviderFactory().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.datastore.op.impl.SocialMSResourceProviderFactory", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactory().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.datastore.rdb.impl.SocialRDBResourceProviderFactory", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactor().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.enablement.adaptors.EnablementLearningPathAdaptorFactory", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorF().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.enablement.adaptors.EnablementResourceAdaptorFactory", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFacto().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.enablement.learningpath.endpoints.impl.EnablementLearningPathModelOperationService", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeCqSocialEnablementLearningpathEndpointsImplEnablementL().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.enablement.resource.endpoints.impl.EnablementResourceModelOperationService", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeCqSocialEnablementResourceEndpointsImplEnablementResou().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.enablement.services.impl.AuthorMarkerImpl", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeCqSocialEnablementServicesImplAuthorMarkerImpl().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.filelibrary.client.endpoints.FilelibraryDownloadGetServlet", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGe().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.filelibrary.client.endpoints.impl.FileLibraryOperationsService", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOpera().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.forum.client.endpoints.impl.ForumOperationsService", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeCqSocialForumClientEndpointsImplForumOperationsService().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.forum.dispatcher.impl.FlushOperations", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeCqSocialForumDispatcherImplFlushOperations().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.group.client.impl.CommunityGroupCollectionComponentFactory", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeCqSocialGroupClientImplCommunityGroupCollectionComponen().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.group.impl.GroupServiceImpl", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeCqSocialGroupImplGroupServiceImpl().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.handlebars.GuavaTemplateCacheImpl", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeCqSocialHandlebarsGuavaTemplateCacheImpl().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.ideation.client.endpoints.impl.IdeationOperationsService", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsS().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.journal.client.endpoints.impl.JournalOperationsService", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeCqSocialJournalClientEndpointsImplJournalOperationsSer().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.members.endpoints.impl.CommunityMemberGroupProfileOperationService", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfile().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.members.endpoints.impl.CommunityMemberUserProfileOperationService", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileO().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.members.impl.CommunityMemberGroupProfileComponentFactory", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentF().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.messaging.client.endpoints.impl.MessagingOperationsServiceImpl", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeCqSocialMessagingClientEndpointsImplMessagingOperation().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.moderation.dashboard.api.FilterGroupSocialComponentFactory", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeCqSocialModerationDashboardApiFilterGroupSocialComponen().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.moderation.dashboard.api.ModerationDashboardSocialComponentFactory", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeCqSocialModerationDashboardApiModerationDashboardSocial().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.moderation.dashboard.api.UserDetailsSocialComponentFactory", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeCqSocialModerationDashboardApiUserDetailsSocialComponen().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.moderation.dashboard.internal.impl.FilterGroupSocialComponentFactoryV2", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeCqSocialModerationDashboardInternalImplFilterGroupSoci().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.notifications.impl.MentionsRouter", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeCqSocialNotificationsImplMentionsRouter().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.notifications.impl.NotificationManagerImpl", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeCqSocialNotificationsImplNotificationManagerImpl().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.notifications.impl.NotificationsRouter", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeCqSocialNotificationsImplNotificationsRouter().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.qna.client.endpoints.impl.QnaForumOperationsService", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServic().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.reporting.analytics.services.impl.AnalyticsReportImporterServiceImpl", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportI().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.reporting.analytics.services.impl.AnalyticsReportManagementServiceImpl", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportM().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.reporting.analytics.services.impl.SiteTrendReportSocialComponentFactory", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportS().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.review.client.endpoints.impl.ReviewOperationsService", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeCqSocialReviewClientEndpointsImplReviewOperationsServi().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.scf.core.operations.impl.SocialOperationsServlet", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeCqSocialScfCoreOperationsImplSocialOperationsServlet().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.scf.endpoints.impl.DefaultSocialGetServlet", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeCqSocialScfEndpointsImplDefaultSocialGetServlet().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.scoring.impl.ScoringEventListener", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeCqSocialScoringImplScoringEventListener().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.serviceusers.internal.impl.ServiceUserWrapperImpl", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeCqSocialServiceusersInternalImplServiceUserWrapperImpl().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.site.endpoints.impl.SiteOperationService", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeCqSocialSiteEndpointsImplSiteOperationService().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.site.impl.AnalyticsComponentConfigurationServiceImpl", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceIm().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.site.impl.SiteConfiguratorImpl", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeCqSocialSiteImplSiteConfiguratorImpl().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.srp.impl.SocialSolrConnector", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeCqSocialSrpImplSocialSolrConnector().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.sync.impl.DiffChangesObserver", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeCqSocialSyncImplDiffChangesObserver().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.sync.impl.GroupSyncListenerImpl", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeCqSocialSyncImplGroupSyncListenerImpl().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.sync.impl.PublisherSyncServiceImpl", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeCqSocialSyncImplPublisherSyncServiceImpl().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.sync.impl.UserSyncListenerImpl", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeCqSocialSyncImplUserSyncListenerImpl().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.translation.impl.TranslationServiceConfigManager", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeCqSocialTranslationImplTranslationServiceConfigManager().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.translation.impl.UGCLanguageDetector", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeCqSocialTranslationImplUGCLanguageDetector().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.ugcbase.dispatcher.impl.FlushServiceImpl", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeCqSocialUgcbaseDispatcherImplFlushServiceImpl().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.ugcbase.impl.AysncReverseReplicatorImpl", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeCqSocialUgcbaseImplAysncReverseReplicatorImpl().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.ugcbase.impl.PublisherConfigurationImpl", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeCqSocialUgcbaseImplPublisherConfigurationImpl().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.ugcbase.impl.SocialUtilsImpl", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeCqSocialUgcbaseImplSocialUtilsImpl().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.ugcbase.moderation.impl.AutoModerationImpl", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeCqSocialUgcbaseModerationImplAutoModerationImpl().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.ugcbase.moderation.impl.SentimentProcess", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeCqSocialUgcbaseModerationImplSentimentProcess().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.ugcbase.security.impl.DefaultAttachmentTypeBlacklistService", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackli().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.ugcbase.security.impl.SaferSlingPostValidatorImpl", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImpl().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.user.endpoints.impl.UsersGroupFromPublishServlet", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServlet().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.user.impl.transport.HttpToPublisher", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeCqSocialUserImplTransportHttpToPublisher().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.ui.wcm.commons.internal.servlets.rte.RTEFilterServletFactory.amended", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFact().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.upgrades.cleanup.impl.UpgradeContentCleanup", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeCqUpgradesCleanupImplUpgradeContentCleanup().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.upgrades.cleanup.impl.UpgradeInstallFolderCleanup", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanup().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.wcm.jobs.async.impl.AsyncDeleteConfigProviderService", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderService().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.wcm.jobs.async.impl.AsyncJobCleanUpTask", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTask().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.wcm.jobs.async.impl.AsyncMoveConfigProviderService", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderService().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.wcm.jobs.async.impl.AsyncPageMoveConfigProviderService", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderService().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.wcm.launches.impl.LaunchesEventHandler", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeCqWcmLaunchesImplLaunchesEventHandler().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.wcm.mobile.qrcode.servlet.QRCodeImageGenerator", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeCqWcmMobileQrcodeServletQRCodeImageGenerator().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.wcm.style.internal.ComponentStyleInfoCacheImpl", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeCqWcmStyleInternalComponentStyleInfoCacheImpl().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.wcm.translation.impl.TranslationPlatformConfigurationImpl", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeCqWcmTranslationImplTranslationPlatformConfigurationImpl().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.fd.fp.config.FormsPortalDraftsandSubmissionConfigService", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigService().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.fd.fp.config.FormsPortalSchedulerService", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeFdFpConfigFormsPortalSchedulerService().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.forms.common.service.impl.DefaultDataProvider", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeFormsCommonServiceImplDefaultDataProvider().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.forms.common.service.impl.FormsCommonConfigurationServiceImpl", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImp().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.forms.common.servlet.TempCleanUpTask", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeFormsCommonServletTempCleanUpTask().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.acp.platform.PlatformServlet", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeGraniteAcpPlatformPlatformServlet().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.activitystreams.impl.ActivityManagerImpl", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeGraniteActivitystreamsImplActivityManagerImpl().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.analyzer.base.SystemStatusServlet", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeGraniteAnalyzerBaseSystemStatusServlet().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.analyzer.scripts.compile.AllScriptsCompilerServlet", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServlet().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.apicontroller.FilterResolverHookFactory", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeGraniteApicontrollerFilterResolverHookFactory().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.auth.cert.impl.ClientCertAuthHandler", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeGraniteAuthCertImplClientCertAuthHandler().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.auth.ims", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeGraniteAuthIms().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.auth.ims.impl.ExternalUserIdMappingProviderExtension", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtension().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.auth.ims.impl.IMSAccessTokenRequestCustomizerImpl", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImpl().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.auth.ims.impl.IMSInstanceCredentialsValidator", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeGraniteAuthImsImplIMSInstanceCredentialsValidator().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.auth.ims.impl.IMSProviderImpl", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeGraniteAuthImsImplIMSProviderImpl().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.auth.ims.impl.ImsConfigProviderImpl", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeGraniteAuthImsImplImsConfigProviderImpl().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.auth.oauth.accesstoken.provider", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeGraniteAuthOauthAccesstokenProvider().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.auth.oauth.impl.BearerAuthenticationHandler", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeGraniteAuthOauthImplBearerAuthenticationHandler().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.auth.oauth.impl.DefaultTokenValidatorImpl", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeGraniteAuthOauthImplDefaultTokenValidatorImpl().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.auth.oauth.impl.FacebookProviderImpl", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeGraniteAuthOauthImplFacebookProviderImpl().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.auth.oauth.impl.GithubProviderImpl", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeGraniteAuthOauthImplGithubProviderImpl().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.auth.oauth.impl.GraniteProvider", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeGraniteAuthOauthImplGraniteProvider().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.auth.oauth.impl.helper.ProviderConfigManager", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeGraniteAuthOauthImplHelperProviderConfigManager().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.auth.oauth.impl.helper.ProviderConfigManagerInternal", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternal().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.auth.oauth.impl.OAuthAuthenticationHandler", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeGraniteAuthOauthImplOAuthAuthenticationHandler().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.auth.oauth.impl.TwitterProviderImpl", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeGraniteAuthOauthImplTwitterProviderImpl().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.auth.oauth.provider", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeGraniteAuthOauthProvider().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.auth.requirement.impl.DefaultRequirementHandler", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeGraniteAuthRequirementImplDefaultRequirementHandler().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.auth.saml.SamlAuthenticationHandler", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeGraniteAuthSamlSamlAuthenticationHandler().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.auth.sso.impl.SsoAuthenticationHandler", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeGraniteAuthSsoImplSsoAuthenticationHandler().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.bundles.hc.impl.CodeCacheHealthCheck", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeGraniteBundlesHcImplCodeCacheHealthCheck().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.bundles.hc.impl.CrxdeSupportBundleHealthCheck", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheck().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.bundles.hc.impl.DavExBundleHealthCheck", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeGraniteBundlesHcImplDavExBundleHealthCheck().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.bundles.hc.impl.InactiveBundlesHealthCheck", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeGraniteBundlesHcImplInactiveBundlesHealthCheck().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.bundles.hc.impl.JobsHealthCheck", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeGraniteBundlesHcImplJobsHealthCheck().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.bundles.hc.impl.SlingGetServletHealthCheck", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeGraniteBundlesHcImplSlingGetServletHealthCheck().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.bundles.hc.impl.SlingJavaScriptHandlerHealthCheck", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheck().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.bundles.hc.impl.SlingJspScriptHandlerHealthCheck", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheck().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.bundles.hc.impl.SlingReferrerFilterHealthCheck", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheck().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.bundles.hc.impl.WebDavBundleHealthCheck", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeGraniteBundlesHcImplWebDavBundleHealthCheck().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.comments.internal.CommentReplicationContentFilterFactory", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeGraniteCommentsInternalCommentReplicationContentFilterFac().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.compatrouter.impl.CompatSwitchingServiceImpl", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeGraniteCompatrouterImplCompatSwitchingServiceImpl().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.compatrouter.impl.RoutingConfig", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeGraniteCompatrouterImplRoutingConfig().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.compatrouter.impl.SwitchMappingConfig", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeGraniteCompatrouterImplSwitchMappingConfig().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.conf.impl.RuntimeAwareConfigurationResourceResolvingStrategy", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolving().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.contexthub.impl.ContextHubImpl", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeGraniteContexthubImplContextHubImpl().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.cors.impl.CORSPolicyImpl", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeGraniteCorsImplCORSPolicyImpl().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.csrf.impl.CSRFFilter", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeGraniteCsrfImplCSRFFilter().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.csrf.impl.CSRFServlet", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeGraniteCsrfImplCSRFServlet().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.distribution.core.impl.CryptoDistributionTransportSecretProvider", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeGraniteDistributionCoreImplCryptoDistributionTransportSe().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.distribution.core.impl.diff.DiffChangesObserver", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeGraniteDistributionCoreImplDiffDiffChangesObserver().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.distribution.core.impl.diff.DiffEventListener", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeGraniteDistributionCoreImplDiffDiffEventListener().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.distribution.core.impl.DistributionToReplicationEventTransformer", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeGraniteDistributionCoreImplDistributionToReplicationEven().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.distribution.core.impl.replication.adapters.ReplicationAgentProvider", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeGraniteDistributionCoreImplReplicationAdaptersReplicat().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.distribution.core.impl.replication.DistributionTransportHandler", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeGraniteDistributionCoreImplReplicationDistributionTrans().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.distribution.core.impl.transport.AccessTokenDistributionTransportSecretProvider", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeGraniteDistributionCoreImplTransportAccessTokenDistribu().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.frags.impl.CheckHttpHeaderFlag", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeGraniteFragsImplCheckHttpHeaderFlag().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.frags.impl.RandomFeature", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeGraniteFragsImplRandomFeature().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.httpcache.file.FileCacheStore", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeGraniteHttpcacheFileFileCacheStore().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.httpcache.impl.OuterCacheFilter", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeGraniteHttpcacheImplOuterCacheFilter().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.i18n.impl.bundle.PseudoTranslations", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeGraniteI18nImplBundlePseudoTranslations().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.i18n.impl.PreferencesLocaleResolverService", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeGraniteI18nImplPreferencesLocaleResolverService().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.infocollector.InfoCollector", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeGraniteInfocollectorInfoCollector().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.jetty.ssl.internal.GraniteSslConnectorFactory", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeGraniteJettySslInternalGraniteSslConnectorFactory().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.license.impl.LicenseCheckFilter", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeGraniteLicenseImplLicenseCheckFilter().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.logging.impl.LogAnalyserImpl", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeGraniteLoggingImplLogAnalyserImpl().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.logging.impl.LogErrorHealthCheck", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeGraniteLoggingImplLogErrorHealthCheck().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.maintenance.crx.impl.DataStoreGarbageCollectionTask", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTask().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.maintenance.crx.impl.LuceneBinariesCleanupTask", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTask().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.maintenance.crx.impl.RevisionCleanupTask", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeGraniteMaintenanceCrxImplRevisionCleanupTask().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.monitoring.impl.ScriptConfigImpl", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeGraniteMonitoringImplScriptConfigImpl().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.oauth.server.auth.impl.OAuth2ServerAuthenticationHandler", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHan().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.oauth.server.impl.AccessTokenCleanupTask", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeGraniteOauthServerImplAccessTokenCleanupTask().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.oauth.server.impl.OAuth2ClientRevocationServlet", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeGraniteOauthServerImplOAuth2ClientRevocationServlet().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.oauth.server.impl.OAuth2RevocationEndpointServlet", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeGraniteOauthServerImplOAuth2RevocationEndpointServlet().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.oauth.server.impl.OAuth2TokenEndpointServlet", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeGraniteOauthServerImplOAuth2TokenEndpointServlet().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.oauth.server.impl.OAuth2TokenRevocationServlet", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeGraniteOauthServerImplOAuth2TokenRevocationServlet().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.offloading.impl.OffloadingConfigurator", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeGraniteOffloadingImplOffloadingConfigurator().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.offloading.impl.OffloadingJobCloner", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeGraniteOffloadingImplOffloadingJobCloner().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.offloading.impl.OffloadingJobOffloader", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeGraniteOffloadingImplOffloadingJobOffloader().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.offloading.impl.transporter.OffloadingAgentManager", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeGraniteOffloadingImplTransporterOffloadingAgentManager().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.offloading.impl.transporter.OffloadingDefaultTransporter", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspo().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.omnisearch.impl.core.OmniSearchServiceImpl", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeGraniteOmnisearchImplCoreOmniSearchServiceImpl().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.optout.impl.OptOutServiceImpl", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeGraniteOptoutImplOptOutServiceImpl().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.queries.impl.hc.AsyncIndexHealthCheck", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeGraniteQueriesImplHcAsyncIndexHealthCheck().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.queries.impl.hc.LargeIndexHealthCheck", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeGraniteQueriesImplHcLargeIndexHealthCheck().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.queries.impl.hc.QueriesStatusHealthCheck", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeGraniteQueriesImplHcQueriesStatusHealthCheck().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.queries.impl.hc.QueryHealthCheckMetrics", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeGraniteQueriesImplHcQueryHealthCheckMetrics().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.queries.impl.hc.QueryLimitsHealthCheck", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeGraniteQueriesImplHcQueryLimitsHealthCheck().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.replication.hc.impl.ReplicationQueueHealthCheck", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeGraniteReplicationHcImplReplicationQueueHealthCheck().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.replication.hc.impl.ReplicationTransportUsersHealthCheck", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeGraniteReplicationHcImplReplicationTransportUsersHealthC().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.repository.hc.impl.AuthorizableNodeNameHealthCheck", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheck().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.repository.hc.impl.content.sling.SlingContentHealthCheck", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthC().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.repository.hc.impl.ContinuousRGCHealthCheck", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeGraniteRepositoryHcImplContinuousRGCHealthCheck().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.repository.hc.impl.DefaultAccessUserProfileHealthCheck", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthChe().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.repository.hc.impl.DefaultLoginsHealthCheck", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheck().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.repository.hc.impl.DiskSpaceHealthCheck", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeGraniteRepositoryHcImplDiskSpaceHealthCheck().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.repository.hc.impl.ObservationQueueLengthHealthCheck", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheck().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.repository.impl.CommitStatsConfig", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeGraniteRepositoryImplCommitStatsConfig().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.repository.ServiceUserConfiguration", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeGraniteRepositoryServiceUserConfiguration().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.requests.logging.impl.hc.RequestsStatusHealthCheckImpl", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckIm().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.resourcestatus.impl.CompositeStatusType", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeGraniteResourcestatusImplCompositeStatusType().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.resourcestatus.impl.StatusResourceProviderImpl", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeGraniteResourcestatusImplStatusResourceProviderImpl().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.rest.assets.impl.AssetContentDispositionFilter", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeGraniteRestAssetsImplAssetContentDispositionFilter().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.rest.impl.ApiEndpointResourceProviderFactoryImpl", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeGraniteRestImplApiEndpointResourceProviderFactoryImpl().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.rest.impl.servlet.DefaultGETServlet", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeGraniteRestImplServletDefaultGETServlet().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.security.user.ui.internal.servlets.SSLConfigurationServlet", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationS().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.security.user.UserPropertiesService", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeGraniteSecurityUserUserPropertiesService().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.socialgraph.impl.SocialGraphFactoryImpl", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeGraniteSocialgraphImplSocialGraphFactoryImpl().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.system.monitoring.impl.SystemStatsMBeanImpl", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeGraniteSystemMonitoringImplSystemStatsMBeanImpl().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.taskmanagement.impl.jcr.TaskAdapterFactory", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeGraniteTaskmanagementImplJcrTaskAdapterFactory().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.taskmanagement.impl.jcr.TaskArchiveService", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeGraniteTaskmanagementImplJcrTaskArchiveService().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.taskmanagement.impl.purge.TaskPurgeMaintenanceTask", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTask().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.taskmanagement.impl.service.TaskManagerAdapterFactory", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactor().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.threaddump.ThreadDumpCollector", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeGraniteThreaddumpThreadDumpCollector().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.translation.connector.msft.core.impl.MicrosoftTranslationServiceFactoryImpl", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTransl().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.translation.core.impl.TranslationManagerImpl", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeGraniteTranslationCoreImplTranslationManagerImpl().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.ui.clientlibs.impl.HtmlLibraryManagerImpl", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeGraniteUiClientlibsImplHtmlLibraryManagerImpl().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.workflow.console.frags.WorkflowWithdrawFeature", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeature().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.workflow.console.publish.WorkflowPublishEventService", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeGraniteWorkflowConsolePublishWorkflowPublishEventService().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.workflow.core.jcr.WorkflowBucketManager", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeGraniteWorkflowCoreJcrWorkflowBucketManager().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.workflow.core.job.ExternalProcessJobHandler", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeGraniteWorkflowCoreJobExternalProcessJobHandler().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.workflow.core.job.JobHandler", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeGraniteWorkflowCoreJobJobHandler().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.workflow.core.offloading.WorkflowOffloadingJobConsumer", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsum().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.workflow.core.PayloadMapCache", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeGraniteWorkflowCorePayloadMapCache().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.workflow.core.payloadmap.PayloadMoveListener", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeGraniteWorkflowCorePayloadmapPayloadMoveListener().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.workflow.core.WorkflowConfig", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeGraniteWorkflowCoreWorkflowConfig().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.workflow.core.WorkflowSessionFactory", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeGraniteWorkflowCoreWorkflowSessionFactory().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.workflow.purge.Scheduler", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeGraniteWorkflowPurgeScheduler().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.octopus.ncomm.bootstrap", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeOctopusNcommBootstrap().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.social.integrations.livefyre.user.pingforpull.impl.PingPullServlet", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullS().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.xmp.worker.files.ncomm.XMPFilesNComm", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comAdobeXmpWorkerFilesNcommXMPFilesNComm().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.commons.datasource.jdbcpool.JdbcPoolService", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCommonsDatasourceJdbcpoolJdbcPoolService().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.commons.httpclient", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCommonsHttpclient().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.analytics.impl.StorePropertiesChangeListener", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqAnalyticsImplStorePropertiesChangeListener().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.analytics.sitecatalyst.impl.exporter.ClassificationsExporter", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqAnalyticsSitecatalystImplExporterClassificationsExporte().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.analytics.sitecatalyst.impl.importer.ReportImporter", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqAnalyticsSitecatalystImplImporterReportImporter().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.analytics.sitecatalyst.impl.SitecatalystAdapterFactory", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactory().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.analytics.sitecatalyst.impl.SitecatalystHttpClientImpl", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImpl().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.analytics.testandtarget.impl.AccountOptionsUpdater", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqAnalyticsTestandtargetImplAccountOptionsUpdater().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.analytics.testandtarget.impl.DeleteAuthorActivityListener", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListener().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.analytics.testandtarget.impl.PushAuthorCampaignPageListener", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListener().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.analytics.testandtarget.impl.SegmentImporter", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqAnalyticsTestandtargetImplSegmentImporter().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.analytics.testandtarget.impl.service.WebServiceImpl", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqAnalyticsTestandtargetImplServiceWebServiceImpl().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.analytics.testandtarget.impl.servlets.AdminServerServlet", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqAnalyticsTestandtargetImplServletsAdminServerServlet().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.analytics.testandtarget.impl.TestandtargetHttpClientImpl", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImpl().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.auth.impl.cug.CugSupportImpl", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqAuthImplCugCugSupportImpl().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.auth.impl.LoginSelectorHandler", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqAuthImplLoginSelectorHandler().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.commons.impl.ExternalizerImpl", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqCommonsImplExternalizerImpl().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.commons.servlets.RootMappingServlet", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqCommonsServletsRootMappingServlet().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.compat.codeupgrade.impl.CodeUpgradeExecutionConditionChecker", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionChecke().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.compat.codeupgrade.impl.UpgradeTaskIgnoreList", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqCompatCodeupgradeImplUpgradeTaskIgnoreList().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.compat.codeupgrade.impl.VersionRangeTaskIgnorelist", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelist().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.contentsync.impl.ContentSyncManagerImpl", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqContentsyncImplContentSyncManagerImpl().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.dam.commons.handler.StandardImageHandler", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqDamCommonsHandlerStandardImageHandler().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.dam.commons.metadata.XmpFilterBlackWhite", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqDamCommonsMetadataXmpFilterBlackWhite().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.dam.commons.util.impl.AssetCacheImpl", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqDamCommonsUtilImplAssetCacheImpl().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.dam.core.impl.annotation.pdf.AnnotationPdfConfig", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqDamCoreImplAnnotationPdfAnnotationPdfConfig().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.dam.core.impl.AssetMoveListener", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqDamCoreImplAssetMoveListener().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.dam.core.impl.assethome.AssetHomePageConfiguration", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqDamCoreImplAssethomeAssetHomePageConfiguration().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.dam.core.impl.assetlinkshare.AdhocAssetShareProxyServlet", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServlet().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.dam.core.impl.cache.CQBufferedImageCache", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqDamCoreImplCacheCQBufferedImageCache().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.dam.core.impl.DamChangeEventListener", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqDamCoreImplDamChangeEventListener().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.dam.core.impl.DamEventPurgeService", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqDamCoreImplDamEventPurgeService().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.dam.core.impl.DamEventRecorderImpl", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqDamCoreImplDamEventRecorderImpl().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.dam.core.impl.event.DamEventAuditListener", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqDamCoreImplEventDamEventAuditListener().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.dam.core.impl.ExpiryNotificationJobImpl", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqDamCoreImplExpiryNotificationJobImpl().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.dam.core.impl.foldermetadataschema.FolderMetadataSchemaFeatureFlag", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeat().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.dam.core.impl.gfx.CommonsGfxRenderer", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqDamCoreImplGfxCommonsGfxRenderer().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.dam.core.impl.handler.EPSFormatHandler", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqDamCoreImplHandlerEPSFormatHandler().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.dam.core.impl.handler.IndesignFormatHandler", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqDamCoreImplHandlerIndesignFormatHandler().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.dam.core.impl.handler.JpegHandler", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqDamCoreImplHandlerJpegHandler().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.dam.core.impl.handler.xmp.NCommXMPHandler", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqDamCoreImplHandlerXmpNCommXMPHandler().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.dam.core.impl.jmx.AssetIndexUpdateMonitor", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqDamCoreImplJmxAssetIndexUpdateMonitor().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.dam.core.impl.jmx.AssetMigrationMBeanImpl", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqDamCoreImplJmxAssetMigrationMBeanImpl().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.dam.core.impl.jmx.AssetUpdateMonitorImpl", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqDamCoreImplJmxAssetUpdateMonitorImpl().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.dam.core.impl.jobs.metadataexport.AsyncMetadataExportConfigProviderService", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfig().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.dam.core.impl.jobs.metadataimport.AsyncMetadataImportConfigProviderService", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfig().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.dam.core.impl.lightbox.LightboxServlet", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqDamCoreImplLightboxLightboxServlet().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.dam.core.impl.metadata.editor.SelectComponentHandler", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqDamCoreImplMetadataEditorSelectComponentHandler().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.dam.core.impl.mimeType.AssetUploadRestrictionHelper", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelper().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.dam.core.impl.mimeType.DamMimeTypeServiceImpl", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqDamCoreImplMimeTypeDamMimeTypeServiceImpl().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.dam.core.impl.MissingMetadataNotificationJob", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqDamCoreImplMissingMetadataNotificationJob().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.dam.core.impl.process.SendTransientWorkflowCompletedEmailProcess", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPr().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.dam.core.impl.process.TextExtractionProcess", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqDamCoreImplProcessTextExtractionProcess().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.dam.core.impl.RenditionMakerImpl", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqDamCoreImplRenditionMakerImpl().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.dam.core.impl.reports.ReportExportService", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqDamCoreImplReportsReportExportService().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.dam.core.impl.reports.ReportPurgeService", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqDamCoreImplReportsReportPurgeService().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.dam.core.impl.servlet.AssetDownloadServlet", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqDamCoreImplServletAssetDownloadServlet().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.dam.core.impl.servlet.AssetStatusServlet", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqDamCoreImplServletAssetStatusServlet().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.dam.core.impl.servlet.AssetXMPSearchServlet", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqDamCoreImplServletAssetXMPSearchServlet().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.dam.core.impl.servlet.BatchMetadataServlet", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqDamCoreImplServletBatchMetadataServlet().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.dam.core.impl.servlet.BinaryProviderServlet", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqDamCoreImplServletBinaryProviderServlet().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.dam.core.impl.servlet.CollectionServlet", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqDamCoreImplServletCollectionServlet().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.dam.core.impl.servlet.CollectionsServlet", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqDamCoreImplServletCollectionsServlet().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.dam.core.impl.servlet.CompanionServlet", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqDamCoreImplServletCompanionServlet().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.dam.core.impl.servlet.CreateAssetServlet", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqDamCoreImplServletCreateAssetServlet().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.dam.core.impl.servlet.DamContentDispositionFilter", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqDamCoreImplServletDamContentDispositionFilter().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.dam.core.impl.servlet.GuidLookupFilter", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqDamCoreImplServletGuidLookupFilter().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.dam.core.impl.servlet.HealthCheckServlet", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqDamCoreImplServletHealthCheckServlet().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.dam.core.impl.servlet.MetadataGetServlet", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqDamCoreImplServletMetadataGetServlet().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.dam.core.impl.servlet.MultipleLicenseAcceptServlet", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqDamCoreImplServletMultipleLicenseAcceptServlet().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.dam.core.impl.servlet.ResourceCollectionServlet", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqDamCoreImplServletResourceCollectionServlet().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.dam.core.impl.ui.preview.FolderPreviewUpdaterImpl", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImpl().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.dam.core.impl.unzip.UnzipConfig", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqDamCoreImplUnzipUnzipConfig().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.dam.core.process.ExifToolExtractMetadataProcess", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqDamCoreProcessExifToolExtractMetadataProcess().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.dam.core.process.ExtractMetadataProcess", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqDamCoreProcessExtractMetadataProcess().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.dam.core.process.MetadataProcessorProcess", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqDamCoreProcessMetadataProcessorProcess().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.dam.handler.ffmpeg.LocatorImpl", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqDamHandlerFfmpegLocatorImpl().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.dam.handler.gibson.fontmanager.impl.FontManagerServiceImpl", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImpl().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.dam.handler.standard.pdf.PdfHandler", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqDamHandlerStandardPdfPdfHandler().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.dam.handler.standard.ps.PostScriptHandler", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqDamHandlerStandardPsPostScriptHandler().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.dam.handler.standard.psd.PsdHandler", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqDamHandlerStandardPsdPsdHandler().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.dam.ids.impl.IDSJobProcessor", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqDamIdsImplIDSJobProcessor().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.dam.ids.impl.IDSPoolManagerImpl", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqDamIdsImplIDSPoolManagerImpl().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.dam.indd.impl.handler.IndesignXMPHandler", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqDamInddImplHandlerIndesignXMPHandler().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.dam.indd.impl.servlet.SnippetCreationServlet", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqDamInddImplServletSnippetCreationServlet().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.dam.indd.process.INDDMediaExtractProcess", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqDamInddProcessINDDMediaExtractProcess().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.dam.performance.internal.AssetPerformanceDataHandlerImpl", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqDamPerformanceInternalAssetPerformanceDataHandlerImpl().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.dam.performance.internal.AssetPerformanceReportSyncJob", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqDamPerformanceInternalAssetPerformanceReportSyncJob().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.dam.pim.impl.sourcing.upload.process.ProductAssetsUploadProcess", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqDamPimImplSourcingUploadProcessProductAssetsUploadPro().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.dam.s7dam.common.analytics.impl.S7damDynamicMediaConfigEventListener", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEven().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.dam.s7dam.common.analytics.impl.SiteCatalystReportRunner", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunner().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.dam.s7dam.common.post.servlets.SetCreateHandler", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqDamS7damCommonPostServletsSetCreateHandler().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.dam.s7dam.common.post.servlets.SetModifyHandler", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqDamS7damCommonPostServletsSetModifyHandler().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.dam.s7dam.common.process.VideoThumbnailDownloadProcess", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqDamS7damCommonProcessVideoThumbnailDownloadProcess().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.dam.s7dam.common.S7damDamChangeEventListener", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqDamS7damCommonS7damDamChangeEventListener().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.dam.s7dam.common.servlets.S7damProductInfoServlet", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqDamS7damCommonServletsS7damProductInfoServlet().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.dam.s7dam.common.video.impl.VideoProxyClientServiceImpl", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqDamS7damCommonVideoImplVideoProxyClientServiceImpl().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.dam.scene7.impl.Scene7APIClientImpl", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqDamScene7ImplScene7APIClientImpl().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.dam.scene7.impl.Scene7AssetMimeTypeServiceImpl", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqDamScene7ImplScene7AssetMimeTypeServiceImpl().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.dam.scene7.impl.Scene7ConfigurationEventListener", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqDamScene7ImplScene7ConfigurationEventListener().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.dam.scene7.impl.Scene7DamChangeEventListener", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqDamScene7ImplScene7DamChangeEventListener().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.dam.scene7.impl.Scene7FlashTemplatesServiceImpl", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqDamScene7ImplScene7FlashTemplatesServiceImpl().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.dam.scene7.impl.Scene7UploadServiceImpl", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqDamScene7ImplScene7UploadServiceImpl().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.dam.stock.integration.impl.cache.StockCacheConfigurationServiceImpl", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqDamStockIntegrationImplCacheStockCacheConfigurationSer().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.dam.stock.integration.impl.configuration.StockConfigurationImpl", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqDamStockIntegrationImplConfigurationStockConfiguration().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.dam.video.impl.servlet.VideoTestServlet", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqDamVideoImplServletVideoTestServlet().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.extwidget.servlets.ImageSpriteServlet", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqExtwidgetServletsImageSpriteServlet().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.image.internal.font.FontHelper", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqImageInternalFontFontHelper().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.jcrclustersupport.ClusterStartLevelController", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqJcrclustersupportClusterStartLevelController().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.mailer.DefaultMailService", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqMailerDefaultMailService().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.mailer.impl.CqMailingService", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqMailerImplCqMailingService().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.mailer.impl.email.CqEmailTemplateFactory", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqMailerImplEmailCqEmailTemplateFactory().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.mailer.impl.email.CqRetrieverTemplateFactory", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqMailerImplEmailCqRetrieverTemplateFactory().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.mcm.campaign.impl.IntegrationConfigImpl", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqMcmCampaignImplIntegrationConfigImpl().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.mcm.campaign.importer.PersonalizedTextHandlerFactory", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqMcmCampaignImporterPersonalizedTextHandlerFactory().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.mcm.core.newsletter.NewsletterEmailServiceImpl", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqMcmCoreNewsletterNewsletterEmailServiceImpl().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.mcm.impl.MCMConfiguration", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqMcmImplMCMConfiguration().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.mcm.landingpage.parser.taghandlers.cta.ClickThroughComponentTagHandlerFactory", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponen().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.mcm.landingpage.parser.taghandlers.cta.GraphicalClickThroughComponentTagHandlerFactory", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThroug().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.mcm.landingpage.parser.taghandlers.cta.LeadFormCTAComponentTagHandlerFactory", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponent().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.mcm.landingpage.parser.taghandlers.mbox.MBoxExperienceTagHandlerFactory", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHa().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.mcm.landingpage.parser.taghandlers.mbox.TargetComponentTagHandlerFactory", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagH().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.notification.impl.NotificationServiceImpl", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqNotificationImplNotificationServiceImpl().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.personalization.impl.servlets.TargetingConfigurationServlet", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqPersonalizationImplServletsTargetingConfigurationServlet().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.polling.importer.impl.ManagedPollConfigImpl", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqPollingImporterImplManagedPollConfigImpl().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.polling.importer.impl.ManagedPollingImporterImpl", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqPollingImporterImplManagedPollingImporterImpl().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.polling.importer.impl.PollingImporterImpl", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqPollingImporterImplPollingImporterImpl().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.replication.audit.ReplicationEventListener", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqReplicationAuditReplicationEventListener().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.replication.content.StaticContentBuilder", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqReplicationContentStaticContentBuilder().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.replication.impl.AgentManagerImpl", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqReplicationImplAgentManagerImpl().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.replication.impl.content.durbo.BinaryLessContentBuilder", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqReplicationImplContentDurboBinaryLessContentBuilder().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.replication.impl.content.durbo.DurboImportConfigurationProviderService", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqReplicationImplContentDurboDurboImportConfigurationProv().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.replication.impl.ReplicationContentFactoryProviderImpl", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqReplicationImplReplicationContentFactoryProviderImpl().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.replication.impl.ReplicationReceiverImpl", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqReplicationImplReplicationReceiverImpl().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.replication.impl.ReplicatorImpl", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqReplicationImplReplicatorImpl().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.replication.impl.ReverseReplicator", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqReplicationImplReverseReplicator().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.replication.impl.transport.BinaryLessTransportHandler", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqReplicationImplTransportBinaryLessTransportHandler().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.replication.impl.transport.Http", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqReplicationImplTransportHttp().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.reporting.impl.cache.CacheImpl", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqReportingImplCacheCacheImpl().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.reporting.impl.ConfigServiceImpl", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqReportingImplConfigServiceImpl().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.reporting.impl.RLogAnalyzer", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqReportingImplRLogAnalyzer().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.rewriter.linkchecker.impl.LinkCheckerImpl", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqRewriterLinkcheckerImplLinkCheckerImpl().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.rewriter.linkchecker.impl.LinkCheckerTask", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqRewriterLinkcheckerImplLinkCheckerTask().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.rewriter.linkchecker.impl.LinkCheckerTransformerFactory", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactory().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.rewriter.linkchecker.impl.LinkInfoStorageImpl", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqRewriterLinkcheckerImplLinkInfoStorageImpl().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.rewriter.processor.impl.HtmlParserFactory", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqRewriterProcessorImplHtmlParserFactory().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.search.impl.builder.QueryBuilderImpl", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqSearchImplBuilderQueryBuilderImpl().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.search.suggest.impl.SuggestionIndexManagerImpl", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqSearchSuggestImplSuggestionIndexManagerImpl().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.searchpromote.impl.PublishSearchPromoteConfigHandler", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqSearchpromoteImplPublishSearchPromoteConfigHandler().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.searchpromote.impl.SearchPromoteServiceImpl", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqSearchpromoteImplSearchPromoteServiceImpl().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.security.ACLSetup", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqSecurityACLSetup().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.statistics.impl.StatisticsServiceImpl", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqStatisticsImplStatisticsServiceImpl().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.tagging.impl.JcrTagManagerFactoryImpl", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqTaggingImplJcrTagManagerFactoryImpl().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.tagging.impl.search.TagPredicateEvaluator", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqTaggingImplSearchTagPredicateEvaluator().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.tagging.impl.TagGarbageCollector", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqTaggingImplTagGarbageCollector().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.wcm.contentsync.impl.handler.PagesUpdateHandler", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqWcmContentsyncImplHandlerPagesUpdateHandler().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.wcm.contentsync.impl.rewriter.PathRewriterTransformerFactory", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactor().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.wcm.core.impl.AuthoringUIModeServiceImpl", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqWcmCoreImplAuthoringUIModeServiceImpl().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.wcm.core.impl.commands.WCMCommandServlet", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqWcmCoreImplCommandsWCMCommandServlet().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.wcm.core.impl.devicedetection.DeviceIdentificationModeImpl", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImpl().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.wcm.core.impl.event.PageEventAuditListener", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqWcmCoreImplEventPageEventAuditListener().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.wcm.core.impl.event.PagePostProcessor", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqWcmCoreImplEventPagePostProcessor().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.wcm.core.impl.event.RepositoryChangeEventListener", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqWcmCoreImplEventRepositoryChangeEventListener().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.wcm.core.impl.event.TemplatePostProcessor", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqWcmCoreImplEventTemplatePostProcessor().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.wcm.core.impl.LanguageManagerImpl", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqWcmCoreImplLanguageManagerImpl().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.wcm.core.impl.LinkCheckerConfigurationFactoryImpl", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqWcmCoreImplLinkCheckerConfigurationFactoryImpl().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.wcm.core.impl.page.PageInfoAggregatorImpl", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqWcmCoreImplPagePageInfoAggregatorImpl().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.wcm.core.impl.page.PageManagerFactoryImpl", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqWcmCoreImplPagePageManagerFactoryImpl().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.wcm.core.impl.references.content.ContentReferenceConfig", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqWcmCoreImplReferencesContentContentReferenceConfig().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.wcm.core.impl.servlets.contentfinder.AssetViewHandler", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqWcmCoreImplServletsContentfinderAssetViewHandler().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.wcm.core.impl.servlets.contentfinder.connector.ConnectorViewHandler", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqWcmCoreImplServletsContentfinderConnectorConnectorVie().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.wcm.core.impl.servlets.contentfinder.PageViewHandler", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqWcmCoreImplServletsContentfinderPageViewHandler().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.wcm.core.impl.servlets.FindReplaceServlet", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqWcmCoreImplServletsFindReplaceServlet().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.wcm.core.impl.servlets.ReferenceSearchServlet", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqWcmCoreImplServletsReferenceSearchServlet().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.wcm.core.impl.servlets.ThumbnailServlet", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqWcmCoreImplServletsThumbnailServlet().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.wcm.core.impl.utils.DefaultPageNameValidator", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqWcmCoreImplUtilsDefaultPageNameValidator().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.wcm.core.impl.variants.PageVariantsProviderImpl", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqWcmCoreImplVariantsPageVariantsProviderImpl().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.wcm.core.impl.VersionManagerImpl", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqWcmCoreImplVersionManagerImpl().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.wcm.core.impl.VersionPurgeTask", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqWcmCoreImplVersionPurgeTask().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.wcm.core.impl.WCMDebugFilter", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqWcmCoreImplWCMDebugFilter().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.wcm.core.impl.WCMDeveloperModeFilter", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqWcmCoreImplWCMDeveloperModeFilter().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.wcm.core.impl.warp.TimeWarpFilter", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqWcmCoreImplWarpTimeWarpFilter().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.wcm.core.mvt.MVTStatisticsImpl", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqWcmCoreMvtMVTStatisticsImpl().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.wcm.core.stats.PageViewStatisticsImpl", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqWcmCoreStatsPageViewStatisticsImpl().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.wcm.core.WCMRequestFilter", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqWcmCoreWCMRequestFilter().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.wcm.designimporter.DesignPackageImporter", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqWcmDesignimporterDesignPackageImporter().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.wcm.designimporter.impl.CanvasBuilderImpl", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqWcmDesignimporterImplCanvasBuilderImpl().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.wcm.designimporter.impl.CanvasPageDeleteHandler", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqWcmDesignimporterImplCanvasPageDeleteHandler().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.wcm.designimporter.impl.EntryPreprocessorImpl", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqWcmDesignimporterImplEntryPreprocessorImpl().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.wcm.designimporter.impl.MobileCanvasBuilderImpl", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqWcmDesignimporterImplMobileCanvasBuilderImpl().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.CanvasComponentTagHandlerFactory", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqWcmDesignimporterParserTaghandlersFactoryCanvasCompone().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.DefaultComponentTagHandlerFactory", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqWcmDesignimporterParserTaghandlersFactoryDefaultCompon().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.DefaultTagHandlerFactory", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqWcmDesignimporterParserTaghandlersFactoryDefaultTagHan().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.HeadTagHandlerFactory", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqWcmDesignimporterParserTaghandlersFactoryHeadTagHandle().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.IFrameTagHandlerFactory", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqWcmDesignimporterParserTaghandlersFactoryIFrameTagHand().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.ImageComponentTagHandlerFactory", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqWcmDesignimporterParserTaghandlersFactoryImageComponen().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.ImgTagHandlerFactory", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandler().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.InlineScriptTagHandlerFactory", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqWcmDesignimporterParserTaghandlersFactoryInlineScriptT().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.LinkTagHandlerFactory", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqWcmDesignimporterParserTaghandlersFactoryLinkTagHandle().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.MetaTagHandlerFactory", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqWcmDesignimporterParserTaghandlersFactoryMetaTagHandle().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.NonScriptTagHandlerFactory", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqWcmDesignimporterParserTaghandlersFactoryNonScriptTagH().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.ParsysComponentTagHandlerFactory", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqWcmDesignimporterParserTaghandlersFactoryParsysCompone().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.ScriptTagHandlerFactory", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqWcmDesignimporterParserTaghandlersFactoryScriptTagHand().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.StyleTagHandlerFactory", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqWcmDesignimporterParserTaghandlersFactoryStyleTagHandl().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.TextComponentTagHandlerFactory", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqWcmDesignimporterParserTaghandlersFactoryTextComponent().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.TitleComponentTagHandlerFactory", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqWcmDesignimporterParserTaghandlersFactoryTitleComponen().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.TitleTagHandlerFactory", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqWcmDesignimporterParserTaghandlersFactoryTitleTagHandl().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.wcm.foundation.forms.impl.FormChooserServlet", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqWcmFoundationFormsImplFormChooserServlet().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.wcm.foundation.forms.impl.FormParagraphPostProcessor", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqWcmFoundationFormsImplFormParagraphPostProcessor().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.wcm.foundation.forms.impl.FormsHandlingServlet", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqWcmFoundationFormsImplFormsHandlingServlet().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.wcm.foundation.forms.impl.MailServlet", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqWcmFoundationFormsImplMailServlet().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.wcm.foundation.impl.AdaptiveImageComponentServlet", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqWcmFoundationImplAdaptiveImageComponentServlet().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.wcm.foundation.impl.HTTPAuthHandler", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqWcmFoundationImplHTTPAuthHandler().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.wcm.foundation.impl.PageImpressionsTracker", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqWcmFoundationImplPageImpressionsTracker().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.wcm.foundation.impl.PageRedirectServlet", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqWcmFoundationImplPageRedirectServlet().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.wcm.foundation.security.impl.DefaultAttachmentTypeBlacklistService", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklist().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.wcm.foundation.security.impl.SaferSlingPostValidatorImpl", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImpl().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.wcm.mobile.core.impl.device.DeviceInfoTransformerFactory", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactory().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.wcm.mobile.core.impl.redirect.RedirectFilter", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqWcmMobileCoreImplRedirectRedirectFilter().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.wcm.msm.impl.actions.ContentCopyActionFactory", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqWcmMsmImplActionsContentCopyActionFactory().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.wcm.msm.impl.actions.ContentDeleteActionFactory", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqWcmMsmImplActionsContentDeleteActionFactory().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.wcm.msm.impl.actions.ContentUpdateActionFactory", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqWcmMsmImplActionsContentUpdateActionFactory().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.wcm.msm.impl.actions.OrderChildrenActionFactory", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqWcmMsmImplActionsOrderChildrenActionFactory().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.wcm.msm.impl.actions.PageMoveActionFactory", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqWcmMsmImplActionsPageMoveActionFactory().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.wcm.msm.impl.actions.ReferencesUpdateActionFactory", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqWcmMsmImplActionsReferencesUpdateActionFactory().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.wcm.msm.impl.actions.VersionCopyActionFactory", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqWcmMsmImplActionsVersionCopyActionFactory().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.wcm.msm.impl.LiveRelationshipManagerImpl", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqWcmMsmImplLiveRelationshipManagerImpl().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.wcm.msm.impl.RolloutManagerImpl", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqWcmMsmImplRolloutManagerImpl().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.wcm.msm.impl.servlets.AuditLogServlet", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqWcmMsmImplServletsAuditLogServlet().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.wcm.notification.email.impl.EmailChannel", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqWcmNotificationEmailImplEmailChannel().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.wcm.notification.impl.NotificationManagerImpl", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqWcmNotificationImplNotificationManagerImpl().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.wcm.scripting.impl.BVPManager", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqWcmScriptingImplBVPManager().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.wcm.undo.UndoConfig", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqWcmUndoUndoConfig().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.wcm.webservicesupport.impl.ReplicationEventListener", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqWcmWebservicesupportImplReplicationEventListener().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.wcm.workflow.impl.WcmWorkflowServiceImpl", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqWcmWorkflowImplWcmWorkflowServiceImpl().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.wcm.workflow.impl.WorkflowPackageInfoProvider", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqWcmWorkflowImplWorkflowPackageInfoProvider().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.widget.impl.HtmlLibraryManagerImpl", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqWidgetImplHtmlLibraryManagerImpl().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.widget.impl.WidgetExtensionProviderImpl", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqWidgetImplWidgetExtensionProviderImpl().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.workflow.impl.email.EMailNotificationService", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqWorkflowImplEmailEMailNotificationService().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.workflow.impl.email.TaskEMailNotificationService", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCqWorkflowImplEmailTaskEMailNotificationService().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.crx.security.token.impl.impl.TokenAuthenticationHandler", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCrxSecurityTokenImplImplTokenAuthenticationHandler().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.crx.security.token.impl.TokenCleanupTask", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    comDayCrxSecurityTokenImplTokenCleanupTask().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/Guide Localization Service", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    guideLocalizationService().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/MessagingUserComponentFactory", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    messagingUserComponentFactory().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.aries.jmx.framework.StateConfig", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    orgApacheAriesJmxFrameworkStateConfig().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.felix.eventadmin.impl.EventAdmin", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    orgApacheFelixEventadminImplEventAdmin().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.felix.http", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    orgApacheFelixHttp().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.felix.http.sslfilter.SslFilter", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    orgApacheFelixHttpSslfilterSslFilter().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.felix.jaas.Configuration.factory", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    orgApacheFelixJaasConfigurationFactory().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.felix.jaas.ConfigurationSpi", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    orgApacheFelixJaasConfigurationSpi().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.felix.scr.ScrService", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    orgApacheFelixScrScrService().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.felix.systemready.impl.ComponentsCheck", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    orgApacheFelixSystemreadyImplComponentsCheck().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.felix.systemready.impl.FrameworkStartCheck", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    orgApacheFelixSystemreadyImplFrameworkStartCheck().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.felix.systemready.impl.ServicesCheck", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    orgApacheFelixSystemreadyImplServicesCheck().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.felix.systemready.impl.servlet.SystemAliveServlet", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    orgApacheFelixSystemreadyImplServletSystemAliveServlet().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.felix.systemready.impl.servlet.SystemReadyServlet", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    orgApacheFelixSystemreadyImplServletSystemReadyServlet().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.felix.systemready.SystemReadyMonitor", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    orgApacheFelixSystemreadySystemReadyMonitor().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.felix.webconsole.internal.servlet.OsgiManager", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    orgApacheFelixWebconsoleInternalServletOsgiManager().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.felix.webconsole.plugins.event.internal.PluginServlet", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    orgApacheFelixWebconsolePluginsEventInternalPluginServlet().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.felix.webconsole.plugins.memoryusage.internal.MemoryUsageConfigurator", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    orgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCo().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.http.proxyconfigurator", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    orgApacheHttpProxyconfigurator().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreTextProviderService", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    orgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProvider().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.jackrabbit.oak.plugins.blob.datastore.FileDataStore", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    orgApacheJackrabbitOakPluginsBlobDatastoreFileDataStore().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.jackrabbit.oak.plugins.document.DocumentNodeStoreService", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    orgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreService().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.jackrabbit.oak.plugins.document.DocumentNodeStoreServicePreset", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    orgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePre().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.jackrabbit.oak.plugins.document.secondary.SecondaryStoreCacheService", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    orgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCac().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.jackrabbit.oak.plugins.index.AsyncIndexerService", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    orgApacheJackrabbitOakPluginsIndexAsyncIndexerService().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.jackrabbit.oak.plugins.index.lucene.LuceneIndexProviderService", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    orgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServ().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.jackrabbit.oak.plugins.index.solr.osgi.EmbeddedSolrServerConfigurationProvider", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    orgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCo().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.jackrabbit.oak.plugins.index.solr.osgi.NodeStateSolrServersObserverService", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    orgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServers().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.jackrabbit.oak.plugins.index.solr.osgi.OakSolrConfigurationProviderService", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    orgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfiguration().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.jackrabbit.oak.plugins.index.solr.osgi.RemoteSolrServerConfigurationProvider", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    orgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConf().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.jackrabbit.oak.plugins.index.solr.osgi.SolrQueryIndexProviderService", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    orgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvid().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.jackrabbit.oak.plugins.index.solr.osgi.SolrServerProviderService", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    orgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSe().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.jackrabbit.oak.plugins.metric.StatisticsProviderFactory", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    orgApacheJackrabbitOakPluginsMetricStatisticsProviderFactory().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.jackrabbit.oak.plugins.observation.ChangeCollectorProvider", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    orgApacheJackrabbitOakPluginsObservationChangeCollectorProvider().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.jackrabbit.oak.query.QueryEngineSettingsService", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    orgApacheJackrabbitOakQueryQueryEngineSettingsService().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.jackrabbit.oak.security.authentication.AuthenticationConfigurationImpl", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    orgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfig().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.jackrabbit.oak.security.authentication.ldap.impl.LdapIdentityProvider", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdenti().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.jackrabbit.oak.security.authentication.token.TokenConfigurationImpl", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    orgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfigura().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.jackrabbit.oak.security.authorization.AuthorizationConfigurationImpl", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    orgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigur().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.jackrabbit.oak.security.internal.SecurityProviderRegistration", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    orgApacheJackrabbitOakSecurityInternalSecurityProviderRegistrati().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.jackrabbit.oak.security.user.RandomAuthorizableNodeName", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    orgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeName().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.jackrabbit.oak.security.user.UserConfigurationImpl", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    orgApacheJackrabbitOakSecurityUserUserConfigurationImpl().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.jackrabbit.oak.segment.azure.AzureSegmentStoreService", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    orgApacheJackrabbitOakSegmentAzureAzureSegmentStoreService().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.jackrabbit.oak.segment.SegmentNodeStoreFactory", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    orgApacheJackrabbitOakSegmentSegmentNodeStoreFactory().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.jackrabbit.oak.segment.SegmentNodeStoreMonitorService", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    orgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorService().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.jackrabbit.oak.segment.SegmentNodeStoreService", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    orgApacheJackrabbitOakSegmentSegmentNodeStoreService().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.jackrabbit.oak.segment.standby.store.StandbyStoreService", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    orgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreService().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.jackrabbit.oak.spi.security.authentication.external.impl.DefaultSyncHandler", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDe().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.jackrabbit.oak.spi.security.authentication.external.impl.ExternalLoginModuleFactory", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplEx().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.jackrabbit.oak.spi.security.authentication.external.impl.principal.ExternalPrincipalConfiguration", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPr().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.jackrabbit.oak.spi.security.authorization.cug.impl.CugConfiguration", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    orgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfi().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.jackrabbit.oak.spi.security.authorization.cug.impl.CugExcludeImpl", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    orgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExclu().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.jackrabbit.oak.spi.security.user.action.DefaultAuthorizableActionProvider", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    orgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizable().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.jackrabbit.vault.packaging.impl.PackagingImpl", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    orgApacheJackrabbitVaultPackagingImplPackagingImpl().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.jackrabbit.vault.packaging.registry.impl.FSPackageRegistry", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    orgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistry().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.auth.core.impl.LogoutServlet", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    orgApacheSlingAuthCoreImplLogoutServlet().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.caconfig.impl.ConfigurationBindingsValueProvider", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    orgApacheSlingCaconfigImplConfigurationBindingsValueProvider().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.caconfig.impl.ConfigurationResolverImpl", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    orgApacheSlingCaconfigImplConfigurationResolverImpl().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.caconfig.impl.def.DefaultConfigurationInheritanceStrategy", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    orgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStra().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.caconfig.impl.def.DefaultConfigurationPersistenceStrategy", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    orgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStra().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.caconfig.impl.override.OsgiConfigurationOverrideProvider", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    orgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProvi().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.caconfig.impl.override.SystemPropertyConfigurationOverrideProvider", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    orgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOve().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.caconfig.management.impl.ConfigurationManagementSettingsImpl", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    orgApacheSlingCaconfigManagementImplConfigurationManagementSetti().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.caconfig.resource.impl.def.DefaultConfigurationResourceResolvingStrategy", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    orgApacheSlingCaconfigResourceImplDefDefaultConfigurationResour().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.caconfig.resource.impl.def.DefaultContextPathStrategy", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    orgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategy().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.commons.html.internal.TagsoupHtmlParser", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    orgApacheSlingCommonsHtmlInternalTagsoupHtmlParser().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.commons.log.LogManager", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    orgApacheSlingCommonsLogLogManager().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.commons.log.LogManager.factory.config", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    orgApacheSlingCommonsLogLogManagerFactoryConfig().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.commons.log.LogManager.factory.writer", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    orgApacheSlingCommonsLogLogManagerFactoryWriter().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.commons.metrics.internal.LogReporter", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    orgApacheSlingCommonsMetricsInternalLogReporter().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.commons.metrics.rrd4j.impl.CodahaleMetricsReporter", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    orgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporter().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.commons.mime.internal.MimeTypeServiceImpl", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    orgApacheSlingCommonsMimeInternalMimeTypeServiceImpl().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.commons.scheduler.impl.QuartzScheduler", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    orgApacheSlingCommonsSchedulerImplQuartzScheduler().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.commons.scheduler.impl.SchedulerHealthCheck", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    orgApacheSlingCommonsSchedulerImplSchedulerHealthCheck().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.commons.threads.impl.DefaultThreadPool.factory", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    orgApacheSlingCommonsThreadsImplDefaultThreadPoolFactory().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.datasource.DataSourceFactory", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    orgApacheSlingDatasourceDataSourceFactory().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.datasource.JNDIDataSourceFactory", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    orgApacheSlingDatasourceJNDIDataSourceFactory().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.discovery.oak.Config", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    orgApacheSlingDiscoveryOakConfig().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.discovery.oak.SynchronizedClocksHealthCheck", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    orgApacheSlingDiscoveryOakSynchronizedClocksHealthCheck().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.distribution.agent.impl.ForwardDistributionAgentFactory", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    orgApacheSlingDistributionAgentImplForwardDistributionAgentFacto().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.distribution.agent.impl.PrivilegeDistributionRequestAuthorizationStrategyFactory", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    orgApacheSlingDistributionAgentImplPrivilegeDistributionRequestA().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.distribution.agent.impl.QueueDistributionAgentFactory", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    orgApacheSlingDistributionAgentImplQueueDistributionAgentFactory().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.distribution.agent.impl.ReverseDistributionAgentFactory", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    orgApacheSlingDistributionAgentImplReverseDistributionAgentFacto().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.distribution.agent.impl.SimpleDistributionAgentFactory", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    orgApacheSlingDistributionAgentImplSimpleDistributionAgentFactor().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.distribution.agent.impl.SyncDistributionAgentFactory", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    orgApacheSlingDistributionAgentImplSyncDistributionAgentFactory().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.distribution.monitor.DistributionQueueHealthCheck", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    orgApacheSlingDistributionMonitorDistributionQueueHealthCheck().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.distribution.packaging.impl.exporter.AgentDistributionPackageExporterFactory", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    orgApacheSlingDistributionPackagingImplExporterAgentDistributio().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.distribution.packaging.impl.exporter.LocalDistributionPackageExporterFactory", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    orgApacheSlingDistributionPackagingImplExporterLocalDistributio().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.distribution.packaging.impl.exporter.RemoteDistributionPackageExporterFactory", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    orgApacheSlingDistributionPackagingImplExporterRemoteDistributi().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.distribution.packaging.impl.importer.LocalDistributionPackageImporterFactory", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    orgApacheSlingDistributionPackagingImplImporterLocalDistributio().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.distribution.packaging.impl.importer.RemoteDistributionPackageImporterFactory", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    orgApacheSlingDistributionPackagingImplImporterRemoteDistributi().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.distribution.packaging.impl.importer.RepositoryDistributionPackageImporterFactory", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    orgApacheSlingDistributionPackagingImplImporterRepositoryDistri().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.distribution.resources.impl.DistributionConfigurationResourceProviderFactory", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    orgApacheSlingDistributionResourcesImplDistributionConfiguration().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.distribution.resources.impl.DistributionServiceResourceProviderFactory", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    orgApacheSlingDistributionResourcesImplDistributionServiceResour().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.distribution.serialization.impl.DistributionPackageBuilderFactory", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    orgApacheSlingDistributionSerializationImplDistributionPackageBu().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.distribution.serialization.impl.vlt.VaultDistributionPackageBuilderFactory", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    orgApacheSlingDistributionSerializationImplVltVaultDistribution().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.distribution.transport.impl.UserCredentialsDistributionTransportSecretProvider", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    orgApacheSlingDistributionTransportImplUserCredentialsDistributi().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.distribution.trigger.impl.DistributionEventDistributeDistributionTriggerFactory", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    orgApacheSlingDistributionTriggerImplDistributionEventDistribute().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.distribution.trigger.impl.JcrEventDistributionTriggerFactory", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    orgApacheSlingDistributionTriggerImplJcrEventDistributionTrigger().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.distribution.trigger.impl.PersistedJcrEventDistributionTriggerFactory", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    orgApacheSlingDistributionTriggerImplPersistedJcrEventDistributi().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.distribution.trigger.impl.RemoteEventDistributionTriggerFactory", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    orgApacheSlingDistributionTriggerImplRemoteEventDistributionTrig().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.distribution.trigger.impl.ResourceEventDistributionTriggerFactory", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    orgApacheSlingDistributionTriggerImplResourceEventDistributionTr().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.distribution.trigger.impl.ScheduledDistributionTriggerFactory", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    orgApacheSlingDistributionTriggerImplScheduledDistributionTrigge().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.engine.impl.auth.SlingAuthenticator", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    orgApacheSlingEngineImplAuthSlingAuthenticator().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.engine.impl.debug.RequestProgressTrackerLogFilter", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    orgApacheSlingEngineImplDebugRequestProgressTrackerLogFilter().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.engine.impl.log.RequestLogger", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    orgApacheSlingEngineImplLogRequestLogger().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.engine.impl.log.RequestLoggerService", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    orgApacheSlingEngineImplLogRequestLoggerService().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.engine.impl.SlingMainServlet", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    orgApacheSlingEngineImplSlingMainServlet().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.engine.parameters", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    orgApacheSlingEngineParameters().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.event.impl.EventingThreadPool", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    orgApacheSlingEventImplEventingThreadPool().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.event.impl.jobs.DefaultJobManager", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    orgApacheSlingEventImplJobsDefaultJobManager().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.event.impl.jobs.jcr.PersistenceHandler", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    orgApacheSlingEventImplJobsJcrPersistenceHandler().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.event.impl.jobs.JobConsumerManager", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    orgApacheSlingEventImplJobsJobConsumerManager().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.event.jobs.QueueConfiguration", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    orgApacheSlingEventJobsQueueConfiguration().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.extensions.webconsolesecurityprovider.internal.SlingWebConsoleSecurityProvider", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    orgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingW().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.featureflags.Feature", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    orgApacheSlingFeatureflagsFeature().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.featureflags.impl.ConfiguredFeature", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    orgApacheSlingFeatureflagsImplConfiguredFeature().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.hapi.impl.HApiUtilImpl", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    orgApacheSlingHapiImplHApiUtilImpl().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.hc.core.impl.CompositeHealthCheck", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    orgApacheSlingHcCoreImplCompositeHealthCheck().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.hc.core.impl.executor.HealthCheckExecutorImpl", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    orgApacheSlingHcCoreImplExecutorHealthCheckExecutorImpl().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.hc.core.impl.JmxAttributeHealthCheck", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    orgApacheSlingHcCoreImplJmxAttributeHealthCheck().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.hc.core.impl.ScriptableHealthCheck", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    orgApacheSlingHcCoreImplScriptableHealthCheck().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.hc.core.impl.servlet.HealthCheckExecutorServlet", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    orgApacheSlingHcCoreImplServletHealthCheckExecutorServlet().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.hc.core.impl.servlet.ResultTxtVerboseSerializer", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    orgApacheSlingHcCoreImplServletResultTxtVerboseSerializer().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.i18n.impl.I18NFilter", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    orgApacheSlingI18nImplI18NFilter().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.i18n.impl.JcrResourceBundleProvider", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    orgApacheSlingI18nImplJcrResourceBundleProvider().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.installer.provider.jcr.impl.JcrInstaller", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    orgApacheSlingInstallerProviderJcrImplJcrInstaller().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.jcr.base.internal.LoginAdminWhitelist", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    orgApacheSlingJcrBaseInternalLoginAdminWhitelist().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.jcr.base.internal.LoginAdminWhitelist.fragment", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    orgApacheSlingJcrBaseInternalLoginAdminWhitelistFragment().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.jcr.davex.impl.servlets.SlingDavExServlet", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    orgApacheSlingJcrDavexImplServletsSlingDavExServlet().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.jcr.jackrabbit.server.JndiRegistrationSupport", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    orgApacheSlingJcrJackrabbitServerJndiRegistrationSupport().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.jcr.jackrabbit.server.RmiRegistrationSupport", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    orgApacheSlingJcrJackrabbitServerRmiRegistrationSupport().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.jcr.repoinit.impl.RepositoryInitializer", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    orgApacheSlingJcrRepoinitImplRepositoryInitializer().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.jcr.repoinit.RepositoryInitializer", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    orgApacheSlingJcrRepoinitRepositoryInitializer().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.jcr.resource.internal.JcrResourceResolverFactoryImpl", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    orgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImpl().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.jcr.resource.internal.JcrSystemUserValidator", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    orgApacheSlingJcrResourceInternalJcrSystemUserValidator().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.jcr.resourcesecurity.impl.ResourceAccessGateFactory", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    orgApacheSlingJcrResourcesecurityImplResourceAccessGateFactory().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.jcr.webdav.impl.handler.DefaultHandlerService", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    orgApacheSlingJcrWebdavImplHandlerDefaultHandlerService().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.jcr.webdav.impl.handler.DirListingExportHandlerService", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    orgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServic().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.jcr.webdav.impl.servlets.SimpleWebDavServlet", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    orgApacheSlingJcrWebdavImplServletsSimpleWebDavServlet().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.jmx.provider.impl.JMXResourceProvider", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    orgApacheSlingJmxProviderImplJMXResourceProvider().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.models.impl.ModelAdapterFactory", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    orgApacheSlingModelsImplModelAdapterFactory().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.models.jacksonexporter.impl.ResourceModuleProvider", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    orgApacheSlingModelsJacksonexporterImplResourceModuleProvider().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.resource.inventory.impl.ResourceInventoryPrinterFactory", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    orgApacheSlingResourceInventoryImplResourceInventoryPrinterFacto().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.resourcemerger.impl.MergedResourceProviderFactory", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    orgApacheSlingResourcemergerImplMergedResourceProviderFactory().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.resourcemerger.picker.overriding", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    orgApacheSlingResourcemergerPickerOverriding().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.scripting.core.impl.ScriptCacheImpl", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    orgApacheSlingScriptingCoreImplScriptCacheImpl().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.scripting.core.impl.ScriptingResourceResolverProviderImpl", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    orgApacheSlingScriptingCoreImplScriptingResourceResolverProvider().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.scripting.java.impl.JavaScriptEngineFactory", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    orgApacheSlingScriptingJavaImplJavaScriptEngineFactory().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.scripting.javascript.internal.RhinoJavaScriptEngineFactory", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    orgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFa().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.scripting.jsp.JspScriptEngineFactory", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    orgApacheSlingScriptingJspJspScriptEngineFactory().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.scripting.sightly.js.impl.jsapi.SlyBindingsValuesProvider", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    orgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProv().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.security.impl.ContentDispositionFilter", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    orgApacheSlingSecurityImplContentDispositionFilter().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.security.impl.ReferrerFilter", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    orgApacheSlingSecurityImplReferrerFilter().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.serviceusermapping.impl.ServiceUserMapperImpl", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    orgApacheSlingServiceusermappingImplServiceUserMapperImpl().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.serviceusermapping.impl.ServiceUserMapperImpl.amended", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    orgApacheSlingServiceusermappingImplServiceUserMapperImplAmended().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.servlets.get.DefaultGetServlet", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    orgApacheSlingServletsGetDefaultGetServlet().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.servlets.get.impl.version.VersionInfoServlet", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    orgApacheSlingServletsGetImplVersionVersionInfoServlet().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.servlets.post.impl.helper.ChunkCleanUpTask", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    orgApacheSlingServletsPostImplHelperChunkCleanUpTask().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.servlets.post.impl.SlingPostServlet", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    orgApacheSlingServletsPostImplSlingPostServlet().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.servlets.resolver.SlingServletResolver", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    orgApacheSlingServletsResolverSlingServletResolver().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.settings.impl.SlingSettingsServiceImpl", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    orgApacheSlingSettingsImplSlingSettingsServiceImpl().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.startupfilter.impl.StartupFilterImpl", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    orgApacheSlingStartupfilterImplStartupFilterImpl().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.tenant.internal.TenantProviderImpl", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    orgApacheSlingTenantInternalTenantProviderImpl().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.tracer.internal.LogTracer", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    orgApacheSlingTracerInternalLogTracer().handleRequest(exchange);
                }
            })
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.xss.impl.XSSFilterImpl", new HttpHandler() {
                @Override
                public void handleRequest(HttpServerExchange exchange) throws Exception {
                    orgApacheSlingXssImplXSSFilterImpl().handleRequest(exchange);
                }
            })
            ;
    }

    /**
     * Returns a stateful {@link HttpHandler} that configures all endpoints in this server.
     *
     * <p>Endpoints bound in this method do NOT start with "", and
     * it's your responsibility to configure a {@link PathHandler} with a prefix path
     * by calling {@link PathHandler#addPrefixPath} like so:</p>
     *
     * <code>pathHandler.addPrefixPath("", handler)</code>
     *
     * <p>Note: the endpoints bound to the returned {@link HttpHandler} are stateful and will
     * retain any state between multiple sessions.</p>
     *
     * @return an {@link HttpHandler} of type {@link RoutingHandler}
     */
    @javax.annotation.Nonnull
    public HttpHandler getStatefulHandler() {
        return getStatefulHandler(false);
    }

    /**
     * Returns a stateful {@link HttpHandler} that configures all endpoints in this server.
     *
     * <p>Note: the endpoints bound to the returned {@link HttpHandler} are stateful and will
     * retain any state between multiple sessions.</p>
     *
     * @param withBasePath if true, all endpoints would start with ""
     * @return an {@link HttpHandler} of type {@link RoutingHandler}
     */
    @javax.annotation.Nonnull
    public HttpHandler getStatefulHandler(final boolean withBasePath) {
        return getStatefulHandler(withBasePath ? getBasePath() : "");
    }

    /**
     * Returns a stateful {@link HttpHandler} that configures all endpoints in this server.
     *
     * <p>Note: the endpoints bound to the returned {@link HttpHandler} are stateful and will
     * retain any state between multiple sessions.</p>
     *
     * @param basePath base path to set for all endpoints
     * @return an {@link HttpHandler} of type {@link RoutingHandler}
     */
    @javax.annotation.Nonnull
    public HttpHandler getStatefulHandler(final String basePath) {
        return Handlers.routing()
            .add(Methods.POST, basePath + "/system/console/configMgr/Adaptive Form and Interactive Communication Web Channel Configuration", adaptiveFormAndInteractiveCommunicationWebChannelConfiguration())
            .add(Methods.POST, basePath + "/system/console/configMgr/Adaptive Form and Interactive Communication Web Channel Theme Configuration", adaptiveFormAndInteractiveCommunicationWebChannelThemeConfigur())
            .add(Methods.POST, basePath + "/system/console/configMgr/Analytics Component Query Cache Service", analyticsComponentQueryCacheService())
            .add(Methods.POST, basePath + "/system/console/configMgr/Apache Sling Health Check Result HTML Serializer", apacheSlingHealthCheckResultHTMLSerializer())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.aem.formsndocuments.config.AEMFormsManagerConfiguration", comAdobeAemFormsndocumentsConfigAEMFormsManagerConfiguration())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.aem.transaction.core.impl.TransactionRecorder", comAdobeAemTransactionCoreImplTransactionRecorder())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.aem.upgrade.prechecks.hc.impl.DeprecateIndexesHC", comAdobeAemUpgradePrechecksHcImplDeprecateIndexesHC())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.aem.upgrade.prechecks.hc.impl.ReplicationAgentsDisabledHC", comAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHC())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.aem.upgrade.prechecks.mbean.impl.PreUpgradeTasksMBeanImpl", comAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImpl())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.aem.upgrade.prechecks.tasks.impl.ConsistencyCheckTaskImpl", comAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImpl())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.account.api.AccountManagementService", comAdobeCqAccountApiAccountManagementService())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.account.impl.AccountManagementServlet", comAdobeCqAccountImplAccountManagementServlet())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.address.impl.location.LocationListServlet", comAdobeCqAddressImplLocationLocationListServlet())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.audit.purge.Dam", comAdobeCqAuditPurgeDam())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.audit.purge.Pages", comAdobeCqAuditPurgePages())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.audit.purge.Replication", comAdobeCqAuditPurgeReplication())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.cdn.rewriter.impl.AWSCloudFrontRewriter", comAdobeCqCdnRewriterImplAWSCloudFrontRewriter())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.cdn.rewriter.impl.CDNConfigServiceImpl", comAdobeCqCdnRewriterImplCDNConfigServiceImpl())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.cdn.rewriter.impl.CDNRewriter", comAdobeCqCdnRewriterImplCDNRewriter())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.cloudconfig.core.impl.ConfigurationReplicationEventHandler", comAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandle())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.commerce.impl.asset.DynamicImageHandler", comAdobeCqCommerceImplAssetDynamicImageHandler())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.commerce.impl.asset.ProductAssetHandlerProviderImpl", comAdobeCqCommerceImplAssetProductAssetHandlerProviderImpl())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.commerce.impl.asset.StaticImageHandler", comAdobeCqCommerceImplAssetStaticImageHandler())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.commerce.impl.asset.VideoHandler", comAdobeCqCommerceImplAssetVideoHandler())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.commerce.impl.promotion.PromotionManagerImpl", comAdobeCqCommerceImplPromotionPromotionManagerImpl())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.commerce.pim.impl.cataloggenerator.CatalogGeneratorImpl", comAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImpl())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.commerce.pim.impl.PageEventListener", comAdobeCqCommercePimImplPageEventListener())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.commerce.pim.impl.productfeed.ProductFeedServiceImpl", comAdobeCqCommercePimImplProductfeedProductFeedServiceImpl())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.contentinsight.impl.ReportingServicesSettingsProvider", comAdobeCqContentinsightImplReportingServicesSettingsProvider())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.contentinsight.impl.servlets.BrightEdgeProxyServlet", comAdobeCqContentinsightImplServletsBrightEdgeProxyServlet())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.contentinsight.impl.servlets.ReportingServicesProxyServlet", comAdobeCqContentinsightImplServletsReportingServicesProxyServle())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.dam.cfm.impl.component.ComponentConfigImpl", comAdobeCqDamCfmImplComponentComponentConfigImpl())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.dam.cfm.impl.conf.FeatureConfigImpl", comAdobeCqDamCfmImplConfFeatureConfigImpl())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.dam.cfm.impl.content.rewriter.AssetProcessor", comAdobeCqDamCfmImplContentRewriterAssetProcessor())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.dam.cfm.impl.content.rewriter.ParRangeFilter", comAdobeCqDamCfmImplContentRewriterParRangeFilter())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.dam.cfm.impl.content.rewriter.PayloadFilter", comAdobeCqDamCfmImplContentRewriterPayloadFilter())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.dam.dm.process.image.PTiffManagerImpl", comAdobeCqDamDmProcessImagePTiffManagerImpl())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.dam.ips.impl.replication.trigger.ReplicateOnModifyWorker", comAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorker())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.dam.mac.sync.helper.impl.MACSyncClientImpl", comAdobeCqDamMacSyncHelperImplMACSyncClientImpl())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.dam.mac.sync.impl.DAMSyncServiceImpl", comAdobeCqDamMacSyncImplDAMSyncServiceImpl())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.dam.processor.nui.impl.NuiAssetProcessor", comAdobeCqDamProcessorNuiImplNuiAssetProcessor())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.dam.s7imaging.impl.is.ImageServerComponent", comAdobeCqDamS7imagingImplIsImageServerComponent())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.dam.s7imaging.impl.ps.PlatformServerServlet", comAdobeCqDamS7imagingImplPsPlatformServerServlet())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.dam.webdav.impl.io.AssetIOHandler", comAdobeCqDamWebdavImplIoAssetIOHandler())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.dam.webdav.impl.io.DamWebdavVersionLinkingJob", comAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJob())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.dam.webdav.impl.io.SpecialFilesHandler", comAdobeCqDamWebdavImplIoSpecialFilesHandler())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.deserfw.impl.DeserializationFirewallImpl", comAdobeCqDeserfwImplDeserializationFirewallImpl())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.dtm.impl.service.DTMWebServiceImpl", comAdobeCqDtmImplServiceDTMWebServiceImpl())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.dtm.impl.servlets.DTMDeployHookServlet", comAdobeCqDtmImplServletsDTMDeployHookServlet())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.dtm.reactor.impl.service.WebServiceImpl", comAdobeCqDtmReactorImplServiceWebServiceImpl())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.experiencelog.impl.ExperienceLogConfigServlet", comAdobeCqExperiencelogImplExperienceLogConfigServlet())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.hc.ContentPackagesHealthCheck", comAdobeCqHcContentPackagesHealthCheck())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.history.impl.HistoryRequestFilter", comAdobeCqHistoryImplHistoryRequestFilter())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.history.impl.HistoryServiceImpl", comAdobeCqHistoryImplHistoryServiceImpl())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.inbox.impl.typeprovider.ItemTypeProvider", comAdobeCqInboxImplTypeproviderItemTypeProvider())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.projects.impl.servlet.ProjectImageServlet", comAdobeCqProjectsImplServletProjectImageServlet())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.projects.purge.Scheduler", comAdobeCqProjectsPurgeScheduler())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.scheduled.exporter.impl.ScheduledExporterImpl", comAdobeCqScheduledExporterImplScheduledExporterImpl())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.screens.analytics.impl.ScreensAnalyticsServiceImpl", comAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImpl())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.screens.device.impl.DeviceService", comAdobeCqScreensDeviceImplDeviceService())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.screens.device.registration.impl.RegistrationServiceImpl", comAdobeCqScreensDeviceRegistrationImplRegistrationServiceImpl())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.screens.impl.handler.ChannelsUpdateHandler", comAdobeCqScreensImplHandlerChannelsUpdateHandler())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.screens.impl.jobs.DistributedDevicesStatiUpdateJob", comAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJob())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.screens.impl.remote.impl.DistributedHttpClientImpl", comAdobeCqScreensImplRemoteImplDistributedHttpClientImpl())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.screens.impl.ScreensChannelPostProcessor", comAdobeCqScreensImplScreensChannelPostProcessor())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl", comAdobeCqScreensMonitoringImplScreensMonitoringServiceImpl())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.screens.mq.activemq.impl.ArtemisJMSProvider", comAdobeCqScreensMqActivemqImplArtemisJMSProvider())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.screens.offlinecontent.impl.BulkOfflineUpdateServiceImpl", comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImpl())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.screens.offlinecontent.impl.OfflineContentServiceImpl", comAdobeCqScreensOfflinecontentImplOfflineContentServiceImpl())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.screens.segmentation.impl.SegmentationFeatureFlag", comAdobeCqScreensSegmentationImplSegmentationFeatureFlag())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.security.hc.bundles.impl.HtmlLibraryManagerConfigHealthCheck", comAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthCh())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.security.hc.bundles.impl.WcmFilterHealthCheck", comAdobeCqSecurityHcBundlesImplWcmFilterHealthCheck())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.security.hc.dispatcher.impl.DispatcherAccessHealthCheck", comAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheck())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.security.hc.packages.impl.ExampleContentHealthCheck", comAdobeCqSecurityHcPackagesImplExampleContentHealthCheck())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.security.hc.webserver.impl.ClickjackingHealthCheck", comAdobeCqSecurityHcWebserverImplClickjackingHealthCheck())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.accountverification.impl.AccountManagementConfigImpl", comAdobeCqSocialAccountverificationImplAccountManagementConfigIm())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.activitystreams.client.impl.SocialActivityComponentFactoryImpl", comAdobeCqSocialActivitystreamsClientImplSocialActivityComponen())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.activitystreams.client.impl.SocialActivityStreamComponentFactory", comAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCo())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.activitystreams.listener.impl.EventListenerHandler", comAdobeCqSocialActivitystreamsListenerImplEventListenerHandler())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.activitystreams.listener.impl.ModerationEventExtension", comAdobeCqSocialActivitystreamsListenerImplModerationEventExten())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.activitystreams.listener.impl.RatingEventActivitySuppressor", comAdobeCqSocialActivitystreamsListenerImplRatingEventActivityS())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.activitystreams.listener.impl.ResourceActivityStreamProviderFactory", comAdobeCqSocialActivitystreamsListenerImplResourceActivityStre())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.calendar.client.endpoints.impl.CalendarOperationsImpl", comAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsI())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.calendar.client.operationextensions.EventAttachment", comAdobeCqSocialCalendarClientOperationextensionsEventAttachmen())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.calendar.servlets.TimeZoneServlet", comAdobeCqSocialCalendarServletsTimeZoneServlet())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.commons.comments.endpoints.impl.CommentDeleteEventActivitySuppressor", comAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEvent())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.commons.comments.endpoints.impl.CommentOperationService", comAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSe())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.commons.comments.endpoints.impl.TranslationOperationService", comAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperati())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.commons.comments.listing.impl.SearchCommentSocialComponentListProvider", comAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialC())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.commons.comments.scheduler.impl.SearchScheduledPosts", comAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPos())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.commons.cors.CORSAuthenticationFilter", comAdobeCqSocialCommonsCorsCORSAuthenticationFilter())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.commons.emailreply.impl.AndroidEmailClientProvider", comAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProvider())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.commons.emailreply.impl.CommentEmailBuilderImpl", comAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImpl())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.commons.emailreply.impl.CommentEmailEventListener", comAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListener())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.commons.emailreply.impl.CustomEmailClientProvider", comAdobeCqSocialCommonsEmailreplyImplCustomEmailClientProvider())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.commons.emailreply.impl.EmailQuotedTextPatternsImpl", comAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImp())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.commons.emailreply.impl.EmailReplyConfigurationImpl", comAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImp())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.commons.emailreply.impl.EmailReplyImporter", comAdobeCqSocialCommonsEmailreplyImplEmailReplyImporter())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.commons.emailreply.impl.GmailEmailClientProvider", comAdobeCqSocialCommonsEmailreplyImplGmailEmailClientProvider())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.commons.emailreply.impl.IOSEmailClientProvider", comAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProvider())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.commons.emailreply.impl.MacmailEmailClientProvider", comAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProvider())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.commons.emailreply.impl.OutLookEmailClientProvider", comAdobeCqSocialCommonsEmailreplyImplOutLookEmailClientProvider())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.commons.emailreply.impl.UnknownEmailClientProvider", comAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProvider())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.commons.emailreply.impl.YahooEmailClientProvider", comAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProvider())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.commons.maintainance.impl.DeleteTempUGCImageUploads", comAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUpload())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.commons.ugclimiter.impl.UGCLimiterServiceImpl", comAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImpl())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.commons.ugclimitsconfig.impl.CommunityUserUGCLimitsConfigImpl", comAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimit())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.connect.oauth.impl.FacebookProviderImpl", comAdobeCqSocialConnectOauthImplFacebookProviderImpl())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.connect.oauth.impl.SocialOAuthAuthenticationHandler", comAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandle())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.connect.oauth.impl.SocialOAuthUserProfileMapper", comAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapper())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.connect.oauth.impl.TwitterProviderImpl", comAdobeCqSocialConnectOauthImplTwitterProviderImpl())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.content.fragments.services.impl.CommunitiesFragmentCreationServiceImpl", comAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmen())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.datastore.as.impl.ASResourceProviderFactory", comAdobeCqSocialDatastoreAsImplASResourceProviderFactory())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.datastore.op.impl.SocialMSResourceProviderFactory", comAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactory())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.datastore.rdb.impl.SocialRDBResourceProviderFactory", comAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactor())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.enablement.adaptors.EnablementLearningPathAdaptorFactory", comAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorF())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.enablement.adaptors.EnablementResourceAdaptorFactory", comAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFacto())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.enablement.learningpath.endpoints.impl.EnablementLearningPathModelOperationService", comAdobeCqSocialEnablementLearningpathEndpointsImplEnablementL())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.enablement.resource.endpoints.impl.EnablementResourceModelOperationService", comAdobeCqSocialEnablementResourceEndpointsImplEnablementResou())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.enablement.services.impl.AuthorMarkerImpl", comAdobeCqSocialEnablementServicesImplAuthorMarkerImpl())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.filelibrary.client.endpoints.FilelibraryDownloadGetServlet", comAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGe())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.filelibrary.client.endpoints.impl.FileLibraryOperationsService", comAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOpera())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.forum.client.endpoints.impl.ForumOperationsService", comAdobeCqSocialForumClientEndpointsImplForumOperationsService())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.forum.dispatcher.impl.FlushOperations", comAdobeCqSocialForumDispatcherImplFlushOperations())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.group.client.impl.CommunityGroupCollectionComponentFactory", comAdobeCqSocialGroupClientImplCommunityGroupCollectionComponen())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.group.impl.GroupServiceImpl", comAdobeCqSocialGroupImplGroupServiceImpl())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.handlebars.GuavaTemplateCacheImpl", comAdobeCqSocialHandlebarsGuavaTemplateCacheImpl())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.ideation.client.endpoints.impl.IdeationOperationsService", comAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsS())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.journal.client.endpoints.impl.JournalOperationsService", comAdobeCqSocialJournalClientEndpointsImplJournalOperationsSer())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.members.endpoints.impl.CommunityMemberGroupProfileOperationService", comAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfile())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.members.endpoints.impl.CommunityMemberUserProfileOperationService", comAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileO())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.members.impl.CommunityMemberGroupProfileComponentFactory", comAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentF())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.messaging.client.endpoints.impl.MessagingOperationsServiceImpl", comAdobeCqSocialMessagingClientEndpointsImplMessagingOperation())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.moderation.dashboard.api.FilterGroupSocialComponentFactory", comAdobeCqSocialModerationDashboardApiFilterGroupSocialComponen())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.moderation.dashboard.api.ModerationDashboardSocialComponentFactory", comAdobeCqSocialModerationDashboardApiModerationDashboardSocial())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.moderation.dashboard.api.UserDetailsSocialComponentFactory", comAdobeCqSocialModerationDashboardApiUserDetailsSocialComponen())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.moderation.dashboard.internal.impl.FilterGroupSocialComponentFactoryV2", comAdobeCqSocialModerationDashboardInternalImplFilterGroupSoci())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.notifications.impl.MentionsRouter", comAdobeCqSocialNotificationsImplMentionsRouter())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.notifications.impl.NotificationManagerImpl", comAdobeCqSocialNotificationsImplNotificationManagerImpl())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.notifications.impl.NotificationsRouter", comAdobeCqSocialNotificationsImplNotificationsRouter())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.qna.client.endpoints.impl.QnaForumOperationsService", comAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServic())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.reporting.analytics.services.impl.AnalyticsReportImporterServiceImpl", comAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportI())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.reporting.analytics.services.impl.AnalyticsReportManagementServiceImpl", comAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportM())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.reporting.analytics.services.impl.SiteTrendReportSocialComponentFactory", comAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportS())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.review.client.endpoints.impl.ReviewOperationsService", comAdobeCqSocialReviewClientEndpointsImplReviewOperationsServi())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.scf.core.operations.impl.SocialOperationsServlet", comAdobeCqSocialScfCoreOperationsImplSocialOperationsServlet())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.scf.endpoints.impl.DefaultSocialGetServlet", comAdobeCqSocialScfEndpointsImplDefaultSocialGetServlet())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.scoring.impl.ScoringEventListener", comAdobeCqSocialScoringImplScoringEventListener())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.serviceusers.internal.impl.ServiceUserWrapperImpl", comAdobeCqSocialServiceusersInternalImplServiceUserWrapperImpl())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.site.endpoints.impl.SiteOperationService", comAdobeCqSocialSiteEndpointsImplSiteOperationService())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.site.impl.AnalyticsComponentConfigurationServiceImpl", comAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceIm())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.site.impl.SiteConfiguratorImpl", comAdobeCqSocialSiteImplSiteConfiguratorImpl())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.srp.impl.SocialSolrConnector", comAdobeCqSocialSrpImplSocialSolrConnector())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.sync.impl.DiffChangesObserver", comAdobeCqSocialSyncImplDiffChangesObserver())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.sync.impl.GroupSyncListenerImpl", comAdobeCqSocialSyncImplGroupSyncListenerImpl())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.sync.impl.PublisherSyncServiceImpl", comAdobeCqSocialSyncImplPublisherSyncServiceImpl())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.sync.impl.UserSyncListenerImpl", comAdobeCqSocialSyncImplUserSyncListenerImpl())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.translation.impl.TranslationServiceConfigManager", comAdobeCqSocialTranslationImplTranslationServiceConfigManager())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.translation.impl.UGCLanguageDetector", comAdobeCqSocialTranslationImplUGCLanguageDetector())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.ugcbase.dispatcher.impl.FlushServiceImpl", comAdobeCqSocialUgcbaseDispatcherImplFlushServiceImpl())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.ugcbase.impl.AysncReverseReplicatorImpl", comAdobeCqSocialUgcbaseImplAysncReverseReplicatorImpl())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.ugcbase.impl.PublisherConfigurationImpl", comAdobeCqSocialUgcbaseImplPublisherConfigurationImpl())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.ugcbase.impl.SocialUtilsImpl", comAdobeCqSocialUgcbaseImplSocialUtilsImpl())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.ugcbase.moderation.impl.AutoModerationImpl", comAdobeCqSocialUgcbaseModerationImplAutoModerationImpl())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.ugcbase.moderation.impl.SentimentProcess", comAdobeCqSocialUgcbaseModerationImplSentimentProcess())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.ugcbase.security.impl.DefaultAttachmentTypeBlacklistService", comAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackli())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.ugcbase.security.impl.SaferSlingPostValidatorImpl", comAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImpl())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.user.endpoints.impl.UsersGroupFromPublishServlet", comAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServlet())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.social.user.impl.transport.HttpToPublisher", comAdobeCqSocialUserImplTransportHttpToPublisher())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.ui.wcm.commons.internal.servlets.rte.RTEFilterServletFactory.amended", comAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFact())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.upgrades.cleanup.impl.UpgradeContentCleanup", comAdobeCqUpgradesCleanupImplUpgradeContentCleanup())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.upgrades.cleanup.impl.UpgradeInstallFolderCleanup", comAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanup())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.wcm.jobs.async.impl.AsyncDeleteConfigProviderService", comAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderService())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.wcm.jobs.async.impl.AsyncJobCleanUpTask", comAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTask())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.wcm.jobs.async.impl.AsyncMoveConfigProviderService", comAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderService())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.wcm.jobs.async.impl.AsyncPageMoveConfigProviderService", comAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderService())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.wcm.launches.impl.LaunchesEventHandler", comAdobeCqWcmLaunchesImplLaunchesEventHandler())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.wcm.mobile.qrcode.servlet.QRCodeImageGenerator", comAdobeCqWcmMobileQrcodeServletQRCodeImageGenerator())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.wcm.style.internal.ComponentStyleInfoCacheImpl", comAdobeCqWcmStyleInternalComponentStyleInfoCacheImpl())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.cq.wcm.translation.impl.TranslationPlatformConfigurationImpl", comAdobeCqWcmTranslationImplTranslationPlatformConfigurationImpl())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.fd.fp.config.FormsPortalDraftsandSubmissionConfigService", comAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigService())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.fd.fp.config.FormsPortalSchedulerService", comAdobeFdFpConfigFormsPortalSchedulerService())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.forms.common.service.impl.DefaultDataProvider", comAdobeFormsCommonServiceImplDefaultDataProvider())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.forms.common.service.impl.FormsCommonConfigurationServiceImpl", comAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImp())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.forms.common.servlet.TempCleanUpTask", comAdobeFormsCommonServletTempCleanUpTask())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.acp.platform.PlatformServlet", comAdobeGraniteAcpPlatformPlatformServlet())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.activitystreams.impl.ActivityManagerImpl", comAdobeGraniteActivitystreamsImplActivityManagerImpl())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.analyzer.base.SystemStatusServlet", comAdobeGraniteAnalyzerBaseSystemStatusServlet())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.analyzer.scripts.compile.AllScriptsCompilerServlet", comAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServlet())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.apicontroller.FilterResolverHookFactory", comAdobeGraniteApicontrollerFilterResolverHookFactory())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.auth.cert.impl.ClientCertAuthHandler", comAdobeGraniteAuthCertImplClientCertAuthHandler())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.auth.ims", comAdobeGraniteAuthIms())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.auth.ims.impl.ExternalUserIdMappingProviderExtension", comAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtension())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.auth.ims.impl.IMSAccessTokenRequestCustomizerImpl", comAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImpl())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.auth.ims.impl.IMSInstanceCredentialsValidator", comAdobeGraniteAuthImsImplIMSInstanceCredentialsValidator())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.auth.ims.impl.IMSProviderImpl", comAdobeGraniteAuthImsImplIMSProviderImpl())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.auth.ims.impl.ImsConfigProviderImpl", comAdobeGraniteAuthImsImplImsConfigProviderImpl())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.auth.oauth.accesstoken.provider", comAdobeGraniteAuthOauthAccesstokenProvider())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.auth.oauth.impl.BearerAuthenticationHandler", comAdobeGraniteAuthOauthImplBearerAuthenticationHandler())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.auth.oauth.impl.DefaultTokenValidatorImpl", comAdobeGraniteAuthOauthImplDefaultTokenValidatorImpl())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.auth.oauth.impl.FacebookProviderImpl", comAdobeGraniteAuthOauthImplFacebookProviderImpl())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.auth.oauth.impl.GithubProviderImpl", comAdobeGraniteAuthOauthImplGithubProviderImpl())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.auth.oauth.impl.GraniteProvider", comAdobeGraniteAuthOauthImplGraniteProvider())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.auth.oauth.impl.helper.ProviderConfigManager", comAdobeGraniteAuthOauthImplHelperProviderConfigManager())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.auth.oauth.impl.helper.ProviderConfigManagerInternal", comAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternal())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.auth.oauth.impl.OAuthAuthenticationHandler", comAdobeGraniteAuthOauthImplOAuthAuthenticationHandler())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.auth.oauth.impl.TwitterProviderImpl", comAdobeGraniteAuthOauthImplTwitterProviderImpl())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.auth.oauth.provider", comAdobeGraniteAuthOauthProvider())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.auth.requirement.impl.DefaultRequirementHandler", comAdobeGraniteAuthRequirementImplDefaultRequirementHandler())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.auth.saml.SamlAuthenticationHandler", comAdobeGraniteAuthSamlSamlAuthenticationHandler())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.auth.sso.impl.SsoAuthenticationHandler", comAdobeGraniteAuthSsoImplSsoAuthenticationHandler())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.bundles.hc.impl.CodeCacheHealthCheck", comAdobeGraniteBundlesHcImplCodeCacheHealthCheck())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.bundles.hc.impl.CrxdeSupportBundleHealthCheck", comAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheck())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.bundles.hc.impl.DavExBundleHealthCheck", comAdobeGraniteBundlesHcImplDavExBundleHealthCheck())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.bundles.hc.impl.InactiveBundlesHealthCheck", comAdobeGraniteBundlesHcImplInactiveBundlesHealthCheck())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.bundles.hc.impl.JobsHealthCheck", comAdobeGraniteBundlesHcImplJobsHealthCheck())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.bundles.hc.impl.SlingGetServletHealthCheck", comAdobeGraniteBundlesHcImplSlingGetServletHealthCheck())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.bundles.hc.impl.SlingJavaScriptHandlerHealthCheck", comAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheck())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.bundles.hc.impl.SlingJspScriptHandlerHealthCheck", comAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheck())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.bundles.hc.impl.SlingReferrerFilterHealthCheck", comAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheck())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.bundles.hc.impl.WebDavBundleHealthCheck", comAdobeGraniteBundlesHcImplWebDavBundleHealthCheck())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.comments.internal.CommentReplicationContentFilterFactory", comAdobeGraniteCommentsInternalCommentReplicationContentFilterFac())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.compatrouter.impl.CompatSwitchingServiceImpl", comAdobeGraniteCompatrouterImplCompatSwitchingServiceImpl())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.compatrouter.impl.RoutingConfig", comAdobeGraniteCompatrouterImplRoutingConfig())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.compatrouter.impl.SwitchMappingConfig", comAdobeGraniteCompatrouterImplSwitchMappingConfig())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.conf.impl.RuntimeAwareConfigurationResourceResolvingStrategy", comAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolving())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.contexthub.impl.ContextHubImpl", comAdobeGraniteContexthubImplContextHubImpl())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.cors.impl.CORSPolicyImpl", comAdobeGraniteCorsImplCORSPolicyImpl())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.csrf.impl.CSRFFilter", comAdobeGraniteCsrfImplCSRFFilter())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.csrf.impl.CSRFServlet", comAdobeGraniteCsrfImplCSRFServlet())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.distribution.core.impl.CryptoDistributionTransportSecretProvider", comAdobeGraniteDistributionCoreImplCryptoDistributionTransportSe())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.distribution.core.impl.diff.DiffChangesObserver", comAdobeGraniteDistributionCoreImplDiffDiffChangesObserver())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.distribution.core.impl.diff.DiffEventListener", comAdobeGraniteDistributionCoreImplDiffDiffEventListener())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.distribution.core.impl.DistributionToReplicationEventTransformer", comAdobeGraniteDistributionCoreImplDistributionToReplicationEven())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.distribution.core.impl.replication.adapters.ReplicationAgentProvider", comAdobeGraniteDistributionCoreImplReplicationAdaptersReplicat())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.distribution.core.impl.replication.DistributionTransportHandler", comAdobeGraniteDistributionCoreImplReplicationDistributionTrans())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.distribution.core.impl.transport.AccessTokenDistributionTransportSecretProvider", comAdobeGraniteDistributionCoreImplTransportAccessTokenDistribu())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.frags.impl.CheckHttpHeaderFlag", comAdobeGraniteFragsImplCheckHttpHeaderFlag())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.frags.impl.RandomFeature", comAdobeGraniteFragsImplRandomFeature())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.httpcache.file.FileCacheStore", comAdobeGraniteHttpcacheFileFileCacheStore())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.httpcache.impl.OuterCacheFilter", comAdobeGraniteHttpcacheImplOuterCacheFilter())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.i18n.impl.bundle.PseudoTranslations", comAdobeGraniteI18nImplBundlePseudoTranslations())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.i18n.impl.PreferencesLocaleResolverService", comAdobeGraniteI18nImplPreferencesLocaleResolverService())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.infocollector.InfoCollector", comAdobeGraniteInfocollectorInfoCollector())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.jetty.ssl.internal.GraniteSslConnectorFactory", comAdobeGraniteJettySslInternalGraniteSslConnectorFactory())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.license.impl.LicenseCheckFilter", comAdobeGraniteLicenseImplLicenseCheckFilter())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.logging.impl.LogAnalyserImpl", comAdobeGraniteLoggingImplLogAnalyserImpl())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.logging.impl.LogErrorHealthCheck", comAdobeGraniteLoggingImplLogErrorHealthCheck())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.maintenance.crx.impl.DataStoreGarbageCollectionTask", comAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTask())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.maintenance.crx.impl.LuceneBinariesCleanupTask", comAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTask())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.maintenance.crx.impl.RevisionCleanupTask", comAdobeGraniteMaintenanceCrxImplRevisionCleanupTask())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.monitoring.impl.ScriptConfigImpl", comAdobeGraniteMonitoringImplScriptConfigImpl())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.oauth.server.auth.impl.OAuth2ServerAuthenticationHandler", comAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHan())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.oauth.server.impl.AccessTokenCleanupTask", comAdobeGraniteOauthServerImplAccessTokenCleanupTask())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.oauth.server.impl.OAuth2ClientRevocationServlet", comAdobeGraniteOauthServerImplOAuth2ClientRevocationServlet())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.oauth.server.impl.OAuth2RevocationEndpointServlet", comAdobeGraniteOauthServerImplOAuth2RevocationEndpointServlet())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.oauth.server.impl.OAuth2TokenEndpointServlet", comAdobeGraniteOauthServerImplOAuth2TokenEndpointServlet())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.oauth.server.impl.OAuth2TokenRevocationServlet", comAdobeGraniteOauthServerImplOAuth2TokenRevocationServlet())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.offloading.impl.OffloadingConfigurator", comAdobeGraniteOffloadingImplOffloadingConfigurator())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.offloading.impl.OffloadingJobCloner", comAdobeGraniteOffloadingImplOffloadingJobCloner())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.offloading.impl.OffloadingJobOffloader", comAdobeGraniteOffloadingImplOffloadingJobOffloader())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.offloading.impl.transporter.OffloadingAgentManager", comAdobeGraniteOffloadingImplTransporterOffloadingAgentManager())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.offloading.impl.transporter.OffloadingDefaultTransporter", comAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspo())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.omnisearch.impl.core.OmniSearchServiceImpl", comAdobeGraniteOmnisearchImplCoreOmniSearchServiceImpl())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.optout.impl.OptOutServiceImpl", comAdobeGraniteOptoutImplOptOutServiceImpl())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.queries.impl.hc.AsyncIndexHealthCheck", comAdobeGraniteQueriesImplHcAsyncIndexHealthCheck())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.queries.impl.hc.LargeIndexHealthCheck", comAdobeGraniteQueriesImplHcLargeIndexHealthCheck())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.queries.impl.hc.QueriesStatusHealthCheck", comAdobeGraniteQueriesImplHcQueriesStatusHealthCheck())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.queries.impl.hc.QueryHealthCheckMetrics", comAdobeGraniteQueriesImplHcQueryHealthCheckMetrics())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.queries.impl.hc.QueryLimitsHealthCheck", comAdobeGraniteQueriesImplHcQueryLimitsHealthCheck())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.replication.hc.impl.ReplicationQueueHealthCheck", comAdobeGraniteReplicationHcImplReplicationQueueHealthCheck())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.replication.hc.impl.ReplicationTransportUsersHealthCheck", comAdobeGraniteReplicationHcImplReplicationTransportUsersHealthC())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.repository.hc.impl.AuthorizableNodeNameHealthCheck", comAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheck())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.repository.hc.impl.content.sling.SlingContentHealthCheck", comAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthC())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.repository.hc.impl.ContinuousRGCHealthCheck", comAdobeGraniteRepositoryHcImplContinuousRGCHealthCheck())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.repository.hc.impl.DefaultAccessUserProfileHealthCheck", comAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthChe())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.repository.hc.impl.DefaultLoginsHealthCheck", comAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheck())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.repository.hc.impl.DiskSpaceHealthCheck", comAdobeGraniteRepositoryHcImplDiskSpaceHealthCheck())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.repository.hc.impl.ObservationQueueLengthHealthCheck", comAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheck())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.repository.impl.CommitStatsConfig", comAdobeGraniteRepositoryImplCommitStatsConfig())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.repository.ServiceUserConfiguration", comAdobeGraniteRepositoryServiceUserConfiguration())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.requests.logging.impl.hc.RequestsStatusHealthCheckImpl", comAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckIm())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.resourcestatus.impl.CompositeStatusType", comAdobeGraniteResourcestatusImplCompositeStatusType())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.resourcestatus.impl.StatusResourceProviderImpl", comAdobeGraniteResourcestatusImplStatusResourceProviderImpl())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.rest.assets.impl.AssetContentDispositionFilter", comAdobeGraniteRestAssetsImplAssetContentDispositionFilter())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.rest.impl.ApiEndpointResourceProviderFactoryImpl", comAdobeGraniteRestImplApiEndpointResourceProviderFactoryImpl())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.rest.impl.servlet.DefaultGETServlet", comAdobeGraniteRestImplServletDefaultGETServlet())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.security.user.ui.internal.servlets.SSLConfigurationServlet", comAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationS())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.security.user.UserPropertiesService", comAdobeGraniteSecurityUserUserPropertiesService())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.socialgraph.impl.SocialGraphFactoryImpl", comAdobeGraniteSocialgraphImplSocialGraphFactoryImpl())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.system.monitoring.impl.SystemStatsMBeanImpl", comAdobeGraniteSystemMonitoringImplSystemStatsMBeanImpl())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.taskmanagement.impl.jcr.TaskAdapterFactory", comAdobeGraniteTaskmanagementImplJcrTaskAdapterFactory())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.taskmanagement.impl.jcr.TaskArchiveService", comAdobeGraniteTaskmanagementImplJcrTaskArchiveService())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.taskmanagement.impl.purge.TaskPurgeMaintenanceTask", comAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTask())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.taskmanagement.impl.service.TaskManagerAdapterFactory", comAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactor())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.threaddump.ThreadDumpCollector", comAdobeGraniteThreaddumpThreadDumpCollector())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.translation.connector.msft.core.impl.MicrosoftTranslationServiceFactoryImpl", comAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTransl())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.translation.core.impl.TranslationManagerImpl", comAdobeGraniteTranslationCoreImplTranslationManagerImpl())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.ui.clientlibs.impl.HtmlLibraryManagerImpl", comAdobeGraniteUiClientlibsImplHtmlLibraryManagerImpl())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.workflow.console.frags.WorkflowWithdrawFeature", comAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeature())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.workflow.console.publish.WorkflowPublishEventService", comAdobeGraniteWorkflowConsolePublishWorkflowPublishEventService())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.workflow.core.jcr.WorkflowBucketManager", comAdobeGraniteWorkflowCoreJcrWorkflowBucketManager())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.workflow.core.job.ExternalProcessJobHandler", comAdobeGraniteWorkflowCoreJobExternalProcessJobHandler())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.workflow.core.job.JobHandler", comAdobeGraniteWorkflowCoreJobJobHandler())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.workflow.core.offloading.WorkflowOffloadingJobConsumer", comAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsum())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.workflow.core.PayloadMapCache", comAdobeGraniteWorkflowCorePayloadMapCache())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.workflow.core.payloadmap.PayloadMoveListener", comAdobeGraniteWorkflowCorePayloadmapPayloadMoveListener())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.workflow.core.WorkflowConfig", comAdobeGraniteWorkflowCoreWorkflowConfig())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.workflow.core.WorkflowSessionFactory", comAdobeGraniteWorkflowCoreWorkflowSessionFactory())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.granite.workflow.purge.Scheduler", comAdobeGraniteWorkflowPurgeScheduler())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.octopus.ncomm.bootstrap", comAdobeOctopusNcommBootstrap())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.social.integrations.livefyre.user.pingforpull.impl.PingPullServlet", comAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullS())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.adobe.xmp.worker.files.ncomm.XMPFilesNComm", comAdobeXmpWorkerFilesNcommXMPFilesNComm())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.commons.datasource.jdbcpool.JdbcPoolService", comDayCommonsDatasourceJdbcpoolJdbcPoolService())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.commons.httpclient", comDayCommonsHttpclient())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.analytics.impl.StorePropertiesChangeListener", comDayCqAnalyticsImplStorePropertiesChangeListener())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.analytics.sitecatalyst.impl.exporter.ClassificationsExporter", comDayCqAnalyticsSitecatalystImplExporterClassificationsExporte())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.analytics.sitecatalyst.impl.importer.ReportImporter", comDayCqAnalyticsSitecatalystImplImporterReportImporter())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.analytics.sitecatalyst.impl.SitecatalystAdapterFactory", comDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactory())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.analytics.sitecatalyst.impl.SitecatalystHttpClientImpl", comDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImpl())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.analytics.testandtarget.impl.AccountOptionsUpdater", comDayCqAnalyticsTestandtargetImplAccountOptionsUpdater())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.analytics.testandtarget.impl.DeleteAuthorActivityListener", comDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListener())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.analytics.testandtarget.impl.PushAuthorCampaignPageListener", comDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListener())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.analytics.testandtarget.impl.SegmentImporter", comDayCqAnalyticsTestandtargetImplSegmentImporter())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.analytics.testandtarget.impl.service.WebServiceImpl", comDayCqAnalyticsTestandtargetImplServiceWebServiceImpl())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.analytics.testandtarget.impl.servlets.AdminServerServlet", comDayCqAnalyticsTestandtargetImplServletsAdminServerServlet())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.analytics.testandtarget.impl.TestandtargetHttpClientImpl", comDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImpl())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.auth.impl.cug.CugSupportImpl", comDayCqAuthImplCugCugSupportImpl())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.auth.impl.LoginSelectorHandler", comDayCqAuthImplLoginSelectorHandler())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.commons.impl.ExternalizerImpl", comDayCqCommonsImplExternalizerImpl())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.commons.servlets.RootMappingServlet", comDayCqCommonsServletsRootMappingServlet())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.compat.codeupgrade.impl.CodeUpgradeExecutionConditionChecker", comDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionChecke())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.compat.codeupgrade.impl.UpgradeTaskIgnoreList", comDayCqCompatCodeupgradeImplUpgradeTaskIgnoreList())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.compat.codeupgrade.impl.VersionRangeTaskIgnorelist", comDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelist())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.contentsync.impl.ContentSyncManagerImpl", comDayCqContentsyncImplContentSyncManagerImpl())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.dam.commons.handler.StandardImageHandler", comDayCqDamCommonsHandlerStandardImageHandler())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.dam.commons.metadata.XmpFilterBlackWhite", comDayCqDamCommonsMetadataXmpFilterBlackWhite())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.dam.commons.util.impl.AssetCacheImpl", comDayCqDamCommonsUtilImplAssetCacheImpl())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.dam.core.impl.annotation.pdf.AnnotationPdfConfig", comDayCqDamCoreImplAnnotationPdfAnnotationPdfConfig())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.dam.core.impl.AssetMoveListener", comDayCqDamCoreImplAssetMoveListener())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.dam.core.impl.assethome.AssetHomePageConfiguration", comDayCqDamCoreImplAssethomeAssetHomePageConfiguration())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.dam.core.impl.assetlinkshare.AdhocAssetShareProxyServlet", comDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServlet())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.dam.core.impl.cache.CQBufferedImageCache", comDayCqDamCoreImplCacheCQBufferedImageCache())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.dam.core.impl.DamChangeEventListener", comDayCqDamCoreImplDamChangeEventListener())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.dam.core.impl.DamEventPurgeService", comDayCqDamCoreImplDamEventPurgeService())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.dam.core.impl.DamEventRecorderImpl", comDayCqDamCoreImplDamEventRecorderImpl())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.dam.core.impl.event.DamEventAuditListener", comDayCqDamCoreImplEventDamEventAuditListener())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.dam.core.impl.ExpiryNotificationJobImpl", comDayCqDamCoreImplExpiryNotificationJobImpl())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.dam.core.impl.foldermetadataschema.FolderMetadataSchemaFeatureFlag", comDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeat())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.dam.core.impl.gfx.CommonsGfxRenderer", comDayCqDamCoreImplGfxCommonsGfxRenderer())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.dam.core.impl.handler.EPSFormatHandler", comDayCqDamCoreImplHandlerEPSFormatHandler())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.dam.core.impl.handler.IndesignFormatHandler", comDayCqDamCoreImplHandlerIndesignFormatHandler())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.dam.core.impl.handler.JpegHandler", comDayCqDamCoreImplHandlerJpegHandler())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.dam.core.impl.handler.xmp.NCommXMPHandler", comDayCqDamCoreImplHandlerXmpNCommXMPHandler())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.dam.core.impl.jmx.AssetIndexUpdateMonitor", comDayCqDamCoreImplJmxAssetIndexUpdateMonitor())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.dam.core.impl.jmx.AssetMigrationMBeanImpl", comDayCqDamCoreImplJmxAssetMigrationMBeanImpl())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.dam.core.impl.jmx.AssetUpdateMonitorImpl", comDayCqDamCoreImplJmxAssetUpdateMonitorImpl())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.dam.core.impl.jobs.metadataexport.AsyncMetadataExportConfigProviderService", comDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfig())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.dam.core.impl.jobs.metadataimport.AsyncMetadataImportConfigProviderService", comDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfig())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.dam.core.impl.lightbox.LightboxServlet", comDayCqDamCoreImplLightboxLightboxServlet())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.dam.core.impl.metadata.editor.SelectComponentHandler", comDayCqDamCoreImplMetadataEditorSelectComponentHandler())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.dam.core.impl.mimeType.AssetUploadRestrictionHelper", comDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelper())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.dam.core.impl.mimeType.DamMimeTypeServiceImpl", comDayCqDamCoreImplMimeTypeDamMimeTypeServiceImpl())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.dam.core.impl.MissingMetadataNotificationJob", comDayCqDamCoreImplMissingMetadataNotificationJob())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.dam.core.impl.process.SendTransientWorkflowCompletedEmailProcess", comDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPr())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.dam.core.impl.process.TextExtractionProcess", comDayCqDamCoreImplProcessTextExtractionProcess())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.dam.core.impl.RenditionMakerImpl", comDayCqDamCoreImplRenditionMakerImpl())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.dam.core.impl.reports.ReportExportService", comDayCqDamCoreImplReportsReportExportService())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.dam.core.impl.reports.ReportPurgeService", comDayCqDamCoreImplReportsReportPurgeService())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.dam.core.impl.servlet.AssetDownloadServlet", comDayCqDamCoreImplServletAssetDownloadServlet())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.dam.core.impl.servlet.AssetStatusServlet", comDayCqDamCoreImplServletAssetStatusServlet())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.dam.core.impl.servlet.AssetXMPSearchServlet", comDayCqDamCoreImplServletAssetXMPSearchServlet())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.dam.core.impl.servlet.BatchMetadataServlet", comDayCqDamCoreImplServletBatchMetadataServlet())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.dam.core.impl.servlet.BinaryProviderServlet", comDayCqDamCoreImplServletBinaryProviderServlet())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.dam.core.impl.servlet.CollectionServlet", comDayCqDamCoreImplServletCollectionServlet())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.dam.core.impl.servlet.CollectionsServlet", comDayCqDamCoreImplServletCollectionsServlet())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.dam.core.impl.servlet.CompanionServlet", comDayCqDamCoreImplServletCompanionServlet())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.dam.core.impl.servlet.CreateAssetServlet", comDayCqDamCoreImplServletCreateAssetServlet())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.dam.core.impl.servlet.DamContentDispositionFilter", comDayCqDamCoreImplServletDamContentDispositionFilter())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.dam.core.impl.servlet.GuidLookupFilter", comDayCqDamCoreImplServletGuidLookupFilter())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.dam.core.impl.servlet.HealthCheckServlet", comDayCqDamCoreImplServletHealthCheckServlet())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.dam.core.impl.servlet.MetadataGetServlet", comDayCqDamCoreImplServletMetadataGetServlet())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.dam.core.impl.servlet.MultipleLicenseAcceptServlet", comDayCqDamCoreImplServletMultipleLicenseAcceptServlet())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.dam.core.impl.servlet.ResourceCollectionServlet", comDayCqDamCoreImplServletResourceCollectionServlet())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.dam.core.impl.ui.preview.FolderPreviewUpdaterImpl", comDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImpl())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.dam.core.impl.unzip.UnzipConfig", comDayCqDamCoreImplUnzipUnzipConfig())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.dam.core.process.ExifToolExtractMetadataProcess", comDayCqDamCoreProcessExifToolExtractMetadataProcess())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.dam.core.process.ExtractMetadataProcess", comDayCqDamCoreProcessExtractMetadataProcess())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.dam.core.process.MetadataProcessorProcess", comDayCqDamCoreProcessMetadataProcessorProcess())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.dam.handler.ffmpeg.LocatorImpl", comDayCqDamHandlerFfmpegLocatorImpl())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.dam.handler.gibson.fontmanager.impl.FontManagerServiceImpl", comDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImpl())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.dam.handler.standard.pdf.PdfHandler", comDayCqDamHandlerStandardPdfPdfHandler())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.dam.handler.standard.ps.PostScriptHandler", comDayCqDamHandlerStandardPsPostScriptHandler())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.dam.handler.standard.psd.PsdHandler", comDayCqDamHandlerStandardPsdPsdHandler())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.dam.ids.impl.IDSJobProcessor", comDayCqDamIdsImplIDSJobProcessor())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.dam.ids.impl.IDSPoolManagerImpl", comDayCqDamIdsImplIDSPoolManagerImpl())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.dam.indd.impl.handler.IndesignXMPHandler", comDayCqDamInddImplHandlerIndesignXMPHandler())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.dam.indd.impl.servlet.SnippetCreationServlet", comDayCqDamInddImplServletSnippetCreationServlet())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.dam.indd.process.INDDMediaExtractProcess", comDayCqDamInddProcessINDDMediaExtractProcess())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.dam.performance.internal.AssetPerformanceDataHandlerImpl", comDayCqDamPerformanceInternalAssetPerformanceDataHandlerImpl())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.dam.performance.internal.AssetPerformanceReportSyncJob", comDayCqDamPerformanceInternalAssetPerformanceReportSyncJob())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.dam.pim.impl.sourcing.upload.process.ProductAssetsUploadProcess", comDayCqDamPimImplSourcingUploadProcessProductAssetsUploadPro())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.dam.s7dam.common.analytics.impl.S7damDynamicMediaConfigEventListener", comDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEven())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.dam.s7dam.common.analytics.impl.SiteCatalystReportRunner", comDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunner())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.dam.s7dam.common.post.servlets.SetCreateHandler", comDayCqDamS7damCommonPostServletsSetCreateHandler())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.dam.s7dam.common.post.servlets.SetModifyHandler", comDayCqDamS7damCommonPostServletsSetModifyHandler())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.dam.s7dam.common.process.VideoThumbnailDownloadProcess", comDayCqDamS7damCommonProcessVideoThumbnailDownloadProcess())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.dam.s7dam.common.S7damDamChangeEventListener", comDayCqDamS7damCommonS7damDamChangeEventListener())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.dam.s7dam.common.servlets.S7damProductInfoServlet", comDayCqDamS7damCommonServletsS7damProductInfoServlet())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.dam.s7dam.common.video.impl.VideoProxyClientServiceImpl", comDayCqDamS7damCommonVideoImplVideoProxyClientServiceImpl())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.dam.scene7.impl.Scene7APIClientImpl", comDayCqDamScene7ImplScene7APIClientImpl())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.dam.scene7.impl.Scene7AssetMimeTypeServiceImpl", comDayCqDamScene7ImplScene7AssetMimeTypeServiceImpl())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.dam.scene7.impl.Scene7ConfigurationEventListener", comDayCqDamScene7ImplScene7ConfigurationEventListener())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.dam.scene7.impl.Scene7DamChangeEventListener", comDayCqDamScene7ImplScene7DamChangeEventListener())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.dam.scene7.impl.Scene7FlashTemplatesServiceImpl", comDayCqDamScene7ImplScene7FlashTemplatesServiceImpl())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.dam.scene7.impl.Scene7UploadServiceImpl", comDayCqDamScene7ImplScene7UploadServiceImpl())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.dam.stock.integration.impl.cache.StockCacheConfigurationServiceImpl", comDayCqDamStockIntegrationImplCacheStockCacheConfigurationSer())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.dam.stock.integration.impl.configuration.StockConfigurationImpl", comDayCqDamStockIntegrationImplConfigurationStockConfiguration())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.dam.video.impl.servlet.VideoTestServlet", comDayCqDamVideoImplServletVideoTestServlet())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.extwidget.servlets.ImageSpriteServlet", comDayCqExtwidgetServletsImageSpriteServlet())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.image.internal.font.FontHelper", comDayCqImageInternalFontFontHelper())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.jcrclustersupport.ClusterStartLevelController", comDayCqJcrclustersupportClusterStartLevelController())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.mailer.DefaultMailService", comDayCqMailerDefaultMailService())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.mailer.impl.CqMailingService", comDayCqMailerImplCqMailingService())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.mailer.impl.email.CqEmailTemplateFactory", comDayCqMailerImplEmailCqEmailTemplateFactory())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.mailer.impl.email.CqRetrieverTemplateFactory", comDayCqMailerImplEmailCqRetrieverTemplateFactory())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.mcm.campaign.impl.IntegrationConfigImpl", comDayCqMcmCampaignImplIntegrationConfigImpl())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.mcm.campaign.importer.PersonalizedTextHandlerFactory", comDayCqMcmCampaignImporterPersonalizedTextHandlerFactory())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.mcm.core.newsletter.NewsletterEmailServiceImpl", comDayCqMcmCoreNewsletterNewsletterEmailServiceImpl())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.mcm.impl.MCMConfiguration", comDayCqMcmImplMCMConfiguration())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.mcm.landingpage.parser.taghandlers.cta.ClickThroughComponentTagHandlerFactory", comDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponen())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.mcm.landingpage.parser.taghandlers.cta.GraphicalClickThroughComponentTagHandlerFactory", comDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThroug())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.mcm.landingpage.parser.taghandlers.cta.LeadFormCTAComponentTagHandlerFactory", comDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponent())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.mcm.landingpage.parser.taghandlers.mbox.MBoxExperienceTagHandlerFactory", comDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHa())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.mcm.landingpage.parser.taghandlers.mbox.TargetComponentTagHandlerFactory", comDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagH())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.notification.impl.NotificationServiceImpl", comDayCqNotificationImplNotificationServiceImpl())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.personalization.impl.servlets.TargetingConfigurationServlet", comDayCqPersonalizationImplServletsTargetingConfigurationServlet())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.polling.importer.impl.ManagedPollConfigImpl", comDayCqPollingImporterImplManagedPollConfigImpl())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.polling.importer.impl.ManagedPollingImporterImpl", comDayCqPollingImporterImplManagedPollingImporterImpl())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.polling.importer.impl.PollingImporterImpl", comDayCqPollingImporterImplPollingImporterImpl())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.replication.audit.ReplicationEventListener", comDayCqReplicationAuditReplicationEventListener())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.replication.content.StaticContentBuilder", comDayCqReplicationContentStaticContentBuilder())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.replication.impl.AgentManagerImpl", comDayCqReplicationImplAgentManagerImpl())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.replication.impl.content.durbo.BinaryLessContentBuilder", comDayCqReplicationImplContentDurboBinaryLessContentBuilder())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.replication.impl.content.durbo.DurboImportConfigurationProviderService", comDayCqReplicationImplContentDurboDurboImportConfigurationProv())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.replication.impl.ReplicationContentFactoryProviderImpl", comDayCqReplicationImplReplicationContentFactoryProviderImpl())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.replication.impl.ReplicationReceiverImpl", comDayCqReplicationImplReplicationReceiverImpl())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.replication.impl.ReplicatorImpl", comDayCqReplicationImplReplicatorImpl())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.replication.impl.ReverseReplicator", comDayCqReplicationImplReverseReplicator())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.replication.impl.transport.BinaryLessTransportHandler", comDayCqReplicationImplTransportBinaryLessTransportHandler())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.replication.impl.transport.Http", comDayCqReplicationImplTransportHttp())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.reporting.impl.cache.CacheImpl", comDayCqReportingImplCacheCacheImpl())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.reporting.impl.ConfigServiceImpl", comDayCqReportingImplConfigServiceImpl())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.reporting.impl.RLogAnalyzer", comDayCqReportingImplRLogAnalyzer())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.rewriter.linkchecker.impl.LinkCheckerImpl", comDayCqRewriterLinkcheckerImplLinkCheckerImpl())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.rewriter.linkchecker.impl.LinkCheckerTask", comDayCqRewriterLinkcheckerImplLinkCheckerTask())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.rewriter.linkchecker.impl.LinkCheckerTransformerFactory", comDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactory())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.rewriter.linkchecker.impl.LinkInfoStorageImpl", comDayCqRewriterLinkcheckerImplLinkInfoStorageImpl())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.rewriter.processor.impl.HtmlParserFactory", comDayCqRewriterProcessorImplHtmlParserFactory())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.search.impl.builder.QueryBuilderImpl", comDayCqSearchImplBuilderQueryBuilderImpl())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.search.suggest.impl.SuggestionIndexManagerImpl", comDayCqSearchSuggestImplSuggestionIndexManagerImpl())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.searchpromote.impl.PublishSearchPromoteConfigHandler", comDayCqSearchpromoteImplPublishSearchPromoteConfigHandler())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.searchpromote.impl.SearchPromoteServiceImpl", comDayCqSearchpromoteImplSearchPromoteServiceImpl())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.security.ACLSetup", comDayCqSecurityACLSetup())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.statistics.impl.StatisticsServiceImpl", comDayCqStatisticsImplStatisticsServiceImpl())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.tagging.impl.JcrTagManagerFactoryImpl", comDayCqTaggingImplJcrTagManagerFactoryImpl())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.tagging.impl.search.TagPredicateEvaluator", comDayCqTaggingImplSearchTagPredicateEvaluator())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.tagging.impl.TagGarbageCollector", comDayCqTaggingImplTagGarbageCollector())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.wcm.contentsync.impl.handler.PagesUpdateHandler", comDayCqWcmContentsyncImplHandlerPagesUpdateHandler())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.wcm.contentsync.impl.rewriter.PathRewriterTransformerFactory", comDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactor())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.wcm.core.impl.AuthoringUIModeServiceImpl", comDayCqWcmCoreImplAuthoringUIModeServiceImpl())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.wcm.core.impl.commands.WCMCommandServlet", comDayCqWcmCoreImplCommandsWCMCommandServlet())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.wcm.core.impl.devicedetection.DeviceIdentificationModeImpl", comDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImpl())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.wcm.core.impl.event.PageEventAuditListener", comDayCqWcmCoreImplEventPageEventAuditListener())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.wcm.core.impl.event.PagePostProcessor", comDayCqWcmCoreImplEventPagePostProcessor())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.wcm.core.impl.event.RepositoryChangeEventListener", comDayCqWcmCoreImplEventRepositoryChangeEventListener())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.wcm.core.impl.event.TemplatePostProcessor", comDayCqWcmCoreImplEventTemplatePostProcessor())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.wcm.core.impl.LanguageManagerImpl", comDayCqWcmCoreImplLanguageManagerImpl())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.wcm.core.impl.LinkCheckerConfigurationFactoryImpl", comDayCqWcmCoreImplLinkCheckerConfigurationFactoryImpl())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.wcm.core.impl.page.PageInfoAggregatorImpl", comDayCqWcmCoreImplPagePageInfoAggregatorImpl())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.wcm.core.impl.page.PageManagerFactoryImpl", comDayCqWcmCoreImplPagePageManagerFactoryImpl())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.wcm.core.impl.references.content.ContentReferenceConfig", comDayCqWcmCoreImplReferencesContentContentReferenceConfig())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.wcm.core.impl.servlets.contentfinder.AssetViewHandler", comDayCqWcmCoreImplServletsContentfinderAssetViewHandler())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.wcm.core.impl.servlets.contentfinder.connector.ConnectorViewHandler", comDayCqWcmCoreImplServletsContentfinderConnectorConnectorVie())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.wcm.core.impl.servlets.contentfinder.PageViewHandler", comDayCqWcmCoreImplServletsContentfinderPageViewHandler())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.wcm.core.impl.servlets.FindReplaceServlet", comDayCqWcmCoreImplServletsFindReplaceServlet())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.wcm.core.impl.servlets.ReferenceSearchServlet", comDayCqWcmCoreImplServletsReferenceSearchServlet())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.wcm.core.impl.servlets.ThumbnailServlet", comDayCqWcmCoreImplServletsThumbnailServlet())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.wcm.core.impl.utils.DefaultPageNameValidator", comDayCqWcmCoreImplUtilsDefaultPageNameValidator())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.wcm.core.impl.variants.PageVariantsProviderImpl", comDayCqWcmCoreImplVariantsPageVariantsProviderImpl())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.wcm.core.impl.VersionManagerImpl", comDayCqWcmCoreImplVersionManagerImpl())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.wcm.core.impl.VersionPurgeTask", comDayCqWcmCoreImplVersionPurgeTask())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.wcm.core.impl.WCMDebugFilter", comDayCqWcmCoreImplWCMDebugFilter())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.wcm.core.impl.WCMDeveloperModeFilter", comDayCqWcmCoreImplWCMDeveloperModeFilter())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.wcm.core.impl.warp.TimeWarpFilter", comDayCqWcmCoreImplWarpTimeWarpFilter())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.wcm.core.mvt.MVTStatisticsImpl", comDayCqWcmCoreMvtMVTStatisticsImpl())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.wcm.core.stats.PageViewStatisticsImpl", comDayCqWcmCoreStatsPageViewStatisticsImpl())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.wcm.core.WCMRequestFilter", comDayCqWcmCoreWCMRequestFilter())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.wcm.designimporter.DesignPackageImporter", comDayCqWcmDesignimporterDesignPackageImporter())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.wcm.designimporter.impl.CanvasBuilderImpl", comDayCqWcmDesignimporterImplCanvasBuilderImpl())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.wcm.designimporter.impl.CanvasPageDeleteHandler", comDayCqWcmDesignimporterImplCanvasPageDeleteHandler())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.wcm.designimporter.impl.EntryPreprocessorImpl", comDayCqWcmDesignimporterImplEntryPreprocessorImpl())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.wcm.designimporter.impl.MobileCanvasBuilderImpl", comDayCqWcmDesignimporterImplMobileCanvasBuilderImpl())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.CanvasComponentTagHandlerFactory", comDayCqWcmDesignimporterParserTaghandlersFactoryCanvasCompone())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.DefaultComponentTagHandlerFactory", comDayCqWcmDesignimporterParserTaghandlersFactoryDefaultCompon())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.DefaultTagHandlerFactory", comDayCqWcmDesignimporterParserTaghandlersFactoryDefaultTagHan())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.HeadTagHandlerFactory", comDayCqWcmDesignimporterParserTaghandlersFactoryHeadTagHandle())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.IFrameTagHandlerFactory", comDayCqWcmDesignimporterParserTaghandlersFactoryIFrameTagHand())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.ImageComponentTagHandlerFactory", comDayCqWcmDesignimporterParserTaghandlersFactoryImageComponen())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.ImgTagHandlerFactory", comDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandler())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.InlineScriptTagHandlerFactory", comDayCqWcmDesignimporterParserTaghandlersFactoryInlineScriptT())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.LinkTagHandlerFactory", comDayCqWcmDesignimporterParserTaghandlersFactoryLinkTagHandle())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.MetaTagHandlerFactory", comDayCqWcmDesignimporterParserTaghandlersFactoryMetaTagHandle())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.NonScriptTagHandlerFactory", comDayCqWcmDesignimporterParserTaghandlersFactoryNonScriptTagH())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.ParsysComponentTagHandlerFactory", comDayCqWcmDesignimporterParserTaghandlersFactoryParsysCompone())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.ScriptTagHandlerFactory", comDayCqWcmDesignimporterParserTaghandlersFactoryScriptTagHand())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.StyleTagHandlerFactory", comDayCqWcmDesignimporterParserTaghandlersFactoryStyleTagHandl())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.TextComponentTagHandlerFactory", comDayCqWcmDesignimporterParserTaghandlersFactoryTextComponent())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.TitleComponentTagHandlerFactory", comDayCqWcmDesignimporterParserTaghandlersFactoryTitleComponen())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.TitleTagHandlerFactory", comDayCqWcmDesignimporterParserTaghandlersFactoryTitleTagHandl())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.wcm.foundation.forms.impl.FormChooserServlet", comDayCqWcmFoundationFormsImplFormChooserServlet())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.wcm.foundation.forms.impl.FormParagraphPostProcessor", comDayCqWcmFoundationFormsImplFormParagraphPostProcessor())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.wcm.foundation.forms.impl.FormsHandlingServlet", comDayCqWcmFoundationFormsImplFormsHandlingServlet())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.wcm.foundation.forms.impl.MailServlet", comDayCqWcmFoundationFormsImplMailServlet())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.wcm.foundation.impl.AdaptiveImageComponentServlet", comDayCqWcmFoundationImplAdaptiveImageComponentServlet())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.wcm.foundation.impl.HTTPAuthHandler", comDayCqWcmFoundationImplHTTPAuthHandler())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.wcm.foundation.impl.PageImpressionsTracker", comDayCqWcmFoundationImplPageImpressionsTracker())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.wcm.foundation.impl.PageRedirectServlet", comDayCqWcmFoundationImplPageRedirectServlet())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.wcm.foundation.security.impl.DefaultAttachmentTypeBlacklistService", comDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklist())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.wcm.foundation.security.impl.SaferSlingPostValidatorImpl", comDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImpl())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.wcm.mobile.core.impl.device.DeviceInfoTransformerFactory", comDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactory())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.wcm.mobile.core.impl.redirect.RedirectFilter", comDayCqWcmMobileCoreImplRedirectRedirectFilter())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.wcm.msm.impl.actions.ContentCopyActionFactory", comDayCqWcmMsmImplActionsContentCopyActionFactory())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.wcm.msm.impl.actions.ContentDeleteActionFactory", comDayCqWcmMsmImplActionsContentDeleteActionFactory())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.wcm.msm.impl.actions.ContentUpdateActionFactory", comDayCqWcmMsmImplActionsContentUpdateActionFactory())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.wcm.msm.impl.actions.OrderChildrenActionFactory", comDayCqWcmMsmImplActionsOrderChildrenActionFactory())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.wcm.msm.impl.actions.PageMoveActionFactory", comDayCqWcmMsmImplActionsPageMoveActionFactory())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.wcm.msm.impl.actions.ReferencesUpdateActionFactory", comDayCqWcmMsmImplActionsReferencesUpdateActionFactory())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.wcm.msm.impl.actions.VersionCopyActionFactory", comDayCqWcmMsmImplActionsVersionCopyActionFactory())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.wcm.msm.impl.LiveRelationshipManagerImpl", comDayCqWcmMsmImplLiveRelationshipManagerImpl())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.wcm.msm.impl.RolloutManagerImpl", comDayCqWcmMsmImplRolloutManagerImpl())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.wcm.msm.impl.servlets.AuditLogServlet", comDayCqWcmMsmImplServletsAuditLogServlet())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.wcm.notification.email.impl.EmailChannel", comDayCqWcmNotificationEmailImplEmailChannel())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.wcm.notification.impl.NotificationManagerImpl", comDayCqWcmNotificationImplNotificationManagerImpl())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.wcm.scripting.impl.BVPManager", comDayCqWcmScriptingImplBVPManager())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.wcm.undo.UndoConfig", comDayCqWcmUndoUndoConfig())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.wcm.webservicesupport.impl.ReplicationEventListener", comDayCqWcmWebservicesupportImplReplicationEventListener())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.wcm.workflow.impl.WcmWorkflowServiceImpl", comDayCqWcmWorkflowImplWcmWorkflowServiceImpl())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.wcm.workflow.impl.WorkflowPackageInfoProvider", comDayCqWcmWorkflowImplWorkflowPackageInfoProvider())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.widget.impl.HtmlLibraryManagerImpl", comDayCqWidgetImplHtmlLibraryManagerImpl())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.widget.impl.WidgetExtensionProviderImpl", comDayCqWidgetImplWidgetExtensionProviderImpl())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.workflow.impl.email.EMailNotificationService", comDayCqWorkflowImplEmailEMailNotificationService())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.cq.workflow.impl.email.TaskEMailNotificationService", comDayCqWorkflowImplEmailTaskEMailNotificationService())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.crx.security.token.impl.impl.TokenAuthenticationHandler", comDayCrxSecurityTokenImplImplTokenAuthenticationHandler())
            .add(Methods.POST, basePath + "/system/console/configMgr/com.day.crx.security.token.impl.TokenCleanupTask", comDayCrxSecurityTokenImplTokenCleanupTask())
            .add(Methods.POST, basePath + "/system/console/configMgr/Guide Localization Service", guideLocalizationService())
            .add(Methods.POST, basePath + "/system/console/configMgr/MessagingUserComponentFactory", messagingUserComponentFactory())
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.aries.jmx.framework.StateConfig", orgApacheAriesJmxFrameworkStateConfig())
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.felix.eventadmin.impl.EventAdmin", orgApacheFelixEventadminImplEventAdmin())
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.felix.http", orgApacheFelixHttp())
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.felix.http.sslfilter.SslFilter", orgApacheFelixHttpSslfilterSslFilter())
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.felix.jaas.Configuration.factory", orgApacheFelixJaasConfigurationFactory())
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.felix.jaas.ConfigurationSpi", orgApacheFelixJaasConfigurationSpi())
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.felix.scr.ScrService", orgApacheFelixScrScrService())
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.felix.systemready.impl.ComponentsCheck", orgApacheFelixSystemreadyImplComponentsCheck())
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.felix.systemready.impl.FrameworkStartCheck", orgApacheFelixSystemreadyImplFrameworkStartCheck())
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.felix.systemready.impl.ServicesCheck", orgApacheFelixSystemreadyImplServicesCheck())
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.felix.systemready.impl.servlet.SystemAliveServlet", orgApacheFelixSystemreadyImplServletSystemAliveServlet())
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.felix.systemready.impl.servlet.SystemReadyServlet", orgApacheFelixSystemreadyImplServletSystemReadyServlet())
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.felix.systemready.SystemReadyMonitor", orgApacheFelixSystemreadySystemReadyMonitor())
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.felix.webconsole.internal.servlet.OsgiManager", orgApacheFelixWebconsoleInternalServletOsgiManager())
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.felix.webconsole.plugins.event.internal.PluginServlet", orgApacheFelixWebconsolePluginsEventInternalPluginServlet())
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.felix.webconsole.plugins.memoryusage.internal.MemoryUsageConfigurator", orgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCo())
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.http.proxyconfigurator", orgApacheHttpProxyconfigurator())
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreTextProviderService", orgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProvider())
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.jackrabbit.oak.plugins.blob.datastore.FileDataStore", orgApacheJackrabbitOakPluginsBlobDatastoreFileDataStore())
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.jackrabbit.oak.plugins.document.DocumentNodeStoreService", orgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreService())
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.jackrabbit.oak.plugins.document.DocumentNodeStoreServicePreset", orgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePre())
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.jackrabbit.oak.plugins.document.secondary.SecondaryStoreCacheService", orgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCac())
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.jackrabbit.oak.plugins.index.AsyncIndexerService", orgApacheJackrabbitOakPluginsIndexAsyncIndexerService())
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.jackrabbit.oak.plugins.index.lucene.LuceneIndexProviderService", orgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServ())
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.jackrabbit.oak.plugins.index.solr.osgi.EmbeddedSolrServerConfigurationProvider", orgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCo())
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.jackrabbit.oak.plugins.index.solr.osgi.NodeStateSolrServersObserverService", orgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServers())
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.jackrabbit.oak.plugins.index.solr.osgi.OakSolrConfigurationProviderService", orgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfiguration())
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.jackrabbit.oak.plugins.index.solr.osgi.RemoteSolrServerConfigurationProvider", orgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConf())
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.jackrabbit.oak.plugins.index.solr.osgi.SolrQueryIndexProviderService", orgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvid())
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.jackrabbit.oak.plugins.index.solr.osgi.SolrServerProviderService", orgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSe())
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.jackrabbit.oak.plugins.metric.StatisticsProviderFactory", orgApacheJackrabbitOakPluginsMetricStatisticsProviderFactory())
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.jackrabbit.oak.plugins.observation.ChangeCollectorProvider", orgApacheJackrabbitOakPluginsObservationChangeCollectorProvider())
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.jackrabbit.oak.query.QueryEngineSettingsService", orgApacheJackrabbitOakQueryQueryEngineSettingsService())
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.jackrabbit.oak.security.authentication.AuthenticationConfigurationImpl", orgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfig())
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.jackrabbit.oak.security.authentication.ldap.impl.LdapIdentityProvider", orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdenti())
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.jackrabbit.oak.security.authentication.token.TokenConfigurationImpl", orgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfigura())
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.jackrabbit.oak.security.authorization.AuthorizationConfigurationImpl", orgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigur())
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.jackrabbit.oak.security.internal.SecurityProviderRegistration", orgApacheJackrabbitOakSecurityInternalSecurityProviderRegistrati())
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.jackrabbit.oak.security.user.RandomAuthorizableNodeName", orgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeName())
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.jackrabbit.oak.security.user.UserConfigurationImpl", orgApacheJackrabbitOakSecurityUserUserConfigurationImpl())
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.jackrabbit.oak.segment.azure.AzureSegmentStoreService", orgApacheJackrabbitOakSegmentAzureAzureSegmentStoreService())
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.jackrabbit.oak.segment.SegmentNodeStoreFactory", orgApacheJackrabbitOakSegmentSegmentNodeStoreFactory())
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.jackrabbit.oak.segment.SegmentNodeStoreMonitorService", orgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorService())
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.jackrabbit.oak.segment.SegmentNodeStoreService", orgApacheJackrabbitOakSegmentSegmentNodeStoreService())
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.jackrabbit.oak.segment.standby.store.StandbyStoreService", orgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreService())
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.jackrabbit.oak.spi.security.authentication.external.impl.DefaultSyncHandler", orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDe())
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.jackrabbit.oak.spi.security.authentication.external.impl.ExternalLoginModuleFactory", orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplEx())
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.jackrabbit.oak.spi.security.authentication.external.impl.principal.ExternalPrincipalConfiguration", orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPr())
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.jackrabbit.oak.spi.security.authorization.cug.impl.CugConfiguration", orgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfi())
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.jackrabbit.oak.spi.security.authorization.cug.impl.CugExcludeImpl", orgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExclu())
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.jackrabbit.oak.spi.security.user.action.DefaultAuthorizableActionProvider", orgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizable())
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.jackrabbit.vault.packaging.impl.PackagingImpl", orgApacheJackrabbitVaultPackagingImplPackagingImpl())
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.jackrabbit.vault.packaging.registry.impl.FSPackageRegistry", orgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistry())
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.auth.core.impl.LogoutServlet", orgApacheSlingAuthCoreImplLogoutServlet())
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.caconfig.impl.ConfigurationBindingsValueProvider", orgApacheSlingCaconfigImplConfigurationBindingsValueProvider())
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.caconfig.impl.ConfigurationResolverImpl", orgApacheSlingCaconfigImplConfigurationResolverImpl())
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.caconfig.impl.def.DefaultConfigurationInheritanceStrategy", orgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStra())
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.caconfig.impl.def.DefaultConfigurationPersistenceStrategy", orgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStra())
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.caconfig.impl.override.OsgiConfigurationOverrideProvider", orgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProvi())
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.caconfig.impl.override.SystemPropertyConfigurationOverrideProvider", orgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOve())
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.caconfig.management.impl.ConfigurationManagementSettingsImpl", orgApacheSlingCaconfigManagementImplConfigurationManagementSetti())
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.caconfig.resource.impl.def.DefaultConfigurationResourceResolvingStrategy", orgApacheSlingCaconfigResourceImplDefDefaultConfigurationResour())
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.caconfig.resource.impl.def.DefaultContextPathStrategy", orgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategy())
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.commons.html.internal.TagsoupHtmlParser", orgApacheSlingCommonsHtmlInternalTagsoupHtmlParser())
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.commons.log.LogManager", orgApacheSlingCommonsLogLogManager())
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.commons.log.LogManager.factory.config", orgApacheSlingCommonsLogLogManagerFactoryConfig())
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.commons.log.LogManager.factory.writer", orgApacheSlingCommonsLogLogManagerFactoryWriter())
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.commons.metrics.internal.LogReporter", orgApacheSlingCommonsMetricsInternalLogReporter())
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.commons.metrics.rrd4j.impl.CodahaleMetricsReporter", orgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporter())
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.commons.mime.internal.MimeTypeServiceImpl", orgApacheSlingCommonsMimeInternalMimeTypeServiceImpl())
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.commons.scheduler.impl.QuartzScheduler", orgApacheSlingCommonsSchedulerImplQuartzScheduler())
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.commons.scheduler.impl.SchedulerHealthCheck", orgApacheSlingCommonsSchedulerImplSchedulerHealthCheck())
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.commons.threads.impl.DefaultThreadPool.factory", orgApacheSlingCommonsThreadsImplDefaultThreadPoolFactory())
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.datasource.DataSourceFactory", orgApacheSlingDatasourceDataSourceFactory())
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.datasource.JNDIDataSourceFactory", orgApacheSlingDatasourceJNDIDataSourceFactory())
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.discovery.oak.Config", orgApacheSlingDiscoveryOakConfig())
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.discovery.oak.SynchronizedClocksHealthCheck", orgApacheSlingDiscoveryOakSynchronizedClocksHealthCheck())
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.distribution.agent.impl.ForwardDistributionAgentFactory", orgApacheSlingDistributionAgentImplForwardDistributionAgentFacto())
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.distribution.agent.impl.PrivilegeDistributionRequestAuthorizationStrategyFactory", orgApacheSlingDistributionAgentImplPrivilegeDistributionRequestA())
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.distribution.agent.impl.QueueDistributionAgentFactory", orgApacheSlingDistributionAgentImplQueueDistributionAgentFactory())
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.distribution.agent.impl.ReverseDistributionAgentFactory", orgApacheSlingDistributionAgentImplReverseDistributionAgentFacto())
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.distribution.agent.impl.SimpleDistributionAgentFactory", orgApacheSlingDistributionAgentImplSimpleDistributionAgentFactor())
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.distribution.agent.impl.SyncDistributionAgentFactory", orgApacheSlingDistributionAgentImplSyncDistributionAgentFactory())
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.distribution.monitor.DistributionQueueHealthCheck", orgApacheSlingDistributionMonitorDistributionQueueHealthCheck())
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.distribution.packaging.impl.exporter.AgentDistributionPackageExporterFactory", orgApacheSlingDistributionPackagingImplExporterAgentDistributio())
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.distribution.packaging.impl.exporter.LocalDistributionPackageExporterFactory", orgApacheSlingDistributionPackagingImplExporterLocalDistributio())
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.distribution.packaging.impl.exporter.RemoteDistributionPackageExporterFactory", orgApacheSlingDistributionPackagingImplExporterRemoteDistributi())
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.distribution.packaging.impl.importer.LocalDistributionPackageImporterFactory", orgApacheSlingDistributionPackagingImplImporterLocalDistributio())
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.distribution.packaging.impl.importer.RemoteDistributionPackageImporterFactory", orgApacheSlingDistributionPackagingImplImporterRemoteDistributi())
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.distribution.packaging.impl.importer.RepositoryDistributionPackageImporterFactory", orgApacheSlingDistributionPackagingImplImporterRepositoryDistri())
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.distribution.resources.impl.DistributionConfigurationResourceProviderFactory", orgApacheSlingDistributionResourcesImplDistributionConfiguration())
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.distribution.resources.impl.DistributionServiceResourceProviderFactory", orgApacheSlingDistributionResourcesImplDistributionServiceResour())
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.distribution.serialization.impl.DistributionPackageBuilderFactory", orgApacheSlingDistributionSerializationImplDistributionPackageBu())
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.distribution.serialization.impl.vlt.VaultDistributionPackageBuilderFactory", orgApacheSlingDistributionSerializationImplVltVaultDistribution())
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.distribution.transport.impl.UserCredentialsDistributionTransportSecretProvider", orgApacheSlingDistributionTransportImplUserCredentialsDistributi())
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.distribution.trigger.impl.DistributionEventDistributeDistributionTriggerFactory", orgApacheSlingDistributionTriggerImplDistributionEventDistribute())
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.distribution.trigger.impl.JcrEventDistributionTriggerFactory", orgApacheSlingDistributionTriggerImplJcrEventDistributionTrigger())
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.distribution.trigger.impl.PersistedJcrEventDistributionTriggerFactory", orgApacheSlingDistributionTriggerImplPersistedJcrEventDistributi())
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.distribution.trigger.impl.RemoteEventDistributionTriggerFactory", orgApacheSlingDistributionTriggerImplRemoteEventDistributionTrig())
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.distribution.trigger.impl.ResourceEventDistributionTriggerFactory", orgApacheSlingDistributionTriggerImplResourceEventDistributionTr())
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.distribution.trigger.impl.ScheduledDistributionTriggerFactory", orgApacheSlingDistributionTriggerImplScheduledDistributionTrigge())
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.engine.impl.auth.SlingAuthenticator", orgApacheSlingEngineImplAuthSlingAuthenticator())
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.engine.impl.debug.RequestProgressTrackerLogFilter", orgApacheSlingEngineImplDebugRequestProgressTrackerLogFilter())
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.engine.impl.log.RequestLogger", orgApacheSlingEngineImplLogRequestLogger())
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.engine.impl.log.RequestLoggerService", orgApacheSlingEngineImplLogRequestLoggerService())
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.engine.impl.SlingMainServlet", orgApacheSlingEngineImplSlingMainServlet())
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.engine.parameters", orgApacheSlingEngineParameters())
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.event.impl.EventingThreadPool", orgApacheSlingEventImplEventingThreadPool())
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.event.impl.jobs.DefaultJobManager", orgApacheSlingEventImplJobsDefaultJobManager())
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.event.impl.jobs.jcr.PersistenceHandler", orgApacheSlingEventImplJobsJcrPersistenceHandler())
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.event.impl.jobs.JobConsumerManager", orgApacheSlingEventImplJobsJobConsumerManager())
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.event.jobs.QueueConfiguration", orgApacheSlingEventJobsQueueConfiguration())
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.extensions.webconsolesecurityprovider.internal.SlingWebConsoleSecurityProvider", orgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingW())
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.featureflags.Feature", orgApacheSlingFeatureflagsFeature())
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.featureflags.impl.ConfiguredFeature", orgApacheSlingFeatureflagsImplConfiguredFeature())
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.hapi.impl.HApiUtilImpl", orgApacheSlingHapiImplHApiUtilImpl())
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.hc.core.impl.CompositeHealthCheck", orgApacheSlingHcCoreImplCompositeHealthCheck())
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.hc.core.impl.executor.HealthCheckExecutorImpl", orgApacheSlingHcCoreImplExecutorHealthCheckExecutorImpl())
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.hc.core.impl.JmxAttributeHealthCheck", orgApacheSlingHcCoreImplJmxAttributeHealthCheck())
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.hc.core.impl.ScriptableHealthCheck", orgApacheSlingHcCoreImplScriptableHealthCheck())
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.hc.core.impl.servlet.HealthCheckExecutorServlet", orgApacheSlingHcCoreImplServletHealthCheckExecutorServlet())
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.hc.core.impl.servlet.ResultTxtVerboseSerializer", orgApacheSlingHcCoreImplServletResultTxtVerboseSerializer())
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.i18n.impl.I18NFilter", orgApacheSlingI18nImplI18NFilter())
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.i18n.impl.JcrResourceBundleProvider", orgApacheSlingI18nImplJcrResourceBundleProvider())
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.installer.provider.jcr.impl.JcrInstaller", orgApacheSlingInstallerProviderJcrImplJcrInstaller())
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.jcr.base.internal.LoginAdminWhitelist", orgApacheSlingJcrBaseInternalLoginAdminWhitelist())
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.jcr.base.internal.LoginAdminWhitelist.fragment", orgApacheSlingJcrBaseInternalLoginAdminWhitelistFragment())
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.jcr.davex.impl.servlets.SlingDavExServlet", orgApacheSlingJcrDavexImplServletsSlingDavExServlet())
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.jcr.jackrabbit.server.JndiRegistrationSupport", orgApacheSlingJcrJackrabbitServerJndiRegistrationSupport())
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.jcr.jackrabbit.server.RmiRegistrationSupport", orgApacheSlingJcrJackrabbitServerRmiRegistrationSupport())
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.jcr.repoinit.impl.RepositoryInitializer", orgApacheSlingJcrRepoinitImplRepositoryInitializer())
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.jcr.repoinit.RepositoryInitializer", orgApacheSlingJcrRepoinitRepositoryInitializer())
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.jcr.resource.internal.JcrResourceResolverFactoryImpl", orgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImpl())
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.jcr.resource.internal.JcrSystemUserValidator", orgApacheSlingJcrResourceInternalJcrSystemUserValidator())
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.jcr.resourcesecurity.impl.ResourceAccessGateFactory", orgApacheSlingJcrResourcesecurityImplResourceAccessGateFactory())
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.jcr.webdav.impl.handler.DefaultHandlerService", orgApacheSlingJcrWebdavImplHandlerDefaultHandlerService())
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.jcr.webdav.impl.handler.DirListingExportHandlerService", orgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServic())
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.jcr.webdav.impl.servlets.SimpleWebDavServlet", orgApacheSlingJcrWebdavImplServletsSimpleWebDavServlet())
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.jmx.provider.impl.JMXResourceProvider", orgApacheSlingJmxProviderImplJMXResourceProvider())
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.models.impl.ModelAdapterFactory", orgApacheSlingModelsImplModelAdapterFactory())
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.models.jacksonexporter.impl.ResourceModuleProvider", orgApacheSlingModelsJacksonexporterImplResourceModuleProvider())
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.resource.inventory.impl.ResourceInventoryPrinterFactory", orgApacheSlingResourceInventoryImplResourceInventoryPrinterFacto())
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.resourcemerger.impl.MergedResourceProviderFactory", orgApacheSlingResourcemergerImplMergedResourceProviderFactory())
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.resourcemerger.picker.overriding", orgApacheSlingResourcemergerPickerOverriding())
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.scripting.core.impl.ScriptCacheImpl", orgApacheSlingScriptingCoreImplScriptCacheImpl())
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.scripting.core.impl.ScriptingResourceResolverProviderImpl", orgApacheSlingScriptingCoreImplScriptingResourceResolverProvider())
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.scripting.java.impl.JavaScriptEngineFactory", orgApacheSlingScriptingJavaImplJavaScriptEngineFactory())
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.scripting.javascript.internal.RhinoJavaScriptEngineFactory", orgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFa())
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.scripting.jsp.JspScriptEngineFactory", orgApacheSlingScriptingJspJspScriptEngineFactory())
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.scripting.sightly.js.impl.jsapi.SlyBindingsValuesProvider", orgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProv())
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.security.impl.ContentDispositionFilter", orgApacheSlingSecurityImplContentDispositionFilter())
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.security.impl.ReferrerFilter", orgApacheSlingSecurityImplReferrerFilter())
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.serviceusermapping.impl.ServiceUserMapperImpl", orgApacheSlingServiceusermappingImplServiceUserMapperImpl())
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.serviceusermapping.impl.ServiceUserMapperImpl.amended", orgApacheSlingServiceusermappingImplServiceUserMapperImplAmended())
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.servlets.get.DefaultGetServlet", orgApacheSlingServletsGetDefaultGetServlet())
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.servlets.get.impl.version.VersionInfoServlet", orgApacheSlingServletsGetImplVersionVersionInfoServlet())
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.servlets.post.impl.helper.ChunkCleanUpTask", orgApacheSlingServletsPostImplHelperChunkCleanUpTask())
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.servlets.post.impl.SlingPostServlet", orgApacheSlingServletsPostImplSlingPostServlet())
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.servlets.resolver.SlingServletResolver", orgApacheSlingServletsResolverSlingServletResolver())
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.settings.impl.SlingSettingsServiceImpl", orgApacheSlingSettingsImplSlingSettingsServiceImpl())
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.startupfilter.impl.StartupFilterImpl", orgApacheSlingStartupfilterImplStartupFilterImpl())
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.tenant.internal.TenantProviderImpl", orgApacheSlingTenantInternalTenantProviderImpl())
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.tracer.internal.LogTracer", orgApacheSlingTracerInternalLogTracer())
            .add(Methods.POST, basePath + "/system/console/configMgr/org.apache.sling.xss.impl.XSSFilterImpl", orgApacheSlingXssImplXSSFilterImpl())
            ;
    }
}
