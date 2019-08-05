using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties
    /// </summary>
    public sealed class ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties:  IEquatable<ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties>
    { 
        /// <summary>
        /// ComAdobeCqCdnCdnRewriter
        /// </summary>
        public ConfigNodePropertyString ComAdobeCqCdnCdnRewriter { get; private set; }

        /// <summary>
        /// ComAdobeCqCloudConfigComponents
        /// </summary>
        public ConfigNodePropertyString ComAdobeCqCloudConfigComponents { get; private set; }

        /// <summary>
        /// ComAdobeCqCloudConfigCore
        /// </summary>
        public ConfigNodePropertyString ComAdobeCqCloudConfigCore { get; private set; }

        /// <summary>
        /// ComAdobeCqCloudConfigUi
        /// </summary>
        public ConfigNodePropertyString ComAdobeCqCloudConfigUi { get; private set; }

        /// <summary>
        /// ComAdobeCqComAdobeCqEditor
        /// </summary>
        public ConfigNodePropertyString ComAdobeCqComAdobeCqEditor { get; private set; }

        /// <summary>
        /// ComAdobeCqComAdobeCqProjectsCore
        /// </summary>
        public ConfigNodePropertyString ComAdobeCqComAdobeCqProjectsCore { get; private set; }

        /// <summary>
        /// ComAdobeCqComAdobeCqProjectsWcmCore
        /// </summary>
        public ConfigNodePropertyString ComAdobeCqComAdobeCqProjectsWcmCore { get; private set; }

        /// <summary>
        /// ComAdobeCqComAdobeCqUiCommons
        /// </summary>
        public ConfigNodePropertyString ComAdobeCqComAdobeCqUiCommons { get; private set; }

        /// <summary>
        /// ComAdobeCqComAdobeCqWcmStyle
        /// </summary>
        public ConfigNodePropertyString ComAdobeCqComAdobeCqWcmStyle { get; private set; }

        /// <summary>
        /// ComAdobeCqCqActivitymapIntegration
        /// </summary>
        public ConfigNodePropertyString ComAdobeCqCqActivitymapIntegration { get; private set; }

        /// <summary>
        /// ComAdobeCqCqContexthubCommons
        /// </summary>
        public ConfigNodePropertyString ComAdobeCqCqContexthubCommons { get; private set; }

        /// <summary>
        /// ComAdobeCqCqDtm
        /// </summary>
        public ConfigNodePropertyString ComAdobeCqCqDtm { get; private set; }

        /// <summary>
        /// ComAdobeCqCqHealthcheck
        /// </summary>
        public ConfigNodePropertyString ComAdobeCqCqHealthcheck { get; private set; }

        /// <summary>
        /// ComAdobeCqCqMultisiteTargeting
        /// </summary>
        public ConfigNodePropertyString ComAdobeCqCqMultisiteTargeting { get; private set; }

        /// <summary>
        /// ComAdobeCqCqPreUpgradeCleanup
        /// </summary>
        public ConfigNodePropertyString ComAdobeCqCqPreUpgradeCleanup { get; private set; }

        /// <summary>
        /// ComAdobeCqCqProductInfoProvider
        /// </summary>
        public ConfigNodePropertyString ComAdobeCqCqProductInfoProvider { get; private set; }

        /// <summary>
        /// ComAdobeCqCqRestSites
        /// </summary>
        public ConfigNodePropertyString ComAdobeCqCqRestSites { get; private set; }

        /// <summary>
        /// ComAdobeCqCqSecurityHc
        /// </summary>
        public ConfigNodePropertyString ComAdobeCqCqSecurityHc { get; private set; }

        /// <summary>
        /// ComAdobeCqDamCqDamSvgHandler
        /// </summary>
        public ConfigNodePropertyString ComAdobeCqDamCqDamSvgHandler { get; private set; }

        /// <summary>
        /// ComAdobeCqDamCqScene7Imaging
        /// </summary>
        public ConfigNodePropertyString ComAdobeCqDamCqScene7Imaging { get; private set; }

        /// <summary>
        /// ComAdobeCqDtmReactorCore
        /// </summary>
        public ConfigNodePropertyString ComAdobeCqDtmReactorCore { get; private set; }

        /// <summary>
        /// ComAdobeCqDtmReactorUi
        /// </summary>
        public ConfigNodePropertyString ComAdobeCqDtmReactorUi { get; private set; }

        /// <summary>
        /// ComAdobeCqExpJspelResolver
        /// </summary>
        public ConfigNodePropertyString ComAdobeCqExpJspelResolver { get; private set; }

        /// <summary>
        /// ComAdobeCqInboxCqInbox
        /// </summary>
        public ConfigNodePropertyString ComAdobeCqInboxCqInbox { get; private set; }

        /// <summary>
        /// ComAdobeCqJsonSchemaParser
        /// </summary>
        public ConfigNodePropertyString ComAdobeCqJsonSchemaParser { get; private set; }

        /// <summary>
        /// ComAdobeCqMediaCqMediaPublishingDpsFpCore
        /// </summary>
        public ConfigNodePropertyString ComAdobeCqMediaCqMediaPublishingDpsFpCore { get; private set; }

        /// <summary>
        /// ComAdobeCqMobileCqMobileCaas
        /// </summary>
        public ConfigNodePropertyString ComAdobeCqMobileCqMobileCaas { get; private set; }

        /// <summary>
        /// ComAdobeCqMobileCqMobileIndexBuilder
        /// </summary>
        public ConfigNodePropertyString ComAdobeCqMobileCqMobileIndexBuilder { get; private set; }

        /// <summary>
        /// ComAdobeCqMobileCqMobilePhonegapBuild
        /// </summary>
        public ConfigNodePropertyString ComAdobeCqMobileCqMobilePhonegapBuild { get; private set; }

        /// <summary>
        /// ComAdobeCqMyspell
        /// </summary>
        public ConfigNodePropertyString ComAdobeCqMyspell { get; private set; }

        /// <summary>
        /// ComAdobeCqSampleWeRetailCore
        /// </summary>
        public ConfigNodePropertyString ComAdobeCqSampleWeRetailCore { get; private set; }

        /// <summary>
        /// ComAdobeCqScreensComAdobeCqScreensDcc
        /// </summary>
        public ConfigNodePropertyString ComAdobeCqScreensComAdobeCqScreensDcc { get; private set; }

        /// <summary>
        /// ComAdobeCqScreensComAdobeCqScreensMqCore
        /// </summary>
        public ConfigNodePropertyString ComAdobeCqScreensComAdobeCqScreensMqCore { get; private set; }

        /// <summary>
        /// ComAdobeCqSocialCqSocialAsProvider
        /// </summary>
        public ConfigNodePropertyString ComAdobeCqSocialCqSocialAsProvider { get; private set; }

        /// <summary>
        /// ComAdobeCqSocialCqSocialBadgingBasicImpl
        /// </summary>
        public ConfigNodePropertyString ComAdobeCqSocialCqSocialBadgingBasicImpl { get; private set; }

        /// <summary>
        /// ComAdobeCqSocialCqSocialBadgingImpl
        /// </summary>
        public ConfigNodePropertyString ComAdobeCqSocialCqSocialBadgingImpl { get; private set; }

        /// <summary>
        /// ComAdobeCqSocialCqSocialCalendarImpl
        /// </summary>
        public ConfigNodePropertyString ComAdobeCqSocialCqSocialCalendarImpl { get; private set; }

        /// <summary>
        /// ComAdobeCqSocialCqSocialContentFragmentsImpl
        /// </summary>
        public ConfigNodePropertyString ComAdobeCqSocialCqSocialContentFragmentsImpl { get; private set; }

        /// <summary>
        /// ComAdobeCqSocialCqSocialEnablementImpl
        /// </summary>
        public ConfigNodePropertyString ComAdobeCqSocialCqSocialEnablementImpl { get; private set; }

        /// <summary>
        /// ComAdobeCqSocialCqSocialGraphImpl
        /// </summary>
        public ConfigNodePropertyString ComAdobeCqSocialCqSocialGraphImpl { get; private set; }

        /// <summary>
        /// ComAdobeCqSocialCqSocialIdeationImpl
        /// </summary>
        public ConfigNodePropertyString ComAdobeCqSocialCqSocialIdeationImpl { get; private set; }

        /// <summary>
        /// ComAdobeCqSocialCqSocialJcrProvider
        /// </summary>
        public ConfigNodePropertyString ComAdobeCqSocialCqSocialJcrProvider { get; private set; }

        /// <summary>
        /// ComAdobeCqSocialCqSocialMembersImpl
        /// </summary>
        public ConfigNodePropertyString ComAdobeCqSocialCqSocialMembersImpl { get; private set; }

        /// <summary>
        /// ComAdobeCqSocialCqSocialMsProvider
        /// </summary>
        public ConfigNodePropertyString ComAdobeCqSocialCqSocialMsProvider { get; private set; }

        /// <summary>
        /// ComAdobeCqSocialCqSocialNotificationsChannelsWeb
        /// </summary>
        public ConfigNodePropertyString ComAdobeCqSocialCqSocialNotificationsChannelsWeb { get; private set; }

        /// <summary>
        /// ComAdobeCqSocialCqSocialNotificationsImpl
        /// </summary>
        public ConfigNodePropertyString ComAdobeCqSocialCqSocialNotificationsImpl { get; private set; }

        /// <summary>
        /// ComAdobeCqSocialCqSocialRdbProvider
        /// </summary>
        public ConfigNodePropertyString ComAdobeCqSocialCqSocialRdbProvider { get; private set; }

        /// <summary>
        /// ComAdobeCqSocialCqSocialScfImpl
        /// </summary>
        public ConfigNodePropertyString ComAdobeCqSocialCqSocialScfImpl { get; private set; }

        /// <summary>
        /// ComAdobeCqSocialCqSocialScoringBasicImpl
        /// </summary>
        public ConfigNodePropertyString ComAdobeCqSocialCqSocialScoringBasicImpl { get; private set; }

        /// <summary>
        /// ComAdobeCqSocialCqSocialScoringImpl
        /// </summary>
        public ConfigNodePropertyString ComAdobeCqSocialCqSocialScoringImpl { get; private set; }

        /// <summary>
        /// ComAdobeCqSocialCqSocialServiceusersImpl
        /// </summary>
        public ConfigNodePropertyString ComAdobeCqSocialCqSocialServiceusersImpl { get; private set; }

        /// <summary>
        /// ComAdobeCqSocialCqSocialSrpImpl
        /// </summary>
        public ConfigNodePropertyString ComAdobeCqSocialCqSocialSrpImpl { get; private set; }

        /// <summary>
        /// ComAdobeCqSocialCqSocialUgcbaseImpl
        /// </summary>
        public ConfigNodePropertyString ComAdobeCqSocialCqSocialUgcbaseImpl { get; private set; }

        /// <summary>
        /// ComAdobeDamCqDamCfmImpl
        /// </summary>
        public ConfigNodePropertyString ComAdobeDamCqDamCfmImpl { get; private set; }

        /// <summary>
        /// ComAdobeFormsFoundationFormsFoundationBase
        /// </summary>
        public ConfigNodePropertyString ComAdobeFormsFoundationFormsFoundationBase { get; private set; }

        /// <summary>
        /// ComAdobeGraniteApicontroller
        /// </summary>
        public ConfigNodePropertyString ComAdobeGraniteApicontroller { get; private set; }

        /// <summary>
        /// ComAdobeGraniteAssetCore
        /// </summary>
        public ConfigNodePropertyString ComAdobeGraniteAssetCore { get; private set; }

        /// <summary>
        /// ComAdobeGraniteAuthSso
        /// </summary>
        public ConfigNodePropertyString ComAdobeGraniteAuthSso { get; private set; }

        /// <summary>
        /// ComAdobeGraniteBundlesHcImpl
        /// </summary>
        public ConfigNodePropertyString ComAdobeGraniteBundlesHcImpl { get; private set; }

        /// <summary>
        /// ComAdobeGraniteCompatRouter
        /// </summary>
        public ConfigNodePropertyString ComAdobeGraniteCompatRouter { get; private set; }

        /// <summary>
        /// ComAdobeGraniteConf
        /// </summary>
        public ConfigNodePropertyString ComAdobeGraniteConf { get; private set; }

        /// <summary>
        /// ComAdobeGraniteConfUiCore
        /// </summary>
        public ConfigNodePropertyString ComAdobeGraniteConfUiCore { get; private set; }

        /// <summary>
        /// ComAdobeGraniteCors
        /// </summary>
        public ConfigNodePropertyString ComAdobeGraniteCors { get; private set; }

        /// <summary>
        /// ComAdobeGraniteCrxExplorer
        /// </summary>
        public ConfigNodePropertyString ComAdobeGraniteCrxExplorer { get; private set; }

        /// <summary>
        /// ComAdobeGraniteCrxdeLite
        /// </summary>
        public ConfigNodePropertyString ComAdobeGraniteCrxdeLite { get; private set; }

        /// <summary>
        /// ComAdobeGraniteCryptoConfig
        /// </summary>
        public ConfigNodePropertyString ComAdobeGraniteCryptoConfig { get; private set; }

        /// <summary>
        /// ComAdobeGraniteCryptoExtension
        /// </summary>
        public ConfigNodePropertyString ComAdobeGraniteCryptoExtension { get; private set; }

        /// <summary>
        /// ComAdobeGraniteCryptoFile
        /// </summary>
        public ConfigNodePropertyString ComAdobeGraniteCryptoFile { get; private set; }

        /// <summary>
        /// ComAdobeGraniteCryptoJcr
        /// </summary>
        public ConfigNodePropertyString ComAdobeGraniteCryptoJcr { get; private set; }

        /// <summary>
        /// ComAdobeGraniteCsrf
        /// </summary>
        public ConfigNodePropertyString ComAdobeGraniteCsrf { get; private set; }

        /// <summary>
        /// ComAdobeGraniteDistributionCore
        /// </summary>
        public ConfigNodePropertyString ComAdobeGraniteDistributionCore { get; private set; }

        /// <summary>
        /// ComAdobeGraniteDropwizardMetrics
        /// </summary>
        public ConfigNodePropertyString ComAdobeGraniteDropwizardMetrics { get; private set; }

        /// <summary>
        /// ComAdobeGraniteFragsImpl
        /// </summary>
        public ConfigNodePropertyString ComAdobeGraniteFragsImpl { get; private set; }

        /// <summary>
        /// ComAdobeGraniteGibson
        /// </summary>
        public ConfigNodePropertyString ComAdobeGraniteGibson { get; private set; }

        /// <summary>
        /// ComAdobeGraniteInfocollector
        /// </summary>
        public ConfigNodePropertyString ComAdobeGraniteInfocollector { get; private set; }

        /// <summary>
        /// ComAdobeGraniteInstallerFactoryPackages
        /// </summary>
        public ConfigNodePropertyString ComAdobeGraniteInstallerFactoryPackages { get; private set; }

        /// <summary>
        /// ComAdobeGraniteJettySsl
        /// </summary>
        public ConfigNodePropertyString ComAdobeGraniteJettySsl { get; private set; }

        /// <summary>
        /// ComAdobeGraniteJobsAsync
        /// </summary>
        public ConfigNodePropertyString ComAdobeGraniteJobsAsync { get; private set; }

        /// <summary>
        /// ComAdobeGraniteMaintenanceOak
        /// </summary>
        public ConfigNodePropertyString ComAdobeGraniteMaintenanceOak { get; private set; }

        /// <summary>
        /// ComAdobeGraniteMonitoringCore
        /// </summary>
        public ConfigNodePropertyString ComAdobeGraniteMonitoringCore { get; private set; }

        /// <summary>
        /// ComAdobeGraniteQueries
        /// </summary>
        public ConfigNodePropertyString ComAdobeGraniteQueries { get; private set; }

        /// <summary>
        /// ComAdobeGraniteReplicationHcImpl
        /// </summary>
        public ConfigNodePropertyString ComAdobeGraniteReplicationHcImpl { get; private set; }

        /// <summary>
        /// ComAdobeGraniteRepositoryChecker
        /// </summary>
        public ConfigNodePropertyString ComAdobeGraniteRepositoryChecker { get; private set; }

        /// <summary>
        /// ComAdobeGraniteRepositoryHcImpl
        /// </summary>
        public ConfigNodePropertyString ComAdobeGraniteRepositoryHcImpl { get; private set; }

        /// <summary>
        /// ComAdobeGraniteRestAssets
        /// </summary>
        public ConfigNodePropertyString ComAdobeGraniteRestAssets { get; private set; }

        /// <summary>
        /// ComAdobeGraniteSecurityUi
        /// </summary>
        public ConfigNodePropertyString ComAdobeGraniteSecurityUi { get; private set; }

        /// <summary>
        /// ComAdobeGraniteStartup
        /// </summary>
        public ConfigNodePropertyString ComAdobeGraniteStartup { get; private set; }

        /// <summary>
        /// ComAdobeGraniteTagsoup
        /// </summary>
        public ConfigNodePropertyString ComAdobeGraniteTagsoup { get; private set; }

        /// <summary>
        /// ComAdobeGraniteTaskmanagementCore
        /// </summary>
        public ConfigNodePropertyString ComAdobeGraniteTaskmanagementCore { get; private set; }

        /// <summary>
        /// ComAdobeGraniteTaskmanagementWorkflow
        /// </summary>
        public ConfigNodePropertyString ComAdobeGraniteTaskmanagementWorkflow { get; private set; }

        /// <summary>
        /// ComAdobeGraniteUiClientlibsCompilerLess
        /// </summary>
        public ConfigNodePropertyString ComAdobeGraniteUiClientlibsCompilerLess { get; private set; }

        /// <summary>
        /// ComAdobeGraniteUiClientlibsProcessorGcc
        /// </summary>
        public ConfigNodePropertyString ComAdobeGraniteUiClientlibsProcessorGcc { get; private set; }

        /// <summary>
        /// ComAdobeGraniteWebconsolePlugins
        /// </summary>
        public ConfigNodePropertyString ComAdobeGraniteWebconsolePlugins { get; private set; }

        /// <summary>
        /// ComAdobeGraniteWorkflowConsole
        /// </summary>
        public ConfigNodePropertyString ComAdobeGraniteWorkflowConsole { get; private set; }

        /// <summary>
        /// ComAdobeXmpWorkerFilesNativeFragmentLinux
        /// </summary>
        public ConfigNodePropertyString ComAdobeXmpWorkerFilesNativeFragmentLinux { get; private set; }

        /// <summary>
        /// ComAdobeXmpWorkerFilesNativeFragmentMacosx
        /// </summary>
        public ConfigNodePropertyString ComAdobeXmpWorkerFilesNativeFragmentMacosx { get; private set; }

        /// <summary>
        /// ComAdobeXmpWorkerFilesNativeFragmentWin
        /// </summary>
        public ConfigNodePropertyString ComAdobeXmpWorkerFilesNativeFragmentWin { get; private set; }

        /// <summary>
        /// ComDayCommonsOsgiWrapperSimpleJndi
        /// </summary>
        public ConfigNodePropertyString ComDayCommonsOsgiWrapperSimpleJndi { get; private set; }

        /// <summary>
        /// ComDayCqCqAuthhandler
        /// </summary>
        public ConfigNodePropertyString ComDayCqCqAuthhandler { get; private set; }

        /// <summary>
        /// ComDayCqCqCompatConfigupdate
        /// </summary>
        public ConfigNodePropertyString ComDayCqCqCompatConfigupdate { get; private set; }

        /// <summary>
        /// ComDayCqCqLicensebranding
        /// </summary>
        public ConfigNodePropertyString ComDayCqCqLicensebranding { get; private set; }

        /// <summary>
        /// ComDayCqCqNotifcationImpl
        /// </summary>
        public ConfigNodePropertyString ComDayCqCqNotifcationImpl { get; private set; }

        /// <summary>
        /// ComDayCqCqReplicationAudit
        /// </summary>
        public ConfigNodePropertyString ComDayCqCqReplicationAudit { get; private set; }

        /// <summary>
        /// ComDayCqCqSearchExt
        /// </summary>
        public ConfigNodePropertyString ComDayCqCqSearchExt { get; private set; }

        /// <summary>
        /// ComDayCqDamCqDamAnnotationPrint
        /// </summary>
        public ConfigNodePropertyString ComDayCqDamCqDamAnnotationPrint { get; private set; }

        /// <summary>
        /// ComDayCqDamCqDamAssetUsage
        /// </summary>
        public ConfigNodePropertyString ComDayCqDamCqDamAssetUsage { get; private set; }

        /// <summary>
        /// ComDayCqDamCqDamS7dam
        /// </summary>
        public ConfigNodePropertyString ComDayCqDamCqDamS7dam { get; private set; }

        /// <summary>
        /// ComDayCqDamCqDamSimilaritysearch
        /// </summary>
        public ConfigNodePropertyString ComDayCqDamCqDamSimilaritysearch { get; private set; }

        /// <summary>
        /// ComDayCqDamDamWebdavSupport
        /// </summary>
        public ConfigNodePropertyString ComDayCqDamDamWebdavSupport { get; private set; }

        /// <summary>
        /// ComDayCqPreUpgradeTasks
        /// </summary>
        public ConfigNodePropertyString ComDayCqPreUpgradeTasks { get; private set; }

        /// <summary>
        /// ComDayCqReplicationExtensions
        /// </summary>
        public ConfigNodePropertyString ComDayCqReplicationExtensions { get; private set; }

        /// <summary>
        /// ComDayCqWcmCqMsmCore
        /// </summary>
        public ConfigNodePropertyString ComDayCqWcmCqMsmCore { get; private set; }

        /// <summary>
        /// ComDayCqWcmCqWcmTranslation
        /// </summary>
        public ConfigNodePropertyString ComDayCqWcmCqWcmTranslation { get; private set; }

        /// <summary>
        /// DayCommonsJrawio
        /// </summary>
        public ConfigNodePropertyString DayCommonsJrawio { get; private set; }

        /// <summary>
        /// OrgApacheAriesJmxWhiteboard
        /// </summary>
        public ConfigNodePropertyString OrgApacheAriesJmxWhiteboard { get; private set; }

        /// <summary>
        /// OrgApacheFelixHttpSslfilter
        /// </summary>
        public ConfigNodePropertyString OrgApacheFelixHttpSslfilter { get; private set; }

        /// <summary>
        /// OrgApacheFelixOrgApacheFelixThreaddump
        /// </summary>
        public ConfigNodePropertyString OrgApacheFelixOrgApacheFelixThreaddump { get; private set; }

        /// <summary>
        /// OrgApacheFelixWebconsolePluginsDs
        /// </summary>
        public ConfigNodePropertyString OrgApacheFelixWebconsolePluginsDs { get; private set; }

        /// <summary>
        /// OrgApacheFelixWebconsolePluginsEvent
        /// </summary>
        public ConfigNodePropertyString OrgApacheFelixWebconsolePluginsEvent { get; private set; }

        /// <summary>
        /// OrgApacheFelixWebconsolePluginsMemoryusage
        /// </summary>
        public ConfigNodePropertyString OrgApacheFelixWebconsolePluginsMemoryusage { get; private set; }

        /// <summary>
        /// OrgApacheFelixWebconsolePluginsPackageadmin
        /// </summary>
        public ConfigNodePropertyString OrgApacheFelixWebconsolePluginsPackageadmin { get; private set; }

        /// <summary>
        /// OrgApacheJackrabbitOakAuthLdap
        /// </summary>
        public ConfigNodePropertyString OrgApacheJackrabbitOakAuthLdap { get; private set; }

        /// <summary>
        /// OrgApacheJackrabbitOakSegmentTar
        /// </summary>
        public ConfigNodePropertyString OrgApacheJackrabbitOakSegmentTar { get; private set; }

        /// <summary>
        /// OrgApacheJackrabbitOakSolrOsgi
        /// </summary>
        public ConfigNodePropertyString OrgApacheJackrabbitOakSolrOsgi { get; private set; }

        /// <summary>
        /// OrgApacheSlingBundleresourceImpl
        /// </summary>
        public ConfigNodePropertyString OrgApacheSlingBundleresourceImpl { get; private set; }

        /// <summary>
        /// OrgApacheSlingCommonsFsclassloader
        /// </summary>
        public ConfigNodePropertyString OrgApacheSlingCommonsFsclassloader { get; private set; }

        /// <summary>
        /// OrgApacheSlingCommonsLogWebconsole
        /// </summary>
        public ConfigNodePropertyString OrgApacheSlingCommonsLogWebconsole { get; private set; }

        /// <summary>
        /// OrgApacheSlingDatasource
        /// </summary>
        public ConfigNodePropertyString OrgApacheSlingDatasource { get; private set; }

        /// <summary>
        /// OrgApacheSlingDiscoveryBase
        /// </summary>
        public ConfigNodePropertyString OrgApacheSlingDiscoveryBase { get; private set; }

        /// <summary>
        /// OrgApacheSlingDiscoveryOak
        /// </summary>
        public ConfigNodePropertyString OrgApacheSlingDiscoveryOak { get; private set; }

        /// <summary>
        /// OrgApacheSlingDiscoverySupport
        /// </summary>
        public ConfigNodePropertyString OrgApacheSlingDiscoverySupport { get; private set; }

        /// <summary>
        /// OrgApacheSlingDistributionApi
        /// </summary>
        public ConfigNodePropertyString OrgApacheSlingDistributionApi { get; private set; }

        /// <summary>
        /// OrgApacheSlingDistributionCore
        /// </summary>
        public ConfigNodePropertyString OrgApacheSlingDistributionCore { get; private set; }

        /// <summary>
        /// OrgApacheSlingExtensionsWebconsolesecurityprovider
        /// </summary>
        public ConfigNodePropertyString OrgApacheSlingExtensionsWebconsolesecurityprovider { get; private set; }

        /// <summary>
        /// OrgApacheSlingHcWebconsole
        /// </summary>
        public ConfigNodePropertyString OrgApacheSlingHcWebconsole { get; private set; }

        /// <summary>
        /// OrgApacheSlingInstallerConsole
        /// </summary>
        public ConfigNodePropertyString OrgApacheSlingInstallerConsole { get; private set; }

        /// <summary>
        /// OrgApacheSlingInstallerProviderFile
        /// </summary>
        public ConfigNodePropertyString OrgApacheSlingInstallerProviderFile { get; private set; }

        /// <summary>
        /// OrgApacheSlingInstallerProviderJcr
        /// </summary>
        public ConfigNodePropertyString OrgApacheSlingInstallerProviderJcr { get; private set; }

        /// <summary>
        /// OrgApacheSlingJcrDavex
        /// </summary>
        public ConfigNodePropertyString OrgApacheSlingJcrDavex { get; private set; }

        /// <summary>
        /// OrgApacheSlingJcrResourcesecurity
        /// </summary>
        public ConfigNodePropertyString OrgApacheSlingJcrResourcesecurity { get; private set; }

        /// <summary>
        /// OrgApacheSlingJmxProvider
        /// </summary>
        public ConfigNodePropertyString OrgApacheSlingJmxProvider { get; private set; }

        /// <summary>
        /// OrgApacheSlingLaunchpadInstaller
        /// </summary>
        public ConfigNodePropertyString OrgApacheSlingLaunchpadInstaller { get; private set; }

        /// <summary>
        /// OrgApacheSlingModelsImpl
        /// </summary>
        public ConfigNodePropertyString OrgApacheSlingModelsImpl { get; private set; }

        /// <summary>
        /// OrgApacheSlingRepoinitParser
        /// </summary>
        public ConfigNodePropertyString OrgApacheSlingRepoinitParser { get; private set; }

        /// <summary>
        /// OrgApacheSlingResourceInventory
        /// </summary>
        public ConfigNodePropertyString OrgApacheSlingResourceInventory { get; private set; }

        /// <summary>
        /// OrgApacheSlingResourceresolver
        /// </summary>
        public ConfigNodePropertyString OrgApacheSlingResourceresolver { get; private set; }

        /// <summary>
        /// OrgApacheSlingScriptingJavascript
        /// </summary>
        public ConfigNodePropertyString OrgApacheSlingScriptingJavascript { get; private set; }

        /// <summary>
        /// OrgApacheSlingScriptingJst
        /// </summary>
        public ConfigNodePropertyString OrgApacheSlingScriptingJst { get; private set; }

        /// <summary>
        /// OrgApacheSlingScriptingSightlyJsProvider
        /// </summary>
        public ConfigNodePropertyString OrgApacheSlingScriptingSightlyJsProvider { get; private set; }

        /// <summary>
        /// OrgApacheSlingScriptingSightlyModelsProvider
        /// </summary>
        public ConfigNodePropertyString OrgApacheSlingScriptingSightlyModelsProvider { get; private set; }

        /// <summary>
        /// OrgApacheSlingSecurity
        /// </summary>
        public ConfigNodePropertyString OrgApacheSlingSecurity { get; private set; }

        /// <summary>
        /// OrgApacheSlingServletsCompat
        /// </summary>
        public ConfigNodePropertyString OrgApacheSlingServletsCompat { get; private set; }

        /// <summary>
        /// OrgApacheSlingServletsGet
        /// </summary>
        public ConfigNodePropertyString OrgApacheSlingServletsGet { get; private set; }

        /// <summary>
        /// OrgApacheSlingStartupfilterDisabler
        /// </summary>
        public ConfigNodePropertyString OrgApacheSlingStartupfilterDisabler { get; private set; }

        /// <summary>
        /// OrgApacheSlingTracer
        /// </summary>
        public ConfigNodePropertyString OrgApacheSlingTracer { get; private set; }

        /// <summary>
        /// WeRetailClientAppCore
        /// </summary>
        public ConfigNodePropertyString WeRetailClientAppCore { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties()
        {
        }

        private ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties(ConfigNodePropertyString ComAdobeCqCdnCdnRewriter, ConfigNodePropertyString ComAdobeCqCloudConfigComponents, ConfigNodePropertyString ComAdobeCqCloudConfigCore, ConfigNodePropertyString ComAdobeCqCloudConfigUi, ConfigNodePropertyString ComAdobeCqComAdobeCqEditor, ConfigNodePropertyString ComAdobeCqComAdobeCqProjectsCore, ConfigNodePropertyString ComAdobeCqComAdobeCqProjectsWcmCore, ConfigNodePropertyString ComAdobeCqComAdobeCqUiCommons, ConfigNodePropertyString ComAdobeCqComAdobeCqWcmStyle, ConfigNodePropertyString ComAdobeCqCqActivitymapIntegration, ConfigNodePropertyString ComAdobeCqCqContexthubCommons, ConfigNodePropertyString ComAdobeCqCqDtm, ConfigNodePropertyString ComAdobeCqCqHealthcheck, ConfigNodePropertyString ComAdobeCqCqMultisiteTargeting, ConfigNodePropertyString ComAdobeCqCqPreUpgradeCleanup, ConfigNodePropertyString ComAdobeCqCqProductInfoProvider, ConfigNodePropertyString ComAdobeCqCqRestSites, ConfigNodePropertyString ComAdobeCqCqSecurityHc, ConfigNodePropertyString ComAdobeCqDamCqDamSvgHandler, ConfigNodePropertyString ComAdobeCqDamCqScene7Imaging, ConfigNodePropertyString ComAdobeCqDtmReactorCore, ConfigNodePropertyString ComAdobeCqDtmReactorUi, ConfigNodePropertyString ComAdobeCqExpJspelResolver, ConfigNodePropertyString ComAdobeCqInboxCqInbox, ConfigNodePropertyString ComAdobeCqJsonSchemaParser, ConfigNodePropertyString ComAdobeCqMediaCqMediaPublishingDpsFpCore, ConfigNodePropertyString ComAdobeCqMobileCqMobileCaas, ConfigNodePropertyString ComAdobeCqMobileCqMobileIndexBuilder, ConfigNodePropertyString ComAdobeCqMobileCqMobilePhonegapBuild, ConfigNodePropertyString ComAdobeCqMyspell, ConfigNodePropertyString ComAdobeCqSampleWeRetailCore, ConfigNodePropertyString ComAdobeCqScreensComAdobeCqScreensDcc, ConfigNodePropertyString ComAdobeCqScreensComAdobeCqScreensMqCore, ConfigNodePropertyString ComAdobeCqSocialCqSocialAsProvider, ConfigNodePropertyString ComAdobeCqSocialCqSocialBadgingBasicImpl, ConfigNodePropertyString ComAdobeCqSocialCqSocialBadgingImpl, ConfigNodePropertyString ComAdobeCqSocialCqSocialCalendarImpl, ConfigNodePropertyString ComAdobeCqSocialCqSocialContentFragmentsImpl, ConfigNodePropertyString ComAdobeCqSocialCqSocialEnablementImpl, ConfigNodePropertyString ComAdobeCqSocialCqSocialGraphImpl, ConfigNodePropertyString ComAdobeCqSocialCqSocialIdeationImpl, ConfigNodePropertyString ComAdobeCqSocialCqSocialJcrProvider, ConfigNodePropertyString ComAdobeCqSocialCqSocialMembersImpl, ConfigNodePropertyString ComAdobeCqSocialCqSocialMsProvider, ConfigNodePropertyString ComAdobeCqSocialCqSocialNotificationsChannelsWeb, ConfigNodePropertyString ComAdobeCqSocialCqSocialNotificationsImpl, ConfigNodePropertyString ComAdobeCqSocialCqSocialRdbProvider, ConfigNodePropertyString ComAdobeCqSocialCqSocialScfImpl, ConfigNodePropertyString ComAdobeCqSocialCqSocialScoringBasicImpl, ConfigNodePropertyString ComAdobeCqSocialCqSocialScoringImpl, ConfigNodePropertyString ComAdobeCqSocialCqSocialServiceusersImpl, ConfigNodePropertyString ComAdobeCqSocialCqSocialSrpImpl, ConfigNodePropertyString ComAdobeCqSocialCqSocialUgcbaseImpl, ConfigNodePropertyString ComAdobeDamCqDamCfmImpl, ConfigNodePropertyString ComAdobeFormsFoundationFormsFoundationBase, ConfigNodePropertyString ComAdobeGraniteApicontroller, ConfigNodePropertyString ComAdobeGraniteAssetCore, ConfigNodePropertyString ComAdobeGraniteAuthSso, ConfigNodePropertyString ComAdobeGraniteBundlesHcImpl, ConfigNodePropertyString ComAdobeGraniteCompatRouter, ConfigNodePropertyString ComAdobeGraniteConf, ConfigNodePropertyString ComAdobeGraniteConfUiCore, ConfigNodePropertyString ComAdobeGraniteCors, ConfigNodePropertyString ComAdobeGraniteCrxExplorer, ConfigNodePropertyString ComAdobeGraniteCrxdeLite, ConfigNodePropertyString ComAdobeGraniteCryptoConfig, ConfigNodePropertyString ComAdobeGraniteCryptoExtension, ConfigNodePropertyString ComAdobeGraniteCryptoFile, ConfigNodePropertyString ComAdobeGraniteCryptoJcr, ConfigNodePropertyString ComAdobeGraniteCsrf, ConfigNodePropertyString ComAdobeGraniteDistributionCore, ConfigNodePropertyString ComAdobeGraniteDropwizardMetrics, ConfigNodePropertyString ComAdobeGraniteFragsImpl, ConfigNodePropertyString ComAdobeGraniteGibson, ConfigNodePropertyString ComAdobeGraniteInfocollector, ConfigNodePropertyString ComAdobeGraniteInstallerFactoryPackages, ConfigNodePropertyString ComAdobeGraniteJettySsl, ConfigNodePropertyString ComAdobeGraniteJobsAsync, ConfigNodePropertyString ComAdobeGraniteMaintenanceOak, ConfigNodePropertyString ComAdobeGraniteMonitoringCore, ConfigNodePropertyString ComAdobeGraniteQueries, ConfigNodePropertyString ComAdobeGraniteReplicationHcImpl, ConfigNodePropertyString ComAdobeGraniteRepositoryChecker, ConfigNodePropertyString ComAdobeGraniteRepositoryHcImpl, ConfigNodePropertyString ComAdobeGraniteRestAssets, ConfigNodePropertyString ComAdobeGraniteSecurityUi, ConfigNodePropertyString ComAdobeGraniteStartup, ConfigNodePropertyString ComAdobeGraniteTagsoup, ConfigNodePropertyString ComAdobeGraniteTaskmanagementCore, ConfigNodePropertyString ComAdobeGraniteTaskmanagementWorkflow, ConfigNodePropertyString ComAdobeGraniteUiClientlibsCompilerLess, ConfigNodePropertyString ComAdobeGraniteUiClientlibsProcessorGcc, ConfigNodePropertyString ComAdobeGraniteWebconsolePlugins, ConfigNodePropertyString ComAdobeGraniteWorkflowConsole, ConfigNodePropertyString ComAdobeXmpWorkerFilesNativeFragmentLinux, ConfigNodePropertyString ComAdobeXmpWorkerFilesNativeFragmentMacosx, ConfigNodePropertyString ComAdobeXmpWorkerFilesNativeFragmentWin, ConfigNodePropertyString ComDayCommonsOsgiWrapperSimpleJndi, ConfigNodePropertyString ComDayCqCqAuthhandler, ConfigNodePropertyString ComDayCqCqCompatConfigupdate, ConfigNodePropertyString ComDayCqCqLicensebranding, ConfigNodePropertyString ComDayCqCqNotifcationImpl, ConfigNodePropertyString ComDayCqCqReplicationAudit, ConfigNodePropertyString ComDayCqCqSearchExt, ConfigNodePropertyString ComDayCqDamCqDamAnnotationPrint, ConfigNodePropertyString ComDayCqDamCqDamAssetUsage, ConfigNodePropertyString ComDayCqDamCqDamS7dam, ConfigNodePropertyString ComDayCqDamCqDamSimilaritysearch, ConfigNodePropertyString ComDayCqDamDamWebdavSupport, ConfigNodePropertyString ComDayCqPreUpgradeTasks, ConfigNodePropertyString ComDayCqReplicationExtensions, ConfigNodePropertyString ComDayCqWcmCqMsmCore, ConfigNodePropertyString ComDayCqWcmCqWcmTranslation, ConfigNodePropertyString DayCommonsJrawio, ConfigNodePropertyString OrgApacheAriesJmxWhiteboard, ConfigNodePropertyString OrgApacheFelixHttpSslfilter, ConfigNodePropertyString OrgApacheFelixOrgApacheFelixThreaddump, ConfigNodePropertyString OrgApacheFelixWebconsolePluginsDs, ConfigNodePropertyString OrgApacheFelixWebconsolePluginsEvent, ConfigNodePropertyString OrgApacheFelixWebconsolePluginsMemoryusage, ConfigNodePropertyString OrgApacheFelixWebconsolePluginsPackageadmin, ConfigNodePropertyString OrgApacheJackrabbitOakAuthLdap, ConfigNodePropertyString OrgApacheJackrabbitOakSegmentTar, ConfigNodePropertyString OrgApacheJackrabbitOakSolrOsgi, ConfigNodePropertyString OrgApacheSlingBundleresourceImpl, ConfigNodePropertyString OrgApacheSlingCommonsFsclassloader, ConfigNodePropertyString OrgApacheSlingCommonsLogWebconsole, ConfigNodePropertyString OrgApacheSlingDatasource, ConfigNodePropertyString OrgApacheSlingDiscoveryBase, ConfigNodePropertyString OrgApacheSlingDiscoveryOak, ConfigNodePropertyString OrgApacheSlingDiscoverySupport, ConfigNodePropertyString OrgApacheSlingDistributionApi, ConfigNodePropertyString OrgApacheSlingDistributionCore, ConfigNodePropertyString OrgApacheSlingExtensionsWebconsolesecurityprovider, ConfigNodePropertyString OrgApacheSlingHcWebconsole, ConfigNodePropertyString OrgApacheSlingInstallerConsole, ConfigNodePropertyString OrgApacheSlingInstallerProviderFile, ConfigNodePropertyString OrgApacheSlingInstallerProviderJcr, ConfigNodePropertyString OrgApacheSlingJcrDavex, ConfigNodePropertyString OrgApacheSlingJcrResourcesecurity, ConfigNodePropertyString OrgApacheSlingJmxProvider, ConfigNodePropertyString OrgApacheSlingLaunchpadInstaller, ConfigNodePropertyString OrgApacheSlingModelsImpl, ConfigNodePropertyString OrgApacheSlingRepoinitParser, ConfigNodePropertyString OrgApacheSlingResourceInventory, ConfigNodePropertyString OrgApacheSlingResourceresolver, ConfigNodePropertyString OrgApacheSlingScriptingJavascript, ConfigNodePropertyString OrgApacheSlingScriptingJst, ConfigNodePropertyString OrgApacheSlingScriptingSightlyJsProvider, ConfigNodePropertyString OrgApacheSlingScriptingSightlyModelsProvider, ConfigNodePropertyString OrgApacheSlingSecurity, ConfigNodePropertyString OrgApacheSlingServletsCompat, ConfigNodePropertyString OrgApacheSlingServletsGet, ConfigNodePropertyString OrgApacheSlingStartupfilterDisabler, ConfigNodePropertyString OrgApacheSlingTracer, ConfigNodePropertyString WeRetailClientAppCore)
        {
            
            this.ComAdobeCqCdnCdnRewriter = ComAdobeCqCdnCdnRewriter;
            
            this.ComAdobeCqCloudConfigComponents = ComAdobeCqCloudConfigComponents;
            
            this.ComAdobeCqCloudConfigCore = ComAdobeCqCloudConfigCore;
            
            this.ComAdobeCqCloudConfigUi = ComAdobeCqCloudConfigUi;
            
            this.ComAdobeCqComAdobeCqEditor = ComAdobeCqComAdobeCqEditor;
            
            this.ComAdobeCqComAdobeCqProjectsCore = ComAdobeCqComAdobeCqProjectsCore;
            
            this.ComAdobeCqComAdobeCqProjectsWcmCore = ComAdobeCqComAdobeCqProjectsWcmCore;
            
            this.ComAdobeCqComAdobeCqUiCommons = ComAdobeCqComAdobeCqUiCommons;
            
            this.ComAdobeCqComAdobeCqWcmStyle = ComAdobeCqComAdobeCqWcmStyle;
            
            this.ComAdobeCqCqActivitymapIntegration = ComAdobeCqCqActivitymapIntegration;
            
            this.ComAdobeCqCqContexthubCommons = ComAdobeCqCqContexthubCommons;
            
            this.ComAdobeCqCqDtm = ComAdobeCqCqDtm;
            
            this.ComAdobeCqCqHealthcheck = ComAdobeCqCqHealthcheck;
            
            this.ComAdobeCqCqMultisiteTargeting = ComAdobeCqCqMultisiteTargeting;
            
            this.ComAdobeCqCqPreUpgradeCleanup = ComAdobeCqCqPreUpgradeCleanup;
            
            this.ComAdobeCqCqProductInfoProvider = ComAdobeCqCqProductInfoProvider;
            
            this.ComAdobeCqCqRestSites = ComAdobeCqCqRestSites;
            
            this.ComAdobeCqCqSecurityHc = ComAdobeCqCqSecurityHc;
            
            this.ComAdobeCqDamCqDamSvgHandler = ComAdobeCqDamCqDamSvgHandler;
            
            this.ComAdobeCqDamCqScene7Imaging = ComAdobeCqDamCqScene7Imaging;
            
            this.ComAdobeCqDtmReactorCore = ComAdobeCqDtmReactorCore;
            
            this.ComAdobeCqDtmReactorUi = ComAdobeCqDtmReactorUi;
            
            this.ComAdobeCqExpJspelResolver = ComAdobeCqExpJspelResolver;
            
            this.ComAdobeCqInboxCqInbox = ComAdobeCqInboxCqInbox;
            
            this.ComAdobeCqJsonSchemaParser = ComAdobeCqJsonSchemaParser;
            
            this.ComAdobeCqMediaCqMediaPublishingDpsFpCore = ComAdobeCqMediaCqMediaPublishingDpsFpCore;
            
            this.ComAdobeCqMobileCqMobileCaas = ComAdobeCqMobileCqMobileCaas;
            
            this.ComAdobeCqMobileCqMobileIndexBuilder = ComAdobeCqMobileCqMobileIndexBuilder;
            
            this.ComAdobeCqMobileCqMobilePhonegapBuild = ComAdobeCqMobileCqMobilePhonegapBuild;
            
            this.ComAdobeCqMyspell = ComAdobeCqMyspell;
            
            this.ComAdobeCqSampleWeRetailCore = ComAdobeCqSampleWeRetailCore;
            
            this.ComAdobeCqScreensComAdobeCqScreensDcc = ComAdobeCqScreensComAdobeCqScreensDcc;
            
            this.ComAdobeCqScreensComAdobeCqScreensMqCore = ComAdobeCqScreensComAdobeCqScreensMqCore;
            
            this.ComAdobeCqSocialCqSocialAsProvider = ComAdobeCqSocialCqSocialAsProvider;
            
            this.ComAdobeCqSocialCqSocialBadgingBasicImpl = ComAdobeCqSocialCqSocialBadgingBasicImpl;
            
            this.ComAdobeCqSocialCqSocialBadgingImpl = ComAdobeCqSocialCqSocialBadgingImpl;
            
            this.ComAdobeCqSocialCqSocialCalendarImpl = ComAdobeCqSocialCqSocialCalendarImpl;
            
            this.ComAdobeCqSocialCqSocialContentFragmentsImpl = ComAdobeCqSocialCqSocialContentFragmentsImpl;
            
            this.ComAdobeCqSocialCqSocialEnablementImpl = ComAdobeCqSocialCqSocialEnablementImpl;
            
            this.ComAdobeCqSocialCqSocialGraphImpl = ComAdobeCqSocialCqSocialGraphImpl;
            
            this.ComAdobeCqSocialCqSocialIdeationImpl = ComAdobeCqSocialCqSocialIdeationImpl;
            
            this.ComAdobeCqSocialCqSocialJcrProvider = ComAdobeCqSocialCqSocialJcrProvider;
            
            this.ComAdobeCqSocialCqSocialMembersImpl = ComAdobeCqSocialCqSocialMembersImpl;
            
            this.ComAdobeCqSocialCqSocialMsProvider = ComAdobeCqSocialCqSocialMsProvider;
            
            this.ComAdobeCqSocialCqSocialNotificationsChannelsWeb = ComAdobeCqSocialCqSocialNotificationsChannelsWeb;
            
            this.ComAdobeCqSocialCqSocialNotificationsImpl = ComAdobeCqSocialCqSocialNotificationsImpl;
            
            this.ComAdobeCqSocialCqSocialRdbProvider = ComAdobeCqSocialCqSocialRdbProvider;
            
            this.ComAdobeCqSocialCqSocialScfImpl = ComAdobeCqSocialCqSocialScfImpl;
            
            this.ComAdobeCqSocialCqSocialScoringBasicImpl = ComAdobeCqSocialCqSocialScoringBasicImpl;
            
            this.ComAdobeCqSocialCqSocialScoringImpl = ComAdobeCqSocialCqSocialScoringImpl;
            
            this.ComAdobeCqSocialCqSocialServiceusersImpl = ComAdobeCqSocialCqSocialServiceusersImpl;
            
            this.ComAdobeCqSocialCqSocialSrpImpl = ComAdobeCqSocialCqSocialSrpImpl;
            
            this.ComAdobeCqSocialCqSocialUgcbaseImpl = ComAdobeCqSocialCqSocialUgcbaseImpl;
            
            this.ComAdobeDamCqDamCfmImpl = ComAdobeDamCqDamCfmImpl;
            
            this.ComAdobeFormsFoundationFormsFoundationBase = ComAdobeFormsFoundationFormsFoundationBase;
            
            this.ComAdobeGraniteApicontroller = ComAdobeGraniteApicontroller;
            
            this.ComAdobeGraniteAssetCore = ComAdobeGraniteAssetCore;
            
            this.ComAdobeGraniteAuthSso = ComAdobeGraniteAuthSso;
            
            this.ComAdobeGraniteBundlesHcImpl = ComAdobeGraniteBundlesHcImpl;
            
            this.ComAdobeGraniteCompatRouter = ComAdobeGraniteCompatRouter;
            
            this.ComAdobeGraniteConf = ComAdobeGraniteConf;
            
            this.ComAdobeGraniteConfUiCore = ComAdobeGraniteConfUiCore;
            
            this.ComAdobeGraniteCors = ComAdobeGraniteCors;
            
            this.ComAdobeGraniteCrxExplorer = ComAdobeGraniteCrxExplorer;
            
            this.ComAdobeGraniteCrxdeLite = ComAdobeGraniteCrxdeLite;
            
            this.ComAdobeGraniteCryptoConfig = ComAdobeGraniteCryptoConfig;
            
            this.ComAdobeGraniteCryptoExtension = ComAdobeGraniteCryptoExtension;
            
            this.ComAdobeGraniteCryptoFile = ComAdobeGraniteCryptoFile;
            
            this.ComAdobeGraniteCryptoJcr = ComAdobeGraniteCryptoJcr;
            
            this.ComAdobeGraniteCsrf = ComAdobeGraniteCsrf;
            
            this.ComAdobeGraniteDistributionCore = ComAdobeGraniteDistributionCore;
            
            this.ComAdobeGraniteDropwizardMetrics = ComAdobeGraniteDropwizardMetrics;
            
            this.ComAdobeGraniteFragsImpl = ComAdobeGraniteFragsImpl;
            
            this.ComAdobeGraniteGibson = ComAdobeGraniteGibson;
            
            this.ComAdobeGraniteInfocollector = ComAdobeGraniteInfocollector;
            
            this.ComAdobeGraniteInstallerFactoryPackages = ComAdobeGraniteInstallerFactoryPackages;
            
            this.ComAdobeGraniteJettySsl = ComAdobeGraniteJettySsl;
            
            this.ComAdobeGraniteJobsAsync = ComAdobeGraniteJobsAsync;
            
            this.ComAdobeGraniteMaintenanceOak = ComAdobeGraniteMaintenanceOak;
            
            this.ComAdobeGraniteMonitoringCore = ComAdobeGraniteMonitoringCore;
            
            this.ComAdobeGraniteQueries = ComAdobeGraniteQueries;
            
            this.ComAdobeGraniteReplicationHcImpl = ComAdobeGraniteReplicationHcImpl;
            
            this.ComAdobeGraniteRepositoryChecker = ComAdobeGraniteRepositoryChecker;
            
            this.ComAdobeGraniteRepositoryHcImpl = ComAdobeGraniteRepositoryHcImpl;
            
            this.ComAdobeGraniteRestAssets = ComAdobeGraniteRestAssets;
            
            this.ComAdobeGraniteSecurityUi = ComAdobeGraniteSecurityUi;
            
            this.ComAdobeGraniteStartup = ComAdobeGraniteStartup;
            
            this.ComAdobeGraniteTagsoup = ComAdobeGraniteTagsoup;
            
            this.ComAdobeGraniteTaskmanagementCore = ComAdobeGraniteTaskmanagementCore;
            
            this.ComAdobeGraniteTaskmanagementWorkflow = ComAdobeGraniteTaskmanagementWorkflow;
            
            this.ComAdobeGraniteUiClientlibsCompilerLess = ComAdobeGraniteUiClientlibsCompilerLess;
            
            this.ComAdobeGraniteUiClientlibsProcessorGcc = ComAdobeGraniteUiClientlibsProcessorGcc;
            
            this.ComAdobeGraniteWebconsolePlugins = ComAdobeGraniteWebconsolePlugins;
            
            this.ComAdobeGraniteWorkflowConsole = ComAdobeGraniteWorkflowConsole;
            
            this.ComAdobeXmpWorkerFilesNativeFragmentLinux = ComAdobeXmpWorkerFilesNativeFragmentLinux;
            
            this.ComAdobeXmpWorkerFilesNativeFragmentMacosx = ComAdobeXmpWorkerFilesNativeFragmentMacosx;
            
            this.ComAdobeXmpWorkerFilesNativeFragmentWin = ComAdobeXmpWorkerFilesNativeFragmentWin;
            
            this.ComDayCommonsOsgiWrapperSimpleJndi = ComDayCommonsOsgiWrapperSimpleJndi;
            
            this.ComDayCqCqAuthhandler = ComDayCqCqAuthhandler;
            
            this.ComDayCqCqCompatConfigupdate = ComDayCqCqCompatConfigupdate;
            
            this.ComDayCqCqLicensebranding = ComDayCqCqLicensebranding;
            
            this.ComDayCqCqNotifcationImpl = ComDayCqCqNotifcationImpl;
            
            this.ComDayCqCqReplicationAudit = ComDayCqCqReplicationAudit;
            
            this.ComDayCqCqSearchExt = ComDayCqCqSearchExt;
            
            this.ComDayCqDamCqDamAnnotationPrint = ComDayCqDamCqDamAnnotationPrint;
            
            this.ComDayCqDamCqDamAssetUsage = ComDayCqDamCqDamAssetUsage;
            
            this.ComDayCqDamCqDamS7dam = ComDayCqDamCqDamS7dam;
            
            this.ComDayCqDamCqDamSimilaritysearch = ComDayCqDamCqDamSimilaritysearch;
            
            this.ComDayCqDamDamWebdavSupport = ComDayCqDamDamWebdavSupport;
            
            this.ComDayCqPreUpgradeTasks = ComDayCqPreUpgradeTasks;
            
            this.ComDayCqReplicationExtensions = ComDayCqReplicationExtensions;
            
            this.ComDayCqWcmCqMsmCore = ComDayCqWcmCqMsmCore;
            
            this.ComDayCqWcmCqWcmTranslation = ComDayCqWcmCqWcmTranslation;
            
            this.DayCommonsJrawio = DayCommonsJrawio;
            
            this.OrgApacheAriesJmxWhiteboard = OrgApacheAriesJmxWhiteboard;
            
            this.OrgApacheFelixHttpSslfilter = OrgApacheFelixHttpSslfilter;
            
            this.OrgApacheFelixOrgApacheFelixThreaddump = OrgApacheFelixOrgApacheFelixThreaddump;
            
            this.OrgApacheFelixWebconsolePluginsDs = OrgApacheFelixWebconsolePluginsDs;
            
            this.OrgApacheFelixWebconsolePluginsEvent = OrgApacheFelixWebconsolePluginsEvent;
            
            this.OrgApacheFelixWebconsolePluginsMemoryusage = OrgApacheFelixWebconsolePluginsMemoryusage;
            
            this.OrgApacheFelixWebconsolePluginsPackageadmin = OrgApacheFelixWebconsolePluginsPackageadmin;
            
            this.OrgApacheJackrabbitOakAuthLdap = OrgApacheJackrabbitOakAuthLdap;
            
            this.OrgApacheJackrabbitOakSegmentTar = OrgApacheJackrabbitOakSegmentTar;
            
            this.OrgApacheJackrabbitOakSolrOsgi = OrgApacheJackrabbitOakSolrOsgi;
            
            this.OrgApacheSlingBundleresourceImpl = OrgApacheSlingBundleresourceImpl;
            
            this.OrgApacheSlingCommonsFsclassloader = OrgApacheSlingCommonsFsclassloader;
            
            this.OrgApacheSlingCommonsLogWebconsole = OrgApacheSlingCommonsLogWebconsole;
            
            this.OrgApacheSlingDatasource = OrgApacheSlingDatasource;
            
            this.OrgApacheSlingDiscoveryBase = OrgApacheSlingDiscoveryBase;
            
            this.OrgApacheSlingDiscoveryOak = OrgApacheSlingDiscoveryOak;
            
            this.OrgApacheSlingDiscoverySupport = OrgApacheSlingDiscoverySupport;
            
            this.OrgApacheSlingDistributionApi = OrgApacheSlingDistributionApi;
            
            this.OrgApacheSlingDistributionCore = OrgApacheSlingDistributionCore;
            
            this.OrgApacheSlingExtensionsWebconsolesecurityprovider = OrgApacheSlingExtensionsWebconsolesecurityprovider;
            
            this.OrgApacheSlingHcWebconsole = OrgApacheSlingHcWebconsole;
            
            this.OrgApacheSlingInstallerConsole = OrgApacheSlingInstallerConsole;
            
            this.OrgApacheSlingInstallerProviderFile = OrgApacheSlingInstallerProviderFile;
            
            this.OrgApacheSlingInstallerProviderJcr = OrgApacheSlingInstallerProviderJcr;
            
            this.OrgApacheSlingJcrDavex = OrgApacheSlingJcrDavex;
            
            this.OrgApacheSlingJcrResourcesecurity = OrgApacheSlingJcrResourcesecurity;
            
            this.OrgApacheSlingJmxProvider = OrgApacheSlingJmxProvider;
            
            this.OrgApacheSlingLaunchpadInstaller = OrgApacheSlingLaunchpadInstaller;
            
            this.OrgApacheSlingModelsImpl = OrgApacheSlingModelsImpl;
            
            this.OrgApacheSlingRepoinitParser = OrgApacheSlingRepoinitParser;
            
            this.OrgApacheSlingResourceInventory = OrgApacheSlingResourceInventory;
            
            this.OrgApacheSlingResourceresolver = OrgApacheSlingResourceresolver;
            
            this.OrgApacheSlingScriptingJavascript = OrgApacheSlingScriptingJavascript;
            
            this.OrgApacheSlingScriptingJst = OrgApacheSlingScriptingJst;
            
            this.OrgApacheSlingScriptingSightlyJsProvider = OrgApacheSlingScriptingSightlyJsProvider;
            
            this.OrgApacheSlingScriptingSightlyModelsProvider = OrgApacheSlingScriptingSightlyModelsProvider;
            
            this.OrgApacheSlingSecurity = OrgApacheSlingSecurity;
            
            this.OrgApacheSlingServletsCompat = OrgApacheSlingServletsCompat;
            
            this.OrgApacheSlingServletsGet = OrgApacheSlingServletsGet;
            
            this.OrgApacheSlingStartupfilterDisabler = OrgApacheSlingStartupfilterDisabler;
            
            this.OrgApacheSlingTracer = OrgApacheSlingTracer;
            
            this.WeRetailClientAppCore = WeRetailClientAppCore;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.
        /// </summary>
        /// <returns>ComAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesBuilder</returns>
        public static ComAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesBuilder Builder()
        {
            return new ComAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesBuilder</returns>
        public ComAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesBuilder With()
        {
            return Builder()
                .ComAdobeCqCdnCdnRewriter(ComAdobeCqCdnCdnRewriter)
                .ComAdobeCqCloudConfigComponents(ComAdobeCqCloudConfigComponents)
                .ComAdobeCqCloudConfigCore(ComAdobeCqCloudConfigCore)
                .ComAdobeCqCloudConfigUi(ComAdobeCqCloudConfigUi)
                .ComAdobeCqComAdobeCqEditor(ComAdobeCqComAdobeCqEditor)
                .ComAdobeCqComAdobeCqProjectsCore(ComAdobeCqComAdobeCqProjectsCore)
                .ComAdobeCqComAdobeCqProjectsWcmCore(ComAdobeCqComAdobeCqProjectsWcmCore)
                .ComAdobeCqComAdobeCqUiCommons(ComAdobeCqComAdobeCqUiCommons)
                .ComAdobeCqComAdobeCqWcmStyle(ComAdobeCqComAdobeCqWcmStyle)
                .ComAdobeCqCqActivitymapIntegration(ComAdobeCqCqActivitymapIntegration)
                .ComAdobeCqCqContexthubCommons(ComAdobeCqCqContexthubCommons)
                .ComAdobeCqCqDtm(ComAdobeCqCqDtm)
                .ComAdobeCqCqHealthcheck(ComAdobeCqCqHealthcheck)
                .ComAdobeCqCqMultisiteTargeting(ComAdobeCqCqMultisiteTargeting)
                .ComAdobeCqCqPreUpgradeCleanup(ComAdobeCqCqPreUpgradeCleanup)
                .ComAdobeCqCqProductInfoProvider(ComAdobeCqCqProductInfoProvider)
                .ComAdobeCqCqRestSites(ComAdobeCqCqRestSites)
                .ComAdobeCqCqSecurityHc(ComAdobeCqCqSecurityHc)
                .ComAdobeCqDamCqDamSvgHandler(ComAdobeCqDamCqDamSvgHandler)
                .ComAdobeCqDamCqScene7Imaging(ComAdobeCqDamCqScene7Imaging)
                .ComAdobeCqDtmReactorCore(ComAdobeCqDtmReactorCore)
                .ComAdobeCqDtmReactorUi(ComAdobeCqDtmReactorUi)
                .ComAdobeCqExpJspelResolver(ComAdobeCqExpJspelResolver)
                .ComAdobeCqInboxCqInbox(ComAdobeCqInboxCqInbox)
                .ComAdobeCqJsonSchemaParser(ComAdobeCqJsonSchemaParser)
                .ComAdobeCqMediaCqMediaPublishingDpsFpCore(ComAdobeCqMediaCqMediaPublishingDpsFpCore)
                .ComAdobeCqMobileCqMobileCaas(ComAdobeCqMobileCqMobileCaas)
                .ComAdobeCqMobileCqMobileIndexBuilder(ComAdobeCqMobileCqMobileIndexBuilder)
                .ComAdobeCqMobileCqMobilePhonegapBuild(ComAdobeCqMobileCqMobilePhonegapBuild)
                .ComAdobeCqMyspell(ComAdobeCqMyspell)
                .ComAdobeCqSampleWeRetailCore(ComAdobeCqSampleWeRetailCore)
                .ComAdobeCqScreensComAdobeCqScreensDcc(ComAdobeCqScreensComAdobeCqScreensDcc)
                .ComAdobeCqScreensComAdobeCqScreensMqCore(ComAdobeCqScreensComAdobeCqScreensMqCore)
                .ComAdobeCqSocialCqSocialAsProvider(ComAdobeCqSocialCqSocialAsProvider)
                .ComAdobeCqSocialCqSocialBadgingBasicImpl(ComAdobeCqSocialCqSocialBadgingBasicImpl)
                .ComAdobeCqSocialCqSocialBadgingImpl(ComAdobeCqSocialCqSocialBadgingImpl)
                .ComAdobeCqSocialCqSocialCalendarImpl(ComAdobeCqSocialCqSocialCalendarImpl)
                .ComAdobeCqSocialCqSocialContentFragmentsImpl(ComAdobeCqSocialCqSocialContentFragmentsImpl)
                .ComAdobeCqSocialCqSocialEnablementImpl(ComAdobeCqSocialCqSocialEnablementImpl)
                .ComAdobeCqSocialCqSocialGraphImpl(ComAdobeCqSocialCqSocialGraphImpl)
                .ComAdobeCqSocialCqSocialIdeationImpl(ComAdobeCqSocialCqSocialIdeationImpl)
                .ComAdobeCqSocialCqSocialJcrProvider(ComAdobeCqSocialCqSocialJcrProvider)
                .ComAdobeCqSocialCqSocialMembersImpl(ComAdobeCqSocialCqSocialMembersImpl)
                .ComAdobeCqSocialCqSocialMsProvider(ComAdobeCqSocialCqSocialMsProvider)
                .ComAdobeCqSocialCqSocialNotificationsChannelsWeb(ComAdobeCqSocialCqSocialNotificationsChannelsWeb)
                .ComAdobeCqSocialCqSocialNotificationsImpl(ComAdobeCqSocialCqSocialNotificationsImpl)
                .ComAdobeCqSocialCqSocialRdbProvider(ComAdobeCqSocialCqSocialRdbProvider)
                .ComAdobeCqSocialCqSocialScfImpl(ComAdobeCqSocialCqSocialScfImpl)
                .ComAdobeCqSocialCqSocialScoringBasicImpl(ComAdobeCqSocialCqSocialScoringBasicImpl)
                .ComAdobeCqSocialCqSocialScoringImpl(ComAdobeCqSocialCqSocialScoringImpl)
                .ComAdobeCqSocialCqSocialServiceusersImpl(ComAdobeCqSocialCqSocialServiceusersImpl)
                .ComAdobeCqSocialCqSocialSrpImpl(ComAdobeCqSocialCqSocialSrpImpl)
                .ComAdobeCqSocialCqSocialUgcbaseImpl(ComAdobeCqSocialCqSocialUgcbaseImpl)
                .ComAdobeDamCqDamCfmImpl(ComAdobeDamCqDamCfmImpl)
                .ComAdobeFormsFoundationFormsFoundationBase(ComAdobeFormsFoundationFormsFoundationBase)
                .ComAdobeGraniteApicontroller(ComAdobeGraniteApicontroller)
                .ComAdobeGraniteAssetCore(ComAdobeGraniteAssetCore)
                .ComAdobeGraniteAuthSso(ComAdobeGraniteAuthSso)
                .ComAdobeGraniteBundlesHcImpl(ComAdobeGraniteBundlesHcImpl)
                .ComAdobeGraniteCompatRouter(ComAdobeGraniteCompatRouter)
                .ComAdobeGraniteConf(ComAdobeGraniteConf)
                .ComAdobeGraniteConfUiCore(ComAdobeGraniteConfUiCore)
                .ComAdobeGraniteCors(ComAdobeGraniteCors)
                .ComAdobeGraniteCrxExplorer(ComAdobeGraniteCrxExplorer)
                .ComAdobeGraniteCrxdeLite(ComAdobeGraniteCrxdeLite)
                .ComAdobeGraniteCryptoConfig(ComAdobeGraniteCryptoConfig)
                .ComAdobeGraniteCryptoExtension(ComAdobeGraniteCryptoExtension)
                .ComAdobeGraniteCryptoFile(ComAdobeGraniteCryptoFile)
                .ComAdobeGraniteCryptoJcr(ComAdobeGraniteCryptoJcr)
                .ComAdobeGraniteCsrf(ComAdobeGraniteCsrf)
                .ComAdobeGraniteDistributionCore(ComAdobeGraniteDistributionCore)
                .ComAdobeGraniteDropwizardMetrics(ComAdobeGraniteDropwizardMetrics)
                .ComAdobeGraniteFragsImpl(ComAdobeGraniteFragsImpl)
                .ComAdobeGraniteGibson(ComAdobeGraniteGibson)
                .ComAdobeGraniteInfocollector(ComAdobeGraniteInfocollector)
                .ComAdobeGraniteInstallerFactoryPackages(ComAdobeGraniteInstallerFactoryPackages)
                .ComAdobeGraniteJettySsl(ComAdobeGraniteJettySsl)
                .ComAdobeGraniteJobsAsync(ComAdobeGraniteJobsAsync)
                .ComAdobeGraniteMaintenanceOak(ComAdobeGraniteMaintenanceOak)
                .ComAdobeGraniteMonitoringCore(ComAdobeGraniteMonitoringCore)
                .ComAdobeGraniteQueries(ComAdobeGraniteQueries)
                .ComAdobeGraniteReplicationHcImpl(ComAdobeGraniteReplicationHcImpl)
                .ComAdobeGraniteRepositoryChecker(ComAdobeGraniteRepositoryChecker)
                .ComAdobeGraniteRepositoryHcImpl(ComAdobeGraniteRepositoryHcImpl)
                .ComAdobeGraniteRestAssets(ComAdobeGraniteRestAssets)
                .ComAdobeGraniteSecurityUi(ComAdobeGraniteSecurityUi)
                .ComAdobeGraniteStartup(ComAdobeGraniteStartup)
                .ComAdobeGraniteTagsoup(ComAdobeGraniteTagsoup)
                .ComAdobeGraniteTaskmanagementCore(ComAdobeGraniteTaskmanagementCore)
                .ComAdobeGraniteTaskmanagementWorkflow(ComAdobeGraniteTaskmanagementWorkflow)
                .ComAdobeGraniteUiClientlibsCompilerLess(ComAdobeGraniteUiClientlibsCompilerLess)
                .ComAdobeGraniteUiClientlibsProcessorGcc(ComAdobeGraniteUiClientlibsProcessorGcc)
                .ComAdobeGraniteWebconsolePlugins(ComAdobeGraniteWebconsolePlugins)
                .ComAdobeGraniteWorkflowConsole(ComAdobeGraniteWorkflowConsole)
                .ComAdobeXmpWorkerFilesNativeFragmentLinux(ComAdobeXmpWorkerFilesNativeFragmentLinux)
                .ComAdobeXmpWorkerFilesNativeFragmentMacosx(ComAdobeXmpWorkerFilesNativeFragmentMacosx)
                .ComAdobeXmpWorkerFilesNativeFragmentWin(ComAdobeXmpWorkerFilesNativeFragmentWin)
                .ComDayCommonsOsgiWrapperSimpleJndi(ComDayCommonsOsgiWrapperSimpleJndi)
                .ComDayCqCqAuthhandler(ComDayCqCqAuthhandler)
                .ComDayCqCqCompatConfigupdate(ComDayCqCqCompatConfigupdate)
                .ComDayCqCqLicensebranding(ComDayCqCqLicensebranding)
                .ComDayCqCqNotifcationImpl(ComDayCqCqNotifcationImpl)
                .ComDayCqCqReplicationAudit(ComDayCqCqReplicationAudit)
                .ComDayCqCqSearchExt(ComDayCqCqSearchExt)
                .ComDayCqDamCqDamAnnotationPrint(ComDayCqDamCqDamAnnotationPrint)
                .ComDayCqDamCqDamAssetUsage(ComDayCqDamCqDamAssetUsage)
                .ComDayCqDamCqDamS7dam(ComDayCqDamCqDamS7dam)
                .ComDayCqDamCqDamSimilaritysearch(ComDayCqDamCqDamSimilaritysearch)
                .ComDayCqDamDamWebdavSupport(ComDayCqDamDamWebdavSupport)
                .ComDayCqPreUpgradeTasks(ComDayCqPreUpgradeTasks)
                .ComDayCqReplicationExtensions(ComDayCqReplicationExtensions)
                .ComDayCqWcmCqMsmCore(ComDayCqWcmCqMsmCore)
                .ComDayCqWcmCqWcmTranslation(ComDayCqWcmCqWcmTranslation)
                .DayCommonsJrawio(DayCommonsJrawio)
                .OrgApacheAriesJmxWhiteboard(OrgApacheAriesJmxWhiteboard)
                .OrgApacheFelixHttpSslfilter(OrgApacheFelixHttpSslfilter)
                .OrgApacheFelixOrgApacheFelixThreaddump(OrgApacheFelixOrgApacheFelixThreaddump)
                .OrgApacheFelixWebconsolePluginsDs(OrgApacheFelixWebconsolePluginsDs)
                .OrgApacheFelixWebconsolePluginsEvent(OrgApacheFelixWebconsolePluginsEvent)
                .OrgApacheFelixWebconsolePluginsMemoryusage(OrgApacheFelixWebconsolePluginsMemoryusage)
                .OrgApacheFelixWebconsolePluginsPackageadmin(OrgApacheFelixWebconsolePluginsPackageadmin)
                .OrgApacheJackrabbitOakAuthLdap(OrgApacheJackrabbitOakAuthLdap)
                .OrgApacheJackrabbitOakSegmentTar(OrgApacheJackrabbitOakSegmentTar)
                .OrgApacheJackrabbitOakSolrOsgi(OrgApacheJackrabbitOakSolrOsgi)
                .OrgApacheSlingBundleresourceImpl(OrgApacheSlingBundleresourceImpl)
                .OrgApacheSlingCommonsFsclassloader(OrgApacheSlingCommonsFsclassloader)
                .OrgApacheSlingCommonsLogWebconsole(OrgApacheSlingCommonsLogWebconsole)
                .OrgApacheSlingDatasource(OrgApacheSlingDatasource)
                .OrgApacheSlingDiscoveryBase(OrgApacheSlingDiscoveryBase)
                .OrgApacheSlingDiscoveryOak(OrgApacheSlingDiscoveryOak)
                .OrgApacheSlingDiscoverySupport(OrgApacheSlingDiscoverySupport)
                .OrgApacheSlingDistributionApi(OrgApacheSlingDistributionApi)
                .OrgApacheSlingDistributionCore(OrgApacheSlingDistributionCore)
                .OrgApacheSlingExtensionsWebconsolesecurityprovider(OrgApacheSlingExtensionsWebconsolesecurityprovider)
                .OrgApacheSlingHcWebconsole(OrgApacheSlingHcWebconsole)
                .OrgApacheSlingInstallerConsole(OrgApacheSlingInstallerConsole)
                .OrgApacheSlingInstallerProviderFile(OrgApacheSlingInstallerProviderFile)
                .OrgApacheSlingInstallerProviderJcr(OrgApacheSlingInstallerProviderJcr)
                .OrgApacheSlingJcrDavex(OrgApacheSlingJcrDavex)
                .OrgApacheSlingJcrResourcesecurity(OrgApacheSlingJcrResourcesecurity)
                .OrgApacheSlingJmxProvider(OrgApacheSlingJmxProvider)
                .OrgApacheSlingLaunchpadInstaller(OrgApacheSlingLaunchpadInstaller)
                .OrgApacheSlingModelsImpl(OrgApacheSlingModelsImpl)
                .OrgApacheSlingRepoinitParser(OrgApacheSlingRepoinitParser)
                .OrgApacheSlingResourceInventory(OrgApacheSlingResourceInventory)
                .OrgApacheSlingResourceresolver(OrgApacheSlingResourceresolver)
                .OrgApacheSlingScriptingJavascript(OrgApacheSlingScriptingJavascript)
                .OrgApacheSlingScriptingJst(OrgApacheSlingScriptingJst)
                .OrgApacheSlingScriptingSightlyJsProvider(OrgApacheSlingScriptingSightlyJsProvider)
                .OrgApacheSlingScriptingSightlyModelsProvider(OrgApacheSlingScriptingSightlyModelsProvider)
                .OrgApacheSlingSecurity(OrgApacheSlingSecurity)
                .OrgApacheSlingServletsCompat(OrgApacheSlingServletsCompat)
                .OrgApacheSlingServletsGet(OrgApacheSlingServletsGet)
                .OrgApacheSlingStartupfilterDisabler(OrgApacheSlingStartupfilterDisabler)
                .OrgApacheSlingTracer(OrgApacheSlingTracer)
                .WeRetailClientAppCore(WeRetailClientAppCore);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties left, ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties left, ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.
        /// </summary>
        public sealed class ComAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesBuilder
        {
            private ConfigNodePropertyString _ComAdobeCqCdnCdnRewriter;
            private ConfigNodePropertyString _ComAdobeCqCloudConfigComponents;
            private ConfigNodePropertyString _ComAdobeCqCloudConfigCore;
            private ConfigNodePropertyString _ComAdobeCqCloudConfigUi;
            private ConfigNodePropertyString _ComAdobeCqComAdobeCqEditor;
            private ConfigNodePropertyString _ComAdobeCqComAdobeCqProjectsCore;
            private ConfigNodePropertyString _ComAdobeCqComAdobeCqProjectsWcmCore;
            private ConfigNodePropertyString _ComAdobeCqComAdobeCqUiCommons;
            private ConfigNodePropertyString _ComAdobeCqComAdobeCqWcmStyle;
            private ConfigNodePropertyString _ComAdobeCqCqActivitymapIntegration;
            private ConfigNodePropertyString _ComAdobeCqCqContexthubCommons;
            private ConfigNodePropertyString _ComAdobeCqCqDtm;
            private ConfigNodePropertyString _ComAdobeCqCqHealthcheck;
            private ConfigNodePropertyString _ComAdobeCqCqMultisiteTargeting;
            private ConfigNodePropertyString _ComAdobeCqCqPreUpgradeCleanup;
            private ConfigNodePropertyString _ComAdobeCqCqProductInfoProvider;
            private ConfigNodePropertyString _ComAdobeCqCqRestSites;
            private ConfigNodePropertyString _ComAdobeCqCqSecurityHc;
            private ConfigNodePropertyString _ComAdobeCqDamCqDamSvgHandler;
            private ConfigNodePropertyString _ComAdobeCqDamCqScene7Imaging;
            private ConfigNodePropertyString _ComAdobeCqDtmReactorCore;
            private ConfigNodePropertyString _ComAdobeCqDtmReactorUi;
            private ConfigNodePropertyString _ComAdobeCqExpJspelResolver;
            private ConfigNodePropertyString _ComAdobeCqInboxCqInbox;
            private ConfigNodePropertyString _ComAdobeCqJsonSchemaParser;
            private ConfigNodePropertyString _ComAdobeCqMediaCqMediaPublishingDpsFpCore;
            private ConfigNodePropertyString _ComAdobeCqMobileCqMobileCaas;
            private ConfigNodePropertyString _ComAdobeCqMobileCqMobileIndexBuilder;
            private ConfigNodePropertyString _ComAdobeCqMobileCqMobilePhonegapBuild;
            private ConfigNodePropertyString _ComAdobeCqMyspell;
            private ConfigNodePropertyString _ComAdobeCqSampleWeRetailCore;
            private ConfigNodePropertyString _ComAdobeCqScreensComAdobeCqScreensDcc;
            private ConfigNodePropertyString _ComAdobeCqScreensComAdobeCqScreensMqCore;
            private ConfigNodePropertyString _ComAdobeCqSocialCqSocialAsProvider;
            private ConfigNodePropertyString _ComAdobeCqSocialCqSocialBadgingBasicImpl;
            private ConfigNodePropertyString _ComAdobeCqSocialCqSocialBadgingImpl;
            private ConfigNodePropertyString _ComAdobeCqSocialCqSocialCalendarImpl;
            private ConfigNodePropertyString _ComAdobeCqSocialCqSocialContentFragmentsImpl;
            private ConfigNodePropertyString _ComAdobeCqSocialCqSocialEnablementImpl;
            private ConfigNodePropertyString _ComAdobeCqSocialCqSocialGraphImpl;
            private ConfigNodePropertyString _ComAdobeCqSocialCqSocialIdeationImpl;
            private ConfigNodePropertyString _ComAdobeCqSocialCqSocialJcrProvider;
            private ConfigNodePropertyString _ComAdobeCqSocialCqSocialMembersImpl;
            private ConfigNodePropertyString _ComAdobeCqSocialCqSocialMsProvider;
            private ConfigNodePropertyString _ComAdobeCqSocialCqSocialNotificationsChannelsWeb;
            private ConfigNodePropertyString _ComAdobeCqSocialCqSocialNotificationsImpl;
            private ConfigNodePropertyString _ComAdobeCqSocialCqSocialRdbProvider;
            private ConfigNodePropertyString _ComAdobeCqSocialCqSocialScfImpl;
            private ConfigNodePropertyString _ComAdobeCqSocialCqSocialScoringBasicImpl;
            private ConfigNodePropertyString _ComAdobeCqSocialCqSocialScoringImpl;
            private ConfigNodePropertyString _ComAdobeCqSocialCqSocialServiceusersImpl;
            private ConfigNodePropertyString _ComAdobeCqSocialCqSocialSrpImpl;
            private ConfigNodePropertyString _ComAdobeCqSocialCqSocialUgcbaseImpl;
            private ConfigNodePropertyString _ComAdobeDamCqDamCfmImpl;
            private ConfigNodePropertyString _ComAdobeFormsFoundationFormsFoundationBase;
            private ConfigNodePropertyString _ComAdobeGraniteApicontroller;
            private ConfigNodePropertyString _ComAdobeGraniteAssetCore;
            private ConfigNodePropertyString _ComAdobeGraniteAuthSso;
            private ConfigNodePropertyString _ComAdobeGraniteBundlesHcImpl;
            private ConfigNodePropertyString _ComAdobeGraniteCompatRouter;
            private ConfigNodePropertyString _ComAdobeGraniteConf;
            private ConfigNodePropertyString _ComAdobeGraniteConfUiCore;
            private ConfigNodePropertyString _ComAdobeGraniteCors;
            private ConfigNodePropertyString _ComAdobeGraniteCrxExplorer;
            private ConfigNodePropertyString _ComAdobeGraniteCrxdeLite;
            private ConfigNodePropertyString _ComAdobeGraniteCryptoConfig;
            private ConfigNodePropertyString _ComAdobeGraniteCryptoExtension;
            private ConfigNodePropertyString _ComAdobeGraniteCryptoFile;
            private ConfigNodePropertyString _ComAdobeGraniteCryptoJcr;
            private ConfigNodePropertyString _ComAdobeGraniteCsrf;
            private ConfigNodePropertyString _ComAdobeGraniteDistributionCore;
            private ConfigNodePropertyString _ComAdobeGraniteDropwizardMetrics;
            private ConfigNodePropertyString _ComAdobeGraniteFragsImpl;
            private ConfigNodePropertyString _ComAdobeGraniteGibson;
            private ConfigNodePropertyString _ComAdobeGraniteInfocollector;
            private ConfigNodePropertyString _ComAdobeGraniteInstallerFactoryPackages;
            private ConfigNodePropertyString _ComAdobeGraniteJettySsl;
            private ConfigNodePropertyString _ComAdobeGraniteJobsAsync;
            private ConfigNodePropertyString _ComAdobeGraniteMaintenanceOak;
            private ConfigNodePropertyString _ComAdobeGraniteMonitoringCore;
            private ConfigNodePropertyString _ComAdobeGraniteQueries;
            private ConfigNodePropertyString _ComAdobeGraniteReplicationHcImpl;
            private ConfigNodePropertyString _ComAdobeGraniteRepositoryChecker;
            private ConfigNodePropertyString _ComAdobeGraniteRepositoryHcImpl;
            private ConfigNodePropertyString _ComAdobeGraniteRestAssets;
            private ConfigNodePropertyString _ComAdobeGraniteSecurityUi;
            private ConfigNodePropertyString _ComAdobeGraniteStartup;
            private ConfigNodePropertyString _ComAdobeGraniteTagsoup;
            private ConfigNodePropertyString _ComAdobeGraniteTaskmanagementCore;
            private ConfigNodePropertyString _ComAdobeGraniteTaskmanagementWorkflow;
            private ConfigNodePropertyString _ComAdobeGraniteUiClientlibsCompilerLess;
            private ConfigNodePropertyString _ComAdobeGraniteUiClientlibsProcessorGcc;
            private ConfigNodePropertyString _ComAdobeGraniteWebconsolePlugins;
            private ConfigNodePropertyString _ComAdobeGraniteWorkflowConsole;
            private ConfigNodePropertyString _ComAdobeXmpWorkerFilesNativeFragmentLinux;
            private ConfigNodePropertyString _ComAdobeXmpWorkerFilesNativeFragmentMacosx;
            private ConfigNodePropertyString _ComAdobeXmpWorkerFilesNativeFragmentWin;
            private ConfigNodePropertyString _ComDayCommonsOsgiWrapperSimpleJndi;
            private ConfigNodePropertyString _ComDayCqCqAuthhandler;
            private ConfigNodePropertyString _ComDayCqCqCompatConfigupdate;
            private ConfigNodePropertyString _ComDayCqCqLicensebranding;
            private ConfigNodePropertyString _ComDayCqCqNotifcationImpl;
            private ConfigNodePropertyString _ComDayCqCqReplicationAudit;
            private ConfigNodePropertyString _ComDayCqCqSearchExt;
            private ConfigNodePropertyString _ComDayCqDamCqDamAnnotationPrint;
            private ConfigNodePropertyString _ComDayCqDamCqDamAssetUsage;
            private ConfigNodePropertyString _ComDayCqDamCqDamS7dam;
            private ConfigNodePropertyString _ComDayCqDamCqDamSimilaritysearch;
            private ConfigNodePropertyString _ComDayCqDamDamWebdavSupport;
            private ConfigNodePropertyString _ComDayCqPreUpgradeTasks;
            private ConfigNodePropertyString _ComDayCqReplicationExtensions;
            private ConfigNodePropertyString _ComDayCqWcmCqMsmCore;
            private ConfigNodePropertyString _ComDayCqWcmCqWcmTranslation;
            private ConfigNodePropertyString _DayCommonsJrawio;
            private ConfigNodePropertyString _OrgApacheAriesJmxWhiteboard;
            private ConfigNodePropertyString _OrgApacheFelixHttpSslfilter;
            private ConfigNodePropertyString _OrgApacheFelixOrgApacheFelixThreaddump;
            private ConfigNodePropertyString _OrgApacheFelixWebconsolePluginsDs;
            private ConfigNodePropertyString _OrgApacheFelixWebconsolePluginsEvent;
            private ConfigNodePropertyString _OrgApacheFelixWebconsolePluginsMemoryusage;
            private ConfigNodePropertyString _OrgApacheFelixWebconsolePluginsPackageadmin;
            private ConfigNodePropertyString _OrgApacheJackrabbitOakAuthLdap;
            private ConfigNodePropertyString _OrgApacheJackrabbitOakSegmentTar;
            private ConfigNodePropertyString _OrgApacheJackrabbitOakSolrOsgi;
            private ConfigNodePropertyString _OrgApacheSlingBundleresourceImpl;
            private ConfigNodePropertyString _OrgApacheSlingCommonsFsclassloader;
            private ConfigNodePropertyString _OrgApacheSlingCommonsLogWebconsole;
            private ConfigNodePropertyString _OrgApacheSlingDatasource;
            private ConfigNodePropertyString _OrgApacheSlingDiscoveryBase;
            private ConfigNodePropertyString _OrgApacheSlingDiscoveryOak;
            private ConfigNodePropertyString _OrgApacheSlingDiscoverySupport;
            private ConfigNodePropertyString _OrgApacheSlingDistributionApi;
            private ConfigNodePropertyString _OrgApacheSlingDistributionCore;
            private ConfigNodePropertyString _OrgApacheSlingExtensionsWebconsolesecurityprovider;
            private ConfigNodePropertyString _OrgApacheSlingHcWebconsole;
            private ConfigNodePropertyString _OrgApacheSlingInstallerConsole;
            private ConfigNodePropertyString _OrgApacheSlingInstallerProviderFile;
            private ConfigNodePropertyString _OrgApacheSlingInstallerProviderJcr;
            private ConfigNodePropertyString _OrgApacheSlingJcrDavex;
            private ConfigNodePropertyString _OrgApacheSlingJcrResourcesecurity;
            private ConfigNodePropertyString _OrgApacheSlingJmxProvider;
            private ConfigNodePropertyString _OrgApacheSlingLaunchpadInstaller;
            private ConfigNodePropertyString _OrgApacheSlingModelsImpl;
            private ConfigNodePropertyString _OrgApacheSlingRepoinitParser;
            private ConfigNodePropertyString _OrgApacheSlingResourceInventory;
            private ConfigNodePropertyString _OrgApacheSlingResourceresolver;
            private ConfigNodePropertyString _OrgApacheSlingScriptingJavascript;
            private ConfigNodePropertyString _OrgApacheSlingScriptingJst;
            private ConfigNodePropertyString _OrgApacheSlingScriptingSightlyJsProvider;
            private ConfigNodePropertyString _OrgApacheSlingScriptingSightlyModelsProvider;
            private ConfigNodePropertyString _OrgApacheSlingSecurity;
            private ConfigNodePropertyString _OrgApacheSlingServletsCompat;
            private ConfigNodePropertyString _OrgApacheSlingServletsGet;
            private ConfigNodePropertyString _OrgApacheSlingStartupfilterDisabler;
            private ConfigNodePropertyString _OrgApacheSlingTracer;
            private ConfigNodePropertyString _WeRetailClientAppCore;

            internal ComAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.ComAdobeCqCdnCdnRewriter property.
            /// </summary>
            /// <param name="value">ComAdobeCqCdnCdnRewriter</param>
            public ComAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesBuilder ComAdobeCqCdnCdnRewriter(ConfigNodePropertyString value)
            {
                _ComAdobeCqCdnCdnRewriter = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.ComAdobeCqCloudConfigComponents property.
            /// </summary>
            /// <param name="value">ComAdobeCqCloudConfigComponents</param>
            public ComAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesBuilder ComAdobeCqCloudConfigComponents(ConfigNodePropertyString value)
            {
                _ComAdobeCqCloudConfigComponents = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.ComAdobeCqCloudConfigCore property.
            /// </summary>
            /// <param name="value">ComAdobeCqCloudConfigCore</param>
            public ComAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesBuilder ComAdobeCqCloudConfigCore(ConfigNodePropertyString value)
            {
                _ComAdobeCqCloudConfigCore = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.ComAdobeCqCloudConfigUi property.
            /// </summary>
            /// <param name="value">ComAdobeCqCloudConfigUi</param>
            public ComAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesBuilder ComAdobeCqCloudConfigUi(ConfigNodePropertyString value)
            {
                _ComAdobeCqCloudConfigUi = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.ComAdobeCqComAdobeCqEditor property.
            /// </summary>
            /// <param name="value">ComAdobeCqComAdobeCqEditor</param>
            public ComAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesBuilder ComAdobeCqComAdobeCqEditor(ConfigNodePropertyString value)
            {
                _ComAdobeCqComAdobeCqEditor = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.ComAdobeCqComAdobeCqProjectsCore property.
            /// </summary>
            /// <param name="value">ComAdobeCqComAdobeCqProjectsCore</param>
            public ComAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesBuilder ComAdobeCqComAdobeCqProjectsCore(ConfigNodePropertyString value)
            {
                _ComAdobeCqComAdobeCqProjectsCore = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.ComAdobeCqComAdobeCqProjectsWcmCore property.
            /// </summary>
            /// <param name="value">ComAdobeCqComAdobeCqProjectsWcmCore</param>
            public ComAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesBuilder ComAdobeCqComAdobeCqProjectsWcmCore(ConfigNodePropertyString value)
            {
                _ComAdobeCqComAdobeCqProjectsWcmCore = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.ComAdobeCqComAdobeCqUiCommons property.
            /// </summary>
            /// <param name="value">ComAdobeCqComAdobeCqUiCommons</param>
            public ComAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesBuilder ComAdobeCqComAdobeCqUiCommons(ConfigNodePropertyString value)
            {
                _ComAdobeCqComAdobeCqUiCommons = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.ComAdobeCqComAdobeCqWcmStyle property.
            /// </summary>
            /// <param name="value">ComAdobeCqComAdobeCqWcmStyle</param>
            public ComAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesBuilder ComAdobeCqComAdobeCqWcmStyle(ConfigNodePropertyString value)
            {
                _ComAdobeCqComAdobeCqWcmStyle = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.ComAdobeCqCqActivitymapIntegration property.
            /// </summary>
            /// <param name="value">ComAdobeCqCqActivitymapIntegration</param>
            public ComAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesBuilder ComAdobeCqCqActivitymapIntegration(ConfigNodePropertyString value)
            {
                _ComAdobeCqCqActivitymapIntegration = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.ComAdobeCqCqContexthubCommons property.
            /// </summary>
            /// <param name="value">ComAdobeCqCqContexthubCommons</param>
            public ComAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesBuilder ComAdobeCqCqContexthubCommons(ConfigNodePropertyString value)
            {
                _ComAdobeCqCqContexthubCommons = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.ComAdobeCqCqDtm property.
            /// </summary>
            /// <param name="value">ComAdobeCqCqDtm</param>
            public ComAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesBuilder ComAdobeCqCqDtm(ConfigNodePropertyString value)
            {
                _ComAdobeCqCqDtm = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.ComAdobeCqCqHealthcheck property.
            /// </summary>
            /// <param name="value">ComAdobeCqCqHealthcheck</param>
            public ComAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesBuilder ComAdobeCqCqHealthcheck(ConfigNodePropertyString value)
            {
                _ComAdobeCqCqHealthcheck = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.ComAdobeCqCqMultisiteTargeting property.
            /// </summary>
            /// <param name="value">ComAdobeCqCqMultisiteTargeting</param>
            public ComAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesBuilder ComAdobeCqCqMultisiteTargeting(ConfigNodePropertyString value)
            {
                _ComAdobeCqCqMultisiteTargeting = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.ComAdobeCqCqPreUpgradeCleanup property.
            /// </summary>
            /// <param name="value">ComAdobeCqCqPreUpgradeCleanup</param>
            public ComAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesBuilder ComAdobeCqCqPreUpgradeCleanup(ConfigNodePropertyString value)
            {
                _ComAdobeCqCqPreUpgradeCleanup = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.ComAdobeCqCqProductInfoProvider property.
            /// </summary>
            /// <param name="value">ComAdobeCqCqProductInfoProvider</param>
            public ComAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesBuilder ComAdobeCqCqProductInfoProvider(ConfigNodePropertyString value)
            {
                _ComAdobeCqCqProductInfoProvider = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.ComAdobeCqCqRestSites property.
            /// </summary>
            /// <param name="value">ComAdobeCqCqRestSites</param>
            public ComAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesBuilder ComAdobeCqCqRestSites(ConfigNodePropertyString value)
            {
                _ComAdobeCqCqRestSites = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.ComAdobeCqCqSecurityHc property.
            /// </summary>
            /// <param name="value">ComAdobeCqCqSecurityHc</param>
            public ComAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesBuilder ComAdobeCqCqSecurityHc(ConfigNodePropertyString value)
            {
                _ComAdobeCqCqSecurityHc = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.ComAdobeCqDamCqDamSvgHandler property.
            /// </summary>
            /// <param name="value">ComAdobeCqDamCqDamSvgHandler</param>
            public ComAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesBuilder ComAdobeCqDamCqDamSvgHandler(ConfigNodePropertyString value)
            {
                _ComAdobeCqDamCqDamSvgHandler = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.ComAdobeCqDamCqScene7Imaging property.
            /// </summary>
            /// <param name="value">ComAdobeCqDamCqScene7Imaging</param>
            public ComAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesBuilder ComAdobeCqDamCqScene7Imaging(ConfigNodePropertyString value)
            {
                _ComAdobeCqDamCqScene7Imaging = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.ComAdobeCqDtmReactorCore property.
            /// </summary>
            /// <param name="value">ComAdobeCqDtmReactorCore</param>
            public ComAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesBuilder ComAdobeCqDtmReactorCore(ConfigNodePropertyString value)
            {
                _ComAdobeCqDtmReactorCore = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.ComAdobeCqDtmReactorUi property.
            /// </summary>
            /// <param name="value">ComAdobeCqDtmReactorUi</param>
            public ComAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesBuilder ComAdobeCqDtmReactorUi(ConfigNodePropertyString value)
            {
                _ComAdobeCqDtmReactorUi = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.ComAdobeCqExpJspelResolver property.
            /// </summary>
            /// <param name="value">ComAdobeCqExpJspelResolver</param>
            public ComAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesBuilder ComAdobeCqExpJspelResolver(ConfigNodePropertyString value)
            {
                _ComAdobeCqExpJspelResolver = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.ComAdobeCqInboxCqInbox property.
            /// </summary>
            /// <param name="value">ComAdobeCqInboxCqInbox</param>
            public ComAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesBuilder ComAdobeCqInboxCqInbox(ConfigNodePropertyString value)
            {
                _ComAdobeCqInboxCqInbox = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.ComAdobeCqJsonSchemaParser property.
            /// </summary>
            /// <param name="value">ComAdobeCqJsonSchemaParser</param>
            public ComAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesBuilder ComAdobeCqJsonSchemaParser(ConfigNodePropertyString value)
            {
                _ComAdobeCqJsonSchemaParser = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.ComAdobeCqMediaCqMediaPublishingDpsFpCore property.
            /// </summary>
            /// <param name="value">ComAdobeCqMediaCqMediaPublishingDpsFpCore</param>
            public ComAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesBuilder ComAdobeCqMediaCqMediaPublishingDpsFpCore(ConfigNodePropertyString value)
            {
                _ComAdobeCqMediaCqMediaPublishingDpsFpCore = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.ComAdobeCqMobileCqMobileCaas property.
            /// </summary>
            /// <param name="value">ComAdobeCqMobileCqMobileCaas</param>
            public ComAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesBuilder ComAdobeCqMobileCqMobileCaas(ConfigNodePropertyString value)
            {
                _ComAdobeCqMobileCqMobileCaas = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.ComAdobeCqMobileCqMobileIndexBuilder property.
            /// </summary>
            /// <param name="value">ComAdobeCqMobileCqMobileIndexBuilder</param>
            public ComAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesBuilder ComAdobeCqMobileCqMobileIndexBuilder(ConfigNodePropertyString value)
            {
                _ComAdobeCqMobileCqMobileIndexBuilder = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.ComAdobeCqMobileCqMobilePhonegapBuild property.
            /// </summary>
            /// <param name="value">ComAdobeCqMobileCqMobilePhonegapBuild</param>
            public ComAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesBuilder ComAdobeCqMobileCqMobilePhonegapBuild(ConfigNodePropertyString value)
            {
                _ComAdobeCqMobileCqMobilePhonegapBuild = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.ComAdobeCqMyspell property.
            /// </summary>
            /// <param name="value">ComAdobeCqMyspell</param>
            public ComAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesBuilder ComAdobeCqMyspell(ConfigNodePropertyString value)
            {
                _ComAdobeCqMyspell = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.ComAdobeCqSampleWeRetailCore property.
            /// </summary>
            /// <param name="value">ComAdobeCqSampleWeRetailCore</param>
            public ComAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesBuilder ComAdobeCqSampleWeRetailCore(ConfigNodePropertyString value)
            {
                _ComAdobeCqSampleWeRetailCore = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.ComAdobeCqScreensComAdobeCqScreensDcc property.
            /// </summary>
            /// <param name="value">ComAdobeCqScreensComAdobeCqScreensDcc</param>
            public ComAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesBuilder ComAdobeCqScreensComAdobeCqScreensDcc(ConfigNodePropertyString value)
            {
                _ComAdobeCqScreensComAdobeCqScreensDcc = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.ComAdobeCqScreensComAdobeCqScreensMqCore property.
            /// </summary>
            /// <param name="value">ComAdobeCqScreensComAdobeCqScreensMqCore</param>
            public ComAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesBuilder ComAdobeCqScreensComAdobeCqScreensMqCore(ConfigNodePropertyString value)
            {
                _ComAdobeCqScreensComAdobeCqScreensMqCore = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.ComAdobeCqSocialCqSocialAsProvider property.
            /// </summary>
            /// <param name="value">ComAdobeCqSocialCqSocialAsProvider</param>
            public ComAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesBuilder ComAdobeCqSocialCqSocialAsProvider(ConfigNodePropertyString value)
            {
                _ComAdobeCqSocialCqSocialAsProvider = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.ComAdobeCqSocialCqSocialBadgingBasicImpl property.
            /// </summary>
            /// <param name="value">ComAdobeCqSocialCqSocialBadgingBasicImpl</param>
            public ComAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesBuilder ComAdobeCqSocialCqSocialBadgingBasicImpl(ConfigNodePropertyString value)
            {
                _ComAdobeCqSocialCqSocialBadgingBasicImpl = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.ComAdobeCqSocialCqSocialBadgingImpl property.
            /// </summary>
            /// <param name="value">ComAdobeCqSocialCqSocialBadgingImpl</param>
            public ComAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesBuilder ComAdobeCqSocialCqSocialBadgingImpl(ConfigNodePropertyString value)
            {
                _ComAdobeCqSocialCqSocialBadgingImpl = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.ComAdobeCqSocialCqSocialCalendarImpl property.
            /// </summary>
            /// <param name="value">ComAdobeCqSocialCqSocialCalendarImpl</param>
            public ComAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesBuilder ComAdobeCqSocialCqSocialCalendarImpl(ConfigNodePropertyString value)
            {
                _ComAdobeCqSocialCqSocialCalendarImpl = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.ComAdobeCqSocialCqSocialContentFragmentsImpl property.
            /// </summary>
            /// <param name="value">ComAdobeCqSocialCqSocialContentFragmentsImpl</param>
            public ComAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesBuilder ComAdobeCqSocialCqSocialContentFragmentsImpl(ConfigNodePropertyString value)
            {
                _ComAdobeCqSocialCqSocialContentFragmentsImpl = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.ComAdobeCqSocialCqSocialEnablementImpl property.
            /// </summary>
            /// <param name="value">ComAdobeCqSocialCqSocialEnablementImpl</param>
            public ComAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesBuilder ComAdobeCqSocialCqSocialEnablementImpl(ConfigNodePropertyString value)
            {
                _ComAdobeCqSocialCqSocialEnablementImpl = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.ComAdobeCqSocialCqSocialGraphImpl property.
            /// </summary>
            /// <param name="value">ComAdobeCqSocialCqSocialGraphImpl</param>
            public ComAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesBuilder ComAdobeCqSocialCqSocialGraphImpl(ConfigNodePropertyString value)
            {
                _ComAdobeCqSocialCqSocialGraphImpl = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.ComAdobeCqSocialCqSocialIdeationImpl property.
            /// </summary>
            /// <param name="value">ComAdobeCqSocialCqSocialIdeationImpl</param>
            public ComAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesBuilder ComAdobeCqSocialCqSocialIdeationImpl(ConfigNodePropertyString value)
            {
                _ComAdobeCqSocialCqSocialIdeationImpl = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.ComAdobeCqSocialCqSocialJcrProvider property.
            /// </summary>
            /// <param name="value">ComAdobeCqSocialCqSocialJcrProvider</param>
            public ComAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesBuilder ComAdobeCqSocialCqSocialJcrProvider(ConfigNodePropertyString value)
            {
                _ComAdobeCqSocialCqSocialJcrProvider = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.ComAdobeCqSocialCqSocialMembersImpl property.
            /// </summary>
            /// <param name="value">ComAdobeCqSocialCqSocialMembersImpl</param>
            public ComAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesBuilder ComAdobeCqSocialCqSocialMembersImpl(ConfigNodePropertyString value)
            {
                _ComAdobeCqSocialCqSocialMembersImpl = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.ComAdobeCqSocialCqSocialMsProvider property.
            /// </summary>
            /// <param name="value">ComAdobeCqSocialCqSocialMsProvider</param>
            public ComAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesBuilder ComAdobeCqSocialCqSocialMsProvider(ConfigNodePropertyString value)
            {
                _ComAdobeCqSocialCqSocialMsProvider = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.ComAdobeCqSocialCqSocialNotificationsChannelsWeb property.
            /// </summary>
            /// <param name="value">ComAdobeCqSocialCqSocialNotificationsChannelsWeb</param>
            public ComAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesBuilder ComAdobeCqSocialCqSocialNotificationsChannelsWeb(ConfigNodePropertyString value)
            {
                _ComAdobeCqSocialCqSocialNotificationsChannelsWeb = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.ComAdobeCqSocialCqSocialNotificationsImpl property.
            /// </summary>
            /// <param name="value">ComAdobeCqSocialCqSocialNotificationsImpl</param>
            public ComAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesBuilder ComAdobeCqSocialCqSocialNotificationsImpl(ConfigNodePropertyString value)
            {
                _ComAdobeCqSocialCqSocialNotificationsImpl = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.ComAdobeCqSocialCqSocialRdbProvider property.
            /// </summary>
            /// <param name="value">ComAdobeCqSocialCqSocialRdbProvider</param>
            public ComAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesBuilder ComAdobeCqSocialCqSocialRdbProvider(ConfigNodePropertyString value)
            {
                _ComAdobeCqSocialCqSocialRdbProvider = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.ComAdobeCqSocialCqSocialScfImpl property.
            /// </summary>
            /// <param name="value">ComAdobeCqSocialCqSocialScfImpl</param>
            public ComAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesBuilder ComAdobeCqSocialCqSocialScfImpl(ConfigNodePropertyString value)
            {
                _ComAdobeCqSocialCqSocialScfImpl = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.ComAdobeCqSocialCqSocialScoringBasicImpl property.
            /// </summary>
            /// <param name="value">ComAdobeCqSocialCqSocialScoringBasicImpl</param>
            public ComAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesBuilder ComAdobeCqSocialCqSocialScoringBasicImpl(ConfigNodePropertyString value)
            {
                _ComAdobeCqSocialCqSocialScoringBasicImpl = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.ComAdobeCqSocialCqSocialScoringImpl property.
            /// </summary>
            /// <param name="value">ComAdobeCqSocialCqSocialScoringImpl</param>
            public ComAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesBuilder ComAdobeCqSocialCqSocialScoringImpl(ConfigNodePropertyString value)
            {
                _ComAdobeCqSocialCqSocialScoringImpl = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.ComAdobeCqSocialCqSocialServiceusersImpl property.
            /// </summary>
            /// <param name="value">ComAdobeCqSocialCqSocialServiceusersImpl</param>
            public ComAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesBuilder ComAdobeCqSocialCqSocialServiceusersImpl(ConfigNodePropertyString value)
            {
                _ComAdobeCqSocialCqSocialServiceusersImpl = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.ComAdobeCqSocialCqSocialSrpImpl property.
            /// </summary>
            /// <param name="value">ComAdobeCqSocialCqSocialSrpImpl</param>
            public ComAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesBuilder ComAdobeCqSocialCqSocialSrpImpl(ConfigNodePropertyString value)
            {
                _ComAdobeCqSocialCqSocialSrpImpl = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.ComAdobeCqSocialCqSocialUgcbaseImpl property.
            /// </summary>
            /// <param name="value">ComAdobeCqSocialCqSocialUgcbaseImpl</param>
            public ComAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesBuilder ComAdobeCqSocialCqSocialUgcbaseImpl(ConfigNodePropertyString value)
            {
                _ComAdobeCqSocialCqSocialUgcbaseImpl = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.ComAdobeDamCqDamCfmImpl property.
            /// </summary>
            /// <param name="value">ComAdobeDamCqDamCfmImpl</param>
            public ComAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesBuilder ComAdobeDamCqDamCfmImpl(ConfigNodePropertyString value)
            {
                _ComAdobeDamCqDamCfmImpl = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.ComAdobeFormsFoundationFormsFoundationBase property.
            /// </summary>
            /// <param name="value">ComAdobeFormsFoundationFormsFoundationBase</param>
            public ComAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesBuilder ComAdobeFormsFoundationFormsFoundationBase(ConfigNodePropertyString value)
            {
                _ComAdobeFormsFoundationFormsFoundationBase = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.ComAdobeGraniteApicontroller property.
            /// </summary>
            /// <param name="value">ComAdobeGraniteApicontroller</param>
            public ComAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesBuilder ComAdobeGraniteApicontroller(ConfigNodePropertyString value)
            {
                _ComAdobeGraniteApicontroller = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.ComAdobeGraniteAssetCore property.
            /// </summary>
            /// <param name="value">ComAdobeGraniteAssetCore</param>
            public ComAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesBuilder ComAdobeGraniteAssetCore(ConfigNodePropertyString value)
            {
                _ComAdobeGraniteAssetCore = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.ComAdobeGraniteAuthSso property.
            /// </summary>
            /// <param name="value">ComAdobeGraniteAuthSso</param>
            public ComAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesBuilder ComAdobeGraniteAuthSso(ConfigNodePropertyString value)
            {
                _ComAdobeGraniteAuthSso = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.ComAdobeGraniteBundlesHcImpl property.
            /// </summary>
            /// <param name="value">ComAdobeGraniteBundlesHcImpl</param>
            public ComAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesBuilder ComAdobeGraniteBundlesHcImpl(ConfigNodePropertyString value)
            {
                _ComAdobeGraniteBundlesHcImpl = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.ComAdobeGraniteCompatRouter property.
            /// </summary>
            /// <param name="value">ComAdobeGraniteCompatRouter</param>
            public ComAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesBuilder ComAdobeGraniteCompatRouter(ConfigNodePropertyString value)
            {
                _ComAdobeGraniteCompatRouter = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.ComAdobeGraniteConf property.
            /// </summary>
            /// <param name="value">ComAdobeGraniteConf</param>
            public ComAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesBuilder ComAdobeGraniteConf(ConfigNodePropertyString value)
            {
                _ComAdobeGraniteConf = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.ComAdobeGraniteConfUiCore property.
            /// </summary>
            /// <param name="value">ComAdobeGraniteConfUiCore</param>
            public ComAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesBuilder ComAdobeGraniteConfUiCore(ConfigNodePropertyString value)
            {
                _ComAdobeGraniteConfUiCore = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.ComAdobeGraniteCors property.
            /// </summary>
            /// <param name="value">ComAdobeGraniteCors</param>
            public ComAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesBuilder ComAdobeGraniteCors(ConfigNodePropertyString value)
            {
                _ComAdobeGraniteCors = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.ComAdobeGraniteCrxExplorer property.
            /// </summary>
            /// <param name="value">ComAdobeGraniteCrxExplorer</param>
            public ComAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesBuilder ComAdobeGraniteCrxExplorer(ConfigNodePropertyString value)
            {
                _ComAdobeGraniteCrxExplorer = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.ComAdobeGraniteCrxdeLite property.
            /// </summary>
            /// <param name="value">ComAdobeGraniteCrxdeLite</param>
            public ComAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesBuilder ComAdobeGraniteCrxdeLite(ConfigNodePropertyString value)
            {
                _ComAdobeGraniteCrxdeLite = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.ComAdobeGraniteCryptoConfig property.
            /// </summary>
            /// <param name="value">ComAdobeGraniteCryptoConfig</param>
            public ComAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesBuilder ComAdobeGraniteCryptoConfig(ConfigNodePropertyString value)
            {
                _ComAdobeGraniteCryptoConfig = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.ComAdobeGraniteCryptoExtension property.
            /// </summary>
            /// <param name="value">ComAdobeGraniteCryptoExtension</param>
            public ComAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesBuilder ComAdobeGraniteCryptoExtension(ConfigNodePropertyString value)
            {
                _ComAdobeGraniteCryptoExtension = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.ComAdobeGraniteCryptoFile property.
            /// </summary>
            /// <param name="value">ComAdobeGraniteCryptoFile</param>
            public ComAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesBuilder ComAdobeGraniteCryptoFile(ConfigNodePropertyString value)
            {
                _ComAdobeGraniteCryptoFile = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.ComAdobeGraniteCryptoJcr property.
            /// </summary>
            /// <param name="value">ComAdobeGraniteCryptoJcr</param>
            public ComAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesBuilder ComAdobeGraniteCryptoJcr(ConfigNodePropertyString value)
            {
                _ComAdobeGraniteCryptoJcr = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.ComAdobeGraniteCsrf property.
            /// </summary>
            /// <param name="value">ComAdobeGraniteCsrf</param>
            public ComAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesBuilder ComAdobeGraniteCsrf(ConfigNodePropertyString value)
            {
                _ComAdobeGraniteCsrf = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.ComAdobeGraniteDistributionCore property.
            /// </summary>
            /// <param name="value">ComAdobeGraniteDistributionCore</param>
            public ComAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesBuilder ComAdobeGraniteDistributionCore(ConfigNodePropertyString value)
            {
                _ComAdobeGraniteDistributionCore = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.ComAdobeGraniteDropwizardMetrics property.
            /// </summary>
            /// <param name="value">ComAdobeGraniteDropwizardMetrics</param>
            public ComAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesBuilder ComAdobeGraniteDropwizardMetrics(ConfigNodePropertyString value)
            {
                _ComAdobeGraniteDropwizardMetrics = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.ComAdobeGraniteFragsImpl property.
            /// </summary>
            /// <param name="value">ComAdobeGraniteFragsImpl</param>
            public ComAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesBuilder ComAdobeGraniteFragsImpl(ConfigNodePropertyString value)
            {
                _ComAdobeGraniteFragsImpl = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.ComAdobeGraniteGibson property.
            /// </summary>
            /// <param name="value">ComAdobeGraniteGibson</param>
            public ComAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesBuilder ComAdobeGraniteGibson(ConfigNodePropertyString value)
            {
                _ComAdobeGraniteGibson = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.ComAdobeGraniteInfocollector property.
            /// </summary>
            /// <param name="value">ComAdobeGraniteInfocollector</param>
            public ComAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesBuilder ComAdobeGraniteInfocollector(ConfigNodePropertyString value)
            {
                _ComAdobeGraniteInfocollector = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.ComAdobeGraniteInstallerFactoryPackages property.
            /// </summary>
            /// <param name="value">ComAdobeGraniteInstallerFactoryPackages</param>
            public ComAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesBuilder ComAdobeGraniteInstallerFactoryPackages(ConfigNodePropertyString value)
            {
                _ComAdobeGraniteInstallerFactoryPackages = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.ComAdobeGraniteJettySsl property.
            /// </summary>
            /// <param name="value">ComAdobeGraniteJettySsl</param>
            public ComAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesBuilder ComAdobeGraniteJettySsl(ConfigNodePropertyString value)
            {
                _ComAdobeGraniteJettySsl = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.ComAdobeGraniteJobsAsync property.
            /// </summary>
            /// <param name="value">ComAdobeGraniteJobsAsync</param>
            public ComAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesBuilder ComAdobeGraniteJobsAsync(ConfigNodePropertyString value)
            {
                _ComAdobeGraniteJobsAsync = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.ComAdobeGraniteMaintenanceOak property.
            /// </summary>
            /// <param name="value">ComAdobeGraniteMaintenanceOak</param>
            public ComAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesBuilder ComAdobeGraniteMaintenanceOak(ConfigNodePropertyString value)
            {
                _ComAdobeGraniteMaintenanceOak = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.ComAdobeGraniteMonitoringCore property.
            /// </summary>
            /// <param name="value">ComAdobeGraniteMonitoringCore</param>
            public ComAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesBuilder ComAdobeGraniteMonitoringCore(ConfigNodePropertyString value)
            {
                _ComAdobeGraniteMonitoringCore = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.ComAdobeGraniteQueries property.
            /// </summary>
            /// <param name="value">ComAdobeGraniteQueries</param>
            public ComAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesBuilder ComAdobeGraniteQueries(ConfigNodePropertyString value)
            {
                _ComAdobeGraniteQueries = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.ComAdobeGraniteReplicationHcImpl property.
            /// </summary>
            /// <param name="value">ComAdobeGraniteReplicationHcImpl</param>
            public ComAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesBuilder ComAdobeGraniteReplicationHcImpl(ConfigNodePropertyString value)
            {
                _ComAdobeGraniteReplicationHcImpl = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.ComAdobeGraniteRepositoryChecker property.
            /// </summary>
            /// <param name="value">ComAdobeGraniteRepositoryChecker</param>
            public ComAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesBuilder ComAdobeGraniteRepositoryChecker(ConfigNodePropertyString value)
            {
                _ComAdobeGraniteRepositoryChecker = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.ComAdobeGraniteRepositoryHcImpl property.
            /// </summary>
            /// <param name="value">ComAdobeGraniteRepositoryHcImpl</param>
            public ComAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesBuilder ComAdobeGraniteRepositoryHcImpl(ConfigNodePropertyString value)
            {
                _ComAdobeGraniteRepositoryHcImpl = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.ComAdobeGraniteRestAssets property.
            /// </summary>
            /// <param name="value">ComAdobeGraniteRestAssets</param>
            public ComAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesBuilder ComAdobeGraniteRestAssets(ConfigNodePropertyString value)
            {
                _ComAdobeGraniteRestAssets = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.ComAdobeGraniteSecurityUi property.
            /// </summary>
            /// <param name="value">ComAdobeGraniteSecurityUi</param>
            public ComAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesBuilder ComAdobeGraniteSecurityUi(ConfigNodePropertyString value)
            {
                _ComAdobeGraniteSecurityUi = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.ComAdobeGraniteStartup property.
            /// </summary>
            /// <param name="value">ComAdobeGraniteStartup</param>
            public ComAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesBuilder ComAdobeGraniteStartup(ConfigNodePropertyString value)
            {
                _ComAdobeGraniteStartup = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.ComAdobeGraniteTagsoup property.
            /// </summary>
            /// <param name="value">ComAdobeGraniteTagsoup</param>
            public ComAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesBuilder ComAdobeGraniteTagsoup(ConfigNodePropertyString value)
            {
                _ComAdobeGraniteTagsoup = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.ComAdobeGraniteTaskmanagementCore property.
            /// </summary>
            /// <param name="value">ComAdobeGraniteTaskmanagementCore</param>
            public ComAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesBuilder ComAdobeGraniteTaskmanagementCore(ConfigNodePropertyString value)
            {
                _ComAdobeGraniteTaskmanagementCore = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.ComAdobeGraniteTaskmanagementWorkflow property.
            /// </summary>
            /// <param name="value">ComAdobeGraniteTaskmanagementWorkflow</param>
            public ComAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesBuilder ComAdobeGraniteTaskmanagementWorkflow(ConfigNodePropertyString value)
            {
                _ComAdobeGraniteTaskmanagementWorkflow = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.ComAdobeGraniteUiClientlibsCompilerLess property.
            /// </summary>
            /// <param name="value">ComAdobeGraniteUiClientlibsCompilerLess</param>
            public ComAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesBuilder ComAdobeGraniteUiClientlibsCompilerLess(ConfigNodePropertyString value)
            {
                _ComAdobeGraniteUiClientlibsCompilerLess = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.ComAdobeGraniteUiClientlibsProcessorGcc property.
            /// </summary>
            /// <param name="value">ComAdobeGraniteUiClientlibsProcessorGcc</param>
            public ComAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesBuilder ComAdobeGraniteUiClientlibsProcessorGcc(ConfigNodePropertyString value)
            {
                _ComAdobeGraniteUiClientlibsProcessorGcc = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.ComAdobeGraniteWebconsolePlugins property.
            /// </summary>
            /// <param name="value">ComAdobeGraniteWebconsolePlugins</param>
            public ComAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesBuilder ComAdobeGraniteWebconsolePlugins(ConfigNodePropertyString value)
            {
                _ComAdobeGraniteWebconsolePlugins = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.ComAdobeGraniteWorkflowConsole property.
            /// </summary>
            /// <param name="value">ComAdobeGraniteWorkflowConsole</param>
            public ComAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesBuilder ComAdobeGraniteWorkflowConsole(ConfigNodePropertyString value)
            {
                _ComAdobeGraniteWorkflowConsole = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.ComAdobeXmpWorkerFilesNativeFragmentLinux property.
            /// </summary>
            /// <param name="value">ComAdobeXmpWorkerFilesNativeFragmentLinux</param>
            public ComAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesBuilder ComAdobeXmpWorkerFilesNativeFragmentLinux(ConfigNodePropertyString value)
            {
                _ComAdobeXmpWorkerFilesNativeFragmentLinux = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.ComAdobeXmpWorkerFilesNativeFragmentMacosx property.
            /// </summary>
            /// <param name="value">ComAdobeXmpWorkerFilesNativeFragmentMacosx</param>
            public ComAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesBuilder ComAdobeXmpWorkerFilesNativeFragmentMacosx(ConfigNodePropertyString value)
            {
                _ComAdobeXmpWorkerFilesNativeFragmentMacosx = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.ComAdobeXmpWorkerFilesNativeFragmentWin property.
            /// </summary>
            /// <param name="value">ComAdobeXmpWorkerFilesNativeFragmentWin</param>
            public ComAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesBuilder ComAdobeXmpWorkerFilesNativeFragmentWin(ConfigNodePropertyString value)
            {
                _ComAdobeXmpWorkerFilesNativeFragmentWin = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.ComDayCommonsOsgiWrapperSimpleJndi property.
            /// </summary>
            /// <param name="value">ComDayCommonsOsgiWrapperSimpleJndi</param>
            public ComAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesBuilder ComDayCommonsOsgiWrapperSimpleJndi(ConfigNodePropertyString value)
            {
                _ComDayCommonsOsgiWrapperSimpleJndi = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.ComDayCqCqAuthhandler property.
            /// </summary>
            /// <param name="value">ComDayCqCqAuthhandler</param>
            public ComAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesBuilder ComDayCqCqAuthhandler(ConfigNodePropertyString value)
            {
                _ComDayCqCqAuthhandler = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.ComDayCqCqCompatConfigupdate property.
            /// </summary>
            /// <param name="value">ComDayCqCqCompatConfigupdate</param>
            public ComAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesBuilder ComDayCqCqCompatConfigupdate(ConfigNodePropertyString value)
            {
                _ComDayCqCqCompatConfigupdate = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.ComDayCqCqLicensebranding property.
            /// </summary>
            /// <param name="value">ComDayCqCqLicensebranding</param>
            public ComAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesBuilder ComDayCqCqLicensebranding(ConfigNodePropertyString value)
            {
                _ComDayCqCqLicensebranding = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.ComDayCqCqNotifcationImpl property.
            /// </summary>
            /// <param name="value">ComDayCqCqNotifcationImpl</param>
            public ComAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesBuilder ComDayCqCqNotifcationImpl(ConfigNodePropertyString value)
            {
                _ComDayCqCqNotifcationImpl = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.ComDayCqCqReplicationAudit property.
            /// </summary>
            /// <param name="value">ComDayCqCqReplicationAudit</param>
            public ComAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesBuilder ComDayCqCqReplicationAudit(ConfigNodePropertyString value)
            {
                _ComDayCqCqReplicationAudit = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.ComDayCqCqSearchExt property.
            /// </summary>
            /// <param name="value">ComDayCqCqSearchExt</param>
            public ComAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesBuilder ComDayCqCqSearchExt(ConfigNodePropertyString value)
            {
                _ComDayCqCqSearchExt = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.ComDayCqDamCqDamAnnotationPrint property.
            /// </summary>
            /// <param name="value">ComDayCqDamCqDamAnnotationPrint</param>
            public ComAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesBuilder ComDayCqDamCqDamAnnotationPrint(ConfigNodePropertyString value)
            {
                _ComDayCqDamCqDamAnnotationPrint = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.ComDayCqDamCqDamAssetUsage property.
            /// </summary>
            /// <param name="value">ComDayCqDamCqDamAssetUsage</param>
            public ComAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesBuilder ComDayCqDamCqDamAssetUsage(ConfigNodePropertyString value)
            {
                _ComDayCqDamCqDamAssetUsage = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.ComDayCqDamCqDamS7dam property.
            /// </summary>
            /// <param name="value">ComDayCqDamCqDamS7dam</param>
            public ComAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesBuilder ComDayCqDamCqDamS7dam(ConfigNodePropertyString value)
            {
                _ComDayCqDamCqDamS7dam = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.ComDayCqDamCqDamSimilaritysearch property.
            /// </summary>
            /// <param name="value">ComDayCqDamCqDamSimilaritysearch</param>
            public ComAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesBuilder ComDayCqDamCqDamSimilaritysearch(ConfigNodePropertyString value)
            {
                _ComDayCqDamCqDamSimilaritysearch = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.ComDayCqDamDamWebdavSupport property.
            /// </summary>
            /// <param name="value">ComDayCqDamDamWebdavSupport</param>
            public ComAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesBuilder ComDayCqDamDamWebdavSupport(ConfigNodePropertyString value)
            {
                _ComDayCqDamDamWebdavSupport = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.ComDayCqPreUpgradeTasks property.
            /// </summary>
            /// <param name="value">ComDayCqPreUpgradeTasks</param>
            public ComAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesBuilder ComDayCqPreUpgradeTasks(ConfigNodePropertyString value)
            {
                _ComDayCqPreUpgradeTasks = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.ComDayCqReplicationExtensions property.
            /// </summary>
            /// <param name="value">ComDayCqReplicationExtensions</param>
            public ComAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesBuilder ComDayCqReplicationExtensions(ConfigNodePropertyString value)
            {
                _ComDayCqReplicationExtensions = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.ComDayCqWcmCqMsmCore property.
            /// </summary>
            /// <param name="value">ComDayCqWcmCqMsmCore</param>
            public ComAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesBuilder ComDayCqWcmCqMsmCore(ConfigNodePropertyString value)
            {
                _ComDayCqWcmCqMsmCore = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.ComDayCqWcmCqWcmTranslation property.
            /// </summary>
            /// <param name="value">ComDayCqWcmCqWcmTranslation</param>
            public ComAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesBuilder ComDayCqWcmCqWcmTranslation(ConfigNodePropertyString value)
            {
                _ComDayCqWcmCqWcmTranslation = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.DayCommonsJrawio property.
            /// </summary>
            /// <param name="value">DayCommonsJrawio</param>
            public ComAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesBuilder DayCommonsJrawio(ConfigNodePropertyString value)
            {
                _DayCommonsJrawio = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.OrgApacheAriesJmxWhiteboard property.
            /// </summary>
            /// <param name="value">OrgApacheAriesJmxWhiteboard</param>
            public ComAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesBuilder OrgApacheAriesJmxWhiteboard(ConfigNodePropertyString value)
            {
                _OrgApacheAriesJmxWhiteboard = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.OrgApacheFelixHttpSslfilter property.
            /// </summary>
            /// <param name="value">OrgApacheFelixHttpSslfilter</param>
            public ComAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesBuilder OrgApacheFelixHttpSslfilter(ConfigNodePropertyString value)
            {
                _OrgApacheFelixHttpSslfilter = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.OrgApacheFelixOrgApacheFelixThreaddump property.
            /// </summary>
            /// <param name="value">OrgApacheFelixOrgApacheFelixThreaddump</param>
            public ComAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesBuilder OrgApacheFelixOrgApacheFelixThreaddump(ConfigNodePropertyString value)
            {
                _OrgApacheFelixOrgApacheFelixThreaddump = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.OrgApacheFelixWebconsolePluginsDs property.
            /// </summary>
            /// <param name="value">OrgApacheFelixWebconsolePluginsDs</param>
            public ComAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesBuilder OrgApacheFelixWebconsolePluginsDs(ConfigNodePropertyString value)
            {
                _OrgApacheFelixWebconsolePluginsDs = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.OrgApacheFelixWebconsolePluginsEvent property.
            /// </summary>
            /// <param name="value">OrgApacheFelixWebconsolePluginsEvent</param>
            public ComAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesBuilder OrgApacheFelixWebconsolePluginsEvent(ConfigNodePropertyString value)
            {
                _OrgApacheFelixWebconsolePluginsEvent = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.OrgApacheFelixWebconsolePluginsMemoryusage property.
            /// </summary>
            /// <param name="value">OrgApacheFelixWebconsolePluginsMemoryusage</param>
            public ComAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesBuilder OrgApacheFelixWebconsolePluginsMemoryusage(ConfigNodePropertyString value)
            {
                _OrgApacheFelixWebconsolePluginsMemoryusage = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.OrgApacheFelixWebconsolePluginsPackageadmin property.
            /// </summary>
            /// <param name="value">OrgApacheFelixWebconsolePluginsPackageadmin</param>
            public ComAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesBuilder OrgApacheFelixWebconsolePluginsPackageadmin(ConfigNodePropertyString value)
            {
                _OrgApacheFelixWebconsolePluginsPackageadmin = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.OrgApacheJackrabbitOakAuthLdap property.
            /// </summary>
            /// <param name="value">OrgApacheJackrabbitOakAuthLdap</param>
            public ComAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesBuilder OrgApacheJackrabbitOakAuthLdap(ConfigNodePropertyString value)
            {
                _OrgApacheJackrabbitOakAuthLdap = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.OrgApacheJackrabbitOakSegmentTar property.
            /// </summary>
            /// <param name="value">OrgApacheJackrabbitOakSegmentTar</param>
            public ComAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesBuilder OrgApacheJackrabbitOakSegmentTar(ConfigNodePropertyString value)
            {
                _OrgApacheJackrabbitOakSegmentTar = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.OrgApacheJackrabbitOakSolrOsgi property.
            /// </summary>
            /// <param name="value">OrgApacheJackrabbitOakSolrOsgi</param>
            public ComAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesBuilder OrgApacheJackrabbitOakSolrOsgi(ConfigNodePropertyString value)
            {
                _OrgApacheJackrabbitOakSolrOsgi = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.OrgApacheSlingBundleresourceImpl property.
            /// </summary>
            /// <param name="value">OrgApacheSlingBundleresourceImpl</param>
            public ComAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesBuilder OrgApacheSlingBundleresourceImpl(ConfigNodePropertyString value)
            {
                _OrgApacheSlingBundleresourceImpl = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.OrgApacheSlingCommonsFsclassloader property.
            /// </summary>
            /// <param name="value">OrgApacheSlingCommonsFsclassloader</param>
            public ComAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesBuilder OrgApacheSlingCommonsFsclassloader(ConfigNodePropertyString value)
            {
                _OrgApacheSlingCommonsFsclassloader = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.OrgApacheSlingCommonsLogWebconsole property.
            /// </summary>
            /// <param name="value">OrgApacheSlingCommonsLogWebconsole</param>
            public ComAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesBuilder OrgApacheSlingCommonsLogWebconsole(ConfigNodePropertyString value)
            {
                _OrgApacheSlingCommonsLogWebconsole = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.OrgApacheSlingDatasource property.
            /// </summary>
            /// <param name="value">OrgApacheSlingDatasource</param>
            public ComAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesBuilder OrgApacheSlingDatasource(ConfigNodePropertyString value)
            {
                _OrgApacheSlingDatasource = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.OrgApacheSlingDiscoveryBase property.
            /// </summary>
            /// <param name="value">OrgApacheSlingDiscoveryBase</param>
            public ComAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesBuilder OrgApacheSlingDiscoveryBase(ConfigNodePropertyString value)
            {
                _OrgApacheSlingDiscoveryBase = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.OrgApacheSlingDiscoveryOak property.
            /// </summary>
            /// <param name="value">OrgApacheSlingDiscoveryOak</param>
            public ComAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesBuilder OrgApacheSlingDiscoveryOak(ConfigNodePropertyString value)
            {
                _OrgApacheSlingDiscoveryOak = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.OrgApacheSlingDiscoverySupport property.
            /// </summary>
            /// <param name="value">OrgApacheSlingDiscoverySupport</param>
            public ComAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesBuilder OrgApacheSlingDiscoverySupport(ConfigNodePropertyString value)
            {
                _OrgApacheSlingDiscoverySupport = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.OrgApacheSlingDistributionApi property.
            /// </summary>
            /// <param name="value">OrgApacheSlingDistributionApi</param>
            public ComAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesBuilder OrgApacheSlingDistributionApi(ConfigNodePropertyString value)
            {
                _OrgApacheSlingDistributionApi = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.OrgApacheSlingDistributionCore property.
            /// </summary>
            /// <param name="value">OrgApacheSlingDistributionCore</param>
            public ComAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesBuilder OrgApacheSlingDistributionCore(ConfigNodePropertyString value)
            {
                _OrgApacheSlingDistributionCore = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.OrgApacheSlingExtensionsWebconsolesecurityprovider property.
            /// </summary>
            /// <param name="value">OrgApacheSlingExtensionsWebconsolesecurityprovider</param>
            public ComAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesBuilder OrgApacheSlingExtensionsWebconsolesecurityprovider(ConfigNodePropertyString value)
            {
                _OrgApacheSlingExtensionsWebconsolesecurityprovider = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.OrgApacheSlingHcWebconsole property.
            /// </summary>
            /// <param name="value">OrgApacheSlingHcWebconsole</param>
            public ComAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesBuilder OrgApacheSlingHcWebconsole(ConfigNodePropertyString value)
            {
                _OrgApacheSlingHcWebconsole = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.OrgApacheSlingInstallerConsole property.
            /// </summary>
            /// <param name="value">OrgApacheSlingInstallerConsole</param>
            public ComAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesBuilder OrgApacheSlingInstallerConsole(ConfigNodePropertyString value)
            {
                _OrgApacheSlingInstallerConsole = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.OrgApacheSlingInstallerProviderFile property.
            /// </summary>
            /// <param name="value">OrgApacheSlingInstallerProviderFile</param>
            public ComAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesBuilder OrgApacheSlingInstallerProviderFile(ConfigNodePropertyString value)
            {
                _OrgApacheSlingInstallerProviderFile = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.OrgApacheSlingInstallerProviderJcr property.
            /// </summary>
            /// <param name="value">OrgApacheSlingInstallerProviderJcr</param>
            public ComAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesBuilder OrgApacheSlingInstallerProviderJcr(ConfigNodePropertyString value)
            {
                _OrgApacheSlingInstallerProviderJcr = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.OrgApacheSlingJcrDavex property.
            /// </summary>
            /// <param name="value">OrgApacheSlingJcrDavex</param>
            public ComAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesBuilder OrgApacheSlingJcrDavex(ConfigNodePropertyString value)
            {
                _OrgApacheSlingJcrDavex = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.OrgApacheSlingJcrResourcesecurity property.
            /// </summary>
            /// <param name="value">OrgApacheSlingJcrResourcesecurity</param>
            public ComAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesBuilder OrgApacheSlingJcrResourcesecurity(ConfigNodePropertyString value)
            {
                _OrgApacheSlingJcrResourcesecurity = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.OrgApacheSlingJmxProvider property.
            /// </summary>
            /// <param name="value">OrgApacheSlingJmxProvider</param>
            public ComAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesBuilder OrgApacheSlingJmxProvider(ConfigNodePropertyString value)
            {
                _OrgApacheSlingJmxProvider = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.OrgApacheSlingLaunchpadInstaller property.
            /// </summary>
            /// <param name="value">OrgApacheSlingLaunchpadInstaller</param>
            public ComAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesBuilder OrgApacheSlingLaunchpadInstaller(ConfigNodePropertyString value)
            {
                _OrgApacheSlingLaunchpadInstaller = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.OrgApacheSlingModelsImpl property.
            /// </summary>
            /// <param name="value">OrgApacheSlingModelsImpl</param>
            public ComAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesBuilder OrgApacheSlingModelsImpl(ConfigNodePropertyString value)
            {
                _OrgApacheSlingModelsImpl = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.OrgApacheSlingRepoinitParser property.
            /// </summary>
            /// <param name="value">OrgApacheSlingRepoinitParser</param>
            public ComAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesBuilder OrgApacheSlingRepoinitParser(ConfigNodePropertyString value)
            {
                _OrgApacheSlingRepoinitParser = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.OrgApacheSlingResourceInventory property.
            /// </summary>
            /// <param name="value">OrgApacheSlingResourceInventory</param>
            public ComAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesBuilder OrgApacheSlingResourceInventory(ConfigNodePropertyString value)
            {
                _OrgApacheSlingResourceInventory = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.OrgApacheSlingResourceresolver property.
            /// </summary>
            /// <param name="value">OrgApacheSlingResourceresolver</param>
            public ComAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesBuilder OrgApacheSlingResourceresolver(ConfigNodePropertyString value)
            {
                _OrgApacheSlingResourceresolver = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.OrgApacheSlingScriptingJavascript property.
            /// </summary>
            /// <param name="value">OrgApacheSlingScriptingJavascript</param>
            public ComAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesBuilder OrgApacheSlingScriptingJavascript(ConfigNodePropertyString value)
            {
                _OrgApacheSlingScriptingJavascript = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.OrgApacheSlingScriptingJst property.
            /// </summary>
            /// <param name="value">OrgApacheSlingScriptingJst</param>
            public ComAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesBuilder OrgApacheSlingScriptingJst(ConfigNodePropertyString value)
            {
                _OrgApacheSlingScriptingJst = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.OrgApacheSlingScriptingSightlyJsProvider property.
            /// </summary>
            /// <param name="value">OrgApacheSlingScriptingSightlyJsProvider</param>
            public ComAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesBuilder OrgApacheSlingScriptingSightlyJsProvider(ConfigNodePropertyString value)
            {
                _OrgApacheSlingScriptingSightlyJsProvider = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.OrgApacheSlingScriptingSightlyModelsProvider property.
            /// </summary>
            /// <param name="value">OrgApacheSlingScriptingSightlyModelsProvider</param>
            public ComAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesBuilder OrgApacheSlingScriptingSightlyModelsProvider(ConfigNodePropertyString value)
            {
                _OrgApacheSlingScriptingSightlyModelsProvider = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.OrgApacheSlingSecurity property.
            /// </summary>
            /// <param name="value">OrgApacheSlingSecurity</param>
            public ComAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesBuilder OrgApacheSlingSecurity(ConfigNodePropertyString value)
            {
                _OrgApacheSlingSecurity = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.OrgApacheSlingServletsCompat property.
            /// </summary>
            /// <param name="value">OrgApacheSlingServletsCompat</param>
            public ComAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesBuilder OrgApacheSlingServletsCompat(ConfigNodePropertyString value)
            {
                _OrgApacheSlingServletsCompat = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.OrgApacheSlingServletsGet property.
            /// </summary>
            /// <param name="value">OrgApacheSlingServletsGet</param>
            public ComAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesBuilder OrgApacheSlingServletsGet(ConfigNodePropertyString value)
            {
                _OrgApacheSlingServletsGet = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.OrgApacheSlingStartupfilterDisabler property.
            /// </summary>
            /// <param name="value">OrgApacheSlingStartupfilterDisabler</param>
            public ComAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesBuilder OrgApacheSlingStartupfilterDisabler(ConfigNodePropertyString value)
            {
                _OrgApacheSlingStartupfilterDisabler = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.OrgApacheSlingTracer property.
            /// </summary>
            /// <param name="value">OrgApacheSlingTracer</param>
            public ComAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesBuilder OrgApacheSlingTracer(ConfigNodePropertyString value)
            {
                _OrgApacheSlingTracer = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.WeRetailClientAppCore property.
            /// </summary>
            /// <param name="value">WeRetailClientAppCore</param>
            public ComAdobeGraniteApicontrollerFilterResolverHookFactoryPropertiesBuilder WeRetailClientAppCore(ConfigNodePropertyString value)
            {
                _WeRetailClientAppCore = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.
            /// </summary>
            /// <returns>ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties</returns>
            public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties Build()
            {
                Validate();
                return new ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties(
                    ComAdobeCqCdnCdnRewriter: _ComAdobeCqCdnCdnRewriter,
                    ComAdobeCqCloudConfigComponents: _ComAdobeCqCloudConfigComponents,
                    ComAdobeCqCloudConfigCore: _ComAdobeCqCloudConfigCore,
                    ComAdobeCqCloudConfigUi: _ComAdobeCqCloudConfigUi,
                    ComAdobeCqComAdobeCqEditor: _ComAdobeCqComAdobeCqEditor,
                    ComAdobeCqComAdobeCqProjectsCore: _ComAdobeCqComAdobeCqProjectsCore,
                    ComAdobeCqComAdobeCqProjectsWcmCore: _ComAdobeCqComAdobeCqProjectsWcmCore,
                    ComAdobeCqComAdobeCqUiCommons: _ComAdobeCqComAdobeCqUiCommons,
                    ComAdobeCqComAdobeCqWcmStyle: _ComAdobeCqComAdobeCqWcmStyle,
                    ComAdobeCqCqActivitymapIntegration: _ComAdobeCqCqActivitymapIntegration,
                    ComAdobeCqCqContexthubCommons: _ComAdobeCqCqContexthubCommons,
                    ComAdobeCqCqDtm: _ComAdobeCqCqDtm,
                    ComAdobeCqCqHealthcheck: _ComAdobeCqCqHealthcheck,
                    ComAdobeCqCqMultisiteTargeting: _ComAdobeCqCqMultisiteTargeting,
                    ComAdobeCqCqPreUpgradeCleanup: _ComAdobeCqCqPreUpgradeCleanup,
                    ComAdobeCqCqProductInfoProvider: _ComAdobeCqCqProductInfoProvider,
                    ComAdobeCqCqRestSites: _ComAdobeCqCqRestSites,
                    ComAdobeCqCqSecurityHc: _ComAdobeCqCqSecurityHc,
                    ComAdobeCqDamCqDamSvgHandler: _ComAdobeCqDamCqDamSvgHandler,
                    ComAdobeCqDamCqScene7Imaging: _ComAdobeCqDamCqScene7Imaging,
                    ComAdobeCqDtmReactorCore: _ComAdobeCqDtmReactorCore,
                    ComAdobeCqDtmReactorUi: _ComAdobeCqDtmReactorUi,
                    ComAdobeCqExpJspelResolver: _ComAdobeCqExpJspelResolver,
                    ComAdobeCqInboxCqInbox: _ComAdobeCqInboxCqInbox,
                    ComAdobeCqJsonSchemaParser: _ComAdobeCqJsonSchemaParser,
                    ComAdobeCqMediaCqMediaPublishingDpsFpCore: _ComAdobeCqMediaCqMediaPublishingDpsFpCore,
                    ComAdobeCqMobileCqMobileCaas: _ComAdobeCqMobileCqMobileCaas,
                    ComAdobeCqMobileCqMobileIndexBuilder: _ComAdobeCqMobileCqMobileIndexBuilder,
                    ComAdobeCqMobileCqMobilePhonegapBuild: _ComAdobeCqMobileCqMobilePhonegapBuild,
                    ComAdobeCqMyspell: _ComAdobeCqMyspell,
                    ComAdobeCqSampleWeRetailCore: _ComAdobeCqSampleWeRetailCore,
                    ComAdobeCqScreensComAdobeCqScreensDcc: _ComAdobeCqScreensComAdobeCqScreensDcc,
                    ComAdobeCqScreensComAdobeCqScreensMqCore: _ComAdobeCqScreensComAdobeCqScreensMqCore,
                    ComAdobeCqSocialCqSocialAsProvider: _ComAdobeCqSocialCqSocialAsProvider,
                    ComAdobeCqSocialCqSocialBadgingBasicImpl: _ComAdobeCqSocialCqSocialBadgingBasicImpl,
                    ComAdobeCqSocialCqSocialBadgingImpl: _ComAdobeCqSocialCqSocialBadgingImpl,
                    ComAdobeCqSocialCqSocialCalendarImpl: _ComAdobeCqSocialCqSocialCalendarImpl,
                    ComAdobeCqSocialCqSocialContentFragmentsImpl: _ComAdobeCqSocialCqSocialContentFragmentsImpl,
                    ComAdobeCqSocialCqSocialEnablementImpl: _ComAdobeCqSocialCqSocialEnablementImpl,
                    ComAdobeCqSocialCqSocialGraphImpl: _ComAdobeCqSocialCqSocialGraphImpl,
                    ComAdobeCqSocialCqSocialIdeationImpl: _ComAdobeCqSocialCqSocialIdeationImpl,
                    ComAdobeCqSocialCqSocialJcrProvider: _ComAdobeCqSocialCqSocialJcrProvider,
                    ComAdobeCqSocialCqSocialMembersImpl: _ComAdobeCqSocialCqSocialMembersImpl,
                    ComAdobeCqSocialCqSocialMsProvider: _ComAdobeCqSocialCqSocialMsProvider,
                    ComAdobeCqSocialCqSocialNotificationsChannelsWeb: _ComAdobeCqSocialCqSocialNotificationsChannelsWeb,
                    ComAdobeCqSocialCqSocialNotificationsImpl: _ComAdobeCqSocialCqSocialNotificationsImpl,
                    ComAdobeCqSocialCqSocialRdbProvider: _ComAdobeCqSocialCqSocialRdbProvider,
                    ComAdobeCqSocialCqSocialScfImpl: _ComAdobeCqSocialCqSocialScfImpl,
                    ComAdobeCqSocialCqSocialScoringBasicImpl: _ComAdobeCqSocialCqSocialScoringBasicImpl,
                    ComAdobeCqSocialCqSocialScoringImpl: _ComAdobeCqSocialCqSocialScoringImpl,
                    ComAdobeCqSocialCqSocialServiceusersImpl: _ComAdobeCqSocialCqSocialServiceusersImpl,
                    ComAdobeCqSocialCqSocialSrpImpl: _ComAdobeCqSocialCqSocialSrpImpl,
                    ComAdobeCqSocialCqSocialUgcbaseImpl: _ComAdobeCqSocialCqSocialUgcbaseImpl,
                    ComAdobeDamCqDamCfmImpl: _ComAdobeDamCqDamCfmImpl,
                    ComAdobeFormsFoundationFormsFoundationBase: _ComAdobeFormsFoundationFormsFoundationBase,
                    ComAdobeGraniteApicontroller: _ComAdobeGraniteApicontroller,
                    ComAdobeGraniteAssetCore: _ComAdobeGraniteAssetCore,
                    ComAdobeGraniteAuthSso: _ComAdobeGraniteAuthSso,
                    ComAdobeGraniteBundlesHcImpl: _ComAdobeGraniteBundlesHcImpl,
                    ComAdobeGraniteCompatRouter: _ComAdobeGraniteCompatRouter,
                    ComAdobeGraniteConf: _ComAdobeGraniteConf,
                    ComAdobeGraniteConfUiCore: _ComAdobeGraniteConfUiCore,
                    ComAdobeGraniteCors: _ComAdobeGraniteCors,
                    ComAdobeGraniteCrxExplorer: _ComAdobeGraniteCrxExplorer,
                    ComAdobeGraniteCrxdeLite: _ComAdobeGraniteCrxdeLite,
                    ComAdobeGraniteCryptoConfig: _ComAdobeGraniteCryptoConfig,
                    ComAdobeGraniteCryptoExtension: _ComAdobeGraniteCryptoExtension,
                    ComAdobeGraniteCryptoFile: _ComAdobeGraniteCryptoFile,
                    ComAdobeGraniteCryptoJcr: _ComAdobeGraniteCryptoJcr,
                    ComAdobeGraniteCsrf: _ComAdobeGraniteCsrf,
                    ComAdobeGraniteDistributionCore: _ComAdobeGraniteDistributionCore,
                    ComAdobeGraniteDropwizardMetrics: _ComAdobeGraniteDropwizardMetrics,
                    ComAdobeGraniteFragsImpl: _ComAdobeGraniteFragsImpl,
                    ComAdobeGraniteGibson: _ComAdobeGraniteGibson,
                    ComAdobeGraniteInfocollector: _ComAdobeGraniteInfocollector,
                    ComAdobeGraniteInstallerFactoryPackages: _ComAdobeGraniteInstallerFactoryPackages,
                    ComAdobeGraniteJettySsl: _ComAdobeGraniteJettySsl,
                    ComAdobeGraniteJobsAsync: _ComAdobeGraniteJobsAsync,
                    ComAdobeGraniteMaintenanceOak: _ComAdobeGraniteMaintenanceOak,
                    ComAdobeGraniteMonitoringCore: _ComAdobeGraniteMonitoringCore,
                    ComAdobeGraniteQueries: _ComAdobeGraniteQueries,
                    ComAdobeGraniteReplicationHcImpl: _ComAdobeGraniteReplicationHcImpl,
                    ComAdobeGraniteRepositoryChecker: _ComAdobeGraniteRepositoryChecker,
                    ComAdobeGraniteRepositoryHcImpl: _ComAdobeGraniteRepositoryHcImpl,
                    ComAdobeGraniteRestAssets: _ComAdobeGraniteRestAssets,
                    ComAdobeGraniteSecurityUi: _ComAdobeGraniteSecurityUi,
                    ComAdobeGraniteStartup: _ComAdobeGraniteStartup,
                    ComAdobeGraniteTagsoup: _ComAdobeGraniteTagsoup,
                    ComAdobeGraniteTaskmanagementCore: _ComAdobeGraniteTaskmanagementCore,
                    ComAdobeGraniteTaskmanagementWorkflow: _ComAdobeGraniteTaskmanagementWorkflow,
                    ComAdobeGraniteUiClientlibsCompilerLess: _ComAdobeGraniteUiClientlibsCompilerLess,
                    ComAdobeGraniteUiClientlibsProcessorGcc: _ComAdobeGraniteUiClientlibsProcessorGcc,
                    ComAdobeGraniteWebconsolePlugins: _ComAdobeGraniteWebconsolePlugins,
                    ComAdobeGraniteWorkflowConsole: _ComAdobeGraniteWorkflowConsole,
                    ComAdobeXmpWorkerFilesNativeFragmentLinux: _ComAdobeXmpWorkerFilesNativeFragmentLinux,
                    ComAdobeXmpWorkerFilesNativeFragmentMacosx: _ComAdobeXmpWorkerFilesNativeFragmentMacosx,
                    ComAdobeXmpWorkerFilesNativeFragmentWin: _ComAdobeXmpWorkerFilesNativeFragmentWin,
                    ComDayCommonsOsgiWrapperSimpleJndi: _ComDayCommonsOsgiWrapperSimpleJndi,
                    ComDayCqCqAuthhandler: _ComDayCqCqAuthhandler,
                    ComDayCqCqCompatConfigupdate: _ComDayCqCqCompatConfigupdate,
                    ComDayCqCqLicensebranding: _ComDayCqCqLicensebranding,
                    ComDayCqCqNotifcationImpl: _ComDayCqCqNotifcationImpl,
                    ComDayCqCqReplicationAudit: _ComDayCqCqReplicationAudit,
                    ComDayCqCqSearchExt: _ComDayCqCqSearchExt,
                    ComDayCqDamCqDamAnnotationPrint: _ComDayCqDamCqDamAnnotationPrint,
                    ComDayCqDamCqDamAssetUsage: _ComDayCqDamCqDamAssetUsage,
                    ComDayCqDamCqDamS7dam: _ComDayCqDamCqDamS7dam,
                    ComDayCqDamCqDamSimilaritysearch: _ComDayCqDamCqDamSimilaritysearch,
                    ComDayCqDamDamWebdavSupport: _ComDayCqDamDamWebdavSupport,
                    ComDayCqPreUpgradeTasks: _ComDayCqPreUpgradeTasks,
                    ComDayCqReplicationExtensions: _ComDayCqReplicationExtensions,
                    ComDayCqWcmCqMsmCore: _ComDayCqWcmCqMsmCore,
                    ComDayCqWcmCqWcmTranslation: _ComDayCqWcmCqWcmTranslation,
                    DayCommonsJrawio: _DayCommonsJrawio,
                    OrgApacheAriesJmxWhiteboard: _OrgApacheAriesJmxWhiteboard,
                    OrgApacheFelixHttpSslfilter: _OrgApacheFelixHttpSslfilter,
                    OrgApacheFelixOrgApacheFelixThreaddump: _OrgApacheFelixOrgApacheFelixThreaddump,
                    OrgApacheFelixWebconsolePluginsDs: _OrgApacheFelixWebconsolePluginsDs,
                    OrgApacheFelixWebconsolePluginsEvent: _OrgApacheFelixWebconsolePluginsEvent,
                    OrgApacheFelixWebconsolePluginsMemoryusage: _OrgApacheFelixWebconsolePluginsMemoryusage,
                    OrgApacheFelixWebconsolePluginsPackageadmin: _OrgApacheFelixWebconsolePluginsPackageadmin,
                    OrgApacheJackrabbitOakAuthLdap: _OrgApacheJackrabbitOakAuthLdap,
                    OrgApacheJackrabbitOakSegmentTar: _OrgApacheJackrabbitOakSegmentTar,
                    OrgApacheJackrabbitOakSolrOsgi: _OrgApacheJackrabbitOakSolrOsgi,
                    OrgApacheSlingBundleresourceImpl: _OrgApacheSlingBundleresourceImpl,
                    OrgApacheSlingCommonsFsclassloader: _OrgApacheSlingCommonsFsclassloader,
                    OrgApacheSlingCommonsLogWebconsole: _OrgApacheSlingCommonsLogWebconsole,
                    OrgApacheSlingDatasource: _OrgApacheSlingDatasource,
                    OrgApacheSlingDiscoveryBase: _OrgApacheSlingDiscoveryBase,
                    OrgApacheSlingDiscoveryOak: _OrgApacheSlingDiscoveryOak,
                    OrgApacheSlingDiscoverySupport: _OrgApacheSlingDiscoverySupport,
                    OrgApacheSlingDistributionApi: _OrgApacheSlingDistributionApi,
                    OrgApacheSlingDistributionCore: _OrgApacheSlingDistributionCore,
                    OrgApacheSlingExtensionsWebconsolesecurityprovider: _OrgApacheSlingExtensionsWebconsolesecurityprovider,
                    OrgApacheSlingHcWebconsole: _OrgApacheSlingHcWebconsole,
                    OrgApacheSlingInstallerConsole: _OrgApacheSlingInstallerConsole,
                    OrgApacheSlingInstallerProviderFile: _OrgApacheSlingInstallerProviderFile,
                    OrgApacheSlingInstallerProviderJcr: _OrgApacheSlingInstallerProviderJcr,
                    OrgApacheSlingJcrDavex: _OrgApacheSlingJcrDavex,
                    OrgApacheSlingJcrResourcesecurity: _OrgApacheSlingJcrResourcesecurity,
                    OrgApacheSlingJmxProvider: _OrgApacheSlingJmxProvider,
                    OrgApacheSlingLaunchpadInstaller: _OrgApacheSlingLaunchpadInstaller,
                    OrgApacheSlingModelsImpl: _OrgApacheSlingModelsImpl,
                    OrgApacheSlingRepoinitParser: _OrgApacheSlingRepoinitParser,
                    OrgApacheSlingResourceInventory: _OrgApacheSlingResourceInventory,
                    OrgApacheSlingResourceresolver: _OrgApacheSlingResourceresolver,
                    OrgApacheSlingScriptingJavascript: _OrgApacheSlingScriptingJavascript,
                    OrgApacheSlingScriptingJst: _OrgApacheSlingScriptingJst,
                    OrgApacheSlingScriptingSightlyJsProvider: _OrgApacheSlingScriptingSightlyJsProvider,
                    OrgApacheSlingScriptingSightlyModelsProvider: _OrgApacheSlingScriptingSightlyModelsProvider,
                    OrgApacheSlingSecurity: _OrgApacheSlingSecurity,
                    OrgApacheSlingServletsCompat: _OrgApacheSlingServletsCompat,
                    OrgApacheSlingServletsGet: _OrgApacheSlingServletsGet,
                    OrgApacheSlingStartupfilterDisabler: _OrgApacheSlingStartupfilterDisabler,
                    OrgApacheSlingTracer: _OrgApacheSlingTracer,
                    WeRetailClientAppCore: _WeRetailClientAppCore
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}