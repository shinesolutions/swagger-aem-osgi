using System.IO;
using System.Net;
using System.Threading.Tasks;
using System.ComponentModel.DataAnnotations;
using Microsoft.AspNetCore.Http;
using Microsoft.AspNetCore.Mvc;
using Microsoft.Azure.WebJobs;
using Microsoft.Azure.WebJobs.Extensions.Http;
using Microsoft.Azure.WebJobs.Extensions.OpenApi.Core.Attributes;
using Microsoft.Azure.WebJobs.Extensions.OpenApi.Core.Enums;
using Microsoft.Extensions.Logging;
using Microsoft.OpenApi.Models;
using Newtonsoft.Json;
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Functions
{ 
    public partial class ConfigmgrApi
    { 
        [FunctionName("ConfigmgrApi_AdaptiveFormAndInteractiveCommunicationWebChannelConfiguration")]
        public async Task<ActionResult<AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationInfo>> _AdaptiveFormAndInteractiveCommunicationWebChannelConfiguration([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/Adaptive Form and Interactive Communication Web Channel Configuration")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("AdaptiveFormAndInteractiveCommunicationWebChannelConfiguration");
            return method != null
                ? (await ((Task<AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigur")]
        public async Task<ActionResult<AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurInfo>> _AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigur([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/Adaptive Form and Interactive Communication Web Channel Theme Configuration")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigur");
            return method != null
                ? (await ((Task<AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_AnalyticsComponentQueryCacheService")]
        public async Task<ActionResult<AnalyticsComponentQueryCacheServiceInfo>> _AnalyticsComponentQueryCacheService([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/Analytics Component Query Cache Service")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("AnalyticsComponentQueryCacheService");
            return method != null
                ? (await ((Task<AnalyticsComponentQueryCacheServiceInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ApacheSlingHealthCheckResultHTMLSerializer")]
        public async Task<ActionResult<ApacheSlingHealthCheckResultHTMLSerializerInfo>> _ApacheSlingHealthCheckResultHTMLSerializer([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/Apache Sling Health Check Result HTML Serializer")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ApacheSlingHealthCheckResultHTMLSerializer");
            return method != null
                ? (await ((Task<ApacheSlingHealthCheckResultHTMLSerializerInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfiguration")]
        public async Task<ActionResult<ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationInfo>> _ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfiguration([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.aem.formsndocuments.config.AEMFormsManagerConfiguration")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfiguration");
            return method != null
                ? (await ((Task<ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeAemTransactionCoreImplTransactionRecorder")]
        public async Task<ActionResult<ComAdobeAemTransactionCoreImplTransactionRecorderInfo>> _ComAdobeAemTransactionCoreImplTransactionRecorder([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.aem.transaction.core.impl.TransactionRecorder")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeAemTransactionCoreImplTransactionRecorder");
            return method != null
                ? (await ((Task<ComAdobeAemTransactionCoreImplTransactionRecorderInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHC")]
        public async Task<ActionResult<ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCInfo>> _ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHC([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.aem.upgrade.prechecks.hc.impl.DeprecateIndexesHC")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHC");
            return method != null
                ? (await ((Task<ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHC")]
        public async Task<ActionResult<ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCInfo>> _ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHC([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.aem.upgrade.prechecks.hc.impl.ReplicationAgentsDisabledHC")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHC");
            return method != null
                ? (await ((Task<ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImpl")]
        public async Task<ActionResult<ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplInfo>> _ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImpl([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.aem.upgrade.prechecks.mbean.impl.PreUpgradeTasksMBeanImpl")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImpl");
            return method != null
                ? (await ((Task<ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImpl")]
        public async Task<ActionResult<ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplInfo>> _ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImpl([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.aem.upgrade.prechecks.tasks.impl.ConsistencyCheckTaskImpl")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImpl");
            return method != null
                ? (await ((Task<ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeCqAccountApiAccountManagementService")]
        public async Task<ActionResult<ComAdobeCqAccountApiAccountManagementServiceInfo>> _ComAdobeCqAccountApiAccountManagementService([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.cq.account.api.AccountManagementService")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeCqAccountApiAccountManagementService");
            return method != null
                ? (await ((Task<ComAdobeCqAccountApiAccountManagementServiceInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeCqAccountImplAccountManagementServlet")]
        public async Task<ActionResult<ComAdobeCqAccountImplAccountManagementServletInfo>> _ComAdobeCqAccountImplAccountManagementServlet([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.cq.account.impl.AccountManagementServlet")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeCqAccountImplAccountManagementServlet");
            return method != null
                ? (await ((Task<ComAdobeCqAccountImplAccountManagementServletInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeCqAddressImplLocationLocationListServlet")]
        public async Task<ActionResult<ComAdobeCqAddressImplLocationLocationListServletInfo>> _ComAdobeCqAddressImplLocationLocationListServlet([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.cq.address.impl.location.LocationListServlet")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeCqAddressImplLocationLocationListServlet");
            return method != null
                ? (await ((Task<ComAdobeCqAddressImplLocationLocationListServletInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeCqAuditPurgeDam")]
        public async Task<ActionResult<ComAdobeCqAuditPurgeDamInfo>> _ComAdobeCqAuditPurgeDam([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.cq.audit.purge.Dam")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeCqAuditPurgeDam");
            return method != null
                ? (await ((Task<ComAdobeCqAuditPurgeDamInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeCqAuditPurgePages")]
        public async Task<ActionResult<ComAdobeCqAuditPurgePagesInfo>> _ComAdobeCqAuditPurgePages([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.cq.audit.purge.Pages")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeCqAuditPurgePages");
            return method != null
                ? (await ((Task<ComAdobeCqAuditPurgePagesInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeCqAuditPurgeReplication")]
        public async Task<ActionResult<ComAdobeCqAuditPurgeReplicationInfo>> _ComAdobeCqAuditPurgeReplication([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.cq.audit.purge.Replication")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeCqAuditPurgeReplication");
            return method != null
                ? (await ((Task<ComAdobeCqAuditPurgeReplicationInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeCqCdnRewriterImplAWSCloudFrontRewriter")]
        public async Task<ActionResult<ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterInfo>> _ComAdobeCqCdnRewriterImplAWSCloudFrontRewriter([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.cq.cdn.rewriter.impl.AWSCloudFrontRewriter")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeCqCdnRewriterImplAWSCloudFrontRewriter");
            return method != null
                ? (await ((Task<ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeCqCdnRewriterImplCDNConfigServiceImpl")]
        public async Task<ActionResult<ComAdobeCqCdnRewriterImplCDNConfigServiceImplInfo>> _ComAdobeCqCdnRewriterImplCDNConfigServiceImpl([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.cq.cdn.rewriter.impl.CDNConfigServiceImpl")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeCqCdnRewriterImplCDNConfigServiceImpl");
            return method != null
                ? (await ((Task<ComAdobeCqCdnRewriterImplCDNConfigServiceImplInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeCqCdnRewriterImplCDNRewriter")]
        public async Task<ActionResult<ComAdobeCqCdnRewriterImplCDNRewriterInfo>> _ComAdobeCqCdnRewriterImplCDNRewriter([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.cq.cdn.rewriter.impl.CDNRewriter")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeCqCdnRewriterImplCDNRewriter");
            return method != null
                ? (await ((Task<ComAdobeCqCdnRewriterImplCDNRewriterInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandle")]
        public async Task<ActionResult<ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleInfo>> _ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandle([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.cq.cloudconfig.core.impl.ConfigurationReplicationEventHandler")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandle");
            return method != null
                ? (await ((Task<ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeCqCommerceImplAssetDynamicImageHandler")]
        public async Task<ActionResult<ComAdobeCqCommerceImplAssetDynamicImageHandlerInfo>> _ComAdobeCqCommerceImplAssetDynamicImageHandler([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.cq.commerce.impl.asset.DynamicImageHandler")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeCqCommerceImplAssetDynamicImageHandler");
            return method != null
                ? (await ((Task<ComAdobeCqCommerceImplAssetDynamicImageHandlerInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImpl")]
        public async Task<ActionResult<ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplInfo>> _ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImpl([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.cq.commerce.impl.asset.ProductAssetHandlerProviderImpl")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImpl");
            return method != null
                ? (await ((Task<ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeCqCommerceImplAssetStaticImageHandler")]
        public async Task<ActionResult<ComAdobeCqCommerceImplAssetStaticImageHandlerInfo>> _ComAdobeCqCommerceImplAssetStaticImageHandler([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.cq.commerce.impl.asset.StaticImageHandler")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeCqCommerceImplAssetStaticImageHandler");
            return method != null
                ? (await ((Task<ComAdobeCqCommerceImplAssetStaticImageHandlerInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeCqCommerceImplAssetVideoHandler")]
        public async Task<ActionResult<ComAdobeCqCommerceImplAssetVideoHandlerInfo>> _ComAdobeCqCommerceImplAssetVideoHandler([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.cq.commerce.impl.asset.VideoHandler")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeCqCommerceImplAssetVideoHandler");
            return method != null
                ? (await ((Task<ComAdobeCqCommerceImplAssetVideoHandlerInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeCqCommerceImplPromotionPromotionManagerImpl")]
        public async Task<ActionResult<ComAdobeCqCommerceImplPromotionPromotionManagerImplInfo>> _ComAdobeCqCommerceImplPromotionPromotionManagerImpl([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.cq.commerce.impl.promotion.PromotionManagerImpl")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeCqCommerceImplPromotionPromotionManagerImpl");
            return method != null
                ? (await ((Task<ComAdobeCqCommerceImplPromotionPromotionManagerImplInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImpl")]
        public async Task<ActionResult<ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplInfo>> _ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImpl([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.cq.commerce.pim.impl.cataloggenerator.CatalogGeneratorImpl")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImpl");
            return method != null
                ? (await ((Task<ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeCqCommercePimImplPageEventListener")]
        public async Task<ActionResult<ComAdobeCqCommercePimImplPageEventListenerInfo>> _ComAdobeCqCommercePimImplPageEventListener([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.cq.commerce.pim.impl.PageEventListener")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeCqCommercePimImplPageEventListener");
            return method != null
                ? (await ((Task<ComAdobeCqCommercePimImplPageEventListenerInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeCqCommercePimImplProductfeedProductFeedServiceImpl")]
        public async Task<ActionResult<ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplInfo>> _ComAdobeCqCommercePimImplProductfeedProductFeedServiceImpl([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.cq.commerce.pim.impl.productfeed.ProductFeedServiceImpl")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeCqCommercePimImplProductfeedProductFeedServiceImpl");
            return method != null
                ? (await ((Task<ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeCqContentinsightImplReportingServicesSettingsProvider")]
        public async Task<ActionResult<ComAdobeCqContentinsightImplReportingServicesSettingsProviderInfo>> _ComAdobeCqContentinsightImplReportingServicesSettingsProvider([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.cq.contentinsight.impl.ReportingServicesSettingsProvider")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeCqContentinsightImplReportingServicesSettingsProvider");
            return method != null
                ? (await ((Task<ComAdobeCqContentinsightImplReportingServicesSettingsProviderInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeCqContentinsightImplServletsBrightEdgeProxyServlet")]
        public async Task<ActionResult<ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletInfo>> _ComAdobeCqContentinsightImplServletsBrightEdgeProxyServlet([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.cq.contentinsight.impl.servlets.BrightEdgeProxyServlet")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeCqContentinsightImplServletsBrightEdgeProxyServlet");
            return method != null
                ? (await ((Task<ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeCqContentinsightImplServletsReportingServicesProxyServle")]
        public async Task<ActionResult<ComAdobeCqContentinsightImplServletsReportingServicesProxyServleInfo>> _ComAdobeCqContentinsightImplServletsReportingServicesProxyServle([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.cq.contentinsight.impl.servlets.ReportingServicesProxyServlet")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeCqContentinsightImplServletsReportingServicesProxyServle");
            return method != null
                ? (await ((Task<ComAdobeCqContentinsightImplServletsReportingServicesProxyServleInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeCqDamCfmImplComponentComponentConfigImpl")]
        public async Task<ActionResult<ComAdobeCqDamCfmImplComponentComponentConfigImplInfo>> _ComAdobeCqDamCfmImplComponentComponentConfigImpl([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.cq.dam.cfm.impl.component.ComponentConfigImpl")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeCqDamCfmImplComponentComponentConfigImpl");
            return method != null
                ? (await ((Task<ComAdobeCqDamCfmImplComponentComponentConfigImplInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeCqDamCfmImplConfFeatureConfigImpl")]
        public async Task<ActionResult<ComAdobeCqDamCfmImplConfFeatureConfigImplInfo>> _ComAdobeCqDamCfmImplConfFeatureConfigImpl([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.cq.dam.cfm.impl.conf.FeatureConfigImpl")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeCqDamCfmImplConfFeatureConfigImpl");
            return method != null
                ? (await ((Task<ComAdobeCqDamCfmImplConfFeatureConfigImplInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeCqDamCfmImplContentRewriterAssetProcessor")]
        public async Task<ActionResult<ComAdobeCqDamCfmImplContentRewriterAssetProcessorInfo>> _ComAdobeCqDamCfmImplContentRewriterAssetProcessor([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.cq.dam.cfm.impl.content.rewriter.AssetProcessor")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeCqDamCfmImplContentRewriterAssetProcessor");
            return method != null
                ? (await ((Task<ComAdobeCqDamCfmImplContentRewriterAssetProcessorInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeCqDamCfmImplContentRewriterParRangeFilter")]
        public async Task<ActionResult<ComAdobeCqDamCfmImplContentRewriterParRangeFilterInfo>> _ComAdobeCqDamCfmImplContentRewriterParRangeFilter([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.cq.dam.cfm.impl.content.rewriter.ParRangeFilter")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeCqDamCfmImplContentRewriterParRangeFilter");
            return method != null
                ? (await ((Task<ComAdobeCqDamCfmImplContentRewriterParRangeFilterInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeCqDamCfmImplContentRewriterPayloadFilter")]
        public async Task<ActionResult<ComAdobeCqDamCfmImplContentRewriterPayloadFilterInfo>> _ComAdobeCqDamCfmImplContentRewriterPayloadFilter([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.cq.dam.cfm.impl.content.rewriter.PayloadFilter")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeCqDamCfmImplContentRewriterPayloadFilter");
            return method != null
                ? (await ((Task<ComAdobeCqDamCfmImplContentRewriterPayloadFilterInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeCqDamDmProcessImagePTiffManagerImpl")]
        public async Task<ActionResult<ComAdobeCqDamDmProcessImagePTiffManagerImplInfo>> _ComAdobeCqDamDmProcessImagePTiffManagerImpl([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.cq.dam.dm.process.image.PTiffManagerImpl")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeCqDamDmProcessImagePTiffManagerImpl");
            return method != null
                ? (await ((Task<ComAdobeCqDamDmProcessImagePTiffManagerImplInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorker")]
        public async Task<ActionResult<ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerInfo>> _ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorker([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.cq.dam.ips.impl.replication.trigger.ReplicateOnModifyWorker")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorker");
            return method != null
                ? (await ((Task<ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeCqDamMacSyncHelperImplMACSyncClientImpl")]
        public async Task<ActionResult<ComAdobeCqDamMacSyncHelperImplMACSyncClientImplInfo>> _ComAdobeCqDamMacSyncHelperImplMACSyncClientImpl([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.cq.dam.mac.sync.helper.impl.MACSyncClientImpl")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeCqDamMacSyncHelperImplMACSyncClientImpl");
            return method != null
                ? (await ((Task<ComAdobeCqDamMacSyncHelperImplMACSyncClientImplInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeCqDamMacSyncImplDAMSyncServiceImpl")]
        public async Task<ActionResult<ComAdobeCqDamMacSyncImplDAMSyncServiceImplInfo>> _ComAdobeCqDamMacSyncImplDAMSyncServiceImpl([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.cq.dam.mac.sync.impl.DAMSyncServiceImpl")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeCqDamMacSyncImplDAMSyncServiceImpl");
            return method != null
                ? (await ((Task<ComAdobeCqDamMacSyncImplDAMSyncServiceImplInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeCqDamProcessorNuiImplNuiAssetProcessor")]
        public async Task<ActionResult<ComAdobeCqDamProcessorNuiImplNuiAssetProcessorInfo>> _ComAdobeCqDamProcessorNuiImplNuiAssetProcessor([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.cq.dam.processor.nui.impl.NuiAssetProcessor")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeCqDamProcessorNuiImplNuiAssetProcessor");
            return method != null
                ? (await ((Task<ComAdobeCqDamProcessorNuiImplNuiAssetProcessorInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeCqDamS7imagingImplIsImageServerComponent")]
        public async Task<ActionResult<ComAdobeCqDamS7imagingImplIsImageServerComponentInfo>> _ComAdobeCqDamS7imagingImplIsImageServerComponent([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.cq.dam.s7imaging.impl.is.ImageServerComponent")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeCqDamS7imagingImplIsImageServerComponent");
            return method != null
                ? (await ((Task<ComAdobeCqDamS7imagingImplIsImageServerComponentInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeCqDamS7imagingImplPsPlatformServerServlet")]
        public async Task<ActionResult<ComAdobeCqDamS7imagingImplPsPlatformServerServletInfo>> _ComAdobeCqDamS7imagingImplPsPlatformServerServlet([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.cq.dam.s7imaging.impl.ps.PlatformServerServlet")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeCqDamS7imagingImplPsPlatformServerServlet");
            return method != null
                ? (await ((Task<ComAdobeCqDamS7imagingImplPsPlatformServerServletInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeCqDamWebdavImplIoAssetIOHandler")]
        public async Task<ActionResult<ComAdobeCqDamWebdavImplIoAssetIOHandlerInfo>> _ComAdobeCqDamWebdavImplIoAssetIOHandler([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.cq.dam.webdav.impl.io.AssetIOHandler")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeCqDamWebdavImplIoAssetIOHandler");
            return method != null
                ? (await ((Task<ComAdobeCqDamWebdavImplIoAssetIOHandlerInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJob")]
        public async Task<ActionResult<ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobInfo>> _ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJob([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.cq.dam.webdav.impl.io.DamWebdavVersionLinkingJob")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJob");
            return method != null
                ? (await ((Task<ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeCqDamWebdavImplIoSpecialFilesHandler")]
        public async Task<ActionResult<ComAdobeCqDamWebdavImplIoSpecialFilesHandlerInfo>> _ComAdobeCqDamWebdavImplIoSpecialFilesHandler([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.cq.dam.webdav.impl.io.SpecialFilesHandler")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeCqDamWebdavImplIoSpecialFilesHandler");
            return method != null
                ? (await ((Task<ComAdobeCqDamWebdavImplIoSpecialFilesHandlerInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeCqDeserfwImplDeserializationFirewallImpl")]
        public async Task<ActionResult<ComAdobeCqDeserfwImplDeserializationFirewallImplInfo>> _ComAdobeCqDeserfwImplDeserializationFirewallImpl([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.cq.deserfw.impl.DeserializationFirewallImpl")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeCqDeserfwImplDeserializationFirewallImpl");
            return method != null
                ? (await ((Task<ComAdobeCqDeserfwImplDeserializationFirewallImplInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeCqDtmImplServiceDTMWebServiceImpl")]
        public async Task<ActionResult<ComAdobeCqDtmImplServiceDTMWebServiceImplInfo>> _ComAdobeCqDtmImplServiceDTMWebServiceImpl([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.cq.dtm.impl.service.DTMWebServiceImpl")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeCqDtmImplServiceDTMWebServiceImpl");
            return method != null
                ? (await ((Task<ComAdobeCqDtmImplServiceDTMWebServiceImplInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeCqDtmImplServletsDTMDeployHookServlet")]
        public async Task<ActionResult<ComAdobeCqDtmImplServletsDTMDeployHookServletInfo>> _ComAdobeCqDtmImplServletsDTMDeployHookServlet([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.cq.dtm.impl.servlets.DTMDeployHookServlet")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeCqDtmImplServletsDTMDeployHookServlet");
            return method != null
                ? (await ((Task<ComAdobeCqDtmImplServletsDTMDeployHookServletInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeCqDtmReactorImplServiceWebServiceImpl")]
        public async Task<ActionResult<ComAdobeCqDtmReactorImplServiceWebServiceImplInfo>> _ComAdobeCqDtmReactorImplServiceWebServiceImpl([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.cq.dtm.reactor.impl.service.WebServiceImpl")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeCqDtmReactorImplServiceWebServiceImpl");
            return method != null
                ? (await ((Task<ComAdobeCqDtmReactorImplServiceWebServiceImplInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeCqExperiencelogImplExperienceLogConfigServlet")]
        public async Task<ActionResult<ComAdobeCqExperiencelogImplExperienceLogConfigServletInfo>> _ComAdobeCqExperiencelogImplExperienceLogConfigServlet([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.cq.experiencelog.impl.ExperienceLogConfigServlet")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeCqExperiencelogImplExperienceLogConfigServlet");
            return method != null
                ? (await ((Task<ComAdobeCqExperiencelogImplExperienceLogConfigServletInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeCqHcContentPackagesHealthCheck")]
        public async Task<ActionResult<ComAdobeCqHcContentPackagesHealthCheckInfo>> _ComAdobeCqHcContentPackagesHealthCheck([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.cq.hc.ContentPackagesHealthCheck")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeCqHcContentPackagesHealthCheck");
            return method != null
                ? (await ((Task<ComAdobeCqHcContentPackagesHealthCheckInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeCqHistoryImplHistoryRequestFilter")]
        public async Task<ActionResult<ComAdobeCqHistoryImplHistoryRequestFilterInfo>> _ComAdobeCqHistoryImplHistoryRequestFilter([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.cq.history.impl.HistoryRequestFilter")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeCqHistoryImplHistoryRequestFilter");
            return method != null
                ? (await ((Task<ComAdobeCqHistoryImplHistoryRequestFilterInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeCqHistoryImplHistoryServiceImpl")]
        public async Task<ActionResult<ComAdobeCqHistoryImplHistoryServiceImplInfo>> _ComAdobeCqHistoryImplHistoryServiceImpl([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.cq.history.impl.HistoryServiceImpl")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeCqHistoryImplHistoryServiceImpl");
            return method != null
                ? (await ((Task<ComAdobeCqHistoryImplHistoryServiceImplInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeCqInboxImplTypeproviderItemTypeProvider")]
        public async Task<ActionResult<ComAdobeCqInboxImplTypeproviderItemTypeProviderInfo>> _ComAdobeCqInboxImplTypeproviderItemTypeProvider([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.cq.inbox.impl.typeprovider.ItemTypeProvider")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeCqInboxImplTypeproviderItemTypeProvider");
            return method != null
                ? (await ((Task<ComAdobeCqInboxImplTypeproviderItemTypeProviderInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeCqProjectsImplServletProjectImageServlet")]
        public async Task<ActionResult<ComAdobeCqProjectsImplServletProjectImageServletInfo>> _ComAdobeCqProjectsImplServletProjectImageServlet([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.cq.projects.impl.servlet.ProjectImageServlet")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeCqProjectsImplServletProjectImageServlet");
            return method != null
                ? (await ((Task<ComAdobeCqProjectsImplServletProjectImageServletInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeCqProjectsPurgeScheduler")]
        public async Task<ActionResult<ComAdobeCqProjectsPurgeSchedulerInfo>> _ComAdobeCqProjectsPurgeScheduler([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.cq.projects.purge.Scheduler")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeCqProjectsPurgeScheduler");
            return method != null
                ? (await ((Task<ComAdobeCqProjectsPurgeSchedulerInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeCqScheduledExporterImplScheduledExporterImpl")]
        public async Task<ActionResult<ComAdobeCqScheduledExporterImplScheduledExporterImplInfo>> _ComAdobeCqScheduledExporterImplScheduledExporterImpl([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.cq.scheduled.exporter.impl.ScheduledExporterImpl")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeCqScheduledExporterImplScheduledExporterImpl");
            return method != null
                ? (await ((Task<ComAdobeCqScheduledExporterImplScheduledExporterImplInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImpl")]
        public async Task<ActionResult<ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplInfo>> _ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImpl([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.cq.screens.analytics.impl.ScreensAnalyticsServiceImpl")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImpl");
            return method != null
                ? (await ((Task<ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeCqScreensDeviceImplDeviceService")]
        public async Task<ActionResult<ComAdobeCqScreensDeviceImplDeviceServiceInfo>> _ComAdobeCqScreensDeviceImplDeviceService([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.cq.screens.device.impl.DeviceService")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeCqScreensDeviceImplDeviceService");
            return method != null
                ? (await ((Task<ComAdobeCqScreensDeviceImplDeviceServiceInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImpl")]
        public async Task<ActionResult<ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplInfo>> _ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImpl([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.cq.screens.device.registration.impl.RegistrationServiceImpl")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImpl");
            return method != null
                ? (await ((Task<ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeCqScreensImplHandlerChannelsUpdateHandler")]
        public async Task<ActionResult<ComAdobeCqScreensImplHandlerChannelsUpdateHandlerInfo>> _ComAdobeCqScreensImplHandlerChannelsUpdateHandler([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.cq.screens.impl.handler.ChannelsUpdateHandler")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeCqScreensImplHandlerChannelsUpdateHandler");
            return method != null
                ? (await ((Task<ComAdobeCqScreensImplHandlerChannelsUpdateHandlerInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJob")]
        public async Task<ActionResult<ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobInfo>> _ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJob([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.cq.screens.impl.jobs.DistributedDevicesStatiUpdateJob")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJob");
            return method != null
                ? (await ((Task<ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeCqScreensImplRemoteImplDistributedHttpClientImpl")]
        public async Task<ActionResult<ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplInfo>> _ComAdobeCqScreensImplRemoteImplDistributedHttpClientImpl([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.cq.screens.impl.remote.impl.DistributedHttpClientImpl")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeCqScreensImplRemoteImplDistributedHttpClientImpl");
            return method != null
                ? (await ((Task<ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeCqScreensImplScreensChannelPostProcessor")]
        public async Task<ActionResult<ComAdobeCqScreensImplScreensChannelPostProcessorInfo>> _ComAdobeCqScreensImplScreensChannelPostProcessor([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.cq.screens.impl.ScreensChannelPostProcessor")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeCqScreensImplScreensChannelPostProcessor");
            return method != null
                ? (await ((Task<ComAdobeCqScreensImplScreensChannelPostProcessorInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImpl")]
        public async Task<ActionResult<ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplInfo>> _ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImpl([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImpl");
            return method != null
                ? (await ((Task<ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeCqScreensMqActivemqImplArtemisJMSProvider")]
        public async Task<ActionResult<ComAdobeCqScreensMqActivemqImplArtemisJMSProviderInfo>> _ComAdobeCqScreensMqActivemqImplArtemisJMSProvider([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.cq.screens.mq.activemq.impl.ArtemisJMSProvider")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeCqScreensMqActivemqImplArtemisJMSProvider");
            return method != null
                ? (await ((Task<ComAdobeCqScreensMqActivemqImplArtemisJMSProviderInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImpl")]
        public async Task<ActionResult<ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplInfo>> _ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImpl([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.cq.screens.offlinecontent.impl.BulkOfflineUpdateServiceImpl")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImpl");
            return method != null
                ? (await ((Task<ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImpl")]
        public async Task<ActionResult<ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplInfo>> _ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImpl([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.cq.screens.offlinecontent.impl.OfflineContentServiceImpl")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImpl");
            return method != null
                ? (await ((Task<ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeCqScreensSegmentationImplSegmentationFeatureFlag")]
        public async Task<ActionResult<ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagInfo>> _ComAdobeCqScreensSegmentationImplSegmentationFeatureFlag([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.cq.screens.segmentation.impl.SegmentationFeatureFlag")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeCqScreensSegmentationImplSegmentationFeatureFlag");
            return method != null
                ? (await ((Task<ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthCh")]
        public async Task<ActionResult<ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChInfo>> _ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthCh([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.cq.security.hc.bundles.impl.HtmlLibraryManagerConfigHealthCheck")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthCh");
            return method != null
                ? (await ((Task<ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheck")]
        public async Task<ActionResult<ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckInfo>> _ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheck([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.cq.security.hc.bundles.impl.WcmFilterHealthCheck")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheck");
            return method != null
                ? (await ((Task<ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheck")]
        public async Task<ActionResult<ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckInfo>> _ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheck([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.cq.security.hc.dispatcher.impl.DispatcherAccessHealthCheck")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheck");
            return method != null
                ? (await ((Task<ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheck")]
        public async Task<ActionResult<ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckInfo>> _ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheck([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.cq.security.hc.packages.impl.ExampleContentHealthCheck")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheck");
            return method != null
                ? (await ((Task<ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheck")]
        public async Task<ActionResult<ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckInfo>> _ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheck([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.cq.security.hc.webserver.impl.ClickjackingHealthCheck")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheck");
            return method != null
                ? (await ((Task<ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeCqSocialAccountverificationImplAccountManagementConfigIm")]
        public async Task<ActionResult<ComAdobeCqSocialAccountverificationImplAccountManagementConfigImInfo>> _ComAdobeCqSocialAccountverificationImplAccountManagementConfigIm([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.cq.social.accountverification.impl.AccountManagementConfigImpl")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeCqSocialAccountverificationImplAccountManagementConfigIm");
            return method != null
                ? (await ((Task<ComAdobeCqSocialAccountverificationImplAccountManagementConfigImInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponen")]
        public async Task<ActionResult<ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenInfo>> _ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponen([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.cq.social.activitystreams.client.impl.SocialActivityComponentFactoryImpl")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponen");
            return method != null
                ? (await ((Task<ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCo")]
        public async Task<ActionResult<ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoInfo>> _ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCo([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.cq.social.activitystreams.client.impl.SocialActivityStreamComponentFactory")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCo");
            return method != null
                ? (await ((Task<ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandler")]
        public async Task<ActionResult<ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerInfo>> _ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandler([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.cq.social.activitystreams.listener.impl.EventListenerHandler")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandler");
            return method != null
                ? (await ((Task<ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeCqSocialActivitystreamsListenerImplModerationEventExten")]
        public async Task<ActionResult<ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenInfo>> _ComAdobeCqSocialActivitystreamsListenerImplModerationEventExten([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.cq.social.activitystreams.listener.impl.ModerationEventExtension")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeCqSocialActivitystreamsListenerImplModerationEventExten");
            return method != null
                ? (await ((Task<ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivityS")]
        public async Task<ActionResult<ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySInfo>> _ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivityS([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.cq.social.activitystreams.listener.impl.RatingEventActivitySuppressor")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivityS");
            return method != null
                ? (await ((Task<ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStre")]
        public async Task<ActionResult<ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreInfo>> _ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStre([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.cq.social.activitystreams.listener.impl.ResourceActivityStreamProviderFactory")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStre");
            return method != null
                ? (await ((Task<ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsI")]
        public async Task<ActionResult<ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIInfo>> _ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsI([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.cq.social.calendar.client.endpoints.impl.CalendarOperationsImpl")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsI");
            return method != null
                ? (await ((Task<ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmen")]
        public async Task<ActionResult<ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenInfo>> _ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmen([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.cq.social.calendar.client.operationextensions.EventAttachment")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmen");
            return method != null
                ? (await ((Task<ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeCqSocialCalendarServletsTimeZoneServlet")]
        public async Task<ActionResult<ComAdobeCqSocialCalendarServletsTimeZoneServletInfo>> _ComAdobeCqSocialCalendarServletsTimeZoneServlet([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.cq.social.calendar.servlets.TimeZoneServlet")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeCqSocialCalendarServletsTimeZoneServlet");
            return method != null
                ? (await ((Task<ComAdobeCqSocialCalendarServletsTimeZoneServletInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEvent")]
        public async Task<ActionResult<ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventInfo>> _ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEvent([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.cq.social.commons.comments.endpoints.impl.CommentDeleteEventActivitySuppressor")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEvent");
            return method != null
                ? (await ((Task<ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSe")]
        public async Task<ActionResult<ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSeInfo>> _ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSe([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.cq.social.commons.comments.endpoints.impl.CommentOperationService")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSe");
            return method != null
                ? (await ((Task<ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSeInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperati")]
        public async Task<ActionResult<ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiInfo>> _ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperati([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.cq.social.commons.comments.endpoints.impl.TranslationOperationService")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperati");
            return method != null
                ? (await ((Task<ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialC")]
        public async Task<ActionResult<ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCInfo>> _ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialC([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.cq.social.commons.comments.listing.impl.SearchCommentSocialComponentListProvider")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialC");
            return method != null
                ? (await ((Task<ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPos")]
        public async Task<ActionResult<ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosInfo>> _ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPos([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.cq.social.commons.comments.scheduler.impl.SearchScheduledPosts")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPos");
            return method != null
                ? (await ((Task<ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeCqSocialCommonsCorsCORSAuthenticationFilter")]
        public async Task<ActionResult<ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterInfo>> _ComAdobeCqSocialCommonsCorsCORSAuthenticationFilter([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.cq.social.commons.cors.CORSAuthenticationFilter")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeCqSocialCommonsCorsCORSAuthenticationFilter");
            return method != null
                ? (await ((Task<ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProvider")]
        public async Task<ActionResult<ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderInfo>> _ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProvider([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.cq.social.commons.emailreply.impl.AndroidEmailClientProvider")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProvider");
            return method != null
                ? (await ((Task<ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImpl")]
        public async Task<ActionResult<ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplInfo>> _ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImpl([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.cq.social.commons.emailreply.impl.CommentEmailBuilderImpl")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImpl");
            return method != null
                ? (await ((Task<ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListener")]
        public async Task<ActionResult<ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerInfo>> _ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListener([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.cq.social.commons.emailreply.impl.CommentEmailEventListener")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListener");
            return method != null
                ? (await ((Task<ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeCqSocialCommonsEmailreplyImplCustomEmailClientProvider")]
        public async Task<ActionResult<ComAdobeCqSocialCommonsEmailreplyImplCustomEmailClientProviderInfo>> _ComAdobeCqSocialCommonsEmailreplyImplCustomEmailClientProvider([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.cq.social.commons.emailreply.impl.CustomEmailClientProvider")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeCqSocialCommonsEmailreplyImplCustomEmailClientProvider");
            return method != null
                ? (await ((Task<ComAdobeCqSocialCommonsEmailreplyImplCustomEmailClientProviderInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImp")]
        public async Task<ActionResult<ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpInfo>> _ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImp([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.cq.social.commons.emailreply.impl.EmailQuotedTextPatternsImpl")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImp");
            return method != null
                ? (await ((Task<ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImp")]
        public async Task<ActionResult<ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpInfo>> _ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImp([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.cq.social.commons.emailreply.impl.EmailReplyConfigurationImpl")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImp");
            return method != null
                ? (await ((Task<ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporter")]
        public async Task<ActionResult<ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterInfo>> _ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporter([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.cq.social.commons.emailreply.impl.EmailReplyImporter")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporter");
            return method != null
                ? (await ((Task<ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeCqSocialCommonsEmailreplyImplGmailEmailClientProvider")]
        public async Task<ActionResult<ComAdobeCqSocialCommonsEmailreplyImplGmailEmailClientProviderInfo>> _ComAdobeCqSocialCommonsEmailreplyImplGmailEmailClientProvider([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.cq.social.commons.emailreply.impl.GmailEmailClientProvider")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeCqSocialCommonsEmailreplyImplGmailEmailClientProvider");
            return method != null
                ? (await ((Task<ComAdobeCqSocialCommonsEmailreplyImplGmailEmailClientProviderInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProvider")]
        public async Task<ActionResult<ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderInfo>> _ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProvider([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.cq.social.commons.emailreply.impl.IOSEmailClientProvider")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProvider");
            return method != null
                ? (await ((Task<ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProvider")]
        public async Task<ActionResult<ComAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProviderInfo>> _ComAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProvider([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.cq.social.commons.emailreply.impl.MacmailEmailClientProvider")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProvider");
            return method != null
                ? (await ((Task<ComAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProviderInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeCqSocialCommonsEmailreplyImplOutLookEmailClientProvider")]
        public async Task<ActionResult<ComAdobeCqSocialCommonsEmailreplyImplOutLookEmailClientProviderInfo>> _ComAdobeCqSocialCommonsEmailreplyImplOutLookEmailClientProvider([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.cq.social.commons.emailreply.impl.OutLookEmailClientProvider")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeCqSocialCommonsEmailreplyImplOutLookEmailClientProvider");
            return method != null
                ? (await ((Task<ComAdobeCqSocialCommonsEmailreplyImplOutLookEmailClientProviderInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProvider")]
        public async Task<ActionResult<ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderInfo>> _ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProvider([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.cq.social.commons.emailreply.impl.UnknownEmailClientProvider")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProvider");
            return method != null
                ? (await ((Task<ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProvider")]
        public async Task<ActionResult<ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderInfo>> _ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProvider([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.cq.social.commons.emailreply.impl.YahooEmailClientProvider")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProvider");
            return method != null
                ? (await ((Task<ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUpload")]
        public async Task<ActionResult<ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadInfo>> _ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUpload([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.cq.social.commons.maintainance.impl.DeleteTempUGCImageUploads")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUpload");
            return method != null
                ? (await ((Task<ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImpl")]
        public async Task<ActionResult<ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplInfo>> _ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImpl([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.cq.social.commons.ugclimiter.impl.UGCLimiterServiceImpl")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImpl");
            return method != null
                ? (await ((Task<ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimit")]
        public async Task<ActionResult<ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitInfo>> _ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimit([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.cq.social.commons.ugclimitsconfig.impl.CommunityUserUGCLimitsConfigImpl")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimit");
            return method != null
                ? (await ((Task<ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeCqSocialConnectOauthImplFacebookProviderImpl")]
        public async Task<ActionResult<ComAdobeCqSocialConnectOauthImplFacebookProviderImplInfo>> _ComAdobeCqSocialConnectOauthImplFacebookProviderImpl([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.cq.social.connect.oauth.impl.FacebookProviderImpl")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeCqSocialConnectOauthImplFacebookProviderImpl");
            return method != null
                ? (await ((Task<ComAdobeCqSocialConnectOauthImplFacebookProviderImplInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandle")]
        public async Task<ActionResult<ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleInfo>> _ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandle([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.cq.social.connect.oauth.impl.SocialOAuthAuthenticationHandler")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandle");
            return method != null
                ? (await ((Task<ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapper")]
        public async Task<ActionResult<ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperInfo>> _ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapper([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.cq.social.connect.oauth.impl.SocialOAuthUserProfileMapper")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapper");
            return method != null
                ? (await ((Task<ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeCqSocialConnectOauthImplTwitterProviderImpl")]
        public async Task<ActionResult<ComAdobeCqSocialConnectOauthImplTwitterProviderImplInfo>> _ComAdobeCqSocialConnectOauthImplTwitterProviderImpl([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.cq.social.connect.oauth.impl.TwitterProviderImpl")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeCqSocialConnectOauthImplTwitterProviderImpl");
            return method != null
                ? (await ((Task<ComAdobeCqSocialConnectOauthImplTwitterProviderImplInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmen")]
        public async Task<ActionResult<ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenInfo>> _ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmen([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.cq.social.content.fragments.services.impl.CommunitiesFragmentCreationServiceImpl")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmen");
            return method != null
                ? (await ((Task<ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeCqSocialDatastoreAsImplASResourceProviderFactory")]
        public async Task<ActionResult<ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryInfo>> _ComAdobeCqSocialDatastoreAsImplASResourceProviderFactory([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.cq.social.datastore.as.impl.ASResourceProviderFactory")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeCqSocialDatastoreAsImplASResourceProviderFactory");
            return method != null
                ? (await ((Task<ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactory")]
        public async Task<ActionResult<ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryInfo>> _ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactory([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.cq.social.datastore.op.impl.SocialMSResourceProviderFactory")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactory");
            return method != null
                ? (await ((Task<ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactor")]
        public async Task<ActionResult<ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorInfo>> _ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactor([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.cq.social.datastore.rdb.impl.SocialRDBResourceProviderFactory")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactor");
            return method != null
                ? (await ((Task<ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorF")]
        public async Task<ActionResult<ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFInfo>> _ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorF([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.cq.social.enablement.adaptors.EnablementLearningPathAdaptorFactory")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorF");
            return method != null
                ? (await ((Task<ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFacto")]
        public async Task<ActionResult<ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoInfo>> _ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFacto([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.cq.social.enablement.adaptors.EnablementResourceAdaptorFactory")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFacto");
            return method != null
                ? (await ((Task<ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeCqSocialEnablementLearningpathEndpointsImplEnablementL")]
        public async Task<ActionResult<ComAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLInfo>> _ComAdobeCqSocialEnablementLearningpathEndpointsImplEnablementL([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.cq.social.enablement.learningpath.endpoints.impl.EnablementLearningPathModelOperationService")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeCqSocialEnablementLearningpathEndpointsImplEnablementL");
            return method != null
                ? (await ((Task<ComAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResou")]
        public async Task<ActionResult<ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResouInfo>> _ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResou([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.cq.social.enablement.resource.endpoints.impl.EnablementResourceModelOperationService")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResou");
            return method != null
                ? (await ((Task<ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResouInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeCqSocialEnablementServicesImplAuthorMarkerImpl")]
        public async Task<ActionResult<ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplInfo>> _ComAdobeCqSocialEnablementServicesImplAuthorMarkerImpl([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.cq.social.enablement.services.impl.AuthorMarkerImpl")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeCqSocialEnablementServicesImplAuthorMarkerImpl");
            return method != null
                ? (await ((Task<ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGe")]
        public async Task<ActionResult<ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGeInfo>> _ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGe([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.cq.social.filelibrary.client.endpoints.FilelibraryDownloadGetServlet")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGe");
            return method != null
                ? (await ((Task<ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGeInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOpera")]
        public async Task<ActionResult<ComAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaInfo>> _ComAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOpera([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.cq.social.filelibrary.client.endpoints.impl.FileLibraryOperationsService")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOpera");
            return method != null
                ? (await ((Task<ComAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeCqSocialForumClientEndpointsImplForumOperationsService")]
        public async Task<ActionResult<ComAdobeCqSocialForumClientEndpointsImplForumOperationsServiceInfo>> _ComAdobeCqSocialForumClientEndpointsImplForumOperationsService([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.cq.social.forum.client.endpoints.impl.ForumOperationsService")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeCqSocialForumClientEndpointsImplForumOperationsService");
            return method != null
                ? (await ((Task<ComAdobeCqSocialForumClientEndpointsImplForumOperationsServiceInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeCqSocialForumDispatcherImplFlushOperations")]
        public async Task<ActionResult<ComAdobeCqSocialForumDispatcherImplFlushOperationsInfo>> _ComAdobeCqSocialForumDispatcherImplFlushOperations([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.cq.social.forum.dispatcher.impl.FlushOperations")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeCqSocialForumDispatcherImplFlushOperations");
            return method != null
                ? (await ((Task<ComAdobeCqSocialForumDispatcherImplFlushOperationsInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponen")]
        public async Task<ActionResult<ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenInfo>> _ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponen([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.cq.social.group.client.impl.CommunityGroupCollectionComponentFactory")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponen");
            return method != null
                ? (await ((Task<ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeCqSocialGroupImplGroupServiceImpl")]
        public async Task<ActionResult<ComAdobeCqSocialGroupImplGroupServiceImplInfo>> _ComAdobeCqSocialGroupImplGroupServiceImpl([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.cq.social.group.impl.GroupServiceImpl")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeCqSocialGroupImplGroupServiceImpl");
            return method != null
                ? (await ((Task<ComAdobeCqSocialGroupImplGroupServiceImplInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeCqSocialHandlebarsGuavaTemplateCacheImpl")]
        public async Task<ActionResult<ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplInfo>> _ComAdobeCqSocialHandlebarsGuavaTemplateCacheImpl([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.cq.social.handlebars.GuavaTemplateCacheImpl")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeCqSocialHandlebarsGuavaTemplateCacheImpl");
            return method != null
                ? (await ((Task<ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsS")]
        public async Task<ActionResult<ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSInfo>> _ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsS([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.cq.social.ideation.client.endpoints.impl.IdeationOperationsService")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsS");
            return method != null
                ? (await ((Task<ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSer")]
        public async Task<ActionResult<ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerInfo>> _ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSer([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.cq.social.journal.client.endpoints.impl.JournalOperationsService")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSer");
            return method != null
                ? (await ((Task<ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfile")]
        public async Task<ActionResult<ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileInfo>> _ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfile([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.cq.social.members.endpoints.impl.CommunityMemberGroupProfileOperationService")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfile");
            return method != null
                ? (await ((Task<ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileO")]
        public async Task<ActionResult<ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOInfo>> _ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileO([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.cq.social.members.endpoints.impl.CommunityMemberUserProfileOperationService")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileO");
            return method != null
                ? (await ((Task<ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentF")]
        public async Task<ActionResult<ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFInfo>> _ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentF([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.cq.social.members.impl.CommunityMemberGroupProfileComponentFactory")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentF");
            return method != null
                ? (await ((Task<ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperation")]
        public async Task<ActionResult<ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationInfo>> _ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperation([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.cq.social.messaging.client.endpoints.impl.MessagingOperationsServiceImpl")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperation");
            return method != null
                ? (await ((Task<ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponen")]
        public async Task<ActionResult<ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenInfo>> _ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponen([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.cq.social.moderation.dashboard.api.FilterGroupSocialComponentFactory")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponen");
            return method != null
                ? (await ((Task<ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeCqSocialModerationDashboardApiModerationDashboardSocial")]
        public async Task<ActionResult<ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialInfo>> _ComAdobeCqSocialModerationDashboardApiModerationDashboardSocial([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.cq.social.moderation.dashboard.api.ModerationDashboardSocialComponentFactory")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeCqSocialModerationDashboardApiModerationDashboardSocial");
            return method != null
                ? (await ((Task<ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponen")]
        public async Task<ActionResult<ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenInfo>> _ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponen([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.cq.social.moderation.dashboard.api.UserDetailsSocialComponentFactory")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponen");
            return method != null
                ? (await ((Task<ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSoci")]
        public async Task<ActionResult<ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociInfo>> _ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSoci([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.cq.social.moderation.dashboard.internal.impl.FilterGroupSocialComponentFactoryV2")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSoci");
            return method != null
                ? (await ((Task<ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeCqSocialNotificationsImplMentionsRouter")]
        public async Task<ActionResult<ComAdobeCqSocialNotificationsImplMentionsRouterInfo>> _ComAdobeCqSocialNotificationsImplMentionsRouter([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.cq.social.notifications.impl.MentionsRouter")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeCqSocialNotificationsImplMentionsRouter");
            return method != null
                ? (await ((Task<ComAdobeCqSocialNotificationsImplMentionsRouterInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeCqSocialNotificationsImplNotificationManagerImpl")]
        public async Task<ActionResult<ComAdobeCqSocialNotificationsImplNotificationManagerImplInfo>> _ComAdobeCqSocialNotificationsImplNotificationManagerImpl([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.cq.social.notifications.impl.NotificationManagerImpl")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeCqSocialNotificationsImplNotificationManagerImpl");
            return method != null
                ? (await ((Task<ComAdobeCqSocialNotificationsImplNotificationManagerImplInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeCqSocialNotificationsImplNotificationsRouter")]
        public async Task<ActionResult<ComAdobeCqSocialNotificationsImplNotificationsRouterInfo>> _ComAdobeCqSocialNotificationsImplNotificationsRouter([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.cq.social.notifications.impl.NotificationsRouter")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeCqSocialNotificationsImplNotificationsRouter");
            return method != null
                ? (await ((Task<ComAdobeCqSocialNotificationsImplNotificationsRouterInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServic")]
        public async Task<ActionResult<ComAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicInfo>> _ComAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServic([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.cq.social.qna.client.endpoints.impl.QnaForumOperationsService")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServic");
            return method != null
                ? (await ((Task<ComAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportI")]
        public async Task<ActionResult<ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIInfo>> _ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportI([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.cq.social.reporting.analytics.services.impl.AnalyticsReportImporterServiceImpl")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportI");
            return method != null
                ? (await ((Task<ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportM")]
        public async Task<ActionResult<ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMInfo>> _ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportM([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.cq.social.reporting.analytics.services.impl.AnalyticsReportManagementServiceImpl")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportM");
            return method != null
                ? (await ((Task<ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportS")]
        public async Task<ActionResult<ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSInfo>> _ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportS([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.cq.social.reporting.analytics.services.impl.SiteTrendReportSocialComponentFactory")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportS");
            return method != null
                ? (await ((Task<ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServi")]
        public async Task<ActionResult<ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiInfo>> _ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServi([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.cq.social.review.client.endpoints.impl.ReviewOperationsService")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServi");
            return method != null
                ? (await ((Task<ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServlet")]
        public async Task<ActionResult<ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletInfo>> _ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServlet([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.cq.social.scf.core.operations.impl.SocialOperationsServlet")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServlet");
            return method != null
                ? (await ((Task<ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServlet")]
        public async Task<ActionResult<ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletInfo>> _ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServlet([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.cq.social.scf.endpoints.impl.DefaultSocialGetServlet")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServlet");
            return method != null
                ? (await ((Task<ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeCqSocialScoringImplScoringEventListener")]
        public async Task<ActionResult<ComAdobeCqSocialScoringImplScoringEventListenerInfo>> _ComAdobeCqSocialScoringImplScoringEventListener([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.cq.social.scoring.impl.ScoringEventListener")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeCqSocialScoringImplScoringEventListener");
            return method != null
                ? (await ((Task<ComAdobeCqSocialScoringImplScoringEventListenerInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImpl")]
        public async Task<ActionResult<ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplInfo>> _ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImpl([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.cq.social.serviceusers.internal.impl.ServiceUserWrapperImpl")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImpl");
            return method != null
                ? (await ((Task<ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeCqSocialSiteEndpointsImplSiteOperationService")]
        public async Task<ActionResult<ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceInfo>> _ComAdobeCqSocialSiteEndpointsImplSiteOperationService([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.cq.social.site.endpoints.impl.SiteOperationService")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeCqSocialSiteEndpointsImplSiteOperationService");
            return method != null
                ? (await ((Task<ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceIm")]
        public async Task<ActionResult<ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImInfo>> _ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceIm([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.cq.social.site.impl.AnalyticsComponentConfigurationServiceImpl")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceIm");
            return method != null
                ? (await ((Task<ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeCqSocialSiteImplSiteConfiguratorImpl")]
        public async Task<ActionResult<ComAdobeCqSocialSiteImplSiteConfiguratorImplInfo>> _ComAdobeCqSocialSiteImplSiteConfiguratorImpl([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.cq.social.site.impl.SiteConfiguratorImpl")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeCqSocialSiteImplSiteConfiguratorImpl");
            return method != null
                ? (await ((Task<ComAdobeCqSocialSiteImplSiteConfiguratorImplInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeCqSocialSrpImplSocialSolrConnector")]
        public async Task<ActionResult<ComAdobeCqSocialSrpImplSocialSolrConnectorInfo>> _ComAdobeCqSocialSrpImplSocialSolrConnector([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.cq.social.srp.impl.SocialSolrConnector")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeCqSocialSrpImplSocialSolrConnector");
            return method != null
                ? (await ((Task<ComAdobeCqSocialSrpImplSocialSolrConnectorInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeCqSocialSyncImplDiffChangesObserver")]
        public async Task<ActionResult<ComAdobeCqSocialSyncImplDiffChangesObserverInfo>> _ComAdobeCqSocialSyncImplDiffChangesObserver([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.cq.social.sync.impl.DiffChangesObserver")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeCqSocialSyncImplDiffChangesObserver");
            return method != null
                ? (await ((Task<ComAdobeCqSocialSyncImplDiffChangesObserverInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeCqSocialSyncImplGroupSyncListenerImpl")]
        public async Task<ActionResult<ComAdobeCqSocialSyncImplGroupSyncListenerImplInfo>> _ComAdobeCqSocialSyncImplGroupSyncListenerImpl([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.cq.social.sync.impl.GroupSyncListenerImpl")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeCqSocialSyncImplGroupSyncListenerImpl");
            return method != null
                ? (await ((Task<ComAdobeCqSocialSyncImplGroupSyncListenerImplInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeCqSocialSyncImplPublisherSyncServiceImpl")]
        public async Task<ActionResult<ComAdobeCqSocialSyncImplPublisherSyncServiceImplInfo>> _ComAdobeCqSocialSyncImplPublisherSyncServiceImpl([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.cq.social.sync.impl.PublisherSyncServiceImpl")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeCqSocialSyncImplPublisherSyncServiceImpl");
            return method != null
                ? (await ((Task<ComAdobeCqSocialSyncImplPublisherSyncServiceImplInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeCqSocialSyncImplUserSyncListenerImpl")]
        public async Task<ActionResult<ComAdobeCqSocialSyncImplUserSyncListenerImplInfo>> _ComAdobeCqSocialSyncImplUserSyncListenerImpl([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.cq.social.sync.impl.UserSyncListenerImpl")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeCqSocialSyncImplUserSyncListenerImpl");
            return method != null
                ? (await ((Task<ComAdobeCqSocialSyncImplUserSyncListenerImplInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeCqSocialTranslationImplTranslationServiceConfigManager")]
        public async Task<ActionResult<ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerInfo>> _ComAdobeCqSocialTranslationImplTranslationServiceConfigManager([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.cq.social.translation.impl.TranslationServiceConfigManager")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeCqSocialTranslationImplTranslationServiceConfigManager");
            return method != null
                ? (await ((Task<ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeCqSocialTranslationImplUGCLanguageDetector")]
        public async Task<ActionResult<ComAdobeCqSocialTranslationImplUGCLanguageDetectorInfo>> _ComAdobeCqSocialTranslationImplUGCLanguageDetector([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.cq.social.translation.impl.UGCLanguageDetector")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeCqSocialTranslationImplUGCLanguageDetector");
            return method != null
                ? (await ((Task<ComAdobeCqSocialTranslationImplUGCLanguageDetectorInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImpl")]
        public async Task<ActionResult<ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplInfo>> _ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImpl([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.cq.social.ugcbase.dispatcher.impl.FlushServiceImpl")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImpl");
            return method != null
                ? (await ((Task<ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImpl")]
        public async Task<ActionResult<ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplInfo>> _ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImpl([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.cq.social.ugcbase.impl.AysncReverseReplicatorImpl")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImpl");
            return method != null
                ? (await ((Task<ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeCqSocialUgcbaseImplPublisherConfigurationImpl")]
        public async Task<ActionResult<ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplInfo>> _ComAdobeCqSocialUgcbaseImplPublisherConfigurationImpl([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.cq.social.ugcbase.impl.PublisherConfigurationImpl")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeCqSocialUgcbaseImplPublisherConfigurationImpl");
            return method != null
                ? (await ((Task<ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeCqSocialUgcbaseImplSocialUtilsImpl")]
        public async Task<ActionResult<ComAdobeCqSocialUgcbaseImplSocialUtilsImplInfo>> _ComAdobeCqSocialUgcbaseImplSocialUtilsImpl([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.cq.social.ugcbase.impl.SocialUtilsImpl")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeCqSocialUgcbaseImplSocialUtilsImpl");
            return method != null
                ? (await ((Task<ComAdobeCqSocialUgcbaseImplSocialUtilsImplInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeCqSocialUgcbaseModerationImplAutoModerationImpl")]
        public async Task<ActionResult<ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplInfo>> _ComAdobeCqSocialUgcbaseModerationImplAutoModerationImpl([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.cq.social.ugcbase.moderation.impl.AutoModerationImpl")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeCqSocialUgcbaseModerationImplAutoModerationImpl");
            return method != null
                ? (await ((Task<ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeCqSocialUgcbaseModerationImplSentimentProcess")]
        public async Task<ActionResult<ComAdobeCqSocialUgcbaseModerationImplSentimentProcessInfo>> _ComAdobeCqSocialUgcbaseModerationImplSentimentProcess([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.cq.social.ugcbase.moderation.impl.SentimentProcess")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeCqSocialUgcbaseModerationImplSentimentProcess");
            return method != null
                ? (await ((Task<ComAdobeCqSocialUgcbaseModerationImplSentimentProcessInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackli")]
        public async Task<ActionResult<ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliInfo>> _ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackli([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.cq.social.ugcbase.security.impl.DefaultAttachmentTypeBlacklistService")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackli");
            return method != null
                ? (await ((Task<ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImpl")]
        public async Task<ActionResult<ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplInfo>> _ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImpl([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.cq.social.ugcbase.security.impl.SaferSlingPostValidatorImpl")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImpl");
            return method != null
                ? (await ((Task<ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServlet")]
        public async Task<ActionResult<ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletInfo>> _ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServlet([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.cq.social.user.endpoints.impl.UsersGroupFromPublishServlet")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServlet");
            return method != null
                ? (await ((Task<ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeCqSocialUserImplTransportHttpToPublisher")]
        public async Task<ActionResult<ComAdobeCqSocialUserImplTransportHttpToPublisherInfo>> _ComAdobeCqSocialUserImplTransportHttpToPublisher([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.cq.social.user.impl.transport.HttpToPublisher")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeCqSocialUserImplTransportHttpToPublisher");
            return method != null
                ? (await ((Task<ComAdobeCqSocialUserImplTransportHttpToPublisherInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFact")]
        public async Task<ActionResult<ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactInfo>> _ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFact([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.cq.ui.wcm.commons.internal.servlets.rte.RTEFilterServletFactory.amended")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFact");
            return method != null
                ? (await ((Task<ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeCqUpgradesCleanupImplUpgradeContentCleanup")]
        public async Task<ActionResult<ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupInfo>> _ComAdobeCqUpgradesCleanupImplUpgradeContentCleanup([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.cq.upgrades.cleanup.impl.UpgradeContentCleanup")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeCqUpgradesCleanupImplUpgradeContentCleanup");
            return method != null
                ? (await ((Task<ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanup")]
        public async Task<ActionResult<ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupInfo>> _ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanup([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.cq.upgrades.cleanup.impl.UpgradeInstallFolderCleanup")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanup");
            return method != null
                ? (await ((Task<ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderService")]
        public async Task<ActionResult<ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceInfo>> _ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderService([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.cq.wcm.jobs.async.impl.AsyncDeleteConfigProviderService")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderService");
            return method != null
                ? (await ((Task<ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTask")]
        public async Task<ActionResult<ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskInfo>> _ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTask([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.cq.wcm.jobs.async.impl.AsyncJobCleanUpTask")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTask");
            return method != null
                ? (await ((Task<ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderService")]
        public async Task<ActionResult<ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceInfo>> _ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderService([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.cq.wcm.jobs.async.impl.AsyncMoveConfigProviderService")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderService");
            return method != null
                ? (await ((Task<ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderService")]
        public async Task<ActionResult<ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceInfo>> _ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderService([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.cq.wcm.jobs.async.impl.AsyncPageMoveConfigProviderService")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderService");
            return method != null
                ? (await ((Task<ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeCqWcmLaunchesImplLaunchesEventHandler")]
        public async Task<ActionResult<ComAdobeCqWcmLaunchesImplLaunchesEventHandlerInfo>> _ComAdobeCqWcmLaunchesImplLaunchesEventHandler([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.cq.wcm.launches.impl.LaunchesEventHandler")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeCqWcmLaunchesImplLaunchesEventHandler");
            return method != null
                ? (await ((Task<ComAdobeCqWcmLaunchesImplLaunchesEventHandlerInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeCqWcmMobileQrcodeServletQRCodeImageGenerator")]
        public async Task<ActionResult<ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorInfo>> _ComAdobeCqWcmMobileQrcodeServletQRCodeImageGenerator([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.cq.wcm.mobile.qrcode.servlet.QRCodeImageGenerator")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeCqWcmMobileQrcodeServletQRCodeImageGenerator");
            return method != null
                ? (await ((Task<ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImpl")]
        public async Task<ActionResult<ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplInfo>> _ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImpl([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.cq.wcm.style.internal.ComponentStyleInfoCacheImpl")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImpl");
            return method != null
                ? (await ((Task<ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImpl")]
        public async Task<ActionResult<ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplInfo>> _ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImpl([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.cq.wcm.translation.impl.TranslationPlatformConfigurationImpl")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImpl");
            return method != null
                ? (await ((Task<ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigService")]
        public async Task<ActionResult<ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceInfo>> _ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigService([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.fd.fp.config.FormsPortalDraftsandSubmissionConfigService")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigService");
            return method != null
                ? (await ((Task<ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeFdFpConfigFormsPortalSchedulerService")]
        public async Task<ActionResult<ComAdobeFdFpConfigFormsPortalSchedulerServiceInfo>> _ComAdobeFdFpConfigFormsPortalSchedulerService([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.fd.fp.config.FormsPortalSchedulerService")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeFdFpConfigFormsPortalSchedulerService");
            return method != null
                ? (await ((Task<ComAdobeFdFpConfigFormsPortalSchedulerServiceInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeFormsCommonServiceImplDefaultDataProvider")]
        public async Task<ActionResult<ComAdobeFormsCommonServiceImplDefaultDataProviderInfo>> _ComAdobeFormsCommonServiceImplDefaultDataProvider([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.forms.common.service.impl.DefaultDataProvider")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeFormsCommonServiceImplDefaultDataProvider");
            return method != null
                ? (await ((Task<ComAdobeFormsCommonServiceImplDefaultDataProviderInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImp")]
        public async Task<ActionResult<ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpInfo>> _ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImp([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.forms.common.service.impl.FormsCommonConfigurationServiceImpl")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImp");
            return method != null
                ? (await ((Task<ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeFormsCommonServletTempCleanUpTask")]
        public async Task<ActionResult<ComAdobeFormsCommonServletTempCleanUpTaskInfo>> _ComAdobeFormsCommonServletTempCleanUpTask([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.forms.common.servlet.TempCleanUpTask")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeFormsCommonServletTempCleanUpTask");
            return method != null
                ? (await ((Task<ComAdobeFormsCommonServletTempCleanUpTaskInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeGraniteAcpPlatformPlatformServlet")]
        public async Task<ActionResult<ComAdobeGraniteAcpPlatformPlatformServletInfo>> _ComAdobeGraniteAcpPlatformPlatformServlet([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.granite.acp.platform.PlatformServlet")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeGraniteAcpPlatformPlatformServlet");
            return method != null
                ? (await ((Task<ComAdobeGraniteAcpPlatformPlatformServletInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeGraniteActivitystreamsImplActivityManagerImpl")]
        public async Task<ActionResult<ComAdobeGraniteActivitystreamsImplActivityManagerImplInfo>> _ComAdobeGraniteActivitystreamsImplActivityManagerImpl([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.granite.activitystreams.impl.ActivityManagerImpl")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeGraniteActivitystreamsImplActivityManagerImpl");
            return method != null
                ? (await ((Task<ComAdobeGraniteActivitystreamsImplActivityManagerImplInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeGraniteAnalyzerBaseSystemStatusServlet")]
        public async Task<ActionResult<ComAdobeGraniteAnalyzerBaseSystemStatusServletInfo>> _ComAdobeGraniteAnalyzerBaseSystemStatusServlet([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.granite.analyzer.base.SystemStatusServlet")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeGraniteAnalyzerBaseSystemStatusServlet");
            return method != null
                ? (await ((Task<ComAdobeGraniteAnalyzerBaseSystemStatusServletInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServlet")]
        public async Task<ActionResult<ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletInfo>> _ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServlet([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.granite.analyzer.scripts.compile.AllScriptsCompilerServlet")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServlet");
            return method != null
                ? (await ((Task<ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeGraniteApicontrollerFilterResolverHookFactory")]
        public async Task<ActionResult<ComAdobeGraniteApicontrollerFilterResolverHookFactoryInfo>> _ComAdobeGraniteApicontrollerFilterResolverHookFactory([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.granite.apicontroller.FilterResolverHookFactory")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeGraniteApicontrollerFilterResolverHookFactory");
            return method != null
                ? (await ((Task<ComAdobeGraniteApicontrollerFilterResolverHookFactoryInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeGraniteAuthCertImplClientCertAuthHandler")]
        public async Task<ActionResult<ComAdobeGraniteAuthCertImplClientCertAuthHandlerInfo>> _ComAdobeGraniteAuthCertImplClientCertAuthHandler([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.granite.auth.cert.impl.ClientCertAuthHandler")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeGraniteAuthCertImplClientCertAuthHandler");
            return method != null
                ? (await ((Task<ComAdobeGraniteAuthCertImplClientCertAuthHandlerInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeGraniteAuthIms")]
        public async Task<ActionResult<ComAdobeGraniteAuthImsInfo>> _ComAdobeGraniteAuthIms([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.granite.auth.ims")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeGraniteAuthIms");
            return method != null
                ? (await ((Task<ComAdobeGraniteAuthImsInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtension")]
        public async Task<ActionResult<ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionInfo>> _ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtension([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.granite.auth.ims.impl.ExternalUserIdMappingProviderExtension")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtension");
            return method != null
                ? (await ((Task<ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImpl")]
        public async Task<ActionResult<ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplInfo>> _ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImpl([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.granite.auth.ims.impl.IMSAccessTokenRequestCustomizerImpl")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImpl");
            return method != null
                ? (await ((Task<ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidator")]
        public async Task<ActionResult<ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorInfo>> _ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidator([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.granite.auth.ims.impl.IMSInstanceCredentialsValidator")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidator");
            return method != null
                ? (await ((Task<ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeGraniteAuthImsImplIMSProviderImpl")]
        public async Task<ActionResult<ComAdobeGraniteAuthImsImplIMSProviderImplInfo>> _ComAdobeGraniteAuthImsImplIMSProviderImpl([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.granite.auth.ims.impl.IMSProviderImpl")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeGraniteAuthImsImplIMSProviderImpl");
            return method != null
                ? (await ((Task<ComAdobeGraniteAuthImsImplIMSProviderImplInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeGraniteAuthImsImplImsConfigProviderImpl")]
        public async Task<ActionResult<ComAdobeGraniteAuthImsImplImsConfigProviderImplInfo>> _ComAdobeGraniteAuthImsImplImsConfigProviderImpl([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.granite.auth.ims.impl.ImsConfigProviderImpl")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeGraniteAuthImsImplImsConfigProviderImpl");
            return method != null
                ? (await ((Task<ComAdobeGraniteAuthImsImplImsConfigProviderImplInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeGraniteAuthOauthAccesstokenProvider")]
        public async Task<ActionResult<ComAdobeGraniteAuthOauthAccesstokenProviderInfo>> _ComAdobeGraniteAuthOauthAccesstokenProvider([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.granite.auth.oauth.accesstoken.provider")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeGraniteAuthOauthAccesstokenProvider");
            return method != null
                ? (await ((Task<ComAdobeGraniteAuthOauthAccesstokenProviderInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeGraniteAuthOauthImplBearerAuthenticationHandler")]
        public async Task<ActionResult<ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerInfo>> _ComAdobeGraniteAuthOauthImplBearerAuthenticationHandler([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.granite.auth.oauth.impl.BearerAuthenticationHandler")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeGraniteAuthOauthImplBearerAuthenticationHandler");
            return method != null
                ? (await ((Task<ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImpl")]
        public async Task<ActionResult<ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplInfo>> _ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImpl([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.granite.auth.oauth.impl.DefaultTokenValidatorImpl")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImpl");
            return method != null
                ? (await ((Task<ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeGraniteAuthOauthImplFacebookProviderImpl")]
        public async Task<ActionResult<ComAdobeGraniteAuthOauthImplFacebookProviderImplInfo>> _ComAdobeGraniteAuthOauthImplFacebookProviderImpl([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.granite.auth.oauth.impl.FacebookProviderImpl")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeGraniteAuthOauthImplFacebookProviderImpl");
            return method != null
                ? (await ((Task<ComAdobeGraniteAuthOauthImplFacebookProviderImplInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeGraniteAuthOauthImplGithubProviderImpl")]
        public async Task<ActionResult<ComAdobeGraniteAuthOauthImplGithubProviderImplInfo>> _ComAdobeGraniteAuthOauthImplGithubProviderImpl([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.granite.auth.oauth.impl.GithubProviderImpl")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeGraniteAuthOauthImplGithubProviderImpl");
            return method != null
                ? (await ((Task<ComAdobeGraniteAuthOauthImplGithubProviderImplInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeGraniteAuthOauthImplGraniteProvider")]
        public async Task<ActionResult<ComAdobeGraniteAuthOauthImplGraniteProviderInfo>> _ComAdobeGraniteAuthOauthImplGraniteProvider([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.granite.auth.oauth.impl.GraniteProvider")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeGraniteAuthOauthImplGraniteProvider");
            return method != null
                ? (await ((Task<ComAdobeGraniteAuthOauthImplGraniteProviderInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeGraniteAuthOauthImplHelperProviderConfigManager")]
        public async Task<ActionResult<ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInfo>> _ComAdobeGraniteAuthOauthImplHelperProviderConfigManager([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.granite.auth.oauth.impl.helper.ProviderConfigManager")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeGraniteAuthOauthImplHelperProviderConfigManager");
            return method != null
                ? (await ((Task<ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternal")]
        public async Task<ActionResult<ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalInfo>> _ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternal([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.granite.auth.oauth.impl.helper.ProviderConfigManagerInternal")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternal");
            return method != null
                ? (await ((Task<ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandler")]
        public async Task<ActionResult<ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerInfo>> _ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandler([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.granite.auth.oauth.impl.OAuthAuthenticationHandler")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandler");
            return method != null
                ? (await ((Task<ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeGraniteAuthOauthImplTwitterProviderImpl")]
        public async Task<ActionResult<ComAdobeGraniteAuthOauthImplTwitterProviderImplInfo>> _ComAdobeGraniteAuthOauthImplTwitterProviderImpl([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.granite.auth.oauth.impl.TwitterProviderImpl")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeGraniteAuthOauthImplTwitterProviderImpl");
            return method != null
                ? (await ((Task<ComAdobeGraniteAuthOauthImplTwitterProviderImplInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeGraniteAuthOauthProvider")]
        public async Task<ActionResult<ComAdobeGraniteAuthOauthProviderInfo>> _ComAdobeGraniteAuthOauthProvider([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.granite.auth.oauth.provider")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeGraniteAuthOauthProvider");
            return method != null
                ? (await ((Task<ComAdobeGraniteAuthOauthProviderInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeGraniteAuthRequirementImplDefaultRequirementHandler")]
        public async Task<ActionResult<ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerInfo>> _ComAdobeGraniteAuthRequirementImplDefaultRequirementHandler([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.granite.auth.requirement.impl.DefaultRequirementHandler")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeGraniteAuthRequirementImplDefaultRequirementHandler");
            return method != null
                ? (await ((Task<ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeGraniteAuthSamlSamlAuthenticationHandler")]
        public async Task<ActionResult<ComAdobeGraniteAuthSamlSamlAuthenticationHandlerInfo>> _ComAdobeGraniteAuthSamlSamlAuthenticationHandler([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.granite.auth.saml.SamlAuthenticationHandler")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeGraniteAuthSamlSamlAuthenticationHandler");
            return method != null
                ? (await ((Task<ComAdobeGraniteAuthSamlSamlAuthenticationHandlerInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeGraniteAuthSsoImplSsoAuthenticationHandler")]
        public async Task<ActionResult<ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerInfo>> _ComAdobeGraniteAuthSsoImplSsoAuthenticationHandler([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.granite.auth.sso.impl.SsoAuthenticationHandler")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeGraniteAuthSsoImplSsoAuthenticationHandler");
            return method != null
                ? (await ((Task<ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeGraniteBundlesHcImplCodeCacheHealthCheck")]
        public async Task<ActionResult<ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckInfo>> _ComAdobeGraniteBundlesHcImplCodeCacheHealthCheck([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.granite.bundles.hc.impl.CodeCacheHealthCheck")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeGraniteBundlesHcImplCodeCacheHealthCheck");
            return method != null
                ? (await ((Task<ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheck")]
        public async Task<ActionResult<ComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckInfo>> _ComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheck([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.granite.bundles.hc.impl.CrxdeSupportBundleHealthCheck")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheck");
            return method != null
                ? (await ((Task<ComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeGraniteBundlesHcImplDavExBundleHealthCheck")]
        public async Task<ActionResult<ComAdobeGraniteBundlesHcImplDavExBundleHealthCheckInfo>> _ComAdobeGraniteBundlesHcImplDavExBundleHealthCheck([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.granite.bundles.hc.impl.DavExBundleHealthCheck")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeGraniteBundlesHcImplDavExBundleHealthCheck");
            return method != null
                ? (await ((Task<ComAdobeGraniteBundlesHcImplDavExBundleHealthCheckInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheck")]
        public async Task<ActionResult<ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckInfo>> _ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheck([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.granite.bundles.hc.impl.InactiveBundlesHealthCheck")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheck");
            return method != null
                ? (await ((Task<ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeGraniteBundlesHcImplJobsHealthCheck")]
        public async Task<ActionResult<ComAdobeGraniteBundlesHcImplJobsHealthCheckInfo>> _ComAdobeGraniteBundlesHcImplJobsHealthCheck([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.granite.bundles.hc.impl.JobsHealthCheck")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeGraniteBundlesHcImplJobsHealthCheck");
            return method != null
                ? (await ((Task<ComAdobeGraniteBundlesHcImplJobsHealthCheckInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeGraniteBundlesHcImplSlingGetServletHealthCheck")]
        public async Task<ActionResult<ComAdobeGraniteBundlesHcImplSlingGetServletHealthCheckInfo>> _ComAdobeGraniteBundlesHcImplSlingGetServletHealthCheck([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.granite.bundles.hc.impl.SlingGetServletHealthCheck")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeGraniteBundlesHcImplSlingGetServletHealthCheck");
            return method != null
                ? (await ((Task<ComAdobeGraniteBundlesHcImplSlingGetServletHealthCheckInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheck")]
        public async Task<ActionResult<ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckInfo>> _ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheck([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.granite.bundles.hc.impl.SlingJavaScriptHandlerHealthCheck")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheck");
            return method != null
                ? (await ((Task<ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheck")]
        public async Task<ActionResult<ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckInfo>> _ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheck([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.granite.bundles.hc.impl.SlingJspScriptHandlerHealthCheck")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheck");
            return method != null
                ? (await ((Task<ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheck")]
        public async Task<ActionResult<ComAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckInfo>> _ComAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheck([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.granite.bundles.hc.impl.SlingReferrerFilterHealthCheck")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheck");
            return method != null
                ? (await ((Task<ComAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheck")]
        public async Task<ActionResult<ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheckInfo>> _ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheck([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.granite.bundles.hc.impl.WebDavBundleHealthCheck")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheck");
            return method != null
                ? (await ((Task<ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheckInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFac")]
        public async Task<ActionResult<ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacInfo>> _ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFac([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.granite.comments.internal.CommentReplicationContentFilterFactory")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFac");
            return method != null
                ? (await ((Task<ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImpl")]
        public async Task<ActionResult<ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplInfo>> _ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImpl([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.granite.compatrouter.impl.CompatSwitchingServiceImpl")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImpl");
            return method != null
                ? (await ((Task<ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeGraniteCompatrouterImplRoutingConfig")]
        public async Task<ActionResult<ComAdobeGraniteCompatrouterImplRoutingConfigInfo>> _ComAdobeGraniteCompatrouterImplRoutingConfig([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.granite.compatrouter.impl.RoutingConfig")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeGraniteCompatrouterImplRoutingConfig");
            return method != null
                ? (await ((Task<ComAdobeGraniteCompatrouterImplRoutingConfigInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeGraniteCompatrouterImplSwitchMappingConfig")]
        public async Task<ActionResult<ComAdobeGraniteCompatrouterImplSwitchMappingConfigInfo>> _ComAdobeGraniteCompatrouterImplSwitchMappingConfig([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.granite.compatrouter.impl.SwitchMappingConfig")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeGraniteCompatrouterImplSwitchMappingConfig");
            return method != null
                ? (await ((Task<ComAdobeGraniteCompatrouterImplSwitchMappingConfigInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolving")]
        public async Task<ActionResult<ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingInfo>> _ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolving([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.granite.conf.impl.RuntimeAwareConfigurationResourceResolvingStrategy")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolving");
            return method != null
                ? (await ((Task<ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeGraniteContexthubImplContextHubImpl")]
        public async Task<ActionResult<ComAdobeGraniteContexthubImplContextHubImplInfo>> _ComAdobeGraniteContexthubImplContextHubImpl([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.granite.contexthub.impl.ContextHubImpl")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeGraniteContexthubImplContextHubImpl");
            return method != null
                ? (await ((Task<ComAdobeGraniteContexthubImplContextHubImplInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeGraniteCorsImplCORSPolicyImpl")]
        public async Task<ActionResult<ComAdobeGraniteCorsImplCORSPolicyImplInfo>> _ComAdobeGraniteCorsImplCORSPolicyImpl([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.granite.cors.impl.CORSPolicyImpl")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeGraniteCorsImplCORSPolicyImpl");
            return method != null
                ? (await ((Task<ComAdobeGraniteCorsImplCORSPolicyImplInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeGraniteCsrfImplCSRFFilter")]
        public async Task<ActionResult<ComAdobeGraniteCsrfImplCSRFFilterInfo>> _ComAdobeGraniteCsrfImplCSRFFilter([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.granite.csrf.impl.CSRFFilter")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeGraniteCsrfImplCSRFFilter");
            return method != null
                ? (await ((Task<ComAdobeGraniteCsrfImplCSRFFilterInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeGraniteCsrfImplCSRFServlet")]
        public async Task<ActionResult<ComAdobeGraniteCsrfImplCSRFServletInfo>> _ComAdobeGraniteCsrfImplCSRFServlet([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.granite.csrf.impl.CSRFServlet")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeGraniteCsrfImplCSRFServlet");
            return method != null
                ? (await ((Task<ComAdobeGraniteCsrfImplCSRFServletInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSe")]
        public async Task<ActionResult<ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeInfo>> _ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSe([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.granite.distribution.core.impl.CryptoDistributionTransportSecretProvider")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSe");
            return method != null
                ? (await ((Task<ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserver")]
        public async Task<ActionResult<ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverInfo>> _ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserver([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.granite.distribution.core.impl.diff.DiffChangesObserver")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserver");
            return method != null
                ? (await ((Task<ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeGraniteDistributionCoreImplDiffDiffEventListener")]
        public async Task<ActionResult<ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerInfo>> _ComAdobeGraniteDistributionCoreImplDiffDiffEventListener([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.granite.distribution.core.impl.diff.DiffEventListener")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeGraniteDistributionCoreImplDiffDiffEventListener");
            return method != null
                ? (await ((Task<ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeGraniteDistributionCoreImplDistributionToReplicationEven")]
        public async Task<ActionResult<ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenInfo>> _ComAdobeGraniteDistributionCoreImplDistributionToReplicationEven([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.granite.distribution.core.impl.DistributionToReplicationEventTransformer")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeGraniteDistributionCoreImplDistributionToReplicationEven");
            return method != null
                ? (await ((Task<ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicat")]
        public async Task<ActionResult<ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatInfo>> _ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicat([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.granite.distribution.core.impl.replication.adapters.ReplicationAgentProvider")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicat");
            return method != null
                ? (await ((Task<ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeGraniteDistributionCoreImplReplicationDistributionTrans")]
        public async Task<ActionResult<ComAdobeGraniteDistributionCoreImplReplicationDistributionTransInfo>> _ComAdobeGraniteDistributionCoreImplReplicationDistributionTrans([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.granite.distribution.core.impl.replication.DistributionTransportHandler")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeGraniteDistributionCoreImplReplicationDistributionTrans");
            return method != null
                ? (await ((Task<ComAdobeGraniteDistributionCoreImplReplicationDistributionTransInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribu")]
        public async Task<ActionResult<ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuInfo>> _ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribu([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.granite.distribution.core.impl.transport.AccessTokenDistributionTransportSecretProvider")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribu");
            return method != null
                ? (await ((Task<ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeGraniteFragsImplCheckHttpHeaderFlag")]
        public async Task<ActionResult<ComAdobeGraniteFragsImplCheckHttpHeaderFlagInfo>> _ComAdobeGraniteFragsImplCheckHttpHeaderFlag([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.granite.frags.impl.CheckHttpHeaderFlag")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeGraniteFragsImplCheckHttpHeaderFlag");
            return method != null
                ? (await ((Task<ComAdobeGraniteFragsImplCheckHttpHeaderFlagInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeGraniteFragsImplRandomFeature")]
        public async Task<ActionResult<ComAdobeGraniteFragsImplRandomFeatureInfo>> _ComAdobeGraniteFragsImplRandomFeature([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.granite.frags.impl.RandomFeature")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeGraniteFragsImplRandomFeature");
            return method != null
                ? (await ((Task<ComAdobeGraniteFragsImplRandomFeatureInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeGraniteHttpcacheFileFileCacheStore")]
        public async Task<ActionResult<ComAdobeGraniteHttpcacheFileFileCacheStoreInfo>> _ComAdobeGraniteHttpcacheFileFileCacheStore([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.granite.httpcache.file.FileCacheStore")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeGraniteHttpcacheFileFileCacheStore");
            return method != null
                ? (await ((Task<ComAdobeGraniteHttpcacheFileFileCacheStoreInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeGraniteHttpcacheImplOuterCacheFilter")]
        public async Task<ActionResult<ComAdobeGraniteHttpcacheImplOuterCacheFilterInfo>> _ComAdobeGraniteHttpcacheImplOuterCacheFilter([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.granite.httpcache.impl.OuterCacheFilter")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeGraniteHttpcacheImplOuterCacheFilter");
            return method != null
                ? (await ((Task<ComAdobeGraniteHttpcacheImplOuterCacheFilterInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeGraniteI18nImplBundlePseudoTranslations")]
        public async Task<ActionResult<ComAdobeGraniteI18nImplBundlePseudoTranslationsInfo>> _ComAdobeGraniteI18nImplBundlePseudoTranslations([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.granite.i18n.impl.bundle.PseudoTranslations")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeGraniteI18nImplBundlePseudoTranslations");
            return method != null
                ? (await ((Task<ComAdobeGraniteI18nImplBundlePseudoTranslationsInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeGraniteI18nImplPreferencesLocaleResolverService")]
        public async Task<ActionResult<ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceInfo>> _ComAdobeGraniteI18nImplPreferencesLocaleResolverService([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.granite.i18n.impl.PreferencesLocaleResolverService")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeGraniteI18nImplPreferencesLocaleResolverService");
            return method != null
                ? (await ((Task<ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeGraniteInfocollectorInfoCollector")]
        public async Task<ActionResult<ComAdobeGraniteInfocollectorInfoCollectorInfo>> _ComAdobeGraniteInfocollectorInfoCollector([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.granite.infocollector.InfoCollector")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeGraniteInfocollectorInfoCollector");
            return method != null
                ? (await ((Task<ComAdobeGraniteInfocollectorInfoCollectorInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeGraniteJettySslInternalGraniteSslConnectorFactory")]
        public async Task<ActionResult<ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryInfo>> _ComAdobeGraniteJettySslInternalGraniteSslConnectorFactory([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.granite.jetty.ssl.internal.GraniteSslConnectorFactory")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeGraniteJettySslInternalGraniteSslConnectorFactory");
            return method != null
                ? (await ((Task<ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeGraniteLicenseImplLicenseCheckFilter")]
        public async Task<ActionResult<ComAdobeGraniteLicenseImplLicenseCheckFilterInfo>> _ComAdobeGraniteLicenseImplLicenseCheckFilter([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.granite.license.impl.LicenseCheckFilter")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeGraniteLicenseImplLicenseCheckFilter");
            return method != null
                ? (await ((Task<ComAdobeGraniteLicenseImplLicenseCheckFilterInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeGraniteLoggingImplLogAnalyserImpl")]
        public async Task<ActionResult<ComAdobeGraniteLoggingImplLogAnalyserImplInfo>> _ComAdobeGraniteLoggingImplLogAnalyserImpl([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.granite.logging.impl.LogAnalyserImpl")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeGraniteLoggingImplLogAnalyserImpl");
            return method != null
                ? (await ((Task<ComAdobeGraniteLoggingImplLogAnalyserImplInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeGraniteLoggingImplLogErrorHealthCheck")]
        public async Task<ActionResult<ComAdobeGraniteLoggingImplLogErrorHealthCheckInfo>> _ComAdobeGraniteLoggingImplLogErrorHealthCheck([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.granite.logging.impl.LogErrorHealthCheck")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeGraniteLoggingImplLogErrorHealthCheck");
            return method != null
                ? (await ((Task<ComAdobeGraniteLoggingImplLogErrorHealthCheckInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTask")]
        public async Task<ActionResult<ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskInfo>> _ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTask([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.granite.maintenance.crx.impl.DataStoreGarbageCollectionTask")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTask");
            return method != null
                ? (await ((Task<ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTask")]
        public async Task<ActionResult<ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskInfo>> _ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTask([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.granite.maintenance.crx.impl.LuceneBinariesCleanupTask")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTask");
            return method != null
                ? (await ((Task<ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTask")]
        public async Task<ActionResult<ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskInfo>> _ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTask([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.granite.maintenance.crx.impl.RevisionCleanupTask")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTask");
            return method != null
                ? (await ((Task<ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeGraniteMonitoringImplScriptConfigImpl")]
        public async Task<ActionResult<ComAdobeGraniteMonitoringImplScriptConfigImplInfo>> _ComAdobeGraniteMonitoringImplScriptConfigImpl([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.granite.monitoring.impl.ScriptConfigImpl")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeGraniteMonitoringImplScriptConfigImpl");
            return method != null
                ? (await ((Task<ComAdobeGraniteMonitoringImplScriptConfigImplInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHan")]
        public async Task<ActionResult<ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanInfo>> _ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHan([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.granite.oauth.server.auth.impl.OAuth2ServerAuthenticationHandler")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHan");
            return method != null
                ? (await ((Task<ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeGraniteOauthServerImplAccessTokenCleanupTask")]
        public async Task<ActionResult<ComAdobeGraniteOauthServerImplAccessTokenCleanupTaskInfo>> _ComAdobeGraniteOauthServerImplAccessTokenCleanupTask([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.granite.oauth.server.impl.AccessTokenCleanupTask")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeGraniteOauthServerImplAccessTokenCleanupTask");
            return method != null
                ? (await ((Task<ComAdobeGraniteOauthServerImplAccessTokenCleanupTaskInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServlet")]
        public async Task<ActionResult<ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletInfo>> _ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServlet([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.granite.oauth.server.impl.OAuth2ClientRevocationServlet")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServlet");
            return method != null
                ? (await ((Task<ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServlet")]
        public async Task<ActionResult<ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletInfo>> _ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServlet([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.granite.oauth.server.impl.OAuth2RevocationEndpointServlet")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServlet");
            return method != null
                ? (await ((Task<ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServlet")]
        public async Task<ActionResult<ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletInfo>> _ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServlet([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.granite.oauth.server.impl.OAuth2TokenEndpointServlet")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServlet");
            return method != null
                ? (await ((Task<ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServlet")]
        public async Task<ActionResult<ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletInfo>> _ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServlet([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.granite.oauth.server.impl.OAuth2TokenRevocationServlet")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServlet");
            return method != null
                ? (await ((Task<ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeGraniteOffloadingImplOffloadingConfigurator")]
        public async Task<ActionResult<ComAdobeGraniteOffloadingImplOffloadingConfiguratorInfo>> _ComAdobeGraniteOffloadingImplOffloadingConfigurator([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.granite.offloading.impl.OffloadingConfigurator")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeGraniteOffloadingImplOffloadingConfigurator");
            return method != null
                ? (await ((Task<ComAdobeGraniteOffloadingImplOffloadingConfiguratorInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeGraniteOffloadingImplOffloadingJobCloner")]
        public async Task<ActionResult<ComAdobeGraniteOffloadingImplOffloadingJobClonerInfo>> _ComAdobeGraniteOffloadingImplOffloadingJobCloner([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.granite.offloading.impl.OffloadingJobCloner")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeGraniteOffloadingImplOffloadingJobCloner");
            return method != null
                ? (await ((Task<ComAdobeGraniteOffloadingImplOffloadingJobClonerInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeGraniteOffloadingImplOffloadingJobOffloader")]
        public async Task<ActionResult<ComAdobeGraniteOffloadingImplOffloadingJobOffloaderInfo>> _ComAdobeGraniteOffloadingImplOffloadingJobOffloader([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.granite.offloading.impl.OffloadingJobOffloader")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeGraniteOffloadingImplOffloadingJobOffloader");
            return method != null
                ? (await ((Task<ComAdobeGraniteOffloadingImplOffloadingJobOffloaderInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManager")]
        public async Task<ActionResult<ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerInfo>> _ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManager([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.granite.offloading.impl.transporter.OffloadingAgentManager")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManager");
            return method != null
                ? (await ((Task<ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspo")]
        public async Task<ActionResult<ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoInfo>> _ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspo([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.granite.offloading.impl.transporter.OffloadingDefaultTransporter")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspo");
            return method != null
                ? (await ((Task<ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImpl")]
        public async Task<ActionResult<ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplInfo>> _ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImpl([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.granite.omnisearch.impl.core.OmniSearchServiceImpl")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImpl");
            return method != null
                ? (await ((Task<ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeGraniteOptoutImplOptOutServiceImpl")]
        public async Task<ActionResult<ComAdobeGraniteOptoutImplOptOutServiceImplInfo>> _ComAdobeGraniteOptoutImplOptOutServiceImpl([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.granite.optout.impl.OptOutServiceImpl")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeGraniteOptoutImplOptOutServiceImpl");
            return method != null
                ? (await ((Task<ComAdobeGraniteOptoutImplOptOutServiceImplInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheck")]
        public async Task<ActionResult<ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckInfo>> _ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheck([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.granite.queries.impl.hc.AsyncIndexHealthCheck")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheck");
            return method != null
                ? (await ((Task<ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeGraniteQueriesImplHcLargeIndexHealthCheck")]
        public async Task<ActionResult<ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckInfo>> _ComAdobeGraniteQueriesImplHcLargeIndexHealthCheck([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.granite.queries.impl.hc.LargeIndexHealthCheck")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeGraniteQueriesImplHcLargeIndexHealthCheck");
            return method != null
                ? (await ((Task<ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheck")]
        public async Task<ActionResult<ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheckInfo>> _ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheck([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.granite.queries.impl.hc.QueriesStatusHealthCheck")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheck");
            return method != null
                ? (await ((Task<ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheckInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeGraniteQueriesImplHcQueryHealthCheckMetrics")]
        public async Task<ActionResult<ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsInfo>> _ComAdobeGraniteQueriesImplHcQueryHealthCheckMetrics([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.granite.queries.impl.hc.QueryHealthCheckMetrics")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeGraniteQueriesImplHcQueryHealthCheckMetrics");
            return method != null
                ? (await ((Task<ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheck")]
        public async Task<ActionResult<ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckInfo>> _ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheck([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.granite.queries.impl.hc.QueryLimitsHealthCheck")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheck");
            return method != null
                ? (await ((Task<ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheck")]
        public async Task<ActionResult<ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckInfo>> _ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheck([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.granite.replication.hc.impl.ReplicationQueueHealthCheck")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheck");
            return method != null
                ? (await ((Task<ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthC")]
        public async Task<ActionResult<ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCInfo>> _ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthC([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.granite.replication.hc.impl.ReplicationTransportUsersHealthCheck")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthC");
            return method != null
                ? (await ((Task<ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheck")]
        public async Task<ActionResult<ComAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckInfo>> _ComAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheck([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.granite.repository.hc.impl.AuthorizableNodeNameHealthCheck")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheck");
            return method != null
                ? (await ((Task<ComAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthC")]
        public async Task<ActionResult<ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCInfo>> _ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthC([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.granite.repository.hc.impl.content.sling.SlingContentHealthCheck")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthC");
            return method != null
                ? (await ((Task<ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeGraniteRepositoryHcImplContinuousRGCHealthCheck")]
        public async Task<ActionResult<ComAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckInfo>> _ComAdobeGraniteRepositoryHcImplContinuousRGCHealthCheck([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.granite.repository.hc.impl.ContinuousRGCHealthCheck")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeGraniteRepositoryHcImplContinuousRGCHealthCheck");
            return method != null
                ? (await ((Task<ComAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthChe")]
        public async Task<ActionResult<ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheInfo>> _ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthChe([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.granite.repository.hc.impl.DefaultAccessUserProfileHealthCheck")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthChe");
            return method != null
                ? (await ((Task<ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheck")]
        public async Task<ActionResult<ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckInfo>> _ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheck([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.granite.repository.hc.impl.DefaultLoginsHealthCheck")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheck");
            return method != null
                ? (await ((Task<ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheck")]
        public async Task<ActionResult<ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckInfo>> _ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheck([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.granite.repository.hc.impl.DiskSpaceHealthCheck")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheck");
            return method != null
                ? (await ((Task<ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheck")]
        public async Task<ActionResult<ComAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckInfo>> _ComAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheck([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.granite.repository.hc.impl.ObservationQueueLengthHealthCheck")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheck");
            return method != null
                ? (await ((Task<ComAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeGraniteRepositoryImplCommitStatsConfig")]
        public async Task<ActionResult<ComAdobeGraniteRepositoryImplCommitStatsConfigInfo>> _ComAdobeGraniteRepositoryImplCommitStatsConfig([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.granite.repository.impl.CommitStatsConfig")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeGraniteRepositoryImplCommitStatsConfig");
            return method != null
                ? (await ((Task<ComAdobeGraniteRepositoryImplCommitStatsConfigInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeGraniteRepositoryServiceUserConfiguration")]
        public async Task<ActionResult<ComAdobeGraniteRepositoryServiceUserConfigurationInfo>> _ComAdobeGraniteRepositoryServiceUserConfiguration([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.granite.repository.ServiceUserConfiguration")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeGraniteRepositoryServiceUserConfiguration");
            return method != null
                ? (await ((Task<ComAdobeGraniteRepositoryServiceUserConfigurationInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckIm")]
        public async Task<ActionResult<ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImInfo>> _ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckIm([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.granite.requests.logging.impl.hc.RequestsStatusHealthCheckImpl")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckIm");
            return method != null
                ? (await ((Task<ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeGraniteResourcestatusImplCompositeStatusType")]
        public async Task<ActionResult<ComAdobeGraniteResourcestatusImplCompositeStatusTypeInfo>> _ComAdobeGraniteResourcestatusImplCompositeStatusType([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.granite.resourcestatus.impl.CompositeStatusType")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeGraniteResourcestatusImplCompositeStatusType");
            return method != null
                ? (await ((Task<ComAdobeGraniteResourcestatusImplCompositeStatusTypeInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeGraniteResourcestatusImplStatusResourceProviderImpl")]
        public async Task<ActionResult<ComAdobeGraniteResourcestatusImplStatusResourceProviderImplInfo>> _ComAdobeGraniteResourcestatusImplStatusResourceProviderImpl([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.granite.resourcestatus.impl.StatusResourceProviderImpl")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeGraniteResourcestatusImplStatusResourceProviderImpl");
            return method != null
                ? (await ((Task<ComAdobeGraniteResourcestatusImplStatusResourceProviderImplInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeGraniteRestAssetsImplAssetContentDispositionFilter")]
        public async Task<ActionResult<ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterInfo>> _ComAdobeGraniteRestAssetsImplAssetContentDispositionFilter([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.granite.rest.assets.impl.AssetContentDispositionFilter")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeGraniteRestAssetsImplAssetContentDispositionFilter");
            return method != null
                ? (await ((Task<ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImpl")]
        public async Task<ActionResult<ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplInfo>> _ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImpl([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.granite.rest.impl.ApiEndpointResourceProviderFactoryImpl")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImpl");
            return method != null
                ? (await ((Task<ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeGraniteRestImplServletDefaultGETServlet")]
        public async Task<ActionResult<ComAdobeGraniteRestImplServletDefaultGETServletInfo>> _ComAdobeGraniteRestImplServletDefaultGETServlet([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.granite.rest.impl.servlet.DefaultGETServlet")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeGraniteRestImplServletDefaultGETServlet");
            return method != null
                ? (await ((Task<ComAdobeGraniteRestImplServletDefaultGETServletInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationS")]
        public async Task<ActionResult<ComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSInfo>> _ComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationS([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.granite.security.user.ui.internal.servlets.SSLConfigurationServlet")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationS");
            return method != null
                ? (await ((Task<ComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeGraniteSecurityUserUserPropertiesService")]
        public async Task<ActionResult<ComAdobeGraniteSecurityUserUserPropertiesServiceInfo>> _ComAdobeGraniteSecurityUserUserPropertiesService([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.granite.security.user.UserPropertiesService")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeGraniteSecurityUserUserPropertiesService");
            return method != null
                ? (await ((Task<ComAdobeGraniteSecurityUserUserPropertiesServiceInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeGraniteSocialgraphImplSocialGraphFactoryImpl")]
        public async Task<ActionResult<ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplInfo>> _ComAdobeGraniteSocialgraphImplSocialGraphFactoryImpl([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.granite.socialgraph.impl.SocialGraphFactoryImpl")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeGraniteSocialgraphImplSocialGraphFactoryImpl");
            return method != null
                ? (await ((Task<ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImpl")]
        public async Task<ActionResult<ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplInfo>> _ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImpl([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.granite.system.monitoring.impl.SystemStatsMBeanImpl")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImpl");
            return method != null
                ? (await ((Task<ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactory")]
        public async Task<ActionResult<ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryInfo>> _ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactory([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.granite.taskmanagement.impl.jcr.TaskAdapterFactory")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactory");
            return method != null
                ? (await ((Task<ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeGraniteTaskmanagementImplJcrTaskArchiveService")]
        public async Task<ActionResult<ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceInfo>> _ComAdobeGraniteTaskmanagementImplJcrTaskArchiveService([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.granite.taskmanagement.impl.jcr.TaskArchiveService")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeGraniteTaskmanagementImplJcrTaskArchiveService");
            return method != null
                ? (await ((Task<ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTask")]
        public async Task<ActionResult<ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskInfo>> _ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTask([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.granite.taskmanagement.impl.purge.TaskPurgeMaintenanceTask")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTask");
            return method != null
                ? (await ((Task<ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactor")]
        public async Task<ActionResult<ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorInfo>> _ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactor([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.granite.taskmanagement.impl.service.TaskManagerAdapterFactory")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactor");
            return method != null
                ? (await ((Task<ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeGraniteThreaddumpThreadDumpCollector")]
        public async Task<ActionResult<ComAdobeGraniteThreaddumpThreadDumpCollectorInfo>> _ComAdobeGraniteThreaddumpThreadDumpCollector([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.granite.threaddump.ThreadDumpCollector")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeGraniteThreaddumpThreadDumpCollector");
            return method != null
                ? (await ((Task<ComAdobeGraniteThreaddumpThreadDumpCollectorInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTransl")]
        public async Task<ActionResult<ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslInfo>> _ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTransl([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.granite.translation.connector.msft.core.impl.MicrosoftTranslationServiceFactoryImpl")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTransl");
            return method != null
                ? (await ((Task<ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeGraniteTranslationCoreImplTranslationManagerImpl")]
        public async Task<ActionResult<ComAdobeGraniteTranslationCoreImplTranslationManagerImplInfo>> _ComAdobeGraniteTranslationCoreImplTranslationManagerImpl([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.granite.translation.core.impl.TranslationManagerImpl")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeGraniteTranslationCoreImplTranslationManagerImpl");
            return method != null
                ? (await ((Task<ComAdobeGraniteTranslationCoreImplTranslationManagerImplInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImpl")]
        public async Task<ActionResult<ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplInfo>> _ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImpl([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.granite.ui.clientlibs.impl.HtmlLibraryManagerImpl")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImpl");
            return method != null
                ? (await ((Task<ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeature")]
        public async Task<ActionResult<ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureInfo>> _ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeature([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.granite.workflow.console.frags.WorkflowWithdrawFeature")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeature");
            return method != null
                ? (await ((Task<ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventService")]
        public async Task<ActionResult<ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceInfo>> _ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventService([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.granite.workflow.console.publish.WorkflowPublishEventService")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventService");
            return method != null
                ? (await ((Task<ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManager")]
        public async Task<ActionResult<ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerInfo>> _ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManager([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.granite.workflow.core.jcr.WorkflowBucketManager")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManager");
            return method != null
                ? (await ((Task<ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandler")]
        public async Task<ActionResult<ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerInfo>> _ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandler([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.granite.workflow.core.job.ExternalProcessJobHandler")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandler");
            return method != null
                ? (await ((Task<ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeGraniteWorkflowCoreJobJobHandler")]
        public async Task<ActionResult<ComAdobeGraniteWorkflowCoreJobJobHandlerInfo>> _ComAdobeGraniteWorkflowCoreJobJobHandler([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.granite.workflow.core.job.JobHandler")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeGraniteWorkflowCoreJobJobHandler");
            return method != null
                ? (await ((Task<ComAdobeGraniteWorkflowCoreJobJobHandlerInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsum")]
        public async Task<ActionResult<ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumInfo>> _ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsum([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.granite.workflow.core.offloading.WorkflowOffloadingJobConsumer")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsum");
            return method != null
                ? (await ((Task<ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeGraniteWorkflowCorePayloadMapCache")]
        public async Task<ActionResult<ComAdobeGraniteWorkflowCorePayloadMapCacheInfo>> _ComAdobeGraniteWorkflowCorePayloadMapCache([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.granite.workflow.core.PayloadMapCache")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeGraniteWorkflowCorePayloadMapCache");
            return method != null
                ? (await ((Task<ComAdobeGraniteWorkflowCorePayloadMapCacheInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListener")]
        public async Task<ActionResult<ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerInfo>> _ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListener([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.granite.workflow.core.payloadmap.PayloadMoveListener")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListener");
            return method != null
                ? (await ((Task<ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeGraniteWorkflowCoreWorkflowConfig")]
        public async Task<ActionResult<ComAdobeGraniteWorkflowCoreWorkflowConfigInfo>> _ComAdobeGraniteWorkflowCoreWorkflowConfig([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.granite.workflow.core.WorkflowConfig")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeGraniteWorkflowCoreWorkflowConfig");
            return method != null
                ? (await ((Task<ComAdobeGraniteWorkflowCoreWorkflowConfigInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeGraniteWorkflowCoreWorkflowSessionFactory")]
        public async Task<ActionResult<ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryInfo>> _ComAdobeGraniteWorkflowCoreWorkflowSessionFactory([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.granite.workflow.core.WorkflowSessionFactory")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeGraniteWorkflowCoreWorkflowSessionFactory");
            return method != null
                ? (await ((Task<ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeGraniteWorkflowPurgeScheduler")]
        public async Task<ActionResult<ComAdobeGraniteWorkflowPurgeSchedulerInfo>> _ComAdobeGraniteWorkflowPurgeScheduler([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.granite.workflow.purge.Scheduler")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeGraniteWorkflowPurgeScheduler");
            return method != null
                ? (await ((Task<ComAdobeGraniteWorkflowPurgeSchedulerInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeOctopusNcommBootstrap")]
        public async Task<ActionResult<ComAdobeOctopusNcommBootstrapInfo>> _ComAdobeOctopusNcommBootstrap([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.octopus.ncomm.bootstrap")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeOctopusNcommBootstrap");
            return method != null
                ? (await ((Task<ComAdobeOctopusNcommBootstrapInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullS")]
        public async Task<ActionResult<ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSInfo>> _ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullS([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.social.integrations.livefyre.user.pingforpull.impl.PingPullServlet")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullS");
            return method != null
                ? (await ((Task<ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComAdobeXmpWorkerFilesNcommXMPFilesNComm")]
        public async Task<ActionResult<ComAdobeXmpWorkerFilesNcommXMPFilesNCommInfo>> _ComAdobeXmpWorkerFilesNcommXMPFilesNComm([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.adobe.xmp.worker.files.ncomm.XMPFilesNComm")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComAdobeXmpWorkerFilesNcommXMPFilesNComm");
            return method != null
                ? (await ((Task<ComAdobeXmpWorkerFilesNcommXMPFilesNCommInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCommonsDatasourceJdbcpoolJdbcPoolService")]
        public async Task<ActionResult<ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceInfo>> _ComDayCommonsDatasourceJdbcpoolJdbcPoolService([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.commons.datasource.jdbcpool.JdbcPoolService")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCommonsDatasourceJdbcpoolJdbcPoolService");
            return method != null
                ? (await ((Task<ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCommonsHttpclient")]
        public async Task<ActionResult<ComDayCommonsHttpclientInfo>> _ComDayCommonsHttpclient([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.commons.httpclient")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCommonsHttpclient");
            return method != null
                ? (await ((Task<ComDayCommonsHttpclientInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqAnalyticsImplStorePropertiesChangeListener")]
        public async Task<ActionResult<ComDayCqAnalyticsImplStorePropertiesChangeListenerInfo>> _ComDayCqAnalyticsImplStorePropertiesChangeListener([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.analytics.impl.StorePropertiesChangeListener")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqAnalyticsImplStorePropertiesChangeListener");
            return method != null
                ? (await ((Task<ComDayCqAnalyticsImplStorePropertiesChangeListenerInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporte")]
        public async Task<ActionResult<ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteInfo>> _ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporte([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.analytics.sitecatalyst.impl.exporter.ClassificationsExporter")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporte");
            return method != null
                ? (await ((Task<ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqAnalyticsSitecatalystImplImporterReportImporter")]
        public async Task<ActionResult<ComDayCqAnalyticsSitecatalystImplImporterReportImporterInfo>> _ComDayCqAnalyticsSitecatalystImplImporterReportImporter([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.analytics.sitecatalyst.impl.importer.ReportImporter")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqAnalyticsSitecatalystImplImporterReportImporter");
            return method != null
                ? (await ((Task<ComDayCqAnalyticsSitecatalystImplImporterReportImporterInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactory")]
        public async Task<ActionResult<ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryInfo>> _ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactory([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.analytics.sitecatalyst.impl.SitecatalystAdapterFactory")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactory");
            return method != null
                ? (await ((Task<ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImpl")]
        public async Task<ActionResult<ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplInfo>> _ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImpl([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.analytics.sitecatalyst.impl.SitecatalystHttpClientImpl")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImpl");
            return method != null
                ? (await ((Task<ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdater")]
        public async Task<ActionResult<ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterInfo>> _ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdater([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.analytics.testandtarget.impl.AccountOptionsUpdater")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdater");
            return method != null
                ? (await ((Task<ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListener")]
        public async Task<ActionResult<ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerInfo>> _ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListener([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.analytics.testandtarget.impl.DeleteAuthorActivityListener")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListener");
            return method != null
                ? (await ((Task<ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListener")]
        public async Task<ActionResult<ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerInfo>> _ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListener([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.analytics.testandtarget.impl.PushAuthorCampaignPageListener")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListener");
            return method != null
                ? (await ((Task<ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqAnalyticsTestandtargetImplSegmentImporter")]
        public async Task<ActionResult<ComDayCqAnalyticsTestandtargetImplSegmentImporterInfo>> _ComDayCqAnalyticsTestandtargetImplSegmentImporter([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.analytics.testandtarget.impl.SegmentImporter")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqAnalyticsTestandtargetImplSegmentImporter");
            return method != null
                ? (await ((Task<ComDayCqAnalyticsTestandtargetImplSegmentImporterInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqAnalyticsTestandtargetImplServiceWebServiceImpl")]
        public async Task<ActionResult<ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplInfo>> _ComDayCqAnalyticsTestandtargetImplServiceWebServiceImpl([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.analytics.testandtarget.impl.service.WebServiceImpl")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqAnalyticsTestandtargetImplServiceWebServiceImpl");
            return method != null
                ? (await ((Task<ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqAnalyticsTestandtargetImplServletsAdminServerServlet")]
        public async Task<ActionResult<ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletInfo>> _ComDayCqAnalyticsTestandtargetImplServletsAdminServerServlet([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.analytics.testandtarget.impl.servlets.AdminServerServlet")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqAnalyticsTestandtargetImplServletsAdminServerServlet");
            return method != null
                ? (await ((Task<ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImpl")]
        public async Task<ActionResult<ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplInfo>> _ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImpl([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.analytics.testandtarget.impl.TestandtargetHttpClientImpl")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImpl");
            return method != null
                ? (await ((Task<ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqAuthImplCugCugSupportImpl")]
        public async Task<ActionResult<ComDayCqAuthImplCugCugSupportImplInfo>> _ComDayCqAuthImplCugCugSupportImpl([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.auth.impl.cug.CugSupportImpl")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqAuthImplCugCugSupportImpl");
            return method != null
                ? (await ((Task<ComDayCqAuthImplCugCugSupportImplInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqAuthImplLoginSelectorHandler")]
        public async Task<ActionResult<ComDayCqAuthImplLoginSelectorHandlerInfo>> _ComDayCqAuthImplLoginSelectorHandler([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.auth.impl.LoginSelectorHandler")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqAuthImplLoginSelectorHandler");
            return method != null
                ? (await ((Task<ComDayCqAuthImplLoginSelectorHandlerInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqCommonsImplExternalizerImpl")]
        public async Task<ActionResult<ComDayCqCommonsImplExternalizerImplInfo>> _ComDayCqCommonsImplExternalizerImpl([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.commons.impl.ExternalizerImpl")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqCommonsImplExternalizerImpl");
            return method != null
                ? (await ((Task<ComDayCqCommonsImplExternalizerImplInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqCommonsServletsRootMappingServlet")]
        public async Task<ActionResult<ComDayCqCommonsServletsRootMappingServletInfo>> _ComDayCqCommonsServletsRootMappingServlet([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.commons.servlets.RootMappingServlet")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqCommonsServletsRootMappingServlet");
            return method != null
                ? (await ((Task<ComDayCqCommonsServletsRootMappingServletInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionChecke")]
        public async Task<ActionResult<ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeInfo>> _ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionChecke([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.compat.codeupgrade.impl.CodeUpgradeExecutionConditionChecker")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionChecke");
            return method != null
                ? (await ((Task<ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreList")]
        public async Task<ActionResult<ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListInfo>> _ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreList([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.compat.codeupgrade.impl.UpgradeTaskIgnoreList")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreList");
            return method != null
                ? (await ((Task<ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelist")]
        public async Task<ActionResult<ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistInfo>> _ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelist([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.compat.codeupgrade.impl.VersionRangeTaskIgnorelist")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelist");
            return method != null
                ? (await ((Task<ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqContentsyncImplContentSyncManagerImpl")]
        public async Task<ActionResult<ComDayCqContentsyncImplContentSyncManagerImplInfo>> _ComDayCqContentsyncImplContentSyncManagerImpl([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.contentsync.impl.ContentSyncManagerImpl")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqContentsyncImplContentSyncManagerImpl");
            return method != null
                ? (await ((Task<ComDayCqContentsyncImplContentSyncManagerImplInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqDamCommonsHandlerStandardImageHandler")]
        public async Task<ActionResult<ComDayCqDamCommonsHandlerStandardImageHandlerInfo>> _ComDayCqDamCommonsHandlerStandardImageHandler([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.dam.commons.handler.StandardImageHandler")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqDamCommonsHandlerStandardImageHandler");
            return method != null
                ? (await ((Task<ComDayCqDamCommonsHandlerStandardImageHandlerInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqDamCommonsMetadataXmpFilterBlackWhite")]
        public async Task<ActionResult<ComDayCqDamCommonsMetadataXmpFilterBlackWhiteInfo>> _ComDayCqDamCommonsMetadataXmpFilterBlackWhite([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.dam.commons.metadata.XmpFilterBlackWhite")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqDamCommonsMetadataXmpFilterBlackWhite");
            return method != null
                ? (await ((Task<ComDayCqDamCommonsMetadataXmpFilterBlackWhiteInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqDamCommonsUtilImplAssetCacheImpl")]
        public async Task<ActionResult<ComDayCqDamCommonsUtilImplAssetCacheImplInfo>> _ComDayCqDamCommonsUtilImplAssetCacheImpl([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.dam.commons.util.impl.AssetCacheImpl")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqDamCommonsUtilImplAssetCacheImpl");
            return method != null
                ? (await ((Task<ComDayCqDamCommonsUtilImplAssetCacheImplInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfig")]
        public async Task<ActionResult<ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigInfo>> _ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfig([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.dam.core.impl.annotation.pdf.AnnotationPdfConfig")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfig");
            return method != null
                ? (await ((Task<ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqDamCoreImplAssetMoveListener")]
        public async Task<ActionResult<ComDayCqDamCoreImplAssetMoveListenerInfo>> _ComDayCqDamCoreImplAssetMoveListener([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.dam.core.impl.AssetMoveListener")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqDamCoreImplAssetMoveListener");
            return method != null
                ? (await ((Task<ComDayCqDamCoreImplAssetMoveListenerInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqDamCoreImplAssethomeAssetHomePageConfiguration")]
        public async Task<ActionResult<ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationInfo>> _ComDayCqDamCoreImplAssethomeAssetHomePageConfiguration([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.dam.core.impl.assethome.AssetHomePageConfiguration")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqDamCoreImplAssethomeAssetHomePageConfiguration");
            return method != null
                ? (await ((Task<ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServlet")]
        public async Task<ActionResult<ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletInfo>> _ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServlet([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.dam.core.impl.assetlinkshare.AdhocAssetShareProxyServlet")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServlet");
            return method != null
                ? (await ((Task<ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqDamCoreImplCacheCQBufferedImageCache")]
        public async Task<ActionResult<ComDayCqDamCoreImplCacheCQBufferedImageCacheInfo>> _ComDayCqDamCoreImplCacheCQBufferedImageCache([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.dam.core.impl.cache.CQBufferedImageCache")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqDamCoreImplCacheCQBufferedImageCache");
            return method != null
                ? (await ((Task<ComDayCqDamCoreImplCacheCQBufferedImageCacheInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqDamCoreImplDamChangeEventListener")]
        public async Task<ActionResult<ComDayCqDamCoreImplDamChangeEventListenerInfo>> _ComDayCqDamCoreImplDamChangeEventListener([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.dam.core.impl.DamChangeEventListener")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqDamCoreImplDamChangeEventListener");
            return method != null
                ? (await ((Task<ComDayCqDamCoreImplDamChangeEventListenerInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqDamCoreImplDamEventPurgeService")]
        public async Task<ActionResult<ComDayCqDamCoreImplDamEventPurgeServiceInfo>> _ComDayCqDamCoreImplDamEventPurgeService([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.dam.core.impl.DamEventPurgeService")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqDamCoreImplDamEventPurgeService");
            return method != null
                ? (await ((Task<ComDayCqDamCoreImplDamEventPurgeServiceInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqDamCoreImplDamEventRecorderImpl")]
        public async Task<ActionResult<ComDayCqDamCoreImplDamEventRecorderImplInfo>> _ComDayCqDamCoreImplDamEventRecorderImpl([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.dam.core.impl.DamEventRecorderImpl")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqDamCoreImplDamEventRecorderImpl");
            return method != null
                ? (await ((Task<ComDayCqDamCoreImplDamEventRecorderImplInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqDamCoreImplEventDamEventAuditListener")]
        public async Task<ActionResult<ComDayCqDamCoreImplEventDamEventAuditListenerInfo>> _ComDayCqDamCoreImplEventDamEventAuditListener([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.dam.core.impl.event.DamEventAuditListener")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqDamCoreImplEventDamEventAuditListener");
            return method != null
                ? (await ((Task<ComDayCqDamCoreImplEventDamEventAuditListenerInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqDamCoreImplExpiryNotificationJobImpl")]
        public async Task<ActionResult<ComDayCqDamCoreImplExpiryNotificationJobImplInfo>> _ComDayCqDamCoreImplExpiryNotificationJobImpl([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.dam.core.impl.ExpiryNotificationJobImpl")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqDamCoreImplExpiryNotificationJobImpl");
            return method != null
                ? (await ((Task<ComDayCqDamCoreImplExpiryNotificationJobImplInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeat")]
        public async Task<ActionResult<ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatInfo>> _ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeat([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.dam.core.impl.foldermetadataschema.FolderMetadataSchemaFeatureFlag")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeat");
            return method != null
                ? (await ((Task<ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqDamCoreImplGfxCommonsGfxRenderer")]
        public async Task<ActionResult<ComDayCqDamCoreImplGfxCommonsGfxRendererInfo>> _ComDayCqDamCoreImplGfxCommonsGfxRenderer([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.dam.core.impl.gfx.CommonsGfxRenderer")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqDamCoreImplGfxCommonsGfxRenderer");
            return method != null
                ? (await ((Task<ComDayCqDamCoreImplGfxCommonsGfxRendererInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqDamCoreImplHandlerEPSFormatHandler")]
        public async Task<ActionResult<ComDayCqDamCoreImplHandlerEPSFormatHandlerInfo>> _ComDayCqDamCoreImplHandlerEPSFormatHandler([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.dam.core.impl.handler.EPSFormatHandler")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqDamCoreImplHandlerEPSFormatHandler");
            return method != null
                ? (await ((Task<ComDayCqDamCoreImplHandlerEPSFormatHandlerInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqDamCoreImplHandlerIndesignFormatHandler")]
        public async Task<ActionResult<ComDayCqDamCoreImplHandlerIndesignFormatHandlerInfo>> _ComDayCqDamCoreImplHandlerIndesignFormatHandler([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.dam.core.impl.handler.IndesignFormatHandler")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqDamCoreImplHandlerIndesignFormatHandler");
            return method != null
                ? (await ((Task<ComDayCqDamCoreImplHandlerIndesignFormatHandlerInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqDamCoreImplHandlerJpegHandler")]
        public async Task<ActionResult<ComDayCqDamCoreImplHandlerJpegHandlerInfo>> _ComDayCqDamCoreImplHandlerJpegHandler([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.dam.core.impl.handler.JpegHandler")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqDamCoreImplHandlerJpegHandler");
            return method != null
                ? (await ((Task<ComDayCqDamCoreImplHandlerJpegHandlerInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqDamCoreImplHandlerXmpNCommXMPHandler")]
        public async Task<ActionResult<ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerInfo>> _ComDayCqDamCoreImplHandlerXmpNCommXMPHandler([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.dam.core.impl.handler.xmp.NCommXMPHandler")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqDamCoreImplHandlerXmpNCommXMPHandler");
            return method != null
                ? (await ((Task<ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqDamCoreImplJmxAssetIndexUpdateMonitor")]
        public async Task<ActionResult<ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorInfo>> _ComDayCqDamCoreImplJmxAssetIndexUpdateMonitor([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.dam.core.impl.jmx.AssetIndexUpdateMonitor")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqDamCoreImplJmxAssetIndexUpdateMonitor");
            return method != null
                ? (await ((Task<ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqDamCoreImplJmxAssetMigrationMBeanImpl")]
        public async Task<ActionResult<ComDayCqDamCoreImplJmxAssetMigrationMBeanImplInfo>> _ComDayCqDamCoreImplJmxAssetMigrationMBeanImpl([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.dam.core.impl.jmx.AssetMigrationMBeanImpl")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqDamCoreImplJmxAssetMigrationMBeanImpl");
            return method != null
                ? (await ((Task<ComDayCqDamCoreImplJmxAssetMigrationMBeanImplInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqDamCoreImplJmxAssetUpdateMonitorImpl")]
        public async Task<ActionResult<ComDayCqDamCoreImplJmxAssetUpdateMonitorImplInfo>> _ComDayCqDamCoreImplJmxAssetUpdateMonitorImpl([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.dam.core.impl.jmx.AssetUpdateMonitorImpl")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqDamCoreImplJmxAssetUpdateMonitorImpl");
            return method != null
                ? (await ((Task<ComDayCqDamCoreImplJmxAssetUpdateMonitorImplInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfig")]
        public async Task<ActionResult<ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigInfo>> _ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfig([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.dam.core.impl.jobs.metadataexport.AsyncMetadataExportConfigProviderService")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfig");
            return method != null
                ? (await ((Task<ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfig")]
        public async Task<ActionResult<ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigInfo>> _ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfig([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.dam.core.impl.jobs.metadataimport.AsyncMetadataImportConfigProviderService")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfig");
            return method != null
                ? (await ((Task<ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqDamCoreImplLightboxLightboxServlet")]
        public async Task<ActionResult<ComDayCqDamCoreImplLightboxLightboxServletInfo>> _ComDayCqDamCoreImplLightboxLightboxServlet([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.dam.core.impl.lightbox.LightboxServlet")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqDamCoreImplLightboxLightboxServlet");
            return method != null
                ? (await ((Task<ComDayCqDamCoreImplLightboxLightboxServletInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqDamCoreImplMetadataEditorSelectComponentHandler")]
        public async Task<ActionResult<ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerInfo>> _ComDayCqDamCoreImplMetadataEditorSelectComponentHandler([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.dam.core.impl.metadata.editor.SelectComponentHandler")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqDamCoreImplMetadataEditorSelectComponentHandler");
            return method != null
                ? (await ((Task<ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelper")]
        public async Task<ActionResult<ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperInfo>> _ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelper([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.dam.core.impl.mimeType.AssetUploadRestrictionHelper")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelper");
            return method != null
                ? (await ((Task<ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImpl")]
        public async Task<ActionResult<ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplInfo>> _ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImpl([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.dam.core.impl.mimeType.DamMimeTypeServiceImpl")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImpl");
            return method != null
                ? (await ((Task<ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqDamCoreImplMissingMetadataNotificationJob")]
        public async Task<ActionResult<ComDayCqDamCoreImplMissingMetadataNotificationJobInfo>> _ComDayCqDamCoreImplMissingMetadataNotificationJob([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.dam.core.impl.MissingMetadataNotificationJob")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqDamCoreImplMissingMetadataNotificationJob");
            return method != null
                ? (await ((Task<ComDayCqDamCoreImplMissingMetadataNotificationJobInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPr")]
        public async Task<ActionResult<ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrInfo>> _ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPr([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.dam.core.impl.process.SendTransientWorkflowCompletedEmailProcess")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPr");
            return method != null
                ? (await ((Task<ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqDamCoreImplProcessTextExtractionProcess")]
        public async Task<ActionResult<ComDayCqDamCoreImplProcessTextExtractionProcessInfo>> _ComDayCqDamCoreImplProcessTextExtractionProcess([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.dam.core.impl.process.TextExtractionProcess")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqDamCoreImplProcessTextExtractionProcess");
            return method != null
                ? (await ((Task<ComDayCqDamCoreImplProcessTextExtractionProcessInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqDamCoreImplRenditionMakerImpl")]
        public async Task<ActionResult<ComDayCqDamCoreImplRenditionMakerImplInfo>> _ComDayCqDamCoreImplRenditionMakerImpl([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.dam.core.impl.RenditionMakerImpl")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqDamCoreImplRenditionMakerImpl");
            return method != null
                ? (await ((Task<ComDayCqDamCoreImplRenditionMakerImplInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqDamCoreImplReportsReportExportService")]
        public async Task<ActionResult<ComDayCqDamCoreImplReportsReportExportServiceInfo>> _ComDayCqDamCoreImplReportsReportExportService([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.dam.core.impl.reports.ReportExportService")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqDamCoreImplReportsReportExportService");
            return method != null
                ? (await ((Task<ComDayCqDamCoreImplReportsReportExportServiceInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqDamCoreImplReportsReportPurgeService")]
        public async Task<ActionResult<ComDayCqDamCoreImplReportsReportPurgeServiceInfo>> _ComDayCqDamCoreImplReportsReportPurgeService([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.dam.core.impl.reports.ReportPurgeService")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqDamCoreImplReportsReportPurgeService");
            return method != null
                ? (await ((Task<ComDayCqDamCoreImplReportsReportPurgeServiceInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqDamCoreImplServletAssetDownloadServlet")]
        public async Task<ActionResult<ComDayCqDamCoreImplServletAssetDownloadServletInfo>> _ComDayCqDamCoreImplServletAssetDownloadServlet([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.dam.core.impl.servlet.AssetDownloadServlet")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqDamCoreImplServletAssetDownloadServlet");
            return method != null
                ? (await ((Task<ComDayCqDamCoreImplServletAssetDownloadServletInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqDamCoreImplServletAssetStatusServlet")]
        public async Task<ActionResult<ComDayCqDamCoreImplServletAssetStatusServletInfo>> _ComDayCqDamCoreImplServletAssetStatusServlet([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.dam.core.impl.servlet.AssetStatusServlet")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqDamCoreImplServletAssetStatusServlet");
            return method != null
                ? (await ((Task<ComDayCqDamCoreImplServletAssetStatusServletInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqDamCoreImplServletAssetXMPSearchServlet")]
        public async Task<ActionResult<ComDayCqDamCoreImplServletAssetXMPSearchServletInfo>> _ComDayCqDamCoreImplServletAssetXMPSearchServlet([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.dam.core.impl.servlet.AssetXMPSearchServlet")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqDamCoreImplServletAssetXMPSearchServlet");
            return method != null
                ? (await ((Task<ComDayCqDamCoreImplServletAssetXMPSearchServletInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqDamCoreImplServletBatchMetadataServlet")]
        public async Task<ActionResult<ComDayCqDamCoreImplServletBatchMetadataServletInfo>> _ComDayCqDamCoreImplServletBatchMetadataServlet([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.dam.core.impl.servlet.BatchMetadataServlet")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqDamCoreImplServletBatchMetadataServlet");
            return method != null
                ? (await ((Task<ComDayCqDamCoreImplServletBatchMetadataServletInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqDamCoreImplServletBinaryProviderServlet")]
        public async Task<ActionResult<ComDayCqDamCoreImplServletBinaryProviderServletInfo>> _ComDayCqDamCoreImplServletBinaryProviderServlet([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.dam.core.impl.servlet.BinaryProviderServlet")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqDamCoreImplServletBinaryProviderServlet");
            return method != null
                ? (await ((Task<ComDayCqDamCoreImplServletBinaryProviderServletInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqDamCoreImplServletCollectionServlet")]
        public async Task<ActionResult<ComDayCqDamCoreImplServletCollectionServletInfo>> _ComDayCqDamCoreImplServletCollectionServlet([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.dam.core.impl.servlet.CollectionServlet")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqDamCoreImplServletCollectionServlet");
            return method != null
                ? (await ((Task<ComDayCqDamCoreImplServletCollectionServletInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqDamCoreImplServletCollectionsServlet")]
        public async Task<ActionResult<ComDayCqDamCoreImplServletCollectionsServletInfo>> _ComDayCqDamCoreImplServletCollectionsServlet([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.dam.core.impl.servlet.CollectionsServlet")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqDamCoreImplServletCollectionsServlet");
            return method != null
                ? (await ((Task<ComDayCqDamCoreImplServletCollectionsServletInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqDamCoreImplServletCompanionServlet")]
        public async Task<ActionResult<ComDayCqDamCoreImplServletCompanionServletInfo>> _ComDayCqDamCoreImplServletCompanionServlet([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.dam.core.impl.servlet.CompanionServlet")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqDamCoreImplServletCompanionServlet");
            return method != null
                ? (await ((Task<ComDayCqDamCoreImplServletCompanionServletInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqDamCoreImplServletCreateAssetServlet")]
        public async Task<ActionResult<ComDayCqDamCoreImplServletCreateAssetServletInfo>> _ComDayCqDamCoreImplServletCreateAssetServlet([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.dam.core.impl.servlet.CreateAssetServlet")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqDamCoreImplServletCreateAssetServlet");
            return method != null
                ? (await ((Task<ComDayCqDamCoreImplServletCreateAssetServletInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqDamCoreImplServletDamContentDispositionFilter")]
        public async Task<ActionResult<ComDayCqDamCoreImplServletDamContentDispositionFilterInfo>> _ComDayCqDamCoreImplServletDamContentDispositionFilter([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.dam.core.impl.servlet.DamContentDispositionFilter")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqDamCoreImplServletDamContentDispositionFilter");
            return method != null
                ? (await ((Task<ComDayCqDamCoreImplServletDamContentDispositionFilterInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqDamCoreImplServletGuidLookupFilter")]
        public async Task<ActionResult<ComDayCqDamCoreImplServletGuidLookupFilterInfo>> _ComDayCqDamCoreImplServletGuidLookupFilter([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.dam.core.impl.servlet.GuidLookupFilter")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqDamCoreImplServletGuidLookupFilter");
            return method != null
                ? (await ((Task<ComDayCqDamCoreImplServletGuidLookupFilterInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqDamCoreImplServletHealthCheckServlet")]
        public async Task<ActionResult<ComDayCqDamCoreImplServletHealthCheckServletInfo>> _ComDayCqDamCoreImplServletHealthCheckServlet([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.dam.core.impl.servlet.HealthCheckServlet")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqDamCoreImplServletHealthCheckServlet");
            return method != null
                ? (await ((Task<ComDayCqDamCoreImplServletHealthCheckServletInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqDamCoreImplServletMetadataGetServlet")]
        public async Task<ActionResult<ComDayCqDamCoreImplServletMetadataGetServletInfo>> _ComDayCqDamCoreImplServletMetadataGetServlet([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.dam.core.impl.servlet.MetadataGetServlet")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqDamCoreImplServletMetadataGetServlet");
            return method != null
                ? (await ((Task<ComDayCqDamCoreImplServletMetadataGetServletInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqDamCoreImplServletMultipleLicenseAcceptServlet")]
        public async Task<ActionResult<ComDayCqDamCoreImplServletMultipleLicenseAcceptServletInfo>> _ComDayCqDamCoreImplServletMultipleLicenseAcceptServlet([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.dam.core.impl.servlet.MultipleLicenseAcceptServlet")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqDamCoreImplServletMultipleLicenseAcceptServlet");
            return method != null
                ? (await ((Task<ComDayCqDamCoreImplServletMultipleLicenseAcceptServletInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqDamCoreImplServletResourceCollectionServlet")]
        public async Task<ActionResult<ComDayCqDamCoreImplServletResourceCollectionServletInfo>> _ComDayCqDamCoreImplServletResourceCollectionServlet([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.dam.core.impl.servlet.ResourceCollectionServlet")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqDamCoreImplServletResourceCollectionServlet");
            return method != null
                ? (await ((Task<ComDayCqDamCoreImplServletResourceCollectionServletInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImpl")]
        public async Task<ActionResult<ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplInfo>> _ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImpl([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.dam.core.impl.ui.preview.FolderPreviewUpdaterImpl")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImpl");
            return method != null
                ? (await ((Task<ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqDamCoreImplUnzipUnzipConfig")]
        public async Task<ActionResult<ComDayCqDamCoreImplUnzipUnzipConfigInfo>> _ComDayCqDamCoreImplUnzipUnzipConfig([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.dam.core.impl.unzip.UnzipConfig")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqDamCoreImplUnzipUnzipConfig");
            return method != null
                ? (await ((Task<ComDayCqDamCoreImplUnzipUnzipConfigInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqDamCoreProcessExifToolExtractMetadataProcess")]
        public async Task<ActionResult<ComDayCqDamCoreProcessExifToolExtractMetadataProcessInfo>> _ComDayCqDamCoreProcessExifToolExtractMetadataProcess([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.dam.core.process.ExifToolExtractMetadataProcess")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqDamCoreProcessExifToolExtractMetadataProcess");
            return method != null
                ? (await ((Task<ComDayCqDamCoreProcessExifToolExtractMetadataProcessInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqDamCoreProcessExtractMetadataProcess")]
        public async Task<ActionResult<ComDayCqDamCoreProcessExtractMetadataProcessInfo>> _ComDayCqDamCoreProcessExtractMetadataProcess([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.dam.core.process.ExtractMetadataProcess")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqDamCoreProcessExtractMetadataProcess");
            return method != null
                ? (await ((Task<ComDayCqDamCoreProcessExtractMetadataProcessInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqDamCoreProcessMetadataProcessorProcess")]
        public async Task<ActionResult<ComDayCqDamCoreProcessMetadataProcessorProcessInfo>> _ComDayCqDamCoreProcessMetadataProcessorProcess([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.dam.core.process.MetadataProcessorProcess")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqDamCoreProcessMetadataProcessorProcess");
            return method != null
                ? (await ((Task<ComDayCqDamCoreProcessMetadataProcessorProcessInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqDamHandlerFfmpegLocatorImpl")]
        public async Task<ActionResult<ComDayCqDamHandlerFfmpegLocatorImplInfo>> _ComDayCqDamHandlerFfmpegLocatorImpl([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.dam.handler.ffmpeg.LocatorImpl")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqDamHandlerFfmpegLocatorImpl");
            return method != null
                ? (await ((Task<ComDayCqDamHandlerFfmpegLocatorImplInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImpl")]
        public async Task<ActionResult<ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplInfo>> _ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImpl([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.dam.handler.gibson.fontmanager.impl.FontManagerServiceImpl")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImpl");
            return method != null
                ? (await ((Task<ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqDamHandlerStandardPdfPdfHandler")]
        public async Task<ActionResult<ComDayCqDamHandlerStandardPdfPdfHandlerInfo>> _ComDayCqDamHandlerStandardPdfPdfHandler([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.dam.handler.standard.pdf.PdfHandler")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqDamHandlerStandardPdfPdfHandler");
            return method != null
                ? (await ((Task<ComDayCqDamHandlerStandardPdfPdfHandlerInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqDamHandlerStandardPsPostScriptHandler")]
        public async Task<ActionResult<ComDayCqDamHandlerStandardPsPostScriptHandlerInfo>> _ComDayCqDamHandlerStandardPsPostScriptHandler([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.dam.handler.standard.ps.PostScriptHandler")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqDamHandlerStandardPsPostScriptHandler");
            return method != null
                ? (await ((Task<ComDayCqDamHandlerStandardPsPostScriptHandlerInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqDamHandlerStandardPsdPsdHandler")]
        public async Task<ActionResult<ComDayCqDamHandlerStandardPsdPsdHandlerInfo>> _ComDayCqDamHandlerStandardPsdPsdHandler([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.dam.handler.standard.psd.PsdHandler")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqDamHandlerStandardPsdPsdHandler");
            return method != null
                ? (await ((Task<ComDayCqDamHandlerStandardPsdPsdHandlerInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqDamIdsImplIDSJobProcessor")]
        public async Task<ActionResult<ComDayCqDamIdsImplIDSJobProcessorInfo>> _ComDayCqDamIdsImplIDSJobProcessor([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.dam.ids.impl.IDSJobProcessor")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqDamIdsImplIDSJobProcessor");
            return method != null
                ? (await ((Task<ComDayCqDamIdsImplIDSJobProcessorInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqDamIdsImplIDSPoolManagerImpl")]
        public async Task<ActionResult<ComDayCqDamIdsImplIDSPoolManagerImplInfo>> _ComDayCqDamIdsImplIDSPoolManagerImpl([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.dam.ids.impl.IDSPoolManagerImpl")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqDamIdsImplIDSPoolManagerImpl");
            return method != null
                ? (await ((Task<ComDayCqDamIdsImplIDSPoolManagerImplInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqDamInddImplHandlerIndesignXMPHandler")]
        public async Task<ActionResult<ComDayCqDamInddImplHandlerIndesignXMPHandlerInfo>> _ComDayCqDamInddImplHandlerIndesignXMPHandler([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.dam.indd.impl.handler.IndesignXMPHandler")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqDamInddImplHandlerIndesignXMPHandler");
            return method != null
                ? (await ((Task<ComDayCqDamInddImplHandlerIndesignXMPHandlerInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqDamInddImplServletSnippetCreationServlet")]
        public async Task<ActionResult<ComDayCqDamInddImplServletSnippetCreationServletInfo>> _ComDayCqDamInddImplServletSnippetCreationServlet([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.dam.indd.impl.servlet.SnippetCreationServlet")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqDamInddImplServletSnippetCreationServlet");
            return method != null
                ? (await ((Task<ComDayCqDamInddImplServletSnippetCreationServletInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqDamInddProcessINDDMediaExtractProcess")]
        public async Task<ActionResult<ComDayCqDamInddProcessINDDMediaExtractProcessInfo>> _ComDayCqDamInddProcessINDDMediaExtractProcess([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.dam.indd.process.INDDMediaExtractProcess")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqDamInddProcessINDDMediaExtractProcess");
            return method != null
                ? (await ((Task<ComDayCqDamInddProcessINDDMediaExtractProcessInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImpl")]
        public async Task<ActionResult<ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplInfo>> _ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImpl([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.dam.performance.internal.AssetPerformanceDataHandlerImpl")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImpl");
            return method != null
                ? (await ((Task<ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJob")]
        public async Task<ActionResult<ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobInfo>> _ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJob([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.dam.performance.internal.AssetPerformanceReportSyncJob")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJob");
            return method != null
                ? (await ((Task<ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadPro")]
        public async Task<ActionResult<ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProInfo>> _ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadPro([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.dam.pim.impl.sourcing.upload.process.ProductAssetsUploadProcess")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadPro");
            return method != null
                ? (await ((Task<ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEven")]
        public async Task<ActionResult<ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenInfo>> _ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEven([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.dam.s7dam.common.analytics.impl.S7damDynamicMediaConfigEventListener")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEven");
            return method != null
                ? (await ((Task<ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunner")]
        public async Task<ActionResult<ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerInfo>> _ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunner([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.dam.s7dam.common.analytics.impl.SiteCatalystReportRunner")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunner");
            return method != null
                ? (await ((Task<ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqDamS7damCommonPostServletsSetCreateHandler")]
        public async Task<ActionResult<ComDayCqDamS7damCommonPostServletsSetCreateHandlerInfo>> _ComDayCqDamS7damCommonPostServletsSetCreateHandler([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.dam.s7dam.common.post.servlets.SetCreateHandler")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqDamS7damCommonPostServletsSetCreateHandler");
            return method != null
                ? (await ((Task<ComDayCqDamS7damCommonPostServletsSetCreateHandlerInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqDamS7damCommonPostServletsSetModifyHandler")]
        public async Task<ActionResult<ComDayCqDamS7damCommonPostServletsSetModifyHandlerInfo>> _ComDayCqDamS7damCommonPostServletsSetModifyHandler([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.dam.s7dam.common.post.servlets.SetModifyHandler")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqDamS7damCommonPostServletsSetModifyHandler");
            return method != null
                ? (await ((Task<ComDayCqDamS7damCommonPostServletsSetModifyHandlerInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcess")]
        public async Task<ActionResult<ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessInfo>> _ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcess([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.dam.s7dam.common.process.VideoThumbnailDownloadProcess")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcess");
            return method != null
                ? (await ((Task<ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqDamS7damCommonS7damDamChangeEventListener")]
        public async Task<ActionResult<ComDayCqDamS7damCommonS7damDamChangeEventListenerInfo>> _ComDayCqDamS7damCommonS7damDamChangeEventListener([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.dam.s7dam.common.S7damDamChangeEventListener")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqDamS7damCommonS7damDamChangeEventListener");
            return method != null
                ? (await ((Task<ComDayCqDamS7damCommonS7damDamChangeEventListenerInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqDamS7damCommonServletsS7damProductInfoServlet")]
        public async Task<ActionResult<ComDayCqDamS7damCommonServletsS7damProductInfoServletInfo>> _ComDayCqDamS7damCommonServletsS7damProductInfoServlet([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.dam.s7dam.common.servlets.S7damProductInfoServlet")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqDamS7damCommonServletsS7damProductInfoServlet");
            return method != null
                ? (await ((Task<ComDayCqDamS7damCommonServletsS7damProductInfoServletInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImpl")]
        public async Task<ActionResult<ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplInfo>> _ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImpl([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.dam.s7dam.common.video.impl.VideoProxyClientServiceImpl")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImpl");
            return method != null
                ? (await ((Task<ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqDamScene7ImplScene7APIClientImpl")]
        public async Task<ActionResult<ComDayCqDamScene7ImplScene7APIClientImplInfo>> _ComDayCqDamScene7ImplScene7APIClientImpl([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.dam.scene7.impl.Scene7APIClientImpl")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqDamScene7ImplScene7APIClientImpl");
            return method != null
                ? (await ((Task<ComDayCqDamScene7ImplScene7APIClientImplInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImpl")]
        public async Task<ActionResult<ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplInfo>> _ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImpl([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.dam.scene7.impl.Scene7AssetMimeTypeServiceImpl")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImpl");
            return method != null
                ? (await ((Task<ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqDamScene7ImplScene7ConfigurationEventListener")]
        public async Task<ActionResult<ComDayCqDamScene7ImplScene7ConfigurationEventListenerInfo>> _ComDayCqDamScene7ImplScene7ConfigurationEventListener([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.dam.scene7.impl.Scene7ConfigurationEventListener")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqDamScene7ImplScene7ConfigurationEventListener");
            return method != null
                ? (await ((Task<ComDayCqDamScene7ImplScene7ConfigurationEventListenerInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqDamScene7ImplScene7DamChangeEventListener")]
        public async Task<ActionResult<ComDayCqDamScene7ImplScene7DamChangeEventListenerInfo>> _ComDayCqDamScene7ImplScene7DamChangeEventListener([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.dam.scene7.impl.Scene7DamChangeEventListener")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqDamScene7ImplScene7DamChangeEventListener");
            return method != null
                ? (await ((Task<ComDayCqDamScene7ImplScene7DamChangeEventListenerInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqDamScene7ImplScene7FlashTemplatesServiceImpl")]
        public async Task<ActionResult<ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplInfo>> _ComDayCqDamScene7ImplScene7FlashTemplatesServiceImpl([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.dam.scene7.impl.Scene7FlashTemplatesServiceImpl")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqDamScene7ImplScene7FlashTemplatesServiceImpl");
            return method != null
                ? (await ((Task<ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqDamScene7ImplScene7UploadServiceImpl")]
        public async Task<ActionResult<ComDayCqDamScene7ImplScene7UploadServiceImplInfo>> _ComDayCqDamScene7ImplScene7UploadServiceImpl([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.dam.scene7.impl.Scene7UploadServiceImpl")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqDamScene7ImplScene7UploadServiceImpl");
            return method != null
                ? (await ((Task<ComDayCqDamScene7ImplScene7UploadServiceImplInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSer")]
        public async Task<ActionResult<ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerInfo>> _ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSer([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.dam.stock.integration.impl.cache.StockCacheConfigurationServiceImpl")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSer");
            return method != null
                ? (await ((Task<ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqDamStockIntegrationImplConfigurationStockConfiguration")]
        public async Task<ActionResult<ComDayCqDamStockIntegrationImplConfigurationStockConfigurationInfo>> _ComDayCqDamStockIntegrationImplConfigurationStockConfiguration([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.dam.stock.integration.impl.configuration.StockConfigurationImpl")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqDamStockIntegrationImplConfigurationStockConfiguration");
            return method != null
                ? (await ((Task<ComDayCqDamStockIntegrationImplConfigurationStockConfigurationInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqDamVideoImplServletVideoTestServlet")]
        public async Task<ActionResult<ComDayCqDamVideoImplServletVideoTestServletInfo>> _ComDayCqDamVideoImplServletVideoTestServlet([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.dam.video.impl.servlet.VideoTestServlet")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqDamVideoImplServletVideoTestServlet");
            return method != null
                ? (await ((Task<ComDayCqDamVideoImplServletVideoTestServletInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqExtwidgetServletsImageSpriteServlet")]
        public async Task<ActionResult<ComDayCqExtwidgetServletsImageSpriteServletInfo>> _ComDayCqExtwidgetServletsImageSpriteServlet([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.extwidget.servlets.ImageSpriteServlet")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqExtwidgetServletsImageSpriteServlet");
            return method != null
                ? (await ((Task<ComDayCqExtwidgetServletsImageSpriteServletInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqImageInternalFontFontHelper")]
        public async Task<ActionResult<ComDayCqImageInternalFontFontHelperInfo>> _ComDayCqImageInternalFontFontHelper([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.image.internal.font.FontHelper")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqImageInternalFontFontHelper");
            return method != null
                ? (await ((Task<ComDayCqImageInternalFontFontHelperInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqJcrclustersupportClusterStartLevelController")]
        public async Task<ActionResult<ComDayCqJcrclustersupportClusterStartLevelControllerInfo>> _ComDayCqJcrclustersupportClusterStartLevelController([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.jcrclustersupport.ClusterStartLevelController")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqJcrclustersupportClusterStartLevelController");
            return method != null
                ? (await ((Task<ComDayCqJcrclustersupportClusterStartLevelControllerInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqMailerDefaultMailService")]
        public async Task<ActionResult<ComDayCqMailerDefaultMailServiceInfo>> _ComDayCqMailerDefaultMailService([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.mailer.DefaultMailService")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqMailerDefaultMailService");
            return method != null
                ? (await ((Task<ComDayCqMailerDefaultMailServiceInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqMailerImplCqMailingService")]
        public async Task<ActionResult<ComDayCqMailerImplCqMailingServiceInfo>> _ComDayCqMailerImplCqMailingService([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.mailer.impl.CqMailingService")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqMailerImplCqMailingService");
            return method != null
                ? (await ((Task<ComDayCqMailerImplCqMailingServiceInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqMailerImplEmailCqEmailTemplateFactory")]
        public async Task<ActionResult<ComDayCqMailerImplEmailCqEmailTemplateFactoryInfo>> _ComDayCqMailerImplEmailCqEmailTemplateFactory([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.mailer.impl.email.CqEmailTemplateFactory")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqMailerImplEmailCqEmailTemplateFactory");
            return method != null
                ? (await ((Task<ComDayCqMailerImplEmailCqEmailTemplateFactoryInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqMailerImplEmailCqRetrieverTemplateFactory")]
        public async Task<ActionResult<ComDayCqMailerImplEmailCqRetrieverTemplateFactoryInfo>> _ComDayCqMailerImplEmailCqRetrieverTemplateFactory([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.mailer.impl.email.CqRetrieverTemplateFactory")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqMailerImplEmailCqRetrieverTemplateFactory");
            return method != null
                ? (await ((Task<ComDayCqMailerImplEmailCqRetrieverTemplateFactoryInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqMcmCampaignImplIntegrationConfigImpl")]
        public async Task<ActionResult<ComDayCqMcmCampaignImplIntegrationConfigImplInfo>> _ComDayCqMcmCampaignImplIntegrationConfigImpl([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.mcm.campaign.impl.IntegrationConfigImpl")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqMcmCampaignImplIntegrationConfigImpl");
            return method != null
                ? (await ((Task<ComDayCqMcmCampaignImplIntegrationConfigImplInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqMcmCampaignImporterPersonalizedTextHandlerFactory")]
        public async Task<ActionResult<ComDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryInfo>> _ComDayCqMcmCampaignImporterPersonalizedTextHandlerFactory([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.mcm.campaign.importer.PersonalizedTextHandlerFactory")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqMcmCampaignImporterPersonalizedTextHandlerFactory");
            return method != null
                ? (await ((Task<ComDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqMcmCoreNewsletterNewsletterEmailServiceImpl")]
        public async Task<ActionResult<ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplInfo>> _ComDayCqMcmCoreNewsletterNewsletterEmailServiceImpl([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.mcm.core.newsletter.NewsletterEmailServiceImpl")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqMcmCoreNewsletterNewsletterEmailServiceImpl");
            return method != null
                ? (await ((Task<ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqMcmImplMCMConfiguration")]
        public async Task<ActionResult<ComDayCqMcmImplMCMConfigurationInfo>> _ComDayCqMcmImplMCMConfiguration([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.mcm.impl.MCMConfiguration")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqMcmImplMCMConfiguration");
            return method != null
                ? (await ((Task<ComDayCqMcmImplMCMConfigurationInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponen")]
        public async Task<ActionResult<ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenInfo>> _ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponen([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.mcm.landingpage.parser.taghandlers.cta.ClickThroughComponentTagHandlerFactory")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponen");
            return method != null
                ? (await ((Task<ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThroug")]
        public async Task<ActionResult<ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougInfo>> _ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThroug([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.mcm.landingpage.parser.taghandlers.cta.GraphicalClickThroughComponentTagHandlerFactory")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThroug");
            return method != null
                ? (await ((Task<ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponent")]
        public async Task<ActionResult<ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponentInfo>> _ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponent([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.mcm.landingpage.parser.taghandlers.cta.LeadFormCTAComponentTagHandlerFactory")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponent");
            return method != null
                ? (await ((Task<ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponentInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHa")]
        public async Task<ActionResult<ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaInfo>> _ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHa([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.mcm.landingpage.parser.taghandlers.mbox.MBoxExperienceTagHandlerFactory")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHa");
            return method != null
                ? (await ((Task<ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagH")]
        public async Task<ActionResult<ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHInfo>> _ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagH([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.mcm.landingpage.parser.taghandlers.mbox.TargetComponentTagHandlerFactory")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagH");
            return method != null
                ? (await ((Task<ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqNotificationImplNotificationServiceImpl")]
        public async Task<ActionResult<ComDayCqNotificationImplNotificationServiceImplInfo>> _ComDayCqNotificationImplNotificationServiceImpl([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.notification.impl.NotificationServiceImpl")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqNotificationImplNotificationServiceImpl");
            return method != null
                ? (await ((Task<ComDayCqNotificationImplNotificationServiceImplInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqPersonalizationImplServletsTargetingConfigurationServlet")]
        public async Task<ActionResult<ComDayCqPersonalizationImplServletsTargetingConfigurationServletInfo>> _ComDayCqPersonalizationImplServletsTargetingConfigurationServlet([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.personalization.impl.servlets.TargetingConfigurationServlet")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqPersonalizationImplServletsTargetingConfigurationServlet");
            return method != null
                ? (await ((Task<ComDayCqPersonalizationImplServletsTargetingConfigurationServletInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqPollingImporterImplManagedPollConfigImpl")]
        public async Task<ActionResult<ComDayCqPollingImporterImplManagedPollConfigImplInfo>> _ComDayCqPollingImporterImplManagedPollConfigImpl([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.polling.importer.impl.ManagedPollConfigImpl")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqPollingImporterImplManagedPollConfigImpl");
            return method != null
                ? (await ((Task<ComDayCqPollingImporterImplManagedPollConfigImplInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqPollingImporterImplManagedPollingImporterImpl")]
        public async Task<ActionResult<ComDayCqPollingImporterImplManagedPollingImporterImplInfo>> _ComDayCqPollingImporterImplManagedPollingImporterImpl([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.polling.importer.impl.ManagedPollingImporterImpl")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqPollingImporterImplManagedPollingImporterImpl");
            return method != null
                ? (await ((Task<ComDayCqPollingImporterImplManagedPollingImporterImplInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqPollingImporterImplPollingImporterImpl")]
        public async Task<ActionResult<ComDayCqPollingImporterImplPollingImporterImplInfo>> _ComDayCqPollingImporterImplPollingImporterImpl([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.polling.importer.impl.PollingImporterImpl")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqPollingImporterImplPollingImporterImpl");
            return method != null
                ? (await ((Task<ComDayCqPollingImporterImplPollingImporterImplInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqReplicationAuditReplicationEventListener")]
        public async Task<ActionResult<ComDayCqReplicationAuditReplicationEventListenerInfo>> _ComDayCqReplicationAuditReplicationEventListener([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.replication.audit.ReplicationEventListener")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqReplicationAuditReplicationEventListener");
            return method != null
                ? (await ((Task<ComDayCqReplicationAuditReplicationEventListenerInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqReplicationContentStaticContentBuilder")]
        public async Task<ActionResult<ComDayCqReplicationContentStaticContentBuilderInfo>> _ComDayCqReplicationContentStaticContentBuilder([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.replication.content.StaticContentBuilder")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqReplicationContentStaticContentBuilder");
            return method != null
                ? (await ((Task<ComDayCqReplicationContentStaticContentBuilderInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqReplicationImplAgentManagerImpl")]
        public async Task<ActionResult<ComDayCqReplicationImplAgentManagerImplInfo>> _ComDayCqReplicationImplAgentManagerImpl([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.replication.impl.AgentManagerImpl")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqReplicationImplAgentManagerImpl");
            return method != null
                ? (await ((Task<ComDayCqReplicationImplAgentManagerImplInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqReplicationImplContentDurboBinaryLessContentBuilder")]
        public async Task<ActionResult<ComDayCqReplicationImplContentDurboBinaryLessContentBuilderInfo>> _ComDayCqReplicationImplContentDurboBinaryLessContentBuilder([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.replication.impl.content.durbo.BinaryLessContentBuilder")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqReplicationImplContentDurboBinaryLessContentBuilder");
            return method != null
                ? (await ((Task<ComDayCqReplicationImplContentDurboBinaryLessContentBuilderInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqReplicationImplContentDurboDurboImportConfigurationProv")]
        public async Task<ActionResult<ComDayCqReplicationImplContentDurboDurboImportConfigurationProvInfo>> _ComDayCqReplicationImplContentDurboDurboImportConfigurationProv([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.replication.impl.content.durbo.DurboImportConfigurationProviderService")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqReplicationImplContentDurboDurboImportConfigurationProv");
            return method != null
                ? (await ((Task<ComDayCqReplicationImplContentDurboDurboImportConfigurationProvInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqReplicationImplReplicationContentFactoryProviderImpl")]
        public async Task<ActionResult<ComDayCqReplicationImplReplicationContentFactoryProviderImplInfo>> _ComDayCqReplicationImplReplicationContentFactoryProviderImpl([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.replication.impl.ReplicationContentFactoryProviderImpl")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqReplicationImplReplicationContentFactoryProviderImpl");
            return method != null
                ? (await ((Task<ComDayCqReplicationImplReplicationContentFactoryProviderImplInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqReplicationImplReplicationReceiverImpl")]
        public async Task<ActionResult<ComDayCqReplicationImplReplicationReceiverImplInfo>> _ComDayCqReplicationImplReplicationReceiverImpl([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.replication.impl.ReplicationReceiverImpl")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqReplicationImplReplicationReceiverImpl");
            return method != null
                ? (await ((Task<ComDayCqReplicationImplReplicationReceiverImplInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqReplicationImplReplicatorImpl")]
        public async Task<ActionResult<ComDayCqReplicationImplReplicatorImplInfo>> _ComDayCqReplicationImplReplicatorImpl([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.replication.impl.ReplicatorImpl")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqReplicationImplReplicatorImpl");
            return method != null
                ? (await ((Task<ComDayCqReplicationImplReplicatorImplInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqReplicationImplReverseReplicator")]
        public async Task<ActionResult<ComDayCqReplicationImplReverseReplicatorInfo>> _ComDayCqReplicationImplReverseReplicator([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.replication.impl.ReverseReplicator")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqReplicationImplReverseReplicator");
            return method != null
                ? (await ((Task<ComDayCqReplicationImplReverseReplicatorInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqReplicationImplTransportBinaryLessTransportHandler")]
        public async Task<ActionResult<ComDayCqReplicationImplTransportBinaryLessTransportHandlerInfo>> _ComDayCqReplicationImplTransportBinaryLessTransportHandler([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.replication.impl.transport.BinaryLessTransportHandler")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqReplicationImplTransportBinaryLessTransportHandler");
            return method != null
                ? (await ((Task<ComDayCqReplicationImplTransportBinaryLessTransportHandlerInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqReplicationImplTransportHttp")]
        public async Task<ActionResult<ComDayCqReplicationImplTransportHttpInfo>> _ComDayCqReplicationImplTransportHttp([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.replication.impl.transport.Http")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqReplicationImplTransportHttp");
            return method != null
                ? (await ((Task<ComDayCqReplicationImplTransportHttpInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqReportingImplCacheCacheImpl")]
        public async Task<ActionResult<ComDayCqReportingImplCacheCacheImplInfo>> _ComDayCqReportingImplCacheCacheImpl([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.reporting.impl.cache.CacheImpl")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqReportingImplCacheCacheImpl");
            return method != null
                ? (await ((Task<ComDayCqReportingImplCacheCacheImplInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqReportingImplConfigServiceImpl")]
        public async Task<ActionResult<ComDayCqReportingImplConfigServiceImplInfo>> _ComDayCqReportingImplConfigServiceImpl([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.reporting.impl.ConfigServiceImpl")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqReportingImplConfigServiceImpl");
            return method != null
                ? (await ((Task<ComDayCqReportingImplConfigServiceImplInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqReportingImplRLogAnalyzer")]
        public async Task<ActionResult<ComDayCqReportingImplRLogAnalyzerInfo>> _ComDayCqReportingImplRLogAnalyzer([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.reporting.impl.RLogAnalyzer")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqReportingImplRLogAnalyzer");
            return method != null
                ? (await ((Task<ComDayCqReportingImplRLogAnalyzerInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqRewriterLinkcheckerImplLinkCheckerImpl")]
        public async Task<ActionResult<ComDayCqRewriterLinkcheckerImplLinkCheckerImplInfo>> _ComDayCqRewriterLinkcheckerImplLinkCheckerImpl([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.rewriter.linkchecker.impl.LinkCheckerImpl")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqRewriterLinkcheckerImplLinkCheckerImpl");
            return method != null
                ? (await ((Task<ComDayCqRewriterLinkcheckerImplLinkCheckerImplInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqRewriterLinkcheckerImplLinkCheckerTask")]
        public async Task<ActionResult<ComDayCqRewriterLinkcheckerImplLinkCheckerTaskInfo>> _ComDayCqRewriterLinkcheckerImplLinkCheckerTask([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.rewriter.linkchecker.impl.LinkCheckerTask")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqRewriterLinkcheckerImplLinkCheckerTask");
            return method != null
                ? (await ((Task<ComDayCqRewriterLinkcheckerImplLinkCheckerTaskInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactory")]
        public async Task<ActionResult<ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryInfo>> _ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactory([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.rewriter.linkchecker.impl.LinkCheckerTransformerFactory")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactory");
            return method != null
                ? (await ((Task<ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqRewriterLinkcheckerImplLinkInfoStorageImpl")]
        public async Task<ActionResult<ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplInfo>> _ComDayCqRewriterLinkcheckerImplLinkInfoStorageImpl([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.rewriter.linkchecker.impl.LinkInfoStorageImpl")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqRewriterLinkcheckerImplLinkInfoStorageImpl");
            return method != null
                ? (await ((Task<ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqRewriterProcessorImplHtmlParserFactory")]
        public async Task<ActionResult<ComDayCqRewriterProcessorImplHtmlParserFactoryInfo>> _ComDayCqRewriterProcessorImplHtmlParserFactory([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.rewriter.processor.impl.HtmlParserFactory")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqRewriterProcessorImplHtmlParserFactory");
            return method != null
                ? (await ((Task<ComDayCqRewriterProcessorImplHtmlParserFactoryInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqSearchImplBuilderQueryBuilderImpl")]
        public async Task<ActionResult<ComDayCqSearchImplBuilderQueryBuilderImplInfo>> _ComDayCqSearchImplBuilderQueryBuilderImpl([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.search.impl.builder.QueryBuilderImpl")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqSearchImplBuilderQueryBuilderImpl");
            return method != null
                ? (await ((Task<ComDayCqSearchImplBuilderQueryBuilderImplInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqSearchSuggestImplSuggestionIndexManagerImpl")]
        public async Task<ActionResult<ComDayCqSearchSuggestImplSuggestionIndexManagerImplInfo>> _ComDayCqSearchSuggestImplSuggestionIndexManagerImpl([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.search.suggest.impl.SuggestionIndexManagerImpl")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqSearchSuggestImplSuggestionIndexManagerImpl");
            return method != null
                ? (await ((Task<ComDayCqSearchSuggestImplSuggestionIndexManagerImplInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandler")]
        public async Task<ActionResult<ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerInfo>> _ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandler([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.searchpromote.impl.PublishSearchPromoteConfigHandler")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandler");
            return method != null
                ? (await ((Task<ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqSearchpromoteImplSearchPromoteServiceImpl")]
        public async Task<ActionResult<ComDayCqSearchpromoteImplSearchPromoteServiceImplInfo>> _ComDayCqSearchpromoteImplSearchPromoteServiceImpl([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.searchpromote.impl.SearchPromoteServiceImpl")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqSearchpromoteImplSearchPromoteServiceImpl");
            return method != null
                ? (await ((Task<ComDayCqSearchpromoteImplSearchPromoteServiceImplInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqSecurityACLSetup")]
        public async Task<ActionResult<ComDayCqSecurityACLSetupInfo>> _ComDayCqSecurityACLSetup([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.security.ACLSetup")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqSecurityACLSetup");
            return method != null
                ? (await ((Task<ComDayCqSecurityACLSetupInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqStatisticsImplStatisticsServiceImpl")]
        public async Task<ActionResult<ComDayCqStatisticsImplStatisticsServiceImplInfo>> _ComDayCqStatisticsImplStatisticsServiceImpl([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.statistics.impl.StatisticsServiceImpl")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqStatisticsImplStatisticsServiceImpl");
            return method != null
                ? (await ((Task<ComDayCqStatisticsImplStatisticsServiceImplInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqTaggingImplJcrTagManagerFactoryImpl")]
        public async Task<ActionResult<ComDayCqTaggingImplJcrTagManagerFactoryImplInfo>> _ComDayCqTaggingImplJcrTagManagerFactoryImpl([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.tagging.impl.JcrTagManagerFactoryImpl")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqTaggingImplJcrTagManagerFactoryImpl");
            return method != null
                ? (await ((Task<ComDayCqTaggingImplJcrTagManagerFactoryImplInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqTaggingImplSearchTagPredicateEvaluator")]
        public async Task<ActionResult<ComDayCqTaggingImplSearchTagPredicateEvaluatorInfo>> _ComDayCqTaggingImplSearchTagPredicateEvaluator([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.tagging.impl.search.TagPredicateEvaluator")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqTaggingImplSearchTagPredicateEvaluator");
            return method != null
                ? (await ((Task<ComDayCqTaggingImplSearchTagPredicateEvaluatorInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqTaggingImplTagGarbageCollector")]
        public async Task<ActionResult<ComDayCqTaggingImplTagGarbageCollectorInfo>> _ComDayCqTaggingImplTagGarbageCollector([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.tagging.impl.TagGarbageCollector")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqTaggingImplTagGarbageCollector");
            return method != null
                ? (await ((Task<ComDayCqTaggingImplTagGarbageCollectorInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqWcmContentsyncImplHandlerPagesUpdateHandler")]
        public async Task<ActionResult<ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerInfo>> _ComDayCqWcmContentsyncImplHandlerPagesUpdateHandler([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.wcm.contentsync.impl.handler.PagesUpdateHandler")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqWcmContentsyncImplHandlerPagesUpdateHandler");
            return method != null
                ? (await ((Task<ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactor")]
        public async Task<ActionResult<ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorInfo>> _ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactor([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.wcm.contentsync.impl.rewriter.PathRewriterTransformerFactory")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactor");
            return method != null
                ? (await ((Task<ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqWcmCoreImplAuthoringUIModeServiceImpl")]
        public async Task<ActionResult<ComDayCqWcmCoreImplAuthoringUIModeServiceImplInfo>> _ComDayCqWcmCoreImplAuthoringUIModeServiceImpl([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.wcm.core.impl.AuthoringUIModeServiceImpl")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqWcmCoreImplAuthoringUIModeServiceImpl");
            return method != null
                ? (await ((Task<ComDayCqWcmCoreImplAuthoringUIModeServiceImplInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqWcmCoreImplCommandsWCMCommandServlet")]
        public async Task<ActionResult<ComDayCqWcmCoreImplCommandsWCMCommandServletInfo>> _ComDayCqWcmCoreImplCommandsWCMCommandServlet([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.wcm.core.impl.commands.WCMCommandServlet")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqWcmCoreImplCommandsWCMCommandServlet");
            return method != null
                ? (await ((Task<ComDayCqWcmCoreImplCommandsWCMCommandServletInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImpl")]
        public async Task<ActionResult<ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplInfo>> _ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImpl([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.wcm.core.impl.devicedetection.DeviceIdentificationModeImpl")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImpl");
            return method != null
                ? (await ((Task<ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqWcmCoreImplEventPageEventAuditListener")]
        public async Task<ActionResult<ComDayCqWcmCoreImplEventPageEventAuditListenerInfo>> _ComDayCqWcmCoreImplEventPageEventAuditListener([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.wcm.core.impl.event.PageEventAuditListener")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqWcmCoreImplEventPageEventAuditListener");
            return method != null
                ? (await ((Task<ComDayCqWcmCoreImplEventPageEventAuditListenerInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqWcmCoreImplEventPagePostProcessor")]
        public async Task<ActionResult<ComDayCqWcmCoreImplEventPagePostProcessorInfo>> _ComDayCqWcmCoreImplEventPagePostProcessor([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.wcm.core.impl.event.PagePostProcessor")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqWcmCoreImplEventPagePostProcessor");
            return method != null
                ? (await ((Task<ComDayCqWcmCoreImplEventPagePostProcessorInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqWcmCoreImplEventRepositoryChangeEventListener")]
        public async Task<ActionResult<ComDayCqWcmCoreImplEventRepositoryChangeEventListenerInfo>> _ComDayCqWcmCoreImplEventRepositoryChangeEventListener([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.wcm.core.impl.event.RepositoryChangeEventListener")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqWcmCoreImplEventRepositoryChangeEventListener");
            return method != null
                ? (await ((Task<ComDayCqWcmCoreImplEventRepositoryChangeEventListenerInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqWcmCoreImplEventTemplatePostProcessor")]
        public async Task<ActionResult<ComDayCqWcmCoreImplEventTemplatePostProcessorInfo>> _ComDayCqWcmCoreImplEventTemplatePostProcessor([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.wcm.core.impl.event.TemplatePostProcessor")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqWcmCoreImplEventTemplatePostProcessor");
            return method != null
                ? (await ((Task<ComDayCqWcmCoreImplEventTemplatePostProcessorInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqWcmCoreImplLanguageManagerImpl")]
        public async Task<ActionResult<ComDayCqWcmCoreImplLanguageManagerImplInfo>> _ComDayCqWcmCoreImplLanguageManagerImpl([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.wcm.core.impl.LanguageManagerImpl")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqWcmCoreImplLanguageManagerImpl");
            return method != null
                ? (await ((Task<ComDayCqWcmCoreImplLanguageManagerImplInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImpl")]
        public async Task<ActionResult<ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplInfo>> _ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImpl([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.wcm.core.impl.LinkCheckerConfigurationFactoryImpl")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImpl");
            return method != null
                ? (await ((Task<ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqWcmCoreImplPagePageInfoAggregatorImpl")]
        public async Task<ActionResult<ComDayCqWcmCoreImplPagePageInfoAggregatorImplInfo>> _ComDayCqWcmCoreImplPagePageInfoAggregatorImpl([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.wcm.core.impl.page.PageInfoAggregatorImpl")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqWcmCoreImplPagePageInfoAggregatorImpl");
            return method != null
                ? (await ((Task<ComDayCqWcmCoreImplPagePageInfoAggregatorImplInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqWcmCoreImplPagePageManagerFactoryImpl")]
        public async Task<ActionResult<ComDayCqWcmCoreImplPagePageManagerFactoryImplInfo>> _ComDayCqWcmCoreImplPagePageManagerFactoryImpl([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.wcm.core.impl.page.PageManagerFactoryImpl")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqWcmCoreImplPagePageManagerFactoryImpl");
            return method != null
                ? (await ((Task<ComDayCqWcmCoreImplPagePageManagerFactoryImplInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqWcmCoreImplReferencesContentContentReferenceConfig")]
        public async Task<ActionResult<ComDayCqWcmCoreImplReferencesContentContentReferenceConfigInfo>> _ComDayCqWcmCoreImplReferencesContentContentReferenceConfig([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.wcm.core.impl.references.content.ContentReferenceConfig")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqWcmCoreImplReferencesContentContentReferenceConfig");
            return method != null
                ? (await ((Task<ComDayCqWcmCoreImplReferencesContentContentReferenceConfigInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqWcmCoreImplServletsContentfinderAssetViewHandler")]
        public async Task<ActionResult<ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerInfo>> _ComDayCqWcmCoreImplServletsContentfinderAssetViewHandler([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.wcm.core.impl.servlets.contentfinder.AssetViewHandler")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqWcmCoreImplServletsContentfinderAssetViewHandler");
            return method != null
                ? (await ((Task<ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVie")]
        public async Task<ActionResult<ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieInfo>> _ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVie([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.wcm.core.impl.servlets.contentfinder.connector.ConnectorViewHandler")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVie");
            return method != null
                ? (await ((Task<ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqWcmCoreImplServletsContentfinderPageViewHandler")]
        public async Task<ActionResult<ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerInfo>> _ComDayCqWcmCoreImplServletsContentfinderPageViewHandler([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.wcm.core.impl.servlets.contentfinder.PageViewHandler")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqWcmCoreImplServletsContentfinderPageViewHandler");
            return method != null
                ? (await ((Task<ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqWcmCoreImplServletsFindReplaceServlet")]
        public async Task<ActionResult<ComDayCqWcmCoreImplServletsFindReplaceServletInfo>> _ComDayCqWcmCoreImplServletsFindReplaceServlet([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.wcm.core.impl.servlets.FindReplaceServlet")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqWcmCoreImplServletsFindReplaceServlet");
            return method != null
                ? (await ((Task<ComDayCqWcmCoreImplServletsFindReplaceServletInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqWcmCoreImplServletsReferenceSearchServlet")]
        public async Task<ActionResult<ComDayCqWcmCoreImplServletsReferenceSearchServletInfo>> _ComDayCqWcmCoreImplServletsReferenceSearchServlet([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.wcm.core.impl.servlets.ReferenceSearchServlet")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqWcmCoreImplServletsReferenceSearchServlet");
            return method != null
                ? (await ((Task<ComDayCqWcmCoreImplServletsReferenceSearchServletInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqWcmCoreImplServletsThumbnailServlet")]
        public async Task<ActionResult<ComDayCqWcmCoreImplServletsThumbnailServletInfo>> _ComDayCqWcmCoreImplServletsThumbnailServlet([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.wcm.core.impl.servlets.ThumbnailServlet")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqWcmCoreImplServletsThumbnailServlet");
            return method != null
                ? (await ((Task<ComDayCqWcmCoreImplServletsThumbnailServletInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqWcmCoreImplUtilsDefaultPageNameValidator")]
        public async Task<ActionResult<ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorInfo>> _ComDayCqWcmCoreImplUtilsDefaultPageNameValidator([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.wcm.core.impl.utils.DefaultPageNameValidator")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqWcmCoreImplUtilsDefaultPageNameValidator");
            return method != null
                ? (await ((Task<ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqWcmCoreImplVariantsPageVariantsProviderImpl")]
        public async Task<ActionResult<ComDayCqWcmCoreImplVariantsPageVariantsProviderImplInfo>> _ComDayCqWcmCoreImplVariantsPageVariantsProviderImpl([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.wcm.core.impl.variants.PageVariantsProviderImpl")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqWcmCoreImplVariantsPageVariantsProviderImpl");
            return method != null
                ? (await ((Task<ComDayCqWcmCoreImplVariantsPageVariantsProviderImplInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqWcmCoreImplVersionManagerImpl")]
        public async Task<ActionResult<ComDayCqWcmCoreImplVersionManagerImplInfo>> _ComDayCqWcmCoreImplVersionManagerImpl([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.wcm.core.impl.VersionManagerImpl")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqWcmCoreImplVersionManagerImpl");
            return method != null
                ? (await ((Task<ComDayCqWcmCoreImplVersionManagerImplInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqWcmCoreImplVersionPurgeTask")]
        public async Task<ActionResult<ComDayCqWcmCoreImplVersionPurgeTaskInfo>> _ComDayCqWcmCoreImplVersionPurgeTask([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.wcm.core.impl.VersionPurgeTask")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqWcmCoreImplVersionPurgeTask");
            return method != null
                ? (await ((Task<ComDayCqWcmCoreImplVersionPurgeTaskInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqWcmCoreImplWCMDebugFilter")]
        public async Task<ActionResult<ComDayCqWcmCoreImplWCMDebugFilterInfo>> _ComDayCqWcmCoreImplWCMDebugFilter([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.wcm.core.impl.WCMDebugFilter")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqWcmCoreImplWCMDebugFilter");
            return method != null
                ? (await ((Task<ComDayCqWcmCoreImplWCMDebugFilterInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqWcmCoreImplWCMDeveloperModeFilter")]
        public async Task<ActionResult<ComDayCqWcmCoreImplWCMDeveloperModeFilterInfo>> _ComDayCqWcmCoreImplWCMDeveloperModeFilter([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.wcm.core.impl.WCMDeveloperModeFilter")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqWcmCoreImplWCMDeveloperModeFilter");
            return method != null
                ? (await ((Task<ComDayCqWcmCoreImplWCMDeveloperModeFilterInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqWcmCoreImplWarpTimeWarpFilter")]
        public async Task<ActionResult<ComDayCqWcmCoreImplWarpTimeWarpFilterInfo>> _ComDayCqWcmCoreImplWarpTimeWarpFilter([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.wcm.core.impl.warp.TimeWarpFilter")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqWcmCoreImplWarpTimeWarpFilter");
            return method != null
                ? (await ((Task<ComDayCqWcmCoreImplWarpTimeWarpFilterInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqWcmCoreMvtMVTStatisticsImpl")]
        public async Task<ActionResult<ComDayCqWcmCoreMvtMVTStatisticsImplInfo>> _ComDayCqWcmCoreMvtMVTStatisticsImpl([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.wcm.core.mvt.MVTStatisticsImpl")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqWcmCoreMvtMVTStatisticsImpl");
            return method != null
                ? (await ((Task<ComDayCqWcmCoreMvtMVTStatisticsImplInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqWcmCoreStatsPageViewStatisticsImpl")]
        public async Task<ActionResult<ComDayCqWcmCoreStatsPageViewStatisticsImplInfo>> _ComDayCqWcmCoreStatsPageViewStatisticsImpl([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.wcm.core.stats.PageViewStatisticsImpl")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqWcmCoreStatsPageViewStatisticsImpl");
            return method != null
                ? (await ((Task<ComDayCqWcmCoreStatsPageViewStatisticsImplInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqWcmCoreWCMRequestFilter")]
        public async Task<ActionResult<ComDayCqWcmCoreWCMRequestFilterInfo>> _ComDayCqWcmCoreWCMRequestFilter([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.wcm.core.WCMRequestFilter")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqWcmCoreWCMRequestFilter");
            return method != null
                ? (await ((Task<ComDayCqWcmCoreWCMRequestFilterInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqWcmDesignimporterDesignPackageImporter")]
        public async Task<ActionResult<ComDayCqWcmDesignimporterDesignPackageImporterInfo>> _ComDayCqWcmDesignimporterDesignPackageImporter([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.wcm.designimporter.DesignPackageImporter")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqWcmDesignimporterDesignPackageImporter");
            return method != null
                ? (await ((Task<ComDayCqWcmDesignimporterDesignPackageImporterInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqWcmDesignimporterImplCanvasBuilderImpl")]
        public async Task<ActionResult<ComDayCqWcmDesignimporterImplCanvasBuilderImplInfo>> _ComDayCqWcmDesignimporterImplCanvasBuilderImpl([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.wcm.designimporter.impl.CanvasBuilderImpl")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqWcmDesignimporterImplCanvasBuilderImpl");
            return method != null
                ? (await ((Task<ComDayCqWcmDesignimporterImplCanvasBuilderImplInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqWcmDesignimporterImplCanvasPageDeleteHandler")]
        public async Task<ActionResult<ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerInfo>> _ComDayCqWcmDesignimporterImplCanvasPageDeleteHandler([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.wcm.designimporter.impl.CanvasPageDeleteHandler")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqWcmDesignimporterImplCanvasPageDeleteHandler");
            return method != null
                ? (await ((Task<ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqWcmDesignimporterImplEntryPreprocessorImpl")]
        public async Task<ActionResult<ComDayCqWcmDesignimporterImplEntryPreprocessorImplInfo>> _ComDayCqWcmDesignimporterImplEntryPreprocessorImpl([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.wcm.designimporter.impl.EntryPreprocessorImpl")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqWcmDesignimporterImplEntryPreprocessorImpl");
            return method != null
                ? (await ((Task<ComDayCqWcmDesignimporterImplEntryPreprocessorImplInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqWcmDesignimporterImplMobileCanvasBuilderImpl")]
        public async Task<ActionResult<ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplInfo>> _ComDayCqWcmDesignimporterImplMobileCanvasBuilderImpl([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.wcm.designimporter.impl.MobileCanvasBuilderImpl")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqWcmDesignimporterImplMobileCanvasBuilderImpl");
            return method != null
                ? (await ((Task<ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqWcmDesignimporterParserTaghandlersFactoryCanvasCompone")]
        public async Task<ActionResult<ComDayCqWcmDesignimporterParserTaghandlersFactoryCanvasComponeInfo>> _ComDayCqWcmDesignimporterParserTaghandlersFactoryCanvasCompone([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.CanvasComponentTagHandlerFactory")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqWcmDesignimporterParserTaghandlersFactoryCanvasCompone");
            return method != null
                ? (await ((Task<ComDayCqWcmDesignimporterParserTaghandlersFactoryCanvasComponeInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultCompon")]
        public async Task<ActionResult<ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultComponInfo>> _ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultCompon([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.DefaultComponentTagHandlerFactory")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultCompon");
            return method != null
                ? (await ((Task<ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultComponInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultTagHan")]
        public async Task<ActionResult<ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultTagHanInfo>> _ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultTagHan([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.DefaultTagHandlerFactory")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultTagHan");
            return method != null
                ? (await ((Task<ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultTagHanInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqWcmDesignimporterParserTaghandlersFactoryHeadTagHandle")]
        public async Task<ActionResult<ComDayCqWcmDesignimporterParserTaghandlersFactoryHeadTagHandleInfo>> _ComDayCqWcmDesignimporterParserTaghandlersFactoryHeadTagHandle([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.HeadTagHandlerFactory")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqWcmDesignimporterParserTaghandlersFactoryHeadTagHandle");
            return method != null
                ? (await ((Task<ComDayCqWcmDesignimporterParserTaghandlersFactoryHeadTagHandleInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqWcmDesignimporterParserTaghandlersFactoryIFrameTagHand")]
        public async Task<ActionResult<ComDayCqWcmDesignimporterParserTaghandlersFactoryIFrameTagHandInfo>> _ComDayCqWcmDesignimporterParserTaghandlersFactoryIFrameTagHand([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.IFrameTagHandlerFactory")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqWcmDesignimporterParserTaghandlersFactoryIFrameTagHand");
            return method != null
                ? (await ((Task<ComDayCqWcmDesignimporterParserTaghandlersFactoryIFrameTagHandInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqWcmDesignimporterParserTaghandlersFactoryImageComponen")]
        public async Task<ActionResult<ComDayCqWcmDesignimporterParserTaghandlersFactoryImageComponenInfo>> _ComDayCqWcmDesignimporterParserTaghandlersFactoryImageComponen([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.ImageComponentTagHandlerFactory")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqWcmDesignimporterParserTaghandlersFactoryImageComponen");
            return method != null
                ? (await ((Task<ComDayCqWcmDesignimporterParserTaghandlersFactoryImageComponenInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandler")]
        public async Task<ActionResult<ComDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandlerInfo>> _ComDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandler([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.ImgTagHandlerFactory")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandler");
            return method != null
                ? (await ((Task<ComDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandlerInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqWcmDesignimporterParserTaghandlersFactoryInlineScriptT")]
        public async Task<ActionResult<ComDayCqWcmDesignimporterParserTaghandlersFactoryInlineScriptTInfo>> _ComDayCqWcmDesignimporterParserTaghandlersFactoryInlineScriptT([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.InlineScriptTagHandlerFactory")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqWcmDesignimporterParserTaghandlersFactoryInlineScriptT");
            return method != null
                ? (await ((Task<ComDayCqWcmDesignimporterParserTaghandlersFactoryInlineScriptTInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqWcmDesignimporterParserTaghandlersFactoryLinkTagHandle")]
        public async Task<ActionResult<ComDayCqWcmDesignimporterParserTaghandlersFactoryLinkTagHandleInfo>> _ComDayCqWcmDesignimporterParserTaghandlersFactoryLinkTagHandle([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.LinkTagHandlerFactory")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqWcmDesignimporterParserTaghandlersFactoryLinkTagHandle");
            return method != null
                ? (await ((Task<ComDayCqWcmDesignimporterParserTaghandlersFactoryLinkTagHandleInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqWcmDesignimporterParserTaghandlersFactoryMetaTagHandle")]
        public async Task<ActionResult<ComDayCqWcmDesignimporterParserTaghandlersFactoryMetaTagHandleInfo>> _ComDayCqWcmDesignimporterParserTaghandlersFactoryMetaTagHandle([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.MetaTagHandlerFactory")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqWcmDesignimporterParserTaghandlersFactoryMetaTagHandle");
            return method != null
                ? (await ((Task<ComDayCqWcmDesignimporterParserTaghandlersFactoryMetaTagHandleInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqWcmDesignimporterParserTaghandlersFactoryNonScriptTagH")]
        public async Task<ActionResult<ComDayCqWcmDesignimporterParserTaghandlersFactoryNonScriptTagHInfo>> _ComDayCqWcmDesignimporterParserTaghandlersFactoryNonScriptTagH([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.NonScriptTagHandlerFactory")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqWcmDesignimporterParserTaghandlersFactoryNonScriptTagH");
            return method != null
                ? (await ((Task<ComDayCqWcmDesignimporterParserTaghandlersFactoryNonScriptTagHInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqWcmDesignimporterParserTaghandlersFactoryParsysCompone")]
        public async Task<ActionResult<ComDayCqWcmDesignimporterParserTaghandlersFactoryParsysComponeInfo>> _ComDayCqWcmDesignimporterParserTaghandlersFactoryParsysCompone([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.ParsysComponentTagHandlerFactory")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqWcmDesignimporterParserTaghandlersFactoryParsysCompone");
            return method != null
                ? (await ((Task<ComDayCqWcmDesignimporterParserTaghandlersFactoryParsysComponeInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqWcmDesignimporterParserTaghandlersFactoryScriptTagHand")]
        public async Task<ActionResult<ComDayCqWcmDesignimporterParserTaghandlersFactoryScriptTagHandInfo>> _ComDayCqWcmDesignimporterParserTaghandlersFactoryScriptTagHand([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.ScriptTagHandlerFactory")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqWcmDesignimporterParserTaghandlersFactoryScriptTagHand");
            return method != null
                ? (await ((Task<ComDayCqWcmDesignimporterParserTaghandlersFactoryScriptTagHandInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqWcmDesignimporterParserTaghandlersFactoryStyleTagHandl")]
        public async Task<ActionResult<ComDayCqWcmDesignimporterParserTaghandlersFactoryStyleTagHandlInfo>> _ComDayCqWcmDesignimporterParserTaghandlersFactoryStyleTagHandl([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.StyleTagHandlerFactory")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqWcmDesignimporterParserTaghandlersFactoryStyleTagHandl");
            return method != null
                ? (await ((Task<ComDayCqWcmDesignimporterParserTaghandlersFactoryStyleTagHandlInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqWcmDesignimporterParserTaghandlersFactoryTextComponent")]
        public async Task<ActionResult<ComDayCqWcmDesignimporterParserTaghandlersFactoryTextComponentInfo>> _ComDayCqWcmDesignimporterParserTaghandlersFactoryTextComponent([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.TextComponentTagHandlerFactory")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqWcmDesignimporterParserTaghandlersFactoryTextComponent");
            return method != null
                ? (await ((Task<ComDayCqWcmDesignimporterParserTaghandlersFactoryTextComponentInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleComponen")]
        public async Task<ActionResult<ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleComponenInfo>> _ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleComponen([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.TitleComponentTagHandlerFactory")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleComponen");
            return method != null
                ? (await ((Task<ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleComponenInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleTagHandl")]
        public async Task<ActionResult<ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleTagHandlInfo>> _ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleTagHandl([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.TitleTagHandlerFactory")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleTagHandl");
            return method != null
                ? (await ((Task<ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleTagHandlInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqWcmFoundationFormsImplFormChooserServlet")]
        public async Task<ActionResult<ComDayCqWcmFoundationFormsImplFormChooserServletInfo>> _ComDayCqWcmFoundationFormsImplFormChooserServlet([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.wcm.foundation.forms.impl.FormChooserServlet")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqWcmFoundationFormsImplFormChooserServlet");
            return method != null
                ? (await ((Task<ComDayCqWcmFoundationFormsImplFormChooserServletInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqWcmFoundationFormsImplFormParagraphPostProcessor")]
        public async Task<ActionResult<ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorInfo>> _ComDayCqWcmFoundationFormsImplFormParagraphPostProcessor([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.wcm.foundation.forms.impl.FormParagraphPostProcessor")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqWcmFoundationFormsImplFormParagraphPostProcessor");
            return method != null
                ? (await ((Task<ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqWcmFoundationFormsImplFormsHandlingServlet")]
        public async Task<ActionResult<ComDayCqWcmFoundationFormsImplFormsHandlingServletInfo>> _ComDayCqWcmFoundationFormsImplFormsHandlingServlet([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.wcm.foundation.forms.impl.FormsHandlingServlet")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqWcmFoundationFormsImplFormsHandlingServlet");
            return method != null
                ? (await ((Task<ComDayCqWcmFoundationFormsImplFormsHandlingServletInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqWcmFoundationFormsImplMailServlet")]
        public async Task<ActionResult<ComDayCqWcmFoundationFormsImplMailServletInfo>> _ComDayCqWcmFoundationFormsImplMailServlet([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.wcm.foundation.forms.impl.MailServlet")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqWcmFoundationFormsImplMailServlet");
            return method != null
                ? (await ((Task<ComDayCqWcmFoundationFormsImplMailServletInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqWcmFoundationImplAdaptiveImageComponentServlet")]
        public async Task<ActionResult<ComDayCqWcmFoundationImplAdaptiveImageComponentServletInfo>> _ComDayCqWcmFoundationImplAdaptiveImageComponentServlet([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.wcm.foundation.impl.AdaptiveImageComponentServlet")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqWcmFoundationImplAdaptiveImageComponentServlet");
            return method != null
                ? (await ((Task<ComDayCqWcmFoundationImplAdaptiveImageComponentServletInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqWcmFoundationImplHTTPAuthHandler")]
        public async Task<ActionResult<ComDayCqWcmFoundationImplHTTPAuthHandlerInfo>> _ComDayCqWcmFoundationImplHTTPAuthHandler([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.wcm.foundation.impl.HTTPAuthHandler")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqWcmFoundationImplHTTPAuthHandler");
            return method != null
                ? (await ((Task<ComDayCqWcmFoundationImplHTTPAuthHandlerInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqWcmFoundationImplPageImpressionsTracker")]
        public async Task<ActionResult<ComDayCqWcmFoundationImplPageImpressionsTrackerInfo>> _ComDayCqWcmFoundationImplPageImpressionsTracker([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.wcm.foundation.impl.PageImpressionsTracker")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqWcmFoundationImplPageImpressionsTracker");
            return method != null
                ? (await ((Task<ComDayCqWcmFoundationImplPageImpressionsTrackerInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqWcmFoundationImplPageRedirectServlet")]
        public async Task<ActionResult<ComDayCqWcmFoundationImplPageRedirectServletInfo>> _ComDayCqWcmFoundationImplPageRedirectServlet([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.wcm.foundation.impl.PageRedirectServlet")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqWcmFoundationImplPageRedirectServlet");
            return method != null
                ? (await ((Task<ComDayCqWcmFoundationImplPageRedirectServletInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklist")]
        public async Task<ActionResult<ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistInfo>> _ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklist([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.wcm.foundation.security.impl.DefaultAttachmentTypeBlacklistService")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklist");
            return method != null
                ? (await ((Task<ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImpl")]
        public async Task<ActionResult<ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplInfo>> _ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImpl([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.wcm.foundation.security.impl.SaferSlingPostValidatorImpl")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImpl");
            return method != null
                ? (await ((Task<ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactory")]
        public async Task<ActionResult<ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryInfo>> _ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactory([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.wcm.mobile.core.impl.device.DeviceInfoTransformerFactory")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactory");
            return method != null
                ? (await ((Task<ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqWcmMobileCoreImplRedirectRedirectFilter")]
        public async Task<ActionResult<ComDayCqWcmMobileCoreImplRedirectRedirectFilterInfo>> _ComDayCqWcmMobileCoreImplRedirectRedirectFilter([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.wcm.mobile.core.impl.redirect.RedirectFilter")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqWcmMobileCoreImplRedirectRedirectFilter");
            return method != null
                ? (await ((Task<ComDayCqWcmMobileCoreImplRedirectRedirectFilterInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqWcmMsmImplActionsContentCopyActionFactory")]
        public async Task<ActionResult<ComDayCqWcmMsmImplActionsContentCopyActionFactoryInfo>> _ComDayCqWcmMsmImplActionsContentCopyActionFactory([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.wcm.msm.impl.actions.ContentCopyActionFactory")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqWcmMsmImplActionsContentCopyActionFactory");
            return method != null
                ? (await ((Task<ComDayCqWcmMsmImplActionsContentCopyActionFactoryInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqWcmMsmImplActionsContentDeleteActionFactory")]
        public async Task<ActionResult<ComDayCqWcmMsmImplActionsContentDeleteActionFactoryInfo>> _ComDayCqWcmMsmImplActionsContentDeleteActionFactory([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.wcm.msm.impl.actions.ContentDeleteActionFactory")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqWcmMsmImplActionsContentDeleteActionFactory");
            return method != null
                ? (await ((Task<ComDayCqWcmMsmImplActionsContentDeleteActionFactoryInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqWcmMsmImplActionsContentUpdateActionFactory")]
        public async Task<ActionResult<ComDayCqWcmMsmImplActionsContentUpdateActionFactoryInfo>> _ComDayCqWcmMsmImplActionsContentUpdateActionFactory([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.wcm.msm.impl.actions.ContentUpdateActionFactory")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqWcmMsmImplActionsContentUpdateActionFactory");
            return method != null
                ? (await ((Task<ComDayCqWcmMsmImplActionsContentUpdateActionFactoryInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqWcmMsmImplActionsOrderChildrenActionFactory")]
        public async Task<ActionResult<ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryInfo>> _ComDayCqWcmMsmImplActionsOrderChildrenActionFactory([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.wcm.msm.impl.actions.OrderChildrenActionFactory")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqWcmMsmImplActionsOrderChildrenActionFactory");
            return method != null
                ? (await ((Task<ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqWcmMsmImplActionsPageMoveActionFactory")]
        public async Task<ActionResult<ComDayCqWcmMsmImplActionsPageMoveActionFactoryInfo>> _ComDayCqWcmMsmImplActionsPageMoveActionFactory([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.wcm.msm.impl.actions.PageMoveActionFactory")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqWcmMsmImplActionsPageMoveActionFactory");
            return method != null
                ? (await ((Task<ComDayCqWcmMsmImplActionsPageMoveActionFactoryInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqWcmMsmImplActionsReferencesUpdateActionFactory")]
        public async Task<ActionResult<ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryInfo>> _ComDayCqWcmMsmImplActionsReferencesUpdateActionFactory([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.wcm.msm.impl.actions.ReferencesUpdateActionFactory")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqWcmMsmImplActionsReferencesUpdateActionFactory");
            return method != null
                ? (await ((Task<ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqWcmMsmImplActionsVersionCopyActionFactory")]
        public async Task<ActionResult<ComDayCqWcmMsmImplActionsVersionCopyActionFactoryInfo>> _ComDayCqWcmMsmImplActionsVersionCopyActionFactory([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.wcm.msm.impl.actions.VersionCopyActionFactory")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqWcmMsmImplActionsVersionCopyActionFactory");
            return method != null
                ? (await ((Task<ComDayCqWcmMsmImplActionsVersionCopyActionFactoryInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqWcmMsmImplLiveRelationshipManagerImpl")]
        public async Task<ActionResult<ComDayCqWcmMsmImplLiveRelationshipManagerImplInfo>> _ComDayCqWcmMsmImplLiveRelationshipManagerImpl([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.wcm.msm.impl.LiveRelationshipManagerImpl")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqWcmMsmImplLiveRelationshipManagerImpl");
            return method != null
                ? (await ((Task<ComDayCqWcmMsmImplLiveRelationshipManagerImplInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqWcmMsmImplRolloutManagerImpl")]
        public async Task<ActionResult<ComDayCqWcmMsmImplRolloutManagerImplInfo>> _ComDayCqWcmMsmImplRolloutManagerImpl([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.wcm.msm.impl.RolloutManagerImpl")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqWcmMsmImplRolloutManagerImpl");
            return method != null
                ? (await ((Task<ComDayCqWcmMsmImplRolloutManagerImplInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqWcmMsmImplServletsAuditLogServlet")]
        public async Task<ActionResult<ComDayCqWcmMsmImplServletsAuditLogServletInfo>> _ComDayCqWcmMsmImplServletsAuditLogServlet([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.wcm.msm.impl.servlets.AuditLogServlet")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqWcmMsmImplServletsAuditLogServlet");
            return method != null
                ? (await ((Task<ComDayCqWcmMsmImplServletsAuditLogServletInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqWcmNotificationEmailImplEmailChannel")]
        public async Task<ActionResult<ComDayCqWcmNotificationEmailImplEmailChannelInfo>> _ComDayCqWcmNotificationEmailImplEmailChannel([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.wcm.notification.email.impl.EmailChannel")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqWcmNotificationEmailImplEmailChannel");
            return method != null
                ? (await ((Task<ComDayCqWcmNotificationEmailImplEmailChannelInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqWcmNotificationImplNotificationManagerImpl")]
        public async Task<ActionResult<ComDayCqWcmNotificationImplNotificationManagerImplInfo>> _ComDayCqWcmNotificationImplNotificationManagerImpl([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.wcm.notification.impl.NotificationManagerImpl")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqWcmNotificationImplNotificationManagerImpl");
            return method != null
                ? (await ((Task<ComDayCqWcmNotificationImplNotificationManagerImplInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqWcmScriptingImplBVPManager")]
        public async Task<ActionResult<ComDayCqWcmScriptingImplBVPManagerInfo>> _ComDayCqWcmScriptingImplBVPManager([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.wcm.scripting.impl.BVPManager")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqWcmScriptingImplBVPManager");
            return method != null
                ? (await ((Task<ComDayCqWcmScriptingImplBVPManagerInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqWcmUndoUndoConfig")]
        public async Task<ActionResult<ComDayCqWcmUndoUndoConfigInfo>> _ComDayCqWcmUndoUndoConfig([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.wcm.undo.UndoConfig")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqWcmUndoUndoConfig");
            return method != null
                ? (await ((Task<ComDayCqWcmUndoUndoConfigInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqWcmWebservicesupportImplReplicationEventListener")]
        public async Task<ActionResult<ComDayCqWcmWebservicesupportImplReplicationEventListenerInfo>> _ComDayCqWcmWebservicesupportImplReplicationEventListener([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.wcm.webservicesupport.impl.ReplicationEventListener")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqWcmWebservicesupportImplReplicationEventListener");
            return method != null
                ? (await ((Task<ComDayCqWcmWebservicesupportImplReplicationEventListenerInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqWcmWorkflowImplWcmWorkflowServiceImpl")]
        public async Task<ActionResult<ComDayCqWcmWorkflowImplWcmWorkflowServiceImplInfo>> _ComDayCqWcmWorkflowImplWcmWorkflowServiceImpl([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.wcm.workflow.impl.WcmWorkflowServiceImpl")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqWcmWorkflowImplWcmWorkflowServiceImpl");
            return method != null
                ? (await ((Task<ComDayCqWcmWorkflowImplWcmWorkflowServiceImplInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqWcmWorkflowImplWorkflowPackageInfoProvider")]
        public async Task<ActionResult<ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderInfo>> _ComDayCqWcmWorkflowImplWorkflowPackageInfoProvider([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.wcm.workflow.impl.WorkflowPackageInfoProvider")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqWcmWorkflowImplWorkflowPackageInfoProvider");
            return method != null
                ? (await ((Task<ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqWidgetImplHtmlLibraryManagerImpl")]
        public async Task<ActionResult<ComDayCqWidgetImplHtmlLibraryManagerImplInfo>> _ComDayCqWidgetImplHtmlLibraryManagerImpl([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.widget.impl.HtmlLibraryManagerImpl")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqWidgetImplHtmlLibraryManagerImpl");
            return method != null
                ? (await ((Task<ComDayCqWidgetImplHtmlLibraryManagerImplInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqWidgetImplWidgetExtensionProviderImpl")]
        public async Task<ActionResult<ComDayCqWidgetImplWidgetExtensionProviderImplInfo>> _ComDayCqWidgetImplWidgetExtensionProviderImpl([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.widget.impl.WidgetExtensionProviderImpl")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqWidgetImplWidgetExtensionProviderImpl");
            return method != null
                ? (await ((Task<ComDayCqWidgetImplWidgetExtensionProviderImplInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqWorkflowImplEmailEMailNotificationService")]
        public async Task<ActionResult<ComDayCqWorkflowImplEmailEMailNotificationServiceInfo>> _ComDayCqWorkflowImplEmailEMailNotificationService([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.workflow.impl.email.EMailNotificationService")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqWorkflowImplEmailEMailNotificationService");
            return method != null
                ? (await ((Task<ComDayCqWorkflowImplEmailEMailNotificationServiceInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCqWorkflowImplEmailTaskEMailNotificationService")]
        public async Task<ActionResult<ComDayCqWorkflowImplEmailTaskEMailNotificationServiceInfo>> _ComDayCqWorkflowImplEmailTaskEMailNotificationService([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.cq.workflow.impl.email.TaskEMailNotificationService")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCqWorkflowImplEmailTaskEMailNotificationService");
            return method != null
                ? (await ((Task<ComDayCqWorkflowImplEmailTaskEMailNotificationServiceInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCrxSecurityTokenImplImplTokenAuthenticationHandler")]
        public async Task<ActionResult<ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerInfo>> _ComDayCrxSecurityTokenImplImplTokenAuthenticationHandler([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.crx.security.token.impl.impl.TokenAuthenticationHandler")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCrxSecurityTokenImplImplTokenAuthenticationHandler");
            return method != null
                ? (await ((Task<ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_ComDayCrxSecurityTokenImplTokenCleanupTask")]
        public async Task<ActionResult<ComDayCrxSecurityTokenImplTokenCleanupTaskInfo>> _ComDayCrxSecurityTokenImplTokenCleanupTask([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/com.day.crx.security.token.impl.TokenCleanupTask")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ComDayCrxSecurityTokenImplTokenCleanupTask");
            return method != null
                ? (await ((Task<ComDayCrxSecurityTokenImplTokenCleanupTaskInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_GuideLocalizationService")]
        public async Task<ActionResult<GuideLocalizationServiceInfo>> _GuideLocalizationService([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/Guide Localization Service")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("GuideLocalizationService");
            return method != null
                ? (await ((Task<GuideLocalizationServiceInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_MessagingUserComponentFactory")]
        public async Task<ActionResult<MessagingUserComponentFactoryInfo>> _MessagingUserComponentFactory([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/MessagingUserComponentFactory")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("MessagingUserComponentFactory");
            return method != null
                ? (await ((Task<MessagingUserComponentFactoryInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_OrgApacheAriesJmxFrameworkStateConfig")]
        public async Task<ActionResult<OrgApacheAriesJmxFrameworkStateConfigInfo>> _OrgApacheAriesJmxFrameworkStateConfig([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/org.apache.aries.jmx.framework.StateConfig")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("OrgApacheAriesJmxFrameworkStateConfig");
            return method != null
                ? (await ((Task<OrgApacheAriesJmxFrameworkStateConfigInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_OrgApacheFelixEventadminImplEventAdmin")]
        public async Task<ActionResult<OrgApacheFelixEventadminImplEventAdminInfo>> _OrgApacheFelixEventadminImplEventAdmin([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/org.apache.felix.eventadmin.impl.EventAdmin")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("OrgApacheFelixEventadminImplEventAdmin");
            return method != null
                ? (await ((Task<OrgApacheFelixEventadminImplEventAdminInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_OrgApacheFelixHttp")]
        public async Task<ActionResult<OrgApacheFelixHttpInfo>> _OrgApacheFelixHttp([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/org.apache.felix.http")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("OrgApacheFelixHttp");
            return method != null
                ? (await ((Task<OrgApacheFelixHttpInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_OrgApacheFelixHttpSslfilterSslFilter")]
        public async Task<ActionResult<OrgApacheFelixHttpSslfilterSslFilterInfo>> _OrgApacheFelixHttpSslfilterSslFilter([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/org.apache.felix.http.sslfilter.SslFilter")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("OrgApacheFelixHttpSslfilterSslFilter");
            return method != null
                ? (await ((Task<OrgApacheFelixHttpSslfilterSslFilterInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_OrgApacheFelixJaasConfigurationFactory")]
        public async Task<ActionResult<OrgApacheFelixJaasConfigurationFactoryInfo>> _OrgApacheFelixJaasConfigurationFactory([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/org.apache.felix.jaas.Configuration.factory")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("OrgApacheFelixJaasConfigurationFactory");
            return method != null
                ? (await ((Task<OrgApacheFelixJaasConfigurationFactoryInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_OrgApacheFelixJaasConfigurationSpi")]
        public async Task<ActionResult<OrgApacheFelixJaasConfigurationSpiInfo>> _OrgApacheFelixJaasConfigurationSpi([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/org.apache.felix.jaas.ConfigurationSpi")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("OrgApacheFelixJaasConfigurationSpi");
            return method != null
                ? (await ((Task<OrgApacheFelixJaasConfigurationSpiInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_OrgApacheFelixScrScrService")]
        public async Task<ActionResult<OrgApacheFelixScrScrServiceInfo>> _OrgApacheFelixScrScrService([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/org.apache.felix.scr.ScrService")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("OrgApacheFelixScrScrService");
            return method != null
                ? (await ((Task<OrgApacheFelixScrScrServiceInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_OrgApacheFelixSystemreadyImplComponentsCheck")]
        public async Task<ActionResult<OrgApacheFelixSystemreadyImplComponentsCheckInfo>> _OrgApacheFelixSystemreadyImplComponentsCheck([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/org.apache.felix.systemready.impl.ComponentsCheck")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("OrgApacheFelixSystemreadyImplComponentsCheck");
            return method != null
                ? (await ((Task<OrgApacheFelixSystemreadyImplComponentsCheckInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_OrgApacheFelixSystemreadyImplFrameworkStartCheck")]
        public async Task<ActionResult<OrgApacheFelixSystemreadyImplFrameworkStartCheckInfo>> _OrgApacheFelixSystemreadyImplFrameworkStartCheck([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/org.apache.felix.systemready.impl.FrameworkStartCheck")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("OrgApacheFelixSystemreadyImplFrameworkStartCheck");
            return method != null
                ? (await ((Task<OrgApacheFelixSystemreadyImplFrameworkStartCheckInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_OrgApacheFelixSystemreadyImplServicesCheck")]
        public async Task<ActionResult<OrgApacheFelixSystemreadyImplServicesCheckInfo>> _OrgApacheFelixSystemreadyImplServicesCheck([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/org.apache.felix.systemready.impl.ServicesCheck")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("OrgApacheFelixSystemreadyImplServicesCheck");
            return method != null
                ? (await ((Task<OrgApacheFelixSystemreadyImplServicesCheckInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_OrgApacheFelixSystemreadyImplServletSystemAliveServlet")]
        public async Task<ActionResult<OrgApacheFelixSystemreadyImplServletSystemAliveServletInfo>> _OrgApacheFelixSystemreadyImplServletSystemAliveServlet([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/org.apache.felix.systemready.impl.servlet.SystemAliveServlet")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("OrgApacheFelixSystemreadyImplServletSystemAliveServlet");
            return method != null
                ? (await ((Task<OrgApacheFelixSystemreadyImplServletSystemAliveServletInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_OrgApacheFelixSystemreadyImplServletSystemReadyServlet")]
        public async Task<ActionResult<OrgApacheFelixSystemreadyImplServletSystemReadyServletInfo>> _OrgApacheFelixSystemreadyImplServletSystemReadyServlet([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/org.apache.felix.systemready.impl.servlet.SystemReadyServlet")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("OrgApacheFelixSystemreadyImplServletSystemReadyServlet");
            return method != null
                ? (await ((Task<OrgApacheFelixSystemreadyImplServletSystemReadyServletInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_OrgApacheFelixSystemreadySystemReadyMonitor")]
        public async Task<ActionResult<OrgApacheFelixSystemreadySystemReadyMonitorInfo>> _OrgApacheFelixSystemreadySystemReadyMonitor([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/org.apache.felix.systemready.SystemReadyMonitor")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("OrgApacheFelixSystemreadySystemReadyMonitor");
            return method != null
                ? (await ((Task<OrgApacheFelixSystemreadySystemReadyMonitorInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_OrgApacheFelixWebconsoleInternalServletOsgiManager")]
        public async Task<ActionResult<OrgApacheFelixWebconsoleInternalServletOsgiManagerInfo>> _OrgApacheFelixWebconsoleInternalServletOsgiManager([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/org.apache.felix.webconsole.internal.servlet.OsgiManager")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("OrgApacheFelixWebconsoleInternalServletOsgiManager");
            return method != null
                ? (await ((Task<OrgApacheFelixWebconsoleInternalServletOsgiManagerInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_OrgApacheFelixWebconsolePluginsEventInternalPluginServlet")]
        public async Task<ActionResult<OrgApacheFelixWebconsolePluginsEventInternalPluginServletInfo>> _OrgApacheFelixWebconsolePluginsEventInternalPluginServlet([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/org.apache.felix.webconsole.plugins.event.internal.PluginServlet")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("OrgApacheFelixWebconsolePluginsEventInternalPluginServlet");
            return method != null
                ? (await ((Task<OrgApacheFelixWebconsolePluginsEventInternalPluginServletInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCo")]
        public async Task<ActionResult<OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoInfo>> _OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCo([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/org.apache.felix.webconsole.plugins.memoryusage.internal.MemoryUsageConfigurator")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCo");
            return method != null
                ? (await ((Task<OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_OrgApacheHttpProxyconfigurator")]
        public async Task<ActionResult<OrgApacheHttpProxyconfiguratorInfo>> _OrgApacheHttpProxyconfigurator([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/org.apache.http.proxyconfigurator")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("OrgApacheHttpProxyconfigurator");
            return method != null
                ? (await ((Task<OrgApacheHttpProxyconfiguratorInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProvider")]
        public async Task<ActionResult<OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderInfo>> _OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProvider([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreTextProviderService")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProvider");
            return method != null
                ? (await ((Task<OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStore")]
        public async Task<ActionResult<OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreInfo>> _OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStore([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/org.apache.jackrabbit.oak.plugins.blob.datastore.FileDataStore")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStore");
            return method != null
                ? (await ((Task<OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreService")]
        public async Task<ActionResult<OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceInfo>> _OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreService([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/org.apache.jackrabbit.oak.plugins.document.DocumentNodeStoreService")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreService");
            return method != null
                ? (await ((Task<OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePre")]
        public async Task<ActionResult<OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreInfo>> _OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePre([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/org.apache.jackrabbit.oak.plugins.document.DocumentNodeStoreServicePreset")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePre");
            return method != null
                ? (await ((Task<OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCac")]
        public async Task<ActionResult<OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacInfo>> _OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCac([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/org.apache.jackrabbit.oak.plugins.document.secondary.SecondaryStoreCacheService")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCac");
            return method != null
                ? (await ((Task<OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_OrgApacheJackrabbitOakPluginsIndexAsyncIndexerService")]
        public async Task<ActionResult<OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceInfo>> _OrgApacheJackrabbitOakPluginsIndexAsyncIndexerService([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/org.apache.jackrabbit.oak.plugins.index.AsyncIndexerService")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("OrgApacheJackrabbitOakPluginsIndexAsyncIndexerService");
            return method != null
                ? (await ((Task<OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServ")]
        public async Task<ActionResult<OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServInfo>> _OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServ([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/org.apache.jackrabbit.oak.plugins.index.lucene.LuceneIndexProviderService")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServ");
            return method != null
                ? (await ((Task<OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCo")]
        public async Task<ActionResult<OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoInfo>> _OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCo([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/org.apache.jackrabbit.oak.plugins.index.solr.osgi.EmbeddedSolrServerConfigurationProvider")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCo");
            return method != null
                ? (await ((Task<OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServers")]
        public async Task<ActionResult<OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersInfo>> _OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServers([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/org.apache.jackrabbit.oak.plugins.index.solr.osgi.NodeStateSolrServersObserverService")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServers");
            return method != null
                ? (await ((Task<OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfiguration")]
        public async Task<ActionResult<OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationInfo>> _OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfiguration([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/org.apache.jackrabbit.oak.plugins.index.solr.osgi.OakSolrConfigurationProviderService")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfiguration");
            return method != null
                ? (await ((Task<OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConf")]
        public async Task<ActionResult<OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfInfo>> _OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConf([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/org.apache.jackrabbit.oak.plugins.index.solr.osgi.RemoteSolrServerConfigurationProvider")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConf");
            return method != null
                ? (await ((Task<OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvid")]
        public async Task<ActionResult<OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidInfo>> _OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvid([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/org.apache.jackrabbit.oak.plugins.index.solr.osgi.SolrQueryIndexProviderService")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvid");
            return method != null
                ? (await ((Task<OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSe")]
        public async Task<ActionResult<OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeInfo>> _OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSe([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/org.apache.jackrabbit.oak.plugins.index.solr.osgi.SolrServerProviderService")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSe");
            return method != null
                ? (await ((Task<OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactory")]
        public async Task<ActionResult<OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryInfo>> _OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactory([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/org.apache.jackrabbit.oak.plugins.metric.StatisticsProviderFactory")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactory");
            return method != null
                ? (await ((Task<OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_OrgApacheJackrabbitOakPluginsObservationChangeCollectorProvider")]
        public async Task<ActionResult<OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderInfo>> _OrgApacheJackrabbitOakPluginsObservationChangeCollectorProvider([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/org.apache.jackrabbit.oak.plugins.observation.ChangeCollectorProvider")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("OrgApacheJackrabbitOakPluginsObservationChangeCollectorProvider");
            return method != null
                ? (await ((Task<OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_OrgApacheJackrabbitOakQueryQueryEngineSettingsService")]
        public async Task<ActionResult<OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceInfo>> _OrgApacheJackrabbitOakQueryQueryEngineSettingsService([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/org.apache.jackrabbit.oak.query.QueryEngineSettingsService")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("OrgApacheJackrabbitOakQueryQueryEngineSettingsService");
            return method != null
                ? (await ((Task<OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfig")]
        public async Task<ActionResult<OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigInfo>> _OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfig([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/org.apache.jackrabbit.oak.security.authentication.AuthenticationConfigurationImpl")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfig");
            return method != null
                ? (await ((Task<OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdenti")]
        public async Task<ActionResult<OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiInfo>> _OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdenti([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/org.apache.jackrabbit.oak.security.authentication.ldap.impl.LdapIdentityProvider")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdenti");
            return method != null
                ? (await ((Task<OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfigura")]
        public async Task<ActionResult<OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraInfo>> _OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfigura([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/org.apache.jackrabbit.oak.security.authentication.token.TokenConfigurationImpl")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfigura");
            return method != null
                ? (await ((Task<OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigur")]
        public async Task<ActionResult<OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurInfo>> _OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigur([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/org.apache.jackrabbit.oak.security.authorization.AuthorizationConfigurationImpl")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigur");
            return method != null
                ? (await ((Task<OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistrati")]
        public async Task<ActionResult<OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiInfo>> _OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistrati([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/org.apache.jackrabbit.oak.security.internal.SecurityProviderRegistration")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistrati");
            return method != null
                ? (await ((Task<OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeName")]
        public async Task<ActionResult<OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameInfo>> _OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeName([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/org.apache.jackrabbit.oak.security.user.RandomAuthorizableNodeName")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeName");
            return method != null
                ? (await ((Task<OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_OrgApacheJackrabbitOakSecurityUserUserConfigurationImpl")]
        public async Task<ActionResult<OrgApacheJackrabbitOakSecurityUserUserConfigurationImplInfo>> _OrgApacheJackrabbitOakSecurityUserUserConfigurationImpl([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/org.apache.jackrabbit.oak.security.user.UserConfigurationImpl")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("OrgApacheJackrabbitOakSecurityUserUserConfigurationImpl");
            return method != null
                ? (await ((Task<OrgApacheJackrabbitOakSecurityUserUserConfigurationImplInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreService")]
        public async Task<ActionResult<OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceInfo>> _OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreService([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/org.apache.jackrabbit.oak.segment.azure.AzureSegmentStoreService")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreService");
            return method != null
                ? (await ((Task<OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactory")]
        public async Task<ActionResult<OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryInfo>> _OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactory([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/org.apache.jackrabbit.oak.segment.SegmentNodeStoreFactory")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactory");
            return method != null
                ? (await ((Task<OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorService")]
        public async Task<ActionResult<OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceInfo>> _OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorService([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/org.apache.jackrabbit.oak.segment.SegmentNodeStoreMonitorService")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorService");
            return method != null
                ? (await ((Task<OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_OrgApacheJackrabbitOakSegmentSegmentNodeStoreService")]
        public async Task<ActionResult<OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceInfo>> _OrgApacheJackrabbitOakSegmentSegmentNodeStoreService([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/org.apache.jackrabbit.oak.segment.SegmentNodeStoreService")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("OrgApacheJackrabbitOakSegmentSegmentNodeStoreService");
            return method != null
                ? (await ((Task<OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreService")]
        public async Task<ActionResult<OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceInfo>> _OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreService([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/org.apache.jackrabbit.oak.segment.standby.store.StandbyStoreService")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreService");
            return method != null
                ? (await ((Task<OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDe")]
        public async Task<ActionResult<OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeInfo>> _OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDe([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/org.apache.jackrabbit.oak.spi.security.authentication.external.impl.DefaultSyncHandler")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDe");
            return method != null
                ? (await ((Task<OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplEx")]
        public async Task<ActionResult<OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExInfo>> _OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplEx([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/org.apache.jackrabbit.oak.spi.security.authentication.external.impl.ExternalLoginModuleFactory")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplEx");
            return method != null
                ? (await ((Task<OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPr")]
        public async Task<ActionResult<OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrInfo>> _OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPr([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/org.apache.jackrabbit.oak.spi.security.authentication.external.impl.principal.ExternalPrincipalConfiguration")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPr");
            return method != null
                ? (await ((Task<OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfi")]
        public async Task<ActionResult<OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiInfo>> _OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfi([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/org.apache.jackrabbit.oak.spi.security.authorization.cug.impl.CugConfiguration")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfi");
            return method != null
                ? (await ((Task<OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExclu")]
        public async Task<ActionResult<OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluInfo>> _OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExclu([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/org.apache.jackrabbit.oak.spi.security.authorization.cug.impl.CugExcludeImpl")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExclu");
            return method != null
                ? (await ((Task<OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizable")]
        public async Task<ActionResult<OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableInfo>> _OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizable([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/org.apache.jackrabbit.oak.spi.security.user.action.DefaultAuthorizableActionProvider")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizable");
            return method != null
                ? (await ((Task<OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_OrgApacheJackrabbitVaultPackagingImplPackagingImpl")]
        public async Task<ActionResult<OrgApacheJackrabbitVaultPackagingImplPackagingImplInfo>> _OrgApacheJackrabbitVaultPackagingImplPackagingImpl([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/org.apache.jackrabbit.vault.packaging.impl.PackagingImpl")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("OrgApacheJackrabbitVaultPackagingImplPackagingImpl");
            return method != null
                ? (await ((Task<OrgApacheJackrabbitVaultPackagingImplPackagingImplInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistry")]
        public async Task<ActionResult<OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryInfo>> _OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistry([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/org.apache.jackrabbit.vault.packaging.registry.impl.FSPackageRegistry")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistry");
            return method != null
                ? (await ((Task<OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_OrgApacheSlingAuthCoreImplLogoutServlet")]
        public async Task<ActionResult<OrgApacheSlingAuthCoreImplLogoutServletInfo>> _OrgApacheSlingAuthCoreImplLogoutServlet([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/org.apache.sling.auth.core.impl.LogoutServlet")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("OrgApacheSlingAuthCoreImplLogoutServlet");
            return method != null
                ? (await ((Task<OrgApacheSlingAuthCoreImplLogoutServletInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_OrgApacheSlingCaconfigImplConfigurationBindingsValueProvider")]
        public async Task<ActionResult<OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderInfo>> _OrgApacheSlingCaconfigImplConfigurationBindingsValueProvider([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/org.apache.sling.caconfig.impl.ConfigurationBindingsValueProvider")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("OrgApacheSlingCaconfigImplConfigurationBindingsValueProvider");
            return method != null
                ? (await ((Task<OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_OrgApacheSlingCaconfigImplConfigurationResolverImpl")]
        public async Task<ActionResult<OrgApacheSlingCaconfigImplConfigurationResolverImplInfo>> _OrgApacheSlingCaconfigImplConfigurationResolverImpl([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/org.apache.sling.caconfig.impl.ConfigurationResolverImpl")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("OrgApacheSlingCaconfigImplConfigurationResolverImpl");
            return method != null
                ? (await ((Task<OrgApacheSlingCaconfigImplConfigurationResolverImplInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStra")]
        public async Task<ActionResult<OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraInfo>> _OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStra([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/org.apache.sling.caconfig.impl.def.DefaultConfigurationInheritanceStrategy")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStra");
            return method != null
                ? (await ((Task<OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStra")]
        public async Task<ActionResult<OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraInfo>> _OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStra([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/org.apache.sling.caconfig.impl.def.DefaultConfigurationPersistenceStrategy")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStra");
            return method != null
                ? (await ((Task<OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProvi")]
        public async Task<ActionResult<OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviInfo>> _OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProvi([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/org.apache.sling.caconfig.impl.override.OsgiConfigurationOverrideProvider")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProvi");
            return method != null
                ? (await ((Task<OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOve")]
        public async Task<ActionResult<OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveInfo>> _OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOve([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/org.apache.sling.caconfig.impl.override.SystemPropertyConfigurationOverrideProvider")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOve");
            return method != null
                ? (await ((Task<OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_OrgApacheSlingCaconfigManagementImplConfigurationManagementSetti")]
        public async Task<ActionResult<OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiInfo>> _OrgApacheSlingCaconfigManagementImplConfigurationManagementSetti([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/org.apache.sling.caconfig.management.impl.ConfigurationManagementSettingsImpl")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("OrgApacheSlingCaconfigManagementImplConfigurationManagementSetti");
            return method != null
                ? (await ((Task<OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResour")]
        public async Task<ActionResult<OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourInfo>> _OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResour([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/org.apache.sling.caconfig.resource.impl.def.DefaultConfigurationResourceResolvingStrategy")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResour");
            return method != null
                ? (await ((Task<OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategy")]
        public async Task<ActionResult<OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyInfo>> _OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategy([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/org.apache.sling.caconfig.resource.impl.def.DefaultContextPathStrategy")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategy");
            return method != null
                ? (await ((Task<OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParser")]
        public async Task<ActionResult<OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserInfo>> _OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParser([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/org.apache.sling.commons.html.internal.TagsoupHtmlParser")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParser");
            return method != null
                ? (await ((Task<OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_OrgApacheSlingCommonsLogLogManager")]
        public async Task<ActionResult<OrgApacheSlingCommonsLogLogManagerInfo>> _OrgApacheSlingCommonsLogLogManager([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/org.apache.sling.commons.log.LogManager")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("OrgApacheSlingCommonsLogLogManager");
            return method != null
                ? (await ((Task<OrgApacheSlingCommonsLogLogManagerInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_OrgApacheSlingCommonsLogLogManagerFactoryConfig")]
        public async Task<ActionResult<OrgApacheSlingCommonsLogLogManagerFactoryConfigInfo>> _OrgApacheSlingCommonsLogLogManagerFactoryConfig([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/org.apache.sling.commons.log.LogManager.factory.config")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("OrgApacheSlingCommonsLogLogManagerFactoryConfig");
            return method != null
                ? (await ((Task<OrgApacheSlingCommonsLogLogManagerFactoryConfigInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_OrgApacheSlingCommonsLogLogManagerFactoryWriter")]
        public async Task<ActionResult<OrgApacheSlingCommonsLogLogManagerFactoryWriterInfo>> _OrgApacheSlingCommonsLogLogManagerFactoryWriter([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/org.apache.sling.commons.log.LogManager.factory.writer")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("OrgApacheSlingCommonsLogLogManagerFactoryWriter");
            return method != null
                ? (await ((Task<OrgApacheSlingCommonsLogLogManagerFactoryWriterInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_OrgApacheSlingCommonsMetricsInternalLogReporter")]
        public async Task<ActionResult<OrgApacheSlingCommonsMetricsInternalLogReporterInfo>> _OrgApacheSlingCommonsMetricsInternalLogReporter([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/org.apache.sling.commons.metrics.internal.LogReporter")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("OrgApacheSlingCommonsMetricsInternalLogReporter");
            return method != null
                ? (await ((Task<OrgApacheSlingCommonsMetricsInternalLogReporterInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporter")]
        public async Task<ActionResult<OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterInfo>> _OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporter([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/org.apache.sling.commons.metrics.rrd4j.impl.CodahaleMetricsReporter")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporter");
            return method != null
                ? (await ((Task<OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_OrgApacheSlingCommonsMimeInternalMimeTypeServiceImpl")]
        public async Task<ActionResult<OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplInfo>> _OrgApacheSlingCommonsMimeInternalMimeTypeServiceImpl([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/org.apache.sling.commons.mime.internal.MimeTypeServiceImpl")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("OrgApacheSlingCommonsMimeInternalMimeTypeServiceImpl");
            return method != null
                ? (await ((Task<OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_OrgApacheSlingCommonsSchedulerImplQuartzScheduler")]
        public async Task<ActionResult<OrgApacheSlingCommonsSchedulerImplQuartzSchedulerInfo>> _OrgApacheSlingCommonsSchedulerImplQuartzScheduler([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/org.apache.sling.commons.scheduler.impl.QuartzScheduler")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("OrgApacheSlingCommonsSchedulerImplQuartzScheduler");
            return method != null
                ? (await ((Task<OrgApacheSlingCommonsSchedulerImplQuartzSchedulerInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheck")]
        public async Task<ActionResult<OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckInfo>> _OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheck([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/org.apache.sling.commons.scheduler.impl.SchedulerHealthCheck")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheck");
            return method != null
                ? (await ((Task<OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactory")]
        public async Task<ActionResult<OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryInfo>> _OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactory([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/org.apache.sling.commons.threads.impl.DefaultThreadPool.factory")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactory");
            return method != null
                ? (await ((Task<OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_OrgApacheSlingDatasourceDataSourceFactory")]
        public async Task<ActionResult<OrgApacheSlingDatasourceDataSourceFactoryInfo>> _OrgApacheSlingDatasourceDataSourceFactory([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/org.apache.sling.datasource.DataSourceFactory")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("OrgApacheSlingDatasourceDataSourceFactory");
            return method != null
                ? (await ((Task<OrgApacheSlingDatasourceDataSourceFactoryInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_OrgApacheSlingDatasourceJNDIDataSourceFactory")]
        public async Task<ActionResult<OrgApacheSlingDatasourceJNDIDataSourceFactoryInfo>> _OrgApacheSlingDatasourceJNDIDataSourceFactory([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/org.apache.sling.datasource.JNDIDataSourceFactory")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("OrgApacheSlingDatasourceJNDIDataSourceFactory");
            return method != null
                ? (await ((Task<OrgApacheSlingDatasourceJNDIDataSourceFactoryInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_OrgApacheSlingDiscoveryOakConfig")]
        public async Task<ActionResult<OrgApacheSlingDiscoveryOakConfigInfo>> _OrgApacheSlingDiscoveryOakConfig([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/org.apache.sling.discovery.oak.Config")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("OrgApacheSlingDiscoveryOakConfig");
            return method != null
                ? (await ((Task<OrgApacheSlingDiscoveryOakConfigInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheck")]
        public async Task<ActionResult<OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckInfo>> _OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheck([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/org.apache.sling.discovery.oak.SynchronizedClocksHealthCheck")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheck");
            return method != null
                ? (await ((Task<OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_OrgApacheSlingDistributionAgentImplForwardDistributionAgentFacto")]
        public async Task<ActionResult<OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoInfo>> _OrgApacheSlingDistributionAgentImplForwardDistributionAgentFacto([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/org.apache.sling.distribution.agent.impl.ForwardDistributionAgentFactory")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("OrgApacheSlingDistributionAgentImplForwardDistributionAgentFacto");
            return method != null
                ? (await ((Task<OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestA")]
        public async Task<ActionResult<OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAInfo>> _OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestA([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/org.apache.sling.distribution.agent.impl.PrivilegeDistributionRequestAuthorizationStrategyFactory")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestA");
            return method != null
                ? (await ((Task<OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactory")]
        public async Task<ActionResult<OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryInfo>> _OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactory([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/org.apache.sling.distribution.agent.impl.QueueDistributionAgentFactory")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactory");
            return method != null
                ? (await ((Task<OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_OrgApacheSlingDistributionAgentImplReverseDistributionAgentFacto")]
        public async Task<ActionResult<OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoInfo>> _OrgApacheSlingDistributionAgentImplReverseDistributionAgentFacto([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/org.apache.sling.distribution.agent.impl.ReverseDistributionAgentFactory")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("OrgApacheSlingDistributionAgentImplReverseDistributionAgentFacto");
            return method != null
                ? (await ((Task<OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactor")]
        public async Task<ActionResult<OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorInfo>> _OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactor([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/org.apache.sling.distribution.agent.impl.SimpleDistributionAgentFactory")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactor");
            return method != null
                ? (await ((Task<OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactory")]
        public async Task<ActionResult<OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryInfo>> _OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactory([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/org.apache.sling.distribution.agent.impl.SyncDistributionAgentFactory")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactory");
            return method != null
                ? (await ((Task<OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_OrgApacheSlingDistributionMonitorDistributionQueueHealthCheck")]
        public async Task<ActionResult<OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckInfo>> _OrgApacheSlingDistributionMonitorDistributionQueueHealthCheck([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/org.apache.sling.distribution.monitor.DistributionQueueHealthCheck")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("OrgApacheSlingDistributionMonitorDistributionQueueHealthCheck");
            return method != null
                ? (await ((Task<OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_OrgApacheSlingDistributionPackagingImplExporterAgentDistributio")]
        public async Task<ActionResult<OrgApacheSlingDistributionPackagingImplExporterAgentDistributioInfo>> _OrgApacheSlingDistributionPackagingImplExporterAgentDistributio([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/org.apache.sling.distribution.packaging.impl.exporter.AgentDistributionPackageExporterFactory")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("OrgApacheSlingDistributionPackagingImplExporterAgentDistributio");
            return method != null
                ? (await ((Task<OrgApacheSlingDistributionPackagingImplExporterAgentDistributioInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_OrgApacheSlingDistributionPackagingImplExporterLocalDistributio")]
        public async Task<ActionResult<OrgApacheSlingDistributionPackagingImplExporterLocalDistributioInfo>> _OrgApacheSlingDistributionPackagingImplExporterLocalDistributio([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/org.apache.sling.distribution.packaging.impl.exporter.LocalDistributionPackageExporterFactory")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("OrgApacheSlingDistributionPackagingImplExporterLocalDistributio");
            return method != null
                ? (await ((Task<OrgApacheSlingDistributionPackagingImplExporterLocalDistributioInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_OrgApacheSlingDistributionPackagingImplExporterRemoteDistributi")]
        public async Task<ActionResult<OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiInfo>> _OrgApacheSlingDistributionPackagingImplExporterRemoteDistributi([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/org.apache.sling.distribution.packaging.impl.exporter.RemoteDistributionPackageExporterFactory")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("OrgApacheSlingDistributionPackagingImplExporterRemoteDistributi");
            return method != null
                ? (await ((Task<OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_OrgApacheSlingDistributionPackagingImplImporterLocalDistributio")]
        public async Task<ActionResult<OrgApacheSlingDistributionPackagingImplImporterLocalDistributioInfo>> _OrgApacheSlingDistributionPackagingImplImporterLocalDistributio([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/org.apache.sling.distribution.packaging.impl.importer.LocalDistributionPackageImporterFactory")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("OrgApacheSlingDistributionPackagingImplImporterLocalDistributio");
            return method != null
                ? (await ((Task<OrgApacheSlingDistributionPackagingImplImporterLocalDistributioInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_OrgApacheSlingDistributionPackagingImplImporterRemoteDistributi")]
        public async Task<ActionResult<OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiInfo>> _OrgApacheSlingDistributionPackagingImplImporterRemoteDistributi([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/org.apache.sling.distribution.packaging.impl.importer.RemoteDistributionPackageImporterFactory")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("OrgApacheSlingDistributionPackagingImplImporterRemoteDistributi");
            return method != null
                ? (await ((Task<OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_OrgApacheSlingDistributionPackagingImplImporterRepositoryDistri")]
        public async Task<ActionResult<OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriInfo>> _OrgApacheSlingDistributionPackagingImplImporterRepositoryDistri([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/org.apache.sling.distribution.packaging.impl.importer.RepositoryDistributionPackageImporterFactory")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("OrgApacheSlingDistributionPackagingImplImporterRepositoryDistri");
            return method != null
                ? (await ((Task<OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_OrgApacheSlingDistributionResourcesImplDistributionConfiguration")]
        public async Task<ActionResult<OrgApacheSlingDistributionResourcesImplDistributionConfigurationInfo>> _OrgApacheSlingDistributionResourcesImplDistributionConfiguration([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/org.apache.sling.distribution.resources.impl.DistributionConfigurationResourceProviderFactory")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("OrgApacheSlingDistributionResourcesImplDistributionConfiguration");
            return method != null
                ? (await ((Task<OrgApacheSlingDistributionResourcesImplDistributionConfigurationInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_OrgApacheSlingDistributionResourcesImplDistributionServiceResour")]
        public async Task<ActionResult<OrgApacheSlingDistributionResourcesImplDistributionServiceResourInfo>> _OrgApacheSlingDistributionResourcesImplDistributionServiceResour([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/org.apache.sling.distribution.resources.impl.DistributionServiceResourceProviderFactory")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("OrgApacheSlingDistributionResourcesImplDistributionServiceResour");
            return method != null
                ? (await ((Task<OrgApacheSlingDistributionResourcesImplDistributionServiceResourInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_OrgApacheSlingDistributionSerializationImplDistributionPackageBu")]
        public async Task<ActionResult<OrgApacheSlingDistributionSerializationImplDistributionPackageBuInfo>> _OrgApacheSlingDistributionSerializationImplDistributionPackageBu([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/org.apache.sling.distribution.serialization.impl.DistributionPackageBuilderFactory")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("OrgApacheSlingDistributionSerializationImplDistributionPackageBu");
            return method != null
                ? (await ((Task<OrgApacheSlingDistributionSerializationImplDistributionPackageBuInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_OrgApacheSlingDistributionSerializationImplVltVaultDistribution")]
        public async Task<ActionResult<OrgApacheSlingDistributionSerializationImplVltVaultDistributionInfo>> _OrgApacheSlingDistributionSerializationImplVltVaultDistribution([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/org.apache.sling.distribution.serialization.impl.vlt.VaultDistributionPackageBuilderFactory")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("OrgApacheSlingDistributionSerializationImplVltVaultDistribution");
            return method != null
                ? (await ((Task<OrgApacheSlingDistributionSerializationImplVltVaultDistributionInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_OrgApacheSlingDistributionTransportImplUserCredentialsDistributi")]
        public async Task<ActionResult<OrgApacheSlingDistributionTransportImplUserCredentialsDistributiInfo>> _OrgApacheSlingDistributionTransportImplUserCredentialsDistributi([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/org.apache.sling.distribution.transport.impl.UserCredentialsDistributionTransportSecretProvider")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("OrgApacheSlingDistributionTransportImplUserCredentialsDistributi");
            return method != null
                ? (await ((Task<OrgApacheSlingDistributionTransportImplUserCredentialsDistributiInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_OrgApacheSlingDistributionTriggerImplDistributionEventDistribute")]
        public async Task<ActionResult<OrgApacheSlingDistributionTriggerImplDistributionEventDistributeInfo>> _OrgApacheSlingDistributionTriggerImplDistributionEventDistribute([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/org.apache.sling.distribution.trigger.impl.DistributionEventDistributeDistributionTriggerFactory")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("OrgApacheSlingDistributionTriggerImplDistributionEventDistribute");
            return method != null
                ? (await ((Task<OrgApacheSlingDistributionTriggerImplDistributionEventDistributeInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_OrgApacheSlingDistributionTriggerImplJcrEventDistributionTrigger")]
        public async Task<ActionResult<OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerInfo>> _OrgApacheSlingDistributionTriggerImplJcrEventDistributionTrigger([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/org.apache.sling.distribution.trigger.impl.JcrEventDistributionTriggerFactory")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("OrgApacheSlingDistributionTriggerImplJcrEventDistributionTrigger");
            return method != null
                ? (await ((Task<OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributi")]
        public async Task<ActionResult<OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiInfo>> _OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributi([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/org.apache.sling.distribution.trigger.impl.PersistedJcrEventDistributionTriggerFactory")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributi");
            return method != null
                ? (await ((Task<OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrig")]
        public async Task<ActionResult<OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigInfo>> _OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrig([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/org.apache.sling.distribution.trigger.impl.RemoteEventDistributionTriggerFactory")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrig");
            return method != null
                ? (await ((Task<OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_OrgApacheSlingDistributionTriggerImplResourceEventDistributionTr")]
        public async Task<ActionResult<OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrInfo>> _OrgApacheSlingDistributionTriggerImplResourceEventDistributionTr([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/org.apache.sling.distribution.trigger.impl.ResourceEventDistributionTriggerFactory")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("OrgApacheSlingDistributionTriggerImplResourceEventDistributionTr");
            return method != null
                ? (await ((Task<OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_OrgApacheSlingDistributionTriggerImplScheduledDistributionTrigge")]
        public async Task<ActionResult<OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeInfo>> _OrgApacheSlingDistributionTriggerImplScheduledDistributionTrigge([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/org.apache.sling.distribution.trigger.impl.ScheduledDistributionTriggerFactory")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("OrgApacheSlingDistributionTriggerImplScheduledDistributionTrigge");
            return method != null
                ? (await ((Task<OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_OrgApacheSlingEngineImplAuthSlingAuthenticator")]
        public async Task<ActionResult<OrgApacheSlingEngineImplAuthSlingAuthenticatorInfo>> _OrgApacheSlingEngineImplAuthSlingAuthenticator([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/org.apache.sling.engine.impl.auth.SlingAuthenticator")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("OrgApacheSlingEngineImplAuthSlingAuthenticator");
            return method != null
                ? (await ((Task<OrgApacheSlingEngineImplAuthSlingAuthenticatorInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilter")]
        public async Task<ActionResult<OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterInfo>> _OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilter([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/org.apache.sling.engine.impl.debug.RequestProgressTrackerLogFilter")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilter");
            return method != null
                ? (await ((Task<OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_OrgApacheSlingEngineImplLogRequestLogger")]
        public async Task<ActionResult<OrgApacheSlingEngineImplLogRequestLoggerInfo>> _OrgApacheSlingEngineImplLogRequestLogger([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/org.apache.sling.engine.impl.log.RequestLogger")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("OrgApacheSlingEngineImplLogRequestLogger");
            return method != null
                ? (await ((Task<OrgApacheSlingEngineImplLogRequestLoggerInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_OrgApacheSlingEngineImplLogRequestLoggerService")]
        public async Task<ActionResult<OrgApacheSlingEngineImplLogRequestLoggerServiceInfo>> _OrgApacheSlingEngineImplLogRequestLoggerService([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/org.apache.sling.engine.impl.log.RequestLoggerService")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("OrgApacheSlingEngineImplLogRequestLoggerService");
            return method != null
                ? (await ((Task<OrgApacheSlingEngineImplLogRequestLoggerServiceInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_OrgApacheSlingEngineImplSlingMainServlet")]
        public async Task<ActionResult<OrgApacheSlingEngineImplSlingMainServletInfo>> _OrgApacheSlingEngineImplSlingMainServlet([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/org.apache.sling.engine.impl.SlingMainServlet")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("OrgApacheSlingEngineImplSlingMainServlet");
            return method != null
                ? (await ((Task<OrgApacheSlingEngineImplSlingMainServletInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_OrgApacheSlingEngineParameters")]
        public async Task<ActionResult<OrgApacheSlingEngineParametersInfo>> _OrgApacheSlingEngineParameters([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/org.apache.sling.engine.parameters")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("OrgApacheSlingEngineParameters");
            return method != null
                ? (await ((Task<OrgApacheSlingEngineParametersInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_OrgApacheSlingEventImplEventingThreadPool")]
        public async Task<ActionResult<OrgApacheSlingEventImplEventingThreadPoolInfo>> _OrgApacheSlingEventImplEventingThreadPool([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/org.apache.sling.event.impl.EventingThreadPool")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("OrgApacheSlingEventImplEventingThreadPool");
            return method != null
                ? (await ((Task<OrgApacheSlingEventImplEventingThreadPoolInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_OrgApacheSlingEventImplJobsDefaultJobManager")]
        public async Task<ActionResult<OrgApacheSlingEventImplJobsDefaultJobManagerInfo>> _OrgApacheSlingEventImplJobsDefaultJobManager([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/org.apache.sling.event.impl.jobs.DefaultJobManager")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("OrgApacheSlingEventImplJobsDefaultJobManager");
            return method != null
                ? (await ((Task<OrgApacheSlingEventImplJobsDefaultJobManagerInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_OrgApacheSlingEventImplJobsJcrPersistenceHandler")]
        public async Task<ActionResult<OrgApacheSlingEventImplJobsJcrPersistenceHandlerInfo>> _OrgApacheSlingEventImplJobsJcrPersistenceHandler([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/org.apache.sling.event.impl.jobs.jcr.PersistenceHandler")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("OrgApacheSlingEventImplJobsJcrPersistenceHandler");
            return method != null
                ? (await ((Task<OrgApacheSlingEventImplJobsJcrPersistenceHandlerInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_OrgApacheSlingEventImplJobsJobConsumerManager")]
        public async Task<ActionResult<OrgApacheSlingEventImplJobsJobConsumerManagerInfo>> _OrgApacheSlingEventImplJobsJobConsumerManager([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/org.apache.sling.event.impl.jobs.JobConsumerManager")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("OrgApacheSlingEventImplJobsJobConsumerManager");
            return method != null
                ? (await ((Task<OrgApacheSlingEventImplJobsJobConsumerManagerInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_OrgApacheSlingEventJobsQueueConfiguration")]
        public async Task<ActionResult<OrgApacheSlingEventJobsQueueConfigurationInfo>> _OrgApacheSlingEventJobsQueueConfiguration([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/org.apache.sling.event.jobs.QueueConfiguration")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("OrgApacheSlingEventJobsQueueConfiguration");
            return method != null
                ? (await ((Task<OrgApacheSlingEventJobsQueueConfigurationInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingW")]
        public async Task<ActionResult<OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWInfo>> _OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingW([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/org.apache.sling.extensions.webconsolesecurityprovider.internal.SlingWebConsoleSecurityProvider")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingW");
            return method != null
                ? (await ((Task<OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_OrgApacheSlingFeatureflagsFeature")]
        public async Task<ActionResult<OrgApacheSlingFeatureflagsFeatureInfo>> _OrgApacheSlingFeatureflagsFeature([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/org.apache.sling.featureflags.Feature")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("OrgApacheSlingFeatureflagsFeature");
            return method != null
                ? (await ((Task<OrgApacheSlingFeatureflagsFeatureInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_OrgApacheSlingFeatureflagsImplConfiguredFeature")]
        public async Task<ActionResult<OrgApacheSlingFeatureflagsImplConfiguredFeatureInfo>> _OrgApacheSlingFeatureflagsImplConfiguredFeature([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/org.apache.sling.featureflags.impl.ConfiguredFeature")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("OrgApacheSlingFeatureflagsImplConfiguredFeature");
            return method != null
                ? (await ((Task<OrgApacheSlingFeatureflagsImplConfiguredFeatureInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_OrgApacheSlingHapiImplHApiUtilImpl")]
        public async Task<ActionResult<OrgApacheSlingHapiImplHApiUtilImplInfo>> _OrgApacheSlingHapiImplHApiUtilImpl([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/org.apache.sling.hapi.impl.HApiUtilImpl")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("OrgApacheSlingHapiImplHApiUtilImpl");
            return method != null
                ? (await ((Task<OrgApacheSlingHapiImplHApiUtilImplInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_OrgApacheSlingHcCoreImplCompositeHealthCheck")]
        public async Task<ActionResult<OrgApacheSlingHcCoreImplCompositeHealthCheckInfo>> _OrgApacheSlingHcCoreImplCompositeHealthCheck([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/org.apache.sling.hc.core.impl.CompositeHealthCheck")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("OrgApacheSlingHcCoreImplCompositeHealthCheck");
            return method != null
                ? (await ((Task<OrgApacheSlingHcCoreImplCompositeHealthCheckInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImpl")]
        public async Task<ActionResult<OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplInfo>> _OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImpl([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/org.apache.sling.hc.core.impl.executor.HealthCheckExecutorImpl")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImpl");
            return method != null
                ? (await ((Task<OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_OrgApacheSlingHcCoreImplJmxAttributeHealthCheck")]
        public async Task<ActionResult<OrgApacheSlingHcCoreImplJmxAttributeHealthCheckInfo>> _OrgApacheSlingHcCoreImplJmxAttributeHealthCheck([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/org.apache.sling.hc.core.impl.JmxAttributeHealthCheck")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("OrgApacheSlingHcCoreImplJmxAttributeHealthCheck");
            return method != null
                ? (await ((Task<OrgApacheSlingHcCoreImplJmxAttributeHealthCheckInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_OrgApacheSlingHcCoreImplScriptableHealthCheck")]
        public async Task<ActionResult<OrgApacheSlingHcCoreImplScriptableHealthCheckInfo>> _OrgApacheSlingHcCoreImplScriptableHealthCheck([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/org.apache.sling.hc.core.impl.ScriptableHealthCheck")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("OrgApacheSlingHcCoreImplScriptableHealthCheck");
            return method != null
                ? (await ((Task<OrgApacheSlingHcCoreImplScriptableHealthCheckInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_OrgApacheSlingHcCoreImplServletHealthCheckExecutorServlet")]
        public async Task<ActionResult<OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletInfo>> _OrgApacheSlingHcCoreImplServletHealthCheckExecutorServlet([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/org.apache.sling.hc.core.impl.servlet.HealthCheckExecutorServlet")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("OrgApacheSlingHcCoreImplServletHealthCheckExecutorServlet");
            return method != null
                ? (await ((Task<OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializer")]
        public async Task<ActionResult<OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerInfo>> _OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializer([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/org.apache.sling.hc.core.impl.servlet.ResultTxtVerboseSerializer")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializer");
            return method != null
                ? (await ((Task<OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_OrgApacheSlingI18nImplI18NFilter")]
        public async Task<ActionResult<OrgApacheSlingI18nImplI18NFilterInfo>> _OrgApacheSlingI18nImplI18NFilter([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/org.apache.sling.i18n.impl.I18NFilter")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("OrgApacheSlingI18nImplI18NFilter");
            return method != null
                ? (await ((Task<OrgApacheSlingI18nImplI18NFilterInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_OrgApacheSlingI18nImplJcrResourceBundleProvider")]
        public async Task<ActionResult<OrgApacheSlingI18nImplJcrResourceBundleProviderInfo>> _OrgApacheSlingI18nImplJcrResourceBundleProvider([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/org.apache.sling.i18n.impl.JcrResourceBundleProvider")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("OrgApacheSlingI18nImplJcrResourceBundleProvider");
            return method != null
                ? (await ((Task<OrgApacheSlingI18nImplJcrResourceBundleProviderInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_OrgApacheSlingInstallerProviderJcrImplJcrInstaller")]
        public async Task<ActionResult<OrgApacheSlingInstallerProviderJcrImplJcrInstallerInfo>> _OrgApacheSlingInstallerProviderJcrImplJcrInstaller([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/org.apache.sling.installer.provider.jcr.impl.JcrInstaller")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("OrgApacheSlingInstallerProviderJcrImplJcrInstaller");
            return method != null
                ? (await ((Task<OrgApacheSlingInstallerProviderJcrImplJcrInstallerInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_OrgApacheSlingJcrBaseInternalLoginAdminWhitelist")]
        public async Task<ActionResult<OrgApacheSlingJcrBaseInternalLoginAdminWhitelistInfo>> _OrgApacheSlingJcrBaseInternalLoginAdminWhitelist([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/org.apache.sling.jcr.base.internal.LoginAdminWhitelist")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("OrgApacheSlingJcrBaseInternalLoginAdminWhitelist");
            return method != null
                ? (await ((Task<OrgApacheSlingJcrBaseInternalLoginAdminWhitelistInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragment")]
        public async Task<ActionResult<OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentInfo>> _OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragment([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/org.apache.sling.jcr.base.internal.LoginAdminWhitelist.fragment")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragment");
            return method != null
                ? (await ((Task<OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_OrgApacheSlingJcrDavexImplServletsSlingDavExServlet")]
        public async Task<ActionResult<OrgApacheSlingJcrDavexImplServletsSlingDavExServletInfo>> _OrgApacheSlingJcrDavexImplServletsSlingDavExServlet([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/org.apache.sling.jcr.davex.impl.servlets.SlingDavExServlet")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("OrgApacheSlingJcrDavexImplServletsSlingDavExServlet");
            return method != null
                ? (await ((Task<OrgApacheSlingJcrDavexImplServletsSlingDavExServletInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupport")]
        public async Task<ActionResult<OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportInfo>> _OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupport([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/org.apache.sling.jcr.jackrabbit.server.JndiRegistrationSupport")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupport");
            return method != null
                ? (await ((Task<OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupport")]
        public async Task<ActionResult<OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportInfo>> _OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupport([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/org.apache.sling.jcr.jackrabbit.server.RmiRegistrationSupport")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupport");
            return method != null
                ? (await ((Task<OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_OrgApacheSlingJcrRepoinitImplRepositoryInitializer")]
        public async Task<ActionResult<OrgApacheSlingJcrRepoinitImplRepositoryInitializerInfo>> _OrgApacheSlingJcrRepoinitImplRepositoryInitializer([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/org.apache.sling.jcr.repoinit.impl.RepositoryInitializer")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("OrgApacheSlingJcrRepoinitImplRepositoryInitializer");
            return method != null
                ? (await ((Task<OrgApacheSlingJcrRepoinitImplRepositoryInitializerInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_OrgApacheSlingJcrRepoinitRepositoryInitializer")]
        public async Task<ActionResult<OrgApacheSlingJcrRepoinitRepositoryInitializerInfo>> _OrgApacheSlingJcrRepoinitRepositoryInitializer([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/org.apache.sling.jcr.repoinit.RepositoryInitializer")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("OrgApacheSlingJcrRepoinitRepositoryInitializer");
            return method != null
                ? (await ((Task<OrgApacheSlingJcrRepoinitRepositoryInitializerInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImpl")]
        public async Task<ActionResult<OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplInfo>> _OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImpl([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/org.apache.sling.jcr.resource.internal.JcrResourceResolverFactoryImpl")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImpl");
            return method != null
                ? (await ((Task<OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_OrgApacheSlingJcrResourceInternalJcrSystemUserValidator")]
        public async Task<ActionResult<OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorInfo>> _OrgApacheSlingJcrResourceInternalJcrSystemUserValidator([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/org.apache.sling.jcr.resource.internal.JcrSystemUserValidator")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("OrgApacheSlingJcrResourceInternalJcrSystemUserValidator");
            return method != null
                ? (await ((Task<OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactory")]
        public async Task<ActionResult<OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryInfo>> _OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactory([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/org.apache.sling.jcr.resourcesecurity.impl.ResourceAccessGateFactory")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactory");
            return method != null
                ? (await ((Task<OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerService")]
        public async Task<ActionResult<OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceInfo>> _OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerService([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/org.apache.sling.jcr.webdav.impl.handler.DefaultHandlerService")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerService");
            return method != null
                ? (await ((Task<OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServic")]
        public async Task<ActionResult<OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicInfo>> _OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServic([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/org.apache.sling.jcr.webdav.impl.handler.DirListingExportHandlerService")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServic");
            return method != null
                ? (await ((Task<OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServlet")]
        public async Task<ActionResult<OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletInfo>> _OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServlet([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/org.apache.sling.jcr.webdav.impl.servlets.SimpleWebDavServlet")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServlet");
            return method != null
                ? (await ((Task<OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_OrgApacheSlingJmxProviderImplJMXResourceProvider")]
        public async Task<ActionResult<OrgApacheSlingJmxProviderImplJMXResourceProviderInfo>> _OrgApacheSlingJmxProviderImplJMXResourceProvider([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/org.apache.sling.jmx.provider.impl.JMXResourceProvider")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("OrgApacheSlingJmxProviderImplJMXResourceProvider");
            return method != null
                ? (await ((Task<OrgApacheSlingJmxProviderImplJMXResourceProviderInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_OrgApacheSlingModelsImplModelAdapterFactory")]
        public async Task<ActionResult<OrgApacheSlingModelsImplModelAdapterFactoryInfo>> _OrgApacheSlingModelsImplModelAdapterFactory([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/org.apache.sling.models.impl.ModelAdapterFactory")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("OrgApacheSlingModelsImplModelAdapterFactory");
            return method != null
                ? (await ((Task<OrgApacheSlingModelsImplModelAdapterFactoryInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_OrgApacheSlingModelsJacksonexporterImplResourceModuleProvider")]
        public async Task<ActionResult<OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderInfo>> _OrgApacheSlingModelsJacksonexporterImplResourceModuleProvider([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/org.apache.sling.models.jacksonexporter.impl.ResourceModuleProvider")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("OrgApacheSlingModelsJacksonexporterImplResourceModuleProvider");
            return method != null
                ? (await ((Task<OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFacto")]
        public async Task<ActionResult<OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoInfo>> _OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFacto([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/org.apache.sling.resource.inventory.impl.ResourceInventoryPrinterFactory")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFacto");
            return method != null
                ? (await ((Task<OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_OrgApacheSlingResourcemergerImplMergedResourceProviderFactory")]
        public async Task<ActionResult<OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryInfo>> _OrgApacheSlingResourcemergerImplMergedResourceProviderFactory([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/org.apache.sling.resourcemerger.impl.MergedResourceProviderFactory")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("OrgApacheSlingResourcemergerImplMergedResourceProviderFactory");
            return method != null
                ? (await ((Task<OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_OrgApacheSlingResourcemergerPickerOverriding")]
        public async Task<ActionResult<OrgApacheSlingResourcemergerPickerOverridingInfo>> _OrgApacheSlingResourcemergerPickerOverriding([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/org.apache.sling.resourcemerger.picker.overriding")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("OrgApacheSlingResourcemergerPickerOverriding");
            return method != null
                ? (await ((Task<OrgApacheSlingResourcemergerPickerOverridingInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_OrgApacheSlingScriptingCoreImplScriptCacheImpl")]
        public async Task<ActionResult<OrgApacheSlingScriptingCoreImplScriptCacheImplInfo>> _OrgApacheSlingScriptingCoreImplScriptCacheImpl([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/org.apache.sling.scripting.core.impl.ScriptCacheImpl")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("OrgApacheSlingScriptingCoreImplScriptCacheImpl");
            return method != null
                ? (await ((Task<OrgApacheSlingScriptingCoreImplScriptCacheImplInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_OrgApacheSlingScriptingCoreImplScriptingResourceResolverProvider")]
        public async Task<ActionResult<OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderInfo>> _OrgApacheSlingScriptingCoreImplScriptingResourceResolverProvider([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/org.apache.sling.scripting.core.impl.ScriptingResourceResolverProviderImpl")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("OrgApacheSlingScriptingCoreImplScriptingResourceResolverProvider");
            return method != null
                ? (await ((Task<OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_OrgApacheSlingScriptingJavaImplJavaScriptEngineFactory")]
        public async Task<ActionResult<OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryInfo>> _OrgApacheSlingScriptingJavaImplJavaScriptEngineFactory([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/org.apache.sling.scripting.java.impl.JavaScriptEngineFactory")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("OrgApacheSlingScriptingJavaImplJavaScriptEngineFactory");
            return method != null
                ? (await ((Task<OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFa")]
        public async Task<ActionResult<OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaInfo>> _OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFa([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/org.apache.sling.scripting.javascript.internal.RhinoJavaScriptEngineFactory")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFa");
            return method != null
                ? (await ((Task<OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_OrgApacheSlingScriptingJspJspScriptEngineFactory")]
        public async Task<ActionResult<OrgApacheSlingScriptingJspJspScriptEngineFactoryInfo>> _OrgApacheSlingScriptingJspJspScriptEngineFactory([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/org.apache.sling.scripting.jsp.JspScriptEngineFactory")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("OrgApacheSlingScriptingJspJspScriptEngineFactory");
            return method != null
                ? (await ((Task<OrgApacheSlingScriptingJspJspScriptEngineFactoryInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProv")]
        public async Task<ActionResult<OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvInfo>> _OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProv([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/org.apache.sling.scripting.sightly.js.impl.jsapi.SlyBindingsValuesProvider")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProv");
            return method != null
                ? (await ((Task<OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_OrgApacheSlingSecurityImplContentDispositionFilter")]
        public async Task<ActionResult<OrgApacheSlingSecurityImplContentDispositionFilterInfo>> _OrgApacheSlingSecurityImplContentDispositionFilter([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/org.apache.sling.security.impl.ContentDispositionFilter")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("OrgApacheSlingSecurityImplContentDispositionFilter");
            return method != null
                ? (await ((Task<OrgApacheSlingSecurityImplContentDispositionFilterInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_OrgApacheSlingSecurityImplReferrerFilter")]
        public async Task<ActionResult<OrgApacheSlingSecurityImplReferrerFilterInfo>> _OrgApacheSlingSecurityImplReferrerFilter([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/org.apache.sling.security.impl.ReferrerFilter")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("OrgApacheSlingSecurityImplReferrerFilter");
            return method != null
                ? (await ((Task<OrgApacheSlingSecurityImplReferrerFilterInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_OrgApacheSlingServiceusermappingImplServiceUserMapperImpl")]
        public async Task<ActionResult<OrgApacheSlingServiceusermappingImplServiceUserMapperImplInfo>> _OrgApacheSlingServiceusermappingImplServiceUserMapperImpl([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/org.apache.sling.serviceusermapping.impl.ServiceUserMapperImpl")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("OrgApacheSlingServiceusermappingImplServiceUserMapperImpl");
            return method != null
                ? (await ((Task<OrgApacheSlingServiceusermappingImplServiceUserMapperImplInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmended")]
        public async Task<ActionResult<OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedInfo>> _OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmended([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/org.apache.sling.serviceusermapping.impl.ServiceUserMapperImpl.amended")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmended");
            return method != null
                ? (await ((Task<OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_OrgApacheSlingServletsGetDefaultGetServlet")]
        public async Task<ActionResult<OrgApacheSlingServletsGetDefaultGetServletInfo>> _OrgApacheSlingServletsGetDefaultGetServlet([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/org.apache.sling.servlets.get.DefaultGetServlet")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("OrgApacheSlingServletsGetDefaultGetServlet");
            return method != null
                ? (await ((Task<OrgApacheSlingServletsGetDefaultGetServletInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_OrgApacheSlingServletsGetImplVersionVersionInfoServlet")]
        public async Task<ActionResult<OrgApacheSlingServletsGetImplVersionVersionInfoServletInfo>> _OrgApacheSlingServletsGetImplVersionVersionInfoServlet([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/org.apache.sling.servlets.get.impl.version.VersionInfoServlet")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("OrgApacheSlingServletsGetImplVersionVersionInfoServlet");
            return method != null
                ? (await ((Task<OrgApacheSlingServletsGetImplVersionVersionInfoServletInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_OrgApacheSlingServletsPostImplHelperChunkCleanUpTask")]
        public async Task<ActionResult<OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskInfo>> _OrgApacheSlingServletsPostImplHelperChunkCleanUpTask([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/org.apache.sling.servlets.post.impl.helper.ChunkCleanUpTask")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("OrgApacheSlingServletsPostImplHelperChunkCleanUpTask");
            return method != null
                ? (await ((Task<OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_OrgApacheSlingServletsPostImplSlingPostServlet")]
        public async Task<ActionResult<OrgApacheSlingServletsPostImplSlingPostServletInfo>> _OrgApacheSlingServletsPostImplSlingPostServlet([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/org.apache.sling.servlets.post.impl.SlingPostServlet")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("OrgApacheSlingServletsPostImplSlingPostServlet");
            return method != null
                ? (await ((Task<OrgApacheSlingServletsPostImplSlingPostServletInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_OrgApacheSlingServletsResolverSlingServletResolver")]
        public async Task<ActionResult<OrgApacheSlingServletsResolverSlingServletResolverInfo>> _OrgApacheSlingServletsResolverSlingServletResolver([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/org.apache.sling.servlets.resolver.SlingServletResolver")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("OrgApacheSlingServletsResolverSlingServletResolver");
            return method != null
                ? (await ((Task<OrgApacheSlingServletsResolverSlingServletResolverInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_OrgApacheSlingSettingsImplSlingSettingsServiceImpl")]
        public async Task<ActionResult<OrgApacheSlingSettingsImplSlingSettingsServiceImplInfo>> _OrgApacheSlingSettingsImplSlingSettingsServiceImpl([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/org.apache.sling.settings.impl.SlingSettingsServiceImpl")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("OrgApacheSlingSettingsImplSlingSettingsServiceImpl");
            return method != null
                ? (await ((Task<OrgApacheSlingSettingsImplSlingSettingsServiceImplInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_OrgApacheSlingStartupfilterImplStartupFilterImpl")]
        public async Task<ActionResult<OrgApacheSlingStartupfilterImplStartupFilterImplInfo>> _OrgApacheSlingStartupfilterImplStartupFilterImpl([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/org.apache.sling.startupfilter.impl.StartupFilterImpl")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("OrgApacheSlingStartupfilterImplStartupFilterImpl");
            return method != null
                ? (await ((Task<OrgApacheSlingStartupfilterImplStartupFilterImplInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_OrgApacheSlingTenantInternalTenantProviderImpl")]
        public async Task<ActionResult<OrgApacheSlingTenantInternalTenantProviderImplInfo>> _OrgApacheSlingTenantInternalTenantProviderImpl([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/org.apache.sling.tenant.internal.TenantProviderImpl")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("OrgApacheSlingTenantInternalTenantProviderImpl");
            return method != null
                ? (await ((Task<OrgApacheSlingTenantInternalTenantProviderImplInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_OrgApacheSlingTracerInternalLogTracer")]
        public async Task<ActionResult<OrgApacheSlingTracerInternalLogTracerInfo>> _OrgApacheSlingTracerInternalLogTracer([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/org.apache.sling.tracer.internal.LogTracer")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("OrgApacheSlingTracerInternalLogTracer");
            return method != null
                ? (await ((Task<OrgApacheSlingTracerInternalLogTracerInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ConfigmgrApi_OrgApacheSlingXssImplXSSFilterImpl")]
        public async Task<ActionResult<OrgApacheSlingXssImplXSSFilterImplInfo>> _OrgApacheSlingXssImplXSSFilterImpl([HttpTrigger(AuthorizationLevel.Anonymous, "Post", Route = "system/console/configMgr/org.apache.sling.xss.impl.XSSFilterImpl")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("OrgApacheSlingXssImplXSSFilterImpl");
            return method != null
                ? (await ((Task<OrgApacheSlingXssImplXSSFilterImplInfo>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
