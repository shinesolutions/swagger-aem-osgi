# Adobe Experience Manager OSGI config (AEM) API API Client

Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API

## Requirements

- [Salesforce DX](https://www.salesforce.com/products/platform/products/salesforce-dx/)


If everything is set correctly:

- Running `sfdx version` in a command prompt should output something like:

  ```bash
  sfdx-cli/5.7.5-05549de (darwin-amd64) go1.7.5 sfdxstable
  ```


## Installation

1. Copy the output into your Salesforce DX folder - or alternatively deploy the output directly into the workspace.
2. Deploy the code via Salesforce DX to your Scratch Org

   ```bash
   $ sfdx force:source:push
   ```
3. If the API needs authentication update the Named Credential in Setup.
4. Run your Apex tests using

    ```bash
    $ sfdx sfdx force:apex:test:run
    ```
5. Retrieve the job id from the console and check the test results.

  ```bash
  $ sfdx force:apex:test:report -i theJobId
  ```


## Getting Started

Please follow the [installation](#installation) instruction and execute the following Apex code:

```java
OASConfigmgrApi api = new OASConfigmgrApi();
OASClient client = api.getClient();


Map<String, Object> params = new Map<String, Object>{
    'post' => Boolean.getExample(),
    'apply' => Boolean.getExample(),
    'r_delete' => Boolean.getExample(),
    'action' => 'null',
    'location' => 'null',
    'propertylist' => new List<String>{''},
    'showPlaceholder' => Boolean.getExample(),
    'maximumCacheEntries' => Integer.getExample(),
    'afScriptingCompatversion' => 'null',
    'makeFileNameUnique' => Boolean.getExample(),
    'generatingCompliantData' => Boolean.getExample()
};

try {
    // cross your fingers
    OASAdaptiveFormAndInteractiveCommuni result = api.adaptiveFormAndInteractiveCommunicationWebChannelConfiguration(params);
    System.debug(result);
} catch (OAS.ApiException e) {
    // ...handle your exceptions
}
```

## Documentation for API Endpoints

All URIs are relative to *http://localhost*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*OASConfigmgrApi* | [**adaptiveFormAndInteractiveCommunicationWebChannelConfiguration**](OASConfigmgrApi.md#adaptiveFormAndInteractiveCommunicationWebChannelConfiguration) | **POST** /system/console/configMgr/Adaptive Form and Interactive Communication Web Channel Configuration | 
*OASConfigmgrApi* | [**adaptiveFormAndInteractiveCommunicationWebChannelThemeConfigur**](OASConfigmgrApi.md#adaptiveFormAndInteractiveCommunicationWebChannelThemeConfigur) | **POST** /system/console/configMgr/Adaptive Form and Interactive Communication Web Channel Theme Configuration | 
*OASConfigmgrApi* | [**analyticsComponentQueryCacheService**](OASConfigmgrApi.md#analyticsComponentQueryCacheService) | **POST** /system/console/configMgr/Analytics Component Query Cache Service | 
*OASConfigmgrApi* | [**apacheSlingHealthCheckResultHTMLSerializer**](OASConfigmgrApi.md#apacheSlingHealthCheckResultHTMLSerializer) | **POST** /system/console/configMgr/Apache Sling Health Check Result HTML Serializer | 
*OASConfigmgrApi* | [**comAdobeAemFormsndocumentsConfigAEMFormsManagerConfiguration**](OASConfigmgrApi.md#comAdobeAemFormsndocumentsConfigAEMFormsManagerConfiguration) | **POST** /system/console/configMgr/com.adobe.aem.formsndocuments.config.AEMFormsManagerConfiguration | 
*OASConfigmgrApi* | [**comAdobeAemTransactionCoreImplTransactionRecorder**](OASConfigmgrApi.md#comAdobeAemTransactionCoreImplTransactionRecorder) | **POST** /system/console/configMgr/com.adobe.aem.transaction.core.impl.TransactionRecorder | 
*OASConfigmgrApi* | [**comAdobeAemUpgradePrechecksHcImplDeprecateIndexesHC**](OASConfigmgrApi.md#comAdobeAemUpgradePrechecksHcImplDeprecateIndexesHC) | **POST** /system/console/configMgr/com.adobe.aem.upgrade.prechecks.hc.impl.DeprecateIndexesHC | 
*OASConfigmgrApi* | [**comAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHC**](OASConfigmgrApi.md#comAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHC) | **POST** /system/console/configMgr/com.adobe.aem.upgrade.prechecks.hc.impl.ReplicationAgentsDisabledHC | 
*OASConfigmgrApi* | [**comAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImpl**](OASConfigmgrApi.md#comAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImpl) | **POST** /system/console/configMgr/com.adobe.aem.upgrade.prechecks.mbean.impl.PreUpgradeTasksMBeanImpl | 
*OASConfigmgrApi* | [**comAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImpl**](OASConfigmgrApi.md#comAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImpl) | **POST** /system/console/configMgr/com.adobe.aem.upgrade.prechecks.tasks.impl.ConsistencyCheckTaskImpl | 
*OASConfigmgrApi* | [**comAdobeCqAccountApiAccountManagementService**](OASConfigmgrApi.md#comAdobeCqAccountApiAccountManagementService) | **POST** /system/console/configMgr/com.adobe.cq.account.api.AccountManagementService | 
*OASConfigmgrApi* | [**comAdobeCqAccountImplAccountManagementServlet**](OASConfigmgrApi.md#comAdobeCqAccountImplAccountManagementServlet) | **POST** /system/console/configMgr/com.adobe.cq.account.impl.AccountManagementServlet | 
*OASConfigmgrApi* | [**comAdobeCqAddressImplLocationLocationListServlet**](OASConfigmgrApi.md#comAdobeCqAddressImplLocationLocationListServlet) | **POST** /system/console/configMgr/com.adobe.cq.address.impl.location.LocationListServlet | 
*OASConfigmgrApi* | [**comAdobeCqAuditPurgeDam**](OASConfigmgrApi.md#comAdobeCqAuditPurgeDam) | **POST** /system/console/configMgr/com.adobe.cq.audit.purge.Dam | 
*OASConfigmgrApi* | [**comAdobeCqAuditPurgePages**](OASConfigmgrApi.md#comAdobeCqAuditPurgePages) | **POST** /system/console/configMgr/com.adobe.cq.audit.purge.Pages | 
*OASConfigmgrApi* | [**comAdobeCqAuditPurgeReplication**](OASConfigmgrApi.md#comAdobeCqAuditPurgeReplication) | **POST** /system/console/configMgr/com.adobe.cq.audit.purge.Replication | 
*OASConfigmgrApi* | [**comAdobeCqCdnRewriterImplAWSCloudFrontRewriter**](OASConfigmgrApi.md#comAdobeCqCdnRewriterImplAWSCloudFrontRewriter) | **POST** /system/console/configMgr/com.adobe.cq.cdn.rewriter.impl.AWSCloudFrontRewriter | 
*OASConfigmgrApi* | [**comAdobeCqCdnRewriterImplCDNConfigServiceImpl**](OASConfigmgrApi.md#comAdobeCqCdnRewriterImplCDNConfigServiceImpl) | **POST** /system/console/configMgr/com.adobe.cq.cdn.rewriter.impl.CDNConfigServiceImpl | 
*OASConfigmgrApi* | [**comAdobeCqCdnRewriterImplCDNRewriter**](OASConfigmgrApi.md#comAdobeCqCdnRewriterImplCDNRewriter) | **POST** /system/console/configMgr/com.adobe.cq.cdn.rewriter.impl.CDNRewriter | 
*OASConfigmgrApi* | [**comAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandle**](OASConfigmgrApi.md#comAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandle) | **POST** /system/console/configMgr/com.adobe.cq.cloudconfig.core.impl.ConfigurationReplicationEventHandler | 
*OASConfigmgrApi* | [**comAdobeCqCommerceImplAssetDynamicImageHandler**](OASConfigmgrApi.md#comAdobeCqCommerceImplAssetDynamicImageHandler) | **POST** /system/console/configMgr/com.adobe.cq.commerce.impl.asset.DynamicImageHandler | 
*OASConfigmgrApi* | [**comAdobeCqCommerceImplAssetProductAssetHandlerProviderImpl**](OASConfigmgrApi.md#comAdobeCqCommerceImplAssetProductAssetHandlerProviderImpl) | **POST** /system/console/configMgr/com.adobe.cq.commerce.impl.asset.ProductAssetHandlerProviderImpl | 
*OASConfigmgrApi* | [**comAdobeCqCommerceImplAssetStaticImageHandler**](OASConfigmgrApi.md#comAdobeCqCommerceImplAssetStaticImageHandler) | **POST** /system/console/configMgr/com.adobe.cq.commerce.impl.asset.StaticImageHandler | 
*OASConfigmgrApi* | [**comAdobeCqCommerceImplAssetVideoHandler**](OASConfigmgrApi.md#comAdobeCqCommerceImplAssetVideoHandler) | **POST** /system/console/configMgr/com.adobe.cq.commerce.impl.asset.VideoHandler | 
*OASConfigmgrApi* | [**comAdobeCqCommerceImplPromotionPromotionManagerImpl**](OASConfigmgrApi.md#comAdobeCqCommerceImplPromotionPromotionManagerImpl) | **POST** /system/console/configMgr/com.adobe.cq.commerce.impl.promotion.PromotionManagerImpl | 
*OASConfigmgrApi* | [**comAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImpl**](OASConfigmgrApi.md#comAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImpl) | **POST** /system/console/configMgr/com.adobe.cq.commerce.pim.impl.cataloggenerator.CatalogGeneratorImpl | 
*OASConfigmgrApi* | [**comAdobeCqCommercePimImplPageEventListener**](OASConfigmgrApi.md#comAdobeCqCommercePimImplPageEventListener) | **POST** /system/console/configMgr/com.adobe.cq.commerce.pim.impl.PageEventListener | 
*OASConfigmgrApi* | [**comAdobeCqCommercePimImplProductfeedProductFeedServiceImpl**](OASConfigmgrApi.md#comAdobeCqCommercePimImplProductfeedProductFeedServiceImpl) | **POST** /system/console/configMgr/com.adobe.cq.commerce.pim.impl.productfeed.ProductFeedServiceImpl | 
*OASConfigmgrApi* | [**comAdobeCqContentinsightImplReportingServicesSettingsProvider**](OASConfigmgrApi.md#comAdobeCqContentinsightImplReportingServicesSettingsProvider) | **POST** /system/console/configMgr/com.adobe.cq.contentinsight.impl.ReportingServicesSettingsProvider | 
*OASConfigmgrApi* | [**comAdobeCqContentinsightImplServletsBrightEdgeProxyServlet**](OASConfigmgrApi.md#comAdobeCqContentinsightImplServletsBrightEdgeProxyServlet) | **POST** /system/console/configMgr/com.adobe.cq.contentinsight.impl.servlets.BrightEdgeProxyServlet | 
*OASConfigmgrApi* | [**comAdobeCqContentinsightImplServletsReportingServicesProxyServle**](OASConfigmgrApi.md#comAdobeCqContentinsightImplServletsReportingServicesProxyServle) | **POST** /system/console/configMgr/com.adobe.cq.contentinsight.impl.servlets.ReportingServicesProxyServlet | 
*OASConfigmgrApi* | [**comAdobeCqDamCfmImplComponentComponentConfigImpl**](OASConfigmgrApi.md#comAdobeCqDamCfmImplComponentComponentConfigImpl) | **POST** /system/console/configMgr/com.adobe.cq.dam.cfm.impl.component.ComponentConfigImpl | 
*OASConfigmgrApi* | [**comAdobeCqDamCfmImplConfFeatureConfigImpl**](OASConfigmgrApi.md#comAdobeCqDamCfmImplConfFeatureConfigImpl) | **POST** /system/console/configMgr/com.adobe.cq.dam.cfm.impl.conf.FeatureConfigImpl | 
*OASConfigmgrApi* | [**comAdobeCqDamCfmImplContentRewriterAssetProcessor**](OASConfigmgrApi.md#comAdobeCqDamCfmImplContentRewriterAssetProcessor) | **POST** /system/console/configMgr/com.adobe.cq.dam.cfm.impl.content.rewriter.AssetProcessor | 
*OASConfigmgrApi* | [**comAdobeCqDamCfmImplContentRewriterParRangeFilter**](OASConfigmgrApi.md#comAdobeCqDamCfmImplContentRewriterParRangeFilter) | **POST** /system/console/configMgr/com.adobe.cq.dam.cfm.impl.content.rewriter.ParRangeFilter | 
*OASConfigmgrApi* | [**comAdobeCqDamCfmImplContentRewriterPayloadFilter**](OASConfigmgrApi.md#comAdobeCqDamCfmImplContentRewriterPayloadFilter) | **POST** /system/console/configMgr/com.adobe.cq.dam.cfm.impl.content.rewriter.PayloadFilter | 
*OASConfigmgrApi* | [**comAdobeCqDamDmProcessImagePTiffManagerImpl**](OASConfigmgrApi.md#comAdobeCqDamDmProcessImagePTiffManagerImpl) | **POST** /system/console/configMgr/com.adobe.cq.dam.dm.process.image.PTiffManagerImpl | 
*OASConfigmgrApi* | [**comAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorker**](OASConfigmgrApi.md#comAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorker) | **POST** /system/console/configMgr/com.adobe.cq.dam.ips.impl.replication.trigger.ReplicateOnModifyWorker | 
*OASConfigmgrApi* | [**comAdobeCqDamMacSyncHelperImplMACSyncClientImpl**](OASConfigmgrApi.md#comAdobeCqDamMacSyncHelperImplMACSyncClientImpl) | **POST** /system/console/configMgr/com.adobe.cq.dam.mac.sync.helper.impl.MACSyncClientImpl | 
*OASConfigmgrApi* | [**comAdobeCqDamMacSyncImplDAMSyncServiceImpl**](OASConfigmgrApi.md#comAdobeCqDamMacSyncImplDAMSyncServiceImpl) | **POST** /system/console/configMgr/com.adobe.cq.dam.mac.sync.impl.DAMSyncServiceImpl | 
*OASConfigmgrApi* | [**comAdobeCqDamProcessorNuiImplNuiAssetProcessor**](OASConfigmgrApi.md#comAdobeCqDamProcessorNuiImplNuiAssetProcessor) | **POST** /system/console/configMgr/com.adobe.cq.dam.processor.nui.impl.NuiAssetProcessor | 
*OASConfigmgrApi* | [**comAdobeCqDamS7imagingImplIsImageServerComponent**](OASConfigmgrApi.md#comAdobeCqDamS7imagingImplIsImageServerComponent) | **POST** /system/console/configMgr/com.adobe.cq.dam.s7imaging.impl.is.ImageServerComponent | 
*OASConfigmgrApi* | [**comAdobeCqDamS7imagingImplPsPlatformServerServlet**](OASConfigmgrApi.md#comAdobeCqDamS7imagingImplPsPlatformServerServlet) | **POST** /system/console/configMgr/com.adobe.cq.dam.s7imaging.impl.ps.PlatformServerServlet | 
*OASConfigmgrApi* | [**comAdobeCqDamWebdavImplIoAssetIOHandler**](OASConfigmgrApi.md#comAdobeCqDamWebdavImplIoAssetIOHandler) | **POST** /system/console/configMgr/com.adobe.cq.dam.webdav.impl.io.AssetIOHandler | 
*OASConfigmgrApi* | [**comAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJob**](OASConfigmgrApi.md#comAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJob) | **POST** /system/console/configMgr/com.adobe.cq.dam.webdav.impl.io.DamWebdavVersionLinkingJob | 
*OASConfigmgrApi* | [**comAdobeCqDamWebdavImplIoSpecialFilesHandler**](OASConfigmgrApi.md#comAdobeCqDamWebdavImplIoSpecialFilesHandler) | **POST** /system/console/configMgr/com.adobe.cq.dam.webdav.impl.io.SpecialFilesHandler | 
*OASConfigmgrApi* | [**comAdobeCqDeserfwImplDeserializationFirewallImpl**](OASConfigmgrApi.md#comAdobeCqDeserfwImplDeserializationFirewallImpl) | **POST** /system/console/configMgr/com.adobe.cq.deserfw.impl.DeserializationFirewallImpl | 
*OASConfigmgrApi* | [**comAdobeCqDtmImplServiceDTMWebServiceImpl**](OASConfigmgrApi.md#comAdobeCqDtmImplServiceDTMWebServiceImpl) | **POST** /system/console/configMgr/com.adobe.cq.dtm.impl.service.DTMWebServiceImpl | 
*OASConfigmgrApi* | [**comAdobeCqDtmImplServletsDTMDeployHookServlet**](OASConfigmgrApi.md#comAdobeCqDtmImplServletsDTMDeployHookServlet) | **POST** /system/console/configMgr/com.adobe.cq.dtm.impl.servlets.DTMDeployHookServlet | 
*OASConfigmgrApi* | [**comAdobeCqDtmReactorImplServiceWebServiceImpl**](OASConfigmgrApi.md#comAdobeCqDtmReactorImplServiceWebServiceImpl) | **POST** /system/console/configMgr/com.adobe.cq.dtm.reactor.impl.service.WebServiceImpl | 
*OASConfigmgrApi* | [**comAdobeCqExperiencelogImplExperienceLogConfigServlet**](OASConfigmgrApi.md#comAdobeCqExperiencelogImplExperienceLogConfigServlet) | **POST** /system/console/configMgr/com.adobe.cq.experiencelog.impl.ExperienceLogConfigServlet | 
*OASConfigmgrApi* | [**comAdobeCqHcContentPackagesHealthCheck**](OASConfigmgrApi.md#comAdobeCqHcContentPackagesHealthCheck) | **POST** /system/console/configMgr/com.adobe.cq.hc.ContentPackagesHealthCheck | 
*OASConfigmgrApi* | [**comAdobeCqHistoryImplHistoryRequestFilter**](OASConfigmgrApi.md#comAdobeCqHistoryImplHistoryRequestFilter) | **POST** /system/console/configMgr/com.adobe.cq.history.impl.HistoryRequestFilter | 
*OASConfigmgrApi* | [**comAdobeCqHistoryImplHistoryServiceImpl**](OASConfigmgrApi.md#comAdobeCqHistoryImplHistoryServiceImpl) | **POST** /system/console/configMgr/com.adobe.cq.history.impl.HistoryServiceImpl | 
*OASConfigmgrApi* | [**comAdobeCqInboxImplTypeproviderItemTypeProvider**](OASConfigmgrApi.md#comAdobeCqInboxImplTypeproviderItemTypeProvider) | **POST** /system/console/configMgr/com.adobe.cq.inbox.impl.typeprovider.ItemTypeProvider | 
*OASConfigmgrApi* | [**comAdobeCqProjectsImplServletProjectImageServlet**](OASConfigmgrApi.md#comAdobeCqProjectsImplServletProjectImageServlet) | **POST** /system/console/configMgr/com.adobe.cq.projects.impl.servlet.ProjectImageServlet | 
*OASConfigmgrApi* | [**comAdobeCqProjectsPurgeScheduler**](OASConfigmgrApi.md#comAdobeCqProjectsPurgeScheduler) | **POST** /system/console/configMgr/com.adobe.cq.projects.purge.Scheduler | 
*OASConfigmgrApi* | [**comAdobeCqScheduledExporterImplScheduledExporterImpl**](OASConfigmgrApi.md#comAdobeCqScheduledExporterImplScheduledExporterImpl) | **POST** /system/console/configMgr/com.adobe.cq.scheduled.exporter.impl.ScheduledExporterImpl | 
*OASConfigmgrApi* | [**comAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImpl**](OASConfigmgrApi.md#comAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImpl) | **POST** /system/console/configMgr/com.adobe.cq.screens.analytics.impl.ScreensAnalyticsServiceImpl | 
*OASConfigmgrApi* | [**comAdobeCqScreensDeviceImplDeviceService**](OASConfigmgrApi.md#comAdobeCqScreensDeviceImplDeviceService) | **POST** /system/console/configMgr/com.adobe.cq.screens.device.impl.DeviceService | 
*OASConfigmgrApi* | [**comAdobeCqScreensDeviceRegistrationImplRegistrationServiceImpl**](OASConfigmgrApi.md#comAdobeCqScreensDeviceRegistrationImplRegistrationServiceImpl) | **POST** /system/console/configMgr/com.adobe.cq.screens.device.registration.impl.RegistrationServiceImpl | 
*OASConfigmgrApi* | [**comAdobeCqScreensImplHandlerChannelsUpdateHandler**](OASConfigmgrApi.md#comAdobeCqScreensImplHandlerChannelsUpdateHandler) | **POST** /system/console/configMgr/com.adobe.cq.screens.impl.handler.ChannelsUpdateHandler | 
*OASConfigmgrApi* | [**comAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJob**](OASConfigmgrApi.md#comAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJob) | **POST** /system/console/configMgr/com.adobe.cq.screens.impl.jobs.DistributedDevicesStatiUpdateJob | 
*OASConfigmgrApi* | [**comAdobeCqScreensImplRemoteImplDistributedHttpClientImpl**](OASConfigmgrApi.md#comAdobeCqScreensImplRemoteImplDistributedHttpClientImpl) | **POST** /system/console/configMgr/com.adobe.cq.screens.impl.remote.impl.DistributedHttpClientImpl | 
*OASConfigmgrApi* | [**comAdobeCqScreensImplScreensChannelPostProcessor**](OASConfigmgrApi.md#comAdobeCqScreensImplScreensChannelPostProcessor) | **POST** /system/console/configMgr/com.adobe.cq.screens.impl.ScreensChannelPostProcessor | 
*OASConfigmgrApi* | [**comAdobeCqScreensMonitoringImplScreensMonitoringServiceImpl**](OASConfigmgrApi.md#comAdobeCqScreensMonitoringImplScreensMonitoringServiceImpl) | **POST** /system/console/configMgr/com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl | 
*OASConfigmgrApi* | [**comAdobeCqScreensMqActivemqImplArtemisJMSProvider**](OASConfigmgrApi.md#comAdobeCqScreensMqActivemqImplArtemisJMSProvider) | **POST** /system/console/configMgr/com.adobe.cq.screens.mq.activemq.impl.ArtemisJMSProvider | 
*OASConfigmgrApi* | [**comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImpl**](OASConfigmgrApi.md#comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImpl) | **POST** /system/console/configMgr/com.adobe.cq.screens.offlinecontent.impl.BulkOfflineUpdateServiceImpl | 
*OASConfigmgrApi* | [**comAdobeCqScreensOfflinecontentImplOfflineContentServiceImpl**](OASConfigmgrApi.md#comAdobeCqScreensOfflinecontentImplOfflineContentServiceImpl) | **POST** /system/console/configMgr/com.adobe.cq.screens.offlinecontent.impl.OfflineContentServiceImpl | 
*OASConfigmgrApi* | [**comAdobeCqScreensSegmentationImplSegmentationFeatureFlag**](OASConfigmgrApi.md#comAdobeCqScreensSegmentationImplSegmentationFeatureFlag) | **POST** /system/console/configMgr/com.adobe.cq.screens.segmentation.impl.SegmentationFeatureFlag | 
*OASConfigmgrApi* | [**comAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthCh**](OASConfigmgrApi.md#comAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthCh) | **POST** /system/console/configMgr/com.adobe.cq.security.hc.bundles.impl.HtmlLibraryManagerConfigHealthCheck | 
*OASConfigmgrApi* | [**comAdobeCqSecurityHcBundlesImplWcmFilterHealthCheck**](OASConfigmgrApi.md#comAdobeCqSecurityHcBundlesImplWcmFilterHealthCheck) | **POST** /system/console/configMgr/com.adobe.cq.security.hc.bundles.impl.WcmFilterHealthCheck | 
*OASConfigmgrApi* | [**comAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheck**](OASConfigmgrApi.md#comAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheck) | **POST** /system/console/configMgr/com.adobe.cq.security.hc.dispatcher.impl.DispatcherAccessHealthCheck | 
*OASConfigmgrApi* | [**comAdobeCqSecurityHcPackagesImplExampleContentHealthCheck**](OASConfigmgrApi.md#comAdobeCqSecurityHcPackagesImplExampleContentHealthCheck) | **POST** /system/console/configMgr/com.adobe.cq.security.hc.packages.impl.ExampleContentHealthCheck | 
*OASConfigmgrApi* | [**comAdobeCqSecurityHcWebserverImplClickjackingHealthCheck**](OASConfigmgrApi.md#comAdobeCqSecurityHcWebserverImplClickjackingHealthCheck) | **POST** /system/console/configMgr/com.adobe.cq.security.hc.webserver.impl.ClickjackingHealthCheck | 
*OASConfigmgrApi* | [**comAdobeCqSocialAccountverificationImplAccountManagementConfigIm**](OASConfigmgrApi.md#comAdobeCqSocialAccountverificationImplAccountManagementConfigIm) | **POST** /system/console/configMgr/com.adobe.cq.social.accountverification.impl.AccountManagementConfigImpl | 
*OASConfigmgrApi* | [**comAdobeCqSocialActivitystreamsClientImplSocialActivityComponen**](OASConfigmgrApi.md#comAdobeCqSocialActivitystreamsClientImplSocialActivityComponen) | **POST** /system/console/configMgr/com.adobe.cq.social.activitystreams.client.impl.SocialActivityComponentFactoryImpl | 
*OASConfigmgrApi* | [**comAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCo**](OASConfigmgrApi.md#comAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCo) | **POST** /system/console/configMgr/com.adobe.cq.social.activitystreams.client.impl.SocialActivityStreamComponentFactory | 
*OASConfigmgrApi* | [**comAdobeCqSocialActivitystreamsListenerImplEventListenerHandler**](OASConfigmgrApi.md#comAdobeCqSocialActivitystreamsListenerImplEventListenerHandler) | **POST** /system/console/configMgr/com.adobe.cq.social.activitystreams.listener.impl.EventListenerHandler | 
*OASConfigmgrApi* | [**comAdobeCqSocialActivitystreamsListenerImplModerationEventExten**](OASConfigmgrApi.md#comAdobeCqSocialActivitystreamsListenerImplModerationEventExten) | **POST** /system/console/configMgr/com.adobe.cq.social.activitystreams.listener.impl.ModerationEventExtension | 
*OASConfigmgrApi* | [**comAdobeCqSocialActivitystreamsListenerImplRatingEventActivityS**](OASConfigmgrApi.md#comAdobeCqSocialActivitystreamsListenerImplRatingEventActivityS) | **POST** /system/console/configMgr/com.adobe.cq.social.activitystreams.listener.impl.RatingEventActivitySuppressor | 
*OASConfigmgrApi* | [**comAdobeCqSocialActivitystreamsListenerImplResourceActivityStre**](OASConfigmgrApi.md#comAdobeCqSocialActivitystreamsListenerImplResourceActivityStre) | **POST** /system/console/configMgr/com.adobe.cq.social.activitystreams.listener.impl.ResourceActivityStreamProviderFactory | 
*OASConfigmgrApi* | [**comAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsI**](OASConfigmgrApi.md#comAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsI) | **POST** /system/console/configMgr/com.adobe.cq.social.calendar.client.endpoints.impl.CalendarOperationsImpl | 
*OASConfigmgrApi* | [**comAdobeCqSocialCalendarClientOperationextensionsEventAttachmen**](OASConfigmgrApi.md#comAdobeCqSocialCalendarClientOperationextensionsEventAttachmen) | **POST** /system/console/configMgr/com.adobe.cq.social.calendar.client.operationextensions.EventAttachment | 
*OASConfigmgrApi* | [**comAdobeCqSocialCalendarServletsTimeZoneServlet**](OASConfigmgrApi.md#comAdobeCqSocialCalendarServletsTimeZoneServlet) | **POST** /system/console/configMgr/com.adobe.cq.social.calendar.servlets.TimeZoneServlet | 
*OASConfigmgrApi* | [**comAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEvent**](OASConfigmgrApi.md#comAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEvent) | **POST** /system/console/configMgr/com.adobe.cq.social.commons.comments.endpoints.impl.CommentDeleteEventActivitySuppressor | 
*OASConfigmgrApi* | [**comAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSe**](OASConfigmgrApi.md#comAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSe) | **POST** /system/console/configMgr/com.adobe.cq.social.commons.comments.endpoints.impl.CommentOperationService | 
*OASConfigmgrApi* | [**comAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperati**](OASConfigmgrApi.md#comAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperati) | **POST** /system/console/configMgr/com.adobe.cq.social.commons.comments.endpoints.impl.TranslationOperationService | 
*OASConfigmgrApi* | [**comAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialC**](OASConfigmgrApi.md#comAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialC) | **POST** /system/console/configMgr/com.adobe.cq.social.commons.comments.listing.impl.SearchCommentSocialComponentListProvider | 
*OASConfigmgrApi* | [**comAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPos**](OASConfigmgrApi.md#comAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPos) | **POST** /system/console/configMgr/com.adobe.cq.social.commons.comments.scheduler.impl.SearchScheduledPosts | 
*OASConfigmgrApi* | [**comAdobeCqSocialCommonsCorsCORSAuthenticationFilter**](OASConfigmgrApi.md#comAdobeCqSocialCommonsCorsCORSAuthenticationFilter) | **POST** /system/console/configMgr/com.adobe.cq.social.commons.cors.CORSAuthenticationFilter | 
*OASConfigmgrApi* | [**comAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProvider**](OASConfigmgrApi.md#comAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProvider) | **POST** /system/console/configMgr/com.adobe.cq.social.commons.emailreply.impl.AndroidEmailClientProvider | 
*OASConfigmgrApi* | [**comAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImpl**](OASConfigmgrApi.md#comAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImpl) | **POST** /system/console/configMgr/com.adobe.cq.social.commons.emailreply.impl.CommentEmailBuilderImpl | 
*OASConfigmgrApi* | [**comAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListener**](OASConfigmgrApi.md#comAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListener) | **POST** /system/console/configMgr/com.adobe.cq.social.commons.emailreply.impl.CommentEmailEventListener | 
*OASConfigmgrApi* | [**comAdobeCqSocialCommonsEmailreplyImplCustomEmailClientProvider**](OASConfigmgrApi.md#comAdobeCqSocialCommonsEmailreplyImplCustomEmailClientProvider) | **POST** /system/console/configMgr/com.adobe.cq.social.commons.emailreply.impl.CustomEmailClientProvider | 
*OASConfigmgrApi* | [**comAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImp**](OASConfigmgrApi.md#comAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImp) | **POST** /system/console/configMgr/com.adobe.cq.social.commons.emailreply.impl.EmailQuotedTextPatternsImpl | 
*OASConfigmgrApi* | [**comAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImp**](OASConfigmgrApi.md#comAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImp) | **POST** /system/console/configMgr/com.adobe.cq.social.commons.emailreply.impl.EmailReplyConfigurationImpl | 
*OASConfigmgrApi* | [**comAdobeCqSocialCommonsEmailreplyImplEmailReplyImporter**](OASConfigmgrApi.md#comAdobeCqSocialCommonsEmailreplyImplEmailReplyImporter) | **POST** /system/console/configMgr/com.adobe.cq.social.commons.emailreply.impl.EmailReplyImporter | 
*OASConfigmgrApi* | [**comAdobeCqSocialCommonsEmailreplyImplGmailEmailClientProvider**](OASConfigmgrApi.md#comAdobeCqSocialCommonsEmailreplyImplGmailEmailClientProvider) | **POST** /system/console/configMgr/com.adobe.cq.social.commons.emailreply.impl.GmailEmailClientProvider | 
*OASConfigmgrApi* | [**comAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProvider**](OASConfigmgrApi.md#comAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProvider) | **POST** /system/console/configMgr/com.adobe.cq.social.commons.emailreply.impl.IOSEmailClientProvider | 
*OASConfigmgrApi* | [**comAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProvider**](OASConfigmgrApi.md#comAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProvider) | **POST** /system/console/configMgr/com.adobe.cq.social.commons.emailreply.impl.MacmailEmailClientProvider | 
*OASConfigmgrApi* | [**comAdobeCqSocialCommonsEmailreplyImplOutLookEmailClientProvider**](OASConfigmgrApi.md#comAdobeCqSocialCommonsEmailreplyImplOutLookEmailClientProvider) | **POST** /system/console/configMgr/com.adobe.cq.social.commons.emailreply.impl.OutLookEmailClientProvider | 
*OASConfigmgrApi* | [**comAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProvider**](OASConfigmgrApi.md#comAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProvider) | **POST** /system/console/configMgr/com.adobe.cq.social.commons.emailreply.impl.UnknownEmailClientProvider | 
*OASConfigmgrApi* | [**comAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProvider**](OASConfigmgrApi.md#comAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProvider) | **POST** /system/console/configMgr/com.adobe.cq.social.commons.emailreply.impl.YahooEmailClientProvider | 
*OASConfigmgrApi* | [**comAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUpload**](OASConfigmgrApi.md#comAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUpload) | **POST** /system/console/configMgr/com.adobe.cq.social.commons.maintainance.impl.DeleteTempUGCImageUploads | 
*OASConfigmgrApi* | [**comAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImpl**](OASConfigmgrApi.md#comAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImpl) | **POST** /system/console/configMgr/com.adobe.cq.social.commons.ugclimiter.impl.UGCLimiterServiceImpl | 
*OASConfigmgrApi* | [**comAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimit**](OASConfigmgrApi.md#comAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimit) | **POST** /system/console/configMgr/com.adobe.cq.social.commons.ugclimitsconfig.impl.CommunityUserUGCLimitsConfigImpl | 
*OASConfigmgrApi* | [**comAdobeCqSocialConnectOauthImplFacebookProviderImpl**](OASConfigmgrApi.md#comAdobeCqSocialConnectOauthImplFacebookProviderImpl) | **POST** /system/console/configMgr/com.adobe.cq.social.connect.oauth.impl.FacebookProviderImpl | 
*OASConfigmgrApi* | [**comAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandle**](OASConfigmgrApi.md#comAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandle) | **POST** /system/console/configMgr/com.adobe.cq.social.connect.oauth.impl.SocialOAuthAuthenticationHandler | 
*OASConfigmgrApi* | [**comAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapper**](OASConfigmgrApi.md#comAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapper) | **POST** /system/console/configMgr/com.adobe.cq.social.connect.oauth.impl.SocialOAuthUserProfileMapper | 
*OASConfigmgrApi* | [**comAdobeCqSocialConnectOauthImplTwitterProviderImpl**](OASConfigmgrApi.md#comAdobeCqSocialConnectOauthImplTwitterProviderImpl) | **POST** /system/console/configMgr/com.adobe.cq.social.connect.oauth.impl.TwitterProviderImpl | 
*OASConfigmgrApi* | [**comAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmen**](OASConfigmgrApi.md#comAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmen) | **POST** /system/console/configMgr/com.adobe.cq.social.content.fragments.services.impl.CommunitiesFragmentCreationServiceImpl | 
*OASConfigmgrApi* | [**comAdobeCqSocialDatastoreAsImplASResourceProviderFactory**](OASConfigmgrApi.md#comAdobeCqSocialDatastoreAsImplASResourceProviderFactory) | **POST** /system/console/configMgr/com.adobe.cq.social.datastore.as.impl.ASResourceProviderFactory | 
*OASConfigmgrApi* | [**comAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactory**](OASConfigmgrApi.md#comAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactory) | **POST** /system/console/configMgr/com.adobe.cq.social.datastore.op.impl.SocialMSResourceProviderFactory | 
*OASConfigmgrApi* | [**comAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactor**](OASConfigmgrApi.md#comAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactor) | **POST** /system/console/configMgr/com.adobe.cq.social.datastore.rdb.impl.SocialRDBResourceProviderFactory | 
*OASConfigmgrApi* | [**comAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorF**](OASConfigmgrApi.md#comAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorF) | **POST** /system/console/configMgr/com.adobe.cq.social.enablement.adaptors.EnablementLearningPathAdaptorFactory | 
*OASConfigmgrApi* | [**comAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFacto**](OASConfigmgrApi.md#comAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFacto) | **POST** /system/console/configMgr/com.adobe.cq.social.enablement.adaptors.EnablementResourceAdaptorFactory | 
*OASConfigmgrApi* | [**comAdobeCqSocialEnablementLearningpathEndpointsImplEnablementL**](OASConfigmgrApi.md#comAdobeCqSocialEnablementLearningpathEndpointsImplEnablementL) | **POST** /system/console/configMgr/com.adobe.cq.social.enablement.learningpath.endpoints.impl.EnablementLearningPathModelOperationService | 
*OASConfigmgrApi* | [**comAdobeCqSocialEnablementResourceEndpointsImplEnablementResou**](OASConfigmgrApi.md#comAdobeCqSocialEnablementResourceEndpointsImplEnablementResou) | **POST** /system/console/configMgr/com.adobe.cq.social.enablement.resource.endpoints.impl.EnablementResourceModelOperationService | 
*OASConfigmgrApi* | [**comAdobeCqSocialEnablementServicesImplAuthorMarkerImpl**](OASConfigmgrApi.md#comAdobeCqSocialEnablementServicesImplAuthorMarkerImpl) | **POST** /system/console/configMgr/com.adobe.cq.social.enablement.services.impl.AuthorMarkerImpl | 
*OASConfigmgrApi* | [**comAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGe**](OASConfigmgrApi.md#comAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGe) | **POST** /system/console/configMgr/com.adobe.cq.social.filelibrary.client.endpoints.FilelibraryDownloadGetServlet | 
*OASConfigmgrApi* | [**comAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOpera**](OASConfigmgrApi.md#comAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOpera) | **POST** /system/console/configMgr/com.adobe.cq.social.filelibrary.client.endpoints.impl.FileLibraryOperationsService | 
*OASConfigmgrApi* | [**comAdobeCqSocialForumClientEndpointsImplForumOperationsService**](OASConfigmgrApi.md#comAdobeCqSocialForumClientEndpointsImplForumOperationsService) | **POST** /system/console/configMgr/com.adobe.cq.social.forum.client.endpoints.impl.ForumOperationsService | 
*OASConfigmgrApi* | [**comAdobeCqSocialForumDispatcherImplFlushOperations**](OASConfigmgrApi.md#comAdobeCqSocialForumDispatcherImplFlushOperations) | **POST** /system/console/configMgr/com.adobe.cq.social.forum.dispatcher.impl.FlushOperations | 
*OASConfigmgrApi* | [**comAdobeCqSocialGroupClientImplCommunityGroupCollectionComponen**](OASConfigmgrApi.md#comAdobeCqSocialGroupClientImplCommunityGroupCollectionComponen) | **POST** /system/console/configMgr/com.adobe.cq.social.group.client.impl.CommunityGroupCollectionComponentFactory | 
*OASConfigmgrApi* | [**comAdobeCqSocialGroupImplGroupServiceImpl**](OASConfigmgrApi.md#comAdobeCqSocialGroupImplGroupServiceImpl) | **POST** /system/console/configMgr/com.adobe.cq.social.group.impl.GroupServiceImpl | 
*OASConfigmgrApi* | [**comAdobeCqSocialHandlebarsGuavaTemplateCacheImpl**](OASConfigmgrApi.md#comAdobeCqSocialHandlebarsGuavaTemplateCacheImpl) | **POST** /system/console/configMgr/com.adobe.cq.social.handlebars.GuavaTemplateCacheImpl | 
*OASConfigmgrApi* | [**comAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsS**](OASConfigmgrApi.md#comAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsS) | **POST** /system/console/configMgr/com.adobe.cq.social.ideation.client.endpoints.impl.IdeationOperationsService | 
*OASConfigmgrApi* | [**comAdobeCqSocialJournalClientEndpointsImplJournalOperationsSer**](OASConfigmgrApi.md#comAdobeCqSocialJournalClientEndpointsImplJournalOperationsSer) | **POST** /system/console/configMgr/com.adobe.cq.social.journal.client.endpoints.impl.JournalOperationsService | 
*OASConfigmgrApi* | [**comAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfile**](OASConfigmgrApi.md#comAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfile) | **POST** /system/console/configMgr/com.adobe.cq.social.members.endpoints.impl.CommunityMemberGroupProfileOperationService | 
*OASConfigmgrApi* | [**comAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileO**](OASConfigmgrApi.md#comAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileO) | **POST** /system/console/configMgr/com.adobe.cq.social.members.endpoints.impl.CommunityMemberUserProfileOperationService | 
*OASConfigmgrApi* | [**comAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentF**](OASConfigmgrApi.md#comAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentF) | **POST** /system/console/configMgr/com.adobe.cq.social.members.impl.CommunityMemberGroupProfileComponentFactory | 
*OASConfigmgrApi* | [**comAdobeCqSocialMessagingClientEndpointsImplMessagingOperation**](OASConfigmgrApi.md#comAdobeCqSocialMessagingClientEndpointsImplMessagingOperation) | **POST** /system/console/configMgr/com.adobe.cq.social.messaging.client.endpoints.impl.MessagingOperationsServiceImpl | 
*OASConfigmgrApi* | [**comAdobeCqSocialModerationDashboardApiFilterGroupSocialComponen**](OASConfigmgrApi.md#comAdobeCqSocialModerationDashboardApiFilterGroupSocialComponen) | **POST** /system/console/configMgr/com.adobe.cq.social.moderation.dashboard.api.FilterGroupSocialComponentFactory | 
*OASConfigmgrApi* | [**comAdobeCqSocialModerationDashboardApiModerationDashboardSocial**](OASConfigmgrApi.md#comAdobeCqSocialModerationDashboardApiModerationDashboardSocial) | **POST** /system/console/configMgr/com.adobe.cq.social.moderation.dashboard.api.ModerationDashboardSocialComponentFactory | 
*OASConfigmgrApi* | [**comAdobeCqSocialModerationDashboardApiUserDetailsSocialComponen**](OASConfigmgrApi.md#comAdobeCqSocialModerationDashboardApiUserDetailsSocialComponen) | **POST** /system/console/configMgr/com.adobe.cq.social.moderation.dashboard.api.UserDetailsSocialComponentFactory | 
*OASConfigmgrApi* | [**comAdobeCqSocialModerationDashboardInternalImplFilterGroupSoci**](OASConfigmgrApi.md#comAdobeCqSocialModerationDashboardInternalImplFilterGroupSoci) | **POST** /system/console/configMgr/com.adobe.cq.social.moderation.dashboard.internal.impl.FilterGroupSocialComponentFactoryV2 | 
*OASConfigmgrApi* | [**comAdobeCqSocialNotificationsImplMentionsRouter**](OASConfigmgrApi.md#comAdobeCqSocialNotificationsImplMentionsRouter) | **POST** /system/console/configMgr/com.adobe.cq.social.notifications.impl.MentionsRouter | 
*OASConfigmgrApi* | [**comAdobeCqSocialNotificationsImplNotificationManagerImpl**](OASConfigmgrApi.md#comAdobeCqSocialNotificationsImplNotificationManagerImpl) | **POST** /system/console/configMgr/com.adobe.cq.social.notifications.impl.NotificationManagerImpl | 
*OASConfigmgrApi* | [**comAdobeCqSocialNotificationsImplNotificationsRouter**](OASConfigmgrApi.md#comAdobeCqSocialNotificationsImplNotificationsRouter) | **POST** /system/console/configMgr/com.adobe.cq.social.notifications.impl.NotificationsRouter | 
*OASConfigmgrApi* | [**comAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServic**](OASConfigmgrApi.md#comAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServic) | **POST** /system/console/configMgr/com.adobe.cq.social.qna.client.endpoints.impl.QnaForumOperationsService | 
*OASConfigmgrApi* | [**comAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportI**](OASConfigmgrApi.md#comAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportI) | **POST** /system/console/configMgr/com.adobe.cq.social.reporting.analytics.services.impl.AnalyticsReportImporterServiceImpl | 
*OASConfigmgrApi* | [**comAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportM**](OASConfigmgrApi.md#comAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportM) | **POST** /system/console/configMgr/com.adobe.cq.social.reporting.analytics.services.impl.AnalyticsReportManagementServiceImpl | 
*OASConfigmgrApi* | [**comAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportS**](OASConfigmgrApi.md#comAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportS) | **POST** /system/console/configMgr/com.adobe.cq.social.reporting.analytics.services.impl.SiteTrendReportSocialComponentFactory | 
*OASConfigmgrApi* | [**comAdobeCqSocialReviewClientEndpointsImplReviewOperationsServi**](OASConfigmgrApi.md#comAdobeCqSocialReviewClientEndpointsImplReviewOperationsServi) | **POST** /system/console/configMgr/com.adobe.cq.social.review.client.endpoints.impl.ReviewOperationsService | 
*OASConfigmgrApi* | [**comAdobeCqSocialScfCoreOperationsImplSocialOperationsServlet**](OASConfigmgrApi.md#comAdobeCqSocialScfCoreOperationsImplSocialOperationsServlet) | **POST** /system/console/configMgr/com.adobe.cq.social.scf.core.operations.impl.SocialOperationsServlet | 
*OASConfigmgrApi* | [**comAdobeCqSocialScfEndpointsImplDefaultSocialGetServlet**](OASConfigmgrApi.md#comAdobeCqSocialScfEndpointsImplDefaultSocialGetServlet) | **POST** /system/console/configMgr/com.adobe.cq.social.scf.endpoints.impl.DefaultSocialGetServlet | 
*OASConfigmgrApi* | [**comAdobeCqSocialScoringImplScoringEventListener**](OASConfigmgrApi.md#comAdobeCqSocialScoringImplScoringEventListener) | **POST** /system/console/configMgr/com.adobe.cq.social.scoring.impl.ScoringEventListener | 
*OASConfigmgrApi* | [**comAdobeCqSocialServiceusersInternalImplServiceUserWrapperImpl**](OASConfigmgrApi.md#comAdobeCqSocialServiceusersInternalImplServiceUserWrapperImpl) | **POST** /system/console/configMgr/com.adobe.cq.social.serviceusers.internal.impl.ServiceUserWrapperImpl | 
*OASConfigmgrApi* | [**comAdobeCqSocialSiteEndpointsImplSiteOperationService**](OASConfigmgrApi.md#comAdobeCqSocialSiteEndpointsImplSiteOperationService) | **POST** /system/console/configMgr/com.adobe.cq.social.site.endpoints.impl.SiteOperationService | 
*OASConfigmgrApi* | [**comAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceIm**](OASConfigmgrApi.md#comAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceIm) | **POST** /system/console/configMgr/com.adobe.cq.social.site.impl.AnalyticsComponentConfigurationServiceImpl | 
*OASConfigmgrApi* | [**comAdobeCqSocialSiteImplSiteConfiguratorImpl**](OASConfigmgrApi.md#comAdobeCqSocialSiteImplSiteConfiguratorImpl) | **POST** /system/console/configMgr/com.adobe.cq.social.site.impl.SiteConfiguratorImpl | 
*OASConfigmgrApi* | [**comAdobeCqSocialSrpImplSocialSolrConnector**](OASConfigmgrApi.md#comAdobeCqSocialSrpImplSocialSolrConnector) | **POST** /system/console/configMgr/com.adobe.cq.social.srp.impl.SocialSolrConnector | 
*OASConfigmgrApi* | [**comAdobeCqSocialSyncImplDiffChangesObserver**](OASConfigmgrApi.md#comAdobeCqSocialSyncImplDiffChangesObserver) | **POST** /system/console/configMgr/com.adobe.cq.social.sync.impl.DiffChangesObserver | 
*OASConfigmgrApi* | [**comAdobeCqSocialSyncImplGroupSyncListenerImpl**](OASConfigmgrApi.md#comAdobeCqSocialSyncImplGroupSyncListenerImpl) | **POST** /system/console/configMgr/com.adobe.cq.social.sync.impl.GroupSyncListenerImpl | 
*OASConfigmgrApi* | [**comAdobeCqSocialSyncImplPublisherSyncServiceImpl**](OASConfigmgrApi.md#comAdobeCqSocialSyncImplPublisherSyncServiceImpl) | **POST** /system/console/configMgr/com.adobe.cq.social.sync.impl.PublisherSyncServiceImpl | 
*OASConfigmgrApi* | [**comAdobeCqSocialSyncImplUserSyncListenerImpl**](OASConfigmgrApi.md#comAdobeCqSocialSyncImplUserSyncListenerImpl) | **POST** /system/console/configMgr/com.adobe.cq.social.sync.impl.UserSyncListenerImpl | 
*OASConfigmgrApi* | [**comAdobeCqSocialTranslationImplTranslationServiceConfigManager**](OASConfigmgrApi.md#comAdobeCqSocialTranslationImplTranslationServiceConfigManager) | **POST** /system/console/configMgr/com.adobe.cq.social.translation.impl.TranslationServiceConfigManager | 
*OASConfigmgrApi* | [**comAdobeCqSocialTranslationImplUGCLanguageDetector**](OASConfigmgrApi.md#comAdobeCqSocialTranslationImplUGCLanguageDetector) | **POST** /system/console/configMgr/com.adobe.cq.social.translation.impl.UGCLanguageDetector | 
*OASConfigmgrApi* | [**comAdobeCqSocialUgcbaseDispatcherImplFlushServiceImpl**](OASConfigmgrApi.md#comAdobeCqSocialUgcbaseDispatcherImplFlushServiceImpl) | **POST** /system/console/configMgr/com.adobe.cq.social.ugcbase.dispatcher.impl.FlushServiceImpl | 
*OASConfigmgrApi* | [**comAdobeCqSocialUgcbaseImplAysncReverseReplicatorImpl**](OASConfigmgrApi.md#comAdobeCqSocialUgcbaseImplAysncReverseReplicatorImpl) | **POST** /system/console/configMgr/com.adobe.cq.social.ugcbase.impl.AysncReverseReplicatorImpl | 
*OASConfigmgrApi* | [**comAdobeCqSocialUgcbaseImplPublisherConfigurationImpl**](OASConfigmgrApi.md#comAdobeCqSocialUgcbaseImplPublisherConfigurationImpl) | **POST** /system/console/configMgr/com.adobe.cq.social.ugcbase.impl.PublisherConfigurationImpl | 
*OASConfigmgrApi* | [**comAdobeCqSocialUgcbaseImplSocialUtilsImpl**](OASConfigmgrApi.md#comAdobeCqSocialUgcbaseImplSocialUtilsImpl) | **POST** /system/console/configMgr/com.adobe.cq.social.ugcbase.impl.SocialUtilsImpl | 
*OASConfigmgrApi* | [**comAdobeCqSocialUgcbaseModerationImplAutoModerationImpl**](OASConfigmgrApi.md#comAdobeCqSocialUgcbaseModerationImplAutoModerationImpl) | **POST** /system/console/configMgr/com.adobe.cq.social.ugcbase.moderation.impl.AutoModerationImpl | 
*OASConfigmgrApi* | [**comAdobeCqSocialUgcbaseModerationImplSentimentProcess**](OASConfigmgrApi.md#comAdobeCqSocialUgcbaseModerationImplSentimentProcess) | **POST** /system/console/configMgr/com.adobe.cq.social.ugcbase.moderation.impl.SentimentProcess | 
*OASConfigmgrApi* | [**comAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackli**](OASConfigmgrApi.md#comAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackli) | **POST** /system/console/configMgr/com.adobe.cq.social.ugcbase.security.impl.DefaultAttachmentTypeBlacklistService | 
*OASConfigmgrApi* | [**comAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImpl**](OASConfigmgrApi.md#comAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImpl) | **POST** /system/console/configMgr/com.adobe.cq.social.ugcbase.security.impl.SaferSlingPostValidatorImpl | 
*OASConfigmgrApi* | [**comAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServlet**](OASConfigmgrApi.md#comAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServlet) | **POST** /system/console/configMgr/com.adobe.cq.social.user.endpoints.impl.UsersGroupFromPublishServlet | 
*OASConfigmgrApi* | [**comAdobeCqSocialUserImplTransportHttpToPublisher**](OASConfigmgrApi.md#comAdobeCqSocialUserImplTransportHttpToPublisher) | **POST** /system/console/configMgr/com.adobe.cq.social.user.impl.transport.HttpToPublisher | 
*OASConfigmgrApi* | [**comAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFact**](OASConfigmgrApi.md#comAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFact) | **POST** /system/console/configMgr/com.adobe.cq.ui.wcm.commons.internal.servlets.rte.RTEFilterServletFactory.amended | 
*OASConfigmgrApi* | [**comAdobeCqUpgradesCleanupImplUpgradeContentCleanup**](OASConfigmgrApi.md#comAdobeCqUpgradesCleanupImplUpgradeContentCleanup) | **POST** /system/console/configMgr/com.adobe.cq.upgrades.cleanup.impl.UpgradeContentCleanup | 
*OASConfigmgrApi* | [**comAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanup**](OASConfigmgrApi.md#comAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanup) | **POST** /system/console/configMgr/com.adobe.cq.upgrades.cleanup.impl.UpgradeInstallFolderCleanup | 
*OASConfigmgrApi* | [**comAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderService**](OASConfigmgrApi.md#comAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderService) | **POST** /system/console/configMgr/com.adobe.cq.wcm.jobs.async.impl.AsyncDeleteConfigProviderService | 
*OASConfigmgrApi* | [**comAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTask**](OASConfigmgrApi.md#comAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTask) | **POST** /system/console/configMgr/com.adobe.cq.wcm.jobs.async.impl.AsyncJobCleanUpTask | 
*OASConfigmgrApi* | [**comAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderService**](OASConfigmgrApi.md#comAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderService) | **POST** /system/console/configMgr/com.adobe.cq.wcm.jobs.async.impl.AsyncMoveConfigProviderService | 
*OASConfigmgrApi* | [**comAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderService**](OASConfigmgrApi.md#comAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderService) | **POST** /system/console/configMgr/com.adobe.cq.wcm.jobs.async.impl.AsyncPageMoveConfigProviderService | 
*OASConfigmgrApi* | [**comAdobeCqWcmLaunchesImplLaunchesEventHandler**](OASConfigmgrApi.md#comAdobeCqWcmLaunchesImplLaunchesEventHandler) | **POST** /system/console/configMgr/com.adobe.cq.wcm.launches.impl.LaunchesEventHandler | 
*OASConfigmgrApi* | [**comAdobeCqWcmMobileQrcodeServletQRCodeImageGenerator**](OASConfigmgrApi.md#comAdobeCqWcmMobileQrcodeServletQRCodeImageGenerator) | **POST** /system/console/configMgr/com.adobe.cq.wcm.mobile.qrcode.servlet.QRCodeImageGenerator | 
*OASConfigmgrApi* | [**comAdobeCqWcmStyleInternalComponentStyleInfoCacheImpl**](OASConfigmgrApi.md#comAdobeCqWcmStyleInternalComponentStyleInfoCacheImpl) | **POST** /system/console/configMgr/com.adobe.cq.wcm.style.internal.ComponentStyleInfoCacheImpl | 
*OASConfigmgrApi* | [**comAdobeCqWcmTranslationImplTranslationPlatformConfigurationImpl**](OASConfigmgrApi.md#comAdobeCqWcmTranslationImplTranslationPlatformConfigurationImpl) | **POST** /system/console/configMgr/com.adobe.cq.wcm.translation.impl.TranslationPlatformConfigurationImpl | 
*OASConfigmgrApi* | [**comAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigService**](OASConfigmgrApi.md#comAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigService) | **POST** /system/console/configMgr/com.adobe.fd.fp.config.FormsPortalDraftsandSubmissionConfigService | 
*OASConfigmgrApi* | [**comAdobeFdFpConfigFormsPortalSchedulerService**](OASConfigmgrApi.md#comAdobeFdFpConfigFormsPortalSchedulerService) | **POST** /system/console/configMgr/com.adobe.fd.fp.config.FormsPortalSchedulerService | 
*OASConfigmgrApi* | [**comAdobeFormsCommonServiceImplDefaultDataProvider**](OASConfigmgrApi.md#comAdobeFormsCommonServiceImplDefaultDataProvider) | **POST** /system/console/configMgr/com.adobe.forms.common.service.impl.DefaultDataProvider | 
*OASConfigmgrApi* | [**comAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImp**](OASConfigmgrApi.md#comAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImp) | **POST** /system/console/configMgr/com.adobe.forms.common.service.impl.FormsCommonConfigurationServiceImpl | 
*OASConfigmgrApi* | [**comAdobeFormsCommonServletTempCleanUpTask**](OASConfigmgrApi.md#comAdobeFormsCommonServletTempCleanUpTask) | **POST** /system/console/configMgr/com.adobe.forms.common.servlet.TempCleanUpTask | 
*OASConfigmgrApi* | [**comAdobeGraniteAcpPlatformPlatformServlet**](OASConfigmgrApi.md#comAdobeGraniteAcpPlatformPlatformServlet) | **POST** /system/console/configMgr/com.adobe.granite.acp.platform.PlatformServlet | 
*OASConfigmgrApi* | [**comAdobeGraniteActivitystreamsImplActivityManagerImpl**](OASConfigmgrApi.md#comAdobeGraniteActivitystreamsImplActivityManagerImpl) | **POST** /system/console/configMgr/com.adobe.granite.activitystreams.impl.ActivityManagerImpl | 
*OASConfigmgrApi* | [**comAdobeGraniteAnalyzerBaseSystemStatusServlet**](OASConfigmgrApi.md#comAdobeGraniteAnalyzerBaseSystemStatusServlet) | **POST** /system/console/configMgr/com.adobe.granite.analyzer.base.SystemStatusServlet | 
*OASConfigmgrApi* | [**comAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServlet**](OASConfigmgrApi.md#comAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServlet) | **POST** /system/console/configMgr/com.adobe.granite.analyzer.scripts.compile.AllScriptsCompilerServlet | 
*OASConfigmgrApi* | [**comAdobeGraniteApicontrollerFilterResolverHookFactory**](OASConfigmgrApi.md#comAdobeGraniteApicontrollerFilterResolverHookFactory) | **POST** /system/console/configMgr/com.adobe.granite.apicontroller.FilterResolverHookFactory | 
*OASConfigmgrApi* | [**comAdobeGraniteAuthCertImplClientCertAuthHandler**](OASConfigmgrApi.md#comAdobeGraniteAuthCertImplClientCertAuthHandler) | **POST** /system/console/configMgr/com.adobe.granite.auth.cert.impl.ClientCertAuthHandler | 
*OASConfigmgrApi* | [**comAdobeGraniteAuthIms**](OASConfigmgrApi.md#comAdobeGraniteAuthIms) | **POST** /system/console/configMgr/com.adobe.granite.auth.ims | 
*OASConfigmgrApi* | [**comAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtension**](OASConfigmgrApi.md#comAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtension) | **POST** /system/console/configMgr/com.adobe.granite.auth.ims.impl.ExternalUserIdMappingProviderExtension | 
*OASConfigmgrApi* | [**comAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImpl**](OASConfigmgrApi.md#comAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImpl) | **POST** /system/console/configMgr/com.adobe.granite.auth.ims.impl.IMSAccessTokenRequestCustomizerImpl | 
*OASConfigmgrApi* | [**comAdobeGraniteAuthImsImplIMSInstanceCredentialsValidator**](OASConfigmgrApi.md#comAdobeGraniteAuthImsImplIMSInstanceCredentialsValidator) | **POST** /system/console/configMgr/com.adobe.granite.auth.ims.impl.IMSInstanceCredentialsValidator | 
*OASConfigmgrApi* | [**comAdobeGraniteAuthImsImplIMSProviderImpl**](OASConfigmgrApi.md#comAdobeGraniteAuthImsImplIMSProviderImpl) | **POST** /system/console/configMgr/com.adobe.granite.auth.ims.impl.IMSProviderImpl | 
*OASConfigmgrApi* | [**comAdobeGraniteAuthImsImplImsConfigProviderImpl**](OASConfigmgrApi.md#comAdobeGraniteAuthImsImplImsConfigProviderImpl) | **POST** /system/console/configMgr/com.adobe.granite.auth.ims.impl.ImsConfigProviderImpl | 
*OASConfigmgrApi* | [**comAdobeGraniteAuthOauthAccesstokenProvider**](OASConfigmgrApi.md#comAdobeGraniteAuthOauthAccesstokenProvider) | **POST** /system/console/configMgr/com.adobe.granite.auth.oauth.accesstoken.provider | 
*OASConfigmgrApi* | [**comAdobeGraniteAuthOauthImplBearerAuthenticationHandler**](OASConfigmgrApi.md#comAdobeGraniteAuthOauthImplBearerAuthenticationHandler) | **POST** /system/console/configMgr/com.adobe.granite.auth.oauth.impl.BearerAuthenticationHandler | 
*OASConfigmgrApi* | [**comAdobeGraniteAuthOauthImplDefaultTokenValidatorImpl**](OASConfigmgrApi.md#comAdobeGraniteAuthOauthImplDefaultTokenValidatorImpl) | **POST** /system/console/configMgr/com.adobe.granite.auth.oauth.impl.DefaultTokenValidatorImpl | 
*OASConfigmgrApi* | [**comAdobeGraniteAuthOauthImplFacebookProviderImpl**](OASConfigmgrApi.md#comAdobeGraniteAuthOauthImplFacebookProviderImpl) | **POST** /system/console/configMgr/com.adobe.granite.auth.oauth.impl.FacebookProviderImpl | 
*OASConfigmgrApi* | [**comAdobeGraniteAuthOauthImplGithubProviderImpl**](OASConfigmgrApi.md#comAdobeGraniteAuthOauthImplGithubProviderImpl) | **POST** /system/console/configMgr/com.adobe.granite.auth.oauth.impl.GithubProviderImpl | 
*OASConfigmgrApi* | [**comAdobeGraniteAuthOauthImplGraniteProvider**](OASConfigmgrApi.md#comAdobeGraniteAuthOauthImplGraniteProvider) | **POST** /system/console/configMgr/com.adobe.granite.auth.oauth.impl.GraniteProvider | 
*OASConfigmgrApi* | [**comAdobeGraniteAuthOauthImplHelperProviderConfigManager**](OASConfigmgrApi.md#comAdobeGraniteAuthOauthImplHelperProviderConfigManager) | **POST** /system/console/configMgr/com.adobe.granite.auth.oauth.impl.helper.ProviderConfigManager | 
*OASConfigmgrApi* | [**comAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternal**](OASConfigmgrApi.md#comAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternal) | **POST** /system/console/configMgr/com.adobe.granite.auth.oauth.impl.helper.ProviderConfigManagerInternal | 
*OASConfigmgrApi* | [**comAdobeGraniteAuthOauthImplOAuthAuthenticationHandler**](OASConfigmgrApi.md#comAdobeGraniteAuthOauthImplOAuthAuthenticationHandler) | **POST** /system/console/configMgr/com.adobe.granite.auth.oauth.impl.OAuthAuthenticationHandler | 
*OASConfigmgrApi* | [**comAdobeGraniteAuthOauthImplTwitterProviderImpl**](OASConfigmgrApi.md#comAdobeGraniteAuthOauthImplTwitterProviderImpl) | **POST** /system/console/configMgr/com.adobe.granite.auth.oauth.impl.TwitterProviderImpl | 
*OASConfigmgrApi* | [**comAdobeGraniteAuthOauthProvider**](OASConfigmgrApi.md#comAdobeGraniteAuthOauthProvider) | **POST** /system/console/configMgr/com.adobe.granite.auth.oauth.provider | 
*OASConfigmgrApi* | [**comAdobeGraniteAuthRequirementImplDefaultRequirementHandler**](OASConfigmgrApi.md#comAdobeGraniteAuthRequirementImplDefaultRequirementHandler) | **POST** /system/console/configMgr/com.adobe.granite.auth.requirement.impl.DefaultRequirementHandler | 
*OASConfigmgrApi* | [**comAdobeGraniteAuthSamlSamlAuthenticationHandler**](OASConfigmgrApi.md#comAdobeGraniteAuthSamlSamlAuthenticationHandler) | **POST** /system/console/configMgr/com.adobe.granite.auth.saml.SamlAuthenticationHandler | 
*OASConfigmgrApi* | [**comAdobeGraniteAuthSsoImplSsoAuthenticationHandler**](OASConfigmgrApi.md#comAdobeGraniteAuthSsoImplSsoAuthenticationHandler) | **POST** /system/console/configMgr/com.adobe.granite.auth.sso.impl.SsoAuthenticationHandler | 
*OASConfigmgrApi* | [**comAdobeGraniteBundlesHcImplCodeCacheHealthCheck**](OASConfigmgrApi.md#comAdobeGraniteBundlesHcImplCodeCacheHealthCheck) | **POST** /system/console/configMgr/com.adobe.granite.bundles.hc.impl.CodeCacheHealthCheck | 
*OASConfigmgrApi* | [**comAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheck**](OASConfigmgrApi.md#comAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheck) | **POST** /system/console/configMgr/com.adobe.granite.bundles.hc.impl.CrxdeSupportBundleHealthCheck | 
*OASConfigmgrApi* | [**comAdobeGraniteBundlesHcImplDavExBundleHealthCheck**](OASConfigmgrApi.md#comAdobeGraniteBundlesHcImplDavExBundleHealthCheck) | **POST** /system/console/configMgr/com.adobe.granite.bundles.hc.impl.DavExBundleHealthCheck | 
*OASConfigmgrApi* | [**comAdobeGraniteBundlesHcImplInactiveBundlesHealthCheck**](OASConfigmgrApi.md#comAdobeGraniteBundlesHcImplInactiveBundlesHealthCheck) | **POST** /system/console/configMgr/com.adobe.granite.bundles.hc.impl.InactiveBundlesHealthCheck | 
*OASConfigmgrApi* | [**comAdobeGraniteBundlesHcImplJobsHealthCheck**](OASConfigmgrApi.md#comAdobeGraniteBundlesHcImplJobsHealthCheck) | **POST** /system/console/configMgr/com.adobe.granite.bundles.hc.impl.JobsHealthCheck | 
*OASConfigmgrApi* | [**comAdobeGraniteBundlesHcImplSlingGetServletHealthCheck**](OASConfigmgrApi.md#comAdobeGraniteBundlesHcImplSlingGetServletHealthCheck) | **POST** /system/console/configMgr/com.adobe.granite.bundles.hc.impl.SlingGetServletHealthCheck | 
*OASConfigmgrApi* | [**comAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheck**](OASConfigmgrApi.md#comAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheck) | **POST** /system/console/configMgr/com.adobe.granite.bundles.hc.impl.SlingJavaScriptHandlerHealthCheck | 
*OASConfigmgrApi* | [**comAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheck**](OASConfigmgrApi.md#comAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheck) | **POST** /system/console/configMgr/com.adobe.granite.bundles.hc.impl.SlingJspScriptHandlerHealthCheck | 
*OASConfigmgrApi* | [**comAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheck**](OASConfigmgrApi.md#comAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheck) | **POST** /system/console/configMgr/com.adobe.granite.bundles.hc.impl.SlingReferrerFilterHealthCheck | 
*OASConfigmgrApi* | [**comAdobeGraniteBundlesHcImplWebDavBundleHealthCheck**](OASConfigmgrApi.md#comAdobeGraniteBundlesHcImplWebDavBundleHealthCheck) | **POST** /system/console/configMgr/com.adobe.granite.bundles.hc.impl.WebDavBundleHealthCheck | 
*OASConfigmgrApi* | [**comAdobeGraniteCommentsInternalCommentReplicationContentFilterFac**](OASConfigmgrApi.md#comAdobeGraniteCommentsInternalCommentReplicationContentFilterFac) | **POST** /system/console/configMgr/com.adobe.granite.comments.internal.CommentReplicationContentFilterFactory | 
*OASConfigmgrApi* | [**comAdobeGraniteCompatrouterImplCompatSwitchingServiceImpl**](OASConfigmgrApi.md#comAdobeGraniteCompatrouterImplCompatSwitchingServiceImpl) | **POST** /system/console/configMgr/com.adobe.granite.compatrouter.impl.CompatSwitchingServiceImpl | 
*OASConfigmgrApi* | [**comAdobeGraniteCompatrouterImplRoutingConfig**](OASConfigmgrApi.md#comAdobeGraniteCompatrouterImplRoutingConfig) | **POST** /system/console/configMgr/com.adobe.granite.compatrouter.impl.RoutingConfig | 
*OASConfigmgrApi* | [**comAdobeGraniteCompatrouterImplSwitchMappingConfig**](OASConfigmgrApi.md#comAdobeGraniteCompatrouterImplSwitchMappingConfig) | **POST** /system/console/configMgr/com.adobe.granite.compatrouter.impl.SwitchMappingConfig | 
*OASConfigmgrApi* | [**comAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolving**](OASConfigmgrApi.md#comAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolving) | **POST** /system/console/configMgr/com.adobe.granite.conf.impl.RuntimeAwareConfigurationResourceResolvingStrategy | 
*OASConfigmgrApi* | [**comAdobeGraniteContexthubImplContextHubImpl**](OASConfigmgrApi.md#comAdobeGraniteContexthubImplContextHubImpl) | **POST** /system/console/configMgr/com.adobe.granite.contexthub.impl.ContextHubImpl | 
*OASConfigmgrApi* | [**comAdobeGraniteCorsImplCORSPolicyImpl**](OASConfigmgrApi.md#comAdobeGraniteCorsImplCORSPolicyImpl) | **POST** /system/console/configMgr/com.adobe.granite.cors.impl.CORSPolicyImpl | 
*OASConfigmgrApi* | [**comAdobeGraniteCsrfImplCSRFFilter**](OASConfigmgrApi.md#comAdobeGraniteCsrfImplCSRFFilter) | **POST** /system/console/configMgr/com.adobe.granite.csrf.impl.CSRFFilter | 
*OASConfigmgrApi* | [**comAdobeGraniteCsrfImplCSRFServlet**](OASConfigmgrApi.md#comAdobeGraniteCsrfImplCSRFServlet) | **POST** /system/console/configMgr/com.adobe.granite.csrf.impl.CSRFServlet | 
*OASConfigmgrApi* | [**comAdobeGraniteDistributionCoreImplCryptoDistributionTransportSe**](OASConfigmgrApi.md#comAdobeGraniteDistributionCoreImplCryptoDistributionTransportSe) | **POST** /system/console/configMgr/com.adobe.granite.distribution.core.impl.CryptoDistributionTransportSecretProvider | 
*OASConfigmgrApi* | [**comAdobeGraniteDistributionCoreImplDiffDiffChangesObserver**](OASConfigmgrApi.md#comAdobeGraniteDistributionCoreImplDiffDiffChangesObserver) | **POST** /system/console/configMgr/com.adobe.granite.distribution.core.impl.diff.DiffChangesObserver | 
*OASConfigmgrApi* | [**comAdobeGraniteDistributionCoreImplDiffDiffEventListener**](OASConfigmgrApi.md#comAdobeGraniteDistributionCoreImplDiffDiffEventListener) | **POST** /system/console/configMgr/com.adobe.granite.distribution.core.impl.diff.DiffEventListener | 
*OASConfigmgrApi* | [**comAdobeGraniteDistributionCoreImplDistributionToReplicationEven**](OASConfigmgrApi.md#comAdobeGraniteDistributionCoreImplDistributionToReplicationEven) | **POST** /system/console/configMgr/com.adobe.granite.distribution.core.impl.DistributionToReplicationEventTransformer | 
*OASConfigmgrApi* | [**comAdobeGraniteDistributionCoreImplReplicationAdaptersReplicat**](OASConfigmgrApi.md#comAdobeGraniteDistributionCoreImplReplicationAdaptersReplicat) | **POST** /system/console/configMgr/com.adobe.granite.distribution.core.impl.replication.adapters.ReplicationAgentProvider | 
*OASConfigmgrApi* | [**comAdobeGraniteDistributionCoreImplReplicationDistributionTrans**](OASConfigmgrApi.md#comAdobeGraniteDistributionCoreImplReplicationDistributionTrans) | **POST** /system/console/configMgr/com.adobe.granite.distribution.core.impl.replication.DistributionTransportHandler | 
*OASConfigmgrApi* | [**comAdobeGraniteDistributionCoreImplTransportAccessTokenDistribu**](OASConfigmgrApi.md#comAdobeGraniteDistributionCoreImplTransportAccessTokenDistribu) | **POST** /system/console/configMgr/com.adobe.granite.distribution.core.impl.transport.AccessTokenDistributionTransportSecretProvider | 
*OASConfigmgrApi* | [**comAdobeGraniteFragsImplCheckHttpHeaderFlag**](OASConfigmgrApi.md#comAdobeGraniteFragsImplCheckHttpHeaderFlag) | **POST** /system/console/configMgr/com.adobe.granite.frags.impl.CheckHttpHeaderFlag | 
*OASConfigmgrApi* | [**comAdobeGraniteFragsImplRandomFeature**](OASConfigmgrApi.md#comAdobeGraniteFragsImplRandomFeature) | **POST** /system/console/configMgr/com.adobe.granite.frags.impl.RandomFeature | 
*OASConfigmgrApi* | [**comAdobeGraniteHttpcacheFileFileCacheStore**](OASConfigmgrApi.md#comAdobeGraniteHttpcacheFileFileCacheStore) | **POST** /system/console/configMgr/com.adobe.granite.httpcache.file.FileCacheStore | 
*OASConfigmgrApi* | [**comAdobeGraniteHttpcacheImplOuterCacheFilter**](OASConfigmgrApi.md#comAdobeGraniteHttpcacheImplOuterCacheFilter) | **POST** /system/console/configMgr/com.adobe.granite.httpcache.impl.OuterCacheFilter | 
*OASConfigmgrApi* | [**comAdobeGraniteI18nImplBundlePseudoTranslations**](OASConfigmgrApi.md#comAdobeGraniteI18nImplBundlePseudoTranslations) | **POST** /system/console/configMgr/com.adobe.granite.i18n.impl.bundle.PseudoTranslations | 
*OASConfigmgrApi* | [**comAdobeGraniteI18nImplPreferencesLocaleResolverService**](OASConfigmgrApi.md#comAdobeGraniteI18nImplPreferencesLocaleResolverService) | **POST** /system/console/configMgr/com.adobe.granite.i18n.impl.PreferencesLocaleResolverService | 
*OASConfigmgrApi* | [**comAdobeGraniteInfocollectorInfoCollector**](OASConfigmgrApi.md#comAdobeGraniteInfocollectorInfoCollector) | **POST** /system/console/configMgr/com.adobe.granite.infocollector.InfoCollector | 
*OASConfigmgrApi* | [**comAdobeGraniteJettySslInternalGraniteSslConnectorFactory**](OASConfigmgrApi.md#comAdobeGraniteJettySslInternalGraniteSslConnectorFactory) | **POST** /system/console/configMgr/com.adobe.granite.jetty.ssl.internal.GraniteSslConnectorFactory | 
*OASConfigmgrApi* | [**comAdobeGraniteLicenseImplLicenseCheckFilter**](OASConfigmgrApi.md#comAdobeGraniteLicenseImplLicenseCheckFilter) | **POST** /system/console/configMgr/com.adobe.granite.license.impl.LicenseCheckFilter | 
*OASConfigmgrApi* | [**comAdobeGraniteLoggingImplLogAnalyserImpl**](OASConfigmgrApi.md#comAdobeGraniteLoggingImplLogAnalyserImpl) | **POST** /system/console/configMgr/com.adobe.granite.logging.impl.LogAnalyserImpl | 
*OASConfigmgrApi* | [**comAdobeGraniteLoggingImplLogErrorHealthCheck**](OASConfigmgrApi.md#comAdobeGraniteLoggingImplLogErrorHealthCheck) | **POST** /system/console/configMgr/com.adobe.granite.logging.impl.LogErrorHealthCheck | 
*OASConfigmgrApi* | [**comAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTask**](OASConfigmgrApi.md#comAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTask) | **POST** /system/console/configMgr/com.adobe.granite.maintenance.crx.impl.DataStoreGarbageCollectionTask | 
*OASConfigmgrApi* | [**comAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTask**](OASConfigmgrApi.md#comAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTask) | **POST** /system/console/configMgr/com.adobe.granite.maintenance.crx.impl.LuceneBinariesCleanupTask | 
*OASConfigmgrApi* | [**comAdobeGraniteMaintenanceCrxImplRevisionCleanupTask**](OASConfigmgrApi.md#comAdobeGraniteMaintenanceCrxImplRevisionCleanupTask) | **POST** /system/console/configMgr/com.adobe.granite.maintenance.crx.impl.RevisionCleanupTask | 
*OASConfigmgrApi* | [**comAdobeGraniteMonitoringImplScriptConfigImpl**](OASConfigmgrApi.md#comAdobeGraniteMonitoringImplScriptConfigImpl) | **POST** /system/console/configMgr/com.adobe.granite.monitoring.impl.ScriptConfigImpl | 
*OASConfigmgrApi* | [**comAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHan**](OASConfigmgrApi.md#comAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHan) | **POST** /system/console/configMgr/com.adobe.granite.oauth.server.auth.impl.OAuth2ServerAuthenticationHandler | 
*OASConfigmgrApi* | [**comAdobeGraniteOauthServerImplAccessTokenCleanupTask**](OASConfigmgrApi.md#comAdobeGraniteOauthServerImplAccessTokenCleanupTask) | **POST** /system/console/configMgr/com.adobe.granite.oauth.server.impl.AccessTokenCleanupTask | 
*OASConfigmgrApi* | [**comAdobeGraniteOauthServerImplOAuth2ClientRevocationServlet**](OASConfigmgrApi.md#comAdobeGraniteOauthServerImplOAuth2ClientRevocationServlet) | **POST** /system/console/configMgr/com.adobe.granite.oauth.server.impl.OAuth2ClientRevocationServlet | 
*OASConfigmgrApi* | [**comAdobeGraniteOauthServerImplOAuth2RevocationEndpointServlet**](OASConfigmgrApi.md#comAdobeGraniteOauthServerImplOAuth2RevocationEndpointServlet) | **POST** /system/console/configMgr/com.adobe.granite.oauth.server.impl.OAuth2RevocationEndpointServlet | 
*OASConfigmgrApi* | [**comAdobeGraniteOauthServerImplOAuth2TokenEndpointServlet**](OASConfigmgrApi.md#comAdobeGraniteOauthServerImplOAuth2TokenEndpointServlet) | **POST** /system/console/configMgr/com.adobe.granite.oauth.server.impl.OAuth2TokenEndpointServlet | 
*OASConfigmgrApi* | [**comAdobeGraniteOauthServerImplOAuth2TokenRevocationServlet**](OASConfigmgrApi.md#comAdobeGraniteOauthServerImplOAuth2TokenRevocationServlet) | **POST** /system/console/configMgr/com.adobe.granite.oauth.server.impl.OAuth2TokenRevocationServlet | 
*OASConfigmgrApi* | [**comAdobeGraniteOffloadingImplOffloadingConfigurator**](OASConfigmgrApi.md#comAdobeGraniteOffloadingImplOffloadingConfigurator) | **POST** /system/console/configMgr/com.adobe.granite.offloading.impl.OffloadingConfigurator | 
*OASConfigmgrApi* | [**comAdobeGraniteOffloadingImplOffloadingJobCloner**](OASConfigmgrApi.md#comAdobeGraniteOffloadingImplOffloadingJobCloner) | **POST** /system/console/configMgr/com.adobe.granite.offloading.impl.OffloadingJobCloner | 
*OASConfigmgrApi* | [**comAdobeGraniteOffloadingImplOffloadingJobOffloader**](OASConfigmgrApi.md#comAdobeGraniteOffloadingImplOffloadingJobOffloader) | **POST** /system/console/configMgr/com.adobe.granite.offloading.impl.OffloadingJobOffloader | 
*OASConfigmgrApi* | [**comAdobeGraniteOffloadingImplTransporterOffloadingAgentManager**](OASConfigmgrApi.md#comAdobeGraniteOffloadingImplTransporterOffloadingAgentManager) | **POST** /system/console/configMgr/com.adobe.granite.offloading.impl.transporter.OffloadingAgentManager | 
*OASConfigmgrApi* | [**comAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspo**](OASConfigmgrApi.md#comAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspo) | **POST** /system/console/configMgr/com.adobe.granite.offloading.impl.transporter.OffloadingDefaultTransporter | 
*OASConfigmgrApi* | [**comAdobeGraniteOmnisearchImplCoreOmniSearchServiceImpl**](OASConfigmgrApi.md#comAdobeGraniteOmnisearchImplCoreOmniSearchServiceImpl) | **POST** /system/console/configMgr/com.adobe.granite.omnisearch.impl.core.OmniSearchServiceImpl | 
*OASConfigmgrApi* | [**comAdobeGraniteOptoutImplOptOutServiceImpl**](OASConfigmgrApi.md#comAdobeGraniteOptoutImplOptOutServiceImpl) | **POST** /system/console/configMgr/com.adobe.granite.optout.impl.OptOutServiceImpl | 
*OASConfigmgrApi* | [**comAdobeGraniteQueriesImplHcAsyncIndexHealthCheck**](OASConfigmgrApi.md#comAdobeGraniteQueriesImplHcAsyncIndexHealthCheck) | **POST** /system/console/configMgr/com.adobe.granite.queries.impl.hc.AsyncIndexHealthCheck | 
*OASConfigmgrApi* | [**comAdobeGraniteQueriesImplHcLargeIndexHealthCheck**](OASConfigmgrApi.md#comAdobeGraniteQueriesImplHcLargeIndexHealthCheck) | **POST** /system/console/configMgr/com.adobe.granite.queries.impl.hc.LargeIndexHealthCheck | 
*OASConfigmgrApi* | [**comAdobeGraniteQueriesImplHcQueriesStatusHealthCheck**](OASConfigmgrApi.md#comAdobeGraniteQueriesImplHcQueriesStatusHealthCheck) | **POST** /system/console/configMgr/com.adobe.granite.queries.impl.hc.QueriesStatusHealthCheck | 
*OASConfigmgrApi* | [**comAdobeGraniteQueriesImplHcQueryHealthCheckMetrics**](OASConfigmgrApi.md#comAdobeGraniteQueriesImplHcQueryHealthCheckMetrics) | **POST** /system/console/configMgr/com.adobe.granite.queries.impl.hc.QueryHealthCheckMetrics | 
*OASConfigmgrApi* | [**comAdobeGraniteQueriesImplHcQueryLimitsHealthCheck**](OASConfigmgrApi.md#comAdobeGraniteQueriesImplHcQueryLimitsHealthCheck) | **POST** /system/console/configMgr/com.adobe.granite.queries.impl.hc.QueryLimitsHealthCheck | 
*OASConfigmgrApi* | [**comAdobeGraniteReplicationHcImplReplicationQueueHealthCheck**](OASConfigmgrApi.md#comAdobeGraniteReplicationHcImplReplicationQueueHealthCheck) | **POST** /system/console/configMgr/com.adobe.granite.replication.hc.impl.ReplicationQueueHealthCheck | 
*OASConfigmgrApi* | [**comAdobeGraniteReplicationHcImplReplicationTransportUsersHealthC**](OASConfigmgrApi.md#comAdobeGraniteReplicationHcImplReplicationTransportUsersHealthC) | **POST** /system/console/configMgr/com.adobe.granite.replication.hc.impl.ReplicationTransportUsersHealthCheck | 
*OASConfigmgrApi* | [**comAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheck**](OASConfigmgrApi.md#comAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheck) | **POST** /system/console/configMgr/com.adobe.granite.repository.hc.impl.AuthorizableNodeNameHealthCheck | 
*OASConfigmgrApi* | [**comAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthC**](OASConfigmgrApi.md#comAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthC) | **POST** /system/console/configMgr/com.adobe.granite.repository.hc.impl.content.sling.SlingContentHealthCheck | 
*OASConfigmgrApi* | [**comAdobeGraniteRepositoryHcImplContinuousRGCHealthCheck**](OASConfigmgrApi.md#comAdobeGraniteRepositoryHcImplContinuousRGCHealthCheck) | **POST** /system/console/configMgr/com.adobe.granite.repository.hc.impl.ContinuousRGCHealthCheck | 
*OASConfigmgrApi* | [**comAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthChe**](OASConfigmgrApi.md#comAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthChe) | **POST** /system/console/configMgr/com.adobe.granite.repository.hc.impl.DefaultAccessUserProfileHealthCheck | 
*OASConfigmgrApi* | [**comAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheck**](OASConfigmgrApi.md#comAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheck) | **POST** /system/console/configMgr/com.adobe.granite.repository.hc.impl.DefaultLoginsHealthCheck | 
*OASConfigmgrApi* | [**comAdobeGraniteRepositoryHcImplDiskSpaceHealthCheck**](OASConfigmgrApi.md#comAdobeGraniteRepositoryHcImplDiskSpaceHealthCheck) | **POST** /system/console/configMgr/com.adobe.granite.repository.hc.impl.DiskSpaceHealthCheck | 
*OASConfigmgrApi* | [**comAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheck**](OASConfigmgrApi.md#comAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheck) | **POST** /system/console/configMgr/com.adobe.granite.repository.hc.impl.ObservationQueueLengthHealthCheck | 
*OASConfigmgrApi* | [**comAdobeGraniteRepositoryImplCommitStatsConfig**](OASConfigmgrApi.md#comAdobeGraniteRepositoryImplCommitStatsConfig) | **POST** /system/console/configMgr/com.adobe.granite.repository.impl.CommitStatsConfig | 
*OASConfigmgrApi* | [**comAdobeGraniteRepositoryServiceUserConfiguration**](OASConfigmgrApi.md#comAdobeGraniteRepositoryServiceUserConfiguration) | **POST** /system/console/configMgr/com.adobe.granite.repository.ServiceUserConfiguration | 
*OASConfigmgrApi* | [**comAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckIm**](OASConfigmgrApi.md#comAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckIm) | **POST** /system/console/configMgr/com.adobe.granite.requests.logging.impl.hc.RequestsStatusHealthCheckImpl | 
*OASConfigmgrApi* | [**comAdobeGraniteResourcestatusImplCompositeStatusType**](OASConfigmgrApi.md#comAdobeGraniteResourcestatusImplCompositeStatusType) | **POST** /system/console/configMgr/com.adobe.granite.resourcestatus.impl.CompositeStatusType | 
*OASConfigmgrApi* | [**comAdobeGraniteResourcestatusImplStatusResourceProviderImpl**](OASConfigmgrApi.md#comAdobeGraniteResourcestatusImplStatusResourceProviderImpl) | **POST** /system/console/configMgr/com.adobe.granite.resourcestatus.impl.StatusResourceProviderImpl | 
*OASConfigmgrApi* | [**comAdobeGraniteRestAssetsImplAssetContentDispositionFilter**](OASConfigmgrApi.md#comAdobeGraniteRestAssetsImplAssetContentDispositionFilter) | **POST** /system/console/configMgr/com.adobe.granite.rest.assets.impl.AssetContentDispositionFilter | 
*OASConfigmgrApi* | [**comAdobeGraniteRestImplApiEndpointResourceProviderFactoryImpl**](OASConfigmgrApi.md#comAdobeGraniteRestImplApiEndpointResourceProviderFactoryImpl) | **POST** /system/console/configMgr/com.adobe.granite.rest.impl.ApiEndpointResourceProviderFactoryImpl | 
*OASConfigmgrApi* | [**comAdobeGraniteRestImplServletDefaultGETServlet**](OASConfigmgrApi.md#comAdobeGraniteRestImplServletDefaultGETServlet) | **POST** /system/console/configMgr/com.adobe.granite.rest.impl.servlet.DefaultGETServlet | 
*OASConfigmgrApi* | [**comAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationS**](OASConfigmgrApi.md#comAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationS) | **POST** /system/console/configMgr/com.adobe.granite.security.user.ui.internal.servlets.SSLConfigurationServlet | 
*OASConfigmgrApi* | [**comAdobeGraniteSecurityUserUserPropertiesService**](OASConfigmgrApi.md#comAdobeGraniteSecurityUserUserPropertiesService) | **POST** /system/console/configMgr/com.adobe.granite.security.user.UserPropertiesService | 
*OASConfigmgrApi* | [**comAdobeGraniteSocialgraphImplSocialGraphFactoryImpl**](OASConfigmgrApi.md#comAdobeGraniteSocialgraphImplSocialGraphFactoryImpl) | **POST** /system/console/configMgr/com.adobe.granite.socialgraph.impl.SocialGraphFactoryImpl | 
*OASConfigmgrApi* | [**comAdobeGraniteSystemMonitoringImplSystemStatsMBeanImpl**](OASConfigmgrApi.md#comAdobeGraniteSystemMonitoringImplSystemStatsMBeanImpl) | **POST** /system/console/configMgr/com.adobe.granite.system.monitoring.impl.SystemStatsMBeanImpl | 
*OASConfigmgrApi* | [**comAdobeGraniteTaskmanagementImplJcrTaskAdapterFactory**](OASConfigmgrApi.md#comAdobeGraniteTaskmanagementImplJcrTaskAdapterFactory) | **POST** /system/console/configMgr/com.adobe.granite.taskmanagement.impl.jcr.TaskAdapterFactory | 
*OASConfigmgrApi* | [**comAdobeGraniteTaskmanagementImplJcrTaskArchiveService**](OASConfigmgrApi.md#comAdobeGraniteTaskmanagementImplJcrTaskArchiveService) | **POST** /system/console/configMgr/com.adobe.granite.taskmanagement.impl.jcr.TaskArchiveService | 
*OASConfigmgrApi* | [**comAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTask**](OASConfigmgrApi.md#comAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTask) | **POST** /system/console/configMgr/com.adobe.granite.taskmanagement.impl.purge.TaskPurgeMaintenanceTask | 
*OASConfigmgrApi* | [**comAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactor**](OASConfigmgrApi.md#comAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactor) | **POST** /system/console/configMgr/com.adobe.granite.taskmanagement.impl.service.TaskManagerAdapterFactory | 
*OASConfigmgrApi* | [**comAdobeGraniteThreaddumpThreadDumpCollector**](OASConfigmgrApi.md#comAdobeGraniteThreaddumpThreadDumpCollector) | **POST** /system/console/configMgr/com.adobe.granite.threaddump.ThreadDumpCollector | 
*OASConfigmgrApi* | [**comAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTransl**](OASConfigmgrApi.md#comAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTransl) | **POST** /system/console/configMgr/com.adobe.granite.translation.connector.msft.core.impl.MicrosoftTranslationServiceFactoryImpl | 
*OASConfigmgrApi* | [**comAdobeGraniteTranslationCoreImplTranslationManagerImpl**](OASConfigmgrApi.md#comAdobeGraniteTranslationCoreImplTranslationManagerImpl) | **POST** /system/console/configMgr/com.adobe.granite.translation.core.impl.TranslationManagerImpl | 
*OASConfigmgrApi* | [**comAdobeGraniteUiClientlibsImplHtmlLibraryManagerImpl**](OASConfigmgrApi.md#comAdobeGraniteUiClientlibsImplHtmlLibraryManagerImpl) | **POST** /system/console/configMgr/com.adobe.granite.ui.clientlibs.impl.HtmlLibraryManagerImpl | 
*OASConfigmgrApi* | [**comAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeature**](OASConfigmgrApi.md#comAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeature) | **POST** /system/console/configMgr/com.adobe.granite.workflow.console.frags.WorkflowWithdrawFeature | 
*OASConfigmgrApi* | [**comAdobeGraniteWorkflowConsolePublishWorkflowPublishEventService**](OASConfigmgrApi.md#comAdobeGraniteWorkflowConsolePublishWorkflowPublishEventService) | **POST** /system/console/configMgr/com.adobe.granite.workflow.console.publish.WorkflowPublishEventService | 
*OASConfigmgrApi* | [**comAdobeGraniteWorkflowCoreJcrWorkflowBucketManager**](OASConfigmgrApi.md#comAdobeGraniteWorkflowCoreJcrWorkflowBucketManager) | **POST** /system/console/configMgr/com.adobe.granite.workflow.core.jcr.WorkflowBucketManager | 
*OASConfigmgrApi* | [**comAdobeGraniteWorkflowCoreJobExternalProcessJobHandler**](OASConfigmgrApi.md#comAdobeGraniteWorkflowCoreJobExternalProcessJobHandler) | **POST** /system/console/configMgr/com.adobe.granite.workflow.core.job.ExternalProcessJobHandler | 
*OASConfigmgrApi* | [**comAdobeGraniteWorkflowCoreJobJobHandler**](OASConfigmgrApi.md#comAdobeGraniteWorkflowCoreJobJobHandler) | **POST** /system/console/configMgr/com.adobe.granite.workflow.core.job.JobHandler | 
*OASConfigmgrApi* | [**comAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsum**](OASConfigmgrApi.md#comAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsum) | **POST** /system/console/configMgr/com.adobe.granite.workflow.core.offloading.WorkflowOffloadingJobConsumer | 
*OASConfigmgrApi* | [**comAdobeGraniteWorkflowCorePayloadMapCache**](OASConfigmgrApi.md#comAdobeGraniteWorkflowCorePayloadMapCache) | **POST** /system/console/configMgr/com.adobe.granite.workflow.core.PayloadMapCache | 
*OASConfigmgrApi* | [**comAdobeGraniteWorkflowCorePayloadmapPayloadMoveListener**](OASConfigmgrApi.md#comAdobeGraniteWorkflowCorePayloadmapPayloadMoveListener) | **POST** /system/console/configMgr/com.adobe.granite.workflow.core.payloadmap.PayloadMoveListener | 
*OASConfigmgrApi* | [**comAdobeGraniteWorkflowCoreWorkflowConfig**](OASConfigmgrApi.md#comAdobeGraniteWorkflowCoreWorkflowConfig) | **POST** /system/console/configMgr/com.adobe.granite.workflow.core.WorkflowConfig | 
*OASConfigmgrApi* | [**comAdobeGraniteWorkflowCoreWorkflowSessionFactory**](OASConfigmgrApi.md#comAdobeGraniteWorkflowCoreWorkflowSessionFactory) | **POST** /system/console/configMgr/com.adobe.granite.workflow.core.WorkflowSessionFactory | 
*OASConfigmgrApi* | [**comAdobeGraniteWorkflowPurgeScheduler**](OASConfigmgrApi.md#comAdobeGraniteWorkflowPurgeScheduler) | **POST** /system/console/configMgr/com.adobe.granite.workflow.purge.Scheduler | 
*OASConfigmgrApi* | [**comAdobeOctopusNcommBootstrap**](OASConfigmgrApi.md#comAdobeOctopusNcommBootstrap) | **POST** /system/console/configMgr/com.adobe.octopus.ncomm.bootstrap | 
*OASConfigmgrApi* | [**comAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullS**](OASConfigmgrApi.md#comAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullS) | **POST** /system/console/configMgr/com.adobe.social.integrations.livefyre.user.pingforpull.impl.PingPullServlet | 
*OASConfigmgrApi* | [**comAdobeXmpWorkerFilesNcommXMPFilesNComm**](OASConfigmgrApi.md#comAdobeXmpWorkerFilesNcommXMPFilesNComm) | **POST** /system/console/configMgr/com.adobe.xmp.worker.files.ncomm.XMPFilesNComm | 
*OASConfigmgrApi* | [**comDayCommonsDatasourceJdbcpoolJdbcPoolService**](OASConfigmgrApi.md#comDayCommonsDatasourceJdbcpoolJdbcPoolService) | **POST** /system/console/configMgr/com.day.commons.datasource.jdbcpool.JdbcPoolService | 
*OASConfigmgrApi* | [**comDayCommonsHttpclient**](OASConfigmgrApi.md#comDayCommonsHttpclient) | **POST** /system/console/configMgr/com.day.commons.httpclient | 
*OASConfigmgrApi* | [**comDayCqAnalyticsImplStorePropertiesChangeListener**](OASConfigmgrApi.md#comDayCqAnalyticsImplStorePropertiesChangeListener) | **POST** /system/console/configMgr/com.day.cq.analytics.impl.StorePropertiesChangeListener | 
*OASConfigmgrApi* | [**comDayCqAnalyticsSitecatalystImplExporterClassificationsExporte**](OASConfigmgrApi.md#comDayCqAnalyticsSitecatalystImplExporterClassificationsExporte) | **POST** /system/console/configMgr/com.day.cq.analytics.sitecatalyst.impl.exporter.ClassificationsExporter | 
*OASConfigmgrApi* | [**comDayCqAnalyticsSitecatalystImplImporterReportImporter**](OASConfigmgrApi.md#comDayCqAnalyticsSitecatalystImplImporterReportImporter) | **POST** /system/console/configMgr/com.day.cq.analytics.sitecatalyst.impl.importer.ReportImporter | 
*OASConfigmgrApi* | [**comDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactory**](OASConfigmgrApi.md#comDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactory) | **POST** /system/console/configMgr/com.day.cq.analytics.sitecatalyst.impl.SitecatalystAdapterFactory | 
*OASConfigmgrApi* | [**comDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImpl**](OASConfigmgrApi.md#comDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImpl) | **POST** /system/console/configMgr/com.day.cq.analytics.sitecatalyst.impl.SitecatalystHttpClientImpl | 
*OASConfigmgrApi* | [**comDayCqAnalyticsTestandtargetImplAccountOptionsUpdater**](OASConfigmgrApi.md#comDayCqAnalyticsTestandtargetImplAccountOptionsUpdater) | **POST** /system/console/configMgr/com.day.cq.analytics.testandtarget.impl.AccountOptionsUpdater | 
*OASConfigmgrApi* | [**comDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListener**](OASConfigmgrApi.md#comDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListener) | **POST** /system/console/configMgr/com.day.cq.analytics.testandtarget.impl.DeleteAuthorActivityListener | 
*OASConfigmgrApi* | [**comDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListener**](OASConfigmgrApi.md#comDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListener) | **POST** /system/console/configMgr/com.day.cq.analytics.testandtarget.impl.PushAuthorCampaignPageListener | 
*OASConfigmgrApi* | [**comDayCqAnalyticsTestandtargetImplSegmentImporter**](OASConfigmgrApi.md#comDayCqAnalyticsTestandtargetImplSegmentImporter) | **POST** /system/console/configMgr/com.day.cq.analytics.testandtarget.impl.SegmentImporter | 
*OASConfigmgrApi* | [**comDayCqAnalyticsTestandtargetImplServiceWebServiceImpl**](OASConfigmgrApi.md#comDayCqAnalyticsTestandtargetImplServiceWebServiceImpl) | **POST** /system/console/configMgr/com.day.cq.analytics.testandtarget.impl.service.WebServiceImpl | 
*OASConfigmgrApi* | [**comDayCqAnalyticsTestandtargetImplServletsAdminServerServlet**](OASConfigmgrApi.md#comDayCqAnalyticsTestandtargetImplServletsAdminServerServlet) | **POST** /system/console/configMgr/com.day.cq.analytics.testandtarget.impl.servlets.AdminServerServlet | 
*OASConfigmgrApi* | [**comDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImpl**](OASConfigmgrApi.md#comDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImpl) | **POST** /system/console/configMgr/com.day.cq.analytics.testandtarget.impl.TestandtargetHttpClientImpl | 
*OASConfigmgrApi* | [**comDayCqAuthImplCugCugSupportImpl**](OASConfigmgrApi.md#comDayCqAuthImplCugCugSupportImpl) | **POST** /system/console/configMgr/com.day.cq.auth.impl.cug.CugSupportImpl | 
*OASConfigmgrApi* | [**comDayCqAuthImplLoginSelectorHandler**](OASConfigmgrApi.md#comDayCqAuthImplLoginSelectorHandler) | **POST** /system/console/configMgr/com.day.cq.auth.impl.LoginSelectorHandler | 
*OASConfigmgrApi* | [**comDayCqCommonsImplExternalizerImpl**](OASConfigmgrApi.md#comDayCqCommonsImplExternalizerImpl) | **POST** /system/console/configMgr/com.day.cq.commons.impl.ExternalizerImpl | 
*OASConfigmgrApi* | [**comDayCqCommonsServletsRootMappingServlet**](OASConfigmgrApi.md#comDayCqCommonsServletsRootMappingServlet) | **POST** /system/console/configMgr/com.day.cq.commons.servlets.RootMappingServlet | 
*OASConfigmgrApi* | [**comDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionChecke**](OASConfigmgrApi.md#comDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionChecke) | **POST** /system/console/configMgr/com.day.cq.compat.codeupgrade.impl.CodeUpgradeExecutionConditionChecker | 
*OASConfigmgrApi* | [**comDayCqCompatCodeupgradeImplUpgradeTaskIgnoreList**](OASConfigmgrApi.md#comDayCqCompatCodeupgradeImplUpgradeTaskIgnoreList) | **POST** /system/console/configMgr/com.day.cq.compat.codeupgrade.impl.UpgradeTaskIgnoreList | 
*OASConfigmgrApi* | [**comDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelist**](OASConfigmgrApi.md#comDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelist) | **POST** /system/console/configMgr/com.day.cq.compat.codeupgrade.impl.VersionRangeTaskIgnorelist | 
*OASConfigmgrApi* | [**comDayCqContentsyncImplContentSyncManagerImpl**](OASConfigmgrApi.md#comDayCqContentsyncImplContentSyncManagerImpl) | **POST** /system/console/configMgr/com.day.cq.contentsync.impl.ContentSyncManagerImpl | 
*OASConfigmgrApi* | [**comDayCqDamCommonsHandlerStandardImageHandler**](OASConfigmgrApi.md#comDayCqDamCommonsHandlerStandardImageHandler) | **POST** /system/console/configMgr/com.day.cq.dam.commons.handler.StandardImageHandler | 
*OASConfigmgrApi* | [**comDayCqDamCommonsMetadataXmpFilterBlackWhite**](OASConfigmgrApi.md#comDayCqDamCommonsMetadataXmpFilterBlackWhite) | **POST** /system/console/configMgr/com.day.cq.dam.commons.metadata.XmpFilterBlackWhite | 
*OASConfigmgrApi* | [**comDayCqDamCommonsUtilImplAssetCacheImpl**](OASConfigmgrApi.md#comDayCqDamCommonsUtilImplAssetCacheImpl) | **POST** /system/console/configMgr/com.day.cq.dam.commons.util.impl.AssetCacheImpl | 
*OASConfigmgrApi* | [**comDayCqDamCoreImplAnnotationPdfAnnotationPdfConfig**](OASConfigmgrApi.md#comDayCqDamCoreImplAnnotationPdfAnnotationPdfConfig) | **POST** /system/console/configMgr/com.day.cq.dam.core.impl.annotation.pdf.AnnotationPdfConfig | 
*OASConfigmgrApi* | [**comDayCqDamCoreImplAssetMoveListener**](OASConfigmgrApi.md#comDayCqDamCoreImplAssetMoveListener) | **POST** /system/console/configMgr/com.day.cq.dam.core.impl.AssetMoveListener | 
*OASConfigmgrApi* | [**comDayCqDamCoreImplAssethomeAssetHomePageConfiguration**](OASConfigmgrApi.md#comDayCqDamCoreImplAssethomeAssetHomePageConfiguration) | **POST** /system/console/configMgr/com.day.cq.dam.core.impl.assethome.AssetHomePageConfiguration | 
*OASConfigmgrApi* | [**comDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServlet**](OASConfigmgrApi.md#comDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServlet) | **POST** /system/console/configMgr/com.day.cq.dam.core.impl.assetlinkshare.AdhocAssetShareProxyServlet | 
*OASConfigmgrApi* | [**comDayCqDamCoreImplCacheCQBufferedImageCache**](OASConfigmgrApi.md#comDayCqDamCoreImplCacheCQBufferedImageCache) | **POST** /system/console/configMgr/com.day.cq.dam.core.impl.cache.CQBufferedImageCache | 
*OASConfigmgrApi* | [**comDayCqDamCoreImplDamChangeEventListener**](OASConfigmgrApi.md#comDayCqDamCoreImplDamChangeEventListener) | **POST** /system/console/configMgr/com.day.cq.dam.core.impl.DamChangeEventListener | 
*OASConfigmgrApi* | [**comDayCqDamCoreImplDamEventPurgeService**](OASConfigmgrApi.md#comDayCqDamCoreImplDamEventPurgeService) | **POST** /system/console/configMgr/com.day.cq.dam.core.impl.DamEventPurgeService | 
*OASConfigmgrApi* | [**comDayCqDamCoreImplDamEventRecorderImpl**](OASConfigmgrApi.md#comDayCqDamCoreImplDamEventRecorderImpl) | **POST** /system/console/configMgr/com.day.cq.dam.core.impl.DamEventRecorderImpl | 
*OASConfigmgrApi* | [**comDayCqDamCoreImplEventDamEventAuditListener**](OASConfigmgrApi.md#comDayCqDamCoreImplEventDamEventAuditListener) | **POST** /system/console/configMgr/com.day.cq.dam.core.impl.event.DamEventAuditListener | 
*OASConfigmgrApi* | [**comDayCqDamCoreImplExpiryNotificationJobImpl**](OASConfigmgrApi.md#comDayCqDamCoreImplExpiryNotificationJobImpl) | **POST** /system/console/configMgr/com.day.cq.dam.core.impl.ExpiryNotificationJobImpl | 
*OASConfigmgrApi* | [**comDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeat**](OASConfigmgrApi.md#comDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeat) | **POST** /system/console/configMgr/com.day.cq.dam.core.impl.foldermetadataschema.FolderMetadataSchemaFeatureFlag | 
*OASConfigmgrApi* | [**comDayCqDamCoreImplGfxCommonsGfxRenderer**](OASConfigmgrApi.md#comDayCqDamCoreImplGfxCommonsGfxRenderer) | **POST** /system/console/configMgr/com.day.cq.dam.core.impl.gfx.CommonsGfxRenderer | 
*OASConfigmgrApi* | [**comDayCqDamCoreImplHandlerEPSFormatHandler**](OASConfigmgrApi.md#comDayCqDamCoreImplHandlerEPSFormatHandler) | **POST** /system/console/configMgr/com.day.cq.dam.core.impl.handler.EPSFormatHandler | 
*OASConfigmgrApi* | [**comDayCqDamCoreImplHandlerIndesignFormatHandler**](OASConfigmgrApi.md#comDayCqDamCoreImplHandlerIndesignFormatHandler) | **POST** /system/console/configMgr/com.day.cq.dam.core.impl.handler.IndesignFormatHandler | 
*OASConfigmgrApi* | [**comDayCqDamCoreImplHandlerJpegHandler**](OASConfigmgrApi.md#comDayCqDamCoreImplHandlerJpegHandler) | **POST** /system/console/configMgr/com.day.cq.dam.core.impl.handler.JpegHandler | 
*OASConfigmgrApi* | [**comDayCqDamCoreImplHandlerXmpNCommXMPHandler**](OASConfigmgrApi.md#comDayCqDamCoreImplHandlerXmpNCommXMPHandler) | **POST** /system/console/configMgr/com.day.cq.dam.core.impl.handler.xmp.NCommXMPHandler | 
*OASConfigmgrApi* | [**comDayCqDamCoreImplJmxAssetIndexUpdateMonitor**](OASConfigmgrApi.md#comDayCqDamCoreImplJmxAssetIndexUpdateMonitor) | **POST** /system/console/configMgr/com.day.cq.dam.core.impl.jmx.AssetIndexUpdateMonitor | 
*OASConfigmgrApi* | [**comDayCqDamCoreImplJmxAssetMigrationMBeanImpl**](OASConfigmgrApi.md#comDayCqDamCoreImplJmxAssetMigrationMBeanImpl) | **POST** /system/console/configMgr/com.day.cq.dam.core.impl.jmx.AssetMigrationMBeanImpl | 
*OASConfigmgrApi* | [**comDayCqDamCoreImplJmxAssetUpdateMonitorImpl**](OASConfigmgrApi.md#comDayCqDamCoreImplJmxAssetUpdateMonitorImpl) | **POST** /system/console/configMgr/com.day.cq.dam.core.impl.jmx.AssetUpdateMonitorImpl | 
*OASConfigmgrApi* | [**comDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfig**](OASConfigmgrApi.md#comDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfig) | **POST** /system/console/configMgr/com.day.cq.dam.core.impl.jobs.metadataexport.AsyncMetadataExportConfigProviderService | 
*OASConfigmgrApi* | [**comDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfig**](OASConfigmgrApi.md#comDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfig) | **POST** /system/console/configMgr/com.day.cq.dam.core.impl.jobs.metadataimport.AsyncMetadataImportConfigProviderService | 
*OASConfigmgrApi* | [**comDayCqDamCoreImplLightboxLightboxServlet**](OASConfigmgrApi.md#comDayCqDamCoreImplLightboxLightboxServlet) | **POST** /system/console/configMgr/com.day.cq.dam.core.impl.lightbox.LightboxServlet | 
*OASConfigmgrApi* | [**comDayCqDamCoreImplMetadataEditorSelectComponentHandler**](OASConfigmgrApi.md#comDayCqDamCoreImplMetadataEditorSelectComponentHandler) | **POST** /system/console/configMgr/com.day.cq.dam.core.impl.metadata.editor.SelectComponentHandler | 
*OASConfigmgrApi* | [**comDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelper**](OASConfigmgrApi.md#comDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelper) | **POST** /system/console/configMgr/com.day.cq.dam.core.impl.mimeType.AssetUploadRestrictionHelper | 
*OASConfigmgrApi* | [**comDayCqDamCoreImplMimeTypeDamMimeTypeServiceImpl**](OASConfigmgrApi.md#comDayCqDamCoreImplMimeTypeDamMimeTypeServiceImpl) | **POST** /system/console/configMgr/com.day.cq.dam.core.impl.mimeType.DamMimeTypeServiceImpl | 
*OASConfigmgrApi* | [**comDayCqDamCoreImplMissingMetadataNotificationJob**](OASConfigmgrApi.md#comDayCqDamCoreImplMissingMetadataNotificationJob) | **POST** /system/console/configMgr/com.day.cq.dam.core.impl.MissingMetadataNotificationJob | 
*OASConfigmgrApi* | [**comDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPr**](OASConfigmgrApi.md#comDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPr) | **POST** /system/console/configMgr/com.day.cq.dam.core.impl.process.SendTransientWorkflowCompletedEmailProcess | 
*OASConfigmgrApi* | [**comDayCqDamCoreImplProcessTextExtractionProcess**](OASConfigmgrApi.md#comDayCqDamCoreImplProcessTextExtractionProcess) | **POST** /system/console/configMgr/com.day.cq.dam.core.impl.process.TextExtractionProcess | 
*OASConfigmgrApi* | [**comDayCqDamCoreImplRenditionMakerImpl**](OASConfigmgrApi.md#comDayCqDamCoreImplRenditionMakerImpl) | **POST** /system/console/configMgr/com.day.cq.dam.core.impl.RenditionMakerImpl | 
*OASConfigmgrApi* | [**comDayCqDamCoreImplReportsReportExportService**](OASConfigmgrApi.md#comDayCqDamCoreImplReportsReportExportService) | **POST** /system/console/configMgr/com.day.cq.dam.core.impl.reports.ReportExportService | 
*OASConfigmgrApi* | [**comDayCqDamCoreImplReportsReportPurgeService**](OASConfigmgrApi.md#comDayCqDamCoreImplReportsReportPurgeService) | **POST** /system/console/configMgr/com.day.cq.dam.core.impl.reports.ReportPurgeService | 
*OASConfigmgrApi* | [**comDayCqDamCoreImplServletAssetDownloadServlet**](OASConfigmgrApi.md#comDayCqDamCoreImplServletAssetDownloadServlet) | **POST** /system/console/configMgr/com.day.cq.dam.core.impl.servlet.AssetDownloadServlet | 
*OASConfigmgrApi* | [**comDayCqDamCoreImplServletAssetStatusServlet**](OASConfigmgrApi.md#comDayCqDamCoreImplServletAssetStatusServlet) | **POST** /system/console/configMgr/com.day.cq.dam.core.impl.servlet.AssetStatusServlet | 
*OASConfigmgrApi* | [**comDayCqDamCoreImplServletAssetXMPSearchServlet**](OASConfigmgrApi.md#comDayCqDamCoreImplServletAssetXMPSearchServlet) | **POST** /system/console/configMgr/com.day.cq.dam.core.impl.servlet.AssetXMPSearchServlet | 
*OASConfigmgrApi* | [**comDayCqDamCoreImplServletBatchMetadataServlet**](OASConfigmgrApi.md#comDayCqDamCoreImplServletBatchMetadataServlet) | **POST** /system/console/configMgr/com.day.cq.dam.core.impl.servlet.BatchMetadataServlet | 
*OASConfigmgrApi* | [**comDayCqDamCoreImplServletBinaryProviderServlet**](OASConfigmgrApi.md#comDayCqDamCoreImplServletBinaryProviderServlet) | **POST** /system/console/configMgr/com.day.cq.dam.core.impl.servlet.BinaryProviderServlet | 
*OASConfigmgrApi* | [**comDayCqDamCoreImplServletCollectionServlet**](OASConfigmgrApi.md#comDayCqDamCoreImplServletCollectionServlet) | **POST** /system/console/configMgr/com.day.cq.dam.core.impl.servlet.CollectionServlet | 
*OASConfigmgrApi* | [**comDayCqDamCoreImplServletCollectionsServlet**](OASConfigmgrApi.md#comDayCqDamCoreImplServletCollectionsServlet) | **POST** /system/console/configMgr/com.day.cq.dam.core.impl.servlet.CollectionsServlet | 
*OASConfigmgrApi* | [**comDayCqDamCoreImplServletCompanionServlet**](OASConfigmgrApi.md#comDayCqDamCoreImplServletCompanionServlet) | **POST** /system/console/configMgr/com.day.cq.dam.core.impl.servlet.CompanionServlet | 
*OASConfigmgrApi* | [**comDayCqDamCoreImplServletCreateAssetServlet**](OASConfigmgrApi.md#comDayCqDamCoreImplServletCreateAssetServlet) | **POST** /system/console/configMgr/com.day.cq.dam.core.impl.servlet.CreateAssetServlet | 
*OASConfigmgrApi* | [**comDayCqDamCoreImplServletDamContentDispositionFilter**](OASConfigmgrApi.md#comDayCqDamCoreImplServletDamContentDispositionFilter) | **POST** /system/console/configMgr/com.day.cq.dam.core.impl.servlet.DamContentDispositionFilter | 
*OASConfigmgrApi* | [**comDayCqDamCoreImplServletGuidLookupFilter**](OASConfigmgrApi.md#comDayCqDamCoreImplServletGuidLookupFilter) | **POST** /system/console/configMgr/com.day.cq.dam.core.impl.servlet.GuidLookupFilter | 
*OASConfigmgrApi* | [**comDayCqDamCoreImplServletHealthCheckServlet**](OASConfigmgrApi.md#comDayCqDamCoreImplServletHealthCheckServlet) | **POST** /system/console/configMgr/com.day.cq.dam.core.impl.servlet.HealthCheckServlet | 
*OASConfigmgrApi* | [**comDayCqDamCoreImplServletMetadataGetServlet**](OASConfigmgrApi.md#comDayCqDamCoreImplServletMetadataGetServlet) | **POST** /system/console/configMgr/com.day.cq.dam.core.impl.servlet.MetadataGetServlet | 
*OASConfigmgrApi* | [**comDayCqDamCoreImplServletMultipleLicenseAcceptServlet**](OASConfigmgrApi.md#comDayCqDamCoreImplServletMultipleLicenseAcceptServlet) | **POST** /system/console/configMgr/com.day.cq.dam.core.impl.servlet.MultipleLicenseAcceptServlet | 
*OASConfigmgrApi* | [**comDayCqDamCoreImplServletResourceCollectionServlet**](OASConfigmgrApi.md#comDayCqDamCoreImplServletResourceCollectionServlet) | **POST** /system/console/configMgr/com.day.cq.dam.core.impl.servlet.ResourceCollectionServlet | 
*OASConfigmgrApi* | [**comDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImpl**](OASConfigmgrApi.md#comDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImpl) | **POST** /system/console/configMgr/com.day.cq.dam.core.impl.ui.preview.FolderPreviewUpdaterImpl | 
*OASConfigmgrApi* | [**comDayCqDamCoreImplUnzipUnzipConfig**](OASConfigmgrApi.md#comDayCqDamCoreImplUnzipUnzipConfig) | **POST** /system/console/configMgr/com.day.cq.dam.core.impl.unzip.UnzipConfig | 
*OASConfigmgrApi* | [**comDayCqDamCoreProcessExifToolExtractMetadataProcess**](OASConfigmgrApi.md#comDayCqDamCoreProcessExifToolExtractMetadataProcess) | **POST** /system/console/configMgr/com.day.cq.dam.core.process.ExifToolExtractMetadataProcess | 
*OASConfigmgrApi* | [**comDayCqDamCoreProcessExtractMetadataProcess**](OASConfigmgrApi.md#comDayCqDamCoreProcessExtractMetadataProcess) | **POST** /system/console/configMgr/com.day.cq.dam.core.process.ExtractMetadataProcess | 
*OASConfigmgrApi* | [**comDayCqDamCoreProcessMetadataProcessorProcess**](OASConfigmgrApi.md#comDayCqDamCoreProcessMetadataProcessorProcess) | **POST** /system/console/configMgr/com.day.cq.dam.core.process.MetadataProcessorProcess | 
*OASConfigmgrApi* | [**comDayCqDamHandlerFfmpegLocatorImpl**](OASConfigmgrApi.md#comDayCqDamHandlerFfmpegLocatorImpl) | **POST** /system/console/configMgr/com.day.cq.dam.handler.ffmpeg.LocatorImpl | 
*OASConfigmgrApi* | [**comDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImpl**](OASConfigmgrApi.md#comDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImpl) | **POST** /system/console/configMgr/com.day.cq.dam.handler.gibson.fontmanager.impl.FontManagerServiceImpl | 
*OASConfigmgrApi* | [**comDayCqDamHandlerStandardPdfPdfHandler**](OASConfigmgrApi.md#comDayCqDamHandlerStandardPdfPdfHandler) | **POST** /system/console/configMgr/com.day.cq.dam.handler.standard.pdf.PdfHandler | 
*OASConfigmgrApi* | [**comDayCqDamHandlerStandardPsPostScriptHandler**](OASConfigmgrApi.md#comDayCqDamHandlerStandardPsPostScriptHandler) | **POST** /system/console/configMgr/com.day.cq.dam.handler.standard.ps.PostScriptHandler | 
*OASConfigmgrApi* | [**comDayCqDamHandlerStandardPsdPsdHandler**](OASConfigmgrApi.md#comDayCqDamHandlerStandardPsdPsdHandler) | **POST** /system/console/configMgr/com.day.cq.dam.handler.standard.psd.PsdHandler | 
*OASConfigmgrApi* | [**comDayCqDamIdsImplIDSJobProcessor**](OASConfigmgrApi.md#comDayCqDamIdsImplIDSJobProcessor) | **POST** /system/console/configMgr/com.day.cq.dam.ids.impl.IDSJobProcessor | 
*OASConfigmgrApi* | [**comDayCqDamIdsImplIDSPoolManagerImpl**](OASConfigmgrApi.md#comDayCqDamIdsImplIDSPoolManagerImpl) | **POST** /system/console/configMgr/com.day.cq.dam.ids.impl.IDSPoolManagerImpl | 
*OASConfigmgrApi* | [**comDayCqDamInddImplHandlerIndesignXMPHandler**](OASConfigmgrApi.md#comDayCqDamInddImplHandlerIndesignXMPHandler) | **POST** /system/console/configMgr/com.day.cq.dam.indd.impl.handler.IndesignXMPHandler | 
*OASConfigmgrApi* | [**comDayCqDamInddImplServletSnippetCreationServlet**](OASConfigmgrApi.md#comDayCqDamInddImplServletSnippetCreationServlet) | **POST** /system/console/configMgr/com.day.cq.dam.indd.impl.servlet.SnippetCreationServlet | 
*OASConfigmgrApi* | [**comDayCqDamInddProcessINDDMediaExtractProcess**](OASConfigmgrApi.md#comDayCqDamInddProcessINDDMediaExtractProcess) | **POST** /system/console/configMgr/com.day.cq.dam.indd.process.INDDMediaExtractProcess | 
*OASConfigmgrApi* | [**comDayCqDamPerformanceInternalAssetPerformanceDataHandlerImpl**](OASConfigmgrApi.md#comDayCqDamPerformanceInternalAssetPerformanceDataHandlerImpl) | **POST** /system/console/configMgr/com.day.cq.dam.performance.internal.AssetPerformanceDataHandlerImpl | 
*OASConfigmgrApi* | [**comDayCqDamPerformanceInternalAssetPerformanceReportSyncJob**](OASConfigmgrApi.md#comDayCqDamPerformanceInternalAssetPerformanceReportSyncJob) | **POST** /system/console/configMgr/com.day.cq.dam.performance.internal.AssetPerformanceReportSyncJob | 
*OASConfigmgrApi* | [**comDayCqDamPimImplSourcingUploadProcessProductAssetsUploadPro**](OASConfigmgrApi.md#comDayCqDamPimImplSourcingUploadProcessProductAssetsUploadPro) | **POST** /system/console/configMgr/com.day.cq.dam.pim.impl.sourcing.upload.process.ProductAssetsUploadProcess | 
*OASConfigmgrApi* | [**comDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEven**](OASConfigmgrApi.md#comDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEven) | **POST** /system/console/configMgr/com.day.cq.dam.s7dam.common.analytics.impl.S7damDynamicMediaConfigEventListener | 
*OASConfigmgrApi* | [**comDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunner**](OASConfigmgrApi.md#comDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunner) | **POST** /system/console/configMgr/com.day.cq.dam.s7dam.common.analytics.impl.SiteCatalystReportRunner | 
*OASConfigmgrApi* | [**comDayCqDamS7damCommonPostServletsSetCreateHandler**](OASConfigmgrApi.md#comDayCqDamS7damCommonPostServletsSetCreateHandler) | **POST** /system/console/configMgr/com.day.cq.dam.s7dam.common.post.servlets.SetCreateHandler | 
*OASConfigmgrApi* | [**comDayCqDamS7damCommonPostServletsSetModifyHandler**](OASConfigmgrApi.md#comDayCqDamS7damCommonPostServletsSetModifyHandler) | **POST** /system/console/configMgr/com.day.cq.dam.s7dam.common.post.servlets.SetModifyHandler | 
*OASConfigmgrApi* | [**comDayCqDamS7damCommonProcessVideoThumbnailDownloadProcess**](OASConfigmgrApi.md#comDayCqDamS7damCommonProcessVideoThumbnailDownloadProcess) | **POST** /system/console/configMgr/com.day.cq.dam.s7dam.common.process.VideoThumbnailDownloadProcess | 
*OASConfigmgrApi* | [**comDayCqDamS7damCommonS7damDamChangeEventListener**](OASConfigmgrApi.md#comDayCqDamS7damCommonS7damDamChangeEventListener) | **POST** /system/console/configMgr/com.day.cq.dam.s7dam.common.S7damDamChangeEventListener | 
*OASConfigmgrApi* | [**comDayCqDamS7damCommonServletsS7damProductInfoServlet**](OASConfigmgrApi.md#comDayCqDamS7damCommonServletsS7damProductInfoServlet) | **POST** /system/console/configMgr/com.day.cq.dam.s7dam.common.servlets.S7damProductInfoServlet | 
*OASConfigmgrApi* | [**comDayCqDamS7damCommonVideoImplVideoProxyClientServiceImpl**](OASConfigmgrApi.md#comDayCqDamS7damCommonVideoImplVideoProxyClientServiceImpl) | **POST** /system/console/configMgr/com.day.cq.dam.s7dam.common.video.impl.VideoProxyClientServiceImpl | 
*OASConfigmgrApi* | [**comDayCqDamScene7ImplScene7APIClientImpl**](OASConfigmgrApi.md#comDayCqDamScene7ImplScene7APIClientImpl) | **POST** /system/console/configMgr/com.day.cq.dam.scene7.impl.Scene7APIClientImpl | 
*OASConfigmgrApi* | [**comDayCqDamScene7ImplScene7AssetMimeTypeServiceImpl**](OASConfigmgrApi.md#comDayCqDamScene7ImplScene7AssetMimeTypeServiceImpl) | **POST** /system/console/configMgr/com.day.cq.dam.scene7.impl.Scene7AssetMimeTypeServiceImpl | 
*OASConfigmgrApi* | [**comDayCqDamScene7ImplScene7ConfigurationEventListener**](OASConfigmgrApi.md#comDayCqDamScene7ImplScene7ConfigurationEventListener) | **POST** /system/console/configMgr/com.day.cq.dam.scene7.impl.Scene7ConfigurationEventListener | 
*OASConfigmgrApi* | [**comDayCqDamScene7ImplScene7DamChangeEventListener**](OASConfigmgrApi.md#comDayCqDamScene7ImplScene7DamChangeEventListener) | **POST** /system/console/configMgr/com.day.cq.dam.scene7.impl.Scene7DamChangeEventListener | 
*OASConfigmgrApi* | [**comDayCqDamScene7ImplScene7FlashTemplatesServiceImpl**](OASConfigmgrApi.md#comDayCqDamScene7ImplScene7FlashTemplatesServiceImpl) | **POST** /system/console/configMgr/com.day.cq.dam.scene7.impl.Scene7FlashTemplatesServiceImpl | 
*OASConfigmgrApi* | [**comDayCqDamScene7ImplScene7UploadServiceImpl**](OASConfigmgrApi.md#comDayCqDamScene7ImplScene7UploadServiceImpl) | **POST** /system/console/configMgr/com.day.cq.dam.scene7.impl.Scene7UploadServiceImpl | 
*OASConfigmgrApi* | [**comDayCqDamStockIntegrationImplCacheStockCacheConfigurationSer**](OASConfigmgrApi.md#comDayCqDamStockIntegrationImplCacheStockCacheConfigurationSer) | **POST** /system/console/configMgr/com.day.cq.dam.stock.integration.impl.cache.StockCacheConfigurationServiceImpl | 
*OASConfigmgrApi* | [**comDayCqDamStockIntegrationImplConfigurationStockConfiguration**](OASConfigmgrApi.md#comDayCqDamStockIntegrationImplConfigurationStockConfiguration) | **POST** /system/console/configMgr/com.day.cq.dam.stock.integration.impl.configuration.StockConfigurationImpl | 
*OASConfigmgrApi* | [**comDayCqDamVideoImplServletVideoTestServlet**](OASConfigmgrApi.md#comDayCqDamVideoImplServletVideoTestServlet) | **POST** /system/console/configMgr/com.day.cq.dam.video.impl.servlet.VideoTestServlet | 
*OASConfigmgrApi* | [**comDayCqExtwidgetServletsImageSpriteServlet**](OASConfigmgrApi.md#comDayCqExtwidgetServletsImageSpriteServlet) | **POST** /system/console/configMgr/com.day.cq.extwidget.servlets.ImageSpriteServlet | 
*OASConfigmgrApi* | [**comDayCqImageInternalFontFontHelper**](OASConfigmgrApi.md#comDayCqImageInternalFontFontHelper) | **POST** /system/console/configMgr/com.day.cq.image.internal.font.FontHelper | 
*OASConfigmgrApi* | [**comDayCqJcrclustersupportClusterStartLevelController**](OASConfigmgrApi.md#comDayCqJcrclustersupportClusterStartLevelController) | **POST** /system/console/configMgr/com.day.cq.jcrclustersupport.ClusterStartLevelController | 
*OASConfigmgrApi* | [**comDayCqMailerDefaultMailService**](OASConfigmgrApi.md#comDayCqMailerDefaultMailService) | **POST** /system/console/configMgr/com.day.cq.mailer.DefaultMailService | 
*OASConfigmgrApi* | [**comDayCqMailerImplCqMailingService**](OASConfigmgrApi.md#comDayCqMailerImplCqMailingService) | **POST** /system/console/configMgr/com.day.cq.mailer.impl.CqMailingService | 
*OASConfigmgrApi* | [**comDayCqMailerImplEmailCqEmailTemplateFactory**](OASConfigmgrApi.md#comDayCqMailerImplEmailCqEmailTemplateFactory) | **POST** /system/console/configMgr/com.day.cq.mailer.impl.email.CqEmailTemplateFactory | 
*OASConfigmgrApi* | [**comDayCqMailerImplEmailCqRetrieverTemplateFactory**](OASConfigmgrApi.md#comDayCqMailerImplEmailCqRetrieverTemplateFactory) | **POST** /system/console/configMgr/com.day.cq.mailer.impl.email.CqRetrieverTemplateFactory | 
*OASConfigmgrApi* | [**comDayCqMcmCampaignImplIntegrationConfigImpl**](OASConfigmgrApi.md#comDayCqMcmCampaignImplIntegrationConfigImpl) | **POST** /system/console/configMgr/com.day.cq.mcm.campaign.impl.IntegrationConfigImpl | 
*OASConfigmgrApi* | [**comDayCqMcmCampaignImporterPersonalizedTextHandlerFactory**](OASConfigmgrApi.md#comDayCqMcmCampaignImporterPersonalizedTextHandlerFactory) | **POST** /system/console/configMgr/com.day.cq.mcm.campaign.importer.PersonalizedTextHandlerFactory | 
*OASConfigmgrApi* | [**comDayCqMcmCoreNewsletterNewsletterEmailServiceImpl**](OASConfigmgrApi.md#comDayCqMcmCoreNewsletterNewsletterEmailServiceImpl) | **POST** /system/console/configMgr/com.day.cq.mcm.core.newsletter.NewsletterEmailServiceImpl | 
*OASConfigmgrApi* | [**comDayCqMcmImplMCMConfiguration**](OASConfigmgrApi.md#comDayCqMcmImplMCMConfiguration) | **POST** /system/console/configMgr/com.day.cq.mcm.impl.MCMConfiguration | 
*OASConfigmgrApi* | [**comDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponen**](OASConfigmgrApi.md#comDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponen) | **POST** /system/console/configMgr/com.day.cq.mcm.landingpage.parser.taghandlers.cta.ClickThroughComponentTagHandlerFactory | 
*OASConfigmgrApi* | [**comDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThroug**](OASConfigmgrApi.md#comDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThroug) | **POST** /system/console/configMgr/com.day.cq.mcm.landingpage.parser.taghandlers.cta.GraphicalClickThroughComponentTagHandlerFactory | 
*OASConfigmgrApi* | [**comDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponent**](OASConfigmgrApi.md#comDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponent) | **POST** /system/console/configMgr/com.day.cq.mcm.landingpage.parser.taghandlers.cta.LeadFormCTAComponentTagHandlerFactory | 
*OASConfigmgrApi* | [**comDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHa**](OASConfigmgrApi.md#comDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHa) | **POST** /system/console/configMgr/com.day.cq.mcm.landingpage.parser.taghandlers.mbox.MBoxExperienceTagHandlerFactory | 
*OASConfigmgrApi* | [**comDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagH**](OASConfigmgrApi.md#comDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagH) | **POST** /system/console/configMgr/com.day.cq.mcm.landingpage.parser.taghandlers.mbox.TargetComponentTagHandlerFactory | 
*OASConfigmgrApi* | [**comDayCqNotificationImplNotificationServiceImpl**](OASConfigmgrApi.md#comDayCqNotificationImplNotificationServiceImpl) | **POST** /system/console/configMgr/com.day.cq.notification.impl.NotificationServiceImpl | 
*OASConfigmgrApi* | [**comDayCqPersonalizationImplServletsTargetingConfigurationServlet**](OASConfigmgrApi.md#comDayCqPersonalizationImplServletsTargetingConfigurationServlet) | **POST** /system/console/configMgr/com.day.cq.personalization.impl.servlets.TargetingConfigurationServlet | 
*OASConfigmgrApi* | [**comDayCqPollingImporterImplManagedPollConfigImpl**](OASConfigmgrApi.md#comDayCqPollingImporterImplManagedPollConfigImpl) | **POST** /system/console/configMgr/com.day.cq.polling.importer.impl.ManagedPollConfigImpl | 
*OASConfigmgrApi* | [**comDayCqPollingImporterImplManagedPollingImporterImpl**](OASConfigmgrApi.md#comDayCqPollingImporterImplManagedPollingImporterImpl) | **POST** /system/console/configMgr/com.day.cq.polling.importer.impl.ManagedPollingImporterImpl | 
*OASConfigmgrApi* | [**comDayCqPollingImporterImplPollingImporterImpl**](OASConfigmgrApi.md#comDayCqPollingImporterImplPollingImporterImpl) | **POST** /system/console/configMgr/com.day.cq.polling.importer.impl.PollingImporterImpl | 
*OASConfigmgrApi* | [**comDayCqReplicationAuditReplicationEventListener**](OASConfigmgrApi.md#comDayCqReplicationAuditReplicationEventListener) | **POST** /system/console/configMgr/com.day.cq.replication.audit.ReplicationEventListener | 
*OASConfigmgrApi* | [**comDayCqReplicationContentStaticContentBuilder**](OASConfigmgrApi.md#comDayCqReplicationContentStaticContentBuilder) | **POST** /system/console/configMgr/com.day.cq.replication.content.StaticContentBuilder | 
*OASConfigmgrApi* | [**comDayCqReplicationImplAgentManagerImpl**](OASConfigmgrApi.md#comDayCqReplicationImplAgentManagerImpl) | **POST** /system/console/configMgr/com.day.cq.replication.impl.AgentManagerImpl | 
*OASConfigmgrApi* | [**comDayCqReplicationImplContentDurboBinaryLessContentBuilder**](OASConfigmgrApi.md#comDayCqReplicationImplContentDurboBinaryLessContentBuilder) | **POST** /system/console/configMgr/com.day.cq.replication.impl.content.durbo.BinaryLessContentBuilder | 
*OASConfigmgrApi* | [**comDayCqReplicationImplContentDurboDurboImportConfigurationProv**](OASConfigmgrApi.md#comDayCqReplicationImplContentDurboDurboImportConfigurationProv) | **POST** /system/console/configMgr/com.day.cq.replication.impl.content.durbo.DurboImportConfigurationProviderService | 
*OASConfigmgrApi* | [**comDayCqReplicationImplReplicationContentFactoryProviderImpl**](OASConfigmgrApi.md#comDayCqReplicationImplReplicationContentFactoryProviderImpl) | **POST** /system/console/configMgr/com.day.cq.replication.impl.ReplicationContentFactoryProviderImpl | 
*OASConfigmgrApi* | [**comDayCqReplicationImplReplicationReceiverImpl**](OASConfigmgrApi.md#comDayCqReplicationImplReplicationReceiverImpl) | **POST** /system/console/configMgr/com.day.cq.replication.impl.ReplicationReceiverImpl | 
*OASConfigmgrApi* | [**comDayCqReplicationImplReplicatorImpl**](OASConfigmgrApi.md#comDayCqReplicationImplReplicatorImpl) | **POST** /system/console/configMgr/com.day.cq.replication.impl.ReplicatorImpl | 
*OASConfigmgrApi* | [**comDayCqReplicationImplReverseReplicator**](OASConfigmgrApi.md#comDayCqReplicationImplReverseReplicator) | **POST** /system/console/configMgr/com.day.cq.replication.impl.ReverseReplicator | 
*OASConfigmgrApi* | [**comDayCqReplicationImplTransportBinaryLessTransportHandler**](OASConfigmgrApi.md#comDayCqReplicationImplTransportBinaryLessTransportHandler) | **POST** /system/console/configMgr/com.day.cq.replication.impl.transport.BinaryLessTransportHandler | 
*OASConfigmgrApi* | [**comDayCqReplicationImplTransportHttp**](OASConfigmgrApi.md#comDayCqReplicationImplTransportHttp) | **POST** /system/console/configMgr/com.day.cq.replication.impl.transport.Http | 
*OASConfigmgrApi* | [**comDayCqReportingImplCacheCacheImpl**](OASConfigmgrApi.md#comDayCqReportingImplCacheCacheImpl) | **POST** /system/console/configMgr/com.day.cq.reporting.impl.cache.CacheImpl | 
*OASConfigmgrApi* | [**comDayCqReportingImplConfigServiceImpl**](OASConfigmgrApi.md#comDayCqReportingImplConfigServiceImpl) | **POST** /system/console/configMgr/com.day.cq.reporting.impl.ConfigServiceImpl | 
*OASConfigmgrApi* | [**comDayCqReportingImplRLogAnalyzer**](OASConfigmgrApi.md#comDayCqReportingImplRLogAnalyzer) | **POST** /system/console/configMgr/com.day.cq.reporting.impl.RLogAnalyzer | 
*OASConfigmgrApi* | [**comDayCqRewriterLinkcheckerImplLinkCheckerImpl**](OASConfigmgrApi.md#comDayCqRewriterLinkcheckerImplLinkCheckerImpl) | **POST** /system/console/configMgr/com.day.cq.rewriter.linkchecker.impl.LinkCheckerImpl | 
*OASConfigmgrApi* | [**comDayCqRewriterLinkcheckerImplLinkCheckerTask**](OASConfigmgrApi.md#comDayCqRewriterLinkcheckerImplLinkCheckerTask) | **POST** /system/console/configMgr/com.day.cq.rewriter.linkchecker.impl.LinkCheckerTask | 
*OASConfigmgrApi* | [**comDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactory**](OASConfigmgrApi.md#comDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactory) | **POST** /system/console/configMgr/com.day.cq.rewriter.linkchecker.impl.LinkCheckerTransformerFactory | 
*OASConfigmgrApi* | [**comDayCqRewriterLinkcheckerImplLinkInfoStorageImpl**](OASConfigmgrApi.md#comDayCqRewriterLinkcheckerImplLinkInfoStorageImpl) | **POST** /system/console/configMgr/com.day.cq.rewriter.linkchecker.impl.LinkInfoStorageImpl | 
*OASConfigmgrApi* | [**comDayCqRewriterProcessorImplHtmlParserFactory**](OASConfigmgrApi.md#comDayCqRewriterProcessorImplHtmlParserFactory) | **POST** /system/console/configMgr/com.day.cq.rewriter.processor.impl.HtmlParserFactory | 
*OASConfigmgrApi* | [**comDayCqSearchImplBuilderQueryBuilderImpl**](OASConfigmgrApi.md#comDayCqSearchImplBuilderQueryBuilderImpl) | **POST** /system/console/configMgr/com.day.cq.search.impl.builder.QueryBuilderImpl | 
*OASConfigmgrApi* | [**comDayCqSearchSuggestImplSuggestionIndexManagerImpl**](OASConfigmgrApi.md#comDayCqSearchSuggestImplSuggestionIndexManagerImpl) | **POST** /system/console/configMgr/com.day.cq.search.suggest.impl.SuggestionIndexManagerImpl | 
*OASConfigmgrApi* | [**comDayCqSearchpromoteImplPublishSearchPromoteConfigHandler**](OASConfigmgrApi.md#comDayCqSearchpromoteImplPublishSearchPromoteConfigHandler) | **POST** /system/console/configMgr/com.day.cq.searchpromote.impl.PublishSearchPromoteConfigHandler | 
*OASConfigmgrApi* | [**comDayCqSearchpromoteImplSearchPromoteServiceImpl**](OASConfigmgrApi.md#comDayCqSearchpromoteImplSearchPromoteServiceImpl) | **POST** /system/console/configMgr/com.day.cq.searchpromote.impl.SearchPromoteServiceImpl | 
*OASConfigmgrApi* | [**comDayCqSecurityACLSetup**](OASConfigmgrApi.md#comDayCqSecurityACLSetup) | **POST** /system/console/configMgr/com.day.cq.security.ACLSetup | 
*OASConfigmgrApi* | [**comDayCqStatisticsImplStatisticsServiceImpl**](OASConfigmgrApi.md#comDayCqStatisticsImplStatisticsServiceImpl) | **POST** /system/console/configMgr/com.day.cq.statistics.impl.StatisticsServiceImpl | 
*OASConfigmgrApi* | [**comDayCqTaggingImplJcrTagManagerFactoryImpl**](OASConfigmgrApi.md#comDayCqTaggingImplJcrTagManagerFactoryImpl) | **POST** /system/console/configMgr/com.day.cq.tagging.impl.JcrTagManagerFactoryImpl | 
*OASConfigmgrApi* | [**comDayCqTaggingImplSearchTagPredicateEvaluator**](OASConfigmgrApi.md#comDayCqTaggingImplSearchTagPredicateEvaluator) | **POST** /system/console/configMgr/com.day.cq.tagging.impl.search.TagPredicateEvaluator | 
*OASConfigmgrApi* | [**comDayCqTaggingImplTagGarbageCollector**](OASConfigmgrApi.md#comDayCqTaggingImplTagGarbageCollector) | **POST** /system/console/configMgr/com.day.cq.tagging.impl.TagGarbageCollector | 
*OASConfigmgrApi* | [**comDayCqWcmContentsyncImplHandlerPagesUpdateHandler**](OASConfigmgrApi.md#comDayCqWcmContentsyncImplHandlerPagesUpdateHandler) | **POST** /system/console/configMgr/com.day.cq.wcm.contentsync.impl.handler.PagesUpdateHandler | 
*OASConfigmgrApi* | [**comDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactor**](OASConfigmgrApi.md#comDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactor) | **POST** /system/console/configMgr/com.day.cq.wcm.contentsync.impl.rewriter.PathRewriterTransformerFactory | 
*OASConfigmgrApi* | [**comDayCqWcmCoreImplAuthoringUIModeServiceImpl**](OASConfigmgrApi.md#comDayCqWcmCoreImplAuthoringUIModeServiceImpl) | **POST** /system/console/configMgr/com.day.cq.wcm.core.impl.AuthoringUIModeServiceImpl | 
*OASConfigmgrApi* | [**comDayCqWcmCoreImplCommandsWCMCommandServlet**](OASConfigmgrApi.md#comDayCqWcmCoreImplCommandsWCMCommandServlet) | **POST** /system/console/configMgr/com.day.cq.wcm.core.impl.commands.WCMCommandServlet | 
*OASConfigmgrApi* | [**comDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImpl**](OASConfigmgrApi.md#comDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImpl) | **POST** /system/console/configMgr/com.day.cq.wcm.core.impl.devicedetection.DeviceIdentificationModeImpl | 
*OASConfigmgrApi* | [**comDayCqWcmCoreImplEventPageEventAuditListener**](OASConfigmgrApi.md#comDayCqWcmCoreImplEventPageEventAuditListener) | **POST** /system/console/configMgr/com.day.cq.wcm.core.impl.event.PageEventAuditListener | 
*OASConfigmgrApi* | [**comDayCqWcmCoreImplEventPagePostProcessor**](OASConfigmgrApi.md#comDayCqWcmCoreImplEventPagePostProcessor) | **POST** /system/console/configMgr/com.day.cq.wcm.core.impl.event.PagePostProcessor | 
*OASConfigmgrApi* | [**comDayCqWcmCoreImplEventRepositoryChangeEventListener**](OASConfigmgrApi.md#comDayCqWcmCoreImplEventRepositoryChangeEventListener) | **POST** /system/console/configMgr/com.day.cq.wcm.core.impl.event.RepositoryChangeEventListener | 
*OASConfigmgrApi* | [**comDayCqWcmCoreImplEventTemplatePostProcessor**](OASConfigmgrApi.md#comDayCqWcmCoreImplEventTemplatePostProcessor) | **POST** /system/console/configMgr/com.day.cq.wcm.core.impl.event.TemplatePostProcessor | 
*OASConfigmgrApi* | [**comDayCqWcmCoreImplLanguageManagerImpl**](OASConfigmgrApi.md#comDayCqWcmCoreImplLanguageManagerImpl) | **POST** /system/console/configMgr/com.day.cq.wcm.core.impl.LanguageManagerImpl | 
*OASConfigmgrApi* | [**comDayCqWcmCoreImplLinkCheckerConfigurationFactoryImpl**](OASConfigmgrApi.md#comDayCqWcmCoreImplLinkCheckerConfigurationFactoryImpl) | **POST** /system/console/configMgr/com.day.cq.wcm.core.impl.LinkCheckerConfigurationFactoryImpl | 
*OASConfigmgrApi* | [**comDayCqWcmCoreImplPagePageInfoAggregatorImpl**](OASConfigmgrApi.md#comDayCqWcmCoreImplPagePageInfoAggregatorImpl) | **POST** /system/console/configMgr/com.day.cq.wcm.core.impl.page.PageInfoAggregatorImpl | 
*OASConfigmgrApi* | [**comDayCqWcmCoreImplPagePageManagerFactoryImpl**](OASConfigmgrApi.md#comDayCqWcmCoreImplPagePageManagerFactoryImpl) | **POST** /system/console/configMgr/com.day.cq.wcm.core.impl.page.PageManagerFactoryImpl | 
*OASConfigmgrApi* | [**comDayCqWcmCoreImplReferencesContentContentReferenceConfig**](OASConfigmgrApi.md#comDayCqWcmCoreImplReferencesContentContentReferenceConfig) | **POST** /system/console/configMgr/com.day.cq.wcm.core.impl.references.content.ContentReferenceConfig | 
*OASConfigmgrApi* | [**comDayCqWcmCoreImplServletsContentfinderAssetViewHandler**](OASConfigmgrApi.md#comDayCqWcmCoreImplServletsContentfinderAssetViewHandler) | **POST** /system/console/configMgr/com.day.cq.wcm.core.impl.servlets.contentfinder.AssetViewHandler | 
*OASConfigmgrApi* | [**comDayCqWcmCoreImplServletsContentfinderConnectorConnectorVie**](OASConfigmgrApi.md#comDayCqWcmCoreImplServletsContentfinderConnectorConnectorVie) | **POST** /system/console/configMgr/com.day.cq.wcm.core.impl.servlets.contentfinder.connector.ConnectorViewHandler | 
*OASConfigmgrApi* | [**comDayCqWcmCoreImplServletsContentfinderPageViewHandler**](OASConfigmgrApi.md#comDayCqWcmCoreImplServletsContentfinderPageViewHandler) | **POST** /system/console/configMgr/com.day.cq.wcm.core.impl.servlets.contentfinder.PageViewHandler | 
*OASConfigmgrApi* | [**comDayCqWcmCoreImplServletsFindReplaceServlet**](OASConfigmgrApi.md#comDayCqWcmCoreImplServletsFindReplaceServlet) | **POST** /system/console/configMgr/com.day.cq.wcm.core.impl.servlets.FindReplaceServlet | 
*OASConfigmgrApi* | [**comDayCqWcmCoreImplServletsReferenceSearchServlet**](OASConfigmgrApi.md#comDayCqWcmCoreImplServletsReferenceSearchServlet) | **POST** /system/console/configMgr/com.day.cq.wcm.core.impl.servlets.ReferenceSearchServlet | 
*OASConfigmgrApi* | [**comDayCqWcmCoreImplServletsThumbnailServlet**](OASConfigmgrApi.md#comDayCqWcmCoreImplServletsThumbnailServlet) | **POST** /system/console/configMgr/com.day.cq.wcm.core.impl.servlets.ThumbnailServlet | 
*OASConfigmgrApi* | [**comDayCqWcmCoreImplUtilsDefaultPageNameValidator**](OASConfigmgrApi.md#comDayCqWcmCoreImplUtilsDefaultPageNameValidator) | **POST** /system/console/configMgr/com.day.cq.wcm.core.impl.utils.DefaultPageNameValidator | 
*OASConfigmgrApi* | [**comDayCqWcmCoreImplVariantsPageVariantsProviderImpl**](OASConfigmgrApi.md#comDayCqWcmCoreImplVariantsPageVariantsProviderImpl) | **POST** /system/console/configMgr/com.day.cq.wcm.core.impl.variants.PageVariantsProviderImpl | 
*OASConfigmgrApi* | [**comDayCqWcmCoreImplVersionManagerImpl**](OASConfigmgrApi.md#comDayCqWcmCoreImplVersionManagerImpl) | **POST** /system/console/configMgr/com.day.cq.wcm.core.impl.VersionManagerImpl | 
*OASConfigmgrApi* | [**comDayCqWcmCoreImplVersionPurgeTask**](OASConfigmgrApi.md#comDayCqWcmCoreImplVersionPurgeTask) | **POST** /system/console/configMgr/com.day.cq.wcm.core.impl.VersionPurgeTask | 
*OASConfigmgrApi* | [**comDayCqWcmCoreImplWCMDebugFilter**](OASConfigmgrApi.md#comDayCqWcmCoreImplWCMDebugFilter) | **POST** /system/console/configMgr/com.day.cq.wcm.core.impl.WCMDebugFilter | 
*OASConfigmgrApi* | [**comDayCqWcmCoreImplWCMDeveloperModeFilter**](OASConfigmgrApi.md#comDayCqWcmCoreImplWCMDeveloperModeFilter) | **POST** /system/console/configMgr/com.day.cq.wcm.core.impl.WCMDeveloperModeFilter | 
*OASConfigmgrApi* | [**comDayCqWcmCoreImplWarpTimeWarpFilter**](OASConfigmgrApi.md#comDayCqWcmCoreImplWarpTimeWarpFilter) | **POST** /system/console/configMgr/com.day.cq.wcm.core.impl.warp.TimeWarpFilter | 
*OASConfigmgrApi* | [**comDayCqWcmCoreMvtMVTStatisticsImpl**](OASConfigmgrApi.md#comDayCqWcmCoreMvtMVTStatisticsImpl) | **POST** /system/console/configMgr/com.day.cq.wcm.core.mvt.MVTStatisticsImpl | 
*OASConfigmgrApi* | [**comDayCqWcmCoreStatsPageViewStatisticsImpl**](OASConfigmgrApi.md#comDayCqWcmCoreStatsPageViewStatisticsImpl) | **POST** /system/console/configMgr/com.day.cq.wcm.core.stats.PageViewStatisticsImpl | 
*OASConfigmgrApi* | [**comDayCqWcmCoreWCMRequestFilter**](OASConfigmgrApi.md#comDayCqWcmCoreWCMRequestFilter) | **POST** /system/console/configMgr/com.day.cq.wcm.core.WCMRequestFilter | 
*OASConfigmgrApi* | [**comDayCqWcmDesignimporterDesignPackageImporter**](OASConfigmgrApi.md#comDayCqWcmDesignimporterDesignPackageImporter) | **POST** /system/console/configMgr/com.day.cq.wcm.designimporter.DesignPackageImporter | 
*OASConfigmgrApi* | [**comDayCqWcmDesignimporterImplCanvasBuilderImpl**](OASConfigmgrApi.md#comDayCqWcmDesignimporterImplCanvasBuilderImpl) | **POST** /system/console/configMgr/com.day.cq.wcm.designimporter.impl.CanvasBuilderImpl | 
*OASConfigmgrApi* | [**comDayCqWcmDesignimporterImplCanvasPageDeleteHandler**](OASConfigmgrApi.md#comDayCqWcmDesignimporterImplCanvasPageDeleteHandler) | **POST** /system/console/configMgr/com.day.cq.wcm.designimporter.impl.CanvasPageDeleteHandler | 
*OASConfigmgrApi* | [**comDayCqWcmDesignimporterImplEntryPreprocessorImpl**](OASConfigmgrApi.md#comDayCqWcmDesignimporterImplEntryPreprocessorImpl) | **POST** /system/console/configMgr/com.day.cq.wcm.designimporter.impl.EntryPreprocessorImpl | 
*OASConfigmgrApi* | [**comDayCqWcmDesignimporterImplMobileCanvasBuilderImpl**](OASConfigmgrApi.md#comDayCqWcmDesignimporterImplMobileCanvasBuilderImpl) | **POST** /system/console/configMgr/com.day.cq.wcm.designimporter.impl.MobileCanvasBuilderImpl | 
*OASConfigmgrApi* | [**comDayCqWcmDesignimporterParserTaghandlersFactoryCanvasCompone**](OASConfigmgrApi.md#comDayCqWcmDesignimporterParserTaghandlersFactoryCanvasCompone) | **POST** /system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.CanvasComponentTagHandlerFactory | 
*OASConfigmgrApi* | [**comDayCqWcmDesignimporterParserTaghandlersFactoryDefaultCompon**](OASConfigmgrApi.md#comDayCqWcmDesignimporterParserTaghandlersFactoryDefaultCompon) | **POST** /system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.DefaultComponentTagHandlerFactory | 
*OASConfigmgrApi* | [**comDayCqWcmDesignimporterParserTaghandlersFactoryDefaultTagHan**](OASConfigmgrApi.md#comDayCqWcmDesignimporterParserTaghandlersFactoryDefaultTagHan) | **POST** /system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.DefaultTagHandlerFactory | 
*OASConfigmgrApi* | [**comDayCqWcmDesignimporterParserTaghandlersFactoryHeadTagHandle**](OASConfigmgrApi.md#comDayCqWcmDesignimporterParserTaghandlersFactoryHeadTagHandle) | **POST** /system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.HeadTagHandlerFactory | 
*OASConfigmgrApi* | [**comDayCqWcmDesignimporterParserTaghandlersFactoryIFrameTagHand**](OASConfigmgrApi.md#comDayCqWcmDesignimporterParserTaghandlersFactoryIFrameTagHand) | **POST** /system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.IFrameTagHandlerFactory | 
*OASConfigmgrApi* | [**comDayCqWcmDesignimporterParserTaghandlersFactoryImageComponen**](OASConfigmgrApi.md#comDayCqWcmDesignimporterParserTaghandlersFactoryImageComponen) | **POST** /system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.ImageComponentTagHandlerFactory | 
*OASConfigmgrApi* | [**comDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandler**](OASConfigmgrApi.md#comDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandler) | **POST** /system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.ImgTagHandlerFactory | 
*OASConfigmgrApi* | [**comDayCqWcmDesignimporterParserTaghandlersFactoryInlineScriptT**](OASConfigmgrApi.md#comDayCqWcmDesignimporterParserTaghandlersFactoryInlineScriptT) | **POST** /system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.InlineScriptTagHandlerFactory | 
*OASConfigmgrApi* | [**comDayCqWcmDesignimporterParserTaghandlersFactoryLinkTagHandle**](OASConfigmgrApi.md#comDayCqWcmDesignimporterParserTaghandlersFactoryLinkTagHandle) | **POST** /system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.LinkTagHandlerFactory | 
*OASConfigmgrApi* | [**comDayCqWcmDesignimporterParserTaghandlersFactoryMetaTagHandle**](OASConfigmgrApi.md#comDayCqWcmDesignimporterParserTaghandlersFactoryMetaTagHandle) | **POST** /system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.MetaTagHandlerFactory | 
*OASConfigmgrApi* | [**comDayCqWcmDesignimporterParserTaghandlersFactoryNonScriptTagH**](OASConfigmgrApi.md#comDayCqWcmDesignimporterParserTaghandlersFactoryNonScriptTagH) | **POST** /system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.NonScriptTagHandlerFactory | 
*OASConfigmgrApi* | [**comDayCqWcmDesignimporterParserTaghandlersFactoryParsysCompone**](OASConfigmgrApi.md#comDayCqWcmDesignimporterParserTaghandlersFactoryParsysCompone) | **POST** /system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.ParsysComponentTagHandlerFactory | 
*OASConfigmgrApi* | [**comDayCqWcmDesignimporterParserTaghandlersFactoryScriptTagHand**](OASConfigmgrApi.md#comDayCqWcmDesignimporterParserTaghandlersFactoryScriptTagHand) | **POST** /system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.ScriptTagHandlerFactory | 
*OASConfigmgrApi* | [**comDayCqWcmDesignimporterParserTaghandlersFactoryStyleTagHandl**](OASConfigmgrApi.md#comDayCqWcmDesignimporterParserTaghandlersFactoryStyleTagHandl) | **POST** /system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.StyleTagHandlerFactory | 
*OASConfigmgrApi* | [**comDayCqWcmDesignimporterParserTaghandlersFactoryTextComponent**](OASConfigmgrApi.md#comDayCqWcmDesignimporterParserTaghandlersFactoryTextComponent) | **POST** /system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.TextComponentTagHandlerFactory | 
*OASConfigmgrApi* | [**comDayCqWcmDesignimporterParserTaghandlersFactoryTitleComponen**](OASConfigmgrApi.md#comDayCqWcmDesignimporterParserTaghandlersFactoryTitleComponen) | **POST** /system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.TitleComponentTagHandlerFactory | 
*OASConfigmgrApi* | [**comDayCqWcmDesignimporterParserTaghandlersFactoryTitleTagHandl**](OASConfigmgrApi.md#comDayCqWcmDesignimporterParserTaghandlersFactoryTitleTagHandl) | **POST** /system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.TitleTagHandlerFactory | 
*OASConfigmgrApi* | [**comDayCqWcmFoundationFormsImplFormChooserServlet**](OASConfigmgrApi.md#comDayCqWcmFoundationFormsImplFormChooserServlet) | **POST** /system/console/configMgr/com.day.cq.wcm.foundation.forms.impl.FormChooserServlet | 
*OASConfigmgrApi* | [**comDayCqWcmFoundationFormsImplFormParagraphPostProcessor**](OASConfigmgrApi.md#comDayCqWcmFoundationFormsImplFormParagraphPostProcessor) | **POST** /system/console/configMgr/com.day.cq.wcm.foundation.forms.impl.FormParagraphPostProcessor | 
*OASConfigmgrApi* | [**comDayCqWcmFoundationFormsImplFormsHandlingServlet**](OASConfigmgrApi.md#comDayCqWcmFoundationFormsImplFormsHandlingServlet) | **POST** /system/console/configMgr/com.day.cq.wcm.foundation.forms.impl.FormsHandlingServlet | 
*OASConfigmgrApi* | [**comDayCqWcmFoundationFormsImplMailServlet**](OASConfigmgrApi.md#comDayCqWcmFoundationFormsImplMailServlet) | **POST** /system/console/configMgr/com.day.cq.wcm.foundation.forms.impl.MailServlet | 
*OASConfigmgrApi* | [**comDayCqWcmFoundationImplAdaptiveImageComponentServlet**](OASConfigmgrApi.md#comDayCqWcmFoundationImplAdaptiveImageComponentServlet) | **POST** /system/console/configMgr/com.day.cq.wcm.foundation.impl.AdaptiveImageComponentServlet | 
*OASConfigmgrApi* | [**comDayCqWcmFoundationImplHTTPAuthHandler**](OASConfigmgrApi.md#comDayCqWcmFoundationImplHTTPAuthHandler) | **POST** /system/console/configMgr/com.day.cq.wcm.foundation.impl.HTTPAuthHandler | 
*OASConfigmgrApi* | [**comDayCqWcmFoundationImplPageImpressionsTracker**](OASConfigmgrApi.md#comDayCqWcmFoundationImplPageImpressionsTracker) | **POST** /system/console/configMgr/com.day.cq.wcm.foundation.impl.PageImpressionsTracker | 
*OASConfigmgrApi* | [**comDayCqWcmFoundationImplPageRedirectServlet**](OASConfigmgrApi.md#comDayCqWcmFoundationImplPageRedirectServlet) | **POST** /system/console/configMgr/com.day.cq.wcm.foundation.impl.PageRedirectServlet | 
*OASConfigmgrApi* | [**comDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklist**](OASConfigmgrApi.md#comDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklist) | **POST** /system/console/configMgr/com.day.cq.wcm.foundation.security.impl.DefaultAttachmentTypeBlacklistService | 
*OASConfigmgrApi* | [**comDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImpl**](OASConfigmgrApi.md#comDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImpl) | **POST** /system/console/configMgr/com.day.cq.wcm.foundation.security.impl.SaferSlingPostValidatorImpl | 
*OASConfigmgrApi* | [**comDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactory**](OASConfigmgrApi.md#comDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactory) | **POST** /system/console/configMgr/com.day.cq.wcm.mobile.core.impl.device.DeviceInfoTransformerFactory | 
*OASConfigmgrApi* | [**comDayCqWcmMobileCoreImplRedirectRedirectFilter**](OASConfigmgrApi.md#comDayCqWcmMobileCoreImplRedirectRedirectFilter) | **POST** /system/console/configMgr/com.day.cq.wcm.mobile.core.impl.redirect.RedirectFilter | 
*OASConfigmgrApi* | [**comDayCqWcmMsmImplActionsContentCopyActionFactory**](OASConfigmgrApi.md#comDayCqWcmMsmImplActionsContentCopyActionFactory) | **POST** /system/console/configMgr/com.day.cq.wcm.msm.impl.actions.ContentCopyActionFactory | 
*OASConfigmgrApi* | [**comDayCqWcmMsmImplActionsContentDeleteActionFactory**](OASConfigmgrApi.md#comDayCqWcmMsmImplActionsContentDeleteActionFactory) | **POST** /system/console/configMgr/com.day.cq.wcm.msm.impl.actions.ContentDeleteActionFactory | 
*OASConfigmgrApi* | [**comDayCqWcmMsmImplActionsContentUpdateActionFactory**](OASConfigmgrApi.md#comDayCqWcmMsmImplActionsContentUpdateActionFactory) | **POST** /system/console/configMgr/com.day.cq.wcm.msm.impl.actions.ContentUpdateActionFactory | 
*OASConfigmgrApi* | [**comDayCqWcmMsmImplActionsOrderChildrenActionFactory**](OASConfigmgrApi.md#comDayCqWcmMsmImplActionsOrderChildrenActionFactory) | **POST** /system/console/configMgr/com.day.cq.wcm.msm.impl.actions.OrderChildrenActionFactory | 
*OASConfigmgrApi* | [**comDayCqWcmMsmImplActionsPageMoveActionFactory**](OASConfigmgrApi.md#comDayCqWcmMsmImplActionsPageMoveActionFactory) | **POST** /system/console/configMgr/com.day.cq.wcm.msm.impl.actions.PageMoveActionFactory | 
*OASConfigmgrApi* | [**comDayCqWcmMsmImplActionsReferencesUpdateActionFactory**](OASConfigmgrApi.md#comDayCqWcmMsmImplActionsReferencesUpdateActionFactory) | **POST** /system/console/configMgr/com.day.cq.wcm.msm.impl.actions.ReferencesUpdateActionFactory | 
*OASConfigmgrApi* | [**comDayCqWcmMsmImplActionsVersionCopyActionFactory**](OASConfigmgrApi.md#comDayCqWcmMsmImplActionsVersionCopyActionFactory) | **POST** /system/console/configMgr/com.day.cq.wcm.msm.impl.actions.VersionCopyActionFactory | 
*OASConfigmgrApi* | [**comDayCqWcmMsmImplLiveRelationshipManagerImpl**](OASConfigmgrApi.md#comDayCqWcmMsmImplLiveRelationshipManagerImpl) | **POST** /system/console/configMgr/com.day.cq.wcm.msm.impl.LiveRelationshipManagerImpl | 
*OASConfigmgrApi* | [**comDayCqWcmMsmImplRolloutManagerImpl**](OASConfigmgrApi.md#comDayCqWcmMsmImplRolloutManagerImpl) | **POST** /system/console/configMgr/com.day.cq.wcm.msm.impl.RolloutManagerImpl | 
*OASConfigmgrApi* | [**comDayCqWcmMsmImplServletsAuditLogServlet**](OASConfigmgrApi.md#comDayCqWcmMsmImplServletsAuditLogServlet) | **POST** /system/console/configMgr/com.day.cq.wcm.msm.impl.servlets.AuditLogServlet | 
*OASConfigmgrApi* | [**comDayCqWcmNotificationEmailImplEmailChannel**](OASConfigmgrApi.md#comDayCqWcmNotificationEmailImplEmailChannel) | **POST** /system/console/configMgr/com.day.cq.wcm.notification.email.impl.EmailChannel | 
*OASConfigmgrApi* | [**comDayCqWcmNotificationImplNotificationManagerImpl**](OASConfigmgrApi.md#comDayCqWcmNotificationImplNotificationManagerImpl) | **POST** /system/console/configMgr/com.day.cq.wcm.notification.impl.NotificationManagerImpl | 
*OASConfigmgrApi* | [**comDayCqWcmScriptingImplBVPManager**](OASConfigmgrApi.md#comDayCqWcmScriptingImplBVPManager) | **POST** /system/console/configMgr/com.day.cq.wcm.scripting.impl.BVPManager | 
*OASConfigmgrApi* | [**comDayCqWcmUndoUndoConfig**](OASConfigmgrApi.md#comDayCqWcmUndoUndoConfig) | **POST** /system/console/configMgr/com.day.cq.wcm.undo.UndoConfig | 
*OASConfigmgrApi* | [**comDayCqWcmWebservicesupportImplReplicationEventListener**](OASConfigmgrApi.md#comDayCqWcmWebservicesupportImplReplicationEventListener) | **POST** /system/console/configMgr/com.day.cq.wcm.webservicesupport.impl.ReplicationEventListener | 
*OASConfigmgrApi* | [**comDayCqWcmWorkflowImplWcmWorkflowServiceImpl**](OASConfigmgrApi.md#comDayCqWcmWorkflowImplWcmWorkflowServiceImpl) | **POST** /system/console/configMgr/com.day.cq.wcm.workflow.impl.WcmWorkflowServiceImpl | 
*OASConfigmgrApi* | [**comDayCqWcmWorkflowImplWorkflowPackageInfoProvider**](OASConfigmgrApi.md#comDayCqWcmWorkflowImplWorkflowPackageInfoProvider) | **POST** /system/console/configMgr/com.day.cq.wcm.workflow.impl.WorkflowPackageInfoProvider | 
*OASConfigmgrApi* | [**comDayCqWidgetImplHtmlLibraryManagerImpl**](OASConfigmgrApi.md#comDayCqWidgetImplHtmlLibraryManagerImpl) | **POST** /system/console/configMgr/com.day.cq.widget.impl.HtmlLibraryManagerImpl | 
*OASConfigmgrApi* | [**comDayCqWidgetImplWidgetExtensionProviderImpl**](OASConfigmgrApi.md#comDayCqWidgetImplWidgetExtensionProviderImpl) | **POST** /system/console/configMgr/com.day.cq.widget.impl.WidgetExtensionProviderImpl | 
*OASConfigmgrApi* | [**comDayCqWorkflowImplEmailEMailNotificationService**](OASConfigmgrApi.md#comDayCqWorkflowImplEmailEMailNotificationService) | **POST** /system/console/configMgr/com.day.cq.workflow.impl.email.EMailNotificationService | 
*OASConfigmgrApi* | [**comDayCqWorkflowImplEmailTaskEMailNotificationService**](OASConfigmgrApi.md#comDayCqWorkflowImplEmailTaskEMailNotificationService) | **POST** /system/console/configMgr/com.day.cq.workflow.impl.email.TaskEMailNotificationService | 
*OASConfigmgrApi* | [**comDayCrxSecurityTokenImplImplTokenAuthenticationHandler**](OASConfigmgrApi.md#comDayCrxSecurityTokenImplImplTokenAuthenticationHandler) | **POST** /system/console/configMgr/com.day.crx.security.token.impl.impl.TokenAuthenticationHandler | 
*OASConfigmgrApi* | [**comDayCrxSecurityTokenImplTokenCleanupTask**](OASConfigmgrApi.md#comDayCrxSecurityTokenImplTokenCleanupTask) | **POST** /system/console/configMgr/com.day.crx.security.token.impl.TokenCleanupTask | 
*OASConfigmgrApi* | [**guideLocalizationService**](OASConfigmgrApi.md#guideLocalizationService) | **POST** /system/console/configMgr/Guide Localization Service | 
*OASConfigmgrApi* | [**messagingUserComponentFactory**](OASConfigmgrApi.md#messagingUserComponentFactory) | **POST** /system/console/configMgr/MessagingUserComponentFactory | 
*OASConfigmgrApi* | [**orgApacheAriesJmxFrameworkStateConfig**](OASConfigmgrApi.md#orgApacheAriesJmxFrameworkStateConfig) | **POST** /system/console/configMgr/org.apache.aries.jmx.framework.StateConfig | 
*OASConfigmgrApi* | [**orgApacheFelixEventadminImplEventAdmin**](OASConfigmgrApi.md#orgApacheFelixEventadminImplEventAdmin) | **POST** /system/console/configMgr/org.apache.felix.eventadmin.impl.EventAdmin | 
*OASConfigmgrApi* | [**orgApacheFelixHttp**](OASConfigmgrApi.md#orgApacheFelixHttp) | **POST** /system/console/configMgr/org.apache.felix.http | 
*OASConfigmgrApi* | [**orgApacheFelixHttpSslfilterSslFilter**](OASConfigmgrApi.md#orgApacheFelixHttpSslfilterSslFilter) | **POST** /system/console/configMgr/org.apache.felix.http.sslfilter.SslFilter | 
*OASConfigmgrApi* | [**orgApacheFelixJaasConfigurationFactory**](OASConfigmgrApi.md#orgApacheFelixJaasConfigurationFactory) | **POST** /system/console/configMgr/org.apache.felix.jaas.Configuration.factory | 
*OASConfigmgrApi* | [**orgApacheFelixJaasConfigurationSpi**](OASConfigmgrApi.md#orgApacheFelixJaasConfigurationSpi) | **POST** /system/console/configMgr/org.apache.felix.jaas.ConfigurationSpi | 
*OASConfigmgrApi* | [**orgApacheFelixScrScrService**](OASConfigmgrApi.md#orgApacheFelixScrScrService) | **POST** /system/console/configMgr/org.apache.felix.scr.ScrService | 
*OASConfigmgrApi* | [**orgApacheFelixSystemreadyImplComponentsCheck**](OASConfigmgrApi.md#orgApacheFelixSystemreadyImplComponentsCheck) | **POST** /system/console/configMgr/org.apache.felix.systemready.impl.ComponentsCheck | 
*OASConfigmgrApi* | [**orgApacheFelixSystemreadyImplFrameworkStartCheck**](OASConfigmgrApi.md#orgApacheFelixSystemreadyImplFrameworkStartCheck) | **POST** /system/console/configMgr/org.apache.felix.systemready.impl.FrameworkStartCheck | 
*OASConfigmgrApi* | [**orgApacheFelixSystemreadyImplServicesCheck**](OASConfigmgrApi.md#orgApacheFelixSystemreadyImplServicesCheck) | **POST** /system/console/configMgr/org.apache.felix.systemready.impl.ServicesCheck | 
*OASConfigmgrApi* | [**orgApacheFelixSystemreadyImplServletSystemAliveServlet**](OASConfigmgrApi.md#orgApacheFelixSystemreadyImplServletSystemAliveServlet) | **POST** /system/console/configMgr/org.apache.felix.systemready.impl.servlet.SystemAliveServlet | 
*OASConfigmgrApi* | [**orgApacheFelixSystemreadyImplServletSystemReadyServlet**](OASConfigmgrApi.md#orgApacheFelixSystemreadyImplServletSystemReadyServlet) | **POST** /system/console/configMgr/org.apache.felix.systemready.impl.servlet.SystemReadyServlet | 
*OASConfigmgrApi* | [**orgApacheFelixSystemreadySystemReadyMonitor**](OASConfigmgrApi.md#orgApacheFelixSystemreadySystemReadyMonitor) | **POST** /system/console/configMgr/org.apache.felix.systemready.SystemReadyMonitor | 
*OASConfigmgrApi* | [**orgApacheFelixWebconsoleInternalServletOsgiManager**](OASConfigmgrApi.md#orgApacheFelixWebconsoleInternalServletOsgiManager) | **POST** /system/console/configMgr/org.apache.felix.webconsole.internal.servlet.OsgiManager | 
*OASConfigmgrApi* | [**orgApacheFelixWebconsolePluginsEventInternalPluginServlet**](OASConfigmgrApi.md#orgApacheFelixWebconsolePluginsEventInternalPluginServlet) | **POST** /system/console/configMgr/org.apache.felix.webconsole.plugins.event.internal.PluginServlet | 
*OASConfigmgrApi* | [**orgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCo**](OASConfigmgrApi.md#orgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCo) | **POST** /system/console/configMgr/org.apache.felix.webconsole.plugins.memoryusage.internal.MemoryUsageConfigurator | 
*OASConfigmgrApi* | [**orgApacheHttpProxyconfigurator**](OASConfigmgrApi.md#orgApacheHttpProxyconfigurator) | **POST** /system/console/configMgr/org.apache.http.proxyconfigurator | 
*OASConfigmgrApi* | [**orgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProvider**](OASConfigmgrApi.md#orgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProvider) | **POST** /system/console/configMgr/org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreTextProviderService | 
*OASConfigmgrApi* | [**orgApacheJackrabbitOakPluginsBlobDatastoreFileDataStore**](OASConfigmgrApi.md#orgApacheJackrabbitOakPluginsBlobDatastoreFileDataStore) | **POST** /system/console/configMgr/org.apache.jackrabbit.oak.plugins.blob.datastore.FileDataStore | 
*OASConfigmgrApi* | [**orgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreService**](OASConfigmgrApi.md#orgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreService) | **POST** /system/console/configMgr/org.apache.jackrabbit.oak.plugins.document.DocumentNodeStoreService | 
*OASConfigmgrApi* | [**orgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePre**](OASConfigmgrApi.md#orgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePre) | **POST** /system/console/configMgr/org.apache.jackrabbit.oak.plugins.document.DocumentNodeStoreServicePreset | 
*OASConfigmgrApi* | [**orgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCac**](OASConfigmgrApi.md#orgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCac) | **POST** /system/console/configMgr/org.apache.jackrabbit.oak.plugins.document.secondary.SecondaryStoreCacheService | 
*OASConfigmgrApi* | [**orgApacheJackrabbitOakPluginsIndexAsyncIndexerService**](OASConfigmgrApi.md#orgApacheJackrabbitOakPluginsIndexAsyncIndexerService) | **POST** /system/console/configMgr/org.apache.jackrabbit.oak.plugins.index.AsyncIndexerService | 
*OASConfigmgrApi* | [**orgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServ**](OASConfigmgrApi.md#orgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServ) | **POST** /system/console/configMgr/org.apache.jackrabbit.oak.plugins.index.lucene.LuceneIndexProviderService | 
*OASConfigmgrApi* | [**orgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCo**](OASConfigmgrApi.md#orgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCo) | **POST** /system/console/configMgr/org.apache.jackrabbit.oak.plugins.index.solr.osgi.EmbeddedSolrServerConfigurationProvider | 
*OASConfigmgrApi* | [**orgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServers**](OASConfigmgrApi.md#orgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServers) | **POST** /system/console/configMgr/org.apache.jackrabbit.oak.plugins.index.solr.osgi.NodeStateSolrServersObserverService | 
*OASConfigmgrApi* | [**orgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfiguration**](OASConfigmgrApi.md#orgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfiguration) | **POST** /system/console/configMgr/org.apache.jackrabbit.oak.plugins.index.solr.osgi.OakSolrConfigurationProviderService | 
*OASConfigmgrApi* | [**orgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConf**](OASConfigmgrApi.md#orgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConf) | **POST** /system/console/configMgr/org.apache.jackrabbit.oak.plugins.index.solr.osgi.RemoteSolrServerConfigurationProvider | 
*OASConfigmgrApi* | [**orgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvid**](OASConfigmgrApi.md#orgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvid) | **POST** /system/console/configMgr/org.apache.jackrabbit.oak.plugins.index.solr.osgi.SolrQueryIndexProviderService | 
*OASConfigmgrApi* | [**orgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSe**](OASConfigmgrApi.md#orgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSe) | **POST** /system/console/configMgr/org.apache.jackrabbit.oak.plugins.index.solr.osgi.SolrServerProviderService | 
*OASConfigmgrApi* | [**orgApacheJackrabbitOakPluginsMetricStatisticsProviderFactory**](OASConfigmgrApi.md#orgApacheJackrabbitOakPluginsMetricStatisticsProviderFactory) | **POST** /system/console/configMgr/org.apache.jackrabbit.oak.plugins.metric.StatisticsProviderFactory | 
*OASConfigmgrApi* | [**orgApacheJackrabbitOakPluginsObservationChangeCollectorProvider**](OASConfigmgrApi.md#orgApacheJackrabbitOakPluginsObservationChangeCollectorProvider) | **POST** /system/console/configMgr/org.apache.jackrabbit.oak.plugins.observation.ChangeCollectorProvider | 
*OASConfigmgrApi* | [**orgApacheJackrabbitOakQueryQueryEngineSettingsService**](OASConfigmgrApi.md#orgApacheJackrabbitOakQueryQueryEngineSettingsService) | **POST** /system/console/configMgr/org.apache.jackrabbit.oak.query.QueryEngineSettingsService | 
*OASConfigmgrApi* | [**orgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfig**](OASConfigmgrApi.md#orgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfig) | **POST** /system/console/configMgr/org.apache.jackrabbit.oak.security.authentication.AuthenticationConfigurationImpl | 
*OASConfigmgrApi* | [**orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdenti**](OASConfigmgrApi.md#orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdenti) | **POST** /system/console/configMgr/org.apache.jackrabbit.oak.security.authentication.ldap.impl.LdapIdentityProvider | 
*OASConfigmgrApi* | [**orgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfigura**](OASConfigmgrApi.md#orgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfigura) | **POST** /system/console/configMgr/org.apache.jackrabbit.oak.security.authentication.token.TokenConfigurationImpl | 
*OASConfigmgrApi* | [**orgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigur**](OASConfigmgrApi.md#orgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigur) | **POST** /system/console/configMgr/org.apache.jackrabbit.oak.security.authorization.AuthorizationConfigurationImpl | 
*OASConfigmgrApi* | [**orgApacheJackrabbitOakSecurityInternalSecurityProviderRegistrati**](OASConfigmgrApi.md#orgApacheJackrabbitOakSecurityInternalSecurityProviderRegistrati) | **POST** /system/console/configMgr/org.apache.jackrabbit.oak.security.internal.SecurityProviderRegistration | 
*OASConfigmgrApi* | [**orgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeName**](OASConfigmgrApi.md#orgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeName) | **POST** /system/console/configMgr/org.apache.jackrabbit.oak.security.user.RandomAuthorizableNodeName | 
*OASConfigmgrApi* | [**orgApacheJackrabbitOakSecurityUserUserConfigurationImpl**](OASConfigmgrApi.md#orgApacheJackrabbitOakSecurityUserUserConfigurationImpl) | **POST** /system/console/configMgr/org.apache.jackrabbit.oak.security.user.UserConfigurationImpl | 
*OASConfigmgrApi* | [**orgApacheJackrabbitOakSegmentAzureAzureSegmentStoreService**](OASConfigmgrApi.md#orgApacheJackrabbitOakSegmentAzureAzureSegmentStoreService) | **POST** /system/console/configMgr/org.apache.jackrabbit.oak.segment.azure.AzureSegmentStoreService | 
*OASConfigmgrApi* | [**orgApacheJackrabbitOakSegmentSegmentNodeStoreFactory**](OASConfigmgrApi.md#orgApacheJackrabbitOakSegmentSegmentNodeStoreFactory) | **POST** /system/console/configMgr/org.apache.jackrabbit.oak.segment.SegmentNodeStoreFactory | 
*OASConfigmgrApi* | [**orgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorService**](OASConfigmgrApi.md#orgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorService) | **POST** /system/console/configMgr/org.apache.jackrabbit.oak.segment.SegmentNodeStoreMonitorService | 
*OASConfigmgrApi* | [**orgApacheJackrabbitOakSegmentSegmentNodeStoreService**](OASConfigmgrApi.md#orgApacheJackrabbitOakSegmentSegmentNodeStoreService) | **POST** /system/console/configMgr/org.apache.jackrabbit.oak.segment.SegmentNodeStoreService | 
*OASConfigmgrApi* | [**orgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreService**](OASConfigmgrApi.md#orgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreService) | **POST** /system/console/configMgr/org.apache.jackrabbit.oak.segment.standby.store.StandbyStoreService | 
*OASConfigmgrApi* | [**orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDe**](OASConfigmgrApi.md#orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDe) | **POST** /system/console/configMgr/org.apache.jackrabbit.oak.spi.security.authentication.external.impl.DefaultSyncHandler | 
*OASConfigmgrApi* | [**orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplEx**](OASConfigmgrApi.md#orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplEx) | **POST** /system/console/configMgr/org.apache.jackrabbit.oak.spi.security.authentication.external.impl.ExternalLoginModuleFactory | 
*OASConfigmgrApi* | [**orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPr**](OASConfigmgrApi.md#orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPr) | **POST** /system/console/configMgr/org.apache.jackrabbit.oak.spi.security.authentication.external.impl.principal.ExternalPrincipalConfiguration | 
*OASConfigmgrApi* | [**orgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfi**](OASConfigmgrApi.md#orgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfi) | **POST** /system/console/configMgr/org.apache.jackrabbit.oak.spi.security.authorization.cug.impl.CugConfiguration | 
*OASConfigmgrApi* | [**orgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExclu**](OASConfigmgrApi.md#orgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExclu) | **POST** /system/console/configMgr/org.apache.jackrabbit.oak.spi.security.authorization.cug.impl.CugExcludeImpl | 
*OASConfigmgrApi* | [**orgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizable**](OASConfigmgrApi.md#orgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizable) | **POST** /system/console/configMgr/org.apache.jackrabbit.oak.spi.security.user.action.DefaultAuthorizableActionProvider | 
*OASConfigmgrApi* | [**orgApacheJackrabbitVaultPackagingImplPackagingImpl**](OASConfigmgrApi.md#orgApacheJackrabbitVaultPackagingImplPackagingImpl) | **POST** /system/console/configMgr/org.apache.jackrabbit.vault.packaging.impl.PackagingImpl | 
*OASConfigmgrApi* | [**orgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistry**](OASConfigmgrApi.md#orgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistry) | **POST** /system/console/configMgr/org.apache.jackrabbit.vault.packaging.registry.impl.FSPackageRegistry | 
*OASConfigmgrApi* | [**orgApacheSlingAuthCoreImplLogoutServlet**](OASConfigmgrApi.md#orgApacheSlingAuthCoreImplLogoutServlet) | **POST** /system/console/configMgr/org.apache.sling.auth.core.impl.LogoutServlet | 
*OASConfigmgrApi* | [**orgApacheSlingCaconfigImplConfigurationBindingsValueProvider**](OASConfigmgrApi.md#orgApacheSlingCaconfigImplConfigurationBindingsValueProvider) | **POST** /system/console/configMgr/org.apache.sling.caconfig.impl.ConfigurationBindingsValueProvider | 
*OASConfigmgrApi* | [**orgApacheSlingCaconfigImplConfigurationResolverImpl**](OASConfigmgrApi.md#orgApacheSlingCaconfigImplConfigurationResolverImpl) | **POST** /system/console/configMgr/org.apache.sling.caconfig.impl.ConfigurationResolverImpl | 
*OASConfigmgrApi* | [**orgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStra**](OASConfigmgrApi.md#orgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStra) | **POST** /system/console/configMgr/org.apache.sling.caconfig.impl.def.DefaultConfigurationInheritanceStrategy | 
*OASConfigmgrApi* | [**orgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStra**](OASConfigmgrApi.md#orgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStra) | **POST** /system/console/configMgr/org.apache.sling.caconfig.impl.def.DefaultConfigurationPersistenceStrategy | 
*OASConfigmgrApi* | [**orgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProvi**](OASConfigmgrApi.md#orgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProvi) | **POST** /system/console/configMgr/org.apache.sling.caconfig.impl.override.OsgiConfigurationOverrideProvider | 
*OASConfigmgrApi* | [**orgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOve**](OASConfigmgrApi.md#orgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOve) | **POST** /system/console/configMgr/org.apache.sling.caconfig.impl.override.SystemPropertyConfigurationOverrideProvider | 
*OASConfigmgrApi* | [**orgApacheSlingCaconfigManagementImplConfigurationManagementSetti**](OASConfigmgrApi.md#orgApacheSlingCaconfigManagementImplConfigurationManagementSetti) | **POST** /system/console/configMgr/org.apache.sling.caconfig.management.impl.ConfigurationManagementSettingsImpl | 
*OASConfigmgrApi* | [**orgApacheSlingCaconfigResourceImplDefDefaultConfigurationResour**](OASConfigmgrApi.md#orgApacheSlingCaconfigResourceImplDefDefaultConfigurationResour) | **POST** /system/console/configMgr/org.apache.sling.caconfig.resource.impl.def.DefaultConfigurationResourceResolvingStrategy | 
*OASConfigmgrApi* | [**orgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategy**](OASConfigmgrApi.md#orgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategy) | **POST** /system/console/configMgr/org.apache.sling.caconfig.resource.impl.def.DefaultContextPathStrategy | 
*OASConfigmgrApi* | [**orgApacheSlingCommonsHtmlInternalTagsoupHtmlParser**](OASConfigmgrApi.md#orgApacheSlingCommonsHtmlInternalTagsoupHtmlParser) | **POST** /system/console/configMgr/org.apache.sling.commons.html.internal.TagsoupHtmlParser | 
*OASConfigmgrApi* | [**orgApacheSlingCommonsLogLogManager**](OASConfigmgrApi.md#orgApacheSlingCommonsLogLogManager) | **POST** /system/console/configMgr/org.apache.sling.commons.log.LogManager | 
*OASConfigmgrApi* | [**orgApacheSlingCommonsLogLogManagerFactoryConfig**](OASConfigmgrApi.md#orgApacheSlingCommonsLogLogManagerFactoryConfig) | **POST** /system/console/configMgr/org.apache.sling.commons.log.LogManager.factory.config | 
*OASConfigmgrApi* | [**orgApacheSlingCommonsLogLogManagerFactoryWriter**](OASConfigmgrApi.md#orgApacheSlingCommonsLogLogManagerFactoryWriter) | **POST** /system/console/configMgr/org.apache.sling.commons.log.LogManager.factory.writer | 
*OASConfigmgrApi* | [**orgApacheSlingCommonsMetricsInternalLogReporter**](OASConfigmgrApi.md#orgApacheSlingCommonsMetricsInternalLogReporter) | **POST** /system/console/configMgr/org.apache.sling.commons.metrics.internal.LogReporter | 
*OASConfigmgrApi* | [**orgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporter**](OASConfigmgrApi.md#orgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporter) | **POST** /system/console/configMgr/org.apache.sling.commons.metrics.rrd4j.impl.CodahaleMetricsReporter | 
*OASConfigmgrApi* | [**orgApacheSlingCommonsMimeInternalMimeTypeServiceImpl**](OASConfigmgrApi.md#orgApacheSlingCommonsMimeInternalMimeTypeServiceImpl) | **POST** /system/console/configMgr/org.apache.sling.commons.mime.internal.MimeTypeServiceImpl | 
*OASConfigmgrApi* | [**orgApacheSlingCommonsSchedulerImplQuartzScheduler**](OASConfigmgrApi.md#orgApacheSlingCommonsSchedulerImplQuartzScheduler) | **POST** /system/console/configMgr/org.apache.sling.commons.scheduler.impl.QuartzScheduler | 
*OASConfigmgrApi* | [**orgApacheSlingCommonsSchedulerImplSchedulerHealthCheck**](OASConfigmgrApi.md#orgApacheSlingCommonsSchedulerImplSchedulerHealthCheck) | **POST** /system/console/configMgr/org.apache.sling.commons.scheduler.impl.SchedulerHealthCheck | 
*OASConfigmgrApi* | [**orgApacheSlingCommonsThreadsImplDefaultThreadPoolFactory**](OASConfigmgrApi.md#orgApacheSlingCommonsThreadsImplDefaultThreadPoolFactory) | **POST** /system/console/configMgr/org.apache.sling.commons.threads.impl.DefaultThreadPool.factory | 
*OASConfigmgrApi* | [**orgApacheSlingDatasourceDataSourceFactory**](OASConfigmgrApi.md#orgApacheSlingDatasourceDataSourceFactory) | **POST** /system/console/configMgr/org.apache.sling.datasource.DataSourceFactory | 
*OASConfigmgrApi* | [**orgApacheSlingDatasourceJNDIDataSourceFactory**](OASConfigmgrApi.md#orgApacheSlingDatasourceJNDIDataSourceFactory) | **POST** /system/console/configMgr/org.apache.sling.datasource.JNDIDataSourceFactory | 
*OASConfigmgrApi* | [**orgApacheSlingDiscoveryOakConfig**](OASConfigmgrApi.md#orgApacheSlingDiscoveryOakConfig) | **POST** /system/console/configMgr/org.apache.sling.discovery.oak.Config | 
*OASConfigmgrApi* | [**orgApacheSlingDiscoveryOakSynchronizedClocksHealthCheck**](OASConfigmgrApi.md#orgApacheSlingDiscoveryOakSynchronizedClocksHealthCheck) | **POST** /system/console/configMgr/org.apache.sling.discovery.oak.SynchronizedClocksHealthCheck | 
*OASConfigmgrApi* | [**orgApacheSlingDistributionAgentImplForwardDistributionAgentFacto**](OASConfigmgrApi.md#orgApacheSlingDistributionAgentImplForwardDistributionAgentFacto) | **POST** /system/console/configMgr/org.apache.sling.distribution.agent.impl.ForwardDistributionAgentFactory | 
*OASConfigmgrApi* | [**orgApacheSlingDistributionAgentImplPrivilegeDistributionRequestA**](OASConfigmgrApi.md#orgApacheSlingDistributionAgentImplPrivilegeDistributionRequestA) | **POST** /system/console/configMgr/org.apache.sling.distribution.agent.impl.PrivilegeDistributionRequestAuthorizationStrategyFactory | 
*OASConfigmgrApi* | [**orgApacheSlingDistributionAgentImplQueueDistributionAgentFactory**](OASConfigmgrApi.md#orgApacheSlingDistributionAgentImplQueueDistributionAgentFactory) | **POST** /system/console/configMgr/org.apache.sling.distribution.agent.impl.QueueDistributionAgentFactory | 
*OASConfigmgrApi* | [**orgApacheSlingDistributionAgentImplReverseDistributionAgentFacto**](OASConfigmgrApi.md#orgApacheSlingDistributionAgentImplReverseDistributionAgentFacto) | **POST** /system/console/configMgr/org.apache.sling.distribution.agent.impl.ReverseDistributionAgentFactory | 
*OASConfigmgrApi* | [**orgApacheSlingDistributionAgentImplSimpleDistributionAgentFactor**](OASConfigmgrApi.md#orgApacheSlingDistributionAgentImplSimpleDistributionAgentFactor) | **POST** /system/console/configMgr/org.apache.sling.distribution.agent.impl.SimpleDistributionAgentFactory | 
*OASConfigmgrApi* | [**orgApacheSlingDistributionAgentImplSyncDistributionAgentFactory**](OASConfigmgrApi.md#orgApacheSlingDistributionAgentImplSyncDistributionAgentFactory) | **POST** /system/console/configMgr/org.apache.sling.distribution.agent.impl.SyncDistributionAgentFactory | 
*OASConfigmgrApi* | [**orgApacheSlingDistributionMonitorDistributionQueueHealthCheck**](OASConfigmgrApi.md#orgApacheSlingDistributionMonitorDistributionQueueHealthCheck) | **POST** /system/console/configMgr/org.apache.sling.distribution.monitor.DistributionQueueHealthCheck | 
*OASConfigmgrApi* | [**orgApacheSlingDistributionPackagingImplExporterAgentDistributio**](OASConfigmgrApi.md#orgApacheSlingDistributionPackagingImplExporterAgentDistributio) | **POST** /system/console/configMgr/org.apache.sling.distribution.packaging.impl.exporter.AgentDistributionPackageExporterFactory | 
*OASConfigmgrApi* | [**orgApacheSlingDistributionPackagingImplExporterLocalDistributio**](OASConfigmgrApi.md#orgApacheSlingDistributionPackagingImplExporterLocalDistributio) | **POST** /system/console/configMgr/org.apache.sling.distribution.packaging.impl.exporter.LocalDistributionPackageExporterFactory | 
*OASConfigmgrApi* | [**orgApacheSlingDistributionPackagingImplExporterRemoteDistributi**](OASConfigmgrApi.md#orgApacheSlingDistributionPackagingImplExporterRemoteDistributi) | **POST** /system/console/configMgr/org.apache.sling.distribution.packaging.impl.exporter.RemoteDistributionPackageExporterFactory | 
*OASConfigmgrApi* | [**orgApacheSlingDistributionPackagingImplImporterLocalDistributio**](OASConfigmgrApi.md#orgApacheSlingDistributionPackagingImplImporterLocalDistributio) | **POST** /system/console/configMgr/org.apache.sling.distribution.packaging.impl.importer.LocalDistributionPackageImporterFactory | 
*OASConfigmgrApi* | [**orgApacheSlingDistributionPackagingImplImporterRemoteDistributi**](OASConfigmgrApi.md#orgApacheSlingDistributionPackagingImplImporterRemoteDistributi) | **POST** /system/console/configMgr/org.apache.sling.distribution.packaging.impl.importer.RemoteDistributionPackageImporterFactory | 
*OASConfigmgrApi* | [**orgApacheSlingDistributionPackagingImplImporterRepositoryDistri**](OASConfigmgrApi.md#orgApacheSlingDistributionPackagingImplImporterRepositoryDistri) | **POST** /system/console/configMgr/org.apache.sling.distribution.packaging.impl.importer.RepositoryDistributionPackageImporterFactory | 
*OASConfigmgrApi* | [**orgApacheSlingDistributionResourcesImplDistributionConfiguration**](OASConfigmgrApi.md#orgApacheSlingDistributionResourcesImplDistributionConfiguration) | **POST** /system/console/configMgr/org.apache.sling.distribution.resources.impl.DistributionConfigurationResourceProviderFactory | 
*OASConfigmgrApi* | [**orgApacheSlingDistributionResourcesImplDistributionServiceResour**](OASConfigmgrApi.md#orgApacheSlingDistributionResourcesImplDistributionServiceResour) | **POST** /system/console/configMgr/org.apache.sling.distribution.resources.impl.DistributionServiceResourceProviderFactory | 
*OASConfigmgrApi* | [**orgApacheSlingDistributionSerializationImplDistributionPackageBu**](OASConfigmgrApi.md#orgApacheSlingDistributionSerializationImplDistributionPackageBu) | **POST** /system/console/configMgr/org.apache.sling.distribution.serialization.impl.DistributionPackageBuilderFactory | 
*OASConfigmgrApi* | [**orgApacheSlingDistributionSerializationImplVltVaultDistribution**](OASConfigmgrApi.md#orgApacheSlingDistributionSerializationImplVltVaultDistribution) | **POST** /system/console/configMgr/org.apache.sling.distribution.serialization.impl.vlt.VaultDistributionPackageBuilderFactory | 
*OASConfigmgrApi* | [**orgApacheSlingDistributionTransportImplUserCredentialsDistributi**](OASConfigmgrApi.md#orgApacheSlingDistributionTransportImplUserCredentialsDistributi) | **POST** /system/console/configMgr/org.apache.sling.distribution.transport.impl.UserCredentialsDistributionTransportSecretProvider | 
*OASConfigmgrApi* | [**orgApacheSlingDistributionTriggerImplDistributionEventDistribute**](OASConfigmgrApi.md#orgApacheSlingDistributionTriggerImplDistributionEventDistribute) | **POST** /system/console/configMgr/org.apache.sling.distribution.trigger.impl.DistributionEventDistributeDistributionTriggerFactory | 
*OASConfigmgrApi* | [**orgApacheSlingDistributionTriggerImplJcrEventDistributionTrigger**](OASConfigmgrApi.md#orgApacheSlingDistributionTriggerImplJcrEventDistributionTrigger) | **POST** /system/console/configMgr/org.apache.sling.distribution.trigger.impl.JcrEventDistributionTriggerFactory | 
*OASConfigmgrApi* | [**orgApacheSlingDistributionTriggerImplPersistedJcrEventDistributi**](OASConfigmgrApi.md#orgApacheSlingDistributionTriggerImplPersistedJcrEventDistributi) | **POST** /system/console/configMgr/org.apache.sling.distribution.trigger.impl.PersistedJcrEventDistributionTriggerFactory | 
*OASConfigmgrApi* | [**orgApacheSlingDistributionTriggerImplRemoteEventDistributionTrig**](OASConfigmgrApi.md#orgApacheSlingDistributionTriggerImplRemoteEventDistributionTrig) | **POST** /system/console/configMgr/org.apache.sling.distribution.trigger.impl.RemoteEventDistributionTriggerFactory | 
*OASConfigmgrApi* | [**orgApacheSlingDistributionTriggerImplResourceEventDistributionTr**](OASConfigmgrApi.md#orgApacheSlingDistributionTriggerImplResourceEventDistributionTr) | **POST** /system/console/configMgr/org.apache.sling.distribution.trigger.impl.ResourceEventDistributionTriggerFactory | 
*OASConfigmgrApi* | [**orgApacheSlingDistributionTriggerImplScheduledDistributionTrigge**](OASConfigmgrApi.md#orgApacheSlingDistributionTriggerImplScheduledDistributionTrigge) | **POST** /system/console/configMgr/org.apache.sling.distribution.trigger.impl.ScheduledDistributionTriggerFactory | 
*OASConfigmgrApi* | [**orgApacheSlingEngineImplAuthSlingAuthenticator**](OASConfigmgrApi.md#orgApacheSlingEngineImplAuthSlingAuthenticator) | **POST** /system/console/configMgr/org.apache.sling.engine.impl.auth.SlingAuthenticator | 
*OASConfigmgrApi* | [**orgApacheSlingEngineImplDebugRequestProgressTrackerLogFilter**](OASConfigmgrApi.md#orgApacheSlingEngineImplDebugRequestProgressTrackerLogFilter) | **POST** /system/console/configMgr/org.apache.sling.engine.impl.debug.RequestProgressTrackerLogFilter | 
*OASConfigmgrApi* | [**orgApacheSlingEngineImplLogRequestLogger**](OASConfigmgrApi.md#orgApacheSlingEngineImplLogRequestLogger) | **POST** /system/console/configMgr/org.apache.sling.engine.impl.log.RequestLogger | 
*OASConfigmgrApi* | [**orgApacheSlingEngineImplLogRequestLoggerService**](OASConfigmgrApi.md#orgApacheSlingEngineImplLogRequestLoggerService) | **POST** /system/console/configMgr/org.apache.sling.engine.impl.log.RequestLoggerService | 
*OASConfigmgrApi* | [**orgApacheSlingEngineImplSlingMainServlet**](OASConfigmgrApi.md#orgApacheSlingEngineImplSlingMainServlet) | **POST** /system/console/configMgr/org.apache.sling.engine.impl.SlingMainServlet | 
*OASConfigmgrApi* | [**orgApacheSlingEngineParameters**](OASConfigmgrApi.md#orgApacheSlingEngineParameters) | **POST** /system/console/configMgr/org.apache.sling.engine.parameters | 
*OASConfigmgrApi* | [**orgApacheSlingEventImplEventingThreadPool**](OASConfigmgrApi.md#orgApacheSlingEventImplEventingThreadPool) | **POST** /system/console/configMgr/org.apache.sling.event.impl.EventingThreadPool | 
*OASConfigmgrApi* | [**orgApacheSlingEventImplJobsDefaultJobManager**](OASConfigmgrApi.md#orgApacheSlingEventImplJobsDefaultJobManager) | **POST** /system/console/configMgr/org.apache.sling.event.impl.jobs.DefaultJobManager | 
*OASConfigmgrApi* | [**orgApacheSlingEventImplJobsJcrPersistenceHandler**](OASConfigmgrApi.md#orgApacheSlingEventImplJobsJcrPersistenceHandler) | **POST** /system/console/configMgr/org.apache.sling.event.impl.jobs.jcr.PersistenceHandler | 
*OASConfigmgrApi* | [**orgApacheSlingEventImplJobsJobConsumerManager**](OASConfigmgrApi.md#orgApacheSlingEventImplJobsJobConsumerManager) | **POST** /system/console/configMgr/org.apache.sling.event.impl.jobs.JobConsumerManager | 
*OASConfigmgrApi* | [**orgApacheSlingEventJobsQueueConfiguration**](OASConfigmgrApi.md#orgApacheSlingEventJobsQueueConfiguration) | **POST** /system/console/configMgr/org.apache.sling.event.jobs.QueueConfiguration | 
*OASConfigmgrApi* | [**orgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingW**](OASConfigmgrApi.md#orgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingW) | **POST** /system/console/configMgr/org.apache.sling.extensions.webconsolesecurityprovider.internal.SlingWebConsoleSecurityProvider | 
*OASConfigmgrApi* | [**orgApacheSlingFeatureflagsFeature**](OASConfigmgrApi.md#orgApacheSlingFeatureflagsFeature) | **POST** /system/console/configMgr/org.apache.sling.featureflags.Feature | 
*OASConfigmgrApi* | [**orgApacheSlingFeatureflagsImplConfiguredFeature**](OASConfigmgrApi.md#orgApacheSlingFeatureflagsImplConfiguredFeature) | **POST** /system/console/configMgr/org.apache.sling.featureflags.impl.ConfiguredFeature | 
*OASConfigmgrApi* | [**orgApacheSlingHapiImplHApiUtilImpl**](OASConfigmgrApi.md#orgApacheSlingHapiImplHApiUtilImpl) | **POST** /system/console/configMgr/org.apache.sling.hapi.impl.HApiUtilImpl | 
*OASConfigmgrApi* | [**orgApacheSlingHcCoreImplCompositeHealthCheck**](OASConfigmgrApi.md#orgApacheSlingHcCoreImplCompositeHealthCheck) | **POST** /system/console/configMgr/org.apache.sling.hc.core.impl.CompositeHealthCheck | 
*OASConfigmgrApi* | [**orgApacheSlingHcCoreImplExecutorHealthCheckExecutorImpl**](OASConfigmgrApi.md#orgApacheSlingHcCoreImplExecutorHealthCheckExecutorImpl) | **POST** /system/console/configMgr/org.apache.sling.hc.core.impl.executor.HealthCheckExecutorImpl | 
*OASConfigmgrApi* | [**orgApacheSlingHcCoreImplJmxAttributeHealthCheck**](OASConfigmgrApi.md#orgApacheSlingHcCoreImplJmxAttributeHealthCheck) | **POST** /system/console/configMgr/org.apache.sling.hc.core.impl.JmxAttributeHealthCheck | 
*OASConfigmgrApi* | [**orgApacheSlingHcCoreImplScriptableHealthCheck**](OASConfigmgrApi.md#orgApacheSlingHcCoreImplScriptableHealthCheck) | **POST** /system/console/configMgr/org.apache.sling.hc.core.impl.ScriptableHealthCheck | 
*OASConfigmgrApi* | [**orgApacheSlingHcCoreImplServletHealthCheckExecutorServlet**](OASConfigmgrApi.md#orgApacheSlingHcCoreImplServletHealthCheckExecutorServlet) | **POST** /system/console/configMgr/org.apache.sling.hc.core.impl.servlet.HealthCheckExecutorServlet | 
*OASConfigmgrApi* | [**orgApacheSlingHcCoreImplServletResultTxtVerboseSerializer**](OASConfigmgrApi.md#orgApacheSlingHcCoreImplServletResultTxtVerboseSerializer) | **POST** /system/console/configMgr/org.apache.sling.hc.core.impl.servlet.ResultTxtVerboseSerializer | 
*OASConfigmgrApi* | [**orgApacheSlingI18nImplI18NFilter**](OASConfigmgrApi.md#orgApacheSlingI18nImplI18NFilter) | **POST** /system/console/configMgr/org.apache.sling.i18n.impl.I18NFilter | 
*OASConfigmgrApi* | [**orgApacheSlingI18nImplJcrResourceBundleProvider**](OASConfigmgrApi.md#orgApacheSlingI18nImplJcrResourceBundleProvider) | **POST** /system/console/configMgr/org.apache.sling.i18n.impl.JcrResourceBundleProvider | 
*OASConfigmgrApi* | [**orgApacheSlingInstallerProviderJcrImplJcrInstaller**](OASConfigmgrApi.md#orgApacheSlingInstallerProviderJcrImplJcrInstaller) | **POST** /system/console/configMgr/org.apache.sling.installer.provider.jcr.impl.JcrInstaller | 
*OASConfigmgrApi* | [**orgApacheSlingJcrBaseInternalLoginAdminWhitelist**](OASConfigmgrApi.md#orgApacheSlingJcrBaseInternalLoginAdminWhitelist) | **POST** /system/console/configMgr/org.apache.sling.jcr.base.internal.LoginAdminWhitelist | 
*OASConfigmgrApi* | [**orgApacheSlingJcrBaseInternalLoginAdminWhitelistFragment**](OASConfigmgrApi.md#orgApacheSlingJcrBaseInternalLoginAdminWhitelistFragment) | **POST** /system/console/configMgr/org.apache.sling.jcr.base.internal.LoginAdminWhitelist.fragment | 
*OASConfigmgrApi* | [**orgApacheSlingJcrDavexImplServletsSlingDavExServlet**](OASConfigmgrApi.md#orgApacheSlingJcrDavexImplServletsSlingDavExServlet) | **POST** /system/console/configMgr/org.apache.sling.jcr.davex.impl.servlets.SlingDavExServlet | 
*OASConfigmgrApi* | [**orgApacheSlingJcrJackrabbitServerJndiRegistrationSupport**](OASConfigmgrApi.md#orgApacheSlingJcrJackrabbitServerJndiRegistrationSupport) | **POST** /system/console/configMgr/org.apache.sling.jcr.jackrabbit.server.JndiRegistrationSupport | 
*OASConfigmgrApi* | [**orgApacheSlingJcrJackrabbitServerRmiRegistrationSupport**](OASConfigmgrApi.md#orgApacheSlingJcrJackrabbitServerRmiRegistrationSupport) | **POST** /system/console/configMgr/org.apache.sling.jcr.jackrabbit.server.RmiRegistrationSupport | 
*OASConfigmgrApi* | [**orgApacheSlingJcrRepoinitImplRepositoryInitializer**](OASConfigmgrApi.md#orgApacheSlingJcrRepoinitImplRepositoryInitializer) | **POST** /system/console/configMgr/org.apache.sling.jcr.repoinit.impl.RepositoryInitializer | 
*OASConfigmgrApi* | [**orgApacheSlingJcrRepoinitRepositoryInitializer**](OASConfigmgrApi.md#orgApacheSlingJcrRepoinitRepositoryInitializer) | **POST** /system/console/configMgr/org.apache.sling.jcr.repoinit.RepositoryInitializer | 
*OASConfigmgrApi* | [**orgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImpl**](OASConfigmgrApi.md#orgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImpl) | **POST** /system/console/configMgr/org.apache.sling.jcr.resource.internal.JcrResourceResolverFactoryImpl | 
*OASConfigmgrApi* | [**orgApacheSlingJcrResourceInternalJcrSystemUserValidator**](OASConfigmgrApi.md#orgApacheSlingJcrResourceInternalJcrSystemUserValidator) | **POST** /system/console/configMgr/org.apache.sling.jcr.resource.internal.JcrSystemUserValidator | 
*OASConfigmgrApi* | [**orgApacheSlingJcrResourcesecurityImplResourceAccessGateFactory**](OASConfigmgrApi.md#orgApacheSlingJcrResourcesecurityImplResourceAccessGateFactory) | **POST** /system/console/configMgr/org.apache.sling.jcr.resourcesecurity.impl.ResourceAccessGateFactory | 
*OASConfigmgrApi* | [**orgApacheSlingJcrWebdavImplHandlerDefaultHandlerService**](OASConfigmgrApi.md#orgApacheSlingJcrWebdavImplHandlerDefaultHandlerService) | **POST** /system/console/configMgr/org.apache.sling.jcr.webdav.impl.handler.DefaultHandlerService | 
*OASConfigmgrApi* | [**orgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServic**](OASConfigmgrApi.md#orgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServic) | **POST** /system/console/configMgr/org.apache.sling.jcr.webdav.impl.handler.DirListingExportHandlerService | 
*OASConfigmgrApi* | [**orgApacheSlingJcrWebdavImplServletsSimpleWebDavServlet**](OASConfigmgrApi.md#orgApacheSlingJcrWebdavImplServletsSimpleWebDavServlet) | **POST** /system/console/configMgr/org.apache.sling.jcr.webdav.impl.servlets.SimpleWebDavServlet | 
*OASConfigmgrApi* | [**orgApacheSlingJmxProviderImplJMXResourceProvider**](OASConfigmgrApi.md#orgApacheSlingJmxProviderImplJMXResourceProvider) | **POST** /system/console/configMgr/org.apache.sling.jmx.provider.impl.JMXResourceProvider | 
*OASConfigmgrApi* | [**orgApacheSlingModelsImplModelAdapterFactory**](OASConfigmgrApi.md#orgApacheSlingModelsImplModelAdapterFactory) | **POST** /system/console/configMgr/org.apache.sling.models.impl.ModelAdapterFactory | 
*OASConfigmgrApi* | [**orgApacheSlingModelsJacksonexporterImplResourceModuleProvider**](OASConfigmgrApi.md#orgApacheSlingModelsJacksonexporterImplResourceModuleProvider) | **POST** /system/console/configMgr/org.apache.sling.models.jacksonexporter.impl.ResourceModuleProvider | 
*OASConfigmgrApi* | [**orgApacheSlingResourceInventoryImplResourceInventoryPrinterFacto**](OASConfigmgrApi.md#orgApacheSlingResourceInventoryImplResourceInventoryPrinterFacto) | **POST** /system/console/configMgr/org.apache.sling.resource.inventory.impl.ResourceInventoryPrinterFactory | 
*OASConfigmgrApi* | [**orgApacheSlingResourcemergerImplMergedResourceProviderFactory**](OASConfigmgrApi.md#orgApacheSlingResourcemergerImplMergedResourceProviderFactory) | **POST** /system/console/configMgr/org.apache.sling.resourcemerger.impl.MergedResourceProviderFactory | 
*OASConfigmgrApi* | [**orgApacheSlingResourcemergerPickerOverriding**](OASConfigmgrApi.md#orgApacheSlingResourcemergerPickerOverriding) | **POST** /system/console/configMgr/org.apache.sling.resourcemerger.picker.overriding | 
*OASConfigmgrApi* | [**orgApacheSlingScriptingCoreImplScriptCacheImpl**](OASConfigmgrApi.md#orgApacheSlingScriptingCoreImplScriptCacheImpl) | **POST** /system/console/configMgr/org.apache.sling.scripting.core.impl.ScriptCacheImpl | 
*OASConfigmgrApi* | [**orgApacheSlingScriptingCoreImplScriptingResourceResolverProvider**](OASConfigmgrApi.md#orgApacheSlingScriptingCoreImplScriptingResourceResolverProvider) | **POST** /system/console/configMgr/org.apache.sling.scripting.core.impl.ScriptingResourceResolverProviderImpl | 
*OASConfigmgrApi* | [**orgApacheSlingScriptingJavaImplJavaScriptEngineFactory**](OASConfigmgrApi.md#orgApacheSlingScriptingJavaImplJavaScriptEngineFactory) | **POST** /system/console/configMgr/org.apache.sling.scripting.java.impl.JavaScriptEngineFactory | 
*OASConfigmgrApi* | [**orgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFa**](OASConfigmgrApi.md#orgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFa) | **POST** /system/console/configMgr/org.apache.sling.scripting.javascript.internal.RhinoJavaScriptEngineFactory | 
*OASConfigmgrApi* | [**orgApacheSlingScriptingJspJspScriptEngineFactory**](OASConfigmgrApi.md#orgApacheSlingScriptingJspJspScriptEngineFactory) | **POST** /system/console/configMgr/org.apache.sling.scripting.jsp.JspScriptEngineFactory | 
*OASConfigmgrApi* | [**orgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProv**](OASConfigmgrApi.md#orgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProv) | **POST** /system/console/configMgr/org.apache.sling.scripting.sightly.js.impl.jsapi.SlyBindingsValuesProvider | 
*OASConfigmgrApi* | [**orgApacheSlingSecurityImplContentDispositionFilter**](OASConfigmgrApi.md#orgApacheSlingSecurityImplContentDispositionFilter) | **POST** /system/console/configMgr/org.apache.sling.security.impl.ContentDispositionFilter | 
*OASConfigmgrApi* | [**orgApacheSlingSecurityImplReferrerFilter**](OASConfigmgrApi.md#orgApacheSlingSecurityImplReferrerFilter) | **POST** /system/console/configMgr/org.apache.sling.security.impl.ReferrerFilter | 
*OASConfigmgrApi* | [**orgApacheSlingServiceusermappingImplServiceUserMapperImpl**](OASConfigmgrApi.md#orgApacheSlingServiceusermappingImplServiceUserMapperImpl) | **POST** /system/console/configMgr/org.apache.sling.serviceusermapping.impl.ServiceUserMapperImpl | 
*OASConfigmgrApi* | [**orgApacheSlingServiceusermappingImplServiceUserMapperImplAmended**](OASConfigmgrApi.md#orgApacheSlingServiceusermappingImplServiceUserMapperImplAmended) | **POST** /system/console/configMgr/org.apache.sling.serviceusermapping.impl.ServiceUserMapperImpl.amended | 
*OASConfigmgrApi* | [**orgApacheSlingServletsGetDefaultGetServlet**](OASConfigmgrApi.md#orgApacheSlingServletsGetDefaultGetServlet) | **POST** /system/console/configMgr/org.apache.sling.servlets.get.DefaultGetServlet | 
*OASConfigmgrApi* | [**orgApacheSlingServletsGetImplVersionVersionInfoServlet**](OASConfigmgrApi.md#orgApacheSlingServletsGetImplVersionVersionInfoServlet) | **POST** /system/console/configMgr/org.apache.sling.servlets.get.impl.version.VersionInfoServlet | 
*OASConfigmgrApi* | [**orgApacheSlingServletsPostImplHelperChunkCleanUpTask**](OASConfigmgrApi.md#orgApacheSlingServletsPostImplHelperChunkCleanUpTask) | **POST** /system/console/configMgr/org.apache.sling.servlets.post.impl.helper.ChunkCleanUpTask | 
*OASConfigmgrApi* | [**orgApacheSlingServletsPostImplSlingPostServlet**](OASConfigmgrApi.md#orgApacheSlingServletsPostImplSlingPostServlet) | **POST** /system/console/configMgr/org.apache.sling.servlets.post.impl.SlingPostServlet | 
*OASConfigmgrApi* | [**orgApacheSlingServletsResolverSlingServletResolver**](OASConfigmgrApi.md#orgApacheSlingServletsResolverSlingServletResolver) | **POST** /system/console/configMgr/org.apache.sling.servlets.resolver.SlingServletResolver | 
*OASConfigmgrApi* | [**orgApacheSlingSettingsImplSlingSettingsServiceImpl**](OASConfigmgrApi.md#orgApacheSlingSettingsImplSlingSettingsServiceImpl) | **POST** /system/console/configMgr/org.apache.sling.settings.impl.SlingSettingsServiceImpl | 
*OASConfigmgrApi* | [**orgApacheSlingStartupfilterImplStartupFilterImpl**](OASConfigmgrApi.md#orgApacheSlingStartupfilterImplStartupFilterImpl) | **POST** /system/console/configMgr/org.apache.sling.startupfilter.impl.StartupFilterImpl | 
*OASConfigmgrApi* | [**orgApacheSlingTenantInternalTenantProviderImpl**](OASConfigmgrApi.md#orgApacheSlingTenantInternalTenantProviderImpl) | **POST** /system/console/configMgr/org.apache.sling.tenant.internal.TenantProviderImpl | 
*OASConfigmgrApi* | [**orgApacheSlingTracerInternalLogTracer**](OASConfigmgrApi.md#orgApacheSlingTracerInternalLogTracer) | **POST** /system/console/configMgr/org.apache.sling.tracer.internal.LogTracer | 
*OASConfigmgrApi* | [**orgApacheSlingXssImplXSSFilterImpl**](OASConfigmgrApi.md#orgApacheSlingXssImplXSSFilterImpl) | **POST** /system/console/configMgr/org.apache.sling.xss.impl.XSSFilterImpl | 


## Documentation for Models

 - [OASAdaptiveFormAndInteractiveCommuni](OASAdaptiveFormAndInteractiveCommuni.md)
 - [OASAnalyticsComponentQueryCacheServi](OASAnalyticsComponentQueryCacheServi.md)
 - [OASApacheSlingHealthCheckResultHTMLS](OASApacheSlingHealthCheckResultHTMLS.md)
 - [OASComAdobeAemFormsndocumentsConfigA](OASComAdobeAemFormsndocumentsConfigA.md)
 - [OASComAdobeAemTransactionCoreImplTra](OASComAdobeAemTransactionCoreImplTra.md)
 - [OASComAdobeAemUpgradePrechecksHcImpl](OASComAdobeAemUpgradePrechecksHcImpl.md)
 - [OASComAdobeAemUpgradePrechecksMbeanI](OASComAdobeAemUpgradePrechecksMbeanI.md)
 - [OASComAdobeAemUpgradePrechecksTasksI](OASComAdobeAemUpgradePrechecksTasksI.md)
 - [OASComAdobeCqAccountApiAccountManage](OASComAdobeCqAccountApiAccountManage.md)
 - [OASComAdobeCqAccountImplAccountManag](OASComAdobeCqAccountImplAccountManag.md)
 - [OASComAdobeCqAddressImplLocationLoca](OASComAdobeCqAddressImplLocationLoca.md)
 - [OASComAdobeCqAuditPurgeDamInfo](OASComAdobeCqAuditPurgeDamInfo.md)
 - [OASComAdobeCqAuditPurgeDamProperties](OASComAdobeCqAuditPurgeDamProperties.md)
 - [OASComAdobeCqAuditPurgePagesInfo](OASComAdobeCqAuditPurgePagesInfo.md)
 - [OASComAdobeCqAuditPurgePagesProperti](OASComAdobeCqAuditPurgePagesProperti.md)
 - [OASComAdobeCqAuditPurgeReplicationIn](OASComAdobeCqAuditPurgeReplicationIn.md)
 - [OASComAdobeCqAuditPurgeReplicationPr](OASComAdobeCqAuditPurgeReplicationPr.md)
 - [OASComAdobeCqCdnRewriterImplAWSCloud](OASComAdobeCqCdnRewriterImplAWSCloud.md)
 - [OASComAdobeCqCdnRewriterImplCDNConfi](OASComAdobeCqCdnRewriterImplCDNConfi.md)
 - [OASComAdobeCqCdnRewriterImplCDNRewri](OASComAdobeCqCdnRewriterImplCDNRewri.md)
 - [OASComAdobeCqCloudconfigCoreImplConf](OASComAdobeCqCloudconfigCoreImplConf.md)
 - [OASComAdobeCqCommerceImplAssetDynami](OASComAdobeCqCommerceImplAssetDynami.md)
 - [OASComAdobeCqCommerceImplAssetProduc](OASComAdobeCqCommerceImplAssetProduc.md)
 - [OASComAdobeCqCommerceImplAssetStatic](OASComAdobeCqCommerceImplAssetStatic.md)
 - [OASComAdobeCqCommerceImplAssetVideoH](OASComAdobeCqCommerceImplAssetVideoH.md)
 - [OASComAdobeCqCommerceImplPromotionPr](OASComAdobeCqCommerceImplPromotionPr.md)
 - [OASComAdobeCqCommercePimImplCatalogg](OASComAdobeCqCommercePimImplCatalogg.md)
 - [OASComAdobeCqCommercePimImplPageEven](OASComAdobeCqCommercePimImplPageEven.md)
 - [OASComAdobeCqCommercePimImplProductf](OASComAdobeCqCommercePimImplProductf.md)
 - [OASComAdobeCqContentinsightImplRepor](OASComAdobeCqContentinsightImplRepor.md)
 - [OASComAdobeCqContentinsightImplServl](OASComAdobeCqContentinsightImplServl.md)
 - [OASComAdobeCqDamCfmImplComponentComp](OASComAdobeCqDamCfmImplComponentComp.md)
 - [OASComAdobeCqDamCfmImplConfFeatureCo](OASComAdobeCqDamCfmImplConfFeatureCo.md)
 - [OASComAdobeCqDamCfmImplContentRewrit](OASComAdobeCqDamCfmImplContentRewrit.md)
 - [OASComAdobeCqDamDmProcessImagePTiffM](OASComAdobeCqDamDmProcessImagePTiffM.md)
 - [OASComAdobeCqDamIpsImplReplicationTr](OASComAdobeCqDamIpsImplReplicationTr.md)
 - [OASComAdobeCqDamMacSyncHelperImplMAC](OASComAdobeCqDamMacSyncHelperImplMAC.md)
 - [OASComAdobeCqDamMacSyncImplDAMSyncSe](OASComAdobeCqDamMacSyncImplDAMSyncSe.md)
 - [OASComAdobeCqDamProcessorNuiImplNuiA](OASComAdobeCqDamProcessorNuiImplNuiA.md)
 - [OASComAdobeCqDamS7imagingImplIsImage](OASComAdobeCqDamS7imagingImplIsImage.md)
 - [OASComAdobeCqDamS7imagingImplPsPlatf](OASComAdobeCqDamS7imagingImplPsPlatf.md)
 - [OASComAdobeCqDamWebdavImplIoAssetIOH](OASComAdobeCqDamWebdavImplIoAssetIOH.md)
 - [OASComAdobeCqDamWebdavImplIoDamWebda](OASComAdobeCqDamWebdavImplIoDamWebda.md)
 - [OASComAdobeCqDamWebdavImplIoSpecialF](OASComAdobeCqDamWebdavImplIoSpecialF.md)
 - [OASComAdobeCqDeserfwImplDeserializat](OASComAdobeCqDeserfwImplDeserializat.md)
 - [OASComAdobeCqDtmImplServiceDTMWebSer](OASComAdobeCqDtmImplServiceDTMWebSer.md)
 - [OASComAdobeCqDtmImplServletsDTMDeplo](OASComAdobeCqDtmImplServletsDTMDeplo.md)
 - [OASComAdobeCqDtmReactorImplServiceWe](OASComAdobeCqDtmReactorImplServiceWe.md)
 - [OASComAdobeCqExperiencelogImplExperi](OASComAdobeCqExperiencelogImplExperi.md)
 - [OASComAdobeCqHcContentPackagesHealth](OASComAdobeCqHcContentPackagesHealth.md)
 - [OASComAdobeCqHistoryImplHistoryReque](OASComAdobeCqHistoryImplHistoryReque.md)
 - [OASComAdobeCqHistoryImplHistoryServi](OASComAdobeCqHistoryImplHistoryServi.md)
 - [OASComAdobeCqInboxImplTypeproviderIt](OASComAdobeCqInboxImplTypeproviderIt.md)
 - [OASComAdobeCqProjectsImplServletProj](OASComAdobeCqProjectsImplServletProj.md)
 - [OASComAdobeCqProjectsPurgeSchedulerI](OASComAdobeCqProjectsPurgeSchedulerI.md)
 - [OASComAdobeCqProjectsPurgeSchedulerP](OASComAdobeCqProjectsPurgeSchedulerP.md)
 - [OASComAdobeCqScheduledExporterImplSc](OASComAdobeCqScheduledExporterImplSc.md)
 - [OASComAdobeCqScreensAnalyticsImplScr](OASComAdobeCqScreensAnalyticsImplScr.md)
 - [OASComAdobeCqScreensDeviceImplDevice](OASComAdobeCqScreensDeviceImplDevice.md)
 - [OASComAdobeCqScreensDeviceRegistrati](OASComAdobeCqScreensDeviceRegistrati.md)
 - [OASComAdobeCqScreensImplHandlerChann](OASComAdobeCqScreensImplHandlerChann.md)
 - [OASComAdobeCqScreensImplJobsDistribu](OASComAdobeCqScreensImplJobsDistribu.md)
 - [OASComAdobeCqScreensImplRemoteImplDi](OASComAdobeCqScreensImplRemoteImplDi.md)
 - [OASComAdobeCqScreensImplScreensChann](OASComAdobeCqScreensImplScreensChann.md)
 - [OASComAdobeCqScreensMonitoringImplSc](OASComAdobeCqScreensMonitoringImplSc.md)
 - [OASComAdobeCqScreensMqActivemqImplAr](OASComAdobeCqScreensMqActivemqImplAr.md)
 - [OASComAdobeCqScreensOfflinecontentIm](OASComAdobeCqScreensOfflinecontentIm.md)
 - [OASComAdobeCqScreensSegmentationImpl](OASComAdobeCqScreensSegmentationImpl.md)
 - [OASComAdobeCqSecurityHcBundlesImplHt](OASComAdobeCqSecurityHcBundlesImplHt.md)
 - [OASComAdobeCqSecurityHcBundlesImplWc](OASComAdobeCqSecurityHcBundlesImplWc.md)
 - [OASComAdobeCqSecurityHcDispatcherImp](OASComAdobeCqSecurityHcDispatcherImp.md)
 - [OASComAdobeCqSecurityHcPackagesImplE](OASComAdobeCqSecurityHcPackagesImplE.md)
 - [OASComAdobeCqSecurityHcWebserverImpl](OASComAdobeCqSecurityHcWebserverImpl.md)
 - [OASComAdobeCqSocialAccountverificati](OASComAdobeCqSocialAccountverificati.md)
 - [OASComAdobeCqSocialActivitystreamsCl](OASComAdobeCqSocialActivitystreamsCl.md)
 - [OASComAdobeCqSocialActivitystreamsLi](OASComAdobeCqSocialActivitystreamsLi.md)
 - [OASComAdobeCqSocialCalendarClientEnd](OASComAdobeCqSocialCalendarClientEnd.md)
 - [OASComAdobeCqSocialCalendarClientOpe](OASComAdobeCqSocialCalendarClientOpe.md)
 - [OASComAdobeCqSocialCalendarServletsT](OASComAdobeCqSocialCalendarServletsT.md)
 - [OASComAdobeCqSocialCommonsCommentsEn](OASComAdobeCqSocialCommonsCommentsEn.md)
 - [OASComAdobeCqSocialCommonsCommentsLi](OASComAdobeCqSocialCommonsCommentsLi.md)
 - [OASComAdobeCqSocialCommonsCommentsSc](OASComAdobeCqSocialCommonsCommentsSc.md)
 - [OASComAdobeCqSocialCommonsCorsCORSAu](OASComAdobeCqSocialCommonsCorsCORSAu.md)
 - [OASComAdobeCqSocialCommonsEmailreply](OASComAdobeCqSocialCommonsEmailreply.md)
 - [OASComAdobeCqSocialCommonsMaintainan](OASComAdobeCqSocialCommonsMaintainan.md)
 - [OASComAdobeCqSocialCommonsUgclimiter](OASComAdobeCqSocialCommonsUgclimiter.md)
 - [OASComAdobeCqSocialCommonsUgclimitsc](OASComAdobeCqSocialCommonsUgclimitsc.md)
 - [OASComAdobeCqSocialConnectOauthImplF](OASComAdobeCqSocialConnectOauthImplF.md)
 - [OASComAdobeCqSocialConnectOauthImplS](OASComAdobeCqSocialConnectOauthImplS.md)
 - [OASComAdobeCqSocialConnectOauthImplT](OASComAdobeCqSocialConnectOauthImplT.md)
 - [OASComAdobeCqSocialContentFragmentsS](OASComAdobeCqSocialContentFragmentsS.md)
 - [OASComAdobeCqSocialDatastoreAsImplAS](OASComAdobeCqSocialDatastoreAsImplAS.md)
 - [OASComAdobeCqSocialDatastoreOpImplSo](OASComAdobeCqSocialDatastoreOpImplSo.md)
 - [OASComAdobeCqSocialDatastoreRdbImplS](OASComAdobeCqSocialDatastoreRdbImplS.md)
 - [OASComAdobeCqSocialEnablementAdaptor](OASComAdobeCqSocialEnablementAdaptor.md)
 - [OASComAdobeCqSocialEnablementLearnin](OASComAdobeCqSocialEnablementLearnin.md)
 - [OASComAdobeCqSocialEnablementResourc](OASComAdobeCqSocialEnablementResourc.md)
 - [OASComAdobeCqSocialEnablementService](OASComAdobeCqSocialEnablementService.md)
 - [OASComAdobeCqSocialFilelibraryClient](OASComAdobeCqSocialFilelibraryClient.md)
 - [OASComAdobeCqSocialForumClientEndpoi](OASComAdobeCqSocialForumClientEndpoi.md)
 - [OASComAdobeCqSocialForumDispatcherIm](OASComAdobeCqSocialForumDispatcherIm.md)
 - [OASComAdobeCqSocialGroupClientImplCo](OASComAdobeCqSocialGroupClientImplCo.md)
 - [OASComAdobeCqSocialGroupImplGroupSer](OASComAdobeCqSocialGroupImplGroupSer.md)
 - [OASComAdobeCqSocialHandlebarsGuavaTe](OASComAdobeCqSocialHandlebarsGuavaTe.md)
 - [OASComAdobeCqSocialIdeationClientEnd](OASComAdobeCqSocialIdeationClientEnd.md)
 - [OASComAdobeCqSocialJournalClientEndp](OASComAdobeCqSocialJournalClientEndp.md)
 - [OASComAdobeCqSocialMembersEndpointsI](OASComAdobeCqSocialMembersEndpointsI.md)
 - [OASComAdobeCqSocialMembersImplCommun](OASComAdobeCqSocialMembersImplCommun.md)
 - [OASComAdobeCqSocialMessagingClientEn](OASComAdobeCqSocialMessagingClientEn.md)
 - [OASComAdobeCqSocialModerationDashboa](OASComAdobeCqSocialModerationDashboa.md)
 - [OASComAdobeCqSocialNotificationsImpl](OASComAdobeCqSocialNotificationsImpl.md)
 - [OASComAdobeCqSocialQnaClientEndpoint](OASComAdobeCqSocialQnaClientEndpoint.md)
 - [OASComAdobeCqSocialReportingAnalytic](OASComAdobeCqSocialReportingAnalytic.md)
 - [OASComAdobeCqSocialReviewClientEndpo](OASComAdobeCqSocialReviewClientEndpo.md)
 - [OASComAdobeCqSocialScfCoreOperations](OASComAdobeCqSocialScfCoreOperations.md)
 - [OASComAdobeCqSocialScfEndpointsImplD](OASComAdobeCqSocialScfEndpointsImplD.md)
 - [OASComAdobeCqSocialScoringImplScorin](OASComAdobeCqSocialScoringImplScorin.md)
 - [OASComAdobeCqSocialServiceusersInter](OASComAdobeCqSocialServiceusersInter.md)
 - [OASComAdobeCqSocialSiteEndpointsImpl](OASComAdobeCqSocialSiteEndpointsImpl.md)
 - [OASComAdobeCqSocialSiteImplAnalytics](OASComAdobeCqSocialSiteImplAnalytics.md)
 - [OASComAdobeCqSocialSiteImplSiteConfi](OASComAdobeCqSocialSiteImplSiteConfi.md)
 - [OASComAdobeCqSocialSrpImplSocialSolr](OASComAdobeCqSocialSrpImplSocialSolr.md)
 - [OASComAdobeCqSocialSyncImplDiffChang](OASComAdobeCqSocialSyncImplDiffChang.md)
 - [OASComAdobeCqSocialSyncImplGroupSync](OASComAdobeCqSocialSyncImplGroupSync.md)
 - [OASComAdobeCqSocialSyncImplPublisher](OASComAdobeCqSocialSyncImplPublisher.md)
 - [OASComAdobeCqSocialSyncImplUserSyncL](OASComAdobeCqSocialSyncImplUserSyncL.md)
 - [OASComAdobeCqSocialTranslationImplTr](OASComAdobeCqSocialTranslationImplTr.md)
 - [OASComAdobeCqSocialTranslationImplUG](OASComAdobeCqSocialTranslationImplUG.md)
 - [OASComAdobeCqSocialUgcbaseDispatcher](OASComAdobeCqSocialUgcbaseDispatcher.md)
 - [OASComAdobeCqSocialUgcbaseImplAysncR](OASComAdobeCqSocialUgcbaseImplAysncR.md)
 - [OASComAdobeCqSocialUgcbaseImplPublis](OASComAdobeCqSocialUgcbaseImplPublis.md)
 - [OASComAdobeCqSocialUgcbaseImplSocial](OASComAdobeCqSocialUgcbaseImplSocial.md)
 - [OASComAdobeCqSocialUgcbaseModeration](OASComAdobeCqSocialUgcbaseModeration.md)
 - [OASComAdobeCqSocialUgcbaseSecurityIm](OASComAdobeCqSocialUgcbaseSecurityIm.md)
 - [OASComAdobeCqSocialUserEndpointsImpl](OASComAdobeCqSocialUserEndpointsImpl.md)
 - [OASComAdobeCqSocialUserImplTransport](OASComAdobeCqSocialUserImplTransport.md)
 - [OASComAdobeCqUiWcmCommonsInternalSer](OASComAdobeCqUiWcmCommonsInternalSer.md)
 - [OASComAdobeCqUpgradesCleanupImplUpgr](OASComAdobeCqUpgradesCleanupImplUpgr.md)
 - [OASComAdobeCqWcmJobsAsyncImplAsyncDe](OASComAdobeCqWcmJobsAsyncImplAsyncDe.md)
 - [OASComAdobeCqWcmJobsAsyncImplAsyncJo](OASComAdobeCqWcmJobsAsyncImplAsyncJo.md)
 - [OASComAdobeCqWcmJobsAsyncImplAsyncMo](OASComAdobeCqWcmJobsAsyncImplAsyncMo.md)
 - [OASComAdobeCqWcmJobsAsyncImplAsyncPa](OASComAdobeCqWcmJobsAsyncImplAsyncPa.md)
 - [OASComAdobeCqWcmLaunchesImplLaunches](OASComAdobeCqWcmLaunchesImplLaunches.md)
 - [OASComAdobeCqWcmMobileQrcodeServletQ](OASComAdobeCqWcmMobileQrcodeServletQ.md)
 - [OASComAdobeCqWcmStyleInternalCompone](OASComAdobeCqWcmStyleInternalCompone.md)
 - [OASComAdobeCqWcmTranslationImplTrans](OASComAdobeCqWcmTranslationImplTrans.md)
 - [OASComAdobeFdFpConfigFormsPortalDraf](OASComAdobeFdFpConfigFormsPortalDraf.md)
 - [OASComAdobeFdFpConfigFormsPortalSche](OASComAdobeFdFpConfigFormsPortalSche.md)
 - [OASComAdobeFormsCommonServiceImplDef](OASComAdobeFormsCommonServiceImplDef.md)
 - [OASComAdobeFormsCommonServiceImplFor](OASComAdobeFormsCommonServiceImplFor.md)
 - [OASComAdobeFormsCommonServletTempCle](OASComAdobeFormsCommonServletTempCle.md)
 - [OASComAdobeGraniteAcpPlatformPlatfor](OASComAdobeGraniteAcpPlatformPlatfor.md)
 - [OASComAdobeGraniteActivitystreamsImp](OASComAdobeGraniteActivitystreamsImp.md)
 - [OASComAdobeGraniteAnalyzerBaseSystem](OASComAdobeGraniteAnalyzerBaseSystem.md)
 - [OASComAdobeGraniteAnalyzerScriptsCom](OASComAdobeGraniteAnalyzerScriptsCom.md)
 - [OASComAdobeGraniteApicontrollerFilte](OASComAdobeGraniteApicontrollerFilte.md)
 - [OASComAdobeGraniteAuthCertImplClient](OASComAdobeGraniteAuthCertImplClient.md)
 - [OASComAdobeGraniteAuthImsImplExterna](OASComAdobeGraniteAuthImsImplExterna.md)
 - [OASComAdobeGraniteAuthImsImplIMSAcce](OASComAdobeGraniteAuthImsImplIMSAcce.md)
 - [OASComAdobeGraniteAuthImsImplIMSInst](OASComAdobeGraniteAuthImsImplIMSInst.md)
 - [OASComAdobeGraniteAuthImsImplIMSProv](OASComAdobeGraniteAuthImsImplIMSProv.md)
 - [OASComAdobeGraniteAuthImsImplImsConf](OASComAdobeGraniteAuthImsImplImsConf.md)
 - [OASComAdobeGraniteAuthImsInfo](OASComAdobeGraniteAuthImsInfo.md)
 - [OASComAdobeGraniteAuthImsProperties](OASComAdobeGraniteAuthImsProperties.md)
 - [OASComAdobeGraniteAuthOauthAccesstok](OASComAdobeGraniteAuthOauthAccesstok.md)
 - [OASComAdobeGraniteAuthOauthImplBeare](OASComAdobeGraniteAuthOauthImplBeare.md)
 - [OASComAdobeGraniteAuthOauthImplDefau](OASComAdobeGraniteAuthOauthImplDefau.md)
 - [OASComAdobeGraniteAuthOauthImplFaceb](OASComAdobeGraniteAuthOauthImplFaceb.md)
 - [OASComAdobeGraniteAuthOauthImplGithu](OASComAdobeGraniteAuthOauthImplGithu.md)
 - [OASComAdobeGraniteAuthOauthImplGrani](OASComAdobeGraniteAuthOauthImplGrani.md)
 - [OASComAdobeGraniteAuthOauthImplHelpe](OASComAdobeGraniteAuthOauthImplHelpe.md)
 - [OASComAdobeGraniteAuthOauthImplOAuth](OASComAdobeGraniteAuthOauthImplOAuth.md)
 - [OASComAdobeGraniteAuthOauthImplTwitt](OASComAdobeGraniteAuthOauthImplTwitt.md)
 - [OASComAdobeGraniteAuthOauthProviderI](OASComAdobeGraniteAuthOauthProviderI.md)
 - [OASComAdobeGraniteAuthOauthProviderP](OASComAdobeGraniteAuthOauthProviderP.md)
 - [OASComAdobeGraniteAuthRequirementImp](OASComAdobeGraniteAuthRequirementImp.md)
 - [OASComAdobeGraniteAuthSamlSamlAuthen](OASComAdobeGraniteAuthSamlSamlAuthen.md)
 - [OASComAdobeGraniteAuthSsoImplSsoAuth](OASComAdobeGraniteAuthSsoImplSsoAuth.md)
 - [OASComAdobeGraniteBundlesHcImplCodeC](OASComAdobeGraniteBundlesHcImplCodeC.md)
 - [OASComAdobeGraniteBundlesHcImplCrxde](OASComAdobeGraniteBundlesHcImplCrxde.md)
 - [OASComAdobeGraniteBundlesHcImplDavEx](OASComAdobeGraniteBundlesHcImplDavEx.md)
 - [OASComAdobeGraniteBundlesHcImplInact](OASComAdobeGraniteBundlesHcImplInact.md)
 - [OASComAdobeGraniteBundlesHcImplJobsH](OASComAdobeGraniteBundlesHcImplJobsH.md)
 - [OASComAdobeGraniteBundlesHcImplSling](OASComAdobeGraniteBundlesHcImplSling.md)
 - [OASComAdobeGraniteBundlesHcImplWebDa](OASComAdobeGraniteBundlesHcImplWebDa.md)
 - [OASComAdobeGraniteCommentsInternalCo](OASComAdobeGraniteCommentsInternalCo.md)
 - [OASComAdobeGraniteCompatrouterImplCo](OASComAdobeGraniteCompatrouterImplCo.md)
 - [OASComAdobeGraniteCompatrouterImplRo](OASComAdobeGraniteCompatrouterImplRo.md)
 - [OASComAdobeGraniteCompatrouterImplSw](OASComAdobeGraniteCompatrouterImplSw.md)
 - [OASComAdobeGraniteConfImplRuntimeAwa](OASComAdobeGraniteConfImplRuntimeAwa.md)
 - [OASComAdobeGraniteContexthubImplCont](OASComAdobeGraniteContexthubImplCont.md)
 - [OASComAdobeGraniteCorsImplCORSPolicy](OASComAdobeGraniteCorsImplCORSPolicy.md)
 - [OASComAdobeGraniteCsrfImplCSRFFilter](OASComAdobeGraniteCsrfImplCSRFFilter.md)
 - [OASComAdobeGraniteCsrfImplCSRFServle](OASComAdobeGraniteCsrfImplCSRFServle.md)
 - [OASComAdobeGraniteDistributionCoreIm](OASComAdobeGraniteDistributionCoreIm.md)
 - [OASComAdobeGraniteFragsImplCheckHttp](OASComAdobeGraniteFragsImplCheckHttp.md)
 - [OASComAdobeGraniteFragsImplRandomFea](OASComAdobeGraniteFragsImplRandomFea.md)
 - [OASComAdobeGraniteHttpcacheFileFileC](OASComAdobeGraniteHttpcacheFileFileC.md)
 - [OASComAdobeGraniteHttpcacheImplOuter](OASComAdobeGraniteHttpcacheImplOuter.md)
 - [OASComAdobeGraniteI18nImplBundlePseu](OASComAdobeGraniteI18nImplBundlePseu.md)
 - [OASComAdobeGraniteI18nImplPreference](OASComAdobeGraniteI18nImplPreference.md)
 - [OASComAdobeGraniteInfocollectorInfoC](OASComAdobeGraniteInfocollectorInfoC.md)
 - [OASComAdobeGraniteJettySslInternalGr](OASComAdobeGraniteJettySslInternalGr.md)
 - [OASComAdobeGraniteLicenseImplLicense](OASComAdobeGraniteLicenseImplLicense.md)
 - [OASComAdobeGraniteLoggingImplLogAnal](OASComAdobeGraniteLoggingImplLogAnal.md)
 - [OASComAdobeGraniteLoggingImplLogErro](OASComAdobeGraniteLoggingImplLogErro.md)
 - [OASComAdobeGraniteMaintenanceCrxImpl](OASComAdobeGraniteMaintenanceCrxImpl.md)
 - [OASComAdobeGraniteMonitoringImplScri](OASComAdobeGraniteMonitoringImplScri.md)
 - [OASComAdobeGraniteOauthServerAuthImp](OASComAdobeGraniteOauthServerAuthImp.md)
 - [OASComAdobeGraniteOauthServerImplAcc](OASComAdobeGraniteOauthServerImplAcc.md)
 - [OASComAdobeGraniteOauthServerImplOAu](OASComAdobeGraniteOauthServerImplOAu.md)
 - [OASComAdobeGraniteOffloadingImplOffl](OASComAdobeGraniteOffloadingImplOffl.md)
 - [OASComAdobeGraniteOffloadingImplTran](OASComAdobeGraniteOffloadingImplTran.md)
 - [OASComAdobeGraniteOmnisearchImplCore](OASComAdobeGraniteOmnisearchImplCore.md)
 - [OASComAdobeGraniteOptoutImplOptOutSe](OASComAdobeGraniteOptoutImplOptOutSe.md)
 - [OASComAdobeGraniteQueriesImplHcAsync](OASComAdobeGraniteQueriesImplHcAsync.md)
 - [OASComAdobeGraniteQueriesImplHcLarge](OASComAdobeGraniteQueriesImplHcLarge.md)
 - [OASComAdobeGraniteQueriesImplHcQueri](OASComAdobeGraniteQueriesImplHcQueri.md)
 - [OASComAdobeGraniteQueriesImplHcQuery](OASComAdobeGraniteQueriesImplHcQuery.md)
 - [OASComAdobeGraniteReplicationHcImplR](OASComAdobeGraniteReplicationHcImplR.md)
 - [OASComAdobeGraniteRepositoryHcImplAu](OASComAdobeGraniteRepositoryHcImplAu.md)
 - [OASComAdobeGraniteRepositoryHcImplCo](OASComAdobeGraniteRepositoryHcImplCo.md)
 - [OASComAdobeGraniteRepositoryHcImplDe](OASComAdobeGraniteRepositoryHcImplDe.md)
 - [OASComAdobeGraniteRepositoryHcImplDi](OASComAdobeGraniteRepositoryHcImplDi.md)
 - [OASComAdobeGraniteRepositoryHcImplOb](OASComAdobeGraniteRepositoryHcImplOb.md)
 - [OASComAdobeGraniteRepositoryImplComm](OASComAdobeGraniteRepositoryImplComm.md)
 - [OASComAdobeGraniteRepositoryServiceU](OASComAdobeGraniteRepositoryServiceU.md)
 - [OASComAdobeGraniteRequestsLoggingImp](OASComAdobeGraniteRequestsLoggingImp.md)
 - [OASComAdobeGraniteResourcestatusImpl](OASComAdobeGraniteResourcestatusImpl.md)
 - [OASComAdobeGraniteRestAssetsImplAsse](OASComAdobeGraniteRestAssetsImplAsse.md)
 - [OASComAdobeGraniteRestImplApiEndpoin](OASComAdobeGraniteRestImplApiEndpoin.md)
 - [OASComAdobeGraniteRestImplServletDef](OASComAdobeGraniteRestImplServletDef.md)
 - [OASComAdobeGraniteSecurityUserUiInte](OASComAdobeGraniteSecurityUserUiInte.md)
 - [OASComAdobeGraniteSecurityUserUserPr](OASComAdobeGraniteSecurityUserUserPr.md)
 - [OASComAdobeGraniteSocialgraphImplSoc](OASComAdobeGraniteSocialgraphImplSoc.md)
 - [OASComAdobeGraniteSystemMonitoringIm](OASComAdobeGraniteSystemMonitoringIm.md)
 - [OASComAdobeGraniteTaskmanagementImpl](OASComAdobeGraniteTaskmanagementImpl.md)
 - [OASComAdobeGraniteThreaddumpThreadDu](OASComAdobeGraniteThreaddumpThreadDu.md)
 - [OASComAdobeGraniteTranslationConnect](OASComAdobeGraniteTranslationConnect.md)
 - [OASComAdobeGraniteTranslationCoreImp](OASComAdobeGraniteTranslationCoreImp.md)
 - [OASComAdobeGraniteUiClientlibsImplHt](OASComAdobeGraniteUiClientlibsImplHt.md)
 - [OASComAdobeGraniteWorkflowConsoleFra](OASComAdobeGraniteWorkflowConsoleFra.md)
 - [OASComAdobeGraniteWorkflowConsolePub](OASComAdobeGraniteWorkflowConsolePub.md)
 - [OASComAdobeGraniteWorkflowCoreJcrWor](OASComAdobeGraniteWorkflowCoreJcrWor.md)
 - [OASComAdobeGraniteWorkflowCoreJobExt](OASComAdobeGraniteWorkflowCoreJobExt.md)
 - [OASComAdobeGraniteWorkflowCoreJobJob](OASComAdobeGraniteWorkflowCoreJobJob.md)
 - [OASComAdobeGraniteWorkflowCoreOffloa](OASComAdobeGraniteWorkflowCoreOffloa.md)
 - [OASComAdobeGraniteWorkflowCorePayloa](OASComAdobeGraniteWorkflowCorePayloa.md)
 - [OASComAdobeGraniteWorkflowCoreWorkfl](OASComAdobeGraniteWorkflowCoreWorkfl.md)
 - [OASComAdobeGraniteWorkflowPurgeSched](OASComAdobeGraniteWorkflowPurgeSched.md)
 - [OASComAdobeOctopusNcommBootstrapInfo](OASComAdobeOctopusNcommBootstrapInfo.md)
 - [OASComAdobeOctopusNcommBootstrapProp](OASComAdobeOctopusNcommBootstrapProp.md)
 - [OASComAdobeSocialIntegrationsLivefyr](OASComAdobeSocialIntegrationsLivefyr.md)
 - [OASComAdobeXmpWorkerFilesNcommXMPFil](OASComAdobeXmpWorkerFilesNcommXMPFil.md)
 - [OASComDayCommonsDatasourceJdbcpoolJd](OASComDayCommonsDatasourceJdbcpoolJd.md)
 - [OASComDayCommonsHttpclientInfo](OASComDayCommonsHttpclientInfo.md)
 - [OASComDayCommonsHttpclientProperties](OASComDayCommonsHttpclientProperties.md)
 - [OASComDayCqAnalyticsImplStorePropert](OASComDayCqAnalyticsImplStorePropert.md)
 - [OASComDayCqAnalyticsSitecatalystImpl](OASComDayCqAnalyticsSitecatalystImpl.md)
 - [OASComDayCqAnalyticsTestandtargetImp](OASComDayCqAnalyticsTestandtargetImp.md)
 - [OASComDayCqAuthImplCugCugSupportImpl](OASComDayCqAuthImplCugCugSupportImpl.md)
 - [OASComDayCqAuthImplLoginSelectorHand](OASComDayCqAuthImplLoginSelectorHand.md)
 - [OASComDayCqCommonsImplExternalizerIm](OASComDayCqCommonsImplExternalizerIm.md)
 - [OASComDayCqCommonsServletsRootMappin](OASComDayCqCommonsServletsRootMappin.md)
 - [OASComDayCqCompatCodeupgradeImplCode](OASComDayCqCompatCodeupgradeImplCode.md)
 - [OASComDayCqCompatCodeupgradeImplUpgr](OASComDayCqCompatCodeupgradeImplUpgr.md)
 - [OASComDayCqCompatCodeupgradeImplVers](OASComDayCqCompatCodeupgradeImplVers.md)
 - [OASComDayCqContentsyncImplContentSyn](OASComDayCqContentsyncImplContentSyn.md)
 - [OASComDayCqDamCommonsHandlerStandard](OASComDayCqDamCommonsHandlerStandard.md)
 - [OASComDayCqDamCommonsMetadataXmpFilt](OASComDayCqDamCommonsMetadataXmpFilt.md)
 - [OASComDayCqDamCommonsUtilImplAssetCa](OASComDayCqDamCommonsUtilImplAssetCa.md)
 - [OASComDayCqDamCoreImplAnnotationPdfA](OASComDayCqDamCoreImplAnnotationPdfA.md)
 - [OASComDayCqDamCoreImplAssetMoveListe](OASComDayCqDamCoreImplAssetMoveListe.md)
 - [OASComDayCqDamCoreImplAssethomeAsset](OASComDayCqDamCoreImplAssethomeAsset.md)
 - [OASComDayCqDamCoreImplAssetlinkshare](OASComDayCqDamCoreImplAssetlinkshare.md)
 - [OASComDayCqDamCoreImplCacheCQBuffere](OASComDayCqDamCoreImplCacheCQBuffere.md)
 - [OASComDayCqDamCoreImplDamChangeEvent](OASComDayCqDamCoreImplDamChangeEvent.md)
 - [OASComDayCqDamCoreImplDamEventPurgeS](OASComDayCqDamCoreImplDamEventPurgeS.md)
 - [OASComDayCqDamCoreImplDamEventRecord](OASComDayCqDamCoreImplDamEventRecord.md)
 - [OASComDayCqDamCoreImplEventDamEventA](OASComDayCqDamCoreImplEventDamEventA.md)
 - [OASComDayCqDamCoreImplExpiryNotifica](OASComDayCqDamCoreImplExpiryNotifica.md)
 - [OASComDayCqDamCoreImplFoldermetadata](OASComDayCqDamCoreImplFoldermetadata.md)
 - [OASComDayCqDamCoreImplGfxCommonsGfxR](OASComDayCqDamCoreImplGfxCommonsGfxR.md)
 - [OASComDayCqDamCoreImplHandlerEPSForm](OASComDayCqDamCoreImplHandlerEPSForm.md)
 - [OASComDayCqDamCoreImplHandlerIndesig](OASComDayCqDamCoreImplHandlerIndesig.md)
 - [OASComDayCqDamCoreImplHandlerJpegHan](OASComDayCqDamCoreImplHandlerJpegHan.md)
 - [OASComDayCqDamCoreImplHandlerXmpNCom](OASComDayCqDamCoreImplHandlerXmpNCom.md)
 - [OASComDayCqDamCoreImplJmxAssetIndexU](OASComDayCqDamCoreImplJmxAssetIndexU.md)
 - [OASComDayCqDamCoreImplJmxAssetMigrat](OASComDayCqDamCoreImplJmxAssetMigrat.md)
 - [OASComDayCqDamCoreImplJmxAssetUpdate](OASComDayCqDamCoreImplJmxAssetUpdate.md)
 - [OASComDayCqDamCoreImplJobsMetadataex](OASComDayCqDamCoreImplJobsMetadataex.md)
 - [OASComDayCqDamCoreImplJobsMetadataim](OASComDayCqDamCoreImplJobsMetadataim.md)
 - [OASComDayCqDamCoreImplLightboxLightb](OASComDayCqDamCoreImplLightboxLightb.md)
 - [OASComDayCqDamCoreImplMetadataEditor](OASComDayCqDamCoreImplMetadataEditor.md)
 - [OASComDayCqDamCoreImplMimeTypeAssetU](OASComDayCqDamCoreImplMimeTypeAssetU.md)
 - [OASComDayCqDamCoreImplMimeTypeDamMim](OASComDayCqDamCoreImplMimeTypeDamMim.md)
 - [OASComDayCqDamCoreImplMissingMetadat](OASComDayCqDamCoreImplMissingMetadat.md)
 - [OASComDayCqDamCoreImplProcessSendTra](OASComDayCqDamCoreImplProcessSendTra.md)
 - [OASComDayCqDamCoreImplProcessTextExt](OASComDayCqDamCoreImplProcessTextExt.md)
 - [OASComDayCqDamCoreImplRenditionMaker](OASComDayCqDamCoreImplRenditionMaker.md)
 - [OASComDayCqDamCoreImplReportsReportE](OASComDayCqDamCoreImplReportsReportE.md)
 - [OASComDayCqDamCoreImplReportsReportP](OASComDayCqDamCoreImplReportsReportP.md)
 - [OASComDayCqDamCoreImplServletAssetDo](OASComDayCqDamCoreImplServletAssetDo.md)
 - [OASComDayCqDamCoreImplServletAssetSt](OASComDayCqDamCoreImplServletAssetSt.md)
 - [OASComDayCqDamCoreImplServletAssetXM](OASComDayCqDamCoreImplServletAssetXM.md)
 - [OASComDayCqDamCoreImplServletBatchMe](OASComDayCqDamCoreImplServletBatchMe.md)
 - [OASComDayCqDamCoreImplServletBinaryP](OASComDayCqDamCoreImplServletBinaryP.md)
 - [OASComDayCqDamCoreImplServletCollect](OASComDayCqDamCoreImplServletCollect.md)
 - [OASComDayCqDamCoreImplServletCompani](OASComDayCqDamCoreImplServletCompani.md)
 - [OASComDayCqDamCoreImplServletCreateA](OASComDayCqDamCoreImplServletCreateA.md)
 - [OASComDayCqDamCoreImplServletDamCont](OASComDayCqDamCoreImplServletDamCont.md)
 - [OASComDayCqDamCoreImplServletGuidLoo](OASComDayCqDamCoreImplServletGuidLoo.md)
 - [OASComDayCqDamCoreImplServletHealthC](OASComDayCqDamCoreImplServletHealthC.md)
 - [OASComDayCqDamCoreImplServletMetadat](OASComDayCqDamCoreImplServletMetadat.md)
 - [OASComDayCqDamCoreImplServletMultipl](OASComDayCqDamCoreImplServletMultipl.md)
 - [OASComDayCqDamCoreImplServletResourc](OASComDayCqDamCoreImplServletResourc.md)
 - [OASComDayCqDamCoreImplUiPreviewFolde](OASComDayCqDamCoreImplUiPreviewFolde.md)
 - [OASComDayCqDamCoreImplUnzipUnzipConf](OASComDayCqDamCoreImplUnzipUnzipConf.md)
 - [OASComDayCqDamCoreProcessExifToolExt](OASComDayCqDamCoreProcessExifToolExt.md)
 - [OASComDayCqDamCoreProcessExtractMeta](OASComDayCqDamCoreProcessExtractMeta.md)
 - [OASComDayCqDamCoreProcessMetadataPro](OASComDayCqDamCoreProcessMetadataPro.md)
 - [OASComDayCqDamHandlerFfmpegLocatorIm](OASComDayCqDamHandlerFfmpegLocatorIm.md)
 - [OASComDayCqDamHandlerGibsonFontmanag](OASComDayCqDamHandlerGibsonFontmanag.md)
 - [OASComDayCqDamHandlerStandardPdfPdfH](OASComDayCqDamHandlerStandardPdfPdfH.md)
 - [OASComDayCqDamHandlerStandardPsPostS](OASComDayCqDamHandlerStandardPsPostS.md)
 - [OASComDayCqDamHandlerStandardPsdPsdH](OASComDayCqDamHandlerStandardPsdPsdH.md)
 - [OASComDayCqDamIdsImplIDSJobProcessor](OASComDayCqDamIdsImplIDSJobProcessor.md)
 - [OASComDayCqDamIdsImplIDSPoolManagerI](OASComDayCqDamIdsImplIDSPoolManagerI.md)
 - [OASComDayCqDamInddImplHandlerIndesig](OASComDayCqDamInddImplHandlerIndesig.md)
 - [OASComDayCqDamInddImplServletSnippet](OASComDayCqDamInddImplServletSnippet.md)
 - [OASComDayCqDamInddProcessINDDMediaEx](OASComDayCqDamInddProcessINDDMediaEx.md)
 - [OASComDayCqDamPerformanceInternalAss](OASComDayCqDamPerformanceInternalAss.md)
 - [OASComDayCqDamPimImplSourcingUploadP](OASComDayCqDamPimImplSourcingUploadP.md)
 - [OASComDayCqDamS7damCommonAnalyticsIm](OASComDayCqDamS7damCommonAnalyticsIm.md)
 - [OASComDayCqDamS7damCommonPostServlet](OASComDayCqDamS7damCommonPostServlet.md)
 - [OASComDayCqDamS7damCommonProcessVide](OASComDayCqDamS7damCommonProcessVide.md)
 - [OASComDayCqDamS7damCommonS7damDamCha](OASComDayCqDamS7damCommonS7damDamCha.md)
 - [OASComDayCqDamS7damCommonServletsS7d](OASComDayCqDamS7damCommonServletsS7d.md)
 - [OASComDayCqDamS7damCommonVideoImplVi](OASComDayCqDamS7damCommonVideoImplVi.md)
 - [OASComDayCqDamScene7ImplScene7APICli](OASComDayCqDamScene7ImplScene7APICli.md)
 - [OASComDayCqDamScene7ImplScene7AssetM](OASComDayCqDamScene7ImplScene7AssetM.md)
 - [OASComDayCqDamScene7ImplScene7Config](OASComDayCqDamScene7ImplScene7Config.md)
 - [OASComDayCqDamScene7ImplScene7DamCha](OASComDayCqDamScene7ImplScene7DamCha.md)
 - [OASComDayCqDamScene7ImplScene7FlashT](OASComDayCqDamScene7ImplScene7FlashT.md)
 - [OASComDayCqDamScene7ImplScene7Upload](OASComDayCqDamScene7ImplScene7Upload.md)
 - [OASComDayCqDamStockIntegrationImplCa](OASComDayCqDamStockIntegrationImplCa.md)
 - [OASComDayCqDamStockIntegrationImplCo](OASComDayCqDamStockIntegrationImplCo.md)
 - [OASComDayCqDamVideoImplServletVideoT](OASComDayCqDamVideoImplServletVideoT.md)
 - [OASComDayCqExtwidgetServletsImageSpr](OASComDayCqExtwidgetServletsImageSpr.md)
 - [OASComDayCqImageInternalFontFontHelp](OASComDayCqImageInternalFontFontHelp.md)
 - [OASComDayCqJcrclustersupportClusterS](OASComDayCqJcrclustersupportClusterS.md)
 - [OASComDayCqMailerDefaultMailServiceI](OASComDayCqMailerDefaultMailServiceI.md)
 - [OASComDayCqMailerDefaultMailServiceP](OASComDayCqMailerDefaultMailServiceP.md)
 - [OASComDayCqMailerImplCqMailingServic](OASComDayCqMailerImplCqMailingServic.md)
 - [OASComDayCqMailerImplEmailCqEmailTem](OASComDayCqMailerImplEmailCqEmailTem.md)
 - [OASComDayCqMailerImplEmailCqRetrieve](OASComDayCqMailerImplEmailCqRetrieve.md)
 - [OASComDayCqMcmCampaignImplIntegratio](OASComDayCqMcmCampaignImplIntegratio.md)
 - [OASComDayCqMcmCampaignImporterPerson](OASComDayCqMcmCampaignImporterPerson.md)
 - [OASComDayCqMcmCoreNewsletterNewslett](OASComDayCqMcmCoreNewsletterNewslett.md)
 - [OASComDayCqMcmImplMCMConfigurationIn](OASComDayCqMcmImplMCMConfigurationIn.md)
 - [OASComDayCqMcmImplMCMConfigurationPr](OASComDayCqMcmImplMCMConfigurationPr.md)
 - [OASComDayCqMcmLandingpageParserTagha](OASComDayCqMcmLandingpageParserTagha.md)
 - [OASComDayCqNotificationImplNotificat](OASComDayCqNotificationImplNotificat.md)
 - [OASComDayCqPersonalizationImplServle](OASComDayCqPersonalizationImplServle.md)
 - [OASComDayCqPollingImporterImplManage](OASComDayCqPollingImporterImplManage.md)
 - [OASComDayCqPollingImporterImplPollin](OASComDayCqPollingImporterImplPollin.md)
 - [OASComDayCqReplicationAuditReplicati](OASComDayCqReplicationAuditReplicati.md)
 - [OASComDayCqReplicationContentStaticC](OASComDayCqReplicationContentStaticC.md)
 - [OASComDayCqReplicationImplAgentManag](OASComDayCqReplicationImplAgentManag.md)
 - [OASComDayCqReplicationImplContentDur](OASComDayCqReplicationImplContentDur.md)
 - [OASComDayCqReplicationImplReplicatio](OASComDayCqReplicationImplReplicatio.md)
 - [OASComDayCqReplicationImplReplicator](OASComDayCqReplicationImplReplicator.md)
 - [OASComDayCqReplicationImplReverseRep](OASComDayCqReplicationImplReverseRep.md)
 - [OASComDayCqReplicationImplTransportB](OASComDayCqReplicationImplTransportB.md)
 - [OASComDayCqReplicationImplTransportH](OASComDayCqReplicationImplTransportH.md)
 - [OASComDayCqReportingImplCacheCacheIm](OASComDayCqReportingImplCacheCacheIm.md)
 - [OASComDayCqReportingImplConfigServic](OASComDayCqReportingImplConfigServic.md)
 - [OASComDayCqReportingImplRLogAnalyzer](OASComDayCqReportingImplRLogAnalyzer.md)
 - [OASComDayCqRewriterLinkcheckerImplLi](OASComDayCqRewriterLinkcheckerImplLi.md)
 - [OASComDayCqRewriterProcessorImplHtml](OASComDayCqRewriterProcessorImplHtml.md)
 - [OASComDayCqSearchImplBuilderQueryBui](OASComDayCqSearchImplBuilderQueryBui.md)
 - [OASComDayCqSearchSuggestImplSuggesti](OASComDayCqSearchSuggestImplSuggesti.md)
 - [OASComDayCqSearchpromoteImplPublishS](OASComDayCqSearchpromoteImplPublishS.md)
 - [OASComDayCqSearchpromoteImplSearchPr](OASComDayCqSearchpromoteImplSearchPr.md)
 - [OASComDayCqSecurityACLSetupInfo](OASComDayCqSecurityACLSetupInfo.md)
 - [OASComDayCqSecurityACLSetupPropertie](OASComDayCqSecurityACLSetupPropertie.md)
 - [OASComDayCqStatisticsImplStatisticsS](OASComDayCqStatisticsImplStatisticsS.md)
 - [OASComDayCqTaggingImplJcrTagManagerF](OASComDayCqTaggingImplJcrTagManagerF.md)
 - [OASComDayCqTaggingImplSearchTagPredi](OASComDayCqTaggingImplSearchTagPredi.md)
 - [OASComDayCqTaggingImplTagGarbageColl](OASComDayCqTaggingImplTagGarbageColl.md)
 - [OASComDayCqWcmContentsyncImplHandler](OASComDayCqWcmContentsyncImplHandler.md)
 - [OASComDayCqWcmContentsyncImplRewrite](OASComDayCqWcmContentsyncImplRewrite.md)
 - [OASComDayCqWcmCoreImplAuthoringUIMod](OASComDayCqWcmCoreImplAuthoringUIMod.md)
 - [OASComDayCqWcmCoreImplCommandsWCMCom](OASComDayCqWcmCoreImplCommandsWCMCom.md)
 - [OASComDayCqWcmCoreImplDevicedetectio](OASComDayCqWcmCoreImplDevicedetectio.md)
 - [OASComDayCqWcmCoreImplEventPageEvent](OASComDayCqWcmCoreImplEventPageEvent.md)
 - [OASComDayCqWcmCoreImplEventPagePostP](OASComDayCqWcmCoreImplEventPagePostP.md)
 - [OASComDayCqWcmCoreImplEventRepositor](OASComDayCqWcmCoreImplEventRepositor.md)
 - [OASComDayCqWcmCoreImplEventTemplateP](OASComDayCqWcmCoreImplEventTemplateP.md)
 - [OASComDayCqWcmCoreImplLanguageManage](OASComDayCqWcmCoreImplLanguageManage.md)
 - [OASComDayCqWcmCoreImplLinkCheckerCon](OASComDayCqWcmCoreImplLinkCheckerCon.md)
 - [OASComDayCqWcmCoreImplPagePageInfoAg](OASComDayCqWcmCoreImplPagePageInfoAg.md)
 - [OASComDayCqWcmCoreImplPagePageManage](OASComDayCqWcmCoreImplPagePageManage.md)
 - [OASComDayCqWcmCoreImplReferencesCont](OASComDayCqWcmCoreImplReferencesCont.md)
 - [OASComDayCqWcmCoreImplServletsConten](OASComDayCqWcmCoreImplServletsConten.md)
 - [OASComDayCqWcmCoreImplServletsFindRe](OASComDayCqWcmCoreImplServletsFindRe.md)
 - [OASComDayCqWcmCoreImplServletsRefere](OASComDayCqWcmCoreImplServletsRefere.md)
 - [OASComDayCqWcmCoreImplServletsThumbn](OASComDayCqWcmCoreImplServletsThumbn.md)
 - [OASComDayCqWcmCoreImplUtilsDefaultPa](OASComDayCqWcmCoreImplUtilsDefaultPa.md)
 - [OASComDayCqWcmCoreImplVariantsPageVa](OASComDayCqWcmCoreImplVariantsPageVa.md)
 - [OASComDayCqWcmCoreImplVersionManager](OASComDayCqWcmCoreImplVersionManager.md)
 - [OASComDayCqWcmCoreImplVersionPurgeTa](OASComDayCqWcmCoreImplVersionPurgeTa.md)
 - [OASComDayCqWcmCoreImplWCMDebugFilter](OASComDayCqWcmCoreImplWCMDebugFilter.md)
 - [OASComDayCqWcmCoreImplWCMDeveloperMo](OASComDayCqWcmCoreImplWCMDeveloperMo.md)
 - [OASComDayCqWcmCoreImplWarpTimeWarpFi](OASComDayCqWcmCoreImplWarpTimeWarpFi.md)
 - [OASComDayCqWcmCoreMvtMVTStatisticsIm](OASComDayCqWcmCoreMvtMVTStatisticsIm.md)
 - [OASComDayCqWcmCoreStatsPageViewStati](OASComDayCqWcmCoreStatsPageViewStati.md)
 - [OASComDayCqWcmCoreWCMRequestFilterIn](OASComDayCqWcmCoreWCMRequestFilterIn.md)
 - [OASComDayCqWcmCoreWCMRequestFilterPr](OASComDayCqWcmCoreWCMRequestFilterPr.md)
 - [OASComDayCqWcmDesignimporterDesignPa](OASComDayCqWcmDesignimporterDesignPa.md)
 - [OASComDayCqWcmDesignimporterImplCanv](OASComDayCqWcmDesignimporterImplCanv.md)
 - [OASComDayCqWcmDesignimporterImplEntr](OASComDayCqWcmDesignimporterImplEntr.md)
 - [OASComDayCqWcmDesignimporterImplMobi](OASComDayCqWcmDesignimporterImplMobi.md)
 - [OASComDayCqWcmDesignimporterParserTa](OASComDayCqWcmDesignimporterParserTa.md)
 - [OASComDayCqWcmFoundationFormsImplFor](OASComDayCqWcmFoundationFormsImplFor.md)
 - [OASComDayCqWcmFoundationFormsImplMai](OASComDayCqWcmFoundationFormsImplMai.md)
 - [OASComDayCqWcmFoundationImplAdaptive](OASComDayCqWcmFoundationImplAdaptive.md)
 - [OASComDayCqWcmFoundationImplHTTPAuth](OASComDayCqWcmFoundationImplHTTPAuth.md)
 - [OASComDayCqWcmFoundationImplPageImpr](OASComDayCqWcmFoundationImplPageImpr.md)
 - [OASComDayCqWcmFoundationImplPageRedi](OASComDayCqWcmFoundationImplPageRedi.md)
 - [OASComDayCqWcmFoundationSecurityImpl](OASComDayCqWcmFoundationSecurityImpl.md)
 - [OASComDayCqWcmMobileCoreImplDeviceDe](OASComDayCqWcmMobileCoreImplDeviceDe.md)
 - [OASComDayCqWcmMobileCoreImplRedirect](OASComDayCqWcmMobileCoreImplRedirect.md)
 - [OASComDayCqWcmMsmImplActionsContentC](OASComDayCqWcmMsmImplActionsContentC.md)
 - [OASComDayCqWcmMsmImplActionsContentD](OASComDayCqWcmMsmImplActionsContentD.md)
 - [OASComDayCqWcmMsmImplActionsContentU](OASComDayCqWcmMsmImplActionsContentU.md)
 - [OASComDayCqWcmMsmImplActionsOrderChi](OASComDayCqWcmMsmImplActionsOrderChi.md)
 - [OASComDayCqWcmMsmImplActionsPageMove](OASComDayCqWcmMsmImplActionsPageMove.md)
 - [OASComDayCqWcmMsmImplActionsReferenc](OASComDayCqWcmMsmImplActionsReferenc.md)
 - [OASComDayCqWcmMsmImplActionsVersionC](OASComDayCqWcmMsmImplActionsVersionC.md)
 - [OASComDayCqWcmMsmImplLiveRelationshi](OASComDayCqWcmMsmImplLiveRelationshi.md)
 - [OASComDayCqWcmMsmImplRolloutManagerI](OASComDayCqWcmMsmImplRolloutManagerI.md)
 - [OASComDayCqWcmMsmImplServletsAuditLo](OASComDayCqWcmMsmImplServletsAuditLo.md)
 - [OASComDayCqWcmNotificationEmailImplE](OASComDayCqWcmNotificationEmailImplE.md)
 - [OASComDayCqWcmNotificationImplNotifi](OASComDayCqWcmNotificationImplNotifi.md)
 - [OASComDayCqWcmScriptingImplBVPManage](OASComDayCqWcmScriptingImplBVPManage.md)
 - [OASComDayCqWcmUndoUndoConfigInfo](OASComDayCqWcmUndoUndoConfigInfo.md)
 - [OASComDayCqWcmUndoUndoConfigProperti](OASComDayCqWcmUndoUndoConfigProperti.md)
 - [OASComDayCqWcmWebservicesupportImplR](OASComDayCqWcmWebservicesupportImplR.md)
 - [OASComDayCqWcmWorkflowImplWcmWorkflo](OASComDayCqWcmWorkflowImplWcmWorkflo.md)
 - [OASComDayCqWcmWorkflowImplWorkflowPa](OASComDayCqWcmWorkflowImplWorkflowPa.md)
 - [OASComDayCqWidgetImplHtmlLibraryMana](OASComDayCqWidgetImplHtmlLibraryMana.md)
 - [OASComDayCqWidgetImplWidgetExtension](OASComDayCqWidgetImplWidgetExtension.md)
 - [OASComDayCqWorkflowImplEmailEMailNot](OASComDayCqWorkflowImplEmailEMailNot.md)
 - [OASComDayCqWorkflowImplEmailTaskEMai](OASComDayCqWorkflowImplEmailTaskEMai.md)
 - [OASComDayCrxSecurityTokenImplImplTok](OASComDayCrxSecurityTokenImplImplTok.md)
 - [OASComDayCrxSecurityTokenImplTokenCl](OASComDayCrxSecurityTokenImplTokenCl.md)
 - [OASConfigNodePropertyArray](OASConfigNodePropertyArray.md)
 - [OASConfigNodePropertyBoolean](OASConfigNodePropertyBoolean.md)
 - [OASConfigNodePropertyDropDown](OASConfigNodePropertyDropDown.md)
 - [OASConfigNodePropertyDropDownType](OASConfigNodePropertyDropDownType.md)
 - [OASConfigNodePropertyFloat](OASConfigNodePropertyFloat.md)
 - [OASConfigNodePropertyInteger](OASConfigNodePropertyInteger.md)
 - [OASConfigNodePropertyString](OASConfigNodePropertyString.md)
 - [OASGuideLocalizationServiceInfo](OASGuideLocalizationServiceInfo.md)
 - [OASGuideLocalizationServicePropertie](OASGuideLocalizationServicePropertie.md)
 - [OASMessagingUserComponentFactoryInfo](OASMessagingUserComponentFactoryInfo.md)
 - [OASMessagingUserComponentFactoryProp](OASMessagingUserComponentFactoryProp.md)
 - [OASOrgApacheAriesJmxFrameworkStateCo](OASOrgApacheAriesJmxFrameworkStateCo.md)
 - [OASOrgApacheFelixEventadminImplEvent](OASOrgApacheFelixEventadminImplEvent.md)
 - [OASOrgApacheFelixHttpInfo](OASOrgApacheFelixHttpInfo.md)
 - [OASOrgApacheFelixHttpProperties](OASOrgApacheFelixHttpProperties.md)
 - [OASOrgApacheFelixHttpSslfilterSslFil](OASOrgApacheFelixHttpSslfilterSslFil.md)
 - [OASOrgApacheFelixJaasConfigurationFa](OASOrgApacheFelixJaasConfigurationFa.md)
 - [OASOrgApacheFelixJaasConfigurationSp](OASOrgApacheFelixJaasConfigurationSp.md)
 - [OASOrgApacheFelixScrScrServiceInfo](OASOrgApacheFelixScrScrServiceInfo.md)
 - [OASOrgApacheFelixScrScrServiceProper](OASOrgApacheFelixScrScrServiceProper.md)
 - [OASOrgApacheFelixSystemreadyImplComp](OASOrgApacheFelixSystemreadyImplComp.md)
 - [OASOrgApacheFelixSystemreadyImplFram](OASOrgApacheFelixSystemreadyImplFram.md)
 - [OASOrgApacheFelixSystemreadyImplServ](OASOrgApacheFelixSystemreadyImplServ.md)
 - [OASOrgApacheFelixSystemreadySystemRe](OASOrgApacheFelixSystemreadySystemRe.md)
 - [OASOrgApacheFelixWebconsoleInternalS](OASOrgApacheFelixWebconsoleInternalS.md)
 - [OASOrgApacheFelixWebconsolePluginsEv](OASOrgApacheFelixWebconsolePluginsEv.md)
 - [OASOrgApacheFelixWebconsolePluginsMe](OASOrgApacheFelixWebconsolePluginsMe.md)
 - [OASOrgApacheHttpProxyconfiguratorInf](OASOrgApacheHttpProxyconfiguratorInf.md)
 - [OASOrgApacheHttpProxyconfiguratorPro](OASOrgApacheHttpProxyconfiguratorPro.md)
 - [OASOrgApacheJackrabbitOakPluginsBlob](OASOrgApacheJackrabbitOakPluginsBlob.md)
 - [OASOrgApacheJackrabbitOakPluginsDocu](OASOrgApacheJackrabbitOakPluginsDocu.md)
 - [OASOrgApacheJackrabbitOakPluginsInde](OASOrgApacheJackrabbitOakPluginsInde.md)
 - [OASOrgApacheJackrabbitOakPluginsMetr](OASOrgApacheJackrabbitOakPluginsMetr.md)
 - [OASOrgApacheJackrabbitOakPluginsObse](OASOrgApacheJackrabbitOakPluginsObse.md)
 - [OASOrgApacheJackrabbitOakQueryQueryE](OASOrgApacheJackrabbitOakQueryQueryE.md)
 - [OASOrgApacheJackrabbitOakSecurityAut](OASOrgApacheJackrabbitOakSecurityAut.md)
 - [OASOrgApacheJackrabbitOakSecurityInt](OASOrgApacheJackrabbitOakSecurityInt.md)
 - [OASOrgApacheJackrabbitOakSecurityUse](OASOrgApacheJackrabbitOakSecurityUse.md)
 - [OASOrgApacheJackrabbitOakSegmentAzur](OASOrgApacheJackrabbitOakSegmentAzur.md)
 - [OASOrgApacheJackrabbitOakSegmentSegm](OASOrgApacheJackrabbitOakSegmentSegm.md)
 - [OASOrgApacheJackrabbitOakSegmentStan](OASOrgApacheJackrabbitOakSegmentStan.md)
 - [OASOrgApacheJackrabbitOakSpiSecurity](OASOrgApacheJackrabbitOakSpiSecurity.md)
 - [OASOrgApacheJackrabbitVaultPackaging](OASOrgApacheJackrabbitVaultPackaging.md)
 - [OASOrgApacheSlingAuthCoreImplLogoutS](OASOrgApacheSlingAuthCoreImplLogoutS.md)
 - [OASOrgApacheSlingCaconfigImplConfigu](OASOrgApacheSlingCaconfigImplConfigu.md)
 - [OASOrgApacheSlingCaconfigImplDefDefa](OASOrgApacheSlingCaconfigImplDefDefa.md)
 - [OASOrgApacheSlingCaconfigImplOverrid](OASOrgApacheSlingCaconfigImplOverrid.md)
 - [OASOrgApacheSlingCaconfigManagementI](OASOrgApacheSlingCaconfigManagementI.md)
 - [OASOrgApacheSlingCaconfigResourceImp](OASOrgApacheSlingCaconfigResourceImp.md)
 - [OASOrgApacheSlingCommonsHtmlInternal](OASOrgApacheSlingCommonsHtmlInternal.md)
 - [OASOrgApacheSlingCommonsLogLogManage](OASOrgApacheSlingCommonsLogLogManage.md)
 - [OASOrgApacheSlingCommonsMetricsInter](OASOrgApacheSlingCommonsMetricsInter.md)
 - [OASOrgApacheSlingCommonsMetricsRrd4j](OASOrgApacheSlingCommonsMetricsRrd4j.md)
 - [OASOrgApacheSlingCommonsMimeInternal](OASOrgApacheSlingCommonsMimeInternal.md)
 - [OASOrgApacheSlingCommonsSchedulerImp](OASOrgApacheSlingCommonsSchedulerImp.md)
 - [OASOrgApacheSlingCommonsThreadsImplD](OASOrgApacheSlingCommonsThreadsImplD.md)
 - [OASOrgApacheSlingDatasourceDataSourc](OASOrgApacheSlingDatasourceDataSourc.md)
 - [OASOrgApacheSlingDatasourceJNDIDataS](OASOrgApacheSlingDatasourceJNDIDataS.md)
 - [OASOrgApacheSlingDiscoveryOakConfigI](OASOrgApacheSlingDiscoveryOakConfigI.md)
 - [OASOrgApacheSlingDiscoveryOakConfigP](OASOrgApacheSlingDiscoveryOakConfigP.md)
 - [OASOrgApacheSlingDiscoveryOakSynchro](OASOrgApacheSlingDiscoveryOakSynchro.md)
 - [OASOrgApacheSlingDistributionAgentIm](OASOrgApacheSlingDistributionAgentIm.md)
 - [OASOrgApacheSlingDistributionMonitor](OASOrgApacheSlingDistributionMonitor.md)
 - [OASOrgApacheSlingDistributionPackagi](OASOrgApacheSlingDistributionPackagi.md)
 - [OASOrgApacheSlingDistributionResourc](OASOrgApacheSlingDistributionResourc.md)
 - [OASOrgApacheSlingDistributionSeriali](OASOrgApacheSlingDistributionSeriali.md)
 - [OASOrgApacheSlingDistributionTranspo](OASOrgApacheSlingDistributionTranspo.md)
 - [OASOrgApacheSlingDistributionTrigger](OASOrgApacheSlingDistributionTrigger.md)
 - [OASOrgApacheSlingEngineImplAuthSling](OASOrgApacheSlingEngineImplAuthSling.md)
 - [OASOrgApacheSlingEngineImplDebugRequ](OASOrgApacheSlingEngineImplDebugRequ.md)
 - [OASOrgApacheSlingEngineImplLogReques](OASOrgApacheSlingEngineImplLogReques.md)
 - [OASOrgApacheSlingEngineImplSlingMain](OASOrgApacheSlingEngineImplSlingMain.md)
 - [OASOrgApacheSlingEngineParametersInf](OASOrgApacheSlingEngineParametersInf.md)
 - [OASOrgApacheSlingEngineParametersPro](OASOrgApacheSlingEngineParametersPro.md)
 - [OASOrgApacheSlingEventImplEventingTh](OASOrgApacheSlingEventImplEventingTh.md)
 - [OASOrgApacheSlingEventImplJobsDefaul](OASOrgApacheSlingEventImplJobsDefaul.md)
 - [OASOrgApacheSlingEventImplJobsJcrPer](OASOrgApacheSlingEventImplJobsJcrPer.md)
 - [OASOrgApacheSlingEventImplJobsJobCon](OASOrgApacheSlingEventImplJobsJobCon.md)
 - [OASOrgApacheSlingEventJobsQueueConfi](OASOrgApacheSlingEventJobsQueueConfi.md)
 - [OASOrgApacheSlingExtensionsWebconsol](OASOrgApacheSlingExtensionsWebconsol.md)
 - [OASOrgApacheSlingFeatureflagsFeature](OASOrgApacheSlingFeatureflagsFeature.md)
 - [OASOrgApacheSlingFeatureflagsImplCon](OASOrgApacheSlingFeatureflagsImplCon.md)
 - [OASOrgApacheSlingHapiImplHApiUtilImp](OASOrgApacheSlingHapiImplHApiUtilImp.md)
 - [OASOrgApacheSlingHcCoreImplComposite](OASOrgApacheSlingHcCoreImplComposite.md)
 - [OASOrgApacheSlingHcCoreImplExecutorH](OASOrgApacheSlingHcCoreImplExecutorH.md)
 - [OASOrgApacheSlingHcCoreImplJmxAttrib](OASOrgApacheSlingHcCoreImplJmxAttrib.md)
 - [OASOrgApacheSlingHcCoreImplScriptabl](OASOrgApacheSlingHcCoreImplScriptabl.md)
 - [OASOrgApacheSlingHcCoreImplServletHe](OASOrgApacheSlingHcCoreImplServletHe.md)
 - [OASOrgApacheSlingHcCoreImplServletRe](OASOrgApacheSlingHcCoreImplServletRe.md)
 - [OASOrgApacheSlingI18nImplI18NFilterI](OASOrgApacheSlingI18nImplI18NFilterI.md)
 - [OASOrgApacheSlingI18nImplI18NFilterP](OASOrgApacheSlingI18nImplI18NFilterP.md)
 - [OASOrgApacheSlingI18nImplJcrResource](OASOrgApacheSlingI18nImplJcrResource.md)
 - [OASOrgApacheSlingInstallerProviderJc](OASOrgApacheSlingInstallerProviderJc.md)
 - [OASOrgApacheSlingJcrBaseInternalLogi](OASOrgApacheSlingJcrBaseInternalLogi.md)
 - [OASOrgApacheSlingJcrDavexImplServlet](OASOrgApacheSlingJcrDavexImplServlet.md)
 - [OASOrgApacheSlingJcrJackrabbitServer](OASOrgApacheSlingJcrJackrabbitServer.md)
 - [OASOrgApacheSlingJcrRepoinitImplRepo](OASOrgApacheSlingJcrRepoinitImplRepo.md)
 - [OASOrgApacheSlingJcrRepoinitReposito](OASOrgApacheSlingJcrRepoinitReposito.md)
 - [OASOrgApacheSlingJcrResourceInternal](OASOrgApacheSlingJcrResourceInternal.md)
 - [OASOrgApacheSlingJcrResourcesecurity](OASOrgApacheSlingJcrResourcesecurity.md)
 - [OASOrgApacheSlingJcrWebdavImplHandle](OASOrgApacheSlingJcrWebdavImplHandle.md)
 - [OASOrgApacheSlingJcrWebdavImplServle](OASOrgApacheSlingJcrWebdavImplServle.md)
 - [OASOrgApacheSlingJmxProviderImplJMXR](OASOrgApacheSlingJmxProviderImplJMXR.md)
 - [OASOrgApacheSlingModelsImplModelAdap](OASOrgApacheSlingModelsImplModelAdap.md)
 - [OASOrgApacheSlingModelsJacksonexport](OASOrgApacheSlingModelsJacksonexport.md)
 - [OASOrgApacheSlingResourceInventoryIm](OASOrgApacheSlingResourceInventoryIm.md)
 - [OASOrgApacheSlingResourcemergerImplM](OASOrgApacheSlingResourcemergerImplM.md)
 - [OASOrgApacheSlingResourcemergerPicke](OASOrgApacheSlingResourcemergerPicke.md)
 - [OASOrgApacheSlingScriptingCoreImplSc](OASOrgApacheSlingScriptingCoreImplSc.md)
 - [OASOrgApacheSlingScriptingJavaImplJa](OASOrgApacheSlingScriptingJavaImplJa.md)
 - [OASOrgApacheSlingScriptingJavascript](OASOrgApacheSlingScriptingJavascript.md)
 - [OASOrgApacheSlingScriptingJspJspScri](OASOrgApacheSlingScriptingJspJspScri.md)
 - [OASOrgApacheSlingScriptingSightlyJsI](OASOrgApacheSlingScriptingSightlyJsI.md)
 - [OASOrgApacheSlingSecurityImplContent](OASOrgApacheSlingSecurityImplContent.md)
 - [OASOrgApacheSlingSecurityImplReferre](OASOrgApacheSlingSecurityImplReferre.md)
 - [OASOrgApacheSlingServiceusermappingI](OASOrgApacheSlingServiceusermappingI.md)
 - [OASOrgApacheSlingServletsGetDefaultG](OASOrgApacheSlingServletsGetDefaultG.md)
 - [OASOrgApacheSlingServletsGetImplVers](OASOrgApacheSlingServletsGetImplVers.md)
 - [OASOrgApacheSlingServletsPostImplHel](OASOrgApacheSlingServletsPostImplHel.md)
 - [OASOrgApacheSlingServletsPostImplSli](OASOrgApacheSlingServletsPostImplSli.md)
 - [OASOrgApacheSlingServletsResolverSli](OASOrgApacheSlingServletsResolverSli.md)
 - [OASOrgApacheSlingSettingsImplSlingSe](OASOrgApacheSlingSettingsImplSlingSe.md)
 - [OASOrgApacheSlingStartupfilterImplSt](OASOrgApacheSlingStartupfilterImplSt.md)
 - [OASOrgApacheSlingTenantInternalTenan](OASOrgApacheSlingTenantInternalTenan.md)
 - [OASOrgApacheSlingTracerInternalLogTr](OASOrgApacheSlingTracerInternalLogTr.md)
 - [OASOrgApacheSlingXssImplXSSFilterImp](OASOrgApacheSlingXssImplXSSFilterImp.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### aemAuth

- **Type**: HTTP basic authentication


## Author

opensource@shinesolutions.com

