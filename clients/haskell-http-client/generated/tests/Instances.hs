{-# OPTIONS_GHC -fno-warn-unused-imports #-}

module Instances where

import AdobeExperienceManagerOSGIConfig(AEM).Model
import AdobeExperienceManagerOSGIConfig(AEM).Core

import qualified Data.Aeson as A
import qualified Data.ByteString.Lazy as BL
import qualified Data.HashMap.Strict as HM
import qualified Data.Set as Set
import qualified Data.Text as T
import qualified Data.Time as TI
import qualified Data.Vector as V

import Control.Monad
import Data.Char (isSpace)
import Data.List (sort)
import Test.QuickCheck

import ApproxEq

instance Arbitrary T.Text where
  arbitrary = T.pack <$> arbitrary

instance Arbitrary TI.Day where
  arbitrary = TI.ModifiedJulianDay . (2000 +) <$> arbitrary
  shrink = (TI.ModifiedJulianDay <$>) . shrink . TI.toModifiedJulianDay

instance Arbitrary TI.UTCTime where
  arbitrary =
    TI.UTCTime <$> arbitrary <*> (TI.secondsToDiffTime <$> choose (0, 86401))

instance Arbitrary BL.ByteString where
    arbitrary = BL.pack <$> arbitrary
    shrink xs = BL.pack <$> shrink (BL.unpack xs)

instance Arbitrary ByteArray where
    arbitrary = ByteArray <$> arbitrary
    shrink (ByteArray xs) = ByteArray <$> shrink xs

instance Arbitrary Binary where
    arbitrary = Binary <$> arbitrary
    shrink (Binary xs) = Binary <$> shrink xs

instance Arbitrary DateTime where
    arbitrary = DateTime <$> arbitrary
    shrink (DateTime xs) = DateTime <$> shrink xs

instance Arbitrary Date where
    arbitrary = Date <$> arbitrary
    shrink (Date xs) = Date <$> shrink xs

-- | A naive Arbitrary instance for A.Value:
instance Arbitrary A.Value where
  arbitrary = frequency [(3, simpleTypes), (1, arrayTypes), (1, objectTypes)]
    where
      simpleTypes :: Gen A.Value
      simpleTypes =
        frequency
          [ (1, return A.Null)
          , (2, liftM A.Bool (arbitrary :: Gen Bool))
          , (2, liftM (A.Number . fromIntegral) (arbitrary :: Gen Int))
          , (2, liftM (A.String . T.pack) (arbitrary :: Gen String))
          ]
      mapF (k, v) = (T.pack k, v)
      simpleAndArrays = frequency [(1, sized sizedArray), (4, simpleTypes)]
      arrayTypes = sized sizedArray
      objectTypes = sized sizedObject
      sizedArray n = liftM (A.Array . V.fromList) $ replicateM n simpleTypes
      sizedObject n =
        liftM (A.object . map mapF) $
        replicateM n $ (,) <$> (arbitrary :: Gen String) <*> simpleAndArrays
    
-- | Checks if a given list has no duplicates in _O(n log n)_.
hasNoDups
  :: (Ord a)
  => [a] -> Bool
hasNoDups = go Set.empty
  where
    go _ [] = True
    go s (x:xs)
      | s' <- Set.insert x s
      , Set.size s' > Set.size s = go s' xs
      | otherwise = False

instance ApproxEq TI.Day where
  (=~) = (==)

-- * Models
 
instance Arbitrary AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationInfo where
  arbitrary =
    AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationInfo
      <$> arbitrary -- adaptiveFormAndInteractiveCommunicationWebChannelConfigurationInfoPid :: Maybe Text
      <*> arbitrary -- adaptiveFormAndInteractiveCommunicationWebChannelConfigurationInfoTitle :: Maybe Text
      <*> arbitrary -- adaptiveFormAndInteractiveCommunicationWebChannelConfigurationInfoDescription :: Maybe Text
      <*> arbitrary -- adaptiveFormAndInteractiveCommunicationWebChannelConfigurationInfoProperties :: Maybe AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties
    
instance Arbitrary AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties where
  arbitrary =
    AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties
      <$> arbitrary -- adaptiveFormAndInteractiveCommunicationWebChannelConfigurationPropertiesShowPlaceholder :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- adaptiveFormAndInteractiveCommunicationWebChannelConfigurationPropertiesMaximumCacheEntries :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- adaptiveFormAndInteractiveCommunicationWebChannelConfigurationPropertiesAfScriptingCompatversion :: Maybe ConfigNodePropertyDropDown
      <*> arbitrary -- adaptiveFormAndInteractiveCommunicationWebChannelConfigurationPropertiesMakeFileNameUnique :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- adaptiveFormAndInteractiveCommunicationWebChannelConfigurationPropertiesGeneratingCompliantData :: Maybe ConfigNodePropertyBoolean
    
instance Arbitrary AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurInfo where
  arbitrary =
    AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurInfo
      <$> arbitrary -- adaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurInfoPid :: Maybe Text
      <*> arbitrary -- adaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurInfoTitle :: Maybe Text
      <*> arbitrary -- adaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurInfoDescription :: Maybe Text
      <*> arbitrary -- adaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurInfoProperties :: Maybe AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties
    
instance Arbitrary AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties where
  arbitrary =
    AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties
      <$> arbitrary -- adaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurPropertiesFontList :: Maybe ConfigNodePropertyArray
    
instance Arbitrary AnalyticsComponentQueryCacheServiceInfo where
  arbitrary =
    AnalyticsComponentQueryCacheServiceInfo
      <$> arbitrary -- analyticsComponentQueryCacheServiceInfoPid :: Maybe Text
      <*> arbitrary -- analyticsComponentQueryCacheServiceInfoTitle :: Maybe Text
      <*> arbitrary -- analyticsComponentQueryCacheServiceInfoDescription :: Maybe Text
      <*> arbitrary -- analyticsComponentQueryCacheServiceInfoProperties :: Maybe AnalyticsComponentQueryCacheServiceProperties
    
instance Arbitrary AnalyticsComponentQueryCacheServiceProperties where
  arbitrary =
    AnalyticsComponentQueryCacheServiceProperties
      <$> arbitrary -- analyticsComponentQueryCacheServicePropertiesCqAnalyticsComponentQueryCacheSize :: Maybe ConfigNodePropertyInteger
    
instance Arbitrary ApacheSlingHealthCheckResultHTMLSerializerInfo where
  arbitrary =
    ApacheSlingHealthCheckResultHTMLSerializerInfo
      <$> arbitrary -- apacheSlingHealthCheckResultHTMLSerializerInfoPid :: Maybe Text
      <*> arbitrary -- apacheSlingHealthCheckResultHTMLSerializerInfoTitle :: Maybe Text
      <*> arbitrary -- apacheSlingHealthCheckResultHTMLSerializerInfoDescription :: Maybe Text
      <*> arbitrary -- apacheSlingHealthCheckResultHTMLSerializerInfoProperties :: Maybe ApacheSlingHealthCheckResultHTMLSerializerProperties
    
instance Arbitrary ApacheSlingHealthCheckResultHTMLSerializerProperties where
  arbitrary =
    ApacheSlingHealthCheckResultHTMLSerializerProperties
      <$> arbitrary -- apacheSlingHealthCheckResultHTMLSerializerPropertiesStyleString :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationInfo where
  arbitrary =
    ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationInfo
      <$> arbitrary -- comAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationInfoProperties :: Maybe ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties
    
instance Arbitrary ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties where
  arbitrary =
    ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties
      <$> arbitrary -- comAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationPropertiesFormsManagerConfigIncludeOotbTemplates :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- comAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationPropertiesFormsManagerConfigIncludeDeprecatedTemplates :: Maybe ConfigNodePropertyBoolean
    
instance Arbitrary ComAdobeAemTransactionCoreImplTransactionRecorderInfo where
  arbitrary =
    ComAdobeAemTransactionCoreImplTransactionRecorderInfo
      <$> arbitrary -- comAdobeAemTransactionCoreImplTransactionRecorderInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeAemTransactionCoreImplTransactionRecorderInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeAemTransactionCoreImplTransactionRecorderInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeAemTransactionCoreImplTransactionRecorderInfoProperties :: Maybe ComAdobeAemTransactionCoreImplTransactionRecorderProperties
    
instance Arbitrary ComAdobeAemTransactionCoreImplTransactionRecorderProperties where
  arbitrary =
    ComAdobeAemTransactionCoreImplTransactionRecorderProperties
      <$> arbitrary -- comAdobeAemTransactionCoreImplTransactionRecorderPropertiesIsTransactionRecordingEnabled :: Maybe ConfigNodePropertyBoolean
    
instance Arbitrary ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCInfo where
  arbitrary =
    ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCInfo
      <$> arbitrary -- comAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCInfoProperties :: Maybe ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCProperties
    
instance Arbitrary ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCProperties where
  arbitrary =
    ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCProperties
      <$> arbitrary -- comAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCPropertiesHcName :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCPropertiesHcTags :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCPropertiesHcMbeanName :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCInfo where
  arbitrary =
    ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCInfo
      <$> arbitrary -- comAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCInfoProperties :: Maybe ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties
    
instance Arbitrary ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties where
  arbitrary =
    ComAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties
      <$> arbitrary -- comAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCPropertiesHcName :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCPropertiesHcTags :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCPropertiesHcMbeanName :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplInfo where
  arbitrary =
    ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplInfo
      <$> arbitrary -- comAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplInfoProperties :: Maybe ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties
      <*> arbitrary -- comAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplInfoBundleLocation :: Maybe Text
      <*> arbitrary -- comAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplInfoServiceLocation :: Maybe Text
    
instance Arbitrary ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties where
  arbitrary =
    ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties
      <$> arbitrary -- comAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplPropertiesPreUpgradeMaintenanceTasks :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplPropertiesPreUpgradeHcTags :: Maybe ConfigNodePropertyArray
    
instance Arbitrary ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplInfo where
  arbitrary =
    ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplInfo
      <$> arbitrary -- comAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplInfoProperties :: Maybe ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties
    
instance Arbitrary ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties where
  arbitrary =
    ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties
      <$> arbitrary -- comAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplPropertiesRootPath :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplPropertiesFixInconsistencies :: Maybe ConfigNodePropertyBoolean
    
instance Arbitrary ComAdobeCqAccountApiAccountManagementServiceInfo where
  arbitrary =
    ComAdobeCqAccountApiAccountManagementServiceInfo
      <$> arbitrary -- comAdobeCqAccountApiAccountManagementServiceInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeCqAccountApiAccountManagementServiceInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeCqAccountApiAccountManagementServiceInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeCqAccountApiAccountManagementServiceInfoProperties :: Maybe ComAdobeCqAccountApiAccountManagementServiceProperties
      <*> arbitrary -- comAdobeCqAccountApiAccountManagementServiceInfoAdditionalProperties :: Maybe Text
      <*> arbitrary -- comAdobeCqAccountApiAccountManagementServiceInfoBundleLocation :: Maybe Text
      <*> arbitrary -- comAdobeCqAccountApiAccountManagementServiceInfoServiceLocation :: Maybe Text
    
instance Arbitrary ComAdobeCqAccountApiAccountManagementServiceProperties where
  arbitrary =
    ComAdobeCqAccountApiAccountManagementServiceProperties
      <$> arbitrary -- comAdobeCqAccountApiAccountManagementServicePropertiesCqAccountmanagerTokenValidityPeriod :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comAdobeCqAccountApiAccountManagementServicePropertiesCqAccountmanagerConfigRequestnewaccountMail :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeCqAccountApiAccountManagementServicePropertiesCqAccountmanagerConfigRequestnewpwdMail :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComAdobeCqAccountImplAccountManagementServletInfo where
  arbitrary =
    ComAdobeCqAccountImplAccountManagementServletInfo
      <$> arbitrary -- comAdobeCqAccountImplAccountManagementServletInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeCqAccountImplAccountManagementServletInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeCqAccountImplAccountManagementServletInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeCqAccountImplAccountManagementServletInfoProperties :: Maybe ComAdobeCqAccountImplAccountManagementServletProperties
    
instance Arbitrary ComAdobeCqAccountImplAccountManagementServletProperties where
  arbitrary =
    ComAdobeCqAccountImplAccountManagementServletProperties
      <$> arbitrary -- comAdobeCqAccountImplAccountManagementServletPropertiesCqAccountmanagerConfigInformnewaccountMail :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeCqAccountImplAccountManagementServletPropertiesCqAccountmanagerConfigInformnewpwdMail :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComAdobeCqAddressImplLocationLocationListServletInfo where
  arbitrary =
    ComAdobeCqAddressImplLocationLocationListServletInfo
      <$> arbitrary -- comAdobeCqAddressImplLocationLocationListServletInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeCqAddressImplLocationLocationListServletInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeCqAddressImplLocationLocationListServletInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeCqAddressImplLocationLocationListServletInfoProperties :: Maybe ComAdobeCqAddressImplLocationLocationListServletProperties
    
instance Arbitrary ComAdobeCqAddressImplLocationLocationListServletProperties where
  arbitrary =
    ComAdobeCqAddressImplLocationLocationListServletProperties
      <$> arbitrary -- comAdobeCqAddressImplLocationLocationListServletPropertiesCqAddressLocationDefaultMaxResults :: Maybe ConfigNodePropertyInteger
    
instance Arbitrary ComAdobeCqAuditPurgeDamInfo where
  arbitrary =
    ComAdobeCqAuditPurgeDamInfo
      <$> arbitrary -- comAdobeCqAuditPurgeDamInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeCqAuditPurgeDamInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeCqAuditPurgeDamInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeCqAuditPurgeDamInfoProperties :: Maybe ComAdobeCqAuditPurgeDamProperties
    
instance Arbitrary ComAdobeCqAuditPurgeDamProperties where
  arbitrary =
    ComAdobeCqAuditPurgeDamProperties
      <$> arbitrary -- comAdobeCqAuditPurgeDamPropertiesAuditlogRuleName :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeCqAuditPurgeDamPropertiesAuditlogRuleContentpath :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeCqAuditPurgeDamPropertiesAuditlogRuleMinimumage :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comAdobeCqAuditPurgeDamPropertiesAuditlogRuleTypes :: Maybe ConfigNodePropertyDropDown
    
instance Arbitrary ComAdobeCqAuditPurgePagesInfo where
  arbitrary =
    ComAdobeCqAuditPurgePagesInfo
      <$> arbitrary -- comAdobeCqAuditPurgePagesInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeCqAuditPurgePagesInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeCqAuditPurgePagesInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeCqAuditPurgePagesInfoProperties :: Maybe ComAdobeCqAuditPurgePagesProperties
    
instance Arbitrary ComAdobeCqAuditPurgePagesProperties where
  arbitrary =
    ComAdobeCqAuditPurgePagesProperties
      <$> arbitrary -- comAdobeCqAuditPurgePagesPropertiesAuditlogRuleName :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeCqAuditPurgePagesPropertiesAuditlogRuleContentpath :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeCqAuditPurgePagesPropertiesAuditlogRuleMinimumage :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comAdobeCqAuditPurgePagesPropertiesAuditlogRuleTypes :: Maybe ConfigNodePropertyDropDown
    
instance Arbitrary ComAdobeCqAuditPurgeReplicationInfo where
  arbitrary =
    ComAdobeCqAuditPurgeReplicationInfo
      <$> arbitrary -- comAdobeCqAuditPurgeReplicationInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeCqAuditPurgeReplicationInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeCqAuditPurgeReplicationInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeCqAuditPurgeReplicationInfoProperties :: Maybe ComAdobeCqAuditPurgeReplicationProperties
    
instance Arbitrary ComAdobeCqAuditPurgeReplicationProperties where
  arbitrary =
    ComAdobeCqAuditPurgeReplicationProperties
      <$> arbitrary -- comAdobeCqAuditPurgeReplicationPropertiesAuditlogRuleName :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeCqAuditPurgeReplicationPropertiesAuditlogRuleContentpath :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeCqAuditPurgeReplicationPropertiesAuditlogRuleMinimumage :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comAdobeCqAuditPurgeReplicationPropertiesAuditlogRuleTypes :: Maybe ConfigNodePropertyDropDown
    
instance Arbitrary ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterInfo where
  arbitrary =
    ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterInfo
      <$> arbitrary -- comAdobeCqCdnRewriterImplAWSCloudFrontRewriterInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeCqCdnRewriterImplAWSCloudFrontRewriterInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeCqCdnRewriterImplAWSCloudFrontRewriterInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeCqCdnRewriterImplAWSCloudFrontRewriterInfoProperties :: Maybe ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties
    
instance Arbitrary ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties where
  arbitrary =
    ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties
      <$> arbitrary -- comAdobeCqCdnRewriterImplAWSCloudFrontRewriterPropertiesServiceRanking :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comAdobeCqCdnRewriterImplAWSCloudFrontRewriterPropertiesKeypairId :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeCqCdnRewriterImplAWSCloudFrontRewriterPropertiesKeypairAlias :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeCqCdnRewriterImplAWSCloudFrontRewriterPropertiesCdnrewriterAttributes :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comAdobeCqCdnRewriterImplAWSCloudFrontRewriterPropertiesCdnRewriterDistributionDomain :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComAdobeCqCdnRewriterImplCDNConfigServiceImplInfo where
  arbitrary =
    ComAdobeCqCdnRewriterImplCDNConfigServiceImplInfo
      <$> arbitrary -- comAdobeCqCdnRewriterImplCDNConfigServiceImplInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeCqCdnRewriterImplCDNConfigServiceImplInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeCqCdnRewriterImplCDNConfigServiceImplInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeCqCdnRewriterImplCDNConfigServiceImplInfoProperties :: Maybe ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties
    
instance Arbitrary ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties where
  arbitrary =
    ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties
      <$> arbitrary -- comAdobeCqCdnRewriterImplCDNConfigServiceImplPropertiesCdnConfigDistributionDomain :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeCqCdnRewriterImplCDNConfigServiceImplPropertiesCdnConfigEnableRewriting :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- comAdobeCqCdnRewriterImplCDNConfigServiceImplPropertiesCdnConfigPathPrefixes :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comAdobeCqCdnRewriterImplCDNConfigServiceImplPropertiesCdnConfigCdnttl :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comAdobeCqCdnRewriterImplCDNConfigServiceImplPropertiesCdnConfigApplicationProtocol :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComAdobeCqCdnRewriterImplCDNRewriterInfo where
  arbitrary =
    ComAdobeCqCdnRewriterImplCDNRewriterInfo
      <$> arbitrary -- comAdobeCqCdnRewriterImplCDNRewriterInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeCqCdnRewriterImplCDNRewriterInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeCqCdnRewriterImplCDNRewriterInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeCqCdnRewriterImplCDNRewriterInfoProperties :: Maybe ComAdobeCqCdnRewriterImplCDNRewriterProperties
    
instance Arbitrary ComAdobeCqCdnRewriterImplCDNRewriterProperties where
  arbitrary =
    ComAdobeCqCdnRewriterImplCDNRewriterProperties
      <$> arbitrary -- comAdobeCqCdnRewriterImplCDNRewriterPropertiesServiceRanking :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comAdobeCqCdnRewriterImplCDNRewriterPropertiesCdnrewriterAttributes :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comAdobeCqCdnRewriterImplCDNRewriterPropertiesCdnRewriterDistributionDomain :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleInfo where
  arbitrary =
    ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleInfo
      <$> arbitrary -- comAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleInfoProperties :: Maybe ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties
    
instance Arbitrary ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties where
  arbitrary =
    ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties
      <$> arbitrary -- comAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandlePropertiesFlushAgents :: Maybe ConfigNodePropertyArray
    
instance Arbitrary ComAdobeCqCommerceImplAssetDynamicImageHandlerInfo where
  arbitrary =
    ComAdobeCqCommerceImplAssetDynamicImageHandlerInfo
      <$> arbitrary -- comAdobeCqCommerceImplAssetDynamicImageHandlerInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeCqCommerceImplAssetDynamicImageHandlerInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeCqCommerceImplAssetDynamicImageHandlerInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeCqCommerceImplAssetDynamicImageHandlerInfoProperties :: Maybe ComAdobeCqCommerceImplAssetDynamicImageHandlerProperties
    
instance Arbitrary ComAdobeCqCommerceImplAssetDynamicImageHandlerProperties where
  arbitrary =
    ComAdobeCqCommerceImplAssetDynamicImageHandlerProperties
      <$> arbitrary -- comAdobeCqCommerceImplAssetDynamicImageHandlerPropertiesCqCommerceAssetHandlerActive :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- comAdobeCqCommerceImplAssetDynamicImageHandlerPropertiesCqCommerceAssetHandlerName :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplInfo where
  arbitrary =
    ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplInfo
      <$> arbitrary -- comAdobeCqCommerceImplAssetProductAssetHandlerProviderImplInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeCqCommerceImplAssetProductAssetHandlerProviderImplInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeCqCommerceImplAssetProductAssetHandlerProviderImplInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeCqCommerceImplAssetProductAssetHandlerProviderImplInfoProperties :: Maybe ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties
    
instance Arbitrary ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties where
  arbitrary =
    ComAdobeCqCommerceImplAssetProductAssetHandlerProviderImplProperties
      <$> arbitrary -- comAdobeCqCommerceImplAssetProductAssetHandlerProviderImplPropertiesCqCommerceAssetHandlerFallback :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComAdobeCqCommerceImplAssetStaticImageHandlerInfo where
  arbitrary =
    ComAdobeCqCommerceImplAssetStaticImageHandlerInfo
      <$> arbitrary -- comAdobeCqCommerceImplAssetStaticImageHandlerInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeCqCommerceImplAssetStaticImageHandlerInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeCqCommerceImplAssetStaticImageHandlerInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeCqCommerceImplAssetStaticImageHandlerInfoProperties :: Maybe ComAdobeCqCommerceImplAssetStaticImageHandlerProperties
    
instance Arbitrary ComAdobeCqCommerceImplAssetStaticImageHandlerProperties where
  arbitrary =
    ComAdobeCqCommerceImplAssetStaticImageHandlerProperties
      <$> arbitrary -- comAdobeCqCommerceImplAssetStaticImageHandlerPropertiesCqCommerceAssetHandlerActive :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- comAdobeCqCommerceImplAssetStaticImageHandlerPropertiesCqCommerceAssetHandlerName :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComAdobeCqCommerceImplAssetVideoHandlerInfo where
  arbitrary =
    ComAdobeCqCommerceImplAssetVideoHandlerInfo
      <$> arbitrary -- comAdobeCqCommerceImplAssetVideoHandlerInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeCqCommerceImplAssetVideoHandlerInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeCqCommerceImplAssetVideoHandlerInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeCqCommerceImplAssetVideoHandlerInfoProperties :: Maybe ComAdobeCqCommerceImplAssetVideoHandlerProperties
    
instance Arbitrary ComAdobeCqCommerceImplAssetVideoHandlerProperties where
  arbitrary =
    ComAdobeCqCommerceImplAssetVideoHandlerProperties
      <$> arbitrary -- comAdobeCqCommerceImplAssetVideoHandlerPropertiesCqCommerceAssetHandlerActive :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- comAdobeCqCommerceImplAssetVideoHandlerPropertiesCqCommerceAssetHandlerName :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComAdobeCqCommerceImplPromotionPromotionManagerImplInfo where
  arbitrary =
    ComAdobeCqCommerceImplPromotionPromotionManagerImplInfo
      <$> arbitrary -- comAdobeCqCommerceImplPromotionPromotionManagerImplInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeCqCommerceImplPromotionPromotionManagerImplInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeCqCommerceImplPromotionPromotionManagerImplInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeCqCommerceImplPromotionPromotionManagerImplInfoProperties :: Maybe ComAdobeCqCommerceImplPromotionPromotionManagerImplProperties
    
instance Arbitrary ComAdobeCqCommerceImplPromotionPromotionManagerImplProperties where
  arbitrary =
    ComAdobeCqCommerceImplPromotionPromotionManagerImplProperties
      <$> arbitrary -- comAdobeCqCommerceImplPromotionPromotionManagerImplPropertiesCqCommercePromotionRoot :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplInfo where
  arbitrary =
    ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplInfo
      <$> arbitrary -- comAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplInfoProperties :: Maybe ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties
    
instance Arbitrary ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties where
  arbitrary =
    ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties
      <$> arbitrary -- comAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplPropertiesCqCommerceCataloggeneratorBucketsize :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplPropertiesCqCommerceCataloggeneratorBucketname :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplPropertiesCqCommerceCataloggeneratorExcludedtemplateproperties :: Maybe ConfigNodePropertyArray
    
instance Arbitrary ComAdobeCqCommercePimImplPageEventListenerInfo where
  arbitrary =
    ComAdobeCqCommercePimImplPageEventListenerInfo
      <$> arbitrary -- comAdobeCqCommercePimImplPageEventListenerInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeCqCommercePimImplPageEventListenerInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeCqCommercePimImplPageEventListenerInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeCqCommercePimImplPageEventListenerInfoProperties :: Maybe ComAdobeCqCommercePimImplPageEventListenerProperties
    
instance Arbitrary ComAdobeCqCommercePimImplPageEventListenerProperties where
  arbitrary =
    ComAdobeCqCommercePimImplPageEventListenerProperties
      <$> arbitrary -- comAdobeCqCommercePimImplPageEventListenerPropertiesCqCommercePageeventlistenerEnabled :: Maybe ConfigNodePropertyBoolean
    
instance Arbitrary ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplInfo where
  arbitrary =
    ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplInfo
      <$> arbitrary -- comAdobeCqCommercePimImplProductfeedProductFeedServiceImplInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeCqCommercePimImplProductfeedProductFeedServiceImplInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeCqCommercePimImplProductfeedProductFeedServiceImplInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeCqCommercePimImplProductfeedProductFeedServiceImplInfoProperties :: Maybe ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties
    
instance Arbitrary ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties where
  arbitrary =
    ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties
      <$> arbitrary -- comAdobeCqCommercePimImplProductfeedProductFeedServiceImplPropertiesFeedGeneratorAlgorithm :: Maybe ConfigNodePropertyDropDown
    
instance Arbitrary ComAdobeCqContentinsightImplReportingServicesSettingsProviderInfo where
  arbitrary =
    ComAdobeCqContentinsightImplReportingServicesSettingsProviderInfo
      <$> arbitrary -- comAdobeCqContentinsightImplReportingServicesSettingsProviderInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeCqContentinsightImplReportingServicesSettingsProviderInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeCqContentinsightImplReportingServicesSettingsProviderInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeCqContentinsightImplReportingServicesSettingsProviderInfoProperties :: Maybe ComAdobeCqContentinsightImplReportingServicesSettingsProviderProperties
    
instance Arbitrary ComAdobeCqContentinsightImplReportingServicesSettingsProviderProperties where
  arbitrary =
    ComAdobeCqContentinsightImplReportingServicesSettingsProviderProperties
      <$> arbitrary -- comAdobeCqContentinsightImplReportingServicesSettingsProviderPropertiesReportingservicesUrl :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletInfo where
  arbitrary =
    ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletInfo
      <$> arbitrary -- comAdobeCqContentinsightImplServletsBrightEdgeProxyServletInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeCqContentinsightImplServletsBrightEdgeProxyServletInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeCqContentinsightImplServletsBrightEdgeProxyServletInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeCqContentinsightImplServletsBrightEdgeProxyServletInfoProperties :: Maybe ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletProperties
    
instance Arbitrary ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletProperties where
  arbitrary =
    ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletProperties
      <$> arbitrary -- comAdobeCqContentinsightImplServletsBrightEdgeProxyServletPropertiesBrightedgeUrl :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComAdobeCqContentinsightImplServletsReportingServicesProxyServleInfo where
  arbitrary =
    ComAdobeCqContentinsightImplServletsReportingServicesProxyServleInfo
      <$> arbitrary -- comAdobeCqContentinsightImplServletsReportingServicesProxyServleInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeCqContentinsightImplServletsReportingServicesProxyServleInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeCqContentinsightImplServletsReportingServicesProxyServleInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeCqContentinsightImplServletsReportingServicesProxyServleInfoProperties :: Maybe ComAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties
    
instance Arbitrary ComAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties where
  arbitrary =
    ComAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties
      <$> arbitrary -- comAdobeCqContentinsightImplServletsReportingServicesProxyServlePropertiesReportingservicesProxyWhitelist :: Maybe ConfigNodePropertyArray
    
instance Arbitrary ComAdobeCqDamCfmImplComponentComponentConfigImplInfo where
  arbitrary =
    ComAdobeCqDamCfmImplComponentComponentConfigImplInfo
      <$> arbitrary -- comAdobeCqDamCfmImplComponentComponentConfigImplInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeCqDamCfmImplComponentComponentConfigImplInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeCqDamCfmImplComponentComponentConfigImplInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeCqDamCfmImplComponentComponentConfigImplInfoProperties :: Maybe ComAdobeCqDamCfmImplComponentComponentConfigImplProperties
    
instance Arbitrary ComAdobeCqDamCfmImplComponentComponentConfigImplProperties where
  arbitrary =
    ComAdobeCqDamCfmImplComponentComponentConfigImplProperties
      <$> arbitrary -- comAdobeCqDamCfmImplComponentComponentConfigImplPropertiesDamCfmComponentResourceType :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeCqDamCfmImplComponentComponentConfigImplPropertiesDamCfmComponentFileReferenceProp :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeCqDamCfmImplComponentComponentConfigImplPropertiesDamCfmComponentElementsProp :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeCqDamCfmImplComponentComponentConfigImplPropertiesDamCfmComponentVariationProp :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComAdobeCqDamCfmImplConfFeatureConfigImplInfo where
  arbitrary =
    ComAdobeCqDamCfmImplConfFeatureConfigImplInfo
      <$> arbitrary -- comAdobeCqDamCfmImplConfFeatureConfigImplInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeCqDamCfmImplConfFeatureConfigImplInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeCqDamCfmImplConfFeatureConfigImplInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeCqDamCfmImplConfFeatureConfigImplInfoProperties :: Maybe ComAdobeCqDamCfmImplConfFeatureConfigImplProperties
    
instance Arbitrary ComAdobeCqDamCfmImplConfFeatureConfigImplProperties where
  arbitrary =
    ComAdobeCqDamCfmImplConfFeatureConfigImplProperties
      <$> arbitrary -- comAdobeCqDamCfmImplConfFeatureConfigImplPropertiesDamCfmResourceTypes :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comAdobeCqDamCfmImplConfFeatureConfigImplPropertiesDamCfmReferenceProperties :: Maybe ConfigNodePropertyArray
    
instance Arbitrary ComAdobeCqDamCfmImplContentRewriterAssetProcessorInfo where
  arbitrary =
    ComAdobeCqDamCfmImplContentRewriterAssetProcessorInfo
      <$> arbitrary -- comAdobeCqDamCfmImplContentRewriterAssetProcessorInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeCqDamCfmImplContentRewriterAssetProcessorInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeCqDamCfmImplContentRewriterAssetProcessorInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeCqDamCfmImplContentRewriterAssetProcessorInfoProperties :: Maybe ComAdobeCqDamCfmImplContentRewriterAssetProcessorProperties
    
instance Arbitrary ComAdobeCqDamCfmImplContentRewriterAssetProcessorProperties where
  arbitrary =
    ComAdobeCqDamCfmImplContentRewriterAssetProcessorProperties
      <$> arbitrary -- comAdobeCqDamCfmImplContentRewriterAssetProcessorPropertiesPipelineType :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComAdobeCqDamCfmImplContentRewriterParRangeFilterInfo where
  arbitrary =
    ComAdobeCqDamCfmImplContentRewriterParRangeFilterInfo
      <$> arbitrary -- comAdobeCqDamCfmImplContentRewriterParRangeFilterInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeCqDamCfmImplContentRewriterParRangeFilterInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeCqDamCfmImplContentRewriterParRangeFilterInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeCqDamCfmImplContentRewriterParRangeFilterInfoProperties :: Maybe ComAdobeCqDamCfmImplContentRewriterParRangeFilterProperties
    
instance Arbitrary ComAdobeCqDamCfmImplContentRewriterParRangeFilterProperties where
  arbitrary =
    ComAdobeCqDamCfmImplContentRewriterParRangeFilterProperties
      <$> arbitrary -- comAdobeCqDamCfmImplContentRewriterParRangeFilterPropertiesPipelineType :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComAdobeCqDamCfmImplContentRewriterPayloadFilterInfo where
  arbitrary =
    ComAdobeCqDamCfmImplContentRewriterPayloadFilterInfo
      <$> arbitrary -- comAdobeCqDamCfmImplContentRewriterPayloadFilterInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeCqDamCfmImplContentRewriterPayloadFilterInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeCqDamCfmImplContentRewriterPayloadFilterInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeCqDamCfmImplContentRewriterPayloadFilterInfoProperties :: Maybe ComAdobeCqDamCfmImplContentRewriterPayloadFilterProperties
    
instance Arbitrary ComAdobeCqDamCfmImplContentRewriterPayloadFilterProperties where
  arbitrary =
    ComAdobeCqDamCfmImplContentRewriterPayloadFilterProperties
      <$> arbitrary -- comAdobeCqDamCfmImplContentRewriterPayloadFilterPropertiesPipelineType :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComAdobeCqDamDmProcessImagePTiffManagerImplInfo where
  arbitrary =
    ComAdobeCqDamDmProcessImagePTiffManagerImplInfo
      <$> arbitrary -- comAdobeCqDamDmProcessImagePTiffManagerImplInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeCqDamDmProcessImagePTiffManagerImplInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeCqDamDmProcessImagePTiffManagerImplInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeCqDamDmProcessImagePTiffManagerImplInfoProperties :: Maybe ComAdobeCqDamDmProcessImagePTiffManagerImplProperties
    
instance Arbitrary ComAdobeCqDamDmProcessImagePTiffManagerImplProperties where
  arbitrary =
    ComAdobeCqDamDmProcessImagePTiffManagerImplProperties
      <$> arbitrary -- comAdobeCqDamDmProcessImagePTiffManagerImplPropertiesMaxMemory :: Maybe ConfigNodePropertyInteger
    
instance Arbitrary ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerInfo where
  arbitrary =
    ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerInfo
      <$> arbitrary -- comAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerInfoProperties :: Maybe ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties
    
instance Arbitrary ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties where
  arbitrary =
    ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties
      <$> arbitrary -- comAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerPropertiesDmreplicateonmodifyEnabled :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- comAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerPropertiesDmreplicateonmodifyForcesyncdeletes :: Maybe ConfigNodePropertyBoolean
    
instance Arbitrary ComAdobeCqDamMacSyncHelperImplMACSyncClientImplInfo where
  arbitrary =
    ComAdobeCqDamMacSyncHelperImplMACSyncClientImplInfo
      <$> arbitrary -- comAdobeCqDamMacSyncHelperImplMACSyncClientImplInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeCqDamMacSyncHelperImplMACSyncClientImplInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeCqDamMacSyncHelperImplMACSyncClientImplInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeCqDamMacSyncHelperImplMACSyncClientImplInfoProperties :: Maybe ComAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties
    
instance Arbitrary ComAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties where
  arbitrary =
    ComAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties
      <$> arbitrary -- comAdobeCqDamMacSyncHelperImplMACSyncClientImplPropertiesComAdobeDamMacSyncClientSoTimeout :: Maybe ConfigNodePropertyInteger
    
instance Arbitrary ComAdobeCqDamMacSyncImplDAMSyncServiceImplInfo where
  arbitrary =
    ComAdobeCqDamMacSyncImplDAMSyncServiceImplInfo
      <$> arbitrary -- comAdobeCqDamMacSyncImplDAMSyncServiceImplInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeCqDamMacSyncImplDAMSyncServiceImplInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeCqDamMacSyncImplDAMSyncServiceImplInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeCqDamMacSyncImplDAMSyncServiceImplInfoProperties :: Maybe ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties
    
instance Arbitrary ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties where
  arbitrary =
    ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties
      <$> arbitrary -- comAdobeCqDamMacSyncImplDAMSyncServiceImplPropertiesComAdobeCqDamMacSyncDamsyncserviceRegisteredPaths :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comAdobeCqDamMacSyncImplDAMSyncServiceImplPropertiesComAdobeCqDamMacSyncDamsyncserviceSyncRenditions :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- comAdobeCqDamMacSyncImplDAMSyncServiceImplPropertiesComAdobeCqDamMacSyncDamsyncserviceReplicateThreadWaitMs :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comAdobeCqDamMacSyncImplDAMSyncServiceImplPropertiesComAdobeCqDamMacSyncDamsyncservicePlatform :: Maybe ConfigNodePropertyDropDown
    
instance Arbitrary ComAdobeCqDamProcessorNuiImplNuiAssetProcessorInfo where
  arbitrary =
    ComAdobeCqDamProcessorNuiImplNuiAssetProcessorInfo
      <$> arbitrary -- comAdobeCqDamProcessorNuiImplNuiAssetProcessorInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeCqDamProcessorNuiImplNuiAssetProcessorInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeCqDamProcessorNuiImplNuiAssetProcessorInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeCqDamProcessorNuiImplNuiAssetProcessorInfoProperties :: Maybe ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties
    
instance Arbitrary ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties where
  arbitrary =
    ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties
      <$> arbitrary -- comAdobeCqDamProcessorNuiImplNuiAssetProcessorPropertiesNuiEnabled :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- comAdobeCqDamProcessorNuiImplNuiAssetProcessorPropertiesNuiServiceUrl :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeCqDamProcessorNuiImplNuiAssetProcessorPropertiesNuiApiKey :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComAdobeCqDamS7imagingImplIsImageServerComponentInfo where
  arbitrary =
    ComAdobeCqDamS7imagingImplIsImageServerComponentInfo
      <$> arbitrary -- comAdobeCqDamS7imagingImplIsImageServerComponentInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeCqDamS7imagingImplIsImageServerComponentInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeCqDamS7imagingImplIsImageServerComponentInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeCqDamS7imagingImplIsImageServerComponentInfoProperties :: Maybe ComAdobeCqDamS7imagingImplIsImageServerComponentProperties
    
instance Arbitrary ComAdobeCqDamS7imagingImplIsImageServerComponentProperties where
  arbitrary =
    ComAdobeCqDamS7imagingImplIsImageServerComponentProperties
      <$> arbitrary -- comAdobeCqDamS7imagingImplIsImageServerComponentPropertiesTcpPort :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeCqDamS7imagingImplIsImageServerComponentPropertiesAllowRemoteAccess :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- comAdobeCqDamS7imagingImplIsImageServerComponentPropertiesMaxRenderRgnPixels :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeCqDamS7imagingImplIsImageServerComponentPropertiesMaxMessageSize :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeCqDamS7imagingImplIsImageServerComponentPropertiesRandomAccessUrlTimeout :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comAdobeCqDamS7imagingImplIsImageServerComponentPropertiesWorkerThreads :: Maybe ConfigNodePropertyInteger
    
instance Arbitrary ComAdobeCqDamS7imagingImplPsPlatformServerServletInfo where
  arbitrary =
    ComAdobeCqDamS7imagingImplPsPlatformServerServletInfo
      <$> arbitrary -- comAdobeCqDamS7imagingImplPsPlatformServerServletInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeCqDamS7imagingImplPsPlatformServerServletInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeCqDamS7imagingImplPsPlatformServerServletInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeCqDamS7imagingImplPsPlatformServerServletInfoProperties :: Maybe ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties
    
instance Arbitrary ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties where
  arbitrary =
    ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties
      <$> arbitrary -- comAdobeCqDamS7imagingImplPsPlatformServerServletPropertiesCacheEnable :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- comAdobeCqDamS7imagingImplPsPlatformServerServletPropertiesCacheRootPaths :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comAdobeCqDamS7imagingImplPsPlatformServerServletPropertiesCacheMaxSize :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comAdobeCqDamS7imagingImplPsPlatformServerServletPropertiesCacheMaxEntries :: Maybe ConfigNodePropertyInteger
    
instance Arbitrary ComAdobeCqDamWebdavImplIoAssetIOHandlerInfo where
  arbitrary =
    ComAdobeCqDamWebdavImplIoAssetIOHandlerInfo
      <$> arbitrary -- comAdobeCqDamWebdavImplIoAssetIOHandlerInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeCqDamWebdavImplIoAssetIOHandlerInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeCqDamWebdavImplIoAssetIOHandlerInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeCqDamWebdavImplIoAssetIOHandlerInfoProperties :: Maybe ComAdobeCqDamWebdavImplIoAssetIOHandlerProperties
    
instance Arbitrary ComAdobeCqDamWebdavImplIoAssetIOHandlerProperties where
  arbitrary =
    ComAdobeCqDamWebdavImplIoAssetIOHandlerProperties
      <$> arbitrary -- comAdobeCqDamWebdavImplIoAssetIOHandlerPropertiesServiceRanking :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comAdobeCqDamWebdavImplIoAssetIOHandlerPropertiesPathPrefix :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeCqDamWebdavImplIoAssetIOHandlerPropertiesCreateVersion :: Maybe ConfigNodePropertyBoolean
    
instance Arbitrary ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobInfo where
  arbitrary =
    ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobInfo
      <$> arbitrary -- comAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobInfoProperties :: Maybe ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties
    
instance Arbitrary ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties where
  arbitrary =
    ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobProperties
      <$> arbitrary -- comAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobPropertiesCqDamWebdavVersionLinkingEnable :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- comAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobPropertiesCqDamWebdavVersionLinkingSchedulerPeriod :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobPropertiesCqDamWebdavVersionLinkingStagingTimeout :: Maybe ConfigNodePropertyInteger
    
instance Arbitrary ComAdobeCqDamWebdavImplIoSpecialFilesHandlerInfo where
  arbitrary =
    ComAdobeCqDamWebdavImplIoSpecialFilesHandlerInfo
      <$> arbitrary -- comAdobeCqDamWebdavImplIoSpecialFilesHandlerInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeCqDamWebdavImplIoSpecialFilesHandlerInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeCqDamWebdavImplIoSpecialFilesHandlerInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeCqDamWebdavImplIoSpecialFilesHandlerInfoProperties :: Maybe ComAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties
    
instance Arbitrary ComAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties where
  arbitrary =
    ComAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties
      <$> arbitrary -- comAdobeCqDamWebdavImplIoSpecialFilesHandlerPropertiesComDayCqDamCoreImplIoSpecialFilesHandlerFilepatters :: Maybe ConfigNodePropertyArray
    
instance Arbitrary ComAdobeCqDeserfwImplDeserializationFirewallImplInfo where
  arbitrary =
    ComAdobeCqDeserfwImplDeserializationFirewallImplInfo
      <$> arbitrary -- comAdobeCqDeserfwImplDeserializationFirewallImplInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeCqDeserfwImplDeserializationFirewallImplInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeCqDeserfwImplDeserializationFirewallImplInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeCqDeserfwImplDeserializationFirewallImplInfoProperties :: Maybe ComAdobeCqDeserfwImplDeserializationFirewallImplProperties
    
instance Arbitrary ComAdobeCqDeserfwImplDeserializationFirewallImplProperties where
  arbitrary =
    ComAdobeCqDeserfwImplDeserializationFirewallImplProperties
      <$> arbitrary -- comAdobeCqDeserfwImplDeserializationFirewallImplPropertiesFirewallDeserializationWhitelist :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comAdobeCqDeserfwImplDeserializationFirewallImplPropertiesFirewallDeserializationBlacklist :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comAdobeCqDeserfwImplDeserializationFirewallImplPropertiesFirewallDeserializationDiagnostics :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComAdobeCqDtmImplServiceDTMWebServiceImplInfo where
  arbitrary =
    ComAdobeCqDtmImplServiceDTMWebServiceImplInfo
      <$> arbitrary -- comAdobeCqDtmImplServiceDTMWebServiceImplInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeCqDtmImplServiceDTMWebServiceImplInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeCqDtmImplServiceDTMWebServiceImplInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeCqDtmImplServiceDTMWebServiceImplInfoProperties :: Maybe ComAdobeCqDtmImplServiceDTMWebServiceImplProperties
    
instance Arbitrary ComAdobeCqDtmImplServiceDTMWebServiceImplProperties where
  arbitrary =
    ComAdobeCqDtmImplServiceDTMWebServiceImplProperties
      <$> arbitrary -- comAdobeCqDtmImplServiceDTMWebServiceImplPropertiesConnectionTimeout :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comAdobeCqDtmImplServiceDTMWebServiceImplPropertiesSocketTimeout :: Maybe ConfigNodePropertyInteger
    
instance Arbitrary ComAdobeCqDtmImplServletsDTMDeployHookServletInfo where
  arbitrary =
    ComAdobeCqDtmImplServletsDTMDeployHookServletInfo
      <$> arbitrary -- comAdobeCqDtmImplServletsDTMDeployHookServletInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeCqDtmImplServletsDTMDeployHookServletInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeCqDtmImplServletsDTMDeployHookServletInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeCqDtmImplServletsDTMDeployHookServletInfoProperties :: Maybe ComAdobeCqDtmImplServletsDTMDeployHookServletProperties
    
instance Arbitrary ComAdobeCqDtmImplServletsDTMDeployHookServletProperties where
  arbitrary =
    ComAdobeCqDtmImplServletsDTMDeployHookServletProperties
      <$> arbitrary -- comAdobeCqDtmImplServletsDTMDeployHookServletPropertiesDtmStagingIpWhitelist :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comAdobeCqDtmImplServletsDTMDeployHookServletPropertiesDtmProductionIpWhitelist :: Maybe ConfigNodePropertyArray
    
instance Arbitrary ComAdobeCqDtmReactorImplServiceWebServiceImplInfo where
  arbitrary =
    ComAdobeCqDtmReactorImplServiceWebServiceImplInfo
      <$> arbitrary -- comAdobeCqDtmReactorImplServiceWebServiceImplInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeCqDtmReactorImplServiceWebServiceImplInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeCqDtmReactorImplServiceWebServiceImplInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeCqDtmReactorImplServiceWebServiceImplInfoProperties :: Maybe ComAdobeCqDtmReactorImplServiceWebServiceImplProperties
    
instance Arbitrary ComAdobeCqDtmReactorImplServiceWebServiceImplProperties where
  arbitrary =
    ComAdobeCqDtmReactorImplServiceWebServiceImplProperties
      <$> arbitrary -- comAdobeCqDtmReactorImplServiceWebServiceImplPropertiesEndpointUri :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeCqDtmReactorImplServiceWebServiceImplPropertiesConnectionTimeout :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comAdobeCqDtmReactorImplServiceWebServiceImplPropertiesSocketTimeout :: Maybe ConfigNodePropertyInteger
    
instance Arbitrary ComAdobeCqExperiencelogImplExperienceLogConfigServletInfo where
  arbitrary =
    ComAdobeCqExperiencelogImplExperienceLogConfigServletInfo
      <$> arbitrary -- comAdobeCqExperiencelogImplExperienceLogConfigServletInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeCqExperiencelogImplExperienceLogConfigServletInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeCqExperiencelogImplExperienceLogConfigServletInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeCqExperiencelogImplExperienceLogConfigServletInfoProperties :: Maybe ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties
      <*> arbitrary -- comAdobeCqExperiencelogImplExperienceLogConfigServletInfoAdditionalProperties :: Maybe Text
      <*> arbitrary -- comAdobeCqExperiencelogImplExperienceLogConfigServletInfoBundleLocation :: Maybe Text
      <*> arbitrary -- comAdobeCqExperiencelogImplExperienceLogConfigServletInfoServiceLocation :: Maybe Text
    
instance Arbitrary ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties where
  arbitrary =
    ComAdobeCqExperiencelogImplExperienceLogConfigServletProperties
      <$> arbitrary -- comAdobeCqExperiencelogImplExperienceLogConfigServletPropertiesEnabled :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- comAdobeCqExperiencelogImplExperienceLogConfigServletPropertiesDisabledForGroups :: Maybe ConfigNodePropertyArray
    
instance Arbitrary ComAdobeCqHcContentPackagesHealthCheckInfo where
  arbitrary =
    ComAdobeCqHcContentPackagesHealthCheckInfo
      <$> arbitrary -- comAdobeCqHcContentPackagesHealthCheckInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeCqHcContentPackagesHealthCheckInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeCqHcContentPackagesHealthCheckInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeCqHcContentPackagesHealthCheckInfoProperties :: Maybe ComAdobeCqHcContentPackagesHealthCheckProperties
    
instance Arbitrary ComAdobeCqHcContentPackagesHealthCheckProperties where
  arbitrary =
    ComAdobeCqHcContentPackagesHealthCheckProperties
      <$> arbitrary -- comAdobeCqHcContentPackagesHealthCheckPropertiesHcName :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeCqHcContentPackagesHealthCheckPropertiesHcTags :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comAdobeCqHcContentPackagesHealthCheckPropertiesHcMbeanName :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeCqHcContentPackagesHealthCheckPropertiesPackageNames :: Maybe ConfigNodePropertyArray
    
instance Arbitrary ComAdobeCqHistoryImplHistoryRequestFilterInfo where
  arbitrary =
    ComAdobeCqHistoryImplHistoryRequestFilterInfo
      <$> arbitrary -- comAdobeCqHistoryImplHistoryRequestFilterInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeCqHistoryImplHistoryRequestFilterInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeCqHistoryImplHistoryRequestFilterInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeCqHistoryImplHistoryRequestFilterInfoProperties :: Maybe ComAdobeCqHistoryImplHistoryRequestFilterProperties
      <*> arbitrary -- comAdobeCqHistoryImplHistoryRequestFilterInfoBundleLocation :: Maybe Text
      <*> arbitrary -- comAdobeCqHistoryImplHistoryRequestFilterInfoServiceLocation :: Maybe Text
    
instance Arbitrary ComAdobeCqHistoryImplHistoryRequestFilterProperties where
  arbitrary =
    ComAdobeCqHistoryImplHistoryRequestFilterProperties
      <$> arbitrary -- comAdobeCqHistoryImplHistoryRequestFilterPropertiesHistoryRequestFilterExcludedSelectors :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comAdobeCqHistoryImplHistoryRequestFilterPropertiesHistoryRequestFilterExcludedExtensions :: Maybe ConfigNodePropertyArray
    
instance Arbitrary ComAdobeCqHistoryImplHistoryServiceImplInfo where
  arbitrary =
    ComAdobeCqHistoryImplHistoryServiceImplInfo
      <$> arbitrary -- comAdobeCqHistoryImplHistoryServiceImplInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeCqHistoryImplHistoryServiceImplInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeCqHistoryImplHistoryServiceImplInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeCqHistoryImplHistoryServiceImplInfoProperties :: Maybe ComAdobeCqHistoryImplHistoryServiceImplProperties
      <*> arbitrary -- comAdobeCqHistoryImplHistoryServiceImplInfoAdditionalProperties :: Maybe Text
      <*> arbitrary -- comAdobeCqHistoryImplHistoryServiceImplInfoBundleLocation :: Maybe Text
      <*> arbitrary -- comAdobeCqHistoryImplHistoryServiceImplInfoServiceLocation :: Maybe Text
    
instance Arbitrary ComAdobeCqHistoryImplHistoryServiceImplProperties where
  arbitrary =
    ComAdobeCqHistoryImplHistoryServiceImplProperties
      <$> arbitrary -- comAdobeCqHistoryImplHistoryServiceImplPropertiesHistoryServiceResourceTypes :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comAdobeCqHistoryImplHistoryServiceImplPropertiesHistoryServicePathFilter :: Maybe ConfigNodePropertyArray
    
instance Arbitrary ComAdobeCqInboxImplTypeproviderItemTypeProviderInfo where
  arbitrary =
    ComAdobeCqInboxImplTypeproviderItemTypeProviderInfo
      <$> arbitrary -- comAdobeCqInboxImplTypeproviderItemTypeProviderInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeCqInboxImplTypeproviderItemTypeProviderInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeCqInboxImplTypeproviderItemTypeProviderInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeCqInboxImplTypeproviderItemTypeProviderInfoProperties :: Maybe ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties
    
instance Arbitrary ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties where
  arbitrary =
    ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties
      <$> arbitrary -- comAdobeCqInboxImplTypeproviderItemTypeProviderPropertiesInboxImplTypeproviderRegistrypaths :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comAdobeCqInboxImplTypeproviderItemTypeProviderPropertiesInboxImplTypeproviderLegacypaths :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comAdobeCqInboxImplTypeproviderItemTypeProviderPropertiesInboxImplTypeproviderDefaulturlFailureitem :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeCqInboxImplTypeproviderItemTypeProviderPropertiesInboxImplTypeproviderDefaulturlWorkitem :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeCqInboxImplTypeproviderItemTypeProviderPropertiesInboxImplTypeproviderDefaulturlTask :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComAdobeCqProjectsImplServletProjectImageServletInfo where
  arbitrary =
    ComAdobeCqProjectsImplServletProjectImageServletInfo
      <$> arbitrary -- comAdobeCqProjectsImplServletProjectImageServletInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeCqProjectsImplServletProjectImageServletInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeCqProjectsImplServletProjectImageServletInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeCqProjectsImplServletProjectImageServletInfoProperties :: Maybe ComAdobeCqProjectsImplServletProjectImageServletProperties
    
instance Arbitrary ComAdobeCqProjectsImplServletProjectImageServletProperties where
  arbitrary =
    ComAdobeCqProjectsImplServletProjectImageServletProperties
      <$> arbitrary -- comAdobeCqProjectsImplServletProjectImageServletPropertiesImageQuality :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeCqProjectsImplServletProjectImageServletPropertiesImageSupportedResolutions :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComAdobeCqProjectsPurgeSchedulerInfo where
  arbitrary =
    ComAdobeCqProjectsPurgeSchedulerInfo
      <$> arbitrary -- comAdobeCqProjectsPurgeSchedulerInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeCqProjectsPurgeSchedulerInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeCqProjectsPurgeSchedulerInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeCqProjectsPurgeSchedulerInfoProperties :: Maybe ComAdobeCqProjectsPurgeSchedulerProperties
    
instance Arbitrary ComAdobeCqProjectsPurgeSchedulerProperties where
  arbitrary =
    ComAdobeCqProjectsPurgeSchedulerProperties
      <$> arbitrary -- comAdobeCqProjectsPurgeSchedulerPropertiesScheduledpurgeName :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeCqProjectsPurgeSchedulerPropertiesScheduledpurgePurgeActive :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- comAdobeCqProjectsPurgeSchedulerPropertiesScheduledpurgeTemplates :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comAdobeCqProjectsPurgeSchedulerPropertiesScheduledpurgePurgeGroups :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- comAdobeCqProjectsPurgeSchedulerPropertiesScheduledpurgePurgeAssets :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- comAdobeCqProjectsPurgeSchedulerPropertiesScheduledpurgeTerminateRunningWorkflows :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- comAdobeCqProjectsPurgeSchedulerPropertiesScheduledpurgeDaysold :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comAdobeCqProjectsPurgeSchedulerPropertiesScheduledpurgeSaveThreshold :: Maybe ConfigNodePropertyInteger
    
instance Arbitrary ComAdobeCqScheduledExporterImplScheduledExporterImplInfo where
  arbitrary =
    ComAdobeCqScheduledExporterImplScheduledExporterImplInfo
      <$> arbitrary -- comAdobeCqScheduledExporterImplScheduledExporterImplInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeCqScheduledExporterImplScheduledExporterImplInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeCqScheduledExporterImplScheduledExporterImplInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeCqScheduledExporterImplScheduledExporterImplInfoProperties :: Maybe ComAdobeCqScheduledExporterImplScheduledExporterImplProperties
    
instance Arbitrary ComAdobeCqScheduledExporterImplScheduledExporterImplProperties where
  arbitrary =
    ComAdobeCqScheduledExporterImplScheduledExporterImplProperties
      <$> arbitrary -- comAdobeCqScheduledExporterImplScheduledExporterImplPropertiesIncludePaths :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comAdobeCqScheduledExporterImplScheduledExporterImplPropertiesExporterUser :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplInfo where
  arbitrary =
    ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplInfo
      <$> arbitrary -- comAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplInfoProperties :: Maybe ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties
    
instance Arbitrary ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties where
  arbitrary =
    ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties
      <$> arbitrary -- comAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplPropertiesComAdobeCqScreensAnalyticsImplUrl :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplPropertiesComAdobeCqScreensAnalyticsImplApikey :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplPropertiesComAdobeCqScreensAnalyticsImplProject :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplPropertiesComAdobeCqScreensAnalyticsImplEnvironment :: Maybe ConfigNodePropertyDropDown
      <*> arbitrary -- comAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplPropertiesComAdobeCqScreensAnalyticsImplSendFrequency :: Maybe ConfigNodePropertyInteger
    
instance Arbitrary ComAdobeCqScreensDeviceImplDeviceServiceInfo where
  arbitrary =
    ComAdobeCqScreensDeviceImplDeviceServiceInfo
      <$> arbitrary -- comAdobeCqScreensDeviceImplDeviceServiceInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeCqScreensDeviceImplDeviceServiceInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeCqScreensDeviceImplDeviceServiceInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeCqScreensDeviceImplDeviceServiceInfoProperties :: Maybe ComAdobeCqScreensDeviceImplDeviceServiceProperties
    
instance Arbitrary ComAdobeCqScreensDeviceImplDeviceServiceProperties where
  arbitrary =
    ComAdobeCqScreensDeviceImplDeviceServiceProperties
      <$> arbitrary -- comAdobeCqScreensDeviceImplDeviceServicePropertiesComAdobeAemScreensPlayerPingfrequency :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comAdobeCqScreensDeviceImplDeviceServicePropertiesComAdobeAemScreensDevicePaswordSpecialchars :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeCqScreensDeviceImplDeviceServicePropertiesComAdobeAemScreensDevicePaswordMinlowercasechars :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comAdobeCqScreensDeviceImplDeviceServicePropertiesComAdobeAemScreensDevicePaswordMinuppercasechars :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comAdobeCqScreensDeviceImplDeviceServicePropertiesComAdobeAemScreensDevicePaswordMinnumberchars :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comAdobeCqScreensDeviceImplDeviceServicePropertiesComAdobeAemScreensDevicePaswordMinspecialchars :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comAdobeCqScreensDeviceImplDeviceServicePropertiesComAdobeAemScreensDevicePaswordMinlength :: Maybe ConfigNodePropertyInteger
    
instance Arbitrary ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplInfo where
  arbitrary =
    ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplInfo
      <$> arbitrary -- comAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplInfoProperties :: Maybe ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties
    
instance Arbitrary ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties where
  arbitrary =
    ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties
      <$> arbitrary -- comAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplPropertiesDeviceRegistrationTimeout :: Maybe ConfigNodePropertyInteger
    
instance Arbitrary ComAdobeCqScreensImplHandlerChannelsUpdateHandlerInfo where
  arbitrary =
    ComAdobeCqScreensImplHandlerChannelsUpdateHandlerInfo
      <$> arbitrary -- comAdobeCqScreensImplHandlerChannelsUpdateHandlerInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeCqScreensImplHandlerChannelsUpdateHandlerInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeCqScreensImplHandlerChannelsUpdateHandlerInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeCqScreensImplHandlerChannelsUpdateHandlerInfoProperties :: Maybe ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties
    
instance Arbitrary ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties where
  arbitrary =
    ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties
      <$> arbitrary -- comAdobeCqScreensImplHandlerChannelsUpdateHandlerPropertiesCqPagesupdatehandlerImageresourcetypes :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comAdobeCqScreensImplHandlerChannelsUpdateHandlerPropertiesCqPagesupdatehandlerProductresourcetypes :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comAdobeCqScreensImplHandlerChannelsUpdateHandlerPropertiesCqPagesupdatehandlerVideoresourcetypes :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comAdobeCqScreensImplHandlerChannelsUpdateHandlerPropertiesCqPagesupdatehandlerDynamicsequenceresourcetypes :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comAdobeCqScreensImplHandlerChannelsUpdateHandlerPropertiesCqPagesupdatehandlerPreviewmodepaths :: Maybe ConfigNodePropertyArray
    
instance Arbitrary ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobInfo where
  arbitrary =
    ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobInfo
      <$> arbitrary -- comAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobInfoProperties :: Maybe ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobProperties
    
instance Arbitrary ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobProperties where
  arbitrary =
    ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobProperties
      <$> arbitrary -- comAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobPropertiesSchedulerExpression :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplInfo where
  arbitrary =
    ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplInfo
      <$> arbitrary -- comAdobeCqScreensImplRemoteImplDistributedHttpClientImplInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeCqScreensImplRemoteImplDistributedHttpClientImplInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeCqScreensImplRemoteImplDistributedHttpClientImplInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeCqScreensImplRemoteImplDistributedHttpClientImplInfoProperties :: Maybe ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties
    
instance Arbitrary ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties where
  arbitrary =
    ComAdobeCqScreensImplRemoteImplDistributedHttpClientImplProperties
      <$> arbitrary -- comAdobeCqScreensImplRemoteImplDistributedHttpClientImplPropertiesComAdobeAemScreensImplRemoteRequestTimeout :: Maybe ConfigNodePropertyInteger
    
instance Arbitrary ComAdobeCqScreensImplScreensChannelPostProcessorInfo where
  arbitrary =
    ComAdobeCqScreensImplScreensChannelPostProcessorInfo
      <$> arbitrary -- comAdobeCqScreensImplScreensChannelPostProcessorInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeCqScreensImplScreensChannelPostProcessorInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeCqScreensImplScreensChannelPostProcessorInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeCqScreensImplScreensChannelPostProcessorInfoProperties :: Maybe ComAdobeCqScreensImplScreensChannelPostProcessorProperties
    
instance Arbitrary ComAdobeCqScreensImplScreensChannelPostProcessorProperties where
  arbitrary =
    ComAdobeCqScreensImplScreensChannelPostProcessorProperties
      <$> arbitrary -- comAdobeCqScreensImplScreensChannelPostProcessorPropertiesScreensChannelsPropertiesToRemove :: Maybe ConfigNodePropertyArray
    
instance Arbitrary ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplInfo where
  arbitrary =
    ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplInfo
      <$> arbitrary -- comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplInfoProperties :: Maybe ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties
    
instance Arbitrary ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties where
  arbitrary =
    ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties
      <$> arbitrary -- comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPropertiesComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProjectPath :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPropertiesComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplScheduleFrequency :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPropertiesComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPingTimeout :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPropertiesComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplRecipients :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPropertiesComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpserver :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPropertiesComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpport :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPropertiesComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsetls :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPropertiesComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsername :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPropertiesComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPassword :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComAdobeCqScreensMqActivemqImplArtemisJMSProviderInfo where
  arbitrary =
    ComAdobeCqScreensMqActivemqImplArtemisJMSProviderInfo
      <$> arbitrary -- comAdobeCqScreensMqActivemqImplArtemisJMSProviderInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeCqScreensMqActivemqImplArtemisJMSProviderInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeCqScreensMqActivemqImplArtemisJMSProviderInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeCqScreensMqActivemqImplArtemisJMSProviderInfoProperties :: Maybe ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties
    
instance Arbitrary ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties where
  arbitrary =
    ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties
      <$> arbitrary -- comAdobeCqScreensMqActivemqImplArtemisJMSProviderPropertiesServiceRanking :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comAdobeCqScreensMqActivemqImplArtemisJMSProviderPropertiesGlobalSize :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comAdobeCqScreensMqActivemqImplArtemisJMSProviderPropertiesMaxDiskUsage :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comAdobeCqScreensMqActivemqImplArtemisJMSProviderPropertiesPersistenceEnabled :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- comAdobeCqScreensMqActivemqImplArtemisJMSProviderPropertiesThreadPoolMaxSize :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comAdobeCqScreensMqActivemqImplArtemisJMSProviderPropertiesScheduledThreadPoolMaxSize :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comAdobeCqScreensMqActivemqImplArtemisJMSProviderPropertiesGracefulShutdownTimeout :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comAdobeCqScreensMqActivemqImplArtemisJMSProviderPropertiesQueues :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comAdobeCqScreensMqActivemqImplArtemisJMSProviderPropertiesTopics :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comAdobeCqScreensMqActivemqImplArtemisJMSProviderPropertiesAddressesMaxDeliveryAttempts :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comAdobeCqScreensMqActivemqImplArtemisJMSProviderPropertiesAddressesExpiryDelay :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comAdobeCqScreensMqActivemqImplArtemisJMSProviderPropertiesAddressesAddressFullMessagePolicy :: Maybe ConfigNodePropertyDropDown
      <*> arbitrary -- comAdobeCqScreensMqActivemqImplArtemisJMSProviderPropertiesAddressesMaxSizeBytes :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comAdobeCqScreensMqActivemqImplArtemisJMSProviderPropertiesAddressesPageSizeBytes :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comAdobeCqScreensMqActivemqImplArtemisJMSProviderPropertiesAddressesPageCacheMaxSize :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comAdobeCqScreensMqActivemqImplArtemisJMSProviderPropertiesClusterUser :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeCqScreensMqActivemqImplArtemisJMSProviderPropertiesClusterPassword :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeCqScreensMqActivemqImplArtemisJMSProviderPropertiesClusterCallTimeout :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comAdobeCqScreensMqActivemqImplArtemisJMSProviderPropertiesClusterCallFailoverTimeout :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comAdobeCqScreensMqActivemqImplArtemisJMSProviderPropertiesClusterClientFailureCheckPeriod :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comAdobeCqScreensMqActivemqImplArtemisJMSProviderPropertiesClusterNotificationAttempts :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comAdobeCqScreensMqActivemqImplArtemisJMSProviderPropertiesClusterNotificationInterval :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comAdobeCqScreensMqActivemqImplArtemisJMSProviderPropertiesIdCacheSize :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comAdobeCqScreensMqActivemqImplArtemisJMSProviderPropertiesClusterConfirmationWindowSize :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comAdobeCqScreensMqActivemqImplArtemisJMSProviderPropertiesClusterConnectionTtl :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comAdobeCqScreensMqActivemqImplArtemisJMSProviderPropertiesClusterDuplicateDetection :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- comAdobeCqScreensMqActivemqImplArtemisJMSProviderPropertiesClusterInitialConnectAttempts :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comAdobeCqScreensMqActivemqImplArtemisJMSProviderPropertiesClusterMaxRetryInterval :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comAdobeCqScreensMqActivemqImplArtemisJMSProviderPropertiesClusterMinLargeMessageSize :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comAdobeCqScreensMqActivemqImplArtemisJMSProviderPropertiesClusterProducerWindowSize :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comAdobeCqScreensMqActivemqImplArtemisJMSProviderPropertiesClusterReconnectAttempts :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comAdobeCqScreensMqActivemqImplArtemisJMSProviderPropertiesClusterRetryInterval :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comAdobeCqScreensMqActivemqImplArtemisJMSProviderPropertiesClusterRetryIntervalMultiplier :: Maybe ConfigNodePropertyFloat
    
instance Arbitrary ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplInfo where
  arbitrary =
    ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplInfo
      <$> arbitrary -- comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplInfoProperties :: Maybe ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties
    
instance Arbitrary ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties where
  arbitrary =
    ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties
      <$> arbitrary -- comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplPropertiesComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProjectPath :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplPropertiesComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplScheduleFrequency :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplInfo where
  arbitrary =
    ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplInfo
      <$> arbitrary -- comAdobeCqScreensOfflinecontentImplOfflineContentServiceImplInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeCqScreensOfflinecontentImplOfflineContentServiceImplInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeCqScreensOfflinecontentImplOfflineContentServiceImplInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeCqScreensOfflinecontentImplOfflineContentServiceImplInfoProperties :: Maybe ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties
    
instance Arbitrary ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties where
  arbitrary =
    ComAdobeCqScreensOfflinecontentImplOfflineContentServiceImplProperties
      <$> arbitrary -- comAdobeCqScreensOfflinecontentImplOfflineContentServiceImplPropertiesDisableSmartSync :: Maybe ConfigNodePropertyBoolean
    
instance Arbitrary ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagInfo where
  arbitrary =
    ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagInfo
      <$> arbitrary -- comAdobeCqScreensSegmentationImplSegmentationFeatureFlagInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeCqScreensSegmentationImplSegmentationFeatureFlagInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeCqScreensSegmentationImplSegmentationFeatureFlagInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeCqScreensSegmentationImplSegmentationFeatureFlagInfoProperties :: Maybe ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties
    
instance Arbitrary ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties where
  arbitrary =
    ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties
      <$> arbitrary -- comAdobeCqScreensSegmentationImplSegmentationFeatureFlagPropertiesEnableDataTriggeredContent :: Maybe ConfigNodePropertyBoolean
    
instance Arbitrary ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChInfo where
  arbitrary =
    ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChInfo
      <$> arbitrary -- comAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChInfoProperties :: Maybe ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChProperties
    
instance Arbitrary ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChProperties where
  arbitrary =
    ComAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChProperties
      <$> arbitrary -- comAdobeCqSecurityHcBundlesImplHtmlLibraryManagerConfigHealthChPropertiesHcTags :: Maybe ConfigNodePropertyArray
    
instance Arbitrary ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckInfo where
  arbitrary =
    ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckInfo
      <$> arbitrary -- comAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckInfoProperties :: Maybe ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckProperties
    
instance Arbitrary ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckProperties where
  arbitrary =
    ComAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckProperties
      <$> arbitrary -- comAdobeCqSecurityHcBundlesImplWcmFilterHealthCheckPropertiesHcTags :: Maybe ConfigNodePropertyArray
    
instance Arbitrary ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckInfo where
  arbitrary =
    ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckInfo
      <$> arbitrary -- comAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckInfoProperties :: Maybe ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties
    
instance Arbitrary ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties where
  arbitrary =
    ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties
      <$> arbitrary -- comAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckPropertiesHcTags :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckPropertiesDispatcherAddress :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckPropertiesDispatcherFilterAllowed :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckPropertiesDispatcherFilterBlocked :: Maybe ConfigNodePropertyArray
    
instance Arbitrary ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckInfo where
  arbitrary =
    ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckInfo
      <$> arbitrary -- comAdobeCqSecurityHcPackagesImplExampleContentHealthCheckInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeCqSecurityHcPackagesImplExampleContentHealthCheckInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeCqSecurityHcPackagesImplExampleContentHealthCheckInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeCqSecurityHcPackagesImplExampleContentHealthCheckInfoProperties :: Maybe ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckProperties
      <*> arbitrary -- comAdobeCqSecurityHcPackagesImplExampleContentHealthCheckInfoAdditionalProperties :: Maybe Text
      <*> arbitrary -- comAdobeCqSecurityHcPackagesImplExampleContentHealthCheckInfoBundleLocation :: Maybe Text
      <*> arbitrary -- comAdobeCqSecurityHcPackagesImplExampleContentHealthCheckInfoServiceLocation :: Maybe Text
    
instance Arbitrary ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckProperties where
  arbitrary =
    ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckProperties
      <$> arbitrary -- comAdobeCqSecurityHcPackagesImplExampleContentHealthCheckPropertiesHcTags :: Maybe ConfigNodePropertyArray
    
instance Arbitrary ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckInfo where
  arbitrary =
    ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckInfo
      <$> arbitrary -- comAdobeCqSecurityHcWebserverImplClickjackingHealthCheckInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeCqSecurityHcWebserverImplClickjackingHealthCheckInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeCqSecurityHcWebserverImplClickjackingHealthCheckInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeCqSecurityHcWebserverImplClickjackingHealthCheckInfoProperties :: Maybe ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties
    
instance Arbitrary ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties where
  arbitrary =
    ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties
      <$> arbitrary -- comAdobeCqSecurityHcWebserverImplClickjackingHealthCheckPropertiesHcTags :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comAdobeCqSecurityHcWebserverImplClickjackingHealthCheckPropertiesWebserverAddress :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComAdobeCqSocialAccountverificationImplAccountManagementConfigImInfo where
  arbitrary =
    ComAdobeCqSocialAccountverificationImplAccountManagementConfigImInfo
      <$> arbitrary -- comAdobeCqSocialAccountverificationImplAccountManagementConfigImInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialAccountverificationImplAccountManagementConfigImInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialAccountverificationImplAccountManagementConfigImInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialAccountverificationImplAccountManagementConfigImInfoProperties :: Maybe ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties
    
instance Arbitrary ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties where
  arbitrary =
    ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties
      <$> arbitrary -- comAdobeCqSocialAccountverificationImplAccountManagementConfigImPropertiesEnable :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- comAdobeCqSocialAccountverificationImplAccountManagementConfigImPropertiesTtl1 :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comAdobeCqSocialAccountverificationImplAccountManagementConfigImPropertiesTtl2 :: Maybe ConfigNodePropertyInteger
    
instance Arbitrary ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenInfo where
  arbitrary =
    ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenInfo
      <$> arbitrary -- comAdobeCqSocialActivitystreamsClientImplSocialActivityComponenInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialActivitystreamsClientImplSocialActivityComponenInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialActivitystreamsClientImplSocialActivityComponenInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialActivitystreamsClientImplSocialActivityComponenInfoProperties :: Maybe ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenProperties
    
instance Arbitrary ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenProperties where
  arbitrary =
    ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenProperties
      <$> arbitrary -- comAdobeCqSocialActivitystreamsClientImplSocialActivityComponenPropertiesPriority :: Maybe ConfigNodePropertyInteger
    
instance Arbitrary ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoInfo where
  arbitrary =
    ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoInfo
      <$> arbitrary -- comAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoInfoProperties :: Maybe ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoProperties
    
instance Arbitrary ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoProperties where
  arbitrary =
    ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoProperties
      <$> arbitrary -- comAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoPropertiesPriority :: Maybe ConfigNodePropertyInteger
    
instance Arbitrary ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerInfo where
  arbitrary =
    ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerInfo
      <$> arbitrary -- comAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerInfoProperties :: Maybe ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerProperties
    
instance Arbitrary ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerProperties where
  arbitrary =
    ComAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerProperties
      <$> arbitrary -- comAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerPropertiesEventTopics :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeCqSocialActivitystreamsListenerImplEventListenerHandlerPropertiesEventFilter :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenInfo where
  arbitrary =
    ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenInfo
      <$> arbitrary -- comAdobeCqSocialActivitystreamsListenerImplModerationEventExtenInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialActivitystreamsListenerImplModerationEventExtenInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialActivitystreamsListenerImplModerationEventExtenInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialActivitystreamsListenerImplModerationEventExtenInfoProperties :: Maybe ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties
    
instance Arbitrary ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties where
  arbitrary =
    ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties
      <$> arbitrary -- comAdobeCqSocialActivitystreamsListenerImplModerationEventExtenPropertiesAccepted :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- comAdobeCqSocialActivitystreamsListenerImplModerationEventExtenPropertiesRanked :: Maybe ConfigNodePropertyInteger
    
instance Arbitrary ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySInfo where
  arbitrary =
    ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySInfo
      <$> arbitrary -- comAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySInfoProperties :: Maybe ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties
    
instance Arbitrary ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties where
  arbitrary =
    ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties
      <$> arbitrary -- comAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySPropertiesRanking :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySPropertiesEnable :: Maybe ConfigNodePropertyBoolean
    
instance Arbitrary ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreInfo where
  arbitrary =
    ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreInfo
      <$> arbitrary -- comAdobeCqSocialActivitystreamsListenerImplResourceActivityStreInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialActivitystreamsListenerImplResourceActivityStreInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialActivitystreamsListenerImplResourceActivityStreInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialActivitystreamsListenerImplResourceActivityStreInfoProperties :: Maybe ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties
      <*> arbitrary -- comAdobeCqSocialActivitystreamsListenerImplResourceActivityStreInfoBundleLocation :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialActivitystreamsListenerImplResourceActivityStreInfoServiceLocation :: Maybe Text
    
instance Arbitrary ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties where
  arbitrary =
    ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties
      <$> arbitrary -- comAdobeCqSocialActivitystreamsListenerImplResourceActivityStrePropertiesStreamPath :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeCqSocialActivitystreamsListenerImplResourceActivityStrePropertiesStreamName :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIInfo where
  arbitrary =
    ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIInfo
      <$> arbitrary -- comAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIInfoProperties :: Maybe ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties
    
instance Arbitrary ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties where
  arbitrary =
    ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties
      <$> arbitrary -- comAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIPropertiesMaxRetry :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIPropertiesFieldWhitelist :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIPropertiesAttachmentTypeBlacklist :: Maybe ConfigNodePropertyArray
    
instance Arbitrary ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenInfo where
  arbitrary =
    ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenInfo
      <$> arbitrary -- comAdobeCqSocialCalendarClientOperationextensionsEventAttachmenInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialCalendarClientOperationextensionsEventAttachmenInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialCalendarClientOperationextensionsEventAttachmenInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialCalendarClientOperationextensionsEventAttachmenInfoProperties :: Maybe ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties
    
instance Arbitrary ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties where
  arbitrary =
    ComAdobeCqSocialCalendarClientOperationextensionsEventAttachmenProperties
      <$> arbitrary -- comAdobeCqSocialCalendarClientOperationextensionsEventAttachmenPropertiesAttachmentTypeBlacklist :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeCqSocialCalendarClientOperationextensionsEventAttachmenPropertiesExtensionOrder :: Maybe ConfigNodePropertyInteger
    
instance Arbitrary ComAdobeCqSocialCalendarServletsTimeZoneServletInfo where
  arbitrary =
    ComAdobeCqSocialCalendarServletsTimeZoneServletInfo
      <$> arbitrary -- comAdobeCqSocialCalendarServletsTimeZoneServletInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialCalendarServletsTimeZoneServletInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialCalendarServletsTimeZoneServletInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialCalendarServletsTimeZoneServletInfoProperties :: Maybe ComAdobeCqSocialCalendarServletsTimeZoneServletProperties
    
instance Arbitrary ComAdobeCqSocialCalendarServletsTimeZoneServletProperties where
  arbitrary =
    ComAdobeCqSocialCalendarServletsTimeZoneServletProperties
      <$> arbitrary -- comAdobeCqSocialCalendarServletsTimeZoneServletPropertiesTimezonesExpirytime :: Maybe ConfigNodePropertyInteger
    
instance Arbitrary ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventInfo where
  arbitrary =
    ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventInfo
      <$> arbitrary -- comAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventInfoProperties :: Maybe ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventProperties
    
instance Arbitrary ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventProperties where
  arbitrary =
    ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventProperties
      <$> arbitrary -- comAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventPropertiesRanking :: Maybe ConfigNodePropertyInteger
    
instance Arbitrary ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSeInfo where
  arbitrary =
    ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSeInfo
      <$> arbitrary -- comAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSeInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSeInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSeInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSeInfoProperties :: Maybe ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSeProperties
    
instance Arbitrary ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSeProperties where
  arbitrary =
    ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSeProperties
      <$> arbitrary -- comAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSePropertiesFieldWhitelist :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSePropertiesAttachmentTypeBlacklist :: Maybe ConfigNodePropertyArray
    
instance Arbitrary ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiInfo where
  arbitrary =
    ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiInfo
      <$> arbitrary -- comAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiInfoProperties :: Maybe ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiProperties
    
instance Arbitrary ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiProperties where
  arbitrary =
    ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiProperties
      <$> arbitrary -- comAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiPropertiesFieldWhitelist :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiPropertiesAttachmentTypeBlacklist :: Maybe ConfigNodePropertyArray
    
instance Arbitrary ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCInfo where
  arbitrary =
    ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCInfo
      <$> arbitrary -- comAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCInfoProperties :: Maybe ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties
    
instance Arbitrary ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties where
  arbitrary =
    ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties
      <$> arbitrary -- comAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCPropertiesNumUserLimit :: Maybe ConfigNodePropertyInteger
    
instance Arbitrary ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosInfo where
  arbitrary =
    ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosInfo
      <$> arbitrary -- comAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosInfoProperties :: Maybe ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties
    
instance Arbitrary ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties where
  arbitrary =
    ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties
      <$> arbitrary -- comAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosPropertiesEnableScheduledPostsSearch :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- comAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosPropertiesNumberOfMinutes :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosPropertiesMaxSearchLimit :: Maybe ConfigNodePropertyInteger
    
instance Arbitrary ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterInfo where
  arbitrary =
    ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterInfo
      <$> arbitrary -- comAdobeCqSocialCommonsCorsCORSAuthenticationFilterInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialCommonsCorsCORSAuthenticationFilterInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialCommonsCorsCORSAuthenticationFilterInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialCommonsCorsCORSAuthenticationFilterInfoProperties :: Maybe ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties
    
instance Arbitrary ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties where
  arbitrary =
    ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties
      <$> arbitrary -- comAdobeCqSocialCommonsCorsCORSAuthenticationFilterPropertiesCorsEnabling :: Maybe ConfigNodePropertyBoolean
    
instance Arbitrary ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderInfo where
  arbitrary =
    ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderInfo
      <$> arbitrary -- comAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderInfoProperties :: Maybe ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderProperties
    
instance Arbitrary ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderProperties where
  arbitrary =
    ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderProperties
      <$> arbitrary -- comAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderPropertiesPriorityOrder :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderPropertiesReplyEmailPatterns :: Maybe ConfigNodePropertyArray
    
instance Arbitrary ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplInfo where
  arbitrary =
    ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplInfo
      <$> arbitrary -- comAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplInfoProperties :: Maybe ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplProperties
    
instance Arbitrary ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplProperties where
  arbitrary =
    ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplProperties
      <$> arbitrary -- comAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplPropertiesContextPath :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerInfo where
  arbitrary =
    ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerInfo
      <$> arbitrary -- comAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerInfoProperties :: Maybe ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerProperties
    
instance Arbitrary ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerProperties where
  arbitrary =
    ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerProperties
      <$> arbitrary -- comAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerPropertiesEventTopics :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComAdobeCqSocialCommonsEmailreplyImplCustomEmailClientProviderInfo where
  arbitrary =
    ComAdobeCqSocialCommonsEmailreplyImplCustomEmailClientProviderInfo
      <$> arbitrary -- comAdobeCqSocialCommonsEmailreplyImplCustomEmailClientProviderInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialCommonsEmailreplyImplCustomEmailClientProviderInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialCommonsEmailreplyImplCustomEmailClientProviderInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialCommonsEmailreplyImplCustomEmailClientProviderInfoProperties :: Maybe ComAdobeCqSocialCommonsEmailreplyImplCustomEmailClientProviderProperties
    
instance Arbitrary ComAdobeCqSocialCommonsEmailreplyImplCustomEmailClientProviderProperties where
  arbitrary =
    ComAdobeCqSocialCommonsEmailreplyImplCustomEmailClientProviderProperties
      <$> arbitrary -- comAdobeCqSocialCommonsEmailreplyImplCustomEmailClientProviderPropertiesPriorityOrder :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comAdobeCqSocialCommonsEmailreplyImplCustomEmailClientProviderPropertiesReplyEmailPatterns :: Maybe ConfigNodePropertyArray
    
instance Arbitrary ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpInfo where
  arbitrary =
    ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpInfo
      <$> arbitrary -- comAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpInfoProperties :: Maybe ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties
    
instance Arbitrary ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties where
  arbitrary =
    ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties
      <$> arbitrary -- comAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpPropertiesPatternTime :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpPropertiesPatternNewline :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpPropertiesPatternDayOfMonth :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpPropertiesPatternMonth :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpPropertiesPatternYear :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpPropertiesPatternDate :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpPropertiesPatternDateTime :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpPropertiesPatternEmail :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpInfo where
  arbitrary =
    ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpInfo
      <$> arbitrary -- comAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpInfoProperties :: Maybe ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties
    
instance Arbitrary ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties where
  arbitrary =
    ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties
      <$> arbitrary -- comAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpPropertiesEmailName :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpPropertiesEmailCreatePostFromReply :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- comAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpPropertiesEmailAddCommentIdTo :: Maybe ConfigNodePropertyDropDown
      <*> arbitrary -- comAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpPropertiesEmailSubjectMaximumLength :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpPropertiesEmailReplyToAddress :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpPropertiesEmailReplyToDelimiter :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpPropertiesEmailTrackerIdPrefixInSubject :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpPropertiesEmailTrackerIdPrefixInBody :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpPropertiesEmailAsHtml :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- comAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpPropertiesEmailDefaultUserName :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpPropertiesEmailTemplatesRootPath :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterInfo where
  arbitrary =
    ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterInfo
      <$> arbitrary -- comAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterInfoProperties :: Maybe ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterProperties
    
instance Arbitrary ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterProperties where
  arbitrary =
    ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterProperties
      <$> arbitrary -- comAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterPropertiesConnectProtocol :: Maybe ConfigNodePropertyDropDown
    
instance Arbitrary ComAdobeCqSocialCommonsEmailreplyImplGmailEmailClientProviderInfo where
  arbitrary =
    ComAdobeCqSocialCommonsEmailreplyImplGmailEmailClientProviderInfo
      <$> arbitrary -- comAdobeCqSocialCommonsEmailreplyImplGmailEmailClientProviderInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialCommonsEmailreplyImplGmailEmailClientProviderInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialCommonsEmailreplyImplGmailEmailClientProviderInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialCommonsEmailreplyImplGmailEmailClientProviderInfoProperties :: Maybe ComAdobeCqSocialCommonsEmailreplyImplGmailEmailClientProviderProperties
    
instance Arbitrary ComAdobeCqSocialCommonsEmailreplyImplGmailEmailClientProviderProperties where
  arbitrary =
    ComAdobeCqSocialCommonsEmailreplyImplGmailEmailClientProviderProperties
      <$> arbitrary -- comAdobeCqSocialCommonsEmailreplyImplGmailEmailClientProviderPropertiesPriorityOrder :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comAdobeCqSocialCommonsEmailreplyImplGmailEmailClientProviderPropertiesReplyEmailPatterns :: Maybe ConfigNodePropertyArray
    
instance Arbitrary ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderInfo where
  arbitrary =
    ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderInfo
      <$> arbitrary -- comAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderInfoProperties :: Maybe ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderProperties
    
instance Arbitrary ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderProperties where
  arbitrary =
    ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderProperties
      <$> arbitrary -- comAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderPropertiesPriorityOrder :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderPropertiesReplyEmailPatterns :: Maybe ConfigNodePropertyArray
    
instance Arbitrary ComAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProviderInfo where
  arbitrary =
    ComAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProviderInfo
      <$> arbitrary -- comAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProviderInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProviderInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProviderInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProviderInfoProperties :: Maybe ComAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProviderProperties
    
instance Arbitrary ComAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProviderProperties where
  arbitrary =
    ComAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProviderProperties
      <$> arbitrary -- comAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProviderPropertiesPriorityOrder :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProviderPropertiesReplyEmailPatterns :: Maybe ConfigNodePropertyArray
    
instance Arbitrary ComAdobeCqSocialCommonsEmailreplyImplOutLookEmailClientProviderInfo where
  arbitrary =
    ComAdobeCqSocialCommonsEmailreplyImplOutLookEmailClientProviderInfo
      <$> arbitrary -- comAdobeCqSocialCommonsEmailreplyImplOutLookEmailClientProviderInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialCommonsEmailreplyImplOutLookEmailClientProviderInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialCommonsEmailreplyImplOutLookEmailClientProviderInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialCommonsEmailreplyImplOutLookEmailClientProviderInfoProperties :: Maybe ComAdobeCqSocialCommonsEmailreplyImplOutLookEmailClientProviderProperties
    
instance Arbitrary ComAdobeCqSocialCommonsEmailreplyImplOutLookEmailClientProviderProperties where
  arbitrary =
    ComAdobeCqSocialCommonsEmailreplyImplOutLookEmailClientProviderProperties
      <$> arbitrary -- comAdobeCqSocialCommonsEmailreplyImplOutLookEmailClientProviderPropertiesPriorityOrder :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comAdobeCqSocialCommonsEmailreplyImplOutLookEmailClientProviderPropertiesReplyEmailPatterns :: Maybe ConfigNodePropertyArray
    
instance Arbitrary ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderInfo where
  arbitrary =
    ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderInfo
      <$> arbitrary -- comAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderInfoProperties :: Maybe ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderProperties
    
instance Arbitrary ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderProperties where
  arbitrary =
    ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderProperties
      <$> arbitrary -- comAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderPropertiesReplyEmailPatterns :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderPropertiesPriorityOrder :: Maybe ConfigNodePropertyInteger
    
instance Arbitrary ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderInfo where
  arbitrary =
    ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderInfo
      <$> arbitrary -- comAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderInfoProperties :: Maybe ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderProperties
    
instance Arbitrary ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderProperties where
  arbitrary =
    ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderProperties
      <$> arbitrary -- comAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderPropertiesPriorityOrder :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderPropertiesReplyEmailPatterns :: Maybe ConfigNodePropertyArray
    
instance Arbitrary ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadInfo where
  arbitrary =
    ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadInfo
      <$> arbitrary -- comAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadInfoProperties :: Maybe ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties
    
instance Arbitrary ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties where
  arbitrary =
    ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties
      <$> arbitrary -- comAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadPropertiesNumberOfDays :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadPropertiesAgeOfFile :: Maybe ConfigNodePropertyInteger
    
instance Arbitrary ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplInfo where
  arbitrary =
    ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplInfo
      <$> arbitrary -- comAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplInfoProperties :: Maybe ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties
    
instance Arbitrary ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties where
  arbitrary =
    ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties
      <$> arbitrary -- comAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplPropertiesEventTopics :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplPropertiesEventFilter :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplPropertiesVerbs :: Maybe ConfigNodePropertyArray
    
instance Arbitrary ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitInfo where
  arbitrary =
    ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitInfo
      <$> arbitrary -- comAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitInfoProperties :: Maybe ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties
    
instance Arbitrary ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties where
  arbitrary =
    ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties
      <$> arbitrary -- comAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitPropertiesEnable :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- comAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitPropertiesUgcLimit :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitPropertiesUgcLimitDuration :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitPropertiesDomains :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitPropertiesToList :: Maybe ConfigNodePropertyArray
    
instance Arbitrary ComAdobeCqSocialConnectOauthImplFacebookProviderImplInfo where
  arbitrary =
    ComAdobeCqSocialConnectOauthImplFacebookProviderImplInfo
      <$> arbitrary -- comAdobeCqSocialConnectOauthImplFacebookProviderImplInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialConnectOauthImplFacebookProviderImplInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialConnectOauthImplFacebookProviderImplInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialConnectOauthImplFacebookProviderImplInfoProperties :: Maybe ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties
    
instance Arbitrary ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties where
  arbitrary =
    ComAdobeCqSocialConnectOauthImplFacebookProviderImplProperties
      <$> arbitrary -- comAdobeCqSocialConnectOauthImplFacebookProviderImplPropertiesOauthProviderId :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeCqSocialConnectOauthImplFacebookProviderImplPropertiesOauthCloudConfigRoot :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeCqSocialConnectOauthImplFacebookProviderImplPropertiesProviderConfigRoot :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeCqSocialConnectOauthImplFacebookProviderImplPropertiesProviderConfigCreateTagsEnabled :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- comAdobeCqSocialConnectOauthImplFacebookProviderImplPropertiesProviderConfigUserFolder :: Maybe ConfigNodePropertyDropDown
      <*> arbitrary -- comAdobeCqSocialConnectOauthImplFacebookProviderImplPropertiesProviderConfigFacebookFetchFields :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- comAdobeCqSocialConnectOauthImplFacebookProviderImplPropertiesProviderConfigFacebookFields :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comAdobeCqSocialConnectOauthImplFacebookProviderImplPropertiesProviderConfigRefreshUserdataEnabled :: Maybe ConfigNodePropertyBoolean
    
instance Arbitrary ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleInfo where
  arbitrary =
    ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleInfo
      <$> arbitrary -- comAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleInfoProperties :: Maybe ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleProperties
    
instance Arbitrary ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleProperties where
  arbitrary =
    ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleProperties
      <$> arbitrary -- comAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandlePropertiesPath :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandlePropertiesServiceRanking :: Maybe ConfigNodePropertyInteger
    
instance Arbitrary ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperInfo where
  arbitrary =
    ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperInfo
      <$> arbitrary -- comAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperInfoProperties :: Maybe ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties
    
instance Arbitrary ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties where
  arbitrary =
    ComAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperProperties
      <$> arbitrary -- comAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperPropertiesFacebook :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperPropertiesTwitter :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comAdobeCqSocialConnectOauthImplSocialOAuthUserProfileMapperPropertiesProviderConfigUserFolder :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComAdobeCqSocialConnectOauthImplTwitterProviderImplInfo where
  arbitrary =
    ComAdobeCqSocialConnectOauthImplTwitterProviderImplInfo
      <$> arbitrary -- comAdobeCqSocialConnectOauthImplTwitterProviderImplInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialConnectOauthImplTwitterProviderImplInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialConnectOauthImplTwitterProviderImplInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialConnectOauthImplTwitterProviderImplInfoProperties :: Maybe ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties
    
instance Arbitrary ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties where
  arbitrary =
    ComAdobeCqSocialConnectOauthImplTwitterProviderImplProperties
      <$> arbitrary -- comAdobeCqSocialConnectOauthImplTwitterProviderImplPropertiesOauthProviderId :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeCqSocialConnectOauthImplTwitterProviderImplPropertiesOauthCloudConfigRoot :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeCqSocialConnectOauthImplTwitterProviderImplPropertiesProviderConfigRoot :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeCqSocialConnectOauthImplTwitterProviderImplPropertiesProviderConfigUserFolder :: Maybe ConfigNodePropertyDropDown
      <*> arbitrary -- comAdobeCqSocialConnectOauthImplTwitterProviderImplPropertiesProviderConfigTwitterEnableParams :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- comAdobeCqSocialConnectOauthImplTwitterProviderImplPropertiesProviderConfigTwitterParams :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comAdobeCqSocialConnectOauthImplTwitterProviderImplPropertiesProviderConfigRefreshUserdataEnabled :: Maybe ConfigNodePropertyBoolean
    
instance Arbitrary ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenInfo where
  arbitrary =
    ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenInfo
      <$> arbitrary -- comAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenInfoProperties :: Maybe ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties
    
instance Arbitrary ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties where
  arbitrary =
    ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties
      <$> arbitrary -- comAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenPropertiesCqSocialContentFragmentsServicesEnabled :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- comAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenPropertiesCqSocialContentFragmentsServicesWaitTimeSeconds :: Maybe ConfigNodePropertyInteger
    
instance Arbitrary ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryInfo where
  arbitrary =
    ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryInfo
      <$> arbitrary -- comAdobeCqSocialDatastoreAsImplASResourceProviderFactoryInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialDatastoreAsImplASResourceProviderFactoryInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialDatastoreAsImplASResourceProviderFactoryInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialDatastoreAsImplASResourceProviderFactoryInfoProperties :: Maybe ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties
    
instance Arbitrary ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties where
  arbitrary =
    ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties
      <$> arbitrary -- comAdobeCqSocialDatastoreAsImplASResourceProviderFactoryPropertiesVersionId :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeCqSocialDatastoreAsImplASResourceProviderFactoryPropertiesCacheOn :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- comAdobeCqSocialDatastoreAsImplASResourceProviderFactoryPropertiesConcurrencyLevel :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comAdobeCqSocialDatastoreAsImplASResourceProviderFactoryPropertiesCacheStartSize :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comAdobeCqSocialDatastoreAsImplASResourceProviderFactoryPropertiesCacheTtl :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comAdobeCqSocialDatastoreAsImplASResourceProviderFactoryPropertiesCacheSize :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comAdobeCqSocialDatastoreAsImplASResourceProviderFactoryPropertiesTimeLimit :: Maybe ConfigNodePropertyInteger
    
instance Arbitrary ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryInfo where
  arbitrary =
    ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryInfo
      <$> arbitrary -- comAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryInfoProperties :: Maybe ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties
    
instance Arbitrary ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties where
  arbitrary =
    ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties
      <$> arbitrary -- comAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryPropertiesSolrZkTimeout :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryPropertiesSolrCommit :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryPropertiesCacheOn :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- comAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryPropertiesConcurrencyLevel :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryPropertiesCacheStartSize :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryPropertiesCacheTtl :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryPropertiesCacheSize :: Maybe ConfigNodePropertyInteger
    
instance Arbitrary ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorInfo where
  arbitrary =
    ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorInfo
      <$> arbitrary -- comAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorInfoProperties :: Maybe ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties
    
instance Arbitrary ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties where
  arbitrary =
    ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties
      <$> arbitrary -- comAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorPropertiesSolrZkTimeout :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorPropertiesSolrCommit :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorPropertiesCacheOn :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- comAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorPropertiesConcurrencyLevel :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorPropertiesCacheStartSize :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorPropertiesCacheTtl :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorPropertiesCacheSize :: Maybe ConfigNodePropertyInteger
    
instance Arbitrary ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFInfo where
  arbitrary =
    ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFInfo
      <$> arbitrary -- comAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFInfoProperties :: Maybe ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFProperties
    
instance Arbitrary ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFProperties where
  arbitrary =
    ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFProperties
      <$> arbitrary -- comAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFPropertiesIsMemberCheck :: Maybe ConfigNodePropertyBoolean
    
instance Arbitrary ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoInfo where
  arbitrary =
    ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoInfo
      <$> arbitrary -- comAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoInfoProperties :: Maybe ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties
    
instance Arbitrary ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties where
  arbitrary =
    ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties
      <$> arbitrary -- comAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoPropertiesIsMemberCheck :: Maybe ConfigNodePropertyBoolean
    
instance Arbitrary ComAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLInfo where
  arbitrary =
    ComAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLInfo
      <$> arbitrary -- comAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLInfoProperties :: Maybe ComAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLProperties
    
instance Arbitrary ComAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLProperties where
  arbitrary =
    ComAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLProperties
      <$> arbitrary -- comAdobeCqSocialEnablementLearningpathEndpointsImplEnablementLPropertiesFieldWhitelist :: Maybe ConfigNodePropertyArray
    
instance Arbitrary ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResouInfo where
  arbitrary =
    ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResouInfo
      <$> arbitrary -- comAdobeCqSocialEnablementResourceEndpointsImplEnablementResouInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialEnablementResourceEndpointsImplEnablementResouInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialEnablementResourceEndpointsImplEnablementResouInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialEnablementResourceEndpointsImplEnablementResouInfoProperties :: Maybe ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResouProperties
    
instance Arbitrary ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResouProperties where
  arbitrary =
    ComAdobeCqSocialEnablementResourceEndpointsImplEnablementResouProperties
      <$> arbitrary -- comAdobeCqSocialEnablementResourceEndpointsImplEnablementResouPropertiesFieldWhitelist :: Maybe ConfigNodePropertyArray
    
instance Arbitrary ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplInfo where
  arbitrary =
    ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplInfo
      <$> arbitrary -- comAdobeCqSocialEnablementServicesImplAuthorMarkerImplInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialEnablementServicesImplAuthorMarkerImplInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialEnablementServicesImplAuthorMarkerImplInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialEnablementServicesImplAuthorMarkerImplInfoProperties :: Maybe ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplProperties
      <*> arbitrary -- comAdobeCqSocialEnablementServicesImplAuthorMarkerImplInfoBundleLocation :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialEnablementServicesImplAuthorMarkerImplInfoServiceLocation :: Maybe Text
    
instance Arbitrary ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplProperties where
  arbitrary =
    ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplProperties
      <$> arbitrary -- comAdobeCqSocialEnablementServicesImplAuthorMarkerImplPropertiesServiceRanking :: Maybe ConfigNodePropertyInteger
    
instance Arbitrary ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGeInfo where
  arbitrary =
    ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGeInfo
      <$> arbitrary -- comAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGeInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGeInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGeInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGeInfoProperties :: Maybe ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGeProperties
    
instance Arbitrary ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGeProperties where
  arbitrary =
    ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGeProperties
      <$> arbitrary -- comAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGePropertiesSlingServletSelectors :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGePropertiesSlingServletExtensions :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaInfo where
  arbitrary =
    ComAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaInfo
      <$> arbitrary -- comAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaInfoProperties :: Maybe ComAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaProperties
    
instance Arbitrary ComAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaProperties where
  arbitrary =
    ComAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaProperties
      <$> arbitrary -- comAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaPropertiesFieldWhitelist :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comAdobeCqSocialFilelibraryClientEndpointsImplFileLibraryOperaPropertiesAttachmentTypeBlacklist :: Maybe ConfigNodePropertyArray
    
instance Arbitrary ComAdobeCqSocialForumClientEndpointsImplForumOperationsServiceInfo where
  arbitrary =
    ComAdobeCqSocialForumClientEndpointsImplForumOperationsServiceInfo
      <$> arbitrary -- comAdobeCqSocialForumClientEndpointsImplForumOperationsServiceInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialForumClientEndpointsImplForumOperationsServiceInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialForumClientEndpointsImplForumOperationsServiceInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialForumClientEndpointsImplForumOperationsServiceInfoProperties :: Maybe ComAdobeCqSocialForumClientEndpointsImplForumOperationsServiceProperties
    
instance Arbitrary ComAdobeCqSocialForumClientEndpointsImplForumOperationsServiceProperties where
  arbitrary =
    ComAdobeCqSocialForumClientEndpointsImplForumOperationsServiceProperties
      <$> arbitrary -- comAdobeCqSocialForumClientEndpointsImplForumOperationsServicePropertiesFieldWhitelist :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comAdobeCqSocialForumClientEndpointsImplForumOperationsServicePropertiesAttachmentTypeBlacklist :: Maybe ConfigNodePropertyArray
    
instance Arbitrary ComAdobeCqSocialForumDispatcherImplFlushOperationsInfo where
  arbitrary =
    ComAdobeCqSocialForumDispatcherImplFlushOperationsInfo
      <$> arbitrary -- comAdobeCqSocialForumDispatcherImplFlushOperationsInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialForumDispatcherImplFlushOperationsInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialForumDispatcherImplFlushOperationsInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialForumDispatcherImplFlushOperationsInfoProperties :: Maybe ComAdobeCqSocialForumDispatcherImplFlushOperationsProperties
    
instance Arbitrary ComAdobeCqSocialForumDispatcherImplFlushOperationsProperties where
  arbitrary =
    ComAdobeCqSocialForumDispatcherImplFlushOperationsProperties
      <$> arbitrary -- comAdobeCqSocialForumDispatcherImplFlushOperationsPropertiesExtensionOrder :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comAdobeCqSocialForumDispatcherImplFlushOperationsPropertiesFlushForumontopic :: Maybe ConfigNodePropertyBoolean
    
instance Arbitrary ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenInfo where
  arbitrary =
    ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenInfo
      <$> arbitrary -- comAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenInfoProperties :: Maybe ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties
    
instance Arbitrary ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties where
  arbitrary =
    ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties
      <$> arbitrary -- comAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenPropertiesGroupListingPaginationEnable :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- comAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenPropertiesGroupListingLazyloadingEnable :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- comAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenPropertiesPageSize :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenPropertiesPriority :: Maybe ConfigNodePropertyInteger
    
instance Arbitrary ComAdobeCqSocialGroupImplGroupServiceImplInfo where
  arbitrary =
    ComAdobeCqSocialGroupImplGroupServiceImplInfo
      <$> arbitrary -- comAdobeCqSocialGroupImplGroupServiceImplInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialGroupImplGroupServiceImplInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialGroupImplGroupServiceImplInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialGroupImplGroupServiceImplInfoProperties :: Maybe ComAdobeCqSocialGroupImplGroupServiceImplProperties
    
instance Arbitrary ComAdobeCqSocialGroupImplGroupServiceImplProperties where
  arbitrary =
    ComAdobeCqSocialGroupImplGroupServiceImplProperties
      <$> arbitrary -- comAdobeCqSocialGroupImplGroupServiceImplPropertiesMaxWaitTime :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comAdobeCqSocialGroupImplGroupServiceImplPropertiesMinWaitBetweenRetries :: Maybe ConfigNodePropertyInteger
    
instance Arbitrary ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplInfo where
  arbitrary =
    ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplInfo
      <$> arbitrary -- comAdobeCqSocialHandlebarsGuavaTemplateCacheImplInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialHandlebarsGuavaTemplateCacheImplInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialHandlebarsGuavaTemplateCacheImplInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialHandlebarsGuavaTemplateCacheImplInfoProperties :: Maybe ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties
      <*> arbitrary -- comAdobeCqSocialHandlebarsGuavaTemplateCacheImplInfoBundleLocation :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialHandlebarsGuavaTemplateCacheImplInfoServiceLocation :: Maybe Text
    
instance Arbitrary ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties where
  arbitrary =
    ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties
      <$> arbitrary -- comAdobeCqSocialHandlebarsGuavaTemplateCacheImplPropertiesParameterGuavaCacheEnabled :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- comAdobeCqSocialHandlebarsGuavaTemplateCacheImplPropertiesParameterGuavaCacheParams :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeCqSocialHandlebarsGuavaTemplateCacheImplPropertiesParameterGuavaCacheReload :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- comAdobeCqSocialHandlebarsGuavaTemplateCacheImplPropertiesServiceRanking :: Maybe ConfigNodePropertyInteger
    
instance Arbitrary ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSInfo where
  arbitrary =
    ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSInfo
      <$> arbitrary -- comAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSInfoProperties :: Maybe ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSProperties
    
instance Arbitrary ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSProperties where
  arbitrary =
    ComAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSProperties
      <$> arbitrary -- comAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSPropertiesFieldWhitelist :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSPropertiesAttachmentTypeBlacklist :: Maybe ConfigNodePropertyArray
    
instance Arbitrary ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerInfo where
  arbitrary =
    ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerInfo
      <$> arbitrary -- comAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerInfoProperties :: Maybe ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerProperties
    
instance Arbitrary ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerProperties where
  arbitrary =
    ComAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerProperties
      <$> arbitrary -- comAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerPropertiesFieldWhitelist :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comAdobeCqSocialJournalClientEndpointsImplJournalOperationsSerPropertiesAttachmentTypeBlacklist :: Maybe ConfigNodePropertyArray
    
instance Arbitrary ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileInfo where
  arbitrary =
    ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileInfo
      <$> arbitrary -- comAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileInfoProperties :: Maybe ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileProperties
    
instance Arbitrary ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileProperties where
  arbitrary =
    ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileProperties
      <$> arbitrary -- comAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfilePropertiesFieldWhitelist :: Maybe ConfigNodePropertyArray
    
instance Arbitrary ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOInfo where
  arbitrary =
    ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOInfo
      <$> arbitrary -- comAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOInfoProperties :: Maybe ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOProperties
    
instance Arbitrary ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOProperties where
  arbitrary =
    ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOProperties
      <$> arbitrary -- comAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOPropertiesFieldWhitelist :: Maybe ConfigNodePropertyArray
    
instance Arbitrary ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFInfo where
  arbitrary =
    ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFInfo
      <$> arbitrary -- comAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFInfoProperties :: Maybe ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties
    
instance Arbitrary ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties where
  arbitrary =
    ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties
      <$> arbitrary -- comAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFPropertiesEveryoneLimit :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFPropertiesPriority :: Maybe ConfigNodePropertyInteger
    
instance Arbitrary ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationInfo where
  arbitrary =
    ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationInfo
      <$> arbitrary -- comAdobeCqSocialMessagingClientEndpointsImplMessagingOperationInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialMessagingClientEndpointsImplMessagingOperationInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialMessagingClientEndpointsImplMessagingOperationInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialMessagingClientEndpointsImplMessagingOperationInfoProperties :: Maybe ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties
    
instance Arbitrary ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties where
  arbitrary =
    ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties
      <$> arbitrary -- comAdobeCqSocialMessagingClientEndpointsImplMessagingOperationPropertiesMessageProperties :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comAdobeCqSocialMessagingClientEndpointsImplMessagingOperationPropertiesMessageBoxSizeLimit :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comAdobeCqSocialMessagingClientEndpointsImplMessagingOperationPropertiesMessageCountLimit :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comAdobeCqSocialMessagingClientEndpointsImplMessagingOperationPropertiesNotifyFailure :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- comAdobeCqSocialMessagingClientEndpointsImplMessagingOperationPropertiesFailureMessageFrom :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeCqSocialMessagingClientEndpointsImplMessagingOperationPropertiesFailureTemplatePath :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeCqSocialMessagingClientEndpointsImplMessagingOperationPropertiesMaxRetries :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comAdobeCqSocialMessagingClientEndpointsImplMessagingOperationPropertiesMinWaitBetweenRetries :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comAdobeCqSocialMessagingClientEndpointsImplMessagingOperationPropertiesCountUpdatePoolSize :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comAdobeCqSocialMessagingClientEndpointsImplMessagingOperationPropertiesInboxPath :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeCqSocialMessagingClientEndpointsImplMessagingOperationPropertiesSentitemsPath :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeCqSocialMessagingClientEndpointsImplMessagingOperationPropertiesSupportAttachments :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- comAdobeCqSocialMessagingClientEndpointsImplMessagingOperationPropertiesSupportGroupMessaging :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- comAdobeCqSocialMessagingClientEndpointsImplMessagingOperationPropertiesMaxTotalRecipients :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comAdobeCqSocialMessagingClientEndpointsImplMessagingOperationPropertiesBatchSize :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comAdobeCqSocialMessagingClientEndpointsImplMessagingOperationPropertiesMaxTotalAttachmentSize :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comAdobeCqSocialMessagingClientEndpointsImplMessagingOperationPropertiesAttachmentTypeBlacklist :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comAdobeCqSocialMessagingClientEndpointsImplMessagingOperationPropertiesAllowedAttachmentTypes :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comAdobeCqSocialMessagingClientEndpointsImplMessagingOperationPropertiesServiceSelector :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeCqSocialMessagingClientEndpointsImplMessagingOperationPropertiesFieldWhitelist :: Maybe ConfigNodePropertyArray
    
instance Arbitrary ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenInfo where
  arbitrary =
    ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenInfo
      <$> arbitrary -- comAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenInfoProperties :: Maybe ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenProperties
    
instance Arbitrary ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenProperties where
  arbitrary =
    ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenProperties
      <$> arbitrary -- comAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenPropertiesResourceTypeFilters :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenPropertiesPriority :: Maybe ConfigNodePropertyInteger
    
instance Arbitrary ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialInfo where
  arbitrary =
    ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialInfo
      <$> arbitrary -- comAdobeCqSocialModerationDashboardApiModerationDashboardSocialInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialModerationDashboardApiModerationDashboardSocialInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialModerationDashboardApiModerationDashboardSocialInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialModerationDashboardApiModerationDashboardSocialInfoProperties :: Maybe ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialProperties
    
instance Arbitrary ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialProperties where
  arbitrary =
    ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialProperties
      <$> arbitrary -- comAdobeCqSocialModerationDashboardApiModerationDashboardSocialPropertiesPriority :: Maybe ConfigNodePropertyInteger
    
instance Arbitrary ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenInfo where
  arbitrary =
    ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenInfo
      <$> arbitrary -- comAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenInfoProperties :: Maybe ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenProperties
    
instance Arbitrary ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenProperties where
  arbitrary =
    ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenProperties
      <$> arbitrary -- comAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenPropertiesPriority :: Maybe ConfigNodePropertyInteger
    
instance Arbitrary ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociInfo where
  arbitrary =
    ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociInfo
      <$> arbitrary -- comAdobeCqSocialModerationDashboardInternalImplFilterGroupSociInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialModerationDashboardInternalImplFilterGroupSociInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialModerationDashboardInternalImplFilterGroupSociInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialModerationDashboardInternalImplFilterGroupSociInfoProperties :: Maybe ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties
    
instance Arbitrary ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties where
  arbitrary =
    ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties
      <$> arbitrary -- comAdobeCqSocialModerationDashboardInternalImplFilterGroupSociPropertiesResourceTypeFilters :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comAdobeCqSocialModerationDashboardInternalImplFilterGroupSociPropertiesPriority :: Maybe ConfigNodePropertyInteger
    
instance Arbitrary ComAdobeCqSocialNotificationsImplMentionsRouterInfo where
  arbitrary =
    ComAdobeCqSocialNotificationsImplMentionsRouterInfo
      <$> arbitrary -- comAdobeCqSocialNotificationsImplMentionsRouterInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialNotificationsImplMentionsRouterInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialNotificationsImplMentionsRouterInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialNotificationsImplMentionsRouterInfoProperties :: Maybe ComAdobeCqSocialNotificationsImplMentionsRouterProperties
    
instance Arbitrary ComAdobeCqSocialNotificationsImplMentionsRouterProperties where
  arbitrary =
    ComAdobeCqSocialNotificationsImplMentionsRouterProperties
      <$> arbitrary -- comAdobeCqSocialNotificationsImplMentionsRouterPropertiesEventTopics :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeCqSocialNotificationsImplMentionsRouterPropertiesEventFilter :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComAdobeCqSocialNotificationsImplNotificationManagerImplInfo where
  arbitrary =
    ComAdobeCqSocialNotificationsImplNotificationManagerImplInfo
      <$> arbitrary -- comAdobeCqSocialNotificationsImplNotificationManagerImplInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialNotificationsImplNotificationManagerImplInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialNotificationsImplNotificationManagerImplInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialNotificationsImplNotificationManagerImplInfoProperties :: Maybe ComAdobeCqSocialNotificationsImplNotificationManagerImplProperties
    
instance Arbitrary ComAdobeCqSocialNotificationsImplNotificationManagerImplProperties where
  arbitrary =
    ComAdobeCqSocialNotificationsImplNotificationManagerImplProperties
      <$> arbitrary -- comAdobeCqSocialNotificationsImplNotificationManagerImplPropertiesMaxUnreadNotificationCount :: Maybe ConfigNodePropertyInteger
    
instance Arbitrary ComAdobeCqSocialNotificationsImplNotificationsRouterInfo where
  arbitrary =
    ComAdobeCqSocialNotificationsImplNotificationsRouterInfo
      <$> arbitrary -- comAdobeCqSocialNotificationsImplNotificationsRouterInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialNotificationsImplNotificationsRouterInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialNotificationsImplNotificationsRouterInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialNotificationsImplNotificationsRouterInfoProperties :: Maybe ComAdobeCqSocialNotificationsImplNotificationsRouterProperties
    
instance Arbitrary ComAdobeCqSocialNotificationsImplNotificationsRouterProperties where
  arbitrary =
    ComAdobeCqSocialNotificationsImplNotificationsRouterProperties
      <$> arbitrary -- comAdobeCqSocialNotificationsImplNotificationsRouterPropertiesEventTopics :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeCqSocialNotificationsImplNotificationsRouterPropertiesEventFilter :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicInfo where
  arbitrary =
    ComAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicInfo
      <$> arbitrary -- comAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicInfoProperties :: Maybe ComAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicProperties
    
instance Arbitrary ComAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicProperties where
  arbitrary =
    ComAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicProperties
      <$> arbitrary -- comAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicPropertiesFieldWhitelist :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comAdobeCqSocialQnaClientEndpointsImplQnaForumOperationsServicPropertiesAttachmentTypeBlacklist :: Maybe ConfigNodePropertyArray
    
instance Arbitrary ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIInfo where
  arbitrary =
    ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIInfo
      <$> arbitrary -- comAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIInfoProperties :: Maybe ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIProperties
    
instance Arbitrary ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIProperties where
  arbitrary =
    ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIProperties
      <$> arbitrary -- comAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIPropertiesCqSocialReportingAnalyticsPollingImporterInterval :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportIPropertiesCqSocialReportingAnalyticsPollingImporterPageSize :: Maybe ConfigNodePropertyInteger
    
instance Arbitrary ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMInfo where
  arbitrary =
    ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMInfo
      <$> arbitrary -- comAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMInfoProperties :: Maybe ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMProperties
    
instance Arbitrary ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMProperties where
  arbitrary =
    ComAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMProperties
      <$> arbitrary -- comAdobeCqSocialReportingAnalyticsServicesImplAnalyticsReportMPropertiesReportFetchDelay :: Maybe ConfigNodePropertyInteger
    
instance Arbitrary ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSInfo where
  arbitrary =
    ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSInfo
      <$> arbitrary -- comAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSInfoProperties :: Maybe ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties
    
instance Arbitrary ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties where
  arbitrary =
    ComAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSProperties
      <$> arbitrary -- comAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSPropertiesCqSocialConsoleAnalyticsSitesMapping :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comAdobeCqSocialReportingAnalyticsServicesImplSiteTrendReportSPropertiesPriority :: Maybe ConfigNodePropertyInteger
    
instance Arbitrary ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiInfo where
  arbitrary =
    ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiInfo
      <$> arbitrary -- comAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiInfoProperties :: Maybe ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiProperties
    
instance Arbitrary ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiProperties where
  arbitrary =
    ComAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiProperties
      <$> arbitrary -- comAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiPropertiesFieldWhitelist :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comAdobeCqSocialReviewClientEndpointsImplReviewOperationsServiPropertiesAttachmentTypeBlacklist :: Maybe ConfigNodePropertyArray
    
instance Arbitrary ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletInfo where
  arbitrary =
    ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletInfo
      <$> arbitrary -- comAdobeCqSocialScfCoreOperationsImplSocialOperationsServletInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialScfCoreOperationsImplSocialOperationsServletInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialScfCoreOperationsImplSocialOperationsServletInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialScfCoreOperationsImplSocialOperationsServletInfoProperties :: Maybe ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties
    
instance Arbitrary ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties where
  arbitrary =
    ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties
      <$> arbitrary -- comAdobeCqSocialScfCoreOperationsImplSocialOperationsServletPropertiesSlingServletSelectors :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeCqSocialScfCoreOperationsImplSocialOperationsServletPropertiesSlingServletExtensions :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletInfo where
  arbitrary =
    ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletInfo
      <$> arbitrary -- comAdobeCqSocialScfEndpointsImplDefaultSocialGetServletInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialScfEndpointsImplDefaultSocialGetServletInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialScfEndpointsImplDefaultSocialGetServletInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialScfEndpointsImplDefaultSocialGetServletInfoProperties :: Maybe ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties
    
instance Arbitrary ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties where
  arbitrary =
    ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties
      <$> arbitrary -- comAdobeCqSocialScfEndpointsImplDefaultSocialGetServletPropertiesSlingServletSelectors :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comAdobeCqSocialScfEndpointsImplDefaultSocialGetServletPropertiesSlingServletExtensions :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComAdobeCqSocialScoringImplScoringEventListenerInfo where
  arbitrary =
    ComAdobeCqSocialScoringImplScoringEventListenerInfo
      <$> arbitrary -- comAdobeCqSocialScoringImplScoringEventListenerInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialScoringImplScoringEventListenerInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialScoringImplScoringEventListenerInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialScoringImplScoringEventListenerInfoProperties :: Maybe ComAdobeCqSocialScoringImplScoringEventListenerProperties
    
instance Arbitrary ComAdobeCqSocialScoringImplScoringEventListenerProperties where
  arbitrary =
    ComAdobeCqSocialScoringImplScoringEventListenerProperties
      <$> arbitrary -- comAdobeCqSocialScoringImplScoringEventListenerPropertiesEventTopics :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeCqSocialScoringImplScoringEventListenerPropertiesEventFilter :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplInfo where
  arbitrary =
    ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplInfo
      <$> arbitrary -- comAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplInfoProperties :: Maybe ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties
    
instance Arbitrary ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties where
  arbitrary =
    ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties
      <$> arbitrary -- comAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplPropertiesEnableFallback :: Maybe ConfigNodePropertyBoolean
    
instance Arbitrary ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceInfo where
  arbitrary =
    ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceInfo
      <$> arbitrary -- comAdobeCqSocialSiteEndpointsImplSiteOperationServiceInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialSiteEndpointsImplSiteOperationServiceInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialSiteEndpointsImplSiteOperationServiceInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialSiteEndpointsImplSiteOperationServiceInfoProperties :: Maybe ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties
    
instance Arbitrary ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties where
  arbitrary =
    ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties
      <$> arbitrary -- comAdobeCqSocialSiteEndpointsImplSiteOperationServicePropertiesFieldWhitelist :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comAdobeCqSocialSiteEndpointsImplSiteOperationServicePropertiesSitePathFilters :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comAdobeCqSocialSiteEndpointsImplSiteOperationServicePropertiesSitePackageGroup :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImInfo where
  arbitrary =
    ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImInfo
      <$> arbitrary -- comAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImInfoProperties :: Maybe ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties
    
instance Arbitrary ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties where
  arbitrary =
    ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties
      <$> arbitrary -- comAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImPropertiesCqSocialConsoleAnalyticsComponents :: Maybe ConfigNodePropertyArray
    
instance Arbitrary ComAdobeCqSocialSiteImplSiteConfiguratorImplInfo where
  arbitrary =
    ComAdobeCqSocialSiteImplSiteConfiguratorImplInfo
      <$> arbitrary -- comAdobeCqSocialSiteImplSiteConfiguratorImplInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialSiteImplSiteConfiguratorImplInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialSiteImplSiteConfiguratorImplInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialSiteImplSiteConfiguratorImplInfoProperties :: Maybe ComAdobeCqSocialSiteImplSiteConfiguratorImplProperties
    
instance Arbitrary ComAdobeCqSocialSiteImplSiteConfiguratorImplProperties where
  arbitrary =
    ComAdobeCqSocialSiteImplSiteConfiguratorImplProperties
      <$> arbitrary -- comAdobeCqSocialSiteImplSiteConfiguratorImplPropertiesComponentsUsingTags :: Maybe ConfigNodePropertyArray
    
instance Arbitrary ComAdobeCqSocialSrpImplSocialSolrConnectorInfo where
  arbitrary =
    ComAdobeCqSocialSrpImplSocialSolrConnectorInfo
      <$> arbitrary -- comAdobeCqSocialSrpImplSocialSolrConnectorInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialSrpImplSocialSolrConnectorInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialSrpImplSocialSolrConnectorInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialSrpImplSocialSolrConnectorInfoProperties :: Maybe ComAdobeCqSocialSrpImplSocialSolrConnectorProperties
    
instance Arbitrary ComAdobeCqSocialSrpImplSocialSolrConnectorProperties where
  arbitrary =
    ComAdobeCqSocialSrpImplSocialSolrConnectorProperties
      <$> arbitrary -- comAdobeCqSocialSrpImplSocialSolrConnectorPropertiesSrpType :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComAdobeCqSocialSyncImplDiffChangesObserverInfo where
  arbitrary =
    ComAdobeCqSocialSyncImplDiffChangesObserverInfo
      <$> arbitrary -- comAdobeCqSocialSyncImplDiffChangesObserverInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialSyncImplDiffChangesObserverInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialSyncImplDiffChangesObserverInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialSyncImplDiffChangesObserverInfoProperties :: Maybe ComAdobeCqSocialSyncImplDiffChangesObserverProperties
    
instance Arbitrary ComAdobeCqSocialSyncImplDiffChangesObserverProperties where
  arbitrary =
    ComAdobeCqSocialSyncImplDiffChangesObserverProperties
      <$> arbitrary -- comAdobeCqSocialSyncImplDiffChangesObserverPropertiesEnabled :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- comAdobeCqSocialSyncImplDiffChangesObserverPropertiesAgentName :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeCqSocialSyncImplDiffChangesObserverPropertiesDiffPath :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeCqSocialSyncImplDiffChangesObserverPropertiesPropertyNames :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComAdobeCqSocialSyncImplGroupSyncListenerImplInfo where
  arbitrary =
    ComAdobeCqSocialSyncImplGroupSyncListenerImplInfo
      <$> arbitrary -- comAdobeCqSocialSyncImplGroupSyncListenerImplInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialSyncImplGroupSyncListenerImplInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialSyncImplGroupSyncListenerImplInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialSyncImplGroupSyncListenerImplInfoProperties :: Maybe ComAdobeCqSocialSyncImplGroupSyncListenerImplProperties
    
instance Arbitrary ComAdobeCqSocialSyncImplGroupSyncListenerImplProperties where
  arbitrary =
    ComAdobeCqSocialSyncImplGroupSyncListenerImplProperties
      <$> arbitrary -- comAdobeCqSocialSyncImplGroupSyncListenerImplPropertiesNodetypes :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comAdobeCqSocialSyncImplGroupSyncListenerImplPropertiesIgnorableprops :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comAdobeCqSocialSyncImplGroupSyncListenerImplPropertiesIgnorablenodes :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeCqSocialSyncImplGroupSyncListenerImplPropertiesEnabled :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- comAdobeCqSocialSyncImplGroupSyncListenerImplPropertiesDistfolders :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComAdobeCqSocialSyncImplPublisherSyncServiceImplInfo where
  arbitrary =
    ComAdobeCqSocialSyncImplPublisherSyncServiceImplInfo
      <$> arbitrary -- comAdobeCqSocialSyncImplPublisherSyncServiceImplInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialSyncImplPublisherSyncServiceImplInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialSyncImplPublisherSyncServiceImplInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialSyncImplPublisherSyncServiceImplInfoProperties :: Maybe ComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties
    
instance Arbitrary ComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties where
  arbitrary =
    ComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties
      <$> arbitrary -- comAdobeCqSocialSyncImplPublisherSyncServiceImplPropertiesActiveRunModes :: Maybe ConfigNodePropertyArray
    
instance Arbitrary ComAdobeCqSocialSyncImplUserSyncListenerImplInfo where
  arbitrary =
    ComAdobeCqSocialSyncImplUserSyncListenerImplInfo
      <$> arbitrary -- comAdobeCqSocialSyncImplUserSyncListenerImplInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialSyncImplUserSyncListenerImplInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialSyncImplUserSyncListenerImplInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialSyncImplUserSyncListenerImplInfoProperties :: Maybe ComAdobeCqSocialSyncImplUserSyncListenerImplProperties
    
instance Arbitrary ComAdobeCqSocialSyncImplUserSyncListenerImplProperties where
  arbitrary =
    ComAdobeCqSocialSyncImplUserSyncListenerImplProperties
      <$> arbitrary -- comAdobeCqSocialSyncImplUserSyncListenerImplPropertiesNodetypes :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comAdobeCqSocialSyncImplUserSyncListenerImplPropertiesIgnorableprops :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comAdobeCqSocialSyncImplUserSyncListenerImplPropertiesIgnorablenodes :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comAdobeCqSocialSyncImplUserSyncListenerImplPropertiesEnabled :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- comAdobeCqSocialSyncImplUserSyncListenerImplPropertiesDistfolders :: Maybe ConfigNodePropertyArray
    
instance Arbitrary ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerInfo where
  arbitrary =
    ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerInfo
      <$> arbitrary -- comAdobeCqSocialTranslationImplTranslationServiceConfigManagerInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialTranslationImplTranslationServiceConfigManagerInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialTranslationImplTranslationServiceConfigManagerInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialTranslationImplTranslationServiceConfigManagerInfoProperties :: Maybe ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties
    
instance Arbitrary ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties where
  arbitrary =
    ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties
      <$> arbitrary -- comAdobeCqSocialTranslationImplTranslationServiceConfigManagerPropertiesTranslateLanguage :: Maybe ConfigNodePropertyDropDown
      <*> arbitrary -- comAdobeCqSocialTranslationImplTranslationServiceConfigManagerPropertiesTranslateDisplay :: Maybe ConfigNodePropertyDropDown
      <*> arbitrary -- comAdobeCqSocialTranslationImplTranslationServiceConfigManagerPropertiesTranslateAttribution :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- comAdobeCqSocialTranslationImplTranslationServiceConfigManagerPropertiesTranslateCaching :: Maybe ConfigNodePropertyDropDown
      <*> arbitrary -- comAdobeCqSocialTranslationImplTranslationServiceConfigManagerPropertiesTranslateSmartRendering :: Maybe ConfigNodePropertyDropDown
      <*> arbitrary -- comAdobeCqSocialTranslationImplTranslationServiceConfigManagerPropertiesTranslateCachingDuration :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeCqSocialTranslationImplTranslationServiceConfigManagerPropertiesTranslateSessionSaveInterval :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeCqSocialTranslationImplTranslationServiceConfigManagerPropertiesTranslateSessionSaveBatchLimit :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComAdobeCqSocialTranslationImplUGCLanguageDetectorInfo where
  arbitrary =
    ComAdobeCqSocialTranslationImplUGCLanguageDetectorInfo
      <$> arbitrary -- comAdobeCqSocialTranslationImplUGCLanguageDetectorInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialTranslationImplUGCLanguageDetectorInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialTranslationImplUGCLanguageDetectorInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialTranslationImplUGCLanguageDetectorInfoProperties :: Maybe ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties
    
instance Arbitrary ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties where
  arbitrary =
    ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties
      <$> arbitrary -- comAdobeCqSocialTranslationImplUGCLanguageDetectorPropertiesEventTopics :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeCqSocialTranslationImplUGCLanguageDetectorPropertiesEventFilter :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeCqSocialTranslationImplUGCLanguageDetectorPropertiesTranslateListenerType :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comAdobeCqSocialTranslationImplUGCLanguageDetectorPropertiesTranslatePropertyList :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comAdobeCqSocialTranslationImplUGCLanguageDetectorPropertiesPoolSize :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comAdobeCqSocialTranslationImplUGCLanguageDetectorPropertiesMaxPoolSize :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comAdobeCqSocialTranslationImplUGCLanguageDetectorPropertiesQueueSize :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comAdobeCqSocialTranslationImplUGCLanguageDetectorPropertiesKeepAliveTime :: Maybe ConfigNodePropertyInteger
    
instance Arbitrary ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplInfo where
  arbitrary =
    ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplInfo
      <$> arbitrary -- comAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplInfoProperties :: Maybe ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties
    
instance Arbitrary ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties where
  arbitrary =
    ComAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplProperties
      <$> arbitrary -- comAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplPropertiesThreadPoolSize :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplPropertiesDelayTime :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comAdobeCqSocialUgcbaseDispatcherImplFlushServiceImplPropertiesWorkerSleepTime :: Maybe ConfigNodePropertyInteger
    
instance Arbitrary ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplInfo where
  arbitrary =
    ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplInfo
      <$> arbitrary -- comAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplInfoProperties :: Maybe ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties
    
instance Arbitrary ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties where
  arbitrary =
    ComAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplProperties
      <$> arbitrary -- comAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplPropertiesPoolSize :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplPropertiesMaxPoolSize :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplPropertiesQueueSize :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comAdobeCqSocialUgcbaseImplAysncReverseReplicatorImplPropertiesKeepAliveTime :: Maybe ConfigNodePropertyInteger
    
instance Arbitrary ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplInfo where
  arbitrary =
    ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplInfo
      <$> arbitrary -- comAdobeCqSocialUgcbaseImplPublisherConfigurationImplInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialUgcbaseImplPublisherConfigurationImplInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialUgcbaseImplPublisherConfigurationImplInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialUgcbaseImplPublisherConfigurationImplInfoProperties :: Maybe ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties
    
instance Arbitrary ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties where
  arbitrary =
    ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties
      <$> arbitrary -- comAdobeCqSocialUgcbaseImplPublisherConfigurationImplPropertiesIsPrimaryPublisher :: Maybe ConfigNodePropertyBoolean
    
instance Arbitrary ComAdobeCqSocialUgcbaseImplSocialUtilsImplInfo where
  arbitrary =
    ComAdobeCqSocialUgcbaseImplSocialUtilsImplInfo
      <$> arbitrary -- comAdobeCqSocialUgcbaseImplSocialUtilsImplInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialUgcbaseImplSocialUtilsImplInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialUgcbaseImplSocialUtilsImplInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialUgcbaseImplSocialUtilsImplInfoProperties :: Maybe ComAdobeCqSocialUgcbaseImplSocialUtilsImplProperties
    
instance Arbitrary ComAdobeCqSocialUgcbaseImplSocialUtilsImplProperties where
  arbitrary =
    ComAdobeCqSocialUgcbaseImplSocialUtilsImplProperties
      <$> arbitrary -- comAdobeCqSocialUgcbaseImplSocialUtilsImplPropertiesLegacyCloudUgcPathMapping :: Maybe ConfigNodePropertyBoolean
    
instance Arbitrary ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplInfo where
  arbitrary =
    ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplInfo
      <$> arbitrary -- comAdobeCqSocialUgcbaseModerationImplAutoModerationImplInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialUgcbaseModerationImplAutoModerationImplInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialUgcbaseModerationImplAutoModerationImplInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialUgcbaseModerationImplAutoModerationImplInfoProperties :: Maybe ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties
    
instance Arbitrary ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties where
  arbitrary =
    ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties
      <$> arbitrary -- comAdobeCqSocialUgcbaseModerationImplAutoModerationImplPropertiesAutomoderationSequence :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comAdobeCqSocialUgcbaseModerationImplAutoModerationImplPropertiesAutomoderationOnfailurestop :: Maybe ConfigNodePropertyBoolean
    
instance Arbitrary ComAdobeCqSocialUgcbaseModerationImplSentimentProcessInfo where
  arbitrary =
    ComAdobeCqSocialUgcbaseModerationImplSentimentProcessInfo
      <$> arbitrary -- comAdobeCqSocialUgcbaseModerationImplSentimentProcessInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialUgcbaseModerationImplSentimentProcessInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialUgcbaseModerationImplSentimentProcessInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialUgcbaseModerationImplSentimentProcessInfoProperties :: Maybe ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties
    
instance Arbitrary ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties where
  arbitrary =
    ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties
      <$> arbitrary -- comAdobeCqSocialUgcbaseModerationImplSentimentProcessPropertiesWatchwordsPositive :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comAdobeCqSocialUgcbaseModerationImplSentimentProcessPropertiesWatchwordsNegative :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comAdobeCqSocialUgcbaseModerationImplSentimentProcessPropertiesWatchwordsPath :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeCqSocialUgcbaseModerationImplSentimentProcessPropertiesSentimentPath :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliInfo where
  arbitrary =
    ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliInfo
      <$> arbitrary -- comAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliInfoProperties :: Maybe ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliProperties
    
instance Arbitrary ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliProperties where
  arbitrary =
    ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliProperties
      <$> arbitrary -- comAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliPropertiesDefaultAttachmentTypeBlacklist :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliPropertiesBaselineAttachmentTypeBlacklist :: Maybe ConfigNodePropertyArray
    
instance Arbitrary ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplInfo where
  arbitrary =
    ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplInfo
      <$> arbitrary -- comAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplInfoProperties :: Maybe ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties
    
instance Arbitrary ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties where
  arbitrary =
    ComAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplProperties
      <$> arbitrary -- comAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplPropertiesParameterWhitelist :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplPropertiesParameterWhitelistPrefixes :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplPropertiesBinaryParameterWhitelist :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplPropertiesModifierWhitelist :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplPropertiesOperationWhitelist :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplPropertiesOperationWhitelistPrefixes :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplPropertiesTypehintWhitelist :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comAdobeCqSocialUgcbaseSecurityImplSaferSlingPostValidatorImplPropertiesResourcetypeWhitelist :: Maybe ConfigNodePropertyArray
    
instance Arbitrary ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletInfo where
  arbitrary =
    ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletInfo
      <$> arbitrary -- comAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletInfoProperties :: Maybe ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties
    
instance Arbitrary ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties where
  arbitrary =
    ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties
      <$> arbitrary -- comAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletPropertiesSlingServletExtensions :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletPropertiesSlingServletPaths :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletPropertiesSlingServletMethods :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComAdobeCqSocialUserImplTransportHttpToPublisherInfo where
  arbitrary =
    ComAdobeCqSocialUserImplTransportHttpToPublisherInfo
      <$> arbitrary -- comAdobeCqSocialUserImplTransportHttpToPublisherInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialUserImplTransportHttpToPublisherInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialUserImplTransportHttpToPublisherInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeCqSocialUserImplTransportHttpToPublisherInfoProperties :: Maybe ComAdobeCqSocialUserImplTransportHttpToPublisherProperties
    
instance Arbitrary ComAdobeCqSocialUserImplTransportHttpToPublisherProperties where
  arbitrary =
    ComAdobeCqSocialUserImplTransportHttpToPublisherProperties
      <$> arbitrary -- comAdobeCqSocialUserImplTransportHttpToPublisherPropertiesEnable :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- comAdobeCqSocialUserImplTransportHttpToPublisherPropertiesAgentConfiguration :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comAdobeCqSocialUserImplTransportHttpToPublisherPropertiesContextPath :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeCqSocialUserImplTransportHttpToPublisherPropertiesDisabledCipherSuites :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comAdobeCqSocialUserImplTransportHttpToPublisherPropertiesEnabledCipherSuites :: Maybe ConfigNodePropertyArray
    
instance Arbitrary ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactInfo where
  arbitrary =
    ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactInfo
      <$> arbitrary -- comAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactInfoProperties :: Maybe ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties
    
instance Arbitrary ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties where
  arbitrary =
    ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties
      <$> arbitrary -- comAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactPropertiesResourceTypes :: Maybe ConfigNodePropertyArray
    
instance Arbitrary ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupInfo where
  arbitrary =
    ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupInfo
      <$> arbitrary -- comAdobeCqUpgradesCleanupImplUpgradeContentCleanupInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeCqUpgradesCleanupImplUpgradeContentCleanupInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeCqUpgradesCleanupImplUpgradeContentCleanupInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeCqUpgradesCleanupImplUpgradeContentCleanupInfoProperties :: Maybe ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties
    
instance Arbitrary ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties where
  arbitrary =
    ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties
      <$> arbitrary -- comAdobeCqUpgradesCleanupImplUpgradeContentCleanupPropertiesDeletePathRegexps :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comAdobeCqUpgradesCleanupImplUpgradeContentCleanupPropertiesDeleteSql2Query :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupInfo where
  arbitrary =
    ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupInfo
      <$> arbitrary -- comAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupInfoProperties :: Maybe ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties
    
instance Arbitrary ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties where
  arbitrary =
    ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties
      <$> arbitrary -- comAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupPropertiesDeleteNameRegexps :: Maybe ConfigNodePropertyArray
    
instance Arbitrary ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceInfo where
  arbitrary =
    ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceInfo
      <$> arbitrary -- comAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceInfoProperties :: Maybe ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProperties
    
instance Arbitrary ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProperties where
  arbitrary =
    ComAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProperties
      <$> arbitrary -- comAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServicePropertiesThreshold :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServicePropertiesJobTopicName :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServicePropertiesEmailEnabled :: Maybe ConfigNodePropertyBoolean
    
instance Arbitrary ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskInfo where
  arbitrary =
    ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskInfo
      <$> arbitrary -- comAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskInfoProperties :: Maybe ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties
    
instance Arbitrary ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties where
  arbitrary =
    ComAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskProperties
      <$> arbitrary -- comAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskPropertiesSchedulerExpression :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskPropertiesJobPurgeThreshold :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comAdobeCqWcmJobsAsyncImplAsyncJobCleanUpTaskPropertiesJobPurgeMaxJobs :: Maybe ConfigNodePropertyInteger
    
instance Arbitrary ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceInfo where
  arbitrary =
    ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceInfo
      <$> arbitrary -- comAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceInfoProperties :: Maybe ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties
    
instance Arbitrary ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties where
  arbitrary =
    ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties
      <$> arbitrary -- comAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServicePropertiesThreshold :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServicePropertiesJobTopicName :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServicePropertiesEmailEnabled :: Maybe ConfigNodePropertyBoolean
    
instance Arbitrary ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceInfo where
  arbitrary =
    ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceInfo
      <$> arbitrary -- comAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceInfoProperties :: Maybe ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties
    
instance Arbitrary ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties where
  arbitrary =
    ComAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties
      <$> arbitrary -- comAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServicePropertiesThreshold :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServicePropertiesJobTopicName :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServicePropertiesEmailEnabled :: Maybe ConfigNodePropertyBoolean
    
instance Arbitrary ComAdobeCqWcmLaunchesImplLaunchesEventHandlerInfo where
  arbitrary =
    ComAdobeCqWcmLaunchesImplLaunchesEventHandlerInfo
      <$> arbitrary -- comAdobeCqWcmLaunchesImplLaunchesEventHandlerInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeCqWcmLaunchesImplLaunchesEventHandlerInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeCqWcmLaunchesImplLaunchesEventHandlerInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeCqWcmLaunchesImplLaunchesEventHandlerInfoProperties :: Maybe ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties
    
instance Arbitrary ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties where
  arbitrary =
    ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties
      <$> arbitrary -- comAdobeCqWcmLaunchesImplLaunchesEventHandlerPropertiesEventFilter :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeCqWcmLaunchesImplLaunchesEventHandlerPropertiesLaunchesEventhandlerThreadpoolMaxsize :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comAdobeCqWcmLaunchesImplLaunchesEventHandlerPropertiesLaunchesEventhandlerThreadpoolPriority :: Maybe ConfigNodePropertyDropDown
      <*> arbitrary -- comAdobeCqWcmLaunchesImplLaunchesEventHandlerPropertiesLaunchesEventhandlerUpdatelastmodification :: Maybe ConfigNodePropertyBoolean
    
instance Arbitrary ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorInfo where
  arbitrary =
    ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorInfo
      <$> arbitrary -- comAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorInfoProperties :: Maybe ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties
    
instance Arbitrary ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties where
  arbitrary =
    ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties
      <$> arbitrary -- comAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorPropertiesCqWcmQrcodeServletWhitelist :: Maybe ConfigNodePropertyArray
    
instance Arbitrary ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplInfo where
  arbitrary =
    ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplInfo
      <$> arbitrary -- comAdobeCqWcmStyleInternalComponentStyleInfoCacheImplInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeCqWcmStyleInternalComponentStyleInfoCacheImplInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeCqWcmStyleInternalComponentStyleInfoCacheImplInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeCqWcmStyleInternalComponentStyleInfoCacheImplInfoProperties :: Maybe ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties
    
instance Arbitrary ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties where
  arbitrary =
    ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties
      <$> arbitrary -- comAdobeCqWcmStyleInternalComponentStyleInfoCacheImplPropertiesSize :: Maybe ConfigNodePropertyInteger
    
instance Arbitrary ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplInfo where
  arbitrary =
    ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplInfo
      <$> arbitrary -- comAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplInfoProperties :: Maybe ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties
    
instance Arbitrary ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties where
  arbitrary =
    ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties
      <$> arbitrary -- comAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplPropertiesSyncTranslationStateSchedulingFormat :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplPropertiesSchedulingRepeatTranslationSchedulingFormat :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplPropertiesSyncTranslationStateLockTimeoutInMinutes :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplPropertiesExportFormat :: Maybe ConfigNodePropertyDropDown
    
instance Arbitrary ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceInfo where
  arbitrary =
    ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceInfo
      <$> arbitrary -- comAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceInfoProperties :: Maybe ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties
    
instance Arbitrary ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties where
  arbitrary =
    ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties
      <$> arbitrary -- comAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServicePropertiesPortalOutboxes :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServicePropertiesDraftDataService :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServicePropertiesDraftMetadataService :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServicePropertiesSubmitDataService :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServicePropertiesSubmitMetadataService :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServicePropertiesPendingSignDataService :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServicePropertiesPendingSignMetadataService :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComAdobeFdFpConfigFormsPortalSchedulerServiceInfo where
  arbitrary =
    ComAdobeFdFpConfigFormsPortalSchedulerServiceInfo
      <$> arbitrary -- comAdobeFdFpConfigFormsPortalSchedulerServiceInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeFdFpConfigFormsPortalSchedulerServiceInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeFdFpConfigFormsPortalSchedulerServiceInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeFdFpConfigFormsPortalSchedulerServiceInfoProperties :: Maybe ComAdobeFdFpConfigFormsPortalSchedulerServiceProperties
    
instance Arbitrary ComAdobeFdFpConfigFormsPortalSchedulerServiceProperties where
  arbitrary =
    ComAdobeFdFpConfigFormsPortalSchedulerServiceProperties
      <$> arbitrary -- comAdobeFdFpConfigFormsPortalSchedulerServicePropertiesFormportalInterval :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComAdobeFormsCommonServiceImplDefaultDataProviderInfo where
  arbitrary =
    ComAdobeFormsCommonServiceImplDefaultDataProviderInfo
      <$> arbitrary -- comAdobeFormsCommonServiceImplDefaultDataProviderInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeFormsCommonServiceImplDefaultDataProviderInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeFormsCommonServiceImplDefaultDataProviderInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeFormsCommonServiceImplDefaultDataProviderInfoProperties :: Maybe ComAdobeFormsCommonServiceImplDefaultDataProviderProperties
    
instance Arbitrary ComAdobeFormsCommonServiceImplDefaultDataProviderProperties where
  arbitrary =
    ComAdobeFormsCommonServiceImplDefaultDataProviderProperties
      <$> arbitrary -- comAdobeFormsCommonServiceImplDefaultDataProviderPropertiesAlloweddataFileLocations :: Maybe ConfigNodePropertyArray
    
instance Arbitrary ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpInfo where
  arbitrary =
    ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpInfo
      <$> arbitrary -- comAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpInfoProperties :: Maybe ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties
    
instance Arbitrary ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties where
  arbitrary =
    ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties
      <$> arbitrary -- comAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpPropertiesTempStorageConfig :: Maybe ConfigNodePropertyDropDown
    
instance Arbitrary ComAdobeFormsCommonServletTempCleanUpTaskInfo where
  arbitrary =
    ComAdobeFormsCommonServletTempCleanUpTaskInfo
      <$> arbitrary -- comAdobeFormsCommonServletTempCleanUpTaskInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeFormsCommonServletTempCleanUpTaskInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeFormsCommonServletTempCleanUpTaskInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeFormsCommonServletTempCleanUpTaskInfoProperties :: Maybe ComAdobeFormsCommonServletTempCleanUpTaskProperties
    
instance Arbitrary ComAdobeFormsCommonServletTempCleanUpTaskProperties where
  arbitrary =
    ComAdobeFormsCommonServletTempCleanUpTaskProperties
      <$> arbitrary -- comAdobeFormsCommonServletTempCleanUpTaskPropertiesSchedulerExpression :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeFormsCommonServletTempCleanUpTaskPropertiesDurationForTemporaryStorage :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeFormsCommonServletTempCleanUpTaskPropertiesDurationForAnonymousStorage :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComAdobeGraniteAcpPlatformPlatformServletInfo where
  arbitrary =
    ComAdobeGraniteAcpPlatformPlatformServletInfo
      <$> arbitrary -- comAdobeGraniteAcpPlatformPlatformServletInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeGraniteAcpPlatformPlatformServletInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeGraniteAcpPlatformPlatformServletInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeGraniteAcpPlatformPlatformServletInfoProperties :: Maybe ComAdobeGraniteAcpPlatformPlatformServletProperties
    
instance Arbitrary ComAdobeGraniteAcpPlatformPlatformServletProperties where
  arbitrary =
    ComAdobeGraniteAcpPlatformPlatformServletProperties
      <$> arbitrary -- comAdobeGraniteAcpPlatformPlatformServletPropertiesQueryLimit :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comAdobeGraniteAcpPlatformPlatformServletPropertiesFileTypeExtensionMap :: Maybe ConfigNodePropertyArray
    
instance Arbitrary ComAdobeGraniteActivitystreamsImplActivityManagerImplInfo where
  arbitrary =
    ComAdobeGraniteActivitystreamsImplActivityManagerImplInfo
      <$> arbitrary -- comAdobeGraniteActivitystreamsImplActivityManagerImplInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeGraniteActivitystreamsImplActivityManagerImplInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeGraniteActivitystreamsImplActivityManagerImplInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeGraniteActivitystreamsImplActivityManagerImplInfoProperties :: Maybe ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties
    
instance Arbitrary ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties where
  arbitrary =
    ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties
      <$> arbitrary -- comAdobeGraniteActivitystreamsImplActivityManagerImplPropertiesAggregateRelationships :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comAdobeGraniteActivitystreamsImplActivityManagerImplPropertiesAggregateDescendVirtual :: Maybe ConfigNodePropertyBoolean
    
instance Arbitrary ComAdobeGraniteAnalyzerBaseSystemStatusServletInfo where
  arbitrary =
    ComAdobeGraniteAnalyzerBaseSystemStatusServletInfo
      <$> arbitrary -- comAdobeGraniteAnalyzerBaseSystemStatusServletInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeGraniteAnalyzerBaseSystemStatusServletInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeGraniteAnalyzerBaseSystemStatusServletInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeGraniteAnalyzerBaseSystemStatusServletInfoProperties :: Maybe ComAdobeGraniteAnalyzerBaseSystemStatusServletProperties
      <*> arbitrary -- comAdobeGraniteAnalyzerBaseSystemStatusServletInfoBundleLocation :: Maybe Text
      <*> arbitrary -- comAdobeGraniteAnalyzerBaseSystemStatusServletInfoServiceLocation :: Maybe Text
    
instance Arbitrary ComAdobeGraniteAnalyzerBaseSystemStatusServletProperties where
  arbitrary =
    ComAdobeGraniteAnalyzerBaseSystemStatusServletProperties
      <$> arbitrary -- comAdobeGraniteAnalyzerBaseSystemStatusServletPropertiesDisabled :: Maybe ConfigNodePropertyBoolean
    
instance Arbitrary ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletInfo where
  arbitrary =
    ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletInfo
      <$> arbitrary -- comAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletInfoProperties :: Maybe ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties
      <*> arbitrary -- comAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletInfoBundleLocation :: Maybe Text
      <*> arbitrary -- comAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletInfoServiceLocation :: Maybe Text
    
instance Arbitrary ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties where
  arbitrary =
    ComAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletProperties
      <$> arbitrary -- comAdobeGraniteAnalyzerScriptsCompileAllScriptsCompilerServletPropertiesDisabled :: Maybe ConfigNodePropertyBoolean
    
instance Arbitrary ComAdobeGraniteApicontrollerFilterResolverHookFactoryInfo where
  arbitrary =
    ComAdobeGraniteApicontrollerFilterResolverHookFactoryInfo
      <$> arbitrary -- comAdobeGraniteApicontrollerFilterResolverHookFactoryInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeGraniteApicontrollerFilterResolverHookFactoryInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeGraniteApicontrollerFilterResolverHookFactoryInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeGraniteApicontrollerFilterResolverHookFactoryInfoProperties :: Maybe ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties
      <*> arbitrary -- comAdobeGraniteApicontrollerFilterResolverHookFactoryInfoBundleLocation :: Maybe Text
      <*> arbitrary -- comAdobeGraniteApicontrollerFilterResolverHookFactoryInfoServiceLocation :: Maybe Text
    
instance Arbitrary ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties where
  arbitrary =
    ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties
      <$> arbitrary -- comAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesComAdobeCqCdnCdnRewriter :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesComAdobeCqCloudConfigComponents :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesComAdobeCqCloudConfigCore :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesComAdobeCqCloudConfigUi :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesComAdobeCqComAdobeCqEditor :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesComAdobeCqComAdobeCqProjectsCore :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesComAdobeCqComAdobeCqProjectsWcmCore :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesComAdobeCqComAdobeCqUiCommons :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesComAdobeCqComAdobeCqWcmStyle :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesComAdobeCqCqActivitymapIntegration :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesComAdobeCqCqContexthubCommons :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesComAdobeCqCqDtm :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesComAdobeCqCqHealthcheck :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesComAdobeCqCqMultisiteTargeting :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesComAdobeCqCqPreUpgradeCleanup :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesComAdobeCqCqProductInfoProvider :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesComAdobeCqCqRestSites :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesComAdobeCqCqSecurityHc :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesComAdobeCqDamCqDamSvgHandler :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesComAdobeCqDamCqScene7Imaging :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesComAdobeCqDtmReactorCore :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesComAdobeCqDtmReactorUi :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesComAdobeCqExpJspelResolver :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesComAdobeCqInboxCqInbox :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesComAdobeCqJsonSchemaParser :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesComAdobeCqMediaCqMediaPublishingDpsFpCore :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesComAdobeCqMobileCqMobileCaas :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesComAdobeCqMobileCqMobileIndexBuilder :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesComAdobeCqMobileCqMobilePhonegapBuild :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesComAdobeCqMyspell :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesComAdobeCqSampleWeRetailCore :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesComAdobeCqScreensComAdobeCqScreensDcc :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesComAdobeCqScreensComAdobeCqScreensMqCore :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesComAdobeCqSocialCqSocialAsProvider :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesComAdobeCqSocialCqSocialBadgingBasicImpl :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesComAdobeCqSocialCqSocialBadgingImpl :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesComAdobeCqSocialCqSocialCalendarImpl :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesComAdobeCqSocialCqSocialContentFragmentsImpl :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesComAdobeCqSocialCqSocialEnablementImpl :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesComAdobeCqSocialCqSocialGraphImpl :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesComAdobeCqSocialCqSocialIdeationImpl :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesComAdobeCqSocialCqSocialJcrProvider :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesComAdobeCqSocialCqSocialMembersImpl :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesComAdobeCqSocialCqSocialMsProvider :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesComAdobeCqSocialCqSocialNotificationsChannelsWeb :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesComAdobeCqSocialCqSocialNotificationsImpl :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesComAdobeCqSocialCqSocialRdbProvider :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesComAdobeCqSocialCqSocialScfImpl :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesComAdobeCqSocialCqSocialScoringBasicImpl :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesComAdobeCqSocialCqSocialScoringImpl :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesComAdobeCqSocialCqSocialServiceusersImpl :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesComAdobeCqSocialCqSocialSrpImpl :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesComAdobeCqSocialCqSocialUgcbaseImpl :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesComAdobeDamCqDamCfmImpl :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesComAdobeFormsFoundationFormsFoundationBase :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesComAdobeGraniteApicontroller :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesComAdobeGraniteAssetCore :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesComAdobeGraniteAuthSso :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesComAdobeGraniteBundlesHcImpl :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesComAdobeGraniteCompatRouter :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesComAdobeGraniteConf :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesComAdobeGraniteConfUiCore :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesComAdobeGraniteCors :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesComAdobeGraniteCrxExplorer :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesComAdobeGraniteCrxdeLite :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesComAdobeGraniteCryptoConfig :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesComAdobeGraniteCryptoExtension :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesComAdobeGraniteCryptoFile :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesComAdobeGraniteCryptoJcr :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesComAdobeGraniteCsrf :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesComAdobeGraniteDistributionCore :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesComAdobeGraniteDropwizardMetrics :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesComAdobeGraniteFragsImpl :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesComAdobeGraniteGibson :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesComAdobeGraniteInfocollector :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesComAdobeGraniteInstallerFactoryPackages :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesComAdobeGraniteJettySsl :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesComAdobeGraniteJobsAsync :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesComAdobeGraniteMaintenanceOak :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesComAdobeGraniteMonitoringCore :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesComAdobeGraniteQueries :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesComAdobeGraniteReplicationHcImpl :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesComAdobeGraniteRepositoryChecker :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesComAdobeGraniteRepositoryHcImpl :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesComAdobeGraniteRestAssets :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesComAdobeGraniteSecurityUi :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesComAdobeGraniteStartup :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesComAdobeGraniteTagsoup :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesComAdobeGraniteTaskmanagementCore :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesComAdobeGraniteTaskmanagementWorkflow :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesComAdobeGraniteUiClientlibsCompilerLess :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesComAdobeGraniteUiClientlibsProcessorGcc :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesComAdobeGraniteWebconsolePlugins :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesComAdobeGraniteWorkflowConsole :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesComAdobeXmpWorkerFilesNativeFragmentLinux :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesComAdobeXmpWorkerFilesNativeFragmentMacosx :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesComAdobeXmpWorkerFilesNativeFragmentWin :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesComDayCommonsOsgiWrapperSimpleJndi :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesComDayCqCqAuthhandler :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesComDayCqCqCompatConfigupdate :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesComDayCqCqLicensebranding :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesComDayCqCqNotifcationImpl :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesComDayCqCqReplicationAudit :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesComDayCqCqSearchExt :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesComDayCqDamCqDamAnnotationPrint :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesComDayCqDamCqDamAssetUsage :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesComDayCqDamCqDamS7dam :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesComDayCqDamCqDamSimilaritysearch :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesComDayCqDamDamWebdavSupport :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesComDayCqPreUpgradeTasks :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesComDayCqReplicationExtensions :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesComDayCqWcmCqMsmCore :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesComDayCqWcmCqWcmTranslation :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesDayCommonsJrawio :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesOrgApacheAriesJmxWhiteboard :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesOrgApacheFelixHttpSslfilter :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesOrgApacheFelixOrgApacheFelixThreaddump :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesOrgApacheFelixWebconsolePluginsDs :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesOrgApacheFelixWebconsolePluginsEvent :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesOrgApacheFelixWebconsolePluginsMemoryusage :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesOrgApacheFelixWebconsolePluginsPackageadmin :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesOrgApacheJackrabbitOakAuthLdap :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesOrgApacheJackrabbitOakSegmentTar :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesOrgApacheJackrabbitOakSolrOsgi :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesOrgApacheSlingBundleresourceImpl :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesOrgApacheSlingCommonsFsclassloader :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesOrgApacheSlingCommonsLogWebconsole :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesOrgApacheSlingDatasource :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesOrgApacheSlingDiscoveryBase :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesOrgApacheSlingDiscoveryOak :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesOrgApacheSlingDiscoverySupport :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesOrgApacheSlingDistributionApi :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesOrgApacheSlingDistributionCore :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesOrgApacheSlingExtensionsWebconsolesecurityprovider :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesOrgApacheSlingHcWebconsole :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesOrgApacheSlingInstallerConsole :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesOrgApacheSlingInstallerProviderFile :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesOrgApacheSlingInstallerProviderJcr :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesOrgApacheSlingJcrDavex :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesOrgApacheSlingJcrResourcesecurity :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesOrgApacheSlingJmxProvider :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesOrgApacheSlingLaunchpadInstaller :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesOrgApacheSlingModelsImpl :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesOrgApacheSlingRepoinitParser :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesOrgApacheSlingResourceInventory :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesOrgApacheSlingResourceresolver :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesOrgApacheSlingScriptingJavascript :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesOrgApacheSlingScriptingJst :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesOrgApacheSlingScriptingSightlyJsProvider :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesOrgApacheSlingScriptingSightlyModelsProvider :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesOrgApacheSlingSecurity :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesOrgApacheSlingServletsCompat :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesOrgApacheSlingServletsGet :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesOrgApacheSlingStartupfilterDisabler :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesOrgApacheSlingTracer :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesWeRetailClientAppCore :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComAdobeGraniteAuthCertImplClientCertAuthHandlerInfo where
  arbitrary =
    ComAdobeGraniteAuthCertImplClientCertAuthHandlerInfo
      <$> arbitrary -- comAdobeGraniteAuthCertImplClientCertAuthHandlerInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeGraniteAuthCertImplClientCertAuthHandlerInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeGraniteAuthCertImplClientCertAuthHandlerInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeGraniteAuthCertImplClientCertAuthHandlerInfoProperties :: Maybe ComAdobeGraniteAuthCertImplClientCertAuthHandlerProperties
    
instance Arbitrary ComAdobeGraniteAuthCertImplClientCertAuthHandlerProperties where
  arbitrary =
    ComAdobeGraniteAuthCertImplClientCertAuthHandlerProperties
      <$> arbitrary -- comAdobeGraniteAuthCertImplClientCertAuthHandlerPropertiesPath :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteAuthCertImplClientCertAuthHandlerPropertiesServiceRanking :: Maybe ConfigNodePropertyInteger
    
instance Arbitrary ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionInfo where
  arbitrary =
    ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionInfo
      <$> arbitrary -- comAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionInfoProperties :: Maybe ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionProperties
    
instance Arbitrary ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionProperties where
  arbitrary =
    ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionProperties
      <$> arbitrary -- comAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionPropertiesOauthProviderId :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplInfo where
  arbitrary =
    ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplInfo
      <$> arbitrary -- comAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplInfoProperties :: Maybe ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties
    
instance Arbitrary ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties where
  arbitrary =
    ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties
      <$> arbitrary -- comAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplPropertiesAuthImsClientSecret :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplPropertiesCustomizerType :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorInfo where
  arbitrary =
    ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorInfo
      <$> arbitrary -- comAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorInfoProperties :: Maybe ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorProperties
    
instance Arbitrary ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorProperties where
  arbitrary =
    ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorProperties
      <$> arbitrary -- comAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorPropertiesOauthProviderId :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComAdobeGraniteAuthImsImplIMSProviderImplInfo where
  arbitrary =
    ComAdobeGraniteAuthImsImplIMSProviderImplInfo
      <$> arbitrary -- comAdobeGraniteAuthImsImplIMSProviderImplInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeGraniteAuthImsImplIMSProviderImplInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeGraniteAuthImsImplIMSProviderImplInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeGraniteAuthImsImplIMSProviderImplInfoProperties :: Maybe ComAdobeGraniteAuthImsImplIMSProviderImplProperties
    
instance Arbitrary ComAdobeGraniteAuthImsImplIMSProviderImplProperties where
  arbitrary =
    ComAdobeGraniteAuthImsImplIMSProviderImplProperties
      <$> arbitrary -- comAdobeGraniteAuthImsImplIMSProviderImplPropertiesOauthProviderId :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteAuthImsImplIMSProviderImplPropertiesOauthProviderImsAuthorizationUrl :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteAuthImsImplIMSProviderImplPropertiesOauthProviderImsTokenUrl :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteAuthImsImplIMSProviderImplPropertiesOauthProviderImsProfileUrl :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteAuthImsImplIMSProviderImplPropertiesOauthProviderImsExtendedDetailsUrls :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comAdobeGraniteAuthImsImplIMSProviderImplPropertiesOauthProviderImsValidateTokenUrl :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteAuthImsImplIMSProviderImplPropertiesOauthProviderImsSessionProperty :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteAuthImsImplIMSProviderImplPropertiesOauthProviderImsServiceTokenClientId :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteAuthImsImplIMSProviderImplPropertiesOauthProviderImsServiceTokenClientSecret :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteAuthImsImplIMSProviderImplPropertiesOauthProviderImsServiceToken :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteAuthImsImplIMSProviderImplPropertiesImsOrgRef :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteAuthImsImplIMSProviderImplPropertiesImsGroupMapping :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comAdobeGraniteAuthImsImplIMSProviderImplPropertiesOauthProviderImsOnlyLicenseGroup :: Maybe ConfigNodePropertyBoolean
    
instance Arbitrary ComAdobeGraniteAuthImsImplImsConfigProviderImplInfo where
  arbitrary =
    ComAdobeGraniteAuthImsImplImsConfigProviderImplInfo
      <$> arbitrary -- comAdobeGraniteAuthImsImplImsConfigProviderImplInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeGraniteAuthImsImplImsConfigProviderImplInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeGraniteAuthImsImplImsConfigProviderImplInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeGraniteAuthImsImplImsConfigProviderImplInfoProperties :: Maybe ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties
    
instance Arbitrary ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties where
  arbitrary =
    ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties
      <$> arbitrary -- comAdobeGraniteAuthImsImplImsConfigProviderImplPropertiesOauthConfigmanagerImsConfigid :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteAuthImsImplImsConfigProviderImplPropertiesImsOwningEntity :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteAuthImsImplImsConfigProviderImplPropertiesAemInstanceId :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteAuthImsImplImsConfigProviderImplPropertiesImsServiceCode :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComAdobeGraniteAuthImsInfo where
  arbitrary =
    ComAdobeGraniteAuthImsInfo
      <$> arbitrary -- comAdobeGraniteAuthImsInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeGraniteAuthImsInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeGraniteAuthImsInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeGraniteAuthImsInfoProperties :: Maybe ComAdobeGraniteAuthImsProperties
      <*> arbitrary -- comAdobeGraniteAuthImsInfoBundleLocation :: Maybe Text
      <*> arbitrary -- comAdobeGraniteAuthImsInfoServiceLocation :: Maybe Text
    
instance Arbitrary ComAdobeGraniteAuthImsProperties where
  arbitrary =
    ComAdobeGraniteAuthImsProperties
      <$> arbitrary -- comAdobeGraniteAuthImsPropertiesConfigid :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteAuthImsPropertiesScope :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComAdobeGraniteAuthOauthAccesstokenProviderInfo where
  arbitrary =
    ComAdobeGraniteAuthOauthAccesstokenProviderInfo
      <$> arbitrary -- comAdobeGraniteAuthOauthAccesstokenProviderInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeGraniteAuthOauthAccesstokenProviderInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeGraniteAuthOauthAccesstokenProviderInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeGraniteAuthOauthAccesstokenProviderInfoProperties :: Maybe ComAdobeGraniteAuthOauthAccesstokenProviderProperties
    
instance Arbitrary ComAdobeGraniteAuthOauthAccesstokenProviderProperties where
  arbitrary =
    ComAdobeGraniteAuthOauthAccesstokenProviderProperties
      <$> arbitrary -- comAdobeGraniteAuthOauthAccesstokenProviderPropertiesName :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteAuthOauthAccesstokenProviderPropertiesAuthTokenProviderTitle :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteAuthOauthAccesstokenProviderPropertiesAuthTokenProviderDefaultClaims :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comAdobeGraniteAuthOauthAccesstokenProviderPropertiesAuthTokenProviderEndpoint :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteAuthOauthAccesstokenProviderPropertiesAuthAccessTokenRequest :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteAuthOauthAccesstokenProviderPropertiesAuthTokenProviderKeypairAlias :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteAuthOauthAccesstokenProviderPropertiesAuthTokenProviderConnTimeout :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comAdobeGraniteAuthOauthAccesstokenProviderPropertiesAuthTokenProviderSoTimeout :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comAdobeGraniteAuthOauthAccesstokenProviderPropertiesAuthTokenProviderClientId :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteAuthOauthAccesstokenProviderPropertiesAuthTokenProviderScope :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteAuthOauthAccesstokenProviderPropertiesAuthTokenProviderReuseAccessToken :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- comAdobeGraniteAuthOauthAccesstokenProviderPropertiesAuthTokenProviderRelaxedSsl :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- comAdobeGraniteAuthOauthAccesstokenProviderPropertiesTokenRequestCustomizerType :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteAuthOauthAccesstokenProviderPropertiesAuthTokenValidatorType :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerInfo where
  arbitrary =
    ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerInfo
      <$> arbitrary -- comAdobeGraniteAuthOauthImplBearerAuthenticationHandlerInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeGraniteAuthOauthImplBearerAuthenticationHandlerInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeGraniteAuthOauthImplBearerAuthenticationHandlerInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeGraniteAuthOauthImplBearerAuthenticationHandlerInfoProperties :: Maybe ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties
    
instance Arbitrary ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties where
  arbitrary =
    ComAdobeGraniteAuthOauthImplBearerAuthenticationHandlerProperties
      <$> arbitrary -- comAdobeGraniteAuthOauthImplBearerAuthenticationHandlerPropertiesPath :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteAuthOauthImplBearerAuthenticationHandlerPropertiesOauthClientIdsAllowed :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comAdobeGraniteAuthOauthImplBearerAuthenticationHandlerPropertiesAuthBearerSyncIms :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- comAdobeGraniteAuthOauthImplBearerAuthenticationHandlerPropertiesAuthTokenRequestParameter :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteAuthOauthImplBearerAuthenticationHandlerPropertiesOauthBearerConfigid :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteAuthOauthImplBearerAuthenticationHandlerPropertiesOauthJwtSupport :: Maybe ConfigNodePropertyBoolean
    
instance Arbitrary ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplInfo where
  arbitrary =
    ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplInfo
      <$> arbitrary -- comAdobeGraniteAuthOauthImplDefaultTokenValidatorImplInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeGraniteAuthOauthImplDefaultTokenValidatorImplInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeGraniteAuthOauthImplDefaultTokenValidatorImplInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeGraniteAuthOauthImplDefaultTokenValidatorImplInfoProperties :: Maybe ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties
    
instance Arbitrary ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties where
  arbitrary =
    ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties
      <$> arbitrary -- comAdobeGraniteAuthOauthImplDefaultTokenValidatorImplPropertiesAuthTokenValidatorType :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComAdobeGraniteAuthOauthImplFacebookProviderImplInfo where
  arbitrary =
    ComAdobeGraniteAuthOauthImplFacebookProviderImplInfo
      <$> arbitrary -- comAdobeGraniteAuthOauthImplFacebookProviderImplInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeGraniteAuthOauthImplFacebookProviderImplInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeGraniteAuthOauthImplFacebookProviderImplInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeGraniteAuthOauthImplFacebookProviderImplInfoProperties :: Maybe ComAdobeGraniteAuthOauthImplFacebookProviderImplProperties
    
instance Arbitrary ComAdobeGraniteAuthOauthImplFacebookProviderImplProperties where
  arbitrary =
    ComAdobeGraniteAuthOauthImplFacebookProviderImplProperties
      <$> arbitrary -- comAdobeGraniteAuthOauthImplFacebookProviderImplPropertiesOauthProviderId :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComAdobeGraniteAuthOauthImplGithubProviderImplInfo where
  arbitrary =
    ComAdobeGraniteAuthOauthImplGithubProviderImplInfo
      <$> arbitrary -- comAdobeGraniteAuthOauthImplGithubProviderImplInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeGraniteAuthOauthImplGithubProviderImplInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeGraniteAuthOauthImplGithubProviderImplInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeGraniteAuthOauthImplGithubProviderImplInfoProperties :: Maybe ComAdobeGraniteAuthOauthImplGithubProviderImplProperties
    
instance Arbitrary ComAdobeGraniteAuthOauthImplGithubProviderImplProperties where
  arbitrary =
    ComAdobeGraniteAuthOauthImplGithubProviderImplProperties
      <$> arbitrary -- comAdobeGraniteAuthOauthImplGithubProviderImplPropertiesOauthProviderId :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteAuthOauthImplGithubProviderImplPropertiesOauthProviderGithubAuthorizationUrl :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteAuthOauthImplGithubProviderImplPropertiesOauthProviderGithubTokenUrl :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteAuthOauthImplGithubProviderImplPropertiesOauthProviderGithubProfileUrl :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComAdobeGraniteAuthOauthImplGraniteProviderInfo where
  arbitrary =
    ComAdobeGraniteAuthOauthImplGraniteProviderInfo
      <$> arbitrary -- comAdobeGraniteAuthOauthImplGraniteProviderInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeGraniteAuthOauthImplGraniteProviderInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeGraniteAuthOauthImplGraniteProviderInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeGraniteAuthOauthImplGraniteProviderInfoProperties :: Maybe ComAdobeGraniteAuthOauthImplGraniteProviderProperties
    
instance Arbitrary ComAdobeGraniteAuthOauthImplGraniteProviderProperties where
  arbitrary =
    ComAdobeGraniteAuthOauthImplGraniteProviderProperties
      <$> arbitrary -- comAdobeGraniteAuthOauthImplGraniteProviderPropertiesOauthProviderId :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteAuthOauthImplGraniteProviderPropertiesOauthProviderGraniteAuthorizationUrl :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteAuthOauthImplGraniteProviderPropertiesOauthProviderGraniteTokenUrl :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteAuthOauthImplGraniteProviderPropertiesOauthProviderGraniteProfileUrl :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteAuthOauthImplGraniteProviderPropertiesOauthProviderGraniteExtendedDetailsUrls :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInfo where
  arbitrary =
    ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInfo
      <$> arbitrary -- comAdobeGraniteAuthOauthImplHelperProviderConfigManagerInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeGraniteAuthOauthImplHelperProviderConfigManagerInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeGraniteAuthOauthImplHelperProviderConfigManagerInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeGraniteAuthOauthImplHelperProviderConfigManagerInfoProperties :: Maybe ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerProperties
      <*> arbitrary -- comAdobeGraniteAuthOauthImplHelperProviderConfigManagerInfoBundleLocation :: Maybe Text
      <*> arbitrary -- comAdobeGraniteAuthOauthImplHelperProviderConfigManagerInfoServiceLocation :: Maybe Text
    
instance Arbitrary ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalInfo where
  arbitrary =
    ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalInfo
      <$> arbitrary -- comAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalInfoProperties :: Maybe ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties
    
instance Arbitrary ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties where
  arbitrary =
    ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalProperties
      <$> arbitrary -- comAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalPropertiesOauthCookieLoginTimeout :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteAuthOauthImplHelperProviderConfigManagerInternalPropertiesOauthCookieMaxAge :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerProperties where
  arbitrary =
    ComAdobeGraniteAuthOauthImplHelperProviderConfigManagerProperties
      <$> arbitrary -- comAdobeGraniteAuthOauthImplHelperProviderConfigManagerPropertiesOauthCookieLoginTimeout :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteAuthOauthImplHelperProviderConfigManagerPropertiesOauthCookieMaxAge :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerInfo where
  arbitrary =
    ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerInfo
      <$> arbitrary -- comAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerInfoProperties :: Maybe ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerProperties
    
instance Arbitrary ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerProperties where
  arbitrary =
    ComAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerProperties
      <$> arbitrary -- comAdobeGraniteAuthOauthImplOAuthAuthenticationHandlerPropertiesPath :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComAdobeGraniteAuthOauthImplTwitterProviderImplInfo where
  arbitrary =
    ComAdobeGraniteAuthOauthImplTwitterProviderImplInfo
      <$> arbitrary -- comAdobeGraniteAuthOauthImplTwitterProviderImplInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeGraniteAuthOauthImplTwitterProviderImplInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeGraniteAuthOauthImplTwitterProviderImplInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeGraniteAuthOauthImplTwitterProviderImplInfoProperties :: Maybe ComAdobeGraniteAuthOauthImplTwitterProviderImplProperties
    
instance Arbitrary ComAdobeGraniteAuthOauthImplTwitterProviderImplProperties where
  arbitrary =
    ComAdobeGraniteAuthOauthImplTwitterProviderImplProperties
      <$> arbitrary -- comAdobeGraniteAuthOauthImplTwitterProviderImplPropertiesOauthProviderId :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComAdobeGraniteAuthOauthProviderInfo where
  arbitrary =
    ComAdobeGraniteAuthOauthProviderInfo
      <$> arbitrary -- comAdobeGraniteAuthOauthProviderInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeGraniteAuthOauthProviderInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeGraniteAuthOauthProviderInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeGraniteAuthOauthProviderInfoProperties :: Maybe ComAdobeGraniteAuthOauthProviderProperties
    
instance Arbitrary ComAdobeGraniteAuthOauthProviderProperties where
  arbitrary =
    ComAdobeGraniteAuthOauthProviderProperties
      <$> arbitrary -- comAdobeGraniteAuthOauthProviderPropertiesOauthConfigId :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteAuthOauthProviderPropertiesOauthClientId :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteAuthOauthProviderPropertiesOauthClientSecret :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteAuthOauthProviderPropertiesOauthScope :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comAdobeGraniteAuthOauthProviderPropertiesOauthConfigProviderId :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteAuthOauthProviderPropertiesOauthCreateUsers :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- comAdobeGraniteAuthOauthProviderPropertiesOauthUseridProperty :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteAuthOauthProviderPropertiesForceStrictUsernameMatching :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- comAdobeGraniteAuthOauthProviderPropertiesOauthEncodeUserids :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- comAdobeGraniteAuthOauthProviderPropertiesOauthHashUserids :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- comAdobeGraniteAuthOauthProviderPropertiesOauthCallBackUrl :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteAuthOauthProviderPropertiesOauthAccessTokenPersist :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- comAdobeGraniteAuthOauthProviderPropertiesOauthAccessTokenPersistCookie :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- comAdobeGraniteAuthOauthProviderPropertiesOauthCsrfStateProtection :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- comAdobeGraniteAuthOauthProviderPropertiesOauthRedirectRequestParams :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- comAdobeGraniteAuthOauthProviderPropertiesOauthConfigSiblingsAllow :: Maybe ConfigNodePropertyBoolean
    
instance Arbitrary ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerInfo where
  arbitrary =
    ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerInfo
      <$> arbitrary -- comAdobeGraniteAuthRequirementImplDefaultRequirementHandlerInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeGraniteAuthRequirementImplDefaultRequirementHandlerInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeGraniteAuthRequirementImplDefaultRequirementHandlerInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeGraniteAuthRequirementImplDefaultRequirementHandlerInfoProperties :: Maybe ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties
    
instance Arbitrary ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties where
  arbitrary =
    ComAdobeGraniteAuthRequirementImplDefaultRequirementHandlerProperties
      <$> arbitrary -- comAdobeGraniteAuthRequirementImplDefaultRequirementHandlerPropertiesSupportedPaths :: Maybe ConfigNodePropertyArray
    
instance Arbitrary ComAdobeGraniteAuthSamlSamlAuthenticationHandlerInfo where
  arbitrary =
    ComAdobeGraniteAuthSamlSamlAuthenticationHandlerInfo
      <$> arbitrary -- comAdobeGraniteAuthSamlSamlAuthenticationHandlerInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeGraniteAuthSamlSamlAuthenticationHandlerInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeGraniteAuthSamlSamlAuthenticationHandlerInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeGraniteAuthSamlSamlAuthenticationHandlerInfoProperties :: Maybe ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties
      <*> arbitrary -- comAdobeGraniteAuthSamlSamlAuthenticationHandlerInfoBundleLocation :: Maybe Text
      <*> arbitrary -- comAdobeGraniteAuthSamlSamlAuthenticationHandlerInfoServiceLocation :: Maybe Text
    
instance Arbitrary ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties where
  arbitrary =
    ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties
      <$> arbitrary -- comAdobeGraniteAuthSamlSamlAuthenticationHandlerPropertiesPath :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comAdobeGraniteAuthSamlSamlAuthenticationHandlerPropertiesServiceRanking :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comAdobeGraniteAuthSamlSamlAuthenticationHandlerPropertiesIdpUrl :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteAuthSamlSamlAuthenticationHandlerPropertiesIdpCertAlias :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteAuthSamlSamlAuthenticationHandlerPropertiesIdpHttpRedirect :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- comAdobeGraniteAuthSamlSamlAuthenticationHandlerPropertiesServiceProviderEntityId :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteAuthSamlSamlAuthenticationHandlerPropertiesAssertionConsumerServiceUrl :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteAuthSamlSamlAuthenticationHandlerPropertiesSpPrivateKeyAlias :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteAuthSamlSamlAuthenticationHandlerPropertiesKeyStorePassword :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteAuthSamlSamlAuthenticationHandlerPropertiesDefaultRedirectUrl :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteAuthSamlSamlAuthenticationHandlerPropertiesUserIdAttribute :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteAuthSamlSamlAuthenticationHandlerPropertiesUseEncryption :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- comAdobeGraniteAuthSamlSamlAuthenticationHandlerPropertiesCreateUser :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- comAdobeGraniteAuthSamlSamlAuthenticationHandlerPropertiesUserIntermediatePath :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteAuthSamlSamlAuthenticationHandlerPropertiesAddGroupMemberships :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- comAdobeGraniteAuthSamlSamlAuthenticationHandlerPropertiesGroupMembershipAttribute :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteAuthSamlSamlAuthenticationHandlerPropertiesDefaultGroups :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comAdobeGraniteAuthSamlSamlAuthenticationHandlerPropertiesNameIdFormat :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteAuthSamlSamlAuthenticationHandlerPropertiesSynchronizeAttributes :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comAdobeGraniteAuthSamlSamlAuthenticationHandlerPropertiesHandleLogout :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- comAdobeGraniteAuthSamlSamlAuthenticationHandlerPropertiesLogoutUrl :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteAuthSamlSamlAuthenticationHandlerPropertiesClockTolerance :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comAdobeGraniteAuthSamlSamlAuthenticationHandlerPropertiesDigestMethod :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteAuthSamlSamlAuthenticationHandlerPropertiesSignatureMethod :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteAuthSamlSamlAuthenticationHandlerPropertiesIdentitySyncType :: Maybe ConfigNodePropertyDropDown
      <*> arbitrary -- comAdobeGraniteAuthSamlSamlAuthenticationHandlerPropertiesIdpIdentifier :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerInfo where
  arbitrary =
    ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerInfo
      <$> arbitrary -- comAdobeGraniteAuthSsoImplSsoAuthenticationHandlerInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeGraniteAuthSsoImplSsoAuthenticationHandlerInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeGraniteAuthSsoImplSsoAuthenticationHandlerInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeGraniteAuthSsoImplSsoAuthenticationHandlerInfoProperties :: Maybe ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties
    
instance Arbitrary ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties where
  arbitrary =
    ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties
      <$> arbitrary -- comAdobeGraniteAuthSsoImplSsoAuthenticationHandlerPropertiesPath :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteAuthSsoImplSsoAuthenticationHandlerPropertiesServiceRanking :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comAdobeGraniteAuthSsoImplSsoAuthenticationHandlerPropertiesJaasControlFlag :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteAuthSsoImplSsoAuthenticationHandlerPropertiesJaasRealmName :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteAuthSsoImplSsoAuthenticationHandlerPropertiesJaasRanking :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comAdobeGraniteAuthSsoImplSsoAuthenticationHandlerPropertiesHeaders :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comAdobeGraniteAuthSsoImplSsoAuthenticationHandlerPropertiesCookies :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comAdobeGraniteAuthSsoImplSsoAuthenticationHandlerPropertiesParameters :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comAdobeGraniteAuthSsoImplSsoAuthenticationHandlerPropertiesUsermap :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comAdobeGraniteAuthSsoImplSsoAuthenticationHandlerPropertiesFormat :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteAuthSsoImplSsoAuthenticationHandlerPropertiesTrustedCredentialsAttribute :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckInfo where
  arbitrary =
    ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckInfo
      <$> arbitrary -- comAdobeGraniteBundlesHcImplCodeCacheHealthCheckInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeGraniteBundlesHcImplCodeCacheHealthCheckInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeGraniteBundlesHcImplCodeCacheHealthCheckInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeGraniteBundlesHcImplCodeCacheHealthCheckInfoProperties :: Maybe ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties
    
instance Arbitrary ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties where
  arbitrary =
    ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties
      <$> arbitrary -- comAdobeGraniteBundlesHcImplCodeCacheHealthCheckPropertiesHcTags :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comAdobeGraniteBundlesHcImplCodeCacheHealthCheckPropertiesMinimumCodeCacheSize :: Maybe ConfigNodePropertyInteger
    
instance Arbitrary ComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckInfo where
  arbitrary =
    ComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckInfo
      <$> arbitrary -- comAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckInfoProperties :: Maybe ComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckProperties
    
instance Arbitrary ComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckProperties where
  arbitrary =
    ComAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckProperties
      <$> arbitrary -- comAdobeGraniteBundlesHcImplCrxdeSupportBundleHealthCheckPropertiesHcTags :: Maybe ConfigNodePropertyArray
    
instance Arbitrary ComAdobeGraniteBundlesHcImplDavExBundleHealthCheckInfo where
  arbitrary =
    ComAdobeGraniteBundlesHcImplDavExBundleHealthCheckInfo
      <$> arbitrary -- comAdobeGraniteBundlesHcImplDavExBundleHealthCheckInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeGraniteBundlesHcImplDavExBundleHealthCheckInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeGraniteBundlesHcImplDavExBundleHealthCheckInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeGraniteBundlesHcImplDavExBundleHealthCheckInfoProperties :: Maybe ComAdobeGraniteBundlesHcImplDavExBundleHealthCheckProperties
    
instance Arbitrary ComAdobeGraniteBundlesHcImplDavExBundleHealthCheckProperties where
  arbitrary =
    ComAdobeGraniteBundlesHcImplDavExBundleHealthCheckProperties
      <$> arbitrary -- comAdobeGraniteBundlesHcImplDavExBundleHealthCheckPropertiesHcTags :: Maybe ConfigNodePropertyArray
    
instance Arbitrary ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckInfo where
  arbitrary =
    ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckInfo
      <$> arbitrary -- comAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckInfoProperties :: Maybe ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties
    
instance Arbitrary ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties where
  arbitrary =
    ComAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckProperties
      <$> arbitrary -- comAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckPropertiesHcTags :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comAdobeGraniteBundlesHcImplInactiveBundlesHealthCheckPropertiesIgnoredBundles :: Maybe ConfigNodePropertyArray
    
instance Arbitrary ComAdobeGraniteBundlesHcImplJobsHealthCheckInfo where
  arbitrary =
    ComAdobeGraniteBundlesHcImplJobsHealthCheckInfo
      <$> arbitrary -- comAdobeGraniteBundlesHcImplJobsHealthCheckInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeGraniteBundlesHcImplJobsHealthCheckInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeGraniteBundlesHcImplJobsHealthCheckInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeGraniteBundlesHcImplJobsHealthCheckInfoProperties :: Maybe ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties
    
instance Arbitrary ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties where
  arbitrary =
    ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties
      <$> arbitrary -- comAdobeGraniteBundlesHcImplJobsHealthCheckPropertiesHcTags :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comAdobeGraniteBundlesHcImplJobsHealthCheckPropertiesMaxQueuedJobs :: Maybe ConfigNodePropertyInteger
    
instance Arbitrary ComAdobeGraniteBundlesHcImplSlingGetServletHealthCheckInfo where
  arbitrary =
    ComAdobeGraniteBundlesHcImplSlingGetServletHealthCheckInfo
      <$> arbitrary -- comAdobeGraniteBundlesHcImplSlingGetServletHealthCheckInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeGraniteBundlesHcImplSlingGetServletHealthCheckInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeGraniteBundlesHcImplSlingGetServletHealthCheckInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeGraniteBundlesHcImplSlingGetServletHealthCheckInfoProperties :: Maybe ComAdobeGraniteBundlesHcImplSlingGetServletHealthCheckProperties
    
instance Arbitrary ComAdobeGraniteBundlesHcImplSlingGetServletHealthCheckProperties where
  arbitrary =
    ComAdobeGraniteBundlesHcImplSlingGetServletHealthCheckProperties
      <$> arbitrary -- comAdobeGraniteBundlesHcImplSlingGetServletHealthCheckPropertiesHcTags :: Maybe ConfigNodePropertyArray
    
instance Arbitrary ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckInfo where
  arbitrary =
    ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckInfo
      <$> arbitrary -- comAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckInfoProperties :: Maybe ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckProperties
    
instance Arbitrary ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckProperties where
  arbitrary =
    ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckProperties
      <$> arbitrary -- comAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckPropertiesHcTags :: Maybe ConfigNodePropertyArray
    
instance Arbitrary ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckInfo where
  arbitrary =
    ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckInfo
      <$> arbitrary -- comAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckInfoProperties :: Maybe ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckProperties
    
instance Arbitrary ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckProperties where
  arbitrary =
    ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckProperties
      <$> arbitrary -- comAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckPropertiesHcTags :: Maybe ConfigNodePropertyArray
    
instance Arbitrary ComAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckInfo where
  arbitrary =
    ComAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckInfo
      <$> arbitrary -- comAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckInfoProperties :: Maybe ComAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckProperties
    
instance Arbitrary ComAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckProperties where
  arbitrary =
    ComAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckProperties
      <$> arbitrary -- comAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckPropertiesHcTags :: Maybe ConfigNodePropertyArray
    
instance Arbitrary ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheckInfo where
  arbitrary =
    ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheckInfo
      <$> arbitrary -- comAdobeGraniteBundlesHcImplWebDavBundleHealthCheckInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeGraniteBundlesHcImplWebDavBundleHealthCheckInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeGraniteBundlesHcImplWebDavBundleHealthCheckInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeGraniteBundlesHcImplWebDavBundleHealthCheckInfoProperties :: Maybe ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheckProperties
    
instance Arbitrary ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheckProperties where
  arbitrary =
    ComAdobeGraniteBundlesHcImplWebDavBundleHealthCheckProperties
      <$> arbitrary -- comAdobeGraniteBundlesHcImplWebDavBundleHealthCheckPropertiesHcTags :: Maybe ConfigNodePropertyArray
    
instance Arbitrary ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacInfo where
  arbitrary =
    ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacInfo
      <$> arbitrary -- comAdobeGraniteCommentsInternalCommentReplicationContentFilterFacInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeGraniteCommentsInternalCommentReplicationContentFilterFacInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeGraniteCommentsInternalCommentReplicationContentFilterFacInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeGraniteCommentsInternalCommentReplicationContentFilterFacInfoProperties :: Maybe ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties
    
instance Arbitrary ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties where
  arbitrary =
    ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties
      <$> arbitrary -- comAdobeGraniteCommentsInternalCommentReplicationContentFilterFacPropertiesReplicateCommentResourceTypes :: Maybe ConfigNodePropertyArray
    
instance Arbitrary ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplInfo where
  arbitrary =
    ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplInfo
      <$> arbitrary -- comAdobeGraniteCompatrouterImplCompatSwitchingServiceImplInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeGraniteCompatrouterImplCompatSwitchingServiceImplInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeGraniteCompatrouterImplCompatSwitchingServiceImplInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeGraniteCompatrouterImplCompatSwitchingServiceImplInfoProperties :: Maybe ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties
    
instance Arbitrary ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties where
  arbitrary =
    ComAdobeGraniteCompatrouterImplCompatSwitchingServiceImplProperties
      <$> arbitrary -- comAdobeGraniteCompatrouterImplCompatSwitchingServiceImplPropertiesCompatgroups :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comAdobeGraniteCompatrouterImplCompatSwitchingServiceImplPropertiesEnabled :: Maybe ConfigNodePropertyBoolean
    
instance Arbitrary ComAdobeGraniteCompatrouterImplRoutingConfigInfo where
  arbitrary =
    ComAdobeGraniteCompatrouterImplRoutingConfigInfo
      <$> arbitrary -- comAdobeGraniteCompatrouterImplRoutingConfigInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeGraniteCompatrouterImplRoutingConfigInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeGraniteCompatrouterImplRoutingConfigInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeGraniteCompatrouterImplRoutingConfigInfoProperties :: Maybe ComAdobeGraniteCompatrouterImplRoutingConfigProperties
    
instance Arbitrary ComAdobeGraniteCompatrouterImplRoutingConfigProperties where
  arbitrary =
    ComAdobeGraniteCompatrouterImplRoutingConfigProperties
      <$> arbitrary -- comAdobeGraniteCompatrouterImplRoutingConfigPropertiesId :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteCompatrouterImplRoutingConfigPropertiesCompatPath :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteCompatrouterImplRoutingConfigPropertiesNewPath :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComAdobeGraniteCompatrouterImplSwitchMappingConfigInfo where
  arbitrary =
    ComAdobeGraniteCompatrouterImplSwitchMappingConfigInfo
      <$> arbitrary -- comAdobeGraniteCompatrouterImplSwitchMappingConfigInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeGraniteCompatrouterImplSwitchMappingConfigInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeGraniteCompatrouterImplSwitchMappingConfigInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeGraniteCompatrouterImplSwitchMappingConfigInfoProperties :: Maybe ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties
    
instance Arbitrary ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties where
  arbitrary =
    ComAdobeGraniteCompatrouterImplSwitchMappingConfigProperties
      <$> arbitrary -- comAdobeGraniteCompatrouterImplSwitchMappingConfigPropertiesGroup :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteCompatrouterImplSwitchMappingConfigPropertiesIds :: Maybe ConfigNodePropertyArray
    
instance Arbitrary ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingInfo where
  arbitrary =
    ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingInfo
      <$> arbitrary -- comAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingInfoProperties :: Maybe ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties
    
instance Arbitrary ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties where
  arbitrary =
    ComAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingProperties
      <$> arbitrary -- comAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingPropertiesEnabled :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- comAdobeGraniteConfImplRuntimeAwareConfigurationResourceResolvingPropertiesFallbackPaths :: Maybe ConfigNodePropertyArray
    
instance Arbitrary ComAdobeGraniteContexthubImplContextHubImplInfo where
  arbitrary =
    ComAdobeGraniteContexthubImplContextHubImplInfo
      <$> arbitrary -- comAdobeGraniteContexthubImplContextHubImplInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeGraniteContexthubImplContextHubImplInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeGraniteContexthubImplContextHubImplInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeGraniteContexthubImplContextHubImplInfoProperties :: Maybe ComAdobeGraniteContexthubImplContextHubImplProperties
    
instance Arbitrary ComAdobeGraniteContexthubImplContextHubImplProperties where
  arbitrary =
    ComAdobeGraniteContexthubImplContextHubImplProperties
      <$> arbitrary -- comAdobeGraniteContexthubImplContextHubImplPropertiesComAdobeGraniteContexthubSilentMode :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- comAdobeGraniteContexthubImplContextHubImplPropertiesComAdobeGraniteContexthubShowUi :: Maybe ConfigNodePropertyBoolean
    
instance Arbitrary ComAdobeGraniteCorsImplCORSPolicyImplInfo where
  arbitrary =
    ComAdobeGraniteCorsImplCORSPolicyImplInfo
      <$> arbitrary -- comAdobeGraniteCorsImplCORSPolicyImplInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeGraniteCorsImplCORSPolicyImplInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeGraniteCorsImplCORSPolicyImplInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeGraniteCorsImplCORSPolicyImplInfoProperties :: Maybe ComAdobeGraniteCorsImplCORSPolicyImplProperties
    
instance Arbitrary ComAdobeGraniteCorsImplCORSPolicyImplProperties where
  arbitrary =
    ComAdobeGraniteCorsImplCORSPolicyImplProperties
      <$> arbitrary -- comAdobeGraniteCorsImplCORSPolicyImplPropertiesAlloworigin :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comAdobeGraniteCorsImplCORSPolicyImplPropertiesAlloworiginregexp :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comAdobeGraniteCorsImplCORSPolicyImplPropertiesAllowedpaths :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comAdobeGraniteCorsImplCORSPolicyImplPropertiesExposedheaders :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comAdobeGraniteCorsImplCORSPolicyImplPropertiesMaxage :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comAdobeGraniteCorsImplCORSPolicyImplPropertiesSupportedheaders :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comAdobeGraniteCorsImplCORSPolicyImplPropertiesSupportedmethods :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comAdobeGraniteCorsImplCORSPolicyImplPropertiesSupportscredentials :: Maybe ConfigNodePropertyBoolean
    
instance Arbitrary ComAdobeGraniteCsrfImplCSRFFilterInfo where
  arbitrary =
    ComAdobeGraniteCsrfImplCSRFFilterInfo
      <$> arbitrary -- comAdobeGraniteCsrfImplCSRFFilterInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeGraniteCsrfImplCSRFFilterInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeGraniteCsrfImplCSRFFilterInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeGraniteCsrfImplCSRFFilterInfoProperties :: Maybe ComAdobeGraniteCsrfImplCSRFFilterProperties
      <*> arbitrary -- comAdobeGraniteCsrfImplCSRFFilterInfoBundleLocation :: Maybe Text
      <*> arbitrary -- comAdobeGraniteCsrfImplCSRFFilterInfoServiceLocation :: Maybe Text
    
instance Arbitrary ComAdobeGraniteCsrfImplCSRFFilterProperties where
  arbitrary =
    ComAdobeGraniteCsrfImplCSRFFilterProperties
      <$> arbitrary -- comAdobeGraniteCsrfImplCSRFFilterPropertiesFilterMethods :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comAdobeGraniteCsrfImplCSRFFilterPropertiesFilterEnableSafeUserAgents :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- comAdobeGraniteCsrfImplCSRFFilterPropertiesFilterSafeUserAgents :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comAdobeGraniteCsrfImplCSRFFilterPropertiesFilterExcludedPaths :: Maybe ConfigNodePropertyArray
    
instance Arbitrary ComAdobeGraniteCsrfImplCSRFServletInfo where
  arbitrary =
    ComAdobeGraniteCsrfImplCSRFServletInfo
      <$> arbitrary -- comAdobeGraniteCsrfImplCSRFServletInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeGraniteCsrfImplCSRFServletInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeGraniteCsrfImplCSRFServletInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeGraniteCsrfImplCSRFServletInfoProperties :: Maybe ComAdobeGraniteCsrfImplCSRFServletProperties
    
instance Arbitrary ComAdobeGraniteCsrfImplCSRFServletProperties where
  arbitrary =
    ComAdobeGraniteCsrfImplCSRFServletProperties
      <$> arbitrary -- comAdobeGraniteCsrfImplCSRFServletPropertiesCsrfTokenExpiresIn :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comAdobeGraniteCsrfImplCSRFServletPropertiesSlingAuthRequirements :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeInfo where
  arbitrary =
    ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeInfo
      <$> arbitrary -- comAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeInfoProperties :: Maybe ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeProperties
    
instance Arbitrary ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeProperties where
  arbitrary =
    ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeProperties
      <$> arbitrary -- comAdobeGraniteDistributionCoreImplCryptoDistributionTransportSePropertiesName :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteDistributionCoreImplCryptoDistributionTransportSePropertiesUsername :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteDistributionCoreImplCryptoDistributionTransportSePropertiesEncryptedPassword :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverInfo where
  arbitrary =
    ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverInfo
      <$> arbitrary -- comAdobeGraniteDistributionCoreImplDiffDiffChangesObserverInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeGraniteDistributionCoreImplDiffDiffChangesObserverInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeGraniteDistributionCoreImplDiffDiffChangesObserverInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeGraniteDistributionCoreImplDiffDiffChangesObserverInfoProperties :: Maybe ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties
    
instance Arbitrary ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties where
  arbitrary =
    ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties
      <$> arbitrary -- comAdobeGraniteDistributionCoreImplDiffDiffChangesObserverPropertiesEnabled :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- comAdobeGraniteDistributionCoreImplDiffDiffChangesObserverPropertiesAgentName :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteDistributionCoreImplDiffDiffChangesObserverPropertiesDiffPath :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteDistributionCoreImplDiffDiffChangesObserverPropertiesObservedPath :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteDistributionCoreImplDiffDiffChangesObserverPropertiesServiceName :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteDistributionCoreImplDiffDiffChangesObserverPropertiesPropertyNames :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteDistributionCoreImplDiffDiffChangesObserverPropertiesDistributionDelay :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comAdobeGraniteDistributionCoreImplDiffDiffChangesObserverPropertiesServiceUserTarget :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerInfo where
  arbitrary =
    ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerInfo
      <$> arbitrary -- comAdobeGraniteDistributionCoreImplDiffDiffEventListenerInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeGraniteDistributionCoreImplDiffDiffEventListenerInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeGraniteDistributionCoreImplDiffDiffEventListenerInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeGraniteDistributionCoreImplDiffDiffEventListenerInfoProperties :: Maybe ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties
    
instance Arbitrary ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties where
  arbitrary =
    ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties
      <$> arbitrary -- comAdobeGraniteDistributionCoreImplDiffDiffEventListenerPropertiesDiffPath :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteDistributionCoreImplDiffDiffEventListenerPropertiesServiceName :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteDistributionCoreImplDiffDiffEventListenerPropertiesServiceUserTarget :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenInfo where
  arbitrary =
    ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenInfo
      <$> arbitrary -- comAdobeGraniteDistributionCoreImplDistributionToReplicationEvenInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeGraniteDistributionCoreImplDistributionToReplicationEvenInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeGraniteDistributionCoreImplDistributionToReplicationEvenInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeGraniteDistributionCoreImplDistributionToReplicationEvenInfoProperties :: Maybe ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenProperties
    
instance Arbitrary ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenProperties where
  arbitrary =
    ComAdobeGraniteDistributionCoreImplDistributionToReplicationEvenProperties
      <$> arbitrary -- comAdobeGraniteDistributionCoreImplDistributionToReplicationEvenPropertiesImporterName :: Maybe ConfigNodePropertyArray
    
instance Arbitrary ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatInfo where
  arbitrary =
    ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatInfo
      <$> arbitrary -- comAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatInfoProperties :: Maybe ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties
    
instance Arbitrary ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties where
  arbitrary =
    ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties
      <$> arbitrary -- comAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatPropertiesProviderName :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatPropertiesForwardRequests :: Maybe ConfigNodePropertyBoolean
    
instance Arbitrary ComAdobeGraniteDistributionCoreImplReplicationDistributionTransInfo where
  arbitrary =
    ComAdobeGraniteDistributionCoreImplReplicationDistributionTransInfo
      <$> arbitrary -- comAdobeGraniteDistributionCoreImplReplicationDistributionTransInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeGraniteDistributionCoreImplReplicationDistributionTransInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeGraniteDistributionCoreImplReplicationDistributionTransInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeGraniteDistributionCoreImplReplicationDistributionTransInfoProperties :: Maybe ComAdobeGraniteDistributionCoreImplReplicationDistributionTransProperties
    
instance Arbitrary ComAdobeGraniteDistributionCoreImplReplicationDistributionTransProperties where
  arbitrary =
    ComAdobeGraniteDistributionCoreImplReplicationDistributionTransProperties
      <$> arbitrary -- comAdobeGraniteDistributionCoreImplReplicationDistributionTransPropertiesForwardRequests :: Maybe ConfigNodePropertyBoolean
    
instance Arbitrary ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuInfo where
  arbitrary =
    ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuInfo
      <$> arbitrary -- comAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuInfoProperties :: Maybe ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties
    
instance Arbitrary ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties where
  arbitrary =
    ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties
      <$> arbitrary -- comAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuPropertiesName :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuPropertiesServiceName :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuPropertiesUserId :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuPropertiesAccessTokenProviderTarget :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComAdobeGraniteFragsImplCheckHttpHeaderFlagInfo where
  arbitrary =
    ComAdobeGraniteFragsImplCheckHttpHeaderFlagInfo
      <$> arbitrary -- comAdobeGraniteFragsImplCheckHttpHeaderFlagInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeGraniteFragsImplCheckHttpHeaderFlagInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeGraniteFragsImplCheckHttpHeaderFlagInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeGraniteFragsImplCheckHttpHeaderFlagInfoProperties :: Maybe ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties
    
instance Arbitrary ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties where
  arbitrary =
    ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties
      <$> arbitrary -- comAdobeGraniteFragsImplCheckHttpHeaderFlagPropertiesFeatureName :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteFragsImplCheckHttpHeaderFlagPropertiesFeatureDescription :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteFragsImplCheckHttpHeaderFlagPropertiesHttpHeaderName :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteFragsImplCheckHttpHeaderFlagPropertiesHttpHeaderValuepattern :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComAdobeGraniteFragsImplRandomFeatureInfo where
  arbitrary =
    ComAdobeGraniteFragsImplRandomFeatureInfo
      <$> arbitrary -- comAdobeGraniteFragsImplRandomFeatureInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeGraniteFragsImplRandomFeatureInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeGraniteFragsImplRandomFeatureInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeGraniteFragsImplRandomFeatureInfoProperties :: Maybe ComAdobeGraniteFragsImplRandomFeatureProperties
    
instance Arbitrary ComAdobeGraniteFragsImplRandomFeatureProperties where
  arbitrary =
    ComAdobeGraniteFragsImplRandomFeatureProperties
      <$> arbitrary -- comAdobeGraniteFragsImplRandomFeaturePropertiesFeatureName :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteFragsImplRandomFeaturePropertiesFeatureDescription :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteFragsImplRandomFeaturePropertiesActivePercentage :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteFragsImplRandomFeaturePropertiesCookieName :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteFragsImplRandomFeaturePropertiesCookieMaxAge :: Maybe ConfigNodePropertyInteger
    
instance Arbitrary ComAdobeGraniteHttpcacheFileFileCacheStoreInfo where
  arbitrary =
    ComAdobeGraniteHttpcacheFileFileCacheStoreInfo
      <$> arbitrary -- comAdobeGraniteHttpcacheFileFileCacheStoreInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeGraniteHttpcacheFileFileCacheStoreInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeGraniteHttpcacheFileFileCacheStoreInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeGraniteHttpcacheFileFileCacheStoreInfoProperties :: Maybe ComAdobeGraniteHttpcacheFileFileCacheStoreProperties
    
instance Arbitrary ComAdobeGraniteHttpcacheFileFileCacheStoreProperties where
  arbitrary =
    ComAdobeGraniteHttpcacheFileFileCacheStoreProperties
      <$> arbitrary -- comAdobeGraniteHttpcacheFileFileCacheStorePropertiesComAdobeGraniteHttpcacheFileDocumentRoot :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteHttpcacheFileFileCacheStorePropertiesComAdobeGraniteHttpcacheFileIncludeHost :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComAdobeGraniteHttpcacheImplOuterCacheFilterInfo where
  arbitrary =
    ComAdobeGraniteHttpcacheImplOuterCacheFilterInfo
      <$> arbitrary -- comAdobeGraniteHttpcacheImplOuterCacheFilterInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeGraniteHttpcacheImplOuterCacheFilterInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeGraniteHttpcacheImplOuterCacheFilterInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeGraniteHttpcacheImplOuterCacheFilterInfoProperties :: Maybe ComAdobeGraniteHttpcacheImplOuterCacheFilterProperties
    
instance Arbitrary ComAdobeGraniteHttpcacheImplOuterCacheFilterProperties where
  arbitrary =
    ComAdobeGraniteHttpcacheImplOuterCacheFilterProperties
      <$> arbitrary -- comAdobeGraniteHttpcacheImplOuterCacheFilterPropertiesComAdobeGraniteHttpcacheUrlPaths :: Maybe ConfigNodePropertyArray
    
instance Arbitrary ComAdobeGraniteI18nImplBundlePseudoTranslationsInfo where
  arbitrary =
    ComAdobeGraniteI18nImplBundlePseudoTranslationsInfo
      <$> arbitrary -- comAdobeGraniteI18nImplBundlePseudoTranslationsInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeGraniteI18nImplBundlePseudoTranslationsInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeGraniteI18nImplBundlePseudoTranslationsInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeGraniteI18nImplBundlePseudoTranslationsInfoProperties :: Maybe ComAdobeGraniteI18nImplBundlePseudoTranslationsProperties
    
instance Arbitrary ComAdobeGraniteI18nImplBundlePseudoTranslationsProperties where
  arbitrary =
    ComAdobeGraniteI18nImplBundlePseudoTranslationsProperties
      <$> arbitrary -- comAdobeGraniteI18nImplBundlePseudoTranslationsPropertiesPseudoPatterns :: Maybe ConfigNodePropertyArray
    
instance Arbitrary ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceInfo where
  arbitrary =
    ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceInfo
      <$> arbitrary -- comAdobeGraniteI18nImplPreferencesLocaleResolverServiceInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeGraniteI18nImplPreferencesLocaleResolverServiceInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeGraniteI18nImplPreferencesLocaleResolverServiceInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeGraniteI18nImplPreferencesLocaleResolverServiceInfoProperties :: Maybe ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties
    
instance Arbitrary ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties where
  arbitrary =
    ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties
      <$> arbitrary -- comAdobeGraniteI18nImplPreferencesLocaleResolverServicePropertiesSecurityPreferencesName :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComAdobeGraniteInfocollectorInfoCollectorInfo where
  arbitrary =
    ComAdobeGraniteInfocollectorInfoCollectorInfo
      <$> arbitrary -- comAdobeGraniteInfocollectorInfoCollectorInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeGraniteInfocollectorInfoCollectorInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeGraniteInfocollectorInfoCollectorInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeGraniteInfocollectorInfoCollectorInfoProperties :: Maybe ComAdobeGraniteInfocollectorInfoCollectorProperties
    
instance Arbitrary ComAdobeGraniteInfocollectorInfoCollectorProperties where
  arbitrary =
    ComAdobeGraniteInfocollectorInfoCollectorProperties
      <$> arbitrary -- comAdobeGraniteInfocollectorInfoCollectorPropertiesGraniteInfocollectorIncludeThreadDumps :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- comAdobeGraniteInfocollectorInfoCollectorPropertiesGraniteInfocollectorIncludeHeapDump :: Maybe ConfigNodePropertyBoolean
    
instance Arbitrary ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryInfo where
  arbitrary =
    ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryInfo
      <$> arbitrary -- comAdobeGraniteJettySslInternalGraniteSslConnectorFactoryInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeGraniteJettySslInternalGraniteSslConnectorFactoryInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeGraniteJettySslInternalGraniteSslConnectorFactoryInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeGraniteJettySslInternalGraniteSslConnectorFactoryInfoProperties :: Maybe ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties
      <*> arbitrary -- comAdobeGraniteJettySslInternalGraniteSslConnectorFactoryInfoAdditionalProperties :: Maybe Text
      <*> arbitrary -- comAdobeGraniteJettySslInternalGraniteSslConnectorFactoryInfoBundleLocation :: Maybe Text
      <*> arbitrary -- comAdobeGraniteJettySslInternalGraniteSslConnectorFactoryInfoServiceLocation :: Maybe Text
    
instance Arbitrary ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties where
  arbitrary =
    ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties
      <$> arbitrary -- comAdobeGraniteJettySslInternalGraniteSslConnectorFactoryPropertiesComAdobeGraniteJettySslPort :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comAdobeGraniteJettySslInternalGraniteSslConnectorFactoryPropertiesComAdobeGraniteJettySslKeystoreUser :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteJettySslInternalGraniteSslConnectorFactoryPropertiesComAdobeGraniteJettySslKeystorePassword :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteJettySslInternalGraniteSslConnectorFactoryPropertiesComAdobeGraniteJettySslCiphersuitesExcluded :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comAdobeGraniteJettySslInternalGraniteSslConnectorFactoryPropertiesComAdobeGraniteJettySslCiphersuitesIncluded :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comAdobeGraniteJettySslInternalGraniteSslConnectorFactoryPropertiesComAdobeGraniteJettySslClientCertificate :: Maybe ConfigNodePropertyDropDown
    
instance Arbitrary ComAdobeGraniteLicenseImplLicenseCheckFilterInfo where
  arbitrary =
    ComAdobeGraniteLicenseImplLicenseCheckFilterInfo
      <$> arbitrary -- comAdobeGraniteLicenseImplLicenseCheckFilterInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeGraniteLicenseImplLicenseCheckFilterInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeGraniteLicenseImplLicenseCheckFilterInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeGraniteLicenseImplLicenseCheckFilterInfoProperties :: Maybe ComAdobeGraniteLicenseImplLicenseCheckFilterProperties
    
instance Arbitrary ComAdobeGraniteLicenseImplLicenseCheckFilterProperties where
  arbitrary =
    ComAdobeGraniteLicenseImplLicenseCheckFilterProperties
      <$> arbitrary -- comAdobeGraniteLicenseImplLicenseCheckFilterPropertiesCheckInternval :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comAdobeGraniteLicenseImplLicenseCheckFilterPropertiesExcludeIds :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comAdobeGraniteLicenseImplLicenseCheckFilterPropertiesEncryptPing :: Maybe ConfigNodePropertyBoolean
    
instance Arbitrary ComAdobeGraniteLoggingImplLogAnalyserImplInfo where
  arbitrary =
    ComAdobeGraniteLoggingImplLogAnalyserImplInfo
      <$> arbitrary -- comAdobeGraniteLoggingImplLogAnalyserImplInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeGraniteLoggingImplLogAnalyserImplInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeGraniteLoggingImplLogAnalyserImplInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeGraniteLoggingImplLogAnalyserImplInfoProperties :: Maybe ComAdobeGraniteLoggingImplLogAnalyserImplProperties
    
instance Arbitrary ComAdobeGraniteLoggingImplLogAnalyserImplProperties where
  arbitrary =
    ComAdobeGraniteLoggingImplLogAnalyserImplProperties
      <$> arbitrary -- comAdobeGraniteLoggingImplLogAnalyserImplPropertiesMessagesQueueSize :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comAdobeGraniteLoggingImplLogAnalyserImplPropertiesLoggerConfig :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comAdobeGraniteLoggingImplLogAnalyserImplPropertiesMessagesSize :: Maybe ConfigNodePropertyInteger
    
instance Arbitrary ComAdobeGraniteLoggingImplLogErrorHealthCheckInfo where
  arbitrary =
    ComAdobeGraniteLoggingImplLogErrorHealthCheckInfo
      <$> arbitrary -- comAdobeGraniteLoggingImplLogErrorHealthCheckInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeGraniteLoggingImplLogErrorHealthCheckInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeGraniteLoggingImplLogErrorHealthCheckInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeGraniteLoggingImplLogErrorHealthCheckInfoProperties :: Maybe ComAdobeGraniteLoggingImplLogErrorHealthCheckProperties
    
instance Arbitrary ComAdobeGraniteLoggingImplLogErrorHealthCheckProperties where
  arbitrary =
    ComAdobeGraniteLoggingImplLogErrorHealthCheckProperties
      <$> arbitrary -- comAdobeGraniteLoggingImplLogErrorHealthCheckPropertiesHcTags :: Maybe ConfigNodePropertyArray
    
instance Arbitrary ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskInfo where
  arbitrary =
    ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskInfo
      <$> arbitrary -- comAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskInfoProperties :: Maybe ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties
      <*> arbitrary -- comAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskInfoBundleLocation :: Maybe Text
      <*> arbitrary -- comAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskInfoServiceLocation :: Maybe Text
    
instance Arbitrary ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties where
  arbitrary =
    ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties
      <$> arbitrary -- comAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskPropertiesGraniteMaintenanceMandatory :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- comAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskPropertiesJobTopics :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskInfo where
  arbitrary =
    ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskInfo
      <$> arbitrary -- comAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskInfoProperties :: Maybe ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskProperties
      <*> arbitrary -- comAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskInfoBundleLocation :: Maybe Text
      <*> arbitrary -- comAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskInfoServiceLocation :: Maybe Text
    
instance Arbitrary ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskProperties where
  arbitrary =
    ComAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskProperties
      <$> arbitrary -- comAdobeGraniteMaintenanceCrxImplLuceneBinariesCleanupTaskPropertiesJobTopics :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskInfo where
  arbitrary =
    ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskInfo
      <$> arbitrary -- comAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskInfoProperties :: Maybe ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties
    
instance Arbitrary ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties where
  arbitrary =
    ComAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskProperties
      <$> arbitrary -- comAdobeGraniteMaintenanceCrxImplRevisionCleanupTaskPropertiesFullGcDays :: Maybe ConfigNodePropertyArray
    
instance Arbitrary ComAdobeGraniteMonitoringImplScriptConfigImplInfo where
  arbitrary =
    ComAdobeGraniteMonitoringImplScriptConfigImplInfo
      <$> arbitrary -- comAdobeGraniteMonitoringImplScriptConfigImplInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeGraniteMonitoringImplScriptConfigImplInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeGraniteMonitoringImplScriptConfigImplInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeGraniteMonitoringImplScriptConfigImplInfoProperties :: Maybe ComAdobeGraniteMonitoringImplScriptConfigImplProperties
    
instance Arbitrary ComAdobeGraniteMonitoringImplScriptConfigImplProperties where
  arbitrary =
    ComAdobeGraniteMonitoringImplScriptConfigImplProperties
      <$> arbitrary -- comAdobeGraniteMonitoringImplScriptConfigImplPropertiesScriptFilename :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteMonitoringImplScriptConfigImplPropertiesScriptDisplay :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteMonitoringImplScriptConfigImplPropertiesScriptPath :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteMonitoringImplScriptConfigImplPropertiesScriptPlatform :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comAdobeGraniteMonitoringImplScriptConfigImplPropertiesInterval :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comAdobeGraniteMonitoringImplScriptConfigImplPropertiesJmxdomain :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanInfo where
  arbitrary =
    ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanInfo
      <$> arbitrary -- comAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanInfoProperties :: Maybe ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties
    
instance Arbitrary ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties where
  arbitrary =
    ComAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanProperties
      <$> arbitrary -- comAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanPropertiesPath :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanPropertiesJaasControlFlag :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanPropertiesJaasRealmName :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanPropertiesJaasRanking :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comAdobeGraniteOauthServerAuthImplOAuth2ServerAuthenticationHanPropertiesOauthOfflineValidation :: Maybe ConfigNodePropertyBoolean
    
instance Arbitrary ComAdobeGraniteOauthServerImplAccessTokenCleanupTaskInfo where
  arbitrary =
    ComAdobeGraniteOauthServerImplAccessTokenCleanupTaskInfo
      <$> arbitrary -- comAdobeGraniteOauthServerImplAccessTokenCleanupTaskInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeGraniteOauthServerImplAccessTokenCleanupTaskInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeGraniteOauthServerImplAccessTokenCleanupTaskInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeGraniteOauthServerImplAccessTokenCleanupTaskInfoProperties :: Maybe ComAdobeGraniteOauthServerImplAccessTokenCleanupTaskProperties
    
instance Arbitrary ComAdobeGraniteOauthServerImplAccessTokenCleanupTaskProperties where
  arbitrary =
    ComAdobeGraniteOauthServerImplAccessTokenCleanupTaskProperties
      <$> arbitrary -- comAdobeGraniteOauthServerImplAccessTokenCleanupTaskPropertiesSchedulerExpression :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletInfo where
  arbitrary =
    ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletInfo
      <$> arbitrary -- comAdobeGraniteOauthServerImplOAuth2ClientRevocationServletInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeGraniteOauthServerImplOAuth2ClientRevocationServletInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeGraniteOauthServerImplOAuth2ClientRevocationServletInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeGraniteOauthServerImplOAuth2ClientRevocationServletInfoProperties :: Maybe ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletProperties
    
instance Arbitrary ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletProperties where
  arbitrary =
    ComAdobeGraniteOauthServerImplOAuth2ClientRevocationServletProperties
      <$> arbitrary -- comAdobeGraniteOauthServerImplOAuth2ClientRevocationServletPropertiesOauthClientRevocationActive :: Maybe ConfigNodePropertyBoolean
    
instance Arbitrary ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletInfo where
  arbitrary =
    ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletInfo
      <$> arbitrary -- comAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletInfoProperties :: Maybe ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties
    
instance Arbitrary ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties where
  arbitrary =
    ComAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletProperties
      <$> arbitrary -- comAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletPropertiesSlingServletPaths :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteOauthServerImplOAuth2RevocationEndpointServletPropertiesOauthRevocationActive :: Maybe ConfigNodePropertyBoolean
    
instance Arbitrary ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletInfo where
  arbitrary =
    ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletInfo
      <$> arbitrary -- comAdobeGraniteOauthServerImplOAuth2TokenEndpointServletInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeGraniteOauthServerImplOAuth2TokenEndpointServletInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeGraniteOauthServerImplOAuth2TokenEndpointServletInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeGraniteOauthServerImplOAuth2TokenEndpointServletInfoProperties :: Maybe ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties
    
instance Arbitrary ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties where
  arbitrary =
    ComAdobeGraniteOauthServerImplOAuth2TokenEndpointServletProperties
      <$> arbitrary -- comAdobeGraniteOauthServerImplOAuth2TokenEndpointServletPropertiesOauthIssuer :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteOauthServerImplOAuth2TokenEndpointServletPropertiesOauthAccessTokenExpiresIn :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteOauthServerImplOAuth2TokenEndpointServletPropertiesOsgiHttpWhiteboardServletPattern :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteOauthServerImplOAuth2TokenEndpointServletPropertiesOsgiHttpWhiteboardContextSelect :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletInfo where
  arbitrary =
    ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletInfo
      <$> arbitrary -- comAdobeGraniteOauthServerImplOAuth2TokenRevocationServletInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeGraniteOauthServerImplOAuth2TokenRevocationServletInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeGraniteOauthServerImplOAuth2TokenRevocationServletInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeGraniteOauthServerImplOAuth2TokenRevocationServletInfoProperties :: Maybe ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties
    
instance Arbitrary ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties where
  arbitrary =
    ComAdobeGraniteOauthServerImplOAuth2TokenRevocationServletProperties
      <$> arbitrary -- comAdobeGraniteOauthServerImplOAuth2TokenRevocationServletPropertiesOauthTokenRevocationActive :: Maybe ConfigNodePropertyBoolean
    
instance Arbitrary ComAdobeGraniteOffloadingImplOffloadingConfiguratorInfo where
  arbitrary =
    ComAdobeGraniteOffloadingImplOffloadingConfiguratorInfo
      <$> arbitrary -- comAdobeGraniteOffloadingImplOffloadingConfiguratorInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeGraniteOffloadingImplOffloadingConfiguratorInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeGraniteOffloadingImplOffloadingConfiguratorInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeGraniteOffloadingImplOffloadingConfiguratorInfoProperties :: Maybe ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties
    
instance Arbitrary ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties where
  arbitrary =
    ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties
      <$> arbitrary -- comAdobeGraniteOffloadingImplOffloadingConfiguratorPropertiesOffloadingTransporter :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteOffloadingImplOffloadingConfiguratorPropertiesOffloadingCleanupPayload :: Maybe ConfigNodePropertyBoolean
    
instance Arbitrary ComAdobeGraniteOffloadingImplOffloadingJobClonerInfo where
  arbitrary =
    ComAdobeGraniteOffloadingImplOffloadingJobClonerInfo
      <$> arbitrary -- comAdobeGraniteOffloadingImplOffloadingJobClonerInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeGraniteOffloadingImplOffloadingJobClonerInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeGraniteOffloadingImplOffloadingJobClonerInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeGraniteOffloadingImplOffloadingJobClonerInfoProperties :: Maybe ComAdobeGraniteOffloadingImplOffloadingJobClonerProperties
      <*> arbitrary -- comAdobeGraniteOffloadingImplOffloadingJobClonerInfoBundleLocation :: Maybe Text
      <*> arbitrary -- comAdobeGraniteOffloadingImplOffloadingJobClonerInfoServiceLocation :: Maybe Text
    
instance Arbitrary ComAdobeGraniteOffloadingImplOffloadingJobClonerProperties where
  arbitrary =
    ComAdobeGraniteOffloadingImplOffloadingJobClonerProperties
      <$> arbitrary -- comAdobeGraniteOffloadingImplOffloadingJobClonerPropertiesOffloadingJobclonerEnabled :: Maybe ConfigNodePropertyBoolean
    
instance Arbitrary ComAdobeGraniteOffloadingImplOffloadingJobOffloaderInfo where
  arbitrary =
    ComAdobeGraniteOffloadingImplOffloadingJobOffloaderInfo
      <$> arbitrary -- comAdobeGraniteOffloadingImplOffloadingJobOffloaderInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeGraniteOffloadingImplOffloadingJobOffloaderInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeGraniteOffloadingImplOffloadingJobOffloaderInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeGraniteOffloadingImplOffloadingJobOffloaderInfoProperties :: Maybe ComAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties
      <*> arbitrary -- comAdobeGraniteOffloadingImplOffloadingJobOffloaderInfoBundleLocation :: Maybe Text
      <*> arbitrary -- comAdobeGraniteOffloadingImplOffloadingJobOffloaderInfoServiceLocation :: Maybe Text
    
instance Arbitrary ComAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties where
  arbitrary =
    ComAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties
      <$> arbitrary -- comAdobeGraniteOffloadingImplOffloadingJobOffloaderPropertiesOffloadingOffloaderEnabled :: Maybe ConfigNodePropertyBoolean
    
instance Arbitrary ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerInfo where
  arbitrary =
    ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerInfo
      <$> arbitrary -- comAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerInfoProperties :: Maybe ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerProperties
      <*> arbitrary -- comAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerInfoBundleLocation :: Maybe Text
      <*> arbitrary -- comAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerInfoServiceLocation :: Maybe Text
    
instance Arbitrary ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerProperties where
  arbitrary =
    ComAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerProperties
      <$> arbitrary -- comAdobeGraniteOffloadingImplTransporterOffloadingAgentManagerPropertiesOffloadingAgentmanagerEnabled :: Maybe ConfigNodePropertyBoolean
    
instance Arbitrary ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoInfo where
  arbitrary =
    ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoInfo
      <$> arbitrary -- comAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoInfoProperties :: Maybe ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties
      <*> arbitrary -- comAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoInfoBundleLocation :: Maybe Text
      <*> arbitrary -- comAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoInfoServiceLocation :: Maybe Text
    
instance Arbitrary ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties where
  arbitrary =
    ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties
      <$> arbitrary -- comAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoPropertiesDefaultTransportAgentToWorkerPrefix :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoPropertiesDefaultTransportAgentToMasterPrefix :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoPropertiesDefaultTransportInputPackage :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoPropertiesDefaultTransportOutputPackage :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoPropertiesDefaultTransportReplicationSynchronous :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- comAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoPropertiesDefaultTransportContentpackage :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- comAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoPropertiesOffloadingTransporterDefaultEnabled :: Maybe ConfigNodePropertyBoolean
    
instance Arbitrary ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplInfo where
  arbitrary =
    ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplInfo
      <$> arbitrary -- comAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplInfoProperties :: Maybe ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties
    
instance Arbitrary ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties where
  arbitrary =
    ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties
      <$> arbitrary -- comAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplPropertiesOmnisearchSuggestionRequiretextMin :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplPropertiesOmnisearchSuggestionSpellcheckRequire :: Maybe ConfigNodePropertyBoolean
    
instance Arbitrary ComAdobeGraniteOptoutImplOptOutServiceImplInfo where
  arbitrary =
    ComAdobeGraniteOptoutImplOptOutServiceImplInfo
      <$> arbitrary -- comAdobeGraniteOptoutImplOptOutServiceImplInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeGraniteOptoutImplOptOutServiceImplInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeGraniteOptoutImplOptOutServiceImplInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeGraniteOptoutImplOptOutServiceImplInfoProperties :: Maybe ComAdobeGraniteOptoutImplOptOutServiceImplProperties
      <*> arbitrary -- comAdobeGraniteOptoutImplOptOutServiceImplInfoBundleLocation :: Maybe Text
      <*> arbitrary -- comAdobeGraniteOptoutImplOptOutServiceImplInfoServiceLocation :: Maybe Text
    
instance Arbitrary ComAdobeGraniteOptoutImplOptOutServiceImplProperties where
  arbitrary =
    ComAdobeGraniteOptoutImplOptOutServiceImplProperties
      <$> arbitrary -- comAdobeGraniteOptoutImplOptOutServiceImplPropertiesOptoutCookies :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comAdobeGraniteOptoutImplOptOutServiceImplPropertiesOptoutHeaders :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comAdobeGraniteOptoutImplOptOutServiceImplPropertiesOptoutWhitelistCookies :: Maybe ConfigNodePropertyArray
    
instance Arbitrary ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckInfo where
  arbitrary =
    ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckInfo
      <$> arbitrary -- comAdobeGraniteQueriesImplHcAsyncIndexHealthCheckInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeGraniteQueriesImplHcAsyncIndexHealthCheckInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeGraniteQueriesImplHcAsyncIndexHealthCheckInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeGraniteQueriesImplHcAsyncIndexHealthCheckInfoProperties :: Maybe ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties
    
instance Arbitrary ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties where
  arbitrary =
    ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties
      <$> arbitrary -- comAdobeGraniteQueriesImplHcAsyncIndexHealthCheckPropertiesIndexingCriticalThreshold :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comAdobeGraniteQueriesImplHcAsyncIndexHealthCheckPropertiesIndexingWarnThreshold :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comAdobeGraniteQueriesImplHcAsyncIndexHealthCheckPropertiesHcTags :: Maybe ConfigNodePropertyArray
    
instance Arbitrary ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckInfo where
  arbitrary =
    ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckInfo
      <$> arbitrary -- comAdobeGraniteQueriesImplHcLargeIndexHealthCheckInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeGraniteQueriesImplHcLargeIndexHealthCheckInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeGraniteQueriesImplHcLargeIndexHealthCheckInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeGraniteQueriesImplHcLargeIndexHealthCheckInfoProperties :: Maybe ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties
    
instance Arbitrary ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties where
  arbitrary =
    ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties
      <$> arbitrary -- comAdobeGraniteQueriesImplHcLargeIndexHealthCheckPropertiesLargeIndexCriticalThreshold :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comAdobeGraniteQueriesImplHcLargeIndexHealthCheckPropertiesLargeIndexWarnThreshold :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comAdobeGraniteQueriesImplHcLargeIndexHealthCheckPropertiesHcTags :: Maybe ConfigNodePropertyArray
    
instance Arbitrary ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheckInfo where
  arbitrary =
    ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheckInfo
      <$> arbitrary -- comAdobeGraniteQueriesImplHcQueriesStatusHealthCheckInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeGraniteQueriesImplHcQueriesStatusHealthCheckInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeGraniteQueriesImplHcQueriesStatusHealthCheckInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeGraniteQueriesImplHcQueriesStatusHealthCheckInfoProperties :: Maybe ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheckProperties
    
instance Arbitrary ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheckProperties where
  arbitrary =
    ComAdobeGraniteQueriesImplHcQueriesStatusHealthCheckProperties
      <$> arbitrary -- comAdobeGraniteQueriesImplHcQueriesStatusHealthCheckPropertiesHcTags :: Maybe ConfigNodePropertyArray
    
instance Arbitrary ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsInfo where
  arbitrary =
    ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsInfo
      <$> arbitrary -- comAdobeGraniteQueriesImplHcQueryHealthCheckMetricsInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeGraniteQueriesImplHcQueryHealthCheckMetricsInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeGraniteQueriesImplHcQueryHealthCheckMetricsInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeGraniteQueriesImplHcQueryHealthCheckMetricsInfoProperties :: Maybe ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsProperties
    
instance Arbitrary ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsProperties where
  arbitrary =
    ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsProperties
      <$> arbitrary -- comAdobeGraniteQueriesImplHcQueryHealthCheckMetricsPropertiesGetPeriod :: Maybe ConfigNodePropertyInteger
    
instance Arbitrary ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckInfo where
  arbitrary =
    ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckInfo
      <$> arbitrary -- comAdobeGraniteQueriesImplHcQueryLimitsHealthCheckInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeGraniteQueriesImplHcQueryLimitsHealthCheckInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeGraniteQueriesImplHcQueryLimitsHealthCheckInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeGraniteQueriesImplHcQueryLimitsHealthCheckInfoProperties :: Maybe ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckProperties
    
instance Arbitrary ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckProperties where
  arbitrary =
    ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckProperties
      <$> arbitrary -- comAdobeGraniteQueriesImplHcQueryLimitsHealthCheckPropertiesHcTags :: Maybe ConfigNodePropertyArray
    
instance Arbitrary ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckInfo where
  arbitrary =
    ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckInfo
      <$> arbitrary -- comAdobeGraniteReplicationHcImplReplicationQueueHealthCheckInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeGraniteReplicationHcImplReplicationQueueHealthCheckInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeGraniteReplicationHcImplReplicationQueueHealthCheckInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeGraniteReplicationHcImplReplicationQueueHealthCheckInfoProperties :: Maybe ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties
    
instance Arbitrary ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties where
  arbitrary =
    ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties
      <$> arbitrary -- comAdobeGraniteReplicationHcImplReplicationQueueHealthCheckPropertiesNumberOfRetriesAllowed :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comAdobeGraniteReplicationHcImplReplicationQueueHealthCheckPropertiesHcTags :: Maybe ConfigNodePropertyArray
    
instance Arbitrary ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCInfo where
  arbitrary =
    ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCInfo
      <$> arbitrary -- comAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCInfoProperties :: Maybe ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCProperties
    
instance Arbitrary ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCProperties where
  arbitrary =
    ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCProperties
      <$> arbitrary -- comAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCPropertiesHcTags :: Maybe ConfigNodePropertyArray
    
instance Arbitrary ComAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckInfo where
  arbitrary =
    ComAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckInfo
      <$> arbitrary -- comAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckInfoProperties :: Maybe ComAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckProperties
    
instance Arbitrary ComAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckProperties where
  arbitrary =
    ComAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckProperties
      <$> arbitrary -- comAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckPropertiesHcTags :: Maybe ConfigNodePropertyArray
    
instance Arbitrary ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCInfo where
  arbitrary =
    ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCInfo
      <$> arbitrary -- comAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCInfoProperties :: Maybe ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCProperties
    
instance Arbitrary ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCProperties where
  arbitrary =
    ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCProperties
      <$> arbitrary -- comAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCPropertiesHcTags :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCPropertiesExcludeSearchPath :: Maybe ConfigNodePropertyArray
    
instance Arbitrary ComAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckInfo where
  arbitrary =
    ComAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckInfo
      <$> arbitrary -- comAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckInfoProperties :: Maybe ComAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckProperties
    
instance Arbitrary ComAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckProperties where
  arbitrary =
    ComAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckProperties
      <$> arbitrary -- comAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckPropertiesHcTags :: Maybe ConfigNodePropertyArray
    
instance Arbitrary ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheInfo where
  arbitrary =
    ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheInfo
      <$> arbitrary -- comAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheInfoProperties :: Maybe ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheProperties
    
instance Arbitrary ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheProperties where
  arbitrary =
    ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheProperties
      <$> arbitrary -- comAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthChePropertiesHcTags :: Maybe ConfigNodePropertyArray
    
instance Arbitrary ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckInfo where
  arbitrary =
    ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckInfo
      <$> arbitrary -- comAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckInfoProperties :: Maybe ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties
    
instance Arbitrary ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties where
  arbitrary =
    ComAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties
      <$> arbitrary -- comAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckPropertiesHcTags :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckPropertiesAccountLogins :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckPropertiesConsoleLogins :: Maybe ConfigNodePropertyArray
    
instance Arbitrary ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckInfo where
  arbitrary =
    ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckInfo
      <$> arbitrary -- comAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckInfoProperties :: Maybe ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties
    
instance Arbitrary ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties where
  arbitrary =
    ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties
      <$> arbitrary -- comAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckPropertiesHcTags :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckPropertiesDiskSpaceWarnThreshold :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckPropertiesDiskSpaceErrorThreshold :: Maybe ConfigNodePropertyInteger
    
instance Arbitrary ComAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckInfo where
  arbitrary =
    ComAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckInfo
      <$> arbitrary -- comAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckInfoProperties :: Maybe ComAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckProperties
    
instance Arbitrary ComAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckProperties where
  arbitrary =
    ComAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckProperties
      <$> arbitrary -- comAdobeGraniteRepositoryHcImplObservationQueueLengthHealthCheckPropertiesHcTags :: Maybe ConfigNodePropertyArray
    
instance Arbitrary ComAdobeGraniteRepositoryImplCommitStatsConfigInfo where
  arbitrary =
    ComAdobeGraniteRepositoryImplCommitStatsConfigInfo
      <$> arbitrary -- comAdobeGraniteRepositoryImplCommitStatsConfigInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeGraniteRepositoryImplCommitStatsConfigInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeGraniteRepositoryImplCommitStatsConfigInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeGraniteRepositoryImplCommitStatsConfigInfoProperties :: Maybe ComAdobeGraniteRepositoryImplCommitStatsConfigProperties
      <*> arbitrary -- comAdobeGraniteRepositoryImplCommitStatsConfigInfoBundleLocation :: Maybe Text
      <*> arbitrary -- comAdobeGraniteRepositoryImplCommitStatsConfigInfoServiceLocation :: Maybe Text
    
instance Arbitrary ComAdobeGraniteRepositoryImplCommitStatsConfigProperties where
  arbitrary =
    ComAdobeGraniteRepositoryImplCommitStatsConfigProperties
      <$> arbitrary -- comAdobeGraniteRepositoryImplCommitStatsConfigPropertiesEnabled :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- comAdobeGraniteRepositoryImplCommitStatsConfigPropertiesIntervalSeconds :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comAdobeGraniteRepositoryImplCommitStatsConfigPropertiesCommitsPerIntervalThreshold :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comAdobeGraniteRepositoryImplCommitStatsConfigPropertiesMaxLocationLength :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comAdobeGraniteRepositoryImplCommitStatsConfigPropertiesMaxDetailsShown :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comAdobeGraniteRepositoryImplCommitStatsConfigPropertiesMinDetailsPercentage :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comAdobeGraniteRepositoryImplCommitStatsConfigPropertiesThreadMatchers :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comAdobeGraniteRepositoryImplCommitStatsConfigPropertiesMaxGreedyDepth :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comAdobeGraniteRepositoryImplCommitStatsConfigPropertiesGreedyStackMatchers :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteRepositoryImplCommitStatsConfigPropertiesStackFilters :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comAdobeGraniteRepositoryImplCommitStatsConfigPropertiesStackMatchers :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comAdobeGraniteRepositoryImplCommitStatsConfigPropertiesStackCategorizers :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comAdobeGraniteRepositoryImplCommitStatsConfigPropertiesStackShorteners :: Maybe ConfigNodePropertyArray
    
instance Arbitrary ComAdobeGraniteRepositoryServiceUserConfigurationInfo where
  arbitrary =
    ComAdobeGraniteRepositoryServiceUserConfigurationInfo
      <$> arbitrary -- comAdobeGraniteRepositoryServiceUserConfigurationInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeGraniteRepositoryServiceUserConfigurationInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeGraniteRepositoryServiceUserConfigurationInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeGraniteRepositoryServiceUserConfigurationInfoProperties :: Maybe ComAdobeGraniteRepositoryServiceUserConfigurationProperties
    
instance Arbitrary ComAdobeGraniteRepositoryServiceUserConfigurationProperties where
  arbitrary =
    ComAdobeGraniteRepositoryServiceUserConfigurationProperties
      <$> arbitrary -- comAdobeGraniteRepositoryServiceUserConfigurationPropertiesServiceRanking :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comAdobeGraniteRepositoryServiceUserConfigurationPropertiesServiceusersSimpleSubjectPopulation :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- comAdobeGraniteRepositoryServiceUserConfigurationPropertiesServiceusersList :: Maybe ConfigNodePropertyArray
    
instance Arbitrary ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImInfo where
  arbitrary =
    ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImInfo
      <$> arbitrary -- comAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImInfoProperties :: Maybe ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImProperties
    
instance Arbitrary ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImProperties where
  arbitrary =
    ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImProperties
      <$> arbitrary -- comAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImPropertiesHcTags :: Maybe ConfigNodePropertyArray
    
instance Arbitrary ComAdobeGraniteResourcestatusImplCompositeStatusTypeInfo where
  arbitrary =
    ComAdobeGraniteResourcestatusImplCompositeStatusTypeInfo
      <$> arbitrary -- comAdobeGraniteResourcestatusImplCompositeStatusTypeInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeGraniteResourcestatusImplCompositeStatusTypeInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeGraniteResourcestatusImplCompositeStatusTypeInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeGraniteResourcestatusImplCompositeStatusTypeInfoProperties :: Maybe ComAdobeGraniteResourcestatusImplCompositeStatusTypeProperties
    
instance Arbitrary ComAdobeGraniteResourcestatusImplCompositeStatusTypeProperties where
  arbitrary =
    ComAdobeGraniteResourcestatusImplCompositeStatusTypeProperties
      <$> arbitrary -- comAdobeGraniteResourcestatusImplCompositeStatusTypePropertiesName :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteResourcestatusImplCompositeStatusTypePropertiesTypes :: Maybe ConfigNodePropertyArray
    
instance Arbitrary ComAdobeGraniteResourcestatusImplStatusResourceProviderImplInfo where
  arbitrary =
    ComAdobeGraniteResourcestatusImplStatusResourceProviderImplInfo
      <$> arbitrary -- comAdobeGraniteResourcestatusImplStatusResourceProviderImplInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeGraniteResourcestatusImplStatusResourceProviderImplInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeGraniteResourcestatusImplStatusResourceProviderImplInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeGraniteResourcestatusImplStatusResourceProviderImplInfoProperties :: Maybe ComAdobeGraniteResourcestatusImplStatusResourceProviderImplProperties
    
instance Arbitrary ComAdobeGraniteResourcestatusImplStatusResourceProviderImplProperties where
  arbitrary =
    ComAdobeGraniteResourcestatusImplStatusResourceProviderImplProperties
      <$> arbitrary -- comAdobeGraniteResourcestatusImplStatusResourceProviderImplPropertiesProviderRoot :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterInfo where
  arbitrary =
    ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterInfo
      <$> arbitrary -- comAdobeGraniteRestAssetsImplAssetContentDispositionFilterInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeGraniteRestAssetsImplAssetContentDispositionFilterInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeGraniteRestAssetsImplAssetContentDispositionFilterInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeGraniteRestAssetsImplAssetContentDispositionFilterInfoProperties :: Maybe ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties
    
instance Arbitrary ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties where
  arbitrary =
    ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties
      <$> arbitrary -- comAdobeGraniteRestAssetsImplAssetContentDispositionFilterPropertiesMimeAllowEmpty :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- comAdobeGraniteRestAssetsImplAssetContentDispositionFilterPropertiesMimeAllowed :: Maybe ConfigNodePropertyArray
    
instance Arbitrary ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplInfo where
  arbitrary =
    ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplInfo
      <$> arbitrary -- comAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplInfoProperties :: Maybe ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties
    
instance Arbitrary ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties where
  arbitrary =
    ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties
      <$> arbitrary -- comAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplPropertiesProviderRoots :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComAdobeGraniteRestImplServletDefaultGETServletInfo where
  arbitrary =
    ComAdobeGraniteRestImplServletDefaultGETServletInfo
      <$> arbitrary -- comAdobeGraniteRestImplServletDefaultGETServletInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeGraniteRestImplServletDefaultGETServletInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeGraniteRestImplServletDefaultGETServletInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeGraniteRestImplServletDefaultGETServletInfoProperties :: Maybe ComAdobeGraniteRestImplServletDefaultGETServletProperties
    
instance Arbitrary ComAdobeGraniteRestImplServletDefaultGETServletProperties where
  arbitrary =
    ComAdobeGraniteRestImplServletDefaultGETServletProperties
      <$> arbitrary -- comAdobeGraniteRestImplServletDefaultGETServletPropertiesDefaultLimit :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comAdobeGraniteRestImplServletDefaultGETServletPropertiesUseAbsoluteUri :: Maybe ConfigNodePropertyBoolean
    
instance Arbitrary ComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSInfo where
  arbitrary =
    ComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSInfo
      <$> arbitrary -- comAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSInfoProperties :: Maybe ComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSProperties
    
instance Arbitrary ComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSProperties where
  arbitrary =
    ComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSProperties
      <$> arbitrary -- comAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSPropertiesHcTags :: Maybe ConfigNodePropertyArray
    
instance Arbitrary ComAdobeGraniteSecurityUserUserPropertiesServiceInfo where
  arbitrary =
    ComAdobeGraniteSecurityUserUserPropertiesServiceInfo
      <$> arbitrary -- comAdobeGraniteSecurityUserUserPropertiesServiceInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeGraniteSecurityUserUserPropertiesServiceInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeGraniteSecurityUserUserPropertiesServiceInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeGraniteSecurityUserUserPropertiesServiceInfoProperties :: Maybe ComAdobeGraniteSecurityUserUserPropertiesServiceProperties
      <*> arbitrary -- comAdobeGraniteSecurityUserUserPropertiesServiceInfoBundleLocation :: Maybe Text
      <*> arbitrary -- comAdobeGraniteSecurityUserUserPropertiesServiceInfoServiceLocation :: Maybe Text
    
instance Arbitrary ComAdobeGraniteSecurityUserUserPropertiesServiceProperties where
  arbitrary =
    ComAdobeGraniteSecurityUserUserPropertiesServiceProperties
      <$> arbitrary -- comAdobeGraniteSecurityUserUserPropertiesServicePropertiesAdapterCondition :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteSecurityUserUserPropertiesServicePropertiesGraniteUserpropertiesNodetypes :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comAdobeGraniteSecurityUserUserPropertiesServicePropertiesGraniteUserpropertiesResourcetypes :: Maybe ConfigNodePropertyArray
    
instance Arbitrary ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplInfo where
  arbitrary =
    ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplInfo
      <$> arbitrary -- comAdobeGraniteSocialgraphImplSocialGraphFactoryImplInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeGraniteSocialgraphImplSocialGraphFactoryImplInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeGraniteSocialgraphImplSocialGraphFactoryImplInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeGraniteSocialgraphImplSocialGraphFactoryImplInfoProperties :: Maybe ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties
    
instance Arbitrary ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties where
  arbitrary =
    ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties
      <$> arbitrary -- comAdobeGraniteSocialgraphImplSocialGraphFactoryImplPropertiesGroup2memberRelationshipOutgoing :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteSocialgraphImplSocialGraphFactoryImplPropertiesGroup2memberExcludedOutgoing :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comAdobeGraniteSocialgraphImplSocialGraphFactoryImplPropertiesGroup2memberRelationshipIncoming :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteSocialgraphImplSocialGraphFactoryImplPropertiesGroup2memberExcludedIncoming :: Maybe ConfigNodePropertyArray
    
instance Arbitrary ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplInfo where
  arbitrary =
    ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplInfo
      <$> arbitrary -- comAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplInfoProperties :: Maybe ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties
    
instance Arbitrary ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties where
  arbitrary =
    ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties
      <$> arbitrary -- comAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplPropertiesSchedulerExpression :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplPropertiesJmxObjectname :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryInfo where
  arbitrary =
    ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryInfo
      <$> arbitrary -- comAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryInfoProperties :: Maybe ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryProperties
    
instance Arbitrary ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryProperties where
  arbitrary =
    ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryProperties
      <$> arbitrary -- comAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryPropertiesAdapterCondition :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceInfo where
  arbitrary =
    ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceInfo
      <$> arbitrary -- comAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceInfoProperties :: Maybe ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties
    
instance Arbitrary ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties where
  arbitrary =
    ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties
      <$> arbitrary -- comAdobeGraniteTaskmanagementImplJcrTaskArchiveServicePropertiesArchivingEnabled :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- comAdobeGraniteTaskmanagementImplJcrTaskArchiveServicePropertiesSchedulerExpression :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteTaskmanagementImplJcrTaskArchiveServicePropertiesArchiveSinceDaysCompleted :: Maybe ConfigNodePropertyInteger
    
instance Arbitrary ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskInfo where
  arbitrary =
    ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskInfo
      <$> arbitrary -- comAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskInfoProperties :: Maybe ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties
    
instance Arbitrary ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties where
  arbitrary =
    ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties
      <$> arbitrary -- comAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskPropertiesPurgeCompleted :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- comAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskPropertiesCompletedAge :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskPropertiesPurgeActive :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- comAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskPropertiesActiveAge :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskPropertiesSaveThreshold :: Maybe ConfigNodePropertyInteger
    
instance Arbitrary ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorInfo where
  arbitrary =
    ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorInfo
      <$> arbitrary -- comAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorInfoProperties :: Maybe ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties
    
instance Arbitrary ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties where
  arbitrary =
    ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties
      <$> arbitrary -- comAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorPropertiesAdapterCondition :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorPropertiesTaskmanagerAdmingroups :: Maybe ConfigNodePropertyArray
    
instance Arbitrary ComAdobeGraniteThreaddumpThreadDumpCollectorInfo where
  arbitrary =
    ComAdobeGraniteThreaddumpThreadDumpCollectorInfo
      <$> arbitrary -- comAdobeGraniteThreaddumpThreadDumpCollectorInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeGraniteThreaddumpThreadDumpCollectorInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeGraniteThreaddumpThreadDumpCollectorInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeGraniteThreaddumpThreadDumpCollectorInfoProperties :: Maybe ComAdobeGraniteThreaddumpThreadDumpCollectorProperties
    
instance Arbitrary ComAdobeGraniteThreaddumpThreadDumpCollectorProperties where
  arbitrary =
    ComAdobeGraniteThreaddumpThreadDumpCollectorProperties
      <$> arbitrary -- comAdobeGraniteThreaddumpThreadDumpCollectorPropertiesSchedulerPeriod :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comAdobeGraniteThreaddumpThreadDumpCollectorPropertiesSchedulerRunOn :: Maybe ConfigNodePropertyDropDown
      <*> arbitrary -- comAdobeGraniteThreaddumpThreadDumpCollectorPropertiesGraniteThreaddumpEnabled :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- comAdobeGraniteThreaddumpThreadDumpCollectorPropertiesGraniteThreaddumpDumpsPerFile :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comAdobeGraniteThreaddumpThreadDumpCollectorPropertiesGraniteThreaddumpEnableGzipCompression :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- comAdobeGraniteThreaddumpThreadDumpCollectorPropertiesGraniteThreaddumpEnableDirectoriesCompression :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- comAdobeGraniteThreaddumpThreadDumpCollectorPropertiesGraniteThreaddumpEnableJStack :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- comAdobeGraniteThreaddumpThreadDumpCollectorPropertiesGraniteThreaddumpMaxBackupDays :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comAdobeGraniteThreaddumpThreadDumpCollectorPropertiesGraniteThreaddumpBackupCleanTrigger :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslInfo where
  arbitrary =
    ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslInfo
      <$> arbitrary -- comAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslInfoProperties :: Maybe ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties
    
instance Arbitrary ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties where
  arbitrary =
    ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties
      <$> arbitrary -- comAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslPropertiesTranslationFactory :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslPropertiesDefaultConnectorLabel :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslPropertiesDefaultConnectorAttribution :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslPropertiesDefaultConnectorWorkspaceId :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslPropertiesDefaultConnectorSubscriptionKey :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslPropertiesLanguageMapLocation :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslPropertiesCategoryMapLocation :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslPropertiesRetryAttempts :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslPropertiesTimeoutCount :: Maybe ConfigNodePropertyInteger
    
instance Arbitrary ComAdobeGraniteTranslationCoreImplTranslationManagerImplInfo where
  arbitrary =
    ComAdobeGraniteTranslationCoreImplTranslationManagerImplInfo
      <$> arbitrary -- comAdobeGraniteTranslationCoreImplTranslationManagerImplInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeGraniteTranslationCoreImplTranslationManagerImplInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeGraniteTranslationCoreImplTranslationManagerImplInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeGraniteTranslationCoreImplTranslationManagerImplInfoProperties :: Maybe ComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties
    
instance Arbitrary ComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties where
  arbitrary =
    ComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties
      <$> arbitrary -- comAdobeGraniteTranslationCoreImplTranslationManagerImplPropertiesDefaultConnectorName :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteTranslationCoreImplTranslationManagerImplPropertiesDefaultCategory :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplInfo where
  arbitrary =
    ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplInfo
      <$> arbitrary -- comAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplInfoProperties :: Maybe ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties
      <*> arbitrary -- comAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplInfoBundleLocation :: Maybe Text
      <*> arbitrary -- comAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplInfoServiceLocation :: Maybe Text
    
instance Arbitrary ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties where
  arbitrary =
    ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties
      <$> arbitrary -- comAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplPropertiesHtmllibmanagerTiming :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- comAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplPropertiesHtmllibmanagerDebugInitJs :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplPropertiesHtmllibmanagerMinify :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- comAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplPropertiesHtmllibmanagerDebug :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- comAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplPropertiesHtmllibmanagerGzip :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- comAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplPropertiesHtmllibmanagerMaxDataUriSize :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplPropertiesHtmllibmanagerMaxage :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplPropertiesHtmllibmanagerForceCqUrlInfo :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- comAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplPropertiesHtmllibmanagerDefaultthemename :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplPropertiesHtmllibmanagerDefaultuserthemename :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplPropertiesHtmllibmanagerClientmanager :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplPropertiesHtmllibmanagerPathList :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplPropertiesHtmllibmanagerExcludedPathList :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplPropertiesHtmllibmanagerProcessorJs :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplPropertiesHtmllibmanagerProcessorCss :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplPropertiesHtmllibmanagerLongcachePatterns :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplPropertiesHtmllibmanagerLongcacheFormat :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplPropertiesHtmllibmanagerUseFileSystemOutputCache :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- comAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplPropertiesHtmllibmanagerFileSystemOutputCacheLocation :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplPropertiesHtmllibmanagerDisableReplacement :: Maybe ConfigNodePropertyArray
    
instance Arbitrary ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureInfo where
  arbitrary =
    ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureInfo
      <$> arbitrary -- comAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureInfoProperties :: Maybe ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureProperties
    
instance Arbitrary ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureProperties where
  arbitrary =
    ComAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureProperties
      <$> arbitrary -- comAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeaturePropertiesEnabled :: Maybe ConfigNodePropertyBoolean
    
instance Arbitrary ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceInfo where
  arbitrary =
    ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceInfo
      <$> arbitrary -- comAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceInfoProperties :: Maybe ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties
    
instance Arbitrary ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties where
  arbitrary =
    ComAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServiceProperties
      <$> arbitrary -- comAdobeGraniteWorkflowConsolePublishWorkflowPublishEventServicePropertiesGraniteWorkflowWorkflowPublishEventServiceEnabled :: Maybe ConfigNodePropertyBoolean
    
instance Arbitrary ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerInfo where
  arbitrary =
    ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerInfo
      <$> arbitrary -- comAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerInfoProperties :: Maybe ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties
    
instance Arbitrary ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties where
  arbitrary =
    ComAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerProperties
      <$> arbitrary -- comAdobeGraniteWorkflowCoreJcrWorkflowBucketManagerPropertiesBucketSize :: Maybe ConfigNodePropertyInteger
    
instance Arbitrary ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerInfo where
  arbitrary =
    ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerInfo
      <$> arbitrary -- comAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerInfoProperties :: Maybe ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties
    
instance Arbitrary ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties where
  arbitrary =
    ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties
      <$> arbitrary -- comAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerPropertiesDefaultTimeout :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerPropertiesMaxTimeout :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerPropertiesDefaultPeriod :: Maybe ConfigNodePropertyInteger
    
instance Arbitrary ComAdobeGraniteWorkflowCoreJobJobHandlerInfo where
  arbitrary =
    ComAdobeGraniteWorkflowCoreJobJobHandlerInfo
      <$> arbitrary -- comAdobeGraniteWorkflowCoreJobJobHandlerInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeGraniteWorkflowCoreJobJobHandlerInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeGraniteWorkflowCoreJobJobHandlerInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeGraniteWorkflowCoreJobJobHandlerInfoProperties :: Maybe ComAdobeGraniteWorkflowCoreJobJobHandlerProperties
    
instance Arbitrary ComAdobeGraniteWorkflowCoreJobJobHandlerProperties where
  arbitrary =
    ComAdobeGraniteWorkflowCoreJobJobHandlerProperties
      <$> arbitrary -- comAdobeGraniteWorkflowCoreJobJobHandlerPropertiesJobTopics :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comAdobeGraniteWorkflowCoreJobJobHandlerPropertiesAllowSelfProcessTermination :: Maybe ConfigNodePropertyBoolean
    
instance Arbitrary ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumInfo where
  arbitrary =
    ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumInfo
      <$> arbitrary -- comAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumInfoProperties :: Maybe ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties
    
instance Arbitrary ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties where
  arbitrary =
    ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties
      <$> arbitrary -- comAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumPropertiesJobTopics :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComAdobeGraniteWorkflowCorePayloadMapCacheInfo where
  arbitrary =
    ComAdobeGraniteWorkflowCorePayloadMapCacheInfo
      <$> arbitrary -- comAdobeGraniteWorkflowCorePayloadMapCacheInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeGraniteWorkflowCorePayloadMapCacheInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeGraniteWorkflowCorePayloadMapCacheInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeGraniteWorkflowCorePayloadMapCacheInfoProperties :: Maybe ComAdobeGraniteWorkflowCorePayloadMapCacheProperties
    
instance Arbitrary ComAdobeGraniteWorkflowCorePayloadMapCacheProperties where
  arbitrary =
    ComAdobeGraniteWorkflowCorePayloadMapCacheProperties
      <$> arbitrary -- comAdobeGraniteWorkflowCorePayloadMapCachePropertiesGetSystemWorkflowModels :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comAdobeGraniteWorkflowCorePayloadMapCachePropertiesGetPackageRootPath :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerInfo where
  arbitrary =
    ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerInfo
      <$> arbitrary -- comAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerInfoProperties :: Maybe ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties
    
instance Arbitrary ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties where
  arbitrary =
    ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties
      <$> arbitrary -- comAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerPropertiesPayloadMoveWhiteList :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerPropertiesPayloadMoveHandleFromWorkflowProcess :: Maybe ConfigNodePropertyBoolean
    
instance Arbitrary ComAdobeGraniteWorkflowCoreWorkflowConfigInfo where
  arbitrary =
    ComAdobeGraniteWorkflowCoreWorkflowConfigInfo
      <$> arbitrary -- comAdobeGraniteWorkflowCoreWorkflowConfigInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeGraniteWorkflowCoreWorkflowConfigInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeGraniteWorkflowCoreWorkflowConfigInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeGraniteWorkflowCoreWorkflowConfigInfoProperties :: Maybe ComAdobeGraniteWorkflowCoreWorkflowConfigProperties
    
instance Arbitrary ComAdobeGraniteWorkflowCoreWorkflowConfigProperties where
  arbitrary =
    ComAdobeGraniteWorkflowCoreWorkflowConfigProperties
      <$> arbitrary -- comAdobeGraniteWorkflowCoreWorkflowConfigPropertiesCqWorkflowConfigWorkflowPackagesRootPath :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comAdobeGraniteWorkflowCoreWorkflowConfigPropertiesCqWorkflowConfigWorkflowProcessLegacyMode :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- comAdobeGraniteWorkflowCoreWorkflowConfigPropertiesCqWorkflowConfigAllowLocking :: Maybe ConfigNodePropertyBoolean
    
instance Arbitrary ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryInfo where
  arbitrary =
    ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryInfo
      <$> arbitrary -- comAdobeGraniteWorkflowCoreWorkflowSessionFactoryInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeGraniteWorkflowCoreWorkflowSessionFactoryInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeGraniteWorkflowCoreWorkflowSessionFactoryInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeGraniteWorkflowCoreWorkflowSessionFactoryInfoProperties :: Maybe ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties
    
instance Arbitrary ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties where
  arbitrary =
    ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties
      <$> arbitrary -- comAdobeGraniteWorkflowCoreWorkflowSessionFactoryPropertiesGraniteWorkflowinboxSortPropertyName :: Maybe ConfigNodePropertyDropDown
      <*> arbitrary -- comAdobeGraniteWorkflowCoreWorkflowSessionFactoryPropertiesGraniteWorkflowinboxSortOrder :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteWorkflowCoreWorkflowSessionFactoryPropertiesCqWorkflowJobRetry :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comAdobeGraniteWorkflowCoreWorkflowSessionFactoryPropertiesCqWorkflowSuperuser :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comAdobeGraniteWorkflowCoreWorkflowSessionFactoryPropertiesGraniteWorkflowInboxQuerySize :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comAdobeGraniteWorkflowCoreWorkflowSessionFactoryPropertiesGraniteWorkflowAdminUserGroupFilter :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- comAdobeGraniteWorkflowCoreWorkflowSessionFactoryPropertiesGraniteWorkflowEnforceWorkitemAssigneePermissions :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- comAdobeGraniteWorkflowCoreWorkflowSessionFactoryPropertiesGraniteWorkflowEnforceWorkflowInitiatorPermissions :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- comAdobeGraniteWorkflowCoreWorkflowSessionFactoryPropertiesGraniteWorkflowInjectTenantIdInJobTopics :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- comAdobeGraniteWorkflowCoreWorkflowSessionFactoryPropertiesGraniteWorkflowMaxPurgeSaveThreshold :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comAdobeGraniteWorkflowCoreWorkflowSessionFactoryPropertiesGraniteWorkflowMaxPurgeQueryCount :: Maybe ConfigNodePropertyInteger
    
instance Arbitrary ComAdobeGraniteWorkflowPurgeSchedulerInfo where
  arbitrary =
    ComAdobeGraniteWorkflowPurgeSchedulerInfo
      <$> arbitrary -- comAdobeGraniteWorkflowPurgeSchedulerInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeGraniteWorkflowPurgeSchedulerInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeGraniteWorkflowPurgeSchedulerInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeGraniteWorkflowPurgeSchedulerInfoProperties :: Maybe ComAdobeGraniteWorkflowPurgeSchedulerProperties
    
instance Arbitrary ComAdobeGraniteWorkflowPurgeSchedulerProperties where
  arbitrary =
    ComAdobeGraniteWorkflowPurgeSchedulerProperties
      <$> arbitrary -- comAdobeGraniteWorkflowPurgeSchedulerPropertiesScheduledpurgeName :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeGraniteWorkflowPurgeSchedulerPropertiesScheduledpurgeWorkflowStatus :: Maybe ConfigNodePropertyDropDown
      <*> arbitrary -- comAdobeGraniteWorkflowPurgeSchedulerPropertiesScheduledpurgeModelIds :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comAdobeGraniteWorkflowPurgeSchedulerPropertiesScheduledpurgeDaysold :: Maybe ConfigNodePropertyInteger
    
instance Arbitrary ComAdobeOctopusNcommBootstrapInfo where
  arbitrary =
    ComAdobeOctopusNcommBootstrapInfo
      <$> arbitrary -- comAdobeOctopusNcommBootstrapInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeOctopusNcommBootstrapInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeOctopusNcommBootstrapInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeOctopusNcommBootstrapInfoProperties :: Maybe ComAdobeOctopusNcommBootstrapProperties
    
instance Arbitrary ComAdobeOctopusNcommBootstrapProperties where
  arbitrary =
    ComAdobeOctopusNcommBootstrapProperties
      <$> arbitrary -- comAdobeOctopusNcommBootstrapPropertiesMaxConnections :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comAdobeOctopusNcommBootstrapPropertiesMaxRequests :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comAdobeOctopusNcommBootstrapPropertiesRequestTimeout :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comAdobeOctopusNcommBootstrapPropertiesRequestRetries :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comAdobeOctopusNcommBootstrapPropertiesLaunchTimeout :: Maybe ConfigNodePropertyInteger
    
instance Arbitrary ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSInfo where
  arbitrary =
    ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSInfo
      <$> arbitrary -- comAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSInfoProperties :: Maybe ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties
    
instance Arbitrary ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties where
  arbitrary =
    ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties
      <$> arbitrary -- comAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSPropertiesCommunitiesIntegrationLivefyreSlingEventFilter :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComAdobeXmpWorkerFilesNcommXMPFilesNCommInfo where
  arbitrary =
    ComAdobeXmpWorkerFilesNcommXMPFilesNCommInfo
      <$> arbitrary -- comAdobeXmpWorkerFilesNcommXMPFilesNCommInfoPid :: Maybe Text
      <*> arbitrary -- comAdobeXmpWorkerFilesNcommXMPFilesNCommInfoTitle :: Maybe Text
      <*> arbitrary -- comAdobeXmpWorkerFilesNcommXMPFilesNCommInfoDescription :: Maybe Text
      <*> arbitrary -- comAdobeXmpWorkerFilesNcommXMPFilesNCommInfoProperties :: Maybe ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties
      <*> arbitrary -- comAdobeXmpWorkerFilesNcommXMPFilesNCommInfoBundleLocation :: Maybe Text
      <*> arbitrary -- comAdobeXmpWorkerFilesNcommXMPFilesNCommInfoServiceLocation :: Maybe Text
    
instance Arbitrary ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties where
  arbitrary =
    ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties
      <$> arbitrary -- comAdobeXmpWorkerFilesNcommXMPFilesNCommPropertiesMaxConnections :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeXmpWorkerFilesNcommXMPFilesNCommPropertiesMaxRequests :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeXmpWorkerFilesNcommXMPFilesNCommPropertiesRequestTimeout :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comAdobeXmpWorkerFilesNcommXMPFilesNCommPropertiesLogDir :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceInfo where
  arbitrary =
    ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceInfo
      <$> arbitrary -- comDayCommonsDatasourceJdbcpoolJdbcPoolServiceInfoPid :: Maybe Text
      <*> arbitrary -- comDayCommonsDatasourceJdbcpoolJdbcPoolServiceInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCommonsDatasourceJdbcpoolJdbcPoolServiceInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCommonsDatasourceJdbcpoolJdbcPoolServiceInfoProperties :: Maybe ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties
    
instance Arbitrary ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties where
  arbitrary =
    ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties
      <$> arbitrary -- comDayCommonsDatasourceJdbcpoolJdbcPoolServicePropertiesJdbcDriverClass :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comDayCommonsDatasourceJdbcpoolJdbcPoolServicePropertiesJdbcConnectionUri :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comDayCommonsDatasourceJdbcpoolJdbcPoolServicePropertiesJdbcUsername :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comDayCommonsDatasourceJdbcpoolJdbcPoolServicePropertiesJdbcPassword :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comDayCommonsDatasourceJdbcpoolJdbcPoolServicePropertiesJdbcValidationQuery :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comDayCommonsDatasourceJdbcpoolJdbcPoolServicePropertiesDefaultReadonly :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- comDayCommonsDatasourceJdbcpoolJdbcPoolServicePropertiesDefaultAutocommit :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- comDayCommonsDatasourceJdbcpoolJdbcPoolServicePropertiesPoolSize :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comDayCommonsDatasourceJdbcpoolJdbcPoolServicePropertiesPoolMaxWaitMsec :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comDayCommonsDatasourceJdbcpoolJdbcPoolServicePropertiesDatasourceName :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comDayCommonsDatasourceJdbcpoolJdbcPoolServicePropertiesDatasourceSvcProperties :: Maybe ConfigNodePropertyArray
    
instance Arbitrary ComDayCommonsHttpclientInfo where
  arbitrary =
    ComDayCommonsHttpclientInfo
      <$> arbitrary -- comDayCommonsHttpclientInfoPid :: Maybe Text
      <*> arbitrary -- comDayCommonsHttpclientInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCommonsHttpclientInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCommonsHttpclientInfoProperties :: Maybe ComDayCommonsHttpclientProperties
    
instance Arbitrary ComDayCommonsHttpclientProperties where
  arbitrary =
    ComDayCommonsHttpclientProperties
      <$> arbitrary -- comDayCommonsHttpclientPropertiesProxyEnabled :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- comDayCommonsHttpclientPropertiesProxyHost :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comDayCommonsHttpclientPropertiesProxyUser :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comDayCommonsHttpclientPropertiesProxyPassword :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comDayCommonsHttpclientPropertiesProxyNtlmHost :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comDayCommonsHttpclientPropertiesProxyNtlmDomain :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comDayCommonsHttpclientPropertiesProxyExceptions :: Maybe ConfigNodePropertyArray
    
instance Arbitrary ComDayCqAnalyticsImplStorePropertiesChangeListenerInfo where
  arbitrary =
    ComDayCqAnalyticsImplStorePropertiesChangeListenerInfo
      <$> arbitrary -- comDayCqAnalyticsImplStorePropertiesChangeListenerInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqAnalyticsImplStorePropertiesChangeListenerInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqAnalyticsImplStorePropertiesChangeListenerInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqAnalyticsImplStorePropertiesChangeListenerInfoProperties :: Maybe ComDayCqAnalyticsImplStorePropertiesChangeListenerProperties
    
instance Arbitrary ComDayCqAnalyticsImplStorePropertiesChangeListenerProperties where
  arbitrary =
    ComDayCqAnalyticsImplStorePropertiesChangeListenerProperties
      <$> arbitrary -- comDayCqAnalyticsImplStorePropertiesChangeListenerPropertiesCqStoreListenerAdditionalStorePaths :: Maybe ConfigNodePropertyArray
    
instance Arbitrary ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteInfo where
  arbitrary =
    ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteInfo
      <$> arbitrary -- comDayCqAnalyticsSitecatalystImplExporterClassificationsExporteInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqAnalyticsSitecatalystImplExporterClassificationsExporteInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqAnalyticsSitecatalystImplExporterClassificationsExporteInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqAnalyticsSitecatalystImplExporterClassificationsExporteInfoProperties :: Maybe ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties
    
instance Arbitrary ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties where
  arbitrary =
    ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties
      <$> arbitrary -- comDayCqAnalyticsSitecatalystImplExporterClassificationsExportePropertiesAllowedPaths :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comDayCqAnalyticsSitecatalystImplExporterClassificationsExportePropertiesCqAnalyticsSaintExporterPagesize :: Maybe ConfigNodePropertyInteger
    
instance Arbitrary ComDayCqAnalyticsSitecatalystImplImporterReportImporterInfo where
  arbitrary =
    ComDayCqAnalyticsSitecatalystImplImporterReportImporterInfo
      <$> arbitrary -- comDayCqAnalyticsSitecatalystImplImporterReportImporterInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqAnalyticsSitecatalystImplImporterReportImporterInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqAnalyticsSitecatalystImplImporterReportImporterInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqAnalyticsSitecatalystImplImporterReportImporterInfoProperties :: Maybe ComDayCqAnalyticsSitecatalystImplImporterReportImporterProperties
    
instance Arbitrary ComDayCqAnalyticsSitecatalystImplImporterReportImporterProperties where
  arbitrary =
    ComDayCqAnalyticsSitecatalystImplImporterReportImporterProperties
      <$> arbitrary -- comDayCqAnalyticsSitecatalystImplImporterReportImporterPropertiesReportFetchAttempts :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comDayCqAnalyticsSitecatalystImplImporterReportImporterPropertiesReportFetchDelay :: Maybe ConfigNodePropertyInteger
    
instance Arbitrary ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryInfo where
  arbitrary =
    ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryInfo
      <$> arbitrary -- comDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryInfoProperties :: Maybe ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryProperties
    
instance Arbitrary ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryProperties where
  arbitrary =
    ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryProperties
      <$> arbitrary -- comDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryPropertiesCqAnalyticsAdapterfactoryContextstores :: Maybe ConfigNodePropertyArray
    
instance Arbitrary ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplInfo where
  arbitrary =
    ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplInfo
      <$> arbitrary -- comDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplInfoProperties :: Maybe ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties
      <*> arbitrary -- comDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplInfoAdditionalProperties :: Maybe Text
      <*> arbitrary -- comDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplInfoBundleLocation :: Maybe Text
      <*> arbitrary -- comDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplInfoServiceLocation :: Maybe Text
    
instance Arbitrary ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties where
  arbitrary =
    ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties
      <$> arbitrary -- comDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplPropertiesCqAnalyticsSitecatalystServiceDatacenterUrl :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplPropertiesDevhostnamepatterns :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplPropertiesConnectionTimeout :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplPropertiesSocketTimeout :: Maybe ConfigNodePropertyInteger
    
instance Arbitrary ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterInfo where
  arbitrary =
    ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterInfo
      <$> arbitrary -- comDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterInfoProperties :: Maybe ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterProperties
    
instance Arbitrary ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterProperties where
  arbitrary =
    ComDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterProperties
      <$> arbitrary -- comDayCqAnalyticsTestandtargetImplAccountOptionsUpdaterPropertiesCqAnalyticsTestandtargetAccountoptionsupdaterEnabled :: Maybe ConfigNodePropertyBoolean
    
instance Arbitrary ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerInfo where
  arbitrary =
    ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerInfo
      <$> arbitrary -- comDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerInfoProperties :: Maybe ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerProperties
    
instance Arbitrary ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerProperties where
  arbitrary =
    ComDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerProperties
      <$> arbitrary -- comDayCqAnalyticsTestandtargetImplDeleteAuthorActivityListenerPropertiesCqAnalyticsTestandtargetDeleteauthoractivitylistenerEnabled :: Maybe ConfigNodePropertyBoolean
    
instance Arbitrary ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerInfo where
  arbitrary =
    ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerInfo
      <$> arbitrary -- comDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerInfoProperties :: Maybe ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerProperties
      <*> arbitrary -- comDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerInfoBundleLocation :: Maybe Text
      <*> arbitrary -- comDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerInfoServiceLocation :: Maybe Text
    
instance Arbitrary ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerProperties where
  arbitrary =
    ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerProperties
      <$> arbitrary -- comDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerPropertiesCqAnalyticsTestandtargetPushauthorcampaignpagelistenerEnabled :: Maybe ConfigNodePropertyBoolean
    
instance Arbitrary ComDayCqAnalyticsTestandtargetImplSegmentImporterInfo where
  arbitrary =
    ComDayCqAnalyticsTestandtargetImplSegmentImporterInfo
      <$> arbitrary -- comDayCqAnalyticsTestandtargetImplSegmentImporterInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqAnalyticsTestandtargetImplSegmentImporterInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqAnalyticsTestandtargetImplSegmentImporterInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqAnalyticsTestandtargetImplSegmentImporterInfoProperties :: Maybe ComDayCqAnalyticsTestandtargetImplSegmentImporterProperties
    
instance Arbitrary ComDayCqAnalyticsTestandtargetImplSegmentImporterProperties where
  arbitrary =
    ComDayCqAnalyticsTestandtargetImplSegmentImporterProperties
      <$> arbitrary -- comDayCqAnalyticsTestandtargetImplSegmentImporterPropertiesCqAnalyticsTestandtargetSegmentimporterEnabled :: Maybe ConfigNodePropertyBoolean
    
instance Arbitrary ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplInfo where
  arbitrary =
    ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplInfo
      <$> arbitrary -- comDayCqAnalyticsTestandtargetImplServiceWebServiceImplInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqAnalyticsTestandtargetImplServiceWebServiceImplInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqAnalyticsTestandtargetImplServiceWebServiceImplInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqAnalyticsTestandtargetImplServiceWebServiceImplInfoProperties :: Maybe ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties
    
instance Arbitrary ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties where
  arbitrary =
    ComDayCqAnalyticsTestandtargetImplServiceWebServiceImplProperties
      <$> arbitrary -- comDayCqAnalyticsTestandtargetImplServiceWebServiceImplPropertiesEndpointUri :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comDayCqAnalyticsTestandtargetImplServiceWebServiceImplPropertiesConnectionTimeout :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comDayCqAnalyticsTestandtargetImplServiceWebServiceImplPropertiesSocketTimeout :: Maybe ConfigNodePropertyInteger
    
instance Arbitrary ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletInfo where
  arbitrary =
    ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletInfo
      <$> arbitrary -- comDayCqAnalyticsTestandtargetImplServletsAdminServerServletInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqAnalyticsTestandtargetImplServletsAdminServerServletInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqAnalyticsTestandtargetImplServletsAdminServerServletInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqAnalyticsTestandtargetImplServletsAdminServerServletInfoProperties :: Maybe ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletProperties
    
instance Arbitrary ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletProperties where
  arbitrary =
    ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletProperties
      <$> arbitrary -- comDayCqAnalyticsTestandtargetImplServletsAdminServerServletPropertiesTestandtargetEndpointUrl :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplInfo where
  arbitrary =
    ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplInfo
      <$> arbitrary -- comDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplInfoProperties :: Maybe ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties
    
instance Arbitrary ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties where
  arbitrary =
    ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties
      <$> arbitrary -- comDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplPropertiesCqAnalyticsTestandtargetApiUrl :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplPropertiesCqAnalyticsTestandtargetTimeout :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplPropertiesCqAnalyticsTestandtargetSockettimeout :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplPropertiesCqAnalyticsTestandtargetRecommendationsUrlReplace :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplPropertiesCqAnalyticsTestandtargetRecommendationsUrlReplacewith :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComDayCqAuthImplCugCugSupportImplInfo where
  arbitrary =
    ComDayCqAuthImplCugCugSupportImplInfo
      <$> arbitrary -- comDayCqAuthImplCugCugSupportImplInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqAuthImplCugCugSupportImplInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqAuthImplCugCugSupportImplInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqAuthImplCugCugSupportImplInfoProperties :: Maybe ComDayCqAuthImplCugCugSupportImplProperties
    
instance Arbitrary ComDayCqAuthImplCugCugSupportImplProperties where
  arbitrary =
    ComDayCqAuthImplCugCugSupportImplProperties
      <$> arbitrary -- comDayCqAuthImplCugCugSupportImplPropertiesCugExemptedPrincipals :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comDayCqAuthImplCugCugSupportImplPropertiesCugEnabled :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- comDayCqAuthImplCugCugSupportImplPropertiesCugPrincipalsRegex :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comDayCqAuthImplCugCugSupportImplPropertiesCugPrincipalsReplacement :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComDayCqAuthImplLoginSelectorHandlerInfo where
  arbitrary =
    ComDayCqAuthImplLoginSelectorHandlerInfo
      <$> arbitrary -- comDayCqAuthImplLoginSelectorHandlerInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqAuthImplLoginSelectorHandlerInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqAuthImplLoginSelectorHandlerInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqAuthImplLoginSelectorHandlerInfoProperties :: Maybe ComDayCqAuthImplLoginSelectorHandlerProperties
      <*> arbitrary -- comDayCqAuthImplLoginSelectorHandlerInfoBundleLocation :: Maybe Text
      <*> arbitrary -- comDayCqAuthImplLoginSelectorHandlerInfoServiceLocation :: Maybe Text
    
instance Arbitrary ComDayCqAuthImplLoginSelectorHandlerProperties where
  arbitrary =
    ComDayCqAuthImplLoginSelectorHandlerProperties
      <$> arbitrary -- comDayCqAuthImplLoginSelectorHandlerPropertiesPath :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comDayCqAuthImplLoginSelectorHandlerPropertiesServiceRanking :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comDayCqAuthImplLoginSelectorHandlerPropertiesAuthLoginselectorMappings :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comDayCqAuthImplLoginSelectorHandlerPropertiesAuthLoginselectorChangepwMappings :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comDayCqAuthImplLoginSelectorHandlerPropertiesAuthLoginselectorDefaultloginpage :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comDayCqAuthImplLoginSelectorHandlerPropertiesAuthLoginselectorDefaultchangepwpage :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comDayCqAuthImplLoginSelectorHandlerPropertiesAuthLoginselectorHandle :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comDayCqAuthImplLoginSelectorHandlerPropertiesAuthLoginselectorHandleAllExtensions :: Maybe ConfigNodePropertyBoolean
    
instance Arbitrary ComDayCqCommonsImplExternalizerImplInfo where
  arbitrary =
    ComDayCqCommonsImplExternalizerImplInfo
      <$> arbitrary -- comDayCqCommonsImplExternalizerImplInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqCommonsImplExternalizerImplInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqCommonsImplExternalizerImplInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqCommonsImplExternalizerImplInfoProperties :: Maybe ComDayCqCommonsImplExternalizerImplProperties
      <*> arbitrary -- comDayCqCommonsImplExternalizerImplInfoBundleLocation :: Maybe Text
      <*> arbitrary -- comDayCqCommonsImplExternalizerImplInfoServiceLocation :: Maybe Text
    
instance Arbitrary ComDayCqCommonsImplExternalizerImplProperties where
  arbitrary =
    ComDayCqCommonsImplExternalizerImplProperties
      <$> arbitrary -- comDayCqCommonsImplExternalizerImplPropertiesExternalizerDomains :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comDayCqCommonsImplExternalizerImplPropertiesExternalizerHost :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comDayCqCommonsImplExternalizerImplPropertiesExternalizerContextpath :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comDayCqCommonsImplExternalizerImplPropertiesExternalizerEncodedpath :: Maybe ConfigNodePropertyBoolean
    
instance Arbitrary ComDayCqCommonsServletsRootMappingServletInfo where
  arbitrary =
    ComDayCqCommonsServletsRootMappingServletInfo
      <$> arbitrary -- comDayCqCommonsServletsRootMappingServletInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqCommonsServletsRootMappingServletInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqCommonsServletsRootMappingServletInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqCommonsServletsRootMappingServletInfoProperties :: Maybe ComDayCqCommonsServletsRootMappingServletProperties
      <*> arbitrary -- comDayCqCommonsServletsRootMappingServletInfoBundleLocation :: Maybe Text
      <*> arbitrary -- comDayCqCommonsServletsRootMappingServletInfoServiceLocation :: Maybe Text
    
instance Arbitrary ComDayCqCommonsServletsRootMappingServletProperties where
  arbitrary =
    ComDayCqCommonsServletsRootMappingServletProperties
      <$> arbitrary -- comDayCqCommonsServletsRootMappingServletPropertiesRootmappingTarget :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeInfo where
  arbitrary =
    ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeInfo
      <$> arbitrary -- comDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeInfoProperties :: Maybe ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties
    
instance Arbitrary ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties where
  arbitrary =
    ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties
      <$> arbitrary -- comDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckePropertiesCodeupgradetasks :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckePropertiesCodeupgradetaskfilters :: Maybe ConfigNodePropertyArray
    
instance Arbitrary ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListInfo where
  arbitrary =
    ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListInfo
      <$> arbitrary -- comDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListInfoProperties :: Maybe ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties
    
instance Arbitrary ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties where
  arbitrary =
    ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties
      <$> arbitrary -- comDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListPropertiesUpgradeTaskIgnoreList :: Maybe ConfigNodePropertyArray
    
instance Arbitrary ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistInfo where
  arbitrary =
    ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistInfo
      <$> arbitrary -- comDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistInfoProperties :: Maybe ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties
    
instance Arbitrary ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties where
  arbitrary =
    ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties
      <$> arbitrary -- comDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistPropertiesEffectiveBundleListPath :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComDayCqContentsyncImplContentSyncManagerImplInfo where
  arbitrary =
    ComDayCqContentsyncImplContentSyncManagerImplInfo
      <$> arbitrary -- comDayCqContentsyncImplContentSyncManagerImplInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqContentsyncImplContentSyncManagerImplInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqContentsyncImplContentSyncManagerImplInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqContentsyncImplContentSyncManagerImplInfoProperties :: Maybe ComDayCqContentsyncImplContentSyncManagerImplProperties
    
instance Arbitrary ComDayCqContentsyncImplContentSyncManagerImplProperties where
  arbitrary =
    ComDayCqContentsyncImplContentSyncManagerImplProperties
      <$> arbitrary -- comDayCqContentsyncImplContentSyncManagerImplPropertiesContentsyncFallbackAuthorizable :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comDayCqContentsyncImplContentSyncManagerImplPropertiesContentsyncFallbackUpdateuser :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComDayCqDamCommonsHandlerStandardImageHandlerInfo where
  arbitrary =
    ComDayCqDamCommonsHandlerStandardImageHandlerInfo
      <$> arbitrary -- comDayCqDamCommonsHandlerStandardImageHandlerInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqDamCommonsHandlerStandardImageHandlerInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqDamCommonsHandlerStandardImageHandlerInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqDamCommonsHandlerStandardImageHandlerInfoProperties :: Maybe ComDayCqDamCommonsHandlerStandardImageHandlerProperties
    
instance Arbitrary ComDayCqDamCommonsHandlerStandardImageHandlerProperties where
  arbitrary =
    ComDayCqDamCommonsHandlerStandardImageHandlerProperties
      <$> arbitrary -- comDayCqDamCommonsHandlerStandardImageHandlerPropertiesLargeFileThreshold :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comDayCqDamCommonsHandlerStandardImageHandlerPropertiesLargeCommentThreshold :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comDayCqDamCommonsHandlerStandardImageHandlerPropertiesCqDamEnableExtMetaExtraction :: Maybe ConfigNodePropertyBoolean
    
instance Arbitrary ComDayCqDamCommonsMetadataXmpFilterBlackWhiteInfo where
  arbitrary =
    ComDayCqDamCommonsMetadataXmpFilterBlackWhiteInfo
      <$> arbitrary -- comDayCqDamCommonsMetadataXmpFilterBlackWhiteInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqDamCommonsMetadataXmpFilterBlackWhiteInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqDamCommonsMetadataXmpFilterBlackWhiteInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqDamCommonsMetadataXmpFilterBlackWhiteInfoProperties :: Maybe ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties
    
instance Arbitrary ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties where
  arbitrary =
    ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties
      <$> arbitrary -- comDayCqDamCommonsMetadataXmpFilterBlackWhitePropertiesXmpFilterApplyWhitelist :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- comDayCqDamCommonsMetadataXmpFilterBlackWhitePropertiesXmpFilterWhitelist :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comDayCqDamCommonsMetadataXmpFilterBlackWhitePropertiesXmpFilterApplyBlacklist :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- comDayCqDamCommonsMetadataXmpFilterBlackWhitePropertiesXmpFilterBlacklist :: Maybe ConfigNodePropertyArray
    
instance Arbitrary ComDayCqDamCommonsUtilImplAssetCacheImplInfo where
  arbitrary =
    ComDayCqDamCommonsUtilImplAssetCacheImplInfo
      <$> arbitrary -- comDayCqDamCommonsUtilImplAssetCacheImplInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqDamCommonsUtilImplAssetCacheImplInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqDamCommonsUtilImplAssetCacheImplInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqDamCommonsUtilImplAssetCacheImplInfoProperties :: Maybe ComDayCqDamCommonsUtilImplAssetCacheImplProperties
    
instance Arbitrary ComDayCqDamCommonsUtilImplAssetCacheImplProperties where
  arbitrary =
    ComDayCqDamCommonsUtilImplAssetCacheImplProperties
      <$> arbitrary -- comDayCqDamCommonsUtilImplAssetCacheImplPropertiesLargeFileMin :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comDayCqDamCommonsUtilImplAssetCacheImplPropertiesCacheApply :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- comDayCqDamCommonsUtilImplAssetCacheImplPropertiesMimeTypes :: Maybe ConfigNodePropertyArray
    
instance Arbitrary ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigInfo where
  arbitrary =
    ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigInfo
      <$> arbitrary -- comDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigInfoProperties :: Maybe ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties
    
instance Arbitrary ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties where
  arbitrary =
    ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties
      <$> arbitrary -- comDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigPropertiesCqDamConfigAnnotationPdfDocumentWidth :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigPropertiesCqDamConfigAnnotationPdfDocumentHeight :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigPropertiesCqDamConfigAnnotationPdfDocumentPaddingHorizontal :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigPropertiesCqDamConfigAnnotationPdfDocumentPaddingVertical :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigPropertiesCqDamConfigAnnotationPdfFontSize :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigPropertiesCqDamConfigAnnotationPdfFontColor :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigPropertiesCqDamConfigAnnotationPdfFontFamily :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigPropertiesCqDamConfigAnnotationPdfFontLight :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigPropertiesCqDamConfigAnnotationPdfMarginTextImage :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigPropertiesCqDamConfigAnnotationPdfMinImageHeight :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigPropertiesCqDamConfigAnnotationPdfReviewStatusWidth :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigPropertiesCqDamConfigAnnotationPdfReviewStatusColorApproved :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigPropertiesCqDamConfigAnnotationPdfReviewStatusColorRejected :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigPropertiesCqDamConfigAnnotationPdfReviewStatusColorChangesRequested :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigPropertiesCqDamConfigAnnotationPdfAnnotationMarkerWidth :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigPropertiesCqDamConfigAnnotationPdfAssetMinheight :: Maybe ConfigNodePropertyInteger
    
instance Arbitrary ComDayCqDamCoreImplAssetMoveListenerInfo where
  arbitrary =
    ComDayCqDamCoreImplAssetMoveListenerInfo
      <$> arbitrary -- comDayCqDamCoreImplAssetMoveListenerInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqDamCoreImplAssetMoveListenerInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqDamCoreImplAssetMoveListenerInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqDamCoreImplAssetMoveListenerInfoProperties :: Maybe ComDayCqDamCoreImplAssetMoveListenerProperties
    
instance Arbitrary ComDayCqDamCoreImplAssetMoveListenerProperties where
  arbitrary =
    ComDayCqDamCoreImplAssetMoveListenerProperties
      <$> arbitrary -- comDayCqDamCoreImplAssetMoveListenerPropertiesEnabled :: Maybe ConfigNodePropertyBoolean
    
instance Arbitrary ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationInfo where
  arbitrary =
    ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationInfo
      <$> arbitrary -- comDayCqDamCoreImplAssethomeAssetHomePageConfigurationInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqDamCoreImplAssethomeAssetHomePageConfigurationInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqDamCoreImplAssethomeAssetHomePageConfigurationInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqDamCoreImplAssethomeAssetHomePageConfigurationInfoProperties :: Maybe ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties
    
instance Arbitrary ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties where
  arbitrary =
    ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties
      <$> arbitrary -- comDayCqDamCoreImplAssethomeAssetHomePageConfigurationPropertiesIsEnabled :: Maybe ConfigNodePropertyBoolean
    
instance Arbitrary ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletInfo where
  arbitrary =
    ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletInfo
      <$> arbitrary -- comDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletInfoProperties :: Maybe ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties
    
instance Arbitrary ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties where
  arbitrary =
    ComDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletProperties
      <$> arbitrary -- comDayCqDamCoreImplAssetlinkshareAdhocAssetShareProxyServletPropertiesCqDamAdhocAssetSharePrezipMaxcontentsize :: Maybe ConfigNodePropertyInteger
    
instance Arbitrary ComDayCqDamCoreImplCacheCQBufferedImageCacheInfo where
  arbitrary =
    ComDayCqDamCoreImplCacheCQBufferedImageCacheInfo
      <$> arbitrary -- comDayCqDamCoreImplCacheCQBufferedImageCacheInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqDamCoreImplCacheCQBufferedImageCacheInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqDamCoreImplCacheCQBufferedImageCacheInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqDamCoreImplCacheCQBufferedImageCacheInfoProperties :: Maybe ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties
    
instance Arbitrary ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties where
  arbitrary =
    ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties
      <$> arbitrary -- comDayCqDamCoreImplCacheCQBufferedImageCachePropertiesCqDamImageCacheMaxMemory :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comDayCqDamCoreImplCacheCQBufferedImageCachePropertiesCqDamImageCacheMaxAge :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comDayCqDamCoreImplCacheCQBufferedImageCachePropertiesCqDamImageCacheMaxDimension :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComDayCqDamCoreImplDamChangeEventListenerInfo where
  arbitrary =
    ComDayCqDamCoreImplDamChangeEventListenerInfo
      <$> arbitrary -- comDayCqDamCoreImplDamChangeEventListenerInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqDamCoreImplDamChangeEventListenerInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqDamCoreImplDamChangeEventListenerInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqDamCoreImplDamChangeEventListenerInfoProperties :: Maybe ComDayCqDamCoreImplDamChangeEventListenerProperties
    
instance Arbitrary ComDayCqDamCoreImplDamChangeEventListenerProperties where
  arbitrary =
    ComDayCqDamCoreImplDamChangeEventListenerProperties
      <$> arbitrary -- comDayCqDamCoreImplDamChangeEventListenerPropertiesChangeeventlistenerObservedPaths :: Maybe ConfigNodePropertyArray
    
instance Arbitrary ComDayCqDamCoreImplDamEventPurgeServiceInfo where
  arbitrary =
    ComDayCqDamCoreImplDamEventPurgeServiceInfo
      <$> arbitrary -- comDayCqDamCoreImplDamEventPurgeServiceInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqDamCoreImplDamEventPurgeServiceInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqDamCoreImplDamEventPurgeServiceInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqDamCoreImplDamEventPurgeServiceInfoProperties :: Maybe ComDayCqDamCoreImplDamEventPurgeServiceProperties
    
instance Arbitrary ComDayCqDamCoreImplDamEventPurgeServiceProperties where
  arbitrary =
    ComDayCqDamCoreImplDamEventPurgeServiceProperties
      <$> arbitrary -- comDayCqDamCoreImplDamEventPurgeServicePropertiesSchedulerExpression :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comDayCqDamCoreImplDamEventPurgeServicePropertiesMaxSavedActivities :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comDayCqDamCoreImplDamEventPurgeServicePropertiesSaveInterval :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comDayCqDamCoreImplDamEventPurgeServicePropertiesEnableActivityPurge :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- comDayCqDamCoreImplDamEventPurgeServicePropertiesEventTypes :: Maybe ConfigNodePropertyDropDown
    
instance Arbitrary ComDayCqDamCoreImplDamEventRecorderImplInfo where
  arbitrary =
    ComDayCqDamCoreImplDamEventRecorderImplInfo
      <$> arbitrary -- comDayCqDamCoreImplDamEventRecorderImplInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqDamCoreImplDamEventRecorderImplInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqDamCoreImplDamEventRecorderImplInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqDamCoreImplDamEventRecorderImplInfoProperties :: Maybe ComDayCqDamCoreImplDamEventRecorderImplProperties
    
instance Arbitrary ComDayCqDamCoreImplDamEventRecorderImplProperties where
  arbitrary =
    ComDayCqDamCoreImplDamEventRecorderImplProperties
      <$> arbitrary -- comDayCqDamCoreImplDamEventRecorderImplPropertiesEventFilter :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comDayCqDamCoreImplDamEventRecorderImplPropertiesEventQueueLength :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comDayCqDamCoreImplDamEventRecorderImplPropertiesEventrecorderEnabled :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- comDayCqDamCoreImplDamEventRecorderImplPropertiesEventrecorderBlacklist :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comDayCqDamCoreImplDamEventRecorderImplPropertiesEventrecorderEventtypes :: Maybe ConfigNodePropertyDropDown
    
instance Arbitrary ComDayCqDamCoreImplEventDamEventAuditListenerInfo where
  arbitrary =
    ComDayCqDamCoreImplEventDamEventAuditListenerInfo
      <$> arbitrary -- comDayCqDamCoreImplEventDamEventAuditListenerInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqDamCoreImplEventDamEventAuditListenerInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqDamCoreImplEventDamEventAuditListenerInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqDamCoreImplEventDamEventAuditListenerInfoProperties :: Maybe ComDayCqDamCoreImplEventDamEventAuditListenerProperties
    
instance Arbitrary ComDayCqDamCoreImplEventDamEventAuditListenerProperties where
  arbitrary =
    ComDayCqDamCoreImplEventDamEventAuditListenerProperties
      <$> arbitrary -- comDayCqDamCoreImplEventDamEventAuditListenerPropertiesEventFilter :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comDayCqDamCoreImplEventDamEventAuditListenerPropertiesEnabled :: Maybe ConfigNodePropertyBoolean
    
instance Arbitrary ComDayCqDamCoreImplExpiryNotificationJobImplInfo where
  arbitrary =
    ComDayCqDamCoreImplExpiryNotificationJobImplInfo
      <$> arbitrary -- comDayCqDamCoreImplExpiryNotificationJobImplInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqDamCoreImplExpiryNotificationJobImplInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqDamCoreImplExpiryNotificationJobImplInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqDamCoreImplExpiryNotificationJobImplInfoProperties :: Maybe ComDayCqDamCoreImplExpiryNotificationJobImplProperties
    
instance Arbitrary ComDayCqDamCoreImplExpiryNotificationJobImplProperties where
  arbitrary =
    ComDayCqDamCoreImplExpiryNotificationJobImplProperties
      <$> arbitrary -- comDayCqDamCoreImplExpiryNotificationJobImplPropertiesCqDamExpiryNotificationSchedulerIstimebased :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- comDayCqDamCoreImplExpiryNotificationJobImplPropertiesCqDamExpiryNotificationSchedulerTimebasedRule :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comDayCqDamCoreImplExpiryNotificationJobImplPropertiesCqDamExpiryNotificationSchedulerPeriodRule :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comDayCqDamCoreImplExpiryNotificationJobImplPropertiesSendEmail :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- comDayCqDamCoreImplExpiryNotificationJobImplPropertiesAssetExpiredLimit :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comDayCqDamCoreImplExpiryNotificationJobImplPropertiesPriorNotificationSeconds :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comDayCqDamCoreImplExpiryNotificationJobImplPropertiesCqDamExpiryNotificationUrlProtocol :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatInfo where
  arbitrary =
    ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatInfo
      <$> arbitrary -- comDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatInfoProperties :: Maybe ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties
    
instance Arbitrary ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties where
  arbitrary =
    ComDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties
      <$> arbitrary -- comDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatPropertiesIsEnabled :: Maybe ConfigNodePropertyBoolean
    
instance Arbitrary ComDayCqDamCoreImplGfxCommonsGfxRendererInfo where
  arbitrary =
    ComDayCqDamCoreImplGfxCommonsGfxRendererInfo
      <$> arbitrary -- comDayCqDamCoreImplGfxCommonsGfxRendererInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqDamCoreImplGfxCommonsGfxRendererInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqDamCoreImplGfxCommonsGfxRendererInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqDamCoreImplGfxCommonsGfxRendererInfoProperties :: Maybe ComDayCqDamCoreImplGfxCommonsGfxRendererProperties
    
instance Arbitrary ComDayCqDamCoreImplGfxCommonsGfxRendererProperties where
  arbitrary =
    ComDayCqDamCoreImplGfxCommonsGfxRendererProperties
      <$> arbitrary -- comDayCqDamCoreImplGfxCommonsGfxRendererPropertiesSkipBufferedcache :: Maybe ConfigNodePropertyBoolean
    
instance Arbitrary ComDayCqDamCoreImplHandlerEPSFormatHandlerInfo where
  arbitrary =
    ComDayCqDamCoreImplHandlerEPSFormatHandlerInfo
      <$> arbitrary -- comDayCqDamCoreImplHandlerEPSFormatHandlerInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqDamCoreImplHandlerEPSFormatHandlerInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqDamCoreImplHandlerEPSFormatHandlerInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqDamCoreImplHandlerEPSFormatHandlerInfoProperties :: Maybe ComDayCqDamCoreImplHandlerEPSFormatHandlerProperties
    
instance Arbitrary ComDayCqDamCoreImplHandlerEPSFormatHandlerProperties where
  arbitrary =
    ComDayCqDamCoreImplHandlerEPSFormatHandlerProperties
      <$> arbitrary -- comDayCqDamCoreImplHandlerEPSFormatHandlerPropertiesMimetype :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComDayCqDamCoreImplHandlerIndesignFormatHandlerInfo where
  arbitrary =
    ComDayCqDamCoreImplHandlerIndesignFormatHandlerInfo
      <$> arbitrary -- comDayCqDamCoreImplHandlerIndesignFormatHandlerInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqDamCoreImplHandlerIndesignFormatHandlerInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqDamCoreImplHandlerIndesignFormatHandlerInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqDamCoreImplHandlerIndesignFormatHandlerInfoProperties :: Maybe ComDayCqDamCoreImplHandlerIndesignFormatHandlerProperties
    
instance Arbitrary ComDayCqDamCoreImplHandlerIndesignFormatHandlerProperties where
  arbitrary =
    ComDayCqDamCoreImplHandlerIndesignFormatHandlerProperties
      <$> arbitrary -- comDayCqDamCoreImplHandlerIndesignFormatHandlerPropertiesMimetype :: Maybe ConfigNodePropertyArray
    
instance Arbitrary ComDayCqDamCoreImplHandlerJpegHandlerInfo where
  arbitrary =
    ComDayCqDamCoreImplHandlerJpegHandlerInfo
      <$> arbitrary -- comDayCqDamCoreImplHandlerJpegHandlerInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqDamCoreImplHandlerJpegHandlerInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqDamCoreImplHandlerJpegHandlerInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqDamCoreImplHandlerJpegHandlerInfoProperties :: Maybe ComDayCqDamCoreImplHandlerJpegHandlerProperties
    
instance Arbitrary ComDayCqDamCoreImplHandlerJpegHandlerProperties where
  arbitrary =
    ComDayCqDamCoreImplHandlerJpegHandlerProperties
      <$> arbitrary -- comDayCqDamCoreImplHandlerJpegHandlerPropertiesCqDamEnableExtMetaExtraction :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- comDayCqDamCoreImplHandlerJpegHandlerPropertiesLargeFileThreshold :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comDayCqDamCoreImplHandlerJpegHandlerPropertiesLargeCommentThreshold :: Maybe ConfigNodePropertyInteger
    
instance Arbitrary ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerInfo where
  arbitrary =
    ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerInfo
      <$> arbitrary -- comDayCqDamCoreImplHandlerXmpNCommXMPHandlerInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqDamCoreImplHandlerXmpNCommXMPHandlerInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqDamCoreImplHandlerXmpNCommXMPHandlerInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqDamCoreImplHandlerXmpNCommXMPHandlerInfoProperties :: Maybe ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties
    
instance Arbitrary ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties where
  arbitrary =
    ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties
      <$> arbitrary -- comDayCqDamCoreImplHandlerXmpNCommXMPHandlerPropertiesXmphandlerCqFormats :: Maybe ConfigNodePropertyArray
    
instance Arbitrary ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorInfo where
  arbitrary =
    ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorInfo
      <$> arbitrary -- comDayCqDamCoreImplJmxAssetIndexUpdateMonitorInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqDamCoreImplJmxAssetIndexUpdateMonitorInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqDamCoreImplJmxAssetIndexUpdateMonitorInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqDamCoreImplJmxAssetIndexUpdateMonitorInfoProperties :: Maybe ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties
    
instance Arbitrary ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties where
  arbitrary =
    ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties
      <$> arbitrary -- comDayCqDamCoreImplJmxAssetIndexUpdateMonitorPropertiesJmxObjectname :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comDayCqDamCoreImplJmxAssetIndexUpdateMonitorPropertiesPropertyMeasureEnabled :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- comDayCqDamCoreImplJmxAssetIndexUpdateMonitorPropertiesPropertyName :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comDayCqDamCoreImplJmxAssetIndexUpdateMonitorPropertiesPropertyMaxWaitMs :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comDayCqDamCoreImplJmxAssetIndexUpdateMonitorPropertiesPropertyMaxRate :: Maybe ConfigNodePropertyFloat
      <*> arbitrary -- comDayCqDamCoreImplJmxAssetIndexUpdateMonitorPropertiesFulltextMeasureEnabled :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- comDayCqDamCoreImplJmxAssetIndexUpdateMonitorPropertiesFulltextName :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comDayCqDamCoreImplJmxAssetIndexUpdateMonitorPropertiesFulltextMaxWaitMs :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comDayCqDamCoreImplJmxAssetIndexUpdateMonitorPropertiesFulltextMaxRate :: Maybe ConfigNodePropertyFloat
    
instance Arbitrary ComDayCqDamCoreImplJmxAssetMigrationMBeanImplInfo where
  arbitrary =
    ComDayCqDamCoreImplJmxAssetMigrationMBeanImplInfo
      <$> arbitrary -- comDayCqDamCoreImplJmxAssetMigrationMBeanImplInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqDamCoreImplJmxAssetMigrationMBeanImplInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqDamCoreImplJmxAssetMigrationMBeanImplInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqDamCoreImplJmxAssetMigrationMBeanImplInfoProperties :: Maybe ComDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties
      <*> arbitrary -- comDayCqDamCoreImplJmxAssetMigrationMBeanImplInfoBundleLocation :: Maybe Text
      <*> arbitrary -- comDayCqDamCoreImplJmxAssetMigrationMBeanImplInfoServiceLocation :: Maybe Text
    
instance Arbitrary ComDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties where
  arbitrary =
    ComDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties
      <$> arbitrary -- comDayCqDamCoreImplJmxAssetMigrationMBeanImplPropertiesJmxObjectname :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComDayCqDamCoreImplJmxAssetUpdateMonitorImplInfo where
  arbitrary =
    ComDayCqDamCoreImplJmxAssetUpdateMonitorImplInfo
      <$> arbitrary -- comDayCqDamCoreImplJmxAssetUpdateMonitorImplInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqDamCoreImplJmxAssetUpdateMonitorImplInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqDamCoreImplJmxAssetUpdateMonitorImplInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqDamCoreImplJmxAssetUpdateMonitorImplInfoProperties :: Maybe ComDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties
    
instance Arbitrary ComDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties where
  arbitrary =
    ComDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties
      <$> arbitrary -- comDayCqDamCoreImplJmxAssetUpdateMonitorImplPropertiesJmxObjectname :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comDayCqDamCoreImplJmxAssetUpdateMonitorImplPropertiesActive :: Maybe ConfigNodePropertyBoolean
    
instance Arbitrary ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigInfo where
  arbitrary =
    ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigInfo
      <$> arbitrary -- comDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigInfoProperties :: Maybe ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties
    
instance Arbitrary ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties where
  arbitrary =
    ComDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigProperties
      <$> arbitrary -- comDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigPropertiesOperation :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comDayCqDamCoreImplJobsMetadataexportAsyncMetadataExportConfigPropertiesEmailEnabled :: Maybe ConfigNodePropertyBoolean
    
instance Arbitrary ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigInfo where
  arbitrary =
    ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigInfo
      <$> arbitrary -- comDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigInfoProperties :: Maybe ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties
    
instance Arbitrary ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties where
  arbitrary =
    ComDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigProperties
      <$> arbitrary -- comDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigPropertiesOperation :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigPropertiesOperationIcon :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigPropertiesTopicName :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comDayCqDamCoreImplJobsMetadataimportAsyncMetadataImportConfigPropertiesEmailEnabled :: Maybe ConfigNodePropertyBoolean
    
instance Arbitrary ComDayCqDamCoreImplLightboxLightboxServletInfo where
  arbitrary =
    ComDayCqDamCoreImplLightboxLightboxServletInfo
      <$> arbitrary -- comDayCqDamCoreImplLightboxLightboxServletInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqDamCoreImplLightboxLightboxServletInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqDamCoreImplLightboxLightboxServletInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqDamCoreImplLightboxLightboxServletInfoProperties :: Maybe ComDayCqDamCoreImplLightboxLightboxServletProperties
    
instance Arbitrary ComDayCqDamCoreImplLightboxLightboxServletProperties where
  arbitrary =
    ComDayCqDamCoreImplLightboxLightboxServletProperties
      <$> arbitrary -- comDayCqDamCoreImplLightboxLightboxServletPropertiesSlingServletPaths :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comDayCqDamCoreImplLightboxLightboxServletPropertiesSlingServletMethods :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comDayCqDamCoreImplLightboxLightboxServletPropertiesCqDamEnableAnonymous :: Maybe ConfigNodePropertyBoolean
    
instance Arbitrary ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerInfo where
  arbitrary =
    ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerInfo
      <$> arbitrary -- comDayCqDamCoreImplMetadataEditorSelectComponentHandlerInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqDamCoreImplMetadataEditorSelectComponentHandlerInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqDamCoreImplMetadataEditorSelectComponentHandlerInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqDamCoreImplMetadataEditorSelectComponentHandlerInfoProperties :: Maybe ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties
    
instance Arbitrary ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties where
  arbitrary =
    ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties
      <$> arbitrary -- comDayCqDamCoreImplMetadataEditorSelectComponentHandlerPropertiesGranitedata :: Maybe ConfigNodePropertyArray
    
instance Arbitrary ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperInfo where
  arbitrary =
    ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperInfo
      <$> arbitrary -- comDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperInfoProperties :: Maybe ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties
    
instance Arbitrary ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties where
  arbitrary =
    ComDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties
      <$> arbitrary -- comDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperPropertiesCqDamAllowAllMime :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- comDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperPropertiesCqDamAllowedAssetMimes :: Maybe ConfigNodePropertyArray
    
instance Arbitrary ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplInfo where
  arbitrary =
    ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplInfo
      <$> arbitrary -- comDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplInfoProperties :: Maybe ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties
    
instance Arbitrary ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties where
  arbitrary =
    ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties
      <$> arbitrary -- comDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplPropertiesCqDamDetectAssetMimeFromContent :: Maybe ConfigNodePropertyBoolean
    
instance Arbitrary ComDayCqDamCoreImplMissingMetadataNotificationJobInfo where
  arbitrary =
    ComDayCqDamCoreImplMissingMetadataNotificationJobInfo
      <$> arbitrary -- comDayCqDamCoreImplMissingMetadataNotificationJobInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqDamCoreImplMissingMetadataNotificationJobInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqDamCoreImplMissingMetadataNotificationJobInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqDamCoreImplMissingMetadataNotificationJobInfoProperties :: Maybe ComDayCqDamCoreImplMissingMetadataNotificationJobProperties
    
instance Arbitrary ComDayCqDamCoreImplMissingMetadataNotificationJobProperties where
  arbitrary =
    ComDayCqDamCoreImplMissingMetadataNotificationJobProperties
      <$> arbitrary -- comDayCqDamCoreImplMissingMetadataNotificationJobPropertiesCqDamMissingmetadataNotificationSchedulerIstimebased :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- comDayCqDamCoreImplMissingMetadataNotificationJobPropertiesCqDamMissingmetadataNotificationSchedulerTimebasedRule :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comDayCqDamCoreImplMissingMetadataNotificationJobPropertiesCqDamMissingmetadataNotificationSchedulerPeriodRule :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comDayCqDamCoreImplMissingMetadataNotificationJobPropertiesCqDamMissingmetadataNotificationRecipient :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrInfo where
  arbitrary =
    ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrInfo
      <$> arbitrary -- comDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrInfoProperties :: Maybe ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties
    
instance Arbitrary ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties where
  arbitrary =
    ComDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrProperties
      <$> arbitrary -- comDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrPropertiesProcessLabel :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comDayCqDamCoreImplProcessSendTransientWorkflowCompletedEmailPrPropertiesNotifyOnComplete :: Maybe ConfigNodePropertyBoolean
    
instance Arbitrary ComDayCqDamCoreImplProcessTextExtractionProcessInfo where
  arbitrary =
    ComDayCqDamCoreImplProcessTextExtractionProcessInfo
      <$> arbitrary -- comDayCqDamCoreImplProcessTextExtractionProcessInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqDamCoreImplProcessTextExtractionProcessInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqDamCoreImplProcessTextExtractionProcessInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqDamCoreImplProcessTextExtractionProcessInfoProperties :: Maybe ComDayCqDamCoreImplProcessTextExtractionProcessProperties
    
instance Arbitrary ComDayCqDamCoreImplProcessTextExtractionProcessProperties where
  arbitrary =
    ComDayCqDamCoreImplProcessTextExtractionProcessProperties
      <$> arbitrary -- comDayCqDamCoreImplProcessTextExtractionProcessPropertiesMimeTypes :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comDayCqDamCoreImplProcessTextExtractionProcessPropertiesMaxExtract :: Maybe ConfigNodePropertyInteger
    
instance Arbitrary ComDayCqDamCoreImplRenditionMakerImplInfo where
  arbitrary =
    ComDayCqDamCoreImplRenditionMakerImplInfo
      <$> arbitrary -- comDayCqDamCoreImplRenditionMakerImplInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqDamCoreImplRenditionMakerImplInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqDamCoreImplRenditionMakerImplInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqDamCoreImplRenditionMakerImplInfoProperties :: Maybe ComDayCqDamCoreImplRenditionMakerImplProperties
    
instance Arbitrary ComDayCqDamCoreImplRenditionMakerImplProperties where
  arbitrary =
    ComDayCqDamCoreImplRenditionMakerImplProperties
      <$> arbitrary -- comDayCqDamCoreImplRenditionMakerImplPropertiesXmpPropagate :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- comDayCqDamCoreImplRenditionMakerImplPropertiesXmpExcludes :: Maybe ConfigNodePropertyArray
    
instance Arbitrary ComDayCqDamCoreImplReportsReportExportServiceInfo where
  arbitrary =
    ComDayCqDamCoreImplReportsReportExportServiceInfo
      <$> arbitrary -- comDayCqDamCoreImplReportsReportExportServiceInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqDamCoreImplReportsReportExportServiceInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqDamCoreImplReportsReportExportServiceInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqDamCoreImplReportsReportExportServiceInfoProperties :: Maybe ComDayCqDamCoreImplReportsReportExportServiceProperties
    
instance Arbitrary ComDayCqDamCoreImplReportsReportExportServiceProperties where
  arbitrary =
    ComDayCqDamCoreImplReportsReportExportServiceProperties
      <$> arbitrary -- comDayCqDamCoreImplReportsReportExportServicePropertiesQueryBatchSize :: Maybe ConfigNodePropertyInteger
    
instance Arbitrary ComDayCqDamCoreImplReportsReportPurgeServiceInfo where
  arbitrary =
    ComDayCqDamCoreImplReportsReportPurgeServiceInfo
      <$> arbitrary -- comDayCqDamCoreImplReportsReportPurgeServiceInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqDamCoreImplReportsReportPurgeServiceInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqDamCoreImplReportsReportPurgeServiceInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqDamCoreImplReportsReportPurgeServiceInfoProperties :: Maybe ComDayCqDamCoreImplReportsReportPurgeServiceProperties
    
instance Arbitrary ComDayCqDamCoreImplReportsReportPurgeServiceProperties where
  arbitrary =
    ComDayCqDamCoreImplReportsReportPurgeServiceProperties
      <$> arbitrary -- comDayCqDamCoreImplReportsReportPurgeServicePropertiesSchedulerExpression :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comDayCqDamCoreImplReportsReportPurgeServicePropertiesMaxSavedReports :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comDayCqDamCoreImplReportsReportPurgeServicePropertiesTimeDuration :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comDayCqDamCoreImplReportsReportPurgeServicePropertiesEnableReportPurge :: Maybe ConfigNodePropertyBoolean
    
instance Arbitrary ComDayCqDamCoreImplServletAssetDownloadServletInfo where
  arbitrary =
    ComDayCqDamCoreImplServletAssetDownloadServletInfo
      <$> arbitrary -- comDayCqDamCoreImplServletAssetDownloadServletInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqDamCoreImplServletAssetDownloadServletInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqDamCoreImplServletAssetDownloadServletInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqDamCoreImplServletAssetDownloadServletInfoProperties :: Maybe ComDayCqDamCoreImplServletAssetDownloadServletProperties
      <*> arbitrary -- comDayCqDamCoreImplServletAssetDownloadServletInfoBundleLocation :: Maybe Text
      <*> arbitrary -- comDayCqDamCoreImplServletAssetDownloadServletInfoServiceLocation :: Maybe Text
    
instance Arbitrary ComDayCqDamCoreImplServletAssetDownloadServletProperties where
  arbitrary =
    ComDayCqDamCoreImplServletAssetDownloadServletProperties
      <$> arbitrary -- comDayCqDamCoreImplServletAssetDownloadServletPropertiesEnabled :: Maybe ConfigNodePropertyBoolean
    
instance Arbitrary ComDayCqDamCoreImplServletAssetStatusServletInfo where
  arbitrary =
    ComDayCqDamCoreImplServletAssetStatusServletInfo
      <$> arbitrary -- comDayCqDamCoreImplServletAssetStatusServletInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqDamCoreImplServletAssetStatusServletInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqDamCoreImplServletAssetStatusServletInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqDamCoreImplServletAssetStatusServletInfoProperties :: Maybe ComDayCqDamCoreImplServletAssetStatusServletProperties
    
instance Arbitrary ComDayCqDamCoreImplServletAssetStatusServletProperties where
  arbitrary =
    ComDayCqDamCoreImplServletAssetStatusServletProperties
      <$> arbitrary -- comDayCqDamCoreImplServletAssetStatusServletPropertiesCqDamBatchStatusMaxassets :: Maybe ConfigNodePropertyInteger
    
instance Arbitrary ComDayCqDamCoreImplServletAssetXMPSearchServletInfo where
  arbitrary =
    ComDayCqDamCoreImplServletAssetXMPSearchServletInfo
      <$> arbitrary -- comDayCqDamCoreImplServletAssetXMPSearchServletInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqDamCoreImplServletAssetXMPSearchServletInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqDamCoreImplServletAssetXMPSearchServletInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqDamCoreImplServletAssetXMPSearchServletInfoProperties :: Maybe ComDayCqDamCoreImplServletAssetXMPSearchServletProperties
    
instance Arbitrary ComDayCqDamCoreImplServletAssetXMPSearchServletProperties where
  arbitrary =
    ComDayCqDamCoreImplServletAssetXMPSearchServletProperties
      <$> arbitrary -- comDayCqDamCoreImplServletAssetXMPSearchServletPropertiesCqDamBatchIndesignMaxassets :: Maybe ConfigNodePropertyInteger
    
instance Arbitrary ComDayCqDamCoreImplServletBatchMetadataServletInfo where
  arbitrary =
    ComDayCqDamCoreImplServletBatchMetadataServletInfo
      <$> arbitrary -- comDayCqDamCoreImplServletBatchMetadataServletInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqDamCoreImplServletBatchMetadataServletInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqDamCoreImplServletBatchMetadataServletInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqDamCoreImplServletBatchMetadataServletInfoProperties :: Maybe ComDayCqDamCoreImplServletBatchMetadataServletProperties
    
instance Arbitrary ComDayCqDamCoreImplServletBatchMetadataServletProperties where
  arbitrary =
    ComDayCqDamCoreImplServletBatchMetadataServletProperties
      <$> arbitrary -- comDayCqDamCoreImplServletBatchMetadataServletPropertiesCqDamBatchMetadataAssetDefault :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comDayCqDamCoreImplServletBatchMetadataServletPropertiesCqDamBatchMetadataCollectionDefault :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comDayCqDamCoreImplServletBatchMetadataServletPropertiesCqDamBatchMetadataMaxresources :: Maybe ConfigNodePropertyInteger
    
instance Arbitrary ComDayCqDamCoreImplServletBinaryProviderServletInfo where
  arbitrary =
    ComDayCqDamCoreImplServletBinaryProviderServletInfo
      <$> arbitrary -- comDayCqDamCoreImplServletBinaryProviderServletInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqDamCoreImplServletBinaryProviderServletInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqDamCoreImplServletBinaryProviderServletInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqDamCoreImplServletBinaryProviderServletInfoProperties :: Maybe ComDayCqDamCoreImplServletBinaryProviderServletProperties
    
instance Arbitrary ComDayCqDamCoreImplServletBinaryProviderServletProperties where
  arbitrary =
    ComDayCqDamCoreImplServletBinaryProviderServletProperties
      <$> arbitrary -- comDayCqDamCoreImplServletBinaryProviderServletPropertiesSlingServletResourceTypes :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comDayCqDamCoreImplServletBinaryProviderServletPropertiesSlingServletMethods :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comDayCqDamCoreImplServletBinaryProviderServletPropertiesCqDamDrmEnable :: Maybe ConfigNodePropertyBoolean
    
instance Arbitrary ComDayCqDamCoreImplServletCollectionServletInfo where
  arbitrary =
    ComDayCqDamCoreImplServletCollectionServletInfo
      <$> arbitrary -- comDayCqDamCoreImplServletCollectionServletInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqDamCoreImplServletCollectionServletInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqDamCoreImplServletCollectionServletInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqDamCoreImplServletCollectionServletInfoProperties :: Maybe ComDayCqDamCoreImplServletCollectionServletProperties
    
instance Arbitrary ComDayCqDamCoreImplServletCollectionServletProperties where
  arbitrary =
    ComDayCqDamCoreImplServletCollectionServletProperties
      <$> arbitrary -- comDayCqDamCoreImplServletCollectionServletPropertiesCqDamBatchCollectionProperties :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comDayCqDamCoreImplServletCollectionServletPropertiesCqDamBatchCollectionMaxcollections :: Maybe ConfigNodePropertyInteger
    
instance Arbitrary ComDayCqDamCoreImplServletCollectionsServletInfo where
  arbitrary =
    ComDayCqDamCoreImplServletCollectionsServletInfo
      <$> arbitrary -- comDayCqDamCoreImplServletCollectionsServletInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqDamCoreImplServletCollectionsServletInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqDamCoreImplServletCollectionsServletInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqDamCoreImplServletCollectionsServletInfoProperties :: Maybe ComDayCqDamCoreImplServletCollectionsServletProperties
    
instance Arbitrary ComDayCqDamCoreImplServletCollectionsServletProperties where
  arbitrary =
    ComDayCqDamCoreImplServletCollectionsServletProperties
      <$> arbitrary -- comDayCqDamCoreImplServletCollectionsServletPropertiesCqDamBatchCollectionsProperties :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comDayCqDamCoreImplServletCollectionsServletPropertiesCqDamBatchCollectionsLimit :: Maybe ConfigNodePropertyInteger
    
instance Arbitrary ComDayCqDamCoreImplServletCompanionServletInfo where
  arbitrary =
    ComDayCqDamCoreImplServletCompanionServletInfo
      <$> arbitrary -- comDayCqDamCoreImplServletCompanionServletInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqDamCoreImplServletCompanionServletInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqDamCoreImplServletCompanionServletInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqDamCoreImplServletCompanionServletInfoProperties :: Maybe ComDayCqDamCoreImplServletCompanionServletProperties
    
instance Arbitrary ComDayCqDamCoreImplServletCompanionServletProperties where
  arbitrary =
    ComDayCqDamCoreImplServletCompanionServletProperties
      <$> arbitrary -- comDayCqDamCoreImplServletCompanionServletPropertiesMoreInfo :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comDayCqDamCoreImplServletCompanionServletPropertiesMntoverlaydamguicontentassetsmoreinfoHtmlpath :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComDayCqDamCoreImplServletCreateAssetServletInfo where
  arbitrary =
    ComDayCqDamCoreImplServletCreateAssetServletInfo
      <$> arbitrary -- comDayCqDamCoreImplServletCreateAssetServletInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqDamCoreImplServletCreateAssetServletInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqDamCoreImplServletCreateAssetServletInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqDamCoreImplServletCreateAssetServletInfoProperties :: Maybe ComDayCqDamCoreImplServletCreateAssetServletProperties
    
instance Arbitrary ComDayCqDamCoreImplServletCreateAssetServletProperties where
  arbitrary =
    ComDayCqDamCoreImplServletCreateAssetServletProperties
      <$> arbitrary -- comDayCqDamCoreImplServletCreateAssetServletPropertiesDetectDuplicate :: Maybe ConfigNodePropertyBoolean
    
instance Arbitrary ComDayCqDamCoreImplServletDamContentDispositionFilterInfo where
  arbitrary =
    ComDayCqDamCoreImplServletDamContentDispositionFilterInfo
      <$> arbitrary -- comDayCqDamCoreImplServletDamContentDispositionFilterInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqDamCoreImplServletDamContentDispositionFilterInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqDamCoreImplServletDamContentDispositionFilterInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqDamCoreImplServletDamContentDispositionFilterInfoProperties :: Maybe ComDayCqDamCoreImplServletDamContentDispositionFilterProperties
    
instance Arbitrary ComDayCqDamCoreImplServletDamContentDispositionFilterProperties where
  arbitrary =
    ComDayCqDamCoreImplServletDamContentDispositionFilterProperties
      <$> arbitrary -- comDayCqDamCoreImplServletDamContentDispositionFilterPropertiesCqMimeTypeBlacklist :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comDayCqDamCoreImplServletDamContentDispositionFilterPropertiesCqDamEmptyMime :: Maybe ConfigNodePropertyBoolean
    
instance Arbitrary ComDayCqDamCoreImplServletGuidLookupFilterInfo where
  arbitrary =
    ComDayCqDamCoreImplServletGuidLookupFilterInfo
      <$> arbitrary -- comDayCqDamCoreImplServletGuidLookupFilterInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqDamCoreImplServletGuidLookupFilterInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqDamCoreImplServletGuidLookupFilterInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqDamCoreImplServletGuidLookupFilterInfoProperties :: Maybe ComDayCqDamCoreImplServletGuidLookupFilterProperties
      <*> arbitrary -- comDayCqDamCoreImplServletGuidLookupFilterInfoBundleLocation :: Maybe Text
      <*> arbitrary -- comDayCqDamCoreImplServletGuidLookupFilterInfoServiceLocation :: Maybe Text
    
instance Arbitrary ComDayCqDamCoreImplServletGuidLookupFilterProperties where
  arbitrary =
    ComDayCqDamCoreImplServletGuidLookupFilterProperties
      <$> arbitrary -- comDayCqDamCoreImplServletGuidLookupFilterPropertiesCqDamCoreGuidlookupfilterEnabled :: Maybe ConfigNodePropertyBoolean
    
instance Arbitrary ComDayCqDamCoreImplServletHealthCheckServletInfo where
  arbitrary =
    ComDayCqDamCoreImplServletHealthCheckServletInfo
      <$> arbitrary -- comDayCqDamCoreImplServletHealthCheckServletInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqDamCoreImplServletHealthCheckServletInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqDamCoreImplServletHealthCheckServletInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqDamCoreImplServletHealthCheckServletInfoProperties :: Maybe ComDayCqDamCoreImplServletHealthCheckServletProperties
    
instance Arbitrary ComDayCqDamCoreImplServletHealthCheckServletProperties where
  arbitrary =
    ComDayCqDamCoreImplServletHealthCheckServletProperties
      <$> arbitrary -- comDayCqDamCoreImplServletHealthCheckServletPropertiesCqDamSyncWorkflowId :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comDayCqDamCoreImplServletHealthCheckServletPropertiesCqDamSyncFolderTypes :: Maybe ConfigNodePropertyArray
    
instance Arbitrary ComDayCqDamCoreImplServletMetadataGetServletInfo where
  arbitrary =
    ComDayCqDamCoreImplServletMetadataGetServletInfo
      <$> arbitrary -- comDayCqDamCoreImplServletMetadataGetServletInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqDamCoreImplServletMetadataGetServletInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqDamCoreImplServletMetadataGetServletInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqDamCoreImplServletMetadataGetServletInfoProperties :: Maybe ComDayCqDamCoreImplServletMetadataGetServletProperties
    
instance Arbitrary ComDayCqDamCoreImplServletMetadataGetServletProperties where
  arbitrary =
    ComDayCqDamCoreImplServletMetadataGetServletProperties
      <$> arbitrary -- comDayCqDamCoreImplServletMetadataGetServletPropertiesSlingServletResourceTypes :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comDayCqDamCoreImplServletMetadataGetServletPropertiesSlingServletMethods :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comDayCqDamCoreImplServletMetadataGetServletPropertiesSlingServletExtensions :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comDayCqDamCoreImplServletMetadataGetServletPropertiesSlingServletSelectors :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComDayCqDamCoreImplServletMultipleLicenseAcceptServletInfo where
  arbitrary =
    ComDayCqDamCoreImplServletMultipleLicenseAcceptServletInfo
      <$> arbitrary -- comDayCqDamCoreImplServletMultipleLicenseAcceptServletInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqDamCoreImplServletMultipleLicenseAcceptServletInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqDamCoreImplServletMultipleLicenseAcceptServletInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqDamCoreImplServletMultipleLicenseAcceptServletInfoProperties :: Maybe ComDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties
    
instance Arbitrary ComDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties where
  arbitrary =
    ComDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties
      <$> arbitrary -- comDayCqDamCoreImplServletMultipleLicenseAcceptServletPropertiesCqDamDrmEnable :: Maybe ConfigNodePropertyBoolean
    
instance Arbitrary ComDayCqDamCoreImplServletResourceCollectionServletInfo where
  arbitrary =
    ComDayCqDamCoreImplServletResourceCollectionServletInfo
      <$> arbitrary -- comDayCqDamCoreImplServletResourceCollectionServletInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqDamCoreImplServletResourceCollectionServletInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqDamCoreImplServletResourceCollectionServletInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqDamCoreImplServletResourceCollectionServletInfoProperties :: Maybe ComDayCqDamCoreImplServletResourceCollectionServletProperties
    
instance Arbitrary ComDayCqDamCoreImplServletResourceCollectionServletProperties where
  arbitrary =
    ComDayCqDamCoreImplServletResourceCollectionServletProperties
      <$> arbitrary -- comDayCqDamCoreImplServletResourceCollectionServletPropertiesSlingServletResourceTypes :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comDayCqDamCoreImplServletResourceCollectionServletPropertiesSlingServletMethods :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comDayCqDamCoreImplServletResourceCollectionServletPropertiesSlingServletSelectors :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comDayCqDamCoreImplServletResourceCollectionServletPropertiesDownloadConfig :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comDayCqDamCoreImplServletResourceCollectionServletPropertiesViewSelector :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comDayCqDamCoreImplServletResourceCollectionServletPropertiesSendEmail :: Maybe ConfigNodePropertyBoolean
    
instance Arbitrary ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplInfo where
  arbitrary =
    ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplInfo
      <$> arbitrary -- comDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplInfoProperties :: Maybe ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties
    
instance Arbitrary ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties where
  arbitrary =
    ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties
      <$> arbitrary -- comDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplPropertiesCreatePreviewEnabled :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- comDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplPropertiesUpdatePreviewEnabled :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- comDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplPropertiesQueueSize :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplPropertiesFolderPreviewRenditionRegex :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComDayCqDamCoreImplUnzipUnzipConfigInfo where
  arbitrary =
    ComDayCqDamCoreImplUnzipUnzipConfigInfo
      <$> arbitrary -- comDayCqDamCoreImplUnzipUnzipConfigInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqDamCoreImplUnzipUnzipConfigInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqDamCoreImplUnzipUnzipConfigInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqDamCoreImplUnzipUnzipConfigInfoProperties :: Maybe ComDayCqDamCoreImplUnzipUnzipConfigProperties
    
instance Arbitrary ComDayCqDamCoreImplUnzipUnzipConfigProperties where
  arbitrary =
    ComDayCqDamCoreImplUnzipUnzipConfigProperties
      <$> arbitrary -- comDayCqDamCoreImplUnzipUnzipConfigPropertiesCqDamConfigUnzipMaxuncompressedsize :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comDayCqDamCoreImplUnzipUnzipConfigPropertiesCqDamConfigUnzipEncoding :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComDayCqDamCoreProcessExifToolExtractMetadataProcessInfo where
  arbitrary =
    ComDayCqDamCoreProcessExifToolExtractMetadataProcessInfo
      <$> arbitrary -- comDayCqDamCoreProcessExifToolExtractMetadataProcessInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqDamCoreProcessExifToolExtractMetadataProcessInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqDamCoreProcessExifToolExtractMetadataProcessInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqDamCoreProcessExifToolExtractMetadataProcessInfoProperties :: Maybe ComDayCqDamCoreProcessExifToolExtractMetadataProcessProperties
    
instance Arbitrary ComDayCqDamCoreProcessExifToolExtractMetadataProcessProperties where
  arbitrary =
    ComDayCqDamCoreProcessExifToolExtractMetadataProcessProperties
      <$> arbitrary -- comDayCqDamCoreProcessExifToolExtractMetadataProcessPropertiesProcessLabel :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comDayCqDamCoreProcessExifToolExtractMetadataProcessPropertiesCqDamEnableSha1 :: Maybe ConfigNodePropertyBoolean
    
instance Arbitrary ComDayCqDamCoreProcessExtractMetadataProcessInfo where
  arbitrary =
    ComDayCqDamCoreProcessExtractMetadataProcessInfo
      <$> arbitrary -- comDayCqDamCoreProcessExtractMetadataProcessInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqDamCoreProcessExtractMetadataProcessInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqDamCoreProcessExtractMetadataProcessInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqDamCoreProcessExtractMetadataProcessInfoProperties :: Maybe ComDayCqDamCoreProcessExtractMetadataProcessProperties
    
instance Arbitrary ComDayCqDamCoreProcessExtractMetadataProcessProperties where
  arbitrary =
    ComDayCqDamCoreProcessExtractMetadataProcessProperties
      <$> arbitrary -- comDayCqDamCoreProcessExtractMetadataProcessPropertiesProcessLabel :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comDayCqDamCoreProcessExtractMetadataProcessPropertiesCqDamEnableSha1 :: Maybe ConfigNodePropertyBoolean
    
instance Arbitrary ComDayCqDamCoreProcessMetadataProcessorProcessInfo where
  arbitrary =
    ComDayCqDamCoreProcessMetadataProcessorProcessInfo
      <$> arbitrary -- comDayCqDamCoreProcessMetadataProcessorProcessInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqDamCoreProcessMetadataProcessorProcessInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqDamCoreProcessMetadataProcessorProcessInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqDamCoreProcessMetadataProcessorProcessInfoProperties :: Maybe ComDayCqDamCoreProcessMetadataProcessorProcessProperties
    
instance Arbitrary ComDayCqDamCoreProcessMetadataProcessorProcessProperties where
  arbitrary =
    ComDayCqDamCoreProcessMetadataProcessorProcessProperties
      <$> arbitrary -- comDayCqDamCoreProcessMetadataProcessorProcessPropertiesProcessLabel :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comDayCqDamCoreProcessMetadataProcessorProcessPropertiesCqDamEnableSha1 :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- comDayCqDamCoreProcessMetadataProcessorProcessPropertiesCqDamMetadataXssprotectedProperties :: Maybe ConfigNodePropertyArray
    
instance Arbitrary ComDayCqDamHandlerFfmpegLocatorImplInfo where
  arbitrary =
    ComDayCqDamHandlerFfmpegLocatorImplInfo
      <$> arbitrary -- comDayCqDamHandlerFfmpegLocatorImplInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqDamHandlerFfmpegLocatorImplInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqDamHandlerFfmpegLocatorImplInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqDamHandlerFfmpegLocatorImplInfoProperties :: Maybe ComDayCqDamHandlerFfmpegLocatorImplProperties
    
instance Arbitrary ComDayCqDamHandlerFfmpegLocatorImplProperties where
  arbitrary =
    ComDayCqDamHandlerFfmpegLocatorImplProperties
      <$> arbitrary -- comDayCqDamHandlerFfmpegLocatorImplPropertiesExecutableSearchpath :: Maybe ConfigNodePropertyArray
    
instance Arbitrary ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplInfo where
  arbitrary =
    ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplInfo
      <$> arbitrary -- comDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplInfoProperties :: Maybe ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties
    
instance Arbitrary ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties where
  arbitrary =
    ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties
      <$> arbitrary -- comDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplPropertiesEventFilter :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplPropertiesFontmgrSystemFontDir :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplPropertiesFontmgrAdobeFontDir :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplPropertiesFontmgrCustomerFontDir :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComDayCqDamHandlerStandardPdfPdfHandlerInfo where
  arbitrary =
    ComDayCqDamHandlerStandardPdfPdfHandlerInfo
      <$> arbitrary -- comDayCqDamHandlerStandardPdfPdfHandlerInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqDamHandlerStandardPdfPdfHandlerInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqDamHandlerStandardPdfPdfHandlerInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqDamHandlerStandardPdfPdfHandlerInfoProperties :: Maybe ComDayCqDamHandlerStandardPdfPdfHandlerProperties
    
instance Arbitrary ComDayCqDamHandlerStandardPdfPdfHandlerProperties where
  arbitrary =
    ComDayCqDamHandlerStandardPdfPdfHandlerProperties
      <$> arbitrary -- comDayCqDamHandlerStandardPdfPdfHandlerPropertiesRasterAnnotation :: Maybe ConfigNodePropertyBoolean
    
instance Arbitrary ComDayCqDamHandlerStandardPsPostScriptHandlerInfo where
  arbitrary =
    ComDayCqDamHandlerStandardPsPostScriptHandlerInfo
      <$> arbitrary -- comDayCqDamHandlerStandardPsPostScriptHandlerInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqDamHandlerStandardPsPostScriptHandlerInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqDamHandlerStandardPsPostScriptHandlerInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqDamHandlerStandardPsPostScriptHandlerInfoProperties :: Maybe ComDayCqDamHandlerStandardPsPostScriptHandlerProperties
    
instance Arbitrary ComDayCqDamHandlerStandardPsPostScriptHandlerProperties where
  arbitrary =
    ComDayCqDamHandlerStandardPsPostScriptHandlerProperties
      <$> arbitrary -- comDayCqDamHandlerStandardPsPostScriptHandlerPropertiesRasterAnnotation :: Maybe ConfigNodePropertyBoolean
    
instance Arbitrary ComDayCqDamHandlerStandardPsdPsdHandlerInfo where
  arbitrary =
    ComDayCqDamHandlerStandardPsdPsdHandlerInfo
      <$> arbitrary -- comDayCqDamHandlerStandardPsdPsdHandlerInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqDamHandlerStandardPsdPsdHandlerInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqDamHandlerStandardPsdPsdHandlerInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqDamHandlerStandardPsdPsdHandlerInfoProperties :: Maybe ComDayCqDamHandlerStandardPsdPsdHandlerProperties
    
instance Arbitrary ComDayCqDamHandlerStandardPsdPsdHandlerProperties where
  arbitrary =
    ComDayCqDamHandlerStandardPsdPsdHandlerProperties
      <$> arbitrary -- comDayCqDamHandlerStandardPsdPsdHandlerPropertiesLargeFileThreshold :: Maybe ConfigNodePropertyInteger
    
instance Arbitrary ComDayCqDamIdsImplIDSJobProcessorInfo where
  arbitrary =
    ComDayCqDamIdsImplIDSJobProcessorInfo
      <$> arbitrary -- comDayCqDamIdsImplIDSJobProcessorInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqDamIdsImplIDSJobProcessorInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqDamIdsImplIDSJobProcessorInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqDamIdsImplIDSJobProcessorInfoProperties :: Maybe ComDayCqDamIdsImplIDSJobProcessorProperties
    
instance Arbitrary ComDayCqDamIdsImplIDSJobProcessorProperties where
  arbitrary =
    ComDayCqDamIdsImplIDSJobProcessorProperties
      <$> arbitrary -- comDayCqDamIdsImplIDSJobProcessorPropertiesEnableMultisession :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- comDayCqDamIdsImplIDSJobProcessorPropertiesIdsCcEnable :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- comDayCqDamIdsImplIDSJobProcessorPropertiesEnableRetry :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- comDayCqDamIdsImplIDSJobProcessorPropertiesEnableRetryScripterror :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- comDayCqDamIdsImplIDSJobProcessorPropertiesExternalizerDomainCqhost :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comDayCqDamIdsImplIDSJobProcessorPropertiesExternalizerDomainHttp :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComDayCqDamIdsImplIDSPoolManagerImplInfo where
  arbitrary =
    ComDayCqDamIdsImplIDSPoolManagerImplInfo
      <$> arbitrary -- comDayCqDamIdsImplIDSPoolManagerImplInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqDamIdsImplIDSPoolManagerImplInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqDamIdsImplIDSPoolManagerImplInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqDamIdsImplIDSPoolManagerImplInfoProperties :: Maybe ComDayCqDamIdsImplIDSPoolManagerImplProperties
    
instance Arbitrary ComDayCqDamIdsImplIDSPoolManagerImplProperties where
  arbitrary =
    ComDayCqDamIdsImplIDSPoolManagerImplProperties
      <$> arbitrary -- comDayCqDamIdsImplIDSPoolManagerImplPropertiesMaxErrorsToBlacklist :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comDayCqDamIdsImplIDSPoolManagerImplPropertiesRetryIntervalToWhitelist :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comDayCqDamIdsImplIDSPoolManagerImplPropertiesConnectTimeout :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comDayCqDamIdsImplIDSPoolManagerImplPropertiesSocketTimeout :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comDayCqDamIdsImplIDSPoolManagerImplPropertiesProcessLabel :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comDayCqDamIdsImplIDSPoolManagerImplPropertiesConnectionUseMax :: Maybe ConfigNodePropertyInteger
    
instance Arbitrary ComDayCqDamInddImplHandlerIndesignXMPHandlerInfo where
  arbitrary =
    ComDayCqDamInddImplHandlerIndesignXMPHandlerInfo
      <$> arbitrary -- comDayCqDamInddImplHandlerIndesignXMPHandlerInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqDamInddImplHandlerIndesignXMPHandlerInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqDamInddImplHandlerIndesignXMPHandlerInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqDamInddImplHandlerIndesignXMPHandlerInfoProperties :: Maybe ComDayCqDamInddImplHandlerIndesignXMPHandlerProperties
    
instance Arbitrary ComDayCqDamInddImplHandlerIndesignXMPHandlerProperties where
  arbitrary =
    ComDayCqDamInddImplHandlerIndesignXMPHandlerProperties
      <$> arbitrary -- comDayCqDamInddImplHandlerIndesignXMPHandlerPropertiesProcessLabel :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comDayCqDamInddImplHandlerIndesignXMPHandlerPropertiesExtractPages :: Maybe ConfigNodePropertyBoolean
    
instance Arbitrary ComDayCqDamInddImplServletSnippetCreationServletInfo where
  arbitrary =
    ComDayCqDamInddImplServletSnippetCreationServletInfo
      <$> arbitrary -- comDayCqDamInddImplServletSnippetCreationServletInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqDamInddImplServletSnippetCreationServletInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqDamInddImplServletSnippetCreationServletInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqDamInddImplServletSnippetCreationServletInfoProperties :: Maybe ComDayCqDamInddImplServletSnippetCreationServletProperties
    
instance Arbitrary ComDayCqDamInddImplServletSnippetCreationServletProperties where
  arbitrary =
    ComDayCqDamInddImplServletSnippetCreationServletProperties
      <$> arbitrary -- comDayCqDamInddImplServletSnippetCreationServletPropertiesSnippetcreationMaxcollections :: Maybe ConfigNodePropertyInteger
    
instance Arbitrary ComDayCqDamInddProcessINDDMediaExtractProcessInfo where
  arbitrary =
    ComDayCqDamInddProcessINDDMediaExtractProcessInfo
      <$> arbitrary -- comDayCqDamInddProcessINDDMediaExtractProcessInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqDamInddProcessINDDMediaExtractProcessInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqDamInddProcessINDDMediaExtractProcessInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqDamInddProcessINDDMediaExtractProcessInfoProperties :: Maybe ComDayCqDamInddProcessINDDMediaExtractProcessProperties
    
instance Arbitrary ComDayCqDamInddProcessINDDMediaExtractProcessProperties where
  arbitrary =
    ComDayCqDamInddProcessINDDMediaExtractProcessProperties
      <$> arbitrary -- comDayCqDamInddProcessINDDMediaExtractProcessPropertiesProcessLabel :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comDayCqDamInddProcessINDDMediaExtractProcessPropertiesCqDamInddPagesRegex :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comDayCqDamInddProcessINDDMediaExtractProcessPropertiesIdsJobDecoupled :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- comDayCqDamInddProcessINDDMediaExtractProcessPropertiesIdsJobWorkflowModel :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplInfo where
  arbitrary =
    ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplInfo
      <$> arbitrary -- comDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplInfoProperties :: Maybe ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties
    
instance Arbitrary ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties where
  arbitrary =
    ComDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplProperties
      <$> arbitrary -- comDayCqDamPerformanceInternalAssetPerformanceDataHandlerImplPropertiesBatchCommitSize :: Maybe ConfigNodePropertyInteger
    
instance Arbitrary ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobInfo where
  arbitrary =
    ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobInfo
      <$> arbitrary -- comDayCqDamPerformanceInternalAssetPerformanceReportSyncJobInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqDamPerformanceInternalAssetPerformanceReportSyncJobInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqDamPerformanceInternalAssetPerformanceReportSyncJobInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqDamPerformanceInternalAssetPerformanceReportSyncJobInfoProperties :: Maybe ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobProperties
    
instance Arbitrary ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobProperties where
  arbitrary =
    ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobProperties
      <$> arbitrary -- comDayCqDamPerformanceInternalAssetPerformanceReportSyncJobPropertiesSchedulerExpression :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProInfo where
  arbitrary =
    ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProInfo
      <$> arbitrary -- comDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProInfoProperties :: Maybe ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties
    
instance Arbitrary ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties where
  arbitrary =
    ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties
      <$> arbitrary -- comDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProPropertiesDeleteZipFile :: Maybe ConfigNodePropertyBoolean
    
instance Arbitrary ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenInfo where
  arbitrary =
    ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenInfo
      <$> arbitrary -- comDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenInfoProperties :: Maybe ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties
    
instance Arbitrary ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties where
  arbitrary =
    ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties
      <$> arbitrary -- comDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenPropertiesCqDamS7damDynamicmediaconfigeventlistenerEnabled :: Maybe ConfigNodePropertyBoolean
    
instance Arbitrary ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerInfo where
  arbitrary =
    ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerInfo
      <$> arbitrary -- comDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerInfoProperties :: Maybe ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties
    
instance Arbitrary ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties where
  arbitrary =
    ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties
      <$> arbitrary -- comDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerPropertiesSchedulerExpression :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerPropertiesSchedulerConcurrent :: Maybe ConfigNodePropertyBoolean
    
instance Arbitrary ComDayCqDamS7damCommonPostServletsSetCreateHandlerInfo where
  arbitrary =
    ComDayCqDamS7damCommonPostServletsSetCreateHandlerInfo
      <$> arbitrary -- comDayCqDamS7damCommonPostServletsSetCreateHandlerInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqDamS7damCommonPostServletsSetCreateHandlerInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqDamS7damCommonPostServletsSetCreateHandlerInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqDamS7damCommonPostServletsSetCreateHandlerInfoProperties :: Maybe ComDayCqDamS7damCommonPostServletsSetCreateHandlerProperties
    
instance Arbitrary ComDayCqDamS7damCommonPostServletsSetCreateHandlerProperties where
  arbitrary =
    ComDayCqDamS7damCommonPostServletsSetCreateHandlerProperties
      <$> arbitrary -- comDayCqDamS7damCommonPostServletsSetCreateHandlerPropertiesSlingPostOperation :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comDayCqDamS7damCommonPostServletsSetCreateHandlerPropertiesSlingServletMethods :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComDayCqDamS7damCommonPostServletsSetModifyHandlerInfo where
  arbitrary =
    ComDayCqDamS7damCommonPostServletsSetModifyHandlerInfo
      <$> arbitrary -- comDayCqDamS7damCommonPostServletsSetModifyHandlerInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqDamS7damCommonPostServletsSetModifyHandlerInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqDamS7damCommonPostServletsSetModifyHandlerInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqDamS7damCommonPostServletsSetModifyHandlerInfoProperties :: Maybe ComDayCqDamS7damCommonPostServletsSetModifyHandlerProperties
    
instance Arbitrary ComDayCqDamS7damCommonPostServletsSetModifyHandlerProperties where
  arbitrary =
    ComDayCqDamS7damCommonPostServletsSetModifyHandlerProperties
      <$> arbitrary -- comDayCqDamS7damCommonPostServletsSetModifyHandlerPropertiesSlingPostOperation :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comDayCqDamS7damCommonPostServletsSetModifyHandlerPropertiesSlingServletMethods :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessInfo where
  arbitrary =
    ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessInfo
      <$> arbitrary -- comDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessInfoProperties :: Maybe ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties
    
instance Arbitrary ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties where
  arbitrary =
    ComDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessProperties
      <$> arbitrary -- comDayCqDamS7damCommonProcessVideoThumbnailDownloadProcessPropertiesProcessLabel :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComDayCqDamS7damCommonS7damDamChangeEventListenerInfo where
  arbitrary =
    ComDayCqDamS7damCommonS7damDamChangeEventListenerInfo
      <$> arbitrary -- comDayCqDamS7damCommonS7damDamChangeEventListenerInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqDamS7damCommonS7damDamChangeEventListenerInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqDamS7damCommonS7damDamChangeEventListenerInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqDamS7damCommonS7damDamChangeEventListenerInfoProperties :: Maybe ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties
    
instance Arbitrary ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties where
  arbitrary =
    ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties
      <$> arbitrary -- comDayCqDamS7damCommonS7damDamChangeEventListenerPropertiesCqDamS7damDamchangeeventlistenerEnabled :: Maybe ConfigNodePropertyBoolean
    
instance Arbitrary ComDayCqDamS7damCommonServletsS7damProductInfoServletInfo where
  arbitrary =
    ComDayCqDamS7damCommonServletsS7damProductInfoServletInfo
      <$> arbitrary -- comDayCqDamS7damCommonServletsS7damProductInfoServletInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqDamS7damCommonServletsS7damProductInfoServletInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqDamS7damCommonServletsS7damProductInfoServletInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqDamS7damCommonServletsS7damProductInfoServletInfoProperties :: Maybe ComDayCqDamS7damCommonServletsS7damProductInfoServletProperties
    
instance Arbitrary ComDayCqDamS7damCommonServletsS7damProductInfoServletProperties where
  arbitrary =
    ComDayCqDamS7damCommonServletsS7damProductInfoServletProperties
      <$> arbitrary -- comDayCqDamS7damCommonServletsS7damProductInfoServletPropertiesSlingServletPaths :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comDayCqDamS7damCommonServletsS7damProductInfoServletPropertiesSlingServletMethods :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplInfo where
  arbitrary =
    ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplInfo
      <$> arbitrary -- comDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplInfoProperties :: Maybe ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties
    
instance Arbitrary ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties where
  arbitrary =
    ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties
      <$> arbitrary -- comDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplPropertiesCqDamS7damVideoproxyclientserviceMultipartuploadMinsizeName :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplPropertiesCqDamS7damVideoproxyclientserviceMultipartuploadPartsizeName :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplPropertiesCqDamS7damVideoproxyclientserviceMultipartuploadNumthreadName :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplPropertiesCqDamS7damVideoproxyclientserviceHttpReadtimeoutName :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplPropertiesCqDamS7damVideoproxyclientserviceHttpConnectiontimeoutName :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplPropertiesCqDamS7damVideoproxyclientserviceHttpMaxretrycountName :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplPropertiesCqDamS7damVideoproxyclientserviceUploadprogressIntervalName :: Maybe ConfigNodePropertyInteger
    
instance Arbitrary ComDayCqDamScene7ImplScene7APIClientImplInfo where
  arbitrary =
    ComDayCqDamScene7ImplScene7APIClientImplInfo
      <$> arbitrary -- comDayCqDamScene7ImplScene7APIClientImplInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqDamScene7ImplScene7APIClientImplInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqDamScene7ImplScene7APIClientImplInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqDamScene7ImplScene7APIClientImplInfoProperties :: Maybe ComDayCqDamScene7ImplScene7APIClientImplProperties
    
instance Arbitrary ComDayCqDamScene7ImplScene7APIClientImplProperties where
  arbitrary =
    ComDayCqDamScene7ImplScene7APIClientImplProperties
      <$> arbitrary -- comDayCqDamScene7ImplScene7APIClientImplPropertiesCqDamScene7ApiclientRecordsperpageNofilterName :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comDayCqDamScene7ImplScene7APIClientImplPropertiesCqDamScene7ApiclientRecordsperpageWithfilterName :: Maybe ConfigNodePropertyInteger
    
instance Arbitrary ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplInfo where
  arbitrary =
    ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplInfo
      <$> arbitrary -- comDayCqDamScene7ImplScene7AssetMimeTypeServiceImplInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqDamScene7ImplScene7AssetMimeTypeServiceImplInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqDamScene7ImplScene7AssetMimeTypeServiceImplInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqDamScene7ImplScene7AssetMimeTypeServiceImplInfoProperties :: Maybe ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties
    
instance Arbitrary ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties where
  arbitrary =
    ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties
      <$> arbitrary -- comDayCqDamScene7ImplScene7AssetMimeTypeServiceImplPropertiesCqDamScene7AssetmimetypeserviceMapping :: Maybe ConfigNodePropertyArray
    
instance Arbitrary ComDayCqDamScene7ImplScene7ConfigurationEventListenerInfo where
  arbitrary =
    ComDayCqDamScene7ImplScene7ConfigurationEventListenerInfo
      <$> arbitrary -- comDayCqDamScene7ImplScene7ConfigurationEventListenerInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqDamScene7ImplScene7ConfigurationEventListenerInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqDamScene7ImplScene7ConfigurationEventListenerInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqDamScene7ImplScene7ConfigurationEventListenerInfoProperties :: Maybe ComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties
      <*> arbitrary -- comDayCqDamScene7ImplScene7ConfigurationEventListenerInfoBundleLocation :: Maybe Text
      <*> arbitrary -- comDayCqDamScene7ImplScene7ConfigurationEventListenerInfoServiceLocation :: Maybe Text
    
instance Arbitrary ComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties where
  arbitrary =
    ComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties
      <$> arbitrary -- comDayCqDamScene7ImplScene7ConfigurationEventListenerPropertiesCqDamScene7ConfigurationeventlistenerEnabled :: Maybe ConfigNodePropertyBoolean
    
instance Arbitrary ComDayCqDamScene7ImplScene7DamChangeEventListenerInfo where
  arbitrary =
    ComDayCqDamScene7ImplScene7DamChangeEventListenerInfo
      <$> arbitrary -- comDayCqDamScene7ImplScene7DamChangeEventListenerInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqDamScene7ImplScene7DamChangeEventListenerInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqDamScene7ImplScene7DamChangeEventListenerInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqDamScene7ImplScene7DamChangeEventListenerInfoProperties :: Maybe ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties
      <*> arbitrary -- comDayCqDamScene7ImplScene7DamChangeEventListenerInfoBundleLocation :: Maybe Text
      <*> arbitrary -- comDayCqDamScene7ImplScene7DamChangeEventListenerInfoServiceLocation :: Maybe Text
    
instance Arbitrary ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties where
  arbitrary =
    ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties
      <$> arbitrary -- comDayCqDamScene7ImplScene7DamChangeEventListenerPropertiesCqDamScene7DamchangeeventlistenerEnabled :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- comDayCqDamScene7ImplScene7DamChangeEventListenerPropertiesCqDamScene7DamchangeeventlistenerObservedPaths :: Maybe ConfigNodePropertyArray
    
instance Arbitrary ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplInfo where
  arbitrary =
    ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplInfo
      <$> arbitrary -- comDayCqDamScene7ImplScene7FlashTemplatesServiceImplInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqDamScene7ImplScene7FlashTemplatesServiceImplInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqDamScene7ImplScene7FlashTemplatesServiceImplInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqDamScene7ImplScene7FlashTemplatesServiceImplInfoProperties :: Maybe ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties
    
instance Arbitrary ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties where
  arbitrary =
    ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties
      <$> arbitrary -- comDayCqDamScene7ImplScene7FlashTemplatesServiceImplPropertiesScene7FlashTemplatesRti :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comDayCqDamScene7ImplScene7FlashTemplatesServiceImplPropertiesScene7FlashTemplatesRsi :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comDayCqDamScene7ImplScene7FlashTemplatesServiceImplPropertiesScene7FlashTemplatesRb :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comDayCqDamScene7ImplScene7FlashTemplatesServiceImplPropertiesScene7FlashTemplatesRurl :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comDayCqDamScene7ImplScene7FlashTemplatesServiceImplPropertiesScene7FlashTemplateUrlFormatParameter :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComDayCqDamScene7ImplScene7UploadServiceImplInfo where
  arbitrary =
    ComDayCqDamScene7ImplScene7UploadServiceImplInfo
      <$> arbitrary -- comDayCqDamScene7ImplScene7UploadServiceImplInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqDamScene7ImplScene7UploadServiceImplInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqDamScene7ImplScene7UploadServiceImplInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqDamScene7ImplScene7UploadServiceImplInfoProperties :: Maybe ComDayCqDamScene7ImplScene7UploadServiceImplProperties
    
instance Arbitrary ComDayCqDamScene7ImplScene7UploadServiceImplProperties where
  arbitrary =
    ComDayCqDamScene7ImplScene7UploadServiceImplProperties
      <$> arbitrary -- comDayCqDamScene7ImplScene7UploadServiceImplPropertiesCqDamScene7UploadserviceActivejobtimeoutLabel :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comDayCqDamScene7ImplScene7UploadServiceImplPropertiesCqDamScene7UploadserviceConnectionmaxperrouteLabel :: Maybe ConfigNodePropertyInteger
    
instance Arbitrary ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerInfo where
  arbitrary =
    ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerInfo
      <$> arbitrary -- comDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerInfoProperties :: Maybe ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties
    
instance Arbitrary ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties where
  arbitrary =
    ComDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerProperties
      <$> arbitrary -- comDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerPropertiesGetCacheExpirationUnit :: Maybe ConfigNodePropertyDropDown
      <*> arbitrary -- comDayCqDamStockIntegrationImplCacheStockCacheConfigurationSerPropertiesGetCacheExpirationValue :: Maybe ConfigNodePropertyInteger
    
instance Arbitrary ComDayCqDamStockIntegrationImplConfigurationStockConfigurationInfo where
  arbitrary =
    ComDayCqDamStockIntegrationImplConfigurationStockConfigurationInfo
      <$> arbitrary -- comDayCqDamStockIntegrationImplConfigurationStockConfigurationInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqDamStockIntegrationImplConfigurationStockConfigurationInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqDamStockIntegrationImplConfigurationStockConfigurationInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqDamStockIntegrationImplConfigurationStockConfigurationInfoProperties :: Maybe ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties
    
instance Arbitrary ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties where
  arbitrary =
    ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties
      <$> arbitrary -- comDayCqDamStockIntegrationImplConfigurationStockConfigurationPropertiesName :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comDayCqDamStockIntegrationImplConfigurationStockConfigurationPropertiesLocale :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comDayCqDamStockIntegrationImplConfigurationStockConfigurationPropertiesImsConfig :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComDayCqDamVideoImplServletVideoTestServletInfo where
  arbitrary =
    ComDayCqDamVideoImplServletVideoTestServletInfo
      <$> arbitrary -- comDayCqDamVideoImplServletVideoTestServletInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqDamVideoImplServletVideoTestServletInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqDamVideoImplServletVideoTestServletInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqDamVideoImplServletVideoTestServletInfoProperties :: Maybe ComDayCqDamVideoImplServletVideoTestServletProperties
      <*> arbitrary -- comDayCqDamVideoImplServletVideoTestServletInfoBundleLocation :: Maybe Text
      <*> arbitrary -- comDayCqDamVideoImplServletVideoTestServletInfoServiceLocation :: Maybe Text
    
instance Arbitrary ComDayCqDamVideoImplServletVideoTestServletProperties where
  arbitrary =
    ComDayCqDamVideoImplServletVideoTestServletProperties
      <$> arbitrary -- comDayCqDamVideoImplServletVideoTestServletPropertiesEnabled :: Maybe ConfigNodePropertyBoolean
    
instance Arbitrary ComDayCqExtwidgetServletsImageSpriteServletInfo where
  arbitrary =
    ComDayCqExtwidgetServletsImageSpriteServletInfo
      <$> arbitrary -- comDayCqExtwidgetServletsImageSpriteServletInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqExtwidgetServletsImageSpriteServletInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqExtwidgetServletsImageSpriteServletInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqExtwidgetServletsImageSpriteServletInfoProperties :: Maybe ComDayCqExtwidgetServletsImageSpriteServletProperties
    
instance Arbitrary ComDayCqExtwidgetServletsImageSpriteServletProperties where
  arbitrary =
    ComDayCqExtwidgetServletsImageSpriteServletProperties
      <$> arbitrary -- comDayCqExtwidgetServletsImageSpriteServletPropertiesMaxWidth :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comDayCqExtwidgetServletsImageSpriteServletPropertiesMaxHeight :: Maybe ConfigNodePropertyInteger
    
instance Arbitrary ComDayCqImageInternalFontFontHelperInfo where
  arbitrary =
    ComDayCqImageInternalFontFontHelperInfo
      <$> arbitrary -- comDayCqImageInternalFontFontHelperInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqImageInternalFontFontHelperInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqImageInternalFontFontHelperInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqImageInternalFontFontHelperInfoProperties :: Maybe ComDayCqImageInternalFontFontHelperProperties
    
instance Arbitrary ComDayCqImageInternalFontFontHelperProperties where
  arbitrary =
    ComDayCqImageInternalFontFontHelperProperties
      <$> arbitrary -- comDayCqImageInternalFontFontHelperPropertiesFontpath :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comDayCqImageInternalFontFontHelperPropertiesOversamplingFactor :: Maybe ConfigNodePropertyInteger
    
instance Arbitrary ComDayCqJcrclustersupportClusterStartLevelControllerInfo where
  arbitrary =
    ComDayCqJcrclustersupportClusterStartLevelControllerInfo
      <$> arbitrary -- comDayCqJcrclustersupportClusterStartLevelControllerInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqJcrclustersupportClusterStartLevelControllerInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqJcrclustersupportClusterStartLevelControllerInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqJcrclustersupportClusterStartLevelControllerInfoProperties :: Maybe ComDayCqJcrclustersupportClusterStartLevelControllerProperties
    
instance Arbitrary ComDayCqJcrclustersupportClusterStartLevelControllerProperties where
  arbitrary =
    ComDayCqJcrclustersupportClusterStartLevelControllerProperties
      <$> arbitrary -- comDayCqJcrclustersupportClusterStartLevelControllerPropertiesClusterLevelEnable :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- comDayCqJcrclustersupportClusterStartLevelControllerPropertiesClusterMasterLevel :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comDayCqJcrclustersupportClusterStartLevelControllerPropertiesClusterSlaveLevel :: Maybe ConfigNodePropertyInteger
    
instance Arbitrary ComDayCqMailerDefaultMailServiceInfo where
  arbitrary =
    ComDayCqMailerDefaultMailServiceInfo
      <$> arbitrary -- comDayCqMailerDefaultMailServiceInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqMailerDefaultMailServiceInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqMailerDefaultMailServiceInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqMailerDefaultMailServiceInfoProperties :: Maybe ComDayCqMailerDefaultMailServiceProperties
    
instance Arbitrary ComDayCqMailerDefaultMailServiceProperties where
  arbitrary =
    ComDayCqMailerDefaultMailServiceProperties
      <$> arbitrary -- comDayCqMailerDefaultMailServicePropertiesSmtpHost :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comDayCqMailerDefaultMailServicePropertiesSmtpPort :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comDayCqMailerDefaultMailServicePropertiesSmtpUser :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comDayCqMailerDefaultMailServicePropertiesSmtpPassword :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comDayCqMailerDefaultMailServicePropertiesFromAddress :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comDayCqMailerDefaultMailServicePropertiesSmtpSsl :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- comDayCqMailerDefaultMailServicePropertiesSmtpStarttls :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- comDayCqMailerDefaultMailServicePropertiesDebugEmail :: Maybe ConfigNodePropertyBoolean
    
instance Arbitrary ComDayCqMailerImplCqMailingServiceInfo where
  arbitrary =
    ComDayCqMailerImplCqMailingServiceInfo
      <$> arbitrary -- comDayCqMailerImplCqMailingServiceInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqMailerImplCqMailingServiceInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqMailerImplCqMailingServiceInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqMailerImplCqMailingServiceInfoProperties :: Maybe ComDayCqMailerImplCqMailingServiceProperties
    
instance Arbitrary ComDayCqMailerImplCqMailingServiceProperties where
  arbitrary =
    ComDayCqMailerImplCqMailingServiceProperties
      <$> arbitrary -- comDayCqMailerImplCqMailingServicePropertiesMaxRecipientCount :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComDayCqMailerImplEmailCqEmailTemplateFactoryInfo where
  arbitrary =
    ComDayCqMailerImplEmailCqEmailTemplateFactoryInfo
      <$> arbitrary -- comDayCqMailerImplEmailCqEmailTemplateFactoryInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqMailerImplEmailCqEmailTemplateFactoryInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqMailerImplEmailCqEmailTemplateFactoryInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqMailerImplEmailCqEmailTemplateFactoryInfoProperties :: Maybe ComDayCqMailerImplEmailCqEmailTemplateFactoryProperties
    
instance Arbitrary ComDayCqMailerImplEmailCqEmailTemplateFactoryProperties where
  arbitrary =
    ComDayCqMailerImplEmailCqEmailTemplateFactoryProperties
      <$> arbitrary -- comDayCqMailerImplEmailCqEmailTemplateFactoryPropertiesMailerEmailCharset :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComDayCqMailerImplEmailCqRetrieverTemplateFactoryInfo where
  arbitrary =
    ComDayCqMailerImplEmailCqRetrieverTemplateFactoryInfo
      <$> arbitrary -- comDayCqMailerImplEmailCqRetrieverTemplateFactoryInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqMailerImplEmailCqRetrieverTemplateFactoryInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqMailerImplEmailCqRetrieverTemplateFactoryInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqMailerImplEmailCqRetrieverTemplateFactoryInfoProperties :: Maybe ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties
    
instance Arbitrary ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties where
  arbitrary =
    ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties
      <$> arbitrary -- comDayCqMailerImplEmailCqRetrieverTemplateFactoryPropertiesMailerEmailEmbed :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- comDayCqMailerImplEmailCqRetrieverTemplateFactoryPropertiesMailerEmailCharset :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comDayCqMailerImplEmailCqRetrieverTemplateFactoryPropertiesMailerEmailRetrieverUserId :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comDayCqMailerImplEmailCqRetrieverTemplateFactoryPropertiesMailerEmailRetrieverUserPwd :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComDayCqMcmCampaignImplIntegrationConfigImplInfo where
  arbitrary =
    ComDayCqMcmCampaignImplIntegrationConfigImplInfo
      <$> arbitrary -- comDayCqMcmCampaignImplIntegrationConfigImplInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqMcmCampaignImplIntegrationConfigImplInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqMcmCampaignImplIntegrationConfigImplInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqMcmCampaignImplIntegrationConfigImplInfoProperties :: Maybe ComDayCqMcmCampaignImplIntegrationConfigImplProperties
    
instance Arbitrary ComDayCqMcmCampaignImplIntegrationConfigImplProperties where
  arbitrary =
    ComDayCqMcmCampaignImplIntegrationConfigImplProperties
      <$> arbitrary -- comDayCqMcmCampaignImplIntegrationConfigImplPropertiesAemMcmCampaignFormConstraints :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comDayCqMcmCampaignImplIntegrationConfigImplPropertiesAemMcmCampaignPublicUrl :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comDayCqMcmCampaignImplIntegrationConfigImplPropertiesAemMcmCampaignRelaxedSsl :: Maybe ConfigNodePropertyBoolean
    
instance Arbitrary ComDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryInfo where
  arbitrary =
    ComDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryInfo
      <$> arbitrary -- comDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryInfoProperties :: Maybe ComDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryProperties
    
instance Arbitrary ComDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryProperties where
  arbitrary =
    ComDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryProperties
      <$> arbitrary -- comDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryPropertiesServiceRanking :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comDayCqMcmCampaignImporterPersonalizedTextHandlerFactoryPropertiesTagpattern :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplInfo where
  arbitrary =
    ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplInfo
      <$> arbitrary -- comDayCqMcmCoreNewsletterNewsletterEmailServiceImplInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqMcmCoreNewsletterNewsletterEmailServiceImplInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqMcmCoreNewsletterNewsletterEmailServiceImplInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqMcmCoreNewsletterNewsletterEmailServiceImplInfoProperties :: Maybe ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties
    
instance Arbitrary ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties where
  arbitrary =
    ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties
      <$> arbitrary -- comDayCqMcmCoreNewsletterNewsletterEmailServiceImplPropertiesFromAddress :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comDayCqMcmCoreNewsletterNewsletterEmailServiceImplPropertiesSenderHost :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comDayCqMcmCoreNewsletterNewsletterEmailServiceImplPropertiesMaxBounceCount :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComDayCqMcmImplMCMConfigurationInfo where
  arbitrary =
    ComDayCqMcmImplMCMConfigurationInfo
      <$> arbitrary -- comDayCqMcmImplMCMConfigurationInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqMcmImplMCMConfigurationInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqMcmImplMCMConfigurationInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqMcmImplMCMConfigurationInfoProperties :: Maybe ComDayCqMcmImplMCMConfigurationProperties
    
instance Arbitrary ComDayCqMcmImplMCMConfigurationProperties where
  arbitrary =
    ComDayCqMcmImplMCMConfigurationProperties
      <$> arbitrary -- comDayCqMcmImplMCMConfigurationPropertiesExperienceIndirection :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comDayCqMcmImplMCMConfigurationPropertiesTouchpointIndirection :: Maybe ConfigNodePropertyArray
    
instance Arbitrary ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenInfo where
  arbitrary =
    ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenInfo
      <$> arbitrary -- comDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenInfoProperties :: Maybe ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenProperties
    
instance Arbitrary ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenProperties where
  arbitrary =
    ComDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenProperties
      <$> arbitrary -- comDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenPropertiesServiceRanking :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenPropertiesTagpattern :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comDayCqMcmLandingpageParserTaghandlersCtaClickThroughComponenPropertiesComponentResourceType :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougInfo where
  arbitrary =
    ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougInfo
      <$> arbitrary -- comDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougInfoProperties :: Maybe ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougProperties
    
instance Arbitrary ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougProperties where
  arbitrary =
    ComDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougProperties
      <$> arbitrary -- comDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougPropertiesServiceRanking :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougPropertiesTagpattern :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comDayCqMcmLandingpageParserTaghandlersCtaGraphicalClickThrougPropertiesComponentResourceType :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponentInfo where
  arbitrary =
    ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponentInfo
      <$> arbitrary -- comDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponentInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponentInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponentInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponentInfoProperties :: Maybe ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponentProperties
    
instance Arbitrary ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponentProperties where
  arbitrary =
    ComDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponentProperties
      <$> arbitrary -- comDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponentPropertiesServiceRanking :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comDayCqMcmLandingpageParserTaghandlersCtaLeadFormCTAComponentPropertiesTagpattern :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaInfo where
  arbitrary =
    ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaInfo
      <$> arbitrary -- comDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaInfoProperties :: Maybe ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaProperties
    
instance Arbitrary ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaProperties where
  arbitrary =
    ComDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaProperties
      <$> arbitrary -- comDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaPropertiesServiceRanking :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comDayCqMcmLandingpageParserTaghandlersMboxMBoxExperienceTagHaPropertiesTagpattern :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHInfo where
  arbitrary =
    ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHInfo
      <$> arbitrary -- comDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHInfoProperties :: Maybe ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHProperties
    
instance Arbitrary ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHProperties where
  arbitrary =
    ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHProperties
      <$> arbitrary -- comDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHPropertiesServiceRanking :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHPropertiesTagpattern :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHPropertiesComponentResourceType :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComDayCqNotificationImplNotificationServiceImplInfo where
  arbitrary =
    ComDayCqNotificationImplNotificationServiceImplInfo
      <$> arbitrary -- comDayCqNotificationImplNotificationServiceImplInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqNotificationImplNotificationServiceImplInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqNotificationImplNotificationServiceImplInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqNotificationImplNotificationServiceImplInfoProperties :: Maybe ComDayCqNotificationImplNotificationServiceImplProperties
    
instance Arbitrary ComDayCqNotificationImplNotificationServiceImplProperties where
  arbitrary =
    ComDayCqNotificationImplNotificationServiceImplProperties
      <$> arbitrary -- comDayCqNotificationImplNotificationServiceImplPropertiesEventFilter :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComDayCqPersonalizationImplServletsTargetingConfigurationServletInfo where
  arbitrary =
    ComDayCqPersonalizationImplServletsTargetingConfigurationServletInfo
      <$> arbitrary -- comDayCqPersonalizationImplServletsTargetingConfigurationServletInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqPersonalizationImplServletsTargetingConfigurationServletInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqPersonalizationImplServletsTargetingConfigurationServletInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqPersonalizationImplServletsTargetingConfigurationServletInfoProperties :: Maybe ComDayCqPersonalizationImplServletsTargetingConfigurationServletProperties
    
instance Arbitrary ComDayCqPersonalizationImplServletsTargetingConfigurationServletProperties where
  arbitrary =
    ComDayCqPersonalizationImplServletsTargetingConfigurationServletProperties
      <$> arbitrary -- comDayCqPersonalizationImplServletsTargetingConfigurationServletPropertiesForcelocation :: Maybe ConfigNodePropertyBoolean
    
instance Arbitrary ComDayCqPollingImporterImplManagedPollConfigImplInfo where
  arbitrary =
    ComDayCqPollingImporterImplManagedPollConfigImplInfo
      <$> arbitrary -- comDayCqPollingImporterImplManagedPollConfigImplInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqPollingImporterImplManagedPollConfigImplInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqPollingImporterImplManagedPollConfigImplInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqPollingImporterImplManagedPollConfigImplInfoProperties :: Maybe ComDayCqPollingImporterImplManagedPollConfigImplProperties
    
instance Arbitrary ComDayCqPollingImporterImplManagedPollConfigImplProperties where
  arbitrary =
    ComDayCqPollingImporterImplManagedPollConfigImplProperties
      <$> arbitrary -- comDayCqPollingImporterImplManagedPollConfigImplPropertiesId :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comDayCqPollingImporterImplManagedPollConfigImplPropertiesEnabled :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- comDayCqPollingImporterImplManagedPollConfigImplPropertiesReference :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- comDayCqPollingImporterImplManagedPollConfigImplPropertiesInterval :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comDayCqPollingImporterImplManagedPollConfigImplPropertiesExpression :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comDayCqPollingImporterImplManagedPollConfigImplPropertiesSource :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comDayCqPollingImporterImplManagedPollConfigImplPropertiesTarget :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comDayCqPollingImporterImplManagedPollConfigImplPropertiesLogin :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comDayCqPollingImporterImplManagedPollConfigImplPropertiesPassword :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComDayCqPollingImporterImplManagedPollingImporterImplInfo where
  arbitrary =
    ComDayCqPollingImporterImplManagedPollingImporterImplInfo
      <$> arbitrary -- comDayCqPollingImporterImplManagedPollingImporterImplInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqPollingImporterImplManagedPollingImporterImplInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqPollingImporterImplManagedPollingImporterImplInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqPollingImporterImplManagedPollingImporterImplInfoProperties :: Maybe ComDayCqPollingImporterImplManagedPollingImporterImplProperties
    
instance Arbitrary ComDayCqPollingImporterImplManagedPollingImporterImplProperties where
  arbitrary =
    ComDayCqPollingImporterImplManagedPollingImporterImplProperties
      <$> arbitrary -- comDayCqPollingImporterImplManagedPollingImporterImplPropertiesImporterUser :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComDayCqPollingImporterImplPollingImporterImplInfo where
  arbitrary =
    ComDayCqPollingImporterImplPollingImporterImplInfo
      <$> arbitrary -- comDayCqPollingImporterImplPollingImporterImplInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqPollingImporterImplPollingImporterImplInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqPollingImporterImplPollingImporterImplInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqPollingImporterImplPollingImporterImplInfoProperties :: Maybe ComDayCqPollingImporterImplPollingImporterImplProperties
    
instance Arbitrary ComDayCqPollingImporterImplPollingImporterImplProperties where
  arbitrary =
    ComDayCqPollingImporterImplPollingImporterImplProperties
      <$> arbitrary -- comDayCqPollingImporterImplPollingImporterImplPropertiesImporterMinInterval :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comDayCqPollingImporterImplPollingImporterImplPropertiesImporterUser :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comDayCqPollingImporterImplPollingImporterImplPropertiesExcludePaths :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comDayCqPollingImporterImplPollingImporterImplPropertiesIncludePaths :: Maybe ConfigNodePropertyArray
    
instance Arbitrary ComDayCqReplicationAuditReplicationEventListenerInfo where
  arbitrary =
    ComDayCqReplicationAuditReplicationEventListenerInfo
      <$> arbitrary -- comDayCqReplicationAuditReplicationEventListenerInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqReplicationAuditReplicationEventListenerInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqReplicationAuditReplicationEventListenerInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqReplicationAuditReplicationEventListenerInfoProperties :: Maybe ComDayCqReplicationAuditReplicationEventListenerProperties
      <*> arbitrary -- comDayCqReplicationAuditReplicationEventListenerInfoBundleLocation :: Maybe Text
      <*> arbitrary -- comDayCqReplicationAuditReplicationEventListenerInfoServiceLocation :: Maybe Text
    
instance Arbitrary ComDayCqReplicationAuditReplicationEventListenerProperties where
  arbitrary =
    ComDayCqReplicationAuditReplicationEventListenerProperties
      <$> arbitrary -- comDayCqReplicationAuditReplicationEventListenerPropertiesServiceRanking :: Maybe ConfigNodePropertyInteger
    
instance Arbitrary ComDayCqReplicationContentStaticContentBuilderInfo where
  arbitrary =
    ComDayCqReplicationContentStaticContentBuilderInfo
      <$> arbitrary -- comDayCqReplicationContentStaticContentBuilderInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqReplicationContentStaticContentBuilderInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqReplicationContentStaticContentBuilderInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqReplicationContentStaticContentBuilderInfoProperties :: Maybe ComDayCqReplicationContentStaticContentBuilderProperties
    
instance Arbitrary ComDayCqReplicationContentStaticContentBuilderProperties where
  arbitrary =
    ComDayCqReplicationContentStaticContentBuilderProperties
      <$> arbitrary -- comDayCqReplicationContentStaticContentBuilderPropertiesHost :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comDayCqReplicationContentStaticContentBuilderPropertiesPort :: Maybe ConfigNodePropertyInteger
    
instance Arbitrary ComDayCqReplicationImplAgentManagerImplInfo where
  arbitrary =
    ComDayCqReplicationImplAgentManagerImplInfo
      <$> arbitrary -- comDayCqReplicationImplAgentManagerImplInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqReplicationImplAgentManagerImplInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqReplicationImplAgentManagerImplInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqReplicationImplAgentManagerImplInfoProperties :: Maybe ComDayCqReplicationImplAgentManagerImplProperties
    
instance Arbitrary ComDayCqReplicationImplAgentManagerImplProperties where
  arbitrary =
    ComDayCqReplicationImplAgentManagerImplProperties
      <$> arbitrary -- comDayCqReplicationImplAgentManagerImplPropertiesJobTopics :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comDayCqReplicationImplAgentManagerImplPropertiesServiceUserTarget :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comDayCqReplicationImplAgentManagerImplPropertiesAgentProviderTarget :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComDayCqReplicationImplContentDurboBinaryLessContentBuilderInfo where
  arbitrary =
    ComDayCqReplicationImplContentDurboBinaryLessContentBuilderInfo
      <$> arbitrary -- comDayCqReplicationImplContentDurboBinaryLessContentBuilderInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqReplicationImplContentDurboBinaryLessContentBuilderInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqReplicationImplContentDurboBinaryLessContentBuilderInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqReplicationImplContentDurboBinaryLessContentBuilderInfoProperties :: Maybe ComDayCqReplicationImplContentDurboBinaryLessContentBuilderProperties
    
instance Arbitrary ComDayCqReplicationImplContentDurboBinaryLessContentBuilderProperties where
  arbitrary =
    ComDayCqReplicationImplContentDurboBinaryLessContentBuilderProperties
      <$> arbitrary -- comDayCqReplicationImplContentDurboBinaryLessContentBuilderPropertiesBinaryThreshold :: Maybe ConfigNodePropertyInteger
    
instance Arbitrary ComDayCqReplicationImplContentDurboDurboImportConfigurationProvInfo where
  arbitrary =
    ComDayCqReplicationImplContentDurboDurboImportConfigurationProvInfo
      <$> arbitrary -- comDayCqReplicationImplContentDurboDurboImportConfigurationProvInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqReplicationImplContentDurboDurboImportConfigurationProvInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqReplicationImplContentDurboDurboImportConfigurationProvInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqReplicationImplContentDurboDurboImportConfigurationProvInfoProperties :: Maybe ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties
    
instance Arbitrary ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties where
  arbitrary =
    ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties
      <$> arbitrary -- comDayCqReplicationImplContentDurboDurboImportConfigurationProvPropertiesPreserveHierarchyNodes :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- comDayCqReplicationImplContentDurboDurboImportConfigurationProvPropertiesIgnoreVersioning :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- comDayCqReplicationImplContentDurboDurboImportConfigurationProvPropertiesImportAcl :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- comDayCqReplicationImplContentDurboDurboImportConfigurationProvPropertiesSaveThreshold :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comDayCqReplicationImplContentDurboDurboImportConfigurationProvPropertiesPreserveUserPaths :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- comDayCqReplicationImplContentDurboDurboImportConfigurationProvPropertiesPreserveUuid :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- comDayCqReplicationImplContentDurboDurboImportConfigurationProvPropertiesPreserveUuidNodetypes :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comDayCqReplicationImplContentDurboDurboImportConfigurationProvPropertiesPreserveUuidSubtrees :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comDayCqReplicationImplContentDurboDurboImportConfigurationProvPropertiesAutoCommit :: Maybe ConfigNodePropertyBoolean
    
instance Arbitrary ComDayCqReplicationImplReplicationContentFactoryProviderImplInfo where
  arbitrary =
    ComDayCqReplicationImplReplicationContentFactoryProviderImplInfo
      <$> arbitrary -- comDayCqReplicationImplReplicationContentFactoryProviderImplInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqReplicationImplReplicationContentFactoryProviderImplInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqReplicationImplReplicationContentFactoryProviderImplInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqReplicationImplReplicationContentFactoryProviderImplInfoProperties :: Maybe ComDayCqReplicationImplReplicationContentFactoryProviderImplProperties
      <*> arbitrary -- comDayCqReplicationImplReplicationContentFactoryProviderImplInfoBundleLocation :: Maybe Text
      <*> arbitrary -- comDayCqReplicationImplReplicationContentFactoryProviderImplInfoServiceLocation :: Maybe Text
    
instance Arbitrary ComDayCqReplicationImplReplicationContentFactoryProviderImplProperties where
  arbitrary =
    ComDayCqReplicationImplReplicationContentFactoryProviderImplProperties
      <$> arbitrary -- comDayCqReplicationImplReplicationContentFactoryProviderImplPropertiesReplicationContentUseFileStorage :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- comDayCqReplicationImplReplicationContentFactoryProviderImplPropertiesReplicationContentMaxCommitAttempts :: Maybe ConfigNodePropertyInteger
    
instance Arbitrary ComDayCqReplicationImplReplicationReceiverImplInfo where
  arbitrary =
    ComDayCqReplicationImplReplicationReceiverImplInfo
      <$> arbitrary -- comDayCqReplicationImplReplicationReceiverImplInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqReplicationImplReplicationReceiverImplInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqReplicationImplReplicationReceiverImplInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqReplicationImplReplicationReceiverImplInfoProperties :: Maybe ComDayCqReplicationImplReplicationReceiverImplProperties
    
instance Arbitrary ComDayCqReplicationImplReplicationReceiverImplProperties where
  arbitrary =
    ComDayCqReplicationImplReplicationReceiverImplProperties
      <$> arbitrary -- comDayCqReplicationImplReplicationReceiverImplPropertiesReceiverTmpfileThreshold :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comDayCqReplicationImplReplicationReceiverImplPropertiesReceiverPackagesUseInstall :: Maybe ConfigNodePropertyBoolean
    
instance Arbitrary ComDayCqReplicationImplReplicatorImplInfo where
  arbitrary =
    ComDayCqReplicationImplReplicatorImplInfo
      <$> arbitrary -- comDayCqReplicationImplReplicatorImplInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqReplicationImplReplicatorImplInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqReplicationImplReplicatorImplInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqReplicationImplReplicatorImplInfoProperties :: Maybe ComDayCqReplicationImplReplicatorImplProperties
    
instance Arbitrary ComDayCqReplicationImplReplicatorImplProperties where
  arbitrary =
    ComDayCqReplicationImplReplicatorImplProperties
      <$> arbitrary -- comDayCqReplicationImplReplicatorImplPropertiesDistributeEvents :: Maybe ConfigNodePropertyBoolean
    
instance Arbitrary ComDayCqReplicationImplReverseReplicatorInfo where
  arbitrary =
    ComDayCqReplicationImplReverseReplicatorInfo
      <$> arbitrary -- comDayCqReplicationImplReverseReplicatorInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqReplicationImplReverseReplicatorInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqReplicationImplReverseReplicatorInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqReplicationImplReverseReplicatorInfoProperties :: Maybe ComDayCqReplicationImplReverseReplicatorProperties
      <*> arbitrary -- comDayCqReplicationImplReverseReplicatorInfoAdditionalProperties :: Maybe Text
      <*> arbitrary -- comDayCqReplicationImplReverseReplicatorInfoBundleLocation :: Maybe Text
      <*> arbitrary -- comDayCqReplicationImplReverseReplicatorInfoServiceLocation :: Maybe Text
    
instance Arbitrary ComDayCqReplicationImplReverseReplicatorProperties where
  arbitrary =
    ComDayCqReplicationImplReverseReplicatorProperties
      <$> arbitrary -- comDayCqReplicationImplReverseReplicatorPropertiesSchedulerPeriod :: Maybe ConfigNodePropertyInteger
    
instance Arbitrary ComDayCqReplicationImplTransportBinaryLessTransportHandlerInfo where
  arbitrary =
    ComDayCqReplicationImplTransportBinaryLessTransportHandlerInfo
      <$> arbitrary -- comDayCqReplicationImplTransportBinaryLessTransportHandlerInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqReplicationImplTransportBinaryLessTransportHandlerInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqReplicationImplTransportBinaryLessTransportHandlerInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqReplicationImplTransportBinaryLessTransportHandlerInfoProperties :: Maybe ComDayCqReplicationImplTransportBinaryLessTransportHandlerProperties
    
instance Arbitrary ComDayCqReplicationImplTransportBinaryLessTransportHandlerProperties where
  arbitrary =
    ComDayCqReplicationImplTransportBinaryLessTransportHandlerProperties
      <$> arbitrary -- comDayCqReplicationImplTransportBinaryLessTransportHandlerPropertiesDisabledCipherSuites :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comDayCqReplicationImplTransportBinaryLessTransportHandlerPropertiesEnabledCipherSuites :: Maybe ConfigNodePropertyArray
    
instance Arbitrary ComDayCqReplicationImplTransportHttpInfo where
  arbitrary =
    ComDayCqReplicationImplTransportHttpInfo
      <$> arbitrary -- comDayCqReplicationImplTransportHttpInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqReplicationImplTransportHttpInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqReplicationImplTransportHttpInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqReplicationImplTransportHttpInfoProperties :: Maybe ComDayCqReplicationImplTransportHttpProperties
    
instance Arbitrary ComDayCqReplicationImplTransportHttpProperties where
  arbitrary =
    ComDayCqReplicationImplTransportHttpProperties
      <$> arbitrary -- comDayCqReplicationImplTransportHttpPropertiesDisabledCipherSuites :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comDayCqReplicationImplTransportHttpPropertiesEnabledCipherSuites :: Maybe ConfigNodePropertyArray
    
instance Arbitrary ComDayCqReportingImplCacheCacheImplInfo where
  arbitrary =
    ComDayCqReportingImplCacheCacheImplInfo
      <$> arbitrary -- comDayCqReportingImplCacheCacheImplInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqReportingImplCacheCacheImplInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqReportingImplCacheCacheImplInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqReportingImplCacheCacheImplInfoProperties :: Maybe ComDayCqReportingImplCacheCacheImplProperties
    
instance Arbitrary ComDayCqReportingImplCacheCacheImplProperties where
  arbitrary =
    ComDayCqReportingImplCacheCacheImplProperties
      <$> arbitrary -- comDayCqReportingImplCacheCacheImplPropertiesRepcacheEnable :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- comDayCqReportingImplCacheCacheImplPropertiesRepcacheTtl :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comDayCqReportingImplCacheCacheImplPropertiesRepcacheMax :: Maybe ConfigNodePropertyInteger
    
instance Arbitrary ComDayCqReportingImplConfigServiceImplInfo where
  arbitrary =
    ComDayCqReportingImplConfigServiceImplInfo
      <$> arbitrary -- comDayCqReportingImplConfigServiceImplInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqReportingImplConfigServiceImplInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqReportingImplConfigServiceImplInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqReportingImplConfigServiceImplInfoProperties :: Maybe ComDayCqReportingImplConfigServiceImplProperties
    
instance Arbitrary ComDayCqReportingImplConfigServiceImplProperties where
  arbitrary =
    ComDayCqReportingImplConfigServiceImplProperties
      <$> arbitrary -- comDayCqReportingImplConfigServiceImplPropertiesRepconfTimezone :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comDayCqReportingImplConfigServiceImplPropertiesRepconfLocale :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comDayCqReportingImplConfigServiceImplPropertiesRepconfSnapshots :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comDayCqReportingImplConfigServiceImplPropertiesRepconfRepdir :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comDayCqReportingImplConfigServiceImplPropertiesRepconfHourofday :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comDayCqReportingImplConfigServiceImplPropertiesRepconfMinofhour :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comDayCqReportingImplConfigServiceImplPropertiesRepconfMaxrows :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comDayCqReportingImplConfigServiceImplPropertiesRepconfFakedata :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- comDayCqReportingImplConfigServiceImplPropertiesRepconfSnapshotuser :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comDayCqReportingImplConfigServiceImplPropertiesRepconfEnforcesnapshotuser :: Maybe ConfigNodePropertyBoolean
    
instance Arbitrary ComDayCqReportingImplRLogAnalyzerInfo where
  arbitrary =
    ComDayCqReportingImplRLogAnalyzerInfo
      <$> arbitrary -- comDayCqReportingImplRLogAnalyzerInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqReportingImplRLogAnalyzerInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqReportingImplRLogAnalyzerInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqReportingImplRLogAnalyzerInfoProperties :: Maybe ComDayCqReportingImplRLogAnalyzerProperties
    
instance Arbitrary ComDayCqReportingImplRLogAnalyzerProperties where
  arbitrary =
    ComDayCqReportingImplRLogAnalyzerProperties
      <$> arbitrary -- comDayCqReportingImplRLogAnalyzerPropertiesRequestLogOutput :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComDayCqRewriterLinkcheckerImplLinkCheckerImplInfo where
  arbitrary =
    ComDayCqRewriterLinkcheckerImplLinkCheckerImplInfo
      <$> arbitrary -- comDayCqRewriterLinkcheckerImplLinkCheckerImplInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqRewriterLinkcheckerImplLinkCheckerImplInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqRewriterLinkcheckerImplLinkCheckerImplInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqRewriterLinkcheckerImplLinkCheckerImplInfoProperties :: Maybe ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties
      <*> arbitrary -- comDayCqRewriterLinkcheckerImplLinkCheckerImplInfoBundleLocation :: Maybe Text
      <*> arbitrary -- comDayCqRewriterLinkcheckerImplLinkCheckerImplInfoServiceLocation :: Maybe Text
    
instance Arbitrary ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties where
  arbitrary =
    ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties
      <$> arbitrary -- comDayCqRewriterLinkcheckerImplLinkCheckerImplPropertiesSchedulerPeriod :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comDayCqRewriterLinkcheckerImplLinkCheckerImplPropertiesSchedulerConcurrent :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- comDayCqRewriterLinkcheckerImplLinkCheckerImplPropertiesServiceBadLinkToleranceInterval :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comDayCqRewriterLinkcheckerImplLinkCheckerImplPropertiesServiceCheckOverridePatterns :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comDayCqRewriterLinkcheckerImplLinkCheckerImplPropertiesServiceCacheBrokenInternalLinks :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- comDayCqRewriterLinkcheckerImplLinkCheckerImplPropertiesServiceSpecialLinkPrefix :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comDayCqRewriterLinkcheckerImplLinkCheckerImplPropertiesServiceSpecialLinkPatterns :: Maybe ConfigNodePropertyArray
    
instance Arbitrary ComDayCqRewriterLinkcheckerImplLinkCheckerTaskInfo where
  arbitrary =
    ComDayCqRewriterLinkcheckerImplLinkCheckerTaskInfo
      <$> arbitrary -- comDayCqRewriterLinkcheckerImplLinkCheckerTaskInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqRewriterLinkcheckerImplLinkCheckerTaskInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqRewriterLinkcheckerImplLinkCheckerTaskInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqRewriterLinkcheckerImplLinkCheckerTaskInfoProperties :: Maybe ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties
    
instance Arbitrary ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties where
  arbitrary =
    ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties
      <$> arbitrary -- comDayCqRewriterLinkcheckerImplLinkCheckerTaskPropertiesSchedulerPeriod :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comDayCqRewriterLinkcheckerImplLinkCheckerTaskPropertiesSchedulerConcurrent :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- comDayCqRewriterLinkcheckerImplLinkCheckerTaskPropertiesGoodLinkTestInterval :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comDayCqRewriterLinkcheckerImplLinkCheckerTaskPropertiesBadLinkTestInterval :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comDayCqRewriterLinkcheckerImplLinkCheckerTaskPropertiesLinkUnusedInterval :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comDayCqRewriterLinkcheckerImplLinkCheckerTaskPropertiesConnectionTimeout :: Maybe ConfigNodePropertyInteger
    
instance Arbitrary ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryInfo where
  arbitrary =
    ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryInfo
      <$> arbitrary -- comDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryInfoProperties :: Maybe ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties
    
instance Arbitrary ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties where
  arbitrary =
    ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties
      <$> arbitrary -- comDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryPropertiesLinkcheckertransformerDisableRewriting :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- comDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryPropertiesLinkcheckertransformerDisableChecking :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- comDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryPropertiesLinkcheckertransformerMapCacheSize :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryPropertiesLinkcheckertransformerStrictExtensionCheck :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- comDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryPropertiesLinkcheckertransformerStripHtmltExtension :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- comDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryPropertiesLinkcheckertransformerRewriteElements :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryPropertiesLinkcheckertransformerStripExtensionPathBlacklist :: Maybe ConfigNodePropertyArray
    
instance Arbitrary ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplInfo where
  arbitrary =
    ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplInfo
      <$> arbitrary -- comDayCqRewriterLinkcheckerImplLinkInfoStorageImplInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqRewriterLinkcheckerImplLinkInfoStorageImplInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqRewriterLinkcheckerImplLinkInfoStorageImplInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqRewriterLinkcheckerImplLinkInfoStorageImplInfoProperties :: Maybe ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties
      <*> arbitrary -- comDayCqRewriterLinkcheckerImplLinkInfoStorageImplInfoBundleLocation :: Maybe Text
      <*> arbitrary -- comDayCqRewriterLinkcheckerImplLinkInfoStorageImplInfoServiceLocation :: Maybe Text
    
instance Arbitrary ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties where
  arbitrary =
    ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties
      <$> arbitrary -- comDayCqRewriterLinkcheckerImplLinkInfoStorageImplPropertiesServiceMaxLinksPerHost :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comDayCqRewriterLinkcheckerImplLinkInfoStorageImplPropertiesServiceSaveExternalLinkReferences :: Maybe ConfigNodePropertyBoolean
    
instance Arbitrary ComDayCqRewriterProcessorImplHtmlParserFactoryInfo where
  arbitrary =
    ComDayCqRewriterProcessorImplHtmlParserFactoryInfo
      <$> arbitrary -- comDayCqRewriterProcessorImplHtmlParserFactoryInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqRewriterProcessorImplHtmlParserFactoryInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqRewriterProcessorImplHtmlParserFactoryInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqRewriterProcessorImplHtmlParserFactoryInfoProperties :: Maybe ComDayCqRewriterProcessorImplHtmlParserFactoryProperties
    
instance Arbitrary ComDayCqRewriterProcessorImplHtmlParserFactoryProperties where
  arbitrary =
    ComDayCqRewriterProcessorImplHtmlParserFactoryProperties
      <$> arbitrary -- comDayCqRewriterProcessorImplHtmlParserFactoryPropertiesHtmlparserProcessTags :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comDayCqRewriterProcessorImplHtmlParserFactoryPropertiesHtmlparserPreserveCamelCase :: Maybe ConfigNodePropertyBoolean
    
instance Arbitrary ComDayCqSearchImplBuilderQueryBuilderImplInfo where
  arbitrary =
    ComDayCqSearchImplBuilderQueryBuilderImplInfo
      <$> arbitrary -- comDayCqSearchImplBuilderQueryBuilderImplInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqSearchImplBuilderQueryBuilderImplInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqSearchImplBuilderQueryBuilderImplInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqSearchImplBuilderQueryBuilderImplInfoProperties :: Maybe ComDayCqSearchImplBuilderQueryBuilderImplProperties
    
instance Arbitrary ComDayCqSearchImplBuilderQueryBuilderImplProperties where
  arbitrary =
    ComDayCqSearchImplBuilderQueryBuilderImplProperties
      <$> arbitrary -- comDayCqSearchImplBuilderQueryBuilderImplPropertiesExcerptProperties :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comDayCqSearchImplBuilderQueryBuilderImplPropertiesCacheMaxEntries :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comDayCqSearchImplBuilderQueryBuilderImplPropertiesCacheEntryLifetime :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comDayCqSearchImplBuilderQueryBuilderImplPropertiesXpathUnion :: Maybe ConfigNodePropertyBoolean
    
instance Arbitrary ComDayCqSearchSuggestImplSuggestionIndexManagerImplInfo where
  arbitrary =
    ComDayCqSearchSuggestImplSuggestionIndexManagerImplInfo
      <$> arbitrary -- comDayCqSearchSuggestImplSuggestionIndexManagerImplInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqSearchSuggestImplSuggestionIndexManagerImplInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqSearchSuggestImplSuggestionIndexManagerImplInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqSearchSuggestImplSuggestionIndexManagerImplInfoProperties :: Maybe ComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties
    
instance Arbitrary ComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties where
  arbitrary =
    ComDayCqSearchSuggestImplSuggestionIndexManagerImplProperties
      <$> arbitrary -- comDayCqSearchSuggestImplSuggestionIndexManagerImplPropertiesPathBuilderTarget :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comDayCqSearchSuggestImplSuggestionIndexManagerImplPropertiesSuggestBasepath :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerInfo where
  arbitrary =
    ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerInfo
      <$> arbitrary -- comDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerInfoProperties :: Maybe ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties
      <*> arbitrary -- comDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerInfoBundleLocation :: Maybe Text
      <*> arbitrary -- comDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerInfoServiceLocation :: Maybe Text
    
instance Arbitrary ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties where
  arbitrary =
    ComDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerProperties
      <$> arbitrary -- comDayCqSearchpromoteImplPublishSearchPromoteConfigHandlerPropertiesCqSearchpromoteConfighandlerEnabled :: Maybe ConfigNodePropertyBoolean
    
instance Arbitrary ComDayCqSearchpromoteImplSearchPromoteServiceImplInfo where
  arbitrary =
    ComDayCqSearchpromoteImplSearchPromoteServiceImplInfo
      <$> arbitrary -- comDayCqSearchpromoteImplSearchPromoteServiceImplInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqSearchpromoteImplSearchPromoteServiceImplInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqSearchpromoteImplSearchPromoteServiceImplInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqSearchpromoteImplSearchPromoteServiceImplInfoProperties :: Maybe ComDayCqSearchpromoteImplSearchPromoteServiceImplProperties
      <*> arbitrary -- comDayCqSearchpromoteImplSearchPromoteServiceImplInfoBundleLocation :: Maybe Text
      <*> arbitrary -- comDayCqSearchpromoteImplSearchPromoteServiceImplInfoServiceLocation :: Maybe Text
    
instance Arbitrary ComDayCqSearchpromoteImplSearchPromoteServiceImplProperties where
  arbitrary =
    ComDayCqSearchpromoteImplSearchPromoteServiceImplProperties
      <$> arbitrary -- comDayCqSearchpromoteImplSearchPromoteServiceImplPropertiesCqSearchpromoteConfigurationServerUri :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comDayCqSearchpromoteImplSearchPromoteServiceImplPropertiesCqSearchpromoteConfigurationEnvironment :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comDayCqSearchpromoteImplSearchPromoteServiceImplPropertiesConnectionTimeout :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comDayCqSearchpromoteImplSearchPromoteServiceImplPropertiesSocketTimeout :: Maybe ConfigNodePropertyInteger
    
instance Arbitrary ComDayCqSecurityACLSetupInfo where
  arbitrary =
    ComDayCqSecurityACLSetupInfo
      <$> arbitrary -- comDayCqSecurityACLSetupInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqSecurityACLSetupInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqSecurityACLSetupInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqSecurityACLSetupInfoProperties :: Maybe ComDayCqSecurityACLSetupProperties
      <*> arbitrary -- comDayCqSecurityACLSetupInfoBundleLocation :: Maybe Text
      <*> arbitrary -- comDayCqSecurityACLSetupInfoServiceLocation :: Maybe Text
    
instance Arbitrary ComDayCqSecurityACLSetupProperties where
  arbitrary =
    ComDayCqSecurityACLSetupProperties
      <$> arbitrary -- comDayCqSecurityACLSetupPropertiesCqAclsetupRules :: Maybe ConfigNodePropertyArray
    
instance Arbitrary ComDayCqStatisticsImplStatisticsServiceImplInfo where
  arbitrary =
    ComDayCqStatisticsImplStatisticsServiceImplInfo
      <$> arbitrary -- comDayCqStatisticsImplStatisticsServiceImplInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqStatisticsImplStatisticsServiceImplInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqStatisticsImplStatisticsServiceImplInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqStatisticsImplStatisticsServiceImplInfoProperties :: Maybe ComDayCqStatisticsImplStatisticsServiceImplProperties
    
instance Arbitrary ComDayCqStatisticsImplStatisticsServiceImplProperties where
  arbitrary =
    ComDayCqStatisticsImplStatisticsServiceImplProperties
      <$> arbitrary -- comDayCqStatisticsImplStatisticsServiceImplPropertiesSchedulerPeriod :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comDayCqStatisticsImplStatisticsServiceImplPropertiesSchedulerConcurrent :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- comDayCqStatisticsImplStatisticsServiceImplPropertiesPath :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comDayCqStatisticsImplStatisticsServiceImplPropertiesWorkspace :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comDayCqStatisticsImplStatisticsServiceImplPropertiesKeywordsPath :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comDayCqStatisticsImplStatisticsServiceImplPropertiesAsyncEntries :: Maybe ConfigNodePropertyBoolean
    
instance Arbitrary ComDayCqTaggingImplJcrTagManagerFactoryImplInfo where
  arbitrary =
    ComDayCqTaggingImplJcrTagManagerFactoryImplInfo
      <$> arbitrary -- comDayCqTaggingImplJcrTagManagerFactoryImplInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqTaggingImplJcrTagManagerFactoryImplInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqTaggingImplJcrTagManagerFactoryImplInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqTaggingImplJcrTagManagerFactoryImplInfoProperties :: Maybe ComDayCqTaggingImplJcrTagManagerFactoryImplProperties
    
instance Arbitrary ComDayCqTaggingImplJcrTagManagerFactoryImplProperties where
  arbitrary =
    ComDayCqTaggingImplJcrTagManagerFactoryImplProperties
      <$> arbitrary -- comDayCqTaggingImplJcrTagManagerFactoryImplPropertiesValidationEnabled :: Maybe ConfigNodePropertyBoolean
    
instance Arbitrary ComDayCqTaggingImplSearchTagPredicateEvaluatorInfo where
  arbitrary =
    ComDayCqTaggingImplSearchTagPredicateEvaluatorInfo
      <$> arbitrary -- comDayCqTaggingImplSearchTagPredicateEvaluatorInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqTaggingImplSearchTagPredicateEvaluatorInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqTaggingImplSearchTagPredicateEvaluatorInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqTaggingImplSearchTagPredicateEvaluatorInfoProperties :: Maybe ComDayCqTaggingImplSearchTagPredicateEvaluatorProperties
    
instance Arbitrary ComDayCqTaggingImplSearchTagPredicateEvaluatorProperties where
  arbitrary =
    ComDayCqTaggingImplSearchTagPredicateEvaluatorProperties
      <$> arbitrary -- comDayCqTaggingImplSearchTagPredicateEvaluatorPropertiesIgnorePath :: Maybe ConfigNodePropertyBoolean
    
instance Arbitrary ComDayCqTaggingImplTagGarbageCollectorInfo where
  arbitrary =
    ComDayCqTaggingImplTagGarbageCollectorInfo
      <$> arbitrary -- comDayCqTaggingImplTagGarbageCollectorInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqTaggingImplTagGarbageCollectorInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqTaggingImplTagGarbageCollectorInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqTaggingImplTagGarbageCollectorInfoProperties :: Maybe ComDayCqTaggingImplTagGarbageCollectorProperties
    
instance Arbitrary ComDayCqTaggingImplTagGarbageCollectorProperties where
  arbitrary =
    ComDayCqTaggingImplTagGarbageCollectorProperties
      <$> arbitrary -- comDayCqTaggingImplTagGarbageCollectorPropertiesSchedulerExpression :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerInfo where
  arbitrary =
    ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerInfo
      <$> arbitrary -- comDayCqWcmContentsyncImplHandlerPagesUpdateHandlerInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqWcmContentsyncImplHandlerPagesUpdateHandlerInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqWcmContentsyncImplHandlerPagesUpdateHandlerInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqWcmContentsyncImplHandlerPagesUpdateHandlerInfoProperties :: Maybe ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties
    
instance Arbitrary ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties where
  arbitrary =
    ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties
      <$> arbitrary -- comDayCqWcmContentsyncImplHandlerPagesUpdateHandlerPropertiesCqPagesupdatehandlerImageresourcetypes :: Maybe ConfigNodePropertyArray
    
instance Arbitrary ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorInfo where
  arbitrary =
    ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorInfo
      <$> arbitrary -- comDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorInfoProperties :: Maybe ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties
    
instance Arbitrary ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties where
  arbitrary =
    ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties
      <$> arbitrary -- comDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorPropertiesCqContentsyncPathrewritertransformerMappingLinks :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorPropertiesCqContentsyncPathrewritertransformerMappingClientlibs :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorPropertiesCqContentsyncPathrewritertransformerMappingImages :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorPropertiesCqContentsyncPathrewritertransformerAttributePattern :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorPropertiesCqContentsyncPathrewritertransformerClientlibraryPattern :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorPropertiesCqContentsyncPathrewritertransformerClientlibraryReplace :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComDayCqWcmCoreImplAuthoringUIModeServiceImplInfo where
  arbitrary =
    ComDayCqWcmCoreImplAuthoringUIModeServiceImplInfo
      <$> arbitrary -- comDayCqWcmCoreImplAuthoringUIModeServiceImplInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqWcmCoreImplAuthoringUIModeServiceImplInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqWcmCoreImplAuthoringUIModeServiceImplInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqWcmCoreImplAuthoringUIModeServiceImplInfoProperties :: Maybe ComDayCqWcmCoreImplAuthoringUIModeServiceImplProperties
      <*> arbitrary -- comDayCqWcmCoreImplAuthoringUIModeServiceImplInfoAdditionalProperties :: Maybe Text
      <*> arbitrary -- comDayCqWcmCoreImplAuthoringUIModeServiceImplInfoBundleLocation :: Maybe Text
      <*> arbitrary -- comDayCqWcmCoreImplAuthoringUIModeServiceImplInfoServiceLocation :: Maybe Text
    
instance Arbitrary ComDayCqWcmCoreImplAuthoringUIModeServiceImplProperties where
  arbitrary =
    ComDayCqWcmCoreImplAuthoringUIModeServiceImplProperties
      <$> arbitrary -- comDayCqWcmCoreImplAuthoringUIModeServiceImplPropertiesAuthoringUiModeServiceDefault :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComDayCqWcmCoreImplCommandsWCMCommandServletInfo where
  arbitrary =
    ComDayCqWcmCoreImplCommandsWCMCommandServletInfo
      <$> arbitrary -- comDayCqWcmCoreImplCommandsWCMCommandServletInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqWcmCoreImplCommandsWCMCommandServletInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqWcmCoreImplCommandsWCMCommandServletInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqWcmCoreImplCommandsWCMCommandServletInfoProperties :: Maybe ComDayCqWcmCoreImplCommandsWCMCommandServletProperties
    
instance Arbitrary ComDayCqWcmCoreImplCommandsWCMCommandServletProperties where
  arbitrary =
    ComDayCqWcmCoreImplCommandsWCMCommandServletProperties
      <$> arbitrary -- comDayCqWcmCoreImplCommandsWCMCommandServletPropertiesWcmcommandservletDeleteWhitelist :: Maybe ConfigNodePropertyArray
    
instance Arbitrary ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplInfo where
  arbitrary =
    ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplInfo
      <$> arbitrary -- comDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplInfoProperties :: Maybe ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties
    
instance Arbitrary ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties where
  arbitrary =
    ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties
      <$> arbitrary -- comDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplPropertiesDimDefaultMode :: Maybe ConfigNodePropertyDropDown
      <*> arbitrary -- comDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplPropertiesDimAppcacheEnabled :: Maybe ConfigNodePropertyBoolean
    
instance Arbitrary ComDayCqWcmCoreImplEventPageEventAuditListenerInfo where
  arbitrary =
    ComDayCqWcmCoreImplEventPageEventAuditListenerInfo
      <$> arbitrary -- comDayCqWcmCoreImplEventPageEventAuditListenerInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqWcmCoreImplEventPageEventAuditListenerInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqWcmCoreImplEventPageEventAuditListenerInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqWcmCoreImplEventPageEventAuditListenerInfoProperties :: Maybe ComDayCqWcmCoreImplEventPageEventAuditListenerProperties
      <*> arbitrary -- comDayCqWcmCoreImplEventPageEventAuditListenerInfoBundleLocation :: Maybe Text
      <*> arbitrary -- comDayCqWcmCoreImplEventPageEventAuditListenerInfoServiceLocation :: Maybe Text
    
instance Arbitrary ComDayCqWcmCoreImplEventPageEventAuditListenerProperties where
  arbitrary =
    ComDayCqWcmCoreImplEventPageEventAuditListenerProperties
      <$> arbitrary -- comDayCqWcmCoreImplEventPageEventAuditListenerPropertiesConfigured :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComDayCqWcmCoreImplEventPagePostProcessorInfo where
  arbitrary =
    ComDayCqWcmCoreImplEventPagePostProcessorInfo
      <$> arbitrary -- comDayCqWcmCoreImplEventPagePostProcessorInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqWcmCoreImplEventPagePostProcessorInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqWcmCoreImplEventPagePostProcessorInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqWcmCoreImplEventPagePostProcessorInfoProperties :: Maybe ComDayCqWcmCoreImplEventPagePostProcessorProperties
    
instance Arbitrary ComDayCqWcmCoreImplEventPagePostProcessorProperties where
  arbitrary =
    ComDayCqWcmCoreImplEventPagePostProcessorProperties
      <$> arbitrary -- comDayCqWcmCoreImplEventPagePostProcessorPropertiesPaths :: Maybe ConfigNodePropertyArray
    
instance Arbitrary ComDayCqWcmCoreImplEventRepositoryChangeEventListenerInfo where
  arbitrary =
    ComDayCqWcmCoreImplEventRepositoryChangeEventListenerInfo
      <$> arbitrary -- comDayCqWcmCoreImplEventRepositoryChangeEventListenerInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqWcmCoreImplEventRepositoryChangeEventListenerInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqWcmCoreImplEventRepositoryChangeEventListenerInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqWcmCoreImplEventRepositoryChangeEventListenerInfoProperties :: Maybe ComDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties
    
instance Arbitrary ComDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties where
  arbitrary =
    ComDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties
      <$> arbitrary -- comDayCqWcmCoreImplEventRepositoryChangeEventListenerPropertiesPaths :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comDayCqWcmCoreImplEventRepositoryChangeEventListenerPropertiesExcludedPaths :: Maybe ConfigNodePropertyArray
    
instance Arbitrary ComDayCqWcmCoreImplEventTemplatePostProcessorInfo where
  arbitrary =
    ComDayCqWcmCoreImplEventTemplatePostProcessorInfo
      <$> arbitrary -- comDayCqWcmCoreImplEventTemplatePostProcessorInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqWcmCoreImplEventTemplatePostProcessorInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqWcmCoreImplEventTemplatePostProcessorInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqWcmCoreImplEventTemplatePostProcessorInfoProperties :: Maybe ComDayCqWcmCoreImplEventTemplatePostProcessorProperties
    
instance Arbitrary ComDayCqWcmCoreImplEventTemplatePostProcessorProperties where
  arbitrary =
    ComDayCqWcmCoreImplEventTemplatePostProcessorProperties
      <$> arbitrary -- comDayCqWcmCoreImplEventTemplatePostProcessorPropertiesPaths :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComDayCqWcmCoreImplLanguageManagerImplInfo where
  arbitrary =
    ComDayCqWcmCoreImplLanguageManagerImplInfo
      <$> arbitrary -- comDayCqWcmCoreImplLanguageManagerImplInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqWcmCoreImplLanguageManagerImplInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqWcmCoreImplLanguageManagerImplInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqWcmCoreImplLanguageManagerImplInfoProperties :: Maybe ComDayCqWcmCoreImplLanguageManagerImplProperties
    
instance Arbitrary ComDayCqWcmCoreImplLanguageManagerImplProperties where
  arbitrary =
    ComDayCqWcmCoreImplLanguageManagerImplProperties
      <$> arbitrary -- comDayCqWcmCoreImplLanguageManagerImplPropertiesLangmgrListPath :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comDayCqWcmCoreImplLanguageManagerImplPropertiesLangmgrCountryDefault :: Maybe ConfigNodePropertyArray
    
instance Arbitrary ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplInfo where
  arbitrary =
    ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplInfo
      <$> arbitrary -- comDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplInfoProperties :: Maybe ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties
    
instance Arbitrary ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties where
  arbitrary =
    ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties
      <$> arbitrary -- comDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplPropertiesLinkExpiredPrefix :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplPropertiesLinkExpiredRemove :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- comDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplPropertiesLinkExpiredSuffix :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplPropertiesLinkInvalidPrefix :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplPropertiesLinkInvalidRemove :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- comDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplPropertiesLinkInvalidSuffix :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplPropertiesLinkPredatedPrefix :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplPropertiesLinkPredatedRemove :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- comDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplPropertiesLinkPredatedSuffix :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplPropertiesLinkWcmmodes :: Maybe ConfigNodePropertyArray
    
instance Arbitrary ComDayCqWcmCoreImplPagePageInfoAggregatorImplInfo where
  arbitrary =
    ComDayCqWcmCoreImplPagePageInfoAggregatorImplInfo
      <$> arbitrary -- comDayCqWcmCoreImplPagePageInfoAggregatorImplInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqWcmCoreImplPagePageInfoAggregatorImplInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqWcmCoreImplPagePageInfoAggregatorImplInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqWcmCoreImplPagePageInfoAggregatorImplInfoProperties :: Maybe ComDayCqWcmCoreImplPagePageInfoAggregatorImplProperties
    
instance Arbitrary ComDayCqWcmCoreImplPagePageInfoAggregatorImplProperties where
  arbitrary =
    ComDayCqWcmCoreImplPagePageInfoAggregatorImplProperties
      <$> arbitrary -- comDayCqWcmCoreImplPagePageInfoAggregatorImplPropertiesPageInfoProviderPropertyRegexDefault :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comDayCqWcmCoreImplPagePageInfoAggregatorImplPropertiesPageInfoProviderPropertyName :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComDayCqWcmCoreImplPagePageManagerFactoryImplInfo where
  arbitrary =
    ComDayCqWcmCoreImplPagePageManagerFactoryImplInfo
      <$> arbitrary -- comDayCqWcmCoreImplPagePageManagerFactoryImplInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqWcmCoreImplPagePageManagerFactoryImplInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqWcmCoreImplPagePageManagerFactoryImplInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqWcmCoreImplPagePageManagerFactoryImplInfoProperties :: Maybe ComDayCqWcmCoreImplPagePageManagerFactoryImplProperties
    
instance Arbitrary ComDayCqWcmCoreImplPagePageManagerFactoryImplProperties where
  arbitrary =
    ComDayCqWcmCoreImplPagePageManagerFactoryImplProperties
      <$> arbitrary -- comDayCqWcmCoreImplPagePageManagerFactoryImplPropertiesIllegalCharMapping :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comDayCqWcmCoreImplPagePageManagerFactoryImplPropertiesPageSubTreeActivationCheck :: Maybe ConfigNodePropertyBoolean
    
instance Arbitrary ComDayCqWcmCoreImplReferencesContentContentReferenceConfigInfo where
  arbitrary =
    ComDayCqWcmCoreImplReferencesContentContentReferenceConfigInfo
      <$> arbitrary -- comDayCqWcmCoreImplReferencesContentContentReferenceConfigInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqWcmCoreImplReferencesContentContentReferenceConfigInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqWcmCoreImplReferencesContentContentReferenceConfigInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqWcmCoreImplReferencesContentContentReferenceConfigInfoProperties :: Maybe ComDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties
    
instance Arbitrary ComDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties where
  arbitrary =
    ComDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties
      <$> arbitrary -- comDayCqWcmCoreImplReferencesContentContentReferenceConfigPropertiesContentReferenceConfigResourceTypes :: Maybe ConfigNodePropertyArray
    
instance Arbitrary ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerInfo where
  arbitrary =
    ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerInfo
      <$> arbitrary -- comDayCqWcmCoreImplServletsContentfinderAssetViewHandlerInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqWcmCoreImplServletsContentfinderAssetViewHandlerInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqWcmCoreImplServletsContentfinderAssetViewHandlerInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqWcmCoreImplServletsContentfinderAssetViewHandlerInfoProperties :: Maybe ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties
    
instance Arbitrary ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties where
  arbitrary =
    ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties
      <$> arbitrary -- comDayCqWcmCoreImplServletsContentfinderAssetViewHandlerPropertiesDamShowexpired :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- comDayCqWcmCoreImplServletsContentfinderAssetViewHandlerPropertiesDamShowhidden :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- comDayCqWcmCoreImplServletsContentfinderAssetViewHandlerPropertiesTagTitleSearch :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- comDayCqWcmCoreImplServletsContentfinderAssetViewHandlerPropertiesGuessTotal :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comDayCqWcmCoreImplServletsContentfinderAssetViewHandlerPropertiesDamExpiryProperty :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieInfo where
  arbitrary =
    ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieInfo
      <$> arbitrary -- comDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieInfoProperties :: Maybe ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieProperties
    
instance Arbitrary ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieProperties where
  arbitrary =
    ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieProperties
      <$> arbitrary -- comDayCqWcmCoreImplServletsContentfinderConnectorConnectorViePropertiesItemResourceTypes :: Maybe ConfigNodePropertyArray
    
instance Arbitrary ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerInfo where
  arbitrary =
    ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerInfo
      <$> arbitrary -- comDayCqWcmCoreImplServletsContentfinderPageViewHandlerInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqWcmCoreImplServletsContentfinderPageViewHandlerInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqWcmCoreImplServletsContentfinderPageViewHandlerInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqWcmCoreImplServletsContentfinderPageViewHandlerInfoProperties :: Maybe ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties
    
instance Arbitrary ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties where
  arbitrary =
    ComDayCqWcmCoreImplServletsContentfinderPageViewHandlerProperties
      <$> arbitrary -- comDayCqWcmCoreImplServletsContentfinderPageViewHandlerPropertiesGuessTotal :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comDayCqWcmCoreImplServletsContentfinderPageViewHandlerPropertiesTagTitleSearch :: Maybe ConfigNodePropertyBoolean
    
instance Arbitrary ComDayCqWcmCoreImplServletsFindReplaceServletInfo where
  arbitrary =
    ComDayCqWcmCoreImplServletsFindReplaceServletInfo
      <$> arbitrary -- comDayCqWcmCoreImplServletsFindReplaceServletInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqWcmCoreImplServletsFindReplaceServletInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqWcmCoreImplServletsFindReplaceServletInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqWcmCoreImplServletsFindReplaceServletInfoProperties :: Maybe ComDayCqWcmCoreImplServletsFindReplaceServletProperties
    
instance Arbitrary ComDayCqWcmCoreImplServletsFindReplaceServletProperties where
  arbitrary =
    ComDayCqWcmCoreImplServletsFindReplaceServletProperties
      <$> arbitrary -- comDayCqWcmCoreImplServletsFindReplaceServletPropertiesScope :: Maybe ConfigNodePropertyArray
    
instance Arbitrary ComDayCqWcmCoreImplServletsReferenceSearchServletInfo where
  arbitrary =
    ComDayCqWcmCoreImplServletsReferenceSearchServletInfo
      <$> arbitrary -- comDayCqWcmCoreImplServletsReferenceSearchServletInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqWcmCoreImplServletsReferenceSearchServletInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqWcmCoreImplServletsReferenceSearchServletInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqWcmCoreImplServletsReferenceSearchServletInfoProperties :: Maybe ComDayCqWcmCoreImplServletsReferenceSearchServletProperties
    
instance Arbitrary ComDayCqWcmCoreImplServletsReferenceSearchServletProperties where
  arbitrary =
    ComDayCqWcmCoreImplServletsReferenceSearchServletProperties
      <$> arbitrary -- comDayCqWcmCoreImplServletsReferenceSearchServletPropertiesReferencesearchservletMaxReferencesPerPage :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comDayCqWcmCoreImplServletsReferenceSearchServletPropertiesReferencesearchservletMaxPages :: Maybe ConfigNodePropertyInteger
    
instance Arbitrary ComDayCqWcmCoreImplServletsThumbnailServletInfo where
  arbitrary =
    ComDayCqWcmCoreImplServletsThumbnailServletInfo
      <$> arbitrary -- comDayCqWcmCoreImplServletsThumbnailServletInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqWcmCoreImplServletsThumbnailServletInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqWcmCoreImplServletsThumbnailServletInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqWcmCoreImplServletsThumbnailServletInfoProperties :: Maybe ComDayCqWcmCoreImplServletsThumbnailServletProperties
    
instance Arbitrary ComDayCqWcmCoreImplServletsThumbnailServletProperties where
  arbitrary =
    ComDayCqWcmCoreImplServletsThumbnailServletProperties
      <$> arbitrary -- comDayCqWcmCoreImplServletsThumbnailServletPropertiesWorkspace :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comDayCqWcmCoreImplServletsThumbnailServletPropertiesDimensions :: Maybe ConfigNodePropertyArray
    
instance Arbitrary ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorInfo where
  arbitrary =
    ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorInfo
      <$> arbitrary -- comDayCqWcmCoreImplUtilsDefaultPageNameValidatorInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqWcmCoreImplUtilsDefaultPageNameValidatorInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqWcmCoreImplUtilsDefaultPageNameValidatorInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqWcmCoreImplUtilsDefaultPageNameValidatorInfoProperties :: Maybe ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties
    
instance Arbitrary ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties where
  arbitrary =
    ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties
      <$> arbitrary -- comDayCqWcmCoreImplUtilsDefaultPageNameValidatorPropertiesNonValidChars :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComDayCqWcmCoreImplVariantsPageVariantsProviderImplInfo where
  arbitrary =
    ComDayCqWcmCoreImplVariantsPageVariantsProviderImplInfo
      <$> arbitrary -- comDayCqWcmCoreImplVariantsPageVariantsProviderImplInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqWcmCoreImplVariantsPageVariantsProviderImplInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqWcmCoreImplVariantsPageVariantsProviderImplInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqWcmCoreImplVariantsPageVariantsProviderImplInfoProperties :: Maybe ComDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties
      <*> arbitrary -- comDayCqWcmCoreImplVariantsPageVariantsProviderImplInfoBundleLocation :: Maybe Text
      <*> arbitrary -- comDayCqWcmCoreImplVariantsPageVariantsProviderImplInfoServiceLocation :: Maybe Text
    
instance Arbitrary ComDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties where
  arbitrary =
    ComDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties
      <$> arbitrary -- comDayCqWcmCoreImplVariantsPageVariantsProviderImplPropertiesDefaultExternalizerDomain :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComDayCqWcmCoreImplVersionManagerImplInfo where
  arbitrary =
    ComDayCqWcmCoreImplVersionManagerImplInfo
      <$> arbitrary -- comDayCqWcmCoreImplVersionManagerImplInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqWcmCoreImplVersionManagerImplInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqWcmCoreImplVersionManagerImplInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqWcmCoreImplVersionManagerImplInfoProperties :: Maybe ComDayCqWcmCoreImplVersionManagerImplProperties
    
instance Arbitrary ComDayCqWcmCoreImplVersionManagerImplProperties where
  arbitrary =
    ComDayCqWcmCoreImplVersionManagerImplProperties
      <$> arbitrary -- comDayCqWcmCoreImplVersionManagerImplPropertiesVersionmanagerCreateVersionOnActivation :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- comDayCqWcmCoreImplVersionManagerImplPropertiesVersionmanagerPurgingEnabled :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- comDayCqWcmCoreImplVersionManagerImplPropertiesVersionmanagerPurgePaths :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comDayCqWcmCoreImplVersionManagerImplPropertiesVersionmanagerIvPaths :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comDayCqWcmCoreImplVersionManagerImplPropertiesVersionmanagerMaxAgeDays :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comDayCqWcmCoreImplVersionManagerImplPropertiesVersionmanagerMaxNumberVersions :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comDayCqWcmCoreImplVersionManagerImplPropertiesVersionmanagerMinNumberVersions :: Maybe ConfigNodePropertyInteger
    
instance Arbitrary ComDayCqWcmCoreImplVersionPurgeTaskInfo where
  arbitrary =
    ComDayCqWcmCoreImplVersionPurgeTaskInfo
      <$> arbitrary -- comDayCqWcmCoreImplVersionPurgeTaskInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqWcmCoreImplVersionPurgeTaskInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqWcmCoreImplVersionPurgeTaskInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqWcmCoreImplVersionPurgeTaskInfoProperties :: Maybe ComDayCqWcmCoreImplVersionPurgeTaskProperties
    
instance Arbitrary ComDayCqWcmCoreImplVersionPurgeTaskProperties where
  arbitrary =
    ComDayCqWcmCoreImplVersionPurgeTaskProperties
      <$> arbitrary -- comDayCqWcmCoreImplVersionPurgeTaskPropertiesVersionpurgePaths :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comDayCqWcmCoreImplVersionPurgeTaskPropertiesVersionpurgeRecursive :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- comDayCqWcmCoreImplVersionPurgeTaskPropertiesVersionpurgeMaxVersions :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comDayCqWcmCoreImplVersionPurgeTaskPropertiesVersionpurgeMinVersions :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comDayCqWcmCoreImplVersionPurgeTaskPropertiesVersionpurgeMaxAgeDays :: Maybe ConfigNodePropertyInteger
    
instance Arbitrary ComDayCqWcmCoreImplWCMDebugFilterInfo where
  arbitrary =
    ComDayCqWcmCoreImplWCMDebugFilterInfo
      <$> arbitrary -- comDayCqWcmCoreImplWCMDebugFilterInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqWcmCoreImplWCMDebugFilterInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqWcmCoreImplWCMDebugFilterInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqWcmCoreImplWCMDebugFilterInfoProperties :: Maybe ComDayCqWcmCoreImplWCMDebugFilterProperties
      <*> arbitrary -- comDayCqWcmCoreImplWCMDebugFilterInfoBundleLocation :: Maybe Text
      <*> arbitrary -- comDayCqWcmCoreImplWCMDebugFilterInfoServiceLocation :: Maybe Text
    
instance Arbitrary ComDayCqWcmCoreImplWCMDebugFilterProperties where
  arbitrary =
    ComDayCqWcmCoreImplWCMDebugFilterProperties
      <$> arbitrary -- comDayCqWcmCoreImplWCMDebugFilterPropertiesWcmdbgfilterEnabled :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- comDayCqWcmCoreImplWCMDebugFilterPropertiesWcmdbgfilterJspDebug :: Maybe ConfigNodePropertyBoolean
    
instance Arbitrary ComDayCqWcmCoreImplWCMDeveloperModeFilterInfo where
  arbitrary =
    ComDayCqWcmCoreImplWCMDeveloperModeFilterInfo
      <$> arbitrary -- comDayCqWcmCoreImplWCMDeveloperModeFilterInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqWcmCoreImplWCMDeveloperModeFilterInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqWcmCoreImplWCMDeveloperModeFilterInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqWcmCoreImplWCMDeveloperModeFilterInfoProperties :: Maybe ComDayCqWcmCoreImplWCMDeveloperModeFilterProperties
      <*> arbitrary -- comDayCqWcmCoreImplWCMDeveloperModeFilterInfoAdditionalProperties :: Maybe Text
      <*> arbitrary -- comDayCqWcmCoreImplWCMDeveloperModeFilterInfoBundleLocation :: Maybe Text
      <*> arbitrary -- comDayCqWcmCoreImplWCMDeveloperModeFilterInfoServiceLocation :: Maybe Text
    
instance Arbitrary ComDayCqWcmCoreImplWCMDeveloperModeFilterProperties where
  arbitrary =
    ComDayCqWcmCoreImplWCMDeveloperModeFilterProperties
      <$> arbitrary -- comDayCqWcmCoreImplWCMDeveloperModeFilterPropertiesWcmdevmodefilterEnabled :: Maybe ConfigNodePropertyBoolean
    
instance Arbitrary ComDayCqWcmCoreImplWarpTimeWarpFilterInfo where
  arbitrary =
    ComDayCqWcmCoreImplWarpTimeWarpFilterInfo
      <$> arbitrary -- comDayCqWcmCoreImplWarpTimeWarpFilterInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqWcmCoreImplWarpTimeWarpFilterInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqWcmCoreImplWarpTimeWarpFilterInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqWcmCoreImplWarpTimeWarpFilterInfoProperties :: Maybe ComDayCqWcmCoreImplWarpTimeWarpFilterProperties
      <*> arbitrary -- comDayCqWcmCoreImplWarpTimeWarpFilterInfoBundleLocation :: Maybe Text
      <*> arbitrary -- comDayCqWcmCoreImplWarpTimeWarpFilterInfoServiceLocation :: Maybe Text
    
instance Arbitrary ComDayCqWcmCoreImplWarpTimeWarpFilterProperties where
  arbitrary =
    ComDayCqWcmCoreImplWarpTimeWarpFilterProperties
      <$> arbitrary -- comDayCqWcmCoreImplWarpTimeWarpFilterPropertiesFilterOrder :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comDayCqWcmCoreImplWarpTimeWarpFilterPropertiesFilterScope :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComDayCqWcmCoreMvtMVTStatisticsImplInfo where
  arbitrary =
    ComDayCqWcmCoreMvtMVTStatisticsImplInfo
      <$> arbitrary -- comDayCqWcmCoreMvtMVTStatisticsImplInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqWcmCoreMvtMVTStatisticsImplInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqWcmCoreMvtMVTStatisticsImplInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqWcmCoreMvtMVTStatisticsImplInfoProperties :: Maybe ComDayCqWcmCoreMvtMVTStatisticsImplProperties
      <*> arbitrary -- comDayCqWcmCoreMvtMVTStatisticsImplInfoBundleLocation :: Maybe Text
      <*> arbitrary -- comDayCqWcmCoreMvtMVTStatisticsImplInfoServiceLocation :: Maybe Text
    
instance Arbitrary ComDayCqWcmCoreMvtMVTStatisticsImplProperties where
  arbitrary =
    ComDayCqWcmCoreMvtMVTStatisticsImplProperties
      <$> arbitrary -- comDayCqWcmCoreMvtMVTStatisticsImplPropertiesMvtstatisticsTrackingurl :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComDayCqWcmCoreStatsPageViewStatisticsImplInfo where
  arbitrary =
    ComDayCqWcmCoreStatsPageViewStatisticsImplInfo
      <$> arbitrary -- comDayCqWcmCoreStatsPageViewStatisticsImplInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqWcmCoreStatsPageViewStatisticsImplInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqWcmCoreStatsPageViewStatisticsImplInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqWcmCoreStatsPageViewStatisticsImplInfoProperties :: Maybe ComDayCqWcmCoreStatsPageViewStatisticsImplProperties
      <*> arbitrary -- comDayCqWcmCoreStatsPageViewStatisticsImplInfoBundleLocation :: Maybe Text
      <*> arbitrary -- comDayCqWcmCoreStatsPageViewStatisticsImplInfoServiceLocation :: Maybe Text
    
instance Arbitrary ComDayCqWcmCoreStatsPageViewStatisticsImplProperties where
  arbitrary =
    ComDayCqWcmCoreStatsPageViewStatisticsImplProperties
      <$> arbitrary -- comDayCqWcmCoreStatsPageViewStatisticsImplPropertiesPageviewstatisticsTrackingurl :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comDayCqWcmCoreStatsPageViewStatisticsImplPropertiesPageviewstatisticsTrackingscriptEnabled :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComDayCqWcmCoreWCMRequestFilterInfo where
  arbitrary =
    ComDayCqWcmCoreWCMRequestFilterInfo
      <$> arbitrary -- comDayCqWcmCoreWCMRequestFilterInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqWcmCoreWCMRequestFilterInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqWcmCoreWCMRequestFilterInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqWcmCoreWCMRequestFilterInfoProperties :: Maybe ComDayCqWcmCoreWCMRequestFilterProperties
      <*> arbitrary -- comDayCqWcmCoreWCMRequestFilterInfoBundleLocation :: Maybe Text
      <*> arbitrary -- comDayCqWcmCoreWCMRequestFilterInfoServiceLocation :: Maybe Text
    
instance Arbitrary ComDayCqWcmCoreWCMRequestFilterProperties where
  arbitrary =
    ComDayCqWcmCoreWCMRequestFilterProperties
      <$> arbitrary -- comDayCqWcmCoreWCMRequestFilterPropertiesWcmfilterMode :: Maybe ConfigNodePropertyDropDown
    
instance Arbitrary ComDayCqWcmDesignimporterDesignPackageImporterInfo where
  arbitrary =
    ComDayCqWcmDesignimporterDesignPackageImporterInfo
      <$> arbitrary -- comDayCqWcmDesignimporterDesignPackageImporterInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqWcmDesignimporterDesignPackageImporterInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqWcmDesignimporterDesignPackageImporterInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqWcmDesignimporterDesignPackageImporterInfoProperties :: Maybe ComDayCqWcmDesignimporterDesignPackageImporterProperties
    
instance Arbitrary ComDayCqWcmDesignimporterDesignPackageImporterProperties where
  arbitrary =
    ComDayCqWcmDesignimporterDesignPackageImporterProperties
      <$> arbitrary -- comDayCqWcmDesignimporterDesignPackageImporterPropertiesExtractFilter :: Maybe ConfigNodePropertyArray
    
instance Arbitrary ComDayCqWcmDesignimporterImplCanvasBuilderImplInfo where
  arbitrary =
    ComDayCqWcmDesignimporterImplCanvasBuilderImplInfo
      <$> arbitrary -- comDayCqWcmDesignimporterImplCanvasBuilderImplInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqWcmDesignimporterImplCanvasBuilderImplInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqWcmDesignimporterImplCanvasBuilderImplInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqWcmDesignimporterImplCanvasBuilderImplInfoProperties :: Maybe ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties
    
instance Arbitrary ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties where
  arbitrary =
    ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties
      <$> arbitrary -- comDayCqWcmDesignimporterImplCanvasBuilderImplPropertiesFilepattern :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comDayCqWcmDesignimporterImplCanvasBuilderImplPropertiesBuildPageNodes :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- comDayCqWcmDesignimporterImplCanvasBuilderImplPropertiesBuildClientLibs :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- comDayCqWcmDesignimporterImplCanvasBuilderImplPropertiesBuildCanvasComponent :: Maybe ConfigNodePropertyBoolean
    
instance Arbitrary ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerInfo where
  arbitrary =
    ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerInfo
      <$> arbitrary -- comDayCqWcmDesignimporterImplCanvasPageDeleteHandlerInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqWcmDesignimporterImplCanvasPageDeleteHandlerInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqWcmDesignimporterImplCanvasPageDeleteHandlerInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqWcmDesignimporterImplCanvasPageDeleteHandlerInfoProperties :: Maybe ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties
    
instance Arbitrary ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties where
  arbitrary =
    ComDayCqWcmDesignimporterImplCanvasPageDeleteHandlerProperties
      <$> arbitrary -- comDayCqWcmDesignimporterImplCanvasPageDeleteHandlerPropertiesMinThreadPoolSize :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comDayCqWcmDesignimporterImplCanvasPageDeleteHandlerPropertiesMaxThreadPoolSize :: Maybe ConfigNodePropertyInteger
    
instance Arbitrary ComDayCqWcmDesignimporterImplEntryPreprocessorImplInfo where
  arbitrary =
    ComDayCqWcmDesignimporterImplEntryPreprocessorImplInfo
      <$> arbitrary -- comDayCqWcmDesignimporterImplEntryPreprocessorImplInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqWcmDesignimporterImplEntryPreprocessorImplInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqWcmDesignimporterImplEntryPreprocessorImplInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqWcmDesignimporterImplEntryPreprocessorImplInfoProperties :: Maybe ComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties
    
instance Arbitrary ComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties where
  arbitrary =
    ComDayCqWcmDesignimporterImplEntryPreprocessorImplProperties
      <$> arbitrary -- comDayCqWcmDesignimporterImplEntryPreprocessorImplPropertiesSearchPattern :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comDayCqWcmDesignimporterImplEntryPreprocessorImplPropertiesReplacePattern :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplInfo where
  arbitrary =
    ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplInfo
      <$> arbitrary -- comDayCqWcmDesignimporterImplMobileCanvasBuilderImplInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqWcmDesignimporterImplMobileCanvasBuilderImplInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqWcmDesignimporterImplMobileCanvasBuilderImplInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqWcmDesignimporterImplMobileCanvasBuilderImplInfoProperties :: Maybe ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties
    
instance Arbitrary ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties where
  arbitrary =
    ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties
      <$> arbitrary -- comDayCqWcmDesignimporterImplMobileCanvasBuilderImplPropertiesFilepattern :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comDayCqWcmDesignimporterImplMobileCanvasBuilderImplPropertiesDeviceGroups :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comDayCqWcmDesignimporterImplMobileCanvasBuilderImplPropertiesBuildPageNodes :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- comDayCqWcmDesignimporterImplMobileCanvasBuilderImplPropertiesBuildClientLibs :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- comDayCqWcmDesignimporterImplMobileCanvasBuilderImplPropertiesBuildCanvasComponent :: Maybe ConfigNodePropertyBoolean
    
instance Arbitrary ComDayCqWcmDesignimporterParserTaghandlersFactoryCanvasComponeInfo where
  arbitrary =
    ComDayCqWcmDesignimporterParserTaghandlersFactoryCanvasComponeInfo
      <$> arbitrary -- comDayCqWcmDesignimporterParserTaghandlersFactoryCanvasComponeInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqWcmDesignimporterParserTaghandlersFactoryCanvasComponeInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqWcmDesignimporterParserTaghandlersFactoryCanvasComponeInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqWcmDesignimporterParserTaghandlersFactoryCanvasComponeInfoProperties :: Maybe ComDayCqWcmDesignimporterParserTaghandlersFactoryCanvasComponeProperties
    
instance Arbitrary ComDayCqWcmDesignimporterParserTaghandlersFactoryCanvasComponeProperties where
  arbitrary =
    ComDayCqWcmDesignimporterParserTaghandlersFactoryCanvasComponeProperties
      <$> arbitrary -- comDayCqWcmDesignimporterParserTaghandlersFactoryCanvasComponePropertiesServiceRanking :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comDayCqWcmDesignimporterParserTaghandlersFactoryCanvasComponePropertiesTagpattern :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultComponInfo where
  arbitrary =
    ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultComponInfo
      <$> arbitrary -- comDayCqWcmDesignimporterParserTaghandlersFactoryDefaultComponInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqWcmDesignimporterParserTaghandlersFactoryDefaultComponInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqWcmDesignimporterParserTaghandlersFactoryDefaultComponInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqWcmDesignimporterParserTaghandlersFactoryDefaultComponInfoProperties :: Maybe ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultComponProperties
    
instance Arbitrary ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultComponProperties where
  arbitrary =
    ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultComponProperties
      <$> arbitrary -- comDayCqWcmDesignimporterParserTaghandlersFactoryDefaultComponPropertiesServiceRanking :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comDayCqWcmDesignimporterParserTaghandlersFactoryDefaultComponPropertiesTagpattern :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultTagHanInfo where
  arbitrary =
    ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultTagHanInfo
      <$> arbitrary -- comDayCqWcmDesignimporterParserTaghandlersFactoryDefaultTagHanInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqWcmDesignimporterParserTaghandlersFactoryDefaultTagHanInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqWcmDesignimporterParserTaghandlersFactoryDefaultTagHanInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqWcmDesignimporterParserTaghandlersFactoryDefaultTagHanInfoProperties :: Maybe ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultTagHanProperties
    
instance Arbitrary ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultTagHanProperties where
  arbitrary =
    ComDayCqWcmDesignimporterParserTaghandlersFactoryDefaultTagHanProperties
      <$> arbitrary -- comDayCqWcmDesignimporterParserTaghandlersFactoryDefaultTagHanPropertiesServiceRanking :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comDayCqWcmDesignimporterParserTaghandlersFactoryDefaultTagHanPropertiesTagpattern :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComDayCqWcmDesignimporterParserTaghandlersFactoryHeadTagHandleInfo where
  arbitrary =
    ComDayCqWcmDesignimporterParserTaghandlersFactoryHeadTagHandleInfo
      <$> arbitrary -- comDayCqWcmDesignimporterParserTaghandlersFactoryHeadTagHandleInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqWcmDesignimporterParserTaghandlersFactoryHeadTagHandleInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqWcmDesignimporterParserTaghandlersFactoryHeadTagHandleInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqWcmDesignimporterParserTaghandlersFactoryHeadTagHandleInfoProperties :: Maybe ComDayCqWcmDesignimporterParserTaghandlersFactoryHeadTagHandleProperties
    
instance Arbitrary ComDayCqWcmDesignimporterParserTaghandlersFactoryHeadTagHandleProperties where
  arbitrary =
    ComDayCqWcmDesignimporterParserTaghandlersFactoryHeadTagHandleProperties
      <$> arbitrary -- comDayCqWcmDesignimporterParserTaghandlersFactoryHeadTagHandlePropertiesServiceRanking :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comDayCqWcmDesignimporterParserTaghandlersFactoryHeadTagHandlePropertiesTagpattern :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComDayCqWcmDesignimporterParserTaghandlersFactoryIFrameTagHandInfo where
  arbitrary =
    ComDayCqWcmDesignimporterParserTaghandlersFactoryIFrameTagHandInfo
      <$> arbitrary -- comDayCqWcmDesignimporterParserTaghandlersFactoryIFrameTagHandInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqWcmDesignimporterParserTaghandlersFactoryIFrameTagHandInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqWcmDesignimporterParserTaghandlersFactoryIFrameTagHandInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqWcmDesignimporterParserTaghandlersFactoryIFrameTagHandInfoProperties :: Maybe ComDayCqWcmDesignimporterParserTaghandlersFactoryIFrameTagHandProperties
    
instance Arbitrary ComDayCqWcmDesignimporterParserTaghandlersFactoryIFrameTagHandProperties where
  arbitrary =
    ComDayCqWcmDesignimporterParserTaghandlersFactoryIFrameTagHandProperties
      <$> arbitrary -- comDayCqWcmDesignimporterParserTaghandlersFactoryIFrameTagHandPropertiesServiceRanking :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comDayCqWcmDesignimporterParserTaghandlersFactoryIFrameTagHandPropertiesTagpattern :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComDayCqWcmDesignimporterParserTaghandlersFactoryImageComponenInfo where
  arbitrary =
    ComDayCqWcmDesignimporterParserTaghandlersFactoryImageComponenInfo
      <$> arbitrary -- comDayCqWcmDesignimporterParserTaghandlersFactoryImageComponenInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqWcmDesignimporterParserTaghandlersFactoryImageComponenInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqWcmDesignimporterParserTaghandlersFactoryImageComponenInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqWcmDesignimporterParserTaghandlersFactoryImageComponenInfoProperties :: Maybe ComDayCqWcmDesignimporterParserTaghandlersFactoryImageComponenProperties
    
instance Arbitrary ComDayCqWcmDesignimporterParserTaghandlersFactoryImageComponenProperties where
  arbitrary =
    ComDayCqWcmDesignimporterParserTaghandlersFactoryImageComponenProperties
      <$> arbitrary -- comDayCqWcmDesignimporterParserTaghandlersFactoryImageComponenPropertiesServiceRanking :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comDayCqWcmDesignimporterParserTaghandlersFactoryImageComponenPropertiesTagpattern :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comDayCqWcmDesignimporterParserTaghandlersFactoryImageComponenPropertiesComponentResourceType :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandlerInfo where
  arbitrary =
    ComDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandlerInfo
      <$> arbitrary -- comDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandlerInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandlerInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandlerInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandlerInfoProperties :: Maybe ComDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandlerProperties
    
instance Arbitrary ComDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandlerProperties where
  arbitrary =
    ComDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandlerProperties
      <$> arbitrary -- comDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandlerPropertiesServiceRanking :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comDayCqWcmDesignimporterParserTaghandlersFactoryImgTagHandlerPropertiesTagpattern :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComDayCqWcmDesignimporterParserTaghandlersFactoryInlineScriptTInfo where
  arbitrary =
    ComDayCqWcmDesignimporterParserTaghandlersFactoryInlineScriptTInfo
      <$> arbitrary -- comDayCqWcmDesignimporterParserTaghandlersFactoryInlineScriptTInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqWcmDesignimporterParserTaghandlersFactoryInlineScriptTInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqWcmDesignimporterParserTaghandlersFactoryInlineScriptTInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqWcmDesignimporterParserTaghandlersFactoryInlineScriptTInfoProperties :: Maybe ComDayCqWcmDesignimporterParserTaghandlersFactoryInlineScriptTProperties
    
instance Arbitrary ComDayCqWcmDesignimporterParserTaghandlersFactoryInlineScriptTProperties where
  arbitrary =
    ComDayCqWcmDesignimporterParserTaghandlersFactoryInlineScriptTProperties
      <$> arbitrary -- comDayCqWcmDesignimporterParserTaghandlersFactoryInlineScriptTPropertiesServiceRanking :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comDayCqWcmDesignimporterParserTaghandlersFactoryInlineScriptTPropertiesTagpattern :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComDayCqWcmDesignimporterParserTaghandlersFactoryLinkTagHandleInfo where
  arbitrary =
    ComDayCqWcmDesignimporterParserTaghandlersFactoryLinkTagHandleInfo
      <$> arbitrary -- comDayCqWcmDesignimporterParserTaghandlersFactoryLinkTagHandleInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqWcmDesignimporterParserTaghandlersFactoryLinkTagHandleInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqWcmDesignimporterParserTaghandlersFactoryLinkTagHandleInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqWcmDesignimporterParserTaghandlersFactoryLinkTagHandleInfoProperties :: Maybe ComDayCqWcmDesignimporterParserTaghandlersFactoryLinkTagHandleProperties
    
instance Arbitrary ComDayCqWcmDesignimporterParserTaghandlersFactoryLinkTagHandleProperties where
  arbitrary =
    ComDayCqWcmDesignimporterParserTaghandlersFactoryLinkTagHandleProperties
      <$> arbitrary -- comDayCqWcmDesignimporterParserTaghandlersFactoryLinkTagHandlePropertiesServiceRanking :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comDayCqWcmDesignimporterParserTaghandlersFactoryLinkTagHandlePropertiesTagpattern :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComDayCqWcmDesignimporterParserTaghandlersFactoryMetaTagHandleInfo where
  arbitrary =
    ComDayCqWcmDesignimporterParserTaghandlersFactoryMetaTagHandleInfo
      <$> arbitrary -- comDayCqWcmDesignimporterParserTaghandlersFactoryMetaTagHandleInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqWcmDesignimporterParserTaghandlersFactoryMetaTagHandleInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqWcmDesignimporterParserTaghandlersFactoryMetaTagHandleInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqWcmDesignimporterParserTaghandlersFactoryMetaTagHandleInfoProperties :: Maybe ComDayCqWcmDesignimporterParserTaghandlersFactoryMetaTagHandleProperties
    
instance Arbitrary ComDayCqWcmDesignimporterParserTaghandlersFactoryMetaTagHandleProperties where
  arbitrary =
    ComDayCqWcmDesignimporterParserTaghandlersFactoryMetaTagHandleProperties
      <$> arbitrary -- comDayCqWcmDesignimporterParserTaghandlersFactoryMetaTagHandlePropertiesServiceRanking :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comDayCqWcmDesignimporterParserTaghandlersFactoryMetaTagHandlePropertiesTagpattern :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComDayCqWcmDesignimporterParserTaghandlersFactoryNonScriptTagHInfo where
  arbitrary =
    ComDayCqWcmDesignimporterParserTaghandlersFactoryNonScriptTagHInfo
      <$> arbitrary -- comDayCqWcmDesignimporterParserTaghandlersFactoryNonScriptTagHInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqWcmDesignimporterParserTaghandlersFactoryNonScriptTagHInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqWcmDesignimporterParserTaghandlersFactoryNonScriptTagHInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqWcmDesignimporterParserTaghandlersFactoryNonScriptTagHInfoProperties :: Maybe ComDayCqWcmDesignimporterParserTaghandlersFactoryNonScriptTagHProperties
    
instance Arbitrary ComDayCqWcmDesignimporterParserTaghandlersFactoryNonScriptTagHProperties where
  arbitrary =
    ComDayCqWcmDesignimporterParserTaghandlersFactoryNonScriptTagHProperties
      <$> arbitrary -- comDayCqWcmDesignimporterParserTaghandlersFactoryNonScriptTagHPropertiesServiceRanking :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comDayCqWcmDesignimporterParserTaghandlersFactoryNonScriptTagHPropertiesTagpattern :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComDayCqWcmDesignimporterParserTaghandlersFactoryParsysComponeInfo where
  arbitrary =
    ComDayCqWcmDesignimporterParserTaghandlersFactoryParsysComponeInfo
      <$> arbitrary -- comDayCqWcmDesignimporterParserTaghandlersFactoryParsysComponeInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqWcmDesignimporterParserTaghandlersFactoryParsysComponeInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqWcmDesignimporterParserTaghandlersFactoryParsysComponeInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqWcmDesignimporterParserTaghandlersFactoryParsysComponeInfoProperties :: Maybe ComDayCqWcmDesignimporterParserTaghandlersFactoryParsysComponeProperties
    
instance Arbitrary ComDayCqWcmDesignimporterParserTaghandlersFactoryParsysComponeProperties where
  arbitrary =
    ComDayCqWcmDesignimporterParserTaghandlersFactoryParsysComponeProperties
      <$> arbitrary -- comDayCqWcmDesignimporterParserTaghandlersFactoryParsysComponePropertiesServiceRanking :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comDayCqWcmDesignimporterParserTaghandlersFactoryParsysComponePropertiesTagpattern :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comDayCqWcmDesignimporterParserTaghandlersFactoryParsysComponePropertiesComponentResourceType :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComDayCqWcmDesignimporterParserTaghandlersFactoryScriptTagHandInfo where
  arbitrary =
    ComDayCqWcmDesignimporterParserTaghandlersFactoryScriptTagHandInfo
      <$> arbitrary -- comDayCqWcmDesignimporterParserTaghandlersFactoryScriptTagHandInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqWcmDesignimporterParserTaghandlersFactoryScriptTagHandInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqWcmDesignimporterParserTaghandlersFactoryScriptTagHandInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqWcmDesignimporterParserTaghandlersFactoryScriptTagHandInfoProperties :: Maybe ComDayCqWcmDesignimporterParserTaghandlersFactoryScriptTagHandProperties
    
instance Arbitrary ComDayCqWcmDesignimporterParserTaghandlersFactoryScriptTagHandProperties where
  arbitrary =
    ComDayCqWcmDesignimporterParserTaghandlersFactoryScriptTagHandProperties
      <$> arbitrary -- comDayCqWcmDesignimporterParserTaghandlersFactoryScriptTagHandPropertiesServiceRanking :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comDayCqWcmDesignimporterParserTaghandlersFactoryScriptTagHandPropertiesTagpattern :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComDayCqWcmDesignimporterParserTaghandlersFactoryStyleTagHandlInfo where
  arbitrary =
    ComDayCqWcmDesignimporterParserTaghandlersFactoryStyleTagHandlInfo
      <$> arbitrary -- comDayCqWcmDesignimporterParserTaghandlersFactoryStyleTagHandlInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqWcmDesignimporterParserTaghandlersFactoryStyleTagHandlInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqWcmDesignimporterParserTaghandlersFactoryStyleTagHandlInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqWcmDesignimporterParserTaghandlersFactoryStyleTagHandlInfoProperties :: Maybe ComDayCqWcmDesignimporterParserTaghandlersFactoryStyleTagHandlProperties
    
instance Arbitrary ComDayCqWcmDesignimporterParserTaghandlersFactoryStyleTagHandlProperties where
  arbitrary =
    ComDayCqWcmDesignimporterParserTaghandlersFactoryStyleTagHandlProperties
      <$> arbitrary -- comDayCqWcmDesignimporterParserTaghandlersFactoryStyleTagHandlPropertiesServiceRanking :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comDayCqWcmDesignimporterParserTaghandlersFactoryStyleTagHandlPropertiesTagpattern :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComDayCqWcmDesignimporterParserTaghandlersFactoryTextComponentInfo where
  arbitrary =
    ComDayCqWcmDesignimporterParserTaghandlersFactoryTextComponentInfo
      <$> arbitrary -- comDayCqWcmDesignimporterParserTaghandlersFactoryTextComponentInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqWcmDesignimporterParserTaghandlersFactoryTextComponentInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqWcmDesignimporterParserTaghandlersFactoryTextComponentInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqWcmDesignimporterParserTaghandlersFactoryTextComponentInfoProperties :: Maybe ComDayCqWcmDesignimporterParserTaghandlersFactoryTextComponentProperties
    
instance Arbitrary ComDayCqWcmDesignimporterParserTaghandlersFactoryTextComponentProperties where
  arbitrary =
    ComDayCqWcmDesignimporterParserTaghandlersFactoryTextComponentProperties
      <$> arbitrary -- comDayCqWcmDesignimporterParserTaghandlersFactoryTextComponentPropertiesServiceRanking :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comDayCqWcmDesignimporterParserTaghandlersFactoryTextComponentPropertiesTagpattern :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comDayCqWcmDesignimporterParserTaghandlersFactoryTextComponentPropertiesComponentResourceType :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleComponenInfo where
  arbitrary =
    ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleComponenInfo
      <$> arbitrary -- comDayCqWcmDesignimporterParserTaghandlersFactoryTitleComponenInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqWcmDesignimporterParserTaghandlersFactoryTitleComponenInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqWcmDesignimporterParserTaghandlersFactoryTitleComponenInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqWcmDesignimporterParserTaghandlersFactoryTitleComponenInfoProperties :: Maybe ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleComponenProperties
    
instance Arbitrary ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleComponenProperties where
  arbitrary =
    ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleComponenProperties
      <$> arbitrary -- comDayCqWcmDesignimporterParserTaghandlersFactoryTitleComponenPropertiesServiceRanking :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comDayCqWcmDesignimporterParserTaghandlersFactoryTitleComponenPropertiesTagpattern :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comDayCqWcmDesignimporterParserTaghandlersFactoryTitleComponenPropertiesComponentResourceType :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleTagHandlInfo where
  arbitrary =
    ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleTagHandlInfo
      <$> arbitrary -- comDayCqWcmDesignimporterParserTaghandlersFactoryTitleTagHandlInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqWcmDesignimporterParserTaghandlersFactoryTitleTagHandlInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqWcmDesignimporterParserTaghandlersFactoryTitleTagHandlInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqWcmDesignimporterParserTaghandlersFactoryTitleTagHandlInfoProperties :: Maybe ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleTagHandlProperties
    
instance Arbitrary ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleTagHandlProperties where
  arbitrary =
    ComDayCqWcmDesignimporterParserTaghandlersFactoryTitleTagHandlProperties
      <$> arbitrary -- comDayCqWcmDesignimporterParserTaghandlersFactoryTitleTagHandlPropertiesServiceRanking :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comDayCqWcmDesignimporterParserTaghandlersFactoryTitleTagHandlPropertiesTagpattern :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComDayCqWcmFoundationFormsImplFormChooserServletInfo where
  arbitrary =
    ComDayCqWcmFoundationFormsImplFormChooserServletInfo
      <$> arbitrary -- comDayCqWcmFoundationFormsImplFormChooserServletInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqWcmFoundationFormsImplFormChooserServletInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqWcmFoundationFormsImplFormChooserServletInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqWcmFoundationFormsImplFormChooserServletInfoProperties :: Maybe ComDayCqWcmFoundationFormsImplFormChooserServletProperties
    
instance Arbitrary ComDayCqWcmFoundationFormsImplFormChooserServletProperties where
  arbitrary =
    ComDayCqWcmFoundationFormsImplFormChooserServletProperties
      <$> arbitrary -- comDayCqWcmFoundationFormsImplFormChooserServletPropertiesServiceName :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comDayCqWcmFoundationFormsImplFormChooserServletPropertiesSlingServletResourceTypes :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comDayCqWcmFoundationFormsImplFormChooserServletPropertiesSlingServletSelectors :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comDayCqWcmFoundationFormsImplFormChooserServletPropertiesSlingServletMethods :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comDayCqWcmFoundationFormsImplFormChooserServletPropertiesFormsFormchooserservletAdvansesearchRequire :: Maybe ConfigNodePropertyBoolean
    
instance Arbitrary ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorInfo where
  arbitrary =
    ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorInfo
      <$> arbitrary -- comDayCqWcmFoundationFormsImplFormParagraphPostProcessorInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqWcmFoundationFormsImplFormParagraphPostProcessorInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqWcmFoundationFormsImplFormParagraphPostProcessorInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqWcmFoundationFormsImplFormParagraphPostProcessorInfoProperties :: Maybe ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties
    
instance Arbitrary ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties where
  arbitrary =
    ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties
      <$> arbitrary -- comDayCqWcmFoundationFormsImplFormParagraphPostProcessorPropertiesFormsFormparagraphpostprocessorEnabled :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- comDayCqWcmFoundationFormsImplFormParagraphPostProcessorPropertiesFormsFormparagraphpostprocessorFormresourcetypes :: Maybe ConfigNodePropertyArray
    
instance Arbitrary ComDayCqWcmFoundationFormsImplFormsHandlingServletInfo where
  arbitrary =
    ComDayCqWcmFoundationFormsImplFormsHandlingServletInfo
      <$> arbitrary -- comDayCqWcmFoundationFormsImplFormsHandlingServletInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqWcmFoundationFormsImplFormsHandlingServletInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqWcmFoundationFormsImplFormsHandlingServletInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqWcmFoundationFormsImplFormsHandlingServletInfoProperties :: Maybe ComDayCqWcmFoundationFormsImplFormsHandlingServletProperties
    
instance Arbitrary ComDayCqWcmFoundationFormsImplFormsHandlingServletProperties where
  arbitrary =
    ComDayCqWcmFoundationFormsImplFormsHandlingServletProperties
      <$> arbitrary -- comDayCqWcmFoundationFormsImplFormsHandlingServletPropertiesNameWhitelist :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comDayCqWcmFoundationFormsImplFormsHandlingServletPropertiesAllowExpressions :: Maybe ConfigNodePropertyBoolean
    
instance Arbitrary ComDayCqWcmFoundationFormsImplMailServletInfo where
  arbitrary =
    ComDayCqWcmFoundationFormsImplMailServletInfo
      <$> arbitrary -- comDayCqWcmFoundationFormsImplMailServletInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqWcmFoundationFormsImplMailServletInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqWcmFoundationFormsImplMailServletInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqWcmFoundationFormsImplMailServletInfoProperties :: Maybe ComDayCqWcmFoundationFormsImplMailServletProperties
    
instance Arbitrary ComDayCqWcmFoundationFormsImplMailServletProperties where
  arbitrary =
    ComDayCqWcmFoundationFormsImplMailServletProperties
      <$> arbitrary -- comDayCqWcmFoundationFormsImplMailServletPropertiesSlingServletResourceTypes :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comDayCqWcmFoundationFormsImplMailServletPropertiesSlingServletSelectors :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comDayCqWcmFoundationFormsImplMailServletPropertiesResourceWhitelist :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comDayCqWcmFoundationFormsImplMailServletPropertiesResourceBlacklist :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComDayCqWcmFoundationImplAdaptiveImageComponentServletInfo where
  arbitrary =
    ComDayCqWcmFoundationImplAdaptiveImageComponentServletInfo
      <$> arbitrary -- comDayCqWcmFoundationImplAdaptiveImageComponentServletInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqWcmFoundationImplAdaptiveImageComponentServletInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqWcmFoundationImplAdaptiveImageComponentServletInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqWcmFoundationImplAdaptiveImageComponentServletInfoProperties :: Maybe ComDayCqWcmFoundationImplAdaptiveImageComponentServletProperties
    
instance Arbitrary ComDayCqWcmFoundationImplAdaptiveImageComponentServletProperties where
  arbitrary =
    ComDayCqWcmFoundationImplAdaptiveImageComponentServletProperties
      <$> arbitrary -- comDayCqWcmFoundationImplAdaptiveImageComponentServletPropertiesAdaptSupportedWidths :: Maybe ConfigNodePropertyArray
    
instance Arbitrary ComDayCqWcmFoundationImplHTTPAuthHandlerInfo where
  arbitrary =
    ComDayCqWcmFoundationImplHTTPAuthHandlerInfo
      <$> arbitrary -- comDayCqWcmFoundationImplHTTPAuthHandlerInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqWcmFoundationImplHTTPAuthHandlerInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqWcmFoundationImplHTTPAuthHandlerInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqWcmFoundationImplHTTPAuthHandlerInfoProperties :: Maybe ComDayCqWcmFoundationImplHTTPAuthHandlerProperties
    
instance Arbitrary ComDayCqWcmFoundationImplHTTPAuthHandlerProperties where
  arbitrary =
    ComDayCqWcmFoundationImplHTTPAuthHandlerProperties
      <$> arbitrary -- comDayCqWcmFoundationImplHTTPAuthHandlerPropertiesPath :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comDayCqWcmFoundationImplHTTPAuthHandlerPropertiesAuthHttpNologin :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- comDayCqWcmFoundationImplHTTPAuthHandlerPropertiesAuthHttpRealm :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comDayCqWcmFoundationImplHTTPAuthHandlerPropertiesAuthDefaultLoginpage :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comDayCqWcmFoundationImplHTTPAuthHandlerPropertiesAuthCredForm :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comDayCqWcmFoundationImplHTTPAuthHandlerPropertiesAuthCredUtf8 :: Maybe ConfigNodePropertyArray
    
instance Arbitrary ComDayCqWcmFoundationImplPageImpressionsTrackerInfo where
  arbitrary =
    ComDayCqWcmFoundationImplPageImpressionsTrackerInfo
      <$> arbitrary -- comDayCqWcmFoundationImplPageImpressionsTrackerInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqWcmFoundationImplPageImpressionsTrackerInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqWcmFoundationImplPageImpressionsTrackerInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqWcmFoundationImplPageImpressionsTrackerInfoProperties :: Maybe ComDayCqWcmFoundationImplPageImpressionsTrackerProperties
    
instance Arbitrary ComDayCqWcmFoundationImplPageImpressionsTrackerProperties where
  arbitrary =
    ComDayCqWcmFoundationImplPageImpressionsTrackerProperties
      <$> arbitrary -- comDayCqWcmFoundationImplPageImpressionsTrackerPropertiesSlingAuthRequirements :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComDayCqWcmFoundationImplPageRedirectServletInfo where
  arbitrary =
    ComDayCqWcmFoundationImplPageRedirectServletInfo
      <$> arbitrary -- comDayCqWcmFoundationImplPageRedirectServletInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqWcmFoundationImplPageRedirectServletInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqWcmFoundationImplPageRedirectServletInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqWcmFoundationImplPageRedirectServletInfoProperties :: Maybe ComDayCqWcmFoundationImplPageRedirectServletProperties
    
instance Arbitrary ComDayCqWcmFoundationImplPageRedirectServletProperties where
  arbitrary =
    ComDayCqWcmFoundationImplPageRedirectServletProperties
      <$> arbitrary -- comDayCqWcmFoundationImplPageRedirectServletPropertiesExcludedResourceTypes :: Maybe ConfigNodePropertyArray
    
instance Arbitrary ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistInfo where
  arbitrary =
    ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistInfo
      <$> arbitrary -- comDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistInfoProperties :: Maybe ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistProperties
    
instance Arbitrary ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistProperties where
  arbitrary =
    ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistProperties
      <$> arbitrary -- comDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistPropertiesDefaultAttachmentTypeBlacklist :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistPropertiesBaselineAttachmentTypeBlacklist :: Maybe ConfigNodePropertyArray
    
instance Arbitrary ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplInfo where
  arbitrary =
    ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplInfo
      <$> arbitrary -- comDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplInfoProperties :: Maybe ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties
      <*> arbitrary -- comDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplInfoBundleLocation :: Maybe Text
      <*> arbitrary -- comDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplInfoServiceLocation :: Maybe Text
    
instance Arbitrary ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties where
  arbitrary =
    ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties
      <$> arbitrary -- comDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplPropertiesParameterWhitelist :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplPropertiesParameterWhitelistPrefixes :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplPropertiesBinaryParameterWhitelist :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplPropertiesModifierWhitelist :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplPropertiesOperationWhitelist :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplPropertiesOperationWhitelistPrefixes :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplPropertiesTypehintWhitelist :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplPropertiesResourcetypeWhitelist :: Maybe ConfigNodePropertyArray
    
instance Arbitrary ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryInfo where
  arbitrary =
    ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryInfo
      <$> arbitrary -- comDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryInfoProperties :: Maybe ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties
      <*> arbitrary -- comDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryInfoBundleLocation :: Maybe Text
      <*> arbitrary -- comDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryInfoServiceLocation :: Maybe Text
    
instance Arbitrary ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties where
  arbitrary =
    ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties
      <$> arbitrary -- comDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryPropertiesDeviceInfoTransformerEnabled :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- comDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryPropertiesDeviceInfoTransformerCssStyle :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComDayCqWcmMobileCoreImplRedirectRedirectFilterInfo where
  arbitrary =
    ComDayCqWcmMobileCoreImplRedirectRedirectFilterInfo
      <$> arbitrary -- comDayCqWcmMobileCoreImplRedirectRedirectFilterInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqWcmMobileCoreImplRedirectRedirectFilterInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqWcmMobileCoreImplRedirectRedirectFilterInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqWcmMobileCoreImplRedirectRedirectFilterInfoProperties :: Maybe ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties
      <*> arbitrary -- comDayCqWcmMobileCoreImplRedirectRedirectFilterInfoBundleLocation :: Maybe Text
      <*> arbitrary -- comDayCqWcmMobileCoreImplRedirectRedirectFilterInfoServiceLocation :: Maybe Text
    
instance Arbitrary ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties where
  arbitrary =
    ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties
      <$> arbitrary -- comDayCqWcmMobileCoreImplRedirectRedirectFilterPropertiesRedirectEnabled :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- comDayCqWcmMobileCoreImplRedirectRedirectFilterPropertiesRedirectStatsEnabled :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- comDayCqWcmMobileCoreImplRedirectRedirectFilterPropertiesRedirectExtensions :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comDayCqWcmMobileCoreImplRedirectRedirectFilterPropertiesRedirectPaths :: Maybe ConfigNodePropertyArray
    
instance Arbitrary ComDayCqWcmMsmImplActionsContentCopyActionFactoryInfo where
  arbitrary =
    ComDayCqWcmMsmImplActionsContentCopyActionFactoryInfo
      <$> arbitrary -- comDayCqWcmMsmImplActionsContentCopyActionFactoryInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqWcmMsmImplActionsContentCopyActionFactoryInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqWcmMsmImplActionsContentCopyActionFactoryInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqWcmMsmImplActionsContentCopyActionFactoryInfoProperties :: Maybe ComDayCqWcmMsmImplActionsContentCopyActionFactoryProperties
      <*> arbitrary -- comDayCqWcmMsmImplActionsContentCopyActionFactoryInfoBundleLocation :: Maybe Text
      <*> arbitrary -- comDayCqWcmMsmImplActionsContentCopyActionFactoryInfoServiceLocation :: Maybe Text
    
instance Arbitrary ComDayCqWcmMsmImplActionsContentCopyActionFactoryProperties where
  arbitrary =
    ComDayCqWcmMsmImplActionsContentCopyActionFactoryProperties
      <$> arbitrary -- comDayCqWcmMsmImplActionsContentCopyActionFactoryPropertiesCqWcmMsmActionExcludednodetypes :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comDayCqWcmMsmImplActionsContentCopyActionFactoryPropertiesCqWcmMsmActionExcludedparagraphitems :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comDayCqWcmMsmImplActionsContentCopyActionFactoryPropertiesCqWcmMsmActionExcludedprops :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comDayCqWcmMsmImplActionsContentCopyActionFactoryPropertiesContentcopyactionOrderStyle :: Maybe ConfigNodePropertyDropDown
    
instance Arbitrary ComDayCqWcmMsmImplActionsContentDeleteActionFactoryInfo where
  arbitrary =
    ComDayCqWcmMsmImplActionsContentDeleteActionFactoryInfo
      <$> arbitrary -- comDayCqWcmMsmImplActionsContentDeleteActionFactoryInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqWcmMsmImplActionsContentDeleteActionFactoryInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqWcmMsmImplActionsContentDeleteActionFactoryInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqWcmMsmImplActionsContentDeleteActionFactoryInfoProperties :: Maybe ComDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties
      <*> arbitrary -- comDayCqWcmMsmImplActionsContentDeleteActionFactoryInfoBundleLocation :: Maybe Text
      <*> arbitrary -- comDayCqWcmMsmImplActionsContentDeleteActionFactoryInfoServiceLocation :: Maybe Text
    
instance Arbitrary ComDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties where
  arbitrary =
    ComDayCqWcmMsmImplActionsContentDeleteActionFactoryProperties
      <$> arbitrary -- comDayCqWcmMsmImplActionsContentDeleteActionFactoryPropertiesCqWcmMsmActionExcludednodetypes :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comDayCqWcmMsmImplActionsContentDeleteActionFactoryPropertiesCqWcmMsmActionExcludedparagraphitems :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comDayCqWcmMsmImplActionsContentDeleteActionFactoryPropertiesCqWcmMsmActionExcludedprops :: Maybe ConfigNodePropertyArray
    
instance Arbitrary ComDayCqWcmMsmImplActionsContentUpdateActionFactoryInfo where
  arbitrary =
    ComDayCqWcmMsmImplActionsContentUpdateActionFactoryInfo
      <$> arbitrary -- comDayCqWcmMsmImplActionsContentUpdateActionFactoryInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqWcmMsmImplActionsContentUpdateActionFactoryInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqWcmMsmImplActionsContentUpdateActionFactoryInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqWcmMsmImplActionsContentUpdateActionFactoryInfoProperties :: Maybe ComDayCqWcmMsmImplActionsContentUpdateActionFactoryProperties
      <*> arbitrary -- comDayCqWcmMsmImplActionsContentUpdateActionFactoryInfoBundleLocation :: Maybe Text
      <*> arbitrary -- comDayCqWcmMsmImplActionsContentUpdateActionFactoryInfoServiceLocation :: Maybe Text
    
instance Arbitrary ComDayCqWcmMsmImplActionsContentUpdateActionFactoryProperties where
  arbitrary =
    ComDayCqWcmMsmImplActionsContentUpdateActionFactoryProperties
      <$> arbitrary -- comDayCqWcmMsmImplActionsContentUpdateActionFactoryPropertiesCqWcmMsmActionExcludednodetypes :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comDayCqWcmMsmImplActionsContentUpdateActionFactoryPropertiesCqWcmMsmActionExcludedparagraphitems :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comDayCqWcmMsmImplActionsContentUpdateActionFactoryPropertiesCqWcmMsmActionExcludedprops :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comDayCqWcmMsmImplActionsContentUpdateActionFactoryPropertiesCqWcmMsmActionIgnoredMixin :: Maybe ConfigNodePropertyArray
    
instance Arbitrary ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryInfo where
  arbitrary =
    ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryInfo
      <$> arbitrary -- comDayCqWcmMsmImplActionsOrderChildrenActionFactoryInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqWcmMsmImplActionsOrderChildrenActionFactoryInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqWcmMsmImplActionsOrderChildrenActionFactoryInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqWcmMsmImplActionsOrderChildrenActionFactoryInfoProperties :: Maybe ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties
      <*> arbitrary -- comDayCqWcmMsmImplActionsOrderChildrenActionFactoryInfoBundleLocation :: Maybe Text
      <*> arbitrary -- comDayCqWcmMsmImplActionsOrderChildrenActionFactoryInfoServiceLocation :: Maybe Text
    
instance Arbitrary ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties where
  arbitrary =
    ComDayCqWcmMsmImplActionsOrderChildrenActionFactoryProperties
      <$> arbitrary -- comDayCqWcmMsmImplActionsOrderChildrenActionFactoryPropertiesCqWcmMsmActionExcludednodetypes :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comDayCqWcmMsmImplActionsOrderChildrenActionFactoryPropertiesCqWcmMsmActionExcludedparagraphitems :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comDayCqWcmMsmImplActionsOrderChildrenActionFactoryPropertiesCqWcmMsmActionExcludedprops :: Maybe ConfigNodePropertyArray
    
instance Arbitrary ComDayCqWcmMsmImplActionsPageMoveActionFactoryInfo where
  arbitrary =
    ComDayCqWcmMsmImplActionsPageMoveActionFactoryInfo
      <$> arbitrary -- comDayCqWcmMsmImplActionsPageMoveActionFactoryInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqWcmMsmImplActionsPageMoveActionFactoryInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqWcmMsmImplActionsPageMoveActionFactoryInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqWcmMsmImplActionsPageMoveActionFactoryInfoProperties :: Maybe ComDayCqWcmMsmImplActionsPageMoveActionFactoryProperties
    
instance Arbitrary ComDayCqWcmMsmImplActionsPageMoveActionFactoryProperties where
  arbitrary =
    ComDayCqWcmMsmImplActionsPageMoveActionFactoryProperties
      <$> arbitrary -- comDayCqWcmMsmImplActionsPageMoveActionFactoryPropertiesCqWcmMsmActionExcludednodetypes :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comDayCqWcmMsmImplActionsPageMoveActionFactoryPropertiesCqWcmMsmActionExcludedparagraphitems :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comDayCqWcmMsmImplActionsPageMoveActionFactoryPropertiesCqWcmMsmActionExcludedprops :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comDayCqWcmMsmImplActionsPageMoveActionFactoryPropertiesCqWcmMsmImplActionsPagemovePropReferenceUpdate :: Maybe ConfigNodePropertyBoolean
    
instance Arbitrary ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryInfo where
  arbitrary =
    ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryInfo
      <$> arbitrary -- comDayCqWcmMsmImplActionsReferencesUpdateActionFactoryInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqWcmMsmImplActionsReferencesUpdateActionFactoryInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqWcmMsmImplActionsReferencesUpdateActionFactoryInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqWcmMsmImplActionsReferencesUpdateActionFactoryInfoProperties :: Maybe ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties
      <*> arbitrary -- comDayCqWcmMsmImplActionsReferencesUpdateActionFactoryInfoBundleLocation :: Maybe Text
      <*> arbitrary -- comDayCqWcmMsmImplActionsReferencesUpdateActionFactoryInfoServiceLocation :: Maybe Text
    
instance Arbitrary ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties where
  arbitrary =
    ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties
      <$> arbitrary -- comDayCqWcmMsmImplActionsReferencesUpdateActionFactoryPropertiesCqWcmMsmActionExcludednodetypes :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comDayCqWcmMsmImplActionsReferencesUpdateActionFactoryPropertiesCqWcmMsmActionExcludedparagraphitems :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comDayCqWcmMsmImplActionsReferencesUpdateActionFactoryPropertiesCqWcmMsmActionExcludedprops :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comDayCqWcmMsmImplActionsReferencesUpdateActionFactoryPropertiesCqWcmMsmImplActionReferencesupdatePropUpdateNested :: Maybe ConfigNodePropertyBoolean
    
instance Arbitrary ComDayCqWcmMsmImplActionsVersionCopyActionFactoryInfo where
  arbitrary =
    ComDayCqWcmMsmImplActionsVersionCopyActionFactoryInfo
      <$> arbitrary -- comDayCqWcmMsmImplActionsVersionCopyActionFactoryInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqWcmMsmImplActionsVersionCopyActionFactoryInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqWcmMsmImplActionsVersionCopyActionFactoryInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqWcmMsmImplActionsVersionCopyActionFactoryInfoProperties :: Maybe ComDayCqWcmMsmImplActionsVersionCopyActionFactoryProperties
      <*> arbitrary -- comDayCqWcmMsmImplActionsVersionCopyActionFactoryInfoBundleLocation :: Maybe Text
      <*> arbitrary -- comDayCqWcmMsmImplActionsVersionCopyActionFactoryInfoServiceLocation :: Maybe Text
    
instance Arbitrary ComDayCqWcmMsmImplActionsVersionCopyActionFactoryProperties where
  arbitrary =
    ComDayCqWcmMsmImplActionsVersionCopyActionFactoryProperties
      <$> arbitrary -- comDayCqWcmMsmImplActionsVersionCopyActionFactoryPropertiesCqWcmMsmActionExcludednodetypes :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comDayCqWcmMsmImplActionsVersionCopyActionFactoryPropertiesCqWcmMsmActionExcludedparagraphitems :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comDayCqWcmMsmImplActionsVersionCopyActionFactoryPropertiesCqWcmMsmActionExcludedprops :: Maybe ConfigNodePropertyArray
    
instance Arbitrary ComDayCqWcmMsmImplLiveRelationshipManagerImplInfo where
  arbitrary =
    ComDayCqWcmMsmImplLiveRelationshipManagerImplInfo
      <$> arbitrary -- comDayCqWcmMsmImplLiveRelationshipManagerImplInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqWcmMsmImplLiveRelationshipManagerImplInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqWcmMsmImplLiveRelationshipManagerImplInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqWcmMsmImplLiveRelationshipManagerImplInfoProperties :: Maybe ComDayCqWcmMsmImplLiveRelationshipManagerImplProperties
    
instance Arbitrary ComDayCqWcmMsmImplLiveRelationshipManagerImplProperties where
  arbitrary =
    ComDayCqWcmMsmImplLiveRelationshipManagerImplProperties
      <$> arbitrary -- comDayCqWcmMsmImplLiveRelationshipManagerImplPropertiesLiverelationshipmgrRelationsconfigDefault :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComDayCqWcmMsmImplRolloutManagerImplInfo where
  arbitrary =
    ComDayCqWcmMsmImplRolloutManagerImplInfo
      <$> arbitrary -- comDayCqWcmMsmImplRolloutManagerImplInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqWcmMsmImplRolloutManagerImplInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqWcmMsmImplRolloutManagerImplInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqWcmMsmImplRolloutManagerImplInfoProperties :: Maybe ComDayCqWcmMsmImplRolloutManagerImplProperties
      <*> arbitrary -- comDayCqWcmMsmImplRolloutManagerImplInfoAdditionalProperties :: Maybe Text
      <*> arbitrary -- comDayCqWcmMsmImplRolloutManagerImplInfoBundleLocation :: Maybe Text
      <*> arbitrary -- comDayCqWcmMsmImplRolloutManagerImplInfoServiceLocation :: Maybe Text
    
instance Arbitrary ComDayCqWcmMsmImplRolloutManagerImplProperties where
  arbitrary =
    ComDayCqWcmMsmImplRolloutManagerImplProperties
      <$> arbitrary -- comDayCqWcmMsmImplRolloutManagerImplPropertiesEventFilter :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comDayCqWcmMsmImplRolloutManagerImplPropertiesRolloutmgrExcludedpropsDefault :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comDayCqWcmMsmImplRolloutManagerImplPropertiesRolloutmgrExcludedparagraphpropsDefault :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comDayCqWcmMsmImplRolloutManagerImplPropertiesRolloutmgrExcludednodetypesDefault :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comDayCqWcmMsmImplRolloutManagerImplPropertiesRolloutmgrThreadpoolMaxsize :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comDayCqWcmMsmImplRolloutManagerImplPropertiesRolloutmgrThreadpoolMaxshutdowntime :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comDayCqWcmMsmImplRolloutManagerImplPropertiesRolloutmgrThreadpoolPriority :: Maybe ConfigNodePropertyDropDown
      <*> arbitrary -- comDayCqWcmMsmImplRolloutManagerImplPropertiesRolloutmgrCommitSize :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comDayCqWcmMsmImplRolloutManagerImplPropertiesRolloutmgrConflicthandlingEnabled :: Maybe ConfigNodePropertyBoolean
    
instance Arbitrary ComDayCqWcmMsmImplServletsAuditLogServletInfo where
  arbitrary =
    ComDayCqWcmMsmImplServletsAuditLogServletInfo
      <$> arbitrary -- comDayCqWcmMsmImplServletsAuditLogServletInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqWcmMsmImplServletsAuditLogServletInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqWcmMsmImplServletsAuditLogServletInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqWcmMsmImplServletsAuditLogServletInfoProperties :: Maybe ComDayCqWcmMsmImplServletsAuditLogServletProperties
    
instance Arbitrary ComDayCqWcmMsmImplServletsAuditLogServletProperties where
  arbitrary =
    ComDayCqWcmMsmImplServletsAuditLogServletProperties
      <$> arbitrary -- comDayCqWcmMsmImplServletsAuditLogServletPropertiesAuditlogservletDefaultEventsCount :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comDayCqWcmMsmImplServletsAuditLogServletPropertiesAuditlogservletDefaultPath :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComDayCqWcmNotificationEmailImplEmailChannelInfo where
  arbitrary =
    ComDayCqWcmNotificationEmailImplEmailChannelInfo
      <$> arbitrary -- comDayCqWcmNotificationEmailImplEmailChannelInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqWcmNotificationEmailImplEmailChannelInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqWcmNotificationEmailImplEmailChannelInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqWcmNotificationEmailImplEmailChannelInfoProperties :: Maybe ComDayCqWcmNotificationEmailImplEmailChannelProperties
    
instance Arbitrary ComDayCqWcmNotificationEmailImplEmailChannelProperties where
  arbitrary =
    ComDayCqWcmNotificationEmailImplEmailChannelProperties
      <$> arbitrary -- comDayCqWcmNotificationEmailImplEmailChannelPropertiesEmailFrom :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComDayCqWcmNotificationImplNotificationManagerImplInfo where
  arbitrary =
    ComDayCqWcmNotificationImplNotificationManagerImplInfo
      <$> arbitrary -- comDayCqWcmNotificationImplNotificationManagerImplInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqWcmNotificationImplNotificationManagerImplInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqWcmNotificationImplNotificationManagerImplInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqWcmNotificationImplNotificationManagerImplInfoProperties :: Maybe ComDayCqWcmNotificationImplNotificationManagerImplProperties
      <*> arbitrary -- comDayCqWcmNotificationImplNotificationManagerImplInfoBundleLocation :: Maybe Text
      <*> arbitrary -- comDayCqWcmNotificationImplNotificationManagerImplInfoServiceLocation :: Maybe Text
    
instance Arbitrary ComDayCqWcmNotificationImplNotificationManagerImplProperties where
  arbitrary =
    ComDayCqWcmNotificationImplNotificationManagerImplProperties
      <$> arbitrary -- comDayCqWcmNotificationImplNotificationManagerImplPropertiesEventTopics :: Maybe ConfigNodePropertyArray
    
instance Arbitrary ComDayCqWcmScriptingImplBVPManagerInfo where
  arbitrary =
    ComDayCqWcmScriptingImplBVPManagerInfo
      <$> arbitrary -- comDayCqWcmScriptingImplBVPManagerInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqWcmScriptingImplBVPManagerInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqWcmScriptingImplBVPManagerInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqWcmScriptingImplBVPManagerInfoProperties :: Maybe ComDayCqWcmScriptingImplBVPManagerProperties
    
instance Arbitrary ComDayCqWcmScriptingImplBVPManagerProperties where
  arbitrary =
    ComDayCqWcmScriptingImplBVPManagerProperties
      <$> arbitrary -- comDayCqWcmScriptingImplBVPManagerPropertiesComDayCqWcmScriptingBvpScriptEngines :: Maybe ConfigNodePropertyArray
    
instance Arbitrary ComDayCqWcmUndoUndoConfigInfo where
  arbitrary =
    ComDayCqWcmUndoUndoConfigInfo
      <$> arbitrary -- comDayCqWcmUndoUndoConfigInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqWcmUndoUndoConfigInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqWcmUndoUndoConfigInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqWcmUndoUndoConfigInfoProperties :: Maybe ComDayCqWcmUndoUndoConfigProperties
      <*> arbitrary -- comDayCqWcmUndoUndoConfigInfoBundleLocation :: Maybe Text
      <*> arbitrary -- comDayCqWcmUndoUndoConfigInfoServiceLocation :: Maybe Text
    
instance Arbitrary ComDayCqWcmUndoUndoConfigProperties where
  arbitrary =
    ComDayCqWcmUndoUndoConfigProperties
      <$> arbitrary -- comDayCqWcmUndoUndoConfigPropertiesCqWcmUndoEnabled :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- comDayCqWcmUndoUndoConfigPropertiesCqWcmUndoPath :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comDayCqWcmUndoUndoConfigPropertiesCqWcmUndoValidity :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comDayCqWcmUndoUndoConfigPropertiesCqWcmUndoSteps :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comDayCqWcmUndoUndoConfigPropertiesCqWcmUndoPersistence :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comDayCqWcmUndoUndoConfigPropertiesCqWcmUndoPersistenceMode :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- comDayCqWcmUndoUndoConfigPropertiesCqWcmUndoMarkermode :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comDayCqWcmUndoUndoConfigPropertiesCqWcmUndoWhitelist :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comDayCqWcmUndoUndoConfigPropertiesCqWcmUndoBlacklist :: Maybe ConfigNodePropertyArray
    
instance Arbitrary ComDayCqWcmWebservicesupportImplReplicationEventListenerInfo where
  arbitrary =
    ComDayCqWcmWebservicesupportImplReplicationEventListenerInfo
      <$> arbitrary -- comDayCqWcmWebservicesupportImplReplicationEventListenerInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqWcmWebservicesupportImplReplicationEventListenerInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqWcmWebservicesupportImplReplicationEventListenerInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqWcmWebservicesupportImplReplicationEventListenerInfoProperties :: Maybe ComDayCqWcmWebservicesupportImplReplicationEventListenerProperties
    
instance Arbitrary ComDayCqWcmWebservicesupportImplReplicationEventListenerProperties where
  arbitrary =
    ComDayCqWcmWebservicesupportImplReplicationEventListenerProperties
      <$> arbitrary -- comDayCqWcmWebservicesupportImplReplicationEventListenerPropertiesFlushAgents :: Maybe ConfigNodePropertyArray
    
instance Arbitrary ComDayCqWcmWorkflowImplWcmWorkflowServiceImplInfo where
  arbitrary =
    ComDayCqWcmWorkflowImplWcmWorkflowServiceImplInfo
      <$> arbitrary -- comDayCqWcmWorkflowImplWcmWorkflowServiceImplInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqWcmWorkflowImplWcmWorkflowServiceImplInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqWcmWorkflowImplWcmWorkflowServiceImplInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqWcmWorkflowImplWcmWorkflowServiceImplInfoProperties :: Maybe ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties
    
instance Arbitrary ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties where
  arbitrary =
    ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties
      <$> arbitrary -- comDayCqWcmWorkflowImplWcmWorkflowServiceImplPropertiesEventFilter :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comDayCqWcmWorkflowImplWcmWorkflowServiceImplPropertiesMinThreadPoolSize :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comDayCqWcmWorkflowImplWcmWorkflowServiceImplPropertiesMaxThreadPoolSize :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comDayCqWcmWorkflowImplWcmWorkflowServiceImplPropertiesCqWcmWorkflowTerminateOnActivate :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- comDayCqWcmWorkflowImplWcmWorkflowServiceImplPropertiesCqWcmWorklfowTerminateExclusionList :: Maybe ConfigNodePropertyArray
    
instance Arbitrary ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderInfo where
  arbitrary =
    ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderInfo
      <$> arbitrary -- comDayCqWcmWorkflowImplWorkflowPackageInfoProviderInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqWcmWorkflowImplWorkflowPackageInfoProviderInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqWcmWorkflowImplWorkflowPackageInfoProviderInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqWcmWorkflowImplWorkflowPackageInfoProviderInfoProperties :: Maybe ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties
    
instance Arbitrary ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties where
  arbitrary =
    ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties
      <$> arbitrary -- comDayCqWcmWorkflowImplWorkflowPackageInfoProviderPropertiesWorkflowpackageinfoproviderFilter :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comDayCqWcmWorkflowImplWorkflowPackageInfoProviderPropertiesWorkflowpackageinfoproviderFilterRootpath :: Maybe ConfigNodePropertyString
    
instance Arbitrary ComDayCqWidgetImplHtmlLibraryManagerImplInfo where
  arbitrary =
    ComDayCqWidgetImplHtmlLibraryManagerImplInfo
      <$> arbitrary -- comDayCqWidgetImplHtmlLibraryManagerImplInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqWidgetImplHtmlLibraryManagerImplInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqWidgetImplHtmlLibraryManagerImplInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqWidgetImplHtmlLibraryManagerImplInfoProperties :: Maybe ComDayCqWidgetImplHtmlLibraryManagerImplProperties
      <*> arbitrary -- comDayCqWidgetImplHtmlLibraryManagerImplInfoBundleLocation :: Maybe Text
      <*> arbitrary -- comDayCqWidgetImplHtmlLibraryManagerImplInfoServiceLocation :: Maybe Text
    
instance Arbitrary ComDayCqWidgetImplHtmlLibraryManagerImplProperties where
  arbitrary =
    ComDayCqWidgetImplHtmlLibraryManagerImplProperties
      <$> arbitrary -- comDayCqWidgetImplHtmlLibraryManagerImplPropertiesHtmllibmanagerClientmanager :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comDayCqWidgetImplHtmlLibraryManagerImplPropertiesHtmllibmanagerDebug :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- comDayCqWidgetImplHtmlLibraryManagerImplPropertiesHtmllibmanagerDebugConsole :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- comDayCqWidgetImplHtmlLibraryManagerImplPropertiesHtmllibmanagerDebugInitJs :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comDayCqWidgetImplHtmlLibraryManagerImplPropertiesHtmllibmanagerDefaultthemename :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comDayCqWidgetImplHtmlLibraryManagerImplPropertiesHtmllibmanagerDefaultuserthemename :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comDayCqWidgetImplHtmlLibraryManagerImplPropertiesHtmllibmanagerFirebuglitePath :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comDayCqWidgetImplHtmlLibraryManagerImplPropertiesHtmllibmanagerForceCqUrlInfo :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- comDayCqWidgetImplHtmlLibraryManagerImplPropertiesHtmllibmanagerGzip :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- comDayCqWidgetImplHtmlLibraryManagerImplPropertiesHtmllibmanagerMaxage :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comDayCqWidgetImplHtmlLibraryManagerImplPropertiesHtmllibmanagerMaxDataUriSize :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- comDayCqWidgetImplHtmlLibraryManagerImplPropertiesHtmllibmanagerMinify :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- comDayCqWidgetImplHtmlLibraryManagerImplPropertiesHtmllibmanagerPathList :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comDayCqWidgetImplHtmlLibraryManagerImplPropertiesHtmllibmanagerTiming :: Maybe ConfigNodePropertyBoolean
    
instance Arbitrary ComDayCqWidgetImplWidgetExtensionProviderImplInfo where
  arbitrary =
    ComDayCqWidgetImplWidgetExtensionProviderImplInfo
      <$> arbitrary -- comDayCqWidgetImplWidgetExtensionProviderImplInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqWidgetImplWidgetExtensionProviderImplInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqWidgetImplWidgetExtensionProviderImplInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqWidgetImplWidgetExtensionProviderImplInfoProperties :: Maybe ComDayCqWidgetImplWidgetExtensionProviderImplProperties
      <*> arbitrary -- comDayCqWidgetImplWidgetExtensionProviderImplInfoBundleLocation :: Maybe Text
      <*> arbitrary -- comDayCqWidgetImplWidgetExtensionProviderImplInfoServiceLocation :: Maybe Text
    
instance Arbitrary ComDayCqWidgetImplWidgetExtensionProviderImplProperties where
  arbitrary =
    ComDayCqWidgetImplWidgetExtensionProviderImplProperties
      <$> arbitrary -- comDayCqWidgetImplWidgetExtensionProviderImplPropertiesExtendableWidgets :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- comDayCqWidgetImplWidgetExtensionProviderImplPropertiesWidgetextensionproviderDebug :: Maybe ConfigNodePropertyBoolean
    
instance Arbitrary ComDayCqWorkflowImplEmailEMailNotificationServiceInfo where
  arbitrary =
    ComDayCqWorkflowImplEmailEMailNotificationServiceInfo
      <$> arbitrary -- comDayCqWorkflowImplEmailEMailNotificationServiceInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqWorkflowImplEmailEMailNotificationServiceInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqWorkflowImplEmailEMailNotificationServiceInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqWorkflowImplEmailEMailNotificationServiceInfoProperties :: Maybe ComDayCqWorkflowImplEmailEMailNotificationServiceProperties
    
instance Arbitrary ComDayCqWorkflowImplEmailEMailNotificationServiceProperties where
  arbitrary =
    ComDayCqWorkflowImplEmailEMailNotificationServiceProperties
      <$> arbitrary -- comDayCqWorkflowImplEmailEMailNotificationServicePropertiesFromAddress :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comDayCqWorkflowImplEmailEMailNotificationServicePropertiesHostPrefix :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comDayCqWorkflowImplEmailEMailNotificationServicePropertiesNotifyOnabort :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- comDayCqWorkflowImplEmailEMailNotificationServicePropertiesNotifyOncomplete :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- comDayCqWorkflowImplEmailEMailNotificationServicePropertiesNotifyOncontainercomplete :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- comDayCqWorkflowImplEmailEMailNotificationServicePropertiesNotifyUseronly :: Maybe ConfigNodePropertyBoolean
    
instance Arbitrary ComDayCqWorkflowImplEmailTaskEMailNotificationServiceInfo where
  arbitrary =
    ComDayCqWorkflowImplEmailTaskEMailNotificationServiceInfo
      <$> arbitrary -- comDayCqWorkflowImplEmailTaskEMailNotificationServiceInfoPid :: Maybe Text
      <*> arbitrary -- comDayCqWorkflowImplEmailTaskEMailNotificationServiceInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCqWorkflowImplEmailTaskEMailNotificationServiceInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCqWorkflowImplEmailTaskEMailNotificationServiceInfoProperties :: Maybe ComDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties
    
instance Arbitrary ComDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties where
  arbitrary =
    ComDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties
      <$> arbitrary -- comDayCqWorkflowImplEmailTaskEMailNotificationServicePropertiesNotifyOnupdate :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- comDayCqWorkflowImplEmailTaskEMailNotificationServicePropertiesNotifyOncomplete :: Maybe ConfigNodePropertyBoolean
    
instance Arbitrary ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerInfo where
  arbitrary =
    ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerInfo
      <$> arbitrary -- comDayCrxSecurityTokenImplImplTokenAuthenticationHandlerInfoPid :: Maybe Text
      <*> arbitrary -- comDayCrxSecurityTokenImplImplTokenAuthenticationHandlerInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCrxSecurityTokenImplImplTokenAuthenticationHandlerInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCrxSecurityTokenImplImplTokenAuthenticationHandlerInfoProperties :: Maybe ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties
      <*> arbitrary -- comDayCrxSecurityTokenImplImplTokenAuthenticationHandlerInfoBundleLocation :: Maybe Text
      <*> arbitrary -- comDayCrxSecurityTokenImplImplTokenAuthenticationHandlerInfoServiceLocation :: Maybe Text
    
instance Arbitrary ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties where
  arbitrary =
    ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties
      <$> arbitrary -- comDayCrxSecurityTokenImplImplTokenAuthenticationHandlerPropertiesPath :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comDayCrxSecurityTokenImplImplTokenAuthenticationHandlerPropertiesTokenRequiredAttr :: Maybe ConfigNodePropertyDropDown
      <*> arbitrary -- comDayCrxSecurityTokenImplImplTokenAuthenticationHandlerPropertiesTokenAlternateUrl :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comDayCrxSecurityTokenImplImplTokenAuthenticationHandlerPropertiesTokenEncapsulated :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- comDayCrxSecurityTokenImplImplTokenAuthenticationHandlerPropertiesSkipTokenRefresh :: Maybe ConfigNodePropertyArray
    
instance Arbitrary ComDayCrxSecurityTokenImplTokenCleanupTaskInfo where
  arbitrary =
    ComDayCrxSecurityTokenImplTokenCleanupTaskInfo
      <$> arbitrary -- comDayCrxSecurityTokenImplTokenCleanupTaskInfoPid :: Maybe Text
      <*> arbitrary -- comDayCrxSecurityTokenImplTokenCleanupTaskInfoTitle :: Maybe Text
      <*> arbitrary -- comDayCrxSecurityTokenImplTokenCleanupTaskInfoDescription :: Maybe Text
      <*> arbitrary -- comDayCrxSecurityTokenImplTokenCleanupTaskInfoProperties :: Maybe ComDayCrxSecurityTokenImplTokenCleanupTaskProperties
    
instance Arbitrary ComDayCrxSecurityTokenImplTokenCleanupTaskProperties where
  arbitrary =
    ComDayCrxSecurityTokenImplTokenCleanupTaskProperties
      <$> arbitrary -- comDayCrxSecurityTokenImplTokenCleanupTaskPropertiesEnableTokenCleanupTask :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- comDayCrxSecurityTokenImplTokenCleanupTaskPropertiesSchedulerExpression :: Maybe ConfigNodePropertyString
      <*> arbitrary -- comDayCrxSecurityTokenImplTokenCleanupTaskPropertiesBatchSize :: Maybe ConfigNodePropertyInteger
    
instance Arbitrary ConfigNodePropertyArray where
  arbitrary =
    ConfigNodePropertyArray
      <$> arbitrary -- configNodePropertyArrayName :: Maybe Text
      <*> arbitrary -- configNodePropertyArrayOptional :: Maybe Bool
      <*> arbitrary -- configNodePropertyArrayIsSet :: Maybe Bool
      <*> arbitrary -- configNodePropertyArrayType :: Maybe Int
      <*> arbitrary -- configNodePropertyArrayValues :: Maybe [Text]
      <*> arbitrary -- configNodePropertyArrayDescription :: Maybe Text
    
instance Arbitrary ConfigNodePropertyBoolean where
  arbitrary =
    ConfigNodePropertyBoolean
      <$> arbitrary -- configNodePropertyBooleanName :: Maybe Text
      <*> arbitrary -- configNodePropertyBooleanOptional :: Maybe Bool
      <*> arbitrary -- configNodePropertyBooleanIsSet :: Maybe Bool
      <*> arbitrary -- configNodePropertyBooleanType :: Maybe Int
      <*> arbitrary -- configNodePropertyBooleanValue :: Maybe Bool
      <*> arbitrary -- configNodePropertyBooleanDescription :: Maybe Text
    
instance Arbitrary ConfigNodePropertyDropDown where
  arbitrary =
    ConfigNodePropertyDropDown
      <$> arbitrary -- configNodePropertyDropDownName :: Maybe Text
      <*> arbitrary -- configNodePropertyDropDownOptional :: Maybe Bool
      <*> arbitrary -- configNodePropertyDropDownIsSet :: Maybe Bool
      <*> arbitrary -- configNodePropertyDropDownType :: Maybe ConfigNodePropertyDropDownType
      <*> arbitrary -- configNodePropertyDropDownValue :: Maybe A.Value
      <*> arbitrary -- configNodePropertyDropDownDescription :: Maybe Text
    
instance Arbitrary ConfigNodePropertyDropDownType where
  arbitrary =
    ConfigNodePropertyDropDownType
      <$> arbitrary -- configNodePropertyDropDownTypeLabels :: Maybe A.Value
      <*> arbitrary -- configNodePropertyDropDownTypeValues :: Maybe A.Value
    
instance Arbitrary ConfigNodePropertyFloat where
  arbitrary =
    ConfigNodePropertyFloat
      <$> arbitrary -- configNodePropertyFloatName :: Maybe Text
      <*> arbitrary -- configNodePropertyFloatOptional :: Maybe Bool
      <*> arbitrary -- configNodePropertyFloatIsSet :: Maybe Bool
      <*> arbitrary -- configNodePropertyFloatType :: Maybe Int
      <*> arbitrary -- configNodePropertyFloatValue :: Maybe Double
      <*> arbitrary -- configNodePropertyFloatDescription :: Maybe Text
    
instance Arbitrary ConfigNodePropertyInteger where
  arbitrary =
    ConfigNodePropertyInteger
      <$> arbitrary -- configNodePropertyIntegerName :: Maybe Text
      <*> arbitrary -- configNodePropertyIntegerOptional :: Maybe Bool
      <*> arbitrary -- configNodePropertyIntegerIsSet :: Maybe Bool
      <*> arbitrary -- configNodePropertyIntegerType :: Maybe Int
      <*> arbitrary -- configNodePropertyIntegerValue :: Maybe Int
      <*> arbitrary -- configNodePropertyIntegerDescription :: Maybe Text
    
instance Arbitrary ConfigNodePropertyString where
  arbitrary =
    ConfigNodePropertyString
      <$> arbitrary -- configNodePropertyStringName :: Maybe Text
      <*> arbitrary -- configNodePropertyStringOptional :: Maybe Bool
      <*> arbitrary -- configNodePropertyStringIsSet :: Maybe Bool
      <*> arbitrary -- configNodePropertyStringType :: Maybe Int
      <*> arbitrary -- configNodePropertyStringValue :: Maybe Text
      <*> arbitrary -- configNodePropertyStringDescription :: Maybe Text
    
instance Arbitrary GuideLocalizationServiceInfo where
  arbitrary =
    GuideLocalizationServiceInfo
      <$> arbitrary -- guideLocalizationServiceInfoPid :: Maybe Text
      <*> arbitrary -- guideLocalizationServiceInfoTitle :: Maybe Text
      <*> arbitrary -- guideLocalizationServiceInfoDescription :: Maybe Text
      <*> arbitrary -- guideLocalizationServiceInfoProperties :: Maybe GuideLocalizationServiceProperties
    
instance Arbitrary GuideLocalizationServiceProperties where
  arbitrary =
    GuideLocalizationServiceProperties
      <$> arbitrary -- guideLocalizationServicePropertiesSupportedLocales :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- guideLocalizationServicePropertiesLocalizableProperties :: Maybe ConfigNodePropertyArray
    
instance Arbitrary MessagingUserComponentFactoryInfo where
  arbitrary =
    MessagingUserComponentFactoryInfo
      <$> arbitrary -- messagingUserComponentFactoryInfoPid :: Maybe Text
      <*> arbitrary -- messagingUserComponentFactoryInfoTitle :: Maybe Text
      <*> arbitrary -- messagingUserComponentFactoryInfoDescription :: Maybe Text
      <*> arbitrary -- messagingUserComponentFactoryInfoProperties :: Maybe MessagingUserComponentFactoryProperties
    
instance Arbitrary MessagingUserComponentFactoryProperties where
  arbitrary =
    MessagingUserComponentFactoryProperties
      <$> arbitrary -- messagingUserComponentFactoryPropertiesPriority :: Maybe ConfigNodePropertyInteger
    
instance Arbitrary OrgApacheAriesJmxFrameworkStateConfigInfo where
  arbitrary =
    OrgApacheAriesJmxFrameworkStateConfigInfo
      <$> arbitrary -- orgApacheAriesJmxFrameworkStateConfigInfoPid :: Maybe Text
      <*> arbitrary -- orgApacheAriesJmxFrameworkStateConfigInfoTitle :: Maybe Text
      <*> arbitrary -- orgApacheAriesJmxFrameworkStateConfigInfoDescription :: Maybe Text
      <*> arbitrary -- orgApacheAriesJmxFrameworkStateConfigInfoProperties :: Maybe OrgApacheAriesJmxFrameworkStateConfigProperties
      <*> arbitrary -- orgApacheAriesJmxFrameworkStateConfigInfoBundleLocation :: Maybe Text
      <*> arbitrary -- orgApacheAriesJmxFrameworkStateConfigInfoServiceLocation :: Maybe Text
    
instance Arbitrary OrgApacheAriesJmxFrameworkStateConfigProperties where
  arbitrary =
    OrgApacheAriesJmxFrameworkStateConfigProperties
      <$> arbitrary -- orgApacheAriesJmxFrameworkStateConfigPropertiesAttributeChangeNotificationEnabled :: Maybe ConfigNodePropertyBoolean
    
instance Arbitrary OrgApacheFelixEventadminImplEventAdminInfo where
  arbitrary =
    OrgApacheFelixEventadminImplEventAdminInfo
      <$> arbitrary -- orgApacheFelixEventadminImplEventAdminInfoPid :: Maybe Text
      <*> arbitrary -- orgApacheFelixEventadminImplEventAdminInfoTitle :: Maybe Text
      <*> arbitrary -- orgApacheFelixEventadminImplEventAdminInfoDescription :: Maybe Text
      <*> arbitrary -- orgApacheFelixEventadminImplEventAdminInfoProperties :: Maybe OrgApacheFelixEventadminImplEventAdminProperties
      <*> arbitrary -- orgApacheFelixEventadminImplEventAdminInfoBundleLocation :: Maybe Text
      <*> arbitrary -- orgApacheFelixEventadminImplEventAdminInfoServiceLocation :: Maybe Text
    
instance Arbitrary OrgApacheFelixEventadminImplEventAdminProperties where
  arbitrary =
    OrgApacheFelixEventadminImplEventAdminProperties
      <$> arbitrary -- orgApacheFelixEventadminImplEventAdminPropertiesOrgApacheFelixEventadminThreadPoolSize :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheFelixEventadminImplEventAdminPropertiesOrgApacheFelixEventadminAsyncToSyncThreadRatio :: Maybe ConfigNodePropertyFloat
      <*> arbitrary -- orgApacheFelixEventadminImplEventAdminPropertiesOrgApacheFelixEventadminTimeout :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheFelixEventadminImplEventAdminPropertiesOrgApacheFelixEventadminRequireTopic :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- orgApacheFelixEventadminImplEventAdminPropertiesOrgApacheFelixEventadminIgnoreTimeout :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- orgApacheFelixEventadminImplEventAdminPropertiesOrgApacheFelixEventadminIgnoreTopic :: Maybe ConfigNodePropertyArray
    
instance Arbitrary OrgApacheFelixHttpInfo where
  arbitrary =
    OrgApacheFelixHttpInfo
      <$> arbitrary -- orgApacheFelixHttpInfoPid :: Maybe Text
      <*> arbitrary -- orgApacheFelixHttpInfoTitle :: Maybe Text
      <*> arbitrary -- orgApacheFelixHttpInfoDescription :: Maybe Text
      <*> arbitrary -- orgApacheFelixHttpInfoProperties :: Maybe OrgApacheFelixHttpProperties
      <*> arbitrary -- orgApacheFelixHttpInfoBundleLocation :: Maybe Text
      <*> arbitrary -- orgApacheFelixHttpInfoServiceLocation :: Maybe Text
    
instance Arbitrary OrgApacheFelixHttpProperties where
  arbitrary =
    OrgApacheFelixHttpProperties
      <$> arbitrary -- orgApacheFelixHttpPropertiesOrgApacheFelixHttpHost :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheFelixHttpPropertiesOrgApacheFelixHttpEnable :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- orgApacheFelixHttpPropertiesOrgOsgiServiceHttpPort :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheFelixHttpPropertiesOrgApacheFelixHttpTimeout :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheFelixHttpPropertiesOrgApacheFelixHttpsEnable :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- orgApacheFelixHttpPropertiesOrgOsgiServiceHttpPortSecure :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheFelixHttpPropertiesOrgApacheFelixHttpsKeystore :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheFelixHttpPropertiesOrgApacheFelixHttpsKeystorePassword :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheFelixHttpPropertiesOrgApacheFelixHttpsKeystoreKeyPassword :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheFelixHttpPropertiesOrgApacheFelixHttpsTruststore :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheFelixHttpPropertiesOrgApacheFelixHttpsTruststorePassword :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheFelixHttpPropertiesOrgApacheFelixHttpsClientcertificate :: Maybe ConfigNodePropertyDropDown
      <*> arbitrary -- orgApacheFelixHttpPropertiesOrgApacheFelixHttpContextPath :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheFelixHttpPropertiesOrgApacheFelixHttpMbeans :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- orgApacheFelixHttpPropertiesOrgApacheFelixHttpSessionTimeout :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheFelixHttpPropertiesOrgApacheFelixHttpJettyThreadpoolMax :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheFelixHttpPropertiesOrgApacheFelixHttpJettyAcceptors :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheFelixHttpPropertiesOrgApacheFelixHttpJettySelectors :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheFelixHttpPropertiesOrgApacheFelixHttpJettyHeaderBufferSize :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheFelixHttpPropertiesOrgApacheFelixHttpJettyRequestBufferSize :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheFelixHttpPropertiesOrgApacheFelixHttpJettyResponseBufferSize :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheFelixHttpPropertiesOrgApacheFelixHttpJettyMaxFormSize :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheFelixHttpPropertiesOrgApacheFelixHttpPathExclusions :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- orgApacheFelixHttpPropertiesOrgApacheFelixHttpsJettyCiphersuitesExcluded :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- orgApacheFelixHttpPropertiesOrgApacheFelixHttpsJettyCiphersuitesIncluded :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- orgApacheFelixHttpPropertiesOrgApacheFelixHttpJettySendServerHeader :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- orgApacheFelixHttpPropertiesOrgApacheFelixHttpsJettyProtocolsIncluded :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- orgApacheFelixHttpPropertiesOrgApacheFelixHttpsJettyProtocolsExcluded :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- orgApacheFelixHttpPropertiesOrgApacheFelixProxyLoadBalancerConnectionEnable :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- orgApacheFelixHttpPropertiesOrgApacheFelixHttpsJettyRenegotiateAllowed :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- orgApacheFelixHttpPropertiesOrgApacheFelixHttpsJettySessionCookieHttpOnly :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- orgApacheFelixHttpPropertiesOrgApacheFelixHttpsJettySessionCookieSecure :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- orgApacheFelixHttpPropertiesOrgEclipseJettyServletSessionIdPathParameterName :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheFelixHttpPropertiesOrgEclipseJettyServletCheckingRemoteSessionIdEncoding :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- orgApacheFelixHttpPropertiesOrgEclipseJettyServletSessionCookie :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheFelixHttpPropertiesOrgEclipseJettyServletSessionDomain :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheFelixHttpPropertiesOrgEclipseJettyServletSessionPath :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheFelixHttpPropertiesOrgEclipseJettyServletMaxAge :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheFelixHttpPropertiesOrgApacheFelixHttpName :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheFelixHttpPropertiesOrgApacheFelixJettyGziphandlerEnable :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- orgApacheFelixHttpPropertiesOrgApacheFelixJettyGzipMinGzipSize :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheFelixHttpPropertiesOrgApacheFelixJettyGzipCompressionLevel :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheFelixHttpPropertiesOrgApacheFelixJettyGzipInflateBufferSize :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheFelixHttpPropertiesOrgApacheFelixJettyGzipSyncFlush :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- orgApacheFelixHttpPropertiesOrgApacheFelixJettyGzipExcludedUserAgents :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- orgApacheFelixHttpPropertiesOrgApacheFelixJettyGzipIncludedMethods :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- orgApacheFelixHttpPropertiesOrgApacheFelixJettyGzipExcludedMethods :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- orgApacheFelixHttpPropertiesOrgApacheFelixJettyGzipIncludedPaths :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- orgApacheFelixHttpPropertiesOrgApacheFelixJettyGzipExcludedPaths :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- orgApacheFelixHttpPropertiesOrgApacheFelixJettyGzipIncludedMimeTypes :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- orgApacheFelixHttpPropertiesOrgApacheFelixJettyGzipExcludedMimeTypes :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- orgApacheFelixHttpPropertiesOrgApacheFelixHttpSessionInvalidate :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- orgApacheFelixHttpPropertiesOrgApacheFelixHttpSessionUniqueid :: Maybe ConfigNodePropertyBoolean
    
instance Arbitrary OrgApacheFelixHttpSslfilterSslFilterInfo where
  arbitrary =
    OrgApacheFelixHttpSslfilterSslFilterInfo
      <$> arbitrary -- orgApacheFelixHttpSslfilterSslFilterInfoPid :: Maybe Text
      <*> arbitrary -- orgApacheFelixHttpSslfilterSslFilterInfoTitle :: Maybe Text
      <*> arbitrary -- orgApacheFelixHttpSslfilterSslFilterInfoDescription :: Maybe Text
      <*> arbitrary -- orgApacheFelixHttpSslfilterSslFilterInfoProperties :: Maybe OrgApacheFelixHttpSslfilterSslFilterProperties
    
instance Arbitrary OrgApacheFelixHttpSslfilterSslFilterProperties where
  arbitrary =
    OrgApacheFelixHttpSslfilterSslFilterProperties
      <$> arbitrary -- orgApacheFelixHttpSslfilterSslFilterPropertiesSslForwardHeader :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheFelixHttpSslfilterSslFilterPropertiesSslForwardValue :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheFelixHttpSslfilterSslFilterPropertiesSslForwardCertHeader :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheFelixHttpSslfilterSslFilterPropertiesRewriteAbsoluteUrls :: Maybe ConfigNodePropertyBoolean
    
instance Arbitrary OrgApacheFelixJaasConfigurationFactoryInfo where
  arbitrary =
    OrgApacheFelixJaasConfigurationFactoryInfo
      <$> arbitrary -- orgApacheFelixJaasConfigurationFactoryInfoPid :: Maybe Text
      <*> arbitrary -- orgApacheFelixJaasConfigurationFactoryInfoTitle :: Maybe Text
      <*> arbitrary -- orgApacheFelixJaasConfigurationFactoryInfoDescription :: Maybe Text
      <*> arbitrary -- orgApacheFelixJaasConfigurationFactoryInfoProperties :: Maybe OrgApacheFelixJaasConfigurationFactoryProperties
    
instance Arbitrary OrgApacheFelixJaasConfigurationFactoryProperties where
  arbitrary =
    OrgApacheFelixJaasConfigurationFactoryProperties
      <$> arbitrary -- orgApacheFelixJaasConfigurationFactoryPropertiesJaasControlFlag :: Maybe ConfigNodePropertyDropDown
      <*> arbitrary -- orgApacheFelixJaasConfigurationFactoryPropertiesJaasRanking :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheFelixJaasConfigurationFactoryPropertiesJaasRealmName :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheFelixJaasConfigurationFactoryPropertiesJaasClassname :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheFelixJaasConfigurationFactoryPropertiesJaasOptions :: Maybe ConfigNodePropertyArray
    
instance Arbitrary OrgApacheFelixJaasConfigurationSpiInfo where
  arbitrary =
    OrgApacheFelixJaasConfigurationSpiInfo
      <$> arbitrary -- orgApacheFelixJaasConfigurationSpiInfoPid :: Maybe Text
      <*> arbitrary -- orgApacheFelixJaasConfigurationSpiInfoTitle :: Maybe Text
      <*> arbitrary -- orgApacheFelixJaasConfigurationSpiInfoDescription :: Maybe Text
      <*> arbitrary -- orgApacheFelixJaasConfigurationSpiInfoProperties :: Maybe OrgApacheFelixJaasConfigurationSpiProperties
      <*> arbitrary -- orgApacheFelixJaasConfigurationSpiInfoBundleLocation :: Maybe Text
      <*> arbitrary -- orgApacheFelixJaasConfigurationSpiInfoServiceLocation :: Maybe Text
    
instance Arbitrary OrgApacheFelixJaasConfigurationSpiProperties where
  arbitrary =
    OrgApacheFelixJaasConfigurationSpiProperties
      <$> arbitrary -- orgApacheFelixJaasConfigurationSpiPropertiesJaasDefaultRealmName :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheFelixJaasConfigurationSpiPropertiesJaasConfigProviderName :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheFelixJaasConfigurationSpiPropertiesJaasGlobalConfigPolicy :: Maybe ConfigNodePropertyDropDown
    
instance Arbitrary OrgApacheFelixScrScrServiceInfo where
  arbitrary =
    OrgApacheFelixScrScrServiceInfo
      <$> arbitrary -- orgApacheFelixScrScrServiceInfoPid :: Maybe Text
      <*> arbitrary -- orgApacheFelixScrScrServiceInfoTitle :: Maybe Text
      <*> arbitrary -- orgApacheFelixScrScrServiceInfoDescription :: Maybe Text
      <*> arbitrary -- orgApacheFelixScrScrServiceInfoProperties :: Maybe OrgApacheFelixScrScrServiceProperties
    
instance Arbitrary OrgApacheFelixScrScrServiceProperties where
  arbitrary =
    OrgApacheFelixScrScrServiceProperties
      <$> arbitrary -- orgApacheFelixScrScrServicePropertiesDsLoglevel :: Maybe ConfigNodePropertyDropDown
      <*> arbitrary -- orgApacheFelixScrScrServicePropertiesDsFactoryEnabled :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- orgApacheFelixScrScrServicePropertiesDsDelayedKeepInstances :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- orgApacheFelixScrScrServicePropertiesDsLockTimeoutMilliseconds :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheFelixScrScrServicePropertiesDsStopTimeoutMilliseconds :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheFelixScrScrServicePropertiesDsGlobalExtender :: Maybe ConfigNodePropertyBoolean
    
instance Arbitrary OrgApacheFelixSystemreadyImplComponentsCheckInfo where
  arbitrary =
    OrgApacheFelixSystemreadyImplComponentsCheckInfo
      <$> arbitrary -- orgApacheFelixSystemreadyImplComponentsCheckInfoPid :: Maybe Text
      <*> arbitrary -- orgApacheFelixSystemreadyImplComponentsCheckInfoTitle :: Maybe Text
      <*> arbitrary -- orgApacheFelixSystemreadyImplComponentsCheckInfoDescription :: Maybe Text
      <*> arbitrary -- orgApacheFelixSystemreadyImplComponentsCheckInfoProperties :: Maybe OrgApacheFelixSystemreadyImplComponentsCheckProperties
    
instance Arbitrary OrgApacheFelixSystemreadyImplComponentsCheckProperties where
  arbitrary =
    OrgApacheFelixSystemreadyImplComponentsCheckProperties
      <$> arbitrary -- orgApacheFelixSystemreadyImplComponentsCheckPropertiesComponentsList :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- orgApacheFelixSystemreadyImplComponentsCheckPropertiesType :: Maybe ConfigNodePropertyDropDown
    
instance Arbitrary OrgApacheFelixSystemreadyImplFrameworkStartCheckInfo where
  arbitrary =
    OrgApacheFelixSystemreadyImplFrameworkStartCheckInfo
      <$> arbitrary -- orgApacheFelixSystemreadyImplFrameworkStartCheckInfoPid :: Maybe Text
      <*> arbitrary -- orgApacheFelixSystemreadyImplFrameworkStartCheckInfoTitle :: Maybe Text
      <*> arbitrary -- orgApacheFelixSystemreadyImplFrameworkStartCheckInfoDescription :: Maybe Text
      <*> arbitrary -- orgApacheFelixSystemreadyImplFrameworkStartCheckInfoProperties :: Maybe OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties
    
instance Arbitrary OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties where
  arbitrary =
    OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties
      <$> arbitrary -- orgApacheFelixSystemreadyImplFrameworkStartCheckPropertiesTimeout :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheFelixSystemreadyImplFrameworkStartCheckPropertiesTargetStartLevel :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheFelixSystemreadyImplFrameworkStartCheckPropertiesTargetStartLevelPropName :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheFelixSystemreadyImplFrameworkStartCheckPropertiesType :: Maybe ConfigNodePropertyDropDown
    
instance Arbitrary OrgApacheFelixSystemreadyImplServicesCheckInfo where
  arbitrary =
    OrgApacheFelixSystemreadyImplServicesCheckInfo
      <$> arbitrary -- orgApacheFelixSystemreadyImplServicesCheckInfoPid :: Maybe Text
      <*> arbitrary -- orgApacheFelixSystemreadyImplServicesCheckInfoTitle :: Maybe Text
      <*> arbitrary -- orgApacheFelixSystemreadyImplServicesCheckInfoDescription :: Maybe Text
      <*> arbitrary -- orgApacheFelixSystemreadyImplServicesCheckInfoProperties :: Maybe OrgApacheFelixSystemreadyImplServicesCheckProperties
      <*> arbitrary -- orgApacheFelixSystemreadyImplServicesCheckInfoBundleLocation :: Maybe Text
      <*> arbitrary -- orgApacheFelixSystemreadyImplServicesCheckInfoServiceLocation :: Maybe Text
    
instance Arbitrary OrgApacheFelixSystemreadyImplServicesCheckProperties where
  arbitrary =
    OrgApacheFelixSystemreadyImplServicesCheckProperties
      <$> arbitrary -- orgApacheFelixSystemreadyImplServicesCheckPropertiesServicesList :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- orgApacheFelixSystemreadyImplServicesCheckPropertiesType :: Maybe ConfigNodePropertyDropDown
    
instance Arbitrary OrgApacheFelixSystemreadyImplServletSystemAliveServletInfo where
  arbitrary =
    OrgApacheFelixSystemreadyImplServletSystemAliveServletInfo
      <$> arbitrary -- orgApacheFelixSystemreadyImplServletSystemAliveServletInfoPid :: Maybe Text
      <*> arbitrary -- orgApacheFelixSystemreadyImplServletSystemAliveServletInfoTitle :: Maybe Text
      <*> arbitrary -- orgApacheFelixSystemreadyImplServletSystemAliveServletInfoDescription :: Maybe Text
      <*> arbitrary -- orgApacheFelixSystemreadyImplServletSystemAliveServletInfoProperties :: Maybe OrgApacheFelixSystemreadyImplServletSystemAliveServletProperties
      <*> arbitrary -- orgApacheFelixSystemreadyImplServletSystemAliveServletInfoBundleLocation :: Maybe Text
      <*> arbitrary -- orgApacheFelixSystemreadyImplServletSystemAliveServletInfoServiceLocation :: Maybe Text
    
instance Arbitrary OrgApacheFelixSystemreadyImplServletSystemAliveServletProperties where
  arbitrary =
    OrgApacheFelixSystemreadyImplServletSystemAliveServletProperties
      <$> arbitrary -- orgApacheFelixSystemreadyImplServletSystemAliveServletPropertiesOsgiHttpWhiteboardServletPattern :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheFelixSystemreadyImplServletSystemAliveServletPropertiesOsgiHttpWhiteboardContextSelect :: Maybe ConfigNodePropertyString
    
instance Arbitrary OrgApacheFelixSystemreadyImplServletSystemReadyServletInfo where
  arbitrary =
    OrgApacheFelixSystemreadyImplServletSystemReadyServletInfo
      <$> arbitrary -- orgApacheFelixSystemreadyImplServletSystemReadyServletInfoPid :: Maybe Text
      <*> arbitrary -- orgApacheFelixSystemreadyImplServletSystemReadyServletInfoTitle :: Maybe Text
      <*> arbitrary -- orgApacheFelixSystemreadyImplServletSystemReadyServletInfoDescription :: Maybe Text
      <*> arbitrary -- orgApacheFelixSystemreadyImplServletSystemReadyServletInfoProperties :: Maybe OrgApacheFelixSystemreadyImplServletSystemReadyServletProperties
      <*> arbitrary -- orgApacheFelixSystemreadyImplServletSystemReadyServletInfoBundleLocation :: Maybe Text
      <*> arbitrary -- orgApacheFelixSystemreadyImplServletSystemReadyServletInfoServiceLocation :: Maybe Text
    
instance Arbitrary OrgApacheFelixSystemreadyImplServletSystemReadyServletProperties where
  arbitrary =
    OrgApacheFelixSystemreadyImplServletSystemReadyServletProperties
      <$> arbitrary -- orgApacheFelixSystemreadyImplServletSystemReadyServletPropertiesOsgiHttpWhiteboardServletPattern :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheFelixSystemreadyImplServletSystemReadyServletPropertiesOsgiHttpWhiteboardContextSelect :: Maybe ConfigNodePropertyString
    
instance Arbitrary OrgApacheFelixSystemreadySystemReadyMonitorInfo where
  arbitrary =
    OrgApacheFelixSystemreadySystemReadyMonitorInfo
      <$> arbitrary -- orgApacheFelixSystemreadySystemReadyMonitorInfoPid :: Maybe Text
      <*> arbitrary -- orgApacheFelixSystemreadySystemReadyMonitorInfoTitle :: Maybe Text
      <*> arbitrary -- orgApacheFelixSystemreadySystemReadyMonitorInfoDescription :: Maybe Text
      <*> arbitrary -- orgApacheFelixSystemreadySystemReadyMonitorInfoProperties :: Maybe OrgApacheFelixSystemreadySystemReadyMonitorProperties
    
instance Arbitrary OrgApacheFelixSystemreadySystemReadyMonitorProperties where
  arbitrary =
    OrgApacheFelixSystemreadySystemReadyMonitorProperties
      <$> arbitrary -- orgApacheFelixSystemreadySystemReadyMonitorPropertiesPollInterval :: Maybe ConfigNodePropertyInteger
    
instance Arbitrary OrgApacheFelixWebconsoleInternalServletOsgiManagerInfo where
  arbitrary =
    OrgApacheFelixWebconsoleInternalServletOsgiManagerInfo
      <$> arbitrary -- orgApacheFelixWebconsoleInternalServletOsgiManagerInfoPid :: Maybe Text
      <*> arbitrary -- orgApacheFelixWebconsoleInternalServletOsgiManagerInfoTitle :: Maybe Text
      <*> arbitrary -- orgApacheFelixWebconsoleInternalServletOsgiManagerInfoDescription :: Maybe Text
      <*> arbitrary -- orgApacheFelixWebconsoleInternalServletOsgiManagerInfoProperties :: Maybe OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties
    
instance Arbitrary OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties where
  arbitrary =
    OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties
      <$> arbitrary -- orgApacheFelixWebconsoleInternalServletOsgiManagerPropertiesManagerRoot :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheFelixWebconsoleInternalServletOsgiManagerPropertiesHttpServiceFilter :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheFelixWebconsoleInternalServletOsgiManagerPropertiesDefaultRender :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheFelixWebconsoleInternalServletOsgiManagerPropertiesRealm :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheFelixWebconsoleInternalServletOsgiManagerPropertiesUsername :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheFelixWebconsoleInternalServletOsgiManagerPropertiesPassword :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheFelixWebconsoleInternalServletOsgiManagerPropertiesCategory :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheFelixWebconsoleInternalServletOsgiManagerPropertiesLocale :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheFelixWebconsoleInternalServletOsgiManagerPropertiesLoglevel :: Maybe ConfigNodePropertyDropDown
      <*> arbitrary -- orgApacheFelixWebconsoleInternalServletOsgiManagerPropertiesPlugins :: Maybe ConfigNodePropertyDropDown
    
instance Arbitrary OrgApacheFelixWebconsolePluginsEventInternalPluginServletInfo where
  arbitrary =
    OrgApacheFelixWebconsolePluginsEventInternalPluginServletInfo
      <$> arbitrary -- orgApacheFelixWebconsolePluginsEventInternalPluginServletInfoPid :: Maybe Text
      <*> arbitrary -- orgApacheFelixWebconsolePluginsEventInternalPluginServletInfoTitle :: Maybe Text
      <*> arbitrary -- orgApacheFelixWebconsolePluginsEventInternalPluginServletInfoDescription :: Maybe Text
      <*> arbitrary -- orgApacheFelixWebconsolePluginsEventInternalPluginServletInfoProperties :: Maybe OrgApacheFelixWebconsolePluginsEventInternalPluginServletProperties
    
instance Arbitrary OrgApacheFelixWebconsolePluginsEventInternalPluginServletProperties where
  arbitrary =
    OrgApacheFelixWebconsolePluginsEventInternalPluginServletProperties
      <$> arbitrary -- orgApacheFelixWebconsolePluginsEventInternalPluginServletPropertiesMaxSize :: Maybe ConfigNodePropertyInteger
    
instance Arbitrary OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoInfo where
  arbitrary =
    OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoInfo
      <$> arbitrary -- orgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoInfoPid :: Maybe Text
      <*> arbitrary -- orgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoInfoTitle :: Maybe Text
      <*> arbitrary -- orgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoInfoDescription :: Maybe Text
      <*> arbitrary -- orgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoInfoProperties :: Maybe OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties
    
instance Arbitrary OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties where
  arbitrary =
    OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties
      <$> arbitrary -- orgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoPropertiesFelixMemoryusageDumpThreshold :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoPropertiesFelixMemoryusageDumpInterval :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoPropertiesFelixMemoryusageDumpLocation :: Maybe ConfigNodePropertyString
    
instance Arbitrary OrgApacheHttpProxyconfiguratorInfo where
  arbitrary =
    OrgApacheHttpProxyconfiguratorInfo
      <$> arbitrary -- orgApacheHttpProxyconfiguratorInfoPid :: Maybe Text
      <*> arbitrary -- orgApacheHttpProxyconfiguratorInfoTitle :: Maybe Text
      <*> arbitrary -- orgApacheHttpProxyconfiguratorInfoDescription :: Maybe Text
      <*> arbitrary -- orgApacheHttpProxyconfiguratorInfoProperties :: Maybe OrgApacheHttpProxyconfiguratorProperties
    
instance Arbitrary OrgApacheHttpProxyconfiguratorProperties where
  arbitrary =
    OrgApacheHttpProxyconfiguratorProperties
      <$> arbitrary -- orgApacheHttpProxyconfiguratorPropertiesProxyEnabled :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- orgApacheHttpProxyconfiguratorPropertiesProxyHost :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheHttpProxyconfiguratorPropertiesProxyPort :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheHttpProxyconfiguratorPropertiesProxyUser :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheHttpProxyconfiguratorPropertiesProxyPassword :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheHttpProxyconfiguratorPropertiesProxyExceptions :: Maybe ConfigNodePropertyArray
    
instance Arbitrary OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderInfo where
  arbitrary =
    OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderInfo
      <$> arbitrary -- orgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderInfoPid :: Maybe Text
      <*> arbitrary -- orgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderInfoTitle :: Maybe Text
      <*> arbitrary -- orgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderInfoDescription :: Maybe Text
      <*> arbitrary -- orgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderInfoProperties :: Maybe OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderProperties
    
instance Arbitrary OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderProperties where
  arbitrary =
    OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderProperties
      <$> arbitrary -- orgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderPropertiesDir :: Maybe ConfigNodePropertyString
    
instance Arbitrary OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreInfo where
  arbitrary =
    OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreInfo
      <$> arbitrary -- orgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreInfoPid :: Maybe Text
      <*> arbitrary -- orgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreInfoTitle :: Maybe Text
      <*> arbitrary -- orgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreInfoDescription :: Maybe Text
      <*> arbitrary -- orgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreInfoProperties :: Maybe OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreProperties
      <*> arbitrary -- orgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreInfoBundleLocation :: Maybe Text
      <*> arbitrary -- orgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreInfoServiceLocation :: Maybe Text
    
instance Arbitrary OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreProperties where
  arbitrary =
    OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreProperties
      <$> arbitrary -- orgApacheJackrabbitOakPluginsBlobDatastoreFileDataStorePropertiesPath :: Maybe ConfigNodePropertyString
    
instance Arbitrary OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceInfo where
  arbitrary =
    OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceInfo
      <$> arbitrary -- orgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceInfoPid :: Maybe Text
      <*> arbitrary -- orgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceInfoTitle :: Maybe Text
      <*> arbitrary -- orgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceInfoDescription :: Maybe Text
      <*> arbitrary -- orgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceInfoProperties :: Maybe OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties
    
instance Arbitrary OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreInfo where
  arbitrary =
    OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreInfo
      <$> arbitrary -- orgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreInfoPid :: Maybe Text
      <*> arbitrary -- orgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreInfoTitle :: Maybe Text
      <*> arbitrary -- orgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreInfoDescription :: Maybe Text
      <*> arbitrary -- orgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreInfoProperties :: Maybe OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreProperties
      <*> arbitrary -- orgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreInfoBundleLocation :: Maybe Text
      <*> arbitrary -- orgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreInfoServiceLocation :: Maybe Text
    
instance Arbitrary OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreProperties where
  arbitrary =
    OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePreProperties
      <$> arbitrary -- orgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePrePropertiesPersistentCacheIncludes :: Maybe ConfigNodePropertyArray
    
instance Arbitrary OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties where
  arbitrary =
    OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties
      <$> arbitrary -- orgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePropertiesMongouri :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePropertiesDb :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePropertiesSocketKeepAlive :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- orgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePropertiesCache :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePropertiesNodeCachePercentage :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePropertiesPrevDocCachePercentage :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePropertiesChildrenCachePercentage :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePropertiesDiffCachePercentage :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePropertiesCacheSegmentCount :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePropertiesCacheStackMoveDistance :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePropertiesBlobCacheSize :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePropertiesPersistentCache :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePropertiesJournalCache :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePropertiesCustomBlobStore :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- orgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePropertiesJournalGcInterval :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePropertiesJournalGcMaxAge :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePropertiesPrefetchExternalChanges :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- orgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePropertiesRole :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePropertiesVersionGcMaxAgeInSecs :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePropertiesVersionGcExpression :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePropertiesVersionGcTimeLimitInSecs :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePropertiesBlobGcMaxAgeInSecs :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePropertiesBlobTrackSnapshotIntervalInSecs :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePropertiesRepositoryHome :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePropertiesMaxReplicationLagInSecs :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePropertiesDocumentStoreType :: Maybe ConfigNodePropertyDropDown
      <*> arbitrary -- orgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePropertiesBundlingDisabled :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- orgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePropertiesUpdateLimit :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePropertiesPersistentCacheIncludes :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- orgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServicePropertiesLeaseCheckMode :: Maybe ConfigNodePropertyDropDown
    
instance Arbitrary OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacInfo where
  arbitrary =
    OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacInfo
      <$> arbitrary -- orgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacInfoPid :: Maybe Text
      <*> arbitrary -- orgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacInfoTitle :: Maybe Text
      <*> arbitrary -- orgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacInfoDescription :: Maybe Text
      <*> arbitrary -- orgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacInfoProperties :: Maybe OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties
    
instance Arbitrary OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties where
  arbitrary =
    OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties
      <$> arbitrary -- orgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacPropertiesIncludedPaths :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- orgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacPropertiesEnableAsyncObserver :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- orgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacPropertiesObserverQueueSize :: Maybe ConfigNodePropertyInteger
    
instance Arbitrary OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceInfo where
  arbitrary =
    OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceInfo
      <$> arbitrary -- orgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceInfoPid :: Maybe Text
      <*> arbitrary -- orgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceInfoTitle :: Maybe Text
      <*> arbitrary -- orgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceInfoDescription :: Maybe Text
      <*> arbitrary -- orgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceInfoProperties :: Maybe OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties
      <*> arbitrary -- orgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceInfoBundleLocation :: Maybe Text
      <*> arbitrary -- orgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceInfoServiceLocation :: Maybe Text
    
instance Arbitrary OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties where
  arbitrary =
    OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties
      <$> arbitrary -- orgApacheJackrabbitOakPluginsIndexAsyncIndexerServicePropertiesAsyncConfigs :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- orgApacheJackrabbitOakPluginsIndexAsyncIndexerServicePropertiesLeaseTimeOutMinutes :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheJackrabbitOakPluginsIndexAsyncIndexerServicePropertiesFailingIndexTimeoutSeconds :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheJackrabbitOakPluginsIndexAsyncIndexerServicePropertiesErrorWarnIntervalSeconds :: Maybe ConfigNodePropertyInteger
    
instance Arbitrary OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServInfo where
  arbitrary =
    OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServInfo
      <$> arbitrary -- orgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServInfoPid :: Maybe Text
      <*> arbitrary -- orgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServInfoTitle :: Maybe Text
      <*> arbitrary -- orgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServInfoDescription :: Maybe Text
      <*> arbitrary -- orgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServInfoProperties :: Maybe OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties
      <*> arbitrary -- orgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServInfoAdditionalProperties :: Maybe Text
      <*> arbitrary -- orgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServInfoBundleLocation :: Maybe Text
      <*> arbitrary -- orgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServInfoServiceLocation :: Maybe Text
    
instance Arbitrary OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties where
  arbitrary =
    OrgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServProperties
      <$> arbitrary -- orgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServPropertiesDisabled :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- orgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServPropertiesDebug :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- orgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServPropertiesLocalIndexDir :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServPropertiesEnableOpenIndexAsync :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- orgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServPropertiesThreadPoolSize :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServPropertiesPrefetchIndexFiles :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- orgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServPropertiesExtractedTextCacheSizeInMb :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServPropertiesExtractedTextCacheExpiryInSecs :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServPropertiesAlwaysUsePreExtractedCache :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- orgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServPropertiesBooleanClauseLimit :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServPropertiesEnableHybridIndexing :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- orgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServPropertiesHybridQueueSize :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServPropertiesDisableStoredIndexDefinition :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- orgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServPropertiesDeletedBlobsCollectionEnabled :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- orgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServPropertiesPropIndexCleanerIntervalInSecs :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheJackrabbitOakPluginsIndexLuceneLuceneIndexProviderServPropertiesEnableSingleBlobIndexFiles :: Maybe ConfigNodePropertyBoolean
    
instance Arbitrary OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoInfo where
  arbitrary =
    OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoInfo
      <$> arbitrary -- orgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoInfoPid :: Maybe Text
      <*> arbitrary -- orgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoInfoTitle :: Maybe Text
      <*> arbitrary -- orgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoInfoDescription :: Maybe Text
      <*> arbitrary -- orgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoInfoProperties :: Maybe OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties
    
instance Arbitrary OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties where
  arbitrary =
    OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties
      <$> arbitrary -- orgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoPropertiesSolrHomePath :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoPropertiesSolrCoreName :: Maybe ConfigNodePropertyString
    
instance Arbitrary OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersInfo where
  arbitrary =
    OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersInfo
      <$> arbitrary -- orgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersInfoPid :: Maybe Text
      <*> arbitrary -- orgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersInfoTitle :: Maybe Text
      <*> arbitrary -- orgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersInfoDescription :: Maybe Text
      <*> arbitrary -- orgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersInfoProperties :: Maybe OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersProperties
    
instance Arbitrary OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersProperties where
  arbitrary =
    OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersProperties
      <$> arbitrary -- orgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersPropertiesEnabled :: Maybe ConfigNodePropertyBoolean
    
instance Arbitrary OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationInfo where
  arbitrary =
    OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationInfo
      <$> arbitrary -- orgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationInfoPid :: Maybe Text
      <*> arbitrary -- orgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationInfoTitle :: Maybe Text
      <*> arbitrary -- orgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationInfoDescription :: Maybe Text
      <*> arbitrary -- orgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationInfoProperties :: Maybe OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties
    
instance Arbitrary OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties where
  arbitrary =
    OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties
      <$> arbitrary -- orgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationPropertiesPathDescField :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationPropertiesPathChildField :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationPropertiesPathParentField :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationPropertiesPathExactField :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationPropertiesCatchAllField :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationPropertiesCollapsedPathField :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationPropertiesPathDepthField :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationPropertiesCommitPolicy :: Maybe ConfigNodePropertyDropDown
      <*> arbitrary -- orgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationPropertiesRows :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationPropertiesPathRestrictions :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- orgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationPropertiesPropertyRestrictions :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- orgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationPropertiesPrimarytypesRestrictions :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- orgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationPropertiesIgnoredProperties :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- orgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationPropertiesUsedProperties :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- orgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationPropertiesTypeMappings :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- orgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationPropertiesPropertyMappings :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- orgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationPropertiesCollapseJcrcontentNodes :: Maybe ConfigNodePropertyBoolean
    
instance Arbitrary OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfInfo where
  arbitrary =
    OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfInfo
      <$> arbitrary -- orgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfInfoPid :: Maybe Text
      <*> arbitrary -- orgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfInfoTitle :: Maybe Text
      <*> arbitrary -- orgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfInfoDescription :: Maybe Text
      <*> arbitrary -- orgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfInfoProperties :: Maybe OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties
    
instance Arbitrary OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties where
  arbitrary =
    OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties
      <$> arbitrary -- orgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfPropertiesSolrHttpUrl :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfPropertiesSolrZkHost :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfPropertiesSolrCollection :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfPropertiesSolrSocketTimeout :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfPropertiesSolrConnectionTimeout :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfPropertiesSolrShardsNo :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfPropertiesSolrReplicationFactor :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfPropertiesSolrConfDir :: Maybe ConfigNodePropertyString
    
instance Arbitrary OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidInfo where
  arbitrary =
    OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidInfo
      <$> arbitrary -- orgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidInfoPid :: Maybe Text
      <*> arbitrary -- orgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidInfoTitle :: Maybe Text
      <*> arbitrary -- orgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidInfoDescription :: Maybe Text
      <*> arbitrary -- orgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidInfoProperties :: Maybe OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidProperties
    
instance Arbitrary OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidProperties where
  arbitrary =
    OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidProperties
      <$> arbitrary -- orgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidPropertiesQueryAggregation :: Maybe ConfigNodePropertyBoolean
    
instance Arbitrary OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeInfo where
  arbitrary =
    OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeInfo
      <$> arbitrary -- orgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeInfoPid :: Maybe Text
      <*> arbitrary -- orgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeInfoTitle :: Maybe Text
      <*> arbitrary -- orgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeInfoDescription :: Maybe Text
      <*> arbitrary -- orgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeInfoProperties :: Maybe OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties
    
instance Arbitrary OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties where
  arbitrary =
    OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties
      <$> arbitrary -- orgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSePropertiesServerType :: Maybe ConfigNodePropertyDropDown
    
instance Arbitrary OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryInfo where
  arbitrary =
    OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryInfo
      <$> arbitrary -- orgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryInfoPid :: Maybe Text
      <*> arbitrary -- orgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryInfoTitle :: Maybe Text
      <*> arbitrary -- orgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryInfoDescription :: Maybe Text
      <*> arbitrary -- orgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryInfoProperties :: Maybe OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties
    
instance Arbitrary OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties where
  arbitrary =
    OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties
      <$> arbitrary -- orgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryPropertiesProviderType :: Maybe ConfigNodePropertyDropDown
    
instance Arbitrary OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderInfo where
  arbitrary =
    OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderInfo
      <$> arbitrary -- orgApacheJackrabbitOakPluginsObservationChangeCollectorProviderInfoPid :: Maybe Text
      <*> arbitrary -- orgApacheJackrabbitOakPluginsObservationChangeCollectorProviderInfoTitle :: Maybe Text
      <*> arbitrary -- orgApacheJackrabbitOakPluginsObservationChangeCollectorProviderInfoDescription :: Maybe Text
      <*> arbitrary -- orgApacheJackrabbitOakPluginsObservationChangeCollectorProviderInfoProperties :: Maybe OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties
      <*> arbitrary -- orgApacheJackrabbitOakPluginsObservationChangeCollectorProviderInfoBundleLocation :: Maybe Text
      <*> arbitrary -- orgApacheJackrabbitOakPluginsObservationChangeCollectorProviderInfoServiceLocation :: Maybe Text
    
instance Arbitrary OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties where
  arbitrary =
    OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties
      <$> arbitrary -- orgApacheJackrabbitOakPluginsObservationChangeCollectorProviderPropertiesMaxItems :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheJackrabbitOakPluginsObservationChangeCollectorProviderPropertiesMaxPathDepth :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheJackrabbitOakPluginsObservationChangeCollectorProviderPropertiesEnabled :: Maybe ConfigNodePropertyBoolean
    
instance Arbitrary OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceInfo where
  arbitrary =
    OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceInfo
      <$> arbitrary -- orgApacheJackrabbitOakQueryQueryEngineSettingsServiceInfoPid :: Maybe Text
      <*> arbitrary -- orgApacheJackrabbitOakQueryQueryEngineSettingsServiceInfoTitle :: Maybe Text
      <*> arbitrary -- orgApacheJackrabbitOakQueryQueryEngineSettingsServiceInfoDescription :: Maybe Text
      <*> arbitrary -- orgApacheJackrabbitOakQueryQueryEngineSettingsServiceInfoProperties :: Maybe OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties
    
instance Arbitrary OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties where
  arbitrary =
    OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties
      <$> arbitrary -- orgApacheJackrabbitOakQueryQueryEngineSettingsServicePropertiesQueryLimitInMemory :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheJackrabbitOakQueryQueryEngineSettingsServicePropertiesQueryLimitReads :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheJackrabbitOakQueryQueryEngineSettingsServicePropertiesQueryFailTraversal :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- orgApacheJackrabbitOakQueryQueryEngineSettingsServicePropertiesFastQuerySize :: Maybe ConfigNodePropertyBoolean
    
instance Arbitrary OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigInfo where
  arbitrary =
    OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigInfo
      <$> arbitrary -- orgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigInfoPid :: Maybe Text
      <*> arbitrary -- orgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigInfoTitle :: Maybe Text
      <*> arbitrary -- orgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigInfoDescription :: Maybe Text
      <*> arbitrary -- orgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigInfoProperties :: Maybe OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties
    
instance Arbitrary OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties where
  arbitrary =
    OrgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigProperties
      <$> arbitrary -- orgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigPropertiesOrgApacheJackrabbitOakAuthenticationAppName :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheJackrabbitOakSecurityAuthenticationAuthenticationConfigPropertiesOrgApacheJackrabbitOakAuthenticationConfigSpiName :: Maybe ConfigNodePropertyString
    
instance Arbitrary OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiInfo where
  arbitrary =
    OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiInfo
      <$> arbitrary -- orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiInfoPid :: Maybe Text
      <*> arbitrary -- orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiInfoTitle :: Maybe Text
      <*> arbitrary -- orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiInfoDescription :: Maybe Text
      <*> arbitrary -- orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiInfoProperties :: Maybe OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties
    
instance Arbitrary OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties where
  arbitrary =
    OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties
      <$> arbitrary -- orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiPropertiesProviderName :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiPropertiesHostName :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiPropertiesHostPort :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiPropertiesHostSsl :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiPropertiesHostTls :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiPropertiesHostNoCertCheck :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiPropertiesBindDn :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiPropertiesBindPassword :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiPropertiesSearchTimeout :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiPropertiesAdminPoolMaxActive :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiPropertiesAdminPoolLookupOnValidate :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiPropertiesUserPoolMaxActive :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiPropertiesUserPoolLookupOnValidate :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiPropertiesUserBaseDn :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiPropertiesUserObjectclass :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiPropertiesUserIdAttribute :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiPropertiesUserExtraFilter :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiPropertiesUserMakeDnPath :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiPropertiesGroupBaseDn :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiPropertiesGroupObjectclass :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiPropertiesGroupNameAttribute :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiPropertiesGroupExtraFilter :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiPropertiesGroupMakeDnPath :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiPropertiesGroupMemberAttribute :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiPropertiesUseUidForExtId :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiPropertiesCustomattributes :: Maybe ConfigNodePropertyArray
    
instance Arbitrary OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraInfo where
  arbitrary =
    OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraInfo
      <$> arbitrary -- orgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraInfoPid :: Maybe Text
      <*> arbitrary -- orgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraInfoTitle :: Maybe Text
      <*> arbitrary -- orgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraInfoDescription :: Maybe Text
      <*> arbitrary -- orgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraInfoProperties :: Maybe OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties
      <*> arbitrary -- orgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraInfoBundleLocation :: Maybe Text
      <*> arbitrary -- orgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraInfoServiceLocation :: Maybe Text
    
instance Arbitrary OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties where
  arbitrary =
    OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties
      <$> arbitrary -- orgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraPropertiesTokenExpiration :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraPropertiesTokenLength :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraPropertiesTokenRefresh :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- orgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraPropertiesTokenCleanupThreshold :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraPropertiesPasswordHashAlgorithm :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraPropertiesPasswordHashIterations :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraPropertiesPasswordSaltSize :: Maybe ConfigNodePropertyInteger
    
instance Arbitrary OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurInfo where
  arbitrary =
    OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurInfo
      <$> arbitrary -- orgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurInfoPid :: Maybe Text
      <*> arbitrary -- orgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurInfoTitle :: Maybe Text
      <*> arbitrary -- orgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurInfoDescription :: Maybe Text
      <*> arbitrary -- orgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurInfoProperties :: Maybe OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties
      <*> arbitrary -- orgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurInfoBundleLocation :: Maybe Text
      <*> arbitrary -- orgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurInfoServiceLocation :: Maybe Text
    
instance Arbitrary OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties where
  arbitrary =
    OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties
      <$> arbitrary -- orgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurPropertiesPermissionsJr2 :: Maybe ConfigNodePropertyDropDown
      <*> arbitrary -- orgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurPropertiesImportBehavior :: Maybe ConfigNodePropertyDropDown
      <*> arbitrary -- orgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurPropertiesReadPaths :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- orgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurPropertiesAdministrativePrincipals :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- orgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurPropertiesConfigurationRanking :: Maybe ConfigNodePropertyInteger
    
instance Arbitrary OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiInfo where
  arbitrary =
    OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiInfo
      <$> arbitrary -- orgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiInfoPid :: Maybe Text
      <*> arbitrary -- orgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiInfoTitle :: Maybe Text
      <*> arbitrary -- orgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiInfoDescription :: Maybe Text
      <*> arbitrary -- orgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiInfoProperties :: Maybe OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties
      <*> arbitrary -- orgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiInfoBundleLocation :: Maybe Text
      <*> arbitrary -- orgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiInfoServiceLocation :: Maybe Text
    
instance Arbitrary OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties where
  arbitrary =
    OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties
      <$> arbitrary -- orgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiPropertiesRequiredServicePids :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- orgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiPropertiesAuthorizationCompositionType :: Maybe ConfigNodePropertyDropDown
    
instance Arbitrary OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameInfo where
  arbitrary =
    OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameInfo
      <$> arbitrary -- orgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameInfoPid :: Maybe Text
      <*> arbitrary -- orgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameInfoTitle :: Maybe Text
      <*> arbitrary -- orgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameInfoDescription :: Maybe Text
      <*> arbitrary -- orgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameInfoProperties :: Maybe OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameProperties
      <*> arbitrary -- orgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameInfoBundleLocation :: Maybe Text
      <*> arbitrary -- orgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameInfoServiceLocation :: Maybe Text
    
instance Arbitrary OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameProperties where
  arbitrary =
    OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameProperties
      <$> arbitrary -- orgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNamePropertiesLength :: Maybe ConfigNodePropertyInteger
    
instance Arbitrary OrgApacheJackrabbitOakSecurityUserUserConfigurationImplInfo where
  arbitrary =
    OrgApacheJackrabbitOakSecurityUserUserConfigurationImplInfo
      <$> arbitrary -- orgApacheJackrabbitOakSecurityUserUserConfigurationImplInfoPid :: Maybe Text
      <*> arbitrary -- orgApacheJackrabbitOakSecurityUserUserConfigurationImplInfoTitle :: Maybe Text
      <*> arbitrary -- orgApacheJackrabbitOakSecurityUserUserConfigurationImplInfoDescription :: Maybe Text
      <*> arbitrary -- orgApacheJackrabbitOakSecurityUserUserConfigurationImplInfoProperties :: Maybe OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties
      <*> arbitrary -- orgApacheJackrabbitOakSecurityUserUserConfigurationImplInfoBundleLocation :: Maybe Text
      <*> arbitrary -- orgApacheJackrabbitOakSecurityUserUserConfigurationImplInfoServiceLocation :: Maybe Text
    
instance Arbitrary OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties where
  arbitrary =
    OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties
      <$> arbitrary -- orgApacheJackrabbitOakSecurityUserUserConfigurationImplPropertiesUsersPath :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheJackrabbitOakSecurityUserUserConfigurationImplPropertiesGroupsPath :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheJackrabbitOakSecurityUserUserConfigurationImplPropertiesSystemRelativePath :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheJackrabbitOakSecurityUserUserConfigurationImplPropertiesDefaultDepth :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheJackrabbitOakSecurityUserUserConfigurationImplPropertiesImportBehavior :: Maybe ConfigNodePropertyDropDown
      <*> arbitrary -- orgApacheJackrabbitOakSecurityUserUserConfigurationImplPropertiesPasswordHashAlgorithm :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheJackrabbitOakSecurityUserUserConfigurationImplPropertiesPasswordHashIterations :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheJackrabbitOakSecurityUserUserConfigurationImplPropertiesPasswordSaltSize :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheJackrabbitOakSecurityUserUserConfigurationImplPropertiesOmitAdminPw :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- orgApacheJackrabbitOakSecurityUserUserConfigurationImplPropertiesSupportAutoSave :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- orgApacheJackrabbitOakSecurityUserUserConfigurationImplPropertiesPasswordMaxAge :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheJackrabbitOakSecurityUserUserConfigurationImplPropertiesInitialPasswordChange :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- orgApacheJackrabbitOakSecurityUserUserConfigurationImplPropertiesPasswordHistorySize :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheJackrabbitOakSecurityUserUserConfigurationImplPropertiesPasswordExpiryForAdmin :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- orgApacheJackrabbitOakSecurityUserUserConfigurationImplPropertiesCacheExpiration :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheJackrabbitOakSecurityUserUserConfigurationImplPropertiesEnableRfc7613UsercaseMappedProfile :: Maybe ConfigNodePropertyBoolean
    
instance Arbitrary OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceInfo where
  arbitrary =
    OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceInfo
      <$> arbitrary -- orgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceInfoPid :: Maybe Text
      <*> arbitrary -- orgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceInfoTitle :: Maybe Text
      <*> arbitrary -- orgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceInfoDescription :: Maybe Text
      <*> arbitrary -- orgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceInfoProperties :: Maybe OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties
    
instance Arbitrary OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties where
  arbitrary =
    OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties
      <$> arbitrary -- orgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServicePropertiesAccountName :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServicePropertiesContainerName :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServicePropertiesAccessKey :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServicePropertiesRootPath :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServicePropertiesConnectionUrl :: Maybe ConfigNodePropertyString
    
instance Arbitrary OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryInfo where
  arbitrary =
    OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryInfo
      <$> arbitrary -- orgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryInfoPid :: Maybe Text
      <*> arbitrary -- orgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryInfoTitle :: Maybe Text
      <*> arbitrary -- orgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryInfoDescription :: Maybe Text
      <*> arbitrary -- orgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryInfoProperties :: Maybe OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties
    
instance Arbitrary OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties where
  arbitrary =
    OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties
      <$> arbitrary -- orgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesRepositoryHome :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesTarmkMode :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesTarmkSize :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesSegmentCacheSize :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesStringCacheSize :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesTemplateCacheSize :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesStringDeduplicationCacheSize :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesTemplateDeduplicationCacheSize :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesNodeDeduplicationCacheSize :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesPauseCompaction :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- orgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesCompactionRetryCount :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesCompactionForceTimeout :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesCompactionSizeDeltaEstimation :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesCompactionDisableEstimation :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- orgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesCompactionRetainedGenerations :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesCompactionMemoryThreshold :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesCompactionProgressLog :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesStandby :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- orgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesCustomBlobStore :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- orgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesCustomSegmentStore :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- orgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesSplitPersistence :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- orgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesRepositoryBackupDir :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesBlobGcMaxAgeInSecs :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesBlobTrackSnapshotIntervalInSecs :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesRole :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesRegisterDescriptors :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- orgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryPropertiesDispatchChanges :: Maybe ConfigNodePropertyBoolean
    
instance Arbitrary OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceInfo where
  arbitrary =
    OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceInfo
      <$> arbitrary -- orgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceInfoPid :: Maybe Text
      <*> arbitrary -- orgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceInfoTitle :: Maybe Text
      <*> arbitrary -- orgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceInfoDescription :: Maybe Text
      <*> arbitrary -- orgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceInfoProperties :: Maybe OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceProperties
      <*> arbitrary -- orgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceInfoBundleLocation :: Maybe Text
      <*> arbitrary -- orgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceInfoServiceLocation :: Maybe Text
    
instance Arbitrary OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceProperties where
  arbitrary =
    OrgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServiceProperties
      <$> arbitrary -- orgApacheJackrabbitOakSegmentSegmentNodeStoreMonitorServicePropertiesCommitsTrackerWriterGroups :: Maybe ConfigNodePropertyArray
    
instance Arbitrary OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceInfo where
  arbitrary =
    OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceInfo
      <$> arbitrary -- orgApacheJackrabbitOakSegmentSegmentNodeStoreServiceInfoPid :: Maybe Text
      <*> arbitrary -- orgApacheJackrabbitOakSegmentSegmentNodeStoreServiceInfoTitle :: Maybe Text
      <*> arbitrary -- orgApacheJackrabbitOakSegmentSegmentNodeStoreServiceInfoDescription :: Maybe Text
      <*> arbitrary -- orgApacheJackrabbitOakSegmentSegmentNodeStoreServiceInfoProperties :: Maybe OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties
      <*> arbitrary -- orgApacheJackrabbitOakSegmentSegmentNodeStoreServiceInfoAdditionalProperties :: Maybe Text
      <*> arbitrary -- orgApacheJackrabbitOakSegmentSegmentNodeStoreServiceInfoBundleLocation :: Maybe Text
      <*> arbitrary -- orgApacheJackrabbitOakSegmentSegmentNodeStoreServiceInfoServiceLocation :: Maybe Text
    
instance Arbitrary OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties where
  arbitrary =
    OrgApacheJackrabbitOakSegmentSegmentNodeStoreServiceProperties
      <$> arbitrary -- orgApacheJackrabbitOakSegmentSegmentNodeStoreServicePropertiesRepositoryHome :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheJackrabbitOakSegmentSegmentNodeStoreServicePropertiesTarmkMode :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheJackrabbitOakSegmentSegmentNodeStoreServicePropertiesTarmkSize :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheJackrabbitOakSegmentSegmentNodeStoreServicePropertiesSegmentCacheSize :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheJackrabbitOakSegmentSegmentNodeStoreServicePropertiesStringCacheSize :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheJackrabbitOakSegmentSegmentNodeStoreServicePropertiesTemplateCacheSize :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheJackrabbitOakSegmentSegmentNodeStoreServicePropertiesStringDeduplicationCacheSize :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheJackrabbitOakSegmentSegmentNodeStoreServicePropertiesTemplateDeduplicationCacheSize :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheJackrabbitOakSegmentSegmentNodeStoreServicePropertiesNodeDeduplicationCacheSize :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheJackrabbitOakSegmentSegmentNodeStoreServicePropertiesPauseCompaction :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- orgApacheJackrabbitOakSegmentSegmentNodeStoreServicePropertiesCompactionRetryCount :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheJackrabbitOakSegmentSegmentNodeStoreServicePropertiesCompactionForceTimeout :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheJackrabbitOakSegmentSegmentNodeStoreServicePropertiesCompactionSizeDeltaEstimation :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheJackrabbitOakSegmentSegmentNodeStoreServicePropertiesCompactionDisableEstimation :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- orgApacheJackrabbitOakSegmentSegmentNodeStoreServicePropertiesCompactionRetainedGenerations :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheJackrabbitOakSegmentSegmentNodeStoreServicePropertiesCompactionMemoryThreshold :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheJackrabbitOakSegmentSegmentNodeStoreServicePropertiesCompactionProgressLog :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheJackrabbitOakSegmentSegmentNodeStoreServicePropertiesStandby :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- orgApacheJackrabbitOakSegmentSegmentNodeStoreServicePropertiesCustomBlobStore :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- orgApacheJackrabbitOakSegmentSegmentNodeStoreServicePropertiesCustomSegmentStore :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- orgApacheJackrabbitOakSegmentSegmentNodeStoreServicePropertiesSplitPersistence :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- orgApacheJackrabbitOakSegmentSegmentNodeStoreServicePropertiesRepositoryBackupDir :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheJackrabbitOakSegmentSegmentNodeStoreServicePropertiesBlobGcMaxAgeInSecs :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheJackrabbitOakSegmentSegmentNodeStoreServicePropertiesBlobTrackSnapshotIntervalInSecs :: Maybe ConfigNodePropertyInteger
    
instance Arbitrary OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceInfo where
  arbitrary =
    OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceInfo
      <$> arbitrary -- orgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceInfoPid :: Maybe Text
      <*> arbitrary -- orgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceInfoTitle :: Maybe Text
      <*> arbitrary -- orgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceInfoDescription :: Maybe Text
      <*> arbitrary -- orgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceInfoProperties :: Maybe OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties
    
instance Arbitrary OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties where
  arbitrary =
    OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties
      <$> arbitrary -- orgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServicePropertiesOrgApacheSlingInstallerConfigurationPersist :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- orgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServicePropertiesMode :: Maybe ConfigNodePropertyDropDown
      <*> arbitrary -- orgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServicePropertiesPort :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServicePropertiesPrimaryHost :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServicePropertiesInterval :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServicePropertiesPrimaryAllowedClientIpRanges :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- orgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServicePropertiesSecure :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- orgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServicePropertiesStandbyReadtimeout :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServicePropertiesStandbyAutoclean :: Maybe ConfigNodePropertyBoolean
    
instance Arbitrary OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeInfo where
  arbitrary =
    OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeInfo
      <$> arbitrary -- orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeInfoPid :: Maybe Text
      <*> arbitrary -- orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeInfoTitle :: Maybe Text
      <*> arbitrary -- orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeInfoDescription :: Maybe Text
      <*> arbitrary -- orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeInfoProperties :: Maybe OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties
    
instance Arbitrary OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties where
  arbitrary =
    OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties
      <$> arbitrary -- orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDePropertiesHandlerName :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDePropertiesUserExpirationTime :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDePropertiesUserAutoMembership :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDePropertiesUserPropertyMapping :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDePropertiesUserPathPrefix :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDePropertiesUserMembershipExpTime :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDePropertiesUserMembershipNestingDepth :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDePropertiesUserDynamicMembership :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDePropertiesUserDisableMissing :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDePropertiesGroupExpirationTime :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDePropertiesGroupAutoMembership :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDePropertiesGroupPropertyMapping :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDePropertiesGroupPathPrefix :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDePropertiesEnableRfc7613UsercaseMappedProfile :: Maybe ConfigNodePropertyBoolean
    
instance Arbitrary OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExInfo where
  arbitrary =
    OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExInfo
      <$> arbitrary -- orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExInfoPid :: Maybe Text
      <*> arbitrary -- orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExInfoTitle :: Maybe Text
      <*> arbitrary -- orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExInfoDescription :: Maybe Text
      <*> arbitrary -- orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExInfoProperties :: Maybe OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties
    
instance Arbitrary OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties where
  arbitrary =
    OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties
      <$> arbitrary -- orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExPropertiesJaasRanking :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExPropertiesJaasControlFlag :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExPropertiesJaasRealmName :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExPropertiesIdpName :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExPropertiesSyncHandlerName :: Maybe ConfigNodePropertyString
    
instance Arbitrary OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrInfo where
  arbitrary =
    OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrInfo
      <$> arbitrary -- orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrInfoPid :: Maybe Text
      <*> arbitrary -- orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrInfoTitle :: Maybe Text
      <*> arbitrary -- orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrInfoDescription :: Maybe Text
      <*> arbitrary -- orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrInfoProperties :: Maybe OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrProperties
    
instance Arbitrary OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrProperties where
  arbitrary =
    OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrProperties
      <$> arbitrary -- orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrPropertiesProtectExternalId :: Maybe ConfigNodePropertyBoolean
    
instance Arbitrary OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiInfo where
  arbitrary =
    OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiInfo
      <$> arbitrary -- orgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiInfoPid :: Maybe Text
      <*> arbitrary -- orgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiInfoTitle :: Maybe Text
      <*> arbitrary -- orgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiInfoDescription :: Maybe Text
      <*> arbitrary -- orgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiInfoProperties :: Maybe OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties
      <*> arbitrary -- orgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiInfoBundleLocation :: Maybe Text
      <*> arbitrary -- orgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiInfoServiceLocation :: Maybe Text
    
instance Arbitrary OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties where
  arbitrary =
    OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties
      <$> arbitrary -- orgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiPropertiesCugSupportedPaths :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- orgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiPropertiesCugEnabled :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- orgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiPropertiesConfigurationRanking :: Maybe ConfigNodePropertyInteger
    
instance Arbitrary OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluInfo where
  arbitrary =
    OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluInfo
      <$> arbitrary -- orgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluInfoPid :: Maybe Text
      <*> arbitrary -- orgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluInfoTitle :: Maybe Text
      <*> arbitrary -- orgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluInfoDescription :: Maybe Text
      <*> arbitrary -- orgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluInfoProperties :: Maybe OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluProperties
    
instance Arbitrary OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluProperties where
  arbitrary =
    OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluProperties
      <$> arbitrary -- orgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluPropertiesPrincipalNames :: Maybe ConfigNodePropertyArray
    
instance Arbitrary OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableInfo where
  arbitrary =
    OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableInfo
      <$> arbitrary -- orgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableInfoPid :: Maybe Text
      <*> arbitrary -- orgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableInfoTitle :: Maybe Text
      <*> arbitrary -- orgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableInfoDescription :: Maybe Text
      <*> arbitrary -- orgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableInfoProperties :: Maybe OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties
      <*> arbitrary -- orgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableInfoBundleLocation :: Maybe Text
      <*> arbitrary -- orgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableInfoServiceLocation :: Maybe Text
    
instance Arbitrary OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties where
  arbitrary =
    OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties
      <$> arbitrary -- orgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizablePropertiesEnabledActions :: Maybe ConfigNodePropertyDropDown
      <*> arbitrary -- orgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizablePropertiesUserPrivilegeNames :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- orgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizablePropertiesGroupPrivilegeNames :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- orgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizablePropertiesConstraint :: Maybe ConfigNodePropertyString
    
instance Arbitrary OrgApacheJackrabbitVaultPackagingImplPackagingImplInfo where
  arbitrary =
    OrgApacheJackrabbitVaultPackagingImplPackagingImplInfo
      <$> arbitrary -- orgApacheJackrabbitVaultPackagingImplPackagingImplInfoPid :: Maybe Text
      <*> arbitrary -- orgApacheJackrabbitVaultPackagingImplPackagingImplInfoTitle :: Maybe Text
      <*> arbitrary -- orgApacheJackrabbitVaultPackagingImplPackagingImplInfoDescription :: Maybe Text
      <*> arbitrary -- orgApacheJackrabbitVaultPackagingImplPackagingImplInfoProperties :: Maybe OrgApacheJackrabbitVaultPackagingImplPackagingImplProperties
    
instance Arbitrary OrgApacheJackrabbitVaultPackagingImplPackagingImplProperties where
  arbitrary =
    OrgApacheJackrabbitVaultPackagingImplPackagingImplProperties
      <$> arbitrary -- orgApacheJackrabbitVaultPackagingImplPackagingImplPropertiesPackageRoots :: Maybe ConfigNodePropertyArray
    
instance Arbitrary OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryInfo where
  arbitrary =
    OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryInfo
      <$> arbitrary -- orgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryInfoPid :: Maybe Text
      <*> arbitrary -- orgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryInfoTitle :: Maybe Text
      <*> arbitrary -- orgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryInfoDescription :: Maybe Text
      <*> arbitrary -- orgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryInfoProperties :: Maybe OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties
    
instance Arbitrary OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties where
  arbitrary =
    OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties
      <$> arbitrary -- orgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryPropertiesHomePath :: Maybe ConfigNodePropertyString
    
instance Arbitrary OrgApacheSlingAuthCoreImplLogoutServletInfo where
  arbitrary =
    OrgApacheSlingAuthCoreImplLogoutServletInfo
      <$> arbitrary -- orgApacheSlingAuthCoreImplLogoutServletInfoPid :: Maybe Text
      <*> arbitrary -- orgApacheSlingAuthCoreImplLogoutServletInfoTitle :: Maybe Text
      <*> arbitrary -- orgApacheSlingAuthCoreImplLogoutServletInfoDescription :: Maybe Text
      <*> arbitrary -- orgApacheSlingAuthCoreImplLogoutServletInfoProperties :: Maybe OrgApacheSlingAuthCoreImplLogoutServletProperties
    
instance Arbitrary OrgApacheSlingAuthCoreImplLogoutServletProperties where
  arbitrary =
    OrgApacheSlingAuthCoreImplLogoutServletProperties
      <$> arbitrary -- orgApacheSlingAuthCoreImplLogoutServletPropertiesSlingServletMethods :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- orgApacheSlingAuthCoreImplLogoutServletPropertiesSlingServletPaths :: Maybe ConfigNodePropertyString
    
instance Arbitrary OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderInfo where
  arbitrary =
    OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderInfo
      <$> arbitrary -- orgApacheSlingCaconfigImplConfigurationBindingsValueProviderInfoPid :: Maybe Text
      <*> arbitrary -- orgApacheSlingCaconfigImplConfigurationBindingsValueProviderInfoTitle :: Maybe Text
      <*> arbitrary -- orgApacheSlingCaconfigImplConfigurationBindingsValueProviderInfoDescription :: Maybe Text
      <*> arbitrary -- orgApacheSlingCaconfigImplConfigurationBindingsValueProviderInfoProperties :: Maybe OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderProperties
    
instance Arbitrary OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderProperties where
  arbitrary =
    OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderProperties
      <$> arbitrary -- orgApacheSlingCaconfigImplConfigurationBindingsValueProviderPropertiesEnabled :: Maybe ConfigNodePropertyBoolean
    
instance Arbitrary OrgApacheSlingCaconfigImplConfigurationResolverImplInfo where
  arbitrary =
    OrgApacheSlingCaconfigImplConfigurationResolverImplInfo
      <$> arbitrary -- orgApacheSlingCaconfigImplConfigurationResolverImplInfoPid :: Maybe Text
      <*> arbitrary -- orgApacheSlingCaconfigImplConfigurationResolverImplInfoTitle :: Maybe Text
      <*> arbitrary -- orgApacheSlingCaconfigImplConfigurationResolverImplInfoDescription :: Maybe Text
      <*> arbitrary -- orgApacheSlingCaconfigImplConfigurationResolverImplInfoProperties :: Maybe OrgApacheSlingCaconfigImplConfigurationResolverImplProperties
      <*> arbitrary -- orgApacheSlingCaconfigImplConfigurationResolverImplInfoBundleLocation :: Maybe Text
      <*> arbitrary -- orgApacheSlingCaconfigImplConfigurationResolverImplInfoServiceLocation :: Maybe Text
    
instance Arbitrary OrgApacheSlingCaconfigImplConfigurationResolverImplProperties where
  arbitrary =
    OrgApacheSlingCaconfigImplConfigurationResolverImplProperties
      <$> arbitrary -- orgApacheSlingCaconfigImplConfigurationResolverImplPropertiesConfigBucketNames :: Maybe ConfigNodePropertyArray
    
instance Arbitrary OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraInfo where
  arbitrary =
    OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraInfo
      <$> arbitrary -- orgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraInfoPid :: Maybe Text
      <*> arbitrary -- orgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraInfoTitle :: Maybe Text
      <*> arbitrary -- orgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraInfoDescription :: Maybe Text
      <*> arbitrary -- orgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraInfoProperties :: Maybe OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraProperties
    
instance Arbitrary OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraProperties where
  arbitrary =
    OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraProperties
      <$> arbitrary -- orgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraPropertiesEnabled :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- orgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraPropertiesConfigPropertyInheritancePropertyNames :: Maybe ConfigNodePropertyArray
    
instance Arbitrary OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraInfo where
  arbitrary =
    OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraInfo
      <$> arbitrary -- orgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraInfoPid :: Maybe Text
      <*> arbitrary -- orgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraInfoTitle :: Maybe Text
      <*> arbitrary -- orgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraInfoDescription :: Maybe Text
      <*> arbitrary -- orgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraInfoProperties :: Maybe OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraProperties
    
instance Arbitrary OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraProperties where
  arbitrary =
    OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraProperties
      <$> arbitrary -- orgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraPropertiesEnabled :: Maybe ConfigNodePropertyBoolean
    
instance Arbitrary OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviInfo where
  arbitrary =
    OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviInfo
      <$> arbitrary -- orgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviInfoPid :: Maybe Text
      <*> arbitrary -- orgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviInfoTitle :: Maybe Text
      <*> arbitrary -- orgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviInfoDescription :: Maybe Text
      <*> arbitrary -- orgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviInfoProperties :: Maybe OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties
    
instance Arbitrary OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties where
  arbitrary =
    OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties
      <$> arbitrary -- orgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviPropertiesDescription :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviPropertiesOverrides :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- orgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviPropertiesEnabled :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- orgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviPropertiesServiceRanking :: Maybe ConfigNodePropertyInteger
    
instance Arbitrary OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveInfo where
  arbitrary =
    OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveInfo
      <$> arbitrary -- orgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveInfoPid :: Maybe Text
      <*> arbitrary -- orgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveInfoTitle :: Maybe Text
      <*> arbitrary -- orgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveInfoDescription :: Maybe Text
      <*> arbitrary -- orgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveInfoProperties :: Maybe OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveProperties
    
instance Arbitrary OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveProperties where
  arbitrary =
    OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveProperties
      <$> arbitrary -- orgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOvePropertiesEnabled :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- orgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOvePropertiesServiceRanking :: Maybe ConfigNodePropertyInteger
    
instance Arbitrary OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiInfo where
  arbitrary =
    OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiInfo
      <$> arbitrary -- orgApacheSlingCaconfigManagementImplConfigurationManagementSettiInfoPid :: Maybe Text
      <*> arbitrary -- orgApacheSlingCaconfigManagementImplConfigurationManagementSettiInfoTitle :: Maybe Text
      <*> arbitrary -- orgApacheSlingCaconfigManagementImplConfigurationManagementSettiInfoDescription :: Maybe Text
      <*> arbitrary -- orgApacheSlingCaconfigManagementImplConfigurationManagementSettiInfoProperties :: Maybe OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties
      <*> arbitrary -- orgApacheSlingCaconfigManagementImplConfigurationManagementSettiInfoBundleLocation :: Maybe Text
      <*> arbitrary -- orgApacheSlingCaconfigManagementImplConfigurationManagementSettiInfoServiceLocation :: Maybe Text
    
instance Arbitrary OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties where
  arbitrary =
    OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties
      <$> arbitrary -- orgApacheSlingCaconfigManagementImplConfigurationManagementSettiPropertiesIgnorePropertyNameRegex :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- orgApacheSlingCaconfigManagementImplConfigurationManagementSettiPropertiesConfigCollectionPropertiesResourceNames :: Maybe ConfigNodePropertyArray
    
instance Arbitrary OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourInfo where
  arbitrary =
    OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourInfo
      <$> arbitrary -- orgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourInfoPid :: Maybe Text
      <*> arbitrary -- orgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourInfoTitle :: Maybe Text
      <*> arbitrary -- orgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourInfoDescription :: Maybe Text
      <*> arbitrary -- orgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourInfoProperties :: Maybe OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties
      <*> arbitrary -- orgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourInfoBundleLocation :: Maybe Text
      <*> arbitrary -- orgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourInfoServiceLocation :: Maybe Text
    
instance Arbitrary OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties where
  arbitrary =
    OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties
      <$> arbitrary -- orgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourPropertiesEnabled :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- orgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourPropertiesConfigPath :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourPropertiesFallbackPaths :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- orgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourPropertiesConfigCollectionInheritancePropertyNames :: Maybe ConfigNodePropertyArray
    
instance Arbitrary OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyInfo where
  arbitrary =
    OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyInfo
      <$> arbitrary -- orgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyInfoPid :: Maybe Text
      <*> arbitrary -- orgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyInfoTitle :: Maybe Text
      <*> arbitrary -- orgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyInfoDescription :: Maybe Text
      <*> arbitrary -- orgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyInfoProperties :: Maybe OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties
      <*> arbitrary -- orgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyInfoBundleLocation :: Maybe Text
      <*> arbitrary -- orgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyInfoServiceLocation :: Maybe Text
    
instance Arbitrary OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties where
  arbitrary =
    OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties
      <$> arbitrary -- orgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyPropertiesEnabled :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- orgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyPropertiesConfigRefResourceNames :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- orgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyPropertiesConfigRefPropertyNames :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- orgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyPropertiesServiceRanking :: Maybe ConfigNodePropertyInteger
    
instance Arbitrary OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserInfo where
  arbitrary =
    OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserInfo
      <$> arbitrary -- orgApacheSlingCommonsHtmlInternalTagsoupHtmlParserInfoPid :: Maybe Text
      <*> arbitrary -- orgApacheSlingCommonsHtmlInternalTagsoupHtmlParserInfoTitle :: Maybe Text
      <*> arbitrary -- orgApacheSlingCommonsHtmlInternalTagsoupHtmlParserInfoDescription :: Maybe Text
      <*> arbitrary -- orgApacheSlingCommonsHtmlInternalTagsoupHtmlParserInfoProperties :: Maybe OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties
    
instance Arbitrary OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties where
  arbitrary =
    OrgApacheSlingCommonsHtmlInternalTagsoupHtmlParserProperties
      <$> arbitrary -- orgApacheSlingCommonsHtmlInternalTagsoupHtmlParserPropertiesParserFeatures :: Maybe ConfigNodePropertyArray
    
instance Arbitrary OrgApacheSlingCommonsLogLogManagerFactoryConfigInfo where
  arbitrary =
    OrgApacheSlingCommonsLogLogManagerFactoryConfigInfo
      <$> arbitrary -- orgApacheSlingCommonsLogLogManagerFactoryConfigInfoPid :: Maybe Text
      <*> arbitrary -- orgApacheSlingCommonsLogLogManagerFactoryConfigInfoTitle :: Maybe Text
      <*> arbitrary -- orgApacheSlingCommonsLogLogManagerFactoryConfigInfoDescription :: Maybe Text
      <*> arbitrary -- orgApacheSlingCommonsLogLogManagerFactoryConfigInfoProperties :: Maybe OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties
    
instance Arbitrary OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties where
  arbitrary =
    OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties
      <$> arbitrary -- orgApacheSlingCommonsLogLogManagerFactoryConfigPropertiesOrgApacheSlingCommonsLogLevel :: Maybe ConfigNodePropertyDropDown
      <*> arbitrary -- orgApacheSlingCommonsLogLogManagerFactoryConfigPropertiesOrgApacheSlingCommonsLogFile :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingCommonsLogLogManagerFactoryConfigPropertiesOrgApacheSlingCommonsLogPattern :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingCommonsLogLogManagerFactoryConfigPropertiesOrgApacheSlingCommonsLogNames :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- orgApacheSlingCommonsLogLogManagerFactoryConfigPropertiesOrgApacheSlingCommonsLogAdditiv :: Maybe ConfigNodePropertyBoolean
    
instance Arbitrary OrgApacheSlingCommonsLogLogManagerFactoryWriterInfo where
  arbitrary =
    OrgApacheSlingCommonsLogLogManagerFactoryWriterInfo
      <$> arbitrary -- orgApacheSlingCommonsLogLogManagerFactoryWriterInfoPid :: Maybe Text
      <*> arbitrary -- orgApacheSlingCommonsLogLogManagerFactoryWriterInfoTitle :: Maybe Text
      <*> arbitrary -- orgApacheSlingCommonsLogLogManagerFactoryWriterInfoDescription :: Maybe Text
      <*> arbitrary -- orgApacheSlingCommonsLogLogManagerFactoryWriterInfoProperties :: Maybe OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties
    
instance Arbitrary OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties where
  arbitrary =
    OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties
      <$> arbitrary -- orgApacheSlingCommonsLogLogManagerFactoryWriterPropertiesOrgApacheSlingCommonsLogFile :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingCommonsLogLogManagerFactoryWriterPropertiesOrgApacheSlingCommonsLogFileNumber :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheSlingCommonsLogLogManagerFactoryWriterPropertiesOrgApacheSlingCommonsLogFileSize :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingCommonsLogLogManagerFactoryWriterPropertiesOrgApacheSlingCommonsLogFileBuffered :: Maybe ConfigNodePropertyBoolean
    
instance Arbitrary OrgApacheSlingCommonsLogLogManagerInfo where
  arbitrary =
    OrgApacheSlingCommonsLogLogManagerInfo
      <$> arbitrary -- orgApacheSlingCommonsLogLogManagerInfoPid :: Maybe Text
      <*> arbitrary -- orgApacheSlingCommonsLogLogManagerInfoTitle :: Maybe Text
      <*> arbitrary -- orgApacheSlingCommonsLogLogManagerInfoDescription :: Maybe Text
      <*> arbitrary -- orgApacheSlingCommonsLogLogManagerInfoProperties :: Maybe OrgApacheSlingCommonsLogLogManagerProperties
      <*> arbitrary -- orgApacheSlingCommonsLogLogManagerInfoBundleLocation :: Maybe Text
      <*> arbitrary -- orgApacheSlingCommonsLogLogManagerInfoServiceLocation :: Maybe Text
    
instance Arbitrary OrgApacheSlingCommonsLogLogManagerProperties where
  arbitrary =
    OrgApacheSlingCommonsLogLogManagerProperties
      <$> arbitrary -- orgApacheSlingCommonsLogLogManagerPropertiesOrgApacheSlingCommonsLogLevel :: Maybe ConfigNodePropertyDropDown
      <*> arbitrary -- orgApacheSlingCommonsLogLogManagerPropertiesOrgApacheSlingCommonsLogFile :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingCommonsLogLogManagerPropertiesOrgApacheSlingCommonsLogFileNumber :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheSlingCommonsLogLogManagerPropertiesOrgApacheSlingCommonsLogFileSize :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingCommonsLogLogManagerPropertiesOrgApacheSlingCommonsLogPattern :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingCommonsLogLogManagerPropertiesOrgApacheSlingCommonsLogConfigurationFile :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingCommonsLogLogManagerPropertiesOrgApacheSlingCommonsLogPackagingDataEnabled :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- orgApacheSlingCommonsLogLogManagerPropertiesOrgApacheSlingCommonsLogMaxCallerDataDepth :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheSlingCommonsLogLogManagerPropertiesOrgApacheSlingCommonsLogMaxOldFileCountInDump :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheSlingCommonsLogLogManagerPropertiesOrgApacheSlingCommonsLogNumOfLines :: Maybe ConfigNodePropertyInteger
    
instance Arbitrary OrgApacheSlingCommonsMetricsInternalLogReporterInfo where
  arbitrary =
    OrgApacheSlingCommonsMetricsInternalLogReporterInfo
      <$> arbitrary -- orgApacheSlingCommonsMetricsInternalLogReporterInfoPid :: Maybe Text
      <*> arbitrary -- orgApacheSlingCommonsMetricsInternalLogReporterInfoTitle :: Maybe Text
      <*> arbitrary -- orgApacheSlingCommonsMetricsInternalLogReporterInfoDescription :: Maybe Text
      <*> arbitrary -- orgApacheSlingCommonsMetricsInternalLogReporterInfoProperties :: Maybe OrgApacheSlingCommonsMetricsInternalLogReporterProperties
    
instance Arbitrary OrgApacheSlingCommonsMetricsInternalLogReporterProperties where
  arbitrary =
    OrgApacheSlingCommonsMetricsInternalLogReporterProperties
      <$> arbitrary -- orgApacheSlingCommonsMetricsInternalLogReporterPropertiesPeriod :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheSlingCommonsMetricsInternalLogReporterPropertiesTimeUnit :: Maybe ConfigNodePropertyDropDown
      <*> arbitrary -- orgApacheSlingCommonsMetricsInternalLogReporterPropertiesLevel :: Maybe ConfigNodePropertyDropDown
      <*> arbitrary -- orgApacheSlingCommonsMetricsInternalLogReporterPropertiesLoggerName :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingCommonsMetricsInternalLogReporterPropertiesPrefix :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingCommonsMetricsInternalLogReporterPropertiesPattern :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingCommonsMetricsInternalLogReporterPropertiesRegistryName :: Maybe ConfigNodePropertyString
    
instance Arbitrary OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterInfo where
  arbitrary =
    OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterInfo
      <$> arbitrary -- orgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterInfoPid :: Maybe Text
      <*> arbitrary -- orgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterInfoTitle :: Maybe Text
      <*> arbitrary -- orgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterInfoDescription :: Maybe Text
      <*> arbitrary -- orgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterInfoProperties :: Maybe OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties
      <*> arbitrary -- orgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterInfoBundleLocation :: Maybe Text
      <*> arbitrary -- orgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterInfoServiceLocation :: Maybe Text
    
instance Arbitrary OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties where
  arbitrary =
    OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties
      <$> arbitrary -- orgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterPropertiesDatasources :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- orgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterPropertiesStep :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterPropertiesArchives :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- orgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterPropertiesPath :: Maybe ConfigNodePropertyString
    
instance Arbitrary OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplInfo where
  arbitrary =
    OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplInfo
      <$> arbitrary -- orgApacheSlingCommonsMimeInternalMimeTypeServiceImplInfoPid :: Maybe Text
      <*> arbitrary -- orgApacheSlingCommonsMimeInternalMimeTypeServiceImplInfoTitle :: Maybe Text
      <*> arbitrary -- orgApacheSlingCommonsMimeInternalMimeTypeServiceImplInfoDescription :: Maybe Text
      <*> arbitrary -- orgApacheSlingCommonsMimeInternalMimeTypeServiceImplInfoProperties :: Maybe OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties
      <*> arbitrary -- orgApacheSlingCommonsMimeInternalMimeTypeServiceImplInfoBundleLocation :: Maybe Text
      <*> arbitrary -- orgApacheSlingCommonsMimeInternalMimeTypeServiceImplInfoServiceLocation :: Maybe Text
    
instance Arbitrary OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties where
  arbitrary =
    OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties
      <$> arbitrary -- orgApacheSlingCommonsMimeInternalMimeTypeServiceImplPropertiesMimeTypes :: Maybe ConfigNodePropertyArray
    
instance Arbitrary OrgApacheSlingCommonsSchedulerImplQuartzSchedulerInfo where
  arbitrary =
    OrgApacheSlingCommonsSchedulerImplQuartzSchedulerInfo
      <$> arbitrary -- orgApacheSlingCommonsSchedulerImplQuartzSchedulerInfoPid :: Maybe Text
      <*> arbitrary -- orgApacheSlingCommonsSchedulerImplQuartzSchedulerInfoTitle :: Maybe Text
      <*> arbitrary -- orgApacheSlingCommonsSchedulerImplQuartzSchedulerInfoDescription :: Maybe Text
      <*> arbitrary -- orgApacheSlingCommonsSchedulerImplQuartzSchedulerInfoProperties :: Maybe OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties
      <*> arbitrary -- orgApacheSlingCommonsSchedulerImplQuartzSchedulerInfoBundleLocation :: Maybe Text
      <*> arbitrary -- orgApacheSlingCommonsSchedulerImplQuartzSchedulerInfoServiceLocation :: Maybe Text
    
instance Arbitrary OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties where
  arbitrary =
    OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties
      <$> arbitrary -- orgApacheSlingCommonsSchedulerImplQuartzSchedulerPropertiesPoolName :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingCommonsSchedulerImplQuartzSchedulerPropertiesAllowedPoolNames :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- orgApacheSlingCommonsSchedulerImplQuartzSchedulerPropertiesSchedulerUseleaderforsingle :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- orgApacheSlingCommonsSchedulerImplQuartzSchedulerPropertiesMetricsFilters :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- orgApacheSlingCommonsSchedulerImplQuartzSchedulerPropertiesSlowThresholdMillis :: Maybe ConfigNodePropertyInteger
    
instance Arbitrary OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckInfo where
  arbitrary =
    OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckInfo
      <$> arbitrary -- orgApacheSlingCommonsSchedulerImplSchedulerHealthCheckInfoPid :: Maybe Text
      <*> arbitrary -- orgApacheSlingCommonsSchedulerImplSchedulerHealthCheckInfoTitle :: Maybe Text
      <*> arbitrary -- orgApacheSlingCommonsSchedulerImplSchedulerHealthCheckInfoDescription :: Maybe Text
      <*> arbitrary -- orgApacheSlingCommonsSchedulerImplSchedulerHealthCheckInfoProperties :: Maybe OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties
    
instance Arbitrary OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties where
  arbitrary =
    OrgApacheSlingCommonsSchedulerImplSchedulerHealthCheckProperties
      <$> arbitrary -- orgApacheSlingCommonsSchedulerImplSchedulerHealthCheckPropertiesMaxQuartzJobDurationAcceptable :: Maybe ConfigNodePropertyInteger
    
instance Arbitrary OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryInfo where
  arbitrary =
    OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryInfo
      <$> arbitrary -- orgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryInfoPid :: Maybe Text
      <*> arbitrary -- orgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryInfoTitle :: Maybe Text
      <*> arbitrary -- orgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryInfoDescription :: Maybe Text
      <*> arbitrary -- orgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryInfoProperties :: Maybe OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties
    
instance Arbitrary OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties where
  arbitrary =
    OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties
      <$> arbitrary -- orgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryPropertiesName :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryPropertiesMinPoolSize :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryPropertiesMaxPoolSize :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryPropertiesQueueSize :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryPropertiesMaxThreadAge :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryPropertiesKeepAliveTime :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryPropertiesBlockPolicy :: Maybe ConfigNodePropertyDropDown
      <*> arbitrary -- orgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryPropertiesShutdownGraceful :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- orgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryPropertiesDaemon :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- orgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryPropertiesShutdownWaitTime :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryPropertiesPriority :: Maybe ConfigNodePropertyDropDown
    
instance Arbitrary OrgApacheSlingDatasourceDataSourceFactoryInfo where
  arbitrary =
    OrgApacheSlingDatasourceDataSourceFactoryInfo
      <$> arbitrary -- orgApacheSlingDatasourceDataSourceFactoryInfoPid :: Maybe Text
      <*> arbitrary -- orgApacheSlingDatasourceDataSourceFactoryInfoTitle :: Maybe Text
      <*> arbitrary -- orgApacheSlingDatasourceDataSourceFactoryInfoDescription :: Maybe Text
      <*> arbitrary -- orgApacheSlingDatasourceDataSourceFactoryInfoProperties :: Maybe OrgApacheSlingDatasourceDataSourceFactoryProperties
    
instance Arbitrary OrgApacheSlingDatasourceDataSourceFactoryProperties where
  arbitrary =
    OrgApacheSlingDatasourceDataSourceFactoryProperties
      <$> arbitrary -- orgApacheSlingDatasourceDataSourceFactoryPropertiesDatasourceName :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingDatasourceDataSourceFactoryPropertiesDatasourceSvcPropName :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingDatasourceDataSourceFactoryPropertiesDriverClassName :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingDatasourceDataSourceFactoryPropertiesUrl :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingDatasourceDataSourceFactoryPropertiesUsername :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingDatasourceDataSourceFactoryPropertiesPassword :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingDatasourceDataSourceFactoryPropertiesDefaultAutoCommit :: Maybe ConfigNodePropertyDropDown
      <*> arbitrary -- orgApacheSlingDatasourceDataSourceFactoryPropertiesDefaultReadOnly :: Maybe ConfigNodePropertyDropDown
      <*> arbitrary -- orgApacheSlingDatasourceDataSourceFactoryPropertiesDefaultTransactionIsolation :: Maybe ConfigNodePropertyDropDown
      <*> arbitrary -- orgApacheSlingDatasourceDataSourceFactoryPropertiesDefaultCatalog :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingDatasourceDataSourceFactoryPropertiesMaxActive :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheSlingDatasourceDataSourceFactoryPropertiesMaxIdle :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheSlingDatasourceDataSourceFactoryPropertiesMinIdle :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheSlingDatasourceDataSourceFactoryPropertiesInitialSize :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheSlingDatasourceDataSourceFactoryPropertiesMaxWait :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheSlingDatasourceDataSourceFactoryPropertiesMaxAge :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheSlingDatasourceDataSourceFactoryPropertiesTestOnBorrow :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- orgApacheSlingDatasourceDataSourceFactoryPropertiesTestOnReturn :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- orgApacheSlingDatasourceDataSourceFactoryPropertiesTestWhileIdle :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- orgApacheSlingDatasourceDataSourceFactoryPropertiesValidationQuery :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingDatasourceDataSourceFactoryPropertiesValidationQueryTimeout :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheSlingDatasourceDataSourceFactoryPropertiesTimeBetweenEvictionRunsMillis :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheSlingDatasourceDataSourceFactoryPropertiesMinEvictableIdleTimeMillis :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheSlingDatasourceDataSourceFactoryPropertiesConnectionProperties :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingDatasourceDataSourceFactoryPropertiesInitSql :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingDatasourceDataSourceFactoryPropertiesJdbcInterceptors :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingDatasourceDataSourceFactoryPropertiesValidationInterval :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheSlingDatasourceDataSourceFactoryPropertiesLogValidationErrors :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- orgApacheSlingDatasourceDataSourceFactoryPropertiesDatasourceSvcProperties :: Maybe ConfigNodePropertyArray
    
instance Arbitrary OrgApacheSlingDatasourceJNDIDataSourceFactoryInfo where
  arbitrary =
    OrgApacheSlingDatasourceJNDIDataSourceFactoryInfo
      <$> arbitrary -- orgApacheSlingDatasourceJNDIDataSourceFactoryInfoPid :: Maybe Text
      <*> arbitrary -- orgApacheSlingDatasourceJNDIDataSourceFactoryInfoTitle :: Maybe Text
      <*> arbitrary -- orgApacheSlingDatasourceJNDIDataSourceFactoryInfoDescription :: Maybe Text
      <*> arbitrary -- orgApacheSlingDatasourceJNDIDataSourceFactoryInfoProperties :: Maybe OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties
    
instance Arbitrary OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties where
  arbitrary =
    OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties
      <$> arbitrary -- orgApacheSlingDatasourceJNDIDataSourceFactoryPropertiesDatasourceName :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingDatasourceJNDIDataSourceFactoryPropertiesDatasourceSvcPropName :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingDatasourceJNDIDataSourceFactoryPropertiesDatasourceJndiName :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingDatasourceJNDIDataSourceFactoryPropertiesJndiProperties :: Maybe ConfigNodePropertyArray
    
instance Arbitrary OrgApacheSlingDiscoveryOakConfigInfo where
  arbitrary =
    OrgApacheSlingDiscoveryOakConfigInfo
      <$> arbitrary -- orgApacheSlingDiscoveryOakConfigInfoPid :: Maybe Text
      <*> arbitrary -- orgApacheSlingDiscoveryOakConfigInfoTitle :: Maybe Text
      <*> arbitrary -- orgApacheSlingDiscoveryOakConfigInfoDescription :: Maybe Text
      <*> arbitrary -- orgApacheSlingDiscoveryOakConfigInfoProperties :: Maybe OrgApacheSlingDiscoveryOakConfigProperties
      <*> arbitrary -- orgApacheSlingDiscoveryOakConfigInfoBundleLocation :: Maybe Text
      <*> arbitrary -- orgApacheSlingDiscoveryOakConfigInfoServiceLocation :: Maybe Text
    
instance Arbitrary OrgApacheSlingDiscoveryOakConfigProperties where
  arbitrary =
    OrgApacheSlingDiscoveryOakConfigProperties
      <$> arbitrary -- orgApacheSlingDiscoveryOakConfigPropertiesConnectorPingTimeout :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheSlingDiscoveryOakConfigPropertiesConnectorPingInterval :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheSlingDiscoveryOakConfigPropertiesDiscoveryLiteCheckInterval :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheSlingDiscoveryOakConfigPropertiesClusterSyncServiceTimeout :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheSlingDiscoveryOakConfigPropertiesClusterSyncServiceInterval :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheSlingDiscoveryOakConfigPropertiesEnableSyncToken :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- orgApacheSlingDiscoveryOakConfigPropertiesMinEventDelay :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheSlingDiscoveryOakConfigPropertiesSocketConnectTimeout :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheSlingDiscoveryOakConfigPropertiesSoTimeout :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheSlingDiscoveryOakConfigPropertiesTopologyConnectorUrls :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- orgApacheSlingDiscoveryOakConfigPropertiesTopologyConnectorWhitelist :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- orgApacheSlingDiscoveryOakConfigPropertiesAutoStopLocalLoopEnabled :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- orgApacheSlingDiscoveryOakConfigPropertiesGzipConnectorRequestsEnabled :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- orgApacheSlingDiscoveryOakConfigPropertiesHmacEnabled :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- orgApacheSlingDiscoveryOakConfigPropertiesEnableEncryption :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- orgApacheSlingDiscoveryOakConfigPropertiesSharedKey :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingDiscoveryOakConfigPropertiesHmacSharedKeyTtl :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheSlingDiscoveryOakConfigPropertiesBackoffStandbyFactor :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingDiscoveryOakConfigPropertiesBackoffStableFactor :: Maybe ConfigNodePropertyString
    
instance Arbitrary OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckInfo where
  arbitrary =
    OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckInfo
      <$> arbitrary -- orgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckInfoPid :: Maybe Text
      <*> arbitrary -- orgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckInfoTitle :: Maybe Text
      <*> arbitrary -- orgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckInfoDescription :: Maybe Text
      <*> arbitrary -- orgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckInfoProperties :: Maybe OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties
    
instance Arbitrary OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties where
  arbitrary =
    OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties
      <$> arbitrary -- orgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckPropertiesHcName :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckPropertiesHcTags :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- orgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckPropertiesHcMbeanName :: Maybe ConfigNodePropertyString
    
instance Arbitrary OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoInfo where
  arbitrary =
    OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoInfo
      <$> arbitrary -- orgApacheSlingDistributionAgentImplForwardDistributionAgentFactoInfoPid :: Maybe Text
      <*> arbitrary -- orgApacheSlingDistributionAgentImplForwardDistributionAgentFactoInfoTitle :: Maybe Text
      <*> arbitrary -- orgApacheSlingDistributionAgentImplForwardDistributionAgentFactoInfoDescription :: Maybe Text
      <*> arbitrary -- orgApacheSlingDistributionAgentImplForwardDistributionAgentFactoInfoProperties :: Maybe OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties
    
instance Arbitrary OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties where
  arbitrary =
    OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties
      <$> arbitrary -- orgApacheSlingDistributionAgentImplForwardDistributionAgentFactoPropertiesName :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingDistributionAgentImplForwardDistributionAgentFactoPropertiesTitle :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingDistributionAgentImplForwardDistributionAgentFactoPropertiesDetails :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingDistributionAgentImplForwardDistributionAgentFactoPropertiesEnabled :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- orgApacheSlingDistributionAgentImplForwardDistributionAgentFactoPropertiesServiceName :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingDistributionAgentImplForwardDistributionAgentFactoPropertiesLogLevel :: Maybe ConfigNodePropertyDropDown
      <*> arbitrary -- orgApacheSlingDistributionAgentImplForwardDistributionAgentFactoPropertiesAllowedRoots :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- orgApacheSlingDistributionAgentImplForwardDistributionAgentFactoPropertiesQueueProcessingEnabled :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- orgApacheSlingDistributionAgentImplForwardDistributionAgentFactoPropertiesPackageImporterEndpoints :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- orgApacheSlingDistributionAgentImplForwardDistributionAgentFactoPropertiesPassiveQueues :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- orgApacheSlingDistributionAgentImplForwardDistributionAgentFactoPropertiesPriorityQueues :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- orgApacheSlingDistributionAgentImplForwardDistributionAgentFactoPropertiesRetryStrategy :: Maybe ConfigNodePropertyDropDown
      <*> arbitrary -- orgApacheSlingDistributionAgentImplForwardDistributionAgentFactoPropertiesRetryAttempts :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheSlingDistributionAgentImplForwardDistributionAgentFactoPropertiesRequestAuthorizationStrategyTarget :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingDistributionAgentImplForwardDistributionAgentFactoPropertiesTransportSecretProviderTarget :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingDistributionAgentImplForwardDistributionAgentFactoPropertiesPackageBuilderTarget :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingDistributionAgentImplForwardDistributionAgentFactoPropertiesTriggersTarget :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingDistributionAgentImplForwardDistributionAgentFactoPropertiesQueueProvider :: Maybe ConfigNodePropertyDropDown
      <*> arbitrary -- orgApacheSlingDistributionAgentImplForwardDistributionAgentFactoPropertiesAsyncDelivery :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- orgApacheSlingDistributionAgentImplForwardDistributionAgentFactoPropertiesHttpConnTimeout :: Maybe ConfigNodePropertyInteger
    
instance Arbitrary OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAInfo where
  arbitrary =
    OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAInfo
      <$> arbitrary -- orgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAInfoPid :: Maybe Text
      <*> arbitrary -- orgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAInfoTitle :: Maybe Text
      <*> arbitrary -- orgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAInfoDescription :: Maybe Text
      <*> arbitrary -- orgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAInfoProperties :: Maybe OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties
    
instance Arbitrary OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties where
  arbitrary =
    OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties
      <$> arbitrary -- orgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAPropertiesName :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAPropertiesJcrPrivilege :: Maybe ConfigNodePropertyString
    
instance Arbitrary OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryInfo where
  arbitrary =
    OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryInfo
      <$> arbitrary -- orgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryInfoPid :: Maybe Text
      <*> arbitrary -- orgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryInfoTitle :: Maybe Text
      <*> arbitrary -- orgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryInfoDescription :: Maybe Text
      <*> arbitrary -- orgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryInfoProperties :: Maybe OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties
    
instance Arbitrary OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties where
  arbitrary =
    OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties
      <$> arbitrary -- orgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryPropertiesName :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryPropertiesTitle :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryPropertiesDetails :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryPropertiesEnabled :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- orgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryPropertiesServiceName :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryPropertiesLogLevel :: Maybe ConfigNodePropertyDropDown
      <*> arbitrary -- orgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryPropertiesAllowedRoots :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- orgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryPropertiesRequestAuthorizationStrategyTarget :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryPropertiesQueueProviderFactoryTarget :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryPropertiesPackageBuilderTarget :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryPropertiesTriggersTarget :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryPropertiesPriorityQueues :: Maybe ConfigNodePropertyArray
    
instance Arbitrary OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoInfo where
  arbitrary =
    OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoInfo
      <$> arbitrary -- orgApacheSlingDistributionAgentImplReverseDistributionAgentFactoInfoPid :: Maybe Text
      <*> arbitrary -- orgApacheSlingDistributionAgentImplReverseDistributionAgentFactoInfoTitle :: Maybe Text
      <*> arbitrary -- orgApacheSlingDistributionAgentImplReverseDistributionAgentFactoInfoDescription :: Maybe Text
      <*> arbitrary -- orgApacheSlingDistributionAgentImplReverseDistributionAgentFactoInfoProperties :: Maybe OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties
    
instance Arbitrary OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties where
  arbitrary =
    OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoProperties
      <$> arbitrary -- orgApacheSlingDistributionAgentImplReverseDistributionAgentFactoPropertiesName :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingDistributionAgentImplReverseDistributionAgentFactoPropertiesTitle :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingDistributionAgentImplReverseDistributionAgentFactoPropertiesDetails :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingDistributionAgentImplReverseDistributionAgentFactoPropertiesEnabled :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- orgApacheSlingDistributionAgentImplReverseDistributionAgentFactoPropertiesServiceName :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingDistributionAgentImplReverseDistributionAgentFactoPropertiesLogLevel :: Maybe ConfigNodePropertyDropDown
      <*> arbitrary -- orgApacheSlingDistributionAgentImplReverseDistributionAgentFactoPropertiesQueueProcessingEnabled :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- orgApacheSlingDistributionAgentImplReverseDistributionAgentFactoPropertiesPackageExporterEndpoints :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- orgApacheSlingDistributionAgentImplReverseDistributionAgentFactoPropertiesPullItems :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheSlingDistributionAgentImplReverseDistributionAgentFactoPropertiesHttpConnTimeout :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheSlingDistributionAgentImplReverseDistributionAgentFactoPropertiesRequestAuthorizationStrategyTarget :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingDistributionAgentImplReverseDistributionAgentFactoPropertiesTransportSecretProviderTarget :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingDistributionAgentImplReverseDistributionAgentFactoPropertiesPackageBuilderTarget :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingDistributionAgentImplReverseDistributionAgentFactoPropertiesTriggersTarget :: Maybe ConfigNodePropertyString
    
instance Arbitrary OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorInfo where
  arbitrary =
    OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorInfo
      <$> arbitrary -- orgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorInfoPid :: Maybe Text
      <*> arbitrary -- orgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorInfoTitle :: Maybe Text
      <*> arbitrary -- orgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorInfoDescription :: Maybe Text
      <*> arbitrary -- orgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorInfoProperties :: Maybe OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties
    
instance Arbitrary OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties where
  arbitrary =
    OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties
      <$> arbitrary -- orgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorPropertiesName :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorPropertiesTitle :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorPropertiesDetails :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorPropertiesEnabled :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- orgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorPropertiesServiceName :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorPropertiesLogLevel :: Maybe ConfigNodePropertyDropDown
      <*> arbitrary -- orgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorPropertiesQueueProcessingEnabled :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- orgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorPropertiesPackageExporterTarget :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorPropertiesPackageImporterTarget :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorPropertiesRequestAuthorizationStrategyTarget :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorPropertiesTriggersTarget :: Maybe ConfigNodePropertyString
    
instance Arbitrary OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryInfo where
  arbitrary =
    OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryInfo
      <$> arbitrary -- orgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryInfoPid :: Maybe Text
      <*> arbitrary -- orgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryInfoTitle :: Maybe Text
      <*> arbitrary -- orgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryInfoDescription :: Maybe Text
      <*> arbitrary -- orgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryInfoProperties :: Maybe OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties
    
instance Arbitrary OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties where
  arbitrary =
    OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties
      <$> arbitrary -- orgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryPropertiesName :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryPropertiesTitle :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryPropertiesDetails :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryPropertiesEnabled :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- orgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryPropertiesServiceName :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryPropertiesLogLevel :: Maybe ConfigNodePropertyDropDown
      <*> arbitrary -- orgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryPropertiesQueueProcessingEnabled :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- orgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryPropertiesPassiveQueues :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- orgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryPropertiesPackageExporterEndpoints :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- orgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryPropertiesPackageImporterEndpoints :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- orgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryPropertiesRetryStrategy :: Maybe ConfigNodePropertyDropDown
      <*> arbitrary -- orgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryPropertiesRetryAttempts :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryPropertiesPullItems :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryPropertiesHttpConnTimeout :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryPropertiesRequestAuthorizationStrategyTarget :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryPropertiesTransportSecretProviderTarget :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryPropertiesPackageBuilderTarget :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryPropertiesTriggersTarget :: Maybe ConfigNodePropertyString
    
instance Arbitrary OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckInfo where
  arbitrary =
    OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckInfo
      <$> arbitrary -- orgApacheSlingDistributionMonitorDistributionQueueHealthCheckInfoPid :: Maybe Text
      <*> arbitrary -- orgApacheSlingDistributionMonitorDistributionQueueHealthCheckInfoTitle :: Maybe Text
      <*> arbitrary -- orgApacheSlingDistributionMonitorDistributionQueueHealthCheckInfoDescription :: Maybe Text
      <*> arbitrary -- orgApacheSlingDistributionMonitorDistributionQueueHealthCheckInfoProperties :: Maybe OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties
    
instance Arbitrary OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties where
  arbitrary =
    OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties
      <$> arbitrary -- orgApacheSlingDistributionMonitorDistributionQueueHealthCheckPropertiesHcName :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingDistributionMonitorDistributionQueueHealthCheckPropertiesHcTags :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- orgApacheSlingDistributionMonitorDistributionQueueHealthCheckPropertiesHcMbeanName :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingDistributionMonitorDistributionQueueHealthCheckPropertiesNumberOfRetriesAllowed :: Maybe ConfigNodePropertyInteger
    
instance Arbitrary OrgApacheSlingDistributionPackagingImplExporterAgentDistributioInfo where
  arbitrary =
    OrgApacheSlingDistributionPackagingImplExporterAgentDistributioInfo
      <$> arbitrary -- orgApacheSlingDistributionPackagingImplExporterAgentDistributioInfoPid :: Maybe Text
      <*> arbitrary -- orgApacheSlingDistributionPackagingImplExporterAgentDistributioInfoTitle :: Maybe Text
      <*> arbitrary -- orgApacheSlingDistributionPackagingImplExporterAgentDistributioInfoDescription :: Maybe Text
      <*> arbitrary -- orgApacheSlingDistributionPackagingImplExporterAgentDistributioInfoProperties :: Maybe OrgApacheSlingDistributionPackagingImplExporterAgentDistributioProperties
    
instance Arbitrary OrgApacheSlingDistributionPackagingImplExporterAgentDistributioProperties where
  arbitrary =
    OrgApacheSlingDistributionPackagingImplExporterAgentDistributioProperties
      <$> arbitrary -- orgApacheSlingDistributionPackagingImplExporterAgentDistributioPropertiesName :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingDistributionPackagingImplExporterAgentDistributioPropertiesQueue :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingDistributionPackagingImplExporterAgentDistributioPropertiesDropInvalidItems :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- orgApacheSlingDistributionPackagingImplExporterAgentDistributioPropertiesAgentTarget :: Maybe ConfigNodePropertyString
    
instance Arbitrary OrgApacheSlingDistributionPackagingImplExporterLocalDistributioInfo where
  arbitrary =
    OrgApacheSlingDistributionPackagingImplExporterLocalDistributioInfo
      <$> arbitrary -- orgApacheSlingDistributionPackagingImplExporterLocalDistributioInfoPid :: Maybe Text
      <*> arbitrary -- orgApacheSlingDistributionPackagingImplExporterLocalDistributioInfoTitle :: Maybe Text
      <*> arbitrary -- orgApacheSlingDistributionPackagingImplExporterLocalDistributioInfoDescription :: Maybe Text
      <*> arbitrary -- orgApacheSlingDistributionPackagingImplExporterLocalDistributioInfoProperties :: Maybe OrgApacheSlingDistributionPackagingImplExporterLocalDistributioProperties
    
instance Arbitrary OrgApacheSlingDistributionPackagingImplExporterLocalDistributioProperties where
  arbitrary =
    OrgApacheSlingDistributionPackagingImplExporterLocalDistributioProperties
      <$> arbitrary -- orgApacheSlingDistributionPackagingImplExporterLocalDistributioPropertiesName :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingDistributionPackagingImplExporterLocalDistributioPropertiesPackageBuilderTarget :: Maybe ConfigNodePropertyString
    
instance Arbitrary OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiInfo where
  arbitrary =
    OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiInfo
      <$> arbitrary -- orgApacheSlingDistributionPackagingImplExporterRemoteDistributiInfoPid :: Maybe Text
      <*> arbitrary -- orgApacheSlingDistributionPackagingImplExporterRemoteDistributiInfoTitle :: Maybe Text
      <*> arbitrary -- orgApacheSlingDistributionPackagingImplExporterRemoteDistributiInfoDescription :: Maybe Text
      <*> arbitrary -- orgApacheSlingDistributionPackagingImplExporterRemoteDistributiInfoProperties :: Maybe OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties
    
instance Arbitrary OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties where
  arbitrary =
    OrgApacheSlingDistributionPackagingImplExporterRemoteDistributiProperties
      <$> arbitrary -- orgApacheSlingDistributionPackagingImplExporterRemoteDistributiPropertiesName :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingDistributionPackagingImplExporterRemoteDistributiPropertiesEndpoints :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- orgApacheSlingDistributionPackagingImplExporterRemoteDistributiPropertiesPullItems :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheSlingDistributionPackagingImplExporterRemoteDistributiPropertiesPackageBuilderTarget :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingDistributionPackagingImplExporterRemoteDistributiPropertiesTransportSecretProviderTarget :: Maybe ConfigNodePropertyString
    
instance Arbitrary OrgApacheSlingDistributionPackagingImplImporterLocalDistributioInfo where
  arbitrary =
    OrgApacheSlingDistributionPackagingImplImporterLocalDistributioInfo
      <$> arbitrary -- orgApacheSlingDistributionPackagingImplImporterLocalDistributioInfoPid :: Maybe Text
      <*> arbitrary -- orgApacheSlingDistributionPackagingImplImporterLocalDistributioInfoTitle :: Maybe Text
      <*> arbitrary -- orgApacheSlingDistributionPackagingImplImporterLocalDistributioInfoDescription :: Maybe Text
      <*> arbitrary -- orgApacheSlingDistributionPackagingImplImporterLocalDistributioInfoProperties :: Maybe OrgApacheSlingDistributionPackagingImplImporterLocalDistributioProperties
    
instance Arbitrary OrgApacheSlingDistributionPackagingImplImporterLocalDistributioProperties where
  arbitrary =
    OrgApacheSlingDistributionPackagingImplImporterLocalDistributioProperties
      <$> arbitrary -- orgApacheSlingDistributionPackagingImplImporterLocalDistributioPropertiesName :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingDistributionPackagingImplImporterLocalDistributioPropertiesPackageBuilderTarget :: Maybe ConfigNodePropertyString
    
instance Arbitrary OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiInfo where
  arbitrary =
    OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiInfo
      <$> arbitrary -- orgApacheSlingDistributionPackagingImplImporterRemoteDistributiInfoPid :: Maybe Text
      <*> arbitrary -- orgApacheSlingDistributionPackagingImplImporterRemoteDistributiInfoTitle :: Maybe Text
      <*> arbitrary -- orgApacheSlingDistributionPackagingImplImporterRemoteDistributiInfoDescription :: Maybe Text
      <*> arbitrary -- orgApacheSlingDistributionPackagingImplImporterRemoteDistributiInfoProperties :: Maybe OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties
    
instance Arbitrary OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties where
  arbitrary =
    OrgApacheSlingDistributionPackagingImplImporterRemoteDistributiProperties
      <$> arbitrary -- orgApacheSlingDistributionPackagingImplImporterRemoteDistributiPropertiesName :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingDistributionPackagingImplImporterRemoteDistributiPropertiesEndpoints :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- orgApacheSlingDistributionPackagingImplImporterRemoteDistributiPropertiesTransportSecretProviderTarget :: Maybe ConfigNodePropertyString
    
instance Arbitrary OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriInfo where
  arbitrary =
    OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriInfo
      <$> arbitrary -- orgApacheSlingDistributionPackagingImplImporterRepositoryDistriInfoPid :: Maybe Text
      <*> arbitrary -- orgApacheSlingDistributionPackagingImplImporterRepositoryDistriInfoTitle :: Maybe Text
      <*> arbitrary -- orgApacheSlingDistributionPackagingImplImporterRepositoryDistriInfoDescription :: Maybe Text
      <*> arbitrary -- orgApacheSlingDistributionPackagingImplImporterRepositoryDistriInfoProperties :: Maybe OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties
    
instance Arbitrary OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties where
  arbitrary =
    OrgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties
      <$> arbitrary -- orgApacheSlingDistributionPackagingImplImporterRepositoryDistriPropertiesName :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingDistributionPackagingImplImporterRepositoryDistriPropertiesServiceName :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingDistributionPackagingImplImporterRepositoryDistriPropertiesPath :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingDistributionPackagingImplImporterRepositoryDistriPropertiesPrivilegeName :: Maybe ConfigNodePropertyString
    
instance Arbitrary OrgApacheSlingDistributionResourcesImplDistributionConfigurationInfo where
  arbitrary =
    OrgApacheSlingDistributionResourcesImplDistributionConfigurationInfo
      <$> arbitrary -- orgApacheSlingDistributionResourcesImplDistributionConfigurationInfoPid :: Maybe Text
      <*> arbitrary -- orgApacheSlingDistributionResourcesImplDistributionConfigurationInfoTitle :: Maybe Text
      <*> arbitrary -- orgApacheSlingDistributionResourcesImplDistributionConfigurationInfoDescription :: Maybe Text
      <*> arbitrary -- orgApacheSlingDistributionResourcesImplDistributionConfigurationInfoProperties :: Maybe OrgApacheSlingDistributionResourcesImplDistributionConfigurationProperties
    
instance Arbitrary OrgApacheSlingDistributionResourcesImplDistributionConfigurationProperties where
  arbitrary =
    OrgApacheSlingDistributionResourcesImplDistributionConfigurationProperties
      <$> arbitrary -- orgApacheSlingDistributionResourcesImplDistributionConfigurationPropertiesProviderRoots :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingDistributionResourcesImplDistributionConfigurationPropertiesKind :: Maybe ConfigNodePropertyString
    
instance Arbitrary OrgApacheSlingDistributionResourcesImplDistributionServiceResourInfo where
  arbitrary =
    OrgApacheSlingDistributionResourcesImplDistributionServiceResourInfo
      <$> arbitrary -- orgApacheSlingDistributionResourcesImplDistributionServiceResourInfoPid :: Maybe Text
      <*> arbitrary -- orgApacheSlingDistributionResourcesImplDistributionServiceResourInfoTitle :: Maybe Text
      <*> arbitrary -- orgApacheSlingDistributionResourcesImplDistributionServiceResourInfoDescription :: Maybe Text
      <*> arbitrary -- orgApacheSlingDistributionResourcesImplDistributionServiceResourInfoProperties :: Maybe OrgApacheSlingDistributionResourcesImplDistributionServiceResourProperties
    
instance Arbitrary OrgApacheSlingDistributionResourcesImplDistributionServiceResourProperties where
  arbitrary =
    OrgApacheSlingDistributionResourcesImplDistributionServiceResourProperties
      <$> arbitrary -- orgApacheSlingDistributionResourcesImplDistributionServiceResourPropertiesProviderRoots :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingDistributionResourcesImplDistributionServiceResourPropertiesKind :: Maybe ConfigNodePropertyString
    
instance Arbitrary OrgApacheSlingDistributionSerializationImplDistributionPackageBuInfo where
  arbitrary =
    OrgApacheSlingDistributionSerializationImplDistributionPackageBuInfo
      <$> arbitrary -- orgApacheSlingDistributionSerializationImplDistributionPackageBuInfoPid :: Maybe Text
      <*> arbitrary -- orgApacheSlingDistributionSerializationImplDistributionPackageBuInfoTitle :: Maybe Text
      <*> arbitrary -- orgApacheSlingDistributionSerializationImplDistributionPackageBuInfoDescription :: Maybe Text
      <*> arbitrary -- orgApacheSlingDistributionSerializationImplDistributionPackageBuInfoProperties :: Maybe OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties
    
instance Arbitrary OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties where
  arbitrary =
    OrgApacheSlingDistributionSerializationImplDistributionPackageBuProperties
      <$> arbitrary -- orgApacheSlingDistributionSerializationImplDistributionPackageBuPropertiesName :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingDistributionSerializationImplDistributionPackageBuPropertiesType :: Maybe ConfigNodePropertyDropDown
      <*> arbitrary -- orgApacheSlingDistributionSerializationImplDistributionPackageBuPropertiesFormatTarget :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingDistributionSerializationImplDistributionPackageBuPropertiesTempFsFolder :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingDistributionSerializationImplDistributionPackageBuPropertiesFileThreshold :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheSlingDistributionSerializationImplDistributionPackageBuPropertiesMemoryUnit :: Maybe ConfigNodePropertyDropDown
      <*> arbitrary -- orgApacheSlingDistributionSerializationImplDistributionPackageBuPropertiesUseOffHeapMemory :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- orgApacheSlingDistributionSerializationImplDistributionPackageBuPropertiesDigestAlgorithm :: Maybe ConfigNodePropertyDropDown
      <*> arbitrary -- orgApacheSlingDistributionSerializationImplDistributionPackageBuPropertiesMonitoringQueueSize :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheSlingDistributionSerializationImplDistributionPackageBuPropertiesCleanupDelay :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheSlingDistributionSerializationImplDistributionPackageBuPropertiesPackageFilters :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- orgApacheSlingDistributionSerializationImplDistributionPackageBuPropertiesPropertyFilters :: Maybe ConfigNodePropertyArray
    
instance Arbitrary OrgApacheSlingDistributionSerializationImplVltVaultDistributionInfo where
  arbitrary =
    OrgApacheSlingDistributionSerializationImplVltVaultDistributionInfo
      <$> arbitrary -- orgApacheSlingDistributionSerializationImplVltVaultDistributionInfoPid :: Maybe Text
      <*> arbitrary -- orgApacheSlingDistributionSerializationImplVltVaultDistributionInfoTitle :: Maybe Text
      <*> arbitrary -- orgApacheSlingDistributionSerializationImplVltVaultDistributionInfoDescription :: Maybe Text
      <*> arbitrary -- orgApacheSlingDistributionSerializationImplVltVaultDistributionInfoProperties :: Maybe OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties
    
instance Arbitrary OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties where
  arbitrary =
    OrgApacheSlingDistributionSerializationImplVltVaultDistributionProperties
      <$> arbitrary -- orgApacheSlingDistributionSerializationImplVltVaultDistributionPropertiesName :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingDistributionSerializationImplVltVaultDistributionPropertiesType :: Maybe ConfigNodePropertyDropDown
      <*> arbitrary -- orgApacheSlingDistributionSerializationImplVltVaultDistributionPropertiesImportMode :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingDistributionSerializationImplVltVaultDistributionPropertiesAclHandling :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingDistributionSerializationImplVltVaultDistributionPropertiesPackageRoots :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingDistributionSerializationImplVltVaultDistributionPropertiesPackageFilters :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- orgApacheSlingDistributionSerializationImplVltVaultDistributionPropertiesPropertyFilters :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- orgApacheSlingDistributionSerializationImplVltVaultDistributionPropertiesTempFsFolder :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingDistributionSerializationImplVltVaultDistributionPropertiesUseBinaryReferences :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- orgApacheSlingDistributionSerializationImplVltVaultDistributionPropertiesAutoSaveThreshold :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheSlingDistributionSerializationImplVltVaultDistributionPropertiesCleanupDelay :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheSlingDistributionSerializationImplVltVaultDistributionPropertiesFileThreshold :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheSlingDistributionSerializationImplVltVaultDistributionPropertiesMegaBytes :: Maybe ConfigNodePropertyDropDown
      <*> arbitrary -- orgApacheSlingDistributionSerializationImplVltVaultDistributionPropertiesUseOffHeapMemory :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- orgApacheSlingDistributionSerializationImplVltVaultDistributionPropertiesDigestAlgorithm :: Maybe ConfigNodePropertyDropDown
      <*> arbitrary -- orgApacheSlingDistributionSerializationImplVltVaultDistributionPropertiesMonitoringQueueSize :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheSlingDistributionSerializationImplVltVaultDistributionPropertiesPathsMapping :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- orgApacheSlingDistributionSerializationImplVltVaultDistributionPropertiesStrictImport :: Maybe ConfigNodePropertyBoolean
    
instance Arbitrary OrgApacheSlingDistributionTransportImplUserCredentialsDistributiInfo where
  arbitrary =
    OrgApacheSlingDistributionTransportImplUserCredentialsDistributiInfo
      <$> arbitrary -- orgApacheSlingDistributionTransportImplUserCredentialsDistributiInfoPid :: Maybe Text
      <*> arbitrary -- orgApacheSlingDistributionTransportImplUserCredentialsDistributiInfoTitle :: Maybe Text
      <*> arbitrary -- orgApacheSlingDistributionTransportImplUserCredentialsDistributiInfoDescription :: Maybe Text
      <*> arbitrary -- orgApacheSlingDistributionTransportImplUserCredentialsDistributiInfoProperties :: Maybe OrgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties
    
instance Arbitrary OrgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties where
  arbitrary =
    OrgApacheSlingDistributionTransportImplUserCredentialsDistributiProperties
      <$> arbitrary -- orgApacheSlingDistributionTransportImplUserCredentialsDistributiPropertiesName :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingDistributionTransportImplUserCredentialsDistributiPropertiesUsername :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingDistributionTransportImplUserCredentialsDistributiPropertiesPassword :: Maybe ConfigNodePropertyString
    
instance Arbitrary OrgApacheSlingDistributionTriggerImplDistributionEventDistributeInfo where
  arbitrary =
    OrgApacheSlingDistributionTriggerImplDistributionEventDistributeInfo
      <$> arbitrary -- orgApacheSlingDistributionTriggerImplDistributionEventDistributeInfoPid :: Maybe Text
      <*> arbitrary -- orgApacheSlingDistributionTriggerImplDistributionEventDistributeInfoTitle :: Maybe Text
      <*> arbitrary -- orgApacheSlingDistributionTriggerImplDistributionEventDistributeInfoDescription :: Maybe Text
      <*> arbitrary -- orgApacheSlingDistributionTriggerImplDistributionEventDistributeInfoProperties :: Maybe OrgApacheSlingDistributionTriggerImplDistributionEventDistributeProperties
    
instance Arbitrary OrgApacheSlingDistributionTriggerImplDistributionEventDistributeProperties where
  arbitrary =
    OrgApacheSlingDistributionTriggerImplDistributionEventDistributeProperties
      <$> arbitrary -- orgApacheSlingDistributionTriggerImplDistributionEventDistributePropertiesName :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingDistributionTriggerImplDistributionEventDistributePropertiesPath :: Maybe ConfigNodePropertyString
    
instance Arbitrary OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerInfo where
  arbitrary =
    OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerInfo
      <$> arbitrary -- orgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerInfoPid :: Maybe Text
      <*> arbitrary -- orgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerInfoTitle :: Maybe Text
      <*> arbitrary -- orgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerInfoDescription :: Maybe Text
      <*> arbitrary -- orgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerInfoProperties :: Maybe OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties
    
instance Arbitrary OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties where
  arbitrary =
    OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties
      <$> arbitrary -- orgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerPropertiesName :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerPropertiesPath :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerPropertiesIgnoredPathsPatterns :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- orgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerPropertiesServiceName :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerPropertiesDeep :: Maybe ConfigNodePropertyBoolean
    
instance Arbitrary OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiInfo where
  arbitrary =
    OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiInfo
      <$> arbitrary -- orgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiInfoPid :: Maybe Text
      <*> arbitrary -- orgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiInfoTitle :: Maybe Text
      <*> arbitrary -- orgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiInfoDescription :: Maybe Text
      <*> arbitrary -- orgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiInfoProperties :: Maybe OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties
    
instance Arbitrary OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties where
  arbitrary =
    OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties
      <$> arbitrary -- orgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiPropertiesName :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiPropertiesPath :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiPropertiesServiceName :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiPropertiesNuggetsPath :: Maybe ConfigNodePropertyString
    
instance Arbitrary OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigInfo where
  arbitrary =
    OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigInfo
      <$> arbitrary -- orgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigInfoPid :: Maybe Text
      <*> arbitrary -- orgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigInfoTitle :: Maybe Text
      <*> arbitrary -- orgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigInfoDescription :: Maybe Text
      <*> arbitrary -- orgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigInfoProperties :: Maybe OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigProperties
    
instance Arbitrary OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigProperties where
  arbitrary =
    OrgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigProperties
      <$> arbitrary -- orgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigPropertiesName :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigPropertiesEndpoint :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingDistributionTriggerImplRemoteEventDistributionTrigPropertiesTransportSecretProviderTarget :: Maybe ConfigNodePropertyString
    
instance Arbitrary OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrInfo where
  arbitrary =
    OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrInfo
      <$> arbitrary -- orgApacheSlingDistributionTriggerImplResourceEventDistributionTrInfoPid :: Maybe Text
      <*> arbitrary -- orgApacheSlingDistributionTriggerImplResourceEventDistributionTrInfoTitle :: Maybe Text
      <*> arbitrary -- orgApacheSlingDistributionTriggerImplResourceEventDistributionTrInfoDescription :: Maybe Text
      <*> arbitrary -- orgApacheSlingDistributionTriggerImplResourceEventDistributionTrInfoProperties :: Maybe OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrProperties
    
instance Arbitrary OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrProperties where
  arbitrary =
    OrgApacheSlingDistributionTriggerImplResourceEventDistributionTrProperties
      <$> arbitrary -- orgApacheSlingDistributionTriggerImplResourceEventDistributionTrPropertiesName :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingDistributionTriggerImplResourceEventDistributionTrPropertiesPath :: Maybe ConfigNodePropertyString
    
instance Arbitrary OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeInfo where
  arbitrary =
    OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeInfo
      <$> arbitrary -- orgApacheSlingDistributionTriggerImplScheduledDistributionTriggeInfoPid :: Maybe Text
      <*> arbitrary -- orgApacheSlingDistributionTriggerImplScheduledDistributionTriggeInfoTitle :: Maybe Text
      <*> arbitrary -- orgApacheSlingDistributionTriggerImplScheduledDistributionTriggeInfoDescription :: Maybe Text
      <*> arbitrary -- orgApacheSlingDistributionTriggerImplScheduledDistributionTriggeInfoProperties :: Maybe OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties
    
instance Arbitrary OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties where
  arbitrary =
    OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties
      <$> arbitrary -- orgApacheSlingDistributionTriggerImplScheduledDistributionTriggePropertiesName :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingDistributionTriggerImplScheduledDistributionTriggePropertiesPath :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingDistributionTriggerImplScheduledDistributionTriggePropertiesSeconds :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingDistributionTriggerImplScheduledDistributionTriggePropertiesServiceName :: Maybe ConfigNodePropertyString
    
instance Arbitrary OrgApacheSlingEngineImplAuthSlingAuthenticatorInfo where
  arbitrary =
    OrgApacheSlingEngineImplAuthSlingAuthenticatorInfo
      <$> arbitrary -- orgApacheSlingEngineImplAuthSlingAuthenticatorInfoPid :: Maybe Text
      <*> arbitrary -- orgApacheSlingEngineImplAuthSlingAuthenticatorInfoTitle :: Maybe Text
      <*> arbitrary -- orgApacheSlingEngineImplAuthSlingAuthenticatorInfoDescription :: Maybe Text
      <*> arbitrary -- orgApacheSlingEngineImplAuthSlingAuthenticatorInfoProperties :: Maybe OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties
      <*> arbitrary -- orgApacheSlingEngineImplAuthSlingAuthenticatorInfoBundleLocation :: Maybe Text
      <*> arbitrary -- orgApacheSlingEngineImplAuthSlingAuthenticatorInfoServiceLocation :: Maybe Text
    
instance Arbitrary OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties where
  arbitrary =
    OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties
      <$> arbitrary -- orgApacheSlingEngineImplAuthSlingAuthenticatorPropertiesOsgiHttpWhiteboardContextSelect :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingEngineImplAuthSlingAuthenticatorPropertiesOsgiHttpWhiteboardListener :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingEngineImplAuthSlingAuthenticatorPropertiesAuthSudoCookie :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingEngineImplAuthSlingAuthenticatorPropertiesAuthSudoParameter :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingEngineImplAuthSlingAuthenticatorPropertiesAuthAnnonymous :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- orgApacheSlingEngineImplAuthSlingAuthenticatorPropertiesSlingAuthRequirements :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- orgApacheSlingEngineImplAuthSlingAuthenticatorPropertiesSlingAuthAnonymousUser :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingEngineImplAuthSlingAuthenticatorPropertiesSlingAuthAnonymousPassword :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingEngineImplAuthSlingAuthenticatorPropertiesAuthHttp :: Maybe ConfigNodePropertyDropDown
      <*> arbitrary -- orgApacheSlingEngineImplAuthSlingAuthenticatorPropertiesAuthHttpRealm :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingEngineImplAuthSlingAuthenticatorPropertiesAuthUriSuffix :: Maybe ConfigNodePropertyArray
    
instance Arbitrary OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterInfo where
  arbitrary =
    OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterInfo
      <$> arbitrary -- orgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterInfoPid :: Maybe Text
      <*> arbitrary -- orgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterInfoTitle :: Maybe Text
      <*> arbitrary -- orgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterInfoDescription :: Maybe Text
      <*> arbitrary -- orgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterInfoProperties :: Maybe OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties
    
instance Arbitrary OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties where
  arbitrary =
    OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties
      <$> arbitrary -- orgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterPropertiesExtensions :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- orgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterPropertiesMinDurationMs :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterPropertiesMaxDurationMs :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterPropertiesCompactLogFormat :: Maybe ConfigNodePropertyBoolean
    
instance Arbitrary OrgApacheSlingEngineImplLogRequestLoggerInfo where
  arbitrary =
    OrgApacheSlingEngineImplLogRequestLoggerInfo
      <$> arbitrary -- orgApacheSlingEngineImplLogRequestLoggerInfoPid :: Maybe Text
      <*> arbitrary -- orgApacheSlingEngineImplLogRequestLoggerInfoTitle :: Maybe Text
      <*> arbitrary -- orgApacheSlingEngineImplLogRequestLoggerInfoDescription :: Maybe Text
      <*> arbitrary -- orgApacheSlingEngineImplLogRequestLoggerInfoProperties :: Maybe OrgApacheSlingEngineImplLogRequestLoggerProperties
      <*> arbitrary -- orgApacheSlingEngineImplLogRequestLoggerInfoBundleLocation :: Maybe Text
      <*> arbitrary -- orgApacheSlingEngineImplLogRequestLoggerInfoServiceLocation :: Maybe Text
    
instance Arbitrary OrgApacheSlingEngineImplLogRequestLoggerProperties where
  arbitrary =
    OrgApacheSlingEngineImplLogRequestLoggerProperties
      <$> arbitrary -- orgApacheSlingEngineImplLogRequestLoggerPropertiesRequestLogOutput :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingEngineImplLogRequestLoggerPropertiesRequestLogOutputtype :: Maybe ConfigNodePropertyDropDown
      <*> arbitrary -- orgApacheSlingEngineImplLogRequestLoggerPropertiesRequestLogEnabled :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- orgApacheSlingEngineImplLogRequestLoggerPropertiesAccessLogOutput :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingEngineImplLogRequestLoggerPropertiesAccessLogOutputtype :: Maybe ConfigNodePropertyDropDown
      <*> arbitrary -- orgApacheSlingEngineImplLogRequestLoggerPropertiesAccessLogEnabled :: Maybe ConfigNodePropertyBoolean
    
instance Arbitrary OrgApacheSlingEngineImplLogRequestLoggerServiceInfo where
  arbitrary =
    OrgApacheSlingEngineImplLogRequestLoggerServiceInfo
      <$> arbitrary -- orgApacheSlingEngineImplLogRequestLoggerServiceInfoPid :: Maybe Text
      <*> arbitrary -- orgApacheSlingEngineImplLogRequestLoggerServiceInfoTitle :: Maybe Text
      <*> arbitrary -- orgApacheSlingEngineImplLogRequestLoggerServiceInfoDescription :: Maybe Text
      <*> arbitrary -- orgApacheSlingEngineImplLogRequestLoggerServiceInfoProperties :: Maybe OrgApacheSlingEngineImplLogRequestLoggerServiceProperties
    
instance Arbitrary OrgApacheSlingEngineImplLogRequestLoggerServiceProperties where
  arbitrary =
    OrgApacheSlingEngineImplLogRequestLoggerServiceProperties
      <$> arbitrary -- orgApacheSlingEngineImplLogRequestLoggerServicePropertiesRequestLogServiceFormat :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingEngineImplLogRequestLoggerServicePropertiesRequestLogServiceOutput :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingEngineImplLogRequestLoggerServicePropertiesRequestLogServiceOutputtype :: Maybe ConfigNodePropertyDropDown
      <*> arbitrary -- orgApacheSlingEngineImplLogRequestLoggerServicePropertiesRequestLogServiceOnentry :: Maybe ConfigNodePropertyBoolean
    
instance Arbitrary OrgApacheSlingEngineImplSlingMainServletInfo where
  arbitrary =
    OrgApacheSlingEngineImplSlingMainServletInfo
      <$> arbitrary -- orgApacheSlingEngineImplSlingMainServletInfoPid :: Maybe Text
      <*> arbitrary -- orgApacheSlingEngineImplSlingMainServletInfoTitle :: Maybe Text
      <*> arbitrary -- orgApacheSlingEngineImplSlingMainServletInfoDescription :: Maybe Text
      <*> arbitrary -- orgApacheSlingEngineImplSlingMainServletInfoProperties :: Maybe OrgApacheSlingEngineImplSlingMainServletProperties
      <*> arbitrary -- orgApacheSlingEngineImplSlingMainServletInfoBundleLocation :: Maybe Text
      <*> arbitrary -- orgApacheSlingEngineImplSlingMainServletInfoServiceLocation :: Maybe Text
    
instance Arbitrary OrgApacheSlingEngineImplSlingMainServletProperties where
  arbitrary =
    OrgApacheSlingEngineImplSlingMainServletProperties
      <$> arbitrary -- orgApacheSlingEngineImplSlingMainServletPropertiesSlingMaxCalls :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheSlingEngineImplSlingMainServletPropertiesSlingMaxInclusions :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheSlingEngineImplSlingMainServletPropertiesSlingTraceAllow :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- orgApacheSlingEngineImplSlingMainServletPropertiesSlingMaxRecordRequests :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheSlingEngineImplSlingMainServletPropertiesSlingStorePatternRequests :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- orgApacheSlingEngineImplSlingMainServletPropertiesSlingServerinfo :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingEngineImplSlingMainServletPropertiesSlingAdditionalResponseHeaders :: Maybe ConfigNodePropertyArray
    
instance Arbitrary OrgApacheSlingEngineParametersInfo where
  arbitrary =
    OrgApacheSlingEngineParametersInfo
      <$> arbitrary -- orgApacheSlingEngineParametersInfoPid :: Maybe Text
      <*> arbitrary -- orgApacheSlingEngineParametersInfoTitle :: Maybe Text
      <*> arbitrary -- orgApacheSlingEngineParametersInfoDescription :: Maybe Text
      <*> arbitrary -- orgApacheSlingEngineParametersInfoProperties :: Maybe OrgApacheSlingEngineParametersProperties
      <*> arbitrary -- orgApacheSlingEngineParametersInfoBundleLocation :: Maybe Text
      <*> arbitrary -- orgApacheSlingEngineParametersInfoServiceLocation :: Maybe Text
    
instance Arbitrary OrgApacheSlingEngineParametersProperties where
  arbitrary =
    OrgApacheSlingEngineParametersProperties
      <$> arbitrary -- orgApacheSlingEngineParametersPropertiesSlingDefaultParameterEncoding :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingEngineParametersPropertiesSlingDefaultMaxParameters :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheSlingEngineParametersPropertiesFileLocation :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingEngineParametersPropertiesFileThreshold :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheSlingEngineParametersPropertiesFileMax :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheSlingEngineParametersPropertiesRequestMax :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheSlingEngineParametersPropertiesSlingDefaultParameterCheckForAdditionalContainerParameters :: Maybe ConfigNodePropertyBoolean
    
instance Arbitrary OrgApacheSlingEventImplEventingThreadPoolInfo where
  arbitrary =
    OrgApacheSlingEventImplEventingThreadPoolInfo
      <$> arbitrary -- orgApacheSlingEventImplEventingThreadPoolInfoPid :: Maybe Text
      <*> arbitrary -- orgApacheSlingEventImplEventingThreadPoolInfoTitle :: Maybe Text
      <*> arbitrary -- orgApacheSlingEventImplEventingThreadPoolInfoDescription :: Maybe Text
      <*> arbitrary -- orgApacheSlingEventImplEventingThreadPoolInfoProperties :: Maybe OrgApacheSlingEventImplEventingThreadPoolProperties
    
instance Arbitrary OrgApacheSlingEventImplEventingThreadPoolProperties where
  arbitrary =
    OrgApacheSlingEventImplEventingThreadPoolProperties
      <$> arbitrary -- orgApacheSlingEventImplEventingThreadPoolPropertiesMinPoolSize :: Maybe ConfigNodePropertyInteger
    
instance Arbitrary OrgApacheSlingEventImplJobsDefaultJobManagerInfo where
  arbitrary =
    OrgApacheSlingEventImplJobsDefaultJobManagerInfo
      <$> arbitrary -- orgApacheSlingEventImplJobsDefaultJobManagerInfoPid :: Maybe Text
      <*> arbitrary -- orgApacheSlingEventImplJobsDefaultJobManagerInfoTitle :: Maybe Text
      <*> arbitrary -- orgApacheSlingEventImplJobsDefaultJobManagerInfoDescription :: Maybe Text
      <*> arbitrary -- orgApacheSlingEventImplJobsDefaultJobManagerInfoProperties :: Maybe OrgApacheSlingEventImplJobsDefaultJobManagerProperties
    
instance Arbitrary OrgApacheSlingEventImplJobsDefaultJobManagerProperties where
  arbitrary =
    OrgApacheSlingEventImplJobsDefaultJobManagerProperties
      <$> arbitrary -- orgApacheSlingEventImplJobsDefaultJobManagerPropertiesQueuePriority :: Maybe ConfigNodePropertyDropDown
      <*> arbitrary -- orgApacheSlingEventImplJobsDefaultJobManagerPropertiesQueueRetries :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheSlingEventImplJobsDefaultJobManagerPropertiesQueueRetrydelay :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheSlingEventImplJobsDefaultJobManagerPropertiesQueueMaxparallel :: Maybe ConfigNodePropertyInteger
    
instance Arbitrary OrgApacheSlingEventImplJobsJcrPersistenceHandlerInfo where
  arbitrary =
    OrgApacheSlingEventImplJobsJcrPersistenceHandlerInfo
      <$> arbitrary -- orgApacheSlingEventImplJobsJcrPersistenceHandlerInfoPid :: Maybe Text
      <*> arbitrary -- orgApacheSlingEventImplJobsJcrPersistenceHandlerInfoTitle :: Maybe Text
      <*> arbitrary -- orgApacheSlingEventImplJobsJcrPersistenceHandlerInfoDescription :: Maybe Text
      <*> arbitrary -- orgApacheSlingEventImplJobsJcrPersistenceHandlerInfoProperties :: Maybe OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties
      <*> arbitrary -- orgApacheSlingEventImplJobsJcrPersistenceHandlerInfoBundleLocation :: Maybe Text
      <*> arbitrary -- orgApacheSlingEventImplJobsJcrPersistenceHandlerInfoServiceLocation :: Maybe Text
    
instance Arbitrary OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties where
  arbitrary =
    OrgApacheSlingEventImplJobsJcrPersistenceHandlerProperties
      <$> arbitrary -- orgApacheSlingEventImplJobsJcrPersistenceHandlerPropertiesJobConsumermanagerDisableDistribution :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- orgApacheSlingEventImplJobsJcrPersistenceHandlerPropertiesStartupDelay :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheSlingEventImplJobsJcrPersistenceHandlerPropertiesCleanupPeriod :: Maybe ConfigNodePropertyInteger
    
instance Arbitrary OrgApacheSlingEventImplJobsJobConsumerManagerInfo where
  arbitrary =
    OrgApacheSlingEventImplJobsJobConsumerManagerInfo
      <$> arbitrary -- orgApacheSlingEventImplJobsJobConsumerManagerInfoPid :: Maybe Text
      <*> arbitrary -- orgApacheSlingEventImplJobsJobConsumerManagerInfoTitle :: Maybe Text
      <*> arbitrary -- orgApacheSlingEventImplJobsJobConsumerManagerInfoDescription :: Maybe Text
      <*> arbitrary -- orgApacheSlingEventImplJobsJobConsumerManagerInfoProperties :: Maybe OrgApacheSlingEventImplJobsJobConsumerManagerProperties
      <*> arbitrary -- orgApacheSlingEventImplJobsJobConsumerManagerInfoBundleLocation :: Maybe Text
      <*> arbitrary -- orgApacheSlingEventImplJobsJobConsumerManagerInfoServiceLocation :: Maybe Text
    
instance Arbitrary OrgApacheSlingEventImplJobsJobConsumerManagerProperties where
  arbitrary =
    OrgApacheSlingEventImplJobsJobConsumerManagerProperties
      <$> arbitrary -- orgApacheSlingEventImplJobsJobConsumerManagerPropertiesOrgApacheSlingInstallerConfigurationPersist :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- orgApacheSlingEventImplJobsJobConsumerManagerPropertiesJobConsumermanagerWhitelist :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- orgApacheSlingEventImplJobsJobConsumerManagerPropertiesJobConsumermanagerBlacklist :: Maybe ConfigNodePropertyArray
    
instance Arbitrary OrgApacheSlingEventJobsQueueConfigurationInfo where
  arbitrary =
    OrgApacheSlingEventJobsQueueConfigurationInfo
      <$> arbitrary -- orgApacheSlingEventJobsQueueConfigurationInfoPid :: Maybe Text
      <*> arbitrary -- orgApacheSlingEventJobsQueueConfigurationInfoTitle :: Maybe Text
      <*> arbitrary -- orgApacheSlingEventJobsQueueConfigurationInfoDescription :: Maybe Text
      <*> arbitrary -- orgApacheSlingEventJobsQueueConfigurationInfoProperties :: Maybe OrgApacheSlingEventJobsQueueConfigurationProperties
    
instance Arbitrary OrgApacheSlingEventJobsQueueConfigurationProperties where
  arbitrary =
    OrgApacheSlingEventJobsQueueConfigurationProperties
      <$> arbitrary -- orgApacheSlingEventJobsQueueConfigurationPropertiesQueueName :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingEventJobsQueueConfigurationPropertiesQueueTopics :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- orgApacheSlingEventJobsQueueConfigurationPropertiesQueueType :: Maybe ConfigNodePropertyDropDown
      <*> arbitrary -- orgApacheSlingEventJobsQueueConfigurationPropertiesQueuePriority :: Maybe ConfigNodePropertyDropDown
      <*> arbitrary -- orgApacheSlingEventJobsQueueConfigurationPropertiesQueueRetries :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheSlingEventJobsQueueConfigurationPropertiesQueueRetrydelay :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheSlingEventJobsQueueConfigurationPropertiesQueueMaxparallel :: Maybe ConfigNodePropertyFloat
      <*> arbitrary -- orgApacheSlingEventJobsQueueConfigurationPropertiesQueueKeepJobs :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- orgApacheSlingEventJobsQueueConfigurationPropertiesQueuePreferRunOnCreationInstance :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- orgApacheSlingEventJobsQueueConfigurationPropertiesQueueThreadPoolSize :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheSlingEventJobsQueueConfigurationPropertiesServiceRanking :: Maybe ConfigNodePropertyInteger
    
instance Arbitrary OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWInfo where
  arbitrary =
    OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWInfo
      <$> arbitrary -- orgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWInfoPid :: Maybe Text
      <*> arbitrary -- orgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWInfoTitle :: Maybe Text
      <*> arbitrary -- orgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWInfoDescription :: Maybe Text
      <*> arbitrary -- orgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWInfoProperties :: Maybe OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties
    
instance Arbitrary OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties where
  arbitrary =
    OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties
      <$> arbitrary -- orgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWPropertiesUsers :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- orgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWPropertiesGroups :: Maybe ConfigNodePropertyArray
    
instance Arbitrary OrgApacheSlingFeatureflagsFeatureInfo where
  arbitrary =
    OrgApacheSlingFeatureflagsFeatureInfo
      <$> arbitrary -- orgApacheSlingFeatureflagsFeatureInfoPid :: Maybe Text
      <*> arbitrary -- orgApacheSlingFeatureflagsFeatureInfoTitle :: Maybe Text
      <*> arbitrary -- orgApacheSlingFeatureflagsFeatureInfoDescription :: Maybe Text
      <*> arbitrary -- orgApacheSlingFeatureflagsFeatureInfoProperties :: Maybe OrgApacheSlingFeatureflagsFeatureProperties
    
instance Arbitrary OrgApacheSlingFeatureflagsFeatureProperties where
  arbitrary =
    OrgApacheSlingFeatureflagsFeatureProperties
      <$> arbitrary -- orgApacheSlingFeatureflagsFeaturePropertiesName :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingFeatureflagsFeaturePropertiesDescription :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingFeatureflagsFeaturePropertiesEnabled :: Maybe ConfigNodePropertyBoolean
    
instance Arbitrary OrgApacheSlingFeatureflagsImplConfiguredFeatureInfo where
  arbitrary =
    OrgApacheSlingFeatureflagsImplConfiguredFeatureInfo
      <$> arbitrary -- orgApacheSlingFeatureflagsImplConfiguredFeatureInfoPid :: Maybe Text
      <*> arbitrary -- orgApacheSlingFeatureflagsImplConfiguredFeatureInfoTitle :: Maybe Text
      <*> arbitrary -- orgApacheSlingFeatureflagsImplConfiguredFeatureInfoDescription :: Maybe Text
      <*> arbitrary -- orgApacheSlingFeatureflagsImplConfiguredFeatureInfoProperties :: Maybe OrgApacheSlingFeatureflagsImplConfiguredFeatureProperties
    
instance Arbitrary OrgApacheSlingFeatureflagsImplConfiguredFeatureProperties where
  arbitrary =
    OrgApacheSlingFeatureflagsImplConfiguredFeatureProperties
      <$> arbitrary -- orgApacheSlingFeatureflagsImplConfiguredFeaturePropertiesName :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingFeatureflagsImplConfiguredFeaturePropertiesDescription :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingFeatureflagsImplConfiguredFeaturePropertiesEnabled :: Maybe ConfigNodePropertyBoolean
    
instance Arbitrary OrgApacheSlingHapiImplHApiUtilImplInfo where
  arbitrary =
    OrgApacheSlingHapiImplHApiUtilImplInfo
      <$> arbitrary -- orgApacheSlingHapiImplHApiUtilImplInfoPid :: Maybe Text
      <*> arbitrary -- orgApacheSlingHapiImplHApiUtilImplInfoTitle :: Maybe Text
      <*> arbitrary -- orgApacheSlingHapiImplHApiUtilImplInfoDescription :: Maybe Text
      <*> arbitrary -- orgApacheSlingHapiImplHApiUtilImplInfoProperties :: Maybe OrgApacheSlingHapiImplHApiUtilImplProperties
    
instance Arbitrary OrgApacheSlingHapiImplHApiUtilImplProperties where
  arbitrary =
    OrgApacheSlingHapiImplHApiUtilImplProperties
      <$> arbitrary -- orgApacheSlingHapiImplHApiUtilImplPropertiesOrgApacheSlingHapiToolsResourcetype :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingHapiImplHApiUtilImplPropertiesOrgApacheSlingHapiToolsCollectionresourcetype :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingHapiImplHApiUtilImplPropertiesOrgApacheSlingHapiToolsSearchpaths :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- orgApacheSlingHapiImplHApiUtilImplPropertiesOrgApacheSlingHapiToolsExternalurl :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingHapiImplHApiUtilImplPropertiesOrgApacheSlingHapiToolsEnabled :: Maybe ConfigNodePropertyBoolean
    
instance Arbitrary OrgApacheSlingHcCoreImplCompositeHealthCheckInfo where
  arbitrary =
    OrgApacheSlingHcCoreImplCompositeHealthCheckInfo
      <$> arbitrary -- orgApacheSlingHcCoreImplCompositeHealthCheckInfoPid :: Maybe Text
      <*> arbitrary -- orgApacheSlingHcCoreImplCompositeHealthCheckInfoTitle :: Maybe Text
      <*> arbitrary -- orgApacheSlingHcCoreImplCompositeHealthCheckInfoDescription :: Maybe Text
      <*> arbitrary -- orgApacheSlingHcCoreImplCompositeHealthCheckInfoProperties :: Maybe OrgApacheSlingHcCoreImplCompositeHealthCheckProperties
    
instance Arbitrary OrgApacheSlingHcCoreImplCompositeHealthCheckProperties where
  arbitrary =
    OrgApacheSlingHcCoreImplCompositeHealthCheckProperties
      <$> arbitrary -- orgApacheSlingHcCoreImplCompositeHealthCheckPropertiesHcName :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingHcCoreImplCompositeHealthCheckPropertiesHcTags :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- orgApacheSlingHcCoreImplCompositeHealthCheckPropertiesHcMbeanName :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingHcCoreImplCompositeHealthCheckPropertiesFilterTags :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- orgApacheSlingHcCoreImplCompositeHealthCheckPropertiesFilterCombineTagsWithOr :: Maybe ConfigNodePropertyBoolean
    
instance Arbitrary OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplInfo where
  arbitrary =
    OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplInfo
      <$> arbitrary -- orgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplInfoPid :: Maybe Text
      <*> arbitrary -- orgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplInfoTitle :: Maybe Text
      <*> arbitrary -- orgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplInfoDescription :: Maybe Text
      <*> arbitrary -- orgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplInfoProperties :: Maybe OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties
    
instance Arbitrary OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties where
  arbitrary =
    OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties
      <$> arbitrary -- orgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplPropertiesTimeoutInMs :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplPropertiesLongRunningFutureThresholdForCriticalMs :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplPropertiesResultCacheTtlInMs :: Maybe ConfigNodePropertyInteger
    
instance Arbitrary OrgApacheSlingHcCoreImplJmxAttributeHealthCheckInfo where
  arbitrary =
    OrgApacheSlingHcCoreImplJmxAttributeHealthCheckInfo
      <$> arbitrary -- orgApacheSlingHcCoreImplJmxAttributeHealthCheckInfoPid :: Maybe Text
      <*> arbitrary -- orgApacheSlingHcCoreImplJmxAttributeHealthCheckInfoTitle :: Maybe Text
      <*> arbitrary -- orgApacheSlingHcCoreImplJmxAttributeHealthCheckInfoDescription :: Maybe Text
      <*> arbitrary -- orgApacheSlingHcCoreImplJmxAttributeHealthCheckInfoProperties :: Maybe OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties
    
instance Arbitrary OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties where
  arbitrary =
    OrgApacheSlingHcCoreImplJmxAttributeHealthCheckProperties
      <$> arbitrary -- orgApacheSlingHcCoreImplJmxAttributeHealthCheckPropertiesHcName :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingHcCoreImplJmxAttributeHealthCheckPropertiesHcTags :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- orgApacheSlingHcCoreImplJmxAttributeHealthCheckPropertiesHcMbeanName :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingHcCoreImplJmxAttributeHealthCheckPropertiesMbeanName :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingHcCoreImplJmxAttributeHealthCheckPropertiesAttributeName :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingHcCoreImplJmxAttributeHealthCheckPropertiesAttributeValueConstraint :: Maybe ConfigNodePropertyString
    
instance Arbitrary OrgApacheSlingHcCoreImplScriptableHealthCheckInfo where
  arbitrary =
    OrgApacheSlingHcCoreImplScriptableHealthCheckInfo
      <$> arbitrary -- orgApacheSlingHcCoreImplScriptableHealthCheckInfoPid :: Maybe Text
      <*> arbitrary -- orgApacheSlingHcCoreImplScriptableHealthCheckInfoTitle :: Maybe Text
      <*> arbitrary -- orgApacheSlingHcCoreImplScriptableHealthCheckInfoDescription :: Maybe Text
      <*> arbitrary -- orgApacheSlingHcCoreImplScriptableHealthCheckInfoProperties :: Maybe OrgApacheSlingHcCoreImplScriptableHealthCheckProperties
    
instance Arbitrary OrgApacheSlingHcCoreImplScriptableHealthCheckProperties where
  arbitrary =
    OrgApacheSlingHcCoreImplScriptableHealthCheckProperties
      <$> arbitrary -- orgApacheSlingHcCoreImplScriptableHealthCheckPropertiesHcName :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingHcCoreImplScriptableHealthCheckPropertiesHcTags :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- orgApacheSlingHcCoreImplScriptableHealthCheckPropertiesHcMbeanName :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingHcCoreImplScriptableHealthCheckPropertiesExpression :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingHcCoreImplScriptableHealthCheckPropertiesLanguageExtension :: Maybe ConfigNodePropertyString
    
instance Arbitrary OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletInfo where
  arbitrary =
    OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletInfo
      <$> arbitrary -- orgApacheSlingHcCoreImplServletHealthCheckExecutorServletInfoPid :: Maybe Text
      <*> arbitrary -- orgApacheSlingHcCoreImplServletHealthCheckExecutorServletInfoTitle :: Maybe Text
      <*> arbitrary -- orgApacheSlingHcCoreImplServletHealthCheckExecutorServletInfoDescription :: Maybe Text
      <*> arbitrary -- orgApacheSlingHcCoreImplServletHealthCheckExecutorServletInfoProperties :: Maybe OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties
    
instance Arbitrary OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties where
  arbitrary =
    OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties
      <$> arbitrary -- orgApacheSlingHcCoreImplServletHealthCheckExecutorServletPropertiesServletPath :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingHcCoreImplServletHealthCheckExecutorServletPropertiesDisabled :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- orgApacheSlingHcCoreImplServletHealthCheckExecutorServletPropertiesCorsAccessControlAllowOrigin :: Maybe ConfigNodePropertyString
    
instance Arbitrary OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerInfo where
  arbitrary =
    OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerInfo
      <$> arbitrary -- orgApacheSlingHcCoreImplServletResultTxtVerboseSerializerInfoPid :: Maybe Text
      <*> arbitrary -- orgApacheSlingHcCoreImplServletResultTxtVerboseSerializerInfoTitle :: Maybe Text
      <*> arbitrary -- orgApacheSlingHcCoreImplServletResultTxtVerboseSerializerInfoDescription :: Maybe Text
      <*> arbitrary -- orgApacheSlingHcCoreImplServletResultTxtVerboseSerializerInfoProperties :: Maybe OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties
    
instance Arbitrary OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties where
  arbitrary =
    OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties
      <$> arbitrary -- orgApacheSlingHcCoreImplServletResultTxtVerboseSerializerPropertiesTotalWidth :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheSlingHcCoreImplServletResultTxtVerboseSerializerPropertiesColWidthName :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheSlingHcCoreImplServletResultTxtVerboseSerializerPropertiesColWidthResult :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheSlingHcCoreImplServletResultTxtVerboseSerializerPropertiesColWidthTiming :: Maybe ConfigNodePropertyInteger
    
instance Arbitrary OrgApacheSlingI18nImplI18NFilterInfo where
  arbitrary =
    OrgApacheSlingI18nImplI18NFilterInfo
      <$> arbitrary -- orgApacheSlingI18nImplI18NFilterInfoPid :: Maybe Text
      <*> arbitrary -- orgApacheSlingI18nImplI18NFilterInfoTitle :: Maybe Text
      <*> arbitrary -- orgApacheSlingI18nImplI18NFilterInfoDescription :: Maybe Text
      <*> arbitrary -- orgApacheSlingI18nImplI18NFilterInfoProperties :: Maybe OrgApacheSlingI18nImplI18NFilterProperties
      <*> arbitrary -- orgApacheSlingI18nImplI18NFilterInfoBundleLocation :: Maybe Text
      <*> arbitrary -- orgApacheSlingI18nImplI18NFilterInfoServiceLocation :: Maybe Text
    
instance Arbitrary OrgApacheSlingI18nImplI18NFilterProperties where
  arbitrary =
    OrgApacheSlingI18nImplI18NFilterProperties
      <$> arbitrary -- orgApacheSlingI18nImplI18NFilterPropertiesServiceRanking :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheSlingI18nImplI18NFilterPropertiesSlingFilterScope :: Maybe ConfigNodePropertyArray
    
instance Arbitrary OrgApacheSlingI18nImplJcrResourceBundleProviderInfo where
  arbitrary =
    OrgApacheSlingI18nImplJcrResourceBundleProviderInfo
      <$> arbitrary -- orgApacheSlingI18nImplJcrResourceBundleProviderInfoPid :: Maybe Text
      <*> arbitrary -- orgApacheSlingI18nImplJcrResourceBundleProviderInfoTitle :: Maybe Text
      <*> arbitrary -- orgApacheSlingI18nImplJcrResourceBundleProviderInfoDescription :: Maybe Text
      <*> arbitrary -- orgApacheSlingI18nImplJcrResourceBundleProviderInfoProperties :: Maybe OrgApacheSlingI18nImplJcrResourceBundleProviderProperties
      <*> arbitrary -- orgApacheSlingI18nImplJcrResourceBundleProviderInfoAdditionalProperties :: Maybe Text
      <*> arbitrary -- orgApacheSlingI18nImplJcrResourceBundleProviderInfoBundleLocation :: Maybe Text
      <*> arbitrary -- orgApacheSlingI18nImplJcrResourceBundleProviderInfoServiceLocation :: Maybe Text
    
instance Arbitrary OrgApacheSlingI18nImplJcrResourceBundleProviderProperties where
  arbitrary =
    OrgApacheSlingI18nImplJcrResourceBundleProviderProperties
      <$> arbitrary -- orgApacheSlingI18nImplJcrResourceBundleProviderPropertiesLocaleDefault :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingI18nImplJcrResourceBundleProviderPropertiesPreloadBundles :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- orgApacheSlingI18nImplJcrResourceBundleProviderPropertiesInvalidationDelay :: Maybe ConfigNodePropertyInteger
    
instance Arbitrary OrgApacheSlingInstallerProviderJcrImplJcrInstallerInfo where
  arbitrary =
    OrgApacheSlingInstallerProviderJcrImplJcrInstallerInfo
      <$> arbitrary -- orgApacheSlingInstallerProviderJcrImplJcrInstallerInfoPid :: Maybe Text
      <*> arbitrary -- orgApacheSlingInstallerProviderJcrImplJcrInstallerInfoTitle :: Maybe Text
      <*> arbitrary -- orgApacheSlingInstallerProviderJcrImplJcrInstallerInfoDescription :: Maybe Text
      <*> arbitrary -- orgApacheSlingInstallerProviderJcrImplJcrInstallerInfoProperties :: Maybe OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties
      <*> arbitrary -- orgApacheSlingInstallerProviderJcrImplJcrInstallerInfoBundleLocation :: Maybe Text
      <*> arbitrary -- orgApacheSlingInstallerProviderJcrImplJcrInstallerInfoServiceLocation :: Maybe Text
    
instance Arbitrary OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties where
  arbitrary =
    OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties
      <$> arbitrary -- orgApacheSlingInstallerProviderJcrImplJcrInstallerPropertiesHandlerSchemes :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- orgApacheSlingInstallerProviderJcrImplJcrInstallerPropertiesSlingJcrinstallFolderNameRegexp :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingInstallerProviderJcrImplJcrInstallerPropertiesSlingJcrinstallFolderMaxDepth :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheSlingInstallerProviderJcrImplJcrInstallerPropertiesSlingJcrinstallSearchPath :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- orgApacheSlingInstallerProviderJcrImplJcrInstallerPropertiesSlingJcrinstallNewConfigPath :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingInstallerProviderJcrImplJcrInstallerPropertiesSlingJcrinstallSignalPath :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingInstallerProviderJcrImplJcrInstallerPropertiesSlingJcrinstallEnableWriteback :: Maybe ConfigNodePropertyBoolean
    
instance Arbitrary OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentInfo where
  arbitrary =
    OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentInfo
      <$> arbitrary -- orgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentInfoPid :: Maybe Text
      <*> arbitrary -- orgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentInfoTitle :: Maybe Text
      <*> arbitrary -- orgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentInfoDescription :: Maybe Text
      <*> arbitrary -- orgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentInfoProperties :: Maybe OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties
    
instance Arbitrary OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties where
  arbitrary =
    OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties
      <$> arbitrary -- orgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentPropertiesWhitelistName :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentPropertiesWhitelistBundles :: Maybe ConfigNodePropertyArray
    
instance Arbitrary OrgApacheSlingJcrBaseInternalLoginAdminWhitelistInfo where
  arbitrary =
    OrgApacheSlingJcrBaseInternalLoginAdminWhitelistInfo
      <$> arbitrary -- orgApacheSlingJcrBaseInternalLoginAdminWhitelistInfoPid :: Maybe Text
      <*> arbitrary -- orgApacheSlingJcrBaseInternalLoginAdminWhitelistInfoTitle :: Maybe Text
      <*> arbitrary -- orgApacheSlingJcrBaseInternalLoginAdminWhitelistInfoDescription :: Maybe Text
      <*> arbitrary -- orgApacheSlingJcrBaseInternalLoginAdminWhitelistInfoProperties :: Maybe OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties
    
instance Arbitrary OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties where
  arbitrary =
    OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties
      <$> arbitrary -- orgApacheSlingJcrBaseInternalLoginAdminWhitelistPropertiesWhitelistBypass :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- orgApacheSlingJcrBaseInternalLoginAdminWhitelistPropertiesWhitelistBundlesRegexp :: Maybe ConfigNodePropertyString
    
instance Arbitrary OrgApacheSlingJcrDavexImplServletsSlingDavExServletInfo where
  arbitrary =
    OrgApacheSlingJcrDavexImplServletsSlingDavExServletInfo
      <$> arbitrary -- orgApacheSlingJcrDavexImplServletsSlingDavExServletInfoPid :: Maybe Text
      <*> arbitrary -- orgApacheSlingJcrDavexImplServletsSlingDavExServletInfoTitle :: Maybe Text
      <*> arbitrary -- orgApacheSlingJcrDavexImplServletsSlingDavExServletInfoDescription :: Maybe Text
      <*> arbitrary -- orgApacheSlingJcrDavexImplServletsSlingDavExServletInfoProperties :: Maybe OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties
    
instance Arbitrary OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties where
  arbitrary =
    OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties
      <$> arbitrary -- orgApacheSlingJcrDavexImplServletsSlingDavExServletPropertiesAlias :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingJcrDavexImplServletsSlingDavExServletPropertiesDavCreateAbsoluteUri :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- orgApacheSlingJcrDavexImplServletsSlingDavExServletPropertiesDavProtectedhandlers :: Maybe ConfigNodePropertyString
    
instance Arbitrary OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportInfo where
  arbitrary =
    OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportInfo
      <$> arbitrary -- orgApacheSlingJcrJackrabbitServerJndiRegistrationSupportInfoPid :: Maybe Text
      <*> arbitrary -- orgApacheSlingJcrJackrabbitServerJndiRegistrationSupportInfoTitle :: Maybe Text
      <*> arbitrary -- orgApacheSlingJcrJackrabbitServerJndiRegistrationSupportInfoDescription :: Maybe Text
      <*> arbitrary -- orgApacheSlingJcrJackrabbitServerJndiRegistrationSupportInfoProperties :: Maybe OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties
    
instance Arbitrary OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties where
  arbitrary =
    OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties
      <$> arbitrary -- orgApacheSlingJcrJackrabbitServerJndiRegistrationSupportPropertiesJavaNamingFactoryInitial :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingJcrJackrabbitServerJndiRegistrationSupportPropertiesJavaNamingProviderUrl :: Maybe ConfigNodePropertyString
    
instance Arbitrary OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportInfo where
  arbitrary =
    OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportInfo
      <$> arbitrary -- orgApacheSlingJcrJackrabbitServerRmiRegistrationSupportInfoPid :: Maybe Text
      <*> arbitrary -- orgApacheSlingJcrJackrabbitServerRmiRegistrationSupportInfoTitle :: Maybe Text
      <*> arbitrary -- orgApacheSlingJcrJackrabbitServerRmiRegistrationSupportInfoDescription :: Maybe Text
      <*> arbitrary -- orgApacheSlingJcrJackrabbitServerRmiRegistrationSupportInfoProperties :: Maybe OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties
    
instance Arbitrary OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties where
  arbitrary =
    OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties
      <$> arbitrary -- orgApacheSlingJcrJackrabbitServerRmiRegistrationSupportPropertiesPort :: Maybe ConfigNodePropertyInteger
    
instance Arbitrary OrgApacheSlingJcrRepoinitImplRepositoryInitializerInfo where
  arbitrary =
    OrgApacheSlingJcrRepoinitImplRepositoryInitializerInfo
      <$> arbitrary -- orgApacheSlingJcrRepoinitImplRepositoryInitializerInfoPid :: Maybe Text
      <*> arbitrary -- orgApacheSlingJcrRepoinitImplRepositoryInitializerInfoTitle :: Maybe Text
      <*> arbitrary -- orgApacheSlingJcrRepoinitImplRepositoryInitializerInfoDescription :: Maybe Text
      <*> arbitrary -- orgApacheSlingJcrRepoinitImplRepositoryInitializerInfoProperties :: Maybe OrgApacheSlingJcrRepoinitImplRepositoryInitializerProperties
      <*> arbitrary -- orgApacheSlingJcrRepoinitImplRepositoryInitializerInfoBundleLocation :: Maybe Text
      <*> arbitrary -- orgApacheSlingJcrRepoinitImplRepositoryInitializerInfoServiceLocation :: Maybe Text
    
instance Arbitrary OrgApacheSlingJcrRepoinitImplRepositoryInitializerProperties where
  arbitrary =
    OrgApacheSlingJcrRepoinitImplRepositoryInitializerProperties
      <$> arbitrary -- orgApacheSlingJcrRepoinitImplRepositoryInitializerPropertiesReferences :: Maybe ConfigNodePropertyArray
    
instance Arbitrary OrgApacheSlingJcrRepoinitRepositoryInitializerInfo where
  arbitrary =
    OrgApacheSlingJcrRepoinitRepositoryInitializerInfo
      <$> arbitrary -- orgApacheSlingJcrRepoinitRepositoryInitializerInfoPid :: Maybe Text
      <*> arbitrary -- orgApacheSlingJcrRepoinitRepositoryInitializerInfoTitle :: Maybe Text
      <*> arbitrary -- orgApacheSlingJcrRepoinitRepositoryInitializerInfoDescription :: Maybe Text
      <*> arbitrary -- orgApacheSlingJcrRepoinitRepositoryInitializerInfoProperties :: Maybe OrgApacheSlingJcrRepoinitRepositoryInitializerProperties
    
instance Arbitrary OrgApacheSlingJcrRepoinitRepositoryInitializerProperties where
  arbitrary =
    OrgApacheSlingJcrRepoinitRepositoryInitializerProperties
      <$> arbitrary -- orgApacheSlingJcrRepoinitRepositoryInitializerPropertiesReferences :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- orgApacheSlingJcrRepoinitRepositoryInitializerPropertiesScripts :: Maybe ConfigNodePropertyArray
    
instance Arbitrary OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplInfo where
  arbitrary =
    OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplInfo
      <$> arbitrary -- orgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplInfoPid :: Maybe Text
      <*> arbitrary -- orgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplInfoTitle :: Maybe Text
      <*> arbitrary -- orgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplInfoDescription :: Maybe Text
      <*> arbitrary -- orgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplInfoProperties :: Maybe OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties
      <*> arbitrary -- orgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplInfoBundleLocation :: Maybe Text
      <*> arbitrary -- orgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplInfoServiceLocation :: Maybe Text
    
instance Arbitrary OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties where
  arbitrary =
    OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties
      <$> arbitrary -- orgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplPropertiesResourceResolverSearchpath :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- orgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplPropertiesResourceResolverManglenamespaces :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- orgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplPropertiesResourceResolverAllowDirect :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- orgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplPropertiesResourceResolverRequiredProviders :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- orgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplPropertiesResourceResolverRequiredProvidernames :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- orgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplPropertiesResourceResolverVirtual :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- orgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplPropertiesResourceResolverMapping :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- orgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplPropertiesResourceResolverMapLocation :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplPropertiesResourceResolverMapObservation :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- orgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplPropertiesResourceResolverDefaultVanityRedirectStatus :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplPropertiesResourceResolverEnableVanitypath :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- orgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplPropertiesResourceResolverVanitypathMaxEntries :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplPropertiesResourceResolverVanitypathMaxEntriesStartup :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- orgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplPropertiesResourceResolverVanitypathBloomfilterMaxBytes :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplPropertiesResourceResolverOptimizeAliasResolution :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- orgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplPropertiesResourceResolverVanitypathWhitelist :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- orgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplPropertiesResourceResolverVanitypathBlacklist :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- orgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplPropertiesResourceResolverVanityPrecedence :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- orgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplPropertiesResourceResolverProviderhandlingParanoid :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- orgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplPropertiesResourceResolverLogClosing :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- orgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplPropertiesResourceResolverLogUnclosed :: Maybe ConfigNodePropertyBoolean
    
instance Arbitrary OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorInfo where
  arbitrary =
    OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorInfo
      <$> arbitrary -- orgApacheSlingJcrResourceInternalJcrSystemUserValidatorInfoPid :: Maybe Text
      <*> arbitrary -- orgApacheSlingJcrResourceInternalJcrSystemUserValidatorInfoTitle :: Maybe Text
      <*> arbitrary -- orgApacheSlingJcrResourceInternalJcrSystemUserValidatorInfoDescription :: Maybe Text
      <*> arbitrary -- orgApacheSlingJcrResourceInternalJcrSystemUserValidatorInfoProperties :: Maybe OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties
    
instance Arbitrary OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties where
  arbitrary =
    OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties
      <$> arbitrary -- orgApacheSlingJcrResourceInternalJcrSystemUserValidatorPropertiesAllowOnlySystemUser :: Maybe ConfigNodePropertyBoolean
    
instance Arbitrary OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryInfo where
  arbitrary =
    OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryInfo
      <$> arbitrary -- orgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryInfoPid :: Maybe Text
      <*> arbitrary -- orgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryInfoTitle :: Maybe Text
      <*> arbitrary -- orgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryInfoDescription :: Maybe Text
      <*> arbitrary -- orgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryInfoProperties :: Maybe OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties
    
instance Arbitrary OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties where
  arbitrary =
    OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties
      <$> arbitrary -- orgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryPropertiesPath :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryPropertiesCheckpathPrefix :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryPropertiesJcrPath :: Maybe ConfigNodePropertyString
    
instance Arbitrary OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceInfo where
  arbitrary =
    OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceInfo
      <$> arbitrary -- orgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceInfoPid :: Maybe Text
      <*> arbitrary -- orgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceInfoTitle :: Maybe Text
      <*> arbitrary -- orgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceInfoDescription :: Maybe Text
      <*> arbitrary -- orgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceInfoProperties :: Maybe OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties
    
instance Arbitrary OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties where
  arbitrary =
    OrgApacheSlingJcrWebdavImplHandlerDefaultHandlerServiceProperties
      <$> arbitrary -- orgApacheSlingJcrWebdavImplHandlerDefaultHandlerServicePropertiesServiceRanking :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheSlingJcrWebdavImplHandlerDefaultHandlerServicePropertiesTypeCollections :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingJcrWebdavImplHandlerDefaultHandlerServicePropertiesTypeNoncollections :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingJcrWebdavImplHandlerDefaultHandlerServicePropertiesTypeContent :: Maybe ConfigNodePropertyString
    
instance Arbitrary OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicInfo where
  arbitrary =
    OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicInfo
      <$> arbitrary -- orgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicInfoPid :: Maybe Text
      <*> arbitrary -- orgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicInfoTitle :: Maybe Text
      <*> arbitrary -- orgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicInfoDescription :: Maybe Text
      <*> arbitrary -- orgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicInfoProperties :: Maybe OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties
    
instance Arbitrary OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties where
  arbitrary =
    OrgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties
      <$> arbitrary -- orgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicPropertiesServiceRanking :: Maybe ConfigNodePropertyInteger
    
instance Arbitrary OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletInfo where
  arbitrary =
    OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletInfo
      <$> arbitrary -- orgApacheSlingJcrWebdavImplServletsSimpleWebDavServletInfoPid :: Maybe Text
      <*> arbitrary -- orgApacheSlingJcrWebdavImplServletsSimpleWebDavServletInfoTitle :: Maybe Text
      <*> arbitrary -- orgApacheSlingJcrWebdavImplServletsSimpleWebDavServletInfoDescription :: Maybe Text
      <*> arbitrary -- orgApacheSlingJcrWebdavImplServletsSimpleWebDavServletInfoProperties :: Maybe OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties
      <*> arbitrary -- orgApacheSlingJcrWebdavImplServletsSimpleWebDavServletInfoBundleLocation :: Maybe Text
      <*> arbitrary -- orgApacheSlingJcrWebdavImplServletsSimpleWebDavServletInfoServiceLocation :: Maybe Text
    
instance Arbitrary OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties where
  arbitrary =
    OrgApacheSlingJcrWebdavImplServletsSimpleWebDavServletProperties
      <$> arbitrary -- orgApacheSlingJcrWebdavImplServletsSimpleWebDavServletPropertiesDavRoot :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingJcrWebdavImplServletsSimpleWebDavServletPropertiesDavCreateAbsoluteUri :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- orgApacheSlingJcrWebdavImplServletsSimpleWebDavServletPropertiesDavRealm :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingJcrWebdavImplServletsSimpleWebDavServletPropertiesCollectionTypes :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- orgApacheSlingJcrWebdavImplServletsSimpleWebDavServletPropertiesFilterPrefixes :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- orgApacheSlingJcrWebdavImplServletsSimpleWebDavServletPropertiesFilterTypes :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingJcrWebdavImplServletsSimpleWebDavServletPropertiesFilterUris :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingJcrWebdavImplServletsSimpleWebDavServletPropertiesTypeCollections :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingJcrWebdavImplServletsSimpleWebDavServletPropertiesTypeNoncollections :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingJcrWebdavImplServletsSimpleWebDavServletPropertiesTypeContent :: Maybe ConfigNodePropertyString
    
instance Arbitrary OrgApacheSlingJmxProviderImplJMXResourceProviderInfo where
  arbitrary =
    OrgApacheSlingJmxProviderImplJMXResourceProviderInfo
      <$> arbitrary -- orgApacheSlingJmxProviderImplJMXResourceProviderInfoPid :: Maybe Text
      <*> arbitrary -- orgApacheSlingJmxProviderImplJMXResourceProviderInfoTitle :: Maybe Text
      <*> arbitrary -- orgApacheSlingJmxProviderImplJMXResourceProviderInfoDescription :: Maybe Text
      <*> arbitrary -- orgApacheSlingJmxProviderImplJMXResourceProviderInfoProperties :: Maybe OrgApacheSlingJmxProviderImplJMXResourceProviderProperties
    
instance Arbitrary OrgApacheSlingJmxProviderImplJMXResourceProviderProperties where
  arbitrary =
    OrgApacheSlingJmxProviderImplJMXResourceProviderProperties
      <$> arbitrary -- orgApacheSlingJmxProviderImplJMXResourceProviderPropertiesProviderRoots :: Maybe ConfigNodePropertyString
    
instance Arbitrary OrgApacheSlingModelsImplModelAdapterFactoryInfo where
  arbitrary =
    OrgApacheSlingModelsImplModelAdapterFactoryInfo
      <$> arbitrary -- orgApacheSlingModelsImplModelAdapterFactoryInfoPid :: Maybe Text
      <*> arbitrary -- orgApacheSlingModelsImplModelAdapterFactoryInfoTitle :: Maybe Text
      <*> arbitrary -- orgApacheSlingModelsImplModelAdapterFactoryInfoDescription :: Maybe Text
      <*> arbitrary -- orgApacheSlingModelsImplModelAdapterFactoryInfoProperties :: Maybe OrgApacheSlingModelsImplModelAdapterFactoryProperties
    
instance Arbitrary OrgApacheSlingModelsImplModelAdapterFactoryProperties where
  arbitrary =
    OrgApacheSlingModelsImplModelAdapterFactoryProperties
      <$> arbitrary -- orgApacheSlingModelsImplModelAdapterFactoryPropertiesOsgiHttpWhiteboardListener :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingModelsImplModelAdapterFactoryPropertiesOsgiHttpWhiteboardContextSelect :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingModelsImplModelAdapterFactoryPropertiesMaxRecursionDepth :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheSlingModelsImplModelAdapterFactoryPropertiesCleanupJobPeriod :: Maybe ConfigNodePropertyInteger
    
instance Arbitrary OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderInfo where
  arbitrary =
    OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderInfo
      <$> arbitrary -- orgApacheSlingModelsJacksonexporterImplResourceModuleProviderInfoPid :: Maybe Text
      <*> arbitrary -- orgApacheSlingModelsJacksonexporterImplResourceModuleProviderInfoTitle :: Maybe Text
      <*> arbitrary -- orgApacheSlingModelsJacksonexporterImplResourceModuleProviderInfoDescription :: Maybe Text
      <*> arbitrary -- orgApacheSlingModelsJacksonexporterImplResourceModuleProviderInfoProperties :: Maybe OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties
    
instance Arbitrary OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties where
  arbitrary =
    OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties
      <$> arbitrary -- orgApacheSlingModelsJacksonexporterImplResourceModuleProviderPropertiesMaxRecursionLevels :: Maybe ConfigNodePropertyInteger
    
instance Arbitrary OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoInfo where
  arbitrary =
    OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoInfo
      <$> arbitrary -- orgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoInfoPid :: Maybe Text
      <*> arbitrary -- orgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoInfoTitle :: Maybe Text
      <*> arbitrary -- orgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoInfoDescription :: Maybe Text
      <*> arbitrary -- orgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoInfoProperties :: Maybe OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties
    
instance Arbitrary OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties where
  arbitrary =
    OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties
      <$> arbitrary -- orgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoPropertiesFelixInventoryPrinterName :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoPropertiesFelixInventoryPrinterTitle :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoPropertiesPath :: Maybe ConfigNodePropertyString
    
instance Arbitrary OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryInfo where
  arbitrary =
    OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryInfo
      <$> arbitrary -- orgApacheSlingResourcemergerImplMergedResourceProviderFactoryInfoPid :: Maybe Text
      <*> arbitrary -- orgApacheSlingResourcemergerImplMergedResourceProviderFactoryInfoTitle :: Maybe Text
      <*> arbitrary -- orgApacheSlingResourcemergerImplMergedResourceProviderFactoryInfoDescription :: Maybe Text
      <*> arbitrary -- orgApacheSlingResourcemergerImplMergedResourceProviderFactoryInfoProperties :: Maybe OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties
    
instance Arbitrary OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties where
  arbitrary =
    OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties
      <$> arbitrary -- orgApacheSlingResourcemergerImplMergedResourceProviderFactoryPropertiesMergeRoot :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingResourcemergerImplMergedResourceProviderFactoryPropertiesMergeReadOnly :: Maybe ConfigNodePropertyBoolean
    
instance Arbitrary OrgApacheSlingResourcemergerPickerOverridingInfo where
  arbitrary =
    OrgApacheSlingResourcemergerPickerOverridingInfo
      <$> arbitrary -- orgApacheSlingResourcemergerPickerOverridingInfoPid :: Maybe Text
      <*> arbitrary -- orgApacheSlingResourcemergerPickerOverridingInfoTitle :: Maybe Text
      <*> arbitrary -- orgApacheSlingResourcemergerPickerOverridingInfoDescription :: Maybe Text
      <*> arbitrary -- orgApacheSlingResourcemergerPickerOverridingInfoProperties :: Maybe OrgApacheSlingResourcemergerPickerOverridingProperties
      <*> arbitrary -- orgApacheSlingResourcemergerPickerOverridingInfoAdditionalProperties :: Maybe Text
      <*> arbitrary -- orgApacheSlingResourcemergerPickerOverridingInfoBundleLocation :: Maybe Text
      <*> arbitrary -- orgApacheSlingResourcemergerPickerOverridingInfoServiceLocation :: Maybe Text
    
instance Arbitrary OrgApacheSlingResourcemergerPickerOverridingProperties where
  arbitrary =
    OrgApacheSlingResourcemergerPickerOverridingProperties
      <$> arbitrary -- orgApacheSlingResourcemergerPickerOverridingPropertiesMergeRoot :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingResourcemergerPickerOverridingPropertiesMergeReadOnly :: Maybe ConfigNodePropertyBoolean
    
instance Arbitrary OrgApacheSlingScriptingCoreImplScriptCacheImplInfo where
  arbitrary =
    OrgApacheSlingScriptingCoreImplScriptCacheImplInfo
      <$> arbitrary -- orgApacheSlingScriptingCoreImplScriptCacheImplInfoPid :: Maybe Text
      <*> arbitrary -- orgApacheSlingScriptingCoreImplScriptCacheImplInfoTitle :: Maybe Text
      <*> arbitrary -- orgApacheSlingScriptingCoreImplScriptCacheImplInfoDescription :: Maybe Text
      <*> arbitrary -- orgApacheSlingScriptingCoreImplScriptCacheImplInfoProperties :: Maybe OrgApacheSlingScriptingCoreImplScriptCacheImplProperties
      <*> arbitrary -- orgApacheSlingScriptingCoreImplScriptCacheImplInfoBundleLocation :: Maybe Text
      <*> arbitrary -- orgApacheSlingScriptingCoreImplScriptCacheImplInfoServiceLocation :: Maybe Text
    
instance Arbitrary OrgApacheSlingScriptingCoreImplScriptCacheImplProperties where
  arbitrary =
    OrgApacheSlingScriptingCoreImplScriptCacheImplProperties
      <$> arbitrary -- orgApacheSlingScriptingCoreImplScriptCacheImplPropertiesOrgApacheSlingScriptingCacheSize :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheSlingScriptingCoreImplScriptCacheImplPropertiesOrgApacheSlingScriptingCacheAdditionalExtensions :: Maybe ConfigNodePropertyArray
    
instance Arbitrary OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderInfo where
  arbitrary =
    OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderInfo
      <$> arbitrary -- orgApacheSlingScriptingCoreImplScriptingResourceResolverProviderInfoPid :: Maybe Text
      <*> arbitrary -- orgApacheSlingScriptingCoreImplScriptingResourceResolverProviderInfoTitle :: Maybe Text
      <*> arbitrary -- orgApacheSlingScriptingCoreImplScriptingResourceResolverProviderInfoDescription :: Maybe Text
      <*> arbitrary -- orgApacheSlingScriptingCoreImplScriptingResourceResolverProviderInfoProperties :: Maybe OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties
    
instance Arbitrary OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties where
  arbitrary =
    OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties
      <$> arbitrary -- orgApacheSlingScriptingCoreImplScriptingResourceResolverProviderPropertiesLogStacktraceOnclose :: Maybe ConfigNodePropertyBoolean
    
instance Arbitrary OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryInfo where
  arbitrary =
    OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryInfo
      <$> arbitrary -- orgApacheSlingScriptingJavaImplJavaScriptEngineFactoryInfoPid :: Maybe Text
      <*> arbitrary -- orgApacheSlingScriptingJavaImplJavaScriptEngineFactoryInfoTitle :: Maybe Text
      <*> arbitrary -- orgApacheSlingScriptingJavaImplJavaScriptEngineFactoryInfoDescription :: Maybe Text
      <*> arbitrary -- orgApacheSlingScriptingJavaImplJavaScriptEngineFactoryInfoProperties :: Maybe OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties
      <*> arbitrary -- orgApacheSlingScriptingJavaImplJavaScriptEngineFactoryInfoBundleLocation :: Maybe Text
      <*> arbitrary -- orgApacheSlingScriptingJavaImplJavaScriptEngineFactoryInfoServiceLocation :: Maybe Text
    
instance Arbitrary OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties where
  arbitrary =
    OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties
      <$> arbitrary -- orgApacheSlingScriptingJavaImplJavaScriptEngineFactoryPropertiesJavaClassdebuginfo :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- orgApacheSlingScriptingJavaImplJavaScriptEngineFactoryPropertiesJavaJavaEncoding :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingScriptingJavaImplJavaScriptEngineFactoryPropertiesJavaCompilerSourceVm :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingScriptingJavaImplJavaScriptEngineFactoryPropertiesJavaCompilerTargetVm :: Maybe ConfigNodePropertyString
    
instance Arbitrary OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaInfo where
  arbitrary =
    OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaInfo
      <$> arbitrary -- orgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaInfoPid :: Maybe Text
      <*> arbitrary -- orgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaInfoTitle :: Maybe Text
      <*> arbitrary -- orgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaInfoDescription :: Maybe Text
      <*> arbitrary -- orgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaInfoProperties :: Maybe OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties
    
instance Arbitrary OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties where
  arbitrary =
    OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties
      <$> arbitrary -- orgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaPropertiesOrgApacheSlingScriptingJavascriptRhinoOptLevel :: Maybe ConfigNodePropertyInteger
    
instance Arbitrary OrgApacheSlingScriptingJspJspScriptEngineFactoryInfo where
  arbitrary =
    OrgApacheSlingScriptingJspJspScriptEngineFactoryInfo
      <$> arbitrary -- orgApacheSlingScriptingJspJspScriptEngineFactoryInfoPid :: Maybe Text
      <*> arbitrary -- orgApacheSlingScriptingJspJspScriptEngineFactoryInfoTitle :: Maybe Text
      <*> arbitrary -- orgApacheSlingScriptingJspJspScriptEngineFactoryInfoDescription :: Maybe Text
      <*> arbitrary -- orgApacheSlingScriptingJspJspScriptEngineFactoryInfoProperties :: Maybe OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties
      <*> arbitrary -- orgApacheSlingScriptingJspJspScriptEngineFactoryInfoBundleLocation :: Maybe Text
      <*> arbitrary -- orgApacheSlingScriptingJspJspScriptEngineFactoryInfoServiceLocation :: Maybe Text
    
instance Arbitrary OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties where
  arbitrary =
    OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties
      <$> arbitrary -- orgApacheSlingScriptingJspJspScriptEngineFactoryPropertiesJasperCompilerTargetVm :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingScriptingJspJspScriptEngineFactoryPropertiesJasperCompilerSourceVm :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingScriptingJspJspScriptEngineFactoryPropertiesJasperClassdebuginfo :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- orgApacheSlingScriptingJspJspScriptEngineFactoryPropertiesJasperEnablePooling :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- orgApacheSlingScriptingJspJspScriptEngineFactoryPropertiesJasperIeClassId :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingScriptingJspJspScriptEngineFactoryPropertiesJasperGenStringAsCharArray :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- orgApacheSlingScriptingJspJspScriptEngineFactoryPropertiesJasperKeepgenerated :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- orgApacheSlingScriptingJspJspScriptEngineFactoryPropertiesJasperMappedfile :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- orgApacheSlingScriptingJspJspScriptEngineFactoryPropertiesJasperTrimSpaces :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- orgApacheSlingScriptingJspJspScriptEngineFactoryPropertiesJasperDisplaySourceFragments :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- orgApacheSlingScriptingJspJspScriptEngineFactoryPropertiesDefaultIsSession :: Maybe ConfigNodePropertyBoolean
    
instance Arbitrary OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvInfo where
  arbitrary =
    OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvInfo
      <$> arbitrary -- orgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvInfoPid :: Maybe Text
      <*> arbitrary -- orgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvInfoTitle :: Maybe Text
      <*> arbitrary -- orgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvInfoDescription :: Maybe Text
      <*> arbitrary -- orgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvInfoProperties :: Maybe OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties
      <*> arbitrary -- orgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvInfoBundleLocation :: Maybe Text
      <*> arbitrary -- orgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvInfoServiceLocation :: Maybe Text
    
instance Arbitrary OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties where
  arbitrary =
    OrgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvProperties
      <$> arbitrary -- orgApacheSlingScriptingSightlyJsImplJsapiSlyBindingsValuesProvPropertiesOrgApacheSlingScriptingSightlyJsBindings :: Maybe ConfigNodePropertyArray
    
instance Arbitrary OrgApacheSlingSecurityImplContentDispositionFilterInfo where
  arbitrary =
    OrgApacheSlingSecurityImplContentDispositionFilterInfo
      <$> arbitrary -- orgApacheSlingSecurityImplContentDispositionFilterInfoPid :: Maybe Text
      <*> arbitrary -- orgApacheSlingSecurityImplContentDispositionFilterInfoTitle :: Maybe Text
      <*> arbitrary -- orgApacheSlingSecurityImplContentDispositionFilterInfoDescription :: Maybe Text
      <*> arbitrary -- orgApacheSlingSecurityImplContentDispositionFilterInfoProperties :: Maybe OrgApacheSlingSecurityImplContentDispositionFilterProperties
      <*> arbitrary -- orgApacheSlingSecurityImplContentDispositionFilterInfoBundleLocation :: Maybe Text
      <*> arbitrary -- orgApacheSlingSecurityImplContentDispositionFilterInfoServiceLocation :: Maybe Text
    
instance Arbitrary OrgApacheSlingSecurityImplContentDispositionFilterProperties where
  arbitrary =
    OrgApacheSlingSecurityImplContentDispositionFilterProperties
      <$> arbitrary -- orgApacheSlingSecurityImplContentDispositionFilterPropertiesSlingContentDispositionPaths :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- orgApacheSlingSecurityImplContentDispositionFilterPropertiesSlingContentDispositionExcludedPaths :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- orgApacheSlingSecurityImplContentDispositionFilterPropertiesSlingContentDispositionAllPaths :: Maybe ConfigNodePropertyBoolean
    
instance Arbitrary OrgApacheSlingSecurityImplReferrerFilterInfo where
  arbitrary =
    OrgApacheSlingSecurityImplReferrerFilterInfo
      <$> arbitrary -- orgApacheSlingSecurityImplReferrerFilterInfoPid :: Maybe Text
      <*> arbitrary -- orgApacheSlingSecurityImplReferrerFilterInfoTitle :: Maybe Text
      <*> arbitrary -- orgApacheSlingSecurityImplReferrerFilterInfoDescription :: Maybe Text
      <*> arbitrary -- orgApacheSlingSecurityImplReferrerFilterInfoProperties :: Maybe OrgApacheSlingSecurityImplReferrerFilterProperties
      <*> arbitrary -- orgApacheSlingSecurityImplReferrerFilterInfoBundleLocation :: Maybe Text
      <*> arbitrary -- orgApacheSlingSecurityImplReferrerFilterInfoServiceLocation :: Maybe Text
    
instance Arbitrary OrgApacheSlingSecurityImplReferrerFilterProperties where
  arbitrary =
    OrgApacheSlingSecurityImplReferrerFilterProperties
      <$> arbitrary -- orgApacheSlingSecurityImplReferrerFilterPropertiesAllowEmpty :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- orgApacheSlingSecurityImplReferrerFilterPropertiesAllowHosts :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- orgApacheSlingSecurityImplReferrerFilterPropertiesAllowHostsRegexp :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- orgApacheSlingSecurityImplReferrerFilterPropertiesFilterMethods :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- orgApacheSlingSecurityImplReferrerFilterPropertiesExcludeAgentsRegexp :: Maybe ConfigNodePropertyArray
    
instance Arbitrary OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedInfo where
  arbitrary =
    OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedInfo
      <$> arbitrary -- orgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedInfoPid :: Maybe Text
      <*> arbitrary -- orgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedInfoTitle :: Maybe Text
      <*> arbitrary -- orgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedInfoDescription :: Maybe Text
      <*> arbitrary -- orgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedInfoProperties :: Maybe OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties
    
instance Arbitrary OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties where
  arbitrary =
    OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties
      <$> arbitrary -- orgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedPropertiesServiceRanking :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedPropertiesUserMapping :: Maybe ConfigNodePropertyArray
    
instance Arbitrary OrgApacheSlingServiceusermappingImplServiceUserMapperImplInfo where
  arbitrary =
    OrgApacheSlingServiceusermappingImplServiceUserMapperImplInfo
      <$> arbitrary -- orgApacheSlingServiceusermappingImplServiceUserMapperImplInfoPid :: Maybe Text
      <*> arbitrary -- orgApacheSlingServiceusermappingImplServiceUserMapperImplInfoTitle :: Maybe Text
      <*> arbitrary -- orgApacheSlingServiceusermappingImplServiceUserMapperImplInfoDescription :: Maybe Text
      <*> arbitrary -- orgApacheSlingServiceusermappingImplServiceUserMapperImplInfoProperties :: Maybe OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties
      <*> arbitrary -- orgApacheSlingServiceusermappingImplServiceUserMapperImplInfoBundleLocation :: Maybe Text
      <*> arbitrary -- orgApacheSlingServiceusermappingImplServiceUserMapperImplInfoServiceLocation :: Maybe Text
    
instance Arbitrary OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties where
  arbitrary =
    OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties
      <$> arbitrary -- orgApacheSlingServiceusermappingImplServiceUserMapperImplPropertiesUserMapping :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- orgApacheSlingServiceusermappingImplServiceUserMapperImplPropertiesUserDefault :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingServiceusermappingImplServiceUserMapperImplPropertiesUserEnableDefaultMapping :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- orgApacheSlingServiceusermappingImplServiceUserMapperImplPropertiesRequireValidation :: Maybe ConfigNodePropertyBoolean
    
instance Arbitrary OrgApacheSlingServletsGetDefaultGetServletInfo where
  arbitrary =
    OrgApacheSlingServletsGetDefaultGetServletInfo
      <$> arbitrary -- orgApacheSlingServletsGetDefaultGetServletInfoPid :: Maybe Text
      <*> arbitrary -- orgApacheSlingServletsGetDefaultGetServletInfoTitle :: Maybe Text
      <*> arbitrary -- orgApacheSlingServletsGetDefaultGetServletInfoDescription :: Maybe Text
      <*> arbitrary -- orgApacheSlingServletsGetDefaultGetServletInfoProperties :: Maybe OrgApacheSlingServletsGetDefaultGetServletProperties
      <*> arbitrary -- orgApacheSlingServletsGetDefaultGetServletInfoBundleLocation :: Maybe Text
      <*> arbitrary -- orgApacheSlingServletsGetDefaultGetServletInfoServiceLocation :: Maybe Text
    
instance Arbitrary OrgApacheSlingServletsGetDefaultGetServletProperties where
  arbitrary =
    OrgApacheSlingServletsGetDefaultGetServletProperties
      <$> arbitrary -- orgApacheSlingServletsGetDefaultGetServletPropertiesAliases :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- orgApacheSlingServletsGetDefaultGetServletPropertiesIndex :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- orgApacheSlingServletsGetDefaultGetServletPropertiesIndexFiles :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- orgApacheSlingServletsGetDefaultGetServletPropertiesEnableHtml :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- orgApacheSlingServletsGetDefaultGetServletPropertiesEnableJson :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- orgApacheSlingServletsGetDefaultGetServletPropertiesEnableTxt :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- orgApacheSlingServletsGetDefaultGetServletPropertiesEnableXml :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- orgApacheSlingServletsGetDefaultGetServletPropertiesJsonMaximumresults :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheSlingServletsGetDefaultGetServletPropertiesEcmaSuport :: Maybe ConfigNodePropertyBoolean
    
instance Arbitrary OrgApacheSlingServletsGetImplVersionVersionInfoServletInfo where
  arbitrary =
    OrgApacheSlingServletsGetImplVersionVersionInfoServletInfo
      <$> arbitrary -- orgApacheSlingServletsGetImplVersionVersionInfoServletInfoPid :: Maybe Text
      <*> arbitrary -- orgApacheSlingServletsGetImplVersionVersionInfoServletInfoTitle :: Maybe Text
      <*> arbitrary -- orgApacheSlingServletsGetImplVersionVersionInfoServletInfoDescription :: Maybe Text
      <*> arbitrary -- orgApacheSlingServletsGetImplVersionVersionInfoServletInfoProperties :: Maybe OrgApacheSlingServletsGetImplVersionVersionInfoServletProperties
    
instance Arbitrary OrgApacheSlingServletsGetImplVersionVersionInfoServletProperties where
  arbitrary =
    OrgApacheSlingServletsGetImplVersionVersionInfoServletProperties
      <$> arbitrary -- orgApacheSlingServletsGetImplVersionVersionInfoServletPropertiesSlingServletSelectors :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- orgApacheSlingServletsGetImplVersionVersionInfoServletPropertiesEcmaSuport :: Maybe ConfigNodePropertyBoolean
    
instance Arbitrary OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskInfo where
  arbitrary =
    OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskInfo
      <$> arbitrary -- orgApacheSlingServletsPostImplHelperChunkCleanUpTaskInfoPid :: Maybe Text
      <*> arbitrary -- orgApacheSlingServletsPostImplHelperChunkCleanUpTaskInfoTitle :: Maybe Text
      <*> arbitrary -- orgApacheSlingServletsPostImplHelperChunkCleanUpTaskInfoDescription :: Maybe Text
      <*> arbitrary -- orgApacheSlingServletsPostImplHelperChunkCleanUpTaskInfoProperties :: Maybe OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties
    
instance Arbitrary OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties where
  arbitrary =
    OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties
      <$> arbitrary -- orgApacheSlingServletsPostImplHelperChunkCleanUpTaskPropertiesSchedulerExpression :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingServletsPostImplHelperChunkCleanUpTaskPropertiesSchedulerConcurrent :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- orgApacheSlingServletsPostImplHelperChunkCleanUpTaskPropertiesChunkCleanupAge :: Maybe ConfigNodePropertyInteger
    
instance Arbitrary OrgApacheSlingServletsPostImplSlingPostServletInfo where
  arbitrary =
    OrgApacheSlingServletsPostImplSlingPostServletInfo
      <$> arbitrary -- orgApacheSlingServletsPostImplSlingPostServletInfoPid :: Maybe Text
      <*> arbitrary -- orgApacheSlingServletsPostImplSlingPostServletInfoTitle :: Maybe Text
      <*> arbitrary -- orgApacheSlingServletsPostImplSlingPostServletInfoDescription :: Maybe Text
      <*> arbitrary -- orgApacheSlingServletsPostImplSlingPostServletInfoProperties :: Maybe OrgApacheSlingServletsPostImplSlingPostServletProperties
    
instance Arbitrary OrgApacheSlingServletsPostImplSlingPostServletProperties where
  arbitrary =
    OrgApacheSlingServletsPostImplSlingPostServletProperties
      <$> arbitrary -- orgApacheSlingServletsPostImplSlingPostServletPropertiesServletPostDateFormats :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- orgApacheSlingServletsPostImplSlingPostServletPropertiesServletPostNodeNameHints :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- orgApacheSlingServletsPostImplSlingPostServletPropertiesServletPostNodeNameMaxLength :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheSlingServletsPostImplSlingPostServletPropertiesServletPostCheckinNewVersionableNodes :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- orgApacheSlingServletsPostImplSlingPostServletPropertiesServletPostAutoCheckout :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- orgApacheSlingServletsPostImplSlingPostServletPropertiesServletPostAutoCheckin :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- orgApacheSlingServletsPostImplSlingPostServletPropertiesServletPostIgnorePattern :: Maybe ConfigNodePropertyString
    
instance Arbitrary OrgApacheSlingServletsResolverSlingServletResolverInfo where
  arbitrary =
    OrgApacheSlingServletsResolverSlingServletResolverInfo
      <$> arbitrary -- orgApacheSlingServletsResolverSlingServletResolverInfoPid :: Maybe Text
      <*> arbitrary -- orgApacheSlingServletsResolverSlingServletResolverInfoTitle :: Maybe Text
      <*> arbitrary -- orgApacheSlingServletsResolverSlingServletResolverInfoDescription :: Maybe Text
      <*> arbitrary -- orgApacheSlingServletsResolverSlingServletResolverInfoProperties :: Maybe OrgApacheSlingServletsResolverSlingServletResolverProperties
      <*> arbitrary -- orgApacheSlingServletsResolverSlingServletResolverInfoBundleLocation :: Maybe Text
      <*> arbitrary -- orgApacheSlingServletsResolverSlingServletResolverInfoServiceLocation :: Maybe Text
    
instance Arbitrary OrgApacheSlingServletsResolverSlingServletResolverProperties where
  arbitrary =
    OrgApacheSlingServletsResolverSlingServletResolverProperties
      <$> arbitrary -- orgApacheSlingServletsResolverSlingServletResolverPropertiesServletresolverServletRoot :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingServletsResolverSlingServletResolverPropertiesServletresolverCacheSize :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheSlingServletsResolverSlingServletResolverPropertiesServletresolverPaths :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- orgApacheSlingServletsResolverSlingServletResolverPropertiesServletresolverDefaultExtensions :: Maybe ConfigNodePropertyArray
    
instance Arbitrary OrgApacheSlingSettingsImplSlingSettingsServiceImplInfo where
  arbitrary =
    OrgApacheSlingSettingsImplSlingSettingsServiceImplInfo
      <$> arbitrary -- orgApacheSlingSettingsImplSlingSettingsServiceImplInfoPid :: Maybe Text
      <*> arbitrary -- orgApacheSlingSettingsImplSlingSettingsServiceImplInfoTitle :: Maybe Text
      <*> arbitrary -- orgApacheSlingSettingsImplSlingSettingsServiceImplInfoDescription :: Maybe Text
      <*> arbitrary -- orgApacheSlingSettingsImplSlingSettingsServiceImplInfoProperties :: Maybe OrgApacheSlingSettingsImplSlingSettingsServiceImplProperties
    
instance Arbitrary OrgApacheSlingSettingsImplSlingSettingsServiceImplProperties where
  arbitrary =
    OrgApacheSlingSettingsImplSlingSettingsServiceImplProperties
      <$> arbitrary -- orgApacheSlingSettingsImplSlingSettingsServiceImplPropertiesSlingName :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingSettingsImplSlingSettingsServiceImplPropertiesSlingDescription :: Maybe ConfigNodePropertyString
    
instance Arbitrary OrgApacheSlingStartupfilterImplStartupFilterImplInfo where
  arbitrary =
    OrgApacheSlingStartupfilterImplStartupFilterImplInfo
      <$> arbitrary -- orgApacheSlingStartupfilterImplStartupFilterImplInfoPid :: Maybe Text
      <*> arbitrary -- orgApacheSlingStartupfilterImplStartupFilterImplInfoTitle :: Maybe Text
      <*> arbitrary -- orgApacheSlingStartupfilterImplStartupFilterImplInfoDescription :: Maybe Text
      <*> arbitrary -- orgApacheSlingStartupfilterImplStartupFilterImplInfoProperties :: Maybe OrgApacheSlingStartupfilterImplStartupFilterImplProperties
    
instance Arbitrary OrgApacheSlingStartupfilterImplStartupFilterImplProperties where
  arbitrary =
    OrgApacheSlingStartupfilterImplStartupFilterImplProperties
      <$> arbitrary -- orgApacheSlingStartupfilterImplStartupFilterImplPropertiesActiveByDefault :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- orgApacheSlingStartupfilterImplStartupFilterImplPropertiesDefaultMessage :: Maybe ConfigNodePropertyString
    
instance Arbitrary OrgApacheSlingTenantInternalTenantProviderImplInfo where
  arbitrary =
    OrgApacheSlingTenantInternalTenantProviderImplInfo
      <$> arbitrary -- orgApacheSlingTenantInternalTenantProviderImplInfoPid :: Maybe Text
      <*> arbitrary -- orgApacheSlingTenantInternalTenantProviderImplInfoTitle :: Maybe Text
      <*> arbitrary -- orgApacheSlingTenantInternalTenantProviderImplInfoDescription :: Maybe Text
      <*> arbitrary -- orgApacheSlingTenantInternalTenantProviderImplInfoProperties :: Maybe OrgApacheSlingTenantInternalTenantProviderImplProperties
    
instance Arbitrary OrgApacheSlingTenantInternalTenantProviderImplProperties where
  arbitrary =
    OrgApacheSlingTenantInternalTenantProviderImplProperties
      <$> arbitrary -- orgApacheSlingTenantInternalTenantProviderImplPropertiesTenantRoot :: Maybe ConfigNodePropertyString
      <*> arbitrary -- orgApacheSlingTenantInternalTenantProviderImplPropertiesTenantPathMatcher :: Maybe ConfigNodePropertyArray
    
instance Arbitrary OrgApacheSlingTracerInternalLogTracerInfo where
  arbitrary =
    OrgApacheSlingTracerInternalLogTracerInfo
      <$> arbitrary -- orgApacheSlingTracerInternalLogTracerInfoPid :: Maybe Text
      <*> arbitrary -- orgApacheSlingTracerInternalLogTracerInfoTitle :: Maybe Text
      <*> arbitrary -- orgApacheSlingTracerInternalLogTracerInfoDescription :: Maybe Text
      <*> arbitrary -- orgApacheSlingTracerInternalLogTracerInfoProperties :: Maybe OrgApacheSlingTracerInternalLogTracerProperties
    
instance Arbitrary OrgApacheSlingTracerInternalLogTracerProperties where
  arbitrary =
    OrgApacheSlingTracerInternalLogTracerProperties
      <$> arbitrary -- orgApacheSlingTracerInternalLogTracerPropertiesTracerSets :: Maybe ConfigNodePropertyArray
      <*> arbitrary -- orgApacheSlingTracerInternalLogTracerPropertiesEnabled :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- orgApacheSlingTracerInternalLogTracerPropertiesServletEnabled :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- orgApacheSlingTracerInternalLogTracerPropertiesRecordingCacheSizeInMb :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheSlingTracerInternalLogTracerPropertiesRecordingCacheDurationInSecs :: Maybe ConfigNodePropertyInteger
      <*> arbitrary -- orgApacheSlingTracerInternalLogTracerPropertiesRecordingCompressionEnabled :: Maybe ConfigNodePropertyBoolean
      <*> arbitrary -- orgApacheSlingTracerInternalLogTracerPropertiesGzipResponse :: Maybe ConfigNodePropertyBoolean
    
instance Arbitrary OrgApacheSlingXssImplXSSFilterImplInfo where
  arbitrary =
    OrgApacheSlingXssImplXSSFilterImplInfo
      <$> arbitrary -- orgApacheSlingXssImplXSSFilterImplInfoPid :: Maybe Text
      <*> arbitrary -- orgApacheSlingXssImplXSSFilterImplInfoTitle :: Maybe Text
      <*> arbitrary -- orgApacheSlingXssImplXSSFilterImplInfoDescription :: Maybe Text
      <*> arbitrary -- orgApacheSlingXssImplXSSFilterImplInfoProperties :: Maybe OrgApacheSlingXssImplXSSFilterImplProperties
      <*> arbitrary -- orgApacheSlingXssImplXSSFilterImplInfoBundleLocation :: Maybe Text
      <*> arbitrary -- orgApacheSlingXssImplXSSFilterImplInfoServiceLocation :: Maybe Text
    
instance Arbitrary OrgApacheSlingXssImplXSSFilterImplProperties where
  arbitrary =
    OrgApacheSlingXssImplXSSFilterImplProperties
      <$> arbitrary -- orgApacheSlingXssImplXSSFilterImplPropertiesPolicyPath :: Maybe ConfigNodePropertyString
    


