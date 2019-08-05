package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties   {
  
  private ConfigNodePropertyString comAdobeCqCdnCdnRewriter = null;
  private ConfigNodePropertyString comAdobeCqCloudConfigComponents = null;
  private ConfigNodePropertyString comAdobeCqCloudConfigCore = null;
  private ConfigNodePropertyString comAdobeCqCloudConfigUi = null;
  private ConfigNodePropertyString comAdobeCqComAdobeCqEditor = null;
  private ConfigNodePropertyString comAdobeCqComAdobeCqProjectsCore = null;
  private ConfigNodePropertyString comAdobeCqComAdobeCqProjectsWcmCore = null;
  private ConfigNodePropertyString comAdobeCqComAdobeCqUiCommons = null;
  private ConfigNodePropertyString comAdobeCqComAdobeCqWcmStyle = null;
  private ConfigNodePropertyString comAdobeCqCqActivitymapIntegration = null;
  private ConfigNodePropertyString comAdobeCqCqContexthubCommons = null;
  private ConfigNodePropertyString comAdobeCqCqDtm = null;
  private ConfigNodePropertyString comAdobeCqCqHealthcheck = null;
  private ConfigNodePropertyString comAdobeCqCqMultisiteTargeting = null;
  private ConfigNodePropertyString comAdobeCqCqPreUpgradeCleanup = null;
  private ConfigNodePropertyString comAdobeCqCqProductInfoProvider = null;
  private ConfigNodePropertyString comAdobeCqCqRestSites = null;
  private ConfigNodePropertyString comAdobeCqCqSecurityHc = null;
  private ConfigNodePropertyString comAdobeCqDamCqDamSvgHandler = null;
  private ConfigNodePropertyString comAdobeCqDamCqScene7Imaging = null;
  private ConfigNodePropertyString comAdobeCqDtmReactorCore = null;
  private ConfigNodePropertyString comAdobeCqDtmReactorUi = null;
  private ConfigNodePropertyString comAdobeCqExpJspelResolver = null;
  private ConfigNodePropertyString comAdobeCqInboxCqInbox = null;
  private ConfigNodePropertyString comAdobeCqJsonSchemaParser = null;
  private ConfigNodePropertyString comAdobeCqMediaCqMediaPublishingDpsFpCore = null;
  private ConfigNodePropertyString comAdobeCqMobileCqMobileCaas = null;
  private ConfigNodePropertyString comAdobeCqMobileCqMobileIndexBuilder = null;
  private ConfigNodePropertyString comAdobeCqMobileCqMobilePhonegapBuild = null;
  private ConfigNodePropertyString comAdobeCqMyspell = null;
  private ConfigNodePropertyString comAdobeCqSampleWeRetailCore = null;
  private ConfigNodePropertyString comAdobeCqScreensComAdobeCqScreensDcc = null;
  private ConfigNodePropertyString comAdobeCqScreensComAdobeCqScreensMqCore = null;
  private ConfigNodePropertyString comAdobeCqSocialCqSocialAsProvider = null;
  private ConfigNodePropertyString comAdobeCqSocialCqSocialBadgingBasicImpl = null;
  private ConfigNodePropertyString comAdobeCqSocialCqSocialBadgingImpl = null;
  private ConfigNodePropertyString comAdobeCqSocialCqSocialCalendarImpl = null;
  private ConfigNodePropertyString comAdobeCqSocialCqSocialContentFragmentsImpl = null;
  private ConfigNodePropertyString comAdobeCqSocialCqSocialEnablementImpl = null;
  private ConfigNodePropertyString comAdobeCqSocialCqSocialGraphImpl = null;
  private ConfigNodePropertyString comAdobeCqSocialCqSocialIdeationImpl = null;
  private ConfigNodePropertyString comAdobeCqSocialCqSocialJcrProvider = null;
  private ConfigNodePropertyString comAdobeCqSocialCqSocialMembersImpl = null;
  private ConfigNodePropertyString comAdobeCqSocialCqSocialMsProvider = null;
  private ConfigNodePropertyString comAdobeCqSocialCqSocialNotificationsChannelsWeb = null;
  private ConfigNodePropertyString comAdobeCqSocialCqSocialNotificationsImpl = null;
  private ConfigNodePropertyString comAdobeCqSocialCqSocialRdbProvider = null;
  private ConfigNodePropertyString comAdobeCqSocialCqSocialScfImpl = null;
  private ConfigNodePropertyString comAdobeCqSocialCqSocialScoringBasicImpl = null;
  private ConfigNodePropertyString comAdobeCqSocialCqSocialScoringImpl = null;
  private ConfigNodePropertyString comAdobeCqSocialCqSocialServiceusersImpl = null;
  private ConfigNodePropertyString comAdobeCqSocialCqSocialSrpImpl = null;
  private ConfigNodePropertyString comAdobeCqSocialCqSocialUgcbaseImpl = null;
  private ConfigNodePropertyString comAdobeDamCqDamCfmImpl = null;
  private ConfigNodePropertyString comAdobeFormsFoundationFormsFoundationBase = null;
  private ConfigNodePropertyString comAdobeGraniteApicontroller = null;
  private ConfigNodePropertyString comAdobeGraniteAssetCore = null;
  private ConfigNodePropertyString comAdobeGraniteAuthSso = null;
  private ConfigNodePropertyString comAdobeGraniteBundlesHcImpl = null;
  private ConfigNodePropertyString comAdobeGraniteCompatRouter = null;
  private ConfigNodePropertyString comAdobeGraniteConf = null;
  private ConfigNodePropertyString comAdobeGraniteConfUiCore = null;
  private ConfigNodePropertyString comAdobeGraniteCors = null;
  private ConfigNodePropertyString comAdobeGraniteCrxExplorer = null;
  private ConfigNodePropertyString comAdobeGraniteCrxdeLite = null;
  private ConfigNodePropertyString comAdobeGraniteCryptoConfig = null;
  private ConfigNodePropertyString comAdobeGraniteCryptoExtension = null;
  private ConfigNodePropertyString comAdobeGraniteCryptoFile = null;
  private ConfigNodePropertyString comAdobeGraniteCryptoJcr = null;
  private ConfigNodePropertyString comAdobeGraniteCsrf = null;
  private ConfigNodePropertyString comAdobeGraniteDistributionCore = null;
  private ConfigNodePropertyString comAdobeGraniteDropwizardMetrics = null;
  private ConfigNodePropertyString comAdobeGraniteFragsImpl = null;
  private ConfigNodePropertyString comAdobeGraniteGibson = null;
  private ConfigNodePropertyString comAdobeGraniteInfocollector = null;
  private ConfigNodePropertyString comAdobeGraniteInstallerFactoryPackages = null;
  private ConfigNodePropertyString comAdobeGraniteJettySsl = null;
  private ConfigNodePropertyString comAdobeGraniteJobsAsync = null;
  private ConfigNodePropertyString comAdobeGraniteMaintenanceOak = null;
  private ConfigNodePropertyString comAdobeGraniteMonitoringCore = null;
  private ConfigNodePropertyString comAdobeGraniteQueries = null;
  private ConfigNodePropertyString comAdobeGraniteReplicationHcImpl = null;
  private ConfigNodePropertyString comAdobeGraniteRepositoryChecker = null;
  private ConfigNodePropertyString comAdobeGraniteRepositoryHcImpl = null;
  private ConfigNodePropertyString comAdobeGraniteRestAssets = null;
  private ConfigNodePropertyString comAdobeGraniteSecurityUi = null;
  private ConfigNodePropertyString comAdobeGraniteStartup = null;
  private ConfigNodePropertyString comAdobeGraniteTagsoup = null;
  private ConfigNodePropertyString comAdobeGraniteTaskmanagementCore = null;
  private ConfigNodePropertyString comAdobeGraniteTaskmanagementWorkflow = null;
  private ConfigNodePropertyString comAdobeGraniteUiClientlibsCompilerLess = null;
  private ConfigNodePropertyString comAdobeGraniteUiClientlibsProcessorGcc = null;
  private ConfigNodePropertyString comAdobeGraniteWebconsolePlugins = null;
  private ConfigNodePropertyString comAdobeGraniteWorkflowConsole = null;
  private ConfigNodePropertyString comAdobeXmpWorkerFilesNativeFragmentLinux = null;
  private ConfigNodePropertyString comAdobeXmpWorkerFilesNativeFragmentMacosx = null;
  private ConfigNodePropertyString comAdobeXmpWorkerFilesNativeFragmentWin = null;
  private ConfigNodePropertyString comDayCommonsOsgiWrapperSimpleJndi = null;
  private ConfigNodePropertyString comDayCqCqAuthhandler = null;
  private ConfigNodePropertyString comDayCqCqCompatConfigupdate = null;
  private ConfigNodePropertyString comDayCqCqLicensebranding = null;
  private ConfigNodePropertyString comDayCqCqNotifcationImpl = null;
  private ConfigNodePropertyString comDayCqCqReplicationAudit = null;
  private ConfigNodePropertyString comDayCqCqSearchExt = null;
  private ConfigNodePropertyString comDayCqDamCqDamAnnotationPrint = null;
  private ConfigNodePropertyString comDayCqDamCqDamAssetUsage = null;
  private ConfigNodePropertyString comDayCqDamCqDamS7dam = null;
  private ConfigNodePropertyString comDayCqDamCqDamSimilaritysearch = null;
  private ConfigNodePropertyString comDayCqDamDamWebdavSupport = null;
  private ConfigNodePropertyString comDayCqPreUpgradeTasks = null;
  private ConfigNodePropertyString comDayCqReplicationExtensions = null;
  private ConfigNodePropertyString comDayCqWcmCqMsmCore = null;
  private ConfigNodePropertyString comDayCqWcmCqWcmTranslation = null;
  private ConfigNodePropertyString dayCommonsJrawio = null;
  private ConfigNodePropertyString orgApacheAriesJmxWhiteboard = null;
  private ConfigNodePropertyString orgApacheFelixHttpSslfilter = null;
  private ConfigNodePropertyString orgApacheFelixOrgApacheFelixThreaddump = null;
  private ConfigNodePropertyString orgApacheFelixWebconsolePluginsDs = null;
  private ConfigNodePropertyString orgApacheFelixWebconsolePluginsEvent = null;
  private ConfigNodePropertyString orgApacheFelixWebconsolePluginsMemoryusage = null;
  private ConfigNodePropertyString orgApacheFelixWebconsolePluginsPackageadmin = null;
  private ConfigNodePropertyString orgApacheJackrabbitOakAuthLdap = null;
  private ConfigNodePropertyString orgApacheJackrabbitOakSegmentTar = null;
  private ConfigNodePropertyString orgApacheJackrabbitOakSolrOsgi = null;
  private ConfigNodePropertyString orgApacheSlingBundleresourceImpl = null;
  private ConfigNodePropertyString orgApacheSlingCommonsFsclassloader = null;
  private ConfigNodePropertyString orgApacheSlingCommonsLogWebconsole = null;
  private ConfigNodePropertyString orgApacheSlingDatasource = null;
  private ConfigNodePropertyString orgApacheSlingDiscoveryBase = null;
  private ConfigNodePropertyString orgApacheSlingDiscoveryOak = null;
  private ConfigNodePropertyString orgApacheSlingDiscoverySupport = null;
  private ConfigNodePropertyString orgApacheSlingDistributionApi = null;
  private ConfigNodePropertyString orgApacheSlingDistributionCore = null;
  private ConfigNodePropertyString orgApacheSlingExtensionsWebconsolesecurityprovider = null;
  private ConfigNodePropertyString orgApacheSlingHcWebconsole = null;
  private ConfigNodePropertyString orgApacheSlingInstallerConsole = null;
  private ConfigNodePropertyString orgApacheSlingInstallerProviderFile = null;
  private ConfigNodePropertyString orgApacheSlingInstallerProviderJcr = null;
  private ConfigNodePropertyString orgApacheSlingJcrDavex = null;
  private ConfigNodePropertyString orgApacheSlingJcrResourcesecurity = null;
  private ConfigNodePropertyString orgApacheSlingJmxProvider = null;
  private ConfigNodePropertyString orgApacheSlingLaunchpadInstaller = null;
  private ConfigNodePropertyString orgApacheSlingModelsImpl = null;
  private ConfigNodePropertyString orgApacheSlingRepoinitParser = null;
  private ConfigNodePropertyString orgApacheSlingResourceInventory = null;
  private ConfigNodePropertyString orgApacheSlingResourceresolver = null;
  private ConfigNodePropertyString orgApacheSlingScriptingJavascript = null;
  private ConfigNodePropertyString orgApacheSlingScriptingJst = null;
  private ConfigNodePropertyString orgApacheSlingScriptingSightlyJsProvider = null;
  private ConfigNodePropertyString orgApacheSlingScriptingSightlyModelsProvider = null;
  private ConfigNodePropertyString orgApacheSlingSecurity = null;
  private ConfigNodePropertyString orgApacheSlingServletsCompat = null;
  private ConfigNodePropertyString orgApacheSlingServletsGet = null;
  private ConfigNodePropertyString orgApacheSlingStartupfilterDisabler = null;
  private ConfigNodePropertyString orgApacheSlingTracer = null;
  private ConfigNodePropertyString weRetailClientAppCore = null;

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties () {

  }

  public ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties (ConfigNodePropertyString comAdobeCqCdnCdnRewriter, ConfigNodePropertyString comAdobeCqCloudConfigComponents, ConfigNodePropertyString comAdobeCqCloudConfigCore, ConfigNodePropertyString comAdobeCqCloudConfigUi, ConfigNodePropertyString comAdobeCqComAdobeCqEditor, ConfigNodePropertyString comAdobeCqComAdobeCqProjectsCore, ConfigNodePropertyString comAdobeCqComAdobeCqProjectsWcmCore, ConfigNodePropertyString comAdobeCqComAdobeCqUiCommons, ConfigNodePropertyString comAdobeCqComAdobeCqWcmStyle, ConfigNodePropertyString comAdobeCqCqActivitymapIntegration, ConfigNodePropertyString comAdobeCqCqContexthubCommons, ConfigNodePropertyString comAdobeCqCqDtm, ConfigNodePropertyString comAdobeCqCqHealthcheck, ConfigNodePropertyString comAdobeCqCqMultisiteTargeting, ConfigNodePropertyString comAdobeCqCqPreUpgradeCleanup, ConfigNodePropertyString comAdobeCqCqProductInfoProvider, ConfigNodePropertyString comAdobeCqCqRestSites, ConfigNodePropertyString comAdobeCqCqSecurityHc, ConfigNodePropertyString comAdobeCqDamCqDamSvgHandler, ConfigNodePropertyString comAdobeCqDamCqScene7Imaging, ConfigNodePropertyString comAdobeCqDtmReactorCore, ConfigNodePropertyString comAdobeCqDtmReactorUi, ConfigNodePropertyString comAdobeCqExpJspelResolver, ConfigNodePropertyString comAdobeCqInboxCqInbox, ConfigNodePropertyString comAdobeCqJsonSchemaParser, ConfigNodePropertyString comAdobeCqMediaCqMediaPublishingDpsFpCore, ConfigNodePropertyString comAdobeCqMobileCqMobileCaas, ConfigNodePropertyString comAdobeCqMobileCqMobileIndexBuilder, ConfigNodePropertyString comAdobeCqMobileCqMobilePhonegapBuild, ConfigNodePropertyString comAdobeCqMyspell, ConfigNodePropertyString comAdobeCqSampleWeRetailCore, ConfigNodePropertyString comAdobeCqScreensComAdobeCqScreensDcc, ConfigNodePropertyString comAdobeCqScreensComAdobeCqScreensMqCore, ConfigNodePropertyString comAdobeCqSocialCqSocialAsProvider, ConfigNodePropertyString comAdobeCqSocialCqSocialBadgingBasicImpl, ConfigNodePropertyString comAdobeCqSocialCqSocialBadgingImpl, ConfigNodePropertyString comAdobeCqSocialCqSocialCalendarImpl, ConfigNodePropertyString comAdobeCqSocialCqSocialContentFragmentsImpl, ConfigNodePropertyString comAdobeCqSocialCqSocialEnablementImpl, ConfigNodePropertyString comAdobeCqSocialCqSocialGraphImpl, ConfigNodePropertyString comAdobeCqSocialCqSocialIdeationImpl, ConfigNodePropertyString comAdobeCqSocialCqSocialJcrProvider, ConfigNodePropertyString comAdobeCqSocialCqSocialMembersImpl, ConfigNodePropertyString comAdobeCqSocialCqSocialMsProvider, ConfigNodePropertyString comAdobeCqSocialCqSocialNotificationsChannelsWeb, ConfigNodePropertyString comAdobeCqSocialCqSocialNotificationsImpl, ConfigNodePropertyString comAdobeCqSocialCqSocialRdbProvider, ConfigNodePropertyString comAdobeCqSocialCqSocialScfImpl, ConfigNodePropertyString comAdobeCqSocialCqSocialScoringBasicImpl, ConfigNodePropertyString comAdobeCqSocialCqSocialScoringImpl, ConfigNodePropertyString comAdobeCqSocialCqSocialServiceusersImpl, ConfigNodePropertyString comAdobeCqSocialCqSocialSrpImpl, ConfigNodePropertyString comAdobeCqSocialCqSocialUgcbaseImpl, ConfigNodePropertyString comAdobeDamCqDamCfmImpl, ConfigNodePropertyString comAdobeFormsFoundationFormsFoundationBase, ConfigNodePropertyString comAdobeGraniteApicontroller, ConfigNodePropertyString comAdobeGraniteAssetCore, ConfigNodePropertyString comAdobeGraniteAuthSso, ConfigNodePropertyString comAdobeGraniteBundlesHcImpl, ConfigNodePropertyString comAdobeGraniteCompatRouter, ConfigNodePropertyString comAdobeGraniteConf, ConfigNodePropertyString comAdobeGraniteConfUiCore, ConfigNodePropertyString comAdobeGraniteCors, ConfigNodePropertyString comAdobeGraniteCrxExplorer, ConfigNodePropertyString comAdobeGraniteCrxdeLite, ConfigNodePropertyString comAdobeGraniteCryptoConfig, ConfigNodePropertyString comAdobeGraniteCryptoExtension, ConfigNodePropertyString comAdobeGraniteCryptoFile, ConfigNodePropertyString comAdobeGraniteCryptoJcr, ConfigNodePropertyString comAdobeGraniteCsrf, ConfigNodePropertyString comAdobeGraniteDistributionCore, ConfigNodePropertyString comAdobeGraniteDropwizardMetrics, ConfigNodePropertyString comAdobeGraniteFragsImpl, ConfigNodePropertyString comAdobeGraniteGibson, ConfigNodePropertyString comAdobeGraniteInfocollector, ConfigNodePropertyString comAdobeGraniteInstallerFactoryPackages, ConfigNodePropertyString comAdobeGraniteJettySsl, ConfigNodePropertyString comAdobeGraniteJobsAsync, ConfigNodePropertyString comAdobeGraniteMaintenanceOak, ConfigNodePropertyString comAdobeGraniteMonitoringCore, ConfigNodePropertyString comAdobeGraniteQueries, ConfigNodePropertyString comAdobeGraniteReplicationHcImpl, ConfigNodePropertyString comAdobeGraniteRepositoryChecker, ConfigNodePropertyString comAdobeGraniteRepositoryHcImpl, ConfigNodePropertyString comAdobeGraniteRestAssets, ConfigNodePropertyString comAdobeGraniteSecurityUi, ConfigNodePropertyString comAdobeGraniteStartup, ConfigNodePropertyString comAdobeGraniteTagsoup, ConfigNodePropertyString comAdobeGraniteTaskmanagementCore, ConfigNodePropertyString comAdobeGraniteTaskmanagementWorkflow, ConfigNodePropertyString comAdobeGraniteUiClientlibsCompilerLess, ConfigNodePropertyString comAdobeGraniteUiClientlibsProcessorGcc, ConfigNodePropertyString comAdobeGraniteWebconsolePlugins, ConfigNodePropertyString comAdobeGraniteWorkflowConsole, ConfigNodePropertyString comAdobeXmpWorkerFilesNativeFragmentLinux, ConfigNodePropertyString comAdobeXmpWorkerFilesNativeFragmentMacosx, ConfigNodePropertyString comAdobeXmpWorkerFilesNativeFragmentWin, ConfigNodePropertyString comDayCommonsOsgiWrapperSimpleJndi, ConfigNodePropertyString comDayCqCqAuthhandler, ConfigNodePropertyString comDayCqCqCompatConfigupdate, ConfigNodePropertyString comDayCqCqLicensebranding, ConfigNodePropertyString comDayCqCqNotifcationImpl, ConfigNodePropertyString comDayCqCqReplicationAudit, ConfigNodePropertyString comDayCqCqSearchExt, ConfigNodePropertyString comDayCqDamCqDamAnnotationPrint, ConfigNodePropertyString comDayCqDamCqDamAssetUsage, ConfigNodePropertyString comDayCqDamCqDamS7dam, ConfigNodePropertyString comDayCqDamCqDamSimilaritysearch, ConfigNodePropertyString comDayCqDamDamWebdavSupport, ConfigNodePropertyString comDayCqPreUpgradeTasks, ConfigNodePropertyString comDayCqReplicationExtensions, ConfigNodePropertyString comDayCqWcmCqMsmCore, ConfigNodePropertyString comDayCqWcmCqWcmTranslation, ConfigNodePropertyString dayCommonsJrawio, ConfigNodePropertyString orgApacheAriesJmxWhiteboard, ConfigNodePropertyString orgApacheFelixHttpSslfilter, ConfigNodePropertyString orgApacheFelixOrgApacheFelixThreaddump, ConfigNodePropertyString orgApacheFelixWebconsolePluginsDs, ConfigNodePropertyString orgApacheFelixWebconsolePluginsEvent, ConfigNodePropertyString orgApacheFelixWebconsolePluginsMemoryusage, ConfigNodePropertyString orgApacheFelixWebconsolePluginsPackageadmin, ConfigNodePropertyString orgApacheJackrabbitOakAuthLdap, ConfigNodePropertyString orgApacheJackrabbitOakSegmentTar, ConfigNodePropertyString orgApacheJackrabbitOakSolrOsgi, ConfigNodePropertyString orgApacheSlingBundleresourceImpl, ConfigNodePropertyString orgApacheSlingCommonsFsclassloader, ConfigNodePropertyString orgApacheSlingCommonsLogWebconsole, ConfigNodePropertyString orgApacheSlingDatasource, ConfigNodePropertyString orgApacheSlingDiscoveryBase, ConfigNodePropertyString orgApacheSlingDiscoveryOak, ConfigNodePropertyString orgApacheSlingDiscoverySupport, ConfigNodePropertyString orgApacheSlingDistributionApi, ConfigNodePropertyString orgApacheSlingDistributionCore, ConfigNodePropertyString orgApacheSlingExtensionsWebconsolesecurityprovider, ConfigNodePropertyString orgApacheSlingHcWebconsole, ConfigNodePropertyString orgApacheSlingInstallerConsole, ConfigNodePropertyString orgApacheSlingInstallerProviderFile, ConfigNodePropertyString orgApacheSlingInstallerProviderJcr, ConfigNodePropertyString orgApacheSlingJcrDavex, ConfigNodePropertyString orgApacheSlingJcrResourcesecurity, ConfigNodePropertyString orgApacheSlingJmxProvider, ConfigNodePropertyString orgApacheSlingLaunchpadInstaller, ConfigNodePropertyString orgApacheSlingModelsImpl, ConfigNodePropertyString orgApacheSlingRepoinitParser, ConfigNodePropertyString orgApacheSlingResourceInventory, ConfigNodePropertyString orgApacheSlingResourceresolver, ConfigNodePropertyString orgApacheSlingScriptingJavascript, ConfigNodePropertyString orgApacheSlingScriptingJst, ConfigNodePropertyString orgApacheSlingScriptingSightlyJsProvider, ConfigNodePropertyString orgApacheSlingScriptingSightlyModelsProvider, ConfigNodePropertyString orgApacheSlingSecurity, ConfigNodePropertyString orgApacheSlingServletsCompat, ConfigNodePropertyString orgApacheSlingServletsGet, ConfigNodePropertyString orgApacheSlingStartupfilterDisabler, ConfigNodePropertyString orgApacheSlingTracer, ConfigNodePropertyString weRetailClientAppCore) {
    this.comAdobeCqCdnCdnRewriter = comAdobeCqCdnCdnRewriter;
    this.comAdobeCqCloudConfigComponents = comAdobeCqCloudConfigComponents;
    this.comAdobeCqCloudConfigCore = comAdobeCqCloudConfigCore;
    this.comAdobeCqCloudConfigUi = comAdobeCqCloudConfigUi;
    this.comAdobeCqComAdobeCqEditor = comAdobeCqComAdobeCqEditor;
    this.comAdobeCqComAdobeCqProjectsCore = comAdobeCqComAdobeCqProjectsCore;
    this.comAdobeCqComAdobeCqProjectsWcmCore = comAdobeCqComAdobeCqProjectsWcmCore;
    this.comAdobeCqComAdobeCqUiCommons = comAdobeCqComAdobeCqUiCommons;
    this.comAdobeCqComAdobeCqWcmStyle = comAdobeCqComAdobeCqWcmStyle;
    this.comAdobeCqCqActivitymapIntegration = comAdobeCqCqActivitymapIntegration;
    this.comAdobeCqCqContexthubCommons = comAdobeCqCqContexthubCommons;
    this.comAdobeCqCqDtm = comAdobeCqCqDtm;
    this.comAdobeCqCqHealthcheck = comAdobeCqCqHealthcheck;
    this.comAdobeCqCqMultisiteTargeting = comAdobeCqCqMultisiteTargeting;
    this.comAdobeCqCqPreUpgradeCleanup = comAdobeCqCqPreUpgradeCleanup;
    this.comAdobeCqCqProductInfoProvider = comAdobeCqCqProductInfoProvider;
    this.comAdobeCqCqRestSites = comAdobeCqCqRestSites;
    this.comAdobeCqCqSecurityHc = comAdobeCqCqSecurityHc;
    this.comAdobeCqDamCqDamSvgHandler = comAdobeCqDamCqDamSvgHandler;
    this.comAdobeCqDamCqScene7Imaging = comAdobeCqDamCqScene7Imaging;
    this.comAdobeCqDtmReactorCore = comAdobeCqDtmReactorCore;
    this.comAdobeCqDtmReactorUi = comAdobeCqDtmReactorUi;
    this.comAdobeCqExpJspelResolver = comAdobeCqExpJspelResolver;
    this.comAdobeCqInboxCqInbox = comAdobeCqInboxCqInbox;
    this.comAdobeCqJsonSchemaParser = comAdobeCqJsonSchemaParser;
    this.comAdobeCqMediaCqMediaPublishingDpsFpCore = comAdobeCqMediaCqMediaPublishingDpsFpCore;
    this.comAdobeCqMobileCqMobileCaas = comAdobeCqMobileCqMobileCaas;
    this.comAdobeCqMobileCqMobileIndexBuilder = comAdobeCqMobileCqMobileIndexBuilder;
    this.comAdobeCqMobileCqMobilePhonegapBuild = comAdobeCqMobileCqMobilePhonegapBuild;
    this.comAdobeCqMyspell = comAdobeCqMyspell;
    this.comAdobeCqSampleWeRetailCore = comAdobeCqSampleWeRetailCore;
    this.comAdobeCqScreensComAdobeCqScreensDcc = comAdobeCqScreensComAdobeCqScreensDcc;
    this.comAdobeCqScreensComAdobeCqScreensMqCore = comAdobeCqScreensComAdobeCqScreensMqCore;
    this.comAdobeCqSocialCqSocialAsProvider = comAdobeCqSocialCqSocialAsProvider;
    this.comAdobeCqSocialCqSocialBadgingBasicImpl = comAdobeCqSocialCqSocialBadgingBasicImpl;
    this.comAdobeCqSocialCqSocialBadgingImpl = comAdobeCqSocialCqSocialBadgingImpl;
    this.comAdobeCqSocialCqSocialCalendarImpl = comAdobeCqSocialCqSocialCalendarImpl;
    this.comAdobeCqSocialCqSocialContentFragmentsImpl = comAdobeCqSocialCqSocialContentFragmentsImpl;
    this.comAdobeCqSocialCqSocialEnablementImpl = comAdobeCqSocialCqSocialEnablementImpl;
    this.comAdobeCqSocialCqSocialGraphImpl = comAdobeCqSocialCqSocialGraphImpl;
    this.comAdobeCqSocialCqSocialIdeationImpl = comAdobeCqSocialCqSocialIdeationImpl;
    this.comAdobeCqSocialCqSocialJcrProvider = comAdobeCqSocialCqSocialJcrProvider;
    this.comAdobeCqSocialCqSocialMembersImpl = comAdobeCqSocialCqSocialMembersImpl;
    this.comAdobeCqSocialCqSocialMsProvider = comAdobeCqSocialCqSocialMsProvider;
    this.comAdobeCqSocialCqSocialNotificationsChannelsWeb = comAdobeCqSocialCqSocialNotificationsChannelsWeb;
    this.comAdobeCqSocialCqSocialNotificationsImpl = comAdobeCqSocialCqSocialNotificationsImpl;
    this.comAdobeCqSocialCqSocialRdbProvider = comAdobeCqSocialCqSocialRdbProvider;
    this.comAdobeCqSocialCqSocialScfImpl = comAdobeCqSocialCqSocialScfImpl;
    this.comAdobeCqSocialCqSocialScoringBasicImpl = comAdobeCqSocialCqSocialScoringBasicImpl;
    this.comAdobeCqSocialCqSocialScoringImpl = comAdobeCqSocialCqSocialScoringImpl;
    this.comAdobeCqSocialCqSocialServiceusersImpl = comAdobeCqSocialCqSocialServiceusersImpl;
    this.comAdobeCqSocialCqSocialSrpImpl = comAdobeCqSocialCqSocialSrpImpl;
    this.comAdobeCqSocialCqSocialUgcbaseImpl = comAdobeCqSocialCqSocialUgcbaseImpl;
    this.comAdobeDamCqDamCfmImpl = comAdobeDamCqDamCfmImpl;
    this.comAdobeFormsFoundationFormsFoundationBase = comAdobeFormsFoundationFormsFoundationBase;
    this.comAdobeGraniteApicontroller = comAdobeGraniteApicontroller;
    this.comAdobeGraniteAssetCore = comAdobeGraniteAssetCore;
    this.comAdobeGraniteAuthSso = comAdobeGraniteAuthSso;
    this.comAdobeGraniteBundlesHcImpl = comAdobeGraniteBundlesHcImpl;
    this.comAdobeGraniteCompatRouter = comAdobeGraniteCompatRouter;
    this.comAdobeGraniteConf = comAdobeGraniteConf;
    this.comAdobeGraniteConfUiCore = comAdobeGraniteConfUiCore;
    this.comAdobeGraniteCors = comAdobeGraniteCors;
    this.comAdobeGraniteCrxExplorer = comAdobeGraniteCrxExplorer;
    this.comAdobeGraniteCrxdeLite = comAdobeGraniteCrxdeLite;
    this.comAdobeGraniteCryptoConfig = comAdobeGraniteCryptoConfig;
    this.comAdobeGraniteCryptoExtension = comAdobeGraniteCryptoExtension;
    this.comAdobeGraniteCryptoFile = comAdobeGraniteCryptoFile;
    this.comAdobeGraniteCryptoJcr = comAdobeGraniteCryptoJcr;
    this.comAdobeGraniteCsrf = comAdobeGraniteCsrf;
    this.comAdobeGraniteDistributionCore = comAdobeGraniteDistributionCore;
    this.comAdobeGraniteDropwizardMetrics = comAdobeGraniteDropwizardMetrics;
    this.comAdobeGraniteFragsImpl = comAdobeGraniteFragsImpl;
    this.comAdobeGraniteGibson = comAdobeGraniteGibson;
    this.comAdobeGraniteInfocollector = comAdobeGraniteInfocollector;
    this.comAdobeGraniteInstallerFactoryPackages = comAdobeGraniteInstallerFactoryPackages;
    this.comAdobeGraniteJettySsl = comAdobeGraniteJettySsl;
    this.comAdobeGraniteJobsAsync = comAdobeGraniteJobsAsync;
    this.comAdobeGraniteMaintenanceOak = comAdobeGraniteMaintenanceOak;
    this.comAdobeGraniteMonitoringCore = comAdobeGraniteMonitoringCore;
    this.comAdobeGraniteQueries = comAdobeGraniteQueries;
    this.comAdobeGraniteReplicationHcImpl = comAdobeGraniteReplicationHcImpl;
    this.comAdobeGraniteRepositoryChecker = comAdobeGraniteRepositoryChecker;
    this.comAdobeGraniteRepositoryHcImpl = comAdobeGraniteRepositoryHcImpl;
    this.comAdobeGraniteRestAssets = comAdobeGraniteRestAssets;
    this.comAdobeGraniteSecurityUi = comAdobeGraniteSecurityUi;
    this.comAdobeGraniteStartup = comAdobeGraniteStartup;
    this.comAdobeGraniteTagsoup = comAdobeGraniteTagsoup;
    this.comAdobeGraniteTaskmanagementCore = comAdobeGraniteTaskmanagementCore;
    this.comAdobeGraniteTaskmanagementWorkflow = comAdobeGraniteTaskmanagementWorkflow;
    this.comAdobeGraniteUiClientlibsCompilerLess = comAdobeGraniteUiClientlibsCompilerLess;
    this.comAdobeGraniteUiClientlibsProcessorGcc = comAdobeGraniteUiClientlibsProcessorGcc;
    this.comAdobeGraniteWebconsolePlugins = comAdobeGraniteWebconsolePlugins;
    this.comAdobeGraniteWorkflowConsole = comAdobeGraniteWorkflowConsole;
    this.comAdobeXmpWorkerFilesNativeFragmentLinux = comAdobeXmpWorkerFilesNativeFragmentLinux;
    this.comAdobeXmpWorkerFilesNativeFragmentMacosx = comAdobeXmpWorkerFilesNativeFragmentMacosx;
    this.comAdobeXmpWorkerFilesNativeFragmentWin = comAdobeXmpWorkerFilesNativeFragmentWin;
    this.comDayCommonsOsgiWrapperSimpleJndi = comDayCommonsOsgiWrapperSimpleJndi;
    this.comDayCqCqAuthhandler = comDayCqCqAuthhandler;
    this.comDayCqCqCompatConfigupdate = comDayCqCqCompatConfigupdate;
    this.comDayCqCqLicensebranding = comDayCqCqLicensebranding;
    this.comDayCqCqNotifcationImpl = comDayCqCqNotifcationImpl;
    this.comDayCqCqReplicationAudit = comDayCqCqReplicationAudit;
    this.comDayCqCqSearchExt = comDayCqCqSearchExt;
    this.comDayCqDamCqDamAnnotationPrint = comDayCqDamCqDamAnnotationPrint;
    this.comDayCqDamCqDamAssetUsage = comDayCqDamCqDamAssetUsage;
    this.comDayCqDamCqDamS7dam = comDayCqDamCqDamS7dam;
    this.comDayCqDamCqDamSimilaritysearch = comDayCqDamCqDamSimilaritysearch;
    this.comDayCqDamDamWebdavSupport = comDayCqDamDamWebdavSupport;
    this.comDayCqPreUpgradeTasks = comDayCqPreUpgradeTasks;
    this.comDayCqReplicationExtensions = comDayCqReplicationExtensions;
    this.comDayCqWcmCqMsmCore = comDayCqWcmCqMsmCore;
    this.comDayCqWcmCqWcmTranslation = comDayCqWcmCqWcmTranslation;
    this.dayCommonsJrawio = dayCommonsJrawio;
    this.orgApacheAriesJmxWhiteboard = orgApacheAriesJmxWhiteboard;
    this.orgApacheFelixHttpSslfilter = orgApacheFelixHttpSslfilter;
    this.orgApacheFelixOrgApacheFelixThreaddump = orgApacheFelixOrgApacheFelixThreaddump;
    this.orgApacheFelixWebconsolePluginsDs = orgApacheFelixWebconsolePluginsDs;
    this.orgApacheFelixWebconsolePluginsEvent = orgApacheFelixWebconsolePluginsEvent;
    this.orgApacheFelixWebconsolePluginsMemoryusage = orgApacheFelixWebconsolePluginsMemoryusage;
    this.orgApacheFelixWebconsolePluginsPackageadmin = orgApacheFelixWebconsolePluginsPackageadmin;
    this.orgApacheJackrabbitOakAuthLdap = orgApacheJackrabbitOakAuthLdap;
    this.orgApacheJackrabbitOakSegmentTar = orgApacheJackrabbitOakSegmentTar;
    this.orgApacheJackrabbitOakSolrOsgi = orgApacheJackrabbitOakSolrOsgi;
    this.orgApacheSlingBundleresourceImpl = orgApacheSlingBundleresourceImpl;
    this.orgApacheSlingCommonsFsclassloader = orgApacheSlingCommonsFsclassloader;
    this.orgApacheSlingCommonsLogWebconsole = orgApacheSlingCommonsLogWebconsole;
    this.orgApacheSlingDatasource = orgApacheSlingDatasource;
    this.orgApacheSlingDiscoveryBase = orgApacheSlingDiscoveryBase;
    this.orgApacheSlingDiscoveryOak = orgApacheSlingDiscoveryOak;
    this.orgApacheSlingDiscoverySupport = orgApacheSlingDiscoverySupport;
    this.orgApacheSlingDistributionApi = orgApacheSlingDistributionApi;
    this.orgApacheSlingDistributionCore = orgApacheSlingDistributionCore;
    this.orgApacheSlingExtensionsWebconsolesecurityprovider = orgApacheSlingExtensionsWebconsolesecurityprovider;
    this.orgApacheSlingHcWebconsole = orgApacheSlingHcWebconsole;
    this.orgApacheSlingInstallerConsole = orgApacheSlingInstallerConsole;
    this.orgApacheSlingInstallerProviderFile = orgApacheSlingInstallerProviderFile;
    this.orgApacheSlingInstallerProviderJcr = orgApacheSlingInstallerProviderJcr;
    this.orgApacheSlingJcrDavex = orgApacheSlingJcrDavex;
    this.orgApacheSlingJcrResourcesecurity = orgApacheSlingJcrResourcesecurity;
    this.orgApacheSlingJmxProvider = orgApacheSlingJmxProvider;
    this.orgApacheSlingLaunchpadInstaller = orgApacheSlingLaunchpadInstaller;
    this.orgApacheSlingModelsImpl = orgApacheSlingModelsImpl;
    this.orgApacheSlingRepoinitParser = orgApacheSlingRepoinitParser;
    this.orgApacheSlingResourceInventory = orgApacheSlingResourceInventory;
    this.orgApacheSlingResourceresolver = orgApacheSlingResourceresolver;
    this.orgApacheSlingScriptingJavascript = orgApacheSlingScriptingJavascript;
    this.orgApacheSlingScriptingJst = orgApacheSlingScriptingJst;
    this.orgApacheSlingScriptingSightlyJsProvider = orgApacheSlingScriptingSightlyJsProvider;
    this.orgApacheSlingScriptingSightlyModelsProvider = orgApacheSlingScriptingSightlyModelsProvider;
    this.orgApacheSlingSecurity = orgApacheSlingSecurity;
    this.orgApacheSlingServletsCompat = orgApacheSlingServletsCompat;
    this.orgApacheSlingServletsGet = orgApacheSlingServletsGet;
    this.orgApacheSlingStartupfilterDisabler = orgApacheSlingStartupfilterDisabler;
    this.orgApacheSlingTracer = orgApacheSlingTracer;
    this.weRetailClientAppCore = weRetailClientAppCore;
  }

    
  @JsonProperty("com.adobe.cq.cdn.cdn-rewriter")
  public ConfigNodePropertyString getComAdobeCqCdnCdnRewriter() {
    return comAdobeCqCdnCdnRewriter;
  }
  public void setComAdobeCqCdnCdnRewriter(ConfigNodePropertyString comAdobeCqCdnCdnRewriter) {
    this.comAdobeCqCdnCdnRewriter = comAdobeCqCdnCdnRewriter;
  }

    
  @JsonProperty("com.adobe.cq.cloud-config.components")
  public ConfigNodePropertyString getComAdobeCqCloudConfigComponents() {
    return comAdobeCqCloudConfigComponents;
  }
  public void setComAdobeCqCloudConfigComponents(ConfigNodePropertyString comAdobeCqCloudConfigComponents) {
    this.comAdobeCqCloudConfigComponents = comAdobeCqCloudConfigComponents;
  }

    
  @JsonProperty("com.adobe.cq.cloud-config.core")
  public ConfigNodePropertyString getComAdobeCqCloudConfigCore() {
    return comAdobeCqCloudConfigCore;
  }
  public void setComAdobeCqCloudConfigCore(ConfigNodePropertyString comAdobeCqCloudConfigCore) {
    this.comAdobeCqCloudConfigCore = comAdobeCqCloudConfigCore;
  }

    
  @JsonProperty("com.adobe.cq.cloud-config.ui")
  public ConfigNodePropertyString getComAdobeCqCloudConfigUi() {
    return comAdobeCqCloudConfigUi;
  }
  public void setComAdobeCqCloudConfigUi(ConfigNodePropertyString comAdobeCqCloudConfigUi) {
    this.comAdobeCqCloudConfigUi = comAdobeCqCloudConfigUi;
  }

    
  @JsonProperty("com.adobe.cq.com.adobe.cq.editor")
  public ConfigNodePropertyString getComAdobeCqComAdobeCqEditor() {
    return comAdobeCqComAdobeCqEditor;
  }
  public void setComAdobeCqComAdobeCqEditor(ConfigNodePropertyString comAdobeCqComAdobeCqEditor) {
    this.comAdobeCqComAdobeCqEditor = comAdobeCqComAdobeCqEditor;
  }

    
  @JsonProperty("com.adobe.cq.com.adobe.cq.projects.core")
  public ConfigNodePropertyString getComAdobeCqComAdobeCqProjectsCore() {
    return comAdobeCqComAdobeCqProjectsCore;
  }
  public void setComAdobeCqComAdobeCqProjectsCore(ConfigNodePropertyString comAdobeCqComAdobeCqProjectsCore) {
    this.comAdobeCqComAdobeCqProjectsCore = comAdobeCqComAdobeCqProjectsCore;
  }

    
  @JsonProperty("com.adobe.cq.com.adobe.cq.projects.wcm.core")
  public ConfigNodePropertyString getComAdobeCqComAdobeCqProjectsWcmCore() {
    return comAdobeCqComAdobeCqProjectsWcmCore;
  }
  public void setComAdobeCqComAdobeCqProjectsWcmCore(ConfigNodePropertyString comAdobeCqComAdobeCqProjectsWcmCore) {
    this.comAdobeCqComAdobeCqProjectsWcmCore = comAdobeCqComAdobeCqProjectsWcmCore;
  }

    
  @JsonProperty("com.adobe.cq.com.adobe.cq.ui.commons")
  public ConfigNodePropertyString getComAdobeCqComAdobeCqUiCommons() {
    return comAdobeCqComAdobeCqUiCommons;
  }
  public void setComAdobeCqComAdobeCqUiCommons(ConfigNodePropertyString comAdobeCqComAdobeCqUiCommons) {
    this.comAdobeCqComAdobeCqUiCommons = comAdobeCqComAdobeCqUiCommons;
  }

    
  @JsonProperty("com.adobe.cq.com.adobe.cq.wcm.style")
  public ConfigNodePropertyString getComAdobeCqComAdobeCqWcmStyle() {
    return comAdobeCqComAdobeCqWcmStyle;
  }
  public void setComAdobeCqComAdobeCqWcmStyle(ConfigNodePropertyString comAdobeCqComAdobeCqWcmStyle) {
    this.comAdobeCqComAdobeCqWcmStyle = comAdobeCqComAdobeCqWcmStyle;
  }

    
  @JsonProperty("com.adobe.cq.cq-activitymap-integration")
  public ConfigNodePropertyString getComAdobeCqCqActivitymapIntegration() {
    return comAdobeCqCqActivitymapIntegration;
  }
  public void setComAdobeCqCqActivitymapIntegration(ConfigNodePropertyString comAdobeCqCqActivitymapIntegration) {
    this.comAdobeCqCqActivitymapIntegration = comAdobeCqCqActivitymapIntegration;
  }

    
  @JsonProperty("com.adobe.cq.cq-contexthub-commons")
  public ConfigNodePropertyString getComAdobeCqCqContexthubCommons() {
    return comAdobeCqCqContexthubCommons;
  }
  public void setComAdobeCqCqContexthubCommons(ConfigNodePropertyString comAdobeCqCqContexthubCommons) {
    this.comAdobeCqCqContexthubCommons = comAdobeCqCqContexthubCommons;
  }

    
  @JsonProperty("com.adobe.cq.cq-dtm")
  public ConfigNodePropertyString getComAdobeCqCqDtm() {
    return comAdobeCqCqDtm;
  }
  public void setComAdobeCqCqDtm(ConfigNodePropertyString comAdobeCqCqDtm) {
    this.comAdobeCqCqDtm = comAdobeCqCqDtm;
  }

    
  @JsonProperty("com.adobe.cq.cq-healthcheck")
  public ConfigNodePropertyString getComAdobeCqCqHealthcheck() {
    return comAdobeCqCqHealthcheck;
  }
  public void setComAdobeCqCqHealthcheck(ConfigNodePropertyString comAdobeCqCqHealthcheck) {
    this.comAdobeCqCqHealthcheck = comAdobeCqCqHealthcheck;
  }

    
  @JsonProperty("com.adobe.cq.cq-multisite-targeting")
  public ConfigNodePropertyString getComAdobeCqCqMultisiteTargeting() {
    return comAdobeCqCqMultisiteTargeting;
  }
  public void setComAdobeCqCqMultisiteTargeting(ConfigNodePropertyString comAdobeCqCqMultisiteTargeting) {
    this.comAdobeCqCqMultisiteTargeting = comAdobeCqCqMultisiteTargeting;
  }

    
  @JsonProperty("com.adobe.cq.cq-pre-upgrade-cleanup")
  public ConfigNodePropertyString getComAdobeCqCqPreUpgradeCleanup() {
    return comAdobeCqCqPreUpgradeCleanup;
  }
  public void setComAdobeCqCqPreUpgradeCleanup(ConfigNodePropertyString comAdobeCqCqPreUpgradeCleanup) {
    this.comAdobeCqCqPreUpgradeCleanup = comAdobeCqCqPreUpgradeCleanup;
  }

    
  @JsonProperty("com.adobe.cq.cq-product-info-provider")
  public ConfigNodePropertyString getComAdobeCqCqProductInfoProvider() {
    return comAdobeCqCqProductInfoProvider;
  }
  public void setComAdobeCqCqProductInfoProvider(ConfigNodePropertyString comAdobeCqCqProductInfoProvider) {
    this.comAdobeCqCqProductInfoProvider = comAdobeCqCqProductInfoProvider;
  }

    
  @JsonProperty("com.adobe.cq.cq-rest-sites")
  public ConfigNodePropertyString getComAdobeCqCqRestSites() {
    return comAdobeCqCqRestSites;
  }
  public void setComAdobeCqCqRestSites(ConfigNodePropertyString comAdobeCqCqRestSites) {
    this.comAdobeCqCqRestSites = comAdobeCqCqRestSites;
  }

    
  @JsonProperty("com.adobe.cq.cq-security-hc")
  public ConfigNodePropertyString getComAdobeCqCqSecurityHc() {
    return comAdobeCqCqSecurityHc;
  }
  public void setComAdobeCqCqSecurityHc(ConfigNodePropertyString comAdobeCqCqSecurityHc) {
    this.comAdobeCqCqSecurityHc = comAdobeCqCqSecurityHc;
  }

    
  @JsonProperty("com.adobe.cq.dam.cq-dam-svg-handler")
  public ConfigNodePropertyString getComAdobeCqDamCqDamSvgHandler() {
    return comAdobeCqDamCqDamSvgHandler;
  }
  public void setComAdobeCqDamCqDamSvgHandler(ConfigNodePropertyString comAdobeCqDamCqDamSvgHandler) {
    this.comAdobeCqDamCqDamSvgHandler = comAdobeCqDamCqDamSvgHandler;
  }

    
  @JsonProperty("com.adobe.cq.dam.cq-scene7-imaging")
  public ConfigNodePropertyString getComAdobeCqDamCqScene7Imaging() {
    return comAdobeCqDamCqScene7Imaging;
  }
  public void setComAdobeCqDamCqScene7Imaging(ConfigNodePropertyString comAdobeCqDamCqScene7Imaging) {
    this.comAdobeCqDamCqScene7Imaging = comAdobeCqDamCqScene7Imaging;
  }

    
  @JsonProperty("com.adobe.cq.dtm-reactor.core")
  public ConfigNodePropertyString getComAdobeCqDtmReactorCore() {
    return comAdobeCqDtmReactorCore;
  }
  public void setComAdobeCqDtmReactorCore(ConfigNodePropertyString comAdobeCqDtmReactorCore) {
    this.comAdobeCqDtmReactorCore = comAdobeCqDtmReactorCore;
  }

    
  @JsonProperty("com.adobe.cq.dtm-reactor.ui")
  public ConfigNodePropertyString getComAdobeCqDtmReactorUi() {
    return comAdobeCqDtmReactorUi;
  }
  public void setComAdobeCqDtmReactorUi(ConfigNodePropertyString comAdobeCqDtmReactorUi) {
    this.comAdobeCqDtmReactorUi = comAdobeCqDtmReactorUi;
  }

    
  @JsonProperty("com.adobe.cq.exp-jspel-resolver")
  public ConfigNodePropertyString getComAdobeCqExpJspelResolver() {
    return comAdobeCqExpJspelResolver;
  }
  public void setComAdobeCqExpJspelResolver(ConfigNodePropertyString comAdobeCqExpJspelResolver) {
    this.comAdobeCqExpJspelResolver = comAdobeCqExpJspelResolver;
  }

    
  @JsonProperty("com.adobe.cq.inbox.cq-inbox")
  public ConfigNodePropertyString getComAdobeCqInboxCqInbox() {
    return comAdobeCqInboxCqInbox;
  }
  public void setComAdobeCqInboxCqInbox(ConfigNodePropertyString comAdobeCqInboxCqInbox) {
    this.comAdobeCqInboxCqInbox = comAdobeCqInboxCqInbox;
  }

    
  @JsonProperty("com.adobe.cq.json-schema-parser")
  public ConfigNodePropertyString getComAdobeCqJsonSchemaParser() {
    return comAdobeCqJsonSchemaParser;
  }
  public void setComAdobeCqJsonSchemaParser(ConfigNodePropertyString comAdobeCqJsonSchemaParser) {
    this.comAdobeCqJsonSchemaParser = comAdobeCqJsonSchemaParser;
  }

    
  @JsonProperty("com.adobe.cq.media.cq-media-publishing-dps-fp-core")
  public ConfigNodePropertyString getComAdobeCqMediaCqMediaPublishingDpsFpCore() {
    return comAdobeCqMediaCqMediaPublishingDpsFpCore;
  }
  public void setComAdobeCqMediaCqMediaPublishingDpsFpCore(ConfigNodePropertyString comAdobeCqMediaCqMediaPublishingDpsFpCore) {
    this.comAdobeCqMediaCqMediaPublishingDpsFpCore = comAdobeCqMediaCqMediaPublishingDpsFpCore;
  }

    
  @JsonProperty("com.adobe.cq.mobile.cq-mobile-caas")
  public ConfigNodePropertyString getComAdobeCqMobileCqMobileCaas() {
    return comAdobeCqMobileCqMobileCaas;
  }
  public void setComAdobeCqMobileCqMobileCaas(ConfigNodePropertyString comAdobeCqMobileCqMobileCaas) {
    this.comAdobeCqMobileCqMobileCaas = comAdobeCqMobileCqMobileCaas;
  }

    
  @JsonProperty("com.adobe.cq.mobile.cq-mobile-index-builder")
  public ConfigNodePropertyString getComAdobeCqMobileCqMobileIndexBuilder() {
    return comAdobeCqMobileCqMobileIndexBuilder;
  }
  public void setComAdobeCqMobileCqMobileIndexBuilder(ConfigNodePropertyString comAdobeCqMobileCqMobileIndexBuilder) {
    this.comAdobeCqMobileCqMobileIndexBuilder = comAdobeCqMobileCqMobileIndexBuilder;
  }

    
  @JsonProperty("com.adobe.cq.mobile.cq-mobile-phonegap-build")
  public ConfigNodePropertyString getComAdobeCqMobileCqMobilePhonegapBuild() {
    return comAdobeCqMobileCqMobilePhonegapBuild;
  }
  public void setComAdobeCqMobileCqMobilePhonegapBuild(ConfigNodePropertyString comAdobeCqMobileCqMobilePhonegapBuild) {
    this.comAdobeCqMobileCqMobilePhonegapBuild = comAdobeCqMobileCqMobilePhonegapBuild;
  }

    
  @JsonProperty("com.adobe.cq.myspell")
  public ConfigNodePropertyString getComAdobeCqMyspell() {
    return comAdobeCqMyspell;
  }
  public void setComAdobeCqMyspell(ConfigNodePropertyString comAdobeCqMyspell) {
    this.comAdobeCqMyspell = comAdobeCqMyspell;
  }

    
  @JsonProperty("com.adobe.cq.sample.we.retail.core")
  public ConfigNodePropertyString getComAdobeCqSampleWeRetailCore() {
    return comAdobeCqSampleWeRetailCore;
  }
  public void setComAdobeCqSampleWeRetailCore(ConfigNodePropertyString comAdobeCqSampleWeRetailCore) {
    this.comAdobeCqSampleWeRetailCore = comAdobeCqSampleWeRetailCore;
  }

    
  @JsonProperty("com.adobe.cq.screens.com.adobe.cq.screens.dcc")
  public ConfigNodePropertyString getComAdobeCqScreensComAdobeCqScreensDcc() {
    return comAdobeCqScreensComAdobeCqScreensDcc;
  }
  public void setComAdobeCqScreensComAdobeCqScreensDcc(ConfigNodePropertyString comAdobeCqScreensComAdobeCqScreensDcc) {
    this.comAdobeCqScreensComAdobeCqScreensDcc = comAdobeCqScreensComAdobeCqScreensDcc;
  }

    
  @JsonProperty("com.adobe.cq.screens.com.adobe.cq.screens.mq.core")
  public ConfigNodePropertyString getComAdobeCqScreensComAdobeCqScreensMqCore() {
    return comAdobeCqScreensComAdobeCqScreensMqCore;
  }
  public void setComAdobeCqScreensComAdobeCqScreensMqCore(ConfigNodePropertyString comAdobeCqScreensComAdobeCqScreensMqCore) {
    this.comAdobeCqScreensComAdobeCqScreensMqCore = comAdobeCqScreensComAdobeCqScreensMqCore;
  }

    
  @JsonProperty("com.adobe.cq.social.cq-social-as-provider")
  public ConfigNodePropertyString getComAdobeCqSocialCqSocialAsProvider() {
    return comAdobeCqSocialCqSocialAsProvider;
  }
  public void setComAdobeCqSocialCqSocialAsProvider(ConfigNodePropertyString comAdobeCqSocialCqSocialAsProvider) {
    this.comAdobeCqSocialCqSocialAsProvider = comAdobeCqSocialCqSocialAsProvider;
  }

    
  @JsonProperty("com.adobe.cq.social.cq-social-badging-basic-impl")
  public ConfigNodePropertyString getComAdobeCqSocialCqSocialBadgingBasicImpl() {
    return comAdobeCqSocialCqSocialBadgingBasicImpl;
  }
  public void setComAdobeCqSocialCqSocialBadgingBasicImpl(ConfigNodePropertyString comAdobeCqSocialCqSocialBadgingBasicImpl) {
    this.comAdobeCqSocialCqSocialBadgingBasicImpl = comAdobeCqSocialCqSocialBadgingBasicImpl;
  }

    
  @JsonProperty("com.adobe.cq.social.cq-social-badging-impl")
  public ConfigNodePropertyString getComAdobeCqSocialCqSocialBadgingImpl() {
    return comAdobeCqSocialCqSocialBadgingImpl;
  }
  public void setComAdobeCqSocialCqSocialBadgingImpl(ConfigNodePropertyString comAdobeCqSocialCqSocialBadgingImpl) {
    this.comAdobeCqSocialCqSocialBadgingImpl = comAdobeCqSocialCqSocialBadgingImpl;
  }

    
  @JsonProperty("com.adobe.cq.social.cq-social-calendar-impl")
  public ConfigNodePropertyString getComAdobeCqSocialCqSocialCalendarImpl() {
    return comAdobeCqSocialCqSocialCalendarImpl;
  }
  public void setComAdobeCqSocialCqSocialCalendarImpl(ConfigNodePropertyString comAdobeCqSocialCqSocialCalendarImpl) {
    this.comAdobeCqSocialCqSocialCalendarImpl = comAdobeCqSocialCqSocialCalendarImpl;
  }

    
  @JsonProperty("com.adobe.cq.social.cq-social-content-fragments-impl")
  public ConfigNodePropertyString getComAdobeCqSocialCqSocialContentFragmentsImpl() {
    return comAdobeCqSocialCqSocialContentFragmentsImpl;
  }
  public void setComAdobeCqSocialCqSocialContentFragmentsImpl(ConfigNodePropertyString comAdobeCqSocialCqSocialContentFragmentsImpl) {
    this.comAdobeCqSocialCqSocialContentFragmentsImpl = comAdobeCqSocialCqSocialContentFragmentsImpl;
  }

    
  @JsonProperty("com.adobe.cq.social.cq-social-enablement-impl")
  public ConfigNodePropertyString getComAdobeCqSocialCqSocialEnablementImpl() {
    return comAdobeCqSocialCqSocialEnablementImpl;
  }
  public void setComAdobeCqSocialCqSocialEnablementImpl(ConfigNodePropertyString comAdobeCqSocialCqSocialEnablementImpl) {
    this.comAdobeCqSocialCqSocialEnablementImpl = comAdobeCqSocialCqSocialEnablementImpl;
  }

    
  @JsonProperty("com.adobe.cq.social.cq-social-graph-impl")
  public ConfigNodePropertyString getComAdobeCqSocialCqSocialGraphImpl() {
    return comAdobeCqSocialCqSocialGraphImpl;
  }
  public void setComAdobeCqSocialCqSocialGraphImpl(ConfigNodePropertyString comAdobeCqSocialCqSocialGraphImpl) {
    this.comAdobeCqSocialCqSocialGraphImpl = comAdobeCqSocialCqSocialGraphImpl;
  }

    
  @JsonProperty("com.adobe.cq.social.cq-social-ideation-impl")
  public ConfigNodePropertyString getComAdobeCqSocialCqSocialIdeationImpl() {
    return comAdobeCqSocialCqSocialIdeationImpl;
  }
  public void setComAdobeCqSocialCqSocialIdeationImpl(ConfigNodePropertyString comAdobeCqSocialCqSocialIdeationImpl) {
    this.comAdobeCqSocialCqSocialIdeationImpl = comAdobeCqSocialCqSocialIdeationImpl;
  }

    
  @JsonProperty("com.adobe.cq.social.cq-social-jcr-provider")
  public ConfigNodePropertyString getComAdobeCqSocialCqSocialJcrProvider() {
    return comAdobeCqSocialCqSocialJcrProvider;
  }
  public void setComAdobeCqSocialCqSocialJcrProvider(ConfigNodePropertyString comAdobeCqSocialCqSocialJcrProvider) {
    this.comAdobeCqSocialCqSocialJcrProvider = comAdobeCqSocialCqSocialJcrProvider;
  }

    
  @JsonProperty("com.adobe.cq.social.cq-social-members-impl")
  public ConfigNodePropertyString getComAdobeCqSocialCqSocialMembersImpl() {
    return comAdobeCqSocialCqSocialMembersImpl;
  }
  public void setComAdobeCqSocialCqSocialMembersImpl(ConfigNodePropertyString comAdobeCqSocialCqSocialMembersImpl) {
    this.comAdobeCqSocialCqSocialMembersImpl = comAdobeCqSocialCqSocialMembersImpl;
  }

    
  @JsonProperty("com.adobe.cq.social.cq-social-ms-provider")
  public ConfigNodePropertyString getComAdobeCqSocialCqSocialMsProvider() {
    return comAdobeCqSocialCqSocialMsProvider;
  }
  public void setComAdobeCqSocialCqSocialMsProvider(ConfigNodePropertyString comAdobeCqSocialCqSocialMsProvider) {
    this.comAdobeCqSocialCqSocialMsProvider = comAdobeCqSocialCqSocialMsProvider;
  }

    
  @JsonProperty("com.adobe.cq.social.cq-social-notifications-channels-web")
  public ConfigNodePropertyString getComAdobeCqSocialCqSocialNotificationsChannelsWeb() {
    return comAdobeCqSocialCqSocialNotificationsChannelsWeb;
  }
  public void setComAdobeCqSocialCqSocialNotificationsChannelsWeb(ConfigNodePropertyString comAdobeCqSocialCqSocialNotificationsChannelsWeb) {
    this.comAdobeCqSocialCqSocialNotificationsChannelsWeb = comAdobeCqSocialCqSocialNotificationsChannelsWeb;
  }

    
  @JsonProperty("com.adobe.cq.social.cq-social-notifications-impl")
  public ConfigNodePropertyString getComAdobeCqSocialCqSocialNotificationsImpl() {
    return comAdobeCqSocialCqSocialNotificationsImpl;
  }
  public void setComAdobeCqSocialCqSocialNotificationsImpl(ConfigNodePropertyString comAdobeCqSocialCqSocialNotificationsImpl) {
    this.comAdobeCqSocialCqSocialNotificationsImpl = comAdobeCqSocialCqSocialNotificationsImpl;
  }

    
  @JsonProperty("com.adobe.cq.social.cq-social-rdb-provider")
  public ConfigNodePropertyString getComAdobeCqSocialCqSocialRdbProvider() {
    return comAdobeCqSocialCqSocialRdbProvider;
  }
  public void setComAdobeCqSocialCqSocialRdbProvider(ConfigNodePropertyString comAdobeCqSocialCqSocialRdbProvider) {
    this.comAdobeCqSocialCqSocialRdbProvider = comAdobeCqSocialCqSocialRdbProvider;
  }

    
  @JsonProperty("com.adobe.cq.social.cq-social-scf-impl")
  public ConfigNodePropertyString getComAdobeCqSocialCqSocialScfImpl() {
    return comAdobeCqSocialCqSocialScfImpl;
  }
  public void setComAdobeCqSocialCqSocialScfImpl(ConfigNodePropertyString comAdobeCqSocialCqSocialScfImpl) {
    this.comAdobeCqSocialCqSocialScfImpl = comAdobeCqSocialCqSocialScfImpl;
  }

    
  @JsonProperty("com.adobe.cq.social.cq-social-scoring-basic-impl")
  public ConfigNodePropertyString getComAdobeCqSocialCqSocialScoringBasicImpl() {
    return comAdobeCqSocialCqSocialScoringBasicImpl;
  }
  public void setComAdobeCqSocialCqSocialScoringBasicImpl(ConfigNodePropertyString comAdobeCqSocialCqSocialScoringBasicImpl) {
    this.comAdobeCqSocialCqSocialScoringBasicImpl = comAdobeCqSocialCqSocialScoringBasicImpl;
  }

    
  @JsonProperty("com.adobe.cq.social.cq-social-scoring-impl")
  public ConfigNodePropertyString getComAdobeCqSocialCqSocialScoringImpl() {
    return comAdobeCqSocialCqSocialScoringImpl;
  }
  public void setComAdobeCqSocialCqSocialScoringImpl(ConfigNodePropertyString comAdobeCqSocialCqSocialScoringImpl) {
    this.comAdobeCqSocialCqSocialScoringImpl = comAdobeCqSocialCqSocialScoringImpl;
  }

    
  @JsonProperty("com.adobe.cq.social.cq-social-serviceusers-impl")
  public ConfigNodePropertyString getComAdobeCqSocialCqSocialServiceusersImpl() {
    return comAdobeCqSocialCqSocialServiceusersImpl;
  }
  public void setComAdobeCqSocialCqSocialServiceusersImpl(ConfigNodePropertyString comAdobeCqSocialCqSocialServiceusersImpl) {
    this.comAdobeCqSocialCqSocialServiceusersImpl = comAdobeCqSocialCqSocialServiceusersImpl;
  }

    
  @JsonProperty("com.adobe.cq.social.cq-social-srp-impl")
  public ConfigNodePropertyString getComAdobeCqSocialCqSocialSrpImpl() {
    return comAdobeCqSocialCqSocialSrpImpl;
  }
  public void setComAdobeCqSocialCqSocialSrpImpl(ConfigNodePropertyString comAdobeCqSocialCqSocialSrpImpl) {
    this.comAdobeCqSocialCqSocialSrpImpl = comAdobeCqSocialCqSocialSrpImpl;
  }

    
  @JsonProperty("com.adobe.cq.social.cq-social-ugcbase-impl")
  public ConfigNodePropertyString getComAdobeCqSocialCqSocialUgcbaseImpl() {
    return comAdobeCqSocialCqSocialUgcbaseImpl;
  }
  public void setComAdobeCqSocialCqSocialUgcbaseImpl(ConfigNodePropertyString comAdobeCqSocialCqSocialUgcbaseImpl) {
    this.comAdobeCqSocialCqSocialUgcbaseImpl = comAdobeCqSocialCqSocialUgcbaseImpl;
  }

    
  @JsonProperty("com.adobe.dam.cq-dam-cfm-impl")
  public ConfigNodePropertyString getComAdobeDamCqDamCfmImpl() {
    return comAdobeDamCqDamCfmImpl;
  }
  public void setComAdobeDamCqDamCfmImpl(ConfigNodePropertyString comAdobeDamCqDamCfmImpl) {
    this.comAdobeDamCqDamCfmImpl = comAdobeDamCqDamCfmImpl;
  }

    
  @JsonProperty("com.adobe.forms.foundation-forms-foundation-base")
  public ConfigNodePropertyString getComAdobeFormsFoundationFormsFoundationBase() {
    return comAdobeFormsFoundationFormsFoundationBase;
  }
  public void setComAdobeFormsFoundationFormsFoundationBase(ConfigNodePropertyString comAdobeFormsFoundationFormsFoundationBase) {
    this.comAdobeFormsFoundationFormsFoundationBase = comAdobeFormsFoundationFormsFoundationBase;
  }

    
  @JsonProperty("com.adobe.granite.apicontroller")
  public ConfigNodePropertyString getComAdobeGraniteApicontroller() {
    return comAdobeGraniteApicontroller;
  }
  public void setComAdobeGraniteApicontroller(ConfigNodePropertyString comAdobeGraniteApicontroller) {
    this.comAdobeGraniteApicontroller = comAdobeGraniteApicontroller;
  }

    
  @JsonProperty("com.adobe.granite.asset.core")
  public ConfigNodePropertyString getComAdobeGraniteAssetCore() {
    return comAdobeGraniteAssetCore;
  }
  public void setComAdobeGraniteAssetCore(ConfigNodePropertyString comAdobeGraniteAssetCore) {
    this.comAdobeGraniteAssetCore = comAdobeGraniteAssetCore;
  }

    
  @JsonProperty("com.adobe.granite.auth.sso")
  public ConfigNodePropertyString getComAdobeGraniteAuthSso() {
    return comAdobeGraniteAuthSso;
  }
  public void setComAdobeGraniteAuthSso(ConfigNodePropertyString comAdobeGraniteAuthSso) {
    this.comAdobeGraniteAuthSso = comAdobeGraniteAuthSso;
  }

    
  @JsonProperty("com.adobe.granite.bundles.hc.impl")
  public ConfigNodePropertyString getComAdobeGraniteBundlesHcImpl() {
    return comAdobeGraniteBundlesHcImpl;
  }
  public void setComAdobeGraniteBundlesHcImpl(ConfigNodePropertyString comAdobeGraniteBundlesHcImpl) {
    this.comAdobeGraniteBundlesHcImpl = comAdobeGraniteBundlesHcImpl;
  }

    
  @JsonProperty("com.adobe.granite.compat-router")
  public ConfigNodePropertyString getComAdobeGraniteCompatRouter() {
    return comAdobeGraniteCompatRouter;
  }
  public void setComAdobeGraniteCompatRouter(ConfigNodePropertyString comAdobeGraniteCompatRouter) {
    this.comAdobeGraniteCompatRouter = comAdobeGraniteCompatRouter;
  }

    
  @JsonProperty("com.adobe.granite.conf")
  public ConfigNodePropertyString getComAdobeGraniteConf() {
    return comAdobeGraniteConf;
  }
  public void setComAdobeGraniteConf(ConfigNodePropertyString comAdobeGraniteConf) {
    this.comAdobeGraniteConf = comAdobeGraniteConf;
  }

    
  @JsonProperty("com.adobe.granite.conf.ui.core")
  public ConfigNodePropertyString getComAdobeGraniteConfUiCore() {
    return comAdobeGraniteConfUiCore;
  }
  public void setComAdobeGraniteConfUiCore(ConfigNodePropertyString comAdobeGraniteConfUiCore) {
    this.comAdobeGraniteConfUiCore = comAdobeGraniteConfUiCore;
  }

    
  @JsonProperty("com.adobe.granite.cors")
  public ConfigNodePropertyString getComAdobeGraniteCors() {
    return comAdobeGraniteCors;
  }
  public void setComAdobeGraniteCors(ConfigNodePropertyString comAdobeGraniteCors) {
    this.comAdobeGraniteCors = comAdobeGraniteCors;
  }

    
  @JsonProperty("com.adobe.granite.crx-explorer")
  public ConfigNodePropertyString getComAdobeGraniteCrxExplorer() {
    return comAdobeGraniteCrxExplorer;
  }
  public void setComAdobeGraniteCrxExplorer(ConfigNodePropertyString comAdobeGraniteCrxExplorer) {
    this.comAdobeGraniteCrxExplorer = comAdobeGraniteCrxExplorer;
  }

    
  @JsonProperty("com.adobe.granite.crxde-lite")
  public ConfigNodePropertyString getComAdobeGraniteCrxdeLite() {
    return comAdobeGraniteCrxdeLite;
  }
  public void setComAdobeGraniteCrxdeLite(ConfigNodePropertyString comAdobeGraniteCrxdeLite) {
    this.comAdobeGraniteCrxdeLite = comAdobeGraniteCrxdeLite;
  }

    
  @JsonProperty("com.adobe.granite.crypto.config")
  public ConfigNodePropertyString getComAdobeGraniteCryptoConfig() {
    return comAdobeGraniteCryptoConfig;
  }
  public void setComAdobeGraniteCryptoConfig(ConfigNodePropertyString comAdobeGraniteCryptoConfig) {
    this.comAdobeGraniteCryptoConfig = comAdobeGraniteCryptoConfig;
  }

    
  @JsonProperty("com.adobe.granite.crypto.extension")
  public ConfigNodePropertyString getComAdobeGraniteCryptoExtension() {
    return comAdobeGraniteCryptoExtension;
  }
  public void setComAdobeGraniteCryptoExtension(ConfigNodePropertyString comAdobeGraniteCryptoExtension) {
    this.comAdobeGraniteCryptoExtension = comAdobeGraniteCryptoExtension;
  }

    
  @JsonProperty("com.adobe.granite.crypto.file")
  public ConfigNodePropertyString getComAdobeGraniteCryptoFile() {
    return comAdobeGraniteCryptoFile;
  }
  public void setComAdobeGraniteCryptoFile(ConfigNodePropertyString comAdobeGraniteCryptoFile) {
    this.comAdobeGraniteCryptoFile = comAdobeGraniteCryptoFile;
  }

    
  @JsonProperty("com.adobe.granite.crypto.jcr")
  public ConfigNodePropertyString getComAdobeGraniteCryptoJcr() {
    return comAdobeGraniteCryptoJcr;
  }
  public void setComAdobeGraniteCryptoJcr(ConfigNodePropertyString comAdobeGraniteCryptoJcr) {
    this.comAdobeGraniteCryptoJcr = comAdobeGraniteCryptoJcr;
  }

    
  @JsonProperty("com.adobe.granite.csrf")
  public ConfigNodePropertyString getComAdobeGraniteCsrf() {
    return comAdobeGraniteCsrf;
  }
  public void setComAdobeGraniteCsrf(ConfigNodePropertyString comAdobeGraniteCsrf) {
    this.comAdobeGraniteCsrf = comAdobeGraniteCsrf;
  }

    
  @JsonProperty("com.adobe.granite.distribution.core")
  public ConfigNodePropertyString getComAdobeGraniteDistributionCore() {
    return comAdobeGraniteDistributionCore;
  }
  public void setComAdobeGraniteDistributionCore(ConfigNodePropertyString comAdobeGraniteDistributionCore) {
    this.comAdobeGraniteDistributionCore = comAdobeGraniteDistributionCore;
  }

    
  @JsonProperty("com.adobe.granite.dropwizard.metrics")
  public ConfigNodePropertyString getComAdobeGraniteDropwizardMetrics() {
    return comAdobeGraniteDropwizardMetrics;
  }
  public void setComAdobeGraniteDropwizardMetrics(ConfigNodePropertyString comAdobeGraniteDropwizardMetrics) {
    this.comAdobeGraniteDropwizardMetrics = comAdobeGraniteDropwizardMetrics;
  }

    
  @JsonProperty("com.adobe.granite.frags.impl")
  public ConfigNodePropertyString getComAdobeGraniteFragsImpl() {
    return comAdobeGraniteFragsImpl;
  }
  public void setComAdobeGraniteFragsImpl(ConfigNodePropertyString comAdobeGraniteFragsImpl) {
    this.comAdobeGraniteFragsImpl = comAdobeGraniteFragsImpl;
  }

    
  @JsonProperty("com.adobe.granite.gibson")
  public ConfigNodePropertyString getComAdobeGraniteGibson() {
    return comAdobeGraniteGibson;
  }
  public void setComAdobeGraniteGibson(ConfigNodePropertyString comAdobeGraniteGibson) {
    this.comAdobeGraniteGibson = comAdobeGraniteGibson;
  }

    
  @JsonProperty("com.adobe.granite.infocollector")
  public ConfigNodePropertyString getComAdobeGraniteInfocollector() {
    return comAdobeGraniteInfocollector;
  }
  public void setComAdobeGraniteInfocollector(ConfigNodePropertyString comAdobeGraniteInfocollector) {
    this.comAdobeGraniteInfocollector = comAdobeGraniteInfocollector;
  }

    
  @JsonProperty("com.adobe.granite.installer.factory.packages")
  public ConfigNodePropertyString getComAdobeGraniteInstallerFactoryPackages() {
    return comAdobeGraniteInstallerFactoryPackages;
  }
  public void setComAdobeGraniteInstallerFactoryPackages(ConfigNodePropertyString comAdobeGraniteInstallerFactoryPackages) {
    this.comAdobeGraniteInstallerFactoryPackages = comAdobeGraniteInstallerFactoryPackages;
  }

    
  @JsonProperty("com.adobe.granite.jetty.ssl")
  public ConfigNodePropertyString getComAdobeGraniteJettySsl() {
    return comAdobeGraniteJettySsl;
  }
  public void setComAdobeGraniteJettySsl(ConfigNodePropertyString comAdobeGraniteJettySsl) {
    this.comAdobeGraniteJettySsl = comAdobeGraniteJettySsl;
  }

    
  @JsonProperty("com.adobe.granite.jobs.async")
  public ConfigNodePropertyString getComAdobeGraniteJobsAsync() {
    return comAdobeGraniteJobsAsync;
  }
  public void setComAdobeGraniteJobsAsync(ConfigNodePropertyString comAdobeGraniteJobsAsync) {
    this.comAdobeGraniteJobsAsync = comAdobeGraniteJobsAsync;
  }

    
  @JsonProperty("com.adobe.granite.maintenance.oak")
  public ConfigNodePropertyString getComAdobeGraniteMaintenanceOak() {
    return comAdobeGraniteMaintenanceOak;
  }
  public void setComAdobeGraniteMaintenanceOak(ConfigNodePropertyString comAdobeGraniteMaintenanceOak) {
    this.comAdobeGraniteMaintenanceOak = comAdobeGraniteMaintenanceOak;
  }

    
  @JsonProperty("com.adobe.granite.monitoring.core")
  public ConfigNodePropertyString getComAdobeGraniteMonitoringCore() {
    return comAdobeGraniteMonitoringCore;
  }
  public void setComAdobeGraniteMonitoringCore(ConfigNodePropertyString comAdobeGraniteMonitoringCore) {
    this.comAdobeGraniteMonitoringCore = comAdobeGraniteMonitoringCore;
  }

    
  @JsonProperty("com.adobe.granite.queries")
  public ConfigNodePropertyString getComAdobeGraniteQueries() {
    return comAdobeGraniteQueries;
  }
  public void setComAdobeGraniteQueries(ConfigNodePropertyString comAdobeGraniteQueries) {
    this.comAdobeGraniteQueries = comAdobeGraniteQueries;
  }

    
  @JsonProperty("com.adobe.granite.replication.hc.impl")
  public ConfigNodePropertyString getComAdobeGraniteReplicationHcImpl() {
    return comAdobeGraniteReplicationHcImpl;
  }
  public void setComAdobeGraniteReplicationHcImpl(ConfigNodePropertyString comAdobeGraniteReplicationHcImpl) {
    this.comAdobeGraniteReplicationHcImpl = comAdobeGraniteReplicationHcImpl;
  }

    
  @JsonProperty("com.adobe.granite.repository.checker")
  public ConfigNodePropertyString getComAdobeGraniteRepositoryChecker() {
    return comAdobeGraniteRepositoryChecker;
  }
  public void setComAdobeGraniteRepositoryChecker(ConfigNodePropertyString comAdobeGraniteRepositoryChecker) {
    this.comAdobeGraniteRepositoryChecker = comAdobeGraniteRepositoryChecker;
  }

    
  @JsonProperty("com.adobe.granite.repository.hc.impl")
  public ConfigNodePropertyString getComAdobeGraniteRepositoryHcImpl() {
    return comAdobeGraniteRepositoryHcImpl;
  }
  public void setComAdobeGraniteRepositoryHcImpl(ConfigNodePropertyString comAdobeGraniteRepositoryHcImpl) {
    this.comAdobeGraniteRepositoryHcImpl = comAdobeGraniteRepositoryHcImpl;
  }

    
  @JsonProperty("com.adobe.granite.rest.assets")
  public ConfigNodePropertyString getComAdobeGraniteRestAssets() {
    return comAdobeGraniteRestAssets;
  }
  public void setComAdobeGraniteRestAssets(ConfigNodePropertyString comAdobeGraniteRestAssets) {
    this.comAdobeGraniteRestAssets = comAdobeGraniteRestAssets;
  }

    
  @JsonProperty("com.adobe.granite.security.ui")
  public ConfigNodePropertyString getComAdobeGraniteSecurityUi() {
    return comAdobeGraniteSecurityUi;
  }
  public void setComAdobeGraniteSecurityUi(ConfigNodePropertyString comAdobeGraniteSecurityUi) {
    this.comAdobeGraniteSecurityUi = comAdobeGraniteSecurityUi;
  }

    
  @JsonProperty("com.adobe.granite.startup")
  public ConfigNodePropertyString getComAdobeGraniteStartup() {
    return comAdobeGraniteStartup;
  }
  public void setComAdobeGraniteStartup(ConfigNodePropertyString comAdobeGraniteStartup) {
    this.comAdobeGraniteStartup = comAdobeGraniteStartup;
  }

    
  @JsonProperty("com.adobe.granite.tagsoup")
  public ConfigNodePropertyString getComAdobeGraniteTagsoup() {
    return comAdobeGraniteTagsoup;
  }
  public void setComAdobeGraniteTagsoup(ConfigNodePropertyString comAdobeGraniteTagsoup) {
    this.comAdobeGraniteTagsoup = comAdobeGraniteTagsoup;
  }

    
  @JsonProperty("com.adobe.granite.taskmanagement.core")
  public ConfigNodePropertyString getComAdobeGraniteTaskmanagementCore() {
    return comAdobeGraniteTaskmanagementCore;
  }
  public void setComAdobeGraniteTaskmanagementCore(ConfigNodePropertyString comAdobeGraniteTaskmanagementCore) {
    this.comAdobeGraniteTaskmanagementCore = comAdobeGraniteTaskmanagementCore;
  }

    
  @JsonProperty("com.adobe.granite.taskmanagement.workflow")
  public ConfigNodePropertyString getComAdobeGraniteTaskmanagementWorkflow() {
    return comAdobeGraniteTaskmanagementWorkflow;
  }
  public void setComAdobeGraniteTaskmanagementWorkflow(ConfigNodePropertyString comAdobeGraniteTaskmanagementWorkflow) {
    this.comAdobeGraniteTaskmanagementWorkflow = comAdobeGraniteTaskmanagementWorkflow;
  }

    
  @JsonProperty("com.adobe.granite.ui.clientlibs.compiler.less")
  public ConfigNodePropertyString getComAdobeGraniteUiClientlibsCompilerLess() {
    return comAdobeGraniteUiClientlibsCompilerLess;
  }
  public void setComAdobeGraniteUiClientlibsCompilerLess(ConfigNodePropertyString comAdobeGraniteUiClientlibsCompilerLess) {
    this.comAdobeGraniteUiClientlibsCompilerLess = comAdobeGraniteUiClientlibsCompilerLess;
  }

    
  @JsonProperty("com.adobe.granite.ui.clientlibs.processor.gcc")
  public ConfigNodePropertyString getComAdobeGraniteUiClientlibsProcessorGcc() {
    return comAdobeGraniteUiClientlibsProcessorGcc;
  }
  public void setComAdobeGraniteUiClientlibsProcessorGcc(ConfigNodePropertyString comAdobeGraniteUiClientlibsProcessorGcc) {
    this.comAdobeGraniteUiClientlibsProcessorGcc = comAdobeGraniteUiClientlibsProcessorGcc;
  }

    
  @JsonProperty("com.adobe.granite.webconsole.plugins")
  public ConfigNodePropertyString getComAdobeGraniteWebconsolePlugins() {
    return comAdobeGraniteWebconsolePlugins;
  }
  public void setComAdobeGraniteWebconsolePlugins(ConfigNodePropertyString comAdobeGraniteWebconsolePlugins) {
    this.comAdobeGraniteWebconsolePlugins = comAdobeGraniteWebconsolePlugins;
  }

    
  @JsonProperty("com.adobe.granite.workflow.console")
  public ConfigNodePropertyString getComAdobeGraniteWorkflowConsole() {
    return comAdobeGraniteWorkflowConsole;
  }
  public void setComAdobeGraniteWorkflowConsole(ConfigNodePropertyString comAdobeGraniteWorkflowConsole) {
    this.comAdobeGraniteWorkflowConsole = comAdobeGraniteWorkflowConsole;
  }

    
  @JsonProperty("com.adobe.xmp.worker.files.native.fragment.linux")
  public ConfigNodePropertyString getComAdobeXmpWorkerFilesNativeFragmentLinux() {
    return comAdobeXmpWorkerFilesNativeFragmentLinux;
  }
  public void setComAdobeXmpWorkerFilesNativeFragmentLinux(ConfigNodePropertyString comAdobeXmpWorkerFilesNativeFragmentLinux) {
    this.comAdobeXmpWorkerFilesNativeFragmentLinux = comAdobeXmpWorkerFilesNativeFragmentLinux;
  }

    
  @JsonProperty("com.adobe.xmp.worker.files.native.fragment.macosx")
  public ConfigNodePropertyString getComAdobeXmpWorkerFilesNativeFragmentMacosx() {
    return comAdobeXmpWorkerFilesNativeFragmentMacosx;
  }
  public void setComAdobeXmpWorkerFilesNativeFragmentMacosx(ConfigNodePropertyString comAdobeXmpWorkerFilesNativeFragmentMacosx) {
    this.comAdobeXmpWorkerFilesNativeFragmentMacosx = comAdobeXmpWorkerFilesNativeFragmentMacosx;
  }

    
  @JsonProperty("com.adobe.xmp.worker.files.native.fragment.win")
  public ConfigNodePropertyString getComAdobeXmpWorkerFilesNativeFragmentWin() {
    return comAdobeXmpWorkerFilesNativeFragmentWin;
  }
  public void setComAdobeXmpWorkerFilesNativeFragmentWin(ConfigNodePropertyString comAdobeXmpWorkerFilesNativeFragmentWin) {
    this.comAdobeXmpWorkerFilesNativeFragmentWin = comAdobeXmpWorkerFilesNativeFragmentWin;
  }

    
  @JsonProperty("com.day.commons.osgi.wrapper.simple-jndi")
  public ConfigNodePropertyString getComDayCommonsOsgiWrapperSimpleJndi() {
    return comDayCommonsOsgiWrapperSimpleJndi;
  }
  public void setComDayCommonsOsgiWrapperSimpleJndi(ConfigNodePropertyString comDayCommonsOsgiWrapperSimpleJndi) {
    this.comDayCommonsOsgiWrapperSimpleJndi = comDayCommonsOsgiWrapperSimpleJndi;
  }

    
  @JsonProperty("com.day.cq.cq-authhandler")
  public ConfigNodePropertyString getComDayCqCqAuthhandler() {
    return comDayCqCqAuthhandler;
  }
  public void setComDayCqCqAuthhandler(ConfigNodePropertyString comDayCqCqAuthhandler) {
    this.comDayCqCqAuthhandler = comDayCqCqAuthhandler;
  }

    
  @JsonProperty("com.day.cq.cq-compat-configupdate")
  public ConfigNodePropertyString getComDayCqCqCompatConfigupdate() {
    return comDayCqCqCompatConfigupdate;
  }
  public void setComDayCqCqCompatConfigupdate(ConfigNodePropertyString comDayCqCqCompatConfigupdate) {
    this.comDayCqCqCompatConfigupdate = comDayCqCqCompatConfigupdate;
  }

    
  @JsonProperty("com.day.cq.cq-licensebranding")
  public ConfigNodePropertyString getComDayCqCqLicensebranding() {
    return comDayCqCqLicensebranding;
  }
  public void setComDayCqCqLicensebranding(ConfigNodePropertyString comDayCqCqLicensebranding) {
    this.comDayCqCqLicensebranding = comDayCqCqLicensebranding;
  }

    
  @JsonProperty("com.day.cq.cq-notifcation-impl")
  public ConfigNodePropertyString getComDayCqCqNotifcationImpl() {
    return comDayCqCqNotifcationImpl;
  }
  public void setComDayCqCqNotifcationImpl(ConfigNodePropertyString comDayCqCqNotifcationImpl) {
    this.comDayCqCqNotifcationImpl = comDayCqCqNotifcationImpl;
  }

    
  @JsonProperty("com.day.cq.cq-replication-audit")
  public ConfigNodePropertyString getComDayCqCqReplicationAudit() {
    return comDayCqCqReplicationAudit;
  }
  public void setComDayCqCqReplicationAudit(ConfigNodePropertyString comDayCqCqReplicationAudit) {
    this.comDayCqCqReplicationAudit = comDayCqCqReplicationAudit;
  }

    
  @JsonProperty("com.day.cq.cq-search-ext")
  public ConfigNodePropertyString getComDayCqCqSearchExt() {
    return comDayCqCqSearchExt;
  }
  public void setComDayCqCqSearchExt(ConfigNodePropertyString comDayCqCqSearchExt) {
    this.comDayCqCqSearchExt = comDayCqCqSearchExt;
  }

    
  @JsonProperty("com.day.cq.dam.cq-dam-annotation-print")
  public ConfigNodePropertyString getComDayCqDamCqDamAnnotationPrint() {
    return comDayCqDamCqDamAnnotationPrint;
  }
  public void setComDayCqDamCqDamAnnotationPrint(ConfigNodePropertyString comDayCqDamCqDamAnnotationPrint) {
    this.comDayCqDamCqDamAnnotationPrint = comDayCqDamCqDamAnnotationPrint;
  }

    
  @JsonProperty("com.day.cq.dam.cq-dam-asset-usage")
  public ConfigNodePropertyString getComDayCqDamCqDamAssetUsage() {
    return comDayCqDamCqDamAssetUsage;
  }
  public void setComDayCqDamCqDamAssetUsage(ConfigNodePropertyString comDayCqDamCqDamAssetUsage) {
    this.comDayCqDamCqDamAssetUsage = comDayCqDamCqDamAssetUsage;
  }

    
  @JsonProperty("com.day.cq.dam.cq-dam-s7dam")
  public ConfigNodePropertyString getComDayCqDamCqDamS7dam() {
    return comDayCqDamCqDamS7dam;
  }
  public void setComDayCqDamCqDamS7dam(ConfigNodePropertyString comDayCqDamCqDamS7dam) {
    this.comDayCqDamCqDamS7dam = comDayCqDamCqDamS7dam;
  }

    
  @JsonProperty("com.day.cq.dam.cq-dam-similaritysearch")
  public ConfigNodePropertyString getComDayCqDamCqDamSimilaritysearch() {
    return comDayCqDamCqDamSimilaritysearch;
  }
  public void setComDayCqDamCqDamSimilaritysearch(ConfigNodePropertyString comDayCqDamCqDamSimilaritysearch) {
    this.comDayCqDamCqDamSimilaritysearch = comDayCqDamCqDamSimilaritysearch;
  }

    
  @JsonProperty("com.day.cq.dam.dam-webdav-support")
  public ConfigNodePropertyString getComDayCqDamDamWebdavSupport() {
    return comDayCqDamDamWebdavSupport;
  }
  public void setComDayCqDamDamWebdavSupport(ConfigNodePropertyString comDayCqDamDamWebdavSupport) {
    this.comDayCqDamDamWebdavSupport = comDayCqDamDamWebdavSupport;
  }

    
  @JsonProperty("com.day.cq.pre-upgrade-tasks")
  public ConfigNodePropertyString getComDayCqPreUpgradeTasks() {
    return comDayCqPreUpgradeTasks;
  }
  public void setComDayCqPreUpgradeTasks(ConfigNodePropertyString comDayCqPreUpgradeTasks) {
    this.comDayCqPreUpgradeTasks = comDayCqPreUpgradeTasks;
  }

    
  @JsonProperty("com.day.cq.replication.extensions")
  public ConfigNodePropertyString getComDayCqReplicationExtensions() {
    return comDayCqReplicationExtensions;
  }
  public void setComDayCqReplicationExtensions(ConfigNodePropertyString comDayCqReplicationExtensions) {
    this.comDayCqReplicationExtensions = comDayCqReplicationExtensions;
  }

    
  @JsonProperty("com.day.cq.wcm.cq-msm-core")
  public ConfigNodePropertyString getComDayCqWcmCqMsmCore() {
    return comDayCqWcmCqMsmCore;
  }
  public void setComDayCqWcmCqMsmCore(ConfigNodePropertyString comDayCqWcmCqMsmCore) {
    this.comDayCqWcmCqMsmCore = comDayCqWcmCqMsmCore;
  }

    
  @JsonProperty("com.day.cq.wcm.cq-wcm-translation")
  public ConfigNodePropertyString getComDayCqWcmCqWcmTranslation() {
    return comDayCqWcmCqWcmTranslation;
  }
  public void setComDayCqWcmCqWcmTranslation(ConfigNodePropertyString comDayCqWcmCqWcmTranslation) {
    this.comDayCqWcmCqWcmTranslation = comDayCqWcmCqWcmTranslation;
  }

    
  @JsonProperty("day-commons-jrawio")
  public ConfigNodePropertyString getDayCommonsJrawio() {
    return dayCommonsJrawio;
  }
  public void setDayCommonsJrawio(ConfigNodePropertyString dayCommonsJrawio) {
    this.dayCommonsJrawio = dayCommonsJrawio;
  }

    
  @JsonProperty("org.apache.aries.jmx.whiteboard")
  public ConfigNodePropertyString getOrgApacheAriesJmxWhiteboard() {
    return orgApacheAriesJmxWhiteboard;
  }
  public void setOrgApacheAriesJmxWhiteboard(ConfigNodePropertyString orgApacheAriesJmxWhiteboard) {
    this.orgApacheAriesJmxWhiteboard = orgApacheAriesJmxWhiteboard;
  }

    
  @JsonProperty("org.apache.felix.http.sslfilter")
  public ConfigNodePropertyString getOrgApacheFelixHttpSslfilter() {
    return orgApacheFelixHttpSslfilter;
  }
  public void setOrgApacheFelixHttpSslfilter(ConfigNodePropertyString orgApacheFelixHttpSslfilter) {
    this.orgApacheFelixHttpSslfilter = orgApacheFelixHttpSslfilter;
  }

    
  @JsonProperty("org.apache.felix.org.apache.felix.threaddump")
  public ConfigNodePropertyString getOrgApacheFelixOrgApacheFelixThreaddump() {
    return orgApacheFelixOrgApacheFelixThreaddump;
  }
  public void setOrgApacheFelixOrgApacheFelixThreaddump(ConfigNodePropertyString orgApacheFelixOrgApacheFelixThreaddump) {
    this.orgApacheFelixOrgApacheFelixThreaddump = orgApacheFelixOrgApacheFelixThreaddump;
  }

    
  @JsonProperty("org.apache.felix.webconsole.plugins.ds")
  public ConfigNodePropertyString getOrgApacheFelixWebconsolePluginsDs() {
    return orgApacheFelixWebconsolePluginsDs;
  }
  public void setOrgApacheFelixWebconsolePluginsDs(ConfigNodePropertyString orgApacheFelixWebconsolePluginsDs) {
    this.orgApacheFelixWebconsolePluginsDs = orgApacheFelixWebconsolePluginsDs;
  }

    
  @JsonProperty("org.apache.felix.webconsole.plugins.event")
  public ConfigNodePropertyString getOrgApacheFelixWebconsolePluginsEvent() {
    return orgApacheFelixWebconsolePluginsEvent;
  }
  public void setOrgApacheFelixWebconsolePluginsEvent(ConfigNodePropertyString orgApacheFelixWebconsolePluginsEvent) {
    this.orgApacheFelixWebconsolePluginsEvent = orgApacheFelixWebconsolePluginsEvent;
  }

    
  @JsonProperty("org.apache.felix.webconsole.plugins.memoryusage")
  public ConfigNodePropertyString getOrgApacheFelixWebconsolePluginsMemoryusage() {
    return orgApacheFelixWebconsolePluginsMemoryusage;
  }
  public void setOrgApacheFelixWebconsolePluginsMemoryusage(ConfigNodePropertyString orgApacheFelixWebconsolePluginsMemoryusage) {
    this.orgApacheFelixWebconsolePluginsMemoryusage = orgApacheFelixWebconsolePluginsMemoryusage;
  }

    
  @JsonProperty("org.apache.felix.webconsole.plugins.packageadmin")
  public ConfigNodePropertyString getOrgApacheFelixWebconsolePluginsPackageadmin() {
    return orgApacheFelixWebconsolePluginsPackageadmin;
  }
  public void setOrgApacheFelixWebconsolePluginsPackageadmin(ConfigNodePropertyString orgApacheFelixWebconsolePluginsPackageadmin) {
    this.orgApacheFelixWebconsolePluginsPackageadmin = orgApacheFelixWebconsolePluginsPackageadmin;
  }

    
  @JsonProperty("org.apache.jackrabbit.oak-auth-ldap")
  public ConfigNodePropertyString getOrgApacheJackrabbitOakAuthLdap() {
    return orgApacheJackrabbitOakAuthLdap;
  }
  public void setOrgApacheJackrabbitOakAuthLdap(ConfigNodePropertyString orgApacheJackrabbitOakAuthLdap) {
    this.orgApacheJackrabbitOakAuthLdap = orgApacheJackrabbitOakAuthLdap;
  }

    
  @JsonProperty("org.apache.jackrabbit.oak-segment-tar")
  public ConfigNodePropertyString getOrgApacheJackrabbitOakSegmentTar() {
    return orgApacheJackrabbitOakSegmentTar;
  }
  public void setOrgApacheJackrabbitOakSegmentTar(ConfigNodePropertyString orgApacheJackrabbitOakSegmentTar) {
    this.orgApacheJackrabbitOakSegmentTar = orgApacheJackrabbitOakSegmentTar;
  }

    
  @JsonProperty("org.apache.jackrabbit.oak-solr-osgi")
  public ConfigNodePropertyString getOrgApacheJackrabbitOakSolrOsgi() {
    return orgApacheJackrabbitOakSolrOsgi;
  }
  public void setOrgApacheJackrabbitOakSolrOsgi(ConfigNodePropertyString orgApacheJackrabbitOakSolrOsgi) {
    this.orgApacheJackrabbitOakSolrOsgi = orgApacheJackrabbitOakSolrOsgi;
  }

    
  @JsonProperty("org.apache.sling.bundleresource.impl")
  public ConfigNodePropertyString getOrgApacheSlingBundleresourceImpl() {
    return orgApacheSlingBundleresourceImpl;
  }
  public void setOrgApacheSlingBundleresourceImpl(ConfigNodePropertyString orgApacheSlingBundleresourceImpl) {
    this.orgApacheSlingBundleresourceImpl = orgApacheSlingBundleresourceImpl;
  }

    
  @JsonProperty("org.apache.sling.commons.fsclassloader")
  public ConfigNodePropertyString getOrgApacheSlingCommonsFsclassloader() {
    return orgApacheSlingCommonsFsclassloader;
  }
  public void setOrgApacheSlingCommonsFsclassloader(ConfigNodePropertyString orgApacheSlingCommonsFsclassloader) {
    this.orgApacheSlingCommonsFsclassloader = orgApacheSlingCommonsFsclassloader;
  }

    
  @JsonProperty("org.apache.sling.commons.log.webconsole")
  public ConfigNodePropertyString getOrgApacheSlingCommonsLogWebconsole() {
    return orgApacheSlingCommonsLogWebconsole;
  }
  public void setOrgApacheSlingCommonsLogWebconsole(ConfigNodePropertyString orgApacheSlingCommonsLogWebconsole) {
    this.orgApacheSlingCommonsLogWebconsole = orgApacheSlingCommonsLogWebconsole;
  }

    
  @JsonProperty("org.apache.sling.datasource")
  public ConfigNodePropertyString getOrgApacheSlingDatasource() {
    return orgApacheSlingDatasource;
  }
  public void setOrgApacheSlingDatasource(ConfigNodePropertyString orgApacheSlingDatasource) {
    this.orgApacheSlingDatasource = orgApacheSlingDatasource;
  }

    
  @JsonProperty("org.apache.sling.discovery.base")
  public ConfigNodePropertyString getOrgApacheSlingDiscoveryBase() {
    return orgApacheSlingDiscoveryBase;
  }
  public void setOrgApacheSlingDiscoveryBase(ConfigNodePropertyString orgApacheSlingDiscoveryBase) {
    this.orgApacheSlingDiscoveryBase = orgApacheSlingDiscoveryBase;
  }

    
  @JsonProperty("org.apache.sling.discovery.oak")
  public ConfigNodePropertyString getOrgApacheSlingDiscoveryOak() {
    return orgApacheSlingDiscoveryOak;
  }
  public void setOrgApacheSlingDiscoveryOak(ConfigNodePropertyString orgApacheSlingDiscoveryOak) {
    this.orgApacheSlingDiscoveryOak = orgApacheSlingDiscoveryOak;
  }

    
  @JsonProperty("org.apache.sling.discovery.support")
  public ConfigNodePropertyString getOrgApacheSlingDiscoverySupport() {
    return orgApacheSlingDiscoverySupport;
  }
  public void setOrgApacheSlingDiscoverySupport(ConfigNodePropertyString orgApacheSlingDiscoverySupport) {
    this.orgApacheSlingDiscoverySupport = orgApacheSlingDiscoverySupport;
  }

    
  @JsonProperty("org.apache.sling.distribution.api")
  public ConfigNodePropertyString getOrgApacheSlingDistributionApi() {
    return orgApacheSlingDistributionApi;
  }
  public void setOrgApacheSlingDistributionApi(ConfigNodePropertyString orgApacheSlingDistributionApi) {
    this.orgApacheSlingDistributionApi = orgApacheSlingDistributionApi;
  }

    
  @JsonProperty("org.apache.sling.distribution.core")
  public ConfigNodePropertyString getOrgApacheSlingDistributionCore() {
    return orgApacheSlingDistributionCore;
  }
  public void setOrgApacheSlingDistributionCore(ConfigNodePropertyString orgApacheSlingDistributionCore) {
    this.orgApacheSlingDistributionCore = orgApacheSlingDistributionCore;
  }

    
  @JsonProperty("org.apache.sling.extensions.webconsolesecurityprovider")
  public ConfigNodePropertyString getOrgApacheSlingExtensionsWebconsolesecurityprovider() {
    return orgApacheSlingExtensionsWebconsolesecurityprovider;
  }
  public void setOrgApacheSlingExtensionsWebconsolesecurityprovider(ConfigNodePropertyString orgApacheSlingExtensionsWebconsolesecurityprovider) {
    this.orgApacheSlingExtensionsWebconsolesecurityprovider = orgApacheSlingExtensionsWebconsolesecurityprovider;
  }

    
  @JsonProperty("org.apache.sling.hc.webconsole")
  public ConfigNodePropertyString getOrgApacheSlingHcWebconsole() {
    return orgApacheSlingHcWebconsole;
  }
  public void setOrgApacheSlingHcWebconsole(ConfigNodePropertyString orgApacheSlingHcWebconsole) {
    this.orgApacheSlingHcWebconsole = orgApacheSlingHcWebconsole;
  }

    
  @JsonProperty("org.apache.sling.installer.console")
  public ConfigNodePropertyString getOrgApacheSlingInstallerConsole() {
    return orgApacheSlingInstallerConsole;
  }
  public void setOrgApacheSlingInstallerConsole(ConfigNodePropertyString orgApacheSlingInstallerConsole) {
    this.orgApacheSlingInstallerConsole = orgApacheSlingInstallerConsole;
  }

    
  @JsonProperty("org.apache.sling.installer.provider.file")
  public ConfigNodePropertyString getOrgApacheSlingInstallerProviderFile() {
    return orgApacheSlingInstallerProviderFile;
  }
  public void setOrgApacheSlingInstallerProviderFile(ConfigNodePropertyString orgApacheSlingInstallerProviderFile) {
    this.orgApacheSlingInstallerProviderFile = orgApacheSlingInstallerProviderFile;
  }

    
  @JsonProperty("org.apache.sling.installer.provider.jcr")
  public ConfigNodePropertyString getOrgApacheSlingInstallerProviderJcr() {
    return orgApacheSlingInstallerProviderJcr;
  }
  public void setOrgApacheSlingInstallerProviderJcr(ConfigNodePropertyString orgApacheSlingInstallerProviderJcr) {
    this.orgApacheSlingInstallerProviderJcr = orgApacheSlingInstallerProviderJcr;
  }

    
  @JsonProperty("org.apache.sling.jcr.davex")
  public ConfigNodePropertyString getOrgApacheSlingJcrDavex() {
    return orgApacheSlingJcrDavex;
  }
  public void setOrgApacheSlingJcrDavex(ConfigNodePropertyString orgApacheSlingJcrDavex) {
    this.orgApacheSlingJcrDavex = orgApacheSlingJcrDavex;
  }

    
  @JsonProperty("org.apache.sling.jcr.resourcesecurity")
  public ConfigNodePropertyString getOrgApacheSlingJcrResourcesecurity() {
    return orgApacheSlingJcrResourcesecurity;
  }
  public void setOrgApacheSlingJcrResourcesecurity(ConfigNodePropertyString orgApacheSlingJcrResourcesecurity) {
    this.orgApacheSlingJcrResourcesecurity = orgApacheSlingJcrResourcesecurity;
  }

    
  @JsonProperty("org.apache.sling.jmx.provider")
  public ConfigNodePropertyString getOrgApacheSlingJmxProvider() {
    return orgApacheSlingJmxProvider;
  }
  public void setOrgApacheSlingJmxProvider(ConfigNodePropertyString orgApacheSlingJmxProvider) {
    this.orgApacheSlingJmxProvider = orgApacheSlingJmxProvider;
  }

    
  @JsonProperty("org.apache.sling.launchpad.installer")
  public ConfigNodePropertyString getOrgApacheSlingLaunchpadInstaller() {
    return orgApacheSlingLaunchpadInstaller;
  }
  public void setOrgApacheSlingLaunchpadInstaller(ConfigNodePropertyString orgApacheSlingLaunchpadInstaller) {
    this.orgApacheSlingLaunchpadInstaller = orgApacheSlingLaunchpadInstaller;
  }

    
  @JsonProperty("org.apache.sling.models.impl")
  public ConfigNodePropertyString getOrgApacheSlingModelsImpl() {
    return orgApacheSlingModelsImpl;
  }
  public void setOrgApacheSlingModelsImpl(ConfigNodePropertyString orgApacheSlingModelsImpl) {
    this.orgApacheSlingModelsImpl = orgApacheSlingModelsImpl;
  }

    
  @JsonProperty("org.apache.sling.repoinit.parser")
  public ConfigNodePropertyString getOrgApacheSlingRepoinitParser() {
    return orgApacheSlingRepoinitParser;
  }
  public void setOrgApacheSlingRepoinitParser(ConfigNodePropertyString orgApacheSlingRepoinitParser) {
    this.orgApacheSlingRepoinitParser = orgApacheSlingRepoinitParser;
  }

    
  @JsonProperty("org.apache.sling.resource.inventory")
  public ConfigNodePropertyString getOrgApacheSlingResourceInventory() {
    return orgApacheSlingResourceInventory;
  }
  public void setOrgApacheSlingResourceInventory(ConfigNodePropertyString orgApacheSlingResourceInventory) {
    this.orgApacheSlingResourceInventory = orgApacheSlingResourceInventory;
  }

    
  @JsonProperty("org.apache.sling.resourceresolver")
  public ConfigNodePropertyString getOrgApacheSlingResourceresolver() {
    return orgApacheSlingResourceresolver;
  }
  public void setOrgApacheSlingResourceresolver(ConfigNodePropertyString orgApacheSlingResourceresolver) {
    this.orgApacheSlingResourceresolver = orgApacheSlingResourceresolver;
  }

    
  @JsonProperty("org.apache.sling.scripting.javascript")
  public ConfigNodePropertyString getOrgApacheSlingScriptingJavascript() {
    return orgApacheSlingScriptingJavascript;
  }
  public void setOrgApacheSlingScriptingJavascript(ConfigNodePropertyString orgApacheSlingScriptingJavascript) {
    this.orgApacheSlingScriptingJavascript = orgApacheSlingScriptingJavascript;
  }

    
  @JsonProperty("org.apache.sling.scripting.jst")
  public ConfigNodePropertyString getOrgApacheSlingScriptingJst() {
    return orgApacheSlingScriptingJst;
  }
  public void setOrgApacheSlingScriptingJst(ConfigNodePropertyString orgApacheSlingScriptingJst) {
    this.orgApacheSlingScriptingJst = orgApacheSlingScriptingJst;
  }

    
  @JsonProperty("org.apache.sling.scripting.sightly.js.provider")
  public ConfigNodePropertyString getOrgApacheSlingScriptingSightlyJsProvider() {
    return orgApacheSlingScriptingSightlyJsProvider;
  }
  public void setOrgApacheSlingScriptingSightlyJsProvider(ConfigNodePropertyString orgApacheSlingScriptingSightlyJsProvider) {
    this.orgApacheSlingScriptingSightlyJsProvider = orgApacheSlingScriptingSightlyJsProvider;
  }

    
  @JsonProperty("org.apache.sling.scripting.sightly.models.provider")
  public ConfigNodePropertyString getOrgApacheSlingScriptingSightlyModelsProvider() {
    return orgApacheSlingScriptingSightlyModelsProvider;
  }
  public void setOrgApacheSlingScriptingSightlyModelsProvider(ConfigNodePropertyString orgApacheSlingScriptingSightlyModelsProvider) {
    this.orgApacheSlingScriptingSightlyModelsProvider = orgApacheSlingScriptingSightlyModelsProvider;
  }

    
  @JsonProperty("org.apache.sling.security")
  public ConfigNodePropertyString getOrgApacheSlingSecurity() {
    return orgApacheSlingSecurity;
  }
  public void setOrgApacheSlingSecurity(ConfigNodePropertyString orgApacheSlingSecurity) {
    this.orgApacheSlingSecurity = orgApacheSlingSecurity;
  }

    
  @JsonProperty("org.apache.sling.servlets.compat")
  public ConfigNodePropertyString getOrgApacheSlingServletsCompat() {
    return orgApacheSlingServletsCompat;
  }
  public void setOrgApacheSlingServletsCompat(ConfigNodePropertyString orgApacheSlingServletsCompat) {
    this.orgApacheSlingServletsCompat = orgApacheSlingServletsCompat;
  }

    
  @JsonProperty("org.apache.sling.servlets.get")
  public ConfigNodePropertyString getOrgApacheSlingServletsGet() {
    return orgApacheSlingServletsGet;
  }
  public void setOrgApacheSlingServletsGet(ConfigNodePropertyString orgApacheSlingServletsGet) {
    this.orgApacheSlingServletsGet = orgApacheSlingServletsGet;
  }

    
  @JsonProperty("org.apache.sling.startupfilter.disabler")
  public ConfigNodePropertyString getOrgApacheSlingStartupfilterDisabler() {
    return orgApacheSlingStartupfilterDisabler;
  }
  public void setOrgApacheSlingStartupfilterDisabler(ConfigNodePropertyString orgApacheSlingStartupfilterDisabler) {
    this.orgApacheSlingStartupfilterDisabler = orgApacheSlingStartupfilterDisabler;
  }

    
  @JsonProperty("org.apache.sling.tracer")
  public ConfigNodePropertyString getOrgApacheSlingTracer() {
    return orgApacheSlingTracer;
  }
  public void setOrgApacheSlingTracer(ConfigNodePropertyString orgApacheSlingTracer) {
    this.orgApacheSlingTracer = orgApacheSlingTracer;
  }

    
  @JsonProperty("we.retail.client.app.core")
  public ConfigNodePropertyString getWeRetailClientAppCore() {
    return weRetailClientAppCore;
  }
  public void setWeRetailClientAppCore(ConfigNodePropertyString weRetailClientAppCore) {
    this.weRetailClientAppCore = weRetailClientAppCore;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties = (ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties) o;
    return Objects.equals(comAdobeCqCdnCdnRewriter, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeCqCdnCdnRewriter) &&
        Objects.equals(comAdobeCqCloudConfigComponents, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeCqCloudConfigComponents) &&
        Objects.equals(comAdobeCqCloudConfigCore, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeCqCloudConfigCore) &&
        Objects.equals(comAdobeCqCloudConfigUi, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeCqCloudConfigUi) &&
        Objects.equals(comAdobeCqComAdobeCqEditor, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeCqComAdobeCqEditor) &&
        Objects.equals(comAdobeCqComAdobeCqProjectsCore, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeCqComAdobeCqProjectsCore) &&
        Objects.equals(comAdobeCqComAdobeCqProjectsWcmCore, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeCqComAdobeCqProjectsWcmCore) &&
        Objects.equals(comAdobeCqComAdobeCqUiCommons, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeCqComAdobeCqUiCommons) &&
        Objects.equals(comAdobeCqComAdobeCqWcmStyle, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeCqComAdobeCqWcmStyle) &&
        Objects.equals(comAdobeCqCqActivitymapIntegration, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeCqCqActivitymapIntegration) &&
        Objects.equals(comAdobeCqCqContexthubCommons, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeCqCqContexthubCommons) &&
        Objects.equals(comAdobeCqCqDtm, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeCqCqDtm) &&
        Objects.equals(comAdobeCqCqHealthcheck, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeCqCqHealthcheck) &&
        Objects.equals(comAdobeCqCqMultisiteTargeting, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeCqCqMultisiteTargeting) &&
        Objects.equals(comAdobeCqCqPreUpgradeCleanup, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeCqCqPreUpgradeCleanup) &&
        Objects.equals(comAdobeCqCqProductInfoProvider, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeCqCqProductInfoProvider) &&
        Objects.equals(comAdobeCqCqRestSites, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeCqCqRestSites) &&
        Objects.equals(comAdobeCqCqSecurityHc, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeCqCqSecurityHc) &&
        Objects.equals(comAdobeCqDamCqDamSvgHandler, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeCqDamCqDamSvgHandler) &&
        Objects.equals(comAdobeCqDamCqScene7Imaging, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeCqDamCqScene7Imaging) &&
        Objects.equals(comAdobeCqDtmReactorCore, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeCqDtmReactorCore) &&
        Objects.equals(comAdobeCqDtmReactorUi, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeCqDtmReactorUi) &&
        Objects.equals(comAdobeCqExpJspelResolver, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeCqExpJspelResolver) &&
        Objects.equals(comAdobeCqInboxCqInbox, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeCqInboxCqInbox) &&
        Objects.equals(comAdobeCqJsonSchemaParser, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeCqJsonSchemaParser) &&
        Objects.equals(comAdobeCqMediaCqMediaPublishingDpsFpCore, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeCqMediaCqMediaPublishingDpsFpCore) &&
        Objects.equals(comAdobeCqMobileCqMobileCaas, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeCqMobileCqMobileCaas) &&
        Objects.equals(comAdobeCqMobileCqMobileIndexBuilder, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeCqMobileCqMobileIndexBuilder) &&
        Objects.equals(comAdobeCqMobileCqMobilePhonegapBuild, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeCqMobileCqMobilePhonegapBuild) &&
        Objects.equals(comAdobeCqMyspell, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeCqMyspell) &&
        Objects.equals(comAdobeCqSampleWeRetailCore, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeCqSampleWeRetailCore) &&
        Objects.equals(comAdobeCqScreensComAdobeCqScreensDcc, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeCqScreensComAdobeCqScreensDcc) &&
        Objects.equals(comAdobeCqScreensComAdobeCqScreensMqCore, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeCqScreensComAdobeCqScreensMqCore) &&
        Objects.equals(comAdobeCqSocialCqSocialAsProvider, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeCqSocialCqSocialAsProvider) &&
        Objects.equals(comAdobeCqSocialCqSocialBadgingBasicImpl, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeCqSocialCqSocialBadgingBasicImpl) &&
        Objects.equals(comAdobeCqSocialCqSocialBadgingImpl, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeCqSocialCqSocialBadgingImpl) &&
        Objects.equals(comAdobeCqSocialCqSocialCalendarImpl, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeCqSocialCqSocialCalendarImpl) &&
        Objects.equals(comAdobeCqSocialCqSocialContentFragmentsImpl, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeCqSocialCqSocialContentFragmentsImpl) &&
        Objects.equals(comAdobeCqSocialCqSocialEnablementImpl, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeCqSocialCqSocialEnablementImpl) &&
        Objects.equals(comAdobeCqSocialCqSocialGraphImpl, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeCqSocialCqSocialGraphImpl) &&
        Objects.equals(comAdobeCqSocialCqSocialIdeationImpl, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeCqSocialCqSocialIdeationImpl) &&
        Objects.equals(comAdobeCqSocialCqSocialJcrProvider, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeCqSocialCqSocialJcrProvider) &&
        Objects.equals(comAdobeCqSocialCqSocialMembersImpl, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeCqSocialCqSocialMembersImpl) &&
        Objects.equals(comAdobeCqSocialCqSocialMsProvider, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeCqSocialCqSocialMsProvider) &&
        Objects.equals(comAdobeCqSocialCqSocialNotificationsChannelsWeb, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeCqSocialCqSocialNotificationsChannelsWeb) &&
        Objects.equals(comAdobeCqSocialCqSocialNotificationsImpl, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeCqSocialCqSocialNotificationsImpl) &&
        Objects.equals(comAdobeCqSocialCqSocialRdbProvider, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeCqSocialCqSocialRdbProvider) &&
        Objects.equals(comAdobeCqSocialCqSocialScfImpl, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeCqSocialCqSocialScfImpl) &&
        Objects.equals(comAdobeCqSocialCqSocialScoringBasicImpl, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeCqSocialCqSocialScoringBasicImpl) &&
        Objects.equals(comAdobeCqSocialCqSocialScoringImpl, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeCqSocialCqSocialScoringImpl) &&
        Objects.equals(comAdobeCqSocialCqSocialServiceusersImpl, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeCqSocialCqSocialServiceusersImpl) &&
        Objects.equals(comAdobeCqSocialCqSocialSrpImpl, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeCqSocialCqSocialSrpImpl) &&
        Objects.equals(comAdobeCqSocialCqSocialUgcbaseImpl, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeCqSocialCqSocialUgcbaseImpl) &&
        Objects.equals(comAdobeDamCqDamCfmImpl, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeDamCqDamCfmImpl) &&
        Objects.equals(comAdobeFormsFoundationFormsFoundationBase, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeFormsFoundationFormsFoundationBase) &&
        Objects.equals(comAdobeGraniteApicontroller, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeGraniteApicontroller) &&
        Objects.equals(comAdobeGraniteAssetCore, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeGraniteAssetCore) &&
        Objects.equals(comAdobeGraniteAuthSso, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeGraniteAuthSso) &&
        Objects.equals(comAdobeGraniteBundlesHcImpl, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeGraniteBundlesHcImpl) &&
        Objects.equals(comAdobeGraniteCompatRouter, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeGraniteCompatRouter) &&
        Objects.equals(comAdobeGraniteConf, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeGraniteConf) &&
        Objects.equals(comAdobeGraniteConfUiCore, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeGraniteConfUiCore) &&
        Objects.equals(comAdobeGraniteCors, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeGraniteCors) &&
        Objects.equals(comAdobeGraniteCrxExplorer, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeGraniteCrxExplorer) &&
        Objects.equals(comAdobeGraniteCrxdeLite, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeGraniteCrxdeLite) &&
        Objects.equals(comAdobeGraniteCryptoConfig, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeGraniteCryptoConfig) &&
        Objects.equals(comAdobeGraniteCryptoExtension, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeGraniteCryptoExtension) &&
        Objects.equals(comAdobeGraniteCryptoFile, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeGraniteCryptoFile) &&
        Objects.equals(comAdobeGraniteCryptoJcr, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeGraniteCryptoJcr) &&
        Objects.equals(comAdobeGraniteCsrf, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeGraniteCsrf) &&
        Objects.equals(comAdobeGraniteDistributionCore, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeGraniteDistributionCore) &&
        Objects.equals(comAdobeGraniteDropwizardMetrics, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeGraniteDropwizardMetrics) &&
        Objects.equals(comAdobeGraniteFragsImpl, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeGraniteFragsImpl) &&
        Objects.equals(comAdobeGraniteGibson, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeGraniteGibson) &&
        Objects.equals(comAdobeGraniteInfocollector, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeGraniteInfocollector) &&
        Objects.equals(comAdobeGraniteInstallerFactoryPackages, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeGraniteInstallerFactoryPackages) &&
        Objects.equals(comAdobeGraniteJettySsl, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeGraniteJettySsl) &&
        Objects.equals(comAdobeGraniteJobsAsync, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeGraniteJobsAsync) &&
        Objects.equals(comAdobeGraniteMaintenanceOak, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeGraniteMaintenanceOak) &&
        Objects.equals(comAdobeGraniteMonitoringCore, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeGraniteMonitoringCore) &&
        Objects.equals(comAdobeGraniteQueries, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeGraniteQueries) &&
        Objects.equals(comAdobeGraniteReplicationHcImpl, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeGraniteReplicationHcImpl) &&
        Objects.equals(comAdobeGraniteRepositoryChecker, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeGraniteRepositoryChecker) &&
        Objects.equals(comAdobeGraniteRepositoryHcImpl, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeGraniteRepositoryHcImpl) &&
        Objects.equals(comAdobeGraniteRestAssets, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeGraniteRestAssets) &&
        Objects.equals(comAdobeGraniteSecurityUi, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeGraniteSecurityUi) &&
        Objects.equals(comAdobeGraniteStartup, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeGraniteStartup) &&
        Objects.equals(comAdobeGraniteTagsoup, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeGraniteTagsoup) &&
        Objects.equals(comAdobeGraniteTaskmanagementCore, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeGraniteTaskmanagementCore) &&
        Objects.equals(comAdobeGraniteTaskmanagementWorkflow, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeGraniteTaskmanagementWorkflow) &&
        Objects.equals(comAdobeGraniteUiClientlibsCompilerLess, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeGraniteUiClientlibsCompilerLess) &&
        Objects.equals(comAdobeGraniteUiClientlibsProcessorGcc, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeGraniteUiClientlibsProcessorGcc) &&
        Objects.equals(comAdobeGraniteWebconsolePlugins, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeGraniteWebconsolePlugins) &&
        Objects.equals(comAdobeGraniteWorkflowConsole, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeGraniteWorkflowConsole) &&
        Objects.equals(comAdobeXmpWorkerFilesNativeFragmentLinux, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeXmpWorkerFilesNativeFragmentLinux) &&
        Objects.equals(comAdobeXmpWorkerFilesNativeFragmentMacosx, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeXmpWorkerFilesNativeFragmentMacosx) &&
        Objects.equals(comAdobeXmpWorkerFilesNativeFragmentWin, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comAdobeXmpWorkerFilesNativeFragmentWin) &&
        Objects.equals(comDayCommonsOsgiWrapperSimpleJndi, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comDayCommonsOsgiWrapperSimpleJndi) &&
        Objects.equals(comDayCqCqAuthhandler, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comDayCqCqAuthhandler) &&
        Objects.equals(comDayCqCqCompatConfigupdate, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comDayCqCqCompatConfigupdate) &&
        Objects.equals(comDayCqCqLicensebranding, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comDayCqCqLicensebranding) &&
        Objects.equals(comDayCqCqNotifcationImpl, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comDayCqCqNotifcationImpl) &&
        Objects.equals(comDayCqCqReplicationAudit, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comDayCqCqReplicationAudit) &&
        Objects.equals(comDayCqCqSearchExt, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comDayCqCqSearchExt) &&
        Objects.equals(comDayCqDamCqDamAnnotationPrint, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comDayCqDamCqDamAnnotationPrint) &&
        Objects.equals(comDayCqDamCqDamAssetUsage, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comDayCqDamCqDamAssetUsage) &&
        Objects.equals(comDayCqDamCqDamS7dam, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comDayCqDamCqDamS7dam) &&
        Objects.equals(comDayCqDamCqDamSimilaritysearch, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comDayCqDamCqDamSimilaritysearch) &&
        Objects.equals(comDayCqDamDamWebdavSupport, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comDayCqDamDamWebdavSupport) &&
        Objects.equals(comDayCqPreUpgradeTasks, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comDayCqPreUpgradeTasks) &&
        Objects.equals(comDayCqReplicationExtensions, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comDayCqReplicationExtensions) &&
        Objects.equals(comDayCqWcmCqMsmCore, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comDayCqWcmCqMsmCore) &&
        Objects.equals(comDayCqWcmCqWcmTranslation, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.comDayCqWcmCqWcmTranslation) &&
        Objects.equals(dayCommonsJrawio, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.dayCommonsJrawio) &&
        Objects.equals(orgApacheAriesJmxWhiteboard, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.orgApacheAriesJmxWhiteboard) &&
        Objects.equals(orgApacheFelixHttpSslfilter, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.orgApacheFelixHttpSslfilter) &&
        Objects.equals(orgApacheFelixOrgApacheFelixThreaddump, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.orgApacheFelixOrgApacheFelixThreaddump) &&
        Objects.equals(orgApacheFelixWebconsolePluginsDs, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.orgApacheFelixWebconsolePluginsDs) &&
        Objects.equals(orgApacheFelixWebconsolePluginsEvent, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.orgApacheFelixWebconsolePluginsEvent) &&
        Objects.equals(orgApacheFelixWebconsolePluginsMemoryusage, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.orgApacheFelixWebconsolePluginsMemoryusage) &&
        Objects.equals(orgApacheFelixWebconsolePluginsPackageadmin, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.orgApacheFelixWebconsolePluginsPackageadmin) &&
        Objects.equals(orgApacheJackrabbitOakAuthLdap, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.orgApacheJackrabbitOakAuthLdap) &&
        Objects.equals(orgApacheJackrabbitOakSegmentTar, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.orgApacheJackrabbitOakSegmentTar) &&
        Objects.equals(orgApacheJackrabbitOakSolrOsgi, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.orgApacheJackrabbitOakSolrOsgi) &&
        Objects.equals(orgApacheSlingBundleresourceImpl, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.orgApacheSlingBundleresourceImpl) &&
        Objects.equals(orgApacheSlingCommonsFsclassloader, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.orgApacheSlingCommonsFsclassloader) &&
        Objects.equals(orgApacheSlingCommonsLogWebconsole, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.orgApacheSlingCommonsLogWebconsole) &&
        Objects.equals(orgApacheSlingDatasource, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.orgApacheSlingDatasource) &&
        Objects.equals(orgApacheSlingDiscoveryBase, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.orgApacheSlingDiscoveryBase) &&
        Objects.equals(orgApacheSlingDiscoveryOak, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.orgApacheSlingDiscoveryOak) &&
        Objects.equals(orgApacheSlingDiscoverySupport, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.orgApacheSlingDiscoverySupport) &&
        Objects.equals(orgApacheSlingDistributionApi, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.orgApacheSlingDistributionApi) &&
        Objects.equals(orgApacheSlingDistributionCore, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.orgApacheSlingDistributionCore) &&
        Objects.equals(orgApacheSlingExtensionsWebconsolesecurityprovider, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.orgApacheSlingExtensionsWebconsolesecurityprovider) &&
        Objects.equals(orgApacheSlingHcWebconsole, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.orgApacheSlingHcWebconsole) &&
        Objects.equals(orgApacheSlingInstallerConsole, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.orgApacheSlingInstallerConsole) &&
        Objects.equals(orgApacheSlingInstallerProviderFile, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.orgApacheSlingInstallerProviderFile) &&
        Objects.equals(orgApacheSlingInstallerProviderJcr, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.orgApacheSlingInstallerProviderJcr) &&
        Objects.equals(orgApacheSlingJcrDavex, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.orgApacheSlingJcrDavex) &&
        Objects.equals(orgApacheSlingJcrResourcesecurity, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.orgApacheSlingJcrResourcesecurity) &&
        Objects.equals(orgApacheSlingJmxProvider, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.orgApacheSlingJmxProvider) &&
        Objects.equals(orgApacheSlingLaunchpadInstaller, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.orgApacheSlingLaunchpadInstaller) &&
        Objects.equals(orgApacheSlingModelsImpl, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.orgApacheSlingModelsImpl) &&
        Objects.equals(orgApacheSlingRepoinitParser, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.orgApacheSlingRepoinitParser) &&
        Objects.equals(orgApacheSlingResourceInventory, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.orgApacheSlingResourceInventory) &&
        Objects.equals(orgApacheSlingResourceresolver, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.orgApacheSlingResourceresolver) &&
        Objects.equals(orgApacheSlingScriptingJavascript, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.orgApacheSlingScriptingJavascript) &&
        Objects.equals(orgApacheSlingScriptingJst, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.orgApacheSlingScriptingJst) &&
        Objects.equals(orgApacheSlingScriptingSightlyJsProvider, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.orgApacheSlingScriptingSightlyJsProvider) &&
        Objects.equals(orgApacheSlingScriptingSightlyModelsProvider, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.orgApacheSlingScriptingSightlyModelsProvider) &&
        Objects.equals(orgApacheSlingSecurity, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.orgApacheSlingSecurity) &&
        Objects.equals(orgApacheSlingServletsCompat, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.orgApacheSlingServletsCompat) &&
        Objects.equals(orgApacheSlingServletsGet, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.orgApacheSlingServletsGet) &&
        Objects.equals(orgApacheSlingStartupfilterDisabler, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.orgApacheSlingStartupfilterDisabler) &&
        Objects.equals(orgApacheSlingTracer, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.orgApacheSlingTracer) &&
        Objects.equals(weRetailClientAppCore, comAdobeGraniteApicontrollerFilterResolverHookFactoryProperties.weRetailClientAppCore);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comAdobeCqCdnCdnRewriter, comAdobeCqCloudConfigComponents, comAdobeCqCloudConfigCore, comAdobeCqCloudConfigUi, comAdobeCqComAdobeCqEditor, comAdobeCqComAdobeCqProjectsCore, comAdobeCqComAdobeCqProjectsWcmCore, comAdobeCqComAdobeCqUiCommons, comAdobeCqComAdobeCqWcmStyle, comAdobeCqCqActivitymapIntegration, comAdobeCqCqContexthubCommons, comAdobeCqCqDtm, comAdobeCqCqHealthcheck, comAdobeCqCqMultisiteTargeting, comAdobeCqCqPreUpgradeCleanup, comAdobeCqCqProductInfoProvider, comAdobeCqCqRestSites, comAdobeCqCqSecurityHc, comAdobeCqDamCqDamSvgHandler, comAdobeCqDamCqScene7Imaging, comAdobeCqDtmReactorCore, comAdobeCqDtmReactorUi, comAdobeCqExpJspelResolver, comAdobeCqInboxCqInbox, comAdobeCqJsonSchemaParser, comAdobeCqMediaCqMediaPublishingDpsFpCore, comAdobeCqMobileCqMobileCaas, comAdobeCqMobileCqMobileIndexBuilder, comAdobeCqMobileCqMobilePhonegapBuild, comAdobeCqMyspell, comAdobeCqSampleWeRetailCore, comAdobeCqScreensComAdobeCqScreensDcc, comAdobeCqScreensComAdobeCqScreensMqCore, comAdobeCqSocialCqSocialAsProvider, comAdobeCqSocialCqSocialBadgingBasicImpl, comAdobeCqSocialCqSocialBadgingImpl, comAdobeCqSocialCqSocialCalendarImpl, comAdobeCqSocialCqSocialContentFragmentsImpl, comAdobeCqSocialCqSocialEnablementImpl, comAdobeCqSocialCqSocialGraphImpl, comAdobeCqSocialCqSocialIdeationImpl, comAdobeCqSocialCqSocialJcrProvider, comAdobeCqSocialCqSocialMembersImpl, comAdobeCqSocialCqSocialMsProvider, comAdobeCqSocialCqSocialNotificationsChannelsWeb, comAdobeCqSocialCqSocialNotificationsImpl, comAdobeCqSocialCqSocialRdbProvider, comAdobeCqSocialCqSocialScfImpl, comAdobeCqSocialCqSocialScoringBasicImpl, comAdobeCqSocialCqSocialScoringImpl, comAdobeCqSocialCqSocialServiceusersImpl, comAdobeCqSocialCqSocialSrpImpl, comAdobeCqSocialCqSocialUgcbaseImpl, comAdobeDamCqDamCfmImpl, comAdobeFormsFoundationFormsFoundationBase, comAdobeGraniteApicontroller, comAdobeGraniteAssetCore, comAdobeGraniteAuthSso, comAdobeGraniteBundlesHcImpl, comAdobeGraniteCompatRouter, comAdobeGraniteConf, comAdobeGraniteConfUiCore, comAdobeGraniteCors, comAdobeGraniteCrxExplorer, comAdobeGraniteCrxdeLite, comAdobeGraniteCryptoConfig, comAdobeGraniteCryptoExtension, comAdobeGraniteCryptoFile, comAdobeGraniteCryptoJcr, comAdobeGraniteCsrf, comAdobeGraniteDistributionCore, comAdobeGraniteDropwizardMetrics, comAdobeGraniteFragsImpl, comAdobeGraniteGibson, comAdobeGraniteInfocollector, comAdobeGraniteInstallerFactoryPackages, comAdobeGraniteJettySsl, comAdobeGraniteJobsAsync, comAdobeGraniteMaintenanceOak, comAdobeGraniteMonitoringCore, comAdobeGraniteQueries, comAdobeGraniteReplicationHcImpl, comAdobeGraniteRepositoryChecker, comAdobeGraniteRepositoryHcImpl, comAdobeGraniteRestAssets, comAdobeGraniteSecurityUi, comAdobeGraniteStartup, comAdobeGraniteTagsoup, comAdobeGraniteTaskmanagementCore, comAdobeGraniteTaskmanagementWorkflow, comAdobeGraniteUiClientlibsCompilerLess, comAdobeGraniteUiClientlibsProcessorGcc, comAdobeGraniteWebconsolePlugins, comAdobeGraniteWorkflowConsole, comAdobeXmpWorkerFilesNativeFragmentLinux, comAdobeXmpWorkerFilesNativeFragmentMacosx, comAdobeXmpWorkerFilesNativeFragmentWin, comDayCommonsOsgiWrapperSimpleJndi, comDayCqCqAuthhandler, comDayCqCqCompatConfigupdate, comDayCqCqLicensebranding, comDayCqCqNotifcationImpl, comDayCqCqReplicationAudit, comDayCqCqSearchExt, comDayCqDamCqDamAnnotationPrint, comDayCqDamCqDamAssetUsage, comDayCqDamCqDamS7dam, comDayCqDamCqDamSimilaritysearch, comDayCqDamDamWebdavSupport, comDayCqPreUpgradeTasks, comDayCqReplicationExtensions, comDayCqWcmCqMsmCore, comDayCqWcmCqWcmTranslation, dayCommonsJrawio, orgApacheAriesJmxWhiteboard, orgApacheFelixHttpSslfilter, orgApacheFelixOrgApacheFelixThreaddump, orgApacheFelixWebconsolePluginsDs, orgApacheFelixWebconsolePluginsEvent, orgApacheFelixWebconsolePluginsMemoryusage, orgApacheFelixWebconsolePluginsPackageadmin, orgApacheJackrabbitOakAuthLdap, orgApacheJackrabbitOakSegmentTar, orgApacheJackrabbitOakSolrOsgi, orgApacheSlingBundleresourceImpl, orgApacheSlingCommonsFsclassloader, orgApacheSlingCommonsLogWebconsole, orgApacheSlingDatasource, orgApacheSlingDiscoveryBase, orgApacheSlingDiscoveryOak, orgApacheSlingDiscoverySupport, orgApacheSlingDistributionApi, orgApacheSlingDistributionCore, orgApacheSlingExtensionsWebconsolesecurityprovider, orgApacheSlingHcWebconsole, orgApacheSlingInstallerConsole, orgApacheSlingInstallerProviderFile, orgApacheSlingInstallerProviderJcr, orgApacheSlingJcrDavex, orgApacheSlingJcrResourcesecurity, orgApacheSlingJmxProvider, orgApacheSlingLaunchpadInstaller, orgApacheSlingModelsImpl, orgApacheSlingRepoinitParser, orgApacheSlingResourceInventory, orgApacheSlingResourceresolver, orgApacheSlingScriptingJavascript, orgApacheSlingScriptingJst, orgApacheSlingScriptingSightlyJsProvider, orgApacheSlingScriptingSightlyModelsProvider, orgApacheSlingSecurity, orgApacheSlingServletsCompat, orgApacheSlingServletsGet, orgApacheSlingStartupfilterDisabler, orgApacheSlingTracer, weRetailClientAppCore);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteApicontrollerFilterResolverHookFactoryProperties {\n");
    
    sb.append("    comAdobeCqCdnCdnRewriter: ").append(toIndentedString(comAdobeCqCdnCdnRewriter)).append("\n");
    sb.append("    comAdobeCqCloudConfigComponents: ").append(toIndentedString(comAdobeCqCloudConfigComponents)).append("\n");
    sb.append("    comAdobeCqCloudConfigCore: ").append(toIndentedString(comAdobeCqCloudConfigCore)).append("\n");
    sb.append("    comAdobeCqCloudConfigUi: ").append(toIndentedString(comAdobeCqCloudConfigUi)).append("\n");
    sb.append("    comAdobeCqComAdobeCqEditor: ").append(toIndentedString(comAdobeCqComAdobeCqEditor)).append("\n");
    sb.append("    comAdobeCqComAdobeCqProjectsCore: ").append(toIndentedString(comAdobeCqComAdobeCqProjectsCore)).append("\n");
    sb.append("    comAdobeCqComAdobeCqProjectsWcmCore: ").append(toIndentedString(comAdobeCqComAdobeCqProjectsWcmCore)).append("\n");
    sb.append("    comAdobeCqComAdobeCqUiCommons: ").append(toIndentedString(comAdobeCqComAdobeCqUiCommons)).append("\n");
    sb.append("    comAdobeCqComAdobeCqWcmStyle: ").append(toIndentedString(comAdobeCqComAdobeCqWcmStyle)).append("\n");
    sb.append("    comAdobeCqCqActivitymapIntegration: ").append(toIndentedString(comAdobeCqCqActivitymapIntegration)).append("\n");
    sb.append("    comAdobeCqCqContexthubCommons: ").append(toIndentedString(comAdobeCqCqContexthubCommons)).append("\n");
    sb.append("    comAdobeCqCqDtm: ").append(toIndentedString(comAdobeCqCqDtm)).append("\n");
    sb.append("    comAdobeCqCqHealthcheck: ").append(toIndentedString(comAdobeCqCqHealthcheck)).append("\n");
    sb.append("    comAdobeCqCqMultisiteTargeting: ").append(toIndentedString(comAdobeCqCqMultisiteTargeting)).append("\n");
    sb.append("    comAdobeCqCqPreUpgradeCleanup: ").append(toIndentedString(comAdobeCqCqPreUpgradeCleanup)).append("\n");
    sb.append("    comAdobeCqCqProductInfoProvider: ").append(toIndentedString(comAdobeCqCqProductInfoProvider)).append("\n");
    sb.append("    comAdobeCqCqRestSites: ").append(toIndentedString(comAdobeCqCqRestSites)).append("\n");
    sb.append("    comAdobeCqCqSecurityHc: ").append(toIndentedString(comAdobeCqCqSecurityHc)).append("\n");
    sb.append("    comAdobeCqDamCqDamSvgHandler: ").append(toIndentedString(comAdobeCqDamCqDamSvgHandler)).append("\n");
    sb.append("    comAdobeCqDamCqScene7Imaging: ").append(toIndentedString(comAdobeCqDamCqScene7Imaging)).append("\n");
    sb.append("    comAdobeCqDtmReactorCore: ").append(toIndentedString(comAdobeCqDtmReactorCore)).append("\n");
    sb.append("    comAdobeCqDtmReactorUi: ").append(toIndentedString(comAdobeCqDtmReactorUi)).append("\n");
    sb.append("    comAdobeCqExpJspelResolver: ").append(toIndentedString(comAdobeCqExpJspelResolver)).append("\n");
    sb.append("    comAdobeCqInboxCqInbox: ").append(toIndentedString(comAdobeCqInboxCqInbox)).append("\n");
    sb.append("    comAdobeCqJsonSchemaParser: ").append(toIndentedString(comAdobeCqJsonSchemaParser)).append("\n");
    sb.append("    comAdobeCqMediaCqMediaPublishingDpsFpCore: ").append(toIndentedString(comAdobeCqMediaCqMediaPublishingDpsFpCore)).append("\n");
    sb.append("    comAdobeCqMobileCqMobileCaas: ").append(toIndentedString(comAdobeCqMobileCqMobileCaas)).append("\n");
    sb.append("    comAdobeCqMobileCqMobileIndexBuilder: ").append(toIndentedString(comAdobeCqMobileCqMobileIndexBuilder)).append("\n");
    sb.append("    comAdobeCqMobileCqMobilePhonegapBuild: ").append(toIndentedString(comAdobeCqMobileCqMobilePhonegapBuild)).append("\n");
    sb.append("    comAdobeCqMyspell: ").append(toIndentedString(comAdobeCqMyspell)).append("\n");
    sb.append("    comAdobeCqSampleWeRetailCore: ").append(toIndentedString(comAdobeCqSampleWeRetailCore)).append("\n");
    sb.append("    comAdobeCqScreensComAdobeCqScreensDcc: ").append(toIndentedString(comAdobeCqScreensComAdobeCqScreensDcc)).append("\n");
    sb.append("    comAdobeCqScreensComAdobeCqScreensMqCore: ").append(toIndentedString(comAdobeCqScreensComAdobeCqScreensMqCore)).append("\n");
    sb.append("    comAdobeCqSocialCqSocialAsProvider: ").append(toIndentedString(comAdobeCqSocialCqSocialAsProvider)).append("\n");
    sb.append("    comAdobeCqSocialCqSocialBadgingBasicImpl: ").append(toIndentedString(comAdobeCqSocialCqSocialBadgingBasicImpl)).append("\n");
    sb.append("    comAdobeCqSocialCqSocialBadgingImpl: ").append(toIndentedString(comAdobeCqSocialCqSocialBadgingImpl)).append("\n");
    sb.append("    comAdobeCqSocialCqSocialCalendarImpl: ").append(toIndentedString(comAdobeCqSocialCqSocialCalendarImpl)).append("\n");
    sb.append("    comAdobeCqSocialCqSocialContentFragmentsImpl: ").append(toIndentedString(comAdobeCqSocialCqSocialContentFragmentsImpl)).append("\n");
    sb.append("    comAdobeCqSocialCqSocialEnablementImpl: ").append(toIndentedString(comAdobeCqSocialCqSocialEnablementImpl)).append("\n");
    sb.append("    comAdobeCqSocialCqSocialGraphImpl: ").append(toIndentedString(comAdobeCqSocialCqSocialGraphImpl)).append("\n");
    sb.append("    comAdobeCqSocialCqSocialIdeationImpl: ").append(toIndentedString(comAdobeCqSocialCqSocialIdeationImpl)).append("\n");
    sb.append("    comAdobeCqSocialCqSocialJcrProvider: ").append(toIndentedString(comAdobeCqSocialCqSocialJcrProvider)).append("\n");
    sb.append("    comAdobeCqSocialCqSocialMembersImpl: ").append(toIndentedString(comAdobeCqSocialCqSocialMembersImpl)).append("\n");
    sb.append("    comAdobeCqSocialCqSocialMsProvider: ").append(toIndentedString(comAdobeCqSocialCqSocialMsProvider)).append("\n");
    sb.append("    comAdobeCqSocialCqSocialNotificationsChannelsWeb: ").append(toIndentedString(comAdobeCqSocialCqSocialNotificationsChannelsWeb)).append("\n");
    sb.append("    comAdobeCqSocialCqSocialNotificationsImpl: ").append(toIndentedString(comAdobeCqSocialCqSocialNotificationsImpl)).append("\n");
    sb.append("    comAdobeCqSocialCqSocialRdbProvider: ").append(toIndentedString(comAdobeCqSocialCqSocialRdbProvider)).append("\n");
    sb.append("    comAdobeCqSocialCqSocialScfImpl: ").append(toIndentedString(comAdobeCqSocialCqSocialScfImpl)).append("\n");
    sb.append("    comAdobeCqSocialCqSocialScoringBasicImpl: ").append(toIndentedString(comAdobeCqSocialCqSocialScoringBasicImpl)).append("\n");
    sb.append("    comAdobeCqSocialCqSocialScoringImpl: ").append(toIndentedString(comAdobeCqSocialCqSocialScoringImpl)).append("\n");
    sb.append("    comAdobeCqSocialCqSocialServiceusersImpl: ").append(toIndentedString(comAdobeCqSocialCqSocialServiceusersImpl)).append("\n");
    sb.append("    comAdobeCqSocialCqSocialSrpImpl: ").append(toIndentedString(comAdobeCqSocialCqSocialSrpImpl)).append("\n");
    sb.append("    comAdobeCqSocialCqSocialUgcbaseImpl: ").append(toIndentedString(comAdobeCqSocialCqSocialUgcbaseImpl)).append("\n");
    sb.append("    comAdobeDamCqDamCfmImpl: ").append(toIndentedString(comAdobeDamCqDamCfmImpl)).append("\n");
    sb.append("    comAdobeFormsFoundationFormsFoundationBase: ").append(toIndentedString(comAdobeFormsFoundationFormsFoundationBase)).append("\n");
    sb.append("    comAdobeGraniteApicontroller: ").append(toIndentedString(comAdobeGraniteApicontroller)).append("\n");
    sb.append("    comAdobeGraniteAssetCore: ").append(toIndentedString(comAdobeGraniteAssetCore)).append("\n");
    sb.append("    comAdobeGraniteAuthSso: ").append(toIndentedString(comAdobeGraniteAuthSso)).append("\n");
    sb.append("    comAdobeGraniteBundlesHcImpl: ").append(toIndentedString(comAdobeGraniteBundlesHcImpl)).append("\n");
    sb.append("    comAdobeGraniteCompatRouter: ").append(toIndentedString(comAdobeGraniteCompatRouter)).append("\n");
    sb.append("    comAdobeGraniteConf: ").append(toIndentedString(comAdobeGraniteConf)).append("\n");
    sb.append("    comAdobeGraniteConfUiCore: ").append(toIndentedString(comAdobeGraniteConfUiCore)).append("\n");
    sb.append("    comAdobeGraniteCors: ").append(toIndentedString(comAdobeGraniteCors)).append("\n");
    sb.append("    comAdobeGraniteCrxExplorer: ").append(toIndentedString(comAdobeGraniteCrxExplorer)).append("\n");
    sb.append("    comAdobeGraniteCrxdeLite: ").append(toIndentedString(comAdobeGraniteCrxdeLite)).append("\n");
    sb.append("    comAdobeGraniteCryptoConfig: ").append(toIndentedString(comAdobeGraniteCryptoConfig)).append("\n");
    sb.append("    comAdobeGraniteCryptoExtension: ").append(toIndentedString(comAdobeGraniteCryptoExtension)).append("\n");
    sb.append("    comAdobeGraniteCryptoFile: ").append(toIndentedString(comAdobeGraniteCryptoFile)).append("\n");
    sb.append("    comAdobeGraniteCryptoJcr: ").append(toIndentedString(comAdobeGraniteCryptoJcr)).append("\n");
    sb.append("    comAdobeGraniteCsrf: ").append(toIndentedString(comAdobeGraniteCsrf)).append("\n");
    sb.append("    comAdobeGraniteDistributionCore: ").append(toIndentedString(comAdobeGraniteDistributionCore)).append("\n");
    sb.append("    comAdobeGraniteDropwizardMetrics: ").append(toIndentedString(comAdobeGraniteDropwizardMetrics)).append("\n");
    sb.append("    comAdobeGraniteFragsImpl: ").append(toIndentedString(comAdobeGraniteFragsImpl)).append("\n");
    sb.append("    comAdobeGraniteGibson: ").append(toIndentedString(comAdobeGraniteGibson)).append("\n");
    sb.append("    comAdobeGraniteInfocollector: ").append(toIndentedString(comAdobeGraniteInfocollector)).append("\n");
    sb.append("    comAdobeGraniteInstallerFactoryPackages: ").append(toIndentedString(comAdobeGraniteInstallerFactoryPackages)).append("\n");
    sb.append("    comAdobeGraniteJettySsl: ").append(toIndentedString(comAdobeGraniteJettySsl)).append("\n");
    sb.append("    comAdobeGraniteJobsAsync: ").append(toIndentedString(comAdobeGraniteJobsAsync)).append("\n");
    sb.append("    comAdobeGraniteMaintenanceOak: ").append(toIndentedString(comAdobeGraniteMaintenanceOak)).append("\n");
    sb.append("    comAdobeGraniteMonitoringCore: ").append(toIndentedString(comAdobeGraniteMonitoringCore)).append("\n");
    sb.append("    comAdobeGraniteQueries: ").append(toIndentedString(comAdobeGraniteQueries)).append("\n");
    sb.append("    comAdobeGraniteReplicationHcImpl: ").append(toIndentedString(comAdobeGraniteReplicationHcImpl)).append("\n");
    sb.append("    comAdobeGraniteRepositoryChecker: ").append(toIndentedString(comAdobeGraniteRepositoryChecker)).append("\n");
    sb.append("    comAdobeGraniteRepositoryHcImpl: ").append(toIndentedString(comAdobeGraniteRepositoryHcImpl)).append("\n");
    sb.append("    comAdobeGraniteRestAssets: ").append(toIndentedString(comAdobeGraniteRestAssets)).append("\n");
    sb.append("    comAdobeGraniteSecurityUi: ").append(toIndentedString(comAdobeGraniteSecurityUi)).append("\n");
    sb.append("    comAdobeGraniteStartup: ").append(toIndentedString(comAdobeGraniteStartup)).append("\n");
    sb.append("    comAdobeGraniteTagsoup: ").append(toIndentedString(comAdobeGraniteTagsoup)).append("\n");
    sb.append("    comAdobeGraniteTaskmanagementCore: ").append(toIndentedString(comAdobeGraniteTaskmanagementCore)).append("\n");
    sb.append("    comAdobeGraniteTaskmanagementWorkflow: ").append(toIndentedString(comAdobeGraniteTaskmanagementWorkflow)).append("\n");
    sb.append("    comAdobeGraniteUiClientlibsCompilerLess: ").append(toIndentedString(comAdobeGraniteUiClientlibsCompilerLess)).append("\n");
    sb.append("    comAdobeGraniteUiClientlibsProcessorGcc: ").append(toIndentedString(comAdobeGraniteUiClientlibsProcessorGcc)).append("\n");
    sb.append("    comAdobeGraniteWebconsolePlugins: ").append(toIndentedString(comAdobeGraniteWebconsolePlugins)).append("\n");
    sb.append("    comAdobeGraniteWorkflowConsole: ").append(toIndentedString(comAdobeGraniteWorkflowConsole)).append("\n");
    sb.append("    comAdobeXmpWorkerFilesNativeFragmentLinux: ").append(toIndentedString(comAdobeXmpWorkerFilesNativeFragmentLinux)).append("\n");
    sb.append("    comAdobeXmpWorkerFilesNativeFragmentMacosx: ").append(toIndentedString(comAdobeXmpWorkerFilesNativeFragmentMacosx)).append("\n");
    sb.append("    comAdobeXmpWorkerFilesNativeFragmentWin: ").append(toIndentedString(comAdobeXmpWorkerFilesNativeFragmentWin)).append("\n");
    sb.append("    comDayCommonsOsgiWrapperSimpleJndi: ").append(toIndentedString(comDayCommonsOsgiWrapperSimpleJndi)).append("\n");
    sb.append("    comDayCqCqAuthhandler: ").append(toIndentedString(comDayCqCqAuthhandler)).append("\n");
    sb.append("    comDayCqCqCompatConfigupdate: ").append(toIndentedString(comDayCqCqCompatConfigupdate)).append("\n");
    sb.append("    comDayCqCqLicensebranding: ").append(toIndentedString(comDayCqCqLicensebranding)).append("\n");
    sb.append("    comDayCqCqNotifcationImpl: ").append(toIndentedString(comDayCqCqNotifcationImpl)).append("\n");
    sb.append("    comDayCqCqReplicationAudit: ").append(toIndentedString(comDayCqCqReplicationAudit)).append("\n");
    sb.append("    comDayCqCqSearchExt: ").append(toIndentedString(comDayCqCqSearchExt)).append("\n");
    sb.append("    comDayCqDamCqDamAnnotationPrint: ").append(toIndentedString(comDayCqDamCqDamAnnotationPrint)).append("\n");
    sb.append("    comDayCqDamCqDamAssetUsage: ").append(toIndentedString(comDayCqDamCqDamAssetUsage)).append("\n");
    sb.append("    comDayCqDamCqDamS7dam: ").append(toIndentedString(comDayCqDamCqDamS7dam)).append("\n");
    sb.append("    comDayCqDamCqDamSimilaritysearch: ").append(toIndentedString(comDayCqDamCqDamSimilaritysearch)).append("\n");
    sb.append("    comDayCqDamDamWebdavSupport: ").append(toIndentedString(comDayCqDamDamWebdavSupport)).append("\n");
    sb.append("    comDayCqPreUpgradeTasks: ").append(toIndentedString(comDayCqPreUpgradeTasks)).append("\n");
    sb.append("    comDayCqReplicationExtensions: ").append(toIndentedString(comDayCqReplicationExtensions)).append("\n");
    sb.append("    comDayCqWcmCqMsmCore: ").append(toIndentedString(comDayCqWcmCqMsmCore)).append("\n");
    sb.append("    comDayCqWcmCqWcmTranslation: ").append(toIndentedString(comDayCqWcmCqWcmTranslation)).append("\n");
    sb.append("    dayCommonsJrawio: ").append(toIndentedString(dayCommonsJrawio)).append("\n");
    sb.append("    orgApacheAriesJmxWhiteboard: ").append(toIndentedString(orgApacheAriesJmxWhiteboard)).append("\n");
    sb.append("    orgApacheFelixHttpSslfilter: ").append(toIndentedString(orgApacheFelixHttpSslfilter)).append("\n");
    sb.append("    orgApacheFelixOrgApacheFelixThreaddump: ").append(toIndentedString(orgApacheFelixOrgApacheFelixThreaddump)).append("\n");
    sb.append("    orgApacheFelixWebconsolePluginsDs: ").append(toIndentedString(orgApacheFelixWebconsolePluginsDs)).append("\n");
    sb.append("    orgApacheFelixWebconsolePluginsEvent: ").append(toIndentedString(orgApacheFelixWebconsolePluginsEvent)).append("\n");
    sb.append("    orgApacheFelixWebconsolePluginsMemoryusage: ").append(toIndentedString(orgApacheFelixWebconsolePluginsMemoryusage)).append("\n");
    sb.append("    orgApacheFelixWebconsolePluginsPackageadmin: ").append(toIndentedString(orgApacheFelixWebconsolePluginsPackageadmin)).append("\n");
    sb.append("    orgApacheJackrabbitOakAuthLdap: ").append(toIndentedString(orgApacheJackrabbitOakAuthLdap)).append("\n");
    sb.append("    orgApacheJackrabbitOakSegmentTar: ").append(toIndentedString(orgApacheJackrabbitOakSegmentTar)).append("\n");
    sb.append("    orgApacheJackrabbitOakSolrOsgi: ").append(toIndentedString(orgApacheJackrabbitOakSolrOsgi)).append("\n");
    sb.append("    orgApacheSlingBundleresourceImpl: ").append(toIndentedString(orgApacheSlingBundleresourceImpl)).append("\n");
    sb.append("    orgApacheSlingCommonsFsclassloader: ").append(toIndentedString(orgApacheSlingCommonsFsclassloader)).append("\n");
    sb.append("    orgApacheSlingCommonsLogWebconsole: ").append(toIndentedString(orgApacheSlingCommonsLogWebconsole)).append("\n");
    sb.append("    orgApacheSlingDatasource: ").append(toIndentedString(orgApacheSlingDatasource)).append("\n");
    sb.append("    orgApacheSlingDiscoveryBase: ").append(toIndentedString(orgApacheSlingDiscoveryBase)).append("\n");
    sb.append("    orgApacheSlingDiscoveryOak: ").append(toIndentedString(orgApacheSlingDiscoveryOak)).append("\n");
    sb.append("    orgApacheSlingDiscoverySupport: ").append(toIndentedString(orgApacheSlingDiscoverySupport)).append("\n");
    sb.append("    orgApacheSlingDistributionApi: ").append(toIndentedString(orgApacheSlingDistributionApi)).append("\n");
    sb.append("    orgApacheSlingDistributionCore: ").append(toIndentedString(orgApacheSlingDistributionCore)).append("\n");
    sb.append("    orgApacheSlingExtensionsWebconsolesecurityprovider: ").append(toIndentedString(orgApacheSlingExtensionsWebconsolesecurityprovider)).append("\n");
    sb.append("    orgApacheSlingHcWebconsole: ").append(toIndentedString(orgApacheSlingHcWebconsole)).append("\n");
    sb.append("    orgApacheSlingInstallerConsole: ").append(toIndentedString(orgApacheSlingInstallerConsole)).append("\n");
    sb.append("    orgApacheSlingInstallerProviderFile: ").append(toIndentedString(orgApacheSlingInstallerProviderFile)).append("\n");
    sb.append("    orgApacheSlingInstallerProviderJcr: ").append(toIndentedString(orgApacheSlingInstallerProviderJcr)).append("\n");
    sb.append("    orgApacheSlingJcrDavex: ").append(toIndentedString(orgApacheSlingJcrDavex)).append("\n");
    sb.append("    orgApacheSlingJcrResourcesecurity: ").append(toIndentedString(orgApacheSlingJcrResourcesecurity)).append("\n");
    sb.append("    orgApacheSlingJmxProvider: ").append(toIndentedString(orgApacheSlingJmxProvider)).append("\n");
    sb.append("    orgApacheSlingLaunchpadInstaller: ").append(toIndentedString(orgApacheSlingLaunchpadInstaller)).append("\n");
    sb.append("    orgApacheSlingModelsImpl: ").append(toIndentedString(orgApacheSlingModelsImpl)).append("\n");
    sb.append("    orgApacheSlingRepoinitParser: ").append(toIndentedString(orgApacheSlingRepoinitParser)).append("\n");
    sb.append("    orgApacheSlingResourceInventory: ").append(toIndentedString(orgApacheSlingResourceInventory)).append("\n");
    sb.append("    orgApacheSlingResourceresolver: ").append(toIndentedString(orgApacheSlingResourceresolver)).append("\n");
    sb.append("    orgApacheSlingScriptingJavascript: ").append(toIndentedString(orgApacheSlingScriptingJavascript)).append("\n");
    sb.append("    orgApacheSlingScriptingJst: ").append(toIndentedString(orgApacheSlingScriptingJst)).append("\n");
    sb.append("    orgApacheSlingScriptingSightlyJsProvider: ").append(toIndentedString(orgApacheSlingScriptingSightlyJsProvider)).append("\n");
    sb.append("    orgApacheSlingScriptingSightlyModelsProvider: ").append(toIndentedString(orgApacheSlingScriptingSightlyModelsProvider)).append("\n");
    sb.append("    orgApacheSlingSecurity: ").append(toIndentedString(orgApacheSlingSecurity)).append("\n");
    sb.append("    orgApacheSlingServletsCompat: ").append(toIndentedString(orgApacheSlingServletsCompat)).append("\n");
    sb.append("    orgApacheSlingServletsGet: ").append(toIndentedString(orgApacheSlingServletsGet)).append("\n");
    sb.append("    orgApacheSlingStartupfilterDisabler: ").append(toIndentedString(orgApacheSlingStartupfilterDisabler)).append("\n");
    sb.append("    orgApacheSlingTracer: ").append(toIndentedString(orgApacheSlingTracer)).append("\n");
    sb.append("    weRetailClientAppCore: ").append(toIndentedString(weRetailClientAppCore)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
