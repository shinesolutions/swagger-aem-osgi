use async_trait::async_trait;
use axum::extract::*;
use axum_extra::extract::CookieJar;
use bytes::Bytes;
use headers::Host;
use http::Method;
use serde::{Deserialize, Serialize};

use crate::{models, types::*};

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum AnalyticsComponentQueryCacheServiceResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::AnalyticsComponentQueryCacheServiceInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ApacheSlingHealthCheckResultHtmlSerializerResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ApacheSlingHealthCheckResultHtmlSerializerInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeAemFormsndocumentsConfigAemFormsManagerConfigurationResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeAemFormsndocumentsConfigAemFormsManagerConfigurationInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeAemTransactionCoreImplTransactionRecorderResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeAemTransactionCoreImplTransactionRecorderInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHcResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHcInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHcResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHcInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeCqAccountApiAccountManagementServiceResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeCqAccountApiAccountManagementServiceInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeCqAccountImplAccountManagementServletResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeCqAccountImplAccountManagementServletInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeCqAddressImplLocationLocationListServletResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeCqAddressImplLocationLocationListServletInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeCqAuditPurgeDamResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeCqAuditPurgeDamInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeCqAuditPurgePagesResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeCqAuditPurgePagesInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeCqAuditPurgeReplicationResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeCqAuditPurgeReplicationInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeCqCdnRewriterImplAwsCloudFrontRewriterResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeCqCdnRewriterImplAwsCloudFrontRewriterInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeCqCdnRewriterImplCdnConfigServiceImplResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeCqCdnRewriterImplCdnConfigServiceImplInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeCqCdnRewriterImplCdnRewriterResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeCqCdnRewriterImplCdnRewriterInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeCqCommerceImplAssetDynamicImageHandlerResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeCqCommerceImplAssetDynamicImageHandlerInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeCqCommerceImplAssetStaticImageHandlerResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeCqCommerceImplAssetStaticImageHandlerInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeCqCommerceImplAssetVideoHandlerResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeCqCommerceImplAssetVideoHandlerInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeCqCommerceImplPromotionPromotionManagerImplResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeCqCommerceImplPromotionPromotionManagerImplInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeCqCommercePimImplPageEventListenerResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeCqCommercePimImplPageEventListenerInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeCqContentinsightImplReportingServicesSettingsProviderResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeCqContentinsightImplReportingServicesSettingsProviderInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeCqContentinsightImplServletsReportingServicesProxyServleResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeCqContentinsightImplServletsReportingServicesProxyServleInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeCqDamCfmImplComponentComponentConfigImplResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeCqDamCfmImplComponentComponentConfigImplInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeCqDamCfmImplConfFeatureConfigImplResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeCqDamCfmImplConfFeatureConfigImplInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeCqDamCfmImplContentRewriterAssetProcessorResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeCqDamCfmImplContentRewriterAssetProcessorInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeCqDamCfmImplContentRewriterParRangeFilterResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeCqDamCfmImplContentRewriterParRangeFilterInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeCqDamCfmImplContentRewriterPayloadFilterResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeCqDamCfmImplContentRewriterPayloadFilterInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeCqDamDmProcessImagePTiffManagerImplResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeCqDamDmProcessImagePTiffManagerImplInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeCqDamMacSyncHelperImplMacSyncClientImplResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeCqDamMacSyncHelperImplMacSyncClientImplInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeCqDamMacSyncImplDamSyncServiceImplResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeCqDamMacSyncImplDamSyncServiceImplInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeCqDamProcessorNuiImplNuiAssetProcessorResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeCqDamProcessorNuiImplNuiAssetProcessorInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeCqDamS7imagingImplIsImageServerComponentResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeCqDamS7imagingImplIsImageServerComponentInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeCqDamS7imagingImplPsPlatformServerServletResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeCqDamS7imagingImplPsPlatformServerServletInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeCqDamWebdavImplIoAssetIoHandlerResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeCqDamWebdavImplIoAssetIoHandlerInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeCqDamWebdavImplIoSpecialFilesHandlerResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeCqDamWebdavImplIoSpecialFilesHandlerInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeCqDeserfwImplDeserializationFirewallImplResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeCqDeserfwImplDeserializationFirewallImplInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeCqDtmImplServiceDtmWebServiceImplResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeCqDtmImplServiceDtmWebServiceImplInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeCqDtmImplServletsDtmDeployHookServletResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeCqDtmImplServletsDtmDeployHookServletInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeCqDtmReactorImplServiceWebServiceImplResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeCqDtmReactorImplServiceWebServiceImplInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeCqExperiencelogImplExperienceLogConfigServletResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeCqExperiencelogImplExperienceLogConfigServletInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeCqHcContentPackagesHealthCheckResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeCqHcContentPackagesHealthCheckInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeCqHistoryImplHistoryRequestFilterResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeCqHistoryImplHistoryRequestFilterInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeCqHistoryImplHistoryServiceImplResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeCqHistoryImplHistoryServiceImplInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeCqInboxImplTypeproviderItemTypeProviderResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeCqInboxImplTypeproviderItemTypeProviderInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeCqProjectsImplServletProjectImageServletResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeCqProjectsImplServletProjectImageServletInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeCqProjectsPurgeSchedulerResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeCqProjectsPurgeSchedulerInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeCqScheduledExporterImplScheduledExporterImplResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeCqScheduledExporterImplScheduledExporterImplInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeCqScreensDeviceImplDeviceServiceResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeCqScreensDeviceImplDeviceServiceInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeCqScreensImplHandlerChannelsUpdateHandlerResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeCqScreensImplHandlerChannelsUpdateHandlerInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeCqScreensImplScreensChannelPostProcessorResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeCqScreensImplScreensChannelPostProcessorInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeCqScreensMqActivemqImplArtemisJmsProviderResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeCqScreensMqActivemqImplArtemisJmsProviderInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeCqSocialAccountverificationImplAccountManagementConfigImResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeCqSocialAccountverificationImplAccountManagementConfigImInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeCqSocialCalendarServletsTimeZoneServletResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeCqSocialCalendarServletsTimeZoneServletInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSeResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSeInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeCqSocialCommonsCorsCorsAuthenticationFilterResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeCqSocialCommonsCorsCorsAuthenticationFilterInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeCqSocialCommonsEmailreplyImplCustomEmailClientProviderResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeCqSocialCommonsEmailreplyImplCustomEmailClientProviderInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeCqSocialCommonsEmailreplyImplGmailEmailClientProviderResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeCqSocialCommonsEmailreplyImplGmailEmailClientProviderInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeCqSocialCommonsEmailreplyImplIosEmailClientProviderResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeCqSocialCommonsEmailreplyImplIosEmailClientProviderInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProviderResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProviderInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeCqSocialCommonsEmailreplyImplOutLookEmailClientProviderResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeCqSocialCommonsEmailreplyImplOutLookEmailClientProviderInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUgcImageUploadResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUgcImageUploadInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeCqSocialCommonsUgclimiterImplUgcLimiterServiceImplResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeCqSocialCommonsUgclimiterImplUgcLimiterServiceImplInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUgcLimitResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUgcLimitInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeCqSocialConnectOauthImplFacebookProviderImplResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeCqSocialConnectOauthImplFacebookProviderImplInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeCqSocialConnectOauthImplTwitterProviderImplResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeCqSocialConnectOauthImplTwitterProviderImplInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeCqSocialDatastoreAsImplAsResourceProviderFactoryResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeCqSocialDatastoreAsImplAsResourceProviderFactoryInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeCqSocialDatastoreOpImplSocialMsResourceProviderFactoryResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeCqSocialDatastoreOpImplSocialMsResourceProviderFactoryInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeCqSocialDatastoreRdbImplSocialRdbResourceProviderFactorResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeCqSocialDatastoreRdbImplSocialRdbResourceProviderFactorInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResouResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResouInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGeResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGeInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeCqSocialForumClientEndpointsImplForumOperationsServiceResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeCqSocialForumClientEndpointsImplForumOperationsServiceInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeCqSocialForumDispatcherImplFlushOperationsResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeCqSocialForumDispatcherImplFlushOperationsInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeCqSocialGroupImplGroupServiceImplResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeCqSocialGroupImplGroupServiceImplInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeCqSocialNotificationsImplMentionsRouterResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeCqSocialNotificationsImplMentionsRouterInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeCqSocialNotificationsImplNotificationManagerImplResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeCqSocialNotificationsImplNotificationManagerImplInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeCqSocialNotificationsImplNotificationsRouterResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeCqSocialNotificationsImplNotificationsRouterInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeCqSocialScoringImplScoringEventListenerResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeCqSocialScoringImplScoringEventListenerInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeCqSocialSiteImplSiteConfiguratorImplResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeCqSocialSiteImplSiteConfiguratorImplInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeCqSocialSrpImplSocialSolrConnectorResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeCqSocialSrpImplSocialSolrConnectorInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeCqSocialSyncImplDiffChangesObserverResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeCqSocialSyncImplDiffChangesObserverInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeCqSocialSyncImplGroupSyncListenerImplResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeCqSocialSyncImplGroupSyncListenerImplInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeCqSocialSyncImplPublisherSyncServiceImplResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeCqSocialSyncImplPublisherSyncServiceImplInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeCqSocialSyncImplUserSyncListenerImplResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeCqSocialSyncImplUserSyncListenerImplInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeCqSocialTranslationImplUgcLanguageDetectorResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeCqSocialTranslationImplUgcLanguageDetectorInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeCqSocialUgcbaseImplSocialUtilsImplResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeCqSocialUgcbaseImplSocialUtilsImplInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeCqSocialUgcbaseModerationImplSentimentProcessResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeCqSocialUgcbaseModerationImplSentimentProcessInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeCqSocialUserImplTransportHttpToPublisherResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeCqSocialUserImplTransportHttpToPublisherInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeCqUiWcmCommonsInternalServletsRteRteFilterServletFactResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeCqUiWcmCommonsInternalServletsRteRteFilterServletFactInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeCqWcmLaunchesImplLaunchesEventHandlerResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeCqWcmLaunchesImplLaunchesEventHandlerInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeCqWcmMobileQrcodeServletQrCodeImageGeneratorResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeCqWcmMobileQrcodeServletQrCodeImageGeneratorInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeFdFpConfigFormsPortalSchedulerServiceResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeFdFpConfigFormsPortalSchedulerServiceInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeFormsCommonServiceImplDefaultDataProviderResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeFormsCommonServiceImplDefaultDataProviderInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeFormsCommonServletTempCleanUpTaskResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeFormsCommonServletTempCleanUpTaskInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeGraniteAcpPlatformPlatformServletResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeGraniteAcpPlatformPlatformServletInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeGraniteActivitystreamsImplActivityManagerImplResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeGraniteActivitystreamsImplActivityManagerImplInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeGraniteAnalyzerBaseSystemStatusServletResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeGraniteAnalyzerBaseSystemStatusServletInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeGraniteApicontrollerFilterResolverHookFactoryResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeGraniteApicontrollerFilterResolverHookFactoryInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeGraniteAuthCertImplClientCertAuthHandlerResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeGraniteAuthCertImplClientCertAuthHandlerInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeGraniteAuthImsResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeGraniteAuthImsInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeGraniteAuthImsImplImsAccessTokenRequestCustomizerImplResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeGraniteAuthImsImplImsAccessTokenRequestCustomizerImplInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeGraniteAuthImsImplImsConfigProviderImplResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeGraniteAuthImsImplImsConfigProviderImplInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeGraniteAuthImsImplImsInstanceCredentialsValidatorResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeGraniteAuthImsImplImsInstanceCredentialsValidatorInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeGraniteAuthImsImplImsProviderImplResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeGraniteAuthImsImplImsProviderImplInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeGraniteAuthOauthAccesstokenProviderResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeGraniteAuthOauthAccesstokenProviderInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeGraniteAuthOauthImplFacebookProviderImplResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeGraniteAuthOauthImplFacebookProviderImplInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeGraniteAuthOauthImplGithubProviderImplResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeGraniteAuthOauthImplGithubProviderImplInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeGraniteAuthOauthImplGraniteProviderResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeGraniteAuthOauthImplGraniteProviderInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeGraniteAuthOauthImplTwitterProviderImplResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeGraniteAuthOauthImplTwitterProviderImplInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeGraniteAuthOauthProviderResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeGraniteAuthOauthProviderInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeGraniteAuthSamlSamlAuthenticationHandlerResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeGraniteAuthSamlSamlAuthenticationHandlerInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeGraniteBundlesHcImplDavExBundleHealthCheckResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeGraniteBundlesHcImplDavExBundleHealthCheckInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeGraniteBundlesHcImplJobsHealthCheckResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeGraniteBundlesHcImplJobsHealthCheckInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeGraniteBundlesHcImplSlingGetServletHealthCheckResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeGraniteBundlesHcImplSlingGetServletHealthCheckInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheckResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheckInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeGraniteCompatrouterImplRoutingConfigResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeGraniteCompatrouterImplRoutingConfigInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeGraniteCompatrouterImplSwitchMappingConfigResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeGraniteCompatrouterImplSwitchMappingConfigInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeGraniteContexthubImplContextHubImplResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeGraniteContexthubImplContextHubImplInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeGraniteCorsImplCorsPolicyImplResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeGraniteCorsImplCorsPolicyImplInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeGraniteCsrfImplCsrfFilterResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeGraniteCsrfImplCsrfFilterInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeGraniteCsrfImplCsrfServletResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeGraniteCsrfImplCsrfServletInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeGraniteDistributionCoreImplReplicationDistributionTransResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeGraniteDistributionCoreImplReplicationDistributionTransInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeGraniteFragsImplCheckHttpHeaderFlagResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeGraniteFragsImplCheckHttpHeaderFlagInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeGraniteFragsImplRandomFeatureResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeGraniteFragsImplRandomFeatureInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeGraniteHttpcacheFileFileCacheStoreResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeGraniteHttpcacheFileFileCacheStoreInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeGraniteHttpcacheImplOuterCacheFilterResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeGraniteHttpcacheImplOuterCacheFilterInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeGraniteI18nImplBundlePseudoTranslationsResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeGraniteI18nImplBundlePseudoTranslationsInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeGraniteInfocollectorInfoCollectorResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeGraniteInfocollectorInfoCollectorInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeGraniteLicenseImplLicenseCheckFilterResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeGraniteLicenseImplLicenseCheckFilterInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeGraniteLoggingImplLogAnalyserImplResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeGraniteLoggingImplLogAnalyserImplInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeGraniteLoggingImplLogErrorHealthCheckResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeGraniteLoggingImplLogErrorHealthCheckInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeGraniteMonitoringImplScriptConfigImplResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeGraniteMonitoringImplScriptConfigImplInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeGraniteOauthServerImplAccessTokenCleanupTaskResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeGraniteOauthServerImplAccessTokenCleanupTaskInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeGraniteOffloadingImplOffloadingConfiguratorResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeGraniteOffloadingImplOffloadingConfiguratorInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeGraniteOffloadingImplOffloadingJobClonerResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeGraniteOffloadingImplOffloadingJobClonerInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeGraniteOffloadingImplOffloadingJobOffloaderResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeGraniteOffloadingImplOffloadingJobOffloaderInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeGraniteOptoutImplOptOutServiceImplResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeGraniteOptoutImplOptOutServiceImplInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheckResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheckInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeGraniteRepositoryHcImplContinuousRgcHealthCheckResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeGraniteRepositoryHcImplContinuousRgcHealthCheckInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeGraniteRepositoryImplCommitStatsConfigResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeGraniteRepositoryImplCommitStatsConfigInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeGraniteRepositoryServiceUserConfigurationResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeGraniteRepositoryServiceUserConfigurationInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeGraniteResourcestatusImplCompositeStatusTypeResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeGraniteResourcestatusImplCompositeStatusTypeInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeGraniteResourcestatusImplStatusResourceProviderImplResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeGraniteResourcestatusImplStatusResourceProviderImplInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeGraniteRestImplServletDefaultGetServletResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeGraniteRestImplServletDefaultGetServletInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeGraniteSecurityUserUiInternalServletsSslConfigurationSResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeGraniteSecurityUserUiInternalServletsSslConfigurationSInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeGraniteSecurityUserUserPropertiesServiceResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeGraniteSecurityUserUserPropertiesServiceInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeGraniteThreaddumpThreadDumpCollectorResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeGraniteThreaddumpThreadDumpCollectorInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeGraniteTranslationCoreImplTranslationManagerImplResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeGraniteTranslationCoreImplTranslationManagerImplInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeGraniteWorkflowCoreJobJobHandlerResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeGraniteWorkflowCoreJobJobHandlerInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeGraniteWorkflowCorePayloadMapCacheResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeGraniteWorkflowCorePayloadMapCacheInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeGraniteWorkflowCoreWorkflowConfigResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeGraniteWorkflowCoreWorkflowConfigInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeGraniteWorkflowPurgeSchedulerResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeGraniteWorkflowPurgeSchedulerInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeOctopusNcommBootstrapResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeOctopusNcommBootstrapInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComAdobeXmpWorkerFilesNcommXmpFilesNCommResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComAdobeXmpWorkerFilesNcommXmpFilesNCommInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCommonsHttpclientResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCommonsHttpclientInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqAnalyticsImplStorePropertiesChangeListenerResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqAnalyticsImplStorePropertiesChangeListenerInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqAnalyticsSitecatalystImplImporterReportImporterResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqAnalyticsSitecatalystImplImporterReportImporterInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqAnalyticsTestandtargetImplSegmentImporterResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqAnalyticsTestandtargetImplSegmentImporterInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqAuthImplCugCugSupportImplResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqAuthImplCugCugSupportImplInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqAuthImplLoginSelectorHandlerResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqAuthImplLoginSelectorHandlerInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqCommonsImplExternalizerImplResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqCommonsImplExternalizerImplInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqCommonsServletsRootMappingServletResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqCommonsServletsRootMappingServletInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqContentsyncImplContentSyncManagerImplResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqContentsyncImplContentSyncManagerImplInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqDamCommonsHandlerStandardImageHandlerResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqDamCommonsHandlerStandardImageHandlerInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqDamCommonsMetadataXmpFilterBlackWhiteResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqDamCommonsMetadataXmpFilterBlackWhiteInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqDamCommonsUtilImplAssetCacheImplResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqDamCommonsUtilImplAssetCacheImplInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqDamCoreImplAssetMoveListenerResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqDamCoreImplAssetMoveListenerInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqDamCoreImplCacheCqBufferedImageCacheResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqDamCoreImplCacheCqBufferedImageCacheInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqDamCoreImplDamChangeEventListenerResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqDamCoreImplDamChangeEventListenerInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqDamCoreImplDamEventPurgeServiceResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqDamCoreImplDamEventPurgeServiceInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqDamCoreImplDamEventRecorderImplResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqDamCoreImplDamEventRecorderImplInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqDamCoreImplEventDamEventAuditListenerResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqDamCoreImplEventDamEventAuditListenerInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqDamCoreImplExpiryNotificationJobImplResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqDamCoreImplExpiryNotificationJobImplInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqDamCoreImplGfxCommonsGfxRendererResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqDamCoreImplGfxCommonsGfxRendererInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqDamCoreImplHandlerEpsFormatHandlerResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqDamCoreImplHandlerEpsFormatHandlerInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqDamCoreImplHandlerIndesignFormatHandlerResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqDamCoreImplHandlerIndesignFormatHandlerInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqDamCoreImplHandlerJpegHandlerResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqDamCoreImplHandlerJpegHandlerInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqDamCoreImplHandlerXmpNCommXmpHandlerResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqDamCoreImplHandlerXmpNCommXmpHandlerInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqDamCoreImplJmxAssetMigrationMBeanImplResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqDamCoreImplJmxAssetMigrationMBeanImplInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqDamCoreImplJmxAssetUpdateMonitorImplResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqDamCoreImplJmxAssetUpdateMonitorImplInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqDamCoreImplLightboxLightboxServletResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqDamCoreImplLightboxLightboxServletInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqDamCoreImplMissingMetadataNotificationJobResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqDamCoreImplMissingMetadataNotificationJobInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqDamCoreImplProcessTextExtractionProcessResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqDamCoreImplProcessTextExtractionProcessInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqDamCoreImplRenditionMakerImplResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqDamCoreImplRenditionMakerImplInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqDamCoreImplReportsReportExportServiceResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqDamCoreImplReportsReportExportServiceInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqDamCoreImplReportsReportPurgeServiceResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqDamCoreImplReportsReportPurgeServiceInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqDamCoreImplServletAssetDownloadServletResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqDamCoreImplServletAssetDownloadServletInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqDamCoreImplServletAssetStatusServletResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqDamCoreImplServletAssetStatusServletInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqDamCoreImplServletAssetXmpSearchServletResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqDamCoreImplServletAssetXmpSearchServletInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqDamCoreImplServletBatchMetadataServletResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqDamCoreImplServletBatchMetadataServletInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqDamCoreImplServletBinaryProviderServletResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqDamCoreImplServletBinaryProviderServletInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqDamCoreImplServletCollectionServletResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqDamCoreImplServletCollectionServletInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqDamCoreImplServletCollectionsServletResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqDamCoreImplServletCollectionsServletInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqDamCoreImplServletCompanionServletResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqDamCoreImplServletCompanionServletInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqDamCoreImplServletCreateAssetServletResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqDamCoreImplServletCreateAssetServletInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqDamCoreImplServletDamContentDispositionFilterResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqDamCoreImplServletDamContentDispositionFilterInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqDamCoreImplServletGuidLookupFilterResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqDamCoreImplServletGuidLookupFilterInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqDamCoreImplServletHealthCheckServletResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqDamCoreImplServletHealthCheckServletInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqDamCoreImplServletMetadataGetServletResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqDamCoreImplServletMetadataGetServletInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqDamCoreImplServletMultipleLicenseAcceptServletResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqDamCoreImplServletMultipleLicenseAcceptServletInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqDamCoreImplServletResourceCollectionServletResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqDamCoreImplServletResourceCollectionServletInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqDamCoreImplUnzipUnzipConfigResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqDamCoreImplUnzipUnzipConfigInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqDamCoreProcessExifToolExtractMetadataProcessResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqDamCoreProcessExifToolExtractMetadataProcessInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqDamCoreProcessExtractMetadataProcessResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqDamCoreProcessExtractMetadataProcessInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqDamCoreProcessMetadataProcessorProcessResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqDamCoreProcessMetadataProcessorProcessInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqDamHandlerFfmpegLocatorImplResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqDamHandlerFfmpegLocatorImplInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqDamHandlerStandardPdfPdfHandlerResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqDamHandlerStandardPdfPdfHandlerInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqDamHandlerStandardPsPostScriptHandlerResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqDamHandlerStandardPsPostScriptHandlerInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqDamHandlerStandardPsdPsdHandlerResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqDamHandlerStandardPsdPsdHandlerInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqDamIdsImplIdsJobProcessorResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqDamIdsImplIdsJobProcessorInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqDamIdsImplIdsPoolManagerImplResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqDamIdsImplIdsPoolManagerImplInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqDamInddImplHandlerIndesignXmpHandlerResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqDamInddImplHandlerIndesignXmpHandlerInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqDamInddImplServletSnippetCreationServletResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqDamInddImplServletSnippetCreationServletInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqDamInddProcessInddMediaExtractProcessResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqDamInddProcessInddMediaExtractProcessInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqDamS7damCommonPostServletsSetCreateHandlerResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqDamS7damCommonPostServletsSetCreateHandlerInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqDamS7damCommonPostServletsSetModifyHandlerResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqDamS7damCommonPostServletsSetModifyHandlerInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqDamS7damCommonS7damDamChangeEventListenerResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqDamS7damCommonS7damDamChangeEventListenerInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqDamS7damCommonServletsS7damProductInfoServletResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqDamS7damCommonServletsS7damProductInfoServletInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqDamScene7ImplScene7ApiClientImplResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqDamScene7ImplScene7ApiClientImplInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqDamScene7ImplScene7ConfigurationEventListenerResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqDamScene7ImplScene7ConfigurationEventListenerInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqDamScene7ImplScene7DamChangeEventListenerResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqDamScene7ImplScene7DamChangeEventListenerInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqDamScene7ImplScene7UploadServiceImplResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqDamScene7ImplScene7UploadServiceImplInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqDamStockIntegrationImplConfigurationStockConfigurationResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqDamStockIntegrationImplConfigurationStockConfigurationInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqDamVideoImplServletVideoTestServletResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqDamVideoImplServletVideoTestServletInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqExtwidgetServletsImageSpriteServletResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqExtwidgetServletsImageSpriteServletInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqImageInternalFontFontHelperResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqImageInternalFontFontHelperInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqJcrclustersupportClusterStartLevelControllerResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqJcrclustersupportClusterStartLevelControllerInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqMailerDefaultMailServiceResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqMailerDefaultMailServiceInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqMailerImplCqMailingServiceResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqMailerImplCqMailingServiceInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqMailerImplEmailCqEmailTemplateFactoryResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqMailerImplEmailCqEmailTemplateFactoryInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqMailerImplEmailCqRetrieverTemplateFactoryResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqMailerImplEmailCqRetrieverTemplateFactoryInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqMcmCampaignImplIntegrationConfigImplResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqMcmCampaignImplIntegrationConfigImplInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqMcmImplMcmConfigurationResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqMcmImplMcmConfigurationInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCtaComponentResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCtaComponentInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqNotificationImplNotificationServiceImplResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqNotificationImplNotificationServiceImplInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqPersonalizationImplServletsTargetingConfigurationServletResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqPersonalizationImplServletsTargetingConfigurationServletInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqPollingImporterImplManagedPollConfigImplResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqPollingImporterImplManagedPollConfigImplInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqPollingImporterImplManagedPollingImporterImplResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqPollingImporterImplManagedPollingImporterImplInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqPollingImporterImplPollingImporterImplResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqPollingImporterImplPollingImporterImplInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqReplicationAuditReplicationEventListenerResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqReplicationAuditReplicationEventListenerInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqReplicationContentStaticContentBuilderResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqReplicationContentStaticContentBuilderInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqReplicationImplAgentManagerImplResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqReplicationImplAgentManagerImplInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqReplicationImplContentDurboBinaryLessContentBuilderResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqReplicationImplContentDurboBinaryLessContentBuilderInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqReplicationImplContentDurboDurboImportConfigurationProvResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqReplicationImplContentDurboDurboImportConfigurationProvInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqReplicationImplReplicationContentFactoryProviderImplResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqReplicationImplReplicationContentFactoryProviderImplInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqReplicationImplReplicationReceiverImplResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqReplicationImplReplicationReceiverImplInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqReplicationImplReplicatorImplResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqReplicationImplReplicatorImplInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqReplicationImplReverseReplicatorResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqReplicationImplReverseReplicatorInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqReplicationImplTransportBinaryLessTransportHandlerResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqReplicationImplTransportBinaryLessTransportHandlerInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqReplicationImplTransportHttpResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqReplicationImplTransportHttpInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqReportingImplCacheCacheImplResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqReportingImplCacheCacheImplInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqReportingImplConfigServiceImplResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqReportingImplConfigServiceImplInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqReportingImplRLogAnalyzerResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqReportingImplRLogAnalyzerInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqRewriterLinkcheckerImplLinkCheckerImplResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqRewriterLinkcheckerImplLinkCheckerImplInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqRewriterLinkcheckerImplLinkCheckerTaskResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqRewriterLinkcheckerImplLinkCheckerTaskInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqRewriterProcessorImplHtmlParserFactoryResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqRewriterProcessorImplHtmlParserFactoryInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqSearchImplBuilderQueryBuilderImplResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqSearchImplBuilderQueryBuilderImplInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqSearchSuggestImplSuggestionIndexManagerImplResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqSearchSuggestImplSuggestionIndexManagerImplInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqSearchpromoteImplSearchPromoteServiceImplResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqSearchpromoteImplSearchPromoteServiceImplInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqSecurityAclSetupResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqSecurityAclSetupInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqStatisticsImplStatisticsServiceImplResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqStatisticsImplStatisticsServiceImplInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqTaggingImplJcrTagManagerFactoryImplResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqTaggingImplJcrTagManagerFactoryImplInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqTaggingImplSearchTagPredicateEvaluatorResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqTaggingImplSearchTagPredicateEvaluatorInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqTaggingImplTagGarbageCollectorResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqTaggingImplTagGarbageCollectorInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqWcmCoreImplAuthoringUiModeServiceImplResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqWcmCoreImplAuthoringUiModeServiceImplInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqWcmCoreImplCommandsWcmCommandServletResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqWcmCoreImplCommandsWcmCommandServletInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqWcmCoreImplEventPageEventAuditListenerResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqWcmCoreImplEventPageEventAuditListenerInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqWcmCoreImplEventPagePostProcessorResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqWcmCoreImplEventPagePostProcessorInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqWcmCoreImplEventRepositoryChangeEventListenerResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqWcmCoreImplEventRepositoryChangeEventListenerInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqWcmCoreImplEventTemplatePostProcessorResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqWcmCoreImplEventTemplatePostProcessorInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqWcmCoreImplLanguageManagerImplResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqWcmCoreImplLanguageManagerImplInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqWcmCoreImplPagePageInfoAggregatorImplResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqWcmCoreImplPagePageInfoAggregatorImplInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqWcmCoreImplPagePageManagerFactoryImplResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqWcmCoreImplPagePageManagerFactoryImplInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqWcmCoreImplReferencesContentContentReferenceConfigResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqWcmCoreImplReferencesContentContentReferenceConfigInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqWcmCoreImplServletsFindReplaceServletResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqWcmCoreImplServletsFindReplaceServletInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqWcmCoreImplServletsReferenceSearchServletResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqWcmCoreImplServletsReferenceSearchServletInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqWcmCoreImplServletsThumbnailServletResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqWcmCoreImplServletsThumbnailServletInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqWcmCoreImplVariantsPageVariantsProviderImplResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqWcmCoreImplVariantsPageVariantsProviderImplInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqWcmCoreImplVersionManagerImplResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqWcmCoreImplVersionManagerImplInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqWcmCoreImplVersionPurgeTaskResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqWcmCoreImplVersionPurgeTaskInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqWcmCoreImplWarpTimeWarpFilterResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqWcmCoreImplWarpTimeWarpFilterInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqWcmCoreImplWcmDebugFilterResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqWcmCoreImplWcmDebugFilterInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqWcmCoreImplWcmDeveloperModeFilterResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqWcmCoreImplWcmDeveloperModeFilterInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqWcmCoreMvtMvtStatisticsImplResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqWcmCoreMvtMvtStatisticsImplInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqWcmCoreStatsPageViewStatisticsImplResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqWcmCoreStatsPageViewStatisticsImplInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqWcmCoreWcmRequestFilterResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqWcmCoreWcmRequestFilterInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqWcmDesignimporterDesignPackageImporterResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqWcmDesignimporterDesignPackageImporterInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqWcmDesignimporterImplCanvasBuilderImplResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqWcmDesignimporterImplCanvasBuilderImplInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqWcmDesignimporterImplEntryPreprocessorImplResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqWcmDesignimporterImplEntryPreprocessorImplInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqWcmDesignimporterParserTaghandlersFactoryCanvasComponeResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqWcmDesignimporterParserTaghandlersFactoryCanvasComponeInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultComponResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultComponInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultTagHanResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultTagHanInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqWcmDesignimporterParserTaghandlersFactoryHeadTagHandleResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqWcmDesignimporterParserTaghandlersFactoryHeadTagHandleInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqWcmDesignimporterParserTaghandlersFactoryIFrameTagHandResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqWcmDesignimporterParserTaghandlersFactoryIFrameTagHandInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqWcmDesignimporterParserTaghandlersFactoryImageComponenResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqWcmDesignimporterParserTaghandlersFactoryImageComponenInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandlerResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandlerInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqWcmDesignimporterParserTaghandlersFactoryInlineScriptTResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqWcmDesignimporterParserTaghandlersFactoryInlineScriptTInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqWcmDesignimporterParserTaghandlersFactoryLinkTagHandleResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqWcmDesignimporterParserTaghandlersFactoryLinkTagHandleInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqWcmDesignimporterParserTaghandlersFactoryMetaTagHandleResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqWcmDesignimporterParserTaghandlersFactoryMetaTagHandleInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqWcmDesignimporterParserTaghandlersFactoryNonScriptTagHResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqWcmDesignimporterParserTaghandlersFactoryNonScriptTagHInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqWcmDesignimporterParserTaghandlersFactoryParsysComponeResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqWcmDesignimporterParserTaghandlersFactoryParsysComponeInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqWcmDesignimporterParserTaghandlersFactoryScriptTagHandResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqWcmDesignimporterParserTaghandlersFactoryScriptTagHandInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqWcmDesignimporterParserTaghandlersFactoryStyleTagHandlResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqWcmDesignimporterParserTaghandlersFactoryStyleTagHandlInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqWcmDesignimporterParserTaghandlersFactoryTextComponentResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqWcmDesignimporterParserTaghandlersFactoryTextComponentInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleComponenResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleComponenInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleTagHandlResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleTagHandlInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqWcmFoundationFormsImplFormChooserServletResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqWcmFoundationFormsImplFormChooserServletInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqWcmFoundationFormsImplFormsHandlingServletResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqWcmFoundationFormsImplFormsHandlingServletInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqWcmFoundationFormsImplMailServletResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqWcmFoundationFormsImplMailServletInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqWcmFoundationImplAdaptiveImageComponentServletResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqWcmFoundationImplAdaptiveImageComponentServletInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqWcmFoundationImplHttpAuthHandlerResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqWcmFoundationImplHttpAuthHandlerInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqWcmFoundationImplPageImpressionsTrackerResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqWcmFoundationImplPageImpressionsTrackerInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqWcmFoundationImplPageRedirectServletResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqWcmFoundationImplPageRedirectServletInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqWcmMobileCoreImplRedirectRedirectFilterResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqWcmMobileCoreImplRedirectRedirectFilterInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqWcmMsmImplActionsContentCopyActionFactoryResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqWcmMsmImplActionsContentCopyActionFactoryInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqWcmMsmImplActionsContentDeleteActionFactoryResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqWcmMsmImplActionsContentDeleteActionFactoryInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqWcmMsmImplActionsContentUpdateActionFactoryResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqWcmMsmImplActionsContentUpdateActionFactoryInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqWcmMsmImplActionsPageMoveActionFactoryResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqWcmMsmImplActionsPageMoveActionFactoryInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqWcmMsmImplActionsVersionCopyActionFactoryResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqWcmMsmImplActionsVersionCopyActionFactoryInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqWcmMsmImplLiveRelationshipManagerImplResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqWcmMsmImplLiveRelationshipManagerImplInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqWcmMsmImplRolloutManagerImplResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqWcmMsmImplRolloutManagerImplInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqWcmMsmImplServletsAuditLogServletResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqWcmMsmImplServletsAuditLogServletInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqWcmNotificationEmailImplEmailChannelResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqWcmNotificationEmailImplEmailChannelInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqWcmNotificationImplNotificationManagerImplResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqWcmNotificationImplNotificationManagerImplInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqWcmScriptingImplBvpManagerResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqWcmScriptingImplBvpManagerInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqWcmUndoUndoConfigResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqWcmUndoUndoConfigInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqWcmWebservicesupportImplReplicationEventListenerResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqWcmWebservicesupportImplReplicationEventListenerInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqWcmWorkflowImplWcmWorkflowServiceImplResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqWcmWorkflowImplWcmWorkflowServiceImplInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqWidgetImplHtmlLibraryManagerImplResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqWidgetImplHtmlLibraryManagerImplInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqWidgetImplWidgetExtensionProviderImplResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqWidgetImplWidgetExtensionProviderImplInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqWorkflowImplEmailEMailNotificationServiceResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqWorkflowImplEmailEMailNotificationServiceInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCqWorkflowImplEmailTaskEMailNotificationServiceResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCqWorkflowImplEmailTaskEMailNotificationServiceInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum ComDayCrxSecurityTokenImplTokenCleanupTaskResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::ComDayCrxSecurityTokenImplTokenCleanupTaskInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum GuideLocalizationServiceResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::GuideLocalizationServiceInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum MessagingUserComponentFactoryResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::MessagingUserComponentFactoryInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum OrgApacheAriesJmxFrameworkStateConfigResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::OrgApacheAriesJmxFrameworkStateConfigInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum OrgApacheFelixEventadminImplEventAdminResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::OrgApacheFelixEventadminImplEventAdminInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum OrgApacheFelixHttpResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::OrgApacheFelixHttpInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum OrgApacheFelixHttpSslfilterSslFilterResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::OrgApacheFelixHttpSslfilterSslFilterInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum OrgApacheFelixJaasConfigurationFactoryResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::OrgApacheFelixJaasConfigurationFactoryInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum OrgApacheFelixJaasConfigurationSpiResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::OrgApacheFelixJaasConfigurationSpiInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum OrgApacheFelixScrScrServiceResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::OrgApacheFelixScrScrServiceInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum OrgApacheFelixSystemreadyImplComponentsCheckResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::OrgApacheFelixSystemreadyImplComponentsCheckInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum OrgApacheFelixSystemreadyImplFrameworkStartCheckResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::OrgApacheFelixSystemreadyImplFrameworkStartCheckInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum OrgApacheFelixSystemreadyImplServicesCheckResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::OrgApacheFelixSystemreadyImplServicesCheckInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum OrgApacheFelixSystemreadyImplServletSystemAliveServletResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::OrgApacheFelixSystemreadyImplServletSystemAliveServletInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum OrgApacheFelixSystemreadyImplServletSystemReadyServletResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::OrgApacheFelixSystemreadyImplServletSystemReadyServletInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum OrgApacheFelixSystemreadySystemReadyMonitorResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::OrgApacheFelixSystemreadySystemReadyMonitorInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum OrgApacheFelixWebconsoleInternalServletOsgiManagerResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::OrgApacheFelixWebconsoleInternalServletOsgiManagerInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum OrgApacheFelixWebconsolePluginsEventInternalPluginServletResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::OrgApacheFelixWebconsolePluginsEventInternalPluginServletInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum OrgApacheHttpProxyconfiguratorResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::OrgApacheHttpProxyconfiguratorInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum OrgApacheJackrabbitOakSecurityUserUserConfigurationImplResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::OrgApacheJackrabbitOakSecurityUserUserConfigurationImplInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum OrgApacheJackrabbitVaultPackagingImplPackagingImplResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::OrgApacheJackrabbitVaultPackagingImplPackagingImplInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum OrgApacheJackrabbitVaultPackagingRegistryImplFsPackageRegistryResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::OrgApacheJackrabbitVaultPackagingRegistryImplFsPackageRegistryInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum OrgApacheSlingAuthCoreImplLogoutServletResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::OrgApacheSlingAuthCoreImplLogoutServletInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum OrgApacheSlingCaconfigImplConfigurationResolverImplResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::OrgApacheSlingCaconfigImplConfigurationResolverImplInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum OrgApacheSlingCommonsLogLogManagerResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::OrgApacheSlingCommonsLogLogManagerInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum OrgApacheSlingCommonsLogLogManagerFactoryConfigResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::OrgApacheSlingCommonsLogLogManagerFactoryConfigInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum OrgApacheSlingCommonsLogLogManagerFactoryWriterResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::OrgApacheSlingCommonsLogLogManagerFactoryWriterInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum OrgApacheSlingCommonsMetricsInternalLogReporterResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::OrgApacheSlingCommonsMetricsInternalLogReporterInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum OrgApacheSlingCommonsSchedulerImplQuartzSchedulerResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::OrgApacheSlingCommonsSchedulerImplQuartzSchedulerInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum OrgApacheSlingDatasourceDataSourceFactoryResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::OrgApacheSlingDatasourceDataSourceFactoryInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum OrgApacheSlingDatasourceJndiDataSourceFactoryResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::OrgApacheSlingDatasourceJndiDataSourceFactoryInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum OrgApacheSlingDiscoveryOakConfigResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::OrgApacheSlingDiscoveryOakConfigInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum OrgApacheSlingDistributionPackagingImplExporterAgentDistributioResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::OrgApacheSlingDistributionPackagingImplExporterAgentDistributioInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum OrgApacheSlingDistributionPackagingImplExporterLocalDistributioResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::OrgApacheSlingDistributionPackagingImplExporterLocalDistributioInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum OrgApacheSlingDistributionPackagingImplImporterLocalDistributioResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::OrgApacheSlingDistributionPackagingImplImporterLocalDistributioInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum OrgApacheSlingDistributionResourcesImplDistributionConfigurationResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::OrgApacheSlingDistributionResourcesImplDistributionConfigurationInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum OrgApacheSlingDistributionResourcesImplDistributionServiceResourResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::OrgApacheSlingDistributionResourcesImplDistributionServiceResourInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum OrgApacheSlingDistributionSerializationImplDistributionPackageBuResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::OrgApacheSlingDistributionSerializationImplDistributionPackageBuInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum OrgApacheSlingDistributionSerializationImplVltVaultDistributionResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::OrgApacheSlingDistributionSerializationImplVltVaultDistributionInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum OrgApacheSlingDistributionTransportImplUserCredentialsDistributiResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::OrgApacheSlingDistributionTransportImplUserCredentialsDistributiInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum OrgApacheSlingDistributionTriggerImplDistributionEventDistributeResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::OrgApacheSlingDistributionTriggerImplDistributionEventDistributeInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum OrgApacheSlingEngineImplAuthSlingAuthenticatorResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::OrgApacheSlingEngineImplAuthSlingAuthenticatorInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum OrgApacheSlingEngineImplLogRequestLoggerResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::OrgApacheSlingEngineImplLogRequestLoggerInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum OrgApacheSlingEngineImplLogRequestLoggerServiceResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::OrgApacheSlingEngineImplLogRequestLoggerServiceInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum OrgApacheSlingEngineImplSlingMainServletResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::OrgApacheSlingEngineImplSlingMainServletInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum OrgApacheSlingEngineParametersResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::OrgApacheSlingEngineParametersInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum OrgApacheSlingEventImplEventingThreadPoolResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::OrgApacheSlingEventImplEventingThreadPoolInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum OrgApacheSlingEventImplJobsDefaultJobManagerResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::OrgApacheSlingEventImplJobsDefaultJobManagerInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum OrgApacheSlingEventImplJobsJcrPersistenceHandlerResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::OrgApacheSlingEventImplJobsJcrPersistenceHandlerInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum OrgApacheSlingEventImplJobsJobConsumerManagerResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::OrgApacheSlingEventImplJobsJobConsumerManagerInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum OrgApacheSlingEventJobsQueueConfigurationResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::OrgApacheSlingEventJobsQueueConfigurationInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum OrgApacheSlingFeatureflagsFeatureResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::OrgApacheSlingFeatureflagsFeatureInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum OrgApacheSlingFeatureflagsImplConfiguredFeatureResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::OrgApacheSlingFeatureflagsImplConfiguredFeatureInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum OrgApacheSlingHapiImplHApiUtilImplResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::OrgApacheSlingHapiImplHApiUtilImplInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum OrgApacheSlingHcCoreImplCompositeHealthCheckResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::OrgApacheSlingHcCoreImplCompositeHealthCheckInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum OrgApacheSlingHcCoreImplJmxAttributeHealthCheckResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::OrgApacheSlingHcCoreImplJmxAttributeHealthCheckInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum OrgApacheSlingHcCoreImplScriptableHealthCheckResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::OrgApacheSlingHcCoreImplScriptableHealthCheckInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum OrgApacheSlingI18nImplI18NFilterResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::OrgApacheSlingI18nImplI18NFilterInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum OrgApacheSlingI18nImplJcrResourceBundleProviderResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::OrgApacheSlingI18nImplJcrResourceBundleProviderInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum OrgApacheSlingInstallerProviderJcrImplJcrInstallerResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::OrgApacheSlingInstallerProviderJcrImplJcrInstallerInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum OrgApacheSlingJcrBaseInternalLoginAdminWhitelistResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::OrgApacheSlingJcrBaseInternalLoginAdminWhitelistInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum OrgApacheSlingJcrDavexImplServletsSlingDavExServletResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::OrgApacheSlingJcrDavexImplServletsSlingDavExServletInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum OrgApacheSlingJcrRepoinitImplRepositoryInitializerResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::OrgApacheSlingJcrRepoinitImplRepositoryInitializerInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum OrgApacheSlingJcrRepoinitRepositoryInitializerResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::OrgApacheSlingJcrRepoinitRepositoryInitializerInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum OrgApacheSlingJmxProviderImplJmxResourceProviderResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::OrgApacheSlingJmxProviderImplJmxResourceProviderInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum OrgApacheSlingModelsImplModelAdapterFactoryResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::OrgApacheSlingModelsImplModelAdapterFactoryInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum OrgApacheSlingResourcemergerPickerOverridingResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::OrgApacheSlingResourcemergerPickerOverridingInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum OrgApacheSlingScriptingCoreImplScriptCacheImplResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::OrgApacheSlingScriptingCoreImplScriptCacheImplInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum OrgApacheSlingScriptingJspJspScriptEngineFactoryResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::OrgApacheSlingScriptingJspJspScriptEngineFactoryInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum OrgApacheSlingSecurityImplContentDispositionFilterResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::OrgApacheSlingSecurityImplContentDispositionFilterInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum OrgApacheSlingSecurityImplReferrerFilterResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::OrgApacheSlingSecurityImplReferrerFilterInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum OrgApacheSlingServiceusermappingImplServiceUserMapperImplResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::OrgApacheSlingServiceusermappingImplServiceUserMapperImplInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum OrgApacheSlingServletsGetDefaultGetServletResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::OrgApacheSlingServletsGetDefaultGetServletInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum OrgApacheSlingServletsGetImplVersionVersionInfoServletResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::OrgApacheSlingServletsGetImplVersionVersionInfoServletInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum OrgApacheSlingServletsPostImplSlingPostServletResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::OrgApacheSlingServletsPostImplSlingPostServletInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum OrgApacheSlingServletsResolverSlingServletResolverResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::OrgApacheSlingServletsResolverSlingServletResolverInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum OrgApacheSlingSettingsImplSlingSettingsServiceImplResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::OrgApacheSlingSettingsImplSlingSettingsServiceImplInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum OrgApacheSlingStartupfilterImplStartupFilterImplResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::OrgApacheSlingStartupfilterImplStartupFilterImplInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum OrgApacheSlingTenantInternalTenantProviderImplResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::OrgApacheSlingTenantInternalTenantProviderImplInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum OrgApacheSlingTracerInternalLogTracerResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::OrgApacheSlingTracerInternalLogTracerInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}

#[derive(Debug, PartialEq, Serialize, Deserialize)]
#[must_use]
#[allow(clippy::large_enum_variant)]
pub enum OrgApacheSlingXssImplXssFilterImplResponse {
    /// Successfully retrieved configuration parameters
    Status200_SuccessfullyRetrievedConfigurationParameters
    (models::OrgApacheSlingXssImplXssFilterImplInfo)
    ,
    /// Default response
    Status302_DefaultResponse
    (String)
    ,
    /// Default response
    Status0_DefaultResponse
    (String)
}




/// Configmgr
#[async_trait]
#[allow(clippy::ptr_arg)]
pub trait Configmgr<E: std::fmt::Debug + Send + Sync + 'static = ()>: super::ErrorHandler<E> {
    type Claims;

    /// AdaptiveFormAndInteractiveCommunicationWebChannelConfiguration - POST /system/console/configMgr/Adaptive Form and Interactive Communication Web Channel Configuration
    async fn adaptive_form_and_interactive_communication_web_channel_configuration(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationQueryParams,
    ) -> Result<AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationResponse, E>;

    /// AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigur - POST /system/console/configMgr/Adaptive Form and Interactive Communication Web Channel Theme Configuration
    async fn adaptive_form_and_interactive_communication_web_channel_theme_configur(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurQueryParams,
    ) -> Result<AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurResponse, E>;

    /// AnalyticsComponentQueryCacheService - POST /system/console/configMgr/Analytics Component Query Cache Service
    async fn analytics_component_query_cache_service(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::AnalyticsComponentQueryCacheServiceQueryParams,
    ) -> Result<AnalyticsComponentQueryCacheServiceResponse, E>;

    /// ApacheSlingHealthCheckResultHtmlSerializer - POST /system/console/configMgr/Apache Sling Health Check Result HTML Serializer
    async fn apache_sling_health_check_result_html_serializer(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ApacheSlingHealthCheckResultHtmlSerializerQueryParams,
    ) -> Result<ApacheSlingHealthCheckResultHtmlSerializerResponse, E>;

    /// ComAdobeAemFormsndocumentsConfigAemFormsManagerConfiguration - POST /system/console/configMgr/com.adobe.aem.formsndocuments.config.AEMFormsManagerConfiguration
    async fn com_adobe_aem_formsndocuments_config_aem_forms_manager_configuration(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeAemFormsndocumentsConfigAemFormsManagerConfigurationQueryParams,
    ) -> Result<ComAdobeAemFormsndocumentsConfigAemFormsManagerConfigurationResponse, E>;

    /// ComAdobeAemTransactionCoreImplTransactionRecorder - POST /system/console/configMgr/com.adobe.aem.transaction.core.impl.TransactionRecorder
    async fn com_adobe_aem_transaction_core_impl_transaction_recorder(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeAemTransactionCoreImplTransactionRecorderQueryParams,
    ) -> Result<ComAdobeAemTransactionCoreImplTransactionRecorderResponse, E>;

    /// ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHc - POST /system/console/configMgr/com.adobe.aem.upgrade.prechecks.hc.impl.DeprecateIndexesHC
    async fn com_adobe_aem_upgrade_prechecks_hc_impl_deprecate_indexes_hc(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHcQueryParams,
    ) -> Result<ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHcResponse, E>;

    /// ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHc - POST /system/console/configMgr/com.adobe.aem.upgrade.prechecks.hc.impl.ReplicationAgentsDisabledHC
    async fn com_adobe_aem_upgrade_prechecks_hc_impl_replication_agents_disabled_hc(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHcQueryParams,
    ) -> Result<ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHcResponse, E>;

    /// ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImpl - POST /system/console/configMgr/com.adobe.aem.upgrade.prechecks.mbean.impl.PreUpgradeTasksMBeanImpl
    async fn com_adobe_aem_upgrade_prechecks_mbean_impl_pre_upgrade_tasks_m_bean_impl(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplQueryParams,
    ) -> Result<ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplResponse, E>;

    /// ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImpl - POST /system/console/configMgr/com.adobe.aem.upgrade.prechecks.tasks.impl.ConsistencyCheckTaskImpl
    async fn com_adobe_aem_upgrade_prechecks_tasks_impl_consistency_check_task_impl(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplQueryParams,
    ) -> Result<ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplResponse, E>;

    /// ComAdobeCqAccountApiAccountManagementService - POST /system/console/configMgr/com.adobe.cq.account.api.AccountManagementService
    async fn com_adobe_cq_account_api_account_management_service(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeCqAccountApiAccountManagementServiceQueryParams,
    ) -> Result<ComAdobeCqAccountApiAccountManagementServiceResponse, E>;

    /// ComAdobeCqAccountImplAccountManagementServlet - POST /system/console/configMgr/com.adobe.cq.account.impl.AccountManagementServlet
    async fn com_adobe_cq_account_impl_account_management_servlet(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeCqAccountImplAccountManagementServletQueryParams,
    ) -> Result<ComAdobeCqAccountImplAccountManagementServletResponse, E>;

    /// ComAdobeCqAddressImplLocationLocationListServlet - POST /system/console/configMgr/com.adobe.cq.address.impl.location.LocationListServlet
    async fn com_adobe_cq_address_impl_location_location_list_servlet(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeCqAddressImplLocationLocationListServletQueryParams,
    ) -> Result<ComAdobeCqAddressImplLocationLocationListServletResponse, E>;

    /// ComAdobeCqAuditPurgeDam - POST /system/console/configMgr/com.adobe.cq.audit.purge.Dam
    async fn com_adobe_cq_audit_purge_dam(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeCqAuditPurgeDamQueryParams,
    ) -> Result<ComAdobeCqAuditPurgeDamResponse, E>;

    /// ComAdobeCqAuditPurgePages - POST /system/console/configMgr/com.adobe.cq.audit.purge.Pages
    async fn com_adobe_cq_audit_purge_pages(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeCqAuditPurgePagesQueryParams,
    ) -> Result<ComAdobeCqAuditPurgePagesResponse, E>;

    /// ComAdobeCqAuditPurgeReplication - POST /system/console/configMgr/com.adobe.cq.audit.purge.Replication
    async fn com_adobe_cq_audit_purge_replication(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeCqAuditPurgeReplicationQueryParams,
    ) -> Result<ComAdobeCqAuditPurgeReplicationResponse, E>;

    /// ComAdobeCqCdnRewriterImplAwsCloudFrontRewriter - POST /system/console/configMgr/com.adobe.cq.cdn.rewriter.impl.AWSCloudFrontRewriter
    async fn com_adobe_cq_cdn_rewriter_impl_aws_cloud_front_rewriter(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeCqCdnRewriterImplAwsCloudFrontRewriterQueryParams,
    ) -> Result<ComAdobeCqCdnRewriterImplAwsCloudFrontRewriterResponse, E>;

    /// ComAdobeCqCdnRewriterImplCdnConfigServiceImpl - POST /system/console/configMgr/com.adobe.cq.cdn.rewriter.impl.CDNConfigServiceImpl
    async fn com_adobe_cq_cdn_rewriter_impl_cdn_config_service_impl(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeCqCdnRewriterImplCdnConfigServiceImplQueryParams,
    ) -> Result<ComAdobeCqCdnRewriterImplCdnConfigServiceImplResponse, E>;

    /// ComAdobeCqCdnRewriterImplCdnRewriter - POST /system/console/configMgr/com.adobe.cq.cdn.rewriter.impl.CDNRewriter
    async fn com_adobe_cq_cdn_rewriter_impl_cdn_rewriter(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeCqCdnRewriterImplCdnRewriterQueryParams,
    ) -> Result<ComAdobeCqCdnRewriterImplCdnRewriterResponse, E>;

    /// ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandle - POST /system/console/configMgr/com.adobe.cq.cloudconfig.core.impl.ConfigurationReplicationEventHandler
    async fn com_adobe_cq_cloudconfig_core_impl_configuration_replication_event_handle(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleQueryParams,
    ) -> Result<ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleResponse, E>;

    /// ComAdobeCqCommerceImplAssetDynamicImageHandler - POST /system/console/configMgr/com.adobe.cq.commerce.impl.asset.DynamicImageHandler
    async fn com_adobe_cq_commerce_impl_asset_dynamic_image_handler(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeCqCommerceImplAssetDynamicImageHandlerQueryParams,
    ) -> Result<ComAdobeCqCommerceImplAssetDynamicImageHandlerResponse, E>;

    /// ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImpl - POST /system/console/configMgr/com.adobe.cq.commerce.impl.asset.ProductAssetHandlerProviderImpl
    async fn com_adobe_cq_commerce_impl_asset_product_asset_handler_provider_impl(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplQueryParams,
    ) -> Result<ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplResponse, E>;

    /// ComAdobeCqCommerceImplAssetStaticImageHandler - POST /system/console/configMgr/com.adobe.cq.commerce.impl.asset.StaticImageHandler
    async fn com_adobe_cq_commerce_impl_asset_static_image_handler(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeCqCommerceImplAssetStaticImageHandlerQueryParams,
    ) -> Result<ComAdobeCqCommerceImplAssetStaticImageHandlerResponse, E>;

    /// ComAdobeCqCommerceImplAssetVideoHandler - POST /system/console/configMgr/com.adobe.cq.commerce.impl.asset.VideoHandler
    async fn com_adobe_cq_commerce_impl_asset_video_handler(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeCqCommerceImplAssetVideoHandlerQueryParams,
    ) -> Result<ComAdobeCqCommerceImplAssetVideoHandlerResponse, E>;

    /// ComAdobeCqCommerceImplPromotionPromotionManagerImpl - POST /system/console/configMgr/com.adobe.cq.commerce.impl.promotion.PromotionManagerImpl
    async fn com_adobe_cq_commerce_impl_promotion_promotion_manager_impl(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeCqCommerceImplPromotionPromotionManagerImplQueryParams,
    ) -> Result<ComAdobeCqCommerceImplPromotionPromotionManagerImplResponse, E>;

    /// ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImpl - POST /system/console/configMgr/com.adobe.cq.commerce.pim.impl.cataloggenerator.CatalogGeneratorImpl
    async fn com_adobe_cq_commerce_pim_impl_cataloggenerator_catalog_generator_impl(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplQueryParams,
    ) -> Result<ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplResponse, E>;

    /// ComAdobeCqCommercePimImplPageEventListener - POST /system/console/configMgr/com.adobe.cq.commerce.pim.impl.PageEventListener
    async fn com_adobe_cq_commerce_pim_impl_page_event_listener(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeCqCommercePimImplPageEventListenerQueryParams,
    ) -> Result<ComAdobeCqCommercePimImplPageEventListenerResponse, E>;

    /// ComAdobeCqCommercePimImplProductfeedProductFeedServiceImpl - POST /system/console/configMgr/com.adobe.cq.commerce.pim.impl.productfeed.ProductFeedServiceImpl
    async fn com_adobe_cq_commerce_pim_impl_productfeed_product_feed_service_impl(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplQueryParams,
    ) -> Result<ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplResponse, E>;

    /// ComAdobeCqContentinsightImplReportingServicesSettingsProvider - POST /system/console/configMgr/com.adobe.cq.contentinsight.impl.ReportingServicesSettingsProvider
    async fn com_adobe_cq_contentinsight_impl_reporting_services_settings_provider(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeCqContentinsightImplReportingServicesSettingsProviderQueryParams,
    ) -> Result<ComAdobeCqContentinsightImplReportingServicesSettingsProviderResponse, E>;

    /// ComAdobeCqContentinsightImplServletsBrightEdgeProxyServlet - POST /system/console/configMgr/com.adobe.cq.contentinsight.impl.servlets.BrightEdgeProxyServlet
    async fn com_adobe_cq_contentinsight_impl_servlets_bright_edge_proxy_servlet(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletQueryParams,
    ) -> Result<ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletResponse, E>;

    /// ComAdobeCqContentinsightImplServletsReportingServicesProxyServle - POST /system/console/configMgr/com.adobe.cq.contentinsight.impl.servlets.ReportingServicesProxyServlet
    async fn com_adobe_cq_contentinsight_impl_servlets_reporting_services_proxy_servle(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeCqContentinsightImplServletsReportingServicesProxyServleQueryParams,
    ) -> Result<ComAdobeCqContentinsightImplServletsReportingServicesProxyServleResponse, E>;

    /// ComAdobeCqDamCfmImplComponentComponentConfigImpl - POST /system/console/configMgr/com.adobe.cq.dam.cfm.impl.component.ComponentConfigImpl
    async fn com_adobe_cq_dam_cfm_impl_component_component_config_impl(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeCqDamCfmImplComponentComponentConfigImplQueryParams,
    ) -> Result<ComAdobeCqDamCfmImplComponentComponentConfigImplResponse, E>;

    /// ComAdobeCqDamCfmImplConfFeatureConfigImpl - POST /system/console/configMgr/com.adobe.cq.dam.cfm.impl.conf.FeatureConfigImpl
    async fn com_adobe_cq_dam_cfm_impl_conf_feature_config_impl(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeCqDamCfmImplConfFeatureConfigImplQueryParams,
    ) -> Result<ComAdobeCqDamCfmImplConfFeatureConfigImplResponse, E>;

    /// ComAdobeCqDamCfmImplContentRewriterAssetProcessor - POST /system/console/configMgr/com.adobe.cq.dam.cfm.impl.content.rewriter.AssetProcessor
    async fn com_adobe_cq_dam_cfm_impl_content_rewriter_asset_processor(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeCqDamCfmImplContentRewriterAssetProcessorQueryParams,
    ) -> Result<ComAdobeCqDamCfmImplContentRewriterAssetProcessorResponse, E>;

    /// ComAdobeCqDamCfmImplContentRewriterParRangeFilter - POST /system/console/configMgr/com.adobe.cq.dam.cfm.impl.content.rewriter.ParRangeFilter
    async fn com_adobe_cq_dam_cfm_impl_content_rewriter_par_range_filter(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeCqDamCfmImplContentRewriterParRangeFilterQueryParams,
    ) -> Result<ComAdobeCqDamCfmImplContentRewriterParRangeFilterResponse, E>;

    /// ComAdobeCqDamCfmImplContentRewriterPayloadFilter - POST /system/console/configMgr/com.adobe.cq.dam.cfm.impl.content.rewriter.PayloadFilter
    async fn com_adobe_cq_dam_cfm_impl_content_rewriter_payload_filter(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeCqDamCfmImplContentRewriterPayloadFilterQueryParams,
    ) -> Result<ComAdobeCqDamCfmImplContentRewriterPayloadFilterResponse, E>;

    /// ComAdobeCqDamDmProcessImagePTiffManagerImpl - POST /system/console/configMgr/com.adobe.cq.dam.dm.process.image.PTiffManagerImpl
    async fn com_adobe_cq_dam_dm_process_image_p_tiff_manager_impl(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeCqDamDmProcessImagePTiffManagerImplQueryParams,
    ) -> Result<ComAdobeCqDamDmProcessImagePTiffManagerImplResponse, E>;

    /// ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorker - POST /system/console/configMgr/com.adobe.cq.dam.ips.impl.replication.trigger.ReplicateOnModifyWorker
    async fn com_adobe_cq_dam_ips_impl_replication_trigger_replicate_on_modify_worker(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerQueryParams,
    ) -> Result<ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerResponse, E>;

    /// ComAdobeCqDamMacSyncHelperImplMacSyncClientImpl - POST /system/console/configMgr/com.adobe.cq.dam.mac.sync.helper.impl.MACSyncClientImpl
    async fn com_adobe_cq_dam_mac_sync_helper_impl_mac_sync_client_impl(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeCqDamMacSyncHelperImplMacSyncClientImplQueryParams,
    ) -> Result<ComAdobeCqDamMacSyncHelperImplMacSyncClientImplResponse, E>;

    /// ComAdobeCqDamMacSyncImplDamSyncServiceImpl - POST /system/console/configMgr/com.adobe.cq.dam.mac.sync.impl.DAMSyncServiceImpl
    async fn com_adobe_cq_dam_mac_sync_impl_dam_sync_service_impl(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeCqDamMacSyncImplDamSyncServiceImplQueryParams,
    ) -> Result<ComAdobeCqDamMacSyncImplDamSyncServiceImplResponse, E>;

    /// ComAdobeCqDamProcessorNuiImplNuiAssetProcessor - POST /system/console/configMgr/com.adobe.cq.dam.processor.nui.impl.NuiAssetProcessor
    async fn com_adobe_cq_dam_processor_nui_impl_nui_asset_processor(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeCqDamProcessorNuiImplNuiAssetProcessorQueryParams,
    ) -> Result<ComAdobeCqDamProcessorNuiImplNuiAssetProcessorResponse, E>;

    /// ComAdobeCqDamS7imagingImplIsImageServerComponent - POST /system/console/configMgr/com.adobe.cq.dam.s7imaging.impl.is.ImageServerComponent
    async fn com_adobe_cq_dam_s7imaging_impl_is_image_server_component(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeCqDamS7imagingImplIsImageServerComponentQueryParams,
    ) -> Result<ComAdobeCqDamS7imagingImplIsImageServerComponentResponse, E>;

    /// ComAdobeCqDamS7imagingImplPsPlatformServerServlet - POST /system/console/configMgr/com.adobe.cq.dam.s7imaging.impl.ps.PlatformServerServlet
    async fn com_adobe_cq_dam_s7imaging_impl_ps_platform_server_servlet(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeCqDamS7imagingImplPsPlatformServerServletQueryParams,
    ) -> Result<ComAdobeCqDamS7imagingImplPsPlatformServerServletResponse, E>;

    /// ComAdobeCqDamWebdavImplIoAssetIoHandler - POST /system/console/configMgr/com.adobe.cq.dam.webdav.impl.io.AssetIOHandler
    async fn com_adobe_cq_dam_webdav_impl_io_asset_io_handler(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeCqDamWebdavImplIoAssetIoHandlerQueryParams,
    ) -> Result<ComAdobeCqDamWebdavImplIoAssetIoHandlerResponse, E>;

    /// ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJob - POST /system/console/configMgr/com.adobe.cq.dam.webdav.impl.io.DamWebdavVersionLinkingJob
    async fn com_adobe_cq_dam_webdav_impl_io_dam_webdav_version_linking_job(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobQueryParams,
    ) -> Result<ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobResponse, E>;

    /// ComAdobeCqDamWebdavImplIoSpecialFilesHandler - POST /system/console/configMgr/com.adobe.cq.dam.webdav.impl.io.SpecialFilesHandler
    async fn com_adobe_cq_dam_webdav_impl_io_special_files_handler(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeCqDamWebdavImplIoSpecialFilesHandlerQueryParams,
    ) -> Result<ComAdobeCqDamWebdavImplIoSpecialFilesHandlerResponse, E>;

    /// ComAdobeCqDeserfwImplDeserializationFirewallImpl - POST /system/console/configMgr/com.adobe.cq.deserfw.impl.DeserializationFirewallImpl
    async fn com_adobe_cq_deserfw_impl_deserialization_firewall_impl(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeCqDeserfwImplDeserializationFirewallImplQueryParams,
    ) -> Result<ComAdobeCqDeserfwImplDeserializationFirewallImplResponse, E>;

    /// ComAdobeCqDtmImplServiceDtmWebServiceImpl - POST /system/console/configMgr/com.adobe.cq.dtm.impl.service.DTMWebServiceImpl
    async fn com_adobe_cq_dtm_impl_service_dtm_web_service_impl(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeCqDtmImplServiceDtmWebServiceImplQueryParams,
    ) -> Result<ComAdobeCqDtmImplServiceDtmWebServiceImplResponse, E>;

    /// ComAdobeCqDtmImplServletsDtmDeployHookServlet - POST /system/console/configMgr/com.adobe.cq.dtm.impl.servlets.DTMDeployHookServlet
    async fn com_adobe_cq_dtm_impl_servlets_dtm_deploy_hook_servlet(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeCqDtmImplServletsDtmDeployHookServletQueryParams,
    ) -> Result<ComAdobeCqDtmImplServletsDtmDeployHookServletResponse, E>;

    /// ComAdobeCqDtmReactorImplServiceWebServiceImpl - POST /system/console/configMgr/com.adobe.cq.dtm.reactor.impl.service.WebServiceImpl
    async fn com_adobe_cq_dtm_reactor_impl_service_web_service_impl(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeCqDtmReactorImplServiceWebServiceImplQueryParams,
    ) -> Result<ComAdobeCqDtmReactorImplServiceWebServiceImplResponse, E>;

    /// ComAdobeCqExperiencelogImplExperienceLogConfigServlet - POST /system/console/configMgr/com.adobe.cq.experiencelog.impl.ExperienceLogConfigServlet
    async fn com_adobe_cq_experiencelog_impl_experience_log_config_servlet(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeCqExperiencelogImplExperienceLogConfigServletQueryParams,
    ) -> Result<ComAdobeCqExperiencelogImplExperienceLogConfigServletResponse, E>;

    /// ComAdobeCqHcContentPackagesHealthCheck - POST /system/console/configMgr/com.adobe.cq.hc.ContentPackagesHealthCheck
    async fn com_adobe_cq_hc_content_packages_health_check(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeCqHcContentPackagesHealthCheckQueryParams,
    ) -> Result<ComAdobeCqHcContentPackagesHealthCheckResponse, E>;

    /// ComAdobeCqHistoryImplHistoryRequestFilter - POST /system/console/configMgr/com.adobe.cq.history.impl.HistoryRequestFilter
    async fn com_adobe_cq_history_impl_history_request_filter(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeCqHistoryImplHistoryRequestFilterQueryParams,
    ) -> Result<ComAdobeCqHistoryImplHistoryRequestFilterResponse, E>;

    /// ComAdobeCqHistoryImplHistoryServiceImpl - POST /system/console/configMgr/com.adobe.cq.history.impl.HistoryServiceImpl
    async fn com_adobe_cq_history_impl_history_service_impl(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeCqHistoryImplHistoryServiceImplQueryParams,
    ) -> Result<ComAdobeCqHistoryImplHistoryServiceImplResponse, E>;

    /// ComAdobeCqInboxImplTypeproviderItemTypeProvider - POST /system/console/configMgr/com.adobe.cq.inbox.impl.typeprovider.ItemTypeProvider
    async fn com_adobe_cq_inbox_impl_typeprovider_item_type_provider(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeCqInboxImplTypeproviderItemTypeProviderQueryParams,
    ) -> Result<ComAdobeCqInboxImplTypeproviderItemTypeProviderResponse, E>;

    /// ComAdobeCqProjectsImplServletProjectImageServlet - POST /system/console/configMgr/com.adobe.cq.projects.impl.servlet.ProjectImageServlet
    async fn com_adobe_cq_projects_impl_servlet_project_image_servlet(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeCqProjectsImplServletProjectImageServletQueryParams,
    ) -> Result<ComAdobeCqProjectsImplServletProjectImageServletResponse, E>;

    /// ComAdobeCqProjectsPurgeScheduler - POST /system/console/configMgr/com.adobe.cq.projects.purge.Scheduler
    async fn com_adobe_cq_projects_purge_scheduler(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeCqProjectsPurgeSchedulerQueryParams,
    ) -> Result<ComAdobeCqProjectsPurgeSchedulerResponse, E>;

    /// ComAdobeCqScheduledExporterImplScheduledExporterImpl - POST /system/console/configMgr/com.adobe.cq.scheduled.exporter.impl.ScheduledExporterImpl
    async fn com_adobe_cq_scheduled_exporter_impl_scheduled_exporter_impl(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeCqScheduledExporterImplScheduledExporterImplQueryParams,
    ) -> Result<ComAdobeCqScheduledExporterImplScheduledExporterImplResponse, E>;

    /// ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImpl - POST /system/console/configMgr/com.adobe.cq.screens.analytics.impl.ScreensAnalyticsServiceImpl
    async fn com_adobe_cq_screens_analytics_impl_screens_analytics_service_impl(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplQueryParams,
    ) -> Result<ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplResponse, E>;

    /// ComAdobeCqScreensDeviceImplDeviceService - POST /system/console/configMgr/com.adobe.cq.screens.device.impl.DeviceService
    async fn com_adobe_cq_screens_device_impl_device_service(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeCqScreensDeviceImplDeviceServiceQueryParams,
    ) -> Result<ComAdobeCqScreensDeviceImplDeviceServiceResponse, E>;

    /// ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImpl - POST /system/console/configMgr/com.adobe.cq.screens.device.registration.impl.RegistrationServiceImpl
    async fn com_adobe_cq_screens_device_registration_impl_registration_service_impl(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplQueryParams,
    ) -> Result<ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplResponse, E>;

    /// ComAdobeCqScreensImplHandlerChannelsUpdateHandler - POST /system/console/configMgr/com.adobe.cq.screens.impl.handler.ChannelsUpdateHandler
    async fn com_adobe_cq_screens_impl_handler_channels_update_handler(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeCqScreensImplHandlerChannelsUpdateHandlerQueryParams,
    ) -> Result<ComAdobeCqScreensImplHandlerChannelsUpdateHandlerResponse, E>;

    /// ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJob - POST /system/console/configMgr/com.adobe.cq.screens.impl.jobs.DistributedDevicesStatiUpdateJob
    async fn com_adobe_cq_screens_impl_jobs_distributed_devices_stati_update_job(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobQueryParams,
    ) -> Result<ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobResponse, E>;

    /// ComAdobeCqScreensImplRemoteImplDistributedHttpClientImpl - POST /system/console/configMgr/com.adobe.cq.screens.impl.remote.impl.DistributedHttpClientImpl
    async fn com_adobe_cq_screens_impl_remote_impl_distributed_http_client_impl(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplQueryParams,
    ) -> Result<ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplResponse, E>;

    /// ComAdobeCqScreensImplScreensChannelPostProcessor - POST /system/console/configMgr/com.adobe.cq.screens.impl.ScreensChannelPostProcessor
    async fn com_adobe_cq_screens_impl_screens_channel_post_processor(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeCqScreensImplScreensChannelPostProcessorQueryParams,
    ) -> Result<ComAdobeCqScreensImplScreensChannelPostProcessorResponse, E>;

    /// ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImpl - POST /system/console/configMgr/com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl
    async fn com_adobe_cq_screens_monitoring_impl_screens_monitoring_service_impl(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplQueryParams,
    ) -> Result<ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplResponse, E>;

    /// ComAdobeCqScreensMqActivemqImplArtemisJmsProvider - POST /system/console/configMgr/com.adobe.cq.screens.mq.activemq.impl.ArtemisJMSProvider
    async fn com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeCqScreensMqActivemqImplArtemisJmsProviderQueryParams,
    ) -> Result<ComAdobeCqScreensMqActivemqImplArtemisJmsProviderResponse, E>;

    /// ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImpl - POST /system/console/configMgr/com.adobe.cq.screens.offlinecontent.impl.BulkOfflineUpdateServiceImpl
    async fn com_adobe_cq_screens_offlinecontent_impl_bulk_offline_update_service_impl(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplQueryParams,
    ) -> Result<ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplResponse, E>;

    /// ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImpl - POST /system/console/configMgr/com.adobe.cq.screens.offlinecontent.impl.OfflineContentServiceImpl
    async fn com_adobe_cq_screens_offlinecontent_impl_offline_content_service_impl(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplQueryParams,
    ) -> Result<ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplResponse, E>;

    /// ComAdobeCqScreensSegmentationImplSegmentationFeatureFlag - POST /system/console/configMgr/com.adobe.cq.screens.segmentation.impl.SegmentationFeatureFlag
    async fn com_adobe_cq_screens_segmentation_impl_segmentation_feature_flag(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagQueryParams,
    ) -> Result<ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagResponse, E>;

    /// ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthCh - POST /system/console/configMgr/com.adobe.cq.security.hc.bundles.impl.HtmlLibraryManagerConfigHealthCheck
    async fn com_adobe_cq_security_hc_bundles_impl_html_library_manager_config_health_ch(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChQueryParams,
    ) -> Result<ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChResponse, E>;

    /// ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheck - POST /system/console/configMgr/com.adobe.cq.security.hc.bundles.impl.WcmFilterHealthCheck
    async fn com_adobe_cq_security_hc_bundles_impl_wcm_filter_health_check(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckQueryParams,
    ) -> Result<ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckResponse, E>;

    /// ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheck - POST /system/console/configMgr/com.adobe.cq.security.hc.dispatcher.impl.DispatcherAccessHealthCheck
    async fn com_adobe_cq_security_hc_dispatcher_impl_dispatcher_access_health_check(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckQueryParams,
    ) -> Result<ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckResponse, E>;

    /// ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheck - POST /system/console/configMgr/com.adobe.cq.security.hc.packages.impl.ExampleContentHealthCheck
    async fn com_adobe_cq_security_hc_packages_impl_example_content_health_check(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckQueryParams,
    ) -> Result<ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckResponse, E>;

    /// ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheck - POST /system/console/configMgr/com.adobe.cq.security.hc.webserver.impl.ClickjackingHealthCheck
    async fn com_adobe_cq_security_hc_webserver_impl_clickjacking_health_check(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckQueryParams,
    ) -> Result<ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckResponse, E>;

    /// ComAdobeCqSocialAccountverificationImplAccountManagementConfigIm - POST /system/console/configMgr/com.adobe.cq.social.accountverification.impl.AccountManagementConfigImpl
    async fn com_adobe_cq_social_accountverification_impl_account_management_config_im(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeCqSocialAccountverificationImplAccountManagementConfigImQueryParams,
    ) -> Result<ComAdobeCqSocialAccountverificationImplAccountManagementConfigImResponse, E>;

    /// ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponen - POST /system/console/configMgr/com.adobe.cq.social.activitystreams.client.impl.SocialActivityComponentFactoryImpl
    async fn com_adobe_cq_social_activitystreams_client_impl_social_activity_componen(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenQueryParams,
    ) -> Result<ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenResponse, E>;

    /// ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCo - POST /system/console/configMgr/com.adobe.cq.social.activitystreams.client.impl.SocialActivityStreamComponentFactory
    async fn com_adobe_cq_social_activitystreams_client_impl_social_activity_stream_co(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoQueryParams,
    ) -> Result<ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoResponse, E>;

    /// ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandler - POST /system/console/configMgr/com.adobe.cq.social.activitystreams.listener.impl.EventListenerHandler
    async fn com_adobe_cq_social_activitystreams_listener_impl_event_listener_handler(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerQueryParams,
    ) -> Result<ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerResponse, E>;

    /// ComAdobeCqSocialActivitystreamsListenerImplModerationEventExten - POST /system/console/configMgr/com.adobe.cq.social.activitystreams.listener.impl.ModerationEventExtension
    async fn com_adobe_cq_social_activitystreams_listener_impl_moderation_event_exten(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenQueryParams,
    ) -> Result<ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenResponse, E>;

    /// ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivityS - POST /system/console/configMgr/com.adobe.cq.social.activitystreams.listener.impl.RatingEventActivitySuppressor
    async fn com_adobe_cq_social_activitystreams_listener_impl_rating_event_activity_s(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySQueryParams,
    ) -> Result<ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySResponse, E>;

    /// ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStre - POST /system/console/configMgr/com.adobe.cq.social.activitystreams.listener.impl.ResourceActivityStreamProviderFactory
    async fn com_adobe_cq_social_activitystreams_listener_impl_resource_activity_stre(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreQueryParams,
    ) -> Result<ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreResponse, E>;

    /// ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsI - POST /system/console/configMgr/com.adobe.cq.social.calendar.client.endpoints.impl.CalendarOperationsImpl
    async fn com_adobe_cq_social_calendar_client_endpoints_impl_calendar_operations_i(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIQueryParams,
    ) -> Result<ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIResponse, E>;

    /// ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmen - POST /system/console/configMgr/com.adobe.cq.social.calendar.client.operationextensions.EventAttachment
    async fn com_adobe_cq_social_calendar_client_operationextensions_event_attachmen(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenQueryParams,
    ) -> Result<ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenResponse, E>;

    /// ComAdobeCqSocialCalendarServletsTimeZoneServlet - POST /system/console/configMgr/com.adobe.cq.social.calendar.servlets.TimeZoneServlet
    async fn com_adobe_cq_social_calendar_servlets_time_zone_servlet(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeCqSocialCalendarServletsTimeZoneServletQueryParams,
    ) -> Result<ComAdobeCqSocialCalendarServletsTimeZoneServletResponse, E>;

    /// ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEvent - POST /system/console/configMgr/com.adobe.cq.social.commons.comments.endpoints.impl.CommentDeleteEventActivitySuppressor
    async fn com_adobe_cq_social_commons_comments_endpoints_impl_comment_delete_event(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventQueryParams,
    ) -> Result<ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventResponse, E>;

    /// ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSe - POST /system/console/configMgr/com.adobe.cq.social.commons.comments.endpoints.impl.CommentOperationService
    async fn com_adobe_cq_social_commons_comments_endpoints_impl_comment_operation_se(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSeQueryParams,
    ) -> Result<ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSeResponse, E>;

    /// ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperati - POST /system/console/configMgr/com.adobe.cq.social.commons.comments.endpoints.impl.TranslationOperationService
    async fn com_adobe_cq_social_commons_comments_endpoints_impl_translation_operati(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiQueryParams,
    ) -> Result<ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiResponse, E>;

    /// ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialC - POST /system/console/configMgr/com.adobe.cq.social.commons.comments.listing.impl.SearchCommentSocialComponentListProvider
    async fn com_adobe_cq_social_commons_comments_listing_impl_search_comment_social_c(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCQueryParams,
    ) -> Result<ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCResponse, E>;

    /// ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPos - POST /system/console/configMgr/com.adobe.cq.social.commons.comments.scheduler.impl.SearchScheduledPosts
    async fn com_adobe_cq_social_commons_comments_scheduler_impl_search_scheduled_pos(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosQueryParams,
    ) -> Result<ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosResponse, E>;

    /// ComAdobeCqSocialCommonsCorsCorsAuthenticationFilter - POST /system/console/configMgr/com.adobe.cq.social.commons.cors.CORSAuthenticationFilter
    async fn com_adobe_cq_social_commons_cors_cors_authentication_filter(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeCqSocialCommonsCorsCorsAuthenticationFilterQueryParams,
    ) -> Result<ComAdobeCqSocialCommonsCorsCorsAuthenticationFilterResponse, E>;

    /// ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProvider - POST /system/console/configMgr/com.adobe.cq.social.commons.emailreply.impl.AndroidEmailClientProvider
    async fn com_adobe_cq_social_commons_emailreply_impl_android_email_client_provider(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderQueryParams,
    ) -> Result<ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderResponse, E>;

    /// ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImpl - POST /system/console/configMgr/com.adobe.cq.social.commons.emailreply.impl.CommentEmailBuilderImpl
    async fn com_adobe_cq_social_commons_emailreply_impl_comment_email_builder_impl(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplQueryParams,
    ) -> Result<ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplResponse, E>;

    /// ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListener - POST /system/console/configMgr/com.adobe.cq.social.commons.emailreply.impl.CommentEmailEventListener
    async fn com_adobe_cq_social_commons_emailreply_impl_comment_email_event_listener(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerQueryParams,
    ) -> Result<ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerResponse, E>;

    /// ComAdobeCqSocialCommonsEmailreplyImplCustomEmailClientProvider - POST /system/console/configMgr/com.adobe.cq.social.commons.emailreply.impl.CustomEmailClientProvider
    async fn com_adobe_cq_social_commons_emailreply_impl_custom_email_client_provider(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeCqSocialCommonsEmailreplyImplCustomEmailClientProviderQueryParams,
    ) -> Result<ComAdobeCqSocialCommonsEmailreplyImplCustomEmailClientProviderResponse, E>;

    /// ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImp - POST /system/console/configMgr/com.adobe.cq.social.commons.emailreply.impl.EmailQuotedTextPatternsImpl
    async fn com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_imp(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpQueryParams,
    ) -> Result<ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpResponse, E>;

    /// ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImp - POST /system/console/configMgr/com.adobe.cq.social.commons.emailreply.impl.EmailReplyConfigurationImpl
    async fn com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpQueryParams,
    ) -> Result<ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpResponse, E>;

    /// ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporter - POST /system/console/configMgr/com.adobe.cq.social.commons.emailreply.impl.EmailReplyImporter
    async fn com_adobe_cq_social_commons_emailreply_impl_email_reply_importer(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterQueryParams,
    ) -> Result<ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterResponse, E>;

    /// ComAdobeCqSocialCommonsEmailreplyImplGmailEmailClientProvider - POST /system/console/configMgr/com.adobe.cq.social.commons.emailreply.impl.GmailEmailClientProvider
    async fn com_adobe_cq_social_commons_emailreply_impl_gmail_email_client_provider(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeCqSocialCommonsEmailreplyImplGmailEmailClientProviderQueryParams,
    ) -> Result<ComAdobeCqSocialCommonsEmailreplyImplGmailEmailClientProviderResponse, E>;

    /// ComAdobeCqSocialCommonsEmailreplyImplIosEmailClientProvider - POST /system/console/configMgr/com.adobe.cq.social.commons.emailreply.impl.IOSEmailClientProvider
    async fn com_adobe_cq_social_commons_emailreply_impl_ios_email_client_provider(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeCqSocialCommonsEmailreplyImplIosEmailClientProviderQueryParams,
    ) -> Result<ComAdobeCqSocialCommonsEmailreplyImplIosEmailClientProviderResponse, E>;

    /// ComAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProvider - POST /system/console/configMgr/com.adobe.cq.social.commons.emailreply.impl.MacmailEmailClientProvider
    async fn com_adobe_cq_social_commons_emailreply_impl_macmail_email_client_provider(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProviderQueryParams,
    ) -> Result<ComAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProviderResponse, E>;

    /// ComAdobeCqSocialCommonsEmailreplyImplOutLookEmailClientProvider - POST /system/console/configMgr/com.adobe.cq.social.commons.emailreply.impl.OutLookEmailClientProvider
    async fn com_adobe_cq_social_commons_emailreply_impl_out_look_email_client_provider(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeCqSocialCommonsEmailreplyImplOutLookEmailClientProviderQueryParams,
    ) -> Result<ComAdobeCqSocialCommonsEmailreplyImplOutLookEmailClientProviderResponse, E>;

    /// ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProvider - POST /system/console/configMgr/com.adobe.cq.social.commons.emailreply.impl.UnknownEmailClientProvider
    async fn com_adobe_cq_social_commons_emailreply_impl_unknown_email_client_provider(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderQueryParams,
    ) -> Result<ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderResponse, E>;

    /// ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProvider - POST /system/console/configMgr/com.adobe.cq.social.commons.emailreply.impl.YahooEmailClientProvider
    async fn com_adobe_cq_social_commons_emailreply_impl_yahoo_email_client_provider(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderQueryParams,
    ) -> Result<ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderResponse, E>;

    /// ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUgcImageUpload - POST /system/console/configMgr/com.adobe.cq.social.commons.maintainance.impl.DeleteTempUGCImageUploads
    async fn com_adobe_cq_social_commons_maintainance_impl_delete_temp_ugc_image_upload(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUgcImageUploadQueryParams,
    ) -> Result<ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUgcImageUploadResponse, E>;

    /// ComAdobeCqSocialCommonsUgclimiterImplUgcLimiterServiceImpl - POST /system/console/configMgr/com.adobe.cq.social.commons.ugclimiter.impl.UGCLimiterServiceImpl
    async fn com_adobe_cq_social_commons_ugclimiter_impl_ugc_limiter_service_impl(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeCqSocialCommonsUgclimiterImplUgcLimiterServiceImplQueryParams,
    ) -> Result<ComAdobeCqSocialCommonsUgclimiterImplUgcLimiterServiceImplResponse, E>;

    /// ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUgcLimit - POST /system/console/configMgr/com.adobe.cq.social.commons.ugclimitsconfig.impl.CommunityUserUGCLimitsConfigImpl
    async fn com_adobe_cq_social_commons_ugclimitsconfig_impl_community_user_ugc_limit(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUgcLimitQueryParams,
    ) -> Result<ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUgcLimitResponse, E>;

    /// ComAdobeCqSocialConnectOauthImplFacebookProviderImpl - POST /system/console/configMgr/com.adobe.cq.social.connect.oauth.impl.FacebookProviderImpl
    async fn com_adobe_cq_social_connect_oauth_impl_facebook_provider_impl(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeCqSocialConnectOauthImplFacebookProviderImplQueryParams,
    ) -> Result<ComAdobeCqSocialConnectOauthImplFacebookProviderImplResponse, E>;

    /// ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandle - POST /system/console/configMgr/com.adobe.cq.social.connect.oauth.impl.SocialOAuthAuthenticationHandler
    async fn com_adobe_cq_social_connect_oauth_impl_social_o_auth_authentication_handle(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleQueryParams,
    ) -> Result<ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleResponse, E>;

    /// ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapper - POST /system/console/configMgr/com.adobe.cq.social.connect.oauth.impl.SocialOAuthUserProfileMapper
    async fn com_adobe_cq_social_connect_oauth_impl_social_o_auth_user_profile_mapper(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperQueryParams,
    ) -> Result<ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperResponse, E>;

    /// ComAdobeCqSocialConnectOauthImplTwitterProviderImpl - POST /system/console/configMgr/com.adobe.cq.social.connect.oauth.impl.TwitterProviderImpl
    async fn com_adobe_cq_social_connect_oauth_impl_twitter_provider_impl(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeCqSocialConnectOauthImplTwitterProviderImplQueryParams,
    ) -> Result<ComAdobeCqSocialConnectOauthImplTwitterProviderImplResponse, E>;

    /// ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmen - POST /system/console/configMgr/com.adobe.cq.social.content.fragments.services.impl.CommunitiesFragmentCreationServiceImpl
    async fn com_adobe_cq_social_content_fragments_services_impl_communities_fragmen(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenQueryParams,
    ) -> Result<ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenResponse, E>;

    /// ComAdobeCqSocialDatastoreAsImplAsResourceProviderFactory - POST /system/console/configMgr/com.adobe.cq.social.datastore.as.impl.ASResourceProviderFactory
    async fn com_adobe_cq_social_datastore_as_impl_as_resource_provider_factory(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeCqSocialDatastoreAsImplAsResourceProviderFactoryQueryParams,
    ) -> Result<ComAdobeCqSocialDatastoreAsImplAsResourceProviderFactoryResponse, E>;

    /// ComAdobeCqSocialDatastoreOpImplSocialMsResourceProviderFactory - POST /system/console/configMgr/com.adobe.cq.social.datastore.op.impl.SocialMSResourceProviderFactory
    async fn com_adobe_cq_social_datastore_op_impl_social_ms_resource_provider_factory(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeCqSocialDatastoreOpImplSocialMsResourceProviderFactoryQueryParams,
    ) -> Result<ComAdobeCqSocialDatastoreOpImplSocialMsResourceProviderFactoryResponse, E>;

    /// ComAdobeCqSocialDatastoreRdbImplSocialRdbResourceProviderFactor - POST /system/console/configMgr/com.adobe.cq.social.datastore.rdb.impl.SocialRDBResourceProviderFactory
    async fn com_adobe_cq_social_datastore_rdb_impl_social_rdb_resource_provider_factor(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeCqSocialDatastoreRdbImplSocialRdbResourceProviderFactorQueryParams,
    ) -> Result<ComAdobeCqSocialDatastoreRdbImplSocialRdbResourceProviderFactorResponse, E>;

    /// ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorF - POST /system/console/configMgr/com.adobe.cq.social.enablement.adaptors.EnablementLearningPathAdaptorFactory
    async fn com_adobe_cq_social_enablement_adaptors_enablement_learning_path_adaptor_f(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFQueryParams,
    ) -> Result<ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFResponse, E>;

    /// ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFacto - POST /system/console/configMgr/com.adobe.cq.social.enablement.adaptors.EnablementResourceAdaptorFactory
    async fn com_adobe_cq_social_enablement_adaptors_enablement_resource_adaptor_facto(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoQueryParams,
    ) -> Result<ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoResponse, E>;

    /// ComAdobeCqSocialEnablementLearningpathEndpointsImplEnablementL - POST /system/console/configMgr/com.adobe.cq.social.enablement.learningpath.endpoints.impl.EnablementLearningPathModelOperationService
    async fn com_adobe_cq_social_enablement_learningpath_endpoints_impl_enablement_l(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLQueryParams,
    ) -> Result<ComAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLResponse, E>;

    /// ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResou - POST /system/console/configMgr/com.adobe.cq.social.enablement.resource.endpoints.impl.EnablementResourceModelOperationService
    async fn com_adobe_cq_social_enablement_resource_endpoints_impl_enablement_resou(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResouQueryParams,
    ) -> Result<ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResouResponse, E>;

    /// ComAdobeCqSocialEnablementServicesImplAuthorMarkerImpl - POST /system/console/configMgr/com.adobe.cq.social.enablement.services.impl.AuthorMarkerImpl
    async fn com_adobe_cq_social_enablement_services_impl_author_marker_impl(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplQueryParams,
    ) -> Result<ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplResponse, E>;

    /// ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGe - POST /system/console/configMgr/com.adobe.cq.social.filelibrary.client.endpoints.FilelibraryDownloadGetServlet
    async fn com_adobe_cq_social_filelibrary_client_endpoints_filelibrary_download_ge(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGeQueryParams,
    ) -> Result<ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGeResponse, E>;

    /// ComAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOpera - POST /system/console/configMgr/com.adobe.cq.social.filelibrary.client.endpoints.impl.FileLibraryOperationsService
    async fn com_adobe_cq_social_filelibrary_client_endpoints_impl_file_library_opera(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaQueryParams,
    ) -> Result<ComAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaResponse, E>;

    /// ComAdobeCqSocialForumClientEndpointsImplForumOperationsService - POST /system/console/configMgr/com.adobe.cq.social.forum.client.endpoints.impl.ForumOperationsService
    async fn com_adobe_cq_social_forum_client_endpoints_impl_forum_operations_service(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeCqSocialForumClientEndpointsImplForumOperationsServiceQueryParams,
    ) -> Result<ComAdobeCqSocialForumClientEndpointsImplForumOperationsServiceResponse, E>;

    /// ComAdobeCqSocialForumDispatcherImplFlushOperations - POST /system/console/configMgr/com.adobe.cq.social.forum.dispatcher.impl.FlushOperations
    async fn com_adobe_cq_social_forum_dispatcher_impl_flush_operations(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeCqSocialForumDispatcherImplFlushOperationsQueryParams,
    ) -> Result<ComAdobeCqSocialForumDispatcherImplFlushOperationsResponse, E>;

    /// ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponen - POST /system/console/configMgr/com.adobe.cq.social.group.client.impl.CommunityGroupCollectionComponentFactory
    async fn com_adobe_cq_social_group_client_impl_community_group_collection_componen(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenQueryParams,
    ) -> Result<ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenResponse, E>;

    /// ComAdobeCqSocialGroupImplGroupServiceImpl - POST /system/console/configMgr/com.adobe.cq.social.group.impl.GroupServiceImpl
    async fn com_adobe_cq_social_group_impl_group_service_impl(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeCqSocialGroupImplGroupServiceImplQueryParams,
    ) -> Result<ComAdobeCqSocialGroupImplGroupServiceImplResponse, E>;

    /// ComAdobeCqSocialHandlebarsGuavaTemplateCacheImpl - POST /system/console/configMgr/com.adobe.cq.social.handlebars.GuavaTemplateCacheImpl
    async fn com_adobe_cq_social_handlebars_guava_template_cache_impl(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplQueryParams,
    ) -> Result<ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplResponse, E>;

    /// ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsS - POST /system/console/configMgr/com.adobe.cq.social.ideation.client.endpoints.impl.IdeationOperationsService
    async fn com_adobe_cq_social_ideation_client_endpoints_impl_ideation_operations_s(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSQueryParams,
    ) -> Result<ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSResponse, E>;

    /// ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSer - POST /system/console/configMgr/com.adobe.cq.social.journal.client.endpoints.impl.JournalOperationsService
    async fn com_adobe_cq_social_journal_client_endpoints_impl_journal_operations_ser(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerQueryParams,
    ) -> Result<ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerResponse, E>;

    /// ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfile - POST /system/console/configMgr/com.adobe.cq.social.members.endpoints.impl.CommunityMemberGroupProfileOperationService
    async fn com_adobe_cq_social_members_endpoints_impl_community_member_group_profile(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileQueryParams,
    ) -> Result<ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileResponse, E>;

    /// ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileO - POST /system/console/configMgr/com.adobe.cq.social.members.endpoints.impl.CommunityMemberUserProfileOperationService
    async fn com_adobe_cq_social_members_endpoints_impl_community_member_user_profile_o(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOQueryParams,
    ) -> Result<ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOResponse, E>;

    /// ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentF - POST /system/console/configMgr/com.adobe.cq.social.members.impl.CommunityMemberGroupProfileComponentFactory
    async fn com_adobe_cq_social_members_impl_community_member_group_profile_component_f(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFQueryParams,
    ) -> Result<ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFResponse, E>;

    /// ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperation - POST /system/console/configMgr/com.adobe.cq.social.messaging.client.endpoints.impl.MessagingOperationsServiceImpl
    async fn com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationQueryParams,
    ) -> Result<ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationResponse, E>;

    /// ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponen - POST /system/console/configMgr/com.adobe.cq.social.moderation.dashboard.api.FilterGroupSocialComponentFactory
    async fn com_adobe_cq_social_moderation_dashboard_api_filter_group_social_componen(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenQueryParams,
    ) -> Result<ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenResponse, E>;

    /// ComAdobeCqSocialModerationDashboardApiModerationDashboardSocial - POST /system/console/configMgr/com.adobe.cq.social.moderation.dashboard.api.ModerationDashboardSocialComponentFactory
    async fn com_adobe_cq_social_moderation_dashboard_api_moderation_dashboard_social(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialQueryParams,
    ) -> Result<ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialResponse, E>;

    /// ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponen - POST /system/console/configMgr/com.adobe.cq.social.moderation.dashboard.api.UserDetailsSocialComponentFactory
    async fn com_adobe_cq_social_moderation_dashboard_api_user_details_social_componen(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenQueryParams,
    ) -> Result<ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenResponse, E>;

    /// ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSoci - POST /system/console/configMgr/com.adobe.cq.social.moderation.dashboard.internal.impl.FilterGroupSocialComponentFactoryV2
    async fn com_adobe_cq_social_moderation_dashboard_internal_impl_filter_group_soci(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociQueryParams,
    ) -> Result<ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociResponse, E>;

    /// ComAdobeCqSocialNotificationsImplMentionsRouter - POST /system/console/configMgr/com.adobe.cq.social.notifications.impl.MentionsRouter
    async fn com_adobe_cq_social_notifications_impl_mentions_router(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeCqSocialNotificationsImplMentionsRouterQueryParams,
    ) -> Result<ComAdobeCqSocialNotificationsImplMentionsRouterResponse, E>;

    /// ComAdobeCqSocialNotificationsImplNotificationManagerImpl - POST /system/console/configMgr/com.adobe.cq.social.notifications.impl.NotificationManagerImpl
    async fn com_adobe_cq_social_notifications_impl_notification_manager_impl(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeCqSocialNotificationsImplNotificationManagerImplQueryParams,
    ) -> Result<ComAdobeCqSocialNotificationsImplNotificationManagerImplResponse, E>;

    /// ComAdobeCqSocialNotificationsImplNotificationsRouter - POST /system/console/configMgr/com.adobe.cq.social.notifications.impl.NotificationsRouter
    async fn com_adobe_cq_social_notifications_impl_notifications_router(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeCqSocialNotificationsImplNotificationsRouterQueryParams,
    ) -> Result<ComAdobeCqSocialNotificationsImplNotificationsRouterResponse, E>;

    /// ComAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServic - POST /system/console/configMgr/com.adobe.cq.social.qna.client.endpoints.impl.QnaForumOperationsService
    async fn com_adobe_cq_social_qna_client_endpoints_impl_qna_forum_operations_servic(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicQueryParams,
    ) -> Result<ComAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicResponse, E>;

    /// ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportI - POST /system/console/configMgr/com.adobe.cq.social.reporting.analytics.services.impl.AnalyticsReportImporterServiceImpl
    async fn com_adobe_cq_social_reporting_analytics_services_impl_analytics_report_i(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIQueryParams,
    ) -> Result<ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIResponse, E>;

    /// ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportM - POST /system/console/configMgr/com.adobe.cq.social.reporting.analytics.services.impl.AnalyticsReportManagementServiceImpl
    async fn com_adobe_cq_social_reporting_analytics_services_impl_analytics_report_m(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMQueryParams,
    ) -> Result<ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMResponse, E>;

    /// ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportS - POST /system/console/configMgr/com.adobe.cq.social.reporting.analytics.services.impl.SiteTrendReportSocialComponentFactory
    async fn com_adobe_cq_social_reporting_analytics_services_impl_site_trend_report_s(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSQueryParams,
    ) -> Result<ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSResponse, E>;

    /// ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServi - POST /system/console/configMgr/com.adobe.cq.social.review.client.endpoints.impl.ReviewOperationsService
    async fn com_adobe_cq_social_review_client_endpoints_impl_review_operations_servi(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiQueryParams,
    ) -> Result<ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiResponse, E>;

    /// ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServlet - POST /system/console/configMgr/com.adobe.cq.social.scf.core.operations.impl.SocialOperationsServlet
    async fn com_adobe_cq_social_scf_core_operations_impl_social_operations_servlet(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletQueryParams,
    ) -> Result<ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletResponse, E>;

    /// ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServlet - POST /system/console/configMgr/com.adobe.cq.social.scf.endpoints.impl.DefaultSocialGetServlet
    async fn com_adobe_cq_social_scf_endpoints_impl_default_social_get_servlet(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletQueryParams,
    ) -> Result<ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletResponse, E>;

    /// ComAdobeCqSocialScoringImplScoringEventListener - POST /system/console/configMgr/com.adobe.cq.social.scoring.impl.ScoringEventListener
    async fn com_adobe_cq_social_scoring_impl_scoring_event_listener(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeCqSocialScoringImplScoringEventListenerQueryParams,
    ) -> Result<ComAdobeCqSocialScoringImplScoringEventListenerResponse, E>;

    /// ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImpl - POST /system/console/configMgr/com.adobe.cq.social.serviceusers.internal.impl.ServiceUserWrapperImpl
    async fn com_adobe_cq_social_serviceusers_internal_impl_service_user_wrapper_impl(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplQueryParams,
    ) -> Result<ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplResponse, E>;

    /// ComAdobeCqSocialSiteEndpointsImplSiteOperationService - POST /system/console/configMgr/com.adobe.cq.social.site.endpoints.impl.SiteOperationService
    async fn com_adobe_cq_social_site_endpoints_impl_site_operation_service(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceQueryParams,
    ) -> Result<ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceResponse, E>;

    /// ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceIm - POST /system/console/configMgr/com.adobe.cq.social.site.impl.AnalyticsComponentConfigurationServiceImpl
    async fn com_adobe_cq_social_site_impl_analytics_component_configuration_service_im(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImQueryParams,
    ) -> Result<ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImResponse, E>;

    /// ComAdobeCqSocialSiteImplSiteConfiguratorImpl - POST /system/console/configMgr/com.adobe.cq.social.site.impl.SiteConfiguratorImpl
    async fn com_adobe_cq_social_site_impl_site_configurator_impl(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeCqSocialSiteImplSiteConfiguratorImplQueryParams,
    ) -> Result<ComAdobeCqSocialSiteImplSiteConfiguratorImplResponse, E>;

    /// ComAdobeCqSocialSrpImplSocialSolrConnector - POST /system/console/configMgr/com.adobe.cq.social.srp.impl.SocialSolrConnector
    async fn com_adobe_cq_social_srp_impl_social_solr_connector(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeCqSocialSrpImplSocialSolrConnectorQueryParams,
    ) -> Result<ComAdobeCqSocialSrpImplSocialSolrConnectorResponse, E>;

    /// ComAdobeCqSocialSyncImplDiffChangesObserver - POST /system/console/configMgr/com.adobe.cq.social.sync.impl.DiffChangesObserver
    async fn com_adobe_cq_social_sync_impl_diff_changes_observer(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeCqSocialSyncImplDiffChangesObserverQueryParams,
    ) -> Result<ComAdobeCqSocialSyncImplDiffChangesObserverResponse, E>;

    /// ComAdobeCqSocialSyncImplGroupSyncListenerImpl - POST /system/console/configMgr/com.adobe.cq.social.sync.impl.GroupSyncListenerImpl
    async fn com_adobe_cq_social_sync_impl_group_sync_listener_impl(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeCqSocialSyncImplGroupSyncListenerImplQueryParams,
    ) -> Result<ComAdobeCqSocialSyncImplGroupSyncListenerImplResponse, E>;

    /// ComAdobeCqSocialSyncImplPublisherSyncServiceImpl - POST /system/console/configMgr/com.adobe.cq.social.sync.impl.PublisherSyncServiceImpl
    async fn com_adobe_cq_social_sync_impl_publisher_sync_service_impl(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeCqSocialSyncImplPublisherSyncServiceImplQueryParams,
    ) -> Result<ComAdobeCqSocialSyncImplPublisherSyncServiceImplResponse, E>;

    /// ComAdobeCqSocialSyncImplUserSyncListenerImpl - POST /system/console/configMgr/com.adobe.cq.social.sync.impl.UserSyncListenerImpl
    async fn com_adobe_cq_social_sync_impl_user_sync_listener_impl(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeCqSocialSyncImplUserSyncListenerImplQueryParams,
    ) -> Result<ComAdobeCqSocialSyncImplUserSyncListenerImplResponse, E>;

    /// ComAdobeCqSocialTranslationImplTranslationServiceConfigManager - POST /system/console/configMgr/com.adobe.cq.social.translation.impl.TranslationServiceConfigManager
    async fn com_adobe_cq_social_translation_impl_translation_service_config_manager(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerQueryParams,
    ) -> Result<ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerResponse, E>;

    /// ComAdobeCqSocialTranslationImplUgcLanguageDetector - POST /system/console/configMgr/com.adobe.cq.social.translation.impl.UGCLanguageDetector
    async fn com_adobe_cq_social_translation_impl_ugc_language_detector(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeCqSocialTranslationImplUgcLanguageDetectorQueryParams,
    ) -> Result<ComAdobeCqSocialTranslationImplUgcLanguageDetectorResponse, E>;

    /// ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImpl - POST /system/console/configMgr/com.adobe.cq.social.ugcbase.dispatcher.impl.FlushServiceImpl
    async fn com_adobe_cq_social_ugcbase_dispatcher_impl_flush_service_impl(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplQueryParams,
    ) -> Result<ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplResponse, E>;

    /// ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImpl - POST /system/console/configMgr/com.adobe.cq.social.ugcbase.impl.AysncReverseReplicatorImpl
    async fn com_adobe_cq_social_ugcbase_impl_aysnc_reverse_replicator_impl(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplQueryParams,
    ) -> Result<ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplResponse, E>;

    /// ComAdobeCqSocialUgcbaseImplPublisherConfigurationImpl - POST /system/console/configMgr/com.adobe.cq.social.ugcbase.impl.PublisherConfigurationImpl
    async fn com_adobe_cq_social_ugcbase_impl_publisher_configuration_impl(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplQueryParams,
    ) -> Result<ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplResponse, E>;

    /// ComAdobeCqSocialUgcbaseImplSocialUtilsImpl - POST /system/console/configMgr/com.adobe.cq.social.ugcbase.impl.SocialUtilsImpl
    async fn com_adobe_cq_social_ugcbase_impl_social_utils_impl(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeCqSocialUgcbaseImplSocialUtilsImplQueryParams,
    ) -> Result<ComAdobeCqSocialUgcbaseImplSocialUtilsImplResponse, E>;

    /// ComAdobeCqSocialUgcbaseModerationImplAutoModerationImpl - POST /system/console/configMgr/com.adobe.cq.social.ugcbase.moderation.impl.AutoModerationImpl
    async fn com_adobe_cq_social_ugcbase_moderation_impl_auto_moderation_impl(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplQueryParams,
    ) -> Result<ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplResponse, E>;

    /// ComAdobeCqSocialUgcbaseModerationImplSentimentProcess - POST /system/console/configMgr/com.adobe.cq.social.ugcbase.moderation.impl.SentimentProcess
    async fn com_adobe_cq_social_ugcbase_moderation_impl_sentiment_process(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeCqSocialUgcbaseModerationImplSentimentProcessQueryParams,
    ) -> Result<ComAdobeCqSocialUgcbaseModerationImplSentimentProcessResponse, E>;

    /// ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackli - POST /system/console/configMgr/com.adobe.cq.social.ugcbase.security.impl.DefaultAttachmentTypeBlacklistService
    async fn com_adobe_cq_social_ugcbase_security_impl_default_attachment_type_blackli(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliQueryParams,
    ) -> Result<ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliResponse, E>;

    /// ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImpl - POST /system/console/configMgr/com.adobe.cq.social.ugcbase.security.impl.SaferSlingPostValidatorImpl
    async fn com_adobe_cq_social_ugcbase_security_impl_safer_sling_post_validator_impl(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplQueryParams,
    ) -> Result<ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplResponse, E>;

    /// ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServlet - POST /system/console/configMgr/com.adobe.cq.social.user.endpoints.impl.UsersGroupFromPublishServlet
    async fn com_adobe_cq_social_user_endpoints_impl_users_group_from_publish_servlet(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletQueryParams,
    ) -> Result<ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletResponse, E>;

    /// ComAdobeCqSocialUserImplTransportHttpToPublisher - POST /system/console/configMgr/com.adobe.cq.social.user.impl.transport.HttpToPublisher
    async fn com_adobe_cq_social_user_impl_transport_http_to_publisher(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeCqSocialUserImplTransportHttpToPublisherQueryParams,
    ) -> Result<ComAdobeCqSocialUserImplTransportHttpToPublisherResponse, E>;

    /// ComAdobeCqUiWcmCommonsInternalServletsRteRteFilterServletFact - POST /system/console/configMgr/com.adobe.cq.ui.wcm.commons.internal.servlets.rte.RTEFilterServletFactory.amended
    async fn com_adobe_cq_ui_wcm_commons_internal_servlets_rte_rte_filter_servlet_fact(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeCqUiWcmCommonsInternalServletsRteRteFilterServletFactQueryParams,
    ) -> Result<ComAdobeCqUiWcmCommonsInternalServletsRteRteFilterServletFactResponse, E>;

    /// ComAdobeCqUpgradesCleanupImplUpgradeContentCleanup - POST /system/console/configMgr/com.adobe.cq.upgrades.cleanup.impl.UpgradeContentCleanup
    async fn com_adobe_cq_upgrades_cleanup_impl_upgrade_content_cleanup(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupQueryParams,
    ) -> Result<ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupResponse, E>;

    /// ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanup - POST /system/console/configMgr/com.adobe.cq.upgrades.cleanup.impl.UpgradeInstallFolderCleanup
    async fn com_adobe_cq_upgrades_cleanup_impl_upgrade_install_folder_cleanup(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupQueryParams,
    ) -> Result<ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupResponse, E>;

    /// ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderService - POST /system/console/configMgr/com.adobe.cq.wcm.jobs.async.impl.AsyncDeleteConfigProviderService
    async fn com_adobe_cq_wcm_jobs_async_impl_async_delete_config_provider_service(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceQueryParams,
    ) -> Result<ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceResponse, E>;

    /// ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTask - POST /system/console/configMgr/com.adobe.cq.wcm.jobs.async.impl.AsyncJobCleanUpTask
    async fn com_adobe_cq_wcm_jobs_async_impl_async_job_clean_up_task(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskQueryParams,
    ) -> Result<ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskResponse, E>;

    /// ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderService - POST /system/console/configMgr/com.adobe.cq.wcm.jobs.async.impl.AsyncMoveConfigProviderService
    async fn com_adobe_cq_wcm_jobs_async_impl_async_move_config_provider_service(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceQueryParams,
    ) -> Result<ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceResponse, E>;

    /// ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderService - POST /system/console/configMgr/com.adobe.cq.wcm.jobs.async.impl.AsyncPageMoveConfigProviderService
    async fn com_adobe_cq_wcm_jobs_async_impl_async_page_move_config_provider_service(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceQueryParams,
    ) -> Result<ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceResponse, E>;

    /// ComAdobeCqWcmLaunchesImplLaunchesEventHandler - POST /system/console/configMgr/com.adobe.cq.wcm.launches.impl.LaunchesEventHandler
    async fn com_adobe_cq_wcm_launches_impl_launches_event_handler(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeCqWcmLaunchesImplLaunchesEventHandlerQueryParams,
    ) -> Result<ComAdobeCqWcmLaunchesImplLaunchesEventHandlerResponse, E>;

    /// ComAdobeCqWcmMobileQrcodeServletQrCodeImageGenerator - POST /system/console/configMgr/com.adobe.cq.wcm.mobile.qrcode.servlet.QRCodeImageGenerator
    async fn com_adobe_cq_wcm_mobile_qrcode_servlet_qr_code_image_generator(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeCqWcmMobileQrcodeServletQrCodeImageGeneratorQueryParams,
    ) -> Result<ComAdobeCqWcmMobileQrcodeServletQrCodeImageGeneratorResponse, E>;

    /// ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImpl - POST /system/console/configMgr/com.adobe.cq.wcm.style.internal.ComponentStyleInfoCacheImpl
    async fn com_adobe_cq_wcm_style_internal_component_style_info_cache_impl(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplQueryParams,
    ) -> Result<ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplResponse, E>;

    /// ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImpl - POST /system/console/configMgr/com.adobe.cq.wcm.translation.impl.TranslationPlatformConfigurationImpl
    async fn com_adobe_cq_wcm_translation_impl_translation_platform_configuration_impl(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplQueryParams,
    ) -> Result<ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplResponse, E>;

    /// ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigService - POST /system/console/configMgr/com.adobe.fd.fp.config.FormsPortalDraftsandSubmissionConfigService
    async fn com_adobe_fd_fp_config_forms_portal_draftsand_submission_config_service(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceQueryParams,
    ) -> Result<ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceResponse, E>;

    /// ComAdobeFdFpConfigFormsPortalSchedulerService - POST /system/console/configMgr/com.adobe.fd.fp.config.FormsPortalSchedulerService
    async fn com_adobe_fd_fp_config_forms_portal_scheduler_service(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeFdFpConfigFormsPortalSchedulerServiceQueryParams,
    ) -> Result<ComAdobeFdFpConfigFormsPortalSchedulerServiceResponse, E>;

    /// ComAdobeFormsCommonServiceImplDefaultDataProvider - POST /system/console/configMgr/com.adobe.forms.common.service.impl.DefaultDataProvider
    async fn com_adobe_forms_common_service_impl_default_data_provider(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeFormsCommonServiceImplDefaultDataProviderQueryParams,
    ) -> Result<ComAdobeFormsCommonServiceImplDefaultDataProviderResponse, E>;

    /// ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImp - POST /system/console/configMgr/com.adobe.forms.common.service.impl.FormsCommonConfigurationServiceImpl
    async fn com_adobe_forms_common_service_impl_forms_common_configuration_service_imp(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpQueryParams,
    ) -> Result<ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpResponse, E>;

    /// ComAdobeFormsCommonServletTempCleanUpTask - POST /system/console/configMgr/com.adobe.forms.common.servlet.TempCleanUpTask
    async fn com_adobe_forms_common_servlet_temp_clean_up_task(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeFormsCommonServletTempCleanUpTaskQueryParams,
    ) -> Result<ComAdobeFormsCommonServletTempCleanUpTaskResponse, E>;

    /// ComAdobeGraniteAcpPlatformPlatformServlet - POST /system/console/configMgr/com.adobe.granite.acp.platform.PlatformServlet
    async fn com_adobe_granite_acp_platform_platform_servlet(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeGraniteAcpPlatformPlatformServletQueryParams,
    ) -> Result<ComAdobeGraniteAcpPlatformPlatformServletResponse, E>;

    /// ComAdobeGraniteActivitystreamsImplActivityManagerImpl - POST /system/console/configMgr/com.adobe.granite.activitystreams.impl.ActivityManagerImpl
    async fn com_adobe_granite_activitystreams_impl_activity_manager_impl(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeGraniteActivitystreamsImplActivityManagerImplQueryParams,
    ) -> Result<ComAdobeGraniteActivitystreamsImplActivityManagerImplResponse, E>;

    /// ComAdobeGraniteAnalyzerBaseSystemStatusServlet - POST /system/console/configMgr/com.adobe.granite.analyzer.base.SystemStatusServlet
    async fn com_adobe_granite_analyzer_base_system_status_servlet(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeGraniteAnalyzerBaseSystemStatusServletQueryParams,
    ) -> Result<ComAdobeGraniteAnalyzerBaseSystemStatusServletResponse, E>;

    /// ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServlet - POST /system/console/configMgr/com.adobe.granite.analyzer.scripts.compile.AllScriptsCompilerServlet
    async fn com_adobe_granite_analyzer_scripts_compile_all_scripts_compiler_servlet(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletQueryParams,
    ) -> Result<ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletResponse, E>;

    /// ComAdobeGraniteApicontrollerFilterResolverHookFactory - POST /system/console/configMgr/com.adobe.granite.apicontroller.FilterResolverHookFactory
    async fn com_adobe_granite_apicontroller_filter_resolver_hook_factory(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeGraniteApicontrollerFilterResolverHookFactoryQueryParams,
    ) -> Result<ComAdobeGraniteApicontrollerFilterResolverHookFactoryResponse, E>;

    /// ComAdobeGraniteAuthCertImplClientCertAuthHandler - POST /system/console/configMgr/com.adobe.granite.auth.cert.impl.ClientCertAuthHandler
    async fn com_adobe_granite_auth_cert_impl_client_cert_auth_handler(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeGraniteAuthCertImplClientCertAuthHandlerQueryParams,
    ) -> Result<ComAdobeGraniteAuthCertImplClientCertAuthHandlerResponse, E>;

    /// ComAdobeGraniteAuthIms - POST /system/console/configMgr/com.adobe.granite.auth.ims
    async fn com_adobe_granite_auth_ims(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeGraniteAuthImsQueryParams,
    ) -> Result<ComAdobeGraniteAuthImsResponse, E>;

    /// ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtension - POST /system/console/configMgr/com.adobe.granite.auth.ims.impl.ExternalUserIdMappingProviderExtension
    async fn com_adobe_granite_auth_ims_impl_external_user_id_mapping_provider_extension(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionQueryParams,
    ) -> Result<ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionResponse, E>;

    /// ComAdobeGraniteAuthImsImplImsAccessTokenRequestCustomizerImpl - POST /system/console/configMgr/com.adobe.granite.auth.ims.impl.IMSAccessTokenRequestCustomizerImpl
    async fn com_adobe_granite_auth_ims_impl_ims_access_token_request_customizer_impl(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeGraniteAuthImsImplImsAccessTokenRequestCustomizerImplQueryParams,
    ) -> Result<ComAdobeGraniteAuthImsImplImsAccessTokenRequestCustomizerImplResponse, E>;

    /// ComAdobeGraniteAuthImsImplImsConfigProviderImpl - POST /system/console/configMgr/com.adobe.granite.auth.ims.impl.ImsConfigProviderImpl
    async fn com_adobe_granite_auth_ims_impl_ims_config_provider_impl(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeGraniteAuthImsImplImsConfigProviderImplQueryParams,
    ) -> Result<ComAdobeGraniteAuthImsImplImsConfigProviderImplResponse, E>;

    /// ComAdobeGraniteAuthImsImplImsInstanceCredentialsValidator - POST /system/console/configMgr/com.adobe.granite.auth.ims.impl.IMSInstanceCredentialsValidator
    async fn com_adobe_granite_auth_ims_impl_ims_instance_credentials_validator(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeGraniteAuthImsImplImsInstanceCredentialsValidatorQueryParams,
    ) -> Result<ComAdobeGraniteAuthImsImplImsInstanceCredentialsValidatorResponse, E>;

    /// ComAdobeGraniteAuthImsImplImsProviderImpl - POST /system/console/configMgr/com.adobe.granite.auth.ims.impl.IMSProviderImpl
    async fn com_adobe_granite_auth_ims_impl_ims_provider_impl(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeGraniteAuthImsImplImsProviderImplQueryParams,
    ) -> Result<ComAdobeGraniteAuthImsImplImsProviderImplResponse, E>;

    /// ComAdobeGraniteAuthOauthAccesstokenProvider - POST /system/console/configMgr/com.adobe.granite.auth.oauth.accesstoken.provider
    async fn com_adobe_granite_auth_oauth_accesstoken_provider(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeGraniteAuthOauthAccesstokenProviderQueryParams,
    ) -> Result<ComAdobeGraniteAuthOauthAccesstokenProviderResponse, E>;

    /// ComAdobeGraniteAuthOauthImplBearerAuthenticationHandler - POST /system/console/configMgr/com.adobe.granite.auth.oauth.impl.BearerAuthenticationHandler
    async fn com_adobe_granite_auth_oauth_impl_bearer_authentication_handler(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerQueryParams,
    ) -> Result<ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerResponse, E>;

    /// ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImpl - POST /system/console/configMgr/com.adobe.granite.auth.oauth.impl.DefaultTokenValidatorImpl
    async fn com_adobe_granite_auth_oauth_impl_default_token_validator_impl(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplQueryParams,
    ) -> Result<ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplResponse, E>;

    /// ComAdobeGraniteAuthOauthImplFacebookProviderImpl - POST /system/console/configMgr/com.adobe.granite.auth.oauth.impl.FacebookProviderImpl
    async fn com_adobe_granite_auth_oauth_impl_facebook_provider_impl(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeGraniteAuthOauthImplFacebookProviderImplQueryParams,
    ) -> Result<ComAdobeGraniteAuthOauthImplFacebookProviderImplResponse, E>;

    /// ComAdobeGraniteAuthOauthImplGithubProviderImpl - POST /system/console/configMgr/com.adobe.granite.auth.oauth.impl.GithubProviderImpl
    async fn com_adobe_granite_auth_oauth_impl_github_provider_impl(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeGraniteAuthOauthImplGithubProviderImplQueryParams,
    ) -> Result<ComAdobeGraniteAuthOauthImplGithubProviderImplResponse, E>;

    /// ComAdobeGraniteAuthOauthImplGraniteProvider - POST /system/console/configMgr/com.adobe.granite.auth.oauth.impl.GraniteProvider
    async fn com_adobe_granite_auth_oauth_impl_granite_provider(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeGraniteAuthOauthImplGraniteProviderQueryParams,
    ) -> Result<ComAdobeGraniteAuthOauthImplGraniteProviderResponse, E>;

    /// ComAdobeGraniteAuthOauthImplHelperProviderConfigManager - POST /system/console/configMgr/com.adobe.granite.auth.oauth.impl.helper.ProviderConfigManager
    async fn com_adobe_granite_auth_oauth_impl_helper_provider_config_manager(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerQueryParams,
    ) -> Result<ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerResponse, E>;

    /// ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternal - POST /system/console/configMgr/com.adobe.granite.auth.oauth.impl.helper.ProviderConfigManagerInternal
    async fn com_adobe_granite_auth_oauth_impl_helper_provider_config_manager_internal(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalQueryParams,
    ) -> Result<ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalResponse, E>;

    /// ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandler - POST /system/console/configMgr/com.adobe.granite.auth.oauth.impl.OAuthAuthenticationHandler
    async fn com_adobe_granite_auth_oauth_impl_o_auth_authentication_handler(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerQueryParams,
    ) -> Result<ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerResponse, E>;

    /// ComAdobeGraniteAuthOauthImplTwitterProviderImpl - POST /system/console/configMgr/com.adobe.granite.auth.oauth.impl.TwitterProviderImpl
    async fn com_adobe_granite_auth_oauth_impl_twitter_provider_impl(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeGraniteAuthOauthImplTwitterProviderImplQueryParams,
    ) -> Result<ComAdobeGraniteAuthOauthImplTwitterProviderImplResponse, E>;

    /// ComAdobeGraniteAuthOauthProvider - POST /system/console/configMgr/com.adobe.granite.auth.oauth.provider
    async fn com_adobe_granite_auth_oauth_provider(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeGraniteAuthOauthProviderQueryParams,
    ) -> Result<ComAdobeGraniteAuthOauthProviderResponse, E>;

    /// ComAdobeGraniteAuthRequirementImplDefaultRequirementHandler - POST /system/console/configMgr/com.adobe.granite.auth.requirement.impl.DefaultRequirementHandler
    async fn com_adobe_granite_auth_requirement_impl_default_requirement_handler(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerQueryParams,
    ) -> Result<ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerResponse, E>;

    /// ComAdobeGraniteAuthSamlSamlAuthenticationHandler - POST /system/console/configMgr/com.adobe.granite.auth.saml.SamlAuthenticationHandler
    async fn com_adobe_granite_auth_saml_saml_authentication_handler(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeGraniteAuthSamlSamlAuthenticationHandlerQueryParams,
    ) -> Result<ComAdobeGraniteAuthSamlSamlAuthenticationHandlerResponse, E>;

    /// ComAdobeGraniteAuthSsoImplSsoAuthenticationHandler - POST /system/console/configMgr/com.adobe.granite.auth.sso.impl.SsoAuthenticationHandler
    async fn com_adobe_granite_auth_sso_impl_sso_authentication_handler(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerQueryParams,
    ) -> Result<ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerResponse, E>;

    /// ComAdobeGraniteBundlesHcImplCodeCacheHealthCheck - POST /system/console/configMgr/com.adobe.granite.bundles.hc.impl.CodeCacheHealthCheck
    async fn com_adobe_granite_bundles_hc_impl_code_cache_health_check(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckQueryParams,
    ) -> Result<ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckResponse, E>;

    /// ComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheck - POST /system/console/configMgr/com.adobe.granite.bundles.hc.impl.CrxdeSupportBundleHealthCheck
    async fn com_adobe_granite_bundles_hc_impl_crxde_support_bundle_health_check(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckQueryParams,
    ) -> Result<ComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckResponse, E>;

    /// ComAdobeGraniteBundlesHcImplDavExBundleHealthCheck - POST /system/console/configMgr/com.adobe.granite.bundles.hc.impl.DavExBundleHealthCheck
    async fn com_adobe_granite_bundles_hc_impl_dav_ex_bundle_health_check(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeGraniteBundlesHcImplDavExBundleHealthCheckQueryParams,
    ) -> Result<ComAdobeGraniteBundlesHcImplDavExBundleHealthCheckResponse, E>;

    /// ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheck - POST /system/console/configMgr/com.adobe.granite.bundles.hc.impl.InactiveBundlesHealthCheck
    async fn com_adobe_granite_bundles_hc_impl_inactive_bundles_health_check(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckQueryParams,
    ) -> Result<ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckResponse, E>;

    /// ComAdobeGraniteBundlesHcImplJobsHealthCheck - POST /system/console/configMgr/com.adobe.granite.bundles.hc.impl.JobsHealthCheck
    async fn com_adobe_granite_bundles_hc_impl_jobs_health_check(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeGraniteBundlesHcImplJobsHealthCheckQueryParams,
    ) -> Result<ComAdobeGraniteBundlesHcImplJobsHealthCheckResponse, E>;

    /// ComAdobeGraniteBundlesHcImplSlingGetServletHealthCheck - POST /system/console/configMgr/com.adobe.granite.bundles.hc.impl.SlingGetServletHealthCheck
    async fn com_adobe_granite_bundles_hc_impl_sling_get_servlet_health_check(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeGraniteBundlesHcImplSlingGetServletHealthCheckQueryParams,
    ) -> Result<ComAdobeGraniteBundlesHcImplSlingGetServletHealthCheckResponse, E>;

    /// ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheck - POST /system/console/configMgr/com.adobe.granite.bundles.hc.impl.SlingJavaScriptHandlerHealthCheck
    async fn com_adobe_granite_bundles_hc_impl_sling_java_script_handler_health_check(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckQueryParams,
    ) -> Result<ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckResponse, E>;

    /// ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheck - POST /system/console/configMgr/com.adobe.granite.bundles.hc.impl.SlingJspScriptHandlerHealthCheck
    async fn com_adobe_granite_bundles_hc_impl_sling_jsp_script_handler_health_check(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckQueryParams,
    ) -> Result<ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckResponse, E>;

    /// ComAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheck - POST /system/console/configMgr/com.adobe.granite.bundles.hc.impl.SlingReferrerFilterHealthCheck
    async fn com_adobe_granite_bundles_hc_impl_sling_referrer_filter_health_check(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckQueryParams,
    ) -> Result<ComAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckResponse, E>;

    /// ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheck - POST /system/console/configMgr/com.adobe.granite.bundles.hc.impl.WebDavBundleHealthCheck
    async fn com_adobe_granite_bundles_hc_impl_web_dav_bundle_health_check(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheckQueryParams,
    ) -> Result<ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheckResponse, E>;

    /// ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFac - POST /system/console/configMgr/com.adobe.granite.comments.internal.CommentReplicationContentFilterFactory
    async fn com_adobe_granite_comments_internal_comment_replication_content_filter_fac(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacQueryParams,
    ) -> Result<ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacResponse, E>;

    /// ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImpl - POST /system/console/configMgr/com.adobe.granite.compatrouter.impl.CompatSwitchingServiceImpl
    async fn com_adobe_granite_compatrouter_impl_compat_switching_service_impl(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplQueryParams,
    ) -> Result<ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplResponse, E>;

    /// ComAdobeGraniteCompatrouterImplRoutingConfig - POST /system/console/configMgr/com.adobe.granite.compatrouter.impl.RoutingConfig
    async fn com_adobe_granite_compatrouter_impl_routing_config(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeGraniteCompatrouterImplRoutingConfigQueryParams,
    ) -> Result<ComAdobeGraniteCompatrouterImplRoutingConfigResponse, E>;

    /// ComAdobeGraniteCompatrouterImplSwitchMappingConfig - POST /system/console/configMgr/com.adobe.granite.compatrouter.impl.SwitchMappingConfig
    async fn com_adobe_granite_compatrouter_impl_switch_mapping_config(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeGraniteCompatrouterImplSwitchMappingConfigQueryParams,
    ) -> Result<ComAdobeGraniteCompatrouterImplSwitchMappingConfigResponse, E>;

    /// ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolving - POST /system/console/configMgr/com.adobe.granite.conf.impl.RuntimeAwareConfigurationResourceResolvingStrategy
    async fn com_adobe_granite_conf_impl_runtime_aware_configuration_resource_resolving(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingQueryParams,
    ) -> Result<ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingResponse, E>;

    /// ComAdobeGraniteContexthubImplContextHubImpl - POST /system/console/configMgr/com.adobe.granite.contexthub.impl.ContextHubImpl
    async fn com_adobe_granite_contexthub_impl_context_hub_impl(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeGraniteContexthubImplContextHubImplQueryParams,
    ) -> Result<ComAdobeGraniteContexthubImplContextHubImplResponse, E>;

    /// ComAdobeGraniteCorsImplCorsPolicyImpl - POST /system/console/configMgr/com.adobe.granite.cors.impl.CORSPolicyImpl
    async fn com_adobe_granite_cors_impl_cors_policy_impl(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeGraniteCorsImplCorsPolicyImplQueryParams,
    ) -> Result<ComAdobeGraniteCorsImplCorsPolicyImplResponse, E>;

    /// ComAdobeGraniteCsrfImplCsrfFilter - POST /system/console/configMgr/com.adobe.granite.csrf.impl.CSRFFilter
    async fn com_adobe_granite_csrf_impl_csrf_filter(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeGraniteCsrfImplCsrfFilterQueryParams,
    ) -> Result<ComAdobeGraniteCsrfImplCsrfFilterResponse, E>;

    /// ComAdobeGraniteCsrfImplCsrfServlet - POST /system/console/configMgr/com.adobe.granite.csrf.impl.CSRFServlet
    async fn com_adobe_granite_csrf_impl_csrf_servlet(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeGraniteCsrfImplCsrfServletQueryParams,
    ) -> Result<ComAdobeGraniteCsrfImplCsrfServletResponse, E>;

    /// ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSe - POST /system/console/configMgr/com.adobe.granite.distribution.core.impl.CryptoDistributionTransportSecretProvider
    async fn com_adobe_granite_distribution_core_impl_crypto_distribution_transport_se(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeQueryParams,
    ) -> Result<ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeResponse, E>;

    /// ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserver - POST /system/console/configMgr/com.adobe.granite.distribution.core.impl.diff.DiffChangesObserver
    async fn com_adobe_granite_distribution_core_impl_diff_diff_changes_observer(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverQueryParams,
    ) -> Result<ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverResponse, E>;

    /// ComAdobeGraniteDistributionCoreImplDiffDiffEventListener - POST /system/console/configMgr/com.adobe.granite.distribution.core.impl.diff.DiffEventListener
    async fn com_adobe_granite_distribution_core_impl_diff_diff_event_listener(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerQueryParams,
    ) -> Result<ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerResponse, E>;

    /// ComAdobeGraniteDistributionCoreImplDistributionToReplicationEven - POST /system/console/configMgr/com.adobe.granite.distribution.core.impl.DistributionToReplicationEventTransformer
    async fn com_adobe_granite_distribution_core_impl_distribution_to_replication_even(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenQueryParams,
    ) -> Result<ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenResponse, E>;

    /// ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicat - POST /system/console/configMgr/com.adobe.granite.distribution.core.impl.replication.adapters.ReplicationAgentProvider
    async fn com_adobe_granite_distribution_core_impl_replication_adapters_replicat(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatQueryParams,
    ) -> Result<ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatResponse, E>;

    /// ComAdobeGraniteDistributionCoreImplReplicationDistributionTrans - POST /system/console/configMgr/com.adobe.granite.distribution.core.impl.replication.DistributionTransportHandler
    async fn com_adobe_granite_distribution_core_impl_replication_distribution_trans(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeGraniteDistributionCoreImplReplicationDistributionTransQueryParams,
    ) -> Result<ComAdobeGraniteDistributionCoreImplReplicationDistributionTransResponse, E>;

    /// ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribu - POST /system/console/configMgr/com.adobe.granite.distribution.core.impl.transport.AccessTokenDistributionTransportSecretProvider
    async fn com_adobe_granite_distribution_core_impl_transport_access_token_distribu(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuQueryParams,
    ) -> Result<ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuResponse, E>;

    /// ComAdobeGraniteFragsImplCheckHttpHeaderFlag - POST /system/console/configMgr/com.adobe.granite.frags.impl.CheckHttpHeaderFlag
    async fn com_adobe_granite_frags_impl_check_http_header_flag(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeGraniteFragsImplCheckHttpHeaderFlagQueryParams,
    ) -> Result<ComAdobeGraniteFragsImplCheckHttpHeaderFlagResponse, E>;

    /// ComAdobeGraniteFragsImplRandomFeature - POST /system/console/configMgr/com.adobe.granite.frags.impl.RandomFeature
    async fn com_adobe_granite_frags_impl_random_feature(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeGraniteFragsImplRandomFeatureQueryParams,
    ) -> Result<ComAdobeGraniteFragsImplRandomFeatureResponse, E>;

    /// ComAdobeGraniteHttpcacheFileFileCacheStore - POST /system/console/configMgr/com.adobe.granite.httpcache.file.FileCacheStore
    async fn com_adobe_granite_httpcache_file_file_cache_store(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeGraniteHttpcacheFileFileCacheStoreQueryParams,
    ) -> Result<ComAdobeGraniteHttpcacheFileFileCacheStoreResponse, E>;

    /// ComAdobeGraniteHttpcacheImplOuterCacheFilter - POST /system/console/configMgr/com.adobe.granite.httpcache.impl.OuterCacheFilter
    async fn com_adobe_granite_httpcache_impl_outer_cache_filter(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeGraniteHttpcacheImplOuterCacheFilterQueryParams,
    ) -> Result<ComAdobeGraniteHttpcacheImplOuterCacheFilterResponse, E>;

    /// ComAdobeGraniteI18nImplBundlePseudoTranslations - POST /system/console/configMgr/com.adobe.granite.i18n.impl.bundle.PseudoTranslations
    async fn com_adobe_granite_i18n_impl_bundle_pseudo_translations(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeGraniteI18nImplBundlePseudoTranslationsQueryParams,
    ) -> Result<ComAdobeGraniteI18nImplBundlePseudoTranslationsResponse, E>;

    /// ComAdobeGraniteI18nImplPreferencesLocaleResolverService - POST /system/console/configMgr/com.adobe.granite.i18n.impl.PreferencesLocaleResolverService
    async fn com_adobe_granite_i18n_impl_preferences_locale_resolver_service(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceQueryParams,
    ) -> Result<ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceResponse, E>;

    /// ComAdobeGraniteInfocollectorInfoCollector - POST /system/console/configMgr/com.adobe.granite.infocollector.InfoCollector
    async fn com_adobe_granite_infocollector_info_collector(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeGraniteInfocollectorInfoCollectorQueryParams,
    ) -> Result<ComAdobeGraniteInfocollectorInfoCollectorResponse, E>;

    /// ComAdobeGraniteJettySslInternalGraniteSslConnectorFactory - POST /system/console/configMgr/com.adobe.granite.jetty.ssl.internal.GraniteSslConnectorFactory
    async fn com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_factory(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryQueryParams,
    ) -> Result<ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryResponse, E>;

    /// ComAdobeGraniteLicenseImplLicenseCheckFilter - POST /system/console/configMgr/com.adobe.granite.license.impl.LicenseCheckFilter
    async fn com_adobe_granite_license_impl_license_check_filter(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeGraniteLicenseImplLicenseCheckFilterQueryParams,
    ) -> Result<ComAdobeGraniteLicenseImplLicenseCheckFilterResponse, E>;

    /// ComAdobeGraniteLoggingImplLogAnalyserImpl - POST /system/console/configMgr/com.adobe.granite.logging.impl.LogAnalyserImpl
    async fn com_adobe_granite_logging_impl_log_analyser_impl(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeGraniteLoggingImplLogAnalyserImplQueryParams,
    ) -> Result<ComAdobeGraniteLoggingImplLogAnalyserImplResponse, E>;

    /// ComAdobeGraniteLoggingImplLogErrorHealthCheck - POST /system/console/configMgr/com.adobe.granite.logging.impl.LogErrorHealthCheck
    async fn com_adobe_granite_logging_impl_log_error_health_check(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeGraniteLoggingImplLogErrorHealthCheckQueryParams,
    ) -> Result<ComAdobeGraniteLoggingImplLogErrorHealthCheckResponse, E>;

    /// ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTask - POST /system/console/configMgr/com.adobe.granite.maintenance.crx.impl.DataStoreGarbageCollectionTask
    async fn com_adobe_granite_maintenance_crx_impl_data_store_garbage_collection_task(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskQueryParams,
    ) -> Result<ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskResponse, E>;

    /// ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTask - POST /system/console/configMgr/com.adobe.granite.maintenance.crx.impl.LuceneBinariesCleanupTask
    async fn com_adobe_granite_maintenance_crx_impl_lucene_binaries_cleanup_task(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskQueryParams,
    ) -> Result<ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskResponse, E>;

    /// ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTask - POST /system/console/configMgr/com.adobe.granite.maintenance.crx.impl.RevisionCleanupTask
    async fn com_adobe_granite_maintenance_crx_impl_revision_cleanup_task(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskQueryParams,
    ) -> Result<ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskResponse, E>;

    /// ComAdobeGraniteMonitoringImplScriptConfigImpl - POST /system/console/configMgr/com.adobe.granite.monitoring.impl.ScriptConfigImpl
    async fn com_adobe_granite_monitoring_impl_script_config_impl(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeGraniteMonitoringImplScriptConfigImplQueryParams,
    ) -> Result<ComAdobeGraniteMonitoringImplScriptConfigImplResponse, E>;

    /// ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHan - POST /system/console/configMgr/com.adobe.granite.oauth.server.auth.impl.OAuth2ServerAuthenticationHandler
    async fn com_adobe_granite_oauth_server_auth_impl_o_auth2_server_authentication_han(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanQueryParams,
    ) -> Result<ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanResponse, E>;

    /// ComAdobeGraniteOauthServerImplAccessTokenCleanupTask - POST /system/console/configMgr/com.adobe.granite.oauth.server.impl.AccessTokenCleanupTask
    async fn com_adobe_granite_oauth_server_impl_access_token_cleanup_task(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeGraniteOauthServerImplAccessTokenCleanupTaskQueryParams,
    ) -> Result<ComAdobeGraniteOauthServerImplAccessTokenCleanupTaskResponse, E>;

    /// ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServlet - POST /system/console/configMgr/com.adobe.granite.oauth.server.impl.OAuth2ClientRevocationServlet
    async fn com_adobe_granite_oauth_server_impl_o_auth2_client_revocation_servlet(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletQueryParams,
    ) -> Result<ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletResponse, E>;

    /// ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServlet - POST /system/console/configMgr/com.adobe.granite.oauth.server.impl.OAuth2RevocationEndpointServlet
    async fn com_adobe_granite_oauth_server_impl_o_auth2_revocation_endpoint_servlet(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletQueryParams,
    ) -> Result<ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletResponse, E>;

    /// ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServlet - POST /system/console/configMgr/com.adobe.granite.oauth.server.impl.OAuth2TokenEndpointServlet
    async fn com_adobe_granite_oauth_server_impl_o_auth2_token_endpoint_servlet(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletQueryParams,
    ) -> Result<ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletResponse, E>;

    /// ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServlet - POST /system/console/configMgr/com.adobe.granite.oauth.server.impl.OAuth2TokenRevocationServlet
    async fn com_adobe_granite_oauth_server_impl_o_auth2_token_revocation_servlet(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletQueryParams,
    ) -> Result<ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletResponse, E>;

    /// ComAdobeGraniteOffloadingImplOffloadingConfigurator - POST /system/console/configMgr/com.adobe.granite.offloading.impl.OffloadingConfigurator
    async fn com_adobe_granite_offloading_impl_offloading_configurator(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeGraniteOffloadingImplOffloadingConfiguratorQueryParams,
    ) -> Result<ComAdobeGraniteOffloadingImplOffloadingConfiguratorResponse, E>;

    /// ComAdobeGraniteOffloadingImplOffloadingJobCloner - POST /system/console/configMgr/com.adobe.granite.offloading.impl.OffloadingJobCloner
    async fn com_adobe_granite_offloading_impl_offloading_job_cloner(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeGraniteOffloadingImplOffloadingJobClonerQueryParams,
    ) -> Result<ComAdobeGraniteOffloadingImplOffloadingJobClonerResponse, E>;

    /// ComAdobeGraniteOffloadingImplOffloadingJobOffloader - POST /system/console/configMgr/com.adobe.granite.offloading.impl.OffloadingJobOffloader
    async fn com_adobe_granite_offloading_impl_offloading_job_offloader(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeGraniteOffloadingImplOffloadingJobOffloaderQueryParams,
    ) -> Result<ComAdobeGraniteOffloadingImplOffloadingJobOffloaderResponse, E>;

    /// ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManager - POST /system/console/configMgr/com.adobe.granite.offloading.impl.transporter.OffloadingAgentManager
    async fn com_adobe_granite_offloading_impl_transporter_offloading_agent_manager(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerQueryParams,
    ) -> Result<ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerResponse, E>;

    /// ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspo - POST /system/console/configMgr/com.adobe.granite.offloading.impl.transporter.OffloadingDefaultTransporter
    async fn com_adobe_granite_offloading_impl_transporter_offloading_default_transpo(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoQueryParams,
    ) -> Result<ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoResponse, E>;

    /// ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImpl - POST /system/console/configMgr/com.adobe.granite.omnisearch.impl.core.OmniSearchServiceImpl
    async fn com_adobe_granite_omnisearch_impl_core_omni_search_service_impl(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplQueryParams,
    ) -> Result<ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplResponse, E>;

    /// ComAdobeGraniteOptoutImplOptOutServiceImpl - POST /system/console/configMgr/com.adobe.granite.optout.impl.OptOutServiceImpl
    async fn com_adobe_granite_optout_impl_opt_out_service_impl(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeGraniteOptoutImplOptOutServiceImplQueryParams,
    ) -> Result<ComAdobeGraniteOptoutImplOptOutServiceImplResponse, E>;

    /// ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheck - POST /system/console/configMgr/com.adobe.granite.queries.impl.hc.AsyncIndexHealthCheck
    async fn com_adobe_granite_queries_impl_hc_async_index_health_check(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckQueryParams,
    ) -> Result<ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckResponse, E>;

    /// ComAdobeGraniteQueriesImplHcLargeIndexHealthCheck - POST /system/console/configMgr/com.adobe.granite.queries.impl.hc.LargeIndexHealthCheck
    async fn com_adobe_granite_queries_impl_hc_large_index_health_check(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckQueryParams,
    ) -> Result<ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckResponse, E>;

    /// ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheck - POST /system/console/configMgr/com.adobe.granite.queries.impl.hc.QueriesStatusHealthCheck
    async fn com_adobe_granite_queries_impl_hc_queries_status_health_check(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheckQueryParams,
    ) -> Result<ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheckResponse, E>;

    /// ComAdobeGraniteQueriesImplHcQueryHealthCheckMetrics - POST /system/console/configMgr/com.adobe.granite.queries.impl.hc.QueryHealthCheckMetrics
    async fn com_adobe_granite_queries_impl_hc_query_health_check_metrics(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsQueryParams,
    ) -> Result<ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsResponse, E>;

    /// ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheck - POST /system/console/configMgr/com.adobe.granite.queries.impl.hc.QueryLimitsHealthCheck
    async fn com_adobe_granite_queries_impl_hc_query_limits_health_check(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckQueryParams,
    ) -> Result<ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckResponse, E>;

    /// ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheck - POST /system/console/configMgr/com.adobe.granite.replication.hc.impl.ReplicationQueueHealthCheck
    async fn com_adobe_granite_replication_hc_impl_replication_queue_health_check(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckQueryParams,
    ) -> Result<ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckResponse, E>;

    /// ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthC - POST /system/console/configMgr/com.adobe.granite.replication.hc.impl.ReplicationTransportUsersHealthCheck
    async fn com_adobe_granite_replication_hc_impl_replication_transport_users_health_c(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCQueryParams,
    ) -> Result<ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCResponse, E>;

    /// ComAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheck - POST /system/console/configMgr/com.adobe.granite.repository.hc.impl.AuthorizableNodeNameHealthCheck
    async fn com_adobe_granite_repository_hc_impl_authorizable_node_name_health_check(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckQueryParams,
    ) -> Result<ComAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckResponse, E>;

    /// ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthC - POST /system/console/configMgr/com.adobe.granite.repository.hc.impl.content.sling.SlingContentHealthCheck
    async fn com_adobe_granite_repository_hc_impl_content_sling_sling_content_health_c(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCQueryParams,
    ) -> Result<ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCResponse, E>;

    /// ComAdobeGraniteRepositoryHcImplContinuousRgcHealthCheck - POST /system/console/configMgr/com.adobe.granite.repository.hc.impl.ContinuousRGCHealthCheck
    async fn com_adobe_granite_repository_hc_impl_continuous_rgc_health_check(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeGraniteRepositoryHcImplContinuousRgcHealthCheckQueryParams,
    ) -> Result<ComAdobeGraniteRepositoryHcImplContinuousRgcHealthCheckResponse, E>;

    /// ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthChe - POST /system/console/configMgr/com.adobe.granite.repository.hc.impl.DefaultAccessUserProfileHealthCheck
    async fn com_adobe_granite_repository_hc_impl_default_access_user_profile_health_che(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheQueryParams,
    ) -> Result<ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheResponse, E>;

    /// ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheck - POST /system/console/configMgr/com.adobe.granite.repository.hc.impl.DefaultLoginsHealthCheck
    async fn com_adobe_granite_repository_hc_impl_default_logins_health_check(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckQueryParams,
    ) -> Result<ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckResponse, E>;

    /// ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheck - POST /system/console/configMgr/com.adobe.granite.repository.hc.impl.DiskSpaceHealthCheck
    async fn com_adobe_granite_repository_hc_impl_disk_space_health_check(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckQueryParams,
    ) -> Result<ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckResponse, E>;

    /// ComAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheck - POST /system/console/configMgr/com.adobe.granite.repository.hc.impl.ObservationQueueLengthHealthCheck
    async fn com_adobe_granite_repository_hc_impl_observation_queue_length_health_check(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckQueryParams,
    ) -> Result<ComAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckResponse, E>;

    /// ComAdobeGraniteRepositoryImplCommitStatsConfig - POST /system/console/configMgr/com.adobe.granite.repository.impl.CommitStatsConfig
    async fn com_adobe_granite_repository_impl_commit_stats_config(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeGraniteRepositoryImplCommitStatsConfigQueryParams,
    ) -> Result<ComAdobeGraniteRepositoryImplCommitStatsConfigResponse, E>;

    /// ComAdobeGraniteRepositoryServiceUserConfiguration - POST /system/console/configMgr/com.adobe.granite.repository.ServiceUserConfiguration
    async fn com_adobe_granite_repository_service_user_configuration(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeGraniteRepositoryServiceUserConfigurationQueryParams,
    ) -> Result<ComAdobeGraniteRepositoryServiceUserConfigurationResponse, E>;

    /// ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckIm - POST /system/console/configMgr/com.adobe.granite.requests.logging.impl.hc.RequestsStatusHealthCheckImpl
    async fn com_adobe_granite_requests_logging_impl_hc_requests_status_health_check_im(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImQueryParams,
    ) -> Result<ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImResponse, E>;

    /// ComAdobeGraniteResourcestatusImplCompositeStatusType - POST /system/console/configMgr/com.adobe.granite.resourcestatus.impl.CompositeStatusType
    async fn com_adobe_granite_resourcestatus_impl_composite_status_type(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeGraniteResourcestatusImplCompositeStatusTypeQueryParams,
    ) -> Result<ComAdobeGraniteResourcestatusImplCompositeStatusTypeResponse, E>;

    /// ComAdobeGraniteResourcestatusImplStatusResourceProviderImpl - POST /system/console/configMgr/com.adobe.granite.resourcestatus.impl.StatusResourceProviderImpl
    async fn com_adobe_granite_resourcestatus_impl_status_resource_provider_impl(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeGraniteResourcestatusImplStatusResourceProviderImplQueryParams,
    ) -> Result<ComAdobeGraniteResourcestatusImplStatusResourceProviderImplResponse, E>;

    /// ComAdobeGraniteRestAssetsImplAssetContentDispositionFilter - POST /system/console/configMgr/com.adobe.granite.rest.assets.impl.AssetContentDispositionFilter
    async fn com_adobe_granite_rest_assets_impl_asset_content_disposition_filter(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterQueryParams,
    ) -> Result<ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterResponse, E>;

    /// ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImpl - POST /system/console/configMgr/com.adobe.granite.rest.impl.ApiEndpointResourceProviderFactoryImpl
    async fn com_adobe_granite_rest_impl_api_endpoint_resource_provider_factory_impl(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplQueryParams,
    ) -> Result<ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplResponse, E>;

    /// ComAdobeGraniteRestImplServletDefaultGetServlet - POST /system/console/configMgr/com.adobe.granite.rest.impl.servlet.DefaultGETServlet
    async fn com_adobe_granite_rest_impl_servlet_default_get_servlet(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeGraniteRestImplServletDefaultGetServletQueryParams,
    ) -> Result<ComAdobeGraniteRestImplServletDefaultGetServletResponse, E>;

    /// ComAdobeGraniteSecurityUserUiInternalServletsSslConfigurationS - POST /system/console/configMgr/com.adobe.granite.security.user.ui.internal.servlets.SSLConfigurationServlet
    async fn com_adobe_granite_security_user_ui_internal_servlets_ssl_configuration_s(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeGraniteSecurityUserUiInternalServletsSslConfigurationSQueryParams,
    ) -> Result<ComAdobeGraniteSecurityUserUiInternalServletsSslConfigurationSResponse, E>;

    /// ComAdobeGraniteSecurityUserUserPropertiesService - POST /system/console/configMgr/com.adobe.granite.security.user.UserPropertiesService
    async fn com_adobe_granite_security_user_user_properties_service(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeGraniteSecurityUserUserPropertiesServiceQueryParams,
    ) -> Result<ComAdobeGraniteSecurityUserUserPropertiesServiceResponse, E>;

    /// ComAdobeGraniteSocialgraphImplSocialGraphFactoryImpl - POST /system/console/configMgr/com.adobe.granite.socialgraph.impl.SocialGraphFactoryImpl
    async fn com_adobe_granite_socialgraph_impl_social_graph_factory_impl(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplQueryParams,
    ) -> Result<ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplResponse, E>;

    /// ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImpl - POST /system/console/configMgr/com.adobe.granite.system.monitoring.impl.SystemStatsMBeanImpl
    async fn com_adobe_granite_system_monitoring_impl_system_stats_m_bean_impl(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplQueryParams,
    ) -> Result<ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplResponse, E>;

    /// ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactory - POST /system/console/configMgr/com.adobe.granite.taskmanagement.impl.jcr.TaskAdapterFactory
    async fn com_adobe_granite_taskmanagement_impl_jcr_task_adapter_factory(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryQueryParams,
    ) -> Result<ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryResponse, E>;

    /// ComAdobeGraniteTaskmanagementImplJcrTaskArchiveService - POST /system/console/configMgr/com.adobe.granite.taskmanagement.impl.jcr.TaskArchiveService
    async fn com_adobe_granite_taskmanagement_impl_jcr_task_archive_service(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceQueryParams,
    ) -> Result<ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceResponse, E>;

    /// ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTask - POST /system/console/configMgr/com.adobe.granite.taskmanagement.impl.purge.TaskPurgeMaintenanceTask
    async fn com_adobe_granite_taskmanagement_impl_purge_task_purge_maintenance_task(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskQueryParams,
    ) -> Result<ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskResponse, E>;

    /// ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactor - POST /system/console/configMgr/com.adobe.granite.taskmanagement.impl.service.TaskManagerAdapterFactory
    async fn com_adobe_granite_taskmanagement_impl_service_task_manager_adapter_factor(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorQueryParams,
    ) -> Result<ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorResponse, E>;

    /// ComAdobeGraniteThreaddumpThreadDumpCollector - POST /system/console/configMgr/com.adobe.granite.threaddump.ThreadDumpCollector
    async fn com_adobe_granite_threaddump_thread_dump_collector(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeGraniteThreaddumpThreadDumpCollectorQueryParams,
    ) -> Result<ComAdobeGraniteThreaddumpThreadDumpCollectorResponse, E>;

    /// ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTransl - POST /system/console/configMgr/com.adobe.granite.translation.connector.msft.core.impl.MicrosoftTranslationServiceFactoryImpl
    async fn com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslQueryParams,
    ) -> Result<ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslResponse, E>;

    /// ComAdobeGraniteTranslationCoreImplTranslationManagerImpl - POST /system/console/configMgr/com.adobe.granite.translation.core.impl.TranslationManagerImpl
    async fn com_adobe_granite_translation_core_impl_translation_manager_impl(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeGraniteTranslationCoreImplTranslationManagerImplQueryParams,
    ) -> Result<ComAdobeGraniteTranslationCoreImplTranslationManagerImplResponse, E>;

    /// ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImpl - POST /system/console/configMgr/com.adobe.granite.ui.clientlibs.impl.HtmlLibraryManagerImpl
    async fn com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplQueryParams,
    ) -> Result<ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplResponse, E>;

    /// ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeature - POST /system/console/configMgr/com.adobe.granite.workflow.console.frags.WorkflowWithdrawFeature
    async fn com_adobe_granite_workflow_console_frags_workflow_withdraw_feature(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureQueryParams,
    ) -> Result<ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureResponse, E>;

    /// ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventService - POST /system/console/configMgr/com.adobe.granite.workflow.console.publish.WorkflowPublishEventService
    async fn com_adobe_granite_workflow_console_publish_workflow_publish_event_service(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceQueryParams,
    ) -> Result<ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceResponse, E>;

    /// ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManager - POST /system/console/configMgr/com.adobe.granite.workflow.core.jcr.WorkflowBucketManager
    async fn com_adobe_granite_workflow_core_jcr_workflow_bucket_manager(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerQueryParams,
    ) -> Result<ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerResponse, E>;

    /// ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandler - POST /system/console/configMgr/com.adobe.granite.workflow.core.job.ExternalProcessJobHandler
    async fn com_adobe_granite_workflow_core_job_external_process_job_handler(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerQueryParams,
    ) -> Result<ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerResponse, E>;

    /// ComAdobeGraniteWorkflowCoreJobJobHandler - POST /system/console/configMgr/com.adobe.granite.workflow.core.job.JobHandler
    async fn com_adobe_granite_workflow_core_job_job_handler(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeGraniteWorkflowCoreJobJobHandlerQueryParams,
    ) -> Result<ComAdobeGraniteWorkflowCoreJobJobHandlerResponse, E>;

    /// ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsum - POST /system/console/configMgr/com.adobe.granite.workflow.core.offloading.WorkflowOffloadingJobConsumer
    async fn com_adobe_granite_workflow_core_offloading_workflow_offloading_job_consum(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumQueryParams,
    ) -> Result<ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumResponse, E>;

    /// ComAdobeGraniteWorkflowCorePayloadMapCache - POST /system/console/configMgr/com.adobe.granite.workflow.core.PayloadMapCache
    async fn com_adobe_granite_workflow_core_payload_map_cache(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeGraniteWorkflowCorePayloadMapCacheQueryParams,
    ) -> Result<ComAdobeGraniteWorkflowCorePayloadMapCacheResponse, E>;

    /// ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListener - POST /system/console/configMgr/com.adobe.granite.workflow.core.payloadmap.PayloadMoveListener
    async fn com_adobe_granite_workflow_core_payloadmap_payload_move_listener(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerQueryParams,
    ) -> Result<ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerResponse, E>;

    /// ComAdobeGraniteWorkflowCoreWorkflowConfig - POST /system/console/configMgr/com.adobe.granite.workflow.core.WorkflowConfig
    async fn com_adobe_granite_workflow_core_workflow_config(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeGraniteWorkflowCoreWorkflowConfigQueryParams,
    ) -> Result<ComAdobeGraniteWorkflowCoreWorkflowConfigResponse, E>;

    /// ComAdobeGraniteWorkflowCoreWorkflowSessionFactory - POST /system/console/configMgr/com.adobe.granite.workflow.core.WorkflowSessionFactory
    async fn com_adobe_granite_workflow_core_workflow_session_factory(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryQueryParams,
    ) -> Result<ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryResponse, E>;

    /// ComAdobeGraniteWorkflowPurgeScheduler - POST /system/console/configMgr/com.adobe.granite.workflow.purge.Scheduler
    async fn com_adobe_granite_workflow_purge_scheduler(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeGraniteWorkflowPurgeSchedulerQueryParams,
    ) -> Result<ComAdobeGraniteWorkflowPurgeSchedulerResponse, E>;

    /// ComAdobeOctopusNcommBootstrap - POST /system/console/configMgr/com.adobe.octopus.ncomm.bootstrap
    async fn com_adobe_octopus_ncomm_bootstrap(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeOctopusNcommBootstrapQueryParams,
    ) -> Result<ComAdobeOctopusNcommBootstrapResponse, E>;

    /// ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullS - POST /system/console/configMgr/com.adobe.social.integrations.livefyre.user.pingforpull.impl.PingPullServlet
    async fn com_adobe_social_integrations_livefyre_user_pingforpull_impl_ping_pull_s(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSQueryParams,
    ) -> Result<ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSResponse, E>;

    /// ComAdobeXmpWorkerFilesNcommXmpFilesNComm - POST /system/console/configMgr/com.adobe.xmp.worker.files.ncomm.XMPFilesNComm
    async fn com_adobe_xmp_worker_files_ncomm_xmp_files_n_comm(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComAdobeXmpWorkerFilesNcommXmpFilesNCommQueryParams,
    ) -> Result<ComAdobeXmpWorkerFilesNcommXmpFilesNCommResponse, E>;

    /// ComDayCommonsDatasourceJdbcpoolJdbcPoolService - POST /system/console/configMgr/com.day.commons.datasource.jdbcpool.JdbcPoolService
    async fn com_day_commons_datasource_jdbcpool_jdbc_pool_service(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceQueryParams,
    ) -> Result<ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceResponse, E>;

    /// ComDayCommonsHttpclient - POST /system/console/configMgr/com.day.commons.httpclient
    async fn com_day_commons_httpclient(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCommonsHttpclientQueryParams,
    ) -> Result<ComDayCommonsHttpclientResponse, E>;

    /// ComDayCqAnalyticsImplStorePropertiesChangeListener - POST /system/console/configMgr/com.day.cq.analytics.impl.StorePropertiesChangeListener
    async fn com_day_cq_analytics_impl_store_properties_change_listener(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqAnalyticsImplStorePropertiesChangeListenerQueryParams,
    ) -> Result<ComDayCqAnalyticsImplStorePropertiesChangeListenerResponse, E>;

    /// ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporte - POST /system/console/configMgr/com.day.cq.analytics.sitecatalyst.impl.exporter.ClassificationsExporter
    async fn com_day_cq_analytics_sitecatalyst_impl_exporter_classifications_exporte(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteQueryParams,
    ) -> Result<ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteResponse, E>;

    /// ComDayCqAnalyticsSitecatalystImplImporterReportImporter - POST /system/console/configMgr/com.day.cq.analytics.sitecatalyst.impl.importer.ReportImporter
    async fn com_day_cq_analytics_sitecatalyst_impl_importer_report_importer(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqAnalyticsSitecatalystImplImporterReportImporterQueryParams,
    ) -> Result<ComDayCqAnalyticsSitecatalystImplImporterReportImporterResponse, E>;

    /// ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactory - POST /system/console/configMgr/com.day.cq.analytics.sitecatalyst.impl.SitecatalystAdapterFactory
    async fn com_day_cq_analytics_sitecatalyst_impl_sitecatalyst_adapter_factory(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryQueryParams,
    ) -> Result<ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryResponse, E>;

    /// ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImpl - POST /system/console/configMgr/com.day.cq.analytics.sitecatalyst.impl.SitecatalystHttpClientImpl
    async fn com_day_cq_analytics_sitecatalyst_impl_sitecatalyst_http_client_impl(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplQueryParams,
    ) -> Result<ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplResponse, E>;

    /// ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdater - POST /system/console/configMgr/com.day.cq.analytics.testandtarget.impl.AccountOptionsUpdater
    async fn com_day_cq_analytics_testandtarget_impl_account_options_updater(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterQueryParams,
    ) -> Result<ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterResponse, E>;

    /// ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListener - POST /system/console/configMgr/com.day.cq.analytics.testandtarget.impl.DeleteAuthorActivityListener
    async fn com_day_cq_analytics_testandtarget_impl_delete_author_activity_listener(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerQueryParams,
    ) -> Result<ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerResponse, E>;

    /// ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListener - POST /system/console/configMgr/com.day.cq.analytics.testandtarget.impl.PushAuthorCampaignPageListener
    async fn com_day_cq_analytics_testandtarget_impl_push_author_campaign_page_listener(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerQueryParams,
    ) -> Result<ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerResponse, E>;

    /// ComDayCqAnalyticsTestandtargetImplSegmentImporter - POST /system/console/configMgr/com.day.cq.analytics.testandtarget.impl.SegmentImporter
    async fn com_day_cq_analytics_testandtarget_impl_segment_importer(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqAnalyticsTestandtargetImplSegmentImporterQueryParams,
    ) -> Result<ComDayCqAnalyticsTestandtargetImplSegmentImporterResponse, E>;

    /// ComDayCqAnalyticsTestandtargetImplServiceWebServiceImpl - POST /system/console/configMgr/com.day.cq.analytics.testandtarget.impl.service.WebServiceImpl
    async fn com_day_cq_analytics_testandtarget_impl_service_web_service_impl(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplQueryParams,
    ) -> Result<ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplResponse, E>;

    /// ComDayCqAnalyticsTestandtargetImplServletsAdminServerServlet - POST /system/console/configMgr/com.day.cq.analytics.testandtarget.impl.servlets.AdminServerServlet
    async fn com_day_cq_analytics_testandtarget_impl_servlets_admin_server_servlet(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletQueryParams,
    ) -> Result<ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletResponse, E>;

    /// ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImpl - POST /system/console/configMgr/com.day.cq.analytics.testandtarget.impl.TestandtargetHttpClientImpl
    async fn com_day_cq_analytics_testandtarget_impl_testandtarget_http_client_impl(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplQueryParams,
    ) -> Result<ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplResponse, E>;

    /// ComDayCqAuthImplCugCugSupportImpl - POST /system/console/configMgr/com.day.cq.auth.impl.cug.CugSupportImpl
    async fn com_day_cq_auth_impl_cug_cug_support_impl(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqAuthImplCugCugSupportImplQueryParams,
    ) -> Result<ComDayCqAuthImplCugCugSupportImplResponse, E>;

    /// ComDayCqAuthImplLoginSelectorHandler - POST /system/console/configMgr/com.day.cq.auth.impl.LoginSelectorHandler
    async fn com_day_cq_auth_impl_login_selector_handler(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqAuthImplLoginSelectorHandlerQueryParams,
    ) -> Result<ComDayCqAuthImplLoginSelectorHandlerResponse, E>;

    /// ComDayCqCommonsImplExternalizerImpl - POST /system/console/configMgr/com.day.cq.commons.impl.ExternalizerImpl
    async fn com_day_cq_commons_impl_externalizer_impl(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqCommonsImplExternalizerImplQueryParams,
    ) -> Result<ComDayCqCommonsImplExternalizerImplResponse, E>;

    /// ComDayCqCommonsServletsRootMappingServlet - POST /system/console/configMgr/com.day.cq.commons.servlets.RootMappingServlet
    async fn com_day_cq_commons_servlets_root_mapping_servlet(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqCommonsServletsRootMappingServletQueryParams,
    ) -> Result<ComDayCqCommonsServletsRootMappingServletResponse, E>;

    /// ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionChecke - POST /system/console/configMgr/com.day.cq.compat.codeupgrade.impl.CodeUpgradeExecutionConditionChecker
    async fn com_day_cq_compat_codeupgrade_impl_code_upgrade_execution_condition_checke(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeQueryParams,
    ) -> Result<ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeResponse, E>;

    /// ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreList - POST /system/console/configMgr/com.day.cq.compat.codeupgrade.impl.UpgradeTaskIgnoreList
    async fn com_day_cq_compat_codeupgrade_impl_upgrade_task_ignore_list(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListQueryParams,
    ) -> Result<ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListResponse, E>;

    /// ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelist - POST /system/console/configMgr/com.day.cq.compat.codeupgrade.impl.VersionRangeTaskIgnorelist
    async fn com_day_cq_compat_codeupgrade_impl_version_range_task_ignorelist(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistQueryParams,
    ) -> Result<ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistResponse, E>;

    /// ComDayCqContentsyncImplContentSyncManagerImpl - POST /system/console/configMgr/com.day.cq.contentsync.impl.ContentSyncManagerImpl
    async fn com_day_cq_contentsync_impl_content_sync_manager_impl(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqContentsyncImplContentSyncManagerImplQueryParams,
    ) -> Result<ComDayCqContentsyncImplContentSyncManagerImplResponse, E>;

    /// ComDayCqDamCommonsHandlerStandardImageHandler - POST /system/console/configMgr/com.day.cq.dam.commons.handler.StandardImageHandler
    async fn com_day_cq_dam_commons_handler_standard_image_handler(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqDamCommonsHandlerStandardImageHandlerQueryParams,
    ) -> Result<ComDayCqDamCommonsHandlerStandardImageHandlerResponse, E>;

    /// ComDayCqDamCommonsMetadataXmpFilterBlackWhite - POST /system/console/configMgr/com.day.cq.dam.commons.metadata.XmpFilterBlackWhite
    async fn com_day_cq_dam_commons_metadata_xmp_filter_black_white(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqDamCommonsMetadataXmpFilterBlackWhiteQueryParams,
    ) -> Result<ComDayCqDamCommonsMetadataXmpFilterBlackWhiteResponse, E>;

    /// ComDayCqDamCommonsUtilImplAssetCacheImpl - POST /system/console/configMgr/com.day.cq.dam.commons.util.impl.AssetCacheImpl
    async fn com_day_cq_dam_commons_util_impl_asset_cache_impl(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqDamCommonsUtilImplAssetCacheImplQueryParams,
    ) -> Result<ComDayCqDamCommonsUtilImplAssetCacheImplResponse, E>;

    /// ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfig - POST /system/console/configMgr/com.day.cq.dam.core.impl.annotation.pdf.AnnotationPdfConfig
    async fn com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigQueryParams,
    ) -> Result<ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigResponse, E>;

    /// ComDayCqDamCoreImplAssetMoveListener - POST /system/console/configMgr/com.day.cq.dam.core.impl.AssetMoveListener
    async fn com_day_cq_dam_core_impl_asset_move_listener(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqDamCoreImplAssetMoveListenerQueryParams,
    ) -> Result<ComDayCqDamCoreImplAssetMoveListenerResponse, E>;

    /// ComDayCqDamCoreImplAssethomeAssetHomePageConfiguration - POST /system/console/configMgr/com.day.cq.dam.core.impl.assethome.AssetHomePageConfiguration
    async fn com_day_cq_dam_core_impl_assethome_asset_home_page_configuration(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationQueryParams,
    ) -> Result<ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationResponse, E>;

    /// ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServlet - POST /system/console/configMgr/com.day.cq.dam.core.impl.assetlinkshare.AdhocAssetShareProxyServlet
    async fn com_day_cq_dam_core_impl_assetlinkshare_adhoc_asset_share_proxy_servlet(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletQueryParams,
    ) -> Result<ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletResponse, E>;

    /// ComDayCqDamCoreImplCacheCqBufferedImageCache - POST /system/console/configMgr/com.day.cq.dam.core.impl.cache.CQBufferedImageCache
    async fn com_day_cq_dam_core_impl_cache_cq_buffered_image_cache(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqDamCoreImplCacheCqBufferedImageCacheQueryParams,
    ) -> Result<ComDayCqDamCoreImplCacheCqBufferedImageCacheResponse, E>;

    /// ComDayCqDamCoreImplDamChangeEventListener - POST /system/console/configMgr/com.day.cq.dam.core.impl.DamChangeEventListener
    async fn com_day_cq_dam_core_impl_dam_change_event_listener(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqDamCoreImplDamChangeEventListenerQueryParams,
    ) -> Result<ComDayCqDamCoreImplDamChangeEventListenerResponse, E>;

    /// ComDayCqDamCoreImplDamEventPurgeService - POST /system/console/configMgr/com.day.cq.dam.core.impl.DamEventPurgeService
    async fn com_day_cq_dam_core_impl_dam_event_purge_service(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqDamCoreImplDamEventPurgeServiceQueryParams,
    ) -> Result<ComDayCqDamCoreImplDamEventPurgeServiceResponse, E>;

    /// ComDayCqDamCoreImplDamEventRecorderImpl - POST /system/console/configMgr/com.day.cq.dam.core.impl.DamEventRecorderImpl
    async fn com_day_cq_dam_core_impl_dam_event_recorder_impl(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqDamCoreImplDamEventRecorderImplQueryParams,
    ) -> Result<ComDayCqDamCoreImplDamEventRecorderImplResponse, E>;

    /// ComDayCqDamCoreImplEventDamEventAuditListener - POST /system/console/configMgr/com.day.cq.dam.core.impl.event.DamEventAuditListener
    async fn com_day_cq_dam_core_impl_event_dam_event_audit_listener(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqDamCoreImplEventDamEventAuditListenerQueryParams,
    ) -> Result<ComDayCqDamCoreImplEventDamEventAuditListenerResponse, E>;

    /// ComDayCqDamCoreImplExpiryNotificationJobImpl - POST /system/console/configMgr/com.day.cq.dam.core.impl.ExpiryNotificationJobImpl
    async fn com_day_cq_dam_core_impl_expiry_notification_job_impl(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqDamCoreImplExpiryNotificationJobImplQueryParams,
    ) -> Result<ComDayCqDamCoreImplExpiryNotificationJobImplResponse, E>;

    /// ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeat - POST /system/console/configMgr/com.day.cq.dam.core.impl.foldermetadataschema.FolderMetadataSchemaFeatureFlag
    async fn com_day_cq_dam_core_impl_foldermetadataschema_folder_metadata_schema_feat(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatQueryParams,
    ) -> Result<ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatResponse, E>;

    /// ComDayCqDamCoreImplGfxCommonsGfxRenderer - POST /system/console/configMgr/com.day.cq.dam.core.impl.gfx.CommonsGfxRenderer
    async fn com_day_cq_dam_core_impl_gfx_commons_gfx_renderer(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqDamCoreImplGfxCommonsGfxRendererQueryParams,
    ) -> Result<ComDayCqDamCoreImplGfxCommonsGfxRendererResponse, E>;

    /// ComDayCqDamCoreImplHandlerEpsFormatHandler - POST /system/console/configMgr/com.day.cq.dam.core.impl.handler.EPSFormatHandler
    async fn com_day_cq_dam_core_impl_handler_eps_format_handler(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqDamCoreImplHandlerEpsFormatHandlerQueryParams,
    ) -> Result<ComDayCqDamCoreImplHandlerEpsFormatHandlerResponse, E>;

    /// ComDayCqDamCoreImplHandlerIndesignFormatHandler - POST /system/console/configMgr/com.day.cq.dam.core.impl.handler.IndesignFormatHandler
    async fn com_day_cq_dam_core_impl_handler_indesign_format_handler(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqDamCoreImplHandlerIndesignFormatHandlerQueryParams,
    ) -> Result<ComDayCqDamCoreImplHandlerIndesignFormatHandlerResponse, E>;

    /// ComDayCqDamCoreImplHandlerJpegHandler - POST /system/console/configMgr/com.day.cq.dam.core.impl.handler.JpegHandler
    async fn com_day_cq_dam_core_impl_handler_jpeg_handler(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqDamCoreImplHandlerJpegHandlerQueryParams,
    ) -> Result<ComDayCqDamCoreImplHandlerJpegHandlerResponse, E>;

    /// ComDayCqDamCoreImplHandlerXmpNCommXmpHandler - POST /system/console/configMgr/com.day.cq.dam.core.impl.handler.xmp.NCommXMPHandler
    async fn com_day_cq_dam_core_impl_handler_xmp_n_comm_xmp_handler(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqDamCoreImplHandlerXmpNCommXmpHandlerQueryParams,
    ) -> Result<ComDayCqDamCoreImplHandlerXmpNCommXmpHandlerResponse, E>;

    /// ComDayCqDamCoreImplJmxAssetIndexUpdateMonitor - POST /system/console/configMgr/com.day.cq.dam.core.impl.jmx.AssetIndexUpdateMonitor
    async fn com_day_cq_dam_core_impl_jmx_asset_index_update_monitor(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorQueryParams,
    ) -> Result<ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorResponse, E>;

    /// ComDayCqDamCoreImplJmxAssetMigrationMBeanImpl - POST /system/console/configMgr/com.day.cq.dam.core.impl.jmx.AssetMigrationMBeanImpl
    async fn com_day_cq_dam_core_impl_jmx_asset_migration_m_bean_impl(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqDamCoreImplJmxAssetMigrationMBeanImplQueryParams,
    ) -> Result<ComDayCqDamCoreImplJmxAssetMigrationMBeanImplResponse, E>;

    /// ComDayCqDamCoreImplJmxAssetUpdateMonitorImpl - POST /system/console/configMgr/com.day.cq.dam.core.impl.jmx.AssetUpdateMonitorImpl
    async fn com_day_cq_dam_core_impl_jmx_asset_update_monitor_impl(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqDamCoreImplJmxAssetUpdateMonitorImplQueryParams,
    ) -> Result<ComDayCqDamCoreImplJmxAssetUpdateMonitorImplResponse, E>;

    /// ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfig - POST /system/console/configMgr/com.day.cq.dam.core.impl.jobs.metadataexport.AsyncMetadataExportConfigProviderService
    async fn com_day_cq_dam_core_impl_jobs_metadataexport_async_metadata_export_config(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigQueryParams,
    ) -> Result<ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigResponse, E>;

    /// ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfig - POST /system/console/configMgr/com.day.cq.dam.core.impl.jobs.metadataimport.AsyncMetadataImportConfigProviderService
    async fn com_day_cq_dam_core_impl_jobs_metadataimport_async_metadata_import_config(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigQueryParams,
    ) -> Result<ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigResponse, E>;

    /// ComDayCqDamCoreImplLightboxLightboxServlet - POST /system/console/configMgr/com.day.cq.dam.core.impl.lightbox.LightboxServlet
    async fn com_day_cq_dam_core_impl_lightbox_lightbox_servlet(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqDamCoreImplLightboxLightboxServletQueryParams,
    ) -> Result<ComDayCqDamCoreImplLightboxLightboxServletResponse, E>;

    /// ComDayCqDamCoreImplMetadataEditorSelectComponentHandler - POST /system/console/configMgr/com.day.cq.dam.core.impl.metadata.editor.SelectComponentHandler
    async fn com_day_cq_dam_core_impl_metadata_editor_select_component_handler(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerQueryParams,
    ) -> Result<ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerResponse, E>;

    /// ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelper - POST /system/console/configMgr/com.day.cq.dam.core.impl.mimeType.AssetUploadRestrictionHelper
    async fn com_day_cq_dam_core_impl_mime_type_asset_upload_restriction_helper(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperQueryParams,
    ) -> Result<ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperResponse, E>;

    /// ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImpl - POST /system/console/configMgr/com.day.cq.dam.core.impl.mimeType.DamMimeTypeServiceImpl
    async fn com_day_cq_dam_core_impl_mime_type_dam_mime_type_service_impl(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplQueryParams,
    ) -> Result<ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplResponse, E>;

    /// ComDayCqDamCoreImplMissingMetadataNotificationJob - POST /system/console/configMgr/com.day.cq.dam.core.impl.MissingMetadataNotificationJob
    async fn com_day_cq_dam_core_impl_missing_metadata_notification_job(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqDamCoreImplMissingMetadataNotificationJobQueryParams,
    ) -> Result<ComDayCqDamCoreImplMissingMetadataNotificationJobResponse, E>;

    /// ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPr - POST /system/console/configMgr/com.day.cq.dam.core.impl.process.SendTransientWorkflowCompletedEmailProcess
    async fn com_day_cq_dam_core_impl_process_send_transient_workflow_completed_email_pr(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrQueryParams,
    ) -> Result<ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrResponse, E>;

    /// ComDayCqDamCoreImplProcessTextExtractionProcess - POST /system/console/configMgr/com.day.cq.dam.core.impl.process.TextExtractionProcess
    async fn com_day_cq_dam_core_impl_process_text_extraction_process(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqDamCoreImplProcessTextExtractionProcessQueryParams,
    ) -> Result<ComDayCqDamCoreImplProcessTextExtractionProcessResponse, E>;

    /// ComDayCqDamCoreImplRenditionMakerImpl - POST /system/console/configMgr/com.day.cq.dam.core.impl.RenditionMakerImpl
    async fn com_day_cq_dam_core_impl_rendition_maker_impl(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqDamCoreImplRenditionMakerImplQueryParams,
    ) -> Result<ComDayCqDamCoreImplRenditionMakerImplResponse, E>;

    /// ComDayCqDamCoreImplReportsReportExportService - POST /system/console/configMgr/com.day.cq.dam.core.impl.reports.ReportExportService
    async fn com_day_cq_dam_core_impl_reports_report_export_service(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqDamCoreImplReportsReportExportServiceQueryParams,
    ) -> Result<ComDayCqDamCoreImplReportsReportExportServiceResponse, E>;

    /// ComDayCqDamCoreImplReportsReportPurgeService - POST /system/console/configMgr/com.day.cq.dam.core.impl.reports.ReportPurgeService
    async fn com_day_cq_dam_core_impl_reports_report_purge_service(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqDamCoreImplReportsReportPurgeServiceQueryParams,
    ) -> Result<ComDayCqDamCoreImplReportsReportPurgeServiceResponse, E>;

    /// ComDayCqDamCoreImplServletAssetDownloadServlet - POST /system/console/configMgr/com.day.cq.dam.core.impl.servlet.AssetDownloadServlet
    async fn com_day_cq_dam_core_impl_servlet_asset_download_servlet(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqDamCoreImplServletAssetDownloadServletQueryParams,
    ) -> Result<ComDayCqDamCoreImplServletAssetDownloadServletResponse, E>;

    /// ComDayCqDamCoreImplServletAssetStatusServlet - POST /system/console/configMgr/com.day.cq.dam.core.impl.servlet.AssetStatusServlet
    async fn com_day_cq_dam_core_impl_servlet_asset_status_servlet(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqDamCoreImplServletAssetStatusServletQueryParams,
    ) -> Result<ComDayCqDamCoreImplServletAssetStatusServletResponse, E>;

    /// ComDayCqDamCoreImplServletAssetXmpSearchServlet - POST /system/console/configMgr/com.day.cq.dam.core.impl.servlet.AssetXMPSearchServlet
    async fn com_day_cq_dam_core_impl_servlet_asset_xmp_search_servlet(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqDamCoreImplServletAssetXmpSearchServletQueryParams,
    ) -> Result<ComDayCqDamCoreImplServletAssetXmpSearchServletResponse, E>;

    /// ComDayCqDamCoreImplServletBatchMetadataServlet - POST /system/console/configMgr/com.day.cq.dam.core.impl.servlet.BatchMetadataServlet
    async fn com_day_cq_dam_core_impl_servlet_batch_metadata_servlet(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqDamCoreImplServletBatchMetadataServletQueryParams,
    ) -> Result<ComDayCqDamCoreImplServletBatchMetadataServletResponse, E>;

    /// ComDayCqDamCoreImplServletBinaryProviderServlet - POST /system/console/configMgr/com.day.cq.dam.core.impl.servlet.BinaryProviderServlet
    async fn com_day_cq_dam_core_impl_servlet_binary_provider_servlet(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqDamCoreImplServletBinaryProviderServletQueryParams,
    ) -> Result<ComDayCqDamCoreImplServletBinaryProviderServletResponse, E>;

    /// ComDayCqDamCoreImplServletCollectionServlet - POST /system/console/configMgr/com.day.cq.dam.core.impl.servlet.CollectionServlet
    async fn com_day_cq_dam_core_impl_servlet_collection_servlet(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqDamCoreImplServletCollectionServletQueryParams,
    ) -> Result<ComDayCqDamCoreImplServletCollectionServletResponse, E>;

    /// ComDayCqDamCoreImplServletCollectionsServlet - POST /system/console/configMgr/com.day.cq.dam.core.impl.servlet.CollectionsServlet
    async fn com_day_cq_dam_core_impl_servlet_collections_servlet(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqDamCoreImplServletCollectionsServletQueryParams,
    ) -> Result<ComDayCqDamCoreImplServletCollectionsServletResponse, E>;

    /// ComDayCqDamCoreImplServletCompanionServlet - POST /system/console/configMgr/com.day.cq.dam.core.impl.servlet.CompanionServlet
    async fn com_day_cq_dam_core_impl_servlet_companion_servlet(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqDamCoreImplServletCompanionServletQueryParams,
    ) -> Result<ComDayCqDamCoreImplServletCompanionServletResponse, E>;

    /// ComDayCqDamCoreImplServletCreateAssetServlet - POST /system/console/configMgr/com.day.cq.dam.core.impl.servlet.CreateAssetServlet
    async fn com_day_cq_dam_core_impl_servlet_create_asset_servlet(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqDamCoreImplServletCreateAssetServletQueryParams,
    ) -> Result<ComDayCqDamCoreImplServletCreateAssetServletResponse, E>;

    /// ComDayCqDamCoreImplServletDamContentDispositionFilter - POST /system/console/configMgr/com.day.cq.dam.core.impl.servlet.DamContentDispositionFilter
    async fn com_day_cq_dam_core_impl_servlet_dam_content_disposition_filter(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqDamCoreImplServletDamContentDispositionFilterQueryParams,
    ) -> Result<ComDayCqDamCoreImplServletDamContentDispositionFilterResponse, E>;

    /// ComDayCqDamCoreImplServletGuidLookupFilter - POST /system/console/configMgr/com.day.cq.dam.core.impl.servlet.GuidLookupFilter
    async fn com_day_cq_dam_core_impl_servlet_guid_lookup_filter(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqDamCoreImplServletGuidLookupFilterQueryParams,
    ) -> Result<ComDayCqDamCoreImplServletGuidLookupFilterResponse, E>;

    /// ComDayCqDamCoreImplServletHealthCheckServlet - POST /system/console/configMgr/com.day.cq.dam.core.impl.servlet.HealthCheckServlet
    async fn com_day_cq_dam_core_impl_servlet_health_check_servlet(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqDamCoreImplServletHealthCheckServletQueryParams,
    ) -> Result<ComDayCqDamCoreImplServletHealthCheckServletResponse, E>;

    /// ComDayCqDamCoreImplServletMetadataGetServlet - POST /system/console/configMgr/com.day.cq.dam.core.impl.servlet.MetadataGetServlet
    async fn com_day_cq_dam_core_impl_servlet_metadata_get_servlet(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqDamCoreImplServletMetadataGetServletQueryParams,
    ) -> Result<ComDayCqDamCoreImplServletMetadataGetServletResponse, E>;

    /// ComDayCqDamCoreImplServletMultipleLicenseAcceptServlet - POST /system/console/configMgr/com.day.cq.dam.core.impl.servlet.MultipleLicenseAcceptServlet
    async fn com_day_cq_dam_core_impl_servlet_multiple_license_accept_servlet(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqDamCoreImplServletMultipleLicenseAcceptServletQueryParams,
    ) -> Result<ComDayCqDamCoreImplServletMultipleLicenseAcceptServletResponse, E>;

    /// ComDayCqDamCoreImplServletResourceCollectionServlet - POST /system/console/configMgr/com.day.cq.dam.core.impl.servlet.ResourceCollectionServlet
    async fn com_day_cq_dam_core_impl_servlet_resource_collection_servlet(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqDamCoreImplServletResourceCollectionServletQueryParams,
    ) -> Result<ComDayCqDamCoreImplServletResourceCollectionServletResponse, E>;

    /// ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImpl - POST /system/console/configMgr/com.day.cq.dam.core.impl.ui.preview.FolderPreviewUpdaterImpl
    async fn com_day_cq_dam_core_impl_ui_preview_folder_preview_updater_impl(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplQueryParams,
    ) -> Result<ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplResponse, E>;

    /// ComDayCqDamCoreImplUnzipUnzipConfig - POST /system/console/configMgr/com.day.cq.dam.core.impl.unzip.UnzipConfig
    async fn com_day_cq_dam_core_impl_unzip_unzip_config(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqDamCoreImplUnzipUnzipConfigQueryParams,
    ) -> Result<ComDayCqDamCoreImplUnzipUnzipConfigResponse, E>;

    /// ComDayCqDamCoreProcessExifToolExtractMetadataProcess - POST /system/console/configMgr/com.day.cq.dam.core.process.ExifToolExtractMetadataProcess
    async fn com_day_cq_dam_core_process_exif_tool_extract_metadata_process(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqDamCoreProcessExifToolExtractMetadataProcessQueryParams,
    ) -> Result<ComDayCqDamCoreProcessExifToolExtractMetadataProcessResponse, E>;

    /// ComDayCqDamCoreProcessExtractMetadataProcess - POST /system/console/configMgr/com.day.cq.dam.core.process.ExtractMetadataProcess
    async fn com_day_cq_dam_core_process_extract_metadata_process(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqDamCoreProcessExtractMetadataProcessQueryParams,
    ) -> Result<ComDayCqDamCoreProcessExtractMetadataProcessResponse, E>;

    /// ComDayCqDamCoreProcessMetadataProcessorProcess - POST /system/console/configMgr/com.day.cq.dam.core.process.MetadataProcessorProcess
    async fn com_day_cq_dam_core_process_metadata_processor_process(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqDamCoreProcessMetadataProcessorProcessQueryParams,
    ) -> Result<ComDayCqDamCoreProcessMetadataProcessorProcessResponse, E>;

    /// ComDayCqDamHandlerFfmpegLocatorImpl - POST /system/console/configMgr/com.day.cq.dam.handler.ffmpeg.LocatorImpl
    async fn com_day_cq_dam_handler_ffmpeg_locator_impl(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqDamHandlerFfmpegLocatorImplQueryParams,
    ) -> Result<ComDayCqDamHandlerFfmpegLocatorImplResponse, E>;

    /// ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImpl - POST /system/console/configMgr/com.day.cq.dam.handler.gibson.fontmanager.impl.FontManagerServiceImpl
    async fn com_day_cq_dam_handler_gibson_fontmanager_impl_font_manager_service_impl(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplQueryParams,
    ) -> Result<ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplResponse, E>;

    /// ComDayCqDamHandlerStandardPdfPdfHandler - POST /system/console/configMgr/com.day.cq.dam.handler.standard.pdf.PdfHandler
    async fn com_day_cq_dam_handler_standard_pdf_pdf_handler(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqDamHandlerStandardPdfPdfHandlerQueryParams,
    ) -> Result<ComDayCqDamHandlerStandardPdfPdfHandlerResponse, E>;

    /// ComDayCqDamHandlerStandardPsPostScriptHandler - POST /system/console/configMgr/com.day.cq.dam.handler.standard.ps.PostScriptHandler
    async fn com_day_cq_dam_handler_standard_ps_post_script_handler(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqDamHandlerStandardPsPostScriptHandlerQueryParams,
    ) -> Result<ComDayCqDamHandlerStandardPsPostScriptHandlerResponse, E>;

    /// ComDayCqDamHandlerStandardPsdPsdHandler - POST /system/console/configMgr/com.day.cq.dam.handler.standard.psd.PsdHandler
    async fn com_day_cq_dam_handler_standard_psd_psd_handler(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqDamHandlerStandardPsdPsdHandlerQueryParams,
    ) -> Result<ComDayCqDamHandlerStandardPsdPsdHandlerResponse, E>;

    /// ComDayCqDamIdsImplIdsJobProcessor - POST /system/console/configMgr/com.day.cq.dam.ids.impl.IDSJobProcessor
    async fn com_day_cq_dam_ids_impl_ids_job_processor(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqDamIdsImplIdsJobProcessorQueryParams,
    ) -> Result<ComDayCqDamIdsImplIdsJobProcessorResponse, E>;

    /// ComDayCqDamIdsImplIdsPoolManagerImpl - POST /system/console/configMgr/com.day.cq.dam.ids.impl.IDSPoolManagerImpl
    async fn com_day_cq_dam_ids_impl_ids_pool_manager_impl(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqDamIdsImplIdsPoolManagerImplQueryParams,
    ) -> Result<ComDayCqDamIdsImplIdsPoolManagerImplResponse, E>;

    /// ComDayCqDamInddImplHandlerIndesignXmpHandler - POST /system/console/configMgr/com.day.cq.dam.indd.impl.handler.IndesignXMPHandler
    async fn com_day_cq_dam_indd_impl_handler_indesign_xmp_handler(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqDamInddImplHandlerIndesignXmpHandlerQueryParams,
    ) -> Result<ComDayCqDamInddImplHandlerIndesignXmpHandlerResponse, E>;

    /// ComDayCqDamInddImplServletSnippetCreationServlet - POST /system/console/configMgr/com.day.cq.dam.indd.impl.servlet.SnippetCreationServlet
    async fn com_day_cq_dam_indd_impl_servlet_snippet_creation_servlet(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqDamInddImplServletSnippetCreationServletQueryParams,
    ) -> Result<ComDayCqDamInddImplServletSnippetCreationServletResponse, E>;

    /// ComDayCqDamInddProcessInddMediaExtractProcess - POST /system/console/configMgr/com.day.cq.dam.indd.process.INDDMediaExtractProcess
    async fn com_day_cq_dam_indd_process_indd_media_extract_process(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqDamInddProcessInddMediaExtractProcessQueryParams,
    ) -> Result<ComDayCqDamInddProcessInddMediaExtractProcessResponse, E>;

    /// ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImpl - POST /system/console/configMgr/com.day.cq.dam.performance.internal.AssetPerformanceDataHandlerImpl
    async fn com_day_cq_dam_performance_internal_asset_performance_data_handler_impl(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplQueryParams,
    ) -> Result<ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplResponse, E>;

    /// ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJob - POST /system/console/configMgr/com.day.cq.dam.performance.internal.AssetPerformanceReportSyncJob
    async fn com_day_cq_dam_performance_internal_asset_performance_report_sync_job(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobQueryParams,
    ) -> Result<ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobResponse, E>;

    /// ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadPro - POST /system/console/configMgr/com.day.cq.dam.pim.impl.sourcing.upload.process.ProductAssetsUploadProcess
    async fn com_day_cq_dam_pim_impl_sourcing_upload_process_product_assets_upload_pro(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProQueryParams,
    ) -> Result<ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProResponse, E>;

    /// ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEven - POST /system/console/configMgr/com.day.cq.dam.s7dam.common.analytics.impl.S7damDynamicMediaConfigEventListener
    async fn com_day_cq_dam_s7dam_common_analytics_impl_s7dam_dynamic_media_config_even(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenQueryParams,
    ) -> Result<ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenResponse, E>;

    /// ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunner - POST /system/console/configMgr/com.day.cq.dam.s7dam.common.analytics.impl.SiteCatalystReportRunner
    async fn com_day_cq_dam_s7dam_common_analytics_impl_site_catalyst_report_runner(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerQueryParams,
    ) -> Result<ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerResponse, E>;

    /// ComDayCqDamS7damCommonPostServletsSetCreateHandler - POST /system/console/configMgr/com.day.cq.dam.s7dam.common.post.servlets.SetCreateHandler
    async fn com_day_cq_dam_s7dam_common_post_servlets_set_create_handler(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqDamS7damCommonPostServletsSetCreateHandlerQueryParams,
    ) -> Result<ComDayCqDamS7damCommonPostServletsSetCreateHandlerResponse, E>;

    /// ComDayCqDamS7damCommonPostServletsSetModifyHandler - POST /system/console/configMgr/com.day.cq.dam.s7dam.common.post.servlets.SetModifyHandler
    async fn com_day_cq_dam_s7dam_common_post_servlets_set_modify_handler(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqDamS7damCommonPostServletsSetModifyHandlerQueryParams,
    ) -> Result<ComDayCqDamS7damCommonPostServletsSetModifyHandlerResponse, E>;

    /// ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcess - POST /system/console/configMgr/com.day.cq.dam.s7dam.common.process.VideoThumbnailDownloadProcess
    async fn com_day_cq_dam_s7dam_common_process_video_thumbnail_download_process(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessQueryParams,
    ) -> Result<ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessResponse, E>;

    /// ComDayCqDamS7damCommonS7damDamChangeEventListener - POST /system/console/configMgr/com.day.cq.dam.s7dam.common.S7damDamChangeEventListener
    async fn com_day_cq_dam_s7dam_common_s7dam_dam_change_event_listener(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqDamS7damCommonS7damDamChangeEventListenerQueryParams,
    ) -> Result<ComDayCqDamS7damCommonS7damDamChangeEventListenerResponse, E>;

    /// ComDayCqDamS7damCommonServletsS7damProductInfoServlet - POST /system/console/configMgr/com.day.cq.dam.s7dam.common.servlets.S7damProductInfoServlet
    async fn com_day_cq_dam_s7dam_common_servlets_s7dam_product_info_servlet(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqDamS7damCommonServletsS7damProductInfoServletQueryParams,
    ) -> Result<ComDayCqDamS7damCommonServletsS7damProductInfoServletResponse, E>;

    /// ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImpl - POST /system/console/configMgr/com.day.cq.dam.s7dam.common.video.impl.VideoProxyClientServiceImpl
    async fn com_day_cq_dam_s7dam_common_video_impl_video_proxy_client_service_impl(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplQueryParams,
    ) -> Result<ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplResponse, E>;

    /// ComDayCqDamScene7ImplScene7ApiClientImpl - POST /system/console/configMgr/com.day.cq.dam.scene7.impl.Scene7APIClientImpl
    async fn com_day_cq_dam_scene7_impl_scene7_api_client_impl(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqDamScene7ImplScene7ApiClientImplQueryParams,
    ) -> Result<ComDayCqDamScene7ImplScene7ApiClientImplResponse, E>;

    /// ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImpl - POST /system/console/configMgr/com.day.cq.dam.scene7.impl.Scene7AssetMimeTypeServiceImpl
    async fn com_day_cq_dam_scene7_impl_scene7_asset_mime_type_service_impl(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplQueryParams,
    ) -> Result<ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplResponse, E>;

    /// ComDayCqDamScene7ImplScene7ConfigurationEventListener - POST /system/console/configMgr/com.day.cq.dam.scene7.impl.Scene7ConfigurationEventListener
    async fn com_day_cq_dam_scene7_impl_scene7_configuration_event_listener(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqDamScene7ImplScene7ConfigurationEventListenerQueryParams,
    ) -> Result<ComDayCqDamScene7ImplScene7ConfigurationEventListenerResponse, E>;

    /// ComDayCqDamScene7ImplScene7DamChangeEventListener - POST /system/console/configMgr/com.day.cq.dam.scene7.impl.Scene7DamChangeEventListener
    async fn com_day_cq_dam_scene7_impl_scene7_dam_change_event_listener(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqDamScene7ImplScene7DamChangeEventListenerQueryParams,
    ) -> Result<ComDayCqDamScene7ImplScene7DamChangeEventListenerResponse, E>;

    /// ComDayCqDamScene7ImplScene7FlashTemplatesServiceImpl - POST /system/console/configMgr/com.day.cq.dam.scene7.impl.Scene7FlashTemplatesServiceImpl
    async fn com_day_cq_dam_scene7_impl_scene7_flash_templates_service_impl(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplQueryParams,
    ) -> Result<ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplResponse, E>;

    /// ComDayCqDamScene7ImplScene7UploadServiceImpl - POST /system/console/configMgr/com.day.cq.dam.scene7.impl.Scene7UploadServiceImpl
    async fn com_day_cq_dam_scene7_impl_scene7_upload_service_impl(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqDamScene7ImplScene7UploadServiceImplQueryParams,
    ) -> Result<ComDayCqDamScene7ImplScene7UploadServiceImplResponse, E>;

    /// ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSer - POST /system/console/configMgr/com.day.cq.dam.stock.integration.impl.cache.StockCacheConfigurationServiceImpl
    async fn com_day_cq_dam_stock_integration_impl_cache_stock_cache_configuration_ser(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerQueryParams,
    ) -> Result<ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerResponse, E>;

    /// ComDayCqDamStockIntegrationImplConfigurationStockConfiguration - POST /system/console/configMgr/com.day.cq.dam.stock.integration.impl.configuration.StockConfigurationImpl
    async fn com_day_cq_dam_stock_integration_impl_configuration_stock_configuration(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqDamStockIntegrationImplConfigurationStockConfigurationQueryParams,
    ) -> Result<ComDayCqDamStockIntegrationImplConfigurationStockConfigurationResponse, E>;

    /// ComDayCqDamVideoImplServletVideoTestServlet - POST /system/console/configMgr/com.day.cq.dam.video.impl.servlet.VideoTestServlet
    async fn com_day_cq_dam_video_impl_servlet_video_test_servlet(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqDamVideoImplServletVideoTestServletQueryParams,
    ) -> Result<ComDayCqDamVideoImplServletVideoTestServletResponse, E>;

    /// ComDayCqExtwidgetServletsImageSpriteServlet - POST /system/console/configMgr/com.day.cq.extwidget.servlets.ImageSpriteServlet
    async fn com_day_cq_extwidget_servlets_image_sprite_servlet(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqExtwidgetServletsImageSpriteServletQueryParams,
    ) -> Result<ComDayCqExtwidgetServletsImageSpriteServletResponse, E>;

    /// ComDayCqImageInternalFontFontHelper - POST /system/console/configMgr/com.day.cq.image.internal.font.FontHelper
    async fn com_day_cq_image_internal_font_font_helper(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqImageInternalFontFontHelperQueryParams,
    ) -> Result<ComDayCqImageInternalFontFontHelperResponse, E>;

    /// ComDayCqJcrclustersupportClusterStartLevelController - POST /system/console/configMgr/com.day.cq.jcrclustersupport.ClusterStartLevelController
    async fn com_day_cq_jcrclustersupport_cluster_start_level_controller(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqJcrclustersupportClusterStartLevelControllerQueryParams,
    ) -> Result<ComDayCqJcrclustersupportClusterStartLevelControllerResponse, E>;

    /// ComDayCqMailerDefaultMailService - POST /system/console/configMgr/com.day.cq.mailer.DefaultMailService
    async fn com_day_cq_mailer_default_mail_service(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqMailerDefaultMailServiceQueryParams,
    ) -> Result<ComDayCqMailerDefaultMailServiceResponse, E>;

    /// ComDayCqMailerImplCqMailingService - POST /system/console/configMgr/com.day.cq.mailer.impl.CqMailingService
    async fn com_day_cq_mailer_impl_cq_mailing_service(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqMailerImplCqMailingServiceQueryParams,
    ) -> Result<ComDayCqMailerImplCqMailingServiceResponse, E>;

    /// ComDayCqMailerImplEmailCqEmailTemplateFactory - POST /system/console/configMgr/com.day.cq.mailer.impl.email.CqEmailTemplateFactory
    async fn com_day_cq_mailer_impl_email_cq_email_template_factory(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqMailerImplEmailCqEmailTemplateFactoryQueryParams,
    ) -> Result<ComDayCqMailerImplEmailCqEmailTemplateFactoryResponse, E>;

    /// ComDayCqMailerImplEmailCqRetrieverTemplateFactory - POST /system/console/configMgr/com.day.cq.mailer.impl.email.CqRetrieverTemplateFactory
    async fn com_day_cq_mailer_impl_email_cq_retriever_template_factory(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqMailerImplEmailCqRetrieverTemplateFactoryQueryParams,
    ) -> Result<ComDayCqMailerImplEmailCqRetrieverTemplateFactoryResponse, E>;

    /// ComDayCqMcmCampaignImplIntegrationConfigImpl - POST /system/console/configMgr/com.day.cq.mcm.campaign.impl.IntegrationConfigImpl
    async fn com_day_cq_mcm_campaign_impl_integration_config_impl(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqMcmCampaignImplIntegrationConfigImplQueryParams,
    ) -> Result<ComDayCqMcmCampaignImplIntegrationConfigImplResponse, E>;

    /// ComDayCqMcmCampaignImporterPersonalizedTextHandlerFactory - POST /system/console/configMgr/com.day.cq.mcm.campaign.importer.PersonalizedTextHandlerFactory
    async fn com_day_cq_mcm_campaign_importer_personalized_text_handler_factory(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryQueryParams,
    ) -> Result<ComDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryResponse, E>;

    /// ComDayCqMcmCoreNewsletterNewsletterEmailServiceImpl - POST /system/console/configMgr/com.day.cq.mcm.core.newsletter.NewsletterEmailServiceImpl
    async fn com_day_cq_mcm_core_newsletter_newsletter_email_service_impl(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplQueryParams,
    ) -> Result<ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplResponse, E>;

    /// ComDayCqMcmImplMcmConfiguration - POST /system/console/configMgr/com.day.cq.mcm.impl.MCMConfiguration
    async fn com_day_cq_mcm_impl_mcm_configuration(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqMcmImplMcmConfigurationQueryParams,
    ) -> Result<ComDayCqMcmImplMcmConfigurationResponse, E>;

    /// ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponen - POST /system/console/configMgr/com.day.cq.mcm.landingpage.parser.taghandlers.cta.ClickThroughComponentTagHandlerFactory
    async fn com_day_cq_mcm_landingpage_parser_taghandlers_cta_click_through_componen(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenQueryParams,
    ) -> Result<ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenResponse, E>;

    /// ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThroug - POST /system/console/configMgr/com.day.cq.mcm.landingpage.parser.taghandlers.cta.GraphicalClickThroughComponentTagHandlerFactory
    async fn com_day_cq_mcm_landingpage_parser_taghandlers_cta_graphical_click_throug(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougQueryParams,
    ) -> Result<ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougResponse, E>;

    /// ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCtaComponent - POST /system/console/configMgr/com.day.cq.mcm.landingpage.parser.taghandlers.cta.LeadFormCTAComponentTagHandlerFactory
    async fn com_day_cq_mcm_landingpage_parser_taghandlers_cta_lead_form_cta_component(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCtaComponentQueryParams,
    ) -> Result<ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCtaComponentResponse, E>;

    /// ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHa - POST /system/console/configMgr/com.day.cq.mcm.landingpage.parser.taghandlers.mbox.MBoxExperienceTagHandlerFactory
    async fn com_day_cq_mcm_landingpage_parser_taghandlers_mbox_m_box_experience_tag_ha(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaQueryParams,
    ) -> Result<ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaResponse, E>;

    /// ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagH - POST /system/console/configMgr/com.day.cq.mcm.landingpage.parser.taghandlers.mbox.TargetComponentTagHandlerFactory
    async fn com_day_cq_mcm_landingpage_parser_taghandlers_mbox_target_component_tag_h(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHQueryParams,
    ) -> Result<ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHResponse, E>;

    /// ComDayCqNotificationImplNotificationServiceImpl - POST /system/console/configMgr/com.day.cq.notification.impl.NotificationServiceImpl
    async fn com_day_cq_notification_impl_notification_service_impl(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqNotificationImplNotificationServiceImplQueryParams,
    ) -> Result<ComDayCqNotificationImplNotificationServiceImplResponse, E>;

    /// ComDayCqPersonalizationImplServletsTargetingConfigurationServlet - POST /system/console/configMgr/com.day.cq.personalization.impl.servlets.TargetingConfigurationServlet
    async fn com_day_cq_personalization_impl_servlets_targeting_configuration_servlet(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqPersonalizationImplServletsTargetingConfigurationServletQueryParams,
    ) -> Result<ComDayCqPersonalizationImplServletsTargetingConfigurationServletResponse, E>;

    /// ComDayCqPollingImporterImplManagedPollConfigImpl - POST /system/console/configMgr/com.day.cq.polling.importer.impl.ManagedPollConfigImpl
    async fn com_day_cq_polling_importer_impl_managed_poll_config_impl(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqPollingImporterImplManagedPollConfigImplQueryParams,
    ) -> Result<ComDayCqPollingImporterImplManagedPollConfigImplResponse, E>;

    /// ComDayCqPollingImporterImplManagedPollingImporterImpl - POST /system/console/configMgr/com.day.cq.polling.importer.impl.ManagedPollingImporterImpl
    async fn com_day_cq_polling_importer_impl_managed_polling_importer_impl(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqPollingImporterImplManagedPollingImporterImplQueryParams,
    ) -> Result<ComDayCqPollingImporterImplManagedPollingImporterImplResponse, E>;

    /// ComDayCqPollingImporterImplPollingImporterImpl - POST /system/console/configMgr/com.day.cq.polling.importer.impl.PollingImporterImpl
    async fn com_day_cq_polling_importer_impl_polling_importer_impl(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqPollingImporterImplPollingImporterImplQueryParams,
    ) -> Result<ComDayCqPollingImporterImplPollingImporterImplResponse, E>;

    /// ComDayCqReplicationAuditReplicationEventListener - POST /system/console/configMgr/com.day.cq.replication.audit.ReplicationEventListener
    async fn com_day_cq_replication_audit_replication_event_listener(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqReplicationAuditReplicationEventListenerQueryParams,
    ) -> Result<ComDayCqReplicationAuditReplicationEventListenerResponse, E>;

    /// ComDayCqReplicationContentStaticContentBuilder - POST /system/console/configMgr/com.day.cq.replication.content.StaticContentBuilder
    async fn com_day_cq_replication_content_static_content_builder(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqReplicationContentStaticContentBuilderQueryParams,
    ) -> Result<ComDayCqReplicationContentStaticContentBuilderResponse, E>;

    /// ComDayCqReplicationImplAgentManagerImpl - POST /system/console/configMgr/com.day.cq.replication.impl.AgentManagerImpl
    async fn com_day_cq_replication_impl_agent_manager_impl(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqReplicationImplAgentManagerImplQueryParams,
    ) -> Result<ComDayCqReplicationImplAgentManagerImplResponse, E>;

    /// ComDayCqReplicationImplContentDurboBinaryLessContentBuilder - POST /system/console/configMgr/com.day.cq.replication.impl.content.durbo.BinaryLessContentBuilder
    async fn com_day_cq_replication_impl_content_durbo_binary_less_content_builder(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqReplicationImplContentDurboBinaryLessContentBuilderQueryParams,
    ) -> Result<ComDayCqReplicationImplContentDurboBinaryLessContentBuilderResponse, E>;

    /// ComDayCqReplicationImplContentDurboDurboImportConfigurationProv - POST /system/console/configMgr/com.day.cq.replication.impl.content.durbo.DurboImportConfigurationProviderService
    async fn com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqReplicationImplContentDurboDurboImportConfigurationProvQueryParams,
    ) -> Result<ComDayCqReplicationImplContentDurboDurboImportConfigurationProvResponse, E>;

    /// ComDayCqReplicationImplReplicationContentFactoryProviderImpl - POST /system/console/configMgr/com.day.cq.replication.impl.ReplicationContentFactoryProviderImpl
    async fn com_day_cq_replication_impl_replication_content_factory_provider_impl(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqReplicationImplReplicationContentFactoryProviderImplQueryParams,
    ) -> Result<ComDayCqReplicationImplReplicationContentFactoryProviderImplResponse, E>;

    /// ComDayCqReplicationImplReplicationReceiverImpl - POST /system/console/configMgr/com.day.cq.replication.impl.ReplicationReceiverImpl
    async fn com_day_cq_replication_impl_replication_receiver_impl(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqReplicationImplReplicationReceiverImplQueryParams,
    ) -> Result<ComDayCqReplicationImplReplicationReceiverImplResponse, E>;

    /// ComDayCqReplicationImplReplicatorImpl - POST /system/console/configMgr/com.day.cq.replication.impl.ReplicatorImpl
    async fn com_day_cq_replication_impl_replicator_impl(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqReplicationImplReplicatorImplQueryParams,
    ) -> Result<ComDayCqReplicationImplReplicatorImplResponse, E>;

    /// ComDayCqReplicationImplReverseReplicator - POST /system/console/configMgr/com.day.cq.replication.impl.ReverseReplicator
    async fn com_day_cq_replication_impl_reverse_replicator(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqReplicationImplReverseReplicatorQueryParams,
    ) -> Result<ComDayCqReplicationImplReverseReplicatorResponse, E>;

    /// ComDayCqReplicationImplTransportBinaryLessTransportHandler - POST /system/console/configMgr/com.day.cq.replication.impl.transport.BinaryLessTransportHandler
    async fn com_day_cq_replication_impl_transport_binary_less_transport_handler(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqReplicationImplTransportBinaryLessTransportHandlerQueryParams,
    ) -> Result<ComDayCqReplicationImplTransportBinaryLessTransportHandlerResponse, E>;

    /// ComDayCqReplicationImplTransportHttp - POST /system/console/configMgr/com.day.cq.replication.impl.transport.Http
    async fn com_day_cq_replication_impl_transport_http(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqReplicationImplTransportHttpQueryParams,
    ) -> Result<ComDayCqReplicationImplTransportHttpResponse, E>;

    /// ComDayCqReportingImplCacheCacheImpl - POST /system/console/configMgr/com.day.cq.reporting.impl.cache.CacheImpl
    async fn com_day_cq_reporting_impl_cache_cache_impl(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqReportingImplCacheCacheImplQueryParams,
    ) -> Result<ComDayCqReportingImplCacheCacheImplResponse, E>;

    /// ComDayCqReportingImplConfigServiceImpl - POST /system/console/configMgr/com.day.cq.reporting.impl.ConfigServiceImpl
    async fn com_day_cq_reporting_impl_config_service_impl(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqReportingImplConfigServiceImplQueryParams,
    ) -> Result<ComDayCqReportingImplConfigServiceImplResponse, E>;

    /// ComDayCqReportingImplRLogAnalyzer - POST /system/console/configMgr/com.day.cq.reporting.impl.RLogAnalyzer
    async fn com_day_cq_reporting_impl_r_log_analyzer(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqReportingImplRLogAnalyzerQueryParams,
    ) -> Result<ComDayCqReportingImplRLogAnalyzerResponse, E>;

    /// ComDayCqRewriterLinkcheckerImplLinkCheckerImpl - POST /system/console/configMgr/com.day.cq.rewriter.linkchecker.impl.LinkCheckerImpl
    async fn com_day_cq_rewriter_linkchecker_impl_link_checker_impl(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqRewriterLinkcheckerImplLinkCheckerImplQueryParams,
    ) -> Result<ComDayCqRewriterLinkcheckerImplLinkCheckerImplResponse, E>;

    /// ComDayCqRewriterLinkcheckerImplLinkCheckerTask - POST /system/console/configMgr/com.day.cq.rewriter.linkchecker.impl.LinkCheckerTask
    async fn com_day_cq_rewriter_linkchecker_impl_link_checker_task(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqRewriterLinkcheckerImplLinkCheckerTaskQueryParams,
    ) -> Result<ComDayCqRewriterLinkcheckerImplLinkCheckerTaskResponse, E>;

    /// ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactory - POST /system/console/configMgr/com.day.cq.rewriter.linkchecker.impl.LinkCheckerTransformerFactory
    async fn com_day_cq_rewriter_linkchecker_impl_link_checker_transformer_factory(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryQueryParams,
    ) -> Result<ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryResponse, E>;

    /// ComDayCqRewriterLinkcheckerImplLinkInfoStorageImpl - POST /system/console/configMgr/com.day.cq.rewriter.linkchecker.impl.LinkInfoStorageImpl
    async fn com_day_cq_rewriter_linkchecker_impl_link_info_storage_impl(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplQueryParams,
    ) -> Result<ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplResponse, E>;

    /// ComDayCqRewriterProcessorImplHtmlParserFactory - POST /system/console/configMgr/com.day.cq.rewriter.processor.impl.HtmlParserFactory
    async fn com_day_cq_rewriter_processor_impl_html_parser_factory(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqRewriterProcessorImplHtmlParserFactoryQueryParams,
    ) -> Result<ComDayCqRewriterProcessorImplHtmlParserFactoryResponse, E>;

    /// ComDayCqSearchImplBuilderQueryBuilderImpl - POST /system/console/configMgr/com.day.cq.search.impl.builder.QueryBuilderImpl
    async fn com_day_cq_search_impl_builder_query_builder_impl(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqSearchImplBuilderQueryBuilderImplQueryParams,
    ) -> Result<ComDayCqSearchImplBuilderQueryBuilderImplResponse, E>;

    /// ComDayCqSearchSuggestImplSuggestionIndexManagerImpl - POST /system/console/configMgr/com.day.cq.search.suggest.impl.SuggestionIndexManagerImpl
    async fn com_day_cq_search_suggest_impl_suggestion_index_manager_impl(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqSearchSuggestImplSuggestionIndexManagerImplQueryParams,
    ) -> Result<ComDayCqSearchSuggestImplSuggestionIndexManagerImplResponse, E>;

    /// ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandler - POST /system/console/configMgr/com.day.cq.searchpromote.impl.PublishSearchPromoteConfigHandler
    async fn com_day_cq_searchpromote_impl_publish_search_promote_config_handler(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerQueryParams,
    ) -> Result<ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerResponse, E>;

    /// ComDayCqSearchpromoteImplSearchPromoteServiceImpl - POST /system/console/configMgr/com.day.cq.searchpromote.impl.SearchPromoteServiceImpl
    async fn com_day_cq_searchpromote_impl_search_promote_service_impl(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqSearchpromoteImplSearchPromoteServiceImplQueryParams,
    ) -> Result<ComDayCqSearchpromoteImplSearchPromoteServiceImplResponse, E>;

    /// ComDayCqSecurityAclSetup - POST /system/console/configMgr/com.day.cq.security.ACLSetup
    async fn com_day_cq_security_acl_setup(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqSecurityAclSetupQueryParams,
    ) -> Result<ComDayCqSecurityAclSetupResponse, E>;

    /// ComDayCqStatisticsImplStatisticsServiceImpl - POST /system/console/configMgr/com.day.cq.statistics.impl.StatisticsServiceImpl
    async fn com_day_cq_statistics_impl_statistics_service_impl(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqStatisticsImplStatisticsServiceImplQueryParams,
    ) -> Result<ComDayCqStatisticsImplStatisticsServiceImplResponse, E>;

    /// ComDayCqTaggingImplJcrTagManagerFactoryImpl - POST /system/console/configMgr/com.day.cq.tagging.impl.JcrTagManagerFactoryImpl
    async fn com_day_cq_tagging_impl_jcr_tag_manager_factory_impl(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqTaggingImplJcrTagManagerFactoryImplQueryParams,
    ) -> Result<ComDayCqTaggingImplJcrTagManagerFactoryImplResponse, E>;

    /// ComDayCqTaggingImplSearchTagPredicateEvaluator - POST /system/console/configMgr/com.day.cq.tagging.impl.search.TagPredicateEvaluator
    async fn com_day_cq_tagging_impl_search_tag_predicate_evaluator(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqTaggingImplSearchTagPredicateEvaluatorQueryParams,
    ) -> Result<ComDayCqTaggingImplSearchTagPredicateEvaluatorResponse, E>;

    /// ComDayCqTaggingImplTagGarbageCollector - POST /system/console/configMgr/com.day.cq.tagging.impl.TagGarbageCollector
    async fn com_day_cq_tagging_impl_tag_garbage_collector(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqTaggingImplTagGarbageCollectorQueryParams,
    ) -> Result<ComDayCqTaggingImplTagGarbageCollectorResponse, E>;

    /// ComDayCqWcmContentsyncImplHandlerPagesUpdateHandler - POST /system/console/configMgr/com.day.cq.wcm.contentsync.impl.handler.PagesUpdateHandler
    async fn com_day_cq_wcm_contentsync_impl_handler_pages_update_handler(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerQueryParams,
    ) -> Result<ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerResponse, E>;

    /// ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactor - POST /system/console/configMgr/com.day.cq.wcm.contentsync.impl.rewriter.PathRewriterTransformerFactory
    async fn com_day_cq_wcm_contentsync_impl_rewriter_path_rewriter_transformer_factor(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorQueryParams,
    ) -> Result<ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorResponse, E>;

    /// ComDayCqWcmCoreImplAuthoringUiModeServiceImpl - POST /system/console/configMgr/com.day.cq.wcm.core.impl.AuthoringUIModeServiceImpl
    async fn com_day_cq_wcm_core_impl_authoring_ui_mode_service_impl(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqWcmCoreImplAuthoringUiModeServiceImplQueryParams,
    ) -> Result<ComDayCqWcmCoreImplAuthoringUiModeServiceImplResponse, E>;

    /// ComDayCqWcmCoreImplCommandsWcmCommandServlet - POST /system/console/configMgr/com.day.cq.wcm.core.impl.commands.WCMCommandServlet
    async fn com_day_cq_wcm_core_impl_commands_wcm_command_servlet(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqWcmCoreImplCommandsWcmCommandServletQueryParams,
    ) -> Result<ComDayCqWcmCoreImplCommandsWcmCommandServletResponse, E>;

    /// ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImpl - POST /system/console/configMgr/com.day.cq.wcm.core.impl.devicedetection.DeviceIdentificationModeImpl
    async fn com_day_cq_wcm_core_impl_devicedetection_device_identification_mode_impl(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplQueryParams,
    ) -> Result<ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplResponse, E>;

    /// ComDayCqWcmCoreImplEventPageEventAuditListener - POST /system/console/configMgr/com.day.cq.wcm.core.impl.event.PageEventAuditListener
    async fn com_day_cq_wcm_core_impl_event_page_event_audit_listener(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqWcmCoreImplEventPageEventAuditListenerQueryParams,
    ) -> Result<ComDayCqWcmCoreImplEventPageEventAuditListenerResponse, E>;

    /// ComDayCqWcmCoreImplEventPagePostProcessor - POST /system/console/configMgr/com.day.cq.wcm.core.impl.event.PagePostProcessor
    async fn com_day_cq_wcm_core_impl_event_page_post_processor(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqWcmCoreImplEventPagePostProcessorQueryParams,
    ) -> Result<ComDayCqWcmCoreImplEventPagePostProcessorResponse, E>;

    /// ComDayCqWcmCoreImplEventRepositoryChangeEventListener - POST /system/console/configMgr/com.day.cq.wcm.core.impl.event.RepositoryChangeEventListener
    async fn com_day_cq_wcm_core_impl_event_repository_change_event_listener(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqWcmCoreImplEventRepositoryChangeEventListenerQueryParams,
    ) -> Result<ComDayCqWcmCoreImplEventRepositoryChangeEventListenerResponse, E>;

    /// ComDayCqWcmCoreImplEventTemplatePostProcessor - POST /system/console/configMgr/com.day.cq.wcm.core.impl.event.TemplatePostProcessor
    async fn com_day_cq_wcm_core_impl_event_template_post_processor(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqWcmCoreImplEventTemplatePostProcessorQueryParams,
    ) -> Result<ComDayCqWcmCoreImplEventTemplatePostProcessorResponse, E>;

    /// ComDayCqWcmCoreImplLanguageManagerImpl - POST /system/console/configMgr/com.day.cq.wcm.core.impl.LanguageManagerImpl
    async fn com_day_cq_wcm_core_impl_language_manager_impl(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqWcmCoreImplLanguageManagerImplQueryParams,
    ) -> Result<ComDayCqWcmCoreImplLanguageManagerImplResponse, E>;

    /// ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImpl - POST /system/console/configMgr/com.day.cq.wcm.core.impl.LinkCheckerConfigurationFactoryImpl
    async fn com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplQueryParams,
    ) -> Result<ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplResponse, E>;

    /// ComDayCqWcmCoreImplPagePageInfoAggregatorImpl - POST /system/console/configMgr/com.day.cq.wcm.core.impl.page.PageInfoAggregatorImpl
    async fn com_day_cq_wcm_core_impl_page_page_info_aggregator_impl(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqWcmCoreImplPagePageInfoAggregatorImplQueryParams,
    ) -> Result<ComDayCqWcmCoreImplPagePageInfoAggregatorImplResponse, E>;

    /// ComDayCqWcmCoreImplPagePageManagerFactoryImpl - POST /system/console/configMgr/com.day.cq.wcm.core.impl.page.PageManagerFactoryImpl
    async fn com_day_cq_wcm_core_impl_page_page_manager_factory_impl(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqWcmCoreImplPagePageManagerFactoryImplQueryParams,
    ) -> Result<ComDayCqWcmCoreImplPagePageManagerFactoryImplResponse, E>;

    /// ComDayCqWcmCoreImplReferencesContentContentReferenceConfig - POST /system/console/configMgr/com.day.cq.wcm.core.impl.references.content.ContentReferenceConfig
    async fn com_day_cq_wcm_core_impl_references_content_content_reference_config(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqWcmCoreImplReferencesContentContentReferenceConfigQueryParams,
    ) -> Result<ComDayCqWcmCoreImplReferencesContentContentReferenceConfigResponse, E>;

    /// ComDayCqWcmCoreImplServletsContentfinderAssetViewHandler - POST /system/console/configMgr/com.day.cq.wcm.core.impl.servlets.contentfinder.AssetViewHandler
    async fn com_day_cq_wcm_core_impl_servlets_contentfinder_asset_view_handler(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerQueryParams,
    ) -> Result<ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerResponse, E>;

    /// ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVie - POST /system/console/configMgr/com.day.cq.wcm.core.impl.servlets.contentfinder.connector.ConnectorViewHandler
    async fn com_day_cq_wcm_core_impl_servlets_contentfinder_connector_connector_vie(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieQueryParams,
    ) -> Result<ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieResponse, E>;

    /// ComDayCqWcmCoreImplServletsContentfinderPageViewHandler - POST /system/console/configMgr/com.day.cq.wcm.core.impl.servlets.contentfinder.PageViewHandler
    async fn com_day_cq_wcm_core_impl_servlets_contentfinder_page_view_handler(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerQueryParams,
    ) -> Result<ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerResponse, E>;

    /// ComDayCqWcmCoreImplServletsFindReplaceServlet - POST /system/console/configMgr/com.day.cq.wcm.core.impl.servlets.FindReplaceServlet
    async fn com_day_cq_wcm_core_impl_servlets_find_replace_servlet(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqWcmCoreImplServletsFindReplaceServletQueryParams,
    ) -> Result<ComDayCqWcmCoreImplServletsFindReplaceServletResponse, E>;

    /// ComDayCqWcmCoreImplServletsReferenceSearchServlet - POST /system/console/configMgr/com.day.cq.wcm.core.impl.servlets.ReferenceSearchServlet
    async fn com_day_cq_wcm_core_impl_servlets_reference_search_servlet(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqWcmCoreImplServletsReferenceSearchServletQueryParams,
    ) -> Result<ComDayCqWcmCoreImplServletsReferenceSearchServletResponse, E>;

    /// ComDayCqWcmCoreImplServletsThumbnailServlet - POST /system/console/configMgr/com.day.cq.wcm.core.impl.servlets.ThumbnailServlet
    async fn com_day_cq_wcm_core_impl_servlets_thumbnail_servlet(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqWcmCoreImplServletsThumbnailServletQueryParams,
    ) -> Result<ComDayCqWcmCoreImplServletsThumbnailServletResponse, E>;

    /// ComDayCqWcmCoreImplUtilsDefaultPageNameValidator - POST /system/console/configMgr/com.day.cq.wcm.core.impl.utils.DefaultPageNameValidator
    async fn com_day_cq_wcm_core_impl_utils_default_page_name_validator(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorQueryParams,
    ) -> Result<ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorResponse, E>;

    /// ComDayCqWcmCoreImplVariantsPageVariantsProviderImpl - POST /system/console/configMgr/com.day.cq.wcm.core.impl.variants.PageVariantsProviderImpl
    async fn com_day_cq_wcm_core_impl_variants_page_variants_provider_impl(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqWcmCoreImplVariantsPageVariantsProviderImplQueryParams,
    ) -> Result<ComDayCqWcmCoreImplVariantsPageVariantsProviderImplResponse, E>;

    /// ComDayCqWcmCoreImplVersionManagerImpl - POST /system/console/configMgr/com.day.cq.wcm.core.impl.VersionManagerImpl
    async fn com_day_cq_wcm_core_impl_version_manager_impl(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqWcmCoreImplVersionManagerImplQueryParams,
    ) -> Result<ComDayCqWcmCoreImplVersionManagerImplResponse, E>;

    /// ComDayCqWcmCoreImplVersionPurgeTask - POST /system/console/configMgr/com.day.cq.wcm.core.impl.VersionPurgeTask
    async fn com_day_cq_wcm_core_impl_version_purge_task(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqWcmCoreImplVersionPurgeTaskQueryParams,
    ) -> Result<ComDayCqWcmCoreImplVersionPurgeTaskResponse, E>;

    /// ComDayCqWcmCoreImplWarpTimeWarpFilter - POST /system/console/configMgr/com.day.cq.wcm.core.impl.warp.TimeWarpFilter
    async fn com_day_cq_wcm_core_impl_warp_time_warp_filter(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqWcmCoreImplWarpTimeWarpFilterQueryParams,
    ) -> Result<ComDayCqWcmCoreImplWarpTimeWarpFilterResponse, E>;

    /// ComDayCqWcmCoreImplWcmDebugFilter - POST /system/console/configMgr/com.day.cq.wcm.core.impl.WCMDebugFilter
    async fn com_day_cq_wcm_core_impl_wcm_debug_filter(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqWcmCoreImplWcmDebugFilterQueryParams,
    ) -> Result<ComDayCqWcmCoreImplWcmDebugFilterResponse, E>;

    /// ComDayCqWcmCoreImplWcmDeveloperModeFilter - POST /system/console/configMgr/com.day.cq.wcm.core.impl.WCMDeveloperModeFilter
    async fn com_day_cq_wcm_core_impl_wcm_developer_mode_filter(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqWcmCoreImplWcmDeveloperModeFilterQueryParams,
    ) -> Result<ComDayCqWcmCoreImplWcmDeveloperModeFilterResponse, E>;

    /// ComDayCqWcmCoreMvtMvtStatisticsImpl - POST /system/console/configMgr/com.day.cq.wcm.core.mvt.MVTStatisticsImpl
    async fn com_day_cq_wcm_core_mvt_mvt_statistics_impl(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqWcmCoreMvtMvtStatisticsImplQueryParams,
    ) -> Result<ComDayCqWcmCoreMvtMvtStatisticsImplResponse, E>;

    /// ComDayCqWcmCoreStatsPageViewStatisticsImpl - POST /system/console/configMgr/com.day.cq.wcm.core.stats.PageViewStatisticsImpl
    async fn com_day_cq_wcm_core_stats_page_view_statistics_impl(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqWcmCoreStatsPageViewStatisticsImplQueryParams,
    ) -> Result<ComDayCqWcmCoreStatsPageViewStatisticsImplResponse, E>;

    /// ComDayCqWcmCoreWcmRequestFilter - POST /system/console/configMgr/com.day.cq.wcm.core.WCMRequestFilter
    async fn com_day_cq_wcm_core_wcm_request_filter(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqWcmCoreWcmRequestFilterQueryParams,
    ) -> Result<ComDayCqWcmCoreWcmRequestFilterResponse, E>;

    /// ComDayCqWcmDesignimporterDesignPackageImporter - POST /system/console/configMgr/com.day.cq.wcm.designimporter.DesignPackageImporter
    async fn com_day_cq_wcm_designimporter_design_package_importer(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqWcmDesignimporterDesignPackageImporterQueryParams,
    ) -> Result<ComDayCqWcmDesignimporterDesignPackageImporterResponse, E>;

    /// ComDayCqWcmDesignimporterImplCanvasBuilderImpl - POST /system/console/configMgr/com.day.cq.wcm.designimporter.impl.CanvasBuilderImpl
    async fn com_day_cq_wcm_designimporter_impl_canvas_builder_impl(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqWcmDesignimporterImplCanvasBuilderImplQueryParams,
    ) -> Result<ComDayCqWcmDesignimporterImplCanvasBuilderImplResponse, E>;

    /// ComDayCqWcmDesignimporterImplCanvasPageDeleteHandler - POST /system/console/configMgr/com.day.cq.wcm.designimporter.impl.CanvasPageDeleteHandler
    async fn com_day_cq_wcm_designimporter_impl_canvas_page_delete_handler(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerQueryParams,
    ) -> Result<ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerResponse, E>;

    /// ComDayCqWcmDesignimporterImplEntryPreprocessorImpl - POST /system/console/configMgr/com.day.cq.wcm.designimporter.impl.EntryPreprocessorImpl
    async fn com_day_cq_wcm_designimporter_impl_entry_preprocessor_impl(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqWcmDesignimporterImplEntryPreprocessorImplQueryParams,
    ) -> Result<ComDayCqWcmDesignimporterImplEntryPreprocessorImplResponse, E>;

    /// ComDayCqWcmDesignimporterImplMobileCanvasBuilderImpl - POST /system/console/configMgr/com.day.cq.wcm.designimporter.impl.MobileCanvasBuilderImpl
    async fn com_day_cq_wcm_designimporter_impl_mobile_canvas_builder_impl(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplQueryParams,
    ) -> Result<ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplResponse, E>;

    /// ComDayCqWcmDesignimporterParserTaghandlersFactoryCanvasCompone - POST /system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.CanvasComponentTagHandlerFactory
    async fn com_day_cq_wcm_designimporter_parser_taghandlers_factory_canvas_compone(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqWcmDesignimporterParserTaghandlersFactoryCanvasComponeQueryParams,
    ) -> Result<ComDayCqWcmDesignimporterParserTaghandlersFactoryCanvasComponeResponse, E>;

    /// ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultCompon - POST /system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.DefaultComponentTagHandlerFactory
    async fn com_day_cq_wcm_designimporter_parser_taghandlers_factory_default_compon(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultComponQueryParams,
    ) -> Result<ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultComponResponse, E>;

    /// ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultTagHan - POST /system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.DefaultTagHandlerFactory
    async fn com_day_cq_wcm_designimporter_parser_taghandlers_factory_default_tag_han(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultTagHanQueryParams,
    ) -> Result<ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultTagHanResponse, E>;

    /// ComDayCqWcmDesignimporterParserTaghandlersFactoryHeadTagHandle - POST /system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.HeadTagHandlerFactory
    async fn com_day_cq_wcm_designimporter_parser_taghandlers_factory_head_tag_handle(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqWcmDesignimporterParserTaghandlersFactoryHeadTagHandleQueryParams,
    ) -> Result<ComDayCqWcmDesignimporterParserTaghandlersFactoryHeadTagHandleResponse, E>;

    /// ComDayCqWcmDesignimporterParserTaghandlersFactoryIFrameTagHand - POST /system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.IFrameTagHandlerFactory
    async fn com_day_cq_wcm_designimporter_parser_taghandlers_factory_i_frame_tag_hand(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqWcmDesignimporterParserTaghandlersFactoryIFrameTagHandQueryParams,
    ) -> Result<ComDayCqWcmDesignimporterParserTaghandlersFactoryIFrameTagHandResponse, E>;

    /// ComDayCqWcmDesignimporterParserTaghandlersFactoryImageComponen - POST /system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.ImageComponentTagHandlerFactory
    async fn com_day_cq_wcm_designimporter_parser_taghandlers_factory_image_componen(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqWcmDesignimporterParserTaghandlersFactoryImageComponenQueryParams,
    ) -> Result<ComDayCqWcmDesignimporterParserTaghandlersFactoryImageComponenResponse, E>;

    /// ComDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandler - POST /system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.ImgTagHandlerFactory
    async fn com_day_cq_wcm_designimporter_parser_taghandlers_factory_img_tag_handler(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandlerQueryParams,
    ) -> Result<ComDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandlerResponse, E>;

    /// ComDayCqWcmDesignimporterParserTaghandlersFactoryInlineScriptT - POST /system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.InlineScriptTagHandlerFactory
    async fn com_day_cq_wcm_designimporter_parser_taghandlers_factory_inline_script_t(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqWcmDesignimporterParserTaghandlersFactoryInlineScriptTQueryParams,
    ) -> Result<ComDayCqWcmDesignimporterParserTaghandlersFactoryInlineScriptTResponse, E>;

    /// ComDayCqWcmDesignimporterParserTaghandlersFactoryLinkTagHandle - POST /system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.LinkTagHandlerFactory
    async fn com_day_cq_wcm_designimporter_parser_taghandlers_factory_link_tag_handle(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqWcmDesignimporterParserTaghandlersFactoryLinkTagHandleQueryParams,
    ) -> Result<ComDayCqWcmDesignimporterParserTaghandlersFactoryLinkTagHandleResponse, E>;

    /// ComDayCqWcmDesignimporterParserTaghandlersFactoryMetaTagHandle - POST /system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.MetaTagHandlerFactory
    async fn com_day_cq_wcm_designimporter_parser_taghandlers_factory_meta_tag_handle(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqWcmDesignimporterParserTaghandlersFactoryMetaTagHandleQueryParams,
    ) -> Result<ComDayCqWcmDesignimporterParserTaghandlersFactoryMetaTagHandleResponse, E>;

    /// ComDayCqWcmDesignimporterParserTaghandlersFactoryNonScriptTagH - POST /system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.NonScriptTagHandlerFactory
    async fn com_day_cq_wcm_designimporter_parser_taghandlers_factory_non_script_tag_h(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqWcmDesignimporterParserTaghandlersFactoryNonScriptTagHQueryParams,
    ) -> Result<ComDayCqWcmDesignimporterParserTaghandlersFactoryNonScriptTagHResponse, E>;

    /// ComDayCqWcmDesignimporterParserTaghandlersFactoryParsysCompone - POST /system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.ParsysComponentTagHandlerFactory
    async fn com_day_cq_wcm_designimporter_parser_taghandlers_factory_parsys_compone(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqWcmDesignimporterParserTaghandlersFactoryParsysComponeQueryParams,
    ) -> Result<ComDayCqWcmDesignimporterParserTaghandlersFactoryParsysComponeResponse, E>;

    /// ComDayCqWcmDesignimporterParserTaghandlersFactoryScriptTagHand - POST /system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.ScriptTagHandlerFactory
    async fn com_day_cq_wcm_designimporter_parser_taghandlers_factory_script_tag_hand(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqWcmDesignimporterParserTaghandlersFactoryScriptTagHandQueryParams,
    ) -> Result<ComDayCqWcmDesignimporterParserTaghandlersFactoryScriptTagHandResponse, E>;

    /// ComDayCqWcmDesignimporterParserTaghandlersFactoryStyleTagHandl - POST /system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.StyleTagHandlerFactory
    async fn com_day_cq_wcm_designimporter_parser_taghandlers_factory_style_tag_handl(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqWcmDesignimporterParserTaghandlersFactoryStyleTagHandlQueryParams,
    ) -> Result<ComDayCqWcmDesignimporterParserTaghandlersFactoryStyleTagHandlResponse, E>;

    /// ComDayCqWcmDesignimporterParserTaghandlersFactoryTextComponent - POST /system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.TextComponentTagHandlerFactory
    async fn com_day_cq_wcm_designimporter_parser_taghandlers_factory_text_component(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqWcmDesignimporterParserTaghandlersFactoryTextComponentQueryParams,
    ) -> Result<ComDayCqWcmDesignimporterParserTaghandlersFactoryTextComponentResponse, E>;

    /// ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleComponen - POST /system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.TitleComponentTagHandlerFactory
    async fn com_day_cq_wcm_designimporter_parser_taghandlers_factory_title_componen(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleComponenQueryParams,
    ) -> Result<ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleComponenResponse, E>;

    /// ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleTagHandl - POST /system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.TitleTagHandlerFactory
    async fn com_day_cq_wcm_designimporter_parser_taghandlers_factory_title_tag_handl(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleTagHandlQueryParams,
    ) -> Result<ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleTagHandlResponse, E>;

    /// ComDayCqWcmFoundationFormsImplFormChooserServlet - POST /system/console/configMgr/com.day.cq.wcm.foundation.forms.impl.FormChooserServlet
    async fn com_day_cq_wcm_foundation_forms_impl_form_chooser_servlet(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqWcmFoundationFormsImplFormChooserServletQueryParams,
    ) -> Result<ComDayCqWcmFoundationFormsImplFormChooserServletResponse, E>;

    /// ComDayCqWcmFoundationFormsImplFormParagraphPostProcessor - POST /system/console/configMgr/com.day.cq.wcm.foundation.forms.impl.FormParagraphPostProcessor
    async fn com_day_cq_wcm_foundation_forms_impl_form_paragraph_post_processor(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorQueryParams,
    ) -> Result<ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorResponse, E>;

    /// ComDayCqWcmFoundationFormsImplFormsHandlingServlet - POST /system/console/configMgr/com.day.cq.wcm.foundation.forms.impl.FormsHandlingServlet
    async fn com_day_cq_wcm_foundation_forms_impl_forms_handling_servlet(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqWcmFoundationFormsImplFormsHandlingServletQueryParams,
    ) -> Result<ComDayCqWcmFoundationFormsImplFormsHandlingServletResponse, E>;

    /// ComDayCqWcmFoundationFormsImplMailServlet - POST /system/console/configMgr/com.day.cq.wcm.foundation.forms.impl.MailServlet
    async fn com_day_cq_wcm_foundation_forms_impl_mail_servlet(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqWcmFoundationFormsImplMailServletQueryParams,
    ) -> Result<ComDayCqWcmFoundationFormsImplMailServletResponse, E>;

    /// ComDayCqWcmFoundationImplAdaptiveImageComponentServlet - POST /system/console/configMgr/com.day.cq.wcm.foundation.impl.AdaptiveImageComponentServlet
    async fn com_day_cq_wcm_foundation_impl_adaptive_image_component_servlet(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqWcmFoundationImplAdaptiveImageComponentServletQueryParams,
    ) -> Result<ComDayCqWcmFoundationImplAdaptiveImageComponentServletResponse, E>;

    /// ComDayCqWcmFoundationImplHttpAuthHandler - POST /system/console/configMgr/com.day.cq.wcm.foundation.impl.HTTPAuthHandler
    async fn com_day_cq_wcm_foundation_impl_http_auth_handler(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqWcmFoundationImplHttpAuthHandlerQueryParams,
    ) -> Result<ComDayCqWcmFoundationImplHttpAuthHandlerResponse, E>;

    /// ComDayCqWcmFoundationImplPageImpressionsTracker - POST /system/console/configMgr/com.day.cq.wcm.foundation.impl.PageImpressionsTracker
    async fn com_day_cq_wcm_foundation_impl_page_impressions_tracker(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqWcmFoundationImplPageImpressionsTrackerQueryParams,
    ) -> Result<ComDayCqWcmFoundationImplPageImpressionsTrackerResponse, E>;

    /// ComDayCqWcmFoundationImplPageRedirectServlet - POST /system/console/configMgr/com.day.cq.wcm.foundation.impl.PageRedirectServlet
    async fn com_day_cq_wcm_foundation_impl_page_redirect_servlet(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqWcmFoundationImplPageRedirectServletQueryParams,
    ) -> Result<ComDayCqWcmFoundationImplPageRedirectServletResponse, E>;

    /// ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklist - POST /system/console/configMgr/com.day.cq.wcm.foundation.security.impl.DefaultAttachmentTypeBlacklistService
    async fn com_day_cq_wcm_foundation_security_impl_default_attachment_type_blacklist(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistQueryParams,
    ) -> Result<ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistResponse, E>;

    /// ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImpl - POST /system/console/configMgr/com.day.cq.wcm.foundation.security.impl.SaferSlingPostValidatorImpl
    async fn com_day_cq_wcm_foundation_security_impl_safer_sling_post_validator_impl(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplQueryParams,
    ) -> Result<ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplResponse, E>;

    /// ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactory - POST /system/console/configMgr/com.day.cq.wcm.mobile.core.impl.device.DeviceInfoTransformerFactory
    async fn com_day_cq_wcm_mobile_core_impl_device_device_info_transformer_factory(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryQueryParams,
    ) -> Result<ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryResponse, E>;

    /// ComDayCqWcmMobileCoreImplRedirectRedirectFilter - POST /system/console/configMgr/com.day.cq.wcm.mobile.core.impl.redirect.RedirectFilter
    async fn com_day_cq_wcm_mobile_core_impl_redirect_redirect_filter(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqWcmMobileCoreImplRedirectRedirectFilterQueryParams,
    ) -> Result<ComDayCqWcmMobileCoreImplRedirectRedirectFilterResponse, E>;

    /// ComDayCqWcmMsmImplActionsContentCopyActionFactory - POST /system/console/configMgr/com.day.cq.wcm.msm.impl.actions.ContentCopyActionFactory
    async fn com_day_cq_wcm_msm_impl_actions_content_copy_action_factory(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqWcmMsmImplActionsContentCopyActionFactoryQueryParams,
    ) -> Result<ComDayCqWcmMsmImplActionsContentCopyActionFactoryResponse, E>;

    /// ComDayCqWcmMsmImplActionsContentDeleteActionFactory - POST /system/console/configMgr/com.day.cq.wcm.msm.impl.actions.ContentDeleteActionFactory
    async fn com_day_cq_wcm_msm_impl_actions_content_delete_action_factory(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqWcmMsmImplActionsContentDeleteActionFactoryQueryParams,
    ) -> Result<ComDayCqWcmMsmImplActionsContentDeleteActionFactoryResponse, E>;

    /// ComDayCqWcmMsmImplActionsContentUpdateActionFactory - POST /system/console/configMgr/com.day.cq.wcm.msm.impl.actions.ContentUpdateActionFactory
    async fn com_day_cq_wcm_msm_impl_actions_content_update_action_factory(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqWcmMsmImplActionsContentUpdateActionFactoryQueryParams,
    ) -> Result<ComDayCqWcmMsmImplActionsContentUpdateActionFactoryResponse, E>;

    /// ComDayCqWcmMsmImplActionsOrderChildrenActionFactory - POST /system/console/configMgr/com.day.cq.wcm.msm.impl.actions.OrderChildrenActionFactory
    async fn com_day_cq_wcm_msm_impl_actions_order_children_action_factory(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryQueryParams,
    ) -> Result<ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryResponse, E>;

    /// ComDayCqWcmMsmImplActionsPageMoveActionFactory - POST /system/console/configMgr/com.day.cq.wcm.msm.impl.actions.PageMoveActionFactory
    async fn com_day_cq_wcm_msm_impl_actions_page_move_action_factory(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqWcmMsmImplActionsPageMoveActionFactoryQueryParams,
    ) -> Result<ComDayCqWcmMsmImplActionsPageMoveActionFactoryResponse, E>;

    /// ComDayCqWcmMsmImplActionsReferencesUpdateActionFactory - POST /system/console/configMgr/com.day.cq.wcm.msm.impl.actions.ReferencesUpdateActionFactory
    async fn com_day_cq_wcm_msm_impl_actions_references_update_action_factory(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryQueryParams,
    ) -> Result<ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryResponse, E>;

    /// ComDayCqWcmMsmImplActionsVersionCopyActionFactory - POST /system/console/configMgr/com.day.cq.wcm.msm.impl.actions.VersionCopyActionFactory
    async fn com_day_cq_wcm_msm_impl_actions_version_copy_action_factory(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqWcmMsmImplActionsVersionCopyActionFactoryQueryParams,
    ) -> Result<ComDayCqWcmMsmImplActionsVersionCopyActionFactoryResponse, E>;

    /// ComDayCqWcmMsmImplLiveRelationshipManagerImpl - POST /system/console/configMgr/com.day.cq.wcm.msm.impl.LiveRelationshipManagerImpl
    async fn com_day_cq_wcm_msm_impl_live_relationship_manager_impl(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqWcmMsmImplLiveRelationshipManagerImplQueryParams,
    ) -> Result<ComDayCqWcmMsmImplLiveRelationshipManagerImplResponse, E>;

    /// ComDayCqWcmMsmImplRolloutManagerImpl - POST /system/console/configMgr/com.day.cq.wcm.msm.impl.RolloutManagerImpl
    async fn com_day_cq_wcm_msm_impl_rollout_manager_impl(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqWcmMsmImplRolloutManagerImplQueryParams,
    ) -> Result<ComDayCqWcmMsmImplRolloutManagerImplResponse, E>;

    /// ComDayCqWcmMsmImplServletsAuditLogServlet - POST /system/console/configMgr/com.day.cq.wcm.msm.impl.servlets.AuditLogServlet
    async fn com_day_cq_wcm_msm_impl_servlets_audit_log_servlet(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqWcmMsmImplServletsAuditLogServletQueryParams,
    ) -> Result<ComDayCqWcmMsmImplServletsAuditLogServletResponse, E>;

    /// ComDayCqWcmNotificationEmailImplEmailChannel - POST /system/console/configMgr/com.day.cq.wcm.notification.email.impl.EmailChannel
    async fn com_day_cq_wcm_notification_email_impl_email_channel(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqWcmNotificationEmailImplEmailChannelQueryParams,
    ) -> Result<ComDayCqWcmNotificationEmailImplEmailChannelResponse, E>;

    /// ComDayCqWcmNotificationImplNotificationManagerImpl - POST /system/console/configMgr/com.day.cq.wcm.notification.impl.NotificationManagerImpl
    async fn com_day_cq_wcm_notification_impl_notification_manager_impl(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqWcmNotificationImplNotificationManagerImplQueryParams,
    ) -> Result<ComDayCqWcmNotificationImplNotificationManagerImplResponse, E>;

    /// ComDayCqWcmScriptingImplBvpManager - POST /system/console/configMgr/com.day.cq.wcm.scripting.impl.BVPManager
    async fn com_day_cq_wcm_scripting_impl_bvp_manager(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqWcmScriptingImplBvpManagerQueryParams,
    ) -> Result<ComDayCqWcmScriptingImplBvpManagerResponse, E>;

    /// ComDayCqWcmUndoUndoConfig - POST /system/console/configMgr/com.day.cq.wcm.undo.UndoConfig
    async fn com_day_cq_wcm_undo_undo_config(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqWcmUndoUndoConfigQueryParams,
    ) -> Result<ComDayCqWcmUndoUndoConfigResponse, E>;

    /// ComDayCqWcmWebservicesupportImplReplicationEventListener - POST /system/console/configMgr/com.day.cq.wcm.webservicesupport.impl.ReplicationEventListener
    async fn com_day_cq_wcm_webservicesupport_impl_replication_event_listener(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqWcmWebservicesupportImplReplicationEventListenerQueryParams,
    ) -> Result<ComDayCqWcmWebservicesupportImplReplicationEventListenerResponse, E>;

    /// ComDayCqWcmWorkflowImplWcmWorkflowServiceImpl - POST /system/console/configMgr/com.day.cq.wcm.workflow.impl.WcmWorkflowServiceImpl
    async fn com_day_cq_wcm_workflow_impl_wcm_workflow_service_impl(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqWcmWorkflowImplWcmWorkflowServiceImplQueryParams,
    ) -> Result<ComDayCqWcmWorkflowImplWcmWorkflowServiceImplResponse, E>;

    /// ComDayCqWcmWorkflowImplWorkflowPackageInfoProvider - POST /system/console/configMgr/com.day.cq.wcm.workflow.impl.WorkflowPackageInfoProvider
    async fn com_day_cq_wcm_workflow_impl_workflow_package_info_provider(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderQueryParams,
    ) -> Result<ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderResponse, E>;

    /// ComDayCqWidgetImplHtmlLibraryManagerImpl - POST /system/console/configMgr/com.day.cq.widget.impl.HtmlLibraryManagerImpl
    async fn com_day_cq_widget_impl_html_library_manager_impl(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqWidgetImplHtmlLibraryManagerImplQueryParams,
    ) -> Result<ComDayCqWidgetImplHtmlLibraryManagerImplResponse, E>;

    /// ComDayCqWidgetImplWidgetExtensionProviderImpl - POST /system/console/configMgr/com.day.cq.widget.impl.WidgetExtensionProviderImpl
    async fn com_day_cq_widget_impl_widget_extension_provider_impl(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqWidgetImplWidgetExtensionProviderImplQueryParams,
    ) -> Result<ComDayCqWidgetImplWidgetExtensionProviderImplResponse, E>;

    /// ComDayCqWorkflowImplEmailEMailNotificationService - POST /system/console/configMgr/com.day.cq.workflow.impl.email.EMailNotificationService
    async fn com_day_cq_workflow_impl_email_e_mail_notification_service(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqWorkflowImplEmailEMailNotificationServiceQueryParams,
    ) -> Result<ComDayCqWorkflowImplEmailEMailNotificationServiceResponse, E>;

    /// ComDayCqWorkflowImplEmailTaskEMailNotificationService - POST /system/console/configMgr/com.day.cq.workflow.impl.email.TaskEMailNotificationService
    async fn com_day_cq_workflow_impl_email_task_e_mail_notification_service(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCqWorkflowImplEmailTaskEMailNotificationServiceQueryParams,
    ) -> Result<ComDayCqWorkflowImplEmailTaskEMailNotificationServiceResponse, E>;

    /// ComDayCrxSecurityTokenImplImplTokenAuthenticationHandler - POST /system/console/configMgr/com.day.crx.security.token.impl.impl.TokenAuthenticationHandler
    async fn com_day_crx_security_token_impl_impl_token_authentication_handler(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerQueryParams,
    ) -> Result<ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerResponse, E>;

    /// ComDayCrxSecurityTokenImplTokenCleanupTask - POST /system/console/configMgr/com.day.crx.security.token.impl.TokenCleanupTask
    async fn com_day_crx_security_token_impl_token_cleanup_task(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::ComDayCrxSecurityTokenImplTokenCleanupTaskQueryParams,
    ) -> Result<ComDayCrxSecurityTokenImplTokenCleanupTaskResponse, E>;

    /// GuideLocalizationService - POST /system/console/configMgr/Guide Localization Service
    async fn guide_localization_service(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::GuideLocalizationServiceQueryParams,
    ) -> Result<GuideLocalizationServiceResponse, E>;

    /// MessagingUserComponentFactory - POST /system/console/configMgr/MessagingUserComponentFactory
    async fn messaging_user_component_factory(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::MessagingUserComponentFactoryQueryParams,
    ) -> Result<MessagingUserComponentFactoryResponse, E>;

    /// OrgApacheAriesJmxFrameworkStateConfig - POST /system/console/configMgr/org.apache.aries.jmx.framework.StateConfig
    async fn org_apache_aries_jmx_framework_state_config(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::OrgApacheAriesJmxFrameworkStateConfigQueryParams,
    ) -> Result<OrgApacheAriesJmxFrameworkStateConfigResponse, E>;

    /// OrgApacheFelixEventadminImplEventAdmin - POST /system/console/configMgr/org.apache.felix.eventadmin.impl.EventAdmin
    async fn org_apache_felix_eventadmin_impl_event_admin(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::OrgApacheFelixEventadminImplEventAdminQueryParams,
    ) -> Result<OrgApacheFelixEventadminImplEventAdminResponse, E>;

    /// OrgApacheFelixHttp - POST /system/console/configMgr/org.apache.felix.http
    async fn org_apache_felix_http(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::OrgApacheFelixHttpQueryParams,
    ) -> Result<OrgApacheFelixHttpResponse, E>;

    /// OrgApacheFelixHttpSslfilterSslFilter - POST /system/console/configMgr/org.apache.felix.http.sslfilter.SslFilter
    async fn org_apache_felix_http_sslfilter_ssl_filter(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::OrgApacheFelixHttpSslfilterSslFilterQueryParams,
    ) -> Result<OrgApacheFelixHttpSslfilterSslFilterResponse, E>;

    /// OrgApacheFelixJaasConfigurationFactory - POST /system/console/configMgr/org.apache.felix.jaas.Configuration.factory
    async fn org_apache_felix_jaas_configuration_factory(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::OrgApacheFelixJaasConfigurationFactoryQueryParams,
    ) -> Result<OrgApacheFelixJaasConfigurationFactoryResponse, E>;

    /// OrgApacheFelixJaasConfigurationSpi - POST /system/console/configMgr/org.apache.felix.jaas.ConfigurationSpi
    async fn org_apache_felix_jaas_configuration_spi(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::OrgApacheFelixJaasConfigurationSpiQueryParams,
    ) -> Result<OrgApacheFelixJaasConfigurationSpiResponse, E>;

    /// OrgApacheFelixScrScrService - POST /system/console/configMgr/org.apache.felix.scr.ScrService
    async fn org_apache_felix_scr_scr_service(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::OrgApacheFelixScrScrServiceQueryParams,
    ) -> Result<OrgApacheFelixScrScrServiceResponse, E>;

    /// OrgApacheFelixSystemreadyImplComponentsCheck - POST /system/console/configMgr/org.apache.felix.systemready.impl.ComponentsCheck
    async fn org_apache_felix_systemready_impl_components_check(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::OrgApacheFelixSystemreadyImplComponentsCheckQueryParams,
    ) -> Result<OrgApacheFelixSystemreadyImplComponentsCheckResponse, E>;

    /// OrgApacheFelixSystemreadyImplFrameworkStartCheck - POST /system/console/configMgr/org.apache.felix.systemready.impl.FrameworkStartCheck
    async fn org_apache_felix_systemready_impl_framework_start_check(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::OrgApacheFelixSystemreadyImplFrameworkStartCheckQueryParams,
    ) -> Result<OrgApacheFelixSystemreadyImplFrameworkStartCheckResponse, E>;

    /// OrgApacheFelixSystemreadyImplServicesCheck - POST /system/console/configMgr/org.apache.felix.systemready.impl.ServicesCheck
    async fn org_apache_felix_systemready_impl_services_check(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::OrgApacheFelixSystemreadyImplServicesCheckQueryParams,
    ) -> Result<OrgApacheFelixSystemreadyImplServicesCheckResponse, E>;

    /// OrgApacheFelixSystemreadyImplServletSystemAliveServlet - POST /system/console/configMgr/org.apache.felix.systemready.impl.servlet.SystemAliveServlet
    async fn org_apache_felix_systemready_impl_servlet_system_alive_servlet(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::OrgApacheFelixSystemreadyImplServletSystemAliveServletQueryParams,
    ) -> Result<OrgApacheFelixSystemreadyImplServletSystemAliveServletResponse, E>;

    /// OrgApacheFelixSystemreadyImplServletSystemReadyServlet - POST /system/console/configMgr/org.apache.felix.systemready.impl.servlet.SystemReadyServlet
    async fn org_apache_felix_systemready_impl_servlet_system_ready_servlet(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::OrgApacheFelixSystemreadyImplServletSystemReadyServletQueryParams,
    ) -> Result<OrgApacheFelixSystemreadyImplServletSystemReadyServletResponse, E>;

    /// OrgApacheFelixSystemreadySystemReadyMonitor - POST /system/console/configMgr/org.apache.felix.systemready.SystemReadyMonitor
    async fn org_apache_felix_systemready_system_ready_monitor(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::OrgApacheFelixSystemreadySystemReadyMonitorQueryParams,
    ) -> Result<OrgApacheFelixSystemreadySystemReadyMonitorResponse, E>;

    /// OrgApacheFelixWebconsoleInternalServletOsgiManager - POST /system/console/configMgr/org.apache.felix.webconsole.internal.servlet.OsgiManager
    async fn org_apache_felix_webconsole_internal_servlet_osgi_manager(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::OrgApacheFelixWebconsoleInternalServletOsgiManagerQueryParams,
    ) -> Result<OrgApacheFelixWebconsoleInternalServletOsgiManagerResponse, E>;

    /// OrgApacheFelixWebconsolePluginsEventInternalPluginServlet - POST /system/console/configMgr/org.apache.felix.webconsole.plugins.event.internal.PluginServlet
    async fn org_apache_felix_webconsole_plugins_event_internal_plugin_servlet(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::OrgApacheFelixWebconsolePluginsEventInternalPluginServletQueryParams,
    ) -> Result<OrgApacheFelixWebconsolePluginsEventInternalPluginServletResponse, E>;

    /// OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCo - POST /system/console/configMgr/org.apache.felix.webconsole.plugins.memoryusage.internal.MemoryUsageConfigurator
    async fn org_apache_felix_webconsole_plugins_memoryusage_internal_memory_usage_co(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoQueryParams,
    ) -> Result<OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoResponse, E>;

    /// OrgApacheHttpProxyconfigurator - POST /system/console/configMgr/org.apache.http.proxyconfigurator
    async fn org_apache_http_proxyconfigurator(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::OrgApacheHttpProxyconfiguratorQueryParams,
    ) -> Result<OrgApacheHttpProxyconfiguratorResponse, E>;

    /// OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProvider - POST /system/console/configMgr/org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreTextProviderService
    async fn org_apache_jackrabbit_oak_plugins_blob_datastore_data_store_text_provider(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderQueryParams,
    ) -> Result<OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderResponse, E>;

    /// OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStore - POST /system/console/configMgr/org.apache.jackrabbit.oak.plugins.blob.datastore.FileDataStore
    async fn org_apache_jackrabbit_oak_plugins_blob_datastore_file_data_store(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreQueryParams,
    ) -> Result<OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreResponse, E>;

    /// OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreService - POST /system/console/configMgr/org.apache.jackrabbit.oak.plugins.document.DocumentNodeStoreService
    async fn org_apache_jackrabbit_oak_plugins_document_document_node_store_service(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceQueryParams,
    ) -> Result<OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceResponse, E>;

    /// OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePre - POST /system/console/configMgr/org.apache.jackrabbit.oak.plugins.document.DocumentNodeStoreServicePreset
    async fn org_apache_jackrabbit_oak_plugins_document_document_node_store_service_pre(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreQueryParams,
    ) -> Result<OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreResponse, E>;

    /// OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCac - POST /system/console/configMgr/org.apache.jackrabbit.oak.plugins.document.secondary.SecondaryStoreCacheService
    async fn org_apache_jackrabbit_oak_plugins_document_secondary_secondary_store_cac(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacQueryParams,
    ) -> Result<OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacResponse, E>;

    /// OrgApacheJackrabbitOakPluginsIndexAsyncIndexerService - POST /system/console/configMgr/org.apache.jackrabbit.oak.plugins.index.AsyncIndexerService
    async fn org_apache_jackrabbit_oak_plugins_index_async_indexer_service(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceQueryParams,
    ) -> Result<OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceResponse, E>;

    /// OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServ - POST /system/console/configMgr/org.apache.jackrabbit.oak.plugins.index.lucene.LuceneIndexProviderService
    async fn org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServQueryParams,
    ) -> Result<OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServResponse, E>;

    /// OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCo - POST /system/console/configMgr/org.apache.jackrabbit.oak.plugins.index.solr.osgi.EmbeddedSolrServerConfigurationProvider
    async fn org_apache_jackrabbit_oak_plugins_index_solr_osgi_embedded_solr_server_co(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoQueryParams,
    ) -> Result<OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoResponse, E>;

    /// OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServers - POST /system/console/configMgr/org.apache.jackrabbit.oak.plugins.index.solr.osgi.NodeStateSolrServersObserverService
    async fn org_apache_jackrabbit_oak_plugins_index_solr_osgi_node_state_solr_servers(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersQueryParams,
    ) -> Result<OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersResponse, E>;

    /// OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfiguration - POST /system/console/configMgr/org.apache.jackrabbit.oak.plugins.index.solr.osgi.OakSolrConfigurationProviderService
    async fn org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationQueryParams,
    ) -> Result<OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationResponse, E>;

    /// OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConf - POST /system/console/configMgr/org.apache.jackrabbit.oak.plugins.index.solr.osgi.RemoteSolrServerConfigurationProvider
    async fn org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_server_conf(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfQueryParams,
    ) -> Result<OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfResponse, E>;

    /// OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvid - POST /system/console/configMgr/org.apache.jackrabbit.oak.plugins.index.solr.osgi.SolrQueryIndexProviderService
    async fn org_apache_jackrabbit_oak_plugins_index_solr_osgi_solr_query_index_provid(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidQueryParams,
    ) -> Result<OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidResponse, E>;

    /// OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSe - POST /system/console/configMgr/org.apache.jackrabbit.oak.plugins.index.solr.osgi.SolrServerProviderService
    async fn org_apache_jackrabbit_oak_plugins_index_solr_osgi_solr_server_provider_se(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeQueryParams,
    ) -> Result<OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeResponse, E>;

    /// OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactory - POST /system/console/configMgr/org.apache.jackrabbit.oak.plugins.metric.StatisticsProviderFactory
    async fn org_apache_jackrabbit_oak_plugins_metric_statistics_provider_factory(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryQueryParams,
    ) -> Result<OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryResponse, E>;

    /// OrgApacheJackrabbitOakPluginsObservationChangeCollectorProvider - POST /system/console/configMgr/org.apache.jackrabbit.oak.plugins.observation.ChangeCollectorProvider
    async fn org_apache_jackrabbit_oak_plugins_observation_change_collector_provider(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderQueryParams,
    ) -> Result<OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderResponse, E>;

    /// OrgApacheJackrabbitOakQueryQueryEngineSettingsService - POST /system/console/configMgr/org.apache.jackrabbit.oak.query.QueryEngineSettingsService
    async fn org_apache_jackrabbit_oak_query_query_engine_settings_service(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceQueryParams,
    ) -> Result<OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceResponse, E>;

    /// OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfig - POST /system/console/configMgr/org.apache.jackrabbit.oak.security.authentication.AuthenticationConfigurationImpl
    async fn org_apache_jackrabbit_oak_security_authentication_authentication_config(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigQueryParams,
    ) -> Result<OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigResponse, E>;

    /// OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdenti - POST /system/console/configMgr/org.apache.jackrabbit.oak.security.authentication.ldap.impl.LdapIdentityProvider
    async fn org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiQueryParams,
    ) -> Result<OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiResponse, E>;

    /// OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfigura - POST /system/console/configMgr/org.apache.jackrabbit.oak.security.authentication.token.TokenConfigurationImpl
    async fn org_apache_jackrabbit_oak_security_authentication_token_token_configura(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraQueryParams,
    ) -> Result<OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraResponse, E>;

    /// OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigur - POST /system/console/configMgr/org.apache.jackrabbit.oak.security.authorization.AuthorizationConfigurationImpl
    async fn org_apache_jackrabbit_oak_security_authorization_authorization_configur(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurQueryParams,
    ) -> Result<OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurResponse, E>;

    /// OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistrati - POST /system/console/configMgr/org.apache.jackrabbit.oak.security.internal.SecurityProviderRegistration
    async fn org_apache_jackrabbit_oak_security_internal_security_provider_registrati(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiQueryParams,
    ) -> Result<OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiResponse, E>;

    /// OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeName - POST /system/console/configMgr/org.apache.jackrabbit.oak.security.user.RandomAuthorizableNodeName
    async fn org_apache_jackrabbit_oak_security_user_random_authorizable_node_name(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameQueryParams,
    ) -> Result<OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameResponse, E>;

    /// OrgApacheJackrabbitOakSecurityUserUserConfigurationImpl - POST /system/console/configMgr/org.apache.jackrabbit.oak.security.user.UserConfigurationImpl
    async fn org_apache_jackrabbit_oak_security_user_user_configuration_impl(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::OrgApacheJackrabbitOakSecurityUserUserConfigurationImplQueryParams,
    ) -> Result<OrgApacheJackrabbitOakSecurityUserUserConfigurationImplResponse, E>;

    /// OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreService - POST /system/console/configMgr/org.apache.jackrabbit.oak.segment.azure.AzureSegmentStoreService
    async fn org_apache_jackrabbit_oak_segment_azure_azure_segment_store_service(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceQueryParams,
    ) -> Result<OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceResponse, E>;

    /// OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactory - POST /system/console/configMgr/org.apache.jackrabbit.oak.segment.SegmentNodeStoreFactory
    async fn org_apache_jackrabbit_oak_segment_segment_node_store_factory(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryQueryParams,
    ) -> Result<OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryResponse, E>;

    /// OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorService - POST /system/console/configMgr/org.apache.jackrabbit.oak.segment.SegmentNodeStoreMonitorService
    async fn org_apache_jackrabbit_oak_segment_segment_node_store_monitor_service(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceQueryParams,
    ) -> Result<OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceResponse, E>;

    /// OrgApacheJackrabbitOakSegmentSegmentNodeStoreService - POST /system/console/configMgr/org.apache.jackrabbit.oak.segment.SegmentNodeStoreService
    async fn org_apache_jackrabbit_oak_segment_segment_node_store_service(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceQueryParams,
    ) -> Result<OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceResponse, E>;

    /// OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreService - POST /system/console/configMgr/org.apache.jackrabbit.oak.segment.standby.store.StandbyStoreService
    async fn org_apache_jackrabbit_oak_segment_standby_store_standby_store_service(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceQueryParams,
    ) -> Result<OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceResponse, E>;

    /// OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDe - POST /system/console/configMgr/org.apache.jackrabbit.oak.spi.security.authentication.external.impl.DefaultSyncHandler
    async fn org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeQueryParams,
    ) -> Result<OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeResponse, E>;

    /// OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplEx - POST /system/console/configMgr/org.apache.jackrabbit.oak.spi.security.authentication.external.impl.ExternalLoginModuleFactory
    async fn org_apache_jackrabbit_oak_spi_security_authentication_external_impl_ex(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExQueryParams,
    ) -> Result<OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExResponse, E>;

    /// OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPr - POST /system/console/configMgr/org.apache.jackrabbit.oak.spi.security.authentication.external.impl.principal.ExternalPrincipalConfiguration
    async fn org_apache_jackrabbit_oak_spi_security_authentication_external_impl_pr(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrQueryParams,
    ) -> Result<OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrResponse, E>;

    /// OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfi - POST /system/console/configMgr/org.apache.jackrabbit.oak.spi.security.authorization.cug.impl.CugConfiguration
    async fn org_apache_jackrabbit_oak_spi_security_authorization_cug_impl_cug_confi(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiQueryParams,
    ) -> Result<OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiResponse, E>;

    /// OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExclu - POST /system/console/configMgr/org.apache.jackrabbit.oak.spi.security.authorization.cug.impl.CugExcludeImpl
    async fn org_apache_jackrabbit_oak_spi_security_authorization_cug_impl_cug_exclu(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluQueryParams,
    ) -> Result<OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluResponse, E>;

    /// OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizable - POST /system/console/configMgr/org.apache.jackrabbit.oak.spi.security.user.action.DefaultAuthorizableActionProvider
    async fn org_apache_jackrabbit_oak_spi_security_user_action_default_authorizable(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableQueryParams,
    ) -> Result<OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableResponse, E>;

    /// OrgApacheJackrabbitVaultPackagingImplPackagingImpl - POST /system/console/configMgr/org.apache.jackrabbit.vault.packaging.impl.PackagingImpl
    async fn org_apache_jackrabbit_vault_packaging_impl_packaging_impl(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::OrgApacheJackrabbitVaultPackagingImplPackagingImplQueryParams,
    ) -> Result<OrgApacheJackrabbitVaultPackagingImplPackagingImplResponse, E>;

    /// OrgApacheJackrabbitVaultPackagingRegistryImplFsPackageRegistry - POST /system/console/configMgr/org.apache.jackrabbit.vault.packaging.registry.impl.FSPackageRegistry
    async fn org_apache_jackrabbit_vault_packaging_registry_impl_fs_package_registry(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::OrgApacheJackrabbitVaultPackagingRegistryImplFsPackageRegistryQueryParams,
    ) -> Result<OrgApacheJackrabbitVaultPackagingRegistryImplFsPackageRegistryResponse, E>;

    /// OrgApacheSlingAuthCoreImplLogoutServlet - POST /system/console/configMgr/org.apache.sling.auth.core.impl.LogoutServlet
    async fn org_apache_sling_auth_core_impl_logout_servlet(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::OrgApacheSlingAuthCoreImplLogoutServletQueryParams,
    ) -> Result<OrgApacheSlingAuthCoreImplLogoutServletResponse, E>;

    /// OrgApacheSlingCaconfigImplConfigurationBindingsValueProvider - POST /system/console/configMgr/org.apache.sling.caconfig.impl.ConfigurationBindingsValueProvider
    async fn org_apache_sling_caconfig_impl_configuration_bindings_value_provider(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderQueryParams,
    ) -> Result<OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderResponse, E>;

    /// OrgApacheSlingCaconfigImplConfigurationResolverImpl - POST /system/console/configMgr/org.apache.sling.caconfig.impl.ConfigurationResolverImpl
    async fn org_apache_sling_caconfig_impl_configuration_resolver_impl(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::OrgApacheSlingCaconfigImplConfigurationResolverImplQueryParams,
    ) -> Result<OrgApacheSlingCaconfigImplConfigurationResolverImplResponse, E>;

    /// OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStra - POST /system/console/configMgr/org.apache.sling.caconfig.impl.def.DefaultConfigurationInheritanceStrategy
    async fn org_apache_sling_caconfig_impl_def_default_configuration_inheritance_stra(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraQueryParams,
    ) -> Result<OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraResponse, E>;

    /// OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStra - POST /system/console/configMgr/org.apache.sling.caconfig.impl.def.DefaultConfigurationPersistenceStrategy
    async fn org_apache_sling_caconfig_impl_def_default_configuration_persistence_stra(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraQueryParams,
    ) -> Result<OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraResponse, E>;

    /// OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProvi - POST /system/console/configMgr/org.apache.sling.caconfig.impl.override.OsgiConfigurationOverrideProvider
    async fn org_apache_sling_caconfig_impl_override_osgi_configuration_override_provi(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviQueryParams,
    ) -> Result<OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviResponse, E>;

    /// OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOve - POST /system/console/configMgr/org.apache.sling.caconfig.impl.override.SystemPropertyConfigurationOverrideProvider
    async fn org_apache_sling_caconfig_impl_override_system_property_configuration_ove(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveQueryParams,
    ) -> Result<OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveResponse, E>;

    /// OrgApacheSlingCaconfigManagementImplConfigurationManagementSetti - POST /system/console/configMgr/org.apache.sling.caconfig.management.impl.ConfigurationManagementSettingsImpl
    async fn org_apache_sling_caconfig_management_impl_configuration_management_setti(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiQueryParams,
    ) -> Result<OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiResponse, E>;

    /// OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResour - POST /system/console/configMgr/org.apache.sling.caconfig.resource.impl.def.DefaultConfigurationResourceResolvingStrategy
    async fn org_apache_sling_caconfig_resource_impl_def_default_configuration_resour(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourQueryParams,
    ) -> Result<OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourResponse, E>;

    /// OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategy - POST /system/console/configMgr/org.apache.sling.caconfig.resource.impl.def.DefaultContextPathStrategy
    async fn org_apache_sling_caconfig_resource_impl_def_default_context_path_strategy(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyQueryParams,
    ) -> Result<OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyResponse, E>;

    /// OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParser - POST /system/console/configMgr/org.apache.sling.commons.html.internal.TagsoupHtmlParser
    async fn org_apache_sling_commons_html_internal_tagsoup_html_parser(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserQueryParams,
    ) -> Result<OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserResponse, E>;

    /// OrgApacheSlingCommonsLogLogManager - POST /system/console/configMgr/org.apache.sling.commons.log.LogManager
    async fn org_apache_sling_commons_log_log_manager(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::OrgApacheSlingCommonsLogLogManagerQueryParams,
    ) -> Result<OrgApacheSlingCommonsLogLogManagerResponse, E>;

    /// OrgApacheSlingCommonsLogLogManagerFactoryConfig - POST /system/console/configMgr/org.apache.sling.commons.log.LogManager.factory.config
    async fn org_apache_sling_commons_log_log_manager_factory_config(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::OrgApacheSlingCommonsLogLogManagerFactoryConfigQueryParams,
    ) -> Result<OrgApacheSlingCommonsLogLogManagerFactoryConfigResponse, E>;

    /// OrgApacheSlingCommonsLogLogManagerFactoryWriter - POST /system/console/configMgr/org.apache.sling.commons.log.LogManager.factory.writer
    async fn org_apache_sling_commons_log_log_manager_factory_writer(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::OrgApacheSlingCommonsLogLogManagerFactoryWriterQueryParams,
    ) -> Result<OrgApacheSlingCommonsLogLogManagerFactoryWriterResponse, E>;

    /// OrgApacheSlingCommonsMetricsInternalLogReporter - POST /system/console/configMgr/org.apache.sling.commons.metrics.internal.LogReporter
    async fn org_apache_sling_commons_metrics_internal_log_reporter(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::OrgApacheSlingCommonsMetricsInternalLogReporterQueryParams,
    ) -> Result<OrgApacheSlingCommonsMetricsInternalLogReporterResponse, E>;

    /// OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporter - POST /system/console/configMgr/org.apache.sling.commons.metrics.rrd4j.impl.CodahaleMetricsReporter
    async fn org_apache_sling_commons_metrics_rrd4j_impl_codahale_metrics_reporter(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterQueryParams,
    ) -> Result<OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterResponse, E>;

    /// OrgApacheSlingCommonsMimeInternalMimeTypeServiceImpl - POST /system/console/configMgr/org.apache.sling.commons.mime.internal.MimeTypeServiceImpl
    async fn org_apache_sling_commons_mime_internal_mime_type_service_impl(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplQueryParams,
    ) -> Result<OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplResponse, E>;

    /// OrgApacheSlingCommonsSchedulerImplQuartzScheduler - POST /system/console/configMgr/org.apache.sling.commons.scheduler.impl.QuartzScheduler
    async fn org_apache_sling_commons_scheduler_impl_quartz_scheduler(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::OrgApacheSlingCommonsSchedulerImplQuartzSchedulerQueryParams,
    ) -> Result<OrgApacheSlingCommonsSchedulerImplQuartzSchedulerResponse, E>;

    /// OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheck - POST /system/console/configMgr/org.apache.sling.commons.scheduler.impl.SchedulerHealthCheck
    async fn org_apache_sling_commons_scheduler_impl_scheduler_health_check(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckQueryParams,
    ) -> Result<OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckResponse, E>;

    /// OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactory - POST /system/console/configMgr/org.apache.sling.commons.threads.impl.DefaultThreadPool.factory
    async fn org_apache_sling_commons_threads_impl_default_thread_pool_factory(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryQueryParams,
    ) -> Result<OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryResponse, E>;

    /// OrgApacheSlingDatasourceDataSourceFactory - POST /system/console/configMgr/org.apache.sling.datasource.DataSourceFactory
    async fn org_apache_sling_datasource_data_source_factory(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::OrgApacheSlingDatasourceDataSourceFactoryQueryParams,
    ) -> Result<OrgApacheSlingDatasourceDataSourceFactoryResponse, E>;

    /// OrgApacheSlingDatasourceJndiDataSourceFactory - POST /system/console/configMgr/org.apache.sling.datasource.JNDIDataSourceFactory
    async fn org_apache_sling_datasource_jndi_data_source_factory(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::OrgApacheSlingDatasourceJndiDataSourceFactoryQueryParams,
    ) -> Result<OrgApacheSlingDatasourceJndiDataSourceFactoryResponse, E>;

    /// OrgApacheSlingDiscoveryOakConfig - POST /system/console/configMgr/org.apache.sling.discovery.oak.Config
    async fn org_apache_sling_discovery_oak_config(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::OrgApacheSlingDiscoveryOakConfigQueryParams,
    ) -> Result<OrgApacheSlingDiscoveryOakConfigResponse, E>;

    /// OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheck - POST /system/console/configMgr/org.apache.sling.discovery.oak.SynchronizedClocksHealthCheck
    async fn org_apache_sling_discovery_oak_synchronized_clocks_health_check(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckQueryParams,
    ) -> Result<OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckResponse, E>;

    /// OrgApacheSlingDistributionAgentImplForwardDistributionAgentFacto - POST /system/console/configMgr/org.apache.sling.distribution.agent.impl.ForwardDistributionAgentFactory
    async fn org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoQueryParams,
    ) -> Result<OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoResponse, E>;

    /// OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestA - POST /system/console/configMgr/org.apache.sling.distribution.agent.impl.PrivilegeDistributionRequestAuthorizationStrategyFactory
    async fn org_apache_sling_distribution_agent_impl_privilege_distribution_request_a(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAQueryParams,
    ) -> Result<OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAResponse, E>;

    /// OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactory - POST /system/console/configMgr/org.apache.sling.distribution.agent.impl.QueueDistributionAgentFactory
    async fn org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryQueryParams,
    ) -> Result<OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryResponse, E>;

    /// OrgApacheSlingDistributionAgentImplReverseDistributionAgentFacto - POST /system/console/configMgr/org.apache.sling.distribution.agent.impl.ReverseDistributionAgentFactory
    async fn org_apache_sling_distribution_agent_impl_reverse_distribution_agent_facto(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoQueryParams,
    ) -> Result<OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoResponse, E>;

    /// OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactor - POST /system/console/configMgr/org.apache.sling.distribution.agent.impl.SimpleDistributionAgentFactory
    async fn org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorQueryParams,
    ) -> Result<OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorResponse, E>;

    /// OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactory - POST /system/console/configMgr/org.apache.sling.distribution.agent.impl.SyncDistributionAgentFactory
    async fn org_apache_sling_distribution_agent_impl_sync_distribution_agent_factory(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryQueryParams,
    ) -> Result<OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryResponse, E>;

    /// OrgApacheSlingDistributionMonitorDistributionQueueHealthCheck - POST /system/console/configMgr/org.apache.sling.distribution.monitor.DistributionQueueHealthCheck
    async fn org_apache_sling_distribution_monitor_distribution_queue_health_check(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckQueryParams,
    ) -> Result<OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckResponse, E>;

    /// OrgApacheSlingDistributionPackagingImplExporterAgentDistributio - POST /system/console/configMgr/org.apache.sling.distribution.packaging.impl.exporter.AgentDistributionPackageExporterFactory
    async fn org_apache_sling_distribution_packaging_impl_exporter_agent_distributio(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::OrgApacheSlingDistributionPackagingImplExporterAgentDistributioQueryParams,
    ) -> Result<OrgApacheSlingDistributionPackagingImplExporterAgentDistributioResponse, E>;

    /// OrgApacheSlingDistributionPackagingImplExporterLocalDistributio - POST /system/console/configMgr/org.apache.sling.distribution.packaging.impl.exporter.LocalDistributionPackageExporterFactory
    async fn org_apache_sling_distribution_packaging_impl_exporter_local_distributio(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::OrgApacheSlingDistributionPackagingImplExporterLocalDistributioQueryParams,
    ) -> Result<OrgApacheSlingDistributionPackagingImplExporterLocalDistributioResponse, E>;

    /// OrgApacheSlingDistributionPackagingImplExporterRemoteDistributi - POST /system/console/configMgr/org.apache.sling.distribution.packaging.impl.exporter.RemoteDistributionPackageExporterFactory
    async fn org_apache_sling_distribution_packaging_impl_exporter_remote_distributi(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiQueryParams,
    ) -> Result<OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiResponse, E>;

    /// OrgApacheSlingDistributionPackagingImplImporterLocalDistributio - POST /system/console/configMgr/org.apache.sling.distribution.packaging.impl.importer.LocalDistributionPackageImporterFactory
    async fn org_apache_sling_distribution_packaging_impl_importer_local_distributio(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::OrgApacheSlingDistributionPackagingImplImporterLocalDistributioQueryParams,
    ) -> Result<OrgApacheSlingDistributionPackagingImplImporterLocalDistributioResponse, E>;

    /// OrgApacheSlingDistributionPackagingImplImporterRemoteDistributi - POST /system/console/configMgr/org.apache.sling.distribution.packaging.impl.importer.RemoteDistributionPackageImporterFactory
    async fn org_apache_sling_distribution_packaging_impl_importer_remote_distributi(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiQueryParams,
    ) -> Result<OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiResponse, E>;

    /// OrgApacheSlingDistributionPackagingImplImporterRepositoryDistri - POST /system/console/configMgr/org.apache.sling.distribution.packaging.impl.importer.RepositoryDistributionPackageImporterFactory
    async fn org_apache_sling_distribution_packaging_impl_importer_repository_distri(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriQueryParams,
    ) -> Result<OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriResponse, E>;

    /// OrgApacheSlingDistributionResourcesImplDistributionConfiguration - POST /system/console/configMgr/org.apache.sling.distribution.resources.impl.DistributionConfigurationResourceProviderFactory
    async fn org_apache_sling_distribution_resources_impl_distribution_configuration(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::OrgApacheSlingDistributionResourcesImplDistributionConfigurationQueryParams,
    ) -> Result<OrgApacheSlingDistributionResourcesImplDistributionConfigurationResponse, E>;

    /// OrgApacheSlingDistributionResourcesImplDistributionServiceResour - POST /system/console/configMgr/org.apache.sling.distribution.resources.impl.DistributionServiceResourceProviderFactory
    async fn org_apache_sling_distribution_resources_impl_distribution_service_resour(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::OrgApacheSlingDistributionResourcesImplDistributionServiceResourQueryParams,
    ) -> Result<OrgApacheSlingDistributionResourcesImplDistributionServiceResourResponse, E>;

    /// OrgApacheSlingDistributionSerializationImplDistributionPackageBu - POST /system/console/configMgr/org.apache.sling.distribution.serialization.impl.DistributionPackageBuilderFactory
    async fn org_apache_sling_distribution_serialization_impl_distribution_package_bu(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::OrgApacheSlingDistributionSerializationImplDistributionPackageBuQueryParams,
    ) -> Result<OrgApacheSlingDistributionSerializationImplDistributionPackageBuResponse, E>;

    /// OrgApacheSlingDistributionSerializationImplVltVaultDistribution - POST /system/console/configMgr/org.apache.sling.distribution.serialization.impl.vlt.VaultDistributionPackageBuilderFactory
    async fn org_apache_sling_distribution_serialization_impl_vlt_vault_distribution(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::OrgApacheSlingDistributionSerializationImplVltVaultDistributionQueryParams,
    ) -> Result<OrgApacheSlingDistributionSerializationImplVltVaultDistributionResponse, E>;

    /// OrgApacheSlingDistributionTransportImplUserCredentialsDistributi - POST /system/console/configMgr/org.apache.sling.distribution.transport.impl.UserCredentialsDistributionTransportSecretProvider
    async fn org_apache_sling_distribution_transport_impl_user_credentials_distributi(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::OrgApacheSlingDistributionTransportImplUserCredentialsDistributiQueryParams,
    ) -> Result<OrgApacheSlingDistributionTransportImplUserCredentialsDistributiResponse, E>;

    /// OrgApacheSlingDistributionTriggerImplDistributionEventDistribute - POST /system/console/configMgr/org.apache.sling.distribution.trigger.impl.DistributionEventDistributeDistributionTriggerFactory
    async fn org_apache_sling_distribution_trigger_impl_distribution_event_distribute(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::OrgApacheSlingDistributionTriggerImplDistributionEventDistributeQueryParams,
    ) -> Result<OrgApacheSlingDistributionTriggerImplDistributionEventDistributeResponse, E>;

    /// OrgApacheSlingDistributionTriggerImplJcrEventDistributionTrigger - POST /system/console/configMgr/org.apache.sling.distribution.trigger.impl.JcrEventDistributionTriggerFactory
    async fn org_apache_sling_distribution_trigger_impl_jcr_event_distribution_trigger(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerQueryParams,
    ) -> Result<OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerResponse, E>;

    /// OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributi - POST /system/console/configMgr/org.apache.sling.distribution.trigger.impl.PersistedJcrEventDistributionTriggerFactory
    async fn org_apache_sling_distribution_trigger_impl_persisted_jcr_event_distributi(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiQueryParams,
    ) -> Result<OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiResponse, E>;

    /// OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrig - POST /system/console/configMgr/org.apache.sling.distribution.trigger.impl.RemoteEventDistributionTriggerFactory
    async fn org_apache_sling_distribution_trigger_impl_remote_event_distribution_trig(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigQueryParams,
    ) -> Result<OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigResponse, E>;

    /// OrgApacheSlingDistributionTriggerImplResourceEventDistributionTr - POST /system/console/configMgr/org.apache.sling.distribution.trigger.impl.ResourceEventDistributionTriggerFactory
    async fn org_apache_sling_distribution_trigger_impl_resource_event_distribution_tr(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrQueryParams,
    ) -> Result<OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrResponse, E>;

    /// OrgApacheSlingDistributionTriggerImplScheduledDistributionTrigge - POST /system/console/configMgr/org.apache.sling.distribution.trigger.impl.ScheduledDistributionTriggerFactory
    async fn org_apache_sling_distribution_trigger_impl_scheduled_distribution_trigge(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeQueryParams,
    ) -> Result<OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeResponse, E>;

    /// OrgApacheSlingEngineImplAuthSlingAuthenticator - POST /system/console/configMgr/org.apache.sling.engine.impl.auth.SlingAuthenticator
    async fn org_apache_sling_engine_impl_auth_sling_authenticator(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::OrgApacheSlingEngineImplAuthSlingAuthenticatorQueryParams,
    ) -> Result<OrgApacheSlingEngineImplAuthSlingAuthenticatorResponse, E>;

    /// OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilter - POST /system/console/configMgr/org.apache.sling.engine.impl.debug.RequestProgressTrackerLogFilter
    async fn org_apache_sling_engine_impl_debug_request_progress_tracker_log_filter(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterQueryParams,
    ) -> Result<OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterResponse, E>;

    /// OrgApacheSlingEngineImplLogRequestLogger - POST /system/console/configMgr/org.apache.sling.engine.impl.log.RequestLogger
    async fn org_apache_sling_engine_impl_log_request_logger(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::OrgApacheSlingEngineImplLogRequestLoggerQueryParams,
    ) -> Result<OrgApacheSlingEngineImplLogRequestLoggerResponse, E>;

    /// OrgApacheSlingEngineImplLogRequestLoggerService - POST /system/console/configMgr/org.apache.sling.engine.impl.log.RequestLoggerService
    async fn org_apache_sling_engine_impl_log_request_logger_service(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::OrgApacheSlingEngineImplLogRequestLoggerServiceQueryParams,
    ) -> Result<OrgApacheSlingEngineImplLogRequestLoggerServiceResponse, E>;

    /// OrgApacheSlingEngineImplSlingMainServlet - POST /system/console/configMgr/org.apache.sling.engine.impl.SlingMainServlet
    async fn org_apache_sling_engine_impl_sling_main_servlet(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::OrgApacheSlingEngineImplSlingMainServletQueryParams,
    ) -> Result<OrgApacheSlingEngineImplSlingMainServletResponse, E>;

    /// OrgApacheSlingEngineParameters - POST /system/console/configMgr/org.apache.sling.engine.parameters
    async fn org_apache_sling_engine_parameters(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::OrgApacheSlingEngineParametersQueryParams,
    ) -> Result<OrgApacheSlingEngineParametersResponse, E>;

    /// OrgApacheSlingEventImplEventingThreadPool - POST /system/console/configMgr/org.apache.sling.event.impl.EventingThreadPool
    async fn org_apache_sling_event_impl_eventing_thread_pool(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::OrgApacheSlingEventImplEventingThreadPoolQueryParams,
    ) -> Result<OrgApacheSlingEventImplEventingThreadPoolResponse, E>;

    /// OrgApacheSlingEventImplJobsDefaultJobManager - POST /system/console/configMgr/org.apache.sling.event.impl.jobs.DefaultJobManager
    async fn org_apache_sling_event_impl_jobs_default_job_manager(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::OrgApacheSlingEventImplJobsDefaultJobManagerQueryParams,
    ) -> Result<OrgApacheSlingEventImplJobsDefaultJobManagerResponse, E>;

    /// OrgApacheSlingEventImplJobsJcrPersistenceHandler - POST /system/console/configMgr/org.apache.sling.event.impl.jobs.jcr.PersistenceHandler
    async fn org_apache_sling_event_impl_jobs_jcr_persistence_handler(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::OrgApacheSlingEventImplJobsJcrPersistenceHandlerQueryParams,
    ) -> Result<OrgApacheSlingEventImplJobsJcrPersistenceHandlerResponse, E>;

    /// OrgApacheSlingEventImplJobsJobConsumerManager - POST /system/console/configMgr/org.apache.sling.event.impl.jobs.JobConsumerManager
    async fn org_apache_sling_event_impl_jobs_job_consumer_manager(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::OrgApacheSlingEventImplJobsJobConsumerManagerQueryParams,
    ) -> Result<OrgApacheSlingEventImplJobsJobConsumerManagerResponse, E>;

    /// OrgApacheSlingEventJobsQueueConfiguration - POST /system/console/configMgr/org.apache.sling.event.jobs.QueueConfiguration
    async fn org_apache_sling_event_jobs_queue_configuration(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::OrgApacheSlingEventJobsQueueConfigurationQueryParams,
    ) -> Result<OrgApacheSlingEventJobsQueueConfigurationResponse, E>;

    /// OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingW - POST /system/console/configMgr/org.apache.sling.extensions.webconsolesecurityprovider.internal.SlingWebConsoleSecurityProvider
    async fn org_apache_sling_extensions_webconsolesecurityprovider_internal_sling_w(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWQueryParams,
    ) -> Result<OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWResponse, E>;

    /// OrgApacheSlingFeatureflagsFeature - POST /system/console/configMgr/org.apache.sling.featureflags.Feature
    async fn org_apache_sling_featureflags_feature(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::OrgApacheSlingFeatureflagsFeatureQueryParams,
    ) -> Result<OrgApacheSlingFeatureflagsFeatureResponse, E>;

    /// OrgApacheSlingFeatureflagsImplConfiguredFeature - POST /system/console/configMgr/org.apache.sling.featureflags.impl.ConfiguredFeature
    async fn org_apache_sling_featureflags_impl_configured_feature(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::OrgApacheSlingFeatureflagsImplConfiguredFeatureQueryParams,
    ) -> Result<OrgApacheSlingFeatureflagsImplConfiguredFeatureResponse, E>;

    /// OrgApacheSlingHapiImplHApiUtilImpl - POST /system/console/configMgr/org.apache.sling.hapi.impl.HApiUtilImpl
    async fn org_apache_sling_hapi_impl_h_api_util_impl(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::OrgApacheSlingHapiImplHApiUtilImplQueryParams,
    ) -> Result<OrgApacheSlingHapiImplHApiUtilImplResponse, E>;

    /// OrgApacheSlingHcCoreImplCompositeHealthCheck - POST /system/console/configMgr/org.apache.sling.hc.core.impl.CompositeHealthCheck
    async fn org_apache_sling_hc_core_impl_composite_health_check(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::OrgApacheSlingHcCoreImplCompositeHealthCheckQueryParams,
    ) -> Result<OrgApacheSlingHcCoreImplCompositeHealthCheckResponse, E>;

    /// OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImpl - POST /system/console/configMgr/org.apache.sling.hc.core.impl.executor.HealthCheckExecutorImpl
    async fn org_apache_sling_hc_core_impl_executor_health_check_executor_impl(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplQueryParams,
    ) -> Result<OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplResponse, E>;

    /// OrgApacheSlingHcCoreImplJmxAttributeHealthCheck - POST /system/console/configMgr/org.apache.sling.hc.core.impl.JmxAttributeHealthCheck
    async fn org_apache_sling_hc_core_impl_jmx_attribute_health_check(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::OrgApacheSlingHcCoreImplJmxAttributeHealthCheckQueryParams,
    ) -> Result<OrgApacheSlingHcCoreImplJmxAttributeHealthCheckResponse, E>;

    /// OrgApacheSlingHcCoreImplScriptableHealthCheck - POST /system/console/configMgr/org.apache.sling.hc.core.impl.ScriptableHealthCheck
    async fn org_apache_sling_hc_core_impl_scriptable_health_check(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::OrgApacheSlingHcCoreImplScriptableHealthCheckQueryParams,
    ) -> Result<OrgApacheSlingHcCoreImplScriptableHealthCheckResponse, E>;

    /// OrgApacheSlingHcCoreImplServletHealthCheckExecutorServlet - POST /system/console/configMgr/org.apache.sling.hc.core.impl.servlet.HealthCheckExecutorServlet
    async fn org_apache_sling_hc_core_impl_servlet_health_check_executor_servlet(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletQueryParams,
    ) -> Result<OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletResponse, E>;

    /// OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializer - POST /system/console/configMgr/org.apache.sling.hc.core.impl.servlet.ResultTxtVerboseSerializer
    async fn org_apache_sling_hc_core_impl_servlet_result_txt_verbose_serializer(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerQueryParams,
    ) -> Result<OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerResponse, E>;

    /// OrgApacheSlingI18nImplI18NFilter - POST /system/console/configMgr/org.apache.sling.i18n.impl.I18NFilter
    async fn org_apache_sling_i18n_impl_i18_n_filter(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::OrgApacheSlingI18nImplI18NFilterQueryParams,
    ) -> Result<OrgApacheSlingI18nImplI18NFilterResponse, E>;

    /// OrgApacheSlingI18nImplJcrResourceBundleProvider - POST /system/console/configMgr/org.apache.sling.i18n.impl.JcrResourceBundleProvider
    async fn org_apache_sling_i18n_impl_jcr_resource_bundle_provider(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::OrgApacheSlingI18nImplJcrResourceBundleProviderQueryParams,
    ) -> Result<OrgApacheSlingI18nImplJcrResourceBundleProviderResponse, E>;

    /// OrgApacheSlingInstallerProviderJcrImplJcrInstaller - POST /system/console/configMgr/org.apache.sling.installer.provider.jcr.impl.JcrInstaller
    async fn org_apache_sling_installer_provider_jcr_impl_jcr_installer(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::OrgApacheSlingInstallerProviderJcrImplJcrInstallerQueryParams,
    ) -> Result<OrgApacheSlingInstallerProviderJcrImplJcrInstallerResponse, E>;

    /// OrgApacheSlingJcrBaseInternalLoginAdminWhitelist - POST /system/console/configMgr/org.apache.sling.jcr.base.internal.LoginAdminWhitelist
    async fn org_apache_sling_jcr_base_internal_login_admin_whitelist(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::OrgApacheSlingJcrBaseInternalLoginAdminWhitelistQueryParams,
    ) -> Result<OrgApacheSlingJcrBaseInternalLoginAdminWhitelistResponse, E>;

    /// OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragment - POST /system/console/configMgr/org.apache.sling.jcr.base.internal.LoginAdminWhitelist.fragment
    async fn org_apache_sling_jcr_base_internal_login_admin_whitelist_fragment(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentQueryParams,
    ) -> Result<OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentResponse, E>;

    /// OrgApacheSlingJcrDavexImplServletsSlingDavExServlet - POST /system/console/configMgr/org.apache.sling.jcr.davex.impl.servlets.SlingDavExServlet
    async fn org_apache_sling_jcr_davex_impl_servlets_sling_dav_ex_servlet(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::OrgApacheSlingJcrDavexImplServletsSlingDavExServletQueryParams,
    ) -> Result<OrgApacheSlingJcrDavexImplServletsSlingDavExServletResponse, E>;

    /// OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupport - POST /system/console/configMgr/org.apache.sling.jcr.jackrabbit.server.JndiRegistrationSupport
    async fn org_apache_sling_jcr_jackrabbit_server_jndi_registration_support(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportQueryParams,
    ) -> Result<OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportResponse, E>;

    /// OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupport - POST /system/console/configMgr/org.apache.sling.jcr.jackrabbit.server.RmiRegistrationSupport
    async fn org_apache_sling_jcr_jackrabbit_server_rmi_registration_support(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportQueryParams,
    ) -> Result<OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportResponse, E>;

    /// OrgApacheSlingJcrRepoinitImplRepositoryInitializer - POST /system/console/configMgr/org.apache.sling.jcr.repoinit.impl.RepositoryInitializer
    async fn org_apache_sling_jcr_repoinit_impl_repository_initializer(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::OrgApacheSlingJcrRepoinitImplRepositoryInitializerQueryParams,
    ) -> Result<OrgApacheSlingJcrRepoinitImplRepositoryInitializerResponse, E>;

    /// OrgApacheSlingJcrRepoinitRepositoryInitializer - POST /system/console/configMgr/org.apache.sling.jcr.repoinit.RepositoryInitializer
    async fn org_apache_sling_jcr_repoinit_repository_initializer(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::OrgApacheSlingJcrRepoinitRepositoryInitializerQueryParams,
    ) -> Result<OrgApacheSlingJcrRepoinitRepositoryInitializerResponse, E>;

    /// OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImpl - POST /system/console/configMgr/org.apache.sling.jcr.resource.internal.JcrResourceResolverFactoryImpl
    async fn org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplQueryParams,
    ) -> Result<OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplResponse, E>;

    /// OrgApacheSlingJcrResourceInternalJcrSystemUserValidator - POST /system/console/configMgr/org.apache.sling.jcr.resource.internal.JcrSystemUserValidator
    async fn org_apache_sling_jcr_resource_internal_jcr_system_user_validator(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorQueryParams,
    ) -> Result<OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorResponse, E>;

    /// OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactory - POST /system/console/configMgr/org.apache.sling.jcr.resourcesecurity.impl.ResourceAccessGateFactory
    async fn org_apache_sling_jcr_resourcesecurity_impl_resource_access_gate_factory(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryQueryParams,
    ) -> Result<OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryResponse, E>;

    /// OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerService - POST /system/console/configMgr/org.apache.sling.jcr.webdav.impl.handler.DefaultHandlerService
    async fn org_apache_sling_jcr_webdav_impl_handler_default_handler_service(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceQueryParams,
    ) -> Result<OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceResponse, E>;

    /// OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServic - POST /system/console/configMgr/org.apache.sling.jcr.webdav.impl.handler.DirListingExportHandlerService
    async fn org_apache_sling_jcr_webdav_impl_handler_dir_listing_export_handler_servic(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicQueryParams,
    ) -> Result<OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicResponse, E>;

    /// OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServlet - POST /system/console/configMgr/org.apache.sling.jcr.webdav.impl.servlets.SimpleWebDavServlet
    async fn org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletQueryParams,
    ) -> Result<OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletResponse, E>;

    /// OrgApacheSlingJmxProviderImplJmxResourceProvider - POST /system/console/configMgr/org.apache.sling.jmx.provider.impl.JMXResourceProvider
    async fn org_apache_sling_jmx_provider_impl_jmx_resource_provider(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::OrgApacheSlingJmxProviderImplJmxResourceProviderQueryParams,
    ) -> Result<OrgApacheSlingJmxProviderImplJmxResourceProviderResponse, E>;

    /// OrgApacheSlingModelsImplModelAdapterFactory - POST /system/console/configMgr/org.apache.sling.models.impl.ModelAdapterFactory
    async fn org_apache_sling_models_impl_model_adapter_factory(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::OrgApacheSlingModelsImplModelAdapterFactoryQueryParams,
    ) -> Result<OrgApacheSlingModelsImplModelAdapterFactoryResponse, E>;

    /// OrgApacheSlingModelsJacksonexporterImplResourceModuleProvider - POST /system/console/configMgr/org.apache.sling.models.jacksonexporter.impl.ResourceModuleProvider
    async fn org_apache_sling_models_jacksonexporter_impl_resource_module_provider(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderQueryParams,
    ) -> Result<OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderResponse, E>;

    /// OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFacto - POST /system/console/configMgr/org.apache.sling.resource.inventory.impl.ResourceInventoryPrinterFactory
    async fn org_apache_sling_resource_inventory_impl_resource_inventory_printer_facto(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoQueryParams,
    ) -> Result<OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoResponse, E>;

    /// OrgApacheSlingResourcemergerImplMergedResourceProviderFactory - POST /system/console/configMgr/org.apache.sling.resourcemerger.impl.MergedResourceProviderFactory
    async fn org_apache_sling_resourcemerger_impl_merged_resource_provider_factory(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryQueryParams,
    ) -> Result<OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryResponse, E>;

    /// OrgApacheSlingResourcemergerPickerOverriding - POST /system/console/configMgr/org.apache.sling.resourcemerger.picker.overriding
    async fn org_apache_sling_resourcemerger_picker_overriding(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::OrgApacheSlingResourcemergerPickerOverridingQueryParams,
    ) -> Result<OrgApacheSlingResourcemergerPickerOverridingResponse, E>;

    /// OrgApacheSlingScriptingCoreImplScriptCacheImpl - POST /system/console/configMgr/org.apache.sling.scripting.core.impl.ScriptCacheImpl
    async fn org_apache_sling_scripting_core_impl_script_cache_impl(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::OrgApacheSlingScriptingCoreImplScriptCacheImplQueryParams,
    ) -> Result<OrgApacheSlingScriptingCoreImplScriptCacheImplResponse, E>;

    /// OrgApacheSlingScriptingCoreImplScriptingResourceResolverProvider - POST /system/console/configMgr/org.apache.sling.scripting.core.impl.ScriptingResourceResolverProviderImpl
    async fn org_apache_sling_scripting_core_impl_scripting_resource_resolver_provider(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderQueryParams,
    ) -> Result<OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderResponse, E>;

    /// OrgApacheSlingScriptingJavaImplJavaScriptEngineFactory - POST /system/console/configMgr/org.apache.sling.scripting.java.impl.JavaScriptEngineFactory
    async fn org_apache_sling_scripting_java_impl_java_script_engine_factory(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryQueryParams,
    ) -> Result<OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryResponse, E>;

    /// OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFa - POST /system/console/configMgr/org.apache.sling.scripting.javascript.internal.RhinoJavaScriptEngineFactory
    async fn org_apache_sling_scripting_javascript_internal_rhino_java_script_engine_fa(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaQueryParams,
    ) -> Result<OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaResponse, E>;

    /// OrgApacheSlingScriptingJspJspScriptEngineFactory - POST /system/console/configMgr/org.apache.sling.scripting.jsp.JspScriptEngineFactory
    async fn org_apache_sling_scripting_jsp_jsp_script_engine_factory(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::OrgApacheSlingScriptingJspJspScriptEngineFactoryQueryParams,
    ) -> Result<OrgApacheSlingScriptingJspJspScriptEngineFactoryResponse, E>;

    /// OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProv - POST /system/console/configMgr/org.apache.sling.scripting.sightly.js.impl.jsapi.SlyBindingsValuesProvider
    async fn org_apache_sling_scripting_sightly_js_impl_jsapi_sly_bindings_values_prov(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvQueryParams,
    ) -> Result<OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvResponse, E>;

    /// OrgApacheSlingSecurityImplContentDispositionFilter - POST /system/console/configMgr/org.apache.sling.security.impl.ContentDispositionFilter
    async fn org_apache_sling_security_impl_content_disposition_filter(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::OrgApacheSlingSecurityImplContentDispositionFilterQueryParams,
    ) -> Result<OrgApacheSlingSecurityImplContentDispositionFilterResponse, E>;

    /// OrgApacheSlingSecurityImplReferrerFilter - POST /system/console/configMgr/org.apache.sling.security.impl.ReferrerFilter
    async fn org_apache_sling_security_impl_referrer_filter(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::OrgApacheSlingSecurityImplReferrerFilterQueryParams,
    ) -> Result<OrgApacheSlingSecurityImplReferrerFilterResponse, E>;

    /// OrgApacheSlingServiceusermappingImplServiceUserMapperImpl - POST /system/console/configMgr/org.apache.sling.serviceusermapping.impl.ServiceUserMapperImpl
    async fn org_apache_sling_serviceusermapping_impl_service_user_mapper_impl(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::OrgApacheSlingServiceusermappingImplServiceUserMapperImplQueryParams,
    ) -> Result<OrgApacheSlingServiceusermappingImplServiceUserMapperImplResponse, E>;

    /// OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmended - POST /system/console/configMgr/org.apache.sling.serviceusermapping.impl.ServiceUserMapperImpl.amended
    async fn org_apache_sling_serviceusermapping_impl_service_user_mapper_impl_amended(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedQueryParams,
    ) -> Result<OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedResponse, E>;

    /// OrgApacheSlingServletsGetDefaultGetServlet - POST /system/console/configMgr/org.apache.sling.servlets.get.DefaultGetServlet
    async fn org_apache_sling_servlets_get_default_get_servlet(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::OrgApacheSlingServletsGetDefaultGetServletQueryParams,
    ) -> Result<OrgApacheSlingServletsGetDefaultGetServletResponse, E>;

    /// OrgApacheSlingServletsGetImplVersionVersionInfoServlet - POST /system/console/configMgr/org.apache.sling.servlets.get.impl.version.VersionInfoServlet
    async fn org_apache_sling_servlets_get_impl_version_version_info_servlet(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::OrgApacheSlingServletsGetImplVersionVersionInfoServletQueryParams,
    ) -> Result<OrgApacheSlingServletsGetImplVersionVersionInfoServletResponse, E>;

    /// OrgApacheSlingServletsPostImplHelperChunkCleanUpTask - POST /system/console/configMgr/org.apache.sling.servlets.post.impl.helper.ChunkCleanUpTask
    async fn org_apache_sling_servlets_post_impl_helper_chunk_clean_up_task(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskQueryParams,
    ) -> Result<OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskResponse, E>;

    /// OrgApacheSlingServletsPostImplSlingPostServlet - POST /system/console/configMgr/org.apache.sling.servlets.post.impl.SlingPostServlet
    async fn org_apache_sling_servlets_post_impl_sling_post_servlet(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::OrgApacheSlingServletsPostImplSlingPostServletQueryParams,
    ) -> Result<OrgApacheSlingServletsPostImplSlingPostServletResponse, E>;

    /// OrgApacheSlingServletsResolverSlingServletResolver - POST /system/console/configMgr/org.apache.sling.servlets.resolver.SlingServletResolver
    async fn org_apache_sling_servlets_resolver_sling_servlet_resolver(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::OrgApacheSlingServletsResolverSlingServletResolverQueryParams,
    ) -> Result<OrgApacheSlingServletsResolverSlingServletResolverResponse, E>;

    /// OrgApacheSlingSettingsImplSlingSettingsServiceImpl - POST /system/console/configMgr/org.apache.sling.settings.impl.SlingSettingsServiceImpl
    async fn org_apache_sling_settings_impl_sling_settings_service_impl(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::OrgApacheSlingSettingsImplSlingSettingsServiceImplQueryParams,
    ) -> Result<OrgApacheSlingSettingsImplSlingSettingsServiceImplResponse, E>;

    /// OrgApacheSlingStartupfilterImplStartupFilterImpl - POST /system/console/configMgr/org.apache.sling.startupfilter.impl.StartupFilterImpl
    async fn org_apache_sling_startupfilter_impl_startup_filter_impl(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::OrgApacheSlingStartupfilterImplStartupFilterImplQueryParams,
    ) -> Result<OrgApacheSlingStartupfilterImplStartupFilterImplResponse, E>;

    /// OrgApacheSlingTenantInternalTenantProviderImpl - POST /system/console/configMgr/org.apache.sling.tenant.internal.TenantProviderImpl
    async fn org_apache_sling_tenant_internal_tenant_provider_impl(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::OrgApacheSlingTenantInternalTenantProviderImplQueryParams,
    ) -> Result<OrgApacheSlingTenantInternalTenantProviderImplResponse, E>;

    /// OrgApacheSlingTracerInternalLogTracer - POST /system/console/configMgr/org.apache.sling.tracer.internal.LogTracer
    async fn org_apache_sling_tracer_internal_log_tracer(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::OrgApacheSlingTracerInternalLogTracerQueryParams,
    ) -> Result<OrgApacheSlingTracerInternalLogTracerResponse, E>;

    /// OrgApacheSlingXssImplXssFilterImpl - POST /system/console/configMgr/org.apache.sling.xss.impl.XSSFilterImpl
    async fn org_apache_sling_xss_impl_xss_filter_impl(
    &self,
    
    method: &Method,
    host: &Host,
    cookies: &CookieJar,
        claims: &Self::Claims,
      query_params: &models::OrgApacheSlingXssImplXssFilterImplQueryParams,
    ) -> Result<OrgApacheSlingXssImplXssFilterImplResponse, E>;
}
